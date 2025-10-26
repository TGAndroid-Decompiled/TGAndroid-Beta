package org.telegram.ui.bots;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;

public abstract class BotKeyboardView extends LinearLayout {
    private TLRPC.TL_replyKeyboardMarkup botButtons;
    private int buttonHeight;
    private final ArrayList buttonIcons;
    private final ArrayList buttonViews;
    private final LinearLayout container;
    private BotKeyboardViewDelegate delegate;
    private boolean isFullSize;
    private int panelHeight;
    private final Theme.ResourcesProvider resourcesProvider;
    private final ScrollView scrollView;

    public interface BotKeyboardViewDelegate {
        void didPressedButton(TLRPC.KeyboardButton keyboardButton);
    }

    public BotKeyboardView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.buttonViews = new ArrayList();
        this.buttonIcons = new ArrayList();
        this.resourcesProvider = resourcesProvider;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.scrollView = scrollView;
        addView(scrollView);
        LinearLayout linearLayout = new LinearLayout(context);
        this.container = linearLayout;
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        updateColors();
    }

    public void updateColors() {
        AndroidUtilities.setScrollViewEdgeEffectColor(this.scrollView, getThemedColor(Theme.key_chat_emojiPanelBackground));
        for (int i = 0; i < this.buttonViews.size(); i++) {
            TextView textView = (TextView) this.buttonViews.get(i);
            int i2 = Theme.key_chat_botKeyboardButtonText;
            textView.setTextColor(getThemedColor(i2));
            ((TextView) this.buttonViews.get(i)).setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(4.0f), getThemedColor(Theme.key_chat_botKeyboardButtonBackground), getThemedColor(Theme.key_chat_botKeyboardButtonBackgroundPressed)));
            ((ImageView) this.buttonIcons.get(i)).setColorFilter(getThemedColor(i2));
        }
        invalidate();
    }

    public void setDelegate(BotKeyboardViewDelegate botKeyboardViewDelegate) {
        this.delegate = botKeyboardViewDelegate;
    }

    public void setPanelHeight(int i) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        this.panelHeight = i;
        if (!this.isFullSize || (tL_replyKeyboardMarkup = this.botButtons) == null || tL_replyKeyboardMarkup.rows.isEmpty()) {
            return;
        }
        this.buttonHeight = !this.isFullSize ? 42 : (int) Math.max(42.0f, (((this.panelHeight - AndroidUtilities.dp(20.0f)) - ((this.botButtons.rows.size() - 1) * AndroidUtilities.dp(4.0f))) / this.botButtons.rows.size()) / AndroidUtilities.density);
        int childCount = this.container.getChildCount();
        int dp = AndroidUtilities.dp(this.buttonHeight);
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.container.getChildAt(i2);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (layoutParams.height != dp) {
                layoutParams.height = dp;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public void invalidateViews() {
        for (int i = 0; i < this.buttonViews.size(); i++) {
            ((TextView) this.buttonViews.get(i)).invalidate();
            ((ImageView) this.buttonIcons.get(i)).invalidate();
        }
    }

    public boolean isFullSize() {
        return this.isFullSize;
    }

    public void setButtons(TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup) {
        this.botButtons = tL_replyKeyboardMarkup;
        this.container.removeAllViews();
        this.buttonViews.clear();
        this.buttonIcons.clear();
        int i = 0;
        this.scrollView.scrollTo(0, 0);
        if (tL_replyKeyboardMarkup == null || this.botButtons.rows.isEmpty()) {
            return;
        }
        boolean z = tL_replyKeyboardMarkup.resize;
        this.isFullSize = !z;
        int i2 = 1;
        this.buttonHeight = z ? 42 : (int) Math.max(42.0f, (((this.panelHeight - AndroidUtilities.dp(20.0f)) - ((this.botButtons.rows.size() - 1) * AndroidUtilities.dp(4.0f))) / this.botButtons.rows.size()) / AndroidUtilities.density);
        int i3 = 0;
        while (i3 < tL_replyKeyboardMarkup.rows.size()) {
            TLRPC.TL_keyboardButtonRow tL_keyboardButtonRow = tL_replyKeyboardMarkup.rows.get(i3);
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(i);
            this.container.addView(linearLayout, LayoutHelper.createLinear(-1, this.buttonHeight, 10.0f, i3 == 0 ? 10.0f : 4.0f, 10.0f, i3 == tL_replyKeyboardMarkup.rows.size() - i2 ? 10.0f : 0.0f));
            float size = 1.0f / tL_keyboardButtonRow.buttons.size();
            int i4 = 0;
            while (i4 < tL_keyboardButtonRow.buttons.size()) {
                TLRPC.KeyboardButton keyboardButton = tL_keyboardButtonRow.buttons.get(i4);
                Button button = new Button(getContext(), keyboardButton);
                button.setBackground(i4 == 0, i3 == 0, i4 == tL_keyboardButtonRow.buttons.size() - i2, i3 == tL_replyKeyboardMarkup.rows.size() - i2);
                FrameLayout frameLayout = new FrameLayout(getContext());
                frameLayout.addView(button, LayoutHelper.createFrame(-1, -1.0f));
                linearLayout.addView(frameLayout, LayoutHelper.createLinear(0, -1, size, 0, 0, i4 != tL_keyboardButtonRow.buttons.size() - i2 ? 4 : 0, 0));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        BotKeyboardView.this.lambda$setButtons$0(view);
                    }
                });
                ScaleStateListAnimator.apply(button, 0.02f, 1.5f);
                this.buttonViews.add(button);
                ImageView imageView = new ImageView(getContext());
                imageView.setColorFilter(getThemedColor(Theme.key_chat_botKeyboardButtonText));
                if ((keyboardButton instanceof TLRPC.TL_keyboardButtonWebView) || (keyboardButton instanceof TLRPC.TL_keyboardButtonSimpleWebView)) {
                    imageView.setImageResource(R.drawable.bot_webview);
                    i = 0;
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    i = 0;
                }
                this.buttonIcons.add(imageView);
                frameLayout.addView(imageView, LayoutHelper.createFrame(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
                i4++;
                i2 = 1;
            }
            i3++;
            i2 = 1;
        }
    }

    public void lambda$setButtons$0(View view) {
        this.delegate.didPressedButton((TLRPC.KeyboardButton) view.getTag());
    }

    public class Button extends TextView {
        public Button(Context context, TLRPC.KeyboardButton keyboardButton) {
            super(context);
            setTag(keyboardButton);
            setTextColor(BotKeyboardView.this.getThemedColor(Theme.key_chat_botKeyboardButtonText));
            setTextSize(1, 16.0f);
            setGravity(17);
            setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            setText(Emoji.replaceEmoji(keyboardButton.text, getPaint().getFontMetricsInt(), false));
        }

        public void setBackground(boolean z, boolean z2, boolean z3, boolean z4) {
            int dp = AndroidUtilities.dp(19.0f);
            int dp2 = AndroidUtilities.dp(4.0f);
            int i = (z && z2) ? dp : dp2;
            int i2 = (z3 && z2) ? dp : dp2;
            int i3 = (z3 && z4) ? dp : dp2;
            int i4 = (z && z4) ? dp : dp2;
            int themedColor = BotKeyboardView.this.getThemedColor(Theme.key_chat_botKeyboardButtonBackground);
            BotKeyboardView botKeyboardView = BotKeyboardView.this;
            int i5 = Theme.key_chat_botKeyboardButtonBackgroundPressed;
            setBackground(Theme.createSimpleSelectorRoundRectDrawable(i, i2, i3, i4, themedColor, botKeyboardView.getThemedColor(i5), BotKeyboardView.this.getThemedColor(i5)));
        }
    }

    public int getKeyboardHeight() {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.botButtons;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        return this.isFullSize ? this.panelHeight : (tL_replyKeyboardMarkup.rows.size() * AndroidUtilities.dp(this.buttonHeight)) + AndroidUtilities.dp(20.0f) + ((this.botButtons.rows.size() - 1) * AndroidUtilities.dp(4.0f));
    }

    public int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }
}

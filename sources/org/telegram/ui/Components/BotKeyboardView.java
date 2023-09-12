package org.telegram.ui.Components;

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
import org.telegram.tgnet.TLRPC$KeyboardButton;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonRow;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonSimpleWebView;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonWebView;
import org.telegram.tgnet.TLRPC$TL_replyKeyboardMarkup;
import org.telegram.ui.ActionBar.Theme;
public class BotKeyboardView extends LinearLayout {
    private TLRPC$TL_replyKeyboardMarkup botButtons;
    private int buttonHeight;
    private ArrayList<ImageView> buttonIcons;
    private ArrayList<TextView> buttonViews;
    private LinearLayout container;
    private BotKeyboardViewDelegate delegate;
    private boolean isFullSize;
    private int panelHeight;
    private final Theme.ResourcesProvider resourcesProvider;
    private ScrollView scrollView;

    public interface BotKeyboardViewDelegate {
        void didPressedButton(TLRPC$KeyboardButton tLRPC$KeyboardButton);
    }

    public BotKeyboardView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.buttonViews = new ArrayList<>();
        this.buttonIcons = new ArrayList<>();
        this.resourcesProvider = resourcesProvider;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.scrollView = scrollView;
        addView(scrollView);
        LinearLayout linearLayout = new LinearLayout(context);
        this.container = linearLayout;
        linearLayout.setOrientation(1);
        this.scrollView.addView(this.container);
        updateColors();
    }

    public void updateColors() {
        ScrollView scrollView = this.scrollView;
        int i = Theme.key_chat_emojiPanelBackground;
        AndroidUtilities.setScrollViewEdgeEffectColor(scrollView, getThemedColor(i));
        setBackgroundColor(getThemedColor(i));
        for (int i2 = 0; i2 < this.buttonViews.size(); i2++) {
            int i3 = Theme.key_chat_botKeyboardButtonText;
            this.buttonViews.get(i2).setTextColor(getThemedColor(i3));
            this.buttonViews.get(i2).setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(4.0f), getThemedColor(Theme.key_chat_botKeyboardButtonBackground), getThemedColor(Theme.key_chat_botKeyboardButtonBackgroundPressed)));
            this.buttonIcons.get(i2).setColorFilter(getThemedColor(i3));
        }
        invalidate();
    }

    public void setDelegate(BotKeyboardViewDelegate botKeyboardViewDelegate) {
        this.delegate = botKeyboardViewDelegate;
    }

    public void setPanelHeight(int i) {
        TLRPC$TL_replyKeyboardMarkup tLRPC$TL_replyKeyboardMarkup;
        this.panelHeight = i;
        if (!this.isFullSize || (tLRPC$TL_replyKeyboardMarkup = this.botButtons) == null || tLRPC$TL_replyKeyboardMarkup.rows.size() == 0) {
            return;
        }
        this.buttonHeight = !this.isFullSize ? 42 : (int) Math.max(42.0f, (((this.panelHeight - AndroidUtilities.dp(30.0f)) - ((this.botButtons.rows.size() - 1) * AndroidUtilities.dp(10.0f))) / this.botButtons.rows.size()) / AndroidUtilities.density);
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
            this.buttonViews.get(i).invalidate();
            this.buttonIcons.get(i).invalidate();
        }
    }

    public boolean isFullSize() {
        return this.isFullSize;
    }

    public void setButtons(TLRPC$TL_replyKeyboardMarkup tLRPC$TL_replyKeyboardMarkup) {
        TLRPC$TL_replyKeyboardMarkup tLRPC$TL_replyKeyboardMarkup2 = tLRPC$TL_replyKeyboardMarkup;
        this.botButtons = tLRPC$TL_replyKeyboardMarkup2;
        this.container.removeAllViews();
        this.buttonViews.clear();
        this.buttonIcons.clear();
        int i = 0;
        this.scrollView.scrollTo(0, 0);
        if (tLRPC$TL_replyKeyboardMarkup2 == null || this.botButtons.rows.size() == 0) {
            return;
        }
        boolean z = !tLRPC$TL_replyKeyboardMarkup2.resize;
        this.isFullSize = z;
        this.buttonHeight = !z ? 42 : (int) Math.max(42.0f, (((this.panelHeight - AndroidUtilities.dp(30.0f)) - ((this.botButtons.rows.size() - 1) * AndroidUtilities.dp(10.0f))) / this.botButtons.rows.size()) / AndroidUtilities.density);
        int i2 = 0;
        while (i2 < tLRPC$TL_replyKeyboardMarkup2.rows.size()) {
            TLRPC$TL_keyboardButtonRow tLRPC$TL_keyboardButtonRow = tLRPC$TL_replyKeyboardMarkup2.rows.get(i2);
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(i);
            this.container.addView(linearLayout, LayoutHelper.createLinear(-1, this.buttonHeight, 15.0f, i2 == 0 ? 15.0f : 10.0f, 15.0f, i2 == tLRPC$TL_replyKeyboardMarkup2.rows.size() + (-1) ? 15.0f : 0.0f));
            float size = 1.0f / tLRPC$TL_keyboardButtonRow.buttons.size();
            int i3 = 0;
            while (i3 < tLRPC$TL_keyboardButtonRow.buttons.size()) {
                TLRPC$KeyboardButton tLRPC$KeyboardButton = tLRPC$TL_keyboardButtonRow.buttons.get(i3);
                Button button = new Button(this, getContext(), tLRPC$KeyboardButton);
                FrameLayout frameLayout = new FrameLayout(getContext());
                frameLayout.addView(button, LayoutHelper.createFrame(-1, -1.0f));
                linearLayout.addView(frameLayout, LayoutHelper.createLinear(0, -1, size, 0, 0, i3 != tLRPC$TL_keyboardButtonRow.buttons.size() + (-1) ? 10 : 0, 0));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        BotKeyboardView.this.lambda$setButtons$0(view);
                    }
                });
                this.buttonViews.add(button);
                ImageView imageView = new ImageView(getContext());
                imageView.setColorFilter(getThemedColor(Theme.key_chat_botKeyboardButtonText));
                if ((tLRPC$KeyboardButton instanceof TLRPC$TL_keyboardButtonWebView) || (tLRPC$KeyboardButton instanceof TLRPC$TL_keyboardButtonSimpleWebView)) {
                    imageView.setImageResource(R.drawable.bot_webview);
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
                this.buttonIcons.add(imageView);
                frameLayout.addView(imageView, LayoutHelper.createFrame(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
                i3++;
            }
            i2++;
            tLRPC$TL_replyKeyboardMarkup2 = tLRPC$TL_replyKeyboardMarkup;
            i = 0;
        }
    }

    public void lambda$setButtons$0(View view) {
        this.delegate.didPressedButton((TLRPC$KeyboardButton) view.getTag());
    }

    private class Button extends TextView {
        public Button(BotKeyboardView botKeyboardView, Context context, TLRPC$KeyboardButton tLRPC$KeyboardButton) {
            super(context);
            setTag(tLRPC$KeyboardButton);
            setTextColor(botKeyboardView.getThemedColor(Theme.key_chat_botKeyboardButtonText));
            setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(4.0f), botKeyboardView.getThemedColor(Theme.key_chat_botKeyboardButtonBackground), botKeyboardView.getThemedColor(Theme.key_chat_botKeyboardButtonBackgroundPressed)));
            setTextSize(1, 16.0f);
            setGravity(17);
            setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            setText(Emoji.replaceEmoji(tLRPC$KeyboardButton.text, getPaint().getFontMetricsInt(), false));
        }
    }

    public int getKeyboardHeight() {
        TLRPC$TL_replyKeyboardMarkup tLRPC$TL_replyKeyboardMarkup = this.botButtons;
        if (tLRPC$TL_replyKeyboardMarkup == null) {
            return 0;
        }
        return this.isFullSize ? this.panelHeight : (tLRPC$TL_replyKeyboardMarkup.rows.size() * AndroidUtilities.dp(this.buttonHeight)) + AndroidUtilities.dp(30.0f) + ((this.botButtons.rows.size() - 1) * AndroidUtilities.dp(10.0f));
    }

    public int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }
}

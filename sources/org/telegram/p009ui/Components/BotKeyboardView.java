package org.telegram.p009ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0890R;
import org.telegram.messenger.Emoji;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.tgnet.TLRPC$KeyboardButton;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonRow;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonSimpleWebView;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonWebView;
import org.telegram.tgnet.TLRPC$TL_replyKeyboardMarkup;

public class BotKeyboardView extends LinearLayout {
    private TLRPC$TL_replyKeyboardMarkup botButtons;
    private int buttonHeight;
    private LinearLayout container;
    private BotKeyboardViewDelegate delegate;
    private boolean isFullSize;
    private int panelHeight;
    private final Theme.ResourcesProvider resourcesProvider;
    private ScrollView scrollView;
    private ArrayList<TextView> buttonViews = new ArrayList<>();
    private ArrayList<ImageView> buttonIcons = new ArrayList<>();

    public interface BotKeyboardViewDelegate {
        void didPressedButton(TLRPC$KeyboardButton tLRPC$KeyboardButton);
    }

    public BotKeyboardView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
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
        AndroidUtilities.setScrollViewEdgeEffectColor(this.scrollView, getThemedColor("chat_emojiPanelBackground"));
        setBackgroundColor(getThemedColor("chat_emojiPanelBackground"));
        for (int i = 0; i < this.buttonViews.size(); i++) {
            this.buttonViews.get(i).setTextColor(getThemedColor("chat_botKeyboardButtonText"));
            this.buttonViews.get(i).setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.m34dp(4.0f), getThemedColor("chat_botKeyboardButtonBackground"), getThemedColor("chat_botKeyboardButtonBackgroundPressed")));
            this.buttonIcons.get(i).setColorFilter(getThemedColor("chat_botKeyboardButtonText"));
        }
        invalidate();
    }

    public void setDelegate(BotKeyboardViewDelegate botKeyboardViewDelegate) {
        this.delegate = botKeyboardViewDelegate;
    }

    public void setPanelHeight(int i) {
        TLRPC$TL_replyKeyboardMarkup tLRPC$TL_replyKeyboardMarkup;
        this.panelHeight = i;
        if (!(!this.isFullSize || (tLRPC$TL_replyKeyboardMarkup = this.botButtons) == null || tLRPC$TL_replyKeyboardMarkup.rows.size() == 0)) {
            this.buttonHeight = !this.isFullSize ? 42 : (int) Math.max(42.0f, (((this.panelHeight - AndroidUtilities.m34dp(30.0f)) - ((this.botButtons.rows.size() - 1) * AndroidUtilities.m34dp(10.0f))) / this.botButtons.rows.size()) / AndroidUtilities.density);
            int childCount = this.container.getChildCount();
            int dp = AndroidUtilities.m34dp(this.buttonHeight);
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.container.getChildAt(i2);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.height != dp) {
                    layoutParams.height = dp;
                    childAt.setLayoutParams(layoutParams);
                }
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
        this.botButtons = tLRPC$TL_replyKeyboardMarkup;
        this.container.removeAllViews();
        this.buttonViews.clear();
        this.buttonIcons.clear();
        boolean z = false;
        this.scrollView.scrollTo(0, 0);
        if (tLRPC$TL_replyKeyboardMarkup != null && this.botButtons.rows.size() != 0) {
            int i = 1;
            boolean z2 = !tLRPC$TL_replyKeyboardMarkup.resize;
            this.isFullSize = z2;
            this.buttonHeight = !z2 ? 42 : (int) Math.max(42.0f, (((this.panelHeight - AndroidUtilities.m34dp(30.0f)) - ((this.botButtons.rows.size() - 1) * AndroidUtilities.m34dp(10.0f))) / this.botButtons.rows.size()) / AndroidUtilities.density);
            int i2 = 0;
            while (i2 < tLRPC$TL_replyKeyboardMarkup.rows.size()) {
                TLRPC$TL_keyboardButtonRow tLRPC$TL_keyboardButtonRow = tLRPC$TL_replyKeyboardMarkup.rows.get(i2);
                LinearLayout linearLayout = new LinearLayout(getContext());
                int i3 = z ? 1 : 0;
                int i4 = z ? 1 : 0;
                int i5 = z ? 1 : 0;
                linearLayout.setOrientation(i3);
                this.container.addView(linearLayout, LayoutHelper.createLinear(-1, this.buttonHeight, 15.0f, i2 == 0 ? 15.0f : 10.0f, 15.0f, i2 == tLRPC$TL_replyKeyboardMarkup.rows.size() - i ? 15.0f : 0.0f));
                float size = 1.0f / tLRPC$TL_keyboardButtonRow.buttons.size();
                int i6 = 0;
                ?? r3 = z;
                while (i6 < tLRPC$TL_keyboardButtonRow.buttons.size()) {
                    TLRPC$KeyboardButton tLRPC$KeyboardButton = tLRPC$TL_keyboardButtonRow.buttons.get(i6);
                    TextView textView = new TextView(getContext());
                    textView.setTag(tLRPC$KeyboardButton);
                    textView.setTextColor(getThemedColor("chat_botKeyboardButtonText"));
                    textView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.m34dp(4.0f), getThemedColor("chat_botKeyboardButtonBackground"), getThemedColor("chat_botKeyboardButtonBackgroundPressed")));
                    textView.setTextSize(i, 16.0f);
                    textView.setGravity(17);
                    FrameLayout frameLayout = new FrameLayout(getContext());
                    frameLayout.addView(textView, LayoutHelper.createFrame(-1, -1.0f));
                    textView.setPadding(AndroidUtilities.m34dp(4.0f), r3 == true ? 1 : 0, AndroidUtilities.m34dp(4.0f), r3);
                    textView.setText(Emoji.replaceEmoji(tLRPC$KeyboardButton.text, textView.getPaint().getFontMetricsInt(), AndroidUtilities.m34dp(16.0f), r3));
                    linearLayout.addView(frameLayout, LayoutHelper.createLinear(0, -1, size, 0, 0, i6 != tLRPC$TL_keyboardButtonRow.buttons.size() + (-1) ? 10 : 0, 0));
                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            BotKeyboardView.this.lambda$setButtons$0(view);
                        }
                    });
                    this.buttonViews.add(textView);
                    ImageView imageView = new ImageView(getContext());
                    imageView.setColorFilter(getThemedColor("chat_botKeyboardButtonText"));
                    if ((tLRPC$KeyboardButton instanceof TLRPC$TL_keyboardButtonWebView) || (tLRPC$KeyboardButton instanceof TLRPC$TL_keyboardButtonSimpleWebView)) {
                        imageView.setImageResource(C0890R.C0891drawable.bot_webview);
                        imageView.setVisibility(0);
                    } else {
                        imageView.setVisibility(8);
                    }
                    this.buttonIcons.add(imageView);
                    frameLayout.addView(imageView, LayoutHelper.createFrame(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
                    i6++;
                    r3 = 0;
                    i = 1;
                }
                i2++;
                z = false;
                i = 1;
            }
        }
    }

    public void lambda$setButtons$0(View view) {
        this.delegate.didPressedButton((TLRPC$KeyboardButton) view.getTag());
    }

    public int getKeyboardHeight() {
        TLRPC$TL_replyKeyboardMarkup tLRPC$TL_replyKeyboardMarkup = this.botButtons;
        if (tLRPC$TL_replyKeyboardMarkup == null) {
            return 0;
        }
        return this.isFullSize ? this.panelHeight : (tLRPC$TL_replyKeyboardMarkup.rows.size() * AndroidUtilities.m34dp(this.buttonHeight)) + AndroidUtilities.m34dp(30.0f) + ((this.botButtons.rows.size() - 1) * AndroidUtilities.m34dp(10.0f));
    }

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }
}

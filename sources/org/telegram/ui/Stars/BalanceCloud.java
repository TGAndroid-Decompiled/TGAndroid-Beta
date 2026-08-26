package org.telegram.ui.Stars;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda26;

public final class BalanceCloud extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final ColoredImageSpan[] coloredImageSpansTon;
    public AmountUtils$Currency currency;
    public final int currentAccount;
    public final Theme.ResourcesProvider resourcesProvider;
    public final TextView textView1;
    public final LinkSpanDrawable.LinksTextView textView2;

    public BalanceCloud(Context context, int i, AmountUtils$Currency amountUtils$Currency, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.coloredImageSpansTon = new ColoredImageSpan[1];
        this.currentAccount = i;
        this.resourcesProvider = resourcesProvider;
        this.currency = amountUtils$Currency;
        setOrientation(1);
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
        setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(24.0f), Theme.getColor(Theme.key_undo_background, resourcesProvider)));
        TextView textView = new TextView(context);
        this.textView1 = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(Theme.getColor(Theme.key_undo_infoColor, resourcesProvider));
        textView.setGravity(17);
        addView(textView, LayoutHelper.createLinear(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        this.textView2 = linksTextView;
        linksTextView.setTextSize(1, 12.0f);
        linksTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new GiftSheet$$ExternalSyntheticLambda26(25, context, resourcesProvider)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        linksTextView.setGravity(17);
        addView(linksTextView, LayoutHelper.createLinear(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        updateBalance();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.starBalanceUpdated) {
            updateBalance();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return isEnabled() && super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateBalance();
        int i = this.currentAccount;
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.currentAccount;
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    public final void updateBalance() {
        AmountUtils$Currency amountUtils$Currency = this.currency;
        int i = this.currentAccount;
        AmountUtils$Amount balanceAmount = StarsController.getInstance(i, amountUtils$Currency).getBalanceAmount();
        AmountUtils$Currency amountUtils$Currency2 = this.currency;
        AmountUtils$Currency amountUtils$Currency3 = AmountUtils$Currency.STARS;
        TextView textView = this.textView1;
        LinkSpanDrawable.LinksTextView linksTextView = this.textView2;
        int i2 = 0;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (amountUtils$Currency2 == amountUtils$Currency3) {
            textView.setText(StarsIntroActivity.replaceStarsWithPlain(false, LocaleController.formatString(R.string.Gift2MessageStarsInfo, LocaleController.formatNumber(balanceAmount.nanos / 1000000000, ',')), 0.6f, null));
            int i3 = Theme.key_undo_cancelColor;
            linksTextView.setTextColor(Theme.getColor(i3, resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(i3, resourcesProvider));
            linksTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new BalanceCloud$$ExternalSyntheticLambda1(this, i2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            return;
        }
        if (amountUtils$Currency2 == AmountUtils$Currency.TON) {
            SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2MessageStarsInfoTON, balanceAmount.asDecimalString()));
            ColoredImageSpan[] coloredImageSpanArr = this.coloredImageSpansTon;
            textView.setText(StarsIntroActivity.replaceStarsWithPlain(true, spannableStringBuilderReplaceTags, 0.6f, coloredImageSpanArr));
            coloredImageSpanArr[0].setColorKey(Theme.key_undo_cancelColor);
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            sb.append(BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i).config.tonUsdRate.get() * balanceAmount.asDouble() * 100.0d), "USD", 2));
            int i4 = Theme.key_undo_infoColor;
            int color = Theme.getColor(i4, resourcesProvider);
            int i5 = Theme.key_undo_background;
            linksTextView.setTextColor(ColorUtils.blendARGB(0.33f, color, Theme.getColor(i5, resourcesProvider)));
            linksTextView.setLinkTextColor(ColorUtils.blendARGB(0.33f, Theme.getColor(i4, resourcesProvider), Theme.getColor(i5, resourcesProvider)));
            linksTextView.setText(sb);
        }
    }
}

package org.telegram.ui.Stars;

import android.content.Context;
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
import org.telegram.ui.Stars.StarsIntroActivity;

public class BalanceCloud extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    private final ColoredImageSpan[] coloredImageSpansTon;
    private AmountUtils$Currency currency;
    private final int currentAccount;
    private final Theme.ResourcesProvider resourcesProvider;
    private final TextView textView1;
    private final LinkSpanDrawable.LinksTextView textView2;

    public BalanceCloud(final Context context, int i, AmountUtils$Currency amountUtils$Currency, final Theme.ResourcesProvider resourcesProvider) {
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
        linksTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new Runnable() {
            @Override
            public final void run() {
                BalanceCloud.lambda$new$0(context, resourcesProvider);
            }
        }), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        linksTextView.setGravity(17);
        addView(linksTextView, LayoutHelper.createLinear(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        updateBalance(false);
    }

    public BalanceCloud(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        this(context, i, AmountUtils$Currency.STARS, resourcesProvider);
    }

    public static void lambda$new$0(Context context, Theme.ResourcesProvider resourcesProvider) {
        new StarsIntroActivity.StarsOptionsSheet(context, resourcesProvider).show();
    }

    public void lambda$updateBalance$1() {
        new StarsIntroActivity.StarsOptionsSheet(getContext(), this.resourcesProvider).show();
    }

    private void updateBalance(boolean z) {
        AmountUtils$Amount balanceAmount = StarsController.getInstance(this.currentAccount, this.currency).getBalanceAmount();
        AmountUtils$Currency amountUtils$Currency = this.currency;
        if (amountUtils$Currency == AmountUtils$Currency.STARS) {
            this.textView1.setText(StarsIntroActivity.replaceStarsWithPlain(LocaleController.formatString(R.string.Gift2MessageStarsInfo, LocaleController.formatNumber(balanceAmount.asDecimal(), ',')), 0.6f));
            LinkSpanDrawable.LinksTextView linksTextView = this.textView2;
            int i = Theme.key_undo_cancelColor;
            linksTextView.setTextColor(Theme.getColor(i, this.resourcesProvider));
            this.textView2.setLinkTextColor(Theme.getColor(i, this.resourcesProvider));
            this.textView2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new Runnable() {
                @Override
                public final void run() {
                    BalanceCloud.this.lambda$updateBalance$1();
                }
            }), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            return;
        }
        if (amountUtils$Currency == AmountUtils$Currency.TON) {
            this.textView1.setText(StarsIntroActivity.replaceStarsWithPlain(true, (CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2MessageStarsInfoTON, balanceAmount.asDecimalString())), 0.6f, this.coloredImageSpansTon));
            this.coloredImageSpansTon[0].setColorKey(Theme.key_undo_cancelColor);
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            sb.append(BillingController.getInstance().formatCurrency((long) (balanceAmount.asDouble() * MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get() * 100.0d), "USD", 2));
            LinkSpanDrawable.LinksTextView linksTextView2 = this.textView2;
            int i2 = Theme.key_undo_infoColor;
            int color = Theme.getColor(i2, this.resourcesProvider);
            int i3 = Theme.key_undo_background;
            linksTextView2.setTextColor(ColorUtils.blendARGB(color, Theme.getColor(i3, this.resourcesProvider), 0.33f));
            this.textView2.setLinkTextColor(ColorUtils.blendARGB(Theme.getColor(i2, this.resourcesProvider), Theme.getColor(i3, this.resourcesProvider), 0.33f));
            this.textView2.setText(sb);
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.starBalanceUpdated) {
            updateBalance(true);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return isEnabled() && super.dispatchTouchEvent(motionEvent);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateBalance(false);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    public void setCurrency(AmountUtils$Currency amountUtils$Currency, boolean z) {
        if (this.currency != amountUtils$Currency) {
            this.currency = amountUtils$Currency;
            updateBalance(z);
        }
    }
}

package org.telegram.ui.Stars;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import java.math.BigDecimal;
import java.math.MathContext;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount$$ExternalSyntheticBackportWithForwarding0;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Stars.StarsIntroActivity;

public class BalanceCloud extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    private long chatId;
    private final ColoredImageSpan[] coloredImageSpansTon;
    private AmountUtils$Currency currency;
    private final int currentAccount;
    private final Theme.ResourcesProvider resourcesProvider;
    private final TextView textView1;
    private final LinkSpanDrawable.LinksTextView textView2;

    public BalanceCloud(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        this(context, i, -1L, AmountUtils$Currency.STARS, resourcesProvider);
    }

    public BalanceCloud(Context context, int i, long j, Theme.ResourcesProvider resourcesProvider) {
        this(context, i, j, AmountUtils$Currency.STARS, resourcesProvider);
    }

    public BalanceCloud(final Context context, int i, long j, AmountUtils$Currency amountUtils$Currency, final Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.coloredImageSpansTon = new ColoredImageSpan[1];
        this.currentAccount = i;
        this.chatId = j;
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

    public static void lambda$new$0(Context context, Theme.ResourcesProvider resourcesProvider) {
        new StarsIntroActivity.StarsOptionsSheet(context, resourcesProvider).show();
    }

    public void setCurrency(AmountUtils$Currency amountUtils$Currency, boolean z) {
        if (this.currency != amountUtils$Currency) {
            this.currency = amountUtils$Currency;
            updateBalance(z);
        }
    }

    public void setChatId(long j) {
        this.chatId = j;
        updateBalance(true);
    }

    private void updateBalance(boolean z) {
        String string;
        AmountUtils$Amount balanceAmount = StarsController.getInstance(this.currentAccount, this.currency).getBalanceAmount();
        AmountUtils$Currency amountUtils$Currency = this.currency;
        if (amountUtils$Currency == AmountUtils$Currency.STARS) {
            TextView textView = this.textView1;
            long j = this.chatId;
            textView.setText(StarsIntroActivity.replaceStarsWithPlain(LocaleController.formatString(j == -1 ? R.string.Gift2MessageStarsInfo : R.string.Gift2MessageChannelStarsInfo, LocaleController.formatNumber(j == -1 ? balanceAmount.asDecimal() : (int) BotStarsController.getInstance(this.currentAccount).getBotStarsBalance(-this.chatId).amount, ',')), 0.6f));
            LinkSpanDrawable.LinksTextView linksTextView = this.textView2;
            int i = Theme.key_undo_cancelColor;
            linksTextView.setTextColor(Theme.getColor(i, this.resourcesProvider));
            this.textView2.setLinkTextColor(Theme.getColor(i, this.resourcesProvider));
            this.textView2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$updateBalance$1();
                }
            }), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            this.textView2.setVisibility(this.chatId != -1 ? 8 : 0);
            return;
        }
        if (amountUtils$Currency == AmountUtils$Currency.TON) {
            TextView textView2 = this.textView1;
            if (this.chatId == -1) {
                string = LocaleController.formatString(R.string.Gift2MessageStarsInfoTON, balanceAmount.asDecimalString());
            } else {
                string = LocaleController.formatString(R.string.Gift2MessageChannelStarsInfoTON, AmountUtils$Amount$$ExternalSyntheticBackportWithForwarding0.m(new BigDecimal(BotStarsController.getInstance(this.currentAccount).getBotStarsBalance(-this.chatId).amount).divide(BigDecimal.valueOf(1000000000L), MathContext.UNLIMITED)).toPlainString());
            }
            textView2.setText(StarsIntroActivity.replaceStarsWithPlain(true, (CharSequence) AndroidUtilities.replaceTags(string), 0.6f, this.coloredImageSpansTon));
            this.coloredImageSpansTon[0].setColorKey(Theme.key_undo_cancelColor);
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            sb.append(BillingController.getInstance().formatCurrency((long) ((this.chatId == -1 ? balanceAmount.asDouble() : BotStarsController.getInstance(this.currentAccount).getBotStarsBalance(-this.chatId).amount) * MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get() * 100.0d), "USD", 2));
            LinkSpanDrawable.LinksTextView linksTextView2 = this.textView2;
            int i2 = Theme.key_undo_infoColor;
            int color = Theme.getColor(i2, this.resourcesProvider);
            int i3 = Theme.key_undo_background;
            linksTextView2.setTextColor(ColorUtils.blendARGB(color, Theme.getColor(i3, this.resourcesProvider), 0.33f));
            this.textView2.setLinkTextColor(ColorUtils.blendARGB(Theme.getColor(i2, this.resourcesProvider), Theme.getColor(i3, this.resourcesProvider), 0.33f));
            this.textView2.setText(sb);
        }
    }

    public void lambda$updateBalance$1() {
        new StarsIntroActivity.StarsOptionsSheet(getContext(), this.resourcesProvider).show();
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

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.starBalanceUpdated) {
            updateBalance(true);
        }
    }
}

package org.telegram.ui.Components.Premium.boosts.cells;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC$TL_premiumGiftCodeOption;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.boosts.DiscountSpan;
@SuppressLint({"ViewConstructor"})
public class DurationWithDiscountCell extends DurationCell {
    protected final CheckBox2 checkBox;
    private TLRPC$TL_premiumGiftCodeOption option;

    @Override
    protected boolean needCheck() {
        return true;
    }

    public DurationWithDiscountCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
        CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
        this.checkBox = checkBox2;
        checkBox2.setColor(Theme.key_premiumGradient1, Theme.key_checkboxDisabled, Theme.key_dialogRoundCheckBoxCheck);
        checkBox2.setDrawUnchecked(true);
        checkBox2.setDrawBackgroundAsArc(10);
        addView(checkBox2);
        this.titleTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.radioButton.setVisibility(8);
        updateLayouts();
    }

    @Override
    public void updateLayouts() {
        super.updateLayouts();
        SimpleTextView simpleTextView = this.titleTextView;
        boolean z = LocaleController.isRTL;
        simpleTextView.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, (z ? 5 : 3) | 16, z ? 20.0f : 102.0f, 0.0f, z ? 102.0f : 20.0f, 0.0f));
        SimpleTextView simpleTextView2 = this.subtitleTextView;
        boolean z2 = LocaleController.isRTL;
        simpleTextView2.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, (z2 ? 5 : 3) | 16, z2 ? 20.0f : 102.0f, 0.0f, z2 ? 102.0f : 20.0f, 0.0f));
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            boolean z3 = LocaleController.isRTL;
            checkBox2.setLayoutParams(LayoutHelper.createFrame(22, 22.0f, (z3 ? 5 : 3) | 16, z3 ? 15.0f : 20.0f, 0.0f, z3 ? 20.0f : 15.0f, 0.0f));
        }
    }

    @Override
    public void setChecked(boolean z, boolean z2) {
        if (this.checkBox.getVisibility() == 0) {
            this.checkBox.setChecked(z, z2);
        }
    }

    public void setDuration(TLRPC$TL_premiumGiftCodeOption tLRPC$TL_premiumGiftCodeOption, TLRPC$TL_premiumGiftCodeOption tLRPC$TL_premiumGiftCodeOption2, int i, boolean z, boolean z2) {
        this.option = tLRPC$TL_premiumGiftCodeOption;
        long j = tLRPC$TL_premiumGiftCodeOption.amount;
        String str = tLRPC$TL_premiumGiftCodeOption.currency;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatPluralString("Months", tLRPC$TL_premiumGiftCodeOption.months, new Object[0]));
        double d = tLRPC$TL_premiumGiftCodeOption.amount;
        double d2 = tLRPC$TL_premiumGiftCodeOption.months;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = tLRPC$TL_premiumGiftCodeOption2.amount;
        double d5 = tLRPC$TL_premiumGiftCodeOption2.months;
        Double.isNaN(d4);
        Double.isNaN(d5);
        int i2 = (int) ((1.0d - (d3 / (d4 / d5))) * 100.0d);
        if (i2 > 0) {
            this.titleTextView.setText(spannableStringBuilder.append(DiscountSpan.applySpan(BuildConfig.APP_CENTER_HASH, i2)));
        } else {
            this.titleTextView.setText(spannableStringBuilder);
        }
        setSubtitle(null);
        SimpleTextView simpleTextView = this.totalTextView;
        BillingController billingController = BillingController.getInstance();
        if (i <= 0) {
            j = 0;
        }
        simpleTextView.setText(billingController.formatCurrency(j, str.toString()));
        setDivider(z);
        this.checkBox.setChecked(z2, false);
    }

    public TLRPC$TL_premiumGiftCodeOption getOption() {
        return this.option;
    }
}

package org.telegram.ui.Components.Premium.boosts.cells;

import android.content.Context;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

public class DurationCell extends BaseCell {
    private Object code;
    protected final SimpleTextView totalTextView;

    public DurationCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
        this.imageView.setVisibility(8);
        SimpleTextView simpleTextView = this.subtitleTextView;
        int i = Theme.key_windowBackgroundWhiteGrayText4;
        simpleTextView.setTextColor(Theme.getColor(i, resourcesProvider));
        SimpleTextView simpleTextView2 = new SimpleTextView(context);
        this.totalTextView = simpleTextView2;
        simpleTextView2.setTextSize(16);
        simpleTextView2.setTextColor(Theme.getColor(i, resourcesProvider));
        simpleTextView2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(simpleTextView2);
        boolean z = LocaleController.isRTL;
        simpleTextView2.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, (z ? 3 : 5) | 16, z ? 20.0f : 0.0f, 0.0f, z ? 0.0f : 20.0f, 0.0f));
    }

    public Object getGifCode() {
        return this.code;
    }

    @Override
    protected boolean needCheck() {
        return true;
    }

    public void setDuration(Object obj, int i, int i2, long j, CharSequence charSequence, boolean z, boolean z2) {
        SimpleTextView simpleTextView;
        String formatPluralString;
        this.code = obj;
        if (i >= 12) {
            simpleTextView = this.titleTextView;
            formatPluralString = LocaleController.formatPluralString("Years", 1, new Object[0]);
        } else {
            simpleTextView = this.titleTextView;
            formatPluralString = LocaleController.formatPluralString("Months", i, new Object[0]);
        }
        simpleTextView.setText(formatPluralString);
        StringBuilder sb = new StringBuilder();
        sb.append(BillingController.getInstance().formatCurrency(i2 > 0 ? j / i2 : j, charSequence.toString()));
        sb.append(" x ");
        sb.append(i2);
        setSubtitle(sb.toString());
        SimpleTextView simpleTextView2 = this.totalTextView;
        BillingController billingController = BillingController.getInstance();
        if (i2 <= 0) {
            j = 0;
        }
        simpleTextView2.setText(billingController.formatCurrency(j, charSequence.toString()));
        setDivider(z);
        this.radioButton.setChecked(z2, false);
    }
}

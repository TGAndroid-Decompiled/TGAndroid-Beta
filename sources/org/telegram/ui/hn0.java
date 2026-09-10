package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class hn0 extends TextView {
    public final int f33422a;

    public hn0(Context context, int i10) {
        super(context);
        this.f33422a = i10;
    }

    @Override
    public CharSequence getAccessibilityClassName() {
        switch (this.f33422a) {
            case 2:
                return Button.class.getName();
            default:
                return super.getAccessibilityClassName();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f33422a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE));
                return;
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(AndroidUtilities.dp(26.0f)), 1073741824));
                return;
            case 2:
            default:
                super.onMeasure(i10, i11);
                return;
            case 3:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 1073741824));
                return;
        }
    }
}

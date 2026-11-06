package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public final class mb0 extends TextView {
    public final int f47780a;

    public mb0(Context context, int i7) {
        super(context);
        this.f47780a = i7;
    }

    @Override
    public CharSequence getAccessibilityClassName() {
        switch (this.f47780a) {
            case 5:
                return Button.class.getName();
            default:
                return super.getAccessibilityClassName();
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f47780a) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), Integer.MIN_VALUE));
                return;
            case 1:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i10), org.telegram.messenger.g0.L(100.0f)), Integer.MIN_VALUE));
                return;
            case 2:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), Integer.MIN_VALUE));
                return;
            case 3:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), Integer.MIN_VALUE));
                return;
            case 4:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(org.telegram.messenger.g0.L(26.0f)), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }
}

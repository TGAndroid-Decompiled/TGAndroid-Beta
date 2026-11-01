package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
public final class si0 extends LinearLayout {
    public boolean f30313a;

    public si0(Context context) {
        super(context);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        oi0 oi0Var = null;
        if (!this.f30313a) {
            i12 = 0;
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                if (getChildAt(i13) instanceof wi0) {
                    oi0Var = ((wi0) getChildAt(i13)).e;
                    if (oi0Var.getAdapter().b() == oi0Var.getChildCount()) {
                        int childCount = oi0Var.getChildCount();
                        for (int i14 = 0; i14 < childCount; i14++) {
                            oi0Var.getChildAt(i14).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), 0), i11);
                            if (oi0Var.getChildAt(i14).getMeasuredWidth() > i12) {
                                i12 = oi0Var.getChildAt(i14).getMeasuredWidth();
                            }
                        }
                        i12 += org.telegram.messenger.i0.L(16.0f);
                    }
                }
            }
        } else {
            i12 = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (size < org.telegram.messenger.i0.L(240.0f)) {
            size = org.telegram.messenger.i0.L(240.0f);
        }
        if (size > org.telegram.messenger.i0.L(280.0f)) {
            size = org.telegram.messenger.i0.L(280.0f);
        }
        if (size < 0) {
            size = 0;
        }
        if (i12 == 0 || i12 >= size) {
            i12 = size;
        }
        if (oi0Var != null) {
            for (int i15 = 0; i15 < oi0Var.getChildCount(); i15++) {
                oi0Var.getChildAt(i15).measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
    }
}

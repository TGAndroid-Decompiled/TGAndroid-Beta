package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
public final class qh0 extends LinearLayout {
    public boolean f37463a;

    public qh0(Context context) {
        super(context);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        mh0 mh0Var = null;
        if (!this.f37463a) {
            i11 = 0;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                if (getChildAt(i12) instanceof uh0) {
                    mh0Var = ((uh0) getChildAt(i12)).f38751e;
                    if (mh0Var.getAdapter().b() == mh0Var.getChildCount()) {
                        int childCount = mh0Var.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            mh0Var.getChildAt(i13).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), 0), i10);
                            if (mh0Var.getChildAt(i13).getMeasuredWidth() > i11) {
                                i11 = mh0Var.getChildAt(i13).getMeasuredWidth();
                            }
                        }
                        i11 += org.telegram.messenger.g0.L(16.0f);
                    }
                }
            }
        } else {
            i11 = 0;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size < org.telegram.messenger.g0.L(240.0f)) {
            size = org.telegram.messenger.g0.L(240.0f);
        }
        if (size > org.telegram.messenger.g0.L(280.0f)) {
            size = org.telegram.messenger.g0.L(280.0f);
        }
        if (size < 0) {
            size = 0;
        }
        if (i11 == 0 || i11 >= size) {
            i11 = size;
        }
        if (mh0Var != null) {
            for (int i14 = 0; i14 < mh0Var.getChildCount(); i14++) {
                mh0Var.getChildAt(i14).measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i10);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i10);
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

public final class cj0 extends LinearLayout {

    public boolean f27469a;

    public cj0(Context context) {
        super(context);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iDp;
        yi0 yi0Var = null;
        if (this.f27469a) {
            iDp = 0;
        } else {
            iDp = 0;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                if (getChildAt(i12) instanceof gj0) {
                    yi0Var = ((gj0) getChildAt(i12)).f28726e;
                    if (yi0Var.getAdapter().h() == yi0Var.getChildCount()) {
                        int childCount = yi0Var.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            yi0Var.getChildAt(i13).measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), 0), i11);
                            if (yi0Var.getChildAt(i13).getMeasuredWidth() > iDp) {
                                iDp = yi0Var.getChildAt(i13).getMeasuredWidth();
                            }
                        }
                        iDp += AndroidUtilities.dp(16.0f);
                    }
                }
            }
        }
        int size = View.MeasureSpec.getSize(i10);
        if (size < AndroidUtilities.dp(240.0f)) {
            size = AndroidUtilities.dp(240.0f);
        }
        if (size > AndroidUtilities.dp(280.0f)) {
            size = AndroidUtilities.dp(280.0f);
        }
        if (size < 0) {
            size = 0;
        }
        if (iDp == 0 || iDp >= size) {
            iDp = size;
        }
        if (yi0Var != null) {
            for (int i14 = 0; i14 < yi0Var.getChildCount(); i14++) {
                yi0Var.getChildAt(i14).measure(View.MeasureSpec.makeMeasureSpec(iDp, 1073741824), i11);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(iDp, 1073741824), i11);
    }
}

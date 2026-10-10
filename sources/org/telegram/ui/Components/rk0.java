package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class rk0 extends LinearLayout {
    public boolean f30480a;

    public rk0(Context context) {
        super(context);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        nk0 nk0Var = null;
        if (!this.f30480a) {
            i12 = 0;
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                if (getChildAt(i13) instanceof vk0) {
                    nk0Var = ((vk0) getChildAt(i13)).f31873e;
                    if (nk0Var.getAdapter().h() == nk0Var.getChildCount()) {
                        int childCount = nk0Var.getChildCount();
                        for (int i14 = 0; i14 < childCount; i14++) {
                            nk0Var.getChildAt(i14).measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), 0), i11);
                            if (nk0Var.getChildAt(i14).getMeasuredWidth() > i12) {
                                i12 = nk0Var.getChildAt(i14).getMeasuredWidth();
                            }
                        }
                        i12 += AndroidUtilities.dp(16.0f);
                    }
                }
            }
        } else {
            i12 = 0;
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
        if (i12 == 0 || i12 >= size) {
            i12 = size;
        }
        if (nk0Var != null) {
            for (int i15 = 0; i15 < nk0Var.getChildCount(); i15++) {
                nk0Var.getChildAt(i15).measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
    }
}

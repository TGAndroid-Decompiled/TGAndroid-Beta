package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class aj0 extends LinearLayout {
    public boolean f26841a;

    public aj0(Context context) {
        super(context);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        wi0 wi0Var = null;
        if (!this.f26841a) {
            i11 = 0;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                if (getChildAt(i12) instanceof ej0) {
                    wi0Var = ((ej0) getChildAt(i12)).f28040e;
                    if (wi0Var.getAdapter().h() == wi0Var.getChildCount()) {
                        int childCount = wi0Var.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            wi0Var.getChildAt(i13).measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), 0), i10);
                            if (wi0Var.getChildAt(i13).getMeasuredWidth() > i11) {
                                i11 = wi0Var.getChildAt(i13).getMeasuredWidth();
                            }
                        }
                        i11 += AndroidUtilities.dp(16.0f);
                    }
                }
            }
        } else {
            i11 = 0;
        }
        int size = View.MeasureSpec.getSize(i9);
        if (size < AndroidUtilities.dp(240.0f)) {
            size = AndroidUtilities.dp(240.0f);
        }
        if (size > AndroidUtilities.dp(280.0f)) {
            size = AndroidUtilities.dp(280.0f);
        }
        if (size < 0) {
            size = 0;
        }
        if (i11 == 0 || i11 >= size) {
            i11 = size;
        }
        if (wi0Var != null) {
            for (int i14 = 0; i14 < wi0Var.getChildCount(); i14++) {
                wi0Var.getChildAt(i14).measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i10);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i10);
    }
}

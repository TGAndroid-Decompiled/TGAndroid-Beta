package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public final class hn0 extends LinearLayout {

    public boolean f38871a;

    public final int f38872b;

    public final int[] f38873c;
    public final int[] d;

    public hn0(Context context, int i10, int[] iArr, int[] iArr2) {
        super(context);
        this.f38872b = i10;
        this.f38873c = iArr;
        this.d = iArr2;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        this.f38871a = true;
        int iDp = AndroidUtilities.dp(9.0f);
        int i12 = this.f38872b;
        int i13 = (i12 - 1) * iDp;
        int[] iArr = this.f38873c;
        float f10 = 1.0f;
        if ((iArr[0] * i12) + i13 <= size) {
            setWeightSum(1.0f);
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                getChildAt(i14).getLayoutParams().width = 0;
                ((LinearLayout.LayoutParams) getChildAt(i14).getLayoutParams()).weight = 1.0f / childCount;
            }
        } else if (this.d[0] + i13 <= size) {
            setWeightSum(1.0f);
            int i15 = size - i13;
            int childCount2 = getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt = getChildAt(i16);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                layoutParams.width = 0;
                float fIntValue = ((Integer) childAt.getTag(R.id.width_tag)).intValue() / i15;
                layoutParams.weight = fIntValue;
                f10 -= fIntValue;
            }
            float f11 = f10 / (i12 - 1);
            if (f11 > 0.0f) {
                int childCount3 = getChildCount();
                for (int i17 = 0; i17 < childCount3; i17++) {
                    View childAt2 = getChildAt(i17);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                    if (((Integer) childAt2.getTag(R.id.width_tag)).intValue() != iArr[0]) {
                        layoutParams2.weight += f11;
                    }
                }
            }
        } else {
            setWeightSum(0.0f);
            int childCount4 = getChildCount();
            for (int i18 = 0; i18 < childCount4; i18++) {
                getChildAt(i18).getLayoutParams().width = -2;
                ((LinearLayout.LayoutParams) getChildAt(i18).getLayoutParams()).weight = 0.0f;
            }
        }
        this.f38871a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f38871a) {
            return;
        }
        super.requestLayout();
    }
}

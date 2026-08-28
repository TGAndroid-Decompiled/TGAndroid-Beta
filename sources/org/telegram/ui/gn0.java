package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class gn0 extends LinearLayout {
    public boolean f38582a;
    public final int f38583b;
    public final int[] f38584c;
    public final int[] d;

    public gn0(Context context, int i9, int[] iArr, int[] iArr2) {
        super(context);
        this.f38583b = i9;
        this.f38584c = iArr;
        this.d = iArr2;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        View childAt;
        int size = View.MeasureSpec.getSize(i9);
        this.f38582a = true;
        int dp = AndroidUtilities.dp(9.0f);
        int i11 = this.f38583b;
        int i12 = (i11 - 1) * dp;
        int[] iArr = this.f38584c;
        float f10 = 1.0f;
        if ((iArr[0] * i11) + i12 <= size) {
            setWeightSum(1.0f);
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                getChildAt(i13).getLayoutParams().width = 0;
                ((LinearLayout.LayoutParams) getChildAt(i13).getLayoutParams()).weight = 1.0f / childCount;
            }
        } else if (this.d[0] + i12 <= size) {
            setWeightSum(1.0f);
            int i14 = size - i12;
            int childCount2 = getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i15).getLayoutParams();
                layoutParams.width = 0;
                float intValue = ((Integer) childAt.getTag(R.id.width_tag)).intValue() / i14;
                layoutParams.weight = intValue;
                f10 -= intValue;
            }
            float f11 = f10 / (i11 - 1);
            if (f11 > 0.0f) {
                int childCount3 = getChildCount();
                for (int i16 = 0; i16 < childCount3; i16++) {
                    View childAt2 = getChildAt(i16);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                    if (((Integer) childAt2.getTag(R.id.width_tag)).intValue() != iArr[0]) {
                        layoutParams2.weight += f11;
                    }
                }
            }
        } else {
            setWeightSum(0.0f);
            int childCount4 = getChildCount();
            for (int i17 = 0; i17 < childCount4; i17++) {
                getChildAt(i17).getLayoutParams().width = -2;
                ((LinearLayout.LayoutParams) getChildAt(i17).getLayoutParams()).weight = 0.0f;
            }
        }
        this.f38582a = false;
        super.onMeasure(i9, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f38582a) {
            return;
        }
        super.requestLayout();
    }
}

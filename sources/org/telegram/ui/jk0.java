package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
public final class jk0 extends LinearLayout {
    public boolean f46635a;
    public final int f46636b;
    public final int[] f46637c;
    public final int[] d;

    public jk0(Context context, int i3, int[] iArr, int[] iArr2) {
        super(context);
        this.f46636b = i3;
        this.f46637c = iArr;
        this.d = iArr2;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        View childAt;
        int size = View.MeasureSpec.getSize(i3);
        this.f46635a = true;
        int L = org.telegram.messenger.g0.L(9.0f);
        int i11 = this.f46636b;
        int i12 = (i11 - 1) * L;
        int[] iArr = this.f46637c;
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
                float intValue = ((Integer) childAt.getTag(2131296739)).intValue() / i14;
                layoutParams.weight = intValue;
                f10 -= intValue;
            }
            float f11 = f10 / (i11 - 1);
            if (f11 > 0.0f) {
                int childCount3 = getChildCount();
                for (int i16 = 0; i16 < childCount3; i16++) {
                    View childAt2 = getChildAt(i16);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                    if (((Integer) childAt2.getTag(2131296739)).intValue() != iArr[0]) {
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
        this.f46635a = false;
        super.onMeasure(i3, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f46635a) {
            return;
        }
        super.requestLayout();
    }
}

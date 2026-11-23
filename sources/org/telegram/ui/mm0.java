package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class mm0 extends org.telegram.ui.Components.cu0 {
    public int f50080g0;
    public boolean f50081h0;
    public final om0 f50082i0;

    public mm0(om0 om0Var, Context context) {
        super(context, null);
        this.f50082i0 = om0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        float f10;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        int L = org.telegram.messenger.g0.L(20.0f);
        int i12 = 0;
        om0 om0Var = this.f50082i0;
        if (L >= 0) {
            if (!org.telegram.messenger.g0.E) {
                size2 -= om0Var.N.getEmojiPadding();
                i10 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            }
        } else {
            this.f50081h0 = true;
            om0Var.N.j();
            this.f50081h0 = false;
        }
        int i13 = i10;
        int childCount = getChildCount();
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.wt wtVar = om0Var.N;
                if (wtVar != null && wtVar.l(childAt)) {
                    if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (org.telegram.messenger.g0.Q1()) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        if (org.telegram.messenger.g0.Q1()) {
                            f10 = 200.0f;
                        } else {
                            f10 = 320.0f;
                        }
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(f10), getPaddingTop() + (size2 - org.telegram.messenger.g0.f24220m)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - org.telegram.messenger.g0.f24220m), 1073741824));
                    }
                } else {
                    i11 = i7;
                    measureChildWithMargins(childAt, i11, 0, i13, 0);
                    i12++;
                    i7 = i11;
                }
            }
            i11 = i7;
            i12++;
            i7 = i11;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f50081h0) {
            return;
        }
        super.requestLayout();
    }
}

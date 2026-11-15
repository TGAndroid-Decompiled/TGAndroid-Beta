package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class lm0 extends org.telegram.ui.Components.st0 {
    public int f49006g0;
    public boolean f49007h0;
    public final nm0 f49008i0;

    public lm0(nm0 nm0Var, Context context) {
        super(context, null);
        this.f49008i0 = nm0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lm0.onLayout(boolean, int, int, int, int):void");
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
        nm0 nm0Var = this.f49008i0;
        if (L >= 0) {
            if (!org.telegram.messenger.g0.E) {
                size2 -= nm0Var.N.getEmojiPadding();
                i10 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            }
        } else {
            this.f49007h0 = true;
            nm0Var.N.j();
            this.f49007h0 = false;
        }
        int i13 = i10;
        int childCount = getChildCount();
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.rt rtVar = nm0Var.N;
                if (rtVar != null && rtVar.l(childAt)) {
                    if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (org.telegram.messenger.g0.Q1()) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        if (org.telegram.messenger.g0.Q1()) {
                            f10 = 200.0f;
                        } else {
                            f10 = 320.0f;
                        }
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(f10), getPaddingTop() + (size2 - org.telegram.messenger.g0.f23603m)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - org.telegram.messenger.g0.f23603m), 1073741824));
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
        if (this.f49007h0) {
            return;
        }
        super.requestLayout();
    }
}

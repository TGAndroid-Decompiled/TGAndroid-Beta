package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
public final class ho0 extends org.telegram.ui.Components.uu0 {
    public int f38006f0;
    public boolean f38007g0;
    public int f38008h0;
    public final lo0 f38009i0;

    public ho0(lo0 lo0Var, Context context) {
        super(context, null);
        this.f38009i0 = lo0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ho0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        org.telegram.ui.Components.wt wtVar;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean Q1 = org.telegram.messenger.i0.Q1();
        lo0 lo0Var = this.f38009i0;
        if (Q1) {
            lo0Var.f39337g0 = 4;
        } else {
            Point point = org.telegram.messenger.i0.f16026q;
            if (point.x > point.y) {
                lo0Var.f39337g0 = 4;
            } else {
                lo0Var.f39337g0 = 3;
            }
        }
        this.f38007g0 = true;
        int L = ((size2 - org.telegram.messenger.i0.L(4.0f)) - org.telegram.messenger.i0.L(4.0f)) / lo0Var.f39337g0;
        lo0Var.R = L;
        if (this.f38008h0 != L) {
            this.f38008h0 = L;
            org.telegram.messenger.i0.g3(new mg0(this, 16));
        }
        if (lo0Var.Y) {
            lo0Var.M.y1(1);
        } else {
            lo0Var.M.y1(Math.max(1, ((lo0Var.f39337g0 - 1) * org.telegram.messenger.i0.L(2.0f)) + (lo0Var.R * lo0Var.f39337g0)));
        }
        this.f38007g0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int Q = Q();
        if (org.telegram.messenger.i0.L(20.0f) >= 0 && !org.telegram.messenger.i0.E && lo0Var.f39333d0 != null && lo0Var.Z.getParent() == this) {
            size4 -= lo0Var.f39333d0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i12 = size4;
        int i13 = makeMeasureSpec;
        if (Q > org.telegram.messenger.i0.L(20.0f) && (wtVar = lo0Var.f39333d0) != null) {
            this.f38007g0 = true;
            wtVar.j();
            this.f38007g0 = false;
        }
        org.telegram.ui.Components.wt wtVar2 = lo0Var.f39333d0;
        if (wtVar2 != null && wtVar2.e) {
            lo0Var.fragmentView.setTranslationY(0.0f);
            lo0Var.K.setTranslationY(0.0f);
            lo0Var.N.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.wt wtVar3 = lo0Var.f39333d0;
                if (wtVar3 != null && wtVar3.l(childAt)) {
                    if (!org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (org.telegram.messenger.i0.Q1()) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                        if (org.telegram.messenger.i0.Q1()) {
                            f7 = 200.0f;
                        } else {
                            f7 = 320.0f;
                        }
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(f7), getPaddingTop() + (i12 - org.telegram.messenger.i0.f16020m)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i12 - org.telegram.messenger.i0.f16020m), 1073741824));
                    }
                } else {
                    measureChildWithMargins(childAt, i10, 0, i13, 0);
                }
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f38007g0) {
            return;
        }
        super.requestLayout();
    }
}

package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
public final class om0 extends org.telegram.ui.Components.qt0 {
    public int f48312g0;
    public boolean f48313h0;
    public int f48314i0;
    public final sm0 f48315j0;

    public om0(sm0 sm0Var, Context context) {
        super(context, null);
        this.f48315j0 = sm0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.om0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        org.telegram.ui.Components.jt jtVar;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i3);
        boolean Q1 = org.telegram.messenger.g0.Q1();
        sm0 sm0Var = this.f48315j0;
        if (Q1) {
            sm0Var.f49550h0 = 4;
        } else {
            Point point = org.telegram.messenger.g0.f22608q;
            if (point.x > point.y) {
                sm0Var.f49550h0 = 4;
            } else {
                sm0Var.f49550h0 = 3;
            }
        }
        this.f48313h0 = true;
        int L = ((size2 - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(4.0f)) / sm0Var.f49550h0;
        sm0Var.S = L;
        if (this.f48314i0 != L) {
            this.f48314i0 = L;
            org.telegram.messenger.g0.h3(new sg0(this, 15));
        }
        if (sm0Var.Z) {
            sm0Var.N.y1(1);
        } else {
            sm0Var.N.y1(Math.max(1, ((sm0Var.f49550h0 - 1) * org.telegram.messenger.g0.L(2.0f)) + (sm0Var.S * sm0Var.f49550h0)));
        }
        this.f48313h0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i3);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int Q = Q();
        if (org.telegram.messenger.g0.L(20.0f) >= 0 && !org.telegram.messenger.g0.E && sm0Var.f49546e0 != null && sm0Var.f49539a0.getParent() == this) {
            size4 -= sm0Var.f49546e0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i11 = size4;
        int i12 = makeMeasureSpec;
        if (Q > org.telegram.messenger.g0.L(20.0f) && (jtVar = sm0Var.f49546e0) != null) {
            this.f48313h0 = true;
            jtVar.j();
            this.f48313h0 = false;
        }
        org.telegram.ui.Components.jt jtVar2 = sm0Var.f49546e0;
        if (jtVar2 != null && jtVar2.f35191e) {
            sm0Var.fragmentView.setTranslationY(0.0f);
            sm0Var.L.setTranslationY(0.0f);
            sm0Var.O.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.jt jtVar3 = sm0Var.f49546e0;
                if (jtVar3 != null && jtVar3.l(childAt)) {
                    if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (org.telegram.messenger.g0.Q1()) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                        if (org.telegram.messenger.g0.Q1()) {
                            f10 = 200.0f;
                        } else {
                            f10 = 320.0f;
                        }
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(f10), getPaddingTop() + (i11 - org.telegram.messenger.g0.f22602m)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i11 - org.telegram.messenger.g0.f22602m), 1073741824));
                    }
                } else {
                    measureChildWithMargins(childAt, i3, 0, i12, 0);
                }
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f48313h0) {
            return;
        }
        super.requestLayout();
    }
}

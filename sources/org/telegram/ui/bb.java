package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaController;
public final class bb extends jb {
    public final jh.l f46000h0;
    public final lb f46001i0;

    public bb(lb lbVar, Context context) {
        super(lbVar, context);
        this.f46001i0 = lbVar;
        this.f46000h0 = new jh.l();
    }

    @Override
    public final void T(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.za0) {
            ((org.telegram.ui.Components.za0) drawable).p();
        }
        jh.l lVar = this.f46000h0;
        ui.a c10 = lVar.c(drawable);
        org.telegram.messenger.g0.B(lVar.a(c10));
        lb lbVar = this.f46001i0;
        lbVar.f49678a.f59137a = c10;
        lh.f fVar = lbVar.X;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ab.q qVar = ab.q.f986e;
        if (qVar != null && qVar.f987a) {
            r4 r4Var = (r4) ab.q.p().d;
            if (r4Var != null) {
                r4Var.onTouchEvent(motionEvent);
                return true;
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.fj fjVar = MediaController.B().f22838v0;
        if (fjVar != null && fjVar.h4() && fjVar.T != 0) {
            long B0 = org.telegram.messenger.fj.B0(fjVar.f24073k);
            lb lbVar = this.f46001i0;
            if (B0 == (-lbVar.f49687f.f28492id)) {
                MediaController.B().p0(lbVar.V0(false), lbVar.f49688f0, lbVar.f49686e0, true);
            }
        }
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bb.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        lb lbVar = this.f46001i0;
        ui.a aVar = lbVar.f49678a.f59137a;
        if (aVar instanceof ui.b) {
            ((ui.b) aVar).b(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        kVar = ((org.telegram.ui.ActionBar.g2) lbVar).actionBar;
        measureChildWithMargins(kVar, i7, 0, i10, 0);
        kVar2 = ((org.telegram.ui.ActionBar.g2) lbVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        kVar3 = ((org.telegram.ui.ActionBar.g2) lbVar).actionBar;
        if (kVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar4 = ((org.telegram.ui.ActionBar.g2) lbVar).actionBar;
                if (childAt != kVar4) {
                    if (childAt != lbVar.f49707w && childAt != lbVar.f49695n) {
                        if (childAt == lbVar.I) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                        } else {
                            measureChildWithMargins(childAt, i7, 0, i10, 0);
                        }
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), View.MeasureSpec.getSize(i10)) + (lbVar.f49685e * 2), 1073741824));
                    }
                }
            }
        }
    }
}

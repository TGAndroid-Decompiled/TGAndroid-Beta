package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaController;
public final class cb extends kb {
    public final jh.l f44734g0;
    public final mb f44735h0;

    public cb(mb mbVar, Context context) {
        super(mbVar, context);
        this.f44735h0 = mbVar;
        this.f44734g0 = new jh.l();
    }

    @Override
    public final void T(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.qa0) {
            ((org.telegram.ui.Components.qa0) drawable).p();
        }
        jh.l lVar = this.f44734g0;
        ri.a c10 = lVar.c(drawable);
        org.telegram.messenger.g0.B(lVar.a(c10));
        mb mbVar = this.f44735h0;
        mbVar.f47743a.f54485a = c10;
        lh.f fVar = mbVar.W;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ab.q qVar = ab.q.f988e;
        if (qVar != null && qVar.f989a) {
            r4 r4Var = (r4) ab.q.o().d;
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
        org.telegram.messenger.ij ijVar = MediaController.B().f21292u0;
        if (ijVar != null && ijVar.i4() && ijVar.T != 0) {
            long B0 = org.telegram.messenger.ij.B0(ijVar.f23244k);
            mb mbVar = this.f44735h0;
            if (B0 == (-mbVar.f47752f.f26953id)) {
                MediaController.B().p0(mbVar.V0(false), mbVar.f47751e0, mbVar.f47749d0, true);
            }
        }
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cb.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        mb mbVar = this.f44735h0;
        ri.a aVar = mbVar.f47743a.f54485a;
        if (aVar instanceof ri.b) {
            ((ri.b) aVar).b(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        kVar = ((org.telegram.ui.ActionBar.f2) mbVar).actionBar;
        measureChildWithMargins(kVar, i7, 0, i10, 0);
        kVar2 = ((org.telegram.ui.ActionBar.f2) mbVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        kVar3 = ((org.telegram.ui.ActionBar.f2) mbVar).actionBar;
        if (kVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar4 = ((org.telegram.ui.ActionBar.f2) mbVar).actionBar;
                if (childAt != kVar4) {
                    if (childAt != mbVar.f47772w && childAt != mbVar.f47760n) {
                        if (childAt == mbVar.H) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                        } else {
                            measureChildWithMargins(childAt, i7, 0, i10, 0);
                        }
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), View.MeasureSpec.getSize(i10)) + (mbVar.f47750e * 2), 1073741824));
                    }
                }
            }
        }
    }
}

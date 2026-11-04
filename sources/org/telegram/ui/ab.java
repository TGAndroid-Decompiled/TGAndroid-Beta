package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaController;
public final class ab extends ib {
    public final kh.l f43701h0;
    public final kb f43702i0;

    public ab(kb kbVar, Context context) {
        super(kbVar, context);
        this.f43702i0 = kbVar;
        this.f43701h0 = new kh.l();
    }

    @Override
    public final void T(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.la0) {
            ((org.telegram.ui.Components.la0) drawable).p();
        }
        kh.l lVar = this.f43701h0;
        si.a c2 = lVar.c(drawable);
        org.telegram.messenger.g0.B(lVar.a(c2));
        kb kbVar = this.f43702i0;
        kbVar.f46856a.f54761a = c2;
        mh.f fVar = kbVar.X;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        b4.n nVar = b4.n.f2376e;
        if (nVar != null && nVar.f2377a) {
            t4 t4Var = (t4) b4.n.p().d;
            if (t4Var != null) {
                t4Var.onTouchEvent(motionEvent);
                return true;
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.zi ziVar = MediaController.B().f21348v0;
        if (ziVar != null && ziVar.i4() && ziVar.T != 0) {
            long B0 = org.telegram.messenger.zi.B0(ziVar.f26868k);
            kb kbVar = this.f43702i0;
            if (B0 == (-kbVar.f46865f.f27001id)) {
                MediaController.B().p0(kbVar.V0(false), kbVar.f46866f0, kbVar.f46864e0, true);
            }
        }
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ab.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        kb kbVar = this.f43702i0;
        si.a aVar = kbVar.f46856a.f54761a;
        if (aVar instanceof si.b) {
            ((si.b) aVar).b(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        kVar = ((org.telegram.ui.ActionBar.d2) kbVar).actionBar;
        measureChildWithMargins(kVar, i3, 0, i10, 0);
        kVar2 = ((org.telegram.ui.ActionBar.d2) kbVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        kVar3 = ((org.telegram.ui.ActionBar.d2) kbVar).actionBar;
        if (kVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar4 = ((org.telegram.ui.ActionBar.d2) kbVar).actionBar;
                if (childAt != kVar4) {
                    if (childAt != kbVar.f46885w && childAt != kbVar.f46873n) {
                        if (childAt == kbVar.I) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                        } else {
                            measureChildWithMargins(childAt, i3, 0, i10, 0);
                        }
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), View.MeasureSpec.getSize(i10)) + (kbVar.f46863e * 2), 1073741824));
                    }
                }
            }
        }
    }
}

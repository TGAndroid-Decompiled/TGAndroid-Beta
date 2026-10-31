package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaController;
public final class hb extends qb {
    public final zg.i f37882g0;
    public final sb f37883h0;

    public hb(sb sbVar, Context context) {
        super(sbVar, context);
        this.f37883h0 = sbVar;
        this.f37882g0 = new zg.i();
    }

    @Override
    public final void T(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.jb0) {
            ((org.telegram.ui.Components.jb0) drawable).p();
        }
        zg.i iVar = this.f37882g0;
        hi.a c10 = iVar.c(drawable);
        org.telegram.messenger.i0.B(iVar.a(c10));
        sb sbVar = this.f37883h0;
        sbVar.f41425a.f7724a = c10;
        bh.i iVar2 = sbVar.W;
        if (iVar2 != null) {
            iVar2.invalidate();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ac.a aVar = ac.a.e;
        if (aVar != null && aVar.f362a) {
            r4 r4Var = (r4) ac.a.n().d;
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
        org.telegram.messenger.jj jjVar = MediaController.B().f14482u0;
        if (jjVar != null && jjVar.h4() && jjVar.T != 0) {
            long B0 = org.telegram.messenger.jj.B0(jjVar.f16337k);
            sb sbVar = this.f37883h0;
            if (B0 == (-sbVar.f41433f.f19793id)) {
                MediaController.B().p0(sbVar.U0(false), sbVar.f41432e0, sbVar.f41431d0, true);
            }
        }
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hb.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        sb sbVar = this.f37883h0;
        hi.a aVar = sbVar.f41425a.f7724a;
        if (aVar instanceof hi.b) {
            ((hi.b) aVar).b(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        lVar = ((org.telegram.ui.ActionBar.k2) sbVar).actionBar;
        measureChildWithMargins(lVar, i10, 0, i11, 0);
        lVar2 = ((org.telegram.ui.ActionBar.k2) sbVar).actionBar;
        int measuredHeight = lVar2.getMeasuredHeight();
        lVar3 = ((org.telegram.ui.ActionBar.k2) sbVar).actionBar;
        if (lVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                lVar4 = ((org.telegram.ui.ActionBar.k2) sbVar).actionBar;
                if (childAt != lVar4) {
                    if (childAt != sbVar.f41453w && childAt != sbVar.f41441n) {
                        if (childAt == sbVar.H) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                        } else {
                            measureChildWithMargins(childAt, i10, 0, i11, 0);
                        }
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.i0.L(10.0f), View.MeasureSpec.getSize(i11)) + (sbVar.e * 2), 1073741824));
                    }
                }
            }
        }
    }
}

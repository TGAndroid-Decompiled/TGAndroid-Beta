package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class zw extends qg.d {
    public boolean f35412g3;
    public final sz f35413h3;

    public zw(sz szVar, Context context) {
        super(context, null);
        this.f35413h3 = szVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f35413h3.f32750n2.g();
    }

    @Override
    public final void l0(int i10) {
        int i11;
        sz szVar = this.f35413h3;
        nz nzVar = szVar.f32789z0;
        if (szVar.C0 != null) {
            dx dxVar = szVar.B0;
            if (szVar.D0.canScrollVertically(-1)) {
                i11 = AndroidUtilities.getShadowHeight();
            } else {
                i11 = 0;
            }
            dxVar.setUnderlineHeight(i11);
        }
        if (nzVar != null && getAdapter() == nzVar && nzVar.d == 0 && !nzVar.O.a() && !nzVar.O.f30333w.f31099y) {
            if (szVar.E0.N0() + 50 > nzVar.h()) {
                lz lzVar = nzVar.O;
                Objects.requireNonNull(lzVar);
                AndroidUtilities.runOnUIThread(new yw(lzVar, 0));
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        sz szVar = this.f35413h3;
        if (!szVar.f32724f) {
            org.telegram.ui.ft o10 = org.telegram.ui.ft.o();
            zw zwVar = szVar.D0;
            szVar.getMeasuredHeight();
            boolean p10 = o10.p(motionEvent, zwVar, szVar.f32730g2, this.f30644n2);
            if (!super.onInterceptTouchEvent(motionEvent) && !p10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        sz szVar = this.f35413h3;
        if (szVar.I0 && szVar.f32786y0.h() > 0) {
            this.f35412g3 = true;
            szVar.E0.h1(0, 0);
            szVar.I0 = false;
            this.f35412g3 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        szVar.q(true);
    }

    @Override
    public final void requestLayout() {
        if (this.f35412g3) {
            return;
        }
        super.requestLayout();
    }
}

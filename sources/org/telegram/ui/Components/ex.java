package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class ex extends pg.d {
    public boolean W2;
    public final wz X2;

    public ex(wz wzVar, Context context) {
        super(context, null);
        this.X2 = wzVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.X2.f31044m2.h++;
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        bh.f fVar;
        wz wzVar = this.X2;
        rz rzVar = wzVar.f31087z0;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = wzVar.f31037j2) != null) {
            fVar.f(i10, i11);
        }
        if (wzVar.C0 != null) {
            ix ixVar = wzVar.B0;
            if (wzVar.D0.canScrollVertically(-1)) {
                i12 = AndroidUtilities.getShadowHeight();
            } else {
                i12 = 0;
            }
            ixVar.setUnderlineHeight(i12);
        }
        if (rzVar != null && getAdapter() == rzVar && rzVar.d == 0) {
            rz rzVar2 = rzVar.O.f28458w;
            if (!rzVar2.Q.G0.F && !rzVar2.f28971y) {
                if (wzVar.E0.N0() + 50 > rzVar.h()) {
                    pz pzVar = rzVar.O;
                    Objects.requireNonNull(pzVar);
                    AndroidUtilities.runOnUIThread(new dx(pzVar, 0));
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        wz wzVar = this.X2;
        if (!wzVar.f31022f) {
            org.telegram.ui.xt q6 = org.telegram.ui.xt.q();
            ex exVar = wzVar.D0;
            wzVar.getMeasuredHeight();
            boolean r10 = q6.r(motionEvent, exVar, wzVar.f31028g2, this.f27439n2);
            if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        wz wzVar = this.X2;
        if (wzVar.I0 && wzVar.f31084y0.h() > 0) {
            this.W2 = true;
            wzVar.E0.h1(0, 0);
            wzVar.I0 = false;
            this.W2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        wzVar.r(true);
    }

    @Override
    public final void requestLayout() {
        if (this.W2) {
            return;
        }
        super.requestLayout();
    }
}

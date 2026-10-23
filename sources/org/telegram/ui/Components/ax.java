package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class ax extends pg.d {
    public boolean Z2;
    public final tz f24863a3;

    public ax(tz tzVar, Context context) {
        super(context, null);
        this.f24863a3 = tzVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f24863a3.f31000n2.h++;
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        bh.f fVar;
        tz tzVar = this.f24863a3;
        oz ozVar = tzVar.f31039z0;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = tzVar.f30989j2) != null) {
            fVar.f(i10, i11);
        }
        if (tzVar.C0 != null) {
            ex exVar = tzVar.B0;
            if (tzVar.D0.canScrollVertically(-1)) {
                i12 = AndroidUtilities.getShadowHeight();
            } else {
                i12 = 0;
            }
            exVar.setUnderlineHeight(i12);
        }
        if (ozVar != null && getAdapter() == ozVar && ozVar.d == 0) {
            oz ozVar2 = ozVar.O.f28790w;
            if (!ozVar2.Q.G0.F && !ozVar2.f29367y) {
                if (tzVar.E0.N0() + 50 > ozVar.h()) {
                    mz mzVar = ozVar.O;
                    Objects.requireNonNull(mzVar);
                    AndroidUtilities.runOnUIThread(new zw(mzVar, 0));
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        tz tzVar = this.f24863a3;
        if (!tzVar.f30974f) {
            org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
            ax axVar = tzVar.D0;
            tzVar.getMeasuredHeight();
            boolean p5 = o10.p(motionEvent, axVar, tzVar.f30980g2, this.f28705n2);
            if (!super.onInterceptTouchEvent(motionEvent) && !p5) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        tz tzVar = this.f24863a3;
        if (tzVar.I0 && tzVar.f31036y0.h() > 0) {
            this.Z2 = true;
            tzVar.E0.h1(0, 0);
            tzVar.I0 = false;
            this.Z2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        tzVar.r(true);
    }

    @Override
    public final void requestLayout() {
        if (this.Z2) {
            return;
        }
        super.requestLayout();
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class ax extends pg.d {
    public boolean W2;
    public final tz X2;

    public ax(tz tzVar, Context context) {
        super(context, null);
        this.X2 = tzVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.X2.f30800m2.h++;
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        bh.f fVar;
        tz tzVar = this.X2;
        oz ozVar = tzVar.f30843z0;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = tzVar.f30793j2) != null) {
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
        if (ozVar != null && getAdapter() == ozVar && ozVar.d == 0 && !ozVar.O.a() && !ozVar.O.f28630w.f29122y) {
            if (tzVar.E0.N0() + 50 > ozVar.h()) {
                mz mzVar = ozVar.O;
                Objects.requireNonNull(mzVar);
                AndroidUtilities.runOnUIThread(new zw(mzVar, 0));
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        tz tzVar = this.X2;
        if (!tzVar.f30778f) {
            org.telegram.ui.et q6 = org.telegram.ui.et.q();
            ax axVar = tzVar.D0;
            tzVar.getMeasuredHeight();
            boolean r10 = q6.r(motionEvent, axVar, tzVar.f30784g2, this.f27301n2);
            if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        tz tzVar = this.X2;
        if (tzVar.I0 && tzVar.f30840y0.h() > 0) {
            this.W2 = true;
            tzVar.E0.h1(0, 0);
            tzVar.I0 = false;
            this.W2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        tzVar.q(true);
    }

    @Override
    public final void requestLayout() {
        if (this.W2) {
            return;
        }
        super.requestLayout();
    }
}

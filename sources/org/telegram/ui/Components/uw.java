package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class uw extends og.d {
    public boolean Y2;
    public final lz Z2;

    public uw(lz lzVar, Context context) {
        super(context, null);
        this.Z2 = lzVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.Z2.f26259m2.h++;
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        ah.h hVar;
        lz lzVar = this.Z2;
        gz gzVar = lzVar.f26302z0;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = lzVar.f26252j2) != null) {
            hVar.f(i10, i11);
        }
        if (lzVar.C0 != null) {
            yw ywVar = lzVar.B0;
            if (lzVar.D0.canScrollVertically(-1)) {
                i12 = AndroidUtilities.getShadowHeight();
            } else {
                i12 = 0;
            }
            ywVar.setUnderlineHeight(i12);
        }
        if (gzVar != null && getAdapter() == gzVar && gzVar.d == 0) {
            gz gzVar2 = gzVar.O.f24015w;
            if (!gzVar2.Q.G0.F && !gzVar2.f24570y) {
                if (lzVar.E0.N0() + 50 > gzVar.h()) {
                    ez ezVar = gzVar.O;
                    Objects.requireNonNull(ezVar);
                    AndroidUtilities.runOnUIThread(new tw(ezVar, 0));
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        lz lzVar = this.Z2;
        if (!lzVar.f26237f) {
            org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
            uw uwVar = lzVar.D0;
            lzVar.getMeasuredHeight();
            boolean r10 = q6.r(motionEvent, uwVar, lzVar.f26243g2, this.f30094p2);
            if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        lz lzVar = this.Z2;
        if (lzVar.I0 && lzVar.f26299y0.h() > 0) {
            this.Y2 = true;
            lzVar.E0.h1(0, 0);
            lzVar.I0 = false;
            this.Y2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        lzVar.q(true);
    }

    @Override
    public final void requestLayout() {
        if (this.Y2) {
            return;
        }
        super.requestLayout();
    }
}

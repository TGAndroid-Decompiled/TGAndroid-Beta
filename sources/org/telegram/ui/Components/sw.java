package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class sw extends og.d {
    public boolean Y2;
    public final kz Z2;

    public sw(kz kzVar, Context context) {
        super(context, null);
        this.Z2 = kzVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.Z2.f25743m2.f13674g++;
    }

    @Override
    public final void l0(int i10, int i11) {
        int i12;
        ah.i iVar;
        kz kzVar = this.Z2;
        fz fzVar = kzVar.f25786z0;
        if (Build.VERSION.SDK_INT >= 31 && (iVar = kzVar.f25736j2) != null) {
            iVar.f(i10, i11);
        }
        if (kzVar.C0 != null) {
            ww wwVar = kzVar.B0;
            if (kzVar.D0.canScrollVertically(-1)) {
                i12 = AndroidUtilities.getShadowHeight();
            } else {
                i12 = 0;
            }
            wwVar.setUnderlineHeight(i12);
        }
        if (fzVar != null && getAdapter() == fzVar && fzVar.d == 0) {
            fz fzVar2 = fzVar.O.f23412w;
            if (!fzVar2.Q.G0.F && !fzVar2.f24038y) {
                if (kzVar.E0.N0() + 50 > fzVar.h()) {
                    dz dzVar = fzVar.O;
                    Objects.requireNonNull(dzVar);
                    AndroidUtilities.runOnUIThread(new rw(dzVar, 0));
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        kz kzVar = this.Z2;
        if (!kzVar.f25721f) {
            org.telegram.ui.ut q6 = org.telegram.ui.ut.q();
            sw swVar = kzVar.D0;
            kzVar.getMeasuredHeight();
            boolean r10 = q6.r(motionEvent, swVar, kzVar.f25727g2, this.f26191p2);
            if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        kz kzVar = this.Z2;
        if (kzVar.I0 && kzVar.f25783y0.h() > 0) {
            this.Y2 = true;
            kzVar.E0.h1(0, 0);
            kzVar.I0 = false;
            this.Y2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        kzVar.q(true);
    }

    @Override
    public final void requestLayout() {
        if (this.Y2) {
            return;
        }
        super.requestLayout();
    }
}

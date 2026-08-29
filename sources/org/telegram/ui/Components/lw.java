package org.telegram.ui.Components;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class lw extends zf.d {
    public boolean U2;
    public final fz V2;

    public lw(fz fzVar, Context context) {
        super(context, null);
        this.V2 = fzVar;
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        lg.e eVar;
        fz fzVar = this.V2;
        az azVar = fzVar.f28642v0;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = fzVar.f28595f2) != null) {
            eVar.f(i10, i11);
            fzVar.C();
        }
        if (fzVar.f28654y0 != null) {
            pw pwVar = fzVar.f28650x0;
            if (fzVar.f28657z0.canScrollVertically(-1)) {
                i12 = AndroidUtilities.getShadowHeight();
            } else {
                i12 = 0;
            }
            pwVar.setUnderlineHeight(i12);
        }
        if (azVar != null && getAdapter() == azVar && azVar.d == 0) {
            az azVar2 = azVar.K.f35157w;
            if (!azVar2.M.C0.B && !azVar2.f26921y) {
                if (fzVar.A0.N0() + 50 > azVar.h()) {
                    yy yyVar = azVar.K;
                    Objects.requireNonNull(yyVar);
                    AndroidUtilities.runOnUIThread(new kw(yyVar, 0));
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        fz fzVar = this.V2;
        if (!fzVar.f28592f) {
            org.telegram.ui.ht q6 = org.telegram.ui.ht.q();
            lw lwVar = fzVar.f28657z0;
            fzVar.getMeasuredHeight();
            boolean r6 = q6.r(motionEvent, lwVar, fzVar.f28584c2, this.f29709l2);
            if (!super.onInterceptTouchEvent(motionEvent) && !r6) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        fz fzVar = this.V2;
        if (fzVar.E0 && fzVar.f28639u0.h() > 0) {
            this.U2 = true;
            fzVar.A0.h1(0, 0);
            fzVar.E0 = false;
            this.U2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        fzVar.q(true);
    }

    @Override
    public final void requestLayout() {
        if (this.U2) {
            return;
        }
        super.requestLayout();
    }
}

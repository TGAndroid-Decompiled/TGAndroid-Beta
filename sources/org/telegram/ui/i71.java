package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class i71 extends org.telegram.ui.Components.jl0 {
    public final int T2;
    public final Object U2;

    public i71(Object obj, Context context, int i10) {
        super(context, null);
        this.T2 = i10;
        this.U2 = obj;
    }

    @Override
    public boolean E0(float f9) {
        int i10;
        switch (this.T2) {
            case 2:
                org.telegram.ui.Components.ni niVar = ((sf.d0) this.U2).f28403b;
                int dp = AndroidUtilities.dp(30.0f) + niVar.X1[0];
                if (!niVar.f30994c0) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                if (f9 < dp + i10) {
                    return false;
                }
                return true;
            default:
                return super.E0(f9);
        }
    }

    @Override
    public Integer W0(int i10) {
        int i11;
        switch (this.T2) {
            case 0:
                i11 = ((SessionsActivity) this.U2).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.c6 c6Var = this.f29709l2;
                if (i10 == i11) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23279p7, c6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var));
            default:
                return super.W0(i10);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.T2) {
            case 1:
                org.telegram.ui.Components.gf gfVar = (org.telegram.ui.Components.gf) this.U2;
                i71 i71Var = gfVar.f46112c;
                if (i71Var.getLayoutManager() != null && i71Var.getAdapter() != null && i71Var.getAdapter().h() != 0) {
                    float dp = gfVar.h - AndroidUtilities.dp(8.0f);
                    gfVar.f46113e = dp - AndroidUtilities.dp(16.0f);
                    ng.d dVar = gfVar.f46116r;
                    if (dVar != null) {
                        dVar.draw(canvas);
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(12.0f), dp - AndroidUtilities.dp(4.0f), (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(12.0f), dp);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), gfVar.d);
                    super.dispatchDraw(canvas);
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void k0(int i10, int i11) {
        int i12 = this.T2;
    }

    public i71(sf.d0 d0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.T2 = 2;
        this.U2 = d0Var;
    }

    private final void w1(int i10, int i11) {
    }
}

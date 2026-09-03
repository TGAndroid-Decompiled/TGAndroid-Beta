package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class c81 extends org.telegram.ui.Components.sl0 {
    public final int U2;
    public final Object V2;

    public c81(Object obj, Context context, int i10) {
        super(context, null);
        this.U2 = i10;
        this.V2 = obj;
    }

    @Override
    public boolean E0(float f10) {
        int i10;
        switch (this.U2) {
            case 3:
                org.telegram.ui.Components.mi miVar = ((vf.c0) this.V2).f26590b;
                int dp = AndroidUtilities.dp(30.0f) + miVar.Y1[0];
                if (!miVar.f29061d0) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                if (f10 < dp + i10) {
                    return false;
                }
                return true;
            default:
                return super.E0(f10);
        }
    }

    @Override
    public Integer V0(int i10) {
        int i11;
        switch (this.U2) {
            case 0:
                i11 = ((SessionsActivity) this.V2).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.g6 g6Var = this.f31106m2;
                if (i10 == i11) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.k6.l1(0.1f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21878p7, g6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21752i6, g6Var));
            default:
                return super.V0(i10);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.U2) {
            case 2:
                org.telegram.ui.Components.df dfVar = (org.telegram.ui.Components.df) this.V2;
                c81 c81Var = dfVar.f47773c;
                if (c81Var.getLayoutManager() != null && c81Var.getAdapter() != null && c81Var.getAdapter().h() != 0) {
                    float dp = dfVar.h - AndroidUtilities.dp(8.0f);
                    dfVar.f47774e = dp - AndroidUtilities.dp(16.0f);
                    qg.b bVar = dfVar.f47777r;
                    if (bVar != null) {
                        bVar.draw(canvas);
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(12.0f), dp - AndroidUtilities.dp(4.0f), (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(12.0f), dp);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), dfVar.d);
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
        int i12 = this.U2;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.U2) {
            case 1:
                qt q10 = qt.q();
                qh.h1 h1Var = (qh.h1) this.V2;
                boolean r10 = q10.r(motionEvent, h1Var.f45383b, h1Var.f45386f, this.f31106m2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public c81(vf.c0 c0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.U2 = 3;
        this.V2 = c0Var;
    }

    private final void v1(int i10, int i11) {
    }
}

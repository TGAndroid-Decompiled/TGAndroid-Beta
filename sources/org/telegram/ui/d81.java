package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class d81 extends org.telegram.ui.Components.rl0 {
    public final int U2;
    public final Object V2;

    public d81(Object obj, Context context, int i10) {
        super(context, null);
        this.U2 = i10;
        this.V2 = obj;
    }

    @Override
    public boolean E0(float f10) {
        int i10;
        switch (this.U2) {
            case 3:
                org.telegram.ui.Components.li liVar = ((uf.c0) this.V2).f24282b;
                int dp = AndroidUtilities.dp(30.0f) + liVar.Y1[0];
                if (!liVar.f26688d0) {
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
                org.telegram.ui.ActionBar.f6 f6Var = this.f28511m2;
                if (i10 == i11) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20097p7, f6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19971i6, f6Var));
            default:
                return super.V0(i10);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.U2) {
            case 2:
                org.telegram.ui.Components.df dfVar = (org.telegram.ui.Components.df) this.V2;
                d81 d81Var = dfVar.f43873c;
                if (d81Var.getLayoutManager() != null && d81Var.getAdapter() != null && d81Var.getAdapter().h() != 0) {
                    float dp = dfVar.h - AndroidUtilities.dp(8.0f);
                    dfVar.e = dp - AndroidUtilities.dp(16.0f);
                    pg.b bVar = dfVar.f43876r;
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
                rt q10 = rt.q();
                ph.h1 h1Var = (ph.h1) this.V2;
                boolean r10 = q10.r(motionEvent, h1Var.f41735b, h1Var.f41737f, this.f28511m2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public d81(uf.c0 c0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.U2 = 3;
        this.V2 = c0Var;
    }

    private final void v1(int i10, int i11) {
    }
}

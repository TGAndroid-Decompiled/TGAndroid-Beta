package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

public final class a60 extends org.telegram.ui.Components.zk0 {
    public final int T2;
    public final NotificationCenter.NotificationCenterDelegate U2;

    public a60(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.T2 = i10;
        this.U2 = notificationCenterDelegate;
    }

    @Override
    public boolean E0(float f10) {
        switch (this.T2) {
            case 2:
                org.telegram.ui.Components.gi giVar = ((qf.e0) this.U2).f34900b;
                return f10 >= ((float) ((AndroidUtilities.dp(30.0f) + giVar.X1[0]) + (!giVar.f28639c0 ? AndroidUtilities.statusBarHeight : 0)));
            default:
                return super.E0(f10);
        }
    }

    @Override
    public Integer W0(int i10) {
        switch (this.T2) {
            case 1:
                int i11 = ((SessionsActivity) this.U2).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.c6 c6Var = this.f35277l2;
                return i10 == i11 ? Integer.valueOf(org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23269p7, c6Var))) : Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var));
            default:
                return super.W0(i10);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.T2) {
            case 0:
                super.dispatchDraw(canvas);
                c60 c60Var = (c60) this.U2;
                if (c60Var.f36972v0 != null && c60Var.f36973w0 >= 1.0f) {
                    canvas.save();
                    canvas.translate(0.0f, -(c60Var.f36972v0.getMeasuredHeight() - ((org.telegram.ui.ActionBar.n2) c60Var).actionBar.getMeasuredHeight()));
                    c60Var.f36972v0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public void k0(int i10, int i11) {
        int i12 = this.T2;
    }

    public a60(SessionsActivity sessionsActivity, Context context) {
        super(context, null);
        this.T2 = 1;
        this.U2 = sessionsActivity;
    }

    private final void w1(int i10, int i11) {
    }
}

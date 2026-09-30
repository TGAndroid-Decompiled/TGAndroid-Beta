package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;
public final class ac extends tk0 {
    public final int l1 = 0;
    public final Object f22609m1;

    public ac(org.telegram.ui.nt ntVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(4, i10, context, null, d6Var);
        this.f22609m1 = ntVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        rc rcVar;
        switch (this.l1) {
            case 0:
                cc ccVar = (cc) this.f22609m1;
                if (motionEvent.getAction() == 0) {
                    rc rcVar2 = ccVar.f23258n;
                    if (rcVar2 != null) {
                        rcVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (rcVar = ccVar.f23258n) != null) {
                    rcVar.i(true);
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void j() {
        switch (this.l1) {
            case 1:
                super.j();
                org.telegram.ui.nt ntVar = (org.telegram.ui.nt) this.f22609m1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = ntVar.f36134x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    ntVar.f36134x.flags |= 131072;
                }
                try {
                    ((WindowManager) ntVar.f36133w.getSystemService("window")).updateViewLayout(ntVar.f36135y, ntVar.f36134x);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                super.j();
                return;
        }
    }

    @Override
    public void m() {
        switch (this.l1) {
            case 0:
                rc rcVar = rc.f27939w;
                if (rcVar != null) {
                    rcVar.i(false);
                }
                ((cc) this.f22609m1).d.getReactionsWindow().f49355c.setOnClickListener(new f0(this, 5));
                return;
            default:
                return;
        }
    }

    public ac(cc ccVar, org.telegram.ui.ActionBar.m2 m2Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(3, i10, context, m2Var, d6Var);
        this.f22609m1 = ccVar;
    }
}

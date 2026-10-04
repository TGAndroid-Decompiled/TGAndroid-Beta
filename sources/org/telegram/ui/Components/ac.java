package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;
public final class ac extends sk0 {
    public final int l1 = 0;
    public final Object f24513m1;

    public ac(org.telegram.ui.rt rtVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(4, i10, context, null, d6Var);
        this.f24513m1 = rtVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        rc rcVar;
        switch (this.l1) {
            case 0:
                cc ccVar = (cc) this.f24513m1;
                if (motionEvent.getAction() == 0) {
                    rc rcVar2 = ccVar.f25314n;
                    if (rcVar2 != null) {
                        rcVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (rcVar = ccVar.f25314n) != null) {
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
                org.telegram.ui.rt rtVar = (org.telegram.ui.rt) this.f24513m1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = rtVar.f40282x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    rtVar.f40282x.flags |= 131072;
                }
                try {
                    ((WindowManager) rtVar.f40281w.getSystemService("window")).updateViewLayout(rtVar.f40283y, rtVar.f40282x);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
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
                rc rcVar = rc.f30330w;
                if (rcVar != null) {
                    rcVar.i(false);
                }
                ((cc) this.f24513m1).d.getReactionsWindow().f53318c.setOnClickListener(new f0(this, 5));
                return;
            default:
                return;
        }
    }

    public ac(cc ccVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(3, i10, context, n2Var, d6Var);
        this.f24513m1 = ccVar;
    }
}

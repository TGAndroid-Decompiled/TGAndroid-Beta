package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;
public final class cc extends ll0 {
    public final int l1 = 0;
    public final Object f25266m1;

    public cc(org.telegram.ui.rt rtVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(4, i10, context, null, e6Var);
        this.f25266m1 = rtVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        tc tcVar;
        switch (this.l1) {
            case 0:
                ec ecVar = (ec) this.f25266m1;
                if (motionEvent.getAction() == 0) {
                    tc tcVar2 = ecVar.f26006n;
                    if (tcVar2 != null) {
                        tcVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (tcVar = ecVar.f26006n) != null) {
                    tcVar.i(true);
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
                org.telegram.ui.rt rtVar = (org.telegram.ui.rt) this.f25266m1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = rtVar.f41553x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    rtVar.f41553x.flags |= 131072;
                }
                try {
                    ((WindowManager) rtVar.f41552w.getSystemService("window")).updateViewLayout(rtVar.f41554y, rtVar.f41553x);
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
                tc tcVar = tc.f31088w;
                if (tcVar != null) {
                    tcVar.i(false);
                }
                ((ec) this.f25266m1).d.getReactionsWindow().f54495c.setOnClickListener(new f0(this, 4));
                return;
            default:
                return;
        }
    }

    public cc(ec ecVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(3, i10, context, n2Var, e6Var);
        this.f25266m1 = ecVar;
    }
}

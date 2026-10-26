package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;
public final class zb extends fl0 {
    public final int f35287m1 = 0;
    public final Object f35288n1;

    public zb(org.telegram.ui.ft ftVar, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(4, i10, context, null, u6Var);
        this.f35288n1 = ftVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qc qcVar;
        switch (this.f35287m1) {
            case 0:
                bc bcVar = (bc) this.f35288n1;
                if (motionEvent.getAction() == 0) {
                    qc qcVar2 = bcVar.f26821n;
                    if (qcVar2 != null) {
                        qcVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (qcVar = bcVar.f26821n) != null) {
                    qcVar.i(true);
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void j() {
        switch (this.f35287m1) {
            case 1:
                super.j();
                org.telegram.ui.ft ftVar = (org.telegram.ui.ft) this.f35288n1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = ftVar.f39470x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    ftVar.f39470x.flags |= 131072;
                }
                try {
                    ((WindowManager) ftVar.f39469w.getSystemService("window")).updateViewLayout(ftVar.f39471y, ftVar.f39470x);
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
        switch (this.f35287m1) {
            case 0:
                qc qcVar = qc.f31882x;
                if (qcVar != null) {
                    qcVar.i(false);
                }
                ((bc) this.f35288n1).d.getReactionsWindow().f4049c.setOnClickListener(new f0(this, 4));
                return;
            default:
                return;
        }
    }

    public zb(bc bcVar, org.telegram.ui.ActionBar.r2 r2Var, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(3, i10, context, r2Var, u6Var);
        this.f35288n1 = bcVar;
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;
public final class zb extends gl0 {
    public final int f35309m1 = 0;
    public final Object f35310n1;

    public zb(org.telegram.ui.ht htVar, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(4, i10, context, null, u6Var);
        this.f35310n1 = htVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qc qcVar;
        switch (this.f35309m1) {
            case 0:
                bc bcVar = (bc) this.f35310n1;
                if (motionEvent.getAction() == 0) {
                    qc qcVar2 = bcVar.f26801n;
                    if (qcVar2 != null) {
                        qcVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (qcVar = bcVar.f26801n) != null) {
                    qcVar.i(true);
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void j() {
        switch (this.f35309m1) {
            case 1:
                super.j();
                org.telegram.ui.ht htVar = (org.telegram.ui.ht) this.f35310n1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = htVar.f39985x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    htVar.f39985x.flags |= 131072;
                }
                try {
                    ((WindowManager) htVar.f39984w.getSystemService("window")).updateViewLayout(htVar.f39986y, htVar.f39985x);
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
        switch (this.f35309m1) {
            case 0:
                qc qcVar = qc.f31854x;
                if (qcVar != null) {
                    qcVar.i(false);
                }
                ((bc) this.f35310n1).d.getReactionsWindow().f4049c.setOnClickListener(new f0(this, 4));
                return;
            default:
                return;
        }
    }

    public zb(bc bcVar, org.telegram.ui.ActionBar.r2 r2Var, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(3, i10, context, r2Var, u6Var);
        this.f35310n1 = bcVar;
    }
}

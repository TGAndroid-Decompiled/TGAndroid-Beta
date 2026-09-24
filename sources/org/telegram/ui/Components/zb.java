package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;
public final class zb extends qk0 {
    public final int l1 = 0;
    public final Object f30823m1;

    public zb(org.telegram.ui.nt ntVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(4, i10, context, null, d6Var);
        this.f30823m1 = ntVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qc qcVar;
        switch (this.l1) {
            case 0:
                bc bcVar = (bc) this.f30823m1;
                if (motionEvent.getAction() == 0) {
                    qc qcVar2 = bcVar.f22966n;
                    if (qcVar2 != null) {
                        qcVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (qcVar = bcVar.f22966n) != null) {
                    qcVar.i(true);
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
                org.telegram.ui.nt ntVar = (org.telegram.ui.nt) this.f30823m1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = ntVar.f35972x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    ntVar.f35972x.flags |= 131072;
                }
                try {
                    ((WindowManager) ntVar.f35971w.getSystemService("window")).updateViewLayout(ntVar.f35973y, ntVar.f35972x);
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
                qc qcVar = qc.f27564w;
                if (qcVar != null) {
                    qcVar.i(false);
                }
                ((bc) this.f30823m1).d.getReactionsWindow().f49236c.setOnClickListener(new f0(this, 5));
                return;
            default:
                return;
        }
    }

    public zb(bc bcVar, org.telegram.ui.ActionBar.m2 m2Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(3, i10, context, m2Var, d6Var);
        this.f30823m1 = bcVar;
    }
}

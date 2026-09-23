package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;
public final class zb extends gk0 {
    public final int l1 = 0;
    public final Object f30555m1;

    public zb(org.telegram.ui.pt ptVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(4, i10, context, null, d6Var);
        this.f30555m1 = ptVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qc qcVar;
        switch (this.l1) {
            case 0:
                bc bcVar = (bc) this.f30555m1;
                if (motionEvent.getAction() == 0) {
                    qc qcVar2 = bcVar.f22672n;
                    if (qcVar2 != null) {
                        qcVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (qcVar = bcVar.f22672n) != null) {
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
                org.telegram.ui.pt ptVar = (org.telegram.ui.pt) this.f30555m1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = ptVar.f36204x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    ptVar.f36204x.flags |= 131072;
                }
                try {
                    ((WindowManager) ptVar.f36203w.getSystemService("window")).updateViewLayout(ptVar.f36205y, ptVar.f36204x);
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
                qc qcVar = qc.f27299w;
                if (qcVar != null) {
                    qcVar.i(false);
                }
                ((bc) this.f30555m1).d.getReactionsWindow().f48929c.setOnClickListener(new f0(this, 5));
                return;
            default:
                return;
        }
    }

    public zb(bc bcVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(3, i10, context, n2Var, d6Var);
        this.f30555m1 = bcVar;
    }
}

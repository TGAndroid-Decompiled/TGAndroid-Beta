package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;
public final class zb extends sk0 {
    public final int l1 = 0;
    public final Object f30893m1;

    public zb(org.telegram.ui.qt qtVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(4, i10, context, null, e6Var);
        this.f30893m1 = qtVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qc qcVar;
        switch (this.l1) {
            case 0:
                bc bcVar = (bc) this.f30893m1;
                if (motionEvent.getAction() == 0) {
                    qc qcVar2 = bcVar.f22974n;
                    if (qcVar2 != null) {
                        qcVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (qcVar = bcVar.f22974n) != null) {
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
                org.telegram.ui.qt qtVar = (org.telegram.ui.qt) this.f30893m1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = qtVar.f36907x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    qtVar.f36907x.flags |= 131072;
                }
                try {
                    ((WindowManager) qtVar.f36906w.getSystemService("window")).updateViewLayout(qtVar.f36908y, qtVar.f36907x);
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
                qc qcVar = qc.f27684w;
                if (qcVar != null) {
                    qcVar.i(false);
                }
                ((bc) this.f30893m1).d.getReactionsWindow().f49301c.setOnClickListener(new f0(this, 5));
                return;
            default:
                return;
        }
    }

    public zb(bc bcVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(3, i10, context, o2Var, e6Var);
        this.f30893m1 = bcVar;
    }
}

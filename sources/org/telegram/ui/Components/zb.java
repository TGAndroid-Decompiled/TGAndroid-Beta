package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;
public final class zb extends gl0 {
    public final int f33200m1 = 0;
    public final Object f33201n1;

    public zb(org.telegram.ui.ht htVar, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(4, i10, context, null, g6Var);
        this.f33201n1 = htVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qc qcVar;
        switch (this.f33200m1) {
            case 0:
                bc bcVar = (bc) this.f33201n1;
                if (motionEvent.getAction() == 0) {
                    qc qcVar2 = bcVar.f25036n;
                    if (qcVar2 != null) {
                        qcVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (qcVar = bcVar.f25036n) != null) {
                    qcVar.i(true);
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void j() {
        switch (this.f33200m1) {
            case 1:
                super.j();
                org.telegram.ui.ht htVar = (org.telegram.ui.ht) this.f33201n1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = htVar.f37956x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    htVar.f37956x.flags |= 131072;
                }
                try {
                    ((WindowManager) htVar.f37955w.getSystemService("window")).updateViewLayout(htVar.f37957y, htVar.f37956x);
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
        switch (this.f33200m1) {
            case 0:
                qc qcVar = qc.f29825w;
                if (qcVar != null) {
                    qcVar.i(false);
                }
                ((bc) this.f33201n1).d.getReactionsWindow().f871c.setOnClickListener(new f0(this, 4));
                return;
            default:
                return;
        }
    }

    public zb(bc bcVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(3, i10, context, o2Var, g6Var);
        this.f33201n1 = bcVar;
    }
}

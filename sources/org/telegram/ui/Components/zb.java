package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;
public final class zb extends fk0 {
    public final int l1 = 0;
    public final Object f33117m1;

    public zb(org.telegram.ui.st stVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(4, i10, context, null, f6Var);
        this.f33117m1 = stVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qc qcVar;
        switch (this.l1) {
            case 0:
                bc bcVar = (bc) this.f33117m1;
                if (motionEvent.getAction() == 0) {
                    qc qcVar2 = bcVar.f24659n;
                    if (qcVar2 != null) {
                        qcVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (qcVar = bcVar.f24659n) != null) {
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
                org.telegram.ui.st stVar = (org.telegram.ui.st) this.f33117m1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = stVar.f40549x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    stVar.f40549x.flags |= 131072;
                }
                try {
                    ((WindowManager) stVar.f40548w.getSystemService("window")).updateViewLayout(stVar.f40550y, stVar.f40549x);
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
                qc qcVar = qc.f29671w;
                if (qcVar != null) {
                    qcVar.i(false);
                }
                ((bc) this.f33117m1).d.getReactionsWindow().f687c.setOnClickListener(new g0(this, 5));
                return;
            default:
                return;
        }
    }

    public zb(bc bcVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(3, i10, context, n2Var, f6Var);
        this.f33117m1 = bcVar;
    }
}

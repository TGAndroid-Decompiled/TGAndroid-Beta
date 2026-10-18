package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;
public final class zb extends cl0 {
    public final int l1 = 0;
    public final Object f32882m1;

    public zb(org.telegram.ui.gt gtVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(4, i10, context, null, d6Var);
        this.f32882m1 = gtVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qc qcVar;
        switch (this.l1) {
            case 0:
                bc bcVar = (bc) this.f32882m1;
                if (motionEvent.getAction() == 0) {
                    qc qcVar2 = bcVar.f24929n;
                    if (qcVar2 != null) {
                        qcVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (qcVar = bcVar.f24929n) != null) {
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
                org.telegram.ui.gt gtVar = (org.telegram.ui.gt) this.f32882m1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = gtVar.f37352x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    gtVar.f37352x.flags |= 131072;
                }
                try {
                    ((WindowManager) gtVar.f37351w.getSystemService("window")).updateViewLayout(gtVar.f37353y, gtVar.f37352x);
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
                qc qcVar = qc.f29638w;
                if (qcVar != null) {
                    qcVar.i(false);
                }
                ((bc) this.f32882m1).d.getReactionsWindow().f872c.setOnClickListener(new f0(this, 4));
                return;
            default:
                return;
        }
    }

    public zb(bc bcVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(3, i10, context, n2Var, d6Var);
        this.f32882m1 = bcVar;
    }
}

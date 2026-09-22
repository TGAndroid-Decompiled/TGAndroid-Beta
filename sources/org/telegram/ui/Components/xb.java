package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;
public final class xb extends fk0 {
    public final int l1 = 0;
    public final Object f29912m1;

    public xb(org.telegram.ui.st stVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(4, i10, context, null, e6Var);
        this.f29912m1 = stVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        oc ocVar;
        switch (this.l1) {
            case 0:
                zb zbVar = (zb) this.f29912m1;
                if (motionEvent.getAction() == 0) {
                    oc ocVar2 = zbVar.f30535n;
                    if (ocVar2 != null) {
                        ocVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (ocVar = zbVar.f30535n) != null) {
                    ocVar.i(true);
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
                org.telegram.ui.st stVar = (org.telegram.ui.st) this.f29912m1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = stVar.f37484x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    stVar.f37484x.flags |= 131072;
                }
                try {
                    ((WindowManager) stVar.f37483w.getSystemService("window")).updateViewLayout(stVar.f37485y, stVar.f37484x);
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
                oc ocVar = oc.f26744w;
                if (ocVar != null) {
                    ocVar.i(false);
                }
                ((zb) this.f29912m1).d.getReactionsWindow().f48978c.setOnClickListener(new f0(this, 5));
                return;
            default:
                return;
        }
    }

    public xb(zb zbVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(3, i10, context, n2Var, e6Var);
        this.f29912m1 = zbVar;
    }
}

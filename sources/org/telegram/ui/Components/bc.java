package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;
public final class bc extends gl0 {
    public final int l1 = 0;
    public final Object f23430m1;

    public bc(org.telegram.ui.xt xtVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(4, i10, context, null, c6Var);
        this.f23430m1 = xtVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        sc scVar;
        switch (this.l1) {
            case 0:
                dc dcVar = (dc) this.f23430m1;
                if (motionEvent.getAction() == 0) {
                    sc scVar2 = dcVar.f24077n;
                    if (scVar2 != null) {
                        scVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (scVar = dcVar.f24077n) != null) {
                    scVar.i(true);
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
                org.telegram.ui.xt xtVar = (org.telegram.ui.xt) this.f23430m1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = xtVar.f41658x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    xtVar.f41658x.flags |= 131072;
                }
                try {
                    ((WindowManager) xtVar.f41657w.getSystemService("window")).updateViewLayout(xtVar.f41659y, xtVar.f41658x);
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
                sc scVar = sc.f28798w;
                if (scVar != null) {
                    scVar.i(false);
                }
                ((dc) this.f23430m1).d.getReactionsWindow().f870c.setOnClickListener(new f0(this, 4));
                return;
            default:
                return;
        }
    }

    public bc(dc dcVar, org.telegram.ui.ActionBar.m2 m2Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(3, i10, context, m2Var, c6Var);
        this.f23430m1 = dcVar;
    }
}

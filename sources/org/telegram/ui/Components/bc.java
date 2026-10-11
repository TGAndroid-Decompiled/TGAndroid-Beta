package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;
public final class bc extends ll0 {
    public final int l1 = 0;
    public final Object f24972m1;

    public bc(org.telegram.ui.qt qtVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(4, i10, context, null, d6Var);
        this.f24972m1 = qtVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        sc scVar;
        switch (this.l1) {
            case 0:
                dc dcVar = (dc) this.f24972m1;
                if (motionEvent.getAction() == 0) {
                    sc scVar2 = dcVar.f25757n;
                    if (scVar2 != null) {
                        scVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (scVar = dcVar.f25757n) != null) {
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
                org.telegram.ui.qt qtVar = (org.telegram.ui.qt) this.f24972m1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = qtVar.f41289x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    qtVar.f41289x.flags |= 131072;
                }
                try {
                    ((WindowManager) qtVar.f41288w.getSystemService("window")).updateViewLayout(qtVar.f41290y, qtVar.f41289x);
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
                sc scVar = sc.f30825w;
                if (scVar != null) {
                    scVar.i(false);
                }
                ((dc) this.f24972m1).d.getReactionsWindow().f54572c.setOnClickListener(new f0(this, 4));
                return;
            default:
                return;
        }
    }

    public bc(dc dcVar, org.telegram.ui.ActionBar.m2 m2Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(3, i10, context, m2Var, d6Var);
        this.f24972m1 = dcVar;
    }
}

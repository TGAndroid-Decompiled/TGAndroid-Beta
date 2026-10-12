package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.messenger.FileLog;
public final class bc extends nl0 {
    public final int l1 = 0;
    public final Object f24601m1;

    public bc(org.telegram.ui.ut utVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(4, i10, context, null, c6Var);
        this.f24601m1 = utVar;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        sc scVar;
        switch (this.l1) {
            case 0:
                dc dcVar = (dc) this.f24601m1;
                if (motionEvent.getAction() == 0) {
                    sc scVar2 = dcVar.f25298n;
                    if (scVar2 != null) {
                        scVar2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (scVar = dcVar.f25298n) != null) {
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
                org.telegram.ui.ut utVar = (org.telegram.ui.ut) this.f24601m1;
                if (getReactionsWindow() != null) {
                    WindowManager.LayoutParams layoutParams = utVar.f42591x;
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    utVar.f42591x.flags |= 131072;
                }
                try {
                    ((WindowManager) utVar.f42590w.getSystemService("window")).updateViewLayout(utVar.f42592y, utVar.f42591x);
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
                sc scVar = sc.f30528w;
                if (scVar != null) {
                    scVar.i(false);
                }
                ((dc) this.f24601m1).d.getReactionsWindow().f54683c.setOnClickListener(new f0(this, 4));
                return;
            default:
                return;
        }
    }

    public bc(dc dcVar, org.telegram.ui.ActionBar.m2 m2Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(3, i10, context, m2Var, c6Var);
        this.f24601m1 = dcVar;
    }
}

package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class db implements Runnable {
    public final int f25524a;
    public final qc f25525b;

    public db(qc qcVar, int i10) {
        this.f25524a = i10;
        this.f25525b = qcVar;
    }

    @Override
    public final void run() {
        switch (this.f25524a) {
            case 0:
                this.f25525b.b();
                return;
            case 1:
                qc qcVar = this.f25525b;
                FrameLayout frameLayout = qcVar.h;
                ub ubVar = qcVar.e;
                ob obVar = qcVar.f29600p;
                if (obVar != null && !ubVar.top) {
                    obVar.c(0.0f);
                    qcVar.f29600p.d(qcVar);
                }
                ubVar.transitionRunningExit = false;
                ubVar.onExitTransitionEnd();
                ubVar.onHide();
                frameLayout.removeView(qcVar.f29591f);
                frameLayout.removeOnLayoutChangeListener(qcVar.f29590c);
                ubVar.onDetach();
                Runnable runnable = qcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                qc qcVar2 = this.f25525b;
                FrameLayout frameLayout2 = qcVar2.h;
                frameLayout2.removeView(qcVar2.f29591f);
                frameLayout2.removeOnLayoutChangeListener(qcVar2.f29590c);
                return;
        }
    }
}

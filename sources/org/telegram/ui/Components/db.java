package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class db implements Runnable {
    public final int f25336a;
    public final qc f25337b;

    public db(qc qcVar, int i10) {
        this.f25336a = i10;
        this.f25337b = qcVar;
    }

    @Override
    public final void run() {
        switch (this.f25336a) {
            case 0:
                this.f25337b.b();
                return;
            case 1:
                qc qcVar = this.f25337b;
                FrameLayout frameLayout = qcVar.h;
                ub ubVar = qcVar.f29676e;
                ob obVar = qcVar.f29686p;
                if (obVar != null && !ubVar.top) {
                    obVar.c(0.0f);
                    qcVar.f29686p.d(qcVar);
                }
                ubVar.transitionRunningExit = false;
                ubVar.onExitTransitionEnd();
                ubVar.onHide();
                frameLayout.removeView(qcVar.f29677f);
                frameLayout.removeOnLayoutChangeListener(qcVar.f29675c);
                ubVar.onDetach();
                Runnable runnable = qcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                qc qcVar2 = this.f25337b;
                FrameLayout frameLayout2 = qcVar2.h;
                frameLayout2.removeView(qcVar2.f29677f);
                frameLayout2.removeOnLayoutChangeListener(qcVar2.f29675c);
                return;
        }
    }
}

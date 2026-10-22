package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class db implements Runnable {
    public final int f25437a;
    public final qc f25438b;

    public db(qc qcVar, int i10) {
        this.f25437a = i10;
        this.f25438b = qcVar;
    }

    @Override
    public final void run() {
        switch (this.f25437a) {
            case 0:
                this.f25438b.b();
                return;
            case 1:
                qc qcVar = this.f25438b;
                FrameLayout frameLayout = qcVar.h;
                ub ubVar = qcVar.e;
                ob obVar = qcVar.f29540p;
                if (obVar != null && !ubVar.top) {
                    obVar.c(0.0f);
                    qcVar.f29540p.d(qcVar);
                }
                ubVar.transitionRunningExit = false;
                ubVar.onExitTransitionEnd();
                ubVar.onHide();
                frameLayout.removeView(qcVar.f29531f);
                frameLayout.removeOnLayoutChangeListener(qcVar.f29530c);
                ubVar.onDetach();
                Runnable runnable = qcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                qc qcVar2 = this.f25438b;
                FrameLayout frameLayout2 = qcVar2.h;
                frameLayout2.removeView(qcVar2.f29531f);
                frameLayout2.removeOnLayoutChangeListener(qcVar2.f29530c);
                return;
        }
    }
}

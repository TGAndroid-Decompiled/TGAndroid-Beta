package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class db implements Runnable {
    public final int f23615a;
    public final qc f23616b;

    public db(qc qcVar, int i10) {
        this.f23615a = i10;
        this.f23616b = qcVar;
    }

    @Override
    public final void run() {
        switch (this.f23615a) {
            case 0:
                this.f23616b.b();
                return;
            case 1:
                qc qcVar = this.f23616b;
                FrameLayout frameLayout = qcVar.h;
                ub ubVar = qcVar.e;
                ob obVar = qcVar.f27647p;
                if (obVar != null && !ubVar.top) {
                    obVar.c(0.0f);
                    qcVar.f27647p.d(qcVar);
                }
                ubVar.transitionRunningExit = false;
                ubVar.onExitTransitionEnd();
                ubVar.onHide();
                frameLayout.removeView(qcVar.f27638f);
                frameLayout.removeOnLayoutChangeListener(qcVar.f27637c);
                ubVar.onDetach();
                Runnable runnable = qcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                qc qcVar2 = this.f23616b;
                FrameLayout frameLayout2 = qcVar2.h;
                frameLayout2.removeView(qcVar2.f27638f);
                frameLayout2.removeOnLayoutChangeListener(qcVar2.f27637c);
                return;
        }
    }
}

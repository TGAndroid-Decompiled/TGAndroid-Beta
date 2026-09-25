package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class db implements Runnable {
    public final int f23580a;
    public final qc f23581b;

    public db(qc qcVar, int i10) {
        this.f23580a = i10;
        this.f23581b = qcVar;
    }

    @Override
    public final void run() {
        switch (this.f23580a) {
            case 0:
                this.f23581b.b();
                return;
            case 1:
                qc qcVar = this.f23581b;
                FrameLayout frameLayout = qcVar.h;
                ub ubVar = qcVar.e;
                ob obVar = qcVar.f27584p;
                if (obVar != null && !ubVar.top) {
                    obVar.c(0.0f);
                    qcVar.f27584p.d(qcVar);
                }
                ubVar.transitionRunningExit = false;
                ubVar.onExitTransitionEnd();
                ubVar.onHide();
                frameLayout.removeView(qcVar.f27575f);
                frameLayout.removeOnLayoutChangeListener(qcVar.f27574c);
                ubVar.onDetach();
                Runnable runnable = qcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                qc qcVar2 = this.f23581b;
                FrameLayout frameLayout2 = qcVar2.h;
                frameLayout2.removeView(qcVar2.f27575f);
                frameLayout2.removeOnLayoutChangeListener(qcVar2.f27574c);
                return;
        }
    }
}

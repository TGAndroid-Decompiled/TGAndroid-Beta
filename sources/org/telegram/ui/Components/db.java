package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class db implements Runnable {
    public final int f23364a;
    public final qc f23365b;

    public db(qc qcVar, int i10) {
        this.f23364a = i10;
        this.f23365b = qcVar;
    }

    @Override
    public final void run() {
        switch (this.f23364a) {
            case 0:
                this.f23365b.b();
                return;
            case 1:
                qc qcVar = this.f23365b;
                FrameLayout frameLayout = qcVar.h;
                ub ubVar = qcVar.e;
                ob obVar = qcVar.f27312p;
                if (obVar != null && !ubVar.top) {
                    obVar.c(0.0f);
                    qcVar.f27312p.d(qcVar);
                }
                ubVar.transitionRunningExit = false;
                ubVar.onExitTransitionEnd();
                ubVar.onHide();
                frameLayout.removeView(qcVar.f27303f);
                frameLayout.removeOnLayoutChangeListener(qcVar.f27302c);
                ubVar.onDetach();
                Runnable runnable = qcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                qc qcVar2 = this.f23365b;
                FrameLayout frameLayout2 = qcVar2.h;
                frameLayout2.removeView(qcVar2.f27303f);
                frameLayout2.removeOnLayoutChangeListener(qcVar2.f27302c);
                return;
        }
    }
}

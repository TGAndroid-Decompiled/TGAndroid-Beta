package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class db implements Runnable {
    public final int f27485a;
    public final qc f27486b;

    public db(qc qcVar, int i10) {
        this.f27485a = i10;
        this.f27486b = qcVar;
    }

    @Override
    public final void run() {
        switch (this.f27485a) {
            case 0:
                this.f27486b.b();
                return;
            case 1:
                qc qcVar = this.f27486b;
                FrameLayout frameLayout = qcVar.h;
                ub ubVar = qcVar.e;
                ob obVar = qcVar.f31896q;
                if (obVar != null && !ubVar.top) {
                    obVar.c(0.0f);
                    qcVar.f31896q.d(qcVar);
                }
                ubVar.transitionRunningExit = false;
                ubVar.onExitTransitionEnd();
                ubVar.onHide();
                frameLayout.removeView(qcVar.f31886f);
                frameLayout.removeOnLayoutChangeListener(qcVar.f31885c);
                ubVar.onDetach();
                Runnable runnable = qcVar.f31901w;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                qc qcVar2 = this.f27486b;
                FrameLayout frameLayout2 = qcVar2.h;
                frameLayout2.removeView(qcVar2.f31886f);
                frameLayout2.removeOnLayoutChangeListener(qcVar2.f31885c);
                return;
        }
    }
}

package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class db implements Runnable {
    public final int f27388a;
    public final qc f27389b;

    public db(qc qcVar, int i10) {
        this.f27388a = i10;
        this.f27389b = qcVar;
    }

    @Override
    public final void run() {
        switch (this.f27388a) {
            case 0:
                this.f27389b.b();
                return;
            case 1:
                qc qcVar = this.f27389b;
                FrameLayout frameLayout = qcVar.h;
                ub ubVar = qcVar.e;
                ob obVar = qcVar.f31868q;
                if (obVar != null && !ubVar.top) {
                    obVar.c(0.0f);
                    qcVar.f31868q.d(qcVar);
                }
                ubVar.transitionRunningExit = false;
                ubVar.onExitTransitionEnd();
                ubVar.onHide();
                frameLayout.removeView(qcVar.f31858f);
                frameLayout.removeOnLayoutChangeListener(qcVar.f31857c);
                ubVar.onDetach();
                Runnable runnable = qcVar.f31873w;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                qc qcVar2 = this.f27389b;
                FrameLayout frameLayout2 = qcVar2.h;
                frameLayout2.removeView(qcVar2.f31858f);
                frameLayout2.removeOnLayoutChangeListener(qcVar2.f31857c);
                return;
        }
    }
}

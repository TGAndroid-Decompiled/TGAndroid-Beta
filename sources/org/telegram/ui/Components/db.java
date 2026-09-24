package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class db implements Runnable {
    public final int f23571a;
    public final qc f23572b;

    public db(qc qcVar, int i10) {
        this.f23571a = i10;
        this.f23572b = qcVar;
    }

    @Override
    public final void run() {
        switch (this.f23571a) {
            case 0:
                this.f23572b.b();
                return;
            case 1:
                qc qcVar = this.f23572b;
                FrameLayout frameLayout = qcVar.h;
                ub ubVar = qcVar.e;
                ob obVar = qcVar.f27577p;
                if (obVar != null && !ubVar.top) {
                    obVar.c(0.0f);
                    qcVar.f27577p.d(qcVar);
                }
                ubVar.transitionRunningExit = false;
                ubVar.onExitTransitionEnd();
                ubVar.onHide();
                frameLayout.removeView(qcVar.f27568f);
                frameLayout.removeOnLayoutChangeListener(qcVar.f27567c);
                ubVar.onDetach();
                Runnable runnable = qcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                qc qcVar2 = this.f23572b;
                FrameLayout frameLayout2 = qcVar2.h;
                frameLayout2.removeView(qcVar2.f27568f);
                frameLayout2.removeOnLayoutChangeListener(qcVar2.f27567c);
                return;
        }
    }
}

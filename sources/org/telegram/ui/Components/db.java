package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class db implements Runnable {
    public final int f23509a;
    public final qc f23510b;

    public db(qc qcVar, int i10) {
        this.f23509a = i10;
        this.f23510b = qcVar;
    }

    @Override
    public final void run() {
        switch (this.f23509a) {
            case 0:
                this.f23510b.b();
                return;
            case 1:
                qc qcVar = this.f23510b;
                FrameLayout frameLayout = qcVar.h;
                ub ubVar = qcVar.e;
                ob obVar = qcVar.f27556p;
                if (obVar != null && !ubVar.top) {
                    obVar.c(0.0f);
                    qcVar.f27556p.d(qcVar);
                }
                ubVar.transitionRunningExit = false;
                ubVar.onExitTransitionEnd();
                ubVar.onHide();
                frameLayout.removeView(qcVar.f27547f);
                frameLayout.removeOnLayoutChangeListener(qcVar.f27546c);
                ubVar.onDetach();
                Runnable runnable = qcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                qc qcVar2 = this.f23510b;
                FrameLayout frameLayout2 = qcVar2.h;
                frameLayout2.removeView(qcVar2.f27547f);
                frameLayout2.removeOnLayoutChangeListener(qcVar2.f27546c);
                return;
        }
    }
}

package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class db implements Runnable {
    public final int f25585a;
    public final qc f25586b;

    public db(qc qcVar, int i10) {
        this.f25585a = i10;
        this.f25586b = qcVar;
    }

    @Override
    public final void run() {
        switch (this.f25585a) {
            case 0:
                this.f25586b.b();
                return;
            case 1:
                qc qcVar = this.f25586b;
                FrameLayout frameLayout = qcVar.h;
                ub ubVar = qcVar.e;
                ob obVar = qcVar.f29838p;
                if (obVar != null && !ubVar.top) {
                    obVar.c(0.0f);
                    qcVar.f29838p.d(qcVar);
                }
                ubVar.transitionRunningExit = false;
                ubVar.onExitTransitionEnd();
                ubVar.onHide();
                frameLayout.removeView(qcVar.f29829f);
                frameLayout.removeOnLayoutChangeListener(qcVar.f29828c);
                ubVar.onDetach();
                Runnable runnable = qcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                qc qcVar2 = this.f25586b;
                FrameLayout frameLayout2 = qcVar2.h;
                frameLayout2.removeView(qcVar2.f29829f);
                frameLayout2.removeOnLayoutChangeListener(qcVar2.f29828c);
                return;
        }
    }
}

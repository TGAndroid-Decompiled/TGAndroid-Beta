package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class db implements Runnable {
    public final int f25335a;
    public final qc f25336b;

    public db(qc qcVar, int i10) {
        this.f25335a = i10;
        this.f25336b = qcVar;
    }

    @Override
    public final void run() {
        switch (this.f25335a) {
            case 0:
                this.f25336b.b();
                return;
            case 1:
                qc qcVar = this.f25336b;
                FrameLayout frameLayout = qcVar.h;
                ub ubVar = qcVar.f29675e;
                ob obVar = qcVar.f29685p;
                if (obVar != null && !ubVar.top) {
                    obVar.c(0.0f);
                    qcVar.f29685p.d(qcVar);
                }
                ubVar.transitionRunningExit = false;
                ubVar.onExitTransitionEnd();
                ubVar.onHide();
                frameLayout.removeView(qcVar.f29676f);
                frameLayout.removeOnLayoutChangeListener(qcVar.f29674c);
                ubVar.onDetach();
                Runnable runnable = qcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                qc qcVar2 = this.f25336b;
                FrameLayout frameLayout2 = qcVar2.h;
                frameLayout2.removeView(qcVar2.f29676f);
                frameLayout2.removeOnLayoutChangeListener(qcVar2.f29674c);
                return;
        }
    }
}

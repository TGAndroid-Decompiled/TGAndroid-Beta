package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class db implements Runnable {
    public final int f25362a;
    public final qc f25363b;

    public db(qc qcVar, int i10) {
        this.f25362a = i10;
        this.f25363b = qcVar;
    }

    @Override
    public final void run() {
        switch (this.f25362a) {
            case 0:
                this.f25363b.b();
                return;
            case 1:
                qc qcVar = this.f25363b;
                FrameLayout frameLayout = qcVar.h;
                ub ubVar = qcVar.f29702e;
                ob obVar = qcVar.f29712p;
                if (obVar != null && !ubVar.top) {
                    obVar.c(0.0f);
                    qcVar.f29712p.d(qcVar);
                }
                ubVar.transitionRunningExit = false;
                ubVar.onExitTransitionEnd();
                ubVar.onHide();
                frameLayout.removeView(qcVar.f29703f);
                frameLayout.removeOnLayoutChangeListener(qcVar.f29701c);
                ubVar.onDetach();
                Runnable runnable = qcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                qc qcVar2 = this.f25363b;
                FrameLayout frameLayout2 = qcVar2.h;
                frameLayout2.removeView(qcVar2.f29703f);
                frameLayout2.removeOnLayoutChangeListener(qcVar2.f29701c);
                return;
        }
    }
}

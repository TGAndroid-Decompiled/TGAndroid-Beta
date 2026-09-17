package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class db implements Runnable {
    public final int f25363a;
    public final qc f25364b;

    public db(qc qcVar, int i10) {
        this.f25363a = i10;
        this.f25364b = qcVar;
    }

    @Override
    public final void run() {
        switch (this.f25363a) {
            case 0:
                this.f25364b.b();
                return;
            case 1:
                qc qcVar = this.f25364b;
                FrameLayout frameLayout = qcVar.h;
                ub ubVar = qcVar.f29703e;
                ob obVar = qcVar.f29713p;
                if (obVar != null && !ubVar.top) {
                    obVar.c(0.0f);
                    qcVar.f29713p.d(qcVar);
                }
                ubVar.transitionRunningExit = false;
                ubVar.onExitTransitionEnd();
                ubVar.onHide();
                frameLayout.removeView(qcVar.f29704f);
                frameLayout.removeOnLayoutChangeListener(qcVar.f29702c);
                ubVar.onDetach();
                Runnable runnable = qcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                qc qcVar2 = this.f25364b;
                FrameLayout frameLayout2 = qcVar2.h;
                frameLayout2.removeView(qcVar2.f29704f);
                frameLayout2.removeOnLayoutChangeListener(qcVar2.f29702c);
                return;
        }
    }
}

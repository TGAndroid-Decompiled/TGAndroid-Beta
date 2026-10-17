package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class db implements Runnable {
    public final int f25553a;
    public final qc f25554b;

    public db(qc qcVar, int i10) {
        this.f25553a = i10;
        this.f25554b = qcVar;
    }

    @Override
    public final void run() {
        switch (this.f25553a) {
            case 0:
                this.f25554b.b();
                return;
            case 1:
                qc qcVar = this.f25554b;
                FrameLayout frameLayout = qcVar.h;
                ub ubVar = qcVar.e;
                ob obVar = qcVar.f29645p;
                if (obVar != null && !ubVar.top) {
                    obVar.c(0.0f);
                    qcVar.f29645p.d(qcVar);
                }
                ubVar.transitionRunningExit = false;
                ubVar.onExitTransitionEnd();
                ubVar.onHide();
                frameLayout.removeView(qcVar.f29636f);
                frameLayout.removeOnLayoutChangeListener(qcVar.f29635c);
                ubVar.onDetach();
                Runnable runnable = qcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                qc qcVar2 = this.f25554b;
                FrameLayout frameLayout2 = qcVar2.h;
                frameLayout2.removeView(qcVar2.f29636f);
                frameLayout2.removeOnLayoutChangeListener(qcVar2.f29635c);
                return;
        }
    }
}

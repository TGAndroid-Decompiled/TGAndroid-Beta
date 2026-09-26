package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class db implements Runnable {
    public final int f23655a;
    public final qc f23656b;

    public db(qc qcVar, int i10) {
        this.f23655a = i10;
        this.f23656b = qcVar;
    }

    @Override
    public final void run() {
        switch (this.f23655a) {
            case 0:
                this.f23656b.b();
                return;
            case 1:
                qc qcVar = this.f23656b;
                FrameLayout frameLayout = qcVar.h;
                ub ubVar = qcVar.e;
                ob obVar = qcVar.f27641p;
                if (obVar != null && !ubVar.top) {
                    obVar.c(0.0f);
                    qcVar.f27641p.d(qcVar);
                }
                ubVar.transitionRunningExit = false;
                ubVar.onExitTransitionEnd();
                ubVar.onHide();
                frameLayout.removeView(qcVar.f27632f);
                frameLayout.removeOnLayoutChangeListener(qcVar.f27631c);
                ubVar.onDetach();
                Runnable runnable = qcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                qc qcVar2 = this.f23656b;
                FrameLayout frameLayout2 = qcVar2.h;
                frameLayout2.removeView(qcVar2.f27632f);
                frameLayout2.removeOnLayoutChangeListener(qcVar2.f27631c);
                return;
        }
    }
}

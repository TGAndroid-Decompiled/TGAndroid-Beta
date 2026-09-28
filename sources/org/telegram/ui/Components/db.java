package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class db implements Runnable {
    public final int f23619a;
    public final qc f23620b;

    public db(qc qcVar, int i10) {
        this.f23619a = i10;
        this.f23620b = qcVar;
    }

    @Override
    public final void run() {
        switch (this.f23619a) {
            case 0:
                this.f23620b.b();
                return;
            case 1:
                qc qcVar = this.f23620b;
                FrameLayout frameLayout = qcVar.h;
                ub ubVar = qcVar.e;
                ob obVar = qcVar.f27655p;
                if (obVar != null && !ubVar.top) {
                    obVar.c(0.0f);
                    qcVar.f27655p.d(qcVar);
                }
                ubVar.transitionRunningExit = false;
                ubVar.onExitTransitionEnd();
                ubVar.onHide();
                frameLayout.removeView(qcVar.f27646f);
                frameLayout.removeOnLayoutChangeListener(qcVar.f27645c);
                ubVar.onDetach();
                Runnable runnable = qcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                qc qcVar2 = this.f23620b;
                FrameLayout frameLayout2 = qcVar2.h;
                frameLayout2.removeView(qcVar2.f27646f);
                frameLayout2.removeOnLayoutChangeListener(qcVar2.f27645c);
                return;
        }
    }
}

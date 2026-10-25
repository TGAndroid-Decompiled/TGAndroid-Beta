package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class db implements Runnable {
    public final int f27483a;
    public final qc f27484b;

    public db(qc qcVar, int i10) {
        this.f27483a = i10;
        this.f27484b = qcVar;
    }

    @Override
    public final void run() {
        switch (this.f27483a) {
            case 0:
                this.f27484b.b();
                return;
            case 1:
                qc qcVar = this.f27484b;
                FrameLayout frameLayout = qcVar.h;
                ub ubVar = qcVar.e;
                ob obVar = qcVar.f31894q;
                if (obVar != null && !ubVar.top) {
                    obVar.c(0.0f);
                    qcVar.f31894q.d(qcVar);
                }
                ubVar.transitionRunningExit = false;
                ubVar.onExitTransitionEnd();
                ubVar.onHide();
                frameLayout.removeView(qcVar.f31884f);
                frameLayout.removeOnLayoutChangeListener(qcVar.f31883c);
                ubVar.onDetach();
                Runnable runnable = qcVar.f31899w;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                qc qcVar2 = this.f27484b;
                FrameLayout frameLayout2 = qcVar2.h;
                frameLayout2.removeView(qcVar2.f31884f);
                frameLayout2.removeOnLayoutChangeListener(qcVar2.f31883c);
                return;
        }
    }
}

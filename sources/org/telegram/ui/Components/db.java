package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class db implements Runnable {
    public final int f23623a;
    public final qc f23624b;

    public db(qc qcVar, int i10) {
        this.f23623a = i10;
        this.f23624b = qcVar;
    }

    @Override
    public final void run() {
        switch (this.f23623a) {
            case 0:
                this.f23624b.b();
                return;
            case 1:
                qc qcVar = this.f23624b;
                FrameLayout frameLayout = qcVar.h;
                ub ubVar = qcVar.e;
                ob obVar = qcVar.f27697p;
                if (obVar != null && !ubVar.top) {
                    obVar.c(0.0f);
                    qcVar.f27697p.d(qcVar);
                }
                ubVar.transitionRunningExit = false;
                ubVar.onExitTransitionEnd();
                ubVar.onHide();
                frameLayout.removeView(qcVar.f27688f);
                frameLayout.removeOnLayoutChangeListener(qcVar.f27687c);
                ubVar.onDetach();
                Runnable runnable = qcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                qc qcVar2 = this.f23624b;
                FrameLayout frameLayout2 = qcVar2.h;
                frameLayout2.removeView(qcVar2.f27688f);
                frameLayout2.removeOnLayoutChangeListener(qcVar2.f27687c);
                return;
        }
    }
}

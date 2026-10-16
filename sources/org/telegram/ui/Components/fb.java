package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class fb implements Runnable {
    public final int f24688a;
    public final sc f24689b;

    public fb(sc scVar, int i10) {
        this.f24688a = i10;
        this.f24689b = scVar;
    }

    @Override
    public final void run() {
        switch (this.f24688a) {
            case 0:
                this.f24689b.b();
                return;
            case 1:
                sc scVar = this.f24689b;
                FrameLayout frameLayout = scVar.h;
                wb wbVar = scVar.e;
                qb qbVar = scVar.f28811p;
                if (qbVar != null && !wbVar.top) {
                    qbVar.c(0.0f);
                    scVar.f28811p.d(scVar);
                }
                wbVar.transitionRunningExit = false;
                wbVar.onExitTransitionEnd();
                wbVar.onHide();
                frameLayout.removeView(scVar.f28802f);
                frameLayout.removeOnLayoutChangeListener(scVar.f28801c);
                wbVar.onDetach();
                Runnable runnable = scVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                sc scVar2 = this.f24689b;
                FrameLayout frameLayout2 = scVar2.h;
                frameLayout2.removeView(scVar2.f28802f);
                frameLayout2.removeOnLayoutChangeListener(scVar2.f28801c);
                return;
        }
    }
}

package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class cb implements Runnable {
    public final int f22089a;
    public final pc f22090b;

    public cb(pc pcVar, int i10) {
        this.f22089a = i10;
        this.f22090b = pcVar;
    }

    @Override
    public final void run() {
        switch (this.f22089a) {
            case 0:
                this.f22090b.b();
                return;
            case 1:
                pc pcVar = this.f22090b;
                FrameLayout frameLayout = pcVar.h;
                tb tbVar = pcVar.e;
                nb nbVar = pcVar.f26087p;
                if (nbVar != null && !tbVar.top) {
                    nbVar.c(0.0f);
                    pcVar.f26087p.d(pcVar);
                }
                tbVar.transitionRunningExit = false;
                tbVar.onExitTransitionEnd();
                tbVar.onHide();
                frameLayout.removeView(pcVar.f26078f);
                frameLayout.removeOnLayoutChangeListener(pcVar.f26077c);
                tbVar.onDetach();
                Runnable runnable = pcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                pc pcVar2 = this.f22090b;
                FrameLayout frameLayout2 = pcVar2.h;
                frameLayout2.removeView(pcVar2.f26078f);
                frameLayout2.removeOnLayoutChangeListener(pcVar2.f26077c);
                return;
        }
    }
}

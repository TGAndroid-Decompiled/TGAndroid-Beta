package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class cb implements Runnable {
    public final int f23226a;
    public final pc f23227b;

    public cb(pc pcVar, int i10) {
        this.f23226a = i10;
        this.f23227b = pcVar;
    }

    @Override
    public final void run() {
        switch (this.f23226a) {
            case 0:
                this.f23227b.b();
                return;
            case 1:
                pc pcVar = this.f23227b;
                FrameLayout frameLayout = pcVar.h;
                tb tbVar = pcVar.e;
                nb nbVar = pcVar.f27258p;
                if (nbVar != null && !tbVar.top) {
                    nbVar.c(0.0f);
                    pcVar.f27258p.d(pcVar);
                }
                tbVar.transitionRunningExit = false;
                tbVar.onExitTransitionEnd();
                tbVar.onHide();
                frameLayout.removeView(pcVar.f27249f);
                frameLayout.removeOnLayoutChangeListener(pcVar.f27248c);
                tbVar.onDetach();
                Runnable runnable = pcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                pc pcVar2 = this.f23227b;
                FrameLayout frameLayout2 = pcVar2.h;
                frameLayout2.removeView(pcVar2.f27249f);
                frameLayout2.removeOnLayoutChangeListener(pcVar2.f27248c);
                return;
        }
    }
}

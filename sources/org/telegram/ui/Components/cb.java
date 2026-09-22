package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class cb implements Runnable {
    public final int f23338a;
    public final pc f23339b;

    public cb(pc pcVar, int i10) {
        this.f23338a = i10;
        this.f23339b = pcVar;
    }

    @Override
    public final void run() {
        switch (this.f23338a) {
            case 0:
                this.f23339b.b();
                return;
            case 1:
                pc pcVar = this.f23339b;
                FrameLayout frameLayout = pcVar.h;
                tb tbVar = pcVar.e;
                nb nbVar = pcVar.f27317p;
                if (nbVar != null && !tbVar.top) {
                    nbVar.c(0.0f);
                    pcVar.f27317p.d(pcVar);
                }
                tbVar.transitionRunningExit = false;
                tbVar.onExitTransitionEnd();
                tbVar.onHide();
                frameLayout.removeView(pcVar.f27308f);
                frameLayout.removeOnLayoutChangeListener(pcVar.f27307c);
                tbVar.onDetach();
                Runnable runnable = pcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                pc pcVar2 = this.f23339b;
                FrameLayout frameLayout2 = pcVar2.h;
                frameLayout2.removeView(pcVar2.f27308f);
                frameLayout2.removeOnLayoutChangeListener(pcVar2.f27307c);
                return;
        }
    }
}

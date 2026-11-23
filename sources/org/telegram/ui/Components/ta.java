package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class ta implements Runnable {
    public final int f39879a;
    public final fc f39880b;

    public ta(fc fcVar, int i7) {
        this.f39879a = i7;
        this.f39880b = fcVar;
    }

    @Override
    public final void run() {
        switch (this.f39879a) {
            case 0:
                this.f39880b.b();
                return;
            case 1:
                fc fcVar = this.f39880b;
                FrameLayout frameLayout = fcVar.h;
                kb kbVar = fcVar.f35087e;
                eb ebVar = fcVar.f35097p;
                if (ebVar != null && !kbVar.top) {
                    ebVar.c(0.0f);
                    fcVar.f35097p.d(fcVar);
                }
                kbVar.transitionRunningExit = false;
                kbVar.onExitTransitionEnd();
                kbVar.onHide();
                frameLayout.removeView(fcVar.f35088f);
                frameLayout.removeOnLayoutChangeListener(fcVar.f35086c);
                kbVar.onDetach();
                Runnable runnable = fcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                fc fcVar2 = this.f39880b;
                FrameLayout frameLayout2 = fcVar2.h;
                frameLayout2.removeView(fcVar2.f35088f);
                frameLayout2.removeOnLayoutChangeListener(fcVar2.f35086c);
                return;
        }
    }
}

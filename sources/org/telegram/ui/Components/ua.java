package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class ua implements Runnable {
    public final int f31628a;
    public final ic f31629b;

    public ua(ic icVar, int i10) {
        this.f31628a = i10;
        this.f31629b = icVar;
    }

    @Override
    public final void run() {
        switch (this.f31628a) {
            case 0:
                this.f31629b.b();
                return;
            case 1:
                ic icVar = this.f31629b;
                FrameLayout frameLayout = icVar.h;
                nb nbVar = icVar.f27741e;
                fb fbVar = icVar.f27751p;
                if (fbVar != null && !nbVar.top) {
                    fbVar.c(0.0f);
                    icVar.f27751p.d(icVar);
                }
                nbVar.transitionRunningExit = false;
                nbVar.onExitTransitionEnd();
                nbVar.onHide();
                frameLayout.removeView(icVar.f27742f);
                frameLayout.removeOnLayoutChangeListener(icVar.f27740c);
                nbVar.onDetach();
                Runnable runnable = icVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                ic icVar2 = this.f31629b;
                FrameLayout frameLayout2 = icVar2.h;
                frameLayout2.removeView(icVar2.f27742f);
                frameLayout2.removeOnLayoutChangeListener(icVar2.f27740c);
                return;
        }
    }
}

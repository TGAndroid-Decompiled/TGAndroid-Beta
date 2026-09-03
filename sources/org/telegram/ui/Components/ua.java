package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class ua implements Runnable {
    public final int f29164a;
    public final ic f29165b;

    public ua(ic icVar, int i10) {
        this.f29164a = i10;
        this.f29165b = icVar;
    }

    @Override
    public final void run() {
        switch (this.f29164a) {
            case 0:
                this.f29165b.b();
                return;
            case 1:
                ic icVar = this.f29165b;
                FrameLayout frameLayout = icVar.h;
                nb nbVar = icVar.e;
                fb fbVar = icVar.f25677p;
                if (fbVar != null && !nbVar.top) {
                    fbVar.c(0.0f);
                    icVar.f25677p.d(icVar);
                }
                nbVar.transitionRunningExit = false;
                nbVar.onExitTransitionEnd();
                nbVar.onHide();
                frameLayout.removeView(icVar.f25668f);
                frameLayout.removeOnLayoutChangeListener(icVar.f25667c);
                nbVar.onDetach();
                Runnable runnable = icVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                ic icVar2 = this.f29165b;
                FrameLayout frameLayout2 = icVar2.h;
                frameLayout2.removeView(icVar2.f25668f);
                frameLayout2.removeOnLayoutChangeListener(icVar2.f25667c);
                return;
        }
    }
}

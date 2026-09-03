package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class ua implements Runnable {
    public final int f31582a;
    public final ic f31583b;

    public ua(ic icVar, int i10) {
        this.f31582a = i10;
        this.f31583b = icVar;
    }

    @Override
    public final void run() {
        switch (this.f31582a) {
            case 0:
                this.f31583b.b();
                return;
            case 1:
                ic icVar = this.f31583b;
                FrameLayout frameLayout = icVar.h;
                nb nbVar = icVar.f27774e;
                fb fbVar = icVar.f27784p;
                if (fbVar != null && !nbVar.top) {
                    fbVar.c(0.0f);
                    icVar.f27784p.d(icVar);
                }
                nbVar.transitionRunningExit = false;
                nbVar.onExitTransitionEnd();
                nbVar.onHide();
                frameLayout.removeView(icVar.f27775f);
                frameLayout.removeOnLayoutChangeListener(icVar.f27773c);
                nbVar.onDetach();
                Runnable runnable = icVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                ic icVar2 = this.f31583b;
                FrameLayout frameLayout2 = icVar2.h;
                frameLayout2.removeView(icVar2.f27775f);
                frameLayout2.removeOnLayoutChangeListener(icVar2.f27773c);
                return;
        }
    }
}

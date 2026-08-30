package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class ua implements Runnable {
    public final int f29171a;
    public final ic f29172b;

    public ua(ic icVar, int i10) {
        this.f29171a = i10;
        this.f29172b = icVar;
    }

    @Override
    public final void run() {
        switch (this.f29171a) {
            case 0:
                this.f29172b.b();
                return;
            case 1:
                ic icVar = this.f29172b;
                FrameLayout frameLayout = icVar.h;
                nb nbVar = icVar.e;
                fb fbVar = icVar.f25678p;
                if (fbVar != null && !nbVar.top) {
                    fbVar.c(0.0f);
                    icVar.f25678p.d(icVar);
                }
                nbVar.transitionRunningExit = false;
                nbVar.onExitTransitionEnd();
                nbVar.onHide();
                frameLayout.removeView(icVar.f25669f);
                frameLayout.removeOnLayoutChangeListener(icVar.f25668c);
                nbVar.onDetach();
                Runnable runnable = icVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                ic icVar2 = this.f29172b;
                FrameLayout frameLayout2 = icVar2.h;
                frameLayout2.removeView(icVar2.f25669f);
                frameLayout2.removeOnLayoutChangeListener(icVar2.f25668c);
                return;
        }
    }
}

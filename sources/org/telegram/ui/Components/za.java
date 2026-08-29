package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class za implements Runnable {
    public final int f35298a;
    public final mc f35299b;

    public za(mc mcVar, int i10) {
        this.f35298a = i10;
        this.f35299b = mcVar;
    }

    @Override
    public final void run() {
        switch (this.f35298a) {
            case 0:
                this.f35299b.b();
                return;
            case 1:
                mc mcVar = this.f35299b;
                FrameLayout frameLayout = mcVar.h;
                rb rbVar = mcVar.f30648e;
                kb kbVar = mcVar.f30658p;
                if (kbVar != null && !rbVar.top) {
                    kbVar.c(0.0f);
                    mcVar.f30658p.d(mcVar);
                }
                rbVar.transitionRunningExit = false;
                rbVar.onExitTransitionEnd();
                rbVar.onHide();
                frameLayout.removeView(mcVar.f30649f);
                frameLayout.removeOnLayoutChangeListener(mcVar.f30647c);
                rbVar.onDetach();
                Runnable runnable = mcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                mc mcVar2 = this.f35299b;
                FrameLayout frameLayout2 = mcVar2.h;
                frameLayout2.removeView(mcVar2.f30649f);
                frameLayout2.removeOnLayoutChangeListener(mcVar2.f30647c);
                return;
        }
    }
}

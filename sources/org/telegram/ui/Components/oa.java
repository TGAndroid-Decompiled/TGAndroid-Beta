package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class oa implements Runnable {
    public final int f36789a;
    public final ac f36790b;

    public oa(ac acVar, int i3) {
        this.f36789a = i3;
        this.f36790b = acVar;
    }

    @Override
    public final void run() {
        switch (this.f36789a) {
            case 0:
                this.f36790b.b();
                return;
            case 1:
                ac acVar = this.f36790b;
                FrameLayout frameLayout = acVar.h;
                fb fbVar = acVar.f31788e;
                za zaVar = acVar.f31798p;
                if (zaVar != null && !fbVar.top) {
                    zaVar.c(0.0f);
                    acVar.f31798p.d(acVar);
                }
                fbVar.transitionRunningExit = false;
                fbVar.onExitTransitionEnd();
                fbVar.onHide();
                frameLayout.removeView(acVar.f31789f);
                frameLayout.removeOnLayoutChangeListener(acVar.f31787c);
                fbVar.onDetach();
                Runnable runnable = acVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                ac acVar2 = this.f36790b;
                FrameLayout frameLayout2 = acVar2.h;
                frameLayout2.removeView(acVar2.f31789f);
                frameLayout2.removeOnLayoutChangeListener(acVar2.f31787c);
                return;
        }
    }
}

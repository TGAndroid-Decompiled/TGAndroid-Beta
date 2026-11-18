package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class ua implements Runnable {
    public final int f40275a;
    public final gc f40276b;

    public ua(gc gcVar, int i7) {
        this.f40275a = i7;
        this.f40276b = gcVar;
    }

    @Override
    public final void run() {
        switch (this.f40275a) {
            case 0:
                this.f40276b.b();
                return;
            case 1:
                gc gcVar = this.f40276b;
                FrameLayout frameLayout = gcVar.h;
                lb lbVar = gcVar.f35457e;
                fb fbVar = gcVar.f35467p;
                if (fbVar != null && !lbVar.top) {
                    fbVar.c(0.0f);
                    gcVar.f35467p.d(gcVar);
                }
                lbVar.transitionRunningExit = false;
                lbVar.onExitTransitionEnd();
                lbVar.onHide();
                frameLayout.removeView(gcVar.f35458f);
                frameLayout.removeOnLayoutChangeListener(gcVar.f35456c);
                lbVar.onDetach();
                Runnable runnable = gcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                gc gcVar2 = this.f40276b;
                FrameLayout frameLayout2 = gcVar2.h;
                frameLayout2.removeView(gcVar2.f35458f);
                frameLayout2.removeOnLayoutChangeListener(gcVar2.f35456c);
                return;
        }
    }
}

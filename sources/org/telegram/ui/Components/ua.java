package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class ua implements Runnable {
    public final int f40304a;
    public final gc f40305b;

    public ua(gc gcVar, int i7) {
        this.f40304a = i7;
        this.f40305b = gcVar;
    }

    @Override
    public final void run() {
        switch (this.f40304a) {
            case 0:
                this.f40305b.b();
                return;
            case 1:
                gc gcVar = this.f40305b;
                FrameLayout frameLayout = gcVar.h;
                lb lbVar = gcVar.f35523e;
                fb fbVar = gcVar.f35533p;
                if (fbVar != null && !lbVar.top) {
                    fbVar.c(0.0f);
                    gcVar.f35533p.d(gcVar);
                }
                lbVar.transitionRunningExit = false;
                lbVar.onExitTransitionEnd();
                lbVar.onHide();
                frameLayout.removeView(gcVar.f35524f);
                frameLayout.removeOnLayoutChangeListener(gcVar.f35522c);
                lbVar.onDetach();
                Runnable runnable = gcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                gc gcVar2 = this.f40305b;
                FrameLayout frameLayout2 = gcVar2.h;
                frameLayout2.removeView(gcVar2.f35524f);
                frameLayout2.removeOnLayoutChangeListener(gcVar2.f35522c);
                return;
        }
    }
}

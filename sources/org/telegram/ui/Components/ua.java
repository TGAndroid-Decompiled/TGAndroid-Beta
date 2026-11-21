package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class ua implements Runnable {
    public final int f40312a;
    public final gc f40313b;

    public ua(gc gcVar, int i7) {
        this.f40312a = i7;
        this.f40313b = gcVar;
    }

    @Override
    public final void run() {
        switch (this.f40312a) {
            case 0:
                this.f40313b.b();
                return;
            case 1:
                gc gcVar = this.f40313b;
                FrameLayout frameLayout = gcVar.h;
                lb lbVar = gcVar.f35504e;
                fb fbVar = gcVar.f35514p;
                if (fbVar != null && !lbVar.top) {
                    fbVar.c(0.0f);
                    gcVar.f35514p.d(gcVar);
                }
                lbVar.transitionRunningExit = false;
                lbVar.onExitTransitionEnd();
                lbVar.onHide();
                frameLayout.removeView(gcVar.f35505f);
                frameLayout.removeOnLayoutChangeListener(gcVar.f35503c);
                lbVar.onDetach();
                Runnable runnable = gcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                gc gcVar2 = this.f40313b;
                FrameLayout frameLayout2 = gcVar2.h;
                frameLayout2.removeView(gcVar2.f35505f);
                frameLayout2.removeOnLayoutChangeListener(gcVar2.f35503c);
                return;
        }
    }
}

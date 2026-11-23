package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class ua implements Runnable {
    public final int f40287a;
    public final gc f40288b;

    public ua(gc gcVar, int i7) {
        this.f40287a = i7;
        this.f40288b = gcVar;
    }

    @Override
    public final void run() {
        switch (this.f40287a) {
            case 0:
                this.f40288b.b();
                return;
            case 1:
                gc gcVar = this.f40288b;
                FrameLayout frameLayout = gcVar.h;
                lb lbVar = gcVar.f35485e;
                fb fbVar = gcVar.f35495p;
                if (fbVar != null && !lbVar.top) {
                    fbVar.c(0.0f);
                    gcVar.f35495p.d(gcVar);
                }
                lbVar.transitionRunningExit = false;
                lbVar.onExitTransitionEnd();
                lbVar.onHide();
                frameLayout.removeView(gcVar.f35486f);
                frameLayout.removeOnLayoutChangeListener(gcVar.f35484c);
                lbVar.onDetach();
                Runnable runnable = gcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                gc gcVar2 = this.f40288b;
                FrameLayout frameLayout2 = gcVar2.h;
                frameLayout2.removeView(gcVar2.f35486f);
                frameLayout2.removeOnLayoutChangeListener(gcVar2.f35484c);
                return;
        }
    }
}

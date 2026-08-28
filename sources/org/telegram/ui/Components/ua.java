package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class ua implements Runnable {
    public final int f32968a;
    public final gc f32969b;

    public ua(gc gcVar, int i9) {
        this.f32968a = i9;
        this.f32969b = gcVar;
    }

    @Override
    public final void run() {
        switch (this.f32968a) {
            case 0:
                this.f32969b.b();
                return;
            case 1:
                gc gcVar = this.f32969b;
                FrameLayout frameLayout = gcVar.h;
                lb lbVar = gcVar.f28733e;
                fb fbVar = gcVar.f28743p;
                if (fbVar != null && !lbVar.top) {
                    fbVar.c(0.0f);
                    gcVar.f28743p.d(gcVar);
                }
                lbVar.transitionRunningExit = false;
                lbVar.onExitTransitionEnd();
                lbVar.onHide();
                frameLayout.removeView(gcVar.f28734f);
                frameLayout.removeOnLayoutChangeListener(gcVar.f28732c);
                lbVar.onDetach();
                Runnable runnable = gcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                gc gcVar2 = this.f32969b;
                FrameLayout frameLayout2 = gcVar2.h;
                frameLayout2.removeView(gcVar2.f28734f);
                frameLayout2.removeOnLayoutChangeListener(gcVar2.f28732c);
                return;
        }
    }
}

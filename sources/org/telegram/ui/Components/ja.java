package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class ja implements Runnable {
    public final int f27323a;
    public final wb f27324b;

    public ja(wb wbVar, int i10) {
        this.f27323a = i10;
        this.f27324b = wbVar;
    }

    @Override
    public final void run() {
        switch (this.f27323a) {
            case 0:
                this.f27324b.b();
                return;
            case 1:
                wb wbVar = this.f27324b;
                FrameLayout frameLayout = wbVar.h;
                bb bbVar = wbVar.e;
                ua uaVar = wbVar.f32207p;
                if (uaVar != null && !bbVar.top) {
                    uaVar.c(0.0f);
                    wbVar.f32207p.d(wbVar);
                }
                bbVar.transitionRunningExit = false;
                bbVar.onExitTransitionEnd();
                bbVar.onHide();
                frameLayout.removeView(wbVar.f32198f);
                frameLayout.removeOnLayoutChangeListener(wbVar.f32197c);
                bbVar.onDetach();
                Runnable runnable = wbVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                wb wbVar2 = this.f27324b;
                FrameLayout frameLayout2 = wbVar2.h;
                frameLayout2.removeView(wbVar2.f32198f);
                frameLayout2.removeOnLayoutChangeListener(wbVar2.f32197c);
                return;
        }
    }
}

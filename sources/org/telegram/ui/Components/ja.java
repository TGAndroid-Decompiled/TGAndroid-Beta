package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class ja implements Runnable {
    public final int f27268a;
    public final wb f27269b;

    public ja(wb wbVar, int i10) {
        this.f27268a = i10;
        this.f27269b = wbVar;
    }

    @Override
    public final void run() {
        switch (this.f27268a) {
            case 0:
                this.f27269b.b();
                return;
            case 1:
                wb wbVar = this.f27269b;
                FrameLayout frameLayout = wbVar.h;
                bb bbVar = wbVar.e;
                ua uaVar = wbVar.f32141p;
                if (uaVar != null && !bbVar.top) {
                    uaVar.c(0.0f);
                    wbVar.f32141p.d(wbVar);
                }
                bbVar.transitionRunningExit = false;
                bbVar.onExitTransitionEnd();
                bbVar.onHide();
                frameLayout.removeView(wbVar.f32132f);
                frameLayout.removeOnLayoutChangeListener(wbVar.f32131c);
                bbVar.onDetach();
                Runnable runnable = wbVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                wb wbVar2 = this.f27269b;
                FrameLayout frameLayout2 = wbVar2.h;
                frameLayout2.removeView(wbVar2.f32132f);
                frameLayout2.removeOnLayoutChangeListener(wbVar2.f32131c);
                return;
        }
    }
}

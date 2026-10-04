package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class eb implements Runnable {
    public final int f26034a;
    public final rc f26035b;

    public eb(rc rcVar, int i10) {
        this.f26034a = i10;
        this.f26035b = rcVar;
    }

    @Override
    public final void run() {
        switch (this.f26034a) {
            case 0:
                this.f26035b.b();
                return;
            case 1:
                rc rcVar = this.f26035b;
                FrameLayout frameLayout = rcVar.h;
                vb vbVar = rcVar.f30341e;
                pb pbVar = rcVar.f30351p;
                if (pbVar != null && !vbVar.top) {
                    pbVar.c(0.0f);
                    rcVar.f30351p.d(rcVar);
                }
                vbVar.transitionRunningExit = false;
                vbVar.onExitTransitionEnd();
                vbVar.onHide();
                frameLayout.removeView(rcVar.f30342f);
                frameLayout.removeOnLayoutChangeListener(rcVar.f30340c);
                vbVar.onDetach();
                Runnable runnable = rcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                rc rcVar2 = this.f26035b;
                FrameLayout frameLayout2 = rcVar2.h;
                frameLayout2.removeView(rcVar2.f30342f);
                frameLayout2.removeOnLayoutChangeListener(rcVar2.f30340c);
                return;
        }
    }
}

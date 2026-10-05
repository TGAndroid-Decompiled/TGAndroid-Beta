package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class eb implements Runnable {
    public final int f26103a;
    public final rc f26104b;

    public eb(rc rcVar, int i10) {
        this.f26103a = i10;
        this.f26104b = rcVar;
    }

    @Override
    public final void run() {
        switch (this.f26103a) {
            case 0:
                this.f26104b.b();
                return;
            case 1:
                rc rcVar = this.f26104b;
                FrameLayout frameLayout = rcVar.h;
                vb vbVar = rcVar.f30423e;
                pb pbVar = rcVar.f30433p;
                if (pbVar != null && !vbVar.top) {
                    pbVar.c(0.0f);
                    rcVar.f30433p.d(rcVar);
                }
                vbVar.transitionRunningExit = false;
                vbVar.onExitTransitionEnd();
                vbVar.onHide();
                frameLayout.removeView(rcVar.f30424f);
                frameLayout.removeOnLayoutChangeListener(rcVar.f30422c);
                vbVar.onDetach();
                Runnable runnable = rcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                rc rcVar2 = this.f26104b;
                FrameLayout frameLayout2 = rcVar2.h;
                frameLayout2.removeView(rcVar2.f30424f);
                frameLayout2.removeOnLayoutChangeListener(rcVar2.f30422c);
                return;
        }
    }
}

package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class eb implements Runnable {
    public final int f26028a;
    public final rc f26029b;

    public eb(rc rcVar, int i10) {
        this.f26028a = i10;
        this.f26029b = rcVar;
    }

    @Override
    public final void run() {
        switch (this.f26028a) {
            case 0:
                this.f26029b.b();
                return;
            case 1:
                rc rcVar = this.f26029b;
                FrameLayout frameLayout = rcVar.h;
                vb vbVar = rcVar.f30334e;
                pb pbVar = rcVar.f30344p;
                if (pbVar != null && !vbVar.top) {
                    pbVar.c(0.0f);
                    rcVar.f30344p.d(rcVar);
                }
                vbVar.transitionRunningExit = false;
                vbVar.onExitTransitionEnd();
                vbVar.onHide();
                frameLayout.removeView(rcVar.f30335f);
                frameLayout.removeOnLayoutChangeListener(rcVar.f30333c);
                vbVar.onDetach();
                Runnable runnable = rcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                rc rcVar2 = this.f26029b;
                FrameLayout frameLayout2 = rcVar2.h;
                frameLayout2.removeView(rcVar2.f30335f);
                frameLayout2.removeOnLayoutChangeListener(rcVar2.f30333c);
                return;
        }
    }
}

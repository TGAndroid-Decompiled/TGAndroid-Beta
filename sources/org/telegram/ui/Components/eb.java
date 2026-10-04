package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class eb implements Runnable {
    public final int f26029a;
    public final rc f26030b;

    public eb(rc rcVar, int i10) {
        this.f26029a = i10;
        this.f26030b = rcVar;
    }

    @Override
    public final void run() {
        switch (this.f26029a) {
            case 0:
                this.f26030b.b();
                return;
            case 1:
                rc rcVar = this.f26030b;
                FrameLayout frameLayout = rcVar.h;
                vb vbVar = rcVar.f30335e;
                pb pbVar = rcVar.f30345p;
                if (pbVar != null && !vbVar.top) {
                    pbVar.c(0.0f);
                    rcVar.f30345p.d(rcVar);
                }
                vbVar.transitionRunningExit = false;
                vbVar.onExitTransitionEnd();
                vbVar.onHide();
                frameLayout.removeView(rcVar.f30336f);
                frameLayout.removeOnLayoutChangeListener(rcVar.f30334c);
                vbVar.onDetach();
                Runnable runnable = rcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                rc rcVar2 = this.f26030b;
                FrameLayout frameLayout2 = rcVar2.h;
                frameLayout2.removeView(rcVar2.f30336f);
                frameLayout2.removeOnLayoutChangeListener(rcVar2.f30334c);
                return;
        }
    }
}

package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class eb implements Runnable {
    public final int f23939a;
    public final rc f23940b;

    public eb(rc rcVar, int i10) {
        this.f23939a = i10;
        this.f23940b = rcVar;
    }

    @Override
    public final void run() {
        switch (this.f23939a) {
            case 0:
                this.f23940b.b();
                return;
            case 1:
                rc rcVar = this.f23940b;
                FrameLayout frameLayout = rcVar.h;
                vb vbVar = rcVar.e;
                pb pbVar = rcVar.f27952p;
                if (pbVar != null && !vbVar.top) {
                    pbVar.c(0.0f);
                    rcVar.f27952p.d(rcVar);
                }
                vbVar.transitionRunningExit = false;
                vbVar.onExitTransitionEnd();
                vbVar.onHide();
                frameLayout.removeView(rcVar.f27943f);
                frameLayout.removeOnLayoutChangeListener(rcVar.f27942c);
                vbVar.onDetach();
                Runnable runnable = rcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                rc rcVar2 = this.f23940b;
                FrameLayout frameLayout2 = rcVar2.h;
                frameLayout2.removeView(rcVar2.f27943f);
                frameLayout2.removeOnLayoutChangeListener(rcVar2.f27942c);
                return;
        }
    }
}

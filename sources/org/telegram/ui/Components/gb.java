package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class gb implements Runnable {
    public final int f26657a;
    public final tc f26658b;

    public gb(tc tcVar, int i10) {
        this.f26657a = i10;
        this.f26658b = tcVar;
    }

    @Override
    public final void run() {
        switch (this.f26657a) {
            case 0:
                this.f26658b.b();
                return;
            case 1:
                tc tcVar = this.f26658b;
                FrameLayout frameLayout = tcVar.h;
                xb xbVar = tcVar.f31126e;
                rb rbVar = tcVar.f31136p;
                if (rbVar != null && !xbVar.top) {
                    rbVar.c(0.0f);
                    tcVar.f31136p.d(tcVar);
                }
                xbVar.transitionRunningExit = false;
                xbVar.onExitTransitionEnd();
                xbVar.onHide();
                frameLayout.removeView(tcVar.f31127f);
                frameLayout.removeOnLayoutChangeListener(tcVar.f31125c);
                xbVar.onDetach();
                Runnable runnable = tcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                tc tcVar2 = this.f26658b;
                FrameLayout frameLayout2 = tcVar2.h;
                frameLayout2.removeView(tcVar2.f31127f);
                frameLayout2.removeOnLayoutChangeListener(tcVar2.f31125c);
                return;
        }
    }
}

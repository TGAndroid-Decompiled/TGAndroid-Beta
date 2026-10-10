package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class gb implements Runnable {
    public final int f26684a;
    public final tc f26685b;

    public gb(tc tcVar, int i10) {
        this.f26684a = i10;
        this.f26685b = tcVar;
    }

    @Override
    public final void run() {
        switch (this.f26684a) {
            case 0:
                this.f26685b.b();
                return;
            case 1:
                tc tcVar = this.f26685b;
                FrameLayout frameLayout = tcVar.h;
                xb xbVar = tcVar.f31092e;
                rb rbVar = tcVar.f31102p;
                if (rbVar != null && !xbVar.top) {
                    rbVar.c(0.0f);
                    tcVar.f31102p.d(tcVar);
                }
                xbVar.transitionRunningExit = false;
                xbVar.onExitTransitionEnd();
                xbVar.onHide();
                frameLayout.removeView(tcVar.f31093f);
                frameLayout.removeOnLayoutChangeListener(tcVar.f31091c);
                xbVar.onDetach();
                Runnable runnable = tcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                tc tcVar2 = this.f26685b;
                FrameLayout frameLayout2 = tcVar2.h;
                frameLayout2.removeView(tcVar2.f31093f);
                frameLayout2.removeOnLayoutChangeListener(tcVar2.f31091c);
                return;
        }
    }
}

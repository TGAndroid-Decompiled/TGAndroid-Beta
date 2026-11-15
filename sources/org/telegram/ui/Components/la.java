package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class la implements Runnable {
    public final int f36744a;
    public final xb f36745b;

    public la(xb xbVar, int i7) {
        this.f36744a = i7;
        this.f36745b = xbVar;
    }

    @Override
    public final void run() {
        switch (this.f36744a) {
            case 0:
                this.f36745b.b();
                return;
            case 1:
                xb xbVar = this.f36745b;
                FrameLayout frameLayout = xbVar.h;
                cb cbVar = xbVar.f41639e;
                wa waVar = xbVar.f41649p;
                if (waVar != null && !cbVar.top) {
                    waVar.c(0.0f);
                    xbVar.f41649p.d(xbVar);
                }
                cbVar.transitionRunningExit = false;
                cbVar.onExitTransitionEnd();
                cbVar.onHide();
                frameLayout.removeView(xbVar.f41640f);
                frameLayout.removeOnLayoutChangeListener(xbVar.f41638c);
                cbVar.onDetach();
                Runnable runnable = xbVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                xb xbVar2 = this.f36745b;
                FrameLayout frameLayout2 = xbVar2.h;
                frameLayout2.removeView(xbVar2.f41640f);
                frameLayout2.removeOnLayoutChangeListener(xbVar2.f41638c);
                return;
        }
    }
}

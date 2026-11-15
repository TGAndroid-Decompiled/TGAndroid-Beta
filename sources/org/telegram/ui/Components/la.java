package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class la implements Runnable {
    public final int f36742a;
    public final xb f36743b;

    public la(xb xbVar, int i7) {
        this.f36742a = i7;
        this.f36743b = xbVar;
    }

    @Override
    public final void run() {
        switch (this.f36742a) {
            case 0:
                this.f36743b.b();
                return;
            case 1:
                xb xbVar = this.f36743b;
                FrameLayout frameLayout = xbVar.h;
                cb cbVar = xbVar.f41631e;
                wa waVar = xbVar.f41641p;
                if (waVar != null && !cbVar.top) {
                    waVar.c(0.0f);
                    xbVar.f41641p.d(xbVar);
                }
                cbVar.transitionRunningExit = false;
                cbVar.onExitTransitionEnd();
                cbVar.onHide();
                frameLayout.removeView(xbVar.f41632f);
                frameLayout.removeOnLayoutChangeListener(xbVar.f41630c);
                cbVar.onDetach();
                Runnable runnable = xbVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                xb xbVar2 = this.f36743b;
                FrameLayout frameLayout2 = xbVar2.h;
                frameLayout2.removeView(xbVar2.f41632f);
                frameLayout2.removeOnLayoutChangeListener(xbVar2.f41630c);
                return;
        }
    }
}

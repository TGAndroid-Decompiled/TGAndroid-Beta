package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class fb implements Runnable {
    public final int f24990a;
    public final sc f24991b;

    public fb(sc scVar, int i10) {
        this.f24990a = i10;
        this.f24991b = scVar;
    }

    @Override
    public final void run() {
        switch (this.f24990a) {
            case 0:
                this.f24991b.b();
                return;
            case 1:
                sc scVar = this.f24991b;
                FrameLayout frameLayout = scVar.h;
                wb wbVar = scVar.e;
                qb qbVar = scVar.f29108p;
                if (qbVar != null && !wbVar.top) {
                    qbVar.c(0.0f);
                    scVar.f29108p.d(scVar);
                }
                wbVar.transitionRunningExit = false;
                wbVar.onExitTransitionEnd();
                wbVar.onHide();
                frameLayout.removeView(scVar.f29099f);
                frameLayout.removeOnLayoutChangeListener(scVar.f29098c);
                wbVar.onDetach();
                Runnable runnable = scVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                sc scVar2 = this.f24991b;
                FrameLayout frameLayout2 = scVar2.h;
                frameLayout2.removeView(scVar2.f29099f);
                frameLayout2.removeOnLayoutChangeListener(scVar2.f29098c);
                return;
        }
    }
}

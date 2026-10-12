package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class fb implements Runnable {
    public final int f26003a;
    public final sc f26004b;

    public fb(sc scVar, int i10) {
        this.f26003a = i10;
        this.f26004b = scVar;
    }

    @Override
    public final void run() {
        switch (this.f26003a) {
            case 0:
                this.f26004b.b();
                return;
            case 1:
                sc scVar = this.f26004b;
                FrameLayout frameLayout = scVar.h;
                wb wbVar = scVar.f30532e;
                qb qbVar = scVar.f30542p;
                if (qbVar != null && !wbVar.top) {
                    qbVar.c(0.0f);
                    scVar.f30542p.d(scVar);
                }
                wbVar.transitionRunningExit = false;
                wbVar.onExitTransitionEnd();
                wbVar.onHide();
                frameLayout.removeView(scVar.f30533f);
                frameLayout.removeOnLayoutChangeListener(scVar.f30531c);
                wbVar.onDetach();
                Runnable runnable = scVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                sc scVar2 = this.f26004b;
                FrameLayout frameLayout2 = scVar2.h;
                frameLayout2.removeView(scVar2.f30533f);
                frameLayout2.removeOnLayoutChangeListener(scVar2.f30531c);
                return;
        }
    }
}

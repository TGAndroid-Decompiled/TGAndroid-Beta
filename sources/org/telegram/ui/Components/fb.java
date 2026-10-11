package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class fb implements Runnable {
    public final int f26328a;
    public final sc f26329b;

    public fb(sc scVar, int i10) {
        this.f26328a = i10;
        this.f26329b = scVar;
    }

    @Override
    public final void run() {
        switch (this.f26328a) {
            case 0:
                this.f26329b.b();
                return;
            case 1:
                sc scVar = this.f26329b;
                FrameLayout frameLayout = scVar.h;
                wb wbVar = scVar.f30707e;
                qb qbVar = scVar.f30717p;
                if (qbVar != null && !wbVar.top) {
                    qbVar.c(0.0f);
                    scVar.f30717p.d(scVar);
                }
                wbVar.transitionRunningExit = false;
                wbVar.onExitTransitionEnd();
                wbVar.onHide();
                frameLayout.removeView(scVar.f30708f);
                frameLayout.removeOnLayoutChangeListener(scVar.f30706c);
                wbVar.onDetach();
                Runnable runnable = scVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                sc scVar2 = this.f26329b;
                FrameLayout frameLayout2 = scVar2.h;
                frameLayout2.removeView(scVar2.f30708f);
                frameLayout2.removeOnLayoutChangeListener(scVar2.f30706c);
                return;
        }
    }
}

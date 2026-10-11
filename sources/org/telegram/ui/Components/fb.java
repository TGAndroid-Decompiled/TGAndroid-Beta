package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class fb implements Runnable {
    public final int f26432a;
    public final sc f26433b;

    public fb(sc scVar, int i10) {
        this.f26432a = i10;
        this.f26433b = scVar;
    }

    @Override
    public final void run() {
        switch (this.f26432a) {
            case 0:
                this.f26433b.b();
                return;
            case 1:
                sc scVar = this.f26433b;
                FrameLayout frameLayout = scVar.h;
                wb wbVar = scVar.f30829e;
                qb qbVar = scVar.f30839p;
                if (qbVar != null && !wbVar.top) {
                    qbVar.c(0.0f);
                    scVar.f30839p.d(scVar);
                }
                wbVar.transitionRunningExit = false;
                wbVar.onExitTransitionEnd();
                wbVar.onHide();
                frameLayout.removeView(scVar.f30830f);
                frameLayout.removeOnLayoutChangeListener(scVar.f30828c);
                wbVar.onDetach();
                Runnable runnable = scVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                sc scVar2 = this.f26433b;
                FrameLayout frameLayout2 = scVar2.h;
                frameLayout2.removeView(scVar2.f30830f);
                frameLayout2.removeOnLayoutChangeListener(scVar2.f30828c);
                return;
        }
    }
}

package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class fb implements Runnable {
    public final int f26001a;
    public final sc f26002b;

    public fb(sc scVar, int i10) {
        this.f26001a = i10;
        this.f26002b = scVar;
    }

    @Override
    public final void run() {
        switch (this.f26001a) {
            case 0:
                this.f26002b.b();
                return;
            case 1:
                sc scVar = this.f26002b;
                FrameLayout frameLayout = scVar.h;
                wb wbVar = scVar.f30536e;
                qb qbVar = scVar.f30546p;
                if (qbVar != null && !wbVar.top) {
                    qbVar.c(0.0f);
                    scVar.f30546p.d(scVar);
                }
                wbVar.transitionRunningExit = false;
                wbVar.onExitTransitionEnd();
                wbVar.onHide();
                frameLayout.removeView(scVar.f30537f);
                frameLayout.removeOnLayoutChangeListener(scVar.f30535c);
                wbVar.onDetach();
                Runnable runnable = scVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                sc scVar2 = this.f26002b;
                FrameLayout frameLayout2 = scVar2.h;
                frameLayout2.removeView(scVar2.f30537f);
                frameLayout2.removeOnLayoutChangeListener(scVar2.f30535c);
                return;
        }
    }
}

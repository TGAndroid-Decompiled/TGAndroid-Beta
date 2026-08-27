package org.telegram.ui.Components;

import android.widget.FrameLayout;

public final class sa implements Runnable {

    public final int f32375a;

    public final ec f32376b;

    public sa(ec ecVar, int i10) {
        this.f32375a = i10;
        this.f32376b = ecVar;
    }

    @Override
    public final void run() {
        switch (this.f32375a) {
            case 0:
                this.f32376b.b();
                break;
            case 1:
                ec ecVar = this.f32376b;
                FrameLayout frameLayout = ecVar.h;
                jb jbVar = ecVar.f28016e;
                db dbVar = ecVar.f28026p;
                if (dbVar != null && !jbVar.top) {
                    dbVar.c(0.0f);
                    ecVar.f28026p.d(ecVar);
                }
                jbVar.transitionRunningExit = false;
                jbVar.onExitTransitionEnd();
                jbVar.onHide();
                frameLayout.removeView(ecVar.f28017f);
                frameLayout.removeOnLayoutChangeListener(ecVar.f28015c);
                jbVar.onDetach();
                Runnable runnable = ecVar.v;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            default:
                ec ecVar2 = this.f32376b;
                FrameLayout frameLayout2 = ecVar2.h;
                frameLayout2.removeView(ecVar2.f28017f);
                frameLayout2.removeOnLayoutChangeListener(ecVar2.f28015c);
                break;
        }
    }
}

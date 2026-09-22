package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class bb implements Runnable {
    public final int f22741a;
    public final oc f22742b;

    public bb(oc ocVar, int i10) {
        this.f22741a = i10;
        this.f22742b = ocVar;
    }

    @Override
    public final void run() {
        switch (this.f22741a) {
            case 0:
                this.f22742b.b();
                return;
            case 1:
                oc ocVar = this.f22742b;
                FrameLayout frameLayout = ocVar.h;
                sb sbVar = ocVar.e;
                mb mbVar = ocVar.f26757p;
                if (mbVar != null && !sbVar.top) {
                    mbVar.c(0.0f);
                    ocVar.f26757p.d(ocVar);
                }
                sbVar.transitionRunningExit = false;
                sbVar.onExitTransitionEnd();
                sbVar.onHide();
                frameLayout.removeView(ocVar.f26748f);
                frameLayout.removeOnLayoutChangeListener(ocVar.f26747c);
                sbVar.onDetach();
                Runnable runnable = ocVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                oc ocVar2 = this.f22742b;
                FrameLayout frameLayout2 = ocVar2.h;
                frameLayout2.removeView(ocVar2.f26748f);
                frameLayout2.removeOnLayoutChangeListener(ocVar2.f26747c);
                return;
        }
    }
}

package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class bb implements Runnable {
    public final int f22745a;
    public final oc f22746b;

    public bb(oc ocVar, int i10) {
        this.f22745a = i10;
        this.f22746b = ocVar;
    }

    @Override
    public final void run() {
        switch (this.f22745a) {
            case 0:
                this.f22746b.b();
                return;
            case 1:
                oc ocVar = this.f22746b;
                FrameLayout frameLayout = ocVar.h;
                sb sbVar = ocVar.e;
                mb mbVar = ocVar.f26760p;
                if (mbVar != null && !sbVar.top) {
                    mbVar.c(0.0f);
                    ocVar.f26760p.d(ocVar);
                }
                sbVar.transitionRunningExit = false;
                sbVar.onExitTransitionEnd();
                sbVar.onHide();
                frameLayout.removeView(ocVar.f26751f);
                frameLayout.removeOnLayoutChangeListener(ocVar.f26750c);
                sbVar.onDetach();
                Runnable runnable = ocVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                oc ocVar2 = this.f22746b;
                FrameLayout frameLayout2 = ocVar2.h;
                frameLayout2.removeView(ocVar2.f26751f);
                frameLayout2.removeOnLayoutChangeListener(ocVar2.f26750c);
                return;
        }
    }
}

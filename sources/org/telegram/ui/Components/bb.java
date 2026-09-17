package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class bb implements Runnable {
    public final int f22691a;
    public final oc f22692b;

    public bb(oc ocVar, int i10) {
        this.f22691a = i10;
        this.f22692b = ocVar;
    }

    @Override
    public final void run() {
        switch (this.f22691a) {
            case 0:
                this.f22692b.b();
                return;
            case 1:
                oc ocVar = this.f22692b;
                FrameLayout frameLayout = ocVar.h;
                sb sbVar = ocVar.e;
                mb mbVar = ocVar.f26708p;
                if (mbVar != null && !sbVar.top) {
                    mbVar.c(0.0f);
                    ocVar.f26708p.d(ocVar);
                }
                sbVar.transitionRunningExit = false;
                sbVar.onExitTransitionEnd();
                sbVar.onHide();
                frameLayout.removeView(ocVar.f26699f);
                frameLayout.removeOnLayoutChangeListener(ocVar.f26698c);
                sbVar.onDetach();
                Runnable runnable = ocVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                oc ocVar2 = this.f22692b;
                FrameLayout frameLayout2 = ocVar2.h;
                frameLayout2.removeView(ocVar2.f26699f);
                frameLayout2.removeOnLayoutChangeListener(ocVar2.f26698c);
                return;
        }
    }
}

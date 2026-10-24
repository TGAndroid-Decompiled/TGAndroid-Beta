package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class bb implements Runnable {
    public final int f24959a;
    public final oc f24960b;

    public bb(oc ocVar, int i10) {
        this.f24959a = i10;
        this.f24960b = ocVar;
    }

    @Override
    public final void run() {
        switch (this.f24959a) {
            case 0:
                this.f24960b.b();
                return;
            case 1:
                oc ocVar = this.f24960b;
                FrameLayout frameLayout = ocVar.h;
                sb sbVar = ocVar.e;
                mb mbVar = ocVar.f29209p;
                if (mbVar != null && !sbVar.top) {
                    mbVar.c(0.0f);
                    ocVar.f29209p.d(ocVar);
                }
                sbVar.transitionRunningExit = false;
                sbVar.onExitTransitionEnd();
                sbVar.onHide();
                frameLayout.removeView(ocVar.f29200f);
                frameLayout.removeOnLayoutChangeListener(ocVar.f29199c);
                sbVar.onDetach();
                Runnable runnable = ocVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                oc ocVar2 = this.f24960b;
                FrameLayout frameLayout2 = ocVar2.h;
                frameLayout2.removeView(ocVar2.f29200f);
                frameLayout2.removeOnLayoutChangeListener(ocVar2.f29199c);
                return;
        }
    }
}

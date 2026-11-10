package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class oa implements Runnable {
    public final int f36553a;
    public final bc f36554b;

    public oa(bc bcVar, int i7) {
        this.f36553a = i7;
        this.f36554b = bcVar;
    }

    @Override
    public final void run() {
        switch (this.f36553a) {
            case 0:
                this.f36554b.b();
                return;
            case 1:
                bc bcVar = this.f36554b;
                FrameLayout frameLayout = bcVar.h;
                fb fbVar = bcVar.f32199e;
                za zaVar = bcVar.f32209p;
                if (zaVar != null && !fbVar.top) {
                    zaVar.c(0.0f);
                    bcVar.f32209p.d(bcVar);
                }
                fbVar.transitionRunningExit = false;
                fbVar.onExitTransitionEnd();
                fbVar.onHide();
                frameLayout.removeView(bcVar.f32200f);
                frameLayout.removeOnLayoutChangeListener(bcVar.f32198c);
                fbVar.onDetach();
                Runnable runnable = bcVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                bc bcVar2 = this.f36554b;
                FrameLayout frameLayout2 = bcVar2.h;
                frameLayout2.removeView(bcVar2.f32200f);
                frameLayout2.removeOnLayoutChangeListener(bcVar2.f32198c);
                return;
        }
    }
}

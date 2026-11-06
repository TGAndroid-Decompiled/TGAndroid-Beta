package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class pa implements Runnable {
    public final int f36831a;
    public final cc f36832b;

    public pa(cc ccVar, int i7) {
        this.f36831a = i7;
        this.f36832b = ccVar;
    }

    @Override
    public final void run() {
        switch (this.f36831a) {
            case 0:
                this.f36832b.b();
                return;
            case 1:
                cc ccVar = this.f36832b;
                FrameLayout frameLayout = ccVar.h;
                gb gbVar = ccVar.f32523e;
                ab abVar = ccVar.f32533p;
                if (abVar != null && !gbVar.top) {
                    abVar.c(0.0f);
                    ccVar.f32533p.d(ccVar);
                }
                gbVar.transitionRunningExit = false;
                gbVar.onExitTransitionEnd();
                gbVar.onHide();
                frameLayout.removeView(ccVar.f32524f);
                frameLayout.removeOnLayoutChangeListener(ccVar.f32522c);
                gbVar.onDetach();
                Runnable runnable = ccVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                cc ccVar2 = this.f36832b;
                FrameLayout frameLayout2 = ccVar2.h;
                frameLayout2.removeView(ccVar2.f32524f);
                frameLayout2.removeOnLayoutChangeListener(ccVar2.f32522c);
                return;
        }
    }
}

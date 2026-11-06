package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class pa implements Runnable {
    public final int f36847a;
    public final cc f36848b;

    public pa(cc ccVar, int i7) {
        this.f36847a = i7;
        this.f36848b = ccVar;
    }

    @Override
    public final void run() {
        switch (this.f36847a) {
            case 0:
                this.f36848b.b();
                return;
            case 1:
                cc ccVar = this.f36848b;
                FrameLayout frameLayout = ccVar.h;
                gb gbVar = ccVar.f32510e;
                ab abVar = ccVar.f32520p;
                if (abVar != null && !gbVar.top) {
                    abVar.c(0.0f);
                    ccVar.f32520p.d(ccVar);
                }
                gbVar.transitionRunningExit = false;
                gbVar.onExitTransitionEnd();
                gbVar.onHide();
                frameLayout.removeView(ccVar.f32511f);
                frameLayout.removeOnLayoutChangeListener(ccVar.f32509c);
                gbVar.onDetach();
                Runnable runnable = ccVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                cc ccVar2 = this.f36848b;
                FrameLayout frameLayout2 = ccVar2.h;
                frameLayout2.removeView(ccVar2.f32511f);
                frameLayout2.removeOnLayoutChangeListener(ccVar2.f32509c);
                return;
        }
    }
}

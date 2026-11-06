package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class pa implements Runnable {
    public final int f36952a;
    public final cc f36953b;

    public pa(cc ccVar, int i7) {
        this.f36952a = i7;
        this.f36953b = ccVar;
    }

    @Override
    public final void run() {
        switch (this.f36952a) {
            case 0:
                this.f36953b.b();
                return;
            case 1:
                cc ccVar = this.f36953b;
                FrameLayout frameLayout = ccVar.h;
                gb gbVar = ccVar.f32519e;
                ab abVar = ccVar.f32529p;
                if (abVar != null && !gbVar.top) {
                    abVar.c(0.0f);
                    ccVar.f32529p.d(ccVar);
                }
                gbVar.transitionRunningExit = false;
                gbVar.onExitTransitionEnd();
                gbVar.onHide();
                frameLayout.removeView(ccVar.f32520f);
                frameLayout.removeOnLayoutChangeListener(ccVar.f32518c);
                gbVar.onDetach();
                Runnable runnable = ccVar.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                cc ccVar2 = this.f36953b;
                FrameLayout frameLayout2 = ccVar2.h;
                frameLayout2.removeView(ccVar2.f32520f);
                frameLayout2.removeOnLayoutChangeListener(ccVar2.f32518c);
                return;
        }
    }
}

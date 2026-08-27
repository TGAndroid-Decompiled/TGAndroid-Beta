package org.telegram.ui;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.web.HttpGetFileTask;

public final class e0 implements Runnable {

    public final int f37577a;

    public final float f37578b;

    public final Object f37579c;

    public e0(Object obj, float f10, int i10) {
        this.f37577a = i10;
        this.f37579c = obj;
        this.f37578b = f10;
    }

    @Override
    public final void run() {
        switch (this.f37577a) {
            case 0:
                m4 m4Var = (m4) this.f37579c;
                m4Var.f40335d0.I.c(this.f37578b, true);
                break;
            case 1:
                org.telegram.ui.Components.xa xaVar = (org.telegram.ui.Components.xa) this.f37579c;
                if (xaVar.f34559a.getTranslationX() == this.f37578b) {
                    xaVar.f34569y.b();
                }
                break;
            case 2:
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.f37579c;
                float f10 = this.f37578b;
                eh1 eh1Var = x0Var.f33981c;
                if (f10 > 0.0f) {
                    int i10 = eh1Var.f33483w;
                    if (i10 < 2) {
                        eh1Var.c(i10 + 1, true);
                    }
                } else {
                    int i11 = eh1Var.f33483w;
                    if (i11 > 0) {
                        eh1Var.c(i11 - 1, true);
                    }
                }
                x0Var.f33980b = false;
                break;
            case 3:
                ((r70) this.f37579c).f41831f.f42797e.smoothScrollTo(0, (int) this.f37578b);
                break;
            case 4:
                ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat((String) this.f37579c, this.f37578b).commit();
                break;
            default:
                ((HttpGetFileTask) this.f37579c).lambda$doInBackground$0(this.f37578b);
                break;
        }
    }
}

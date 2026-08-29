package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class b70 implements View.OnClickListener {
    public final int f26994a;
    public final j70 f26995b;
    public final Runnable f26996c;

    public b70(j70 j70Var, Runnable runnable, int i10) {
        this.f26994a = i10;
        this.f26995b = j70Var;
        this.f26996c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26994a) {
            case 0:
                this.f26995b.u();
                Runnable runnable = this.f26996c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f26996c.run();
                j70 j70Var = this.f26995b;
                if (j70Var.J) {
                    j70Var.u();
                    return;
                }
                return;
            case 2:
                j70 j70Var2 = this.f26995b;
                Runnable runnable2 = this.f26996c;
                if (runnable2 != null) {
                    int i10 = -j70Var2.K;
                    j70Var2.K = i10;
                    AndroidUtilities.shakeViewSpring(view, i10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    runnable2.run();
                    return;
                }
                j70Var2.getClass();
                return;
            case 3:
                Runnable runnable3 = this.f26996c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                j70 j70Var3 = this.f26995b;
                if (j70Var3.J) {
                    j70Var3.u();
                    return;
                }
                return;
            case 4:
                this.f26996c.run();
                j70 j70Var4 = this.f26995b;
                if (j70Var4.J) {
                    j70Var4.u();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f26996c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                j70 j70Var5 = this.f26995b;
                if (j70Var5.J) {
                    j70Var5.u();
                    return;
                }
                return;
        }
    }
}

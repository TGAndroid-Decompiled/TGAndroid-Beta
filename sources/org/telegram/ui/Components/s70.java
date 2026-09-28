package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class s70 implements View.OnClickListener {
    public final int f28148a;
    public final a80 f28149b;
    public final Runnable f28150c;

    public s70(a80 a80Var, Runnable runnable, int i10) {
        this.f28148a = i10;
        this.f28149b = a80Var;
        this.f28150c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28148a) {
            case 0:
                this.f28149b.u();
                Runnable runnable = this.f28150c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f28150c.run();
                a80 a80Var = this.f28149b;
                if (a80Var.J) {
                    a80Var.u();
                    return;
                }
                return;
            case 2:
                a80 a80Var2 = this.f28149b;
                Runnable runnable2 = this.f28150c;
                if (runnable2 != null) {
                    int i10 = -a80Var2.K;
                    a80Var2.K = i10;
                    AndroidUtilities.shakeViewSpring(view, i10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    runnable2.run();
                    return;
                }
                a80Var2.getClass();
                return;
            case 3:
                Runnable runnable3 = this.f28150c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                a80 a80Var3 = this.f28149b;
                if (a80Var3.J) {
                    a80Var3.u();
                    return;
                }
                return;
            case 4:
                this.f28150c.run();
                a80 a80Var4 = this.f28149b;
                if (a80Var4.J) {
                    a80Var4.u();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f28150c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                a80 a80Var5 = this.f28149b;
                if (a80Var5.J) {
                    a80Var5.u();
                    return;
                }
                return;
        }
    }
}

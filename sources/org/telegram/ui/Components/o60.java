package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class o60 implements View.OnClickListener {
    public final int f31304a;
    public final x60 f31305b;
    public final Runnable f31306c;

    public o60(x60 x60Var, Runnable runnable, int i9) {
        this.f31304a = i9;
        this.f31305b = x60Var;
        this.f31306c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31304a) {
            case 0:
                this.f31305b.u();
                Runnable runnable = this.f31306c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f31306c.run();
                x60 x60Var = this.f31305b;
                if (x60Var.J) {
                    x60Var.u();
                    return;
                }
                return;
            case 2:
                x60 x60Var2 = this.f31305b;
                Runnable runnable2 = this.f31306c;
                if (runnable2 != null) {
                    int i9 = -x60Var2.K;
                    x60Var2.K = i9;
                    AndroidUtilities.shakeViewSpring(view, i9);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    runnable2.run();
                    return;
                }
                x60Var2.getClass();
                return;
            case 3:
                Runnable runnable3 = this.f31306c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                x60 x60Var3 = this.f31305b;
                if (x60Var3.J) {
                    x60Var3.u();
                    return;
                }
                return;
            case 4:
                this.f31306c.run();
                x60 x60Var4 = this.f31305b;
                if (x60Var4.J) {
                    x60Var4.u();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f31306c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                x60 x60Var5 = this.f31305b;
                if (x60Var5.J) {
                    x60Var5.u();
                    return;
                }
                return;
        }
    }
}

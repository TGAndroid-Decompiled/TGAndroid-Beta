package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class i80 implements View.OnClickListener {
    public final int f27209a;
    public final q80 f27210b;
    public final Runnable f27211c;

    public i80(q80 q80Var, Runnable runnable, int i10) {
        this.f27209a = i10;
        this.f27210b = q80Var;
        this.f27211c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27209a) {
            case 0:
                this.f27210b.u();
                Runnable runnable = this.f27211c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f27211c.run();
                q80 q80Var = this.f27210b;
                if (q80Var.J) {
                    q80Var.u();
                    return;
                }
                return;
            case 2:
                q80 q80Var2 = this.f27210b;
                Runnable runnable2 = this.f27211c;
                if (runnable2 != null) {
                    int i10 = -q80Var2.K;
                    q80Var2.K = i10;
                    AndroidUtilities.shakeViewSpring(view, i10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    runnable2.run();
                    return;
                }
                q80Var2.getClass();
                return;
            case 3:
                Runnable runnable3 = this.f27211c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                q80 q80Var3 = this.f27210b;
                if (q80Var3.J) {
                    q80Var3.u();
                    return;
                }
                return;
            case 4:
                this.f27211c.run();
                q80 q80Var4 = this.f27210b;
                if (q80Var4.J) {
                    q80Var4.u();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f27211c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                q80 q80Var5 = this.f27210b;
                if (q80Var5.J) {
                    q80Var5.u();
                    return;
                }
                return;
        }
    }
}

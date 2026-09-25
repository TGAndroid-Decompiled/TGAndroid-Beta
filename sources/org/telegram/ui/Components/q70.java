package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class q70 implements View.OnClickListener {
    public final int f27526a;
    public final y70 f27527b;
    public final Runnable f27528c;

    public q70(y70 y70Var, Runnable runnable, int i10) {
        this.f27526a = i10;
        this.f27527b = y70Var;
        this.f27528c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27526a) {
            case 0:
                this.f27527b.u();
                Runnable runnable = this.f27528c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f27528c.run();
                y70 y70Var = this.f27527b;
                if (y70Var.J) {
                    y70Var.u();
                    return;
                }
                return;
            case 2:
                y70 y70Var2 = this.f27527b;
                Runnable runnable2 = this.f27528c;
                if (runnable2 != null) {
                    int i10 = -y70Var2.K;
                    y70Var2.K = i10;
                    AndroidUtilities.shakeViewSpring(view, i10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    runnable2.run();
                    return;
                }
                y70Var2.getClass();
                return;
            case 3:
                Runnable runnable3 = this.f27528c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                y70 y70Var3 = this.f27527b;
                if (y70Var3.J) {
                    y70Var3.u();
                    return;
                }
                return;
            case 4:
                this.f27528c.run();
                y70 y70Var4 = this.f27527b;
                if (y70Var4.J) {
                    y70Var4.u();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f27528c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                y70 y70Var5 = this.f27527b;
                if (y70Var5.J) {
                    y70Var5.u();
                    return;
                }
                return;
        }
    }
}

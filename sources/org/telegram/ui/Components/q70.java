package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class q70 implements View.OnClickListener {
    public final int f27517a;
    public final y70 f27518b;
    public final Runnable f27519c;

    public q70(y70 y70Var, Runnable runnable, int i10) {
        this.f27517a = i10;
        this.f27518b = y70Var;
        this.f27519c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27517a) {
            case 0:
                this.f27518b.u();
                Runnable runnable = this.f27519c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f27519c.run();
                y70 y70Var = this.f27518b;
                if (y70Var.J) {
                    y70Var.u();
                    return;
                }
                return;
            case 2:
                y70 y70Var2 = this.f27518b;
                Runnable runnable2 = this.f27519c;
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
                Runnable runnable3 = this.f27519c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                y70 y70Var3 = this.f27518b;
                if (y70Var3.J) {
                    y70Var3.u();
                    return;
                }
                return;
            case 4:
                this.f27519c.run();
                y70 y70Var4 = this.f27518b;
                if (y70Var4.J) {
                    y70Var4.u();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f27519c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                y70 y70Var5 = this.f27518b;
                if (y70Var5.J) {
                    y70Var5.u();
                    return;
                }
                return;
        }
    }
}

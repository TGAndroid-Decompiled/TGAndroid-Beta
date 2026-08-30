package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class g70 implements View.OnClickListener {
    public final int f25068a;
    public final o70 f25069b;
    public final Runnable f25070c;

    public g70(o70 o70Var, Runnable runnable, int i10) {
        this.f25068a = i10;
        this.f25069b = o70Var;
        this.f25070c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25068a) {
            case 0:
                this.f25069b.u();
                Runnable runnable = this.f25070c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f25070c.run();
                o70 o70Var = this.f25069b;
                if (o70Var.J) {
                    o70Var.u();
                    return;
                }
                return;
            case 2:
                o70 o70Var2 = this.f25069b;
                Runnable runnable2 = this.f25070c;
                if (runnable2 != null) {
                    int i10 = -o70Var2.K;
                    o70Var2.K = i10;
                    AndroidUtilities.shakeViewSpring(view, i10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    runnable2.run();
                    return;
                }
                o70Var2.getClass();
                return;
            case 3:
                Runnable runnable3 = this.f25070c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                o70 o70Var3 = this.f25069b;
                if (o70Var3.J) {
                    o70Var3.u();
                    return;
                }
                return;
            case 4:
                this.f25070c.run();
                o70 o70Var4 = this.f25069b;
                if (o70Var4.J) {
                    o70Var4.u();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f25070c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                o70 o70Var5 = this.f25069b;
                if (o70Var5.J) {
                    o70Var5.u();
                    return;
                }
                return;
        }
    }
}

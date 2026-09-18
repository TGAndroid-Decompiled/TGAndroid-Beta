package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class f70 implements View.OnClickListener {
    public final int f23808a;
    public final n70 f23809b;
    public final Runnable f23810c;

    public f70(n70 n70Var, Runnable runnable, int i10) {
        this.f23808a = i10;
        this.f23809b = n70Var;
        this.f23810c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23808a) {
            case 0:
                this.f23809b.u();
                Runnable runnable = this.f23810c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f23810c.run();
                n70 n70Var = this.f23809b;
                if (n70Var.J) {
                    n70Var.u();
                    return;
                }
                return;
            case 2:
                n70 n70Var2 = this.f23809b;
                Runnable runnable2 = this.f23810c;
                if (runnable2 != null) {
                    int i10 = -n70Var2.K;
                    n70Var2.K = i10;
                    AndroidUtilities.shakeViewSpring(view, i10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    runnable2.run();
                    return;
                }
                n70Var2.getClass();
                return;
            case 3:
                Runnable runnable3 = this.f23810c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                n70 n70Var3 = this.f23809b;
                if (n70Var3.J) {
                    n70Var3.u();
                    return;
                }
                return;
            case 4:
                this.f23810c.run();
                n70 n70Var4 = this.f23809b;
                if (n70Var4.J) {
                    n70Var4.u();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f23810c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                n70 n70Var5 = this.f23809b;
                if (n70Var5.J) {
                    n70Var5.u();
                    return;
                }
                return;
        }
    }
}

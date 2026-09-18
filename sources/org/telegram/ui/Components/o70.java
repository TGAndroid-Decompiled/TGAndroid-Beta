package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class o70 implements View.OnClickListener {
    public final int f26895a;
    public final w70 f26896b;
    public final Runnable f26897c;

    public o70(w70 w70Var, Runnable runnable, int i10) {
        this.f26895a = i10;
        this.f26896b = w70Var;
        this.f26897c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26895a) {
            case 0:
                this.f26896b.u();
                Runnable runnable = this.f26897c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f26897c.run();
                w70 w70Var = this.f26896b;
                if (w70Var.J) {
                    w70Var.u();
                    return;
                }
                return;
            case 2:
                w70 w70Var2 = this.f26896b;
                Runnable runnable2 = this.f26897c;
                if (runnable2 != null) {
                    int i10 = -w70Var2.K;
                    w70Var2.K = i10;
                    AndroidUtilities.shakeViewSpring(view, i10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    runnable2.run();
                    return;
                }
                w70Var2.getClass();
                return;
            case 3:
                Runnable runnable3 = this.f26897c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                w70 w70Var3 = this.f26896b;
                if (w70Var3.J) {
                    w70Var3.u();
                    return;
                }
                return;
            case 4:
                this.f26897c.run();
                w70 w70Var4 = this.f26896b;
                if (w70Var4.J) {
                    w70Var4.u();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f26897c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                w70 w70Var5 = this.f26896b;
                if (w70Var5.J) {
                    w70Var5.u();
                    return;
                }
                return;
        }
    }
}

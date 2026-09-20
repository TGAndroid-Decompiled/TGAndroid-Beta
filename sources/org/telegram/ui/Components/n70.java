package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class n70 implements View.OnClickListener {
    public final int f26602a;
    public final v70 f26603b;
    public final Runnable f26604c;

    public n70(v70 v70Var, Runnable runnable, int i10) {
        this.f26602a = i10;
        this.f26603b = v70Var;
        this.f26604c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26602a) {
            case 0:
                this.f26603b.u();
                Runnable runnable = this.f26604c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f26604c.run();
                v70 v70Var = this.f26603b;
                if (v70Var.J) {
                    v70Var.u();
                    return;
                }
                return;
            case 2:
                v70 v70Var2 = this.f26603b;
                Runnable runnable2 = this.f26604c;
                if (runnable2 != null) {
                    int i10 = -v70Var2.K;
                    v70Var2.K = i10;
                    AndroidUtilities.shakeViewSpring(view, i10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    runnable2.run();
                    return;
                }
                v70Var2.getClass();
                return;
            case 3:
                Runnable runnable3 = this.f26604c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                v70 v70Var3 = this.f26603b;
                if (v70Var3.J) {
                    v70Var3.u();
                    return;
                }
                return;
            case 4:
                this.f26604c.run();
                v70 v70Var4 = this.f26603b;
                if (v70Var4.J) {
                    v70Var4.u();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f26604c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                v70 v70Var5 = this.f26603b;
                if (v70Var5.J) {
                    v70Var5.u();
                    return;
                }
                return;
        }
    }
}

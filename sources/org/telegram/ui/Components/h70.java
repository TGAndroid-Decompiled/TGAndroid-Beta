package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class h70 implements View.OnClickListener {
    public final int f25326a;
    public final p70 f25327b;
    public final Runnable f25328c;

    public h70(p70 p70Var, Runnable runnable, int i10) {
        this.f25326a = i10;
        this.f25327b = p70Var;
        this.f25328c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25326a) {
            case 0:
                this.f25327b.u();
                Runnable runnable = this.f25328c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f25328c.run();
                p70 p70Var = this.f25327b;
                if (p70Var.J) {
                    p70Var.u();
                    return;
                }
                return;
            case 2:
                p70 p70Var2 = this.f25327b;
                Runnable runnable2 = this.f25328c;
                if (runnable2 != null) {
                    int i10 = -p70Var2.K;
                    p70Var2.K = i10;
                    AndroidUtilities.shakeViewSpring(view, i10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    runnable2.run();
                    return;
                }
                p70Var2.getClass();
                return;
            case 3:
                Runnable runnable3 = this.f25328c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                p70 p70Var3 = this.f25327b;
                if (p70Var3.J) {
                    p70Var3.u();
                    return;
                }
                return;
            case 4:
                this.f25328c.run();
                p70 p70Var4 = this.f25327b;
                if (p70Var4.J) {
                    p70Var4.u();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f25328c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                p70 p70Var5 = this.f25327b;
                if (p70Var5.J) {
                    p70Var5.u();
                    return;
                }
                return;
        }
    }
}

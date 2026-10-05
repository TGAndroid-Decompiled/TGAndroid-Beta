package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class t70 implements View.OnClickListener {
    public final int f31073a;
    public final b80 f31074b;
    public final Runnable f31075c;

    public t70(b80 b80Var, Runnable runnable, int i10) {
        this.f31073a = i10;
        this.f31074b = b80Var;
        this.f31075c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31073a) {
            case 0:
                this.f31074b.u();
                Runnable runnable = this.f31075c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f31075c.run();
                b80 b80Var = this.f31074b;
                if (b80Var.J) {
                    b80Var.u();
                    return;
                }
                return;
            case 2:
                b80 b80Var2 = this.f31074b;
                Runnable runnable2 = this.f31075c;
                if (runnable2 != null) {
                    int i10 = -b80Var2.K;
                    b80Var2.K = i10;
                    AndroidUtilities.shakeViewSpring(view, i10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    runnable2.run();
                    return;
                }
                b80Var2.getClass();
                return;
            case 3:
                Runnable runnable3 = this.f31075c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                b80 b80Var3 = this.f31074b;
                if (b80Var3.J) {
                    b80Var3.u();
                    return;
                }
                return;
            case 4:
                this.f31075c.run();
                b80 b80Var4 = this.f31074b;
                if (b80Var4.J) {
                    b80Var4.u();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f31075c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                b80 b80Var5 = this.f31074b;
                if (b80Var5.J) {
                    b80Var5.u();
                    return;
                }
                return;
        }
    }
}

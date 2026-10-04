package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class t70 implements View.OnClickListener {
    public final int f30986a;
    public final b80 f30987b;
    public final Runnable f30988c;

    public t70(b80 b80Var, Runnable runnable, int i10) {
        this.f30986a = i10;
        this.f30987b = b80Var;
        this.f30988c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30986a) {
            case 0:
                this.f30987b.u();
                Runnable runnable = this.f30988c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f30988c.run();
                b80 b80Var = this.f30987b;
                if (b80Var.J) {
                    b80Var.u();
                    return;
                }
                return;
            case 2:
                b80 b80Var2 = this.f30987b;
                Runnable runnable2 = this.f30988c;
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
                Runnable runnable3 = this.f30988c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                b80 b80Var3 = this.f30987b;
                if (b80Var3.J) {
                    b80Var3.u();
                    return;
                }
                return;
            case 4:
                this.f30988c.run();
                b80 b80Var4 = this.f30987b;
                if (b80Var4.J) {
                    b80Var4.u();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f30988c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                b80 b80Var5 = this.f30987b;
                if (b80Var5.J) {
                    b80Var5.u();
                    return;
                }
                return;
        }
    }
}

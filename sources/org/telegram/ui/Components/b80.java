package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class b80 implements View.OnClickListener {
    public final int f24978a;
    public final j80 f24979b;
    public final Runnable f24980c;

    public b80(j80 j80Var, Runnable runnable, int i10) {
        this.f24978a = i10;
        this.f24979b = j80Var;
        this.f24980c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24978a) {
            case 0:
                this.f24979b.u();
                Runnable runnable = this.f24980c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f24980c.run();
                j80 j80Var = this.f24979b;
                if (j80Var.J) {
                    j80Var.u();
                    return;
                }
                return;
            case 2:
                j80 j80Var2 = this.f24979b;
                Runnable runnable2 = this.f24980c;
                if (runnable2 != null) {
                    int i10 = -j80Var2.K;
                    j80Var2.K = i10;
                    AndroidUtilities.shakeViewSpring(view, i10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    runnable2.run();
                    return;
                }
                j80Var2.getClass();
                return;
            case 3:
                Runnable runnable3 = this.f24980c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                j80 j80Var3 = this.f24979b;
                if (j80Var3.J) {
                    j80Var3.u();
                    return;
                }
                return;
            case 4:
                this.f24980c.run();
                j80 j80Var4 = this.f24979b;
                if (j80Var4.J) {
                    j80Var4.u();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f24980c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                j80 j80Var5 = this.f24979b;
                if (j80Var5.J) {
                    j80Var5.u();
                    return;
                }
                return;
        }
    }
}

package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class h80 implements View.OnClickListener {
    public final int f26990a;
    public final p80 f26991b;
    public final Runnable f26992c;

    public h80(p80 p80Var, Runnable runnable, int i10) {
        this.f26990a = i10;
        this.f26991b = p80Var;
        this.f26992c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26990a) {
            case 0:
                this.f26991b.u();
                Runnable runnable = this.f26992c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f26992c.run();
                p80 p80Var = this.f26991b;
                if (p80Var.J) {
                    p80Var.u();
                    return;
                }
                return;
            case 2:
                p80 p80Var2 = this.f26991b;
                Runnable runnable2 = this.f26992c;
                if (runnable2 != null) {
                    int i10 = -p80Var2.K;
                    p80Var2.K = i10;
                    AndroidUtilities.shakeViewSpring(view, i10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    runnable2.run();
                    return;
                }
                p80Var2.getClass();
                return;
            case 3:
                Runnable runnable3 = this.f26992c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                p80 p80Var3 = this.f26991b;
                if (p80Var3.J) {
                    p80Var3.u();
                    return;
                }
                return;
            case 4:
                this.f26992c.run();
                p80 p80Var4 = this.f26991b;
                if (p80Var4.J) {
                    p80Var4.u();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f26992c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                p80 p80Var5 = this.f26991b;
                if (p80Var5.J) {
                    p80Var5.u();
                    return;
                }
                return;
        }
    }
}

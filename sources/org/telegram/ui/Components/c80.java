package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class c80 implements View.OnClickListener {
    public final int f27087a;
    public final k80 f27088b;
    public final Runnable f27089c;

    public c80(k80 k80Var, Runnable runnable, int i10) {
        this.f27087a = i10;
        this.f27088b = k80Var;
        this.f27089c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27087a) {
            case 0:
                this.f27088b.u();
                Runnable runnable = this.f27089c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f27089c.run();
                k80 k80Var = this.f27088b;
                if (k80Var.J) {
                    k80Var.u();
                    return;
                }
                return;
            case 2:
                k80 k80Var2 = this.f27088b;
                Runnable runnable2 = this.f27089c;
                if (runnable2 != null) {
                    int i10 = -k80Var2.K;
                    k80Var2.K = i10;
                    AndroidUtilities.shakeViewSpring(view, i10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    runnable2.run();
                    return;
                }
                k80Var2.getClass();
                return;
            case 3:
                Runnable runnable3 = this.f27089c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                k80 k80Var3 = this.f27088b;
                if (k80Var3.J) {
                    k80Var3.u();
                    return;
                }
                return;
            case 4:
                this.f27089c.run();
                k80 k80Var4 = this.f27088b;
                if (k80Var4.J) {
                    k80Var4.u();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f27089c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                k80 k80Var5 = this.f27088b;
                if (k80Var5.J) {
                    k80Var5.u();
                    return;
                }
                return;
        }
    }
}

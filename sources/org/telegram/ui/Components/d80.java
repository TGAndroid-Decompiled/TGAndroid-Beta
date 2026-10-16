package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class d80 implements View.OnClickListener {
    public final int f24007a;
    public final l80 f24008b;
    public final Runnable f24009c;

    public d80(l80 l80Var, Runnable runnable, int i10) {
        this.f24007a = i10;
        this.f24008b = l80Var;
        this.f24009c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24007a) {
            case 0:
                this.f24008b.u();
                Runnable runnable = this.f24009c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f24009c.run();
                l80 l80Var = this.f24008b;
                if (l80Var.J) {
                    l80Var.u();
                    return;
                }
                return;
            case 2:
                l80 l80Var2 = this.f24008b;
                Runnable runnable2 = this.f24009c;
                if (runnable2 != null) {
                    int i10 = -l80Var2.K;
                    l80Var2.K = i10;
                    AndroidUtilities.shakeViewSpring(view, i10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    runnable2.run();
                    return;
                }
                l80Var2.getClass();
                return;
            case 3:
                Runnable runnable3 = this.f24009c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                l80 l80Var3 = this.f24008b;
                if (l80Var3.J) {
                    l80Var3.u();
                    return;
                }
                return;
            case 4:
                this.f24009c.run();
                l80 l80Var4 = this.f24008b;
                if (l80Var4.J) {
                    l80Var4.u();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f24009c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                l80 l80Var5 = this.f24008b;
                if (l80Var5.J) {
                    l80Var5.u();
                    return;
                }
                return;
        }
    }
}

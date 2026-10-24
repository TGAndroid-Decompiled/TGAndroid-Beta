package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class z70 implements View.OnClickListener {
    public final int f33166a;
    public final h80 f33167b;
    public final Runnable f33168c;

    public z70(h80 h80Var, Runnable runnable, int i10) {
        this.f33166a = i10;
        this.f33167b = h80Var;
        this.f33168c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33166a) {
            case 0:
                this.f33167b.u();
                Runnable runnable = this.f33168c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f33168c.run();
                h80 h80Var = this.f33167b;
                if (h80Var.J) {
                    h80Var.u();
                    return;
                }
                return;
            case 2:
                h80 h80Var2 = this.f33167b;
                Runnable runnable2 = this.f33168c;
                if (runnable2 != null) {
                    int i10 = -h80Var2.K;
                    h80Var2.K = i10;
                    AndroidUtilities.shakeViewSpring(view, i10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    runnable2.run();
                    return;
                }
                h80Var2.getClass();
                return;
            case 3:
                Runnable runnable3 = this.f33168c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                h80 h80Var3 = this.f33167b;
                if (h80Var3.J) {
                    h80Var3.u();
                    return;
                }
                return;
            case 4:
                this.f33168c.run();
                h80 h80Var4 = this.f33167b;
                if (h80Var4.J) {
                    h80Var4.u();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f33168c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                h80 h80Var5 = this.f33167b;
                if (h80Var5.J) {
                    h80Var5.u();
                    return;
                }
                return;
        }
    }
}

package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class z70 implements View.OnClickListener {
    public final int f32858a;
    public final i80 f32859b;
    public final Runnable f32860c;

    public z70(i80 i80Var, Runnable runnable, int i10) {
        this.f32858a = i10;
        this.f32859b = i80Var;
        this.f32860c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32858a) {
            case 0:
                this.f32859b.u();
                Runnable runnable = this.f32860c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f32860c.run();
                i80 i80Var = this.f32859b;
                if (i80Var.J) {
                    i80Var.u();
                    return;
                }
                return;
            case 2:
                i80 i80Var2 = this.f32859b;
                Runnable runnable2 = this.f32860c;
                if (runnable2 != null) {
                    int i10 = -i80Var2.K;
                    i80Var2.K = i10;
                    AndroidUtilities.shakeViewSpring(view, i10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    runnable2.run();
                    return;
                }
                i80Var2.getClass();
                return;
            case 3:
                Runnable runnable3 = this.f32860c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                i80 i80Var3 = this.f32859b;
                if (i80Var3.J) {
                    i80Var3.u();
                    return;
                }
                return;
            case 4:
                this.f32860c.run();
                i80 i80Var4 = this.f32859b;
                if (i80Var4.J) {
                    i80Var4.u();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f32860c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                i80 i80Var5 = this.f32859b;
                if (i80Var5.J) {
                    i80Var5.u();
                    return;
                }
                return;
        }
    }
}

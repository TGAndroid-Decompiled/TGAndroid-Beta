package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class r70 implements View.OnClickListener {
    public final int f27848a;
    public final z70 f27849b;
    public final Runnable f27850c;

    public r70(z70 z70Var, Runnable runnable, int i10) {
        this.f27848a = i10;
        this.f27849b = z70Var;
        this.f27850c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27848a) {
            case 0:
                this.f27849b.u();
                Runnable runnable = this.f27850c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f27850c.run();
                z70 z70Var = this.f27849b;
                if (z70Var.J) {
                    z70Var.u();
                    return;
                }
                return;
            case 2:
                z70 z70Var2 = this.f27849b;
                Runnable runnable2 = this.f27850c;
                if (runnable2 != null) {
                    int i10 = -z70Var2.K;
                    z70Var2.K = i10;
                    AndroidUtilities.shakeViewSpring(view, i10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    runnable2.run();
                    return;
                }
                z70Var2.getClass();
                return;
            case 3:
                Runnable runnable3 = this.f27850c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                z70 z70Var3 = this.f27849b;
                if (z70Var3.J) {
                    z70Var3.u();
                    return;
                }
                return;
            case 4:
                this.f27850c.run();
                z70 z70Var4 = this.f27849b;
                if (z70Var4.J) {
                    z70Var4.u();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f27850c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                z70 z70Var5 = this.f27849b;
                if (z70Var5.J) {
                    z70Var5.u();
                    return;
                }
                return;
        }
    }
}

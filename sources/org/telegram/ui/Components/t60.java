package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;

public final class t60 implements View.OnClickListener {

    public final int f32657a;

    public final b70 f32658b;

    public final Runnable f32659c;

    public t60(b70 b70Var, Runnable runnable, int i10) {
        this.f32657a = i10;
        this.f32658b = b70Var;
        this.f32659c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32657a) {
            case 0:
                this.f32658b.u();
                Runnable runnable = this.f32659c;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 1:
                this.f32659c.run();
                b70 b70Var = this.f32658b;
                if (b70Var.J) {
                    b70Var.u();
                }
                break;
            case 2:
                b70 b70Var2 = this.f32658b;
                Runnable runnable2 = this.f32659c;
                if (runnable2 == null) {
                    b70Var2.getClass();
                } else {
                    int i10 = -b70Var2.K;
                    b70Var2.K = i10;
                    AndroidUtilities.shakeViewSpring(view, i10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    runnable2.run();
                }
                break;
            case 3:
                Runnable runnable3 = this.f32659c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                b70 b70Var3 = this.f32658b;
                if (b70Var3.J) {
                    b70Var3.u();
                }
                break;
            case 4:
                this.f32659c.run();
                b70 b70Var4 = this.f32658b;
                if (b70Var4.J) {
                    b70Var4.u();
                }
                break;
            default:
                Runnable runnable4 = this.f32659c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                b70 b70Var5 = this.f32658b;
                if (b70Var5.J) {
                    b70Var5.u();
                }
                break;
        }
    }
}

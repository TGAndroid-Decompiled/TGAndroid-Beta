package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class i70 implements View.OnClickListener {
    public final int f27682a;
    public final q70 f27683b;
    public final Runnable f27684c;

    public i70(q70 q70Var, Runnable runnable, int i10) {
        this.f27682a = i10;
        this.f27683b = q70Var;
        this.f27684c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27682a) {
            case 0:
                this.f27683b.u();
                Runnable runnable = this.f27684c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f27684c.run();
                q70 q70Var = this.f27683b;
                if (q70Var.J) {
                    q70Var.u();
                    return;
                }
                return;
            case 2:
                q70 q70Var2 = this.f27683b;
                Runnable runnable2 = this.f27684c;
                if (runnable2 != null) {
                    int i10 = -q70Var2.K;
                    q70Var2.K = i10;
                    AndroidUtilities.shakeViewSpring(view, i10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    runnable2.run();
                    return;
                }
                q70Var2.getClass();
                return;
            case 3:
                Runnable runnable3 = this.f27684c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                q70 q70Var3 = this.f27683b;
                if (q70Var3.J) {
                    q70Var3.u();
                    return;
                }
                return;
            case 4:
                this.f27684c.run();
                q70 q70Var4 = this.f27683b;
                if (q70Var4.J) {
                    q70Var4.u();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f27684c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                q70 q70Var5 = this.f27683b;
                if (q70Var5.J) {
                    q70Var5.u();
                    return;
                }
                return;
        }
    }
}

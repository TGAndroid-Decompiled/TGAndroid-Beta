package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class k80 implements View.OnClickListener {
    public final int f27783a;
    public final s80 f27784b;
    public final Runnable f27785c;

    public k80(s80 s80Var, Runnable runnable, int i10) {
        this.f27783a = i10;
        this.f27784b = s80Var;
        this.f27785c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27783a) {
            case 0:
                this.f27784b.u();
                Runnable runnable = this.f27785c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f27785c.run();
                s80 s80Var = this.f27784b;
                if (s80Var.J) {
                    s80Var.u();
                    return;
                }
                return;
            case 2:
                s80 s80Var2 = this.f27784b;
                Runnable runnable2 = this.f27785c;
                if (runnable2 != null) {
                    int i10 = -s80Var2.K;
                    s80Var2.K = i10;
                    AndroidUtilities.shakeViewSpring(view, i10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    runnable2.run();
                    return;
                }
                s80Var2.getClass();
                return;
            case 3:
                Runnable runnable3 = this.f27785c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                s80 s80Var3 = this.f27784b;
                if (s80Var3.J) {
                    s80Var3.u();
                    return;
                }
                return;
            case 4:
                this.f27785c.run();
                s80 s80Var4 = this.f27784b;
                if (s80Var4.J) {
                    s80Var4.u();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f27785c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                s80 s80Var5 = this.f27784b;
                if (s80Var5.J) {
                    s80Var5.u();
                    return;
                }
                return;
        }
    }
}

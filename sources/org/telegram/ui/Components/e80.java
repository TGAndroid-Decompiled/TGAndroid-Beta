package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class e80 implements View.OnClickListener {
    public final int f24627a;
    public final m80 f24628b;
    public final Runnable f24629c;

    public e80(m80 m80Var, Runnable runnable, int i10) {
        this.f24627a = i10;
        this.f24628b = m80Var;
        this.f24629c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24627a) {
            case 0:
                this.f24628b.u();
                Runnable runnable = this.f24629c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f24629c.run();
                m80 m80Var = this.f24628b;
                if (m80Var.J) {
                    m80Var.u();
                    return;
                }
                return;
            case 2:
                m80 m80Var2 = this.f24628b;
                Runnable runnable2 = this.f24629c;
                if (runnable2 != null) {
                    int i10 = -m80Var2.K;
                    m80Var2.K = i10;
                    AndroidUtilities.shakeViewSpring(view, i10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    runnable2.run();
                    return;
                }
                m80Var2.getClass();
                return;
            case 3:
                Runnable runnable3 = this.f24629c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                m80 m80Var3 = this.f24628b;
                if (m80Var3.J) {
                    m80Var3.u();
                    return;
                }
                return;
            case 4:
                this.f24629c.run();
                m80 m80Var4 = this.f24628b;
                if (m80Var4.J) {
                    m80Var4.u();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f24629c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                m80 m80Var5 = this.f24628b;
                if (m80Var5.J) {
                    m80Var5.u();
                    return;
                }
                return;
        }
    }
}

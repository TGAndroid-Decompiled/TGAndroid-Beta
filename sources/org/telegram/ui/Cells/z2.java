package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class z2 implements View.OnClickListener {
    public final int f23790a;
    public final FrameLayout f23791b;
    public final Object f23792c;

    public z2(FrameLayout frameLayout, Object obj, int i10) {
        this.f23790a = i10;
        this.f23791b = frameLayout;
        this.f23792c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23790a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f23792c;
                if (((a3) this.f23791b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                ci.d dVar = (ci.d) this.f23791b;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f23792c;
                if (dVar.F > 0) {
                    AndroidUtilities.shakeViewSpring(dVar, 3.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
                e3Var.dismiss();
                return;
        }
    }
}

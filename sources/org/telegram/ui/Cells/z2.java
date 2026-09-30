package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class z2 implements View.OnClickListener {
    public final int f21927a;
    public final FrameLayout f21928b;
    public final Object f21929c;

    public z2(FrameLayout frameLayout, Object obj, int i10) {
        this.f21927a = i10;
        this.f21928b = frameLayout;
        this.f21929c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21927a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f21929c;
                if (((a3) this.f21928b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                ci.d dVar = (ci.d) this.f21928b;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f21929c;
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

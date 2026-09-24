package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class z2 implements View.OnClickListener {
    public final int f21891a;
    public final FrameLayout f21892b;
    public final Object f21893c;

    public z2(FrameLayout frameLayout, Object obj, int i10) {
        this.f21891a = i10;
        this.f21892b = frameLayout;
        this.f21893c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21891a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f21893c;
                if (((a3) this.f21892b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                ci.d dVar = (ci.d) this.f21892b;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f21893c;
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

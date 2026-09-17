package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class y2 implements View.OnClickListener {
    public final int f21662a;
    public final FrameLayout f21663b;
    public final Object f21664c;

    public y2(FrameLayout frameLayout, Object obj, int i10) {
        this.f21662a = i10;
        this.f21663b = frameLayout;
        this.f21664c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21662a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f21664c;
                if (((z2) this.f21663b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                ci.d dVar = (ci.d) this.f21663b;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f21664c;
                if (dVar.F > 0) {
                    AndroidUtilities.shakeViewSpring(dVar, 3.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
                g3Var.dismiss();
                return;
        }
    }
}

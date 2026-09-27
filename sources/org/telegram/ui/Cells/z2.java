package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class z2 implements View.OnClickListener {
    public final int f21908a;
    public final FrameLayout f21909b;
    public final Object f21910c;

    public z2(FrameLayout frameLayout, Object obj, int i10) {
        this.f21908a = i10;
        this.f21909b = frameLayout;
        this.f21910c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21908a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f21910c;
                if (((a3) this.f21909b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                ci.d dVar = (ci.d) this.f21909b;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f21910c;
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

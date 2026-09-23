package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class y2 implements View.OnClickListener {
    public final int f21625a;
    public final FrameLayout f21626b;
    public final Object f21627c;

    public y2(FrameLayout frameLayout, Object obj, int i10) {
        this.f21625a = i10;
        this.f21626b = frameLayout;
        this.f21627c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21625a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f21627c;
                if (((z2) this.f21626b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                ci.d dVar = (ci.d) this.f21626b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f21627c;
                if (dVar.F > 0) {
                    AndroidUtilities.shakeViewSpring(dVar, 3.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
                f3Var.dismiss();
                return;
        }
    }
}

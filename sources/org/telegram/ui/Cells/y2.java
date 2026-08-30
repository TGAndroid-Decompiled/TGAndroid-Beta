package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class y2 implements View.OnClickListener {
    public final int f22609a;
    public final FrameLayout f22610b;
    public final Object f22611c;

    public y2(FrameLayout frameLayout, Object obj, int i10) {
        this.f22609a = i10;
        this.f22610b = frameLayout;
        this.f22611c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22609a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f22611c;
                if (((z2) this.f22610b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                ph.d dVar = (ph.d) this.f22610b;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f22611c;
                if (dVar.C > 0) {
                    AndroidUtilities.shakeViewSpring(dVar, 3.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
                g3Var.dismiss();
                return;
        }
    }
}

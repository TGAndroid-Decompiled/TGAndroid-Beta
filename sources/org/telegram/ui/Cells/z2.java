package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class z2 implements View.OnClickListener {
    public final int f22802a;
    public final FrameLayout f22803b;
    public final Object f22804c;

    public z2(FrameLayout frameLayout, Object obj, int i10) {
        this.f22802a = i10;
        this.f22803b = frameLayout;
        this.f22804c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22802a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f22804c;
                if (((a3) this.f22803b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                di.d dVar = (di.d) this.f22803b;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f22804c;
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

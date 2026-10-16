package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class z2 implements View.OnClickListener {
    public final int f22500a;
    public final FrameLayout f22501b;
    public final Object f22502c;

    public z2(FrameLayout frameLayout, Object obj, int i10) {
        this.f22500a = i10;
        this.f22501b = frameLayout;
        this.f22502c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22500a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f22502c;
                if (((a3) this.f22501b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                di.d dVar = (di.d) this.f22501b;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f22502c;
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

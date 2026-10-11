package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class z2 implements View.OnClickListener {
    public final int f23826a;
    public final FrameLayout f23827b;
    public final Object f23828c;

    public z2(FrameLayout frameLayout, Object obj, int i10) {
        this.f23826a = i10;
        this.f23827b = frameLayout;
        this.f23828c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23826a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f23828c;
                if (((a3) this.f23827b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                ci.d dVar = (ci.d) this.f23827b;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f23828c;
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

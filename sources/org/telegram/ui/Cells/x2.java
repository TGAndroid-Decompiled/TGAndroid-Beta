package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class x2 implements View.OnClickListener {
    public final int f23943a;
    public final FrameLayout f23944b;
    public final Object f23945c;

    public x2(FrameLayout frameLayout, Object obj, int i10) {
        this.f23943a = i10;
        this.f23944b = frameLayout;
        this.f23945c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23943a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f23945c;
                if (((y2) this.f23944b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                ei.d dVar = (ei.d) this.f23944b;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f23945c;
                if (dVar.I > 0) {
                    AndroidUtilities.shakeViewSpring(dVar, 3.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
                h3Var.dismiss();
                return;
        }
    }
}

package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;

public final class w2 implements View.OnClickListener {

    public final int f25843a;

    public final FrameLayout f25844b;

    public final Object f25845c;

    public w2(FrameLayout frameLayout, Object obj, int i10) {
        this.f25843a = i10;
        this.f25844b = frameLayout;
        this.f25845c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25843a) {
            case 0:
                x2 x2Var = (x2) this.f25844b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.f25845c;
                if (x2Var.getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            default:
                lh.d dVar = (lh.d) this.f25844b;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f25845c;
                if (dVar.B <= 0) {
                    e3Var.dismiss();
                } else {
                    AndroidUtilities.shakeViewSpring(dVar, 3.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                }
                break;
        }
    }
}

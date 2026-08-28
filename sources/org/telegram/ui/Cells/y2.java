package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class y2 implements View.OnClickListener {
    public final int f25982a;
    public final FrameLayout f25983b;
    public final Object f25984c;

    public y2(FrameLayout frameLayout, Object obj, int i9) {
        this.f25982a = i9;
        this.f25983b = frameLayout;
        this.f25984c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25982a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f25984c;
                if (((z2) this.f25983b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                kh.d dVar = (kh.d) this.f25983b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f25984c;
                if (dVar.B > 0) {
                    AndroidUtilities.shakeViewSpring(dVar, 3.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
                f3Var.dismiss();
                return;
        }
    }
}

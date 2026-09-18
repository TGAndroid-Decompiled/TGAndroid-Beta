package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class z2 implements View.OnClickListener {
    public final int f21870a;
    public final FrameLayout f21871b;
    public final Object f21872c;

    public z2(FrameLayout frameLayout, Object obj, int i10) {
        this.f21870a = i10;
        this.f21871b = frameLayout;
        this.f21872c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21870a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f21872c;
                if (((a3) this.f21871b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                ci.d dVar = (ci.d) this.f21871b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f21872c;
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

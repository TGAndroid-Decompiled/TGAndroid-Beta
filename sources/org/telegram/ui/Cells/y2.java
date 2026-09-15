package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class y2 implements View.OnClickListener {
    public final int f21652a;
    public final FrameLayout f21653b;
    public final Object f21654c;

    public y2(FrameLayout frameLayout, Object obj, int i10) {
        this.f21652a = i10;
        this.f21653b = frameLayout;
        this.f21654c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21652a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f21654c;
                if (((z2) this.f21653b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                ci.d dVar = (ci.d) this.f21653b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f21654c;
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

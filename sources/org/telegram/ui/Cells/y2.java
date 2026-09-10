package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class y2 implements View.OnClickListener {
    public final int f20746a;
    public final FrameLayout f20747b;
    public final Object f20748c;

    public y2(FrameLayout frameLayout, Object obj, int i10) {
        this.f20746a = i10;
        this.f20747b = frameLayout;
        this.f20748c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f20746a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f20748c;
                if (((z2) this.f20747b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                bi.d dVar = (bi.d) this.f20747b;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f20748c;
                if (dVar.F > 0) {
                    AndroidUtilities.shakeViewSpring(dVar, 3.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
                h3Var.dismiss();
                return;
        }
    }
}

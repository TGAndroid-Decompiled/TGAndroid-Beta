package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class y2 implements View.OnClickListener {
    public final int f24436a;
    public final FrameLayout f24437b;
    public final Object f24438c;

    public y2(FrameLayout frameLayout, Object obj, int i10) {
        this.f24436a = i10;
        this.f24437b = frameLayout;
        this.f24438c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24436a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f24438c;
                if (((z2) this.f24437b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                qh.d dVar = (qh.d) this.f24437b;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f24438c;
                if (dVar.C > 0) {
                    AndroidUtilities.shakeViewSpring(dVar, 3.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
                h3Var.dismiss();
                return;
        }
    }
}

package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class x2 implements View.OnClickListener {
    public final int f22539a;
    public final FrameLayout f22540b;
    public final Object f22541c;

    public x2(FrameLayout frameLayout, Object obj, int i10) {
        this.f22539a = i10;
        this.f22540b = frameLayout;
        this.f22541c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22539a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f22541c;
                if (((y2) this.f22540b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                ph.d dVar = (ph.d) this.f22540b;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f22541c;
                if (dVar.C > 0) {
                    AndroidUtilities.shakeViewSpring(dVar, 3.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
                g3Var.dismiss();
                return;
        }
    }
}

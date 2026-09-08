package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class y2 implements View.OnClickListener {
    public final int f23587a;
    public final FrameLayout f23588b;
    public final Object f23589c;

    public y2(FrameLayout frameLayout, Object obj, int i10) {
        this.f23587a = i10;
        this.f23588b = frameLayout;
        this.f23589c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23587a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f23589c;
                if (((z2) this.f23588b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                di.d dVar = (di.d) this.f23588b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f23589c;
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

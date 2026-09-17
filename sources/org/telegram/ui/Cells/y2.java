package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class y2 implements View.OnClickListener {
    public final int f23588a;
    public final FrameLayout f23589b;
    public final Object f23590c;

    public y2(FrameLayout frameLayout, Object obj, int i10) {
        this.f23588a = i10;
        this.f23589b = frameLayout;
        this.f23590c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23588a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f23590c;
                if (((z2) this.f23589b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                di.d dVar = (di.d) this.f23589b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f23590c;
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

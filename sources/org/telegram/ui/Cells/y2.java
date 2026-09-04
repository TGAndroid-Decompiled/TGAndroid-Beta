package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class y2 implements View.OnClickListener {
    public final int f23560a;
    public final FrameLayout f23561b;
    public final Object f23562c;

    public y2(FrameLayout frameLayout, Object obj, int i10) {
        this.f23560a = i10;
        this.f23561b = frameLayout;
        this.f23562c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23560a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f23562c;
                if (((z2) this.f23561b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                di.d dVar = (di.d) this.f23561b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f23562c;
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

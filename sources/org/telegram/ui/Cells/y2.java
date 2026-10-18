package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class y2 implements View.OnClickListener {
    public final int f23830a;
    public final FrameLayout f23831b;
    public final Object f23832c;

    public y2(FrameLayout frameLayout, Object obj, int i10) {
        this.f23830a = i10;
        this.f23831b = frameLayout;
        this.f23832c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23830a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f23832c;
                if (((z2) this.f23831b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                ei.d dVar = (ei.d) this.f23831b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f23832c;
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

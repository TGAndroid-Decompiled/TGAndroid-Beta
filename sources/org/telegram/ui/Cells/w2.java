package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class w2 implements View.OnClickListener {
    public final int f25859a;
    public final FrameLayout f25860b;
    public final Object f25861c;

    public w2(FrameLayout frameLayout, Object obj, int i10) {
        this.f25859a = i10;
        this.f25860b = frameLayout;
        this.f25861c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25859a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f25861c;
                if (((x2) this.f25860b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                nh.d dVar = (nh.d) this.f25860b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f25861c;
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

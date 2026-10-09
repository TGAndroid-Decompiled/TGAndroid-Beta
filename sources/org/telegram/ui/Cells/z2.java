package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class z2 implements View.OnClickListener {
    public final int f23798a;
    public final FrameLayout f23799b;
    public final Object f23800c;

    public z2(FrameLayout frameLayout, Object obj, int i10) {
        this.f23798a = i10;
        this.f23799b = frameLayout;
        this.f23800c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23798a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f23800c;
                if (((a3) this.f23799b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                ci.d dVar = (ci.d) this.f23799b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f23800c;
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

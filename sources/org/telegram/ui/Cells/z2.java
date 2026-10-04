package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class z2 implements View.OnClickListener {
    public final int f23799a;
    public final FrameLayout f23800b;
    public final Object f23801c;

    public z2(FrameLayout frameLayout, Object obj, int i10) {
        this.f23799a = i10;
        this.f23800b = frameLayout;
        this.f23801c = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23799a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f23801c;
                if (((a3) this.f23800b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                ci.d dVar = (ci.d) this.f23800b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f23801c;
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

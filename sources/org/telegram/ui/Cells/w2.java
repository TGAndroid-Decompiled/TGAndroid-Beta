package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.tgnet.tl.TL_feed;
public final class w2 implements View.OnClickListener {
    public final int f25622a;
    public final Object f25623b;
    public final Object f25624c;

    public w2(int i10, Object obj, Object obj2) {
        this.f25622a = i10;
        this.f25623b = obj;
        this.f25624c = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25622a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f25624c;
                if (((x2) this.f25623b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 1:
                ((s3) this.f25623b).f25392c.run(Integer.valueOf(((TL_feed.InterestCategory) this.f25624c).f22247id));
                return;
            default:
                fi.d dVar = (fi.d) this.f25623b;
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.f25624c;
                if (dVar.I > 0) {
                    AndroidUtilities.shakeViewSpring(dVar, 3.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
                k3Var.dismiss();
                return;
        }
    }
}

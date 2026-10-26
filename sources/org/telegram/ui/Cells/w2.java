package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.tgnet.tl.TL_feed;
public final class w2 implements View.OnClickListener {
    public final int f25620a;
    public final Object f25621b;
    public final Object f25622c;

    public w2(int i10, Object obj, Object obj2) {
        this.f25620a = i10;
        this.f25621b = obj;
        this.f25622c = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25620a) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) this.f25622c;
                if (((x2) this.f25621b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 1:
                ((s3) this.f25621b).f25390c.run(Integer.valueOf(((TL_feed.InterestCategory) this.f25622c).f22246id));
                return;
            default:
                fi.d dVar = (fi.d) this.f25621b;
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.f25622c;
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

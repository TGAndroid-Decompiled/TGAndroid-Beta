package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class qe extends ImageView {
    public float f31888a;
    public final ChatActivityEnterView f31889b;

    public qe(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f31889b = chatActivityEnterView;
    }

    @Override
    public final float getTranslationX() {
        return this.f31888a;
    }

    @Override
    public final void setTranslationX(float f10) {
        float f11;
        float alpha;
        this.f31888a = f10;
        float f12 = -44.0f;
        float dp = AndroidUtilities.dp(-44.0f) + this.f31888a;
        ChatActivityEnterView chatActivityEnterView = this.f31889b;
        float f13 = dp + chatActivityEnterView.f26208y + chatActivityEnterView.f26202x;
        se seVar = chatActivityEnterView.F1;
        float f14 = 0.0f;
        if (seVar != null && seVar.getVisibility() == 0) {
            f11 = -44.0f;
        } else {
            f11 = 0.0f;
        }
        float dp2 = AndroidUtilities.dp(f11);
        se seVar2 = chatActivityEnterView.F1;
        if (seVar2 == null) {
            alpha = 0.0f;
        } else {
            alpha = seVar2.getAlpha();
        }
        float f15 = (dp2 * alpha) + f13;
        se seVar3 = chatActivityEnterView.f26178s1;
        float dp3 = AndroidUtilities.dp((seVar3 == null || seVar3.getVisibility() != 0) ? 0.0f : 0.0f);
        se seVar4 = chatActivityEnterView.f26178s1;
        if (seVar4 != null) {
            f14 = seVar4.getAlpha();
        }
        super.setTranslationX((dp3 * f14) + f15);
    }
}

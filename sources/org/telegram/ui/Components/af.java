package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class af extends ImageView {
    public float f22625a;
    public final ChatActivityEnterView f22626b;

    public af(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f22626b = chatActivityEnterView;
    }

    @Override
    public final float getTranslationX() {
        return this.f22625a;
    }

    @Override
    public final void setTranslationX(float f7) {
        float f10;
        float alpha;
        this.f22625a = f7;
        float f11 = -44.0f;
        float dp = AndroidUtilities.dp(-44.0f) + this.f22625a;
        ChatActivityEnterView chatActivityEnterView = this.f22626b;
        float f12 = dp + chatActivityEnterView.f22090y + chatActivityEnterView.f22084x;
        cf cfVar = chatActivityEnterView.K1;
        float f13 = 0.0f;
        if (cfVar != null && cfVar.getVisibility() == 0) {
            f10 = -44.0f;
        } else {
            f10 = 0.0f;
        }
        float dp2 = AndroidUtilities.dp(f10);
        cf cfVar2 = chatActivityEnterView.K1;
        if (cfVar2 == null) {
            alpha = 0.0f;
        } else {
            alpha = cfVar2.getAlpha();
        }
        float f14 = (dp2 * alpha) + f12;
        cf cfVar3 = chatActivityEnterView.f22086x1;
        float dp3 = AndroidUtilities.dp((cfVar3 == null || cfVar3.getVisibility() != 0) ? 0.0f : 0.0f);
        cf cfVar4 = chatActivityEnterView.f22086x1;
        if (cfVar4 != null) {
            f13 = cfVar4.getAlpha();
        }
        super.setTranslationX((dp3 * f13) + f14);
    }
}

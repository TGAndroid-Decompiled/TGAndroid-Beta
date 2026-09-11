package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class af extends ImageView {
    public float f24351a;
    public final ChatActivityEnterView f24352b;

    public af(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f24352b = chatActivityEnterView;
    }

    @Override
    public final float getTranslationX() {
        return this.f24351a;
    }

    @Override
    public final void setTranslationX(float f7) {
        float f10;
        float alpha;
        this.f24351a = f7;
        float f11 = -44.0f;
        float dp = AndroidUtilities.dp(-44.0f) + this.f24351a;
        ChatActivityEnterView chatActivityEnterView = this.f24352b;
        float f12 = dp + chatActivityEnterView.f23799y + chatActivityEnterView.f23793x;
        cf cfVar = chatActivityEnterView.J1;
        float f13 = 0.0f;
        if (cfVar != null && cfVar.getVisibility() == 0) {
            f10 = -44.0f;
        } else {
            f10 = 0.0f;
        }
        float dp2 = AndroidUtilities.dp(f10);
        cf cfVar2 = chatActivityEnterView.J1;
        if (cfVar2 == null) {
            alpha = 0.0f;
        } else {
            alpha = cfVar2.getAlpha();
        }
        float f14 = (dp2 * alpha) + f12;
        cf cfVar3 = chatActivityEnterView.f23789w1;
        float dp3 = AndroidUtilities.dp((cfVar3 == null || cfVar3.getVisibility() != 0) ? 0.0f : 0.0f);
        cf cfVar4 = chatActivityEnterView.f23789w1;
        if (cfVar4 != null) {
            f13 = cfVar4.getAlpha();
        }
        super.setTranslationX((dp3 * f13) + f14);
    }
}

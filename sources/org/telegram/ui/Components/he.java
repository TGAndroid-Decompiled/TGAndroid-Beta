package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class he extends ImageView {
    public float f34319a;
    public final ChatActivityEnterView f34320b;

    public he(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f34320b = chatActivityEnterView;
    }

    @Override
    public final float getTranslationX() {
        return this.f34319a;
    }

    @Override
    public final void setTranslationX(float f10) {
        float f11;
        float alpha;
        this.f34319a = f10;
        float f12 = -44.0f;
        float L = org.telegram.messenger.g0.L(-44.0f) + this.f34319a;
        ChatActivityEnterView chatActivityEnterView = this.f34320b;
        float f13 = L + chatActivityEnterView.D + chatActivityEnterView.f31171y;
        je jeVar = chatActivityEnterView.K1;
        float f14 = 0.0f;
        if (jeVar != null && jeVar.getVisibility() == 0) {
            f11 = -44.0f;
        } else {
            f11 = 0.0f;
        }
        float L2 = org.telegram.messenger.g0.L(f11);
        je jeVar2 = chatActivityEnterView.K1;
        if (jeVar2 == null) {
            alpha = 0.0f;
        } else {
            alpha = jeVar2.getAlpha();
        }
        float f15 = (L2 * alpha) + f13;
        je jeVar3 = chatActivityEnterView.f31167x1;
        if (jeVar3 == null || jeVar3.getVisibility() != 0) {
            f12 = 0.0f;
        }
        float L3 = org.telegram.messenger.g0.L(f12);
        je jeVar4 = chatActivityEnterView.f31167x1;
        if (jeVar4 != null) {
            f14 = jeVar4.getAlpha();
        }
        super.setTranslationX((L3 * f14) + f15);
    }
}

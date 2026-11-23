package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class te extends ImageView {
    public float f39910a;
    public final ChatActivityEnterView f39911b;

    public te(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f39911b = chatActivityEnterView;
    }

    @Override
    public final float getTranslationX() {
        return this.f39910a;
    }

    @Override
    public final void setTranslationX(float f10) {
        float f11;
        float alpha;
        this.f39910a = f10;
        float f12 = -44.0f;
        float L = org.telegram.messenger.g0.L(-44.0f) + this.f39910a;
        ChatActivityEnterView chatActivityEnterView = this.f39911b;
        float f13 = L + chatActivityEnterView.E + chatActivityEnterView.f32820y;
        je jeVar = chatActivityEnterView.A2;
        float f14 = 0.0f;
        if (jeVar != null && jeVar.getVisibility() == 0) {
            f11 = -44.0f;
        } else {
            f11 = 0.0f;
        }
        float L2 = org.telegram.messenger.g0.L(f11);
        je jeVar2 = chatActivityEnterView.A2;
        if (jeVar2 == null) {
            alpha = 0.0f;
        } else {
            alpha = jeVar2.getAlpha();
        }
        float f15 = (L2 * alpha) + f13;
        je jeVar3 = chatActivityEnterView.f32739n2;
        if (jeVar3 == null || jeVar3.getVisibility() != 0) {
            f12 = 0.0f;
        }
        float L3 = org.telegram.messenger.g0.L(f12);
        je jeVar4 = chatActivityEnterView.f32739n2;
        if (jeVar4 != null) {
            f14 = jeVar4.getAlpha();
        }
        super.setTranslationX((L3 * f14) + f15);
    }
}

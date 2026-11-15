package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class je extends ImageView {
    public float f35958a;
    public final ChatActivityEnterView f35959b;

    public je(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f35959b = chatActivityEnterView;
    }

    @Override
    public final float getTranslationX() {
        return this.f35958a;
    }

    @Override
    public final void setTranslationX(float f10) {
        float f11;
        float alpha;
        this.f35958a = f10;
        float f12 = -44.0f;
        float L = org.telegram.messenger.g0.L(-44.0f) + this.f35958a;
        ChatActivityEnterView chatActivityEnterView = this.f35959b;
        float f13 = L + chatActivityEnterView.E + chatActivityEnterView.f32323y;
        zd zdVar = chatActivityEnterView.f32283s2;
        float f14 = 0.0f;
        if (zdVar != null && zdVar.getVisibility() == 0) {
            f11 = -44.0f;
        } else {
            f11 = 0.0f;
        }
        float L2 = org.telegram.messenger.g0.L(f11);
        zd zdVar2 = chatActivityEnterView.f32283s2;
        if (zdVar2 == null) {
            alpha = 0.0f;
        } else {
            alpha = zdVar2.getAlpha();
        }
        float f15 = (L2 * alpha) + f13;
        zd zdVar3 = chatActivityEnterView.f32194f2;
        if (zdVar3 == null || zdVar3.getVisibility() != 0) {
            f12 = 0.0f;
        }
        float L3 = org.telegram.messenger.g0.L(f12);
        zd zdVar4 = chatActivityEnterView.f32194f2;
        if (zdVar4 != null) {
            f14 = zdVar4.getAlpha();
        }
        super.setTranslationX((L3 * f14) + f15);
    }
}

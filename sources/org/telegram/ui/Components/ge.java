package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class ge extends ImageView {
    public float f34070a;
    public final ChatActivityEnterView f34071b;

    public ge(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f34071b = chatActivityEnterView;
    }

    @Override
    public final float getTranslationX() {
        return this.f34070a;
    }

    @Override
    public final void setTranslationX(float f10) {
        float f11;
        float alpha;
        this.f34070a = f10;
        float f12 = -44.0f;
        float L = org.telegram.messenger.g0.L(-44.0f) + this.f34070a;
        ChatActivityEnterView chatActivityEnterView = this.f34071b;
        float f13 = L + chatActivityEnterView.E + chatActivityEnterView.f31225y;
        ie ieVar = chatActivityEnterView.L1;
        float f14 = 0.0f;
        if (ieVar != null && ieVar.getVisibility() == 0) {
            f11 = -44.0f;
        } else {
            f11 = 0.0f;
        }
        float L2 = org.telegram.messenger.g0.L(f11);
        ie ieVar2 = chatActivityEnterView.L1;
        if (ieVar2 == null) {
            alpha = 0.0f;
        } else {
            alpha = ieVar2.getAlpha();
        }
        float f15 = (L2 * alpha) + f13;
        ie ieVar3 = chatActivityEnterView.f31227y1;
        if (ieVar3 == null || ieVar3.getVisibility() != 0) {
            f12 = 0.0f;
        }
        float L3 = org.telegram.messenger.g0.L(f12);
        ie ieVar4 = chatActivityEnterView.f31227y1;
        if (ieVar4 != null) {
            f14 = ieVar4.getAlpha();
        }
        super.setTranslationX((L3 * f14) + f15);
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class ie extends ImageView {
    public float f34592a;
    public final ChatActivityEnterView f34593b;

    public ie(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f34593b = chatActivityEnterView;
    }

    @Override
    public final float getTranslationX() {
        return this.f34592a;
    }

    @Override
    public final void setTranslationX(float f10) {
        float f11;
        float alpha;
        this.f34592a = f10;
        float f12 = -44.0f;
        float L = org.telegram.messenger.g0.L(-44.0f) + this.f34592a;
        ChatActivityEnterView chatActivityEnterView = this.f34593b;
        float f13 = L + chatActivityEnterView.D + chatActivityEnterView.f31151y;
        ke keVar = chatActivityEnterView.K1;
        float f14 = 0.0f;
        if (keVar != null && keVar.getVisibility() == 0) {
            f11 = -44.0f;
        } else {
            f11 = 0.0f;
        }
        float L2 = org.telegram.messenger.g0.L(f11);
        ke keVar2 = chatActivityEnterView.K1;
        if (keVar2 == null) {
            alpha = 0.0f;
        } else {
            alpha = keVar2.getAlpha();
        }
        float f15 = (L2 * alpha) + f13;
        ke keVar3 = chatActivityEnterView.f31147x1;
        if (keVar3 == null || keVar3.getVisibility() != 0) {
            f12 = 0.0f;
        }
        float L3 = org.telegram.messenger.g0.L(f12);
        ke keVar4 = chatActivityEnterView.f31147x1;
        if (keVar4 != null) {
            f14 = keVar4.getAlpha();
        }
        super.setTranslationX((L3 * f14) + f15);
    }
}

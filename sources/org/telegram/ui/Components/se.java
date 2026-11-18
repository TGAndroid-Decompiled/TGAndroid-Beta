package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class se extends ImageView {
    public float f39613a;
    public final ChatActivityEnterView f39614b;

    public se(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f39614b = chatActivityEnterView;
    }

    @Override
    public final float getTranslationX() {
        return this.f39613a;
    }

    @Override
    public final void setTranslationX(float f10) {
        float f11;
        float alpha;
        this.f39613a = f10;
        float f12 = -44.0f;
        float L = org.telegram.messenger.g0.L(-44.0f) + this.f39613a;
        ChatActivityEnterView chatActivityEnterView = this.f39614b;
        float f13 = L + chatActivityEnterView.E + chatActivityEnterView.f32720y;
        ie ieVar = chatActivityEnterView.f32723y2;
        float f14 = 0.0f;
        if (ieVar != null && ieVar.getVisibility() == 0) {
            f11 = -44.0f;
        } else {
            f11 = 0.0f;
        }
        float L2 = org.telegram.messenger.g0.L(f11);
        ie ieVar2 = chatActivityEnterView.f32723y2;
        if (ieVar2 == null) {
            alpha = 0.0f;
        } else {
            alpha = ieVar2.getAlpha();
        }
        float f15 = (L2 * alpha) + f13;
        ie ieVar3 = chatActivityEnterView.f32629l2;
        if (ieVar3 == null || ieVar3.getVisibility() != 0) {
            f12 = 0.0f;
        }
        float L3 = org.telegram.messenger.g0.L(f12);
        ie ieVar4 = chatActivityEnterView.f32629l2;
        if (ieVar4 != null) {
            f14 = ieVar4.getAlpha();
        }
        super.setTranslationX((L3 * f14) + f15);
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class xe extends ImageView {
    public float f32564a;
    public final ChatActivityEnterView f32565b;

    public xe(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f32565b = chatActivityEnterView;
    }

    @Override
    public final float getTranslationX() {
        return this.f32564a;
    }

    @Override
    public final void setTranslationX(float f7) {
        float f10;
        float alpha;
        this.f32564a = f7;
        float f11 = -44.0f;
        float dp = AndroidUtilities.dp(-44.0f) + this.f32564a;
        ChatActivityEnterView chatActivityEnterView = this.f32565b;
        float f12 = dp + chatActivityEnterView.f24193y + chatActivityEnterView.f24187x;
        ze zeVar = chatActivityEnterView.K1;
        float f13 = 0.0f;
        if (zeVar != null && zeVar.getVisibility() == 0) {
            f10 = -44.0f;
        } else {
            f10 = 0.0f;
        }
        float dp2 = AndroidUtilities.dp(f10);
        ze zeVar2 = chatActivityEnterView.K1;
        if (zeVar2 == null) {
            alpha = 0.0f;
        } else {
            alpha = zeVar2.getAlpha();
        }
        float f14 = (dp2 * alpha) + f12;
        ze zeVar3 = chatActivityEnterView.f24189x1;
        if (zeVar3 == null || zeVar3.getVisibility() != 0) {
            f11 = 0.0f;
        }
        float dp3 = AndroidUtilities.dp(f11);
        ze zeVar4 = chatActivityEnterView.f24189x1;
        if (zeVar4 != null) {
            f13 = zeVar4.getAlpha();
        }
        super.setTranslationX((dp3 * f13) + f14);
    }
}

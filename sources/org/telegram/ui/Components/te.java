package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class te extends ImageView {
    public float f32928a;
    public final ChatActivityEnterView f32929b;

    public te(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f32929b = chatActivityEnterView;
    }

    @Override
    public final float getTranslationX() {
        return this.f32928a;
    }

    @Override
    public final void setTranslationX(float f9) {
        float f10;
        float alpha;
        this.f32928a = f9;
        float f11 = -44.0f;
        float dp = AndroidUtilities.dp(-44.0f) + this.f32928a;
        ChatActivityEnterView chatActivityEnterView = this.f32929b;
        float f12 = dp + chatActivityEnterView.f26219y + chatActivityEnterView.f26214x;
        ve veVar = chatActivityEnterView.F1;
        float f13 = 0.0f;
        if (veVar != null && veVar.getVisibility() == 0) {
            f10 = -44.0f;
        } else {
            f10 = 0.0f;
        }
        float dp2 = AndroidUtilities.dp(f10);
        ve veVar2 = chatActivityEnterView.F1;
        if (veVar2 == null) {
            alpha = 0.0f;
        } else {
            alpha = veVar2.getAlpha();
        }
        float f14 = (dp2 * alpha) + f12;
        ve veVar3 = chatActivityEnterView.f26189s1;
        float dp3 = AndroidUtilities.dp((veVar3 == null || veVar3.getVisibility() != 0) ? 0.0f : 0.0f);
        ve veVar4 = chatActivityEnterView.f26189s1;
        if (veVar4 != null) {
            f13 = veVar4.getAlpha();
        }
        super.setTranslationX((dp3 * f13) + f14);
    }
}

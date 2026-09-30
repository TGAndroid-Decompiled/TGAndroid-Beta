package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class bf extends ImageView {
    public float f22928a;
    public final ChatActivityEnterView f22929b;

    public bf(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f22929b = chatActivityEnterView;
    }

    @Override
    public final float getTranslationX() {
        return this.f22928a;
    }

    @Override
    public final void setTranslationX(float f7) {
        float f10;
        float alpha;
        this.f22928a = f7;
        float f11 = -44.0f;
        float dp = AndroidUtilities.dp(-44.0f) + this.f22928a;
        ChatActivityEnterView chatActivityEnterView = this.f22929b;
        float f12 = dp + chatActivityEnterView.f22112y + chatActivityEnterView.f22106x;
        df dfVar = chatActivityEnterView.K1;
        float f13 = 0.0f;
        if (dfVar != null && dfVar.getVisibility() == 0) {
            f10 = -44.0f;
        } else {
            f10 = 0.0f;
        }
        float dp2 = AndroidUtilities.dp(f10);
        df dfVar2 = chatActivityEnterView.K1;
        if (dfVar2 == null) {
            alpha = 0.0f;
        } else {
            alpha = dfVar2.getAlpha();
        }
        float f14 = (dp2 * alpha) + f12;
        df dfVar3 = chatActivityEnterView.f22108x1;
        float dp3 = AndroidUtilities.dp((dfVar3 == null || dfVar3.getVisibility() != 0) ? 0.0f : 0.0f);
        df dfVar4 = chatActivityEnterView.f22108x1;
        if (dfVar4 != null) {
            f13 = dfVar4.getAlpha();
        }
        super.setTranslationX((dp3 * f13) + f14);
    }
}

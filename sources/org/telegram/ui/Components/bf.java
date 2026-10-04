package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class bf extends ImageView {
    public float f24935a;
    public final ChatActivityEnterView f24936b;

    public bf(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f24936b = chatActivityEnterView;
    }

    @Override
    public final float getTranslationX() {
        return this.f24935a;
    }

    @Override
    public final void setTranslationX(float f7) {
        float f10;
        float alpha;
        this.f24935a = f7;
        float f11 = -44.0f;
        float dp = AndroidUtilities.dp(-44.0f) + this.f24935a;
        ChatActivityEnterView chatActivityEnterView = this.f24936b;
        float f12 = dp + chatActivityEnterView.f23990y + chatActivityEnterView.f23984x;
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
        df dfVar3 = chatActivityEnterView.f23986x1;
        float dp3 = AndroidUtilities.dp((dfVar3 == null || dfVar3.getVisibility() != 0) ? 0.0f : 0.0f);
        df dfVar4 = chatActivityEnterView.f23986x1;
        if (dfVar4 != null) {
            f13 = dfVar4.getAlpha();
        }
        super.setTranslationX((dp3 * f13) + f14);
    }
}

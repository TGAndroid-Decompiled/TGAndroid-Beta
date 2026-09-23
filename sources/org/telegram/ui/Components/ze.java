package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class ze extends ImageView {
    public float f30573a;
    public final ChatActivityEnterView f30574b;

    public ze(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f30574b = chatActivityEnterView;
    }

    @Override
    public final float getTranslationX() {
        return this.f30573a;
    }

    @Override
    public final void setTranslationX(float f7) {
        float f10;
        float alpha;
        this.f30573a = f7;
        float f11 = -44.0f;
        float dp = AndroidUtilities.dp(-44.0f) + this.f30573a;
        ChatActivityEnterView chatActivityEnterView = this.f30574b;
        float f12 = dp + chatActivityEnterView.f21839y + chatActivityEnterView.f21833x;
        bf bfVar = chatActivityEnterView.J1;
        float f13 = 0.0f;
        if (bfVar != null && bfVar.getVisibility() == 0) {
            f10 = -44.0f;
        } else {
            f10 = 0.0f;
        }
        float dp2 = AndroidUtilities.dp(f10);
        bf bfVar2 = chatActivityEnterView.J1;
        if (bfVar2 == null) {
            alpha = 0.0f;
        } else {
            alpha = bfVar2.getAlpha();
        }
        float f14 = (dp2 * alpha) + f12;
        bf bfVar3 = chatActivityEnterView.f21829w1;
        float dp3 = AndroidUtilities.dp((bfVar3 == null || bfVar3.getVisibility() != 0) ? 0.0f : 0.0f);
        bf bfVar4 = chatActivityEnterView.f21829w1;
        if (bfVar4 != null) {
            f13 = bfVar4.getAlpha();
        }
        super.setTranslationX((dp3 * f13) + f14);
    }
}

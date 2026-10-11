package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class cf extends ImageView {
    public float f25333a;
    public final ChatActivityEnterView f25334b;

    public cf(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f25334b = chatActivityEnterView;
    }

    @Override
    public final float getTranslationX() {
        return this.f25333a;
    }

    @Override
    public final void setTranslationX(float f7) {
        float f10;
        float alpha;
        this.f25333a = f7;
        float f11 = -44.0f;
        float dp = AndroidUtilities.dp(-44.0f) + this.f25333a;
        ChatActivityEnterView chatActivityEnterView = this.f25334b;
        float f12 = dp + chatActivityEnterView.f24017y + chatActivityEnterView.f24011x;
        ef efVar = chatActivityEnterView.K1;
        float f13 = 0.0f;
        if (efVar != null && efVar.getVisibility() == 0) {
            f10 = -44.0f;
        } else {
            f10 = 0.0f;
        }
        float dp2 = AndroidUtilities.dp(f10);
        ef efVar2 = chatActivityEnterView.K1;
        if (efVar2 == null) {
            alpha = 0.0f;
        } else {
            alpha = efVar2.getAlpha();
        }
        float f14 = (dp2 * alpha) + f12;
        ef efVar3 = chatActivityEnterView.f24013x1;
        if (efVar3 == null || efVar3.getVisibility() != 0) {
            f11 = 0.0f;
        }
        float dp3 = AndroidUtilities.dp(f11);
        ef efVar4 = chatActivityEnterView.f24013x1;
        if (efVar4 != null) {
            f13 = efVar4.getAlpha();
        }
        super.setTranslationX((dp3 * f13) + f14);
    }
}

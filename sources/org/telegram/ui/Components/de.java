package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class de extends ImageView {
    public float f25395a;
    public final ChatActivityEnterView f25396b;

    public de(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f25396b = chatActivityEnterView;
    }

    @Override
    public final float getTranslationX() {
        return this.f25395a;
    }

    @Override
    public final void setTranslationX(float f7) {
        float f10;
        float alpha;
        this.f25395a = f7;
        float f11 = -44.0f;
        float L = org.telegram.messenger.i0.L(-44.0f) + this.f25395a;
        ChatActivityEnterView chatActivityEnterView = this.f25396b;
        float f12 = L + chatActivityEnterView.D + chatActivityEnterView.f23815y;
        fe feVar = chatActivityEnterView.K1;
        float f13 = 0.0f;
        if (feVar != null && feVar.getVisibility() == 0) {
            f10 = -44.0f;
        } else {
            f10 = 0.0f;
        }
        float L2 = org.telegram.messenger.i0.L(f10);
        fe feVar2 = chatActivityEnterView.K1;
        if (feVar2 == null) {
            alpha = 0.0f;
        } else {
            alpha = feVar2.getAlpha();
        }
        float f14 = (L2 * alpha) + f12;
        fe feVar3 = chatActivityEnterView.f23811x1;
        if (feVar3 == null || feVar3.getVisibility() != 0) {
            f11 = 0.0f;
        }
        float L3 = org.telegram.messenger.i0.L(f11);
        fe feVar4 = chatActivityEnterView.f23811x1;
        if (feVar4 != null) {
            f13 = feVar4.getAlpha();
        }
        super.setTranslationX((L3 * f13) + f14);
    }
}

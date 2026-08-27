package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

public final class me extends ImageView {

    public float f30654a;

    public final ChatActivityEnterView f30655b;

    public me(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f30655b = chatActivityEnterView;
    }

    @Override
    public final float getTranslationX() {
        return this.f30654a;
    }

    @Override
    public final void setTranslationX(float f10) {
        this.f30654a = f10;
        float fDp = AndroidUtilities.dp(-44.0f) + this.f30654a;
        ChatActivityEnterView chatActivityEnterView = this.f30655b;
        float f11 = fDp + chatActivityEnterView.f26204y + chatActivityEnterView.f26198x;
        oe oeVar = chatActivityEnterView.F1;
        float fDp2 = AndroidUtilities.dp((oeVar == null || oeVar.getVisibility() != 0) ? 0.0f : -44.0f);
        oe oeVar2 = chatActivityEnterView.F1;
        float alpha = (fDp2 * (oeVar2 == null ? 0.0f : oeVar2.getAlpha())) + f11;
        oe oeVar3 = chatActivityEnterView.f26174s1;
        float fDp3 = AndroidUtilities.dp((oeVar3 == null || oeVar3.getVisibility() != 0) ? 0.0f : -44.0f);
        oe oeVar4 = chatActivityEnterView.f26174s1;
        super.setTranslationX((fDp3 * (oeVar4 != null ? oeVar4.getAlpha() : 0.0f)) + alpha);
    }
}

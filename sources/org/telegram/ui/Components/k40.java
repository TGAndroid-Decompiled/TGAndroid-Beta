package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class k40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29805a;
    public final m40 f29806b;

    public k40(m40 m40Var, int i10) {
        this.f29805a = i10;
        this.f29806b = m40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.vn vnVar;
        bi.r1 r1Var;
        switch (this.f29805a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m40 m40Var = this.f29806b;
                m40Var.f30384w = floatValue;
                m40Var.e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                m40Var.e.setPadding(0, 0, 0, (int) (m40Var.f30384w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m40 m40Var2 = this.f29806b;
                m40Var2.E = floatValue2;
                m40Var2.f30381n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                m40Var2.f30381n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, m40Var2.E));
                org.telegram.ui.ck ckVar = m40Var2.f30380f;
                if (ckVar != null && (vnVar = ckVar.f45521a) != null && (r1Var = vnVar.X3) != null) {
                    r1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, m40Var2.E));
                    m40Var2.f30380f.f45521a.X3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, m40Var2.E));
                }
                m40Var2.h.setAlpha(m40Var2.E);
                return;
        }
    }
}

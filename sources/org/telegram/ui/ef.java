package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ef implements ValueAnimator.AnimatorUpdateListener {
    public final int f39094a;
    public final un f39095b;
    public final View f39096c;

    public ef(un unVar, org.telegram.ui.Cells.v0 v0Var, int i10) {
        this.f39094a = i10;
        this.f39095b = unVar;
        this.f39096c = v0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39094a) {
            case 0:
                un unVar = this.f39095b;
                unVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar.M9 = AndroidUtilities.dp(30.0f) * floatValue;
                unVar.x9();
                this.f39096c.setAlpha(floatValue);
                return;
            default:
                un unVar2 = this.f39095b;
                unVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar2.M9 = AndroidUtilities.dp(30.0f) * floatValue2;
                unVar2.x9();
                unVar2.z9();
                this.f39096c.setAlpha(floatValue2);
                return;
        }
    }
}

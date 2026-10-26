package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ef implements ValueAnimator.AnimatorUpdateListener {
    public final int f39097a;
    public final un f39098b;
    public final View f39099c;

    public ef(un unVar, org.telegram.ui.Cells.v0 v0Var, int i10) {
        this.f39097a = i10;
        this.f39098b = unVar;
        this.f39099c = v0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39097a) {
            case 0:
                un unVar = this.f39098b;
                unVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar.M9 = AndroidUtilities.dp(30.0f) * floatValue;
                unVar.x9();
                this.f39099c.setAlpha(floatValue);
                return;
            default:
                un unVar2 = this.f39098b;
                unVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar2.M9 = AndroidUtilities.dp(30.0f) * floatValue2;
                unVar2.x9();
                unVar2.z9();
                this.f39099c.setAlpha(floatValue2);
                return;
        }
    }
}

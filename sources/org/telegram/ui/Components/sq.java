package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.R;
public final class sq extends AnimatorListenerAdapter {
    public final uq f30608a;

    public sq(uq uqVar) {
        this.f30608a = uqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        uq uqVar = this.f30608a;
        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = uqVar.v;
        if (uqVar.K == 1) {
            uqVar.F.setVisibility(4);
        }
        for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
            if (colorPicker$RadioButtonArr[i10].getTag(R.id.index_tag) == null) {
                colorPicker$RadioButtonArr[i10].setVisibility(4);
            }
        }
        uqVar.f31212y = null;
    }
}

package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.R;
public final class ar extends AnimatorListenerAdapter {
    public final cr f24749a;

    public ar(cr crVar) {
        this.f24749a = crVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        cr crVar = this.f24749a;
        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = crVar.v;
        if (crVar.K == 1) {
            crVar.F.setVisibility(4);
        }
        for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
            if (colorPicker$RadioButtonArr[i10].getTag(R.id.index_tag) == null) {
                colorPicker$RadioButtonArr[i10].setVisibility(4);
            }
        }
        crVar.f25498y = null;
    }
}

package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.R;
public final class eq extends AnimatorListenerAdapter {
    public final gq f28160a;

    public eq(gq gqVar) {
        this.f28160a = gqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        gq gqVar = this.f28160a;
        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = gqVar.v;
        if (gqVar.G == 1) {
            gqVar.B.setVisibility(4);
        }
        for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
            if (colorPicker$RadioButtonArr[i10].getTag(R.id.index_tag) == null) {
                colorPicker$RadioButtonArr[i10].setVisibility(4);
            }
        }
        gqVar.f28956y = null;
    }
}

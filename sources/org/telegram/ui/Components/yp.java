package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.R;

public final class yp extends AnimatorListenerAdapter {

    public final aq f34940a;

    public yp(aq aqVar) {
        this.f34940a = aqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        aq aqVar = this.f34940a;
        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = aqVar.v;
        if (aqVar.G == 1) {
            aqVar.B.setVisibility(4);
        }
        for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
            if (colorPicker$RadioButtonArr[i10].getTag(R.id.index_tag) == null) {
                colorPicker$RadioButtonArr[i10].setVisibility(4);
            }
        }
        aqVar.f26805y = null;
    }
}

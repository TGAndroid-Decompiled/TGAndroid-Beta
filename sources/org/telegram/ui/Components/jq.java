package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.R;
public final class jq extends AnimatorListenerAdapter {
    public final lq f27556a;

    public jq(lq lqVar) {
        this.f27556a = lqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        lq lqVar = this.f27556a;
        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = lqVar.v;
        if (lqVar.K == 1) {
            lqVar.F.setVisibility(4);
        }
        for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
            if (colorPicker$RadioButtonArr[i10].getTag(R.id.index_tag) == null) {
                colorPicker$RadioButtonArr[i10].setVisibility(4);
            }
        }
        lqVar.f28290y = null;
    }
}

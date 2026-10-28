package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.R;
public final class wq extends AnimatorListenerAdapter {
    public final yq f34561a;

    public wq(yq yqVar) {
        this.f34561a = yqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        yq yqVar = this.f34561a;
        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = yqVar.v;
        if (yqVar.K == 1) {
            yqVar.F.setVisibility(4);
        }
        for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
            if (colorPicker$RadioButtonArr[i10].getTag(R.id.index_tag) == null) {
                colorPicker$RadioButtonArr[i10].setVisibility(4);
            }
        }
        yqVar.f35143y = null;
    }
}

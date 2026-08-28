package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.R;
public final class aq extends AnimatorListenerAdapter {
    public final cq f26885a;

    public aq(cq cqVar) {
        this.f26885a = cqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        cq cqVar = this.f26885a;
        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = cqVar.v;
        if (cqVar.G == 1) {
            cqVar.B.setVisibility(4);
        }
        for (int i9 = 0; i9 < colorPicker$RadioButtonArr.length; i9++) {
            if (colorPicker$RadioButtonArr[i9].getTag(R.id.index_tag) == null) {
                colorPicker$RadioButtonArr[i9].setVisibility(4);
            }
        }
        cqVar.f27553y = null;
    }
}

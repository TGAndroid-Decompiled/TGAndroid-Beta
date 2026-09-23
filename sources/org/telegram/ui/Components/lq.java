package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.R;
public final class lq extends AnimatorListenerAdapter {
    public final nq f25934a;

    public lq(nq nqVar) {
        this.f25934a = nqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        nq nqVar = this.f25934a;
        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = nqVar.v;
        if (nqVar.K == 1) {
            nqVar.F.setVisibility(4);
        }
        for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
            if (colorPicker$RadioButtonArr[i10].getTag(R.id.index_tag) == null) {
                colorPicker$RadioButtonArr[i10].setVisibility(4);
            }
        }
        nqVar.f26491y = null;
    }
}

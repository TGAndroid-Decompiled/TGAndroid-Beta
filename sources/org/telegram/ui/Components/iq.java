package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.R;
public final class iq extends AnimatorListenerAdapter {
    public final kq f25773a;

    public iq(kq kqVar) {
        this.f25773a = kqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        kq kqVar = this.f25773a;
        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = kqVar.v;
        if (kqVar.H == 1) {
            kqVar.C.setVisibility(4);
        }
        for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
            if (colorPicker$RadioButtonArr[i10].getTag(R.id.index_tag) == null) {
                colorPicker$RadioButtonArr[i10].setVisibility(4);
            }
        }
        kqVar.f26364y = null;
    }
}

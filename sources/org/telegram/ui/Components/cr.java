package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.R;
public final class cr extends AnimatorListenerAdapter {
    public final er f25004a;

    public cr(er erVar) {
        this.f25004a = erVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        er erVar = this.f25004a;
        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = erVar.v;
        if (erVar.K == 1) {
            erVar.F.setVisibility(4);
        }
        for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
            if (colorPicker$RadioButtonArr[i10].getTag(R.id.index_tag) == null) {
                colorPicker$RadioButtonArr[i10].setVisibility(4);
            }
        }
        erVar.f25779y = null;
    }
}

package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.R;
public final class uq extends AnimatorListenerAdapter {
    public final wq f31004a;

    public uq(wq wqVar) {
        this.f31004a = wqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        wq wqVar = this.f31004a;
        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = wqVar.v;
        if (wqVar.K == 1) {
            wqVar.F.setVisibility(4);
        }
        for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
            if (colorPicker$RadioButtonArr[i10].getTag(R.id.index_tag) == null) {
                colorPicker$RadioButtonArr[i10].setVisibility(4);
            }
        }
        wqVar.f32242y = null;
    }
}

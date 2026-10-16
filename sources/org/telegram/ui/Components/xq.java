package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.R;
public final class xq extends AnimatorListenerAdapter {
    public final zq f30993a;

    public xq(zq zqVar) {
        this.f30993a = zqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        zq zqVar = this.f30993a;
        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = zqVar.v;
        if (zqVar.K == 1) {
            zqVar.F.setVisibility(4);
        }
        for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
            if (colorPicker$RadioButtonArr[i10].getTag(R.id.index_tag) == null) {
                colorPicker$RadioButtonArr[i10].setVisibility(4);
            }
        }
        zqVar.f31677y = null;
    }
}

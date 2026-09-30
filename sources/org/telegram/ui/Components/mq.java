package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.R;
public final class mq extends AnimatorListenerAdapter {
    public final oq f26483a;

    public mq(oq oqVar) {
        this.f26483a = oqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        oq oqVar = this.f26483a;
        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = oqVar.v;
        if (oqVar.K == 1) {
            oqVar.F.setVisibility(4);
        }
        for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
            if (colorPicker$RadioButtonArr[i10].getTag(R.id.index_tag) == null) {
                colorPicker$RadioButtonArr[i10].setVisibility(4);
            }
        }
        oqVar.f27170y = null;
    }
}

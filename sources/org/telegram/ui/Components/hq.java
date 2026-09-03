package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.R;
public final class hq extends AnimatorListenerAdapter {
    public final jq f25475a;

    public hq(jq jqVar) {
        this.f25475a = jqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        jq jqVar = this.f25475a;
        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = jqVar.v;
        if (jqVar.H == 1) {
            jqVar.C.setVisibility(4);
        }
        for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
            if (colorPicker$RadioButtonArr[i10].getTag(R.id.index_tag) == null) {
                colorPicker$RadioButtonArr[i10].setVisibility(4);
            }
        }
        jqVar.f26034y = null;
    }
}

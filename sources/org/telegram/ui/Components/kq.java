package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.R;
public final class kq extends AnimatorListenerAdapter {
    public final mq f25661a;

    public kq(mq mqVar) {
        this.f25661a = mqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        mq mqVar = this.f25661a;
        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = mqVar.v;
        if (mqVar.K == 1) {
            mqVar.F.setVisibility(4);
        }
        for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
            if (colorPicker$RadioButtonArr[i10].getTag(R.id.index_tag) == null) {
                colorPicker$RadioButtonArr[i10].setVisibility(4);
            }
        }
        mqVar.f26226y = null;
    }
}

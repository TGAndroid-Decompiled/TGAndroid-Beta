package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.R;
public final class kq extends AnimatorListenerAdapter {
    public final mq f28438a;

    public kq(mq mqVar) {
        this.f28438a = mqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        mq mqVar = this.f28438a;
        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = mqVar.v;
        if (mqVar.H == 1) {
            mqVar.C.setVisibility(4);
        }
        for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
            if (colorPicker$RadioButtonArr[i10].getTag(R.id.index_tag) == null) {
                colorPicker$RadioButtonArr[i10].setVisibility(4);
            }
        }
        mqVar.f29195y = null;
    }
}

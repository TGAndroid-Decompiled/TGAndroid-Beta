package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class kq extends AnimatorListenerAdapter {
    public final int f36917a;
    public final mq f36918b;

    public kq(mq mqVar, int i7) {
        this.f36917a = i7;
        this.f36918b = mqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f36917a;
        mq mqVar = this.f36918b;
        switch (i7) {
            case 0:
                ColorPicker$RadioButton[] colorPicker$RadioButtonArr = mqVar.f37569w;
                if (mqVar.L == 1) {
                    mqVar.G.setVisibility(4);
                }
                for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
                    if (colorPicker$RadioButtonArr[i10].getTag(2131296463) == null) {
                        colorPicker$RadioButtonArr[i10].setVisibility(4);
                    }
                }
                mqVar.E = null;
                return;
            default:
                if (mqVar.L == mqVar.M) {
                    mqVar.H.setVisibility(4);
                }
                mqVar.E = null;
                return;
        }
    }
}

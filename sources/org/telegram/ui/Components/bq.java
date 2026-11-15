package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bq extends AnimatorListenerAdapter {
    public final int f33341a;
    public final dq f33342b;

    public bq(dq dqVar, int i7) {
        this.f33341a = i7;
        this.f33342b = dqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f33341a;
        dq dqVar = this.f33342b;
        switch (i7) {
            case 0:
                ColorPicker$RadioButton[] colorPicker$RadioButtonArr = dqVar.f34044w;
                if (dqVar.L == 1) {
                    dqVar.G.setVisibility(4);
                }
                for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
                    if (colorPicker$RadioButtonArr[i10].getTag(2131296461) == null) {
                        colorPicker$RadioButtonArr[i10].setVisibility(4);
                    }
                }
                dqVar.E = null;
                return;
            default:
                if (dqVar.L == dqVar.M) {
                    dqVar.H.setVisibility(4);
                }
                dqVar.E = null;
                return;
        }
    }
}

package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class aq extends AnimatorListenerAdapter {
    public final int f24471a;
    public final cq f24472b;

    public aq(cq cqVar, int i10) {
        this.f24471a = i10;
        this.f24472b = cqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f24471a;
        cq cqVar = this.f24472b;
        switch (i10) {
            case 0:
                ColorPicker$RadioButton[] colorPicker$RadioButtonArr = cqVar.f25223w;
                if (cqVar.K == 1) {
                    cqVar.F.setVisibility(4);
                }
                for (int i11 = 0; i11 < colorPicker$RadioButtonArr.length; i11++) {
                    if (colorPicker$RadioButtonArr[i11].getTag(2131296461) == null) {
                        colorPicker$RadioButtonArr[i11].setVisibility(4);
                    }
                }
                cqVar.D = null;
                return;
            default:
                if (cqVar.K == cqVar.L) {
                    cqVar.G.setVisibility(4);
                }
                cqVar.D = null;
                return;
        }
    }
}

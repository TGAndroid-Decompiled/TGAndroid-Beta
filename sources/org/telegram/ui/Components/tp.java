package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tp extends AnimatorListenerAdapter {
    public final int f38533a;
    public final vp f38534b;

    public tp(vp vpVar, int i3) {
        this.f38533a = i3;
        this.f38534b = vpVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i3 = this.f38533a;
        vp vpVar = this.f38534b;
        switch (i3) {
            case 0:
                ColorPicker$RadioButton[] colorPicker$RadioButtonArr = vpVar.f39763w;
                if (vpVar.L == 1) {
                    vpVar.G.setVisibility(4);
                }
                for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
                    if (colorPicker$RadioButtonArr[i10].getTag(2131296461) == null) {
                        colorPicker$RadioButtonArr[i10].setVisibility(4);
                    }
                }
                vpVar.E = null;
                return;
            default:
                if (vpVar.L == vpVar.M) {
                    vpVar.H.setVisibility(4);
                }
                vpVar.E = null;
                return;
        }
    }
}

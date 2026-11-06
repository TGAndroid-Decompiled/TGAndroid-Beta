package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tp extends AnimatorListenerAdapter {
    public final int f38379a;
    public final vp f38380b;

    public tp(vp vpVar, int i7) {
        this.f38379a = i7;
        this.f38380b = vpVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f38379a;
        vp vpVar = this.f38380b;
        switch (i7) {
            case 0:
                ColorPicker$RadioButton[] colorPicker$RadioButtonArr = vpVar.f39661w;
                if (vpVar.K == 1) {
                    vpVar.F.setVisibility(4);
                }
                for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
                    if (colorPicker$RadioButtonArr[i10].getTag(2131296461) == null) {
                        colorPicker$RadioButtonArr[i10].setVisibility(4);
                    }
                }
                vpVar.D = null;
                return;
            default:
                if (vpVar.K == vpVar.L) {
                    vpVar.G.setVisibility(4);
                }
                vpVar.D = null;
                return;
        }
    }
}

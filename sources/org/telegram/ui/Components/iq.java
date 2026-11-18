package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class iq extends AnimatorListenerAdapter {
    public final int f36166a;
    public final kq f36167b;

    public iq(kq kqVar, int i7) {
        this.f36166a = i7;
        this.f36167b = kqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f36166a;
        kq kqVar = this.f36167b;
        switch (i7) {
            case 0:
                ColorPicker$RadioButton[] colorPicker$RadioButtonArr = kqVar.f36859w;
                if (kqVar.L == 1) {
                    kqVar.G.setVisibility(4);
                }
                for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
                    if (colorPicker$RadioButtonArr[i10].getTag(2131296461) == null) {
                        colorPicker$RadioButtonArr[i10].setVisibility(4);
                    }
                }
                kqVar.E = null;
                return;
            default:
                if (kqVar.L == kqVar.M) {
                    kqVar.H.setVisibility(4);
                }
                kqVar.E = null;
                return;
        }
    }
}

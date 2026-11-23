package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hq extends AnimatorListenerAdapter {
    public final int f35786a;
    public final jq f35787b;

    public hq(jq jqVar, int i7) {
        this.f35786a = i7;
        this.f35787b = jqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f35786a;
        jq jqVar = this.f35787b;
        switch (i7) {
            case 0:
                ColorPicker$RadioButton[] colorPicker$RadioButtonArr = jqVar.f36493w;
                if (jqVar.L == 1) {
                    jqVar.G.setVisibility(4);
                }
                for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
                    if (colorPicker$RadioButtonArr[i10].getTag(2131296463) == null) {
                        colorPicker$RadioButtonArr[i10].setVisibility(4);
                    }
                }
                jqVar.E = null;
                return;
            default:
                if (jqVar.L == jqVar.M) {
                    jqVar.H.setVisibility(4);
                }
                jqVar.E = null;
                return;
        }
    }
}

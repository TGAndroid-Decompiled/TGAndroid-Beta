package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.R;
public final class qq extends AnimatorListenerAdapter {
    public final sq f26473a;

    public qq(sq sqVar) {
        this.f26473a = sqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        sq sqVar = this.f26473a;
        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = sqVar.v;
        if (sqVar.K == 1) {
            sqVar.F.setVisibility(4);
        }
        for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
            if (colorPicker$RadioButtonArr[i10].getTag(R.id.index_tag) == null) {
                colorPicker$RadioButtonArr[i10].setVisibility(4);
            }
        }
        sqVar.f27164y = null;
    }
}

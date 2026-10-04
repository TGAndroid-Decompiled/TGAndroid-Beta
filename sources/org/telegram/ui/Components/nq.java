package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.R;
public final class nq extends AnimatorListenerAdapter {
    public final pq f29048a;

    public nq(pq pqVar) {
        this.f29048a = pqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        pq pqVar = this.f29048a;
        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = pqVar.v;
        if (pqVar.K == 1) {
            pqVar.F.setVisibility(4);
        }
        for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
            if (colorPicker$RadioButtonArr[i10].getTag(R.id.index_tag) == null) {
                colorPicker$RadioButtonArr[i10].setVisibility(4);
            }
        }
        pqVar.f29728y = null;
    }
}

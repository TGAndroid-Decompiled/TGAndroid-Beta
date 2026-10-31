package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.Menu;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import org.telegram.messenger.pc;
import org.telegram.messenger.qc;
import org.telegram.ui.Components.ce0;
public final class g9 implements qc, pc, ce0 {
    public final Object f21933a;
    public final Object f21934b;

    public g9(Object obj, Object obj2) {
        this.f21933a = obj;
        this.f21934b = obj2;
    }

    @Override
    public void a(String str) {
        h9 h9Var = (h9) this.f21933a;
        h9Var.f22005b = str;
        h9Var.b((Menu) this.f21934b);
    }

    @Override
    public void p(int i10, int i11) {
        x5 x5Var = (x5) this.f21933a;
        mg.c2 c2Var = x5Var.e;
        TextView textView = x5Var.f23582b;
        ((ce0) this.f21934b).p(i10, i11);
        if (i11 > 0) {
            textView.setText("+" + i11);
        } else {
            textView.setText("" + i11);
        }
        if (textView.getTag() == null) {
            AnimatorSet animatorSet = x5Var.d;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            textView.setTag(1);
            AnimatorSet animatorSet2 = new AnimatorSet();
            x5Var.d = animatorSet2;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(x5Var.f23581a, property, 0.0f));
            x5Var.d.setDuration(250L);
            x5Var.d.setInterpolator(new DecelerateInterpolator());
            x5Var.d.addListener(new org.telegram.ui.s9(x5Var, 7));
            x5Var.d.start();
            return;
        }
        org.telegram.messenger.i0.r(c2Var);
        org.telegram.messenger.i0.h3(c2Var, 1000L);
    }

    @Override
    public void q(Exception exc) {
        h9 h9Var = (h9) this.f21933a;
        org.telegram.messenger.f8.d("mlkit: failed to detect language in selection");
        org.telegram.messenger.f8.g(exc, true);
        h9Var.f22005b = null;
        h9Var.b((Menu) this.f21934b);
    }
}

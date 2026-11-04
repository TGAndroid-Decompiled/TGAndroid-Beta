package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.Menu;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import org.telegram.messenger.ic;
import org.telegram.messenger.jc;
import org.telegram.ui.Components.bd0;
public final class d9 implements jc, ic, bd0 {
    public final Object f29095a;
    public final Object f29096b;

    public d9(Object obj, Object obj2) {
        this.f29095a = obj;
        this.f29096b = obj2;
    }

    @Override
    public void a(String str) {
        e9 e9Var = (e9) this.f29095a;
        e9Var.f29134b = str;
        e9Var.b((Menu) this.f29096b);
    }

    @Override
    public void m(int i3, int i10) {
        s5 s5Var = (s5) this.f29095a;
        mi.b0 b0Var = s5Var.f30340e;
        TextView textView = s5Var.f30338b;
        ((bd0) this.f29096b).m(i3, i10);
        if (i10 > 0) {
            textView.setText("+" + i10);
        } else {
            textView.setText("" + i10);
        }
        if (textView.getTag() == null) {
            AnimatorSet animatorSet = s5Var.d;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            textView.setTag(1);
            AnimatorSet animatorSet2 = new AnimatorSet();
            s5Var.d = animatorSet2;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(s5Var.f30337a, property, 0.0f));
            s5Var.d.setDuration(250L);
            s5Var.d.setInterpolator(new DecelerateInterpolator());
            s5Var.d.addListener(new ii.v3(s5Var, 27));
            s5Var.d.start();
            return;
        }
        org.telegram.messenger.g0.r(b0Var);
        org.telegram.messenger.g0.i3(b0Var, 1000L);
    }

    @Override
    public void s(Exception exc) {
        e9 e9Var = (e9) this.f29095a;
        org.telegram.messenger.a8.d("mlkit: failed to detect language in selection");
        org.telegram.messenger.a8.g(exc, true);
        e9Var.f29134b = null;
        e9Var.b((Menu) this.f29096b);
    }
}

package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.Menu;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import org.telegram.messenger.oc;
import org.telegram.messenger.pc;
import org.telegram.ui.Components.gd0;
public final class e9 implements pc, oc, gd0 {
    public final Object f29080a;
    public final Object f29081b;

    public e9(Object obj, Object obj2) {
        this.f29080a = obj;
        this.f29081b = obj2;
    }

    @Override
    public void a(String str) {
        f9 f9Var = (f9) this.f29080a;
        f9Var.f29133b = str;
        f9Var.b((Menu) this.f29081b);
    }

    @Override
    public void l(int i7, int i10) {
        s5 s5Var = (s5) this.f29080a;
        m.f3 f3Var = s5Var.f30267e;
        TextView textView = s5Var.f30265b;
        ((gd0) this.f29081b).l(i7, i10);
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
            animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(s5Var.f30264a, property, 0.0f));
            s5Var.d.setDuration(250L);
            s5Var.d.setInterpolator(new DecelerateInterpolator());
            s5Var.d.addListener(new m.a(s5Var, 26));
            s5Var.d.start();
            return;
        }
        org.telegram.messenger.g0.r(f3Var);
        org.telegram.messenger.g0.i3(f3Var, 1000L);
    }

    @Override
    public void r(Exception exc) {
        f9 f9Var = (f9) this.f29080a;
        org.telegram.messenger.a8.d("mlkit: failed to detect language in selection");
        org.telegram.messenger.a8.g(exc, true);
        f9Var.f29133b = null;
        f9Var.b((Menu) this.f29081b);
    }
}

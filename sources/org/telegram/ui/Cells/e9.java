package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.Menu;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import org.telegram.messenger.mc;
import org.telegram.messenger.nc;
import org.telegram.ui.Components.rd0;
public final class e9 implements nc, mc, rd0 {
    public final Object f30574a;
    public final Object f30575b;

    public e9(Object obj, Object obj2) {
        this.f30574a = obj;
        this.f30575b = obj2;
    }

    @Override
    public void a(String str) {
        f9 f9Var = (f9) this.f30574a;
        f9Var.f30623b = str;
        f9Var.b((Menu) this.f30575b);
    }

    @Override
    public void j(int i7, int i10) {
        t5 t5Var = (t5) this.f30574a;
        j6.o oVar = t5Var.f31979e;
        TextView textView = t5Var.f31977b;
        ((rd0) this.f30575b).j(i7, i10);
        if (i10 > 0) {
            textView.setText("+" + i10);
        } else {
            textView.setText("" + i10);
        }
        if (textView.getTag() == null) {
            AnimatorSet animatorSet = t5Var.d;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            textView.setTag(1);
            AnimatorSet animatorSet2 = new AnimatorSet();
            t5Var.d = animatorSet2;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(t5Var.f31976a, property, 0.0f));
            t5Var.d.setDuration(250L);
            t5Var.d.setInterpolator(new DecelerateInterpolator());
            t5Var.d.addListener(new ki.n3(t5Var, 27));
            t5Var.d.start();
            return;
        }
        org.telegram.messenger.g0.r(oVar);
        org.telegram.messenger.g0.h3(oVar, 1000L);
    }

    @Override
    public void q(Exception exc) {
        f9 f9Var = (f9) this.f30574a;
        org.telegram.messenger.a8.d("mlkit: failed to detect language in selection");
        org.telegram.messenger.a8.g(exc, true);
        f9Var.f30623b = null;
        f9Var.b((Menu) this.f30575b);
    }
}

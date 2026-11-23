package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.Menu;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import org.telegram.messenger.nc;
import org.telegram.messenger.oc;
import org.telegram.ui.Components.sd0;
public final class f9 implements oc, nc, sd0 {
    public final Object f30623a;
    public final Object f30624b;

    public f9(Object obj, Object obj2) {
        this.f30623a = obj;
        this.f30624b = obj2;
    }

    @Override
    public void a(String str) {
        g9 g9Var = (g9) this.f30623a;
        g9Var.f30679b = str;
        g9Var.b((Menu) this.f30624b);
    }

    @Override
    public void j(int i7, int i10) {
        u5 u5Var = (u5) this.f30623a;
        j6.o oVar = u5Var.f32024e;
        TextView textView = u5Var.f32022b;
        ((sd0) this.f30624b).j(i7, i10);
        if (i10 > 0) {
            textView.setText("+" + i10);
        } else {
            textView.setText("" + i10);
        }
        if (textView.getTag() == null) {
            AnimatorSet animatorSet = u5Var.d;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            textView.setTag(1);
            AnimatorSet animatorSet2 = new AnimatorSet();
            u5Var.d = animatorSet2;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(u5Var.f32021a, property, 0.0f));
            u5Var.d.setDuration(250L);
            u5Var.d.setInterpolator(new DecelerateInterpolator());
            u5Var.d.addListener(new ki.m3(u5Var, 27));
            u5Var.d.start();
            return;
        }
        org.telegram.messenger.g0.r(oVar);
        org.telegram.messenger.g0.h3(oVar, 1000L);
    }

    @Override
    public void q(Exception exc) {
        g9 g9Var = (g9) this.f30623a;
        org.telegram.messenger.a8.d("mlkit: failed to detect language in selection");
        org.telegram.messenger.a8.g(exc, true);
        g9Var.f30679b = null;
        g9Var.b((Menu) this.f30624b);
    }
}

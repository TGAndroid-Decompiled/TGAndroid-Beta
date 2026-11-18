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
public final class f9 implements nc, mc, rd0 {
    public final Object f30626a;
    public final Object f30627b;

    public f9(Object obj, Object obj2) {
        this.f30626a = obj;
        this.f30627b = obj2;
    }

    @Override
    public void a(String str) {
        g9 g9Var = (g9) this.f30626a;
        g9Var.f30682b = str;
        g9Var.b((Menu) this.f30627b);
    }

    @Override
    public void j(int i7, int i10) {
        u5 u5Var = (u5) this.f30626a;
        j6.o oVar = u5Var.f32027e;
        TextView textView = u5Var.f32025b;
        ((rd0) this.f30627b).j(i7, i10);
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
            animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(u5Var.f32024a, property, 0.0f));
            u5Var.d.setDuration(250L);
            u5Var.d.setInterpolator(new DecelerateInterpolator());
            u5Var.d.addListener(new ki.n3(u5Var, 27));
            u5Var.d.start();
            return;
        }
        org.telegram.messenger.g0.r(oVar);
        org.telegram.messenger.g0.h3(oVar, 1000L);
    }

    @Override
    public void q(Exception exc) {
        g9 g9Var = (g9) this.f30626a;
        org.telegram.messenger.a8.d("mlkit: failed to detect language in selection");
        org.telegram.messenger.a8.g(exc, true);
        g9Var.f30682b = null;
        g9Var.b((Menu) this.f30627b);
    }
}

package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.Menu;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.ui.Components.ze0;
public final class i9 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback, ze0 {
    public final Object f21227a;
    public final Object f21228b;

    public i9(Object obj, Object obj2) {
        this.f21227a = obj;
        this.f21228b = obj2;
    }

    @Override
    public void k(int i10, int i11) {
        v5 v5Var = (v5) this.f21227a;
        m2.b bVar = v5Var.e;
        TextView textView = v5Var.f22501b;
        ((ze0) this.f21228b).k(i10, i11);
        if (i11 > 0) {
            textView.setText("+" + i11);
        } else {
            textView.setText("" + i11);
        }
        if (textView.getTag() == null) {
            AnimatorSet animatorSet = v5Var.d;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            textView.setTag(1);
            AnimatorSet animatorSet2 = new AnimatorSet();
            v5Var.d = animatorSet2;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(v5Var.f22500a, property, 0.0f));
            v5Var.d.setDuration(250L);
            v5Var.d.setInterpolator(new DecelerateInterpolator());
            v5Var.d.addListener(new org.telegram.ui.s5(v5Var, 9));
            v5Var.d.start();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(bVar);
        AndroidUtilities.runOnUIThread(bVar, 1000L);
    }

    @Override
    public void run(String str) {
        j9 j9Var = (j9) this.f21227a;
        j9Var.f21268a = str;
        j9Var.a((Menu) this.f21228b);
    }

    @Override
    public void run(Exception exc) {
        j9 j9Var = (j9) this.f21227a;
        j9Var.getClass();
        FileLog.e("mlkit: failed to detect language in selection");
        FileLog.e(exc);
        j9Var.f21268a = null;
        j9Var.a((Menu) this.f21228b);
    }
}

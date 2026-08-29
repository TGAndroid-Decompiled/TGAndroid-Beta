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
import org.telegram.ui.Components.qe0;
public final class g9 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback, qe0 {
    public final Object f24418a;
    public final Object f24419b;

    public g9(Object obj, Object obj2) {
        this.f24418a = obj;
        this.f24419b = obj2;
    }

    @Override
    public void l(int i10, int i11) {
        t5 t5Var = (t5) this.f24418a;
        lh.m7 m7Var = t5Var.f25703e;
        TextView textView = t5Var.f25701b;
        ((qe0) this.f24419b).l(i10, i11);
        if (i11 > 0) {
            textView.setText("+" + i11);
        } else {
            textView.setText("" + i11);
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
            animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(t5Var.f25700a, property, 0.0f));
            t5Var.d.setDuration(250L);
            t5Var.d.setInterpolator(new DecelerateInterpolator());
            t5Var.d.addListener(new nh.q5(t5Var, 18));
            t5Var.d.start();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(m7Var);
        AndroidUtilities.runOnUIThread(m7Var, 1000L);
    }

    @Override
    public void run(String str) {
        h9 h9Var = (h9) this.f24418a;
        h9Var.f24464a = str;
        h9Var.a((Menu) this.f24419b);
    }

    @Override
    public void run(Exception exc) {
        h9 h9Var = (h9) this.f24418a;
        h9Var.getClass();
        FileLog.e("mlkit: failed to detect language in selection");
        FileLog.e(exc);
        h9Var.f24464a = null;
        h9Var.a((Menu) this.f24419b);
    }
}

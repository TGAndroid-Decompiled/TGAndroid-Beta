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
import org.telegram.ui.Components.ve0;
public final class m9 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback, ve0 {
    public final Object f20430a;
    public final Object f20431b;

    public m9(Object obj, Object obj2) {
        this.f20430a = obj;
        this.f20431b = obj2;
    }

    @Override
    public void k(int i10, int i11) {
        v5 v5Var = (v5) this.f20430a;
        ai.q4 q4Var = v5Var.e;
        TextView textView = v5Var.f21461b;
        ((ve0) this.f20431b).k(i10, i11);
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
            animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(v5Var.f21460a, property, 0.0f));
            v5Var.d.setDuration(250L);
            v5Var.d.setInterpolator(new DecelerateInterpolator());
            v5Var.d.addListener(new org.telegram.ui.t4(v5Var, 10));
            v5Var.d.start();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(q4Var);
        AndroidUtilities.runOnUIThread(q4Var, 1000L);
    }

    @Override
    public void run(String str) {
        n9 n9Var = (n9) this.f20430a;
        n9Var.f20493a = str;
        n9Var.a((Menu) this.f20431b);
    }

    @Override
    public void run(Exception exc) {
        n9 n9Var = (n9) this.f20430a;
        n9Var.getClass();
        FileLog.e("mlkit: failed to detect language in selection");
        FileLog.e(exc);
        n9Var.f20493a = null;
        n9Var.a((Menu) this.f20431b);
    }
}

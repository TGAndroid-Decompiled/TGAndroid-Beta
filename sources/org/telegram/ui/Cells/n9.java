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
import org.telegram.ui.Components.df0;
public final class n9 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback, df0 {
    public final Object f20709a;
    public final Object f20710b;

    public n9(Object obj, Object obj2) {
        this.f20709a = obj;
        this.f20710b = obj2;
    }

    @Override
    public void j(int i10, int i11) {
        w5 w5Var = (w5) this.f20709a;
        ai.q4 q4Var = w5Var.e;
        TextView textView = w5Var.f21792b;
        ((df0) this.f20710b).j(i10, i11);
        if (i11 > 0) {
            textView.setText("+" + i11);
        } else {
            textView.setText("" + i11);
        }
        if (textView.getTag() == null) {
            AnimatorSet animatorSet = w5Var.d;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            textView.setTag(1);
            AnimatorSet animatorSet2 = new AnimatorSet();
            w5Var.d = animatorSet2;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(w5Var.f21791a, property, 0.0f));
            w5Var.d.setDuration(250L);
            w5Var.d.setInterpolator(new DecelerateInterpolator());
            w5Var.d.addListener(new org.telegram.ui.t4(w5Var, 10));
            w5Var.d.start();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(q4Var);
        AndroidUtilities.runOnUIThread(q4Var, 1000L);
    }

    @Override
    public void run(String str) {
        o9 o9Var = (o9) this.f20709a;
        o9Var.f20780a = str;
        o9Var.a((Menu) this.f20710b);
    }

    @Override
    public void run(Exception exc) {
        o9 o9Var = (o9) this.f20709a;
        o9Var.getClass();
        FileLog.e("mlkit: failed to detect language in selection");
        FileLog.e(exc);
        o9Var.f20780a = null;
        o9Var.a((Menu) this.f20710b);
    }
}

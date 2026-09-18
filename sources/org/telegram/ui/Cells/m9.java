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
    public final Object f20454a;
    public final Object f20455b;

    public m9(Object obj, Object obj2) {
        this.f20454a = obj;
        this.f20455b = obj2;
    }

    @Override
    public void k(int i10, int i11) {
        u5 u5Var = (u5) this.f20454a;
        ai.q4 q4Var = u5Var.e;
        TextView textView = u5Var.f21441b;
        ((ve0) this.f20455b).k(i10, i11);
        if (i11 > 0) {
            textView.setText("+" + i11);
        } else {
            textView.setText("" + i11);
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
            animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(u5Var.f21440a, property, 0.0f));
            u5Var.d.setDuration(250L);
            u5Var.d.setInterpolator(new DecelerateInterpolator());
            u5Var.d.addListener(new org.telegram.ui.t4(u5Var, 10));
            u5Var.d.start();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(q4Var);
        AndroidUtilities.runOnUIThread(q4Var, 1000L);
    }

    @Override
    public void run(String str) {
        n9 n9Var = (n9) this.f20454a;
        n9Var.f20515a = str;
        n9Var.a((Menu) this.f20455b);
    }

    @Override
    public void run(Exception exc) {
        n9 n9Var = (n9) this.f20454a;
        n9Var.getClass();
        FileLog.e("mlkit: failed to detect language in selection");
        FileLog.e(exc);
        n9Var.f20515a = null;
        n9Var.a((Menu) this.f20455b);
    }
}

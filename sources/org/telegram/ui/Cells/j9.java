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
import org.telegram.ui.Components.ce0;
public final class j9 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback, ce0 {
    public final Object f24577a;
    public final Object f24578b;

    public j9(Object obj, Object obj2) {
        this.f24577a = obj;
        this.f24578b = obj2;
    }

    @Override
    public void l(int i9, int i10) {
        v5 v5Var = (v5) this.f24577a;
        m.i3 i3Var = v5Var.f25795e;
        TextView textView = v5Var.f25793b;
        ((ce0) this.f24578b).l(i9, i10);
        if (i10 > 0) {
            textView.setText("+" + i10);
        } else {
            textView.setText("" + i10);
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
            animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(v5Var.f25792a, property, 0.0f));
            v5Var.d.setDuration(250L);
            v5Var.d.setInterpolator(new DecelerateInterpolator());
            v5Var.d.addListener(new mh.x(v5Var, 16));
            v5Var.d.start();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(i3Var);
        AndroidUtilities.runOnUIThread(i3Var, 1000L);
    }

    @Override
    public void run(String str) {
        k9 k9Var = (k9) this.f24577a;
        k9Var.f24627a = str;
        k9Var.a((Menu) this.f24578b);
    }

    @Override
    public void run(Exception exc) {
        k9 k9Var = (k9) this.f24577a;
        k9Var.getClass();
        FileLog.e("mlkit: failed to detect language in selection");
        FileLog.e(exc);
        k9Var.f24627a = null;
        k9Var.a((Menu) this.f24578b);
    }
}

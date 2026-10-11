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
import org.telegram.ui.Components.yf0;
public final class k9 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback, yf0 {
    public final Object f22398a;
    public final Object f22399b;

    public k9(Object obj, Object obj2) {
        this.f22398a = obj;
        this.f22399b = obj2;
    }

    @Override
    public void k(int i10, int i11) {
        v5 v5Var = (v5) this.f22398a;
        ai.r4 r4Var = v5Var.f23537e;
        TextView textView = v5Var.f23535b;
        ((yf0) this.f22399b).k(i10, i11);
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
            animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(v5Var.f23534a, property, 0.0f));
            v5Var.d.setDuration(250L);
            v5Var.d.setInterpolator(new DecelerateInterpolator());
            v5Var.d.addListener(new org.telegram.ui.s4(v5Var, 10));
            v5Var.d.start();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(r4Var);
        AndroidUtilities.runOnUIThread(r4Var, 1000L);
    }

    @Override
    public void run(String str) {
        l9 l9Var = (l9) this.f22398a;
        l9Var.f22421a = str;
        l9Var.a((Menu) this.f22399b);
    }

    @Override
    public void run(Exception exc) {
        l9 l9Var = (l9) this.f22398a;
        l9Var.getClass();
        FileLog.e("mlkit: failed to detect language in selection");
        FileLog.e(exc);
        l9Var.f22421a = null;
        l9Var.a((Menu) this.f22399b);
    }
}

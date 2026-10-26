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
import org.telegram.ui.Components.pf0;
public final class o9 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback, pf0 {
    public final Object f24620a;
    public final Object f24621b;

    public o9(Object obj, Object obj2) {
        this.f24620a = obj;
        this.f24621b = obj2;
    }

    @Override
    public void l(int i10, int i11) {
        z5 z5Var = (z5) this.f24620a;
        m.g3 g3Var = z5Var.e;
        TextView textView = z5Var.f25789b;
        ((pf0) this.f24621b).l(i10, i11);
        if (i11 > 0) {
            textView.setText("+" + i11);
        } else {
            textView.setText("" + i11);
        }
        if (textView.getTag() == null) {
            AnimatorSet animatorSet = z5Var.d;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            textView.setTag(1);
            AnimatorSet animatorSet2 = new AnimatorSet();
            z5Var.d = animatorSet2;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(z5Var.f25788a, property, 0.0f));
            z5Var.d.setDuration(250L);
            z5Var.d.setInterpolator(new DecelerateInterpolator());
            z5Var.d.addListener(new kg.e(z5Var, 17));
            z5Var.d.start();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(g3Var);
        AndroidUtilities.runOnUIThread(g3Var, 1000L);
    }

    @Override
    public void run(String str) {
        p9 p9Var = (p9) this.f24620a;
        p9Var.f24780a = str;
        p9Var.a((Menu) this.f24621b);
    }

    @Override
    public void run(Exception exc) {
        p9 p9Var = (p9) this.f24620a;
        p9Var.getClass();
        FileLog.e("mlkit: failed to detect language in selection");
        FileLog.e(exc);
        p9Var.f24780a = null;
        p9Var.a((Menu) this.f24621b);
    }
}

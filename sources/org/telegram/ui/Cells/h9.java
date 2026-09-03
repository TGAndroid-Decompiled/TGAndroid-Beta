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
import org.telegram.ui.Components.af0;
public final class h9 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback, af0 {
    public final Object f21160a;
    public final Object f21161b;

    public h9(Object obj, Object obj2) {
        this.f21160a = obj;
        this.f21161b = obj2;
    }

    @Override
    public void i(int i10, int i11) {
        u5 u5Var = (u5) this.f21160a;
        m2.b bVar = u5Var.e;
        TextView textView = u5Var.f22375b;
        ((af0) this.f21161b).i(i10, i11);
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
            animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(u5Var.f22374a, property, 0.0f));
            u5Var.d.setDuration(250L);
            u5Var.d.setInterpolator(new DecelerateInterpolator());
            u5Var.d.addListener(new org.telegram.ui.u5(u5Var, 9));
            u5Var.d.start();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(bVar);
        AndroidUtilities.runOnUIThread(bVar, 1000L);
    }

    @Override
    public void run(String str) {
        i9 i9Var = (i9) this.f21160a;
        i9Var.f21194a = str;
        i9Var.a((Menu) this.f21161b);
    }

    @Override
    public void run(Exception exc) {
        i9 i9Var = (i9) this.f21160a;
        i9Var.getClass();
        FileLog.e("mlkit: failed to detect language in selection");
        FileLog.e(exc);
        i9Var.f21194a = null;
        i9Var.a((Menu) this.f21161b);
    }
}

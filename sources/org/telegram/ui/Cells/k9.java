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
import org.telegram.ui.Components.uf0;
public final class k9 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback, uf0 {
    public final Object f21468a;
    public final Object f21469b;

    public k9(Object obj, Object obj2) {
        this.f21468a = obj;
        this.f21469b = obj2;
    }

    @Override
    public void j(int i10, int i11) {
        v5 v5Var = (v5) this.f21468a;
        androidx.activity.i iVar = v5Var.e;
        TextView textView = v5Var.f22567b;
        ((uf0) this.f21469b).j(i10, i11);
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
            animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(v5Var.f22566a, property, 0.0f));
            v5Var.d.setDuration(250L);
            v5Var.d.setInterpolator(new DecelerateInterpolator());
            v5Var.d.addListener(new org.telegram.ui.u0(v5Var, 13));
            v5Var.d.start();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(iVar);
        AndroidUtilities.runOnUIThread(iVar, 1000L);
    }

    @Override
    public void run(String str) {
        l9 l9Var = (l9) this.f21468a;
        l9Var.f21491a = str;
        l9Var.a((Menu) this.f21469b);
    }

    @Override
    public void run(Exception exc) {
        l9 l9Var = (l9) this.f21468a;
        l9Var.getClass();
        FileLog.e("mlkit: failed to detect language in selection");
        FileLog.e(exc);
        l9Var.f21491a = null;
        l9Var.a((Menu) this.f21469b);
    }
}

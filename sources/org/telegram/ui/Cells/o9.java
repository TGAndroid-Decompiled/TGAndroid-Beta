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
import org.telegram.ui.Components.ef0;
public final class o9 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback, ef0 {
    public final Object f19663a;
    public final Object f19664b;

    public o9(Object obj, Object obj2) {
        this.f19663a = obj;
        this.f19664b = obj2;
    }

    @Override
    public void k(int i10, int i11) {
        w5 w5Var = (w5) this.f19663a;
        androidx.activity.i iVar = w5Var.e;
        TextView textView = w5Var.f20662b;
        ((ef0) this.f19664b).k(i10, i11);
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
            animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(w5Var.f20661a, property, 0.0f));
            w5Var.d.setDuration(250L);
            w5Var.d.setInterpolator(new DecelerateInterpolator());
            w5Var.d.addListener(new v5(w5Var, 0));
            w5Var.d.start();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(iVar);
        AndroidUtilities.runOnUIThread(iVar, 1000L);
    }

    @Override
    public void run(String str) {
        p9 p9Var = (p9) this.f19663a;
        p9Var.f19693a = str;
        p9Var.a((Menu) this.f19664b);
    }

    @Override
    public void run(Exception exc) {
        p9 p9Var = (p9) this.f19663a;
        p9Var.getClass();
        FileLog.e("mlkit: failed to detect language in selection");
        FileLog.e(exc);
        p9Var.f19693a = null;
        p9Var.a((Menu) this.f19664b);
    }
}

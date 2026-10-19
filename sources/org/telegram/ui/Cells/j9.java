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
import org.telegram.ui.Components.of0;
public final class j9 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback, of0 {
    public final Object f22490a;
    public final Object f22491b;

    public j9(Object obj, Object obj2) {
        this.f22490a = obj;
        this.f22491b = obj2;
    }

    @Override
    public void l(int i10, int i11) {
        u5 u5Var = (u5) this.f22490a;
        androidx.activity.i iVar = u5Var.e;
        TextView textView = u5Var.f23595b;
        ((of0) this.f22491b).l(i10, i11);
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
            animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(u5Var.f23594a, property, 0.0f));
            u5Var.d.setDuration(250L);
            u5Var.d.setInterpolator(new DecelerateInterpolator());
            u5Var.d.addListener(new m.a(u5Var, 15));
            u5Var.d.start();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(iVar);
        AndroidUtilities.runOnUIThread(iVar, 1000L);
    }

    @Override
    public void run(String str) {
        k9 k9Var = (k9) this.f22490a;
        k9Var.f22513a = str;
        k9Var.a((Menu) this.f22491b);
    }

    @Override
    public void run(Exception exc) {
        k9 k9Var = (k9) this.f22490a;
        k9Var.getClass();
        FileLog.e("mlkit: failed to detect language in selection");
        FileLog.e(exc);
        k9Var.f22513a = null;
        k9Var.a((Menu) this.f22491b);
    }
}

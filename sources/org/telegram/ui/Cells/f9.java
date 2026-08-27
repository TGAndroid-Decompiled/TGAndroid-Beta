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
import org.telegram.ui.Components.he0;

public final class f9 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback, he0 {

    public final Object f24355a;

    public final Object f24356b;

    public f9(Object obj, Object obj2) {
        this.f24355a = obj;
        this.f24356b = obj2;
    }

    @Override
    public void l(int i10, int i11) {
        s5 s5Var = (s5) this.f24355a;
        he0 he0Var = (he0) this.f24356b;
        m.i3 i3Var = s5Var.f25636e;
        TextView textView = s5Var.f25634b;
        he0Var.l(i10, i11);
        if (i11 > 0) {
            textView.setText("+" + i11);
        } else {
            textView.setText("" + i11);
        }
        if (textView.getTag() != null) {
            AndroidUtilities.cancelRunOnUIThread(i3Var);
            AndroidUtilities.runOnUIThread(i3Var, 1000L);
            return;
        }
        AnimatorSet animatorSet = s5Var.d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        textView.setTag(1);
        AnimatorSet animatorSet2 = new AnimatorSet();
        s5Var.d = animatorSet2;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(s5Var.f25633a, (Property<TextView, Float>) property, 0.0f));
        s5Var.d.setDuration(250L);
        s5Var.d.setInterpolator(new DecelerateInterpolator());
        s5Var.d.addListener(new lh.h9(s5Var, 18));
        s5Var.d.start();
    }

    @Override
    public void run(String str) {
        g9 g9Var = (g9) this.f24355a;
        Menu menu = (Menu) this.f24356b;
        g9Var.f24403a = str;
        g9Var.a(menu);
    }

    @Override
    public void run(Exception exc) {
        g9 g9Var = (g9) this.f24355a;
        Menu menu = (Menu) this.f24356b;
        g9Var.getClass();
        FileLog.e("mlkit: failed to detect language in selection");
        FileLog.e(exc);
        g9Var.f24403a = null;
        g9Var.a(menu);
    }
}

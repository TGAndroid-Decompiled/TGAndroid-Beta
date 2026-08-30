package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import nh.n5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.vs;
public final class p2 extends FrameLayout {
    public TextView[] f29856a;
    public TextView f29857b;
    public FrameLayout f29858c;
    public t2 d;
    public CharSequence e;
    public boolean f29859f;
    public ValueAnimator h;
    public boolean f29860n;

    public final void a(View view, View view2, Runnable runnable) {
        view.setVisibility(0);
        view2.setVisibility(0);
        view2.setTranslationY(AndroidUtilities.dp(15.0f));
        view2.setAlpha(0.0f);
        this.f29859f = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new ag.a(17, view2, view));
        this.h.addListener(new vs(this, view, view2, runnable, 2));
        this.h.setDuration(250L).setInterpolator(nr.f27346f);
        this.h.start();
    }

    public final void b(String str, boolean z4, boolean z10) {
        View view = this.d;
        View[] viewArr = this.f29856a;
        if (z4) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            SpannableString spannableString = new SpannableString(".");
            spannableString.setSpan(new org.telegram.ui.Components.a0(viewArr), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            str = spannableStringBuilder;
        }
        if (TextUtils.isEmpty(viewArr[0].getText())) {
            z10 = false;
        }
        if (!z10) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f29859f = false;
            viewArr[0].setText(str);
            viewArr[0].setVisibility(0);
            viewArr[1].setVisibility(8);
            view.setVisibility(8);
        } else if (this.f29859f) {
            this.e = str;
        } else if (this.f29860n) {
            viewArr[0].setText(str);
            a(view, viewArr[0], null);
        } else if (!viewArr[0].getText().equals(str)) {
            viewArr[1].setText(str);
            a(viewArr[0], viewArr[1], new n5(this, 24));
        }
    }

    public final void c(boolean z4) {
        FrameLayout frameLayout = this.f29858c;
        if (z4) {
            if (frameLayout.getVisibility() != 0) {
                frameLayout.setVisibility(0);
                frameLayout.setAlpha(0.0f);
                frameLayout.setScaleY(0.6f);
                frameLayout.setScaleX(0.6f);
                frameLayout.animate().setListener(null).cancel();
                org.telegram.ui.b.p(frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), nr.f27350k, 300L);
            }
        } else if (frameLayout.getVisibility() == 8) {
        } else {
            frameLayout.animate().alpha(0.0f).scaleX(0.6f).scaleY(0.6f).setInterpolator(nr.f27346f).setListener(new o2(this, 1)).setDuration(300L).start();
        }
    }

    public final void d(boolean z4, boolean z10) {
        TextView textView = this.f29857b;
        int i10 = 0;
        if (!z10) {
            textView.animate().setListener(null).cancel();
            if (!z4) {
                i10 = 8;
            }
            textView.setVisibility(i10);
        } else if (z4) {
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
            }
            textView.animate().setListener(null).cancel();
            textView.animate().alpha(1.0f).setDuration(150L).start();
        } else {
            textView.animate().alpha(0.0f).setListener(new o2(this, 0)).setDuration(150L).start();
        }
    }

    public final void e(boolean z4) {
        t2 t2Var = this.d;
        View[] viewArr = this.f29856a;
        if (TextUtils.isEmpty(viewArr[0].getText())) {
            z4 = false;
        }
        if (this.f29860n) {
            return;
        }
        t2Var.a();
        if (!z4) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f29860n = true;
            this.f29859f = false;
            viewArr[0].setVisibility(8);
            viewArr[1].setVisibility(8);
            t2Var.setVisibility(0);
        } else if (this.f29859f) {
            this.e = "timer";
        } else {
            this.f29860n = true;
            a(viewArr[0], t2Var, null);
        }
    }

    public void setSignalBarCount(int i10) {
        this.d.setSignalBarCount(i10);
    }
}

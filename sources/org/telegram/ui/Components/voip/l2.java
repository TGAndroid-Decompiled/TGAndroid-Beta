package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.m10;
import org.telegram.ui.Components.kr;
public final class l2 extends FrameLayout {
    public TextView[] f41039a;
    public TextView f41040b;
    public FrameLayout f41041c;
    public p2 d;
    public CharSequence f41042e;
    public boolean f41043f;
    public ValueAnimator h;
    public boolean f41044n;

    public final void a(View view, View view2, Runnable runnable) {
        view.setVisibility(0);
        view2.setVisibility(0);
        view2.setTranslationY(org.telegram.messenger.g0.L(15.0f));
        view2.setAlpha(0.0f);
        this.f41043f = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new ch.w(18, view2, view));
        this.h.addListener(new jg.j0((FrameLayout) this, view, view2, (Object) runnable, 3));
        this.h.setDuration(250L).setInterpolator(kr.f36858f);
        this.h.start();
    }

    public final void b(String str, boolean z10, boolean z11) {
        View view = this.d;
        View[] viewArr = this.f41039a;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            SpannableString spannableString = new SpannableString(".");
            spannableString.setSpan(new kg.r1(viewArr), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            str = spannableStringBuilder;
        }
        if (TextUtils.isEmpty(viewArr[0].getText())) {
            z11 = false;
        }
        if (!z11) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f41043f = false;
            viewArr[0].setText(str);
            viewArr[0].setVisibility(0);
            viewArr[1].setVisibility(8);
            view.setVisibility(8);
        } else if (this.f41043f) {
            this.f41042e = str;
        } else if (this.f41044n) {
            viewArr[0].setText(str);
            a(view, viewArr[0], null);
        } else if (!viewArr[0].getText().equals(str)) {
            viewArr[1].setText(str);
            a(viewArr[0], viewArr[1], new oi.c2(this, 21));
        }
    }

    public final void c(boolean z10) {
        FrameLayout frameLayout = this.f41041c;
        if (z10) {
            if (frameLayout.getVisibility() != 0) {
                frameLayout.setVisibility(0);
                frameLayout.setAlpha(0.0f);
                frameLayout.setScaleY(0.6f);
                frameLayout.setScaleX(0.6f);
                frameLayout.animate().setListener(null).cancel();
                m10.o(frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), kr.f36862k, 300L);
            }
        } else if (frameLayout.getVisibility() == 8) {
        } else {
            frameLayout.animate().alpha(0.0f).scaleX(0.6f).scaleY(0.6f).setInterpolator(kr.f36858f).setListener(new k2(this, 1)).setDuration(300L).start();
        }
    }

    public final void d(boolean z10, boolean z11) {
        TextView textView = this.f41040b;
        int i7 = 0;
        if (!z11) {
            textView.animate().setListener(null).cancel();
            if (!z10) {
                i7 = 8;
            }
            textView.setVisibility(i7);
        } else if (z10) {
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
            }
            textView.animate().setListener(null).cancel();
            textView.animate().alpha(1.0f).setDuration(150L).start();
        } else {
            textView.animate().alpha(0.0f).setListener(new k2(this, 0)).setDuration(150L).start();
        }
    }

    public final void e(boolean z10) {
        p2 p2Var = this.d;
        View[] viewArr = this.f41039a;
        if (TextUtils.isEmpty(viewArr[0].getText())) {
            z10 = false;
        }
        if (this.f41044n) {
            return;
        }
        p2Var.a();
        if (!z10) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f41044n = true;
            this.f41043f = false;
            viewArr[0].setVisibility(8);
            viewArr[1].setVisibility(8);
            p2Var.setVisibility(0);
        } else if (this.f41043f) {
            this.f41042e = "timer";
        } else {
            this.f41044n = true;
            a(viewArr[0], p2Var, null);
        }
    }

    public void setSignalBarCount(int i7) {
        this.d.setSignalBarCount(i7);
    }
}

package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.de;
import org.telegram.ui.ActionBar.o5;
import org.telegram.ui.Components.xq;
public final class h2 extends FrameLayout {
    public TextView[] f39333a;
    public TextView f39334b;
    public FrameLayout f39335c;
    public l2 d;
    public CharSequence f39336e;
    public boolean f39337f;
    public ValueAnimator h;
    public boolean f39338n;

    public final void a(View view, View view2, Runnable runnable) {
        view.setVisibility(0);
        view2.setVisibility(0);
        view2.setTranslationY(org.telegram.messenger.g0.L(15.0f));
        view2.setAlpha(0.0f);
        this.f39337f = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new de(19, view2, view));
        this.h.addListener(new jg.j0((FrameLayout) this, view, view2, (Object) runnable, 4));
        this.h.setDuration(250L).setInterpolator(xq.f40458f);
        this.h.start();
    }

    public final void b(String str, boolean z9, boolean z10) {
        View view = this.d;
        View[] viewArr = this.f39333a;
        if (z9) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            SpannableString spannableString = new SpannableString(".");
            spannableString.setSpan(new kg.o1(viewArr), 0, 1, 33);
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
            this.f39337f = false;
            viewArr[0].setText(str);
            viewArr[0].setVisibility(0);
            viewArr[1].setVisibility(8);
            view.setVisibility(8);
        } else if (this.f39337f) {
            this.f39336e = str;
        } else if (this.f39338n) {
            viewArr[0].setText(str);
            a(view, viewArr[0], null);
        } else if (!viewArr[0].getText().equals(str)) {
            viewArr[1].setText(str);
            a(viewArr[0], viewArr[1], new o5(this, 5));
        }
    }

    public final void c(boolean z9) {
        FrameLayout frameLayout = this.f39335c;
        if (z9) {
            if (frameLayout.getVisibility() != 0) {
                frameLayout.setVisibility(0);
                frameLayout.setAlpha(0.0f);
                frameLayout.setScaleY(0.6f);
                frameLayout.setScaleX(0.6f);
                frameLayout.animate().setListener(null).cancel();
                org.telegram.messenger.camera.q.l(frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), xq.f40462k, 300L);
            }
        } else if (frameLayout.getVisibility() == 8) {
        } else {
            frameLayout.animate().alpha(0.0f).scaleX(0.6f).scaleY(0.6f).setInterpolator(xq.f40458f).setListener(new g2(this, 1)).setDuration(300L).start();
        }
    }

    public final void d(boolean z9, boolean z10) {
        TextView textView = this.f39334b;
        int i7 = 0;
        if (!z10) {
            textView.animate().setListener(null).cancel();
            if (!z9) {
                i7 = 8;
            }
            textView.setVisibility(i7);
        } else if (z9) {
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
            }
            textView.animate().setListener(null).cancel();
            textView.animate().alpha(1.0f).setDuration(150L).start();
        } else {
            textView.animate().alpha(0.0f).setListener(new g2(this, 0)).setDuration(150L).start();
        }
    }

    public final void e(boolean z9) {
        l2 l2Var = this.d;
        View[] viewArr = this.f39333a;
        if (TextUtils.isEmpty(viewArr[0].getText())) {
            z9 = false;
        }
        if (this.f39338n) {
            return;
        }
        l2Var.a();
        if (!z9) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f39338n = true;
            this.f39337f = false;
            viewArr[0].setVisibility(8);
            viewArr[1].setVisibility(8);
            l2Var.setVisibility(0);
        } else if (this.f39337f) {
            this.f39336e = "timer";
        } else {
            this.f39338n = true;
            a(viewArr[0], l2Var, null);
        }
    }

    public void setSignalBarCount(int i7) {
        this.d.setSignalBarCount(i7);
    }
}

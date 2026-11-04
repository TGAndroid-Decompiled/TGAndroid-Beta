package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import ci.uc;
import org.telegram.ui.ActionBar.d4;
import org.telegram.ui.Components.xq;
public final class w1 extends FrameLayout {
    public TextView[] f39662a;
    public TextView f39663b;
    public FrameLayout f39664c;
    public a2 d;
    public CharSequence f39665e;
    public boolean f39666f;
    public ValueAnimator h;
    public boolean f39667n;

    public final void a(View view, View view2, Runnable runnable) {
        view.setVisibility(0);
        view2.setVisibility(0);
        view2.setTranslationY(org.telegram.messenger.g0.L(15.0f));
        view2.setAlpha(0.0f);
        this.f39666f = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new uc(19, view2, view));
        this.h.addListener(new kg.g0((FrameLayout) this, view, view2, (Object) runnable, 4));
        this.h.setDuration(250L).setInterpolator(xq.f40452f);
        this.h.start();
    }

    public final void b(String str, boolean z10, boolean z11) {
        View view = this.d;
        View[] viewArr = this.f39662a;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            SpannableString spannableString = new SpannableString(".");
            spannableString.setSpan(new lg.p1(viewArr), 0, 1, 33);
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
            this.f39666f = false;
            viewArr[0].setText(str);
            viewArr[0].setVisibility(0);
            viewArr[1].setVisibility(8);
            view.setVisibility(8);
        } else if (this.f39666f) {
            this.f39665e = str;
        } else if (this.f39667n) {
            viewArr[0].setText(str);
            a(view, viewArr[0], null);
        } else if (!viewArr[0].getText().equals(str)) {
            viewArr[1].setText(str);
            a(viewArr[0], viewArr[1], new d4(this, 12));
        }
    }

    public final void c(boolean z10) {
        FrameLayout frameLayout = this.f39664c;
        if (z10) {
            if (frameLayout.getVisibility() != 0) {
                frameLayout.setVisibility(0);
                frameLayout.setAlpha(0.0f);
                frameLayout.setScaleY(0.6f);
                frameLayout.setScaleX(0.6f);
                frameLayout.animate().setListener(null).cancel();
                org.telegram.messenger.camera.q.l(frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), xq.f40456k, 300L);
            }
        } else if (frameLayout.getVisibility() == 8) {
        } else {
            frameLayout.animate().alpha(0.0f).scaleX(0.6f).scaleY(0.6f).setInterpolator(xq.f40452f).setListener(new v1(this, 1)).setDuration(300L).start();
        }
    }

    public final void d(boolean z10, boolean z11) {
        TextView textView = this.f39663b;
        int i3 = 0;
        if (!z11) {
            textView.animate().setListener(null).cancel();
            if (!z10) {
                i3 = 8;
            }
            textView.setVisibility(i3);
        } else if (z10) {
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
            }
            textView.animate().setListener(null).cancel();
            textView.animate().alpha(1.0f).setDuration(150L).start();
        } else {
            textView.animate().alpha(0.0f).setListener(new v1(this, 0)).setDuration(150L).start();
        }
    }

    public final void e(boolean z10) {
        a2 a2Var = this.d;
        View[] viewArr = this.f39662a;
        if (TextUtils.isEmpty(viewArr[0].getText())) {
            z10 = false;
        }
        if (this.f39667n) {
            return;
        }
        a2Var.a();
        if (!z10) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f39667n = true;
            this.f39666f = false;
            viewArr[0].setVisibility(8);
            viewArr[1].setVisibility(8);
            a2Var.setVisibility(0);
        } else if (this.f39666f) {
            this.f39665e = "timer";
        } else {
            this.f39667n = true;
            a(viewArr[0], a2Var, null);
        }
    }

    public void setSignalBarCount(int i3) {
        this.d.setSignalBarCount(i3);
    }
}

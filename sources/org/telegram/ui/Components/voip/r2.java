package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import nh.m6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.rs;
public final class r2 extends FrameLayout {
    public TextView[] f33969a;
    public TextView f33970b;
    public FrameLayout f33971c;
    public v2 d;
    public CharSequence f33972e;
    public boolean f33973f;
    public ValueAnimator h;
    public boolean f33974n;

    public final void a(View view, View view2, Runnable runnable) {
        view.setVisibility(0);
        view2.setVisibility(0);
        view2.setTranslationY(AndroidUtilities.dp(15.0f));
        view2.setAlpha(0.0f);
        this.f33973f = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new bg.b3(16, view2, view));
        this.h.addListener(new rs(this, view, view2, runnable, 2));
        this.h.setDuration(250L).setInterpolator(jr.f29800f);
        this.h.start();
    }

    public final void b(String str, boolean z10, boolean z11) {
        View view = this.d;
        View[] viewArr = this.f33969a;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            SpannableString spannableString = new SpannableString(".");
            spannableString.setSpan(new org.telegram.ui.Components.b0(viewArr), 0, 1, 33);
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
            this.f33973f = false;
            viewArr[0].setText(str);
            viewArr[0].setVisibility(0);
            viewArr[1].setVisibility(8);
            view.setVisibility(8);
        } else if (this.f33973f) {
            this.f33972e = str;
        } else if (this.f33974n) {
            viewArr[0].setText(str);
            a(view, viewArr[0], null);
        } else if (!viewArr[0].getText().equals(str)) {
            viewArr[1].setText(str);
            a(viewArr[0], viewArr[1], new m6(this, 19));
        }
    }

    public final void c(boolean z10) {
        FrameLayout frameLayout = this.f33971c;
        if (z10) {
            if (frameLayout.getVisibility() != 0) {
                frameLayout.setVisibility(0);
                frameLayout.setAlpha(0.0f);
                frameLayout.setScaleY(0.6f);
                frameLayout.setScaleX(0.6f);
                frameLayout.animate().setListener(null).cancel();
                org.telegram.ui.b.q(frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), jr.f29804k, 300L);
            }
        } else if (frameLayout.getVisibility() == 8) {
        } else {
            frameLayout.animate().alpha(0.0f).scaleX(0.6f).scaleY(0.6f).setInterpolator(jr.f29800f).setListener(new q2(this, 1)).setDuration(300L).start();
        }
    }

    public final void d(boolean z10, boolean z11) {
        TextView textView = this.f33970b;
        int i10 = 0;
        if (!z11) {
            textView.animate().setListener(null).cancel();
            if (!z10) {
                i10 = 8;
            }
            textView.setVisibility(i10);
        } else if (z10) {
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
            }
            textView.animate().setListener(null).cancel();
            textView.animate().alpha(1.0f).setDuration(150L).start();
        } else {
            textView.animate().alpha(0.0f).setListener(new q2(this, 0)).setDuration(150L).start();
        }
    }

    public final void e(boolean z10) {
        v2 v2Var = this.d;
        View[] viewArr = this.f33969a;
        if (TextUtils.isEmpty(viewArr[0].getText())) {
            z10 = false;
        }
        if (this.f33974n) {
            return;
        }
        v2Var.a();
        if (!z10) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f33974n = true;
            this.f33973f = false;
            viewArr[0].setVisibility(8);
            viewArr[1].setVisibility(8);
            v2Var.setVisibility(0);
        } else if (this.f33973f) {
            this.f33972e = "timer";
        } else {
            this.f33974n = true;
            a(viewArr[0], v2Var, null);
        }
    }

    public void setSignalBarCount(int i10) {
        this.d.setSignalBarCount(i10);
    }
}

package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import oh.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.xs;
public final class q2 extends FrameLayout {
    public TextView[] f32291a;
    public TextView f32292b;
    public FrameLayout f32293c;
    public u2 d;
    public CharSequence f32294e;
    public boolean f32295f;
    public ValueAnimator h;
    public boolean f32296n;

    public final void a(View view, View view2, Runnable runnable) {
        view.setVisibility(0);
        view2.setVisibility(0);
        view2.setTranslationY(AndroidUtilities.dp(15.0f));
        view2.setAlpha(0.0f);
        this.f32295f = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new bg.a(17, view2, view));
        this.h.addListener(new xs(this, view, view2, runnable, 2));
        this.h.setDuration(250L).setInterpolator(pr.f30183f);
        this.h.start();
    }

    public final void b(String str, boolean z4, boolean z10) {
        View view = this.d;
        View[] viewArr = this.f32291a;
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
            this.f32295f = false;
            viewArr[0].setText(str);
            viewArr[0].setVisibility(0);
            viewArr[1].setVisibility(8);
            view.setVisibility(8);
        } else if (this.f32295f) {
            this.f32294e = str;
        } else if (this.f32296n) {
            viewArr[0].setText(str);
            a(view, viewArr[0], null);
        } else if (!viewArr[0].getText().equals(str)) {
            viewArr[1].setText(str);
            a(viewArr[0], viewArr[1], new t3(this, 23));
        }
    }

    public final void c(boolean z4) {
        FrameLayout frameLayout = this.f32293c;
        if (z4) {
            if (frameLayout.getVisibility() != 0) {
                frameLayout.setVisibility(0);
                frameLayout.setAlpha(0.0f);
                frameLayout.setScaleY(0.6f);
                frameLayout.setScaleX(0.6f);
                frameLayout.animate().setListener(null).cancel();
                org.telegram.ui.b.p(frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), pr.f30187k, 300L);
            }
        } else if (frameLayout.getVisibility() == 8) {
        } else {
            frameLayout.animate().alpha(0.0f).scaleX(0.6f).scaleY(0.6f).setInterpolator(pr.f30183f).setListener(new p2(this, 1)).setDuration(300L).start();
        }
    }

    public final void d(boolean z4, boolean z10) {
        TextView textView = this.f32292b;
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
            textView.animate().alpha(0.0f).setListener(new p2(this, 0)).setDuration(150L).start();
        }
    }

    public final void e(boolean z4) {
        u2 u2Var = this.d;
        View[] viewArr = this.f32291a;
        if (TextUtils.isEmpty(viewArr[0].getText())) {
            z4 = false;
        }
        if (this.f32296n) {
            return;
        }
        u2Var.a();
        if (!z4) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f32296n = true;
            this.f32295f = false;
            viewArr[0].setVisibility(8);
            viewArr[1].setVisibility(8);
            u2Var.setVisibility(0);
        } else if (this.f32295f) {
            this.f32294e = "timer";
        } else {
            this.f32296n = true;
            a(viewArr[0], u2Var, null);
        }
    }

    public void setSignalBarCount(int i10) {
        this.d.setSignalBarCount(i10);
    }
}

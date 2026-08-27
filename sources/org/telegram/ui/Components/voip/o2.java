package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ls;

public final class o2 extends FrameLayout {

    public TextView[] f33783a;

    public TextView f33784b;

    public FrameLayout f33785c;
    public s2 d;

    public CharSequence f33786e;

    public boolean f33787f;
    public ValueAnimator h;

    public boolean f33788n;

    public final void a(View view, View view2, Runnable runnable) {
        view.setVisibility(0);
        view2.setVisibility(0);
        view2.setTranslationY(AndroidUtilities.dp(15.0f));
        view2.setAlpha(0.0f);
        this.f33787f = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ag.t2(15, view2, view));
        this.h.addListener(new ls(this, view, view2, runnable, 2));
        this.h.setDuration(250L).setInterpolator(er.f28122f);
        this.h.start();
    }

    public final void b(String str, boolean z10, boolean z11) {
        View view = this.d;
        TextView[] textViewArr = this.f33783a;
        CharSequence charSequence = str;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            SpannableString spannableString = new SpannableString(".");
            spannableString.setSpan(new org.telegram.ui.Components.z(textViewArr), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            charSequence = spannableStringBuilder;
        }
        if (TextUtils.isEmpty(textViewArr[0].getText())) {
            z11 = false;
        }
        if (!z11) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f33787f = false;
            textViewArr[0].setText(charSequence);
            textViewArr[0].setVisibility(0);
            textViewArr[1].setVisibility(8);
            view.setVisibility(8);
            return;
        }
        if (this.f33787f) {
            this.f33786e = charSequence;
            return;
        }
        if (this.f33788n) {
            textViewArr[0].setText(charSequence);
            a(view, textViewArr[0], null);
        } else {
            if (textViewArr[0].getText().equals(charSequence)) {
                return;
            }
            textViewArr[1].setText(charSequence);
            a(textViewArr[0], textViewArr[1], new nh.f0(this, 16));
        }
    }

    public final void c(boolean z10) {
        FrameLayout frameLayout = this.f33785c;
        if (!z10) {
            if (frameLayout.getVisibility() == 8) {
                return;
            }
            frameLayout.animate().alpha(0.0f).scaleX(0.6f).scaleY(0.6f).setInterpolator(er.f28122f).setListener(new n2(this, 1)).setDuration(300L).start();
        } else {
            if (frameLayout.getVisibility() == 0) {
                return;
            }
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(0.0f);
            frameLayout.setScaleY(0.6f);
            frameLayout.setScaleX(0.6f);
            frameLayout.animate().setListener(null).cancel();
            rl.o(frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), er.f28126k, 300L);
        }
    }

    public final void d(boolean z10, boolean z11) {
        TextView textView = this.f33784b;
        if (!z11) {
            textView.animate().setListener(null).cancel();
            textView.setVisibility(z10 ? 0 : 8);
        } else {
            if (!z10) {
                textView.animate().alpha(0.0f).setListener(new n2(this, 0)).setDuration(150L).start();
                return;
            }
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
            }
            textView.animate().setListener(null).cancel();
            textView.animate().alpha(1.0f).setDuration(150L).start();
        }
    }

    public final void e(boolean z10) {
        s2 s2Var = this.d;
        TextView[] textViewArr = this.f33783a;
        if (TextUtils.isEmpty(textViewArr[0].getText())) {
            z10 = false;
        }
        if (this.f33788n) {
            return;
        }
        s2Var.a();
        if (z10) {
            if (this.f33787f) {
                this.f33786e = "timer";
                return;
            } else {
                this.f33788n = true;
                a(textViewArr[0], s2Var, null);
                return;
            }
        }
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f33788n = true;
        this.f33787f = false;
        textViewArr[0].setVisibility(8);
        textViewArr[1].setVisibility(8);
        s2Var.setVisibility(0);
    }

    public void setSignalBarCount(int i10) {
        this.d.setSignalBarCount(i10);
    }
}

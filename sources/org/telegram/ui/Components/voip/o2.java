package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.em;
import org.telegram.ui.Components.wr;
public final class o2 extends FrameLayout {
    public TextView[] f28307a;
    public TextView f28308b;
    public FrameLayout f28309c;
    public s2 d;
    public CharSequence e;
    public boolean f28310f;
    public ValueAnimator h;
    public boolean f28311n;

    public final void a(View view, View view2, Runnable runnable) {
        view.setVisibility(0);
        view2.setVisibility(0);
        view2.setTranslationY(AndroidUtilities.dp(15.0f));
        view2.setAlpha(0.0f);
        this.f28310f = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new gg.t1(16, view2, view));
        this.h.addListener(new fg.k0((FrameLayout) this, view, view2, (Object) runnable, 4));
        this.h.setDuration(250L).setInterpolator(wr.f28819f);
        this.h.start();
    }

    public final void b(String str, boolean z10, boolean z11) {
        View view = this.d;
        View[] viewArr = this.f28307a;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            SpannableString spannableString = new SpannableString(".");
            spannableString.setSpan(new gg.f2(viewArr), 0, 1, 33);
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
            this.f28310f = false;
            viewArr[0].setText(str);
            viewArr[0].setVisibility(0);
            viewArr[1].setVisibility(8);
            view.setVisibility(8);
        } else if (this.f28310f) {
            this.e = str;
        } else if (this.f28311n) {
            viewArr[0].setText(str);
            a(view, viewArr[0], null);
        } else if (!viewArr[0].getText().equals(str)) {
            viewArr[1].setText(str);
            a(viewArr[0], viewArr[1], new x(this, 5));
        }
    }

    public final void c(boolean z10) {
        FrameLayout frameLayout = this.f28309c;
        if (z10) {
            if (frameLayout.getVisibility() != 0) {
                frameLayout.setVisibility(0);
                frameLayout.setAlpha(0.0f);
                frameLayout.setScaleY(0.6f);
                frameLayout.setScaleX(0.6f);
                frameLayout.animate().setListener(null).cancel();
                em.q(frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), wr.f28823k, 300L);
            }
        } else if (frameLayout.getVisibility() == 8) {
        } else {
            frameLayout.animate().alpha(0.0f).scaleX(0.6f).scaleY(0.6f).setInterpolator(wr.f28819f).setListener(new n2(this, 1)).setDuration(300L).start();
        }
    }

    public final void d(boolean z10, boolean z11) {
        TextView textView = this.f28308b;
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
            textView.animate().alpha(0.0f).setListener(new n2(this, 0)).setDuration(150L).start();
        }
    }

    public final void e(boolean z10) {
        s2 s2Var = this.d;
        View[] viewArr = this.f28307a;
        if (TextUtils.isEmpty(viewArr[0].getText())) {
            z10 = false;
        }
        if (this.f28311n) {
            return;
        }
        s2Var.a();
        if (!z10) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f28311n = true;
            this.f28310f = false;
            viewArr[0].setVisibility(8);
            viewArr[1].setVisibility(8);
            s2Var.setVisibility(0);
        } else if (this.f28310f) {
            this.e = "timer";
        } else {
            this.f28311n = true;
            a(viewArr[0], s2Var, null);
        }
    }

    public void setSignalBarCount(int i10) {
        this.d.setSignalBarCount(i10);
    }
}

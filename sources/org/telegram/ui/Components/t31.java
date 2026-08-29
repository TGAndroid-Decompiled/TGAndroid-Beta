package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class t31 extends v41 {
    static {
        v41.setup(new v41());
    }

    public static w41 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, x80 x80Var, View.OnClickListener onClickListener2) {
        w41 J = w41.J(t31.class);
        J.d = i10;
        J.f34300l = charSequence;
        J.f34295f = z10;
        J.f34308t = false;
        J.D = onClickListener;
        J.G = x80Var;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        x80 x80Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        u31 u31Var = (u31) view;
        CharSequence charSequence = w41Var.f34300l;
        boolean z12 = w41Var.f34295f;
        View.OnClickListener onClickListener = w41Var.D;
        Object obj = w41Var.G;
        if (obj != null) {
            x80Var = (x80) obj;
        } else {
            x80Var = null;
        }
        boolean z13 = w41Var.f34308t;
        View.OnClickListener onClickListener2 = w41Var.E;
        ImageView imageView = u31Var.f33119n;
        TextView textView = u31Var.d;
        r31 r31Var = u31Var.f33116c;
        s31 s31Var = u31Var.f33118f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = y5.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        d90[] d90VarArr = (d90[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), d90.class);
        if (d90VarArr != null) {
            int i14 = 0;
            while (i14 < d90VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(d90VarArr[i14]);
                int spanEnd = spannableStringBuilder.getSpanEnd(d90VarArr[i14]);
                boolean z14 = z13;
                spannableStringBuilder.removeSpan(d90VarArr[i14]);
                int i15 = i14;
                d90 d90Var = d90VarArr[i15];
                d90 d90Var2 = new d90(s31Var, d90Var.f27717a, d90Var.d, null);
                d90 d90Var3 = d90VarArr[i15];
                d90Var2.f27721f = d90Var3.f27721f;
                d90Var2.h = d90Var3.h;
                d90Var2.f27722n = d90Var3.f27722n;
                spannableStringBuilder.setSpan(d90Var2, spanStart, spanEnd, 33);
                i14 = i15 + 1;
                z13 = z14;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z15 = z13;
        if (u31Var.h && !z12) {
            r31Var.setVisibility(0);
            s31Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = r31Var.animate().alpha(0.0f).withEndAction(new fq0(u31Var, 23));
            TimeInterpolator timeInterpolator = jr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            s31Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            r31Var.setVisibility(i10);
            if (!z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            s31Var.setVisibility(i11);
        }
        u31Var.h = z12;
        if (z12) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        textView.setOnClickListener(onClickListener);
        u31Var.setClipChildren(z12);
        r31Var.setText(spannableStringBuilder);
        s31Var.setText(spannableStringBuilder);
        if (!z15 && (d90VarArr == null || d90VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        s31Var.setTextIsSelectable(z11);
        s31Var.setOnLinkPressListener(x80Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        u31Var.f33115b = z10;
        u31Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean contentsEquals(w41 w41Var, w41 w41Var2) {
        if (TextUtils.equals(w41Var.f34300l, w41Var2.f34300l) && w41Var.f34295f == w41Var2.f34295f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new u31(context, c6Var);
    }

    @Override
    public final boolean equals(w41 w41Var, w41 w41Var2) {
        if (w41Var.d == w41Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}

package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class s41 extends v51 {
    static {
        v51.setup(new v51());
    }

    public static w51 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, n90 n90Var, View.OnClickListener onClickListener2) {
        w51 J = w51.J(s41.class);
        J.d = i10;
        J.f29895l = charSequence;
        J.f29890f = z10;
        J.f29903t = false;
        J.D = onClickListener;
        J.G = n90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        n90 n90Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        t41 t41Var = (t41) view;
        CharSequence charSequence = w51Var.f29895l;
        boolean z12 = w51Var.f29890f;
        View.OnClickListener onClickListener = w51Var.D;
        Object obj = w51Var.G;
        if (obj != null) {
            n90Var = (n90) obj;
        } else {
            n90Var = null;
        }
        boolean z13 = w51Var.f29903t;
        View.OnClickListener onClickListener2 = w51Var.E;
        ImageView imageView = t41Var.f28460n;
        TextView textView = t41Var.d;
        q41 q41Var = t41Var.f28458c;
        r41 r41Var = t41Var.f28459f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = z5.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        t90[] t90VarArr = (t90[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), t90.class);
        if (t90VarArr != null) {
            int i14 = 0;
            while (i14 < t90VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(t90VarArr[i14]);
                int spanEnd = spannableStringBuilder.getSpanEnd(t90VarArr[i14]);
                boolean z14 = z13;
                spannableStringBuilder.removeSpan(t90VarArr[i14]);
                int i15 = i14;
                t90 t90Var = t90VarArr[i15];
                t90 t90Var2 = new t90(r41Var, t90Var.f28511a, t90Var.d, null);
                t90 t90Var3 = t90VarArr[i15];
                t90Var2.f28514f = t90Var3.f28514f;
                t90Var2.h = t90Var3.h;
                t90Var2.f28515n = t90Var3.f28515n;
                spannableStringBuilder.setSpan(t90Var2, spanStart, spanEnd, 33);
                i14 = i15 + 1;
                z13 = z14;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z15 = z13;
        if (t41Var.h && !z12) {
            q41Var.setVisibility(0);
            r41Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = q41Var.animate().alpha(0.0f).withEndAction(new xq0(t41Var, 24));
            TimeInterpolator timeInterpolator = sr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            r41Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            q41Var.setVisibility(i10);
            if (!z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            r41Var.setVisibility(i11);
        }
        t41Var.h = z12;
        if (z12) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        textView.setOnClickListener(onClickListener);
        t41Var.setClipChildren(z12);
        q41Var.setText(spannableStringBuilder);
        r41Var.setText(spannableStringBuilder);
        if (!z15 && (t90VarArr == null || t90VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        r41Var.setTextIsSelectable(z11);
        r41Var.setOnLinkPressListener(n90Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        t41Var.f28457b = z10;
        t41Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean contentsEquals(w51 w51Var, w51 w51Var2) {
        if (TextUtils.equals(w51Var.f29895l, w51Var2.f29895l) && w51Var.f29890f == w51Var2.f29890f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, xl0 xl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new t41(context, d6Var);
    }

    @Override
    public final boolean equals(w51 w51Var, w51 w51Var2) {
        if (w51Var.d == w51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}

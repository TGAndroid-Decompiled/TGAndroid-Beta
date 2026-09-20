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

    public static w51 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, j90 j90Var, View.OnClickListener onClickListener2) {
        w51 J = w51.J(s41.class);
        J.d = i10;
        J.f29948l = charSequence;
        J.f29943f = z10;
        J.f29956t = false;
        J.D = onClickListener;
        J.G = j90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        j90 j90Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        t41 t41Var = (t41) view;
        CharSequence charSequence = w51Var.f29948l;
        boolean z12 = w51Var.f29943f;
        View.OnClickListener onClickListener = w51Var.D;
        Object obj = w51Var.G;
        if (obj != null) {
            j90Var = (j90) obj;
        } else {
            j90Var = null;
        }
        boolean z13 = w51Var.f29956t;
        View.OnClickListener onClickListener2 = w51Var.E;
        ImageView imageView = t41Var.f28287n;
        TextView textView = t41Var.d;
        q41 q41Var = t41Var.f28285c;
        r41 r41Var = t41Var.f28286f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = y5.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        p90[] p90VarArr = (p90[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), p90.class);
        if (p90VarArr != null) {
            int i14 = 0;
            while (i14 < p90VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(p90VarArr[i14]);
                int spanEnd = spannableStringBuilder.getSpanEnd(p90VarArr[i14]);
                boolean z14 = z13;
                spannableStringBuilder.removeSpan(p90VarArr[i14]);
                int i15 = i14;
                p90 p90Var = p90VarArr[i15];
                p90 p90Var2 = new p90(r41Var, p90Var.f27192a, p90Var.d, null);
                p90 p90Var3 = p90VarArr[i15];
                p90Var2.f27195f = p90Var3.f27195f;
                p90Var2.h = p90Var3.h;
                p90Var2.f27196n = p90Var3.f27196n;
                spannableStringBuilder.setSpan(p90Var2, spanStart, spanEnd, 33);
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
            ViewPropertyAnimator withEndAction = q41Var.animate().alpha(0.0f).withEndAction(new wq0(t41Var, 23));
            TimeInterpolator timeInterpolator = qr.h;
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
        if (!z15 && (p90VarArr == null || p90VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        r41Var.setTextIsSelectable(z11);
        r41Var.setOnLinkPressListener(j90Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        t41Var.f28284b = z10;
        t41Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean contentsEquals(w51 w51Var, w51 w51Var2) {
        if (TextUtils.equals(w51Var.f29948l, w51Var2.f29948l) && w51Var.f29943f == w51Var2.f29943f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new t41(context, f6Var);
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

package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class u41 extends x51 {
    static {
        x51.setup(new x51());
    }

    public static y51 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, p90 p90Var, View.OnClickListener onClickListener2) {
        y51 J = y51.J(u41.class);
        J.d = i10;
        J.f30637l = charSequence;
        J.f30632f = z10;
        J.f30645t = false;
        J.D = onClickListener;
        J.G = p90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        p90 p90Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        v41 v41Var = (v41) view;
        CharSequence charSequence = y51Var.f30637l;
        boolean z12 = y51Var.f30632f;
        View.OnClickListener onClickListener = y51Var.D;
        Object obj = y51Var.G;
        if (obj != null) {
            p90Var = (p90) obj;
        } else {
            p90Var = null;
        }
        boolean z13 = y51Var.f30645t;
        View.OnClickListener onClickListener2 = y51Var.E;
        ImageView imageView = v41Var.f29034n;
        TextView textView = v41Var.d;
        s41 s41Var = v41Var.f29032c;
        t41 t41Var = v41Var.f29033f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = z5.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        v90[] v90VarArr = (v90[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), v90.class);
        if (v90VarArr != null) {
            int i14 = 0;
            while (i14 < v90VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(v90VarArr[i14]);
                int spanEnd = spannableStringBuilder.getSpanEnd(v90VarArr[i14]);
                boolean z14 = z13;
                spannableStringBuilder.removeSpan(v90VarArr[i14]);
                int i15 = i14;
                v90 v90Var = v90VarArr[i15];
                v90 v90Var2 = new v90(t41Var, v90Var.f29094a, v90Var.d, null);
                v90 v90Var3 = v90VarArr[i15];
                v90Var2.f29097f = v90Var3.f29097f;
                v90Var2.h = v90Var3.h;
                v90Var2.f29098n = v90Var3.f29098n;
                spannableStringBuilder.setSpan(v90Var2, spanStart, spanEnd, 33);
                i14 = i15 + 1;
                z13 = z14;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z15 = z13;
        if (v41Var.h && !z12) {
            s41Var.setVisibility(0);
            t41Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = s41Var.animate().alpha(0.0f).withEndAction(new zq0(v41Var, 24));
            TimeInterpolator timeInterpolator = tr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            t41Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            s41Var.setVisibility(i10);
            if (!z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            t41Var.setVisibility(i11);
        }
        v41Var.h = z12;
        if (z12) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        textView.setOnClickListener(onClickListener);
        v41Var.setClipChildren(z12);
        s41Var.setText(spannableStringBuilder);
        t41Var.setText(spannableStringBuilder);
        if (!z15 && (v90VarArr == null || v90VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        t41Var.setTextIsSelectable(z11);
        t41Var.setOnLinkPressListener(p90Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        v41Var.f29031b = z10;
        v41Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean contentsEquals(y51 y51Var, y51 y51Var2) {
        if (TextUtils.equals(y51Var.f30637l, y51Var2.f30637l) && y51Var.f30632f == y51Var2.f30632f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new v41(context, d6Var);
    }

    @Override
    public final boolean equals(y51 y51Var, y51 y51Var2) {
        if (y51Var.d == y51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}

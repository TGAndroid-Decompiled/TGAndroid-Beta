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

    public static y51 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, m90 m90Var, View.OnClickListener onClickListener2) {
        y51 J = y51.J(u41.class);
        J.d = i10;
        J.f30518l = charSequence;
        J.f30513f = z10;
        J.f30526t = false;
        J.D = onClickListener;
        J.G = m90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        m90 m90Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        v41 v41Var = (v41) view;
        CharSequence charSequence = y51Var.f30518l;
        boolean z12 = y51Var.f30513f;
        View.OnClickListener onClickListener = y51Var.D;
        Object obj = y51Var.G;
        if (obj != null) {
            m90Var = (m90) obj;
        } else {
            m90Var = null;
        }
        boolean z13 = y51Var.f30526t;
        View.OnClickListener onClickListener2 = y51Var.E;
        ImageView imageView = v41Var.f28982n;
        TextView textView = v41Var.d;
        s41 s41Var = v41Var.f28980c;
        t41 t41Var = v41Var.f28981f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = y5.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        s90[] s90VarArr = (s90[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), s90.class);
        if (s90VarArr != null) {
            int i14 = 0;
            while (i14 < s90VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(s90VarArr[i14]);
                int spanEnd = spannableStringBuilder.getSpanEnd(s90VarArr[i14]);
                boolean z14 = z13;
                spannableStringBuilder.removeSpan(s90VarArr[i14]);
                int i15 = i14;
                s90 s90Var = s90VarArr[i15];
                s90 s90Var2 = new s90(t41Var, s90Var.f28144a, s90Var.d, null);
                s90 s90Var3 = s90VarArr[i15];
                s90Var2.f28147f = s90Var3.f28147f;
                s90Var2.h = s90Var3.h;
                s90Var2.f28148n = s90Var3.f28148n;
                spannableStringBuilder.setSpan(s90Var2, spanStart, spanEnd, 33);
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
            ViewPropertyAnimator withEndAction = s41Var.animate().alpha(0.0f).withEndAction(new yq0(v41Var, 24));
            TimeInterpolator timeInterpolator = qr.h;
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
        if (!z15 && (s90VarArr == null || s90VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        t41Var.setTextIsSelectable(z11);
        t41Var.setOnLinkPressListener(m90Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        v41Var.f28979b = z10;
        v41Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean contentsEquals(y51 y51Var, y51 y51Var2) {
        if (TextUtils.equals(y51Var.f30518l, y51Var2.f30518l) && y51Var.f30513f == y51Var2.f30513f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new v41(context, f6Var);
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

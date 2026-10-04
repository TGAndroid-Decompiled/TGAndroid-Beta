package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class c51 extends f61 {
    static {
        f61.setup(new f61());
    }

    public static g61 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, p90 p90Var, View.OnClickListener onClickListener2) {
        g61 J = g61.J(c51.class);
        J.d = i10;
        J.f26674l = charSequence;
        J.f26669f = z10;
        J.f26682t = false;
        J.D = onClickListener;
        J.G = p90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        p90 p90Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        d51 d51Var = (d51) view;
        CharSequence charSequence = g61Var.f26674l;
        boolean z12 = g61Var.f26669f;
        View.OnClickListener onClickListener = g61Var.D;
        Object obj = g61Var.G;
        if (obj != null) {
            p90Var = (p90) obj;
        } else {
            p90Var = null;
        }
        boolean z13 = g61Var.f26682t;
        View.OnClickListener onClickListener2 = g61Var.E;
        ImageView imageView = d51Var.f25569n;
        TextView textView = d51Var.d;
        a51 a51Var = d51Var.f25566c;
        b51 b51Var = d51Var.f25568f;
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
                v90 v90Var2 = new v90(b51Var, v90Var.f31615a, v90Var.d, null);
                v90 v90Var3 = v90VarArr[i15];
                v90Var2.f31619f = v90Var3.f31619f;
                v90Var2.h = v90Var3.h;
                v90Var2.f31620n = v90Var3.f31620n;
                spannableStringBuilder.setSpan(v90Var2, spanStart, spanEnd, 33);
                i14 = i15 + 1;
                z13 = z14;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z15 = z13;
        if (d51Var.h && !z12) {
            a51Var.setVisibility(0);
            b51Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = a51Var.animate().alpha(0.0f).withEndAction(new br0(d51Var, 25));
            TimeInterpolator timeInterpolator = tr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            b51Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            a51Var.setVisibility(i10);
            if (!z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            b51Var.setVisibility(i11);
        }
        d51Var.h = z12;
        if (z12) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        textView.setOnClickListener(onClickListener);
        d51Var.setClipChildren(z12);
        a51Var.setText(spannableStringBuilder);
        b51Var.setText(spannableStringBuilder);
        if (!z15 && (v90VarArr == null || v90VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        b51Var.setTextIsSelectable(z11);
        b51Var.setOnLinkPressListener(p90Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        d51Var.f25565b = z10;
        d51Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean contentsEquals(g61 g61Var, g61 g61Var2) {
        if (TextUtils.equals(g61Var.f26674l, g61Var2.f26674l) && g61Var.f26669f == g61Var2.f26669f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new d51(context, d6Var);
    }

    @Override
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        if (g61Var.d == g61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}

package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class i51 extends l61 {
    static {
        l61.setup(new l61());
    }

    public static m61 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, x90 x90Var, View.OnClickListener onClickListener2) {
        m61 J = m61.J(i51.class);
        J.d = i10;
        J.f28559l = charSequence;
        J.f28554f = z10;
        J.f28567t = false;
        J.D = onClickListener;
        J.G = x90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        x90 x90Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        j51 j51Var = (j51) view;
        CharSequence charSequence = m61Var.f28559l;
        boolean z12 = m61Var.f28554f;
        View.OnClickListener onClickListener = m61Var.D;
        Object obj = m61Var.G;
        if (obj != null) {
            x90Var = (x90) obj;
        } else {
            x90Var = null;
        }
        boolean z13 = m61Var.f28567t;
        View.OnClickListener onClickListener2 = m61Var.E;
        ImageView imageView = j51Var.f27523n;
        TextView textView = j51Var.d;
        g51 g51Var = j51Var.f27521c;
        h51 h51Var = j51Var.f27522f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = a6.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        da0[] da0VarArr = (da0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), da0.class);
        if (da0VarArr != null) {
            int i14 = 0;
            while (i14 < da0VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(da0VarArr[i14]);
                int spanEnd = spannableStringBuilder.getSpanEnd(da0VarArr[i14]);
                boolean z14 = z13;
                spannableStringBuilder.removeSpan(da0VarArr[i14]);
                int i15 = i14;
                da0 da0Var = da0VarArr[i15];
                da0 da0Var2 = new da0(h51Var, da0Var.f25544a, da0Var.d, null);
                da0 da0Var3 = da0VarArr[i15];
                da0Var2.f25547f = da0Var3.f25547f;
                da0Var2.h = da0Var3.h;
                da0Var2.f25548n = da0Var3.f25548n;
                spannableStringBuilder.setSpan(da0Var2, spanStart, spanEnd, 33);
                i14 = i15 + 1;
                z13 = z14;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z15 = z13;
        if (j51Var.h && !z12) {
            g51Var.setVisibility(0);
            h51Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = g51Var.animate().alpha(0.0f).withEndAction(new kr0(j51Var, 24));
            TimeInterpolator timeInterpolator = bs.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            h51Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            g51Var.setVisibility(i10);
            if (!z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            h51Var.setVisibility(i11);
        }
        j51Var.h = z12;
        if (z12) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        textView.setOnClickListener(onClickListener);
        j51Var.setClipChildren(z12);
        g51Var.setText(spannableStringBuilder);
        h51Var.setText(spannableStringBuilder);
        if (!z15 && (da0VarArr == null || da0VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        h51Var.setTextIsSelectable(z11);
        h51Var.setOnLinkPressListener(x90Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        j51Var.f27520b = z10;
        j51Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean contentsEquals(m61 m61Var, m61 m61Var2) {
        if (TextUtils.equals(m61Var.f28559l, m61Var2.f28559l) && m61Var.f28554f == m61Var2.f28554f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new j51(context, g6Var);
    }

    @Override
    public final boolean equals(m61 m61Var, m61 m61Var2) {
        if (m61Var.d == m61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}

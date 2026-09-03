package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class e41 extends g51 {
    static {
        g51.setup(new g51());
    }

    public static h51 a(int i10, CharSequence charSequence, boolean z4, View.OnClickListener onClickListener, f90 f90Var, View.OnClickListener onClickListener2) {
        h51 J = h51.J(e41.class);
        J.d = i10;
        J.f27375l = charSequence;
        J.f27370f = z4;
        J.f27383t = false;
        J.D = onClickListener;
        J.G = f90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        f90 f90Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        f41 f41Var = (f41) view;
        CharSequence charSequence = h51Var.f27375l;
        boolean z11 = h51Var.f27370f;
        View.OnClickListener onClickListener = h51Var.D;
        Object obj = h51Var.G;
        if (obj != null) {
            f90Var = (f90) obj;
        } else {
            f90Var = null;
        }
        boolean z12 = h51Var.f27383t;
        View.OnClickListener onClickListener2 = h51Var.E;
        ImageView imageView = f41Var.f26776n;
        TextView textView = f41Var.d;
        c41 c41Var = f41Var.f26773c;
        d41 d41Var = f41Var.f26775f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = u5.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        l90[] l90VarArr = (l90[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), l90.class);
        if (l90VarArr != null) {
            int i14 = 0;
            while (i14 < l90VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(l90VarArr[i14]);
                int spanEnd = spannableStringBuilder.getSpanEnd(l90VarArr[i14]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(l90VarArr[i14]);
                int i15 = i14;
                l90 l90Var = l90VarArr[i15];
                l90 l90Var2 = new l90(d41Var, l90Var.f28697a, l90Var.d, null);
                l90 l90Var3 = l90VarArr[i15];
                l90Var2.f28701f = l90Var3.f28701f;
                l90Var2.h = l90Var3.h;
                l90Var2.f28702n = l90Var3.f28702n;
                spannableStringBuilder.setSpan(l90Var2, spanStart, spanEnd, 33);
                i14 = i15 + 1;
                z12 = z13;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z14 = z12;
        if (f41Var.h && !z11) {
            c41Var.setVisibility(0);
            d41Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = c41Var.animate().alpha(0.0f).withEndAction(new nq0(f41Var, 23));
            TimeInterpolator timeInterpolator = pr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            d41Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z11) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            c41Var.setVisibility(i10);
            if (!z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            d41Var.setVisibility(i11);
        }
        f41Var.h = z11;
        if (z11) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        textView.setOnClickListener(onClickListener);
        f41Var.setClipChildren(z11);
        c41Var.setText(spannableStringBuilder);
        d41Var.setText(spannableStringBuilder);
        if (!z14 && (l90VarArr == null || l90VarArr.length == 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        d41Var.setTextIsSelectable(z10);
        d41Var.setOnLinkPressListener(f90Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        f41Var.f26772b = z4;
        f41Var.setWillNotDraw(true ^ z4);
    }

    @Override
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        if (TextUtils.equals(h51Var.f27375l, h51Var2.f27375l) && h51Var.f27370f == h51Var2.f27370f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new f41(context, g6Var);
    }

    @Override
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        if (h51Var.d == h51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}

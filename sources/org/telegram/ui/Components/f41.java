package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class f41 extends i51 {
    static {
        i51.setup(new i51());
    }

    public static j51 a(int i10, CharSequence charSequence, boolean z4, View.OnClickListener onClickListener, f90 f90Var, View.OnClickListener onClickListener2) {
        j51 J = j51.J(f41.class);
        J.d = i10;
        J.f28014l = charSequence;
        J.f28009f = z4;
        J.f28022t = false;
        J.D = onClickListener;
        J.G = f90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        f90 f90Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        g41 g41Var = (g41) view;
        CharSequence charSequence = j51Var.f28014l;
        boolean z11 = j51Var.f28009f;
        View.OnClickListener onClickListener = j51Var.D;
        Object obj = j51Var.G;
        if (obj != null) {
            f90Var = (f90) obj;
        } else {
            f90Var = null;
        }
        boolean z12 = j51Var.f28022t;
        View.OnClickListener onClickListener2 = j51Var.E;
        ImageView imageView = g41Var.f27106n;
        TextView textView = g41Var.d;
        d41 d41Var = g41Var.f27103c;
        e41 e41Var = g41Var.f27105f;
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
                l90 l90Var2 = new l90(e41Var, l90Var.f28674a, l90Var.d, null);
                l90 l90Var3 = l90VarArr[i15];
                l90Var2.f28678f = l90Var3.f28678f;
                l90Var2.h = l90Var3.h;
                l90Var2.f28679n = l90Var3.f28679n;
                spannableStringBuilder.setSpan(l90Var2, spanStart, spanEnd, 33);
                i14 = i15 + 1;
                z12 = z13;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z14 = z12;
        if (g41Var.h && !z11) {
            d41Var.setVisibility(0);
            e41Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = d41Var.animate().alpha(0.0f).withEndAction(new oq0(g41Var, 23));
            TimeInterpolator timeInterpolator = pr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            e41Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z11) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            d41Var.setVisibility(i10);
            if (!z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            e41Var.setVisibility(i11);
        }
        g41Var.h = z11;
        if (z11) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        textView.setOnClickListener(onClickListener);
        g41Var.setClipChildren(z11);
        d41Var.setText(spannableStringBuilder);
        e41Var.setText(spannableStringBuilder);
        if (!z14 && (l90VarArr == null || l90VarArr.length == 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        e41Var.setTextIsSelectable(z10);
        e41Var.setOnLinkPressListener(f90Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        g41Var.f27102b = z4;
        g41Var.setWillNotDraw(true ^ z4);
    }

    @Override
    public final boolean contentsEquals(j51 j51Var, j51 j51Var2) {
        if (TextUtils.equals(j51Var.f28014l, j51Var2.f28014l) && j51Var.f28009f == j51Var2.f28009f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new g41(context, g6Var);
    }

    @Override
    public final boolean equals(j51 j51Var, j51 j51Var2) {
        if (j51Var.d == j51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}

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

    public static j51 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, b90 b90Var, View.OnClickListener onClickListener2) {
        j51 J = j51.J(f41.class);
        J.d = i10;
        J.f25127l = charSequence;
        J.f25122f = z10;
        J.f25135t = false;
        J.D = onClickListener;
        J.G = b90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        b90 b90Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        g41 g41Var = (g41) view;
        CharSequence charSequence = j51Var.f25127l;
        boolean z12 = j51Var.f25122f;
        View.OnClickListener onClickListener = j51Var.D;
        Object obj = j51Var.G;
        if (obj != null) {
            b90Var = (b90) obj;
        } else {
            b90Var = null;
        }
        boolean z13 = j51Var.f25135t;
        View.OnClickListener onClickListener2 = j51Var.E;
        ImageView imageView = g41Var.f24088n;
        TextView textView = g41Var.d;
        d41 d41Var = g41Var.f24086c;
        e41 e41Var = g41Var.f24087f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = x5.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        h90[] h90VarArr = (h90[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), h90.class);
        if (h90VarArr != null) {
            int i14 = 0;
            while (i14 < h90VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(h90VarArr[i14]);
                int spanEnd = spannableStringBuilder.getSpanEnd(h90VarArr[i14]);
                boolean z14 = z13;
                spannableStringBuilder.removeSpan(h90VarArr[i14]);
                int i15 = i14;
                h90 h90Var = h90VarArr[i15];
                h90 h90Var2 = new h90(e41Var, h90Var.f24604a, h90Var.d, null);
                h90 h90Var3 = h90VarArr[i15];
                h90Var2.f24607f = h90Var3.f24607f;
                h90Var2.h = h90Var3.h;
                h90Var2.f24608n = h90Var3.f24608n;
                spannableStringBuilder.setSpan(h90Var2, spanStart, spanEnd, 33);
                i14 = i15 + 1;
                z13 = z14;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z15 = z13;
        if (g41Var.h && !z12) {
            d41Var.setVisibility(0);
            e41Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = d41Var.animate().alpha(0.0f).withEndAction(new kq0(g41Var, 23));
            TimeInterpolator timeInterpolator = qr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            e41Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            d41Var.setVisibility(i10);
            if (!z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            e41Var.setVisibility(i11);
        }
        g41Var.h = z12;
        if (z12) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        textView.setOnClickListener(onClickListener);
        g41Var.setClipChildren(z12);
        d41Var.setText(spannableStringBuilder);
        e41Var.setText(spannableStringBuilder);
        if (!z15 && (h90VarArr == null || h90VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        e41Var.setTextIsSelectable(z11);
        e41Var.setOnLinkPressListener(b90Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        g41Var.f24085b = z10;
        g41Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean contentsEquals(j51 j51Var, j51 j51Var2) {
        if (TextUtils.equals(j51Var.f25127l, j51Var2.f25127l) && j51Var.f25122f == j51Var2.f25122f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new g41(context, f6Var);
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

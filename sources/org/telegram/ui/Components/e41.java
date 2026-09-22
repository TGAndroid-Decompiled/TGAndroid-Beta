package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class e41 extends h51 {
    static {
        h51.setup(new h51());
    }

    public static i51 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, b90 b90Var, View.OnClickListener onClickListener2) {
        i51 J = i51.J(e41.class);
        J.d = i10;
        J.f24900l = charSequence;
        J.f24895f = z10;
        J.f24908t = false;
        J.D = onClickListener;
        J.G = b90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        b90 b90Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        f41 f41Var = (f41) view;
        CharSequence charSequence = i51Var.f24900l;
        boolean z12 = i51Var.f24895f;
        View.OnClickListener onClickListener = i51Var.D;
        Object obj = i51Var.G;
        if (obj != null) {
            b90Var = (b90) obj;
        } else {
            b90Var = null;
        }
        boolean z13 = i51Var.f24908t;
        View.OnClickListener onClickListener2 = i51Var.E;
        ImageView imageView = f41Var.f23809n;
        TextView textView = f41Var.d;
        c41 c41Var = f41Var.f23807c;
        d41 d41Var = f41Var.f23808f;
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
                h90 h90Var2 = new h90(d41Var, h90Var.f24640a, h90Var.d, null);
                h90 h90Var3 = h90VarArr[i15];
                h90Var2.f24643f = h90Var3.f24643f;
                h90Var2.h = h90Var3.h;
                h90Var2.f24644n = h90Var3.f24644n;
                spannableStringBuilder.setSpan(h90Var2, spanStart, spanEnd, 33);
                i14 = i15 + 1;
                z13 = z14;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z15 = z13;
        if (f41Var.h && !z12) {
            c41Var.setVisibility(0);
            d41Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = c41Var.animate().alpha(0.0f).withEndAction(new jq0(f41Var, 23));
            TimeInterpolator timeInterpolator = qr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            d41Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            c41Var.setVisibility(i10);
            if (!z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            d41Var.setVisibility(i11);
        }
        f41Var.h = z12;
        if (z12) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        textView.setOnClickListener(onClickListener);
        f41Var.setClipChildren(z12);
        c41Var.setText(spannableStringBuilder);
        d41Var.setText(spannableStringBuilder);
        if (!z15 && (h90VarArr == null || h90VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        d41Var.setTextIsSelectable(z11);
        d41Var.setOnLinkPressListener(b90Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        f41Var.f23806b = z10;
        f41Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        if (TextUtils.equals(i51Var.f24900l, i51Var2.f24900l) && i51Var.f24895f == i51Var2.f24895f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new f41(context, e6Var);
    }

    @Override
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        if (i51Var.d == i51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}

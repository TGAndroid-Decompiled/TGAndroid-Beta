package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class d41 extends g51 {
    static {
        g51.setup(new g51());
    }

    public static h51 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, c90 c90Var, View.OnClickListener onClickListener2) {
        h51 J = h51.J(d41.class);
        J.d = i10;
        J.f26594l = charSequence;
        J.f26589f = z10;
        J.f26602t = false;
        J.D = onClickListener;
        J.G = c90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        c90 c90Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        e41 e41Var = (e41) view;
        CharSequence charSequence = h51Var.f26594l;
        boolean z12 = h51Var.f26589f;
        View.OnClickListener onClickListener = h51Var.D;
        Object obj = h51Var.G;
        if (obj != null) {
            c90Var = (c90) obj;
        } else {
            c90Var = null;
        }
        boolean z13 = h51Var.f26602t;
        View.OnClickListener onClickListener2 = h51Var.E;
        ImageView imageView = e41Var.f25554n;
        TextView textView = e41Var.d;
        b41 b41Var = e41Var.f25551c;
        c41 c41Var = e41Var.f25553f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = z5.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        i90[] i90VarArr = (i90[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), i90.class);
        if (i90VarArr != null) {
            int i14 = 0;
            while (i14 < i90VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(i90VarArr[i14]);
                int spanEnd = spannableStringBuilder.getSpanEnd(i90VarArr[i14]);
                boolean z14 = z13;
                spannableStringBuilder.removeSpan(i90VarArr[i14]);
                int i15 = i14;
                i90 i90Var = i90VarArr[i15];
                i90 i90Var2 = new i90(c41Var, i90Var.f27048a, i90Var.d, null);
                i90 i90Var3 = i90VarArr[i15];
                i90Var2.f27052f = i90Var3.f27052f;
                i90Var2.h = i90Var3.h;
                i90Var2.f27053n = i90Var3.f27053n;
                spannableStringBuilder.setSpan(i90Var2, spanStart, spanEnd, 33);
                i14 = i15 + 1;
                z13 = z14;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z15 = z13;
        if (e41Var.h && !z12) {
            b41Var.setVisibility(0);
            c41Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = b41Var.animate().alpha(0.0f).withEndAction(new jq0(e41Var, 23));
            TimeInterpolator timeInterpolator = pr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            c41Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            b41Var.setVisibility(i10);
            if (!z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c41Var.setVisibility(i11);
        }
        e41Var.h = z12;
        if (z12) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        textView.setOnClickListener(onClickListener);
        e41Var.setClipChildren(z12);
        b41Var.setText(spannableStringBuilder);
        c41Var.setText(spannableStringBuilder);
        if (!z15 && (i90VarArr == null || i90VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        c41Var.setTextIsSelectable(z11);
        c41Var.setOnLinkPressListener(c90Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        e41Var.f25550b = z10;
        e41Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        if (TextUtils.equals(h51Var.f26594l, h51Var2.f26594l) && h51Var.f26589f == h51Var2.f26589f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new e41(context, f6Var);
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

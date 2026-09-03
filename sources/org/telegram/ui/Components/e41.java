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

    public static i51 a(int i10, CharSequence charSequence, boolean z4, View.OnClickListener onClickListener, e90 e90Var, View.OnClickListener onClickListener2) {
        i51 J = i51.J(e41.class);
        J.d = i10;
        J.f25585l = charSequence;
        J.f25580f = z4;
        J.f25593t = false;
        J.D = onClickListener;
        J.G = e90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        e90 e90Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        f41 f41Var = (f41) view;
        CharSequence charSequence = i51Var.f25585l;
        boolean z11 = i51Var.f25580f;
        View.OnClickListener onClickListener = i51Var.D;
        Object obj = i51Var.G;
        if (obj != null) {
            e90Var = (e90) obj;
        } else {
            e90Var = null;
        }
        boolean z12 = i51Var.f25593t;
        View.OnClickListener onClickListener2 = i51Var.E;
        ImageView imageView = f41Var.f24796n;
        TextView textView = f41Var.d;
        c41 c41Var = f41Var.f24794c;
        d41 d41Var = f41Var.f24795f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = u5.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        k90[] k90VarArr = (k90[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), k90.class);
        if (k90VarArr != null) {
            int i14 = 0;
            while (i14 < k90VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(k90VarArr[i14]);
                int spanEnd = spannableStringBuilder.getSpanEnd(k90VarArr[i14]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(k90VarArr[i14]);
                int i15 = i14;
                k90 k90Var = k90VarArr[i15];
                k90 k90Var2 = new k90(d41Var, k90Var.f26235a, k90Var.d, null);
                k90 k90Var3 = k90VarArr[i15];
                k90Var2.f26238f = k90Var3.f26238f;
                k90Var2.h = k90Var3.h;
                k90Var2.f26239n = k90Var3.f26239n;
                spannableStringBuilder.setSpan(k90Var2, spanStart, spanEnd, 33);
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
            TimeInterpolator timeInterpolator = mr.h;
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
        if (!z14 && (k90VarArr == null || k90VarArr.length == 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        d41Var.setTextIsSelectable(z10);
        d41Var.setOnLinkPressListener(e90Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        f41Var.f24793b = z4;
        f41Var.setWillNotDraw(true ^ z4);
    }

    @Override
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        if (TextUtils.equals(i51Var.f25585l, i51Var2.f25585l) && i51Var.f25580f == i51Var2.f25580f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new f41(context, f6Var);
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

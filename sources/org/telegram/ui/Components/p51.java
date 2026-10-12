package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class p51 extends t61 {
    static {
        t61.setup(new t61());
    }

    public static u61 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, ha0 ha0Var, View.OnClickListener onClickListener2) {
        u61 J = u61.J(p51.class);
        J.d = i10;
        J.f31076l = charSequence;
        J.f31071f = z10;
        J.f31084t = false;
        J.D = onClickListener;
        J.G = ha0Var;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        ha0 ha0Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        q51 q51Var = (q51) view;
        CharSequence charSequence = u61Var.f31076l;
        boolean z12 = u61Var.f31071f;
        View.OnClickListener onClickListener = u61Var.D;
        Object obj = u61Var.G;
        if (obj != null) {
            ha0Var = (ha0) obj;
        } else {
            ha0Var = null;
        }
        boolean z13 = u61Var.f31084t;
        View.OnClickListener onClickListener2 = u61Var.E;
        ImageView imageView = q51Var.f29706n;
        TextView textView = q51Var.d;
        n51 n51Var = q51Var.f29703c;
        o51 o51Var = q51Var.f29705f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = b6.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        na0[] na0VarArr = (na0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), na0.class);
        if (na0VarArr != null) {
            int i14 = 0;
            while (i14 < na0VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(na0VarArr[i14]);
                int spanEnd = spannableStringBuilder.getSpanEnd(na0VarArr[i14]);
                boolean z14 = z13;
                spannableStringBuilder.removeSpan(na0VarArr[i14]);
                int i15 = i14;
                na0 na0Var = na0VarArr[i15];
                na0 na0Var2 = new na0(o51Var, na0Var.f28765a, na0Var.d, null);
                na0 na0Var3 = na0VarArr[i15];
                na0Var2.f28769f = na0Var3.f28769f;
                na0Var2.h = na0Var3.h;
                na0Var2.f28770n = na0Var3.f28770n;
                spannableStringBuilder.setSpan(na0Var2, spanStart, spanEnd, 33);
                i14 = i15 + 1;
                z13 = z14;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z15 = z13;
        if (q51Var.h && !z12) {
            n51Var.setVisibility(0);
            o51Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = n51Var.animate().alpha(0.0f).withEndAction(new ur0(q51Var, 24));
            TimeInterpolator timeInterpolator = js.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            o51Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            n51Var.setVisibility(i10);
            if (!z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            o51Var.setVisibility(i11);
        }
        q51Var.h = z12;
        if (z12) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        textView.setOnClickListener(onClickListener);
        q51Var.setClipChildren(z12);
        n51Var.setText(spannableStringBuilder);
        o51Var.setText(spannableStringBuilder);
        if (!z15 && (na0VarArr == null || na0VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        o51Var.setTextIsSelectable(z11);
        o51Var.setOnLinkPressListener(ha0Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        q51Var.f29702b = z10;
        q51Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        if (TextUtils.equals(u61Var.f31076l, u61Var2.f31076l) && u61Var.f31071f == u61Var2.f31071f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new q51(context, c6Var);
    }

    @Override
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        if (u61Var.d == u61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}

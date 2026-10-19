package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class b51 extends f61 {
    static {
        f61.setup(new f61());
    }

    public static g61 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, w90 w90Var, View.OnClickListener onClickListener2) {
        g61 J = g61.J(b51.class);
        J.d = i10;
        J.f26497l = charSequence;
        J.f26492f = z10;
        J.f26505t = false;
        J.D = onClickListener;
        J.G = w90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        w90 w90Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        c51 c51Var = (c51) view;
        CharSequence charSequence = g61Var.f26497l;
        boolean z12 = g61Var.f26492f;
        View.OnClickListener onClickListener = g61Var.D;
        Object obj = g61Var.G;
        if (obj != null) {
            w90Var = (w90) obj;
        } else {
            w90Var = null;
        }
        boolean z13 = g61Var.f26505t;
        View.OnClickListener onClickListener2 = g61Var.E;
        ImageView imageView = c51Var.f25081n;
        TextView textView = c51Var.d;
        z41 z41Var = c51Var.f25079c;
        a51 a51Var = c51Var.f25080f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = a6.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        ca0[] ca0VarArr = (ca0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ca0.class);
        if (ca0VarArr != null) {
            int i14 = 0;
            while (i14 < ca0VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(ca0VarArr[i14]);
                int spanEnd = spannableStringBuilder.getSpanEnd(ca0VarArr[i14]);
                boolean z14 = z13;
                spannableStringBuilder.removeSpan(ca0VarArr[i14]);
                int i15 = i14;
                ca0 ca0Var = ca0VarArr[i15];
                ca0 ca0Var2 = new ca0(a51Var, ca0Var.f25155a, ca0Var.d, null);
                ca0 ca0Var3 = ca0VarArr[i15];
                ca0Var2.f25158f = ca0Var3.f25158f;
                ca0Var2.h = ca0Var3.h;
                ca0Var2.f25159n = ca0Var3.f25159n;
                spannableStringBuilder.setSpan(ca0Var2, spanStart, spanEnd, 33);
                i14 = i15 + 1;
                z13 = z14;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z15 = z13;
        if (c51Var.h && !z12) {
            z41Var.setVisibility(0);
            a51Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = z41Var.animate().alpha(0.0f).withEndAction(new gr0(c51Var, 23));
            TimeInterpolator timeInterpolator = bs.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            a51Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            z41Var.setVisibility(i10);
            if (!z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            a51Var.setVisibility(i11);
        }
        c51Var.h = z12;
        if (z12) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        textView.setOnClickListener(onClickListener);
        c51Var.setClipChildren(z12);
        z41Var.setText(spannableStringBuilder);
        a51Var.setText(spannableStringBuilder);
        if (!z15 && (ca0VarArr == null || ca0VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        a51Var.setTextIsSelectable(z11);
        a51Var.setOnLinkPressListener(w90Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        c51Var.f25078b = z10;
        c51Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean contentsEquals(g61 g61Var, g61 g61Var2) {
        if (TextUtils.equals(g61Var.f26497l, g61Var2.f26497l) && g61Var.f26492f == g61Var2.f26492f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new c51(context, d6Var);
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

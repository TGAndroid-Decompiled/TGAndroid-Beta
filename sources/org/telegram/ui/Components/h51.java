package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class h51 extends k61 {
    static {
        k61.setup(new k61());
    }

    public static l61 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, v90 v90Var, View.OnClickListener onClickListener2) {
        l61 J = l61.J(h51.class);
        J.d = i10;
        J.f28227l = charSequence;
        J.f28222f = z10;
        J.f28235t = false;
        J.D = onClickListener;
        J.G = v90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        v90 v90Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        i51 i51Var = (i51) view;
        CharSequence charSequence = l61Var.f28227l;
        boolean z12 = l61Var.f28222f;
        View.OnClickListener onClickListener = l61Var.D;
        Object obj = l61Var.G;
        if (obj != null) {
            v90Var = (v90) obj;
        } else {
            v90Var = null;
        }
        boolean z13 = l61Var.f28235t;
        View.OnClickListener onClickListener2 = l61Var.E;
        ImageView imageView = i51Var.f27302n;
        TextView textView = i51Var.d;
        f51 f51Var = i51Var.f27300c;
        g51 g51Var = i51Var.f27301f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = y5.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        ba0[] ba0VarArr = (ba0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ba0.class);
        if (ba0VarArr != null) {
            int i14 = 0;
            while (i14 < ba0VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(ba0VarArr[i14]);
                int spanEnd = spannableStringBuilder.getSpanEnd(ba0VarArr[i14]);
                boolean z14 = z13;
                spannableStringBuilder.removeSpan(ba0VarArr[i14]);
                int i15 = i14;
                ba0 ba0Var = ba0VarArr[i15];
                ba0 ba0Var2 = new ba0(g51Var, ba0Var.f24952a, ba0Var.d, null);
                ba0 ba0Var3 = ba0VarArr[i15];
                ba0Var2.f24955f = ba0Var3.f24955f;
                ba0Var2.h = ba0Var3.h;
                ba0Var2.f24956n = ba0Var3.f24956n;
                spannableStringBuilder.setSpan(ba0Var2, spanStart, spanEnd, 33);
                i14 = i15 + 1;
                z13 = z14;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z15 = z13;
        if (i51Var.h && !z12) {
            f51Var.setVisibility(0);
            g51Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = f51Var.animate().alpha(0.0f).withEndAction(new jr0(i51Var, 24));
            TimeInterpolator timeInterpolator = zr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            g51Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            f51Var.setVisibility(i10);
            if (!z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            g51Var.setVisibility(i11);
        }
        i51Var.h = z12;
        if (z12) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        textView.setOnClickListener(onClickListener);
        i51Var.setClipChildren(z12);
        f51Var.setText(spannableStringBuilder);
        g51Var.setText(spannableStringBuilder);
        if (!z15 && (ba0VarArr == null || ba0VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        g51Var.setTextIsSelectable(z11);
        g51Var.setOnLinkPressListener(v90Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        i51Var.f27299b = z10;
        i51Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean contentsEquals(l61 l61Var, l61 l61Var2) {
        if (TextUtils.equals(l61Var.f28227l, l61Var2.f28227l) && l61Var.f28222f == l61Var2.f28222f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new i51(context, g6Var);
    }

    @Override
    public final boolean equals(l61 l61Var, l61 l61Var2) {
        if (l61Var.d == l61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}

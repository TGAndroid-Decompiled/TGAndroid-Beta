package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class g51 extends k61 {
    static {
        k61.setup(new k61());
    }

    public static l61 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, ca0 ca0Var, View.OnClickListener onClickListener2) {
        l61 J = l61.J(g51.class);
        J.d = i10;
        J.f26954l = charSequence;
        J.f26949f = z10;
        J.f26962t = false;
        J.D = onClickListener;
        J.G = ca0Var;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        ca0 ca0Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        h51 h51Var = (h51) view;
        CharSequence charSequence = l61Var.f26954l;
        boolean z12 = l61Var.f26949f;
        View.OnClickListener onClickListener = l61Var.D;
        Object obj = l61Var.G;
        if (obj != null) {
            ca0Var = (ca0) obj;
        } else {
            ca0Var = null;
        }
        boolean z13 = l61Var.f26962t;
        View.OnClickListener onClickListener2 = l61Var.E;
        ImageView imageView = h51Var.f25510n;
        TextView textView = h51Var.d;
        e51 e51Var = h51Var.f25508c;
        f51 f51Var = h51Var.f25509f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = b6.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        ia0[] ia0VarArr = (ia0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ia0.class);
        if (ia0VarArr != null) {
            int i14 = 0;
            while (i14 < ia0VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(ia0VarArr[i14]);
                int spanEnd = spannableStringBuilder.getSpanEnd(ia0VarArr[i14]);
                boolean z14 = z13;
                spannableStringBuilder.removeSpan(ia0VarArr[i14]);
                int i15 = i14;
                ia0 ia0Var = ia0VarArr[i15];
                ia0 ia0Var2 = new ia0(f51Var, ia0Var.f25921a, ia0Var.d, null);
                ia0 ia0Var3 = ia0VarArr[i15];
                ia0Var2.f25924f = ia0Var3.f25924f;
                ia0Var2.h = ia0Var3.h;
                ia0Var2.f25925n = ia0Var3.f25925n;
                spannableStringBuilder.setSpan(ia0Var2, spanStart, spanEnd, 33);
                i14 = i15 + 1;
                z13 = z14;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z15 = z13;
        if (h51Var.h && !z12) {
            e51Var.setVisibility(0);
            f51Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = e51Var.animate().alpha(0.0f).withEndAction(new lr0(h51Var, 24));
            TimeInterpolator timeInterpolator = es.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            f51Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            e51Var.setVisibility(i10);
            if (!z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            f51Var.setVisibility(i11);
        }
        h51Var.h = z12;
        if (z12) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        textView.setOnClickListener(onClickListener);
        h51Var.setClipChildren(z12);
        e51Var.setText(spannableStringBuilder);
        f51Var.setText(spannableStringBuilder);
        if (!z15 && (ia0VarArr == null || ia0VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        f51Var.setTextIsSelectable(z11);
        f51Var.setOnLinkPressListener(ca0Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        h51Var.f25507b = z10;
        h51Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean contentsEquals(l61 l61Var, l61 l61Var2) {
        if (TextUtils.equals(l61Var.f26954l, l61Var2.f26954l) && l61Var.f26949f == l61Var2.f26949f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new h51(context, c6Var);
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

package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class a51 extends e61 {
    static {
        e61.setup(new e61());
    }

    public static f61 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, w90 w90Var, View.OnClickListener onClickListener2) {
        f61 J = f61.J(a51.class);
        J.d = i10;
        J.f26140l = charSequence;
        J.f26135f = z10;
        J.f26148t = false;
        J.D = onClickListener;
        J.G = w90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        w90 w90Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        b51 b51Var = (b51) view;
        CharSequence charSequence = f61Var.f26140l;
        boolean z12 = f61Var.f26135f;
        View.OnClickListener onClickListener = f61Var.D;
        Object obj = f61Var.G;
        if (obj != null) {
            w90Var = (w90) obj;
        } else {
            w90Var = null;
        }
        boolean z13 = f61Var.f26148t;
        View.OnClickListener onClickListener2 = f61Var.E;
        ImageView imageView = b51Var.f24802n;
        TextView textView = b51Var.d;
        y41 y41Var = b51Var.f24800c;
        z41 z41Var = b51Var.f24801f;
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
                ca0 ca0Var2 = new ca0(z41Var, ca0Var.f25179a, ca0Var.d, null);
                ca0 ca0Var3 = ca0VarArr[i15];
                ca0Var2.f25182f = ca0Var3.f25182f;
                ca0Var2.h = ca0Var3.h;
                ca0Var2.f25183n = ca0Var3.f25183n;
                spannableStringBuilder.setSpan(ca0Var2, spanStart, spanEnd, 33);
                i14 = i15 + 1;
                z13 = z14;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z15 = z13;
        if (b51Var.h && !z12) {
            y41Var.setVisibility(0);
            z41Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = y41Var.animate().alpha(0.0f).withEndAction(new fr0(b51Var, 23));
            TimeInterpolator timeInterpolator = bs.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            z41Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            y41Var.setVisibility(i10);
            if (!z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            z41Var.setVisibility(i11);
        }
        b51Var.h = z12;
        if (z12) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        textView.setOnClickListener(onClickListener);
        b51Var.setClipChildren(z12);
        y41Var.setText(spannableStringBuilder);
        z41Var.setText(spannableStringBuilder);
        if (!z15 && (ca0VarArr == null || ca0VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        z41Var.setTextIsSelectable(z11);
        z41Var.setOnLinkPressListener(w90Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        b51Var.f24799b = z10;
        b51Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean contentsEquals(f61 f61Var, f61 f61Var2) {
        if (TextUtils.equals(f61Var.f26140l, f61Var2.f26140l) && f61Var.f26135f == f61Var2.f26135f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new b51(context, d6Var);
    }

    @Override
    public final boolean equals(f61 f61Var, f61 f61Var2) {
        if (f61Var.d == f61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}

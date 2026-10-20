package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class c51 extends g61 {
    static {
        g61.setup(new g61());
    }

    public static h61 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, w90 w90Var, View.OnClickListener onClickListener2) {
        h61 J = h61.J(c51.class);
        J.d = i10;
        J.f26782l = charSequence;
        J.f26777f = z10;
        J.f26790t = false;
        J.D = onClickListener;
        J.G = w90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        w90 w90Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        d51 d51Var = (d51) view;
        CharSequence charSequence = h61Var.f26782l;
        boolean z12 = h61Var.f26777f;
        View.OnClickListener onClickListener = h61Var.D;
        Object obj = h61Var.G;
        if (obj != null) {
            w90Var = (w90) obj;
        } else {
            w90Var = null;
        }
        boolean z13 = h61Var.f26790t;
        View.OnClickListener onClickListener2 = h61Var.E;
        ImageView imageView = d51Var.f25340n;
        TextView textView = d51Var.d;
        a51 a51Var = d51Var.f25338c;
        b51 b51Var = d51Var.f25339f;
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
                ca0 ca0Var2 = new ca0(b51Var, ca0Var.f25160a, ca0Var.d, null);
                ca0 ca0Var3 = ca0VarArr[i15];
                ca0Var2.f25163f = ca0Var3.f25163f;
                ca0Var2.h = ca0Var3.h;
                ca0Var2.f25164n = ca0Var3.f25164n;
                spannableStringBuilder.setSpan(ca0Var2, spanStart, spanEnd, 33);
                i14 = i15 + 1;
                z13 = z14;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z15 = z13;
        if (d51Var.h && !z12) {
            a51Var.setVisibility(0);
            b51Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = a51Var.animate().alpha(0.0f).withEndAction(new hr0(d51Var, 23));
            TimeInterpolator timeInterpolator = bs.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            b51Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            a51Var.setVisibility(i10);
            if (!z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            b51Var.setVisibility(i11);
        }
        d51Var.h = z12;
        if (z12) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        textView.setOnClickListener(onClickListener);
        d51Var.setClipChildren(z12);
        a51Var.setText(spannableStringBuilder);
        b51Var.setText(spannableStringBuilder);
        if (!z15 && (ca0VarArr == null || ca0VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        b51Var.setTextIsSelectable(z11);
        b51Var.setOnLinkPressListener(w90Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        d51Var.f25337b = z10;
        d51Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean contentsEquals(h61 h61Var, h61 h61Var2) {
        if (TextUtils.equals(h61Var.f26782l, h61Var2.f26782l) && h61Var.f26777f == h61Var2.f26777f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new d51(context, d6Var);
    }

    @Override
    public final boolean equals(h61 h61Var, h61 h61Var2) {
        if (h61Var.d == h61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}

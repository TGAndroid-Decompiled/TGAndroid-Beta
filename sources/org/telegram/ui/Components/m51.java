package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class m51 extends q61 {
    static {
        q61.setup(new q61());
    }

    public static r61 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, ea0 ea0Var, View.OnClickListener onClickListener2) {
        r61 J = r61.J(m51.class);
        J.d = i10;
        J.f30361l = charSequence;
        J.f30356f = z10;
        J.f30369t = false;
        J.D = onClickListener;
        J.G = ea0Var;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        ea0 ea0Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        n51 n51Var = (n51) view;
        CharSequence charSequence = r61Var.f30361l;
        boolean z12 = r61Var.f30356f;
        View.OnClickListener onClickListener = r61Var.D;
        Object obj = r61Var.G;
        if (obj != null) {
            ea0Var = (ea0) obj;
        } else {
            ea0Var = null;
        }
        boolean z13 = r61Var.f30369t;
        View.OnClickListener onClickListener2 = r61Var.E;
        ImageView imageView = n51Var.f28964n;
        TextView textView = n51Var.d;
        k51 k51Var = n51Var.f28961c;
        l51 l51Var = n51Var.f28963f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = b6.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        ka0[] ka0VarArr = (ka0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ka0.class);
        if (ka0VarArr != null) {
            int i14 = 0;
            while (i14 < ka0VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(ka0VarArr[i14]);
                int spanEnd = spannableStringBuilder.getSpanEnd(ka0VarArr[i14]);
                boolean z14 = z13;
                spannableStringBuilder.removeSpan(ka0VarArr[i14]);
                int i15 = i14;
                ka0 ka0Var = ka0VarArr[i15];
                ka0 ka0Var2 = new ka0(l51Var, ka0Var.f27892a, ka0Var.d, null);
                ka0 ka0Var3 = ka0VarArr[i15];
                ka0Var2.f27896f = ka0Var3.f27896f;
                ka0Var2.h = ka0Var3.h;
                ka0Var2.f27897n = ka0Var3.f27897n;
                spannableStringBuilder.setSpan(ka0Var2, spanStart, spanEnd, 33);
                i14 = i15 + 1;
                z13 = z14;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z15 = z13;
        if (n51Var.h && !z12) {
            k51Var.setVisibility(0);
            l51Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = k51Var.animate().alpha(0.0f).withEndAction(new qr0(n51Var, 23));
            TimeInterpolator timeInterpolator = is.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            l51Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            k51Var.setVisibility(i10);
            if (!z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            l51Var.setVisibility(i11);
        }
        n51Var.h = z12;
        if (z12) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        textView.setOnClickListener(onClickListener);
        n51Var.setClipChildren(z12);
        k51Var.setText(spannableStringBuilder);
        l51Var.setText(spannableStringBuilder);
        if (!z15 && (ka0VarArr == null || ka0VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        l51Var.setTextIsSelectable(z11);
        l51Var.setOnLinkPressListener(ea0Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        n51Var.f28960b = z10;
        n51Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean contentsEquals(r61 r61Var, r61 r61Var2) {
        if (TextUtils.equals(r61Var.f30361l, r61Var2.f30361l) && r61Var.f30356f == r61Var2.f30356f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new n51(context, d6Var);
    }

    @Override
    public final boolean equals(r61 r61Var, r61 r61Var2) {
        if (r61Var.d == r61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}

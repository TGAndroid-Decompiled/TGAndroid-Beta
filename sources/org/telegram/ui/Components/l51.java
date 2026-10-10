package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class l51 extends p61 {
    static {
        p61.setup(new p61());
    }

    public static q61 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, ea0 ea0Var, View.OnClickListener onClickListener2) {
        q61 J = q61.J(l51.class);
        J.d = i10;
        J.f30063l = charSequence;
        J.f30058f = z10;
        J.f30071t = false;
        J.D = onClickListener;
        J.G = ea0Var;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        ea0 ea0Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        m51 m51Var = (m51) view;
        CharSequence charSequence = q61Var.f30063l;
        boolean z12 = q61Var.f30058f;
        View.OnClickListener onClickListener = q61Var.D;
        Object obj = q61Var.G;
        if (obj != null) {
            ea0Var = (ea0) obj;
        } else {
            ea0Var = null;
        }
        boolean z13 = q61Var.f30071t;
        View.OnClickListener onClickListener2 = q61Var.E;
        ImageView imageView = m51Var.f28639n;
        TextView textView = m51Var.d;
        j51 j51Var = m51Var.f28636c;
        k51 k51Var = m51Var.f28638f;
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
                ka0 ka0Var2 = new ka0(k51Var, ka0Var.f27950a, ka0Var.d, null);
                ka0 ka0Var3 = ka0VarArr[i15];
                ka0Var2.f27954f = ka0Var3.f27954f;
                ka0Var2.h = ka0Var3.h;
                ka0Var2.f27955n = ka0Var3.f27955n;
                spannableStringBuilder.setSpan(ka0Var2, spanStart, spanEnd, 33);
                i14 = i15 + 1;
                z13 = z14;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z15 = z13;
        if (m51Var.h && !z12) {
            j51Var.setVisibility(0);
            k51Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = j51Var.animate().alpha(0.0f).withEndAction(new pr0(m51Var, 23));
            TimeInterpolator timeInterpolator = is.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            k51Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            j51Var.setVisibility(i10);
            if (!z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            k51Var.setVisibility(i11);
        }
        m51Var.h = z12;
        if (z12) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        textView.setOnClickListener(onClickListener);
        m51Var.setClipChildren(z12);
        j51Var.setText(spannableStringBuilder);
        k51Var.setText(spannableStringBuilder);
        if (!z15 && (ka0VarArr == null || ka0VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        k51Var.setTextIsSelectable(z11);
        k51Var.setOnLinkPressListener(ea0Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        m51Var.f28635b = z10;
        m51Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean contentsEquals(q61 q61Var, q61 q61Var2) {
        if (TextUtils.equals(q61Var.f30063l, q61Var2.f30063l) && q61Var.f30058f == q61Var2.f30058f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new m51(context, e6Var);
    }

    @Override
    public final boolean equals(q61 q61Var, q61 q61Var2) {
        if (q61Var.d == q61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}

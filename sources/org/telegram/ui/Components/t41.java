package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class t41 extends w51 {
    static {
        w51.setup(new w51());
    }

    public static x51 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, k90 k90Var, View.OnClickListener onClickListener2) {
        x51 J = x51.J(t41.class);
        J.d = i10;
        J.f30248l = charSequence;
        J.f30243f = z10;
        J.f30256t = false;
        J.D = onClickListener;
        J.G = k90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        k90 k90Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        u41 u41Var = (u41) view;
        CharSequence charSequence = x51Var.f30248l;
        boolean z12 = x51Var.f30243f;
        View.OnClickListener onClickListener = x51Var.D;
        Object obj = x51Var.G;
        if (obj != null) {
            k90Var = (k90) obj;
        } else {
            k90Var = null;
        }
        boolean z13 = x51Var.f30256t;
        View.OnClickListener onClickListener2 = x51Var.E;
        ImageView imageView = u41Var.f28568n;
        TextView textView = u41Var.d;
        r41 r41Var = u41Var.f28566c;
        s41 s41Var = u41Var.f28567f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = z5.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        q90[] q90VarArr = (q90[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), q90.class);
        if (q90VarArr != null) {
            int i14 = 0;
            while (i14 < q90VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(q90VarArr[i14]);
                int spanEnd = spannableStringBuilder.getSpanEnd(q90VarArr[i14]);
                boolean z14 = z13;
                spannableStringBuilder.removeSpan(q90VarArr[i14]);
                int i15 = i14;
                q90 q90Var = q90VarArr[i15];
                q90 q90Var2 = new q90(s41Var, q90Var.f27490a, q90Var.d, null);
                q90 q90Var3 = q90VarArr[i15];
                q90Var2.f27493f = q90Var3.f27493f;
                q90Var2.h = q90Var3.h;
                q90Var2.f27494n = q90Var3.f27494n;
                spannableStringBuilder.setSpan(q90Var2, spanStart, spanEnd, 33);
                i14 = i15 + 1;
                z13 = z14;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z15 = z13;
        if (u41Var.h && !z12) {
            r41Var.setVisibility(0);
            s41Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = r41Var.animate().alpha(0.0f).withEndAction(new xq0(u41Var, 23));
            TimeInterpolator timeInterpolator = qr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            s41Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            r41Var.setVisibility(i10);
            if (!z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            s41Var.setVisibility(i11);
        }
        u41Var.h = z12;
        if (z12) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        textView.setOnClickListener(onClickListener);
        u41Var.setClipChildren(z12);
        r41Var.setText(spannableStringBuilder);
        s41Var.setText(spannableStringBuilder);
        if (!z15 && (q90VarArr == null || q90VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        s41Var.setTextIsSelectable(z11);
        s41Var.setOnLinkPressListener(k90Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        u41Var.f28565b = z10;
        u41Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean contentsEquals(x51 x51Var, x51 x51Var2) {
        if (TextUtils.equals(x51Var.f30248l, x51Var2.f30248l) && x51Var.f30243f == x51Var2.f30243f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new u41(context, e6Var);
    }

    @Override
    public final boolean equals(x51 x51Var, x51 x51Var2) {
        if (x51Var.d == x51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}

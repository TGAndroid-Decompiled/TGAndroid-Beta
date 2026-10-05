package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class d51 extends g61 {
    static {
        g61.setup(new g61());
    }

    public static h61 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, p90 p90Var, View.OnClickListener onClickListener2) {
        h61 K = h61.K(d51.class);
        K.d = i10;
        K.f27093l = charSequence;
        K.f27088f = z10;
        K.f27101t = false;
        K.D = onClickListener;
        K.G = p90Var;
        K.E = onClickListener2;
        return K;
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        p90 p90Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        e51 e51Var = (e51) view;
        CharSequence charSequence = h61Var.f27093l;
        boolean z12 = h61Var.f27088f;
        View.OnClickListener onClickListener = h61Var.D;
        Object obj = h61Var.G;
        if (obj != null) {
            p90Var = (p90) obj;
        } else {
            p90Var = null;
        }
        boolean z13 = h61Var.f27101t;
        View.OnClickListener onClickListener2 = h61Var.E;
        ImageView imageView = e51Var.f25982n;
        TextView textView = e51Var.d;
        b51 b51Var = e51Var.f25979c;
        c51 c51Var = e51Var.f25981f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = z5.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        v90[] v90VarArr = (v90[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), v90.class);
        if (v90VarArr != null) {
            int i14 = 0;
            while (i14 < v90VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(v90VarArr[i14]);
                int spanEnd = spannableStringBuilder.getSpanEnd(v90VarArr[i14]);
                boolean z14 = z13;
                spannableStringBuilder.removeSpan(v90VarArr[i14]);
                int i15 = i14;
                v90 v90Var = v90VarArr[i15];
                v90 v90Var2 = new v90(c51Var, v90Var.f31691a, v90Var.d, null);
                v90 v90Var3 = v90VarArr[i15];
                v90Var2.f31695f = v90Var3.f31695f;
                v90Var2.h = v90Var3.h;
                v90Var2.f31696n = v90Var3.f31696n;
                spannableStringBuilder.setSpan(v90Var2, spanStart, spanEnd, 33);
                i14 = i15 + 1;
                z13 = z14;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z15 = z13;
        if (e51Var.h && !z12) {
            b51Var.setVisibility(0);
            c51Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = b51Var.animate().alpha(0.0f).withEndAction(new gq0(e51Var, 26));
            TimeInterpolator timeInterpolator = tr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            c51Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            b51Var.setVisibility(i10);
            if (!z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c51Var.setVisibility(i11);
        }
        e51Var.h = z12;
        if (z12) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        textView.setOnClickListener(onClickListener);
        e51Var.setClipChildren(z12);
        b51Var.setText(spannableStringBuilder);
        c51Var.setText(spannableStringBuilder);
        if (!z15 && (v90VarArr == null || v90VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        c51Var.setTextIsSelectable(z11);
        c51Var.setOnLinkPressListener(p90Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        e51Var.f25978b = z10;
        e51Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean contentsEquals(h61 h61Var, h61 h61Var2) {
        if (TextUtils.equals(h61Var.f27093l, h61Var2.f27093l) && h61Var.f27088f == h61Var2.f27088f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new e51(context, d6Var);
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

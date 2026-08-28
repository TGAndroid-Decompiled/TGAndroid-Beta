package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class i31 extends k41 {
    static {
        k41.setup(new k41());
    }

    public static l41 a(int i9, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, k80 k80Var, View.OnClickListener onClickListener2) {
        l41 J = l41.J(i31.class);
        J.d = i9;
        J.f30339l = charSequence;
        J.f30334f = z10;
        J.f30347t = false;
        J.D = onClickListener;
        J.G = k80Var;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        k80 k80Var;
        CharSequence cloneSpans;
        int i9;
        int i10;
        int i11;
        boolean z11;
        int i12;
        j31 j31Var = (j31) view;
        CharSequence charSequence = l41Var.f30339l;
        boolean z12 = l41Var.f30334f;
        View.OnClickListener onClickListener = l41Var.D;
        Object obj = l41Var.G;
        if (obj != null) {
            k80Var = (k80) obj;
        } else {
            k80Var = null;
        }
        boolean z13 = l41Var.f30347t;
        View.OnClickListener onClickListener2 = l41Var.E;
        ImageView imageView = j31Var.f29623n;
        TextView textView = j31Var.d;
        g31 g31Var = j31Var.f29620c;
        h31 h31Var = j31Var.f29622f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = t5.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        q80[] q80VarArr = (q80[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), q80.class);
        if (q80VarArr != null) {
            int i13 = 0;
            while (i13 < q80VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(q80VarArr[i13]);
                int spanEnd = spannableStringBuilder.getSpanEnd(q80VarArr[i13]);
                boolean z14 = z13;
                spannableStringBuilder.removeSpan(q80VarArr[i13]);
                int i14 = i13;
                q80 q80Var = q80VarArr[i14];
                q80 q80Var2 = new q80(h31Var, q80Var.f31859a, q80Var.d, null);
                q80 q80Var3 = q80VarArr[i14];
                q80Var2.f31863f = q80Var3.f31863f;
                q80Var2.h = q80Var3.h;
                q80Var2.f31864n = q80Var3.f31864n;
                spannableStringBuilder.setSpan(q80Var2, spanStart, spanEnd, 33);
                i13 = i14 + 1;
                z13 = z14;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z15 = z13;
        if (j31Var.h && !z12) {
            g31Var.setVisibility(0);
            h31Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = g31Var.animate().alpha(0.0f).withEndAction(new tp0(j31Var, 23));
            TimeInterpolator timeInterpolator = gr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            h31Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z12) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            g31Var.setVisibility(i9);
            if (!z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            h31Var.setVisibility(i10);
        }
        j31Var.h = z12;
        if (z12) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
        textView.setOnClickListener(onClickListener);
        j31Var.setClipChildren(z12);
        g31Var.setText(spannableStringBuilder);
        h31Var.setText(spannableStringBuilder);
        if (!z15 && (q80VarArr == null || q80VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        h31Var.setTextIsSelectable(z11);
        h31Var.setOnLinkPressListener(k80Var);
        if (onClickListener3 != null) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        imageView.setVisibility(i12);
        imageView.setOnClickListener(onClickListener3);
        j31Var.f29619b = z10;
        j31Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean contentsEquals(l41 l41Var, l41 l41Var2) {
        if (TextUtils.equals(l41Var.f30339l, l41Var2.f30339l) && l41Var.f30334f == l41Var2.f30334f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new j31(context, b6Var);
    }

    @Override
    public final boolean equals(l41 l41Var, l41 l41Var2) {
        if (l41Var.d == l41Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}

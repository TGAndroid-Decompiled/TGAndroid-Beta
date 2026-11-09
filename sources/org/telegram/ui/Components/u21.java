package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class u21 extends x31 {
    static {
        x31.h(new x31());
    }

    public static y31 i(int i7, CharSequence charSequence, boolean z9, View.OnClickListener onClickListener, w70 w70Var, View.OnClickListener onClickListener2) {
        y31 K = y31.K(u21.class);
        K.d = i7;
        K.f40568l = charSequence;
        K.f40563f = z9;
        K.f40576t = false;
        K.D = onClickListener;
        K.G = w70Var;
        K.E = onClickListener2;
        return K;
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        w70 w70Var;
        CharSequence cloneSpans;
        int i7;
        int i10;
        int i11;
        boolean z10;
        int i12;
        v21 v21Var = (v21) view;
        CharSequence charSequence = y31Var.f40568l;
        boolean z11 = y31Var.f40563f;
        View.OnClickListener onClickListener = y31Var.D;
        Object obj = y31Var.G;
        if (obj != null) {
            w70Var = (w70) obj;
        } else {
            w70Var = null;
        }
        boolean z12 = y31Var.f40576t;
        View.OnClickListener onClickListener2 = y31Var.E;
        ImageView imageView = v21Var.f38907n;
        TextView textView = v21Var.d;
        s21 s21Var = v21Var.f38904c;
        t21 t21Var = v21Var.f38906f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = r5.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        c80[] c80VarArr = (c80[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), c80.class);
        if (c80VarArr != null) {
            int i13 = 0;
            while (i13 < c80VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(c80VarArr[i13]);
                int spanEnd = spannableStringBuilder.getSpanEnd(c80VarArr[i13]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(c80VarArr[i13]);
                int i14 = i13;
                c80 c80Var = c80VarArr[i14];
                c80 c80Var2 = new c80(t21Var, c80Var.f32583a, c80Var.d, null);
                c80 c80Var3 = c80VarArr[i14];
                c80Var2.f32587f = c80Var3.f32587f;
                c80Var2.h = c80Var3.h;
                c80Var2.f32588n = c80Var3.f32588n;
                spannableStringBuilder.setSpan(c80Var2, spanStart, spanEnd, 33);
                i13 = i14 + 1;
                z12 = z13;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z14 = z12;
        if (v21Var.h && !z11) {
            s21Var.setVisibility(0);
            t21Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = s21Var.animate().alpha(0.0f).withEndAction(new kr0(v21Var, 22));
            TimeInterpolator timeInterpolator = xq.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            t21Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z11) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            s21Var.setVisibility(i7);
            if (!z11) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            t21Var.setVisibility(i10);
        }
        v21Var.h = z11;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
        textView.setOnClickListener(onClickListener);
        v21Var.setClipChildren(z11);
        s21Var.setText(spannableStringBuilder);
        t21Var.setText(spannableStringBuilder);
        if (!z14 && (c80VarArr == null || c80VarArr.length == 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        t21Var.setTextIsSelectable(z10);
        t21Var.setOnLinkPressListener(w70Var);
        if (onClickListener3 != null) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        imageView.setVisibility(i12);
        imageView.setOnClickListener(onClickListener3);
        v21Var.f38903b = z9;
        v21Var.setWillNotDraw(true ^ z9);
    }

    @Override
    public final boolean c(y31 y31Var, y31 y31Var2) {
        if (TextUtils.equals(y31Var.f40568l, y31Var2.f40568l) && y31Var.f40563f == y31Var2.f40563f) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new v21(context, g6Var);
    }

    @Override
    public final boolean e(y31 y31Var, y31 y31Var2) {
        if (y31Var.d == y31Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }
}

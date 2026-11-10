package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class t21 extends w31 {
    static {
        w31.h(new w31());
    }

    public static x31 i(int i7, CharSequence charSequence, boolean z9, View.OnClickListener onClickListener, v70 v70Var, View.OnClickListener onClickListener2) {
        x31 K = x31.K(t21.class);
        K.d = i7;
        K.f40156l = charSequence;
        K.f40151f = z9;
        K.f40164t = false;
        K.D = onClickListener;
        K.G = v70Var;
        K.E = onClickListener2;
        return K;
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        v70 v70Var;
        CharSequence cloneSpans;
        int i7;
        int i10;
        int i11;
        boolean z10;
        int i12;
        u21 u21Var = (u21) view;
        CharSequence charSequence = x31Var.f40156l;
        boolean z11 = x31Var.f40151f;
        View.OnClickListener onClickListener = x31Var.D;
        Object obj = x31Var.G;
        if (obj != null) {
            v70Var = (v70) obj;
        } else {
            v70Var = null;
        }
        boolean z12 = x31Var.f40164t;
        View.OnClickListener onClickListener2 = x31Var.E;
        ImageView imageView = u21Var.f38501n;
        TextView textView = u21Var.d;
        r21 r21Var = u21Var.f38498c;
        s21 s21Var = u21Var.f38500f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = q5.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        b80[] b80VarArr = (b80[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), b80.class);
        if (b80VarArr != null) {
            int i13 = 0;
            while (i13 < b80VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(b80VarArr[i13]);
                int spanEnd = spannableStringBuilder.getSpanEnd(b80VarArr[i13]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(b80VarArr[i13]);
                int i14 = i13;
                b80 b80Var = b80VarArr[i14];
                b80 b80Var2 = new b80(s21Var, b80Var.f32159a, b80Var.d, null);
                b80 b80Var3 = b80VarArr[i14];
                b80Var2.f32163f = b80Var3.f32163f;
                b80Var2.h = b80Var3.h;
                b80Var2.f32164n = b80Var3.f32164n;
                spannableStringBuilder.setSpan(b80Var2, spanStart, spanEnd, 33);
                i13 = i14 + 1;
                z12 = z13;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z14 = z12;
        if (u21Var.h && !z11) {
            r21Var.setVisibility(0);
            s21Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = r21Var.animate().alpha(0.0f).withEndAction(new jr0(u21Var, 22));
            TimeInterpolator timeInterpolator = wq.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            s21Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z11) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            r21Var.setVisibility(i7);
            if (!z11) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            s21Var.setVisibility(i10);
        }
        u21Var.h = z11;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
        textView.setOnClickListener(onClickListener);
        u21Var.setClipChildren(z11);
        r21Var.setText(spannableStringBuilder);
        s21Var.setText(spannableStringBuilder);
        if (!z14 && (b80VarArr == null || b80VarArr.length == 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        s21Var.setTextIsSelectable(z10);
        s21Var.setOnLinkPressListener(v70Var);
        if (onClickListener3 != null) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        imageView.setVisibility(i12);
        imageView.setOnClickListener(onClickListener3);
        u21Var.f38497b = z9;
        u21Var.setWillNotDraw(true ^ z9);
    }

    @Override
    public final boolean c(x31 x31Var, x31 x31Var2) {
        if (TextUtils.equals(x31Var.f40156l, x31Var2.f40156l) && x31Var.f40151f == x31Var2.f40151f) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new u21(context, h6Var);
    }

    @Override
    public final boolean e(x31 x31Var, x31 x31Var2) {
        if (x31Var.d == x31Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }
}

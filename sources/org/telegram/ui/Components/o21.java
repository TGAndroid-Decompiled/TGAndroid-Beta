package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class o21 extends q31 {
    static {
        q31.h(new q31());
    }

    public static r31 i(int i3, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, r70 r70Var, View.OnClickListener onClickListener2) {
        r31 K = r31.K(o21.class);
        K.d = i3;
        K.f37627l = charSequence;
        K.f37622f = z10;
        K.f37635t = false;
        K.D = onClickListener;
        K.G = r70Var;
        K.E = onClickListener2;
        return K;
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        r70 r70Var;
        CharSequence cloneSpans;
        int i3;
        int i10;
        int i11;
        boolean z11;
        int i12;
        p21 p21Var = (p21) view;
        CharSequence charSequence = r31Var.f37627l;
        boolean z12 = r31Var.f37622f;
        View.OnClickListener onClickListener = r31Var.D;
        Object obj = r31Var.G;
        if (obj != null) {
            r70Var = (r70) obj;
        } else {
            r70Var = null;
        }
        boolean z13 = r31Var.f37635t;
        View.OnClickListener onClickListener2 = r31Var.E;
        ImageView imageView = p21Var.f37044n;
        TextView textView = p21Var.d;
        m21 m21Var = p21Var.f37041c;
        n21 n21Var = p21Var.f37043f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = p5.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        x70[] x70VarArr = (x70[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), x70.class);
        if (x70VarArr != null) {
            int i13 = 0;
            while (i13 < x70VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(x70VarArr[i13]);
                int spanEnd = spannableStringBuilder.getSpanEnd(x70VarArr[i13]);
                boolean z14 = z13;
                spannableStringBuilder.removeSpan(x70VarArr[i13]);
                int i14 = i13;
                x70 x70Var = x70VarArr[i14];
                x70 x70Var2 = new x70(n21Var, x70Var.f40259a, x70Var.d, null);
                x70 x70Var3 = x70VarArr[i14];
                x70Var2.f40263f = x70Var3.f40263f;
                x70Var2.h = x70Var3.h;
                x70Var2.f40264n = x70Var3.f40264n;
                spannableStringBuilder.setSpan(x70Var2, spanStart, spanEnd, 33);
                i13 = i14 + 1;
                z13 = z14;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z15 = z13;
        if (p21Var.h && !z12) {
            m21Var.setVisibility(0);
            n21Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = m21Var.animate().alpha(0.0f).withEndAction(new sp0(p21Var, 23));
            TimeInterpolator timeInterpolator = xq.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            n21Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z12) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            m21Var.setVisibility(i3);
            if (!z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            n21Var.setVisibility(i10);
        }
        p21Var.h = z12;
        if (z12) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
        textView.setOnClickListener(onClickListener);
        p21Var.setClipChildren(z12);
        m21Var.setText(spannableStringBuilder);
        n21Var.setText(spannableStringBuilder);
        if (!z15 && (x70VarArr == null || x70VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        n21Var.setTextIsSelectable(z11);
        n21Var.setOnLinkPressListener(r70Var);
        if (onClickListener3 != null) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        imageView.setVisibility(i12);
        imageView.setOnClickListener(onClickListener3);
        p21Var.f37040b = z10;
        p21Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean c(r31 r31Var, r31 r31Var2) {
        if (TextUtils.equals(r31Var.f37627l, r31Var2.f37627l) && r31Var.f37622f == r31Var2.f37622f) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new p21(context, e6Var);
    }

    @Override
    public final boolean e(r31 r31Var, r31 r31Var2) {
        if (r31Var.d == r31Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }
}

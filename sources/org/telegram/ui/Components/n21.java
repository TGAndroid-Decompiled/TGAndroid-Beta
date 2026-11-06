package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class n21 extends q31 {
    static {
        q31.h(new q31());
    }

    public static r31 i(int i7, CharSequence charSequence, boolean z9, View.OnClickListener onClickListener, v70 v70Var, View.OnClickListener onClickListener2) {
        r31 K = r31.K(n21.class);
        K.d = i7;
        K.f37598l = charSequence;
        K.f37593f = z9;
        K.f37606t = false;
        K.D = onClickListener;
        K.G = v70Var;
        K.E = onClickListener2;
        return K;
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        v70 v70Var;
        CharSequence cloneSpans;
        int i7;
        int i10;
        int i11;
        boolean z10;
        int i12;
        o21 o21Var = (o21) view;
        CharSequence charSequence = r31Var.f37598l;
        boolean z11 = r31Var.f37593f;
        View.OnClickListener onClickListener = r31Var.D;
        Object obj = r31Var.G;
        if (obj != null) {
            v70Var = (v70) obj;
        } else {
            v70Var = null;
        }
        boolean z12 = r31Var.f37606t;
        View.OnClickListener onClickListener2 = r31Var.E;
        ImageView imageView = o21Var.f36581n;
        TextView textView = o21Var.d;
        l21 l21Var = o21Var.f36578c;
        m21 m21Var = o21Var.f36580f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = r5.cloneSpans(charSequence);
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
                b80 b80Var2 = new b80(m21Var, b80Var.f32075a, b80Var.d, null);
                b80 b80Var3 = b80VarArr[i14];
                b80Var2.f32079f = b80Var3.f32079f;
                b80Var2.h = b80Var3.h;
                b80Var2.f32080n = b80Var3.f32080n;
                spannableStringBuilder.setSpan(b80Var2, spanStart, spanEnd, 33);
                i13 = i14 + 1;
                z12 = z13;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z14 = z12;
        if (o21Var.h && !z11) {
            l21Var.setVisibility(0);
            m21Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = l21Var.animate().alpha(0.0f).withEndAction(new ir0(o21Var, 21));
            TimeInterpolator timeInterpolator = xq.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            m21Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z11) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            l21Var.setVisibility(i7);
            if (!z11) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            m21Var.setVisibility(i10);
        }
        o21Var.h = z11;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
        textView.setOnClickListener(onClickListener);
        o21Var.setClipChildren(z11);
        l21Var.setText(spannableStringBuilder);
        m21Var.setText(spannableStringBuilder);
        if (!z14 && (b80VarArr == null || b80VarArr.length == 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        m21Var.setTextIsSelectable(z10);
        m21Var.setOnLinkPressListener(v70Var);
        if (onClickListener3 != null) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        imageView.setVisibility(i12);
        imageView.setOnClickListener(onClickListener3);
        o21Var.f36577b = z9;
        o21Var.setWillNotDraw(true ^ z9);
    }

    @Override
    public final boolean c(r31 r31Var, r31 r31Var2) {
        if (TextUtils.equals(r31Var.f37598l, r31Var2.f37598l) && r31Var.f37593f == r31Var2.f37593f) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new o21(context, f6Var);
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

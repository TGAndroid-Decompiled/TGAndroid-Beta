package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class y21 extends a41 {
    static {
        a41.h(new a41());
    }

    public static b41 i(int i7, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, y70 y70Var, View.OnClickListener onClickListener2) {
        b41 K = b41.K(y21.class);
        K.d = i7;
        K.f33181l = charSequence;
        K.f33176f = z10;
        K.f33189t = false;
        K.D = onClickListener;
        K.G = y70Var;
        K.E = onClickListener2;
        return K;
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        y70 y70Var;
        CharSequence cloneSpans;
        int i7;
        int i10;
        int i11;
        boolean z11;
        int i12;
        z21 z21Var = (z21) view;
        CharSequence charSequence = b41Var.f33181l;
        boolean z12 = b41Var.f33176f;
        View.OnClickListener onClickListener = b41Var.D;
        Object obj = b41Var.G;
        if (obj != null) {
            y70Var = (y70) obj;
        } else {
            y70Var = null;
        }
        boolean z13 = b41Var.f33189t;
        View.OnClickListener onClickListener2 = b41Var.E;
        ImageView imageView = z21Var.f42224n;
        TextView textView = z21Var.d;
        w21 w21Var = z21Var.f42221c;
        x21 x21Var = z21Var.f42223f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = p5.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        e80[] e80VarArr = (e80[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), e80.class);
        if (e80VarArr != null) {
            int i13 = 0;
            while (i13 < e80VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(e80VarArr[i13]);
                int spanEnd = spannableStringBuilder.getSpanEnd(e80VarArr[i13]);
                boolean z14 = z13;
                spannableStringBuilder.removeSpan(e80VarArr[i13]);
                int i14 = i13;
                e80 e80Var = e80VarArr[i14];
                e80 e80Var2 = new e80(x21Var, e80Var.f34253a, e80Var.d, null);
                e80 e80Var3 = e80VarArr[i14];
                e80Var2.f34257f = e80Var3.f34257f;
                e80Var2.h = e80Var3.h;
                e80Var2.f34258n = e80Var3.f34258n;
                spannableStringBuilder.setSpan(e80Var2, spanStart, spanEnd, 33);
                i13 = i14 + 1;
                z13 = z14;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z15 = z13;
        if (z21Var.h && !z12) {
            w21Var.setVisibility(0);
            x21Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = w21Var.animate().alpha(0.0f).withEndAction(new ro0(z21Var, 25));
            TimeInterpolator timeInterpolator = er.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            x21Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z12) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            w21Var.setVisibility(i7);
            if (!z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            x21Var.setVisibility(i10);
        }
        z21Var.h = z12;
        if (z12) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
        textView.setOnClickListener(onClickListener);
        z21Var.setClipChildren(z12);
        w21Var.setText(spannableStringBuilder);
        x21Var.setText(spannableStringBuilder);
        if (!z15 && (e80VarArr == null || e80VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        x21Var.setTextIsSelectable(z11);
        x21Var.setOnLinkPressListener(y70Var);
        if (onClickListener3 != null) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        imageView.setVisibility(i12);
        imageView.setOnClickListener(onClickListener3);
        z21Var.f42220b = z10;
        z21Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean c(b41 b41Var, b41 b41Var2) {
        if (TextUtils.equals(b41Var.f33181l, b41Var2.f33181l) && b41Var.f33176f == b41Var2.f33176f) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new z21(context, e6Var);
    }

    @Override
    public final boolean e(b41 b41Var, b41 b41Var2) {
        if (b41Var.d == b41Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }
}

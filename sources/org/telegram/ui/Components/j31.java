package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class j31 extends m41 {
    static {
        m41.h(new m41());
    }

    public static n41 i(int i7, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, i80 i80Var, View.OnClickListener onClickListener2) {
        n41 K = n41.K(j31.class);
        K.d = i7;
        K.f37655m = charSequence;
        K.f37649f = z10;
        K.f37663u = false;
        K.E = onClickListener;
        K.H = i80Var;
        K.F = onClickListener2;
        return K;
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        i80 i80Var;
        CharSequence cloneSpans;
        boolean z11;
        int i7;
        int i10;
        int i11;
        boolean z12;
        int i12;
        ImageView imageView;
        k31 k31Var = (k31) view;
        CharSequence charSequence = n41Var.f37655m;
        boolean z13 = n41Var.f37649f;
        View.OnClickListener onClickListener = n41Var.E;
        Object obj = n41Var.H;
        if (obj != null) {
            i80Var = (i80) obj;
        } else {
            i80Var = null;
        }
        boolean z14 = n41Var.f37663u;
        View.OnClickListener onClickListener2 = n41Var.F;
        ImageView imageView2 = k31Var.f36638n;
        TextView textView = k31Var.d;
        h31 h31Var = k31Var.f36635c;
        i31 i31Var = k31Var.f36637f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = x5.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        int i13 = 0;
        o80[] o80VarArr = (o80[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), o80.class);
        if (o80VarArr != null) {
            while (i13 < o80VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(o80VarArr[i13]);
                int spanEnd = spannableStringBuilder.getSpanEnd(o80VarArr[i13]);
                boolean z15 = z14;
                spannableStringBuilder.removeSpan(o80VarArr[i13]);
                int i14 = i13;
                o80 o80Var = o80VarArr[i14];
                View.OnClickListener onClickListener3 = onClickListener2;
                o80 o80Var2 = new o80(i31Var, o80Var.f38062a, o80Var.d, null);
                o80 o80Var3 = o80VarArr[i14];
                o80Var2.f38066f = o80Var3.f38066f;
                o80Var2.h = o80Var3.h;
                o80Var2.f38067n = o80Var3.f38067n;
                if (o80Var3.f38067n && i0.a.h(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, k31Var.f36633a)) > 0.5d) {
                    float max = Math.max(0.05f, o80VarArr[i14].h);
                    imageView = imageView2;
                    o80Var2.a(org.telegram.ui.ActionBar.n6.r1(Math.min(1.0f, 0.07f / max), -1), org.telegram.ui.ActionBar.n6.r1(Math.min(1.0f, 0.115f / max), -1));
                } else {
                    imageView = imageView2;
                }
                spannableStringBuilder.setSpan(o80Var2, spanStart, spanEnd, 33);
                i13 = i14 + 1;
                z14 = z15;
                onClickListener2 = onClickListener3;
                imageView2 = imageView;
            }
        }
        View.OnClickListener onClickListener4 = onClickListener2;
        boolean z16 = z14;
        ImageView imageView3 = imageView2;
        if (k31Var.h && !z13) {
            z11 = 0;
            h31Var.setVisibility(0);
            i31Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = h31Var.animate().alpha(0.0f).withEndAction(new bp0(k31Var, 24));
            TimeInterpolator timeInterpolator = kr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            i31Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            z11 = 0;
            if (z13) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            h31Var.setVisibility(i7);
            if (!z13) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            i31Var.setVisibility(i10);
        }
        k31Var.h = z13;
        if (z13) {
            i11 = z11;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
        textView.setOnClickListener(onClickListener);
        k31Var.setClipChildren(z13);
        h31Var.setText(spannableStringBuilder);
        i31Var.setText(spannableStringBuilder);
        if (!z16 && (o80VarArr == null || o80VarArr.length == 0)) {
            z12 = true;
        } else {
            z12 = z11;
        }
        i31Var.setTextIsSelectable(z12);
        i31Var.setOnLinkPressListener(i80Var);
        if (onClickListener4 != null) {
            i12 = z11;
        } else {
            i12 = 8;
        }
        imageView3.setVisibility(i12);
        imageView3.setOnClickListener(onClickListener4);
        k31Var.f36634b = z10;
        k31Var.setWillNotDraw(!z10);
    }

    @Override
    public final boolean c(n41 n41Var, n41 n41Var2) {
        if (TextUtils.equals(n41Var.f37655m, n41Var2.f37655m) && n41Var.f37649f == n41Var2.f37649f) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new k31(context, i6Var);
    }

    @Override
    public final boolean e(n41 n41Var, n41 n41Var2) {
        if (n41Var.d == n41Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }
}

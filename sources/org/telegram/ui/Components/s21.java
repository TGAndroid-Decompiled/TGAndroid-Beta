package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class s21 extends v31 {
    static {
        v31.h(new v31());
    }

    public static w31 i(int i7, CharSequence charSequence, boolean z9, View.OnClickListener onClickListener, v70 v70Var, View.OnClickListener onClickListener2) {
        w31 K = w31.K(s21.class);
        K.d = i7;
        K.f39830l = charSequence;
        K.f39825f = z9;
        K.f39838t = false;
        K.D = onClickListener;
        K.G = v70Var;
        K.E = onClickListener2;
        return K;
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        v70 v70Var;
        CharSequence cloneSpans;
        int i7;
        int i10;
        int i11;
        boolean z10;
        int i12;
        t21 t21Var = (t21) view;
        CharSequence charSequence = w31Var.f39830l;
        boolean z11 = w31Var.f39825f;
        View.OnClickListener onClickListener = w31Var.D;
        Object obj = w31Var.G;
        if (obj != null) {
            v70Var = (v70) obj;
        } else {
            v70Var = null;
        }
        boolean z12 = w31Var.f39838t;
        View.OnClickListener onClickListener2 = w31Var.E;
        ImageView imageView = t21Var.f38205n;
        TextView textView = t21Var.d;
        q21 q21Var = t21Var.f38202c;
        r21 r21Var = t21Var.f38204f;
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
                b80 b80Var2 = new b80(r21Var, b80Var.f32069a, b80Var.d, null);
                b80 b80Var3 = b80VarArr[i14];
                b80Var2.f32073f = b80Var3.f32073f;
                b80Var2.h = b80Var3.h;
                b80Var2.f32074n = b80Var3.f32074n;
                spannableStringBuilder.setSpan(b80Var2, spanStart, spanEnd, 33);
                i13 = i14 + 1;
                z12 = z13;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z14 = z12;
        if (t21Var.h && !z11) {
            q21Var.setVisibility(0);
            r21Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = q21Var.animate().alpha(0.0f).withEndAction(new ir0(t21Var, 22));
            TimeInterpolator timeInterpolator = xq.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            r21Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z11) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            q21Var.setVisibility(i7);
            if (!z11) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            r21Var.setVisibility(i10);
        }
        t21Var.h = z11;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
        textView.setOnClickListener(onClickListener);
        t21Var.setClipChildren(z11);
        q21Var.setText(spannableStringBuilder);
        r21Var.setText(spannableStringBuilder);
        if (!z14 && (b80VarArr == null || b80VarArr.length == 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        r21Var.setTextIsSelectable(z10);
        r21Var.setOnLinkPressListener(v70Var);
        if (onClickListener3 != null) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        imageView.setVisibility(i12);
        imageView.setOnClickListener(onClickListener3);
        t21Var.f38201b = z9;
        t21Var.setWillNotDraw(true ^ z9);
    }

    @Override
    public final boolean c(w31 w31Var, w31 w31Var2) {
        if (TextUtils.equals(w31Var.f39830l, w31Var2.f39830l) && w31Var.f39825f == w31Var2.f39825f) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new t21(context, f6Var);
    }

    @Override
    public final boolean e(w31 w31Var, w31 w31Var2) {
        if (w31Var.d == w31Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }
}

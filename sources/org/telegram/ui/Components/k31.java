package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class k31 extends n41 {
    static {
        n41.h(new n41());
    }

    public static o41 i(int i7, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, l80 l80Var, View.OnClickListener onClickListener2) {
        o41 K = o41.K(k31.class);
        K.d = i7;
        K.f38098m = charSequence;
        K.f38092f = z10;
        K.f38106u = false;
        K.E = onClickListener;
        K.H = l80Var;
        K.F = onClickListener2;
        return K;
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        l80 l80Var;
        CharSequence cloneSpans;
        boolean z11;
        int i7;
        int i10;
        int i11;
        boolean z12;
        int i12;
        ImageView imageView;
        l31 l31Var = (l31) view;
        CharSequence charSequence = o41Var.f38098m;
        boolean z13 = o41Var.f38092f;
        View.OnClickListener onClickListener = o41Var.E;
        Object obj = o41Var.H;
        if (obj != null) {
            l80Var = (l80) obj;
        } else {
            l80Var = null;
        }
        boolean z14 = o41Var.f38106u;
        View.OnClickListener onClickListener2 = o41Var.F;
        ImageView imageView2 = l31Var.f37090n;
        TextView textView = l31Var.d;
        i31 i31Var = l31Var.f37087c;
        j31 j31Var = l31Var.f37089f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = y5.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        int i13 = 0;
        r80[] r80VarArr = (r80[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), r80.class);
        if (r80VarArr != null) {
            while (i13 < r80VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(r80VarArr[i13]);
                int spanEnd = spannableStringBuilder.getSpanEnd(r80VarArr[i13]);
                boolean z15 = z14;
                spannableStringBuilder.removeSpan(r80VarArr[i13]);
                int i14 = i13;
                r80 r80Var = r80VarArr[i14];
                View.OnClickListener onClickListener3 = onClickListener2;
                r80 r80Var2 = new r80(j31Var, r80Var.f39105a, r80Var.d, null);
                r80 r80Var3 = r80VarArr[i14];
                r80Var2.f39109f = r80Var3.f39109f;
                r80Var2.h = r80Var3.h;
                r80Var2.f39110n = r80Var3.f39110n;
                if (r80Var3.f39110n && i0.a.h(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, l31Var.f37085a)) > 0.5d) {
                    float max = Math.max(0.05f, r80VarArr[i14].h);
                    imageView = imageView2;
                    r80Var2.a(org.telegram.ui.ActionBar.m6.r1(Math.min(1.0f, 0.07f / max), -1), org.telegram.ui.ActionBar.m6.r1(Math.min(1.0f, 0.115f / max), -1));
                } else {
                    imageView = imageView2;
                }
                spannableStringBuilder.setSpan(r80Var2, spanStart, spanEnd, 33);
                i13 = i14 + 1;
                z14 = z15;
                onClickListener2 = onClickListener3;
                imageView2 = imageView;
            }
        }
        View.OnClickListener onClickListener4 = onClickListener2;
        boolean z16 = z14;
        ImageView imageView3 = imageView2;
        if (l31Var.h && !z13) {
            z11 = 0;
            i31Var.setVisibility(0);
            j31Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = i31Var.animate().alpha(0.0f).withEndAction(new cp0(l31Var, 24));
            TimeInterpolator timeInterpolator = nr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            j31Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            z11 = 0;
            if (z13) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            i31Var.setVisibility(i7);
            if (!z13) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            j31Var.setVisibility(i10);
        }
        l31Var.h = z13;
        if (z13) {
            i11 = z11;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
        textView.setOnClickListener(onClickListener);
        l31Var.setClipChildren(z13);
        i31Var.setText(spannableStringBuilder);
        j31Var.setText(spannableStringBuilder);
        if (!z16 && (r80VarArr == null || r80VarArr.length == 0)) {
            z12 = true;
        } else {
            z12 = z11;
        }
        j31Var.setTextIsSelectable(z12);
        j31Var.setOnLinkPressListener(l80Var);
        if (onClickListener4 != null) {
            i12 = z11;
        } else {
            i12 = 8;
        }
        imageView3.setVisibility(i12);
        imageView3.setOnClickListener(onClickListener4);
        l31Var.f37086b = z10;
        l31Var.setWillNotDraw(!z10);
    }

    @Override
    public final boolean c(o41 o41Var, o41 o41Var2) {
        if (TextUtils.equals(o41Var.f38098m, o41Var2.f38098m) && o41Var.f38092f == o41Var2.f38092f) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new l31(context, h6Var);
    }

    @Override
    public final boolean e(o41 o41Var, o41 o41Var2) {
        if (o41Var.d == o41Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }
}

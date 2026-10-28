package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class q51 extends t61 {
    static {
        t61.setup(new t61());
    }

    public static u61 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, z90 z90Var, View.OnClickListener onClickListener2) {
        u61 K = u61.K(q51.class);
        K.d = i10;
        K.f33249l = charSequence;
        K.f33244f = z10;
        K.f33257t = false;
        K.D = onClickListener;
        K.G = z90Var;
        K.E = onClickListener2;
        return K;
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        z90 z90Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        r51 r51Var = (r51) view;
        CharSequence charSequence = u61Var.f33249l;
        boolean z12 = u61Var.f33244f;
        View.OnClickListener onClickListener = u61Var.D;
        Object obj = u61Var.G;
        if (obj != null) {
            z90Var = (z90) obj;
        } else {
            z90Var = null;
        }
        boolean z13 = u61Var.f33257t;
        View.OnClickListener onClickListener2 = u61Var.E;
        ImageView imageView = r51Var.f32136n;
        TextView textView = r51Var.d;
        o51 o51Var = r51Var.f32134c;
        p51 p51Var = r51Var.f32135f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = c6.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        fa0[] fa0VarArr = (fa0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), fa0.class);
        if (fa0VarArr != null) {
            int i14 = 0;
            while (i14 < fa0VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(fa0VarArr[i14]);
                int spanEnd = spannableStringBuilder.getSpanEnd(fa0VarArr[i14]);
                boolean z14 = z13;
                spannableStringBuilder.removeSpan(fa0VarArr[i14]);
                int i15 = i14;
                fa0 fa0Var = fa0VarArr[i15];
                fa0 fa0Var2 = new fa0(p51Var, fa0Var.f28083a, fa0Var.d, null);
                fa0 fa0Var3 = fa0VarArr[i15];
                fa0Var2.f28086f = fa0Var3.f28086f;
                fa0Var2.h = fa0Var3.h;
                fa0Var2.f28087n = fa0Var3.f28087n;
                spannableStringBuilder.setSpan(fa0Var2, spanStart, spanEnd, 33);
                i14 = i15 + 1;
                z13 = z14;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z15 = z13;
        if (r51Var.h && !z12) {
            o51Var.setVisibility(0);
            p51Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = o51Var.animate().alpha(0.0f).withEndAction(new np0(r51Var, 29));
            TimeInterpolator timeInterpolator = ds.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            p51Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            o51Var.setVisibility(i10);
            if (!z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            p51Var.setVisibility(i11);
        }
        r51Var.h = z12;
        if (z12) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        textView.setOnClickListener(onClickListener);
        r51Var.setClipChildren(z12);
        o51Var.setText(spannableStringBuilder);
        p51Var.setText(spannableStringBuilder);
        if (!z15 && (fa0VarArr == null || fa0VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        p51Var.setTextIsSelectable(z11);
        p51Var.setOnLinkPressListener(z90Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        r51Var.f32133b = z10;
        r51Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        if (TextUtils.equals(u61Var.f33249l, u61Var2.f33249l) && u61Var.f33244f == u61Var2.f33244f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new r51(context, u6Var);
    }

    @Override
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        if (u61Var.d == u61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}

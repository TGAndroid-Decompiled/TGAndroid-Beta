package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class p51 extends s61 {
    static {
        s61.setup(new s61());
    }

    public static t61 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, y90 y90Var, View.OnClickListener onClickListener2) {
        t61 K = t61.K(p51.class);
        K.d = i10;
        K.f32872l = charSequence;
        K.f32867f = z10;
        K.f32880t = false;
        K.D = onClickListener;
        K.G = y90Var;
        K.E = onClickListener2;
        return K;
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        y90 y90Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        q51 q51Var = (q51) view;
        CharSequence charSequence = t61Var.f32872l;
        boolean z12 = t61Var.f32867f;
        View.OnClickListener onClickListener = t61Var.D;
        Object obj = t61Var.G;
        if (obj != null) {
            y90Var = (y90) obj;
        } else {
            y90Var = null;
        }
        boolean z13 = t61Var.f32880t;
        View.OnClickListener onClickListener2 = t61Var.E;
        ImageView imageView = q51Var.f31840n;
        TextView textView = q51Var.d;
        n51 n51Var = q51Var.f31838c;
        o51 o51Var = q51Var.f31839f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = c6.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        ea0[] ea0VarArr = (ea0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ea0.class);
        if (ea0VarArr != null) {
            int i14 = 0;
            while (i14 < ea0VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(ea0VarArr[i14]);
                int spanEnd = spannableStringBuilder.getSpanEnd(ea0VarArr[i14]);
                boolean z14 = z13;
                spannableStringBuilder.removeSpan(ea0VarArr[i14]);
                int i15 = i14;
                ea0 ea0Var = ea0VarArr[i15];
                ea0 ea0Var2 = new ea0(o51Var, ea0Var.f27787a, ea0Var.d, null);
                ea0 ea0Var3 = ea0VarArr[i15];
                ea0Var2.f27790f = ea0Var3.f27790f;
                ea0Var2.h = ea0Var3.h;
                ea0Var2.f27791n = ea0Var3.f27791n;
                spannableStringBuilder.setSpan(ea0Var2, spanStart, spanEnd, 33);
                i14 = i15 + 1;
                z13 = z14;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z15 = z13;
        if (q51Var.h && !z12) {
            n51Var.setVisibility(0);
            o51Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = n51Var.animate().alpha(0.0f).withEndAction(new mp0(q51Var, 29));
            TimeInterpolator timeInterpolator = ds.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            o51Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            n51Var.setVisibility(i10);
            if (!z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            o51Var.setVisibility(i11);
        }
        q51Var.h = z12;
        if (z12) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        textView.setOnClickListener(onClickListener);
        q51Var.setClipChildren(z12);
        n51Var.setText(spannableStringBuilder);
        o51Var.setText(spannableStringBuilder);
        if (!z15 && (ea0VarArr == null || ea0VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        o51Var.setTextIsSelectable(z11);
        o51Var.setOnLinkPressListener(y90Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        q51Var.f31837b = z10;
        q51Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean contentsEquals(t61 t61Var, t61 t61Var2) {
        if (TextUtils.equals(t61Var.f32872l, t61Var2.f32872l) && t61Var.f32867f == t61Var2.f32867f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new q51(context, u6Var);
    }

    @Override
    public final boolean equals(t61 t61Var, t61 t61Var2) {
        if (t61Var.d == t61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}

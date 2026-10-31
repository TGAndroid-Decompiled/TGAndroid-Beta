package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class v31 extends z41 {
    static {
        z41.h(new z41());
    }

    public static a51 i(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, o80 o80Var, View.OnClickListener onClickListener2) {
        a51 K = a51.K(v31.class);
        K.d = i10;
        K.f24292l = charSequence;
        K.f24287f = z10;
        K.f24300t = false;
        K.D = onClickListener;
        K.G = o80Var;
        K.E = onClickListener2;
        return K;
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        o80 o80Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        w31 w31Var = (w31) view;
        CharSequence charSequence = a51Var.f24292l;
        boolean z12 = a51Var.f24287f;
        View.OnClickListener onClickListener = a51Var.D;
        Object obj = a51Var.G;
        if (obj != null) {
            o80Var = (o80) obj;
        } else {
            o80Var = null;
        }
        boolean z13 = a51Var.f24300t;
        View.OnClickListener onClickListener2 = a51Var.E;
        ImageView imageView = w31Var.f31983n;
        TextView textView = w31Var.d;
        t31 t31Var = w31Var.f31981c;
        u31 u31Var = w31Var.f31982f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = o5.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        u80[] u80VarArr = (u80[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), u80.class);
        if (u80VarArr != null) {
            int i14 = 0;
            while (i14 < u80VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(u80VarArr[i14]);
                int spanEnd = spannableStringBuilder.getSpanEnd(u80VarArr[i14]);
                boolean z14 = z13;
                spannableStringBuilder.removeSpan(u80VarArr[i14]);
                int i15 = i14;
                u80 u80Var = u80VarArr[i15];
                u80 u80Var2 = new u80(u31Var, u80Var.f30866a, u80Var.d, null);
                u80 u80Var3 = u80VarArr[i15];
                u80Var2.f30869f = u80Var3.f30869f;
                u80Var2.h = u80Var3.h;
                u80Var2.f30870n = u80Var3.f30870n;
                spannableStringBuilder.setSpan(u80Var2, spanStart, spanEnd, 33);
                i14 = i15 + 1;
                z13 = z14;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z15 = z13;
        if (w31Var.h && !z12) {
            t31Var.setVisibility(0);
            u31Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = t31Var.animate().alpha(0.0f).withEndAction(new uo0(w31Var, 26));
            TimeInterpolator timeInterpolator = gr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            u31Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            t31Var.setVisibility(i10);
            if (!z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            u31Var.setVisibility(i11);
        }
        w31Var.h = z12;
        if (z12) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        textView.setOnClickListener(onClickListener);
        w31Var.setClipChildren(z12);
        t31Var.setText(spannableStringBuilder);
        u31Var.setText(spannableStringBuilder);
        if (!z15 && (u80VarArr == null || u80VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        u31Var.setTextIsSelectable(z11);
        u31Var.setOnLinkPressListener(o80Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        w31Var.f31980b = z10;
        w31Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean c(a51 a51Var, a51 a51Var2) {
        if (TextUtils.equals(a51Var.f24292l, a51Var2.f24292l) && a51Var.f24287f == a51Var2.f24287f) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new w31(context, p6Var);
    }

    @Override
    public final boolean e(a51 a51Var, a51 a51Var2) {
        if (a51Var.d == a51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }
}

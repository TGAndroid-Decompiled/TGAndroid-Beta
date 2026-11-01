package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class w31 extends a51 {
    static {
        a51.h(new a51());
    }

    public static b51 i(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, o80 o80Var, View.OnClickListener onClickListener2) {
        b51 K = b51.K(w31.class);
        K.d = i10;
        K.f24643l = charSequence;
        K.f24638f = z10;
        K.f24651t = false;
        K.D = onClickListener;
        K.G = o80Var;
        K.E = onClickListener2;
        return K;
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        o80 o80Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        x31 x31Var = (x31) view;
        CharSequence charSequence = b51Var.f24643l;
        boolean z12 = b51Var.f24638f;
        View.OnClickListener onClickListener = b51Var.D;
        Object obj = b51Var.G;
        if (obj != null) {
            o80Var = (o80) obj;
        } else {
            o80Var = null;
        }
        boolean z13 = b51Var.f24651t;
        View.OnClickListener onClickListener2 = b51Var.E;
        ImageView imageView = x31Var.f32371n;
        TextView textView = x31Var.d;
        u31 u31Var = x31Var.f32369c;
        v31 v31Var = x31Var.f32370f;
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
                u80 u80Var2 = new u80(v31Var, u80Var.f30900a, u80Var.d, null);
                u80 u80Var3 = u80VarArr[i15];
                u80Var2.f30903f = u80Var3.f30903f;
                u80Var2.h = u80Var3.h;
                u80Var2.f30904n = u80Var3.f30904n;
                spannableStringBuilder.setSpan(u80Var2, spanStart, spanEnd, 33);
                i14 = i15 + 1;
                z13 = z14;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z15 = z13;
        if (x31Var.h && !z12) {
            u31Var.setVisibility(0);
            v31Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = u31Var.animate().alpha(0.0f).withEndAction(new vo0(x31Var, 26));
            TimeInterpolator timeInterpolator = gr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            v31Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            u31Var.setVisibility(i10);
            if (!z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            v31Var.setVisibility(i11);
        }
        x31Var.h = z12;
        if (z12) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        textView.setOnClickListener(onClickListener);
        x31Var.setClipChildren(z12);
        u31Var.setText(spannableStringBuilder);
        v31Var.setText(spannableStringBuilder);
        if (!z15 && (u80VarArr == null || u80VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        v31Var.setTextIsSelectable(z11);
        v31Var.setOnLinkPressListener(o80Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        x31Var.f32368b = z10;
        x31Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean c(b51 b51Var, b51 b51Var2) {
        if (TextUtils.equals(b51Var.f24643l, b51Var2.f24643l) && b51Var.f24638f == b51Var2.f24638f) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new x31(context, p6Var);
    }

    @Override
    public final boolean e(b51 b51Var, b51 b51Var2) {
        if (b51Var.d == b51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }
}

package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

public final class k31 extends m41 {
    static {
        m41.setup(new k31());
    }

    public static n41 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, o80 o80Var, View.OnClickListener onClickListener2) {
        n41 n41VarJ = n41.J(k31.class);
        n41VarJ.d = i10;
        n41VarJ.f30844l = charSequence;
        n41VarJ.f30839f = z10;
        n41VarJ.f30852t = false;
        n41VarJ.D = onClickListener;
        n41VarJ.G = o80Var;
        n41VarJ.E = onClickListener2;
        return n41VarJ;
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        l31 l31Var = (l31) view;
        CharSequence charSequence = n41Var.f30844l;
        boolean z11 = n41Var.f30839f;
        View.OnClickListener onClickListener = n41Var.D;
        Object obj = n41Var.G;
        o80 o80Var = obj != null ? (o80) obj : null;
        boolean z12 = n41Var.f30852t;
        View.OnClickListener onClickListener2 = n41Var.E;
        ImageView imageView = l31Var.f30279n;
        TextView textView = l31Var.d;
        i31 i31Var = l31Var.f30276c;
        j31 j31Var = l31Var.f30278f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : t5.cloneSpans(charSequence));
        u80[] u80VarArr = (u80[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), u80.class);
        if (u80VarArr != null) {
            int i10 = 0;
            while (i10 < u80VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(u80VarArr[i10]);
                int spanEnd = spannableStringBuilder.getSpanEnd(u80VarArr[i10]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(u80VarArr[i10]);
                int i11 = i10;
                u80 u80Var = u80VarArr[i11];
                u80 u80Var2 = new u80(j31Var, u80Var.f33013a, u80Var.d, null);
                u80 u80Var3 = u80VarArr[i11];
                u80Var2.f33017f = u80Var3.f33017f;
                u80Var2.h = u80Var3.h;
                u80Var2.f33018n = u80Var3.f33018n;
                spannableStringBuilder.setSpan(u80Var2, spanStart, spanEnd, 33);
                i10 = i11 + 1;
                z12 = z13;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z14 = z12;
        if (!l31Var.h || z11) {
            i31Var.setVisibility(z11 ? 0 : 8);
            j31Var.setVisibility(!z11 ? 0 : 8);
        } else {
            i31Var.setVisibility(0);
            j31Var.setVisibility(0);
            ViewPropertyAnimator viewPropertyAnimatorWithEndAction = i31Var.animate().alpha(0.0f).withEndAction(new up0(l31Var, 23));
            TimeInterpolator timeInterpolator = er.h;
            viewPropertyAnimatorWithEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            j31Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        l31Var.h = z11;
        textView.setVisibility(z11 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        l31Var.setClipChildren(z11);
        i31Var.setText(spannableStringBuilder);
        j31Var.setText(spannableStringBuilder);
        j31Var.setTextIsSelectable(!z14 && (u80VarArr == null || u80VarArr.length == 0));
        j31Var.setOnLinkPressListener(o80Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        l31Var.f30275b = z10;
        l31Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean contentsEquals(n41 n41Var, n41 n41Var2) {
        return TextUtils.equals(n41Var.f30844l, n41Var2.f30844l) && n41Var.f30839f == n41Var2.f30839f;
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new l31(context, c6Var);
    }

    @Override
    public final boolean equals(n41 n41Var, n41 n41Var2) {
        return n41Var.d == n41Var2.d;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}

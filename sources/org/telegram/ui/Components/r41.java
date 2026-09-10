package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class r41 extends u51 {
    static {
        u51.setup(new u51());
    }

    public static v51 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, l90 l90Var, View.OnClickListener onClickListener2) {
        v51 J = v51.J(r41.class);
        J.d = i10;
        J.f27829l = charSequence;
        J.f27824f = z10;
        J.f27837t = false;
        J.D = onClickListener;
        J.G = l90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        l90 l90Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        s41 s41Var = (s41) view;
        CharSequence charSequence = v51Var.f27829l;
        boolean z12 = v51Var.f27824f;
        View.OnClickListener onClickListener = v51Var.D;
        Object obj = v51Var.G;
        if (obj != null) {
            l90Var = (l90) obj;
        } else {
            l90Var = null;
        }
        boolean z13 = v51Var.f27837t;
        View.OnClickListener onClickListener2 = v51Var.E;
        ImageView imageView = s41Var.f26949n;
        TextView textView = s41Var.d;
        p41 p41Var = s41Var.f26947c;
        q41 q41Var = s41Var.f26948f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = y5.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        r90[] r90VarArr = (r90[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), r90.class);
        if (r90VarArr != null) {
            int i14 = 0;
            while (i14 < r90VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(r90VarArr[i14]);
                int spanEnd = spannableStringBuilder.getSpanEnd(r90VarArr[i14]);
                boolean z14 = z13;
                spannableStringBuilder.removeSpan(r90VarArr[i14]);
                int i15 = i14;
                r90 r90Var = r90VarArr[i15];
                r90 r90Var2 = new r90(q41Var, r90Var.f26635a, r90Var.d, null);
                r90 r90Var3 = r90VarArr[i15];
                r90Var2.f26638f = r90Var3.f26638f;
                r90Var2.h = r90Var3.h;
                r90Var2.f26639n = r90Var3.f26639n;
                spannableStringBuilder.setSpan(r90Var2, spanStart, spanEnd, 33);
                i14 = i15 + 1;
                z13 = z14;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z15 = z13;
        if (s41Var.h && !z12) {
            p41Var.setVisibility(0);
            q41Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = p41Var.animate().alpha(0.0f).withEndAction(new uq0(s41Var, 23));
            TimeInterpolator timeInterpolator = wr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            q41Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            p41Var.setVisibility(i10);
            if (!z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            q41Var.setVisibility(i11);
        }
        s41Var.h = z12;
        if (z12) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        textView.setOnClickListener(onClickListener);
        s41Var.setClipChildren(z12);
        p41Var.setText(spannableStringBuilder);
        q41Var.setText(spannableStringBuilder);
        if (!z15 && (r90VarArr == null || r90VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        q41Var.setTextIsSelectable(z11);
        q41Var.setOnLinkPressListener(l90Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        s41Var.f26946b = z10;
        s41Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean contentsEquals(v51 v51Var, v51 v51Var2) {
        if (TextUtils.equals(v51Var.f27829l, v51Var2.f27829l) && v51Var.f27824f == v51Var2.f27824f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new s41(context, f6Var);
    }

    @Override
    public final boolean equals(v51 v51Var, v51 v51Var2) {
        if (v51Var.d == v51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}

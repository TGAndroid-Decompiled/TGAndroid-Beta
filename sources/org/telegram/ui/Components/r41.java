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

    public static v51 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, m90 m90Var, View.OnClickListener onClickListener2) {
        v51 J = v51.J(r41.class);
        J.d = i10;
        J.f29049l = charSequence;
        J.f29044f = z10;
        J.f29057t = false;
        J.D = onClickListener;
        J.G = m90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        m90 m90Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        s41 s41Var = (s41) view;
        CharSequence charSequence = v51Var.f29049l;
        boolean z12 = v51Var.f29044f;
        View.OnClickListener onClickListener = v51Var.D;
        Object obj = v51Var.G;
        if (obj != null) {
            m90Var = (m90) obj;
        } else {
            m90Var = null;
        }
        boolean z13 = v51Var.f29057t;
        View.OnClickListener onClickListener2 = v51Var.E;
        ImageView imageView = s41Var.f28148n;
        TextView textView = s41Var.d;
        p41 p41Var = s41Var.f28146c;
        q41 q41Var = s41Var.f28147f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = z5.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        s90[] s90VarArr = (s90[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), s90.class);
        if (s90VarArr != null) {
            int i14 = 0;
            while (i14 < s90VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(s90VarArr[i14]);
                int spanEnd = spannableStringBuilder.getSpanEnd(s90VarArr[i14]);
                boolean z14 = z13;
                spannableStringBuilder.removeSpan(s90VarArr[i14]);
                int i15 = i14;
                s90 s90Var = s90VarArr[i15];
                s90 s90Var2 = new s90(q41Var, s90Var.f28209a, s90Var.d, null);
                s90 s90Var3 = s90VarArr[i15];
                s90Var2.f28212f = s90Var3.f28212f;
                s90Var2.h = s90Var3.h;
                s90Var2.f28213n = s90Var3.f28213n;
                spannableStringBuilder.setSpan(s90Var2, spanStart, spanEnd, 33);
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
            ViewPropertyAnimator withEndAction = p41Var.animate().alpha(0.0f).withEndAction(new wq0(s41Var, 24));
            TimeInterpolator timeInterpolator = rr.h;
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
        if (!z15 && (s90VarArr == null || s90VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        q41Var.setTextIsSelectable(z11);
        q41Var.setOnLinkPressListener(m90Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        s41Var.f28145b = z10;
        s41Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean contentsEquals(v51 v51Var, v51 v51Var2) {
        if (TextUtils.equals(v51Var.f29049l, v51Var2.f29049l) && v51Var.f29044f == v51Var2.f29044f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new s41(context, d6Var);
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

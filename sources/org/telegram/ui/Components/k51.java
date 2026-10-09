package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class k51 extends o61 {
    static {
        o61.setup(new o61());
    }

    public static p61 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, da0 da0Var, View.OnClickListener onClickListener2) {
        p61 J = p61.J(k51.class);
        J.d = i10;
        J.f29734l = charSequence;
        J.f29729f = z10;
        J.f29742t = false;
        J.D = onClickListener;
        J.G = da0Var;
        J.E = onClickListener2;
        return J;
    }

    @Override
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        da0 da0Var;
        CharSequence cloneSpans;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        l51 l51Var = (l51) view;
        CharSequence charSequence = p61Var.f29734l;
        boolean z12 = p61Var.f29729f;
        View.OnClickListener onClickListener = p61Var.D;
        Object obj = p61Var.G;
        if (obj != null) {
            da0Var = (da0) obj;
        } else {
            da0Var = null;
        }
        boolean z13 = p61Var.f29742t;
        View.OnClickListener onClickListener2 = p61Var.E;
        ImageView imageView = l51Var.f28261n;
        TextView textView = l51Var.d;
        i51 i51Var = l51Var.f28258c;
        j51 j51Var = l51Var.f28260f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = b6.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        ja0[] ja0VarArr = (ja0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ja0.class);
        if (ja0VarArr != null) {
            int i14 = 0;
            while (i14 < ja0VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(ja0VarArr[i14]);
                int spanEnd = spannableStringBuilder.getSpanEnd(ja0VarArr[i14]);
                boolean z14 = z13;
                spannableStringBuilder.removeSpan(ja0VarArr[i14]);
                int i15 = i14;
                ja0 ja0Var = ja0VarArr[i15];
                ja0 ja0Var2 = new ja0(j51Var, ja0Var.f27669a, ja0Var.d, null);
                ja0 ja0Var3 = ja0VarArr[i15];
                ja0Var2.f27673f = ja0Var3.f27673f;
                ja0Var2.h = ja0Var3.h;
                ja0Var2.f27674n = ja0Var3.f27674n;
                spannableStringBuilder.setSpan(ja0Var2, spanStart, spanEnd, 33);
                i14 = i15 + 1;
                z13 = z14;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z15 = z13;
        if (l51Var.h && !z12) {
            i51Var.setVisibility(0);
            j51Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = i51Var.animate().alpha(0.0f).withEndAction(new or0(l51Var, 23));
            TimeInterpolator timeInterpolator = hs.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            j51Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            i51Var.setVisibility(i10);
            if (!z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            j51Var.setVisibility(i11);
        }
        l51Var.h = z12;
        if (z12) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        textView.setOnClickListener(onClickListener);
        l51Var.setClipChildren(z12);
        i51Var.setText(spannableStringBuilder);
        j51Var.setText(spannableStringBuilder);
        if (!z15 && (ja0VarArr == null || ja0VarArr.length == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        j51Var.setTextIsSelectable(z11);
        j51Var.setOnLinkPressListener(da0Var);
        if (onClickListener3 != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(onClickListener3);
        l51Var.f28257b = z10;
        l51Var.setWillNotDraw(true ^ z10);
    }

    @Override
    public final boolean contentsEquals(p61 p61Var, p61 p61Var2) {
        if (TextUtils.equals(p61Var.f29734l, p61Var2.f29734l) && p61Var.f29729f == p61Var2.f29729f) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new l51(context, e6Var);
    }

    @Override
    public final boolean equals(p61 p61Var, p61 p61Var2) {
        if (p61Var.d == p61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}

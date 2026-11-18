package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
public final class i31 extends k41 {
    static {
        k41.h(new k41());
    }

    public static l41 i(int i7, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, j80 j80Var, View.OnClickListener onClickListener2) {
        l41 K = l41.K(i31.class);
        K.d = i7;
        K.f37018m = charSequence;
        K.f37012f = z10;
        K.f37026u = false;
        K.E = onClickListener;
        K.H = j80Var;
        K.F = onClickListener2;
        return K;
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        j80 j80Var;
        CharSequence cloneSpans;
        boolean z11;
        int i7;
        int i10;
        int i11;
        boolean z12;
        int i12;
        ImageView imageView;
        j31 j31Var = (j31) view;
        CharSequence charSequence = l41Var.f37018m;
        boolean z13 = l41Var.f37012f;
        View.OnClickListener onClickListener = l41Var.E;
        Object obj = l41Var.H;
        if (obj != null) {
            j80Var = (j80) obj;
        } else {
            j80Var = null;
        }
        boolean z14 = l41Var.f37026u;
        View.OnClickListener onClickListener2 = l41Var.F;
        ImageView imageView2 = j31Var.f36324n;
        TextView textView = j31Var.d;
        g31 g31Var = j31Var.f36321c;
        h31 h31Var = j31Var.f36323f;
        if (charSequence == null) {
            cloneSpans = "";
        } else {
            cloneSpans = x5.cloneSpans(charSequence);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cloneSpans);
        int i13 = 0;
        p80[] p80VarArr = (p80[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), p80.class);
        if (p80VarArr != null) {
            while (i13 < p80VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(p80VarArr[i13]);
                int spanEnd = spannableStringBuilder.getSpanEnd(p80VarArr[i13]);
                boolean z15 = z14;
                spannableStringBuilder.removeSpan(p80VarArr[i13]);
                int i14 = i13;
                p80 p80Var = p80VarArr[i14];
                View.OnClickListener onClickListener3 = onClickListener2;
                p80 p80Var2 = new p80(h31Var, p80Var.f38315a, p80Var.d, null);
                p80 p80Var3 = p80VarArr[i14];
                p80Var2.f38319f = p80Var3.f38319f;
                p80Var2.h = p80Var3.h;
                p80Var2.f38320n = p80Var3.f38320n;
                if (p80Var3.f38320n && i0.a.h(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, j31Var.f36319a)) > 0.5d) {
                    float max = Math.max(0.05f, p80VarArr[i14].h);
                    imageView = imageView2;
                    p80Var2.a(org.telegram.ui.ActionBar.n6.r1(Math.min(1.0f, 0.07f / max), -1), org.telegram.ui.ActionBar.n6.r1(Math.min(1.0f, 0.115f / max), -1));
                } else {
                    imageView = imageView2;
                }
                spannableStringBuilder.setSpan(p80Var2, spanStart, spanEnd, 33);
                i13 = i14 + 1;
                z14 = z15;
                onClickListener2 = onClickListener3;
                imageView2 = imageView;
            }
        }
        View.OnClickListener onClickListener4 = onClickListener2;
        boolean z16 = z14;
        ImageView imageView3 = imageView2;
        if (j31Var.h && !z13) {
            z11 = 0;
            g31Var.setVisibility(0);
            h31Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = g31Var.animate().alpha(0.0f).withEndAction(new ap0(j31Var, 24));
            TimeInterpolator timeInterpolator = lr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            h31Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        } else {
            z11 = 0;
            if (z13) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            g31Var.setVisibility(i7);
            if (!z13) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            h31Var.setVisibility(i10);
        }
        j31Var.h = z13;
        if (z13) {
            i11 = z11;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
        textView.setOnClickListener(onClickListener);
        j31Var.setClipChildren(z13);
        g31Var.setText(spannableStringBuilder);
        h31Var.setText(spannableStringBuilder);
        if (!z16 && (p80VarArr == null || p80VarArr.length == 0)) {
            z12 = true;
        } else {
            z12 = z11;
        }
        h31Var.setTextIsSelectable(z12);
        h31Var.setOnLinkPressListener(j80Var);
        if (onClickListener4 != null) {
            i12 = z11;
        } else {
            i12 = 8;
        }
        imageView3.setVisibility(i12);
        imageView3.setOnClickListener(onClickListener4);
        j31Var.f36320b = z10;
        j31Var.setWillNotDraw(!z10);
    }

    @Override
    public final boolean c(l41 l41Var, l41 l41Var2) {
        if (TextUtils.equals(l41Var.f37018m, l41Var2.f37018m) && l41Var.f37012f == l41Var2.f37012f) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new j31(context, i6Var);
    }

    @Override
    public final boolean e(l41 l41Var, l41 l41Var2) {
        if (l41Var.d == l41Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }
}

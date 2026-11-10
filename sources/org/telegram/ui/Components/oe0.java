package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public abstract class oe0 extends FrameLayout {
    public final p5 f36596a;
    public final TextView f36597b;
    public final org.telegram.ui.Cells.a2 f36598c;
    public final qe0 d;

    public oe0(qe0 qe0Var, Context context) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        this.d = qe0Var;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27981i5, this, null);
        p5 p5Var = new p5(getContext());
        this.f36596a = p5Var;
        p5Var.setTextSize(1, 14.0f);
        p5Var.setTypeface(org.telegram.messenger.g0.o());
        int i15 = org.telegram.ui.ActionBar.m6.f27929f7;
        org.telegram.ui.ActionBar.t6.U(p5Var, i15, null);
        p5Var.setSingleLine(true);
        p5Var.setEllipsize(TextUtils.TruncateAt.END);
        if (org.telegram.messenger.id.f23161a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        p5Var.setGravity(i7 | 16);
        TextView textView = new TextView(getContext());
        this.f36597b = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(textView, i15, null);
        if (org.telegram.messenger.id.f23161a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(this, getContext(), 1);
        this.f36598c = a2Var;
        a2Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.t6.Y(a2Var, i15, null);
        if (org.telegram.messenger.id.f23161a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        a2Var.setGravity(i11);
        a2Var.setOnClickListener(new la0(this, 5));
        boolean z9 = org.telegram.messenger.id.f23161a0;
        if (z9) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i16 = i12 | 48;
        if (z9) {
            i13 = 0;
        } else {
            i13 = 16;
        }
        addView(p5Var, c8.ha.d(-2, -1.0f, i16, i13, 0.0f, z9 ? 16 : 0, 0.0f));
        if (org.telegram.messenger.id.f23161a0) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        addView(textView, c8.ha.d(-2, -1.0f, i14 | 48, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(a2Var, c8.ha.d(-2, -1.0f, (org.telegram.messenger.id.f23161a0 ? 3 : 5) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void a(String str, ArrayList arrayList, int i7, int i10, int i11, boolean z9) {
        SpannableStringBuilder spannableStringBuilder;
        p5 p5Var = this.f36596a;
        if (arrayList != null) {
            org.telegram.messenger.qs.i(p5Var);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
            org.telegram.messenger.ui.g(arrayList, str, spannableStringBuilder2, -1);
            CharSequence m10 = org.telegram.messenger.i6.m(spannableStringBuilder2, p5Var.getPaint().getFontMetricsInt(), false, null, 0);
            org.telegram.messenger.ij.B5(m10, arrayList, p5Var.getPaint().getFontMetricsInt(), false);
            p5Var.setText(m10);
        } else {
            p5Var.setText(org.telegram.messenger.i6.m(str, p5Var.getPaint().getFontMetricsInt(), false, null, 0));
        }
        String format = String.format("%d", Integer.valueOf(i7));
        if (org.telegram.messenger.id.f23161a0) {
            spannableStringBuilder = new SpannableStringBuilder(com.google.android.recaptcha.internal.a.i(i7, "% – "));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(jg.g.k(i7, " – ", "%"));
        }
        spannableStringBuilder.setSpan(new u31(org.telegram.messenger.g0.o()), 3, format.length() + 3, 33);
        this.f36597b.setText(spannableStringBuilder);
        org.telegram.ui.Cells.a2 a2Var = this.f36598c;
        if (i11 == 0) {
            if (this.d.f37281s1.quiz) {
                a2Var.c(org.telegram.messenger.id.G(i10, "Answer", new Object[0]), z9, true);
            } else {
                a2Var.c(org.telegram.messenger.id.G(i10, "Vote", new Object[0]), z9, true);
            }
        } else if (i11 == 1) {
            a2Var.c(org.telegram.messenger.id.M0(2131747171, null), z9, true);
        } else {
            a2Var.c(org.telegram.messenger.id.M0(2131747175, null), z9, true);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        boolean z10 = org.telegram.messenger.id.f23161a0;
        p5 p5Var = this.f36596a;
        TextView textView = this.f36597b;
        if (z10) {
            int left = p5Var.getLeft() - textView.getMeasuredWidth();
            textView.layout(left, textView.getTop(), textView.getMeasuredWidth() + left, textView.getBottom());
            return;
        }
        int right = p5Var.getRight();
        textView.layout(right, textView.getTop(), textView.getMeasuredWidth() + right, textView.getBottom());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824);
        TextView textView = this.f36597b;
        measureChildWithMargins(textView, i7, 0, makeMeasureSpec, 0);
        org.telegram.ui.Cells.a2 a2Var = this.f36598c;
        measureChildWithMargins(a2Var, i7, 0, makeMeasureSpec, 0);
        int measuredWidth = a2Var.getMeasuredWidth() + textView.getMeasuredWidth();
        measureChildWithMargins(this.f36596a, i7, org.telegram.messenger.g0.L(32.0f) + measuredWidth, makeMeasureSpec, 0);
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(32.0f));
    }
}

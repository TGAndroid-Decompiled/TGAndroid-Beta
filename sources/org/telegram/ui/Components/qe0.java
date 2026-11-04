package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public abstract class qe0 extends FrameLayout {
    public final o5 f37451a;
    public final TextView f37452b;
    public final org.telegram.ui.Cells.a2 f37453c;
    public final se0 d;

    public qe0(se0 se0Var, Context context) {
        super(context);
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        this.d = se0Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27971i5, this, null);
        o5 o5Var = new o5(getContext());
        this.f37451a = o5Var;
        o5Var.setTextSize(1, 14.0f);
        o5Var.setTypeface(org.telegram.messenger.g0.o());
        int i15 = org.telegram.ui.ActionBar.k6.f27918f7;
        org.telegram.ui.ActionBar.r6.V(o5Var, i15, null);
        o5Var.setSingleLine(true);
        o5Var.setEllipsize(TextUtils.TruncateAt.END);
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        o5Var.setGravity(i3 | 16);
        TextView textView = new TextView(getContext());
        this.f37452b = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i15, null);
        if (org.telegram.messenger.bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(this, getContext(), 1);
        this.f37453c = a2Var;
        a2Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.r6.Z(a2Var, i15, null);
        if (org.telegram.messenger.bd.f21784a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        a2Var.setGravity(i11);
        a2Var.setOnClickListener(new ga0(this, 6));
        boolean z10 = org.telegram.messenger.bd.f21784a0;
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i16 = i12 | 48;
        if (z10) {
            i13 = 0;
        } else {
            i13 = 16;
        }
        addView(o5Var, b8.mf.d(-2, -1.0f, i16, i13, 0.0f, z10 ? 16 : 0, 0.0f));
        if (org.telegram.messenger.bd.f21784a0) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        addView(textView, b8.mf.d(-2, -1.0f, i14 | 48, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(a2Var, b8.mf.d(-2, -1.0f, (org.telegram.messenger.bd.f21784a0 ? 3 : 5) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void a(String str, ArrayList arrayList, int i3, int i10, int i11, boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        o5 o5Var = this.f37451a;
        if (arrayList != null) {
            org.telegram.messenger.hs.i(o5Var);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
            org.telegram.messenger.li.g(arrayList, str, spannableStringBuilder2, -1);
            CharSequence m10 = org.telegram.messenger.i6.m(spannableStringBuilder2, o5Var.getPaint().getFontMetricsInt(), false, null, 0);
            org.telegram.messenger.zi.C5(m10, arrayList, o5Var.getPaint().getFontMetricsInt(), false);
            o5Var.setText(m10);
        } else {
            o5Var.setText(org.telegram.messenger.i6.m(str, o5Var.getPaint().getFontMetricsInt(), false, null, 0));
        }
        String format = String.format("%d", Integer.valueOf(i3));
        if (org.telegram.messenger.bd.f21784a0) {
            spannableStringBuilder = new SpannableStringBuilder(com.google.android.recaptcha.internal.a.h(i3, "% – "));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(k2.p1.j(i3, " – ", "%"));
        }
        spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o()), 3, format.length() + 3, 33);
        this.f37452b.setText(spannableStringBuilder);
        org.telegram.ui.Cells.a2 a2Var = this.f37453c;
        if (i11 == 0) {
            if (this.d.f37994q1.quiz) {
                a2Var.c(org.telegram.messenger.bd.G(i10, "Answer", new Object[0]), z10, true);
            } else {
                a2Var.c(org.telegram.messenger.bd.G(i10, "Vote", new Object[0]), z10, true);
            }
        } else if (i11 == 1) {
            a2Var.c(org.telegram.messenger.bd.M0(2131747179, null), z10, true);
        } else {
            a2Var.c(org.telegram.messenger.bd.M0(2131747183, null), z10, true);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        boolean z11 = org.telegram.messenger.bd.f21784a0;
        o5 o5Var = this.f37451a;
        TextView textView = this.f37452b;
        if (z11) {
            int left = o5Var.getLeft() - textView.getMeasuredWidth();
            textView.layout(left, textView.getTop(), textView.getMeasuredWidth() + left, textView.getBottom());
            return;
        }
        int right = o5Var.getRight();
        textView.layout(right, textView.getTop(), textView.getMeasuredWidth() + right, textView.getBottom());
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824);
        TextView textView = this.f37452b;
        measureChildWithMargins(textView, i3, 0, makeMeasureSpec, 0);
        org.telegram.ui.Cells.a2 a2Var = this.f37453c;
        measureChildWithMargins(a2Var, i3, 0, makeMeasureSpec, 0);
        int measuredWidth = a2Var.getMeasuredWidth() + textView.getMeasuredWidth();
        measureChildWithMargins(this.f37451a, i3, org.telegram.messenger.g0.L(32.0f) + measuredWidth, makeMeasureSpec, 0);
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(32.0f));
    }
}

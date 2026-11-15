package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public abstract class re0 extends FrameLayout {
    public final o5 f38958a;
    public final TextView f38959b;
    public final org.telegram.ui.Cells.a2 f38960c;
    public final te0 d;

    public re0(te0 te0Var, Context context) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        this.d = te0Var;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28940i5, this, null);
        o5 o5Var = new o5(getContext());
        this.f38958a = o5Var;
        o5Var.setTextSize(1, 14.0f);
        o5Var.setTypeface(org.telegram.messenger.g0.o());
        int i15 = org.telegram.ui.ActionBar.j6.f28888f7;
        org.telegram.ui.ActionBar.q6.U(o5Var, i15, null);
        o5Var.setSingleLine(true);
        o5Var.setEllipsize(TextUtils.TruncateAt.END);
        if (org.telegram.messenger.hd.f24101a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        o5Var.setGravity(i7 | 16);
        TextView textView = new TextView(getContext());
        this.f38959b = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(textView, i15, null);
        if (org.telegram.messenger.hd.f24101a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(this, getContext(), 1);
        this.f38960c = a2Var;
        a2Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.q6.Y(a2Var, i15, null);
        if (org.telegram.messenger.hd.f24101a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        a2Var.setGravity(i11);
        a2Var.setOnClickListener(new y60(this, 6));
        boolean z10 = org.telegram.messenger.hd.f24101a0;
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
        addView(o5Var, c8.ja.d(-2, -1.0f, i16, i13, 0.0f, z10 ? 16 : 0, 0.0f));
        if (org.telegram.messenger.hd.f24101a0) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        addView(textView, c8.ja.d(-2, -1.0f, i14 | 48, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(a2Var, c8.ja.d(-2, -1.0f, (org.telegram.messenger.hd.f24101a0 ? 3 : 5) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void a(String str, ArrayList arrayList, int i7, int i10, int i11, boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        o5 o5Var = this.f38958a;
        if (arrayList != null) {
            org.telegram.messenger.ns.i(o5Var);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
            org.telegram.messenger.si.g(arrayList, str, spannableStringBuilder2, -1);
            CharSequence m10 = org.telegram.messenger.j6.m(spannableStringBuilder2, o5Var.getPaint().getFontMetricsInt(), false, null, 0);
            org.telegram.messenger.gj.B5(m10, arrayList, o5Var.getPaint().getFontMetricsInt(), false);
            o5Var.setText(m10);
        } else {
            o5Var.setText(org.telegram.messenger.j6.m(str, o5Var.getPaint().getFontMetricsInt(), false, null, 0));
        }
        String format = String.format("%d", Integer.valueOf(i7));
        if (org.telegram.messenger.hd.f24101a0) {
            spannableStringBuilder = new SpannableStringBuilder(com.google.android.gms.internal.vision.e2.i(i7, "% – "));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(i5.c.j(i7, " – ", "%"));
        }
        spannableStringBuilder.setSpan(new y31(org.telegram.messenger.g0.o()), 3, format.length() + 3, 33);
        this.f38959b.setText(spannableStringBuilder);
        org.telegram.ui.Cells.a2 a2Var = this.f38960c;
        if (i11 == 0) {
            if (this.d.f39686t1.quiz) {
                a2Var.c(org.telegram.messenger.hd.G(i10, "Answer", new Object[0]), z10, true);
            } else {
                a2Var.c(org.telegram.messenger.hd.G(i10, "Vote", new Object[0]), z10, true);
            }
        } else if (i11 == 1) {
            a2Var.c(org.telegram.messenger.hd.M0(2131747171, null), z10, true);
        } else {
            a2Var.c(org.telegram.messenger.hd.M0(2131747175, null), z10, true);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        boolean z11 = org.telegram.messenger.hd.f24101a0;
        o5 o5Var = this.f38958a;
        TextView textView = this.f38959b;
        if (z11) {
            int left = o5Var.getLeft() - textView.getMeasuredWidth();
            textView.layout(left, textView.getTop(), textView.getMeasuredWidth() + left, textView.getBottom());
            return;
        }
        int right = o5Var.getRight();
        textView.layout(right, textView.getTop(), textView.getMeasuredWidth() + right, textView.getBottom());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824);
        TextView textView = this.f38959b;
        measureChildWithMargins(textView, i7, 0, makeMeasureSpec, 0);
        org.telegram.ui.Cells.a2 a2Var = this.f38960c;
        measureChildWithMargins(a2Var, i7, 0, makeMeasureSpec, 0);
        int measuredWidth = a2Var.getMeasuredWidth() + textView.getMeasuredWidth();
        measureChildWithMargins(this.f38958a, i7, org.telegram.messenger.g0.L(32.0f) + measuredWidth, makeMeasureSpec, 0);
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(32.0f));
    }
}

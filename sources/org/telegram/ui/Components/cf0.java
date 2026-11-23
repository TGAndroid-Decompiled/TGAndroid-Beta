package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public abstract class cf0 extends FrameLayout {
    public final w5 f34046a;
    public final TextView f34047b;
    public final org.telegram.ui.Cells.b2 f34048c;
    public final ef0 d;

    public cf0(ef0 ef0Var, Context context) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        this.d = ef0Var;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29542i5, this, null);
        w5 w5Var = new w5(getContext());
        this.f34046a = w5Var;
        w5Var.setTextSize(1, 14.0f);
        w5Var.setTypeface(org.telegram.messenger.g0.o());
        int i15 = org.telegram.ui.ActionBar.n6.f29490f7;
        org.telegram.ui.ActionBar.u6.U(w5Var, i15, null);
        w5Var.setSingleLine(true);
        w5Var.setEllipsize(TextUtils.TruncateAt.END);
        if (org.telegram.messenger.gd.f24314a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        w5Var.setGravity(i7 | 16);
        TextView textView = new TextView(getContext());
        this.f34047b = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView, i15, null);
        if (org.telegram.messenger.gd.f24314a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(this, getContext(), 1);
        this.f34048c = b2Var;
        b2Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.u6.Y(b2Var, i15, null);
        if (org.telegram.messenger.gd.f24314a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        b2Var.setGravity(i11);
        b2Var.setOnClickListener(new g70(this, 8));
        boolean z10 = org.telegram.messenger.gd.f24314a0;
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
        addView(w5Var, c8.na.d(-2, -1.0f, i16, i13, 0.0f, z10 ? 16 : 0, 0.0f));
        if (org.telegram.messenger.gd.f24314a0) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        addView(textView, c8.na.d(-2, -1.0f, i14 | 48, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(b2Var, c8.na.d(-2, -1.0f, (org.telegram.messenger.gd.f24314a0 ? 3 : 5) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void a(String str, ArrayList arrayList, int i7, int i10, int i11, boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        w5 w5Var = this.f34046a;
        if (arrayList != null) {
            org.telegram.messenger.ks.i(w5Var);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
            org.telegram.messenger.ri.g(arrayList, str, spannableStringBuilder2, -1);
            CharSequence m10 = org.telegram.messenger.j6.m(spannableStringBuilder2, w5Var.getPaint().getFontMetricsInt(), false, null, 0);
            org.telegram.messenger.fj.B5(m10, arrayList, w5Var.getPaint().getFontMetricsInt(), false);
            w5Var.setText(m10);
        } else {
            w5Var.setText(org.telegram.messenger.j6.m(str, w5Var.getPaint().getFontMetricsInt(), false, null, 0));
        }
        String format = String.format("%d", Integer.valueOf(i7));
        if (org.telegram.messenger.gd.f24314a0) {
            spannableStringBuilder = new SpannableStringBuilder(com.google.android.gms.internal.vision.e2.i(i7, "% – "));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(i5.c.j(i7, " – ", "%"));
        }
        spannableStringBuilder.setSpan(new k41(org.telegram.messenger.g0.o()), 3, format.length() + 3, 33);
        this.f34047b.setText(spannableStringBuilder);
        org.telegram.ui.Cells.b2 b2Var = this.f34048c;
        if (i11 == 0) {
            if (this.d.f34708t1.quiz) {
                b2Var.c(org.telegram.messenger.gd.G(i10, "Answer", new Object[0]), z10, true);
            } else {
                b2Var.c(org.telegram.messenger.gd.G(i10, "Vote", new Object[0]), z10, true);
            }
        } else if (i11 == 1) {
            b2Var.c(org.telegram.messenger.gd.N0(2131746977, null), z10, true);
        } else {
            b2Var.c(org.telegram.messenger.gd.N0(2131746981, null), z10, true);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        boolean z11 = org.telegram.messenger.gd.f24314a0;
        w5 w5Var = this.f34046a;
        TextView textView = this.f34047b;
        if (z11) {
            int left = w5Var.getLeft() - textView.getMeasuredWidth();
            textView.layout(left, textView.getTop(), textView.getMeasuredWidth() + left, textView.getBottom());
            return;
        }
        int right = w5Var.getRight();
        textView.layout(right, textView.getTop(), textView.getMeasuredWidth() + right, textView.getBottom());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824);
        TextView textView = this.f34047b;
        measureChildWithMargins(textView, i7, 0, makeMeasureSpec, 0);
        org.telegram.ui.Cells.b2 b2Var = this.f34048c;
        measureChildWithMargins(b2Var, i7, 0, makeMeasureSpec, 0);
        int measuredWidth = b2Var.getMeasuredWidth() + textView.getMeasuredWidth();
        measureChildWithMargins(this.f34046a, i7, org.telegram.messenger.g0.L(32.0f) + measuredWidth, makeMeasureSpec, 0);
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(32.0f));
    }
}

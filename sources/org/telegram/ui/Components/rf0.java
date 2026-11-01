package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public abstract class rf0 extends FrameLayout {
    public final n5 f29982a;
    public final TextView f29983b;
    public final org.telegram.ui.Cells.a2 f29984c;
    public final tf0 d;

    public rf0(tf0 tf0Var, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.d = tf0Var;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21020i5, this, null);
        n5 n5Var = new n5(getContext());
        this.f29982a = n5Var;
        n5Var.setTextSize(1, 14.0f);
        n5Var.setTypeface(org.telegram.messenger.i0.o());
        int i16 = org.telegram.ui.ActionBar.t6.f7;
        org.telegram.ui.ActionBar.a7.V(n5Var, i16, null);
        n5Var.setSingleLine(true);
        n5Var.setEllipsize(TextUtils.TruncateAt.END);
        if (org.telegram.messenger.dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        n5Var.setGravity(i10 | 16);
        TextView textView = new TextView(getContext());
        this.f29983b = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView, i16, null);
        if (org.telegram.messenger.dd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11 | 16);
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(this, getContext(), 1);
        this.f29984c = a2Var;
        a2Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
        org.telegram.ui.ActionBar.a7.Z(a2Var, i16, null);
        if (org.telegram.messenger.dd.X) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        a2Var.setGravity(i12);
        a2Var.setOnClickListener(new db0(this, 6));
        boolean z10 = org.telegram.messenger.dd.X;
        if (z10) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i17 = i13 | 48;
        if (z10) {
            i14 = 0;
        } else {
            i14 = 16;
        }
        addView(n5Var, w7.b6.d(-2, -1.0f, i17, i14, 0.0f, z10 ? 16 : 0, 0.0f));
        if (org.telegram.messenger.dd.X) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        addView(textView, w7.b6.d(-2, -1.0f, i15 | 48, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(a2Var, w7.b6.d(-2, -1.0f, (org.telegram.messenger.dd.X ? 3 : 5) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void a(String str, ArrayList arrayList, int i10, int i11, int i12, boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        n5 n5Var = this.f29982a;
        if (arrayList != null) {
            org.telegram.messenger.at.i(n5Var);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
            org.telegram.messenger.vi.g(arrayList, str, spannableStringBuilder2, -1);
            CharSequence m10 = org.telegram.messenger.k6.m(spannableStringBuilder2, n5Var.getPaint().getFontMetricsInt(), false, null, 0);
            org.telegram.messenger.kj.A5(m10, arrayList, n5Var.getPaint().getFontMetricsInt(), false);
            n5Var.setText(m10);
        } else {
            n5Var.setText(org.telegram.messenger.k6.m(str, n5Var.getPaint().getFontMetricsInt(), false, null, 0));
        }
        String format = String.format("%d", Integer.valueOf(i10));
        if (org.telegram.messenger.dd.X) {
            spannableStringBuilder = new SpannableStringBuilder(a1.g.k(i10, "% – "));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(i0.a.j(i10, " – ", "%"));
        }
        spannableStringBuilder.setSpan(new y41(org.telegram.messenger.i0.o()), 3, format.length() + 3, 33);
        this.f29983b.setText(spannableStringBuilder);
        org.telegram.ui.Cells.a2 a2Var = this.f29984c;
        if (i12 == 0) {
            if (this.d.f30641p1.quiz) {
                a2Var.c(org.telegram.messenger.dd.G(i11, "Answer", new Object[0]), z10, true);
            } else {
                a2Var.c(org.telegram.messenger.dd.G(i11, "Vote", new Object[0]), z10, true);
            }
        } else if (i12 == 1) {
            a2Var.c(org.telegram.messenger.dd.L0(2131747186, null), z10, true);
        } else {
            a2Var.c(org.telegram.messenger.dd.L0(2131747190, null), z10, true);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = org.telegram.messenger.dd.X;
        n5 n5Var = this.f29982a;
        TextView textView = this.f29983b;
        if (z11) {
            int left = n5Var.getLeft() - textView.getMeasuredWidth();
            textView.layout(left, textView.getTop(), textView.getMeasuredWidth() + left, textView.getBottom());
            return;
        }
        int right = n5Var.getRight();
        textView.layout(right, textView.getTop(), textView.getMeasuredWidth() + right, textView.getBottom());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), 1073741824);
        TextView textView = this.f29983b;
        measureChildWithMargins(textView, i10, 0, makeMeasureSpec, 0);
        org.telegram.ui.Cells.a2 a2Var = this.f29984c;
        measureChildWithMargins(a2Var, i10, 0, makeMeasureSpec, 0);
        int measuredWidth = a2Var.getMeasuredWidth() + textView.getMeasuredWidth();
        measureChildWithMargins(this.f29982a, i10, org.telegram.messenger.i0.L(32.0f) + measuredWidth, makeMeasureSpec, 0);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(32.0f));
    }
}

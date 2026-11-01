package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class ws0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 f32305a;
    public final org.telegram.ui.Cells.k6 f32306b;
    public final View f32307c;

    public ws0(int i10, Context context, boolean z10, org.telegram.ui.ActionBar.p6 p6Var, vo0 vo0Var) {
        super(context);
        int i11;
        int i12;
        this.f32305a = p6Var;
        org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, p6Var);
        this.f32306b = k6Var;
        int i13 = org.telegram.ui.ActionBar.t6.f21021i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i13, p6Var), 2, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
        k6Var.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(k6Var, h02, null, N, p6Var);
        addView(k6Var, w7.b6.c(-2.0f, -1));
        View view = new View(context);
        this.f32307c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i14 = org.telegram.ui.ActionBar.t6.f20930d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.t6.r1(0.4f, org.telegram.ui.ActionBar.t6.w0(i14, p6Var)), org.telegram.ui.ActionBar.t6.w0(i14, p6Var)}));
        addView(view, w7.b6.c(60.0f, -1));
        vh.d dVar = new vh.d(context, p6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z10) {
            i11 = 2131748344;
        } else {
            i11 = 2131748342;
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.dd.L0(i11, null));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new dq(2131232241, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        dVar.i(spannableStringBuilder, false, true);
        addView(dVar, w7.b6.d(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
        dVar.setOnClickListener(new db0(vo0Var, 14));
        p80 p80Var = new p80(context, p6Var);
        p80Var.setTextSize(1, 13.0f);
        p80Var.setTextAlignment(4);
        p80Var.setGravity(17);
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.f21116n6, p6Var);
        p80Var.setLineSpacing(org.telegram.messenger.i0.L(3.0f), 1.0f);
        if (z10) {
            i12 = 2131748343;
        } else {
            i12 = 2131748341;
        }
        SpannableStringBuilder x22 = org.telegram.messenger.i0.x2(org.telegram.messenger.dd.L0(i12, null), new vo0(vo0Var, 6));
        SpannableString spannableString2 = new SpannableString("" + org.telegram.messenger.wp.r1(i10).f19297y4);
        spannableString2.setSpan(new y41(org.telegram.messenger.i0.o()), 0, spannableString2.length(), 33);
        p80Var.setText(org.telegram.messenger.i0.J2(x22, spannableString2, "%s"));
        addView(p80Var, w7.b6.d(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d6));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(145.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.p6 p6Var = this.f32305a;
        View view = this.f32307c;
        if (view != null) {
            try {
                if (view.getBackground() instanceof GradientDrawable) {
                    int i10 = org.telegram.ui.ActionBar.t6.f20930d6;
                    ((GradientDrawable) view.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.t6.r1(0.4f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var)), org.telegram.ui.ActionBar.t6.w0(i10, p6Var)});
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }
}

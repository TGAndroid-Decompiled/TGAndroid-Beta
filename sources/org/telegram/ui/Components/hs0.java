package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class hs0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 f35967a;
    public final org.telegram.ui.Cells.h6 f35968b;
    public final View f35969c;

    public hs0(int i7, Context context, boolean z10, org.telegram.ui.ActionBar.h6 h6Var, cp0 cp0Var) {
        super(context);
        int i10;
        int i11;
        this.f35967a = h6Var;
        org.telegram.ui.Cells.h6 h6Var2 = new org.telegram.ui.Cells.h6(context, h6Var);
        this.f35968b = h6Var2;
        int i12 = org.telegram.ui.ActionBar.m6.f29470i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i12, h6Var), 2, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i12);
        h6Var2.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(h6Var2, h02, null, M, h6Var);
        addView(h6Var2, c8.ma.c(-2.0f, -1));
        View view = new View(context);
        this.f35969c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i13 = org.telegram.ui.ActionBar.m6.f29378d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.m6.r1(0.4f, org.telegram.ui.ActionBar.m6.w0(i13, h6Var)), org.telegram.ui.ActionBar.m6.w0(i13, h6Var)}));
        addView(view, c8.ma.c(60.0f, -1));
        hi.e eVar = new hi.e(context, h6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z10) {
            i10 = 2131748136;
        } else {
            i10 = 2131748134;
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(i10, null));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new nq(2131232244, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        eVar.i(spannableStringBuilder, false, true);
        addView(eVar, c8.ma.d(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
        eVar.setOnClickListener(new j70(cp0Var, 16));
        m80 m80Var = new m80(context, h6Var);
        m80Var.setTextSize(1, 13.0f);
        m80Var.setTextAlignment(4);
        m80Var.setGravity(17);
        org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.G6, h6Var);
        org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.f29560n6, h6Var);
        m80Var.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
        if (z10) {
            i11 = 2131748135;
        } else {
            i11 = 2131748133;
        }
        SpannableStringBuilder x22 = org.telegram.messenger.g0.x2(org.telegram.messenger.gd.N0(i11, null), new cp0(cp0Var, 4));
        SpannableString spannableString2 = new SpannableString("" + org.telegram.messenger.mp.u1(i7).A4);
        spannableString2.setSpan(new l41(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
        m80Var.setText(org.telegram.messenger.g0.K2(x22, spannableString2, "%s"));
        addView(m80Var, c8.ma.d(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29378d6));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(145.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.h6 h6Var = this.f35967a;
        View view = this.f35969c;
        if (view != null) {
            try {
                if (view.getBackground() instanceof GradientDrawable) {
                    int i7 = org.telegram.ui.ActionBar.m6.f29378d6;
                    ((GradientDrawable) view.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.m6.r1(0.4f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var)), org.telegram.ui.ActionBar.m6.w0(i7, h6Var)});
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}

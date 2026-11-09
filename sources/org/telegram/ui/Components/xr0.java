package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class xr0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f40474a;
    public final org.telegram.ui.Cells.g6 f40475b;
    public final View f40476c;

    public xr0(int i7, Context context, boolean z9, org.telegram.ui.ActionBar.g6 g6Var, kr0 kr0Var) {
        super(context);
        int i10;
        int i11;
        this.f40474a = g6Var;
        org.telegram.ui.Cells.g6 g6Var2 = new org.telegram.ui.Cells.g6(context, g6Var);
        this.f40475b = g6Var2;
        int i12 = org.telegram.ui.ActionBar.l6.f27957i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(i12, g6Var), 2, -1);
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i12);
        g6Var2.setBackground(h02);
        org.telegram.ui.ActionBar.s6.j(g6Var2, h02, null, M, g6Var);
        addView(g6Var2, c8.ha.c(-2.0f, -1));
        View view = new View(context);
        this.f40476c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i13 = org.telegram.ui.ActionBar.l6.f27865d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.l6.r1(0.4f, org.telegram.ui.ActionBar.l6.w0(i13, g6Var)), org.telegram.ui.ActionBar.l6.w0(i13, g6Var)}));
        addView(view, c8.ha.c(60.0f, -1));
        fi.d dVar = new fi.d(context, g6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z9) {
            i10 = 2131748329;
        } else {
            i10 = 2131748327;
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(i10, null));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new wp(2131232242, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        dVar.i(spannableStringBuilder, false, true);
        addView(dVar, c8.ha.d(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
        dVar.setOnClickListener(new ma0(kr0Var, 13));
        x70 x70Var = new x70(context, g6Var);
        x70Var.setTextSize(1, 13.0f);
        x70Var.setTextAlignment(4);
        x70Var.setGravity(17);
        org.telegram.ui.ActionBar.s6.U(x70Var, org.telegram.ui.ActionBar.l6.G6, g6Var);
        org.telegram.ui.ActionBar.s6.G(x70Var, org.telegram.ui.ActionBar.l6.f28047n6, g6Var);
        x70Var.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
        if (z9) {
            i11 = 2131748328;
        } else {
            i11 = 2131748326;
        }
        SpannableStringBuilder x22 = org.telegram.messenger.g0.x2(org.telegram.messenger.id.M0(i11, null), new kr0(kr0Var, 1));
        SpannableString spannableString2 = new SpannableString("" + org.telegram.messenger.qp.s1(i7).f24939x4);
        spannableString2.setSpan(new v31(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
        x70Var.setText(org.telegram.messenger.g0.K2(x22, spannableString2, "%s"));
        addView(x70Var, c8.ha.d(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27865d6));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(145.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.g6 g6Var = this.f40474a;
        View view = this.f40476c;
        if (view != null) {
            try {
                if (view.getBackground() instanceof GradientDrawable) {
                    int i7 = org.telegram.ui.ActionBar.l6.f27865d6;
                    ((GradientDrawable) view.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.l6.r1(0.4f, org.telegram.ui.ActionBar.l6.w0(i7, g6Var)), org.telegram.ui.ActionBar.l6.w0(i7, g6Var)});
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class vr0 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f39715a;
    public final org.telegram.ui.Cells.g6 f39716b;
    public final View f39717c;

    public vr0(int i7, Context context, boolean z9, org.telegram.ui.ActionBar.f6 f6Var, ir0 ir0Var) {
        super(context);
        int i10;
        int i11;
        this.f39715a = f6Var;
        org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, f6Var);
        this.f39716b = g6Var;
        int i12 = org.telegram.ui.ActionBar.k6.f27944i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i12, f6Var), 2, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
        g6Var.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(g6Var, h02, null, N, f6Var);
        addView(g6Var, c8.ha.c(-2.0f, -1));
        View view = new View(context);
        this.f39717c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i13 = org.telegram.ui.ActionBar.k6.f27852d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.k6.r1(0.4f, org.telegram.ui.ActionBar.k6.w0(i13, f6Var)), org.telegram.ui.ActionBar.k6.w0(i13, f6Var)}));
        addView(view, c8.ha.c(60.0f, -1));
        fi.d dVar = new fi.d(context, f6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z9) {
            i10 = 2131748330;
        } else {
            i10 = 2131748328;
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(i10, null));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new wp(2131232242, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        dVar.i(spannableStringBuilder, false, true);
        addView(dVar, c8.ha.d(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
        dVar.setOnClickListener(new la0(ir0Var, 13));
        w70 w70Var = new w70(context, f6Var);
        w70Var.setTextSize(1, 13.0f);
        w70Var.setTextAlignment(4);
        w70Var.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.G6, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.f28034n6, f6Var);
        w70Var.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
        if (z9) {
            i11 = 2131748329;
        } else {
            i11 = 2131748327;
        }
        SpannableStringBuilder x22 = org.telegram.messenger.g0.x2(org.telegram.messenger.id.M0(i11, null), new ir0(ir0Var, 1));
        SpannableString spannableString2 = new SpannableString("" + org.telegram.messenger.qp.s1(i7).f24939x4);
        spannableString2.setSpan(new u31(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
        w70Var.setText(org.telegram.messenger.g0.K2(x22, spannableString2, "%s"));
        addView(w70Var, c8.ha.d(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27852d6));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(145.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.f6 f6Var = this.f39715a;
        View view = this.f39717c;
        if (view != null) {
            try {
                if (view.getBackground() instanceof GradientDrawable) {
                    int i7 = org.telegram.ui.ActionBar.k6.f27852d6;
                    ((GradientDrawable) view.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.k6.r1(0.4f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var)), org.telegram.ui.ActionBar.k6.w0(i7, f6Var)});
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}

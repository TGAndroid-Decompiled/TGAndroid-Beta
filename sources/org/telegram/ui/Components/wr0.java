package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class wr0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f41426a;
    public final org.telegram.ui.Cells.f6 f41427b;
    public final View f41428c;

    public wr0(int i7, Context context, boolean z10, org.telegram.ui.ActionBar.e6 e6Var, ro0 ro0Var) {
        super(context);
        int i10;
        int i11;
        this.f41426a = e6Var;
        org.telegram.ui.Cells.f6 f6Var = new org.telegram.ui.Cells.f6(context, e6Var);
        this.f41427b = f6Var;
        int i12 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i12, e6Var), 2, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i12);
        f6Var.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(f6Var, h02, null, M, e6Var);
        addView(f6Var, c8.ja.c(-2.0f, -1));
        View view = new View(context);
        this.f41428c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i13 = org.telegram.ui.ActionBar.j6.f28849d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.j6.r1(0.4f, org.telegram.ui.ActionBar.j6.w0(i13, e6Var)), org.telegram.ui.ActionBar.j6.w0(i13, e6Var)}));
        addView(view, c8.ja.c(60.0f, -1));
        hi.d dVar = new hi.d(context, e6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z10) {
            i10 = 2131748329;
        } else {
            i10 = 2131748327;
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(i10, null));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new eq(2131232243, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        dVar.i(spannableStringBuilder, false, true);
        addView(dVar, c8.ja.d(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
        dVar.setOnClickListener(new y60(ro0Var, 14));
        z70 z70Var = new z70(context, e6Var);
        z70Var.setTextSize(1, 13.0f);
        z70Var.setTextAlignment(4);
        z70Var.setGravity(17);
        org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.G6, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.f29031n6, e6Var);
        z70Var.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
        if (z10) {
            i11 = 2131748328;
        } else {
            i11 = 2131748326;
        }
        SpannableStringBuilder x22 = org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(i11, null), new ro0(ro0Var, 4));
        SpannableString spannableString2 = new SpannableString("" + org.telegram.messenger.np.s1(i7).f25445y4);
        spannableString2.setSpan(new y31(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
        z70Var.setText(org.telegram.messenger.g0.K2(x22, spannableString2, "%s"));
        addView(z70Var, c8.ja.d(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28849d6));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(145.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.e6 e6Var = this.f41426a;
        View view = this.f41428c;
        if (view != null) {
            try {
                if (view.getBackground() instanceof GradientDrawable) {
                    int i7 = org.telegram.ui.ActionBar.j6.f28849d6;
                    ((GradientDrawable) view.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.j6.r1(0.4f, org.telegram.ui.ActionBar.j6.w0(i7, e6Var)), org.telegram.ui.ActionBar.j6.w0(i7, e6Var)});
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}

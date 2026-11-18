package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class es0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 f34790a;
    public final org.telegram.ui.Cells.g6 f34791b;
    public final View f34792c;

    public es0(int i7, Context context, boolean z10, org.telegram.ui.ActionBar.i6 i6Var, ap0 ap0Var) {
        super(context);
        int i10;
        int i11;
        this.f34790a = i6Var;
        org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, i6Var);
        this.f34791b = g6Var;
        int i12 = org.telegram.ui.ActionBar.n6.f29488i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i12, i6Var), 2, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i12);
        g6Var.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(g6Var, h02, null, M, i6Var);
        addView(g6Var, c8.ma.c(-2.0f, -1));
        View view = new View(context);
        this.f34792c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i13 = org.telegram.ui.ActionBar.n6.f29396d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.n6.r1(0.4f, org.telegram.ui.ActionBar.n6.w0(i13, i6Var)), org.telegram.ui.ActionBar.n6.w0(i13, i6Var)}));
        addView(view, c8.ma.c(60.0f, -1));
        hi.d dVar = new hi.d(context, i6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z10) {
            i10 = 2131748137;
        } else {
            i10 = 2131748135;
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.M0(i10, null));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new lq(2131232244, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        dVar.i(spannableStringBuilder, false, true);
        addView(dVar, c8.ma.d(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
        dVar.setOnClickListener(new h70(ap0Var, 15));
        k80 k80Var = new k80(context, i6Var);
        k80Var.setTextSize(1, 13.0f);
        k80Var.setTextAlignment(4);
        k80Var.setGravity(17);
        org.telegram.ui.ActionBar.u6.U(k80Var, org.telegram.ui.ActionBar.n6.G6, i6Var);
        org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.f29578n6, i6Var);
        k80Var.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
        if (z10) {
            i11 = 2131748136;
        } else {
            i11 = 2131748134;
        }
        SpannableStringBuilder x22 = org.telegram.messenger.g0.x2(org.telegram.messenger.gd.M0(i11, null), new ap0(ap0Var, 4));
        SpannableString spannableString2 = new SpannableString("" + org.telegram.messenger.mp.u1(i7).A4);
        spannableString2.setSpan(new i41(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
        k80Var.setText(org.telegram.messenger.g0.K2(x22, spannableString2, "%s"));
        addView(k80Var, c8.ma.d(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29396d6));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(145.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.i6 i6Var = this.f34790a;
        View view = this.f34792c;
        if (view != null) {
            try {
                if (view.getBackground() instanceof GradientDrawable) {
                    int i7 = org.telegram.ui.ActionBar.n6.f29396d6;
                    ((GradientDrawable) view.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.n6.r1(0.4f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var)), org.telegram.ui.ActionBar.n6.w0(i7, i6Var)});
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}

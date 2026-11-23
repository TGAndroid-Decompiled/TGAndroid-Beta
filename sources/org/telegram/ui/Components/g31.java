package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class g31 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 f35301a;
    public final LinearLayout f35302b;
    public final TextView f35303c;
    public final TextView d;
    public final TextView f35304e;
    public final ImageView f35305f;
    public final LinearLayout h;
    public final lp f35306n;
    public final LinearLayout f35307r;
    public final ImageView f35308s;
    public final TextView f35309w;

    public g31(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f35301a = i6Var;
        setClipToPadding(false);
        setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(6.0f));
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
        addView(g10, c8.na.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f35303c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rextrabold.ttf"));
        g10.addView(textView, c8.na.t(-2, -2, 19, 0, 0, 0, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f35302b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f));
        c8.sa.a(linearLayout);
        g10.addView(linearLayout, c8.na.d(-2, -2.0f, 19, -6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o1("fonts/rextrabold.ttf"));
        linearLayout.addView(textView2, c8.na.t(-2, -2, 19, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        this.f35305f = imageView;
        imageView.setImageResource(2131230873);
        linearLayout.addView(imageView, c8.na.t(16, 16, 19, 1, 0, 0, 0));
        imageView.setTranslationY(org.telegram.messenger.g0.L(1.0f));
        TextView textView3 = new TextView(context);
        this.f35304e = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o1("fonts/rextrabold.ttf"));
        g10.addView(textView3, c8.na.t(-2, -2, 19, -6, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.h = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(3.0f));
        linearLayout2.setClipToPadding(false);
        linearLayout2.setOrientation(0);
        lp lpVar = new lp(20, context, i6Var);
        this.f35306n = lpVar;
        lpVar.b(org.telegram.ui.ActionBar.n6.h7, org.telegram.ui.ActionBar.n6.f29561j7, org.telegram.ui.ActionBar.n6.f29581k7);
        lpVar.setDrawUnchecked(true);
        lpVar.a(false, false);
        lpVar.setDrawBackgroundAsArc(10);
        linearLayout2.addView(lpVar, c8.na.t(22, 22, 16, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        org.telegram.messenger.f3.l(textView4, org.telegram.ui.ActionBar.n6.f29559j5, i6Var, 1, 14.0f);
        textView4.setText(org.telegram.messenger.gd.N0(2131754995, null));
        linearLayout2.addView(textView4, c8.na.t(-2, -2, 16, 3, -1, 2, 0));
        addView(linearLayout2, c8.na.d(-2, -2.0f, 21, 0.0f, -3.0f, -6.0f, -3.0f));
        c8.sa.b(linearLayout2, 0.025f, 1.5f);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f35307r = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(3.0f));
        linearLayout3.setOrientation(0);
        linearLayout3.setVisibility(8);
        addView(linearLayout3, c8.na.d(-2, -2.0f, 53, 0.0f, 0.0f, -6.0f, 0.0f));
        c8.sa.b(linearLayout3, 0.025f, 1.5f);
        ImageView imageView2 = new ImageView(context);
        this.f35308s = imageView2;
        imageView2.setImageResource(2131231971);
        linearLayout3.addView(imageView2, c8.na.t(-2, -2, 16, 0, 0, 4, 0));
        TextView textView5 = new TextView(context);
        this.f35309w = textView5;
        textView5.setTextSize(1, 14.0f);
        textView5.setTypeface(org.telegram.messenger.g0.o());
        textView5.setText(org.telegram.messenger.gd.N0(2131755003, null));
        linearLayout3.addView(textView5, c8.na.r(-2, -2, 16));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29543i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Fi));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Cells.y yVar;
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var = this.f35301a;
        this.f35303c.setTextColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        int i10 = org.telegram.ui.ActionBar.n6.L6;
        this.d.setTextColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        this.f35304e.setTextColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        this.f35305f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(i10, i6Var), PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = this.f35302b;
        if (linearLayout.isClickable()) {
            yVar = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.x0(null, i10, false)), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        } else {
            yVar = null;
        }
        linearLayout.setBackground(yVar);
        if (linearLayout.isClickable()) {
            c8.sa.a(linearLayout);
        } else {
            linearLayout.setStateListAnimator(null);
        }
        this.h.setBackground(org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29543i6, i6Var), 24, 24));
        int i11 = org.telegram.ui.ActionBar.n6.Fi;
        this.f35308s.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), PorterDuff.Mode.SRC_IN));
        this.f35309w.setTextColor(org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
        this.f35307r.setBackground(org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(i11, i6Var)), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f)));
    }
}

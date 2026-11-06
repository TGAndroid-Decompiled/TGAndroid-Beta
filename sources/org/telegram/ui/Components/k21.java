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
public final class k21 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f35148a;
    public final LinearLayout f35149b;
    public final TextView f35150c;
    public final TextView d;
    public final TextView f35151e;
    public final ImageView f35152f;
    public final LinearLayout h;
    public final wo f35153n;
    public final LinearLayout f35154r;
    public final ImageView f35155s;
    public final TextView f35156w;

    public k21(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f35148a = f6Var;
        setClipToPadding(false);
        setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(6.0f));
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        addView(f10, c8.ha.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f35150c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rextrabold.ttf"));
        f10.addView(textView, c8.ha.t(-2, -2, 19, 0, 0, 0, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f35149b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f));
        c8.ka.a(linearLayout);
        f10.addView(linearLayout, c8.ha.d(-2, -2.0f, 19, -6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o1("fonts/rextrabold.ttf"));
        linearLayout.addView(textView2, c8.ha.t(-2, -2, 19, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        this.f35152f = imageView;
        imageView.setImageResource(2131230873);
        linearLayout.addView(imageView, c8.ha.t(16, 16, 19, 1, 0, 0, 0));
        imageView.setTranslationY(org.telegram.messenger.g0.L(1.0f));
        TextView textView3 = new TextView(context);
        this.f35151e = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o1("fonts/rextrabold.ttf"));
        f10.addView(textView3, c8.ha.t(-2, -2, 19, -6, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.h = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(3.0f));
        linearLayout2.setClipToPadding(false);
        linearLayout2.setOrientation(0);
        wo woVar = new wo(20, context, f6Var);
        this.f35153n = woVar;
        woVar.b(org.telegram.ui.ActionBar.k6.h7, org.telegram.ui.ActionBar.k6.f27958j7, org.telegram.ui.ActionBar.k6.f27978k7);
        woVar.setDrawUnchecked(true);
        woVar.a(false, false);
        woVar.setDrawBackgroundAsArc(10);
        linearLayout2.addView(woVar, c8.ha.t(22, 22, 16, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        org.telegram.messenger.k5.n(textView4, org.telegram.ui.ActionBar.k6.f27956j5, f6Var, 1, 14.0f);
        textView4.setText(org.telegram.messenger.hd.M0(2131754995, null));
        linearLayout2.addView(textView4, c8.ha.t(-2, -2, 16, 3, -1, 2, 0));
        addView(linearLayout2, c8.ha.d(-2, -2.0f, 21, 0.0f, -3.0f, -6.0f, -3.0f));
        c8.ka.b(linearLayout2, 0.025f, 1.5f);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f35154r = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(3.0f));
        linearLayout3.setOrientation(0);
        linearLayout3.setVisibility(8);
        addView(linearLayout3, c8.ha.d(-2, -2.0f, 53, 0.0f, 0.0f, -6.0f, 0.0f));
        c8.ka.b(linearLayout3, 0.025f, 1.5f);
        ImageView imageView2 = new ImageView(context);
        this.f35155s = imageView2;
        imageView2.setImageResource(2131231967);
        linearLayout3.addView(imageView2, c8.ha.t(-2, -2, 16, 0, 0, 4, 0));
        TextView textView5 = new TextView(context);
        this.f35156w = textView5;
        textView5.setTextSize(1, 14.0f);
        textView5.setTypeface(org.telegram.messenger.g0.o());
        textView5.setText(org.telegram.messenger.hd.M0(2131755003, null));
        linearLayout3.addView(textView5, c8.ha.r(-2, -2, 16));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27940i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ci));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Cells.y yVar;
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f35148a;
        this.f35150c.setTextColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        int i10 = org.telegram.ui.ActionBar.k6.L6;
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        this.f35151e.setTextColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        this.f35152f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i10, f6Var), PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = this.f35149b;
        if (linearLayout.isClickable()) {
            yVar = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.x0(null, i10, false)), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        } else {
            yVar = null;
        }
        linearLayout.setBackground(yVar);
        if (linearLayout.isClickable()) {
            c8.ka.a(linearLayout);
        } else {
            linearLayout.setStateListAnimator(null);
        }
        this.h.setBackground(org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27940i6, f6Var), 24, 24));
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        this.f35155s.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i11, f6Var), PorterDuff.Mode.SRC_IN));
        this.f35156w.setTextColor(org.telegram.ui.ActionBar.k6.w0(i11, f6Var));
        this.f35154r.setBackground(org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i11, f6Var)), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f)));
    }
}

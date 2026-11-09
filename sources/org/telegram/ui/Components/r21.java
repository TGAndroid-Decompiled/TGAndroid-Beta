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
public final class r21 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f37539a;
    public final LinearLayout f37540b;
    public final TextView f37541c;
    public final TextView d;
    public final TextView f37542e;
    public final ImageView f37543f;
    public final LinearLayout h;
    public final wo f37544n;
    public final LinearLayout f37545r;
    public final ImageView f37546s;
    public final TextView f37547w;

    public r21(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f37539a = g6Var;
        setClipToPadding(false);
        setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(6.0f));
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        addView(f10, c8.ha.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f37541c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rextrabold.ttf"));
        f10.addView(textView, c8.ha.t(-2, -2, 19, 0, 0, 0, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f37540b = linearLayout;
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
        this.f37543f = imageView;
        imageView.setImageResource(2131230873);
        linearLayout.addView(imageView, c8.ha.t(16, 16, 19, 1, 0, 0, 0));
        imageView.setTranslationY(org.telegram.messenger.g0.L(1.0f));
        TextView textView3 = new TextView(context);
        this.f37542e = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o1("fonts/rextrabold.ttf"));
        f10.addView(textView3, c8.ha.t(-2, -2, 19, -6, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.h = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(3.0f));
        linearLayout2.setClipToPadding(false);
        linearLayout2.setOrientation(0);
        wo woVar = new wo(20, context, g6Var);
        this.f37544n = woVar;
        woVar.b(org.telegram.ui.ActionBar.l6.h7, org.telegram.ui.ActionBar.l6.f27975j7, org.telegram.ui.ActionBar.l6.f27995k7);
        woVar.setDrawUnchecked(true);
        woVar.a(false, false);
        woVar.setDrawBackgroundAsArc(10);
        linearLayout2.addView(woVar, c8.ha.t(22, 22, 16, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        org.telegram.messenger.k5.n(textView4, org.telegram.ui.ActionBar.l6.f27973j5, g6Var, 1, 14.0f);
        textView4.setText(org.telegram.messenger.id.M0(2131754995, null));
        linearLayout2.addView(textView4, c8.ha.t(-2, -2, 16, 3, -1, 2, 0));
        addView(linearLayout2, c8.ha.d(-2, -2.0f, 21, 0.0f, -3.0f, -6.0f, -3.0f));
        c8.ka.b(linearLayout2, 0.025f, 1.5f);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f37545r = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(3.0f));
        linearLayout3.setOrientation(0);
        linearLayout3.setVisibility(8);
        addView(linearLayout3, c8.ha.d(-2, -2.0f, 53, 0.0f, 0.0f, -6.0f, 0.0f));
        c8.ka.b(linearLayout3, 0.025f, 1.5f);
        ImageView imageView2 = new ImageView(context);
        this.f37546s = imageView2;
        imageView2.setImageResource(2131231967);
        linearLayout3.addView(imageView2, c8.ha.t(-2, -2, 16, 0, 0, 4, 0));
        TextView textView5 = new TextView(context);
        this.f37547w = textView5;
        textView5.setTextSize(1, 14.0f);
        textView5.setTypeface(org.telegram.messenger.g0.o());
        textView5.setText(org.telegram.messenger.id.M0(2131755003, null));
        linearLayout3.addView(textView5, c8.ha.r(-2, -2, 16));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27957i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ci));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Cells.y yVar;
        int i7 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f37539a;
        this.f37541c.setTextColor(org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        int i10 = org.telegram.ui.ActionBar.l6.L6;
        this.d.setTextColor(org.telegram.ui.ActionBar.l6.w0(i10, g6Var));
        this.f37542e.setTextColor(org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        this.f37543f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.l6.w0(i10, g6Var), PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = this.f37540b;
        if (linearLayout.isClickable()) {
            yVar = org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.r1(0.1f, org.telegram.ui.ActionBar.l6.x0(null, i10, false)), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        } else {
            yVar = null;
        }
        linearLayout.setBackground(yVar);
        if (linearLayout.isClickable()) {
            c8.ka.a(linearLayout);
        } else {
            linearLayout.setStateListAnimator(null);
        }
        this.h.setBackground(org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27957i6, g6Var), 24, 24));
        int i11 = org.telegram.ui.ActionBar.l6.Ci;
        this.f37546s.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.l6.w0(i11, g6Var), PorterDuff.Mode.SRC_IN));
        this.f37547w.setTextColor(org.telegram.ui.ActionBar.l6.w0(i11, g6Var));
        this.f37545r.setBackground(org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.r1(0.1f, org.telegram.ui.ActionBar.l6.w0(i11, g6Var)), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f)));
    }
}

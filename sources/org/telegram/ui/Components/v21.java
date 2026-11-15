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
public final class v21 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f40239a;
    public final LinearLayout f40240b;
    public final TextView f40241c;
    public final TextView d;
    public final TextView f40242e;
    public final ImageView f40243f;
    public final LinearLayout h;
    public final fp f40244n;
    public final LinearLayout f40245r;
    public final ImageView f40246s;
    public final TextView f40247w;

    public v21(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f40239a = e6Var;
        setClipToPadding(false);
        setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(6.0f));
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        addView(f10, c8.ja.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f40241c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rextrabold.ttf"));
        f10.addView(textView, c8.ja.t(-2, -2, 19, 0, 0, 0, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f40240b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f));
        c8.na.a(linearLayout);
        f10.addView(linearLayout, c8.ja.d(-2, -2.0f, 19, -6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o1("fonts/rextrabold.ttf"));
        linearLayout.addView(textView2, c8.ja.t(-2, -2, 19, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        this.f40243f = imageView;
        imageView.setImageResource(2131230873);
        linearLayout.addView(imageView, c8.ja.t(16, 16, 19, 1, 0, 0, 0));
        imageView.setTranslationY(org.telegram.messenger.g0.L(1.0f));
        TextView textView3 = new TextView(context);
        this.f40242e = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o1("fonts/rextrabold.ttf"));
        f10.addView(textView3, c8.ja.t(-2, -2, 19, -6, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.h = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(3.0f));
        linearLayout2.setClipToPadding(false);
        linearLayout2.setOrientation(0);
        fp fpVar = new fp(20, context, e6Var);
        this.f40244n = fpVar;
        fpVar.b(org.telegram.ui.ActionBar.j6.h7, org.telegram.ui.ActionBar.j6.f28959j7, org.telegram.ui.ActionBar.j6.f28979k7);
        fpVar.setDrawUnchecked(true);
        fpVar.a(false, false);
        fpVar.setDrawBackgroundAsArc(10);
        linearLayout2.addView(fpVar, c8.ja.t(22, 22, 16, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        org.telegram.messenger.k5.m(textView4, org.telegram.ui.ActionBar.j6.f28957j5, e6Var, 1, 14.0f);
        textView4.setText(org.telegram.messenger.hd.M0(2131754995, null));
        linearLayout2.addView(textView4, c8.ja.t(-2, -2, 16, 3, -1, 2, 0));
        addView(linearLayout2, c8.ja.d(-2, -2.0f, 21, 0.0f, -3.0f, -6.0f, -3.0f));
        c8.na.b(linearLayout2, 0.025f, 1.5f);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f40245r = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(3.0f));
        linearLayout3.setOrientation(0);
        linearLayout3.setVisibility(8);
        addView(linearLayout3, c8.ja.d(-2, -2.0f, 53, 0.0f, 0.0f, -6.0f, 0.0f));
        c8.na.b(linearLayout3, 0.025f, 1.5f);
        ImageView imageView2 = new ImageView(context);
        this.f40246s = imageView2;
        imageView2.setImageResource(2131231967);
        linearLayout3.addView(imageView2, c8.ja.t(-2, -2, 16, 0, 0, 4, 0));
        TextView textView5 = new TextView(context);
        this.f40247w = textView5;
        textView5.setTextSize(1, 14.0f);
        textView5.setTypeface(org.telegram.messenger.g0.o());
        textView5.setText(org.telegram.messenger.hd.M0(2131755003, null));
        linearLayout3.addView(textView5, c8.ja.r(-2, -2, 16));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Fi));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Cells.y yVar;
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f40239a;
        this.f40241c.setTextColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        int i10 = org.telegram.ui.ActionBar.j6.L6;
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        this.f40242e.setTextColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        this.f40243f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(i10, e6Var), PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = this.f40240b;
        if (linearLayout.isClickable()) {
            yVar = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.x0(null, i10, false)), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        } else {
            yVar = null;
        }
        linearLayout.setBackground(yVar);
        if (linearLayout.isClickable()) {
            c8.na.a(linearLayout);
        } else {
            linearLayout.setStateListAnimator(null);
        }
        this.h.setBackground(org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28941i6, e6Var), 24, 24));
        int i11 = org.telegram.ui.ActionBar.j6.Fi;
        this.f40246s.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(i11, e6Var), PorterDuff.Mode.SRC_IN));
        this.f40247w.setTextColor(org.telegram.ui.ActionBar.j6.w0(i11, e6Var));
        this.f40245r.setBackground(org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(i11, e6Var)), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f)));
    }
}

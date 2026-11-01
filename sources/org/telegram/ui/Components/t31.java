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
public final class t31 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 f30515a;
    public final LinearLayout f30516b;
    public final TextView f30517c;
    public final TextView d;
    public final TextView e;
    public final ImageView f30518f;
    public final LinearLayout h;
    public final ep f30519n;
    public final LinearLayout f30520r;
    public final ImageView f30521s;
    public final TextView f30522w;

    public t31(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f30515a = p6Var;
        setClipToPadding(false);
        setPadding(org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(6.0f));
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 0);
        addView(f7, w7.b6.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f30517c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o1("fonts/rextrabold.ttf"));
        f7.addView(textView, w7.b6.t(-2, -2, 19, 0, 0, 0, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f30516b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(1.0f));
        w7.e6.a(linearLayout);
        f7.addView(linearLayout, w7.b6.d(-2, -2.0f, 19, -6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o1("fonts/rextrabold.ttf"));
        linearLayout.addView(textView2, w7.b6.t(-2, -2, 19, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        this.f30518f = imageView;
        imageView.setImageResource(2131230873);
        linearLayout.addView(imageView, w7.b6.t(16, 16, 19, 1, 0, 0, 0));
        imageView.setTranslationY(org.telegram.messenger.i0.L(1.0f));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.i0.o1("fonts/rextrabold.ttf"));
        f7.addView(textView3, w7.b6.t(-2, -2, 19, -6, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.h = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(3.0f));
        linearLayout2.setClipToPadding(false);
        linearLayout2.setOrientation(0);
        ep epVar = new ep(20, context, p6Var);
        this.f30519n = epVar;
        epVar.b(org.telegram.ui.ActionBar.t6.f21004h7, org.telegram.ui.ActionBar.t6.f21040j7, org.telegram.ui.ActionBar.t6.f21060k7);
        epVar.setDrawUnchecked(true);
        epVar.a(false, false);
        epVar.setDrawBackgroundAsArc(10);
        linearLayout2.addView(epVar, w7.b6.t(22, 22, 16, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        org.telegram.messenger.m5.m(textView4, org.telegram.ui.ActionBar.t6.f21038j5, p6Var, 1, 14.0f);
        textView4.setText(org.telegram.messenger.dd.L0(2131754995, null));
        linearLayout2.addView(textView4, w7.b6.t(-2, -2, 16, 3, -1, 2, 0));
        addView(linearLayout2, w7.b6.d(-2, -2.0f, 21, 0.0f, -3.0f, -6.0f, -3.0f));
        w7.e6.b(linearLayout2, 0.025f, 1.5f);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f30520r = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(3.0f));
        linearLayout3.setOrientation(0);
        linearLayout3.setVisibility(8);
        addView(linearLayout3, w7.b6.d(-2, -2.0f, 53, 0.0f, 0.0f, -6.0f, 0.0f));
        w7.e6.b(linearLayout3, 0.025f, 1.5f);
        ImageView imageView2 = new ImageView(context);
        this.f30521s = imageView2;
        imageView2.setImageResource(2131231966);
        linearLayout3.addView(imageView2, w7.b6.t(-2, -2, 16, 0, 0, 4, 0));
        TextView textView5 = new TextView(context);
        this.f30522w = textView5;
        textView5.setTextSize(1, 14.0f);
        textView5.setTypeface(org.telegram.messenger.i0.o());
        textView5.setText(org.telegram.messenger.dd.L0(2131755003, null));
        linearLayout3.addView(textView5, w7.b6.r(-2, -2, 16));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ci));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Cells.y yVar;
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.f30515a;
        this.f30517c.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        int i11 = org.telegram.ui.ActionBar.t6.L6;
        this.d.setTextColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        this.e.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        this.f30518f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i11, p6Var), PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = this.f30516b;
        if (linearLayout.isClickable()) {
            yVar = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.x0(null, i11, false)), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f));
        } else {
            yVar = null;
        }
        linearLayout.setBackground(yVar);
        if (linearLayout.isClickable()) {
            w7.e6.a(linearLayout);
        } else {
            linearLayout.setStateListAnimator(null);
        }
        this.h.setBackground(org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21021i6, p6Var), 24, 24));
        int i12 = org.telegram.ui.ActionBar.t6.Ci;
        this.f30521s.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), PorterDuff.Mode.SRC_IN));
        this.f30522w.setTextColor(org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
        this.f30520r.setBackground(org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(i12, p6Var)), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f)));
    }
}

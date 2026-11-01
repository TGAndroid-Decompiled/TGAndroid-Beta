package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_aicompose;
public final class r extends ha implements org.telegram.messenger.vs {
    public final TL_aicompose.AiComposeTone P1;
    public final org.telegram.messenger.e Q1;
    public final ImageView R1;
    public final FrameLayout S1;
    public final TextView T1;
    public final TextView U1;
    public final FrameLayout V1;
    public final FrameLayout W1;
    public final vh.d X1;
    public q51 Y1;
    public int Z1;
    public final TL_aicompose.aiComposeToneExample[] a2;
    public int f29847b2;

    public r(Context context, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null, false, false, 2, p6Var);
        int i10;
        this.Z1 = 0;
        org.telegram.messenger.e Q1 = org.telegram.messenger.wp.r1(this.f21584a).Q1();
        this.Q1 = Q1;
        Q1.b();
        this.P1 = aiComposeTone;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = new TL_aicompose.aiComposeToneExample[((org.telegram.messenger.l0) org.telegram.messenger.wp.r1(this.f21584a).f19300y7.P.f10701a).f16855c];
        this.a2 = aicomposetoneexampleArr;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            aicomposetoneexampleArr[0] = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).example_english;
        }
        ImageView imageView = new ImageView(context);
        this.R1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231270);
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.t(imageView, i11, p6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(i11, this.I0)), 1, -1);
        org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.1f, i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, L, p6Var);
        this.f21587b.addView(imageView, w7.b6.d(54, 54.0f, 53, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.e6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new o(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.S1 = frameLayout;
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        int L2 = org.telegram.messenger.i0.L(100.0f);
        int i12 = org.telegram.ui.ActionBar.t6.f20930d6;
        ShapeDrawable L3 = org.telegram.ui.ActionBar.t6.L(L2, org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        frameLayout2.setBackground(L3);
        org.telegram.ui.ActionBar.a7.k(frameLayout2, L3, N, null, p6Var);
        frameLayout.addView(frameLayout2, w7.b6.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        g9 g9Var = new g9(context);
        g9Var.setAnimatedEmojiDrawable(new f5(4, this.f21584a, aiComposeTone.emoji_id));
        frameLayout2.addView(g9Var, w7.b6.e(64, 64, 17));
        TextView textView = new TextView(context);
        this.T1 = textView;
        org.telegram.messenger.m5.m(textView, i11, p6Var, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(aiComposeTone.title);
        TextView textView2 = new TextView(context);
        this.U1 = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, i11, p6Var);
        textView2.setTextSize(1, 14.0f);
        org.telegram.messenger.m5.l(textView2, 17, null, 2131754966);
        this.l1.setTitle(aiComposeTone.title);
        int i13 = org.telegram.ui.ActionBar.t6.f20873a7;
        this.f21585a0 = i13;
        v0(org.telegram.ui.ActionBar.t6.w0(i13, this.I0));
        uk0 uk0Var = this.f26724k1;
        int i14 = this.f21616t0;
        uk0Var.setPadding(i14, 0, i14, org.telegram.messenger.i0.L(66.0f));
        this.f26724k1.setClipToPadding(false);
        this.f26724k1.r1();
        this.f26724k1.setOnItemClickListener(new k(this, 1));
        this.C1 = false;
        this.B1 = org.telegram.messenger.i0.L(36.0f);
        this.f26730r1 = 0.35f;
        this.F1 = true;
        q qVar = new q(this);
        qVar.f47938m = false;
        qVar.C = false;
        qVar.o(gr.h);
        qVar.n(350L);
        this.f26724k1.setItemAnimator(qVar);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.V1 = frameLayout3;
        frameLayout3.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f));
        frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, org.telegram.ui.ActionBar.t6.w0(i13, this.I0)), org.telegram.ui.ActionBar.t6.w0(i13, this.I0), org.telegram.ui.ActionBar.t6.w0(i13, this.I0)}));
        FrameLayout.LayoutParams e = w7.b6.e(-1, -2, 80);
        int i15 = e.leftMargin;
        int i16 = this.f21616t0;
        e.leftMargin = i15 + i16;
        e.rightMargin += i16;
        this.f21587b.addView(frameLayout3, e);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.W1 = frameLayout4;
        FrameLayout.LayoutParams d = w7.b6.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i17 = d.leftMargin;
        int i18 = this.f21616t0;
        d.leftMargin = i17 + i18;
        d.rightMargin += i18;
        this.f21587b.addView(frameLayout4, d);
        vh.d i19 = org.telegram.messenger.a30.i(24, context, p6Var, true);
        this.X1 = i19;
        if (d1()) {
            i10 = 2131754980;
        } else {
            i10 = 2131755005;
        }
        i19.setText(org.telegram.messenger.dd.L0(i10, null));
        i19.setOnClickListener(new ag.i(this, aiComposeTone, p6Var, 5));
        frameLayout3.addView(i19, w7.b6.e(-1, 48, 119));
        this.Y1.O(false);
    }

    public static SpannableStringBuilder e1() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i10 = 0; i10 < 5; i10++) {
            if (i10 > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            int L = org.telegram.messenger.i0.L((int) (Math.random() * 50.0d));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.dd.L0(2131748789, null));
            u80 u80Var = new u80(null, L, 0, null);
            u80Var.f30903f = org.telegram.messenger.i0.L(6.0f);
            u80Var.h = 0.5f;
            u80Var.f30904n = true;
            spannableStringBuilder.setSpan(u80Var, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    @Override
    public final tk0 L0(uk0 uk0Var) {
        q51 q51Var = new q51(uk0Var, getContext(), this.f21584a, 0, true, new d(this, 1), this.I0);
        this.Y1 = q51Var;
        q51Var.f29638r = false;
        return q51Var;
    }

    @Override
    public final CharSequence O0() {
        TL_aicompose.AiComposeTone aiComposeTone = this.P1;
        if (aiComposeTone == null) {
            return "";
        }
        return aiComposeTone.title;
    }

    @Override
    public final void Q0(float f7) {
        da daVar = this.l1;
        org.telegram.ui.ActionBar.u5 titleTextView = daVar.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f7);
        }
        float translationY = daVar.getTranslationY() + org.telegram.messenger.i0.f16166m;
        int height = daVar.getHeight() - org.telegram.messenger.i0.f16166m;
        ImageView imageView = this.R1;
        imageView.setTranslationY(((1.0f - f7) * org.telegram.messenger.i0.L(28.0f)) + ((height - imageView.getHeight()) / 2.0f) + translationY);
    }

    public final boolean d1() {
        TL_aicompose.AiComposeTone aiComposeTone = this.P1;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            int i10 = 0;
            while (true) {
                org.telegram.messenger.e eVar = this.Q1;
                if (i10 >= eVar.f15486b.size()) {
                    break;
                }
                TL_aicompose.AiComposeTone aiComposeTone2 = (TL_aicompose.AiComposeTone) eVar.f15486b.get(i10);
                if ((aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) aiComposeTone2).f20006id == tL_aiComposeTone.f20006id) {
                    return true;
                }
                i10++;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == org.telegram.messenger.at.Y3) {
            if (d1()) {
                i12 = 2131754980;
            } else {
                i12 = 2131755005;
            }
            this.X1.setText(org.telegram.messenger.dd.L0(i12, null));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.at.f(this.f21584a).n(this, org.telegram.messenger.at.Y3);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20873a7, this.I0);
            if (w02 != this.f29847b2) {
                this.f29847b2 = w02;
                v0(w02);
                this.V1.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.at.f(this.f21584a).c(this, org.telegram.messenger.at.Y3);
    }
}

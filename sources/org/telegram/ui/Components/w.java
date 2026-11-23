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
public final class w extends sa implements org.telegram.messenger.gs {
    public final TL_aicompose.AiComposeTone T1;
    public final org.telegram.messenger.e U1;
    public final ImageView V1;
    public final FrameLayout W1;
    public final TextView X1;
    public final TextView Y1;
    public final FrameLayout Z1;
    public final FrameLayout f41603a2;
    public final hi.e f41604b2;
    public c51 f41605c2;
    public int d2;
    public final TL_aicompose.aiComposeToneExample[] f41606e2;
    public int f41607f2;

    public w(Context context, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, false, false, 2, h6Var);
        int i7;
        this.d2 = 0;
        org.telegram.messenger.e T1 = org.telegram.messenger.np.u1(this.f30173a).T1();
        this.U1 = T1;
        T1.b();
        this.T1 = aiComposeTone;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = new TL_aicompose.aiComposeToneExample[((org.telegram.messenger.j0) org.telegram.messenger.np.u1(this.f30173a).A7.U.f15508b).f24812c];
        this.f41606e2 = aicomposetoneexampleArr;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            aicomposetoneexampleArr[0] = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).example_english;
        }
        ImageView imageView = new ImageView(context);
        this.V1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231269);
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i10, this.J0)), 1, -1);
        org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.1f, i10);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, K, h6Var);
        this.f30176b.addView(imageView, c8.ma.d(54, 54.0f, 53, 0.0f, 0.0f, 8.0f, 0.0f));
        c8.ra.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new t(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.W1 = frameLayout;
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(100.0f);
        int i11 = org.telegram.ui.ActionBar.m6.f29381d6;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, org.telegram.ui.ActionBar.m6.w0(i11, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.t6.j(frameLayout2, L2, M, null, h6Var);
        frameLayout.addView(frameLayout2, c8.ma.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        q9 q9Var = new q9(context);
        q9Var.setAnimatedEmojiDrawable(new p5(4, this.f30173a, aiComposeTone.emoji_id));
        frameLayout2.addView(q9Var, c8.ma.e(64, 64, 17));
        TextView textView = new TextView(context);
        this.X1 = textView;
        org.telegram.messenger.f3.l(textView, i10, h6Var, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(aiComposeTone.title);
        TextView textView2 = new TextView(context);
        this.Y1 = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, i10, h6Var);
        textView2.setTextSize(1, 14.0f);
        org.telegram.messenger.f3.k(textView2, 17, null, 2131754966);
        this.f39532p1.setTitle(aiComposeTone.title);
        int i12 = org.telegram.ui.ActionBar.m6.f29324a7;
        this.f30177b0 = i12;
        v0(org.telegram.ui.ActionBar.m6.w0(i12, this.J0));
        ek0 ek0Var = this.f39531o1;
        int i13 = this.f30211u0;
        ek0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(66.0f));
        this.f39531o1.setClipToPadding(false);
        this.f39531o1.r1();
        this.f39531o1.setOnItemClickListener(new o(this, 1));
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(36.0f);
        this.f39538v1 = 0.35f;
        this.J1 = true;
        v vVar = new v(this);
        vVar.f59194m = false;
        vVar.C = false;
        vVar.o(nr.h);
        vVar.n(350L);
        this.f39531o1.setItemAnimator(vVar);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Z1 = frameLayout3;
        frameLayout3.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, org.telegram.ui.ActionBar.m6.w0(i12, this.J0)), org.telegram.ui.ActionBar.m6.w0(i12, this.J0), org.telegram.ui.ActionBar.m6.w0(i12, this.J0)}));
        FrameLayout.LayoutParams e10 = c8.ma.e(-1, -2, 80);
        int i14 = e10.leftMargin;
        int i15 = this.f30211u0;
        e10.leftMargin = i14 + i15;
        e10.rightMargin += i15;
        this.f30176b.addView(frameLayout3, e10);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f41603a2 = frameLayout4;
        FrameLayout.LayoutParams d = c8.ma.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i16 = d.leftMargin;
        int i17 = this.f30211u0;
        d.leftMargin = i16 + i17;
        d.rightMargin += i17;
        this.f30176b.addView(frameLayout4, d);
        hi.e g10 = org.telegram.messenger.o10.g(24, context, h6Var, true);
        this.f41604b2 = g10;
        if (e1()) {
            i7 = 2131754980;
        } else {
            i7 = 2131755005;
        }
        g10.setText(org.telegram.messenger.hd.N0(i7, null));
        g10.setOnClickListener(new ah.h(this, aiComposeTone, h6Var, 20));
        frameLayout3.addView(g10, c8.ma.e(-1, 48, 119));
        this.f41605c2.O(false);
    }

    public static SpannableStringBuilder f1() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i7 = 0; i7 < 5; i7++) {
            if (i7 > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            int L = org.telegram.messenger.g0.L((int) (Math.random() * 50.0d));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.N0(2131748586, null));
            r80 r80Var = new r80(null, L, 0, null);
            r80Var.f39118f = org.telegram.messenger.g0.L(6.0f);
            r80Var.h = 0.5f;
            r80Var.f39119n = true;
            spannableStringBuilder.setSpan(r80Var, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(ek0Var, getContext(), this.f30173a, 0, true, new d(this, 1), this.J0);
        this.f41605c2 = c51Var;
        c51Var.f34062r = false;
        return c51Var;
    }

    @Override
    public final CharSequence P0() {
        TL_aicompose.AiComposeTone aiComposeTone = this.T1;
        if (aiComposeTone == null) {
            return "";
        }
        return aiComposeTone.title;
    }

    @Override
    public final void R0(float f10) {
        na naVar = this.f39532p1;
        org.telegram.ui.ActionBar.m5 titleTextView = naVar.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f10);
        }
        float translationY = naVar.getTranslationY() + org.telegram.messenger.g0.f24040m;
        int height = naVar.getHeight() - org.telegram.messenger.g0.f24040m;
        ImageView imageView = this.V1;
        imageView.setTranslationY(((1.0f - f10) * org.telegram.messenger.g0.L(28.0f)) + ((height - imageView.getHeight()) / 2.0f) + translationY);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        if (i7 == org.telegram.messenger.ls.f25285b4) {
            if (e1()) {
                i11 = 2131754980;
            } else {
                i11 = 2131755005;
            }
            this.f41604b2.setText(org.telegram.messenger.hd.N0(i11, null));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.ls.f(this.f30173a).n(this, org.telegram.messenger.ls.f25285b4);
    }

    public final boolean e1() {
        TL_aicompose.AiComposeTone aiComposeTone = this.T1;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            int i7 = 0;
            while (true) {
                org.telegram.messenger.e eVar = this.U1;
                if (i7 >= eVar.f23645b.size()) {
                    break;
                }
                TL_aicompose.AiComposeTone aiComposeTone2 = (TL_aicompose.AiComposeTone) eVar.f23645b.get(i7);
                if ((aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) aiComposeTone2).f28647id == tL_aiComposeTone.f28647id) {
                    return true;
                }
                i7++;
            }
        }
        return false;
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29324a7, this.J0);
            if (w02 != this.f41607f2) {
                this.f41607f2 = w02;
                v0(w02);
                this.Z1.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.ls.f(this.f30173a).c(this, org.telegram.messenger.ls.f25285b4);
    }
}

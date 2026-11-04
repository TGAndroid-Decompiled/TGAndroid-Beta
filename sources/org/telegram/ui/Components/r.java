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
public final class r extends ma implements org.telegram.messenger.cs {
    public final TL_aicompose.AiComposeTone Q1;
    public final org.telegram.messenger.e R1;
    public final ImageView S1;
    public final FrameLayout T1;
    public final TextView U1;
    public final TextView V1;
    public final FrameLayout W1;
    public final FrameLayout X1;
    public final gi.d Y1;
    public f41 Z1;
    public int f37578a2;
    public final TL_aicompose.aiComposeToneExample[] f37579b2;
    public int c2;

    public r(Context context, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, false, false, 2, e6Var);
        int i3;
        this.f37578a2 = 0;
        org.telegram.messenger.e R1 = org.telegram.messenger.hp.s1(this.f28583a).R1();
        this.R1 = R1;
        R1.b();
        this.Q1 = aiComposeTone;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = new TL_aicompose.aiComposeToneExample[((org.telegram.messenger.j0) org.telegram.messenger.hp.s1(this.f28583a).f23167x7.P.f13798b).f23620c];
        this.f37579b2 = aicomposetoneexampleArr;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            aicomposetoneexampleArr[0] = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).example_english;
        }
        ImageView imageView = new ImageView(context);
        this.S1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231269);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, e6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i10, this.J0)), 1, -1);
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.1f, i10);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, L, e6Var);
        this.f28586b.addView(imageView, b8.mf.d(54, 54.0f, 53, 0.0f, 0.0f, 8.0f, 0.0f));
        b8.pf.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new o(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1 = frameLayout;
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        int L2 = org.telegram.messenger.g0.L(100.0f);
        int i11 = org.telegram.ui.ActionBar.k6.f27878d6;
        ShapeDrawable L3 = org.telegram.ui.ActionBar.k6.L(L2, org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        frameLayout2.setBackground(L3);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, L3, N, null, e6Var);
        frameLayout.addView(frameLayout2, b8.mf.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        k9 k9Var = new k9(context);
        k9Var.setAnimatedEmojiDrawable(new g5(4, this.f28583a, aiComposeTone.emoji_id));
        frameLayout2.addView(k9Var, b8.mf.e(64, 64, 17));
        TextView textView = new TextView(context);
        this.U1 = textView;
        org.telegram.messenger.k5.n(textView, i10, e6Var, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(aiComposeTone.title);
        TextView textView2 = new TextView(context);
        this.V1 = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, i10, e6Var);
        textView2.setTextSize(1, 14.0f);
        org.telegram.messenger.k5.m(textView2, 17, null, 2131754966);
        this.m1.setTitle(aiComposeTone.title);
        int i12 = org.telegram.ui.ActionBar.k6.f27824a7;
        this.f28587b0 = i12;
        v0(org.telegram.ui.ActionBar.k6.w0(i12, this.J0));
        tj0 tj0Var = this.f36102l1;
        int i13 = this.f28618u0;
        tj0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(66.0f));
        this.f36102l1.setClipToPadding(false);
        this.f36102l1.r1();
        this.f36102l1.setOnItemClickListener(new k(this, 1));
        this.D1 = false;
        this.C1 = org.telegram.messenger.g0.L(36.0f);
        this.f36108s1 = 0.35f;
        this.G1 = true;
        q qVar = new q(this);
        qVar.f55567m = false;
        qVar.C = false;
        qVar.o(xq.h);
        qVar.n(350L);
        this.f36102l1.setItemAnimator(qVar);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.W1 = frameLayout3;
        frameLayout3.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, org.telegram.ui.ActionBar.k6.w0(i12, this.J0)), org.telegram.ui.ActionBar.k6.w0(i12, this.J0), org.telegram.ui.ActionBar.k6.w0(i12, this.J0)}));
        FrameLayout.LayoutParams e10 = b8.mf.e(-1, -2, 80);
        int i14 = e10.leftMargin;
        int i15 = this.f28618u0;
        e10.leftMargin = i14 + i15;
        e10.rightMargin += i15;
        this.f28586b.addView(frameLayout3, e10);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.X1 = frameLayout4;
        FrameLayout.LayoutParams d = b8.mf.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i16 = d.leftMargin;
        int i17 = this.f28618u0;
        d.leftMargin = i16 + i17;
        d.rightMargin += i17;
        this.f28586b.addView(frameLayout4, d);
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        this.Y1 = h;
        if (d1()) {
            i3 = 2131754980;
        } else {
            i3 = 2131755005;
        }
        h.setText(org.telegram.messenger.bd.M0(i3, null));
        h.setOnClickListener(new ai.h(this, aiComposeTone, e6Var, 20));
        frameLayout3.addView(h, b8.mf.e(-1, 48, 119));
        this.Z1.O(false);
    }

    public static SpannableStringBuilder e1() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i3 = 0; i3 < 5; i3++) {
            if (i3 > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            int L = org.telegram.messenger.g0.L((int) (Math.random() * 50.0d));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131748787, null));
            x70 x70Var = new x70(null, L, 0, null);
            x70Var.f40263f = org.telegram.messenger.g0.L(6.0f);
            x70Var.h = 0.5f;
            x70Var.f40264n = true;
            spannableStringBuilder.setSpan(x70Var, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(tj0Var, getContext(), this.f28583a, 0, true, new e(this, 1), this.J0);
        this.Z1 = f41Var;
        f41Var.f33698r = false;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        TL_aicompose.AiComposeTone aiComposeTone = this.Q1;
        if (aiComposeTone == null) {
            return "";
        }
        return aiComposeTone.title;
    }

    @Override
    public final void Q0(float f10) {
        ia iaVar = this.m1;
        org.telegram.ui.ActionBar.k5 titleTextView = iaVar.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f10);
        }
        float translationY = iaVar.getTranslationY() + org.telegram.messenger.g0.f22602m;
        int height = iaVar.getHeight() - org.telegram.messenger.g0.f22602m;
        ImageView imageView = this.S1;
        imageView.setTranslationY(((1.0f - f10) * org.telegram.messenger.g0.L(28.0f)) + ((height - imageView.getHeight()) / 2.0f) + translationY);
    }

    public final boolean d1() {
        TL_aicompose.AiComposeTone aiComposeTone = this.Q1;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            int i3 = 0;
            while (true) {
                org.telegram.messenger.e eVar = this.R1;
                if (i3 >= eVar.f22272b.size()) {
                    break;
                }
                TL_aicompose.AiComposeTone aiComposeTone2 = (TL_aicompose.AiComposeTone) eVar.f22272b.get(i3);
                if ((aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) aiComposeTone2).f27214id == tL_aiComposeTone.f27214id) {
                    return true;
                }
                i3++;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11;
        if (i3 == org.telegram.messenger.hs.Y3) {
            if (d1()) {
                i11 = 2131754980;
            } else {
                i11 = 2131755005;
            }
            this.Y1.setText(org.telegram.messenger.bd.M0(i11, null));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.hs.f(this.f28583a).n(this, org.telegram.messenger.hs.Y3);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, this.J0);
            if (w02 != this.c2) {
                this.c2 = w02;
                v0(w02);
                this.W1.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.hs.f(this.f28583a).c(this, org.telegram.messenger.hs.Y3);
    }
}

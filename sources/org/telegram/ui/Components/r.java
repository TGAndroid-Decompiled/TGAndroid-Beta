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
public final class r extends ma implements org.telegram.messenger.ls {
    public final TL_aicompose.AiComposeTone S1;
    public final org.telegram.messenger.e T1;
    public final ImageView U1;
    public final FrameLayout V1;
    public final TextView W1;
    public final TextView X1;
    public final FrameLayout Y1;
    public final FrameLayout Z1;
    public final fi.d f37431a2;
    public m41 f37432b2;
    public int f37433c2;
    public final TL_aicompose.aiComposeToneExample[] d2;
    public int f37434e2;

    public r(Context context, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, false, false, 2, h6Var);
        int i7;
        this.f37433c2 = 0;
        org.telegram.messenger.e R1 = org.telegram.messenger.qp.s1(this.f28669a).R1();
        this.T1 = R1;
        R1.b();
        this.S1 = aiComposeTone;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = new TL_aicompose.aiComposeToneExample[((org.telegram.messenger.j0) org.telegram.messenger.qp.s1(this.f28669a).f24946x7.P.f13557b).f23464c];
        this.d2 = aicomposetoneexampleArr;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            aicomposetoneexampleArr[0] = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).example_english;
        }
        ImageView imageView = new ImageView(context);
        this.U1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231269);
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i10, this.I0)), 1, -1);
        org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.1f, i10);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, K, h6Var);
        this.f28672b.addView(imageView, c8.ha.d(54, 54.0f, 53, 0.0f, 0.0f, 8.0f, 0.0f));
        c8.ka.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new o(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.V1 = frameLayout;
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(100.0f);
        int i11 = org.telegram.ui.ActionBar.m6.f27890d6;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, org.telegram.ui.ActionBar.m6.w0(i11, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.t6.j(frameLayout2, L2, M, null, h6Var);
        frameLayout.addView(frameLayout2, c8.ha.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        k9 k9Var = new k9(context);
        k9Var.setAnimatedEmojiDrawable(new h5(4, this.f28669a, aiComposeTone.emoji_id));
        frameLayout2.addView(k9Var, c8.ha.e(64, 64, 17));
        TextView textView = new TextView(context);
        this.W1 = textView;
        org.telegram.messenger.k5.n(textView, i10, h6Var, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(aiComposeTone.title);
        TextView textView2 = new TextView(context);
        this.X1 = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, i10, h6Var);
        textView2.setTextSize(1, 14.0f);
        org.telegram.messenger.k5.m(textView2, 17, null, 2131754966);
        this.f35902o1.setTitle(aiComposeTone.title);
        int i12 = org.telegram.ui.ActionBar.m6.f27834a7;
        this.f28670a0 = i12;
        v0(org.telegram.ui.ActionBar.m6.w0(i12, this.I0));
        pj0 pj0Var = this.n1;
        int i13 = this.f28705t0;
        pj0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(66.0f));
        this.n1.setClipToPadding(false);
        this.n1.r1();
        this.n1.setOnItemClickListener(new j(this, 1));
        this.F1 = false;
        this.E1 = org.telegram.messenger.g0.L(36.0f);
        this.f35908u1 = 0.35f;
        this.I1 = true;
        q qVar = new q(this);
        qVar.f57079m = false;
        qVar.C = false;
        qVar.o(wq.h);
        qVar.n(350L);
        this.n1.setItemAnimator(qVar);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Y1 = frameLayout3;
        frameLayout3.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, org.telegram.ui.ActionBar.m6.w0(i12, this.I0)), org.telegram.ui.ActionBar.m6.w0(i12, this.I0), org.telegram.ui.ActionBar.m6.w0(i12, this.I0)}));
        FrameLayout.LayoutParams e10 = c8.ha.e(-1, -2, 80);
        int i14 = e10.leftMargin;
        int i15 = this.f28705t0;
        e10.leftMargin = i14 + i15;
        e10.rightMargin += i15;
        this.f28672b.addView(frameLayout3, e10);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.Z1 = frameLayout4;
        FrameLayout.LayoutParams d = c8.ha.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i16 = d.leftMargin;
        int i17 = this.f28705t0;
        d.leftMargin = i16 + i17;
        d.rightMargin += i17;
        this.f28672b.addView(frameLayout4, d);
        fi.d h = org.telegram.messenger.k5.h(24, context, h6Var, true);
        this.f37431a2 = h;
        if (d1()) {
            i7 = 2131754980;
        } else {
            i7 = 2131755005;
        }
        h.setText(org.telegram.messenger.id.M0(i7, null));
        h.setOnClickListener(new ah.g(this, aiComposeTone, h6Var, 15));
        frameLayout3.addView(h, c8.ha.e(-1, 48, 119));
        this.f37432b2.O(false);
    }

    public static SpannableStringBuilder e1() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i7 = 0; i7 < 5; i7++) {
            if (i7 > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            int L = org.telegram.messenger.g0.L((int) (Math.random() * 50.0d));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131748779, null));
            b80 b80Var = new b80(null, L, 0, null);
            b80Var.f32163f = org.telegram.messenger.g0.L(6.0f);
            b80Var.h = 0.5f;
            b80Var.f32164n = true;
            spannableStringBuilder.setSpan(b80Var, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(pj0Var, getContext(), this.f28669a, 0, true, new d(this, 1), this.I0);
        this.f37432b2 = m41Var;
        m41Var.f35845r = false;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        TL_aicompose.AiComposeTone aiComposeTone = this.S1;
        if (aiComposeTone == null) {
            return "";
        }
        return aiComposeTone.title;
    }

    @Override
    public final void Q0(float f10) {
        ia iaVar = this.f35902o1;
        org.telegram.ui.ActionBar.m5 titleTextView = iaVar.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f10);
        }
        float translationY = iaVar.getTranslationY() + org.telegram.messenger.g0.f22561m;
        int height = iaVar.getHeight() - org.telegram.messenger.g0.f22561m;
        ImageView imageView = this.U1;
        imageView.setTranslationY(((1.0f - f10) * org.telegram.messenger.g0.L(28.0f)) + ((height - imageView.getHeight()) / 2.0f) + translationY);
    }

    public final boolean d1() {
        TL_aicompose.AiComposeTone aiComposeTone = this.S1;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            int i7 = 0;
            while (true) {
                org.telegram.messenger.e eVar = this.T1;
                if (i7 >= eVar.f22159b.size()) {
                    break;
                }
                TL_aicompose.AiComposeTone aiComposeTone2 = (TL_aicompose.AiComposeTone) eVar.f22159b.get(i7);
                if ((aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) aiComposeTone2).f27173id == tL_aiComposeTone.f27173id) {
                    return true;
                }
                i7++;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        if (i7 == org.telegram.messenger.qs.Y3) {
            if (d1()) {
                i11 = 2131754980;
            } else {
                i11 = 2131755005;
            }
            this.f37431a2.setText(org.telegram.messenger.id.M0(i11, null));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.qs.f(this.f28669a).n(this, org.telegram.messenger.qs.Y3);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27834a7, this.I0);
            if (w02 != this.f37434e2) {
                this.f37434e2 = w02;
                v0(w02);
                this.Y1.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.qs.f(this.f28669a).c(this, org.telegram.messenger.qs.Y3);
    }
}

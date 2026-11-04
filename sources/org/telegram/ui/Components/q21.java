package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class q21 extends ma {
    public ImageView Q1;
    public FrameLayout R1;
    public gi.d S1;
    public CharSequence T1;
    public boolean U1;
    public CharSequence V1;
    public ts W1;
    public String X1;
    public String Y1;
    public int Z1;
    public String[] f37328a2;
    public String[] f37329b2;
    public f41 c2;
    public boolean f37330d2;
    public int f37331e2;
    public int f37332f2;
    public int f37333g2;

    @Override
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(tj0Var, getContext(), this.f28583a, 0, true, new i21(this, 0), this.J0);
        this.c2 = f41Var;
        f41Var.f33698r = false;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        return "Translate";
    }

    @Override
    public final void Q0(float f10) {
        ImageView imageView = this.Q1;
        float f11 = 1.0f - f10;
        imageView.setAlpha(f11);
        imageView.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
        imageView.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
    }

    public final void d1(f60 f60Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i3 = org.telegram.ui.ActionBar.k6.E8;
        int i10 = org.telegram.ui.ActionBar.k6.F8;
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(1, getContext(), this.J0, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        y0Var.setText(str);
        y0Var.setChecked(z10);
        y0Var.d(org.telegram.ui.ActionBar.k6.w0(i3, this.J0), org.telegram.ui.ActionBar.k6.w0(i10, this.J0));
        y0Var.setSelectorColor(org.telegram.ui.ActionBar.k6.r1(0.12f, org.telegram.ui.ActionBar.k6.w0(i3, this.J0)));
        y0Var.setOnClickListener(new i(f60Var, z10, runnable, 1));
        linearLayout.addView(y0Var, b8.mf.o(-1, -2));
    }

    public final void e1() {
        if (this.f37331e2 >= 0) {
            ConnectionsManager.getInstance(this.f28583a).cancelRequest(this.f37331e2, true);
            this.f37331e2 = -1;
        }
    }

    public final void f1() {
        String charSequence;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.T1};
        tL_textWithEntities.entities = org.telegram.messenger.li.b0(this.f28583a).W(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.W1 != null) {
            this.S1.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131748787, null));
        spannableStringBuilder.setSpan(new x70(null, org.telegram.messenger.g0.L(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.V1 = spannableStringBuilder;
        this.U1 = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.Y1;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i3 = this.Z1;
        if (i3 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.f37328a2[i3];
        }
        this.f37331e2 = ConnectionsManager.getInstance(this.f28583a).sendRequestTyped(tL_messages_translateText, new c3.b(1), new i21(this, 1));
        this.c2.O(true);
    }

    @Override
    public final void h0() {
        FrameLayout frameLayout = this.R1;
        super.h0();
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            frameLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            frameLayout.setTranslationY(0.0f);
        }
    }

    @Override
    public final void s0() {
        FrameLayout frameLayout = this.R1;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, this.J0);
            if (w02 != this.f37333g2) {
                this.f37333g2 = w02;
                v0(w02);
            }
            if (frameLayout != null && (frameLayout.getBackground() instanceof GradientDrawable) && w02 != this.f37332f2) {
                this.f37332f2 = w02;
                ((GradientDrawable) frameLayout.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, w02), w02, w02});
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        gi.d dVar = this.S1;
        super.show();
        ia iaVar = this.m1;
        if (iaVar != null) {
            iaVar.setTitle("Translate");
        }
        this.c2.O(false);
        f1();
        if (this.W1 != null) {
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new h21(this, 3));
        }
    }
}

package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class v21 extends ma {
    public ImageView S1;
    public FrameLayout T1;
    public fi.d U1;
    public CharSequence V1;
    public boolean W1;
    public CharSequence X1;
    public ss Y1;
    public String Z1;
    public String f38821a2;
    public int f38822b2;
    public String[] f38823c2;
    public String[] d2;
    public m41 f38824e2;
    public boolean f38825f2;
    public int f38826g2;
    public int f38827h2;
    public int f38828i2;

    @Override
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(pj0Var, getContext(), this.f28669a, 0, true, new n21(this, 0), this.I0);
        this.f38824e2 = m41Var;
        m41Var.f35845r = false;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        return "Translate";
    }

    @Override
    public final void Q0(float f10) {
        ImageView imageView = this.S1;
        float f11 = 1.0f - f10;
        imageView.setAlpha(f11);
        imageView.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
        imageView.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
    }

    public final void d1(k60 k60Var, LinearLayout linearLayout, boolean z9, String str, Runnable runnable) {
        int i7 = org.telegram.ui.ActionBar.m6.E8;
        int i10 = org.telegram.ui.ActionBar.m6.F8;
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(1, getContext(), this.I0, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        z0Var.setText(str);
        z0Var.setChecked(z9);
        z0Var.d(org.telegram.ui.ActionBar.m6.w0(i7, this.I0), org.telegram.ui.ActionBar.m6.w0(i10, this.I0));
        z0Var.setSelectorColor(org.telegram.ui.ActionBar.m6.r1(0.12f, org.telegram.ui.ActionBar.m6.w0(i7, this.I0)));
        z0Var.setOnClickListener(new h(k60Var, z9, runnable, 1));
        linearLayout.addView(z0Var, c8.ha.o(-1, -2));
    }

    public final void e1() {
        if (this.f38826g2 >= 0) {
            ConnectionsManager.getInstance(this.f28669a).cancelRequest(this.f38826g2, true);
            this.f38826g2 = -1;
        }
    }

    public final void f1() {
        String charSequence;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.V1};
        tL_textWithEntities.entities = org.telegram.messenger.ui.b0(this.f28669a).W(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.Y1 != null) {
            this.U1.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131748779, null));
        spannableStringBuilder.setSpan(new b80(null, org.telegram.messenger.g0.L(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.X1 = spannableStringBuilder;
        this.W1 = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.f38821a2;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i7 = this.f38822b2;
        if (i7 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.f38823c2[i7];
        }
        this.f38826g2 = ConnectionsManager.getInstance(this.f28669a).sendRequestTyped(tL_messages_translateText, new d3.b(1), new n21(this, 1));
        this.f38824e2.O(true);
    }

    @Override
    public final void h0() {
        FrameLayout frameLayout = this.T1;
        super.h0();
        ValueAnimator valueAnimator = this.O0;
        if (valueAnimator != null) {
            frameLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            frameLayout.setTranslationY(0.0f);
        }
    }

    @Override
    public final void s0() {
        FrameLayout frameLayout = this.T1;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27834a7, this.I0);
            if (w02 != this.f38828i2) {
                this.f38828i2 = w02;
                v0(w02);
            }
            if (frameLayout != null && (frameLayout.getBackground() instanceof GradientDrawable) && w02 != this.f38827h2) {
                this.f38827h2 = w02;
                ((GradientDrawable) frameLayout.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, w02), w02, w02});
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        fi.d dVar = this.U1;
        super.show();
        ia iaVar = this.f35902o1;
        if (iaVar != null) {
            iaVar.setTitle("Translate");
        }
        this.f38824e2.O(false);
        f1();
        if (this.Y1 != null) {
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new m21(this, 3));
        }
    }
}

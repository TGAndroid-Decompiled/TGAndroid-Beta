package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class w21 extends na {
    public ImageView P1;
    public FrameLayout Q1;
    public fi.d R1;
    public CharSequence S1;
    public boolean T1;
    public CharSequence U1;
    public ts V1;
    public String W1;
    public String X1;
    public int Y1;
    public String[] Z1;
    public String[] f39880a2;
    public m41 f39881b2;
    public boolean f39882c2;
    public int d2;
    public int f39883e2;
    public int f39884f2;

    @Override
    public final pj0 L0(qj0 qj0Var) {
        m41 m41Var = new m41(qj0Var, getContext(), this.f28621a, 0, true, new o21(this, 0), this.I0);
        this.f39881b2 = m41Var;
        m41Var.f35945r = false;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        return "Translate";
    }

    @Override
    public final void Q0(float f10) {
        ImageView imageView = this.P1;
        float f11 = 1.0f - f10;
        imageView.setAlpha(f11);
        imageView.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
        imageView.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
    }

    public final void d1(l60 l60Var, LinearLayout linearLayout, boolean z9, String str, Runnable runnable) {
        int i7 = org.telegram.ui.ActionBar.l6.E8;
        int i10 = org.telegram.ui.ActionBar.l6.F8;
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(1, getContext(), this.I0, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        z0Var.setText(str);
        z0Var.setChecked(z9);
        z0Var.d(org.telegram.ui.ActionBar.l6.w0(i7, this.I0), org.telegram.ui.ActionBar.l6.w0(i10, this.I0));
        z0Var.setSelectorColor(org.telegram.ui.ActionBar.l6.r1(0.12f, org.telegram.ui.ActionBar.l6.w0(i7, this.I0)));
        z0Var.setOnClickListener(new i(l60Var, z9, runnable, 1));
        linearLayout.addView(z0Var, c8.ha.o(-1, -2));
    }

    public final void e1() {
        if (this.d2 >= 0) {
            ConnectionsManager.getInstance(this.f28621a).cancelRequest(this.d2, true);
            this.d2 = -1;
        }
    }

    public final void f1() {
        String charSequence;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.S1};
        tL_textWithEntities.entities = org.telegram.messenger.ui.b0(this.f28621a).W(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.V1 != null) {
            this.R1.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131748779, null));
        spannableStringBuilder.setSpan(new c80(null, org.telegram.messenger.g0.L(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.U1 = spannableStringBuilder;
        this.T1 = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.X1;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i7 = this.Y1;
        if (i7 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.Z1[i7];
        }
        this.d2 = ConnectionsManager.getInstance(this.f28621a).sendRequestTyped(tL_messages_translateText, new d3.b(1), new o21(this, 1));
        this.f39881b2.O(true);
    }

    @Override
    public final void h0() {
        FrameLayout frameLayout = this.Q1;
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
        FrameLayout frameLayout = this.Q1;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27809a7, this.I0);
            if (w02 != this.f39884f2) {
                this.f39884f2 = w02;
                v0(w02);
            }
            if (frameLayout != null && (frameLayout.getBackground() instanceof GradientDrawable) && w02 != this.f39883e2) {
                this.f39883e2 = w02;
                ((GradientDrawable) frameLayout.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.l6.r1(0.0f, w02), w02, w02});
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        fi.d dVar = this.R1;
        super.show();
        ja jaVar = this.l1;
        if (jaVar != null) {
            jaVar.setTitle("Translate");
        }
        this.f39881b2.O(false);
        f1();
        if (this.V1 != null) {
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new n21(this, 3));
        }
    }
}

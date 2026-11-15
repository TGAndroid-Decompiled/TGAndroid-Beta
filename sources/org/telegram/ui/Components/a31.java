package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class a31 extends ja {
    public ImageView T1;
    public FrameLayout U1;
    public hi.d V1;
    public CharSequence W1;
    public boolean X1;
    public CharSequence Y1;
    public at Z1;
    public String f32835a2;
    public String f32836b2;
    public int f32837c2;
    public String[] d2;
    public String[] f32838e2;
    public p41 f32839f2;
    public boolean f32840g2;
    public int f32841h2;
    public int f32842i2;
    public int f32843j2;

    @Override
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(uj0Var, getContext(), this.f29679a, 0, true, new s21(this, 0), this.J0);
        this.f32839f2 = p41Var;
        p41Var.f38199r = false;
        return p41Var;
    }

    @Override
    public final CharSequence O0() {
        return "Translate";
    }

    @Override
    public final void Q0(float f10) {
        ImageView imageView = this.T1;
        float f11 = 1.0f - f10;
        imageView.setAlpha(f11);
        imageView.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
        imageView.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
    }

    public final void d1(m60 m60Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i7 = org.telegram.ui.ActionBar.j6.E8;
        int i10 = org.telegram.ui.ActionBar.j6.F8;
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(1, getContext(), this.J0, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        z0Var.setText(str);
        z0Var.setChecked(z10);
        z0Var.d(org.telegram.ui.ActionBar.j6.w0(i7, this.J0), org.telegram.ui.ActionBar.j6.w0(i10, this.J0));
        z0Var.setSelectorColor(org.telegram.ui.ActionBar.j6.r1(0.12f, org.telegram.ui.ActionBar.j6.w0(i7, this.J0)));
        z0Var.setOnClickListener(new h(m60Var, z10, runnable, 1));
        linearLayout.addView(z0Var, c8.ja.o(-1, -2));
    }

    public final void e1() {
        if (this.f32841h2 >= 0) {
            ConnectionsManager.getInstance(this.f29679a).cancelRequest(this.f32841h2, true);
            this.f32841h2 = -1;
        }
    }

    public final void f1() {
        String charSequence;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.W1};
        tL_textWithEntities.entities = org.telegram.messenger.si.b0(this.f29679a).W(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.Z1 != null) {
            this.V1.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131748779, null));
        spannableStringBuilder.setSpan(new e80(null, org.telegram.messenger.g0.L(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.Y1 = spannableStringBuilder;
        this.X1 = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.f32836b2;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i7 = this.f32837c2;
        if (i7 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.d2[i7];
        }
        this.f32841h2 = ConnectionsManager.getInstance(this.f29679a).sendRequestTyped(tL_messages_translateText, new d3.b(1), new s21(this, 1));
        this.f32839f2.O(true);
    }

    @Override
    public final void h0() {
        FrameLayout frameLayout = this.U1;
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
        FrameLayout frameLayout = this.U1;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, this.J0);
            if (w02 != this.f32843j2) {
                this.f32843j2 = w02;
                v0(w02);
            }
            if (frameLayout != null && (frameLayout.getBackground() instanceof GradientDrawable) && w02 != this.f32842i2) {
                this.f32842i2 = w02;
                ((GradientDrawable) frameLayout.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.j6.r1(0.0f, w02), w02, w02});
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        hi.d dVar = this.V1;
        super.show();
        fa faVar = this.f35932p1;
        if (faVar != null) {
            faVar.setTitle("Translate");
        }
        this.f32839f2.O(false);
        f1();
        if (this.Z1 != null) {
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new r21(this, 3));
        }
    }
}

package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class m31 extends sa {
    public ImageView T1;
    public FrameLayout U1;
    public hi.d V1;
    public CharSequence W1;
    public boolean X1;
    public CharSequence Y1;
    public jt Z1;
    public String f37362a2;
    public String f37363b2;
    public int f37364c2;
    public String[] d2;
    public String[] f37365e2;
    public c51 f37366f2;
    public boolean f37367g2;
    public int f37368h2;
    public int f37369i2;
    public int f37370j2;

    @Override
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(ek0Var, getContext(), this.f30139a, 0, true, new e31(this, 0), this.J0);
        this.f37366f2 = c51Var;
        c51Var.f34026r = false;
        return c51Var;
    }

    @Override
    public final CharSequence P0() {
        return "Translate";
    }

    @Override
    public final void R0(float f10) {
        ImageView imageView = this.T1;
        float f11 = 1.0f - f10;
        imageView.setAlpha(f11);
        imageView.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
        imageView.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
    }

    public final void e1(a70 a70Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i7 = org.telegram.ui.ActionBar.m6.E8;
        int i10 = org.telegram.ui.ActionBar.m6.F8;
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(1, getContext(), this.J0, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        y0Var.setText(str);
        y0Var.setChecked(z10);
        y0Var.d(org.telegram.ui.ActionBar.m6.w0(i7, this.J0), org.telegram.ui.ActionBar.m6.w0(i10, this.J0));
        y0Var.setSelectorColor(org.telegram.ui.ActionBar.m6.r1(0.12f, org.telegram.ui.ActionBar.m6.w0(i7, this.J0)));
        y0Var.setOnClickListener(new m(a70Var, z10, runnable, 1));
        linearLayout.addView(y0Var, c8.na.o(-1, -2));
    }

    public final void f1() {
        if (this.f37368h2 >= 0) {
            ConnectionsManager.getInstance(this.f30139a).cancelRequest(this.f37368h2, true);
            this.f37368h2 = -1;
        }
    }

    public final void g1() {
        String charSequence;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.W1};
        tL_textWithEntities.entities = org.telegram.messenger.si.d0(this.f30139a).Y(charSequenceArr, true, true);
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
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.N0(2131748586, null));
        spannableStringBuilder.setSpan(new r80(null, org.telegram.messenger.g0.L(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.Y1 = spannableStringBuilder;
        this.X1 = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.f37363b2;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i7 = this.f37364c2;
        if (i7 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.d2[i7];
        }
        this.f37368h2 = ConnectionsManager.getInstance(this.f30139a).sendRequestTyped(tL_messages_translateText, new d3.b(1), new e31(this, 1));
        this.f37366f2.O(true);
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
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29290a7, this.J0);
            if (w02 != this.f37370j2) {
                this.f37370j2 = w02;
                v0(w02);
            }
            if (frameLayout != null && (frameLayout.getBackground() instanceof GradientDrawable) && w02 != this.f37369i2) {
                this.f37369i2 = w02;
                ((GradientDrawable) frameLayout.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, w02), w02, w02});
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        hi.d dVar = this.V1;
        super.show();
        na naVar = this.f39488p1;
        if (naVar != null) {
            naVar.setTitle("Translate");
        }
        this.f37366f2.O(false);
        g1();
        if (this.Z1 != null) {
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new d31(this, 3));
        }
    }
}

package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class y31 extends ha {
    public ImageView P1;
    public FrameLayout Q1;
    public vh.d R1;
    public CharSequence S1;
    public boolean T1;
    public Spannable U1;
    public gt V1;
    public String W1;
    public String X1;
    public int Y1;
    public String[] Z1;
    public String[] a2;
    public q51 f32710b2;
    public boolean f32711c2;
    public int f32712d2;
    public int f32713e2;
    public int f32714f2;

    @Override
    public final tk0 L0(uk0 uk0Var) {
        q51 q51Var = new q51(uk0Var, getContext(), this.f21584a, 0, true, new q31(this, 0), this.I0);
        this.f32710b2 = q51Var;
        q51Var.f29638r = false;
        return q51Var;
    }

    @Override
    public final CharSequence O0() {
        return "Translate";
    }

    @Override
    public final void Q0(float f7) {
        ImageView imageView = this.P1;
        float f10 = 1.0f - f7;
        imageView.setAlpha(f10);
        imageView.setScaleX(org.telegram.messenger.i0.T1(0.6f, 1.0f, f10));
        imageView.setScaleY(org.telegram.messenger.i0.T1(0.6f, 1.0f, f10));
    }

    public final void d1(z60 z60Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.t6.E8;
        int i11 = org.telegram.ui.ActionBar.t6.F8;
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(1, getContext(), this.I0, false, false);
        b1Var.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        b1Var.setText(str);
        b1Var.setChecked(z10);
        b1Var.d(org.telegram.ui.ActionBar.t6.w0(i10, this.I0), org.telegram.ui.ActionBar.t6.w0(i11, this.I0));
        b1Var.setSelectorColor(org.telegram.ui.ActionBar.t6.r1(0.12f, org.telegram.ui.ActionBar.t6.w0(i10, this.I0)));
        b1Var.setOnClickListener(new h(z60Var, z10, runnable, 1));
        linearLayout.addView(b1Var, w7.b6.o(-1, -2));
    }

    public final void e1() {
        if (this.f32712d2 >= 0) {
            ConnectionsManager.getInstance(this.f21584a).cancelRequest(this.f32712d2, true);
            this.f32712d2 = -1;
        }
    }

    public final void f1() {
        String charSequence;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.S1};
        tL_textWithEntities.entities = org.telegram.messenger.vi.b0(this.f21584a).W(charSequenceArr, true, true);
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
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.dd.L0(2131748789, null));
        spannableStringBuilder.setSpan(new u80(null, org.telegram.messenger.i0.L(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.U1 = spannableStringBuilder;
        this.T1 = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.X1;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i10 = this.Y1;
        if (i10 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.Z1[i10];
        }
        this.f32712d2 = ConnectionsManager.getInstance(this.f21584a).sendRequestTyped(tL_messages_translateText, new a3.b(1), new q31(this, 1));
        this.f32710b2.O(true);
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
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20873a7, this.I0);
            if (w02 != this.f32714f2) {
                this.f32714f2 = w02;
                v0(w02);
            }
            if (frameLayout != null && (frameLayout.getBackground() instanceof GradientDrawable) && w02 != this.f32713e2) {
                this.f32713e2 = w02;
                ((GradientDrawable) frameLayout.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, w02), w02, w02});
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void show() {
        vh.d dVar = this.R1;
        super.show();
        da daVar = this.l1;
        if (daVar != null) {
            daVar.setTitle("Translate");
        }
        this.f32710b2.O(false);
        f1();
        if (this.V1 != null) {
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new p31(this, 3));
        }
    }
}

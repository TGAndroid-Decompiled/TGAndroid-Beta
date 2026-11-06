package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public abstract class pn extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public static final int L = 0;
    public boolean D;
    public boolean E;
    public AnimatorSet F;
    public boolean G;
    public boolean H;
    public float I;
    public int J;
    public boolean K;
    public TLRPC.Document f37017a;
    public final TextView f37018b;
    public final TextView f37019c;
    public on d;
    public final int f37020e;
    public final FrameLayout f37021f;
    public l9 h;
    public l9 f37022n;
    public final org.telegram.ui.ActionBar.f6 f37023r;
    public boolean f37024s;
    public ch0 f37025w;
    public TextView f37026x;
    public ei.k f37027y;

    public pn(Context context, int i7, TLRPC.Document document, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        setOrientation(1);
        this.f37020e = i7;
        this.f37023r = f6Var;
        setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, 0);
        TextView textView = new TextView(context);
        this.f37018b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextAlignment(4);
        textView.setGravity(17);
        TextView textView2 = new TextView(context);
        this.f37019c = textView2;
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f37021f = frameLayout;
        l9 l9Var = new l9(context);
        this.h = l9Var;
        l9Var.getImageReceiver().R0 = true;
        frameLayout.addView(this.h, c8.ha.c(112.0f, 112));
        c8.ka.a(this.h);
        l9 l9Var2 = new l9(context);
        this.f37022n = l9Var2;
        l9Var2.getImageReceiver().R0 = true;
        frameLayout.addView(this.f37022n, c8.ha.c(112.0f, 112));
        this.f37022n.setVisibility(8);
        this.f37022n.setAlpha(0.0f);
        c8.ka.a(this.f37022n);
        e();
        updateColors();
        String M0 = org.telegram.messenger.hd.M0(2131748192, null);
        String M02 = org.telegram.messenger.hd.M0(2131748190, null);
        textView.setText(M0);
        textView2.setText(M02);
        textView2.setMaxWidth(fi.m3.a(textView2.getText(), textView2.getPaint()));
        this.h.setContentDescription(textView2.getText());
        this.f37017a = document;
        if (document == null) {
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i7);
            TLRPC.Document document2 = b02.f25852y0;
            b02.n1();
            this.f37017a = document2;
        }
    }

    public static void a(pn pnVar) {
        AnimatorSet animatorSet = pnVar.F;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        pnVar.f37022n.setVisibility(0);
        pnVar.h.setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        pnVar.F = animatorSet2;
        animatorSet2.setDuration(420L);
        pnVar.F.setInterpolator(xq.h);
        pnVar.F.addListener(new t9(pnVar));
        AnimatorSet animatorSet3 = pnVar.F;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pnVar.f37022n, property, 0.0f, 1.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(pnVar.f37022n, property2, 0.7f, 1.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(pnVar.f37022n, property3, 0.7f, 1.0f);
        l9 l9Var = pnVar.f37022n;
        float[] fArr = {-org.telegram.messenger.g0.L(24.0f), 0.0f};
        Property property4 = View.TRANSLATION_Y;
        animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(l9Var, property4, fArr), ObjectAnimator.ofFloat(pnVar.h, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(pnVar.h, property2, 1.0f, 0.7f), ObjectAnimator.ofFloat(pnVar.h, property3, 1.0f, 0.7f), ObjectAnimator.ofFloat(pnVar.h, property4, 0.0f, org.telegram.messenger.g0.L(24.0f)));
        pnVar.F.start();
    }

    public static String b(TLRPC.Document document) {
        float min;
        float f10;
        int i7;
        if (org.telegram.messenger.g0.Q1()) {
            min = org.telegram.messenger.g0.Q0();
            f10 = 0.4f;
        } else {
            Point point = org.telegram.messenger.g0.f22544q;
            min = Math.min(point.x, point.y);
            f10 = 0.5f;
        }
        float f11 = min * f10;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < document.attributes.size()) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                    i10 = documentAttribute.f26960w;
                    i7 = documentAttribute.h;
                    break;
                }
                i11++;
            } else {
                i7 = 0;
                break;
            }
        }
        if (org.telegram.messenger.ij.L2(document, true) && i10 == 0 && i7 == 0) {
            i10 = 512;
            i7 = 512;
        }
        if (i10 == 0) {
            i7 = (int) f11;
            i10 = org.telegram.messenger.g0.L(100.0f) + i7;
        }
        int i12 = (int) ((f11 / i10) * i7);
        int i13 = (int) f11;
        float f12 = i12;
        if (f12 > f11) {
            i13 = (int) ((f11 / f12) * i13);
            i12 = i13;
        }
        float f13 = i13;
        float f14 = org.telegram.messenger.g0.f22543p;
        Locale locale = Locale.US;
        return com.google.android.recaptcha.internal.a.j((int) (f13 / f14), "_", (int) (i12 / f14));
    }

    public final void c(boolean z9, boolean z10, SpannableStringBuilder spannableStringBuilder, String str, View.OnClickListener onClickListener) {
        if (this.D == z9) {
            return;
        }
        this.D = z9;
        this.E = z10;
        if (z9) {
            if (this.f37025w == null) {
                ?? imageView = new ImageView(getContext());
                this.f37025w = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.f37025w.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                this.f37025w.setBackground(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(78.0f), 469762048));
                if (z10) {
                    this.f37025w.setImageResource(2131231097);
                } else {
                    this.f37025w.f(2131624077, 80, 80, null);
                    this.f37025w.setOnClickListener(new h0(this, 7));
                }
            }
            this.f37025w.d();
            if (this.f37026x == null) {
                TextView textView = new TextView(getContext());
                this.f37026x = textView;
                textView.setTextAlignment(4);
                this.f37026x.setGravity(17);
                this.f37026x.setTextSize(1, 13.0f);
            }
            this.f37026x.setText(spannableStringBuilder);
            TextView textView2 = this.f37026x;
            textView2.setMaxWidth(fi.m3.a(textView2.getText(), this.f37026x.getPaint()));
            TextView textView3 = this.f37026x;
            int i7 = org.telegram.ui.ActionBar.k6.Wc;
            org.telegram.ui.ActionBar.f6 f6Var = this.f37023r;
            org.telegram.ui.ActionBar.r6.V(textView3, i7, f6Var);
            this.f37026x.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            if (this.f37027y == null) {
                ei.k kVar = new ei.k(getContext(), 6);
                this.f37027y = kVar;
                kVar.setTextAlignment(4);
                this.f37027y.setGravity(17);
                this.f37027y.setTypeface(org.telegram.messenger.g0.o());
                this.f37027y.setTextSize(1, 14.0f);
                this.f37027y.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
                ei.k kVar2 = this.f37027y;
                int L2 = org.telegram.messenger.g0.L(15.0f);
                kVar2.setBackground(org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, 503316480, 855638016, 855638016));
                c8.ka.a(this.f37027y);
            }
            this.f37027y.setText(str);
            org.telegram.ui.ActionBar.r6.V(this.f37027y, i7, f6Var);
            this.f37027y.setOnClickListener(onClickListener);
        }
        e();
    }

    public final void d(CharSequence charSequence, CharSequence charSequence2) {
        String trim;
        String trim2;
        int i7;
        this.H = true;
        if (charSequence == null) {
            trim = null;
        } else {
            trim = charSequence.toString().trim();
        }
        if (TextUtils.isEmpty(trim)) {
            charSequence = org.telegram.messenger.hd.M0(2131748192, null);
        }
        this.f37018b.setText(charSequence);
        if (charSequence2 == null) {
            trim2 = null;
        } else {
            trim2 = charSequence2.toString().trim();
        }
        if (TextUtils.isEmpty(trim2)) {
            charSequence2 = org.telegram.messenger.hd.M0(2131748190, null);
        }
        TextView textView = this.f37019c;
        textView.setText(charSequence2);
        if (textView.getText().length() > 60) {
            i7 = Math.min((int) (org.telegram.messenger.g0.f22544q.x * 0.5f), fi.m3.a(textView.getText(), textView.getPaint()));
        } else {
            i7 = (int) (org.telegram.messenger.g0.f22544q.x * 0.5f);
        }
        textView.setMaxWidth(i7);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (!this.K) {
            org.telegram.ui.ActionBar.f6 f6Var = this.f37023r;
            if (f6Var != null) {
                f6Var.b(0.0f, this.I + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.J);
            } else {
                org.telegram.ui.ActionBar.k6.r(0.0f, this.I + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.J);
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.k6.W0("paintChatActionBackground", f6Var));
        } else {
            canvas2 = canvas;
        }
        if (!this.f37024s) {
            this.f37024s = true;
            setSticker(this.f37017a);
        }
        super.dispatchDraw(canvas2);
    }

    public final void e() {
        int i7;
        removeAllViews();
        if (this.D) {
            addView(this.f37025w, c8.ha.t(78, 78, 49, 20, 9, 20, 9));
            boolean D3 = org.telegram.messenger.qp.s1(this.f37020e).D3();
            TextView textView = this.f37026x;
            if (D3) {
                i7 = 13;
            } else {
                i7 = 9;
            }
            addView(textView, c8.ha.t(-2, -2, 49, 20, 0, 20, i7));
            if (!D3) {
                ei.k kVar = this.f37027y;
                if ((kVar != null && !TextUtils.isEmpty(kVar.getText())) || !this.E) {
                    addView(this.f37027y, c8.ha.t(-2, 30, 49, 20, 2, 20, 13));
                    return;
                }
                return;
            }
            return;
        }
        addView(this.f37018b, c8.ha.t(-2, -2, 1, 20, 6, 20, 6));
        addView(this.f37019c, c8.ha.t(-2, -2, 1, 20, 6, 20, 6));
        addView(this.f37021f, c8.ha.t(112, 112, 1, 16, 10, 16, 16));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f37017a == null) {
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.f37020e);
            TLRPC.Document document = b02.f25852y0;
            b02.n1();
            this.f37017a = document;
            if (this.f37024s) {
                setSticker(document);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    public void onMeasure(int i7, int i10) {
        this.G = true;
        boolean z9 = this.H;
        TextView textView = this.f37019c;
        if (!z9) {
            textView.setVisibility(0);
        }
        this.h.setVisibility(0);
        super.onMeasure(i7, i10);
        if (getMeasuredHeight() > View.MeasureSpec.getSize(i10) && !this.H) {
            textView.setVisibility(8);
            this.h.setVisibility(8);
        } else {
            if (!this.H) {
                textView.setVisibility(0);
            }
            this.h.setVisibility(0);
        }
        this.G = false;
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.G) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        this.K = true;
    }

    public void setListener(on onVar) {
        this.d = onVar;
    }

    public void setSticker(TLRPC.Document document) {
        TLRPC.Document document2;
        if (document == null) {
            return;
        }
        this.f37024s = true;
        this.f37022n.b();
        org.telegram.messenger.rz f10 = org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.k6.Zc, 1.0f, null);
        if (f10 != null) {
            this.h.p(org.telegram.messenger.hc.b(document), b(document), f10, document);
            document2 = document;
        } else {
            document2 = document;
            this.h.l(org.telegram.messenger.hc.b(document), b(document), org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document), null, 0, document2);
        }
        this.h.setOnClickListener(new mn(this, document2, 0));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.f6 f6Var = this.f37023r;
        TextView textView = this.f37018b;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wc, f6Var));
        }
        TextView textView2 = this.f37019c;
        if (textView2 != null) {
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wc, f6Var));
        }
    }

    public void setSticker(String str) {
        if (str == null) {
            return;
        }
        this.f37024s = true;
        this.f37022n.b();
        this.h.l(org.telegram.messenger.hc.g(str), "256_256", null, null, 0, null);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

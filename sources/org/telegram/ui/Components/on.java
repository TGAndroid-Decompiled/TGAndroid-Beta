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
public abstract class on extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public static final int L = 0;
    public boolean D;
    public boolean E;
    public AnimatorSet F;
    public boolean G;
    public boolean H;
    public float I;
    public int J;
    public boolean K;
    public TLRPC.Document f36641a;
    public final TextView f36642b;
    public final TextView f36643c;
    public nn d;
    public final int f36644e;
    public final FrameLayout f36645f;
    public k9 h;
    public k9 f36646n;
    public final org.telegram.ui.ActionBar.h6 f36647r;
    public boolean f36648s;
    public ch0 f36649w;
    public TextView f36650x;
    public ei.k f36651y;

    public on(Context context, int i7, TLRPC.Document document, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        setOrientation(1);
        this.f36644e = i7;
        this.f36647r = h6Var;
        setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, 0);
        TextView textView = new TextView(context);
        this.f36642b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextAlignment(4);
        textView.setGravity(17);
        TextView textView2 = new TextView(context);
        this.f36643c = textView2;
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36645f = frameLayout;
        k9 k9Var = new k9(context);
        this.h = k9Var;
        k9Var.getImageReceiver().R0 = true;
        frameLayout.addView(this.h, c8.ha.c(112.0f, 112));
        c8.ka.a(this.h);
        k9 k9Var2 = new k9(context);
        this.f36646n = k9Var2;
        k9Var2.getImageReceiver().R0 = true;
        frameLayout.addView(this.f36646n, c8.ha.c(112.0f, 112));
        this.f36646n.setVisibility(8);
        this.f36646n.setAlpha(0.0f);
        c8.ka.a(this.f36646n);
        e();
        updateColors();
        String M0 = org.telegram.messenger.id.M0(2131748193, null);
        String M02 = org.telegram.messenger.id.M0(2131748191, null);
        textView.setText(M0);
        textView2.setText(M02);
        textView2.setMaxWidth(fi.m3.a(textView2.getText(), textView2.getPaint()));
        this.h.setContentDescription(textView2.getText());
        this.f36641a = document;
        if (document == null) {
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i7);
            TLRPC.Document document2 = b02.f25859y0;
            b02.n1();
            this.f36641a = document2;
        }
    }

    public static void a(on onVar) {
        AnimatorSet animatorSet = onVar.F;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        onVar.f36646n.setVisibility(0);
        onVar.h.setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        onVar.F = animatorSet2;
        animatorSet2.setDuration(420L);
        onVar.F.setInterpolator(wq.h);
        onVar.F.addListener(new s9(onVar));
        AnimatorSet animatorSet3 = onVar.F;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(onVar.f36646n, property, 0.0f, 1.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(onVar.f36646n, property2, 0.7f, 1.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(onVar.f36646n, property3, 0.7f, 1.0f);
        k9 k9Var = onVar.f36646n;
        float[] fArr = {-org.telegram.messenger.g0.L(24.0f), 0.0f};
        Property property4 = View.TRANSLATION_Y;
        animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(k9Var, property4, fArr), ObjectAnimator.ofFloat(onVar.h, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(onVar.h, property2, 1.0f, 0.7f), ObjectAnimator.ofFloat(onVar.h, property3, 1.0f, 0.7f), ObjectAnimator.ofFloat(onVar.h, property4, 0.0f, org.telegram.messenger.g0.L(24.0f)));
        onVar.F.start();
    }

    public static String b(TLRPC.Document document) {
        float min;
        float f10;
        int i7;
        if (org.telegram.messenger.g0.Q1()) {
            min = org.telegram.messenger.g0.Q0();
            f10 = 0.4f;
        } else {
            Point point = org.telegram.messenger.g0.f22567q;
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
                    i10 = documentAttribute.f26967w;
                    i7 = documentAttribute.h;
                    break;
                }
                i11++;
            } else {
                i7 = 0;
                break;
            }
        }
        if (org.telegram.messenger.ij.K2(document, true) && i10 == 0 && i7 == 0) {
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
        float f14 = org.telegram.messenger.g0.f22566p;
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
            if (this.f36649w == null) {
                ?? imageView = new ImageView(getContext());
                this.f36649w = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.f36649w.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                this.f36649w.setBackground(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(78.0f), 469762048));
                if (z10) {
                    this.f36649w.setImageResource(2131231097);
                } else {
                    this.f36649w.f(2131624077, 80, 80, null);
                    this.f36649w.setOnClickListener(new g0(this, 7));
                }
            }
            this.f36649w.d();
            if (this.f36650x == null) {
                TextView textView = new TextView(getContext());
                this.f36650x = textView;
                textView.setTextAlignment(4);
                this.f36650x.setGravity(17);
                this.f36650x.setTextSize(1, 13.0f);
            }
            this.f36650x.setText(spannableStringBuilder);
            TextView textView2 = this.f36650x;
            textView2.setMaxWidth(fi.m3.a(textView2.getText(), this.f36650x.getPaint()));
            TextView textView3 = this.f36650x;
            int i7 = org.telegram.ui.ActionBar.m6.Wc;
            org.telegram.ui.ActionBar.h6 h6Var = this.f36647r;
            org.telegram.ui.ActionBar.t6.U(textView3, i7, h6Var);
            this.f36650x.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            if (this.f36651y == null) {
                ei.k kVar = new ei.k(getContext(), 6);
                this.f36651y = kVar;
                kVar.setTextAlignment(4);
                this.f36651y.setGravity(17);
                this.f36651y.setTypeface(org.telegram.messenger.g0.o());
                this.f36651y.setTextSize(1, 14.0f);
                this.f36651y.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
                ei.k kVar2 = this.f36651y;
                int L2 = org.telegram.messenger.g0.L(15.0f);
                kVar2.setBackground(org.telegram.ui.ActionBar.m6.k0(L2, L2, L2, L2, 503316480, 855638016, 855638016));
                c8.ka.a(this.f36651y);
            }
            this.f36651y.setText(str);
            org.telegram.ui.ActionBar.t6.U(this.f36651y, i7, h6Var);
            this.f36651y.setOnClickListener(onClickListener);
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
            charSequence = org.telegram.messenger.id.M0(2131748193, null);
        }
        this.f36642b.setText(charSequence);
        if (charSequence2 == null) {
            trim2 = null;
        } else {
            trim2 = charSequence2.toString().trim();
        }
        if (TextUtils.isEmpty(trim2)) {
            charSequence2 = org.telegram.messenger.id.M0(2131748191, null);
        }
        TextView textView = this.f36643c;
        textView.setText(charSequence2);
        if (textView.getText().length() > 60) {
            i7 = Math.min((int) (org.telegram.messenger.g0.f22567q.x * 0.5f), fi.m3.a(textView.getText(), textView.getPaint()));
        } else {
            i7 = (int) (org.telegram.messenger.g0.f22567q.x * 0.5f);
        }
        textView.setMaxWidth(i7);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (!this.K) {
            org.telegram.ui.ActionBar.h6 h6Var = this.f36647r;
            if (h6Var != null) {
                h6Var.b(0.0f, this.I + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.J);
            } else {
                org.telegram.ui.ActionBar.m6.r(0.0f, this.I + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.J);
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.m6.W0("paintChatActionBackground", h6Var));
        } else {
            canvas2 = canvas;
        }
        if (!this.f36648s) {
            this.f36648s = true;
            setSticker(this.f36641a);
        }
        super.dispatchDraw(canvas2);
    }

    public final void e() {
        int i7;
        removeAllViews();
        if (this.D) {
            addView(this.f36649w, c8.ha.t(78, 78, 49, 20, 9, 20, 9));
            boolean D3 = org.telegram.messenger.qp.s1(this.f36644e).D3();
            TextView textView = this.f36650x;
            if (D3) {
                i7 = 13;
            } else {
                i7 = 9;
            }
            addView(textView, c8.ha.t(-2, -2, 49, 20, 0, 20, i7));
            if (!D3) {
                ei.k kVar = this.f36651y;
                if ((kVar != null && !TextUtils.isEmpty(kVar.getText())) || !this.E) {
                    addView(this.f36651y, c8.ha.t(-2, 30, 49, 20, 2, 20, 13));
                    return;
                }
                return;
            }
            return;
        }
        addView(this.f36642b, c8.ha.t(-2, -2, 1, 20, 6, 20, 6));
        addView(this.f36643c, c8.ha.t(-2, -2, 1, 20, 6, 20, 6));
        addView(this.f36645f, c8.ha.t(112, 112, 1, 16, 10, 16, 16));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f36641a == null) {
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.f36644e);
            TLRPC.Document document = b02.f25859y0;
            b02.n1();
            this.f36641a = document;
            if (this.f36648s) {
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
        TextView textView = this.f36643c;
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

    public void setListener(nn nnVar) {
        this.d = nnVar;
    }

    public void setSticker(TLRPC.Document document) {
        TLRPC.Document document2;
        if (document == null) {
            return;
        }
        this.f36648s = true;
        this.f36646n.b();
        org.telegram.messenger.rz f10 = org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.m6.Zc, 1.0f, null);
        if (f10 != null) {
            this.h.p(org.telegram.messenger.hc.b(document), b(document), f10, document);
            document2 = document;
        } else {
            document2 = document;
            this.h.l(org.telegram.messenger.hc.b(document), b(document), org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document), null, 0, document2);
        }
        this.h.setOnClickListener(new ln(this, document2, 0));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.h6 h6Var = this.f36647r;
        TextView textView = this.f36642b;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Wc, h6Var));
        }
        TextView textView2 = this.f36643c;
        if (textView2 != null) {
            textView2.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Wc, h6Var));
        }
    }

    public void setSticker(String str) {
        if (str == null) {
            return;
        }
        this.f36648s = true;
        this.f36646n.b();
        this.h.l(org.telegram.messenger.hc.g(str), "256_256", null, null, 0, null);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

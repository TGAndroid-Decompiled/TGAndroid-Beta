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
public abstract class io extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public static final int M = 0;
    public boolean E;
    public boolean F;
    public AnimatorSet G;
    public boolean H;
    public boolean I;
    public float J;
    public int K;
    public boolean L;
    public TLRPC.Document f36244a;
    public final TextView f36245b;
    public final TextView f36246c;
    public ho d;
    public final int f36247e;
    public final FrameLayout f36248f;
    public q9 h;
    public q9 f36249n;
    public final org.telegram.ui.ActionBar.h6 f36250r;
    public boolean f36251s;
    public rh0 f36252w;
    public TextView f36253x;
    public gi.j f36254y;

    public io(Context context, int i7, TLRPC.Document document, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        setOrientation(1);
        this.f36247e = i7;
        this.f36250r = h6Var;
        setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, 0);
        TextView textView = new TextView(context);
        this.f36245b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextAlignment(4);
        textView.setGravity(17);
        TextView textView2 = new TextView(context);
        this.f36246c = textView2;
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36248f = frameLayout;
        q9 q9Var = new q9(context);
        this.h = q9Var;
        q9Var.getImageReceiver().S0 = true;
        frameLayout.addView(this.h, c8.na.c(112.0f, 112));
        c8.sa.a(this.h);
        q9 q9Var2 = new q9(context);
        this.f36249n = q9Var2;
        q9Var2.getImageReceiver().S0 = true;
        frameLayout.addView(this.f36249n, c8.na.c(112.0f, 112));
        this.f36249n.setVisibility(8);
        this.f36249n.setAlpha(0.0f);
        c8.sa.a(this.f36249n);
        e();
        updateColors();
        String N0 = org.telegram.messenger.hd.N0(2131748000, null);
        String N02 = org.telegram.messenger.hd.N0(2131747998, null);
        textView.setText(N0);
        textView2.setText(N02);
        textView2.setMaxWidth(hi.l3.a(textView2.getText(), textView2.getPaint()));
        this.h.setContentDescription(textView2.getText());
        this.f36244a = document;
        if (document == null) {
            org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i7);
            TLRPC.Document document2 = d02.f26832z0;
            d02.q1();
            this.f36244a = document2;
        }
    }

    public static void a(io ioVar) {
        AnimatorSet animatorSet = ioVar.G;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ioVar.f36249n.setVisibility(0);
        ioVar.h.setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ioVar.G = animatorSet2;
        animatorSet2.setDuration(420L);
        ioVar.G.setInterpolator(nr.h);
        ioVar.G.addListener(new org.telegram.ui.on(ioVar));
        AnimatorSet animatorSet3 = ioVar.G;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ioVar.f36249n, property, 0.0f, 1.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ioVar.f36249n, property2, 0.7f, 1.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(ioVar.f36249n, property3, 0.7f, 1.0f);
        q9 q9Var = ioVar.f36249n;
        float[] fArr = {-org.telegram.messenger.g0.L(24.0f), 0.0f};
        Property property4 = View.TRANSLATION_Y;
        animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(q9Var, property4, fArr), ObjectAnimator.ofFloat(ioVar.h, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(ioVar.h, property2, 1.0f, 0.7f), ObjectAnimator.ofFloat(ioVar.h, property3, 1.0f, 0.7f), ObjectAnimator.ofFloat(ioVar.h, property4, 0.0f, org.telegram.messenger.g0.L(24.0f)));
        ioVar.G.start();
    }

    public static String b(TLRPC.Document document) {
        float min;
        float f10;
        int i7;
        if (org.telegram.messenger.g0.Q1()) {
            min = org.telegram.messenger.g0.Q0();
            f10 = 0.4f;
        } else {
            Point point = org.telegram.messenger.g0.f24010q;
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
                    i10 = documentAttribute.f28405w;
                    i7 = documentAttribute.h;
                    break;
                }
                i11++;
            } else {
                i7 = 0;
                break;
            }
        }
        if (org.telegram.messenger.gj.K2(document, true) && i10 == 0 && i7 == 0) {
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
        float f14 = org.telegram.messenger.g0.f24009p;
        Locale locale = Locale.US;
        return com.google.android.gms.internal.vision.e2.j((int) (f13 / f14), "_", (int) (i12 / f14));
    }

    public final void c(boolean z10, boolean z11, SpannableStringBuilder spannableStringBuilder, String str, View.OnClickListener onClickListener) {
        if (this.E == z10) {
            return;
        }
        this.E = z10;
        this.F = z11;
        if (z10) {
            if (this.f36252w == null) {
                ?? imageView = new ImageView(getContext());
                this.f36252w = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.f36252w.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                this.f36252w.setBackground(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(78.0f), 469762048));
                if (z11) {
                    this.f36252w.setImageResource(2131231097);
                } else {
                    this.f36252w.f(2131624078, 80, 80, null);
                    this.f36252w.setOnClickListener(new o0(this, 8));
                }
            }
            this.f36252w.d();
            if (this.f36253x == null) {
                TextView textView = new TextView(getContext());
                this.f36253x = textView;
                textView.setTextAlignment(4);
                this.f36253x.setGravity(17);
                this.f36253x.setTextSize(1, 13.0f);
            }
            this.f36253x.setText(spannableStringBuilder);
            TextView textView2 = this.f36253x;
            textView2.setMaxWidth(hi.l3.a(textView2.getText(), this.f36253x.getPaint()));
            TextView textView3 = this.f36253x;
            int i7 = org.telegram.ui.ActionBar.m6.Zc;
            org.telegram.ui.ActionBar.h6 h6Var = this.f36250r;
            org.telegram.ui.ActionBar.t6.U(textView3, i7, h6Var);
            this.f36253x.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            if (this.f36254y == null) {
                gi.j jVar = new gi.j(getContext(), 6);
                this.f36254y = jVar;
                jVar.setTextAlignment(4);
                this.f36254y.setGravity(17);
                this.f36254y.setTypeface(org.telegram.messenger.g0.o());
                this.f36254y.setTextSize(1, 14.0f);
                this.f36254y.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
                gi.j jVar2 = this.f36254y;
                int L = org.telegram.messenger.g0.L(15.0f);
                jVar2.setBackground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, 503316480, 855638016, 855638016));
                c8.sa.a(this.f36254y);
            }
            this.f36254y.setText(str);
            org.telegram.ui.ActionBar.t6.U(this.f36254y, i7, h6Var);
            this.f36254y.setOnClickListener(onClickListener);
        }
        e();
    }

    public final void d(CharSequence charSequence, CharSequence charSequence2) {
        String trim;
        String trim2;
        int i7;
        this.I = true;
        if (charSequence == null) {
            trim = null;
        } else {
            trim = charSequence.toString().trim();
        }
        if (TextUtils.isEmpty(trim)) {
            charSequence = org.telegram.messenger.hd.N0(2131748000, null);
        }
        this.f36245b.setText(charSequence);
        if (charSequence2 == null) {
            trim2 = null;
        } else {
            trim2 = charSequence2.toString().trim();
        }
        if (TextUtils.isEmpty(trim2)) {
            charSequence2 = org.telegram.messenger.hd.N0(2131747998, null);
        }
        TextView textView = this.f36246c;
        textView.setText(charSequence2);
        if (textView.getText().length() > 60) {
            i7 = Math.min((int) (org.telegram.messenger.g0.f24010q.x * 0.5f), hi.l3.a(textView.getText(), textView.getPaint()));
        } else {
            i7 = (int) (org.telegram.messenger.g0.f24010q.x * 0.5f);
        }
        textView.setMaxWidth(i7);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (!this.L) {
            org.telegram.ui.ActionBar.h6 h6Var = this.f36250r;
            if (h6Var != null) {
                h6Var.e(0.0f, this.J + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.K);
            } else {
                org.telegram.ui.ActionBar.m6.r(0.0f, this.J + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.K);
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.m6.W0("paintChatActionBackground", h6Var));
        } else {
            canvas2 = canvas;
        }
        if (!this.f36251s) {
            this.f36251s = true;
            setSticker(this.f36244a);
        }
        super.dispatchDraw(canvas2);
    }

    public final void e() {
        int i7;
        removeAllViews();
        if (this.E) {
            addView(this.f36252w, c8.na.t(78, 78, 49, 20, 9, 20, 9));
            boolean K3 = org.telegram.messenger.np.u1(this.f36247e).K3();
            TextView textView = this.f36253x;
            if (K3) {
                i7 = 13;
            } else {
                i7 = 9;
            }
            addView(textView, c8.na.t(-2, -2, 49, 20, 0, 20, i7));
            if (!K3) {
                gi.j jVar = this.f36254y;
                if ((jVar != null && !TextUtils.isEmpty(jVar.getText())) || !this.F) {
                    addView(this.f36254y, c8.na.t(-2, 30, 49, 20, 2, 20, 13));
                    return;
                }
                return;
            }
            return;
        }
        addView(this.f36245b, c8.na.t(-2, -2, 1, 20, 6, 20, 6));
        addView(this.f36246c, c8.na.t(-2, -2, 1, 20, 6, 20, 6));
        addView(this.f36248f, c8.na.t(112, 112, 1, 16, 10, 16, 16));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f36244a == null) {
            org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(this.f36247e);
            TLRPC.Document document = d02.f26832z0;
            d02.q1();
            this.f36244a = document;
            if (this.f36251s) {
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
        this.H = true;
        boolean z10 = this.I;
        TextView textView = this.f36246c;
        if (!z10) {
            textView.setVisibility(0);
        }
        this.h.setVisibility(0);
        super.onMeasure(i7, i10);
        if (getMeasuredHeight() > View.MeasureSpec.getSize(i10) && !this.I) {
            textView.setVisibility(8);
            this.h.setVisibility(8);
        } else {
            if (!this.I) {
                textView.setVisibility(0);
            }
            this.h.setVisibility(0);
        }
        this.H = false;
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.H) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        this.L = true;
    }

    public void setListener(ho hoVar) {
        this.d = hoVar;
    }

    public void setSticker(TLRPC.Document document) {
        TLRPC.Document document2;
        if (document == null) {
            return;
        }
        this.f36251s = true;
        this.f36249n.b();
        org.telegram.messenger.mz f10 = org.telegram.messenger.u5.f(document, org.telegram.ui.ActionBar.m6.f29336cd, 1.0f, null);
        if (f10 != null) {
            this.h.p(org.telegram.messenger.gc.b(document), b(document), f10, document);
            document2 = document;
        } else {
            document2 = document;
            this.h.l(org.telegram.messenger.gc.b(document), b(document), org.telegram.messenger.gc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document), null, 0, document2);
        }
        this.h.setOnClickListener(new fo(this, document2, 0));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.h6 h6Var = this.f36250r;
        TextView textView = this.f36245b;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Zc, h6Var));
        }
        TextView textView2 = this.f36246c;
        if (textView2 != null) {
            textView2.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Zc, h6Var));
        }
    }

    public void setSticker(String str) {
        if (str == null) {
            return;
        }
        this.f36251s = true;
        this.f36249n.b();
        this.h.l(org.telegram.messenger.gc.g(str), "256_256", null, null, 0, null);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

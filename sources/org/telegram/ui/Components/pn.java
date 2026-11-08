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
    public TLRPC.Document f37043a;
    public final TextView f37044b;
    public final TextView f37045c;
    public on d;
    public final int f37046e;
    public final FrameLayout f37047f;
    public l9 h;
    public l9 f37048n;
    public final org.telegram.ui.ActionBar.f6 f37049r;
    public boolean f37050s;
    public ch0 f37051w;
    public TextView f37052x;
    public ei.k f37053y;

    public pn(Context context, int i7, TLRPC.Document document, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        setOrientation(1);
        this.f37046e = i7;
        this.f37049r = f6Var;
        setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, 0);
        TextView textView = new TextView(context);
        this.f37044b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextAlignment(4);
        textView.setGravity(17);
        TextView textView2 = new TextView(context);
        this.f37045c = textView2;
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f37047f = frameLayout;
        l9 l9Var = new l9(context);
        this.h = l9Var;
        l9Var.getImageReceiver().R0 = true;
        frameLayout.addView(this.h, c8.ha.c(112.0f, 112));
        c8.ka.a(this.h);
        l9 l9Var2 = new l9(context);
        this.f37048n = l9Var2;
        l9Var2.getImageReceiver().R0 = true;
        frameLayout.addView(this.f37048n, c8.ha.c(112.0f, 112));
        this.f37048n.setVisibility(8);
        this.f37048n.setAlpha(0.0f);
        c8.ka.a(this.f37048n);
        e();
        updateColors();
        String M0 = org.telegram.messenger.id.M0(2131748194, null);
        String M02 = org.telegram.messenger.id.M0(2131748192, null);
        textView.setText(M0);
        textView2.setText(M02);
        textView2.setMaxWidth(fi.m3.a(textView2.getText(), textView2.getPaint()));
        this.h.setContentDescription(textView2.getText());
        this.f37043a = document;
        if (document == null) {
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i7);
            TLRPC.Document document2 = b02.f25855y0;
            b02.n1();
            this.f37043a = document2;
        }
    }

    public static void a(pn pnVar) {
        AnimatorSet animatorSet = pnVar.F;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        pnVar.f37048n.setVisibility(0);
        pnVar.h.setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        pnVar.F = animatorSet2;
        animatorSet2.setDuration(420L);
        pnVar.F.setInterpolator(xq.h);
        pnVar.F.addListener(new t9(pnVar));
        AnimatorSet animatorSet3 = pnVar.F;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pnVar.f37048n, property, 0.0f, 1.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(pnVar.f37048n, property2, 0.7f, 1.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(pnVar.f37048n, property3, 0.7f, 1.0f);
        l9 l9Var = pnVar.f37048n;
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
            Point point = org.telegram.messenger.g0.f22563q;
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
                    i10 = documentAttribute.f26963w;
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
        float f14 = org.telegram.messenger.g0.f22562p;
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
            if (this.f37051w == null) {
                ?? imageView = new ImageView(getContext());
                this.f37051w = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.f37051w.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                this.f37051w.setBackground(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(78.0f), 469762048));
                if (z10) {
                    this.f37051w.setImageResource(2131231097);
                } else {
                    this.f37051w.f(2131624077, 80, 80, null);
                    this.f37051w.setOnClickListener(new h0(this, 7));
                }
            }
            this.f37051w.d();
            if (this.f37052x == null) {
                TextView textView = new TextView(getContext());
                this.f37052x = textView;
                textView.setTextAlignment(4);
                this.f37052x.setGravity(17);
                this.f37052x.setTextSize(1, 13.0f);
            }
            this.f37052x.setText(spannableStringBuilder);
            TextView textView2 = this.f37052x;
            textView2.setMaxWidth(fi.m3.a(textView2.getText(), this.f37052x.getPaint()));
            TextView textView3 = this.f37052x;
            int i7 = org.telegram.ui.ActionBar.k6.Wc;
            org.telegram.ui.ActionBar.f6 f6Var = this.f37049r;
            org.telegram.ui.ActionBar.r6.V(textView3, i7, f6Var);
            this.f37052x.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            if (this.f37053y == null) {
                ei.k kVar = new ei.k(getContext(), 6);
                this.f37053y = kVar;
                kVar.setTextAlignment(4);
                this.f37053y.setGravity(17);
                this.f37053y.setTypeface(org.telegram.messenger.g0.o());
                this.f37053y.setTextSize(1, 14.0f);
                this.f37053y.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
                ei.k kVar2 = this.f37053y;
                int L2 = org.telegram.messenger.g0.L(15.0f);
                kVar2.setBackground(org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, 503316480, 855638016, 855638016));
                c8.ka.a(this.f37053y);
            }
            this.f37053y.setText(str);
            org.telegram.ui.ActionBar.r6.V(this.f37053y, i7, f6Var);
            this.f37053y.setOnClickListener(onClickListener);
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
            charSequence = org.telegram.messenger.id.M0(2131748194, null);
        }
        this.f37044b.setText(charSequence);
        if (charSequence2 == null) {
            trim2 = null;
        } else {
            trim2 = charSequence2.toString().trim();
        }
        if (TextUtils.isEmpty(trim2)) {
            charSequence2 = org.telegram.messenger.id.M0(2131748192, null);
        }
        TextView textView = this.f37045c;
        textView.setText(charSequence2);
        if (textView.getText().length() > 60) {
            i7 = Math.min((int) (org.telegram.messenger.g0.f22563q.x * 0.5f), fi.m3.a(textView.getText(), textView.getPaint()));
        } else {
            i7 = (int) (org.telegram.messenger.g0.f22563q.x * 0.5f);
        }
        textView.setMaxWidth(i7);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (!this.K) {
            org.telegram.ui.ActionBar.f6 f6Var = this.f37049r;
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
        if (!this.f37050s) {
            this.f37050s = true;
            setSticker(this.f37043a);
        }
        super.dispatchDraw(canvas2);
    }

    public final void e() {
        int i7;
        removeAllViews();
        if (this.D) {
            addView(this.f37051w, c8.ha.t(78, 78, 49, 20, 9, 20, 9));
            boolean D3 = org.telegram.messenger.qp.s1(this.f37046e).D3();
            TextView textView = this.f37052x;
            if (D3) {
                i7 = 13;
            } else {
                i7 = 9;
            }
            addView(textView, c8.ha.t(-2, -2, 49, 20, 0, 20, i7));
            if (!D3) {
                ei.k kVar = this.f37053y;
                if ((kVar != null && !TextUtils.isEmpty(kVar.getText())) || !this.E) {
                    addView(this.f37053y, c8.ha.t(-2, 30, 49, 20, 2, 20, 13));
                    return;
                }
                return;
            }
            return;
        }
        addView(this.f37044b, c8.ha.t(-2, -2, 1, 20, 6, 20, 6));
        addView(this.f37045c, c8.ha.t(-2, -2, 1, 20, 6, 20, 6));
        addView(this.f37047f, c8.ha.t(112, 112, 1, 16, 10, 16, 16));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f37043a == null) {
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.f37046e);
            TLRPC.Document document = b02.f25855y0;
            b02.n1();
            this.f37043a = document;
            if (this.f37050s) {
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
        TextView textView = this.f37045c;
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
        this.f37050s = true;
        this.f37048n.b();
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
        org.telegram.ui.ActionBar.f6 f6Var = this.f37049r;
        TextView textView = this.f37044b;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wc, f6Var));
        }
        TextView textView2 = this.f37045c;
        if (textView2 != null) {
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wc, f6Var));
        }
    }

    public void setSticker(String str) {
        if (str == null) {
            return;
        }
        this.f37050s = true;
        this.f37048n.b();
        this.h.l(org.telegram.messenger.hc.g(str), "256_256", null, null, 0, null);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

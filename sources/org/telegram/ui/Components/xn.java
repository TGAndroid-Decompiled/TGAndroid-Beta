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
public abstract class xn extends LinearLayout implements org.telegram.ui.ActionBar.k6 {
    public static final int L = 0;
    public boolean D;
    public boolean E;
    public AnimatorSet F;
    public boolean G;
    public boolean H;
    public float I;
    public int J;
    public boolean K;
    public TLRPC.Document f32605a;
    public final TextView f32606b;
    public final TextView f32607c;
    public wn d;
    public final int e;
    public final FrameLayout f32608f;
    public g9 h;
    public g9 f32609n;
    public final org.telegram.ui.ActionBar.p6 f32610r;
    public boolean f32611s;
    public fi0 f32612w;
    public TextView f32613x;
    public bi.j6 f32614y;

    public xn(Context context, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        setOrientation(1);
        this.e = i10;
        this.f32610r = p6Var;
        setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, 0);
        TextView textView = new TextView(context);
        this.f32606b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextAlignment(4);
        textView.setGravity(17);
        TextView textView2 = new TextView(context);
        this.f32607c = textView2;
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32608f = frameLayout;
        g9 g9Var = new g9(context);
        this.h = g9Var;
        g9Var.getImageReceiver().R0 = true;
        frameLayout.addView(this.h, w7.b6.c(112.0f, 112));
        w7.e6.a(this.h);
        g9 g9Var2 = new g9(context);
        this.f32609n = g9Var2;
        g9Var2.getImageReceiver().R0 = true;
        frameLayout.addView(this.f32609n, w7.b6.c(112.0f, 112));
        this.f32609n.setVisibility(8);
        this.f32609n.setAlpha(0.0f);
        w7.e6.a(this.f32609n);
        e();
        updateColors();
        String L0 = org.telegram.messenger.dd.L0(2131748210, null);
        String L02 = org.telegram.messenger.dd.L0(2131748208, null);
        textView.setText(L0);
        textView2.setText(L02);
        textView2.setMaxWidth(vh.p2.a(textView2.getText(), textView2.getPaint()));
        this.h.setContentDescription(textView2.getText());
        this.f32605a = document;
        if (document == null) {
            org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(i10);
            TLRPC.Document document2 = b02.f18689y0;
            b02.n1();
            this.f32605a = document2;
        }
    }

    public static void a(xn xnVar) {
        AnimatorSet animatorSet = xnVar.F;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        xnVar.f32609n.setVisibility(0);
        xnVar.h.setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        xnVar.F = animatorSet2;
        animatorSet2.setDuration(420L);
        xnVar.F.setInterpolator(gr.h);
        xnVar.F.addListener(new eg.m(xnVar));
        AnimatorSet animatorSet3 = xnVar.F;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(xnVar.f32609n, property, 0.0f, 1.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(xnVar.f32609n, property2, 0.7f, 1.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(xnVar.f32609n, property3, 0.7f, 1.0f);
        g9 g9Var = xnVar.f32609n;
        float[] fArr = {-org.telegram.messenger.i0.L(24.0f), 0.0f};
        Property property4 = View.TRANSLATION_Y;
        animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(g9Var, property4, fArr), ObjectAnimator.ofFloat(xnVar.h, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(xnVar.h, property2, 1.0f, 0.7f), ObjectAnimator.ofFloat(xnVar.h, property3, 1.0f, 0.7f), ObjectAnimator.ofFloat(xnVar.h, property4, 0.0f, org.telegram.messenger.i0.L(24.0f)));
        xnVar.F.start();
    }

    public static String b(TLRPC.Document document) {
        float min;
        float f7;
        int i10;
        if (org.telegram.messenger.i0.Q1()) {
            min = org.telegram.messenger.i0.Q0();
            f7 = 0.4f;
        } else {
            Point point = org.telegram.messenger.i0.f16172q;
            min = Math.min(point.x, point.y);
            f7 = 0.5f;
        }
        float f10 = min * f7;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 < document.attributes.size()) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                    i11 = documentAttribute.f19801w;
                    i10 = documentAttribute.h;
                    break;
                }
                i12++;
            } else {
                i10 = 0;
                break;
            }
        }
        if (org.telegram.messenger.kj.K2(document, true) && i11 == 0 && i10 == 0) {
            i11 = 512;
            i10 = 512;
        }
        if (i11 == 0) {
            i10 = (int) f10;
            i11 = org.telegram.messenger.i0.L(100.0f) + i10;
        }
        int i13 = (int) ((f10 / i11) * i10);
        int i14 = (int) f10;
        float f11 = i13;
        if (f11 > f10) {
            i14 = (int) ((f10 / f11) * i14);
            i13 = i14;
        }
        float f12 = i14;
        float f13 = org.telegram.messenger.i0.f16171p;
        Locale locale = Locale.US;
        return a1.g.i((int) (f12 / f13), (int) (i13 / f13), "_");
    }

    public final void c(boolean z10, boolean z11, SpannableStringBuilder spannableStringBuilder, String str, View.OnClickListener onClickListener) {
        if (this.D == z10) {
            return;
        }
        this.D = z10;
        this.E = z11;
        if (z10) {
            if (this.f32612w == null) {
                ?? imageView = new ImageView(getContext());
                this.f32612w = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.f32612w.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                this.f32612w.setBackground(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(78.0f), 469762048));
                if (z11) {
                    this.f32612w.setImageResource(2131231097);
                } else {
                    this.f32612w.f(2131624076, 80, 80, null);
                    this.f32612w.setOnClickListener(new h0(this, 6));
                }
            }
            this.f32612w.d();
            if (this.f32613x == null) {
                TextView textView = new TextView(getContext());
                this.f32613x = textView;
                textView.setTextAlignment(4);
                this.f32613x.setGravity(17);
                this.f32613x.setTextSize(1, 13.0f);
            }
            this.f32613x.setText(spannableStringBuilder);
            TextView textView2 = this.f32613x;
            textView2.setMaxWidth(vh.p2.a(textView2.getText(), this.f32613x.getPaint()));
            TextView textView3 = this.f32613x;
            int i10 = org.telegram.ui.ActionBar.t6.Wc;
            org.telegram.ui.ActionBar.p6 p6Var = this.f32610r;
            org.telegram.ui.ActionBar.a7.V(textView3, i10, p6Var);
            this.f32613x.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
            if (this.f32614y == null) {
                bi.j6 j6Var = new bi.j6(getContext(), 5);
                this.f32614y = j6Var;
                j6Var.setTextAlignment(4);
                this.f32614y.setGravity(17);
                this.f32614y.setTypeface(org.telegram.messenger.i0.o());
                this.f32614y.setTextSize(1, 14.0f);
                this.f32614y.setPadding(org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(8.0f));
                bi.j6 j6Var2 = this.f32614y;
                int L2 = org.telegram.messenger.i0.L(15.0f);
                j6Var2.setBackground(org.telegram.ui.ActionBar.t6.k0(L2, L2, L2, L2, 503316480, 855638016, 855638016));
                w7.e6.a(this.f32614y);
            }
            this.f32614y.setText(str);
            org.telegram.ui.ActionBar.a7.V(this.f32614y, i10, p6Var);
            this.f32614y.setOnClickListener(onClickListener);
        }
        e();
    }

    public final void d(CharSequence charSequence, CharSequence charSequence2) {
        String trim;
        String trim2;
        int i10;
        this.H = true;
        if (charSequence == null) {
            trim = null;
        } else {
            trim = charSequence.toString().trim();
        }
        if (TextUtils.isEmpty(trim)) {
            charSequence = org.telegram.messenger.dd.L0(2131748210, null);
        }
        this.f32606b.setText(charSequence);
        if (charSequence2 == null) {
            trim2 = null;
        } else {
            trim2 = charSequence2.toString().trim();
        }
        if (TextUtils.isEmpty(trim2)) {
            charSequence2 = org.telegram.messenger.dd.L0(2131748208, null);
        }
        TextView textView = this.f32607c;
        textView.setText(charSequence2);
        if (textView.getText().length() > 60) {
            i10 = Math.min((int) (org.telegram.messenger.i0.f16172q.x * 0.5f), vh.p2.a(textView.getText(), textView.getPaint()));
        } else {
            i10 = (int) (org.telegram.messenger.i0.f16172q.x * 0.5f);
        }
        textView.setMaxWidth(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (!this.K) {
            org.telegram.ui.ActionBar.p6 p6Var = this.f32610r;
            if (p6Var != null) {
                p6Var.b(0.0f, this.I + org.telegram.messenger.i0.L(4.0f), getMeasuredWidth(), this.J);
            } else {
                org.telegram.ui.ActionBar.t6.r(0.0f, this.I + org.telegram.messenger.i0.L(4.0f), getMeasuredWidth(), this.J);
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.ui.ActionBar.t6.W0("paintChatActionBackground", p6Var));
        } else {
            canvas2 = canvas;
        }
        if (!this.f32611s) {
            this.f32611s = true;
            setSticker(this.f32605a);
        }
        super.dispatchDraw(canvas2);
    }

    public final void e() {
        int i10;
        removeAllViews();
        if (this.D) {
            addView(this.f32612w, w7.b6.t(78, 78, 49, 20, 9, 20, 9));
            boolean A3 = org.telegram.messenger.wp.r1(this.e).A3();
            TextView textView = this.f32613x;
            if (A3) {
                i10 = 13;
            } else {
                i10 = 9;
            }
            addView(textView, w7.b6.t(-2, -2, 49, 20, 0, 20, i10));
            if (!A3) {
                bi.j6 j6Var = this.f32614y;
                if ((j6Var != null && !TextUtils.isEmpty(j6Var.getText())) || !this.E) {
                    addView(this.f32614y, w7.b6.t(-2, 30, 49, 20, 2, 20, 13));
                    return;
                }
                return;
            }
            return;
        }
        addView(this.f32606b, w7.b6.t(-2, -2, 1, 20, 6, 20, 6));
        addView(this.f32607c, w7.b6.t(-2, -2, 1, 20, 6, 20, 6));
        addView(this.f32608f, w7.b6.t(112, 112, 1, 16, 10, 16, 16));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f32605a == null) {
            org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(this.e);
            TLRPC.Document document = b02.f18689y0;
            b02.n1();
            this.f32605a = document;
            if (this.f32611s) {
                setSticker(document);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        this.G = true;
        boolean z10 = this.H;
        TextView textView = this.f32607c;
        if (!z10) {
            textView.setVisibility(0);
        }
        this.h.setVisibility(0);
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() > View.MeasureSpec.getSize(i11) && !this.H) {
            textView.setVisibility(8);
            this.h.setVisibility(8);
        } else {
            if (!this.H) {
                textView.setVisibility(0);
            }
            this.h.setVisibility(0);
        }
        this.G = false;
        super.onMeasure(i10, i11);
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

    public void setListener(wn wnVar) {
        this.d = wnVar;
    }

    public void setSticker(TLRPC.Document document) {
        TLRPC.Document document2;
        if (document == null) {
            return;
        }
        this.f32611s = true;
        this.f32609n.b();
        org.telegram.messenger.d00 f7 = org.telegram.messenger.v5.f(document, org.telegram.ui.ActionBar.t6.Zc, 1.0f, null);
        if (f7 != null) {
            this.h.p(org.telegram.messenger.jc.b(document), b(document), f7, document);
            document2 = document;
        } else {
            document2 = document;
            this.h.l(org.telegram.messenger.jc.b(document), b(document), org.telegram.messenger.jc.c(org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false), document), null, 0, document2);
        }
        this.h.setOnClickListener(new un(this, document2, 0));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.p6 p6Var = this.f32610r;
        TextView textView = this.f32606b;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wc, p6Var));
        }
        TextView textView2 = this.f32607c;
        if (textView2 != null) {
            textView2.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wc, p6Var));
        }
    }

    public void setSticker(String str) {
        if (str == null) {
            return;
        }
        this.f32611s = true;
        this.f32609n.b();
        this.h.l(org.telegram.messenger.jc.g(str), "256_256", null, null, 0, null);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

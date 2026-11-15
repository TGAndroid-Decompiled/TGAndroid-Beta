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
public abstract class xn extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public static final int M = 0;
    public boolean E;
    public boolean F;
    public AnimatorSet G;
    public boolean H;
    public boolean I;
    public float J;
    public int K;
    public boolean L;
    public TLRPC.Document f41723a;
    public final TextView f41724b;
    public final TextView f41725c;
    public wn d;
    public final int f41726e;
    public final FrameLayout f41727f;
    public i9 h;
    public i9 f41728n;
    public final org.telegram.ui.ActionBar.e6 f41729r;
    public boolean f41730s;
    public fh0 f41731w;
    public TextView f41732x;
    public gi.j f41733y;

    public xn(Context context, int i7, TLRPC.Document document, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        setOrientation(1);
        this.f41726e = i7;
        this.f41729r = e6Var;
        setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, 0);
        TextView textView = new TextView(context);
        this.f41724b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextAlignment(4);
        textView.setGravity(17);
        TextView textView2 = new TextView(context);
        this.f41725c = textView2;
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f41727f = frameLayout;
        i9 i9Var = new i9(context);
        this.h = i9Var;
        i9Var.getImageReceiver().S0 = true;
        frameLayout.addView(this.h, c8.ja.c(112.0f, 112));
        c8.na.a(this.h);
        i9 i9Var2 = new i9(context);
        this.f41728n = i9Var2;
        i9Var2.getImageReceiver().S0 = true;
        frameLayout.addView(this.f41728n, c8.ja.c(112.0f, 112));
        this.f41728n.setVisibility(8);
        this.f41728n.setAlpha(0.0f);
        c8.na.a(this.f41728n);
        e();
        updateColors();
        String M0 = org.telegram.messenger.hd.M0(2131748193, null);
        String M02 = org.telegram.messenger.hd.M0(2131748191, null);
        textView.setText(M0);
        textView2.setText(M02);
        textView2.setMaxWidth(hi.l3.a(textView2.getText(), textView2.getPaint()));
        this.h.setContentDescription(textView2.getText());
        this.f41723a = document;
        if (document == null) {
            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i7);
            TLRPC.Document document2 = b02.f26526z0;
            b02.n1();
            this.f41723a = document2;
        }
    }

    public static void a(xn xnVar) {
        AnimatorSet animatorSet = xnVar.G;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        xnVar.f41728n.setVisibility(0);
        xnVar.h.setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        xnVar.G = animatorSet2;
        animatorSet2.setDuration(420L);
        xnVar.G.setInterpolator(er.h);
        xnVar.G.addListener(new org.telegram.ui.nn(xnVar));
        AnimatorSet animatorSet3 = xnVar.G;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(xnVar.f41728n, property, 0.0f, 1.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(xnVar.f41728n, property2, 0.7f, 1.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(xnVar.f41728n, property3, 0.7f, 1.0f);
        i9 i9Var = xnVar.f41728n;
        float[] fArr = {-org.telegram.messenger.g0.L(24.0f), 0.0f};
        Property property4 = View.TRANSLATION_Y;
        animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(i9Var, property4, fArr), ObjectAnimator.ofFloat(xnVar.h, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(xnVar.h, property2, 1.0f, 0.7f), ObjectAnimator.ofFloat(xnVar.h, property3, 1.0f, 0.7f), ObjectAnimator.ofFloat(xnVar.h, property4, 0.0f, org.telegram.messenger.g0.L(24.0f)));
        xnVar.G.start();
    }

    public static String b(TLRPC.Document document) {
        float min;
        float f10;
        int i7;
        if (org.telegram.messenger.g0.Q1()) {
            min = org.telegram.messenger.g0.Q0();
            f10 = 0.4f;
        } else {
            Point point = org.telegram.messenger.g0.f23611q;
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
                    i10 = documentAttribute.f28058w;
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
        float f14 = org.telegram.messenger.g0.f23610p;
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
            if (this.f41731w == null) {
                ?? imageView = new ImageView(getContext());
                this.f41731w = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.f41731w.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                this.f41731w.setBackground(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(78.0f), 469762048));
                if (z11) {
                    this.f41731w.setImageResource(2131231097);
                } else {
                    this.f41731w.f(2131624078, 80, 80, null);
                    this.f41731w.setOnClickListener(new e0(this, 8));
                }
            }
            this.f41731w.d();
            if (this.f41732x == null) {
                TextView textView = new TextView(getContext());
                this.f41732x = textView;
                textView.setTextAlignment(4);
                this.f41732x.setGravity(17);
                this.f41732x.setTextSize(1, 13.0f);
            }
            this.f41732x.setText(spannableStringBuilder);
            TextView textView2 = this.f41732x;
            textView2.setMaxWidth(hi.l3.a(textView2.getText(), this.f41732x.getPaint()));
            TextView textView3 = this.f41732x;
            int i7 = org.telegram.ui.ActionBar.j6.Zc;
            org.telegram.ui.ActionBar.e6 e6Var = this.f41729r;
            org.telegram.ui.ActionBar.q6.U(textView3, i7, e6Var);
            this.f41732x.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            if (this.f41733y == null) {
                gi.j jVar = new gi.j(getContext(), 6);
                this.f41733y = jVar;
                jVar.setTextAlignment(4);
                this.f41733y.setGravity(17);
                this.f41733y.setTypeface(org.telegram.messenger.g0.o());
                this.f41733y.setTextSize(1, 14.0f);
                this.f41733y.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
                gi.j jVar2 = this.f41733y;
                int L = org.telegram.messenger.g0.L(15.0f);
                jVar2.setBackground(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, 503316480, 855638016, 855638016));
                c8.na.a(this.f41733y);
            }
            this.f41733y.setText(str);
            org.telegram.ui.ActionBar.q6.U(this.f41733y, i7, e6Var);
            this.f41733y.setOnClickListener(onClickListener);
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
            charSequence = org.telegram.messenger.hd.M0(2131748193, null);
        }
        this.f41724b.setText(charSequence);
        if (charSequence2 == null) {
            trim2 = null;
        } else {
            trim2 = charSequence2.toString().trim();
        }
        if (TextUtils.isEmpty(trim2)) {
            charSequence2 = org.telegram.messenger.hd.M0(2131748191, null);
        }
        TextView textView = this.f41725c;
        textView.setText(charSequence2);
        if (textView.getText().length() > 60) {
            i7 = Math.min((int) (org.telegram.messenger.g0.f23611q.x * 0.5f), hi.l3.a(textView.getText(), textView.getPaint()));
        } else {
            i7 = (int) (org.telegram.messenger.g0.f23611q.x * 0.5f);
        }
        textView.setMaxWidth(i7);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (!this.L) {
            org.telegram.ui.ActionBar.e6 e6Var = this.f41729r;
            if (e6Var != null) {
                e6Var.b(0.0f, this.J + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.K);
            } else {
                org.telegram.ui.ActionBar.j6.r(0.0f, this.J + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.K);
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.j6.W0("paintChatActionBackground", e6Var));
        } else {
            canvas2 = canvas;
        }
        if (!this.f41730s) {
            this.f41730s = true;
            setSticker(this.f41723a);
        }
        super.dispatchDraw(canvas2);
    }

    public final void e() {
        int i7;
        removeAllViews();
        if (this.E) {
            addView(this.f41731w, c8.ja.t(78, 78, 49, 20, 9, 20, 9));
            boolean D3 = org.telegram.messenger.np.s1(this.f41726e).D3();
            TextView textView = this.f41732x;
            if (D3) {
                i7 = 13;
            } else {
                i7 = 9;
            }
            addView(textView, c8.ja.t(-2, -2, 49, 20, 0, 20, i7));
            if (!D3) {
                gi.j jVar = this.f41733y;
                if ((jVar != null && !TextUtils.isEmpty(jVar.getText())) || !this.F) {
                    addView(this.f41733y, c8.ja.t(-2, 30, 49, 20, 2, 20, 13));
                    return;
                }
                return;
            }
            return;
        }
        addView(this.f41724b, c8.ja.t(-2, -2, 1, 20, 6, 20, 6));
        addView(this.f41725c, c8.ja.t(-2, -2, 1, 20, 6, 20, 6));
        addView(this.f41727f, c8.ja.t(112, 112, 1, 16, 10, 16, 16));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f41723a == null) {
            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(this.f41726e);
            TLRPC.Document document = b02.f26526z0;
            b02.n1();
            this.f41723a = document;
            if (this.f41730s) {
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
        TextView textView = this.f41725c;
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

    public void setListener(wn wnVar) {
        this.d = wnVar;
    }

    public void setSticker(TLRPC.Document document) {
        TLRPC.Document document2;
        if (document == null) {
            return;
        }
        this.f41730s = true;
        this.f41728n.b();
        org.telegram.messenger.pz f10 = org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.j6.f28838cd, 1.0f, null);
        if (f10 != null) {
            this.h.p(org.telegram.messenger.gc.b(document), b(document), f10, document);
            document2 = document;
        } else {
            document2 = document;
            this.h.l(org.telegram.messenger.gc.b(document), b(document), org.telegram.messenger.gc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document), null, 0, document2);
        }
        this.h.setOnClickListener(new un(this, document2, 0));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.e6 e6Var = this.f41729r;
        TextView textView = this.f41724b;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Zc, e6Var));
        }
        TextView textView2 = this.f41725c;
        if (textView2 != null) {
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Zc, e6Var));
        }
    }

    public void setSticker(String str) {
        if (str == null) {
            return;
        }
        this.f41730s = true;
        this.f41728n.b();
        this.h.l(org.telegram.messenger.gc.g(str), "256_256", null, null, 0, null);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

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
public abstract class go extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public static final int M = 0;
    public boolean E;
    public boolean F;
    public AnimatorSet G;
    public boolean H;
    public boolean I;
    public float J;
    public int K;
    public boolean L;
    public TLRPC.Document f35535a;
    public final TextView f35536b;
    public final TextView f35537c;
    public fo d;
    public final int f35538e;
    public final FrameLayout f35539f;
    public q9 h;
    public q9 f35540n;
    public final org.telegram.ui.ActionBar.i6 f35541r;
    public boolean f35542s;
    public ph0 f35543w;
    public TextView f35544x;
    public gi.j f35545y;

    public go(Context context, int i7, TLRPC.Document document, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        setOrientation(1);
        this.f35538e = i7;
        this.f35541r = i6Var;
        setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, 0);
        TextView textView = new TextView(context);
        this.f35536b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextAlignment(4);
        textView.setGravity(17);
        TextView textView2 = new TextView(context);
        this.f35537c = textView2;
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35539f = frameLayout;
        q9 q9Var = new q9(context);
        this.h = q9Var;
        q9Var.getImageReceiver().S0 = true;
        frameLayout.addView(this.h, c8.ma.c(112.0f, 112));
        c8.ra.a(this.h);
        q9 q9Var2 = new q9(context);
        this.f35540n = q9Var2;
        q9Var2.getImageReceiver().S0 = true;
        frameLayout.addView(this.f35540n, c8.ma.c(112.0f, 112));
        this.f35540n.setVisibility(8);
        this.f35540n.setAlpha(0.0f);
        c8.ra.a(this.f35540n);
        e();
        updateColors();
        String M0 = org.telegram.messenger.gd.M0(2131748001, null);
        String M02 = org.telegram.messenger.gd.M0(2131747999, null);
        textView.setText(M0);
        textView2.setText(M02);
        textView2.setMaxWidth(hi.m3.a(textView2.getText(), textView2.getPaint()));
        this.h.setContentDescription(textView2.getText());
        this.f35535a = document;
        if (document == null) {
            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i7);
            TLRPC.Document document2 = d02.f26654z0;
            d02.q1();
            this.f35535a = document2;
        }
    }

    public static void a(go goVar) {
        AnimatorSet animatorSet = goVar.G;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        goVar.f35540n.setVisibility(0);
        goVar.h.setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        goVar.G = animatorSet2;
        animatorSet2.setDuration(420L);
        goVar.G.setInterpolator(lr.h);
        goVar.G.addListener(new org.telegram.ui.on(goVar));
        AnimatorSet animatorSet3 = goVar.G;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(goVar.f35540n, property, 0.0f, 1.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(goVar.f35540n, property2, 0.7f, 1.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(goVar.f35540n, property3, 0.7f, 1.0f);
        q9 q9Var = goVar.f35540n;
        float[] fArr = {-org.telegram.messenger.g0.L(24.0f), 0.0f};
        Property property4 = View.TRANSLATION_Y;
        animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(q9Var, property4, fArr), ObjectAnimator.ofFloat(goVar.h, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(goVar.h, property2, 1.0f, 0.7f), ObjectAnimator.ofFloat(goVar.h, property3, 1.0f, 0.7f), ObjectAnimator.ofFloat(goVar.h, property4, 0.0f, org.telegram.messenger.g0.L(24.0f)));
        goVar.G.start();
    }

    public static String b(TLRPC.Document document) {
        float min;
        float f10;
        int i7;
        if (org.telegram.messenger.g0.Q1()) {
            min = org.telegram.messenger.g0.Q0();
            f10 = 0.4f;
        } else {
            Point point = org.telegram.messenger.g0.f24118q;
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
                    i10 = documentAttribute.f28410w;
                    i7 = documentAttribute.h;
                    break;
                }
                i11++;
            } else {
                i7 = 0;
                break;
            }
        }
        if (org.telegram.messenger.fj.K2(document, true) && i10 == 0 && i7 == 0) {
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
        float f14 = org.telegram.messenger.g0.f24117p;
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
            if (this.f35543w == null) {
                ?? imageView = new ImageView(getContext());
                this.f35543w = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.f35543w.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                this.f35543w.setBackground(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(78.0f), 469762048));
                if (z11) {
                    this.f35543w.setImageResource(2131231097);
                } else {
                    this.f35543w.f(2131624078, 80, 80, null);
                    this.f35543w.setOnClickListener(new n0(this, 8));
                }
            }
            this.f35543w.d();
            if (this.f35544x == null) {
                TextView textView = new TextView(getContext());
                this.f35544x = textView;
                textView.setTextAlignment(4);
                this.f35544x.setGravity(17);
                this.f35544x.setTextSize(1, 13.0f);
            }
            this.f35544x.setText(spannableStringBuilder);
            TextView textView2 = this.f35544x;
            textView2.setMaxWidth(hi.m3.a(textView2.getText(), this.f35544x.getPaint()));
            TextView textView3 = this.f35544x;
            int i7 = org.telegram.ui.ActionBar.n6.Zc;
            org.telegram.ui.ActionBar.i6 i6Var = this.f35541r;
            org.telegram.ui.ActionBar.u6.U(textView3, i7, i6Var);
            this.f35544x.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            if (this.f35545y == null) {
                gi.j jVar = new gi.j(getContext(), 6);
                this.f35545y = jVar;
                jVar.setTextAlignment(4);
                this.f35545y.setGravity(17);
                this.f35545y.setTypeface(org.telegram.messenger.g0.o());
                this.f35545y.setTextSize(1, 14.0f);
                this.f35545y.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
                gi.j jVar2 = this.f35545y;
                int L = org.telegram.messenger.g0.L(15.0f);
                jVar2.setBackground(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, 503316480, 855638016, 855638016));
                c8.ra.a(this.f35545y);
            }
            this.f35545y.setText(str);
            org.telegram.ui.ActionBar.u6.U(this.f35545y, i7, i6Var);
            this.f35545y.setOnClickListener(onClickListener);
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
            charSequence = org.telegram.messenger.gd.M0(2131748001, null);
        }
        this.f35536b.setText(charSequence);
        if (charSequence2 == null) {
            trim2 = null;
        } else {
            trim2 = charSequence2.toString().trim();
        }
        if (TextUtils.isEmpty(trim2)) {
            charSequence2 = org.telegram.messenger.gd.M0(2131747999, null);
        }
        TextView textView = this.f35537c;
        textView.setText(charSequence2);
        if (textView.getText().length() > 60) {
            i7 = Math.min((int) (org.telegram.messenger.g0.f24118q.x * 0.5f), hi.m3.a(textView.getText(), textView.getPaint()));
        } else {
            i7 = (int) (org.telegram.messenger.g0.f24118q.x * 0.5f);
        }
        textView.setMaxWidth(i7);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (!this.L) {
            org.telegram.ui.ActionBar.i6 i6Var = this.f35541r;
            if (i6Var != null) {
                i6Var.e(0.0f, this.J + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.K);
            } else {
                org.telegram.ui.ActionBar.n6.r(0.0f, this.J + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.K);
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.n6.W0("paintChatActionBackground", i6Var));
        } else {
            canvas2 = canvas;
        }
        if (!this.f35542s) {
            this.f35542s = true;
            setSticker(this.f35535a);
        }
        super.dispatchDraw(canvas2);
    }

    public final void e() {
        int i7;
        removeAllViews();
        if (this.E) {
            addView(this.f35543w, c8.ma.t(78, 78, 49, 20, 9, 20, 9));
            boolean K3 = org.telegram.messenger.mp.u1(this.f35538e).K3();
            TextView textView = this.f35544x;
            if (K3) {
                i7 = 13;
            } else {
                i7 = 9;
            }
            addView(textView, c8.ma.t(-2, -2, 49, 20, 0, 20, i7));
            if (!K3) {
                gi.j jVar = this.f35545y;
                if ((jVar != null && !TextUtils.isEmpty(jVar.getText())) || !this.F) {
                    addView(this.f35545y, c8.ma.t(-2, 30, 49, 20, 2, 20, 13));
                    return;
                }
                return;
            }
            return;
        }
        addView(this.f35536b, c8.ma.t(-2, -2, 1, 20, 6, 20, 6));
        addView(this.f35537c, c8.ma.t(-2, -2, 1, 20, 6, 20, 6));
        addView(this.f35539f, c8.ma.t(112, 112, 1, 16, 10, 16, 16));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f35535a == null) {
            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(this.f35538e);
            TLRPC.Document document = d02.f26654z0;
            d02.q1();
            this.f35535a = document;
            if (this.f35542s) {
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
        TextView textView = this.f35537c;
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

    public void setListener(fo foVar) {
        this.d = foVar;
    }

    public void setSticker(TLRPC.Document document) {
        TLRPC.Document document2;
        if (document == null) {
            return;
        }
        this.f35542s = true;
        this.f35540n.b();
        org.telegram.messenger.lz f10 = org.telegram.messenger.u5.f(document, org.telegram.ui.ActionBar.n6.f29383cd, 1.0f, null);
        if (f10 != null) {
            this.h.p(org.telegram.messenger.fc.b(document), b(document), f10, document);
            document2 = document;
        } else {
            document2 = document;
            this.h.l(org.telegram.messenger.fc.b(document), b(document), org.telegram.messenger.fc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document), null, 0, document2);
        }
        this.h.setOnClickListener(new co(this, document2, 0));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.i6 i6Var = this.f35541r;
        TextView textView = this.f35536b;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Zc, i6Var));
        }
        TextView textView2 = this.f35537c;
        if (textView2 != null) {
            textView2.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Zc, i6Var));
        }
    }

    public void setSticker(String str) {
        if (str == null) {
            return;
        }
        this.f35542s = true;
        this.f35540n.b();
        this.h.l(org.telegram.messenger.fc.g(str), "256_256", null, null, 0, null);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

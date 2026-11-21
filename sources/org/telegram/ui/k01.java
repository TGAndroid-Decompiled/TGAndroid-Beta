package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public final class k01 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public ShapeDrawable E;
    public int F;
    public final s11 G;
    public final s11 H;
    public final FrameLayout f49156a;
    public final ImageView f49157b;
    public final ImageView f49158c;
    public final hi.p3 d;
    public final View f49159e;
    public final org.telegram.ui.Components.ul0 f49160f;
    public final bi.u h;
    public h11 f49161n;
    public float f49162r;
    public ValueAnimator f49163s;
    public ru0 f49164w;
    public boolean f49165x;
    public boolean f49166y;

    public k01(s11 s11Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.h6 h6Var = s11Var.f51820a1;
        this.H = s11Var;
        this.G = s11Var;
        this.f49165x = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f49156a = frameLayout;
        if (z10) {
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.G8, this, h6Var);
        }
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = org.telegram.ui.ActionBar.m6.f29798zf;
        Drawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(frameLayout, d02, M, null, h6Var);
        frameLayout.setClipToOutline(true);
        bg.q0 q0Var = bg.u0.f3355a;
        frameLayout.setOutlineProvider(new bg.s0(0, org.telegram.messenger.g0.L(18.0f)));
        addView(frameLayout, c8.ma.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f49157b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.ul0 ul0Var = new org.telegram.ui.Components.ul0();
        this.f49160f = ul0Var;
        ul0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.m6.Bf;
        ul0Var.a(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        imageView.setImageDrawable(ul0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final k01 f47103b;

            {
                this.f47103b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k01 k01Var = this.f47103b;
                        bi.u uVar = k01Var.h;
                        if (k01Var.f49160f.f40493k == 1) {
                            uVar.setText("");
                            k01Var.G.v(null, true, false);
                            h11 h11Var = k01Var.f49161n;
                            if (h11Var != null) {
                                h11Var.I1(null);
                                k01Var.f49161n.J1(true, true);
                                k01Var.f49161n.G1();
                            }
                            uVar.clearAnimation();
                            uVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.nr.h).start();
                            k01Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        k01 k01Var2 = this.f47103b;
                        s11 s11Var2 = k01Var2.G;
                        if (!s11Var2.u()) {
                            s11Var2.q();
                            k01Var2.h.requestFocus();
                            s11.a(s11Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        k01 k01Var3 = this.f47103b;
                        bi.u uVar2 = k01Var3.h;
                        uVar2.setText("");
                        k01Var3.G.v(null, true, false);
                        h11 h11Var2 = k01Var3.f49161n;
                        if (h11Var2 != null) {
                            h11Var2.I1(null);
                            k01Var3.f49161n.J1(true, true);
                        }
                        uVar2.clearAnimation();
                        uVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.nr.h).start();
                        k01Var3.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, c8.ma.e(36, 36, 51));
        hi.p3 p3Var = new hi.p3(this, context, z10);
        this.d = p3Var;
        frameLayout.addView(p3Var, c8.ma.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        bi.u uVar = new bi.u(this, context, h6Var, 2);
        this.h = uVar;
        uVar.addTextChangedListener(new m0(this, 15));
        uVar.setBackground(null);
        uVar.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
        uVar.setTextSize(1, 16.0f);
        uVar.setHint(org.telegram.messenger.gd.N0(2131745640, null));
        org.telegram.ui.ActionBar.t6.D(uVar, i10, h6Var);
        org.telegram.ui.ActionBar.t6.U(uVar, org.telegram.ui.ActionBar.m6.G6, h6Var);
        uVar.setImeOptions(268435459);
        org.telegram.ui.ActionBar.t6.l(uVar, 30, org.telegram.ui.ActionBar.m6.Di, h6Var);
        uVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        uVar.setGravity(19);
        uVar.setCursorWidth(1.5f);
        uVar.setMaxLines(1);
        uVar.setSingleLine(true);
        uVar.setLines(1);
        uVar.setTranslationY(org.telegram.messenger.g0.L(-1.0f));
        p3Var.addView(uVar, c8.ma.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.f49159e = view;
            Drawable g10 = i5.c.g(context, 2131231227);
            org.telegram.ui.ActionBar.t6.x(this, g10, i7, h6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(g10);
            view.setAlpha(0.0f);
            p3Var.addView(view, c8.ma.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener(this) {
            public final k01 f47103b;

            {
                this.f47103b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        k01 k01Var = this.f47103b;
                        bi.u uVar2 = k01Var.h;
                        if (k01Var.f49160f.f40493k == 1) {
                            uVar2.setText("");
                            k01Var.G.v(null, true, false);
                            h11 h11Var = k01Var.f49161n;
                            if (h11Var != null) {
                                h11Var.I1(null);
                                k01Var.f49161n.J1(true, true);
                                k01Var.f49161n.G1();
                            }
                            uVar2.clearAnimation();
                            uVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.nr.h).start();
                            k01Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        k01 k01Var2 = this.f47103b;
                        s11 s11Var2 = k01Var2.G;
                        if (!s11Var2.u()) {
                            s11Var2.q();
                            k01Var2.h.requestFocus();
                            s11.a(s11Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        k01 k01Var3 = this.f47103b;
                        bi.u uVar22 = k01Var3.h;
                        uVar22.setText("");
                        k01Var3.G.v(null, true, false);
                        h11 h11Var2 = k01Var3.f49161n;
                        if (h11Var2 != null) {
                            h11Var2.I1(null);
                            k01Var3.f49161n.J1(true, true);
                        }
                        uVar22.clearAnimation();
                        uVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.nr.h).start();
                        k01Var3.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f49158c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new hi.b2(this));
        int i11 = org.telegram.ui.ActionBar.m6.f29470i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i11, h6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i11);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView2, h02, null, M2, h6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final k01 f47103b;

            {
                this.f47103b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        k01 k01Var = this.f47103b;
                        bi.u uVar2 = k01Var.h;
                        if (k01Var.f49160f.f40493k == 1) {
                            uVar2.setText("");
                            k01Var.G.v(null, true, false);
                            h11 h11Var = k01Var.f49161n;
                            if (h11Var != null) {
                                h11Var.I1(null);
                                k01Var.f49161n.J1(true, true);
                                k01Var.f49161n.G1();
                            }
                            uVar2.clearAnimation();
                            uVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.nr.h).start();
                            k01Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        k01 k01Var2 = this.f47103b;
                        s11 s11Var2 = k01Var2.G;
                        if (!s11Var2.u()) {
                            s11Var2.q();
                            k01Var2.h.requestFocus();
                            s11.a(s11Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        k01 k01Var3 = this.f47103b;
                        bi.u uVar22 = k01Var3.h;
                        uVar22.setText("");
                        k01Var3.G.v(null, true, false);
                        h11 h11Var2 = k01Var3.f49161n;
                        if (h11Var2 != null) {
                            h11Var2.I1(null);
                            k01Var3.f49161n.J1(true, true);
                        }
                        uVar22.clearAnimation();
                        uVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.nr.h).start();
                        k01Var3.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, c8.ma.e(36, 36, 53));
        if (!ch.f0.d) {
            b();
        }
    }

    public static void a(k01 k01Var, boolean z10) {
        if (z10) {
            if (k01Var.f49164w == null) {
                ru0 ru0Var = new ru0(k01Var, 16);
                k01Var.f49164w = ru0Var;
                org.telegram.messenger.g0.h3(ru0Var, 340L);
                return;
            }
            return;
        }
        ru0 ru0Var2 = k01Var.f49164w;
        if (ru0Var2 != null) {
            org.telegram.messenger.g0.r(ru0Var2);
            k01Var.f49164w = null;
        }
        org.telegram.messenger.g0.T3(k01Var.f49158c, false, true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.E8));
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k01.b():void");
    }

    public final void c(boolean z10) {
        float f10;
        if (z10 == this.f49165x) {
            return;
        }
        this.f49165x = z10;
        ValueAnimator valueAnimator = this.f49163s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f49162r;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f49163s = ofFloat;
        ofFloat.addUpdateListener(new iz0(this, 5));
        this.f49163s.setDuration(120L);
        this.f49163s.setInterpolator(org.telegram.ui.Components.nr.h);
        this.f49163s.start();
    }

    public final void d(boolean z10) {
        ?? r62;
        h11 h11Var;
        h11 h11Var2;
        org.telegram.ui.Components.ul0 ul0Var = this.f49160f;
        int i7 = ul0Var.f40493k;
        bi.u uVar = this.h;
        int i10 = 2;
        if (i7 == 2 && ((uVar.length() != 0 || ((h11Var2 = this.f49161n) != null && h11Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (uVar.length() <= 0 && ((h11Var = this.f49161n) == null || h11Var.f37301w3 <= 0.5f || (!h11Var.f37296r3 && h11Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        ul0Var.b(r62);
        ImageView imageView = this.f49157b;
        imageView.setClickable(r62);
        String str = null;
        if (r62 != 0) {
            str = org.telegram.messenger.gd.N0(2131754878, null);
        }
        imageView.setContentDescription(str);
        if (r62 != 0) {
            i10 = 1;
        }
        imageView.setImportantForAccessibility(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float y10;
        s11 s11Var = this.H;
        ih0 ih0Var = s11Var.f51838h0;
        k01 k01Var = s11Var.f51836g0;
        t01 t01Var = s11Var.V;
        if (t01Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = ih0Var.getX() + k01Var.getX();
            float y11 = ih0Var.getY() + k01Var.getY();
            ab.g gVar = (ab.g) t01Var;
            ch.b0 b0Var = (ch.b0) gVar.f926b;
            ch.a0 a0Var = b0Var.f5323a;
            RectF rectF = org.telegram.messenger.g0.P;
            float f10 = 0;
            rectF.set(f10, f10, measuredWidth, measuredHeight);
            org.telegram.ui.Components.wi0 delegate = ((org.telegram.ui.Components.xi0) gVar.f927c).getDelegate();
            float x11 = a0Var.getX() + x10;
            if (b0Var.f5344y == 1) {
                y10 = a0Var.getY() - org.telegram.messenger.g0.f24140m;
            } else {
                y10 = a0Var.getY() + b0Var.f5325c.getY();
            }
            delegate.x(canvas, rectF, 0.0f, x11, y10 + y11, 255, true);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void invalidate() {
        if (ch.f0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), 1073741824));
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            if (this.H.V != null) {
                invalidate();
            }
        }
    }

    @Override
    public final void updateColors() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.h6 h6Var = this.G.f51820a1;
        try {
            org.telegram.ui.Components.ul0 ul0Var = this.f49160f;
            if (ul0Var != null) {
                ul0Var.a(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bf, h6Var));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.f49166y && (frameLayout = this.f49156a) != null) {
            int r12 = org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, h6Var));
            if (this.E != null) {
                Drawable background = frameLayout.getBackground();
                ShapeDrawable shapeDrawable = this.E;
                if (background == shapeDrawable) {
                    if (r12 != this.F) {
                        org.telegram.ui.ActionBar.m6.C1(r12, shapeDrawable);
                        frameLayout.invalidate();
                    }
                    this.F = r12;
                }
            }
            ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(18.0f), r12);
            this.E = d02;
            frameLayout.setBackground(d02);
            this.F = r12;
        }
    }
}

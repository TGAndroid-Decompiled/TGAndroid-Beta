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
public final class j01 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public ShapeDrawable E;
    public int F;
    public final r11 G;
    public final r11 H;
    public final FrameLayout f48832a;
    public final ImageView f48833b;
    public final ImageView f48834c;
    public final hi.q3 d;
    public final View f48835e;
    public final org.telegram.ui.Components.sl0 f48836f;
    public final bi.u h;
    public g11 f48837n;
    public float f48838r;
    public ValueAnimator f48839s;
    public ru0 f48840w;
    public boolean f48841x;
    public boolean f48842y;

    public j01(r11 r11Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.i6 i6Var = r11Var.f51378a1;
        this.H = r11Var;
        this.G = r11Var;
        this.f48841x = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f48832a = frameLayout;
        if (z10) {
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.G8, this, i6Var);
        }
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = org.telegram.ui.ActionBar.n6.f29814zf;
        Drawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(frameLayout, d02, M, null, i6Var);
        frameLayout.setClipToOutline(true);
        bg.q0 q0Var = bg.u0.f3343a;
        frameLayout.setOutlineProvider(new bg.s0(0, org.telegram.messenger.g0.L(18.0f)));
        addView(frameLayout, c8.ma.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f48833b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0();
        this.f48836f = sl0Var;
        sl0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.n6.Bf;
        sl0Var.a(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        imageView.setImageDrawable(sl0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final j01 f46803b;

            {
                this.f46803b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j01 j01Var = this.f46803b;
                        bi.u uVar = j01Var.h;
                        if (j01Var.f48836f.f39777k == 1) {
                            uVar.setText("");
                            j01Var.G.v(null, true, false);
                            g11 g11Var = j01Var.f48837n;
                            if (g11Var != null) {
                                g11Var.I1(null);
                                j01Var.f48837n.J1(true, true);
                                j01Var.f48837n.G1();
                            }
                            uVar.clearAnimation();
                            uVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.lr.h).start();
                            j01Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        j01 j01Var2 = this.f46803b;
                        r11 r11Var2 = j01Var2.G;
                        if (!r11Var2.u()) {
                            r11Var2.q();
                            j01Var2.h.requestFocus();
                            r11.a(r11Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        j01 j01Var3 = this.f46803b;
                        bi.u uVar2 = j01Var3.h;
                        uVar2.setText("");
                        j01Var3.G.v(null, true, false);
                        g11 g11Var2 = j01Var3.f48837n;
                        if (g11Var2 != null) {
                            g11Var2.I1(null);
                            j01Var3.f48837n.J1(true, true);
                        }
                        uVar2.clearAnimation();
                        uVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.lr.h).start();
                        j01Var3.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, c8.ma.e(36, 36, 51));
        hi.q3 q3Var = new hi.q3(this, context, z10);
        this.d = q3Var;
        frameLayout.addView(q3Var, c8.ma.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        bi.u uVar = new bi.u(this, context, i6Var, 2);
        this.h = uVar;
        uVar.addTextChangedListener(new m0(this, 15));
        uVar.setBackground(null);
        uVar.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
        uVar.setTextSize(1, 16.0f);
        uVar.setHint(org.telegram.messenger.gd.M0(2131745641, null));
        org.telegram.ui.ActionBar.u6.D(uVar, i10, i6Var);
        org.telegram.ui.ActionBar.u6.U(uVar, org.telegram.ui.ActionBar.n6.G6, i6Var);
        uVar.setImeOptions(268435459);
        org.telegram.ui.ActionBar.u6.l(uVar, 30, org.telegram.ui.ActionBar.n6.Di, i6Var);
        uVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        uVar.setGravity(19);
        uVar.setCursorWidth(1.5f);
        uVar.setMaxLines(1);
        uVar.setSingleLine(true);
        uVar.setLines(1);
        uVar.setTranslationY(org.telegram.messenger.g0.L(-1.0f));
        q3Var.addView(uVar, c8.ma.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.f48835e = view;
            Drawable g10 = i5.c.g(context, 2131231227);
            org.telegram.ui.ActionBar.u6.x(this, g10, i7, i6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(g10);
            view.setAlpha(0.0f);
            q3Var.addView(view, c8.ma.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener(this) {
            public final j01 f46803b;

            {
                this.f46803b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        j01 j01Var = this.f46803b;
                        bi.u uVar2 = j01Var.h;
                        if (j01Var.f48836f.f39777k == 1) {
                            uVar2.setText("");
                            j01Var.G.v(null, true, false);
                            g11 g11Var = j01Var.f48837n;
                            if (g11Var != null) {
                                g11Var.I1(null);
                                j01Var.f48837n.J1(true, true);
                                j01Var.f48837n.G1();
                            }
                            uVar2.clearAnimation();
                            uVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.lr.h).start();
                            j01Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        j01 j01Var2 = this.f46803b;
                        r11 r11Var2 = j01Var2.G;
                        if (!r11Var2.u()) {
                            r11Var2.q();
                            j01Var2.h.requestFocus();
                            r11.a(r11Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        j01 j01Var3 = this.f46803b;
                        bi.u uVar22 = j01Var3.h;
                        uVar22.setText("");
                        j01Var3.G.v(null, true, false);
                        g11 g11Var2 = j01Var3.f48837n;
                        if (g11Var2 != null) {
                            g11Var2.I1(null);
                            j01Var3.f48837n.J1(true, true);
                        }
                        uVar22.clearAnimation();
                        uVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.lr.h).start();
                        j01Var3.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f48834c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new hi.c2(this));
        int i11 = org.telegram.ui.ActionBar.n6.f29486i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i11);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView2, h02, null, M2, i6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final j01 f46803b;

            {
                this.f46803b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        j01 j01Var = this.f46803b;
                        bi.u uVar2 = j01Var.h;
                        if (j01Var.f48836f.f39777k == 1) {
                            uVar2.setText("");
                            j01Var.G.v(null, true, false);
                            g11 g11Var = j01Var.f48837n;
                            if (g11Var != null) {
                                g11Var.I1(null);
                                j01Var.f48837n.J1(true, true);
                                j01Var.f48837n.G1();
                            }
                            uVar2.clearAnimation();
                            uVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.lr.h).start();
                            j01Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        j01 j01Var2 = this.f46803b;
                        r11 r11Var2 = j01Var2.G;
                        if (!r11Var2.u()) {
                            r11Var2.q();
                            j01Var2.h.requestFocus();
                            r11.a(r11Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        j01 j01Var3 = this.f46803b;
                        bi.u uVar22 = j01Var3.h;
                        uVar22.setText("");
                        j01Var3.G.v(null, true, false);
                        g11 g11Var2 = j01Var3.f48837n;
                        if (g11Var2 != null) {
                            g11Var2.I1(null);
                            j01Var3.f48837n.J1(true, true);
                        }
                        uVar22.clearAnimation();
                        uVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.lr.h).start();
                        j01Var3.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, c8.ma.e(36, 36, 53));
        if (!ch.f0.d) {
            b();
        }
    }

    public static void a(j01 j01Var, boolean z10) {
        if (z10) {
            if (j01Var.f48840w == null) {
                ru0 ru0Var = new ru0(j01Var, 16);
                j01Var.f48840w = ru0Var;
                org.telegram.messenger.g0.h3(ru0Var, 340L);
                return;
            }
            return;
        }
        ru0 ru0Var2 = j01Var.f48840w;
        if (ru0Var2 != null) {
            org.telegram.messenger.g0.r(ru0Var2);
            j01Var.f48840w = null;
        }
        org.telegram.messenger.g0.T3(j01Var.f48834c, false, true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.E8));
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j01.b():void");
    }

    public final void c(boolean z10) {
        float f10;
        if (z10 == this.f48841x) {
            return;
        }
        this.f48841x = z10;
        ValueAnimator valueAnimator = this.f48839s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f48838r;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f48839s = ofFloat;
        ofFloat.addUpdateListener(new iz0(this, 5));
        this.f48839s.setDuration(120L);
        this.f48839s.setInterpolator(org.telegram.ui.Components.lr.h);
        this.f48839s.start();
    }

    public final void d(boolean z10) {
        ?? r62;
        g11 g11Var;
        g11 g11Var2;
        org.telegram.ui.Components.sl0 sl0Var = this.f48836f;
        int i7 = sl0Var.f39777k;
        bi.u uVar = this.h;
        int i10 = 2;
        if (i7 == 2 && ((uVar.length() != 0 || ((g11Var2 = this.f48837n) != null && g11Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (uVar.length() <= 0 && ((g11Var = this.f48837n) == null || g11Var.f36227w3 <= 0.5f || (!g11Var.f36222r3 && g11Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        sl0Var.b(r62);
        ImageView imageView = this.f48833b;
        imageView.setClickable(r62);
        String str = null;
        if (r62 != 0) {
            str = org.telegram.messenger.gd.M0(2131754878, null);
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
        r11 r11Var = this.H;
        ih0 ih0Var = r11Var.f51396h0;
        j01 j01Var = r11Var.f51394g0;
        s01 s01Var = r11Var.V;
        if (s01Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = ih0Var.getX() + j01Var.getX();
            float y11 = ih0Var.getY() + j01Var.getY();
            ab.g gVar = (ab.g) s01Var;
            ch.b0 b0Var = (ch.b0) gVar.f926b;
            ch.a0 a0Var = b0Var.f5294a;
            RectF rectF = org.telegram.messenger.g0.P;
            float f10 = 0;
            rectF.set(f10, f10, measuredWidth, measuredHeight);
            org.telegram.ui.Components.ui0 delegate = ((org.telegram.ui.Components.vi0) gVar.f927c).getDelegate();
            float x11 = a0Var.getX() + x10;
            if (b0Var.f5315y == 1) {
                y10 = a0Var.getY() - org.telegram.messenger.g0.f24112m;
            } else {
                y10 = a0Var.getY() + b0Var.f5296c.getY();
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
        org.telegram.ui.ActionBar.i6 i6Var = this.G.f51378a1;
        try {
            org.telegram.ui.Components.sl0 sl0Var = this.f48836f;
            if (sl0Var != null) {
                sl0Var.a(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Bf, i6Var));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.f48842y && (frameLayout = this.f48832a) != null) {
            int r12 = org.telegram.ui.ActionBar.n6.r1(0.06f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, i6Var));
            if (this.E != null) {
                Drawable background = frameLayout.getBackground();
                ShapeDrawable shapeDrawable = this.E;
                if (background == shapeDrawable) {
                    if (r12 != this.F) {
                        org.telegram.ui.ActionBar.n6.C1(r12, shapeDrawable);
                        frameLayout.invalidate();
                    }
                    this.F = r12;
                }
            }
            ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(18.0f), r12);
            this.E = d02;
            frameLayout.setBackground(d02);
            this.F = r12;
        }
    }
}

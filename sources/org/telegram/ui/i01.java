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
public final class i01 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public ShapeDrawable E;
    public int F;
    public final q11 G;
    public final q11 H;
    public final FrameLayout f48677a;
    public final ImageView f48678b;
    public final ImageView f48679c;
    public final hi.y3 d;
    public final View f48680e;
    public final org.telegram.ui.Components.ul0 f48681f;
    public final bi.u h;
    public f11 f48682n;
    public float f48683r;
    public ValueAnimator f48684s;
    public qu0 f48685w;
    public boolean f48686x;
    public boolean f48687y;

    public i01(q11 q11Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.i6 i6Var = q11Var.f51227a1;
        this.H = q11Var;
        this.G = q11Var;
        this.f48686x = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f48677a = frameLayout;
        if (z10) {
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.G8, this, i6Var);
        }
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = org.telegram.ui.ActionBar.n6.f29871zf;
        Drawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(frameLayout, d02, M, null, i6Var);
        frameLayout.setClipToOutline(true);
        bg.q0 q0Var = bg.u0.f3313a;
        frameLayout.setOutlineProvider(new bg.s0(0, org.telegram.messenger.g0.L(18.0f)));
        addView(frameLayout, c8.na.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f48678b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.ul0 ul0Var = new org.telegram.ui.Components.ul0();
        this.f48681f = ul0Var;
        ul0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.n6.Bf;
        ul0Var.a(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        imageView.setImageDrawable(ul0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final i01 f46694b;

            {
                this.f46694b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        i01 i01Var = this.f46694b;
                        bi.u uVar = i01Var.h;
                        if (i01Var.f48681f.f40411k == 1) {
                            uVar.setText("");
                            i01Var.G.v(null, true, false);
                            f11 f11Var = i01Var.f48682n;
                            if (f11Var != null) {
                                f11Var.I1(null);
                                i01Var.f48682n.J1(true, true);
                                i01Var.f48682n.G1();
                            }
                            uVar.clearAnimation();
                            uVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.kr.h).start();
                            i01Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        i01 i01Var2 = this.f46694b;
                        q11 q11Var2 = i01Var2.G;
                        if (!q11Var2.u()) {
                            q11Var2.q();
                            i01Var2.h.requestFocus();
                            q11.a(q11Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        i01 i01Var3 = this.f46694b;
                        bi.u uVar2 = i01Var3.h;
                        uVar2.setText("");
                        i01Var3.G.v(null, true, false);
                        f11 f11Var2 = i01Var3.f48682n;
                        if (f11Var2 != null) {
                            f11Var2.I1(null);
                            i01Var3.f48682n.J1(true, true);
                        }
                        uVar2.clearAnimation();
                        uVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.kr.h).start();
                        i01Var3.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, c8.na.e(36, 36, 51));
        hi.y3 y3Var = new hi.y3(this, context, z10);
        this.d = y3Var;
        frameLayout.addView(y3Var, c8.na.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        bi.u uVar = new bi.u(this, context, i6Var, 2);
        this.h = uVar;
        uVar.addTextChangedListener(new m0(this, 15));
        uVar.setBackground(null);
        uVar.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
        uVar.setTextSize(1, 16.0f);
        uVar.setHint(org.telegram.messenger.gd.N0(2131745640, null));
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
        y3Var.addView(uVar, c8.na.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.f48680e = view;
            Drawable g10 = i5.c.g(context, 2131231230);
            org.telegram.ui.ActionBar.u6.x(this, g10, i7, i6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(g10);
            view.setAlpha(0.0f);
            y3Var.addView(view, c8.na.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener(this) {
            public final i01 f46694b;

            {
                this.f46694b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        i01 i01Var = this.f46694b;
                        bi.u uVar2 = i01Var.h;
                        if (i01Var.f48681f.f40411k == 1) {
                            uVar2.setText("");
                            i01Var.G.v(null, true, false);
                            f11 f11Var = i01Var.f48682n;
                            if (f11Var != null) {
                                f11Var.I1(null);
                                i01Var.f48682n.J1(true, true);
                                i01Var.f48682n.G1();
                            }
                            uVar2.clearAnimation();
                            uVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.kr.h).start();
                            i01Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        i01 i01Var2 = this.f46694b;
                        q11 q11Var2 = i01Var2.G;
                        if (!q11Var2.u()) {
                            q11Var2.q();
                            i01Var2.h.requestFocus();
                            q11.a(q11Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        i01 i01Var3 = this.f46694b;
                        bi.u uVar22 = i01Var3.h;
                        uVar22.setText("");
                        i01Var3.G.v(null, true, false);
                        f11 f11Var2 = i01Var3.f48682n;
                        if (f11Var2 != null) {
                            f11Var2.I1(null);
                            i01Var3.f48682n.J1(true, true);
                        }
                        uVar22.clearAnimation();
                        uVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.kr.h).start();
                        i01Var3.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f48679c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new hi.j2(this));
        int i11 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i11);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView2, h02, null, M2, i6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final i01 f46694b;

            {
                this.f46694b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        i01 i01Var = this.f46694b;
                        bi.u uVar2 = i01Var.h;
                        if (i01Var.f48681f.f40411k == 1) {
                            uVar2.setText("");
                            i01Var.G.v(null, true, false);
                            f11 f11Var = i01Var.f48682n;
                            if (f11Var != null) {
                                f11Var.I1(null);
                                i01Var.f48682n.J1(true, true);
                                i01Var.f48682n.G1();
                            }
                            uVar2.clearAnimation();
                            uVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.kr.h).start();
                            i01Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        i01 i01Var2 = this.f46694b;
                        q11 q11Var2 = i01Var2.G;
                        if (!q11Var2.u()) {
                            q11Var2.q();
                            i01Var2.h.requestFocus();
                            q11.a(q11Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        i01 i01Var3 = this.f46694b;
                        bi.u uVar22 = i01Var3.h;
                        uVar22.setText("");
                        i01Var3.G.v(null, true, false);
                        f11 f11Var2 = i01Var3.f48682n;
                        if (f11Var2 != null) {
                            f11Var2.I1(null);
                            i01Var3.f48682n.J1(true, true);
                        }
                        uVar22.clearAnimation();
                        uVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.kr.h).start();
                        i01Var3.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, c8.na.e(36, 36, 53));
        if (!ch.f0.d) {
            b();
        }
    }

    public static void a(i01 i01Var, boolean z10) {
        if (z10) {
            if (i01Var.f48685w == null) {
                qu0 qu0Var = new qu0(i01Var, 16);
                i01Var.f48685w = qu0Var;
                org.telegram.messenger.g0.h3(qu0Var, 340L);
                return;
            }
            return;
        }
        qu0 qu0Var2 = i01Var.f48685w;
        if (qu0Var2 != null) {
            org.telegram.messenger.g0.r(qu0Var2);
            i01Var.f48685w = null;
        }
        org.telegram.messenger.g0.T3(i01Var.f48679c, false, true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.E8));
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i01.b():void");
    }

    public final void c(boolean z10) {
        float f10;
        if (z10 == this.f48686x) {
            return;
        }
        this.f48686x = z10;
        ValueAnimator valueAnimator = this.f48684s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f48683r;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f48684s = ofFloat;
        ofFloat.addUpdateListener(new hz0(this, 5));
        this.f48684s.setDuration(120L);
        this.f48684s.setInterpolator(org.telegram.ui.Components.kr.h);
        this.f48684s.start();
    }

    public final void d(boolean z10) {
        ?? r62;
        f11 f11Var;
        f11 f11Var2;
        org.telegram.ui.Components.ul0 ul0Var = this.f48681f;
        int i7 = ul0Var.f40411k;
        bi.u uVar = this.h;
        int i10 = 2;
        if (i7 == 2 && ((uVar.length() != 0 || ((f11Var2 = this.f48682n) != null && f11Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (uVar.length() <= 0 && ((f11Var = this.f48682n) == null || f11Var.f36914w3 <= 0.5f || (!f11Var.f36909r3 && f11Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        ul0Var.b(r62);
        ImageView imageView = this.f48678b;
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
        q11 q11Var = this.H;
        gh0 gh0Var = q11Var.f51245h0;
        i01 i01Var = q11Var.f51243g0;
        r01 r01Var = q11Var.V;
        if (r01Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = gh0Var.getX() + i01Var.getX();
            float y11 = gh0Var.getY() + i01Var.getY();
            ab.g gVar = (ab.g) r01Var;
            ch.b0 b0Var = (ch.b0) gVar.f926b;
            ch.a0 a0Var = b0Var.f5289a;
            RectF rectF = org.telegram.messenger.g0.P;
            float f10 = 0;
            rectF.set(f10, f10, measuredWidth, measuredHeight);
            org.telegram.ui.Components.wi0 delegate = ((org.telegram.ui.Components.xi0) gVar.f927c).getDelegate();
            float x11 = a0Var.getX() + x10;
            if (b0Var.f5310y == 1) {
                y10 = a0Var.getY() - org.telegram.messenger.g0.f24220m;
            } else {
                y10 = a0Var.getY() + b0Var.f5291c.getY();
            }
            delegate.q(canvas, rectF, 0.0f, x11, y10 + y11, 255, true);
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
        org.telegram.ui.ActionBar.i6 i6Var = this.G.f51227a1;
        try {
            org.telegram.ui.Components.ul0 ul0Var = this.f48681f;
            if (ul0Var != null) {
                ul0Var.a(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Bf, i6Var));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.f48687y && (frameLayout = this.f48677a) != null) {
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

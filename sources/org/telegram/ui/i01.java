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
public final class i01 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public ShapeDrawable D;
    public int E;
    public final q11 F;
    public final q11 G;
    public final FrameLayout f46536a;
    public final ImageView f46537b;
    public final ImageView f46538c;
    public final fi.r3 d;
    public final View f46539e;
    public final org.telegram.ui.Components.fl0 f46540f;
    public final org.telegram.ui.Cells.z5 h;
    public f11 f46541n;
    public float f46542r;
    public ValueAnimator f46543s;
    public ru0 f46544w;
    public boolean f46545x;
    public boolean f46546y;

    public i01(q11 q11Var, Context context, boolean z9) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var = q11Var.Z0;
        this.G = q11Var;
        this.F = q11Var;
        this.f46545x = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f46536a = frameLayout;
        if (z9) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, this, f6Var);
        }
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = org.telegram.ui.ActionBar.k6.f28211wf;
        Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, d02, N, null, f6Var);
        frameLayout.setClipToOutline(true);
        bg.q0 q0Var = bg.u0.f3380a;
        frameLayout.setOutlineProvider(new bg.s0(0, org.telegram.messenger.g0.L(18.0f)));
        addView(frameLayout, c8.ha.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f46537b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.fl0 fl0Var = new org.telegram.ui.Components.fl0();
        this.f46540f = fl0Var;
        fl0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.k6.f28249yf;
        fl0Var.a(org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        imageView.setImageDrawable(fl0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final i01 f44526b;

            {
                this.f44526b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        i01 i01Var = this.f44526b;
                        org.telegram.ui.Cells.z5 z5Var = i01Var.h;
                        if (i01Var.f46540f.f33577k == 1) {
                            z5Var.setText("");
                            i01Var.F.v(null, true, false);
                            f11 f11Var = i01Var.f46541n;
                            if (f11Var != null) {
                                f11Var.I1(null);
                                i01Var.f46541n.J1(true, true);
                                i01Var.f46541n.G1();
                            }
                            z5Var.clearAnimation();
                            z5Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                            i01Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        i01 i01Var2 = this.f44526b;
                        q11 q11Var2 = i01Var2.F;
                        if (!q11Var2.u()) {
                            q11Var2.q();
                            i01Var2.h.requestFocus();
                            q11.a(q11Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        i01 i01Var3 = this.f44526b;
                        org.telegram.ui.Cells.z5 z5Var2 = i01Var3.h;
                        z5Var2.setText("");
                        i01Var3.F.v(null, true, false);
                        f11 f11Var2 = i01Var3.f46541n;
                        if (f11Var2 != null) {
                            f11Var2.I1(null);
                            i01Var3.f46541n.J1(true, true);
                        }
                        z5Var2.clearAnimation();
                        z5Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                        i01Var3.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, c8.ha.e(36, 36, 51));
        fi.r3 r3Var = new fi.r3(this, context, z9);
        this.d = r3Var;
        frameLayout.addView(r3Var, c8.ha.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(this, context, f6Var, 1);
        this.h = z5Var;
        z5Var.addTextChangedListener(new m0(this, 15));
        z5Var.setBackground(null);
        z5Var.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
        z5Var.setTextSize(1, 16.0f);
        z5Var.setHint(org.telegram.messenger.hd.M0(2131745837, null));
        org.telegram.ui.ActionBar.r6.E(z5Var, i10, f6Var);
        org.telegram.ui.ActionBar.r6.V(z5Var, org.telegram.ui.ActionBar.k6.G6, f6Var);
        z5Var.setImeOptions(268435459);
        org.telegram.ui.ActionBar.r6.m(z5Var, 30, org.telegram.ui.ActionBar.k6.Ai, f6Var);
        z5Var.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        z5Var.setGravity(19);
        z5Var.setCursorWidth(1.5f);
        z5Var.setMaxLines(1);
        z5Var.setSingleLine(true);
        z5Var.setLines(1);
        z5Var.setTranslationY(org.telegram.messenger.g0.L(-1.0f));
        r3Var.addView(z5Var, c8.ha.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z9) {
            View view = new View(context);
            this.f46539e = view;
            Drawable h = jg.g.h(context, 2131231227);
            org.telegram.ui.ActionBar.r6.y(this, h, i7, f6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(h);
            view.setAlpha(0.0f);
            r3Var.addView(view, c8.ha.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener(this) {
            public final i01 f44526b;

            {
                this.f44526b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        i01 i01Var = this.f44526b;
                        org.telegram.ui.Cells.z5 z5Var2 = i01Var.h;
                        if (i01Var.f46540f.f33577k == 1) {
                            z5Var2.setText("");
                            i01Var.F.v(null, true, false);
                            f11 f11Var = i01Var.f46541n;
                            if (f11Var != null) {
                                f11Var.I1(null);
                                i01Var.f46541n.J1(true, true);
                                i01Var.f46541n.G1();
                            }
                            z5Var2.clearAnimation();
                            z5Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                            i01Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        i01 i01Var2 = this.f44526b;
                        q11 q11Var2 = i01Var2.F;
                        if (!q11Var2.u()) {
                            q11Var2.q();
                            i01Var2.h.requestFocus();
                            q11.a(q11Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        i01 i01Var3 = this.f44526b;
                        org.telegram.ui.Cells.z5 z5Var22 = i01Var3.h;
                        z5Var22.setText("");
                        i01Var3.F.v(null, true, false);
                        f11 f11Var2 = i01Var3.f46541n;
                        if (f11Var2 != null) {
                            f11Var2.I1(null);
                            i01Var3.f46541n.J1(true, true);
                        }
                        z5Var22.clearAnimation();
                        z5Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                        i01Var3.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f46538c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new fi.c2(this));
        int i11 = org.telegram.ui.ActionBar.k6.f27941i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i11, f6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i11);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView2, h02, null, N2, f6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final i01 f44526b;

            {
                this.f44526b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        i01 i01Var = this.f44526b;
                        org.telegram.ui.Cells.z5 z5Var2 = i01Var.h;
                        if (i01Var.f46540f.f33577k == 1) {
                            z5Var2.setText("");
                            i01Var.F.v(null, true, false);
                            f11 f11Var = i01Var.f46541n;
                            if (f11Var != null) {
                                f11Var.I1(null);
                                i01Var.f46541n.J1(true, true);
                                i01Var.f46541n.G1();
                            }
                            z5Var2.clearAnimation();
                            z5Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                            i01Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        i01 i01Var2 = this.f44526b;
                        q11 q11Var2 = i01Var2.F;
                        if (!q11Var2.u()) {
                            q11Var2.q();
                            i01Var2.h.requestFocus();
                            q11.a(q11Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        i01 i01Var3 = this.f44526b;
                        org.telegram.ui.Cells.z5 z5Var22 = i01Var3.h;
                        z5Var22.setText("");
                        i01Var3.F.v(null, true, false);
                        f11 f11Var2 = i01Var3.f46541n;
                        if (f11Var2 != null) {
                            f11Var2.I1(null);
                            i01Var3.f46541n.J1(true, true);
                        }
                        z5Var22.clearAnimation();
                        z5Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                        i01Var3.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, c8.ha.e(36, 36, 53));
        if (!ch.e0.d) {
            b();
        }
    }

    public static void a(i01 i01Var, boolean z9) {
        if (z9) {
            if (i01Var.f46544w == null) {
                ru0 ru0Var = new ru0(i01Var, 16);
                i01Var.f46544w = ru0Var;
                org.telegram.messenger.g0.i3(ru0Var, 340L);
                return;
            }
            return;
        }
        ru0 ru0Var2 = i01Var.f46544w;
        if (ru0Var2 != null) {
            org.telegram.messenger.g0.r(ru0Var2);
            i01Var.f46544w = null;
        }
        org.telegram.messenger.g0.V3(i01Var.f46538c, false, true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E8));
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i01.b():void");
    }

    public final void c(boolean z9) {
        float f10;
        if (z9 == this.f46545x) {
            return;
        }
        this.f46545x = z9;
        ValueAnimator valueAnimator = this.f46543s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f46542r;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f46543s = ofFloat;
        ofFloat.addUpdateListener(new gz0(this, 5));
        this.f46543s.setDuration(120L);
        this.f46543s.setInterpolator(org.telegram.ui.Components.xq.h);
        this.f46543s.start();
    }

    public final void d(boolean z9) {
        ?? r62;
        f11 f11Var;
        f11 f11Var2;
        org.telegram.ui.Components.fl0 fl0Var = this.f46540f;
        int i7 = fl0Var.f33577k;
        org.telegram.ui.Cells.z5 z5Var = this.h;
        int i10 = 2;
        if (i7 == 2 && ((z5Var.length() != 0 || ((f11Var2 = this.f46541n) != null && f11Var2.getSelectedCategory() != null)) && !z9)) {
            return;
        }
        if (z5Var.length() <= 0 && ((f11Var = this.f46541n) == null || f11Var.f40744v3 <= 0.5f || (!f11Var.f40739q3 && f11Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        fl0Var.b(r62);
        ImageView imageView = this.f46537b;
        imageView.setClickable(r62);
        String str = null;
        if (r62 != 0) {
            str = org.telegram.messenger.hd.M0(2131754878, null);
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
        q11 q11Var = this.G;
        sq0 sq0Var = q11Var.f49032g0;
        i01 i01Var = q11Var.f49030f0;
        r01 r01Var = q11Var.U;
        if (r01Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = sq0Var.getX() + i01Var.getX();
            float y11 = sq0Var.getY() + i01Var.getY();
            ab.g gVar = (ab.g) r01Var;
            ch.b0 b0Var = (ch.b0) gVar.f928b;
            ch.a0 a0Var = b0Var.f6183a;
            RectF rectF = org.telegram.messenger.g0.P;
            float f10 = 0;
            rectF.set(f10, f10, measuredWidth, measuredHeight);
            org.telegram.ui.Components.hi0 delegate = ((org.telegram.ui.Components.ii0) gVar.f929c).getDelegate();
            float x11 = a0Var.getX() + x10;
            if (b0Var.f6204y == 1) {
                y10 = a0Var.getY() - org.telegram.messenger.g0.f22538m;
            } else {
                y10 = a0Var.getY() + b0Var.f6185c.getY();
            }
            delegate.L(canvas, rectF, 0.0f, x11, y10 + y11, 255, true);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void invalidate() {
        if (ch.e0.b(this)) {
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
            if (this.G.U != null) {
                invalidate();
            }
        }
    }

    @Override
    public final void updateColors() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.f6 f6Var = this.F.Z0;
        try {
            org.telegram.ui.Components.fl0 fl0Var = this.f46540f;
            if (fl0Var != null) {
                fl0Var.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28249yf, f6Var));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.f46546y && (frameLayout = this.f46536a) != null) {
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, f6Var));
            if (this.D != null) {
                Drawable background = frameLayout.getBackground();
                ShapeDrawable shapeDrawable = this.D;
                if (background == shapeDrawable) {
                    if (r12 != this.E) {
                        org.telegram.ui.ActionBar.k6.C1(r12, shapeDrawable);
                        frameLayout.invalidate();
                    }
                    this.E = r12;
                }
            }
            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(18.0f), r12);
            this.D = d02;
            frameLayout.setBackground(d02);
            this.E = r12;
        }
    }
}

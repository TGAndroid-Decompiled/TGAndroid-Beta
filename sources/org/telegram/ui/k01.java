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
    public ShapeDrawable D;
    public int E;
    public final s11 F;
    public final s11 G;
    public final FrameLayout f47144a;
    public final ImageView f47145b;
    public final ImageView f47146c;
    public final fi.r3 d;
    public final View f47147e;
    public final org.telegram.ui.Components.gl0 f47148f;
    public final org.telegram.ui.Cells.z5 h;
    public h11 f47149n;
    public float f47150r;
    public ValueAnimator f47151s;
    public tu0 f47152w;
    public boolean f47153x;
    public boolean f47154y;

    public k01(s11 s11Var, Context context, boolean z9) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var = s11Var.Z0;
        this.G = s11Var;
        this.F = s11Var;
        this.f47153x = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f47144a = frameLayout;
        if (z9) {
            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.G8, this, g6Var);
        }
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = org.telegram.ui.ActionBar.l6.f28227wf;
        Drawable d02 = org.telegram.ui.ActionBar.l6.d0(L, org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i7);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.s6.j(frameLayout, d02, M, null, g6Var);
        frameLayout.setClipToOutline(true);
        bg.q0 q0Var = bg.u0.f3380a;
        frameLayout.setOutlineProvider(new bg.s0(0, org.telegram.messenger.g0.L(18.0f)));
        addView(frameLayout, c8.ha.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f47145b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.gl0 gl0Var = new org.telegram.ui.Components.gl0();
        this.f47148f = gl0Var;
        gl0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.l6.f28265yf;
        gl0Var.a(org.telegram.ui.ActionBar.l6.w0(i10, g6Var));
        imageView.setImageDrawable(gl0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final k01 f45157b;

            {
                this.f45157b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k01 k01Var = this.f45157b;
                        org.telegram.ui.Cells.z5 z5Var = k01Var.h;
                        if (k01Var.f47148f.f33979k == 1) {
                            z5Var.setText("");
                            k01Var.F.v(null, true, false);
                            h11 h11Var = k01Var.f47149n;
                            if (h11Var != null) {
                                h11Var.I1(null);
                                k01Var.f47149n.J1(true, true);
                                k01Var.f47149n.G1();
                            }
                            z5Var.clearAnimation();
                            z5Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                            k01Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        k01 k01Var2 = this.f45157b;
                        s11 s11Var2 = k01Var2.F;
                        if (!s11Var2.u()) {
                            s11Var2.q();
                            k01Var2.h.requestFocus();
                            s11.a(s11Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        k01 k01Var3 = this.f45157b;
                        org.telegram.ui.Cells.z5 z5Var2 = k01Var3.h;
                        z5Var2.setText("");
                        k01Var3.F.v(null, true, false);
                        h11 h11Var2 = k01Var3.f47149n;
                        if (h11Var2 != null) {
                            h11Var2.I1(null);
                            k01Var3.f47149n.J1(true, true);
                        }
                        z5Var2.clearAnimation();
                        z5Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                        k01Var3.c(false);
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
        org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(this, context, g6Var, 1);
        this.h = z5Var;
        z5Var.addTextChangedListener(new m0(this, 15));
        z5Var.setBackground(null);
        z5Var.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
        z5Var.setTextSize(1, 16.0f);
        z5Var.setHint(org.telegram.messenger.id.M0(2131745836, null));
        org.telegram.ui.ActionBar.s6.D(z5Var, i10, g6Var);
        org.telegram.ui.ActionBar.s6.U(z5Var, org.telegram.ui.ActionBar.l6.G6, g6Var);
        z5Var.setImeOptions(268435459);
        org.telegram.ui.ActionBar.s6.l(z5Var, 30, org.telegram.ui.ActionBar.l6.Ai, g6Var);
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
            this.f47147e = view;
            Drawable h = jg.g.h(context, 2131231227);
            org.telegram.ui.ActionBar.s6.x(this, h, i7, g6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(h);
            view.setAlpha(0.0f);
            r3Var.addView(view, c8.ha.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener(this) {
            public final k01 f45157b;

            {
                this.f45157b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        k01 k01Var = this.f45157b;
                        org.telegram.ui.Cells.z5 z5Var2 = k01Var.h;
                        if (k01Var.f47148f.f33979k == 1) {
                            z5Var2.setText("");
                            k01Var.F.v(null, true, false);
                            h11 h11Var = k01Var.f47149n;
                            if (h11Var != null) {
                                h11Var.I1(null);
                                k01Var.f47149n.J1(true, true);
                                k01Var.f47149n.G1();
                            }
                            z5Var2.clearAnimation();
                            z5Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                            k01Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        k01 k01Var2 = this.f45157b;
                        s11 s11Var2 = k01Var2.F;
                        if (!s11Var2.u()) {
                            s11Var2.q();
                            k01Var2.h.requestFocus();
                            s11.a(s11Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        k01 k01Var3 = this.f45157b;
                        org.telegram.ui.Cells.z5 z5Var22 = k01Var3.h;
                        z5Var22.setText("");
                        k01Var3.F.v(null, true, false);
                        h11 h11Var2 = k01Var3.f47149n;
                        if (h11Var2 != null) {
                            h11Var2.I1(null);
                            k01Var3.f47149n.J1(true, true);
                        }
                        z5Var22.clearAnimation();
                        z5Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                        k01Var3.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f47146c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new fi.c2(this));
        int i11 = org.telegram.ui.ActionBar.l6.f27957i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(i11, g6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.o6 M2 = org.telegram.ui.ActionBar.s6.M(i11);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.s6.j(imageView2, h02, null, M2, g6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final k01 f45157b;

            {
                this.f45157b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        k01 k01Var = this.f45157b;
                        org.telegram.ui.Cells.z5 z5Var2 = k01Var.h;
                        if (k01Var.f47148f.f33979k == 1) {
                            z5Var2.setText("");
                            k01Var.F.v(null, true, false);
                            h11 h11Var = k01Var.f47149n;
                            if (h11Var != null) {
                                h11Var.I1(null);
                                k01Var.f47149n.J1(true, true);
                                k01Var.f47149n.G1();
                            }
                            z5Var2.clearAnimation();
                            z5Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                            k01Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        k01 k01Var2 = this.f45157b;
                        s11 s11Var2 = k01Var2.F;
                        if (!s11Var2.u()) {
                            s11Var2.q();
                            k01Var2.h.requestFocus();
                            s11.a(s11Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        k01 k01Var3 = this.f45157b;
                        org.telegram.ui.Cells.z5 z5Var22 = k01Var3.h;
                        z5Var22.setText("");
                        k01Var3.F.v(null, true, false);
                        h11 h11Var2 = k01Var3.f47149n;
                        if (h11Var2 != null) {
                            h11Var2.I1(null);
                            k01Var3.f47149n.J1(true, true);
                        }
                        z5Var22.clearAnimation();
                        z5Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                        k01Var3.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, c8.ha.e(36, 36, 53));
        if (!ch.e0.d) {
            b();
        }
    }

    public static void a(k01 k01Var, boolean z9) {
        if (z9) {
            if (k01Var.f47152w == null) {
                tu0 tu0Var = new tu0(k01Var, 16);
                k01Var.f47152w = tu0Var;
                org.telegram.messenger.g0.i3(tu0Var, 340L);
                return;
            }
            return;
        }
        tu0 tu0Var2 = k01Var.f47152w;
        if (tu0Var2 != null) {
            org.telegram.messenger.g0.r(tu0Var2);
            k01Var.f47152w = null;
        }
        org.telegram.messenger.g0.V3(k01Var.f47146c, false, true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.E8));
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k01.b():void");
    }

    public final void c(boolean z9) {
        float f10;
        if (z9 == this.f47153x) {
            return;
        }
        this.f47153x = z9;
        ValueAnimator valueAnimator = this.f47151s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f47150r;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f47151s = ofFloat;
        ofFloat.addUpdateListener(new jz0(this, 5));
        this.f47151s.setDuration(120L);
        this.f47151s.setInterpolator(org.telegram.ui.Components.xq.h);
        this.f47151s.start();
    }

    public final void d(boolean z9) {
        ?? r62;
        h11 h11Var;
        h11 h11Var2;
        org.telegram.ui.Components.gl0 gl0Var = this.f47148f;
        int i7 = gl0Var.f33979k;
        org.telegram.ui.Cells.z5 z5Var = this.h;
        int i10 = 2;
        if (i7 == 2 && ((z5Var.length() != 0 || ((h11Var2 = this.f47149n) != null && h11Var2.getSelectedCategory() != null)) && !z9)) {
            return;
        }
        if (z5Var.length() <= 0 && ((h11Var = this.f47149n) == null || h11Var.f32001v3 <= 0.5f || (!h11Var.f31996q3 && h11Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        gl0Var.b(r62);
        ImageView imageView = this.f47145b;
        imageView.setClickable(r62);
        String str = null;
        if (r62 != 0) {
            str = org.telegram.messenger.id.M0(2131754878, null);
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
        s11 s11Var = this.G;
        uq0 uq0Var = s11Var.f49678g0;
        k01 k01Var = s11Var.f49676f0;
        t01 t01Var = s11Var.U;
        if (t01Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = uq0Var.getX() + k01Var.getX();
            float y11 = uq0Var.getY() + k01Var.getY();
            ab.g gVar = (ab.g) t01Var;
            ch.b0 b0Var = (ch.b0) gVar.f928b;
            ch.a0 a0Var = b0Var.f6181a;
            RectF rectF = org.telegram.messenger.g0.P;
            float f10 = 0;
            rectF.set(f10, f10, measuredWidth, measuredHeight);
            org.telegram.ui.Components.ii0 delegate = ((org.telegram.ui.Components.ji0) gVar.f929c).getDelegate();
            float x11 = a0Var.getX() + x10;
            if (b0Var.f6202y == 1) {
                y10 = a0Var.getY() - org.telegram.messenger.g0.f22557m;
            } else {
                y10 = a0Var.getY() + b0Var.f6183c.getY();
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
        org.telegram.ui.ActionBar.g6 g6Var = this.F.Z0;
        try {
            org.telegram.ui.Components.gl0 gl0Var = this.f47148f;
            if (gl0Var != null) {
                gl0Var.a(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28265yf, g6Var));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.f47154y && (frameLayout = this.f47144a) != null) {
            int r12 = org.telegram.ui.ActionBar.l6.r1(0.06f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.E8, g6Var));
            if (this.D != null) {
                Drawable background = frameLayout.getBackground();
                ShapeDrawable shapeDrawable = this.D;
                if (background == shapeDrawable) {
                    if (r12 != this.E) {
                        org.telegram.ui.ActionBar.l6.C1(r12, shapeDrawable);
                        frameLayout.invalidate();
                    }
                    this.E = r12;
                }
            }
            ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(18.0f), r12);
            this.D = d02;
            frameLayout.setBackground(d02);
            this.E = r12;
        }
    }
}

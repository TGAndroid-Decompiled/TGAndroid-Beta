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
public final class l01 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public ShapeDrawable D;
    public int E;
    public final t11 F;
    public final t11 G;
    public final FrameLayout f47473a;
    public final ImageView f47474b;
    public final ImageView f47475c;
    public final fi.r3 d;
    public final View f47476e;
    public final org.telegram.ui.Components.fl0 f47477f;
    public final org.telegram.ui.Cells.z5 h;
    public i11 f47478n;
    public float f47479r;
    public ValueAnimator f47480s;
    public uu0 f47481w;
    public boolean f47482x;
    public boolean f47483y;

    public l01(t11 t11Var, Context context, boolean z9) {
        super(context);
        org.telegram.ui.ActionBar.h6 h6Var = t11Var.Z0;
        this.G = t11Var;
        this.F = t11Var;
        this.f47482x = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f47473a = frameLayout;
        if (z9) {
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.G8, this, h6Var);
        }
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = org.telegram.ui.ActionBar.m6.f28252wf;
        Drawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(frameLayout, d02, M, null, h6Var);
        frameLayout.setClipToOutline(true);
        bg.q0 q0Var = bg.u0.f3380a;
        frameLayout.setOutlineProvider(new bg.s0(0, org.telegram.messenger.g0.L(18.0f)));
        addView(frameLayout, c8.ha.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f47474b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.fl0 fl0Var = new org.telegram.ui.Components.fl0();
        this.f47477f = fl0Var;
        fl0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.m6.f28290yf;
        fl0Var.a(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        imageView.setImageDrawable(fl0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final l01 f45485b;

            {
                this.f45485b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l01 l01Var = this.f45485b;
                        org.telegram.ui.Cells.z5 z5Var = l01Var.h;
                        if (l01Var.f47477f.f33574k == 1) {
                            z5Var.setText("");
                            l01Var.F.v(null, true, false);
                            i11 i11Var = l01Var.f47478n;
                            if (i11Var != null) {
                                i11Var.I1(null);
                                l01Var.f47478n.J1(true, true);
                                l01Var.f47478n.G1();
                            }
                            z5Var.clearAnimation();
                            z5Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.wq.h).start();
                            l01Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        l01 l01Var2 = this.f45485b;
                        t11 t11Var2 = l01Var2.F;
                        if (!t11Var2.u()) {
                            t11Var2.q();
                            l01Var2.h.requestFocus();
                            t11.a(t11Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        l01 l01Var3 = this.f45485b;
                        org.telegram.ui.Cells.z5 z5Var2 = l01Var3.h;
                        z5Var2.setText("");
                        l01Var3.F.v(null, true, false);
                        i11 i11Var2 = l01Var3.f47478n;
                        if (i11Var2 != null) {
                            i11Var2.I1(null);
                            l01Var3.f47478n.J1(true, true);
                        }
                        z5Var2.clearAnimation();
                        z5Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.wq.h).start();
                        l01Var3.c(false);
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
        org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(this, context, h6Var, 1);
        this.h = z5Var;
        z5Var.addTextChangedListener(new m0(this, 15));
        z5Var.setBackground(null);
        z5Var.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
        z5Var.setTextSize(1, 16.0f);
        z5Var.setHint(org.telegram.messenger.id.M0(2131745836, null));
        org.telegram.ui.ActionBar.t6.D(z5Var, i10, h6Var);
        org.telegram.ui.ActionBar.t6.U(z5Var, org.telegram.ui.ActionBar.m6.G6, h6Var);
        z5Var.setImeOptions(268435459);
        org.telegram.ui.ActionBar.t6.l(z5Var, 30, org.telegram.ui.ActionBar.m6.Ai, h6Var);
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
            this.f47476e = view;
            Drawable h = jg.g.h(context, 2131231227);
            org.telegram.ui.ActionBar.t6.x(this, h, i7, h6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(h);
            view.setAlpha(0.0f);
            r3Var.addView(view, c8.ha.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener(this) {
            public final l01 f45485b;

            {
                this.f45485b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        l01 l01Var = this.f45485b;
                        org.telegram.ui.Cells.z5 z5Var2 = l01Var.h;
                        if (l01Var.f47477f.f33574k == 1) {
                            z5Var2.setText("");
                            l01Var.F.v(null, true, false);
                            i11 i11Var = l01Var.f47478n;
                            if (i11Var != null) {
                                i11Var.I1(null);
                                l01Var.f47478n.J1(true, true);
                                l01Var.f47478n.G1();
                            }
                            z5Var2.clearAnimation();
                            z5Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.wq.h).start();
                            l01Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        l01 l01Var2 = this.f45485b;
                        t11 t11Var2 = l01Var2.F;
                        if (!t11Var2.u()) {
                            t11Var2.q();
                            l01Var2.h.requestFocus();
                            t11.a(t11Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        l01 l01Var3 = this.f45485b;
                        org.telegram.ui.Cells.z5 z5Var22 = l01Var3.h;
                        z5Var22.setText("");
                        l01Var3.F.v(null, true, false);
                        i11 i11Var2 = l01Var3.f47478n;
                        if (i11Var2 != null) {
                            i11Var2.I1(null);
                            l01Var3.f47478n.J1(true, true);
                        }
                        z5Var22.clearAnimation();
                        z5Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.wq.h).start();
                        l01Var3.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f47475c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new fi.c2(this));
        int i11 = org.telegram.ui.ActionBar.m6.f27982i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i11, h6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i11);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView2, h02, null, M2, h6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final l01 f45485b;

            {
                this.f45485b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        l01 l01Var = this.f45485b;
                        org.telegram.ui.Cells.z5 z5Var2 = l01Var.h;
                        if (l01Var.f47477f.f33574k == 1) {
                            z5Var2.setText("");
                            l01Var.F.v(null, true, false);
                            i11 i11Var = l01Var.f47478n;
                            if (i11Var != null) {
                                i11Var.I1(null);
                                l01Var.f47478n.J1(true, true);
                                l01Var.f47478n.G1();
                            }
                            z5Var2.clearAnimation();
                            z5Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.wq.h).start();
                            l01Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        l01 l01Var2 = this.f45485b;
                        t11 t11Var2 = l01Var2.F;
                        if (!t11Var2.u()) {
                            t11Var2.q();
                            l01Var2.h.requestFocus();
                            t11.a(t11Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        l01 l01Var3 = this.f45485b;
                        org.telegram.ui.Cells.z5 z5Var22 = l01Var3.h;
                        z5Var22.setText("");
                        l01Var3.F.v(null, true, false);
                        i11 i11Var2 = l01Var3.f47478n;
                        if (i11Var2 != null) {
                            i11Var2.I1(null);
                            l01Var3.f47478n.J1(true, true);
                        }
                        z5Var22.clearAnimation();
                        z5Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.wq.h).start();
                        l01Var3.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, c8.ha.e(36, 36, 53));
        if (!ch.e0.d) {
            b();
        }
    }

    public static void a(l01 l01Var, boolean z9) {
        if (z9) {
            if (l01Var.f47481w == null) {
                uu0 uu0Var = new uu0(l01Var, 16);
                l01Var.f47481w = uu0Var;
                org.telegram.messenger.g0.i3(uu0Var, 340L);
                return;
            }
            return;
        }
        uu0 uu0Var2 = l01Var.f47481w;
        if (uu0Var2 != null) {
            org.telegram.messenger.g0.r(uu0Var2);
            l01Var.f47481w = null;
        }
        org.telegram.messenger.g0.V3(l01Var.f47475c, false, true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.E8));
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l01.b():void");
    }

    public final void c(boolean z9) {
        float f10;
        if (z9 == this.f47482x) {
            return;
        }
        this.f47482x = z9;
        ValueAnimator valueAnimator = this.f47480s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f47479r;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f47480s = ofFloat;
        ofFloat.addUpdateListener(new kz0(this, 5));
        this.f47480s.setDuration(120L);
        this.f47480s.setInterpolator(org.telegram.ui.Components.wq.h);
        this.f47480s.start();
    }

    public final void d(boolean z9) {
        ?? r62;
        i11 i11Var;
        i11 i11Var2;
        org.telegram.ui.Components.fl0 fl0Var = this.f47477f;
        int i7 = fl0Var.f33574k;
        org.telegram.ui.Cells.z5 z5Var = this.h;
        int i10 = 2;
        if (i7 == 2 && ((z5Var.length() != 0 || ((i11Var2 = this.f47478n) != null && i11Var2.getSelectedCategory() != null)) && !z9)) {
            return;
        }
        if (z5Var.length() <= 0 && ((i11Var = this.f47478n) == null || i11Var.f41138v3 <= 0.5f || (!i11Var.f41133q3 && i11Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        fl0Var.b(r62);
        ImageView imageView = this.f47474b;
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
        t11 t11Var = this.G;
        vq0 vq0Var = t11Var.f50034g0;
        l01 l01Var = t11Var.f50032f0;
        u01 u01Var = t11Var.U;
        if (u01Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = vq0Var.getX() + l01Var.getX();
            float y11 = vq0Var.getY() + l01Var.getY();
            ab.g gVar = (ab.g) u01Var;
            ch.b0 b0Var = (ch.b0) gVar.f928b;
            ch.a0 a0Var = b0Var.f6186a;
            RectF rectF = org.telegram.messenger.g0.P;
            float f10 = 0;
            rectF.set(f10, f10, measuredWidth, measuredHeight);
            org.telegram.ui.Components.hi0 delegate = ((org.telegram.ui.Components.ii0) gVar.f929c).getDelegate();
            float x11 = a0Var.getX() + x10;
            if (b0Var.f6207y == 1) {
                y10 = a0Var.getY() - org.telegram.messenger.g0.f22561m;
            } else {
                y10 = a0Var.getY() + b0Var.f6188c.getY();
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
        org.telegram.ui.ActionBar.h6 h6Var = this.F.Z0;
        try {
            org.telegram.ui.Components.fl0 fl0Var = this.f47477f;
            if (fl0Var != null) {
                fl0Var.a(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28290yf, h6Var));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.f47483y && (frameLayout = this.f47473a) != null) {
            int r12 = org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, h6Var));
            if (this.D != null) {
                Drawable background = frameLayout.getBackground();
                ShapeDrawable shapeDrawable = this.D;
                if (background == shapeDrawable) {
                    if (r12 != this.E) {
                        org.telegram.ui.ActionBar.m6.C1(r12, shapeDrawable);
                        frameLayout.invalidate();
                    }
                    this.E = r12;
                }
            }
            ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(18.0f), r12);
            this.D = d02;
            frameLayout.setBackground(d02);
            this.E = r12;
        }
    }
}

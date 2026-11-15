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
public final class f01 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public ShapeDrawable E;
    public int F;
    public final n11 G;
    public final n11 H;
    public final FrameLayout f46937a;
    public final ImageView f46938b;
    public final ImageView f46939c;
    public final hi.q3 d;
    public final View f46940e;
    public final org.telegram.ui.Components.kl0 f46941f;
    public final bi.u h;
    public c11 f46942n;
    public float f46943r;
    public ValueAnimator f46944s;
    public pu0 f46945w;
    public boolean f46946x;
    public boolean f46947y;

    public f01(n11 n11Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var = n11Var.f49365a1;
        this.H = n11Var;
        this.G = n11Var;
        this.f46946x = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f46937a = frameLayout;
        if (z10) {
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.G8, this, e6Var);
        }
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = org.telegram.ui.ActionBar.j6.f29269zf;
        Drawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(frameLayout, d02, M, null, e6Var);
        frameLayout.setClipToOutline(true);
        bg.p0 p0Var = bg.t0.f3335a;
        frameLayout.setOutlineProvider(new bg.r0(0, org.telegram.messenger.g0.L(18.0f)));
        addView(frameLayout, c8.ja.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f46938b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.kl0 kl0Var = new org.telegram.ui.Components.kl0();
        this.f46941f = kl0Var;
        kl0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.j6.Bf;
        kl0Var.a(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        imageView.setImageDrawable(kl0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final f01 f53764b;

            {
                this.f53764b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        f01 f01Var = this.f53764b;
                        bi.u uVar = f01Var.h;
                        if (f01Var.f46941f.f36543k == 1) {
                            uVar.setText("");
                            f01Var.G.v(null, true, false);
                            c11 c11Var = f01Var.f46942n;
                            if (c11Var != null) {
                                c11Var.I1(null);
                                f01Var.f46942n.J1(true, true);
                                f01Var.f46942n.G1();
                            }
                            uVar.clearAnimation();
                            uVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.er.h).start();
                            f01Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        f01 f01Var2 = this.f53764b;
                        n11 n11Var2 = f01Var2.G;
                        if (!n11Var2.u()) {
                            n11Var2.q();
                            f01Var2.h.requestFocus();
                            n11.a(n11Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        f01 f01Var3 = this.f53764b;
                        bi.u uVar2 = f01Var3.h;
                        uVar2.setText("");
                        f01Var3.G.v(null, true, false);
                        c11 c11Var2 = f01Var3.f46942n;
                        if (c11Var2 != null) {
                            c11Var2.I1(null);
                            f01Var3.f46942n.J1(true, true);
                        }
                        uVar2.clearAnimation();
                        uVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.er.h).start();
                        f01Var3.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, c8.ja.e(36, 36, 51));
        hi.q3 q3Var = new hi.q3(this, context, z10);
        this.d = q3Var;
        frameLayout.addView(q3Var, c8.ja.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        bi.u uVar = new bi.u(this, context, e6Var, 2);
        this.h = uVar;
        uVar.addTextChangedListener(new m0(this, 15));
        uVar.setBackground(null);
        uVar.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
        uVar.setTextSize(1, 16.0f);
        uVar.setHint(org.telegram.messenger.hd.M0(2131745836, null));
        org.telegram.ui.ActionBar.q6.D(uVar, i10, e6Var);
        org.telegram.ui.ActionBar.q6.U(uVar, org.telegram.ui.ActionBar.j6.G6, e6Var);
        uVar.setImeOptions(268435459);
        org.telegram.ui.ActionBar.q6.l(uVar, 30, org.telegram.ui.ActionBar.j6.Di, e6Var);
        uVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        uVar.setGravity(19);
        uVar.setCursorWidth(1.5f);
        uVar.setMaxLines(1);
        uVar.setSingleLine(true);
        uVar.setLines(1);
        uVar.setTranslationY(org.telegram.messenger.g0.L(-1.0f));
        q3Var.addView(uVar, c8.ja.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.f46940e = view;
            Drawable g10 = i5.c.g(context, 2131231227);
            org.telegram.ui.ActionBar.q6.x(this, g10, i7, e6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(g10);
            view.setAlpha(0.0f);
            q3Var.addView(view, c8.ja.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener(this) {
            public final f01 f53764b;

            {
                this.f53764b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        f01 f01Var = this.f53764b;
                        bi.u uVar2 = f01Var.h;
                        if (f01Var.f46941f.f36543k == 1) {
                            uVar2.setText("");
                            f01Var.G.v(null, true, false);
                            c11 c11Var = f01Var.f46942n;
                            if (c11Var != null) {
                                c11Var.I1(null);
                                f01Var.f46942n.J1(true, true);
                                f01Var.f46942n.G1();
                            }
                            uVar2.clearAnimation();
                            uVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.er.h).start();
                            f01Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        f01 f01Var2 = this.f53764b;
                        n11 n11Var2 = f01Var2.G;
                        if (!n11Var2.u()) {
                            n11Var2.q();
                            f01Var2.h.requestFocus();
                            n11.a(n11Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        f01 f01Var3 = this.f53764b;
                        bi.u uVar22 = f01Var3.h;
                        uVar22.setText("");
                        f01Var3.G.v(null, true, false);
                        c11 c11Var2 = f01Var3.f46942n;
                        if (c11Var2 != null) {
                            c11Var2.I1(null);
                            f01Var3.f46942n.J1(true, true);
                        }
                        uVar22.clearAnimation();
                        uVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.er.h).start();
                        f01Var3.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f46939c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new hi.b2(this));
        int i11 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i11, e6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i11);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(imageView2, h02, null, M2, e6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final f01 f53764b;

            {
                this.f53764b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        f01 f01Var = this.f53764b;
                        bi.u uVar2 = f01Var.h;
                        if (f01Var.f46941f.f36543k == 1) {
                            uVar2.setText("");
                            f01Var.G.v(null, true, false);
                            c11 c11Var = f01Var.f46942n;
                            if (c11Var != null) {
                                c11Var.I1(null);
                                f01Var.f46942n.J1(true, true);
                                f01Var.f46942n.G1();
                            }
                            uVar2.clearAnimation();
                            uVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.er.h).start();
                            f01Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        f01 f01Var2 = this.f53764b;
                        n11 n11Var2 = f01Var2.G;
                        if (!n11Var2.u()) {
                            n11Var2.q();
                            f01Var2.h.requestFocus();
                            n11.a(n11Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        f01 f01Var3 = this.f53764b;
                        bi.u uVar22 = f01Var3.h;
                        uVar22.setText("");
                        f01Var3.G.v(null, true, false);
                        c11 c11Var2 = f01Var3.f46942n;
                        if (c11Var2 != null) {
                            c11Var2.I1(null);
                            f01Var3.f46942n.J1(true, true);
                        }
                        uVar22.clearAnimation();
                        uVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.er.h).start();
                        f01Var3.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, c8.ja.e(36, 36, 53));
        if (!ch.f0.d) {
            b();
        }
    }

    public static void a(f01 f01Var, boolean z10) {
        if (z10) {
            if (f01Var.f46945w == null) {
                pu0 pu0Var = new pu0(f01Var, 16);
                f01Var.f46945w = pu0Var;
                org.telegram.messenger.g0.i3(pu0Var, 340L);
                return;
            }
            return;
        }
        pu0 pu0Var2 = f01Var.f46945w;
        if (pu0Var2 != null) {
            org.telegram.messenger.g0.r(pu0Var2);
            f01Var.f46945w = null;
        }
        org.telegram.messenger.g0.U3(f01Var.f46939c, false, true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.E8));
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f01.b():void");
    }

    public final void c(boolean z10) {
        float f10;
        if (z10 == this.f46946x) {
            return;
        }
        this.f46946x = z10;
        ValueAnimator valueAnimator = this.f46944s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f46943r;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f46944s = ofFloat;
        ofFloat.addUpdateListener(new ez0(this, 5));
        this.f46944s.setDuration(120L);
        this.f46944s.setInterpolator(org.telegram.ui.Components.er.h);
        this.f46944s.start();
    }

    public final void d(boolean z10) {
        ?? r62;
        c11 c11Var;
        c11 c11Var2;
        org.telegram.ui.Components.kl0 kl0Var = this.f46941f;
        int i7 = kl0Var.f36543k;
        bi.u uVar = this.h;
        int i10 = 2;
        if (i7 == 2 && ((uVar.length() != 0 || ((c11Var2 = this.f46942n) != null && c11Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (uVar.length() <= 0 && ((c11Var = this.f46942n) == null || c11Var.f33091w3 <= 0.5f || (!c11Var.f33086r3 && c11Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        kl0Var.b(r62);
        ImageView imageView = this.f46938b;
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
        n11 n11Var = this.H;
        eh0 eh0Var = n11Var.f49383h0;
        f01 f01Var = n11Var.f49381g0;
        o01 o01Var = n11Var.V;
        if (o01Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = eh0Var.getX() + f01Var.getX();
            float y11 = eh0Var.getY() + f01Var.getY();
            ab.g gVar = (ab.g) o01Var;
            ch.b0 b0Var = (ch.b0) gVar.f927b;
            ch.a0 a0Var = b0Var.f5011a;
            RectF rectF = org.telegram.messenger.g0.P;
            float f10 = 0;
            rectF.set(f10, f10, measuredWidth, measuredHeight);
            org.telegram.ui.Components.li0 delegate = ((org.telegram.ui.Components.mi0) gVar.f928c).getDelegate();
            float x11 = a0Var.getX() + x10;
            if (b0Var.f5032y == 1) {
                y10 = a0Var.getY() - org.telegram.messenger.g0.f23605m;
            } else {
                y10 = a0Var.getY() + b0Var.f5013c.getY();
            }
            delegate.J(canvas, rectF, 0.0f, x11, y10 + y11, 255, true);
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
        org.telegram.ui.ActionBar.e6 e6Var = this.G.f49365a1;
        try {
            org.telegram.ui.Components.kl0 kl0Var = this.f46941f;
            if (kl0Var != null) {
                kl0Var.a(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Bf, e6Var));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.f46947y && (frameLayout = this.f46937a) != null) {
            int r12 = org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, e6Var));
            if (this.E != null) {
                Drawable background = frameLayout.getBackground();
                ShapeDrawable shapeDrawable = this.E;
                if (background == shapeDrawable) {
                    if (r12 != this.F) {
                        org.telegram.ui.ActionBar.j6.C1(r12, shapeDrawable);
                        frameLayout.invalidate();
                    }
                    this.F = r12;
                }
            }
            ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(18.0f), r12);
            this.E = d02;
            frameLayout.setBackground(d02);
            this.F = r12;
        }
    }
}

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
public final class a21 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public ShapeDrawable D;
    public int E;
    public final i31 F;
    public final i31 G;
    public final FrameLayout f35527a;
    public final ImageView f35528b;
    public final ImageView f35529c;
    public final kg.x d;
    public final View e;
    public final org.telegram.ui.Components.im0 f35530f;
    public final ih.b h;
    public x21 f35531n;
    public float f35532r;
    public ValueAnimator f35533s;
    public wv0 f35534w;
    public boolean f35535x;
    public boolean f35536y;

    public a21(i31 i31Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.p6 p6Var = i31Var.Z0;
        this.G = i31Var;
        this.F = i31Var;
        this.f35535x = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35527a = frameLayout;
        if (z10) {
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.G8, this, p6Var);
        }
        int L = org.telegram.messenger.i0.L(18.0f);
        int i10 = org.telegram.ui.ActionBar.t6.f21285wf;
        Drawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(frameLayout, d02, N, null, p6Var);
        frameLayout.setClipToOutline(true);
        bi.d2 d2Var = rf.e0.f46526a;
        frameLayout.setOutlineProvider(new rf.c0(0, org.telegram.messenger.i0.L(18.0f)));
        addView(frameLayout, w7.b6.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.f35528b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0();
        this.f35530f = im0Var;
        im0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.t6.f21320yf;
        im0Var.a(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        imageView.setImageDrawable(im0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final a21 f41994b;

            {
                this.f41994b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        a21 a21Var = this.f41994b;
                        ih.b bVar = a21Var.h;
                        if (a21Var.f35530f.f27025k == 1) {
                            bVar.setText("");
                            a21Var.F.v(null, true, false);
                            x21 x21Var = a21Var.f35531n;
                            if (x21Var != null) {
                                x21Var.I1(null);
                                a21Var.f35531n.J1(true, true);
                                a21Var.f35531n.G1();
                            }
                            bVar.clearAnimation();
                            bVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                            a21Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        a21 a21Var2 = this.f41994b;
                        i31 i31Var2 = a21Var2.F;
                        if (!i31Var2.u()) {
                            i31Var2.q();
                            a21Var2.h.requestFocus();
                            i31.a(i31Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        a21 a21Var3 = this.f41994b;
                        ih.b bVar2 = a21Var3.h;
                        bVar2.setText("");
                        a21Var3.F.v(null, true, false);
                        x21 x21Var2 = a21Var3.f35531n;
                        if (x21Var2 != null) {
                            x21Var2.I1(null);
                            a21Var3.f35531n.J1(true, true);
                        }
                        bVar2.clearAnimation();
                        bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                        a21Var3.c(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.b6.e(36, 36, 51));
        kg.x xVar = new kg.x(this, context, z10);
        this.d = xVar;
        frameLayout.addView(xVar, w7.b6.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        ih.b bVar = new ih.b(this, context, p6Var, 2);
        this.h = bVar;
        bVar.addTextChangedListener(new n0(this, 15));
        bVar.setBackground(null);
        bVar.setPadding(0, 0, org.telegram.messenger.i0.L(4.0f), 0);
        bVar.setTextSize(1, 16.0f);
        bVar.setHint(org.telegram.messenger.cd.L0(2131745853, null));
        org.telegram.ui.ActionBar.a7.E(bVar, i11, p6Var);
        org.telegram.ui.ActionBar.a7.V(bVar, org.telegram.ui.ActionBar.t6.G6, p6Var);
        bVar.setImeOptions(268435459);
        org.telegram.ui.ActionBar.a7.m(bVar, 30, org.telegram.ui.ActionBar.t6.Ai, p6Var);
        bVar.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        bVar.setGravity(19);
        bVar.setCursorWidth(1.5f);
        bVar.setMaxLines(1);
        bVar.setSingleLine(true);
        bVar.setLines(1);
        bVar.setTranslationY(org.telegram.messenger.i0.L(-1.0f));
        xVar.addView(bVar, w7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable f7 = i0.a.f(context, 2131231228);
            org.telegram.ui.ActionBar.a7.y(this, f7, i10, p6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(f7);
            view.setAlpha(0.0f);
            xVar.addView(view, w7.b6.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener(this) {
            public final a21 f41994b;

            {
                this.f41994b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        a21 a21Var = this.f41994b;
                        ih.b bVar2 = a21Var.h;
                        if (a21Var.f35530f.f27025k == 1) {
                            bVar2.setText("");
                            a21Var.F.v(null, true, false);
                            x21 x21Var = a21Var.f35531n;
                            if (x21Var != null) {
                                x21Var.I1(null);
                                a21Var.f35531n.J1(true, true);
                                a21Var.f35531n.G1();
                            }
                            bVar2.clearAnimation();
                            bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                            a21Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        a21 a21Var2 = this.f41994b;
                        i31 i31Var2 = a21Var2.F;
                        if (!i31Var2.u()) {
                            i31Var2.q();
                            a21Var2.h.requestFocus();
                            i31.a(i31Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        a21 a21Var3 = this.f41994b;
                        ih.b bVar22 = a21Var3.h;
                        bVar22.setText("");
                        a21Var3.F.v(null, true, false);
                        x21 x21Var2 = a21Var3.f35531n;
                        if (x21Var2 != null) {
                            x21Var2.I1(null);
                            a21Var3.f35531n.J1(true, true);
                        }
                        bVar22.clearAnimation();
                        bVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                        a21Var3.c(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.f35529c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new org.telegram.ui.ActionBar.h0(this));
        int i12 = org.telegram.ui.ActionBar.t6.f21020i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), 1, org.telegram.messenger.i0.L(15.0f));
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i12);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView2, h02, null, N2, p6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final a21 f41994b;

            {
                this.f41994b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        a21 a21Var = this.f41994b;
                        ih.b bVar2 = a21Var.h;
                        if (a21Var.f35530f.f27025k == 1) {
                            bVar2.setText("");
                            a21Var.F.v(null, true, false);
                            x21 x21Var = a21Var.f35531n;
                            if (x21Var != null) {
                                x21Var.I1(null);
                                a21Var.f35531n.J1(true, true);
                                a21Var.f35531n.G1();
                            }
                            bVar2.clearAnimation();
                            bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                            a21Var.c(false);
                            return;
                        }
                        return;
                    case 1:
                        a21 a21Var2 = this.f41994b;
                        i31 i31Var2 = a21Var2.F;
                        if (!i31Var2.u()) {
                            i31Var2.q();
                            a21Var2.h.requestFocus();
                            i31.a(i31Var2, 0, 0);
                            return;
                        }
                        return;
                    default:
                        a21 a21Var3 = this.f41994b;
                        ih.b bVar22 = a21Var3.h;
                        bVar22.setText("");
                        a21Var3.F.v(null, true, false);
                        x21 x21Var2 = a21Var3.f35531n;
                        if (x21Var2 != null) {
                            x21Var2.I1(null);
                            a21Var3.f35531n.J1(true, true);
                        }
                        bVar22.clearAnimation();
                        bVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                        a21Var3.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, w7.b6.e(36, 36, 53));
        if (!sg.e0.d) {
            b();
        }
    }

    public static void a(a21 a21Var, boolean z10) {
        if (z10) {
            if (a21Var.f35534w == null) {
                wv0 wv0Var = new wv0(a21Var, 18);
                a21Var.f35534w = wv0Var;
                org.telegram.messenger.i0.h3(wv0Var, 340L);
                return;
            }
            return;
        }
        wv0 wv0Var2 = a21Var.f35534w;
        if (wv0Var2 != null) {
            org.telegram.messenger.i0.r(wv0Var2);
            a21Var.f35534w = null;
        }
        org.telegram.messenger.i0.U3(a21Var.f35529c, false, true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.E8));
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a21.b():void");
    }

    public final void c(boolean z10) {
        float f7;
        if (z10 == this.f35535x) {
            return;
        }
        this.f35535x = z10;
        ValueAnimator valueAnimator = this.f35533s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f35532r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f35533s = ofFloat;
        ofFloat.addUpdateListener(new u01(this, 5));
        this.f35533s.setDuration(120L);
        this.f35533s.setInterpolator(org.telegram.ui.Components.gr.h);
        this.f35533s.start();
    }

    public final void d(boolean z10) {
        ?? r62;
        x21 x21Var;
        x21 x21Var2;
        org.telegram.ui.Components.im0 im0Var = this.f35530f;
        int i10 = im0Var.f27025k;
        ih.b bVar = this.h;
        int i11 = 2;
        if (i10 == 2 && ((bVar.length() != 0 || ((x21Var2 = this.f35531n) != null && x21Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (bVar.length() <= 0 && ((x21Var = this.f35531n) == null || x21Var.f24905v3 <= 0.5f || (!x21Var.f24900q3 && x21Var.getSelectedCategory() == null))) {
            r62 = 0;
        } else {
            r62 = 1;
        }
        im0Var.b(r62);
        ImageView imageView = this.f35528b;
        imageView.setClickable(r62);
        String str = null;
        if (r62 != 0) {
            str = org.telegram.messenger.cd.L0(2131754878, null);
        }
        imageView.setContentDescription(str);
        if (r62 != 0) {
            i11 = 1;
        }
        imageView.setImportantForAccessibility(i11);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float y3;
        i31 i31Var = this.G;
        dg0 dg0Var = i31Var.f38127g0;
        a21 a21Var = i31Var.f38125f0;
        j21 j21Var = i31Var.U;
        if (j21Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = dg0Var.getX() + a21Var.getX();
            float y10 = dg0Var.getY() + a21Var.getY();
            org.telegram.ui.web.k0 k0Var = (org.telegram.ui.web.k0) j21Var;
            sg.b0 b0Var = (sg.b0) k0Var.f43082b;
            sg.a0 a0Var = b0Var.f48275a;
            RectF rectF = org.telegram.messenger.i0.P;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            org.telegram.ui.Components.lj0 delegate = ((org.telegram.ui.Components.mj0) k0Var.f43083c).getDelegate();
            float x11 = a0Var.getX() + x10;
            if (b0Var.f48295y == 1) {
                y3 = a0Var.getY() - org.telegram.messenger.i0.f16020m;
            } else {
                y3 = a0Var.getY() + b0Var.f48277c.getY();
            }
            delegate.r(canvas, rectF, 0.0f, x11, y3 + y10, 255, true);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void invalidate() {
        if (sg.e0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(52.0f), 1073741824));
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            if (this.G.U != null) {
                invalidate();
            }
        }
    }

    @Override
    public final void updateColors() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.p6 p6Var = this.F.Z0;
        try {
            org.telegram.ui.Components.im0 im0Var = this.f35530f;
            if (im0Var != null) {
                im0Var.a(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21320yf, p6Var));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        if (this.f35536y && (frameLayout = this.f35527a) != null) {
            int r12 = org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, p6Var));
            if (this.D != null) {
                Drawable background = frameLayout.getBackground();
                ShapeDrawable shapeDrawable = this.D;
                if (background == shapeDrawable) {
                    if (r12 != this.E) {
                        org.telegram.ui.ActionBar.t6.C1(r12, shapeDrawable);
                        frameLayout.invalidate();
                    }
                    this.E = r12;
                }
            }
            ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(18.0f), r12);
            this.D = d02;
            frameLayout.setBackground(d02);
            this.E = r12;
        }
    }
}

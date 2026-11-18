package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
public abstract class ey extends FrameLayout implements org.telegram.ui.ActionBar.c6, te.b {
    public ValueAnimator E;
    public mo F;
    public boolean G;
    public final ry H;
    public final te.a f34835a;
    public final int f34836b;
    public final sl0 f34837c;
    public final gq d;
    public final View f34838e;
    public final View f34839f;
    public final ImageView h;
    public final FrameLayout f34840n;
    public final dy f34841r;
    public final ai.k0 f34842s;
    public final View f34843w;
    public float f34844x;
    public boolean f34845y;

    public ey(ry ryVar, Context context, int i7) {
        super(context);
        int z10;
        int z11;
        int z12;
        int z13;
        gq gqVar;
        ImageView.ScaleType scaleType;
        int i10;
        float f10;
        int i11;
        this.H = ryVar;
        this.f34835a = new te.a(0, this, lr.f37209g, 200L, false);
        this.f34845y = false;
        org.telegram.ui.ActionBar.t6 t6Var = org.telegram.ui.ActionBar.u6.f30084a;
        this.f34836b = i7;
        View view = new View(context);
        this.f34838e = view;
        view.setVisibility(4);
        int i12 = org.telegram.ui.ActionBar.n6.Cf;
        org.telegram.ui.ActionBar.i6 i6Var = ryVar.f39335a2;
        boolean z14 = ryVar.f39365j2;
        org.telegram.ui.ActionBar.u6.h(i12, view, i6Var);
        addView(view, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83));
        View view2 = new View(context);
        this.f34839f = view2;
        if (ryVar.f39399v0) {
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29816zf, view2, i6Var);
        }
        addView(view2, new FrameLayout.LayoutParams(-1, ryVar.f39342c1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34840n = frameLayout;
        int L = org.telegram.messenger.g0.L(18.0f);
        if (z14) {
            z10 = ryVar.v(0.06f);
        } else {
            z10 = ryVar.z(org.telegram.ui.ActionBar.n6.Af);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.n6.d0(L, z10));
        frameLayout.setClipToOutline(true);
        bg.q0 q0Var = bg.u0.f3342a;
        frameLayout.setOutlineProvider(new bg.s0(0, org.telegram.messenger.g0.L(18.0f)));
        if (i7 == 2) {
            addView(frameLayout, c8.ma.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, c8.ma.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ai.k0 k0Var = new ai.k0(17, context, this);
        this.f34842s = k0Var;
        frameLayout.addView(k0Var, c8.ma.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        sl0 sl0Var = new sl0();
        this.f34837c = sl0Var;
        sl0Var.c(0, false, false);
        if (z14) {
            z11 = ryVar.v(0.4f);
        } else {
            z11 = ryVar.z(org.telegram.ui.ActionBar.n6.Bf);
        }
        sl0Var.a(z11);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageDrawable(sl0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ey f33488b;

            {
                this.f33488b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        ey eyVar = this.f33488b;
                        dy dyVar = eyVar.f34841r;
                        gq gqVar2 = eyVar.d;
                        if (eyVar.f34837c.f39777k == 1) {
                            gqVar2.setText("");
                            eyVar.c(null, false);
                            if (dyVar != null) {
                                dyVar.G1();
                                dyVar.I1(null);
                                dyVar.J1(true, true);
                            }
                            eyVar.f(false);
                            gqVar2.clearAnimation();
                            gqVar2.animate().translationX(0.0f).setInterpolator(lr.h).start();
                            eyVar.d(false);
                            return;
                        }
                        return;
                    default:
                        ey eyVar2 = this.f33488b;
                        gq gqVar3 = eyVar2.d;
                        gqVar3.setText("");
                        eyVar2.c(null, false);
                        dy dyVar2 = eyVar2.f34841r;
                        if (dyVar2 != null) {
                            dyVar2.G1();
                            dyVar2.I1(null);
                            dyVar2.J1(true, true);
                        }
                        eyVar2.f(false);
                        gqVar3.clearAnimation();
                        gqVar3.animate().translationX(0.0f).setInterpolator(lr.h).start();
                        eyVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, c8.ma.e(36, 36, 51));
        gq gqVar2 = new gq(this, context, i7, 2);
        this.d = gqVar2;
        gqVar2.setTextSize(1, 16.0f);
        if (z14) {
            z12 = ryVar.v(0.45f);
        } else {
            z12 = ryVar.z(org.telegram.ui.ActionBar.n6.Bf);
        }
        gqVar2.setHintTextColor(z12);
        if (z14) {
            z13 = ryVar.v(0.8f);
        } else {
            z13 = ryVar.z(org.telegram.ui.ActionBar.n6.G6);
        }
        gqVar2.setTextColor(z13);
        gqVar2.setBackgroundDrawable(null);
        gqVar2.setPadding(0, 0, 0, 0);
        gqVar2.setMaxLines(1);
        gqVar2.setLines(1);
        gqVar2.setSingleLine(true);
        gqVar2.setImeOptions(268435459);
        gqVar2.setHint(org.telegram.messenger.gd.M0(2131745641, null));
        org.telegram.ui.ActionBar.u6.l(gqVar2, 30, org.telegram.ui.ActionBar.n6.Di, i6Var);
        gqVar2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        gqVar2.setCursorWidth(1.5f);
        gqVar2.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        k0Var.addView(gqVar2, c8.ma.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        gqVar2.addTextChangedListener(new ah.j(this, 22));
        if (ryVar.f39399v0) {
            View view3 = new View(context);
            this.f34843w = view3;
            Drawable g10 = i5.c.g(context, 2131231227);
            org.telegram.ui.ActionBar.q6 p10 = org.telegram.ui.ActionBar.u6.p(org.telegram.ui.ActionBar.n6.f29816zf, org.telegram.ui.ActionBar.n6.Af);
            gqVar = gqVar2;
            scaleType = scaleType2;
            i10 = 3;
            f10 = 16.0f;
            org.telegram.ui.ActionBar.u6.k(this, g10, p10.f29911a, p10.f29912b, 4, 0.0f, i6Var, PorterDuff.Mode.MULTIPLY);
            view3.setBackground(g10);
            view3.setAlpha(0.0f);
            k0Var.addView(view3, c8.ma.e(18, -1, 3));
        } else {
            gqVar = gqVar2;
            scaleType = scaleType2;
            i10 = 3;
            f10 = 16.0f;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new hi.c2(this));
        int i13 = org.telegram.ui.ActionBar.n6.f29488i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i13, i6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i13);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView2, h02, null, M, i6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final ey f33488b;

            {
                this.f33488b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        ey eyVar = this.f33488b;
                        dy dyVar = eyVar.f34841r;
                        gq gqVar22 = eyVar.d;
                        if (eyVar.f34837c.f39777k == 1) {
                            gqVar22.setText("");
                            eyVar.c(null, false);
                            if (dyVar != null) {
                                dyVar.G1();
                                dyVar.I1(null);
                                dyVar.J1(true, true);
                            }
                            eyVar.f(false);
                            gqVar22.clearAnimation();
                            gqVar22.animate().translationX(0.0f).setInterpolator(lr.h).start();
                            eyVar.d(false);
                            return;
                        }
                        return;
                    default:
                        ey eyVar2 = this.f33488b;
                        gq gqVar3 = eyVar2.d;
                        gqVar3.setText("");
                        eyVar2.c(null, false);
                        dy dyVar2 = eyVar2.f34841r;
                        if (dyVar2 != null) {
                            dyVar2.G1();
                            dyVar2.I1(null);
                            dyVar2.J1(true, true);
                        }
                        eyVar2.f(false);
                        gqVar3.clearAnimation();
                        gqVar3.animate().translationX(0.0f).setInterpolator(lr.h).start();
                        eyVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, c8.ma.e(36, 36, 53));
        if (i7 == 1 && (!ryVar.d2 || !org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24773t0).q())) {
            return;
        }
        if (i7 == 0) {
            i11 = i10;
        } else {
            i11 = 0;
        }
        dy dyVar = new dy(this, context, i11, ryVar.f39335a2, i7);
        this.f34841r = dyVar;
        dyVar.E3 = z14;
        TextPaint paint = gqVar.getPaint();
        dyVar.setDontOccupyWidth(org.telegram.messenger.g0.L(f10) + ((int) paint.measureText(((Object) gqVar.getHint()) + "")));
        if (ryVar.f39399v0) {
            org.telegram.ui.ActionBar.u6.i(dyVar, org.telegram.ui.ActionBar.u6.p(org.telegram.ui.ActionBar.n6.f29816zf, org.telegram.ui.ActionBar.n6.Af), i6Var);
        }
        dyVar.setOnScrollIntoOccupiedWidth(new org.telegram.messenger.x10(this) {
            public final ey f34195b;

            {
                this.f34195b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z15;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        ey eyVar = this.f34195b;
                        eyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        eyVar.d(z15);
                        eyVar.g(false);
                        return;
                    default:
                        ev0 ev0Var = (ev0) obj;
                        ey eyVar2 = this.f34195b;
                        ry ryVar2 = eyVar2.H;
                        dy dyVar2 = eyVar2.f34841r;
                        if (ev0Var == null) {
                            eyVar2.d(false);
                            dyVar2.I1(null);
                            ryVar2.f39379p0.d.setText("");
                            ryVar2.f39363j0.h1(0, 0);
                            return;
                        } else if (dyVar2.getSelectedCategory() == ev0Var) {
                            eyVar2.c(null, false);
                            dyVar2.I1(null);
                            return;
                        } else {
                            eyVar2.c(ev0Var.f34808a, false);
                            dyVar2.I1(ev0Var);
                            return;
                        }
                }
            }
        });
        dyVar.setOnTouchListener(new m.c2(this, 2));
        dyVar.setOnCategoryClick(new org.telegram.messenger.x10(this) {
            public final ey f34195b;

            {
                this.f34195b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z15;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        ey eyVar = this.f34195b;
                        eyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        eyVar.d(z15);
                        eyVar.g(false);
                        return;
                    default:
                        ev0 ev0Var = (ev0) obj;
                        ey eyVar2 = this.f34195b;
                        ry ryVar2 = eyVar2.H;
                        dy dyVar2 = eyVar2.f34841r;
                        if (ev0Var == null) {
                            eyVar2.d(false);
                            dyVar2.I1(null);
                            ryVar2.f39379p0.d.setText("");
                            ryVar2.f39363j0.h1(0, 0);
                            return;
                        } else if (dyVar2.getSelectedCategory() == ev0Var) {
                            eyVar2.c(null, false);
                            dyVar2.I1(null);
                            return;
                        } else {
                            eyVar2.c(ev0Var.f34808a, false);
                            dyVar2.I1(ev0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(dyVar, c8.ma.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public static void a(ey eyVar, boolean z10, boolean z11) {
        eyVar.f34835a.a(z10, z11);
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        int i10;
        if (i7 == 0) {
            View view = this.f34838e;
            view.setAlpha(f10);
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            view.setVisibility(i10);
        }
    }

    public final void b() {
        org.telegram.messenger.g0.v1(this.d);
    }

    public final void c(String str, boolean z10) {
        ry ryVar = this.H;
        int i7 = this.f34836b;
        if (i7 == 0) {
            my myVar = ryVar.A0;
            ly lyVar = myVar.P;
            ry ryVar2 = myVar.R;
            ew ewVar = ryVar2.H0;
            aw awVar = ryVar2.E0;
            if (myVar.M != 0) {
                ConnectionsManager.getInstance(ryVar2.f39345d1).cancelRequest(myVar.M, true);
                myVar.M = 0;
            }
            if (TextUtils.isEmpty(str)) {
                myVar.O = null;
                myVar.F.clear();
                myVar.I.clear();
                myVar.L = new ArrayList();
                v4.i0 adapter = awVar.getAdapter();
                jy jyVar = ryVar2.f39414z0;
                if (adapter != jyVar) {
                    awVar.setAdapter(jyVar);
                }
                myVar.d = 0L;
                ryVar2.f39332a.a(false, true);
                myVar.f();
                ewVar.e(false);
            } else {
                myVar.O = str.toLowerCase();
                ewVar.e(true);
            }
            org.telegram.messenger.g0.r(lyVar);
            org.telegram.messenger.g0.h3(lyVar, 300L);
        } else if (i7 == 1) {
            ryVar.T.F(str, z10);
        } else if (i7 == 2) {
            ryVar.f39366k0.G(str, z10);
        }
    }

    public final void d(boolean z10) {
        float f10;
        if (z10 == this.f34845y) {
            return;
        }
        this.f34845y = z10;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f34844x;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new w(this, 23));
        this.E.setDuration(120L);
        this.E.setInterpolator(lr.h);
        this.E.start();
    }

    public final void e(boolean z10) {
        this.G = z10;
        if (z10) {
            this.f34837c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z10) {
        if (z10) {
            if (this.F == null) {
                mo moVar = new mo(this, 16);
                this.F = moVar;
                org.telegram.messenger.g0.h3(moVar, 340L);
                return;
            }
            return;
        }
        mo moVar2 = this.F;
        if (moVar2 != null) {
            org.telegram.messenger.g0.r(moVar2);
            this.F = null;
        }
        org.telegram.messenger.g0.T3(this.h, false, true);
    }

    public final void g(boolean z10) {
        int i7;
        boolean z11 = this.G;
        gq gqVar = this.d;
        dy dyVar = this.f34841r;
        if (z11 && ((gqVar.length() != 0 || (dyVar != null && dyVar.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (gqVar.length() <= 0 && (dyVar == null || dyVar.f36227w3 <= 0.5f || (!dyVar.f36222r3 && dyVar.getSelectedCategory() == null))) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        this.f34837c.b(i7);
        this.G = false;
    }

    @Override
    public final void updateColors() {
        try {
            this.d.setCursorColor(this.H.z(org.telegram.ui.ActionBar.n6.Di));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void D(float f10, int i7) {
    }
}

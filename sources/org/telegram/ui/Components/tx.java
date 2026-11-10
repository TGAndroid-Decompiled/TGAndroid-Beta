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
public abstract class tx extends FrameLayout implements org.telegram.ui.ActionBar.c6, te.b {
    public ValueAnimator D;
    public gp E;
    public boolean F;
    public final gy G;
    public final te.a f38412a;
    public final int f38413b;
    public final fl0 f38414c;
    public final rp d;
    public final View f38415e;
    public final View f38416f;
    public final ImageView h;
    public final FrameLayout f38417n;
    public final sx f38418r;
    public final bi.x5 f38419s;
    public final View f38420w;
    public float f38421x;
    public boolean f38422y;

    public tx(gy gyVar, Context context, int i7) {
        super(context);
        int z9;
        int z10;
        int z11;
        int z12;
        rp rpVar;
        ImageView.ScaleType scaleType;
        int i10;
        float f10;
        int i11;
        this.G = gyVar;
        this.f38412a = new te.a(0, this, wq.f40047g, 200L, false);
        this.f38422y = false;
        org.telegram.ui.ActionBar.s6 s6Var = org.telegram.ui.ActionBar.t6.f28530a;
        this.f38413b = i7;
        View view = new View(context);
        this.f38415e = view;
        view.setVisibility(4);
        int i12 = org.telegram.ui.ActionBar.m6.f28308zf;
        org.telegram.ui.ActionBar.h6 h6Var = gyVar.Z1;
        boolean z13 = gyVar.f34036i2;
        org.telegram.ui.ActionBar.t6.h(i12, view, h6Var);
        addView(view, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83));
        View view2 = new View(context);
        this.f38416f = view2;
        if (gyVar.f34070u0) {
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f28252wf, view2, h6Var);
        }
        addView(view2, new FrameLayout.LayoutParams(-1, gyVar.f34012b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38417n = frameLayout;
        int L = org.telegram.messenger.g0.L(18.0f);
        if (z13) {
            z9 = gyVar.v(0.06f);
        } else {
            z9 = gyVar.z(org.telegram.ui.ActionBar.m6.f28271xf);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.m6.d0(L, z9));
        frameLayout.setClipToOutline(true);
        bg.q0 q0Var = bg.u0.f3380a;
        frameLayout.setOutlineProvider(new bg.s0(0, org.telegram.messenger.g0.L(18.0f)));
        if (i7 == 2) {
            addView(frameLayout, c8.ha.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, c8.ha.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        bi.x5 x5Var = new bi.x5(14, context, this);
        this.f38419s = x5Var;
        frameLayout.addView(x5Var, c8.ha.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        fl0 fl0Var = new fl0();
        this.f38414c = fl0Var;
        fl0Var.c(0, false, false);
        if (z13) {
            z10 = gyVar.v(0.4f);
        } else {
            z10 = gyVar.z(org.telegram.ui.ActionBar.m6.f28290yf);
        }
        fl0Var.a(z10);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageDrawable(fl0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final tx f37421b;

            {
                this.f37421b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        tx txVar = this.f37421b;
                        sx sxVar = txVar.f38418r;
                        rp rpVar2 = txVar.d;
                        if (txVar.f38414c.f33574k == 1) {
                            rpVar2.setText("");
                            txVar.c(null, false);
                            if (sxVar != null) {
                                sxVar.G1();
                                sxVar.I1(null);
                                sxVar.J1(true, true);
                            }
                            txVar.f(false);
                            rpVar2.clearAnimation();
                            rpVar2.animate().translationX(0.0f).setInterpolator(wq.h).start();
                            txVar.d(false);
                            return;
                        }
                        return;
                    default:
                        tx txVar2 = this.f37421b;
                        rp rpVar3 = txVar2.d;
                        rpVar3.setText("");
                        txVar2.c(null, false);
                        sx sxVar2 = txVar2.f38418r;
                        if (sxVar2 != null) {
                            sxVar2.G1();
                            sxVar2.I1(null);
                            sxVar2.J1(true, true);
                        }
                        txVar2.f(false);
                        rpVar3.clearAnimation();
                        rpVar3.animate().translationX(0.0f).setInterpolator(wq.h).start();
                        txVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, c8.ha.e(36, 36, 51));
        rp rpVar2 = new rp(this, context, i7, 2);
        this.d = rpVar2;
        rpVar2.setTextSize(1, 16.0f);
        if (z13) {
            z11 = gyVar.v(0.45f);
        } else {
            z11 = gyVar.z(org.telegram.ui.ActionBar.m6.f28290yf);
        }
        rpVar2.setHintTextColor(z11);
        if (z13) {
            z12 = gyVar.v(0.8f);
        } else {
            z12 = gyVar.z(org.telegram.ui.ActionBar.m6.G6);
        }
        rpVar2.setTextColor(z12);
        rpVar2.setBackgroundDrawable(null);
        rpVar2.setPadding(0, 0, 0, 0);
        rpVar2.setMaxLines(1);
        rpVar2.setLines(1);
        rpVar2.setSingleLine(true);
        rpVar2.setImeOptions(268435459);
        rpVar2.setHint(org.telegram.messenger.id.M0(2131745836, null));
        org.telegram.ui.ActionBar.t6.l(rpVar2, 30, org.telegram.ui.ActionBar.m6.Ai, h6Var);
        rpVar2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        rpVar2.setCursorWidth(1.5f);
        rpVar2.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        x5Var.addView(rpVar2, c8.ha.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        rpVar2.addTextChangedListener(new ah.j(this, 19));
        if (gyVar.f34070u0) {
            View view3 = new View(context);
            this.f38420w = view3;
            Drawable h = jg.g.h(context, 2131231227);
            org.telegram.ui.ActionBar.p6 p10 = org.telegram.ui.ActionBar.t6.p(org.telegram.ui.ActionBar.m6.f28252wf, org.telegram.ui.ActionBar.m6.f28271xf);
            rpVar = rpVar2;
            scaleType = scaleType2;
            i10 = 3;
            f10 = 16.0f;
            org.telegram.ui.ActionBar.t6.k(this, h, p10.f28387a, p10.f28388b, 4, 0.0f, h6Var, PorterDuff.Mode.MULTIPLY);
            view3.setBackground(h);
            view3.setAlpha(0.0f);
            x5Var.addView(view3, c8.ha.e(18, -1, 3));
        } else {
            rpVar = rpVar2;
            scaleType = scaleType2;
            i10 = 3;
            f10 = 16.0f;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new fi.c2(this));
        int i13 = org.telegram.ui.ActionBar.m6.f27982i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i13, h6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i13);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView2, h02, null, M, h6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final tx f37421b;

            {
                this.f37421b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        tx txVar = this.f37421b;
                        sx sxVar = txVar.f38418r;
                        rp rpVar22 = txVar.d;
                        if (txVar.f38414c.f33574k == 1) {
                            rpVar22.setText("");
                            txVar.c(null, false);
                            if (sxVar != null) {
                                sxVar.G1();
                                sxVar.I1(null);
                                sxVar.J1(true, true);
                            }
                            txVar.f(false);
                            rpVar22.clearAnimation();
                            rpVar22.animate().translationX(0.0f).setInterpolator(wq.h).start();
                            txVar.d(false);
                            return;
                        }
                        return;
                    default:
                        tx txVar2 = this.f37421b;
                        rp rpVar3 = txVar2.d;
                        rpVar3.setText("");
                        txVar2.c(null, false);
                        sx sxVar2 = txVar2.f38418r;
                        if (sxVar2 != null) {
                            sxVar2.G1();
                            sxVar2.I1(null);
                            sxVar2.J1(true, true);
                        }
                        txVar2.f(false);
                        rpVar3.clearAnimation();
                        rpVar3.animate().translationX(0.0f).setInterpolator(wq.h).start();
                        txVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, c8.ha.e(36, 36, 53));
        if (i7 == 1 && (!gyVar.f34017c2 || !org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24474s0).q())) {
            return;
        }
        if (i7 == 0) {
            i11 = i10;
        } else {
            i11 = 0;
        }
        sx sxVar = new sx(this, context, i11, gyVar.Z1, i7);
        this.f38418r = sxVar;
        sxVar.D3 = z13;
        TextPaint paint = rpVar.getPaint();
        sxVar.setDontOccupyWidth(org.telegram.messenger.g0.L(f10) + ((int) paint.measureText(((Object) rpVar.getHint()) + "")));
        if (gyVar.f34070u0) {
            org.telegram.ui.ActionBar.t6.i(sxVar, org.telegram.ui.ActionBar.t6.p(org.telegram.ui.ActionBar.m6.f28252wf, org.telegram.ui.ActionBar.m6.f28271xf), h6Var);
        }
        sxVar.setOnScrollIntoOccupiedWidth(new org.telegram.messenger.c20(this) {
            public final tx f37752b;

            {
                this.f37752b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z14;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        tx txVar = this.f37752b;
                        txVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        txVar.d(z14);
                        txVar.g(false);
                        return;
                    default:
                        vu0 vu0Var = (vu0) obj;
                        tx txVar2 = this.f37752b;
                        gy gyVar2 = txVar2.G;
                        sx sxVar2 = txVar2.f38418r;
                        if (vu0Var == null) {
                            txVar2.d(false);
                            sxVar2.I1(null);
                            gyVar2.f34050o0.d.setText("");
                            gyVar2.f34034i0.h1(0, 0);
                            return;
                        } else if (sxVar2.getSelectedCategory() == vu0Var) {
                            txVar2.c(null, false);
                            sxVar2.I1(null);
                            return;
                        } else {
                            txVar2.c(vu0Var.f39747a, false);
                            sxVar2.I1(vu0Var);
                            return;
                        }
                }
            }
        });
        sxVar.setOnTouchListener(new m.d2(this, 2));
        sxVar.setOnCategoryClick(new org.telegram.messenger.c20(this) {
            public final tx f37752b;

            {
                this.f37752b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z14;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        tx txVar = this.f37752b;
                        txVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        txVar.d(z14);
                        txVar.g(false);
                        return;
                    default:
                        vu0 vu0Var = (vu0) obj;
                        tx txVar2 = this.f37752b;
                        gy gyVar2 = txVar2.G;
                        sx sxVar2 = txVar2.f38418r;
                        if (vu0Var == null) {
                            txVar2.d(false);
                            sxVar2.I1(null);
                            gyVar2.f34050o0.d.setText("");
                            gyVar2.f34034i0.h1(0, 0);
                            return;
                        } else if (sxVar2.getSelectedCategory() == vu0Var) {
                            txVar2.c(null, false);
                            sxVar2.I1(null);
                            return;
                        } else {
                            txVar2.c(vu0Var.f39747a, false);
                            sxVar2.I1(vu0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(sxVar, c8.ha.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public static void a(tx txVar, boolean z9, boolean z10) {
        txVar.f38412a.a(z9, z10);
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        int i10;
        if (i7 == 0) {
            View view = this.f38415e;
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

    public final void c(String str, boolean z9) {
        gy gyVar = this.G;
        int i7 = this.f38413b;
        if (i7 == 0) {
            ay ayVar = gyVar.f34088z0;
            zx zxVar = ayVar.O;
            gy gyVar2 = ayVar.Q;
            sv svVar = gyVar2.G0;
            pv pvVar = gyVar2.D0;
            if (ayVar.L != 0) {
                ConnectionsManager.getInstance(gyVar2.f34016c1).cancelRequest(ayVar.L, true);
                ayVar.L = 0;
            }
            if (TextUtils.isEmpty(str)) {
                ayVar.N = null;
                ayVar.E.clear();
                ayVar.H.clear();
                ayVar.K = new ArrayList();
                v4.g0 adapter = pvVar.getAdapter();
                xx xxVar = gyVar2.f34085y0;
                if (adapter != xxVar) {
                    pvVar.setAdapter(xxVar);
                }
                ayVar.d = 0L;
                gyVar2.f34006a.a(false, true);
                ayVar.f();
                svVar.e(false);
            } else {
                ayVar.N = str.toLowerCase();
                svVar.e(true);
            }
            org.telegram.messenger.g0.r(zxVar);
            org.telegram.messenger.g0.i3(zxVar, 300L);
        } else if (i7 == 1) {
            gyVar.S.F(str, z9);
        } else if (i7 == 2) {
            gyVar.f34037j0.G(str, z9);
        }
    }

    public final void d(boolean z9) {
        float f10;
        if (z9 == this.f38422y) {
            return;
        }
        this.f38422y = z9;
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f38421x;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.D = ofFloat;
        ofFloat.addUpdateListener(new d6(this, 22));
        this.D.setDuration(120L);
        this.D.setInterpolator(wq.h);
        this.D.start();
    }

    public final void e(boolean z9) {
        this.F = z9;
        if (z9) {
            this.f38414c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z9) {
        if (z9) {
            if (this.E == null) {
                gp gpVar = new gp(this, 14);
                this.E = gpVar;
                org.telegram.messenger.g0.i3(gpVar, 340L);
                return;
            }
            return;
        }
        gp gpVar2 = this.E;
        if (gpVar2 != null) {
            org.telegram.messenger.g0.r(gpVar2);
            this.E = null;
        }
        org.telegram.messenger.g0.V3(this.h, false, true);
    }

    public final void g(boolean z9) {
        int i7;
        boolean z10 = this.F;
        rp rpVar = this.d;
        sx sxVar = this.f38418r;
        if (z10 && ((rpVar.length() != 0 || (sxVar != null && sxVar.getSelectedCategory() != null)) && !z9)) {
            return;
        }
        if (rpVar.length() <= 0 && (sxVar == null || sxVar.f41138v3 <= 0.5f || (!sxVar.f41133q3 && sxVar.getSelectedCategory() == null))) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        this.f38414c.b(i7);
        this.F = false;
    }

    @Override
    public final void updateColors() {
        try {
            this.d.setCursorColor(this.G.z(org.telegram.ui.ActionBar.m6.Ai));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void F(float f10, int i7) {
    }
}

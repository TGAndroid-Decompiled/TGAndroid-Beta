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
public abstract class gy extends FrameLayout implements org.telegram.ui.ActionBar.b6, te.b {
    public ValueAnimator E;
    public oo F;
    public boolean G;
    public final ty H;
    public final te.a f35693a;
    public final int f35694b;
    public final ul0 f35695c;
    public final iq d;
    public final View f35696e;
    public final View f35697f;
    public final ImageView h;
    public final FrameLayout f35698n;
    public final fy f35699r;
    public final ai.l0 f35700s;
    public final View f35701w;
    public float f35702x;
    public boolean f35703y;

    public gy(ty tyVar, Context context, int i7) {
        super(context);
        int z10;
        int z11;
        int z12;
        int z13;
        iq iqVar;
        ImageView.ScaleType scaleType;
        int i10;
        float f10;
        int i11;
        this.H = tyVar;
        this.f35693a = new te.a(0, this, nr.f37957g, 200L, false);
        this.f35703y = false;
        org.telegram.ui.ActionBar.s6 s6Var = org.telegram.ui.ActionBar.t6.f30065a;
        this.f35694b = i7;
        View view = new View(context);
        this.f35696e = view;
        view.setVisibility(4);
        int i12 = org.telegram.ui.ActionBar.m6.Cf;
        org.telegram.ui.ActionBar.h6 h6Var = tyVar.f40089a2;
        boolean z14 = tyVar.f40119j2;
        org.telegram.ui.ActionBar.t6.h(i12, view, h6Var);
        addView(view, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83));
        View view2 = new View(context);
        this.f35697f = view2;
        if (tyVar.f40153v0) {
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29798zf, view2, h6Var);
        }
        addView(view2, new FrameLayout.LayoutParams(-1, tyVar.f40096c1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35698n = frameLayout;
        int L = org.telegram.messenger.g0.L(18.0f);
        if (z14) {
            z10 = tyVar.v(0.06f);
        } else {
            z10 = tyVar.z(org.telegram.ui.ActionBar.m6.Af);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.m6.d0(L, z10));
        frameLayout.setClipToOutline(true);
        bg.q0 q0Var = bg.u0.f3355a;
        frameLayout.setOutlineProvider(new bg.s0(0, org.telegram.messenger.g0.L(18.0f)));
        if (i7 == 2) {
            addView(frameLayout, c8.ma.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, c8.ma.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ai.l0 l0Var = new ai.l0(17, context, this);
        this.f35700s = l0Var;
        frameLayout.addView(l0Var, c8.ma.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ul0 ul0Var = new ul0();
        this.f35695c = ul0Var;
        ul0Var.c(0, false, false);
        if (z14) {
            z11 = tyVar.v(0.4f);
        } else {
            z11 = tyVar.z(org.telegram.ui.ActionBar.m6.Bf);
        }
        ul0Var.a(z11);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageDrawable(ul0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final gy f34615b;

            {
                this.f34615b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        gy gyVar = this.f34615b;
                        fy fyVar = gyVar.f35699r;
                        iq iqVar2 = gyVar.d;
                        if (gyVar.f35695c.f40493k == 1) {
                            iqVar2.setText("");
                            gyVar.c(null, false);
                            if (fyVar != null) {
                                fyVar.G1();
                                fyVar.I1(null);
                                fyVar.J1(true, true);
                            }
                            gyVar.f(false);
                            iqVar2.clearAnimation();
                            iqVar2.animate().translationX(0.0f).setInterpolator(nr.h).start();
                            gyVar.d(false);
                            return;
                        }
                        return;
                    default:
                        gy gyVar2 = this.f34615b;
                        iq iqVar3 = gyVar2.d;
                        iqVar3.setText("");
                        gyVar2.c(null, false);
                        fy fyVar2 = gyVar2.f35699r;
                        if (fyVar2 != null) {
                            fyVar2.G1();
                            fyVar2.I1(null);
                            fyVar2.J1(true, true);
                        }
                        gyVar2.f(false);
                        iqVar3.clearAnimation();
                        iqVar3.animate().translationX(0.0f).setInterpolator(nr.h).start();
                        gyVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, c8.ma.e(36, 36, 51));
        iq iqVar2 = new iq(this, context, i7, 2);
        this.d = iqVar2;
        iqVar2.setTextSize(1, 16.0f);
        if (z14) {
            z12 = tyVar.v(0.45f);
        } else {
            z12 = tyVar.z(org.telegram.ui.ActionBar.m6.Bf);
        }
        iqVar2.setHintTextColor(z12);
        if (z14) {
            z13 = tyVar.v(0.8f);
        } else {
            z13 = tyVar.z(org.telegram.ui.ActionBar.m6.G6);
        }
        iqVar2.setTextColor(z13);
        iqVar2.setBackgroundDrawable(null);
        iqVar2.setPadding(0, 0, 0, 0);
        iqVar2.setMaxLines(1);
        iqVar2.setLines(1);
        iqVar2.setSingleLine(true);
        iqVar2.setImeOptions(268435459);
        iqVar2.setHint(org.telegram.messenger.gd.N0(2131745640, null));
        org.telegram.ui.ActionBar.t6.l(iqVar2, 30, org.telegram.ui.ActionBar.m6.Di, h6Var);
        iqVar2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        iqVar2.setCursorWidth(1.5f);
        iqVar2.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        l0Var.addView(iqVar2, c8.ma.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        iqVar2.addTextChangedListener(new ah.j(this, 22));
        if (tyVar.f40153v0) {
            View view3 = new View(context);
            this.f35701w = view3;
            Drawable g10 = i5.c.g(context, 2131231227);
            org.telegram.ui.ActionBar.p6 p10 = org.telegram.ui.ActionBar.t6.p(org.telegram.ui.ActionBar.m6.f29798zf, org.telegram.ui.ActionBar.m6.Af);
            iqVar = iqVar2;
            scaleType = scaleType2;
            i10 = 3;
            f10 = 16.0f;
            org.telegram.ui.ActionBar.t6.k(this, g10, p10.f29892a, p10.f29893b, 4, 0.0f, h6Var, PorterDuff.Mode.MULTIPLY);
            view3.setBackground(g10);
            view3.setAlpha(0.0f);
            l0Var.addView(view3, c8.ma.e(18, -1, 3));
        } else {
            iqVar = iqVar2;
            scaleType = scaleType2;
            i10 = 3;
            f10 = 16.0f;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new hi.b2(this));
        int i13 = org.telegram.ui.ActionBar.m6.f29470i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i13, h6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i13);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView2, h02, null, M, h6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final gy f34615b;

            {
                this.f34615b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        gy gyVar = this.f34615b;
                        fy fyVar = gyVar.f35699r;
                        iq iqVar22 = gyVar.d;
                        if (gyVar.f35695c.f40493k == 1) {
                            iqVar22.setText("");
                            gyVar.c(null, false);
                            if (fyVar != null) {
                                fyVar.G1();
                                fyVar.I1(null);
                                fyVar.J1(true, true);
                            }
                            gyVar.f(false);
                            iqVar22.clearAnimation();
                            iqVar22.animate().translationX(0.0f).setInterpolator(nr.h).start();
                            gyVar.d(false);
                            return;
                        }
                        return;
                    default:
                        gy gyVar2 = this.f34615b;
                        iq iqVar3 = gyVar2.d;
                        iqVar3.setText("");
                        gyVar2.c(null, false);
                        fy fyVar2 = gyVar2.f35699r;
                        if (fyVar2 != null) {
                            fyVar2.G1();
                            fyVar2.I1(null);
                            fyVar2.J1(true, true);
                        }
                        gyVar2.f(false);
                        iqVar3.clearAnimation();
                        iqVar3.animate().translationX(0.0f).setInterpolator(nr.h).start();
                        gyVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, c8.ma.e(36, 36, 53));
        if (i7 == 1 && (!tyVar.d2 || !org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24798t0).q())) {
            return;
        }
        if (i7 == 0) {
            i11 = i10;
        } else {
            i11 = 0;
        }
        fy fyVar = new fy(this, context, i11, tyVar.f40089a2, i7);
        this.f35699r = fyVar;
        fyVar.E3 = z14;
        TextPaint paint = iqVar.getPaint();
        fyVar.setDontOccupyWidth(org.telegram.messenger.g0.L(f10) + ((int) paint.measureText(((Object) iqVar.getHint()) + "")));
        if (tyVar.f40153v0) {
            org.telegram.ui.ActionBar.t6.i(fyVar, org.telegram.ui.ActionBar.t6.p(org.telegram.ui.ActionBar.m6.f29798zf, org.telegram.ui.ActionBar.m6.Af), h6Var);
        }
        fyVar.setOnScrollIntoOccupiedWidth(new org.telegram.messenger.x10(this) {
            public final gy f35012b;

            {
                this.f35012b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z15;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        gy gyVar = this.f35012b;
                        gyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        gyVar.d(z15);
                        gyVar.g(false);
                        return;
                    default:
                        hv0 hv0Var = (hv0) obj;
                        gy gyVar2 = this.f35012b;
                        ty tyVar2 = gyVar2.H;
                        fy fyVar2 = gyVar2.f35699r;
                        if (hv0Var == null) {
                            gyVar2.d(false);
                            fyVar2.I1(null);
                            tyVar2.f40133p0.d.setText("");
                            tyVar2.f40117j0.h1(0, 0);
                            return;
                        } else if (fyVar2.getSelectedCategory() == hv0Var) {
                            gyVar2.c(null, false);
                            fyVar2.I1(null);
                            return;
                        } else {
                            gyVar2.c(hv0Var.f35984a, false);
                            fyVar2.I1(hv0Var);
                            return;
                        }
                }
            }
        });
        fyVar.setOnTouchListener(new m.c2(this, 2));
        fyVar.setOnCategoryClick(new org.telegram.messenger.x10(this) {
            public final gy f35012b;

            {
                this.f35012b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z15;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        gy gyVar = this.f35012b;
                        gyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        gyVar.d(z15);
                        gyVar.g(false);
                        return;
                    default:
                        hv0 hv0Var = (hv0) obj;
                        gy gyVar2 = this.f35012b;
                        ty tyVar2 = gyVar2.H;
                        fy fyVar2 = gyVar2.f35699r;
                        if (hv0Var == null) {
                            gyVar2.d(false);
                            fyVar2.I1(null);
                            tyVar2.f40133p0.d.setText("");
                            tyVar2.f40117j0.h1(0, 0);
                            return;
                        } else if (fyVar2.getSelectedCategory() == hv0Var) {
                            gyVar2.c(null, false);
                            fyVar2.I1(null);
                            return;
                        } else {
                            gyVar2.c(hv0Var.f35984a, false);
                            fyVar2.I1(hv0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(fyVar, c8.ma.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public static void a(gy gyVar, boolean z10, boolean z11) {
        gyVar.f35693a.a(z10, z11);
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        int i10;
        if (i7 == 0) {
            View view = this.f35696e;
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
        ty tyVar = this.H;
        int i7 = this.f35694b;
        if (i7 == 0) {
            oy oyVar = tyVar.A0;
            ny nyVar = oyVar.P;
            ty tyVar2 = oyVar.R;
            gw gwVar = tyVar2.H0;
            dw dwVar = tyVar2.E0;
            if (oyVar.M != 0) {
                ConnectionsManager.getInstance(tyVar2.f40099d1).cancelRequest(oyVar.M, true);
                oyVar.M = 0;
            }
            if (TextUtils.isEmpty(str)) {
                oyVar.O = null;
                oyVar.F.clear();
                oyVar.I.clear();
                oyVar.L = new ArrayList();
                v4.i0 adapter = dwVar.getAdapter();
                ly lyVar = tyVar2.f40168z0;
                if (adapter != lyVar) {
                    dwVar.setAdapter(lyVar);
                }
                oyVar.d = 0L;
                tyVar2.f40086a.a(false, true);
                oyVar.f();
                gwVar.e(false);
            } else {
                oyVar.O = str.toLowerCase();
                gwVar.e(true);
            }
            org.telegram.messenger.g0.r(nyVar);
            org.telegram.messenger.g0.h3(nyVar, 300L);
        } else if (i7 == 1) {
            tyVar.T.F(str, z10);
        } else if (i7 == 2) {
            tyVar.f40120k0.G(str, z10);
        }
    }

    public final void d(boolean z10) {
        float f10;
        if (z10 == this.f35703y) {
            return;
        }
        this.f35703y = z10;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f35702x;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new x(this, 23));
        this.E.setDuration(120L);
        this.E.setInterpolator(nr.h);
        this.E.start();
    }

    public final void e(boolean z10) {
        this.G = z10;
        if (z10) {
            this.f35695c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z10) {
        if (z10) {
            if (this.F == null) {
                oo ooVar = new oo(this, 16);
                this.F = ooVar;
                org.telegram.messenger.g0.h3(ooVar, 340L);
                return;
            }
            return;
        }
        oo ooVar2 = this.F;
        if (ooVar2 != null) {
            org.telegram.messenger.g0.r(ooVar2);
            this.F = null;
        }
        org.telegram.messenger.g0.T3(this.h, false, true);
    }

    public final void g(boolean z10) {
        int i7;
        boolean z11 = this.G;
        iq iqVar = this.d;
        fy fyVar = this.f35699r;
        if (z11 && ((iqVar.length() != 0 || (fyVar != null && fyVar.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (iqVar.length() <= 0 && (fyVar == null || fyVar.f37301w3 <= 0.5f || (!fyVar.f37296r3 && fyVar.getSelectedCategory() == null))) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        this.f35695c.b(i7);
        this.G = false;
    }

    @Override
    public final void updateColors() {
        try {
            this.d.setCursorColor(this.H.z(org.telegram.ui.ActionBar.m6.Di));
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

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
public abstract class dy extends FrameLayout implements org.telegram.ui.ActionBar.c6, te.b {
    public ValueAnimator E;
    public lo F;
    public boolean G;
    public final qy H;
    public final te.a f34480a;
    public final int f34481b;
    public final ul0 f34482c;
    public final fq d;
    public final View f34483e;
    public final View f34484f;
    public final ImageView h;
    public final FrameLayout f34485n;
    public final cy f34486r;
    public final ai.h0 f34487s;
    public final View f34488w;
    public float f34489x;
    public boolean f34490y;

    public dy(qy qyVar, Context context, int i7) {
        super(context);
        int z10;
        int z11;
        int z12;
        int z13;
        fq fqVar;
        ImageView.ScaleType scaleType;
        int i10;
        float f10;
        int i11;
        this.H = qyVar;
        this.f34480a = new te.a(0, this, kr.f36859g, 200L, false);
        this.f34490y = false;
        org.telegram.ui.ActionBar.t6 t6Var = org.telegram.ui.ActionBar.u6.f30163a;
        this.f34481b = i7;
        View view = new View(context);
        this.f34483e = view;
        view.setVisibility(4);
        int i12 = org.telegram.ui.ActionBar.n6.Cf;
        org.telegram.ui.ActionBar.i6 i6Var = qyVar.f39037a2;
        boolean z14 = qyVar.f39067j2;
        org.telegram.ui.ActionBar.u6.h(i12, view, i6Var);
        addView(view, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83));
        View view2 = new View(context);
        this.f34484f = view2;
        if (qyVar.f39101v0) {
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29871zf, view2, i6Var);
        }
        addView(view2, new FrameLayout.LayoutParams(-1, qyVar.f39044c1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34485n = frameLayout;
        int L = org.telegram.messenger.g0.L(18.0f);
        if (z14) {
            z10 = qyVar.v(0.06f);
        } else {
            z10 = qyVar.z(org.telegram.ui.ActionBar.n6.Af);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.n6.d0(L, z10));
        frameLayout.setClipToOutline(true);
        bg.q0 q0Var = bg.u0.f3313a;
        frameLayout.setOutlineProvider(new bg.s0(0, org.telegram.messenger.g0.L(18.0f)));
        if (i7 == 2) {
            addView(frameLayout, c8.na.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, c8.na.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ai.h0 h0Var = new ai.h0(17, context, this);
        this.f34487s = h0Var;
        frameLayout.addView(h0Var, c8.na.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ul0 ul0Var = new ul0();
        this.f34482c = ul0Var;
        ul0Var.c(0, false, false);
        if (z14) {
            z11 = qyVar.v(0.4f);
        } else {
            z11 = qyVar.z(org.telegram.ui.ActionBar.n6.Bf);
        }
        ul0Var.a(z11);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageDrawable(ul0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final dy f43073b;

            {
                this.f43073b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        dy dyVar = this.f43073b;
                        cy cyVar = dyVar.f34486r;
                        fq fqVar2 = dyVar.d;
                        if (dyVar.f34482c.f40411k == 1) {
                            fqVar2.setText("");
                            dyVar.c(null, false);
                            if (cyVar != null) {
                                cyVar.G1();
                                cyVar.I1(null);
                                cyVar.J1(true, true);
                            }
                            dyVar.f(false);
                            fqVar2.clearAnimation();
                            fqVar2.animate().translationX(0.0f).setInterpolator(kr.h).start();
                            dyVar.d(false);
                            return;
                        }
                        return;
                    default:
                        dy dyVar2 = this.f43073b;
                        fq fqVar3 = dyVar2.d;
                        fqVar3.setText("");
                        dyVar2.c(null, false);
                        cy cyVar2 = dyVar2.f34486r;
                        if (cyVar2 != null) {
                            cyVar2.G1();
                            cyVar2.I1(null);
                            cyVar2.J1(true, true);
                        }
                        dyVar2.f(false);
                        fqVar3.clearAnimation();
                        fqVar3.animate().translationX(0.0f).setInterpolator(kr.h).start();
                        dyVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, c8.na.e(36, 36, 51));
        fq fqVar2 = new fq(this, context, i7, 2);
        this.d = fqVar2;
        fqVar2.setTextSize(1, 16.0f);
        if (z14) {
            z12 = qyVar.v(0.45f);
        } else {
            z12 = qyVar.z(org.telegram.ui.ActionBar.n6.Bf);
        }
        fqVar2.setHintTextColor(z12);
        if (z14) {
            z13 = qyVar.v(0.8f);
        } else {
            z13 = qyVar.z(org.telegram.ui.ActionBar.n6.G6);
        }
        fqVar2.setTextColor(z13);
        fqVar2.setBackgroundDrawable(null);
        fqVar2.setPadding(0, 0, 0, 0);
        fqVar2.setMaxLines(1);
        fqVar2.setLines(1);
        fqVar2.setSingleLine(true);
        fqVar2.setImeOptions(268435459);
        fqVar2.setHint(org.telegram.messenger.gd.N0(2131745640, null));
        org.telegram.ui.ActionBar.u6.l(fqVar2, 30, org.telegram.ui.ActionBar.n6.Di, i6Var);
        fqVar2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        fqVar2.setCursorWidth(1.5f);
        fqVar2.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        h0Var.addView(fqVar2, c8.na.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        fqVar2.addTextChangedListener(new ah.j(this, 22));
        if (qyVar.f39101v0) {
            View view3 = new View(context);
            this.f34488w = view3;
            Drawable g10 = i5.c.g(context, 2131231230);
            org.telegram.ui.ActionBar.q6 p10 = org.telegram.ui.ActionBar.u6.p(org.telegram.ui.ActionBar.n6.f29871zf, org.telegram.ui.ActionBar.n6.Af);
            fqVar = fqVar2;
            scaleType = scaleType2;
            i10 = 3;
            f10 = 16.0f;
            org.telegram.ui.ActionBar.u6.k(this, g10, p10.f30010a, p10.f30011b, 4, 0.0f, i6Var, PorterDuff.Mode.MULTIPLY);
            view3.setBackground(g10);
            view3.setAlpha(0.0f);
            h0Var.addView(view3, c8.na.e(18, -1, 3));
        } else {
            fqVar = fqVar2;
            scaleType = scaleType2;
            i10 = 3;
            f10 = 16.0f;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new hi.j2(this));
        int i13 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i13, i6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i13);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView2, h02, null, M, i6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final dy f43073b;

            {
                this.f43073b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        dy dyVar = this.f43073b;
                        cy cyVar = dyVar.f34486r;
                        fq fqVar22 = dyVar.d;
                        if (dyVar.f34482c.f40411k == 1) {
                            fqVar22.setText("");
                            dyVar.c(null, false);
                            if (cyVar != null) {
                                cyVar.G1();
                                cyVar.I1(null);
                                cyVar.J1(true, true);
                            }
                            dyVar.f(false);
                            fqVar22.clearAnimation();
                            fqVar22.animate().translationX(0.0f).setInterpolator(kr.h).start();
                            dyVar.d(false);
                            return;
                        }
                        return;
                    default:
                        dy dyVar2 = this.f43073b;
                        fq fqVar3 = dyVar2.d;
                        fqVar3.setText("");
                        dyVar2.c(null, false);
                        cy cyVar2 = dyVar2.f34486r;
                        if (cyVar2 != null) {
                            cyVar2.G1();
                            cyVar2.I1(null);
                            cyVar2.J1(true, true);
                        }
                        dyVar2.f(false);
                        fqVar3.clearAnimation();
                        fqVar3.animate().translationX(0.0f).setInterpolator(kr.h).start();
                        dyVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, c8.na.e(36, 36, 53));
        if (i7 == 1 && (!qyVar.d2 || !org.telegram.messenger.i10.i(org.telegram.messenger.i10.f24637t0).q())) {
            return;
        }
        if (i7 == 0) {
            i11 = i10;
        } else {
            i11 = 0;
        }
        cy cyVar = new cy(this, context, i11, qyVar.f39037a2, i7);
        this.f34486r = cyVar;
        cyVar.E3 = z14;
        TextPaint paint = fqVar.getPaint();
        cyVar.setDontOccupyWidth(org.telegram.messenger.g0.L(f10) + ((int) paint.measureText(((Object) fqVar.getHint()) + "")));
        if (qyVar.f39101v0) {
            org.telegram.ui.ActionBar.u6.i(cyVar, org.telegram.ui.ActionBar.u6.p(org.telegram.ui.ActionBar.n6.f29871zf, org.telegram.ui.ActionBar.n6.Af), i6Var);
        }
        cyVar.setOnScrollIntoOccupiedWidth(new org.telegram.messenger.w10(this) {
            public final dy f33578b;

            {
                this.f33578b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z15;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        dy dyVar = this.f33578b;
                        dyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        dyVar.d(z15);
                        dyVar.g(false);
                        return;
                    default:
                        gv0 gv0Var = (gv0) obj;
                        dy dyVar2 = this.f33578b;
                        qy qyVar2 = dyVar2.H;
                        cy cyVar2 = dyVar2.f34486r;
                        if (gv0Var == null) {
                            dyVar2.d(false);
                            cyVar2.I1(null);
                            qyVar2.f39081p0.d.setText("");
                            qyVar2.f39065j0.h1(0, 0);
                            return;
                        } else if (cyVar2.getSelectedCategory() == gv0Var) {
                            dyVar2.c(null, false);
                            cyVar2.I1(null);
                            return;
                        } else {
                            dyVar2.c(gv0Var.f35560a, false);
                            cyVar2.I1(gv0Var);
                            return;
                        }
                }
            }
        });
        cyVar.setOnTouchListener(new m.c2(this, 2));
        cyVar.setOnCategoryClick(new org.telegram.messenger.w10(this) {
            public final dy f33578b;

            {
                this.f33578b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z15;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        dy dyVar = this.f33578b;
                        dyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        dyVar.d(z15);
                        dyVar.g(false);
                        return;
                    default:
                        gv0 gv0Var = (gv0) obj;
                        dy dyVar2 = this.f33578b;
                        qy qyVar2 = dyVar2.H;
                        cy cyVar2 = dyVar2.f34486r;
                        if (gv0Var == null) {
                            dyVar2.d(false);
                            cyVar2.I1(null);
                            qyVar2.f39081p0.d.setText("");
                            qyVar2.f39065j0.h1(0, 0);
                            return;
                        } else if (cyVar2.getSelectedCategory() == gv0Var) {
                            dyVar2.c(null, false);
                            cyVar2.I1(null);
                            return;
                        } else {
                            dyVar2.c(gv0Var.f35560a, false);
                            cyVar2.I1(gv0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(cyVar, c8.na.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public static void a(dy dyVar, boolean z10, boolean z11) {
        dyVar.f34480a.a(z10, z11);
    }

    @Override
    public final void K(int i7, float f10, float f11, te.c cVar) {
        int i10;
        if (i7 == 0) {
            View view = this.f34483e;
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
        qy qyVar = this.H;
        int i7 = this.f34481b;
        if (i7 == 0) {
            ly lyVar = qyVar.A0;
            ky kyVar = lyVar.P;
            qy qyVar2 = lyVar.R;
            dw dwVar = qyVar2.H0;
            aw awVar = qyVar2.E0;
            if (lyVar.M != 0) {
                ConnectionsManager.getInstance(qyVar2.f39047d1).cancelRequest(lyVar.M, true);
                lyVar.M = 0;
            }
            if (TextUtils.isEmpty(str)) {
                lyVar.O = null;
                lyVar.F.clear();
                lyVar.I.clear();
                lyVar.L = new ArrayList();
                v4.i0 adapter = awVar.getAdapter();
                iy iyVar = qyVar2.f39116z0;
                if (adapter != iyVar) {
                    awVar.setAdapter(iyVar);
                }
                lyVar.d = 0L;
                qyVar2.f39034a.a(false, true);
                lyVar.f();
                dwVar.e(false);
            } else {
                lyVar.O = str.toLowerCase();
                dwVar.e(true);
            }
            org.telegram.messenger.g0.r(kyVar);
            org.telegram.messenger.g0.h3(kyVar, 300L);
        } else if (i7 == 1) {
            qyVar.T.F(str, z10);
        } else if (i7 == 2) {
            qyVar.f39068k0.G(str, z10);
        }
    }

    public final void d(boolean z10) {
        float f10;
        if (z10 == this.f34490y) {
            return;
        }
        this.f34490y = z10;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f34489x;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new w(this, 23));
        this.E.setDuration(120L);
        this.E.setInterpolator(kr.h);
        this.E.start();
    }

    public final void e(boolean z10) {
        this.G = z10;
        if (z10) {
            this.f34482c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z10) {
        if (z10) {
            if (this.F == null) {
                lo loVar = new lo(this, 16);
                this.F = loVar;
                org.telegram.messenger.g0.h3(loVar, 340L);
                return;
            }
            return;
        }
        lo loVar2 = this.F;
        if (loVar2 != null) {
            org.telegram.messenger.g0.r(loVar2);
            this.F = null;
        }
        org.telegram.messenger.g0.T3(this.h, false, true);
    }

    public final void g(boolean z10) {
        int i7;
        boolean z11 = this.G;
        fq fqVar = this.d;
        cy cyVar = this.f34486r;
        if (z11 && ((fqVar.length() != 0 || (cyVar != null && cyVar.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (fqVar.length() <= 0 && (cyVar == null || cyVar.f36914w3 <= 0.5f || (!cyVar.f36909r3 && cyVar.getSelectedCategory() == null))) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        this.f34482c.b(i7);
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
    public final void G(float f10, int i7) {
    }
}

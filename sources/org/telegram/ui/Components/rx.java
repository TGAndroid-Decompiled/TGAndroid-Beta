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
public abstract class rx extends FrameLayout implements org.telegram.ui.ActionBar.z5, qe.b {
    public ValueAnimator E;
    public gp F;
    public boolean G;
    public final ey H;
    public final qe.a f37825a;
    public final int f37826b;
    public final jl0 f37827c;
    public final rp d;
    public final View f37828e;
    public final View f37829f;
    public final ImageView h;
    public final FrameLayout f37830n;
    public final qx f37831r;
    public final ai.c0 f37832s;
    public final View f37833w;
    public float f37834x;
    public boolean f37835y;

    public rx(ey eyVar, Context context, int i3) {
        super(context);
        int z10;
        int z11;
        int z12;
        int z13;
        rp rpVar;
        ImageView.ScaleType scaleType;
        int i10;
        float f10;
        int i11;
        this.H = eyVar;
        this.f37825a = new qe.a(0, this, xq.f40453g, 200L, false);
        this.f37835y = false;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.f28514a;
        this.f37826b = i3;
        View view = new View(context);
        this.f37828e = view;
        view.setVisibility(4);
        int i12 = org.telegram.ui.ActionBar.k6.f28299zf;
        org.telegram.ui.ActionBar.e6 e6Var = eyVar.f33520a2;
        boolean z14 = eyVar.f33550j2;
        org.telegram.ui.ActionBar.r6.i(i12, view, e6Var);
        addView(view, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83));
        View view2 = new View(context);
        this.f37829f = view2;
        if (eyVar.f33584v0) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f28243wf, view2, e6Var);
        }
        addView(view2, new FrameLayout.LayoutParams(-1, eyVar.f33527c1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f37830n = frameLayout;
        int L = org.telegram.messenger.g0.L(18.0f);
        if (z14) {
            z10 = eyVar.v(0.06f);
        } else {
            z10 = eyVar.z(org.telegram.ui.ActionBar.k6.f28262xf);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.k6.d0(L, z10));
        frameLayout.setClipToOutline(true);
        cg.p0 p0Var = cg.t0.f4745a;
        frameLayout.setOutlineProvider(new cg.r0(0, org.telegram.messenger.g0.L(18.0f)));
        if (i3 == 2) {
            addView(frameLayout, b8.mf.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, b8.mf.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ai.c0 c0Var = new ai.c0(15, context, this);
        this.f37832s = c0Var;
        frameLayout.addView(c0Var, b8.mf.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        jl0 jl0Var = new jl0();
        this.f37827c = jl0Var;
        jl0Var.c(0, false, false);
        if (z14) {
            z11 = eyVar.v(0.4f);
        } else {
            z11 = eyVar.z(org.telegram.ui.ActionBar.k6.f28280yf);
        }
        jl0Var.a(z11);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageDrawable(jl0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final rx f36977b;

            {
                this.f36977b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        rx rxVar = this.f36977b;
                        qx qxVar = rxVar.f37831r;
                        rp rpVar2 = rxVar.d;
                        if (rxVar.f37827c.f35109k == 1) {
                            rpVar2.setText("");
                            rxVar.c(null, false);
                            if (qxVar != null) {
                                qxVar.G1();
                                qxVar.I1(null);
                                qxVar.J1(true, true);
                            }
                            rxVar.f(false);
                            rpVar2.clearAnimation();
                            rpVar2.animate().translationX(0.0f).setInterpolator(xq.h).start();
                            rxVar.d(false);
                            return;
                        }
                        return;
                    default:
                        rx rxVar2 = this.f36977b;
                        rp rpVar3 = rxVar2.d;
                        rpVar3.setText("");
                        rxVar2.c(null, false);
                        qx qxVar2 = rxVar2.f37831r;
                        if (qxVar2 != null) {
                            qxVar2.G1();
                            qxVar2.I1(null);
                            qxVar2.J1(true, true);
                        }
                        rxVar2.f(false);
                        rpVar3.clearAnimation();
                        rpVar3.animate().translationX(0.0f).setInterpolator(xq.h).start();
                        rxVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, b8.mf.e(36, 36, 51));
        rp rpVar2 = new rp(this, context, i3, 2);
        this.d = rpVar2;
        rpVar2.setTextSize(1, 16.0f);
        if (z14) {
            z12 = eyVar.v(0.45f);
        } else {
            z12 = eyVar.z(org.telegram.ui.ActionBar.k6.f28280yf);
        }
        rpVar2.setHintTextColor(z12);
        if (z14) {
            z13 = eyVar.v(0.8f);
        } else {
            z13 = eyVar.z(org.telegram.ui.ActionBar.k6.G6);
        }
        rpVar2.setTextColor(z13);
        rpVar2.setBackgroundDrawable(null);
        rpVar2.setPadding(0, 0, 0, 0);
        rpVar2.setMaxLines(1);
        rpVar2.setLines(1);
        rpVar2.setSingleLine(true);
        rpVar2.setImeOptions(268435459);
        rpVar2.setHint(org.telegram.messenger.bd.M0(2131745846, null));
        org.telegram.ui.ActionBar.r6.m(rpVar2, 30, org.telegram.ui.ActionBar.k6.Ai, e6Var);
        rpVar2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        rpVar2.setCursorWidth(1.5f);
        rpVar2.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        c0Var.addView(rpVar2, b8.mf.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        rpVar2.addTextChangedListener(new bh.h(this, 19));
        if (eyVar.f33584v0) {
            View view3 = new View(context);
            this.f37833w = view3;
            Drawable g7 = k2.p1.g(context, 2131231227);
            org.telegram.ui.ActionBar.n6 q10 = org.telegram.ui.ActionBar.r6.q(org.telegram.ui.ActionBar.k6.f28243wf, org.telegram.ui.ActionBar.k6.f28262xf);
            rpVar = rpVar2;
            scaleType = scaleType2;
            i10 = 3;
            f10 = 16.0f;
            org.telegram.ui.ActionBar.r6.l(this, g7, q10.f28359a, q10.f28360b, 4, 0.0f, e6Var, PorterDuff.Mode.MULTIPLY);
            view3.setBackground(g7);
            view3.setAlpha(0.0f);
            c0Var.addView(view3, b8.mf.e(18, -1, 3));
        } else {
            rpVar = rpVar2;
            scaleType = scaleType2;
            i10 = 3;
            f10 = 16.0f;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new gi.b2(this));
        int i13 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i13, e6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView2, h02, null, N, e6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final rx f36977b;

            {
                this.f36977b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        rx rxVar = this.f36977b;
                        qx qxVar = rxVar.f37831r;
                        rp rpVar22 = rxVar.d;
                        if (rxVar.f37827c.f35109k == 1) {
                            rpVar22.setText("");
                            rxVar.c(null, false);
                            if (qxVar != null) {
                                qxVar.G1();
                                qxVar.I1(null);
                                qxVar.J1(true, true);
                            }
                            rxVar.f(false);
                            rpVar22.clearAnimation();
                            rpVar22.animate().translationX(0.0f).setInterpolator(xq.h).start();
                            rxVar.d(false);
                            return;
                        }
                        return;
                    default:
                        rx rxVar2 = this.f36977b;
                        rp rpVar3 = rxVar2.d;
                        rpVar3.setText("");
                        rxVar2.c(null, false);
                        qx qxVar2 = rxVar2.f37831r;
                        if (qxVar2 != null) {
                            qxVar2.G1();
                            qxVar2.I1(null);
                            qxVar2.J1(true, true);
                        }
                        rxVar2.f(false);
                        rpVar3.clearAnimation();
                        rpVar3.animate().translationX(0.0f).setInterpolator(xq.h).start();
                        rxVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, b8.mf.e(36, 36, 53));
        if (i3 == 1 && (!eyVar.f33530d2 || !org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).q())) {
            return;
        }
        if (i3 == 0) {
            i11 = i10;
        } else {
            i11 = 0;
        }
        qx qxVar = new qx(this, context, i11, eyVar.f33520a2, i3);
        this.f37831r = qxVar;
        qxVar.E3 = z14;
        TextPaint paint = rpVar.getPaint();
        qxVar.setDontOccupyWidth(org.telegram.messenger.g0.L(f10) + ((int) paint.measureText(((Object) rpVar.getHint()) + "")));
        if (eyVar.f33584v0) {
            org.telegram.ui.ActionBar.r6.j(qxVar, org.telegram.ui.ActionBar.r6.q(org.telegram.ui.ActionBar.k6.f28243wf, org.telegram.ui.ActionBar.k6.f28262xf), e6Var);
        }
        qxVar.setOnScrollIntoOccupiedWidth(new org.telegram.messenger.u10(this) {
            public final rx f37264b;

            {
                this.f37264b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z15;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        rx rxVar = this.f37264b;
                        rxVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        rxVar.d(z15);
                        rxVar.g(false);
                        return;
                    default:
                        tu0 tu0Var = (tu0) obj;
                        rx rxVar2 = this.f37264b;
                        ey eyVar2 = rxVar2.H;
                        qx qxVar2 = rxVar2.f37831r;
                        if (tu0Var == null) {
                            rxVar2.d(false);
                            qxVar2.I1(null);
                            eyVar2.f33564p0.d.setText("");
                            eyVar2.f33548j0.h1(0, 0);
                            return;
                        } else if (qxVar2.getSelectedCategory() == tu0Var) {
                            rxVar2.c(null, false);
                            qxVar2.I1(null);
                            return;
                        } else {
                            rxVar2.c(tu0Var.f38555a, false);
                            qxVar2.I1(tu0Var);
                            return;
                        }
                }
            }
        });
        qxVar.setOnTouchListener(new m.c2(this, 2));
        qxVar.setOnCategoryClick(new org.telegram.messenger.u10(this) {
            public final rx f37264b;

            {
                this.f37264b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z15;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        rx rxVar = this.f37264b;
                        rxVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        rxVar.d(z15);
                        rxVar.g(false);
                        return;
                    default:
                        tu0 tu0Var = (tu0) obj;
                        rx rxVar2 = this.f37264b;
                        ey eyVar2 = rxVar2.H;
                        qx qxVar2 = rxVar2.f37831r;
                        if (tu0Var == null) {
                            rxVar2.d(false);
                            qxVar2.I1(null);
                            eyVar2.f33564p0.d.setText("");
                            eyVar2.f33548j0.h1(0, 0);
                            return;
                        } else if (qxVar2.getSelectedCategory() == tu0Var) {
                            rxVar2.c(null, false);
                            qxVar2.I1(null);
                            return;
                        } else {
                            rxVar2.c(tu0Var.f38555a, false);
                            qxVar2.I1(tu0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(qxVar, b8.mf.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public static void a(rx rxVar, boolean z10, boolean z11) {
        rxVar.f37825a.a(z10, z11);
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        int i10;
        if (i3 == 0) {
            View view = this.f37828e;
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
        ey eyVar = this.H;
        int i3 = this.f37826b;
        if (i3 == 0) {
            yx yxVar = eyVar.A0;
            xx xxVar = yxVar.P;
            ey eyVar2 = yxVar.R;
            rv rvVar = eyVar2.H0;
            ov ovVar = eyVar2.E0;
            if (yxVar.M != 0) {
                ConnectionsManager.getInstance(eyVar2.f33529d1).cancelRequest(yxVar.M, true);
                yxVar.M = 0;
            }
            if (TextUtils.isEmpty(str)) {
                yxVar.O = null;
                yxVar.F.clear();
                yxVar.I.clear();
                yxVar.L = new ArrayList();
                u4.h0 adapter = ovVar.getAdapter();
                vx vxVar = eyVar2.f33599z0;
                if (adapter != vxVar) {
                    ovVar.setAdapter(vxVar);
                }
                yxVar.d = 0L;
                eyVar2.f33517a.a(false, true);
                yxVar.f();
                rvVar.e(false);
            } else {
                yxVar.O = str.toLowerCase();
                rvVar.e(true);
            }
            org.telegram.messenger.g0.r(xxVar);
            org.telegram.messenger.g0.i3(xxVar, 300L);
        } else if (i3 == 1) {
            eyVar.T.F(str, z10);
        } else if (i3 == 2) {
            eyVar.f33551k0.G(str, z10);
        }
    }

    public final void d(boolean z10) {
        float f10;
        if (z10 == this.f37835y) {
            return;
        }
        this.f37835y = z10;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f37834x;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new c6(this, 22));
        this.E.setDuration(120L);
        this.E.setInterpolator(xq.h);
        this.E.start();
    }

    public final void e(boolean z10) {
        this.G = z10;
        if (z10) {
            this.f37827c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z10) {
        if (z10) {
            if (this.F == null) {
                gp gpVar = new gp(this, 14);
                this.F = gpVar;
                org.telegram.messenger.g0.i3(gpVar, 340L);
                return;
            }
            return;
        }
        gp gpVar2 = this.F;
        if (gpVar2 != null) {
            org.telegram.messenger.g0.r(gpVar2);
            this.F = null;
        }
        org.telegram.messenger.g0.V3(this.h, false, true);
    }

    public final void g(boolean z10) {
        int i3;
        boolean z11 = this.G;
        rp rpVar = this.d;
        qx qxVar = this.f37831r;
        if (z11 && ((rpVar.length() != 0 || (qxVar != null && qxVar.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (rpVar.length() <= 0 && (qxVar == null || qxVar.f40499w3 <= 0.5f || (!qxVar.f40494r3 && qxVar.getSelectedCategory() == null))) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        this.f37827c.b(i3);
        this.G = false;
    }

    @Override
    public final void updateColors() {
        try {
            this.d.setCursorColor(this.H.z(org.telegram.ui.ActionBar.k6.Ai));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void F(float f10, int i3) {
    }
}

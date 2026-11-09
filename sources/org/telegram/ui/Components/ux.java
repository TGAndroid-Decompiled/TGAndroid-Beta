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
public abstract class ux extends FrameLayout implements org.telegram.ui.ActionBar.b6, te.b {
    public ValueAnimator D;
    public gp E;
    public boolean F;
    public final hy G;
    public final te.a f38818a;
    public final int f38819b;
    public final gl0 f38820c;
    public final rp d;
    public final View f38821e;
    public final View f38822f;
    public final ImageView h;
    public final FrameLayout f38823n;
    public final tx f38824r;
    public final bi.x5 f38825s;
    public final View f38826w;
    public float f38827x;
    public boolean f38828y;

    public ux(hy hyVar, Context context, int i7) {
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
        this.G = hyVar;
        this.f38818a = new te.a(0, this, xq.f40459g, 200L, false);
        this.f38828y = false;
        org.telegram.ui.ActionBar.r6 r6Var = org.telegram.ui.ActionBar.s6.f28500a;
        this.f38819b = i7;
        View view = new View(context);
        this.f38821e = view;
        view.setVisibility(4);
        int i12 = org.telegram.ui.ActionBar.l6.f28283zf;
        org.telegram.ui.ActionBar.g6 g6Var = hyVar.Z1;
        boolean z13 = hyVar.f34435i2;
        org.telegram.ui.ActionBar.s6.h(i12, view, g6Var);
        addView(view, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83));
        View view2 = new View(context);
        this.f38822f = view2;
        if (hyVar.f34469u0) {
            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f28227wf, view2, g6Var);
        }
        addView(view2, new FrameLayout.LayoutParams(-1, hyVar.f34411b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38823n = frameLayout;
        int L = org.telegram.messenger.g0.L(18.0f);
        if (z13) {
            z9 = hyVar.v(0.06f);
        } else {
            z9 = hyVar.z(org.telegram.ui.ActionBar.l6.f28246xf);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.l6.d0(L, z9));
        frameLayout.setClipToOutline(true);
        bg.q0 q0Var = bg.u0.f3380a;
        frameLayout.setOutlineProvider(new bg.s0(0, org.telegram.messenger.g0.L(18.0f)));
        if (i7 == 2) {
            addView(frameLayout, c8.ha.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, c8.ha.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        bi.x5 x5Var = new bi.x5(14, context, this);
        this.f38825s = x5Var;
        frameLayout.addView(x5Var, c8.ha.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        gl0 gl0Var = new gl0();
        this.f38820c = gl0Var;
        gl0Var.c(0, false, false);
        if (z13) {
            z10 = hyVar.v(0.4f);
        } else {
            z10 = hyVar.z(org.telegram.ui.ActionBar.l6.f28265yf);
        }
        gl0Var.a(z10);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageDrawable(gl0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ux f37834b;

            {
                this.f37834b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        ux uxVar = this.f37834b;
                        tx txVar = uxVar.f38824r;
                        rp rpVar2 = uxVar.d;
                        if (uxVar.f38820c.f33979k == 1) {
                            rpVar2.setText("");
                            uxVar.c(null, false);
                            if (txVar != null) {
                                txVar.G1();
                                txVar.I1(null);
                                txVar.J1(true, true);
                            }
                            uxVar.f(false);
                            rpVar2.clearAnimation();
                            rpVar2.animate().translationX(0.0f).setInterpolator(xq.h).start();
                            uxVar.d(false);
                            return;
                        }
                        return;
                    default:
                        ux uxVar2 = this.f37834b;
                        rp rpVar3 = uxVar2.d;
                        rpVar3.setText("");
                        uxVar2.c(null, false);
                        tx txVar2 = uxVar2.f38824r;
                        if (txVar2 != null) {
                            txVar2.G1();
                            txVar2.I1(null);
                            txVar2.J1(true, true);
                        }
                        uxVar2.f(false);
                        rpVar3.clearAnimation();
                        rpVar3.animate().translationX(0.0f).setInterpolator(xq.h).start();
                        uxVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, c8.ha.e(36, 36, 51));
        rp rpVar2 = new rp(this, context, i7, 2);
        this.d = rpVar2;
        rpVar2.setTextSize(1, 16.0f);
        if (z13) {
            z11 = hyVar.v(0.45f);
        } else {
            z11 = hyVar.z(org.telegram.ui.ActionBar.l6.f28265yf);
        }
        rpVar2.setHintTextColor(z11);
        if (z13) {
            z12 = hyVar.v(0.8f);
        } else {
            z12 = hyVar.z(org.telegram.ui.ActionBar.l6.G6);
        }
        rpVar2.setTextColor(z12);
        rpVar2.setBackgroundDrawable(null);
        rpVar2.setPadding(0, 0, 0, 0);
        rpVar2.setMaxLines(1);
        rpVar2.setLines(1);
        rpVar2.setSingleLine(true);
        rpVar2.setImeOptions(268435459);
        rpVar2.setHint(org.telegram.messenger.id.M0(2131745836, null));
        org.telegram.ui.ActionBar.s6.l(rpVar2, 30, org.telegram.ui.ActionBar.l6.Ai, g6Var);
        rpVar2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        rpVar2.setCursorWidth(1.5f);
        rpVar2.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        x5Var.addView(rpVar2, c8.ha.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        rpVar2.addTextChangedListener(new ah.j(this, 19));
        if (hyVar.f34469u0) {
            View view3 = new View(context);
            this.f38826w = view3;
            Drawable h = jg.g.h(context, 2131231227);
            org.telegram.ui.ActionBar.o6 p10 = org.telegram.ui.ActionBar.s6.p(org.telegram.ui.ActionBar.l6.f28227wf, org.telegram.ui.ActionBar.l6.f28246xf);
            rpVar = rpVar2;
            scaleType = scaleType2;
            i10 = 3;
            f10 = 16.0f;
            org.telegram.ui.ActionBar.s6.k(this, h, p10.f28350a, p10.f28351b, 4, 0.0f, g6Var, PorterDuff.Mode.MULTIPLY);
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
        int i13 = org.telegram.ui.ActionBar.l6.f27957i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(i13, g6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i13);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.s6.j(imageView2, h02, null, M, g6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final ux f37834b;

            {
                this.f37834b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        ux uxVar = this.f37834b;
                        tx txVar = uxVar.f38824r;
                        rp rpVar22 = uxVar.d;
                        if (uxVar.f38820c.f33979k == 1) {
                            rpVar22.setText("");
                            uxVar.c(null, false);
                            if (txVar != null) {
                                txVar.G1();
                                txVar.I1(null);
                                txVar.J1(true, true);
                            }
                            uxVar.f(false);
                            rpVar22.clearAnimation();
                            rpVar22.animate().translationX(0.0f).setInterpolator(xq.h).start();
                            uxVar.d(false);
                            return;
                        }
                        return;
                    default:
                        ux uxVar2 = this.f37834b;
                        rp rpVar3 = uxVar2.d;
                        rpVar3.setText("");
                        uxVar2.c(null, false);
                        tx txVar2 = uxVar2.f38824r;
                        if (txVar2 != null) {
                            txVar2.G1();
                            txVar2.I1(null);
                            txVar2.J1(true, true);
                        }
                        uxVar2.f(false);
                        rpVar3.clearAnimation();
                        rpVar3.animate().translationX(0.0f).setInterpolator(xq.h).start();
                        uxVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, c8.ha.e(36, 36, 53));
        if (i7 == 1 && (!hyVar.f34416c2 || !org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24470s0).q())) {
            return;
        }
        if (i7 == 0) {
            i11 = i10;
        } else {
            i11 = 0;
        }
        tx txVar = new tx(this, context, i11, hyVar.Z1, i7);
        this.f38824r = txVar;
        txVar.D3 = z13;
        TextPaint paint = rpVar.getPaint();
        txVar.setDontOccupyWidth(org.telegram.messenger.g0.L(f10) + ((int) paint.measureText(((Object) rpVar.getHint()) + "")));
        if (hyVar.f34469u0) {
            org.telegram.ui.ActionBar.s6.i(txVar, org.telegram.ui.ActionBar.s6.p(org.telegram.ui.ActionBar.l6.f28227wf, org.telegram.ui.ActionBar.l6.f28246xf), g6Var);
        }
        txVar.setOnScrollIntoOccupiedWidth(new org.telegram.messenger.c20(this) {
            public final ux f38168b;

            {
                this.f38168b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z14;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        ux uxVar = this.f38168b;
                        uxVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        uxVar.d(z14);
                        uxVar.g(false);
                        return;
                    default:
                        wu0 wu0Var = (wu0) obj;
                        ux uxVar2 = this.f38168b;
                        hy hyVar2 = uxVar2.G;
                        tx txVar2 = uxVar2.f38824r;
                        if (wu0Var == null) {
                            uxVar2.d(false);
                            txVar2.I1(null);
                            hyVar2.f34449o0.d.setText("");
                            hyVar2.f34433i0.h1(0, 0);
                            return;
                        } else if (txVar2.getSelectedCategory() == wu0Var) {
                            uxVar2.c(null, false);
                            txVar2.I1(null);
                            return;
                        } else {
                            uxVar2.c(wu0Var.f40165a, false);
                            txVar2.I1(wu0Var);
                            return;
                        }
                }
            }
        });
        txVar.setOnTouchListener(new m.d2(this, 2));
        txVar.setOnCategoryClick(new org.telegram.messenger.c20(this) {
            public final ux f38168b;

            {
                this.f38168b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z14;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        ux uxVar = this.f38168b;
                        uxVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        uxVar.d(z14);
                        uxVar.g(false);
                        return;
                    default:
                        wu0 wu0Var = (wu0) obj;
                        ux uxVar2 = this.f38168b;
                        hy hyVar2 = uxVar2.G;
                        tx txVar2 = uxVar2.f38824r;
                        if (wu0Var == null) {
                            uxVar2.d(false);
                            txVar2.I1(null);
                            hyVar2.f34449o0.d.setText("");
                            hyVar2.f34433i0.h1(0, 0);
                            return;
                        } else if (txVar2.getSelectedCategory() == wu0Var) {
                            uxVar2.c(null, false);
                            txVar2.I1(null);
                            return;
                        } else {
                            uxVar2.c(wu0Var.f40165a, false);
                            txVar2.I1(wu0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(txVar, c8.ha.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public static void a(ux uxVar, boolean z9, boolean z10) {
        uxVar.f38818a.a(z9, z10);
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        int i10;
        if (i7 == 0) {
            View view = this.f38821e;
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
        hy hyVar = this.G;
        int i7 = this.f38819b;
        if (i7 == 0) {
            cy cyVar = hyVar.f34487z0;
            ay ayVar = cyVar.O;
            hy hyVar2 = cyVar.Q;
            tv tvVar = hyVar2.G0;
            qv qvVar = hyVar2.D0;
            if (cyVar.L != 0) {
                ConnectionsManager.getInstance(hyVar2.f34415c1).cancelRequest(cyVar.L, true);
                cyVar.L = 0;
            }
            if (TextUtils.isEmpty(str)) {
                cyVar.N = null;
                cyVar.E.clear();
                cyVar.H.clear();
                cyVar.K = new ArrayList();
                v4.g0 adapter = qvVar.getAdapter();
                yx yxVar = hyVar2.f34484y0;
                if (adapter != yxVar) {
                    qvVar.setAdapter(yxVar);
                }
                cyVar.d = 0L;
                hyVar2.f34405a.a(false, true);
                cyVar.f();
                tvVar.e(false);
            } else {
                cyVar.N = str.toLowerCase();
                tvVar.e(true);
            }
            org.telegram.messenger.g0.r(ayVar);
            org.telegram.messenger.g0.i3(ayVar, 300L);
        } else if (i7 == 1) {
            hyVar.S.F(str, z9);
        } else if (i7 == 2) {
            hyVar.f34436j0.G(str, z9);
        }
    }

    public final void d(boolean z9) {
        float f10;
        if (z9 == this.f38828y) {
            return;
        }
        this.f38828y = z9;
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f38827x;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.D = ofFloat;
        ofFloat.addUpdateListener(new e6(this, 22));
        this.D.setDuration(120L);
        this.D.setInterpolator(xq.h);
        this.D.start();
    }

    public final void e(boolean z9) {
        this.F = z9;
        if (z9) {
            this.f38820c.b(2);
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
        tx txVar = this.f38824r;
        if (z10 && ((rpVar.length() != 0 || (txVar != null && txVar.getSelectedCategory() != null)) && !z9)) {
            return;
        }
        if (rpVar.length() <= 0 && (txVar == null || txVar.f32001v3 <= 0.5f || (!txVar.f31996q3 && txVar.getSelectedCategory() == null))) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        this.f38820c.b(i7);
        this.F = false;
    }

    @Override
    public final void updateColors() {
        try {
            this.d.setCursorColor(this.G.z(org.telegram.ui.ActionBar.l6.Ai));
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

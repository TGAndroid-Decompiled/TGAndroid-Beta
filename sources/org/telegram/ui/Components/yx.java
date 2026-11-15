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
public abstract class yx extends FrameLayout implements org.telegram.ui.ActionBar.z5, te.b {
    public ValueAnimator E;
    public fo F;
    public boolean G;
    public final ly H;
    public final te.a f42173a;
    public final int f42174b;
    public final kl0 f42175c;
    public final zp d;
    public final View f42176e;
    public final View f42177f;
    public final ImageView h;
    public final FrameLayout f42178n;
    public final xx f42179r;
    public final ai.j0 f42180s;
    public final View f42181w;
    public float f42182x;
    public boolean f42183y;

    public yx(ly lyVar, Context context, int i7) {
        super(context);
        int z10;
        int z11;
        int z12;
        int z13;
        zp zpVar;
        ImageView.ScaleType scaleType;
        int i10;
        float f10;
        int i11;
        this.H = lyVar;
        this.f42173a = new te.a(0, this, er.f34421g, 200L, false);
        this.f42183y = false;
        org.telegram.ui.ActionBar.p6 p6Var = org.telegram.ui.ActionBar.q6.f29534a;
        this.f42174b = i7;
        View view = new View(context);
        this.f42176e = view;
        view.setVisibility(4);
        int i12 = org.telegram.ui.ActionBar.j6.Cf;
        org.telegram.ui.ActionBar.e6 e6Var = lyVar.f36931a2;
        boolean z14 = lyVar.f36961j2;
        org.telegram.ui.ActionBar.q6.h(i12, view, e6Var);
        addView(view, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83));
        View view2 = new View(context);
        this.f42177f = view2;
        if (lyVar.f36995v0) {
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f29269zf, view2, e6Var);
        }
        addView(view2, new FrameLayout.LayoutParams(-1, lyVar.f36938c1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42178n = frameLayout;
        int L = org.telegram.messenger.g0.L(18.0f);
        if (z14) {
            z10 = lyVar.v(0.06f);
        } else {
            z10 = lyVar.z(org.telegram.ui.ActionBar.j6.Af);
        }
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.d0(L, z10));
        frameLayout.setClipToOutline(true);
        bg.p0 p0Var = bg.t0.f3332a;
        frameLayout.setOutlineProvider(new bg.r0(0, org.telegram.messenger.g0.L(18.0f)));
        if (i7 == 2) {
            addView(frameLayout, c8.ja.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, c8.ja.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ai.j0 j0Var = new ai.j0(16, context, this);
        this.f42180s = j0Var;
        frameLayout.addView(j0Var, c8.ja.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        kl0 kl0Var = new kl0();
        this.f42175c = kl0Var;
        kl0Var.c(0, false, false);
        if (z14) {
            z11 = lyVar.v(0.4f);
        } else {
            z11 = lyVar.z(org.telegram.ui.ActionBar.j6.Bf);
        }
        kl0Var.a(z11);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageDrawable(kl0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final yx f41173b;

            {
                this.f41173b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        yx yxVar = this.f41173b;
                        xx xxVar = yxVar.f42179r;
                        zp zpVar2 = yxVar.d;
                        if (yxVar.f42175c.f36555k == 1) {
                            zpVar2.setText("");
                            yxVar.c(null, false);
                            if (xxVar != null) {
                                xxVar.G1();
                                xxVar.I1(null);
                                xxVar.J1(true, true);
                            }
                            yxVar.f(false);
                            zpVar2.clearAnimation();
                            zpVar2.animate().translationX(0.0f).setInterpolator(er.h).start();
                            yxVar.d(false);
                            return;
                        }
                        return;
                    default:
                        yx yxVar2 = this.f41173b;
                        zp zpVar3 = yxVar2.d;
                        zpVar3.setText("");
                        yxVar2.c(null, false);
                        xx xxVar2 = yxVar2.f42179r;
                        if (xxVar2 != null) {
                            xxVar2.G1();
                            xxVar2.I1(null);
                            xxVar2.J1(true, true);
                        }
                        yxVar2.f(false);
                        zpVar3.clearAnimation();
                        zpVar3.animate().translationX(0.0f).setInterpolator(er.h).start();
                        yxVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, c8.ja.e(36, 36, 51));
        zp zpVar2 = new zp(this, context, i7, 2);
        this.d = zpVar2;
        zpVar2.setTextSize(1, 16.0f);
        if (z14) {
            z12 = lyVar.v(0.45f);
        } else {
            z12 = lyVar.z(org.telegram.ui.ActionBar.j6.Bf);
        }
        zpVar2.setHintTextColor(z12);
        if (z14) {
            z13 = lyVar.v(0.8f);
        } else {
            z13 = lyVar.z(org.telegram.ui.ActionBar.j6.G6);
        }
        zpVar2.setTextColor(z13);
        zpVar2.setBackgroundDrawable(null);
        zpVar2.setPadding(0, 0, 0, 0);
        zpVar2.setMaxLines(1);
        zpVar2.setLines(1);
        zpVar2.setSingleLine(true);
        zpVar2.setImeOptions(268435459);
        zpVar2.setHint(org.telegram.messenger.hd.M0(2131745836, null));
        org.telegram.ui.ActionBar.q6.l(zpVar2, 30, org.telegram.ui.ActionBar.j6.Di, e6Var);
        zpVar2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        zpVar2.setCursorWidth(1.5f);
        zpVar2.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        j0Var.addView(zpVar2, c8.ja.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        zpVar2.addTextChangedListener(new ah.j(this, 21));
        if (lyVar.f36995v0) {
            View view3 = new View(context);
            this.f42181w = view3;
            Drawable g10 = i5.c.g(context, 2131231227);
            org.telegram.ui.ActionBar.m6 p10 = org.telegram.ui.ActionBar.q6.p(org.telegram.ui.ActionBar.j6.f29269zf, org.telegram.ui.ActionBar.j6.Af);
            zpVar = zpVar2;
            scaleType = scaleType2;
            i10 = 3;
            f10 = 16.0f;
            org.telegram.ui.ActionBar.q6.k(this, g10, p10.f29392a, p10.f29393b, 4, 0.0f, e6Var, PorterDuff.Mode.MULTIPLY);
            view3.setBackground(g10);
            view3.setAlpha(0.0f);
            j0Var.addView(view3, c8.ja.e(18, -1, 3));
        } else {
            zpVar = zpVar2;
            scaleType = scaleType2;
            i10 = 3;
            f10 = 16.0f;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new hi.b2(this));
        int i13 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i13, e6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i13);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(imageView2, h02, null, M, e6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final yx f41173b;

            {
                this.f41173b = this;
            }

            @Override
            public final void onClick(View view32) {
                switch (r2) {
                    case 0:
                        yx yxVar = this.f41173b;
                        xx xxVar = yxVar.f42179r;
                        zp zpVar22 = yxVar.d;
                        if (yxVar.f42175c.f36555k == 1) {
                            zpVar22.setText("");
                            yxVar.c(null, false);
                            if (xxVar != null) {
                                xxVar.G1();
                                xxVar.I1(null);
                                xxVar.J1(true, true);
                            }
                            yxVar.f(false);
                            zpVar22.clearAnimation();
                            zpVar22.animate().translationX(0.0f).setInterpolator(er.h).start();
                            yxVar.d(false);
                            return;
                        }
                        return;
                    default:
                        yx yxVar2 = this.f41173b;
                        zp zpVar3 = yxVar2.d;
                        zpVar3.setText("");
                        yxVar2.c(null, false);
                        xx xxVar2 = yxVar2.f42179r;
                        if (xxVar2 != null) {
                            xxVar2.G1();
                            xxVar2.I1(null);
                            xxVar2.J1(true, true);
                        }
                        yxVar2.f(false);
                        zpVar3.clearAnimation();
                        zpVar3.animate().translationX(0.0f).setInterpolator(er.h).start();
                        yxVar2.d(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, c8.ja.e(36, 36, 53));
        if (i7 == 1 && (!lyVar.d2 || !org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24934t0).q())) {
            return;
        }
        if (i7 == 0) {
            i11 = i10;
        } else {
            i11 = 0;
        }
        xx xxVar = new xx(this, context, i11, lyVar.f36931a2, i7);
        this.f42179r = xxVar;
        xxVar.E3 = z14;
        TextPaint paint = zpVar.getPaint();
        xxVar.setDontOccupyWidth(org.telegram.messenger.g0.L(f10) + ((int) paint.measureText(((Object) zpVar.getHint()) + "")));
        if (lyVar.f36995v0) {
            org.telegram.ui.ActionBar.q6.i(xxVar, org.telegram.ui.ActionBar.q6.p(org.telegram.ui.ActionBar.j6.f29269zf, org.telegram.ui.ActionBar.j6.Af), e6Var);
        }
        xxVar.setOnScrollIntoOccupiedWidth(new org.telegram.messenger.z10(this) {
            public final yx f41464b;

            {
                this.f41464b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z15;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        yx yxVar = this.f41464b;
                        yxVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        yxVar.d(z15);
                        yxVar.g(false);
                        return;
                    default:
                        wu0 wu0Var = (wu0) obj;
                        yx yxVar2 = this.f41464b;
                        ly lyVar2 = yxVar2.H;
                        xx xxVar2 = yxVar2.f42179r;
                        if (wu0Var == null) {
                            yxVar2.d(false);
                            xxVar2.I1(null);
                            lyVar2.f36975p0.d.setText("");
                            lyVar2.f36959j0.h1(0, 0);
                            return;
                        } else if (xxVar2.getSelectedCategory() == wu0Var) {
                            yxVar2.c(null, false);
                            xxVar2.I1(null);
                            return;
                        } else {
                            yxVar2.c(wu0Var.f41459a, false);
                            xxVar2.I1(wu0Var);
                            return;
                        }
                }
            }
        });
        xxVar.setOnTouchListener(new m.c2(this, 2));
        xxVar.setOnCategoryClick(new org.telegram.messenger.z10(this) {
            public final yx f41464b;

            {
                this.f41464b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z15;
                switch (r2) {
                    case 0:
                        Integer num = (Integer) obj;
                        yx yxVar = this.f41464b;
                        yxVar.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        yxVar.d(z15);
                        yxVar.g(false);
                        return;
                    default:
                        wu0 wu0Var = (wu0) obj;
                        yx yxVar2 = this.f41464b;
                        ly lyVar2 = yxVar2.H;
                        xx xxVar2 = yxVar2.f42179r;
                        if (wu0Var == null) {
                            yxVar2.d(false);
                            xxVar2.I1(null);
                            lyVar2.f36975p0.d.setText("");
                            lyVar2.f36959j0.h1(0, 0);
                            return;
                        } else if (xxVar2.getSelectedCategory() == wu0Var) {
                            yxVar2.c(null, false);
                            xxVar2.I1(null);
                            return;
                        } else {
                            yxVar2.c(wu0Var.f41459a, false);
                            xxVar2.I1(wu0Var);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(xxVar, c8.ja.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public static void a(yx yxVar, boolean z10, boolean z11) {
        yxVar.f42173a.a(z10, z11);
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        int i10;
        if (i7 == 0) {
            View view = this.f42176e;
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
        ly lyVar = this.H;
        int i7 = this.f42174b;
        if (i7 == 0) {
            gy gyVar = lyVar.A0;
            fy fyVar = gyVar.P;
            ly lyVar2 = gyVar.R;
            yv yvVar = lyVar2.H0;
            vv vvVar = lyVar2.E0;
            if (gyVar.M != 0) {
                ConnectionsManager.getInstance(lyVar2.f36941d1).cancelRequest(gyVar.M, true);
                gyVar.M = 0;
            }
            if (TextUtils.isEmpty(str)) {
                gyVar.O = null;
                gyVar.F.clear();
                gyVar.I.clear();
                gyVar.L = new ArrayList();
                v4.h0 adapter = vvVar.getAdapter();
                dy dyVar = lyVar2.f37010z0;
                if (adapter != dyVar) {
                    vvVar.setAdapter(dyVar);
                }
                gyVar.d = 0L;
                lyVar2.f36928a.a(false, true);
                gyVar.f();
                yvVar.e(false);
            } else {
                gyVar.O = str.toLowerCase();
                yvVar.e(true);
            }
            org.telegram.messenger.g0.r(fyVar);
            org.telegram.messenger.g0.i3(fyVar, 300L);
        } else if (i7 == 1) {
            lyVar.T.F(str, z10);
        } else if (i7 == 2) {
            lyVar.f36962k0.G(str, z10);
        }
    }

    public final void d(boolean z10) {
        float f10;
        if (z10 == this.f42183y) {
            return;
        }
        this.f42183y = z10;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f42182x;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new c6(this, 22));
        this.E.setDuration(120L);
        this.E.setInterpolator(er.h);
        this.E.start();
    }

    public final void e(boolean z10) {
        this.G = z10;
        if (z10) {
            this.f42175c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z10) {
        if (z10) {
            if (this.F == null) {
                fo foVar = new fo(this, 16);
                this.F = foVar;
                org.telegram.messenger.g0.i3(foVar, 340L);
                return;
            }
            return;
        }
        fo foVar2 = this.F;
        if (foVar2 != null) {
            org.telegram.messenger.g0.r(foVar2);
            this.F = null;
        }
        org.telegram.messenger.g0.U3(this.h, false, true);
    }

    public final void g(boolean z10) {
        int i7;
        boolean z11 = this.G;
        zp zpVar = this.d;
        xx xxVar = this.f42179r;
        if (z11 && ((zpVar.length() != 0 || (xxVar != null && xxVar.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (zpVar.length() <= 0 && (xxVar == null || xxVar.f33088w3 <= 0.5f || (!xxVar.f33083r3 && xxVar.getSelectedCategory() == null))) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        this.f42175c.b(i7);
        this.G = false;
    }

    @Override
    public final void updateColors() {
        try {
            this.d.setCursorColor(this.H.z(org.telegram.ui.ActionBar.j6.Di));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void E(float f10, int i7) {
    }
}

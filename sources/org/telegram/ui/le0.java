package org.telegram.ui;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.tgnet.TLRPC;
public final class le0 extends qb1 implements org.telegram.messenger.fs, te.b {
    public cb1 E;
    public FrameLayout F;
    public ne0 G;
    public fh.g H;
    public ie0 I;
    public Integer J;
    public cx K;
    public qh.b[] L;
    public int M;
    public int N;
    public int O;
    public xi.e P;
    public hi.m3 Q;
    public boolean R;
    public final ui.c S;
    public final ui.f T;
    public final ui.f U;
    public org.telegram.ui.Components.l51 f49588x;
    public boolean f49589y;
    public final te.a f49587w = new te.a(0, this, org.telegram.ui.Components.lr.h, 380, true);
    public final RectF V = new RectF();
    public final RectF W = new RectF();
    public final ge0 X = new ge0(this, 0);

    public le0() {
        if (Build.VERSION.SDK_INT >= 31) {
            ui.f fVar = new ui.f(null);
            ca.i iVar = new ca.i(this, false);
            if (fVar.f59005c == null) {
                fVar.f59005c = new dh.i(fVar.f59004b, iVar);
            }
            this.T = fVar;
            ui.f fVar2 = new ui.f(null);
            ca.i iVar2 = new ca.i(this, true);
            if (fVar2.f59005c == null) {
                fVar2.f59005c = new dh.i(fVar2.f59004b, iVar2);
            }
            this.U = fVar2;
        } else {
            this.T = null;
            this.U = null;
        }
        this.S = new ui.c();
        y8 y8Var = new y8(this, 5);
        setBulletinDelegate(y8Var);
        org.telegram.ui.Components.gc.a(this.f51194b, y8Var);
    }

    public static boolean d0(org.telegram.ui.le0 r28, android.view.View r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.le0.d0(org.telegram.ui.le0, android.view.View):boolean");
    }

    public static void e0(le0 le0Var) {
        org.telegram.messenger.j10 userConfig = le0Var.getUserConfig();
        if (!userConfig.X) {
            userConfig.X = true;
            userConfig.v(false);
        }
        le0Var.m0(true, true);
        org.telegram.messenger.ks.f(le0Var.currentAccount).k(org.telegram.messenger.ks.Q5, new Object[0]);
    }

    public static void f0(le0 le0Var) {
        le0Var.getClass();
        int i7 = 0;
        Integer num = null;
        for (int i10 = 3; i10 >= 0; i10--) {
            if (!org.telegram.messenger.j10.i(i10).p()) {
                i7++;
                if (num == null) {
                    num = Integer.valueOf(i10);
                }
            }
        }
        if (!org.telegram.messenger.j10.o()) {
            i7--;
        }
        if (i7 > 0 && num != null) {
            le0Var.presentFragment(new de0(num.intValue()));
        } else if (!org.telegram.messenger.j10.o()) {
            le0Var.showDialog(new ug.l0(7, le0Var.currentAccount, le0Var.getParentActivity(), le0Var, null));
        }
    }

    public static void g0(le0 le0Var, int i7, org.telegram.ui.Components.y60 y60Var) {
        if (le0Var.currentAccount != i7) {
            y60Var.v();
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.O0(i7);
            }
        }
    }

    public static void h0(le0 le0Var) {
        org.telegram.messenger.j10 userConfig = le0Var.getUserConfig();
        if (userConfig.X) {
            userConfig.X = false;
            userConfig.v(false);
        }
        le0Var.m0(false, true);
        org.telegram.messenger.ks.f(le0Var.currentAccount).k(org.telegram.messenger.ks.Q5, new Object[0]);
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            o0();
            n0();
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.h2 a0(int i7) {
        if (i7 == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("needPhonebook", true);
            bundle.putBoolean("needFinishFragment", false);
            bundle.putBoolean("hasMainTabs", true);
            return new ContactsActivity(bundle);
        } else if (i7 == 2) {
            if (getUserConfig().X) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("hasMainTabs", true);
                return new i9(bundle2);
            }
            return new o31(a8.p0.k("hasMainTabs", true));
        } else if (i7 == 0) {
            cx cxVar = new cx(a8.p0.k("hasMainTabs", true));
            this.K = cxVar;
            cxVar.K3 = new f(this, 23);
            return cxVar;
        } else if (i7 != 3) {
            return null;
        } else {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("user_id", org.telegram.messenger.j10.i(this.currentAccount).e());
            bundle3.putBoolean("my_profile", true);
            bundle3.putBoolean("hasMainTabs", true);
            return new ProfileActivity(bundle3, null);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29469h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29396d6));
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.ActionBar.h2 c02 = c0();
        if (c02 != null && c02.canBeginSlide()) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i7;
        super.createView(context);
        ne0 ne0Var = new ne0(context, this.resourceProvider);
        this.G = ne0Var;
        ne0Var.setClipChildren(false);
        this.G.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        this.G.setMaxWidth(org.telegram.messenger.g0.L(344.0f));
        qh.b[] bVarArr = new qh.b[5];
        this.L = bVarArr;
        bVarArr[0] = qh.b.c(context, this.resourceProvider, qh.a.f56146n, 2131748515);
        this.L[1] = qh.b.c(context, this.resourceProvider, qh.a.f56145f, 2131748514);
        this.L[2] = qh.b.c(context, this.resourceProvider, qh.a.f56147r, 2131745300);
        this.L[3] = qh.b.c(context, this.resourceProvider, qh.a.h, 2131748516);
        qh.b[] bVarArr2 = this.L;
        org.telegram.ui.ActionBar.i6 i6Var = this.resourceProvider;
        int i10 = this.currentAccount;
        qh.b bVar = new qh.b(context);
        org.telegram.ui.Components.l51 l51Var = null;
        bVar.f56156a.setText(org.telegram.messenger.gd.M0(2131748513, null));
        bVar.f56157b.setVisibility(8);
        TLRPC.User c22 = org.telegram.messenger.mp.u1(i10).c2(Long.valueOf(org.telegram.messenger.j10.i(i10).e()));
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9(0, c22);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        q9Var.f(c22, b9Var);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(11.0f));
        bVar.f56158c = q9Var;
        bVar.addView(q9Var, c8.ma.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        bVar.f56165x = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Tl, i6Var);
        bVar.f56163s = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Rl, i6Var);
        bVar.f56164w = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Sl, i6Var);
        bVar.a();
        bVarArr2[4] = bVar;
        this.L[0].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final le0 f48388b;

            {
                this.f48388b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                int i11 = r2;
                le0 le0Var = this.f48388b;
                switch (i11) {
                    case 0:
                        return le0.d0(le0Var, view);
                    case 1:
                        if (le0Var.getParentActivity() == null || le0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.y60 I = org.telegram.ui.Components.y60.I(le0Var, view);
                        I.c(2131232101, org.telegram.messenger.gd.M0(2131748091, null), new ge0(le0Var, 5), false);
                        I.c(2131232085, org.telegram.messenger.gd.M0(2131743202, null), new ge0(le0Var, 6), false);
                        I.f42379u = true;
                        I.v = true;
                        I.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        I.f42356i = 3;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), le0Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29396d6));
                        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
                        I.X(d02);
                        I.a0();
                        return true;
                    case 2:
                        if (le0Var.getParentActivity() == null || le0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.y60 I2 = org.telegram.ui.Components.y60.I(le0Var, view);
                        I2.c(2131231771, org.telegram.messenger.gd.M0(2131749298, null), new ge0(le0Var, 2), false);
                        if (le0Var.getUserConfig().X) {
                            I2.c(2131232055, org.telegram.messenger.gd.M0(2131749130, null), new ge0(le0Var, 3), false);
                        } else {
                            I2.c(2131231765, org.telegram.messenger.gd.M0(2131749269, null), new ge0(le0Var, 4), false);
                        }
                        I2.f42379u = true;
                        I2.v = true;
                        I2.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        ShapeDrawable d03 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), le0Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29396d6));
                        d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
                        I2.X(d03);
                        I2.a0();
                        return true;
                    default:
                        le0Var.q0(view);
                        return true;
                }
            }
        });
        this.L[1].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final le0 f48388b;

            {
                this.f48388b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                int i11 = r2;
                le0 le0Var = this.f48388b;
                switch (i11) {
                    case 0:
                        return le0.d0(le0Var, view);
                    case 1:
                        if (le0Var.getParentActivity() == null || le0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.y60 I = org.telegram.ui.Components.y60.I(le0Var, view);
                        I.c(2131232101, org.telegram.messenger.gd.M0(2131748091, null), new ge0(le0Var, 5), false);
                        I.c(2131232085, org.telegram.messenger.gd.M0(2131743202, null), new ge0(le0Var, 6), false);
                        I.f42379u = true;
                        I.v = true;
                        I.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        I.f42356i = 3;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), le0Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29396d6));
                        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
                        I.X(d02);
                        I.a0();
                        return true;
                    case 2:
                        if (le0Var.getParentActivity() == null || le0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.y60 I2 = org.telegram.ui.Components.y60.I(le0Var, view);
                        I2.c(2131231771, org.telegram.messenger.gd.M0(2131749298, null), new ge0(le0Var, 2), false);
                        if (le0Var.getUserConfig().X) {
                            I2.c(2131232055, org.telegram.messenger.gd.M0(2131749130, null), new ge0(le0Var, 3), false);
                        } else {
                            I2.c(2131231765, org.telegram.messenger.gd.M0(2131749269, null), new ge0(le0Var, 4), false);
                        }
                        I2.f42379u = true;
                        I2.v = true;
                        I2.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        ShapeDrawable d03 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), le0Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29396d6));
                        d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
                        I2.X(d03);
                        I2.a0();
                        return true;
                    default:
                        le0Var.q0(view);
                        return true;
                }
            }
        });
        this.L[3].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final le0 f48388b;

            {
                this.f48388b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                int i11 = r2;
                le0 le0Var = this.f48388b;
                switch (i11) {
                    case 0:
                        return le0.d0(le0Var, view);
                    case 1:
                        if (le0Var.getParentActivity() == null || le0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.y60 I = org.telegram.ui.Components.y60.I(le0Var, view);
                        I.c(2131232101, org.telegram.messenger.gd.M0(2131748091, null), new ge0(le0Var, 5), false);
                        I.c(2131232085, org.telegram.messenger.gd.M0(2131743202, null), new ge0(le0Var, 6), false);
                        I.f42379u = true;
                        I.v = true;
                        I.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        I.f42356i = 3;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), le0Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29396d6));
                        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
                        I.X(d02);
                        I.a0();
                        return true;
                    case 2:
                        if (le0Var.getParentActivity() == null || le0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.y60 I2 = org.telegram.ui.Components.y60.I(le0Var, view);
                        I2.c(2131231771, org.telegram.messenger.gd.M0(2131749298, null), new ge0(le0Var, 2), false);
                        if (le0Var.getUserConfig().X) {
                            I2.c(2131232055, org.telegram.messenger.gd.M0(2131749130, null), new ge0(le0Var, 3), false);
                        } else {
                            I2.c(2131231765, org.telegram.messenger.gd.M0(2131749269, null), new ge0(le0Var, 4), false);
                        }
                        I2.f42379u = true;
                        I2.v = true;
                        I2.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        ShapeDrawable d03 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), le0Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29396d6));
                        d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
                        I2.X(d03);
                        I2.a0();
                        return true;
                    default:
                        le0Var.q0(view);
                        return true;
                }
            }
        });
        this.L[4].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final le0 f48388b;

            {
                this.f48388b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                int i11 = r2;
                le0 le0Var = this.f48388b;
                switch (i11) {
                    case 0:
                        return le0.d0(le0Var, view);
                    case 1:
                        if (le0Var.getParentActivity() == null || le0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.y60 I = org.telegram.ui.Components.y60.I(le0Var, view);
                        I.c(2131232101, org.telegram.messenger.gd.M0(2131748091, null), new ge0(le0Var, 5), false);
                        I.c(2131232085, org.telegram.messenger.gd.M0(2131743202, null), new ge0(le0Var, 6), false);
                        I.f42379u = true;
                        I.v = true;
                        I.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        I.f42356i = 3;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), le0Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29396d6));
                        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
                        I.X(d02);
                        I.a0();
                        return true;
                    case 2:
                        if (le0Var.getParentActivity() == null || le0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.y60 I2 = org.telegram.ui.Components.y60.I(le0Var, view);
                        I2.c(2131231771, org.telegram.messenger.gd.M0(2131749298, null), new ge0(le0Var, 2), false);
                        if (le0Var.getUserConfig().X) {
                            I2.c(2131232055, org.telegram.messenger.gd.M0(2131749130, null), new ge0(le0Var, 3), false);
                        } else {
                            I2.c(2131231765, org.telegram.messenger.gd.M0(2131749269, null), new ge0(le0Var, 4), false);
                        }
                        I2.f42379u = true;
                        I2.v = true;
                        I2.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                        ShapeDrawable d03 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), le0Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29396d6));
                        d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
                        I2.X(d03);
                        I2.a0();
                        return true;
                    default:
                        le0Var.q0(view);
                        return true;
                }
            }
        });
        this.G.Q.add(this.L[0]);
        this.G.Q.add(this.L[1]);
        this.G.Q.add(this.L[4]);
        this.G.Q.add(this.L[3]);
        int i11 = 0;
        while (true) {
            qh.b[] bVarArr3 = this.L;
            if (i11 >= bVarArr3.length) {
                break;
            }
            qh.b bVar2 = bVarArr3[i11];
            if (i11 > 2) {
                i7 = i11 - 1;
            } else {
                i7 = i11;
            }
            bVar2.setOnClickListener(new ci.q(this, i7, 27));
            this.G.addView(this.L[i11]);
            this.G.j(bVar2, true, false);
            i11++;
        }
        m0(getUserConfig().X, false);
        s0(this.f51195c.getCurrentPosition(), false);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.f29396d6);
        ui.c cVar = this.S;
        cVar.a(themedColor);
        jh.k kVar = new jh.k(this.f51194b);
        ui.a aVar = this.T;
        if (aVar == null) {
            aVar = cVar;
        }
        ui.a aVar2 = this.U;
        if (aVar2 == null) {
            aVar2 = cVar;
        }
        dh.c cVar2 = new dh.c(aVar, aVar2, cVar);
        k0 k0Var = this.f51194b;
        cVar2.h = kVar;
        cVar2.f8380i = k0Var;
        cVar2.f8382k = true;
        fh.g c10 = cVar2.c(this.G, c8.i0.g(this.resourceProvider), false);
        this.H = c10;
        c10.r(org.telegram.messenger.g0.L(28.0f));
        this.H.q(org.telegram.messenger.g0.L(7.666f));
        this.G.setBackground(this.H);
        dh.c cVar3 = new dh.c(cVar, cVar, cVar);
        k0 k0Var2 = this.f51194b;
        cVar3.h = kVar;
        cVar3.f8380i = k0Var2;
        this.I = new View(context);
        dh.d dVar = new dh.d(cVar3.c(this.I, null, false));
        dVar.b(org.telegram.messenger.g0.L(60.0f), true);
        this.I.setBackground(dVar);
        this.f51194b.addView(this.I, c8.ma.e(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.F = frameLayout;
        frameLayout.setOnClickListener(new bi.o(24));
        this.F.addView(this.G, c8.ma.e(-1, 72, 81));
        this.F.setClipToPadding(false);
        this.f51194b.addView(this.F, c8.ma.e(-1, -2, 80));
        cb1 cb1Var = new cb1(context);
        this.E = cb1Var;
        this.f51194b.addView(cb1Var, c8.ma.e(-1, -2, 80));
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.f26914a;
        Activity parentActivity = getParentActivity();
        cb1 cb1Var2 = this.E;
        if (((ApplicationLoaderImpl) t0Var).q()) {
            l51Var = new org.telegram.ui.Components.l51(parentActivity, cb1Var2);
        }
        this.f49588x = l51Var;
        if (l51Var != null) {
            l51Var.updateAppUpdateViews(this.currentAccount, false);
        }
        p0(false);
        return this.f51194b;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        qh.b bVar;
        LaunchActivity launchActivity;
        boolean z10 = false;
        boolean z11 = false;
        z10 = false;
        if (i7 != org.telegram.messenger.ks.I4 && i7 != org.telegram.messenger.ks.f25179r) {
            if (i7 == org.telegram.messenger.ks.T4) {
                org.telegram.ui.Components.l51 l51Var = this.f49588x;
                if (l51Var != null) {
                    l51Var.updateFileProgress(null);
                    this.f49588x.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i7 == org.telegram.messenger.ks.Y1) {
                String str = (String) objArr[0];
                TLRPC.TL_help_appUpdate tL_help_appUpdate = org.telegram.messenger.bz.f23175j1;
                if (tL_help_appUpdate != null && tL_help_appUpdate.document != null) {
                    org.telegram.messenger.t0.u();
                    return;
                }
                return;
            } else if (i7 == org.telegram.messenger.ks.Z1) {
                String str2 = (String) objArr[0];
                TLRPC.TL_help_appUpdate tL_help_appUpdate2 = org.telegram.messenger.bz.f23175j1;
                if (tL_help_appUpdate2 != null && tL_help_appUpdate2.document != null) {
                    org.telegram.messenger.t0.u();
                    return;
                }
                return;
            } else if (i7 == org.telegram.messenger.ks.X1) {
                org.telegram.ui.Components.l51 l51Var2 = this.f49588x;
                if (l51Var2 != null) {
                    l51Var2.updateFileProgress(objArr);
                    return;
                }
                return;
            } else if (i7 == org.telegram.messenger.ks.S4) {
                org.telegram.ui.Components.l51 l51Var3 = this.f49588x;
                if (l51Var3 != null && (launchActivity = LaunchActivity.H1) != null) {
                    int i11 = this.currentAccount;
                    if (launchActivity.f43075e0.size() == 1) {
                        z11 = true;
                    }
                    l51Var3.updateAppUpdateViews(i11, z11);
                    return;
                }
                return;
            } else if (i7 == org.telegram.messenger.ks.f25210v4) {
                int currentPosition = this.f51195c.getCurrentPosition();
                SparseArray sparseArray = this.f51193a;
                int size = sparseArray.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ob1 ob1Var = (ob1) sparseArray.valueAt(i12);
                    if (sparseArray.keyAt(i12) != currentPosition && ob1Var != null) {
                        ob1Var.f50559a.clearViews();
                    }
                }
                return;
            } else if (i7 == org.telegram.messenger.ks.Q5) {
                m0(getUserConfig().X, true);
                pb1 pb1Var = this.f51195c;
                if (pb1Var != null && pb1Var.getCurrentPosition() == 2) {
                    this.f51195c.A(0);
                    s0(0, true);
                    this.f49589y = true;
                    return;
                }
                b0(2);
                return;
            } else if (i7 == org.telegram.messenger.ks.f25136j0) {
                qh.b[] bVarArr = this.L;
                if (bVarArr != null && (bVar = bVarArr[4]) != null) {
                    int i13 = this.currentAccount;
                    TLRPC.User c22 = org.telegram.messenger.mp.u1(i13).c2(Long.valueOf(org.telegram.messenger.j10.i(i13).e()));
                    bVar.f56158c.f(c22, new org.telegram.ui.Components.b9(0, c22));
                    return;
                }
                return;
            } else if (i7 == org.telegram.messenger.ks.R5) {
                l0();
                return;
            } else {
                return;
            }
        }
        View view = this.fragmentView;
        if (view != null && view.isAttachedToWindow()) {
            z10 = true;
        }
        p0(z10);
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f10) {
        org.telegram.ui.ActionBar.h2 c02 = c0();
        if (c02 != null) {
            return c02.getCustomSlideTransition(z10, z11, f10);
        }
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.q3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.q3.f29902c;
    }

    public final void i0() {
        ui.f fVar;
        View view;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31 && (fVar = this.T) != null && (view = this.fragmentView) != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            k0();
            ri.r f10 = ri.q.f();
            if (!f10.f56717a) {
                fVar = null;
            } else if (!f10.f56718b || i7 < 33) {
                fVar = this.U;
            }
            if (fVar != null) {
                fVar.m(measuredWidth, measuredHeight);
                fVar.f59005c.a();
            }
        }
    }

    public final void j0() {
        float f10;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.f29339a7);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.n6.f29396d6);
        pb1 pb1Var = this.f51195c;
        if (pb1Var != null) {
            f10 = pb1Var.m(0);
        } else {
            f10 = 1.0f;
        }
        this.S.a(i0.a.f(f10, themedColor, themedColor2));
        ie0 ie0Var = this.I;
        if (ie0Var != null) {
            ie0Var.invalidate();
        }
        fh.g gVar = this.H;
        if (gVar != null) {
            gVar.updateColors();
        }
        i0();
        ie0 ie0Var2 = this.I;
        if (ie0Var2 != null) {
            ie0Var2.invalidate();
        }
        ne0 ne0Var = this.G;
        if (ne0Var != null) {
            ne0Var.invalidate();
        }
        qh.b[] bVarArr = this.L;
        if (bVarArr != null) {
            for (qh.b bVar : bVarArr) {
                bVar.g();
            }
        }
    }

    public final void k0() {
        int i7;
        int height;
        if (Build.VERSION.SDK_INT >= 31 && this.T != null && this.f51194b != null) {
            cb1 cb1Var = this.E;
            if (cb1Var != null && cb1Var.a()) {
                i7 = org.telegram.messenger.g0.L(44.0f);
            } else {
                i7 = 0;
            }
            int height2 = (((this.f51194b.getHeight() - this.M) - i7) - org.telegram.messenger.g0.L(8.0f)) - org.telegram.messenger.g0.L(56.0f);
            SparseArray sparseArray = this.f51193a;
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.ActionBar.h2 h2Var = ((ob1) sparseArray.valueAt(i10)).f50559a;
                View view = h2Var.fragmentView;
                if (view != null && view.getWidth() > 0 && (h2Var instanceof ke0)) {
                    if (height2 >= view.getHeight()) {
                        h2Var.setParentGlass(null, null);
                    } else {
                        RectF rectF = this.W;
                        rectF.set(0.0f, height2 - org.telegram.messenger.g0.L(1.0f), view.getWidth(), org.telegram.messenger.g0.L(1.0f) + height);
                        h2Var.setParentGlass(rectF, this.X);
                    }
                }
            }
        }
    }

    public final void l0() {
        if (this.G != null && this.L[1] != null) {
            boolean w10 = org.telegram.messenger.i5.w();
            if (w10) {
                org.telegram.messenger.mp.h1().edit().putBoolean("askAboutContacts2", true).apply();
            }
            if (org.telegram.messenger.j10.i(this.currentAccount).V && !w10 && org.telegram.messenger.mp.h1().getBoolean("askAboutContacts2", true)) {
                this.L[1].e("!", true, true);
            } else {
                this.L[1].e(null, true, true);
            }
        }
    }

    public final void m0(boolean z10, boolean z11) {
        ne0 ne0Var = this.G;
        if (ne0Var != null) {
            ne0Var.j(this.L[2], !z10, z11);
            this.G.j(this.L[3], z10, z11);
        }
    }

    public final void n0() {
        int i7;
        pb1 pb1Var = this.f51195c;
        if (pb1Var != null && this.I != null) {
            float a10 = 1.0f - c8.l9.a(Math.abs(3.0f - pb1Var.getPositionAnimated()), 0.0f, 1.0f);
            float T1 = (1.0f - ((1.0f - org.telegram.messenger.g0.T1(0.0f, 1.0f, org.telegram.messenger.g0.R0(this.M))) * a10)) * this.f49587w.f57657e;
            this.I.setAlpha(T1);
            this.I.setTranslationY(a10 * org.telegram.messenger.g0.L(48.0f));
            ie0 ie0Var = this.I;
            if (T1 > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            ie0Var.setVisibility(i7);
        }
    }

    public final void o0() {
        int i7;
        boolean z10;
        int i10 = 0;
        if (this.E.a()) {
            i7 = org.telegram.messenger.g0.L(44.0f);
        } else {
            i7 = 0;
        }
        int i11 = -i7;
        float f10 = this.f49587w.f57657e;
        this.F.setTranslationY(org.telegram.messenger.g0.W1(f10, org.telegram.messenger.g0.L(40.0f) + i11, i11));
        ne0 ne0Var = this.G;
        int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        boolean z11 = true;
        if (i12 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ne0Var.setClickable(z10);
        ne0 ne0Var2 = this.G;
        if (i12 <= 0) {
            z11 = false;
        }
        ne0Var2.setEnabled(z11);
        this.G.setAlpha(f10);
        ne0 ne0Var3 = this.G;
        if (f10 <= 0.0f) {
            i10 = 8;
        }
        ne0Var3.setVisibility(i10);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        boolean onBackPressed = super.onBackPressed(z10);
        if (onBackPressed && this.f51195c.getCurrentPosition() != 0) {
            onBackPressed = false;
            if (z10) {
                this.f51195c.A(0);
            }
        }
        return onBackPressed;
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        org.telegram.ui.ActionBar.h2 c02 = c0();
        if (c02 != null) {
            c02.onBeginSlide();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        xi.e eVar = new xi.e(org.telegram.messenger.ks.f(this.currentAccount), this);
        eVar.c(org.telegram.messenger.ks.Y1);
        eVar.c(org.telegram.messenger.ks.X1);
        eVar.c(org.telegram.messenger.ks.Z1);
        eVar.c(org.telegram.messenger.ks.I4);
        eVar.c(org.telegram.messenger.ks.f25179r);
        eVar.c(org.telegram.messenger.ks.Q5);
        eVar.c(org.telegram.messenger.ks.f25136j0);
        eVar.c(org.telegram.messenger.ks.R5);
        eVar.f(org.telegram.messenger.ks.S4);
        eVar.f(org.telegram.messenger.ks.T4);
        eVar.f(org.telegram.messenger.ks.f25210v4);
        this.P = eVar;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        setBulletinDelegate(null);
        org.telegram.ui.Components.gc.h(this.f51194b);
        xi.e eVar = this.P;
        if (eVar != null) {
            eVar.b();
            this.P = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        hi.m3 m3Var = this.Q;
        if (m3Var != null) {
            m3Var.f(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        j0();
        l0();
        p0(true);
        if (this.R) {
            return;
        }
        if (this.Q == null && org.telegram.ui.Components.k30.f36657r.c()) {
            org.telegram.messenger.g0.h3(new ge0(this, 7), 1500L);
        }
        this.R = true;
    }

    @Override
    public final void onSlideProgress(boolean z10, float f10) {
        org.telegram.ui.ActionBar.h2 c02 = c0();
        if (c02 != null) {
            c02.onSlideProgress(z10, f10);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            j0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0(boolean z10) {
        if (this.G == null) {
            return;
        }
        int i7 = org.telegram.messenger.tr.a0(this.currentAccount).L;
        if (i7 > 0) {
            this.L[0].e(org.telegram.messenger.gd.E(i7, ','), false, z10);
            return;
        }
        this.L[0].e(null, false, z10);
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.h2 c02 = c0();
        if (c02 != null) {
            c02.prepareFragmentToSlide(z10, z11);
        }
    }

    public final void q0(View view) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i7 = 0; i7 < 4; i7++) {
            if (org.telegram.messenger.j10.i(i7).p()) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        Collections.sort(arrayList, new pe(25));
        org.telegram.ui.Components.y60 I = org.telegram.ui.Components.y60.I(this, view);
        if (org.telegram.messenger.j10.c() < 4) {
            I.c(2131232046, org.telegram.messenger.gd.M0(2131754482, null), new ge0(this, 1), false);
        }
        if (arrayList.size() > 0) {
            if (I.y() > 0) {
                I.k();
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                int intValue = ((Integer) obj).intValue();
                if (this.currentAccount == intValue) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                int i11 = org.telegram.ui.ActionBar.n6.f29488i6;
                Drawable a02 = org.telegram.ui.ActionBar.n6.a0(getThemedColor(i11), 0, 0);
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
                org.telegram.ui.ActionBar.i6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(a02);
                org.telegram.ui.ActionBar.u6.j(linearLayout, a02, null, M, resourceProvider);
                TLRPC.User f10 = org.telegram.messenger.j10.i(intValue).f();
                org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
                b9Var.r(f10);
                hi.q3 q3Var = new hi.q3(this, getParentActivity(), z10);
                linearLayout.addView(q3Var, c8.ma.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(getParentActivity());
                if (z10) {
                    q9Var.setScaleX(0.833f);
                    q9Var.setScaleY(0.833f);
                }
                q9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
                q9Var.getImageReceiver().d = intValue;
                q9Var.f(f10, b9Var);
                q3Var.addView(q9Var, c8.ma.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29504j5, getResourceProvider());
                textView.setText(org.telegram.messenger.o10.q(f10));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, c8.ma.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new bi.f5(this, intValue, I, 18));
                I.r(linearLayout, c8.ma.o(230, 48));
            }
        }
        I.f42379u = true;
        I.v = true;
        I.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), getThemedColor(org.telegram.ui.ActionBar.n6.f29396d6));
        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
        I.X(d02);
        I.a0();
        org.telegram.ui.Components.k30.f36657r.a();
    }

    public final cx r0(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        cx cxVar = new cx(bundle);
        this.K = cxVar;
        cxVar.K3 = new f(this, 23);
        this.f51193a.put(0, new ob1(cxVar));
        return this.K;
    }

    public final void s0(int i7, boolean z10) {
        int i10;
        boolean z11;
        int i11 = 0;
        while (true) {
            qh.b[] bVarArr = this.L;
            if (i11 < bVarArr.length) {
                qh.b bVar = bVarArr[i11];
                if (i11 > 2) {
                    i10 = i11 - 1;
                } else {
                    i10 = i11;
                }
                if (i10 == i7) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar.f(z11, z10);
                i11++;
            } else {
                return;
            }
        }
    }

    public final void t0(boolean z10, float f10) {
        for (int i7 = 0; i7 < this.L.length; i7++) {
            float max = Math.max(0.0f, 1.0f - Math.abs((i7 > 2 ? i7 - 1 : i7) - f10));
            qh.b bVar = this.L[i7];
            bVar.K = max;
            bVar.J = z10;
            bVar.invalidate();
        }
        this.G.invalidate();
    }

    @Override
    public final void D(float f10, int i7) {
    }
}

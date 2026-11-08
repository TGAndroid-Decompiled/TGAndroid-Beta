package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hm0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public final ri.c D;
    public final dh.c E;
    public final ri.c F;
    public final dh.c G;
    public org.telegram.ui.ActionBar.f2 H;
    public fi.g1 I;
    public ImageView J;
    public ImageView K;
    public FrameLayout L;
    public org.telegram.ui.Components.ny M;
    public org.telegram.ui.ActionBar.k5 N;
    public FrameLayout O;
    public FrameLayout P;
    public fi.d Q;
    public bm0 R;
    public boolean S;
    public org.telegram.ui.Components.zg0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public cc X;
    public float Y;
    public ValueAnimator Z;
    public final boolean f46448a;
    public boolean f46449a0;
    public final bi.v9 f46450b;
    public i0.b f46451b0;
    public final bi.v9 f46452c;
    public final xe.b f46453c0;
    public k0 d;
    public final xe.b f46454d0;
    public ml0 f46455e;
    public final int f46456f;
    public bm0 h;
    public bm0 f46457n;
    public boolean f46458r;
    public org.telegram.ui.ActionBar.f6 f46459s;
    public final SparseIntArray f46460w;
    public final org.telegram.ui.ActionBar.t4 f46461x;
    public final org.telegram.ui.ActionBar.t4 f46462y;

    public hm0() {
        super(null);
        this.f46456f = org.telegram.messenger.g0.L(6.0f);
        this.f46460w = new SparseIntArray();
        boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
        this.S = q10;
        this.f46449a0 = q10;
        this.f46451b0 = i0.b.f15119e;
        xe.b bVar = new xe.b();
        this.f46453c0 = bVar;
        xe.b bVar2 = new xe.b();
        this.f46454d0 = bVar2;
        ri.c cVar = new ri.c();
        this.D = cVar;
        dh.c cVar2 = new dh.c(cVar, cVar, cVar);
        this.E = cVar2;
        ri.c cVar3 = new ri.c();
        this.F = cVar3;
        dh.c cVar4 = new dh.c(cVar3, cVar3, cVar3);
        this.G = cVar4;
        cVar2.f8707g = bVar;
        cVar2.f8706f = bVar2;
        cVar4.f8707g = bVar;
        cVar4.f8706f = bVar2;
        this.f46448a = false;
        bi.ea.y(this.currentAccount, false).U();
        bi.v9 v9Var = new bi.v9(this.currentAccount, 0L, false);
        this.f46450b = v9Var;
        v9Var.g(8, false);
        v9Var.a();
        bi.v9 v9Var2 = new bi.v9(this.currentAccount, 0L, false);
        this.f46452c = v9Var2;
        v9Var2.g(8, false);
        v9Var2.f4910f = true;
        v9Var2.a();
        this.resourceProvider = new hj(this, 1);
        this.f46461x = new org.telegram.ui.ActionBar.t4(0, false, false, this.resourceProvider);
        this.f46462y = new org.telegram.ui.ActionBar.t4(0, false, true, this.resourceProvider);
    }

    public static int B0(int i7) {
        boolean z9;
        float f10;
        if (org.telegram.messenger.g0.B(i7) < 0.2f) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            f10 = 0.28f;
        } else {
            f10 = -0.28f;
        }
        return org.telegram.ui.ActionBar.k6.b(0.5f, f10, i7);
    }

    public static boolean G0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        boolean z9;
        if (tL_emojiStatusCollectible == emojiStatus) {
            return true;
        }
        if (tL_emojiStatusCollectible != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        if (z9 == z10 && tL_emojiStatusCollectible != null && z10 && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_emojiStatusCollectible.collectible_id) {
            return true;
        }
        return false;
    }

    public static void Z(hm0 hm0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, il0 il0Var, bi.h6 h6Var, vf.b bVar) {
        zArr[0] = true;
        bVar.d();
        bi.ea.x(hm0Var.currentAccount, h6Var.f3997a).h(h6Var.f3998b, tL_starGiftUnique, j3, null, true, new bi.p5(20, bVar, il0Var));
    }

    public static void a0(hm0 hm0Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, il0 il0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        bi.h6 h6Var = new bi.h6(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        bi.k6 k6Var = new bi.k6(hm0Var.getParentActivity(), hm0Var.resourceProvider, tL_starGiftUnique, h6Var, hm0Var.currentAccount, j3, jg.g.m(tL_starGiftUnique.num, ',', sb2), false, new bi.w3(hm0Var, zArr, tL_starGiftUnique, j3, il0Var, 1));
        k6Var.h.setOnDismissListener(new bi.u3(12, zArr, il0Var));
        k6Var.b();
    }

    public final void C0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hm0.C0():void");
    }

    public final void D0() {
        cg.b bVar;
        if (this.f46458r) {
            return;
        }
        if (this.f46448a) {
            finishFragment();
        } else if (!getUserConfig().q()) {
            showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) this, 23, true));
            return;
        }
        bm0 H0 = H0();
        if (H0.I != null) {
            bm0 bm0Var = this.h;
            if (H0 == bm0Var) {
                bm0Var = this.f46457n;
            }
            bm0Var.d();
            this.f46458r = true;
            this.Q.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = H0.I;
            il0 il0Var = new il0(this, 1);
            long e10 = org.telegram.messenger.p10.i(this.currentAccount).e();
            if (tL_starGiftUnique.resale_ton_only) {
                bVar = cg.b.f6163b;
            } else {
                bVar = cg.b.f6162a;
            }
            bi.ea.x(this.currentAccount, bVar).H(tL_starGiftUnique, e10, null, true, new jl0(this, bVar, tL_starGiftUnique, e10, il0Var));
            return;
        }
        bm0 bm0Var2 = this.h;
        if (H0 == bm0Var2) {
            bm0Var2 = this.f46457n;
        }
        if (bm0Var2.I != null) {
            bm0Var2.d();
        }
        C0();
        finishFragment();
        I0();
    }

    public final void E0() {
        this.D.a(getThemedColor(org.telegram.ui.ActionBar.k6.f27852d6));
        this.O.invalidate();
        this.P.invalidate();
        this.h.f44453x.invalidate();
        this.h.f44454y.invalidate();
        this.f46457n.f44453x.invalidate();
        this.h.f44431b.invalidate();
        this.f46457n.f44431b.invalidate();
        ((fh.g) this.O.getBackground()).updateColors();
        F0();
        Iterator it = this.f46454d0.iterator();
        while (it.hasNext()) {
            ((fh.g) it.next()).updateColors();
        }
    }

    public final void F0() {
        int themedColor;
        if (org.telegram.messenger.g0.B(getThemedColor(org.telegram.ui.ActionBar.k6.f27852d6)) > 0.72d) {
            themedColor = i0.a.f(0.085f, getThemedColor(org.telegram.ui.ActionBar.k6.f27796a7), this.f46455e.getColor());
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f27796a7);
        }
        this.d.setBackgroundColor(themedColor);
        ri.c cVar = this.F;
        if (cVar.f54563b != themedColor) {
            cVar.a(themedColor);
            Iterator it = this.f46454d0.iterator();
            while (it.hasNext()) {
                ((fh.g) it.next()).updateColors();
            }
            Iterator it2 = this.f46453c0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final bm0 H0() {
        fi.g1 g1Var = this.I;
        if (g1Var != null && g1Var.getPositionAnimated() >= 0.5f) {
            return this.h;
        }
        return this.f46457n;
    }

    public final void I0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hm0.I0():void");
    }

    public final void J0() {
        org.telegram.ui.ActionBar.k5 k5Var = this.N;
        if (k5Var != null) {
            k5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.A8));
        }
        this.h.g();
        this.f46457n.g();
        ml0 ml0Var = this.f46455e;
        if (ml0Var != null) {
            ml0Var.f48436a = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27796a7, ml0Var.f48437b);
            ml0Var.a();
            ml0Var.invalidate();
        }
        K0();
        E0();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void K0() {
        float positionAnimated;
        if (this.f46455e != null) {
            F0();
            int tabsViewBackgroundColor = this.f46455e.getTabsViewBackgroundColor();
            if (this.M != null) {
                fi.g1 g1Var = this.I;
                if (g1Var == null) {
                    positionAnimated = 0.0f;
                } else {
                    positionAnimated = g1Var.getPositionAnimated();
                }
                float a10 = c8.j9.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f);
                org.telegram.ui.Components.ny nyVar = this.M;
                int f10 = i0.a.f(a10, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.k6.f27852d6));
                int f11 = i0.a.f(a10, -1, getThemedColor(org.telegram.ui.ActionBar.k6.f27796a7));
                int f12 = i0.a.f(a10, -1, getThemedColor(org.telegram.ui.ActionBar.k6.f28262z6));
                int f13 = i0.a.f(a10, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.k6.G6));
                nyVar.f36461a.setColor(f10);
                nyVar.f36462b.setColor(f11);
                nyVar.d = f12;
                nyVar.f36464e = f13;
                nyVar.invalidate();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        setHasOwnBackground(true);
        this.actionBar.setCastShadows(false);
        this.actionBar.setVisibility(8);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        k0 k0Var = new k0(16, context, this);
        this.d = k0Var;
        this.fragmentView = k0Var;
        this.h = new bm0(this, context, 1);
        this.f46457n = new bm0(this, context, 0);
        ml0 ml0Var = new ml0(this, context, this.resourceProvider);
        this.f46455e = ml0Var;
        ml0Var.E = true;
        this.f46457n.j(false);
        this.f46457n.addView(this.f46455e, 2, c8.ha.e(-1, -2, 55));
        fi.g1 g1Var = new fi.g1(4, context, this);
        this.I = g1Var;
        g1Var.setAdapter(new ii.x(this, 2));
        k0Var.addView(this.I, c8.ha.e(-1, -1, 119));
        fi.d dVar = new fi.d(context, getResourceProvider(), true);
        this.Q = dVar;
        dVar.setStateListAnimator(null);
        this.Q.f();
        this.Q.d.r(true, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final hm0 f47212b;

            {
                this.f47212b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                hm0 hm0Var = this.f47212b;
                switch (i11) {
                    case 0:
                        if (hm0Var.onBackPressed(true)) {
                            hm0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        hm0 hm0Var2 = this.f47212b;
                        FrameLayout frameLayout2 = (FrameLayout) hm0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        hm0Var2.K.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        hm0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        hm0Var2.K.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f22558n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        cc ccVar = new cc(hm0Var2, hm0Var2.getParentActivity(), canvas, (hm0Var2.K.getMeasuredWidth() / 2.0f) + f10, (hm0Var2.K.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        hm0Var2.X = ccVar;
                        ccVar.setOnTouchListener(new ei.b(2));
                        hm0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        hm0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new fi.ea(hm0Var2, 2));
                        hm0Var2.Z.addListener(new d30(hm0Var2, 8));
                        hm0Var2.Z.setDuration(400L);
                        hm0Var2.Z.setInterpolator(org.telegram.ui.Components.ks.f35429e);
                        hm0Var2.Z.start();
                        frameLayout2.addView(hm0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.h3(new ef0(hm0Var2, 13));
                        return;
                    default:
                        hm0Var.D0();
                        return;
                }
            }
        });
        this.O.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.O.addView(this.Q, c8.ha.c(-1.0f, -1));
        FrameLayout frameLayout2 = this.O;
        fh.g c10 = this.E.c(frameLayout2, null, false);
        c10.p(c8.g0.j(this.resourceProvider));
        c10.r(org.telegram.messenger.g0.L(28.0f));
        c10.q(org.telegram.messenger.g0.L(5.0f));
        frameLayout2.setBackground(c10);
        c8.ka.b(this.O, 0.02f, 1.5f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.P = frameLayout3;
        frameLayout3.addView(this.O, c8.ha.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        dh.d dVar2 = new dh.d(this.G.c(this.P, null, false));
        dVar2.b(org.telegram.messenger.g0.L(40.0f), true);
        dVar2.G = 220;
        this.P.setBackground(dVar2);
        bm0 H0 = H0();
        fi.d dVar3 = this.Q;
        if (dVar3 != null && H0 != null && H0 != this.R) {
            this.R = H0;
            j2.n nVar = H0.f44436e;
            dVar3.i((CharSequence) nVar.f16456b, false, true);
            this.Q.g((SpannableStringBuilder) nVar.f16457c, false);
        }
        k0Var.addView(this.P, c8.ha.e(-1, -2, 80));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.L = frameLayout4;
        k0Var.addView(frameLayout4, c8.ha.e(-1, -2, 55));
        boolean z9 = this.f46448a;
        if (!z9) {
            org.telegram.ui.Components.ny nyVar = new org.telegram.ui.Components.ny(context);
            this.M = nyVar;
            if (z9) {
                i7 = 2131752428;
            } else {
                i7 = 2131743749;
            }
            String M0 = org.telegram.messenger.id.M0(i7, null);
            if (z9) {
                i10 = 2131752429;
            } else {
                i10 = 2131743750;
            }
            nyVar.setTabs(M0, org.telegram.messenger.id.M0(i10, null));
            this.M.f36467r = new il0(this, 0);
            K0();
            this.L.addView(this.M, c8.ha.e(-1, 40, 17));
        } else {
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
            this.N = k5Var;
            k5Var.l(org.telegram.messenger.id.M0(2131752427, null), false);
            this.N.setEllipsizeByGradient(true);
            this.N.setTextSize(20);
            org.telegram.ui.ActionBar.r6.Y(this.N, org.telegram.ui.ActionBar.k6.A8, getResourceProvider());
            this.N.setTypeface(org.telegram.messenger.g0.o());
            this.L.addView(this.N, c8.ha.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        }
        ml0 ml0Var2 = this.f46455e;
        if (ml0Var2 != null) {
            ml0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                org.telegram.messenger.g0.p3(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.J;
        int i11 = org.telegram.ui.ActionBar.k6.f28170u8;
        org.telegram.ui.ActionBar.r6.R(imageView2, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i11), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i11), getResourceProvider());
        this.J.setImageResource(2131231240);
        ImageView imageView3 = this.J;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.J.setOnClickListener(new View.OnClickListener(this) {
            public final hm0 f47212b;

            {
                this.f47212b = this;
            }

            @Override
            public final void onClick(View view) {
                int i112 = r2;
                hm0 hm0Var = this.f47212b;
                switch (i112) {
                    case 0:
                        if (hm0Var.onBackPressed(true)) {
                            hm0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        hm0 hm0Var2 = this.f47212b;
                        FrameLayout frameLayout22 = (FrameLayout) hm0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        hm0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        hm0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        hm0Var2.K.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f22558n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        cc ccVar = new cc(hm0Var2, hm0Var2.getParentActivity(), canvas, (hm0Var2.K.getMeasuredWidth() / 2.0f) + f10, (hm0Var2.K.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        hm0Var2.X = ccVar;
                        ccVar.setOnTouchListener(new ei.b(2));
                        hm0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        hm0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new fi.ea(hm0Var2, 2));
                        hm0Var2.Z.addListener(new d30(hm0Var2, 8));
                        hm0Var2.Z.setDuration(400L);
                        hm0Var2.Z.setInterpolator(org.telegram.ui.Components.ks.f35429e);
                        hm0Var2.Z.start();
                        frameLayout22.addView(hm0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.h3(new ef0(hm0Var2, 13));
                        return;
                    default:
                        hm0Var.D0();
                        return;
                }
            }
        });
        c8.ka.a(this.J);
        this.L.addView(this.J, c8.ha.e(54, 54, 19));
        org.telegram.ui.Components.zg0 zg0Var = new org.telegram.ui.Components.zg0(2131624240, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.T = zg0Var;
        zg0Var.h = true;
        if (!this.S) {
            zg0Var.P(0);
            this.T.M(0);
        } else {
            zg0Var.M(35);
            this.T.P(36);
        }
        this.T.Z = true;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J9, false);
        this.T.Q(x02, "Sunny");
        this.T.Q(x02, "Path 6");
        this.T.Q(x02, "Path");
        this.T.Q(x02, "Path 5");
        this.T.o();
        ImageView imageView4 = new ImageView(context);
        this.K = imageView4;
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.r6.R(this.K, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i11), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i11), getResourceProvider());
        this.K.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) {
            public final hm0 f47212b;

            {
                this.f47212b = this;
            }

            @Override
            public final void onClick(View view) {
                int i112 = r2;
                hm0 hm0Var = this.f47212b;
                switch (i112) {
                    case 0:
                        if (hm0Var.onBackPressed(true)) {
                            hm0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        hm0 hm0Var2 = this.f47212b;
                        FrameLayout frameLayout22 = (FrameLayout) hm0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        hm0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        hm0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        hm0Var2.K.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f22558n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        cc ccVar = new cc(hm0Var2, hm0Var2.getParentActivity(), canvas, (hm0Var2.K.getMeasuredWidth() / 2.0f) + f10, (hm0Var2.K.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        hm0Var2.X = ccVar;
                        ccVar.setOnTouchListener(new ei.b(2));
                        hm0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        hm0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new fi.ea(hm0Var2, 2));
                        hm0Var2.Z.addListener(new d30(hm0Var2, 8));
                        hm0Var2.Z.setDuration(400L);
                        hm0Var2.Z.setInterpolator(org.telegram.ui.Components.ks.f35429e);
                        hm0Var2.Z.start();
                        frameLayout22.addView(hm0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.h3(new ef0(hm0Var2, 13));
                        return;
                    default:
                        hm0Var.D0();
                        return;
                }
            }
        });
        this.L.addView(this.K, c8.ha.e(54, 54, 21));
        this.K.setImageDrawable(this.T);
        ml0 ml0Var3 = this.f46455e;
        ml0Var3.getClass();
        ml0Var3.f48436a = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27796a7, ml0Var3.f48437b);
        ml0Var3.a();
        ml0Var3.invalidate();
        E0();
        F0();
        View view = this.fragmentView;
        ll0 ll0Var = new ll0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f54190a;
        r0.a0.i(view, ll0Var);
        return this.d;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i10 == this.currentAccount) {
            if (i7 == org.telegram.messenger.qs.f25001f5) {
                this.h.f(true);
                this.f46457n.f(true);
            } else if (i7 == org.telegram.messenger.qs.G3) {
                this.h.e();
                this.f46457n.e();
            } else if (i7 == org.telegram.messenger.qs.F3) {
                this.h.e();
                this.f46457n.e();
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.o3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.o3.f28341c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.ma.a(new f6(15, this), org.telegram.ui.ActionBar.k6.f27852d6, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.f28262z6, org.telegram.ui.ActionBar.k6.f27944i6, org.telegram.ui.ActionBar.k6.f27796a7, org.telegram.ui.ActionBar.k6.B6, org.telegram.ui.ActionBar.k6.f28073p7, org.telegram.ui.ActionBar.k6.f27890f6, org.telegram.ui.ActionBar.k6.f27907g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
    }

    @Override
    public final boolean isLightStatusBar() {
        ml0 ml0Var = this.f46455e;
        if (ml0Var == null) {
            return super.isLightStatusBar();
        }
        if (i0.a.h(ml0Var.getColor()) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.f46448a && ((this.h.b() || this.f46457n.b()) && getUserConfig().q())) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        int i7;
        int i10;
        boolean z10 = this.f46448a;
        if (!z10 && ((this.h.b() || this.f46457n.b()) && getUserConfig().q())) {
            if (z9 && getVisibleDialog() == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                if (z10) {
                    i7 = 2131752426;
                } else {
                    i7 = 2131743748;
                }
                String M0 = org.telegram.messenger.id.M0(i7, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.R = M0;
                if (z10) {
                    i10 = 2131752425;
                } else {
                    i10 = 2131743747;
                }
                u1Var.T = org.telegram.messenger.id.M0(i10, null);
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131751370, null), new ll0(this, 1));
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131754216, null), new ll0(this, 2));
                showDialog(u1Var);
                org.telegram.ui.ActionBar.r6.V((TextView) u1Var.d(-2), org.telegram.ui.ActionBar.k6.f28093q7, getResourceProvider());
            }
            return false;
        }
        return super.onBackPressed(z9);
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        setBulletinDelegate(null);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25001f5);
        getNotificationCenter().c(this, org.telegram.messenger.qs.G3);
        getNotificationCenter().c(this, org.telegram.messenger.qs.F3);
        setBulletinDelegate(new fi.r7(11));
        getMediaDataController().W0();
        if (org.telegram.messenger.qp.s1(this.currentAccount).f24874q4 == null) {
            boolean z9 = org.telegram.messenger.r2.f25212a;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25001f5);
        getNotificationCenter().n(this, org.telegram.messenger.qs.G3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.F3);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            if (this.h != null && this.f46457n != null) {
                J0();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.f6 f6Var) {
        this.f46459s = f6Var;
    }
}

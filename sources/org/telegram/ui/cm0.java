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
public final class cm0 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public final si.c E;
    public final eh.c F;
    public final si.c G;
    public final eh.c H;
    public org.telegram.ui.ActionBar.d2 I;
    public gi.g1 J;
    public ImageView K;
    public ImageView L;
    public FrameLayout M;
    public org.telegram.ui.Components.ky N;
    public org.telegram.ui.ActionBar.k5 O;
    public FrameLayout P;
    public FrameLayout Q;
    public gi.d R;
    public wl0 S;
    public boolean T;
    public org.telegram.ui.Components.ch0 U;
    public boolean V;
    public boolean W;
    public boolean X;
    public ac Y;
    public float Z;
    public final boolean f44388a;
    public ValueAnimator f44389a0;
    public final ci.v8 f44390b;
    public boolean f44391b0;
    public final ci.v8 f44392c;
    public i0.b f44393c0;
    public l0 d;
    public final ue.b f44394d0;
    public hl0 f44395e;
    public final ue.b f44396e0;
    public final int f44397f;
    public wl0 h;
    public wl0 f44398n;
    public boolean f44399r;
    public org.telegram.ui.ActionBar.e6 f44400s;
    public final SparseIntArray f44401w;
    public final org.telegram.ui.ActionBar.t4 f44402x;
    public final org.telegram.ui.ActionBar.t4 f44403y;

    public cm0() {
        super(null);
        this.f44397f = org.telegram.messenger.g0.L(6.0f);
        this.f44401w = new SparseIntArray();
        boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
        this.T = q10;
        this.f44391b0 = q10;
        this.f44393c0 = i0.b.f14494e;
        ue.b bVar = new ue.b();
        this.f44394d0 = bVar;
        ue.b bVar2 = new ue.b();
        this.f44396e0 = bVar2;
        si.c cVar = new si.c();
        this.E = cVar;
        eh.c cVar2 = new eh.c(cVar, cVar, cVar);
        this.F = cVar2;
        si.c cVar3 = new si.c();
        this.G = cVar3;
        eh.c cVar4 = new eh.c(cVar3, cVar3, cVar3);
        this.H = cVar4;
        cVar2.f9985g = bVar;
        cVar2.f9984f = bVar2;
        cVar4.f9985g = bVar;
        cVar4.f9984f = bVar2;
        this.f44388a = false;
        ci.e9.y(this.currentAccount, false).U();
        ci.v8 v8Var = new ci.v8(this.currentAccount, 0L, false);
        this.f44390b = v8Var;
        v8Var.g(8, false);
        v8Var.a();
        ci.v8 v8Var2 = new ci.v8(this.currentAccount, 0L, false);
        this.f44392c = v8Var2;
        v8Var2.g(8, false);
        v8Var2.f6198f = true;
        v8Var2.a();
        this.resourceProvider = new dj(this, 1);
        this.f44402x = new org.telegram.ui.ActionBar.t4(0, false, false, this.resourceProvider);
        this.f44403y = new org.telegram.ui.ActionBar.t4(0, false, true, this.resourceProvider);
    }

    public static int B0(int i3) {
        boolean z10;
        float f10;
        if (org.telegram.messenger.g0.B(i3) < 0.2f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f10 = 0.28f;
        } else {
            f10 = -0.28f;
        }
        return org.telegram.ui.ActionBar.k6.b(0.5f, f10, i3);
    }

    public static boolean G0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        boolean z10;
        if (tL_emojiStatusCollectible == emojiStatus) {
            return true;
        }
        if (tL_emojiStatusCollectible != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        if (z10 == z11 && tL_emojiStatusCollectible != null && z11 && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_emojiStatusCollectible.collectible_id) {
            return true;
        }
        return false;
    }

    public static void Z(cm0 cm0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, el0 el0Var, ci.l5 l5Var, sf.b bVar) {
        zArr[0] = true;
        bVar.d();
        ci.e9.x(cm0Var.currentAccount, l5Var.f5442a).h(l5Var.f5443b, tL_starGiftUnique, j10, null, true, new ai.q4(21, bVar, el0Var));
    }

    public static void a0(cm0 cm0Var, dg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, el0 el0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        ci.l5 l5Var = new ci.l5(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        ci.n5 n5Var = new ci.n5(cm0Var.getParentActivity(), cm0Var.resourceProvider, tL_starGiftUnique, l5Var, cm0Var.currentAccount, j10, k2.p1.l(tL_starGiftUnique.num, ',', sb2), false, new ci.i3(cm0Var, zArr, tL_starGiftUnique, j10, el0Var, 1));
        n5Var.h.setOnDismissListener(new ci.h3(12, zArr, el0Var));
        n5Var.b();
    }

    public final void C0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cm0.C0():void");
    }

    public final void D0() {
        dg.b bVar;
        if (this.f44399r) {
            return;
        }
        if (this.f44388a) {
            finishFragment();
        } else if (!getUserConfig().q()) {
            showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) this, 23, true));
            return;
        }
        wl0 H0 = H0();
        if (H0.J != null) {
            wl0 wl0Var = this.h;
            if (H0 == wl0Var) {
                wl0Var = this.f44398n;
            }
            wl0Var.d();
            this.f44399r = true;
            this.R.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = H0.J;
            el0 el0Var = new el0(this, 1);
            long e10 = org.telegram.messenger.h10.i(this.currentAccount).e();
            if (tL_starGiftUnique.resale_ton_only) {
                bVar = dg.b.f8926b;
            } else {
                bVar = dg.b.f8925a;
            }
            ci.e9.x(this.currentAccount, bVar).H(tL_starGiftUnique, e10, null, true, new ai.c6(this, bVar, tL_starGiftUnique, e10, el0Var));
            return;
        }
        wl0 wl0Var2 = this.h;
        if (H0 == wl0Var2) {
            wl0Var2 = this.f44398n;
        }
        if (wl0Var2.J != null) {
            wl0Var2.d();
        }
        C0();
        finishFragment();
        I0();
    }

    public final void E0() {
        this.E.a(getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
        this.P.invalidate();
        this.Q.invalidate();
        this.h.f51225x.invalidate();
        this.h.f51226y.invalidate();
        this.f44398n.f51225x.invalidate();
        this.h.f51202b.invalidate();
        this.f44398n.f51202b.invalidate();
        ((gh.g) this.P.getBackground()).updateColors();
        F0();
        Iterator it = this.f44396e0.iterator();
        while (it.hasNext()) {
            ((gh.g) it.next()).updateColors();
        }
    }

    public final void F0() {
        int themedColor;
        if (org.telegram.messenger.g0.B(getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6)) > 0.72d) {
            themedColor = i0.a.f(0.085f, getThemedColor(org.telegram.ui.ActionBar.k6.f27824a7), this.f44395e.getColor());
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f27824a7);
        }
        this.d.setBackgroundColor(themedColor);
        si.c cVar = this.G;
        if (cVar.f54747b != themedColor) {
            cVar.a(themedColor);
            Iterator it = this.f44396e0.iterator();
            while (it.hasNext()) {
                ((gh.g) it.next()).updateColors();
            }
            Iterator it2 = this.f44394d0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final wl0 H0() {
        gi.g1 g1Var = this.J;
        if (g1Var != null && g1Var.getPositionAnimated() >= 0.5f) {
            return this.h;
        }
        return this.f44398n;
    }

    public final void I0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cm0.I0():void");
    }

    public final void J0() {
        org.telegram.ui.ActionBar.k5 k5Var = this.O;
        if (k5Var != null) {
            k5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.A8));
        }
        this.h.g();
        this.f44398n.g();
        hl0 hl0Var = this.f44395e;
        if (hl0Var != null) {
            hl0Var.f46639a = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, hl0Var.f46640b);
            hl0Var.a();
            hl0Var.invalidate();
        }
        K0();
        E0();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void K0() {
        float positionAnimated;
        if (this.f44395e != null) {
            F0();
            int tabsViewBackgroundColor = this.f44395e.getTabsViewBackgroundColor();
            if (this.N != null) {
                gi.g1 g1Var = this.J;
                if (g1Var == null) {
                    positionAnimated = 0.0f;
                } else {
                    positionAnimated = g1Var.getPositionAnimated();
                }
                float a10 = b8.be.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f);
                org.telegram.ui.Components.ky kyVar = this.N;
                int f10 = i0.a.f(a10, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
                int f11 = i0.a.f(a10, -1, getThemedColor(org.telegram.ui.ActionBar.k6.f27824a7));
                int f12 = i0.a.f(a10, -1, getThemedColor(org.telegram.ui.ActionBar.k6.f28290z6));
                int f13 = i0.a.f(a10, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.k6.G6));
                kyVar.f35501a.setColor(f10);
                kyVar.f35502b.setColor(f11);
                kyVar.d = f12;
                kyVar.f35504e = f13;
                kyVar.invalidate();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i3;
        int i10;
        setHasOwnBackground(true);
        this.actionBar.setCastShadows(false);
        this.actionBar.setVisibility(8);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        l0 l0Var = new l0(16, context, this);
        this.d = l0Var;
        this.fragmentView = l0Var;
        this.h = new wl0(this, context, 1);
        this.f44398n = new wl0(this, context, 0);
        hl0 hl0Var = new hl0(this, context, this.resourceProvider);
        this.f44395e = hl0Var;
        hl0Var.F = true;
        this.f44398n.j(false);
        this.f44398n.addView(this.f44395e, 2, b8.mf.e(-1, -2, 55));
        gi.g1 g1Var = new gi.g1(4, context, this);
        this.J = g1Var;
        g1Var.setAdapter(new ji.v(this, 2));
        l0Var.addView(this.J, b8.mf.e(-1, -1, 119));
        gi.d dVar = new gi.d(context, getResourceProvider(), true);
        this.R = dVar;
        dVar.setStateListAnimator(null);
        this.R.f();
        this.R.d.r(true, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final cm0 f45303b;

            {
                this.f45303b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                cm0 cm0Var = this.f45303b;
                switch (i11) {
                    case 0:
                        if (cm0Var.onBackPressed(true)) {
                            cm0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        cm0 cm0Var2 = this.f45303b;
                        FrameLayout frameLayout2 = (FrameLayout) cm0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        cm0Var2.L.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        cm0Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        cm0Var2.L.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f22603n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        ac acVar = new ac(cm0Var2, cm0Var2.getParentActivity(), canvas, (cm0Var2.L.getMeasuredWidth() / 2.0f) + f10, (cm0Var2.L.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        cm0Var2.Y = acVar;
                        acVar.setOnTouchListener(new fi.a(2));
                        cm0Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        cm0Var2.f44389a0 = ofFloat;
                        ofFloat.addUpdateListener(new gi.ea(cm0Var2, 2));
                        cm0Var2.f44389a0.addListener(new y20(cm0Var2, 8));
                        cm0Var2.f44389a0.setDuration(400L);
                        cm0Var2.f44389a0.setInterpolator(org.telegram.ui.Components.ks.f35477e);
                        cm0Var2.f44389a0.start();
                        frameLayout2.addView(cm0Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.h3(new sg0(cm0Var2, 12));
                        return;
                    default:
                        cm0Var.D0();
                        return;
                }
            }
        });
        this.P.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.P.addView(this.R, b8.mf.c(-1.0f, -1));
        FrameLayout frameLayout2 = this.P;
        gh.g c2 = this.F.c(frameLayout2, null, false);
        c2.p(b8.cd.j(this.resourceProvider));
        c2.r(org.telegram.messenger.g0.L(28.0f));
        c2.q(org.telegram.messenger.g0.L(5.0f));
        frameLayout2.setBackground(c2);
        b8.pf.b(this.P, 0.02f, 1.5f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Q = frameLayout3;
        frameLayout3.addView(this.P, b8.mf.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        eh.d dVar2 = new eh.d(this.H.c(this.Q, null, false));
        dVar2.b(org.telegram.messenger.g0.L(40.0f), true);
        dVar2.H = 220;
        this.Q.setBackground(dVar2);
        wl0 H0 = H0();
        gi.d dVar3 = this.R;
        if (dVar3 != null && H0 != null && H0 != this.S) {
            this.S = H0;
            mi.h0 h0Var = H0.f51207e;
            dVar3.i((CharSequence) h0Var.f19644b, false, true);
            this.R.g((SpannableStringBuilder) h0Var.f19645c, false);
        }
        l0Var.addView(this.Q, b8.mf.e(-1, -2, 80));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.M = frameLayout4;
        l0Var.addView(frameLayout4, b8.mf.e(-1, -2, 55));
        boolean z10 = this.f44388a;
        if (!z10) {
            org.telegram.ui.Components.ky kyVar = new org.telegram.ui.Components.ky(context);
            this.N = kyVar;
            if (z10) {
                i3 = 2131752428;
            } else {
                i3 = 2131743756;
            }
            String M0 = org.telegram.messenger.bd.M0(i3, null);
            if (z10) {
                i10 = 2131752429;
            } else {
                i10 = 2131743757;
            }
            kyVar.setTabs(M0, org.telegram.messenger.bd.M0(i10, null));
            this.N.f35507r = new el0(this, 0);
            K0();
            this.M.addView(this.N, b8.mf.e(-1, 40, 17));
        } else {
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
            this.O = k5Var;
            k5Var.l(org.telegram.messenger.bd.M0(2131752427, null), false);
            this.O.setEllipsizeByGradient(true);
            this.O.setTextSize(20);
            org.telegram.ui.ActionBar.r6.Y(this.O, org.telegram.ui.ActionBar.k6.A8, getResourceProvider());
            this.O.setTypeface(org.telegram.messenger.g0.o());
            this.M.addView(this.O, b8.mf.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        }
        hl0 hl0Var2 = this.f44395e;
        if (hl0Var2 != null) {
            hl0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                org.telegram.messenger.g0.p3(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.K;
        int i11 = org.telegram.ui.ActionBar.k6.f28198u8;
        org.telegram.ui.ActionBar.r6.R(imageView2, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i11), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i11), getResourceProvider());
        this.K.setImageResource(2131231240);
        ImageView imageView3 = this.K;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) {
            public final cm0 f45303b;

            {
                this.f45303b = this;
            }

            @Override
            public final void onClick(View view) {
                int i112 = r2;
                cm0 cm0Var = this.f45303b;
                switch (i112) {
                    case 0:
                        if (cm0Var.onBackPressed(true)) {
                            cm0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        cm0 cm0Var2 = this.f45303b;
                        FrameLayout frameLayout22 = (FrameLayout) cm0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        cm0Var2.L.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        cm0Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        cm0Var2.L.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f22603n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        ac acVar = new ac(cm0Var2, cm0Var2.getParentActivity(), canvas, (cm0Var2.L.getMeasuredWidth() / 2.0f) + f10, (cm0Var2.L.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        cm0Var2.Y = acVar;
                        acVar.setOnTouchListener(new fi.a(2));
                        cm0Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        cm0Var2.f44389a0 = ofFloat;
                        ofFloat.addUpdateListener(new gi.ea(cm0Var2, 2));
                        cm0Var2.f44389a0.addListener(new y20(cm0Var2, 8));
                        cm0Var2.f44389a0.setDuration(400L);
                        cm0Var2.f44389a0.setInterpolator(org.telegram.ui.Components.ks.f35477e);
                        cm0Var2.f44389a0.start();
                        frameLayout22.addView(cm0Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.h3(new sg0(cm0Var2, 12));
                        return;
                    default:
                        cm0Var.D0();
                        return;
                }
            }
        });
        b8.pf.a(this.K);
        this.M.addView(this.K, b8.mf.e(54, 54, 19));
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(2131624240, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.U = ch0Var;
        ch0Var.h = true;
        if (!this.T) {
            ch0Var.P(0);
            this.U.M(0);
        } else {
            ch0Var.M(35);
            this.U.P(36);
        }
        this.U.f32719a0 = true;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J9, false);
        this.U.Q(x02, "Sunny");
        this.U.Q(x02, "Path 6");
        this.U.Q(x02, "Path");
        this.U.Q(x02, "Path 5");
        this.U.o();
        ImageView imageView4 = new ImageView(context);
        this.L = imageView4;
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.r6.R(this.L, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i11), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i11), getResourceProvider());
        this.L.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.L.setOnClickListener(new View.OnClickListener(this) {
            public final cm0 f45303b;

            {
                this.f45303b = this;
            }

            @Override
            public final void onClick(View view) {
                int i112 = r2;
                cm0 cm0Var = this.f45303b;
                switch (i112) {
                    case 0:
                        if (cm0Var.onBackPressed(true)) {
                            cm0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        cm0 cm0Var2 = this.f45303b;
                        FrameLayout frameLayout22 = (FrameLayout) cm0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        cm0Var2.L.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        cm0Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        cm0Var2.L.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f22603n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        ac acVar = new ac(cm0Var2, cm0Var2.getParentActivity(), canvas, (cm0Var2.L.getMeasuredWidth() / 2.0f) + f10, (cm0Var2.L.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        cm0Var2.Y = acVar;
                        acVar.setOnTouchListener(new fi.a(2));
                        cm0Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        cm0Var2.f44389a0 = ofFloat;
                        ofFloat.addUpdateListener(new gi.ea(cm0Var2, 2));
                        cm0Var2.f44389a0.addListener(new y20(cm0Var2, 8));
                        cm0Var2.f44389a0.setDuration(400L);
                        cm0Var2.f44389a0.setInterpolator(org.telegram.ui.Components.ks.f35477e);
                        cm0Var2.f44389a0.start();
                        frameLayout22.addView(cm0Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.h3(new sg0(cm0Var2, 12));
                        return;
                    default:
                        cm0Var.D0();
                        return;
                }
            }
        });
        this.M.addView(this.L, b8.mf.e(54, 54, 21));
        this.L.setImageDrawable(this.U);
        hl0 hl0Var3 = this.f44395e;
        hl0Var3.getClass();
        hl0Var3.f46639a = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, hl0Var3.f46640b);
        hl0Var3.a();
        hl0Var3.invalidate();
        E0();
        F0();
        View view = this.fragmentView;
        gl0 gl0Var = new gl0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.a0.i(view, gl0Var);
        return this.d;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i10 == this.currentAccount) {
            if (i3 == org.telegram.messenger.hs.f23230f5) {
                this.h.f(true);
                this.f44398n.f(true);
            } else if (i3 == org.telegram.messenger.hs.G3) {
                this.h.e();
                this.f44398n.e();
            } else if (i3 == org.telegram.messenger.hs.F3) {
                this.h.e();
                this.f44398n.e();
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.m3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.m3.f28339c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return b8.qf.a(new h6(15, this), org.telegram.ui.ActionBar.k6.f27878d6, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.f28290z6, org.telegram.ui.ActionBar.k6.f27972i6, org.telegram.ui.ActionBar.k6.f27824a7, org.telegram.ui.ActionBar.k6.B6, org.telegram.ui.ActionBar.k6.f28102p7, org.telegram.ui.ActionBar.k6.f27917f6, org.telegram.ui.ActionBar.k6.f27937g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
    }

    @Override
    public final boolean isLightStatusBar() {
        hl0 hl0Var = this.f44395e;
        if (hl0Var == null) {
            return super.isLightStatusBar();
        }
        if (i0.a.h(hl0Var.getColor()) > 0.699999988079071d) {
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
        if (!this.f44388a && ((this.h.b() || this.f44398n.b()) && getUserConfig().q())) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i3;
        int i10;
        boolean z11 = this.f44388a;
        if (!z11 && ((this.h.b() || this.f44398n.b()) && getUserConfig().q())) {
            if (z10 && getVisibleDialog() == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                if (z11) {
                    i3 = 2131752426;
                } else {
                    i3 = 2131743755;
                }
                String M0 = org.telegram.messenger.bd.M0(i3, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                if (z11) {
                    i10 = 2131752425;
                } else {
                    i10 = 2131743754;
                }
                s1Var.U = org.telegram.messenger.bd.M0(i10, null);
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751370, null), new gl0(this, 1));
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131754216, null), new gl0(this, 2));
                showDialog(s1Var);
                org.telegram.ui.ActionBar.r6.V((TextView) s1Var.d(-2), org.telegram.ui.ActionBar.k6.f28122q7, getResourceProvider());
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        setBulletinDelegate(null);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.hs.f23230f5);
        getNotificationCenter().c(this, org.telegram.messenger.hs.G3);
        getNotificationCenter().c(this, org.telegram.messenger.hs.F3);
        setBulletinDelegate(new ai.y(12));
        getMediaDataController().W0();
        if (org.telegram.messenger.hp.s1(this.currentAccount).f23099q4 == null) {
            boolean z10 = org.telegram.messenger.r2.f25040a;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23230f5);
        getNotificationCenter().n(this, org.telegram.messenger.hs.G3);
        getNotificationCenter().n(this, org.telegram.messenger.hs.F3);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            if (this.h != null && this.f44398n != null) {
                J0();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.e6 e6Var) {
        this.f44400s = e6Var;
    }
}

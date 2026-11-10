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
public final class km0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public final ri.c D;
    public final dh.c E;
    public final ri.c F;
    public final dh.c G;
    public org.telegram.ui.ActionBar.f2 H;
    public fi.g1 I;
    public ImageView J;
    public ImageView K;
    public FrameLayout L;
    public org.telegram.ui.Components.my M;
    public org.telegram.ui.ActionBar.m5 N;
    public FrameLayout O;
    public FrameLayout P;
    public fi.d Q;
    public em0 R;
    public boolean S;
    public org.telegram.ui.Components.zg0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public cc X;
    public float Y;
    public ValueAnimator Z;
    public final boolean f47367a;
    public boolean f47368a0;
    public final bi.v9 f47369b;
    public i0.b f47370b0;
    public final bi.v9 f47371c;
    public final xe.b f47372c0;
    public k0 d;
    public final xe.b f47373d0;
    public pl0 f47374e;
    public final int f47375f;
    public em0 h;
    public em0 f47376n;
    public boolean f47377r;
    public org.telegram.ui.ActionBar.h6 f47378s;
    public final SparseIntArray f47379w;
    public final org.telegram.ui.ActionBar.u4 f47380x;
    public final org.telegram.ui.ActionBar.u4 f47381y;

    public km0() {
        super(null);
        this.f47375f = org.telegram.messenger.g0.L(6.0f);
        this.f47379w = new SparseIntArray();
        boolean q10 = org.telegram.ui.ActionBar.m6.I.q();
        this.S = q10;
        this.f47368a0 = q10;
        this.f47370b0 = i0.b.f15121e;
        xe.b bVar = new xe.b();
        this.f47372c0 = bVar;
        xe.b bVar2 = new xe.b();
        this.f47373d0 = bVar2;
        ri.c cVar = new ri.c();
        this.D = cVar;
        dh.c cVar2 = new dh.c(cVar, cVar, cVar);
        this.E = cVar2;
        ri.c cVar3 = new ri.c();
        this.F = cVar3;
        dh.c cVar4 = new dh.c(cVar3, cVar3, cVar3);
        this.G = cVar4;
        cVar2.f8710g = bVar;
        cVar2.f8709f = bVar2;
        cVar4.f8710g = bVar;
        cVar4.f8709f = bVar2;
        this.f47367a = false;
        bi.ea.y(this.currentAccount, false).U();
        bi.v9 v9Var = new bi.v9(this.currentAccount, 0L, false);
        this.f47369b = v9Var;
        v9Var.g(8, false);
        v9Var.a();
        bi.v9 v9Var2 = new bi.v9(this.currentAccount, 0L, false);
        this.f47371c = v9Var2;
        v9Var2.g(8, false);
        v9Var2.f4909f = true;
        v9Var2.a();
        this.resourceProvider = new jj(this, 1);
        this.f47380x = new org.telegram.ui.ActionBar.u4(0, false, false, this.resourceProvider);
        this.f47381y = new org.telegram.ui.ActionBar.u4(0, false, true, this.resourceProvider);
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
        return org.telegram.ui.ActionBar.m6.b(0.5f, f10, i7);
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

    public static void Z(km0 km0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, ll0 ll0Var, bi.h6 h6Var, vf.b bVar) {
        zArr[0] = true;
        bVar.d();
        bi.ea.x(km0Var.currentAccount, h6Var.f3994a).h(h6Var.f3995b, tL_starGiftUnique, j3, null, true, new bi.p5(20, bVar, ll0Var));
    }

    public static void a0(km0 km0Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, ll0 ll0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        bi.h6 h6Var = new bi.h6(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        bi.k6 k6Var = new bi.k6(km0Var.getParentActivity(), km0Var.resourceProvider, tL_starGiftUnique, h6Var, km0Var.currentAccount, j3, jg.g.m(tL_starGiftUnique.num, ',', sb2), false, new bi.w3(km0Var, zArr, tL_starGiftUnique, j3, ll0Var, 1));
        k6Var.h.setOnDismissListener(new bi.u3(12, zArr, ll0Var));
        k6Var.b();
    }

    public final void C0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.km0.C0():void");
    }

    public final void D0() {
        cg.b bVar;
        if (this.f47377r) {
            return;
        }
        if (this.f47367a) {
            finishFragment();
        } else if (!getUserConfig().q()) {
            showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) this, 23, true));
            return;
        }
        em0 H0 = H0();
        if (H0.I != null) {
            em0 em0Var = this.h;
            if (H0 == em0Var) {
                em0Var = this.f47376n;
            }
            em0Var.d();
            this.f47377r = true;
            this.Q.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = H0.I;
            ll0 ll0Var = new ll0(this, 1);
            long e10 = org.telegram.messenger.p10.i(this.currentAccount).e();
            if (tL_starGiftUnique.resale_ton_only) {
                bVar = cg.b.f6166b;
            } else {
                bVar = cg.b.f6165a;
            }
            bi.ea.x(this.currentAccount, bVar).H(tL_starGiftUnique, e10, null, true, new ml0(this, bVar, tL_starGiftUnique, e10, ll0Var));
            return;
        }
        em0 em0Var2 = this.h;
        if (H0 == em0Var2) {
            em0Var2 = this.f47376n;
        }
        if (em0Var2.I != null) {
            em0Var2.d();
        }
        C0();
        finishFragment();
        I0();
    }

    public final void E0() {
        this.D.a(getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6));
        this.O.invalidate();
        this.P.invalidate();
        this.h.f45405x.invalidate();
        this.h.f45406y.invalidate();
        this.f47376n.f45405x.invalidate();
        this.h.f45383b.invalidate();
        this.f47376n.f45383b.invalidate();
        ((fh.g) this.O.getBackground()).updateColors();
        F0();
        Iterator it = this.f47373d0.iterator();
        while (it.hasNext()) {
            ((fh.g) it.next()).updateColors();
        }
    }

    public final void F0() {
        int themedColor;
        if (org.telegram.messenger.g0.B(getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6)) > 0.72d) {
            themedColor = i0.a.f(0.085f, getThemedColor(org.telegram.ui.ActionBar.m6.f27834a7), this.f47374e.getColor());
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.f27834a7);
        }
        this.d.setBackgroundColor(themedColor);
        ri.c cVar = this.F;
        if (cVar.f54575b != themedColor) {
            cVar.a(themedColor);
            Iterator it = this.f47373d0.iterator();
            while (it.hasNext()) {
                ((fh.g) it.next()).updateColors();
            }
            Iterator it2 = this.f47372c0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final em0 H0() {
        fi.g1 g1Var = this.I;
        if (g1Var != null && g1Var.getPositionAnimated() >= 0.5f) {
            return this.h;
        }
        return this.f47376n;
    }

    public final void I0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.km0.I0():void");
    }

    public final void J0() {
        org.telegram.ui.ActionBar.m5 m5Var = this.N;
        if (m5Var != null) {
            m5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.m6.A8));
        }
        this.h.g();
        this.f47376n.g();
        pl0 pl0Var = this.f47374e;
        if (pl0Var != null) {
            pl0Var.f49433a = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27834a7, pl0Var.f49434b);
            pl0Var.a();
            pl0Var.invalidate();
        }
        K0();
        E0();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void K0() {
        float positionAnimated;
        if (this.f47374e != null) {
            F0();
            int tabsViewBackgroundColor = this.f47374e.getTabsViewBackgroundColor();
            if (this.M != null) {
                fi.g1 g1Var = this.I;
                if (g1Var == null) {
                    positionAnimated = 0.0f;
                } else {
                    positionAnimated = g1Var.getPositionAnimated();
                }
                float a10 = c8.j9.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f);
                org.telegram.ui.Components.my myVar = this.M;
                int f10 = i0.a.f(a10, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6));
                int f11 = i0.a.f(a10, -1, getThemedColor(org.telegram.ui.ActionBar.m6.f27834a7));
                int f12 = i0.a.f(a10, -1, getThemedColor(org.telegram.ui.ActionBar.m6.f28300z6));
                int f13 = i0.a.f(a10, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.m6.G6));
                myVar.f36123a.setColor(f10);
                myVar.f36124b.setColor(f11);
                myVar.d = f12;
                myVar.f36126e = f13;
                myVar.invalidate();
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
        this.h = new em0(this, context, 1);
        this.f47376n = new em0(this, context, 0);
        pl0 pl0Var = new pl0(this, context, this.resourceProvider);
        this.f47374e = pl0Var;
        pl0Var.E = true;
        this.f47376n.j(false);
        this.f47376n.addView(this.f47374e, 2, c8.ha.e(-1, -2, 55));
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
            public final km0 f48226b;

            {
                this.f48226b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                km0 km0Var = this.f48226b;
                switch (i11) {
                    case 0:
                        if (km0Var.onBackPressed(true)) {
                            km0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        km0 km0Var2 = this.f48226b;
                        FrameLayout frameLayout2 = (FrameLayout) km0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        km0Var2.K.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        km0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        km0Var2.K.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f22562n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        cc ccVar = new cc(km0Var2, km0Var2.getParentActivity(), canvas, (km0Var2.K.getMeasuredWidth() / 2.0f) + f10, (km0Var2.K.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        km0Var2.X = ccVar;
                        ccVar.setOnTouchListener(new ei.b(2));
                        km0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        km0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new fi.ea(km0Var2, 2));
                        km0Var2.Z.addListener(new g30(km0Var2, 8));
                        km0Var2.Z.setDuration(400L);
                        km0Var2.Z.setInterpolator(org.telegram.ui.Components.js.f35060e);
                        km0Var2.Z.start();
                        frameLayout2.addView(km0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.h3(new hf0(km0Var2, 13));
                        return;
                    default:
                        km0Var.D0();
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
        em0 H0 = H0();
        fi.d dVar3 = this.Q;
        if (dVar3 != null && H0 != null && H0 != this.R) {
            this.R = H0;
            j2.n nVar = H0.f45388e;
            dVar3.i((CharSequence) nVar.f16456b, false, true);
            this.Q.g((SpannableStringBuilder) nVar.f16457c, false);
        }
        k0Var.addView(this.P, c8.ha.e(-1, -2, 80));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.L = frameLayout4;
        k0Var.addView(frameLayout4, c8.ha.e(-1, -2, 55));
        boolean z9 = this.f47367a;
        if (!z9) {
            org.telegram.ui.Components.my myVar = new org.telegram.ui.Components.my(context);
            this.M = myVar;
            if (z9) {
                i7 = 2131752428;
            } else {
                i7 = 2131743746;
            }
            String M0 = org.telegram.messenger.id.M0(i7, null);
            if (z9) {
                i10 = 2131752429;
            } else {
                i10 = 2131743747;
            }
            myVar.setTabs(M0, org.telegram.messenger.id.M0(i10, null));
            this.M.f36129r = new ll0(this, 0);
            K0();
            this.L.addView(this.M, c8.ha.e(-1, 40, 17));
        } else {
            org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
            this.N = m5Var;
            m5Var.l(org.telegram.messenger.id.M0(2131752427, null), false);
            this.N.setEllipsizeByGradient(true);
            this.N.setTextSize(20);
            org.telegram.ui.ActionBar.t6.X(this.N, org.telegram.ui.ActionBar.m6.A8, getResourceProvider());
            this.N.setTypeface(org.telegram.messenger.g0.o());
            this.L.addView(this.N, c8.ha.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        }
        pl0 pl0Var2 = this.f47374e;
        if (pl0Var2 != null) {
            pl0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                org.telegram.messenger.g0.p3(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.J;
        int i11 = org.telegram.ui.ActionBar.m6.f28208u8;
        org.telegram.ui.ActionBar.t6.Q(imageView2, org.telegram.ui.ActionBar.m6.h0(getThemedColor(i11), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i11), getResourceProvider());
        this.J.setImageResource(2131231240);
        ImageView imageView3 = this.J;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.J.setOnClickListener(new View.OnClickListener(this) {
            public final km0 f48226b;

            {
                this.f48226b = this;
            }

            @Override
            public final void onClick(View view) {
                int i112 = r2;
                km0 km0Var = this.f48226b;
                switch (i112) {
                    case 0:
                        if (km0Var.onBackPressed(true)) {
                            km0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        km0 km0Var2 = this.f48226b;
                        FrameLayout frameLayout22 = (FrameLayout) km0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        km0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        km0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        km0Var2.K.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f22562n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        cc ccVar = new cc(km0Var2, km0Var2.getParentActivity(), canvas, (km0Var2.K.getMeasuredWidth() / 2.0f) + f10, (km0Var2.K.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        km0Var2.X = ccVar;
                        ccVar.setOnTouchListener(new ei.b(2));
                        km0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        km0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new fi.ea(km0Var2, 2));
                        km0Var2.Z.addListener(new g30(km0Var2, 8));
                        km0Var2.Z.setDuration(400L);
                        km0Var2.Z.setInterpolator(org.telegram.ui.Components.js.f35060e);
                        km0Var2.Z.start();
                        frameLayout22.addView(km0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.h3(new hf0(km0Var2, 13));
                        return;
                    default:
                        km0Var.D0();
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
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.J9, false);
        this.T.Q(x02, "Sunny");
        this.T.Q(x02, "Path 6");
        this.T.Q(x02, "Path");
        this.T.Q(x02, "Path 5");
        this.T.o();
        ImageView imageView4 = new ImageView(context);
        this.K = imageView4;
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.t6.Q(this.K, org.telegram.ui.ActionBar.m6.h0(getThemedColor(i11), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i11), getResourceProvider());
        this.K.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) {
            public final km0 f48226b;

            {
                this.f48226b = this;
            }

            @Override
            public final void onClick(View view) {
                int i112 = r2;
                km0 km0Var = this.f48226b;
                switch (i112) {
                    case 0:
                        if (km0Var.onBackPressed(true)) {
                            km0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        km0 km0Var2 = this.f48226b;
                        FrameLayout frameLayout22 = (FrameLayout) km0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        km0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        km0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        km0Var2.K.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f22562n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        cc ccVar = new cc(km0Var2, km0Var2.getParentActivity(), canvas, (km0Var2.K.getMeasuredWidth() / 2.0f) + f10, (km0Var2.K.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        km0Var2.X = ccVar;
                        ccVar.setOnTouchListener(new ei.b(2));
                        km0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        km0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new fi.ea(km0Var2, 2));
                        km0Var2.Z.addListener(new g30(km0Var2, 8));
                        km0Var2.Z.setDuration(400L);
                        km0Var2.Z.setInterpolator(org.telegram.ui.Components.js.f35060e);
                        km0Var2.Z.start();
                        frameLayout22.addView(km0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.h3(new hf0(km0Var2, 13));
                        return;
                    default:
                        km0Var.D0();
                        return;
                }
            }
        });
        this.L.addView(this.K, c8.ha.e(54, 54, 21));
        this.K.setImageDrawable(this.T);
        pl0 pl0Var3 = this.f47374e;
        pl0Var3.getClass();
        pl0Var3.f49433a = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27834a7, pl0Var3.f49434b);
        pl0Var3.a();
        pl0Var3.invalidate();
        E0();
        F0();
        View view = this.fragmentView;
        ol0 ol0Var = new ol0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f54202a;
        r0.a0.i(view, ol0Var);
        return this.d;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i10 == this.currentAccount) {
            if (i7 == org.telegram.messenger.qs.f25005f5) {
                this.h.f(true);
                this.f47376n.f(true);
            } else if (i7 == org.telegram.messenger.qs.G3) {
                this.h.e();
                this.f47376n.e();
            } else if (i7 == org.telegram.messenger.qs.F3) {
                this.h.e();
                this.f47376n.e();
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.p3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.p3.f28378c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.ma.a(new f6(15, this), org.telegram.ui.ActionBar.m6.f27890d6, org.telegram.ui.ActionBar.m6.G6, org.telegram.ui.ActionBar.m6.f28300z6, org.telegram.ui.ActionBar.m6.f27982i6, org.telegram.ui.ActionBar.m6.f27834a7, org.telegram.ui.ActionBar.m6.B6, org.telegram.ui.ActionBar.m6.f28111p7, org.telegram.ui.ActionBar.m6.f27928f6, org.telegram.ui.ActionBar.m6.f27945g6, org.telegram.ui.ActionBar.m6.O6, org.telegram.ui.ActionBar.m6.P6, org.telegram.ui.ActionBar.m6.Q6, org.telegram.ui.ActionBar.m6.R6);
    }

    @Override
    public final boolean isLightStatusBar() {
        pl0 pl0Var = this.f47374e;
        if (pl0Var == null) {
            return super.isLightStatusBar();
        }
        if (i0.a.h(pl0Var.getColor()) > 0.699999988079071d) {
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
        if (!this.f47367a && ((this.h.b() || this.f47376n.b()) && getUserConfig().q())) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        int i7;
        int i10;
        boolean z10 = this.f47367a;
        if (!z10 && ((this.h.b() || this.f47376n.b()) && getUserConfig().q())) {
            if (z9 && getVisibleDialog() == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                if (z10) {
                    i7 = 2131752426;
                } else {
                    i7 = 2131743745;
                }
                String M0 = org.telegram.messenger.id.M0(i7, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                u1Var.R = M0;
                if (z10) {
                    i10 = 2131752425;
                } else {
                    i10 = 2131743744;
                }
                u1Var.T = org.telegram.messenger.id.M0(i10, null);
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131751369, null), new ol0(this, 1));
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131754216, null), new ol0(this, 2));
                showDialog(u1Var);
                org.telegram.ui.ActionBar.t6.U((TextView) u1Var.d(-2), org.telegram.ui.ActionBar.m6.f28131q7, getResourceProvider());
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
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25005f5);
        getNotificationCenter().c(this, org.telegram.messenger.qs.G3);
        getNotificationCenter().c(this, org.telegram.messenger.qs.F3);
        setBulletinDelegate(new fi.r7(11));
        getMediaDataController().W0();
        if (org.telegram.messenger.qp.s1(this.currentAccount).f24878q4 == null) {
            boolean z9 = org.telegram.messenger.r2.f25216a;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25005f5);
        getNotificationCenter().n(this, org.telegram.messenger.qs.G3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.F3);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            if (this.h != null && this.f47376n != null) {
                J0();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.h6 h6Var) {
        this.f47378s = h6Var;
    }
}

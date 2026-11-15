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
public final class im0 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public final ui.c E;
    public final dh.c F;
    public final ui.c G;
    public final dh.c H;
    public org.telegram.ui.ActionBar.e2 I;
    public hi.i1 J;
    public ImageView K;
    public ImageView L;
    public FrameLayout M;
    public org.telegram.ui.Components.ry N;
    public org.telegram.ui.ActionBar.j5 O;
    public FrameLayout P;
    public FrameLayout Q;
    public hi.d R;
    public cm0 S;
    public boolean T;
    public org.telegram.ui.Components.ch0 U;
    public boolean V;
    public boolean W;
    public boolean X;
    public bc Y;
    public float Z;
    public final boolean f48084a;
    public ValueAnimator f48085a0;
    public final di.m8 f48086b;
    public boolean f48087b0;
    public final di.m8 f48088c;
    public i0.c f48089c0;
    public k0 d;
    public final xe.b f48090d0;
    public nl0 f48091e;
    public final xe.b f48092e0;
    public final int f48093f;
    public cm0 h;
    public cm0 f48094n;
    public boolean f48095r;
    public org.telegram.ui.ActionBar.e6 f48096s;
    public final SparseIntArray f48097w;
    public final org.telegram.ui.ActionBar.r4 f48098x;
    public final org.telegram.ui.ActionBar.r4 f48099y;

    public im0() {
        super(null);
        this.f48093f = org.telegram.messenger.g0.L(6.0f);
        this.f48097w = new SparseIntArray();
        boolean q10 = org.telegram.ui.ActionBar.j6.I.q();
        this.T = q10;
        this.f48087b0 = q10;
        this.f48089c0 = i0.c.f15573e;
        xe.b bVar = new xe.b();
        this.f48090d0 = bVar;
        xe.b bVar2 = new xe.b();
        this.f48092e0 = bVar2;
        ui.c cVar = new ui.c();
        this.E = cVar;
        dh.c cVar2 = new dh.c(cVar, cVar, cVar);
        this.F = cVar2;
        ui.c cVar3 = new ui.c();
        this.G = cVar3;
        dh.c cVar4 = new dh.c(cVar3, cVar3, cVar3);
        this.H = cVar4;
        cVar2.f8094g = bVar;
        cVar2.f8093f = bVar2;
        cVar4.f8094g = bVar;
        cVar4.f8093f = bVar2;
        this.f48084a = false;
        di.v8.y(this.currentAccount, false).U();
        di.m8 m8Var = new di.m8(this.currentAccount, 0L, false);
        this.f48086b = m8Var;
        m8Var.g(8, false);
        m8Var.a();
        di.m8 m8Var2 = new di.m8(this.currentAccount, 0L, false);
        this.f48088c = m8Var2;
        m8Var2.g(8, false);
        m8Var2.f9046f = true;
        m8Var2.a();
        this.resourceProvider = new hj(this, 1);
        this.f48098x = new org.telegram.ui.ActionBar.r4(0, false, false, this.resourceProvider);
        this.f48099y = new org.telegram.ui.ActionBar.r4(0, false, true, this.resourceProvider);
    }

    public static int B0(int i7) {
        boolean z10;
        float f10;
        if (org.telegram.messenger.g0.B(i7) < 0.2f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f10 = 0.28f;
        } else {
            f10 = -0.28f;
        }
        return org.telegram.ui.ActionBar.j6.b(0.5f, f10, i7);
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

    public static void Z(im0 im0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, kl0 kl0Var, di.c5 c5Var, vf.b bVar) {
        zArr[0] = true;
        bVar.d();
        di.v8.x(im0Var.currentAccount, c5Var.f8303a).h(c5Var.f8304b, tL_starGiftUnique, j3, null, true, new bi.e4(21, bVar, kl0Var));
    }

    public static void a0(im0 im0Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, kl0 kl0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        di.c5 c5Var = new di.c5(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        di.e5 e5Var = new di.e5(im0Var.getParentActivity(), im0Var.resourceProvider, tL_starGiftUnique, c5Var, im0Var.currentAccount, j3, i5.c.l(tL_starGiftUnique.num, ',', sb2), false, new di.b3(im0Var, zArr, tL_starGiftUnique, j3, kl0Var, 1));
        e5Var.h.setOnDismissListener(new di.a3(12, zArr, kl0Var));
        e5Var.b();
    }

    public final void C0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.im0.C0():void");
    }

    public final void D0() {
        cg.b bVar;
        if (this.f48095r) {
            return;
        }
        if (this.f48084a) {
            finishFragment();
        } else if (!getUserConfig().q()) {
            showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) this, 23, true));
            return;
        }
        cm0 H0 = H0();
        if (H0.J != null) {
            cm0 cm0Var = this.h;
            if (H0 == cm0Var) {
                cm0Var = this.f48094n;
            }
            cm0Var.d();
            this.f48095r = true;
            this.R.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = H0.J;
            kl0 kl0Var = new kl0(this, 1);
            long e10 = org.telegram.messenger.m10.i(this.currentAccount).e();
            if (tL_starGiftUnique.resale_ton_only) {
                bVar = cg.b.f4988b;
            } else {
                bVar = cg.b.f4987a;
            }
            di.v8.x(this.currentAccount, bVar).H(tL_starGiftUnique, e10, null, true, new bi.u5(this, bVar, tL_starGiftUnique, e10, kl0Var));
            return;
        }
        cm0 cm0Var2 = this.h;
        if (H0 == cm0Var2) {
            cm0Var2 = this.f48094n;
        }
        if (cm0Var2.J != null) {
            cm0Var2.d();
        }
        C0();
        finishFragment();
        I0();
    }

    public final void E0() {
        this.E.a(getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
        this.P.invalidate();
        this.Q.invalidate();
        this.h.f46214x.invalidate();
        this.h.f46215y.invalidate();
        this.f48094n.f46214x.invalidate();
        this.h.f46191b.invalidate();
        this.f48094n.f46191b.invalidate();
        ((fh.g) this.P.getBackground()).updateColors();
        F0();
        Iterator it = this.f48092e0.iterator();
        while (it.hasNext()) {
            ((fh.g) it.next()).updateColors();
        }
    }

    public final void F0() {
        int themedColor;
        if (org.telegram.messenger.g0.B(getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6)) > 0.72d) {
            themedColor = i0.a.f(0.085f, getThemedColor(org.telegram.ui.ActionBar.j6.f28792a7), this.f48091e.getColor());
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f28792a7);
        }
        this.d.setBackgroundColor(themedColor);
        ui.c cVar = this.G;
        if (cVar.f58431b != themedColor) {
            cVar.a(themedColor);
            Iterator it = this.f48092e0.iterator();
            while (it.hasNext()) {
                ((fh.g) it.next()).updateColors();
            }
            Iterator it2 = this.f48090d0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final cm0 H0() {
        hi.i1 i1Var = this.J;
        if (i1Var != null && i1Var.getPositionAnimated() >= 0.5f) {
            return this.h;
        }
        return this.f48094n;
    }

    public final void I0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.im0.I0():void");
    }

    public final void J0() {
        org.telegram.ui.ActionBar.j5 j5Var = this.O;
        if (j5Var != null) {
            j5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.A8));
        }
        this.h.g();
        this.f48094n.g();
        nl0 nl0Var = this.f48091e;
        if (nl0Var != null) {
            nl0Var.f50310a = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, nl0Var.f50311b);
            nl0Var.a();
            nl0Var.invalidate();
        }
        K0();
        E0();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void K0() {
        float positionAnimated;
        if (this.f48091e != null) {
            F0();
            int tabsViewBackgroundColor = this.f48091e.getTabsViewBackgroundColor();
            if (this.N != null) {
                hi.i1 i1Var = this.J;
                if (i1Var == null) {
                    positionAnimated = 0.0f;
                } else {
                    positionAnimated = i1Var.getPositionAnimated();
                }
                float a10 = c8.i9.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f);
                org.telegram.ui.Components.ry ryVar = this.N;
                int f10 = i0.a.f(a10, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
                int f11 = i0.a.f(a10, -1, getThemedColor(org.telegram.ui.ActionBar.j6.f28792a7));
                int f12 = i0.a.f(a10, -1, getThemedColor(org.telegram.ui.ActionBar.j6.f29260z6));
                int f13 = i0.a.f(a10, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                ryVar.f39095a.setColor(f10);
                ryVar.f39096b.setColor(f11);
                ryVar.d = f12;
                ryVar.f39098e = f13;
                ryVar.invalidate();
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
        this.h = new cm0(this, context, 1);
        this.f48094n = new cm0(this, context, 0);
        nl0 nl0Var = new nl0(this, context, this.resourceProvider);
        this.f48091e = nl0Var;
        nl0Var.F = true;
        this.f48094n.j(false);
        this.f48094n.addView(this.f48091e, 2, c8.ja.e(-1, -2, 55));
        hi.i1 i1Var = new hi.i1(4, context, this);
        this.J = i1Var;
        i1Var.setAdapter(new li.x(this, 2));
        k0Var.addView(this.J, c8.ja.e(-1, -1, 119));
        hi.d dVar = new hi.d(context, getResourceProvider(), true);
        this.R = dVar;
        dVar.setStateListAnimator(null);
        this.R.f();
        this.R.d.r(true, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final im0 f49004b;

            {
                this.f49004b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                im0 im0Var = this.f49004b;
                switch (i11) {
                    case 0:
                        if (im0Var.onBackPressed(true)) {
                            im0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        im0 im0Var2 = this.f49004b;
                        FrameLayout frameLayout2 = (FrameLayout) im0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        im0Var2.L.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        im0Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        im0Var2.L.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f23604n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        bc bcVar = new bc(im0Var2, im0Var2.getParentActivity(), canvas, (im0Var2.L.getMeasuredWidth() / 2.0f) + f10, (im0Var2.L.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        im0Var2.Y = bcVar;
                        bcVar.setOnTouchListener(new gi.a(2));
                        im0Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        im0Var2.f48085a0 = ofFloat;
                        ofFloat.addUpdateListener(new hi.ba(im0Var2, 2));
                        im0Var2.f48085a0.addListener(new xx(im0Var2, 9));
                        im0Var2.f48085a0.setDuration(400L);
                        im0Var2.f48085a0.setInterpolator(org.telegram.ui.Components.qs.f38759e);
                        im0Var2.f48085a0.start();
                        frameLayout2.addView(im0Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.h3(new ef0(im0Var2, 13));
                        return;
                    default:
                        im0Var.D0();
                        return;
                }
            }
        });
        this.P.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.P.addView(this.R, c8.ja.c(-1.0f, -1));
        FrameLayout frameLayout2 = this.P;
        fh.g c10 = this.F.c(frameLayout2, null, false);
        c10.p(c8.g0.j(this.resourceProvider));
        c10.r(org.telegram.messenger.g0.L(28.0f));
        c10.q(org.telegram.messenger.g0.L(5.0f));
        frameLayout2.setBackground(c10);
        c8.na.b(this.P, 0.02f, 1.5f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Q = frameLayout3;
        frameLayout3.addView(this.P, c8.ja.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        dh.d dVar2 = new dh.d(this.H.c(this.Q, null, false));
        dVar2.b(org.telegram.messenger.g0.L(40.0f), true);
        dVar2.H = 220;
        this.Q.setBackground(dVar2);
        cm0 H0 = H0();
        hi.d dVar3 = this.R;
        if (dVar3 != null && H0 != null && H0 != this.S) {
            this.S = H0;
            ji.j jVar = H0.f46196e;
            dVar3.i((CharSequence) jVar.f17555b, false, true);
            this.R.g((SpannableStringBuilder) jVar.f17556c, false);
        }
        k0Var.addView(this.Q, c8.ja.e(-1, -2, 80));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.M = frameLayout4;
        k0Var.addView(frameLayout4, c8.ja.e(-1, -2, 55));
        boolean z10 = this.f48084a;
        if (!z10) {
            org.telegram.ui.Components.ry ryVar = new org.telegram.ui.Components.ry(context);
            this.N = ryVar;
            if (z10) {
                i7 = 2131752428;
            } else {
                i7 = 2131743746;
            }
            String M0 = org.telegram.messenger.hd.M0(i7, null);
            if (z10) {
                i10 = 2131752429;
            } else {
                i10 = 2131743747;
            }
            ryVar.setTabs(M0, org.telegram.messenger.hd.M0(i10, null));
            this.N.f39101r = new kl0(this, 0);
            K0();
            this.M.addView(this.N, c8.ja.e(-1, 40, 17));
        } else {
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
            this.O = j5Var;
            j5Var.l(org.telegram.messenger.hd.M0(2131752427, null), false);
            this.O.setEllipsizeByGradient(true);
            this.O.setTextSize(20);
            org.telegram.ui.ActionBar.q6.X(this.O, org.telegram.ui.ActionBar.j6.A8, getResourceProvider());
            this.O.setTypeface(org.telegram.messenger.g0.o());
            this.M.addView(this.O, c8.ja.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        }
        nl0 nl0Var2 = this.f48091e;
        if (nl0Var2 != null) {
            nl0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                org.telegram.messenger.g0.p3(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.K;
        int i11 = org.telegram.ui.ActionBar.j6.f29167u8;
        org.telegram.ui.ActionBar.q6.Q(imageView2, org.telegram.ui.ActionBar.j6.h0(getThemedColor(i11), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i11), getResourceProvider());
        this.K.setImageResource(2131231240);
        ImageView imageView3 = this.K;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) {
            public final im0 f49004b;

            {
                this.f49004b = this;
            }

            @Override
            public final void onClick(View view) {
                int i112 = r2;
                im0 im0Var = this.f49004b;
                switch (i112) {
                    case 0:
                        if (im0Var.onBackPressed(true)) {
                            im0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        im0 im0Var2 = this.f49004b;
                        FrameLayout frameLayout22 = (FrameLayout) im0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        im0Var2.L.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        im0Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        im0Var2.L.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f23604n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        bc bcVar = new bc(im0Var2, im0Var2.getParentActivity(), canvas, (im0Var2.L.getMeasuredWidth() / 2.0f) + f10, (im0Var2.L.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        im0Var2.Y = bcVar;
                        bcVar.setOnTouchListener(new gi.a(2));
                        im0Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        im0Var2.f48085a0 = ofFloat;
                        ofFloat.addUpdateListener(new hi.ba(im0Var2, 2));
                        im0Var2.f48085a0.addListener(new xx(im0Var2, 9));
                        im0Var2.f48085a0.setDuration(400L);
                        im0Var2.f48085a0.setInterpolator(org.telegram.ui.Components.qs.f38759e);
                        im0Var2.f48085a0.start();
                        frameLayout22.addView(im0Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.h3(new ef0(im0Var2, 13));
                        return;
                    default:
                        im0Var.D0();
                        return;
                }
            }
        });
        c8.na.a(this.K);
        this.M.addView(this.K, c8.ja.e(54, 54, 19));
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(2131624241, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.U = ch0Var;
        ch0Var.h = true;
        if (!this.T) {
            ch0Var.P(0);
            this.U.M(0);
        } else {
            ch0Var.M(35);
            this.U.P(36);
        }
        this.U.f33571a0 = true;
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.J9, false);
        this.U.Q(x02, "Sunny");
        this.U.Q(x02, "Path 6");
        this.U.Q(x02, "Path");
        this.U.Q(x02, "Path 5");
        this.U.o();
        ImageView imageView4 = new ImageView(context);
        this.L = imageView4;
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.q6.Q(this.L, org.telegram.ui.ActionBar.j6.h0(getThemedColor(i11), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i11), getResourceProvider());
        this.L.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.L.setOnClickListener(new View.OnClickListener(this) {
            public final im0 f49004b;

            {
                this.f49004b = this;
            }

            @Override
            public final void onClick(View view) {
                int i112 = r2;
                im0 im0Var = this.f49004b;
                switch (i112) {
                    case 0:
                        if (im0Var.onBackPressed(true)) {
                            im0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        im0 im0Var2 = this.f49004b;
                        FrameLayout frameLayout22 = (FrameLayout) im0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        im0Var2.L.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        im0Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        im0Var2.L.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f23604n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        bc bcVar = new bc(im0Var2, im0Var2.getParentActivity(), canvas, (im0Var2.L.getMeasuredWidth() / 2.0f) + f10, (im0Var2.L.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        im0Var2.Y = bcVar;
                        bcVar.setOnTouchListener(new gi.a(2));
                        im0Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        im0Var2.f48085a0 = ofFloat;
                        ofFloat.addUpdateListener(new hi.ba(im0Var2, 2));
                        im0Var2.f48085a0.addListener(new xx(im0Var2, 9));
                        im0Var2.f48085a0.setDuration(400L);
                        im0Var2.f48085a0.setInterpolator(org.telegram.ui.Components.qs.f38759e);
                        im0Var2.f48085a0.start();
                        frameLayout22.addView(im0Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.h3(new ef0(im0Var2, 13));
                        return;
                    default:
                        im0Var.D0();
                        return;
                }
            }
        });
        this.M.addView(this.L, c8.ja.e(54, 54, 21));
        this.L.setImageDrawable(this.U);
        nl0 nl0Var3 = this.f48091e;
        nl0Var3.getClass();
        nl0Var3.f50310a = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, nl0Var3.f50311b);
        nl0Var3.a();
        nl0Var3.invalidate();
        E0();
        F0();
        View view = this.fragmentView;
        ml0 ml0Var = new ml0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f55671a;
        r0.a0.i(view, ml0Var);
        return this.d;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i10 == this.currentAccount) {
            if (i7 == org.telegram.messenger.ns.f25497f5) {
                this.h.f(true);
                this.f48094n.f(true);
            } else if (i7 == org.telegram.messenger.ns.G3) {
                this.h.e();
                this.f48094n.e();
            } else if (i7 == org.telegram.messenger.ns.F3) {
                this.h.e();
                this.f48094n.e();
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.m3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.m3.f29381c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.oa.a(new g6(15, this), org.telegram.ui.ActionBar.j6.f28849d6, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.f29260z6, org.telegram.ui.ActionBar.j6.f28941i6, org.telegram.ui.ActionBar.j6.f28792a7, org.telegram.ui.ActionBar.j6.B6, org.telegram.ui.ActionBar.j6.f29070p7, org.telegram.ui.ActionBar.j6.f28887f6, org.telegram.ui.ActionBar.j6.f28904g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
    }

    @Override
    public final boolean isLightStatusBar() {
        nl0 nl0Var = this.f48091e;
        if (nl0Var == null) {
            return super.isLightStatusBar();
        }
        if (i0.a.h(nl0Var.getColor()) > 0.699999988079071d) {
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
        if (!this.f48084a && ((this.h.b() || this.f48094n.b()) && getUserConfig().q())) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i7;
        int i10;
        boolean z11 = this.f48084a;
        if (!z11 && ((this.h.b() || this.f48094n.b()) && getUserConfig().q())) {
            if (z10 && getVisibleDialog() == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                if (z11) {
                    i7 = 2131752426;
                } else {
                    i7 = 2131743745;
                }
                String M0 = org.telegram.messenger.hd.M0(i7, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                if (z11) {
                    i10 = 2131752425;
                } else {
                    i10 = 2131743744;
                }
                t1Var.U = org.telegram.messenger.hd.M0(i10, null);
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751369, null), new ml0(this, 1));
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754216, null), new ml0(this, 2));
                showDialog(t1Var);
                org.telegram.ui.ActionBar.q6.U((TextView) t1Var.d(-2), org.telegram.ui.ActionBar.j6.f29090q7, getResourceProvider());
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
        getNotificationCenter().c(this, org.telegram.messenger.ns.f25497f5);
        getNotificationCenter().c(this, org.telegram.messenger.ns.G3);
        getNotificationCenter().c(this, org.telegram.messenger.ns.F3);
        setBulletinDelegate(new bi.t(12));
        getMediaDataController().W0();
        if (org.telegram.messenger.np.s1(this.currentAccount).f25380r4 == null) {
            boolean z10 = org.telegram.messenger.r2.f26198a;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25497f5);
        getNotificationCenter().n(this, org.telegram.messenger.ns.G3);
        getNotificationCenter().n(this, org.telegram.messenger.ns.F3);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            if (this.h != null && this.f48094n != null) {
                J0();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.e6 e6Var) {
        this.f48096s = e6Var;
    }
}

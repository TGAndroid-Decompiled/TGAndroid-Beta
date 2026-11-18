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
public final class lm0 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public final ui.c E;
    public final dh.c F;
    public final ui.c G;
    public final dh.c H;
    public org.telegram.ui.ActionBar.h2 I;
    public hi.i1 J;
    public ImageView K;
    public ImageView L;
    public FrameLayout M;
    public org.telegram.ui.Components.xy N;
    public org.telegram.ui.ActionBar.n5 O;
    public FrameLayout P;
    public FrameLayout Q;
    public hi.d R;
    public fm0 S;
    public boolean T;
    public org.telegram.ui.Components.mh0 U;
    public boolean V;
    public boolean W;
    public boolean X;
    public bc Y;
    public float Z;
    public final boolean f49632a;
    public ValueAnimator f49633a0;
    public final di.o8 f49634b;
    public boolean f49635b0;
    public final di.o8 f49636c;
    public i0.b f49637c0;
    public k0 d;
    public final xe.b f49638d0;
    public ql0 f49639e;
    public final xe.b f49640e0;
    public final int f49641f;
    public fm0 h;
    public fm0 f49642n;
    public boolean f49643r;
    public org.telegram.ui.ActionBar.i6 f49644s;
    public final SparseIntArray f49645w;
    public final org.telegram.ui.ActionBar.v4 f49646x;
    public final org.telegram.ui.ActionBar.v4 f49647y;

    public lm0() {
        super(null);
        this.f49641f = org.telegram.messenger.g0.L(6.0f);
        this.f49645w = new SparseIntArray();
        boolean q10 = org.telegram.ui.ActionBar.n6.I.q();
        this.T = q10;
        this.f49635b0 = q10;
        this.f49637c0 = i0.b.f15891e;
        xe.b bVar = new xe.b();
        this.f49638d0 = bVar;
        xe.b bVar2 = new xe.b();
        this.f49640e0 = bVar2;
        ui.c cVar = new ui.c();
        this.E = cVar;
        dh.c cVar2 = new dh.c(cVar, cVar, cVar);
        this.F = cVar2;
        ui.c cVar3 = new ui.c();
        this.G = cVar3;
        dh.c cVar4 = new dh.c(cVar3, cVar3, cVar3);
        this.H = cVar4;
        cVar2.f8379g = bVar;
        cVar2.f8378f = bVar2;
        cVar4.f8379g = bVar;
        cVar4.f8378f = bVar2;
        this.f49632a = false;
        di.x8.y(this.currentAccount, false).T();
        di.o8 o8Var = new di.o8(this.currentAccount, 0L, false);
        this.f49634b = o8Var;
        o8Var.g(8, false);
        o8Var.a();
        di.o8 o8Var2 = new di.o8(this.currentAccount, 0L, false);
        this.f49636c = o8Var2;
        o8Var2.g(8, false);
        o8Var2.f9465f = true;
        o8Var2.a();
        this.resourceProvider = new ij(this, 1);
        this.f49646x = new org.telegram.ui.ActionBar.v4(0, false, false, this.resourceProvider);
        this.f49647y = new org.telegram.ui.ActionBar.v4(0, false, true, this.resourceProvider);
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
        return org.telegram.ui.ActionBar.n6.b(0.5f, f10, i7);
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

    public static void Z(lm0 lm0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, nl0 nl0Var, di.f5 f5Var, vf.b bVar) {
        zArr[0] = true;
        bVar.d();
        di.x8.x(lm0Var.currentAccount, f5Var.f8767a).h(f5Var.f8768b, tL_starGiftUnique, j3, null, true, new bi.m6(25, bVar, nl0Var));
    }

    public static void a0(lm0 lm0Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, nl0 nl0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        di.f5 f5Var = new di.f5(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        di.h5 h5Var = new di.h5(lm0Var.getParentActivity(), lm0Var.resourceProvider, tL_starGiftUnique, f5Var, lm0Var.currentAccount, j3, i5.c.l(tL_starGiftUnique.num, ',', sb2), false, new di.e3(lm0Var, zArr, tL_starGiftUnique, j3, nl0Var, 1));
        h5Var.h.setOnDismissListener(new di.u1(10, zArr, nl0Var));
        h5Var.b();
    }

    public final void C0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lm0.C0():void");
    }

    public final void D0() {
        cg.b bVar;
        if (this.f49643r) {
            return;
        }
        if (this.f49632a) {
            finishFragment();
        } else if (!getUserConfig().q()) {
            showDialog(new ug.z0((org.telegram.ui.ActionBar.h2) this, 23, true));
            return;
        }
        fm0 H0 = H0();
        if (H0.J != null) {
            fm0 fm0Var = this.h;
            if (H0 == fm0Var) {
                fm0Var = this.f49642n;
            }
            fm0Var.d();
            this.f49643r = true;
            this.R.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = H0.J;
            nl0 nl0Var = new nl0(this, 1);
            long e10 = org.telegram.messenger.j10.i(this.currentAccount).e();
            if (tL_starGiftUnique.resale_ton_only) {
                bVar = cg.b.f5277b;
            } else {
                bVar = cg.b.f5276a;
            }
            di.x8.x(this.currentAccount, bVar).H(tL_starGiftUnique, e10, null, true, new bi.b8(this, bVar, tL_starGiftUnique, e10, nl0Var));
            return;
        }
        fm0 fm0Var2 = this.h;
        if (H0 == fm0Var2) {
            fm0Var2 = this.f49642n;
        }
        if (fm0Var2.J != null) {
            fm0Var2.d();
        }
        C0();
        finishFragment();
        I0();
    }

    public final void E0() {
        this.E.a(getThemedColor(org.telegram.ui.ActionBar.n6.f29396d6));
        this.P.invalidate();
        this.Q.invalidate();
        this.h.f47755x.invalidate();
        this.h.f47756y.invalidate();
        this.f49642n.f47755x.invalidate();
        this.h.f47732b.invalidate();
        this.f49642n.f47732b.invalidate();
        ((fh.g) this.P.getBackground()).updateColors();
        F0();
        Iterator it = this.f49640e0.iterator();
        while (it.hasNext()) {
            ((fh.g) it.next()).updateColors();
        }
    }

    public final void F0() {
        int themedColor;
        if (org.telegram.messenger.g0.B(getThemedColor(org.telegram.ui.ActionBar.n6.f29396d6)) > 0.72d) {
            themedColor = i0.a.f(0.085f, getThemedColor(org.telegram.ui.ActionBar.n6.f29339a7), this.f49639e.getColor());
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.f29339a7);
        }
        this.d.setBackgroundColor(themedColor);
        ui.c cVar = this.G;
        if (cVar.f58998b != themedColor) {
            cVar.a(themedColor);
            Iterator it = this.f49640e0.iterator();
            while (it.hasNext()) {
                ((fh.g) it.next()).updateColors();
            }
            Iterator it2 = this.f49638d0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final fm0 H0() {
        hi.i1 i1Var = this.J;
        if (i1Var != null && i1Var.getPositionAnimated() >= 0.5f) {
            return this.h;
        }
        return this.f49642n;
    }

    public final void I0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lm0.I0():void");
    }

    public final void J0() {
        org.telegram.ui.ActionBar.n5 n5Var = this.O;
        if (n5Var != null) {
            n5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.n6.A8));
        }
        this.h.g();
        this.f49642n.g();
        ql0 ql0Var = this.f49639e;
        if (ql0Var != null) {
            ql0Var.f52020a = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29339a7, ql0Var.f52021b);
            ql0Var.a();
            ql0Var.invalidate();
        }
        K0();
        E0();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void K0() {
        float positionAnimated;
        if (this.f49639e != null) {
            F0();
            int tabsViewBackgroundColor = this.f49639e.getTabsViewBackgroundColor();
            if (this.N != null) {
                hi.i1 i1Var = this.J;
                if (i1Var == null) {
                    positionAnimated = 0.0f;
                } else {
                    positionAnimated = i1Var.getPositionAnimated();
                }
                float a10 = c8.l9.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f);
                org.telegram.ui.Components.xy xyVar = this.N;
                int f10 = i0.a.f(a10, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.n6.f29396d6));
                int f11 = i0.a.f(a10, -1, getThemedColor(org.telegram.ui.ActionBar.n6.f29339a7));
                int f12 = i0.a.f(a10, -1, getThemedColor(org.telegram.ui.ActionBar.n6.f29807z6));
                int f13 = i0.a.f(a10, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.n6.G6));
                xyVar.f42211a.setColor(f10);
                xyVar.f42212b.setColor(f11);
                xyVar.d = f12;
                xyVar.f42214e = f13;
                xyVar.invalidate();
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
        this.h = new fm0(this, context, 1);
        this.f49642n = new fm0(this, context, 0);
        ql0 ql0Var = new ql0(this, context, this.resourceProvider);
        this.f49639e = ql0Var;
        ql0Var.F = true;
        this.f49642n.j(false);
        this.f49642n.addView(this.f49639e, 2, c8.ma.e(-1, -2, 55));
        hi.i1 i1Var = new hi.i1(4, context, this);
        this.J = i1Var;
        i1Var.setAdapter(new li.x(this, 2));
        k0Var.addView(this.J, c8.ma.e(-1, -1, 119));
        hi.d dVar = new hi.d(context, getResourceProvider(), true);
        this.R = dVar;
        dVar.setStateListAnimator(null);
        this.R.f();
        this.R.d.r(true, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final lm0 f50628b;

            {
                this.f50628b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                lm0 lm0Var = this.f50628b;
                switch (i11) {
                    case 0:
                        if (lm0Var.onBackPressed(true)) {
                            lm0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        lm0 lm0Var2 = this.f50628b;
                        FrameLayout frameLayout2 = (FrameLayout) lm0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        lm0Var2.L.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        lm0Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        lm0Var2.L.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f24116n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        bc bcVar = new bc(lm0Var2, lm0Var2.getParentActivity(), canvas, (lm0Var2.L.getMeasuredWidth() / 2.0f) + f10, (lm0Var2.L.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        lm0Var2.Y = bcVar;
                        bcVar.setOnTouchListener(new gi.a(2));
                        lm0Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        lm0Var2.f49633a0 = ofFloat;
                        ofFloat.addUpdateListener(new hi.ca(lm0Var2, 2));
                        lm0Var2.f49633a0.addListener(new ay(lm0Var2, 9));
                        lm0Var2.f49633a0.setDuration(400L);
                        lm0Var2.f49633a0.setInterpolator(org.telegram.ui.Components.xs.f42178e);
                        lm0Var2.f49633a0.start();
                        frameLayout2.addView(lm0Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.g3(new hf0(lm0Var2, 13));
                        return;
                    default:
                        lm0Var.D0();
                        return;
                }
            }
        });
        this.P.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.P.addView(this.R, c8.ma.c(-1.0f, -1));
        FrameLayout frameLayout2 = this.P;
        fh.g c10 = this.F.c(frameLayout2, null, false);
        c10.p(c8.i0.k(this.resourceProvider));
        c10.r(org.telegram.messenger.g0.L(28.0f));
        c10.q(org.telegram.messenger.g0.L(5.0f));
        frameLayout2.setBackground(c10);
        c8.ra.b(this.P, 0.02f, 1.5f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Q = frameLayout3;
        frameLayout3.addView(this.P, c8.ma.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        dh.d dVar2 = new dh.d(this.H.c(this.Q, null, false));
        dVar2.b(org.telegram.messenger.g0.L(40.0f), true);
        dVar2.H = 220;
        this.Q.setBackground(dVar2);
        fm0 H0 = H0();
        hi.d dVar3 = this.R;
        if (dVar3 != null && H0 != null && H0 != this.S) {
            this.S = H0;
            ji.j jVar = H0.f47737e;
            dVar3.i((CharSequence) jVar.f17948b, false, true);
            this.R.g((SpannableStringBuilder) jVar.f17949c, false);
        }
        k0Var.addView(this.Q, c8.ma.e(-1, -2, 80));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.M = frameLayout4;
        k0Var.addView(frameLayout4, c8.ma.e(-1, -2, 55));
        boolean z10 = this.f49632a;
        if (!z10) {
            org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context);
            this.N = xyVar;
            if (z10) {
                i7 = 2131752417;
            } else {
                i7 = 2131743509;
            }
            String M0 = org.telegram.messenger.gd.M0(i7, null);
            if (z10) {
                i10 = 2131752418;
            } else {
                i10 = 2131743510;
            }
            xyVar.setTabs(M0, org.telegram.messenger.gd.M0(i10, null));
            this.N.f42217r = new nl0(this, 0);
            K0();
            this.M.addView(this.N, c8.ma.e(-1, 40, 17));
        } else {
            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
            this.O = n5Var;
            n5Var.l(org.telegram.messenger.gd.M0(2131752416, null), false);
            this.O.setEllipsizeByGradient(true);
            this.O.setTextSize(20);
            org.telegram.ui.ActionBar.u6.X(this.O, org.telegram.ui.ActionBar.n6.A8, getResourceProvider());
            this.O.setTypeface(org.telegram.messenger.g0.o());
            this.M.addView(this.O, c8.ma.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        }
        ql0 ql0Var2 = this.f49639e;
        if (ql0Var2 != null) {
            ql0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                org.telegram.messenger.g0.o3(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.K;
        int i11 = org.telegram.ui.ActionBar.n6.f29714u8;
        org.telegram.ui.ActionBar.u6.Q(imageView2, org.telegram.ui.ActionBar.n6.h0(getThemedColor(i11), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i11), getResourceProvider());
        this.K.setImageResource(2131231240);
        ImageView imageView3 = this.K;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) {
            public final lm0 f50628b;

            {
                this.f50628b = this;
            }

            @Override
            public final void onClick(View view) {
                int i112 = r2;
                lm0 lm0Var = this.f50628b;
                switch (i112) {
                    case 0:
                        if (lm0Var.onBackPressed(true)) {
                            lm0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        lm0 lm0Var2 = this.f50628b;
                        FrameLayout frameLayout22 = (FrameLayout) lm0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        lm0Var2.L.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        lm0Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        lm0Var2.L.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f24116n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        bc bcVar = new bc(lm0Var2, lm0Var2.getParentActivity(), canvas, (lm0Var2.L.getMeasuredWidth() / 2.0f) + f10, (lm0Var2.L.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        lm0Var2.Y = bcVar;
                        bcVar.setOnTouchListener(new gi.a(2));
                        lm0Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        lm0Var2.f49633a0 = ofFloat;
                        ofFloat.addUpdateListener(new hi.ca(lm0Var2, 2));
                        lm0Var2.f49633a0.addListener(new ay(lm0Var2, 9));
                        lm0Var2.f49633a0.setDuration(400L);
                        lm0Var2.f49633a0.setInterpolator(org.telegram.ui.Components.xs.f42178e);
                        lm0Var2.f49633a0.start();
                        frameLayout22.addView(lm0Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.g3(new hf0(lm0Var2, 13));
                        return;
                    default:
                        lm0Var.D0();
                        return;
                }
            }
        });
        c8.ra.a(this.K);
        this.M.addView(this.K, c8.ma.e(54, 54, 19));
        org.telegram.ui.Components.mh0 mh0Var = new org.telegram.ui.Components.mh0(2131624241, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.U = mh0Var;
        mh0Var.h = true;
        if (!this.T) {
            mh0Var.P(0);
            this.U.M(0);
        } else {
            mh0Var.M(35);
            this.U.P(36);
        }
        this.U.f37480a0 = true;
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.J9, false);
        this.U.Q(x02, "Sunny");
        this.U.Q(x02, "Path 6");
        this.U.Q(x02, "Path");
        this.U.Q(x02, "Path 5");
        this.U.o();
        ImageView imageView4 = new ImageView(context);
        this.L = imageView4;
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.u6.Q(this.L, org.telegram.ui.ActionBar.n6.h0(getThemedColor(i11), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i11), getResourceProvider());
        this.L.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.L.setOnClickListener(new View.OnClickListener(this) {
            public final lm0 f50628b;

            {
                this.f50628b = this;
            }

            @Override
            public final void onClick(View view) {
                int i112 = r2;
                lm0 lm0Var = this.f50628b;
                switch (i112) {
                    case 0:
                        if (lm0Var.onBackPressed(true)) {
                            lm0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        lm0 lm0Var2 = this.f50628b;
                        FrameLayout frameLayout22 = (FrameLayout) lm0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        lm0Var2.L.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        lm0Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        lm0Var2.L.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f24116n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        bc bcVar = new bc(lm0Var2, lm0Var2.getParentActivity(), canvas, (lm0Var2.L.getMeasuredWidth() / 2.0f) + f10, (lm0Var2.L.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        lm0Var2.Y = bcVar;
                        bcVar.setOnTouchListener(new gi.a(2));
                        lm0Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        lm0Var2.f49633a0 = ofFloat;
                        ofFloat.addUpdateListener(new hi.ca(lm0Var2, 2));
                        lm0Var2.f49633a0.addListener(new ay(lm0Var2, 9));
                        lm0Var2.f49633a0.setDuration(400L);
                        lm0Var2.f49633a0.setInterpolator(org.telegram.ui.Components.xs.f42178e);
                        lm0Var2.f49633a0.start();
                        frameLayout22.addView(lm0Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.g3(new hf0(lm0Var2, 13));
                        return;
                    default:
                        lm0Var.D0();
                        return;
                }
            }
        });
        this.M.addView(this.L, c8.ma.e(54, 54, 21));
        this.L.setImageDrawable(this.U);
        ql0 ql0Var3 = this.f49639e;
        ql0Var3.getClass();
        ql0Var3.f52020a = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29339a7, ql0Var3.f52021b);
        ql0Var3.a();
        ql0Var3.invalidate();
        E0();
        F0();
        View view = this.fragmentView;
        pl0 pl0Var = new pl0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f56244a;
        r0.a0.i(view, pl0Var);
        return this.d;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i10 == this.currentAccount) {
            if (i7 == org.telegram.messenger.ks.f25129h5) {
                this.h.f(true);
                this.f49642n.f(true);
            } else if (i7 == org.telegram.messenger.ks.I3) {
                this.h.e();
                this.f49642n.e();
            } else if (i7 == org.telegram.messenger.ks.H3) {
                this.h.e();
                this.f49642n.e();
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.q3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.q3.f29902c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.sa.a(new f6(15, this), org.telegram.ui.ActionBar.n6.f29396d6, org.telegram.ui.ActionBar.n6.G6, org.telegram.ui.ActionBar.n6.f29807z6, org.telegram.ui.ActionBar.n6.f29488i6, org.telegram.ui.ActionBar.n6.f29339a7, org.telegram.ui.ActionBar.n6.B6, org.telegram.ui.ActionBar.n6.f29617p7, org.telegram.ui.ActionBar.n6.f29434f6, org.telegram.ui.ActionBar.n6.f29451g6, org.telegram.ui.ActionBar.n6.O6, org.telegram.ui.ActionBar.n6.P6, org.telegram.ui.ActionBar.n6.Q6, org.telegram.ui.ActionBar.n6.R6);
    }

    @Override
    public final boolean isLightStatusBar() {
        ql0 ql0Var = this.f49639e;
        if (ql0Var == null) {
            return super.isLightStatusBar();
        }
        if (i0.a.h(ql0Var.getColor()) > 0.699999988079071d) {
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
        if (!this.f49632a && ((this.h.b() || this.f49642n.b()) && getUserConfig().q())) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i7;
        int i10;
        boolean z11 = this.f49632a;
        if (!z11 && ((this.h.b() || this.f49642n.b()) && getUserConfig().q())) {
            if (z10 && getVisibleDialog() == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                if (z11) {
                    i7 = 2131752415;
                } else {
                    i7 = 2131743508;
                }
                String M0 = org.telegram.messenger.gd.M0(i7, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                u1Var.S = M0;
                if (z11) {
                    i10 = 2131752414;
                } else {
                    i10 = 2131743507;
                }
                u1Var.U = org.telegram.messenger.gd.M0(i10, null);
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131751358, null), new pl0(this, 1));
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131754214, null), new pl0(this, 2));
                showDialog(u1Var);
                org.telegram.ui.ActionBar.u6.U((TextView) u1Var.d(-2), org.telegram.ui.ActionBar.n6.f29637q7, getResourceProvider());
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
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25129h5);
        getNotificationCenter().c(this, org.telegram.messenger.ks.I3);
        getNotificationCenter().c(this, org.telegram.messenger.ks.H3);
        setBulletinDelegate(new bi.t(12));
        getMediaDataController().Z0();
        if (org.telegram.messenger.mp.u1(this.currentAccount).f25769t4 == null) {
            boolean z10 = org.telegram.messenger.s2.f26723a;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25129h5);
        getNotificationCenter().n(this, org.telegram.messenger.ks.I3);
        getNotificationCenter().n(this, org.telegram.messenger.ks.H3);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            if (this.h != null && this.f49642n != null) {
                J0();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.i6 i6Var) {
        this.f49644s = i6Var;
    }
}

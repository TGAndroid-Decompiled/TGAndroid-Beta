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
public final class jm0 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public final ui.c E;
    public final dh.c F;
    public final ui.c G;
    public final dh.c H;
    public org.telegram.ui.ActionBar.g2 I;
    public hi.q1 J;
    public ImageView K;
    public ImageView L;
    public FrameLayout M;
    public org.telegram.ui.Components.wy N;
    public org.telegram.ui.ActionBar.n5 O;
    public FrameLayout P;
    public FrameLayout Q;
    public hi.e R;
    public dm0 S;
    public boolean T;
    public org.telegram.ui.Components.nh0 U;
    public boolean V;
    public boolean W;
    public boolean X;
    public bc Y;
    public float Z;
    public final boolean f49154a;
    public ValueAnimator f49155a0;
    public final di.p8 f49156b;
    public boolean f49157b0;
    public final di.p8 f49158c;
    public i0.b f49159c0;
    public k0 d;
    public final xe.b f49160d0;
    public ol0 f49161e;
    public final xe.b f49162e0;
    public final int f49163f;
    public dm0 h;
    public dm0 f49164n;
    public boolean f49165r;
    public org.telegram.ui.ActionBar.i6 f49166s;
    public final SparseIntArray f49167w;
    public final org.telegram.ui.ActionBar.u4 f49168x;
    public final org.telegram.ui.ActionBar.u4 f49169y;

    public jm0() {
        super(null);
        this.f49163f = org.telegram.messenger.g0.L(6.0f);
        this.f49167w = new SparseIntArray();
        boolean q10 = org.telegram.ui.ActionBar.n6.I.q();
        this.T = q10;
        this.f49157b0 = q10;
        this.f49159c0 = i0.b.f15977e;
        xe.b bVar = new xe.b();
        this.f49160d0 = bVar;
        xe.b bVar2 = new xe.b();
        this.f49162e0 = bVar2;
        ui.c cVar = new ui.c();
        this.E = cVar;
        dh.c cVar2 = new dh.c(cVar, cVar, cVar);
        this.F = cVar2;
        ui.c cVar3 = new ui.c();
        this.G = cVar3;
        dh.c cVar4 = new dh.c(cVar3, cVar3, cVar3);
        this.H = cVar4;
        cVar2.f8370g = bVar;
        cVar2.f8369f = bVar2;
        cVar4.f8370g = bVar;
        cVar4.f8369f = bVar2;
        this.f49154a = false;
        di.y8.y(this.currentAccount, false).T();
        di.p8 p8Var = new di.p8(this.currentAccount, 0L, false);
        this.f49156b = p8Var;
        p8Var.g(8, false);
        p8Var.a();
        di.p8 p8Var2 = new di.p8(this.currentAccount, 0L, false);
        this.f49158c = p8Var2;
        p8Var2.g(8, false);
        p8Var2.f9508f = true;
        p8Var2.a();
        this.resourceProvider = new ij(this, 1);
        this.f49168x = new org.telegram.ui.ActionBar.u4(0, false, false, this.resourceProvider);
        this.f49169y = new org.telegram.ui.ActionBar.u4(0, false, true, this.resourceProvider);
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

    public static void Z(jm0 jm0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, ll0 ll0Var, di.f5 f5Var, vf.b bVar) {
        zArr[0] = true;
        bVar.d();
        di.y8.x(jm0Var.currentAccount, f5Var.f8752a).h(f5Var.f8753b, tL_starGiftUnique, j3, null, true, new bi.r6(25, bVar, ll0Var));
    }

    public static void a0(jm0 jm0Var, cg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, ll0 ll0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        di.f5 f5Var = new di.f5(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        di.h5 h5Var = new di.h5(jm0Var.getParentActivity(), jm0Var.resourceProvider, tL_starGiftUnique, f5Var, jm0Var.currentAccount, j3, i5.c.l(tL_starGiftUnique.num, ',', sb2), false, new di.e3(jm0Var, zArr, tL_starGiftUnique, j3, ll0Var, 1));
        h5Var.h.setOnDismissListener(new di.u1(10, zArr, ll0Var));
        h5Var.b();
    }

    public final void C0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jm0.C0():void");
    }

    public final void D0() {
        cg.b bVar;
        if (this.f49165r) {
            return;
        }
        if (this.f49154a) {
            finishFragment();
        } else if (!getUserConfig().q()) {
            showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) this, 23, true));
            return;
        }
        dm0 H0 = H0();
        if (H0.J != null) {
            dm0 dm0Var = this.h;
            if (H0 == dm0Var) {
                dm0Var = this.f49164n;
            }
            dm0Var.d();
            this.f49165r = true;
            this.R.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = H0.J;
            ll0 ll0Var = new ll0(this, 1);
            long e10 = org.telegram.messenger.i10.i(this.currentAccount).e();
            if (tL_starGiftUnique.resale_ton_only) {
                bVar = cg.b.f5269b;
            } else {
                bVar = cg.b.f5268a;
            }
            di.y8.x(this.currentAccount, bVar).H(tL_starGiftUnique, e10, null, true, new bi.g8(this, bVar, tL_starGiftUnique, e10, ll0Var));
            return;
        }
        dm0 dm0Var2 = this.h;
        if (H0 == dm0Var2) {
            dm0Var2 = this.f49164n;
        }
        if (dm0Var2.J != null) {
            dm0Var2.d();
        }
        C0();
        finishFragment();
        I0();
    }

    public final void E0() {
        this.E.a(getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6));
        this.P.invalidate();
        this.Q.invalidate();
        this.h.f47189x.invalidate();
        this.h.f47190y.invalidate();
        this.f49164n.f47189x.invalidate();
        this.h.f47166b.invalidate();
        this.f49164n.f47166b.invalidate();
        ((fh.g) this.P.getBackground()).updateColors();
        F0();
        Iterator it = this.f49162e0.iterator();
        while (it.hasNext()) {
            ((fh.g) it.next()).updateColors();
        }
    }

    public final void F0() {
        int themedColor;
        if (org.telegram.messenger.g0.B(getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6)) > 0.72d) {
            themedColor = i0.a.f(0.085f, getThemedColor(org.telegram.ui.ActionBar.n6.f29394a7), this.f49161e.getColor());
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.f29394a7);
        }
        this.d.setBackgroundColor(themedColor);
        ui.c cVar = this.G;
        if (cVar.f59123b != themedColor) {
            cVar.a(themedColor);
            Iterator it = this.f49162e0.iterator();
            while (it.hasNext()) {
                ((fh.g) it.next()).updateColors();
            }
            Iterator it2 = this.f49160d0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final dm0 H0() {
        hi.q1 q1Var = this.J;
        if (q1Var != null && q1Var.getPositionAnimated() >= 0.5f) {
            return this.h;
        }
        return this.f49164n;
    }

    public final void I0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jm0.I0():void");
    }

    public final void J0() {
        org.telegram.ui.ActionBar.n5 n5Var = this.O;
        if (n5Var != null) {
            n5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.n6.A8));
        }
        this.h.g();
        this.f49164n.g();
        ol0 ol0Var = this.f49161e;
        if (ol0Var != null) {
            ol0Var.f51482a = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394a7, ol0Var.f51483b);
            ol0Var.a();
            ol0Var.invalidate();
        }
        K0();
        E0();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void K0() {
        float positionAnimated;
        if (this.f49161e != null) {
            F0();
            int tabsViewBackgroundColor = this.f49161e.getTabsViewBackgroundColor();
            if (this.N != null) {
                hi.q1 q1Var = this.J;
                if (q1Var == null) {
                    positionAnimated = 0.0f;
                } else {
                    positionAnimated = q1Var.getPositionAnimated();
                }
                float a10 = c8.m9.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f);
                org.telegram.ui.Components.wy wyVar = this.N;
                int f10 = i0.a.f(a10, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6));
                int f11 = i0.a.f(a10, -1, getThemedColor(org.telegram.ui.ActionBar.n6.f29394a7));
                int f12 = i0.a.f(a10, -1, getThemedColor(org.telegram.ui.ActionBar.n6.f29862z6));
                int f13 = i0.a.f(a10, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.n6.G6));
                wyVar.f41753a.setColor(f10);
                wyVar.f41754b.setColor(f11);
                wyVar.d = f12;
                wyVar.f41756e = f13;
                wyVar.invalidate();
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
        this.h = new dm0(this, context, 1);
        this.f49164n = new dm0(this, context, 0);
        ol0 ol0Var = new ol0(this, context, this.resourceProvider);
        this.f49161e = ol0Var;
        ol0Var.F = true;
        this.f49164n.j(false);
        this.f49164n.addView(this.f49161e, 2, c8.na.e(-1, -2, 55));
        hi.q1 q1Var = new hi.q1(4, context, this);
        this.J = q1Var;
        q1Var.setAdapter(new li.w(this, 2));
        k0Var.addView(this.J, c8.na.e(-1, -1, 119));
        hi.e eVar = new hi.e(context, getResourceProvider(), true);
        this.R = eVar;
        eVar.setStateListAnimator(null);
        this.R.f();
        this.R.d.r(true, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final jm0 f50078b;

            {
                this.f50078b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                jm0 jm0Var = this.f50078b;
                switch (i11) {
                    case 0:
                        if (jm0Var.onBackPressed(true)) {
                            jm0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        jm0 jm0Var2 = this.f50078b;
                        FrameLayout frameLayout2 = (FrameLayout) jm0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        jm0Var2.L.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        jm0Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        jm0Var2.L.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f24221n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        bc bcVar = new bc(jm0Var2, jm0Var2.getParentActivity(), canvas, (jm0Var2.L.getMeasuredWidth() / 2.0f) + f10, (jm0Var2.L.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        jm0Var2.Y = bcVar;
                        bcVar.setOnTouchListener(new gi.a(2));
                        jm0Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        jm0Var2.f49155a0 = ofFloat;
                        ofFloat.addUpdateListener(new hi.wa(jm0Var2, 2));
                        jm0Var2.f49155a0.addListener(new zx(jm0Var2, 9));
                        jm0Var2.f49155a0.setDuration(400L);
                        jm0Var2.f49155a0.setInterpolator(org.telegram.ui.Components.ws.f41716e);
                        jm0Var2.f49155a0.start();
                        frameLayout2.addView(jm0Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.g3(new gf0(jm0Var2, 13));
                        return;
                    default:
                        jm0Var.D0();
                        return;
                }
            }
        });
        this.P.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.P.addView(this.R, c8.na.c(-1.0f, -1));
        FrameLayout frameLayout2 = this.P;
        fh.g c10 = this.F.c(frameLayout2, null, false);
        c10.p(c8.j0.k(this.resourceProvider));
        c10.r(org.telegram.messenger.g0.L(28.0f));
        c10.q(org.telegram.messenger.g0.L(5.0f));
        frameLayout2.setBackground(c10);
        c8.sa.b(this.P, 0.02f, 1.5f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Q = frameLayout3;
        frameLayout3.addView(this.P, c8.na.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        dh.d dVar = new dh.d(this.H.c(this.Q, null, false));
        dVar.b(org.telegram.messenger.g0.L(40.0f), true);
        dVar.H = 220;
        this.Q.setBackground(dVar);
        dm0 H0 = H0();
        hi.e eVar2 = this.R;
        if (eVar2 != null && H0 != null && H0 != this.S) {
            this.S = H0;
            j6.k kVar = H0.f47171e;
            eVar2.i((CharSequence) kVar.f17343b, false, true);
            this.R.g((SpannableStringBuilder) kVar.f17344c, false);
        }
        k0Var.addView(this.Q, c8.na.e(-1, -2, 80));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.M = frameLayout4;
        k0Var.addView(frameLayout4, c8.na.e(-1, -2, 55));
        boolean z10 = this.f49154a;
        if (!z10) {
            org.telegram.ui.Components.wy wyVar = new org.telegram.ui.Components.wy(context);
            this.N = wyVar;
            if (z10) {
                i7 = 2131752416;
            } else {
                i7 = 2131743499;
            }
            String N0 = org.telegram.messenger.gd.N0(i7, null);
            if (z10) {
                i10 = 2131752417;
            } else {
                i10 = 2131743500;
            }
            wyVar.setTabs(N0, org.telegram.messenger.gd.N0(i10, null));
            this.N.f41759r = new ll0(this, 0);
            K0();
            this.M.addView(this.N, c8.na.e(-1, 40, 17));
        } else {
            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
            this.O = n5Var;
            n5Var.l(org.telegram.messenger.gd.N0(2131752415, null), false);
            this.O.setEllipsizeByGradient(true);
            this.O.setTextSize(20);
            org.telegram.ui.ActionBar.u6.X(this.O, org.telegram.ui.ActionBar.n6.A8, getResourceProvider());
            this.O.setTypeface(org.telegram.messenger.g0.o());
            this.M.addView(this.O, c8.na.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        }
        ol0 ol0Var2 = this.f49161e;
        if (ol0Var2 != null) {
            ol0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                org.telegram.messenger.g0.o3(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.K;
        int i11 = org.telegram.ui.ActionBar.n6.f29769u8;
        org.telegram.ui.ActionBar.u6.Q(imageView2, org.telegram.ui.ActionBar.n6.h0(getThemedColor(i11), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i11), getResourceProvider());
        this.K.setImageResource(2131231243);
        ImageView imageView3 = this.K;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) {
            public final jm0 f50078b;

            {
                this.f50078b = this;
            }

            @Override
            public final void onClick(View view) {
                int i112 = r2;
                jm0 jm0Var = this.f50078b;
                switch (i112) {
                    case 0:
                        if (jm0Var.onBackPressed(true)) {
                            jm0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        jm0 jm0Var2 = this.f50078b;
                        FrameLayout frameLayout22 = (FrameLayout) jm0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        jm0Var2.L.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        jm0Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        jm0Var2.L.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f24221n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        bc bcVar = new bc(jm0Var2, jm0Var2.getParentActivity(), canvas, (jm0Var2.L.getMeasuredWidth() / 2.0f) + f10, (jm0Var2.L.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        jm0Var2.Y = bcVar;
                        bcVar.setOnTouchListener(new gi.a(2));
                        jm0Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        jm0Var2.f49155a0 = ofFloat;
                        ofFloat.addUpdateListener(new hi.wa(jm0Var2, 2));
                        jm0Var2.f49155a0.addListener(new zx(jm0Var2, 9));
                        jm0Var2.f49155a0.setDuration(400L);
                        jm0Var2.f49155a0.setInterpolator(org.telegram.ui.Components.ws.f41716e);
                        jm0Var2.f49155a0.start();
                        frameLayout22.addView(jm0Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.g3(new gf0(jm0Var2, 13));
                        return;
                    default:
                        jm0Var.D0();
                        return;
                }
            }
        });
        c8.sa.a(this.K);
        this.M.addView(this.K, c8.na.e(54, 54, 19));
        org.telegram.ui.Components.nh0 nh0Var = new org.telegram.ui.Components.nh0(2131624241, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.U = nh0Var;
        nh0Var.h = true;
        if (!this.T) {
            nh0Var.P(0);
            this.U.M(0);
        } else {
            nh0Var.M(35);
            this.U.P(36);
        }
        this.U.f37799a0 = true;
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
            public final jm0 f50078b;

            {
                this.f50078b = this;
            }

            @Override
            public final void onClick(View view) {
                int i112 = r2;
                jm0 jm0Var = this.f50078b;
                switch (i112) {
                    case 0:
                        if (jm0Var.onBackPressed(true)) {
                            jm0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        jm0 jm0Var2 = this.f50078b;
                        FrameLayout frameLayout22 = (FrameLayout) jm0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        jm0Var2.L.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        jm0Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        jm0Var2.L.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f24221n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        bc bcVar = new bc(jm0Var2, jm0Var2.getParentActivity(), canvas, (jm0Var2.L.getMeasuredWidth() / 2.0f) + f10, (jm0Var2.L.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        jm0Var2.Y = bcVar;
                        bcVar.setOnTouchListener(new gi.a(2));
                        jm0Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        jm0Var2.f49155a0 = ofFloat;
                        ofFloat.addUpdateListener(new hi.wa(jm0Var2, 2));
                        jm0Var2.f49155a0.addListener(new zx(jm0Var2, 9));
                        jm0Var2.f49155a0.setDuration(400L);
                        jm0Var2.f49155a0.setInterpolator(org.telegram.ui.Components.ws.f41716e);
                        jm0Var2.f49155a0.start();
                        frameLayout22.addView(jm0Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.g3(new gf0(jm0Var2, 13));
                        return;
                    default:
                        jm0Var.D0();
                        return;
                }
            }
        });
        this.M.addView(this.L, c8.na.e(54, 54, 21));
        this.L.setImageDrawable(this.U);
        ol0 ol0Var3 = this.f49161e;
        ol0Var3.getClass();
        ol0Var3.f51482a = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394a7, ol0Var3.f51483b);
        ol0Var3.a();
        ol0Var3.invalidate();
        E0();
        F0();
        View view = this.fragmentView;
        nl0 nl0Var = new nl0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f56367a;
        r0.a0.i(view, nl0Var);
        return this.d;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i10 == this.currentAccount) {
            if (i7 == org.telegram.messenger.ks.f25232i5) {
                this.h.f(true);
                this.f49164n.f(true);
            } else if (i7 == org.telegram.messenger.ks.I3) {
                this.h.e();
                this.f49164n.e();
            } else if (i7 == org.telegram.messenger.ks.H3) {
                this.h.e();
                this.f49164n.e();
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.p3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.p3.f29940c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.ta.a(new g6(15, this), org.telegram.ui.ActionBar.n6.f29451d6, org.telegram.ui.ActionBar.n6.G6, org.telegram.ui.ActionBar.n6.f29862z6, org.telegram.ui.ActionBar.n6.f29543i6, org.telegram.ui.ActionBar.n6.f29394a7, org.telegram.ui.ActionBar.n6.B6, org.telegram.ui.ActionBar.n6.f29672p7, org.telegram.ui.ActionBar.n6.f29489f6, org.telegram.ui.ActionBar.n6.f29506g6, org.telegram.ui.ActionBar.n6.O6, org.telegram.ui.ActionBar.n6.P6, org.telegram.ui.ActionBar.n6.Q6, org.telegram.ui.ActionBar.n6.R6);
    }

    @Override
    public final boolean isLightStatusBar() {
        ol0 ol0Var = this.f49161e;
        if (ol0Var == null) {
            return super.isLightStatusBar();
        }
        if (i0.a.h(ol0Var.getColor()) > 0.699999988079071d) {
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
        if (!this.f49154a && ((this.h.b() || this.f49164n.b()) && getUserConfig().q())) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i7;
        int i10;
        boolean z11 = this.f49154a;
        if (!z11 && ((this.h.b() || this.f49164n.b()) && getUserConfig().q())) {
            if (z10 && getVisibleDialog() == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                if (z11) {
                    i7 = 2131752414;
                } else {
                    i7 = 2131743498;
                }
                String N0 = org.telegram.messenger.gd.N0(i7, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N0;
                if (z11) {
                    i10 = 2131752413;
                } else {
                    i10 = 2131743497;
                }
                t1Var.U = org.telegram.messenger.gd.N0(i10, null);
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131751357, null), new nl0(this, 1));
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131754213, null), new nl0(this, 2));
                showDialog(t1Var);
                org.telegram.ui.ActionBar.u6.U((TextView) t1Var.d(-2), org.telegram.ui.ActionBar.n6.f29692q7, getResourceProvider());
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
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25232i5);
        getNotificationCenter().c(this, org.telegram.messenger.ks.I3);
        getNotificationCenter().c(this, org.telegram.messenger.ks.H3);
        setBulletinDelegate(new bi.t(12));
        getMediaDataController().Z0();
        if (org.telegram.messenger.mp.u1(this.currentAccount).f25862t4 == null) {
            boolean z10 = org.telegram.messenger.s2.f26829a;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25232i5);
        getNotificationCenter().n(this, org.telegram.messenger.ks.I3);
        getNotificationCenter().n(this, org.telegram.messenger.ks.H3);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            if (this.h != null && this.f49164n != null) {
                J0();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.i6 i6Var) {
        this.f49166s = i6Var;
    }
}

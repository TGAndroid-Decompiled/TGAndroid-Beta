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
import android.os.Build;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bq0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public final zg.a E;
    public final eh.c F;
    public final zg.a G;
    public org.telegram.ui.ActionBar.p2 H;
    public bi.p1 I;
    public ImageView J;
    public ImageView K;
    public FrameLayout L;
    public org.telegram.ui.Components.xz M;
    public org.telegram.ui.ActionBar.l5 N;
    public FrameLayout O;
    public FrameLayout P;
    public bi.d Q;
    public up0 R;
    public boolean S;
    public org.telegram.ui.Components.hj0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public nc X;
    public float Y;
    public ValueAnimator Z;
    public final boolean f31337a;
    public boolean f31338a0;
    public final xh.n5 f31339b;
    public i0.c f31340b0;
    public final xh.n5 f31341c;
    public xf.c0 f31342c0;
    public k0 d;
    public final pe.b f31343d0;
    public dp0 e;
    public final pe.b f31344e0;
    public final int f31345f;
    public final zg.e f31346f0;
    public final eh.d f31347g0;
    public up0 h;
    public final zg.a f31348h0;
    public final xa f31349i0;
    public final ArrayList f31350j0;
    public final ArrayList f31351k0;
    public up0 f31352n;
    public boolean f31353r;
    public org.telegram.ui.ActionBar.f6 f31354s;
    public final SparseIntArray v;
    public final org.telegram.ui.ActionBar.h5 f31355w;
    public final org.telegram.ui.ActionBar.h5 f31356x;
    public final eh.c f31357y;

    public bq0() {
        super(null);
        this.f31345f = AndroidUtilities.dp(6.0f);
        this.v = new SparseIntArray();
        boolean q6 = org.telegram.ui.ActionBar.j6.I.q();
        this.S = q6;
        this.f31338a0 = q6;
        this.f31340b0 = i0.c.e;
        pe.b bVar = new pe.b(true);
        this.f31343d0 = bVar;
        pe.b bVar2 = new pe.b(true);
        this.f31344e0 = bVar2;
        this.f31349i0 = new xa(this, 1);
        this.f31350j0 = new ArrayList();
        this.f31351k0 = new ArrayList();
        eh.c cVar = new eh.c();
        this.f31357y = cVar;
        zg.a aVar = new zg.a(cVar);
        this.E = aVar;
        eh.c cVar2 = new eh.c();
        this.F = cVar2;
        zg.a aVar2 = new zg.a(cVar2);
        this.G = aVar2;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            zg.e eVar = new zg.e(false);
            this.f31346f0 = eVar;
            eh.d dVar = new eh.d(cVar);
            this.f31347g0 = dVar;
            dVar.v = new zo0(this, 1);
            dVar.d = eVar;
            dVar.e = -2;
            dVar.f7521f = cVar;
            zg.a aVar3 = new zg.a(dVar);
            this.f31348h0 = aVar3;
            aVar3.f48083f = LiteMode.isEnabled(262144);
        } else {
            this.f31346f0 = null;
            this.f31347g0 = null;
            this.f31348h0 = new zg.a(cVar);
        }
        aVar.f48082c = bVar;
        aVar.f48081b = bVar2;
        aVar2.f48082c = bVar;
        aVar2.f48081b = bVar2;
        zg.a aVar4 = this.f31348h0;
        aVar4.f48082c = bVar;
        aVar4.f48081b = bVar2;
        this.f31337a = false;
        xh.v5.y(this.currentAccount, false).V();
        xh.n5 n5Var = new xh.n5(this.currentAccount, 0L, false);
        this.f31339b = n5Var;
        n5Var.f(8, false);
        n5Var.a();
        xh.n5 n5Var2 = new xh.n5(this.currentAccount, 0L, false);
        this.f31341c = n5Var2;
        n5Var2.f(8, false);
        n5Var2.f45756f = true;
        n5Var2.a();
        this.resourceProvider = new g(this, 29);
        this.f31355w = new org.telegram.ui.ActionBar.h5(0, false, false, this.resourceProvider);
        this.f31356x = new org.telegram.ui.ActionBar.h5(0, false, true, this.resourceProvider);
    }

    public static boolean B0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
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

    public static void U(bq0 bq0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, yo0 yo0Var, xh.a3 a3Var, nf.e eVar) {
        zArr[0] = true;
        eVar.d();
        xh.v5.x(bq0Var.currentAccount, a3Var.f45239a).h(a3Var.f45240b, tL_starGiftUnique, j3, null, true, new bi.k6(16, eVar, yo0Var));
    }

    public static void V(bq0 bq0Var, yf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, yo0 yo0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        xh.a3 a3Var = new xh.a3(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        xh.c3 c3Var = new xh.c3(bq0Var.getParentActivity(), bq0Var.resourceProvider, tL_starGiftUnique, a3Var, bq0Var.currentAccount, j3, hc.b.l(tL_starGiftUnique.num, ',', sb2), false, new cp0(bq0Var, zArr, tL_starGiftUnique, j3, yo0Var, 0));
        c3Var.h.setOnDismissListener(new di.h0(10, zArr, yo0Var));
        c3Var.b();
    }

    public static int w0(int i10) {
        boolean z10;
        float f7;
        if (AndroidUtilities.computePerceivedBrightness(i10) < 0.2f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f7 = 0.28f;
        } else {
            f7 = -0.28f;
        }
        return org.telegram.ui.ActionBar.j6.b(0.5f, f7, i10);
    }

    public final void A0() {
        int themedColor;
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6)) > 0.72d) {
            themedColor = i0.a.d(0.085f, getThemedColor(org.telegram.ui.ActionBar.j6.f17872a7), this.e.getColor());
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f17872a7);
        }
        this.d.setBackgroundColor(themedColor);
        eh.c cVar = this.F;
        if (cVar.f7517a.getColor() != themedColor) {
            cVar.a(themedColor);
            Iterator it = this.f31344e0.iterator();
            while (it.hasNext()) {
                ((bh.d) it.next()).u();
            }
            Iterator it2 = this.f31343d0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final up0 C0() {
        bi.p1 p1Var = this.I;
        if (p1Var != null && p1Var.getPositionAnimated() >= 0.5f) {
            return this.h;
        }
        return this.f31352n;
    }

    public final void D0(int i10) {
        if (Build.VERSION.SDK_INT >= 31 && this.f31346f0 != null) {
            xf.c0 c0Var = this.f31342c0;
            if (c0Var.f45098c == 0) {
                c0Var.invalidate();
            }
            c0Var.f45098c = i10 | c0Var.f45098c;
        }
    }

    public final void E0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bq0.E0():void");
    }

    public final void F0() {
        org.telegram.ui.ActionBar.l5 l5Var = this.N;
        if (l5Var != null) {
            l5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.A8));
        }
        this.h.g();
        this.f31352n.g();
        dp0 dp0Var = this.e;
        if (dp0Var != null) {
            dp0Var.f33149a = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17872a7, dp0Var.f33150b);
            dp0Var.a();
            dp0Var.invalidate();
        }
        G0();
        z0();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void G0() {
        float positionAnimated;
        if (this.e != null) {
            A0();
            int tabsViewBackgroundColor = this.e.getTabsViewBackgroundColor();
            if (this.M != null) {
                bi.p1 p1Var = this.I;
                if (p1Var == null) {
                    positionAnimated = 0.0f;
                } else {
                    positionAnimated = p1Var.getPositionAnimated();
                }
                float a2 = w7.q.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f);
                org.telegram.ui.Components.xz xzVar = this.M;
                int d = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
                int d10 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.j6.f17872a7));
                int d11 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.j6.f18325z6));
                int d12 = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                xzVar.f29185a.setColor(d);
                xzVar.f29186b.setColor(d10);
                xzVar.d = d11;
                xzVar.e = d12;
                xzVar.invalidate();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        setHasOwnBackground(true);
        this.actionBar.setCastShadows(false);
        this.actionBar.setVisibility(8);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        k0 k0Var = new k0(this, context, 15);
        this.d = k0Var;
        this.fragmentView = k0Var;
        this.f31342c0 = new xf.c0(context, new xo0(this, 0));
        gh.k kVar = new gh.k(this.d);
        k0 k0Var2 = this.d;
        zg.a aVar = this.f31348h0;
        aVar.d = kVar;
        aVar.e = k0Var2;
        this.h = new up0(this, context, 1);
        this.f31352n = new up0(this, context, 0);
        dp0 dp0Var = new dp0(this, context, this.resourceProvider);
        this.e = dp0Var;
        dp0Var.E = true;
        this.f31352n.j(false);
        this.f31352n.addView(this.e, 2, w7.a6.e(-1, -2, 55));
        bi.p1 p1Var = new bi.p1(this, context, 4);
        this.I = p1Var;
        p1Var.setAdapter(new ep0(this));
        k0Var.addView(this.I, w7.a6.e(-1, -1, 119));
        bi.d dVar = new bi.d(context, getResourceProvider(), true);
        this.Q = dVar;
        dVar.setStateListAnimator(null);
        this.Q.e();
        this.Q.d.o(true, true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final bq0 f31048b;

            {
                this.f31048b = this;
            }

            @Override
            public final void onClick(View view) {
                int i12 = r2;
                bq0 bq0Var = this.f31048b;
                switch (i12) {
                    case 0:
                        bq0Var.y0();
                        return;
                    case 1:
                        if (bq0Var.onBackPressed(true)) {
                            bq0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        bq0 bq0Var2 = this.f31048b;
                        FrameLayout frameLayout2 = (FrameLayout) bq0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        bq0Var2.K.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        bq0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        bq0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        nc ncVar = new nc(bq0Var2, bq0Var2.getParentActivity(), canvas, (bq0Var2.K.getMeasuredWidth() / 2.0f) + f7, (bq0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        bq0Var2.X = ncVar;
                        ncVar.setOnTouchListener(new ai.h(2));
                        bq0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        bq0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new bi.hd(bq0Var2, 2));
                        bq0Var2.Z.addListener(new org.telegram.ui.Components.voip.v2(bq0Var2, 19));
                        bq0Var2.Z.setDuration(400L);
                        bq0Var2.Z.setInterpolator(org.telegram.ui.Components.pt.e);
                        bq0Var2.Z.start();
                        frameLayout2.addView(bq0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new zo0(bq0Var2, 0));
                        return;
                }
            }
        });
        this.O.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.O.addView(this.Q, w7.a6.c(-1.0f, -1));
        FrameLayout frameLayout2 = this.O;
        bh.d c10 = this.E.c(frameLayout2, null, false);
        c10.n(dh.c.j(this.resourceProvider));
        c10.p(AndroidUtilities.dp(28.0f));
        c10.o(AndroidUtilities.dp(5.0f));
        frameLayout2.setBackground(c10);
        w7.c6.b(this.O, 0.02f, 1.5f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.P = frameLayout3;
        frameLayout3.addView(this.O, w7.a6.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        zg.b bVar = new zg.b(this.G.c(this.P, null, false));
        bVar.b(AndroidUtilities.dp(40.0f), true);
        bVar.f48097q = 220;
        this.P.setBackground(bVar);
        up0 C0 = C0();
        bi.d dVar2 = this.Q;
        if (dVar2 != null && C0 != null && C0 != this.R) {
            this.R = C0;
            og.u0 u0Var = C0.e;
            dVar2.g((CharSequence) u0Var.f14497b, false, true);
            this.Q.f((SpannableStringBuilder) u0Var.f14498c, false);
        }
        k0Var.addView(this.P, w7.a6.e(-1, -2, 80));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.L = frameLayout4;
        k0Var.addView(frameLayout4, w7.a6.e(-1, -2, 55));
        boolean z10 = this.f31337a;
        if (!z10) {
            org.telegram.ui.Components.xz xzVar = new org.telegram.ui.Components.xz(context);
            this.M = xzVar;
            if (z10) {
                i10 = R.string.ChannelColorTabProfile;
            } else {
                i10 = R.string.UserColorTabProfile;
            }
            String string = LocaleController.getString(i10);
            if (z10) {
                i11 = R.string.ChannelColorTabName;
            } else {
                i11 = R.string.UserColorTabName;
            }
            xzVar.setTabs(string, LocaleController.getString(i11));
            this.M.f29190r = new yo0(this, 1);
            G0();
            this.L.addView(this.M, w7.a6.e(-1, 40, 17));
        } else {
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
            this.N = l5Var;
            l5Var.l(LocaleController.getString(R.string.ChannelColorTitle2), false);
            this.N.setEllipsizeByGradient(true);
            this.N.setTextSize(20);
            this.N.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.A8));
            this.N.setTypeface(AndroidUtilities.bold());
            this.L.addView(this.N, w7.a6.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        }
        dp0 dp0Var2 = this.e;
        if (dp0Var2 != null) {
            dp0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                AndroidUtilities.setLightStatusBar(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.J;
        int i12 = org.telegram.ui.ActionBar.j6.f18238u8;
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i12), 1, -1));
        this.J.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.J;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.J.setOnClickListener(new View.OnClickListener(this) {
            public final bq0 f31048b;

            {
                this.f31048b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                bq0 bq0Var = this.f31048b;
                switch (i122) {
                    case 0:
                        bq0Var.y0();
                        return;
                    case 1:
                        if (bq0Var.onBackPressed(true)) {
                            bq0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        bq0 bq0Var2 = this.f31048b;
                        FrameLayout frameLayout22 = (FrameLayout) bq0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        bq0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        bq0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        bq0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        nc ncVar = new nc(bq0Var2, bq0Var2.getParentActivity(), canvas, (bq0Var2.K.getMeasuredWidth() / 2.0f) + f7, (bq0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        bq0Var2.X = ncVar;
                        ncVar.setOnTouchListener(new ai.h(2));
                        bq0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        bq0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new bi.hd(bq0Var2, 2));
                        bq0Var2.Z.addListener(new org.telegram.ui.Components.voip.v2(bq0Var2, 19));
                        bq0Var2.Z.setDuration(400L);
                        bq0Var2.Z.setInterpolator(org.telegram.ui.Components.pt.e);
                        bq0Var2.Z.start();
                        frameLayout22.addView(bq0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new zo0(bq0Var2, 0));
                        return;
                }
            }
        });
        w7.c6.a(this.J);
        this.L.addView(this.J, w7.a6.e(54, 54, 19));
        org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.T = hj0Var;
        hj0Var.h = true;
        if (!this.S) {
            hj0Var.P(0);
            this.T.M(0);
        } else {
            hj0Var.M(35);
            this.T.P(36);
        }
        this.T.f23646a0 = true;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J9, false);
        this.T.Q(w02, "Sunny");
        this.T.Q(w02, "Path 6");
        this.T.Q(w02, "Path");
        this.T.Q(w02, "Path 5");
        this.T.o();
        ImageView imageView4 = new ImageView(context);
        this.K = imageView4;
        imageView4.setScaleType(scaleType);
        this.K.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i12), 1, -1));
        this.K.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) {
            public final bq0 f31048b;

            {
                this.f31048b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                bq0 bq0Var = this.f31048b;
                switch (i122) {
                    case 0:
                        bq0Var.y0();
                        return;
                    case 1:
                        if (bq0Var.onBackPressed(true)) {
                            bq0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        bq0 bq0Var2 = this.f31048b;
                        FrameLayout frameLayout22 = (FrameLayout) bq0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        bq0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        bq0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        bq0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        nc ncVar = new nc(bq0Var2, bq0Var2.getParentActivity(), canvas, (bq0Var2.K.getMeasuredWidth() / 2.0f) + f7, (bq0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        bq0Var2.X = ncVar;
                        ncVar.setOnTouchListener(new ai.h(2));
                        bq0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        bq0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new bi.hd(bq0Var2, 2));
                        bq0Var2.Z.addListener(new org.telegram.ui.Components.voip.v2(bq0Var2, 19));
                        bq0Var2.Z.setDuration(400L);
                        bq0Var2.Z.setInterpolator(org.telegram.ui.Components.pt.e);
                        bq0Var2.Z.start();
                        frameLayout22.addView(bq0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new zo0(bq0Var2, 0));
                        return;
                }
            }
        });
        this.L.addView(this.K, w7.a6.e(54, 54, 21));
        this.K.setImageDrawable(this.T);
        dp0 dp0Var3 = this.e;
        dp0Var3.getClass();
        dp0Var3.f33149a = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17872a7, dp0Var3.f33150b);
        dp0Var3.a();
        dp0Var3.invalidate();
        z0();
        this.d.addView(this.f31342c0);
        A0();
        View view = this.fragmentView;
        xo0 xo0Var = new xo0(this, 1);
        WeakHashMap weakHashMap = r0.i0.f41062a;
        r0.a0.j(view, xo0Var);
        return this.d;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.h.f(true);
                this.f31352n.f(true);
            } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
                this.h.e();
                this.f31352n.e();
            } else if (i10 == NotificationCenter.starGiftsLoaded) {
                this.h.e();
                this.f31352n.e();
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.c4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.c4.f17574c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.d6.a(new e(this, 27), org.telegram.ui.ActionBar.j6.f17928d6, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.f18325z6, org.telegram.ui.ActionBar.j6.f18017i6, org.telegram.ui.ActionBar.j6.f17872a7, org.telegram.ui.ActionBar.j6.B6, org.telegram.ui.ActionBar.j6.f18144p7, org.telegram.ui.ActionBar.j6.f17964f6, org.telegram.ui.ActionBar.j6.f17982g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
    }

    @Override
    public final boolean isLightStatusBar() {
        dp0 dp0Var = this.e;
        if (dp0Var == null) {
            return super.isLightStatusBar();
        }
        if (i0.a.f(dp0Var.getColor()) > 0.699999988079071d) {
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
        if (!this.f31337a && ((this.h.b() || this.f31352n.b()) && getUserConfig().isPremium())) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i10;
        int i11;
        boolean z11 = this.f31337a;
        if (!z11 && ((this.h.b() || this.f31352n.b()) && getUserConfig().isPremium())) {
            if (z10 && getVisibleDialog() == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                if (z11) {
                    i10 = R.string.ChannelColorUnsaved;
                } else {
                    i10 = R.string.UserColorUnsaved;
                }
                alertDialog$Builder.f17528a.R = LocaleController.getString(i10);
                if (z11) {
                    i11 = R.string.ChannelColorUnsavedMessage;
                } else {
                    i11 = R.string.UserColorUnsavedMessage;
                }
                alertDialog$Builder.f17528a.T = LocaleController.getString(i11);
                alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new xo0(this, 2));
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new xo0(this, 3));
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                showDialog(d2Var);
                ((TextView) d2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18162q7));
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
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.starUserGiftsLoaded);
        getNotificationCenter().addObserver(this, NotificationCenter.starGiftsLoaded);
        setBulletinDelegate(new bi.fa(11));
        getMediaDataController().loadReplyIcons();
        if (MessagesController.getInstance(this.currentAccount).peerColors == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            MessagesController.getInstance(this.currentAccount).loadAppConfig(true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.starGiftsLoaded);
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.f6 f6Var) {
        this.f31354s = f6Var;
    }

    public final void x0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bq0.x0():void");
    }

    public final void y0() {
        yf.b bVar;
        if (this.f31353r) {
            return;
        }
        if (this.f31337a) {
            finishFragment();
        } else if (!getUserConfig().isPremium()) {
            showDialog(new qg.a1((org.telegram.ui.ActionBar.p2) this, 23, true));
            return;
        }
        up0 C0 = C0();
        if (C0.I != null) {
            up0 up0Var = this.h;
            if (C0 == up0Var) {
                up0Var = this.f31352n;
            }
            up0Var.d();
            this.f31353r = true;
            this.Q.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = C0.I;
            yo0 yo0Var = new yo0(this, 0);
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            if (tL_starGiftUnique.resale_ton_only) {
                bVar = yf.b.f46929b;
            } else {
                bVar = yf.b.f46928a;
            }
            xh.v5.x(this.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new bp0(this, bVar, tL_starGiftUnique, clientUserId, yo0Var));
            return;
        }
        up0 up0Var2 = this.h;
        if (C0 == up0Var2) {
            up0Var2 = this.f31352n;
        }
        if (up0Var2.I != null) {
            up0Var2.d();
        }
        x0();
        finishFragment();
        E0();
    }

    public final void z0() {
        this.f31357y.a(getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
        this.O.invalidate();
        this.P.invalidate();
        this.h.f37327w.invalidate();
        this.h.f37328x.invalidate();
        this.f31352n.f37327w.invalidate();
        this.h.f37307b.invalidate();
        this.f31352n.f37307b.invalidate();
        ((bh.d) this.O.getBackground()).u();
        A0();
        Iterator it = this.f31344e0.iterator();
        while (it.hasNext()) {
            ((bh.d) it.next()).u();
        }
    }
}

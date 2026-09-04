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
public final class bq0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final bh.b E;
    public final gh.c F;
    public final bh.b G;
    public org.telegram.ui.ActionBar.n2 H;
    public di.i1 I;
    public ImageView J;
    public ImageView K;
    public FrameLayout L;
    public org.telegram.ui.Components.qz M;
    public org.telegram.ui.ActionBar.j5 N;
    public FrameLayout O;
    public FrameLayout P;
    public di.d Q;
    public vp0 R;
    public boolean S;
    public org.telegram.ui.Components.xi0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public mc X;
    public float Y;
    public ValueAnimator Z;
    public final boolean f34857a;
    public boolean f34858a0;
    public final zh.j5 f34859b;
    public i0.c f34860b0;
    public final zh.j5 f34861c;
    public yf.c0 f34862c0;
    public j0 d;
    public final pe.b f34863d0;
    public ep0 f34864e;
    public final pe.b f34865e0;
    public final int f34866f;
    public final bh.f f34867f0;
    public final gh.d f34868g0;
    public vp0 h;
    public final bh.b f34869h0;
    public final wa f34870i0;
    public final ArrayList f34871j0;
    public final ArrayList f34872k0;
    public vp0 f34873n;
    public boolean f34874r;
    public org.telegram.ui.ActionBar.f6 f34875s;
    public final SparseIntArray v;
    public final org.telegram.ui.ActionBar.f5 f34876w;
    public final org.telegram.ui.ActionBar.f5 f34877x;
    public final gh.c f34878y;

    public bq0() {
        super(null);
        this.f34866f = AndroidUtilities.dp(6.0f);
        this.v = new SparseIntArray();
        boolean q6 = org.telegram.ui.ActionBar.j6.I.q();
        this.S = q6;
        this.f34858a0 = q6;
        this.f34860b0 = i0.c.f11424e;
        pe.b bVar = new pe.b(true);
        this.f34863d0 = bVar;
        pe.b bVar2 = new pe.b(true);
        this.f34865e0 = bVar2;
        this.f34870i0 = new wa(this, 1);
        this.f34871j0 = new ArrayList();
        this.f34872k0 = new ArrayList();
        gh.c cVar = new gh.c();
        this.f34878y = cVar;
        bh.b bVar3 = new bh.b(cVar);
        this.E = bVar3;
        gh.c cVar2 = new gh.c();
        this.F = cVar2;
        bh.b bVar4 = new bh.b(cVar2);
        this.G = bVar4;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            bh.f fVar = new bh.f(false);
            this.f34867f0 = fVar;
            gh.d dVar = new gh.d(cVar);
            this.f34868g0 = dVar;
            dVar.v = new ap0(this, 1);
            dVar.d = fVar;
            dVar.f10656e = -2;
            dVar.f10657f = cVar;
            bh.b bVar5 = new bh.b(dVar);
            this.f34869h0 = bVar5;
            bVar5.f2654f = LiteMode.isEnabled(262144);
        } else {
            this.f34867f0 = null;
            this.f34868g0 = null;
            this.f34869h0 = new bh.b(cVar);
        }
        bVar3.f2652c = bVar;
        bVar3.f2651b = bVar2;
        bVar4.f2652c = bVar;
        bVar4.f2651b = bVar2;
        bh.b bVar6 = this.f34869h0;
        bVar6.f2652c = bVar;
        bVar6.f2651b = bVar2;
        this.f34857a = false;
        zh.s5.y(this.currentAccount, false).V();
        zh.j5 j5Var = new zh.j5(this.currentAccount, 0L, false);
        this.f34859b = j5Var;
        j5Var.f(8, false);
        j5Var.a();
        zh.j5 j5Var2 = new zh.j5(this.currentAccount, 0L, false);
        this.f34861c = j5Var2;
        j5Var2.f(8, false);
        j5Var2.f52096f = true;
        j5Var2.a();
        this.resourceProvider = new g(this, 29);
        this.f34876w = new org.telegram.ui.ActionBar.f5(0, false, false, this.resourceProvider);
        this.f34877x = new org.telegram.ui.ActionBar.f5(0, false, true, this.resourceProvider);
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

    public static void U(bq0 bq0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, zo0 zo0Var, zh.a3 a3Var, of.e eVar) {
        zArr[0] = true;
        eVar.d();
        zh.s5.x(bq0Var.currentAccount, a3Var.f51675a).h(a3Var.f51676b, tL_starGiftUnique, j3, null, true, new bi.f0(18, eVar, zo0Var));
    }

    public static void V(bq0 bq0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, zo0 zo0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        zh.a3 a3Var = new zh.a3(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        zh.c3 c3Var = new zh.c3(bq0Var.getParentActivity(), bq0Var.resourceProvider, tL_starGiftUnique, a3Var, bq0Var.currentAccount, j3, i2.g.k(tL_starGiftUnique.num, ',', sb2), false, new dp0(bq0Var, zArr, tL_starGiftUnique, j3, zo0Var, 0));
        c3Var.h.setOnDismissListener(new fi.e0(10, zArr, zo0Var));
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
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6)) > 0.72d) {
            themedColor = i0.a.d(0.085f, getThemedColor(org.telegram.ui.ActionBar.j6.f20607a7), this.f34864e.getColor());
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f20607a7);
        }
        this.d.setBackgroundColor(themedColor);
        gh.c cVar = this.F;
        if (cVar.f10652a.getColor() != themedColor) {
            cVar.a(themedColor);
            Iterator it = this.f34865e0.iterator();
            while (it.hasNext()) {
                ((dh.d) it.next()).u();
            }
            Iterator it2 = this.f34863d0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final vp0 C0() {
        di.i1 i1Var = this.I;
        if (i1Var != null && i1Var.getPositionAnimated() >= 0.5f) {
            return this.h;
        }
        return this.f34873n;
    }

    public final void D0(int i10) {
        if (Build.VERSION.SDK_INT >= 31 && this.f34867f0 != null) {
            yf.c0 c0Var = this.f34862c0;
            if (c0Var.f50053c == 0) {
                c0Var.invalidate();
            }
            c0Var.f50053c = i10 | c0Var.f50053c;
        }
    }

    public final void E0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bq0.E0():void");
    }

    public final void F0() {
        org.telegram.ui.ActionBar.j5 j5Var = this.N;
        if (j5Var != null) {
            j5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.A8));
        }
        this.h.g();
        this.f34873n.g();
        ep0 ep0Var = this.f34864e;
        if (ep0Var != null) {
            ep0Var.f37079a = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20607a7, ep0Var.f37080b);
            ep0Var.a();
            ep0Var.invalidate();
        }
        G0();
        z0();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void G0() {
        float positionAnimated;
        if (this.f34864e != null) {
            A0();
            int tabsViewBackgroundColor = this.f34864e.getTabsViewBackgroundColor();
            if (this.M != null) {
                di.i1 i1Var = this.I;
                if (i1Var == null) {
                    positionAnimated = 0.0f;
                } else {
                    positionAnimated = i1Var.getPositionAnimated();
                }
                float a2 = w7.p.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f);
                org.telegram.ui.Components.qz qzVar = this.M;
                int d = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6));
                int d10 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.j6.f20607a7));
                int d11 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.j6.f21061z6));
                int d12 = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                qzVar.f29838a.setColor(d);
                qzVar.f29839b.setColor(d10);
                qzVar.d = d11;
                qzVar.f29841e = d12;
                qzVar.invalidate();
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
        j0 j0Var = new j0(this, context, 15);
        this.d = j0Var;
        this.fragmentView = j0Var;
        this.f34862c0 = new yf.c0(context, new yo0(this, 0));
        ih.k kVar = new ih.k(this.d);
        j0 j0Var2 = this.d;
        bh.b bVar = this.f34869h0;
        bVar.d = kVar;
        bVar.f2653e = j0Var2;
        this.h = new vp0(this, context, 1);
        this.f34873n = new vp0(this, context, 0);
        ep0 ep0Var = new ep0(this, context, this.resourceProvider);
        this.f34864e = ep0Var;
        ep0Var.E = true;
        this.f34873n.j(false);
        this.f34873n.addView(this.f34864e, 2, w7.x5.e(-1, -2, 55));
        di.i1 i1Var = new di.i1(this, context, 4);
        this.I = i1Var;
        i1Var.setAdapter(new fp0(this));
        j0Var.addView(this.I, w7.x5.e(-1, -1, 119));
        di.d dVar = new di.d(context, getResourceProvider(), true);
        this.Q = dVar;
        dVar.setStateListAnimator(null);
        this.Q.e();
        this.Q.d.o(true, true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final bq0 f34854b;

            {
                this.f34854b = this;
            }

            @Override
            public final void onClick(View view) {
                int i12 = r2;
                bq0 bq0Var = this.f34854b;
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
                        bq0 bq0Var2 = this.f34854b;
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
                        mc mcVar = new mc(bq0Var2, bq0Var2.getParentActivity(), canvas, (bq0Var2.K.getMeasuredWidth() / 2.0f) + f7, (bq0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        bq0Var2.X = mcVar;
                        mcVar.setOnTouchListener(new ci.d(2));
                        bq0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        bq0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new di.yb(bq0Var2, 2));
                        bq0Var2.Z.addListener(new gk0(bq0Var2, 2));
                        bq0Var2.Z.setDuration(400L);
                        bq0Var2.Z.setInterpolator(org.telegram.ui.Components.jt.f27568e);
                        bq0Var2.Z.start();
                        frameLayout2.addView(bq0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new ap0(bq0Var2, 0));
                        return;
                }
            }
        });
        this.O.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.O.addView(this.Q, w7.x5.c(-1.0f, -1));
        FrameLayout frameLayout2 = this.O;
        dh.d c10 = this.E.c(frameLayout2, null, false);
        c10.n(fh.b.j(this.resourceProvider));
        c10.p(AndroidUtilities.dp(28.0f));
        c10.o(AndroidUtilities.dp(5.0f));
        frameLayout2.setBackground(c10);
        w7.z5.b(this.O, 0.02f, 1.5f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.P = frameLayout3;
        frameLayout3.addView(this.O, w7.x5.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        bh.c cVar = new bh.c(this.G.c(this.P, null, false));
        cVar.b(AndroidUtilities.dp(40.0f), true);
        cVar.f2669q = 220;
        this.P.setBackground(cVar);
        vp0 C0 = C0();
        di.d dVar2 = this.Q;
        if (dVar2 != null && C0 != null && C0 != this.R) {
            this.R = C0;
            n7.z0 z0Var = C0.f41606e;
            dVar2.g((CharSequence) z0Var.f16703b, false, true);
            this.Q.f((SpannableStringBuilder) z0Var.f16704c, false);
        }
        j0Var.addView(this.P, w7.x5.e(-1, -2, 80));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.L = frameLayout4;
        j0Var.addView(frameLayout4, w7.x5.e(-1, -2, 55));
        boolean z10 = this.f34857a;
        if (!z10) {
            org.telegram.ui.Components.qz qzVar = new org.telegram.ui.Components.qz(context);
            this.M = qzVar;
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
            qzVar.setTabs(string, LocaleController.getString(i11));
            this.M.f29844r = new zo0(this, 1);
            G0();
            this.L.addView(this.M, w7.x5.e(-1, 40, 17));
        } else {
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
            this.N = j5Var;
            j5Var.l(LocaleController.getString(R.string.ChannelColorTitle2), false);
            this.N.setEllipsizeByGradient(true);
            this.N.setTextSize(20);
            this.N.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.A8));
            this.N.setTypeface(AndroidUtilities.bold());
            this.L.addView(this.N, w7.x5.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        }
        ep0 ep0Var2 = this.f34864e;
        if (ep0Var2 != null) {
            ep0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                AndroidUtilities.setLightStatusBar(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.J;
        int i12 = org.telegram.ui.ActionBar.j6.f20974u8;
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i12), 1, -1));
        this.J.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.J;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.J.setOnClickListener(new View.OnClickListener(this) {
            public final bq0 f34854b;

            {
                this.f34854b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                bq0 bq0Var = this.f34854b;
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
                        bq0 bq0Var2 = this.f34854b;
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
                        mc mcVar = new mc(bq0Var2, bq0Var2.getParentActivity(), canvas, (bq0Var2.K.getMeasuredWidth() / 2.0f) + f7, (bq0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        bq0Var2.X = mcVar;
                        mcVar.setOnTouchListener(new ci.d(2));
                        bq0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        bq0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new di.yb(bq0Var2, 2));
                        bq0Var2.Z.addListener(new gk0(bq0Var2, 2));
                        bq0Var2.Z.setDuration(400L);
                        bq0Var2.Z.setInterpolator(org.telegram.ui.Components.jt.f27568e);
                        bq0Var2.Z.start();
                        frameLayout22.addView(bq0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new ap0(bq0Var2, 0));
                        return;
                }
            }
        });
        w7.z5.a(this.J);
        this.L.addView(this.J, w7.x5.e(54, 54, 19));
        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.T = xi0Var;
        xi0Var.h = true;
        if (!this.S) {
            xi0Var.N(0);
            this.T.K(0);
        } else {
            xi0Var.K(35);
            this.T.N(36);
        }
        this.T.f32551a0 = true;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J9, false);
        this.T.O(w02, "Sunny");
        this.T.O(w02, "Path 6");
        this.T.O(w02, "Path");
        this.T.O(w02, "Path 5");
        this.T.m();
        ImageView imageView4 = new ImageView(context);
        this.K = imageView4;
        imageView4.setScaleType(scaleType);
        this.K.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i12), 1, -1));
        this.K.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) {
            public final bq0 f34854b;

            {
                this.f34854b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                bq0 bq0Var = this.f34854b;
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
                        bq0 bq0Var2 = this.f34854b;
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
                        mc mcVar = new mc(bq0Var2, bq0Var2.getParentActivity(), canvas, (bq0Var2.K.getMeasuredWidth() / 2.0f) + f7, (bq0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        bq0Var2.X = mcVar;
                        mcVar.setOnTouchListener(new ci.d(2));
                        bq0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        bq0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new di.yb(bq0Var2, 2));
                        bq0Var2.Z.addListener(new gk0(bq0Var2, 2));
                        bq0Var2.Z.setDuration(400L);
                        bq0Var2.Z.setInterpolator(org.telegram.ui.Components.jt.f27568e);
                        bq0Var2.Z.start();
                        frameLayout22.addView(bq0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new ap0(bq0Var2, 0));
                        return;
                }
            }
        });
        this.L.addView(this.K, w7.x5.e(54, 54, 21));
        this.K.setImageDrawable(this.T);
        ep0 ep0Var3 = this.f34864e;
        ep0Var3.getClass();
        ep0Var3.f37079a = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20607a7, ep0Var3.f37080b);
        ep0Var3.a();
        ep0Var3.invalidate();
        z0();
        this.d.addView(this.f34862c0);
        A0();
        View view = this.fragmentView;
        yo0 yo0Var = new yo0(this, 1);
        WeakHashMap weakHashMap = r0.i0.f44697a;
        r0.a0.j(view, yo0Var);
        return this.d;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.h.f(true);
                this.f34873n.f(true);
            } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
                this.h.e();
                this.f34873n.e();
            } else if (i10 == NotificationCenter.starGiftsLoaded) {
                this.h.e();
                this.f34873n.e();
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.a4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.a4.f20207c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.a6.a(new e(this, 27), org.telegram.ui.ActionBar.j6.f20663d6, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.f21061z6, org.telegram.ui.ActionBar.j6.f20753i6, org.telegram.ui.ActionBar.j6.f20607a7, org.telegram.ui.ActionBar.j6.B6, org.telegram.ui.ActionBar.j6.f20880p7, org.telegram.ui.ActionBar.j6.f20700f6, org.telegram.ui.ActionBar.j6.f20718g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
    }

    @Override
    public final boolean isLightStatusBar() {
        ep0 ep0Var = this.f34864e;
        if (ep0Var == null) {
            return super.isLightStatusBar();
        }
        if (i0.a.f(ep0Var.getColor()) > 0.699999988079071d) {
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
        if (!this.f34857a && ((this.h.b() || this.f34873n.b()) && getUserConfig().isPremium())) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i10;
        int i11;
        boolean z11 = this.f34857a;
        if (!z11 && ((this.h.b() || this.f34873n.b()) && getUserConfig().isPremium())) {
            if (z10 && getVisibleDialog() == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                if (z11) {
                    i10 = R.string.ChannelColorUnsaved;
                } else {
                    i10 = R.string.UserColorUnsaved;
                }
                alertDialog$Builder.f20198a.R = LocaleController.getString(i10);
                if (z11) {
                    i11 = R.string.ChannelColorUnsavedMessage;
                } else {
                    i11 = R.string.UserColorUnsavedMessage;
                }
                alertDialog$Builder.f20198a.T = LocaleController.getString(i11);
                alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new yo0(this, 2));
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new yo0(this, 3));
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                showDialog(b2Var);
                ((TextView) b2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20898q7));
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
        setBulletinDelegate(new di.c9(11));
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
        this.f34875s = f6Var;
    }

    public final void x0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bq0.x0():void");
    }

    public final void y0() {
        zf.b bVar;
        if (this.f34874r) {
            return;
        }
        if (this.f34857a) {
            finishFragment();
        } else if (!getUserConfig().isPremium()) {
            showDialog(new sg.a1((org.telegram.ui.ActionBar.n2) this, 23, true));
            return;
        }
        vp0 C0 = C0();
        if (C0.I != null) {
            vp0 vp0Var = this.h;
            if (C0 == vp0Var) {
                vp0Var = this.f34873n;
            }
            vp0Var.d();
            this.f34874r = true;
            this.Q.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = C0.I;
            zo0 zo0Var = new zo0(this, 0);
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            if (tL_starGiftUnique.resale_ton_only) {
                bVar = zf.b.f51625b;
            } else {
                bVar = zf.b.f51624a;
            }
            zh.s5.x(this.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new cp0(this, bVar, tL_starGiftUnique, clientUserId, zo0Var));
            return;
        }
        vp0 vp0Var2 = this.h;
        if (C0 == vp0Var2) {
            vp0Var2 = this.f34873n;
        }
        if (vp0Var2.I != null) {
            vp0Var2.d();
        }
        x0();
        finishFragment();
        E0();
    }

    public final void z0() {
        this.f34878y.a(getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6));
        this.O.invalidate();
        this.P.invalidate();
        this.h.f41622w.invalidate();
        this.h.f41623x.invalidate();
        this.f34873n.f41622w.invalidate();
        this.h.f41601b.invalidate();
        this.f34873n.f41601b.invalidate();
        ((dh.d) this.O.getBackground()).u();
        A0();
        Iterator it = this.f34865e0.iterator();
        while (it.hasNext()) {
            ((dh.d) it.next()).u();
        }
    }
}

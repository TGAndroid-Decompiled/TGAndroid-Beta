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
public final class cq0 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public final ah.c E;
    public final fh.c F;
    public final ah.c G;
    public org.telegram.ui.ActionBar.m2 H;
    public ci.h1 I;
    public ImageView J;
    public ImageView K;
    public FrameLayout L;
    public org.telegram.ui.Components.j00 M;
    public org.telegram.ui.ActionBar.h5 N;
    public FrameLayout O;
    public FrameLayout P;
    public ci.d Q;
    public wp0 R;
    public boolean S;
    public org.telegram.ui.Components.fk0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public pc X;
    public float Y;
    public ValueAnimator Z;
    public final boolean f36474a;
    public boolean f36475a0;
    public final yh.f5 f36476b;
    public i0.b f36477b0;
    public final yh.f5 f36478c;
    public yf.b0 f36479c0;
    public k0 d;
    public final qe.b f36480d0;
    public ep0 f36481e;
    public final qe.b f36482e0;
    public final int f36483f;
    public final ah.h f36484f0;
    public final fh.d f36485g0;
    public wp0 h;
    public final ah.c f36486h0;
    public final za f36487i0;
    public final ArrayList f36488j0;
    public final ArrayList f36489k0;
    public wp0 f36490n;
    public boolean f36491r;
    public org.telegram.ui.ActionBar.c6 f36492s;
    public final SparseIntArray v;
    public final org.telegram.ui.ActionBar.d5 f36493w;
    public final org.telegram.ui.ActionBar.d5 f36494x;
    public final fh.c f36495y;

    public cq0() {
        super(null);
        this.f36483f = AndroidUtilities.dp(6.0f);
        this.v = new SparseIntArray();
        boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
        this.S = q6;
        this.f36475a0 = q6;
        this.f36477b0 = i0.b.f11573e;
        qe.b bVar = new qe.b();
        this.f36480d0 = bVar;
        qe.b bVar2 = new qe.b();
        this.f36482e0 = bVar2;
        this.f36487i0 = new za(this, 1);
        this.f36488j0 = new ArrayList();
        this.f36489k0 = new ArrayList();
        fh.c cVar = new fh.c();
        this.f36495y = cVar;
        ah.c cVar2 = new ah.c(cVar);
        this.E = cVar2;
        fh.c cVar3 = new fh.c();
        this.F = cVar3;
        ah.c cVar4 = new ah.c(cVar3);
        this.G = cVar4;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ah.h hVar = new ah.h(false);
            this.f36484f0 = hVar;
            fh.d dVar = new fh.d(cVar);
            this.f36485g0 = dVar;
            dVar.v = new ap0(this, 1);
            dVar.d = hVar;
            dVar.f9935e = -2;
            dVar.f9936f = cVar;
            ah.c cVar5 = new ah.c(dVar);
            this.f36486h0 = cVar5;
            cVar5.f549i = LiteMode.isEnabled(262144);
        } else {
            this.f36484f0 = null;
            this.f36485g0 = null;
            this.f36486h0 = new ah.c(cVar);
        }
        cVar2.f546e = bVar;
        cVar2.d = bVar2;
        cVar4.f546e = bVar;
        cVar4.d = bVar2;
        ah.c cVar6 = this.f36486h0;
        cVar6.f546e = bVar;
        cVar6.d = bVar2;
        this.f36474a = false;
        yh.n5.y(this.currentAccount, false).V();
        yh.f5 f5Var = new yh.f5(this.currentAccount, 0L, false);
        this.f36476b = f5Var;
        f5Var.f(8, false);
        f5Var.a();
        yh.f5 f5Var2 = new yh.f5(this.currentAccount, 0L, false);
        this.f36478c = f5Var2;
        f5Var2.f(8, false);
        f5Var2.f52738f = true;
        f5Var2.a();
        this.resourceProvider = new g(this, 29);
        this.f36493w = new org.telegram.ui.ActionBar.d5(0, false, false, this.resourceProvider);
        this.f36494x = new org.telegram.ui.ActionBar.d5(0, false, true, this.resourceProvider);
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

    public static void U(cq0 cq0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, zo0 zo0Var, yh.w2 w2Var, of.e eVar) {
        zArr[0] = true;
        eVar.d();
        yh.n5.x(cq0Var.currentAccount, w2Var.f53552a).h(w2Var.f53553b, tL_starGiftUnique, j3, null, true, new ai.m0(17, eVar, zo0Var));
    }

    public static void V(cq0 cq0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, zo0 zo0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        yh.w2 w2Var = new yh.w2(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        yh.y2 y2Var = new yh.y2(cq0Var.getParentActivity(), cq0Var.resourceProvider, tL_starGiftUnique, w2Var, cq0Var.currentAccount, j3, hg.c.k(tL_starGiftUnique.num, ',', sb2), false, new dp0(cq0Var, zArr, tL_starGiftUnique, j3, zo0Var, 0));
        y2Var.h.setOnDismissListener(new ei.e0(10, zArr, zo0Var));
        y2Var.b();
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
        return org.telegram.ui.ActionBar.h6.b(0.5f, f7, i10);
    }

    public final void A0() {
        int themedColor;
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.h6.f20559d6)) > 0.72d) {
            themedColor = i0.a.d(0.085f, getThemedColor(org.telegram.ui.ActionBar.h6.f20503a7), this.f36481e.getColor());
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.f20503a7);
        }
        this.d.setBackgroundColor(themedColor);
        fh.c cVar = this.F;
        if (cVar.f9931a.getColor() != themedColor) {
            cVar.a(themedColor);
            Iterator it = this.f36482e0.iterator();
            while (it.hasNext()) {
                ((ch.d) it.next()).v();
            }
            Iterator it2 = this.f36480d0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final wp0 C0() {
        ci.h1 h1Var = this.I;
        if (h1Var != null && h1Var.getPositionAnimated() >= 0.5f) {
            return this.h;
        }
        return this.f36490n;
    }

    public final void D0(int i10) {
        if (Build.VERSION.SDK_INT >= 31 && this.f36484f0 != null) {
            yf.b0 b0Var = this.f36479c0;
            if (b0Var.f52341c == 0) {
                b0Var.invalidate();
            }
            b0Var.f52341c = i10 | b0Var.f52341c;
        }
    }

    public final void E0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cq0.E0():void");
    }

    public final void F0() {
        org.telegram.ui.ActionBar.h5 h5Var = this.N;
        if (h5Var != null) {
            h5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.A8));
        }
        this.h.g();
        this.f36490n.g();
        ep0 ep0Var = this.f36481e;
        if (ep0Var != null) {
            ep0Var.f38957a = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20503a7, ep0Var.f38958b);
            ep0Var.a();
            ep0Var.invalidate();
        }
        G0();
        z0();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void G0() {
        float positionAnimated;
        if (this.f36481e != null) {
            A0();
            int tabsViewBackgroundColor = this.f36481e.getTabsViewBackgroundColor();
            if (this.M != null) {
                ci.h1 h1Var = this.I;
                if (h1Var == null) {
                    positionAnimated = 0.0f;
                } else {
                    positionAnimated = h1Var.getPositionAnimated();
                }
                float a2 = w7.n.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f);
                org.telegram.ui.Components.j00 j00Var = this.M;
                int d = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.h6.f20559d6));
                int d10 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.h6.f20503a7));
                int d11 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.h6.f20963z6));
                int d12 = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                j00Var.f27315a.setColor(d);
                j00Var.f27316b.setColor(d10);
                j00Var.d = d11;
                j00Var.f27318e = d12;
                j00Var.invalidate();
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
        this.f36479c0 = new yf.b0(context, new yo0(this, 0));
        hh.j jVar = new hh.j(this.d);
        k0 k0Var2 = this.d;
        ah.c cVar = this.f36486h0;
        cVar.f547f = jVar;
        cVar.f548g = k0Var2;
        this.h = new wp0(this, context, 1);
        this.f36490n = new wp0(this, context, 0);
        ep0 ep0Var = new ep0(this, context, this.resourceProvider);
        this.f36481e = ep0Var;
        ep0Var.E = true;
        this.f36490n.j(false);
        this.f36490n.addView(this.f36481e, 2, w7.w5.e(-1, -2, 55));
        ci.h1 h1Var = new ci.h1(this, context, 4);
        this.I = h1Var;
        h1Var.setAdapter(new fp0(this, 0));
        k0Var.addView(this.I, w7.w5.e(-1, -1, 119));
        ci.d dVar = new ci.d(context, getResourceProvider(), true);
        this.Q = dVar;
        dVar.setStateListAnimator(null);
        this.Q.e();
        this.Q.d.r(true, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final cq0 f36229b;

            {
                this.f36229b = this;
            }

            @Override
            public final void onClick(View view) {
                int i12 = r2;
                cq0 cq0Var = this.f36229b;
                switch (i12) {
                    case 0:
                        cq0Var.y0();
                        return;
                    case 1:
                        if (cq0Var.onBackPressed(true)) {
                            cq0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        cq0 cq0Var2 = this.f36229b;
                        FrameLayout frameLayout2 = (FrameLayout) cq0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        cq0Var2.K.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        cq0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        cq0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        pc pcVar = new pc(cq0Var2, cq0Var2.getParentActivity(), canvas, (cq0Var2.K.getMeasuredWidth() / 2.0f) + f7, (cq0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        cq0Var2.X = pcVar;
                        pcVar.setOnTouchListener(new bi.d(2));
                        cq0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        cq0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ci.ub(cq0Var2, 2));
                        cq0Var2.Z.addListener(new gp0(cq0Var2, 0));
                        cq0Var2.Z.setDuration(400L);
                        cq0Var2.Z.setInterpolator(org.telegram.ui.Components.cu.f25018e);
                        cq0Var2.Z.start();
                        frameLayout2.addView(cq0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new ap0(cq0Var2, 0));
                        return;
                }
            }
        });
        this.O.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.O.addView(this.Q, w7.w5.d(-1.0f, -1));
        FrameLayout frameLayout2 = this.O;
        ch.d c10 = this.E.c(frameLayout2, null, false);
        c10.o(eh.b.j(this.resourceProvider));
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(5.0f));
        frameLayout2.setBackground(c10);
        w7.y5.b(this.O, 0.02f, 1.5f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.P = frameLayout3;
        frameLayout3.addView(this.O, w7.w5.a(64.0f, 4.0f, 0.0f, 4.0f, 0.0f, -1, 80));
        ah.d dVar2 = new ah.d(this.G.c(this.P, null, false));
        dVar2.b(AndroidUtilities.dp(40.0f), true);
        dVar2.f564q = 220;
        this.P.setBackground(dVar2);
        wp0 C0 = C0();
        ci.d dVar3 = this.Q;
        if (dVar3 != null && C0 != null && C0 != this.R) {
            this.R = C0;
            n6.k kVar = C0.f43584e;
            dVar3.g((CharSequence) kVar.f16432b, false, true);
            this.Q.f((SpannableStringBuilder) kVar.f16433c, false);
        }
        k0Var.addView(this.P, w7.w5.e(-1, -2, 80));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.L = frameLayout4;
        k0Var.addView(frameLayout4, w7.w5.e(-1, -2, 55));
        boolean z10 = this.f36474a;
        if (!z10) {
            org.telegram.ui.Components.j00 j00Var = new org.telegram.ui.Components.j00(context);
            this.M = j00Var;
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
            j00Var.setTabs(string, LocaleController.getString(i11));
            this.M.f27321r = new zo0(this, 1);
            G0();
            this.L.addView(this.M, w7.w5.e(-1, 40, 17));
        } else {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
            this.N = h5Var;
            h5Var.l(LocaleController.getString(R.string.ChannelColorTitle2), false);
            this.N.setEllipsizeByGradient(true);
            this.N.setTextSize(20);
            this.N.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.A8));
            this.N.setTypeface(AndroidUtilities.bold());
            this.L.addView(this.N, w7.w5.a(-2.0f, 72.0f, 0.0f, 72.0f, 0.0f, -2, 19));
        }
        ep0 ep0Var2 = this.f36481e;
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
        int i12 = org.telegram.ui.ActionBar.h6.f20876u8;
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i12), 1, -1));
        this.J.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.J;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.J.setOnClickListener(new View.OnClickListener(this) {
            public final cq0 f36229b;

            {
                this.f36229b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                cq0 cq0Var = this.f36229b;
                switch (i122) {
                    case 0:
                        cq0Var.y0();
                        return;
                    case 1:
                        if (cq0Var.onBackPressed(true)) {
                            cq0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        cq0 cq0Var2 = this.f36229b;
                        FrameLayout frameLayout22 = (FrameLayout) cq0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        cq0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        cq0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        cq0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        pc pcVar = new pc(cq0Var2, cq0Var2.getParentActivity(), canvas, (cq0Var2.K.getMeasuredWidth() / 2.0f) + f7, (cq0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        cq0Var2.X = pcVar;
                        pcVar.setOnTouchListener(new bi.d(2));
                        cq0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        cq0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ci.ub(cq0Var2, 2));
                        cq0Var2.Z.addListener(new gp0(cq0Var2, 0));
                        cq0Var2.Z.setDuration(400L);
                        cq0Var2.Z.setInterpolator(org.telegram.ui.Components.cu.f25018e);
                        cq0Var2.Z.start();
                        frameLayout22.addView(cq0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new ap0(cq0Var2, 0));
                        return;
                }
            }
        });
        w7.y5.a(this.J);
        this.L.addView(this.J, w7.w5.e(54, 54, 19));
        org.telegram.ui.Components.fk0 fk0Var = new org.telegram.ui.Components.fk0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.T = fk0Var;
        fk0Var.h = true;
        if (!this.S) {
            fk0Var.P(0);
            this.T.M(0);
        } else {
            fk0Var.M(35);
            this.T.P(36);
        }
        this.T.Z = true;
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J9, false);
        this.T.Q(x02, "Sunny");
        this.T.Q(x02, "Path 6");
        this.T.Q(x02, "Path");
        this.T.Q(x02, "Path 5");
        this.T.o();
        ImageView imageView4 = new ImageView(context);
        this.K = imageView4;
        imageView4.setScaleType(scaleType);
        this.K.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i12), 1, -1));
        this.K.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) {
            public final cq0 f36229b;

            {
                this.f36229b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                cq0 cq0Var = this.f36229b;
                switch (i122) {
                    case 0:
                        cq0Var.y0();
                        return;
                    case 1:
                        if (cq0Var.onBackPressed(true)) {
                            cq0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        cq0 cq0Var2 = this.f36229b;
                        FrameLayout frameLayout22 = (FrameLayout) cq0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        cq0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        cq0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        cq0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        pc pcVar = new pc(cq0Var2, cq0Var2.getParentActivity(), canvas, (cq0Var2.K.getMeasuredWidth() / 2.0f) + f7, (cq0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        cq0Var2.X = pcVar;
                        pcVar.setOnTouchListener(new bi.d(2));
                        cq0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        cq0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ci.ub(cq0Var2, 2));
                        cq0Var2.Z.addListener(new gp0(cq0Var2, 0));
                        cq0Var2.Z.setDuration(400L);
                        cq0Var2.Z.setInterpolator(org.telegram.ui.Components.cu.f25018e);
                        cq0Var2.Z.start();
                        frameLayout22.addView(cq0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new ap0(cq0Var2, 0));
                        return;
                }
            }
        });
        this.L.addView(this.K, w7.w5.e(54, 54, 21));
        this.K.setImageDrawable(this.T);
        ep0 ep0Var3 = this.f36481e;
        ep0Var3.getClass();
        ep0Var3.f38957a = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20503a7, ep0Var3.f38958b);
        ep0Var3.a();
        ep0Var3.invalidate();
        z0();
        this.d.addView(this.f36479c0);
        A0();
        View view = this.fragmentView;
        yo0 yo0Var = new yo0(this, 1);
        WeakHashMap weakHashMap = r0.i0.f46981a;
        r0.a0.i(view, yo0Var);
        return this.d;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.h.f(true);
                this.f36490n.f(true);
            } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
                this.h.e();
                this.f36490n.e();
            } else if (i10 == NotificationCenter.starGiftsLoaded) {
                this.h.e();
                this.f36490n.e();
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.f21472c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.z5.a(new e(this, 27), org.telegram.ui.ActionBar.h6.f20559d6, org.telegram.ui.ActionBar.h6.G6, org.telegram.ui.ActionBar.h6.f20963z6, org.telegram.ui.ActionBar.h6.f20650i6, org.telegram.ui.ActionBar.h6.f20503a7, org.telegram.ui.ActionBar.h6.B6, org.telegram.ui.ActionBar.h6.f20780p7, org.telegram.ui.ActionBar.h6.f20596f6, org.telegram.ui.ActionBar.h6.f20615g6, org.telegram.ui.ActionBar.h6.O6, org.telegram.ui.ActionBar.h6.P6, org.telegram.ui.ActionBar.h6.Q6, org.telegram.ui.ActionBar.h6.R6);
    }

    @Override
    public final boolean isLightStatusBar() {
        ep0 ep0Var = this.f36481e;
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
        if (!this.f36474a && ((this.h.b() || this.f36490n.b()) && getUserConfig().isPremium())) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i10;
        int i11;
        boolean z11 = this.f36474a;
        if (!z11 && ((this.h.b() || this.f36490n.b()) && getUserConfig().isPremium())) {
            if (z10 && getVisibleDialog() == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                if (z11) {
                    i10 = R.string.ChannelColorUnsaved;
                } else {
                    i10 = R.string.UserColorUnsaved;
                }
                alertDialog$Builder.f20141a.R = LocaleController.getString(i10);
                if (z11) {
                    i11 = R.string.ChannelColorUnsavedMessage;
                } else {
                    i11 = R.string.UserColorUnsavedMessage;
                }
                alertDialog$Builder.f20141a.T = LocaleController.getString(i11);
                alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new yo0(this, 2));
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new yo0(this, 3));
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
                showDialog(a2Var);
                ((TextView) a2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20799q7));
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
        setBulletinDelegate(new ci.a9(11));
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
    public final void setResourceProvider(org.telegram.ui.ActionBar.c6 c6Var) {
        this.f36492s = c6Var;
    }

    public final void x0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cq0.x0():void");
    }

    public final void y0() {
        zf.b bVar;
        if (this.f36491r) {
            return;
        }
        if (this.f36474a) {
            finishFragment();
        } else if (!getUserConfig().isPremium()) {
            showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) this, 23, true));
            return;
        }
        wp0 C0 = C0();
        if (C0.I != null) {
            wp0 wp0Var = this.h;
            if (C0 == wp0Var) {
                wp0Var = this.f36490n;
            }
            wp0Var.d();
            this.f36491r = true;
            this.Q.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = C0.I;
            zo0 zo0Var = new zo0(this, 0);
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            if (tL_starGiftUnique.resale_ton_only) {
                bVar = zf.b.f54668b;
            } else {
                bVar = zf.b.f54667a;
            }
            yh.n5.x(this.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new cp0(this, bVar, tL_starGiftUnique, clientUserId, zo0Var));
            return;
        }
        wp0 wp0Var2 = this.h;
        if (C0 == wp0Var2) {
            wp0Var2 = this.f36490n;
        }
        if (wp0Var2.I != null) {
            wp0Var2.d();
        }
        x0();
        finishFragment();
        E0();
    }

    public final void z0() {
        this.f36495y.a(getThemedColor(org.telegram.ui.ActionBar.h6.f20559d6));
        this.O.invalidate();
        this.P.invalidate();
        this.h.f43600w.invalidate();
        this.h.f43601x.invalidate();
        this.f36490n.f43600w.invalidate();
        this.h.f43579b.invalidate();
        this.f36490n.f43579b.invalidate();
        ((ch.d) this.O.getBackground()).v();
        A0();
        Iterator it = this.f36482e0.iterator();
        while (it.hasNext()) {
            ((ch.d) it.next()).v();
        }
    }
}

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
public final class eq0 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public final bh.b E;
    public final gh.c F;
    public final bh.b G;
    public org.telegram.ui.ActionBar.m2 H;
    public di.h1 I;
    public ImageView J;
    public ImageView K;
    public FrameLayout L;
    public org.telegram.ui.Components.c00 M;
    public org.telegram.ui.ActionBar.h5 N;
    public FrameLayout O;
    public FrameLayout P;
    public di.d Q;
    public yp0 R;
    public boolean S;
    public org.telegram.ui.Components.yj0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public qc X;
    public float Y;
    public ValueAnimator Z;
    public final boolean f35347a;
    public boolean f35348a0;
    public final zh.f5 f35349b;
    public i0.b f35350b0;
    public final zh.f5 f35351c;
    public zf.c0 f35352c0;
    public l0 d;
    public final re.b f35353d0;
    public hp0 e;
    public final re.b f35354e0;
    public final int f35355f;
    public final bh.f f35356f0;
    public final gh.d f35357g0;
    public yp0 h;
    public final bh.b f35358h0;
    public final ab f35359i0;
    public final ArrayList f35360j0;
    public final ArrayList f35361k0;
    public yp0 f35362n;
    public boolean f35363r;
    public org.telegram.ui.ActionBar.c6 f35364s;
    public final SparseIntArray v;
    public final org.telegram.ui.ActionBar.d5 f35365w;
    public final org.telegram.ui.ActionBar.d5 f35366x;
    public final gh.c f35367y;

    public eq0() {
        super(null);
        this.f35355f = AndroidUtilities.dp(6.0f);
        this.v = new SparseIntArray();
        boolean q6 = org.telegram.ui.ActionBar.g6.I.q();
        this.S = q6;
        this.f35348a0 = q6;
        this.f35350b0 = i0.b.e;
        re.b bVar = new re.b();
        this.f35353d0 = bVar;
        re.b bVar2 = new re.b();
        this.f35354e0 = bVar2;
        this.f35359i0 = new ab(this, 1);
        this.f35360j0 = new ArrayList();
        this.f35361k0 = new ArrayList();
        gh.c cVar = new gh.c();
        this.f35367y = cVar;
        bh.b bVar3 = new bh.b(cVar);
        this.E = bVar3;
        gh.c cVar2 = new gh.c();
        this.F = cVar2;
        bh.b bVar4 = new bh.b(cVar2);
        this.G = bVar4;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            bh.f fVar = new bh.f(false);
            this.f35356f0 = fVar;
            gh.d dVar = new gh.d(cVar);
            this.f35357g0 = dVar;
            dVar.v = new dp0(this, 1);
            dVar.d = fVar;
            dVar.e = -2;
            dVar.f10156f = cVar;
            bh.b bVar5 = new bh.b(dVar);
            this.f35358h0 = bVar5;
            bVar5.f2751i = LiteMode.isEnabled(262144);
        } else {
            this.f35356f0 = null;
            this.f35357g0 = null;
            this.f35358h0 = new bh.b(cVar);
        }
        bVar3.e = bVar;
        bVar3.d = bVar2;
        bVar4.e = bVar;
        bVar4.d = bVar2;
        bh.b bVar6 = this.f35358h0;
        bVar6.e = bVar;
        bVar6.d = bVar2;
        this.f35347a = false;
        zh.n5.y(this.currentAccount, false).V();
        zh.f5 f5Var = new zh.f5(this.currentAccount, 0L, false);
        this.f35349b = f5Var;
        f5Var.f(8, false);
        f5Var.a();
        zh.f5 f5Var2 = new zh.f5(this.currentAccount, 0L, false);
        this.f35351c = f5Var2;
        f5Var2.f(8, false);
        f5Var2.f50505f = true;
        f5Var2.a();
        this.resourceProvider = new g(this, 29);
        this.f35365w = new org.telegram.ui.ActionBar.d5(0, false, false, this.resourceProvider);
        this.f35366x = new org.telegram.ui.ActionBar.d5(0, false, true, this.resourceProvider);
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

    public static void U(eq0 eq0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, cp0 cp0Var, zh.v2 v2Var, pf.c cVar) {
        zArr[0] = true;
        cVar.d();
        zh.n5.x(eq0Var.currentAccount, v2Var.f51234a).h(v2Var.f51235b, tL_starGiftUnique, j10, null, true, new bi.f0(17, cVar, cp0Var));
    }

    public static void V(eq0 eq0Var, ag.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, cp0 cp0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        zh.v2 v2Var = new zh.v2(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        zh.x2 x2Var = new zh.x2(eq0Var.getParentActivity(), eq0Var.resourceProvider, tL_starGiftUnique, v2Var, eq0Var.currentAccount, j10, org.telegram.messenger.g0.h(tL_starGiftUnique.num, ',', sb2), false, new gp0(eq0Var, zArr, tL_starGiftUnique, j10, cp0Var, 0));
        x2Var.h.setOnDismissListener(new fi.d0(10, zArr, cp0Var));
        x2Var.b();
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
        return org.telegram.ui.ActionBar.g6.b(0.5f, f7, i10);
    }

    public final void A0() {
        int themedColor;
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6)) > 0.72d) {
            themedColor = i0.a.d(0.085f, getThemedColor(org.telegram.ui.ActionBar.g6.f19543a7), this.e.getColor());
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.f19543a7);
        }
        this.d.setBackgroundColor(themedColor);
        gh.c cVar = this.F;
        if (cVar.f10152a.getColor() != themedColor) {
            cVar.a(themedColor);
            Iterator it = this.f35354e0.iterator();
            while (it.hasNext()) {
                ((dh.d) it.next()).v();
            }
            Iterator it2 = this.f35353d0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final yp0 C0() {
        di.h1 h1Var = this.I;
        if (h1Var != null && h1Var.getPositionAnimated() >= 0.5f) {
            return this.h;
        }
        return this.f35362n;
    }

    public final void D0(int i10) {
        if (Build.VERSION.SDK_INT >= 31 && this.f35356f0 != null) {
            zf.c0 c0Var = this.f35352c0;
            if (c0Var.f50142c == 0) {
                c0Var.invalidate();
            }
            c0Var.f50142c = i10 | c0Var.f50142c;
        }
    }

    public final void E0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eq0.E0():void");
    }

    public final void F0() {
        org.telegram.ui.ActionBar.h5 h5Var = this.N;
        if (h5Var != null) {
            h5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.A8));
        }
        this.h.g();
        this.f35362n.g();
        hp0 hp0Var = this.e;
        if (hp0Var != null) {
            hp0Var.f37473a = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19543a7, hp0Var.f37474b);
            hp0Var.a();
            hp0Var.invalidate();
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
                di.h1 h1Var = this.I;
                if (h1Var == null) {
                    positionAnimated = 0.0f;
                } else {
                    positionAnimated = h1Var.getPositionAnimated();
                }
                float a2 = w7.r.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f);
                org.telegram.ui.Components.c00 c00Var = this.M;
                int d = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
                int d10 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.g6.f19543a7));
                int d11 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.g6.f20005z6));
                int d12 = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                c00Var.f23594a.setColor(d);
                c00Var.f23595b.setColor(d10);
                c00Var.d = d11;
                c00Var.e = d12;
                c00Var.invalidate();
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
        l0 l0Var = new l0(this, context, 15);
        this.d = l0Var;
        this.fragmentView = l0Var;
        this.f35352c0 = new zf.c0(context, new bp0(this, 0));
        ih.j jVar = new ih.j(this.d);
        l0 l0Var2 = this.d;
        bh.b bVar = this.f35358h0;
        bVar.f2749f = jVar;
        bVar.f2750g = l0Var2;
        this.h = new yp0(this, context, 1);
        this.f35362n = new yp0(this, context, 0);
        hp0 hp0Var = new hp0(this, context, this.resourceProvider);
        this.e = hp0Var;
        hp0Var.E = true;
        this.f35362n.j(false);
        this.f35362n.addView(this.e, 2, w7.z5.e(-1, -2, 55));
        di.h1 h1Var = new di.h1(this, context, 4);
        this.I = h1Var;
        h1Var.setAdapter(new ip0(this, 0));
        l0Var.addView(this.I, w7.z5.e(-1, -1, 119));
        di.d dVar = new di.d(context, getResourceProvider(), true);
        this.Q = dVar;
        dVar.setStateListAnimator(null);
        this.Q.e();
        this.Q.d.r(true, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final eq0 f35344b;

            {
                this.f35344b = this;
            }

            @Override
            public final void onClick(View view) {
                int i12 = r2;
                eq0 eq0Var = this.f35344b;
                switch (i12) {
                    case 0:
                        eq0Var.y0();
                        return;
                    case 1:
                        if (eq0Var.onBackPressed(true)) {
                            eq0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        eq0 eq0Var2 = this.f35344b;
                        FrameLayout frameLayout2 = (FrameLayout) eq0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        eq0Var2.K.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        eq0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        eq0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        qc qcVar = new qc(eq0Var2, eq0Var2.getParentActivity(), canvas, (eq0Var2.K.getMeasuredWidth() / 2.0f) + f7, (eq0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        eq0Var2.X = qcVar;
                        qcVar.setOnTouchListener(new ci.d(2));
                        eq0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        eq0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new di.tb(eq0Var2, 2));
                        eq0Var2.Z.addListener(new kj0(eq0Var2, 3));
                        eq0Var2.Z.setDuration(400L);
                        eq0Var2.Z.setInterpolator(org.telegram.ui.Components.xt.e);
                        eq0Var2.Z.start();
                        frameLayout2.addView(eq0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new dp0(eq0Var2, 0));
                        return;
                }
            }
        });
        this.O.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.O.addView(this.Q, w7.z5.d(-1.0f, -1));
        FrameLayout frameLayout2 = this.O;
        dh.d c10 = this.E.c(frameLayout2, null, false);
        c10.o(fh.b.j(this.resourceProvider));
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(5.0f));
        frameLayout2.setBackground(c10);
        w7.b6.b(this.O, 0.02f, 1.5f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.P = frameLayout3;
        frameLayout3.addView(this.O, w7.z5.a(64.0f, 4.0f, 0.0f, 4.0f, 0.0f, -1, 80));
        bh.c cVar = new bh.c(this.G.c(this.P, null, false));
        cVar.b(AndroidUtilities.dp(40.0f), true);
        cVar.f2765q = 220;
        this.P.setBackground(cVar);
        yp0 C0 = C0();
        di.d dVar2 = this.Q;
        if (dVar2 != null && C0 != null && C0 != this.R) {
            this.R = C0;
            n3.b bVar2 = C0.e;
            dVar2.g((CharSequence) bVar2.f15703b, false, true);
            this.Q.f((SpannableStringBuilder) bVar2.f15704c, false);
        }
        l0Var.addView(this.P, w7.z5.e(-1, -2, 80));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.L = frameLayout4;
        l0Var.addView(frameLayout4, w7.z5.e(-1, -2, 55));
        boolean z10 = this.f35347a;
        if (!z10) {
            org.telegram.ui.Components.c00 c00Var = new org.telegram.ui.Components.c00(context);
            this.M = c00Var;
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
            c00Var.setTabs(string, LocaleController.getString(i11));
            this.M.f23599r = new cp0(this, 1);
            G0();
            this.L.addView(this.M, w7.z5.e(-1, 40, 17));
        } else {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
            this.N = h5Var;
            h5Var.l(LocaleController.getString(R.string.ChannelColorTitle2), false);
            this.N.setEllipsizeByGradient(true);
            this.N.setTextSize(20);
            this.N.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.A8));
            this.N.setTypeface(AndroidUtilities.bold());
            this.L.addView(this.N, w7.z5.a(-2.0f, 72.0f, 0.0f, 72.0f, 0.0f, -2, 19));
        }
        hp0 hp0Var2 = this.e;
        if (hp0Var2 != null) {
            hp0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                AndroidUtilities.setLightStatusBar(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.J;
        int i12 = org.telegram.ui.ActionBar.g6.f19918u8;
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i12), 1, -1));
        this.J.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.J;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.J.setOnClickListener(new View.OnClickListener(this) {
            public final eq0 f35344b;

            {
                this.f35344b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                eq0 eq0Var = this.f35344b;
                switch (i122) {
                    case 0:
                        eq0Var.y0();
                        return;
                    case 1:
                        if (eq0Var.onBackPressed(true)) {
                            eq0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        eq0 eq0Var2 = this.f35344b;
                        FrameLayout frameLayout22 = (FrameLayout) eq0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        eq0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        eq0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        eq0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        qc qcVar = new qc(eq0Var2, eq0Var2.getParentActivity(), canvas, (eq0Var2.K.getMeasuredWidth() / 2.0f) + f7, (eq0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        eq0Var2.X = qcVar;
                        qcVar.setOnTouchListener(new ci.d(2));
                        eq0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        eq0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new di.tb(eq0Var2, 2));
                        eq0Var2.Z.addListener(new kj0(eq0Var2, 3));
                        eq0Var2.Z.setDuration(400L);
                        eq0Var2.Z.setInterpolator(org.telegram.ui.Components.xt.e);
                        eq0Var2.Z.start();
                        frameLayout22.addView(eq0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new dp0(eq0Var2, 0));
                        return;
                }
            }
        });
        w7.b6.a(this.J);
        this.L.addView(this.J, w7.z5.e(54, 54, 19));
        org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.T = yj0Var;
        yj0Var.h = true;
        if (!this.S) {
            yj0Var.P(0);
            this.T.M(0);
        } else {
            yj0Var.M(35);
            this.T.P(36);
        }
        this.T.Z = true;
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.J9, false);
        this.T.Q(x02, "Sunny");
        this.T.Q(x02, "Path 6");
        this.T.Q(x02, "Path");
        this.T.Q(x02, "Path 5");
        this.T.o();
        ImageView imageView4 = new ImageView(context);
        this.K = imageView4;
        imageView4.setScaleType(scaleType);
        this.K.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i12), 1, -1));
        this.K.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) {
            public final eq0 f35344b;

            {
                this.f35344b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                eq0 eq0Var = this.f35344b;
                switch (i122) {
                    case 0:
                        eq0Var.y0();
                        return;
                    case 1:
                        if (eq0Var.onBackPressed(true)) {
                            eq0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        eq0 eq0Var2 = this.f35344b;
                        FrameLayout frameLayout22 = (FrameLayout) eq0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        eq0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        eq0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        eq0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        qc qcVar = new qc(eq0Var2, eq0Var2.getParentActivity(), canvas, (eq0Var2.K.getMeasuredWidth() / 2.0f) + f7, (eq0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        eq0Var2.X = qcVar;
                        qcVar.setOnTouchListener(new ci.d(2));
                        eq0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        eq0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new di.tb(eq0Var2, 2));
                        eq0Var2.Z.addListener(new kj0(eq0Var2, 3));
                        eq0Var2.Z.setDuration(400L);
                        eq0Var2.Z.setInterpolator(org.telegram.ui.Components.xt.e);
                        eq0Var2.Z.start();
                        frameLayout22.addView(eq0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new dp0(eq0Var2, 0));
                        return;
                }
            }
        });
        this.L.addView(this.K, w7.z5.e(54, 54, 21));
        this.K.setImageDrawable(this.T);
        hp0 hp0Var3 = this.e;
        hp0Var3.getClass();
        hp0Var3.f37473a = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19543a7, hp0Var3.f37474b);
        hp0Var3.a();
        hp0Var3.invalidate();
        z0();
        this.d.addView(this.f35352c0);
        A0();
        View view = this.fragmentView;
        bp0 bp0Var = new bp0(this, 1);
        WeakHashMap weakHashMap = r0.i0.f43485a;
        r0.a0.i(view, bp0Var);
        return this.d;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.h.f(true);
                this.f35362n.f(true);
            } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
                this.h.e();
                this.f35362n.e();
            } else if (i10 == NotificationCenter.starGiftsLoaded) {
                this.h.e();
                this.f35362n.e();
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.f20528c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.c6.a(new e(this, 27), org.telegram.ui.ActionBar.g6.f19601d6, org.telegram.ui.ActionBar.g6.G6, org.telegram.ui.ActionBar.g6.f20005z6, org.telegram.ui.ActionBar.g6.f19690i6, org.telegram.ui.ActionBar.g6.f19543a7, org.telegram.ui.ActionBar.g6.B6, org.telegram.ui.ActionBar.g6.f19822p7, org.telegram.ui.ActionBar.g6.f19637f6, org.telegram.ui.ActionBar.g6.f19654g6, org.telegram.ui.ActionBar.g6.O6, org.telegram.ui.ActionBar.g6.P6, org.telegram.ui.ActionBar.g6.Q6, org.telegram.ui.ActionBar.g6.R6);
    }

    @Override
    public final boolean isLightStatusBar() {
        hp0 hp0Var = this.e;
        if (hp0Var == null) {
            return super.isLightStatusBar();
        }
        if (i0.a.f(hp0Var.getColor()) > 0.699999988079071d) {
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
        if (!this.f35347a && ((this.h.b() || this.f35362n.b()) && getUserConfig().isPremium())) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i10;
        int i11;
        boolean z11 = this.f35347a;
        if (!z11 && ((this.h.b() || this.f35362n.b()) && getUserConfig().isPremium())) {
            if (z10 && getVisibleDialog() == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                if (z11) {
                    i10 = R.string.ChannelColorUnsaved;
                } else {
                    i10 = R.string.UserColorUnsaved;
                }
                alertDialog$Builder.f19248a.R = LocaleController.getString(i10);
                if (z11) {
                    i11 = R.string.ChannelColorUnsavedMessage;
                } else {
                    i11 = R.string.UserColorUnsavedMessage;
                }
                alertDialog$Builder.f19248a.T = LocaleController.getString(i11);
                alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new bp0(this, 2));
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new bp0(this, 3));
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                showDialog(a2Var);
                ((TextView) a2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19839q7));
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
        setBulletinDelegate(new di.z8(11));
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
        this.f35364s = c6Var;
    }

    public final void x0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eq0.x0():void");
    }

    public final void y0() {
        ag.b bVar;
        if (this.f35363r) {
            return;
        }
        if (this.f35347a) {
            finishFragment();
        } else if (!getUserConfig().isPremium()) {
            showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) this, 23, true));
            return;
        }
        yp0 C0 = C0();
        if (C0.I != null) {
            yp0 yp0Var = this.h;
            if (C0 == yp0Var) {
                yp0Var = this.f35362n;
            }
            yp0Var.d();
            this.f35363r = true;
            this.Q.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = C0.I;
            cp0 cp0Var = new cp0(this, 0);
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            if (tL_starGiftUnique.resale_ton_only) {
                bVar = ag.b.f634b;
            } else {
                bVar = ag.b.f633a;
            }
            zh.n5.x(this.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new fp0(this, bVar, tL_starGiftUnique, clientUserId, cp0Var));
            return;
        }
        yp0 yp0Var2 = this.h;
        if (C0 == yp0Var2) {
            yp0Var2 = this.f35362n;
        }
        if (yp0Var2.I != null) {
            yp0Var2.d();
        }
        x0();
        finishFragment();
        E0();
    }

    public final void z0() {
        this.f35367y.a(getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
        this.O.invalidate();
        this.P.invalidate();
        this.h.f41883w.invalidate();
        this.h.f41884x.invalidate();
        this.f35362n.f41883w.invalidate();
        this.h.f41863b.invalidate();
        this.f35362n.f41863b.invalidate();
        ((dh.d) this.O.getBackground()).v();
        A0();
        Iterator it = this.f35354e0.iterator();
        while (it.hasNext()) {
            ((dh.d) it.next()).v();
        }
    }
}

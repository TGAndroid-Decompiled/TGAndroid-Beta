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
public final class ip0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final bh.b E;
    public final gh.c F;
    public final bh.b G;
    public org.telegram.ui.ActionBar.n2 H;
    public ei.h1 I;
    public ImageView J;
    public ImageView K;
    public FrameLayout L;
    public org.telegram.ui.Components.zz M;
    public org.telegram.ui.ActionBar.j5 N;
    public FrameLayout O;
    public FrameLayout P;
    public ei.d Q;
    public cp0 R;
    public boolean S;
    public org.telegram.ui.Components.vj0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public lc X;
    public float Y;
    public ValueAnimator Z;
    public final boolean f38084a;
    public boolean f38085a0;
    public final ai.y9 f38086b;
    public i0.b f38087b0;
    public final ai.y9 f38088c;
    public zf.b0 f38089c0;
    public m0 d;
    public final re.b f38090d0;
    public lo0 e;
    public final re.b f38091e0;
    public final int f38092f;
    public final bh.f f38093f0;
    public final gh.d f38094g0;
    public cp0 h;
    public final bh.b f38095h0;
    public final wa f38096i0;
    public final ArrayList f38097j0;
    public final ArrayList f38098k0;
    public cp0 f38099n;
    public boolean f38100r;
    public org.telegram.ui.ActionBar.d6 f38101s;
    public final SparseIntArray v;
    public final org.telegram.ui.ActionBar.f5 f38102w;
    public final org.telegram.ui.ActionBar.f5 f38103x;
    public final gh.c f38104y;

    public ip0() {
        super(null);
        this.f38092f = AndroidUtilities.dp(6.0f);
        this.v = new SparseIntArray();
        boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
        this.S = q6;
        this.f38085a0 = q6;
        this.f38087b0 = i0.b.e;
        re.b bVar = new re.b();
        this.f38090d0 = bVar;
        re.b bVar2 = new re.b();
        this.f38091e0 = bVar2;
        this.f38096i0 = new wa(this, 1);
        this.f38097j0 = new ArrayList();
        this.f38098k0 = new ArrayList();
        gh.c cVar = new gh.c();
        this.f38104y = cVar;
        bh.b bVar3 = new bh.b(cVar);
        this.E = bVar3;
        gh.c cVar2 = new gh.c();
        this.F = cVar2;
        bh.b bVar4 = new bh.b(cVar2);
        this.G = bVar4;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            bh.f fVar = new bh.f(false);
            this.f38093f0 = fVar;
            gh.d dVar = new gh.d(cVar);
            this.f38094g0 = dVar;
            dVar.v = new ho0(this, 1);
            dVar.d = fVar;
            dVar.e = -2;
            dVar.f11059f = cVar;
            bh.b bVar5 = new bh.b(dVar);
            this.f38095h0 = bVar5;
            bVar5.f4360i = LiteMode.isEnabled(262144);
        } else {
            this.f38093f0 = null;
            this.f38094g0 = null;
            this.f38095h0 = new bh.b(cVar);
        }
        bVar3.e = bVar;
        bVar3.d = bVar2;
        bVar4.e = bVar;
        bVar4.d = bVar2;
        bh.b bVar6 = this.f38095h0;
        bVar6.e = bVar;
        bVar6.d = bVar2;
        this.f38084a = false;
        ai.ga.y(this.currentAccount, false).V();
        ai.y9 y9Var = new ai.y9(this.currentAccount, 0L, false);
        this.f38086b = y9Var;
        y9Var.g(8, false);
        y9Var.a();
        ai.y9 y9Var2 = new ai.y9(this.currentAccount, 0L, false);
        this.f38088c = y9Var2;
        y9Var2.g(8, false);
        y9Var2.f2499f = true;
        y9Var2.a();
        this.resourceProvider = new ko0(this, 0);
        this.f38102w = new org.telegram.ui.ActionBar.f5(0, false, false, this.resourceProvider);
        this.f38103x = new org.telegram.ui.ActionBar.f5(0, false, true, this.resourceProvider);
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

    public static void U(ip0 ip0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, go0 go0Var, ai.i6 i6Var, pf.c cVar) {
        zArr[0] = true;
        cVar.d();
        ai.ga.x(ip0Var.currentAccount, i6Var.f1489a).h(i6Var.f1490b, tL_starGiftUnique, j10, null, true, new ai.r5(21, cVar, go0Var));
    }

    public static void V(ip0 ip0Var, ag.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, go0 go0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        ai.i6 i6Var = new ai.i6(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        ai.l6 l6Var = new ai.l6(ip0Var.getParentActivity(), ip0Var.resourceProvider, tL_starGiftUnique, i6Var, ip0Var.currentAccount, j10, org.telegram.messenger.g0.h(tL_starGiftUnique.num, ',', sb2), false, new ai.b4(ip0Var, zArr, tL_starGiftUnique, j10, go0Var, 1));
        l6Var.h.setOnDismissListener(new ai.z3(12, zArr, go0Var));
        l6Var.b();
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
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.h6.f20994d6)) > 0.72d) {
            themedColor = i0.a.f(0.085f, getThemedColor(org.telegram.ui.ActionBar.h6.f20936a7), this.e.getColor());
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.f20936a7);
        }
        this.d.setBackgroundColor(themedColor);
        gh.c cVar = this.F;
        if (cVar.f11055a.getColor() != themedColor) {
            cVar.a(themedColor);
            Iterator it = this.f38091e0.iterator();
            while (it.hasNext()) {
                ((dh.d) it.next()).v();
            }
            Iterator it2 = this.f38090d0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final cp0 C0() {
        ei.h1 h1Var = this.I;
        if (h1Var != null && h1Var.getPositionAnimated() >= 0.5f) {
            return this.h;
        }
        return this.f38099n;
    }

    public final void D0(int i10) {
        if (Build.VERSION.SDK_INT >= 31 && this.f38093f0 != null) {
            zf.b0 b0Var = this.f38089c0;
            if (b0Var.f51532c == 0) {
                b0Var.invalidate();
            }
            b0Var.f51532c = i10 | b0Var.f51532c;
        }
    }

    public final void E0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ip0.E0():void");
    }

    public final void F0() {
        org.telegram.ui.ActionBar.j5 j5Var = this.N;
        if (j5Var != null) {
            j5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.A8));
        }
        this.h.g();
        this.f38099n.g();
        lo0 lo0Var = this.e;
        if (lo0Var != null) {
            lo0Var.f39946a = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20936a7, lo0Var.f39947b);
            lo0Var.a();
            lo0Var.invalidate();
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
                ei.h1 h1Var = this.I;
                if (h1Var == null) {
                    positionAnimated = 0.0f;
                } else {
                    positionAnimated = h1Var.getPositionAnimated();
                }
                float a2 = w7.r.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f);
                org.telegram.ui.Components.zz zzVar = this.M;
                int f7 = i0.a.f(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.h6.f20994d6));
                int f10 = i0.a.f(a2, -1, getThemedColor(org.telegram.ui.ActionBar.h6.f20936a7));
                int f11 = i0.a.f(a2, -1, getThemedColor(org.telegram.ui.ActionBar.h6.f21399z6));
                int f12 = i0.a.f(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                zzVar.f33071a.setColor(f7);
                zzVar.f33072b.setColor(f10);
                zzVar.d = f11;
                zzVar.e = f12;
                zzVar.invalidate();
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
        m0 m0Var = new m0(this, context, 15);
        this.d = m0Var;
        this.fragmentView = m0Var;
        this.f38089c0 = new zf.b0(context, new fo0(this, 0));
        ih.j jVar = new ih.j(this.d);
        m0 m0Var2 = this.d;
        bh.b bVar = this.f38095h0;
        bVar.f4358f = jVar;
        bVar.f4359g = m0Var2;
        this.h = new cp0(this, context, 1);
        this.f38099n = new cp0(this, context, 0);
        lo0 lo0Var = new lo0(this, context, this.resourceProvider);
        this.e = lo0Var;
        lo0Var.E = true;
        this.f38099n.j(false);
        this.f38099n.addView(this.e, 2, w7.z5.e(-1, -2, 55));
        ei.h1 h1Var = new ei.h1(this, context, 4);
        this.I = h1Var;
        h1Var.setAdapter(new mo0(this, 0));
        m0Var.addView(this.I, w7.z5.e(-1, -1, 119));
        ei.d dVar = new ei.d(context, getResourceProvider(), true);
        this.Q = dVar;
        dVar.setStateListAnimator(null);
        this.Q.e();
        this.Q.d.r(true, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final ip0 f38073b;

            {
                this.f38073b = this;
            }

            @Override
            public final void onClick(View view) {
                int i12 = r2;
                ip0 ip0Var = this.f38073b;
                switch (i12) {
                    case 0:
                        ip0Var.y0();
                        return;
                    case 1:
                        if (ip0Var.onBackPressed(true)) {
                            ip0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        ip0 ip0Var2 = this.f38073b;
                        FrameLayout frameLayout2 = (FrameLayout) ip0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        ip0Var2.K.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        ip0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        ip0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        lc lcVar = new lc(ip0Var2, ip0Var2.getParentActivity(), canvas, (ip0Var2.K.getMeasuredWidth() / 2.0f) + f7, (ip0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        ip0Var2.X = lcVar;
                        lcVar.setOnTouchListener(new di.d(2));
                        ip0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ip0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ei.eb(ip0Var2, 2));
                        ip0Var2.Z.addListener(new zb0(ip0Var2, 5));
                        ip0Var2.Z.setDuration(400L);
                        ip0Var2.Z.setInterpolator(org.telegram.ui.Components.st.e);
                        ip0Var2.Z.start();
                        frameLayout2.addView(ip0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new ho0(ip0Var2, 0));
                        return;
                }
            }
        });
        this.O.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.O.addView(this.Q, w7.z5.c(-1.0f, -1));
        FrameLayout frameLayout2 = this.O;
        dh.d c10 = this.E.c(frameLayout2, null, false);
        c10.o(fh.c.j(this.resourceProvider));
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(5.0f));
        frameLayout2.setBackground(c10);
        w7.b6.b(this.O, 0.02f, 1.5f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.P = frameLayout3;
        frameLayout3.addView(this.O, w7.z5.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        bh.c cVar = new bh.c(this.G.c(this.P, null, false));
        cVar.b(AndroidUtilities.dp(40.0f), true);
        cVar.f4374q = 220;
        this.P.setBackground(cVar);
        cp0 C0 = C0();
        ei.d dVar2 = this.Q;
        if (dVar2 != null && C0 != null && C0 != this.R) {
            this.R = C0;
            n2.e eVar = C0.e;
            dVar2.g((CharSequence) eVar.f17039b, false, true);
            this.Q.f((SpannableStringBuilder) eVar.f17040c, false);
        }
        m0Var.addView(this.P, w7.z5.e(-1, -2, 80));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.L = frameLayout4;
        m0Var.addView(frameLayout4, w7.z5.e(-1, -2, 55));
        boolean z10 = this.f38084a;
        if (!z10) {
            org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context);
            this.M = zzVar;
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
            zzVar.setTabs(string, LocaleController.getString(i11));
            this.M.f33076r = new go0(this, 1);
            G0();
            this.L.addView(this.M, w7.z5.e(-1, 40, 17));
        } else {
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
            this.N = j5Var;
            j5Var.l(LocaleController.getString(R.string.ChannelColorTitle2), false);
            this.N.setEllipsizeByGradient(true);
            this.N.setTextSize(20);
            this.N.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.A8));
            this.N.setTypeface(AndroidUtilities.bold());
            this.L.addView(this.N, w7.z5.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        }
        lo0 lo0Var2 = this.e;
        if (lo0Var2 != null) {
            lo0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                AndroidUtilities.setLightStatusBar(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.J;
        int i12 = org.telegram.ui.ActionBar.h6.f21312u8;
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i12), 1, -1));
        this.J.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.J;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.J.setOnClickListener(new View.OnClickListener(this) {
            public final ip0 f38073b;

            {
                this.f38073b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                ip0 ip0Var = this.f38073b;
                switch (i122) {
                    case 0:
                        ip0Var.y0();
                        return;
                    case 1:
                        if (ip0Var.onBackPressed(true)) {
                            ip0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        ip0 ip0Var2 = this.f38073b;
                        FrameLayout frameLayout22 = (FrameLayout) ip0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        ip0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        ip0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        ip0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        lc lcVar = new lc(ip0Var2, ip0Var2.getParentActivity(), canvas, (ip0Var2.K.getMeasuredWidth() / 2.0f) + f7, (ip0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        ip0Var2.X = lcVar;
                        lcVar.setOnTouchListener(new di.d(2));
                        ip0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ip0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ei.eb(ip0Var2, 2));
                        ip0Var2.Z.addListener(new zb0(ip0Var2, 5));
                        ip0Var2.Z.setDuration(400L);
                        ip0Var2.Z.setInterpolator(org.telegram.ui.Components.st.e);
                        ip0Var2.Z.start();
                        frameLayout22.addView(ip0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new ho0(ip0Var2, 0));
                        return;
                }
            }
        });
        w7.b6.a(this.J);
        this.L.addView(this.J, w7.z5.e(54, 54, 19));
        org.telegram.ui.Components.vj0 vj0Var = new org.telegram.ui.Components.vj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.T = vj0Var;
        vj0Var.h = true;
        if (!this.S) {
            vj0Var.P(0);
            this.T.M(0);
        } else {
            vj0Var.M(35);
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
            public final ip0 f38073b;

            {
                this.f38073b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                ip0 ip0Var = this.f38073b;
                switch (i122) {
                    case 0:
                        ip0Var.y0();
                        return;
                    case 1:
                        if (ip0Var.onBackPressed(true)) {
                            ip0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        ip0 ip0Var2 = this.f38073b;
                        FrameLayout frameLayout22 = (FrameLayout) ip0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        ip0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        ip0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        ip0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        lc lcVar = new lc(ip0Var2, ip0Var2.getParentActivity(), canvas, (ip0Var2.K.getMeasuredWidth() / 2.0f) + f7, (ip0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        ip0Var2.X = lcVar;
                        lcVar.setOnTouchListener(new di.d(2));
                        ip0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ip0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ei.eb(ip0Var2, 2));
                        ip0Var2.Z.addListener(new zb0(ip0Var2, 5));
                        ip0Var2.Z.setDuration(400L);
                        ip0Var2.Z.setInterpolator(org.telegram.ui.Components.st.e);
                        ip0Var2.Z.start();
                        frameLayout22.addView(ip0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new ho0(ip0Var2, 0));
                        return;
                }
            }
        });
        this.L.addView(this.K, w7.z5.e(54, 54, 21));
        this.K.setImageDrawable(this.T);
        lo0 lo0Var3 = this.e;
        lo0Var3.getClass();
        lo0Var3.f39946a = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20936a7, lo0Var3.f39947b);
        lo0Var3.a();
        lo0Var3.invalidate();
        z0();
        this.d.addView(this.f38089c0);
        A0();
        View view = this.fragmentView;
        fo0 fo0Var = new fo0(this, 1);
        WeakHashMap weakHashMap = r0.i0.f44830a;
        r0.a0.i(view, fo0Var);
        return this.d;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.h.f(true);
                this.f38099n.f(true);
            } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
                this.h.e();
                this.f38099n.e();
            } else if (i10 == NotificationCenter.starGiftsLoaded) {
                this.h.e();
                this.f38099n.e();
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.z3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.z3.f21919c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.c6.a(new e(this, 27), org.telegram.ui.ActionBar.h6.f20994d6, org.telegram.ui.ActionBar.h6.G6, org.telegram.ui.ActionBar.h6.f21399z6, org.telegram.ui.ActionBar.h6.f21083i6, org.telegram.ui.ActionBar.h6.f20936a7, org.telegram.ui.ActionBar.h6.B6, org.telegram.ui.ActionBar.h6.f21215p7, org.telegram.ui.ActionBar.h6.f21030f6, org.telegram.ui.ActionBar.h6.f21047g6, org.telegram.ui.ActionBar.h6.O6, org.telegram.ui.ActionBar.h6.P6, org.telegram.ui.ActionBar.h6.Q6, org.telegram.ui.ActionBar.h6.R6);
    }

    @Override
    public final boolean isLightStatusBar() {
        lo0 lo0Var = this.e;
        if (lo0Var == null) {
            return super.isLightStatusBar();
        }
        if (i0.a.h(lo0Var.getColor()) > 0.699999988079071d) {
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
        if (!this.f38084a && ((this.h.b() || this.f38099n.b()) && getUserConfig().isPremium())) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i10;
        int i11;
        boolean z11 = this.f38084a;
        if (!z11 && ((this.h.b() || this.f38099n.b()) && getUserConfig().isPremium())) {
            if (z10 && getVisibleDialog() == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                if (z11) {
                    i10 = R.string.ChannelColorUnsaved;
                } else {
                    i10 = R.string.UserColorUnsaved;
                }
                alertDialog$Builder.f20609a.R = LocaleController.getString(i10);
                if (z11) {
                    i11 = R.string.ChannelColorUnsavedMessage;
                } else {
                    i11 = R.string.UserColorUnsavedMessage;
                }
                alertDialog$Builder.f20609a.T = LocaleController.getString(i11);
                alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new fo0(this, 2));
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new fo0(this, 3));
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
                showDialog(b2Var);
                ((TextView) b2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21232q7));
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
        setBulletinDelegate(new ei.o8(11));
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
    public final void setResourceProvider(org.telegram.ui.ActionBar.d6 d6Var) {
        this.f38101s = d6Var;
    }

    public final void x0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ip0.x0():void");
    }

    public final void y0() {
        ag.b bVar;
        if (this.f38100r) {
            return;
        }
        if (this.f38084a) {
            finishFragment();
        } else if (!getUserConfig().isPremium()) {
            showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) this, 23, true));
            return;
        }
        cp0 C0 = C0();
        if (C0.I != null) {
            cp0 cp0Var = this.h;
            if (C0 == cp0Var) {
                cp0Var = this.f38099n;
            }
            cp0Var.d();
            this.f38100r = true;
            this.Q.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = C0.I;
            go0 go0Var = new go0(this, 0);
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            if (tL_starGiftUnique.resale_ton_only) {
                bVar = ag.b.f634b;
            } else {
                bVar = ag.b.f633a;
            }
            ai.ga.x(this.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new jo0(this, bVar, tL_starGiftUnique, clientUserId, go0Var));
            return;
        }
        cp0 cp0Var2 = this.h;
        if (C0 == cp0Var2) {
            cp0Var2 = this.f38099n;
        }
        if (cp0Var2.I != null) {
            cp0Var2.d();
        }
        x0();
        finishFragment();
        E0();
    }

    public final void z0() {
        this.f38104y.a(getThemedColor(org.telegram.ui.ActionBar.h6.f20994d6));
        this.O.invalidate();
        this.P.invalidate();
        this.h.f36045w.invalidate();
        this.h.f36046x.invalidate();
        this.f38099n.f36045w.invalidate();
        this.h.f36025b.invalidate();
        this.f38099n.f36025b.invalidate();
        ((dh.d) this.O.getBackground()).v();
        A0();
        Iterator it = this.f38091e0.iterator();
        while (it.hasNext()) {
            ((dh.d) it.next()).v();
        }
    }
}

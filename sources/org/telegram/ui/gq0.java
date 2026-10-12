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
public final class gq0 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
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
    public aq0 R;
    public boolean S;
    public org.telegram.ui.Components.yj0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public rc X;
    public float Y;
    public ValueAnimator Z;
    public final boolean f36448a;
    public boolean f36449a0;
    public final zh.f5 f36450b;
    public i0.b f36451b0;
    public final zh.f5 f36452c;
    public zf.c0 f36453c0;
    public l0 d;
    public final re.b f36454d0;
    public jp0 e;
    public final re.b f36455e0;
    public final int f36456f;
    public final bh.f f36457f0;
    public final gh.d f36458g0;
    public aq0 h;
    public final bh.b f36459h0;
    public final ab f36460i0;
    public final ArrayList f36461j0;
    public final ArrayList f36462k0;
    public aq0 f36463n;
    public boolean f36464r;
    public org.telegram.ui.ActionBar.c6 f36465s;
    public final SparseIntArray v;
    public final org.telegram.ui.ActionBar.d5 f36466w;
    public final org.telegram.ui.ActionBar.d5 f36467x;
    public final gh.c f36468y;

    public gq0() {
        super(null);
        this.f36456f = AndroidUtilities.dp(6.0f);
        this.v = new SparseIntArray();
        boolean q6 = org.telegram.ui.ActionBar.g6.I.q();
        this.S = q6;
        this.f36449a0 = q6;
        this.f36451b0 = i0.b.e;
        re.b bVar = new re.b();
        this.f36454d0 = bVar;
        re.b bVar2 = new re.b();
        this.f36455e0 = bVar2;
        this.f36460i0 = new ab(this, 1);
        this.f36461j0 = new ArrayList();
        this.f36462k0 = new ArrayList();
        gh.c cVar = new gh.c();
        this.f36468y = cVar;
        bh.b bVar3 = new bh.b(cVar);
        this.E = bVar3;
        gh.c cVar2 = new gh.c();
        this.F = cVar2;
        bh.b bVar4 = new bh.b(cVar2);
        this.G = bVar4;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            bh.f fVar = new bh.f(false);
            this.f36457f0 = fVar;
            gh.d dVar = new gh.d(cVar);
            this.f36458g0 = dVar;
            dVar.v = new fp0(this, 1);
            dVar.d = fVar;
            dVar.e = -2;
            dVar.f10152f = cVar;
            bh.b bVar5 = new bh.b(dVar);
            this.f36459h0 = bVar5;
            bVar5.f2747i = LiteMode.isEnabled(262144);
        } else {
            this.f36457f0 = null;
            this.f36458g0 = null;
            this.f36459h0 = new bh.b(cVar);
        }
        bVar3.e = bVar;
        bVar3.d = bVar2;
        bVar4.e = bVar;
        bVar4.d = bVar2;
        bh.b bVar6 = this.f36459h0;
        bVar6.e = bVar;
        bVar6.d = bVar2;
        this.f36448a = false;
        zh.n5.y(this.currentAccount, false).V();
        zh.f5 f5Var = new zh.f5(this.currentAccount, 0L, false);
        this.f36450b = f5Var;
        f5Var.f(8, false);
        f5Var.a();
        zh.f5 f5Var2 = new zh.f5(this.currentAccount, 0L, false);
        this.f36452c = f5Var2;
        f5Var2.f(8, false);
        f5Var2.f50504f = true;
        f5Var2.a();
        this.resourceProvider = new g(this, 29);
        this.f36466w = new org.telegram.ui.ActionBar.d5(0, false, false, this.resourceProvider);
        this.f36467x = new org.telegram.ui.ActionBar.d5(0, false, true, this.resourceProvider);
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

    public static void U(gq0 gq0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, ep0 ep0Var, zh.v2 v2Var, pf.c cVar) {
        zArr[0] = true;
        cVar.d();
        zh.n5.x(gq0Var.currentAccount, v2Var.f51233a).h(v2Var.f51234b, tL_starGiftUnique, j10, null, true, new bi.f0(17, cVar, ep0Var));
    }

    public static void V(gq0 gq0Var, ag.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, ep0 ep0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        zh.v2 v2Var = new zh.v2(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        zh.x2 x2Var = new zh.x2(gq0Var.getParentActivity(), gq0Var.resourceProvider, tL_starGiftUnique, v2Var, gq0Var.currentAccount, j10, org.telegram.messenger.q.i(tL_starGiftUnique.num, ',', sb2), false, new ip0(gq0Var, zArr, tL_starGiftUnique, j10, ep0Var, 0));
        x2Var.h.setOnDismissListener(new fi.d0(10, zArr, ep0Var));
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
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6)) > 0.72d) {
            themedColor = i0.a.d(0.085f, getThemedColor(org.telegram.ui.ActionBar.g6.f19843a7), this.e.getColor());
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.f19843a7);
        }
        this.d.setBackgroundColor(themedColor);
        gh.c cVar = this.F;
        if (cVar.f10148a.getColor() != themedColor) {
            cVar.a(themedColor);
            Iterator it = this.f36455e0.iterator();
            while (it.hasNext()) {
                ((dh.d) it.next()).v();
            }
            Iterator it2 = this.f36454d0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final aq0 C0() {
        di.h1 h1Var = this.I;
        if (h1Var != null && h1Var.getPositionAnimated() >= 0.5f) {
            return this.h;
        }
        return this.f36463n;
    }

    public final void D0(int i10) {
        if (Build.VERSION.SDK_INT >= 31 && this.f36457f0 != null) {
            zf.c0 c0Var = this.f36453c0;
            if (c0Var.f50141c == 0) {
                c0Var.invalidate();
            }
            c0Var.f50141c = i10 | c0Var.f50141c;
        }
    }

    public final void E0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gq0.E0():void");
    }

    public final void F0() {
        org.telegram.ui.ActionBar.h5 h5Var = this.N;
        if (h5Var != null) {
            h5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.A8));
        }
        this.h.g();
        this.f36463n.g();
        jp0 jp0Var = this.e;
        if (jp0Var != null) {
            jp0Var.f38302a = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19843a7, jp0Var.f38303b);
            jp0Var.a();
            jp0Var.invalidate();
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
                float a2 = w7.s.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f);
                org.telegram.ui.Components.c00 c00Var = this.M;
                int d = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
                int d10 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.g6.f19843a7));
                int d11 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.g6.f20305z6));
                int d12 = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                c00Var.f23891a.setColor(d);
                c00Var.f23892b.setColor(d10);
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
        this.f36453c0 = new zf.c0(context, new dp0(this, 0));
        ih.j jVar = new ih.j(this.d);
        l0 l0Var2 = this.d;
        bh.b bVar = this.f36459h0;
        bVar.f2745f = jVar;
        bVar.f2746g = l0Var2;
        this.h = new aq0(this, context, 1);
        this.f36463n = new aq0(this, context, 0);
        jp0 jp0Var = new jp0(this, context, this.resourceProvider);
        this.e = jp0Var;
        jp0Var.E = true;
        this.f36463n.j(false);
        this.f36463n.addView(this.e, 2, w7.a6.e(-1, -2, 55));
        di.h1 h1Var = new di.h1(this, context, 4);
        this.I = h1Var;
        h1Var.setAdapter(new kp0(this, 0));
        l0Var.addView(this.I, w7.a6.e(-1, -1, 119));
        di.d dVar = new di.d(context, getResourceProvider(), true);
        this.Q = dVar;
        dVar.setStateListAnimator(null);
        this.Q.e();
        this.Q.d.r(true, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final gq0 f36446b;

            {
                this.f36446b = this;
            }

            @Override
            public final void onClick(View view) {
                int i12 = r2;
                gq0 gq0Var = this.f36446b;
                switch (i12) {
                    case 0:
                        gq0Var.y0();
                        return;
                    case 1:
                        if (gq0Var.onBackPressed(true)) {
                            gq0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        gq0 gq0Var2 = this.f36446b;
                        FrameLayout frameLayout2 = (FrameLayout) gq0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        gq0Var2.K.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        gq0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        gq0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        rc rcVar = new rc(gq0Var2, gq0Var2.getParentActivity(), canvas, (gq0Var2.K.getMeasuredWidth() / 2.0f) + f7, (gq0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        gq0Var2.X = rcVar;
                        rcVar.setOnTouchListener(new ci.d(2));
                        gq0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        gq0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new di.tb(gq0Var2, 2));
                        gq0Var2.Z.addListener(new lj0(gq0Var2, 3));
                        gq0Var2.Z.setDuration(400L);
                        gq0Var2.Z.setInterpolator(org.telegram.ui.Components.xt.e);
                        gq0Var2.Z.start();
                        frameLayout2.addView(gq0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new fp0(gq0Var2, 0));
                        return;
                }
            }
        });
        this.O.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.O.addView(this.Q, w7.a6.d(-1.0f, -1));
        FrameLayout frameLayout2 = this.O;
        dh.d c10 = this.E.c(frameLayout2, null, false);
        c10.o(fh.b.j(this.resourceProvider));
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(5.0f));
        frameLayout2.setBackground(c10);
        w7.c6.b(this.O, 0.02f, 1.5f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.P = frameLayout3;
        frameLayout3.addView(this.O, w7.a6.a(64.0f, 4.0f, 0.0f, 4.0f, 0.0f, -1, 80));
        bh.c cVar = new bh.c(this.G.c(this.P, null, false));
        cVar.b(AndroidUtilities.dp(40.0f), true);
        cVar.f2761q = 220;
        this.P.setBackground(cVar);
        aq0 C0 = C0();
        di.d dVar2 = this.Q;
        if (dVar2 != null && C0 != null && C0 != this.R) {
            this.R = C0;
            n6.o oVar = C0.e;
            dVar2.g((CharSequence) oVar.f16131b, false, true);
            this.Q.f((SpannableStringBuilder) oVar.f16132c, false);
        }
        l0Var.addView(this.P, w7.a6.e(-1, -2, 80));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.L = frameLayout4;
        l0Var.addView(frameLayout4, w7.a6.e(-1, -2, 55));
        boolean z10 = this.f36448a;
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
            this.M.f23896r = new ep0(this, 1);
            G0();
            this.L.addView(this.M, w7.a6.e(-1, 40, 17));
        } else {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
            this.N = h5Var;
            h5Var.l(LocaleController.getString(R.string.ChannelColorTitle2), false);
            this.N.setEllipsizeByGradient(true);
            this.N.setTextSize(20);
            this.N.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.A8));
            this.N.setTypeface(AndroidUtilities.bold());
            this.L.addView(this.N, w7.a6.a(-2.0f, 72.0f, 0.0f, 72.0f, 0.0f, -2, 19));
        }
        jp0 jp0Var2 = this.e;
        if (jp0Var2 != null) {
            jp0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                AndroidUtilities.setLightStatusBar(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.J;
        int i12 = org.telegram.ui.ActionBar.g6.f20218u8;
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i12), 1, -1));
        this.J.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.J;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.J.setOnClickListener(new View.OnClickListener(this) {
            public final gq0 f36446b;

            {
                this.f36446b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                gq0 gq0Var = this.f36446b;
                switch (i122) {
                    case 0:
                        gq0Var.y0();
                        return;
                    case 1:
                        if (gq0Var.onBackPressed(true)) {
                            gq0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        gq0 gq0Var2 = this.f36446b;
                        FrameLayout frameLayout22 = (FrameLayout) gq0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        gq0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        gq0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        gq0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        rc rcVar = new rc(gq0Var2, gq0Var2.getParentActivity(), canvas, (gq0Var2.K.getMeasuredWidth() / 2.0f) + f7, (gq0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        gq0Var2.X = rcVar;
                        rcVar.setOnTouchListener(new ci.d(2));
                        gq0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        gq0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new di.tb(gq0Var2, 2));
                        gq0Var2.Z.addListener(new lj0(gq0Var2, 3));
                        gq0Var2.Z.setDuration(400L);
                        gq0Var2.Z.setInterpolator(org.telegram.ui.Components.xt.e);
                        gq0Var2.Z.start();
                        frameLayout22.addView(gq0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new fp0(gq0Var2, 0));
                        return;
                }
            }
        });
        w7.c6.a(this.J);
        this.L.addView(this.J, w7.a6.e(54, 54, 19));
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
            public final gq0 f36446b;

            {
                this.f36446b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                gq0 gq0Var = this.f36446b;
                switch (i122) {
                    case 0:
                        gq0Var.y0();
                        return;
                    case 1:
                        if (gq0Var.onBackPressed(true)) {
                            gq0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        gq0 gq0Var2 = this.f36446b;
                        FrameLayout frameLayout22 = (FrameLayout) gq0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        gq0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        gq0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        gq0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        rc rcVar = new rc(gq0Var2, gq0Var2.getParentActivity(), canvas, (gq0Var2.K.getMeasuredWidth() / 2.0f) + f7, (gq0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        gq0Var2.X = rcVar;
                        rcVar.setOnTouchListener(new ci.d(2));
                        gq0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        gq0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new di.tb(gq0Var2, 2));
                        gq0Var2.Z.addListener(new lj0(gq0Var2, 3));
                        gq0Var2.Z.setDuration(400L);
                        gq0Var2.Z.setInterpolator(org.telegram.ui.Components.xt.e);
                        gq0Var2.Z.start();
                        frameLayout22.addView(gq0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new fp0(gq0Var2, 0));
                        return;
                }
            }
        });
        this.L.addView(this.K, w7.a6.e(54, 54, 21));
        this.K.setImageDrawable(this.T);
        jp0 jp0Var3 = this.e;
        jp0Var3.getClass();
        jp0Var3.f38302a = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19843a7, jp0Var3.f38303b);
        jp0Var3.a();
        jp0Var3.invalidate();
        z0();
        this.d.addView(this.f36453c0);
        A0();
        View view = this.fragmentView;
        dp0 dp0Var = new dp0(this, 1);
        WeakHashMap weakHashMap = r0.j0.f43732a;
        r0.b0.i(view, dp0Var);
        return this.d;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.h.f(true);
                this.f36463n.f(true);
            } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
                this.h.e();
                this.f36463n.e();
            } else if (i10 == NotificationCenter.starGiftsLoaded) {
                this.h.e();
                this.f36463n.e();
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.f20828c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.d6.a(new e(this, 27), org.telegram.ui.ActionBar.g6.f19901d6, org.telegram.ui.ActionBar.g6.G6, org.telegram.ui.ActionBar.g6.f20305z6, org.telegram.ui.ActionBar.g6.f19990i6, org.telegram.ui.ActionBar.g6.f19843a7, org.telegram.ui.ActionBar.g6.B6, org.telegram.ui.ActionBar.g6.f20122p7, org.telegram.ui.ActionBar.g6.f19937f6, org.telegram.ui.ActionBar.g6.f19954g6, org.telegram.ui.ActionBar.g6.O6, org.telegram.ui.ActionBar.g6.P6, org.telegram.ui.ActionBar.g6.Q6, org.telegram.ui.ActionBar.g6.R6);
    }

    @Override
    public final boolean isLightStatusBar() {
        jp0 jp0Var = this.e;
        if (jp0Var == null) {
            return super.isLightStatusBar();
        }
        if (i0.a.f(jp0Var.getColor()) > 0.699999988079071d) {
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
        if (!this.f36448a && ((this.h.b() || this.f36463n.b()) && getUserConfig().isPremium())) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i10;
        int i11;
        boolean z11 = this.f36448a;
        if (!z11 && ((this.h.b() || this.f36463n.b()) && getUserConfig().isPremium())) {
            if (z10 && getVisibleDialog() == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                if (z11) {
                    i10 = R.string.ChannelColorUnsaved;
                } else {
                    i10 = R.string.UserColorUnsaved;
                }
                alertDialog$Builder.f19548a.R = LocaleController.getString(i10);
                if (z11) {
                    i11 = R.string.ChannelColorUnsavedMessage;
                } else {
                    i11 = R.string.UserColorUnsavedMessage;
                }
                alertDialog$Builder.f19548a.T = LocaleController.getString(i11);
                alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new dp0(this, 2));
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new dp0(this, 3));
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                showDialog(a2Var);
                ((TextView) a2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20139q7));
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
        this.f36465s = c6Var;
    }

    public final void x0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gq0.x0():void");
    }

    public final void y0() {
        ag.b bVar;
        if (this.f36464r) {
            return;
        }
        if (this.f36448a) {
            finishFragment();
        } else if (!getUserConfig().isPremium()) {
            showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) this, 23, true));
            return;
        }
        aq0 C0 = C0();
        if (C0.I != null) {
            aq0 aq0Var = this.h;
            if (C0 == aq0Var) {
                aq0Var = this.f36463n;
            }
            aq0Var.d();
            this.f36464r = true;
            this.Q.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = C0.I;
            ep0 ep0Var = new ep0(this, 0);
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            if (tL_starGiftUnique.resale_ton_only) {
                bVar = ag.b.f630b;
            } else {
                bVar = ag.b.f629a;
            }
            zh.n5.x(this.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new hp0(this, bVar, tL_starGiftUnique, clientUserId, ep0Var));
            return;
        }
        aq0 aq0Var2 = this.h;
        if (C0 == aq0Var2) {
            aq0Var2 = this.f36463n;
        }
        if (aq0Var2.I != null) {
            aq0Var2.d();
        }
        x0();
        finishFragment();
        E0();
    }

    public final void z0() {
        this.f36468y.a(getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
        this.O.invalidate();
        this.P.invalidate();
        this.h.f34325w.invalidate();
        this.h.f34326x.invalidate();
        this.f36463n.f34325w.invalidate();
        this.h.f34305b.invalidate();
        this.f36463n.f34305b.invalidate();
        ((dh.d) this.O.getBackground()).v();
        A0();
        Iterator it = this.f36455e0.iterator();
        while (it.hasNext()) {
            ((dh.d) it.next()).v();
        }
    }
}

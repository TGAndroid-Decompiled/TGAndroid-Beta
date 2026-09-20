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
public final class cq0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final ah.c E;
    public final fh.c F;
    public final ah.c G;
    public org.telegram.ui.ActionBar.n2 H;
    public ci.i1 I;
    public ImageView J;
    public ImageView K;
    public FrameLayout L;
    public org.telegram.ui.Components.qz M;
    public org.telegram.ui.ActionBar.j5 N;
    public FrameLayout O;
    public FrameLayout P;
    public ci.d Q;
    public wp0 R;
    public boolean S;
    public org.telegram.ui.Components.hj0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public mc X;
    public float Y;
    public ValueAnimator Z;
    public final boolean f32808a;
    public boolean f32809a0;
    public final yh.l5 f32810b;
    public i0.b f32811b0;
    public final yh.l5 f32812c;
    public yf.b0 f32813c0;
    public j0 d;
    public final pe.b f32814d0;
    public ep0 e;
    public final pe.b f32815e0;
    public final int f32816f;
    public final ah.i f32817f0;
    public final fh.d f32818g0;
    public wp0 h;
    public final ah.c f32819h0;
    public final wa f32820i0;
    public final ArrayList f32821j0;
    public final ArrayList f32822k0;
    public wp0 f32823n;
    public boolean f32824r;
    public org.telegram.ui.ActionBar.f6 f32825s;
    public final SparseIntArray v;
    public final org.telegram.ui.ActionBar.f5 f32826w;
    public final org.telegram.ui.ActionBar.f5 f32827x;
    public final fh.c f32828y;

    public cq0() {
        super(null);
        this.f32816f = AndroidUtilities.dp(6.0f);
        this.v = new SparseIntArray();
        boolean q6 = org.telegram.ui.ActionBar.j6.I.q();
        this.S = q6;
        this.f32809a0 = q6;
        this.f32811b0 = i0.b.e;
        pe.b bVar = new pe.b(true);
        this.f32814d0 = bVar;
        pe.b bVar2 = new pe.b(true);
        this.f32815e0 = bVar2;
        this.f32820i0 = new wa(this, 1);
        this.f32821j0 = new ArrayList();
        this.f32822k0 = new ArrayList();
        fh.c cVar = new fh.c();
        this.f32828y = cVar;
        ah.c cVar2 = new ah.c(cVar);
        this.E = cVar2;
        fh.c cVar3 = new fh.c();
        this.F = cVar3;
        ah.c cVar4 = new ah.c(cVar3);
        this.G = cVar4;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ah.i iVar = new ah.i(false);
            this.f32817f0 = iVar;
            fh.d dVar = new fh.d(cVar);
            this.f32818g0 = dVar;
            dVar.v = new ap0(this, 1);
            dVar.d = iVar;
            dVar.e = -2;
            dVar.f9077f = cVar;
            ah.c cVar5 = new ah.c(dVar);
            this.f32819h0 = cVar5;
            cVar5.f427i = LiteMode.isEnabled(262144);
        } else {
            this.f32817f0 = null;
            this.f32818g0 = null;
            this.f32819h0 = new ah.c(cVar);
        }
        cVar2.e = bVar;
        cVar2.d = bVar2;
        cVar4.e = bVar;
        cVar4.d = bVar2;
        ah.c cVar6 = this.f32819h0;
        cVar6.e = bVar;
        cVar6.d = bVar2;
        this.f32808a = false;
        yh.u5.y(this.currentAccount, false).V();
        yh.l5 l5Var = new yh.l5(this.currentAccount, 0L, false);
        this.f32810b = l5Var;
        l5Var.f(8, false);
        l5Var.a();
        yh.l5 l5Var2 = new yh.l5(this.currentAccount, 0L, false);
        this.f32812c = l5Var2;
        l5Var2.f(8, false);
        l5Var2.f47685f = true;
        l5Var2.a();
        this.resourceProvider = new g(this, 29);
        this.f32826w = new org.telegram.ui.ActionBar.f5(0, false, false, this.resourceProvider);
        this.f32827x = new org.telegram.ui.ActionBar.f5(0, false, true, this.resourceProvider);
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

    public static void U(cq0 cq0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, zo0 zo0Var, yh.b3 b3Var, nf.e eVar) {
        zArr[0] = true;
        eVar.d();
        yh.u5.x(cq0Var.currentAccount, b3Var.f47270a).h(b3Var.f47271b, tL_starGiftUnique, j3, null, true, new ai.m0(18, eVar, zo0Var));
    }

    public static void V(cq0 cq0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, zo0 zo0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        yh.b3 b3Var = new yh.b3(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        yh.d3 d3Var = new yh.d3(cq0Var.getParentActivity(), cq0Var.resourceProvider, tL_starGiftUnique, b3Var, cq0Var.currentAccount, j3, hg.k0.j(tL_starGiftUnique.num, ',', sb2), false, new dp0(cq0Var, zArr, tL_starGiftUnique, j3, zo0Var, 0));
        d3Var.h.setOnDismissListener(new ei.e0(10, zArr, zo0Var));
        d3Var.b();
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
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.j6.f19094d6)) > 0.72d) {
            themedColor = i0.a.d(0.085f, getThemedColor(org.telegram.ui.ActionBar.j6.f19038a7), this.e.getColor());
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f19038a7);
        }
        this.d.setBackgroundColor(themedColor);
        fh.c cVar = this.F;
        if (cVar.f9073a.getColor() != themedColor) {
            cVar.a(themedColor);
            Iterator it = this.f32815e0.iterator();
            while (it.hasNext()) {
                ((ch.d) it.next()).v();
            }
            Iterator it2 = this.f32814d0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final wp0 C0() {
        ci.i1 i1Var = this.I;
        if (i1Var != null && i1Var.getPositionAnimated() >= 0.5f) {
            return this.h;
        }
        return this.f32823n;
    }

    public final void D0(int i10) {
        if (Build.VERSION.SDK_INT >= 31 && this.f32817f0 != null) {
            yf.b0 b0Var = this.f32813c0;
            if (b0Var.f47083c == 0) {
                b0Var.invalidate();
            }
            b0Var.f47083c = i10 | b0Var.f47083c;
        }
    }

    public final void E0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cq0.E0():void");
    }

    public final void F0() {
        org.telegram.ui.ActionBar.j5 j5Var = this.N;
        if (j5Var != null) {
            j5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.A8));
        }
        this.h.g();
        this.f32823n.g();
        ep0 ep0Var = this.e;
        if (ep0Var != null) {
            ep0Var.f34658a = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19038a7, ep0Var.f34659b);
            ep0Var.a();
            ep0Var.invalidate();
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
                ci.i1 i1Var = this.I;
                if (i1Var == null) {
                    positionAnimated = 0.0f;
                } else {
                    positionAnimated = i1Var.getPositionAnimated();
                }
                float a2 = w7.q.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f);
                org.telegram.ui.Components.qz qzVar = this.M;
                int d = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.j6.f19094d6));
                int d10 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.j6.f19038a7));
                int d11 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.j6.f19496z6));
                int d12 = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                qzVar.f27690a.setColor(d);
                qzVar.f27691b.setColor(d10);
                qzVar.d = d11;
                qzVar.e = d12;
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
        j0 j0Var = new j0(this, context, 14);
        this.d = j0Var;
        this.fragmentView = j0Var;
        this.f32813c0 = new yf.b0(context, new yo0(this, 0));
        hh.k kVar = new hh.k(this.d);
        j0 j0Var2 = this.d;
        ah.c cVar = this.f32819h0;
        cVar.f425f = kVar;
        cVar.f426g = j0Var2;
        this.h = new wp0(this, context, 1);
        this.f32823n = new wp0(this, context, 0);
        ep0 ep0Var = new ep0(this, context, this.resourceProvider);
        this.e = ep0Var;
        ep0Var.E = true;
        this.f32823n.j(false);
        this.f32823n.addView(this.e, 2, w7.y5.e(-1, -2, 55));
        ci.i1 i1Var = new ci.i1(this, context, 4);
        this.I = i1Var;
        i1Var.setAdapter(new fp0(this));
        j0Var.addView(this.I, w7.y5.e(-1, -1, 119));
        ci.d dVar = new ci.d(context, getResourceProvider(), true);
        this.Q = dVar;
        dVar.setStateListAnimator(null);
        this.Q.e();
        this.Q.d.o(true, true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final cq0 f32507b;

            {
                this.f32507b = this;
            }

            @Override
            public final void onClick(View view) {
                int i12 = r2;
                cq0 cq0Var = this.f32507b;
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
                        cq0 cq0Var2 = this.f32507b;
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
                        mc mcVar = new mc(cq0Var2, cq0Var2.getParentActivity(), canvas, (cq0Var2.K.getMeasuredWidth() / 2.0f) + f7, (cq0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        cq0Var2.X = mcVar;
                        mcVar.setOnTouchListener(new bi.d(2));
                        cq0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        cq0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ci.xb(cq0Var2, 2));
                        cq0Var2.Z.addListener(new gp0(cq0Var2, 0));
                        cq0Var2.Z.setDuration(400L);
                        cq0Var2.Z.setInterpolator(org.telegram.ui.Components.kt.e);
                        cq0Var2.Z.start();
                        frameLayout2.addView(cq0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new ap0(cq0Var2, 0));
                        return;
                }
            }
        });
        this.O.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.O.addView(this.Q, w7.y5.c(-1.0f, -1));
        FrameLayout frameLayout2 = this.O;
        ch.d c10 = this.E.c(frameLayout2, null, false);
        c10.o(eh.b.j(this.resourceProvider));
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(5.0f));
        frameLayout2.setBackground(c10);
        w7.b6.b(this.O, 0.02f, 1.5f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.P = frameLayout3;
        frameLayout3.addView(this.O, w7.y5.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        ah.e eVar = new ah.e(this.G.c(this.P, null, false));
        eVar.b(AndroidUtilities.dp(40.0f), true);
        eVar.f443q = 220;
        this.P.setBackground(eVar);
        wp0 C0 = C0();
        ci.d dVar2 = this.Q;
        if (dVar2 != null && C0 != null && C0 != this.R) {
            this.R = C0;
            org.telegram.ui.Cells.f3 f3Var = C0.e;
            dVar2.g((CharSequence) f3Var.f20269b, false, true);
            this.Q.f((SpannableStringBuilder) f3Var.f20270c, false);
        }
        j0Var.addView(this.P, w7.y5.e(-1, -2, 80));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.L = frameLayout4;
        j0Var.addView(frameLayout4, w7.y5.e(-1, -2, 55));
        boolean z10 = this.f32808a;
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
            this.M.f27695r = new zo0(this, 1);
            G0();
            this.L.addView(this.M, w7.y5.e(-1, 40, 17));
        } else {
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
            this.N = j5Var;
            j5Var.l(LocaleController.getString(R.string.ChannelColorTitle2), false);
            this.N.setEllipsizeByGradient(true);
            this.N.setTextSize(20);
            this.N.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.A8));
            this.N.setTypeface(AndroidUtilities.bold());
            this.L.addView(this.N, w7.y5.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        }
        ep0 ep0Var2 = this.e;
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
        int i12 = org.telegram.ui.ActionBar.j6.f19409u8;
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i12), 1, -1));
        this.J.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.J;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.J.setOnClickListener(new View.OnClickListener(this) {
            public final cq0 f32507b;

            {
                this.f32507b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                cq0 cq0Var = this.f32507b;
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
                        cq0 cq0Var2 = this.f32507b;
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
                        mc mcVar = new mc(cq0Var2, cq0Var2.getParentActivity(), canvas, (cq0Var2.K.getMeasuredWidth() / 2.0f) + f7, (cq0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        cq0Var2.X = mcVar;
                        mcVar.setOnTouchListener(new bi.d(2));
                        cq0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        cq0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ci.xb(cq0Var2, 2));
                        cq0Var2.Z.addListener(new gp0(cq0Var2, 0));
                        cq0Var2.Z.setDuration(400L);
                        cq0Var2.Z.setInterpolator(org.telegram.ui.Components.kt.e);
                        cq0Var2.Z.start();
                        frameLayout22.addView(cq0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new ap0(cq0Var2, 0));
                        return;
                }
            }
        });
        w7.b6.a(this.J);
        this.L.addView(this.J, w7.y5.e(54, 54, 19));
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
        this.T.Z = true;
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
            public final cq0 f32507b;

            {
                this.f32507b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                cq0 cq0Var = this.f32507b;
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
                        cq0 cq0Var2 = this.f32507b;
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
                        mc mcVar = new mc(cq0Var2, cq0Var2.getParentActivity(), canvas, (cq0Var2.K.getMeasuredWidth() / 2.0f) + f7, (cq0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        cq0Var2.X = mcVar;
                        mcVar.setOnTouchListener(new bi.d(2));
                        cq0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        cq0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ci.xb(cq0Var2, 2));
                        cq0Var2.Z.addListener(new gp0(cq0Var2, 0));
                        cq0Var2.Z.setDuration(400L);
                        cq0Var2.Z.setInterpolator(org.telegram.ui.Components.kt.e);
                        cq0Var2.Z.start();
                        frameLayout22.addView(cq0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new ap0(cq0Var2, 0));
                        return;
                }
            }
        });
        this.L.addView(this.K, w7.y5.e(54, 54, 21));
        this.K.setImageDrawable(this.T);
        ep0 ep0Var3 = this.e;
        ep0Var3.getClass();
        ep0Var3.f34658a = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19038a7, ep0Var3.f34659b);
        ep0Var3.a();
        ep0Var3.invalidate();
        z0();
        this.d.addView(this.f32813c0);
        A0();
        View view = this.fragmentView;
        yo0 yo0Var = new yo0(this, 1);
        WeakHashMap weakHashMap = r0.i0.f42142a;
        r0.a0.j(view, yo0Var);
        return this.d;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.h.f(true);
                this.f32823n.f(true);
            } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
                this.h.e();
                this.f32823n.e();
            } else if (i10 == NotificationCenter.starGiftsLoaded) {
                this.h.e();
                this.f32823n.e();
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.a4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.a4.f18662c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.c6.a(new e(this, 27), org.telegram.ui.ActionBar.j6.f19094d6, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.f19496z6, org.telegram.ui.ActionBar.j6.f19184i6, org.telegram.ui.ActionBar.j6.f19038a7, org.telegram.ui.ActionBar.j6.B6, org.telegram.ui.ActionBar.j6.f19315p7, org.telegram.ui.ActionBar.j6.f19130f6, org.telegram.ui.ActionBar.j6.f19148g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
    }

    @Override
    public final boolean isLightStatusBar() {
        ep0 ep0Var = this.e;
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
        if (!this.f32808a && ((this.h.b() || this.f32823n.b()) && getUserConfig().isPremium())) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i10;
        int i11;
        boolean z11 = this.f32808a;
        if (!z11 && ((this.h.b() || this.f32823n.b()) && getUserConfig().isPremium())) {
            if (z10 && getVisibleDialog() == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                if (z11) {
                    i10 = R.string.ChannelColorUnsaved;
                } else {
                    i10 = R.string.UserColorUnsaved;
                }
                alertDialog$Builder.f18654a.R = LocaleController.getString(i10);
                if (z11) {
                    i11 = R.string.ChannelColorUnsavedMessage;
                } else {
                    i11 = R.string.UserColorUnsavedMessage;
                }
                alertDialog$Builder.f18654a.T = LocaleController.getString(i11);
                alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new yo0(this, 2));
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new yo0(this, 3));
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
                showDialog(b2Var);
                ((TextView) b2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19333q7));
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
        setBulletinDelegate(new ci.d9(11));
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
        this.f32825s = f6Var;
    }

    public final void x0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cq0.x0():void");
    }

    public final void y0() {
        zf.b bVar;
        if (this.f32824r) {
            return;
        }
        if (this.f32808a) {
            finishFragment();
        } else if (!getUserConfig().isPremium()) {
            showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) this, 23, true));
            return;
        }
        wp0 C0 = C0();
        if (C0.I != null) {
            wp0 wp0Var = this.h;
            if (C0 == wp0Var) {
                wp0Var = this.f32823n;
            }
            wp0Var.d();
            this.f32824r = true;
            this.Q.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = C0.I;
            zo0 zo0Var = new zo0(this, 0);
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            if (tL_starGiftUnique.resale_ton_only) {
                bVar = zf.b.f49255b;
            } else {
                bVar = zf.b.f49254a;
            }
            yh.u5.x(this.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new cp0(this, bVar, tL_starGiftUnique, clientUserId, zo0Var));
            return;
        }
        wp0 wp0Var2 = this.h;
        if (C0 == wp0Var2) {
            wp0Var2 = this.f32823n;
        }
        if (wp0Var2.I != null) {
            wp0Var2.d();
        }
        x0();
        finishFragment();
        E0();
    }

    public final void z0() {
        this.f32828y.a(getThemedColor(org.telegram.ui.ActionBar.j6.f19094d6));
        this.O.invalidate();
        this.P.invalidate();
        this.h.f39214w.invalidate();
        this.h.f39215x.invalidate();
        this.f32823n.f39214w.invalidate();
        this.h.f39194b.invalidate();
        this.f32823n.f39194b.invalidate();
        ((ch.d) this.O.getBackground()).v();
        A0();
        Iterator it = this.f32815e0.iterator();
        while (it.hasNext()) {
            ((ch.d) it.next()).v();
        }
    }
}

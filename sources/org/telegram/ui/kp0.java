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
public final class kp0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
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
    public ep0 R;
    public boolean S;
    public org.telegram.ui.Components.uj0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public nc X;
    public float Y;
    public ValueAnimator Z;
    public final boolean f38638a;
    public boolean f38639a0;
    public final ai.y9 f38640b;
    public i0.b f38641b0;
    public final ai.y9 f38642c;
    public zf.b0 f38643c0;
    public m0 d;
    public final re.b f38644d0;
    public no0 e;
    public final re.b f38645e0;
    public final int f38646f;
    public final bh.f f38647f0;
    public final gh.d f38648g0;
    public ep0 h;
    public final bh.b f38649h0;
    public final ya f38650i0;
    public final ArrayList f38651j0;
    public final ArrayList f38652k0;
    public ep0 f38653n;
    public boolean f38654r;
    public org.telegram.ui.ActionBar.d6 f38655s;
    public final SparseIntArray v;
    public final org.telegram.ui.ActionBar.f5 f38656w;
    public final org.telegram.ui.ActionBar.f5 f38657x;
    public final gh.c f38658y;

    public kp0() {
        super(null);
        this.f38646f = AndroidUtilities.dp(6.0f);
        this.v = new SparseIntArray();
        boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
        this.S = q6;
        this.f38639a0 = q6;
        this.f38641b0 = i0.b.e;
        re.b bVar = new re.b();
        this.f38644d0 = bVar;
        re.b bVar2 = new re.b();
        this.f38645e0 = bVar2;
        this.f38650i0 = new ya(this, 1);
        this.f38651j0 = new ArrayList();
        this.f38652k0 = new ArrayList();
        gh.c cVar = new gh.c();
        this.f38658y = cVar;
        bh.b bVar3 = new bh.b(cVar);
        this.E = bVar3;
        gh.c cVar2 = new gh.c();
        this.F = cVar2;
        bh.b bVar4 = new bh.b(cVar2);
        this.G = bVar4;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            bh.f fVar = new bh.f(false);
            this.f38647f0 = fVar;
            gh.d dVar = new gh.d(cVar);
            this.f38648g0 = dVar;
            dVar.v = new jo0(this, 1);
            dVar.d = fVar;
            dVar.e = -2;
            dVar.f11062f = cVar;
            bh.b bVar5 = new bh.b(dVar);
            this.f38649h0 = bVar5;
            bVar5.f4364i = LiteMode.isEnabled(262144);
        } else {
            this.f38647f0 = null;
            this.f38648g0 = null;
            this.f38649h0 = new bh.b(cVar);
        }
        bVar3.e = bVar;
        bVar3.d = bVar2;
        bVar4.e = bVar;
        bVar4.d = bVar2;
        bh.b bVar6 = this.f38649h0;
        bVar6.e = bVar;
        bVar6.d = bVar2;
        this.f38638a = false;
        ai.ga.y(this.currentAccount, false).V();
        ai.y9 y9Var = new ai.y9(this.currentAccount, 0L, false);
        this.f38640b = y9Var;
        y9Var.g(8, false);
        y9Var.a();
        ai.y9 y9Var2 = new ai.y9(this.currentAccount, 0L, false);
        this.f38642c = y9Var2;
        y9Var2.g(8, false);
        y9Var2.f2493f = true;
        y9Var2.a();
        this.resourceProvider = new mo0(this, 0);
        this.f38656w = new org.telegram.ui.ActionBar.f5(0, false, false, this.resourceProvider);
        this.f38657x = new org.telegram.ui.ActionBar.f5(0, false, true, this.resourceProvider);
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

    public static void U(kp0 kp0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, io0 io0Var, ai.h6 h6Var, pf.c cVar) {
        zArr[0] = true;
        cVar.d();
        ai.ga.x(kp0Var.currentAccount, h6Var.f1411a).h(h6Var.f1412b, tL_starGiftUnique, j10, null, true, new ai.q5(21, cVar, io0Var));
    }

    public static void V(kp0 kp0Var, ag.c cVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, io0 io0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        ai.h6 h6Var = new ai.h6(cVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        ai.k6 k6Var = new ai.k6(kp0Var.getParentActivity(), kp0Var.resourceProvider, tL_starGiftUnique, h6Var, kp0Var.currentAccount, j10, org.telegram.messenger.g0.h(tL_starGiftUnique.num, ',', sb2), false, new ai.s3(kp0Var, zArr, tL_starGiftUnique, j10, io0Var, 1));
        k6Var.h.setOnDismissListener(new ai.v3(12, zArr, io0Var));
        k6Var.b();
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
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.h6.f20993d6)) > 0.72d) {
            themedColor = i0.a.f(0.085f, getThemedColor(org.telegram.ui.ActionBar.h6.f20935a7), this.e.getColor());
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.f20935a7);
        }
        this.d.setBackgroundColor(themedColor);
        gh.c cVar = this.F;
        if (cVar.f11058a.getColor() != themedColor) {
            cVar.a(themedColor);
            Iterator it = this.f38645e0.iterator();
            while (it.hasNext()) {
                ((dh.d) it.next()).v();
            }
            Iterator it2 = this.f38644d0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final ep0 C0() {
        ei.h1 h1Var = this.I;
        if (h1Var != null && h1Var.getPositionAnimated() >= 0.5f) {
            return this.h;
        }
        return this.f38653n;
    }

    public final void D0(int i10) {
        if (Build.VERSION.SDK_INT >= 31 && this.f38647f0 != null) {
            zf.b0 b0Var = this.f38643c0;
            if (b0Var.f51568c == 0) {
                b0Var.invalidate();
            }
            b0Var.f51568c = i10 | b0Var.f51568c;
        }
    }

    public final void E0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kp0.E0():void");
    }

    public final void F0() {
        org.telegram.ui.ActionBar.j5 j5Var = this.N;
        if (j5Var != null) {
            j5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.A8));
        }
        this.h.g();
        this.f38653n.g();
        no0 no0Var = this.e;
        if (no0Var != null) {
            no0Var.f40487a = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20935a7, no0Var.f40488b);
            no0Var.a();
            no0Var.invalidate();
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
                int f7 = i0.a.f(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.h6.f20993d6));
                int f10 = i0.a.f(a2, -1, getThemedColor(org.telegram.ui.ActionBar.h6.f20935a7));
                int f11 = i0.a.f(a2, -1, getThemedColor(org.telegram.ui.ActionBar.h6.f21398z6));
                int f12 = i0.a.f(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                zzVar.f33062a.setColor(f7);
                zzVar.f33063b.setColor(f10);
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
        this.f38643c0 = new zf.b0(context, new ho0(this, 0));
        ih.j jVar = new ih.j(this.d);
        m0 m0Var2 = this.d;
        bh.b bVar = this.f38649h0;
        bVar.f4362f = jVar;
        bVar.f4363g = m0Var2;
        this.h = new ep0(this, context, 1);
        this.f38653n = new ep0(this, context, 0);
        no0 no0Var = new no0(this, context, this.resourceProvider);
        this.e = no0Var;
        no0Var.E = true;
        this.f38653n.j(false);
        this.f38653n.addView(this.e, 2, w7.z5.e(-1, -2, 55));
        ei.h1 h1Var = new ei.h1(this, context, 4);
        this.I = h1Var;
        h1Var.setAdapter(new oo0(this, 0));
        m0Var.addView(this.I, w7.z5.e(-1, -1, 119));
        ei.d dVar = new ei.d(context, getResourceProvider(), true);
        this.Q = dVar;
        dVar.setStateListAnimator(null);
        this.Q.e();
        this.Q.d.r(true, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final kp0 f38627b;

            {
                this.f38627b = this;
            }

            @Override
            public final void onClick(View view) {
                int i12 = r2;
                kp0 kp0Var = this.f38627b;
                switch (i12) {
                    case 0:
                        kp0Var.y0();
                        return;
                    case 1:
                        if (kp0Var.onBackPressed(true)) {
                            kp0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        kp0 kp0Var2 = this.f38627b;
                        FrameLayout frameLayout2 = (FrameLayout) kp0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        kp0Var2.K.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        kp0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        kp0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        nc ncVar = new nc(kp0Var2, kp0Var2.getParentActivity(), canvas, (kp0Var2.K.getMeasuredWidth() / 2.0f) + f7, (kp0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        kp0Var2.X = ncVar;
                        ncVar.setOnTouchListener(new di.d(2));
                        kp0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        kp0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ei.eb(kp0Var2, 2));
                        kp0Var2.Z.addListener(new bc0(kp0Var2, 5));
                        kp0Var2.Z.setDuration(400L);
                        kp0Var2.Z.setInterpolator(org.telegram.ui.Components.st.e);
                        kp0Var2.Z.start();
                        frameLayout2.addView(kp0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new jo0(kp0Var2, 0));
                        return;
                }
            }
        });
        this.O.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.O.addView(this.Q, w7.z5.d(-1.0f, -1));
        FrameLayout frameLayout2 = this.O;
        dh.d c10 = this.E.c(frameLayout2, null, false);
        c10.o(fh.c.j(this.resourceProvider));
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(5.0f));
        frameLayout2.setBackground(c10);
        w7.b6.b(this.O, 0.02f, 1.5f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.P = frameLayout3;
        frameLayout3.addView(this.O, w7.z5.a(64.0f, 4.0f, 0.0f, 4.0f, 0.0f, -1, 80));
        bh.c cVar = new bh.c(this.G.c(this.P, null, false));
        cVar.b(AndroidUtilities.dp(40.0f), true);
        cVar.f4378q = 220;
        this.P.setBackground(cVar);
        ep0 C0 = C0();
        ei.d dVar2 = this.Q;
        if (dVar2 != null && C0 != null && C0 != this.R) {
            this.R = C0;
            n2.e eVar = C0.e;
            dVar2.g((CharSequence) eVar.f17042b, false, true);
            this.Q.f((SpannableStringBuilder) eVar.f17043c, false);
        }
        m0Var.addView(this.P, w7.z5.e(-1, -2, 80));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.L = frameLayout4;
        m0Var.addView(frameLayout4, w7.z5.e(-1, -2, 55));
        boolean z10 = this.f38638a;
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
            this.M.f33067r = new io0(this, 1);
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
            this.L.addView(this.N, w7.z5.a(-2.0f, 72.0f, 0.0f, 72.0f, 0.0f, -2, 19));
        }
        no0 no0Var2 = this.e;
        if (no0Var2 != null) {
            no0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                AndroidUtilities.setLightStatusBar(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.J;
        int i12 = org.telegram.ui.ActionBar.h6.f21311u8;
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i12), 1, -1));
        this.J.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.J;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.J.setOnClickListener(new View.OnClickListener(this) {
            public final kp0 f38627b;

            {
                this.f38627b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                kp0 kp0Var = this.f38627b;
                switch (i122) {
                    case 0:
                        kp0Var.y0();
                        return;
                    case 1:
                        if (kp0Var.onBackPressed(true)) {
                            kp0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        kp0 kp0Var2 = this.f38627b;
                        FrameLayout frameLayout22 = (FrameLayout) kp0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        kp0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        kp0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        kp0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        nc ncVar = new nc(kp0Var2, kp0Var2.getParentActivity(), canvas, (kp0Var2.K.getMeasuredWidth() / 2.0f) + f7, (kp0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        kp0Var2.X = ncVar;
                        ncVar.setOnTouchListener(new di.d(2));
                        kp0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        kp0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ei.eb(kp0Var2, 2));
                        kp0Var2.Z.addListener(new bc0(kp0Var2, 5));
                        kp0Var2.Z.setDuration(400L);
                        kp0Var2.Z.setInterpolator(org.telegram.ui.Components.st.e);
                        kp0Var2.Z.start();
                        frameLayout22.addView(kp0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new jo0(kp0Var2, 0));
                        return;
                }
            }
        });
        w7.b6.a(this.J);
        this.L.addView(this.J, w7.z5.e(54, 54, 19));
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.T = uj0Var;
        uj0Var.h = true;
        if (!this.S) {
            uj0Var.P(0);
            this.T.M(0);
        } else {
            uj0Var.M(35);
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
            public final kp0 f38627b;

            {
                this.f38627b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                kp0 kp0Var = this.f38627b;
                switch (i122) {
                    case 0:
                        kp0Var.y0();
                        return;
                    case 1:
                        if (kp0Var.onBackPressed(true)) {
                            kp0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        kp0 kp0Var2 = this.f38627b;
                        FrameLayout frameLayout22 = (FrameLayout) kp0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        kp0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        kp0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        kp0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        nc ncVar = new nc(kp0Var2, kp0Var2.getParentActivity(), canvas, (kp0Var2.K.getMeasuredWidth() / 2.0f) + f7, (kp0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        kp0Var2.X = ncVar;
                        ncVar.setOnTouchListener(new di.d(2));
                        kp0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        kp0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ei.eb(kp0Var2, 2));
                        kp0Var2.Z.addListener(new bc0(kp0Var2, 5));
                        kp0Var2.Z.setDuration(400L);
                        kp0Var2.Z.setInterpolator(org.telegram.ui.Components.st.e);
                        kp0Var2.Z.start();
                        frameLayout22.addView(kp0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new jo0(kp0Var2, 0));
                        return;
                }
            }
        });
        this.L.addView(this.K, w7.z5.e(54, 54, 21));
        this.K.setImageDrawable(this.T);
        no0 no0Var3 = this.e;
        no0Var3.getClass();
        no0Var3.f40487a = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20935a7, no0Var3.f40488b);
        no0Var3.a();
        no0Var3.invalidate();
        z0();
        this.d.addView(this.f38643c0);
        A0();
        View view = this.fragmentView;
        ho0 ho0Var = new ho0(this, 1);
        WeakHashMap weakHashMap = r0.i0.f44864a;
        r0.a0.i(view, ho0Var);
        return this.d;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.h.f(true);
                this.f38653n.f(true);
            } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
                this.h.e();
                this.f38653n.e();
            } else if (i10 == NotificationCenter.starGiftsLoaded) {
                this.h.e();
                this.f38653n.e();
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.z3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.z3.f21918c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.c6.a(new e(this, 27), org.telegram.ui.ActionBar.h6.f20993d6, org.telegram.ui.ActionBar.h6.G6, org.telegram.ui.ActionBar.h6.f21398z6, org.telegram.ui.ActionBar.h6.f21082i6, org.telegram.ui.ActionBar.h6.f20935a7, org.telegram.ui.ActionBar.h6.B6, org.telegram.ui.ActionBar.h6.f21214p7, org.telegram.ui.ActionBar.h6.f21029f6, org.telegram.ui.ActionBar.h6.f21046g6, org.telegram.ui.ActionBar.h6.O6, org.telegram.ui.ActionBar.h6.P6, org.telegram.ui.ActionBar.h6.Q6, org.telegram.ui.ActionBar.h6.R6);
    }

    @Override
    public final boolean isLightStatusBar() {
        no0 no0Var = this.e;
        if (no0Var == null) {
            return super.isLightStatusBar();
        }
        if (i0.a.h(no0Var.getColor()) > 0.699999988079071d) {
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
        if (!this.f38638a && ((this.h.b() || this.f38653n.b()) && getUserConfig().isPremium())) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i10;
        int i11;
        boolean z11 = this.f38638a;
        if (!z11 && ((this.h.b() || this.f38653n.b()) && getUserConfig().isPremium())) {
            if (z10 && getVisibleDialog() == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                if (z11) {
                    i10 = R.string.ChannelColorUnsaved;
                } else {
                    i10 = R.string.UserColorUnsaved;
                }
                alertDialog$Builder.f20608a.R = LocaleController.getString(i10);
                if (z11) {
                    i11 = R.string.ChannelColorUnsavedMessage;
                } else {
                    i11 = R.string.UserColorUnsavedMessage;
                }
                alertDialog$Builder.f20608a.T = LocaleController.getString(i11);
                alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new ho0(this, 2));
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new ho0(this, 3));
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
                showDialog(b2Var);
                ((TextView) b2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21231q7));
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
        this.f38655s = d6Var;
    }

    public final void x0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kp0.x0():void");
    }

    public final void y0() {
        ag.c cVar;
        if (this.f38654r) {
            return;
        }
        if (this.f38638a) {
            finishFragment();
        } else if (!getUserConfig().isPremium()) {
            showDialog(new sg.x0((org.telegram.ui.ActionBar.n2) this, 23, true));
            return;
        }
        ep0 C0 = C0();
        if (C0.I != null) {
            ep0 ep0Var = this.h;
            if (C0 == ep0Var) {
                ep0Var = this.f38653n;
            }
            ep0Var.d();
            this.f38654r = true;
            this.Q.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = C0.I;
            io0 io0Var = new io0(this, 0);
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            if (tL_starGiftUnique.resale_ton_only) {
                cVar = ag.c.f636b;
            } else {
                cVar = ag.c.f635a;
            }
            ai.ga.x(this.currentAccount, cVar).H(tL_starGiftUnique, clientUserId, null, true, new lo0(this, cVar, tL_starGiftUnique, clientUserId, io0Var));
            return;
        }
        ep0 ep0Var2 = this.h;
        if (C0 == ep0Var2) {
            ep0Var2 = this.f38653n;
        }
        if (ep0Var2.I != null) {
            ep0Var2.d();
        }
        x0();
        finishFragment();
        E0();
    }

    public final void z0() {
        this.f38658y.a(getThemedColor(org.telegram.ui.ActionBar.h6.f20993d6));
        this.O.invalidate();
        this.P.invalidate();
        this.h.f36602w.invalidate();
        this.h.f36603x.invalidate();
        this.f38653n.f36602w.invalidate();
        this.h.f36582b.invalidate();
        this.f38653n.f36582b.invalidate();
        ((dh.d) this.O.getBackground()).v();
        A0();
        Iterator it = this.f38645e0.iterator();
        while (it.hasNext()) {
            ((dh.d) it.next()).v();
        }
    }
}

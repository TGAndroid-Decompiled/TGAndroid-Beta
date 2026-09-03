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
public final class np0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public final og.a B;
    public final tg.c C;
    public final og.a D;
    public org.telegram.ui.ActionBar.p2 E;
    public ek F;
    public ImageView G;
    public ImageView H;
    public FrameLayout I;
    public org.telegram.ui.Components.sz J;
    public org.telegram.ui.ActionBar.l5 K;
    public FrameLayout L;
    public FrameLayout M;
    public qh.d N;
    public hp0 O;
    public boolean P;
    public org.telegram.ui.Components.hj0 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public jc U;
    public float V;
    public ValueAnimator W;
    public boolean X;
    public i0.b Y;
    public lf.e0 Z;
    public final boolean f39422a;
    public final be.b f39423a0;
    public final mh.l7 f39424b;
    public final be.b f39425b0;
    public final mh.l7 f39426c;
    public final og.e f39427c0;
    public l0 d;
    public final tg.d f39428d0;
    public qo0 f39429e;
    public final og.a f39430e0;
    public final int f39431f;
    public final ua f39432f0;
    public final ArrayList f39433g0;
    public hp0 h;
    public final ArrayList f39434h0;
    public hp0 f39435n;
    public boolean f39436r;
    public org.telegram.ui.ActionBar.g6 f39437s;
    public final SparseIntArray v;
    public final org.telegram.ui.ActionBar.h5 f39438w;
    public final org.telegram.ui.ActionBar.h5 f39439x;
    public final tg.c f39440y;

    public np0() {
        super(null);
        this.f39431f = AndroidUtilities.dp(6.0f);
        this.v = new SparseIntArray();
        boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
        this.P = q10;
        this.X = q10;
        this.Y = i0.b.f7756e;
        be.b bVar = new be.b(true);
        this.f39423a0 = bVar;
        be.b bVar2 = new be.b(true);
        this.f39425b0 = bVar2;
        this.f39432f0 = new ua(this, 1);
        this.f39433g0 = new ArrayList();
        this.f39434h0 = new ArrayList();
        tg.c cVar = new tg.c();
        this.f39440y = cVar;
        og.a aVar = new og.a(cVar);
        this.B = aVar;
        tg.c cVar2 = new tg.c();
        this.C = cVar2;
        og.a aVar2 = new og.a(cVar2);
        this.D = aVar2;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            og.e eVar = new og.e(false);
            this.f39427c0 = eVar;
            tg.d dVar = new tg.d(cVar);
            this.f39428d0 = dVar;
            dVar.v = new oo0(this, 1);
            dVar.d = eVar;
            dVar.f48126e = -2;
            dVar.f48127f = cVar;
            og.a aVar3 = new og.a(dVar);
            this.f39430e0 = aVar3;
            aVar3.f16757f = LiteMode.isEnabled(262144);
        } else {
            this.f39427c0 = null;
            this.f39428d0 = null;
            this.f39430e0 = new og.a(cVar);
        }
        aVar.f16755c = bVar;
        aVar.f16754b = bVar2;
        aVar2.f16755c = bVar;
        aVar2.f16754b = bVar2;
        og.a aVar4 = this.f39430e0;
        aVar4.f16755c = bVar;
        aVar4.f16754b = bVar2;
        this.f39422a = false;
        mh.t7.y(this.currentAccount, false).V();
        mh.l7 l7Var = new mh.l7(this.currentAccount, 0L, false);
        this.f39424b = l7Var;
        l7Var.f(8, false);
        l7Var.a();
        mh.l7 l7Var2 = new mh.l7(this.currentAccount, 0L, false);
        this.f39426c = l7Var2;
        l7Var2.f(8, false);
        l7Var2.f14402f = true;
        l7Var2.a();
        this.resourceProvider = new h(this, 29);
        this.f39438w = new org.telegram.ui.ActionBar.h5(0, false, false, this.resourceProvider);
        this.f39439x = new org.telegram.ui.ActionBar.h5(0, false, true, this.resourceProvider);
    }

    public static boolean B0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        boolean z4;
        if (tL_emojiStatusCollectible == emojiStatus) {
            return true;
        }
        if (tL_emojiStatusCollectible != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        if (z4 == z10 && tL_emojiStatusCollectible != null && z10 && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_emojiStatusCollectible.collectible_id) {
            return true;
        }
        return false;
    }

    public static void U(np0 np0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, no0 no0Var, mh.i4 i4Var, af.f fVar) {
        zArr[0] = true;
        fVar.d();
        mh.t7.x(np0Var.currentAccount, i4Var.f14233a).h(i4Var.f14234b, tL_starGiftUnique, j10, null, true, new eh.w(23, fVar, no0Var));
    }

    public static void V(np0 np0Var, mf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, no0 no0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        mh.i4 i4Var = new mh.i4(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        boolean[] zArr = new boolean[1];
        mh.k4 k4Var = new mh.k4(np0Var.getParentActivity(), np0Var.resourceProvider, tL_starGiftUnique, i4Var, np0Var.currentAccount, j10, l.d.l(tL_starGiftUnique.num, ',', sb), false, new mh.t2(np0Var, zArr, tL_starGiftUnique, j10, no0Var, 1));
        k4Var.h.setOnDismissListener(new hg.g(9, zArr, no0Var));
        k4Var.b();
    }

    public static int f0(np0 np0Var) {
        return np0Var.currentAccount;
    }

    public static org.telegram.ui.ActionBar.g6 g0(np0 np0Var) {
        return np0Var.resourceProvider;
    }

    public static org.telegram.ui.ActionBar.f5 h0(np0 np0Var) {
        return np0Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.g6 i0(np0 np0Var) {
        return np0Var.resourceProvider;
    }

    public static org.telegram.ui.ActionBar.g6 j0(np0 np0Var) {
        return np0Var.resourceProvider;
    }

    public static org.telegram.ui.ActionBar.g6 k0(np0 np0Var) {
        return np0Var.resourceProvider;
    }

    public static int u0(np0 np0Var) {
        return np0Var.currentAccount;
    }

    public static int v0(np0 np0Var) {
        return np0Var.currentAccount;
    }

    public static int w0(int i10) {
        boolean z4;
        float f10;
        if (AndroidUtilities.computePerceivedBrightness(i10) < 0.2f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            f10 = 0.28f;
        } else {
            f10 = -0.28f;
        }
        return org.telegram.ui.ActionBar.k6.b(0.5f, f10, i10);
    }

    public final void A0() {
        int themedColor;
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.k6.f21661d6)) > 0.72d) {
            themedColor = i0.a.d(0.085f, getThemedColor(org.telegram.ui.ActionBar.k6.f21607a7), this.f39429e.getColor());
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21607a7);
        }
        this.d.setBackgroundColor(themedColor);
        tg.c cVar = this.C;
        if (cVar.f48122a.getColor() != themedColor) {
            cVar.a(themedColor);
            Iterator it = this.f39425b0.iterator();
            while (it.hasNext()) {
                ((qg.b) it.next()).u();
            }
            Iterator it2 = this.f39423a0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final hp0 C0() {
        ek ekVar = this.F;
        if (ekVar != null && ekVar.getPositionAnimated() >= 0.5f) {
            return this.h;
        }
        return this.f39435n;
    }

    public final void D0(int i10) {
        if (Build.VERSION.SDK_INT >= 31 && this.f39427c0 != null) {
            lf.e0 e0Var = this.Z;
            if (e0Var.f12417c == 0) {
                e0Var.invalidate();
            }
            e0Var.f12417c = i10 | e0Var.f12417c;
        }
    }

    public final void E0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.np0.E0():void");
    }

    public final void F0() {
        org.telegram.ui.ActionBar.l5 l5Var = this.K;
        if (l5Var != null) {
            l5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.A8));
        }
        this.h.g();
        this.f39435n.g();
        qo0 qo0Var = this.f39429e;
        if (qo0Var != null) {
            qo0Var.f41603a = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21607a7, qo0Var.f41604b);
            qo0Var.a();
            qo0Var.invalidate();
        }
        G0();
        z0();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void G0() {
        float positionAnimated;
        if (this.f39429e != null) {
            A0();
            int tabsViewBackgroundColor = this.f39429e.getTabsViewBackgroundColor();
            if (this.J != null) {
                ek ekVar = this.F;
                if (ekVar == null) {
                    positionAnimated = 0.0f;
                } else {
                    positionAnimated = ekVar.getPositionAnimated();
                }
                float a2 = k7.o.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f);
                org.telegram.ui.Components.sz szVar = this.J;
                int d = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.k6.f21661d6));
                int d10 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.k6.f21607a7));
                int d11 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.k6.f22055z6));
                int d12 = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.k6.G6));
                szVar.f31209a.setColor(d);
                szVar.f31210b.setColor(d10);
                szVar.d = d11;
                szVar.f31212e = d12;
                szVar.invalidate();
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
        this.Z = new lf.e0(context, new mo0(this, 0));
        vg.i iVar = new vg.i(this.d);
        l0 l0Var2 = this.d;
        og.a aVar = this.f39430e0;
        aVar.d = iVar;
        aVar.f16756e = l0Var2;
        this.h = new hp0(this, context, 1);
        this.f39435n = new hp0(this, context, 0);
        qo0 qo0Var = new qo0(this, context, this.resourceProvider);
        this.f39429e = qo0Var;
        qo0Var.B = true;
        this.f39435n.j(false);
        this.f39435n.addView(this.f39429e, 2, k7.c6.e(-1, -2, 55));
        ek ekVar = new ek(this, context, 1);
        this.F = ekVar;
        ekVar.setAdapter(new ro0(this));
        l0Var.addView(this.F, k7.c6.e(-1, -1, 119));
        qh.d dVar = new qh.d(context, getResourceProvider(), true);
        this.N = dVar;
        dVar.setStateListAnimator(null);
        this.N.e();
        this.N.d.o(true, true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.L = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final np0 f40093b;

            {
                this.f40093b = this;
            }

            @Override
            public final void onClick(View view) {
                int i12 = r2;
                np0 np0Var = this.f40093b;
                switch (i12) {
                    case 0:
                        np0Var.y0();
                        return;
                    case 1:
                        if (np0Var.onBackPressed(true)) {
                            np0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        np0 np0Var2 = this.f40093b;
                        FrameLayout frameLayout2 = (FrameLayout) np0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        np0Var2.H.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        np0Var2.H.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        np0Var2.H.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        jc jcVar = new jc(np0Var2, np0Var2.getParentActivity(), canvas, (np0Var2.H.getMeasuredWidth() / 2.0f) + f10, (np0Var2.H.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        np0Var2.U = jcVar;
                        jcVar.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
                        np0Var2.V = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        np0Var2.W = ofFloat;
                        ofFloat.addUpdateListener(new kc(np0Var2, 1));
                        np0Var2.W.addListener(new org.telegram.ui.Components.f91(np0Var2, 28));
                        np0Var2.W.setDuration(400L);
                        np0Var2.W.setInterpolator(org.telegram.ui.Components.jt.f28179e);
                        np0Var2.W.start();
                        frameLayout2.addView(np0Var2.U, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new oo0(np0Var2, 0));
                        return;
                }
            }
        });
        this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.L.addView(this.N, k7.c6.c(-1.0f, -1));
        FrameLayout frameLayout2 = this.L;
        qg.b c3 = this.B.c(frameLayout2, null, false);
        c3.n(sg.b.j(this.resourceProvider));
        c3.p(AndroidUtilities.dp(28.0f));
        c3.o(AndroidUtilities.dp(5.0f));
        frameLayout2.setBackground(c3);
        k7.e6.b(this.L, 0.02f, 1.5f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.M = frameLayout3;
        frameLayout3.addView(this.L, k7.c6.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        og.b bVar = new og.b(this.D.c(this.M, null, false));
        bVar.b(AndroidUtilities.dp(40.0f), true);
        bVar.f16772q = 220;
        this.M.setBackground(bVar);
        hp0 C0 = C0();
        qh.d dVar2 = this.N;
        if (dVar2 != null && C0 != null && C0 != this.O) {
            this.O = C0;
            n7.qa qaVar = C0.f37448e;
            dVar2.g((CharSequence) qaVar.f15701b, false, true);
            this.N.f((SpannableStringBuilder) qaVar.f15702c, false);
        }
        l0Var.addView(this.M, k7.c6.e(-1, -2, 80));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.I = frameLayout4;
        l0Var.addView(frameLayout4, k7.c6.e(-1, -2, 55));
        boolean z4 = this.f39422a;
        if (!z4) {
            org.telegram.ui.Components.sz szVar = new org.telegram.ui.Components.sz(context);
            this.J = szVar;
            if (z4) {
                i10 = R.string.ChannelColorTabProfile;
            } else {
                i10 = R.string.UserColorTabProfile;
            }
            String string = LocaleController.getString(i10);
            if (z4) {
                i11 = R.string.ChannelColorTabName;
            } else {
                i11 = R.string.UserColorTabName;
            }
            szVar.setTabs(string, LocaleController.getString(i11));
            this.J.f31215r = new no0(this, 1);
            G0();
            this.I.addView(this.J, k7.c6.e(-1, 40, 17));
        } else {
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
            this.K = l5Var;
            l5Var.l(LocaleController.getString(R.string.ChannelColorTitle2), false);
            this.K.setEllipsizeByGradient(true);
            this.K.setTextSize(20);
            this.K.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.A8));
            this.K.setTypeface(AndroidUtilities.bold());
            this.I.addView(this.K, k7.c6.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        }
        qo0 qo0Var2 = this.f39429e;
        if (qo0Var2 != null) {
            qo0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                AndroidUtilities.setLightStatusBar(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.G = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.G;
        int i12 = org.telegram.ui.ActionBar.k6.f21965u8;
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.f0(getThemedColor(i12), 1, -1));
        this.G.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.G;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final np0 f40093b;

            {
                this.f40093b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                np0 np0Var = this.f40093b;
                switch (i122) {
                    case 0:
                        np0Var.y0();
                        return;
                    case 1:
                        if (np0Var.onBackPressed(true)) {
                            np0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        np0 np0Var2 = this.f40093b;
                        FrameLayout frameLayout22 = (FrameLayout) np0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        np0Var2.H.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        np0Var2.H.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        np0Var2.H.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        jc jcVar = new jc(np0Var2, np0Var2.getParentActivity(), canvas, (np0Var2.H.getMeasuredWidth() / 2.0f) + f10, (np0Var2.H.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        np0Var2.U = jcVar;
                        jcVar.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
                        np0Var2.V = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        np0Var2.W = ofFloat;
                        ofFloat.addUpdateListener(new kc(np0Var2, 1));
                        np0Var2.W.addListener(new org.telegram.ui.Components.f91(np0Var2, 28));
                        np0Var2.W.setDuration(400L);
                        np0Var2.W.setInterpolator(org.telegram.ui.Components.jt.f28179e);
                        np0Var2.W.start();
                        frameLayout22.addView(np0Var2.U, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new oo0(np0Var2, 0));
                        return;
                }
            }
        });
        k7.e6.a(this.G);
        this.I.addView(this.G, k7.c6.e(54, 54, 19));
        org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.Q = hj0Var;
        hj0Var.h = true;
        if (!this.P) {
            hj0Var.N(0);
            this.Q.K(0);
        } else {
            hj0Var.K(35);
            this.Q.N(36);
        }
        this.Q.X = true;
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.J9, false);
        this.Q.O(w02, "Sunny");
        this.Q.O(w02, "Path 6");
        this.Q.O(w02, "Path");
        this.Q.O(w02, "Path 5");
        this.Q.m();
        ImageView imageView4 = new ImageView(context);
        this.H = imageView4;
        imageView4.setScaleType(scaleType);
        this.H.setBackground(org.telegram.ui.ActionBar.k6.f0(getThemedColor(i12), 1, -1));
        this.H.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final np0 f40093b;

            {
                this.f40093b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                np0 np0Var = this.f40093b;
                switch (i122) {
                    case 0:
                        np0Var.y0();
                        return;
                    case 1:
                        if (np0Var.onBackPressed(true)) {
                            np0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        np0 np0Var2 = this.f40093b;
                        FrameLayout frameLayout22 = (FrameLayout) np0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        np0Var2.H.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        np0Var2.H.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        np0Var2.H.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        jc jcVar = new jc(np0Var2, np0Var2.getParentActivity(), canvas, (np0Var2.H.getMeasuredWidth() / 2.0f) + f10, (np0Var2.H.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        np0Var2.U = jcVar;
                        jcVar.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
                        np0Var2.V = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        np0Var2.W = ofFloat;
                        ofFloat.addUpdateListener(new kc(np0Var2, 1));
                        np0Var2.W.addListener(new org.telegram.ui.Components.f91(np0Var2, 28));
                        np0Var2.W.setDuration(400L);
                        np0Var2.W.setInterpolator(org.telegram.ui.Components.jt.f28179e);
                        np0Var2.W.start();
                        frameLayout22.addView(np0Var2.U, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new oo0(np0Var2, 0));
                        return;
                }
            }
        });
        this.I.addView(this.H, k7.c6.e(54, 54, 21));
        this.H.setImageDrawable(this.Q);
        qo0 qo0Var3 = this.f39429e;
        qo0Var3.getClass();
        qo0Var3.f41603a = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21607a7, qo0Var3.f41604b);
        qo0Var3.a();
        qo0Var3.invalidate();
        z0();
        this.d.addView(this.Z);
        A0();
        View view = this.fragmentView;
        mo0 mo0Var = new mo0(this, 1);
        WeakHashMap weakHashMap = r0.j0.f46469a;
        r0.b0.j(view, mo0Var);
        return this.d;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.h.f(true);
                this.f39435n.f(true);
            } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
                this.h.e();
                this.f39435n.e();
            } else if (i10 == NotificationCenter.starGiftsLoaded) {
                this.h.e();
                this.f39435n.e();
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.a4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.a4.f21184c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return k7.f6.a(new f(this, 27), org.telegram.ui.ActionBar.k6.f21661d6, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.f22055z6, org.telegram.ui.ActionBar.k6.f21752i6, org.telegram.ui.ActionBar.k6.f21607a7, org.telegram.ui.ActionBar.k6.B6, org.telegram.ui.ActionBar.k6.f21878p7, org.telegram.ui.ActionBar.k6.f21698f6, org.telegram.ui.ActionBar.k6.f21716g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
    }

    @Override
    public final boolean isLightStatusBar() {
        qo0 qo0Var = this.f39429e;
        if (qo0Var == null) {
            return super.isLightStatusBar();
        }
        if (i0.a.f(qo0Var.getColor()) > 0.699999988079071d) {
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
        if (!this.f39422a && ((this.h.b() || this.f39435n.b()) && getUserConfig().isPremium())) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        int i10;
        int i11;
        boolean z10 = this.f39422a;
        if (!z10 && ((this.h.b() || this.f39435n.b()) && getUserConfig().isPremium())) {
            if (z4 && getVisibleDialog() == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                if (z10) {
                    i10 = R.string.ChannelColorUnsaved;
                } else {
                    i10 = R.string.UserColorUnsaved;
                }
                alertDialog$Builder.f21168a.O = LocaleController.getString(i10);
                if (z10) {
                    i11 = R.string.ChannelColorUnsavedMessage;
                } else {
                    i11 = R.string.UserColorUnsavedMessage;
                }
                alertDialog$Builder.f21168a.Q = LocaleController.getString(i11);
                alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new mo0(this, 2));
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new mo0(this, 3));
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                showDialog(d2Var);
                ((TextView) d2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21897q7));
            }
            return false;
        }
        return super.onBackPressed(z4);
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
        setBulletinDelegate(new hg.w(10));
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
    public final void setResourceProvider(org.telegram.ui.ActionBar.g6 g6Var) {
        this.f39437s = g6Var;
    }

    public final void x0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.np0.x0():void");
    }

    public final void y0() {
        mf.b bVar;
        if (this.f39436r) {
            return;
        }
        if (this.f39422a) {
            finishFragment();
        } else if (!getUserConfig().isPremium()) {
            showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) this, 23, true));
            return;
        }
        hp0 C0 = C0();
        if (C0.F != null) {
            hp0 hp0Var = this.h;
            if (C0 == hp0Var) {
                hp0Var = this.f39435n;
            }
            hp0Var.d();
            this.f39436r = true;
            this.N.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = C0.F;
            no0 no0Var = new no0(this, 0);
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            if (tL_starGiftUnique.resale_ton_only) {
                bVar = mf.b.f13654b;
            } else {
                bVar = mf.b.f13653a;
            }
            mh.t7.x(this.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new lh.h5(this, bVar, tL_starGiftUnique, clientUserId, no0Var));
            return;
        }
        hp0 hp0Var2 = this.h;
        if (C0 == hp0Var2) {
            hp0Var2 = this.f39435n;
        }
        if (hp0Var2.F != null) {
            hp0Var2.d();
        }
        x0();
        finishFragment();
        E0();
    }

    public final void z0() {
        this.f39440y.a(getThemedColor(org.telegram.ui.ActionBar.k6.f21661d6));
        this.L.invalidate();
        this.M.invalidate();
        this.h.f37461w.invalidate();
        this.h.f37462x.invalidate();
        this.f39435n.f37461w.invalidate();
        this.h.f37443b.invalidate();
        this.f39435n.f37443b.invalidate();
        ((qg.b) this.L.getBackground()).u();
        A0();
        Iterator it = this.f39425b0.iterator();
        while (it.hasNext()) {
            ((qg.b) it.next()).u();
        }
    }
}

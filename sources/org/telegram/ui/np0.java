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
    public final ng.a B;
    public final sg.c C;
    public final ng.a D;
    public org.telegram.ui.ActionBar.p2 E;
    public gk F;
    public ImageView G;
    public ImageView H;
    public FrameLayout I;
    public org.telegram.ui.Components.qz J;
    public org.telegram.ui.ActionBar.k5 K;
    public FrameLayout L;
    public FrameLayout M;
    public ph.d N;
    public hp0 O;
    public boolean P;
    public org.telegram.ui.Components.gj0 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public mc U;
    public float V;
    public ValueAnimator W;
    public boolean X;
    public i0.b Y;
    public kf.e0 Z;
    public final boolean f36553a;
    public final be.b f36554a0;
    public final lh.l7 f36555b;
    public final be.b f36556b0;
    public final lh.l7 f36557c;
    public final ng.e f36558c0;
    public n0 d;
    public final sg.d f36559d0;
    public qo0 e;
    public final ng.a f36560e0;
    public final int f36561f;
    public final wa f36562f0;
    public final ArrayList f36563g0;
    public hp0 h;
    public final ArrayList f36564h0;
    public hp0 f36565n;
    public boolean f36566r;
    public org.telegram.ui.ActionBar.f6 f36567s;
    public final SparseIntArray v;
    public final org.telegram.ui.ActionBar.g5 f36568w;
    public final org.telegram.ui.ActionBar.g5 f36569x;
    public final sg.c f36570y;

    public np0() {
        super(null);
        this.f36561f = AndroidUtilities.dp(6.0f);
        this.v = new SparseIntArray();
        boolean q10 = org.telegram.ui.ActionBar.j6.I.q();
        this.P = q10;
        this.X = q10;
        this.Y = i0.b.e;
        be.b bVar = new be.b(true);
        this.f36554a0 = bVar;
        be.b bVar2 = new be.b(true);
        this.f36556b0 = bVar2;
        this.f36562f0 = new wa(this, 1);
        this.f36563g0 = new ArrayList();
        this.f36564h0 = new ArrayList();
        sg.c cVar = new sg.c();
        this.f36570y = cVar;
        ng.a aVar = new ng.a(cVar);
        this.B = aVar;
        sg.c cVar2 = new sg.c();
        this.C = cVar2;
        ng.a aVar2 = new ng.a(cVar2);
        this.D = aVar2;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ng.e eVar = new ng.e(false);
            this.f36558c0 = eVar;
            sg.d dVar = new sg.d(cVar);
            this.f36559d0 = dVar;
            dVar.v = new oo0(this, 1);
            dVar.d = eVar;
            dVar.e = -2;
            dVar.f44378f = cVar;
            ng.a aVar3 = new ng.a(dVar);
            this.f36560e0 = aVar3;
            aVar3.f14952f = LiteMode.isEnabled(262144);
        } else {
            this.f36558c0 = null;
            this.f36559d0 = null;
            this.f36560e0 = new ng.a(cVar);
        }
        aVar.f14951c = bVar;
        aVar.f14950b = bVar2;
        aVar2.f14951c = bVar;
        aVar2.f14950b = bVar2;
        ng.a aVar4 = this.f36560e0;
        aVar4.f14951c = bVar;
        aVar4.f14950b = bVar2;
        this.f36553a = false;
        lh.t7.y(this.currentAccount, false).V();
        lh.l7 l7Var = new lh.l7(this.currentAccount, 0L, false);
        this.f36555b = l7Var;
        l7Var.f(8, false);
        l7Var.a();
        lh.l7 l7Var2 = new lh.l7(this.currentAccount, 0L, false);
        this.f36557c = l7Var2;
        l7Var2.f(8, false);
        l7Var2.f12751f = true;
        l7Var2.a();
        this.resourceProvider = new h(this, 29);
        this.f36568w = new org.telegram.ui.ActionBar.g5(0, false, false, this.resourceProvider);
        this.f36569x = new org.telegram.ui.ActionBar.g5(0, false, true, this.resourceProvider);
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

    public static void U(np0 np0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, no0 no0Var, lh.i4 i4Var, ze.c cVar) {
        zArr[0] = true;
        cVar.d();
        lh.t7.x(np0Var.currentAccount, i4Var.f12569a).h(i4Var.f12570b, tL_starGiftUnique, j10, null, true, new dh.v(23, cVar, no0Var));
    }

    public static void V(np0 np0Var, lf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, no0 no0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        lh.i4 i4Var = new lh.i4(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        boolean[] zArr = new boolean[1];
        lh.k4 k4Var = new lh.k4(np0Var.getParentActivity(), np0Var.resourceProvider, tL_starGiftUnique, i4Var, np0Var.currentAccount, j10, kf.k0.l(tL_starGiftUnique.num, ',', sb), false, new lh.u2(np0Var, zArr, tL_starGiftUnique, j10, no0Var, 1));
        k4Var.h.setOnDismissListener(new gg.g(9, zArr, no0Var));
        k4Var.b();
    }

    public static int f0(np0 np0Var) {
        return np0Var.currentAccount;
    }

    public static org.telegram.ui.ActionBar.f6 g0(np0 np0Var) {
        return np0Var.resourceProvider;
    }

    public static org.telegram.ui.ActionBar.e5 h0(np0 np0Var) {
        return np0Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.f6 i0(np0 np0Var) {
        return np0Var.resourceProvider;
    }

    public static org.telegram.ui.ActionBar.f6 j0(np0 np0Var) {
        return np0Var.resourceProvider;
    }

    public static org.telegram.ui.ActionBar.f6 k0(np0 np0Var) {
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
        return org.telegram.ui.ActionBar.j6.b(0.5f, f10, i10);
    }

    public final void A0() {
        int themedColor;
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6)) > 0.72d) {
            themedColor = i0.a.d(0.085f, getThemedColor(org.telegram.ui.ActionBar.j6.f19827a7), this.e.getColor());
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f19827a7);
        }
        this.d.setBackgroundColor(themedColor);
        sg.c cVar = this.C;
        if (cVar.f44374a.getColor() != themedColor) {
            cVar.a(themedColor);
            Iterator it = this.f36556b0.iterator();
            while (it.hasNext()) {
                ((pg.b) it.next()).u();
            }
            Iterator it2 = this.f36554a0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final hp0 C0() {
        gk gkVar = this.F;
        if (gkVar != null && gkVar.getPositionAnimated() >= 0.5f) {
            return this.h;
        }
        return this.f36565n;
    }

    public final void D0(int i10) {
        if (Build.VERSION.SDK_INT >= 31 && this.f36558c0 != null) {
            kf.e0 e0Var = this.Z;
            if (e0Var.f10417c == 0) {
                e0Var.invalidate();
            }
            e0Var.f10417c = i10 | e0Var.f10417c;
        }
    }

    public final void E0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.np0.E0():void");
    }

    public final void F0() {
        org.telegram.ui.ActionBar.k5 k5Var = this.K;
        if (k5Var != null) {
            k5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.A8));
        }
        this.h.g();
        this.f36565n.g();
        qo0 qo0Var = this.e;
        if (qo0Var != null) {
            qo0Var.f38558a = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19827a7, qo0Var.f38559b);
            qo0Var.a();
            qo0Var.invalidate();
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
            if (this.J != null) {
                gk gkVar = this.F;
                if (gkVar == null) {
                    positionAnimated = 0.0f;
                } else {
                    positionAnimated = gkVar.getPositionAnimated();
                }
                float a2 = k7.n.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f);
                org.telegram.ui.Components.qz qzVar = this.J;
                int d = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
                int d10 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.j6.f19827a7));
                int d11 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.j6.f20273z6));
                int d12 = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                qzVar.f28328a.setColor(d);
                qzVar.f28329b.setColor(d10);
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
        n0 n0Var = new n0(this, context, 15);
        this.d = n0Var;
        this.fragmentView = n0Var;
        this.Z = new kf.e0(context, new mo0(this, 0));
        ug.i iVar = new ug.i(this.d);
        n0 n0Var2 = this.d;
        ng.a aVar = this.f36560e0;
        aVar.d = iVar;
        aVar.e = n0Var2;
        this.h = new hp0(this, context, 1);
        this.f36565n = new hp0(this, context, 0);
        qo0 qo0Var = new qo0(this, context, this.resourceProvider);
        this.e = qo0Var;
        qo0Var.B = true;
        this.f36565n.j(false);
        this.f36565n.addView(this.e, 2, k7.b6.e(-1, -2, 55));
        gk gkVar = new gk(this, context, 1);
        this.F = gkVar;
        gkVar.setAdapter(new ro0(this));
        n0Var.addView(this.F, k7.b6.e(-1, -1, 119));
        ph.d dVar = new ph.d(context, getResourceProvider(), true);
        this.N = dVar;
        dVar.setStateListAnimator(null);
        this.N.e();
        this.N.d.o(true, true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.L = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final np0 f37203b;

            {
                this.f37203b = this;
            }

            @Override
            public final void onClick(View view) {
                int i12 = r2;
                np0 np0Var = this.f37203b;
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
                        np0 np0Var2 = this.f37203b;
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
                        mc mcVar = new mc(np0Var2, np0Var2.getParentActivity(), canvas, (np0Var2.H.getMeasuredWidth() / 2.0f) + f10, (np0Var2.H.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        np0Var2.U = mcVar;
                        mcVar.setOnTouchListener(new oh.d(2));
                        np0Var2.V = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        np0Var2.W = ofFloat;
                        ofFloat.addUpdateListener(new nc(np0Var2, 1));
                        np0Var2.W.addListener(new org.telegram.ui.Components.f91(np0Var2, 28));
                        np0Var2.W.setDuration(400L);
                        np0Var2.W.setInterpolator(org.telegram.ui.Components.ft.e);
                        np0Var2.W.start();
                        frameLayout2.addView(np0Var2.U, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new oo0(np0Var2, 0));
                        return;
                }
            }
        });
        this.L.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.L.addView(this.N, k7.b6.c(-1.0f, -1));
        FrameLayout frameLayout2 = this.L;
        pg.b c3 = this.B.c(frameLayout2, null, false);
        c3.n(rg.b.j(this.resourceProvider));
        c3.p(AndroidUtilities.dp(28.0f));
        c3.o(AndroidUtilities.dp(5.0f));
        frameLayout2.setBackground(c3);
        k7.d6.b(this.L, 0.02f, 1.5f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.M = frameLayout3;
        frameLayout3.addView(this.L, k7.b6.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        ng.b bVar = new ng.b(this.D.c(this.M, null, false));
        bVar.b(AndroidUtilities.dp(40.0f), true);
        bVar.f14966q = 220;
        this.M.setBackground(bVar);
        hp0 C0 = C0();
        ph.d dVar2 = this.N;
        if (dVar2 != null && C0 != null && C0 != this.O) {
            this.O = C0;
            n7.qa qaVar = C0.e;
            dVar2.g((CharSequence) qaVar.f14687b, false, true);
            this.N.f((SpannableStringBuilder) qaVar.f14688c, false);
        }
        n0Var.addView(this.M, k7.b6.e(-1, -2, 80));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.I = frameLayout4;
        n0Var.addView(frameLayout4, k7.b6.e(-1, -2, 55));
        boolean z4 = this.f36553a;
        if (!z4) {
            org.telegram.ui.Components.qz qzVar = new org.telegram.ui.Components.qz(context);
            this.J = qzVar;
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
            qzVar.setTabs(string, LocaleController.getString(i11));
            this.J.f28333r = new no0(this, 1);
            G0();
            this.I.addView(this.J, k7.b6.e(-1, 40, 17));
        } else {
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
            this.K = k5Var;
            k5Var.l(LocaleController.getString(R.string.ChannelColorTitle2), false);
            this.K.setEllipsizeByGradient(true);
            this.K.setTextSize(20);
            this.K.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.A8));
            this.K.setTypeface(AndroidUtilities.bold());
            this.I.addView(this.K, k7.b6.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        }
        qo0 qo0Var2 = this.e;
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
        int i12 = org.telegram.ui.ActionBar.j6.f20184u8;
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i12), 1, -1));
        this.G.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.G;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final np0 f37203b;

            {
                this.f37203b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                np0 np0Var = this.f37203b;
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
                        np0 np0Var2 = this.f37203b;
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
                        mc mcVar = new mc(np0Var2, np0Var2.getParentActivity(), canvas, (np0Var2.H.getMeasuredWidth() / 2.0f) + f10, (np0Var2.H.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        np0Var2.U = mcVar;
                        mcVar.setOnTouchListener(new oh.d(2));
                        np0Var2.V = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        np0Var2.W = ofFloat;
                        ofFloat.addUpdateListener(new nc(np0Var2, 1));
                        np0Var2.W.addListener(new org.telegram.ui.Components.f91(np0Var2, 28));
                        np0Var2.W.setDuration(400L);
                        np0Var2.W.setInterpolator(org.telegram.ui.Components.ft.e);
                        np0Var2.W.start();
                        frameLayout22.addView(np0Var2.U, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new oo0(np0Var2, 0));
                        return;
                }
            }
        });
        k7.d6.a(this.G);
        this.I.addView(this.G, k7.b6.e(54, 54, 19));
        org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.Q = gj0Var;
        gj0Var.h = true;
        if (!this.P) {
            gj0Var.N(0);
            this.Q.K(0);
        } else {
            gj0Var.K(35);
            this.Q.N(36);
        }
        this.Q.X = true;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J9, false);
        this.Q.O(w02, "Sunny");
        this.Q.O(w02, "Path 6");
        this.Q.O(w02, "Path");
        this.Q.O(w02, "Path 5");
        this.Q.m();
        ImageView imageView4 = new ImageView(context);
        this.H = imageView4;
        imageView4.setScaleType(scaleType);
        this.H.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i12), 1, -1));
        this.H.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final np0 f37203b;

            {
                this.f37203b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                np0 np0Var = this.f37203b;
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
                        np0 np0Var2 = this.f37203b;
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
                        mc mcVar = new mc(np0Var2, np0Var2.getParentActivity(), canvas, (np0Var2.H.getMeasuredWidth() / 2.0f) + f10, (np0Var2.H.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        np0Var2.U = mcVar;
                        mcVar.setOnTouchListener(new oh.d(2));
                        np0Var2.V = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        np0Var2.W = ofFloat;
                        ofFloat.addUpdateListener(new nc(np0Var2, 1));
                        np0Var2.W.addListener(new org.telegram.ui.Components.f91(np0Var2, 28));
                        np0Var2.W.setDuration(400L);
                        np0Var2.W.setInterpolator(org.telegram.ui.Components.ft.e);
                        np0Var2.W.start();
                        frameLayout22.addView(np0Var2.U, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new oo0(np0Var2, 0));
                        return;
                }
            }
        });
        this.I.addView(this.H, k7.b6.e(54, 54, 21));
        this.H.setImageDrawable(this.Q);
        qo0 qo0Var3 = this.e;
        qo0Var3.getClass();
        qo0Var3.f38558a = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19827a7, qo0Var3.f38559b);
        qo0Var3.a();
        qo0Var3.invalidate();
        z0();
        this.d.addView(this.Z);
        A0();
        View view = this.fragmentView;
        mo0 mo0Var = new mo0(this, 1);
        WeakHashMap weakHashMap = r0.j0.f43142a;
        r0.b0.j(view, mo0Var);
        return this.d;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.h.f(true);
                this.f36565n.f(true);
            } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
                this.h.e();
                this.f36565n.e();
            } else if (i10 == NotificationCenter.starGiftsLoaded) {
                this.h.e();
                this.f36565n.e();
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.z3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.z3.f20759c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return k7.e6.a(new f(this, 27), org.telegram.ui.ActionBar.j6.f19881d6, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.f20273z6, org.telegram.ui.ActionBar.j6.f19971i6, org.telegram.ui.ActionBar.j6.f19827a7, org.telegram.ui.ActionBar.j6.B6, org.telegram.ui.ActionBar.j6.f20097p7, org.telegram.ui.ActionBar.j6.f19917f6, org.telegram.ui.ActionBar.j6.f19935g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
    }

    @Override
    public final boolean isLightStatusBar() {
        qo0 qo0Var = this.e;
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
        if (!this.f36553a && ((this.h.b() || this.f36565n.b()) && getUserConfig().isPremium())) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        int i10;
        int i11;
        boolean z10 = this.f36553a;
        if (!z10 && ((this.h.b() || this.f36565n.b()) && getUserConfig().isPremium())) {
            if (z4 && getVisibleDialog() == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                if (z10) {
                    i10 = R.string.ChannelColorUnsaved;
                } else {
                    i10 = R.string.UserColorUnsaved;
                }
                alertDialog$Builder.f19478a.O = LocaleController.getString(i10);
                if (z10) {
                    i11 = R.string.ChannelColorUnsavedMessage;
                } else {
                    i11 = R.string.UserColorUnsavedMessage;
                }
                alertDialog$Builder.f19478a.Q = LocaleController.getString(i11);
                alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new mo0(this, 2));
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new mo0(this, 3));
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                showDialog(d2Var);
                ((TextView) d2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20116q7));
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
        setBulletinDelegate(new gg.w(10));
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
        this.f36567s = f6Var;
    }

    public final void x0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.np0.x0():void");
    }

    public final void y0() {
        lf.b bVar;
        if (this.f36566r) {
            return;
        }
        if (this.f36553a) {
            finishFragment();
        } else if (!getUserConfig().isPremium()) {
            showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) this, 23, true));
            return;
        }
        hp0 C0 = C0();
        if (C0.F != null) {
            hp0 hp0Var = this.h;
            if (C0 == hp0Var) {
                hp0Var = this.f36565n;
            }
            hp0Var.d();
            this.f36566r = true;
            this.N.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = C0.F;
            no0 no0Var = new no0(this, 0);
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            if (tL_starGiftUnique.resale_ton_only) {
                bVar = lf.b.f12057b;
            } else {
                bVar = lf.b.f12056a;
            }
            lh.t7.x(this.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new kh.g5(this, bVar, tL_starGiftUnique, clientUserId, no0Var));
            return;
        }
        hp0 hp0Var2 = this.h;
        if (C0 == hp0Var2) {
            hp0Var2 = this.f36565n;
        }
        if (hp0Var2.F != null) {
            hp0Var2.d();
        }
        x0();
        finishFragment();
        E0();
    }

    public final void z0() {
        this.f36570y.a(getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
        this.L.invalidate();
        this.M.invalidate();
        this.h.f34737w.invalidate();
        this.h.f34738x.invalidate();
        this.f36565n.f34737w.invalidate();
        this.h.f34720b.invalidate();
        this.f36565n.f34720b.invalidate();
        ((pg.b) this.L.getBackground()).u();
        A0();
        Iterator it = this.f36556b0.iterator();
        while (it.hasNext()) {
            ((pg.b) it.next()).u();
        }
    }
}

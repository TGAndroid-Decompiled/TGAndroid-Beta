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
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ip0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public ImageView B;
    public ImageView C;
    public FrameLayout D;
    public org.telegram.ui.Components.sz E;
    public org.telegram.ui.ActionBar.l5 F;
    public boolean G;
    public org.telegram.ui.Components.ij0 H;
    public boolean I;
    public boolean J;
    public boolean K;
    public kc L;
    public float M;
    public ValueAnimator N;
    public boolean O;
    public final boolean f37904a;
    public final mh.l7 f37905b;
    public final mh.l7 f37906c;
    public l0 d;
    public oo0 f37907e;
    public dp0 f37908f;
    public dp0 h;
    public boolean f37909n;
    public org.telegram.ui.ActionBar.g6 f37910r;
    public final SparseIntArray f37911s;
    public final org.telegram.ui.ActionBar.h5 v;
    public final org.telegram.ui.ActionBar.h5 f37912w;
    public org.telegram.ui.ActionBar.p2 f37913x;
    public ek f37914y;

    public ip0() {
        super(null);
        this.f37911s = new SparseIntArray();
        boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
        this.G = q10;
        this.O = q10;
        this.f37904a = false;
        mh.t7.y(this.currentAccount, false).V();
        mh.l7 l7Var = new mh.l7(this.currentAccount, 0L, false);
        this.f37905b = l7Var;
        l7Var.f(8, false);
        l7Var.a();
        mh.l7 l7Var2 = new mh.l7(this.currentAccount, 0L, false);
        this.f37906c = l7Var2;
        l7Var2.f(8, false);
        l7Var2.f14400f = true;
        l7Var2.a();
        this.resourceProvider = new h(this, 29);
        this.v = new org.telegram.ui.ActionBar.h5(0, false, false, this.resourceProvider);
        this.f37912w = new org.telegram.ui.ActionBar.h5(0, false, true, this.resourceProvider);
    }

    public static void U(ip0 ip0Var, mf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, org.telegram.ui.Components.xk xkVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        mh.i4 i4Var = new mh.i4(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        boolean[] zArr = new boolean[1];
        mh.k4 k4Var = new mh.k4(ip0Var.getParentActivity(), ip0Var.resourceProvider, tL_starGiftUnique, i4Var, ip0Var.currentAccount, j10, l.d.l(tL_starGiftUnique.num, ',', sb), false, new mh.t2(ip0Var, zArr, tL_starGiftUnique, j10, xkVar, 1));
        k4Var.h.setOnDismissListener(new hg.g(9, zArr, xkVar));
        k4Var.b();
    }

    public static void V(ip0 ip0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, org.telegram.ui.Components.xk xkVar, mh.i4 i4Var, af.f fVar) {
        zArr[0] = true;
        fVar.d();
        mh.t7.x(ip0Var.currentAccount, i4Var.f14231a).h(i4Var.f14232b, tL_starGiftUnique, j10, null, true, new eh.w(23, fVar, xkVar));
    }

    public static int h0(ip0 ip0Var) {
        return ip0Var.currentAccount;
    }

    public static int u0(int i10) {
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

    public static boolean x0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        boolean z4;
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

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        this.f37908f = new dp0(this, context, 1);
        this.h = new dp0(this, context, 0);
        this.actionBar.setCastShadows(false);
        this.actionBar.setVisibility(8);
        this.actionBar.setAllowOverlayTitle(false);
        l0 l0Var = new l0(this, context, 15);
        l0Var.setFitsSystemWindows(true);
        this.f37907e = new oo0(this, context, this.resourceProvider);
        this.h.i(false);
        l0Var.addView(this.f37907e, k7.c6.e(-1, -2, 55));
        ek ekVar = new ek(this, context, 1);
        this.f37914y = ekVar;
        ekVar.setAdapter(new po0(this));
        l0Var.addView(this.f37914y, k7.c6.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        this.D = frameLayout;
        l0Var.addView(frameLayout, k7.c6.e(-1, -2, 55));
        boolean z4 = this.f37904a;
        if (!z4) {
            org.telegram.ui.Components.sz szVar = new org.telegram.ui.Components.sz(context);
            this.E = szVar;
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
            org.telegram.ui.Components.sz szVar2 = this.E;
            szVar2.f31206f = new w3(this, 12);
            this.D.addView(szVar2, k7.c6.e(-1, 40, 17));
        } else {
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
            this.F = l5Var;
            l5Var.l(LocaleController.getString(R.string.ChannelColorTitle2), false);
            this.F.setEllipsizeByGradient(true);
            this.F.setTextSize(20);
            this.F.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.A8));
            this.F.setTypeface(AndroidUtilities.bold());
            this.D.addView(this.F, k7.c6.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        }
        oo0 oo0Var = this.f37907e;
        if (oo0Var != null) {
            oo0Var.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                AndroidUtilities.setLightStatusBar(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.B = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.B;
        int i12 = org.telegram.ui.ActionBar.k6.f21963u8;
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.f0(getThemedColor(i12), 1, -1));
        this.B.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.B;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.B.setOnClickListener(new View.OnClickListener(this) {
            public final ip0 f39188b;

            {
                this.f39188b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ip0 ip0Var = this.f39188b;
                        if (ip0Var.onBackPressed(true)) {
                            ip0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        ip0 ip0Var2 = this.f39188b;
                        FrameLayout frameLayout2 = (FrameLayout) ip0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        ip0Var2.C.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        ip0Var2.C.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        ip0Var2.C.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        kc kcVar = new kc(ip0Var2, ip0Var2.getParentActivity(), canvas, (ip0Var2.C.getMeasuredWidth() / 2.0f) + f10, (ip0Var2.C.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight, paint, createBitmap, paint2, f10, f11, 1);
                        ip0Var2.L = kcVar;
                        kcVar.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
                        ip0Var2.M = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ip0Var2.N = ofFloat;
                        ofFloat.addUpdateListener(new lc(ip0Var2, 1));
                        ip0Var2.N.addListener(new org.telegram.ui.Components.g91(ip0Var2, 28));
                        ip0Var2.N.setDuration(400L);
                        ip0Var2.N.setInterpolator(org.telegram.ui.Components.jt.f28199e);
                        ip0Var2.N.start();
                        frameLayout2.addView(ip0Var2.L, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new gl0(ip0Var2, 10));
                        return;
                }
            }
        });
        this.D.addView(this.B, k7.c6.e(54, 54, 19));
        int i13 = R.raw.sun;
        org.telegram.ui.Components.ij0 ij0Var = new org.telegram.ui.Components.ij0(i13, "" + R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.H = ij0Var;
        ij0Var.h = true;
        if (!this.G) {
            ij0Var.N(0);
            this.H.K(0);
        } else {
            ij0Var.K(35);
            this.H.N(36);
        }
        this.H.X = true;
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.J9, false);
        this.H.O(w02, "Sunny");
        this.H.O(w02, "Path 6");
        this.H.O(w02, "Path");
        this.H.O(w02, "Path 5");
        this.H.m();
        ImageView imageView4 = new ImageView(context);
        this.C = imageView4;
        imageView4.setScaleType(scaleType);
        this.C.setBackground(org.telegram.ui.ActionBar.k6.f0(getThemedColor(i12), 1, -1));
        this.C.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.C.setOnClickListener(new View.OnClickListener(this) {
            public final ip0 f39188b;

            {
                this.f39188b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ip0 ip0Var = this.f39188b;
                        if (ip0Var.onBackPressed(true)) {
                            ip0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        ip0 ip0Var2 = this.f39188b;
                        FrameLayout frameLayout2 = (FrameLayout) ip0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        ip0Var2.C.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        ip0Var2.C.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        ip0Var2.C.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        kc kcVar = new kc(ip0Var2, ip0Var2.getParentActivity(), canvas, (ip0Var2.C.getMeasuredWidth() / 2.0f) + f10, (ip0Var2.C.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight, paint, createBitmap, paint2, f10, f11, 1);
                        ip0Var2.L = kcVar;
                        kcVar.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
                        ip0Var2.M = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ip0Var2.N = ofFloat;
                        ofFloat.addUpdateListener(new lc(ip0Var2, 1));
                        ip0Var2.N.addListener(new org.telegram.ui.Components.g91(ip0Var2, 28));
                        ip0Var2.N.setDuration(400L);
                        ip0Var2.N.setInterpolator(org.telegram.ui.Components.jt.f28199e);
                        ip0Var2.N.start();
                        frameLayout2.addView(ip0Var2.L, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new gl0(ip0Var2, 10));
                        return;
                }
            }
        });
        this.D.addView(this.C, k7.c6.e(54, 54, 21));
        this.C.setImageDrawable(this.H);
        oo0 oo0Var2 = this.f37907e;
        oo0Var2.getClass();
        oo0Var2.f41002a = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21930s8, oo0Var2.f41003b);
        oo0Var2.a();
        oo0Var2.invalidate();
        this.d = l0Var;
        this.fragmentView = l0Var;
        return l0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.f37908f.f();
                this.h.f();
            } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
                this.f37908f.e();
                this.h.e();
            } else if (i10 == NotificationCenter.starGiftsLoaded) {
                this.f37908f.e();
                this.h.e();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return k7.f6.a(new f(this, 27), org.telegram.ui.ActionBar.k6.f21659d6, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.f22053z6, org.telegram.ui.ActionBar.k6.f21750i6, org.telegram.ui.ActionBar.k6.f21605a7, org.telegram.ui.ActionBar.k6.B6, org.telegram.ui.ActionBar.k6.f21876p7, org.telegram.ui.ActionBar.k6.f21696f6, org.telegram.ui.ActionBar.k6.f21714g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
    }

    @Override
    public final boolean isLightStatusBar() {
        oo0 oo0Var = this.f37907e;
        if (oo0Var == null) {
            return super.isLightStatusBar();
        }
        if (i0.a.f(oo0Var.getColor()) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.f37904a && ((this.f37908f.b() || this.h.b()) && getUserConfig().isPremium())) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        int i10;
        int i11;
        boolean z10 = this.f37904a;
        if (!z10 && ((this.f37908f.b() || this.h.b()) && getUserConfig().isPremium())) {
            if (z4 && getVisibleDialog() == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                if (z10) {
                    i10 = R.string.ChannelColorUnsaved;
                } else {
                    i10 = R.string.UserColorUnsaved;
                }
                alertDialog$Builder.f21166a.O = LocaleController.getString(i10);
                if (z10) {
                    i11 = R.string.ChannelColorUnsavedMessage;
                } else {
                    i11 = R.string.UserColorUnsavedMessage;
                }
                alertDialog$Builder.f21166a.Q = LocaleController.getString(i11);
                alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.c2(this) {
                    public final ip0 f39498b;

                    {
                        this.f39498b = this;
                    }

                    @Override
                    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i12) {
                        switch (r2) {
                            case 0:
                                this.f39498b.finishFragment();
                                return;
                            default:
                                this.f39498b.w0();
                                return;
                        }
                    }
                });
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.c2(this) {
                    public final ip0 f39498b;

                    {
                        this.f39498b = this;
                    }

                    @Override
                    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i12) {
                        switch (r2) {
                            case 0:
                                this.f39498b.finishFragment();
                                return;
                            default:
                                this.f39498b.w0();
                                return;
                        }
                    }
                });
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                showDialog(d2Var);
                ((TextView) d2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21895q7));
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
        this.f37910r = g6Var;
    }

    public final void v0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ip0.v0():void");
    }

    public final void w0() {
        dp0 dp0Var;
        dp0 dp0Var2;
        dp0 dp0Var3;
        mf.b bVar;
        if (this.f37909n) {
            return;
        }
        if (this.f37904a) {
            finishFragment();
        } else if (!getUserConfig().isPremium()) {
            showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) this, 23, true));
            return;
        }
        if (this.f37914y.getCurrentPosition() == 1) {
            dp0Var = this.f37908f;
        } else {
            dp0Var = this.h;
        }
        if (dp0Var.f36288y != null) {
            if (this.f37914y.getCurrentPosition() == 1) {
                dp0Var3 = this.h;
            } else {
                dp0Var3 = this.f37908f;
            }
            dp0Var3.d();
            this.f37909n = true;
            dp0Var.f36280f.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = dp0Var.f36288y;
            org.telegram.ui.Components.xk xkVar = new org.telegram.ui.Components.xk(21, this, dp0Var);
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            if (tL_starGiftUnique.resale_ton_only) {
                bVar = mf.b.f13652b;
            } else {
                bVar = mf.b.f13651a;
            }
            mh.t7.x(this.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new lh.h5(this, bVar, tL_starGiftUnique, clientUserId, xkVar));
            return;
        }
        if (this.f37914y.getCurrentPosition() == 1) {
            dp0Var2 = this.h;
        } else {
            dp0Var2 = this.f37908f;
        }
        if (dp0Var2.f36288y != null) {
            dp0Var2.d();
        }
        v0();
        finishFragment();
        y0();
    }

    public final void y0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ip0.y0():void");
    }

    public final void z0() {
        this.d.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21605a7));
        org.telegram.ui.ActionBar.l5 l5Var = this.F;
        if (l5Var != null) {
            l5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.A8));
        }
        this.f37908f.g();
        this.h.g();
        oo0 oo0Var = this.f37907e;
        if (oo0Var != null) {
            oo0Var.f41002a = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21930s8, oo0Var.f41003b);
            oo0Var.a();
            oo0Var.invalidate();
        }
        setNavigationBarColor(getNavigationBarColor());
    }
}

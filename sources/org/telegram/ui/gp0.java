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
public final class gp0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public ImageView B;
    public ImageView C;
    public FrameLayout D;
    public org.telegram.ui.Components.qz E;
    public org.telegram.ui.ActionBar.k5 F;
    public boolean G;
    public org.telegram.ui.Components.gj0 H;
    public boolean I;
    public boolean J;
    public boolean K;
    public kc L;
    public float M;
    public ValueAnimator N;
    public boolean O;
    public final boolean f34653a;
    public final lh.l7 f34654b;
    public final lh.l7 f34655c;
    public l0 d;
    public mo0 e;
    public bp0 f34656f;
    public bp0 h;
    public boolean f34657n;
    public org.telegram.ui.ActionBar.f6 f34658r;
    public final SparseIntArray f34659s;
    public final org.telegram.ui.ActionBar.g5 v;
    public final org.telegram.ui.ActionBar.g5 f34660w;
    public org.telegram.ui.ActionBar.p2 f34661x;
    public ek f34662y;

    public gp0() {
        super(null);
        this.f34659s = new SparseIntArray();
        boolean q10 = org.telegram.ui.ActionBar.j6.I.q();
        this.G = q10;
        this.O = q10;
        this.f34653a = false;
        lh.t7.y(this.currentAccount, false).V();
        lh.l7 l7Var = new lh.l7(this.currentAccount, 0L, false);
        this.f34654b = l7Var;
        l7Var.f(8, false);
        l7Var.a();
        lh.l7 l7Var2 = new lh.l7(this.currentAccount, 0L, false);
        this.f34655c = l7Var2;
        l7Var2.f(8, false);
        l7Var2.f12767f = true;
        l7Var2.a();
        this.resourceProvider = new h(this, 29);
        this.v = new org.telegram.ui.ActionBar.g5(0, false, false, this.resourceProvider);
        this.f34660w = new org.telegram.ui.ActionBar.g5(0, false, true, this.resourceProvider);
    }

    public static void U(gp0 gp0Var, mf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, org.telegram.ui.Components.vk vkVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        lh.i4 i4Var = new lh.i4(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        boolean[] zArr = new boolean[1];
        lh.k4 k4Var = new lh.k4(gp0Var.getParentActivity(), gp0Var.resourceProvider, tL_starGiftUnique, i4Var, gp0Var.currentAccount, j10, kh.a2.l(tL_starGiftUnique.num, ',', sb), false, new lh.u2(gp0Var, zArr, tL_starGiftUnique, j10, vkVar, 1));
        k4Var.h.setOnDismissListener(new gg.g(9, zArr, vkVar));
        k4Var.b();
    }

    public static void V(gp0 gp0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, org.telegram.ui.Components.vk vkVar, lh.i4 i4Var, af.f fVar) {
        zArr[0] = true;
        fVar.d();
        lh.t7.x(gp0Var.currentAccount, i4Var.f12585a).h(i4Var.f12586b, tL_starGiftUnique, j10, null, true, new dh.v(23, fVar, vkVar));
    }

    public static int h0(gp0 gp0Var) {
        return gp0Var.currentAccount;
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
        return org.telegram.ui.ActionBar.j6.b(0.5f, f10, i10);
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
        this.f34656f = new bp0(this, context, 1);
        this.h = new bp0(this, context, 0);
        this.actionBar.setCastShadows(false);
        this.actionBar.setVisibility(8);
        this.actionBar.setAllowOverlayTitle(false);
        l0 l0Var = new l0(this, context, 15);
        l0Var.setFitsSystemWindows(true);
        this.e = new mo0(this, context, this.resourceProvider);
        this.h.i(false);
        l0Var.addView(this.e, k7.b6.e(-1, -2, 55));
        ek ekVar = new ek(this, context, 1);
        this.f34662y = ekVar;
        ekVar.setAdapter(new no0(this));
        l0Var.addView(this.f34662y, k7.b6.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        this.D = frameLayout;
        l0Var.addView(frameLayout, k7.b6.e(-1, -2, 55));
        boolean z4 = this.f34653a;
        if (!z4) {
            org.telegram.ui.Components.qz qzVar = new org.telegram.ui.Components.qz(context);
            this.E = qzVar;
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
            org.telegram.ui.Components.qz qzVar2 = this.E;
            qzVar2.f28317f = new w3(this, 12);
            this.D.addView(qzVar2, k7.b6.e(-1, 40, 17));
        } else {
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
            this.F = k5Var;
            k5Var.l(LocaleController.getString(R.string.ChannelColorTitle2), false);
            this.F.setEllipsizeByGradient(true);
            this.F.setTextSize(20);
            this.F.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.A8));
            this.F.setTypeface(AndroidUtilities.bold());
            this.D.addView(this.F, k7.b6.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        }
        mo0 mo0Var = this.e;
        if (mo0Var != null) {
            mo0Var.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                AndroidUtilities.setLightStatusBar(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.B = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.B;
        int i12 = org.telegram.ui.ActionBar.j6.f20209u8;
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i12), 1, -1));
        this.B.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.B;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.B.setOnClickListener(new View.OnClickListener(this) {
            public final gp0 f35781b;

            {
                this.f35781b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        gp0 gp0Var = this.f35781b;
                        if (gp0Var.onBackPressed(true)) {
                            gp0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        gp0 gp0Var2 = this.f35781b;
                        FrameLayout frameLayout2 = (FrameLayout) gp0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        gp0Var2.C.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        gp0Var2.C.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        gp0Var2.C.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        kc kcVar = new kc(gp0Var2, gp0Var2.getParentActivity(), canvas, (gp0Var2.C.getMeasuredWidth() / 2.0f) + f10, (gp0Var2.C.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight, paint, createBitmap, paint2, f10, f11, 1);
                        gp0Var2.L = kcVar;
                        kcVar.setOnTouchListener(new oh.d(2));
                        gp0Var2.M = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        gp0Var2.N = ofFloat;
                        ofFloat.addUpdateListener(new lc(gp0Var2, 1));
                        gp0Var2.N.addListener(new org.telegram.ui.Components.f91(gp0Var2, 28));
                        gp0Var2.N.setDuration(400L);
                        gp0Var2.N.setInterpolator(org.telegram.ui.Components.gt.e);
                        gp0Var2.N.start();
                        frameLayout2.addView(gp0Var2.L, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new el0(gp0Var2, 10));
                        return;
                }
            }
        });
        this.D.addView(this.B, k7.b6.e(54, 54, 19));
        int i13 = R.raw.sun;
        org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(i13, "" + R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.H = gj0Var;
        gj0Var.h = true;
        if (!this.G) {
            gj0Var.N(0);
            this.H.K(0);
        } else {
            gj0Var.K(35);
            this.H.N(36);
        }
        this.H.X = true;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J9, false);
        this.H.O(w02, "Sunny");
        this.H.O(w02, "Path 6");
        this.H.O(w02, "Path");
        this.H.O(w02, "Path 5");
        this.H.m();
        ImageView imageView4 = new ImageView(context);
        this.C = imageView4;
        imageView4.setScaleType(scaleType);
        this.C.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i12), 1, -1));
        this.C.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.C.setOnClickListener(new View.OnClickListener(this) {
            public final gp0 f35781b;

            {
                this.f35781b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        gp0 gp0Var = this.f35781b;
                        if (gp0Var.onBackPressed(true)) {
                            gp0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        gp0 gp0Var2 = this.f35781b;
                        FrameLayout frameLayout2 = (FrameLayout) gp0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        gp0Var2.C.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        gp0Var2.C.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        gp0Var2.C.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        kc kcVar = new kc(gp0Var2, gp0Var2.getParentActivity(), canvas, (gp0Var2.C.getMeasuredWidth() / 2.0f) + f10, (gp0Var2.C.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight, paint, createBitmap, paint2, f10, f11, 1);
                        gp0Var2.L = kcVar;
                        kcVar.setOnTouchListener(new oh.d(2));
                        gp0Var2.M = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        gp0Var2.N = ofFloat;
                        ofFloat.addUpdateListener(new lc(gp0Var2, 1));
                        gp0Var2.N.addListener(new org.telegram.ui.Components.f91(gp0Var2, 28));
                        gp0Var2.N.setDuration(400L);
                        gp0Var2.N.setInterpolator(org.telegram.ui.Components.gt.e);
                        gp0Var2.N.start();
                        frameLayout2.addView(gp0Var2.L, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new el0(gp0Var2, 10));
                        return;
                }
            }
        });
        this.D.addView(this.C, k7.b6.e(54, 54, 21));
        this.C.setImageDrawable(this.H);
        mo0 mo0Var2 = this.e;
        mo0Var2.getClass();
        mo0Var2.f37415a = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20176s8, mo0Var2.f37416b);
        mo0Var2.a();
        mo0Var2.invalidate();
        this.d = l0Var;
        this.fragmentView = l0Var;
        return l0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.f34656f.f();
                this.h.f();
            } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
                this.f34656f.e();
                this.h.e();
            } else if (i10 == NotificationCenter.starGiftsLoaded) {
                this.f34656f.e();
                this.h.e();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return k7.e6.a(new f(this, 27), org.telegram.ui.ActionBar.j6.f19906d6, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.f20298z6, org.telegram.ui.ActionBar.j6.f19996i6, org.telegram.ui.ActionBar.j6.f19852a7, org.telegram.ui.ActionBar.j6.B6, org.telegram.ui.ActionBar.j6.f20122p7, org.telegram.ui.ActionBar.j6.f19942f6, org.telegram.ui.ActionBar.j6.f19960g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
    }

    @Override
    public final boolean isLightStatusBar() {
        mo0 mo0Var = this.e;
        if (mo0Var == null) {
            return super.isLightStatusBar();
        }
        if (i0.a.f(mo0Var.getColor()) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.f34653a && ((this.f34656f.b() || this.h.b()) && getUserConfig().isPremium())) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        int i10;
        int i11;
        boolean z10 = this.f34653a;
        if (!z10 && ((this.f34656f.b() || this.h.b()) && getUserConfig().isPremium())) {
            if (z4 && getVisibleDialog() == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                if (z10) {
                    i10 = R.string.ChannelColorUnsaved;
                } else {
                    i10 = R.string.UserColorUnsaved;
                }
                alertDialog$Builder.f19503a.O = LocaleController.getString(i10);
                if (z10) {
                    i11 = R.string.ChannelColorUnsavedMessage;
                } else {
                    i11 = R.string.UserColorUnsavedMessage;
                }
                alertDialog$Builder.f19503a.Q = LocaleController.getString(i11);
                alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.c2(this) {
                    public final gp0 f36118b;

                    {
                        this.f36118b = this;
                    }

                    @Override
                    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i12) {
                        switch (r2) {
                            case 0:
                                this.f36118b.finishFragment();
                                return;
                            default:
                                this.f36118b.w0();
                                return;
                        }
                    }
                });
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.c2(this) {
                    public final gp0 f36118b;

                    {
                        this.f36118b = this;
                    }

                    @Override
                    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i12) {
                        switch (r2) {
                            case 0:
                                this.f36118b.finishFragment();
                                return;
                            default:
                                this.f36118b.w0();
                                return;
                        }
                    }
                });
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                showDialog(d2Var);
                ((TextView) d2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20141q7));
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
        this.f34658r = f6Var;
    }

    public final void v0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gp0.v0():void");
    }

    public final void w0() {
        bp0 bp0Var;
        bp0 bp0Var2;
        bp0 bp0Var3;
        mf.b bVar;
        if (this.f34657n) {
            return;
        }
        if (this.f34653a) {
            finishFragment();
        } else if (!getUserConfig().isPremium()) {
            showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) this, 23, true));
            return;
        }
        if (this.f34662y.getCurrentPosition() == 1) {
            bp0Var = this.f34656f;
        } else {
            bp0Var = this.h;
        }
        if (bp0Var.f33013y != null) {
            if (this.f34662y.getCurrentPosition() == 1) {
                bp0Var3 = this.h;
            } else {
                bp0Var3 = this.f34656f;
            }
            bp0Var3.d();
            this.f34657n = true;
            bp0Var.f33005f.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = bp0Var.f33013y;
            org.telegram.ui.Components.vk vkVar = new org.telegram.ui.Components.vk(21, this, bp0Var);
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            if (tL_starGiftUnique.resale_ton_only) {
                bVar = mf.b.f13931b;
            } else {
                bVar = mf.b.f13930a;
            }
            lh.t7.x(this.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new kh.h5(this, bVar, tL_starGiftUnique, clientUserId, vkVar));
            return;
        }
        if (this.f34662y.getCurrentPosition() == 1) {
            bp0Var2 = this.h;
        } else {
            bp0Var2 = this.f34656f;
        }
        if (bp0Var2.f33013y != null) {
            bp0Var2.d();
        }
        v0();
        finishFragment();
        y0();
    }

    public final void y0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gp0.y0():void");
    }

    public final void z0() {
        this.d.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19852a7));
        org.telegram.ui.ActionBar.k5 k5Var = this.F;
        if (k5Var != null) {
            k5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.A8));
        }
        this.f34656f.g();
        this.h.g();
        mo0 mo0Var = this.e;
        if (mo0Var != null) {
            mo0Var.f37415a = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20176s8, mo0Var.f37416b);
            mo0Var.a();
            mo0Var.invalidate();
        }
        setNavigationBarColor(getNavigationBarColor());
    }
}

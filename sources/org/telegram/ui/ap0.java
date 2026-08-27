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
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class ap0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public ImageView A;
    public ImageView B;
    public FrameLayout C;
    public org.telegram.ui.Components.ez D;
    public org.telegram.ui.ActionBar.h5 E;
    public boolean F;
    public org.telegram.ui.Components.oi0 G;
    public boolean H;
    public boolean I;
    public boolean J;
    public hc K;
    public float L;
    public ValueAnimator M;
    public boolean N;

    public final boolean f36585a;

    public final hh.m7 f36586b;

    public final hh.m7 f36587c;
    public n0 d;

    public go0 f36588e;

    public vo0 f36589f;
    public vo0 h;

    public boolean f36590n;

    public org.telegram.ui.ActionBar.c6 f36591r;

    public final SparseIntArray f36592s;
    public final org.telegram.ui.ActionBar.d5 v;

    public final org.telegram.ui.ActionBar.d5 f36593w;

    public org.telegram.ui.ActionBar.n2 f36594x;

    public lh.h1 f36595y;

    public ap0() {
        super(null);
        this.f36592s = new SparseIntArray();
        boolean zQ = org.telegram.ui.ActionBar.g6.I.q();
        this.F = zQ;
        this.N = zQ;
        this.f36585a = false;
        hh.u7.y(this.currentAccount, false).V();
        hh.m7 m7Var = new hh.m7(this.currentAccount, 0L, false);
        this.f36586b = m7Var;
        m7Var.f(8, false);
        m7Var.a();
        hh.m7 m7Var2 = new hh.m7(this.currentAccount, 0L, false);
        this.f36587c = m7Var2;
        m7Var2.f(8, false);
        m7Var2.f9748f = true;
        m7Var2.a();
        this.resourceProvider = new g(this, 29);
        this.v = new org.telegram.ui.ActionBar.d5(0, false, false, this.resourceProvider);
        this.f36593w = new org.telegram.ui.ActionBar.d5(0, false, true, this.resourceProvider);
    }

    public static void U(ap0 ap0Var, hf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, ib0 ib0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        hh.k4 k4Var = new hh.k4(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        hh.m4 m4Var = new hh.m4(ap0Var.getParentActivity(), ap0Var.resourceProvider, tL_starGiftUnique, k4Var, ap0Var.currentAccount, j10, i0.a.m(tL_starGiftUnique.num, ',', sb2), false, new hh.v2(ap0Var, zArr, tL_starGiftUnique, j10, ib0Var, 1));
        m4Var.h.setOnDismissListener(new cg.g(11, zArr, ib0Var));
        m4Var.b();
    }

    public static void V(ap0 ap0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, ib0 ib0Var, hh.k4 k4Var, we.d dVar) {
        zArr[0] = true;
        dVar.d();
        hh.u7.x(ap0Var.currentAccount, k4Var.f9578a).h(k4Var.f9579b, tL_starGiftUnique, j10, null, true, new cg.u0(24, dVar, ib0Var));
    }

    public static int u0(int i10) {
        return org.telegram.ui.ActionBar.g6.b(0.5f, (AndroidUtilities.computePerceivedBrightness(i10) > 0.2f ? 1 : (AndroidUtilities.computePerceivedBrightness(i10) == 0.2f ? 0 : -1)) < 0 ? 0.28f : -0.28f, i10);
    }

    public static boolean x0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        return (tL_emojiStatusCollectible != null) == z10 && tL_emojiStatusCollectible != null && z10 && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_emojiStatusCollectible.collectible_id;
    }

    @Override
    public final View createView(Context context) {
        final int i10 = 1;
        this.f36589f = new vo0(this, context, 1);
        final int i11 = 0;
        this.h = new vo0(this, context, 0);
        this.actionBar.setCastShadows(false);
        this.actionBar.setVisibility(8);
        this.actionBar.setAllowOverlayTitle(false);
        n0 n0Var = new n0(this, context, 15);
        n0Var.setFitsSystemWindows(true);
        this.f36588e = new go0(this, context, this.resourceProvider);
        this.h.i(false);
        n0Var.addView(this.f36588e, h7.z5.e(-1, -2, 55));
        lh.h1 h1Var = new lh.h1(this, context, 4);
        this.f36595y = h1Var;
        h1Var.setAdapter(new ho0(this));
        n0Var.addView(this.f36595y, h7.z5.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        this.C = frameLayout;
        n0Var.addView(frameLayout, h7.z5.e(-1, -2, 55));
        boolean z10 = this.f36585a;
        if (z10) {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
            this.E = h5Var;
            h5Var.l(LocaleController.getString(R.string.ChannelColorTitle2), false);
            this.E.setEllipsizeByGradient(true);
            this.E.setTextSize(20);
            this.E.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.A8));
            this.E.setTypeface(AndroidUtilities.bold());
            this.C.addView(this.E, h7.z5.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        } else {
            org.telegram.ui.Components.ez ezVar = new org.telegram.ui.Components.ez(context);
            this.D = ezVar;
            ezVar.setTabs(LocaleController.getString(z10 ? R.string.ChannelColorTabProfile : R.string.UserColorTabProfile), LocaleController.getString(z10 ? R.string.ChannelColorTabName : R.string.UserColorTabName));
            org.telegram.ui.Components.ez ezVar2 = this.D;
            ezVar2.f28203f = new x3(this, 12);
            this.C.addView(ezVar2, h7.z5.e(-1, 40, 17));
        }
        go0 go0Var = this.f36588e;
        if (go0Var != null) {
            go0Var.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                AndroidUtilities.setLightStatusBar(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.A = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.A;
        int i12 = org.telegram.ui.ActionBar.g6.f23359u8;
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i12), 1, -1));
        this.A.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.A;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.A.setOnClickListener(new View.OnClickListener(this) {

            public final ap0 f37801b;

            {
                this.f37801b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ap0 ap0Var = this.f37801b;
                        if (ap0Var.onBackPressed(true)) {
                            ap0Var.finishFragment();
                        }
                        break;
                    default:
                        ap0 ap0Var2 = this.f37801b;
                        FrameLayout frameLayout2 = (FrameLayout) ap0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        ap0Var2.B.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        ap0Var2.B.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        ap0Var2.B.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float measuredWidth = (ap0Var2.B.getMeasuredWidth() / 2.0f) + f10;
                        float measuredHeight = (ap0Var2.B.getMeasuredHeight() / 2.0f) + f11;
                        float fMax = Math.max(bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
                        hc hcVar = new hc(ap0Var2, ap0Var2.getParentActivity(), canvas, measuredWidth, measuredHeight, fMax, paint, bitmapCreateBitmap, paint2, f10, f11, 1);
                        ap0Var2.K = hcVar;
                        hcVar.setOnTouchListener(new kh.e(2));
                        ap0Var2.L = 0.0f;
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ap0Var2.M = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.addUpdateListener(new lh.cb(ap0Var2, 2));
                        ap0Var2.M.addListener(new f50(ap0Var2, 7));
                        ap0Var2.M.setDuration(400L);
                        ap0Var2.M.setInterpolator(org.telegram.ui.Components.ws.f34319e);
                        ap0Var2.M.start();
                        frameLayout2.addView(ap0Var2.K, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new zk0(ap0Var2, 10));
                        break;
                }
            }
        });
        this.C.addView(this.A, h7.z5.e(54, 54, 19));
        org.telegram.ui.Components.oi0 oi0Var = new org.telegram.ui.Components.oi0(R.raw.sun, "" + R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.G = oi0Var;
        oi0Var.h = true;
        if (this.F) {
            oi0Var.K(35);
            this.G.N(36);
        } else {
            oi0Var.N(0);
            this.G.K(0);
        }
        this.G.W = true;
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J9, false);
        this.G.O(iW0, "Sunny");
        this.G.O(iW0, "Path 6");
        this.G.O(iW0, "Path");
        this.G.O(iW0, "Path 5");
        this.G.m();
        ImageView imageView4 = new ImageView(context);
        this.B = imageView4;
        imageView4.setScaleType(scaleType);
        this.B.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i12), 1, -1));
        this.B.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.B.setOnClickListener(new View.OnClickListener(this) {

            public final ap0 f37801b;

            {
                this.f37801b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ap0 ap0Var = this.f37801b;
                        if (ap0Var.onBackPressed(true)) {
                            ap0Var.finishFragment();
                        }
                        break;
                    default:
                        ap0 ap0Var2 = this.f37801b;
                        FrameLayout frameLayout2 = (FrameLayout) ap0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        ap0Var2.B.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        ap0Var2.B.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        ap0Var2.B.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float measuredWidth = (ap0Var2.B.getMeasuredWidth() / 2.0f) + f10;
                        float measuredHeight = (ap0Var2.B.getMeasuredHeight() / 2.0f) + f11;
                        float fMax = Math.max(bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
                        hc hcVar = new hc(ap0Var2, ap0Var2.getParentActivity(), canvas, measuredWidth, measuredHeight, fMax, paint, bitmapCreateBitmap, paint2, f10, f11, 1);
                        ap0Var2.K = hcVar;
                        hcVar.setOnTouchListener(new kh.e(2));
                        ap0Var2.L = 0.0f;
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ap0Var2.M = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.addUpdateListener(new lh.cb(ap0Var2, 2));
                        ap0Var2.M.addListener(new f50(ap0Var2, 7));
                        ap0Var2.M.setDuration(400L);
                        ap0Var2.M.setInterpolator(org.telegram.ui.Components.ws.f34319e);
                        ap0Var2.M.start();
                        frameLayout2.addView(ap0Var2.K, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new zk0(ap0Var2, 10));
                        break;
                }
            }
        });
        this.C.addView(this.B, h7.z5.e(54, 54, 21));
        this.B.setImageDrawable(this.G);
        go0 go0Var2 = this.f36588e;
        go0Var2.getClass();
        go0Var2.f39439a = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23322s8, go0Var2.f39440b);
        go0Var2.a();
        go0Var2.invalidate();
        this.d = n0Var;
        this.fragmentView = n0Var;
        return n0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 != this.currentAccount) {
            return;
        }
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            this.f36589f.f();
            this.h.f();
        } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
            this.f36589f.e();
            this.h.e();
        } else if (i10 == NotificationCenter.starGiftsLoaded) {
            this.f36589f.e();
            this.h.e();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return h7.c6.a(new e(this, 27), org.telegram.ui.ActionBar.g6.f23053d6, org.telegram.ui.ActionBar.g6.G6, org.telegram.ui.ActionBar.g6.f23441z6, org.telegram.ui.ActionBar.g6.f23144i6, org.telegram.ui.ActionBar.g6.f22999a7, org.telegram.ui.ActionBar.g6.B6, org.telegram.ui.ActionBar.g6.f23269p7, org.telegram.ui.ActionBar.g6.f23090f6, org.telegram.ui.ActionBar.g6.f23108g6, org.telegram.ui.ActionBar.g6.O6, org.telegram.ui.ActionBar.g6.P6, org.telegram.ui.ActionBar.g6.Q6, org.telegram.ui.ActionBar.g6.R6);
    }

    @Override
    public final boolean isLightStatusBar() {
        go0 go0Var = this.f36588e;
        if (go0Var == null) {
            return super.isLightStatusBar();
        }
        return i0.b.f(go0Var.getColor()) > 0.699999988079071d;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.f36585a || !((this.f36589f.b() || this.h.b()) && getUserConfig().isPremium())) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.f36585a;
        if (z11 || !((this.f36589f.b() || this.h.b()) && getUserConfig().isPremium())) {
            return super.onBackPressed(z10);
        }
        if (z10 && getVisibleDialog() == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            alertDialog$Builder.f22702a.N = LocaleController.getString(z11 ? R.string.ChannelColorUnsaved : R.string.UserColorUnsaved);
            alertDialog$Builder.f22702a.P = LocaleController.getString(z11 ? R.string.ChannelColorUnsavedMessage : R.string.UserColorUnsavedMessage);
            final int i10 = 0;
            alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.a2(this) {

                public final ap0 f38177b;

                {
                    this.f38177b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (i10) {
                        case 0:
                            this.f38177b.finishFragment();
                            break;
                        default:
                            this.f38177b.w0();
                            break;
                    }
                }
            });
            final int i11 = 1;
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.a2(this) {

                public final ap0 f38177b;

                {
                    this.f38177b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i12) {
                    switch (i11) {
                        case 0:
                            this.f38177b.finishFragment();
                            break;
                        default:
                            this.f38177b.w0();
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            showDialog(b2Var);
            ((TextView) b2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23284q7));
        }
        return false;
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
        setBulletinDelegate(new cg.w(15));
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
        this.f36591r = c6Var;
    }

    public final void v0() {
        TL_account.updateColor updatecolor;
        TLRPC.TL_peerColor tL_peerColor;
        TLRPC.PeerColor peerColor;
        int i10;
        int i11;
        long j10;
        TL_account.updateColor updatecolor2;
        int i12;
        if (this.J) {
            return;
        }
        boolean z10 = this.f36585a;
        if (z10 || getUserConfig().isPremium()) {
            if (z10) {
                finishFragment();
            } else {
                TLRPC.User currentUser = getUserConfig().getCurrentUser();
                if (currentUser.color == null) {
                    TLRPC.TL_peerColor tL_peerColor2 = new TLRPC.TL_peerColor();
                    currentUser.color = tL_peerColor2;
                    tL_peerColor2.flags |= 1;
                    tL_peerColor2.color = (int) (currentUser.f22527id % 7);
                }
                TL_stars.TL_starGiftUnique tL_starGiftUnique = null;
                if (this.f36589f.f43506n == UserObject.getColorId(currentUser) && this.f36589f.f43507r == UserObject.getEmojiId(currentUser)) {
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.f36589f.v;
                    long j11 = tL_peerColorCollectible == null ? 0L : tL_peerColorCollectible.collectible_id;
                    TLRPC.PeerColor peerColor2 = currentUser.color;
                    if (j11 != (peerColor2 instanceof TLRPC.TL_peerColorCollectible ? peerColor2.collectible_id : 0L)) {
                        this.H = true;
                        updatecolor = new TL_account.updateColor();
                        currentUser.flags2 |= 256;
                        currentUser.color.flags |= 1;
                        if (this.f36589f.v != null) {
                            updatecolor.flags |= 4;
                            TLRPC.TL_inputPeerColorCollectible tL_inputPeerColorCollectible = new TLRPC.TL_inputPeerColorCollectible();
                            updatecolor.color = tL_inputPeerColorCollectible;
                            TLRPC.TL_peerColorCollectible tL_peerColorCollectible2 = this.f36589f.v;
                            tL_inputPeerColorCollectible.collectible_id = tL_peerColorCollectible2.collectible_id;
                            currentUser.color = tL_peerColorCollectible2;
                        } else {
                            updatecolor.flags |= 4;
                            tL_peerColor = new TLRPC.TL_peerColor();
                            updatecolor.color = tL_peerColor;
                            tL_peerColor.flags |= 1;
                            vo0 vo0Var = this.f36589f;
                            int i13 = vo0Var.f43506n;
                            tL_peerColor.color = i13;
                            peerColor = currentUser.color;
                            i10 = peerColor.flags;
                            i11 = i10 | 1;
                            peerColor.flags = i11;
                            peerColor.color = i13;
                            j10 = vo0Var.f43507r;
                            if (j10 != 0) {
                                updatecolor.flags |= 1;
                                peerColor.flags = i10 | 3;
                                tL_peerColor.flags |= 2;
                                peerColor.background_emoji_id = j10;
                                tL_peerColor.background_emoji_id = j10;
                            } else {
                                peerColor.flags = i11 & (-3);
                                peerColor.background_emoji_id = 0L;
                            }
                        }
                        getConnectionsManager().sendRequest(updatecolor, null);
                    }
                } else {
                    this.H = true;
                    updatecolor = new TL_account.updateColor();
                    currentUser.flags2 |= 256;
                    currentUser.color.flags |= 1;
                    if (this.f36589f.v != null) {
                        updatecolor.flags |= 4;
                        TLRPC.TL_inputPeerColorCollectible tL_inputPeerColorCollectible2 = new TLRPC.TL_inputPeerColorCollectible();
                        updatecolor.color = tL_inputPeerColorCollectible2;
                        TLRPC.TL_peerColorCollectible tL_peerColorCollectible3 = this.f36589f.v;
                        tL_inputPeerColorCollectible2.collectible_id = tL_peerColorCollectible3.collectible_id;
                        currentUser.color = tL_peerColorCollectible3;
                    } else {
                        updatecolor.flags |= 4;
                        tL_peerColor = new TLRPC.TL_peerColor();
                        updatecolor.color = tL_peerColor;
                        tL_peerColor.flags |= 1;
                        vo0 vo0Var2 = this.f36589f;
                        int i14 = vo0Var2.f43506n;
                        tL_peerColor.color = i14;
                        peerColor = currentUser.color;
                        i10 = peerColor.flags;
                        i11 = i10 | 1;
                        peerColor.flags = i11;
                        peerColor.color = i14;
                        j10 = vo0Var2.f43507r;
                        if (j10 != 0) {
                            updatecolor.flags |= 1;
                            peerColor.flags = i10 | 3;
                            tL_peerColor.flags |= 2;
                            peerColor.background_emoji_id = j10;
                            tL_peerColor.background_emoji_id = j10;
                        } else {
                            peerColor.flags = i11 & (-3);
                            peerColor.background_emoji_id = 0L;
                        }
                    }
                    getConnectionsManager().sendRequest(updatecolor, null);
                }
                if (this.h.f43506n == UserObject.getProfileColorId(currentUser) && this.h.f43507r == UserObject.getOnlyProfileEmojiId(currentUser)) {
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.h.f43508s;
                    if ((tL_emojiStatusCollectible == null ? 0L : tL_emojiStatusCollectible.collectible_id) != UserObject.getProfileCollectibleId(currentUser)) {
                        this.I = true;
                        if (currentUser.profile_color == null) {
                            currentUser.profile_color = new TLRPC.TL_peerColor();
                        }
                        updatecolor2 = new TL_account.updateColor();
                        updatecolor2.for_profile = true;
                        currentUser.flags2 |= 512;
                        if (this.h.f43506n < 0) {
                            currentUser.profile_color.flags &= -2;
                        } else {
                            if (updatecolor2.color == null) {
                                updatecolor2.flags |= 4;
                                updatecolor2.color = new TLRPC.TL_peerColor();
                            }
                            TLRPC.PeerColor peerColor3 = updatecolor2.color;
                            peerColor3.flags |= 1;
                            int i15 = this.h.f43506n;
                            peerColor3.color = i15;
                            TLRPC.PeerColor peerColor4 = currentUser.profile_color;
                            peerColor4.flags |= 1;
                            peerColor4.color = i15;
                        }
                        if (this.h.f43507r != 0) {
                            i12 = updatecolor2.flags;
                            updatecolor2.flags = i12 | 1;
                            currentUser.profile_color.flags |= 2;
                            if (updatecolor2.color == null) {
                                updatecolor2.flags = i12 | 5;
                                updatecolor2.color = new TLRPC.TL_peerColor();
                            }
                            TLRPC.PeerColor peerColor5 = updatecolor2.color;
                            peerColor5.flags |= 2;
                            TLRPC.PeerColor peerColor6 = currentUser.profile_color;
                            long j12 = this.h.f43507r;
                            peerColor6.background_emoji_id = j12;
                            peerColor5.background_emoji_id = j12;
                        } else {
                            TLRPC.PeerColor peerColor7 = currentUser.profile_color;
                            peerColor7.flags &= -3;
                            peerColor7.background_emoji_id = 0L;
                        }
                        getConnectionsManager().sendRequest(updatecolor2, null);
                    }
                } else {
                    this.I = true;
                    if (currentUser.profile_color == null) {
                        currentUser.profile_color = new TLRPC.TL_peerColor();
                    }
                    updatecolor2 = new TL_account.updateColor();
                    updatecolor2.for_profile = true;
                    currentUser.flags2 |= 512;
                    if (this.h.f43506n < 0) {
                        currentUser.profile_color.flags &= -2;
                    } else {
                        if (updatecolor2.color == null) {
                            updatecolor2.flags |= 4;
                            updatecolor2.color = new TLRPC.TL_peerColor();
                        }
                        TLRPC.PeerColor peerColor8 = updatecolor2.color;
                        peerColor8.flags |= 1;
                        int i16 = this.h.f43506n;
                        peerColor8.color = i16;
                        TLRPC.PeerColor peerColor9 = currentUser.profile_color;
                        peerColor9.flags |= 1;
                        peerColor9.color = i16;
                    }
                    if (this.h.f43507r != 0) {
                        i12 = updatecolor2.flags;
                        updatecolor2.flags = i12 | 1;
                        currentUser.profile_color.flags |= 2;
                        if (updatecolor2.color == null) {
                            updatecolor2.flags = i12 | 5;
                            updatecolor2.color = new TLRPC.TL_peerColor();
                        }
                        TLRPC.PeerColor peerColor10 = updatecolor2.color;
                        peerColor10.flags |= 2;
                        TLRPC.PeerColor peerColor11 = currentUser.profile_color;
                        long j13 = this.h.f43507r;
                        peerColor11.background_emoji_id = j13;
                        peerColor10.background_emoji_id = j13;
                    } else {
                        TLRPC.PeerColor peerColor12 = currentUser.profile_color;
                        peerColor12.flags &= -3;
                        peerColor12.background_emoji_id = 0L;
                    }
                    getConnectionsManager().sendRequest(updatecolor2, null);
                }
                if (!x0(currentUser.emoji_status, this.h.f43508s) && (this.h.f43508s != null || DialogObject.isEmojiStatusCollectible(currentUser.emoji_status))) {
                    ?? tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.h.f43508s;
                    if (tL_emojiStatusCollectible2 != null) {
                        long j14 = tL_emojiStatusCollectible2.collectible_id;
                        for (int i17 = 0; i17 < this.h.f43498b0.size(); i17++) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.h.f43498b0.get(i17);
                            if (tL_starGiftUnique2.f22607id == j14) {
                                tL_starGiftUnique = tL_starGiftUnique2;
                                break;
                            }
                        }
                    }
                    if (tL_starGiftUnique != null) {
                        tL_emojiStatusEmpty = new TLRPC.TL_inputEmojiStatusCollectible();
                        tL_emojiStatusEmpty.collectible_id = tL_starGiftUnique.f22607id;
                    }
                    getMessagesController().updateEmojiStatus(0L, tL_emojiStatusEmpty, tL_starGiftUnique);
                }
                getMessagesController().putUser(currentUser, false);
                getUserConfig().saveConfig(true);
                finishFragment();
                y0();
            }
            this.J = true;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_EMOJI_STATUS));
        }
    }

    public final void w0() {
        if (this.f36590n) {
            return;
        }
        if (this.f36585a) {
            finishFragment();
        } else if (!getUserConfig().isPremium()) {
            showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) this, 23, true));
            return;
        }
        vo0 vo0Var = this.f36595y.getCurrentPosition() == 1 ? this.f36589f : this.h;
        if (vo0Var.f43511y == null) {
            vo0 vo0Var2 = this.f36595y.getCurrentPosition() == 1 ? this.h : this.f36589f;
            if (vo0Var2.f43511y != null) {
                vo0Var2.d();
            }
            v0();
            finishFragment();
            y0();
            return;
        }
        (this.f36595y.getCurrentPosition() == 1 ? this.h : this.f36589f).d();
        this.f36590n = true;
        vo0Var.f43504f.setLoading(true);
        TL_stars.TL_starGiftUnique tL_starGiftUnique = vo0Var.f43511y;
        ib0 ib0Var = new ib0(6, this, vo0Var);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        hf.b bVar = tL_starGiftUnique.resale_ton_only ? hf.b.f8922b : hf.b.f8921a;
        hh.u7.x(this.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new gh.o5(this, bVar, tL_starGiftUnique, clientUserId, ib0Var));
    }

    public final void y0() {
        vo0 vo0Var;
        int i10;
        int i11;
        int i12;
        boolean zIsTextColorEmoji;
        org.telegram.ui.Components.ri0 ri0Var;
        vo0 vo0Var2;
        ArrayList<Integer> arrayList;
        wo0 wo0Var;
        if (this.f36594x != null) {
            boolean z10 = this.H;
            boolean z11 = this.f36585a;
            if (z10) {
                if (this.I) {
                    if ((this.f36595y.getCurrentPosition() == 0 ? this.h : this.f36589f) != this.f36589f) {
                        if (this.I) {
                            if (this.H) {
                                if (this.f36595y.getCurrentPosition() == 0) {
                                    vo0Var2 = this.h;
                                } else {
                                    vo0Var2 = this.f36589f;
                                }
                                if (vo0Var2 == this.h) {
                                    vo0Var = this.h;
                                    if (vo0Var.f43506n < 0) {
                                        org.telegram.ui.Components.mc mcVarA0 = org.telegram.ui.Components.mc.a0(this.f36594x);
                                        wo0 wo0VarC = wo0.c(this.currentAccount, this.h.f43506n);
                                        if (z11) {
                                            i10 = R.string.ChannelProfileColorApplied;
                                        } else {
                                            i10 = R.string.UserProfileColorApplied;
                                        }
                                        mcVarA0.L(wo0VarC, LocaleController.getString(i10)).j();
                                    } else if (vo0Var.f43507r != 0) {
                                        org.telegram.ui.Components.mc mcVarA1 = org.telegram.ui.Components.mc.a0(this.f36594x);
                                        TLRPC.Document documentF = org.telegram.ui.Components.k5.f(this.currentAccount, this.h.f43507r);
                                        if (z11) {
                                            i12 = R.string.ChannelProfileColorEmojiApplied;
                                        } else {
                                            i12 = R.string.UserProfileColorEmojiApplied;
                                        }
                                        String string = LocaleController.getString(i12);
                                        mcVarA1.getClass();
                                        org.telegram.ui.Components.mb mbVar = new org.telegram.ui.Components.mb(mcVarA1.W(), mcVarA1.f30645c);
                                        zIsTextColorEmoji = MessageObject.isTextColorEmoji(documentF);
                                        ri0Var = mbVar.f30638a;
                                        if (zIsTextColorEmoji) {
                                            ri0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Hi, false), PorterDuff.Mode.SRC_IN));
                                        }
                                        mbVar.e(documentF, new String[0]);
                                        ri0Var.i();
                                        mbVar.f30639b.setText(string);
                                        mbVar.f30639b.setTextSize(1, 14.0f);
                                        mbVar.f30639b.setSingleLine(false);
                                        mbVar.f30639b.setMaxLines(3);
                                        mcVarA1.b(mbVar, 2750).j();
                                    } else {
                                        org.telegram.ui.Components.mc mcVarA2 = org.telegram.ui.Components.mc.a0(this.f36594x);
                                        int i13 = R.raw.contact_check;
                                        if (z11) {
                                            i11 = R.string.ChannelProfileColorResetApplied;
                                        } else {
                                            i11 = R.string.UserProfileColorResetApplied;
                                        }
                                        org.telegram.messenger.y1.q(i11, mcVarA2, i13, 36);
                                    }
                                }
                            } else {
                                vo0Var = this.h;
                                if (vo0Var.f43506n < 0) {
                                    org.telegram.ui.Components.mc mcVarA3 = org.telegram.ui.Components.mc.a0(this.f36594x);
                                    wo0 wo0VarC2 = wo0.c(this.currentAccount, this.h.f43506n);
                                    if (z11) {
                                        i10 = R.string.ChannelProfileColorApplied;
                                    } else {
                                        i10 = R.string.UserProfileColorApplied;
                                    }
                                    mcVarA3.L(wo0VarC2, LocaleController.getString(i10)).j();
                                } else if (vo0Var.f43507r != 0) {
                                    org.telegram.ui.Components.mc mcVarA4 = org.telegram.ui.Components.mc.a0(this.f36594x);
                                    TLRPC.Document documentF2 = org.telegram.ui.Components.k5.f(this.currentAccount, this.h.f43507r);
                                    if (z11) {
                                        i12 = R.string.ChannelProfileColorEmojiApplied;
                                    } else {
                                        i12 = R.string.UserProfileColorEmojiApplied;
                                    }
                                    String string2 = LocaleController.getString(i12);
                                    mcVarA4.getClass();
                                    org.telegram.ui.Components.mb mbVar2 = new org.telegram.ui.Components.mb(mcVarA4.W(), mcVarA4.f30645c);
                                    zIsTextColorEmoji = MessageObject.isTextColorEmoji(documentF2);
                                    ri0Var = mbVar2.f30638a;
                                    if (zIsTextColorEmoji) {
                                        ri0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Hi, false), PorterDuff.Mode.SRC_IN));
                                    }
                                    mbVar2.e(documentF2, new String[0]);
                                    ri0Var.i();
                                    mbVar2.f30639b.setText(string2);
                                    mbVar2.f30639b.setTextSize(1, 14.0f);
                                    mbVar2.f30639b.setSingleLine(false);
                                    mbVar2.f30639b.setMaxLines(3);
                                    mcVarA4.b(mbVar2, 2750).j();
                                } else {
                                    org.telegram.ui.Components.mc mcVarA5 = org.telegram.ui.Components.mc.a0(this.f36594x);
                                    int i14 = R.raw.contact_check;
                                    if (z11) {
                                        i11 = R.string.ChannelProfileColorResetApplied;
                                    } else {
                                        i11 = R.string.UserProfileColorResetApplied;
                                    }
                                    org.telegram.messenger.y1.q(i11, mcVarA5, i14, 36);
                                }
                            }
                        }
                    }
                }
                vo0 vo0Var3 = this.f36589f;
                if (vo0Var3.f43506n >= 0) {
                    org.telegram.ui.Components.mc.a0(this.f36594x).L(wo0.a(this.currentAccount, this.f36589f.f43506n), LocaleController.getString(z11 ? R.string.ChannelColorApplied : R.string.UserColorApplied)).j();
                } else {
                    if (vo0Var3.v == null) {
                        return;
                    }
                    org.telegram.ui.Components.mc mcVarA6 = org.telegram.ui.Components.mc.a0(this.f36594x);
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.f36589f.v;
                    int i15 = wo0.f44155j;
                    if (!org.telegram.ui.ActionBar.g6.I.q() || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                        arrayList = tL_peerColorCollectible.colors;
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        wo0Var = null;
                    } else {
                        int iIntValue = arrayList.get(0).intValue() | (-16777216);
                        wo0Var = new wo0(tL_peerColorCollectible.gift_emoji_id, iIntValue, arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : iIntValue, arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : iIntValue);
                    }
                    mcVarA6.L(wo0Var, LocaleController.getString(z11 ? R.string.ChannelColorApplied : R.string.UserColorApplied)).j();
                }
            } else if (this.I) {
                if (this.H) {
                    vo0Var = this.h;
                    if (vo0Var.f43506n < 0) {
                        org.telegram.ui.Components.mc mcVarA7 = org.telegram.ui.Components.mc.a0(this.f36594x);
                        wo0 wo0VarC3 = wo0.c(this.currentAccount, this.h.f43506n);
                        if (z11) {
                            i10 = R.string.ChannelProfileColorApplied;
                        } else {
                            i10 = R.string.UserProfileColorApplied;
                        }
                        mcVarA7.L(wo0VarC3, LocaleController.getString(i10)).j();
                    } else if (vo0Var.f43507r != 0) {
                        org.telegram.ui.Components.mc mcVarA8 = org.telegram.ui.Components.mc.a0(this.f36594x);
                        TLRPC.Document documentF3 = org.telegram.ui.Components.k5.f(this.currentAccount, this.h.f43507r);
                        if (z11) {
                            i12 = R.string.ChannelProfileColorEmojiApplied;
                        } else {
                            i12 = R.string.UserProfileColorEmojiApplied;
                        }
                        String string3 = LocaleController.getString(i12);
                        mcVarA8.getClass();
                        org.telegram.ui.Components.mb mbVar3 = new org.telegram.ui.Components.mb(mcVarA8.W(), mcVarA8.f30645c);
                        zIsTextColorEmoji = MessageObject.isTextColorEmoji(documentF3);
                        ri0Var = mbVar3.f30638a;
                        if (zIsTextColorEmoji) {
                            ri0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Hi, false), PorterDuff.Mode.SRC_IN));
                        }
                        mbVar3.e(documentF3, new String[0]);
                        ri0Var.i();
                        mbVar3.f30639b.setText(string3);
                        mbVar3.f30639b.setTextSize(1, 14.0f);
                        mbVar3.f30639b.setSingleLine(false);
                        mbVar3.f30639b.setMaxLines(3);
                        mcVarA8.b(mbVar3, 2750).j();
                    } else {
                        org.telegram.ui.Components.mc mcVarA9 = org.telegram.ui.Components.mc.a0(this.f36594x);
                        int i16 = R.raw.contact_check;
                        if (z11) {
                            i11 = R.string.ChannelProfileColorResetApplied;
                        } else {
                            i11 = R.string.UserProfileColorResetApplied;
                        }
                        org.telegram.messenger.y1.q(i11, mcVarA9, i16, 36);
                    }
                } else {
                    if (this.f36595y.getCurrentPosition() == 0) {
                        vo0Var2 = this.h;
                    } else {
                        vo0Var2 = this.f36589f;
                    }
                    if (vo0Var2 == this.h) {
                        vo0Var = this.h;
                        if (vo0Var.f43506n < 0) {
                            org.telegram.ui.Components.mc mcVarA10 = org.telegram.ui.Components.mc.a0(this.f36594x);
                            wo0 wo0VarC4 = wo0.c(this.currentAccount, this.h.f43506n);
                            if (z11) {
                                i10 = R.string.ChannelProfileColorApplied;
                            } else {
                                i10 = R.string.UserProfileColorApplied;
                            }
                            mcVarA10.L(wo0VarC4, LocaleController.getString(i10)).j();
                        } else if (vo0Var.f43507r != 0) {
                            org.telegram.ui.Components.mc mcVarA11 = org.telegram.ui.Components.mc.a0(this.f36594x);
                            TLRPC.Document documentF4 = org.telegram.ui.Components.k5.f(this.currentAccount, this.h.f43507r);
                            if (z11) {
                                i12 = R.string.ChannelProfileColorEmojiApplied;
                            } else {
                                i12 = R.string.UserProfileColorEmojiApplied;
                            }
                            String string4 = LocaleController.getString(i12);
                            mcVarA11.getClass();
                            org.telegram.ui.Components.mb mbVar4 = new org.telegram.ui.Components.mb(mcVarA11.W(), mcVarA11.f30645c);
                            zIsTextColorEmoji = MessageObject.isTextColorEmoji(documentF4);
                            ri0Var = mbVar4.f30638a;
                            if (zIsTextColorEmoji) {
                                ri0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Hi, false), PorterDuff.Mode.SRC_IN));
                            }
                            mbVar4.e(documentF4, new String[0]);
                            ri0Var.i();
                            mbVar4.f30639b.setText(string4);
                            mbVar4.f30639b.setTextSize(1, 14.0f);
                            mbVar4.f30639b.setSingleLine(false);
                            mbVar4.f30639b.setMaxLines(3);
                            mcVarA11.b(mbVar4, 2750).j();
                        } else {
                            org.telegram.ui.Components.mc mcVarA12 = org.telegram.ui.Components.mc.a0(this.f36594x);
                            int i17 = R.raw.contact_check;
                            if (z11) {
                                i11 = R.string.ChannelProfileColorResetApplied;
                            } else {
                                i11 = R.string.UserProfileColorResetApplied;
                            }
                            org.telegram.messenger.y1.q(i11, mcVarA12, i17, 36);
                        }
                    }
                }
            }
            this.f36594x = null;
        }
    }

    public final void z0() {
        this.d.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f22999a7));
        org.telegram.ui.ActionBar.h5 h5Var = this.E;
        if (h5Var != null) {
            h5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.A8));
        }
        this.f36589f.g();
        this.h.g();
        go0 go0Var = this.f36588e;
        if (go0Var != null) {
            go0Var.f39439a = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23322s8, go0Var.f39440b);
            go0Var.a();
            go0Var.invalidate();
        }
        setNavigationBarColor(getNavigationBarColor());
    }
}

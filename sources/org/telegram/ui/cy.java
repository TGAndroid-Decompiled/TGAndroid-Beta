package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.util.SparseArray;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.UndoView;
public class cy extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate, og.b, oe.d, og0 {
    public static float B4;
    public static boolean f38562y4;
    public boolean A0;
    public FrameLayout A1;
    public boolean A2;
    public boolean A3;
    public int B0;
    public jw B1;
    public boolean B2;
    public boolean B3;
    public jx C0;
    public li.w1 C1;
    public ux C2;
    public Long C3;
    public org.telegram.ui.Components.sv0 D0;
    public org.telegram.ui.ActionBar.w0 D1;
    public ArrayList D2;
    public Drawable D3;
    public boolean E;
    public qw E0;
    public final TextPaint E1;
    public String E2;
    public org.telegram.ui.Components.r5 E3;
    public boolean F;
    public org.telegram.ui.Components.us F0;
    public hw F1;
    public CharSequence F2;
    public org.telegram.ui.Cells.o F3;
    public TLRPC.RequestPeerType G;
    public boolean G0;
    public FrameLayout G1;
    public org.telegram.ui.Components.qr0 G2;
    public tw G3;
    public long H;
    public float H0;
    public hw H1;
    public org.telegram.ui.Components.c71 H2;
    public final iw H3;
    public ValueAnimator I;
    public float I0;
    public FrameLayout I1;
    public final ArrayList I2;
    public final iw I3;
    public ValueAnimator J;
    public float J0;
    public org.telegram.ui.Components.ws J1;
    public boolean J2;
    public mg0 J3;
    public boolean K;
    public bi.cc K0;
    public org.telegram.ui.Components.vs K1;
    public int K2;
    public NotificationCenter.ObserversGroup K3;
    public boolean L;
    public org.telegram.ui.Components.k80 L0;
    public org.telegram.ui.Cells.m L1;
    public int L2;
    public Drawable L3;
    public boolean M;
    public vw M0;
    public org.telegram.ui.Cells.x2 M1;
    public boolean M2;
    public int M3;
    public float N;
    public boolean N0;
    public org.telegram.ui.Cells.xa N1;
    public int N2;
    public boolean N3;
    public boolean O;
    public boolean O0;
    public Long O1;
    public int O2;
    public boolean O3;
    public int P;
    public long P0;
    public Long P1;
    public int P2;
    public AnimatorSet P3;
    public boolean Q;
    public long Q0;
    public ji.j Q1;
    public int Q2;
    public boolean Q3;
    public boolean R;
    public int R0;
    public ArrayList R1;
    public int R2;
    public nu R3;
    public org.telegram.ui.Components.qc S;
    public int S0;
    public boolean S1;
    public int S2;
    public String S3;
    public float T;
    public int T0;
    public org.telegram.ui.ActionBar.e2 T1;
    public int T2;
    public ArrayList T3;
    public boolean U;
    public boolean U0;
    public boolean U1;
    public int U2;
    public boolean U3;
    public boolean V;
    public org.telegram.ui.Components.td0 V0;
    public boolean V1;
    public boolean V2;
    public CharSequence V3;
    public boolean W;
    public org.telegram.ui.Cells.p2 W0;
    public long W1;
    public int W2;
    public boolean W3;
    public ox X;
    public org.telegram.ui.Cells.p2 X0;
    public TLObject X1;
    public cy X2;
    public float X3;
    public ag.u0 Y;
    public boolean Y0;
    public int Y1;
    public long Y2;
    public boolean Y3;
    public n31 Z;
    public boolean Z0;
    public int Z1;
    public TLRPC.Chat Z2;
    public boolean Z3;
    public final int f38564a;
    public org.telegram.ui.Components.t91 f38565a0;
    public final ArrayList f38566a1;
    public boolean a2;
    public TLRPC.ChatFull f38567a3;
    public ValueAnimator f38568a4;
    public final oe.b f38569b;
    public ig.r0 f38570b0;
    public boolean f38571b1;
    public boolean f38572b2;
    public org.telegram.ui.Components.y9 f38573b3;
    public org.telegram.ui.Components.g50 f38574b4;
    public final oe.b f38575c;
    public float f38576c0;
    public boolean f38577c1;
    public boolean f38578c2;
    public org.telegram.ui.Components.j9 f38579c3;
    public TLRPC.FileLocation f38580c4;
    public final oe.b d;
    public ValueAnimator f38581d0;
    public boolean f38582d1;
    public int f38583d2;
    public long f38584d3;
    public TLRPC.FileLocation f38585d4;
    public final oe.b e;
    public ay[] f38586e0;
    public org.telegram.ui.ActionBar.j2 f38587e1;
    public boolean f38588e2;
    public boolean f38589e3;
    public org.telegram.ui.Components.qc f38590e4;
    public final oe.b f38591f;
    public org.telegram.ui.ActionBar.w0 f38592f0;
    public final Paint f38593f1;
    public String f38594f2;
    public boolean f38595f3;
    public int f38596f4;
    public org.telegram.ui.ActionBar.w0 f38597g0;
    public ImageView f38598g1;
    public String f38599g2;
    public AnimatorSet f38600g3;
    public int f38601g4;
    public final oe.b h;
    public ey f38602h0;
    public NumberTextView f38603h1;
    public String f38604h2;
    public boolean f38605h3;
    public int f38606h4;
    public boolean f38607i0;
    public final ArrayList f38608i1;
    public boolean f38609i2;
    public boolean f38610i3;
    public int f38611i4;
    public org.telegram.ui.ActionBar.w0 f38612j0;
    public org.telegram.ui.ActionBar.w0 f38613j1;
    public boolean f38614j2;
    public float f38615j3;
    public int f38616j4;
    public org.telegram.ui.ActionBar.w0 f38617k0;
    public org.telegram.ui.ActionBar.w0 f38618k1;
    public boolean f38619k2;
    public boolean f38620k3;
    public final ch.f f38621k4;
    public org.telegram.ui.ActionBar.w0 f38622l0;
    public org.telegram.ui.ActionBar.w0 l1;
    public boolean f38623l2;
    public int f38624l3;
    public final hh.d l4;
    public org.telegram.ui.ActionBar.w0 m0;
    public org.telegram.ui.ActionBar.w0 f38625m1;
    public boolean f38626m2;
    public boolean f38627m3;
    public final hh.d f38628m4;
    public final oe.b f38629n;
    public org.telegram.ui.Components.ej0 f38630n0;
    public org.telegram.ui.ActionBar.g1 f38631n1;
    public String f38632n2;
    public boolean f38633n3;
    public final hh.c f38634n4;
    public org.telegram.ui.ActionBar.g1 f38635o0;
    public org.telegram.ui.ActionBar.g1 f38636o1;
    public String f38637o2;
    public org.telegram.ui.Components.qc f38638o3;
    public final ch.b f38639o4;
    public fi.v3 f38640p0;
    public org.telegram.ui.ActionBar.g1 f38641p1;
    public final MessagesStorage.TopicKey f38642p2;
    public final AnimationNotificationsLocker f38643p3;
    public final ch.b f38644p4;
    public fi.v3 f38645q0;
    public org.telegram.ui.ActionBar.g1 f38646q1;
    public boolean f38647q2;
    public boolean f38648q3;
    public final ch.b f38649q4;
    public final oe.b f38650r;
    public boolean f38651r0;
    public org.telegram.ui.ActionBar.g1 f38652r1;
    public boolean f38653r2;
    public boolean f38654r3;
    public final ch.b f38655r4;
    public final oe.b f38656s;
    public boolean f38657s0;
    public org.telegram.ui.ActionBar.g1 f38658s1;
    public boolean f38659s2;
    public boolean f38660s3;
    public tv f38661s4;
    public org.telegram.ui.Components.j20 f38662t0;
    public org.telegram.ui.ActionBar.g1 f38663t1;
    public boolean f38664t2;
    public boolean f38665t3;
    public final ArrayList f38666t4;
    public org.telegram.ui.Components.j20 f38667u0;
    public float f38668u1;
    public boolean f38669u2;
    public float f38670u3;
    public final RectF f38671u4;
    public final rh.i v;
    public fi.d f38672v0;
    public float f38673v1;
    public boolean f38674v2;
    public ValueAnimator f38675v3;
    public final RectF f38676v4;
    public boolean f38677w;
    public lh.f f38678w0;
    public AnimatorSet f38679w1;
    public boolean f38680w2;
    public float f38681w3;
    public int f38682w4;
    public int f38683x;
    public int f38684x0;
    public float f38685x1;
    public boolean f38686x2;
    public float f38687x3;
    public int f38688x4;
    public boolean f38689y;
    public final UndoView[] f38690y0;
    public jh.f f38691y1;
    public boolean f38692y2;
    public float y3;
    public qx f38693z0;
    public FrameLayout f38694z1;
    public boolean f38695z2;
    public int f38696z3;
    public static final boolean[] f38563z4 = new boolean[4];
    public static final org.telegram.ui.Components.qs0 A4 = new org.telegram.ui.Components.qs0(3);

    public cy(Bundle bundle) {
        super(bundle);
        int i10;
        int dp;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f38564a = i10;
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        this.f38569b = new oe.b(1, this, dsVar, 350L, false);
        this.f38575c = new oe.b(2, this, dsVar, 350L, false);
        this.d = new oe.b(3, this, dsVar, 350L, false);
        this.e = new oe.b(4, this, dsVar, 350L, false);
        this.f38591f = new oe.b(5, this, dsVar, 350L, false);
        this.h = new oe.b(6, this, dsVar, 350L, false);
        this.f38629n = new oe.b(7, this, dsVar, 350L, false);
        this.f38650r = new oe.b(8, this, dsVar, 350L, false);
        this.f38656s = new oe.b(9, this, dsVar, 350L, false);
        this.v = new rh.i(new sv(this, 2));
        this.f38683x = -1;
        this.F = true;
        this.K = false;
        this.L = false;
        this.M = false;
        this.Q = true;
        this.f38576c0 = 1.0f;
        this.f38690y0 = new UndoView[2];
        this.f38566a1 = new ArrayList();
        this.f38593f1 = new Paint();
        this.f38608i1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.E1 = new TextPaint(1);
        this.U1 = true;
        this.f38578c2 = true;
        this.f38609i2 = true;
        this.f38642p2 = new MessagesStorage.TopicKey();
        this.I2 = new ArrayList();
        this.J2 = true;
        this.f38643p3 = new AnimationNotificationsLocker();
        this.f38696z3 = -1;
        this.H3 = new iw(this, 0);
        this.I3 = new iw(this, 1);
        this.M3 = -4;
        this.N3 = true;
        this.O3 = true;
        this.X3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.f38666t4 = arrayList;
        RectF rectF = new RectF();
        this.f38671u4 = rectF;
        RectF rectF2 = new RectF();
        this.f38676v4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        hh.c d = this.glassEngine.d(new iv(this, 11));
        this.f38634n4 = d;
        if (i11 >= 31) {
            ch.f fVar = new ch.f();
            this.f38621k4 = fVar;
            hh.d dVar = new hh.d(d);
            this.f38628m4 = dVar;
            dVar.f12841f = d;
            dVar.d = fVar;
            dVar.e = -2;
            hh.d dVar2 = new hh.d(null);
            this.l4 = dVar2;
            dVar2.f12841f = d;
            dVar2.d = fVar;
            dVar2.e = -3;
            ch.b bVar = new ch.b(dVar);
            this.f38649q4 = bVar;
            bVar.f6303i = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                dp = AndroidUtilities.dp(8.0f);
            } else {
                dp = AndroidUtilities.dp(48.0f);
            }
            bVar.f6299b = dp;
            bVar.f6300c = dp;
            ch.b bVar2 = new ch.b(dVar2);
            this.f38639o4 = bVar2;
            bVar2.f6303i = LiteMode.isEnabled(262144);
            int dp2 = AndroidUtilities.dp(48.0f);
            bVar2.f6299b = dp2;
            bVar2.f6300c = dp2;
            this.f38644p4 = new ch.b(dVar2);
        } else {
            this.f38621k4 = null;
            this.l4 = null;
            this.f38628m4 = null;
            this.f38639o4 = new ch.b(d);
            this.f38649q4 = new ch.b(d);
            this.f38644p4 = new ch.b(d);
        }
        ch.b bVar3 = new ch.b(d);
        this.f38655r4 = bVar3;
        ch.b bVar4 = this.f38649q4;
        oi.q qVar = this.glassEngine;
        bVar4.h = qVar;
        this.f38639o4.h = qVar;
        this.f38644p4.h = qVar;
        bVar3.h = qVar;
    }

    public static void A0(cy cyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
            LaunchActivity.H0(launchActivity, cyVar.currentAccount, tL_attachMenuBot, null, true);
        } else {
            ki1.a(cyVar.getParentActivity(), new y(cyVar, tL_attachMenuBot, launchActivity, 8), null);
        }
    }

    public static void B0(cy cyVar) {
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        cyVar.c5();
        org.telegram.ui.Components.qc J = org.telegram.ui.Components.wc.b0(cyVar).J(R.raw.chats_infotip, LocaleController.getString(R.string.BirthdaySetupLater), LocaleController.getString(R.string.Settings), new cv(cyVar, 1));
        J.f31889j = 5000;
        J.j();
    }

    public static void C0(cy cyVar) {
        boolean z10 = true;
        try {
            ((org.telegram.ui.Components.xj0) ((org.telegram.ui.Components.j9) cyVar.M1.h.getImageReceiver().getStaticThumb()).K).H(true);
        } catch (Exception unused) {
        }
        if (cyVar.f38574b4 == null) {
            org.telegram.ui.Components.g50 g50Var = new org.telegram.ui.Components.g50(0, true, true);
            cyVar.f38574b4 = g50Var;
            g50Var.H = true;
            g50Var.f28421a = cyVar;
            g50Var.f28422b = new nx(cyVar);
            cyVar.getMediaDataController().checkFeaturedStickers();
            cyVar.getMessagesController().loadSuggestedFilters();
            cyVar.getMessagesController().loadUserInfo(cyVar.getUserConfig().getCurrentUser(), true, cyVar.classGuid);
        }
        TLRPC.User user = MessagesController.getInstance(cyVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(cyVar.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(cyVar.currentAccount).getCurrentUser();
        }
        if (user != null) {
            org.telegram.ui.Components.ti tiVar = cyVar.f38574b4.f28423c;
            if (tiVar != null) {
                tiVar.h1();
            }
            org.telegram.ui.Components.g50 g50Var2 = cyVar.f38574b4;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z10 = false;
            }
            g50Var2.n(z10, new cv(cyVar, 0), new dv(cyVar, 0), 0);
        }
    }

    public static void D0(cy cyVar, float f7, ValueAnimator valueAnimator) {
        cyVar.f38586e0[0].setTranslationY((1.0f - cyVar.f38670u3) * f7);
        cyVar.f38670u3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i10 = 0; i10 < cyVar.actionBar.getChildCount(); i10++) {
            if (cyVar.actionBar.getChildAt(i10).getVisibility() == 0 && cyVar.actionBar.getChildAt(i10) != cyVar.actionBar.getActionMode() && cyVar.actionBar.getChildAt(i10) != cyVar.actionBar.getBackButton()) {
                cyVar.actionBar.getChildAt(i10).setAlpha(1.0f - cyVar.f38670u3);
            }
        }
        cyVar.M3();
        cyVar.E3();
        View view = cyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void E0(cy cyVar) {
        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(cyVar.getParentActivity(), cyVar.resourceProvider);
        ybVar.d(R.raw.email_check_inbox, new String[0]);
        ybVar.f35001b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
        org.telegram.ui.Components.qc.g(cyVar, ybVar, 2750).j();
        try {
            cyVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void F0(cy cyVar, BirthdayController.BirthdayState birthdayState) {
        if (birthdayState.today.size() == 1) {
            zh.p1 p1Var = new zh.p1(cyVar.getParentActivity(), cyVar.currentAccount, birthdayState.today.get(0).f22176id, null, null);
            p1Var.V(true);
            cyVar.showDialog(p1Var);
            return;
        }
        vg.n1.e0(0, birthdayState);
    }

    public static void G0(cy cyVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.qc M = org.telegram.ui.Components.wc.b0(cyVar).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
            M.f31889j = 5000;
            M.j();
            return;
        }
        if (userFull != null) {
            if (tL_birthday == null) {
                userFull.flags2 &= -33;
            } else {
                userFull.flags2 |= 32;
            }
            userFull.birthday = tL_birthday;
            cyVar.getMessagesStorage().updateUserInfo(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (cyVar.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cyVar.getParentActivity(), 0, cyVar.resourceProvider);
                alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                cyVar.showDialog(alertDialog$Builder.f22368a);
                return;
            }
            return;
        }
        org.telegram.messenger.t.q(R.string.UnknownError, org.telegram.ui.Components.wc.b0(cyVar), R.raw.error, 36);
    }

    public static void H0(cy cyVar) {
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        cyVar.c5();
    }

    public static void U2(cy cyVar, float f7) {
        float f10;
        float f11;
        int i10;
        int i11;
        float clamp = Utilities.clamp(cyVar.f38685x1 * 2.0f, 1.0f, 0.0f);
        qw qwVar = cyVar.E0;
        float f12 = (1.0f - cyVar.f38670u3) * f7 * cyVar.H0;
        float f13 = 1.0f - clamp;
        qwVar.setAlpha(f12 * f13);
        int i12 = 0;
        if (!cyVar.K && !cyVar.M) {
            if (cyVar.L) {
                cyVar.E0.setTranslationY((Math.max(cyVar.N, -cyVar.c4()) + (-AndroidUtilities.dp(81.0f))) - AndroidUtilities.dp(8.0f));
                cyVar.E0.setProgressToCollapse(1.0f);
                qw qwVar2 = cyVar.E0;
                qwVar2.setClipTop((int) (AndroidUtilities.statusBarHeight - qwVar2.getY()));
            }
            f10 = 1.0f - cyVar.H0;
            cyVar.actionBar.setTranslationY(0.0f);
        } else {
            float clamp2 = Utilities.clamp((-cyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
            if (cyVar.f38670u3 == 1.0f) {
                clamp2 = 1.0f;
            }
            float clamp3 = Utilities.clamp(clamp2 / 0.5f, 1.0f, 0.0f);
            cyVar.E0.setClipTop(0);
            if (!cyVar.K && cyVar.M) {
                cyVar.E0.setTranslationY((-AndroidUtilities.dp(81.0f)) - AndroidUtilities.dp(8.0f));
                cyVar.E0.setProgressToCollapse(1.0f);
                f11 = cyVar.H0;
            } else {
                cyVar.E0.setTranslationY(((cyVar.T / 2.0f) + (Math.max(cyVar.N, -cyVar.c4()) + cyVar.f38681w3)) - AndroidUtilities.dp(8.0f));
                cyVar.E0.l(clamp2, !cyVar.G3.c());
                if (!cyVar.M) {
                    f11 = cyVar.H0;
                } else {
                    f10 = 1.0f - clamp3;
                    cyVar.actionBar.setTranslationY(0.0f);
                }
            }
            f10 = 1.0f - f11;
            cyVar.actionBar.setTranslationY(0.0f);
        }
        float f14 = f10 * f13;
        if (f14 != 1.0f) {
            cyVar.actionBar.getTitlesContainer().setPivotY(AndroidUtilities.statusBarHeight);
            cyVar.actionBar.getTitlesContainer().setPivotX(AndroidUtilities.dp(20.0f));
            float f15 = (0.6f * f14) + 0.4f;
            cyVar.actionBar.getTitlesContainer().setScaleY(f15);
            cyVar.actionBar.getTitlesContainer().setScaleX(f15);
            cyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
            cyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-AndroidUtilities.dp(30.0f));
            cyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f15);
            cyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f15);
            float f16 = (1.0f - cyVar.f38670u3) * f14;
            cyVar.actionBar.getTitlesContainer().setAlpha(f16);
            FrameLayout titlesContainer = cyVar.actionBar.getTitlesContainer();
            int i13 = (f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1));
            if (i13 > 0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            titlesContainer.setVisibility(i11);
            cyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f16);
            FrameLayout additionalSubTitleOverlayContainer = cyVar.actionBar.getAdditionalSubTitleOverlayContainer();
            if (i13 <= 0) {
                i12 = 4;
            }
            additionalSubTitleOverlayContainer.setVisibility(i12);
            return;
        }
        cyVar.actionBar.getTitlesContainer().setScaleY(1.0f);
        cyVar.actionBar.getTitlesContainer().setScaleX(1.0f);
        cyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
        cyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
        float f17 = 1.0f - cyVar.f38670u3;
        cyVar.actionBar.getTitlesContainer().setAlpha(f17);
        FrameLayout titlesContainer2 = cyVar.actionBar.getTitlesContainer();
        int i14 = (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1));
        if (i14 > 0) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        titlesContainer2.setVisibility(i10);
        cyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f17);
        FrameLayout additionalSubTitleOverlayContainer2 = cyVar.actionBar.getAdditionalSubTitleOverlayContainer();
        if (i14 <= 0) {
            i12 = 4;
        }
        additionalSubTitleOverlayContainer2.setVisibility(i12);
    }

    public static void V(cy cyVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, tL_pendingSuggestion.suggestion);
        cyVar.c5();
    }

    public static void V2(cy cyVar, Canvas canvas, int i10) {
        org.telegram.ui.ActionBar.j5 j5Var;
        if (cyVar.parentLayout != null && cyVar.actionBar != null) {
            float max = Math.max(cyVar.e.e, cyVar.d4());
            float f7 = 1.0f;
            float f10 = 1.0f - cyVar.f38685x1;
            float f11 = max * f10 * f10;
            int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            if (i11 != 0) {
                if (-1 >= i10) {
                    f7 = 0.0f;
                    i10 = -1;
                }
                if (f7 > 0.0f && i11 > 0 && i10 > 0 && (j5Var = cyVar.parentLayout) != null) {
                    ((ActionBarLayout) j5Var).p(canvas, (int) (f7 * 255.0f * f11), i10);
                }
            }
        }
    }

    public static void W(cy cyVar, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cyVar.f38670u3 = floatValue;
        cyVar.f38586e0[0].setTranslationY((-f7) * floatValue);
        for (int i10 = 0; i10 < cyVar.actionBar.getChildCount(); i10++) {
            if (cyVar.actionBar.getChildAt(i10).getVisibility() == 0 && cyVar.actionBar.getChildAt(i10) != cyVar.actionBar.getActionMode() && cyVar.actionBar.getChildAt(i10) != cyVar.actionBar.getBackButton()) {
                cyVar.actionBar.getChildAt(i10).setAlpha(1.0f - cyVar.f38670u3);
            }
        }
        View view = cyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        cyVar.M3();
        cyVar.E3();
    }

    public static void X(cy cyVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(cyVar.currentAccount).getClientUserId());
        cyVar.presentFragment(new un(bundle));
    }

    public static void Y(cy cyVar) {
        ArrayList arrayList = cyVar.I2;
        org.telegram.ui.ActionBar.j5 j5Var = cyVar.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).x()) {
            cyVar.finishPreviewFragment();
        } else if (cyVar.R0 == 10) {
            if (cyVar.C2 != null && !arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i10)).longValue(), 0L));
                }
                cyVar.C2.v(cyVar, arrayList2, null, false, cyVar.J2, cyVar.K2, cyVar.L2, null);
            }
        } else if (MessagesController.getInstance(cyVar.currentAccount).isFrozen()) {
            b.b(cyVar.currentAccount);
        } else {
            cyVar.presentFragment(new ContactsActivity(a1.g.i("destroyAfterSelect", true)));
        }
    }

    public static org.telegram.ui.Cells.p2 Y3(ay ayVar) {
        wx wxVar = ayVar.f37913a;
        for (int i10 = 0; i10 < wxVar.getChildCount(); i10++) {
            View childAt = wxVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.p2) {
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) childAt;
                if (p2Var.O()) {
                    return p2Var;
                }
            }
        }
        return null;
    }

    public static void Z(cy cyVar) {
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
        cyVar.c5();
    }

    public static void a0(cy cyVar) {
        PasskeysActivity.b0(cyVar.currentAccount, cyVar.getParentActivity(), cyVar.resourceProvider, true);
    }

    public static void b0(cy cyVar, TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = cyVar.getMessagesController().getUserFull(cyVar.getUserConfig().getClientUserId());
        if (userFull != null) {
            tL_birthday2 = userFull.birthday;
        } else {
            tL_birthday2 = null;
        }
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        cyVar.getMessagesController().invalidateContentSettings();
        cyVar.getConnectionsManager().sendRequest(updatebirthday, new ea(cyVar, userFull, tL_birthday2, 8), 1024);
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        cyVar.c5();
    }

    public static void c0(cy cyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(cyVar.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(cyVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new ea(cyVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void d0(cy cyVar, String str) {
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, str);
        cyVar.c5();
    }

    public static void e0(cy cyVar, ay ayVar, View view, int i10) {
        int i11;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        if (view instanceof org.telegram.ui.Cells.z3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.p2;
        if (z10) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
            if (p2Var.f24694n2) {
                cyVar.V4(p2Var.getDialogId(), view);
                return;
            }
        }
        if (cyVar.Q3()) {
            cyVar.w4(view, i10, 0.0f, ayVar.d);
            return;
        }
        int i12 = cyVar.R0;
        if (i12 == 15 && (view instanceof org.telegram.ui.Cells.v8)) {
            ayVar.d.L();
            return;
        }
        int i13 = 0;
        if ((i12 == 11 || i12 == 13) && i10 == 1) {
            Bundle i14 = a1.g.i("forImport", true);
            i14.putLongArray("result", new long[]{cyVar.getUserConfig().getClientUserId()});
            i14.putInt("chatType", 4);
            String string = cyVar.arguments.getString("importTitle");
            if (string != null) {
                i14.putString("title", string);
            }
            x60 x60Var = new x60(i14);
            x60Var.Y = new dw(cyVar);
            cyVar.presentFragment(x60Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.x2) && ((i11 = ayVar.f37919s) == 7 || i11 == 8)) {
            ig.l lVar = (ig.l) ayVar.d.M.get(0);
            if (lVar != null && lVar.f47040a == 17) {
                tL_chatlists_chatlistUpdates = lVar.f14153i;
            } else {
                tL_chatlists_chatlistUpdates = null;
            }
            if (tL_chatlists_chatlistUpdates != null) {
                MessagesController.DialogFilter dialogFilter = cyVar.getMessagesController().selectedDialogFilter[ayVar.f37919s - 7];
                if (dialogFilter != null) {
                    int i15 = dialogFilter.f19549id;
                    ?? bbVar = new org.telegram.ui.Components.bb(cyVar, false);
                    bbVar.Y = -1;
                    bbVar.f30802c0 = "";
                    bbVar.f30803d0 = new ArrayList();
                    bbVar.f30805f0 = "";
                    bbVar.f30807h0 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    bbVar.f30808i0 = arrayList;
                    bbVar.f30824z0 = -1;
                    bbVar.C0 = -5;
                    bbVar.Y = i15;
                    bbVar.f30800a0 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    bbVar.f30806g0 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList<MessagesController.DialogFilter> arrayList2 = cyVar.getMessagesController().dialogFilters;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                break;
                            } else if (arrayList2.get(i13).f19549id == i15) {
                                bbVar.f30802c0 = arrayList2.get(i13).name;
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                    bbVar.T();
                    cyVar.showDialog(bbVar);
                    return;
                }
                return;
            }
        } else if (z10 && !cyVar.actionBar.q() && !cyVar.G3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.p2) view).Y1;
            AndroidUtilities.rectTmp.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        }
        cyVar.v4(view, i10, ayVar.d);
    }

    public static void f0(cy cyVar) {
        cyVar.presentFragment(new PrivacySettingsActivity());
        AndroidUtilities.scrollToFragmentRow(cyVar.parentLayout, "newChatsRow");
    }

    public static void g1(cy cyVar, boolean z10) {
        if (cyVar.f38586e0 != null && cyVar.N3 != z10) {
            cyVar.N3 = z10;
            int i10 = 0;
            while (true) {
                ay[] ayVarArr = cyVar.f38586e0;
                if (i10 < ayVarArr.length) {
                    if (z10) {
                        ayVarArr[i10].f37913a.setScrollbarFadingEnabled(false);
                    }
                    cyVar.f38586e0[i10].f37913a.setVerticalScrollBarEnabled(z10);
                    if (z10) {
                        cyVar.f38586e0[i10].f37913a.setScrollbarFadingEnabled(true);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public static void h0(cy cyVar) {
        if (cyVar.f38574b4.g()) {
            MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
            cyVar.c5();
        }
    }

    public static void j0(cy cyVar) {
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "PREMIUM_GRACE");
        cyVar.c5();
    }

    public static void k0(cy cyVar) {
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
        cyVar.c5();
    }

    public static void l0(cy cyVar, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        try {
            e2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject != null) {
            cyVar.arguments.getString("importTitle");
            String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
            bi.r3 r3Var = new bi.r3(cyVar, j10, 27);
            Pattern pattern = org.telegram.ui.Components.g5.f28420a;
            if (cyVar.getParentActivity() != null) {
                if (chat != null || user != null) {
                    int currentAccount = cyVar.getCurrentAccount();
                    Activity parentActivity = cyVar.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
                    TextView textView = new TextView(parentActivity);
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23464j5, null);
                    textView.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 48);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    alertDialog$Builder.o(frameLayout);
                    org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
                    j9Var.u(AndroidUtilities.dp(12.0f));
                    org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(parentActivity);
                    y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                    if (LocaleController.isRTL) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    frameLayout.addView(y9Var, org.telegram.ui.Components.gb1.h(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(parentActivity);
                    org.telegram.messenger.t.r(textView2, org.telegram.ui.ActionBar.y6.E8, null, 1, 20.0f);
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 16);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setText(LocaleController.getString(R.string.ImportMessages));
                    boolean z10 = LocaleController.isRTL;
                    if (z10) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    int i16 = i13 | 48;
                    int i17 = 76;
                    if (z10) {
                        i14 = 21;
                    } else {
                        i14 = 76;
                    }
                    float f7 = i14;
                    if (!z10) {
                        i17 = 21;
                    }
                    frameLayout.addView(textView2, org.telegram.ui.Components.gb1.h(-1, -2.0f, i16, f7, 11.0f, i17, 0.0f));
                    if (LocaleController.isRTL) {
                        i15 = 5;
                    } else {
                        i15 = 3;
                    }
                    frameLayout.addView(textView, org.telegram.ui.Components.gb1.h(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                    if (user != null) {
                        if (UserObject.isReplyUser(user)) {
                            j9Var.f29542p = 0.8f;
                            j9Var.g(12);
                            y9Var.h(null, null, j9Var, user);
                        } else if (user.f22176id == clientUserId) {
                            j9Var.f29542p = 0.8f;
                            j9Var.g(1);
                            y9Var.h(null, null, j9Var, user);
                        } else {
                            j9Var.f29542p = 1.0f;
                            j9Var.m(currentAccount, user);
                            y9Var.f(user, j9Var);
                        }
                    } else {
                        j9Var.k(currentAccount, chat);
                        y9Var.f(chat, j9Var);
                    }
                    textView.setText(AndroidUtilities.replaceTags(str));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Import), new org.telegram.ui.Components.s(r3Var, 3));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    cyVar.showDialog(alertDialog$Builder.f22368a);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.g5.e0(cyVar.currentAccount, tL_error, cyVar, tL_messages_checkHistoryImportPeer, new Object[0]);
        cyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j10), tL_messages_checkHistoryImportPeer, tL_error);
    }

    public static void l4(un unVar, MessageObject messageObject) {
        CharSequence charSequence;
        if (messageObject != null && messageObject.hasHighlightedWords()) {
            try {
                if (!TextUtils.isEmpty(messageObject.caption)) {
                    charSequence = messageObject.caption;
                } else {
                    charSequence = messageObject.messageText;
                }
                CharSequence highlightText = AndroidUtilities.highlightText(charSequence, messageObject.highlightedWords, (org.telegram.ui.ActionBar.u6) null);
                if (highlightText instanceof SpannableStringBuilder) {
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) highlightText;
                    org.telegram.ui.Components.p10[] p10VarArr = (org.telegram.ui.Components.p10[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.p10.class);
                    if (p10VarArr.length > 0) {
                        int spanStart = spannableStringBuilder.getSpanStart(p10VarArr[0]);
                        int spanEnd = spannableStringBuilder.getSpanEnd(p10VarArr[0]);
                        for (int i10 = 1; i10 < p10VarArr.length; i10++) {
                            int spanStart2 = spannableStringBuilder.getSpanStart(p10VarArr[i10]);
                            int spanStart3 = spannableStringBuilder.getSpanStart(p10VarArr[i10]);
                            if (spanStart2 != spanEnd) {
                                if (spanStart2 > spanEnd) {
                                    for (int i11 = spanEnd; i11 <= spanStart2; i11++) {
                                        if (!Character.isWhitespace(spannableStringBuilder.charAt(i11))) {
                                            break;
                                        }
                                    }
                                }
                            }
                            spanEnd = spanStart3;
                        }
                        unVar.xb(messageObject.getRealId(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void m0(cy cyVar, int i10) {
        Object obj;
        TLRPC.User user;
        org.telegram.ui.Components.ro0 ro0Var = cyVar.C0.f27948q0;
        if (i10 >= ro0Var.Z && i10 < ro0Var.f27254a0) {
            org.telegram.ui.Components.t61 G = ro0Var.G(i10);
            if (G != null) {
                obj = G.G;
            } else {
                obj = null;
            }
        } else {
            obj = Boolean.FALSE;
        }
        if (obj instanceof TLRPC.User) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cyVar.getParentActivity(), 0, cyVar.resourceProvider);
            String string = LocaleController.getString(R.string.AppsClearSearch);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
            e2Var.R = string;
            e2Var.T = LocaleController.formatString(R.string.AppsClearSearchAlert, "\"" + UserObject.getUserName(user) + "\"");
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.Components.voip.k1(7, cyVar, (TLRPC.User) obj));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        }
    }

    public static void n0(cy cyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        HashSet hashSet2;
        if (i10 == 102) {
            cyVar.getMessagesController().setDialogsInTransaction(true);
            if (z10) {
                hashSet2 = hashSet;
            } else {
                hashSet2 = null;
            }
            cyVar.z4(arrayList, i10, false, false, hashSet2);
            cyVar.getMessagesController().setDialogsInTransaction(false);
            cyVar.getMessagesController().checkIfFolderEmpty(cyVar.W2);
            int i11 = cyVar.W2;
            if (i11 != 0 && cyVar.Z3(cyVar.currentAccount, cyVar.f38586e0[0].f37919s, i11, false).size() == 0) {
                cyVar.f38586e0[0].f37913a.setEmptyView(null);
                cyVar.f38586e0[0].f37920w.setVisibility(4);
                cyVar.finishFragment();
                return;
            }
            return;
        }
        cyVar.z4(arrayList, i10, false, false, null);
    }

    public static void q0(cy cyVar) {
        String str;
        MessagesController messagesController = MessagesController.getInstance(cyVar.currentAccount);
        if (cyVar.B3) {
            str = "PREMIUM_UPGRADE";
        } else {
            str = "PREMIUM_ANNUAL";
        }
        messagesController.removeSuggestion(0L, str);
        cyVar.c5();
    }

    public static void q4(AccountInstance accountInstance) {
        int currentAccount = accountInstance.getCurrentAccount();
        boolean[] zArr = f38563z4;
        if (!zArr[currentAccount]) {
            MessagesController messagesController = accountInstance.getMessagesController();
            messagesController.loadGlobalNotificationsSettings();
            messagesController.loadDialogs(0, 0, 100, true);
            messagesController.loadHintDialogs();
            messagesController.loadUserInfo(accountInstance.getUserConfig().getCurrentUser(), false, 0);
            accountInstance.getContactsController().checkInviteText();
            accountInstance.getMediaDataController().checkAllMedia(false);
            AndroidUtilities.runOnUIThread(new ui(accountInstance, 18), 200L);
            Iterator<String> it = messagesController.diceEmojies.iterator();
            while (it.hasNext()) {
                accountInstance.getMediaDataController().loadStickersByEmojiOrName(it.next(), true, true);
            }
            zArr[currentAccount] = true;
        }
    }

    public static void r0(cy cyVar) {
        b.c(cyVar.getParentActivity(), cyVar.currentAccount, cyVar.getResourceProvider());
    }

    public static void r1(cy cyVar, ay ayVar, float f7) {
        if (cyVar.T != f7) {
            cyVar.T = f7;
            int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            int i11 = 0;
            if (i10 == 0) {
                cyVar.U = false;
            }
            cyVar.E0.setOverscroll(f7);
            ayVar.f37913a.setViewsOffset(f7);
            wx wxVar = ayVar.f37913a;
            if (i10 != 0) {
                i11 = 2;
            }
            wxVar.setOverScrollMode(i11);
            cyVar.fragmentView.invalidate();
            if (f7 > AndroidUtilities.dp(90.0f) && !cyVar.U) {
                qw qwVar = cyVar.E0;
                ValueAnimator valueAnimator = qwVar.H0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    qwVar.i(qwVar.f9090p0, true);
                    cyVar.U = true;
                    cyVar.getOrCreateStoryViewer().s(new cv(cyVar, 18));
                }
            }
        }
    }

    public static void s0(cy cyVar, int i10, org.telegram.ui.Components.k80 k80Var) {
        CharSequence charSequence;
        if (cyVar.currentAccount != i10) {
            k80Var.u();
            if (cyVar.getParentActivity() == null) {
                return;
            }
            ux uxVar = cyVar.C2;
            LaunchActivity launchActivity = (LaunchActivity) cyVar.getParentActivity();
            ArrayList arrayList = cyVar.D2;
            String str = cyVar.E2;
            CharSequence charSequence2 = cyVar.F2;
            jw jwVar = cyVar.B1;
            if (jwVar != null) {
                charSequence = jwVar.getFieldText();
            } else {
                charSequence = null;
            }
            launchActivity.P0(i10);
            cy cyVar2 = new cy(cyVar.arguments);
            cyVar2.C2 = uxVar;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList.isEmpty()) {
                    cyVar2.D2 = null;
                } else {
                    cyVar2.D2 = arrayList;
                    cyVar2.E2 = null;
                    cyVar2.M2 = false;
                    if (cyVar2.B1 != null) {
                        cyVar2.s3(charSequence);
                    } else {
                        cyVar2.V3 = charSequence;
                    }
                }
            } else if (str != null) {
                cyVar2.M4(charSequence, str);
            } else if (charSequence2 != null) {
                if (charSequence2.length() == 0) {
                    cyVar2.F2 = null;
                } else {
                    cyVar2.F2 = charSequence2;
                    cyVar2.E2 = null;
                    cyVar2.D2 = null;
                    if (cyVar2.B1 != null) {
                        cyVar2.s3(charSequence);
                    } else {
                        cyVar2.V3 = charSequence;
                    }
                }
            }
            launchActivity.v0(cyVar2, false, true);
        }
    }

    public static boolean s1(cy cyVar, ay ayVar) {
        if (!cyVar.G3.c()) {
            int i10 = (int) (-cyVar.N);
            int b42 = cyVar.b4();
            int c42 = cyVar.c4();
            if (i10 != 0 && i10 != b42 && i10 != c42 && ayVar.f37913a.canScrollVertically(-1)) {
                if (c42 < i10 && i10 < b42) {
                    int dp = AndroidUtilities.dp(48.0f);
                    int i11 = i10 - c42;
                    if (i11 < dp / 2) {
                        ayVar.f37914b.y(-i11);
                        return true;
                    }
                    ayVar.f37914b.y(dp - i11);
                    return true;
                }
                float f7 = 1.0f;
                if (cyVar.f38670u3 != 1.0f) {
                    f7 = Utilities.clamp((-cyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
                }
                if (f7 < cyVar.E0.B0) {
                    ayVar.f37914b.y(-i10);
                    return true;
                }
                ayVar.f37914b.y(c42 - i10);
                return true;
            }
            return false;
        }
        return false;
    }

    public static void t0(final int i10, final long j10, TLRPC.Chat chat, final cy cyVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        int i14;
        cyVar.j4(false);
        if (i10 == 103 && ChatObject.isChannel(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || ChatObject.isPublic(chat2)) {
                cyVar.getMessagesController().deleteDialog(j10, 2, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i10 == 102 && (i14 = cyVar.W2) != 0 && cyVar.Z3(cyVar.currentAccount, cyVar.f38586e0[0].f37919s, i14, false).size() == 1) {
            cyVar.f38586e0[0].f37920w.setVisibility(4);
        }
        cyVar.f38696z3 = 3;
        int i15 = -1;
        if (i10 == 102) {
            cyVar.I4(true, true);
            if (cyVar.R1 != null) {
                i13 = 0;
                while (i13 < cyVar.R1.size()) {
                    if (((TLRPC.Dialog) cyVar.R1.get(i13)).f22031id == j10) {
                        break;
                    }
                    i13++;
                }
            }
            i13 = -1;
            cyVar.w3();
            i11 = i13;
        } else {
            i11 = -1;
        }
        UndoView g42 = cyVar.g4();
        if (g42 != null) {
            if (i10 == 103) {
                i12 = 0;
            } else if (z11) {
                i12 = 1;
            } else {
                i12 = 95;
            }
            g42.j(i12, j10, new Runnable() {
                @Override
                public final void run() {
                    cyVar.y4(i10, j10, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(cyVar.Z3(cyVar.currentAccount, cyVar.f38586e0[0].f37919s, cyVar.W2, false));
        int i16 = 0;
        while (true) {
            if (i16 >= arrayList2.size()) {
                break;
            } else if (((TLRPC.Dialog) arrayList2.get(i16)).f22031id == j10) {
                i15 = i16;
                break;
            } else {
                i16++;
            }
        }
        if (i10 == 102) {
            if (i11 >= 0 && i15 < 0 && (arrayList = cyVar.R1) != null) {
                arrayList.remove(i11);
                cyVar.f38586e0[0].f37921x.D();
                cyVar.f38586e0[0].q(true);
                return;
            }
            cyVar.I4(false, true);
        }
    }

    public static String t2(cy cyVar) {
        String shortName;
        ArrayList arrayList = cyVar.I2;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() < 3) {
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                long longValue = ((Long) obj).longValue();
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                if (longValue == cyVar.getUserConfig().getClientUserId()) {
                    sb2.append(LocaleController.getString(R.string.SavedMessages));
                } else {
                    if (arrayList.size() == 1) {
                        shortName = DialogObject.getName(cyVar.currentAccount, longValue);
                    } else {
                        shortName = DialogObject.getShortName(cyVar.currentAccount, longValue);
                    }
                    sb2.append(shortName);
                }
            }
            return LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        }
        return LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]);
    }

    public static void u0(cy cyVar) {
        BirthdayController.getInstance(cyVar.currentAccount).hide();
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_CONTACTS_TODAY");
        cyVar.c5();
        org.telegram.ui.Components.qc G = org.telegram.ui.Components.wc.b0(cyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f31889j = 5000;
        G.j();
    }

    public static void v0(cy cyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.H0(launchActivity, cyVar.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(cyVar.currentAccount).updateAttachMenuBotsInCache();
    }

    public static void w0(cy cyVar) {
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "PREMIUM_RESTORE");
        cyVar.c5();
    }

    public static void x0(cy cyVar) {
        if (!cyVar.O3) {
            fi.v3 v3Var = cyVar.f38645q0;
            if (v3Var != null) {
                if (v3Var.V) {
                    return;
                }
                AndroidUtilities.removeFromParent(v3Var);
            }
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.y6.Gi, 0, new sv(cyVar, 9));
            fi.v3 v3Var2 = new fi.v3(cyVar.getParentActivity(), 2);
            v3Var2.q(8.0f);
            v3Var2.d = 8000L;
            v3Var2.i(true);
            v3Var2.p(true);
            v3Var2.h = AndroidUtilities.displaySize.x - AndroidUtilities.dp(148.0f);
            v3Var2.s(replaceSingleTag);
            v3Var2.l(1.0f, -40.0f);
            v3Var2.h(cyVar.getThemedColor(org.telegram.ui.ActionBar.y6.Fi));
            cyVar.f38645q0 = v3Var2;
            v3Var2.setTranslationY((-cyVar.f38601g4) - cyVar.f38611i4);
            ((ViewGroup) cyVar.fragmentView).addView(cyVar.f38645q0, org.telegram.ui.Components.gb1.h(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
            cyVar.f38645q0.u();
            return;
        }
        fi.v3 v3Var3 = cyVar.f38640p0;
        if (v3Var3 != null) {
            v3Var3.e(true);
        }
        di.b7 o10 = MessagesController.getInstance(cyVar.currentAccount).getStoriesController().o();
        if (o10 != null && o10.a(cyVar.currentAccount, 1)) {
            cyVar.showDialog(new tg.j0(o10.b(), cyVar.currentAccount, cyVar.getParentActivity(), cyVar, null));
            return;
        }
        fi.sb D = fi.sb.D(cyVar.getParentActivity(), cyVar.currentAccount);
        D.f11679x = new ix(cyVar);
        D.Q(null);
    }

    public static void y0(cy cyVar) {
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "PREMIUM_CHRISTMAS");
        cyVar.c5();
        org.telegram.ui.Components.qc G = org.telegram.ui.Components.wc.b0(cyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f31889j = 5000;
        G.j();
    }

    public static void z0(org.telegram.ui.cy r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.z0(org.telegram.ui.cy, int):void");
    }

    public final void A3() {
        if (this.f38586e0 != null) {
            int t32 = t3();
            int i10 = 0;
            while (true) {
                ay[] ayVarArr = this.f38586e0;
                if (i10 < ayVarArr.length) {
                    ay ayVar = ayVarArr[i10];
                    if (ayVar != null) {
                        wx wxVar = ayVar.f37913a;
                        wxVar.setPadding(0, wxVar.f29887g3, 0, t32);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void A4(long r14, boolean r16, org.telegram.messenger.MessagesController.DialogFilter r17, int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.A4(long, boolean, org.telegram.messenger.MessagesController$DialogFilter, int, boolean):void");
    }

    @Override
    public final List B() {
        return Arrays.asList(new og.a(LocaleController.getString(R.string.DebugDialogsActivity)), new og.a(LocaleController.getString(R.string.ClearLocalDatabase), new cv(this, 28)), new og.a(LocaleController.getString(R.string.DebugClearSendMessageAsPeers), new cv(this, 29)));
    }

    public final void B3() {
        jh.f fVar = this.f38691y1;
        if (fVar != null) {
            fVar.setBlurredBottomHeight(this.f38691y1.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        }
    }

    public final void B4() {
        if (this.K0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / 180));
        this.K0.setBackground(new BitmapDrawable(createBitmap));
        this.K0.setAlpha(0.0f);
        this.K0.setVisibility(0);
        J3();
    }

    public final void C3() {
        int i10;
        ay ayVar;
        boolean z10 = true;
        float a42 = a4(true);
        qx qxVar = this.f38693z0;
        if (qxVar != null) {
            if (qxVar.getAlpha() == a42) {
                z10 = false;
            }
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, a42);
            this.f38693z0.setAlpha(a42);
            this.f38693z0.setScaleX(lerp);
            this.f38693z0.setScaleY(lerp);
            qx qxVar2 = this.f38693z0;
            if (a42 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            qxVar2.setVisibility(i10);
            if (z10 && (ayVar = this.f38586e0[0]) != null) {
                ayVar.f37913a.requestLayout();
            }
        }
        a5();
    }

    public final void C4(ay ayVar) {
        int i10;
        org.telegram.ui.Components.c10 c10Var;
        if (ayVar.getVisibility() != 0) {
            return;
        }
        int i11 = ayVar.d.v;
        if (ayVar.f37919s == 0 && h4() && ayVar.f37913a.getChildCount() == 0 && ayVar.v == 2) {
            ((s4.c0) ayVar.f37913a.getLayoutManager()).h1(1, (int) this.N);
        }
        ayVar.d.getClass();
        ayVar.d.V();
        int h = ayVar.d.h();
        if (h == 1 && i11 == 1 && ayVar.d.j(0) == 5) {
            ayVar.q(true);
        } else {
            ayVar.q(false);
            if (h > i11 && (i10 = this.R0) != 11 && i10 != 12 && i10 != 13) {
                ayVar.f37922y.b(i11);
            }
        }
        try {
            wx wxVar = ayVar.f37913a;
            if (this.W2 == 0 && this.Y2 == 0) {
                c10Var = ayVar.f37920w;
            } else {
                c10Var = null;
            }
            wxVar.setEmptyView(c10Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
        z3(ayVar);
    }

    public final void D3() {
        int i10;
        int i11;
        float f7 = this.f38629n.e;
        float lerp = AndroidUtilities.lerp(0.2f, 1.0f, f7);
        li.w1 w1Var = this.C1;
        int i12 = 8;
        if (w1Var != null) {
            w1Var.setScaleX(lerp);
            this.C1.setScaleY(lerp);
            this.C1.setAlpha(f7);
            li.w1 w1Var2 = this.C1;
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            w1Var2.setVisibility(i11);
        }
        jh.f fVar = this.f38691y1;
        if (fVar != null) {
            fVar.setAlpha(f7);
            jh.f fVar2 = this.f38691y1;
            int i13 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i13 > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            fVar2.setVisibility(i10);
            this.f38691y1.getFadeView().setAlpha(f7);
            View fadeView = this.f38691y1.getFadeView();
            if (i13 > 0) {
                i12 = 0;
            }
            fadeView.setVisibility(i12);
        }
    }

    public final void D4() {
        boolean z10;
        float f7 = 0.0f;
        if (this.N != 0.0f && !(z10 = this.K)) {
            if (z10) {
                f7 = -c4();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.H3, f7));
            animatorSet.setInterpolator(org.telegram.ui.Components.ds.f27586f);
            animatorSet.setDuration(250L);
            animatorSet.start();
        }
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        int i11;
        int i12;
        int i13 = 8;
        if (i10 == 1) {
            K3();
            M3();
            P3();
            C3();
            N3();
            ox oxVar = this.X;
            oe.b bVar = this.f38569b;
            oxVar.setBlurredBackgroundVisibility(bVar.e);
            float a2 = a8.v0.a(bVar.e);
            org.telegram.ui.Components.y9 y9Var = this.f38573b3;
            if (y9Var != null) {
                y9Var.setScaleX(a2);
                this.f38573b3.setScaleY(a2);
                this.f38573b3.setAlpha(a2);
                org.telegram.ui.Components.y9 y9Var2 = this.f38573b3;
                if (a2 > 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                y9Var2.setVisibility(i12);
            }
            if (this.f38672v0 != null) {
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, a2);
                this.f38672v0.setScaleX(lerp);
                this.f38672v0.setScaleY(lerp);
                this.f38672v0.setAlpha(a2);
                fi.d dVar = this.f38672v0;
                int i14 = (a2 > 0.0f ? 1 : (a2 == 0.0f ? 0 : -1));
                if (i14 > 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                dVar.setVisibility(i11);
                this.f38678w0.setAlpha(a2);
                lh.f fVar = this.f38678w0;
                if (i14 > 0) {
                    i13 = 0;
                }
                fVar.setVisibility(i13);
            }
        } else if (i10 == 2) {
            K3();
            M3();
        } else if (i10 == 3) {
            I3();
        } else if (i10 == 4) {
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        } else if (i10 == 5) {
            H3();
        } else if (i10 == 6) {
            K3();
            M3();
        } else if (i10 == 7) {
            D3();
        } else if (i10 == 8) {
            C3();
            N3();
        } else if (i10 == 9) {
            N3();
        }
    }

    public final void E3() {
        if (this.actionBar == null) {
            return;
        }
        org.telegram.ui.Components.j20.d(this.actionBar.getBackButton(), Math.max(this.f38670u3, (1.0f - this.f38569b.e) * (1.0f - d4()) * (1.0f - this.f38575c.e)));
    }

    public final void E4(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.E4(int):void");
    }

    public final void F3() {
        float f7;
        if (this.f38607i0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.j20.d(this.f38597g0, c3.h0.E(f7, 1.0f - this.f38569b.e, 1.0f - d4(), 1.0f - this.f38575c.e));
    }

    public final void F4(boolean z10, boolean z11) {
        int i10;
        int i11;
        tw twVar = this.G3;
        if (twVar != null && twVar.c()) {
            return;
        }
        if (this.f38586e0[0].f37919s == 0 && h4() && this.f38586e0[0].v == 2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.K && !z11 && !this.E0.g()) {
            i11 = -AndroidUtilities.dp(81.0f);
        } else {
            i11 = 0;
        }
        if (z10) {
            org.telegram.ui.Components.pl0 pl0Var = this.f38586e0[0].f37918r;
            pl0Var.f31597b = 1;
            pl0Var.c(i10, i11, false, false);
            D4();
            return;
        }
        this.f38586e0[0].f37915c.h1(i10, i11);
        D4();
    }

    public final void G3() {
        float f7;
        if (SharedConfig.passcodeHash.isEmpty()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.j20.d(this.f38592f0, c3.h0.E(f7, 1.0f - this.f38569b.e, 1.0f - d4(), 1.0f - this.f38575c.e));
    }

    public final void G4(String str, boolean z10) {
        W4(true, false, true, false);
        ox oxVar = this.X;
        if (oxVar != null) {
            oxVar.f30367r.setText(str);
            this.X.f30367r.setSelection(str.length());
        }
    }

    public final void H3() {
        float f7;
        if (this.R0 != 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.j20.d(this.f38612j0, c3.h0.E(f7, this.f38591f.e, 1.0f - d4(), 1.0f - this.f38575c.e));
        qw qwVar = this.E0;
        if (qwVar != null) {
            qwVar.invalidate();
        }
    }

    public final void H4(float f7) {
        ay[] ayVarArr;
        this.f38576c0 = f7;
        for (ay ayVar : this.f38586e0) {
            wx wxVar = ayVar.f37913a;
            for (int i10 = 0; i10 < wxVar.getChildCount(); i10++) {
                View childAt = wxVar.getChildAt(i10);
                if (childAt != null && RecyclerView.R(childAt) >= ayVar.d.f14171f + 1) {
                    childAt.setAlpha(f7);
                }
            }
        }
    }

    public final void I3() {
        org.telegram.ui.Components.j20.d(this.f38622l0, c3.h0.E(this.f38569b.e, 1.0f - d4(), 1.0f - this.f38575c.e, this.d.e));
    }

    public final void I4(boolean z10, boolean z11) {
        if (this.f38586e0 != null && this.S1 != z10) {
            if (z10) {
                this.R1 = new ArrayList(Z3(this.currentAccount, this.f38586e0[0].f37919s, this.W2, false));
            } else {
                this.R1 = null;
            }
            this.S1 = z10;
            ay ayVar = this.f38586e0[0];
            ayVar.d.G = z10;
            if (!z10 && z11) {
                if (ayVar.f37913a.c0()) {
                    this.f38586e0[0].f37913a.post(new sv(this, 10));
                } else {
                    this.f38586e0[0].d.l();
                }
            }
        }
    }

    public final void J3() {
        boolean z10;
        bi.cc ccVar;
        if (!this.f38614j2 && ((ccVar = this.K0) == null || ccVar.getBackground() == null || this.K0.getAlpha() < 0.01f || this.K0.getVisibility() == 8)) {
            z10 = true;
        } else {
            z10 = false;
        }
        mg0 mg0Var = this.J3;
        if (mg0Var != null) {
            mg0Var.f41556a.v.a(z10, true);
        }
    }

    public final void J4(boolean z10) {
        ay ayVar;
        if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
            if (z10) {
                ay[] ayVarArr = this.f38586e0;
                if (ayVarArr != null && (ayVar = ayVarArr[0]) != null) {
                    ayVar.setLayerType(2, null);
                    this.f38586e0[0].setClipChildren(false);
                    this.f38586e0[0].setClipToPadding(false);
                    this.f38586e0[0].f37913a.setClipChildren(false);
                }
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.setLayerType(2, null);
                }
                View view = this.fragmentView;
                if (view != null) {
                    ((ViewGroup) view).setClipChildren(false);
                    this.fragmentView.requestLayout();
                    return;
                }
                return;
            }
            if (this.f38586e0 != null) {
                int i10 = 0;
                while (true) {
                    ay[] ayVarArr2 = this.f38586e0;
                    if (i10 >= ayVarArr2.length) {
                        break;
                    }
                    ay ayVar2 = ayVarArr2[i10];
                    if (ayVar2 != null) {
                        ayVar2.setLayerType(0, null);
                        ayVar2.setClipChildren(true);
                        ayVar2.setClipToPadding(true);
                        ayVar2.f37913a.setClipChildren(true);
                    }
                    i10++;
                }
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setLayerType(0, null);
            }
            qw qwVar = this.E0;
            if (qwVar != null) {
                qwVar.setLayerType(0, null);
            }
            View view2 = this.fragmentView;
            if (view2 != null) {
                ((ViewGroup) view2).setClipChildren(true);
                this.fragmentView.requestLayout();
            }
        }
    }

    public final void K3() {
        E3();
        org.telegram.ui.Components.j20.d(this.f38617k0, (1.0f - this.f38569b.e) * (1.0f - d4()) * (1.0f - this.f38575c.e));
        F3();
        I3();
        G3();
        H3();
    }

    public final void K4(float f7) {
        ay[] ayVarArr = this.f38586e0;
        int i10 = 0;
        if (ayVarArr != null) {
            int paddingTop = ayVarArr[0].f37913a.getPaddingTop() + ((int) f7);
            int i11 = 0;
            while (true) {
                ay[] ayVarArr2 = this.f38586e0;
                if (i11 >= ayVarArr2.length) {
                    break;
                }
                ayVarArr2[i11].f37913a.setTopGlowOffset(paddingTop);
                i11++;
            }
        }
        if (this.fragmentView != null && f7 != this.N) {
            this.N = f7;
            org.telegram.ui.Components.qc qcVar = this.f38638o3;
            if (qcVar != null) {
                qcVar.l();
            }
            if (this.F3 != null) {
                float currentActionBarHeight = 1.0f - ((-f7) / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                org.telegram.ui.Cells.o oVar = this.F3;
                float f10 = (int) f7;
                float f11 = oVar.f24572f;
                oVar.h = f10;
                oVar.setTranslationY(f11 + f10);
                this.F3.setAlpha(a8.ee.a(currentActionBarHeight, 0.0f, 1.0f));
                org.telegram.ui.Cells.o oVar2 = this.F3;
                if (currentActionBarHeight <= 0.0f) {
                    i10 = 4;
                }
                oVar2.setVisibility(i10);
            }
            M3();
            this.fragmentView.invalidate();
        }
    }

    public final void L3() {
        int i10;
        if (d4() > 0.5f) {
            i10 = R.string.SearchTopics;
        } else {
            i10 = R.string.SearchChats;
        }
        String string = LocaleController.getString(i10);
        this.X.f30367r.setContentDescription(string);
        this.X.f30367r.setHint(string);
    }

    public final void L4(float f7) {
        this.f38685x1 = f7;
        j5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            LiteMode.isEnabled(32768);
        }
        a5();
    }

    public final void M3() {
        float f7;
        int i10;
        if (this.X == null) {
            return;
        }
        float a2 = 1.0f - a8.ee.a(((-this.N) - c4()) / AndroidUtilities.dp(48.0f), 0.0f, 1.0f);
        float max = Math.max(this.f38670u3, this.h.e);
        float f10 = this.f38569b.e;
        if (this.R0 != 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float max2 = f7 * (1.0f - this.f38575c.e) * (1.0f - max) * Math.max(f10, (1.0f - d4()) * a2);
        this.X.setAlpha(max2);
        ox oxVar = this.X;
        boolean z10 = false;
        if (max2 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        oxVar.setVisibility(i10);
        if (max2 <= 0.01f) {
            z10 = true;
        }
        this.f38591f.a(z10, true);
    }

    public final void M4(CharSequence charSequence, String str) {
        if (str != null && !str.isEmpty()) {
            this.E2 = str;
            this.F2 = null;
            this.D2 = null;
            if (this.B1 != null) {
                s3(charSequence);
                return;
            } else {
                this.V3 = charSequence;
                return;
            }
        }
        this.E2 = null;
        this.F2 = null;
    }

    public final void N3() {
        int i10;
        float f7;
        int i11;
        int i12 = 8;
        if (this.Z != null) {
            if (this.f38565a0 != null) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float f10 = f7 * this.f38569b.e;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, f10);
            this.Z.setScaleX(lerp);
            this.Z.setScaleY(lerp);
            this.Z.setAlpha(f10);
            n31 n31Var = this.Z;
            if (f10 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            n31Var.setVisibility(i11);
        }
        org.telegram.ui.Components.t91 t91Var = this.f38565a0;
        oe.b bVar = this.f38656s;
        if (t91Var != null) {
            float f11 = 1.0f - bVar.e;
            t91Var.setAlpha(f11);
            org.telegram.ui.Components.t91 t91Var2 = this.f38565a0;
            if (f11 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            t91Var2.setVisibility(i10);
        }
        ig.r0 r0Var = this.f38570b0;
        if (r0Var != null) {
            float f12 = bVar.e;
            r0Var.setAlpha(f12);
            ig.r0 r0Var2 = this.f38570b0;
            if (f12 > 0.0f) {
                i12 = 0;
            }
            r0Var2.setVisibility(i12);
        }
    }

    public final void N4(float f7) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.X3 != f7) {
            boolean z10 = true;
            if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
                z10 = false;
            }
            this.Y3 = z10;
            this.X3 = f7;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.Y3) {
                float f10 = (1.0f - this.X3) * (-AndroidUtilities.dp(40.0f));
                qw qwVar = this.E0;
                if (qwVar != null) {
                    qwVar.setTranslationX(f10);
                }
                ox oxVar = this.X;
                if (oxVar != null) {
                    oxVar.setTranslationX(f10);
                }
                tw twVar = this.G3;
                if (twVar != null && twVar.getFragmentView() != null && !this.f38689y) {
                    this.G3.getFragmentView().setTranslationX(f10);
                    return;
                }
                return;
            }
            float f11 = 1.0f - this.X3;
            float f12 = (-AndroidUtilities.dp(4.0f)) * f11;
            float f13 = 1.0f - (f11 * 0.05f);
            qw qwVar2 = this.E0;
            if (qwVar2 != null) {
                qwVar2.setScaleX(f13);
                this.E0.setScaleY(f13);
                this.E0.setTranslationX(f12);
                this.E0.setPivotX(0.0f);
                this.E0.setPivotY(0.0f);
            }
            ox oxVar2 = this.X;
            if (oxVar2 != null) {
                oxVar2.setTranslationX(f12);
                this.X.setScaleX(f13);
                this.X.setScaleY(f13);
            }
            tw twVar2 = this.G3;
            if (twVar2 != null && twVar2.getFragmentView() != null) {
                if (!this.f38689y) {
                    this.G3.getFragmentView().setScaleX(f13);
                    this.G3.getFragmentView().setScaleY(f13);
                    this.G3.getFragmentView().setTranslationX(f12);
                }
                this.G3.getFragmentView().setPivotX(0.0f);
                this.G3.getFragmentView().setPivotY(0.0f);
            }
        }
    }

    public final void O3(boolean z10) {
        int i10;
        int i11;
        if (this.C0 != null && this.actionBar != null) {
            int i12 = AndroidUtilities.navigationBarHeight;
            int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f38564a);
            if (this.f38565a0 != null) {
                i10 = AndroidUtilities.dp(50.0f);
            } else {
                i10 = 0;
            }
            int i13 = measuredHeight + i10;
            org.telegram.ui.Components.ws wsVar = this.J1;
            if (wsVar != null) {
                i11 = (int) wsVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i14 = i13 + i11;
            jx jxVar = this.C0;
            SparseArray sparseArray = jxVar.h;
            jxVar.W0 = i14;
            jxVar.X0 = i12;
            bi.r1 r1Var = jxVar.f27933a0;
            if (z10) {
                r1Var.t1(0, i14, 0, i12);
            } else {
                r1Var.setPadding(0, i14, 0, i12);
            }
            jxVar.O0.j(jxVar.W0, jxVar.X0, z10);
            org.telegram.ui.Components.qo0 qo0Var = jxVar.f27934b0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qo0Var.getLayoutParams();
            int i15 = marginLayoutParams.topMargin;
            int i16 = jxVar.W0;
            if (i15 != i16 || marginLayoutParams.bottomMargin != jxVar.X0) {
                marginLayoutParams.topMargin = i16;
                marginLayoutParams.bottomMargin = jxVar.X0;
                qo0Var.requestLayout();
            }
            org.telegram.ui.Components.ep0.Q(jxVar.f27940h0, jxVar.f27943k0, jxVar.W0, jxVar.X0, z10);
            org.telegram.ui.Components.ep0.Q(jxVar.m0, jxVar.f27947p0, jxVar.W0, jxVar.X0, z10);
            org.telegram.ui.Components.ep0.Q(jxVar.f27951t0, jxVar.f27954w0, jxVar.W0, jxVar.X0, z10);
            org.telegram.ui.Components.wh0 wh0Var = jxVar.f27949r0;
            int i17 = jxVar.W0;
            int i18 = jxVar.X0;
            wh0Var.setClipToPadding(false);
            org.telegram.ui.Components.r71 r71Var = wh0Var.f34444c;
            wh0Var.J = z10;
            wh0Var.setPadding(0, i17, 0, i18);
            if (z10) {
                r71Var.t1(0, i17, 0, i18);
            } else {
                r71Var.setPadding(0, i17, 0, i18);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) r71Var.getLayoutParams();
            marginLayoutParams2.topMargin = -i17;
            marginLayoutParams2.bottomMargin = -i18;
            wh0Var.J = false;
            org.telegram.ui.Components.co0 co0Var = jxVar.I0;
            if (co0Var != null) {
                co0Var.b(jxVar.W0, jxVar.X0, z10);
            }
            int size = sparseArray.size();
            for (int i19 = 0; i19 < size; i19++) {
                View view = (View) sparseArray.valueAt(i19);
                if (view instanceof h10) {
                    ((h10) view).j(jxVar.W0, jxVar.X0, z10);
                }
            }
            for (int i20 = 0; i20 < jxVar.getChildCount(); i20++) {
                if (jxVar.getChildAt(i20) instanceof h10) {
                    ((h10) jxVar.getChildAt(i20)).j(jxVar.W0, jxVar.X0, z10);
                }
            }
        }
    }

    public final void O4() {
        getContactsController().loadGlobalPrivacySetting();
        org.telegram.ui.Components.y6 y6Var = new org.telegram.ui.Components.y6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.c71(22, this, r0), new ui(r0, 17));
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(getParentActivity(), getResourceProvider());
        e3Var.c(y6Var);
        org.telegram.ui.ActionBar.k3 k3Var = e3Var.f22601a;
        k3Var.show();
        org.telegram.ui.ActionBar.k3[] k3VarArr = {k3Var};
        k3Var.fixNavigationBarKey(org.telegram.ui.ActionBar.y6.f23427h5);
    }

    public final void P3() {
        if (this.J1 != null) {
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, 1.0f);
            this.J1.setAlpha(1.0f);
            this.J1.setScaleX(lerp);
            this.J1.setScaleY(lerp);
            this.J1.setVisibility(0);
        }
    }

    public final boolean P4(org.telegram.ui.Cells.p2 r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.P4(org.telegram.ui.Cells.p2):boolean");
    }

    public boolean Q3() {
        if (this.R0 == 10) {
            return true;
        }
        return false;
    }

    public final void Q4(boolean z10) {
        float f7;
        this.f38575c.a(z10, true);
        if (this.m0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.P3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.P3 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.P3 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            this.m0.setVisibility(0);
        } else {
            this.m0.setSelected(false);
            Drawable background = this.m0.getBackground();
            if (background != null) {
                background.setState(StateSet.NOTHING);
                background.jumpToCurrentState();
            }
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.ActionBar.w0 w0Var = this.m0;
        Property property = View.ALPHA;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(w0Var, property, f7));
        this.P3.playTogether(arrayList);
        this.P3.addListener(new zw(this, z10, 1));
        this.P3.start();
    }

    public final void R3() {
        if (AndroidUtilities.isTablet()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.g(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                jx jxVar = this.C0;
                if (jxVar != null) {
                    jxVar.f27936d0.Q(this.W1, tLObject);
                }
                this.X1 = null;
                return;
            }
            return;
        }
        this.V1 = true;
    }

    public final void R4() {
        if (!this.A0 && getMessagesController().dialogFiltersLoaded && getMessagesController().showFiltersTooltip && this.f38693z0 != null && getMessagesController().getDialogFilters().isEmpty() && !this.isPaused && getUserConfig().filtersLoaded && !this.inPreviewMode) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("filterhint", false)) {
                globalMainSettings.edit().putBoolean("filterhint", true).apply();
                AndroidUtilities.runOnUIThread(new sv(this, 11), 1000L);
            }
        }
    }

    public final void S3() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.f22774n0) {
            kVar.g(true);
            this.f38648q3 = false;
            e5(true, true);
        }
    }

    public final void S4() {
        LaunchActivity launchActivity;
        boolean q5;
        int i10;
        int i11;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        LaunchActivity launchActivity2;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        float f7;
        CharSequence charSequence;
        org.telegram.ui.Components.c71 c71Var;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.g1 g1Var;
        int i12;
        int i13;
        int w02;
        int w03;
        int w04;
        CharSequence charSequence2;
        int i14;
        int w05;
        org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(this, this.f38617k0);
        int i15 = org.telegram.ui.ActionBar.y6.A8;
        H.S(getThemedColor(i15), getThemedColor(i15));
        H.f29868s = 8;
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) parentActivity;
        } else {
            launchActivity = null;
        }
        float f10 = 64.0f;
        int i16 = 0;
        if (this.Y2 != 0) {
            if (ChatObject.hasAdminRights(this.Z2)) {
                H.c(R.drawable.msg_customize, LocaleController.getString(R.string.CommunityMenuSettings), new cv(this, 3), false);
                H.k();
            }
            H.i(new cv(this, 6), LocaleController.getString(R.string.CommunityMenuShowAsOneChat), this.Z2.collapsed_in_dialogs);
            H.i(new cv(this, 7), LocaleController.getString(R.string.CommunityMenuShowAsSeparateChats), !this.Z2.collapsed_in_dialogs);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        } else if (m4()) {
            H.c(R.drawable.msg_customize, LocaleController.getString(R.string.ArchiveSettings), new cv(this, 8), false);
            H.c(R.drawable.msg_help, LocaleController.getString(R.string.HowDoesItWork), new cv(this, 9), false);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        } else {
            org.telegram.ui.ActionBar.u6 u6Var2 = this.resourceProvider;
            if (u6Var2 != null) {
                q5 = u6Var2.a();
            } else {
                q5 = org.telegram.ui.ActionBar.y6.I.q();
            }
            if (q5) {
                i10 = R.drawable.menu_day_mode_24;
            } else {
                i10 = R.drawable.menu_night_mode_24;
            }
            if (q5) {
                i11 = R.string.SwitchThemeToDay;
            } else {
                i11 = R.string.SwitchThemeToNight;
            }
            H.c(i10, LocaleController.getString(i11), new cv(this, 10), false);
            H.k();
            H.c(R.drawable.msg_contacts, LocaleController.getString(R.string.Contacts), new cv(this, 11), false);
            H.c(R.drawable.msg_calls, LocaleController.getString(R.string.Calls), new cv(this, 12), false);
            H.k();
            H.c(R.drawable.outline_groups_24, LocaleController.getString(R.string.NewGroup), new cv(this, 13), false);
            H.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.SavedMessages), new cv(this, 14), false);
            ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
            if (applicationLoader != null) {
                applicationLoader.addItemOptions(H);
            }
            if (getMessagesController().config.walletAvailable.get()) {
                H.c(R.drawable.ic_gram, LocaleController.getString(R.string.WalletAttachMoney), new cv(this, 4), false);
            } else {
                TLRPC.TL_attachMenuBots attachMenuBots = MediaDataController.getInstance(UserConfig.selectedAccount).getAttachMenuBots();
                if (launchActivity != null && attachMenuBots != null && (arrayList = attachMenuBots.bots) != null && !arrayList.isEmpty()) {
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList3 = attachMenuBots.bots;
                    int size = arrayList3.size();
                    int i17 = 0;
                    while (i17 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList3.get(i17);
                        i17++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_side_menu) {
                            gv gvVar = new gv(this, tL_attachMenuBot2, launchActivity, 0);
                            org.telegram.ui.Components.c71 c71Var2 = new org.telegram.ui.Components.c71(21, this, tL_attachMenuBot2);
                            org.telegram.ui.ActionBar.u6 u6Var3 = H.d;
                            if (H.e != null) {
                                int i18 = org.telegram.ui.ActionBar.y6.F8;
                                int i19 = org.telegram.ui.ActionBar.y6.E8;
                                f7 = f10;
                                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(0, H.e, H.d, false, false);
                                g1Var2.setPadding(AndroidUtilities.dp(18.0f), i16, AndroidUtilities.dp(18.0f), i16);
                                if (tL_attachMenuBot2.side_menu_disclaimer_needed) {
                                    charSequence = org.telegram.ui.Cells.v8.b(tL_attachMenuBot2.short_name);
                                } else {
                                    charSequence = tL_attachMenuBot2.short_name;
                                }
                                TLRPC.TL_attachMenuBotIcon sideAttachMenuBotIcon = MediaDataController.getSideAttachMenuBotIcon(tL_attachMenuBot2);
                                if (sideAttachMenuBotIcon != null) {
                                    launchActivity2 = launchActivity;
                                    arrayList2 = arrayList3;
                                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(sideAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.y6.f23338c7, 1.0f);
                                    if (svgThumb != null) {
                                        Integer num = H.f29855k0;
                                        if (num != null) {
                                            w05 = num.intValue();
                                        } else {
                                            w05 = org.telegram.ui.ActionBar.y6.w0(i18, u6Var3);
                                        }
                                        charSequence2 = charSequence;
                                        svgThumb.setColorFilter(new PorterDuffColorFilter(w05, PorterDuff.Mode.SRC_IN));
                                    } else {
                                        charSequence2 = charSequence;
                                    }
                                    c71Var = c71Var2;
                                    g1Var = g1Var2;
                                    i13 = i19;
                                    i12 = i18;
                                    u6Var = u6Var3;
                                    g1Var.k(charSequence2, ImageLocation.getForDocument(sideAttachMenuBotIcon.icon), "24_24", svgThumb, tL_attachMenuBot2);
                                    org.telegram.ui.Components.y9 y9Var = g1Var.h;
                                    if (y9Var != null) {
                                        if (LocaleController.isRTL) {
                                            i14 = 5;
                                        } else {
                                            i14 = 3;
                                        }
                                        y9Var.setLayoutParams(org.telegram.ui.Components.gb1.i(24, 24, i14 | 16));
                                    }
                                } else {
                                    launchActivity2 = launchActivity;
                                    arrayList2 = arrayList3;
                                    c71Var = c71Var2;
                                    u6Var = u6Var3;
                                    CharSequence charSequence3 = charSequence;
                                    g1Var = g1Var2;
                                    i12 = i18;
                                    i13 = i19;
                                    g1Var.j(charSequence3, R.drawable.msg_bot, null);
                                }
                                Integer num2 = H.f29853j0;
                                if (num2 == null && H.f29855k0 == null) {
                                    g1Var.c(i13, i12);
                                } else {
                                    if (num2 != null) {
                                        w02 = num2.intValue();
                                    } else {
                                        w02 = org.telegram.ui.ActionBar.y6.w0(i13, u6Var);
                                    }
                                    Integer num3 = H.f29855k0;
                                    if (num3 != null) {
                                        w03 = num3.intValue();
                                    } else {
                                        w03 = org.telegram.ui.ActionBar.y6.w0(i12, u6Var);
                                    }
                                    g1Var.d(w02, w03);
                                }
                                Integer num4 = H.f29855k0;
                                if (num4 != null) {
                                    w04 = num4.intValue();
                                } else {
                                    w04 = org.telegram.ui.ActionBar.y6.w0(i12, u6Var);
                                }
                                g1Var.setIconColorImage(w04);
                                Integer num5 = H.f29857l0;
                                if (num5 != null) {
                                    g1Var.setSelectorColor(num5.intValue());
                                } else {
                                    g1Var.h(0.12f, i13);
                                }
                                g1Var.setOnClickListener(new org.telegram.ui.Components.ga(20, H, gvVar));
                                g1Var.setOnLongClickListener(new di.l2(3, H, c71Var));
                                int i20 = H.S;
                                if (i20 > 0) {
                                    g1Var.setMinimumWidth(AndroidUtilities.dp(i20));
                                    H.r(g1Var, org.telegram.ui.Components.gb1.r(H.S, -2));
                                } else {
                                    H.r(g1Var, org.telegram.ui.Components.gb1.r(-1, -2));
                                }
                                launchActivity = launchActivity2;
                                arrayList3 = arrayList2;
                                f10 = f7;
                                i16 = 0;
                            }
                        }
                        launchActivity2 = launchActivity;
                        arrayList2 = arrayList3;
                        f7 = f10;
                        launchActivity = launchActivity2;
                        arrayList3 = arrayList2;
                        f10 = f7;
                        i16 = 0;
                    }
                }
            }
            float f11 = f10;
            if (getUserConfig().showCallsTab) {
                H.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), new cv(this, 5), false);
            }
            org.telegram.ui.ActionBar.g1 g1Var3 = this.f38635o0;
            if (g1Var3 != null) {
                org.telegram.ui.ActionBar.f7.V(g1Var3.f22637b, org.telegram.ui.ActionBar.y6.f23309ai, getResourceProvider());
                this.f38635o0.setOnClickListener(new org.telegram.ui.Components.k51(11, this, H));
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", "");
                if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty())) {
                    H.k();
                    H.d(this.f38635o0);
                }
            }
            H.Z();
            H.X(-AndroidUtilities.dp(f11));
        }
    }

    @Override
    public final boolean T(MotionEvent motionEvent, boolean z10) {
        tw twVar;
        bi.cc ccVar;
        qx qxVar;
        boolean z11;
        boolean z12;
        if (!this.f38648q3 && (((twVar = this.G3) == null || !twVar.c()) && (((ccVar = this.K0) == null || ccVar.getVisibility() != 0) && ((qxVar = this.f38693z0) == null || !qxVar.f32377n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                qx qxVar2 = this.f38693z0;
                if (qxVar2 != null && qxVar2.getTabsCount() >= 2 && this.f38693z0.getCurrentTabId() != this.f38693z0.getFirstTabId()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                qx qxVar3 = this.f38693z0;
                if (qxVar3 != null && qxVar3.getTabsCount() >= 2 && this.f38693z0.getCurrentTabId() != this.f38693z0.getLastTabId()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                SharedConfig.getChatSwipeAction(this.currentAccount);
                if (z10) {
                    if (!z12 || z11) {
                    }
                } else {
                    return z11;
                }
            }
            return true;
        }
        return false;
    }

    public final void T3(String str) {
        if (this.actionBar.a(str)) {
            return;
        }
        org.telegram.ui.ActionBar.z i10 = this.actionBar.i(str);
        boolean z10 = this.W;
        ArrayList arrayList = this.f38608i1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.f38598g1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f38598g1.setImageDrawable(new org.telegram.ui.ActionBar.j2(true));
            org.telegram.ui.ActionBar.f7.t(this.f38598g1, org.telegram.ui.ActionBar.y6.f23750y8, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.f38598g1;
            int i11 = org.telegram.ui.ActionBar.y6.f23769z8;
            org.telegram.ui.ActionBar.f7.R(imageView2, org.telegram.ui.ActionBar.y6.g0(getThemedColor(i11), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i11), getResourceProvider());
            this.f38598g1.setOnClickListener(new hv(this, 7));
            i10.addView(this.f38598g1, org.telegram.ui.Components.gb1.u(54, 54, 16));
            arrayList.add(this.f38598g1);
        }
        NumberTextView numberTextView = new NumberTextView(i10.getContext());
        this.f38603h1 = numberTextView;
        int i12 = 18;
        numberTextView.setTextSize(18);
        this.f38603h1.setTypeface(AndroidUtilities.bold());
        this.f38603h1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23750y8));
        NumberTextView numberTextView2 = this.f38603h1;
        if (!this.W) {
            i12 = 72;
        }
        i10.addView(numberTextView2, org.telegram.ui.Components.gb1.q(1.0f, 0, -1, i12, 0, 0));
        this.f38603h1.setOnTouchListener(new ei.d(2));
        this.f38618k1 = i10.g(100, R.drawable.msg_pin, AndroidUtilities.dp(48.0f));
        this.l1 = i10.g(104, R.drawable.msg_mute, AndroidUtilities.dp(48.0f));
        this.f38625m1 = i10.g(107, R.drawable.msg_archive, AndroidUtilities.dp(48.0f));
        this.f38613j1 = i10.h(102, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(48.0f));
        org.telegram.ui.ActionBar.w0 h = i10.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(48.0f));
        i10.addView(new View(getParentActivity()), org.telegram.ui.Components.gb1.r(5, -1));
        this.f38646q1 = h.e(105, R.drawable.msg_archive, LocaleController.getString(R.string.Archive));
        this.f38631n1 = h.e(108, R.drawable.msg_pin, LocaleController.getString(R.string.DialogPin));
        this.f38636o1 = h.e(109, R.drawable.msg_addfolder, LocaleController.getString(R.string.FilterAddTo));
        this.f38641p1 = h.e(110, R.drawable.msg_removefolder, LocaleController.getString(R.string.FilterRemoveFrom));
        this.f38658s1 = h.e(101, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
        this.f38652r1 = h.e(103, R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory));
        this.f38663t1 = h.e(106, R.drawable.msg_block, LocaleController.getString(R.string.BlockUser));
        this.l1.setOnLongClickListener(new nv(this, 1));
        arrayList.add(this.f38618k1);
        arrayList.add(this.f38625m1);
        arrayList.add(this.l1);
        arrayList.add(this.f38613j1);
        arrayList.add(h);
        b5(false);
    }

    public final void T4() {
        if (this.S3 == null) {
            for (String str : getMessagesController().pendingSuggestions) {
                if ("AUTOARCHIVE_POPULAR".equals(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.HideNewChatsAlertTitle);
                    alertDialog$Builder.f22368a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.HideNewChatsAlertText));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.GoToSettings), new iv(this, 6));
                    showDialog(alertDialog$Builder.f22368a, new dv(this, 1));
                    this.S3 = str;
                    return;
                }
            }
        }
    }

    public final void U3() {
        int i10;
        jx jxVar = this.C0;
        if ((jxVar != null && jxVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        if (this.f38632n2 != null) {
            i10 = 2;
        } else if (!this.f38623l2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        jx jxVar2 = new jx(this, getParentActivity(), this, i10, this.R0, this.W2, this.Y2, new ix(this));
        this.C0 = jxVar2;
        this.glassEngine.c(jxVar2);
        ((tx) this.fragmentView).addView(this.C0, this.B0);
        jx jxVar3 = this.C0;
        jxVar3.f27936d0.U = new lx(this);
        jxVar3.f27943k0.setOnItemClickListener(new iv(this, 1));
        this.C0.f27947p0.setOnItemClickListener(new iv(this, 2));
        this.C0.f27954w0.setOnItemClickListener(new lv(this, 0));
        this.C0.f27947p0.setOnItemLongClickListener(new iv(this, 3));
        this.C0.f27933a0.setOnItemClickListener(new iv(this, 4));
        this.C0.f27933a0.setOnItemLongClickListener(new ix(this));
        this.C0.setFilteredSearchViewDelegate(new iv(this, 5));
        this.C0.setAlpha(0.0f);
        this.C0.setScaleX(1.05f);
        this.C0.setScaleY(1.05f);
        this.C0.setVisibility(8);
        this.C0.setBlurredBackgroundDrawableFactory(this.f38644p4);
    }

    public final void U4(long j10, View view) {
        ArrayList<TLRPC.Dialog> Z3;
        int i10;
        p3(j10, view);
        boolean q5 = this.actionBar.q();
        ArrayList arrayList = this.I2;
        boolean z10 = true;
        if (q5) {
            if (arrayList.isEmpty()) {
                j4(true);
                return;
            }
        } else {
            if (this.f38648q3) {
                T3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.k5)) {
                    this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
                }
            } else {
                T3(null);
            }
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6));
            this.actionBar.K(null, null);
            int i11 = this.f38586e0[0].f37919s;
            if ((i11 != 7 && i11 != 8) || (this.actionBar.q() && !this.actionBar.r(null))) {
                Z3 = getMessagesController().getDialogs(this.W2);
            } else {
                Z3 = Z3(this.currentAccount, this.f38586e0[0].f37919s, this.W2, this.S1);
            }
            int size = Z3.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.Dialog dialog = Z3.get(i13);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (o4(dialog)) {
                        i12++;
                    } else if (!getMessagesController().isPromoDialog(dialog.f22031id, false)) {
                        break;
                    }
                }
            }
            if (i12 > 1) {
                if (this.f38586e0 != null) {
                    int i14 = 0;
                    while (true) {
                        ay[] ayVarArr = this.f38586e0;
                        if (i14 >= ayVarArr.length) {
                            break;
                        }
                        ayVarArr[i14].d.H = true;
                        i14++;
                    }
                }
                q5(MessagesController.UPDATE_MASK_REORDER, true);
            }
            if (!this.f38648q3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f38608i1;
                    if (i15 >= arrayList3.size()) {
                        break;
                    }
                    View view2 = (View) arrayList3.get(i15);
                    view2.setPivotY(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2);
                    AndroidUtilities.clearDrawableAnimation(view2);
                    arrayList2.add(ObjectAnimator.ofFloat(view2, View.SCALE_Y, 0.1f, 1.0f));
                    i15++;
                }
                animatorSet.playTogether(arrayList2);
                animatorSet.setDuration(200L);
                animatorSet.start();
            }
            ValueAnimator valueAnimator = this.f38675v3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f38675v3 = ValueAnimator.ofFloat(this.f38670u3, 1.0f);
            int i16 = 0;
            while (true) {
                ay[] ayVarArr2 = this.f38586e0;
                if (i16 >= ayVarArr2.length) {
                    break;
                }
                ay ayVar = ayVarArr2[i16];
                if (ayVar != null) {
                    ayVar.f37913a.I0(true);
                }
                i16++;
            }
            if (this.K) {
                i10 = 81;
            } else {
                i10 = 0;
            }
            float max = Math.max(0.0f, AndroidUtilities.dp(i10 + 48) + this.N);
            if (max != 0.0f) {
                this.P = (int) max;
                this.fragmentView.requestLayout();
            }
            this.f38675v3.addUpdateListener(new jv(this, max, 0));
            this.f38675v3.addListener(new cx(this, max, 1));
            this.f38675v3.setInterpolator(org.telegram.ui.Components.ds.f27586f);
            this.f38675v3.setDuration(200L);
            this.f38675v3.start();
            qx qxVar = this.f38693z0;
            if (qxVar != null) {
                qxVar.b(org.telegram.ui.ActionBar.y6.Gh, org.telegram.ui.ActionBar.y6.Fh, org.telegram.ui.ActionBar.y6.Eh, org.telegram.ui.ActionBar.y6.Hh, org.telegram.ui.ActionBar.y6.f23713w8);
            }
            org.telegram.ui.ActionBar.j2 j2Var = this.f38587e1;
            if (j2Var != null) {
                j2Var.c(1.0f, true);
            }
            z10 = false;
        }
        b5(false);
        this.f38603h1.a(arrayList.size(), z10);
    }

    public final void V3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.f38690y0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                undoViewArr[i10] = new dx(this, parentActivity);
                FrameLayout.LayoutParams h = org.telegram.ui.Components.gb1.h(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                h.bottomMargin = this.f38601g4 + this.f38611i4 + h.bottomMargin;
                UndoView undoView = undoViewArr[i10];
                int i11 = this.f38684x0 + 1;
                this.f38684x0 = i11;
                ((tx) this.fragmentView).addView(undoView, i11, h);
            }
        }
    }

    public final void V4(long j10, View view) {
        String str;
        org.telegram.ui.Components.qc J;
        int i10 = -this.M3;
        this.M3 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (j10 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)));
        } else {
            str = "";
        }
        if (getMessagesController().premiumFeaturesBlocked()) {
            J = org.telegram.ui.Components.wc.b0(this).R(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
        } else {
            J = org.telegram.ui.Components.wc.b0(this).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new cv(this, 22));
        }
        J.j();
    }

    public final void W3(final long j10, final long j11, boolean z10, final af1 af1Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String string;
        String formatStringSimple;
        String string2;
        String str;
        String str2;
        TLRPC.TL_forumTopic findTopic;
        if (x3(j10)) {
            int i10 = this.R0;
            if (i10 != 11 && i10 != 12 && i10 != 13) {
                if (z10 && ((this.f38594f2 != null && this.f38599g2 != null) || this.f38604h2 != null)) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        if (DialogObject.isEncryptedDialog(j10)) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(org.telegram.messenger.t.m(getMessagesController(), j10).user_id));
                            if (user2 != null) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f38594f2, UserObject.getUserName(user2));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                return;
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            if (j10 == getUserConfig().getClientUserId()) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f38599g2, LocaleController.getString(R.string.SavedMessages));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j10));
                                if (user3 != null && this.f38594f2 != null) {
                                    str = LocaleController.getString(R.string.SendMessageTitle);
                                    str2 = LocaleController.formatStringSimple(this.f38594f2, UserObject.getUserName(user3));
                                    string2 = LocaleController.getString(R.string.Send);
                                } else {
                                    return;
                                }
                            }
                        } else {
                            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-j10));
                            if (chat2 != null) {
                                String str3 = chat2.title;
                                if (j11 != 0 && (findTopic = getMessagesController().getTopicsController().findTopic(chat2.f22027id, j11)) != null) {
                                    str3 = ((Object) str3) + " " + findTopic.title;
                                }
                                if (this.f38604h2 != null) {
                                    string = LocaleController.getString(R.string.AddToTheGroupAlertTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f38604h2, str3);
                                    string2 = LocaleController.getString(R.string.Add);
                                } else {
                                    string = LocaleController.getString(R.string.SendMessageTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f38599g2, str3);
                                    string2 = LocaleController.getString(R.string.Send);
                                }
                                String str4 = formatStringSimple;
                                str = string;
                                str2 = str4;
                            } else {
                                return;
                            }
                        }
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                        e2Var.R = str;
                        e2Var.T = AndroidUtilities.replaceTags(str2);
                        alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.b2() {
                            @Override
                            public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i11) {
                                cy.this.W3(j10, j11, false, af1Var);
                            }
                        });
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        if (showDialog(e2Var) == null) {
                            e2Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 15) {
                    Runnable i0Var = new a3.i0(this, j10, new a3.h0(this, j10, j11, af1Var, 14), 26);
                    if (j10 < 0) {
                        Y4(getMessagesController().getChat(Long.valueOf(-j10)), i0Var, null);
                        return;
                    }
                    TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(j10));
                    TLRPC.User user5 = getMessagesController().getUser(Long.valueOf(this.H));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, UserObject.getFirstName(user4), UserObject.getFirstName(user5));
                    org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22368a;
                    e2Var2.R = formatString;
                    e2Var2.T = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, UserObject.getFirstName(user4), UserObject.getFirstName(user5))));
                    alertDialog$Builder2.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new qt(i0Var, 3));
                    alertDialog$Builder2.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new org.telegram.ui.Components.voip.c1(4));
                    showDialog(e2Var2);
                    return;
                } else if (this.C2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j10, j11));
                    if (this.C2.v(this, arrayList, null, false, this.J2, this.K2, this.L2, af1Var) && this.f38609i2) {
                        this.C2 = null;
                        return;
                    }
                    return;
                } else {
                    finishFragment();
                    return;
                }
            }
            if (DialogObject.isUserDialog(j10)) {
                TLRPC.User user6 = getMessagesController().getUser(Long.valueOf(j10));
                if (!user6.mutual_contact) {
                    UndoView g42 = g4();
                    if (g42 != null) {
                        g42.j(45, j10, null);
                        return;
                    }
                    return;
                }
                user = user6;
                chat = null;
            } else {
                TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(-j10));
                if (ChatObject.hasAdminRights(chat3) && ChatObject.canChangeChatInfo(chat3)) {
                    chat = chat3;
                    user = null;
                } else {
                    UndoView g43 = g4();
                    if (g43 != null) {
                        g43.j(46, j10, null);
                        return;
                    }
                    return;
                }
            }
            org.telegram.ui.ActionBar.e2 e2Var3 = new org.telegram.ui.ActionBar.e2(getParentActivity(), 3, null);
            TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
            tL_messages_checkHistoryImportPeer.peer = getMessagesController().getInputPeer(j10);
            getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new bi.g4(this, e2Var3, user, chat, j10, tL_messages_checkHistoryImportPeer));
            try {
                e2Var3.r(300L);
            } catch (Exception unused) {
            }
        }
    }

    public final void W4(boolean r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.W4(boolean, boolean, boolean, boolean):void");
    }

    public final void X3(long j10, boolean z10) {
        if (this.f38586e0 != null) {
            int i10 = 0;
            while (true) {
                ay[] ayVarArr = this.f38586e0;
                if (i10 < ayVarArr.length) {
                    int childCount = ayVarArr[i10].f37913a.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 < childCount) {
                            View childAt = this.f38586e0[i10].f37913a.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.p2) {
                                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) childAt;
                                if (p2Var.getDialogId() == j10) {
                                    p2Var.U(z10, true);
                                    break;
                                }
                            }
                            i11++;
                        }
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void X4() {
        int i10;
        int i11;
        Long l4;
        if (this.M0 == null && !SharedConfig.appLocked && (!this.K || this.E0.g())) {
            t51[] t51VarArr = new t51[1];
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            org.telegram.ui.ActionBar.b6 titleTextView = this.actionBar.getTitleTextView();
            if (titleTextView != null && titleTextView.getRightDrawable() != null) {
                this.E3.f();
                Drawable drawable = this.E3.f32096f[0];
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(titleTextView.getRightDrawable().getBounds());
                rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
                int dp = (-(this.actionBar.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                i10 = AndroidUtilities.dp(4.0f) + (rect.centerX() - AndroidUtilities.dp(16.0f));
                org.telegram.ui.Cells.o oVar = this.F3;
                if (oVar != null) {
                    oVar.b(rect.centerX(), rect.centerY());
                }
                i11 = dp;
            } else {
                i10 = 0;
                i11 = 0;
            }
            uw uwVar = new uw(this, this, getParentActivity(), Integer.valueOf(i10), getResourceProvider(), t51VarArr);
            if (currentUser != null && DialogObject.getEmojiStatusUntil(currentUser.emoji_status) > 0) {
                uwVar.setExpireDateHint(DialogObject.getEmojiStatusUntil(currentUser.emoji_status));
            }
            Long l10 = this.C3;
            if (l10 != null) {
                uwVar.setSelected(l10);
            } else {
                Drawable drawable2 = this.E3.f32096f[0];
                if (drawable2 instanceof org.telegram.ui.Components.t5) {
                    l4 = Long.valueOf(((org.telegram.ui.Components.t5) drawable2).i());
                } else {
                    l4 = null;
                }
                uwVar.setSelected(l4);
            }
            uwVar.setSaveState(1);
            uwVar.y(this.E3, titleTextView);
            vw vwVar = new vw(this, uwVar);
            this.M0 = vwVar;
            t51VarArr[0] = vwVar;
            vwVar.showAsDropDown(this.actionBar, AndroidUtilities.dp(16.0f), i11, 48);
            t51VarArr[0].b();
        }
    }

    public final void Y4(org.telegram.tgnet.TLRPC.Chat r14, java.lang.Runnable r15, java.lang.Runnable r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.Y4(org.telegram.tgnet.TLRPC$Chat, java.lang.Runnable, java.lang.Runnable):void");
    }

    public final java.util.ArrayList Z3(int r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.Z3(int, int, int, boolean):java.util.ArrayList");
    }

    public final void Z4(boolean z10) {
        ay[] ayVarArr;
        char c10;
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ayVarArr = this.f38586e0;
            if (i12 >= ayVarArr.length) {
                break;
            }
            ayVarArr[i12].f37913a.C0();
            i12++;
        }
        if (z10 && ayVarArr.length > 1) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        int i13 = ayVarArr[c10].h;
        if (i13 >= 0 && i13 < getMessagesController().getDialogFilters().size()) {
            MessagesController.DialogFilter dialogFilter = getMessagesController().getDialogFilters().get(this.f38586e0[c10].h);
            if (dialogFilter.isDefault()) {
                ay ayVar = this.f38586e0[c10];
                ayVar.f37919s = this.R0;
                wx wxVar = ayVar.f37913a;
                int i14 = wx.C3;
                wxVar.G1();
            } else {
                ay[] ayVarArr2 = this.f38586e0;
                if (ayVarArr2[c10 ^ 1].f37919s == 7) {
                    ayVarArr2[c10].f37919s = 8;
                } else {
                    ayVarArr2[c10].f37919s = 7;
                }
                ayVarArr2[c10].f37913a.setScrollEnabled(true);
                MessagesController messagesController = getMessagesController();
                if (this.f38586e0[c10].f37919s == 8) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                messagesController.selectDialogFilter(dialogFilter, i10);
            }
            ay[] ayVarArr3 = this.f38586e0;
            if (ayVarArr3.length > 1) {
                ayVarArr3[1].E = dialogFilter.locked;
            }
            ay ayVar2 = ayVarArr3[c10];
            gw gwVar = ayVar2.d;
            gwVar.h = ayVar2.f37919s;
            gwVar.l();
            ay ayVar3 = this.f38586e0[c10];
            cw cwVar = ayVar3.f37915c;
            if (ayVar3.f37919s == 0 && h4() && this.f38586e0[c10].v == 2) {
                i11 = 1;
            }
            cwVar.h1(i11, (int) this.N);
            z3(this.f38586e0[c10]);
        }
    }

    public final float a4(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f - this.f38569b.e;
        } else {
            f7 = 1.0f;
        }
        return f7 * (1.0f - d4()) * this.f38650r.e;
    }

    public final void a5() {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        int i10;
        n31 n31Var = this.Z;
        if (n31Var != null && n31Var.getVisibility() != 8) {
            f7 = this.Z.getMeasuredHeight();
        } else {
            f7 = 0.0f;
        }
        if (this.K) {
            f10 = AndroidUtilities.dp(81.0f);
        } else {
            f10 = 0.0f;
        }
        if (this.K) {
            float f19 = this.N;
            float f20 = this.f38685x1;
            f11 = (f7 * f20) + c3.h0.z(1.0f, f20, f10, f19);
            f12 = this.f38687x3;
        } else {
            f11 = (f7 * this.f38685x1) + this.N;
            f12 = this.f38687x3;
        }
        float f21 = f11 + f12 + this.T;
        ox oxVar = this.X;
        if (oxVar != null && oxVar.getVisibility() == 0) {
            f13 = this.X.getAlpha();
        } else {
            f13 = 0.0f;
        }
        float dp = AndroidUtilities.dp(4.0f) * f13;
        qx qxVar = this.f38693z0;
        if (qxVar != null) {
            qxVar.setTranslationY(f21 - dp);
            f15 = this.f38693z0.getAlpha();
            f16 = AndroidUtilities.dp(43.0f) * f15;
            f14 = f21 + f16;
        } else {
            f14 = f21;
            f15 = 0.0f;
            f16 = 0.0f;
        }
        org.telegram.ui.Components.ws wsVar = this.J1;
        if (wsVar != null) {
            float f22 = f14 - dp;
            int i11 = -AndroidUtilities.dp(3.0f);
            if (this.f38565a0 == null) {
                i10 = AndroidUtilities.dp(44.0f);
            } else {
                i10 = 0;
            }
            wsVar.setTranslationY(AndroidUtilities.lerp(f22, i11 - i10, this.f38569b.e));
            f17 = this.J1.getMetadata().f19343c.f19351a;
            f18 = this.J1.c(0.0f);
        } else {
            f17 = 0.0f;
            f18 = 0.0f;
        }
        org.telegram.ui.Components.vs vsVar = this.K1;
        if (vsVar != null) {
            vsVar.setTranslationY(f21 - dp);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f), Math.min(f17, f15));
            org.telegram.ui.Components.vs vsVar2 = this.K1;
            float min = Math.min(AndroidUtilities.dp(40.0f), (f18 + f16) - lerp);
            Matrix matrix = vsVar2.f34255b;
            if (vsVar2.e != lerp || vsVar2.f34257f != min) {
                vsVar2.e = lerp;
                vsVar2.f34257f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, lerp);
                LinearGradient linearGradient = vsVar2.f34256c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                vsVar2.invalidate();
            }
            this.K1.setAlpha(Math.max(f15, f17));
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ik));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.hk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.mk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.lk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.kk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.jk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23349ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23413g8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Si));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Vd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23395f9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23414g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23523m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.il));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23748y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23378e9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23359d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23340c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.M7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.N7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23431h9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23543n9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23505l9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23563o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23468j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23487k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23319b8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23300a8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Z7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Y7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.X7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.W7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.V7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.K7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23318b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23580p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23485k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.zj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Z5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23770z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23751y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23714w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23695v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23676u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23657t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23637s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23617r9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23583p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23451i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23320b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23301a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23357d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Hh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G8));
    }

    public final int b4() {
        if (this.K) {
            return AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(81.0f);
        }
        return AndroidUtilities.dp(48.0f);
    }

    public final void b5(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.b5(boolean):void");
    }

    public final int c4() {
        if (this.K) {
            return AndroidUtilities.dp(81.0f);
        }
        return 0;
    }

    public final void c5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.c5():void");
    }

    @Override
    public final boolean canBeginSlide() {
        qx qxVar;
        if (!this.G3.c()) {
            if (this.R0 == 3 && (qxVar = this.f38693z0) != null && qxVar.getVisibility() == 0 && this.f38693z0.K > 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean closeLastFragment() {
        if (this.G3.c()) {
            this.G3.a();
            jx jxVar = this.C0;
            if (jxVar != null) {
                jxVar.S();
                return true;
            }
            return true;
        }
        return super.closeLastFragment();
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.Components.b8 b8Var = new org.telegram.ui.Components.b8(this, context, this.resourceProvider, 3);
        b8Var.setAllowOverlayTitle(true);
        b8Var.G0 = true;
        if (b8Var.F0 == null) {
            di.i4 i4Var = new di.i4(b8Var.getContext(), 5);
            b8Var.F0 = i4Var;
            b8Var.addView(i4Var);
        }
        org.telegram.ui.ActionBar.f7.m(b8Var, 3, org.telegram.ui.ActionBar.y6.f23656t8, getResourceProvider());
        org.telegram.ui.ActionBar.f7.a(b8Var, org.telegram.ui.ActionBar.y6.f23769z8, getResourceProvider(), true);
        org.telegram.ui.ActionBar.f7.m(b8Var, 1, org.telegram.ui.ActionBar.y6.f23694v8, getResourceProvider());
        org.telegram.ui.ActionBar.f7.b(b8Var, org.telegram.ui.ActionBar.y6.f23750y8, getResourceProvider(), true);
        if (b8Var.f22779p1 == null) {
            di.k kVar = new di.k(b8Var, b8Var.getContext(), b8Var.J0, b8Var.O0);
            b8Var.f22779p1 = kVar;
            kVar.setClipChildren(false);
            b8Var.addView(b8Var.f22779p1);
        }
        b8Var.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        b8Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(3.0f));
        if (!this.inPreviewMode && (!AndroidUtilities.isTablet() || this.W2 == 0 || m4())) {
            return b8Var;
        }
        b8Var.setOccupyStatusBar(false);
        return b8Var;
    }

    @Override
    public final android.view.View createView(android.content.Context r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.createView(android.content.Context):android.view.View");
    }

    public final float d4() {
        tw twVar = this.G3;
        if (twVar != null && twVar.c()) {
            return this.G3.e;
        }
        return 0.0f;
    }

    public final void d5() {
        bi.r1 r1Var;
        wx wxVar;
        boolean z10;
        int i10;
        try {
            jw jwVar = this.B1;
            if (jwVar != null && jwVar.getEditField() != null) {
                this.B1.getEditField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.y6.Wd));
            }
            NumberTextView numberTextView = this.f38603h1;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23750y8));
            }
            qx qxVar = this.f38693z0;
            int i11 = 0;
            if (qxVar != null && (qxVar.getSelectorDrawable() instanceof GradientDrawable)) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null && kVar.q()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                GradientDrawable gradientDrawable = (GradientDrawable) this.f38693z0.getSelectorDrawable();
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.y6.Gh;
                } else {
                    i10 = org.telegram.ui.ActionBar.y6.K8;
                }
                gradientDrawable.setColor(getThemedColor(i10));
                this.f38693z0.invalidate();
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                if (this.W2 != 0 || this.Y2 != 0) {
                    kVar2.D(getThemedColor(org.telegram.ui.ActionBar.y6.Q8), false);
                    this.actionBar.D(getThemedColor(org.telegram.ui.ActionBar.y6.R8), true);
                }
                if (this.actionBar.q()) {
                    this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6));
                }
                j5();
            }
            if (this.f38586e0 != null) {
                while (true) {
                    ay[] ayVarArr = this.f38586e0;
                    if (i11 >= ayVarArr.length) {
                        break;
                    }
                    ay ayVar = ayVarArr[i11];
                    if (ayVar != null && (wxVar = ayVar.f37913a) != null) {
                        wxVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6));
                    }
                    i11++;
                }
            }
            jx jxVar = this.C0;
            if (jxVar != null && (r1Var = jxVar.f27933a0) != null) {
                r1Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6));
            }
            li.w1 w1Var = this.C1;
            if (w1Var != null) {
                w1Var.setScrimViewBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6));
            }
            fi.v3 v3Var = this.f38640p0;
            if (v3Var != null) {
                v3Var.h(getThemedColor(org.telegram.ui.ActionBar.y6.Fi));
            }
            fi.v3 v3Var2 = this.f38645q0;
            if (v3Var2 != null) {
                v3Var2.h(getThemedColor(org.telegram.ui.ActionBar.y6.Fi));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void didReceivedNotification(int r27, int r28, java.lang.Object... r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (!(dialog instanceof hi.m3) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final float e4() {
        return -AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(48.0f), this.f38569b.e);
    }

    public final void e5(boolean z10, boolean z11) {
        ?? r52;
        int L0;
        boolean z12;
        ay[] ayVarArr;
        MessagesController.DialogFilter dialogFilter;
        boolean z13;
        Object[] objArr;
        s4.m0 m0Var;
        boolean z14;
        boolean z15;
        boolean z16;
        if (this.f38693z0 != null && !this.inPreviewMode && !this.f38648q3) {
            tw twVar = this.G3;
            if (twVar == null || !twVar.c()) {
                org.telegram.ui.Components.k80 k80Var = this.L0;
                if (k80Var != null) {
                    k80Var.u();
                    this.L0 = null;
                }
                ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
                int size = dialogFilters.size();
                oe.b bVar = this.f38650r;
                boolean z17 = true;
                boolean z18 = false;
                if (size > 1) {
                    if (!z10 && this.f38693z0.getVisibility() == 0) {
                        r52 = 0;
                    } else {
                        if (this.f38693z0.getVisibility() != 0) {
                            z13 = false;
                        } else {
                            z13 = z11;
                        }
                        this.f38677w = true;
                        boolean isEmpty = this.f38693z0.h.isEmpty();
                        if (this.fragmentView != null) {
                            if (!this.isPaused && this.R3 == null) {
                                z16 = z11;
                            } else {
                                z16 = false;
                            }
                            if (!this.f38648q3) {
                                bVar.a(this.f38677w, z16);
                            }
                        }
                        int currentTabId = this.f38693z0.getCurrentTabId();
                        int currentTabStableId = this.f38693z0.getCurrentTabStableId();
                        if (currentTabId != this.f38693z0.getDefaultTabId() && currentTabId >= dialogFilters.size()) {
                            this.f38693z0.L = -1;
                            objArr = 1;
                        } else {
                            objArr = null;
                        }
                        qx qxVar = this.f38693z0;
                        qxVar.h.clear();
                        qxVar.f32374j0.clear();
                        qxVar.f32376l0.clear();
                        qxVar.m0.clear();
                        qxVar.f32378n0.clear();
                        qxVar.f32379o0.clear();
                        qxVar.M = 0;
                        int size2 = dialogFilters.size();
                        int i10 = 0;
                        while (i10 < size2) {
                            if (dialogFilters.get(i10).isDefault()) {
                                this.f38693z0.a(i10, 0, LocaleController.getString(R.string.FilterAllChats), null, false, true, dialogFilters.get(i10).locked);
                                z15 = z18;
                            } else {
                                MessagesController.DialogFilter dialogFilter2 = dialogFilters.get(i10);
                                z15 = z18;
                                this.f38693z0.a(i10, dialogFilter2.localId, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, false, dialogFilters.get(i10).locked);
                            }
                            i10++;
                            z18 = z15;
                        }
                        boolean z19 = z18;
                        if (currentTabStableId >= 0) {
                            if (objArr != null && !this.f38693z0.h(currentTabStableId)) {
                                while (currentTabId >= 0) {
                                    qx qxVar2 = this.f38693z0;
                                    if (qxVar2.h(qxVar2.f32375k0.get(currentTabId, -1))) {
                                        break;
                                    }
                                    currentTabId--;
                                }
                                if (currentTabId < 0) {
                                    currentTabId = z19 ? 1 : 0;
                                }
                            }
                            if (this.f38693z0.f32375k0.get(this.f38586e0[z19 ? 1 : 0].h, -1) != currentTabStableId) {
                                this.f38586e0[z19 ? 1 : 0].h = currentTabId;
                                isEmpty = true;
                            }
                        }
                        int i11 = z19 ? 1 : 0;
                        while (true) {
                            ay[] ayVarArr2 = this.f38586e0;
                            if (i11 >= ayVarArr2.length) {
                                break;
                            }
                            if (ayVarArr2[i11].h >= dialogFilters.size()) {
                                this.f38586e0[i11].h = dialogFilters.size() - 1;
                            }
                            this.f38586e0[i11].f37913a.setScrollingTouchSlop(1);
                            i11++;
                        }
                        qx qxVar3 = this.f38693z0;
                        bi.r1 r1Var = qxVar3.F;
                        if (z13) {
                            m0Var = qxVar3.f32385s0;
                        } else {
                            m0Var = null;
                        }
                        r1Var.setItemAnimator(m0Var);
                        qxVar3.I.l();
                        if (isEmpty) {
                            Z4(z19);
                        }
                        qx qxVar4 = this.f38693z0;
                        int currentTabId2 = qxVar4.getCurrentTabId();
                        ArrayList arrayList = qxVar4.h;
                        int i12 = 0;
                        while (true) {
                            if (i12 < arrayList.size()) {
                                if (((org.telegram.ui.Components.p00) arrayList.get(i12)).f31401a == currentTabId2) {
                                    z14 = ((org.telegram.ui.Components.p00) arrayList.get(i12)).f31404f;
                                    break;
                                }
                                i12++;
                            } else {
                                z14 = false;
                                break;
                            }
                        }
                        if (z14) {
                            qx qxVar5 = this.f38693z0;
                            ArrayList arrayList2 = qxVar5.h;
                            if (!arrayList2.isEmpty()) {
                                r52 = 0;
                                qxVar5.f((org.telegram.ui.Components.p00) arrayList2.get(0), 0);
                            }
                        }
                        r52 = 0;
                    }
                } else {
                    r52 = 0;
                    if (this.f38693z0.getVisibility() != 8) {
                        this.f38693z0.setIsEditing(false);
                        Q4(false);
                        this.f38633n3 = false;
                        if (this.f38627m3) {
                            this.f38627m3 = false;
                            this.f38586e0[0].setTranslationX(0.0f);
                            this.f38586e0[1].setTranslationX(ayVarArr[0].getMeasuredWidth());
                        }
                        if (this.f38586e0[0].h != this.f38693z0.getDefaultTabId()) {
                            this.f38586e0[0].h = this.f38693z0.getDefaultTabId();
                            gw gwVar = this.f38586e0[0].d;
                            gwVar.h = 0;
                            gwVar.l();
                            ay ayVar = this.f38586e0[0];
                            ayVar.f37919s = this.R0;
                            ayVar.d.l();
                        }
                        this.f38586e0[1].setVisibility(8);
                        ay ayVar2 = this.f38586e0[1];
                        ayVar2.h = 0;
                        gw gwVar2 = ayVar2.d;
                        gwVar2.h = 0;
                        gwVar2.l();
                        ay ayVar3 = this.f38586e0[1];
                        ayVar3.f37919s = this.R0;
                        ayVar3.d.l();
                        this.f38677w = false;
                        if (this.fragmentView != null) {
                            if (!this.isPaused && this.R3 == null) {
                                z12 = z11;
                            } else {
                                z12 = false;
                            }
                            if (!this.f38648q3) {
                                bVar.a(false, z12);
                            }
                        }
                        int i13 = 0;
                        while (true) {
                            ay[] ayVarArr3 = this.f38586e0;
                            if (i13 >= ayVarArr3.length) {
                                break;
                            }
                            ay ayVar4 = ayVarArr3[i13];
                            if (ayVar4.f37919s == 0 && ayVar4.v == 2 && h4() && ((L0 = this.f38586e0[i13].f37915c.L0()) == 0 || L0 == 1)) {
                                this.f38586e0[i13].f37915c.h1(1, (int) this.N);
                            }
                            this.f38586e0[i13].f37913a.setScrollingTouchSlop(0);
                            this.f38586e0[i13].f37913a.requestLayout();
                            this.f38586e0[i13].requestLayout();
                            i13++;
                        }
                        this.f38693z0.L = -1;
                        r52 = 0;
                    }
                }
                b5(r52);
                int i14 = this.f38586e0[r52].f37919s;
                if ((i14 == 7 || i14 == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[i14 - 7]) != null) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < dialogFilters.size()) {
                            MessagesController.DialogFilter dialogFilter3 = dialogFilters.get(i15);
                            if (dialogFilter3 != null && dialogFilter3.f19549id == dialogFilter.f19549id) {
                                break;
                            }
                            i15++;
                        } else {
                            z17 = false;
                            break;
                        }
                    }
                    if (!z17) {
                        Z4(false);
                    }
                }
            }
        }
    }

    public final di.h7 f4() {
        return getMessagesController().getStoriesController();
    }

    public final void f5(boolean r11, java.util.ArrayList r12, java.util.ArrayList r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.f5(boolean, java.util.ArrayList, java.util.ArrayList, boolean, boolean):void");
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.k80 k80Var = this.L0;
        if (k80Var != null) {
            k80Var.u();
        }
    }

    public final UndoView g4() {
        V3();
        UndoView[] undoViewArr = this.f38690y0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.d(2, true);
            tx txVar = (tx) this.fragmentView;
            txVar.removeView(undoViewArr[0]);
            txVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void g5() {
        float f7 = (((-this.f38601g4) - this.f38616j4) - this.f38668u1) - this.f38673v1;
        org.telegram.ui.Components.j20 j20Var = this.f38662t0;
        if (j20Var != null) {
            j20Var.setTranslationY(f7);
        }
        org.telegram.ui.Components.j20 j20Var2 = this.f38667u0;
        if (j20Var2 != null) {
            j20Var2.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            fi.v3 v3Var = this.f38640p0;
            if (v3Var != null) {
                v3Var.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.e5 getBackButtonState() {
        if (!m4() && !this.G3.f38977f) {
            return org.telegram.ui.ActionBar.e5.f22606b;
        }
        return org.telegram.ui.ActionBar.e5.f22605a;
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f7) {
        int i10;
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.X3, 1.0f);
            this.f38568a4 = ofFloat;
            return ofFloat;
        }
        if (getLayoutContainer() != null && getLayoutContainer().getMeasuredWidth() > 0) {
            i10 = (int) Utilities.clamp((200.0f / getLayoutContainer().getMeasuredWidth()) * f7, 200.0f, 80.0f);
        } else {
            i10 = 150;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.X3, 1.0f);
        this.f38568a4 = ofFloat2;
        ofFloat2.addUpdateListener(new ev(this, 2));
        this.f38568a4.setInterpolator(org.telegram.ui.Components.ds.f27587g);
        this.f38568a4.setDuration(i10);
        this.f38568a4.start();
        return this.f38568a4;
    }

    @Override
    public final java.util.ArrayList getThemeDescriptions() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.getThemeDescriptions():java.util.ArrayList");
    }

    public final boolean h4() {
        if (!this.f38623l2 && this.R0 == 0 && this.Y2 == 0 && this.W2 == 0 && getMessagesController().hasHiddenArchive()) {
            return true;
        }
        return false;
    }

    public final void h5(boolean z10) {
        boolean z11;
        boolean z12 = this.f38623l2;
        if ((!z12 || this.R0 == 10) && this.W2 == 0 && this.Y2 == 0 && !this.inPreviewMode && ((!this.f38614j2 || z12) && !this.U3)) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.j20 j20Var = this.f38662t0;
        if (j20Var != null) {
            j20Var.e(z11, z10);
        }
        org.telegram.ui.Components.j20 j20Var2 = this.f38667u0;
        if (j20Var2 != null) {
            j20Var2.e(z11, z10);
        }
    }

    public final boolean i4() {
        ArrayList arrayList = this.D2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void i5(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        if (this.f38630n0 != null) {
            org.telegram.ui.ActionBar.w0 w0Var = this.m0;
            if (w0Var == null || w0Var.getVisibility() != 0) {
                boolean z13 = false;
                int i11 = 0;
                while (true) {
                    if (i11 < getDownloadController().downloadingFiles.size()) {
                        if (getFileLoader().isLoadingFile(getDownloadController().downloadingFiles.get(i11).getFileName())) {
                            z12 = true;
                            break;
                        }
                        i11++;
                    } else {
                        z12 = false;
                        break;
                    }
                }
                if (!getDownloadController().hasUnviewedDownloads() && !z12 && (this.f38597g0.getVisibility() != 0 || this.f38597g0.getAlpha() != 1.0f || z11)) {
                    this.f38607i0 = false;
                } else {
                    this.f38607i0 = true;
                }
                F3();
                boolean z14 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i12 = this.f38583d2;
                if (i12 == 3 || i12 == 5) {
                    z13 = true;
                }
                org.telegram.ui.ActionBar.g1 g1Var = this.f38635o0;
                if (z14) {
                    if (z13) {
                        i10 = R.string.MenuProxyConnected;
                    } else {
                        i10 = R.string.MenuProxyConnecting;
                    }
                } else {
                    i10 = R.string.MenuProxyDisabled;
                }
                g1Var.setSubtext(LocaleController.getString(i10));
                this.f38630n0.b(z14, z13, z10);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        tw twVar;
        if (!this.f38614j2 && (twVar = this.G3) != null && twVar.getFragment() != null) {
            return this.G3.getFragment().isLightStatusBar();
        }
        if (i0.a.h(getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j4(boolean z10) {
        int i10;
        boolean z11;
        this.actionBar.p();
        this.I2.clear();
        org.telegram.ui.ActionBar.j2 j2Var = this.f38587e1;
        boolean z12 = true;
        if (j2Var != null) {
            j2Var.c(0.0f, true);
        }
        qx qxVar = this.f38693z0;
        if (qxVar != null) {
            qxVar.b(org.telegram.ui.ActionBar.y6.K8, org.telegram.ui.ActionBar.y6.I8, org.telegram.ui.ActionBar.y6.J8, org.telegram.ui.ActionBar.y6.L8, org.telegram.ui.ActionBar.y6.f23356d6);
        }
        ValueAnimator valueAnimator = this.f38675v3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f38675v3 = null;
        }
        if (this.f38670u3 == 0.0f) {
            return;
        }
        K4(-b4());
        boolean z13 = false;
        int i11 = 0;
        while (true) {
            ay[] ayVarArr = this.f38586e0;
            if (i11 >= ayVarArr.length) {
                break;
            }
            ay ayVar = ayVarArr[i11];
            if (ayVar != null) {
                ayVar.f37913a.I0(true);
            }
            i11++;
        }
        if (this.K) {
            i10 = 81;
        } else {
            i10 = 0;
        }
        float max = Math.max(0.0f, AndroidUtilities.dp(i10 + 48) + this.N);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38670u3, 0.0f);
        this.f38675v3 = ofFloat;
        ofFloat.addUpdateListener(new jv(this, max, 1));
        this.f38675v3.addListener(new cx(this, max, 0));
        this.f38675v3.setInterpolator(org.telegram.ui.Components.ds.f27586f);
        this.f38675v3.setDuration(200L);
        this.f38675v3.start();
        this.Y0 = false;
        ArrayList arrayList = this.f38566a1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList.get(i12);
                o00.v0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
                i12++;
                arrayList = arrayList;
                size = size;
                z13 = false;
                z12 = true;
                obj = null;
            }
            arrayList.clear();
        }
        if (this.Z0) {
            getMessagesController().reorderPinnedDialogs(this.W2, null, 0L);
            z11 = 0;
            this.Z0 = false;
        } else {
            z11 = 0;
        }
        b5(true);
        if (this.f38586e0 != null) {
            int i13 = z11;
            while (true) {
                ay[] ayVarArr2 = this.f38586e0;
                if (i13 >= ayVarArr2.length) {
                    break;
                }
                ayVarArr2[i13].d.H = z11;
                i13++;
            }
        }
        int i14 = MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK;
        int i15 = z11;
        if (z10) {
            i15 = MessagesController.UPDATE_MASK_CHAT;
        }
        q5(i15 | i14, true);
    }

    public final void j5() {
        int i10;
        int i11;
        if (this.f38660s3 && this.actionBar != null) {
            if (this.W2 == 0 && this.Y2 == 0) {
                i10 = org.telegram.ui.ActionBar.y6.f23694v8;
            } else {
                i10 = org.telegram.ui.ActionBar.y6.O8;
            }
            int themedColor = getThemedColor(i10);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i12 = org.telegram.ui.ActionBar.y6.f23750y8;
            kVar.y(i0.a.f(this.f38685x1, themedColor, getThemedColor(i12)), false);
            this.actionBar.y(i0.a.f(this.f38685x1, getThemedColor(i12), getThemedColor(i12)), true);
            if (this.W2 == 0 && this.Y2 == 0) {
                i11 = org.telegram.ui.ActionBar.y6.f23656t8;
            } else {
                i11 = org.telegram.ui.ActionBar.y6.N8;
            }
            int themedColor2 = getThemedColor(i11);
            this.actionBar.x(i0.a.f(this.f38685x1, themedColor2, getThemedColor(org.telegram.ui.ActionBar.y6.f23769z8)), false);
        }
    }

    public final void k4(boolean z10) {
        if (this.G3.c()) {
            z10 = true;
        }
        if (!z10 || !this.f38572b2) {
            this.U3 = z10;
            h5(true);
            if (z10) {
                fi.v3 v3Var = this.f38640p0;
                if (v3Var != null) {
                    v3Var.e(true);
                }
                fi.v3 v3Var2 = this.f38645q0;
                if (v3Var2 != null) {
                    v3Var2.e(true);
                }
            }
        }
    }

    public final void k5() {
        org.telegram.ui.Components.qr0 qr0Var;
        int i10;
        jw jwVar = this.B1;
        ArrayList arrayList = this.I2;
        if (jwVar != null) {
            this.f38629n.a(!arrayList.isEmpty(), true);
            l5();
            if (arrayList.isEmpty()) {
                if (this.R0 == 3 && this.f38594f2 == null) {
                    i10 = R.string.ForwardTo;
                } else {
                    i10 = R.string.SelectChat;
                }
                String string = LocaleController.getString(i10);
                if (this.Q3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(string);
                } else {
                    this.actionBar.G(string, true, 350L, org.telegram.ui.Components.ds.h);
                }
                if (this.B1.getTag() != null) {
                    this.B1.k0(false, false, false);
                    this.B1.M();
                    this.B1.setTag(null);
                    this.fragmentView.requestLayout();
                }
            } else {
                if (this.B1.getTag() == null) {
                    if (!i4() && this.E2 == null) {
                        this.B1.setFieldText("");
                    }
                    this.B1.setTag(1);
                    if (!this.W3 && (qr0Var = this.G2) != null) {
                        this.W3 = true;
                        String string2 = LocaleController.getString(R.string.ShareTapToEditMedia);
                        qr0Var.j();
                        qr0Var.F = string2;
                        org.telegram.ui.Components.or0 or0Var = qr0Var.f32005a[0];
                        if (string2 != null) {
                            or0Var.e.l(string2, false);
                        }
                        org.telegram.ui.Components.mp0 mp0Var = new org.telegram.ui.Components.mp0(qr0Var, 3);
                        qr0Var.G = mp0Var;
                        AndroidUtilities.runOnUIThread(mp0Var, 1000L);
                    }
                }
                this.C1.g(Math.max(1, arrayList.size()), true);
                int i11 = this.S0 + (!TextUtils.isEmpty(this.B1.getFieldText()) ? 1 : 0);
                int size = arrayList.size();
                int i12 = 0;
                long j10 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    long longValue = ((Long) obj).longValue();
                    long sendPaidMessagesStars = getMessagesController().getSendPaidMessagesStars(longValue);
                    if (sendPaidMessagesStars <= 0 && longValue > 0) {
                        sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(getMessagesController().isUserContactBlocked(longValue));
                    }
                    j10 += sendPaidMessagesStars;
                }
                this.C1.i(i11, j10, true);
                this.B1.O1();
                if (this.Q3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]));
                } else {
                    this.actionBar.G(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]), false, 350L, org.telegram.ui.Components.ds.h);
                }
            }
            this.Q3 = arrayList.isEmpty();
        } else if (this.R0 == 10) {
            k4(arrayList.isEmpty());
        }
    }

    public final void l5() {
        org.telegram.ui.Components.qr0 qr0Var = this.G2;
        if (qr0Var != null) {
            int i10 = this.currentAccount;
            qr0Var.h(i10);
            qr0Var.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
            ArrayList arrayList = qr0Var.f32008f;
            arrayList.clear();
            ArrayList arrayList2 = this.I2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            org.telegram.ui.Components.or0 or0Var = qr0Var.f32005a[0];
            if (qr0Var.f32006b == 1) {
                or0Var.d.l(qr0Var.c(or0Var), false);
            }
        }
    }

    public final boolean m4() {
        if (this.W2 == 1) {
            return true;
        }
        return false;
    }

    public final void m5(boolean z10) {
        boolean z11;
        if (this.f38622l0 == null) {
            return;
        }
        ArrayList<MessageObject> arrayList = getDownloadController().downloadingFiles;
        int size = arrayList.size();
        boolean z12 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                MessageObject messageObject = arrayList.get(i10);
                i10++;
                MessageObject messageObject2 = messageObject;
                if (messageObject2.getDocument() != null && messageObject2.getDocument().size >= 157286400) {
                    z11 = true;
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        ArrayList<MessageObject> arrayList2 = getDownloadController().recentDownloadingFiles;
        int size2 = arrayList2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                break;
            }
            MessageObject messageObject3 = arrayList2.get(i11);
            i11++;
            MessageObject messageObject4 = messageObject3;
            if (messageObject4.getDocument() != null && messageObject4.getDocument().size >= 157286400) {
                z11 = true;
                break;
            }
        }
        if (!getUserConfig().isPremium() && !getMessagesController().premiumFeaturesBlocked() && z11 && z10) {
            z12 = true;
        }
        this.d.a(z12, true);
    }

    public final boolean n4(long j10) {
        if (j10 < 0) {
            return false;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        if (!UserObject.isBotForum(user)) {
            return false;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f22176id);
        if ((topics != null && !topics.isEmpty()) || !MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f22176id)) {
            return false;
        }
        return true;
    }

    public final void n5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.r5 r5Var;
        org.telegram.ui.ActionBar.u6 u6Var;
        qw qwVar = this.E0;
        org.telegram.ui.Components.r5 r5Var2 = null;
        if (qwVar != null && (r5Var = qwVar.f9072a0) != null && qwVar.f9091q0 != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                r5Var.j(emojiStatusDocumentId.longValue(), z10);
                r5Var.m(user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible, z10);
            } else if (user != null && MessagesController.getInstance(qwVar.f9079f).isPremiumUser(user)) {
                if (qwVar.N0 == null) {
                    qwVar.N0 = qwVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    qwVar.N0 = new org.telegram.ui.Components.s5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), qwVar.N0);
                }
                Drawable drawable = qwVar.N0;
                int i10 = org.telegram.ui.ActionBar.y6.f23776zh;
                cy cyVar = qwVar.f9078e0;
                if (cyVar != null) {
                    u6Var = cyVar.getResourceProvider();
                } else {
                    u6Var = null;
                }
                org.telegram.ui.ActionBar.f7.y(qwVar, drawable, i10, u6Var, PorterDuff.Mode.MULTIPLY);
                r5Var.g(qwVar.N0, z10);
                r5Var.m(false, z10);
            } else {
                r5Var.g(null, z10);
                r5Var.m(false, z10);
            }
            r5Var.k(Integer.valueOf(qwVar.f(org.telegram.ui.ActionBar.y6.f23776zh)));
            qwVar.W.invalidate();
        }
        if (this.E3 != null && this.actionBar != null) {
            Long emojiStatusDocumentId2 = UserObject.getEmojiStatusDocumentId(user);
            this.C3 = null;
            if (emojiStatusDocumentId2 != null) {
                boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                this.E3.j(emojiStatusDocumentId2.longValue(), z10);
                this.E3.m(z11, z10);
                if (z11) {
                    this.C3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
                }
                this.actionBar.setRightDrawableOnClick(new hv(this, 2));
                c61.t(this.currentAccount);
            } else if (user != null && MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
                if (this.L3 == null) {
                    this.L3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    this.L3 = new org.telegram.ui.Components.s5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.L3);
                }
                Drawable drawable2 = this.L3;
                int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23776zh);
                this.f38688x4 = themedColor;
                drawable2.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                this.E3.g(this.L3, z10);
                this.E3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(new hv(this, 3));
                c61.t(this.currentAccount);
            } else {
                this.E3.g(null, z10);
                this.E3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(null);
            }
            org.telegram.ui.Components.r5 r5Var3 = this.E3;
            int i11 = org.telegram.ui.ActionBar.y6.f23776zh;
            r5Var3.k(Integer.valueOf(getThemedColor(i11)));
            org.telegram.ui.Cells.o oVar = this.F3;
            if (oVar != null) {
                oVar.setColor(getThemedColor(i11));
            }
            vw vwVar = this.M0;
            if (vwVar != null && (vwVar.getContentView() instanceof c61)) {
                org.telegram.ui.ActionBar.b6 titleTextView = this.actionBar.getTitleTextView();
                c61 c61Var = (c61) this.M0.getContentView();
                if (titleTextView != null) {
                    Drawable rightDrawable = titleTextView.getRightDrawable();
                    org.telegram.ui.Components.r5 r5Var4 = this.E3;
                    if (rightDrawable == r5Var4) {
                        r5Var2 = r5Var4;
                    }
                }
                c61Var.y(r5Var2, titleTextView);
            }
        }
    }

    public final boolean o4(TLRPC.Dialog dialog) {
        char c10;
        if (dialog == null) {
            return false;
        }
        int i10 = this.f38586e0[0].f37919s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.q() || this.actionBar.r(null))) {
            MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
            if (this.f38586e0[0].f37919s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            dialogFilter = dialogFilterArr[c10];
        }
        if (dialogFilter != null) {
            if (dialogFilter.pinnedDialogs.indexOfKey(dialog.f22031id) < 0) {
                return false;
            }
            return true;
        }
        return dialog.pinned;
    }

    public final void o5() {
        fi.v3 v3Var;
        boolean storiesEnabled = getMessagesController().storiesEnabled();
        if (this.O3 != storiesEnabled) {
            g5();
            if (!this.O3 && storiesEnabled && (v3Var = this.f38640p0) != null) {
                v3Var.u();
            }
            this.O3 = storiesEnabled;
        }
        org.telegram.ui.Components.j20 j20Var = this.f38662t0;
        if (j20Var == null) {
            return;
        }
        if (this.R0 == 10) {
            j20Var.setImageResource(R.drawable.floating_check);
            this.f38662t0.setContentDescription(LocaleController.getString(R.string.Done));
            return;
        }
        j20Var.setImageResource(R.drawable.filled_fab_compose_32);
        this.f38662t0.setContentDescription(LocaleController.getString(R.string.NewMessageTitle));
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else if (this.G3.c() && this.G3.getFragment().onBackPressed(z10)) {
            if (z10) {
                this.G3.a();
                jx jxVar = this.C0;
                if (jxVar != null) {
                    jxVar.S();
                    return false;
                }
            }
        } else {
            org.telegram.ui.Components.k80 k80Var = this.L0;
            if (k80Var != null) {
                if (z10) {
                    k80Var.u();
                    this.L0 = null;
                    return false;
                }
            } else {
                qx qxVar = this.f38693z0;
                if (qxVar != null && qxVar.f32377n) {
                    if (z10) {
                        qxVar.setIsEditing(false);
                        Q4(false);
                        return false;
                    }
                } else {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar != null && kVar.q()) {
                        if (z10) {
                            jx jxVar2 = this.C0;
                            if (jxVar2 != null && jxVar2.getVisibility() == 0) {
                                this.C0.R(false);
                            }
                            j4(true);
                            return false;
                        }
                    } else if (this.f38569b.f19327f) {
                        if (z10) {
                            this.X.f30367r.getText().clear();
                            this.Y.b(false);
                            this.X.f30367r.clearFocus();
                            return false;
                        }
                    } else {
                        qx qxVar2 = this.f38693z0;
                        if (qxVar2 != null && qxVar2.getVisibility() == 0 && !this.f38605h3) {
                            qx qxVar3 = this.f38693z0;
                            if (!qxVar3.O && !this.f38627m3) {
                                ArrayList arrayList = qxVar3.h;
                                if (!arrayList.isEmpty() && qxVar3.L != ((org.telegram.ui.Components.p00) arrayList.get(0)).f31401a) {
                                    if (z10) {
                                        qx qxVar4 = this.f38693z0;
                                        ArrayList arrayList2 = qxVar4.h;
                                        if (!arrayList2.isEmpty()) {
                                            qxVar4.f((org.telegram.ui.Components.p00) arrayList2.get(0), 0);
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        jw jwVar = this.B1;
                        if (jwVar != null && jwVar.q0()) {
                            if (z10) {
                                this.B1.j0(true);
                            }
                        } else {
                            qw qwVar = this.E0;
                            if (qwVar.O == 0 && qwVar.S.L0() != 0) {
                                qwVar.h.y0(0);
                                return false;
                            }
                            return super.onBackPressed(z10);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        bi.cc ccVar;
        qx qxVar;
        if (this.V1) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.g(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                jx jxVar = this.C0;
                if (jxVar != null) {
                    jxVar.f27936d0.Q(this.W1, tLObject);
                }
                this.X1 = null;
            }
            this.V1 = false;
        }
        if (!this.K && (qxVar = this.f38693z0) != null && qxVar.getVisibility() == 0 && this.f38650r.f19327f) {
            int i10 = (int) (-this.N);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (i10 != 0 && i10 != currentActionBarHeight && i10 >= currentActionBarHeight / 2) {
                this.f38586e0[0].f37913a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.f38690y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        if (!isInPreviewMode() && (ccVar = this.K0) != null && ccVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        J3();
        this.f38651r0 = true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        fi.v3 v3Var;
        super.onBecomeFullyVisible();
        if (m4()) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z10 = globalMainSettings.getBoolean("archivehint", true);
            boolean isEmpty = Z3(this.currentAccount, this.R0, this.W2, false).isEmpty();
            if (z10 && isEmpty) {
                MessagesController.getGlobalMainSettings().edit().putBoolean("archivehint", false).commit();
                z10 = false;
            }
            if (z10) {
                globalMainSettings.edit().putBoolean("archivehint", false).commit();
                O4();
            }
        }
        if (this.f38651r0 && !this.f38657s0 && (v3Var = this.f38640p0) != null && this.O3) {
            this.f38657s0 = true;
            this.f38651r0 = false;
            v3Var.u();
        }
        AndroidUtilities.runOnUIThread(new sv(this, 4), 200L);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.k80 k80Var = this.L0;
        if (k80Var != null) {
            k80Var.u();
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.e2 e2Var;
        super.onDialogDismiss(dialog);
        if (this.W2 == 0 && this.Y2 == 0 && (e2Var = this.T1) != null && dialog == e2Var && getParentActivity() != null) {
            r3(false);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10;
        super.onFragmentCreate();
        Bundle bundle = this.arguments;
        int i11 = 0;
        if (bundle != null) {
            this.f38623l2 = bundle.getBoolean("onlySelect", false);
            this.f38626m2 = this.arguments.getBoolean("canSelectTopics", false);
            this.f38647q2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.R0 = this.arguments.getInt("dialogsType", 0);
            this.O0 = this.arguments.getBoolean("quote", false);
            this.N0 = this.arguments.getBoolean("reply_to", false);
            this.P0 = this.arguments.getLong("reply_to_author", 0L);
            this.Q0 = this.arguments.getLong("forward_into_channel", 0L);
            this.f38594f2 = this.arguments.getString("selectAlertString");
            this.f38599g2 = this.arguments.getString("selectAlertStringGroup");
            this.f38604h2 = this.arguments.getString("addToGroupAlertString");
            this.f38653r2 = this.arguments.getBoolean("allowSwitchAccount");
            this.f38659s2 = this.arguments.getBoolean("checkCanWrite", true);
            this.f38664t2 = this.arguments.getBoolean("afterSignup", false);
            this.W2 = this.arguments.getInt("folderId", 0);
            long j10 = this.arguments.getLong("community_id", 0L);
            this.Y2 = j10;
            if (j10 != 0) {
                this.Z2 = getMessagesController().getChat(Long.valueOf(this.Y2));
                this.f38567a3 = getMessagesController().getChatFull(this.Y2);
            }
            this.f38609i2 = this.arguments.getBoolean("resetDelegate", true);
            this.S0 = this.arguments.getInt("messagesCount", 0);
            this.T0 = this.arguments.getInt("hasPoll", 0);
            this.U0 = this.arguments.getBoolean("hasInvoice", false);
            this.f38669u2 = this.arguments.getBoolean("showSetPasswordConfirm", this.f38669u2);
            this.arguments.getInt("otherwiseRelogin");
            this.f38674v2 = this.arguments.getBoolean("allowGroups", true);
            this.f38680w2 = this.arguments.getBoolean("allowMegagroups", true);
            this.f38686x2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.f38692y2 = this.arguments.getBoolean("allowChannels", true);
            this.f38695z2 = this.arguments.getBoolean("allowUsers", true);
            this.A2 = this.arguments.getBoolean("allowBots", true);
            this.B2 = this.arguments.getBoolean("closeFragment", true);
            this.F = this.arguments.getBoolean("allowGlobalSearch", true);
            this.W = this.arguments.getBoolean("hasMainTabs", false);
            byte[] byteArray = this.arguments.getByteArray("requestPeerType");
            if (byteArray != null) {
                try {
                    SerializedData serializedData = new SerializedData(byteArray);
                    this.G = TLRPC.RequestPeerType.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    serializedData.cleanup();
                } catch (Exception unused) {
                }
            }
            this.H = this.arguments.getLong("requestPeerBotId", 0L);
        }
        if (this.R0 == 0) {
            this.U1 = MessagesController.getGlobalNotificationsSettings().getBoolean("askAboutContacts", true);
            SharedConfig.loadProxyList();
        }
        this.K3 = getNotificationCenter().createObserversGroup(this);
        if (this.f38632n2 == null) {
            this.f38583d2 = getConnectionsManager().getConnectionState();
            this.K3.addGlobal(NotificationCenter.emojiLoaded);
            if (!this.f38623l2) {
                this.K3.addGlobal(NotificationCenter.closeSearchByActiveAction);
                this.K3.addGlobal(NotificationCenter.proxySettingsChanged);
                this.K3.add(NotificationCenter.filterSettingsUpdated);
                this.K3.add(NotificationCenter.dialogsUnreadCounterChanged);
            }
            this.K3.add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.dialogFiltersUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.encryptedChatUpdated).add(NotificationCenter.contactsDidLoad).add(NotificationCenter.appDidLogout).add(NotificationCenter.openedChatChanged).add(NotificationCenter.notificationsSettingsUpdated).add(NotificationCenter.messageReceivedByAck).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messageSendError).add(NotificationCenter.needReloadRecentDialogsSearch).add(NotificationCenter.replyMessagesDidLoad).add(NotificationCenter.topicsDidLoaded).add(NotificationCenter.reloadHints).add(NotificationCenter.didUpdateConnectionState).add(NotificationCenter.onDownloadingFilesChanged).add(NotificationCenter.needDeleteDialog).add(NotificationCenter.folderBecomeEmpty).add(NotificationCenter.newSuggestionsAvailable).add(NotificationCenter.dialogsUnreadReactionsCounterChanged).add(NotificationCenter.dialogsUnreadPollVotesCounterChanged).add(NotificationCenter.forceImportContactsStart).add(NotificationCenter.userEmojiStatusUpdated).add(NotificationCenter.currentUserPremiumStatusChanged);
            this.K3.addGlobal(NotificationCenter.didSetPasscode);
        }
        this.K3.add(NotificationCenter.messagesDeleted).add(NotificationCenter.onDatabaseMigration).add(NotificationCenter.onDatabaseOpened).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.didClearDatabase).add(NotificationCenter.onDatabaseReset).add(NotificationCenter.storiesUpdated).add(NotificationCenter.storiesEnabledUpdate).add(NotificationCenter.unconfirmedAuthUpdate).add(NotificationCenter.premiumPromoUpdated).add(NotificationCenter.starBalanceUpdated).add(NotificationCenter.starSubscriptionsLoaded).add(NotificationCenter.communityPendingRequestsUpdate).add(NotificationCenter.communitySwitchedCollapsed).add(NotificationCenter.appConfigUpdated).add(NotificationCenter.activeAuctionsUpdated);
        if (this.R0 == 0) {
            this.K3.add(NotificationCenter.chatlistFolderUpdate);
            this.K3.add(NotificationCenter.dialogTranslate);
        }
        q4(getAccountInstance());
        di.h7 storiesController = getMessagesController().getStoriesController();
        if (!storiesController.A) {
            storiesController.T();
            if (!storiesController.f8645s) {
                ConnectionsManager.getInstance(storiesController.f8630a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new di.g6(storiesController, 0));
            }
        }
        getMessagesController().loadPinnedDialogs(this.W2, 0L, null);
        if (this.R3 != null && !getMessagesStorage().isDatabaseMigrationInProgress()) {
            nu nuVar = this.R3;
            if (nuVar.getParent() != null) {
                ((ViewGroup) nuVar.getParent()).removeView(nuVar);
            }
            this.R3 = null;
        }
        if (m4()) {
            di.h7 storiesController2 = getMessagesController().getStoriesController();
            if (storiesController2.f8651z) {
                storiesController2.Q(true);
            }
        } else {
            getMessagesController().getStoriesController().T();
        }
        getContactsController().loadGlobalPrivacySetting();
        if (getMessagesController().savedViewAsChats) {
            getMessagesController().getSavedMessagesController().preloadDialogs(true);
        }
        if (this.Y2 != 0) {
            getMessagesController().loadFullChat(this.Y2, 0, true);
        }
        BirthdayController.getInstance(this.currentAccount).check();
        if (this.W) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.f38611i4 = i10;
        if (this.W) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.f38616j4 = i11;
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.ObserversGroup observersGroup = this.K3;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.K3 = null;
        }
        jw jwVar = this.B1;
        if (jwVar != null) {
            jwVar.z0();
        }
        org.telegram.ui.Components.qr0 qr0Var = this.G2;
        if (qr0Var != null) {
            qr0Var.j();
        }
        org.telegram.ui.Components.c71 c71Var = this.H2;
        if (c71Var != null) {
            AndroidUtilities.cancelRunOnUIThread(c71Var);
            this.H2 = null;
        }
        UndoView undoView = this.f38690y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f38643p3.unlock();
        this.C2 = null;
        ea1 ea1Var = ea1.f39072b;
        if (ea1Var != null) {
            ea1Var.dismiss();
            ea1.f39072b = null;
        }
    }

    @Override
    public final void onPanTranslationUpdate(float f7) {
        if (this.f38586e0 != null) {
            this.J0 = f7;
            jw jwVar = this.B1;
            int i10 = 0;
            if (jwVar != null && jwVar.q0()) {
                this.fragmentView.setTranslationY(f7);
                while (true) {
                    ay[] ayVarArr = this.f38586e0;
                    if (i10 >= ayVarArr.length) {
                        break;
                    }
                    ayVarArr[i10].setTranslationY(0.0f);
                    i10++;
                }
                if (!this.f38623l2) {
                    this.actionBar.setTranslationY(0.0f);
                    org.telegram.ui.Components.qc qcVar = this.f38638o3;
                    if (qcVar != null) {
                        qcVar.l();
                    }
                }
                jx jxVar = this.C0;
                if (jxVar != null) {
                    jxVar.setTranslationY(this.I0);
                    return;
                }
                return;
            }
            while (true) {
                ay[] ayVarArr2 = this.f38586e0;
                if (i10 >= ayVarArr2.length) {
                    break;
                }
                ayVarArr2[i10].setTranslationY(f7);
                i10++;
            }
            if (!this.f38623l2) {
                this.actionBar.setTranslationY(f7);
                org.telegram.ui.Components.qc qcVar2 = this.f38638o3;
                if (qcVar2 != null) {
                    qcVar2.l();
                }
            }
            jx jxVar2 = this.C0;
            if (jxVar2 != null) {
                jxVar2.setTranslationY(this.J0 + this.I0);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.qc qcVar = this.S;
        if (qcVar != null) {
            qcVar.b();
            this.S = null;
        }
        tw twVar = this.G3;
        if (twVar != null) {
            twVar.f38979r = true;
            ax axVar = twVar.f38974a;
            if (axVar != null) {
                axVar.onPause();
            }
        }
        org.telegram.ui.Components.k80 k80Var = this.L0;
        if (k80Var != null) {
            k80Var.u();
        }
        jw jwVar = this.B1;
        if (jwVar != null) {
            jwVar.B0();
        }
        int i10 = 0;
        UndoView undoView = this.f38690y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        setBulletinDelegate(null);
        if (this.f38586e0 == null) {
            return;
        }
        while (true) {
            ay[] ayVarArr = this.f38586e0;
            if (i10 < ayVarArr.length) {
                ayVarArr[i10].d.getClass();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        FilesMigrationService.FilesMigrationBottomSheet filesMigrationBottomSheet;
        if (i10 == 1) {
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (iArr.length > i11) {
                    String str = strArr[i11];
                    str.getClass();
                    char c10 = 65535;
                    switch (str.hashCode()) {
                        case -1925850455:
                            if (str.equals("android.permission.POST_NOTIFICATIONS")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 1365911975:
                            if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 1977429404:
                            if (str.equals("android.permission.READ_CONTACTS")) {
                                c10 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            if (iArr[i11] == 0) {
                                NotificationsController.getInstance(this.currentAccount).showNotifications();
                                break;
                            } else {
                                ak0.m();
                                continue;
                            }
                        case 1:
                            if (iArr[i11] == 0) {
                                ImageLoader.getInstance().checkMediaPaths();
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (iArr[i11] == 0) {
                                AndroidUtilities.runOnUIThread(new sv(this, 3));
                                getContactsController().forceImportContacts();
                                continue;
                            } else {
                                SharedPreferences.Editor edit = MessagesController.getGlobalNotificationsSettings().edit();
                                this.U1 = false;
                                edit.putBoolean("askAboutContacts", false).commit();
                                break;
                            }
                    }
                }
            }
            if (this.A0) {
                this.A0 = false;
                R4();
            }
        } else if (i10 == 4) {
            for (int i12 : iArr) {
                if (i12 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 30 && (filesMigrationBottomSheet = FilesMigrationService.filesMigrationBottomSheet) != null) {
                filesMigrationBottomSheet.migrateOldFolder();
            }
        }
    }

    @Override
    public final void onResume() {
        boolean z10;
        cy cyVar;
        ay ayVar;
        gw gwVar;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.Components.wo0 wo0Var;
        bi.cc ccVar;
        super.onResume();
        qw qwVar = this.E0;
        char c10 = 0;
        if (qwVar != null) {
            ArrayList arrayList = qwVar.f9101x;
            di.h7 h7Var = qwVar.f9094s;
            h7Var.l(h7Var.f8634g);
            h7Var.l(h7Var.h);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TL_stories.PeerStories y3 = h7Var.y(((di.o) arrayList.get(i10)).f8855c);
                if (y3 != null) {
                    h7Var.X(y3);
                }
            }
        }
        tw twVar = this.G3;
        if (twVar != null) {
            twVar.f38979r = false;
            ax axVar = twVar.f38974a;
            if (axVar != null) {
                axVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).x() && (ccVar = this.K0) != null && ccVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        if (this.f38586e0 != null) {
            int i11 = 0;
            while (true) {
                ay[] ayVarArr = this.f38586e0;
                if (i11 >= ayVarArr.length) {
                    break;
                }
                ayVarArr[i11].d.l();
                i11++;
            }
        }
        jw jwVar = this.B1;
        if (jwVar != null) {
            jwVar.C0();
        }
        long j10 = 0;
        if (!this.f38623l2 && this.W2 == 0 && this.Y2 == 0) {
            getMediaDataController().checkStickers(4);
        }
        jx jxVar = this.C0;
        if (jxVar != null && (wo0Var = jxVar.f27936d0) != null) {
            wo0Var.l();
        }
        if (!this.f38664t2 && getUserConfig().unacceptedTermsOfService != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.W2 == 0 && this.Y2 == 0 && this.f38578c2 && !this.f38623l2) {
            int i12 = Build.VERSION.SDK_INT;
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.f38578c2 = false;
                if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i12 <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i12 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                cyVar = this;
                org.telegram.messenger.s1 s1Var = new org.telegram.messenger.s1(cyVar, z13, z11, z12, parentActivity);
                if (cyVar.f38664t2 && (z11 || z13)) {
                    j10 = 4000;
                }
                AndroidUtilities.runOnUIThread(s1Var, j10);
            } else {
                cyVar = this;
            }
        } else {
            cyVar = this;
            if (!cyVar.f38623l2 && cyVar.W2 == 0 && cyVar.Y2 == 0 && XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(10020)) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutMiuiLockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        int i13 = R.raw.permission_request_apk;
                        int i14 = org.telegram.ui.ActionBar.y6.L5;
                        alertDialog$Builder.m(i13, 72, getThemedColor(i14), null);
                        alertDialog$Builder.n(i14, getResourceProvider());
                        alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.PermissionXiaomiLockscreen);
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new iv(this, 9));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.voip.c1(5));
                        showDialog(alertDialog$Builder.f22368a);
                    }
                } else {
                    return;
                }
            } else if (cyVar.W2 == 0 && cyVar.Y2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutFSILockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                        int i15 = R.raw.permission_request_apk;
                        int i16 = org.telegram.ui.ActionBar.y6.L5;
                        alertDialog$Builder2.m(i15, 72, getThemedColor(i16), null);
                        alertDialog$Builder2.n(i16, getResourceProvider());
                        alertDialog$Builder2.f22368a.T = LocaleController.getString(R.string.PermissionFSILockscreen);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new iv(this, 10));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.voip.c1(6));
                        showDialog(alertDialog$Builder2.f22368a);
                    }
                } else {
                    return;
                }
            }
        }
        R4();
        if (cyVar.f38586e0 != null) {
            int i17 = 0;
            while (true) {
                ay[] ayVarArr2 = cyVar.f38586e0;
                if (i17 >= ayVarArr2.length) {
                    break;
                }
                ay ayVar2 = ayVarArr2[i17];
                if (ayVar2.f37919s == 0 && ayVar2.v == 2 && ayVar2.f37915c.L0() == 0 && h4()) {
                    cyVar.f38586e0[i17].f37915c.h1(1, (int) cyVar.N);
                }
                if (i17 == 0) {
                    cyVar.f38586e0[i17].d.getClass();
                } else {
                    cyVar.f38586e0[i17].d.getClass();
                }
                i17++;
            }
        }
        T4();
        setBulletinDelegate(new d9(this, 4));
        if (cyVar.f38648q3) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), cyVar.classGuid);
        }
        q5(0, false);
        i5(false, true);
        p5(false);
        if (getMessagesStorage().showClearDatabaseAlert) {
            getMessagesStorage().showClearDatabaseAlert = false;
            ea1.n(this);
        }
        J3();
        if (cyVar.f38693z0 != null && (ayVar = cyVar.f38586e0[0]) != null && (gwVar = ayVar.d) != null) {
            int i18 = gwVar.h;
            if (i18 == 7 || i18 == 8) {
                MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
                if (i18 != 7) {
                    c10 = 1;
                }
                MessagesController.DialogFilter dialogFilter = dialogFilterArr[c10];
                if (dialogFilter != null) {
                    cyVar.f38693z0.h(dialogFilter.localId);
                }
            }
        }
    }

    @Override
    public final void onSlideProgress(boolean z10, float f7) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.Z3 && this.f38568a4 == null) {
            N4(f7);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.f38593f1.setColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6));
            v3();
            d5();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        bi.cc ccVar;
        cy cyVar;
        tw twVar = this.G3;
        if (twVar != null && twVar.c()) {
            this.G3.getFragment().onTransitionAnimationEnd(z10, z11);
        } else {
            if (z10 && (ccVar = this.K0) != null && ccVar.getVisibility() == 0) {
                this.K0.setVisibility(8);
                this.K0.setBackground(null);
            }
            if (z10 && this.f38664t2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).f35567x0.c(false);
                }
            }
        }
        if (!z10 && (cyVar = this.X2) != null) {
            cyVar.removeSelfFromStack();
        }
        J3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        tw twVar = this.G3;
        if (twVar != null && twVar.c()) {
            this.G3.getFragment().onTransitionAnimationProgress(z10, f7);
        } else {
            bi.cc ccVar = this.K0;
            if (ccVar != null && ccVar.getVisibility() == 0) {
                if (z10) {
                    this.K0.setAlpha(1.0f - f7);
                } else {
                    this.K0.setAlpha(f7);
                }
            }
        }
        J3();
    }

    public final boolean p3(long j10, View view) {
        if (this.f38623l2 && getMessagesController().isForum(j10)) {
            return false;
        }
        Long valueOf = Long.valueOf(j10);
        ArrayList arrayList = this.I2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j10));
            if (view instanceof org.telegram.ui.Cells.p2) {
                ((org.telegram.ui.Cells.p2) view).U(false, true);
            } else if (view instanceof org.telegram.ui.Cells.m6) {
                ((org.telegram.ui.Cells.m6) view).r(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j10));
        if (view instanceof org.telegram.ui.Cells.p2) {
            ((org.telegram.ui.Cells.p2) view).U(true, true);
        } else if (view instanceof org.telegram.ui.Cells.m6) {
            ((org.telegram.ui.Cells.m6) view).r(true, true);
        }
        return true;
    }

    public final boolean p4() {
        if (this.C2 == null && this.f38632n2 == null) {
            return true;
        }
        return false;
    }

    public final void p5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        boolean z12;
        di.h7 f42;
        ArrayList arrayList;
        boolean z13;
        boolean z14;
        int i10;
        float f7;
        float f10;
        if (this.E0 != null && this.I == null) {
            tw twVar = this.G3;
            if ((twVar == null || !twVar.c()) && !this.f38648q3 && (kVar = this.actionBar) != null && !kVar.q() && !this.f38623l2) {
                fi.sb sbVar = fi.sb.F2;
                int i11 = 0;
                if ((sbVar != null && sbVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
                    z10 = false;
                }
                if (!m4() && f4().G()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.Y2 != 0) {
                    z12 = false;
                } else if (m4()) {
                    z12 = !f4().h.isEmpty();
                } else {
                    if (!z11 && (((arrayList = (f42 = f4()).f8634g) != null && arrayList.size() > 0) || f42.H())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z11 = f4().G();
                }
                this.L = z11;
                boolean z15 = this.G0;
                if (!z11 && !z12) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.G0 = z13;
                if (z12 || z13) {
                    qw qwVar = this.E0;
                    if (z13 != z15) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    qwVar.p(z10, z14);
                }
                boolean z16 = this.G0;
                int i12 = 8;
                float f11 = 0.0f;
                if (z16 != z15) {
                    if (z10) {
                        ValueAnimator valueAnimator = this.J;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        if (this.G0 && !isInPreviewMode()) {
                            this.E0.setVisibility(0);
                        }
                        float f12 = this.H0;
                        if (this.G0) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
                        this.J = ofFloat;
                        ofFloat.addUpdateListener(new vi(1, this));
                        this.J.addListener(new org.telegram.ui.Components.h31(this, 25));
                        this.J.setDuration(200L);
                        this.J.setInterpolator(org.telegram.ui.Components.ds.f27586f);
                        this.J.start();
                    } else {
                        qw qwVar2 = this.E0;
                        if (z16 && !isInPreviewMode()) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        qwVar2.setVisibility(i10);
                        if (this.G0) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        this.H0 = f7;
                        View view = this.fragmentView;
                        if (view != null) {
                            view.invalidate();
                        }
                    }
                }
                if (z12 != this.M) {
                    this.M = z12;
                    if (z12) {
                        this.E0.l(1.0f, false);
                    }
                    if (z10 && !isInPreviewMode()) {
                        this.E0.setVisibility(0);
                        float f13 = -this.N;
                        if (!z12) {
                            f11 = b4();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.I = ofFloat2;
                        ofFloat2.addUpdateListener(new hx(this, f13, z12, f11));
                        this.I.addListener(new zw(this, z12, 2));
                        this.I.setDuration(200L);
                        this.I.setInterpolator(org.telegram.ui.Components.ds.f27586f);
                        this.I.start();
                        return;
                    }
                    this.K = z12;
                    qw qwVar3 = this.E0;
                    if ((z12 || this.L) && !isInPreviewMode()) {
                        i12 = 0;
                    }
                    qwVar3.setVisibility(i12);
                    if (!z12) {
                        K4(0.0f);
                    } else {
                        this.y3 = -AndroidUtilities.dp(81.0f);
                        K4(-b4());
                    }
                    while (true) {
                        ay[] ayVarArr = this.f38586e0;
                        if (i11 >= ayVarArr.length) {
                            break;
                        }
                        ay ayVar = ayVarArr[i11];
                        if (ayVar != null) {
                            ayVar.f37913a.requestLayout();
                        }
                        i11++;
                    }
                    View view2 = this.fragmentView;
                    if (view2 != null) {
                        view2.requestLayout();
                        this.fragmentView.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.Z3 = true;
            J4(true);
            return;
        }
        this.f38568a4 = null;
        this.Z3 = false;
        J4(false);
        N4(1.0f);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.r2 r2Var) {
        boolean presentFragment = super.presentFragment(r2Var);
        if (presentFragment && this.f38586e0 != null) {
            int i10 = 0;
            while (true) {
                ay[] ayVarArr = this.f38586e0;
                if (i10 >= ayVarArr.length) {
                    break;
                }
                ayVarArr[i10].d.getClass();
                i10++;
            }
        }
        fi.v3 v3Var = this.f38640p0;
        if (v3Var != null) {
            v3Var.e(true);
        }
        fi.v3 v3Var2 = this.f38645q0;
        if (v3Var2 != null) {
            v3Var2.e(true);
        }
        org.telegram.ui.Components.qc.e();
        return presentFragment;
    }

    public final void q3(ig.p0 p0Var) {
        jx jxVar;
        if (this.f38648q3 && (jxVar = this.C0) != null) {
            ArrayList arrayList = jxVar.C0;
            if (!arrayList.isEmpty()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (p0Var.b((ig.p0) arrayList.get(i10))) {
                        return;
                    }
                }
            }
            arrayList.add(p0Var);
            ox oxVar = this.X;
            ArrayList arrayList2 = oxVar.F;
            arrayList2.add(p0Var);
            oxVar.I = arrayList2.size() - 1;
            oxVar.e();
            this.X.f30367r.getText().clear();
            f5(true, null, null, false, true);
        }
    }

    public final void q5(int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.q5(int, boolean):void");
    }

    public final void r3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            ArrayList arrayList = new ArrayList();
            if (this.W2 == 0 && this.Y2 == 0 && Build.VERSION.SDK_INT >= 33 && ak0.n(parentActivity)) {
                if (z10) {
                    showDialog(new ak0(parentActivity, !org.telegram.ui.Components.xe0.a(), new qv(parentActivity, 1)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            if (getUserConfig().syncContacts && this.U1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z10) {
                    org.telegram.ui.ActionBar.e2 e2Var = org.telegram.ui.Components.g5.v(parentActivity, new kv(this, 1)).f22368a;
                    this.T1 = e2Var;
                    showDialog(e2Var);
                    return;
                }
                arrayList.add("android.permission.READ_CONTACTS");
                arrayList.add("android.permission.WRITE_CONTACTS");
                arrayList.add("android.permission.GET_ACCOUNTS");
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                }
                if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                }
                if (parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                }
            } else if ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
            if (arrayList.isEmpty()) {
                if (this.A0) {
                    this.A0 = false;
                    R4();
                    return;
                }
                return;
            }
            try {
                parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
            } catch (Exception unused) {
            }
        }
    }

    public final void r4(long j10) {
        char c10;
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j10);
        int i10 = 0;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            ArrayList<TLRPC.Dialog> dialogsByCommunity = getMessagesController().getDialogsByCommunity(dialog.community_id);
            if (dialogsByCommunity != null) {
                int size = dialogsByCommunity.size();
                while (i10 < size) {
                    TLRPC.Dialog dialog2 = dialogsByCommunity.get(i10);
                    i10++;
                    r4(dialog2.f22031id);
                }
                return;
            }
            return;
        }
        int i11 = this.f38586e0[0].f37919s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i11 == 7 || i11 == 8) && (!this.actionBar.q() || this.actionBar.r(null))) {
            MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
            if (this.f38586e0[0].f37919s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            dialogFilter = dialogFilterArr[c10];
        }
        this.f38696z3 = 2;
        int i12 = -1;
        if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && !dialogFilter.alwaysShow(this.currentAccount, dialog)) {
            I4(true, true);
            w3();
            if (this.R1 != null) {
                int i13 = 0;
                while (true) {
                    if (i13 >= this.R1.size()) {
                        break;
                    } else if (((TLRPC.Dialog) this.R1.get(i13)).f22031id == j10) {
                        i12 = i13;
                        break;
                    } else {
                        i13++;
                    }
                }
                if (i12 < 0) {
                    I4(false, false);
                }
            }
        }
        int i14 = i12;
        if (getMessagesController().isForum(j10) || getMessagesController().isMonoForumWithManageRights(j10)) {
            getMessagesController().markAllTopicsAsRead(j10);
        }
        getMessagesController().markMentionsAsRead(j10, 0L);
        MessagesController messagesController = getMessagesController();
        int i15 = dialog.top_message;
        messagesController.markDialogAsRead(j10, i15, i15, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i14 >= 0) {
            this.R1.remove(i14);
            this.f38586e0[0].f37921x.D();
            this.f38586e0[0].q(true);
        }
    }

    public final boolean r5(long j10) {
        TLRPC.Chat chat;
        jw jwVar;
        if ((this.S0 <= 1 && ((jwVar = this.B1) == null || jwVar.getVisibility() != 0 || TextUtils.isEmpty(this.B1.getFieldText()))) || !DialogObject.isChatDialog(j10) || (chat = getMessagesController().getChat(Long.valueOf(-j10))) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.g5.t0(this, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null);
        return false;
    }

    @Override
    public final void s() {
        F4(true, true);
    }

    public final void s3(CharSequence charSequence) {
        int i10;
        if (this.B1 != null) {
            if (this.D2 == null && this.E2 == null && this.F2 == null) {
                return;
            }
            if (this.G2 == null) {
                org.telegram.ui.Components.qr0 qr0Var = new org.telegram.ui.Components.qr0(getParentActivity(), getResourceProvider());
                this.G2 = qr0Var;
                qr0Var.setLayoutClickListener(new hv(this, 0));
                this.G2.setOnModeChangeListener(new iv(this, 0));
                jw jwVar = this.B1;
                org.telegram.ui.Components.qr0 qr0Var2 = this.G2;
                if (qr0Var2 == null) {
                    jwVar.getClass();
                } else {
                    jwVar.G1 = qr0Var2;
                    jwVar.addView(qr0Var2, 0, org.telegram.ui.Components.gb1.i(-1, 48, 51));
                    jwVar.f25886g3 = false;
                    jwVar.K();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.G2.getLayoutParams();
                layoutParams.rightMargin = -this.B1.getPaddingRight();
                this.G2.setLayoutParams(layoutParams);
            }
            if (i4()) {
                this.G2.i(this.currentAccount, this.D2);
            } else {
                String str = this.E2;
                if (str != null) {
                    org.telegram.ui.Components.qr0 qr0Var3 = this.G2;
                    qr0Var3.g(this.currentAccount);
                    if (!str.isEmpty()) {
                        qr0Var3.e(str, true);
                    }
                } else {
                    CharSequence charSequence2 = this.F2;
                    if (charSequence2 != null) {
                        org.telegram.ui.Components.qr0 qr0Var4 = this.G2;
                        qr0Var4.g(this.currentAccount);
                        if (charSequence2.length() > 0) {
                            qr0Var4.e(charSequence2, true);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.B1.setFieldText(charSequence);
            }
            jw jwVar2 = this.B1;
            if (i4()) {
                i10 = R.string.AddCaption;
            } else {
                i10 = R.string.ShareComment;
            }
            jwVar2.setOverrideHint(LocaleController.getString(i10));
            D3();
            if (this.G2.getMode() != 0) {
                this.B1.u1(false, false);
            }
            l5();
        }
    }

    public final boolean s4(org.telegram.tgnet.TLRPC.Chat r6, org.telegram.tgnet.TLRPC.User r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.s4(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):boolean");
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        qw qwVar = this.E0;
        if (qwVar != null) {
            if (this.G0 && !z10) {
                qwVar.setVisibility(0);
            } else {
                qwVar.setVisibility(8);
            }
        }
        h5(true);
        c5();
    }

    @Override
    public final void setTitleOverlayText(java.lang.String r6, int r7, java.lang.Runnable r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.setTitleOverlayText(java.lang.String, int, java.lang.Runnable):void");
    }

    public final int t3() {
        if (this.B1 != null) {
            return (int) (this.f38691y1.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(2.0f));
        } else if (this.Y2 != 0) {
            return AndroidUtilities.dp(72.0f) + this.f38601g4;
        } else {
            return this.f38601g4 + this.f38611i4;
        }
    }

    public final boolean t4(TLRPC.User user) {
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.G;
        if (user != null && !UserObject.isReplyUser(user) && !UserObject.isDeleted(user)) {
            Boolean bool = tL_requestPeerTypeUser.bot;
            if (bool == null || bool.booleanValue() == user.bot) {
                Boolean bool2 = tL_requestPeerTypeUser.premium;
                if (bool2 == null || bool2.booleanValue() == user.premium) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean u3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.I2;
            if (i10 < arrayList.size()) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-((Long) arrayList.get(i10)).longValue()));
                if (chat != null && !ChatObject.canSendDocument(chat)) {
                    return false;
                }
                i10++;
            } else {
                return true;
            }
        }
    }

    public final void u4(View view) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        String str = null;
        org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) getParentActivity(), (org.telegram.ui.ActionBar.u6) null, false);
        k3Var.fixNavigationBar();
        if (getMessagesStorage().getArchiveUnreadCount() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = R.drawable.msg_markread;
        } else {
            i10 = 0;
        }
        if (SharedConfig.archiveHidden) {
            i11 = R.drawable.chats_pin;
        } else {
            i11 = R.drawable.chats_unpin;
        }
        int[] iArr = {i10, i11};
        if (z10) {
            str = LocaleController.getString(R.string.MarkAllAsRead);
        }
        if (SharedConfig.archiveHidden) {
            i12 = R.string.PinInTheList;
        } else {
            i12 = R.string.HideAboveTheList;
        }
        CharSequence[] charSequenceArr = {str, LocaleController.getString(i12)};
        n4 n4Var = new n4(this, 1);
        k3Var.items = charSequenceArr;
        k3Var.itemIcons = iArr;
        k3Var.onClickListener = n4Var;
        showDialog(k3Var);
    }

    public final void v3() {
        int themedColor;
        org.telegram.ui.Components.wh0 wh0Var;
        fw fwVar;
        org.telegram.ui.Components.wo0 wo0Var;
        za1 za1Var;
        jx jxVar = this.C0;
        if (jxVar != null && (wo0Var = jxVar.f27936d0) != null && (za1Var = wo0Var.f14084k0) != null) {
            int childCount = za1Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = za1Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.r4) {
                    org.telegram.ui.Cells.r4 r4Var = (org.telegram.ui.Cells.r4) childAt;
                    org.telegram.ui.Components.j9 j9Var = r4Var.f24963c;
                    int i11 = r4Var.h;
                    if (DialogObject.isUserDialog(r4Var.f24964f)) {
                        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(r4Var.f24964f));
                        r4Var.e = user;
                        j9Var.m(i11, user);
                    } else {
                        j9Var.k(i11, MessagesController.getInstance(i11).getChat(Long.valueOf(-r4Var.f24964f)));
                        r4Var.e = null;
                    }
                    r4Var.c(true);
                }
            }
        }
        if (this.f38586e0 != null) {
            int i12 = 0;
            while (true) {
                ay[] ayVarArr = this.f38586e0;
                if (i12 >= ayVarArr.length) {
                    break;
                }
                ay ayVar = ayVarArr[i12];
                if (ayVar != null && (fwVar = ayVar.f37917n) != null) {
                    fwVar.i();
                }
                i12++;
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.A(getThemedColor(org.telegram.ui.ActionBar.y6.G8), true);
            this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.y6.E8), false, true);
            this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.y6.F8), true, true);
            this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.y6.I5), true);
            this.actionBar.updateColors();
        }
        if (this.E3 != null) {
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.y6.f23776zh);
            Drawable drawable = this.L3;
            if (drawable != null && themedColor2 != this.f38688x4) {
                this.f38688x4 = themedColor2;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.Components.r5 r5Var = this.E3;
            if (r5Var != null) {
                r5Var.k(Integer.valueOf(themedColor2));
            }
            org.telegram.ui.Cells.o oVar = this.F3;
            if (oVar != null) {
                oVar.setColor(themedColor2);
            }
        }
        org.telegram.ui.Cells.x2 x2Var = this.M1;
        if (x2Var != null) {
            org.telegram.ui.ActionBar.y6.E1(x2Var.getBackground(), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23448i6, false), true);
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.m0;
        if (w0Var != null) {
            w0Var.setIconColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23694v8));
        }
        jw jwVar = this.B1;
        if (jwVar != null) {
            jwVar.updateColors();
        }
        qx qxVar = this.f38693z0;
        if (qxVar != null) {
            eh.d dVar = qxVar.f32394y0;
            if (dVar != null) {
                dVar.updateColors();
            }
            qxVar.invalidate();
        }
        ig.r0 r0Var = this.f38570b0;
        if (r0Var != null) {
            r0Var.updateColors();
        }
        jx jxVar2 = this.C0;
        if (jxVar2 != null && (wh0Var = jxVar2.f27949r0) != null) {
            wh0Var.c();
        }
        org.telegram.ui.Components.t91 t91Var = this.f38565a0;
        if (t91Var != null) {
            t91Var.updateColors();
        }
        n31 n31Var = this.Z;
        if (n31Var != null) {
            n31Var.updateColors();
        }
        if (this.K0 != null) {
            int o10 = i0.a.o(getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6), 100);
            if (this.K0.getForeground() instanceof ColorDrawable) {
                if (((ColorDrawable) this.K0.getForeground()).getColor() != o10) {
                    ((ColorDrawable) this.K0.getForeground()).setColor(o10);
                }
            } else {
                this.K0.setForeground(new ColorDrawable(o10));
            }
        }
        org.telegram.ui.Components.j20 j20Var = this.f38662t0;
        if (j20Var != null) {
            j20Var.updateColors();
        }
        org.telegram.ui.Components.j20 j20Var2 = this.f38667u0;
        if (j20Var2 != null) {
            j20Var2.updateColors();
        }
        int i13 = org.telegram.ui.ActionBar.y6.f23356d6;
        this.f38634n4.a(getThemedColor(i13));
        org.telegram.ui.Components.ws wsVar = this.J1;
        if (wsVar != null) {
            wsVar.updateColors();
        }
        org.telegram.ui.Components.vs vsVar = this.K1;
        if (vsVar != null) {
            vsVar.setColor(org.telegram.ui.ActionBar.y6.x0(null, i13, false));
        }
        hw hwVar = this.H1;
        if (hwVar != null) {
            hwVar.updateColors();
        }
        hw hwVar2 = this.F1;
        if (hwVar2 != null) {
            hwVar2.updateColors();
        }
        j5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        qw qwVar = this.E0;
        if (qwVar != null) {
            qwVar.o();
        }
        if (this.D3 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.gl)) != this.f38682w4) {
            this.f38682w4 = themedColor;
            this.D3.setColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        }
        ox oxVar = this.X;
        if (oxVar != null) {
            oxVar.updateColors();
        }
    }

    public final void v4(android.view.View r25, int r26, s4.h0 r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.v4(android.view.View, int, s4.h0):void");
    }

    public final void w3() {
        AndroidUtilities.runOnUIThread(new cv(this, 2), 300L);
    }

    public final boolean w4(View view, int i10, float f7, org.telegram.ui.Components.lm0 lm0Var) {
        org.telegram.ui.Components.wo0 wo0Var;
        long j10;
        org.telegram.ui.Components.wo0 wo0Var2;
        TLRPC.EncryptedChat encryptedChat;
        long makeEncryptedDialogId;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.x2) && lm0Var.j(i10) != 21) {
            if (!this.actionBar.q() && !AndroidUtilities.isTablet() && !this.f38623l2 && (view instanceof org.telegram.ui.Cells.p2)) {
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                if (!getMessagesController().isForum(p2Var.getDialogId()) && !this.G3.c() && p2Var.R(f7)) {
                    return P4(p2Var);
                }
            }
            tw twVar = this.G3;
            if (twVar == null || !twVar.c()) {
                jx jxVar = this.C0;
                boolean z10 = true;
                if (jxVar != null && lm0Var == (wo0Var2 = jxVar.f27936d0)) {
                    Object I = wo0Var2.I(i10);
                    if (!this.C0.f27936d0.N) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                        e2Var.R = string;
                        if (I instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) I;
                            if (chat.monoforum) {
                                e2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, pg.d.i(chat, this.currentAccount, false));
                            } else {
                                e2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, chat.title);
                            }
                            makeEncryptedDialogId = -chat.f22027id;
                        } else if (I instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) I;
                            if (user.f22176id == getUserConfig().clientUserId) {
                                e2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, LocaleController.getString(R.string.SavedMessages));
                            } else {
                                e2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user.first_name, user.last_name));
                            }
                            makeEncryptedDialogId = user.f22176id;
                        } else if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(((TLRPC.EncryptedChat) I).user_id));
                            e2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user2.first_name, user2.last_name));
                            makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.f22035id);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new di.d1(this, makeEncryptedDialogId, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        showDialog(e2Var);
                        TextView textView = (TextView) e2Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23598q7, getResourceProvider());
                        }
                        return true;
                    }
                }
                jx jxVar2 = this.C0;
                if (jxVar2 != null && lm0Var == (wo0Var = jxVar2.f27936d0)) {
                    if (this.f38623l2) {
                        v4(view, i10, lm0Var);
                        return false;
                    }
                    if ((view instanceof org.telegram.ui.Cells.m6) && !wo0Var.N(i10)) {
                        j10 = ((org.telegram.ui.Cells.m6) view).getDialogId();
                    } else {
                        j10 = 0;
                    }
                    if (j10 != 0) {
                        U4(j10, view);
                        return true;
                    }
                } else {
                    Object J = ((ig.n) lm0Var).J(i10);
                    if (J instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                        if (this.f38623l2) {
                            if ((this.R0 == 3 || Q3()) && r5(dialog.f22031id)) {
                                if (this.R0 == 1 && Q3() && this.f38626m2 && getMessagesController().isForum(dialog.f22031id)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -dialog.f22031id);
                                    bundle.putBoolean("for_select", true);
                                    bundle.putBoolean("forward_to", true);
                                    if (this.R0 != 1) {
                                        z10 = false;
                                    }
                                    bundle.putBoolean("bot_share_to", z10);
                                    bundle.putBoolean("quote", this.O0);
                                    bundle.putBoolean("reply_to", this.N0);
                                    af1 af1Var = new af1(bundle);
                                    af1Var.L0 = this;
                                    presentFragment(af1Var);
                                    return false;
                                }
                                p3(dialog.f22031id, view);
                                k5();
                                return true;
                            }
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                            u4(view);
                            return false;
                        } else if (!this.actionBar.q() || !o4(dialog)) {
                            U4(dialog.f22031id, view);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean x3(long j10) {
        int i10;
        int i11 = this.R0;
        if (i11 != 15 && i11 != 16 && this.f38604h2 == null && this.f38659s2) {
            if (DialogObject.isChatDialog(j10)) {
                long j11 = -j10;
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j11));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    if (this.f38647q2 || !ChatObject.isCanWriteToChannel(j11, this.currentAccount) || (i10 = this.T0) == 2 || i10 == 3) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.SendMessageTitle);
                        int i12 = this.T0;
                        if (i12 == 3) {
                            alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.TodoCantForward);
                        } else if (i12 == 2) {
                            alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.PublicPollCantForward);
                        } else {
                            alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.ChannelCantSendMessage);
                        }
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        showDialog(alertDialog$Builder.f22368a);
                        return false;
                    }
                    return true;
                }
                return true;
            } else if (DialogObject.isEncryptedDialog(j10)) {
                if (this.T0 != 0 || this.U0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.f22368a.R = LocaleController.getString(R.string.SendMessageTitle);
                    int i13 = this.T0;
                    if (i13 == 3) {
                        alertDialog$Builder2.f22368a.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
                    } else if (i13 != 0) {
                        alertDialog$Builder2.f22368a.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
                    } else {
                        alertDialog$Builder2.f22368a.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
                    }
                    alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    showDialog(alertDialog$Builder2.f22368a);
                    return false;
                }
                return true;
            } else {
                return true;
            }
        }
        return true;
    }

    public final void x4(View view) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new bv(0));
        org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(this, view);
        if (arrayList.size() > 0) {
            if (H.x() > 0) {
                H.k();
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                int intValue = ((Integer) obj).intValue();
                if (this.currentAccount == intValue) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                int i12 = org.telegram.ui.ActionBar.y6.f23448i6;
                Drawable Z = org.telegram.ui.ActionBar.y6.Z(getThemedColor(i12), 0, 0);
                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
                org.telegram.ui.ActionBar.u6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(Z);
                org.telegram.ui.ActionBar.f7.k(linearLayout, Z, null, N, resourceProvider);
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
                j9Var.r(currentUser);
                org.telegram.ui.Components.gh0 gh0Var = new org.telegram.ui.Components.gh0(this, getParentActivity(), z10);
                linearLayout.addView(gh0Var, org.telegram.ui.Components.gb1.x(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(getParentActivity());
                if (z10) {
                    y9Var.setScaleX(0.833f);
                    y9Var.setScaleY(0.833f);
                }
                y9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                y9Var.getImageReceiver().setCurrentAccount(intValue);
                y9Var.f(currentUser, j9Var);
                gh0Var.addView(y9Var, org.telegram.ui.Components.gb1.x(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23464j5, getResourceProvider());
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, org.telegram.ui.Components.gb1.t(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new bi.pa(this, intValue, H, 14));
                H.r(linearLayout, org.telegram.ui.Components.gb1.r(230, 48));
            }
        }
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(24.0f), getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6));
        c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.y6.o1(0.15f, -16777216));
        H.f29874z.set(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        H.W(c02);
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        H.V(5);
        H.Z();
    }

    @Override
    public final hh.d y() {
        return this.f38628m4;
    }

    public final void y3(boolean z10) {
        ji.j jVar;
        TLRPC.ChatFull chatFull;
        boolean z11;
        org.telegram.ui.Components.ws wsVar = this.J1;
        if (wsVar != null && (jVar = this.Q1) != null && (chatFull = this.f38567a3) != null) {
            if (this.Y2 != 0 && chatFull.requests_pending > 0 && !this.f38569b.f19327f) {
                z11 = true;
            } else {
                z11 = false;
            }
            wsVar.i(jVar, z11, z10);
            this.Q1.setTitle(LocaleController.formatPluralString("CommunityPendingRequestsRow", this.f38567a3.requests_pending, new Object[0]));
        }
    }

    public final void y4(int i10, long j10, TLRPC.Chat chat, boolean z10, boolean z11) {
        if (i10 == 103) {
            getMessagesController().deleteDialog(j10, 1, z11);
            return;
        }
        if (chat != null) {
            if (ChatObject.isNotInChat(chat)) {
                getMessagesController().deleteDialog(j10, 0, z11);
            } else {
                getMessagesController().deleteParticipantFromChat(-j10, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), (TLRPC.Chat) null, z11, false);
            }
        } else {
            getMessagesController().deleteDialog(j10, 0, z11);
            if (z10 && z11) {
                getMessagesController().blockPeer(j10);
            }
        }
        if (AndroidUtilities.isTablet()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(j10));
        }
        getMessagesController().checkIfFolderEmpty(this.W2);
    }

    @Override
    public final void z(float f7, int i10) {
        org.telegram.ui.ActionBar.w0 w0Var;
        if (i10 == 3 && (w0Var = this.f38622l0) != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) w0Var.getIconView().getDrawable();
            if (this.d.f19327f) {
                animatedVectorDrawable.start();
                if (SharedConfig.getDevicePerformanceClass() != 0) {
                    TLRPC.TL_help_premiumPromo premiumPromo = MediaDataController.getInstance(this.currentAccount).getPremiumPromo();
                    String m0 = PremiumPreviewFragment.m0(2);
                    if (premiumPromo != null) {
                        int i11 = 0;
                        while (true) {
                            if (i11 < premiumPromo.video_sections.size()) {
                                if (premiumPromo.video_sections.get(i11).equals(m0)) {
                                    break;
                                }
                                i11++;
                            } else {
                                i11 = -1;
                                break;
                            }
                        }
                        if (i11 != -1) {
                            FileLoader.getInstance(this.currentAccount).loadFile(premiumPromo.videos.get(i11), premiumPromo, 3, 0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            animatedVectorDrawable.reset();
        }
    }

    public final void z3(ay ayVar) {
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        int i10;
        boolean z14;
        int L0 = ayVar.f37915c.L0();
        int N0 = ayVar.f37915c.N0();
        if (!this.f38605h3 && !this.f38627m3) {
            qx qxVar = this.f38693z0;
            if (qxVar == null || qxVar.getVisibility() != 0 || !this.f38693z0.O) {
                int abs = Math.abs(N0 - L0) + 1;
                if (N0 != -1) {
                    s4.e1 K = ayVar.f37913a.K(N0);
                    if (K != null && K.f47741f == 11) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.f38572b2 = z14;
                    if (z14) {
                        k4(false);
                    }
                } else {
                    this.f38572b2 = false;
                }
                int i11 = ayVar.f37919s;
                if (i11 == 7 || i11 == 8) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
                    int i12 = ayVar.h;
                    if (i12 >= 0 && i12 < dialogFilters.size() && (dialogFilters.get(ayVar.h).flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) == 0 && ((abs > 0 && N0 >= Z3(this.currentAccount, ayVar.f37919s, 1, this.S1).size() - 10) || (abs == 0 && !getMessagesController().isDialogsEndReached(1)))) {
                        boolean isDialogsEndReached = getMessagesController().isDialogsEndReached(1);
                        boolean z15 = !isDialogsEndReached;
                        if (isDialogsEndReached && getMessagesController().isServerDialogsEndReached(1)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        z11 = z15;
                        if ((abs <= 0 && N0 >= Z3(this.currentAccount, ayVar.f37919s, this.W2, this.S1).size() - 10) || (abs == 0 && (((i10 = ayVar.f37919s) == 7 || i10 == 8) && !getMessagesController().isDialogsEndReached(this.W2)))) {
                            boolean isDialogsEndReached2 = getMessagesController().isDialogsEndReached(this.W2);
                            boolean z16 = !isDialogsEndReached2;
                            if (isDialogsEndReached2 && getMessagesController().isServerDialogsEndReached(this.W2)) {
                                z13 = z16;
                                z12 = false;
                            } else {
                                z13 = z16;
                                z12 = true;
                            }
                        } else {
                            z12 = false;
                            z13 = false;
                        }
                        if (!z12 || z10) {
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    cy cyVar = cy.this;
                                    if (z12) {
                                        cyVar.getMessagesController().loadDialogs(cyVar.W2, -1, 100, z13);
                                    }
                                    if (z10) {
                                        cyVar.getMessagesController().loadDialogs(1, -1, 100, z11);
                                    } else {
                                        cyVar.getClass();
                                    }
                                }
                            });
                        }
                        return;
                    }
                }
                z10 = false;
                z11 = false;
                if (abs <= 0) {
                }
                z12 = false;
                z13 = false;
                if (!z12) {
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        cy cyVar = cy.this;
                        if (z12) {
                            cyVar.getMessagesController().loadDialogs(cyVar.W2, -1, 100, z13);
                        }
                        if (z10) {
                            cyVar.getMessagesController().loadDialogs(1, -1, 100, z11);
                        } else {
                            cyVar.getClass();
                        }
                    }
                });
            }
        }
    }

    public final void z4(java.util.ArrayList r43, int r44, boolean r45, boolean r46, java.util.HashSet r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.z4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    @Override
    public final void D() {
    }
}

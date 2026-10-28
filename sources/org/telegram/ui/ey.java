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
public class ey extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate, og.b, oe.d, qg0 {
    public static float B4;
    public static boolean f38974y4;
    public boolean A0;
    public FrameLayout A1;
    public boolean A2;
    public boolean A3;
    public int B0;
    public lw B1;
    public boolean B2;
    public boolean B3;
    public mx C0;
    public li.w1 C1;
    public xx C2;
    public Long C3;
    public org.telegram.ui.Components.tv0 D0;
    public org.telegram.ui.ActionBar.w0 D1;
    public ArrayList D2;
    public Drawable D3;
    public boolean E;
    public sw E0;
    public final TextPaint E1;
    public String E2;
    public org.telegram.ui.Components.r5 E3;
    public boolean F;
    public org.telegram.ui.Components.us F0;
    public jw F1;
    public CharSequence F2;
    public org.telegram.ui.Cells.o F3;
    public TLRPC.RequestPeerType G;
    public boolean G0;
    public FrameLayout G1;
    public org.telegram.ui.Components.rr0 G2;
    public vw G3;
    public long H;
    public float H0;
    public jw H1;
    public org.telegram.ui.Components.d71 H2;
    public final kw H3;
    public ValueAnimator I;
    public float I0;
    public FrameLayout I1;
    public final ArrayList I2;
    public final kw I3;
    public ValueAnimator J;
    public float J0;
    public org.telegram.ui.Components.ws J1;
    public boolean J2;
    public og0 J3;
    public boolean K;
    public bi.cc K0;
    public org.telegram.ui.Components.vs K1;
    public int K2;
    public NotificationCenter.ObserversGroup K3;
    public boolean L;
    public org.telegram.ui.Components.l80 L0;
    public org.telegram.ui.Cells.m L1;
    public int L2;
    public Drawable L3;
    public boolean M;
    public xw M0;
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
    public pu R3;
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
    public org.telegram.ui.Components.ud0 V0;
    public boolean V1;
    public boolean V2;
    public CharSequence V3;
    public boolean W;
    public org.telegram.ui.Cells.p2 W0;
    public long W1;
    public int W2;
    public boolean W3;
    public rx X;
    public org.telegram.ui.Cells.p2 X0;
    public TLObject X1;
    public ey X2;
    public float X3;
    public ag.u0 Y;
    public boolean Y0;
    public int Y1;
    public long Y2;
    public boolean Y3;
    public p31 Z;
    public boolean Z0;
    public int Z1;
    public TLRPC.Chat Z2;
    public boolean Z3;
    public final int f38976a;
    public org.telegram.ui.Components.u91 f38977a0;
    public final ArrayList f38978a1;
    public boolean a2;
    public TLRPC.ChatFull f38979a3;
    public ValueAnimator f38980a4;
    public final oe.b f38981b;
    public ig.r0 f38982b0;
    public boolean f38983b1;
    public boolean f38984b2;
    public org.telegram.ui.Components.y9 f38985b3;
    public org.telegram.ui.Components.g50 f38986b4;
    public final oe.b f38987c;
    public float f38988c0;
    public boolean f38989c1;
    public boolean f38990c2;
    public org.telegram.ui.Components.j9 f38991c3;
    public TLRPC.FileLocation f38992c4;
    public final oe.b d;
    public ValueAnimator f38993d0;
    public boolean f38994d1;
    public int f38995d2;
    public long f38996d3;
    public TLRPC.FileLocation f38997d4;
    public final oe.b e;
    public dy[] f38998e0;
    public org.telegram.ui.ActionBar.j2 f38999e1;
    public boolean f39000e2;
    public boolean f39001e3;
    public org.telegram.ui.Components.qc f39002e4;
    public final oe.b f39003f;
    public org.telegram.ui.ActionBar.w0 f39004f0;
    public final Paint f39005f1;
    public String f39006f2;
    public boolean f39007f3;
    public int f39008f4;
    public org.telegram.ui.ActionBar.w0 f39009g0;
    public ImageView f39010g1;
    public String f39011g2;
    public AnimatorSet f39012g3;
    public int f39013g4;
    public final oe.b h;
    public gy f39014h0;
    public NumberTextView f39015h1;
    public String f39016h2;
    public boolean f39017h3;
    public int f39018h4;
    public boolean f39019i0;
    public final ArrayList f39020i1;
    public boolean f39021i2;
    public boolean f39022i3;
    public int f39023i4;
    public org.telegram.ui.ActionBar.w0 f39024j0;
    public org.telegram.ui.ActionBar.w0 f39025j1;
    public boolean f39026j2;
    public float f39027j3;
    public int f39028j4;
    public org.telegram.ui.ActionBar.w0 f39029k0;
    public org.telegram.ui.ActionBar.w0 f39030k1;
    public boolean f39031k2;
    public boolean f39032k3;
    public final ch.f f39033k4;
    public org.telegram.ui.ActionBar.w0 f39034l0;
    public org.telegram.ui.ActionBar.w0 l1;
    public boolean f39035l2;
    public int f39036l3;
    public final hh.d l4;
    public org.telegram.ui.ActionBar.w0 m0;
    public org.telegram.ui.ActionBar.w0 f39037m1;
    public boolean f39038m2;
    public boolean f39039m3;
    public final hh.d f39040m4;
    public final oe.b f39041n;
    public org.telegram.ui.Components.fj0 f39042n0;
    public org.telegram.ui.ActionBar.g1 f39043n1;
    public String f39044n2;
    public boolean f39045n3;
    public final hh.c f39046n4;
    public org.telegram.ui.ActionBar.g1 f39047o0;
    public org.telegram.ui.ActionBar.g1 f39048o1;
    public String f39049o2;
    public org.telegram.ui.Components.qc f39050o3;
    public final ch.b f39051o4;
    public fi.v3 f39052p0;
    public org.telegram.ui.ActionBar.g1 f39053p1;
    public final MessagesStorage.TopicKey f39054p2;
    public final AnimationNotificationsLocker f39055p3;
    public final ch.b f39056p4;
    public fi.v3 f39057q0;
    public org.telegram.ui.ActionBar.g1 f39058q1;
    public boolean f39059q2;
    public boolean f39060q3;
    public final ch.b f39061q4;
    public final oe.b f39062r;
    public boolean f39063r0;
    public org.telegram.ui.ActionBar.g1 f39064r1;
    public boolean f39065r2;
    public boolean f39066r3;
    public final ch.b f39067r4;
    public final oe.b f39068s;
    public boolean f39069s0;
    public org.telegram.ui.ActionBar.g1 f39070s1;
    public boolean f39071s2;
    public boolean f39072s3;
    public vv f39073s4;
    public org.telegram.ui.Components.j20 f39074t0;
    public org.telegram.ui.ActionBar.g1 f39075t1;
    public boolean f39076t2;
    public boolean f39077t3;
    public final ArrayList f39078t4;
    public org.telegram.ui.Components.j20 f39079u0;
    public float f39080u1;
    public boolean f39081u2;
    public float f39082u3;
    public final RectF f39083u4;
    public final rh.i v;
    public fi.d f39084v0;
    public float f39085v1;
    public boolean f39086v2;
    public ValueAnimator f39087v3;
    public final RectF f39088v4;
    public boolean f39089w;
    public lh.f f39090w0;
    public AnimatorSet f39091w1;
    public boolean f39092w2;
    public float f39093w3;
    public int f39094w4;
    public int f39095x;
    public int f39096x0;
    public float f39097x1;
    public boolean f39098x2;
    public float f39099x3;
    public int f39100x4;
    public boolean f39101y;
    public final UndoView[] f39102y0;
    public jh.f f39103y1;
    public boolean f39104y2;
    public float y3;
    public tx f39105z0;
    public FrameLayout f39106z1;
    public boolean f39107z2;
    public int f39108z3;
    public static final boolean[] f38975z4 = new boolean[4];
    public static final org.telegram.ui.Components.rs0 A4 = new org.telegram.ui.Components.rs0(3);

    public ey(Bundle bundle) {
        super(bundle);
        int i10;
        int dp;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f38976a = i10;
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        this.f38981b = new oe.b(1, this, dsVar, 350L, false);
        this.f38987c = new oe.b(2, this, dsVar, 350L, false);
        this.d = new oe.b(3, this, dsVar, 350L, false);
        this.e = new oe.b(4, this, dsVar, 350L, false);
        this.f39003f = new oe.b(5, this, dsVar, 350L, false);
        this.h = new oe.b(6, this, dsVar, 350L, false);
        this.f39041n = new oe.b(7, this, dsVar, 350L, false);
        this.f39062r = new oe.b(8, this, dsVar, 350L, false);
        this.f39068s = new oe.b(9, this, dsVar, 350L, false);
        this.v = new rh.i(new uv(this, 2));
        this.f39095x = -1;
        this.F = true;
        this.K = false;
        this.L = false;
        this.M = false;
        this.Q = true;
        this.f38988c0 = 1.0f;
        this.f39102y0 = new UndoView[2];
        this.f38978a1 = new ArrayList();
        this.f39005f1 = new Paint();
        this.f39020i1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.E1 = new TextPaint(1);
        this.U1 = true;
        this.f38990c2 = true;
        this.f39021i2 = true;
        this.f39054p2 = new MessagesStorage.TopicKey();
        this.I2 = new ArrayList();
        this.J2 = true;
        this.f39055p3 = new AnimationNotificationsLocker();
        this.f39108z3 = -1;
        this.H3 = new kw(this, 0);
        this.I3 = new kw(this, 1);
        this.M3 = -4;
        this.N3 = true;
        this.O3 = true;
        this.X3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.f39078t4 = arrayList;
        RectF rectF = new RectF();
        this.f39083u4 = rectF;
        RectF rectF2 = new RectF();
        this.f39088v4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        hh.c d = this.glassEngine.d(new kv(this, 11));
        this.f39046n4 = d;
        if (i11 >= 31) {
            ch.f fVar = new ch.f();
            this.f39033k4 = fVar;
            hh.d dVar = new hh.d(d);
            this.f39040m4 = dVar;
            dVar.f12840f = d;
            dVar.d = fVar;
            dVar.e = -2;
            hh.d dVar2 = new hh.d(null);
            this.l4 = dVar2;
            dVar2.f12840f = d;
            dVar2.d = fVar;
            dVar2.e = -3;
            ch.b bVar = new ch.b(dVar);
            this.f39061q4 = bVar;
            bVar.f6303i = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                dp = AndroidUtilities.dp(8.0f);
            } else {
                dp = AndroidUtilities.dp(48.0f);
            }
            bVar.f6299b = dp;
            bVar.f6300c = dp;
            ch.b bVar2 = new ch.b(dVar2);
            this.f39051o4 = bVar2;
            bVar2.f6303i = LiteMode.isEnabled(262144);
            int dp2 = AndroidUtilities.dp(48.0f);
            bVar2.f6299b = dp2;
            bVar2.f6300c = dp2;
            this.f39056p4 = new ch.b(dVar2);
        } else {
            this.f39033k4 = null;
            this.l4 = null;
            this.f39040m4 = null;
            this.f39051o4 = new ch.b(d);
            this.f39061q4 = new ch.b(d);
            this.f39056p4 = new ch.b(d);
        }
        ch.b bVar3 = new ch.b(d);
        this.f39067r4 = bVar3;
        ch.b bVar4 = this.f39061q4;
        oi.q qVar = this.glassEngine;
        bVar4.h = qVar;
        this.f39051o4.h = qVar;
        this.f39056p4.h = qVar;
        bVar3.h = qVar;
    }

    public static void A0(ey eyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
            LaunchActivity.H0(launchActivity, eyVar.currentAccount, tL_attachMenuBot, null, true);
        } else {
            mi1.a(eyVar.getParentActivity(), new y(eyVar, tL_attachMenuBot, launchActivity, 8), null);
        }
    }

    public static void B0(ey eyVar) {
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        eyVar.c5();
        org.telegram.ui.Components.qc J = org.telegram.ui.Components.wc.b0(eyVar).J(R.raw.chats_infotip, LocaleController.getString(R.string.BirthdaySetupLater), LocaleController.getString(R.string.Settings), new ev(eyVar, 1));
        J.f31861j = 5000;
        J.j();
    }

    public static void C0(ey eyVar) {
        boolean z10 = true;
        try {
            ((org.telegram.ui.Components.yj0) ((org.telegram.ui.Components.j9) eyVar.M1.h.getImageReceiver().getStaticThumb()).K).H(true);
        } catch (Exception unused) {
        }
        if (eyVar.f38986b4 == null) {
            org.telegram.ui.Components.g50 g50Var = new org.telegram.ui.Components.g50(0, true, true);
            eyVar.f38986b4 = g50Var;
            g50Var.H = true;
            g50Var.f28388a = eyVar;
            g50Var.f28389b = new qx(eyVar);
            eyVar.getMediaDataController().checkFeaturedStickers();
            eyVar.getMessagesController().loadSuggestedFilters();
            eyVar.getMessagesController().loadUserInfo(eyVar.getUserConfig().getCurrentUser(), true, eyVar.classGuid);
        }
        TLRPC.User user = MessagesController.getInstance(eyVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(eyVar.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(eyVar.currentAccount).getCurrentUser();
        }
        if (user != null) {
            org.telegram.ui.Components.ti tiVar = eyVar.f38986b4.f28390c;
            if (tiVar != null) {
                tiVar.h1();
            }
            org.telegram.ui.Components.g50 g50Var2 = eyVar.f38986b4;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z10 = false;
            }
            g50Var2.n(z10, new ev(eyVar, 0), new fv(eyVar, 0), 0);
        }
    }

    public static void D0(ey eyVar, float f7, ValueAnimator valueAnimator) {
        eyVar.f38998e0[0].setTranslationY((1.0f - eyVar.f39082u3) * f7);
        eyVar.f39082u3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i10 = 0; i10 < eyVar.actionBar.getChildCount(); i10++) {
            if (eyVar.actionBar.getChildAt(i10).getVisibility() == 0 && eyVar.actionBar.getChildAt(i10) != eyVar.actionBar.getActionMode() && eyVar.actionBar.getChildAt(i10) != eyVar.actionBar.getBackButton()) {
                eyVar.actionBar.getChildAt(i10).setAlpha(1.0f - eyVar.f39082u3);
            }
        }
        eyVar.M3();
        eyVar.E3();
        View view = eyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void E0(ey eyVar) {
        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(eyVar.getParentActivity(), eyVar.resourceProvider);
        ybVar.d(R.raw.email_check_inbox, new String[0]);
        ybVar.f35028b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
        org.telegram.ui.Components.qc.g(eyVar, ybVar, 2750).j();
        try {
            eyVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void F0(ey eyVar, BirthdayController.BirthdayState birthdayState) {
        if (birthdayState.today.size() == 1) {
            zh.p1 p1Var = new zh.p1(eyVar.getParentActivity(), eyVar.currentAccount, birthdayState.today.get(0).f22177id, null, null);
            p1Var.V(true);
            eyVar.showDialog(p1Var);
            return;
        }
        vg.n1.e0(0, birthdayState);
    }

    public static void G0(ey eyVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.qc M = org.telegram.ui.Components.wc.b0(eyVar).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
            M.f31861j = 5000;
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
            eyVar.getMessagesStorage().updateUserInfo(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (eyVar.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eyVar.getParentActivity(), 0, eyVar.resourceProvider);
                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                eyVar.showDialog(alertDialog$Builder.f22369a);
                return;
            }
            return;
        }
        org.telegram.messenger.t.q(R.string.UnknownError, org.telegram.ui.Components.wc.b0(eyVar), R.raw.error, 36);
    }

    public static void H0(ey eyVar) {
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        eyVar.c5();
    }

    public static void U2(ey eyVar, float f7) {
        float f10;
        float f11;
        int i10;
        int i11;
        float clamp = Utilities.clamp(eyVar.f39097x1 * 2.0f, 1.0f, 0.0f);
        sw swVar = eyVar.E0;
        float f12 = (1.0f - eyVar.f39082u3) * f7 * eyVar.H0;
        float f13 = 1.0f - clamp;
        swVar.setAlpha(f12 * f13);
        int i12 = 0;
        if (!eyVar.K && !eyVar.M) {
            if (eyVar.L) {
                eyVar.E0.setTranslationY((Math.max(eyVar.N, -eyVar.c4()) + (-AndroidUtilities.dp(81.0f))) - AndroidUtilities.dp(8.0f));
                eyVar.E0.setProgressToCollapse(1.0f);
                sw swVar2 = eyVar.E0;
                swVar2.setClipTop((int) (AndroidUtilities.statusBarHeight - swVar2.getY()));
            }
            f10 = 1.0f - eyVar.H0;
            eyVar.actionBar.setTranslationY(0.0f);
        } else {
            float clamp2 = Utilities.clamp((-eyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
            if (eyVar.f39082u3 == 1.0f) {
                clamp2 = 1.0f;
            }
            float clamp3 = Utilities.clamp(clamp2 / 0.5f, 1.0f, 0.0f);
            eyVar.E0.setClipTop(0);
            if (!eyVar.K && eyVar.M) {
                eyVar.E0.setTranslationY((-AndroidUtilities.dp(81.0f)) - AndroidUtilities.dp(8.0f));
                eyVar.E0.setProgressToCollapse(1.0f);
                f11 = eyVar.H0;
            } else {
                eyVar.E0.setTranslationY(((eyVar.T / 2.0f) + (Math.max(eyVar.N, -eyVar.c4()) + eyVar.f39093w3)) - AndroidUtilities.dp(8.0f));
                eyVar.E0.l(clamp2, !eyVar.G3.c());
                if (!eyVar.M) {
                    f11 = eyVar.H0;
                } else {
                    f10 = 1.0f - clamp3;
                    eyVar.actionBar.setTranslationY(0.0f);
                }
            }
            f10 = 1.0f - f11;
            eyVar.actionBar.setTranslationY(0.0f);
        }
        float f14 = f10 * f13;
        if (f14 != 1.0f) {
            eyVar.actionBar.getTitlesContainer().setPivotY(AndroidUtilities.statusBarHeight);
            eyVar.actionBar.getTitlesContainer().setPivotX(AndroidUtilities.dp(20.0f));
            float f15 = (0.6f * f14) + 0.4f;
            eyVar.actionBar.getTitlesContainer().setScaleY(f15);
            eyVar.actionBar.getTitlesContainer().setScaleX(f15);
            eyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
            eyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-AndroidUtilities.dp(30.0f));
            eyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f15);
            eyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f15);
            float f16 = (1.0f - eyVar.f39082u3) * f14;
            eyVar.actionBar.getTitlesContainer().setAlpha(f16);
            FrameLayout titlesContainer = eyVar.actionBar.getTitlesContainer();
            int i13 = (f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1));
            if (i13 > 0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            titlesContainer.setVisibility(i11);
            eyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f16);
            FrameLayout additionalSubTitleOverlayContainer = eyVar.actionBar.getAdditionalSubTitleOverlayContainer();
            if (i13 <= 0) {
                i12 = 4;
            }
            additionalSubTitleOverlayContainer.setVisibility(i12);
            return;
        }
        eyVar.actionBar.getTitlesContainer().setScaleY(1.0f);
        eyVar.actionBar.getTitlesContainer().setScaleX(1.0f);
        eyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
        eyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
        float f17 = 1.0f - eyVar.f39082u3;
        eyVar.actionBar.getTitlesContainer().setAlpha(f17);
        FrameLayout titlesContainer2 = eyVar.actionBar.getTitlesContainer();
        int i14 = (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1));
        if (i14 > 0) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        titlesContainer2.setVisibility(i10);
        eyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f17);
        FrameLayout additionalSubTitleOverlayContainer2 = eyVar.actionBar.getAdditionalSubTitleOverlayContainer();
        if (i14 <= 0) {
            i12 = 4;
        }
        additionalSubTitleOverlayContainer2.setVisibility(i12);
    }

    public static void V(ey eyVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, tL_pendingSuggestion.suggestion);
        eyVar.c5();
    }

    public static void V2(ey eyVar, Canvas canvas, int i10) {
        org.telegram.ui.ActionBar.j5 j5Var;
        if (eyVar.parentLayout != null && eyVar.actionBar != null) {
            float max = Math.max(eyVar.e.e, eyVar.d4());
            float f7 = 1.0f;
            float f10 = 1.0f - eyVar.f39097x1;
            float f11 = max * f10 * f10;
            int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            if (i11 != 0) {
                if (-1 >= i10) {
                    f7 = 0.0f;
                    i10 = -1;
                }
                if (f7 > 0.0f && i11 > 0 && i10 > 0 && (j5Var = eyVar.parentLayout) != null) {
                    ((ActionBarLayout) j5Var).p(canvas, (int) (f7 * 255.0f * f11), i10);
                }
            }
        }
    }

    public static void W(ey eyVar, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        eyVar.f39082u3 = floatValue;
        eyVar.f38998e0[0].setTranslationY((-f7) * floatValue);
        for (int i10 = 0; i10 < eyVar.actionBar.getChildCount(); i10++) {
            if (eyVar.actionBar.getChildAt(i10).getVisibility() == 0 && eyVar.actionBar.getChildAt(i10) != eyVar.actionBar.getActionMode() && eyVar.actionBar.getChildAt(i10) != eyVar.actionBar.getBackButton()) {
                eyVar.actionBar.getChildAt(i10).setAlpha(1.0f - eyVar.f39082u3);
            }
        }
        View view = eyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        eyVar.M3();
        eyVar.E3();
    }

    public static void X(ey eyVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(eyVar.currentAccount).getClientUserId());
        eyVar.presentFragment(new wn(bundle));
    }

    public static void Y(ey eyVar) {
        ArrayList arrayList = eyVar.I2;
        org.telegram.ui.ActionBar.j5 j5Var = eyVar.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).x()) {
            eyVar.finishPreviewFragment();
        } else if (eyVar.R0 == 10) {
            if (eyVar.C2 != null && !arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i10)).longValue(), 0L));
                }
                eyVar.C2.v(eyVar, arrayList2, null, false, eyVar.J2, eyVar.K2, eyVar.L2, null);
            }
        } else if (MessagesController.getInstance(eyVar.currentAccount).isFrozen()) {
            b.b(eyVar.currentAccount);
        } else {
            eyVar.presentFragment(new ContactsActivity(a1.g.i("destroyAfterSelect", true)));
        }
    }

    public static org.telegram.ui.Cells.p2 Y3(dy dyVar) {
        zx zxVar = dyVar.f38702a;
        for (int i10 = 0; i10 < zxVar.getChildCount(); i10++) {
            View childAt = zxVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.p2) {
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) childAt;
                if (p2Var.O()) {
                    return p2Var;
                }
            }
        }
        return null;
    }

    public static void Z(ey eyVar) {
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
        eyVar.c5();
    }

    public static void a0(ey eyVar) {
        PasskeysActivity.b0(eyVar.currentAccount, eyVar.getParentActivity(), eyVar.resourceProvider, true);
    }

    public static void b0(ey eyVar, TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = eyVar.getMessagesController().getUserFull(eyVar.getUserConfig().getClientUserId());
        if (userFull != null) {
            tL_birthday2 = userFull.birthday;
        } else {
            tL_birthday2 = null;
        }
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        eyVar.getMessagesController().invalidateContentSettings();
        eyVar.getConnectionsManager().sendRequest(updatebirthday, new ea(eyVar, userFull, tL_birthday2, 8), 1024);
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        eyVar.c5();
    }

    public static void c0(ey eyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(eyVar.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(eyVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new ea(eyVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void d0(ey eyVar, String str) {
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, str);
        eyVar.c5();
    }

    public static void e0(ey eyVar, dy dyVar, View view, int i10) {
        int i11;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        if (view instanceof org.telegram.ui.Cells.z3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.p2;
        if (z10) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
            if (p2Var.f24696n2) {
                eyVar.V4(p2Var.getDialogId(), view);
                return;
            }
        }
        if (eyVar.Q3()) {
            eyVar.w4(view, i10, 0.0f, dyVar.d);
            return;
        }
        int i12 = eyVar.R0;
        if (i12 == 15 && (view instanceof org.telegram.ui.Cells.v8)) {
            dyVar.d.L();
            return;
        }
        int i13 = 0;
        if ((i12 == 11 || i12 == 13) && i10 == 1) {
            Bundle i14 = a1.g.i("forImport", true);
            i14.putLongArray("result", new long[]{eyVar.getUserConfig().getClientUserId()});
            i14.putInt("chatType", 4);
            String string = eyVar.arguments.getString("importTitle");
            if (string != null) {
                i14.putString("title", string);
            }
            z60 z60Var = new z60(i14);
            z60Var.Y = new fw(eyVar);
            eyVar.presentFragment(z60Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.x2) && ((i11 = dyVar.f38708s) == 7 || i11 == 8)) {
            ig.l lVar = (ig.l) dyVar.d.M.get(0);
            if (lVar != null && lVar.f47075a == 17) {
                tL_chatlists_chatlistUpdates = lVar.f14152i;
            } else {
                tL_chatlists_chatlistUpdates = null;
            }
            if (tL_chatlists_chatlistUpdates != null) {
                MessagesController.DialogFilter dialogFilter = eyVar.getMessagesController().selectedDialogFilter[dyVar.f38708s - 7];
                if (dialogFilter != null) {
                    int i15 = dialogFilter.f19548id;
                    ?? bbVar = new org.telegram.ui.Components.bb(eyVar, false);
                    bbVar.Y = -1;
                    bbVar.f30700c0 = "";
                    bbVar.f30701d0 = new ArrayList();
                    bbVar.f30703f0 = "";
                    bbVar.f30705h0 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    bbVar.f30706i0 = arrayList;
                    bbVar.f30722z0 = -1;
                    bbVar.C0 = -5;
                    bbVar.Y = i15;
                    bbVar.f30698a0 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    bbVar.f30704g0 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList<MessagesController.DialogFilter> arrayList2 = eyVar.getMessagesController().dialogFilters;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                break;
                            } else if (arrayList2.get(i13).f19548id == i15) {
                                bbVar.f30700c0 = arrayList2.get(i13).name;
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                    bbVar.T();
                    eyVar.showDialog(bbVar);
                    return;
                }
                return;
            }
        } else if (z10 && !eyVar.actionBar.q() && !eyVar.G3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.p2) view).Y1;
            AndroidUtilities.rectTmp.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        }
        eyVar.v4(view, i10, dyVar.d);
    }

    public static void f0(ey eyVar) {
        eyVar.presentFragment(new PrivacySettingsActivity());
        AndroidUtilities.scrollToFragmentRow(eyVar.parentLayout, "newChatsRow");
    }

    public static void g1(ey eyVar, boolean z10) {
        if (eyVar.f38998e0 != null && eyVar.N3 != z10) {
            eyVar.N3 = z10;
            int i10 = 0;
            while (true) {
                dy[] dyVarArr = eyVar.f38998e0;
                if (i10 < dyVarArr.length) {
                    if (z10) {
                        dyVarArr[i10].f38702a.setScrollbarFadingEnabled(false);
                    }
                    eyVar.f38998e0[i10].f38702a.setVerticalScrollBarEnabled(z10);
                    if (z10) {
                        eyVar.f38998e0[i10].f38702a.setScrollbarFadingEnabled(true);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public static void h0(ey eyVar) {
        if (eyVar.f38986b4.g()) {
            MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
            eyVar.c5();
        }
    }

    public static void j0(ey eyVar) {
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "PREMIUM_GRACE");
        eyVar.c5();
    }

    public static void k0(ey eyVar) {
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
        eyVar.c5();
    }

    public static void l0(ey eyVar, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
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
            eyVar.arguments.getString("importTitle");
            String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
            bi.r3 r3Var = new bi.r3(eyVar, j10, 27);
            Pattern pattern = org.telegram.ui.Components.g5.f28387a;
            if (eyVar.getParentActivity() != null) {
                if (chat != null || user != null) {
                    int currentAccount = eyVar.getCurrentAccount();
                    Activity parentActivity = eyVar.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
                    TextView textView = new TextView(parentActivity);
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23465j5, null);
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
                    frameLayout.addView(y9Var, org.telegram.ui.Components.kb1.h(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
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
                    frameLayout.addView(textView2, org.telegram.ui.Components.kb1.h(-1, -2.0f, i16, f7, 11.0f, i17, 0.0f));
                    if (LocaleController.isRTL) {
                        i15 = 5;
                    } else {
                        i15 = 3;
                    }
                    frameLayout.addView(textView, org.telegram.ui.Components.kb1.h(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                    if (user != null) {
                        if (UserObject.isReplyUser(user)) {
                            j9Var.f29558p = 0.8f;
                            j9Var.g(12);
                            y9Var.h(null, null, j9Var, user);
                        } else if (user.f22177id == clientUserId) {
                            j9Var.f29558p = 0.8f;
                            j9Var.g(1);
                            y9Var.h(null, null, j9Var, user);
                        } else {
                            j9Var.f29558p = 1.0f;
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
                    eyVar.showDialog(alertDialog$Builder.f22369a);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.g5.e0(eyVar.currentAccount, tL_error, eyVar, tL_messages_checkHistoryImportPeer, new Object[0]);
        eyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j10), tL_messages_checkHistoryImportPeer, tL_error);
    }

    public static void l4(wn wnVar, MessageObject messageObject) {
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
                        wnVar.Bb(messageObject.getRealId(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void m0(ey eyVar, int i10) {
        Object obj;
        TLRPC.User user;
        org.telegram.ui.Components.so0 so0Var = eyVar.C0.f28256q0;
        if (i10 >= so0Var.Z && i10 < so0Var.f27245a0) {
            org.telegram.ui.Components.u61 G = so0Var.G(i10);
            if (G != null) {
                obj = G.G;
            } else {
                obj = null;
            }
        } else {
            obj = Boolean.FALSE;
        }
        if (obj instanceof TLRPC.User) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eyVar.getParentActivity(), 0, eyVar.resourceProvider);
            String string = LocaleController.getString(R.string.AppsClearSearch);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
            e2Var.R = string;
            e2Var.T = LocaleController.formatString(R.string.AppsClearSearchAlert, "\"" + UserObject.getUserName(user) + "\"");
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.Components.voip.k1(7, eyVar, (TLRPC.User) obj));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        }
    }

    public static void n0(ey eyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        HashSet hashSet2;
        if (i10 == 102) {
            eyVar.getMessagesController().setDialogsInTransaction(true);
            if (z10) {
                hashSet2 = hashSet;
            } else {
                hashSet2 = null;
            }
            eyVar.z4(arrayList, i10, false, false, hashSet2);
            eyVar.getMessagesController().setDialogsInTransaction(false);
            eyVar.getMessagesController().checkIfFolderEmpty(eyVar.W2);
            int i11 = eyVar.W2;
            if (i11 != 0 && eyVar.Z3(eyVar.currentAccount, eyVar.f38998e0[0].f38708s, i11, false).size() == 0) {
                eyVar.f38998e0[0].f38702a.setEmptyView(null);
                eyVar.f38998e0[0].f38709w.setVisibility(4);
                eyVar.finishFragment();
                return;
            }
            return;
        }
        eyVar.z4(arrayList, i10, false, false, null);
    }

    public static void q0(ey eyVar) {
        String str;
        MessagesController messagesController = MessagesController.getInstance(eyVar.currentAccount);
        if (eyVar.B3) {
            str = "PREMIUM_UPGRADE";
        } else {
            str = "PREMIUM_ANNUAL";
        }
        messagesController.removeSuggestion(0L, str);
        eyVar.c5();
    }

    public static void q4(AccountInstance accountInstance) {
        int currentAccount = accountInstance.getCurrentAccount();
        boolean[] zArr = f38975z4;
        if (!zArr[currentAccount]) {
            MessagesController messagesController = accountInstance.getMessagesController();
            messagesController.loadGlobalNotificationsSettings();
            messagesController.loadDialogs(0, 0, 100, true);
            messagesController.loadHintDialogs();
            messagesController.loadUserInfo(accountInstance.getUserConfig().getCurrentUser(), false, 0);
            accountInstance.getContactsController().checkInviteText();
            accountInstance.getMediaDataController().checkAllMedia(false);
            AndroidUtilities.runOnUIThread(new xi(accountInstance, 18), 200L);
            Iterator<String> it = messagesController.diceEmojies.iterator();
            while (it.hasNext()) {
                accountInstance.getMediaDataController().loadStickersByEmojiOrName(it.next(), true, true);
            }
            zArr[currentAccount] = true;
        }
    }

    public static void r0(ey eyVar) {
        b.c(eyVar.getParentActivity(), eyVar.currentAccount, eyVar.getResourceProvider());
    }

    public static void r1(ey eyVar, dy dyVar, float f7) {
        if (eyVar.T != f7) {
            eyVar.T = f7;
            int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            int i11 = 0;
            if (i10 == 0) {
                eyVar.U = false;
            }
            eyVar.E0.setOverscroll(f7);
            dyVar.f38702a.setViewsOffset(f7);
            zx zxVar = dyVar.f38702a;
            if (i10 != 0) {
                i11 = 2;
            }
            zxVar.setOverScrollMode(i11);
            eyVar.fragmentView.invalidate();
            if (f7 > AndroidUtilities.dp(90.0f) && !eyVar.U) {
                sw swVar = eyVar.E0;
                ValueAnimator valueAnimator = swVar.H0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    swVar.i(swVar.f9089p0, true);
                    eyVar.U = true;
                    eyVar.getOrCreateStoryViewer().t(new ev(eyVar, 18));
                }
            }
        }
    }

    public static void s0(ey eyVar, int i10, org.telegram.ui.Components.l80 l80Var) {
        CharSequence charSequence;
        if (eyVar.currentAccount != i10) {
            l80Var.u();
            if (eyVar.getParentActivity() == null) {
                return;
            }
            xx xxVar = eyVar.C2;
            LaunchActivity launchActivity = (LaunchActivity) eyVar.getParentActivity();
            ArrayList arrayList = eyVar.D2;
            String str = eyVar.E2;
            CharSequence charSequence2 = eyVar.F2;
            lw lwVar = eyVar.B1;
            if (lwVar != null) {
                charSequence = lwVar.getFieldText();
            } else {
                charSequence = null;
            }
            launchActivity.P0(i10);
            ey eyVar2 = new ey(eyVar.arguments);
            eyVar2.C2 = xxVar;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList.isEmpty()) {
                    eyVar2.D2 = null;
                } else {
                    eyVar2.D2 = arrayList;
                    eyVar2.E2 = null;
                    eyVar2.M2 = false;
                    if (eyVar2.B1 != null) {
                        eyVar2.s3(charSequence);
                    } else {
                        eyVar2.V3 = charSequence;
                    }
                }
            } else if (str != null) {
                eyVar2.M4(charSequence, str);
            } else if (charSequence2 != null) {
                if (charSequence2.length() == 0) {
                    eyVar2.F2 = null;
                } else {
                    eyVar2.F2 = charSequence2;
                    eyVar2.E2 = null;
                    eyVar2.D2 = null;
                    if (eyVar2.B1 != null) {
                        eyVar2.s3(charSequence);
                    } else {
                        eyVar2.V3 = charSequence;
                    }
                }
            }
            launchActivity.v0(eyVar2, false, true);
        }
    }

    public static boolean s1(ey eyVar, dy dyVar) {
        if (!eyVar.G3.c()) {
            int i10 = (int) (-eyVar.N);
            int b42 = eyVar.b4();
            int c42 = eyVar.c4();
            if (i10 != 0 && i10 != b42 && i10 != c42 && dyVar.f38702a.canScrollVertically(-1)) {
                if (c42 < i10 && i10 < b42) {
                    int dp = AndroidUtilities.dp(48.0f);
                    int i11 = i10 - c42;
                    if (i11 < dp / 2) {
                        dyVar.f38703b.y(-i11);
                        return true;
                    }
                    dyVar.f38703b.y(dp - i11);
                    return true;
                }
                float f7 = 1.0f;
                if (eyVar.f39082u3 != 1.0f) {
                    f7 = Utilities.clamp((-eyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
                }
                if (f7 < eyVar.E0.B0) {
                    dyVar.f38703b.y(-i10);
                    return true;
                }
                dyVar.f38703b.y(c42 - i10);
                return true;
            }
            return false;
        }
        return false;
    }

    public static void t0(final int i10, final long j10, TLRPC.Chat chat, final ey eyVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        int i14;
        eyVar.j4(false);
        if (i10 == 103 && ChatObject.isChannel(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || ChatObject.isPublic(chat2)) {
                eyVar.getMessagesController().deleteDialog(j10, 2, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i10 == 102 && (i14 = eyVar.W2) != 0 && eyVar.Z3(eyVar.currentAccount, eyVar.f38998e0[0].f38708s, i14, false).size() == 1) {
            eyVar.f38998e0[0].f38709w.setVisibility(4);
        }
        eyVar.f39108z3 = 3;
        int i15 = -1;
        if (i10 == 102) {
            eyVar.I4(true, true);
            if (eyVar.R1 != null) {
                i13 = 0;
                while (i13 < eyVar.R1.size()) {
                    if (((TLRPC.Dialog) eyVar.R1.get(i13)).f22032id == j10) {
                        break;
                    }
                    i13++;
                }
            }
            i13 = -1;
            eyVar.w3();
            i11 = i13;
        } else {
            i11 = -1;
        }
        UndoView g42 = eyVar.g4();
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
                    eyVar.y4(i10, j10, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(eyVar.Z3(eyVar.currentAccount, eyVar.f38998e0[0].f38708s, eyVar.W2, false));
        int i16 = 0;
        while (true) {
            if (i16 >= arrayList2.size()) {
                break;
            } else if (((TLRPC.Dialog) arrayList2.get(i16)).f22032id == j10) {
                i15 = i16;
                break;
            } else {
                i16++;
            }
        }
        if (i10 == 102) {
            if (i11 >= 0 && i15 < 0 && (arrayList = eyVar.R1) != null) {
                arrayList.remove(i11);
                eyVar.f38998e0[0].f38710x.D();
                eyVar.f38998e0[0].q(true);
                return;
            }
            eyVar.I4(false, true);
        }
    }

    public static String t2(ey eyVar) {
        String shortName;
        ArrayList arrayList = eyVar.I2;
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
                if (longValue == eyVar.getUserConfig().getClientUserId()) {
                    sb2.append(LocaleController.getString(R.string.SavedMessages));
                } else {
                    if (arrayList.size() == 1) {
                        shortName = DialogObject.getName(eyVar.currentAccount, longValue);
                    } else {
                        shortName = DialogObject.getShortName(eyVar.currentAccount, longValue);
                    }
                    sb2.append(shortName);
                }
            }
            return LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        }
        return LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]);
    }

    public static void u0(ey eyVar) {
        BirthdayController.getInstance(eyVar.currentAccount).hide();
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_CONTACTS_TODAY");
        eyVar.c5();
        org.telegram.ui.Components.qc G = org.telegram.ui.Components.wc.b0(eyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f31861j = 5000;
        G.j();
    }

    public static void v0(ey eyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.H0(launchActivity, eyVar.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(eyVar.currentAccount).updateAttachMenuBotsInCache();
    }

    public static void w0(ey eyVar) {
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "PREMIUM_RESTORE");
        eyVar.c5();
    }

    public static void x0(ey eyVar) {
        if (!eyVar.O3) {
            fi.v3 v3Var = eyVar.f39057q0;
            if (v3Var != null) {
                if (v3Var.V) {
                    return;
                }
                AndroidUtilities.removeFromParent(v3Var);
            }
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.y6.Gi, 0, new uv(eyVar, 9));
            fi.v3 v3Var2 = new fi.v3(eyVar.getParentActivity(), 2);
            v3Var2.q(8.0f);
            v3Var2.d = 8000L;
            v3Var2.i(true);
            v3Var2.p(true);
            v3Var2.h = AndroidUtilities.displaySize.x - AndroidUtilities.dp(148.0f);
            v3Var2.s(replaceSingleTag);
            v3Var2.l(1.0f, -40.0f);
            v3Var2.h(eyVar.getThemedColor(org.telegram.ui.ActionBar.y6.Fi));
            eyVar.f39057q0 = v3Var2;
            v3Var2.setTranslationY((-eyVar.f39013g4) - eyVar.f39023i4);
            ((ViewGroup) eyVar.fragmentView).addView(eyVar.f39057q0, org.telegram.ui.Components.kb1.h(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
            eyVar.f39057q0.u();
            return;
        }
        fi.v3 v3Var3 = eyVar.f39052p0;
        if (v3Var3 != null) {
            v3Var3.e(true);
        }
        di.b7 o10 = MessagesController.getInstance(eyVar.currentAccount).getStoriesController().o();
        if (o10 != null && o10.a(eyVar.currentAccount, 1)) {
            eyVar.showDialog(new tg.j0(o10.b(), eyVar.currentAccount, eyVar.getParentActivity(), eyVar, null));
            return;
        }
        fi.sb D = fi.sb.D(eyVar.getParentActivity(), eyVar.currentAccount);
        D.f11678x = new lx(eyVar);
        D.Q(null);
    }

    public static void y0(ey eyVar) {
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "PREMIUM_CHRISTMAS");
        eyVar.c5();
        org.telegram.ui.Components.qc G = org.telegram.ui.Components.wc.b0(eyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f31861j = 5000;
        G.j();
    }

    public static void z0(org.telegram.ui.ey r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.z0(org.telegram.ui.ey, int):void");
    }

    public final void A3() {
        if (this.f38998e0 != null) {
            int t32 = t3();
            int i10 = 0;
            while (true) {
                dy[] dyVarArr = this.f38998e0;
                if (i10 < dyVarArr.length) {
                    dy dyVar = dyVarArr[i10];
                    if (dyVar != null) {
                        zx zxVar = dyVar.f38702a;
                        zxVar.setPadding(0, zxVar.f29913g3, 0, t32);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void A4(long r14, boolean r16, org.telegram.messenger.MessagesController.DialogFilter r17, int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.A4(long, boolean, org.telegram.messenger.MessagesController$DialogFilter, int, boolean):void");
    }

    @Override
    public final List B() {
        return Arrays.asList(new og.a(LocaleController.getString(R.string.DebugDialogsActivity)), new og.a(LocaleController.getString(R.string.ClearLocalDatabase), new ev(this, 28)), new og.a(LocaleController.getString(R.string.DebugClearSendMessageAsPeers), new ev(this, 29)));
    }

    public final void B3() {
        jh.f fVar = this.f39103y1;
        if (fVar != null) {
            fVar.setBlurredBottomHeight(this.f39103y1.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        }
    }

    public final void B4() {
        if (this.K0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6));
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
        dy dyVar;
        boolean z10 = true;
        float a42 = a4(true);
        tx txVar = this.f39105z0;
        if (txVar != null) {
            if (txVar.getAlpha() == a42) {
                z10 = false;
            }
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, a42);
            this.f39105z0.setAlpha(a42);
            this.f39105z0.setScaleX(lerp);
            this.f39105z0.setScaleY(lerp);
            tx txVar2 = this.f39105z0;
            if (a42 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            txVar2.setVisibility(i10);
            if (z10 && (dyVar = this.f38998e0[0]) != null) {
                dyVar.f38702a.requestLayout();
            }
        }
        a5();
    }

    public final void C4(dy dyVar) {
        int i10;
        org.telegram.ui.Components.c10 c10Var;
        if (dyVar.getVisibility() != 0) {
            return;
        }
        int i11 = dyVar.d.v;
        if (dyVar.f38708s == 0 && h4() && dyVar.f38702a.getChildCount() == 0 && dyVar.v == 2) {
            ((s4.c0) dyVar.f38702a.getLayoutManager()).h1(1, (int) this.N);
        }
        dyVar.d.getClass();
        dyVar.d.V();
        int h = dyVar.d.h();
        if (h == 1 && i11 == 1 && dyVar.d.j(0) == 5) {
            dyVar.q(true);
        } else {
            dyVar.q(false);
            if (h > i11 && (i10 = this.R0) != 11 && i10 != 12 && i10 != 13) {
                dyVar.f38711y.b(i11);
            }
        }
        try {
            zx zxVar = dyVar.f38702a;
            if (this.W2 == 0 && this.Y2 == 0) {
                c10Var = dyVar.f38709w;
            } else {
                c10Var = null;
            }
            zxVar.setEmptyView(c10Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
        z3(dyVar);
    }

    public final void D3() {
        int i10;
        int i11;
        float f7 = this.f39041n.e;
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
        jh.f fVar = this.f39103y1;
        if (fVar != null) {
            fVar.setAlpha(f7);
            jh.f fVar2 = this.f39103y1;
            int i13 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i13 > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            fVar2.setVisibility(i10);
            this.f39103y1.getFadeView().setAlpha(f7);
            View fadeView = this.f39103y1.getFadeView();
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
            animatorSet.setInterpolator(org.telegram.ui.Components.ds.f27530f);
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
            rx rxVar = this.X;
            oe.b bVar = this.f38981b;
            rxVar.setBlurredBackgroundVisibility(bVar.e);
            float a2 = a8.v0.a(bVar.e);
            org.telegram.ui.Components.y9 y9Var = this.f38985b3;
            if (y9Var != null) {
                y9Var.setScaleX(a2);
                this.f38985b3.setScaleY(a2);
                this.f38985b3.setAlpha(a2);
                org.telegram.ui.Components.y9 y9Var2 = this.f38985b3;
                if (a2 > 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                y9Var2.setVisibility(i12);
            }
            if (this.f39084v0 != null) {
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, a2);
                this.f39084v0.setScaleX(lerp);
                this.f39084v0.setScaleY(lerp);
                this.f39084v0.setAlpha(a2);
                fi.d dVar = this.f39084v0;
                int i14 = (a2 > 0.0f ? 1 : (a2 == 0.0f ? 0 : -1));
                if (i14 > 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                dVar.setVisibility(i11);
                this.f39090w0.setAlpha(a2);
                lh.f fVar = this.f39090w0;
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
        org.telegram.ui.Components.j20.d(this.actionBar.getBackButton(), Math.max(this.f39082u3, (1.0f - this.f38981b.e) * (1.0f - d4()) * (1.0f - this.f38987c.e)));
    }

    public final void E4(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.E4(int):void");
    }

    public final void F3() {
        float f7;
        if (this.f39019i0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.j20.d(this.f39009g0, c3.h0.E(f7, 1.0f - this.f38981b.e, 1.0f - d4(), 1.0f - this.f38987c.e));
    }

    public final void F4(boolean z10, boolean z11) {
        int i10;
        int i11;
        vw vwVar = this.G3;
        if (vwVar != null && vwVar.c()) {
            return;
        }
        if (this.f38998e0[0].f38708s == 0 && h4() && this.f38998e0[0].v == 2) {
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
            org.telegram.ui.Components.ql0 ql0Var = this.f38998e0[0].f38707r;
            ql0Var.f31934b = 1;
            ql0Var.c(i10, i11, false, false);
            D4();
            return;
        }
        this.f38998e0[0].f38704c.h1(i10, i11);
        D4();
    }

    public final void G3() {
        float f7;
        if (SharedConfig.passcodeHash.isEmpty()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.j20.d(this.f39004f0, c3.h0.E(f7, 1.0f - this.f38981b.e, 1.0f - d4(), 1.0f - this.f38987c.e));
    }

    public final void G4(String str, boolean z10) {
        W4(true, false, true, false);
        rx rxVar = this.X;
        if (rxVar != null) {
            rxVar.f30347r.setText(str);
            this.X.f30347r.setSelection(str.length());
        }
    }

    public final void H3() {
        float f7;
        if (this.R0 != 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.j20.d(this.f39024j0, c3.h0.E(f7, this.f39003f.e, 1.0f - d4(), 1.0f - this.f38987c.e));
        sw swVar = this.E0;
        if (swVar != null) {
            swVar.invalidate();
        }
    }

    public final void H4(float f7) {
        dy[] dyVarArr;
        this.f38988c0 = f7;
        for (dy dyVar : this.f38998e0) {
            zx zxVar = dyVar.f38702a;
            for (int i10 = 0; i10 < zxVar.getChildCount(); i10++) {
                View childAt = zxVar.getChildAt(i10);
                if (childAt != null && RecyclerView.R(childAt) >= dyVar.d.f14170f + 1) {
                    childAt.setAlpha(f7);
                }
            }
        }
    }

    public final void I3() {
        org.telegram.ui.Components.j20.d(this.f39034l0, c3.h0.E(this.f38981b.e, 1.0f - d4(), 1.0f - this.f38987c.e, this.d.e));
    }

    public final void I4(boolean z10, boolean z11) {
        if (this.f38998e0 != null && this.S1 != z10) {
            if (z10) {
                this.R1 = new ArrayList(Z3(this.currentAccount, this.f38998e0[0].f38708s, this.W2, false));
            } else {
                this.R1 = null;
            }
            this.S1 = z10;
            dy dyVar = this.f38998e0[0];
            dyVar.d.G = z10;
            if (!z10 && z11) {
                if (dyVar.f38702a.c0()) {
                    this.f38998e0[0].f38702a.post(new uv(this, 10));
                } else {
                    this.f38998e0[0].d.l();
                }
            }
        }
    }

    public final void J3() {
        boolean z10;
        bi.cc ccVar;
        if (!this.f39026j2 && ((ccVar = this.K0) == null || ccVar.getBackground() == null || this.K0.getAlpha() < 0.01f || this.K0.getVisibility() == 8)) {
            z10 = true;
        } else {
            z10 = false;
        }
        og0 og0Var = this.J3;
        if (og0Var != null) {
            og0Var.f42090a.v.a(z10, true);
        }
    }

    public final void J4(boolean z10) {
        dy dyVar;
        if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
            if (z10) {
                dy[] dyVarArr = this.f38998e0;
                if (dyVarArr != null && (dyVar = dyVarArr[0]) != null) {
                    dyVar.setLayerType(2, null);
                    this.f38998e0[0].setClipChildren(false);
                    this.f38998e0[0].setClipToPadding(false);
                    this.f38998e0[0].f38702a.setClipChildren(false);
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
            if (this.f38998e0 != null) {
                int i10 = 0;
                while (true) {
                    dy[] dyVarArr2 = this.f38998e0;
                    if (i10 >= dyVarArr2.length) {
                        break;
                    }
                    dy dyVar2 = dyVarArr2[i10];
                    if (dyVar2 != null) {
                        dyVar2.setLayerType(0, null);
                        dyVar2.setClipChildren(true);
                        dyVar2.setClipToPadding(true);
                        dyVar2.f38702a.setClipChildren(true);
                    }
                    i10++;
                }
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setLayerType(0, null);
            }
            sw swVar = this.E0;
            if (swVar != null) {
                swVar.setLayerType(0, null);
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
        org.telegram.ui.Components.j20.d(this.f39029k0, (1.0f - this.f38981b.e) * (1.0f - d4()) * (1.0f - this.f38987c.e));
        F3();
        I3();
        G3();
        H3();
    }

    public final void K4(float f7) {
        dy[] dyVarArr = this.f38998e0;
        int i10 = 0;
        if (dyVarArr != null) {
            int paddingTop = dyVarArr[0].f38702a.getPaddingTop() + ((int) f7);
            int i11 = 0;
            while (true) {
                dy[] dyVarArr2 = this.f38998e0;
                if (i11 >= dyVarArr2.length) {
                    break;
                }
                dyVarArr2[i11].f38702a.setTopGlowOffset(paddingTop);
                i11++;
            }
        }
        if (this.fragmentView != null && f7 != this.N) {
            this.N = f7;
            org.telegram.ui.Components.qc qcVar = this.f39050o3;
            if (qcVar != null) {
                qcVar.l();
            }
            if (this.F3 != null) {
                float currentActionBarHeight = 1.0f - ((-f7) / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                org.telegram.ui.Cells.o oVar = this.F3;
                float f10 = (int) f7;
                float f11 = oVar.f24574f;
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
        this.X.f30347r.setContentDescription(string);
        this.X.f30347r.setHint(string);
    }

    public final void L4(float f7) {
        this.f39097x1 = f7;
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
        float max = Math.max(this.f39082u3, this.h.e);
        float f10 = this.f38981b.e;
        if (this.R0 != 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float max2 = f7 * (1.0f - this.f38987c.e) * (1.0f - max) * Math.max(f10, (1.0f - d4()) * a2);
        this.X.setAlpha(max2);
        rx rxVar = this.X;
        boolean z10 = false;
        if (max2 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        rxVar.setVisibility(i10);
        if (max2 <= 0.01f) {
            z10 = true;
        }
        this.f39003f.a(z10, true);
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
            if (this.f38977a0 != null) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float f10 = f7 * this.f38981b.e;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, f10);
            this.Z.setScaleX(lerp);
            this.Z.setScaleY(lerp);
            this.Z.setAlpha(f10);
            p31 p31Var = this.Z;
            if (f10 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            p31Var.setVisibility(i11);
        }
        org.telegram.ui.Components.u91 u91Var = this.f38977a0;
        oe.b bVar = this.f39068s;
        if (u91Var != null) {
            float f11 = 1.0f - bVar.e;
            u91Var.setAlpha(f11);
            org.telegram.ui.Components.u91 u91Var2 = this.f38977a0;
            if (f11 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            u91Var2.setVisibility(i10);
        }
        ig.r0 r0Var = this.f38982b0;
        if (r0Var != null) {
            float f12 = bVar.e;
            r0Var.setAlpha(f12);
            ig.r0 r0Var2 = this.f38982b0;
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
                sw swVar = this.E0;
                if (swVar != null) {
                    swVar.setTranslationX(f10);
                }
                rx rxVar = this.X;
                if (rxVar != null) {
                    rxVar.setTranslationX(f10);
                }
                vw vwVar = this.G3;
                if (vwVar != null && vwVar.getFragmentView() != null && !this.f39101y) {
                    this.G3.getFragmentView().setTranslationX(f10);
                    return;
                }
                return;
            }
            float f11 = 1.0f - this.X3;
            float f12 = (-AndroidUtilities.dp(4.0f)) * f11;
            float f13 = 1.0f - (f11 * 0.05f);
            sw swVar2 = this.E0;
            if (swVar2 != null) {
                swVar2.setScaleX(f13);
                this.E0.setScaleY(f13);
                this.E0.setTranslationX(f12);
                this.E0.setPivotX(0.0f);
                this.E0.setPivotY(0.0f);
            }
            rx rxVar2 = this.X;
            if (rxVar2 != null) {
                rxVar2.setTranslationX(f12);
                this.X.setScaleX(f13);
                this.X.setScaleY(f13);
            }
            vw vwVar2 = this.G3;
            if (vwVar2 != null && vwVar2.getFragmentView() != null) {
                if (!this.f39101y) {
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
            int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f38976a);
            if (this.f38977a0 != null) {
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
            mx mxVar = this.C0;
            SparseArray sparseArray = mxVar.h;
            mxVar.W0 = i14;
            mxVar.X0 = i12;
            bi.r1 r1Var = mxVar.f28241a0;
            if (z10) {
                r1Var.t1(0, i14, 0, i12);
            } else {
                r1Var.setPadding(0, i14, 0, i12);
            }
            mxVar.O0.j(mxVar.W0, mxVar.X0, z10);
            org.telegram.ui.Components.ro0 ro0Var = mxVar.f28242b0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ro0Var.getLayoutParams();
            int i15 = marginLayoutParams.topMargin;
            int i16 = mxVar.W0;
            if (i15 != i16 || marginLayoutParams.bottomMargin != mxVar.X0) {
                marginLayoutParams.topMargin = i16;
                marginLayoutParams.bottomMargin = mxVar.X0;
                ro0Var.requestLayout();
            }
            org.telegram.ui.Components.fp0.Q(mxVar.f28248h0, mxVar.f28251k0, mxVar.W0, mxVar.X0, z10);
            org.telegram.ui.Components.fp0.Q(mxVar.m0, mxVar.f28255p0, mxVar.W0, mxVar.X0, z10);
            org.telegram.ui.Components.fp0.Q(mxVar.f28259t0, mxVar.f28262w0, mxVar.W0, mxVar.X0, z10);
            org.telegram.ui.Components.xh0 xh0Var = mxVar.f28257r0;
            int i17 = mxVar.W0;
            int i18 = mxVar.X0;
            xh0Var.setClipToPadding(false);
            org.telegram.ui.Components.s71 s71Var = xh0Var.f34769c;
            xh0Var.J = z10;
            xh0Var.setPadding(0, i17, 0, i18);
            if (z10) {
                s71Var.t1(0, i17, 0, i18);
            } else {
                s71Var.setPadding(0, i17, 0, i18);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) s71Var.getLayoutParams();
            marginLayoutParams2.topMargin = -i17;
            marginLayoutParams2.bottomMargin = -i18;
            xh0Var.J = false;
            org.telegram.ui.Components.do0 do0Var = mxVar.I0;
            if (do0Var != null) {
                do0Var.b(mxVar.W0, mxVar.X0, z10);
            }
            int size = sparseArray.size();
            for (int i19 = 0; i19 < size; i19++) {
                View view = (View) sparseArray.valueAt(i19);
                if (view instanceof j10) {
                    ((j10) view).j(mxVar.W0, mxVar.X0, z10);
                }
            }
            for (int i20 = 0; i20 < mxVar.getChildCount(); i20++) {
                if (mxVar.getChildAt(i20) instanceof j10) {
                    ((j10) mxVar.getChildAt(i20)).j(mxVar.W0, mxVar.X0, z10);
                }
            }
        }
    }

    public final void O4() {
        getContactsController().loadGlobalPrivacySetting();
        org.telegram.ui.Components.y6 y6Var = new org.telegram.ui.Components.y6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.d71(23, this, r0), new xi(r0, 17));
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(getParentActivity(), getResourceProvider());
        e3Var.c(y6Var);
        org.telegram.ui.ActionBar.k3 k3Var = e3Var.f22602a;
        k3Var.show();
        org.telegram.ui.ActionBar.k3[] k3VarArr = {k3Var};
        k3Var.fixNavigationBarKey(org.telegram.ui.ActionBar.y6.f23428h5);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.P4(org.telegram.ui.Cells.p2):boolean");
    }

    public boolean Q3() {
        if (this.R0 == 10) {
            return true;
        }
        return false;
    }

    public final void Q4(boolean z10) {
        float f7;
        this.f38987c.a(z10, true);
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
        this.P3.addListener(new bx(this, z10, 1));
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
                mx mxVar = this.C0;
                if (mxVar != null) {
                    mxVar.f28244d0.Q(this.W1, tLObject);
                }
                this.X1 = null;
                return;
            }
            return;
        }
        this.V1 = true;
    }

    public final void R4() {
        if (!this.A0 && getMessagesController().dialogFiltersLoaded && getMessagesController().showFiltersTooltip && this.f39105z0 != null && getMessagesController().getDialogFilters().isEmpty() && !this.isPaused && getUserConfig().filtersLoaded && !this.inPreviewMode) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("filterhint", false)) {
                globalMainSettings.edit().putBoolean("filterhint", true).apply();
                AndroidUtilities.runOnUIThread(new uv(this, 11), 1000L);
            }
        }
    }

    public final void S3() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.f22775n0) {
            kVar.g(true);
            this.f39060q3 = false;
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
        org.telegram.ui.Components.d71 d71Var;
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
        org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(this, this.f39029k0);
        int i15 = org.telegram.ui.ActionBar.y6.A8;
        H.S(getThemedColor(i15), getThemedColor(i15));
        H.f30168s = 8;
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
                H.c(R.drawable.msg_customize, LocaleController.getString(R.string.CommunityMenuSettings), new ev(this, 3), false);
                H.k();
            }
            H.i(new ev(this, 6), LocaleController.getString(R.string.CommunityMenuShowAsOneChat), this.Z2.collapsed_in_dialogs);
            H.i(new ev(this, 7), LocaleController.getString(R.string.CommunityMenuShowAsSeparateChats), !this.Z2.collapsed_in_dialogs);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        } else if (m4()) {
            H.c(R.drawable.msg_customize, LocaleController.getString(R.string.ArchiveSettings), new ev(this, 8), false);
            H.c(R.drawable.msg_help, LocaleController.getString(R.string.HowDoesItWork), new ev(this, 9), false);
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
            H.c(i10, LocaleController.getString(i11), new ev(this, 10), false);
            H.k();
            H.c(R.drawable.msg_contacts, LocaleController.getString(R.string.Contacts), new ev(this, 11), false);
            H.c(R.drawable.msg_calls, LocaleController.getString(R.string.Calls), new ev(this, 12), false);
            H.k();
            H.c(R.drawable.outline_groups_24, LocaleController.getString(R.string.NewGroup), new ev(this, 13), false);
            H.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.SavedMessages), new ev(this, 14), false);
            ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
            if (applicationLoader != null) {
                applicationLoader.addItemOptions(H);
            }
            if (getMessagesController().config.walletAvailable.get()) {
                H.c(R.drawable.ic_gram, LocaleController.getString(R.string.WalletAttachMoney), new ev(this, 4), false);
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
                            iv ivVar = new iv(this, tL_attachMenuBot2, launchActivity, 0);
                            org.telegram.ui.Components.d71 d71Var2 = new org.telegram.ui.Components.d71(22, this, tL_attachMenuBot2);
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
                                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(sideAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.y6.f23339c7, 1.0f);
                                    if (svgThumb != null) {
                                        Integer num = H.f30155k0;
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
                                    d71Var = d71Var2;
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
                                        y9Var.setLayoutParams(org.telegram.ui.Components.kb1.i(24, 24, i14 | 16));
                                    }
                                } else {
                                    launchActivity2 = launchActivity;
                                    arrayList2 = arrayList3;
                                    d71Var = d71Var2;
                                    u6Var = u6Var3;
                                    CharSequence charSequence3 = charSequence;
                                    g1Var = g1Var2;
                                    i12 = i18;
                                    i13 = i19;
                                    g1Var.j(charSequence3, R.drawable.msg_bot, null);
                                }
                                Integer num2 = H.f30153j0;
                                if (num2 == null && H.f30155k0 == null) {
                                    g1Var.c(i13, i12);
                                } else {
                                    if (num2 != null) {
                                        w02 = num2.intValue();
                                    } else {
                                        w02 = org.telegram.ui.ActionBar.y6.w0(i13, u6Var);
                                    }
                                    Integer num3 = H.f30155k0;
                                    if (num3 != null) {
                                        w03 = num3.intValue();
                                    } else {
                                        w03 = org.telegram.ui.ActionBar.y6.w0(i12, u6Var);
                                    }
                                    g1Var.d(w02, w03);
                                }
                                Integer num4 = H.f30155k0;
                                if (num4 != null) {
                                    w04 = num4.intValue();
                                } else {
                                    w04 = org.telegram.ui.ActionBar.y6.w0(i12, u6Var);
                                }
                                g1Var.setIconColorImage(w04);
                                Integer num5 = H.f30157l0;
                                if (num5 != null) {
                                    g1Var.setSelectorColor(num5.intValue());
                                } else {
                                    g1Var.h(0.12f, i13);
                                }
                                g1Var.setOnClickListener(new org.telegram.ui.Components.ga(20, H, ivVar));
                                g1Var.setOnLongClickListener(new di.l2(3, H, d71Var));
                                int i20 = H.S;
                                if (i20 > 0) {
                                    g1Var.setMinimumWidth(AndroidUtilities.dp(i20));
                                    H.r(g1Var, org.telegram.ui.Components.kb1.r(H.S, -2));
                                } else {
                                    H.r(g1Var, org.telegram.ui.Components.kb1.r(-1, -2));
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
                H.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), new ev(this, 5), false);
            }
            org.telegram.ui.ActionBar.g1 g1Var3 = this.f39047o0;
            if (g1Var3 != null) {
                org.telegram.ui.ActionBar.f7.V(g1Var3.f22638b, org.telegram.ui.ActionBar.y6.f23310ai, getResourceProvider());
                this.f39047o0.setOnClickListener(new org.telegram.ui.Components.l51(11, this, H));
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", "");
                if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty())) {
                    H.k();
                    H.d(this.f39047o0);
                }
            }
            H.Z();
            H.X(-AndroidUtilities.dp(f11));
        }
    }

    @Override
    public final boolean T(MotionEvent motionEvent, boolean z10) {
        vw vwVar;
        bi.cc ccVar;
        tx txVar;
        boolean z11;
        boolean z12;
        if (!this.f39060q3 && (((vwVar = this.G3) == null || !vwVar.c()) && (((ccVar = this.K0) == null || ccVar.getVisibility() != 0) && ((txVar = this.f39105z0) == null || !txVar.f32432n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                tx txVar2 = this.f39105z0;
                if (txVar2 != null && txVar2.getTabsCount() >= 2 && this.f39105z0.getCurrentTabId() != this.f39105z0.getFirstTabId()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                tx txVar3 = this.f39105z0;
                if (txVar3 != null && txVar3.getTabsCount() >= 2 && this.f39105z0.getCurrentTabId() != this.f39105z0.getLastTabId()) {
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
        ArrayList arrayList = this.f39020i1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.f39010g1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f39010g1.setImageDrawable(new org.telegram.ui.ActionBar.j2(true));
            org.telegram.ui.ActionBar.f7.t(this.f39010g1, org.telegram.ui.ActionBar.y6.f23751y8, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.f39010g1;
            int i11 = org.telegram.ui.ActionBar.y6.f23770z8;
            org.telegram.ui.ActionBar.f7.R(imageView2, org.telegram.ui.ActionBar.y6.g0(getThemedColor(i11), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i11), getResourceProvider());
            this.f39010g1.setOnClickListener(new jv(this, 7));
            i10.addView(this.f39010g1, org.telegram.ui.Components.kb1.u(54, 54, 16));
            arrayList.add(this.f39010g1);
        }
        NumberTextView numberTextView = new NumberTextView(i10.getContext());
        this.f39015h1 = numberTextView;
        int i12 = 18;
        numberTextView.setTextSize(18);
        this.f39015h1.setTypeface(AndroidUtilities.bold());
        this.f39015h1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23751y8));
        NumberTextView numberTextView2 = this.f39015h1;
        if (!this.W) {
            i12 = 72;
        }
        i10.addView(numberTextView2, org.telegram.ui.Components.kb1.q(1.0f, 0, -1, i12, 0, 0));
        this.f39015h1.setOnTouchListener(new ei.d(2));
        this.f39030k1 = i10.g(100, R.drawable.msg_pin, AndroidUtilities.dp(48.0f));
        this.l1 = i10.g(104, R.drawable.msg_mute, AndroidUtilities.dp(48.0f));
        this.f39037m1 = i10.g(107, R.drawable.msg_archive, AndroidUtilities.dp(48.0f));
        this.f39025j1 = i10.h(102, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(48.0f));
        org.telegram.ui.ActionBar.w0 h = i10.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(48.0f));
        i10.addView(new View(getParentActivity()), org.telegram.ui.Components.kb1.r(5, -1));
        this.f39058q1 = h.e(105, R.drawable.msg_archive, LocaleController.getString(R.string.Archive));
        this.f39043n1 = h.e(108, R.drawable.msg_pin, LocaleController.getString(R.string.DialogPin));
        this.f39048o1 = h.e(109, R.drawable.msg_addfolder, LocaleController.getString(R.string.FilterAddTo));
        this.f39053p1 = h.e(110, R.drawable.msg_removefolder, LocaleController.getString(R.string.FilterRemoveFrom));
        this.f39070s1 = h.e(101, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
        this.f39064r1 = h.e(103, R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory));
        this.f39075t1 = h.e(106, R.drawable.msg_block, LocaleController.getString(R.string.BlockUser));
        this.l1.setOnLongClickListener(new pv(this, 1));
        arrayList.add(this.f39030k1);
        arrayList.add(this.f39037m1);
        arrayList.add(this.l1);
        arrayList.add(this.f39025j1);
        arrayList.add(h);
        b5(false);
    }

    public final void T4() {
        if (this.S3 == null) {
            for (String str : getMessagesController().pendingSuggestions) {
                if ("AUTOARCHIVE_POPULAR".equals(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.HideNewChatsAlertTitle);
                    alertDialog$Builder.f22369a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.HideNewChatsAlertText));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.GoToSettings), new kv(this, 6));
                    showDialog(alertDialog$Builder.f22369a, new fv(this, 1));
                    this.S3 = str;
                    return;
                }
            }
        }
    }

    public final void U3() {
        int i10;
        mx mxVar = this.C0;
        if ((mxVar != null && mxVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        if (this.f39044n2 != null) {
            i10 = 2;
        } else if (!this.f39035l2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        mx mxVar2 = new mx(this, getParentActivity(), this, i10, this.R0, this.W2, this.Y2, new lx(this));
        this.C0 = mxVar2;
        this.glassEngine.c(mxVar2);
        ((wx) this.fragmentView).addView(this.C0, this.B0);
        mx mxVar3 = this.C0;
        mxVar3.f28244d0.U = new ox(this);
        mxVar3.f28251k0.setOnItemClickListener(new kv(this, 1));
        this.C0.f28255p0.setOnItemClickListener(new kv(this, 2));
        this.C0.f28262w0.setOnItemClickListener(new nv(this, 0));
        this.C0.f28255p0.setOnItemLongClickListener(new kv(this, 3));
        this.C0.f28241a0.setOnItemClickListener(new kv(this, 4));
        this.C0.f28241a0.setOnItemLongClickListener(new lx(this));
        this.C0.setFilteredSearchViewDelegate(new kv(this, 5));
        this.C0.setAlpha(0.0f);
        this.C0.setScaleX(1.05f);
        this.C0.setScaleY(1.05f);
        this.C0.setVisibility(8);
        this.C0.setBlurredBackgroundDrawableFactory(this.f39056p4);
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
            if (this.f39060q3) {
                T3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.k5)) {
                    this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
                }
            } else {
                T3(null);
            }
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6));
            this.actionBar.K(null, null);
            int i11 = this.f38998e0[0].f38708s;
            if ((i11 != 7 && i11 != 8) || (this.actionBar.q() && !this.actionBar.r(null))) {
                Z3 = getMessagesController().getDialogs(this.W2);
            } else {
                Z3 = Z3(this.currentAccount, this.f38998e0[0].f38708s, this.W2, this.S1);
            }
            int size = Z3.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.Dialog dialog = Z3.get(i13);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (o4(dialog)) {
                        i12++;
                    } else if (!getMessagesController().isPromoDialog(dialog.f22032id, false)) {
                        break;
                    }
                }
            }
            if (i12 > 1) {
                if (this.f38998e0 != null) {
                    int i14 = 0;
                    while (true) {
                        dy[] dyVarArr = this.f38998e0;
                        if (i14 >= dyVarArr.length) {
                            break;
                        }
                        dyVarArr[i14].d.H = true;
                        i14++;
                    }
                }
                q5(MessagesController.UPDATE_MASK_REORDER, true);
            }
            if (!this.f39060q3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f39020i1;
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
            ValueAnimator valueAnimator = this.f39087v3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f39087v3 = ValueAnimator.ofFloat(this.f39082u3, 1.0f);
            int i16 = 0;
            while (true) {
                dy[] dyVarArr2 = this.f38998e0;
                if (i16 >= dyVarArr2.length) {
                    break;
                }
                dy dyVar = dyVarArr2[i16];
                if (dyVar != null) {
                    dyVar.f38702a.I0(true);
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
            this.f39087v3.addUpdateListener(new lv(this, max, 0));
            this.f39087v3.addListener(new ex(this, max, 1));
            this.f39087v3.setInterpolator(org.telegram.ui.Components.ds.f27530f);
            this.f39087v3.setDuration(200L);
            this.f39087v3.start();
            tx txVar = this.f39105z0;
            if (txVar != null) {
                txVar.b(org.telegram.ui.ActionBar.y6.Gh, org.telegram.ui.ActionBar.y6.Fh, org.telegram.ui.ActionBar.y6.Eh, org.telegram.ui.ActionBar.y6.Hh, org.telegram.ui.ActionBar.y6.f23714w8);
            }
            org.telegram.ui.ActionBar.j2 j2Var = this.f38999e1;
            if (j2Var != null) {
                j2Var.c(1.0f, true);
            }
            z10 = false;
        }
        b5(false);
        this.f39015h1.a(arrayList.size(), z10);
    }

    public final void V3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.f39102y0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                undoViewArr[i10] = new gx(this, parentActivity);
                FrameLayout.LayoutParams h = org.telegram.ui.Components.kb1.h(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                h.bottomMargin = this.f39013g4 + this.f39023i4 + h.bottomMargin;
                UndoView undoView = undoViewArr[i10];
                int i11 = this.f39096x0 + 1;
                this.f39096x0 = i11;
                ((wx) this.fragmentView).addView(undoView, i11, h);
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
            J = org.telegram.ui.Components.wc.b0(this).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new ev(this, 22));
        }
        J.j();
    }

    public final void W3(final long j10, final long j11, boolean z10, final cf1 cf1Var) {
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
                if (z10 && ((this.f39006f2 != null && this.f39011g2 != null) || this.f39016h2 != null)) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        if (DialogObject.isEncryptedDialog(j10)) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(org.telegram.messenger.t.m(getMessagesController(), j10).user_id));
                            if (user2 != null) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f39006f2, UserObject.getUserName(user2));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                return;
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            if (j10 == getUserConfig().getClientUserId()) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f39011g2, LocaleController.getString(R.string.SavedMessages));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j10));
                                if (user3 != null && this.f39006f2 != null) {
                                    str = LocaleController.getString(R.string.SendMessageTitle);
                                    str2 = LocaleController.formatStringSimple(this.f39006f2, UserObject.getUserName(user3));
                                    string2 = LocaleController.getString(R.string.Send);
                                } else {
                                    return;
                                }
                            }
                        } else {
                            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-j10));
                            if (chat2 != null) {
                                String str3 = chat2.title;
                                if (j11 != 0 && (findTopic = getMessagesController().getTopicsController().findTopic(chat2.f22028id, j11)) != null) {
                                    str3 = ((Object) str3) + " " + findTopic.title;
                                }
                                if (this.f39016h2 != null) {
                                    string = LocaleController.getString(R.string.AddToTheGroupAlertTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f39016h2, str3);
                                    string2 = LocaleController.getString(R.string.Add);
                                } else {
                                    string = LocaleController.getString(R.string.SendMessageTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f39011g2, str3);
                                    string2 = LocaleController.getString(R.string.Send);
                                }
                                String str4 = formatStringSimple;
                                str = string;
                                str2 = str4;
                            } else {
                                return;
                            }
                        }
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                        e2Var.R = str;
                        e2Var.T = AndroidUtilities.replaceTags(str2);
                        alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.b2() {
                            @Override
                            public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i11) {
                                ey.this.W3(j10, j11, false, cf1Var);
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
                    Runnable i0Var = new a3.i0(this, j10, new a3.h0(this, j10, j11, cf1Var, 14), 26);
                    if (j10 < 0) {
                        Y4(getMessagesController().getChat(Long.valueOf(-j10)), i0Var, null);
                        return;
                    }
                    TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(j10));
                    TLRPC.User user5 = getMessagesController().getUser(Long.valueOf(this.H));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, UserObject.getFirstName(user4), UserObject.getFirstName(user5));
                    org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22369a;
                    e2Var2.R = formatString;
                    e2Var2.T = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, UserObject.getFirstName(user4), UserObject.getFirstName(user5))));
                    alertDialog$Builder2.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new st(i0Var, 3));
                    alertDialog$Builder2.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new org.telegram.ui.Components.voip.c1(4));
                    showDialog(e2Var2);
                    return;
                } else if (this.C2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j10, j11));
                    if (this.C2.v(this, arrayList, null, false, this.J2, this.K2, this.L2, cf1Var) && this.f39021i2) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.W4(boolean, boolean, boolean, boolean):void");
    }

    public final void X3(long j10, boolean z10) {
        if (this.f38998e0 != null) {
            int i10 = 0;
            while (true) {
                dy[] dyVarArr = this.f38998e0;
                if (i10 < dyVarArr.length) {
                    int childCount = dyVarArr[i10].f38702a.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 < childCount) {
                            View childAt = this.f38998e0[i10].f38702a.getChildAt(i11);
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
            w51[] w51VarArr = new w51[1];
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            org.telegram.ui.ActionBar.b6 titleTextView = this.actionBar.getTitleTextView();
            if (titleTextView != null && titleTextView.getRightDrawable() != null) {
                this.E3.f();
                Drawable drawable = this.E3.f32123f[0];
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
            ww wwVar = new ww(this, this, getParentActivity(), Integer.valueOf(i10), getResourceProvider(), w51VarArr);
            if (currentUser != null && DialogObject.getEmojiStatusUntil(currentUser.emoji_status) > 0) {
                wwVar.setExpireDateHint(DialogObject.getEmojiStatusUntil(currentUser.emoji_status));
            }
            Long l10 = this.C3;
            if (l10 != null) {
                wwVar.setSelected(l10);
            } else {
                Drawable drawable2 = this.E3.f32123f[0];
                if (drawable2 instanceof org.telegram.ui.Components.t5) {
                    l4 = Long.valueOf(((org.telegram.ui.Components.t5) drawable2).i());
                } else {
                    l4 = null;
                }
                wwVar.setSelected(l4);
            }
            wwVar.setSaveState(1);
            wwVar.y(this.E3, titleTextView);
            xw xwVar = new xw(this, wwVar);
            this.M0 = xwVar;
            w51VarArr[0] = xwVar;
            xwVar.showAsDropDown(this.actionBar, AndroidUtilities.dp(16.0f), i11, 48);
            w51VarArr[0].b();
        }
    }

    public final void Y4(org.telegram.tgnet.TLRPC.Chat r14, java.lang.Runnable r15, java.lang.Runnable r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.Y4(org.telegram.tgnet.TLRPC$Chat, java.lang.Runnable, java.lang.Runnable):void");
    }

    public final java.util.ArrayList Z3(int r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.Z3(int, int, int, boolean):java.util.ArrayList");
    }

    public final void Z4(boolean z10) {
        dy[] dyVarArr;
        char c10;
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            dyVarArr = this.f38998e0;
            if (i12 >= dyVarArr.length) {
                break;
            }
            dyVarArr[i12].f38702a.C0();
            i12++;
        }
        if (z10 && dyVarArr.length > 1) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        int i13 = dyVarArr[c10].h;
        if (i13 >= 0 && i13 < getMessagesController().getDialogFilters().size()) {
            MessagesController.DialogFilter dialogFilter = getMessagesController().getDialogFilters().get(this.f38998e0[c10].h);
            if (dialogFilter.isDefault()) {
                dy dyVar = this.f38998e0[c10];
                dyVar.f38708s = this.R0;
                zx zxVar = dyVar.f38702a;
                int i14 = zx.C3;
                zxVar.G1();
            } else {
                dy[] dyVarArr2 = this.f38998e0;
                if (dyVarArr2[c10 ^ 1].f38708s == 7) {
                    dyVarArr2[c10].f38708s = 8;
                } else {
                    dyVarArr2[c10].f38708s = 7;
                }
                dyVarArr2[c10].f38702a.setScrollEnabled(true);
                MessagesController messagesController = getMessagesController();
                if (this.f38998e0[c10].f38708s == 8) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                messagesController.selectDialogFilter(dialogFilter, i10);
            }
            dy[] dyVarArr3 = this.f38998e0;
            if (dyVarArr3.length > 1) {
                dyVarArr3[1].E = dialogFilter.locked;
            }
            dy dyVar2 = dyVarArr3[c10];
            iw iwVar = dyVar2.d;
            iwVar.h = dyVar2.f38708s;
            iwVar.l();
            dy dyVar3 = this.f38998e0[c10];
            ew ewVar = dyVar3.f38704c;
            if (dyVar3.f38708s == 0 && h4() && this.f38998e0[c10].v == 2) {
                i11 = 1;
            }
            ewVar.h1(i11, (int) this.N);
            z3(this.f38998e0[c10]);
        }
    }

    public final float a4(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f - this.f38981b.e;
        } else {
            f7 = 1.0f;
        }
        return f7 * (1.0f - d4()) * this.f39062r.e;
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
        p31 p31Var = this.Z;
        if (p31Var != null && p31Var.getVisibility() != 8) {
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
            float f20 = this.f39097x1;
            f11 = (f7 * f20) + c3.h0.z(1.0f, f20, f10, f19);
            f12 = this.f39099x3;
        } else {
            f11 = (f7 * this.f39097x1) + this.N;
            f12 = this.f39099x3;
        }
        float f21 = f11 + f12 + this.T;
        rx rxVar = this.X;
        if (rxVar != null && rxVar.getVisibility() == 0) {
            f13 = this.X.getAlpha();
        } else {
            f13 = 0.0f;
        }
        float dp = AndroidUtilities.dp(4.0f) * f13;
        tx txVar = this.f39105z0;
        if (txVar != null) {
            txVar.setTranslationY(f21 - dp);
            f15 = this.f39105z0.getAlpha();
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
            if (this.f38977a0 == null) {
                i10 = AndroidUtilities.dp(44.0f);
            } else {
                i10 = 0;
            }
            wsVar.setTranslationY(AndroidUtilities.lerp(f22, i11 - i10, this.f38981b.e));
            f17 = this.J1.getMetadata().f19342c.f19350a;
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
            Matrix matrix = vsVar2.f34362b;
            if (vsVar2.e != lerp || vsVar2.f34364f != min) {
                vsVar2.e = lerp;
                vsVar2.f34364f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, lerp);
                LinearGradient linearGradient = vsVar2.f34363c;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23350ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23414g8));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23396f9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23415g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23524m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.il));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23749y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23379e9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23360d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23341c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.M7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.N7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23432h9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23544n9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23506l9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23564o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23469j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23488k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23320b8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23301a8));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23319b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23581p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23486k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.zj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Z5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23771z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23752y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23715w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23696v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23677u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23658t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23638s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23618r9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23584p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23452i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23321b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23302a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23358d7));
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.b5(boolean):void");
    }

    public final int c4() {
        if (this.K) {
            return AndroidUtilities.dp(81.0f);
        }
        return 0;
    }

    public final void c5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.c5():void");
    }

    @Override
    public final boolean canBeginSlide() {
        tx txVar;
        if (!this.G3.c()) {
            if (this.R0 == 3 && (txVar = this.f39105z0) != null && txVar.getVisibility() == 0 && this.f39105z0.K > 0) {
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
            mx mxVar = this.C0;
            if (mxVar != null) {
                mxVar.S();
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
        org.telegram.ui.ActionBar.f7.m(b8Var, 3, org.telegram.ui.ActionBar.y6.f23657t8, getResourceProvider());
        org.telegram.ui.ActionBar.f7.a(b8Var, org.telegram.ui.ActionBar.y6.f23770z8, getResourceProvider(), true);
        org.telegram.ui.ActionBar.f7.m(b8Var, 1, org.telegram.ui.ActionBar.y6.f23695v8, getResourceProvider());
        org.telegram.ui.ActionBar.f7.b(b8Var, org.telegram.ui.ActionBar.y6.f23751y8, getResourceProvider(), true);
        if (b8Var.f22780p1 == null) {
            di.k kVar = new di.k(b8Var, b8Var.getContext(), b8Var.J0, b8Var.O0);
            b8Var.f22780p1 = kVar;
            kVar.setClipChildren(false);
            b8Var.addView(b8Var.f22780p1);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.createView(android.content.Context):android.view.View");
    }

    public final float d4() {
        vw vwVar = this.G3;
        if (vwVar != null && vwVar.c()) {
            return this.G3.e;
        }
        return 0.0f;
    }

    public final void d5() {
        bi.r1 r1Var;
        zx zxVar;
        boolean z10;
        int i10;
        try {
            lw lwVar = this.B1;
            if (lwVar != null && lwVar.getEditField() != null) {
                this.B1.getEditField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.y6.Wd));
            }
            NumberTextView numberTextView = this.f39015h1;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23751y8));
            }
            tx txVar = this.f39105z0;
            int i11 = 0;
            if (txVar != null && (txVar.getSelectorDrawable() instanceof GradientDrawable)) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null && kVar.q()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                GradientDrawable gradientDrawable = (GradientDrawable) this.f39105z0.getSelectorDrawable();
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.y6.Gh;
                } else {
                    i10 = org.telegram.ui.ActionBar.y6.K8;
                }
                gradientDrawable.setColor(getThemedColor(i10));
                this.f39105z0.invalidate();
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                if (this.W2 != 0 || this.Y2 != 0) {
                    kVar2.D(getThemedColor(org.telegram.ui.ActionBar.y6.Q8), false);
                    this.actionBar.D(getThemedColor(org.telegram.ui.ActionBar.y6.R8), true);
                }
                if (this.actionBar.q()) {
                    this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6));
                }
                j5();
            }
            if (this.f38998e0 != null) {
                while (true) {
                    dy[] dyVarArr = this.f38998e0;
                    if (i11 >= dyVarArr.length) {
                        break;
                    }
                    dy dyVar = dyVarArr[i11];
                    if (dyVar != null && (zxVar = dyVar.f38702a) != null) {
                        zxVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6));
                    }
                    i11++;
                }
            }
            mx mxVar = this.C0;
            if (mxVar != null && (r1Var = mxVar.f28241a0) != null) {
                r1Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6));
            }
            li.w1 w1Var = this.C1;
            if (w1Var != null) {
                w1Var.setScrimViewBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6));
            }
            fi.v3 v3Var = this.f39052p0;
            if (v3Var != null) {
                v3Var.h(getThemedColor(org.telegram.ui.ActionBar.y6.Fi));
            }
            fi.v3 v3Var2 = this.f39057q0;
            if (v3Var2 != null) {
                v3Var2.h(getThemedColor(org.telegram.ui.ActionBar.y6.Fi));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void didReceivedNotification(int r27, int r28, java.lang.Object... r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.didReceivedNotification(int, int, java.lang.Object[]):void");
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
        return -AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(48.0f), this.f38981b.e);
    }

    public final void e5(boolean z10, boolean z11) {
        ?? r52;
        int L0;
        boolean z12;
        dy[] dyVarArr;
        MessagesController.DialogFilter dialogFilter;
        boolean z13;
        Object[] objArr;
        s4.m0 m0Var;
        boolean z14;
        boolean z15;
        boolean z16;
        if (this.f39105z0 != null && !this.inPreviewMode && !this.f39060q3) {
            vw vwVar = this.G3;
            if (vwVar == null || !vwVar.c()) {
                org.telegram.ui.Components.l80 l80Var = this.L0;
                if (l80Var != null) {
                    l80Var.u();
                    this.L0 = null;
                }
                ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
                int size = dialogFilters.size();
                oe.b bVar = this.f39062r;
                boolean z17 = true;
                boolean z18 = false;
                if (size > 1) {
                    if (!z10 && this.f39105z0.getVisibility() == 0) {
                        r52 = 0;
                    } else {
                        if (this.f39105z0.getVisibility() != 0) {
                            z13 = false;
                        } else {
                            z13 = z11;
                        }
                        this.f39089w = true;
                        boolean isEmpty = this.f39105z0.h.isEmpty();
                        if (this.fragmentView != null) {
                            if (!this.isPaused && this.R3 == null) {
                                z16 = z11;
                            } else {
                                z16 = false;
                            }
                            if (!this.f39060q3) {
                                bVar.a(this.f39089w, z16);
                            }
                        }
                        int currentTabId = this.f39105z0.getCurrentTabId();
                        int currentTabStableId = this.f39105z0.getCurrentTabStableId();
                        if (currentTabId != this.f39105z0.getDefaultTabId() && currentTabId >= dialogFilters.size()) {
                            this.f39105z0.L = -1;
                            objArr = 1;
                        } else {
                            objArr = null;
                        }
                        tx txVar = this.f39105z0;
                        txVar.h.clear();
                        txVar.f32429j0.clear();
                        txVar.f32431l0.clear();
                        txVar.m0.clear();
                        txVar.f32433n0.clear();
                        txVar.f32434o0.clear();
                        txVar.M = 0;
                        int size2 = dialogFilters.size();
                        int i10 = 0;
                        while (i10 < size2) {
                            if (dialogFilters.get(i10).isDefault()) {
                                this.f39105z0.a(i10, 0, LocaleController.getString(R.string.FilterAllChats), null, false, true, dialogFilters.get(i10).locked);
                                z15 = z18;
                            } else {
                                MessagesController.DialogFilter dialogFilter2 = dialogFilters.get(i10);
                                z15 = z18;
                                this.f39105z0.a(i10, dialogFilter2.localId, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, false, dialogFilters.get(i10).locked);
                            }
                            i10++;
                            z18 = z15;
                        }
                        boolean z19 = z18;
                        if (currentTabStableId >= 0) {
                            if (objArr != null && !this.f39105z0.h(currentTabStableId)) {
                                while (currentTabId >= 0) {
                                    tx txVar2 = this.f39105z0;
                                    if (txVar2.h(txVar2.f32430k0.get(currentTabId, -1))) {
                                        break;
                                    }
                                    currentTabId--;
                                }
                                if (currentTabId < 0) {
                                    currentTabId = z19 ? 1 : 0;
                                }
                            }
                            if (this.f39105z0.f32430k0.get(this.f38998e0[z19 ? 1 : 0].h, -1) != currentTabStableId) {
                                this.f38998e0[z19 ? 1 : 0].h = currentTabId;
                                isEmpty = true;
                            }
                        }
                        int i11 = z19 ? 1 : 0;
                        while (true) {
                            dy[] dyVarArr2 = this.f38998e0;
                            if (i11 >= dyVarArr2.length) {
                                break;
                            }
                            if (dyVarArr2[i11].h >= dialogFilters.size()) {
                                this.f38998e0[i11].h = dialogFilters.size() - 1;
                            }
                            this.f38998e0[i11].f38702a.setScrollingTouchSlop(1);
                            i11++;
                        }
                        tx txVar3 = this.f39105z0;
                        bi.r1 r1Var = txVar3.F;
                        if (z13) {
                            m0Var = txVar3.f32440s0;
                        } else {
                            m0Var = null;
                        }
                        r1Var.setItemAnimator(m0Var);
                        txVar3.I.l();
                        if (isEmpty) {
                            Z4(z19);
                        }
                        tx txVar4 = this.f39105z0;
                        int currentTabId2 = txVar4.getCurrentTabId();
                        ArrayList arrayList = txVar4.h;
                        int i12 = 0;
                        while (true) {
                            if (i12 < arrayList.size()) {
                                if (((org.telegram.ui.Components.p00) arrayList.get(i12)).f31417a == currentTabId2) {
                                    z14 = ((org.telegram.ui.Components.p00) arrayList.get(i12)).f31420f;
                                    break;
                                }
                                i12++;
                            } else {
                                z14 = false;
                                break;
                            }
                        }
                        if (z14) {
                            tx txVar5 = this.f39105z0;
                            ArrayList arrayList2 = txVar5.h;
                            if (!arrayList2.isEmpty()) {
                                r52 = 0;
                                txVar5.f((org.telegram.ui.Components.p00) arrayList2.get(0), 0);
                            }
                        }
                        r52 = 0;
                    }
                } else {
                    r52 = 0;
                    if (this.f39105z0.getVisibility() != 8) {
                        this.f39105z0.setIsEditing(false);
                        Q4(false);
                        this.f39045n3 = false;
                        if (this.f39039m3) {
                            this.f39039m3 = false;
                            this.f38998e0[0].setTranslationX(0.0f);
                            this.f38998e0[1].setTranslationX(dyVarArr[0].getMeasuredWidth());
                        }
                        if (this.f38998e0[0].h != this.f39105z0.getDefaultTabId()) {
                            this.f38998e0[0].h = this.f39105z0.getDefaultTabId();
                            iw iwVar = this.f38998e0[0].d;
                            iwVar.h = 0;
                            iwVar.l();
                            dy dyVar = this.f38998e0[0];
                            dyVar.f38708s = this.R0;
                            dyVar.d.l();
                        }
                        this.f38998e0[1].setVisibility(8);
                        dy dyVar2 = this.f38998e0[1];
                        dyVar2.h = 0;
                        iw iwVar2 = dyVar2.d;
                        iwVar2.h = 0;
                        iwVar2.l();
                        dy dyVar3 = this.f38998e0[1];
                        dyVar3.f38708s = this.R0;
                        dyVar3.d.l();
                        this.f39089w = false;
                        if (this.fragmentView != null) {
                            if (!this.isPaused && this.R3 == null) {
                                z12 = z11;
                            } else {
                                z12 = false;
                            }
                            if (!this.f39060q3) {
                                bVar.a(false, z12);
                            }
                        }
                        int i13 = 0;
                        while (true) {
                            dy[] dyVarArr3 = this.f38998e0;
                            if (i13 >= dyVarArr3.length) {
                                break;
                            }
                            dy dyVar4 = dyVarArr3[i13];
                            if (dyVar4.f38708s == 0 && dyVar4.v == 2 && h4() && ((L0 = this.f38998e0[i13].f38704c.L0()) == 0 || L0 == 1)) {
                                this.f38998e0[i13].f38704c.h1(1, (int) this.N);
                            }
                            this.f38998e0[i13].f38702a.setScrollingTouchSlop(0);
                            this.f38998e0[i13].f38702a.requestLayout();
                            this.f38998e0[i13].requestLayout();
                            i13++;
                        }
                        this.f39105z0.L = -1;
                        r52 = 0;
                    }
                }
                b5(r52);
                int i14 = this.f38998e0[r52].f38708s;
                if ((i14 == 7 || i14 == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[i14 - 7]) != null) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < dialogFilters.size()) {
                            MessagesController.DialogFilter dialogFilter3 = dialogFilters.get(i15);
                            if (dialogFilter3 != null && dialogFilter3.f19548id == dialogFilter.f19548id) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.f5(boolean, java.util.ArrayList, java.util.ArrayList, boolean, boolean):void");
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.l80 l80Var = this.L0;
        if (l80Var != null) {
            l80Var.u();
        }
    }

    public final UndoView g4() {
        V3();
        UndoView[] undoViewArr = this.f39102y0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.d(2, true);
            wx wxVar = (wx) this.fragmentView;
            wxVar.removeView(undoViewArr[0]);
            wxVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void g5() {
        float f7 = (((-this.f39013g4) - this.f39028j4) - this.f39080u1) - this.f39085v1;
        org.telegram.ui.Components.j20 j20Var = this.f39074t0;
        if (j20Var != null) {
            j20Var.setTranslationY(f7);
        }
        org.telegram.ui.Components.j20 j20Var2 = this.f39079u0;
        if (j20Var2 != null) {
            j20Var2.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            fi.v3 v3Var = this.f39052p0;
            if (v3Var != null) {
                v3Var.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.e5 getBackButtonState() {
        if (!m4() && !this.G3.f39488f) {
            return org.telegram.ui.ActionBar.e5.f22607b;
        }
        return org.telegram.ui.ActionBar.e5.f22606a;
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f7) {
        int i10;
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.X3, 1.0f);
            this.f38980a4 = ofFloat;
            return ofFloat;
        }
        if (getLayoutContainer() != null && getLayoutContainer().getMeasuredWidth() > 0) {
            i10 = (int) Utilities.clamp((200.0f / getLayoutContainer().getMeasuredWidth()) * f7, 200.0f, 80.0f);
        } else {
            i10 = 150;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.X3, 1.0f);
        this.f38980a4 = ofFloat2;
        ofFloat2.addUpdateListener(new gv(this, 2));
        this.f38980a4.setInterpolator(org.telegram.ui.Components.ds.f27531g);
        this.f38980a4.setDuration(i10);
        this.f38980a4.start();
        return this.f38980a4;
    }

    @Override
    public final java.util.ArrayList getThemeDescriptions() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.getThemeDescriptions():java.util.ArrayList");
    }

    public final boolean h4() {
        if (!this.f39035l2 && this.R0 == 0 && this.Y2 == 0 && this.W2 == 0 && getMessagesController().hasHiddenArchive()) {
            return true;
        }
        return false;
    }

    public final void h5(boolean z10) {
        boolean z11;
        boolean z12 = this.f39035l2;
        if ((!z12 || this.R0 == 10) && this.W2 == 0 && this.Y2 == 0 && !this.inPreviewMode && ((!this.f39026j2 || z12) && !this.U3)) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.j20 j20Var = this.f39074t0;
        if (j20Var != null) {
            j20Var.e(z11, z10);
        }
        org.telegram.ui.Components.j20 j20Var2 = this.f39079u0;
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
        if (this.f39042n0 != null) {
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
                if (!getDownloadController().hasUnviewedDownloads() && !z12 && (this.f39009g0.getVisibility() != 0 || this.f39009g0.getAlpha() != 1.0f || z11)) {
                    this.f39019i0 = false;
                } else {
                    this.f39019i0 = true;
                }
                F3();
                boolean z14 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i12 = this.f38995d2;
                if (i12 == 3 || i12 == 5) {
                    z13 = true;
                }
                org.telegram.ui.ActionBar.g1 g1Var = this.f39047o0;
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
                this.f39042n0.b(z14, z13, z10);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        vw vwVar;
        if (!this.f39026j2 && (vwVar = this.G3) != null && vwVar.getFragment() != null) {
            return this.G3.getFragment().isLightStatusBar();
        }
        if (i0.a.h(getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6)) > 0.699999988079071d) {
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
        org.telegram.ui.ActionBar.j2 j2Var = this.f38999e1;
        boolean z12 = true;
        if (j2Var != null) {
            j2Var.c(0.0f, true);
        }
        tx txVar = this.f39105z0;
        if (txVar != null) {
            txVar.b(org.telegram.ui.ActionBar.y6.K8, org.telegram.ui.ActionBar.y6.I8, org.telegram.ui.ActionBar.y6.J8, org.telegram.ui.ActionBar.y6.L8, org.telegram.ui.ActionBar.y6.f23357d6);
        }
        ValueAnimator valueAnimator = this.f39087v3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f39087v3 = null;
        }
        if (this.f39082u3 == 0.0f) {
            return;
        }
        K4(-b4());
        boolean z13 = false;
        int i11 = 0;
        while (true) {
            dy[] dyVarArr = this.f38998e0;
            if (i11 >= dyVarArr.length) {
                break;
            }
            dy dyVar = dyVarArr[i11];
            if (dyVar != null) {
                dyVar.f38702a.I0(true);
            }
            i11++;
        }
        if (this.K) {
            i10 = 81;
        } else {
            i10 = 0;
        }
        float max = Math.max(0.0f, AndroidUtilities.dp(i10 + 48) + this.N);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f39082u3, 0.0f);
        this.f39087v3 = ofFloat;
        ofFloat.addUpdateListener(new lv(this, max, 1));
        this.f39087v3.addListener(new ex(this, max, 0));
        this.f39087v3.setInterpolator(org.telegram.ui.Components.ds.f27530f);
        this.f39087v3.setDuration(200L);
        this.f39087v3.start();
        this.Y0 = false;
        ArrayList arrayList = this.f38978a1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList.get(i12);
                q00.v0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
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
        if (this.f38998e0 != null) {
            int i13 = z11;
            while (true) {
                dy[] dyVarArr2 = this.f38998e0;
                if (i13 >= dyVarArr2.length) {
                    break;
                }
                dyVarArr2[i13].d.H = z11;
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
        if (this.f39072s3 && this.actionBar != null) {
            if (this.W2 == 0 && this.Y2 == 0) {
                i10 = org.telegram.ui.ActionBar.y6.f23695v8;
            } else {
                i10 = org.telegram.ui.ActionBar.y6.O8;
            }
            int themedColor = getThemedColor(i10);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i12 = org.telegram.ui.ActionBar.y6.f23751y8;
            kVar.y(i0.a.f(this.f39097x1, themedColor, getThemedColor(i12)), false);
            this.actionBar.y(i0.a.f(this.f39097x1, getThemedColor(i12), getThemedColor(i12)), true);
            if (this.W2 == 0 && this.Y2 == 0) {
                i11 = org.telegram.ui.ActionBar.y6.f23657t8;
            } else {
                i11 = org.telegram.ui.ActionBar.y6.N8;
            }
            int themedColor2 = getThemedColor(i11);
            this.actionBar.x(i0.a.f(this.f39097x1, themedColor2, getThemedColor(org.telegram.ui.ActionBar.y6.f23770z8)), false);
        }
    }

    public final void k4(boolean z10) {
        if (this.G3.c()) {
            z10 = true;
        }
        if (!z10 || !this.f38984b2) {
            this.U3 = z10;
            h5(true);
            if (z10) {
                fi.v3 v3Var = this.f39052p0;
                if (v3Var != null) {
                    v3Var.e(true);
                }
                fi.v3 v3Var2 = this.f39057q0;
                if (v3Var2 != null) {
                    v3Var2.e(true);
                }
            }
        }
    }

    public final void k5() {
        org.telegram.ui.Components.rr0 rr0Var;
        int i10;
        lw lwVar = this.B1;
        ArrayList arrayList = this.I2;
        if (lwVar != null) {
            this.f39041n.a(!arrayList.isEmpty(), true);
            l5();
            if (arrayList.isEmpty()) {
                if (this.R0 == 3 && this.f39006f2 == null) {
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
                    this.B1.j0(false, false, false);
                    this.B1.L();
                    this.B1.setTag(null);
                    this.fragmentView.requestLayout();
                }
            } else {
                if (this.B1.getTag() == null) {
                    if (!i4() && this.E2 == null) {
                        this.B1.setFieldText("");
                    }
                    this.B1.setTag(1);
                    if (!this.W3 && (rr0Var = this.G2) != null) {
                        this.W3 = true;
                        String string2 = LocaleController.getString(R.string.ShareTapToEditMedia);
                        rr0Var.j();
                        rr0Var.F = string2;
                        org.telegram.ui.Components.pr0 pr0Var = rr0Var.f32326a[0];
                        if (string2 != null) {
                            pr0Var.e.l(string2, false);
                        }
                        org.telegram.ui.Components.np0 np0Var = new org.telegram.ui.Components.np0(rr0Var, 3);
                        rr0Var.G = np0Var;
                        AndroidUtilities.runOnUIThread(np0Var, 1000L);
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
        org.telegram.ui.Components.rr0 rr0Var = this.G2;
        if (rr0Var != null) {
            int i10 = this.currentAccount;
            rr0Var.h(i10);
            rr0Var.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
            ArrayList arrayList = rr0Var.f32329f;
            arrayList.clear();
            ArrayList arrayList2 = this.I2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            org.telegram.ui.Components.pr0 pr0Var = rr0Var.f32326a[0];
            if (rr0Var.f32327b == 1) {
                pr0Var.d.l(rr0Var.c(pr0Var), false);
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
        if (this.f39034l0 == null) {
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
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f22177id);
        if ((topics != null && !topics.isEmpty()) || !MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f22177id)) {
            return false;
        }
        return true;
    }

    public final void n5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.r5 r5Var;
        org.telegram.ui.ActionBar.u6 u6Var;
        sw swVar = this.E0;
        org.telegram.ui.Components.r5 r5Var2 = null;
        if (swVar != null && (r5Var = swVar.f9071a0) != null && swVar.f9090q0 != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                r5Var.j(emojiStatusDocumentId.longValue(), z10);
                r5Var.m(user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible, z10);
            } else if (user != null && MessagesController.getInstance(swVar.f9078f).isPremiumUser(user)) {
                if (swVar.N0 == null) {
                    swVar.N0 = swVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    swVar.N0 = new org.telegram.ui.Components.s5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), swVar.N0);
                }
                Drawable drawable = swVar.N0;
                int i10 = org.telegram.ui.ActionBar.y6.f23777zh;
                ey eyVar = swVar.f9077e0;
                if (eyVar != null) {
                    u6Var = eyVar.getResourceProvider();
                } else {
                    u6Var = null;
                }
                org.telegram.ui.ActionBar.f7.y(swVar, drawable, i10, u6Var, PorterDuff.Mode.MULTIPLY);
                r5Var.g(swVar.N0, z10);
                r5Var.m(false, z10);
            } else {
                r5Var.g(null, z10);
                r5Var.m(false, z10);
            }
            r5Var.k(Integer.valueOf(swVar.f(org.telegram.ui.ActionBar.y6.f23777zh)));
            swVar.W.invalidate();
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
                this.actionBar.setRightDrawableOnClick(new jv(this, 2));
                f61.t(this.currentAccount);
            } else if (user != null && MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
                if (this.L3 == null) {
                    this.L3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    this.L3 = new org.telegram.ui.Components.s5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.L3);
                }
                Drawable drawable2 = this.L3;
                int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23777zh);
                this.f39100x4 = themedColor;
                drawable2.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                this.E3.g(this.L3, z10);
                this.E3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(new jv(this, 3));
                f61.t(this.currentAccount);
            } else {
                this.E3.g(null, z10);
                this.E3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(null);
            }
            org.telegram.ui.Components.r5 r5Var3 = this.E3;
            int i11 = org.telegram.ui.ActionBar.y6.f23777zh;
            r5Var3.k(Integer.valueOf(getThemedColor(i11)));
            org.telegram.ui.Cells.o oVar = this.F3;
            if (oVar != null) {
                oVar.setColor(getThemedColor(i11));
            }
            xw xwVar = this.M0;
            if (xwVar != null && (xwVar.getContentView() instanceof f61)) {
                org.telegram.ui.ActionBar.b6 titleTextView = this.actionBar.getTitleTextView();
                f61 f61Var = (f61) this.M0.getContentView();
                if (titleTextView != null) {
                    Drawable rightDrawable = titleTextView.getRightDrawable();
                    org.telegram.ui.Components.r5 r5Var4 = this.E3;
                    if (rightDrawable == r5Var4) {
                        r5Var2 = r5Var4;
                    }
                }
                f61Var.y(r5Var2, titleTextView);
            }
        }
    }

    public final boolean o4(TLRPC.Dialog dialog) {
        char c10;
        if (dialog == null) {
            return false;
        }
        int i10 = this.f38998e0[0].f38708s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.q() || this.actionBar.r(null))) {
            MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
            if (this.f38998e0[0].f38708s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            dialogFilter = dialogFilterArr[c10];
        }
        if (dialogFilter != null) {
            if (dialogFilter.pinnedDialogs.indexOfKey(dialog.f22032id) < 0) {
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
            if (!this.O3 && storiesEnabled && (v3Var = this.f39052p0) != null) {
                v3Var.u();
            }
            this.O3 = storiesEnabled;
        }
        org.telegram.ui.Components.j20 j20Var = this.f39074t0;
        if (j20Var == null) {
            return;
        }
        if (this.R0 == 10) {
            j20Var.setImageResource(R.drawable.floating_check);
            this.f39074t0.setContentDescription(LocaleController.getString(R.string.Done));
            return;
        }
        j20Var.setImageResource(R.drawable.filled_fab_compose_32);
        this.f39074t0.setContentDescription(LocaleController.getString(R.string.NewMessageTitle));
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
                mx mxVar = this.C0;
                if (mxVar != null) {
                    mxVar.S();
                    return false;
                }
            }
        } else {
            org.telegram.ui.Components.l80 l80Var = this.L0;
            if (l80Var != null) {
                if (z10) {
                    l80Var.u();
                    this.L0 = null;
                    return false;
                }
            } else {
                tx txVar = this.f39105z0;
                if (txVar != null && txVar.f32432n) {
                    if (z10) {
                        txVar.setIsEditing(false);
                        Q4(false);
                        return false;
                    }
                } else {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar != null && kVar.q()) {
                        if (z10) {
                            mx mxVar2 = this.C0;
                            if (mxVar2 != null && mxVar2.getVisibility() == 0) {
                                this.C0.R(false);
                            }
                            j4(true);
                            return false;
                        }
                    } else if (this.f38981b.f19326f) {
                        if (z10) {
                            this.X.f30347r.getText().clear();
                            this.Y.b(false);
                            this.X.f30347r.clearFocus();
                            return false;
                        }
                    } else {
                        tx txVar2 = this.f39105z0;
                        if (txVar2 != null && txVar2.getVisibility() == 0 && !this.f39017h3) {
                            tx txVar3 = this.f39105z0;
                            if (!txVar3.O && !this.f39039m3) {
                                ArrayList arrayList = txVar3.h;
                                if (!arrayList.isEmpty() && txVar3.L != ((org.telegram.ui.Components.p00) arrayList.get(0)).f31417a) {
                                    if (z10) {
                                        tx txVar4 = this.f39105z0;
                                        ArrayList arrayList2 = txVar4.h;
                                        if (!arrayList2.isEmpty()) {
                                            txVar4.f((org.telegram.ui.Components.p00) arrayList2.get(0), 0);
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        lw lwVar = this.B1;
                        if (lwVar != null && lwVar.p0()) {
                            if (z10) {
                                this.B1.i0(true);
                            }
                        } else {
                            sw swVar = this.E0;
                            if (swVar.O == 0 && swVar.S.L0() != 0) {
                                swVar.h.y0(0);
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
        tx txVar;
        if (this.V1) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.g(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                mx mxVar = this.C0;
                if (mxVar != null) {
                    mxVar.f28244d0.Q(this.W1, tLObject);
                }
                this.X1 = null;
            }
            this.V1 = false;
        }
        if (!this.K && (txVar = this.f39105z0) != null && txVar.getVisibility() == 0 && this.f39062r.f19326f) {
            int i10 = (int) (-this.N);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (i10 != 0 && i10 != currentActionBarHeight && i10 >= currentActionBarHeight / 2) {
                this.f38998e0[0].f38702a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.f39102y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        if (!isInPreviewMode() && (ccVar = this.K0) != null && ccVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        J3();
        this.f39063r0 = true;
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
        if (this.f39063r0 && !this.f39069s0 && (v3Var = this.f39052p0) != null && this.O3) {
            this.f39069s0 = true;
            this.f39063r0 = false;
            v3Var.u();
        }
        AndroidUtilities.runOnUIThread(new uv(this, 4), 200L);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.l80 l80Var = this.L0;
        if (l80Var != null) {
            l80Var.u();
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
            this.f39035l2 = bundle.getBoolean("onlySelect", false);
            this.f39038m2 = this.arguments.getBoolean("canSelectTopics", false);
            this.f39059q2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.R0 = this.arguments.getInt("dialogsType", 0);
            this.O0 = this.arguments.getBoolean("quote", false);
            this.N0 = this.arguments.getBoolean("reply_to", false);
            this.P0 = this.arguments.getLong("reply_to_author", 0L);
            this.Q0 = this.arguments.getLong("forward_into_channel", 0L);
            this.f39006f2 = this.arguments.getString("selectAlertString");
            this.f39011g2 = this.arguments.getString("selectAlertStringGroup");
            this.f39016h2 = this.arguments.getString("addToGroupAlertString");
            this.f39065r2 = this.arguments.getBoolean("allowSwitchAccount");
            this.f39071s2 = this.arguments.getBoolean("checkCanWrite", true);
            this.f39076t2 = this.arguments.getBoolean("afterSignup", false);
            this.W2 = this.arguments.getInt("folderId", 0);
            long j10 = this.arguments.getLong("community_id", 0L);
            this.Y2 = j10;
            if (j10 != 0) {
                this.Z2 = getMessagesController().getChat(Long.valueOf(this.Y2));
                this.f38979a3 = getMessagesController().getChatFull(this.Y2);
            }
            this.f39021i2 = this.arguments.getBoolean("resetDelegate", true);
            this.S0 = this.arguments.getInt("messagesCount", 0);
            this.T0 = this.arguments.getInt("hasPoll", 0);
            this.U0 = this.arguments.getBoolean("hasInvoice", false);
            this.f39081u2 = this.arguments.getBoolean("showSetPasswordConfirm", this.f39081u2);
            this.arguments.getInt("otherwiseRelogin");
            this.f39086v2 = this.arguments.getBoolean("allowGroups", true);
            this.f39092w2 = this.arguments.getBoolean("allowMegagroups", true);
            this.f39098x2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.f39104y2 = this.arguments.getBoolean("allowChannels", true);
            this.f39107z2 = this.arguments.getBoolean("allowUsers", true);
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
        if (this.f39044n2 == null) {
            this.f38995d2 = getConnectionsManager().getConnectionState();
            this.K3.addGlobal(NotificationCenter.emojiLoaded);
            if (!this.f39035l2) {
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
            storiesController.W();
            if (!storiesController.f8644s) {
                ConnectionsManager.getInstance(storiesController.f8629a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new di.g6(storiesController, 0));
            }
        }
        getMessagesController().loadPinnedDialogs(this.W2, 0L, null);
        if (this.R3 != null && !getMessagesStorage().isDatabaseMigrationInProgress()) {
            pu puVar = this.R3;
            if (puVar.getParent() != null) {
                ((ViewGroup) puVar.getParent()).removeView(puVar);
            }
            this.R3 = null;
        }
        if (m4()) {
            di.h7 storiesController2 = getMessagesController().getStoriesController();
            if (storiesController2.f8650z) {
                storiesController2.T(true);
            }
        } else {
            getMessagesController().getStoriesController().W();
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
        this.f39023i4 = i10;
        if (this.W) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.f39028j4 = i11;
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
        lw lwVar = this.B1;
        if (lwVar != null) {
            lwVar.y0();
        }
        org.telegram.ui.Components.rr0 rr0Var = this.G2;
        if (rr0Var != null) {
            rr0Var.j();
        }
        org.telegram.ui.Components.d71 d71Var = this.H2;
        if (d71Var != null) {
            AndroidUtilities.cancelRunOnUIThread(d71Var);
            this.H2 = null;
        }
        UndoView undoView = this.f39102y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f39055p3.unlock();
        this.C2 = null;
        ga1 ga1Var = ga1.f39578b;
        if (ga1Var != null) {
            ga1Var.dismiss();
            ga1.f39578b = null;
        }
    }

    @Override
    public final void onPanTranslationUpdate(float f7) {
        if (this.f38998e0 != null) {
            this.J0 = f7;
            lw lwVar = this.B1;
            int i10 = 0;
            if (lwVar != null && lwVar.p0()) {
                this.fragmentView.setTranslationY(f7);
                while (true) {
                    dy[] dyVarArr = this.f38998e0;
                    if (i10 >= dyVarArr.length) {
                        break;
                    }
                    dyVarArr[i10].setTranslationY(0.0f);
                    i10++;
                }
                if (!this.f39035l2) {
                    this.actionBar.setTranslationY(0.0f);
                    org.telegram.ui.Components.qc qcVar = this.f39050o3;
                    if (qcVar != null) {
                        qcVar.l();
                    }
                }
                mx mxVar = this.C0;
                if (mxVar != null) {
                    mxVar.setTranslationY(this.I0);
                    return;
                }
                return;
            }
            while (true) {
                dy[] dyVarArr2 = this.f38998e0;
                if (i10 >= dyVarArr2.length) {
                    break;
                }
                dyVarArr2[i10].setTranslationY(f7);
                i10++;
            }
            if (!this.f39035l2) {
                this.actionBar.setTranslationY(f7);
                org.telegram.ui.Components.qc qcVar2 = this.f39050o3;
                if (qcVar2 != null) {
                    qcVar2.l();
                }
            }
            mx mxVar2 = this.C0;
            if (mxVar2 != null) {
                mxVar2.setTranslationY(this.J0 + this.I0);
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
        vw vwVar = this.G3;
        if (vwVar != null) {
            vwVar.f39490r = true;
            cx cxVar = vwVar.f39485a;
            if (cxVar != null) {
                cxVar.onPause();
            }
        }
        org.telegram.ui.Components.l80 l80Var = this.L0;
        if (l80Var != null) {
            l80Var.u();
        }
        lw lwVar = this.B1;
        if (lwVar != null) {
            lwVar.A0();
        }
        int i10 = 0;
        UndoView undoView = this.f39102y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        setBulletinDelegate(null);
        if (this.f38998e0 == null) {
            return;
        }
        while (true) {
            dy[] dyVarArr = this.f38998e0;
            if (i10 < dyVarArr.length) {
                dyVarArr[i10].d.getClass();
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
                                ck0.m();
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
                                AndroidUtilities.runOnUIThread(new uv(this, 3));
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
        ey eyVar;
        dy dyVar;
        iw iwVar;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.Components.xo0 xo0Var;
        bi.cc ccVar;
        super.onResume();
        sw swVar = this.E0;
        char c10 = 0;
        if (swVar != null) {
            ArrayList arrayList = swVar.f9100x;
            di.h7 h7Var = swVar.f9093s;
            h7Var.l(h7Var.f8633g);
            h7Var.l(h7Var.h);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TL_stories.PeerStories y3 = h7Var.y(((di.o) arrayList.get(i10)).f8854c);
                if (y3 != null) {
                    h7Var.a0(y3);
                }
            }
        }
        vw vwVar = this.G3;
        if (vwVar != null) {
            vwVar.f39490r = false;
            cx cxVar = vwVar.f39485a;
            if (cxVar != null) {
                cxVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).x() && (ccVar = this.K0) != null && ccVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        if (this.f38998e0 != null) {
            int i11 = 0;
            while (true) {
                dy[] dyVarArr = this.f38998e0;
                if (i11 >= dyVarArr.length) {
                    break;
                }
                dyVarArr[i11].d.l();
                i11++;
            }
        }
        lw lwVar = this.B1;
        if (lwVar != null) {
            lwVar.B0();
        }
        long j10 = 0;
        if (!this.f39035l2 && this.W2 == 0 && this.Y2 == 0) {
            getMediaDataController().checkStickers(4);
        }
        mx mxVar = this.C0;
        if (mxVar != null && (xo0Var = mxVar.f28244d0) != null) {
            xo0Var.l();
        }
        if (!this.f39076t2 && getUserConfig().unacceptedTermsOfService != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.W2 == 0 && this.Y2 == 0 && this.f38990c2 && !this.f39035l2) {
            int i12 = Build.VERSION.SDK_INT;
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.f38990c2 = false;
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
                eyVar = this;
                org.telegram.messenger.s1 s1Var = new org.telegram.messenger.s1(eyVar, z13, z11, z12, parentActivity);
                if (eyVar.f39076t2 && (z11 || z13)) {
                    j10 = 4000;
                }
                AndroidUtilities.runOnUIThread(s1Var, j10);
            } else {
                eyVar = this;
            }
        } else {
            eyVar = this;
            if (!eyVar.f39035l2 && eyVar.W2 == 0 && eyVar.Y2 == 0 && XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(10020)) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutMiuiLockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        int i13 = R.raw.permission_request_apk;
                        int i14 = org.telegram.ui.ActionBar.y6.L5;
                        alertDialog$Builder.m(i13, 72, getThemedColor(i14), null);
                        alertDialog$Builder.n(i14, getResourceProvider());
                        alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.PermissionXiaomiLockscreen);
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new kv(this, 9));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.voip.c1(5));
                        showDialog(alertDialog$Builder.f22369a);
                    }
                } else {
                    return;
                }
            } else if (eyVar.W2 == 0 && eyVar.Y2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutFSILockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                        int i15 = R.raw.permission_request_apk;
                        int i16 = org.telegram.ui.ActionBar.y6.L5;
                        alertDialog$Builder2.m(i15, 72, getThemedColor(i16), null);
                        alertDialog$Builder2.n(i16, getResourceProvider());
                        alertDialog$Builder2.f22369a.T = LocaleController.getString(R.string.PermissionFSILockscreen);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new kv(this, 10));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.voip.c1(6));
                        showDialog(alertDialog$Builder2.f22369a);
                    }
                } else {
                    return;
                }
            }
        }
        R4();
        if (eyVar.f38998e0 != null) {
            int i17 = 0;
            while (true) {
                dy[] dyVarArr2 = eyVar.f38998e0;
                if (i17 >= dyVarArr2.length) {
                    break;
                }
                dy dyVar2 = dyVarArr2[i17];
                if (dyVar2.f38708s == 0 && dyVar2.v == 2 && dyVar2.f38704c.L0() == 0 && h4()) {
                    eyVar.f38998e0[i17].f38704c.h1(1, (int) eyVar.N);
                }
                if (i17 == 0) {
                    eyVar.f38998e0[i17].d.getClass();
                } else {
                    eyVar.f38998e0[i17].d.getClass();
                }
                i17++;
            }
        }
        T4();
        setBulletinDelegate(new d9(this, 4));
        if (eyVar.f39060q3) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), eyVar.classGuid);
        }
        q5(0, false);
        i5(false, true);
        p5(false);
        if (getMessagesStorage().showClearDatabaseAlert) {
            getMessagesStorage().showClearDatabaseAlert = false;
            ga1.n(this);
        }
        J3();
        if (eyVar.f39105z0 != null && (dyVar = eyVar.f38998e0[0]) != null && (iwVar = dyVar.d) != null) {
            int i18 = iwVar.h;
            if (i18 == 7 || i18 == 8) {
                MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
                if (i18 != 7) {
                    c10 = 1;
                }
                MessagesController.DialogFilter dialogFilter = dialogFilterArr[c10];
                if (dialogFilter != null) {
                    eyVar.f39105z0.h(dialogFilter.localId);
                }
            }
        }
    }

    @Override
    public final void onSlideProgress(boolean z10, float f7) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.Z3 && this.f38980a4 == null) {
            N4(f7);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.f39005f1.setColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6));
            v3();
            d5();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        bi.cc ccVar;
        ey eyVar;
        vw vwVar = this.G3;
        if (vwVar != null && vwVar.c()) {
            this.G3.getFragment().onTransitionAnimationEnd(z10, z11);
        } else {
            if (z10 && (ccVar = this.K0) != null && ccVar.getVisibility() == 0) {
                this.K0.setVisibility(8);
                this.K0.setBackground(null);
            }
            if (z10 && this.f39076t2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).f35591x0.c(false);
                }
            }
        }
        if (!z10 && (eyVar = this.X2) != null) {
            eyVar.removeSelfFromStack();
        }
        J3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        vw vwVar = this.G3;
        if (vwVar != null && vwVar.c()) {
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
        if (this.f39035l2 && getMessagesController().isForum(j10)) {
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
        if (this.C2 == null && this.f39044n2 == null) {
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
            vw vwVar = this.G3;
            if ((vwVar == null || !vwVar.c()) && !this.f39060q3 && (kVar = this.actionBar) != null && !kVar.q() && !this.f39035l2) {
                fi.sb sbVar = fi.sb.F2;
                int i11 = 0;
                if ((sbVar != null && sbVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
                    z10 = false;
                }
                if (!m4() && f4().I()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.Y2 != 0) {
                    z12 = false;
                } else if (m4()) {
                    z12 = !f4().h.isEmpty();
                } else {
                    if (!z11 && (((arrayList = (f42 = f4()).f8633g) != null && arrayList.size() > 0) || f42.J())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z11 = f4().I();
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
                    sw swVar = this.E0;
                    if (z13 != z15) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    swVar.p(z10, z14);
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
                        ofFloat.addUpdateListener(new yi(1, this));
                        this.J.addListener(new org.telegram.ui.Components.i31(this, 25));
                        this.J.setDuration(200L);
                        this.J.setInterpolator(org.telegram.ui.Components.ds.f27530f);
                        this.J.start();
                    } else {
                        sw swVar2 = this.E0;
                        if (z16 && !isInPreviewMode()) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        swVar2.setVisibility(i10);
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
                        ofFloat2.addUpdateListener(new kx(this, f13, z12, f11));
                        this.I.addListener(new bx(this, z12, 2));
                        this.I.setDuration(200L);
                        this.I.setInterpolator(org.telegram.ui.Components.ds.f27530f);
                        this.I.start();
                        return;
                    }
                    this.K = z12;
                    sw swVar3 = this.E0;
                    if ((z12 || this.L) && !isInPreviewMode()) {
                        i12 = 0;
                    }
                    swVar3.setVisibility(i12);
                    if (!z12) {
                        K4(0.0f);
                    } else {
                        this.y3 = -AndroidUtilities.dp(81.0f);
                        K4(-b4());
                    }
                    while (true) {
                        dy[] dyVarArr = this.f38998e0;
                        if (i11 >= dyVarArr.length) {
                            break;
                        }
                        dy dyVar = dyVarArr[i11];
                        if (dyVar != null) {
                            dyVar.f38702a.requestLayout();
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
        this.f38980a4 = null;
        this.Z3 = false;
        J4(false);
        N4(1.0f);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.r2 r2Var) {
        boolean presentFragment = super.presentFragment(r2Var);
        if (presentFragment && this.f38998e0 != null) {
            int i10 = 0;
            while (true) {
                dy[] dyVarArr = this.f38998e0;
                if (i10 >= dyVarArr.length) {
                    break;
                }
                dyVarArr[i10].d.getClass();
                i10++;
            }
        }
        fi.v3 v3Var = this.f39052p0;
        if (v3Var != null) {
            v3Var.e(true);
        }
        fi.v3 v3Var2 = this.f39057q0;
        if (v3Var2 != null) {
            v3Var2.e(true);
        }
        org.telegram.ui.Components.qc.e();
        return presentFragment;
    }

    public final void q3(ig.p0 p0Var) {
        mx mxVar;
        if (this.f39060q3 && (mxVar = this.C0) != null) {
            ArrayList arrayList = mxVar.C0;
            if (!arrayList.isEmpty()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (p0Var.b((ig.p0) arrayList.get(i10))) {
                        return;
                    }
                }
            }
            arrayList.add(p0Var);
            rx rxVar = this.X;
            ArrayList arrayList2 = rxVar.F;
            arrayList2.add(p0Var);
            rxVar.I = arrayList2.size() - 1;
            rxVar.e();
            this.X.f30347r.getText().clear();
            f5(true, null, null, false, true);
        }
    }

    public final void q5(int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.q5(int, boolean):void");
    }

    public final void r3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            ArrayList arrayList = new ArrayList();
            if (this.W2 == 0 && this.Y2 == 0 && Build.VERSION.SDK_INT >= 33 && ck0.n(parentActivity)) {
                if (z10) {
                    showDialog(new ck0(parentActivity, !org.telegram.ui.Components.ye0.a(), new sv(parentActivity, 1)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            if (getUserConfig().syncContacts && this.U1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z10) {
                    org.telegram.ui.ActionBar.e2 e2Var = org.telegram.ui.Components.g5.v(parentActivity, new mv(this, 1)).f22369a;
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
                    r4(dialog2.f22032id);
                }
                return;
            }
            return;
        }
        int i11 = this.f38998e0[0].f38708s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i11 == 7 || i11 == 8) && (!this.actionBar.q() || this.actionBar.r(null))) {
            MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
            if (this.f38998e0[0].f38708s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            dialogFilter = dialogFilterArr[c10];
        }
        this.f39108z3 = 2;
        int i12 = -1;
        if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && !dialogFilter.alwaysShow(this.currentAccount, dialog)) {
            I4(true, true);
            w3();
            if (this.R1 != null) {
                int i13 = 0;
                while (true) {
                    if (i13 >= this.R1.size()) {
                        break;
                    } else if (((TLRPC.Dialog) this.R1.get(i13)).f22032id == j10) {
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
            this.f38998e0[0].f38710x.D();
            this.f38998e0[0].q(true);
        }
    }

    public final boolean r5(long j10) {
        TLRPC.Chat chat;
        lw lwVar;
        if ((this.S0 <= 1 && ((lwVar = this.B1) == null || lwVar.getVisibility() != 0 || TextUtils.isEmpty(this.B1.getFieldText()))) || !DialogObject.isChatDialog(j10) || (chat = getMessagesController().getChat(Long.valueOf(-j10))) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) {
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
                org.telegram.ui.Components.rr0 rr0Var = new org.telegram.ui.Components.rr0(getParentActivity(), getResourceProvider());
                this.G2 = rr0Var;
                rr0Var.setLayoutClickListener(new jv(this, 0));
                this.G2.setOnModeChangeListener(new kv(this, 0));
                lw lwVar = this.B1;
                org.telegram.ui.Components.rr0 rr0Var2 = this.G2;
                if (rr0Var2 == null) {
                    lwVar.getClass();
                } else {
                    lwVar.G1 = rr0Var2;
                    lwVar.addView(rr0Var2, 0, org.telegram.ui.Components.kb1.i(-1, 48, 51));
                    lwVar.f25888g3 = false;
                    lwVar.J();
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
                    org.telegram.ui.Components.rr0 rr0Var3 = this.G2;
                    rr0Var3.g(this.currentAccount);
                    if (!str.isEmpty()) {
                        rr0Var3.e(str, true);
                    }
                } else {
                    CharSequence charSequence2 = this.F2;
                    if (charSequence2 != null) {
                        org.telegram.ui.Components.rr0 rr0Var4 = this.G2;
                        rr0Var4.g(this.currentAccount);
                        if (charSequence2.length() > 0) {
                            rr0Var4.e(charSequence2, true);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.B1.setFieldText(charSequence);
            }
            lw lwVar2 = this.B1;
            if (i4()) {
                i10 = R.string.AddCaption;
            } else {
                i10 = R.string.ShareComment;
            }
            lwVar2.setOverrideHint(LocaleController.getString(i10));
            D3();
            if (this.G2.getMode() != 0) {
                this.B1.t1(false, false);
            }
            l5();
        }
    }

    public final boolean s4(org.telegram.tgnet.TLRPC.Chat r6, org.telegram.tgnet.TLRPC.User r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.s4(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):boolean");
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        sw swVar = this.E0;
        if (swVar != null) {
            if (this.G0 && !z10) {
                swVar.setVisibility(0);
            } else {
                swVar.setVisibility(8);
            }
        }
        h5(true);
        c5();
    }

    @Override
    public final void setTitleOverlayText(java.lang.String r6, int r7, java.lang.Runnable r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.setTitleOverlayText(java.lang.String, int, java.lang.Runnable):void");
    }

    public final int t3() {
        if (this.B1 != null) {
            return (int) (this.f39103y1.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(2.0f));
        } else if (this.Y2 != 0) {
            return AndroidUtilities.dp(72.0f) + this.f39013g4;
        } else {
            return this.f39013g4 + this.f39023i4;
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
        org.telegram.ui.Components.xh0 xh0Var;
        hw hwVar;
        org.telegram.ui.Components.xo0 xo0Var;
        bb1 bb1Var;
        mx mxVar = this.C0;
        if (mxVar != null && (xo0Var = mxVar.f28244d0) != null && (bb1Var = xo0Var.f14083k0) != null) {
            int childCount = bb1Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = bb1Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.r4) {
                    org.telegram.ui.Cells.r4 r4Var = (org.telegram.ui.Cells.r4) childAt;
                    org.telegram.ui.Components.j9 j9Var = r4Var.f24965c;
                    int i11 = r4Var.h;
                    if (DialogObject.isUserDialog(r4Var.f24966f)) {
                        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(r4Var.f24966f));
                        r4Var.e = user;
                        j9Var.m(i11, user);
                    } else {
                        j9Var.k(i11, MessagesController.getInstance(i11).getChat(Long.valueOf(-r4Var.f24966f)));
                        r4Var.e = null;
                    }
                    r4Var.c(true);
                }
            }
        }
        if (this.f38998e0 != null) {
            int i12 = 0;
            while (true) {
                dy[] dyVarArr = this.f38998e0;
                if (i12 >= dyVarArr.length) {
                    break;
                }
                dy dyVar = dyVarArr[i12];
                if (dyVar != null && (hwVar = dyVar.f38706n) != null) {
                    hwVar.i();
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
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.y6.f23777zh);
            Drawable drawable = this.L3;
            if (drawable != null && themedColor2 != this.f39100x4) {
                this.f39100x4 = themedColor2;
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
            org.telegram.ui.ActionBar.y6.E1(x2Var.getBackground(), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23449i6, false), true);
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.m0;
        if (w0Var != null) {
            w0Var.setIconColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23695v8));
        }
        lw lwVar = this.B1;
        if (lwVar != null) {
            lwVar.updateColors();
        }
        tx txVar = this.f39105z0;
        if (txVar != null) {
            eh.d dVar = txVar.f32449y0;
            if (dVar != null) {
                dVar.updateColors();
            }
            txVar.invalidate();
        }
        ig.r0 r0Var = this.f38982b0;
        if (r0Var != null) {
            r0Var.updateColors();
        }
        mx mxVar2 = this.C0;
        if (mxVar2 != null && (xh0Var = mxVar2.f28257r0) != null) {
            xh0Var.c();
        }
        org.telegram.ui.Components.u91 u91Var = this.f38977a0;
        if (u91Var != null) {
            u91Var.updateColors();
        }
        p31 p31Var = this.Z;
        if (p31Var != null) {
            p31Var.updateColors();
        }
        if (this.K0 != null) {
            int o10 = i0.a.o(getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6), 100);
            if (this.K0.getForeground() instanceof ColorDrawable) {
                if (((ColorDrawable) this.K0.getForeground()).getColor() != o10) {
                    ((ColorDrawable) this.K0.getForeground()).setColor(o10);
                }
            } else {
                this.K0.setForeground(new ColorDrawable(o10));
            }
        }
        org.telegram.ui.Components.j20 j20Var = this.f39074t0;
        if (j20Var != null) {
            j20Var.updateColors();
        }
        org.telegram.ui.Components.j20 j20Var2 = this.f39079u0;
        if (j20Var2 != null) {
            j20Var2.updateColors();
        }
        int i13 = org.telegram.ui.ActionBar.y6.f23357d6;
        this.f39046n4.a(getThemedColor(i13));
        org.telegram.ui.Components.ws wsVar = this.J1;
        if (wsVar != null) {
            wsVar.updateColors();
        }
        org.telegram.ui.Components.vs vsVar = this.K1;
        if (vsVar != null) {
            vsVar.setColor(org.telegram.ui.ActionBar.y6.x0(null, i13, false));
        }
        jw jwVar = this.H1;
        if (jwVar != null) {
            jwVar.updateColors();
        }
        jw jwVar2 = this.F1;
        if (jwVar2 != null) {
            jwVar2.updateColors();
        }
        j5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        sw swVar = this.E0;
        if (swVar != null) {
            swVar.o();
        }
        if (this.D3 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.gl)) != this.f39094w4) {
            this.f39094w4 = themedColor;
            this.D3.setColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        }
        rx rxVar = this.X;
        if (rxVar != null) {
            rxVar.updateColors();
        }
    }

    public final void v4(android.view.View r25, int r26, s4.h0 r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.v4(android.view.View, int, s4.h0):void");
    }

    public final void w3() {
        AndroidUtilities.runOnUIThread(new ev(this, 2), 300L);
    }

    public final boolean w4(View view, int i10, float f7, org.telegram.ui.Components.mm0 mm0Var) {
        org.telegram.ui.Components.xo0 xo0Var;
        long j10;
        org.telegram.ui.Components.xo0 xo0Var2;
        TLRPC.EncryptedChat encryptedChat;
        long makeEncryptedDialogId;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.x2) && mm0Var.j(i10) != 21) {
            if (!this.actionBar.q() && !AndroidUtilities.isTablet() && !this.f39035l2 && (view instanceof org.telegram.ui.Cells.p2)) {
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                if (!getMessagesController().isForum(p2Var.getDialogId()) && !this.G3.c() && p2Var.R(f7)) {
                    return P4(p2Var);
                }
            }
            vw vwVar = this.G3;
            if (vwVar == null || !vwVar.c()) {
                mx mxVar = this.C0;
                boolean z10 = true;
                if (mxVar != null && mm0Var == (xo0Var2 = mxVar.f28244d0)) {
                    Object I = xo0Var2.I(i10);
                    if (!this.C0.f28244d0.N) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                        e2Var.R = string;
                        if (I instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) I;
                            if (chat.monoforum) {
                                e2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, pg.d.i(chat, this.currentAccount, false));
                            } else {
                                e2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, chat.title);
                            }
                            makeEncryptedDialogId = -chat.f22028id;
                        } else if (I instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) I;
                            if (user.f22177id == getUserConfig().clientUserId) {
                                e2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, LocaleController.getString(R.string.SavedMessages));
                            } else {
                                e2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user.first_name, user.last_name));
                            }
                            makeEncryptedDialogId = user.f22177id;
                        } else if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(((TLRPC.EncryptedChat) I).user_id));
                            e2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user2.first_name, user2.last_name));
                            makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.f22036id);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new di.d1(this, makeEncryptedDialogId, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        showDialog(e2Var);
                        TextView textView = (TextView) e2Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, getResourceProvider());
                        }
                        return true;
                    }
                }
                mx mxVar2 = this.C0;
                if (mxVar2 != null && mm0Var == (xo0Var = mxVar2.f28244d0)) {
                    if (this.f39035l2) {
                        v4(view, i10, mm0Var);
                        return false;
                    }
                    if ((view instanceof org.telegram.ui.Cells.m6) && !xo0Var.N(i10)) {
                        j10 = ((org.telegram.ui.Cells.m6) view).getDialogId();
                    } else {
                        j10 = 0;
                    }
                    if (j10 != 0) {
                        U4(j10, view);
                        return true;
                    }
                } else {
                    Object J = ((ig.n) mm0Var).J(i10);
                    if (J instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                        if (this.f39035l2) {
                            if ((this.R0 == 3 || Q3()) && r5(dialog.f22032id)) {
                                if (this.R0 == 1 && Q3() && this.f39038m2 && getMessagesController().isForum(dialog.f22032id)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -dialog.f22032id);
                                    bundle.putBoolean("for_select", true);
                                    bundle.putBoolean("forward_to", true);
                                    if (this.R0 != 1) {
                                        z10 = false;
                                    }
                                    bundle.putBoolean("bot_share_to", z10);
                                    bundle.putBoolean("quote", this.O0);
                                    bundle.putBoolean("reply_to", this.N0);
                                    cf1 cf1Var = new cf1(bundle);
                                    cf1Var.L0 = this;
                                    presentFragment(cf1Var);
                                    return false;
                                }
                                p3(dialog.f22032id, view);
                                k5();
                                return true;
                            }
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                            u4(view);
                            return false;
                        } else if (!this.actionBar.q() || !o4(dialog)) {
                            U4(dialog.f22032id, view);
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
        if (i11 != 15 && i11 != 16 && this.f39016h2 == null && this.f39071s2) {
            if (DialogObject.isChatDialog(j10)) {
                long j11 = -j10;
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j11));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    if (this.f39059q2 || !ChatObject.isCanWriteToChannel(j11, this.currentAccount) || (i10 = this.T0) == 2 || i10 == 3) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.SendMessageTitle);
                        int i12 = this.T0;
                        if (i12 == 3) {
                            alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.TodoCantForward);
                        } else if (i12 == 2) {
                            alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.PublicPollCantForward);
                        } else {
                            alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ChannelCantSendMessage);
                        }
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        showDialog(alertDialog$Builder.f22369a);
                        return false;
                    }
                    return true;
                }
                return true;
            } else if (DialogObject.isEncryptedDialog(j10)) {
                if (this.T0 != 0 || this.U0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.f22369a.R = LocaleController.getString(R.string.SendMessageTitle);
                    int i13 = this.T0;
                    if (i13 == 3) {
                        alertDialog$Builder2.f22369a.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
                    } else if (i13 != 0) {
                        alertDialog$Builder2.f22369a.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
                    } else {
                        alertDialog$Builder2.f22369a.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
                    }
                    alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    showDialog(alertDialog$Builder2.f22369a);
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
        Collections.sort(arrayList, new dv(0));
        org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(this, view);
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
                int i12 = org.telegram.ui.ActionBar.y6.f23449i6;
                Drawable Z = org.telegram.ui.ActionBar.y6.Z(getThemedColor(i12), 0, 0);
                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
                org.telegram.ui.ActionBar.u6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(Z);
                org.telegram.ui.ActionBar.f7.k(linearLayout, Z, null, N, resourceProvider);
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
                j9Var.r(currentUser);
                org.telegram.ui.Components.hh0 hh0Var = new org.telegram.ui.Components.hh0(this, getParentActivity(), z10);
                linearLayout.addView(hh0Var, org.telegram.ui.Components.kb1.x(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(getParentActivity());
                if (z10) {
                    y9Var.setScaleX(0.833f);
                    y9Var.setScaleY(0.833f);
                }
                y9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                y9Var.getImageReceiver().setCurrentAccount(intValue);
                y9Var.f(currentUser, j9Var);
                hh0Var.addView(y9Var, org.telegram.ui.Components.kb1.x(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23465j5, getResourceProvider());
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, org.telegram.ui.Components.kb1.t(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new bi.pa(this, intValue, H, 14));
                H.r(linearLayout, org.telegram.ui.Components.kb1.r(230, 48));
            }
        }
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(24.0f), getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6));
        c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.y6.o1(0.15f, -16777216));
        H.f30174z.set(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        H.W(c02);
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        H.V(5);
        H.Z();
    }

    @Override
    public final hh.d y() {
        return this.f39040m4;
    }

    public final void y3(boolean z10) {
        ji.j jVar;
        TLRPC.ChatFull chatFull;
        boolean z11;
        org.telegram.ui.Components.ws wsVar = this.J1;
        if (wsVar != null && (jVar = this.Q1) != null && (chatFull = this.f38979a3) != null) {
            if (this.Y2 != 0 && chatFull.requests_pending > 0 && !this.f38981b.f19326f) {
                z11 = true;
            } else {
                z11 = false;
            }
            wsVar.i(jVar, z11, z10);
            this.Q1.setTitle(LocaleController.formatPluralString("CommunityPendingRequestsRow", this.f38979a3.requests_pending, new Object[0]));
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
        if (i10 == 3 && (w0Var = this.f39034l0) != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) w0Var.getIconView().getDrawable();
            if (this.d.f19326f) {
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

    public final void z3(dy dyVar) {
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        int i10;
        boolean z14;
        int L0 = dyVar.f38704c.L0();
        int N0 = dyVar.f38704c.N0();
        if (!this.f39017h3 && !this.f39039m3) {
            tx txVar = this.f39105z0;
            if (txVar == null || txVar.getVisibility() != 0 || !this.f39105z0.O) {
                int abs = Math.abs(N0 - L0) + 1;
                if (N0 != -1) {
                    s4.e1 K = dyVar.f38702a.K(N0);
                    if (K != null && K.f47776f == 11) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.f38984b2 = z14;
                    if (z14) {
                        k4(false);
                    }
                } else {
                    this.f38984b2 = false;
                }
                int i11 = dyVar.f38708s;
                if (i11 == 7 || i11 == 8) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
                    int i12 = dyVar.h;
                    if (i12 >= 0 && i12 < dialogFilters.size() && (dialogFilters.get(dyVar.h).flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) == 0 && ((abs > 0 && N0 >= Z3(this.currentAccount, dyVar.f38708s, 1, this.S1).size() - 10) || (abs == 0 && !getMessagesController().isDialogsEndReached(1)))) {
                        boolean isDialogsEndReached = getMessagesController().isDialogsEndReached(1);
                        boolean z15 = !isDialogsEndReached;
                        if (isDialogsEndReached && getMessagesController().isServerDialogsEndReached(1)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        z11 = z15;
                        if ((abs <= 0 && N0 >= Z3(this.currentAccount, dyVar.f38708s, this.W2, this.S1).size() - 10) || (abs == 0 && (((i10 = dyVar.f38708s) == 7 || i10 == 8) && !getMessagesController().isDialogsEndReached(this.W2)))) {
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
                                    ey eyVar = ey.this;
                                    if (z12) {
                                        eyVar.getMessagesController().loadDialogs(eyVar.W2, -1, 100, z13);
                                    }
                                    if (z10) {
                                        eyVar.getMessagesController().loadDialogs(1, -1, 100, z11);
                                    } else {
                                        eyVar.getClass();
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
                        ey eyVar = ey.this;
                        if (z12) {
                            eyVar.getMessagesController().loadDialogs(eyVar.W2, -1, 100, z13);
                        }
                        if (z10) {
                            eyVar.getMessagesController().loadDialogs(1, -1, 100, z11);
                        } else {
                            eyVar.getClass();
                        }
                    }
                });
            }
        }
    }

    public final void z4(java.util.ArrayList r43, int r44, boolean r45, boolean r46, java.util.HashSet r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.z4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    @Override
    public final void D() {
    }
}

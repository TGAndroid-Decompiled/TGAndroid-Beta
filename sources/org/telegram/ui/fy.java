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
import android.graphics.drawable.Drawable;
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
public class fy extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, xf.b, vd.b, mg0 {
    public static boolean f38251t4;
    public static final boolean[] f38252u4 = new boolean[4];
    public static final org.telegram.ui.Components.cr0 f38253v4 = new org.telegram.ui.Components.cr0(3);
    public static float f38254w4;
    public boolean A;
    public xw A0;
    public final TextPaint A1;
    public String A2;
    public org.telegram.ui.Cells.o A3;
    public boolean B;
    public org.telegram.ui.Components.ds B0;
    public pw B1;
    public CharSequence B2;
    public ax B3;
    public TLRPC.RequestPeerType C;
    public boolean C0;
    public FrameLayout C1;
    public org.telegram.ui.Components.iq0 C2;
    public final ow C3;
    public long D;
    public float D0;
    public pw D1;
    public org.telegram.ui.Components.voip.o D2;
    public final ow D3;
    public ValueAnimator E;
    public float E0;
    public FrameLayout E1;
    public final ArrayList E2;
    public kg0 E3;
    public ValueAnimator F;
    public float F0;
    public org.telegram.ui.Components.fs F1;
    public boolean F2;
    public NotificationCenter.ObserversGroup F3;
    public boolean G;
    public cg.h0 G0;
    public org.telegram.ui.Components.es G1;
    public int G2;
    public NotificationCenter.ObserversGroup G3;
    public boolean H;
    public org.telegram.ui.Components.j70 H0;
    public org.telegram.ui.Cells.m H1;
    public int H2;
    public Drawable H3;
    public boolean I;
    public cx I0;
    public org.telegram.ui.Cells.x2 I1;
    public int I2;
    public int I3;
    public float J;
    public boolean J0;
    public org.telegram.ui.Cells.pa J1;
    public int J2;
    public boolean J3;
    public boolean K;
    public boolean K0;
    public Long K1;
    public int K2;
    public boolean K3;
    public int L;
    public long L0;
    public Long L1;
    public int L2;
    public AnimatorSet L3;
    public boolean M;
    public long M0;
    public rh.i M1;
    public int M2;
    public boolean M3;
    public boolean N;
    public int N0;
    public ArrayList N1;
    public int N2;
    public ru N3;
    public org.telegram.ui.Components.mc O;
    public int O0;
    public boolean O1;
    public int O2;
    public String O3;
    public float P;
    public int P0;
    public org.telegram.ui.ActionBar.c2 P1;
    public int P2;
    public ArrayList P3;
    public boolean Q;
    public boolean Q0;
    public boolean Q1;
    public boolean Q2;
    public boolean Q3;
    public boolean R;
    public org.telegram.ui.Components.wc0 R0;
    public boolean R1;
    public int R2;
    public CharSequence R3;
    public boolean S;
    public org.telegram.ui.Cells.p2 S0;
    public long S1;
    public fy S2;
    public boolean S3;
    public ux T;
    public org.telegram.ui.Cells.p2 T0;
    public TLObject T1;
    public long T2;
    public float T3;
    public jf.n0 U;
    public boolean U0;
    public int U1;
    public TLRPC.Chat U2;
    public boolean U3;
    public p31 V;
    public boolean V0;
    public int V1;
    public TLRPC.ChatFull V2;
    public boolean V3;
    public org.telegram.ui.Components.y71 W;
    public final ArrayList W0;
    public boolean W1;
    public org.telegram.ui.Components.t9 W2;
    public ValueAnimator W3;
    public rf.h0 X;
    public boolean X0;
    public boolean X1;
    public org.telegram.ui.Components.e9 X2;
    public org.telegram.ui.Components.s40 X3;
    public float Y;
    public boolean Y0;
    public boolean Y1;
    public long Y2;
    public TLRPC.FileLocation Y3;
    public ValueAnimator Z;
    public boolean Z0;
    public int Z1;
    public boolean Z2;
    public TLRPC.FileLocation Z3;
    public final int f38255a;
    public ey[] f38256a0;
    public org.telegram.ui.ActionBar.h2 f38257a1;
    public boolean a2;
    public boolean f38258a3;
    public org.telegram.ui.Components.mc f38259a4;
    public final vd.a f38260b;
    public org.telegram.ui.ActionBar.w0 f38261b0;
    public final Paint f38262b1;
    public String f38263b2;
    public AnimatorSet f38264b3;
    public int f38265b4;
    public final vd.a f38266c;
    public org.telegram.ui.ActionBar.w0 f38267c0;
    public ImageView f38268c1;
    public String f38269c2;
    public boolean c3;
    public int f38270c4;
    public final vd.a d;
    public hy f38271d0;
    public NumberTextView f38272d1;
    public String f38273d2;
    public boolean f38274d3;
    public int f38275d4;
    public final vd.a f38276e;
    public boolean f38277e0;
    public final ArrayList f38278e1;
    public boolean f38279e2;
    public float f38280e3;
    public int f38281e4;
    public final vd.a f38282f;
    public org.telegram.ui.ActionBar.w0 f38283f0;
    public org.telegram.ui.ActionBar.w0 f38284f1;
    public boolean f38285f2;
    public boolean f38286f3;
    public int f38287f4;
    public org.telegram.ui.ActionBar.w0 f38288g0;
    public org.telegram.ui.ActionBar.w0 f38289g1;
    public boolean f38290g2;
    public int f38291g3;
    public sg.i f38292g4;
    public final vd.a h;
    public org.telegram.ui.ActionBar.w0 f38293h0;
    public org.telegram.ui.ActionBar.w0 f38294h1;
    public boolean f38295h2;
    public boolean f38296h3;
    public final lg.e f38297h4;
    public org.telegram.ui.ActionBar.w0 f38298i0;
    public org.telegram.ui.ActionBar.w0 f38299i1;
    public boolean f38300i2;
    public boolean f38301i3;
    public final qg.d f38302i4;
    public org.telegram.ui.Components.bi0 f38303j0;
    public org.telegram.ui.ActionBar.g1 f38304j1;
    public String f38305j2;
    public org.telegram.ui.Components.mc f38306j3;
    public final qg.d f38307j4;
    public org.telegram.ui.ActionBar.g1 f38308k0;
    public org.telegram.ui.ActionBar.g1 f38309k1;
    public String f38310k2;
    public final AnimationNotificationsLocker f38311k3;
    public final qg.c f38312k4;
    public nh.t3 f38313l0;
    public org.telegram.ui.ActionBar.g1 l1;
    public final MessagesStorage.TopicKey f38314l2;
    public boolean f38315l3;
    public final lg.a f38316l4;
    public nh.t3 m0;
    public org.telegram.ui.ActionBar.g1 f38317m1;
    public boolean f38318m2;
    public boolean f38319m3;
    public final lg.a f38320m4;
    public final vd.a f38321n;
    public boolean f38322n0;
    public org.telegram.ui.ActionBar.g1 f38323n1;
    public boolean f38324n2;
    public boolean f38325n3;
    public final lg.a f38326n4;
    public boolean f38327o0;
    public org.telegram.ui.ActionBar.g1 f38328o1;
    public boolean f38329o2;
    public boolean f38330o3;
    public final lg.a f38331o4;
    public org.telegram.ui.Components.u10 f38332p0;
    public org.telegram.ui.ActionBar.g1 f38333p1;
    public boolean f38334p2;
    public float f38335p3;
    public wv f38336p4;
    public org.telegram.ui.Components.u10 f38337q0;
    public float f38338q1;
    public boolean f38339q2;
    public ValueAnimator f38340q3;
    public final ArrayList f38341q4;
    public final vd.a f38342r;
    public nh.d f38343r0;
    public float f38344r1;
    public boolean f38345r2;
    public float f38346r3;
    public final RectF f38347r4;
    public final vd.a f38348s;
    public ug.f f38349s0;
    public AnimatorSet f38350s1;
    public boolean f38351s2;
    public float f38352s3;
    public final RectF f38353s4;
    public int f38354t0;
    public float f38355t1;
    public boolean f38356t2;
    public float f38357t3;
    public final UndoView[] f38358u0;
    public sg.f f38359u1;
    public boolean f38360u2;
    public int f38361u3;
    public final ah.i v;
    public ew f38362v0;
    public FrameLayout f38363v1;
    public boolean f38364v2;
    public boolean f38365v3;
    public boolean f38366w;
    public boolean f38367w0;
    public FrameLayout f38368w1;
    public boolean f38369w2;
    public boolean f38370w3;
    public int f38371x;
    public int f38372x0;
    public qw f38373x1;
    public boolean f38374x2;
    public Long f38375x3;
    public boolean f38376y;
    public ox f38377y0;
    public org.telegram.ui.Components.hp0 f38378y1;
    public yx f38379y2;
    public Drawable f38380y3;
    public org.telegram.ui.Components.iu0 f38381z0;
    public org.telegram.ui.ActionBar.w0 f38382z1;
    public ArrayList f38383z2;
    public org.telegram.ui.Components.n5 f38384z3;

    public fy(Bundle bundle) {
        super(bundle);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f38255a = i10;
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        this.f38260b = new vd.a(1, this, jrVar, 350L, false);
        this.f38266c = new vd.a(2, this, jrVar, 350L, false);
        this.d = new vd.a(3, this, jrVar, 350L, false);
        this.f38276e = new vd.a(4, this, jrVar, 350L, false);
        this.f38282f = new vd.a(5, this, jrVar, 350L, false);
        this.h = new vd.a(6, this, jrVar, 350L, false);
        this.f38321n = new vd.a(7, this, jrVar, 350L, false);
        this.f38342r = new vd.a(8, this, jrVar, 350L, false);
        this.f38348s = new vd.a(9, this, jrVar, 350L, false);
        this.v = new ah.i(new vv(this, 1));
        this.f38371x = -1;
        this.B = true;
        this.G = false;
        this.H = false;
        this.I = false;
        this.M = true;
        this.Y = 1.0f;
        this.f38358u0 = new UndoView[2];
        this.W0 = new ArrayList();
        this.f38262b1 = new Paint();
        this.f38278e1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.A1 = new TextPaint(1);
        this.Q1 = true;
        this.Y1 = true;
        this.f38279e2 = true;
        this.f38314l2 = new MessagesStorage.TopicKey();
        this.E2 = new ArrayList();
        this.F2 = true;
        this.f38311k3 = new AnimationNotificationsLocker();
        this.f38361u3 = -1;
        this.C3 = new ow(this, 0);
        this.D3 = new ow(this, 1);
        this.I3 = -4;
        this.J3 = true;
        this.K3 = true;
        this.T3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.f38341q4 = arrayList;
        RectF rectF = new RectF();
        this.f38347r4 = rectF;
        RectF rectF2 = new RectF();
        this.f38353s4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        qg.c cVar = new qg.c();
        this.f38312k4 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
        if (i11 >= 31) {
            this.f38297h4 = new lg.e(false);
            qg.d dVar = new qg.d(null);
            this.f38302i4 = dVar;
            dVar.i(new kx(this, 0));
            qg.d dVar2 = new qg.d(null);
            this.f38307j4 = dVar2;
            dVar2.i(new kx(this, 3));
            lg.a aVar = new lg.a(dVar);
            this.f38316l4 = aVar;
            aVar.f15225f = LiteMode.isEnabled(262144);
            lg.a aVar2 = new lg.a(dVar2);
            this.f38326n4 = aVar2;
            aVar2.f15225f = LiteMode.isEnabled(262144);
            this.f38320m4 = new lg.a(dVar);
        } else {
            this.f38297h4 = null;
            this.f38302i4 = null;
            this.f38307j4 = null;
            this.f38316l4 = new lg.a(cVar);
            this.f38326n4 = new lg.a(cVar);
            this.f38320m4 = new lg.a(cVar);
        }
        this.f38331o4 = new lg.a(cVar);
    }

    public static void A0(Activity activity, Boolean bool) {
        if (!bool.booleanValue()) {
            return;
        }
        if (!org.telegram.ui.Components.yd0.c()) {
            org.telegram.ui.Components.yd0.h();
        } else {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
        }
    }

    public static void B0(fy fyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(fyVar.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(fyVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new x9(fyVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void C0(fy fyVar) {
        MessagesController.getInstance(fyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        fyVar.U4();
        org.telegram.ui.Components.mc J = org.telegram.ui.Components.tc.a0(fyVar).J(R.raw.chats_infotip, LocaleController.getString(R.string.BirthdaySetupLater), LocaleController.getString(R.string.Settings), new ev(fyVar, 1));
        J.f30652j = 5000;
        J.j();
    }

    public static void D0(fy fyVar) {
        boolean z10 = true;
        try {
            ((org.telegram.ui.Components.xi0) ((org.telegram.ui.Components.e9) fyVar.I1.h.getImageReceiver().getStaticThumb()).B).F(true);
        } catch (Exception unused) {
        }
        if (fyVar.X3 == null) {
            org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(0, true, true);
            fyVar.X3 = s40Var;
            s40Var.D = true;
            s40Var.f32469a = fyVar;
            s40Var.f32470b = new sx(fyVar);
            fyVar.getMediaDataController().checkFeaturedStickers();
            fyVar.getMessagesController().loadSuggestedFilters();
            fyVar.getMessagesController().loadUserInfo(fyVar.getUserConfig().getCurrentUser(), true, fyVar.classGuid);
        }
        TLRPC.User user = MessagesController.getInstance(fyVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(fyVar.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(fyVar.currentAccount).getCurrentUser();
        }
        if (user != null) {
            org.telegram.ui.Components.ni niVar = fyVar.X3.f32471c;
            if (niVar != null) {
                niVar.c1();
            }
            org.telegram.ui.Components.s40 s40Var2 = fyVar.X3;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            s40Var2.o((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : false, new ev(fyVar, 0), new fv(fyVar, 0), 0);
        }
    }

    public static void E0(fy fyVar, float f9, ValueAnimator valueAnimator) {
        fyVar.f38256a0[0].setTranslationY((1.0f - fyVar.f38335p3) * f9);
        fyVar.f38335p3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i10 = 0; i10 < fyVar.actionBar.getChildCount(); i10++) {
            if (fyVar.actionBar.getChildAt(i10).getVisibility() == 0 && fyVar.actionBar.getChildAt(i10) != fyVar.actionBar.getActionMode() && fyVar.actionBar.getChildAt(i10) != fyVar.actionBar.getBackButton()) {
                fyVar.actionBar.getChildAt(i10).setAlpha(1.0f - fyVar.f38335p3);
            }
        }
        fyVar.E3();
        fyVar.w3();
        View view = fyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void F0(fy fyVar) {
        org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(fyVar.getParentActivity(), fyVar.resourceProvider);
        ubVar.d(R.raw.email_check_inbox, new String[0]);
        ubVar.f33185b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
        org.telegram.ui.Components.mc.g(fyVar, ubVar, 2750).j();
        try {
            fyVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void G0(org.telegram.ui.fy r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fy.G0(org.telegram.ui.fy):void");
    }

    public static void H0(fy fyVar, BirthdayController.BirthdayState birthdayState) {
        if (birthdayState.today.size() == 1) {
            ih.h2 h2Var = new ih.h2(fyVar.getParentActivity(), fyVar.currentAccount, birthdayState.today.get(0).f22539id, null, null);
            h2Var.V(true);
            fyVar.showDialog(h2Var);
            return;
        }
        eg.w2.e0(0, birthdayState);
    }

    public static void I0(fy fyVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.mc M = org.telegram.ui.Components.tc.a0(fyVar).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
            M.f30652j = 5000;
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
            fyVar.getMessagesStorage().updateUserInfo(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (fyVar.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fyVar.getParentActivity(), 0, fyVar.resourceProvider);
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                fyVar.showDialog(alertDialog$Builder.f22714a);
                return;
            }
            return;
        }
        j7.l1.v(R.string.UnknownError, org.telegram.ui.Components.tc.a0(fyVar), R.raw.error, 36);
    }

    public static void J0(fy fyVar) {
        MessagesController.getInstance(fyVar.currentAccount).removeSuggestion(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        fyVar.U4();
    }

    public static void N2(fy fyVar, float f9) {
        float f10;
        float f11;
        int i10;
        int i11;
        float clamp = Utilities.clamp(fyVar.f38355t1 * 2.0f, 1.0f, 0.0f);
        xw xwVar = fyVar.A0;
        float f12 = (1.0f - fyVar.f38335p3) * f9 * fyVar.D0;
        float f13 = 1.0f - clamp;
        xwVar.setAlpha(f12 * f13);
        int i12 = 0;
        if (!fyVar.G && !fyVar.I) {
            if (fyVar.H) {
                fyVar.A0.setTranslationY((Math.max(fyVar.J, -fyVar.U3()) + (-AndroidUtilities.dp(81.0f))) - AndroidUtilities.dp(8.0f));
                fyVar.A0.setProgressToCollapse(1.0f);
                xw xwVar2 = fyVar.A0;
                xwVar2.setClipTop((int) (AndroidUtilities.statusBarHeight - xwVar2.getY()));
            }
            f10 = 1.0f - fyVar.D0;
            fyVar.actionBar.setTranslationY(0.0f);
        } else {
            float clamp2 = Utilities.clamp((-fyVar.J) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
            if (fyVar.f38335p3 == 1.0f) {
                clamp2 = 1.0f;
            }
            float clamp3 = Utilities.clamp(clamp2 / 0.5f, 1.0f, 0.0f);
            fyVar.A0.setClipTop(0);
            if (!fyVar.G && fyVar.I) {
                fyVar.A0.setTranslationY((-AndroidUtilities.dp(81.0f)) - AndroidUtilities.dp(8.0f));
                fyVar.A0.setProgressToCollapse(1.0f);
                f11 = fyVar.D0;
            } else {
                fyVar.A0.setTranslationY(((fyVar.P / 2.0f) + (Math.max(fyVar.J, -fyVar.U3()) + fyVar.f38346r3)) - AndroidUtilities.dp(8.0f));
                fyVar.A0.l(clamp2, !fyVar.B3.c());
                if (!fyVar.I) {
                    f11 = fyVar.D0;
                } else {
                    f10 = 1.0f - clamp3;
                    fyVar.actionBar.setTranslationY(0.0f);
                }
            }
            f10 = 1.0f - f11;
            fyVar.actionBar.setTranslationY(0.0f);
        }
        float f14 = f10 * f13;
        if (f14 != 1.0f) {
            fyVar.actionBar.getTitlesContainer().setPivotY(AndroidUtilities.statusBarHeight);
            fyVar.actionBar.getTitlesContainer().setPivotX(AndroidUtilities.dp(20.0f));
            float f15 = (0.6f * f14) + 0.4f;
            fyVar.actionBar.getTitlesContainer().setScaleY(f15);
            fyVar.actionBar.getTitlesContainer().setScaleX(f15);
            fyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
            fyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-AndroidUtilities.dp(30.0f));
            fyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f15);
            fyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f15);
            float f16 = (1.0f - fyVar.f38335p3) * f14;
            fyVar.actionBar.getTitlesContainer().setAlpha(f16);
            FrameLayout titlesContainer = fyVar.actionBar.getTitlesContainer();
            int i13 = (f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1));
            if (i13 > 0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            titlesContainer.setVisibility(i11);
            fyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f16);
            FrameLayout additionalSubTitleOverlayContainer = fyVar.actionBar.getAdditionalSubTitleOverlayContainer();
            if (i13 <= 0) {
                i12 = 4;
            }
            additionalSubTitleOverlayContainer.setVisibility(i12);
            return;
        }
        fyVar.actionBar.getTitlesContainer().setScaleY(1.0f);
        fyVar.actionBar.getTitlesContainer().setScaleX(1.0f);
        fyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
        fyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
        float f17 = 1.0f - fyVar.f38335p3;
        fyVar.actionBar.getTitlesContainer().setAlpha(f17);
        FrameLayout titlesContainer2 = fyVar.actionBar.getTitlesContainer();
        int i14 = (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1));
        if (i14 > 0) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        titlesContainer2.setVisibility(i10);
        fyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f17);
        FrameLayout additionalSubTitleOverlayContainer2 = fyVar.actionBar.getAdditionalSubTitleOverlayContainer();
        if (i14 <= 0) {
            i12 = 4;
        }
        additionalSubTitleOverlayContainer2.setVisibility(i12);
    }

    public static void O2(fy fyVar, Canvas canvas, int i10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        if (fyVar.parentLayout != null && fyVar.actionBar != null) {
            float max = Math.max(fyVar.f38276e.f49505e, fyVar.V3());
            float f9 = 1.0f;
            float f10 = 1.0f - fyVar.f38355t1;
            float f11 = max * f10 * f10;
            int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            if (i11 != 0) {
                if (-1 >= i10) {
                    i10 = -1;
                    f9 = 0.0f;
                }
                if (f9 > 0.0f && i11 > 0 && i10 > 0 && (b5Var = fyVar.parentLayout) != null) {
                    ((ActionBarLayout) b5Var).p(canvas, (int) (f9 * 255.0f * f11), i10);
                }
            }
        }
    }

    public static org.telegram.ui.Cells.p2 Q3(ey eyVar) {
        ay ayVar = eyVar.f37921a;
        for (int i10 = 0; i10 < ayVar.getChildCount(); i10++) {
            View childAt = ayVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.p2) {
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) childAt;
                if (p2Var.P()) {
                    return p2Var;
                }
            }
        }
        return null;
    }

    public static void U(fy fyVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        MessagesController.getInstance(fyVar.currentAccount).removeSuggestion(0L, tL_pendingSuggestion.suggestion);
        fyVar.U4();
    }

    public static void V(fy fyVar, float f9, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fyVar.f38335p3 = floatValue;
        fyVar.f38256a0[0].setTranslationY((-f9) * floatValue);
        for (int i10 = 0; i10 < fyVar.actionBar.getChildCount(); i10++) {
            if (fyVar.actionBar.getChildAt(i10).getVisibility() == 0 && fyVar.actionBar.getChildAt(i10) != fyVar.actionBar.getActionMode() && fyVar.actionBar.getChildAt(i10) != fyVar.actionBar.getBackButton()) {
                fyVar.actionBar.getChildAt(i10).setAlpha(1.0f - fyVar.f38335p3);
            }
        }
        View view = fyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        fyVar.E3();
        fyVar.w3();
    }

    public static void X(fy fyVar) {
        ArrayList arrayList = fyVar.E2;
        org.telegram.ui.ActionBar.b5 b5Var = fyVar.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).y()) {
            fyVar.finishPreviewFragment();
        } else if (fyVar.N0 == 10) {
            if (fyVar.f38379y2 != null && !arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i10)).longValue(), 0L));
                }
                fyVar.f38379y2.v(fyVar, arrayList2, null, false, fyVar.F2, fyVar.G2, fyVar.H2, null);
            }
        } else if (MessagesController.getInstance(fyVar.currentAccount).isFrozen()) {
            c.b(fyVar.currentAccount);
        } else {
            fyVar.presentFragment(new ContactsActivity(a4.w.i("destroyAfterSelect", true)));
        }
    }

    public static void Y(fy fyVar) {
        MessagesController.getInstance(fyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
        fyVar.U4();
    }

    public static void Z(fy fyVar) {
        PasskeysActivity.a0(fyVar.currentAccount, fyVar.getParentActivity(), fyVar.resourceProvider, true);
    }

    public static void a0(fy fyVar, int i10, org.telegram.ui.Components.j70 j70Var) {
        CharSequence charSequence;
        if (fyVar.currentAccount != i10) {
            j70Var.u();
            if (fyVar.getParentActivity() == null) {
                return;
            }
            yx yxVar = fyVar.f38379y2;
            LaunchActivity launchActivity = (LaunchActivity) fyVar.getParentActivity();
            ArrayList arrayList = fyVar.f38383z2;
            String str = fyVar.A2;
            CharSequence charSequence2 = fyVar.B2;
            qw qwVar = fyVar.f38373x1;
            if (qwVar != null) {
                charSequence = qwVar.getFieldText();
            } else {
                charSequence = null;
            }
            launchActivity.K0(i10);
            fy fyVar2 = new fy(fyVar.arguments);
            fyVar2.f38379y2 = yxVar;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList.isEmpty()) {
                    fyVar2.f38383z2 = null;
                } else {
                    fyVar2.f38383z2 = arrayList;
                    fyVar2.A2 = null;
                    if (fyVar2.f38373x1 != null) {
                        fyVar2.l3(charSequence);
                    } else {
                        fyVar2.R3 = charSequence;
                    }
                }
            } else if (str != null) {
                fyVar2.E4(charSequence, str);
            } else if (charSequence2 != null) {
                if (charSequence2.length() == 0) {
                    fyVar2.B2 = null;
                } else {
                    fyVar2.B2 = charSequence2;
                    fyVar2.A2 = null;
                    fyVar2.f38383z2 = null;
                    if (fyVar2.f38373x1 != null) {
                        fyVar2.l3(charSequence);
                    } else {
                        fyVar2.R3 = charSequence;
                    }
                }
            }
            launchActivity.q0(fyVar2, false, true);
        }
    }

    public static void b0(fy fyVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(fyVar.currentAccount).getClientUserId());
        fyVar.presentFragment(new tn(bundle));
    }

    public static void c0(fy fyVar, TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = fyVar.getMessagesController().getUserFull(fyVar.getUserConfig().getClientUserId());
        if (userFull != null) {
            tL_birthday2 = userFull.birthday;
        } else {
            tL_birthday2 = null;
        }
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        fyVar.getMessagesController().invalidateContentSettings();
        fyVar.getConnectionsManager().sendRequest(updatebirthday, new x9(fyVar, userFull, tL_birthday2, 8), 1024);
        MessagesController.getInstance(fyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        fyVar.U4();
    }

    public static void d0(fy fyVar, String str) {
        MessagesController.getInstance(fyVar.currentAccount).removeSuggestion(0L, str);
        fyVar.U4();
    }

    public static void d4(tn tnVar, MessageObject messageObject) {
        CharSequence charSequence;
        if (messageObject != null && messageObject.hasHighlightedWords()) {
            try {
                if (!TextUtils.isEmpty(messageObject.caption)) {
                    charSequence = messageObject.caption;
                } else {
                    charSequence = messageObject.messageText;
                }
                CharSequence highlightText = AndroidUtilities.highlightText(charSequence, messageObject.highlightedWords, (org.telegram.ui.ActionBar.c6) null);
                if (highlightText instanceof SpannableStringBuilder) {
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) highlightText;
                    org.telegram.ui.Components.a10[] a10VarArr = (org.telegram.ui.Components.a10[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.a10.class);
                    if (a10VarArr.length > 0) {
                        int spanStart = spannableStringBuilder.getSpanStart(a10VarArr[0]);
                        int spanEnd = spannableStringBuilder.getSpanEnd(a10VarArr[0]);
                        for (int i10 = 1; i10 < a10VarArr.length; i10++) {
                            int spanStart2 = spannableStringBuilder.getSpanStart(a10VarArr[i10]);
                            int spanStart3 = spannableStringBuilder.getSpanStart(a10VarArr[i10]);
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
                        tnVar.mb(messageObject.getRealId(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public static void e0(fy fyVar, ey eyVar, View view, int i10) {
        int i11;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        if (view instanceof org.telegram.ui.Cells.s3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.p2;
        if (z10) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
            if (p2Var.f24874j2) {
                fyVar.N4(p2Var.getDialogId(), view);
                return;
            }
        }
        if (fyVar.I3()) {
            fyVar.o4(view, i10, 0.0f, eyVar.d);
            return;
        }
        int i12 = fyVar.N0;
        if (i12 == 15 && (view instanceof org.telegram.ui.Cells.m8)) {
            eyVar.d.K();
            return;
        }
        int i13 = 0;
        if ((i12 == 11 || i12 == 13) && i10 == 1) {
            Bundle i14 = a4.w.i("forImport", true);
            i14.putLongArray("result", new long[]{fyVar.getUserConfig().getClientUserId()});
            i14.putInt("chatType", 4);
            String string = fyVar.arguments.getString("importTitle");
            if (string != null) {
                i14.putString("title", string);
            }
            t60 t60Var = new t60(i14);
            t60Var.U = new kw(fyVar);
            fyVar.presentFragment(t60Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.x2) && ((i11 = eyVar.f37928s) == 7 || i11 == 8)) {
            rf.j jVar = (rf.j) eyVar.d.I.get(0);
            if (jVar != null && jVar.f50845a == 17) {
                tL_chatlists_chatlistUpdates = jVar.f47268i;
            } else {
                tL_chatlists_chatlistUpdates = null;
            }
            if (tL_chatlists_chatlistUpdates != null) {
                MessagesController.DialogFilter dialogFilter = fyVar.getMessagesController().selectedDialogFilter[eyVar.f37928s - 7];
                if (dialogFilter != null) {
                    int i15 = dialogFilter.f19620id;
                    ?? xaVar = new org.telegram.ui.Components.xa(fyVar, false);
                    xaVar.U = -1;
                    xaVar.Y = "";
                    xaVar.Z = new ArrayList();
                    xaVar.f34865b0 = "";
                    xaVar.f34867d0 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    xaVar.f34868e0 = arrayList;
                    xaVar.f34884v0 = -1;
                    xaVar.f34887y0 = -5;
                    xaVar.U = i15;
                    xaVar.W = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    xaVar.f34866c0 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList<MessagesController.DialogFilter> arrayList2 = fyVar.getMessagesController().dialogFilters;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                break;
                            } else if (arrayList2.get(i13).f19620id == i15) {
                                xaVar.Y = arrayList2.get(i13).name;
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                    xaVar.S();
                    fyVar.showDialog(xaVar);
                    return;
                }
                return;
            }
        } else if (z10 && !fyVar.actionBar.s() && !fyVar.B3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.p2) view).U1;
            AndroidUtilities.rectTmp.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        }
        fyVar.n4(view, i10, eyVar.d);
    }

    public static void f0(fy fyVar) {
        fyVar.presentFragment(new PrivacySettingsActivity());
        AndroidUtilities.scrollToFragmentRow(fyVar.parentLayout, "newChatsRow");
    }

    public static void f1(fy fyVar, boolean z10) {
        if (fyVar.f38256a0 != null && fyVar.J3 != z10) {
            fyVar.J3 = z10;
            int i10 = 0;
            while (true) {
                ey[] eyVarArr = fyVar.f38256a0;
                if (i10 < eyVarArr.length) {
                    if (z10) {
                        eyVarArr[i10].f37921a.setScrollbarFadingEnabled(false);
                    }
                    fyVar.f38256a0[i10].f37921a.setVerticalScrollBarEnabled(z10);
                    if (z10) {
                        fyVar.f38256a0[i10].f37921a.setScrollbarFadingEnabled(true);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public static void h0(fy fyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        if (fyVar.getParentActivity() != null) {
            fyVar.f38334p2 = false;
            if (z10 || z11 || z12) {
                fyVar.f38367w0 = true;
                if (z10 && nj0.n(activity)) {
                    org.telegram.ui.Components.yd0.g(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.ym(1, new tm(20, fyVar, activity)));
                } else if (z11 && fyVar.Q1 && fyVar.getUserConfig().syncContacts && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.c5.w(activity, new nv(fyVar, 0)).f22714a;
                    fyVar.P1 = c2Var;
                    fyVar.showDialog(c2Var);
                } else if (z12 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    if (activity instanceof h5) {
                        org.telegram.ui.ActionBar.c2 w10 = ((h5) activity).w(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                        fyVar.P1 = w10;
                        fyVar.showDialog(w10);
                    }
                } else {
                    fyVar.k3(true);
                }
            }
        }
    }

    public static void i0(fy fyVar) {
        if (fyVar.X3.h()) {
            MessagesController.getInstance(fyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
            fyVar.U4();
        }
    }

    public static void i4(AccountInstance accountInstance) {
        int currentAccount = accountInstance.getCurrentAccount();
        boolean[] zArr = f38252u4;
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

    public static void k0(fy fyVar) {
        MessagesController.getInstance(fyVar.currentAccount).removeSuggestion(0L, "PREMIUM_GRACE");
        fyVar.U4();
    }

    public static void l0(fy fyVar) {
        MessagesController.getInstance(fyVar.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
        fyVar.U4();
    }

    public static void m0(fy fyVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        eg.z1 z1Var;
        try {
            c2Var.dismiss();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (tLObject != null) {
            fyVar.arguments.getString("importTitle");
            String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
            eg.z1 z1Var2 = new eg.z1(fyVar, j10, 23);
            Pattern pattern = org.telegram.ui.Components.c5.f27308a;
            if (fyVar.getParentActivity() != null) {
                if (chat != null || user != null) {
                    int currentAccount = fyVar.getCurrentAccount();
                    Activity parentActivity = fyVar.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
                    TextView textView = new TextView(parentActivity);
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false));
                    textView.setTextSize(1, 16.0f);
                    int i16 = 5;
                    if (LocaleController.isRTL) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 48);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    alertDialog$Builder.n(frameLayout);
                    org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
                    e9Var.u(AndroidUtilities.dp(12.0f));
                    org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(parentActivity);
                    t9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                    if (LocaleController.isRTL) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    frameLayout.addView(t9Var, i7.f6.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(parentActivity);
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
                    textView2.setTextSize(1, 20.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
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
                    int i17 = i13 | 48;
                    if (z10) {
                        i14 = 21;
                    } else {
                        i14 = 76;
                    }
                    float f9 = i14;
                    if (z10) {
                        i15 = 76;
                    } else {
                        i15 = 21;
                    }
                    frameLayout.addView(textView2, i7.f6.d(-1, -2.0f, i17, f9, 11.0f, i15, 0.0f));
                    if (!LocaleController.isRTL) {
                        i16 = 3;
                    }
                    frameLayout.addView(textView, i7.f6.d(-2, -2.0f, i16 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                    if (user != null) {
                        if (UserObject.isReplyUser(user)) {
                            e9Var.f27964p = 0.8f;
                            e9Var.g(12);
                            t9Var.h(null, null, e9Var, user);
                            z1Var = z1Var2;
                        } else {
                            z1Var = z1Var2;
                            if (user.f22539id == clientUserId) {
                                e9Var.f27964p = 0.8f;
                                e9Var.g(1);
                                t9Var.h(null, null, e9Var, user);
                            } else {
                                e9Var.f27964p = 1.0f;
                                e9Var.m(currentAccount, user);
                                t9Var.e(user, e9Var);
                            }
                        }
                    } else {
                        z1Var = z1Var2;
                        e9Var.k(currentAccount, chat);
                        t9Var.e(chat, e9Var);
                    }
                    textView.setText(AndroidUtilities.replaceTags(str));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Import), new org.telegram.ui.Components.u(z1Var, 3));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    fyVar.showDialog(alertDialog$Builder.f22714a);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.c5.f0(fyVar.currentAccount, tL_error, fyVar, tL_messages_checkHistoryImportPeer, new Object[0]);
        fyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j10), tL_messages_checkHistoryImportPeer, tL_error);
    }

    public static void n0(fy fyVar, int i10) {
        Object obj;
        TLRPC.User user;
        org.telegram.ui.Components.hn0 hn0Var = fyVar.f38377y0.f32998k0;
        if (i10 >= hn0Var.T && i10 < hn0Var.U) {
            org.telegram.ui.Components.w41 G = hn0Var.G(i10);
            if (G != null) {
                obj = G.G;
            } else {
                obj = null;
            }
        } else {
            obj = Boolean.FALSE;
        }
        if (obj instanceof TLRPC.User) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fyVar.getParentActivity(), 0, fyVar.resourceProvider);
            String string = LocaleController.getString(R.string.AppsClearSearch);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            c2Var.N = string;
            c2Var.P = LocaleController.formatString(R.string.AppsClearSearchAlert, "\"" + UserObject.getUserName(user) + "\"");
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new xr(5, fyVar, (TLRPC.User) obj));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        }
    }

    public static void o0(fy fyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        HashSet hashSet2;
        if (i10 == 102) {
            fyVar.getMessagesController().setDialogsInTransaction(true);
            if (z10) {
                hashSet2 = hashSet;
            } else {
                hashSet2 = null;
            }
            fyVar.r4(arrayList, i10, false, false, hashSet2);
            fyVar.getMessagesController().setDialogsInTransaction(false);
            fyVar.getMessagesController().checkIfFolderEmpty(fyVar.R2);
            int i11 = fyVar.R2;
            if (i11 != 0 && fyVar.R3(fyVar.currentAccount, fyVar.f38256a0[0].f37928s, i11, false).size() == 0) {
                fyVar.f38256a0[0].f37921a.setEmptyView(null);
                fyVar.f38256a0[0].f37929w.setVisibility(4);
                fyVar.finishFragment();
                return;
            }
            return;
        }
        fyVar.r4(arrayList, i10, false, false, null);
    }

    public static void q0(fy fyVar) {
        String str;
        MessagesController messagesController = MessagesController.getInstance(fyVar.currentAccount);
        if (fyVar.f38370w3) {
            str = "PREMIUM_UPGRADE";
        } else {
            str = "PREMIUM_ANNUAL";
        }
        messagesController.removeSuggestion(0L, str);
        fyVar.U4();
    }

    public static void q1(fy fyVar, ey eyVar, float f9) {
        if (fyVar.P != f9) {
            fyVar.P = f9;
            int i10 = 0;
            int i11 = (f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1));
            if (i11 == 0) {
                fyVar.Q = false;
            }
            fyVar.A0.setOverscroll(f9);
            eyVar.f37921a.setViewsOffset(f9);
            ay ayVar = eyVar.f37921a;
            if (i11 != 0) {
                i10 = 2;
            }
            ayVar.setOverScrollMode(i10);
            fyVar.fragmentView.invalidate();
            if (f9 > AndroidUtilities.dp(90.0f) && !fyVar.Q) {
                xw xwVar = fyVar.A0;
                ValueAnimator valueAnimator = xwVar.D0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    xwVar.i(xwVar.f16058l0, true);
                    fyVar.Q = true;
                    fyVar.getOrCreateStoryViewer().s(new ev(fyVar, 18));
                }
            }
        }
    }

    public static void r0(Activity activity, Boolean bool) {
        if (!bool.booleanValue()) {
            return;
        }
        if (!org.telegram.ui.Components.yd0.c()) {
            org.telegram.ui.Components.yd0.h();
        } else {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
        }
    }

    public static boolean r1(fy fyVar, ey eyVar) {
        if (!fyVar.B3.c()) {
            int i10 = (int) (-fyVar.J);
            int T3 = fyVar.T3();
            int U3 = fyVar.U3();
            if (i10 != 0 && i10 != T3 && i10 != U3 && eyVar.f37921a.canScrollVertically(-1)) {
                if (U3 < i10 && i10 < T3) {
                    int dp = AndroidUtilities.dp(48.0f);
                    int i11 = i10 - U3;
                    if (i11 < dp / 2) {
                        eyVar.f37922b.m(-i11);
                        return true;
                    }
                    eyVar.f37922b.m(dp - i11);
                    return true;
                }
                float f9 = 1.0f;
                if (fyVar.f38335p3 != 1.0f) {
                    f9 = Utilities.clamp((-fyVar.J) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
                }
                if (f9 < fyVar.A0.f16074x0) {
                    eyVar.f37922b.m(-i10);
                    return true;
                }
                eyVar.f37922b.m(U3 - i10);
                return true;
            }
            return false;
        }
        return false;
    }

    public static void s0(fy fyVar) {
        c.c(fyVar.getParentActivity(), fyVar.currentAccount, fyVar.getResourceProvider());
    }

    public static String s2(fy fyVar) {
        String shortName;
        ArrayList arrayList = fyVar.E2;
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
                if (longValue == fyVar.getUserConfig().getClientUserId()) {
                    sb2.append(LocaleController.getString(R.string.SavedMessages));
                } else {
                    if (arrayList.size() == 1) {
                        shortName = DialogObject.getName(fyVar.currentAccount, longValue);
                    } else {
                        shortName = DialogObject.getShortName(fyVar.currentAccount, longValue);
                    }
                    sb2.append(shortName);
                }
            }
            return LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        }
        return LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]);
    }

    public static void t0(final int i10, final long j10, TLRPC.Chat chat, final fy fyVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        int i14;
        fyVar.b4(false);
        if (i10 == 103 && ChatObject.isChannel(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || ChatObject.isPublic(chat2)) {
                fyVar.getMessagesController().deleteDialog(j10, 2, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i10 == 102 && (i14 = fyVar.R2) != 0 && fyVar.R3(fyVar.currentAccount, fyVar.f38256a0[0].f37928s, i14, false).size() == 1) {
            fyVar.f38256a0[0].f37929w.setVisibility(4);
        }
        fyVar.f38361u3 = 3;
        int i15 = -1;
        if (i10 == 102) {
            fyVar.A4(true, true);
            if (fyVar.N1 != null) {
                i13 = 0;
                while (i13 < fyVar.N1.size()) {
                    if (((TLRPC.Dialog) fyVar.N1.get(i13)).f22396id == j10) {
                        break;
                    }
                    i13++;
                }
            }
            i13 = -1;
            fyVar.o3();
            i11 = i13;
        } else {
            i11 = -1;
        }
        UndoView Y3 = fyVar.Y3();
        if (Y3 != null) {
            if (i10 == 103) {
                i12 = 0;
            } else if (z11) {
                i12 = 1;
            } else {
                i12 = 95;
            }
            Y3.j(i12, j10, new Runnable() {
                @Override
                public final void run() {
                    fyVar.q4(i10, j10, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(fyVar.R3(fyVar.currentAccount, fyVar.f38256a0[0].f37928s, fyVar.R2, false));
        int i16 = 0;
        while (true) {
            if (i16 >= arrayList2.size()) {
                break;
            } else if (((TLRPC.Dialog) arrayList2.get(i16)).f22396id == j10) {
                i15 = i16;
                break;
            } else {
                i16++;
            }
        }
        if (i10 == 102) {
            if (i11 >= 0 && i15 < 0 && (arrayList = fyVar.N1) != null) {
                arrayList.remove(i11);
                fyVar.f38256a0[0].f37930x.D();
                fyVar.f38256a0[0].q(true);
                return;
            }
            fyVar.A4(false, true);
        }
    }

    public static void u0(fy fyVar) {
        BirthdayController.getInstance(fyVar.currentAccount).hide();
        MessagesController.getInstance(fyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_CONTACTS_TODAY");
        fyVar.U4();
        org.telegram.ui.Components.mc G = org.telegram.ui.Components.tc.a0(fyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f30652j = 5000;
        G.j();
    }

    public static void v0(fy fyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
            LaunchActivity.C0(launchActivity, fyVar.currentAccount, tL_attachMenuBot, null, true);
        } else {
            gi1.a(fyVar.getParentActivity(), new eh(fyVar, tL_attachMenuBot, launchActivity), null);
        }
    }

    public static void w0(fy fyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.C0(launchActivity, fyVar.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(fyVar.currentAccount).updateAttachMenuBotsInCache();
    }

    public static void x0(fy fyVar) {
        MessagesController.getInstance(fyVar.currentAccount).removeSuggestion(0L, "PREMIUM_RESTORE");
        fyVar.U4();
    }

    public static void y0(fy fyVar) {
        if (!fyVar.K3) {
            nh.t3 t3Var = fyVar.m0;
            if (t3Var != null) {
                if (t3Var.R) {
                    return;
                }
                AndroidUtilities.removeFromParent(t3Var);
            }
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.g6.Gi, 0, new vv(fyVar, 7));
            nh.t3 t3Var2 = new nh.t3(fyVar.getParentActivity(), 2);
            t3Var2.r(8.0f);
            t3Var2.d = 8000L;
            t3Var2.i();
            t3Var2.q(true);
            t3Var2.h = AndroidUtilities.displaySize.x - AndroidUtilities.dp(148.0f);
            t3Var2.t(replaceSingleTag);
            t3Var2.m(1.0f, -40.0f);
            t3Var2.h(fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
            fyVar.m0 = t3Var2;
            t3Var2.setTranslationY((-fyVar.f38270c4) - fyVar.f38281e4);
            ((ViewGroup) fyVar.fragmentView).addView(fyVar.m0, i7.f6.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
            fyVar.m0.v();
            return;
        }
        nh.t3 t3Var3 = fyVar.f38313l0;
        if (t3Var3 != null) {
            t3Var3.e(true);
        }
        lh.m6 o10 = MessagesController.getInstance(fyVar.currentAccount).getStoriesController().o();
        if (o10 != null && o10.a(fyVar.currentAccount, 1)) {
            fyVar.showDialog(new cg.v0(o10.b(), fyVar.currentAccount, fyVar.getParentActivity(), fyVar, null));
            return;
        }
        nh.gb E = nh.gb.E(fyVar.getParentActivity(), fyVar.currentAccount);
        E.f17811x = new kx(fyVar, 4);
        E.R(null);
    }

    public static void z0(fy fyVar) {
        MessagesController.getInstance(fyVar.currentAccount).removeSuggestion(0L, "PREMIUM_CHRISTMAS");
        fyVar.U4();
        org.telegram.ui.Components.mc G = org.telegram.ui.Components.tc.a0(fyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f30652j = 5000;
        G.j();
    }

    public final void A3() {
        org.telegram.ui.Components.u10.d(this.f38293h0, com.google.android.recaptcha.internal.a.C(this.f38260b.f49505e, 1.0f - V3(), 1.0f - this.f38266c.f49505e, this.d.f49505e));
    }

    public final void A4(boolean z10, boolean z11) {
        if (this.f38256a0 != null && this.O1 != z10) {
            if (z10) {
                this.N1 = new ArrayList(R3(this.currentAccount, this.f38256a0[0].f37928s, this.R2, false));
            } else {
                this.N1 = null;
            }
            this.O1 = z10;
            ey eyVar = this.f38256a0[0];
            eyVar.d.C = z10;
            if (!z10 && z11) {
                if (eyVar.f37921a.b0()) {
                    this.f38256a0[0].f37921a.post(new vv(this, 8));
                } else {
                    this.f38256a0[0].d.l();
                }
            }
        }
    }

    @Override
    public final List B() {
        return Arrays.asList(new xf.a(LocaleController.getString(R.string.DebugDialogsActivity)), new xf.a(LocaleController.getString(R.string.ClearLocalDatabase), new ev(this, 27)), new xf.a(LocaleController.getString(R.string.DebugClearSendMessageAsPeers), new ev(this, 28)));
    }

    public final void B3() {
        boolean z10;
        cg.h0 h0Var;
        if (!this.f38285f2 && ((h0Var = this.G0) == null || h0Var.getBackground() == null || this.G0.getAlpha() < 0.01f || this.G0.getVisibility() == 8)) {
            z10 = true;
        } else {
            z10 = false;
        }
        kg0 kg0Var = this.E3;
        if (kg0Var != null) {
            kg0Var.f39862a.v.a(z10, true);
        }
    }

    public final void B4(boolean z10) {
        ey eyVar;
        if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
            if (z10) {
                ey[] eyVarArr = this.f38256a0;
                if (eyVarArr != null && (eyVar = eyVarArr[0]) != null) {
                    eyVar.setLayerType(2, null);
                    this.f38256a0[0].setClipChildren(false);
                    this.f38256a0[0].setClipToPadding(false);
                    this.f38256a0[0].f37921a.setClipChildren(false);
                }
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                if (lVar != null) {
                    lVar.setLayerType(2, null);
                }
                View view = this.fragmentView;
                if (view != null) {
                    ((ViewGroup) view).setClipChildren(false);
                    this.fragmentView.requestLayout();
                    return;
                }
                return;
            }
            if (this.f38256a0 != null) {
                int i10 = 0;
                while (true) {
                    ey[] eyVarArr2 = this.f38256a0;
                    if (i10 >= eyVarArr2.length) {
                        break;
                    }
                    ey eyVar2 = eyVarArr2[i10];
                    if (eyVar2 != null) {
                        eyVar2.setLayerType(0, null);
                        eyVar2.setClipChildren(true);
                        eyVar2.setClipToPadding(true);
                        eyVar2.f37921a.setClipChildren(true);
                    }
                    i10++;
                }
            }
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            if (lVar2 != null) {
                lVar2.setLayerType(0, null);
            }
            xw xwVar = this.A0;
            if (xwVar != null) {
                xwVar.setLayerType(0, null);
            }
            View view2 = this.fragmentView;
            if (view2 != null) {
                ((ViewGroup) view2).setClipChildren(true);
                this.fragmentView.requestLayout();
            }
        }
    }

    public final void C3() {
        w3();
        org.telegram.ui.Components.u10.d(this.f38288g0, (1.0f - this.f38260b.f49505e) * (1.0f - V3()) * (1.0f - this.f38266c.f49505e));
        x3();
        A3();
        y3();
        z3();
    }

    public final void C4(float f9) {
        ey[] eyVarArr = this.f38256a0;
        int i10 = 0;
        if (eyVarArr != null) {
            int paddingTop = eyVarArr[0].f37921a.getPaddingTop() + ((int) f9);
            int i11 = 0;
            while (true) {
                ey[] eyVarArr2 = this.f38256a0;
                if (i11 >= eyVarArr2.length) {
                    break;
                }
                eyVarArr2[i11].f37921a.setTopGlowOffset(paddingTop);
                i11++;
            }
        }
        if (this.fragmentView != null && f9 != this.J) {
            this.J = f9;
            org.telegram.ui.Components.mc mcVar = this.f38306j3;
            if (mcVar != null) {
                mcVar.l();
            }
            if (this.A3 != null) {
                float currentActionBarHeight = 1.0f - ((-f9) / org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
                org.telegram.ui.Cells.o oVar = this.A3;
                float f10 = (int) f9;
                float f11 = oVar.f24765f;
                oVar.h = f10;
                oVar.setTranslationY(f11 + f10);
                this.A3.setAlpha(i7.w.a(currentActionBarHeight, 0.0f, 1.0f));
                org.telegram.ui.Cells.o oVar2 = this.A3;
                if (currentActionBarHeight <= 0.0f) {
                    i10 = 4;
                }
                oVar2.setVisibility(i10);
            }
            E3();
            this.fragmentView.invalidate();
        }
    }

    public final void D3() {
        int i10;
        if (V3() > 0.5f) {
            i10 = R.string.SearchTopics;
        } else {
            i10 = R.string.SearchChats;
        }
        String string = LocaleController.getString(i10);
        this.T.f34546r.setContentDescription(string);
        this.T.f34546r.setHint(string);
    }

    public final void D4(float f9) {
        int i10;
        int i11;
        this.f38355t1 = f9;
        if (this.f38325n3 && this.actionBar != null) {
            if (this.R2 == 0 && this.T2 == 0) {
                i10 = org.telegram.ui.ActionBar.g6.f23385v8;
            } else {
                i10 = org.telegram.ui.ActionBar.g6.O8;
            }
            int themedColor = getThemedColor(i10);
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            int i12 = org.telegram.ui.ActionBar.g6.y8;
            lVar.C(i0.a.d(this.f38355t1, themedColor, getThemedColor(i12)), false);
            this.actionBar.C(i0.a.d(this.f38355t1, getThemedColor(i12), getThemedColor(i12)), true);
            if (this.R2 == 0 && this.T2 == 0) {
                i11 = org.telegram.ui.ActionBar.g6.f23348t8;
            } else {
                i11 = org.telegram.ui.ActionBar.g6.N8;
            }
            int themedColor2 = getThemedColor(i11);
            this.actionBar.B(i0.a.d(this.f38355t1, themedColor2, getThemedColor(org.telegram.ui.ActionBar.g6.f23452z8)), false);
        }
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            LiteMode.isEnabled(32768);
        }
        S4();
    }

    public final void E3() {
        float f9;
        int i10;
        if (this.T == null) {
            return;
        }
        float a2 = 1.0f - i7.w.a(((-this.J) - U3()) / AndroidUtilities.dp(48.0f), 0.0f, 1.0f);
        float max = Math.max(this.f38335p3, this.h.f49505e);
        float f10 = this.f38260b.f49505e;
        if (this.N0 != 2) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        float max2 = f9 * (1.0f - this.f38266c.f49505e) * (1.0f - max) * Math.max(f10, (1.0f - V3()) * a2);
        this.T.setAlpha(max2);
        ux uxVar = this.T;
        boolean z10 = false;
        if (max2 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        uxVar.setVisibility(i10);
        if (max2 <= 0.01f) {
            z10 = true;
        }
        this.f38282f.a(z10, true);
    }

    public final void E4(CharSequence charSequence, String str) {
        if (str != null && !str.isEmpty()) {
            this.A2 = str;
            this.B2 = null;
            this.f38383z2 = null;
            if (this.f38373x1 != null) {
                l3(charSequence);
                return;
            } else {
                this.R3 = charSequence;
                return;
            }
        }
        this.A2 = null;
        this.B2 = null;
    }

    public final void F3() {
        int i10;
        float f9;
        int i11;
        int i12 = 8;
        if (this.V != null) {
            if (this.W != null) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            float f10 = f9 * this.f38260b.f49505e;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, f10);
            this.V.setScaleX(lerp);
            this.V.setScaleY(lerp);
            this.V.setAlpha(f10);
            p31 p31Var = this.V;
            if (f10 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            p31Var.setVisibility(i11);
        }
        org.telegram.ui.Components.y71 y71Var = this.W;
        vd.a aVar = this.f38348s;
        if (y71Var != null) {
            float f11 = 1.0f - aVar.f49505e;
            y71Var.setAlpha(f11);
            org.telegram.ui.Components.y71 y71Var2 = this.W;
            if (f11 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            y71Var2.setVisibility(i10);
        }
        rf.h0 h0Var = this.X;
        if (h0Var != null) {
            float f12 = aVar.f49505e;
            h0Var.setAlpha(f12);
            rf.h0 h0Var2 = this.X;
            if (f12 > 0.0f) {
                i12 = 0;
            }
            h0Var2.setVisibility(i12);
        }
    }

    public final void F4(float f9) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.T3 != f9) {
            boolean z10 = true;
            if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
                z10 = false;
            }
            this.U3 = z10;
            this.T3 = f9;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.U3) {
                float f10 = (1.0f - this.T3) * (-AndroidUtilities.dp(40.0f));
                xw xwVar = this.A0;
                if (xwVar != null) {
                    xwVar.setTranslationX(f10);
                }
                ux uxVar = this.T;
                if (uxVar != null) {
                    uxVar.setTranslationX(f10);
                }
                ax axVar = this.B3;
                if (axVar != null && axVar.getFragmentView() != null && !this.f38376y) {
                    this.B3.getFragmentView().setTranslationX(f10);
                    return;
                }
                return;
            }
            float f11 = 1.0f - this.T3;
            float f12 = (-AndroidUtilities.dp(4.0f)) * f11;
            float f13 = 1.0f - (f11 * 0.05f);
            xw xwVar2 = this.A0;
            if (xwVar2 != null) {
                xwVar2.setScaleX(f13);
                this.A0.setScaleY(f13);
                this.A0.setTranslationX(f12);
                this.A0.setPivotX(0.0f);
                this.A0.setPivotY(0.0f);
            }
            ux uxVar2 = this.T;
            if (uxVar2 != null) {
                uxVar2.setTranslationX(f12);
                this.T.setScaleX(f13);
                this.T.setScaleY(f13);
            }
            ax axVar2 = this.B3;
            if (axVar2 != null && axVar2.getFragmentView() != null) {
                if (!this.f38376y) {
                    this.B3.getFragmentView().setScaleX(f13);
                    this.B3.getFragmentView().setScaleY(f13);
                    this.B3.getFragmentView().setTranslationX(f12);
                }
                this.B3.getFragmentView().setPivotX(0.0f);
                this.B3.getFragmentView().setPivotY(0.0f);
            }
        }
    }

    public final void G3(boolean z10) {
        int i10;
        int i11;
        if (this.f38377y0 != null && this.actionBar != null) {
            int i12 = AndroidUtilities.navigationBarHeight;
            int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f38255a);
            if (this.W != null) {
                i10 = AndroidUtilities.dp(50.0f);
            } else {
                i10 = 0;
            }
            int i13 = measuredHeight + i10;
            org.telegram.ui.Components.fs fsVar = this.F1;
            if (fsVar != null) {
                i11 = (int) fsVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i14 = i13 + i11;
            ox oxVar = this.f38377y0;
            SparseArray sparseArray = oxVar.h;
            oxVar.Q0 = i14;
            oxVar.R0 = i12;
            jh.e1 e1Var = oxVar.R;
            if (z10) {
                e1Var.o1(0, i14, 0, i12);
            } else {
                e1Var.setPadding(0, i14, 0, i12);
            }
            oxVar.I0.j(oxVar.Q0, oxVar.R0, z10);
            org.telegram.ui.Components.gn0 gn0Var = oxVar.S;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gn0Var.getLayoutParams();
            int i15 = marginLayoutParams.topMargin;
            int i16 = oxVar.Q0;
            if (i15 != i16 || marginLayoutParams.bottomMargin != oxVar.R0) {
                marginLayoutParams.topMargin = i16;
                marginLayoutParams.bottomMargin = oxVar.R0;
                gn0Var.requestLayout();
            }
            org.telegram.ui.Components.tn0.P(oxVar.f32989b0, oxVar.f32992e0, oxVar.Q0, oxVar.R0, z10);
            org.telegram.ui.Components.tn0.P(oxVar.f32994g0, oxVar.f32997j0, oxVar.Q0, oxVar.R0, z10);
            org.telegram.ui.Components.tn0.P(oxVar.f33000n0, oxVar.f33003q0, oxVar.Q0, oxVar.R0, z10);
            org.telegram.ui.Components.ug0 ug0Var = oxVar.f32999l0;
            int i17 = oxVar.Q0;
            int i18 = oxVar.R0;
            ug0Var.setClipToPadding(false);
            org.telegram.ui.Components.u51 u51Var = ug0Var.f33224c;
            ug0Var.F = z10;
            ug0Var.setPadding(0, i17, 0, i18);
            if (z10) {
                u51Var.o1(0, i17, 0, i18);
            } else {
                u51Var.setPadding(0, i17, 0, i18);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) u51Var.getLayoutParams();
            marginLayoutParams2.topMargin = -i17;
            marginLayoutParams2.bottomMargin = -i18;
            ug0Var.F = false;
            org.telegram.ui.Components.tm0 tm0Var = oxVar.C0;
            if (tm0Var != null) {
                tm0Var.b(oxVar.Q0, oxVar.R0, z10);
            }
            int size = sparseArray.size();
            for (int i19 = 0; i19 < size; i19++) {
                View view = (View) sparseArray.valueAt(i19);
                if (view instanceof h10) {
                    ((h10) view).j(oxVar.Q0, oxVar.R0, z10);
                }
            }
            for (int i20 = 0; i20 < oxVar.getChildCount(); i20++) {
                if (oxVar.getChildAt(i20) instanceof h10) {
                    ((h10) oxVar.getChildAt(i20)).j(oxVar.Q0, oxVar.R0, z10);
                }
            }
        }
    }

    public final void G4() {
        getContactsController().loadGlobalPrivacySetting();
        org.telegram.ui.Components.u6 u6Var = new org.telegram.ui.Components.u6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.voip.o(8, this, r0), new ui(r0, 17));
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(getParentActivity(), getResourceProvider());
        a3Var.c(u6Var);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.f22729a;
        f3Var.show();
        org.telegram.ui.ActionBar.f3[] f3VarArr = {f3Var};
        f3Var.fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5));
    }

    public final void H3() {
        if (this.F1 != null) {
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, 1.0f);
            this.F1.setAlpha(1.0f);
            this.F1.setScaleX(lerp);
            this.F1.setScaleY(lerp);
            this.F1.setVisibility(0);
        }
    }

    public final boolean H4(org.telegram.ui.Cells.p2 r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fy.H4(org.telegram.ui.Cells.p2):boolean");
    }

    public boolean I3() {
        if (this.N0 == 10) {
            return true;
        }
        return false;
    }

    public final void I4(boolean z10) {
        float f9;
        this.f38266c.a(z10, true);
        if (this.f38298i0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.L3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.L3 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.L3 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            this.f38298i0.setVisibility(0);
        } else {
            this.f38298i0.setSelected(false);
            Drawable background = this.f38298i0.getBackground();
            if (background != null) {
                background.setState(StateSet.NOTHING);
                background.jumpToCurrentState();
            }
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.ActionBar.w0 w0Var = this.f38298i0;
        Property property = View.ALPHA;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(w0Var, property, f9));
        this.L3.playTogether(arrayList);
        this.L3.addListener(new gx(this, z10, 1));
        this.L3.start();
    }

    public final void J3() {
        if (AndroidUtilities.isTablet()) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.h(true);
            }
            TLObject tLObject = this.T1;
            if (tLObject != null) {
                ox oxVar = this.f38377y0;
                if (oxVar != null) {
                    oxVar.U.R(this.S1, tLObject);
                }
                this.T1 = null;
                return;
            }
            return;
        }
        this.R1 = true;
    }

    public final void J4() {
        if (!this.f38367w0 && getMessagesController().dialogFiltersLoaded && getMessagesController().showFiltersTooltip && this.f38362v0 != null && getMessagesController().getDialogFilters().isEmpty() && !this.isPaused && getUserConfig().filtersLoaded && !this.inPreviewMode) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("filterhint", false)) {
                globalMainSettings.edit().putBoolean("filterhint", true).apply();
                AndroidUtilities.runOnUIThread(new vv(this, 9), 1000L);
            }
        }
    }

    public final void K3() {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null && lVar.f23612j0) {
            lVar.h(true);
            this.f38315l3 = false;
            V4(true, true);
        }
    }

    public final void K4() {
        LaunchActivity launchActivity;
        boolean q6;
        int i10;
        int i11;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        LaunchActivity launchActivity2;
        CharSequence charSequence;
        org.telegram.ui.Components.voip.o oVar;
        int i12;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i13;
        int v02;
        int v03;
        int v04;
        int l1;
        CharSequence charSequence2;
        int i14;
        int v05;
        org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(this, this.f38288g0);
        int i15 = org.telegram.ui.ActionBar.g6.A8;
        H.S(getThemedColor(i15), getThemedColor(i15));
        H.f29600s = 8;
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) parentActivity;
        } else {
            launchActivity = null;
        }
        int i16 = 0;
        if (this.T2 != 0) {
            if (ChatObject.hasAdminRights(this.U2)) {
                H.c(R.drawable.msg_customize, LocaleController.getString(R.string.CommunityMenuSettings), new ev(this, 4), false);
                H.k();
            }
            H.i(new ev(this, 7), LocaleController.getString(R.string.CommunityMenuShowAsOneChat), this.U2.collapsed_in_dialogs);
            H.i(new ev(this, 8), LocaleController.getString(R.string.CommunityMenuShowAsSeparateChats), !this.U2.collapsed_in_dialogs);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        } else if (e4()) {
            H.c(R.drawable.msg_customize, LocaleController.getString(R.string.ArchiveSettings), new ev(this, 9), false);
            H.c(R.drawable.msg_help, LocaleController.getString(R.string.HowDoesItWork), new ev(this, 10), false);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        } else {
            org.telegram.ui.ActionBar.c6 c6Var2 = this.resourceProvider;
            if (c6Var2 != null) {
                q6 = c6Var2.a();
            } else {
                q6 = org.telegram.ui.ActionBar.g6.I.q();
            }
            if (q6) {
                i10 = R.drawable.menu_day_mode_24;
            } else {
                i10 = R.drawable.menu_night_mode_24;
            }
            if (q6) {
                i11 = R.string.SwitchThemeToDay;
            } else {
                i11 = R.string.SwitchThemeToNight;
            }
            H.c(i10, LocaleController.getString(i11), new ev(this, 11), false);
            H.k();
            H.c(R.drawable.outline_groups_24, LocaleController.getString(R.string.NewGroup), new ev(this, 12), false);
            H.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.SavedMessages), new ev(this, 13), false);
            ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
            if (applicationLoader != null) {
                applicationLoader.addItemOptions(H);
            }
            TLRPC.TL_attachMenuBots attachMenuBots = MediaDataController.getInstance(UserConfig.selectedAccount).getAttachMenuBots();
            if (launchActivity != null && attachMenuBots != null && (arrayList = attachMenuBots.bots) != null && !arrayList.isEmpty()) {
                ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = attachMenuBots.bots;
                int size = arrayList2.size();
                int i17 = 0;
                while (i17 < size) {
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i17);
                    i17++;
                    TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                    if (tL_attachMenuBot2.show_in_side_menu) {
                        hv hvVar = new hv(this, tL_attachMenuBot2, launchActivity, 0);
                        org.telegram.ui.Components.voip.o oVar2 = new org.telegram.ui.Components.voip.o(7, this, tL_attachMenuBot2);
                        org.telegram.ui.ActionBar.c6 c6Var3 = H.d;
                        if (H.f29575e != null) {
                            int i18 = org.telegram.ui.ActionBar.g6.F8;
                            int i19 = org.telegram.ui.ActionBar.g6.E8;
                            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(0, H.f29575e, H.d, false, false);
                            g1Var2.setPadding(AndroidUtilities.dp(18.0f), i16, AndroidUtilities.dp(18.0f), i16);
                            if (tL_attachMenuBot2.side_menu_disclaimer_needed) {
                                charSequence = org.telegram.ui.Cells.m8.a(tL_attachMenuBot2.short_name);
                            } else {
                                charSequence = tL_attachMenuBot2.short_name;
                            }
                            TLRPC.TL_attachMenuBotIcon sideAttachMenuBotIcon = MediaDataController.getSideAttachMenuBotIcon(tL_attachMenuBot2);
                            if (sideAttachMenuBotIcon != null) {
                                launchActivity2 = launchActivity;
                                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(sideAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.g6.f23045c7, 1.0f);
                                if (svgThumb != null) {
                                    Integer num = H.f29587k0;
                                    if (num != null) {
                                        v05 = num.intValue();
                                    } else {
                                        v05 = org.telegram.ui.ActionBar.g6.v0(i18, c6Var3);
                                    }
                                    charSequence2 = charSequence;
                                    svgThumb.setColorFilter(new PorterDuffColorFilter(v05, PorterDuff.Mode.SRC_IN));
                                } else {
                                    charSequence2 = charSequence;
                                }
                                i12 = i19;
                                oVar = oVar2;
                                i13 = i18;
                                g1Var = g1Var2;
                                c6Var = c6Var3;
                                g1Var.h(charSequence2, ImageLocation.getForDocument(sideAttachMenuBotIcon.icon), "24_24", svgThumb, tL_attachMenuBot2);
                                org.telegram.ui.Components.t9 t9Var = g1Var.h;
                                if (t9Var != null) {
                                    if (LocaleController.isRTL) {
                                        i14 = 5;
                                    } else {
                                        i14 = 3;
                                    }
                                    t9Var.setLayoutParams(i7.f6.e(24, 24, i14 | 16));
                                }
                            } else {
                                launchActivity2 = launchActivity;
                                oVar = oVar2;
                                i12 = i19;
                                g1Var = g1Var2;
                                c6Var = c6Var3;
                                CharSequence charSequence3 = charSequence;
                                i13 = i18;
                                g1Var.g(charSequence3, R.drawable.msg_bot, null);
                            }
                            Integer num2 = H.f29585j0;
                            if (num2 != null) {
                                v02 = num2.intValue();
                            } else {
                                v02 = org.telegram.ui.ActionBar.g6.v0(i12, c6Var);
                            }
                            Integer num3 = H.f29587k0;
                            if (num3 != null) {
                                v03 = num3.intValue();
                            } else {
                                v03 = org.telegram.ui.ActionBar.g6.v0(i13, c6Var);
                            }
                            g1Var.c(v02, v03);
                            Integer num4 = H.f29587k0;
                            if (num4 != null) {
                                v04 = num4.intValue();
                            } else {
                                v04 = org.telegram.ui.ActionBar.g6.v0(i13, c6Var);
                            }
                            g1Var.setIconColorImage(v04);
                            Integer num5 = H.f29589l0;
                            if (num5 != null) {
                                l1 = num5.intValue();
                            } else {
                                l1 = org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
                            }
                            g1Var.setSelectorColor(l1);
                            g1Var.setOnClickListener(new org.telegram.ui.Components.t2(26, H, hvVar));
                            g1Var.setOnLongClickListener(new lh.e2(3, H, oVar));
                            int i20 = H.S;
                            if (i20 > 0) {
                                g1Var.setMinimumWidth(AndroidUtilities.dp(i20));
                                H.r(g1Var, i7.f6.n(H.S, -2));
                            } else {
                                H.r(g1Var, i7.f6.n(-1, -2));
                            }
                            launchActivity = launchActivity2;
                            i16 = 0;
                        }
                    }
                    launchActivity2 = launchActivity;
                    launchActivity = launchActivity2;
                    i16 = 0;
                }
            }
            if (getUserConfig().showCallsTab) {
                H.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), new ev(this, 6), false);
            }
            org.telegram.ui.ActionBar.g1 g1Var3 = this.f38308k0;
            if (g1Var3 != null) {
                g1Var3.f22964b.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.ai));
                this.f38308k0.setOnClickListener(new org.telegram.ui.Components.fi0(18, this, H));
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", "");
                if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty())) {
                    H.k();
                    H.d(this.f38308k0);
                }
            }
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        }
    }

    public final void L3(String str) {
        int i10;
        if (this.actionBar.a(str)) {
            return;
        }
        org.telegram.ui.ActionBar.a0 j10 = this.actionBar.j(str);
        boolean z10 = this.S;
        ArrayList arrayList = this.f38278e1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.f38268c1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f38268c1.setImageDrawable(new org.telegram.ui.ActionBar.h2(true));
            this.f38268c1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.y8), PorterDuff.Mode.MULTIPLY));
            this.f38268c1.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(org.telegram.ui.ActionBar.g6.f23452z8), 1, -1));
            this.f38268c1.setOnClickListener(new jv(this, 6));
            j10.addView(this.f38268c1, i7.f6.q(54, 54, 16));
            arrayList.add(this.f38268c1);
        }
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.f38272d1 = numberTextView;
        numberTextView.setTextSize(18);
        this.f38272d1.setTypeface(AndroidUtilities.bold());
        this.f38272d1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.y8));
        NumberTextView numberTextView2 = this.f38272d1;
        if (this.S) {
            i10 = 18;
        } else {
            i10 = 72;
        }
        j10.addView(numberTextView2, i7.f6.m(1.0f, 0, -1, i10, 0, 0));
        this.f38272d1.setOnTouchListener(new mh.d(2));
        this.f38289g1 = j10.g(100, R.drawable.msg_pin, AndroidUtilities.dp(48.0f));
        this.f38294h1 = j10.g(104, R.drawable.msg_mute, AndroidUtilities.dp(48.0f));
        this.f38299i1 = j10.g(107, R.drawable.msg_archive, AndroidUtilities.dp(48.0f));
        this.f38284f1 = j10.h(102, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(48.0f));
        org.telegram.ui.ActionBar.w0 h = j10.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(48.0f));
        j10.addView(new View(getParentActivity()), i7.f6.n(5, -1));
        this.f38317m1 = h.e(105, R.drawable.msg_archive, LocaleController.getString(R.string.Archive));
        this.f38304j1 = h.e(108, R.drawable.msg_pin, LocaleController.getString(R.string.DialogPin));
        this.f38309k1 = h.e(109, R.drawable.msg_addfolder, LocaleController.getString(R.string.FilterAddTo));
        this.l1 = h.e(110, R.drawable.msg_removefolder, LocaleController.getString(R.string.FilterRemoveFrom));
        this.f38328o1 = h.e(101, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
        this.f38323n1 = h.e(103, R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory));
        this.f38333p1 = h.e(106, R.drawable.msg_block, LocaleController.getString(R.string.BlockUser));
        this.f38294h1.setOnLongClickListener(new rv(this, 0));
        arrayList.add(this.f38289g1);
        arrayList.add(this.f38299i1);
        arrayList.add(this.f38294h1);
        arrayList.add(this.f38284f1);
        arrayList.add(h);
        T4(false);
    }

    public final void L4() {
        if (this.O3 == null) {
            for (String str : getMessagesController().pendingSuggestions) {
                if ("AUTOARCHIVE_POPULAR".equals(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.HideNewChatsAlertTitle);
                    alertDialog$Builder.f22714a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.HideNewChatsAlertText));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.GoToSettings), new kv(this, 6));
                    showDialog(alertDialog$Builder.f22714a, new fv(this, 1));
                    this.O3 = str;
                    return;
                }
            }
        }
    }

    public final void M3() {
        int i10;
        ox oxVar = this.f38377y0;
        if ((oxVar != null && oxVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        if (this.f38305j2 != null) {
            i10 = 2;
        } else if (!this.f38295h2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        ox oxVar2 = new ox(this, getParentActivity(), this, i10, this.N0, this.R2, this.T2, new kx(this, 1));
        this.f38377y0 = oxVar2;
        ((xx) this.fragmentView).addView(oxVar2, this.f38372x0);
        ox oxVar3 = this.f38377y0;
        oxVar3.U.Q = new qx(this);
        oxVar3.f32992e0.setOnItemClickListener(new kv(this, 1));
        this.f38377y0.f32997j0.setOnItemClickListener(new kv(this, 2));
        this.f38377y0.f33003q0.setOnItemClickListener(new ov(this, 0));
        this.f38377y0.f32997j0.setOnItemLongClickListener(new kv(this, 3));
        this.f38377y0.R.setOnItemClickListener(new kv(this, 4));
        this.f38377y0.R.setOnItemLongClickListener(new kx(this, 2));
        this.f38377y0.setFilteredSearchViewDelegate(new kv(this, 5));
        this.f38377y0.setAlpha(0.0f);
        this.f38377y0.setScaleX(1.05f);
        this.f38377y0.setScaleY(1.05f);
        this.f38377y0.setVisibility(8);
        this.f38377y0.setBlurredBackgroundDrawableFactory(this.f38320m4);
    }

    public final void M4(long j10, View view) {
        ArrayList<TLRPC.Dialog> R3;
        int i10;
        i3(j10, view);
        boolean s10 = this.actionBar.s();
        ArrayList arrayList = this.E2;
        boolean z10 = true;
        if (s10) {
            if (arrayList.isEmpty()) {
                b4(true);
                return;
            }
        } else {
            if (this.f38315l3) {
                L3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.c5)) {
                    th.y(false, this.actionBar);
                }
            } else {
                L3(null);
            }
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
            this.actionBar.O(null, null);
            int i11 = this.f38256a0[0].f37928s;
            if ((i11 != 7 && i11 != 8) || (this.actionBar.s() && !this.actionBar.t(null))) {
                R3 = getMessagesController().getDialogs(this.R2);
            } else {
                R3 = R3(this.currentAccount, this.f38256a0[0].f37928s, this.R2, this.O1);
            }
            int size = R3.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.Dialog dialog = R3.get(i13);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (g4(dialog)) {
                        i12++;
                    } else if (!getMessagesController().isPromoDialog(dialog.f22396id, false)) {
                        break;
                    }
                }
            }
            if (i12 > 1) {
                if (this.f38256a0 != null) {
                    int i14 = 0;
                    while (true) {
                        ey[] eyVarArr = this.f38256a0;
                        if (i14 >= eyVarArr.length) {
                            break;
                        }
                        eyVarArr[i14].d.D = true;
                        i14++;
                    }
                }
                g5(MessagesController.UPDATE_MASK_REORDER, true);
            }
            if (!this.f38315l3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f38278e1;
                    if (i15 >= arrayList3.size()) {
                        break;
                    }
                    View view2 = (View) arrayList3.get(i15);
                    view2.setPivotY(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2);
                    AndroidUtilities.clearDrawableAnimation(view2);
                    arrayList2.add(ObjectAnimator.ofFloat(view2, View.SCALE_Y, 0.1f, 1.0f));
                    i15++;
                }
                animatorSet.playTogether(arrayList2);
                animatorSet.setDuration(200L);
                animatorSet.start();
            }
            ValueAnimator valueAnimator = this.f38340q3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f38340q3 = ValueAnimator.ofFloat(this.f38335p3, 1.0f);
            int i16 = 0;
            while (true) {
                ey[] eyVarArr2 = this.f38256a0;
                if (i16 >= eyVarArr2.length) {
                    break;
                }
                ey eyVar = eyVarArr2[i16];
                if (eyVar != null) {
                    eyVar.f37921a.I0(true);
                }
                i16++;
            }
            if (this.G) {
                i10 = 81;
            } else {
                i10 = 0;
            }
            float max = Math.max(0.0f, AndroidUtilities.dp(i10 + 48) + this.J);
            if (max != 0.0f) {
                this.L = (int) max;
                this.fragmentView.requestLayout();
            }
            this.f38340q3.addUpdateListener(new lv(this, max, 0));
            this.f38340q3.addListener(new ix(this, max, 1));
            this.f38340q3.setInterpolator(org.telegram.ui.Components.jr.f29800f);
            this.f38340q3.setDuration(200L);
            this.f38340q3.start();
            ew ewVar = this.f38362v0;
            if (ewVar != null) {
                ewVar.b(org.telegram.ui.ActionBar.g6.Gh, org.telegram.ui.ActionBar.g6.Fh, org.telegram.ui.ActionBar.g6.Eh, org.telegram.ui.ActionBar.g6.Hh, org.telegram.ui.ActionBar.g6.f23403w8);
            }
            org.telegram.ui.ActionBar.h2 h2Var = this.f38257a1;
            if (h2Var != null) {
                h2Var.c(1.0f, true);
            }
            z10 = false;
        }
        T4(false);
        this.f38272d1.a(arrayList.size(), z10);
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        int i11;
        int i12;
        int i13 = 8;
        if (i10 == 1) {
            C3();
            E3();
            H3();
            u3();
            F3();
            ux uxVar = this.T;
            vd.a aVar = this.f38260b;
            uxVar.setBlurredBackgroundVisibility(aVar.f49505e);
            float b10 = jf.l0.b(aVar.f49505e);
            org.telegram.ui.Components.t9 t9Var = this.W2;
            if (t9Var != null) {
                t9Var.setScaleX(b10);
                this.W2.setScaleY(b10);
                this.W2.setAlpha(b10);
                org.telegram.ui.Components.t9 t9Var2 = this.W2;
                if (b10 > 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                t9Var2.setVisibility(i12);
            }
            if (this.f38343r0 != null) {
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
                this.f38343r0.setScaleX(lerp);
                this.f38343r0.setScaleY(lerp);
                this.f38343r0.setAlpha(b10);
                nh.d dVar = this.f38343r0;
                int i14 = (b10 > 0.0f ? 1 : (b10 == 0.0f ? 0 : -1));
                if (i14 > 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                dVar.setVisibility(i11);
                this.f38349s0.setAlpha(b10);
                ug.f fVar = this.f38349s0;
                if (i14 > 0) {
                    i13 = 0;
                }
                fVar.setVisibility(i13);
            }
        } else if (i10 == 2) {
            C3();
            E3();
        } else if (i10 == 3) {
            A3();
        } else if (i10 == 4) {
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        } else if (i10 == 5) {
            z3();
        } else if (i10 == 6) {
            C3();
            E3();
        } else if (i10 == 7) {
            v3();
        } else if (i10 == 8) {
            u3();
            F3();
        } else if (i10 == 9) {
            F3();
        }
    }

    public final void N3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.f38358u0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                undoViewArr[i10] = new jx(this, parentActivity);
                FrameLayout.LayoutParams d = i7.f6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.f38270c4 + this.f38281e4 + d.bottomMargin;
                UndoView undoView = undoViewArr[i10];
                int i11 = this.f38354t0 + 1;
                this.f38354t0 = i11;
                ((xx) this.fragmentView).addView(undoView, i11, d);
            }
        }
    }

    public final void N4(long j10, View view) {
        String str;
        org.telegram.ui.Components.mc J;
        int i10 = -this.I3;
        this.I3 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (j10 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)));
        } else {
            str = "";
        }
        if (getMessagesController().premiumFeaturesBlocked()) {
            J = org.telegram.ui.Components.tc.a0(this).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
        } else {
            J = org.telegram.ui.Components.tc.a0(this).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new ev(this, 22));
        }
        J.j();
    }

    public final void O3(final long j10, final long j11, boolean z10, final ze1 ze1Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String string;
        String formatStringSimple;
        String string2;
        String str;
        String str2;
        TLRPC.TL_forumTopic findTopic;
        if (p3(j10)) {
            int i10 = this.N0;
            if (i10 != 11 && i10 != 12 && i10 != 13) {
                if (z10 && ((this.f38263b2 != null && this.f38269c2 != null) || this.f38273d2 != null)) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        if (DialogObject.isEncryptedDialog(j10)) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(org.telegram.messenger.x3.p(getMessagesController(), j10).user_id));
                            if (user2 != null) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f38263b2, UserObject.getUserName(user2));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                return;
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            if (j10 == getUserConfig().getClientUserId()) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f38269c2, LocaleController.getString(R.string.SavedMessages));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j10));
                                if (user3 != null && this.f38263b2 != null) {
                                    str = LocaleController.getString(R.string.SendMessageTitle);
                                    str2 = LocaleController.formatStringSimple(this.f38263b2, UserObject.getUserName(user3));
                                    string2 = LocaleController.getString(R.string.Send);
                                } else {
                                    return;
                                }
                            }
                        } else {
                            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-j10));
                            if (chat2 != null) {
                                String str3 = chat2.title;
                                if (j11 != 0 && (findTopic = getMessagesController().getTopicsController().findTopic(chat2.f22392id, j11)) != null) {
                                    str3 = ((Object) str3) + " " + findTopic.title;
                                }
                                if (this.f38273d2 != null) {
                                    string = LocaleController.getString(R.string.AddToTheGroupAlertTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f38273d2, str3);
                                    string2 = LocaleController.getString(R.string.Add);
                                } else {
                                    string = LocaleController.getString(R.string.SendMessageTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f38269c2, str3);
                                    string2 = LocaleController.getString(R.string.Send);
                                }
                                String str4 = formatStringSimple;
                                str = string;
                                str2 = str4;
                            } else {
                                return;
                            }
                        }
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                        c2Var.N = str;
                        c2Var.P = AndroidUtilities.replaceTags(str2);
                        alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.b2() {
                            @Override
                            public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i11) {
                                fy.this.O3(j10, j11, false, ze1Var);
                            }
                        });
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        if (showDialog(c2Var) == null) {
                            c2Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 15) {
                    Runnable vVar = new g5.v(this, j10, new g5.x(this, j10, j11, ze1Var, 13), 26);
                    if (j10 < 0) {
                        Q4(getMessagesController().getChat(Long.valueOf(-j10)), vVar, null);
                        return;
                    }
                    TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(j10));
                    TLRPC.User user5 = getMessagesController().getUser(Long.valueOf(this.D));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, UserObject.getFirstName(user4), UserObject.getFirstName(user5));
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22714a;
                    c2Var2.N = formatString;
                    c2Var2.P = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, UserObject.getFirstName(user4), UserObject.getFirstName(user5))));
                    alertDialog$Builder2.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new xt(vVar, 1));
                    alertDialog$Builder2.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new org.telegram.ui.Components.xo0(14));
                    showDialog(c2Var2);
                    return;
                } else if (this.f38379y2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j10, j11));
                    if (this.f38379y2.v(this, arrayList, null, false, this.F2, this.G2, this.H2, ze1Var) && this.f38279e2) {
                        this.f38379y2 = null;
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
                    UndoView Y3 = Y3();
                    if (Y3 != null) {
                        Y3.j(45, j10, null);
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
                    UndoView Y32 = Y3();
                    if (Y32 != null) {
                        Y32.j(46, j10, null);
                        return;
                    }
                    return;
                }
            }
            org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
            TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
            tL_messages_checkHistoryImportPeer.peer = getMessagesController().getInputPeer(j10);
            getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new jh.x2(this, c2Var3, user, chat, j10, tL_messages_checkHistoryImportPeer));
            try {
                c2Var3.q(300L);
            } catch (Exception unused) {
            }
        }
    }

    public final void O4(boolean r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fy.O4(boolean, boolean, boolean, boolean):void");
    }

    public final void P3(long j10, boolean z10) {
        if (this.f38256a0 != null) {
            int i10 = 0;
            while (true) {
                ey[] eyVarArr = this.f38256a0;
                if (i10 < eyVarArr.length) {
                    int childCount = eyVarArr[i10].f37921a.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 < childCount) {
                            View childAt = this.f38256a0[i10].f37921a.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.p2) {
                                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) childAt;
                                if (p2Var.getDialogId() == j10) {
                                    p2Var.V(z10, true);
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

    public final void P4() {
        int i10;
        int i11;
        Long l10;
        if (this.I0 == null && !SharedConfig.appLocked && (!this.G || this.A0.g())) {
            u51[] u51VarArr = new u51[1];
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            org.telegram.ui.ActionBar.h5 titleTextView = this.actionBar.getTitleTextView();
            if (titleTextView != null && titleTextView.getRightDrawable() != null) {
                this.f38384z3.f();
                Drawable drawable = this.f38384z3.f30849f[0];
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(titleTextView.getRightDrawable().getBounds());
                rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
                int dp = (-(this.actionBar.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                i10 = AndroidUtilities.dp(4.0f) + (rect.centerX() - AndroidUtilities.dp(16.0f));
                org.telegram.ui.Cells.o oVar = this.A3;
                if (oVar != null) {
                    oVar.b(rect.centerX(), rect.centerY());
                }
                i11 = dp;
            } else {
                i10 = 0;
                i11 = 0;
            }
            bx bxVar = new bx(this, this, getParentActivity(), Integer.valueOf(i10), getResourceProvider(), u51VarArr);
            if (currentUser != null && DialogObject.getEmojiStatusUntil(currentUser.emoji_status) > 0) {
                bxVar.setExpireDateHint(DialogObject.getEmojiStatusUntil(currentUser.emoji_status));
            }
            Long l11 = this.f38375x3;
            if (l11 != null) {
                bxVar.setSelected(l11);
            } else {
                Drawable drawable2 = this.f38384z3.f30849f[0];
                if (drawable2 instanceof org.telegram.ui.Components.p5) {
                    l10 = Long.valueOf(((org.telegram.ui.Components.p5) drawable2).i());
                } else {
                    l10 = null;
                }
                bxVar.setSelected(l10);
            }
            bxVar.setSaveState(1);
            bxVar.y(this.f38384z3, titleTextView);
            cx cxVar = new cx(this, bxVar);
            this.I0 = cxVar;
            u51VarArr[0] = cxVar;
            cxVar.showAsDropDown(this.actionBar, AndroidUtilities.dp(16.0f), i11, 48);
            u51VarArr[0].b();
        }
    }

    public final void Q4(org.telegram.tgnet.TLRPC.Chat r14, java.lang.Runnable r15, java.lang.Runnable r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fy.Q4(org.telegram.tgnet.TLRPC$Chat, java.lang.Runnable, java.lang.Runnable):void");
    }

    public final java.util.ArrayList R3(int r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fy.R3(int, int, int, boolean):java.util.ArrayList");
    }

    public final void R4(boolean z10) {
        ey[] eyVarArr;
        char c3;
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            eyVarArr = this.f38256a0;
            if (i12 >= eyVarArr.length) {
                break;
            }
            eyVarArr[i12].f37921a.B0();
            i12++;
        }
        if (z10 && eyVarArr.length > 1) {
            c3 = 1;
        } else {
            c3 = 0;
        }
        int i13 = eyVarArr[c3].h;
        if (i13 >= 0 && i13 < getMessagesController().getDialogFilters().size()) {
            MessagesController.DialogFilter dialogFilter = getMessagesController().getDialogFilters().get(this.f38256a0[c3].h);
            if (dialogFilter.isDefault()) {
                ey eyVar = this.f38256a0[c3];
                eyVar.f37928s = this.N0;
                ay ayVar = eyVar.f37921a;
                int i14 = ay.f36618r3;
                ayVar.A1();
            } else {
                ey[] eyVarArr2 = this.f38256a0;
                if (eyVarArr2[c3 ^ 1].f37928s == 7) {
                    eyVarArr2[c3].f37928s = 8;
                } else {
                    eyVarArr2[c3].f37928s = 7;
                }
                eyVarArr2[c3].f37921a.setScrollEnabled(true);
                MessagesController messagesController = getMessagesController();
                if (this.f38256a0[c3].f37928s == 8) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                messagesController.selectDialogFilter(dialogFilter, i10);
            }
            ey[] eyVarArr3 = this.f38256a0;
            if (eyVarArr3.length > 1) {
                eyVarArr3[1].A = dialogFilter.locked;
            }
            ey eyVar2 = eyVarArr3[c3];
            nw nwVar = eyVar2.d;
            nwVar.h = eyVar2.f37928s;
            nwVar.l();
            ey eyVar3 = this.f38256a0[c3];
            jw jwVar = eyVar3.f37923c;
            if (eyVar3.f37928s == 0 && Z3() && this.f38256a0[c3].v == 2) {
                i11 = 1;
            }
            jwVar.h1(i11, (int) this.J);
            r3(this.f38256a0[c3]);
        }
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        ax axVar;
        cg.h0 h0Var;
        ew ewVar;
        boolean z11;
        boolean z12;
        if (!this.f38315l3 && (((axVar = this.B3) == null || !axVar.c()) && (((h0Var = this.G0) == null || h0Var.getVisibility() != 0) && ((ewVar = this.f38362v0) == null || !ewVar.f28243n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                ew ewVar2 = this.f38362v0;
                if (ewVar2 != null && ewVar2.getTabsCount() >= 2 && this.f38362v0.getCurrentTabId() != this.f38362v0.getFirstTabId()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                ew ewVar3 = this.f38362v0;
                if (ewVar3 != null && ewVar3.getTabsCount() >= 2 && this.f38362v0.getCurrentTabId() != this.f38362v0.getLastTabId()) {
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

    public final float S3(boolean z10) {
        float f9;
        if (z10) {
            f9 = 1.0f - this.f38260b.f49505e;
        } else {
            f9 = 1.0f;
        }
        return f9 * (1.0f - V3()) * this.f38342r.f49505e;
    }

    public final void S4() {
        float f9;
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
        p31 p31Var = this.V;
        if (p31Var != null && p31Var.getVisibility() != 8) {
            f9 = this.V.getMeasuredHeight();
        } else {
            f9 = 0.0f;
        }
        if (this.G) {
            f10 = AndroidUtilities.dp(81.0f);
        } else {
            f10 = 0.0f;
        }
        if (this.G) {
            float f19 = this.J;
            float f20 = this.f38355t1;
            f11 = (f9 * f20) + com.google.android.recaptcha.internal.a.z(1.0f, f20, f10, f19);
            f12 = this.f38352s3;
        } else {
            f11 = (f9 * this.f38355t1) + this.J;
            f12 = this.f38352s3;
        }
        float f21 = f11 + f12 + this.P;
        ux uxVar = this.T;
        if (uxVar != null && uxVar.getVisibility() == 0) {
            f13 = this.T.getAlpha();
        } else {
            f13 = 0.0f;
        }
        float dp = AndroidUtilities.dp(4.0f) * f13;
        ew ewVar = this.f38362v0;
        if (ewVar != null) {
            ewVar.setTranslationY(f21 - dp);
            f15 = this.f38362v0.getAlpha();
            f16 = AndroidUtilities.dp(43.0f) * f15;
            f14 = f21 + f16;
        } else {
            f14 = f21;
            f15 = 0.0f;
            f16 = 0.0f;
        }
        org.telegram.ui.Components.fs fsVar = this.F1;
        if (fsVar != null) {
            float f22 = f14 - dp;
            int i11 = -AndroidUtilities.dp(3.0f);
            if (this.W == null) {
                i10 = AndroidUtilities.dp(44.0f);
            } else {
                i10 = 0;
            }
            fsVar.setTranslationY(AndroidUtilities.lerp(f22, i11 - i10, this.f38260b.f49505e));
            f17 = this.F1.getMetadata().f49521c.f49531a;
            f18 = this.F1.c(0.0f);
        } else {
            f17 = 0.0f;
            f18 = 0.0f;
        }
        org.telegram.ui.Components.es esVar = this.G1;
        if (esVar != null) {
            esVar.setTranslationY(f21 - dp);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f), Math.min(f17, f15));
            org.telegram.ui.Components.es esVar2 = this.G1;
            float min = Math.min(AndroidUtilities.dp(40.0f), (f18 + f16) - lerp);
            Matrix matrix = esVar2.f28167b;
            if (esVar2.f28169e != lerp || esVar2.f28170f != min) {
                esVar2.f28169e = lerp;
                esVar2.f28170f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, lerp);
                LinearGradient linearGradient = esVar2.f28168c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                esVar2.invalidate();
            }
            this.G1.setAlpha(Math.max(f15, f17));
        }
    }

    public final int T3() {
        if (this.G) {
            return AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(81.0f);
        }
        return AndroidUtilities.dp(48.0f);
    }

    public final void T4(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fy.T4(boolean):void");
    }

    public final int U3() {
        if (this.G) {
            return AndroidUtilities.dp(81.0f);
        }
        return 0;
    }

    public final void U4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fy.U4():void");
    }

    public final float V3() {
        ax axVar = this.B3;
        if (axVar != null && axVar.c()) {
            return this.B3.f38759e;
        }
        return 0.0f;
    }

    public final void V4(boolean r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fy.V4(boolean, boolean):void");
    }

    public final float W3() {
        return -AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(48.0f), this.f38260b.f49505e);
    }

    public final void W4(boolean r11, java.util.ArrayList r12, java.util.ArrayList r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fy.W4(boolean, java.util.ArrayList, java.util.ArrayList, boolean, boolean):void");
    }

    public final lh.s6 X3() {
        return getMessagesController().getStoriesController();
    }

    public final void X4() {
        float f9 = (((-this.f38270c4) - this.f38287f4) - this.f38338q1) - this.f38344r1;
        org.telegram.ui.Components.u10 u10Var = this.f38332p0;
        if (u10Var != null) {
            u10Var.setTranslationY(f9);
        }
        org.telegram.ui.Components.u10 u10Var2 = this.f38337q0;
        if (u10Var2 != null) {
            u10Var2.setTranslationY(f9 - AndroidUtilities.dp(52.0f));
            nh.t3 t3Var = this.f38313l0;
            if (t3Var != null) {
                t3Var.setTranslationY(f9 - AndroidUtilities.dp(52.0f));
            }
        }
    }

    public final UndoView Y3() {
        N3();
        UndoView[] undoViewArr = this.f38358u0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.e(2, true);
            xx xxVar = (xx) this.fragmentView;
            xxVar.removeView(undoViewArr[0]);
            xxVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void Y4(boolean z10) {
        boolean z11;
        boolean z12 = this.f38295h2;
        if ((!z12 || this.N0 == 10) && this.R2 == 0 && this.T2 == 0 && !this.inPreviewMode && ((!this.f38285f2 || z12) && !this.Q3)) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.u10 u10Var = this.f38332p0;
        if (u10Var != null) {
            u10Var.e(z11, z10);
        }
        org.telegram.ui.Components.u10 u10Var2 = this.f38337q0;
        if (u10Var2 != null) {
            u10Var2.e(z11, z10);
        }
    }

    public final boolean Z3() {
        if (!this.f38295h2 && this.N0 == 0 && this.T2 == 0 && this.R2 == 0 && getMessagesController().hasHiddenArchive()) {
            return true;
        }
        return false;
    }

    public final void Z4(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        if (this.f38303j0 != null) {
            org.telegram.ui.ActionBar.w0 w0Var = this.f38298i0;
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
                if (!getDownloadController().hasUnviewedDownloads() && !z12 && (this.f38267c0.getVisibility() != 0 || this.f38267c0.getAlpha() != 1.0f || z11)) {
                    this.f38277e0 = false;
                } else {
                    this.f38277e0 = true;
                }
                x3();
                boolean z14 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i12 = this.Z1;
                z13 = (i12 == 3 || i12 == 5) ? true : true;
                org.telegram.ui.ActionBar.g1 g1Var = this.f38308k0;
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
                this.f38303j0.b(z14, z13, z10);
            }
        }
    }

    public final boolean a4() {
        ArrayList arrayList = this.f38383z2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void a5() {
        org.telegram.ui.Components.iq0 iq0Var;
        int i10;
        qw qwVar = this.f38373x1;
        ArrayList arrayList = this.E2;
        if (qwVar != null) {
            this.f38321n.a(!arrayList.isEmpty(), true);
            b5();
            if (arrayList.isEmpty()) {
                if (this.N0 == 3 && this.f38263b2 == null) {
                    i10 = R.string.ForwardTo;
                } else {
                    i10 = R.string.SelectChat;
                }
                String string = LocaleController.getString(i10);
                if (this.M3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(string);
                } else {
                    this.actionBar.I(string, true, 350L, org.telegram.ui.Components.jr.h);
                }
                if (this.f38373x1.getTag() != null) {
                    this.f38373x1.n0(false, false, false);
                    this.f38373x1.P();
                    this.f38373x1.setTag(null);
                    this.fragmentView.requestLayout();
                }
            } else {
                if (this.f38373x1.getTag() == null) {
                    if (!a4() && this.A2 == null) {
                        this.f38373x1.setFieldText("");
                    }
                    this.f38373x1.setTag(1);
                    if (!this.S3 && (iq0Var = this.C2) != null) {
                        this.S3 = true;
                        String string2 = LocaleController.getString(R.string.ShareTapToEditMedia);
                        iq0Var.j();
                        iq0Var.B = string2;
                        org.telegram.ui.Components.gq0 gq0Var = iq0Var.f29442a[0];
                        if (string2 != null) {
                            gq0Var.f28960e.l(string2, false);
                        }
                        org.telegram.ui.Components.xb0 xb0Var = new org.telegram.ui.Components.xb0(iq0Var, 29);
                        iq0Var.C = xb0Var;
                        AndroidUtilities.runOnUIThread(xb0Var, 1000L);
                    }
                }
                this.f38378y1.g(Math.max(1, arrayList.size()), true);
                int i11 = this.O0 + (!TextUtils.isEmpty(this.f38373x1.getFieldText()) ? 1 : 0);
                int size = arrayList.size();
                long j10 = 0;
                int i12 = 0;
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
                this.f38378y1.i(i11, j10, true);
                this.f38373x1.R1();
                if (this.M3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]));
                } else {
                    this.actionBar.I(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]), false, 350L, org.telegram.ui.Components.jr.h);
                }
            }
            this.M3 = arrayList.isEmpty();
        } else if (this.N0 == 10) {
            c4(arrayList.isEmpty());
        }
    }

    public final void b4(boolean z10) {
        int i10;
        boolean z11;
        this.actionBar.r();
        this.E2.clear();
        org.telegram.ui.ActionBar.h2 h2Var = this.f38257a1;
        if (h2Var != null) {
            h2Var.c(0.0f, true);
        }
        ew ewVar = this.f38362v0;
        if (ewVar != null) {
            ewVar.b(org.telegram.ui.ActionBar.g6.K8, org.telegram.ui.ActionBar.g6.I8, org.telegram.ui.ActionBar.g6.J8, org.telegram.ui.ActionBar.g6.L8, org.telegram.ui.ActionBar.g6.f23062d6);
        }
        ValueAnimator valueAnimator = this.f38340q3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f38340q3 = null;
        }
        if (this.f38335p3 == 0.0f) {
            return;
        }
        C4(-T3());
        int i11 = 0;
        while (true) {
            ey[] eyVarArr = this.f38256a0;
            if (i11 >= eyVarArr.length) {
                break;
            }
            ey eyVar = eyVarArr[i11];
            if (eyVar != null) {
                eyVar.f37921a.I0(true);
            }
            i11++;
        }
        if (this.G) {
            i10 = 81;
        } else {
            i10 = 0;
        }
        float max = Math.max(0.0f, AndroidUtilities.dp(i10 + 48) + this.J);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38335p3, 0.0f);
        this.f38340q3 = ofFloat;
        ofFloat.addUpdateListener(new lv(this, max, 1));
        this.f38340q3.addListener(new ix(this, max, 0));
        this.f38340q3.setInterpolator(org.telegram.ui.Components.jr.f29800f);
        this.f38340q3.setDuration(200L);
        this.f38340q3.start();
        this.U0 = false;
        ArrayList arrayList = this.W0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList.get(i12);
                p00.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
                i12++;
                arrayList = arrayList;
                size = size;
                obj = null;
            }
            arrayList.clear();
        }
        if (this.V0) {
            getMessagesController().reorderPinnedDialogs(this.R2, null, 0L);
            z11 = 0;
            this.V0 = false;
        } else {
            z11 = 0;
        }
        T4(true);
        if (this.f38256a0 != null) {
            int i13 = 0;
            while (true) {
                ey[] eyVarArr2 = this.f38256a0;
                if (i13 >= eyVarArr2.length) {
                    break;
                }
                eyVarArr2[i13].d.D = z11;
                i13++;
            }
        }
        int i14 = MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK;
        int i15 = z11;
        if (z10) {
            i15 = MessagesController.UPDATE_MASK_CHAT;
        }
        g5(i15 | i14, true);
    }

    public final void b5() {
        org.telegram.ui.Components.iq0 iq0Var = this.C2;
        if (iq0Var != null) {
            int i10 = this.currentAccount;
            iq0Var.h(i10);
            iq0Var.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
            ArrayList arrayList = iq0Var.f29446f;
            arrayList.clear();
            ArrayList arrayList2 = this.E2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            org.telegram.ui.Components.gq0 gq0Var = iq0Var.f29442a[0];
            if (iq0Var.f29443b == 1) {
                gq0Var.d.l(iq0Var.c(gq0Var), false);
            }
        }
    }

    public final void c4(boolean z10) {
        if (this.B3.c()) {
            z10 = true;
        }
        if (!z10 || !this.X1) {
            this.Q3 = z10;
            Y4(true);
            if (z10) {
                nh.t3 t3Var = this.f38313l0;
                if (t3Var != null) {
                    t3Var.e(true);
                }
                nh.t3 t3Var2 = this.m0;
                if (t3Var2 != null) {
                    t3Var2.e(true);
                }
            }
        }
    }

    public final void c5(boolean z10) {
        boolean z11;
        if (this.f38293h0 == null) {
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

    @Override
    public final boolean canBeginSlide() {
        ew ewVar;
        if (!this.B3.c()) {
            if (this.N0 == 3 && (ewVar = this.f38362v0) != null && ewVar.getVisibility() == 0 && this.f38362v0.G > 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean closeLastFragment() {
        if (this.B3.c()) {
            this.B3.a();
            ox oxVar = this.f38377y0;
            if (oxVar != null) {
                oxVar.R();
                return true;
            }
            return true;
        }
        return super.closeLastFragment();
    }

    @Override
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        cg.m1 m1Var = new cg.m1(this, context, this.resourceProvider, 4);
        m1Var.setAllowOverlayTitle(true);
        m1Var.K();
        m1Var.B(getThemedColor(org.telegram.ui.ActionBar.g6.f23348t8), false);
        m1Var.B(getThemedColor(org.telegram.ui.ActionBar.g6.f23452z8), true);
        m1Var.C(getThemedColor(org.telegram.ui.ActionBar.g6.f23385v8), false);
        m1Var.C(getThemedColor(org.telegram.ui.ActionBar.g6.y8), true);
        m1Var.k();
        m1Var.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        m1Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(3.0f));
        if (!this.inPreviewMode && (!AndroidUtilities.isTablet() || this.R2 == 0 || e4())) {
            return m1Var;
        }
        m1Var.setOccupyStatusBar(false);
        return m1Var;
    }

    @Override
    public final android.view.View createView(android.content.Context r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fy.createView(android.content.Context):android.view.View");
    }

    public final void d5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.n5 n5Var;
        xw xwVar = this.A0;
        org.telegram.ui.Components.n5 n5Var2 = null;
        if (xwVar != null && (n5Var = xwVar.T) != null && xwVar.m0 != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                n5Var.j(emojiStatusDocumentId.longValue(), z10);
                n5Var.m(user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible, z10);
            } else if (user != null && MessagesController.getInstance(xwVar.f16051f).isPremiumUser(user)) {
                if (xwVar.J0 == null) {
                    xwVar.J0 = xwVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    xwVar.J0 = new org.telegram.ui.Components.o5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), xwVar.J0);
                }
                xwVar.J0.setColorFilter(new PorterDuffColorFilter(xwVar.f(org.telegram.ui.ActionBar.g6.zh), PorterDuff.Mode.MULTIPLY));
                n5Var.g(xwVar.J0, z10);
                n5Var.m(false, z10);
            } else {
                n5Var.g(null, z10);
                n5Var.m(false, z10);
            }
            n5Var.k(Integer.valueOf(xwVar.f(org.telegram.ui.ActionBar.g6.zh)));
            xwVar.S.invalidate();
        }
        if (this.f38384z3 != null && this.actionBar != null) {
            Long emojiStatusDocumentId2 = UserObject.getEmojiStatusDocumentId(user);
            this.f38375x3 = null;
            if (emojiStatusDocumentId2 != null) {
                boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                this.f38384z3.j(emojiStatusDocumentId2.longValue(), z10);
                this.f38384z3.m(z11, z10);
                if (z11) {
                    this.f38375x3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
                }
                this.actionBar.setRightDrawableOnClick(new jv(this, 2));
                d61.t(this.currentAccount);
            } else if (user != null && MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
                if (this.H3 == null) {
                    this.H3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    this.H3 = new org.telegram.ui.Components.o5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.H3);
                }
                this.H3.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.zh), PorterDuff.Mode.MULTIPLY));
                this.f38384z3.g(this.H3, z10);
                this.f38384z3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(new jv(this, 3));
                d61.t(this.currentAccount);
            } else {
                this.f38384z3.g(null, z10);
                this.f38384z3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(null);
            }
            org.telegram.ui.Components.n5 n5Var3 = this.f38384z3;
            int i10 = org.telegram.ui.ActionBar.g6.zh;
            n5Var3.k(Integer.valueOf(getThemedColor(i10)));
            org.telegram.ui.Cells.o oVar = this.A3;
            if (oVar != null) {
                oVar.setColor(getThemedColor(i10));
            }
            cx cxVar = this.I0;
            if (cxVar != null && (cxVar.getContentView() instanceof d61)) {
                org.telegram.ui.ActionBar.h5 titleTextView = this.actionBar.getTitleTextView();
                d61 d61Var = (d61) this.I0.getContentView();
                if (titleTextView != null) {
                    Drawable rightDrawable = titleTextView.getRightDrawable();
                    org.telegram.ui.Components.n5 n5Var4 = this.f38384z3;
                    if (rightDrawable == n5Var4) {
                        n5Var2 = n5Var4;
                    }
                }
                d61Var.y(n5Var2, titleTextView);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r27, int r28, java.lang.Object... r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fy.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (!(dialog instanceof ph.p2) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final boolean e4() {
        if (this.R2 == 1) {
            return true;
        }
        return false;
    }

    public final void e5() {
        nh.t3 t3Var;
        boolean storiesEnabled = getMessagesController().storiesEnabled();
        if (this.K3 != storiesEnabled) {
            X4();
            if (!this.K3 && storiesEnabled && (t3Var = this.f38313l0) != null) {
                t3Var.v();
            }
            this.K3 = storiesEnabled;
        }
        org.telegram.ui.Components.u10 u10Var = this.f38332p0;
        if (u10Var == null) {
            return;
        }
        if (this.N0 == 10) {
            u10Var.setImageResource(R.drawable.floating_check);
            this.f38332p0.setContentDescription(LocaleController.getString(R.string.Done));
            return;
        }
        u10Var.setImageResource(R.drawable.filled_fab_compose_32);
        this.f38332p0.setContentDescription(LocaleController.getString(R.string.NewMessageTitle));
    }

    public final boolean f4(long j10) {
        if (j10 < 0) {
            return false;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        if (!UserObject.isBotForum(user)) {
            return false;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f22539id);
        if ((topics != null && !topics.isEmpty()) || !MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f22539id)) {
            return false;
        }
        return true;
    }

    public final void f5(boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        boolean z11;
        boolean z12;
        lh.s6 X3;
        ArrayList arrayList;
        boolean z13;
        boolean z14;
        int i10;
        float f9;
        float f10;
        if (this.A0 != null && this.E == null) {
            ax axVar = this.B3;
            if ((axVar == null || !axVar.c()) && !this.f38315l3 && (lVar = this.actionBar) != null && !lVar.s() && !this.f38295h2) {
                nh.gb gbVar = nh.gb.B2;
                int i11 = 0;
                if ((gbVar != null && gbVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().G0)) {
                    z10 = false;
                }
                if (!e4() && X3().G()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.T2 != 0) {
                    z12 = false;
                } else if (e4()) {
                    z12 = !X3().h.isEmpty();
                } else {
                    if (!z11 && (((arrayList = (X3 = X3()).f16223g) != null && arrayList.size() > 0) || X3.H())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z11 = X3().G();
                }
                this.H = z11;
                boolean z15 = this.C0;
                if (!z11 && !z12) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.C0 = z13;
                if (z12 || z13) {
                    xw xwVar = this.A0;
                    if (z13 != z15) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    xwVar.p(z10, z14);
                }
                boolean z16 = this.C0;
                int i12 = 8;
                float f11 = 0.0f;
                if (z16 != z15) {
                    if (z10) {
                        ValueAnimator valueAnimator = this.F;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        if (this.C0 && !isInPreviewMode()) {
                            this.A0.setVisibility(0);
                        }
                        float f12 = this.D0;
                        if (this.C0) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
                        this.F = ofFloat;
                        ofFloat.addUpdateListener(new ti(1, this));
                        this.F.addListener(new org.telegram.ui.Components.p11(this, 25));
                        this.F.setDuration(200L);
                        this.F.setInterpolator(org.telegram.ui.Components.jr.f29800f);
                        this.F.start();
                    } else {
                        xw xwVar2 = this.A0;
                        if (z16 && !isInPreviewMode()) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        xwVar2.setVisibility(i10);
                        if (this.C0) {
                            f9 = 1.0f;
                        } else {
                            f9 = 0.0f;
                        }
                        this.D0 = f9;
                        View view = this.fragmentView;
                        if (view != null) {
                            view.invalidate();
                        }
                    }
                }
                if (z12 != this.I) {
                    this.I = z12;
                    if (z12) {
                        this.A0.l(1.0f, false);
                    }
                    if (z10 && !isInPreviewMode()) {
                        this.A0.setVisibility(0);
                        float f13 = -this.J;
                        if (!z12) {
                            f11 = T3();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.E = ofFloat2;
                        ofFloat2.addUpdateListener(new nx(this, f13, z12, f11));
                        this.E.addListener(new gx(this, z12, 2));
                        this.E.setDuration(200L);
                        this.E.setInterpolator(org.telegram.ui.Components.jr.f29800f);
                        this.E.start();
                        return;
                    }
                    this.G = z12;
                    xw xwVar3 = this.A0;
                    if ((z12 || this.H) && !isInPreviewMode()) {
                        i12 = 0;
                    }
                    xwVar3.setVisibility(i12);
                    if (!z12) {
                        C4(0.0f);
                    } else {
                        this.f38357t3 = -AndroidUtilities.dp(81.0f);
                        C4(-T3());
                    }
                    while (true) {
                        ey[] eyVarArr = this.f38256a0;
                        if (i11 >= eyVarArr.length) {
                            break;
                        }
                        ey eyVar = eyVarArr[i11];
                        if (eyVar != null) {
                            eyVar.f37921a.requestLayout();
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
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.j70 j70Var = this.H0;
        if (j70Var != null) {
            j70Var.u();
        }
    }

    public final boolean g4(TLRPC.Dialog dialog) {
        char c3;
        if (dialog == null) {
            return false;
        }
        int i10 = this.f38256a0[0].f37928s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.s() || this.actionBar.t(null))) {
            MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
            if (this.f38256a0[0].f37928s == 8) {
                c3 = 1;
            } else {
                c3 = 0;
            }
            dialogFilter = dialogFilterArr[c3];
        }
        if (dialogFilter != null) {
            if (dialogFilter.pinnedDialogs.indexOfKey(dialog.f22396id) < 0) {
                return false;
            }
            return true;
        }
        return dialog.pinned;
    }

    public final void g5(int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fy.g5(int, boolean):void");
    }

    @Override
    public final org.telegram.ui.ActionBar.x4 getBackButtonState() {
        if (!e4() && !this.B3.f38760f) {
            return org.telegram.ui.ActionBar.x4.f23969b;
        }
        return org.telegram.ui.ActionBar.x4.f23968a;
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f9) {
        int i10;
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T3, 1.0f);
            this.W3 = ofFloat;
            return ofFloat;
        }
        if (getLayoutContainer() != null && getLayoutContainer().getMeasuredWidth() > 0) {
            i10 = (int) Utilities.clamp((200.0f / getLayoutContainer().getMeasuredWidth()) * f9, 200.0f, 80.0f);
        } else {
            i10 = 150;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.T3, 1.0f);
        this.W3 = ofFloat2;
        ofFloat2.addUpdateListener(new gv(this, 2));
        this.W3.setInterpolator(org.telegram.ui.Components.jr.f29801g);
        this.W3.setDuration(i10);
        this.W3.start();
        return this.W3;
    }

    @Override
    public final java.util.ArrayList getThemeDescriptions() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fy.getThemeDescriptions():java.util.ArrayList");
    }

    public final boolean h4() {
        if (this.f38379y2 == null && this.f38305j2 == null) {
            return true;
        }
        return false;
    }

    public final boolean h5(long j10) {
        TLRPC.Chat chat;
        qw qwVar;
        if ((this.O0 <= 1 && ((qwVar = this.f38373x1) == null || qwVar.getVisibility() != 0 || TextUtils.isEmpty(this.f38373x1.getFieldText()))) || !DialogObject.isChatDialog(j10) || (chat = getMessagesController().getChat(Long.valueOf(-j10))) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.c5.u0(this, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null);
        return false;
    }

    public final boolean i3(long j10, View view) {
        if (this.f38295h2 && getMessagesController().isForum(j10)) {
            return false;
        }
        Long valueOf = Long.valueOf(j10);
        ArrayList arrayList = this.E2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j10));
            if (view instanceof org.telegram.ui.Cells.p2) {
                ((org.telegram.ui.Cells.p2) view).V(false, true);
            } else if (view instanceof org.telegram.ui.Cells.f6) {
                ((org.telegram.ui.Cells.f6) view).s(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j10));
        if (view instanceof org.telegram.ui.Cells.p2) {
            ((org.telegram.ui.Cells.p2) view).V(true, true);
        } else if (view instanceof org.telegram.ui.Cells.f6) {
            ((org.telegram.ui.Cells.f6) view).s(true, true);
        }
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        ax axVar;
        if (!this.f38285f2 && (axVar = this.B3) != null && axVar.getFragment() != null) {
            return this.B3.getFragment().isLightStatusBar();
        }
        if (i0.a.f(getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j3(rf.f0 f0Var) {
        ox oxVar;
        if (this.f38315l3 && (oxVar = this.f38377y0) != null) {
            ArrayList arrayList = oxVar.f33009w0;
            if (!arrayList.isEmpty()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (f0Var.b((rf.f0) arrayList.get(i10))) {
                        return;
                    }
                }
            }
            arrayList.add(f0Var);
            ux uxVar = this.T;
            ArrayList arrayList2 = uxVar.B;
            arrayList2.add(f0Var);
            uxVar.E = arrayList2.size() - 1;
            uxVar.f();
            this.T.f34546r.getText().clear();
            W4(true, null, null, false, true);
        }
    }

    public final void j4(long r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fy.j4(long):void");
    }

    public final void k3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            ArrayList arrayList = new ArrayList();
            if (this.R2 == 0 && this.T2 == 0 && Build.VERSION.SDK_INT >= 33 && nj0.n(parentActivity)) {
                if (z10) {
                    showDialog(new nj0(parentActivity, !org.telegram.ui.Components.yd0.c(), new tv(parentActivity, 1)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            if (getUserConfig().syncContacts && this.Q1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z10) {
                    org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.c5.w(parentActivity, new nv(this, 1)).f22714a;
                    this.P1 = c2Var;
                    showDialog(c2Var);
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
                if (this.f38367w0) {
                    this.f38367w0 = false;
                    J4();
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

    public final boolean k4(org.telegram.tgnet.TLRPC.Chat r6, org.telegram.tgnet.TLRPC.User r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fy.k4(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):boolean");
    }

    public final void l3(CharSequence charSequence) {
        int i10;
        if (this.f38373x1 != null) {
            if (this.f38383z2 == null && this.A2 == null && this.B2 == null) {
                return;
            }
            if (this.C2 == null) {
                org.telegram.ui.Components.iq0 iq0Var = new org.telegram.ui.Components.iq0(getParentActivity(), getResourceProvider());
                this.C2 = iq0Var;
                iq0Var.setLayoutClickListener(new jv(this, 0));
                this.C2.setOnModeChangeListener(new kv(this, 0));
                qw qwVar = this.f38373x1;
                org.telegram.ui.Components.iq0 iq0Var2 = this.C2;
                if (iq0Var2 == null) {
                    qwVar.getClass();
                } else {
                    qwVar.B1 = iq0Var2;
                    qwVar.addView(iq0Var2, 0, i7.f6.e(-1, 48, 51));
                    qwVar.f26096b3 = false;
                    qwVar.M();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.C2.getLayoutParams();
                layoutParams.rightMargin = -this.f38373x1.getPaddingRight();
                this.C2.setLayoutParams(layoutParams);
            }
            if (a4()) {
                this.C2.i(this.currentAccount, this.f38383z2);
            } else {
                String str = this.A2;
                if (str != null) {
                    org.telegram.ui.Components.iq0 iq0Var3 = this.C2;
                    iq0Var3.g(this.currentAccount);
                    if (!str.isEmpty()) {
                        iq0Var3.e(str, true);
                    }
                } else {
                    CharSequence charSequence2 = this.B2;
                    if (charSequence2 != null) {
                        org.telegram.ui.Components.iq0 iq0Var4 = this.C2;
                        iq0Var4.g(this.currentAccount);
                        if (charSequence2.length() > 0) {
                            iq0Var4.e(charSequence2, true);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.f38373x1.setFieldText(charSequence);
            }
            qw qwVar2 = this.f38373x1;
            if (a4()) {
                i10 = R.string.AddCaption;
            } else {
                i10 = R.string.ShareComment;
            }
            qwVar2.setOverrideHint(LocaleController.getString(i10));
            v3();
            if (this.C2.getMode() != 0) {
                this.f38373x1.x1(false, false);
            }
            b5();
        }
    }

    public final boolean l4(TLRPC.User user) {
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.C;
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

    public final void m3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fy.m3():void");
    }

    public final void m4(View view) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        String str = null;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(getParentActivity(), null, false, false);
        f3Var.fixNavigationBar();
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
        iv ivVar = new iv(this, 0);
        f3Var.items = charSequenceArr;
        f3Var.itemIcons = iArr;
        f3Var.onClickListener = ivVar;
        showDialog(f3Var);
    }

    public final int n3() {
        if (this.f38373x1 != null) {
            return (int) (this.f38359u1.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(2.0f));
        } else if (this.T2 != 0) {
            return AndroidUtilities.dp(72.0f) + this.f38270c4;
        } else {
            return this.f38270c4 + this.f38281e4;
        }
    }

    public final void n4(android.view.View r25, int r26, f2.p0 r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fy.n4(android.view.View, int, f2.p0):void");
    }

    public final void o3() {
        AndroidUtilities.runOnUIThread(new ev(this, 2), 300L);
    }

    public final boolean o4(View view, int i10, float f9, org.telegram.ui.Components.il0 il0Var) {
        org.telegram.ui.Components.mn0 mn0Var;
        long j10;
        org.telegram.ui.Components.mn0 mn0Var2;
        TLRPC.EncryptedChat encryptedChat;
        long makeEncryptedDialogId;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.x2) && il0Var.j(i10) != 21) {
            if (!this.actionBar.s() && !AndroidUtilities.isTablet() && !this.f38295h2 && (view instanceof org.telegram.ui.Cells.p2)) {
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                if (!getMessagesController().isForum(p2Var.getDialogId()) && !this.B3.c() && p2Var.S(f9)) {
                    return H4(p2Var);
                }
            }
            ax axVar = this.B3;
            if (axVar == null || !axVar.c()) {
                ox oxVar = this.f38377y0;
                boolean z10 = true;
                if (oxVar != null && il0Var == (mn0Var2 = oxVar.U)) {
                    Object J = mn0Var2.J(i10);
                    if (!this.f38377y0.U.J) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                        c2Var.N = string;
                        if (J instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) J;
                            if (chat.monoforum) {
                                c2Var.P = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, yf.d.i(chat, this.currentAccount, false));
                            } else {
                                c2Var.P = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, chat.title);
                            }
                            makeEncryptedDialogId = -chat.f22392id;
                        } else if (J instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) J;
                            if (user.f22539id == getUserConfig().clientUserId) {
                                c2Var.P = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, LocaleController.getString(R.string.SavedMessages));
                            } else {
                                c2Var.P = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user.first_name, user.last_name));
                            }
                            makeEncryptedDialogId = user.f22539id;
                        } else if (J instanceof TLRPC.EncryptedChat) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(((TLRPC.EncryptedChat) J).user_id));
                            c2Var.P = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user2.first_name, user2.last_name));
                            makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.f22400id);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new f3.e(this, makeEncryptedDialogId, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        showDialog(c2Var);
                        TextView textView = (TextView) c2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23295q7));
                        }
                        return true;
                    }
                }
                ox oxVar2 = this.f38377y0;
                if (oxVar2 != null && il0Var == (mn0Var = oxVar2.U)) {
                    if (this.f38295h2) {
                        n4(view, i10, il0Var);
                        return false;
                    }
                    if ((view instanceof org.telegram.ui.Cells.f6) && !mn0Var.O(i10)) {
                        j10 = ((org.telegram.ui.Cells.f6) view).getDialogId();
                    } else {
                        j10 = 0;
                    }
                    if (j10 != 0) {
                        M4(j10, view);
                        return true;
                    }
                } else {
                    Object I = ((rf.l) il0Var).I(i10);
                    if (I instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) I;
                        if (this.f38295h2) {
                            if ((this.N0 == 3 || I3()) && h5(dialog.f22396id)) {
                                if (this.N0 == 1 && I3() && this.f38300i2 && getMessagesController().isForum(dialog.f22396id)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -dialog.f22396id);
                                    bundle.putBoolean("for_select", true);
                                    bundle.putBoolean("forward_to", true);
                                    if (this.N0 != 1) {
                                        z10 = false;
                                    }
                                    bundle.putBoolean("bot_share_to", z10);
                                    bundle.putBoolean("quote", this.K0);
                                    bundle.putBoolean("reply_to", this.J0);
                                    ze1 ze1Var = new ze1(bundle);
                                    ze1Var.H0 = this;
                                    presentFragment(ze1Var);
                                    return false;
                                }
                                i3(dialog.f22396id, view);
                                a5();
                                return true;
                            }
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                            m4(view);
                            return false;
                        } else if (!this.actionBar.s() || !g4(dialog)) {
                            M4(dialog.f22396id, view);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else if (this.B3.c() && this.B3.getFragment().onBackPressed(z10)) {
            if (z10) {
                this.B3.a();
                ox oxVar = this.f38377y0;
                if (oxVar != null) {
                    oxVar.R();
                    return false;
                }
            }
        } else {
            org.telegram.ui.Components.j70 j70Var = this.H0;
            if (j70Var != null) {
                if (z10) {
                    j70Var.u();
                    this.H0 = null;
                    return false;
                }
            } else {
                ew ewVar = this.f38362v0;
                if (ewVar != null && ewVar.f28243n) {
                    if (z10) {
                        ewVar.setIsEditing(false);
                        I4(false);
                        return false;
                    }
                } else {
                    org.telegram.ui.ActionBar.l lVar = this.actionBar;
                    if (lVar != null && lVar.s()) {
                        if (z10) {
                            ox oxVar2 = this.f38377y0;
                            if (oxVar2 != null && oxVar2.getVisibility() == 0) {
                                this.f38377y0.Q(false);
                            }
                            b4(true);
                            return false;
                        }
                    } else if (this.f38260b.f49506f) {
                        if (z10) {
                            this.T.f34546r.getText().clear();
                            this.U.b(false);
                            this.T.f34546r.clearFocus();
                            return false;
                        }
                    } else {
                        ew ewVar2 = this.f38362v0;
                        if (ewVar2 != null && ewVar2.getVisibility() == 0 && !this.c3) {
                            ew ewVar3 = this.f38362v0;
                            if (!ewVar3.K && !this.f38296h3) {
                                ArrayList arrayList = ewVar3.h;
                                if (!arrayList.isEmpty() && ewVar3.H != ((org.telegram.ui.Components.c00) arrayList.get(0)).f27251a) {
                                    if (z10) {
                                        ew ewVar4 = this.f38362v0;
                                        ArrayList arrayList2 = ewVar4.h;
                                        if (!arrayList2.isEmpty()) {
                                            ewVar4.f((org.telegram.ui.Components.c00) arrayList2.get(0), 0);
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        qw qwVar = this.f38373x1;
                        if (qwVar != null && qwVar.t0()) {
                            if (z10) {
                                this.f38373x1.m0(true);
                            }
                        } else {
                            xw xwVar = this.A0;
                            if (xwVar.K == 0 && xwVar.O.L0() != 0) {
                                xwVar.h.x0(0);
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
        cg.h0 h0Var;
        ew ewVar;
        if (this.R1) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.h(true);
            }
            TLObject tLObject = this.T1;
            if (tLObject != null) {
                ox oxVar = this.f38377y0;
                if (oxVar != null) {
                    oxVar.U.R(this.S1, tLObject);
                }
                this.T1 = null;
            }
            this.R1 = false;
        }
        if (!this.G && (ewVar = this.f38362v0) != null && ewVar.getVisibility() == 0 && this.f38342r.f49506f) {
            int i10 = (int) (-this.J);
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            if (i10 != 0 && i10 != currentActionBarHeight && i10 >= currentActionBarHeight / 2) {
                this.f38256a0[0].f37921a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.f38358u0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        if (!isInPreviewMode() && (h0Var = this.G0) != null && h0Var.getVisibility() == 0) {
            this.G0.setVisibility(8);
            this.G0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        B3();
        this.f38322n0 = true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        nh.t3 t3Var;
        super.onBecomeFullyVisible();
        if (e4()) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z10 = globalMainSettings.getBoolean("archivehint", true);
            boolean isEmpty = R3(this.currentAccount, this.N0, this.R2, false).isEmpty();
            if (z10 && isEmpty) {
                MessagesController.getGlobalMainSettings().edit().putBoolean("archivehint", false).commit();
                z10 = false;
            }
            if (z10) {
                globalMainSettings.edit().putBoolean("archivehint", false).commit();
                G4();
            }
        }
        if (this.f38322n0 && !this.f38327o0 && (t3Var = this.f38313l0) != null && this.K3) {
            this.f38327o0 = true;
            this.f38322n0 = false;
            t3Var.v();
        }
        AndroidUtilities.runOnUIThread(new vv(this, 3), 200L);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.j70 j70Var = this.H0;
        if (j70Var != null) {
            j70Var.u();
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.c2 c2Var;
        super.onDialogDismiss(dialog);
        if (this.R2 == 0 && this.T2 == 0 && (c2Var = this.P1) != null && dialog == c2Var && getParentActivity() != null) {
            k3(false);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10;
        super.onFragmentCreate();
        Bundle bundle = this.arguments;
        int i11 = 0;
        if (bundle != null) {
            this.f38295h2 = bundle.getBoolean("onlySelect", false);
            this.f38300i2 = this.arguments.getBoolean("canSelectTopics", false);
            this.f38318m2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.N0 = this.arguments.getInt("dialogsType", 0);
            this.K0 = this.arguments.getBoolean("quote", false);
            this.J0 = this.arguments.getBoolean("reply_to", false);
            this.L0 = this.arguments.getLong("reply_to_author", 0L);
            this.M0 = this.arguments.getLong("forward_into_channel", 0L);
            this.f38263b2 = this.arguments.getString("selectAlertString");
            this.f38269c2 = this.arguments.getString("selectAlertStringGroup");
            this.f38273d2 = this.arguments.getString("addToGroupAlertString");
            this.f38324n2 = this.arguments.getBoolean("allowSwitchAccount");
            this.f38329o2 = this.arguments.getBoolean("checkCanWrite", true);
            this.f38334p2 = this.arguments.getBoolean("afterSignup", false);
            this.R2 = this.arguments.getInt("folderId", 0);
            long j10 = this.arguments.getLong("community_id", 0L);
            this.T2 = j10;
            if (j10 != 0) {
                this.U2 = getMessagesController().getChat(Long.valueOf(this.T2));
                this.V2 = getMessagesController().getChatFull(this.T2);
            }
            this.f38279e2 = this.arguments.getBoolean("resetDelegate", true);
            this.O0 = this.arguments.getInt("messagesCount", 0);
            this.P0 = this.arguments.getInt("hasPoll", 0);
            this.Q0 = this.arguments.getBoolean("hasInvoice", false);
            this.f38339q2 = this.arguments.getBoolean("showSetPasswordConfirm", this.f38339q2);
            this.arguments.getInt("otherwiseRelogin");
            this.f38345r2 = this.arguments.getBoolean("allowGroups", true);
            this.f38351s2 = this.arguments.getBoolean("allowMegagroups", true);
            this.f38356t2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.f38360u2 = this.arguments.getBoolean("allowChannels", true);
            this.f38364v2 = this.arguments.getBoolean("allowUsers", true);
            this.f38369w2 = this.arguments.getBoolean("allowBots", true);
            this.f38374x2 = this.arguments.getBoolean("closeFragment", true);
            this.B = this.arguments.getBoolean("allowGlobalSearch", true);
            this.S = this.arguments.getBoolean("hasMainTabs", false);
            byte[] byteArray = this.arguments.getByteArray("requestPeerType");
            if (byteArray != null) {
                try {
                    SerializedData serializedData = new SerializedData(byteArray);
                    this.C = TLRPC.RequestPeerType.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    serializedData.cleanup();
                } catch (Exception unused) {
                }
            }
            this.D = this.arguments.getLong("requestPeerBotId", 0L);
        }
        if (this.N0 == 0) {
            this.Q1 = MessagesController.getGlobalNotificationsSettings().getBoolean("askAboutContacts", true);
            SharedConfig.loadProxyList();
        }
        this.F3 = getNotificationCenter().createObserversGroup(this);
        this.G3 = NotificationCenter.getGlobalInstance().createObserversGroup(this);
        if (this.f38305j2 == null) {
            this.Z1 = getConnectionsManager().getConnectionState();
            this.G3.add(NotificationCenter.emojiLoaded);
            if (!this.f38295h2) {
                this.G3.add(NotificationCenter.closeSearchByActiveAction);
                this.G3.add(NotificationCenter.proxySettingsChanged);
                this.F3.add(NotificationCenter.filterSettingsUpdated);
                this.F3.add(NotificationCenter.dialogsUnreadCounterChanged);
            }
            this.F3.add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.dialogFiltersUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.encryptedChatUpdated).add(NotificationCenter.contactsDidLoad).add(NotificationCenter.appDidLogout).add(NotificationCenter.openedChatChanged).add(NotificationCenter.notificationsSettingsUpdated).add(NotificationCenter.messageReceivedByAck).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messageSendError).add(NotificationCenter.needReloadRecentDialogsSearch).add(NotificationCenter.replyMessagesDidLoad).add(NotificationCenter.topicsDidLoaded).add(NotificationCenter.reloadHints).add(NotificationCenter.didUpdateConnectionState).add(NotificationCenter.onDownloadingFilesChanged).add(NotificationCenter.needDeleteDialog).add(NotificationCenter.folderBecomeEmpty).add(NotificationCenter.newSuggestionsAvailable).add(NotificationCenter.dialogsUnreadReactionsCounterChanged).add(NotificationCenter.dialogsUnreadPollVotesCounterChanged).add(NotificationCenter.forceImportContactsStart).add(NotificationCenter.userEmojiStatusUpdated).add(NotificationCenter.currentUserPremiumStatusChanged);
            this.G3.add(NotificationCenter.didSetPasscode);
        }
        this.F3.add(NotificationCenter.messagesDeleted).add(NotificationCenter.onDatabaseMigration).add(NotificationCenter.onDatabaseOpened).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.didClearDatabase).add(NotificationCenter.onDatabaseReset).add(NotificationCenter.storiesUpdated).add(NotificationCenter.storiesEnabledUpdate).add(NotificationCenter.unconfirmedAuthUpdate).add(NotificationCenter.premiumPromoUpdated).add(NotificationCenter.starBalanceUpdated).add(NotificationCenter.starSubscriptionsLoaded).add(NotificationCenter.communityPendingRequestsUpdate).add(NotificationCenter.communitySwitchedCollapsed).add(NotificationCenter.appConfigUpdated).add(NotificationCenter.activeAuctionsUpdated);
        if (this.N0 == 0) {
            this.F3.add(NotificationCenter.chatlistFolderUpdate);
            this.F3.add(NotificationCenter.dialogTranslate);
        }
        i4(getAccountInstance());
        lh.s6 storiesController = getMessagesController().getStoriesController();
        if (!storiesController.A) {
            storiesController.T();
            if (!storiesController.f16234s) {
                ConnectionsManager.getInstance(storiesController.f16218a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new lh.r5(storiesController, 0));
            }
        }
        getMessagesController().loadPinnedDialogs(this.R2, 0L, null);
        if (this.N3 != null && !getMessagesStorage().isDatabaseMigrationInProgress()) {
            ru ruVar = this.N3;
            if (ruVar.getParent() != null) {
                ((ViewGroup) ruVar.getParent()).removeView(ruVar);
            }
            this.N3 = null;
        }
        if (e4()) {
            lh.s6 storiesController2 = getMessagesController().getStoriesController();
            if (storiesController2.f16240z) {
                storiesController2.Q(true);
            }
        } else {
            getMessagesController().getStoriesController().T();
        }
        getContactsController().loadGlobalPrivacySetting();
        if (getMessagesController().savedViewAsChats) {
            getMessagesController().getSavedMessagesController().preloadDialogs(true);
        }
        if (this.T2 != 0) {
            getMessagesController().loadFullChat(this.T2, 0, true);
        }
        BirthdayController.getInstance(this.currentAccount).check();
        if (this.S) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.f38281e4 = i10;
        if (this.S) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.f38287f4 = i11;
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.ObserversGroup observersGroup = this.F3;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.F3 = null;
        }
        NotificationCenter.ObserversGroup observersGroup2 = this.G3;
        if (observersGroup2 != null) {
            observersGroup2.removeAllObservers();
            this.G3 = null;
        }
        qw qwVar = this.f38373x1;
        if (qwVar != null) {
            qwVar.B0();
        }
        org.telegram.ui.Components.iq0 iq0Var = this.C2;
        if (iq0Var != null) {
            iq0Var.j();
        }
        org.telegram.ui.Components.voip.o oVar = this.D2;
        if (oVar != null) {
            AndroidUtilities.cancelRunOnUIThread(oVar);
            this.D2 = null;
        }
        UndoView undoView = this.f38358u0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f38311k3.unlock();
        this.f38379y2 = null;
        ba1 ba1Var = ba1.f36756b;
        if (ba1Var != null) {
            ba1Var.dismiss();
            ba1.f36756b = null;
        }
    }

    @Override
    public final void onPanTranslationUpdate(float f9) {
        if (this.f38256a0 != null) {
            this.F0 = f9;
            qw qwVar = this.f38373x1;
            int i10 = 0;
            if (qwVar != null && qwVar.t0()) {
                this.fragmentView.setTranslationY(f9);
                while (true) {
                    ey[] eyVarArr = this.f38256a0;
                    if (i10 >= eyVarArr.length) {
                        break;
                    }
                    eyVarArr[i10].setTranslationY(0.0f);
                    i10++;
                }
                if (!this.f38295h2) {
                    this.actionBar.setTranslationY(0.0f);
                    org.telegram.ui.Components.mc mcVar = this.f38306j3;
                    if (mcVar != null) {
                        mcVar.l();
                    }
                }
                ox oxVar = this.f38377y0;
                if (oxVar != null) {
                    oxVar.setTranslationY(this.E0);
                    return;
                }
                return;
            }
            while (true) {
                ey[] eyVarArr2 = this.f38256a0;
                if (i10 >= eyVarArr2.length) {
                    break;
                }
                eyVarArr2[i10].setTranslationY(f9);
                i10++;
            }
            if (!this.f38295h2) {
                this.actionBar.setTranslationY(f9);
                org.telegram.ui.Components.mc mcVar2 = this.f38306j3;
                if (mcVar2 != null) {
                    mcVar2.l();
                }
            }
            ox oxVar2 = this.f38377y0;
            if (oxVar2 != null) {
                oxVar2.setTranslationY(this.F0 + this.E0);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.mc mcVar = this.O;
        if (mcVar != null) {
            mcVar.b();
            this.O = null;
        }
        ax axVar = this.B3;
        if (axVar != null) {
            axVar.f38762r = true;
            hx hxVar = axVar.f38756a;
            if (hxVar != null) {
                hxVar.onPause();
            }
        }
        org.telegram.ui.Components.j70 j70Var = this.H0;
        if (j70Var != null) {
            j70Var.u();
        }
        qw qwVar = this.f38373x1;
        if (qwVar != null) {
            qwVar.D0();
        }
        int i10 = 0;
        UndoView undoView = this.f38358u0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        setBulletinDelegate(null);
        if (this.f38256a0 == null) {
            return;
        }
        while (true) {
            ey[] eyVarArr = this.f38256a0;
            if (i10 < eyVarArr.length) {
                eyVarArr[i10].d.getClass();
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
                    char c3 = 65535;
                    switch (str.hashCode()) {
                        case -1925850455:
                            if (str.equals("android.permission.POST_NOTIFICATIONS")) {
                                c3 = 0;
                                break;
                            }
                            break;
                        case 1365911975:
                            if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case 1977429404:
                            if (str.equals("android.permission.READ_CONTACTS")) {
                                c3 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c3) {
                        case 0:
                            if (iArr[i11] == 0) {
                                NotificationsController.getInstance(this.currentAccount).showNotifications();
                                break;
                            } else {
                                nj0.m();
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
                                AndroidUtilities.runOnUIThread(new vv(this, 2));
                                getContactsController().forceImportContacts();
                                continue;
                            } else {
                                SharedPreferences.Editor edit = MessagesController.getGlobalNotificationsSettings().edit();
                                this.Q1 = false;
                                edit.putBoolean("askAboutContacts", false).commit();
                                break;
                            }
                    }
                }
            }
            if (this.f38367w0) {
                this.f38367w0 = false;
                J4();
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
        fy fyVar;
        ey eyVar;
        nw nwVar;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.Components.mn0 mn0Var;
        cg.h0 h0Var;
        super.onResume();
        xw xwVar = this.A0;
        char c3 = 0;
        if (xwVar != null) {
            ArrayList arrayList = xwVar.f16073x;
            lh.s6 s6Var = xwVar.f16066s;
            s6Var.l(s6Var.f16223g);
            s6Var.l(s6Var.h);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TL_stories.PeerStories y8 = s6Var.y(((lh.m) arrayList.get(i11)).f15916c);
                if (y8 != null) {
                    s6Var.X(y8);
                }
            }
        }
        ax axVar = this.B3;
        if (axVar != null) {
            axVar.f38762r = false;
            hx hxVar = axVar.f38756a;
            if (hxVar != null) {
                hxVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (h0Var = this.G0) != null && h0Var.getVisibility() == 0) {
            this.G0.setVisibility(8);
            this.G0.setBackground(null);
        }
        if (this.f38256a0 != null) {
            int i12 = 0;
            while (true) {
                ey[] eyVarArr = this.f38256a0;
                if (i12 >= eyVarArr.length) {
                    break;
                }
                eyVarArr[i12].d.l();
                i12++;
            }
        }
        qw qwVar = this.f38373x1;
        if (qwVar != null) {
            qwVar.E0();
        }
        long j10 = 0;
        if (!this.f38295h2 && this.R2 == 0 && this.T2 == 0) {
            getMediaDataController().checkStickers(4);
        }
        ox oxVar = this.f38377y0;
        if (oxVar != null && (mn0Var = oxVar.U) != null) {
            mn0Var.l();
        }
        if (!this.f38334p2 && getUserConfig().unacceptedTermsOfService != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.R2 == 0 && this.T2 == 0 && this.Y1 && !this.f38295h2 && (i10 = Build.VERSION.SDK_INT) >= 23) {
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.Y1 = false;
                if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i10 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                fyVar = this;
                org.telegram.messenger.m1 m1Var = new org.telegram.messenger.m1(fyVar, z13, z11, z12, parentActivity);
                if (fyVar.f38334p2 && (z11 || z13)) {
                    j10 = 4000;
                }
                AndroidUtilities.runOnUIThread(m1Var, j10);
            } else {
                fyVar = this;
            }
        } else {
            fyVar = this;
            if (!fyVar.f38295h2 && fyVar.R2 == 0 && fyVar.T2 == 0 && XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(10020)) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutMiuiLockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.g6.L5), null);
                        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.PermissionXiaomiLockscreen);
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new kv(this, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.xo0(15));
                        showDialog(alertDialog$Builder.f22714a);
                    }
                } else {
                    return;
                }
            } else if (fyVar.R2 == 0 && fyVar.T2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutFSILockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder2.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.g6.L5), null);
                        alertDialog$Builder2.f22714a.P = LocaleController.getString(R.string.PermissionFSILockscreen);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new kv(this, 9));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.xo0(16));
                        showDialog(alertDialog$Builder2.f22714a);
                    }
                } else {
                    return;
                }
            }
        }
        J4();
        if (fyVar.f38256a0 != null) {
            int i13 = 0;
            while (true) {
                ey[] eyVarArr2 = fyVar.f38256a0;
                if (i13 >= eyVarArr2.length) {
                    break;
                }
                ey eyVar2 = eyVarArr2[i13];
                if (eyVar2.f37928s == 0 && eyVar2.v == 2 && eyVar2.f37923c.L0() == 0 && Z3()) {
                    fyVar.f38256a0[i13].f37923c.h1(1, (int) fyVar.J);
                }
                if (i13 == 0) {
                    fyVar.f38256a0[i13].d.getClass();
                } else {
                    fyVar.f38256a0[i13].d.getClass();
                }
                i13++;
            }
        }
        L4();
        setBulletinDelegate(new w8(this, 4));
        if (fyVar.f38315l3) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), fyVar.classGuid);
        }
        g5(0, false);
        Z4(false, true);
        f5(false);
        if (getMessagesStorage().showClearDatabaseAlert) {
            getMessagesStorage().showClearDatabaseAlert = false;
            ba1.n(this);
        }
        B3();
        if (fyVar.f38362v0 != null && (eyVar = fyVar.f38256a0[0]) != null && (nwVar = eyVar.d) != null) {
            int i14 = nwVar.h;
            if (i14 == 7 || i14 == 8) {
                MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
                if (i14 != 7) {
                    c3 = 1;
                }
                MessagesController.DialogFilter dialogFilter = dialogFilterArr[c3];
                if (dialogFilter != null) {
                    fyVar.f38362v0.h(dialogFilter.localId);
                }
            }
        }
    }

    @Override
    public final void onSlideProgress(boolean z10, float f9) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.V3 && this.W3 == null) {
            F4(f9);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        cg.h0 h0Var;
        fy fyVar;
        ax axVar = this.B3;
        if (axVar != null && axVar.c()) {
            this.B3.getFragment().onTransitionAnimationEnd(z10, z11);
        } else {
            if (z10 && (h0Var = this.G0) != null && h0Var.getVisibility() == 0) {
                this.G0.setVisibility(8);
                this.G0.setBackground(null);
            }
            if (z10 && this.f38334p2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).f35599t0.c(false);
                }
            }
        }
        if (!z10 && (fyVar = this.S2) != null) {
            fyVar.removeSelfFromStack();
        }
        B3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f9) {
        ax axVar = this.B3;
        if (axVar != null && axVar.c()) {
            this.B3.getFragment().onTransitionAnimationProgress(z10, f9);
        } else {
            cg.h0 h0Var = this.G0;
            if (h0Var != null && h0Var.getVisibility() == 0) {
                if (z10) {
                    this.G0.setAlpha(1.0f - f9);
                } else {
                    this.G0.setAlpha(f9);
                }
            }
        }
        B3();
    }

    public final boolean p3(long j10) {
        int i10;
        int i11 = this.N0;
        if (i11 != 15 && i11 != 16 && this.f38273d2 == null && this.f38329o2) {
            if (DialogObject.isChatDialog(j10)) {
                long j11 = -j10;
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j11));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    if (this.f38318m2 || !ChatObject.isCanWriteToChannel(j11, this.currentAccount) || (i10 = this.P0) == 2 || i10 == 3) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.SendMessageTitle);
                        int i12 = this.P0;
                        if (i12 == 3) {
                            alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.TodoCantForward);
                        } else if (i12 == 2) {
                            alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.PublicPollCantForward);
                        } else {
                            alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ChannelCantSendMessage);
                        }
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        showDialog(alertDialog$Builder.f22714a);
                        return false;
                    }
                    return true;
                }
                return true;
            } else if (DialogObject.isEncryptedDialog(j10)) {
                if (this.P0 != 0 || this.Q0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.f22714a.N = LocaleController.getString(R.string.SendMessageTitle);
                    int i13 = this.P0;
                    if (i13 == 3) {
                        alertDialog$Builder2.f22714a.P = LocaleController.getString(R.string.TodoCantForwardSecretChat);
                    } else if (i13 != 0) {
                        alertDialog$Builder2.f22714a.P = LocaleController.getString(R.string.PollCantForwardSecretChat);
                    } else {
                        alertDialog$Builder2.f22714a.P = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
                    }
                    alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    showDialog(alertDialog$Builder2.f22714a);
                    return false;
                }
                return true;
            } else {
                return true;
            }
        }
        return true;
    }

    public final void p4(View view) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.wp0(5));
        org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(this, view);
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
                linearLayout.setBackground(org.telegram.ui.ActionBar.g6.Y(getThemedColor(org.telegram.ui.ActionBar.g6.f23152i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
                e9Var.r(currentUser);
                cg.y yVar = new cg.y(this, getParentActivity(), z10);
                linearLayout.addView(yVar, i7.f6.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(getParentActivity());
                if (z10) {
                    t9Var.setScaleX(0.833f);
                    t9Var.setScaleY(0.833f);
                }
                t9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                t9Var.getImageReceiver().setCurrentAccount(intValue);
                t9Var.e(currentUser, e9Var);
                yVar.addView(t9Var, i7.f6.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23169j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, i7.f6.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new bg.p2(this, intValue, H, 15));
                H.r(linearLayout, i7.f6.n(230, 48));
            }
        }
        ShapeDrawable b02 = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(24.0f), getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, -16777216));
        H.f29606z.set(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        H.W(b02);
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        H.V(5);
        H.Z();
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.V3 = true;
            B4(true);
            return;
        }
        this.W3 = null;
        this.V3 = false;
        B4(false);
        F4(1.0f);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.o2 o2Var) {
        boolean presentFragment = super.presentFragment(o2Var);
        if (presentFragment && this.f38256a0 != null) {
            int i10 = 0;
            while (true) {
                ey[] eyVarArr = this.f38256a0;
                if (i10 >= eyVarArr.length) {
                    break;
                }
                eyVarArr[i10].d.getClass();
                i10++;
            }
        }
        nh.t3 t3Var = this.f38313l0;
        if (t3Var != null) {
            t3Var.e(true);
        }
        nh.t3 t3Var2 = this.m0;
        if (t3Var2 != null) {
            t3Var2.e(true);
        }
        org.telegram.ui.Components.mc.e();
        return presentFragment;
    }

    public final void q3(boolean z10) {
        rh.i iVar;
        TLRPC.ChatFull chatFull;
        boolean z11;
        org.telegram.ui.Components.fs fsVar = this.F1;
        if (fsVar != null && (iVar = this.M1) != null && (chatFull = this.V2) != null) {
            if (this.T2 != 0 && chatFull.requests_pending > 0 && !this.f38260b.f49506f) {
                z11 = true;
            } else {
                z11 = false;
            }
            fsVar.i(iVar, z11, z10);
            this.M1.setTitle(LocaleController.formatPluralString("CommunityPendingRequestsRow", this.V2.requests_pending, new Object[0]));
        }
    }

    public final void q4(int i10, long j10, TLRPC.Chat chat, boolean z10, boolean z11) {
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
        getMessagesController().checkIfFolderEmpty(this.R2);
    }

    public final void r3(ey eyVar) {
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        int i10;
        boolean z14;
        int L0 = eyVar.f37923c.L0();
        int N0 = eyVar.f37923c.N0();
        if (!this.c3 && !this.f38296h3) {
            ew ewVar = this.f38362v0;
            if (ewVar == null || ewVar.getVisibility() != 0 || !this.f38362v0.K) {
                int abs = Math.abs(N0 - L0) + 1;
                if (N0 != -1) {
                    f2.n1 K = eyVar.f37921a.K(N0);
                    if (K != null && K.f6436f == 11) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.X1 = z14;
                    if (z14) {
                        c4(false);
                    }
                } else {
                    this.X1 = false;
                }
                int i11 = eyVar.f37928s;
                if (i11 == 7 || i11 == 8) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
                    int i12 = eyVar.h;
                    if (i12 >= 0 && i12 < dialogFilters.size() && (dialogFilters.get(eyVar.h).flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) == 0 && ((abs > 0 && N0 >= R3(this.currentAccount, eyVar.f37928s, 1, this.O1).size() - 10) || (abs == 0 && !getMessagesController().isDialogsEndReached(1)))) {
                        boolean isDialogsEndReached = getMessagesController().isDialogsEndReached(1);
                        boolean z15 = !isDialogsEndReached;
                        if (isDialogsEndReached && getMessagesController().isServerDialogsEndReached(1)) {
                            z10 = z15;
                            z11 = false;
                        } else {
                            z10 = z15;
                            z11 = true;
                        }
                        if ((abs <= 0 && N0 >= R3(this.currentAccount, eyVar.f37928s, this.R2, this.O1).size() - 10) || (abs == 0 && (((i10 = eyVar.f37928s) == 7 || i10 == 8) && !getMessagesController().isDialogsEndReached(this.R2)))) {
                            boolean isDialogsEndReached2 = getMessagesController().isDialogsEndReached(this.R2);
                            boolean z16 = !isDialogsEndReached2;
                            if (isDialogsEndReached2 && getMessagesController().isServerDialogsEndReached(this.R2)) {
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
                        if (!z12 || z11) {
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    fy fyVar = fy.this;
                                    if (z12) {
                                        fyVar.getMessagesController().loadDialogs(fyVar.R2, -1, 100, z13);
                                    }
                                    if (z11) {
                                        fyVar.getMessagesController().loadDialogs(1, -1, 100, z10);
                                    } else {
                                        fyVar.getClass();
                                    }
                                }
                            });
                        }
                        return;
                    }
                }
                z11 = false;
                z10 = false;
                if (abs <= 0) {
                }
                z12 = false;
                z13 = false;
                if (!z12) {
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        fy fyVar = fy.this;
                        if (z12) {
                            fyVar.getMessagesController().loadDialogs(fyVar.R2, -1, 100, z13);
                        }
                        if (z11) {
                            fyVar.getMessagesController().loadDialogs(1, -1, 100, z10);
                        } else {
                            fyVar.getClass();
                        }
                    }
                });
            }
        }
    }

    public final void r4(ArrayList arrayList, int i10, boolean z10, boolean z11, HashSet hashSet) {
        MessagesController.DialogFilter dialogFilter;
        boolean z12;
        int i11;
        int i12;
        int i13;
        HashSet hashSet2;
        ArrayList arrayList2;
        int i14;
        long j10;
        int i15;
        int i16;
        MessagesController.DialogFilter dialogFilter2;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        int i17;
        int i18;
        MessagesController.DialogFilter dialogFilter3;
        MessagesController.DialogFilter dialogFilter4;
        fy fyVar;
        int i19;
        boolean z13;
        boolean z14;
        org.telegram.ui.ActionBar.f3 f3Var;
        TLRPC.User tL_userEmpty;
        boolean z15;
        String string;
        TLRPC.User user2;
        TLRPC.User user3;
        String string2;
        fy fyVar2 = this;
        int i20 = i10;
        if (fyVar2.getParentActivity() == null) {
            return;
        }
        ?? r72 = 0;
        int i21 = fyVar2.f38256a0[0].f37928s;
        boolean z16 = (i21 == 7 || i21 == 8) && (!fyVar2.actionBar.s() || fyVar2.actionBar.t(null));
        if (z16) {
            dialogFilter = fyVar2.getMessagesController().selectedDialogFilter[fyVar2.f38256a0[0].f37928s == 8 ? (char) 1 : (char) 0];
        } else {
            dialogFilter = null;
        }
        int size = arrayList.size();
        if (i20 != 105 && i20 != 107) {
            if ((i20 == 100 || i20 == 108) && fyVar2.J2 != 0) {
                ArrayList<TLRPC.Dialog> dialogs = fyVar2.getMessagesController().getDialogs(fyVar2.R2);
                int size2 = dialogs.size();
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (i22 < size2) {
                    TLRPC.Dialog dialog = dialogs.get(i22);
                    if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                        if (fyVar2.g4(dialog)) {
                            i14 = size2;
                            if (DialogObject.isEncryptedDialog(dialog.f22396id)) {
                                i24++;
                            } else {
                                i23++;
                            }
                        } else {
                            i14 = size2;
                            if (!fyVar2.getMessagesController().isPromoDialog(dialog.f22396id, false)) {
                                break;
                            }
                        }
                    } else {
                        i14 = size2;
                    }
                    i22++;
                    size2 = i14;
                }
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                for (int i28 = 0; i28 < size; i28++) {
                    Long l10 = (Long) arrayList.get(i28);
                    long longValue = l10.longValue();
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) fyVar2.getMessagesController().dialogs_dict.f(longValue);
                    if (dialog2 != null && !fyVar2.g4(dialog2)) {
                        if (DialogObject.isEncryptedDialog(longValue)) {
                            i26++;
                        } else {
                            i25++;
                        }
                        if (dialogFilter != null && dialogFilter.alwaysShow.contains(l10)) {
                            i27++;
                        }
                    }
                }
                if (z16) {
                    i13 = 100 - dialogFilter.alwaysShow.size();
                } else if (fyVar2.R2 == 0 && dialogFilter == null) {
                    i13 = fyVar2.getUserConfig().isPremium() ? fyVar2.getMessagesController().dialogFiltersPinnedLimitPremium : fyVar2.getMessagesController().dialogFiltersPinnedLimitDefault;
                } else if (UserConfig.getInstance(fyVar2.currentAccount).isPremium()) {
                    i13 = fyVar2.getMessagesController().maxFolderPinnedDialogsCountPremium;
                } else {
                    i13 = fyVar2.getMessagesController().maxFolderPinnedDialogsCountDefault;
                }
                if (i26 + i24 > i13 || (i25 + i23) - i27 > i13) {
                    if (fyVar2.R2 == 0 && dialogFilter == null) {
                        showDialog(new cg.v0(0, fyVar2.currentAccount, fyVar2.getParentActivity(), this, null));
                        return;
                    } else {
                        org.telegram.ui.Components.c5.u0(fyVar2, null, LocaleController.formatString("PinFolderLimitReached", R.string.PinFolderLimitReached, LocaleController.formatPluralString("Chats", i13, new Object[0])), null);
                        return;
                    }
                }
                hashSet2 = hashSet;
                arrayList2 = arrayList;
            } else if (i20 != 111) {
                hashSet2 = hashSet;
                arrayList2 = arrayList;
                if ((i20 == 102 || i20 == 103) && size > 1 && z10) {
                    HashSet hashSet3 = new HashSet();
                    boolean z17 = MessagesController.getInstance(fyVar2.currentAccount).canRevokePmInbox;
                    long j11 = MessagesController.getInstance(fyVar2.currentAccount).revokeTimePmLimit;
                    if (i20 == 102 && z17 && j11 == 2147483647L) {
                        int size3 = arrayList2.size();
                        z15 = false;
                        int i29 = 0;
                        while (i29 < size3) {
                            Object obj = arrayList2.get(i29);
                            i29++;
                            Long l11 = (Long) obj;
                            if (DialogObject.isUserDialog(l11.longValue()) || DialogObject.isEncryptedDialog(l11.longValue())) {
                                if (DialogObject.isEncryptedDialog(l11.longValue())) {
                                    TLRPC.EncryptedChat encryptedChat2 = fyVar2.getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(l11.longValue())));
                                    user2 = encryptedChat2 != null ? fyVar2.getMessagesController().getUser(Long.valueOf(encryptedChat2.user_id)) : null;
                                } else {
                                    user2 = fyVar2.getMessagesController().getUser(l11);
                                }
                                if (user2 != null) {
                                    ArrayList arrayList3 = (ArrayList) MessagesController.getInstance(fyVar2.currentAccount).dialogMessage.f(user2.f22539id);
                                    boolean z18 = (arrayList3 == null || arrayList3.size() != 1 || arrayList3.get(0) == null || ((MessageObject) arrayList3.get(0)).messageOwner == null || (!(((MessageObject) arrayList3.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionUserJoined) && !(((MessageObject) arrayList3.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
                                    if (!user2.bot && !UserObject.isDeleted(user2) && user2.f22539id != fyVar2.getUserConfig().getClientUserId() && !z18) {
                                        hashSet3.add(l11);
                                        z15 = true;
                                    }
                                }
                            }
                        }
                    } else {
                        z15 = false;
                    }
                    boolean z19 = i20 == 102;
                    int i30 = fyVar2.M2;
                    eg.b0 b0Var = new eg.b0(fyVar2, arrayList2, i20, hashSet3);
                    org.telegram.ui.ActionBar.c6 c6Var = fyVar2.resourceProvider;
                    Pattern pattern = org.telegram.ui.Components.c5.f27308a;
                    int currentAccount = fyVar2.getCurrentAccount();
                    Activity parentActivity = fyVar2.getParentActivity();
                    ?? alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, c6Var);
                    UserConfig.getInstance(currentAccount).getClientUserId();
                    org.telegram.ui.Cells.y1[] y1VarArr = new org.telegram.ui.Cells.y1[1];
                    boolean[] zArr = new boolean[1];
                    TextView textView = new TextView(parentActivity);
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false));
                    textView.setTextSize(1, 16.0f);
                    textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                    org.telegram.ui.Components.j3 j3Var = new org.telegram.ui.Components.j3(parentActivity, y1VarArr);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                    c2Var.C = 6;
                    alertDialog$Builder.n(j3Var);
                    TextView textView2 = new TextView(parentActivity);
                    boolean z20 = z19;
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
                    textView2.setTextSize(1, 20.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    if (z20) {
                        if (z15) {
                            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(parentActivity, 1, c6Var);
                            y1VarArr[0] = y1Var;
                            y1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                            y1VarArr[0].e(LocaleController.getString(R.string.DeleteMessagesForBothSidesWherePossible), "", false, false, false);
                            y1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                            j3Var.addView(y1VarArr[0], i7.f6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                            y1VarArr[0].setOnClickListener(new org.telegram.ui.Components.v0(2, zArr));
                        }
                        textView2.setText(LocaleController.formatString("DeleteFewChatsTitle", R.string.DeleteFewChatsTitle, LocaleController.formatPluralString("ChatsSelected", size, new Object[0])));
                        textView.setText(LocaleController.getString("AreYouSureDeleteFewChats", R.string.AreYouSureDeleteFewChats));
                    } else if (i30 != 0) {
                        textView2.setText(LocaleController.formatString("ClearCacheFewChatsTitle", R.string.ClearCacheFewChatsTitle, LocaleController.formatPluralString("ChatsSelectedClearCache", size, new Object[0])));
                        textView.setText(LocaleController.getString("AreYouSureClearHistoryCacheFewChats", R.string.AreYouSureClearHistoryCacheFewChats));
                    } else {
                        textView2.setText(LocaleController.formatString("ClearFewChatsTitle", R.string.ClearFewChatsTitle, LocaleController.formatPluralString("ChatsSelectedClear", size, new Object[0])));
                        textView.setText(LocaleController.getString("AreYouSureClearHistoryFewChats", R.string.AreYouSureClearHistoryFewChats));
                    }
                    j3Var.addView(textView2, i7.f6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
                    j3Var.addView(textView, i7.f6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                    if (z20) {
                        string = LocaleController.getString("Delete", R.string.Delete);
                    } else if (i30 != 0) {
                        string = LocaleController.getString("ClearHistoryCache", R.string.ClearHistoryCache);
                    } else {
                        string = LocaleController.getString("ClearHistory", R.string.ClearHistory);
                    }
                    alertDialog$Builder.k(string, new org.telegram.ui.Components.j1(5, b0Var, zArr));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    fyVar2.showDialog(c2Var);
                    TextView textView3 = (TextView) c2Var.d(-1);
                    if (textView3 != null) {
                        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                        return;
                    }
                    return;
                } else if (i20 == 106 && z10) {
                    if (size == 1) {
                        Long l12 = (Long) arrayList2.get(0);
                        l12.getClass();
                        user3 = fyVar2.getMessagesController().getUser(l12);
                    } else {
                        user3 = null;
                    }
                    boolean z21 = fyVar2.N2 != 0;
                    xr xrVar = new xr(7, fyVar2, arrayList2);
                    Pattern pattern2 = org.telegram.ui.Components.c5.f27308a;
                    if (fyVar2.getParentActivity() != null) {
                        if (size == 1 && user3 == null) {
                            return;
                        }
                        Activity parentActivity2 = fyVar2.getParentActivity();
                        ?? alertDialog$Builder2 = new AlertDialog$Builder(parentActivity2);
                        ?? r9 = new org.telegram.ui.Cells.y1[2];
                        ?? linearLayout = new LinearLayout(parentActivity2);
                        linearLayout.setOrientation(1);
                        alertDialog$Builder2.n(linearLayout);
                        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22714a;
                        if (size == 1) {
                            String formatName = ContactsController.formatName(user3.first_name, user3.last_name);
                            c2Var2.N = LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, formatName);
                            string2 = LocaleController.getString(R.string.BlockUser);
                            c2Var2.P = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserMessage", R.string.BlockUserMessage, formatName));
                        } else {
                            c2Var2.N = LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, LocaleController.formatPluralString("UsersCountTitle", size, new Object[0]));
                            string2 = LocaleController.getString(R.string.BlockUsers);
                            c2Var2.P = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUsersMessage", R.string.BlockUsersMessage, LocaleController.formatPluralString("UsersCount", size, new Object[0])));
                        }
                        int i31 = 2;
                        boolean[] zArr2 = {true, true};
                        int i32 = 0;
                        while (i32 < i31) {
                            if (i32 != 0 || z21) {
                                org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(parentActivity2, 1);
                                r9[i32] = y1Var2;
                                y1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(r72));
                                if (i32 == 0) {
                                    r9[i32].e(LocaleController.getString(R.string.ReportSpamTitle), "", true, false, false);
                                } else {
                                    r9[i32].e(LocaleController.getString(size == 1 ? R.string.DeleteThisChatBothSides : R.string.DeleteTheseChatsBothSides), "", true, false, false);
                                }
                                r9[i32].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), r72, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), r72);
                                linearLayout.addView(r9[i32], i7.f6.n(-1, 48));
                                r9[i32].setOnClickListener(new jh.y0(zArr2, i32, 6));
                            }
                            i32++;
                            i31 = 2;
                            r72 = 0;
                        }
                        alertDialog$Builder2.k(string2, new org.telegram.ui.Components.j1(9, xrVar, zArr2));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        fyVar2.showDialog(c2Var2);
                        TextView textView4 = (TextView) c2Var2.d(-1);
                        if (textView4 != null) {
                            textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else if (z10) {
                org.telegram.ui.Components.c5.v0(this, LocaleController.getString(R.string.CommunityUngroupChats), LocaleController.getString(R.string.CommunityUngroupChatsText), LocaleController.getString(R.string.CommunityUngroupChatsButton), true, new sv(fyVar2, arrayList, i20, z11, hashSet));
                return;
            } else {
                hashSet2 = hashSet;
                arrayList2 = arrayList;
                int size4 = arrayList2.size();
                int i33 = 0;
                while (i33 < size4) {
                    Object obj2 = arrayList2.get(i33);
                    i33++;
                    fyVar2.getMessagesController().toggleCommunityCollapsedInDialogs(-((Long) obj2).longValue(), false);
                }
            }
            int i34 = Integer.MAX_VALUE;
            if (dialogFilter != null && ((i20 == 100 || i20 == 108) && fyVar2.J2 != 0)) {
                int size5 = dialogFilter.pinnedDialogs.size();
                for (int i35 = 0; i35 < size5; i35++) {
                    i34 = Math.min(i34, dialogFilter.pinnedDialogs.valueAt(i35));
                }
                i34 -= fyVar2.J2;
            }
            int i36 = i34;
            int i37 = 0;
            int i38 = 0;
            while (i37 < size) {
                Long l13 = (Long) arrayList2.get(i37);
                long longValue2 = l13.longValue();
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) fyVar2.getMessagesController().dialogs_dict.f(longValue2);
                if (dialog3 == null) {
                    i17 = i20;
                    i18 = i36;
                    i16 = i37;
                    dialogFilter3 = dialogFilter;
                } else {
                    if (DialogObject.isEncryptedDialog(longValue2)) {
                        encryptedChat = org.telegram.messenger.x3.p(fyVar2.getMessagesController(), longValue2);
                        if (encryptedChat != null) {
                            i16 = i37;
                            dialogFilter2 = dialogFilter;
                            tL_userEmpty = fyVar2.getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
                        } else {
                            i16 = i37;
                            dialogFilter2 = dialogFilter;
                            tL_userEmpty = new TLRPC.TL_userEmpty();
                        }
                        user = tL_userEmpty;
                        chat = null;
                    } else {
                        i16 = i37;
                        dialogFilter2 = dialogFilter;
                        if (DialogObject.isUserDialog(longValue2)) {
                            user = fyVar2.getMessagesController().getUser(l13);
                            chat = null;
                        } else {
                            chat = fyVar2.getMessagesController().getChat(Long.valueOf(-longValue2));
                            user = null;
                        }
                        encryptedChat = null;
                    }
                    if (chat != null || user != null) {
                        boolean z22 = (user == null || !user.bot || MessagesController.isSupportUser(user)) ? false : true;
                        if (i20 == 100 || i20 == 108) {
                            i17 = i20;
                            if (fyVar2.J2 != 0) {
                                if (!fyVar2.g4(dialog3)) {
                                    i38++;
                                    i18 = i36;
                                    dialogFilter3 = dialogFilter2;
                                    fyVar2.s4(longValue2, true, dialogFilter3, i18, size == 1);
                                    if (dialogFilter3 != null) {
                                        int i39 = i18 + 1;
                                        if (encryptedChat != null) {
                                            if (!dialogFilter3.alwaysShow.contains(Long.valueOf(encryptedChat.user_id))) {
                                                dialogFilter3.alwaysShow.add(Long.valueOf(encryptedChat.user_id));
                                            }
                                        } else if (!dialogFilter3.alwaysShow.contains(Long.valueOf(dialog3.f22396id))) {
                                            dialogFilter3.alwaysShow.add(Long.valueOf(dialog3.f22396id));
                                        }
                                        i18 = i39;
                                    }
                                }
                                i18 = i36;
                                dialogFilter3 = dialogFilter2;
                            } else {
                                i18 = i36;
                                dialogFilter3 = dialogFilter2;
                                if (fyVar2.g4(dialog3)) {
                                    i38++;
                                    fyVar2.s4(longValue2, false, dialogFilter3, i18, size == 1);
                                    dialogFilter4 = dialogFilter3;
                                    dialogFilter = dialogFilter4;
                                    i37 = i16 + 1;
                                    i36 = i18;
                                    i20 = i17;
                                    r16 = 3;
                                }
                            }
                            dialogFilter4 = dialogFilter3;
                            dialogFilter = dialogFilter4;
                            i37 = i16 + 1;
                            i36 = i18;
                            i20 = i17;
                            r16 = 3;
                        } else if (i20 == 101) {
                            if (fyVar2.I2 != 0) {
                                fyVar2.j4(longValue2);
                            } else {
                                fyVar2.getMessagesController().markDialogAsUnread(longValue2, null, 0L);
                            }
                        } else {
                            if (i20 == 102) {
                                fyVar = fyVar2;
                                i19 = 1;
                            } else if (i20 == 103) {
                                fyVar = fyVar2;
                                i19 = 1;
                            } else if (i20 != 104) {
                                i17 = i20;
                                i18 = i36;
                                dialogFilter3 = dialogFilter2;
                                dialogFilter4 = dialogFilter3;
                                dialogFilter = dialogFilter4;
                                i37 = i16 + 1;
                                i36 = i18;
                                i20 = i17;
                                r16 = 3;
                            } else if (size == 1 && fyVar2.K2 == 1) {
                                fy fyVar3 = fyVar2;
                                fyVar3.showDialog(org.telegram.ui.Components.c5.F(longValue2, 0L, fyVar3, null), new fv(fyVar3, 2));
                                return;
                            } else {
                                fyVar = fyVar2;
                                if (fyVar.L2 != 0) {
                                    if (fyVar.getMessagesController().isDialogMuted(longValue2, 0L)) {
                                        fyVar.getNotificationsController().setDialogNotificationsSettings(longValue2, 0L, 4);
                                    }
                                    i18 = i36;
                                    fyVar2 = fyVar;
                                    dialogFilter3 = dialogFilter2;
                                    i17 = i20;
                                    dialogFilter4 = dialogFilter3;
                                    dialogFilter = dialogFilter4;
                                    i37 = i16 + 1;
                                    i36 = i18;
                                    i20 = i17;
                                    r16 = 3;
                                } else if (z11) {
                                    Pattern pattern3 = org.telegram.ui.Components.c5.f27308a;
                                    if (fyVar.getParentActivity() == null) {
                                        f3Var = null;
                                    } else {
                                        org.telegram.ui.ActionBar.f3 f3Var2 = new org.telegram.ui.ActionBar.f3(fyVar.getParentActivity(), null, false, false);
                                        f3Var2.fixNavigationBar();
                                        f3Var2.title = LocaleController.getString(R.string.Notifications);
                                        f3Var2.bigTitle = true;
                                        String formatString = LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 1, new Object[0]));
                                        String formatString2 = LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 8, new Object[0]));
                                        String formatString3 = LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Days", 2, new Object[0]));
                                        String string3 = LocaleController.getString(R.string.MuteDisable);
                                        CharSequence[] charSequenceArr = new CharSequence[4];
                                        charSequenceArr[0] = formatString;
                                        charSequenceArr[1] = formatString2;
                                        charSequenceArr[2] = formatString3;
                                        charSequenceArr[r16] = string3;
                                        ag.y1 y1Var3 = new ag.y1(arrayList2, fyVar);
                                        f3Var2.items = charSequenceArr;
                                        f3Var2.onClickListener = y1Var3;
                                        f3Var = f3Var2;
                                    }
                                    fyVar.showDialog(f3Var, new fv(fyVar, 3));
                                    return;
                                } else {
                                    if (!fyVar.getMessagesController().isDialogMuted(longValue2, 0L)) {
                                        fyVar.getNotificationsController().setDialogNotificationsSettings(longValue2, 0L, 3);
                                    }
                                    i18 = i36;
                                    fyVar2 = fyVar;
                                    dialogFilter3 = dialogFilter2;
                                    i17 = i20;
                                    dialogFilter4 = dialogFilter3;
                                    dialogFilter = dialogFilter4;
                                    i37 = i16 + 1;
                                    i36 = i18;
                                    i20 = i17;
                                    r16 = 3;
                                }
                            }
                            if (size == i19) {
                                if (i20 == 102 && fyVar.Q2) {
                                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(fyVar.getParentActivity());
                                    String string4 = LocaleController.getString(R.string.PsaHideChatAlertTitle);
                                    org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f22714a;
                                    c2Var3.N = string4;
                                    c2Var3.P = LocaleController.getString(R.string.PsaHideChatAlertText);
                                    alertDialog$Builder3.k(LocaleController.getString(R.string.PsaHide), new kv(fyVar, 11));
                                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                                    fyVar.showDialog(c2Var3);
                                    return;
                                }
                                org.telegram.ui.Components.c5.s(this, i20 == 103, chat, user, DialogObject.isEncryptedDialog(dialog3.f22396id), i20 == 102, false, false, new cw(fyVar, i20, chat, longValue2, z22));
                                return;
                            }
                            boolean z23 = z22;
                            TLRPC.Chat chat2 = chat;
                            if (fyVar.getMessagesController().isPromoDialog(longValue2, true)) {
                                fyVar.getMessagesController().hidePromoDialog();
                                i18 = i36;
                                fyVar2 = fyVar;
                                dialogFilter3 = dialogFilter2;
                                i17 = i20;
                                dialogFilter4 = dialogFilter3;
                                dialogFilter = dialogFilter4;
                                i37 = i16 + 1;
                                i36 = i18;
                                i20 = i17;
                                r16 = 3;
                            } else if (i20 == 103 && fyVar.M2 != 0) {
                                fyVar.getMessagesController().deleteDialog(longValue2, 2, false);
                                i18 = i36;
                                fyVar2 = fyVar;
                                dialogFilter3 = dialogFilter2;
                                i17 = i20;
                                dialogFilter4 = dialogFilter3;
                                dialogFilter = dialogFilter4;
                                i37 = i16 + 1;
                                i36 = i18;
                                i20 = i17;
                                r16 = 3;
                            } else {
                                if (hashSet2 == null || !hashSet2.contains(l13)) {
                                    z13 = z23;
                                    z14 = false;
                                } else {
                                    z13 = z23;
                                    z14 = true;
                                }
                                fyVar2 = fyVar;
                                fyVar2.q4(i20, longValue2, chat2, z13, z14);
                                i17 = i20;
                                i18 = i36;
                                dialogFilter3 = dialogFilter2;
                                dialogFilter4 = dialogFilter3;
                                dialogFilter = dialogFilter4;
                                i37 = i16 + 1;
                                i36 = i18;
                                i20 = i17;
                                r16 = 3;
                            }
                        }
                    }
                    i17 = i20;
                    i18 = i36;
                    dialogFilter3 = dialogFilter2;
                }
                dialogFilter4 = dialogFilter3;
                dialogFilter = dialogFilter4;
                i37 = i16 + 1;
                i36 = i18;
                i20 = i17;
                r16 = 3;
            }
            int i40 = i20;
            MessagesController.DialogFilter dialogFilter5 = dialogFilter;
            if (i40 == 104 && (size != 1 || fyVar2.K2 != 1)) {
                org.telegram.ui.Components.tc.A(fyVar2, fyVar2.L2 == 0, null).j();
            }
            int i41 = 108;
            if (i40 == 100 || i40 == 108) {
                if (dialogFilter5 != null) {
                    fy fyVar4 = fyVar2;
                    p00.t0(dialogFilter5, dialogFilter5.flags, dialogFilter5.name, dialogFilter5.entities, dialogFilter5.title_noanimate, dialogFilter5.color, dialogFilter5.alwaysShow, dialogFilter5.neverShow, dialogFilter5.pinnedDialogs, false, false, true, true, false, fyVar4, null);
                    fyVar2 = fyVar4;
                    j10 = 0;
                } else {
                    j10 = 0;
                    fyVar2.getMessagesController().reorderPinnedDialogs(fyVar2.R2, null, 0L);
                }
                UndoView Y3 = fyVar2.Y3();
                if (fyVar2.f38315l3 && Y3 != null) {
                    Y3.m(j10, Integer.valueOf(i38), fyVar2.J2 != 0 ? 78 : 79);
                }
                i15 = i10;
                i41 = 108;
            } else {
                i15 = i40;
            }
            fyVar2.b4((i15 == i41 || i15 == 100 || i15 == 102) ? false : true);
            return;
        }
        ArrayList<Long> arrayList4 = new ArrayList<>(arrayList);
        fyVar2.getMessagesController().addDialogToFolder(arrayList4, fyVar2.O2 == 0 ? 1 : 0, -1, null, 0L);
        if (fyVar2.O2 == 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            z12 = false;
            boolean z24 = globalMainSettings.getBoolean("archivehint_l", false) || SharedConfig.archiveHidden;
            if (z24) {
                i11 = 1;
            } else {
                i11 = 1;
                globalMainSettings.edit().putBoolean("archivehint_l", true).commit();
            }
            if (z24) {
                i12 = arrayList4.size() > i11 ? 4 : 2;
            } else {
                i12 = arrayList4.size() > i11 ? 5 : 3;
            }
            UndoView Y32 = fyVar2.Y3();
            if (Y32 != null) {
                Y32.l(0L, i12, null, new org.telegram.ui.Components.voip.o(10, fyVar2, arrayList4));
            }
        } else {
            z12 = false;
            ArrayList<TLRPC.Dialog> dialogs2 = fyVar2.getMessagesController().getDialogs(fyVar2.R2);
            if (fyVar2.f38256a0 != null && dialogs2.isEmpty() && !fyVar2.G) {
                fyVar2.f38256a0[0].f37921a.setEmptyView(null);
                fyVar2.f38256a0[0].f37929w.setVisibility(4);
                fyVar2.finishFragment();
            }
        }
        fyVar2.b4(z12);
    }

    @Override
    public final void s() {
        x4(true, true);
    }

    public final void s3() {
        if (this.f38256a0 != null) {
            int n32 = n3();
            int i10 = 0;
            while (true) {
                ey[] eyVarArr = this.f38256a0;
                if (i10 < eyVarArr.length) {
                    ey eyVar = eyVarArr[i10];
                    if (eyVar != null) {
                        ay ayVar = eyVar.f37921a;
                        ayVar.setPadding(0, ayVar.U2, 0, n32);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void s4(long r14, boolean r16, org.telegram.messenger.MessagesController.DialogFilter r17, int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fy.s4(long, boolean, org.telegram.messenger.MessagesController$DialogFilter, int, boolean):void");
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        xw xwVar = this.A0;
        if (xwVar != null) {
            if (this.C0 && !z10) {
                xwVar.setVisibility(0);
            } else {
                xwVar.setVisibility(8);
            }
        }
        Y4(true);
        U4();
    }

    @Override
    public final void setTitleOverlayText(java.lang.String r6, int r7, java.lang.Runnable r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fy.setTitleOverlayText(java.lang.String, int, java.lang.Runnable):void");
    }

    public final void t3() {
        sg.f fVar = this.f38359u1;
        if (fVar != null) {
            fVar.setBlurredBottomHeight(this.f38359u1.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        }
    }

    public final void t4() {
        if (this.G0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / 180));
        this.G0.setBackground(new BitmapDrawable(createBitmap));
        this.G0.setAlpha(0.0f);
        this.G0.setVisibility(0);
        B3();
    }

    public final void u3() {
        int i10;
        ey eyVar;
        boolean z10 = true;
        float S3 = S3(true);
        ew ewVar = this.f38362v0;
        if (ewVar != null) {
            if (ewVar.getAlpha() == S3) {
                z10 = false;
            }
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, S3);
            this.f38362v0.setAlpha(S3);
            this.f38362v0.setScaleX(lerp);
            this.f38362v0.setScaleY(lerp);
            ew ewVar2 = this.f38362v0;
            if (S3 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            ewVar2.setVisibility(i10);
            if (z10 && (eyVar = this.f38256a0[0]) != null) {
                eyVar.f37921a.requestLayout();
            }
        }
        S4();
    }

    public final void u4(ey eyVar) {
        int i10;
        org.telegram.ui.Components.p00 p00Var;
        if (eyVar.getVisibility() != 0) {
            return;
        }
        int i11 = eyVar.d.v;
        if (eyVar.f37928s == 0 && Z3() && eyVar.f37921a.getChildCount() == 0 && eyVar.v == 2) {
            ((f2.j0) eyVar.f37921a.getLayoutManager()).h1(1, (int) this.J);
        }
        eyVar.d.getClass();
        eyVar.d.U();
        int h = eyVar.d.h();
        if (h == 1 && i11 == 1 && eyVar.d.j(0) == 5) {
            eyVar.q(true);
        } else {
            eyVar.q(false);
            if (h > i11 && (i10 = this.N0) != 11 && i10 != 12 && i10 != 13) {
                eyVar.f37931y.b(i11);
            }
        }
        try {
            ay ayVar = eyVar.f37921a;
            if (this.R2 == 0 && this.T2 == 0) {
                p00Var = eyVar.f37929w;
            } else {
                p00Var = null;
            }
            ayVar.setEmptyView(p00Var);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        r3(eyVar);
    }

    public final void v3() {
        int i10;
        int i11;
        float f9 = this.f38321n.f49505e;
        float lerp = AndroidUtilities.lerp(0.2f, 1.0f, f9);
        org.telegram.ui.Components.hp0 hp0Var = this.f38378y1;
        int i12 = 8;
        if (hp0Var != null) {
            hp0Var.setScaleX(lerp);
            this.f38378y1.setScaleY(lerp);
            this.f38378y1.setAlpha(f9);
            org.telegram.ui.Components.hp0 hp0Var2 = this.f38378y1;
            if (f9 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            hp0Var2.setVisibility(i11);
        }
        sg.f fVar = this.f38359u1;
        if (fVar != null) {
            fVar.setAlpha(f9);
            sg.f fVar2 = this.f38359u1;
            int i13 = (f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1));
            if (i13 > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            fVar2.setVisibility(i10);
            this.f38359u1.getFadeView().setAlpha(f9);
            View fadeView = this.f38359u1.getFadeView();
            if (i13 > 0) {
                i12 = 0;
            }
            fadeView.setVisibility(i12);
        }
    }

    public final void v4() {
        boolean z10;
        float f9 = 0.0f;
        if (this.J != 0.0f && !(z10 = this.G)) {
            if (z10) {
                f9 = -U3();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.C3, f9));
            animatorSet.setInterpolator(org.telegram.ui.Components.jr.f29800f);
            animatorSet.setDuration(250L);
            animatorSet.start();
        }
    }

    public final void w3() {
        if (this.actionBar == null) {
            return;
        }
        org.telegram.ui.Components.u10.d(this.actionBar.getBackButton(), Math.max(this.f38335p3, (1.0f - this.f38260b.f49505e) * (1.0f - V3()) * (1.0f - this.f38266c.f49505e)));
    }

    public final void w4(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fy.w4(int):void");
    }

    public final void x3() {
        float f9;
        if (this.f38277e0) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        org.telegram.ui.Components.u10.d(this.f38267c0, com.google.android.recaptcha.internal.a.C(f9, 1.0f - this.f38260b.f49505e, 1.0f - V3(), 1.0f - this.f38266c.f49505e));
    }

    public final void x4(boolean z10, boolean z11) {
        int i10;
        int i11;
        ax axVar = this.B3;
        if (axVar != null && axVar.c()) {
            return;
        }
        if (this.f38256a0[0].f37928s == 0 && Z3() && this.f38256a0[0].v == 2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.G && !z11 && !this.A0.g()) {
            i11 = -AndroidUtilities.dp(81.0f);
        } else {
            i11 = 0;
        }
        if (z10) {
            c2.z zVar = this.f38256a0[0].f37927r;
            zVar.f2933b = 1;
            zVar.c(i10, i11, false, false);
            v4();
            return;
        }
        this.f38256a0[0].f37923c.h1(i10, i11);
        v4();
    }

    @Override
    public final qg.d y() {
        return this.f38307j4;
    }

    public final void y3() {
        float f9;
        if (SharedConfig.passcodeHash.isEmpty()) {
            f9 = 0.0f;
        } else {
            f9 = 1.0f;
        }
        org.telegram.ui.Components.u10.d(this.f38261b0, com.google.android.recaptcha.internal.a.C(f9, 1.0f - this.f38260b.f49505e, 1.0f - V3(), 1.0f - this.f38266c.f49505e));
    }

    public final void y4(String str, boolean z10) {
        O4(true, false, true, false);
        ux uxVar = this.T;
        if (uxVar != null) {
            uxVar.f34546r.setText(str);
            this.T.f34546r.setSelection(str.length());
        }
    }

    @Override
    public final void z(float f9, int i10) {
        org.telegram.ui.ActionBar.w0 w0Var;
        if (i10 == 3 && (w0Var = this.f38293h0) != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) w0Var.getIconView().getDrawable();
            if (this.d.f49506f) {
                animatedVectorDrawable.start();
                if (SharedConfig.getDevicePerformanceClass() != 0) {
                    TLRPC.TL_help_premiumPromo premiumPromo = MediaDataController.getInstance(this.currentAccount).getPremiumPromo();
                    String l02 = PremiumPreviewFragment.l0(2);
                    if (premiumPromo != null) {
                        int i11 = 0;
                        while (true) {
                            if (i11 < premiumPromo.video_sections.size()) {
                                if (premiumPromo.video_sections.get(i11).equals(l02)) {
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
                        }
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23) {
                animatedVectorDrawable.reset();
            } else {
                animatedVectorDrawable.setVisible(false, true);
            }
        }
    }

    public final void z3() {
        float f9;
        if (this.N0 != 2) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        org.telegram.ui.Components.u10.d(this.f38283f0, com.google.android.recaptcha.internal.a.C(f9, this.f38282f.f49505e, 1.0f - V3(), 1.0f - this.f38266c.f49505e));
        xw xwVar = this.A0;
        if (xwVar != null) {
            xwVar.invalidate();
        }
    }

    public final void z4(float f9) {
        ey[] eyVarArr;
        this.Y = f9;
        for (ey eyVar : this.f38256a0) {
            ay ayVar = eyVar.f37921a;
            for (int i10 = 0; i10 < ayVar.getChildCount(); i10++) {
                View childAt = ayVar.getChildAt(i10);
                if (childAt != null && RecyclerView.R(childAt) >= eyVar.d.f47296f + 1) {
                    childAt.setAlpha(f9);
                }
            }
        }
    }
}

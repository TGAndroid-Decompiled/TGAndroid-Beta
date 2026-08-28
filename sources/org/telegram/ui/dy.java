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
public class dy extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, uf.b, td.b, mg0 {
    public static boolean f37625t4;
    public static final boolean[] f37626u4 = new boolean[4];
    public static final org.telegram.ui.Components.rq0 v4 = new org.telegram.ui.Components.rq0(3);
    public static float f37627w4;
    public boolean A;
    public vw A0;
    public final TextPaint A1;
    public String A2;
    public org.telegram.ui.Cells.o A3;
    public boolean B;
    public org.telegram.ui.Components.zr B0;
    public nw B1;
    public CharSequence B2;
    public yw B3;
    public TLRPC.RequestPeerType C;
    public boolean C0;
    public FrameLayout C1;
    public org.telegram.ui.Components.wp0 C2;
    public final mw C3;
    public long D;
    public float D0;
    public nw D1;
    public org.telegram.ui.Components.p61 D2;
    public final mw D3;
    public ValueAnimator E;
    public float E0;
    public FrameLayout E1;
    public final ArrayList E2;
    public kg0 E3;
    public ValueAnimator F;
    public float F0;
    public org.telegram.ui.Components.bs F1;
    public boolean F2;
    public NotificationCenter.ObserversGroup F3;
    public boolean G;
    public fh.l2 G0;
    public org.telegram.ui.Components.as G1;
    public int G2;
    public NotificationCenter.ObserversGroup G3;
    public boolean H;
    public org.telegram.ui.Components.x60 H0;
    public org.telegram.ui.Cells.m H1;
    public int H2;
    public Drawable H3;
    public boolean I;
    public ax I0;
    public org.telegram.ui.Cells.z2 I1;
    public int I2;
    public int I3;
    public float J;
    public boolean J0;
    public org.telegram.ui.Cells.sa J1;
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
    public oh.i M1;
    public int M2;
    public boolean M3;
    public boolean N;
    public int N0;
    public ArrayList N1;
    public int N2;
    public qu N3;
    public org.telegram.ui.Components.gc O;
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
    public org.telegram.ui.Components.hc0 R0;
    public boolean R1;
    public int R2;
    public CharSequence R3;
    public boolean S;
    public org.telegram.ui.Cells.r2 S0;
    public long S1;
    public dy S2;
    public boolean S3;
    public sx T;
    public org.telegram.ui.Cells.r2 T0;
    public TLObject T1;
    public long T2;
    public float T3;
    public ff.o0 U;
    public boolean U0;
    public int U1;
    public TLRPC.Chat U2;
    public boolean U3;
    public o31 V;
    public boolean V0;
    public int V1;
    public TLRPC.ChatFull V2;
    public boolean V3;
    public org.telegram.ui.Components.m71 W;
    public final ArrayList W0;
    public boolean W1;
    public org.telegram.ui.Components.o9 W2;
    public ValueAnimator W3;
    public of.o0 X;
    public boolean X0;
    public boolean X1;
    public org.telegram.ui.Components.z8 X2;
    public org.telegram.ui.Components.e40 X3;
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
    public final int f37628a;
    public cy[] f37629a0;
    public org.telegram.ui.ActionBar.h2 f37630a1;
    public boolean a2;
    public boolean a3;
    public org.telegram.ui.Components.gc f37631a4;
    public final td.a f37632b;
    public org.telegram.ui.ActionBar.w0 f37633b0;
    public final Paint f37634b1;
    public String f37635b2;
    public AnimatorSet f37636b3;
    public int f37637b4;
    public final td.a f37638c;
    public org.telegram.ui.ActionBar.w0 f37639c0;
    public ImageView f37640c1;
    public String f37641c2;
    public boolean f37642c3;
    public int f37643c4;
    public final td.a d;
    public fy f37644d0;
    public NumberTextView f37645d1;
    public String f37646d2;
    public boolean f37647d3;
    public int f37648d4;
    public final td.a f37649e;
    public boolean f37650e0;
    public final ArrayList f37651e1;
    public boolean f37652e2;
    public float f37653e3;
    public int f37654e4;
    public final td.a f37655f;
    public org.telegram.ui.ActionBar.w0 f37656f0;
    public org.telegram.ui.ActionBar.w0 f37657f1;
    public boolean f37658f2;
    public boolean f37659f3;
    public int f37660f4;
    public org.telegram.ui.ActionBar.w0 f37661g0;
    public org.telegram.ui.ActionBar.w0 f37662g1;
    public boolean f37663g2;
    public int f37664g3;
    public pg.i f37665g4;
    public final td.a h;
    public org.telegram.ui.ActionBar.w0 f37666h0;
    public org.telegram.ui.ActionBar.w0 f37667h1;
    public boolean f37668h2;
    public boolean f37669h3;
    public final ig.e f37670h4;
    public org.telegram.ui.ActionBar.w0 f37671i0;
    public org.telegram.ui.ActionBar.w0 f37672i1;
    public boolean f37673i2;
    public boolean f37674i3;
    public final ng.d f37675i4;
    public org.telegram.ui.Components.rh0 f37676j0;
    public org.telegram.ui.ActionBar.g1 f37677j1;
    public String f37678j2;
    public org.telegram.ui.Components.gc f37679j3;
    public final ng.d f37680j4;
    public org.telegram.ui.ActionBar.g1 f37681k0;
    public org.telegram.ui.ActionBar.g1 f37682k1;
    public String f37683k2;
    public final AnimationNotificationsLocker f37684k3;
    public final ng.c f37685k4;
    public kh.x3 f37686l0;
    public org.telegram.ui.ActionBar.g1 l1;
    public final MessagesStorage.TopicKey f37687l2;
    public boolean f37688l3;
    public final ig.a f37689l4;
    public kh.x3 m0;
    public org.telegram.ui.ActionBar.g1 f37690m1;
    public boolean f37691m2;
    public boolean f37692m3;
    public final ig.a f37693m4;
    public final td.a f37694n;
    public boolean f37695n0;
    public org.telegram.ui.ActionBar.g1 f37696n1;
    public boolean f37697n2;
    public boolean f37698n3;
    public final ig.a f37699n4;
    public boolean f37700o0;
    public org.telegram.ui.ActionBar.g1 f37701o1;
    public boolean f37702o2;
    public boolean f37703o3;
    public final ig.a f37704o4;
    public org.telegram.ui.Components.j10 f37705p0;
    public org.telegram.ui.ActionBar.g1 f37706p1;
    public boolean f37707p2;
    public float f37708p3;
    public vv f37709p4;
    public org.telegram.ui.Components.j10 f37710q0;
    public float f37711q1;
    public boolean f37712q2;
    public ValueAnimator f37713q3;
    public final ArrayList f37714q4;
    public final td.a f37715r;
    public kh.d f37716r0;
    public float f37717r1;
    public boolean f37718r2;
    public float f37719r3;
    public final RectF f37720r4;
    public final td.a f37721s;
    public rg.f f37722s0;
    public AnimatorSet f37723s1;
    public boolean f37724s2;
    public float f37725s3;
    public final RectF f37726s4;
    public int f37727t0;
    public float f37728t1;
    public boolean f37729t2;
    public float f37730t3;
    public final UndoView[] f37731u0;
    public pg.f f37732u1;
    public boolean f37733u2;
    public int f37734u3;
    public final xg.i v;
    public cw f37735v0;
    public FrameLayout f37736v1;
    public boolean f37737v2;
    public boolean f37738v3;
    public boolean f37739w;
    public boolean f37740w0;
    public FrameLayout f37741w1;
    public boolean f37742w2;
    public boolean f37743w3;
    public int f37744x;
    public int f37745x0;
    public ow f37746x1;
    public boolean f37747x2;
    public Long f37748x3;
    public boolean f37749y;
    public mx f37750y0;
    public org.telegram.ui.Components.wo0 f37751y1;
    public wx f37752y2;
    public Drawable f37753y3;
    public org.telegram.ui.Components.wt0 f37754z0;
    public org.telegram.ui.ActionBar.w0 f37755z1;
    public ArrayList f37756z2;
    public org.telegram.ui.Components.i5 f37757z3;

    public dy(Bundle bundle) {
        super(bundle);
        int i9;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            i9 = 48;
        } else {
            i9 = 0;
        }
        this.f37628a = i9;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.f37632b = new td.a(1, this, grVar, 350L, false);
        this.f37638c = new td.a(2, this, grVar, 350L, false);
        this.d = new td.a(3, this, grVar, 350L, false);
        this.f37649e = new td.a(4, this, grVar, 350L, false);
        this.f37655f = new td.a(5, this, grVar, 350L, false);
        this.h = new td.a(6, this, grVar, 350L, false);
        this.f37694n = new td.a(7, this, grVar, 350L, false);
        this.f37715r = new td.a(8, this, grVar, 350L, false);
        this.f37721s = new td.a(9, this, grVar, 350L, false);
        this.v = new xg.i(new uv(this, 1));
        this.f37744x = -1;
        this.B = true;
        this.G = false;
        this.H = false;
        this.I = false;
        this.M = true;
        this.Y = 1.0f;
        this.f37731u0 = new UndoView[2];
        this.W0 = new ArrayList();
        this.f37634b1 = new Paint();
        this.f37651e1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.A1 = new TextPaint(1);
        this.Q1 = true;
        this.Y1 = true;
        this.f37652e2 = true;
        this.f37687l2 = new MessagesStorage.TopicKey();
        this.E2 = new ArrayList();
        this.F2 = true;
        this.f37684k3 = new AnimationNotificationsLocker();
        this.f37734u3 = -1;
        this.C3 = new mw(this, 0);
        this.D3 = new mw(this, 1);
        this.I3 = -4;
        this.J3 = true;
        this.K3 = true;
        this.T3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.f37714q4 = arrayList;
        RectF rectF = new RectF();
        this.f37720r4 = rectF;
        RectF rectF2 = new RectF();
        this.f37726s4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        ng.c cVar = new ng.c();
        this.f37685k4 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
        if (i10 >= 31) {
            this.f37670h4 = new ig.e(false);
            ng.d dVar = new ng.d(null);
            this.f37675i4 = dVar;
            dVar.i(new ix(this, 0));
            ng.d dVar2 = new ng.d(null);
            this.f37680j4 = dVar2;
            dVar2.i(new ix(this, 3));
            ig.a aVar = new ig.a(dVar);
            this.f37689l4 = aVar;
            aVar.f11132f = LiteMode.isEnabled(262144);
            ig.a aVar2 = new ig.a(dVar2);
            this.f37699n4 = aVar2;
            aVar2.f11132f = LiteMode.isEnabled(262144);
            this.f37693m4 = new ig.a(dVar);
        } else {
            this.f37670h4 = null;
            this.f37675i4 = null;
            this.f37680j4 = null;
            this.f37689l4 = new ig.a(cVar);
            this.f37699n4 = new ig.a(cVar);
            this.f37693m4 = new ig.a(cVar);
        }
        this.f37704o4 = new ig.a(cVar);
    }

    public static void A0(dy dyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(dyVar.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(dyVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new y9(dyVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void B0(dy dyVar) {
        MessagesController.getInstance(dyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        dyVar.U4();
        org.telegram.ui.Components.gc J = org.telegram.ui.Components.oc.a0(dyVar).J(R.raw.chats_infotip, LocaleController.getString(R.string.BirthdaySetupLater), LocaleController.getString(R.string.Settings), new dv(dyVar, 1));
        J.f28737j = 5000;
        J.j();
    }

    public static void C0(dy dyVar) {
        boolean z10 = true;
        try {
            ((org.telegram.ui.Components.mi0) ((org.telegram.ui.Components.z8) dyVar.I1.h.getImageReceiver().getStaticThumb()).B).F(true);
        } catch (Exception unused) {
        }
        if (dyVar.X3 == null) {
            org.telegram.ui.Components.e40 e40Var = new org.telegram.ui.Components.e40(0, true, true);
            dyVar.X3 = e40Var;
            e40Var.D = true;
            e40Var.f27909a = dyVar;
            e40Var.f27910b = new qx(dyVar);
            dyVar.getMediaDataController().checkFeaturedStickers();
            dyVar.getMessagesController().loadSuggestedFilters();
            dyVar.getMessagesController().loadUserInfo(dyVar.getUserConfig().getCurrentUser(), true, dyVar.classGuid);
        }
        TLRPC.User user = MessagesController.getInstance(dyVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(dyVar.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(dyVar.currentAccount).getCurrentUser();
        }
        if (user != null) {
            org.telegram.ui.Components.ki kiVar = dyVar.X3.f27911c;
            if (kiVar != null) {
                kiVar.c1();
            }
            org.telegram.ui.Components.e40 e40Var2 = dyVar.X3;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            e40Var2.o((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : false, new dv(dyVar, 0), new ev(dyVar, 0), 0);
        }
    }

    public static void D0(dy dyVar, float f10, ValueAnimator valueAnimator) {
        dyVar.f37629a0[0].setTranslationY((1.0f - dyVar.f37708p3) * f10);
        dyVar.f37708p3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i9 = 0; i9 < dyVar.actionBar.getChildCount(); i9++) {
            if (dyVar.actionBar.getChildAt(i9).getVisibility() == 0 && dyVar.actionBar.getChildAt(i9) != dyVar.actionBar.getActionMode() && dyVar.actionBar.getChildAt(i9) != dyVar.actionBar.getBackButton()) {
                dyVar.actionBar.getChildAt(i9).setAlpha(1.0f - dyVar.f37708p3);
            }
        }
        dyVar.E3();
        dyVar.w3();
        View view = dyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void E0(dy dyVar) {
        org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(dyVar.getParentActivity(), dyVar.resourceProvider);
        obVar.d(R.raw.email_check_inbox, new String[0]);
        obVar.f31343b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
        org.telegram.ui.Components.gc.g(dyVar, obVar, 2750).j();
        try {
            dyVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void F0(org.telegram.ui.dy r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dy.F0(org.telegram.ui.dy):void");
    }

    public static void G0(dy dyVar, BirthdayController.BirthdayState birthdayState) {
        if (birthdayState.today.size() == 1) {
            fh.p2 p2Var = new fh.p2(dyVar.getParentActivity(), dyVar.currentAccount, birthdayState.today.get(0).f22527id, null, null);
            p2Var.U(true);
            dyVar.showDialog(p2Var);
            return;
        }
        bg.g3.d0(0, birthdayState);
    }

    public static void H0(dy dyVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.gc M = org.telegram.ui.Components.oc.a0(dyVar).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
            M.f28737j = 5000;
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
            dyVar.getMessagesStorage().updateUserInfo(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (dyVar.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dyVar.getParentActivity(), 0, dyVar.resourceProvider);
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                dyVar.showDialog(alertDialog$Builder.f22702a);
                return;
            }
            return;
        }
        org.telegram.messenger.l0.p(R.string.UnknownError, org.telegram.ui.Components.oc.a0(dyVar), R.raw.error, 36);
    }

    public static void I0(dy dyVar) {
        MessagesController.getInstance(dyVar.currentAccount).removeSuggestion(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        dyVar.U4();
    }

    public static void N2(dy dyVar, float f10) {
        float f11;
        float f12;
        int i9;
        int i10;
        float clamp = Utilities.clamp(dyVar.f37728t1 * 2.0f, 1.0f, 0.0f);
        vw vwVar = dyVar.A0;
        float f13 = (1.0f - dyVar.f37708p3) * f10 * dyVar.D0;
        float f14 = 1.0f - clamp;
        vwVar.setAlpha(f13 * f14);
        int i11 = 0;
        if (!dyVar.G && !dyVar.I) {
            if (dyVar.H) {
                dyVar.A0.setTranslationY((Math.max(dyVar.J, -dyVar.U3()) + (-AndroidUtilities.dp(81.0f))) - AndroidUtilities.dp(8.0f));
                dyVar.A0.setProgressToCollapse(1.0f);
                vw vwVar2 = dyVar.A0;
                vwVar2.setClipTop((int) (AndroidUtilities.statusBarHeight - vwVar2.getY()));
            }
            f11 = 1.0f - dyVar.D0;
            dyVar.actionBar.setTranslationY(0.0f);
        } else {
            float clamp2 = Utilities.clamp((-dyVar.J) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
            if (dyVar.f37708p3 == 1.0f) {
                clamp2 = 1.0f;
            }
            float clamp3 = Utilities.clamp(clamp2 / 0.5f, 1.0f, 0.0f);
            dyVar.A0.setClipTop(0);
            if (!dyVar.G && dyVar.I) {
                dyVar.A0.setTranslationY((-AndroidUtilities.dp(81.0f)) - AndroidUtilities.dp(8.0f));
                dyVar.A0.setProgressToCollapse(1.0f);
                f12 = dyVar.D0;
            } else {
                dyVar.A0.setTranslationY(((dyVar.P / 2.0f) + (Math.max(dyVar.J, -dyVar.U3()) + dyVar.f37719r3)) - AndroidUtilities.dp(8.0f));
                dyVar.A0.l(clamp2, !dyVar.B3.c());
                if (!dyVar.I) {
                    f12 = dyVar.D0;
                } else {
                    f11 = 1.0f - clamp3;
                    dyVar.actionBar.setTranslationY(0.0f);
                }
            }
            f11 = 1.0f - f12;
            dyVar.actionBar.setTranslationY(0.0f);
        }
        float f15 = f11 * f14;
        if (f15 != 1.0f) {
            dyVar.actionBar.getTitlesContainer().setPivotY(AndroidUtilities.statusBarHeight);
            dyVar.actionBar.getTitlesContainer().setPivotX(AndroidUtilities.dp(20.0f));
            float f16 = (0.6f * f15) + 0.4f;
            dyVar.actionBar.getTitlesContainer().setScaleY(f16);
            dyVar.actionBar.getTitlesContainer().setScaleX(f16);
            dyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
            dyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-AndroidUtilities.dp(30.0f));
            dyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f16);
            dyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f16);
            float f17 = (1.0f - dyVar.f37708p3) * f15;
            dyVar.actionBar.getTitlesContainer().setAlpha(f17);
            FrameLayout titlesContainer = dyVar.actionBar.getTitlesContainer();
            int i12 = (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1));
            if (i12 > 0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            titlesContainer.setVisibility(i10);
            dyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f17);
            FrameLayout additionalSubTitleOverlayContainer = dyVar.actionBar.getAdditionalSubTitleOverlayContainer();
            if (i12 <= 0) {
                i11 = 4;
            }
            additionalSubTitleOverlayContainer.setVisibility(i11);
            return;
        }
        dyVar.actionBar.getTitlesContainer().setScaleY(1.0f);
        dyVar.actionBar.getTitlesContainer().setScaleX(1.0f);
        dyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
        dyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
        float f18 = 1.0f - dyVar.f37708p3;
        dyVar.actionBar.getTitlesContainer().setAlpha(f18);
        FrameLayout titlesContainer2 = dyVar.actionBar.getTitlesContainer();
        int i13 = (f18 > 0.0f ? 1 : (f18 == 0.0f ? 0 : -1));
        if (i13 > 0) {
            i9 = 0;
        } else {
            i9 = 4;
        }
        titlesContainer2.setVisibility(i9);
        dyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f18);
        FrameLayout additionalSubTitleOverlayContainer2 = dyVar.actionBar.getAdditionalSubTitleOverlayContainer();
        if (i13 <= 0) {
            i11 = 4;
        }
        additionalSubTitleOverlayContainer2.setVisibility(i11);
    }

    public static void O2(dy dyVar, Canvas canvas, int i9) {
        org.telegram.ui.ActionBar.b5 b5Var;
        if (dyVar.parentLayout != null && dyVar.actionBar != null) {
            float max = Math.max(dyVar.f37649e.f47775e, dyVar.V3());
            float f10 = 1.0f;
            float f11 = 1.0f - dyVar.f37728t1;
            float f12 = max * f11 * f11;
            int i10 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
            if (i10 != 0) {
                if (-1 >= i9) {
                    i9 = -1;
                    f10 = 0.0f;
                }
                if (f10 > 0.0f && i10 > 0 && i9 > 0 && (b5Var = dyVar.parentLayout) != null) {
                    ((ActionBarLayout) b5Var).p(canvas, (int) (f10 * 255.0f * f12), i9);
                }
            }
        }
    }

    public static org.telegram.ui.Cells.r2 Q3(cy cyVar) {
        yx yxVar = cyVar.f37350a;
        for (int i9 = 0; i9 < yxVar.getChildCount(); i9++) {
            View childAt = yxVar.getChildAt(i9);
            if (childAt instanceof org.telegram.ui.Cells.r2) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                if (r2Var.O()) {
                    return r2Var;
                }
            }
        }
        return null;
    }

    public static void T(dy dyVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        MessagesController.getInstance(dyVar.currentAccount).removeSuggestion(0L, tL_pendingSuggestion.suggestion);
        dyVar.U4();
    }

    public static void U(dy dyVar, float f10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dyVar.f37708p3 = floatValue;
        dyVar.f37629a0[0].setTranslationY((-f10) * floatValue);
        for (int i9 = 0; i9 < dyVar.actionBar.getChildCount(); i9++) {
            if (dyVar.actionBar.getChildAt(i9).getVisibility() == 0 && dyVar.actionBar.getChildAt(i9) != dyVar.actionBar.getActionMode() && dyVar.actionBar.getChildAt(i9) != dyVar.actionBar.getBackButton()) {
                dyVar.actionBar.getChildAt(i9).setAlpha(1.0f - dyVar.f37708p3);
            }
        }
        View view = dyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        dyVar.E3();
        dyVar.w3();
    }

    public static void W(dy dyVar) {
        ArrayList arrayList = dyVar.E2;
        org.telegram.ui.ActionBar.b5 b5Var = dyVar.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).y()) {
            dyVar.finishPreviewFragment();
        } else if (dyVar.N0 == 10) {
            if (dyVar.f37752y2 != null && !arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i9)).longValue(), 0L));
                }
                dyVar.f37752y2.v(dyVar, arrayList2, null, false, dyVar.F2, dyVar.G2, dyVar.H2, null);
            }
        } else if (MessagesController.getInstance(dyVar.currentAccount).isFrozen()) {
            b.b(dyVar.currentAccount);
        } else {
            dyVar.presentFragment(new ContactsActivity(aa.d.i("destroyAfterSelect", true)));
        }
    }

    public static void X(dy dyVar) {
        MessagesController.getInstance(dyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
        dyVar.U4();
    }

    public static void Y(dy dyVar) {
        PasskeysActivity.Z(dyVar.currentAccount, dyVar.getParentActivity(), dyVar.resourceProvider, true);
    }

    public static void Z(dy dyVar, int i9, org.telegram.ui.Components.x60 x60Var) {
        CharSequence charSequence;
        if (dyVar.currentAccount != i9) {
            x60Var.u();
            if (dyVar.getParentActivity() == null) {
                return;
            }
            wx wxVar = dyVar.f37752y2;
            LaunchActivity launchActivity = (LaunchActivity) dyVar.getParentActivity();
            ArrayList arrayList = dyVar.f37756z2;
            String str = dyVar.A2;
            CharSequence charSequence2 = dyVar.B2;
            ow owVar = dyVar.f37746x1;
            if (owVar != null) {
                charSequence = owVar.getFieldText();
            } else {
                charSequence = null;
            }
            launchActivity.K0(i9);
            dy dyVar2 = new dy(dyVar.arguments);
            dyVar2.f37752y2 = wxVar;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList.isEmpty()) {
                    dyVar2.f37756z2 = null;
                } else {
                    dyVar2.f37756z2 = arrayList;
                    dyVar2.A2 = null;
                    if (dyVar2.f37746x1 != null) {
                        dyVar2.l3(charSequence);
                    } else {
                        dyVar2.R3 = charSequence;
                    }
                }
            } else if (str != null) {
                dyVar2.E4(charSequence, str);
            } else if (charSequence2 != null) {
                if (charSequence2.length() == 0) {
                    dyVar2.B2 = null;
                } else {
                    dyVar2.B2 = charSequence2;
                    dyVar2.A2 = null;
                    dyVar2.f37756z2 = null;
                    if (dyVar2.f37746x1 != null) {
                        dyVar2.l3(charSequence);
                    } else {
                        dyVar2.R3 = charSequence;
                    }
                }
            }
            launchActivity.q0(dyVar2, false, true);
        }
    }

    public static void a0(dy dyVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(dyVar.currentAccount).getClientUserId());
        dyVar.presentFragment(new qn(bundle));
    }

    public static void b0(dy dyVar, TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = dyVar.getMessagesController().getUserFull(dyVar.getUserConfig().getClientUserId());
        if (userFull != null) {
            tL_birthday2 = userFull.birthday;
        } else {
            tL_birthday2 = null;
        }
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        dyVar.getMessagesController().invalidateContentSettings();
        dyVar.getConnectionsManager().sendRequest(updatebirthday, new y9(dyVar, userFull, tL_birthday2, 8), 1024);
        MessagesController.getInstance(dyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        dyVar.U4();
    }

    public static void c0(dy dyVar, String str) {
        MessagesController.getInstance(dyVar.currentAccount).removeSuggestion(0L, str);
        dyVar.U4();
    }

    public static void d0(dy dyVar, cy cyVar, View view, int i9) {
        int i10;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        if (view instanceof org.telegram.ui.Cells.v3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.r2;
        if (z10) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            if (r2Var.f25000j2) {
                dyVar.N4(r2Var.getDialogId(), view);
                return;
            }
        }
        if (dyVar.I3()) {
            dyVar.o4(view, i9, 0.0f, cyVar.d);
            return;
        }
        int i11 = dyVar.N0;
        if (i11 == 15 && (view instanceof org.telegram.ui.Cells.p8)) {
            cyVar.d.K();
            return;
        }
        int i12 = 0;
        if ((i11 == 11 || i11 == 13) && i9 == 1) {
            Bundle i13 = aa.d.i("forImport", true);
            i13.putLongArray("result", new long[]{dyVar.getUserConfig().getClientUserId()});
            i13.putInt("chatType", 4);
            String string = dyVar.arguments.getString("importTitle");
            if (string != null) {
                i13.putString("title", string);
            }
            r60 r60Var = new r60(i13);
            r60Var.U = new iw(dyVar);
            dyVar.presentFragment(r60Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.z2) && ((i10 = cyVar.f37357s) == 7 || i10 == 8)) {
            of.k kVar = (of.k) cyVar.d.I.get(0);
            if (kVar != null && kVar.f48814a == 17) {
                tL_chatlists_chatlistUpdates = kVar.f19389i;
            } else {
                tL_chatlists_chatlistUpdates = null;
            }
            if (tL_chatlists_chatlistUpdates != null) {
                MessagesController.DialogFilter dialogFilter = dyVar.getMessagesController().selectedDialogFilter[cyVar.f37357s - 7];
                if (dialogFilter != null) {
                    int i14 = dialogFilter.f19649id;
                    ?? saVar = new org.telegram.ui.Components.sa(dyVar, false);
                    saVar.U = -1;
                    saVar.Y = "";
                    saVar.Z = new ArrayList();
                    saVar.f30959b0 = "";
                    saVar.f30961d0 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    saVar.f30962e0 = arrayList;
                    saVar.f30978v0 = -1;
                    saVar.f30981y0 = -5;
                    saVar.U = i14;
                    saVar.W = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    saVar.f30960c0 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList<MessagesController.DialogFilter> arrayList2 = dyVar.getMessagesController().dialogFilters;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i12 >= arrayList2.size()) {
                                break;
                            } else if (arrayList2.get(i12).f19649id == i14) {
                                saVar.Y = arrayList2.get(i12).name;
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                    saVar.R();
                    dyVar.showDialog(saVar);
                    return;
                }
                return;
            }
        } else if (z10 && !dyVar.actionBar.s() && !dyVar.B3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.r2) view).U1;
            AndroidUtilities.rectTmp.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        }
        dyVar.n4(view, i9, cyVar.d);
    }

    public static void d4(qn qnVar, MessageObject messageObject) {
        CharSequence charSequence;
        if (messageObject != null && messageObject.hasHighlightedWords()) {
            try {
                if (!TextUtils.isEmpty(messageObject.caption)) {
                    charSequence = messageObject.caption;
                } else {
                    charSequence = messageObject.messageText;
                }
                CharSequence highlightText = AndroidUtilities.highlightText(charSequence, messageObject.highlightedWords, (org.telegram.ui.ActionBar.b6) null);
                if (highlightText instanceof SpannableStringBuilder) {
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) highlightText;
                    org.telegram.ui.Components.p00[] p00VarArr = (org.telegram.ui.Components.p00[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.p00.class);
                    if (p00VarArr.length > 0) {
                        int spanStart = spannableStringBuilder.getSpanStart(p00VarArr[0]);
                        int spanEnd = spannableStringBuilder.getSpanEnd(p00VarArr[0]);
                        for (int i9 = 1; i9 < p00VarArr.length; i9++) {
                            int spanStart2 = spannableStringBuilder.getSpanStart(p00VarArr[i9]);
                            int spanStart3 = spannableStringBuilder.getSpanStart(p00VarArr[i9]);
                            if (spanStart2 != spanEnd) {
                                if (spanStart2 > spanEnd) {
                                    for (int i10 = spanEnd; i10 <= spanStart2; i10++) {
                                        if (!Character.isWhitespace(spannableStringBuilder.charAt(i10))) {
                                            break;
                                        }
                                    }
                                }
                            }
                            spanEnd = spanStart3;
                        }
                        qnVar.mb(messageObject.getRealId(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public static void e0(dy dyVar) {
        dyVar.presentFragment(new PrivacySettingsActivity());
        AndroidUtilities.scrollToFragmentRow(dyVar.parentLayout, "newChatsRow");
    }

    public static void f1(dy dyVar, boolean z10) {
        if (dyVar.f37629a0 != null && dyVar.J3 != z10) {
            dyVar.J3 = z10;
            int i9 = 0;
            while (true) {
                cy[] cyVarArr = dyVar.f37629a0;
                if (i9 < cyVarArr.length) {
                    if (z10) {
                        cyVarArr[i9].f37350a.setScrollbarFadingEnabled(false);
                    }
                    dyVar.f37629a0[i9].f37350a.setVerticalScrollBarEnabled(z10);
                    if (z10) {
                        dyVar.f37629a0[i9].f37350a.setScrollbarFadingEnabled(true);
                    }
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    public static void g0(dy dyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        if (dyVar.getParentActivity() != null) {
            dyVar.f37707p2 = false;
            if (z10 || z11 || z12) {
                dyVar.f37740w0 = true;
                if (z10 && qj0.n(activity)) {
                    org.telegram.ui.Components.kd0.g(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.tm(1, new df(27, dyVar, activity)));
                } else if (z11 && dyVar.Q1 && dyVar.getUserConfig().syncContacts && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.y4.w(activity, new mv(dyVar, 0)).f22702a;
                    dyVar.P1 = c2Var;
                    dyVar.showDialog(c2Var);
                } else if (z12 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    if (activity instanceof g5) {
                        org.telegram.ui.ActionBar.c2 w8 = ((g5) activity).w(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                        dyVar.P1 = w8;
                        dyVar.showDialog(w8);
                    }
                } else {
                    dyVar.k3(true);
                }
            }
        }
    }

    public static void h0(dy dyVar) {
        if (dyVar.X3.h()) {
            MessagesController.getInstance(dyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
            dyVar.U4();
        }
    }

    public static void i4(AccountInstance accountInstance) {
        int currentAccount = accountInstance.getCurrentAccount();
        boolean[] zArr = f37626u4;
        if (!zArr[currentAccount]) {
            MessagesController messagesController = accountInstance.getMessagesController();
            messagesController.loadGlobalNotificationsSettings();
            messagesController.loadDialogs(0, 0, 100, true);
            messagesController.loadHintDialogs();
            messagesController.loadUserInfo(accountInstance.getUserConfig().getCurrentUser(), false, 0);
            accountInstance.getContactsController().checkInviteText();
            accountInstance.getMediaDataController().checkAllMedia(false);
            AndroidUtilities.runOnUIThread(new ri(accountInstance, 18), 200L);
            Iterator<String> it = messagesController.diceEmojies.iterator();
            while (it.hasNext()) {
                accountInstance.getMediaDataController().loadStickersByEmojiOrName(it.next(), true, true);
            }
            zArr[currentAccount] = true;
        }
    }

    public static void j0(dy dyVar) {
        MessagesController.getInstance(dyVar.currentAccount).removeSuggestion(0L, "PREMIUM_GRACE");
        dyVar.U4();
    }

    public static void k0(dy dyVar) {
        MessagesController.getInstance(dyVar.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
        dyVar.U4();
    }

    public static void l0(dy dyVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        bg.i2 i2Var;
        try {
            c2Var.dismiss();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (tLObject != null) {
            dyVar.arguments.getString("importTitle");
            String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
            bg.i2 i2Var2 = new bg.i2(dyVar, j10, 25);
            Pattern pattern = org.telegram.ui.Components.y4.f34847a;
            if (dyVar.getParentActivity() != null) {
                if (chat != null || user != null) {
                    int currentAccount = dyVar.getCurrentAccount();
                    Activity parentActivity = dyVar.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
                    TextView textView = new TextView(parentActivity);
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23108j5, false));
                    textView.setTextSize(1, 16.0f);
                    int i15 = 5;
                    if (LocaleController.isRTL) {
                        i9 = 5;
                    } else {
                        i9 = 3;
                    }
                    textView.setGravity(i9 | 48);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    alertDialog$Builder.n(frameLayout);
                    org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
                    z8Var.u(AndroidUtilities.dp(12.0f));
                    org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(parentActivity);
                    o9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                    if (LocaleController.isRTL) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    frameLayout.addView(o9Var, g7.e6.d(40, 40.0f, i10 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(parentActivity);
                    textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E8, false));
                    textView2.setTextSize(1, 20.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    if (LocaleController.isRTL) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView2.setGravity(i11 | 16);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setText(LocaleController.getString(R.string.ImportMessages));
                    boolean z10 = LocaleController.isRTL;
                    if (z10) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    int i16 = i12 | 48;
                    if (z10) {
                        i13 = 21;
                    } else {
                        i13 = 76;
                    }
                    float f10 = i13;
                    if (z10) {
                        i14 = 76;
                    } else {
                        i14 = 21;
                    }
                    frameLayout.addView(textView2, g7.e6.d(-1, -2.0f, i16, f10, 11.0f, i14, 0.0f));
                    if (!LocaleController.isRTL) {
                        i15 = 3;
                    }
                    frameLayout.addView(textView, g7.e6.d(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                    if (user != null) {
                        if (UserObject.isReplyUser(user)) {
                            z8Var.f35234p = 0.8f;
                            z8Var.g(12);
                            o9Var.h(null, null, z8Var, user);
                            i2Var = i2Var2;
                        } else {
                            i2Var = i2Var2;
                            if (user.f22527id == clientUserId) {
                                z8Var.f35234p = 0.8f;
                                z8Var.g(1);
                                o9Var.h(null, null, z8Var, user);
                            } else {
                                z8Var.f35234p = 1.0f;
                                z8Var.m(currentAccount, user);
                                o9Var.e(user, z8Var);
                            }
                        }
                    } else {
                        i2Var = i2Var2;
                        z8Var.k(currentAccount, chat);
                        o9Var.e(chat, z8Var);
                    }
                    textView.setText(AndroidUtilities.replaceTags(str));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Import), new org.telegram.ui.Components.s(i2Var, 3));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    dyVar.showDialog(alertDialog$Builder.f22702a);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.y4.f0(dyVar.currentAccount, tL_error, dyVar, tL_messages_checkHistoryImportPeer, new Object[0]);
        dyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j10), tL_messages_checkHistoryImportPeer, tL_error);
    }

    public static void m0(dy dyVar, int i9) {
        Object obj;
        TLRPC.User user;
        org.telegram.ui.Components.vm0 vm0Var = dyVar.f37750y0.f29145k0;
        if (i9 >= vm0Var.T && i9 < vm0Var.U) {
            org.telegram.ui.Components.l41 G = vm0Var.G(i9);
            if (G != null) {
                obj = G.G;
            } else {
                obj = null;
            }
        } else {
            obj = Boolean.FALSE;
        }
        if (obj instanceof TLRPC.User) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dyVar.getParentActivity(), 0, dyVar.resourceProvider);
            String string = LocaleController.getString(R.string.AppsClearSearch);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            c2Var.N = string;
            c2Var.P = LocaleController.formatString(R.string.AppsClearSearchAlert, "\"" + UserObject.getUserName(user) + "\"");
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new yr(5, dyVar, (TLRPC.User) obj));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        }
    }

    public static void n0(dy dyVar, int i9, ArrayList arrayList, boolean z10, HashSet hashSet) {
        HashSet hashSet2;
        if (i9 == 102) {
            dyVar.getMessagesController().setDialogsInTransaction(true);
            if (z10) {
                hashSet2 = hashSet;
            } else {
                hashSet2 = null;
            }
            dyVar.r4(arrayList, i9, false, false, hashSet2);
            dyVar.getMessagesController().setDialogsInTransaction(false);
            dyVar.getMessagesController().checkIfFolderEmpty(dyVar.R2);
            int i10 = dyVar.R2;
            if (i10 != 0 && dyVar.R3(dyVar.currentAccount, dyVar.f37629a0[0].f37357s, i10, false).size() == 0) {
                dyVar.f37629a0[0].f37350a.setEmptyView(null);
                dyVar.f37629a0[0].f37358w.setVisibility(4);
                dyVar.finishFragment();
                return;
            }
            return;
        }
        dyVar.r4(arrayList, i9, false, false, null);
    }

    public static void p0(dy dyVar) {
        String str;
        MessagesController messagesController = MessagesController.getInstance(dyVar.currentAccount);
        if (dyVar.f37743w3) {
            str = "PREMIUM_UPGRADE";
        } else {
            str = "PREMIUM_ANNUAL";
        }
        messagesController.removeSuggestion(0L, str);
        dyVar.U4();
    }

    public static void q0(Activity activity, Boolean bool) {
        if (!bool.booleanValue()) {
            return;
        }
        if (!org.telegram.ui.Components.kd0.c()) {
            org.telegram.ui.Components.kd0.h();
        } else {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
        }
    }

    public static void q1(dy dyVar, cy cyVar, float f10) {
        if (dyVar.P != f10) {
            dyVar.P = f10;
            int i9 = 0;
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i10 == 0) {
                dyVar.Q = false;
            }
            dyVar.A0.setOverscroll(f10);
            cyVar.f37350a.setViewsOffset(f10);
            yx yxVar = cyVar.f37350a;
            if (i10 != 0) {
                i9 = 2;
            }
            yxVar.setOverScrollMode(i9);
            dyVar.fragmentView.invalidate();
            if (f10 > AndroidUtilities.dp(90.0f) && !dyVar.Q) {
                vw vwVar = dyVar.A0;
                ValueAnimator valueAnimator = vwVar.D0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    vwVar.i(vwVar.f12034l0, true);
                    dyVar.Q = true;
                    dyVar.getOrCreateStoryViewer().s(new dv(dyVar, 18));
                }
            }
        }
    }

    public static void r0(dy dyVar) {
        b.c(dyVar.getParentActivity(), dyVar.currentAccount, dyVar.getResourceProvider());
    }

    public static boolean r1(dy dyVar, cy cyVar) {
        if (!dyVar.B3.c()) {
            int i9 = (int) (-dyVar.J);
            int T3 = dyVar.T3();
            int U3 = dyVar.U3();
            if (i9 != 0 && i9 != T3 && i9 != U3 && cyVar.f37350a.canScrollVertically(-1)) {
                if (U3 < i9 && i9 < T3) {
                    int dp = AndroidUtilities.dp(48.0f);
                    int i10 = i9 - U3;
                    if (i10 < dp / 2) {
                        cyVar.f37351b.k(-i10);
                        return true;
                    }
                    cyVar.f37351b.k(dp - i10);
                    return true;
                }
                float f10 = 1.0f;
                if (dyVar.f37708p3 != 1.0f) {
                    f10 = Utilities.clamp((-dyVar.J) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
                }
                if (f10 < dyVar.A0.f12050x0) {
                    cyVar.f37351b.k(-i9);
                    return true;
                }
                cyVar.f37351b.k(U3 - i9);
                return true;
            }
            return false;
        }
        return false;
    }

    public static void s0(final int i9, final long j10, TLRPC.Chat chat, final dy dyVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        int i13;
        dyVar.b4(false);
        if (i9 == 103 && ChatObject.isChannel(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || ChatObject.isPublic(chat2)) {
                dyVar.getMessagesController().deleteDialog(j10, 2, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i9 == 102 && (i13 = dyVar.R2) != 0 && dyVar.R3(dyVar.currentAccount, dyVar.f37629a0[0].f37357s, i13, false).size() == 1) {
            dyVar.f37629a0[0].f37358w.setVisibility(4);
        }
        dyVar.f37734u3 = 3;
        int i14 = -1;
        if (i9 == 102) {
            dyVar.A4(true, true);
            if (dyVar.N1 != null) {
                i12 = 0;
                while (i12 < dyVar.N1.size()) {
                    if (((TLRPC.Dialog) dyVar.N1.get(i12)).f22384id == j10) {
                        break;
                    }
                    i12++;
                }
            }
            i12 = -1;
            dyVar.o3();
            i10 = i12;
        } else {
            i10 = -1;
        }
        UndoView Y3 = dyVar.Y3();
        if (Y3 != null) {
            if (i9 == 103) {
                i11 = 0;
            } else if (z11) {
                i11 = 1;
            } else {
                i11 = 95;
            }
            Y3.j(i11, j10, new Runnable() {
                @Override
                public final void run() {
                    dyVar.q4(i9, j10, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(dyVar.R3(dyVar.currentAccount, dyVar.f37629a0[0].f37357s, dyVar.R2, false));
        int i15 = 0;
        while (true) {
            if (i15 >= arrayList2.size()) {
                break;
            } else if (((TLRPC.Dialog) arrayList2.get(i15)).f22384id == j10) {
                i14 = i15;
                break;
            } else {
                i15++;
            }
        }
        if (i9 == 102) {
            if (i10 >= 0 && i14 < 0 && (arrayList = dyVar.N1) != null) {
                arrayList.remove(i10);
                dyVar.f37629a0[0].f37359x.D();
                dyVar.f37629a0[0].q(true);
                return;
            }
            dyVar.A4(false, true);
        }
    }

    public static String s2(dy dyVar) {
        String shortName;
        ArrayList arrayList = dyVar.E2;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() < 3) {
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                long longValue = ((Long) obj).longValue();
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                if (longValue == dyVar.getUserConfig().getClientUserId()) {
                    sb2.append(LocaleController.getString(R.string.SavedMessages));
                } else {
                    if (arrayList.size() == 1) {
                        shortName = DialogObject.getName(dyVar.currentAccount, longValue);
                    } else {
                        shortName = DialogObject.getShortName(dyVar.currentAccount, longValue);
                    }
                    sb2.append(shortName);
                }
            }
            return LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        }
        return LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]);
    }

    public static void t0(dy dyVar) {
        BirthdayController.getInstance(dyVar.currentAccount).hide();
        MessagesController.getInstance(dyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_CONTACTS_TODAY");
        dyVar.U4();
        org.telegram.ui.Components.gc G = org.telegram.ui.Components.oc.a0(dyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f28737j = 5000;
        G.j();
    }

    public static void u0(dy dyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
            LaunchActivity.C0(launchActivity, dyVar.currentAccount, tL_attachMenuBot, null, true);
        } else {
            fi1.a(dyVar.getParentActivity(), new eh(dyVar, tL_attachMenuBot, launchActivity), null);
        }
    }

    public static void v0(dy dyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.C0(launchActivity, dyVar.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(dyVar.currentAccount).updateAttachMenuBotsInCache();
    }

    public static void w0(dy dyVar) {
        MessagesController.getInstance(dyVar.currentAccount).removeSuggestion(0L, "PREMIUM_RESTORE");
        dyVar.U4();
    }

    public static void x0(dy dyVar) {
        if (!dyVar.K3) {
            kh.x3 x3Var = dyVar.m0;
            if (x3Var != null) {
                if (x3Var.R) {
                    return;
                }
                AndroidUtilities.removeFromParent(x3Var);
            }
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.f6.Gi, 0, new uv(dyVar, 7));
            kh.x3 x3Var2 = new kh.x3(dyVar.getParentActivity(), 2);
            x3Var2.r(8.0f);
            x3Var2.d = 8000L;
            x3Var2.i();
            x3Var2.q(true);
            x3Var2.h = AndroidUtilities.displaySize.x - AndroidUtilities.dp(148.0f);
            x3Var2.t(replaceSingleTag);
            x3Var2.m(1.0f, -40.0f);
            x3Var2.h(dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.Fi));
            dyVar.m0 = x3Var2;
            x3Var2.setTranslationY((-dyVar.f37643c4) - dyVar.f37654e4);
            ((ViewGroup) dyVar.fragmentView).addView(dyVar.m0, g7.e6.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
            dyVar.m0.v();
            return;
        }
        kh.x3 x3Var3 = dyVar.f37686l0;
        if (x3Var3 != null) {
            x3Var3.e(true);
        }
        ih.p6 o6 = MessagesController.getInstance(dyVar.currentAccount).getStoriesController().o();
        if (o6 != null && o6.a(dyVar.currentAccount, 1)) {
            dyVar.showDialog(new zf.j0(o6.b(), dyVar.currentAccount, dyVar.getParentActivity(), dyVar, null));
            return;
        }
        kh.wb E = kh.wb.E(dyVar.getParentActivity(), dyVar.currentAccount);
        E.f16321x = new ix(dyVar, 4);
        E.R(null);
    }

    public static void y0(dy dyVar) {
        MessagesController.getInstance(dyVar.currentAccount).removeSuggestion(0L, "PREMIUM_CHRISTMAS");
        dyVar.U4();
        org.telegram.ui.Components.gc G = org.telegram.ui.Components.oc.a0(dyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f28737j = 5000;
        G.j();
    }

    public static void z0(Activity activity, Boolean bool) {
        if (!bool.booleanValue()) {
            return;
        }
        if (!org.telegram.ui.Components.kd0.c()) {
            org.telegram.ui.Components.kd0.h();
        } else {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
        }
    }

    @Override
    public final List A() {
        return Arrays.asList(new uf.a(LocaleController.getString(R.string.DebugDialogsActivity)), new uf.a(LocaleController.getString(R.string.ClearLocalDatabase), new dv(this, 27)), new uf.a(LocaleController.getString(R.string.DebugClearSendMessageAsPeers), new dv(this, 28)));
    }

    public final void A3() {
        org.telegram.ui.Components.j10.d(this.f37666h0, e2.c.C(this.f37632b.f47775e, 1.0f - V3(), 1.0f - this.f37638c.f47775e, this.d.f47775e));
    }

    public final void A4(boolean z10, boolean z11) {
        if (this.f37629a0 != null && this.O1 != z10) {
            if (z10) {
                this.N1 = new ArrayList(R3(this.currentAccount, this.f37629a0[0].f37357s, this.R2, false));
            } else {
                this.N1 = null;
            }
            this.O1 = z10;
            cy cyVar = this.f37629a0[0];
            cyVar.d.C = z10;
            if (!z10 && z11) {
                if (cyVar.f37350a.b0()) {
                    this.f37629a0[0].f37350a.post(new uv(this, 8));
                } else {
                    this.f37629a0[0].d.l();
                }
            }
        }
    }

    @Override
    public final void B(float f10, int i9) {
        org.telegram.ui.ActionBar.w0 w0Var;
        if (i9 == 3 && (w0Var = this.f37666h0) != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) w0Var.getIconView().getDrawable();
            if (this.d.f47776f) {
                animatedVectorDrawable.start();
                if (SharedConfig.getDevicePerformanceClass() != 0) {
                    TLRPC.TL_help_premiumPromo premiumPromo = MediaDataController.getInstance(this.currentAccount).getPremiumPromo();
                    String k02 = PremiumPreviewFragment.k0(2);
                    if (premiumPromo != null) {
                        int i10 = 0;
                        while (true) {
                            if (i10 < premiumPromo.video_sections.size()) {
                                if (premiumPromo.video_sections.get(i10).equals(k02)) {
                                    break;
                                }
                                i10++;
                            } else {
                                i10 = -1;
                                break;
                            }
                        }
                        if (i10 != -1) {
                            FileLoader.getInstance(this.currentAccount).loadFile(premiumPromo.videos.get(i10), premiumPromo, 3, 0);
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

    public final void B3() {
        boolean z10;
        fh.l2 l2Var;
        if (!this.f37658f2 && ((l2Var = this.G0) == null || l2Var.getBackground() == null || this.G0.getAlpha() < 0.01f || this.G0.getVisibility() == 8)) {
            z10 = true;
        } else {
            z10 = false;
        }
        kg0 kg0Var = this.E3;
        if (kg0Var != null) {
            kg0Var.f39830a.v.a(z10, true);
        }
    }

    public final void B4(boolean z10) {
        cy cyVar;
        if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
            if (z10) {
                cy[] cyVarArr = this.f37629a0;
                if (cyVarArr != null && (cyVar = cyVarArr[0]) != null) {
                    cyVar.setLayerType(2, null);
                    this.f37629a0[0].setClipChildren(false);
                    this.f37629a0[0].setClipToPadding(false);
                    this.f37629a0[0].f37350a.setClipChildren(false);
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
            if (this.f37629a0 != null) {
                int i9 = 0;
                while (true) {
                    cy[] cyVarArr2 = this.f37629a0;
                    if (i9 >= cyVarArr2.length) {
                        break;
                    }
                    cy cyVar2 = cyVarArr2[i9];
                    if (cyVar2 != null) {
                        cyVar2.setLayerType(0, null);
                        cyVar2.setClipChildren(true);
                        cyVar2.setClipToPadding(true);
                        cyVar2.f37350a.setClipChildren(true);
                    }
                    i9++;
                }
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setLayerType(0, null);
            }
            vw vwVar = this.A0;
            if (vwVar != null) {
                vwVar.setLayerType(0, null);
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
        org.telegram.ui.Components.j10.d(this.f37661g0, (1.0f - this.f37632b.f47775e) * (1.0f - V3()) * (1.0f - this.f37638c.f47775e));
        x3();
        A3();
        y3();
        z3();
    }

    public final void C4(float f10) {
        cy[] cyVarArr = this.f37629a0;
        int i9 = 0;
        if (cyVarArr != null) {
            int paddingTop = cyVarArr[0].f37350a.getPaddingTop() + ((int) f10);
            int i10 = 0;
            while (true) {
                cy[] cyVarArr2 = this.f37629a0;
                if (i10 >= cyVarArr2.length) {
                    break;
                }
                cyVarArr2[i10].f37350a.setTopGlowOffset(paddingTop);
                i10++;
            }
        }
        if (this.fragmentView != null && f10 != this.J) {
            this.J = f10;
            org.telegram.ui.Components.gc gcVar = this.f37679j3;
            if (gcVar != null) {
                gcVar.l();
            }
            if (this.A3 != null) {
                float currentActionBarHeight = 1.0f - ((-f10) / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                org.telegram.ui.Cells.o oVar = this.A3;
                float f11 = (int) f10;
                float f12 = oVar.f24785f;
                oVar.h = f11;
                oVar.setTranslationY(f12 + f11);
                this.A3.setAlpha(g7.n.a(currentActionBarHeight, 0.0f, 1.0f));
                org.telegram.ui.Cells.o oVar2 = this.A3;
                if (currentActionBarHeight <= 0.0f) {
                    i9 = 4;
                }
                oVar2.setVisibility(i9);
            }
            E3();
            this.fragmentView.invalidate();
        }
    }

    public final void D3() {
        int i9;
        if (V3() > 0.5f) {
            i9 = R.string.SearchTopics;
        } else {
            i9 = R.string.SearchChats;
        }
        String string = LocaleController.getString(i9);
        this.T.f30664r.setContentDescription(string);
        this.T.f30664r.setHint(string);
    }

    public final void D4(float f10) {
        int i9;
        int i10;
        this.f37728t1 = f10;
        if (this.f37698n3 && this.actionBar != null) {
            if (this.R2 == 0 && this.T2 == 0) {
                i9 = org.telegram.ui.ActionBar.f6.f23321v8;
            } else {
                i9 = org.telegram.ui.ActionBar.f6.O8;
            }
            int themedColor = getThemedColor(i9);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.f6.f23371y8;
            kVar.C(i0.a.d(this.f37728t1, themedColor, getThemedColor(i11)), false);
            this.actionBar.C(i0.a.d(this.f37728t1, getThemedColor(i11), getThemedColor(i11)), true);
            if (this.R2 == 0 && this.T2 == 0) {
                i10 = org.telegram.ui.ActionBar.f6.f23287t8;
            } else {
                i10 = org.telegram.ui.ActionBar.f6.N8;
            }
            int themedColor2 = getThemedColor(i10);
            this.actionBar.A(i0.a.d(this.f37728t1, themedColor2, getThemedColor(org.telegram.ui.ActionBar.f6.f23388z8)), false);
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
        float f10;
        int i9;
        if (this.T == null) {
            return;
        }
        float a2 = 1.0f - g7.n.a(((-this.J) - U3()) / AndroidUtilities.dp(48.0f), 0.0f, 1.0f);
        float max = Math.max(this.f37708p3, this.h.f47775e);
        float f11 = this.f37632b.f47775e;
        if (this.N0 != 2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float max2 = f10 * (1.0f - this.f37638c.f47775e) * (1.0f - max) * Math.max(f11, (1.0f - V3()) * a2);
        this.T.setAlpha(max2);
        sx sxVar = this.T;
        boolean z10 = false;
        if (max2 > 0.0f) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        sxVar.setVisibility(i9);
        if (max2 <= 0.01f) {
            z10 = true;
        }
        this.f37655f.a(z10, true);
    }

    public final void E4(CharSequence charSequence, String str) {
        if (str != null && !str.isEmpty()) {
            this.A2 = str;
            this.B2 = null;
            this.f37756z2 = null;
            if (this.f37746x1 != null) {
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
        int i9;
        float f10;
        int i10;
        int i11 = 8;
        if (this.V != null) {
            if (this.W != null) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float f11 = f10 * this.f37632b.f47775e;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, f11);
            this.V.setScaleX(lerp);
            this.V.setScaleY(lerp);
            this.V.setAlpha(f11);
            o31 o31Var = this.V;
            if (f11 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            o31Var.setVisibility(i10);
        }
        org.telegram.ui.Components.m71 m71Var = this.W;
        td.a aVar = this.f37721s;
        if (m71Var != null) {
            float f12 = 1.0f - aVar.f47775e;
            m71Var.setAlpha(f12);
            org.telegram.ui.Components.m71 m71Var2 = this.W;
            if (f12 > 0.0f) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            m71Var2.setVisibility(i9);
        }
        of.o0 o0Var = this.X;
        if (o0Var != null) {
            float f13 = aVar.f47775e;
            o0Var.setAlpha(f13);
            of.o0 o0Var2 = this.X;
            if (f13 > 0.0f) {
                i11 = 0;
            }
            o0Var2.setVisibility(i11);
        }
    }

    public final void F4(float f10) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.T3 != f10) {
            boolean z10 = true;
            if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
                z10 = false;
            }
            this.U3 = z10;
            this.T3 = f10;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.U3) {
                float f11 = (1.0f - this.T3) * (-AndroidUtilities.dp(40.0f));
                vw vwVar = this.A0;
                if (vwVar != null) {
                    vwVar.setTranslationX(f11);
                }
                sx sxVar = this.T;
                if (sxVar != null) {
                    sxVar.setTranslationX(f11);
                }
                yw ywVar = this.B3;
                if (ywVar != null && ywVar.getFragmentView() != null && !this.f37749y) {
                    this.B3.getFragmentView().setTranslationX(f11);
                    return;
                }
                return;
            }
            float f12 = 1.0f - this.T3;
            float f13 = (-AndroidUtilities.dp(4.0f)) * f12;
            float f14 = 1.0f - (f12 * 0.05f);
            vw vwVar2 = this.A0;
            if (vwVar2 != null) {
                vwVar2.setScaleX(f14);
                this.A0.setScaleY(f14);
                this.A0.setTranslationX(f13);
                this.A0.setPivotX(0.0f);
                this.A0.setPivotY(0.0f);
            }
            sx sxVar2 = this.T;
            if (sxVar2 != null) {
                sxVar2.setTranslationX(f13);
                this.T.setScaleX(f14);
                this.T.setScaleY(f14);
            }
            yw ywVar2 = this.B3;
            if (ywVar2 != null && ywVar2.getFragmentView() != null) {
                if (!this.f37749y) {
                    this.B3.getFragmentView().setScaleX(f14);
                    this.B3.getFragmentView().setScaleY(f14);
                    this.B3.getFragmentView().setTranslationX(f13);
                }
                this.B3.getFragmentView().setPivotX(0.0f);
                this.B3.getFragmentView().setPivotY(0.0f);
            }
        }
    }

    public final void G3(boolean z10) {
        int i9;
        int i10;
        if (this.f37750y0 != null && this.actionBar != null) {
            int i11 = AndroidUtilities.navigationBarHeight;
            int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f37628a);
            if (this.W != null) {
                i9 = AndroidUtilities.dp(50.0f);
            } else {
                i9 = 0;
            }
            int i12 = measuredHeight + i9;
            org.telegram.ui.Components.bs bsVar = this.F1;
            if (bsVar != null) {
                i10 = (int) bsVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i10 = 0;
            }
            int i13 = i12 + i10;
            mx mxVar = this.f37750y0;
            SparseArray sparseArray = mxVar.h;
            mxVar.Q0 = i13;
            mxVar.R0 = i11;
            gh.f1 f1Var = mxVar.R;
            if (z10) {
                f1Var.o1(0, i13, 0, i11);
            } else {
                f1Var.setPadding(0, i13, 0, i11);
            }
            mxVar.I0.j(mxVar.Q0, mxVar.R0, z10);
            org.telegram.ui.Components.um0 um0Var = mxVar.S;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) um0Var.getLayoutParams();
            int i14 = marginLayoutParams.topMargin;
            int i15 = mxVar.Q0;
            if (i14 != i15 || marginLayoutParams.bottomMargin != mxVar.R0) {
                marginLayoutParams.topMargin = i15;
                marginLayoutParams.bottomMargin = mxVar.R0;
                um0Var.requestLayout();
            }
            org.telegram.ui.Components.hn0.P(mxVar.f29136b0, mxVar.f29139e0, mxVar.Q0, mxVar.R0, z10);
            org.telegram.ui.Components.hn0.P(mxVar.f29141g0, mxVar.f29144j0, mxVar.Q0, mxVar.R0, z10);
            org.telegram.ui.Components.hn0.P(mxVar.f29147n0, mxVar.f29150q0, mxVar.Q0, mxVar.R0, z10);
            org.telegram.ui.Components.kg0 kg0Var = mxVar.f29146l0;
            int i16 = mxVar.Q0;
            int i17 = mxVar.R0;
            kg0Var.setClipToPadding(false);
            org.telegram.ui.Components.i51 i51Var = kg0Var.f30078c;
            kg0Var.F = z10;
            kg0Var.setPadding(0, i16, 0, i17);
            if (z10) {
                i51Var.o1(0, i16, 0, i17);
            } else {
                i51Var.setPadding(0, i16, 0, i17);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) i51Var.getLayoutParams();
            marginLayoutParams2.topMargin = -i16;
            marginLayoutParams2.bottomMargin = -i17;
            kg0Var.F = false;
            org.telegram.ui.Components.gm0 gm0Var = mxVar.C0;
            if (gm0Var != null) {
                gm0Var.b(mxVar.Q0, mxVar.R0, z10);
            }
            int size = sparseArray.size();
            for (int i18 = 0; i18 < size; i18++) {
                View view = (View) sparseArray.valueAt(i18);
                if (view instanceof f10) {
                    ((f10) view).j(mxVar.Q0, mxVar.R0, z10);
                }
            }
            for (int i19 = 0; i19 < mxVar.getChildCount(); i19++) {
                if (mxVar.getChildAt(i19) instanceof f10) {
                    ((f10) mxVar.getChildAt(i19)).j(mxVar.Q0, mxVar.R0, z10);
                }
            }
        }
    }

    public final void G4() {
        getContactsController().loadGlobalPrivacySetting();
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.p61(11, this, r0), new ri(r0, 17));
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(getParentActivity(), getResourceProvider());
        a3Var.c(p6Var);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.f22713a;
        f3Var.show();
        org.telegram.ui.ActionBar.f3[] f3VarArr = {f3Var};
        f3Var.fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5));
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

    public final boolean H4(org.telegram.ui.Cells.r2 r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dy.H4(org.telegram.ui.Cells.r2):boolean");
    }

    public boolean I3() {
        if (this.N0 == 10) {
            return true;
        }
        return false;
    }

    public final void I4(boolean z10) {
        float f10;
        this.f37638c.a(z10, true);
        if (this.f37671i0 == null) {
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
            this.f37671i0.setVisibility(0);
        } else {
            this.f37671i0.setSelected(false);
            Drawable background = this.f37671i0.getBackground();
            if (background != null) {
                background.setState(StateSet.NOTHING);
                background.jumpToCurrentState();
            }
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.ActionBar.w0 w0Var = this.f37671i0;
        Property property = View.ALPHA;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(w0Var, property, f10));
        this.L3.playTogether(arrayList);
        this.L3.addListener(new ex(this, z10, 1));
        this.L3.start();
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        int i10;
        int i11;
        int i12 = 8;
        if (i9 == 1) {
            C3();
            E3();
            H3();
            u3();
            F3();
            sx sxVar = this.T;
            td.a aVar = this.f37632b;
            sxVar.setBlurredBackgroundVisibility(aVar.f47775e);
            float b10 = ff.m0.b(aVar.f47775e);
            org.telegram.ui.Components.o9 o9Var = this.W2;
            if (o9Var != null) {
                o9Var.setScaleX(b10);
                this.W2.setScaleY(b10);
                this.W2.setAlpha(b10);
                org.telegram.ui.Components.o9 o9Var2 = this.W2;
                if (b10 > 0.0f) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                o9Var2.setVisibility(i11);
            }
            if (this.f37716r0 != null) {
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
                this.f37716r0.setScaleX(lerp);
                this.f37716r0.setScaleY(lerp);
                this.f37716r0.setAlpha(b10);
                kh.d dVar = this.f37716r0;
                int i13 = (b10 > 0.0f ? 1 : (b10 == 0.0f ? 0 : -1));
                if (i13 > 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                dVar.setVisibility(i10);
                this.f37722s0.setAlpha(b10);
                rg.f fVar = this.f37722s0;
                if (i13 > 0) {
                    i12 = 0;
                }
                fVar.setVisibility(i12);
            }
        } else if (i9 == 2) {
            C3();
            E3();
        } else if (i9 == 3) {
            A3();
        } else if (i9 == 4) {
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        } else if (i9 == 5) {
            z3();
        } else if (i9 == 6) {
            C3();
            E3();
        } else if (i9 == 7) {
            v3();
        } else if (i9 == 8) {
            u3();
            F3();
        } else if (i9 == 9) {
            F3();
        }
    }

    public final void J3() {
        if (AndroidUtilities.isTablet()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.h(true);
            }
            TLObject tLObject = this.T1;
            if (tLObject != null) {
                mx mxVar = this.f37750y0;
                if (mxVar != null) {
                    mxVar.U.R(this.S1, tLObject);
                }
                this.T1 = null;
                return;
            }
            return;
        }
        this.R1 = true;
    }

    public final void J4() {
        if (!this.f37740w0 && getMessagesController().dialogFiltersLoaded && getMessagesController().showFiltersTooltip && this.f37735v0 != null && getMessagesController().getDialogFilters().isEmpty() && !this.isPaused && getUserConfig().filtersLoaded && !this.inPreviewMode) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("filterhint", false)) {
                globalMainSettings.edit().putBoolean("filterhint", true).apply();
                AndroidUtilities.runOnUIThread(new uv(this, 9), 1000L);
            }
        }
    }

    public final void K3() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.f23577j0) {
            kVar.h(true);
            this.f37688l3 = false;
            V4(true, true);
        }
    }

    public final void K4() {
        LaunchActivity launchActivity;
        boolean q10;
        int i9;
        int i10;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        LaunchActivity launchActivity2;
        CharSequence charSequence;
        org.telegram.ui.Components.p61 p61Var;
        int i11;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.b6 b6Var;
        int i12;
        int v02;
        int v03;
        int v04;
        int l1;
        CharSequence charSequence2;
        int i13;
        int v05;
        org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(this, this.f37661g0);
        int i14 = org.telegram.ui.ActionBar.f6.A8;
        H.S(getThemedColor(i14), getThemedColor(i14));
        H.f34580s = 8;
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) parentActivity;
        } else {
            launchActivity = null;
        }
        int i15 = 0;
        if (this.T2 != 0) {
            if (ChatObject.hasAdminRights(this.U2)) {
                H.c(R.drawable.msg_customize, LocaleController.getString(R.string.CommunityMenuSettings), new dv(this, 4), false);
                H.k();
            }
            H.i(new dv(this, 7), LocaleController.getString(R.string.CommunityMenuShowAsOneChat), this.U2.collapsed_in_dialogs);
            H.i(new dv(this, 8), LocaleController.getString(R.string.CommunityMenuShowAsSeparateChats), !this.U2.collapsed_in_dialogs);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        } else if (e4()) {
            H.c(R.drawable.msg_customize, LocaleController.getString(R.string.ArchiveSettings), new dv(this, 9), false);
            H.c(R.drawable.msg_help, LocaleController.getString(R.string.HowDoesItWork), new dv(this, 10), false);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        } else {
            org.telegram.ui.ActionBar.b6 b6Var2 = this.resourceProvider;
            if (b6Var2 != null) {
                q10 = b6Var2.a();
            } else {
                q10 = org.telegram.ui.ActionBar.f6.I.q();
            }
            if (q10) {
                i9 = R.drawable.menu_day_mode_24;
            } else {
                i9 = R.drawable.menu_night_mode_24;
            }
            if (q10) {
                i10 = R.string.SwitchThemeToDay;
            } else {
                i10 = R.string.SwitchThemeToNight;
            }
            H.c(i9, LocaleController.getString(i10), new dv(this, 11), false);
            H.k();
            H.c(R.drawable.outline_groups_24, LocaleController.getString(R.string.NewGroup), new dv(this, 12), false);
            H.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.SavedMessages), new dv(this, 13), false);
            ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
            if (applicationLoader != null) {
                applicationLoader.addItemOptions(H);
            }
            TLRPC.TL_attachMenuBots attachMenuBots = MediaDataController.getInstance(UserConfig.selectedAccount).getAttachMenuBots();
            if (launchActivity != null && attachMenuBots != null && (arrayList = attachMenuBots.bots) != null && !arrayList.isEmpty()) {
                ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = attachMenuBots.bots;
                int size = arrayList2.size();
                int i16 = 0;
                while (i16 < size) {
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i16);
                    i16++;
                    TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                    if (tL_attachMenuBot2.show_in_side_menu) {
                        gv gvVar = new gv(this, tL_attachMenuBot2, launchActivity, 0);
                        org.telegram.ui.Components.p61 p61Var2 = new org.telegram.ui.Components.p61(10, this, tL_attachMenuBot2);
                        org.telegram.ui.ActionBar.b6 b6Var3 = H.d;
                        if (H.f34555e != null) {
                            int i17 = org.telegram.ui.ActionBar.f6.F8;
                            int i18 = org.telegram.ui.ActionBar.f6.E8;
                            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(0, H.f34555e, H.d, false, false);
                            g1Var2.setPadding(AndroidUtilities.dp(18.0f), i15, AndroidUtilities.dp(18.0f), i15);
                            if (tL_attachMenuBot2.side_menu_disclaimer_needed) {
                                charSequence = org.telegram.ui.Cells.p8.a(tL_attachMenuBot2.short_name);
                            } else {
                                charSequence = tL_attachMenuBot2.short_name;
                            }
                            TLRPC.TL_attachMenuBotIcon sideAttachMenuBotIcon = MediaDataController.getSideAttachMenuBotIcon(tL_attachMenuBot2);
                            if (sideAttachMenuBotIcon != null) {
                                launchActivity2 = launchActivity;
                                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(sideAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.f6.f22984c7, 1.0f);
                                if (svgThumb != null) {
                                    Integer num = H.f34567k0;
                                    if (num != null) {
                                        v05 = num.intValue();
                                    } else {
                                        v05 = org.telegram.ui.ActionBar.f6.v0(i17, b6Var3);
                                    }
                                    charSequence2 = charSequence;
                                    svgThumb.setColorFilter(new PorterDuffColorFilter(v05, PorterDuff.Mode.SRC_IN));
                                } else {
                                    charSequence2 = charSequence;
                                }
                                i11 = i18;
                                p61Var = p61Var2;
                                i12 = i17;
                                g1Var = g1Var2;
                                b6Var = b6Var3;
                                g1Var.h(charSequence2, ImageLocation.getForDocument(sideAttachMenuBotIcon.icon), "24_24", svgThumb, tL_attachMenuBot2);
                                org.telegram.ui.Components.o9 o9Var = g1Var.h;
                                if (o9Var != null) {
                                    if (LocaleController.isRTL) {
                                        i13 = 5;
                                    } else {
                                        i13 = 3;
                                    }
                                    o9Var.setLayoutParams(g7.e6.e(24, 24, i13 | 16));
                                }
                            } else {
                                launchActivity2 = launchActivity;
                                p61Var = p61Var2;
                                i11 = i18;
                                g1Var = g1Var2;
                                b6Var = b6Var3;
                                CharSequence charSequence3 = charSequence;
                                i12 = i17;
                                g1Var.g(charSequence3, R.drawable.msg_bot, null);
                            }
                            Integer num2 = H.f34565j0;
                            if (num2 != null) {
                                v02 = num2.intValue();
                            } else {
                                v02 = org.telegram.ui.ActionBar.f6.v0(i11, b6Var);
                            }
                            Integer num3 = H.f34567k0;
                            if (num3 != null) {
                                v03 = num3.intValue();
                            } else {
                                v03 = org.telegram.ui.ActionBar.f6.v0(i12, b6Var);
                            }
                            g1Var.c(v02, v03);
                            Integer num4 = H.f34567k0;
                            if (num4 != null) {
                                v04 = num4.intValue();
                            } else {
                                v04 = org.telegram.ui.ActionBar.f6.v0(i12, b6Var);
                            }
                            g1Var.setIconColorImage(v04);
                            Integer num5 = H.f34569l0;
                            if (num5 != null) {
                                l1 = num5.intValue();
                            } else {
                                l1 = org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
                            }
                            g1Var.setSelectorColor(l1);
                            g1Var.setOnClickListener(new org.telegram.ui.Components.s2(25, H, gvVar));
                            g1Var.setOnLongClickListener(new ih.g2(3, H, p61Var));
                            int i19 = H.S;
                            if (i19 > 0) {
                                g1Var.setMinimumWidth(AndroidUtilities.dp(i19));
                                H.r(g1Var, g7.e6.n(H.S, -2));
                            } else {
                                H.r(g1Var, g7.e6.n(-1, -2));
                            }
                            launchActivity = launchActivity2;
                            i15 = 0;
                        }
                    }
                    launchActivity2 = launchActivity;
                    launchActivity = launchActivity2;
                    i15 = 0;
                }
            }
            if (getUserConfig().showCallsTab) {
                H.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), new dv(this, 6), false);
            }
            org.telegram.ui.ActionBar.g1 g1Var3 = this.f37681k0;
            if (g1Var3 != null) {
                g1Var3.f23404b.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.ai));
                this.f37681k0.setOnClickListener(new org.telegram.ui.Components.vh0(17, this, H));
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", "");
                if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty())) {
                    H.k();
                    H.d(this.f37681k0);
                }
            }
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        }
    }

    public final void L3(String str) {
        int i9;
        if (this.actionBar.a(str)) {
            return;
        }
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(str);
        boolean z10 = this.S;
        ArrayList arrayList = this.f37651e1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.f37640c1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f37640c1.setImageDrawable(new org.telegram.ui.ActionBar.h2(true));
            this.f37640c1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.f23371y8), PorterDuff.Mode.MULTIPLY));
            this.f37640c1.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(org.telegram.ui.ActionBar.f6.f23388z8), 1, -1));
            this.f37640c1.setOnClickListener(new iv(this, 6));
            j10.addView(this.f37640c1, g7.e6.q(54, 54, 16));
            arrayList.add(this.f37640c1);
        }
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.f37645d1 = numberTextView;
        numberTextView.setTextSize(18);
        this.f37645d1.setTypeface(AndroidUtilities.bold());
        this.f37645d1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23371y8));
        NumberTextView numberTextView2 = this.f37645d1;
        if (this.S) {
            i9 = 18;
        } else {
            i9 = 72;
        }
        j10.addView(numberTextView2, g7.e6.m(1.0f, 0, -1, i9, 0, 0));
        this.f37645d1.setOnTouchListener(new jh.d(2));
        this.f37662g1 = j10.g(100, R.drawable.msg_pin, AndroidUtilities.dp(48.0f));
        this.f37667h1 = j10.g(104, R.drawable.msg_mute, AndroidUtilities.dp(48.0f));
        this.f37672i1 = j10.g(107, R.drawable.msg_archive, AndroidUtilities.dp(48.0f));
        this.f37657f1 = j10.h(102, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(48.0f));
        org.telegram.ui.ActionBar.w0 h = j10.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(48.0f));
        j10.addView(new View(getParentActivity()), g7.e6.n(5, -1));
        this.f37690m1 = h.e(105, R.drawable.msg_archive, LocaleController.getString(R.string.Archive));
        this.f37677j1 = h.e(108, R.drawable.msg_pin, LocaleController.getString(R.string.DialogPin));
        this.f37682k1 = h.e(109, R.drawable.msg_addfolder, LocaleController.getString(R.string.FilterAddTo));
        this.l1 = h.e(110, R.drawable.msg_removefolder, LocaleController.getString(R.string.FilterRemoveFrom));
        this.f37701o1 = h.e(101, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
        this.f37696n1 = h.e(103, R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory));
        this.f37706p1 = h.e(106, R.drawable.msg_block, LocaleController.getString(R.string.BlockUser));
        this.f37667h1.setOnLongClickListener(new qv(this, 0));
        arrayList.add(this.f37662g1);
        arrayList.add(this.f37672i1);
        arrayList.add(this.f37667h1);
        arrayList.add(this.f37657f1);
        arrayList.add(h);
        T4(false);
    }

    public final void L4() {
        if (this.O3 == null) {
            for (String str : getMessagesController().pendingSuggestions) {
                if ("AUTOARCHIVE_POPULAR".equals(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.HideNewChatsAlertTitle);
                    alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.HideNewChatsAlertText));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.GoToSettings), new jv(this, 6));
                    showDialog(alertDialog$Builder.f22702a, new ev(this, 1));
                    this.O3 = str;
                    return;
                }
            }
        }
    }

    public final void M3() {
        int i9;
        mx mxVar = this.f37750y0;
        if ((mxVar != null && mxVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        if (this.f37678j2 != null) {
            i9 = 2;
        } else if (!this.f37668h2) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        mx mxVar2 = new mx(this, getParentActivity(), this, i9, this.N0, this.R2, this.T2, new ix(this, 1));
        this.f37750y0 = mxVar2;
        ((vx) this.fragmentView).addView(mxVar2, this.f37745x0);
        mx mxVar3 = this.f37750y0;
        mxVar3.U.Q = new ox(this);
        mxVar3.f29139e0.setOnItemClickListener(new jv(this, 1));
        this.f37750y0.f29144j0.setOnItemClickListener(new jv(this, 2));
        this.f37750y0.f29150q0.setOnItemClickListener(new nv(this, 0));
        this.f37750y0.f29144j0.setOnItemLongClickListener(new jv(this, 3));
        this.f37750y0.R.setOnItemClickListener(new jv(this, 4));
        this.f37750y0.R.setOnItemLongClickListener(new ix(this, 2));
        this.f37750y0.setFilteredSearchViewDelegate(new jv(this, 5));
        this.f37750y0.setAlpha(0.0f);
        this.f37750y0.setScaleX(1.05f);
        this.f37750y0.setScaleY(1.05f);
        this.f37750y0.setVisibility(8);
        this.f37750y0.setBlurredBackgroundDrawableFactory(this.f37693m4);
    }

    public final void M4(long j10, View view) {
        ArrayList<TLRPC.Dialog> R3;
        int i9;
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
            if (this.f37688l3) {
                L3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.c5)) {
                    org.telegram.ui.Cells.j2.v(false, this.actionBar);
                }
            } else {
                L3(null);
            }
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
            this.actionBar.N(null, null);
            int i10 = this.f37629a0[0].f37357s;
            if ((i10 != 7 && i10 != 8) || (this.actionBar.s() && !this.actionBar.t(null))) {
                R3 = getMessagesController().getDialogs(this.R2);
            } else {
                R3 = R3(this.currentAccount, this.f37629a0[0].f37357s, this.R2, this.O1);
            }
            int size = R3.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.Dialog dialog = R3.get(i12);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (g4(dialog)) {
                        i11++;
                    } else if (!getMessagesController().isPromoDialog(dialog.f22384id, false)) {
                        break;
                    }
                }
            }
            if (i11 > 1) {
                if (this.f37629a0 != null) {
                    int i13 = 0;
                    while (true) {
                        cy[] cyVarArr = this.f37629a0;
                        if (i13 >= cyVarArr.length) {
                            break;
                        }
                        cyVarArr[i13].d.D = true;
                        i13++;
                    }
                }
                g5(MessagesController.UPDATE_MASK_REORDER, true);
            }
            if (!this.f37688l3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i14 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f37651e1;
                    if (i14 >= arrayList3.size()) {
                        break;
                    }
                    View view2 = (View) arrayList3.get(i14);
                    view2.setPivotY(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2);
                    AndroidUtilities.clearDrawableAnimation(view2);
                    arrayList2.add(ObjectAnimator.ofFloat(view2, View.SCALE_Y, 0.1f, 1.0f));
                    i14++;
                }
                animatorSet.playTogether(arrayList2);
                animatorSet.setDuration(200L);
                animatorSet.start();
            }
            ValueAnimator valueAnimator = this.f37713q3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f37713q3 = ValueAnimator.ofFloat(this.f37708p3, 1.0f);
            int i15 = 0;
            while (true) {
                cy[] cyVarArr2 = this.f37629a0;
                if (i15 >= cyVarArr2.length) {
                    break;
                }
                cy cyVar = cyVarArr2[i15];
                if (cyVar != null) {
                    cyVar.f37350a.I0(true);
                }
                i15++;
            }
            if (this.G) {
                i9 = 81;
            } else {
                i9 = 0;
            }
            float max = Math.max(0.0f, AndroidUtilities.dp(i9 + 48) + this.J);
            if (max != 0.0f) {
                this.L = (int) max;
                this.fragmentView.requestLayout();
            }
            this.f37713q3.addUpdateListener(new kv(this, max, 0));
            this.f37713q3.addListener(new gx(this, max, 1));
            this.f37713q3.setInterpolator(org.telegram.ui.Components.gr.f28844f);
            this.f37713q3.setDuration(200L);
            this.f37713q3.start();
            cw cwVar = this.f37735v0;
            if (cwVar != null) {
                cwVar.b(org.telegram.ui.ActionBar.f6.Gh, org.telegram.ui.ActionBar.f6.Fh, org.telegram.ui.ActionBar.f6.Eh, org.telegram.ui.ActionBar.f6.Hh, org.telegram.ui.ActionBar.f6.w8);
            }
            org.telegram.ui.ActionBar.h2 h2Var = this.f37630a1;
            if (h2Var != null) {
                h2Var.c(1.0f, true);
            }
            z10 = false;
        }
        T4(false);
        this.f37645d1.a(arrayList.size(), z10);
    }

    public final void N3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.f37731u0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i9 = 0; i9 < 2; i9++) {
                undoViewArr[i9] = new hx(this, parentActivity);
                FrameLayout.LayoutParams d = g7.e6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.f37643c4 + this.f37654e4 + d.bottomMargin;
                UndoView undoView = undoViewArr[i9];
                int i10 = this.f37727t0 + 1;
                this.f37727t0 = i10;
                ((vx) this.fragmentView).addView(undoView, i10, d);
            }
        }
    }

    public final void N4(long j10, View view) {
        String str;
        org.telegram.ui.Components.gc J;
        int i9 = -this.I3;
        this.I3 = i9;
        AndroidUtilities.shakeViewSpring(view, i9);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (j10 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)));
        } else {
            str = "";
        }
        if (getMessagesController().premiumFeaturesBlocked()) {
            J = org.telegram.ui.Components.oc.a0(this).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
        } else {
            J = org.telegram.ui.Components.oc.a0(this).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new dv(this, 22));
        }
        J.j();
    }

    public final void O3(final long j10, final long j11, boolean z10, final we1 we1Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String string;
        String formatStringSimple;
        String string2;
        String str;
        String str2;
        TLRPC.TL_forumTopic findTopic;
        if (p3(j10)) {
            int i9 = this.N0;
            if (i9 != 11 && i9 != 12 && i9 != 13) {
                if (z10 && ((this.f37635b2 != null && this.f37641c2 != null) || this.f37646d2 != null)) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        if (DialogObject.isEncryptedDialog(j10)) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(org.telegram.messenger.l0.l(getMessagesController(), j10).user_id));
                            if (user2 != null) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f37635b2, UserObject.getUserName(user2));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                return;
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            if (j10 == getUserConfig().getClientUserId()) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f37641c2, LocaleController.getString(R.string.SavedMessages));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j10));
                                if (user3 != null && this.f37635b2 != null) {
                                    str = LocaleController.getString(R.string.SendMessageTitle);
                                    str2 = LocaleController.formatStringSimple(this.f37635b2, UserObject.getUserName(user3));
                                    string2 = LocaleController.getString(R.string.Send);
                                } else {
                                    return;
                                }
                            }
                        } else {
                            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-j10));
                            if (chat2 != null) {
                                String str3 = chat2.title;
                                if (j11 != 0 && (findTopic = getMessagesController().getTopicsController().findTopic(chat2.f22380id, j11)) != null) {
                                    str3 = ((Object) str3) + " " + findTopic.title;
                                }
                                if (this.f37646d2 != null) {
                                    string = LocaleController.getString(R.string.AddToTheGroupAlertTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f37646d2, str3);
                                    string2 = LocaleController.getString(R.string.Add);
                                } else {
                                    string = LocaleController.getString(R.string.SendMessageTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f37641c2, str3);
                                    string2 = LocaleController.getString(R.string.Send);
                                }
                                String str4 = formatStringSimple;
                                str = string;
                                str2 = str4;
                            } else {
                                return;
                            }
                        }
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                        c2Var.N = str;
                        c2Var.P = AndroidUtilities.replaceTags(str2);
                        alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.b2() {
                            @Override
                            public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i10) {
                                dy.this.O3(j10, j11, false, we1Var);
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
                } else if (i9 == 15) {
                    Runnable wVar = new e5.w(this, j10, new e5.y(this, j10, j11, we1Var, 13), 27);
                    if (j10 < 0) {
                        Q4(getMessagesController().getChat(Long.valueOf(-j10)), wVar, null);
                        return;
                    }
                    TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(j10));
                    TLRPC.User user5 = getMessagesController().getUser(Long.valueOf(this.D));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, UserObject.getFirstName(user4), UserObject.getFirstName(user5));
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
                    c2Var2.N = formatString;
                    c2Var2.P = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, UserObject.getFirstName(user4), UserObject.getFirstName(user5))));
                    alertDialog$Builder2.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new wt(wVar, 1));
                    alertDialog$Builder2.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new org.telegram.ui.Components.if0(20));
                    showDialog(c2Var2);
                    return;
                } else if (this.f37752y2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j10, j11));
                    if (this.f37752y2.v(this, arrayList, null, false, this.F2, this.G2, this.H2, we1Var) && this.f37652e2) {
                        this.f37752y2 = null;
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
            getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new gh.y2(this, c2Var3, user, chat, j10, tL_messages_checkHistoryImportPeer));
            try {
                c2Var3.q(300L);
            } catch (Exception unused) {
            }
        }
    }

    public final void O4(boolean r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dy.O4(boolean, boolean, boolean, boolean):void");
    }

    public final void P3(long j10, boolean z10) {
        if (this.f37629a0 != null) {
            int i9 = 0;
            while (true) {
                cy[] cyVarArr = this.f37629a0;
                if (i9 < cyVarArr.length) {
                    int childCount = cyVarArr[i9].f37350a.getChildCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 < childCount) {
                            View childAt = this.f37629a0[i9].f37350a.getChildAt(i10);
                            if (childAt instanceof org.telegram.ui.Cells.r2) {
                                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                                if (r2Var.getDialogId() == j10) {
                                    r2Var.U(z10, true);
                                    break;
                                }
                            }
                            i10++;
                        }
                    }
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    public final void P4() {
        int i9;
        int i10;
        Long l10;
        if (this.I0 == null && !SharedConfig.appLocked && (!this.G || this.A0.g())) {
            s51[] s51VarArr = new s51[1];
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            org.telegram.ui.ActionBar.h5 titleTextView = this.actionBar.getTitleTextView();
            if (titleTextView != null && titleTextView.getRightDrawable() != null) {
                this.f37757z3.f();
                Drawable drawable = this.f37757z3.f29319f[0];
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(titleTextView.getRightDrawable().getBounds());
                rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
                int dp = (-(this.actionBar.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                i9 = AndroidUtilities.dp(4.0f) + (rect.centerX() - AndroidUtilities.dp(16.0f));
                org.telegram.ui.Cells.o oVar = this.A3;
                if (oVar != null) {
                    oVar.b(rect.centerX(), rect.centerY());
                }
                i10 = dp;
            } else {
                i9 = 0;
                i10 = 0;
            }
            zw zwVar = new zw(this, this, getParentActivity(), Integer.valueOf(i9), getResourceProvider(), s51VarArr);
            if (currentUser != null && DialogObject.getEmojiStatusUntil(currentUser.emoji_status) > 0) {
                zwVar.setExpireDateHint(DialogObject.getEmojiStatusUntil(currentUser.emoji_status));
            }
            Long l11 = this.f37748x3;
            if (l11 != null) {
                zwVar.setSelected(l11);
            } else {
                Drawable drawable2 = this.f37757z3.f29319f[0];
                if (drawable2 instanceof org.telegram.ui.Components.k5) {
                    l10 = Long.valueOf(((org.telegram.ui.Components.k5) drawable2).i());
                } else {
                    l10 = null;
                }
                zwVar.setSelected(l10);
            }
            zwVar.setSaveState(1);
            zwVar.y(this.f37757z3, titleTextView);
            ax axVar = new ax(this, zwVar);
            this.I0 = axVar;
            s51VarArr[0] = axVar;
            axVar.showAsDropDown(this.actionBar, AndroidUtilities.dp(16.0f), i10, 48);
            s51VarArr[0].b();
        }
    }

    public final void Q4(org.telegram.tgnet.TLRPC.Chat r14, java.lang.Runnable r15, java.lang.Runnable r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dy.Q4(org.telegram.tgnet.TLRPC$Chat, java.lang.Runnable, java.lang.Runnable):void");
    }

    @Override
    public final boolean R(MotionEvent motionEvent, boolean z10) {
        yw ywVar;
        fh.l2 l2Var;
        cw cwVar;
        boolean z11;
        boolean z12;
        if (!this.f37688l3 && (((ywVar = this.B3) == null || !ywVar.c()) && (((l2Var = this.G0) == null || l2Var.getVisibility() != 0) && ((cwVar = this.f37735v0) == null || !cwVar.f34047n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                cw cwVar2 = this.f37735v0;
                if (cwVar2 != null && cwVar2.getTabsCount() >= 2 && this.f37735v0.getCurrentTabId() != this.f37735v0.getFirstTabId()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cw cwVar3 = this.f37735v0;
                if (cwVar3 != null && cwVar3.getTabsCount() >= 2 && this.f37735v0.getCurrentTabId() != this.f37735v0.getLastTabId()) {
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

    public final java.util.ArrayList R3(int r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dy.R3(int, int, int, boolean):java.util.ArrayList");
    }

    public final void R4(boolean z10) {
        cy[] cyVarArr;
        char c10;
        int i9;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            cyVarArr = this.f37629a0;
            if (i11 >= cyVarArr.length) {
                break;
            }
            cyVarArr[i11].f37350a.B0();
            i11++;
        }
        if (z10 && cyVarArr.length > 1) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        int i12 = cyVarArr[c10].h;
        if (i12 >= 0 && i12 < getMessagesController().getDialogFilters().size()) {
            MessagesController.DialogFilter dialogFilter = getMessagesController().getDialogFilters().get(this.f37629a0[c10].h);
            if (dialogFilter.isDefault()) {
                cy cyVar = this.f37629a0[c10];
                cyVar.f37357s = this.N0;
                yx yxVar = cyVar.f37350a;
                int i13 = yx.f44960r3;
                yxVar.A1();
            } else {
                cy[] cyVarArr2 = this.f37629a0;
                if (cyVarArr2[c10 ^ 1].f37357s == 7) {
                    cyVarArr2[c10].f37357s = 8;
                } else {
                    cyVarArr2[c10].f37357s = 7;
                }
                cyVarArr2[c10].f37350a.setScrollEnabled(true);
                MessagesController messagesController = getMessagesController();
                if (this.f37629a0[c10].f37357s == 8) {
                    i9 = 1;
                } else {
                    i9 = 0;
                }
                messagesController.selectDialogFilter(dialogFilter, i9);
            }
            cy[] cyVarArr3 = this.f37629a0;
            if (cyVarArr3.length > 1) {
                cyVarArr3[1].A = dialogFilter.locked;
            }
            cy cyVar2 = cyVarArr3[c10];
            lw lwVar = cyVar2.d;
            lwVar.h = cyVar2.f37357s;
            lwVar.l();
            cy cyVar3 = this.f37629a0[c10];
            hw hwVar = cyVar3.f37352c;
            if (cyVar3.f37357s == 0 && Z3() && this.f37629a0[c10].v == 2) {
                i10 = 1;
            }
            hwVar.h1(i10, (int) this.J);
            r3(this.f37629a0[c10]);
        }
    }

    public final float S3(boolean z10) {
        float f10;
        if (z10) {
            f10 = 1.0f - this.f37632b.f47775e;
        } else {
            f10 = 1.0f;
        }
        return f10 * (1.0f - V3()) * this.f37715r.f47775e;
    }

    public final void S4() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        int i9;
        o31 o31Var = this.V;
        if (o31Var != null && o31Var.getVisibility() != 8) {
            f10 = this.V.getMeasuredHeight();
        } else {
            f10 = 0.0f;
        }
        if (this.G) {
            f11 = AndroidUtilities.dp(81.0f);
        } else {
            f11 = 0.0f;
        }
        if (this.G) {
            float f20 = this.J;
            float f21 = this.f37728t1;
            f12 = (f10 * f21) + e2.c.z(1.0f, f21, f11, f20);
            f13 = this.f37725s3;
        } else {
            f12 = (f10 * this.f37728t1) + this.J;
            f13 = this.f37725s3;
        }
        float f22 = f12 + f13 + this.P;
        sx sxVar = this.T;
        if (sxVar != null && sxVar.getVisibility() == 0) {
            f14 = this.T.getAlpha();
        } else {
            f14 = 0.0f;
        }
        float dp = AndroidUtilities.dp(4.0f) * f14;
        cw cwVar = this.f37735v0;
        if (cwVar != null) {
            cwVar.setTranslationY(f22 - dp);
            f16 = this.f37735v0.getAlpha();
            f17 = AndroidUtilities.dp(43.0f) * f16;
            f15 = f22 + f17;
        } else {
            f15 = f22;
            f16 = 0.0f;
            f17 = 0.0f;
        }
        org.telegram.ui.Components.bs bsVar = this.F1;
        if (bsVar != null) {
            float f23 = f15 - dp;
            int i10 = -AndroidUtilities.dp(3.0f);
            if (this.W == null) {
                i9 = AndroidUtilities.dp(44.0f);
            } else {
                i9 = 0;
            }
            bsVar.setTranslationY(AndroidUtilities.lerp(f23, i10 - i9, this.f37632b.f47775e));
            f18 = this.F1.getMetadata().f47790c.f47800a;
            f19 = this.F1.c(0.0f);
        } else {
            f18 = 0.0f;
            f19 = 0.0f;
        }
        org.telegram.ui.Components.as asVar = this.G1;
        if (asVar != null) {
            asVar.setTranslationY(f22 - dp);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f), Math.min(f18, f16));
            org.telegram.ui.Components.as asVar2 = this.G1;
            float min = Math.min(AndroidUtilities.dp(40.0f), (f19 + f17) - lerp);
            Matrix matrix = asVar2.f26890b;
            if (asVar2.f26892e != lerp || asVar2.f26893f != min) {
                asVar2.f26892e = lerp;
                asVar2.f26893f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, lerp);
                LinearGradient linearGradient = asVar2.f26891c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                asVar2.invalidate();
            }
            this.G1.setAlpha(Math.max(f16, f18));
        }
    }

    public final int T3() {
        if (this.G) {
            return AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(81.0f);
        }
        return AndroidUtilities.dp(48.0f);
    }

    public final void T4(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dy.T4(boolean):void");
    }

    public final int U3() {
        if (this.G) {
            return AndroidUtilities.dp(81.0f);
        }
        return 0;
    }

    public final void U4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dy.U4():void");
    }

    public final float V3() {
        yw ywVar = this.B3;
        if (ywVar != null && ywVar.c()) {
            return this.B3.f38664e;
        }
        return 0.0f;
    }

    public final void V4(boolean r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dy.V4(boolean, boolean):void");
    }

    public final float W3() {
        return -AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(48.0f), this.f37632b.f47775e);
    }

    public final void W4(boolean r11, java.util.ArrayList r12, java.util.ArrayList r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dy.W4(boolean, java.util.ArrayList, java.util.ArrayList, boolean, boolean):void");
    }

    public final ih.v6 X3() {
        return getMessagesController().getStoriesController();
    }

    public final void X4() {
        float f10 = (((-this.f37643c4) - this.f37660f4) - this.f37711q1) - this.f37717r1;
        org.telegram.ui.Components.j10 j10Var = this.f37705p0;
        if (j10Var != null) {
            j10Var.setTranslationY(f10);
        }
        org.telegram.ui.Components.j10 j10Var2 = this.f37710q0;
        if (j10Var2 != null) {
            j10Var2.setTranslationY(f10 - AndroidUtilities.dp(52.0f));
            kh.x3 x3Var = this.f37686l0;
            if (x3Var != null) {
                x3Var.setTranslationY(f10 - AndroidUtilities.dp(52.0f));
            }
        }
    }

    public final UndoView Y3() {
        N3();
        UndoView[] undoViewArr = this.f37731u0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.e(2, true);
            vx vxVar = (vx) this.fragmentView;
            vxVar.removeView(undoViewArr[0]);
            vxVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void Y4(boolean z10) {
        boolean z11;
        boolean z12 = this.f37668h2;
        if ((!z12 || this.N0 == 10) && this.R2 == 0 && this.T2 == 0 && !this.inPreviewMode && ((!this.f37658f2 || z12) && !this.Q3)) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.j10 j10Var = this.f37705p0;
        if (j10Var != null) {
            j10Var.e(z11, z10);
        }
        org.telegram.ui.Components.j10 j10Var2 = this.f37710q0;
        if (j10Var2 != null) {
            j10Var2.e(z11, z10);
        }
    }

    public final boolean Z3() {
        if (!this.f37668h2 && this.N0 == 0 && this.T2 == 0 && this.R2 == 0 && getMessagesController().hasHiddenArchive()) {
            return true;
        }
        return false;
    }

    public final void Z4(boolean z10, boolean z11) {
        boolean z12;
        int i9;
        if (this.f37676j0 != null) {
            org.telegram.ui.ActionBar.w0 w0Var = this.f37671i0;
            if (w0Var == null || w0Var.getVisibility() != 0) {
                boolean z13 = false;
                int i10 = 0;
                while (true) {
                    if (i10 < getDownloadController().downloadingFiles.size()) {
                        if (getFileLoader().isLoadingFile(getDownloadController().downloadingFiles.get(i10).getFileName())) {
                            z12 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z12 = false;
                        break;
                    }
                }
                if (!getDownloadController().hasUnviewedDownloads() && !z12 && (this.f37639c0.getVisibility() != 0 || this.f37639c0.getAlpha() != 1.0f || z11)) {
                    this.f37650e0 = false;
                } else {
                    this.f37650e0 = true;
                }
                x3();
                boolean z14 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i11 = this.Z1;
                z13 = (i11 == 3 || i11 == 5) ? true : true;
                org.telegram.ui.ActionBar.g1 g1Var = this.f37681k0;
                if (z14) {
                    if (z13) {
                        i9 = R.string.MenuProxyConnected;
                    } else {
                        i9 = R.string.MenuProxyConnecting;
                    }
                } else {
                    i9 = R.string.MenuProxyDisabled;
                }
                g1Var.setSubtext(LocaleController.getString(i9));
                this.f37676j0.b(z14, z13, z10);
            }
        }
    }

    public final boolean a4() {
        ArrayList arrayList = this.f37756z2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void a5() {
        org.telegram.ui.Components.wp0 wp0Var;
        int i9;
        ow owVar = this.f37746x1;
        ArrayList arrayList = this.E2;
        if (owVar != null) {
            this.f37694n.a(!arrayList.isEmpty(), true);
            b5();
            if (arrayList.isEmpty()) {
                if (this.N0 == 3 && this.f37635b2 == null) {
                    i9 = R.string.ForwardTo;
                } else {
                    i9 = R.string.SelectChat;
                }
                String string = LocaleController.getString(i9);
                if (this.M3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(string);
                } else {
                    this.actionBar.I(string, true, 350L, org.telegram.ui.Components.gr.h);
                }
                if (this.f37746x1.getTag() != null) {
                    this.f37746x1.m0(false, false, false);
                    this.f37746x1.O();
                    this.f37746x1.setTag(null);
                    this.fragmentView.requestLayout();
                }
            } else {
                if (this.f37746x1.getTag() == null) {
                    if (!a4() && this.A2 == null) {
                        this.f37746x1.setFieldText("");
                    }
                    this.f37746x1.setTag(1);
                    if (!this.S3 && (wp0Var = this.C2) != null) {
                        this.S3 = true;
                        String string2 = LocaleController.getString(R.string.ShareTapToEditMedia);
                        wp0Var.j();
                        wp0Var.B = string2;
                        org.telegram.ui.Components.up0 up0Var = wp0Var.f34305a[0];
                        if (string2 != null) {
                            up0Var.f33109e.l(string2, false);
                        }
                        org.telegram.ui.Components.ib0 ib0Var = new org.telegram.ui.Components.ib0(wp0Var, 29);
                        wp0Var.C = ib0Var;
                        AndroidUtilities.runOnUIThread(ib0Var, 1000L);
                    }
                }
                this.f37751y1.g(Math.max(1, arrayList.size()), true);
                int i10 = this.O0 + (!TextUtils.isEmpty(this.f37746x1.getFieldText()) ? 1 : 0);
                int size = arrayList.size();
                long j10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    long longValue = ((Long) obj).longValue();
                    long sendPaidMessagesStars = getMessagesController().getSendPaidMessagesStars(longValue);
                    if (sendPaidMessagesStars <= 0 && longValue > 0) {
                        sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(getMessagesController().isUserContactBlocked(longValue));
                    }
                    j10 += sendPaidMessagesStars;
                }
                this.f37751y1.i(i10, j10, true);
                this.f37746x1.R1();
                if (this.M3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]));
                } else {
                    this.actionBar.I(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]), false, 350L, org.telegram.ui.Components.gr.h);
                }
            }
            this.M3 = arrayList.isEmpty();
        } else if (this.N0 == 10) {
            c4(arrayList.isEmpty());
        }
    }

    public final void b4(boolean z10) {
        int i9;
        boolean z11;
        this.actionBar.r();
        this.E2.clear();
        org.telegram.ui.ActionBar.h2 h2Var = this.f37630a1;
        if (h2Var != null) {
            h2Var.c(0.0f, true);
        }
        cw cwVar = this.f37735v0;
        if (cwVar != null) {
            cwVar.b(org.telegram.ui.ActionBar.f6.K8, org.telegram.ui.ActionBar.f6.I8, org.telegram.ui.ActionBar.f6.J8, org.telegram.ui.ActionBar.f6.L8, org.telegram.ui.ActionBar.f6.f23001d6);
        }
        ValueAnimator valueAnimator = this.f37713q3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f37713q3 = null;
        }
        if (this.f37708p3 == 0.0f) {
            return;
        }
        C4(-T3());
        int i10 = 0;
        while (true) {
            cy[] cyVarArr = this.f37629a0;
            if (i10 >= cyVarArr.length) {
                break;
            }
            cy cyVar = cyVarArr[i10];
            if (cyVar != null) {
                cyVar.f37350a.I0(true);
            }
            i10++;
        }
        if (this.G) {
            i9 = 81;
        } else {
            i9 = 0;
        }
        float max = Math.max(0.0f, AndroidUtilities.dp(i9 + 48) + this.J);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37708p3, 0.0f);
        this.f37713q3 = ofFloat;
        ofFloat.addUpdateListener(new kv(this, max, 1));
        this.f37713q3.addListener(new gx(this, max, 0));
        this.f37713q3.setInterpolator(org.telegram.ui.Components.gr.f28844f);
        this.f37713q3.setDuration(200L);
        this.f37713q3.start();
        this.U0 = false;
        ArrayList arrayList = this.W0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList.get(i11);
                n00.s0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
                i11++;
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
        if (this.f37629a0 != null) {
            int i12 = 0;
            while (true) {
                cy[] cyVarArr2 = this.f37629a0;
                if (i12 >= cyVarArr2.length) {
                    break;
                }
                cyVarArr2[i12].d.D = z11;
                i12++;
            }
        }
        int i13 = MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK;
        int i14 = z11;
        if (z10) {
            i14 = MessagesController.UPDATE_MASK_CHAT;
        }
        g5(i14 | i13, true);
    }

    public final void b5() {
        org.telegram.ui.Components.wp0 wp0Var = this.C2;
        if (wp0Var != null) {
            int i9 = this.currentAccount;
            wp0Var.h(i9);
            wp0Var.d = AccountInstance.getInstance(i9).getUserConfig().getClientUserId();
            ArrayList arrayList = wp0Var.f34309f;
            arrayList.clear();
            ArrayList arrayList2 = this.E2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            org.telegram.ui.Components.up0 up0Var = wp0Var.f34305a[0];
            if (wp0Var.f34306b == 1) {
                up0Var.d.l(wp0Var.c(up0Var), false);
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
                kh.x3 x3Var = this.f37686l0;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                kh.x3 x3Var2 = this.m0;
                if (x3Var2 != null) {
                    x3Var2.e(true);
                }
            }
        }
    }

    public final void c5(boolean z10) {
        boolean z11;
        if (this.f37666h0 == null) {
            return;
        }
        ArrayList<MessageObject> arrayList = getDownloadController().downloadingFiles;
        int size = arrayList.size();
        boolean z12 = false;
        int i9 = 0;
        while (true) {
            if (i9 < size) {
                MessageObject messageObject = arrayList.get(i9);
                i9++;
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
        int i10 = 0;
        while (true) {
            if (i10 >= size2) {
                break;
            }
            MessageObject messageObject3 = arrayList2.get(i10);
            i10++;
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
        cw cwVar;
        if (!this.B3.c()) {
            if (this.N0 == 3 && (cwVar = this.f37735v0) != null && cwVar.getVisibility() == 0 && this.f37735v0.G > 0) {
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
            mx mxVar = this.f37750y0;
            if (mxVar != null) {
                mxVar.R();
                return true;
            }
            return true;
        }
        return super.closeLastFragment();
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.Components.r7 r7Var = new org.telegram.ui.Components.r7(this, context, this.resourceProvider, 3);
        r7Var.setAllowOverlayTitle(true);
        r7Var.K();
        r7Var.A(getThemedColor(org.telegram.ui.ActionBar.f6.f23287t8), false);
        r7Var.A(getThemedColor(org.telegram.ui.ActionBar.f6.f23388z8), true);
        r7Var.C(getThemedColor(org.telegram.ui.ActionBar.f6.f23321v8), false);
        r7Var.C(getThemedColor(org.telegram.ui.ActionBar.f6.f23371y8), true);
        r7Var.k();
        r7Var.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        r7Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(3.0f));
        if (!this.inPreviewMode && (!AndroidUtilities.isTablet() || this.R2 == 0 || e4())) {
            return r7Var;
        }
        r7Var.setOccupyStatusBar(false);
        return r7Var;
    }

    @Override
    public final android.view.View createView(android.content.Context r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dy.createView(android.content.Context):android.view.View");
    }

    public final void d5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.i5 i5Var;
        vw vwVar = this.A0;
        org.telegram.ui.Components.i5 i5Var2 = null;
        if (vwVar != null && (i5Var = vwVar.T) != null && vwVar.m0 != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                i5Var.j(emojiStatusDocumentId.longValue(), z10);
                i5Var.m(user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible, z10);
            } else if (user != null && MessagesController.getInstance(vwVar.f12027f).isPremiumUser(user)) {
                if (vwVar.J0 == null) {
                    vwVar.J0 = vwVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    vwVar.J0 = new org.telegram.ui.Components.j5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), vwVar.J0);
                }
                vwVar.J0.setColorFilter(new PorterDuffColorFilter(vwVar.f(org.telegram.ui.ActionBar.f6.zh), PorterDuff.Mode.MULTIPLY));
                i5Var.g(vwVar.J0, z10);
                i5Var.m(false, z10);
            } else {
                i5Var.g(null, z10);
                i5Var.m(false, z10);
            }
            i5Var.k(Integer.valueOf(vwVar.f(org.telegram.ui.ActionBar.f6.zh)));
            vwVar.S.invalidate();
        }
        if (this.f37757z3 != null && this.actionBar != null) {
            Long emojiStatusDocumentId2 = UserObject.getEmojiStatusDocumentId(user);
            this.f37748x3 = null;
            if (emojiStatusDocumentId2 != null) {
                boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                this.f37757z3.j(emojiStatusDocumentId2.longValue(), z10);
                this.f37757z3.m(z11, z10);
                if (z11) {
                    this.f37748x3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
                }
                this.actionBar.setRightDrawableOnClick(new iv(this, 2));
                b61.t(this.currentAccount);
            } else if (user != null && MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
                if (this.H3 == null) {
                    this.H3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    this.H3 = new org.telegram.ui.Components.j5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.H3);
                }
                this.H3.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.zh), PorterDuff.Mode.MULTIPLY));
                this.f37757z3.g(this.H3, z10);
                this.f37757z3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(new iv(this, 3));
                b61.t(this.currentAccount);
            } else {
                this.f37757z3.g(null, z10);
                this.f37757z3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(null);
            }
            org.telegram.ui.Components.i5 i5Var3 = this.f37757z3;
            int i9 = org.telegram.ui.ActionBar.f6.zh;
            i5Var3.k(Integer.valueOf(getThemedColor(i9)));
            org.telegram.ui.Cells.o oVar = this.A3;
            if (oVar != null) {
                oVar.setColor(getThemedColor(i9));
            }
            ax axVar = this.I0;
            if (axVar != null && (axVar.getContentView() instanceof b61)) {
                org.telegram.ui.ActionBar.h5 titleTextView = this.actionBar.getTitleTextView();
                b61 b61Var = (b61) this.I0.getContentView();
                if (titleTextView != null) {
                    Drawable rightDrawable = titleTextView.getRightDrawable();
                    org.telegram.ui.Components.i5 i5Var4 = this.f37757z3;
                    if (rightDrawable == i5Var4) {
                        i5Var2 = i5Var4;
                    }
                }
                b61Var.y(i5Var2, titleTextView);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r27, int r28, java.lang.Object... r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dy.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (!(dialog instanceof mh.c3) && super.dismissDialogOnPause(dialog)) {
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
        kh.x3 x3Var;
        boolean storiesEnabled = getMessagesController().storiesEnabled();
        if (this.K3 != storiesEnabled) {
            X4();
            if (!this.K3 && storiesEnabled && (x3Var = this.f37686l0) != null) {
                x3Var.v();
            }
            this.K3 = storiesEnabled;
        }
        org.telegram.ui.Components.j10 j10Var = this.f37705p0;
        if (j10Var == null) {
            return;
        }
        if (this.N0 == 10) {
            j10Var.setImageResource(R.drawable.floating_check);
            this.f37705p0.setContentDescription(LocaleController.getString(R.string.Done));
            return;
        }
        j10Var.setImageResource(R.drawable.filled_fab_compose_32);
        this.f37705p0.setContentDescription(LocaleController.getString(R.string.NewMessageTitle));
    }

    public final boolean f4(long j10) {
        if (j10 < 0) {
            return false;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        if (!UserObject.isBotForum(user)) {
            return false;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f22527id);
        if ((topics != null && !topics.isEmpty()) || !MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f22527id)) {
            return false;
        }
        return true;
    }

    public final void f5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        boolean z12;
        ih.v6 X3;
        ArrayList arrayList;
        boolean z13;
        boolean z14;
        int i9;
        float f10;
        float f11;
        if (this.A0 != null && this.E == null) {
            yw ywVar = this.B3;
            if ((ywVar == null || !ywVar.c()) && !this.f37688l3 && (kVar = this.actionBar) != null && !kVar.s() && !this.f37668h2) {
                kh.wb wbVar = kh.wb.B2;
                int i10 = 0;
                if ((wbVar != null && wbVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().G0)) {
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
                    if (!z11 && (((arrayList = (X3 = X3()).f12241g) != null && arrayList.size() > 0) || X3.H())) {
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
                    vw vwVar = this.A0;
                    if (z13 != z15) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    vwVar.p(z10, z14);
                }
                boolean z16 = this.C0;
                int i11 = 8;
                float f12 = 0.0f;
                if (z16 != z15) {
                    if (z10) {
                        ValueAnimator valueAnimator = this.F;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        if (this.C0 && !isInPreviewMode()) {
                            this.A0.setVisibility(0);
                        }
                        float f13 = this.D0;
                        if (this.C0) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f11);
                        this.F = ofFloat;
                        ofFloat.addUpdateListener(new qi(1, this));
                        this.F.addListener(new org.telegram.ui.Components.y11(this, 23));
                        this.F.setDuration(200L);
                        this.F.setInterpolator(org.telegram.ui.Components.gr.f28844f);
                        this.F.start();
                    } else {
                        vw vwVar2 = this.A0;
                        if (z16 && !isInPreviewMode()) {
                            i9 = 0;
                        } else {
                            i9 = 8;
                        }
                        vwVar2.setVisibility(i9);
                        if (this.C0) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        this.D0 = f10;
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
                        float f14 = -this.J;
                        if (!z12) {
                            f12 = T3();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.E = ofFloat2;
                        ofFloat2.addUpdateListener(new lx(this, f14, z12, f12));
                        this.E.addListener(new ex(this, z12, 2));
                        this.E.setDuration(200L);
                        this.E.setInterpolator(org.telegram.ui.Components.gr.f28844f);
                        this.E.start();
                        return;
                    }
                    this.G = z12;
                    vw vwVar3 = this.A0;
                    if ((z12 || this.H) && !isInPreviewMode()) {
                        i11 = 0;
                    }
                    vwVar3.setVisibility(i11);
                    if (!z12) {
                        C4(0.0f);
                    } else {
                        this.f37730t3 = -AndroidUtilities.dp(81.0f);
                        C4(-T3());
                    }
                    while (true) {
                        cy[] cyVarArr = this.f37629a0;
                        if (i10 >= cyVarArr.length) {
                            break;
                        }
                        cy cyVar = cyVarArr[i10];
                        if (cyVar != null) {
                            cyVar.f37350a.requestLayout();
                        }
                        i10++;
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
        org.telegram.ui.Components.x60 x60Var = this.H0;
        if (x60Var != null) {
            x60Var.u();
        }
    }

    public final boolean g4(TLRPC.Dialog dialog) {
        char c10;
        if (dialog == null) {
            return false;
        }
        int i9 = this.f37629a0[0].f37357s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i9 == 7 || i9 == 8) && (!this.actionBar.s() || this.actionBar.t(null))) {
            MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
            if (this.f37629a0[0].f37357s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            dialogFilter = dialogFilterArr[c10];
        }
        if (dialogFilter != null) {
            if (dialogFilter.pinnedDialogs.indexOfKey(dialog.f22384id) < 0) {
                return false;
            }
            return true;
        }
        return dialog.pinned;
    }

    public final void g5(int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dy.g5(int, boolean):void");
    }

    @Override
    public final org.telegram.ui.ActionBar.x4 getBackButtonState() {
        if (!e4() && !this.B3.f38665f) {
            return org.telegram.ui.ActionBar.x4.f23944b;
        }
        return org.telegram.ui.ActionBar.x4.f23943a;
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f10) {
        int i9;
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T3, 1.0f);
            this.W3 = ofFloat;
            return ofFloat;
        }
        if (getLayoutContainer() != null && getLayoutContainer().getMeasuredWidth() > 0) {
            i9 = (int) Utilities.clamp((200.0f / getLayoutContainer().getMeasuredWidth()) * f10, 200.0f, 80.0f);
        } else {
            i9 = 150;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.T3, 1.0f);
        this.W3 = ofFloat2;
        ofFloat2.addUpdateListener(new fv(this, 2));
        this.W3.setInterpolator(org.telegram.ui.Components.gr.f28845g);
        this.W3.setDuration(i9);
        this.W3.start();
        return this.W3;
    }

    @Override
    public final java.util.ArrayList getThemeDescriptions() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dy.getThemeDescriptions():java.util.ArrayList");
    }

    public final boolean h4() {
        if (this.f37752y2 == null && this.f37678j2 == null) {
            return true;
        }
        return false;
    }

    public final boolean h5(long j10) {
        TLRPC.Chat chat;
        ow owVar;
        if ((this.O0 <= 1 && ((owVar = this.f37746x1) == null || owVar.getVisibility() != 0 || TextUtils.isEmpty(this.f37746x1.getFieldText()))) || !DialogObject.isChatDialog(j10) || (chat = getMessagesController().getChat(Long.valueOf(-j10))) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.y4.u0(this, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null);
        return false;
    }

    public final boolean i3(long j10, View view) {
        if (this.f37668h2 && getMessagesController().isForum(j10)) {
            return false;
        }
        Long valueOf = Long.valueOf(j10);
        ArrayList arrayList = this.E2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j10));
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).U(false, true);
            } else if (view instanceof org.telegram.ui.Cells.h6) {
                ((org.telegram.ui.Cells.h6) view).s(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j10));
        if (view instanceof org.telegram.ui.Cells.r2) {
            ((org.telegram.ui.Cells.r2) view).U(true, true);
        } else if (view instanceof org.telegram.ui.Cells.h6) {
            ((org.telegram.ui.Cells.h6) view).s(true, true);
        }
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        yw ywVar;
        if (!this.f37658f2 && (ywVar = this.B3) != null && ywVar.getFragment() != null) {
            return this.B3.getFragment().isLightStatusBar();
        }
        if (i0.a.f(getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j3(of.m0 m0Var) {
        mx mxVar;
        if (this.f37688l3 && (mxVar = this.f37750y0) != null) {
            ArrayList arrayList = mxVar.f29156w0;
            if (!arrayList.isEmpty()) {
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    if (m0Var.b((of.m0) arrayList.get(i9))) {
                        return;
                    }
                }
            }
            arrayList.add(m0Var);
            sx sxVar = this.T;
            ArrayList arrayList2 = sxVar.B;
            arrayList2.add(m0Var);
            sxVar.E = arrayList2.size() - 1;
            sxVar.f();
            this.T.f30664r.getText().clear();
            W4(true, null, null, false, true);
        }
    }

    public final void j4(long r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dy.j4(long):void");
    }

    public final void k3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            ArrayList arrayList = new ArrayList();
            if (this.R2 == 0 && this.T2 == 0 && Build.VERSION.SDK_INT >= 33 && qj0.n(parentActivity)) {
                if (z10) {
                    showDialog(new qj0(parentActivity, !org.telegram.ui.Components.kd0.c(), new sv(parentActivity, 1)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            if (getUserConfig().syncContacts && this.Q1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z10) {
                    org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.y4.w(parentActivity, new mv(this, 1)).f22702a;
                    this.P1 = c2Var;
                    showDialog(c2Var);
                    return;
                }
                arrayList.add("android.permission.READ_CONTACTS");
                arrayList.add("android.permission.WRITE_CONTACTS");
                arrayList.add("android.permission.GET_ACCOUNTS");
            }
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 33) {
                if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                }
                if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                }
                if (parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                }
            } else if ((i9 <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
            if (arrayList.isEmpty()) {
                if (this.f37740w0) {
                    this.f37740w0 = false;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dy.k4(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):boolean");
    }

    public final void l3(CharSequence charSequence) {
        int i9;
        if (this.f37746x1 != null) {
            if (this.f37756z2 == null && this.A2 == null && this.B2 == null) {
                return;
            }
            if (this.C2 == null) {
                org.telegram.ui.Components.wp0 wp0Var = new org.telegram.ui.Components.wp0(getParentActivity(), getResourceProvider());
                this.C2 = wp0Var;
                wp0Var.setLayoutClickListener(new iv(this, 0));
                this.C2.setOnModeChangeListener(new jv(this, 0));
                ow owVar = this.f37746x1;
                org.telegram.ui.Components.wp0 wp0Var2 = this.C2;
                if (wp0Var2 == null) {
                    owVar.getClass();
                } else {
                    owVar.B1 = wp0Var2;
                    owVar.addView(wp0Var2, 0, g7.e6.e(-1, 48, 51));
                    owVar.f26084b3 = false;
                    owVar.M();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.C2.getLayoutParams();
                layoutParams.rightMargin = -this.f37746x1.getPaddingRight();
                this.C2.setLayoutParams(layoutParams);
            }
            if (a4()) {
                this.C2.i(this.currentAccount, this.f37756z2);
            } else {
                String str = this.A2;
                if (str != null) {
                    org.telegram.ui.Components.wp0 wp0Var3 = this.C2;
                    wp0Var3.g(this.currentAccount);
                    if (!str.isEmpty()) {
                        wp0Var3.e(str, true);
                    }
                } else {
                    CharSequence charSequence2 = this.B2;
                    if (charSequence2 != null) {
                        org.telegram.ui.Components.wp0 wp0Var4 = this.C2;
                        wp0Var4.g(this.currentAccount);
                        if (charSequence2.length() > 0) {
                            wp0Var4.e(charSequence2, true);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.f37746x1.setFieldText(charSequence);
            }
            ow owVar2 = this.f37746x1;
            if (a4()) {
                i9 = R.string.AddCaption;
            } else {
                i9 = R.string.ShareComment;
            }
            owVar2.setOverrideHint(LocaleController.getString(i9));
            v3();
            if (this.C2.getMode() != 0) {
                this.f37746x1.x1(false, false);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dy.m3():void");
    }

    public final void m4(View view) {
        boolean z10;
        int i9;
        int i10;
        int i11;
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
            i9 = R.drawable.msg_markread;
        } else {
            i9 = 0;
        }
        if (SharedConfig.archiveHidden) {
            i10 = R.drawable.chats_pin;
        } else {
            i10 = R.drawable.chats_unpin;
        }
        int[] iArr = {i9, i10};
        if (z10) {
            str = LocaleController.getString(R.string.MarkAllAsRead);
        }
        if (SharedConfig.archiveHidden) {
            i11 = R.string.PinInTheList;
        } else {
            i11 = R.string.HideAboveTheList;
        }
        CharSequence[] charSequenceArr = {str, LocaleController.getString(i11)};
        hv hvVar = new hv(this, 0);
        f3Var.items = charSequenceArr;
        f3Var.itemIcons = iArr;
        f3Var.onClickListener = hvVar;
        showDialog(f3Var);
    }

    public final int n3() {
        if (this.f37746x1 != null) {
            return (int) (this.f37732u1.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(2.0f));
        } else if (this.T2 != 0) {
            return AndroidUtilities.dp(72.0f) + this.f37643c4;
        } else {
            return this.f37643c4 + this.f37654e4;
        }
    }

    public final void n4(android.view.View r26, int r27, f2.r0 r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dy.n4(android.view.View, int, f2.r0):void");
    }

    public final void o3() {
        AndroidUtilities.runOnUIThread(new dv(this, 2), 300L);
    }

    public final boolean o4(View view, int i9, float f10, org.telegram.ui.Components.vk0 vk0Var) {
        org.telegram.ui.Components.an0 an0Var;
        long j10;
        org.telegram.ui.Components.an0 an0Var2;
        TLRPC.EncryptedChat encryptedChat;
        long makeEncryptedDialogId;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.z2) && vk0Var.j(i9) != 21) {
            if (!this.actionBar.s() && !AndroidUtilities.isTablet() && !this.f37668h2 && (view instanceof org.telegram.ui.Cells.r2)) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                if (!getMessagesController().isForum(r2Var.getDialogId()) && !this.B3.c() && r2Var.R(f10)) {
                    return H4(r2Var);
                }
            }
            yw ywVar = this.B3;
            if (ywVar == null || !ywVar.c()) {
                mx mxVar = this.f37750y0;
                boolean z10 = true;
                if (mxVar != null && vk0Var == (an0Var2 = mxVar.U)) {
                    Object J = an0Var2.J(i9);
                    if (!this.f37750y0.U.J) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                        c2Var.N = string;
                        if (J instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) J;
                            if (chat.monoforum) {
                                c2Var.P = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, vf.c.i(chat, this.currentAccount, false));
                            } else {
                                c2Var.P = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, chat.title);
                            }
                            makeEncryptedDialogId = -chat.f22380id;
                        } else if (J instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) J;
                            if (user.f22527id == getUserConfig().clientUserId) {
                                c2Var.P = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, LocaleController.getString(R.string.SavedMessages));
                            } else {
                                c2Var.P = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user.first_name, user.last_name));
                            }
                            makeEncryptedDialogId = user.f22527id;
                        } else if (J instanceof TLRPC.EncryptedChat) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(((TLRPC.EncryptedChat) J).user_id));
                            c2Var.P = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user2.first_name, user2.last_name));
                            makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.f22388id);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new d3.e(this, makeEncryptedDialogId, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        showDialog(c2Var);
                        TextView textView = (TextView) c2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23230q7));
                        }
                        return true;
                    }
                }
                mx mxVar2 = this.f37750y0;
                if (mxVar2 != null && vk0Var == (an0Var = mxVar2.U)) {
                    if (this.f37668h2) {
                        n4(view, i9, vk0Var);
                        return false;
                    }
                    if ((view instanceof org.telegram.ui.Cells.h6) && !an0Var.O(i9)) {
                        j10 = ((org.telegram.ui.Cells.h6) view).getDialogId();
                    } else {
                        j10 = 0;
                    }
                    if (j10 != 0) {
                        M4(j10, view);
                        return true;
                    }
                } else {
                    Object I = ((of.m) vk0Var).I(i9);
                    if (I instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) I;
                        if (this.f37668h2) {
                            if ((this.N0 == 3 || I3()) && h5(dialog.f22384id)) {
                                if (this.N0 == 1 && I3() && this.f37673i2 && getMessagesController().isForum(dialog.f22384id)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -dialog.f22384id);
                                    bundle.putBoolean("for_select", true);
                                    bundle.putBoolean("forward_to", true);
                                    if (this.N0 != 1) {
                                        z10 = false;
                                    }
                                    bundle.putBoolean("bot_share_to", z10);
                                    bundle.putBoolean("quote", this.K0);
                                    bundle.putBoolean("reply_to", this.J0);
                                    we1 we1Var = new we1(bundle);
                                    we1Var.H0 = this;
                                    presentFragment(we1Var);
                                    return false;
                                }
                                i3(dialog.f22384id, view);
                                a5();
                                return true;
                            }
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                            m4(view);
                            return false;
                        } else if (!this.actionBar.s() || !g4(dialog)) {
                            M4(dialog.f22384id, view);
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
                mx mxVar = this.f37750y0;
                if (mxVar != null) {
                    mxVar.R();
                    return false;
                }
            }
        } else {
            org.telegram.ui.Components.x60 x60Var = this.H0;
            if (x60Var != null) {
                if (z10) {
                    x60Var.u();
                    this.H0 = null;
                    return false;
                }
            } else {
                cw cwVar = this.f37735v0;
                if (cwVar != null && cwVar.f34047n) {
                    if (z10) {
                        cwVar.setIsEditing(false);
                        I4(false);
                        return false;
                    }
                } else {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar != null && kVar.s()) {
                        if (z10) {
                            mx mxVar2 = this.f37750y0;
                            if (mxVar2 != null && mxVar2.getVisibility() == 0) {
                                this.f37750y0.Q(false);
                            }
                            b4(true);
                            return false;
                        }
                    } else if (this.f37632b.f47776f) {
                        if (z10) {
                            this.T.f30664r.getText().clear();
                            this.U.b(false);
                            this.T.f30664r.clearFocus();
                            return false;
                        }
                    } else {
                        cw cwVar2 = this.f37735v0;
                        if (cwVar2 != null && cwVar2.getVisibility() == 0 && !this.f37642c3) {
                            cw cwVar3 = this.f37735v0;
                            if (!cwVar3.K && !this.f37669h3) {
                                ArrayList arrayList = cwVar3.h;
                                if (!arrayList.isEmpty() && cwVar3.H != ((org.telegram.ui.Components.sz) arrayList.get(0)).f32572a) {
                                    if (z10) {
                                        cw cwVar4 = this.f37735v0;
                                        ArrayList arrayList2 = cwVar4.h;
                                        if (!arrayList2.isEmpty()) {
                                            cwVar4.f((org.telegram.ui.Components.sz) arrayList2.get(0), 0);
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        ow owVar = this.f37746x1;
                        if (owVar != null && owVar.s0()) {
                            if (z10) {
                                this.f37746x1.l0(true);
                            }
                        } else {
                            vw vwVar = this.A0;
                            if (vwVar.K == 0 && vwVar.O.L0() != 0) {
                                vwVar.h.x0(0);
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
        fh.l2 l2Var;
        cw cwVar;
        if (this.R1) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.h(true);
            }
            TLObject tLObject = this.T1;
            if (tLObject != null) {
                mx mxVar = this.f37750y0;
                if (mxVar != null) {
                    mxVar.U.R(this.S1, tLObject);
                }
                this.T1 = null;
            }
            this.R1 = false;
        }
        if (!this.G && (cwVar = this.f37735v0) != null && cwVar.getVisibility() == 0 && this.f37715r.f47776f) {
            int i9 = (int) (-this.J);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (i9 != 0 && i9 != currentActionBarHeight && i9 >= currentActionBarHeight / 2) {
                this.f37629a0[0].f37350a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.f37731u0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        if (!isInPreviewMode() && (l2Var = this.G0) != null && l2Var.getVisibility() == 0) {
            this.G0.setVisibility(8);
            this.G0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        B3();
        this.f37695n0 = true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        kh.x3 x3Var;
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
        if (this.f37695n0 && !this.f37700o0 && (x3Var = this.f37686l0) != null && this.K3) {
            this.f37700o0 = true;
            this.f37695n0 = false;
            x3Var.v();
        }
        AndroidUtilities.runOnUIThread(new uv(this, 3), 200L);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.x60 x60Var = this.H0;
        if (x60Var != null) {
            x60Var.u();
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
        int i9;
        super.onFragmentCreate();
        Bundle bundle = this.arguments;
        int i10 = 0;
        if (bundle != null) {
            this.f37668h2 = bundle.getBoolean("onlySelect", false);
            this.f37673i2 = this.arguments.getBoolean("canSelectTopics", false);
            this.f37691m2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.N0 = this.arguments.getInt("dialogsType", 0);
            this.K0 = this.arguments.getBoolean("quote", false);
            this.J0 = this.arguments.getBoolean("reply_to", false);
            this.L0 = this.arguments.getLong("reply_to_author", 0L);
            this.M0 = this.arguments.getLong("forward_into_channel", 0L);
            this.f37635b2 = this.arguments.getString("selectAlertString");
            this.f37641c2 = this.arguments.getString("selectAlertStringGroup");
            this.f37646d2 = this.arguments.getString("addToGroupAlertString");
            this.f37697n2 = this.arguments.getBoolean("allowSwitchAccount");
            this.f37702o2 = this.arguments.getBoolean("checkCanWrite", true);
            this.f37707p2 = this.arguments.getBoolean("afterSignup", false);
            this.R2 = this.arguments.getInt("folderId", 0);
            long j10 = this.arguments.getLong("community_id", 0L);
            this.T2 = j10;
            if (j10 != 0) {
                this.U2 = getMessagesController().getChat(Long.valueOf(this.T2));
                this.V2 = getMessagesController().getChatFull(this.T2);
            }
            this.f37652e2 = this.arguments.getBoolean("resetDelegate", true);
            this.O0 = this.arguments.getInt("messagesCount", 0);
            this.P0 = this.arguments.getInt("hasPoll", 0);
            this.Q0 = this.arguments.getBoolean("hasInvoice", false);
            this.f37712q2 = this.arguments.getBoolean("showSetPasswordConfirm", this.f37712q2);
            this.arguments.getInt("otherwiseRelogin");
            this.f37718r2 = this.arguments.getBoolean("allowGroups", true);
            this.f37724s2 = this.arguments.getBoolean("allowMegagroups", true);
            this.f37729t2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.f37733u2 = this.arguments.getBoolean("allowChannels", true);
            this.f37737v2 = this.arguments.getBoolean("allowUsers", true);
            this.f37742w2 = this.arguments.getBoolean("allowBots", true);
            this.f37747x2 = this.arguments.getBoolean("closeFragment", true);
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
        if (this.f37678j2 == null) {
            this.Z1 = getConnectionsManager().getConnectionState();
            this.G3.add(NotificationCenter.emojiLoaded);
            if (!this.f37668h2) {
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
        ih.v6 storiesController = getMessagesController().getStoriesController();
        if (!storiesController.A) {
            storiesController.T();
            if (!storiesController.f12252s) {
                ConnectionsManager.getInstance(storiesController.f12236a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new ih.t5(storiesController, 0));
            }
        }
        getMessagesController().loadPinnedDialogs(this.R2, 0L, null);
        if (this.N3 != null && !getMessagesStorage().isDatabaseMigrationInProgress()) {
            qu quVar = this.N3;
            if (quVar.getParent() != null) {
                ((ViewGroup) quVar.getParent()).removeView(quVar);
            }
            this.N3 = null;
        }
        if (e4()) {
            ih.v6 storiesController2 = getMessagesController().getStoriesController();
            if (storiesController2.f12258z) {
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
            i9 = AndroidUtilities.dp(72.0f);
        } else {
            i9 = 0;
        }
        this.f37654e4 = i9;
        if (this.S) {
            i10 = AndroidUtilities.dp(64.0f);
        }
        this.f37660f4 = i10;
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
        ow owVar = this.f37746x1;
        if (owVar != null) {
            owVar.A0();
        }
        org.telegram.ui.Components.wp0 wp0Var = this.C2;
        if (wp0Var != null) {
            wp0Var.j();
        }
        org.telegram.ui.Components.p61 p61Var = this.D2;
        if (p61Var != null) {
            AndroidUtilities.cancelRunOnUIThread(p61Var);
            this.D2 = null;
        }
        UndoView undoView = this.f37731u0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f37684k3.unlock();
        this.f37752y2 = null;
        aa1 aa1Var = aa1.f36446b;
        if (aa1Var != null) {
            aa1Var.dismiss();
            aa1.f36446b = null;
        }
    }

    @Override
    public final void onPanTranslationUpdate(float f10) {
        if (this.f37629a0 != null) {
            this.F0 = f10;
            ow owVar = this.f37746x1;
            int i9 = 0;
            if (owVar != null && owVar.s0()) {
                this.fragmentView.setTranslationY(f10);
                while (true) {
                    cy[] cyVarArr = this.f37629a0;
                    if (i9 >= cyVarArr.length) {
                        break;
                    }
                    cyVarArr[i9].setTranslationY(0.0f);
                    i9++;
                }
                if (!this.f37668h2) {
                    this.actionBar.setTranslationY(0.0f);
                    org.telegram.ui.Components.gc gcVar = this.f37679j3;
                    if (gcVar != null) {
                        gcVar.l();
                    }
                }
                mx mxVar = this.f37750y0;
                if (mxVar != null) {
                    mxVar.setTranslationY(this.E0);
                    return;
                }
                return;
            }
            while (true) {
                cy[] cyVarArr2 = this.f37629a0;
                if (i9 >= cyVarArr2.length) {
                    break;
                }
                cyVarArr2[i9].setTranslationY(f10);
                i9++;
            }
            if (!this.f37668h2) {
                this.actionBar.setTranslationY(f10);
                org.telegram.ui.Components.gc gcVar2 = this.f37679j3;
                if (gcVar2 != null) {
                    gcVar2.l();
                }
            }
            mx mxVar2 = this.f37750y0;
            if (mxVar2 != null) {
                mxVar2.setTranslationY(this.F0 + this.E0);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.gc gcVar = this.O;
        if (gcVar != null) {
            gcVar.b();
            this.O = null;
        }
        yw ywVar = this.B3;
        if (ywVar != null) {
            ywVar.f38667r = true;
            fx fxVar = ywVar.f38661a;
            if (fxVar != null) {
                fxVar.onPause();
            }
        }
        org.telegram.ui.Components.x60 x60Var = this.H0;
        if (x60Var != null) {
            x60Var.u();
        }
        ow owVar = this.f37746x1;
        if (owVar != null) {
            owVar.C0();
        }
        int i9 = 0;
        UndoView undoView = this.f37731u0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        setBulletinDelegate(null);
        if (this.f37629a0 == null) {
            return;
        }
        while (true) {
            cy[] cyVarArr = this.f37629a0;
            if (i9 < cyVarArr.length) {
                cyVarArr[i9].d.getClass();
                i9++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i9, String[] strArr, int[] iArr) {
        FilesMigrationService.FilesMigrationBottomSheet filesMigrationBottomSheet;
        if (i9 == 1) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (iArr.length > i10) {
                    String str = strArr[i10];
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
                            if (iArr[i10] == 0) {
                                NotificationsController.getInstance(this.currentAccount).showNotifications();
                                break;
                            } else {
                                qj0.m();
                                continue;
                            }
                        case 1:
                            if (iArr[i10] == 0) {
                                ImageLoader.getInstance().checkMediaPaths();
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (iArr[i10] == 0) {
                                AndroidUtilities.runOnUIThread(new uv(this, 2));
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
            if (this.f37740w0) {
                this.f37740w0 = false;
                J4();
            }
        } else if (i9 == 4) {
            for (int i11 : iArr) {
                if (i11 != 0) {
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
        dy dyVar;
        cy cyVar;
        lw lwVar;
        int i9;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.Components.an0 an0Var;
        fh.l2 l2Var;
        super.onResume();
        vw vwVar = this.A0;
        char c10 = 0;
        if (vwVar != null) {
            ArrayList arrayList = vwVar.f12049x;
            ih.v6 v6Var = vwVar.f12042s;
            v6Var.l(v6Var.f12241g);
            v6Var.l(v6Var.h);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TL_stories.PeerStories y10 = v6Var.y(((ih.o) arrayList.get(i10)).f11875c);
                if (y10 != null) {
                    v6Var.X(y10);
                }
            }
        }
        yw ywVar = this.B3;
        if (ywVar != null) {
            ywVar.f38667r = false;
            fx fxVar = ywVar.f38661a;
            if (fxVar != null) {
                fxVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (l2Var = this.G0) != null && l2Var.getVisibility() == 0) {
            this.G0.setVisibility(8);
            this.G0.setBackground(null);
        }
        if (this.f37629a0 != null) {
            int i11 = 0;
            while (true) {
                cy[] cyVarArr = this.f37629a0;
                if (i11 >= cyVarArr.length) {
                    break;
                }
                cyVarArr[i11].d.l();
                i11++;
            }
        }
        ow owVar = this.f37746x1;
        if (owVar != null) {
            owVar.D0();
        }
        long j10 = 0;
        if (!this.f37668h2 && this.R2 == 0 && this.T2 == 0) {
            getMediaDataController().checkStickers(4);
        }
        mx mxVar = this.f37750y0;
        if (mxVar != null && (an0Var = mxVar.U) != null) {
            an0Var.l();
        }
        if (!this.f37707p2 && getUserConfig().unacceptedTermsOfService != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.R2 == 0 && this.T2 == 0 && this.Y1 && !this.f37668h2 && (i9 = Build.VERSION.SDK_INT) >= 23) {
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.Y1 = false;
                if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i9 <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i9 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                dyVar = this;
                org.telegram.messenger.n1 n1Var = new org.telegram.messenger.n1(dyVar, z13, z11, z12, parentActivity);
                if (dyVar.f37707p2 && (z11 || z13)) {
                    j10 = 4000;
                }
                AndroidUtilities.runOnUIThread(n1Var, j10);
            } else {
                dyVar = this;
            }
        } else {
            dyVar = this;
            if (!dyVar.f37668h2 && dyVar.R2 == 0 && dyVar.T2 == 0 && XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(10020)) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutMiuiLockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.f6.L5), null);
                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PermissionXiaomiLockscreen);
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new jv(this, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.if0(21));
                        showDialog(alertDialog$Builder.f22702a);
                    }
                } else {
                    return;
                }
            } else if (dyVar.R2 == 0 && dyVar.T2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutFSILockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder2.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.f6.L5), null);
                        alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.PermissionFSILockscreen);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new jv(this, 9));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.if0(22));
                        showDialog(alertDialog$Builder2.f22702a);
                    }
                } else {
                    return;
                }
            }
        }
        J4();
        if (dyVar.f37629a0 != null) {
            int i12 = 0;
            while (true) {
                cy[] cyVarArr2 = dyVar.f37629a0;
                if (i12 >= cyVarArr2.length) {
                    break;
                }
                cy cyVar2 = cyVarArr2[i12];
                if (cyVar2.f37357s == 0 && cyVar2.v == 2 && cyVar2.f37352c.L0() == 0 && Z3()) {
                    dyVar.f37629a0[i12].f37352c.h1(1, (int) dyVar.J);
                }
                if (i12 == 0) {
                    dyVar.f37629a0[i12].d.getClass();
                } else {
                    dyVar.f37629a0[i12].d.getClass();
                }
                i12++;
            }
        }
        L4();
        setBulletinDelegate(new x8(this, 4));
        if (dyVar.f37688l3) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), dyVar.classGuid);
        }
        g5(0, false);
        Z4(false, true);
        f5(false);
        if (getMessagesStorage().showClearDatabaseAlert) {
            getMessagesStorage().showClearDatabaseAlert = false;
            aa1.n(this);
        }
        B3();
        if (dyVar.f37735v0 != null && (cyVar = dyVar.f37629a0[0]) != null && (lwVar = cyVar.d) != null) {
            int i13 = lwVar.h;
            if (i13 == 7 || i13 == 8) {
                MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
                if (i13 != 7) {
                    c10 = 1;
                }
                MessagesController.DialogFilter dialogFilter = dialogFilterArr[c10];
                if (dialogFilter != null) {
                    dyVar.f37735v0.h(dialogFilter.localId);
                }
            }
        }
    }

    @Override
    public final void onSlideProgress(boolean z10, float f10) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.V3 && this.W3 == null) {
            F4(f10);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        fh.l2 l2Var;
        dy dyVar;
        yw ywVar = this.B3;
        if (ywVar != null && ywVar.c()) {
            this.B3.getFragment().onTransitionAnimationEnd(z10, z11);
        } else {
            if (z10 && (l2Var = this.G0) != null && l2Var.getVisibility() == 0) {
                this.G0.setVisibility(8);
                this.G0.setBackground(null);
            }
            if (z10 && this.f37707p2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).f35532t0.c(false);
                }
            }
        }
        if (!z10 && (dyVar = this.S2) != null) {
            dyVar.removeSelfFromStack();
        }
        B3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        yw ywVar = this.B3;
        if (ywVar != null && ywVar.c()) {
            this.B3.getFragment().onTransitionAnimationProgress(z10, f10);
        } else {
            fh.l2 l2Var = this.G0;
            if (l2Var != null && l2Var.getVisibility() == 0) {
                if (z10) {
                    this.G0.setAlpha(1.0f - f10);
                } else {
                    this.G0.setAlpha(f10);
                }
            }
        }
        B3();
    }

    public final boolean p3(long j10) {
        int i9;
        int i10 = this.N0;
        if (i10 != 15 && i10 != 16 && this.f37646d2 == null && this.f37702o2) {
            if (DialogObject.isChatDialog(j10)) {
                long j11 = -j10;
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j11));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    if (this.f37691m2 || !ChatObject.isCanWriteToChannel(j11, this.currentAccount) || (i9 = this.P0) == 2 || i9 == 3) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.SendMessageTitle);
                        int i11 = this.P0;
                        if (i11 == 3) {
                            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.TodoCantForward);
                        } else if (i11 == 2) {
                            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PublicPollCantForward);
                        } else {
                            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ChannelCantSendMessage);
                        }
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        showDialog(alertDialog$Builder.f22702a);
                        return false;
                    }
                    return true;
                }
                return true;
            } else if (DialogObject.isEncryptedDialog(j10)) {
                if (this.P0 != 0 || this.Q0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.SendMessageTitle);
                    int i12 = this.P0;
                    if (i12 == 3) {
                        alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.TodoCantForwardSecretChat);
                    } else if (i12 != 0) {
                        alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.PollCantForwardSecretChat);
                    } else {
                        alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
                    }
                    alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    showDialog(alertDialog$Builder2.f22702a);
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
        for (int i9 = 0; i9 < 4; i9++) {
            if (UserConfig.getInstance(i9).isClientActivated()) {
                arrayList.add(Integer.valueOf(i9));
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.jn0(7));
        org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(this, view);
        if (arrayList.size() > 0) {
            if (H.x() > 0) {
                H.k();
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                int intValue = ((Integer) obj).intValue();
                if (this.currentAccount == intValue) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                linearLayout.setBackground(org.telegram.ui.ActionBar.f6.Y(getThemedColor(org.telegram.ui.ActionBar.f6.f23092i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
                z8Var.r(currentUser);
                org.telegram.ui.Components.tf0 tf0Var = new org.telegram.ui.Components.tf0(this, getParentActivity(), z10);
                linearLayout.addView(tf0Var, g7.e6.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(getParentActivity());
                if (z10) {
                    o9Var.setScaleX(0.833f);
                    o9Var.setScaleY(0.833f);
                }
                o9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                o9Var.getImageReceiver().setCurrentAccount(intValue);
                o9Var.e(currentUser, z8Var);
                tf0Var.addView(o9Var, g7.e6.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23108j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, g7.e6.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new fh.a3(this, intValue, H, 14));
                H.r(linearLayout, g7.e6.n(230, 48));
            }
        }
        ShapeDrawable b02 = org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(24.0f), getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.f6.l1(0.15f, -16777216));
        H.f34586z.set(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
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
        if (presentFragment && this.f37629a0 != null) {
            int i9 = 0;
            while (true) {
                cy[] cyVarArr = this.f37629a0;
                if (i9 >= cyVarArr.length) {
                    break;
                }
                cyVarArr[i9].d.getClass();
                i9++;
            }
        }
        kh.x3 x3Var = this.f37686l0;
        if (x3Var != null) {
            x3Var.e(true);
        }
        kh.x3 x3Var2 = this.m0;
        if (x3Var2 != null) {
            x3Var2.e(true);
        }
        org.telegram.ui.Components.gc.e();
        return presentFragment;
    }

    public final void q3(boolean z10) {
        oh.i iVar;
        TLRPC.ChatFull chatFull;
        boolean z11;
        org.telegram.ui.Components.bs bsVar = this.F1;
        if (bsVar != null && (iVar = this.M1) != null && (chatFull = this.V2) != null) {
            if (this.T2 != 0 && chatFull.requests_pending > 0 && !this.f37632b.f47776f) {
                z11 = true;
            } else {
                z11 = false;
            }
            bsVar.i(iVar, z11, z10);
            this.M1.setTitle(LocaleController.formatPluralString("CommunityPendingRequestsRow", this.V2.requests_pending, new Object[0]));
        }
    }

    public final void q4(int i9, long j10, TLRPC.Chat chat, boolean z10, boolean z11) {
        if (i9 == 103) {
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

    public final void r3(cy cyVar) {
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        int i9;
        boolean z14;
        int L0 = cyVar.f37352c.L0();
        int N0 = cyVar.f37352c.N0();
        if (!this.f37642c3 && !this.f37669h3) {
            cw cwVar = this.f37735v0;
            if (cwVar == null || cwVar.getVisibility() != 0 || !this.f37735v0.K) {
                int abs = Math.abs(N0 - L0) + 1;
                if (N0 != -1) {
                    f2.q1 K = cyVar.f37350a.K(N0);
                    if (K != null && K.f5505f == 11) {
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
                int i10 = cyVar.f37357s;
                if (i10 == 7 || i10 == 8) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
                    int i11 = cyVar.h;
                    if (i11 >= 0 && i11 < dialogFilters.size() && (dialogFilters.get(cyVar.h).flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) == 0 && ((abs > 0 && N0 >= R3(this.currentAccount, cyVar.f37357s, 1, this.O1).size() - 10) || (abs == 0 && !getMessagesController().isDialogsEndReached(1)))) {
                        boolean isDialogsEndReached = getMessagesController().isDialogsEndReached(1);
                        boolean z15 = !isDialogsEndReached;
                        if (isDialogsEndReached && getMessagesController().isServerDialogsEndReached(1)) {
                            z10 = z15;
                            z11 = false;
                        } else {
                            z10 = z15;
                            z11 = true;
                        }
                        if ((abs <= 0 && N0 >= R3(this.currentAccount, cyVar.f37357s, this.R2, this.O1).size() - 10) || (abs == 0 && (((i9 = cyVar.f37357s) == 7 || i9 == 8) && !getMessagesController().isDialogsEndReached(this.R2)))) {
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
                                    dy dyVar = dy.this;
                                    if (z12) {
                                        dyVar.getMessagesController().loadDialogs(dyVar.R2, -1, 100, z13);
                                    }
                                    if (z11) {
                                        dyVar.getMessagesController().loadDialogs(1, -1, 100, z10);
                                    } else {
                                        dyVar.getClass();
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
                        dy dyVar = dy.this;
                        if (z12) {
                            dyVar.getMessagesController().loadDialogs(dyVar.R2, -1, 100, z13);
                        }
                        if (z11) {
                            dyVar.getMessagesController().loadDialogs(1, -1, 100, z10);
                        } else {
                            dyVar.getClass();
                        }
                    }
                });
            }
        }
    }

    public final void r4(ArrayList arrayList, int i9, boolean z10, boolean z11, HashSet hashSet) {
        MessagesController.DialogFilter dialogFilter;
        boolean z12;
        int i10;
        int i11;
        int i12;
        HashSet hashSet2;
        ArrayList arrayList2;
        int i13;
        long j10;
        int i14;
        int i15;
        MessagesController.DialogFilter dialogFilter2;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        int i16;
        int i17;
        MessagesController.DialogFilter dialogFilter3;
        MessagesController.DialogFilter dialogFilter4;
        dy dyVar;
        int i18;
        boolean z13;
        boolean z14;
        int i19;
        org.telegram.ui.ActionBar.f3 f3Var;
        TLRPC.User tL_userEmpty;
        boolean z15;
        String string;
        TLRPC.User user2;
        TLRPC.User user3;
        String string2;
        dy dyVar2 = this;
        int i20 = i9;
        if (dyVar2.getParentActivity() == null) {
            return;
        }
        ?? r72 = 0;
        int i21 = dyVar2.f37629a0[0].f37357s;
        boolean z16 = (i21 == 7 || i21 == 8) && (!dyVar2.actionBar.s() || dyVar2.actionBar.t(null));
        if (z16) {
            dialogFilter = dyVar2.getMessagesController().selectedDialogFilter[dyVar2.f37629a0[0].f37357s == 8 ? (char) 1 : (char) 0];
        } else {
            dialogFilter = null;
        }
        int size = arrayList.size();
        if (i20 != 105 && i20 != 107) {
            if ((i20 == 100 || i20 == 108) && dyVar2.J2 != 0) {
                ArrayList<TLRPC.Dialog> dialogs = dyVar2.getMessagesController().getDialogs(dyVar2.R2);
                int size2 = dialogs.size();
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (i22 < size2) {
                    TLRPC.Dialog dialog = dialogs.get(i22);
                    if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                        if (dyVar2.g4(dialog)) {
                            i13 = size2;
                            if (DialogObject.isEncryptedDialog(dialog.f22384id)) {
                                i24++;
                            } else {
                                i23++;
                            }
                        } else {
                            i13 = size2;
                            if (!dyVar2.getMessagesController().isPromoDialog(dialog.f22384id, false)) {
                                break;
                            }
                        }
                    } else {
                        i13 = size2;
                    }
                    i22++;
                    size2 = i13;
                }
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                for (int i28 = 0; i28 < size; i28++) {
                    Long l10 = (Long) arrayList.get(i28);
                    long longValue = l10.longValue();
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) dyVar2.getMessagesController().dialogs_dict.f(longValue);
                    if (dialog2 != null && !dyVar2.g4(dialog2)) {
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
                    i12 = 100 - dialogFilter.alwaysShow.size();
                } else if (dyVar2.R2 == 0 && dialogFilter == null) {
                    i12 = dyVar2.getUserConfig().isPremium() ? dyVar2.getMessagesController().dialogFiltersPinnedLimitPremium : dyVar2.getMessagesController().dialogFiltersPinnedLimitDefault;
                } else if (UserConfig.getInstance(dyVar2.currentAccount).isPremium()) {
                    i12 = dyVar2.getMessagesController().maxFolderPinnedDialogsCountPremium;
                } else {
                    i12 = dyVar2.getMessagesController().maxFolderPinnedDialogsCountDefault;
                }
                if (i26 + i24 > i12 || (i25 + i23) - i27 > i12) {
                    if (dyVar2.R2 == 0 && dialogFilter == null) {
                        showDialog(new zf.j0(0, dyVar2.currentAccount, dyVar2.getParentActivity(), this, null));
                        return;
                    } else {
                        org.telegram.ui.Components.y4.u0(dyVar2, null, LocaleController.formatString("PinFolderLimitReached", R.string.PinFolderLimitReached, LocaleController.formatPluralString("Chats", i12, new Object[0])), null);
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
                    boolean z17 = MessagesController.getInstance(dyVar2.currentAccount).canRevokePmInbox;
                    long j11 = MessagesController.getInstance(dyVar2.currentAccount).revokeTimePmLimit;
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
                                    TLRPC.EncryptedChat encryptedChat2 = dyVar2.getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(l11.longValue())));
                                    user2 = encryptedChat2 != null ? dyVar2.getMessagesController().getUser(Long.valueOf(encryptedChat2.user_id)) : null;
                                } else {
                                    user2 = dyVar2.getMessagesController().getUser(l11);
                                }
                                if (user2 != null) {
                                    ArrayList arrayList3 = (ArrayList) MessagesController.getInstance(dyVar2.currentAccount).dialogMessage.f(user2.f22527id);
                                    boolean z18 = (arrayList3 == null || arrayList3.size() != 1 || arrayList3.get(0) == null || ((MessageObject) arrayList3.get(0)).messageOwner == null || (!(((MessageObject) arrayList3.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionUserJoined) && !(((MessageObject) arrayList3.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
                                    if (!user2.bot && !UserObject.isDeleted(user2) && user2.f22527id != dyVar2.getUserConfig().getClientUserId() && !z18) {
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
                    int i30 = dyVar2.M2;
                    bg.d0 d0Var = new bg.d0(dyVar2, arrayList2, i20, hashSet3);
                    org.telegram.ui.ActionBar.b6 b6Var = dyVar2.resourceProvider;
                    Pattern pattern = org.telegram.ui.Components.y4.f34847a;
                    int currentAccount = dyVar2.getCurrentAccount();
                    Activity parentActivity = dyVar2.getParentActivity();
                    ?? alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, b6Var);
                    UserConfig.getInstance(currentAccount).getClientUserId();
                    org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
                    boolean[] zArr = new boolean[1];
                    TextView textView = new TextView(parentActivity);
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23108j5, false));
                    textView.setTextSize(1, 16.0f);
                    textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                    org.telegram.ui.Components.f3 f3Var2 = new org.telegram.ui.Components.f3(parentActivity, z1VarArr);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                    c2Var.C = 6;
                    alertDialog$Builder.n(f3Var2);
                    TextView textView2 = new TextView(parentActivity);
                    boolean z20 = z19;
                    textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E8, false));
                    textView2.setTextSize(1, 20.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    if (z20) {
                        if (z15) {
                            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(parentActivity, 1, b6Var);
                            z1VarArr[0] = z1Var;
                            z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
                            z1VarArr[0].e(LocaleController.getString(R.string.DeleteMessagesForBothSidesWherePossible), "", false, false, false);
                            z1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                            f3Var2.addView(z1VarArr[0], g7.e6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                            z1VarArr[0].setOnClickListener(new org.telegram.ui.Components.s0(2, zArr));
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
                    f3Var2.addView(textView2, g7.e6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
                    f3Var2.addView(textView, g7.e6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                    if (z20) {
                        string = LocaleController.getString("Delete", R.string.Delete);
                    } else if (i30 != 0) {
                        string = LocaleController.getString("ClearHistoryCache", R.string.ClearHistoryCache);
                    } else {
                        string = LocaleController.getString("ClearHistory", R.string.ClearHistory);
                    }
                    alertDialog$Builder.k(string, new org.telegram.ui.Components.g1(5, d0Var, zArr));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    dyVar2.showDialog(c2Var);
                    TextView textView3 = (TextView) c2Var.d(-1);
                    if (textView3 != null) {
                        textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                        return;
                    }
                    return;
                } else if (i20 == 106 && z10) {
                    if (size == 1) {
                        Long l12 = (Long) arrayList2.get(0);
                        l12.getClass();
                        user3 = dyVar2.getMessagesController().getUser(l12);
                    } else {
                        user3 = null;
                    }
                    boolean z21 = dyVar2.N2 != 0;
                    yr yrVar = new yr(7, dyVar2, arrayList2);
                    Pattern pattern2 = org.telegram.ui.Components.y4.f34847a;
                    if (dyVar2.getParentActivity() != null) {
                        if (size == 1 && user3 == null) {
                            return;
                        }
                        Activity parentActivity2 = dyVar2.getParentActivity();
                        ?? alertDialog$Builder2 = new AlertDialog$Builder(parentActivity2);
                        ?? r92 = new org.telegram.ui.Cells.z1[2];
                        ?? linearLayout = new LinearLayout(parentActivity2);
                        linearLayout.setOrientation(1);
                        alertDialog$Builder2.n(linearLayout);
                        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
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
                                org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(parentActivity2, 1);
                                r92[i32] = z1Var2;
                                z1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(r72));
                                if (i32 == 0) {
                                    r92[i32].e(LocaleController.getString(R.string.ReportSpamTitle), "", true, false, false);
                                } else {
                                    r92[i32].e(LocaleController.getString(size == 1 ? R.string.DeleteThisChatBothSides : R.string.DeleteTheseChatsBothSides), "", true, false, false);
                                }
                                r92[i32].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), r72, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), r72);
                                linearLayout.addView(r92[i32], g7.e6.n(-1, 48));
                                r92[i32].setOnClickListener(new gh.z0(zArr2, i32, 6));
                            }
                            i32++;
                            i31 = 2;
                            r72 = 0;
                        }
                        alertDialog$Builder2.k(string2, new org.telegram.ui.Components.g1(9, yrVar, zArr2));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        dyVar2.showDialog(c2Var2);
                        TextView textView4 = (TextView) c2Var2.d(-1);
                        if (textView4 != null) {
                            textView4.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else if (z10) {
                org.telegram.ui.Components.y4.v0(this, LocaleController.getString(R.string.CommunityUngroupChats), LocaleController.getString(R.string.CommunityUngroupChatsText), LocaleController.getString(R.string.CommunityUngroupChatsButton), true, new rv(dyVar2, arrayList, i20, z11, hashSet));
                return;
            } else {
                hashSet2 = hashSet;
                arrayList2 = arrayList;
                int size4 = arrayList2.size();
                int i33 = 0;
                while (i33 < size4) {
                    Object obj2 = arrayList2.get(i33);
                    i33++;
                    dyVar2.getMessagesController().toggleCommunityCollapsedInDialogs(-((Long) obj2).longValue(), false);
                }
            }
            int i34 = Integer.MAX_VALUE;
            if (dialogFilter != null && ((i20 == 100 || i20 == 108) && dyVar2.J2 != 0)) {
                int size5 = dialogFilter.pinnedDialogs.size();
                for (int i35 = 0; i35 < size5; i35++) {
                    i34 = Math.min(i34, dialogFilter.pinnedDialogs.valueAt(i35));
                }
                i34 -= dyVar2.J2;
            }
            int i36 = i34;
            int i37 = 0;
            int i38 = 0;
            while (i37 < size) {
                Long l13 = (Long) arrayList2.get(i37);
                long longValue2 = l13.longValue();
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) dyVar2.getMessagesController().dialogs_dict.f(longValue2);
                if (dialog3 == null) {
                    i16 = i20;
                    i17 = i36;
                    i15 = i37;
                    dialogFilter3 = dialogFilter;
                } else {
                    if (DialogObject.isEncryptedDialog(longValue2)) {
                        encryptedChat = org.telegram.messenger.l0.l(dyVar2.getMessagesController(), longValue2);
                        if (encryptedChat != null) {
                            i15 = i37;
                            dialogFilter2 = dialogFilter;
                            tL_userEmpty = dyVar2.getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
                        } else {
                            i15 = i37;
                            dialogFilter2 = dialogFilter;
                            tL_userEmpty = new TLRPC.TL_userEmpty();
                        }
                        user = tL_userEmpty;
                        chat = null;
                    } else {
                        i15 = i37;
                        dialogFilter2 = dialogFilter;
                        if (DialogObject.isUserDialog(longValue2)) {
                            user = dyVar2.getMessagesController().getUser(l13);
                            chat = null;
                        } else {
                            chat = dyVar2.getMessagesController().getChat(Long.valueOf(-longValue2));
                            user = null;
                        }
                        encryptedChat = null;
                    }
                    if (chat != null || user != null) {
                        boolean z22 = (user == null || !user.bot || MessagesController.isSupportUser(user)) ? false : true;
                        if (i20 == 100 || i20 == 108) {
                            i16 = i20;
                            if (dyVar2.J2 != 0) {
                                if (!dyVar2.g4(dialog3)) {
                                    i38++;
                                    i17 = i36;
                                    dialogFilter3 = dialogFilter2;
                                    dyVar2.s4(longValue2, true, dialogFilter3, i17, size == 1);
                                    if (dialogFilter3 != null) {
                                        int i39 = i17 + 1;
                                        if (encryptedChat != null) {
                                            if (!dialogFilter3.alwaysShow.contains(Long.valueOf(encryptedChat.user_id))) {
                                                dialogFilter3.alwaysShow.add(Long.valueOf(encryptedChat.user_id));
                                            }
                                        } else if (!dialogFilter3.alwaysShow.contains(Long.valueOf(dialog3.f22384id))) {
                                            dialogFilter3.alwaysShow.add(Long.valueOf(dialog3.f22384id));
                                        }
                                        i17 = i39;
                                    }
                                }
                                i17 = i36;
                                dialogFilter3 = dialogFilter2;
                            } else {
                                i17 = i36;
                                dialogFilter3 = dialogFilter2;
                                if (dyVar2.g4(dialog3)) {
                                    i38++;
                                    dyVar2.s4(longValue2, false, dialogFilter3, i17, size == 1);
                                    dialogFilter4 = dialogFilter3;
                                    dialogFilter = dialogFilter4;
                                    i37 = i15 + 1;
                                    i36 = i17;
                                    i20 = i16;
                                    r16 = 3;
                                }
                            }
                            dialogFilter4 = dialogFilter3;
                            dialogFilter = dialogFilter4;
                            i37 = i15 + 1;
                            i36 = i17;
                            i20 = i16;
                            r16 = 3;
                        } else if (i20 == 101) {
                            if (dyVar2.I2 != 0) {
                                dyVar2.j4(longValue2);
                            } else {
                                dyVar2.getMessagesController().markDialogAsUnread(longValue2, null, 0L);
                            }
                        } else {
                            if (i20 == 102) {
                                dyVar = dyVar2;
                                i18 = 1;
                            } else if (i20 == 103) {
                                dyVar = dyVar2;
                                i18 = 1;
                            } else if (i20 != 104) {
                                i16 = i20;
                                i17 = i36;
                                dialogFilter3 = dialogFilter2;
                                dialogFilter4 = dialogFilter3;
                                dialogFilter = dialogFilter4;
                                i37 = i15 + 1;
                                i36 = i17;
                                i20 = i16;
                                r16 = 3;
                            } else if (size == 1 && dyVar2.K2 == 1) {
                                dy dyVar3 = dyVar2;
                                dyVar3.showDialog(org.telegram.ui.Components.y4.F(longValue2, 0L, dyVar3, null), new ev(dyVar3, 2));
                                return;
                            } else {
                                dyVar = dyVar2;
                                if (dyVar.L2 != 0) {
                                    if (dyVar.getMessagesController().isDialogMuted(longValue2, 0L)) {
                                        dyVar.getNotificationsController().setDialogNotificationsSettings(longValue2, 0L, 4);
                                    }
                                    i17 = i36;
                                    dyVar2 = dyVar;
                                    dialogFilter3 = dialogFilter2;
                                    i16 = i20;
                                    dialogFilter4 = dialogFilter3;
                                    dialogFilter = dialogFilter4;
                                    i37 = i15 + 1;
                                    i36 = i17;
                                    i20 = i16;
                                    r16 = 3;
                                } else if (z11) {
                                    Pattern pattern3 = org.telegram.ui.Components.y4.f34847a;
                                    if (dyVar.getParentActivity() == null) {
                                        f3Var = null;
                                        i19 = 3;
                                    } else {
                                        org.telegram.ui.ActionBar.f3 f3Var3 = new org.telegram.ui.ActionBar.f3(dyVar.getParentActivity(), null, false, false);
                                        f3Var3.fixNavigationBar();
                                        f3Var3.title = LocaleController.getString(R.string.Notifications);
                                        f3Var3.bigTitle = true;
                                        String formatString = LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 1, new Object[0]));
                                        String formatString2 = LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 8, new Object[0]));
                                        String formatString3 = LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Days", 2, new Object[0]));
                                        String string3 = LocaleController.getString(R.string.MuteDisable);
                                        CharSequence[] charSequenceArr = new CharSequence[4];
                                        charSequenceArr[0] = formatString;
                                        charSequenceArr[1] = formatString2;
                                        charSequenceArr[2] = formatString3;
                                        charSequenceArr[r16] = string3;
                                        i19 = 3;
                                        v vVar = new v(3, arrayList2, dyVar);
                                        f3Var3.items = charSequenceArr;
                                        f3Var3.onClickListener = vVar;
                                        f3Var = f3Var3;
                                    }
                                    dyVar.showDialog(f3Var, new ev(dyVar, i19));
                                    return;
                                } else {
                                    if (!dyVar.getMessagesController().isDialogMuted(longValue2, 0L)) {
                                        dyVar.getNotificationsController().setDialogNotificationsSettings(longValue2, 0L, 3);
                                    }
                                    i17 = i36;
                                    dyVar2 = dyVar;
                                    dialogFilter3 = dialogFilter2;
                                    i16 = i20;
                                    dialogFilter4 = dialogFilter3;
                                    dialogFilter = dialogFilter4;
                                    i37 = i15 + 1;
                                    i36 = i17;
                                    i20 = i16;
                                    r16 = 3;
                                }
                            }
                            if (size == i18) {
                                if (i20 == 102 && dyVar.Q2) {
                                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(dyVar.getParentActivity());
                                    String string4 = LocaleController.getString(R.string.PsaHideChatAlertTitle);
                                    org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f22702a;
                                    c2Var3.N = string4;
                                    c2Var3.P = LocaleController.getString(R.string.PsaHideChatAlertText);
                                    alertDialog$Builder3.k(LocaleController.getString(R.string.PsaHide), new jv(dyVar, 11));
                                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                                    dyVar.showDialog(c2Var3);
                                    return;
                                }
                                org.telegram.ui.Components.y4.s(this, i20 == 103, chat, user, DialogObject.isEncryptedDialog(dialog3.f22384id), i20 == 102, false, false, new nh.l0(dyVar, i20, chat, longValue2, z22));
                                return;
                            }
                            boolean z23 = z22;
                            TLRPC.Chat chat2 = chat;
                            if (dyVar.getMessagesController().isPromoDialog(longValue2, true)) {
                                dyVar.getMessagesController().hidePromoDialog();
                                i17 = i36;
                                dyVar2 = dyVar;
                                dialogFilter3 = dialogFilter2;
                                i16 = i20;
                                dialogFilter4 = dialogFilter3;
                                dialogFilter = dialogFilter4;
                                i37 = i15 + 1;
                                i36 = i17;
                                i20 = i16;
                                r16 = 3;
                            } else if (i20 == 103 && dyVar.M2 != 0) {
                                dyVar.getMessagesController().deleteDialog(longValue2, 2, false);
                                i17 = i36;
                                dyVar2 = dyVar;
                                dialogFilter3 = dialogFilter2;
                                i16 = i20;
                                dialogFilter4 = dialogFilter3;
                                dialogFilter = dialogFilter4;
                                i37 = i15 + 1;
                                i36 = i17;
                                i20 = i16;
                                r16 = 3;
                            } else {
                                if (hashSet2 == null || !hashSet2.contains(l13)) {
                                    z13 = z23;
                                    z14 = false;
                                } else {
                                    z13 = z23;
                                    z14 = true;
                                }
                                dyVar2 = dyVar;
                                dyVar2.q4(i20, longValue2, chat2, z13, z14);
                                i16 = i20;
                                i17 = i36;
                                dialogFilter3 = dialogFilter2;
                                dialogFilter4 = dialogFilter3;
                                dialogFilter = dialogFilter4;
                                i37 = i15 + 1;
                                i36 = i17;
                                i20 = i16;
                                r16 = 3;
                            }
                        }
                    }
                    i16 = i20;
                    i17 = i36;
                    dialogFilter3 = dialogFilter2;
                }
                dialogFilter4 = dialogFilter3;
                dialogFilter = dialogFilter4;
                i37 = i15 + 1;
                i36 = i17;
                i20 = i16;
                r16 = 3;
            }
            int i40 = i20;
            MessagesController.DialogFilter dialogFilter5 = dialogFilter;
            if (i40 == 104 && (size != 1 || dyVar2.K2 != 1)) {
                org.telegram.ui.Components.oc.A(dyVar2, dyVar2.L2 == 0, null).j();
            }
            int i41 = 108;
            if (i40 == 100 || i40 == 108) {
                if (dialogFilter5 != null) {
                    dy dyVar4 = dyVar2;
                    n00.s0(dialogFilter5, dialogFilter5.flags, dialogFilter5.name, dialogFilter5.entities, dialogFilter5.title_noanimate, dialogFilter5.color, dialogFilter5.alwaysShow, dialogFilter5.neverShow, dialogFilter5.pinnedDialogs, false, false, true, true, false, dyVar4, null);
                    dyVar2 = dyVar4;
                    j10 = 0;
                } else {
                    j10 = 0;
                    dyVar2.getMessagesController().reorderPinnedDialogs(dyVar2.R2, null, 0L);
                }
                UndoView Y3 = dyVar2.Y3();
                if (dyVar2.f37688l3 && Y3 != null) {
                    Y3.m(j10, Integer.valueOf(i38), dyVar2.J2 != 0 ? 78 : 79);
                }
                i14 = i9;
                i41 = 108;
            } else {
                i14 = i40;
            }
            dyVar2.b4((i14 == i41 || i14 == 100 || i14 == 102) ? false : true);
            return;
        }
        ArrayList<Long> arrayList4 = new ArrayList<>(arrayList);
        dyVar2.getMessagesController().addDialogToFolder(arrayList4, dyVar2.O2 == 0 ? 1 : 0, -1, null, 0L);
        if (dyVar2.O2 == 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            z12 = false;
            boolean z24 = globalMainSettings.getBoolean("archivehint_l", false) || SharedConfig.archiveHidden;
            if (z24) {
                i10 = 1;
            } else {
                i10 = 1;
                globalMainSettings.edit().putBoolean("archivehint_l", true).commit();
            }
            if (z24) {
                i11 = arrayList4.size() > i10 ? 4 : 2;
            } else {
                i11 = arrayList4.size() > i10 ? 5 : 3;
            }
            UndoView Y32 = dyVar2.Y3();
            if (Y32 != null) {
                Y32.l(0L, i11, null, new org.telegram.ui.Components.p61(13, dyVar2, arrayList4));
            }
        } else {
            z12 = false;
            ArrayList<TLRPC.Dialog> dialogs2 = dyVar2.getMessagesController().getDialogs(dyVar2.R2);
            if (dyVar2.f37629a0 != null && dialogs2.isEmpty() && !dyVar2.G) {
                dyVar2.f37629a0[0].f37350a.setEmptyView(null);
                dyVar2.f37629a0[0].f37358w.setVisibility(4);
                dyVar2.finishFragment();
            }
        }
        dyVar2.b4(z12);
    }

    @Override
    public final void s() {
        x4(true, true);
    }

    public final void s3() {
        if (this.f37629a0 != null) {
            int n32 = n3();
            int i9 = 0;
            while (true) {
                cy[] cyVarArr = this.f37629a0;
                if (i9 < cyVarArr.length) {
                    cy cyVar = cyVarArr[i9];
                    if (cyVar != null) {
                        yx yxVar = cyVar.f37350a;
                        yxVar.setPadding(0, yxVar.U2, 0, n32);
                    }
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    public final void s4(long r14, boolean r16, org.telegram.messenger.MessagesController.DialogFilter r17, int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dy.s4(long, boolean, org.telegram.messenger.MessagesController$DialogFilter, int, boolean):void");
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        vw vwVar = this.A0;
        if (vwVar != null) {
            if (this.C0 && !z10) {
                vwVar.setVisibility(0);
            } else {
                vwVar.setVisibility(8);
            }
        }
        Y4(true);
        U4();
    }

    @Override
    public final void setTitleOverlayText(java.lang.String r6, int r7, java.lang.Runnable r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dy.setTitleOverlayText(java.lang.String, int, java.lang.Runnable):void");
    }

    public final void t3() {
        pg.f fVar = this.f37732u1;
        if (fVar != null) {
            fVar.setBlurredBottomHeight(this.f37732u1.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        }
    }

    public final void t4() {
        if (this.G0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
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
        int i9;
        cy cyVar;
        boolean z10 = true;
        float S3 = S3(true);
        cw cwVar = this.f37735v0;
        if (cwVar != null) {
            if (cwVar.getAlpha() == S3) {
                z10 = false;
            }
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, S3);
            this.f37735v0.setAlpha(S3);
            this.f37735v0.setScaleX(lerp);
            this.f37735v0.setScaleY(lerp);
            cw cwVar2 = this.f37735v0;
            if (S3 > 0.0f) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            cwVar2.setVisibility(i9);
            if (z10 && (cyVar = this.f37629a0[0]) != null) {
                cyVar.f37350a.requestLayout();
            }
        }
        S4();
    }

    public final void u4(cy cyVar) {
        int i9;
        org.telegram.ui.Components.e00 e00Var;
        if (cyVar.getVisibility() != 0) {
            return;
        }
        int i10 = cyVar.d.v;
        if (cyVar.f37357s == 0 && Z3() && cyVar.f37350a.getChildCount() == 0 && cyVar.v == 2) {
            ((f2.m0) cyVar.f37350a.getLayoutManager()).h1(1, (int) this.J);
        }
        cyVar.d.getClass();
        cyVar.d.U();
        int h = cyVar.d.h();
        if (h == 1 && i10 == 1 && cyVar.d.j(0) == 5) {
            cyVar.q(true);
        } else {
            cyVar.q(false);
            if (h > i10 && (i9 = this.N0) != 11 && i9 != 12 && i9 != 13) {
                cyVar.f37360y.b(i10);
            }
        }
        try {
            yx yxVar = cyVar.f37350a;
            if (this.R2 == 0 && this.T2 == 0) {
                e00Var = cyVar.f37358w;
            } else {
                e00Var = null;
            }
            yxVar.setEmptyView(e00Var);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        r3(cyVar);
    }

    public final void v3() {
        int i9;
        int i10;
        float f10 = this.f37694n.f47775e;
        float lerp = AndroidUtilities.lerp(0.2f, 1.0f, f10);
        org.telegram.ui.Components.wo0 wo0Var = this.f37751y1;
        int i11 = 8;
        if (wo0Var != null) {
            wo0Var.setScaleX(lerp);
            this.f37751y1.setScaleY(lerp);
            this.f37751y1.setAlpha(f10);
            org.telegram.ui.Components.wo0 wo0Var2 = this.f37751y1;
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            wo0Var2.setVisibility(i10);
        }
        pg.f fVar = this.f37732u1;
        if (fVar != null) {
            fVar.setAlpha(f10);
            pg.f fVar2 = this.f37732u1;
            int i12 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i12 > 0) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            fVar2.setVisibility(i9);
            this.f37732u1.getFadeView().setAlpha(f10);
            View fadeView = this.f37732u1.getFadeView();
            if (i12 > 0) {
                i11 = 0;
            }
            fadeView.setVisibility(i11);
        }
    }

    public final void v4() {
        boolean z10;
        float f10 = 0.0f;
        if (this.J != 0.0f && !(z10 = this.G)) {
            if (z10) {
                f10 = -U3();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.C3, f10));
            animatorSet.setInterpolator(org.telegram.ui.Components.gr.f28844f);
            animatorSet.setDuration(250L);
            animatorSet.start();
        }
    }

    public final void w3() {
        if (this.actionBar == null) {
            return;
        }
        org.telegram.ui.Components.j10.d(this.actionBar.getBackButton(), Math.max(this.f37708p3, (1.0f - this.f37632b.f47775e) * (1.0f - V3()) * (1.0f - this.f37638c.f47775e)));
    }

    public final void w4(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dy.w4(int):void");
    }

    public final void x3() {
        float f10;
        if (this.f37650e0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.j10.d(this.f37639c0, e2.c.C(f10, 1.0f - this.f37632b.f47775e, 1.0f - V3(), 1.0f - this.f37638c.f47775e));
    }

    public final void x4(boolean z10, boolean z11) {
        int i9;
        int i10;
        yw ywVar = this.B3;
        if (ywVar != null && ywVar.c()) {
            return;
        }
        if (this.f37629a0[0].f37357s == 0 && Z3() && this.f37629a0[0].v == 2) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        if (this.G && !z11 && !this.A0.g()) {
            i10 = -AndroidUtilities.dp(81.0f);
        } else {
            i10 = 0;
        }
        if (z10) {
            c2.y yVar = this.f37629a0[0].f37356r;
            yVar.f2255b = 1;
            yVar.c(i9, i10, false, false);
            v4();
            return;
        }
        this.f37629a0[0].f37352c.h1(i9, i10);
        v4();
    }

    @Override
    public final ng.d y() {
        return this.f37680j4;
    }

    public final void y3() {
        float f10;
        if (SharedConfig.passcodeHash.isEmpty()) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        org.telegram.ui.Components.j10.d(this.f37633b0, e2.c.C(f10, 1.0f - this.f37632b.f47775e, 1.0f - V3(), 1.0f - this.f37638c.f47775e));
    }

    public final void y4(String str, boolean z10) {
        O4(true, false, true, false);
        sx sxVar = this.T;
        if (sxVar != null) {
            sxVar.f30664r.setText(str);
            this.T.f30664r.setSelection(str.length());
        }
    }

    public final void z3() {
        float f10;
        if (this.N0 != 2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.j10.d(this.f37656f0, e2.c.C(f10, this.f37655f.f47775e, 1.0f - V3(), 1.0f - this.f37638c.f47775e));
        vw vwVar = this.A0;
        if (vwVar != null) {
            vwVar.invalidate();
        }
    }

    public final void z4(float f10) {
        cy[] cyVarArr;
        this.Y = f10;
        for (cy cyVar : this.f37629a0) {
            yx yxVar = cyVar.f37350a;
            for (int i9 = 0; i9 < yxVar.getChildCount(); i9++) {
                View childAt = yxVar.getChildAt(i9);
                if (childAt != null && RecyclerView.R(childAt) >= cyVar.d.f19411f + 1) {
                    childAt.setAlpha(f10);
                }
            }
        }
    }
}

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
public class cy extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, ng.b, ne.d, mg0 {
    public static float A4;
    public static boolean f36067x4;
    public static final boolean[] f36068y4 = new boolean[4];
    public static final org.telegram.ui.Components.gs0 f36069z4 = new org.telegram.ui.Components.gs0(3);
    public boolean A0;
    public FrameLayout A1;
    public boolean A2;
    public boolean A3;
    public int B0;
    public mw B1;
    public boolean B2;
    public boolean B3;
    public lx C0;
    public ki.y1 C1;
    public vx C2;
    public Long C3;
    public org.telegram.ui.Components.mv0 D0;
    public org.telegram.ui.ActionBar.u0 D1;
    public ArrayList D2;
    public Drawable D3;
    public boolean E;
    public tw E0;
    public final TextPaint E1;
    public String E2;
    public org.telegram.ui.Components.p5 E3;
    public boolean F;
    public org.telegram.ui.Components.ss F0;
    public lw F1;
    public CharSequence F2;
    public org.telegram.ui.Cells.o F3;
    public TLRPC.RequestPeerType G;
    public boolean G0;
    public FrameLayout G1;
    public org.telegram.ui.Components.kr0 G2;
    public ww G3;
    public long H;
    public float H0;
    public lw H1;
    public lt H2;
    public final kw H3;
    public ValueAnimator I;
    public float I0;
    public FrameLayout I1;
    public final ArrayList I2;
    public final kw I3;
    public ValueAnimator J;
    public float J0;
    public org.telegram.ui.Components.us J1;
    public boolean J2;
    public kg0 J3;
    public boolean K;
    public ai.ic K0;
    public org.telegram.ui.Components.ts K1;
    public int K2;
    public NotificationCenter.ObserversGroup K3;
    public boolean L;
    public org.telegram.ui.Components.i80 L0;
    public org.telegram.ui.Cells.m L1;
    public int L2;
    public Drawable L3;
    public boolean M;
    public yw M0;
    public org.telegram.ui.Cells.z2 M1;
    public boolean M2;
    public int M3;
    public float N;
    public boolean N0;
    public org.telegram.ui.Cells.sa N1;
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
    public ii.i Q1;
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
    public org.telegram.ui.ActionBar.b2 T1;
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
    public org.telegram.ui.Cells.r2 W0;
    public long W1;
    public int W2;
    public boolean W3;
    public rx X;
    public org.telegram.ui.Cells.r2 X0;
    public TLObject X1;
    public cy X2;
    public float X3;
    public zf.h0 Y;
    public boolean Y0;
    public int Y1;
    public long Y2;
    public boolean Y3;
    public i31 Z;
    public boolean Z0;
    public int Z1;
    public TLRPC.Chat Z2;
    public boolean Z3;
    public final int f36070a;
    public org.telegram.ui.Components.d91 f36071a0;
    public final ArrayList f36072a1;
    public boolean a2;
    public TLRPC.ChatFull f36073a3;
    public ValueAnimator f36074a4;
    public final ne.b f36075b;
    public hg.q0 f36076b0;
    public boolean f36077b1;
    public boolean f36078b2;
    public org.telegram.ui.Components.w9 f36079b3;
    public org.telegram.ui.Components.e50 f36080b4;
    public final ne.b f36081c;
    public float f36082c0;
    public boolean f36083c1;
    public boolean f36084c2;
    public org.telegram.ui.Components.h9 f36085c3;
    public TLRPC.FileLocation f36086c4;
    public final ne.b d;
    public ValueAnimator f36087d0;
    public boolean f36088d1;
    public int f36089d2;
    public long f36090d3;
    public TLRPC.FileLocation f36091d4;
    public final ne.b e;
    public ay[] f36092e0;
    public org.telegram.ui.ActionBar.g2 f36093e1;
    public boolean f36094e2;
    public boolean f36095e3;
    public org.telegram.ui.Components.qc f36096e4;
    public final ne.b f36097f;
    public org.telegram.ui.ActionBar.u0 f36098f0;
    public final Paint f36099f1;
    public String f36100f2;
    public boolean f36101f3;
    public int f36102f4;
    public org.telegram.ui.ActionBar.u0 f36103g0;
    public ImageView f36104g1;
    public String f36105g2;
    public AnimatorSet f36106g3;
    public int f36107g4;
    public final ne.b h;
    public ey f36108h0;
    public NumberTextView f36109h1;
    public String f36110h2;
    public boolean f36111h3;
    public int f36112h4;
    public boolean f36113i0;
    public final ArrayList f36114i1;
    public boolean f36115i2;
    public boolean f36116i3;
    public int f36117i4;
    public org.telegram.ui.ActionBar.u0 f36118j0;
    public org.telegram.ui.ActionBar.u0 f36119j1;
    public boolean f36120j2;
    public float f36121j3;
    public int f36122j4;
    public org.telegram.ui.ActionBar.u0 f36123k0;
    public org.telegram.ui.ActionBar.u0 f36124k1;
    public boolean f36125k2;
    public boolean f36126k3;
    public ih.j f36127k4;
    public org.telegram.ui.ActionBar.u0 f36128l0;
    public org.telegram.ui.ActionBar.u0 l1;
    public boolean f36129l2;
    public int f36130l3;
    public final bh.f l4;
    public org.telegram.ui.ActionBar.u0 m0;
    public org.telegram.ui.ActionBar.u0 f36131m1;
    public boolean f36132m2;
    public boolean f36133m3;
    public final gh.d f36134m4;
    public final ne.b f36135n;
    public org.telegram.ui.Components.cj0 f36136n0;
    public org.telegram.ui.ActionBar.e1 f36137n1;
    public String f36138n2;
    public boolean f36139n3;
    public final gh.d f36140n4;
    public org.telegram.ui.ActionBar.e1 f36141o0;
    public org.telegram.ui.ActionBar.e1 f36142o1;
    public String f36143o2;
    public org.telegram.ui.Components.qc f36144o3;
    public final gh.c f36145o4;
    public ei.x3 f36146p0;
    public org.telegram.ui.ActionBar.e1 f36147p1;
    public final MessagesStorage.TopicKey f36148p2;
    public final AnimationNotificationsLocker f36149p3;
    public final bh.b f36150p4;
    public ei.x3 f36151q0;
    public org.telegram.ui.ActionBar.e1 f36152q1;
    public boolean f36153q2;
    public boolean f36154q3;
    public final bh.b f36155q4;
    public final ne.b f36156r;
    public boolean f36157r0;
    public org.telegram.ui.ActionBar.e1 f36158r1;
    public boolean f36159r2;
    public boolean f36160r3;
    public final bh.b f36161r4;
    public final ne.b f36162s;
    public boolean f36163s0;
    public org.telegram.ui.ActionBar.e1 f36164s1;
    public boolean f36165s2;
    public boolean f36166s3;
    public final bh.b f36167s4;
    public org.telegram.ui.Components.h20 f36168t0;
    public org.telegram.ui.ActionBar.e1 f36169t1;
    public boolean f36170t2;
    public boolean f36171t3;
    public tv f36172t4;
    public org.telegram.ui.Components.h20 f36173u0;
    public float f36174u1;
    public boolean f36175u2;
    public float f36176u3;
    public final ArrayList f36177u4;
    public final qh.i v;
    public ei.d f36178v0;
    public float f36179v1;
    public boolean f36180v2;
    public ValueAnimator f36181v3;
    public final RectF f36182v4;
    public boolean f36183w;
    public kh.f f36184w0;
    public AnimatorSet f36185w1;
    public boolean f36186w2;
    public float f36187w3;
    public final RectF f36188w4;
    public int f36189x;
    public int f36190x0;
    public float f36191x1;
    public boolean f36192x2;
    public float f36193x3;
    public boolean f36194y;
    public final UndoView[] f36195y0;
    public ih.f f36196y1;
    public boolean f36197y2;
    public float y3;
    public aw f36198z0;
    public FrameLayout f36199z1;
    public boolean f36200z2;
    public int f36201z3;

    public cy(Bundle bundle) {
        super(bundle);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f36070a = i10;
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        this.f36075b = new ne.b(1, this, bsVar, 350L, false);
        this.f36081c = new ne.b(2, this, bsVar, 350L, false);
        this.d = new ne.b(3, this, bsVar, 350L, false);
        this.e = new ne.b(4, this, bsVar, 350L, false);
        this.f36097f = new ne.b(5, this, bsVar, 350L, false);
        this.h = new ne.b(6, this, bsVar, 350L, false);
        this.f36135n = new ne.b(7, this, bsVar, 350L, false);
        this.f36156r = new ne.b(8, this, bsVar, 350L, false);
        this.f36162s = new ne.b(9, this, bsVar, 350L, false);
        this.v = new qh.i(new sv(this, 2));
        this.f36189x = -1;
        this.F = true;
        this.K = false;
        this.L = false;
        this.M = false;
        this.Q = true;
        this.f36082c0 = 1.0f;
        this.f36195y0 = new UndoView[2];
        this.f36072a1 = new ArrayList();
        this.f36099f1 = new Paint();
        this.f36114i1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.E1 = new TextPaint(1);
        this.U1 = true;
        this.f36084c2 = true;
        this.f36115i2 = true;
        this.f36148p2 = new MessagesStorage.TopicKey();
        this.I2 = new ArrayList();
        this.J2 = true;
        this.f36149p3 = new AnimationNotificationsLocker();
        this.f36201z3 = -1;
        this.H3 = new kw(this, 0);
        this.I3 = new kw(this, 1);
        this.M3 = -4;
        this.N3 = true;
        this.O3 = true;
        this.X3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.f36177u4 = arrayList;
        RectF rectF = new RectF();
        this.f36182v4 = rectF;
        RectF rectF2 = new RectF();
        this.f36188w4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        gh.c cVar = new gh.c();
        this.f36145o4 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.h6.f20990d6));
        if (i11 >= 31) {
            this.l4 = new bh.f(false);
            gh.d dVar = new gh.d(null);
            this.f36134m4 = dVar;
            dVar.k(new hx(this, 0));
            gh.d dVar2 = new gh.d(null);
            this.f36140n4 = dVar2;
            dVar2.k(new hx(this, 3));
            bh.b bVar = new bh.b(dVar);
            this.f36150p4 = bVar;
            bVar.f4360i = LiteMode.isEnabled(262144);
            bh.b bVar2 = new bh.b(dVar2);
            this.f36161r4 = bVar2;
            bVar2.f4360i = LiteMode.isEnabled(262144);
            this.f36155q4 = new bh.b(dVar);
        } else {
            this.l4 = null;
            this.f36134m4 = null;
            this.f36140n4 = null;
            this.f36150p4 = new bh.b(cVar);
            this.f36161r4 = new bh.b(cVar);
            this.f36155q4 = new bh.b(cVar);
        }
        this.f36167s4 = new bh.b(cVar);
    }

    public static void A0(cy cyVar) {
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        cyVar.S4();
        org.telegram.ui.Components.qc J = org.telegram.ui.Components.xc.a0(cyVar).J(R.raw.chats_infotip, LocaleController.getString(R.string.BirthdaySetupLater), LocaleController.getString(R.string.Settings), new cv(cyVar, 1));
        J.f29531j = 5000;
        J.j();
    }

    public static void B0(cy cyVar) {
        boolean z10 = true;
        try {
            ((org.telegram.ui.Components.vj0) ((org.telegram.ui.Components.h9) cyVar.M1.h.getImageReceiver().getStaticThumb()).B).H(true);
        } catch (Exception unused) {
        }
        if (cyVar.f36080b4 == null) {
            org.telegram.ui.Components.e50 e50Var = new org.telegram.ui.Components.e50(0, true, true);
            cyVar.f36080b4 = e50Var;
            e50Var.H = true;
            e50Var.f25720a = cyVar;
            e50Var.f25721b = new px(cyVar);
            cyVar.getMediaDataController().checkFeaturedStickers();
            cyVar.getMessagesController().loadSuggestedFilters();
            cyVar.getMessagesController().loadUserInfo(cyVar.getUserConfig().getCurrentUser(), true, cyVar.classGuid);
        }
        TLRPC.User user = MessagesController.getInstance(cyVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(cyVar.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(cyVar.currentAccount).getCurrentUser();
        }
        if (user != null) {
            org.telegram.ui.Components.ti tiVar = cyVar.f36080b4.f25722c;
            if (tiVar != null) {
                tiVar.e1();
            }
            org.telegram.ui.Components.e50 e50Var2 = cyVar.f36080b4;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z10 = false;
            }
            e50Var2.n(z10, new cv(cyVar, 0), new dv(cyVar, 0), 0);
        }
    }

    public static void C0(cy cyVar, float f7, ValueAnimator valueAnimator) {
        cyVar.f36092e0[0].setTranslationY((1.0f - cyVar.f36176u3) * f7);
        cyVar.f36176u3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i10 = 0; i10 < cyVar.actionBar.getChildCount(); i10++) {
            if (cyVar.actionBar.getChildAt(i10).getVisibility() == 0 && cyVar.actionBar.getChildAt(i10) != cyVar.actionBar.getActionMode() && cyVar.actionBar.getChildAt(i10) != cyVar.actionBar.getBackButton()) {
                cyVar.actionBar.getChildAt(i10).setAlpha(1.0f - cyVar.f36176u3);
            }
        }
        cyVar.C3();
        cyVar.u3();
        View view = cyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void D0(cy cyVar, BirthdayController.BirthdayState birthdayState) {
        if (birthdayState.today.size() == 1) {
            yh.o1 o1Var = new yh.o1(cyVar.getParentActivity(), cyVar.currentAccount, birthdayState.today.get(0).f20423id, null, null);
            o1Var.W(true);
            cyVar.showDialog(o1Var);
            return;
        }
        ug.m1.f0(0, birthdayState);
    }

    public static void E0(cy cyVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(cyVar).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
            M.f29531j = 5000;
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
                alertDialog$Builder.f20605a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f20605a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                cyVar.showDialog(alertDialog$Builder.f20605a);
                return;
            }
            return;
        }
        org.telegram.messenger.g0.q(R.string.UnknownError, org.telegram.ui.Components.xc.a0(cyVar), R.raw.error, 36);
    }

    public static void F0(cy cyVar) {
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        cyVar.S4();
    }

    public static void G0(cy cyVar, int i10) {
        Object obj;
        TLRPC.User user;
        org.telegram.ui.Components.ko0 ko0Var = cyVar.C0.f32191o0;
        if (i10 >= ko0Var.X && i10 < ko0Var.Y) {
            org.telegram.ui.Components.h61 G = ko0Var.G(i10);
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
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20605a;
            b2Var.R = string;
            b2Var.T = LocaleController.formatString(R.string.AppsClearSearchAlert, "\"" + UserObject.getUserName(user) + "\"");
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new xu(1, cyVar, (TLRPC.User) obj));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        }
    }

    public static void K2(cy cyVar, float f7) {
        float f10;
        float f11;
        int i10;
        int i11;
        float clamp = Utilities.clamp(cyVar.f36191x1 * 2.0f, 1.0f, 0.0f);
        tw twVar = cyVar.E0;
        float f12 = (1.0f - cyVar.f36176u3) * f7 * cyVar.H0;
        float f13 = 1.0f - clamp;
        twVar.setAlpha(f12 * f13);
        int i12 = 0;
        if (!cyVar.K && !cyVar.M) {
            if (cyVar.L) {
                cyVar.E0.setTranslationY((Math.max(cyVar.N, -cyVar.S3()) + (-AndroidUtilities.dp(81.0f))) - AndroidUtilities.dp(8.0f));
                cyVar.E0.setProgressToCollapse(1.0f);
                tw twVar2 = cyVar.E0;
                twVar2.setClipTop((int) (AndroidUtilities.statusBarHeight - twVar2.getY()));
            }
            f10 = 1.0f - cyVar.H0;
            cyVar.actionBar.setTranslationY(0.0f);
        } else {
            float clamp2 = Utilities.clamp((-cyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
            if (cyVar.f36176u3 == 1.0f) {
                clamp2 = 1.0f;
            }
            float clamp3 = Utilities.clamp(clamp2 / 0.5f, 1.0f, 0.0f);
            cyVar.E0.setClipTop(0);
            if (!cyVar.K && cyVar.M) {
                cyVar.E0.setTranslationY((-AndroidUtilities.dp(81.0f)) - AndroidUtilities.dp(8.0f));
                cyVar.E0.setProgressToCollapse(1.0f);
                f11 = cyVar.H0;
            } else {
                cyVar.E0.setTranslationY(((cyVar.T / 2.0f) + (Math.max(cyVar.N, -cyVar.S3()) + cyVar.f36187w3)) - AndroidUtilities.dp(8.0f));
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
            float f16 = (1.0f - cyVar.f36176u3) * f14;
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
        float f17 = 1.0f - cyVar.f36176u3;
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

    public static void L2(cy cyVar, Canvas canvas, int i10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        if (cyVar.parentLayout != null && cyVar.actionBar != null) {
            float max = Math.max(cyVar.e.e, cyVar.T3());
            float f7 = 1.0f;
            float f10 = 1.0f - cyVar.f36191x1;
            float f11 = max * f10 * f10;
            int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            if (i11 != 0) {
                if (-1 >= i10) {
                    f7 = 0.0f;
                    i10 = -1;
                }
                if (f7 > 0.0f && i11 > 0 && i10 > 0 && (d5Var = cyVar.parentLayout) != null) {
                    ((ActionBarLayout) d5Var).p(canvas, (int) (f7 * 255.0f * f11), i10);
                }
            }
        }
    }

    public static org.telegram.ui.Cells.r2 O3(ay ayVar) {
        xx xxVar = ayVar.f35443a;
        for (int i10 = 0; i10 < xxVar.getChildCount(); i10++) {
            View childAt = xxVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.r2) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                if (r2Var.P()) {
                    return r2Var;
                }
            }
        }
        return null;
    }

    public static void U(cy cyVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, tL_pendingSuggestion.suggestion);
        cyVar.S4();
    }

    public static void V(cy cyVar, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cyVar.f36176u3 = floatValue;
        cyVar.f36092e0[0].setTranslationY((-f7) * floatValue);
        for (int i10 = 0; i10 < cyVar.actionBar.getChildCount(); i10++) {
            if (cyVar.actionBar.getChildAt(i10).getVisibility() == 0 && cyVar.actionBar.getChildAt(i10) != cyVar.actionBar.getActionMode() && cyVar.actionBar.getChildAt(i10) != cyVar.actionBar.getBackButton()) {
                cyVar.actionBar.getChildAt(i10).setAlpha(1.0f - cyVar.f36176u3);
            }
        }
        View view = cyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        cyVar.C3();
        cyVar.u3();
    }

    public static void W(cy cyVar) {
        ArrayList arrayList = cyVar.I2;
        org.telegram.ui.ActionBar.d5 d5Var = cyVar.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).y()) {
            cyVar.finishPreviewFragment();
        } else if (cyVar.R0 == 10) {
            if (cyVar.C2 != null && !arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i10)).longValue(), 0L));
                }
                cyVar.C2.w(cyVar, arrayList2, null, false, cyVar.J2, cyVar.K2, cyVar.L2, null);
            }
        } else if (MessagesController.getInstance(cyVar.currentAccount).isFrozen()) {
            b.b(cyVar.currentAccount);
        } else {
            cyVar.presentFragment(new ContactsActivity(a1.g.h("destroyAfterSelect", true)));
        }
    }

    public static void X(cy cyVar) {
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
        cyVar.S4();
    }

    public static void Y(cy cyVar) {
        if (cyVar.f36080b4.g()) {
            MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
            cyVar.S4();
        }
    }

    public static void Z(cy cyVar) {
        PasskeysActivity.a0(cyVar.currentAccount, cyVar.getParentActivity(), cyVar.resourceProvider, true);
    }

    public static void a0(cy cyVar, TL_account.TL_birthday tL_birthday) {
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
        cyVar.getConnectionsManager().sendRequest(updatebirthday, new ca(cyVar, userFull, tL_birthday2, 8), 1024);
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        cyVar.S4();
    }

    public static void b0(cy cyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(cyVar.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(cyVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new ca(cyVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void b4(qn qnVar, MessageObject messageObject) {
        CharSequence charSequence;
        if (messageObject != null && messageObject.hasHighlightedWords()) {
            try {
                if (!TextUtils.isEmpty(messageObject.caption)) {
                    charSequence = messageObject.caption;
                } else {
                    charSequence = messageObject.messageText;
                }
                CharSequence highlightText = AndroidUtilities.highlightText(charSequence, messageObject.highlightedWords, (org.telegram.ui.ActionBar.d6) null);
                if (highlightText instanceof SpannableStringBuilder) {
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) highlightText;
                    org.telegram.ui.Components.m10[] m10VarArr = (org.telegram.ui.Components.m10[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.m10.class);
                    if (m10VarArr.length > 0) {
                        int spanStart = spannableStringBuilder.getSpanStart(m10VarArr[0]);
                        int spanEnd = spannableStringBuilder.getSpanEnd(m10VarArr[0]);
                        for (int i10 = 1; i10 < m10VarArr.length; i10++) {
                            int spanStart2 = spannableStringBuilder.getSpanStart(m10VarArr[i10]);
                            int spanStart3 = spannableStringBuilder.getSpanStart(m10VarArr[i10]);
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
                        qnVar.rb(messageObject.getRealId(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void c0(cy cyVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(cyVar.currentAccount).getClientUserId());
        cyVar.presentFragment(new qn(bundle));
    }

    public static void c1(cy cyVar, boolean z10) {
        if (cyVar.f36092e0 != null && cyVar.N3 != z10) {
            cyVar.N3 = z10;
            int i10 = 0;
            while (true) {
                ay[] ayVarArr = cyVar.f36092e0;
                if (i10 < ayVarArr.length) {
                    if (z10) {
                        ayVarArr[i10].f35443a.setScrollbarFadingEnabled(false);
                    }
                    cyVar.f36092e0[i10].f35443a.setVerticalScrollBarEnabled(z10);
                    if (z10) {
                        cyVar.f36092e0[i10].f35443a.setScrollbarFadingEnabled(true);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public static void d0(org.telegram.ui.cy r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.d0(org.telegram.ui.cy):void");
    }

    public static void e0(cy cyVar, String str) {
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, str);
        cyVar.S4();
    }

    public static void f0(cy cyVar, ay ayVar, View view, int i10) {
        int i11;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        if (view instanceof org.telegram.ui.Cells.u3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.r2;
        if (z10) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            if (r2Var.f22870n2) {
                cyVar.L4(r2Var.getDialogId(), view);
                return;
            }
        }
        if (cyVar.G3()) {
            cyVar.m4(view, i10, 0.0f, ayVar.d);
            return;
        }
        int i12 = cyVar.R0;
        if (i12 == 15 && (view instanceof org.telegram.ui.Cells.q8)) {
            ayVar.d.K();
            return;
        }
        int i13 = 0;
        if ((i12 == 11 || i12 == 13) && i10 == 1) {
            Bundle h = a1.g.h("forImport", true);
            h.putLongArray("result", new long[]{cyVar.getUserConfig().getClientUserId()});
            h.putInt("chatType", 4);
            String string = cyVar.arguments.getString("importTitle");
            if (string != null) {
                h.putString("title", string);
            }
            s60 s60Var = new s60(h);
            s60Var.Y = new gw(cyVar);
            cyVar.presentFragment(s60Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.z2) && ((i11 = ayVar.f35449s) == 7 || i11 == 8)) {
            hg.k kVar = (hg.k) ayVar.d.M.get(0);
            if (kVar != null && kVar.f44296a == 17) {
                tL_chatlists_chatlistUpdates = kVar.f11955i;
            } else {
                tL_chatlists_chatlistUpdates = null;
            }
            if (tL_chatlists_chatlistUpdates != null) {
                MessagesController.DialogFilter dialogFilter = cyVar.getMessagesController().selectedDialogFilter[ayVar.f35449s - 7];
                if (dialogFilter != null) {
                    int i14 = dialogFilter.f17799id;
                    ?? bbVar = new org.telegram.ui.Components.bb(cyVar, false);
                    bbVar.Y = -1;
                    bbVar.f27697c0 = "";
                    bbVar.f27698d0 = new ArrayList();
                    bbVar.f27700f0 = "";
                    bbVar.f27702h0 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    bbVar.f27703i0 = arrayList;
                    bbVar.f27719z0 = -1;
                    bbVar.C0 = -5;
                    bbVar.Y = i14;
                    bbVar.f27695a0 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    bbVar.f27701g0 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList<MessagesController.DialogFilter> arrayList2 = cyVar.getMessagesController().dialogFilters;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                break;
                            } else if (arrayList2.get(i13).f17799id == i14) {
                                bbVar.f27697c0 = arrayList2.get(i13).name;
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
        } else if (z10 && !cyVar.actionBar.t() && !cyVar.G3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.r2) view).Y1;
            AndroidUtilities.rectTmp.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        }
        cyVar.l4(view, i10, ayVar.d);
    }

    public static void g0(cy cyVar) {
        cyVar.presentFragment(new PrivacySettingsActivity());
        AndroidUtilities.scrollToFragmentRow(cyVar.parentLayout, "newChatsRow");
    }

    public static void g4(AccountInstance accountInstance) {
        int currentAccount = accountInstance.getCurrentAccount();
        boolean[] zArr = f36068y4;
        if (!zArr[currentAccount]) {
            MessagesController messagesController = accountInstance.getMessagesController();
            messagesController.loadGlobalNotificationsSettings();
            messagesController.loadDialogs(0, 0, 100, true);
            messagesController.loadHintDialogs();
            messagesController.loadUserInfo(accountInstance.getUserConfig().getCurrentUser(), false, 0);
            accountInstance.getContactsController().checkInviteText();
            accountInstance.getMediaDataController().checkAllMedia(false);
            AndroidUtilities.runOnUIThread(new ti(accountInstance, 19), 200L);
            Iterator<String> it = messagesController.diceEmojies.iterator();
            while (it.hasNext()) {
                accountInstance.getMediaDataController().loadStickersByEmojiOrName(it.next(), true, true);
            }
            zArr[currentAccount] = true;
        }
    }

    public static void i0(cy cyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
            LaunchActivity.G0(launchActivity, cyVar.currentAccount, tL_attachMenuBot, null, true);
        } else {
            zh1.a(cyVar.getParentActivity(), new z(cyVar, tL_attachMenuBot, launchActivity, 8), null);
        }
    }

    public static void k0(cy cyVar) {
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "PREMIUM_GRACE");
        cyVar.S4();
    }

    public static void l0(cy cyVar) {
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
        cyVar.S4();
    }

    public static void m0(cy cyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ai.v3 v3Var;
        try {
            b2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject != null) {
            cyVar.arguments.getString("importTitle");
            String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
            ai.v3 v3Var2 = new ai.v3(cyVar, j10, 27);
            Pattern pattern = org.telegram.ui.Components.f5.f26077a;
            if (cyVar.getParentActivity() != null) {
                if (chat != null || user != null) {
                    int currentAccount = cyVar.getCurrentAccount();
                    Activity parentActivity = cyVar.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
                    TextView textView = new TextView(parentActivity);
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21096j5, false));
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
                    org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
                    h9Var.u(AndroidUtilities.dp(12.0f));
                    org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(parentActivity);
                    w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                    if (LocaleController.isRTL) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    frameLayout.addView(w9Var, w7.z5.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(parentActivity);
                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.E8, false));
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
                    float f7 = i14;
                    if (z10) {
                        i15 = 76;
                    } else {
                        i15 = 21;
                    }
                    frameLayout.addView(textView2, w7.z5.d(-1, -2.0f, i17, f7, 11.0f, i15, 0.0f));
                    if (!LocaleController.isRTL) {
                        i16 = 3;
                    }
                    frameLayout.addView(textView, w7.z5.d(-2, -2.0f, i16 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                    if (user != null) {
                        if (UserObject.isReplyUser(user)) {
                            h9Var.f26822p = 0.8f;
                            h9Var.g(12);
                            w9Var.h(null, null, h9Var, user);
                            v3Var = v3Var2;
                        } else {
                            v3Var = v3Var2;
                            if (user.f20423id == clientUserId) {
                                h9Var.f26822p = 0.8f;
                                h9Var.g(1);
                                w9Var.h(null, null, h9Var, user);
                            } else {
                                h9Var.f26822p = 1.0f;
                                h9Var.m(currentAccount, user);
                                w9Var.e(user, h9Var);
                            }
                        }
                    } else {
                        v3Var = v3Var2;
                        h9Var.k(currentAccount, chat);
                        w9Var.e(chat, h9Var);
                    }
                    textView.setText(AndroidUtilities.replaceTags(str));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Import), new org.telegram.ui.Components.s(v3Var, 3));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    cyVar.showDialog(alertDialog$Builder.f20605a);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.f5.e0(cyVar.currentAccount, tL_error, cyVar, tL_messages_checkHistoryImportPeer, new Object[0]);
        cyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j10), tL_messages_checkHistoryImportPeer, tL_error);
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
            cyVar.p4(arrayList, i10, false, false, hashSet2);
            cyVar.getMessagesController().setDialogsInTransaction(false);
            cyVar.getMessagesController().checkIfFolderEmpty(cyVar.W2);
            int i11 = cyVar.W2;
            if (i11 != 0 && cyVar.P3(cyVar.currentAccount, cyVar.f36092e0[0].f35449s, i11, false).size() == 0) {
                cyVar.f36092e0[0].f35443a.setEmptyView(null);
                cyVar.f36092e0[0].f35450w.setVisibility(4);
                cyVar.finishFragment();
                return;
            }
            return;
        }
        cyVar.p4(arrayList, i10, false, false, null);
    }

    public static void n1(cy cyVar, ay ayVar, float f7) {
        if (cyVar.T != f7) {
            cyVar.T = f7;
            int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            int i11 = 0;
            if (i10 == 0) {
                cyVar.U = false;
            }
            cyVar.E0.setOverscroll(f7);
            ayVar.f35443a.setViewsOffset(f7);
            xx xxVar = ayVar.f35443a;
            if (i10 != 0) {
                i11 = 2;
            }
            xxVar.setOverScrollMode(i11);
            cyVar.fragmentView.invalidate();
            if (f7 > AndroidUtilities.dp(90.0f) && !cyVar.U) {
                tw twVar = cyVar.E0;
                ValueAnimator valueAnimator = twVar.H0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    twVar.i(twVar.f5885p0, true);
                    cyVar.U = true;
                    cyVar.getOrCreateStoryViewer().s(new cv(cyVar, 19));
                }
            }
        }
    }

    public static boolean o1(cy cyVar, ay ayVar) {
        if (!cyVar.G3.c()) {
            int i10 = (int) (-cyVar.N);
            int R3 = cyVar.R3();
            int S3 = cyVar.S3();
            if (i10 != 0 && i10 != R3 && i10 != S3 && ayVar.f35443a.canScrollVertically(-1)) {
                if (S3 < i10 && i10 < R3) {
                    int dp = AndroidUtilities.dp(48.0f);
                    int i11 = i10 - S3;
                    if (i11 < dp / 2) {
                        ayVar.f35444b.z(-i11);
                        return true;
                    }
                    ayVar.f35444b.z(dp - i11);
                    return true;
                }
                float f7 = 1.0f;
                if (cyVar.f36176u3 != 1.0f) {
                    f7 = Utilities.clamp((-cyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
                }
                if (f7 < cyVar.E0.B0) {
                    ayVar.f35444b.z(-i10);
                    return true;
                }
                ayVar.f35444b.z(S3 - i10);
                return true;
            }
            return false;
        }
        return false;
    }

    public static void p0(cy cyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(launchActivity, cyVar.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(cyVar.currentAccount).updateAttachMenuBotsInCache();
    }

    public static String p2(cy cyVar) {
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

    public static void q0(cy cyVar) {
        String str;
        MessagesController messagesController = MessagesController.getInstance(cyVar.currentAccount);
        if (cyVar.B3) {
            str = "PREMIUM_UPGRADE";
        } else {
            str = "PREMIUM_ANNUAL";
        }
        messagesController.removeSuggestion(0L, str);
        cyVar.S4();
    }

    public static void r0(cy cyVar) {
        b.c(cyVar.getParentActivity(), cyVar.currentAccount, cyVar.getResourceProvider());
    }

    public static void s0(final int i10, final long j10, TLRPC.Chat chat, final cy cyVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        int i14;
        cyVar.Z3(false);
        if (i10 == 103 && ChatObject.isChannel(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || ChatObject.isPublic(chat2)) {
                cyVar.getMessagesController().deleteDialog(j10, 2, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i10 == 102 && (i14 = cyVar.W2) != 0 && cyVar.P3(cyVar.currentAccount, cyVar.f36092e0[0].f35449s, i14, false).size() == 1) {
            cyVar.f36092e0[0].f35450w.setVisibility(4);
        }
        cyVar.f36201z3 = 3;
        int i15 = -1;
        if (i10 == 102) {
            cyVar.y4(true, true);
            if (cyVar.R1 != null) {
                i13 = 0;
                while (i13 < cyVar.R1.size()) {
                    if (((TLRPC.Dialog) cyVar.R1.get(i13)).f20280id == j10) {
                        break;
                    }
                    i13++;
                }
            }
            i13 = -1;
            cyVar.m3();
            i11 = i13;
        } else {
            i11 = -1;
        }
        UndoView W3 = cyVar.W3();
        if (W3 != null) {
            if (i10 == 103) {
                i12 = 0;
            } else if (z11) {
                i12 = 1;
            } else {
                i12 = 95;
            }
            W3.j(i12, j10, new Runnable() {
                @Override
                public final void run() {
                    cyVar.o4(i10, j10, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(cyVar.P3(cyVar.currentAccount, cyVar.f36092e0[0].f35449s, cyVar.W2, false));
        int i16 = 0;
        while (true) {
            if (i16 >= arrayList2.size()) {
                break;
            } else if (((TLRPC.Dialog) arrayList2.get(i16)).f20280id == j10) {
                i15 = i16;
                break;
            } else {
                i16++;
            }
        }
        if (i10 == 102) {
            if (i11 >= 0 && i15 < 0 && (arrayList = cyVar.R1) != null) {
                arrayList.remove(i11);
                cyVar.f36092e0[0].f35451x.D();
                cyVar.f36092e0[0].q(true);
                return;
            }
            cyVar.y4(false, true);
        }
    }

    public static void t0(cy cyVar) {
        BirthdayController.getInstance(cyVar.currentAccount).hide();
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_CONTACTS_TODAY");
        cyVar.S4();
        org.telegram.ui.Components.qc G = org.telegram.ui.Components.xc.a0(cyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f29531j = 5000;
        G.j();
    }

    public static void u0(cy cyVar) {
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "PREMIUM_RESTORE");
        cyVar.S4();
    }

    public static void v0(cy cyVar, int i10, org.telegram.ui.Components.i80 i80Var) {
        CharSequence charSequence;
        if (cyVar.currentAccount != i10) {
            i80Var.u();
            if (cyVar.getParentActivity() == null) {
                return;
            }
            vx vxVar = cyVar.C2;
            LaunchActivity launchActivity = (LaunchActivity) cyVar.getParentActivity();
            ArrayList arrayList = cyVar.D2;
            String str = cyVar.E2;
            CharSequence charSequence2 = cyVar.F2;
            mw mwVar = cyVar.B1;
            if (mwVar != null) {
                charSequence = mwVar.getFieldText();
            } else {
                charSequence = null;
            }
            launchActivity.O0(i10);
            cy cyVar2 = new cy(cyVar.arguments);
            cyVar2.C2 = vxVar;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList.isEmpty()) {
                    cyVar2.D2 = null;
                } else {
                    cyVar2.D2 = arrayList;
                    cyVar2.E2 = null;
                    cyVar2.M2 = false;
                    if (cyVar2.B1 != null) {
                        cyVar2.i3(charSequence);
                    } else {
                        cyVar2.V3 = charSequence;
                    }
                }
            } else if (str != null) {
                cyVar2.C4(charSequence, str);
            } else if (charSequence2 != null) {
                if (charSequence2.length() == 0) {
                    cyVar2.F2 = null;
                } else {
                    cyVar2.F2 = charSequence2;
                    cyVar2.E2 = null;
                    cyVar2.D2 = null;
                    if (cyVar2.B1 != null) {
                        cyVar2.i3(charSequence);
                    } else {
                        cyVar2.V3 = charSequence;
                    }
                }
            }
            launchActivity.u0(cyVar2, false, true);
        }
    }

    public static void w0(cy cyVar) {
        if (!cyVar.O3) {
            ei.x3 x3Var = cyVar.f36151q0;
            if (x3Var != null) {
                if (x3Var.V) {
                    return;
                }
                AndroidUtilities.removeFromParent(x3Var);
            }
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.h6.Gi, 0, new sv(cyVar, 8));
            ei.x3 x3Var2 = new ei.x3(cyVar.getParentActivity(), 2);
            x3Var2.q(8.0f);
            x3Var2.d = 8000L;
            x3Var2.i(true);
            x3Var2.p(true);
            x3Var2.h = AndroidUtilities.displaySize.x - AndroidUtilities.dp(148.0f);
            x3Var2.s(replaceSingleTag);
            x3Var2.l(1.0f, -40.0f);
            x3Var2.h(cyVar.getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
            cyVar.f36151q0 = x3Var2;
            x3Var2.setTranslationY((-cyVar.f36107g4) - cyVar.f36117i4);
            ((ViewGroup) cyVar.fragmentView).addView(cyVar.f36151q0, w7.z5.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
            cyVar.f36151q0.u();
            return;
        }
        ei.x3 x3Var3 = cyVar.f36146p0;
        if (x3Var3 != null) {
            x3Var3.e(true);
        }
        ci.c7 o10 = MessagesController.getInstance(cyVar.currentAccount).getStoriesController().o();
        if (o10 != null && o10.a(cyVar.currentAccount, 1)) {
            cyVar.showDialog(new sg.k0(o10.b(), cyVar.currentAccount, cyVar.getParentActivity(), cyVar, null));
            return;
        }
        ei.vb D = ei.vb.D(cyVar.getParentActivity(), cyVar.currentAccount);
        D.f10021x = new hx(cyVar, 4);
        D.Q(null);
    }

    public static void x0(cy cyVar) {
        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(cyVar.getParentActivity(), cyVar.resourceProvider);
        ybVar.d(R.raw.email_check_inbox, new String[0]);
        ybVar.f32625b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
        org.telegram.ui.Components.qc.g(cyVar, ybVar, 2750).j();
        try {
            cyVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void y0(cy cyVar) {
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "PREMIUM_CHRISTMAS");
        cyVar.S4();
        org.telegram.ui.Components.qc G = org.telegram.ui.Components.xc.a0(cyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f29531j = 5000;
        G.j();
    }

    public final void A3() {
        u3();
        org.telegram.ui.Components.h20.d(this.f36123k0, (1.0f - this.f36075b.e) * (1.0f - T3()) * (1.0f - this.f36081c.e));
        v3();
        y3();
        w3();
        x3();
    }

    public final void A4(float f7) {
        ay[] ayVarArr = this.f36092e0;
        int i10 = 0;
        if (ayVarArr != null) {
            int paddingTop = ayVarArr[0].f35443a.getPaddingTop() + ((int) f7);
            int i11 = 0;
            while (true) {
                ay[] ayVarArr2 = this.f36092e0;
                if (i11 >= ayVarArr2.length) {
                    break;
                }
                ayVarArr2[i11].f35443a.setTopGlowOffset(paddingTop);
                i11++;
            }
        }
        if (this.fragmentView != null && f7 != this.N) {
            this.N = f7;
            org.telegram.ui.Components.qc qcVar = this.f36144o3;
            if (qcVar != null) {
                qcVar.l();
            }
            if (this.F3 != null) {
                float currentActionBarHeight = 1.0f - ((-f7) / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                org.telegram.ui.Cells.o oVar = this.F3;
                float f10 = (int) f7;
                float f11 = oVar.f22672f;
                oVar.h = f10;
                oVar.setTranslationY(f11 + f10);
                this.F3.setAlpha(w7.r.a(currentActionBarHeight, 0.0f, 1.0f));
                org.telegram.ui.Cells.o oVar2 = this.F3;
                if (currentActionBarHeight <= 0.0f) {
                    i10 = 4;
                }
                oVar2.setVisibility(i10);
            }
            C3();
            this.fragmentView.invalidate();
        }
    }

    @Override
    public final List B() {
        return Arrays.asList(new ng.a(LocaleController.getString(R.string.DebugDialogsActivity)), new ng.a(LocaleController.getString(R.string.ClearLocalDatabase), new cv(this, 28)), new ng.a(LocaleController.getString(R.string.DebugClearSendMessageAsPeers), new cv(this, 29)));
    }

    public final void B3() {
        int i10;
        if (T3() > 0.5f) {
            i10 = R.string.SearchTopics;
        } else {
            i10 = R.string.SearchChats;
        }
        String string = LocaleController.getString(i10);
        this.X.f27726r.setContentDescription(string);
        this.X.f27726r.setHint(string);
    }

    public final void B4(float f7) {
        int i10;
        int i11;
        this.f36191x1 = f7;
        if (this.f36166s3 && this.actionBar != null) {
            if (this.W2 == 0 && this.Y2 == 0) {
                i10 = org.telegram.ui.ActionBar.h6.f21325v8;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.O8;
            }
            int themedColor = getThemedColor(i10);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i12 = org.telegram.ui.ActionBar.h6.f21380y8;
            kVar.C(i0.a.f(this.f36191x1, themedColor, getThemedColor(i12)), false);
            this.actionBar.C(i0.a.f(this.f36191x1, getThemedColor(i12), getThemedColor(i12)), true);
            if (this.W2 == 0 && this.Y2 == 0) {
                i11 = org.telegram.ui.ActionBar.h6.f21288t8;
            } else {
                i11 = org.telegram.ui.ActionBar.h6.N8;
            }
            int themedColor2 = getThemedColor(i11);
            this.actionBar.B(i0.a.f(this.f36191x1, themedColor2, getThemedColor(org.telegram.ui.ActionBar.h6.f21397z8)), false);
        }
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            LiteMode.isEnabled(32768);
        }
        Q4();
    }

    public final void C3() {
        float f7;
        int i10;
        if (this.X == null) {
            return;
        }
        float a2 = 1.0f - w7.r.a(((-this.N) - S3()) / AndroidUtilities.dp(48.0f), 0.0f, 1.0f);
        float max = Math.max(this.f36176u3, this.h.e);
        float f10 = this.f36075b.e;
        if (this.R0 != 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float max2 = f7 * (1.0f - this.f36081c.e) * (1.0f - max) * Math.max(f10, (1.0f - T3()) * a2);
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
        this.f36097f.a(z10, true);
    }

    public final void C4(CharSequence charSequence, String str) {
        if (str != null && !str.isEmpty()) {
            this.E2 = str;
            this.F2 = null;
            this.D2 = null;
            if (this.B1 != null) {
                i3(charSequence);
                return;
            } else {
                this.V3 = charSequence;
                return;
            }
        }
        this.E2 = null;
        this.F2 = null;
    }

    public final void D3() {
        int i10;
        float f7;
        int i11;
        int i12 = 8;
        if (this.Z != null) {
            if (this.f36071a0 != null) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float f10 = f7 * this.f36075b.e;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, f10);
            this.Z.setScaleX(lerp);
            this.Z.setScaleY(lerp);
            this.Z.setAlpha(f10);
            i31 i31Var = this.Z;
            if (f10 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            i31Var.setVisibility(i11);
        }
        org.telegram.ui.Components.d91 d91Var = this.f36071a0;
        ne.b bVar = this.f36162s;
        if (d91Var != null) {
            float f11 = 1.0f - bVar.e;
            d91Var.setAlpha(f11);
            org.telegram.ui.Components.d91 d91Var2 = this.f36071a0;
            if (f11 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            d91Var2.setVisibility(i10);
        }
        hg.q0 q0Var = this.f36076b0;
        if (q0Var != null) {
            float f12 = bVar.e;
            q0Var.setAlpha(f12);
            hg.q0 q0Var2 = this.f36076b0;
            if (f12 > 0.0f) {
                i12 = 0;
            }
            q0Var2.setVisibility(i12);
        }
    }

    public final void D4(float f7) {
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
                tw twVar = this.E0;
                if (twVar != null) {
                    twVar.setTranslationX(f10);
                }
                rx rxVar = this.X;
                if (rxVar != null) {
                    rxVar.setTranslationX(f10);
                }
                ww wwVar = this.G3;
                if (wwVar != null && wwVar.getFragmentView() != null && !this.f36194y) {
                    this.G3.getFragmentView().setTranslationX(f10);
                    return;
                }
                return;
            }
            float f11 = 1.0f - this.X3;
            float f12 = (-AndroidUtilities.dp(4.0f)) * f11;
            float f13 = 1.0f - (f11 * 0.05f);
            tw twVar2 = this.E0;
            if (twVar2 != null) {
                twVar2.setScaleX(f13);
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
            ww wwVar2 = this.G3;
            if (wwVar2 != null && wwVar2.getFragmentView() != null) {
                if (!this.f36194y) {
                    this.G3.getFragmentView().setScaleX(f13);
                    this.G3.getFragmentView().setScaleY(f13);
                    this.G3.getFragmentView().setTranslationX(f12);
                }
                this.G3.getFragmentView().setPivotX(0.0f);
                this.G3.getFragmentView().setPivotY(0.0f);
            }
        }
    }

    public final void E3(boolean z10) {
        int i10;
        int i11;
        if (this.C0 != null && this.actionBar != null) {
            int i12 = AndroidUtilities.navigationBarHeight;
            int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f36070a);
            if (this.f36071a0 != null) {
                i10 = AndroidUtilities.dp(50.0f);
            } else {
                i10 = 0;
            }
            int i13 = measuredHeight + i10;
            org.telegram.ui.Components.us usVar = this.J1;
            if (usVar != null) {
                i11 = (int) usVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i14 = i13 + i11;
            lx lxVar = this.C0;
            SparseArray sparseArray = lxVar.h;
            lxVar.U0 = i14;
            lxVar.V0 = i12;
            ai.u1 u1Var = lxVar.V;
            if (z10) {
                u1Var.o1(0, i14, 0, i12);
            } else {
                u1Var.setPadding(0, i14, 0, i12);
            }
            lxVar.M0.j(lxVar.U0, lxVar.V0, z10);
            org.telegram.ui.Components.jo0 jo0Var = lxVar.W;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) jo0Var.getLayoutParams();
            int i15 = marginLayoutParams.topMargin;
            int i16 = lxVar.U0;
            if (i15 != i16 || marginLayoutParams.bottomMargin != lxVar.V0) {
                marginLayoutParams.topMargin = i16;
                marginLayoutParams.bottomMargin = lxVar.V0;
                jo0Var.requestLayout();
            }
            org.telegram.ui.Components.wo0.P(lxVar.f32183f0, lxVar.f32186i0, lxVar.U0, lxVar.V0, z10);
            org.telegram.ui.Components.wo0.P(lxVar.f32188k0, lxVar.f32190n0, lxVar.U0, lxVar.V0, z10);
            org.telegram.ui.Components.wo0.P(lxVar.f32194r0, lxVar.f32197u0, lxVar.U0, lxVar.V0, z10);
            org.telegram.ui.Components.uh0 uh0Var = lxVar.f32192p0;
            int i17 = lxVar.U0;
            int i18 = lxVar.V0;
            uh0Var.setClipToPadding(false);
            uh0Var.J = z10;
            uh0Var.setPadding(0, i17, 0, i18);
            org.telegram.ui.Components.c71 c71Var = uh0Var.f30936c;
            if (z10) {
                c71Var.o1(0, i17, 0, i18);
            } else {
                c71Var.setPadding(0, i17, 0, i18);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) c71Var.getLayoutParams();
            marginLayoutParams2.topMargin = -i17;
            marginLayoutParams2.bottomMargin = -i18;
            uh0Var.J = false;
            org.telegram.ui.Components.un0 un0Var = lxVar.G0;
            if (un0Var != null) {
                un0Var.b(lxVar.U0, lxVar.V0, z10);
            }
            int size = sparseArray.size();
            for (int i19 = 0; i19 < size; i19++) {
                View view = (View) sparseArray.valueAt(i19);
                if (view instanceof e10) {
                    ((e10) view).j(lxVar.U0, lxVar.V0, z10);
                }
            }
            for (int i20 = 0; i20 < lxVar.getChildCount(); i20++) {
                if (lxVar.getChildAt(i20) instanceof e10) {
                    ((e10) lxVar.getChildAt(i20)).j(lxVar.U0, lxVar.V0, z10);
                }
            }
        }
    }

    public final void E4() {
        getContactsController().loadGlobalPrivacySetting();
        org.telegram.ui.Components.w6 w6Var = new org.telegram.ui.Components.w6(getParentActivity(), this.currentAccount, getResourceProvider(), new lt(4, this, r0), new ti(r0, 18));
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(getParentActivity(), getResourceProvider());
        a3Var.c(w6Var);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.f20613a;
        f3Var.show();
        org.telegram.ui.ActionBar.f3[] f3VarArr = {f3Var};
        f3Var.fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.h6.f21061h5));
    }

    public final void F3() {
        if (this.J1 != null) {
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, 1.0f);
            this.J1.setAlpha(1.0f);
            this.J1.setScaleX(lerp);
            this.J1.setScaleY(lerp);
            this.J1.setVisibility(0);
        }
    }

    public final boolean F4(org.telegram.ui.Cells.r2 r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.F4(org.telegram.ui.Cells.r2):boolean");
    }

    public boolean G3() {
        if (this.R0 == 10) {
            return true;
        }
        return false;
    }

    public final void G4(boolean z10) {
        float f7;
        this.f36081c.a(z10, true);
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
        org.telegram.ui.ActionBar.u0 u0Var = this.m0;
        Property property = View.ALPHA;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(u0Var, property, f7));
        this.P3.playTogether(arrayList);
        this.P3.addListener(new cx(this, z10, 1));
        this.P3.start();
    }

    @Override
    public final void H(float f7, int i10) {
        org.telegram.ui.ActionBar.u0 u0Var;
        if (i10 == 3 && (u0Var = this.f36128l0) != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) u0Var.getIconView().getDrawable();
            if (this.d.f17384f) {
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

    public final void H3() {
        if (AndroidUtilities.isTablet()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.h(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                lx lxVar = this.C0;
                if (lxVar != null) {
                    lxVar.f32179b0.R(this.W1, tLObject);
                }
                this.X1 = null;
                return;
            }
            return;
        }
        this.V1 = true;
    }

    public final void H4() {
        if (!this.A0 && getMessagesController().dialogFiltersLoaded && getMessagesController().showFiltersTooltip && this.f36198z0 != null && getMessagesController().getDialogFilters().isEmpty() && !this.isPaused && getUserConfig().filtersLoaded && !this.inPreviewMode) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("filterhint", false)) {
                globalMainSettings.edit().putBoolean("filterhint", true).apply();
                AndroidUtilities.runOnUIThread(new sv(this, 10), 1000L);
            }
        }
    }

    public final void I3() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.f21497n0) {
            kVar.h(true);
            this.f36154q3 = false;
            T4(true, true);
        }
    }

    public final void I4() {
        LaunchActivity launchActivity;
        boolean q6;
        int i10;
        int i11;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        LaunchActivity launchActivity2;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        float f7;
        CharSequence charSequence;
        lt ltVar;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.e1 e1Var;
        int i12;
        int i13;
        int w02;
        int w03;
        int w04;
        int m12;
        CharSequence charSequence2;
        int i14;
        int w05;
        org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(this, this.f36123k0);
        int i15 = org.telegram.ui.ActionBar.h6.A8;
        H.S(getThemedColor(i15), getThemedColor(i15));
        H.f27185s = 8;
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
                H.c(R.drawable.msg_customize, LocaleController.getString(R.string.CommunityMenuSettings), new cv(this, 4), false);
                H.k();
            }
            H.i(new cv(this, 7), LocaleController.getString(R.string.CommunityMenuShowAsOneChat), this.Z2.collapsed_in_dialogs);
            H.i(new cv(this, 8), LocaleController.getString(R.string.CommunityMenuShowAsSeparateChats), !this.Z2.collapsed_in_dialogs);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        } else if (c4()) {
            H.c(R.drawable.msg_customize, LocaleController.getString(R.string.ArchiveSettings), new cv(this, 9), false);
            H.c(R.drawable.msg_help, LocaleController.getString(R.string.HowDoesItWork), new cv(this, 10), false);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        } else {
            org.telegram.ui.ActionBar.d6 d6Var2 = this.resourceProvider;
            if (d6Var2 != null) {
                q6 = d6Var2.a();
            } else {
                q6 = org.telegram.ui.ActionBar.h6.I.q();
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
            H.c(i10, LocaleController.getString(i11), new cv(this, 11), false);
            H.k();
            H.c(R.drawable.outline_groups_24, LocaleController.getString(R.string.NewGroup), new cv(this, 12), false);
            H.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.SavedMessages), new cv(this, 13), false);
            ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
            if (applicationLoader != null) {
                applicationLoader.addItemOptions(H);
            }
            if (getMessagesController().config.walletAvailable.get()) {
                H.c(R.drawable.ic_gram, LocaleController.getString(R.string.WalletAttachMoney), new cv(this, 14), false);
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
                            fv fvVar = new fv(this, tL_attachMenuBot2, launchActivity, 0);
                            lt ltVar2 = new lt(3, this, tL_attachMenuBot2);
                            org.telegram.ui.ActionBar.d6 d6Var3 = H.d;
                            if (H.e != null) {
                                int i18 = org.telegram.ui.ActionBar.h6.F8;
                                int i19 = org.telegram.ui.ActionBar.h6.E8;
                                f7 = f10;
                                org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(0, H.e, H.d, false, false);
                                e1Var2.setPadding(AndroidUtilities.dp(18.0f), i16, AndroidUtilities.dp(18.0f), i16);
                                if (tL_attachMenuBot2.side_menu_disclaimer_needed) {
                                    charSequence = org.telegram.ui.Cells.q8.a(tL_attachMenuBot2.short_name);
                                } else {
                                    charSequence = tL_attachMenuBot2.short_name;
                                }
                                TLRPC.TL_attachMenuBotIcon sideAttachMenuBotIcon = MediaDataController.getSideAttachMenuBotIcon(tL_attachMenuBot2);
                                if (sideAttachMenuBotIcon != null) {
                                    launchActivity2 = launchActivity;
                                    arrayList2 = arrayList3;
                                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(sideAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.h6.f20972c7, 1.0f);
                                    if (svgThumb != null) {
                                        Integer num = H.f27172k0;
                                        if (num != null) {
                                            w05 = num.intValue();
                                        } else {
                                            w05 = org.telegram.ui.ActionBar.h6.w0(i18, d6Var3);
                                        }
                                        charSequence2 = charSequence;
                                        svgThumb.setColorFilter(new PorterDuffColorFilter(w05, PorterDuff.Mode.SRC_IN));
                                    } else {
                                        charSequence2 = charSequence;
                                    }
                                    ltVar = ltVar2;
                                    e1Var = e1Var2;
                                    i13 = i19;
                                    i12 = i18;
                                    d6Var = d6Var3;
                                    e1Var.h(charSequence2, ImageLocation.getForDocument(sideAttachMenuBotIcon.icon), "24_24", svgThumb, tL_attachMenuBot2);
                                    org.telegram.ui.Components.w9 w9Var = e1Var.h;
                                    if (w9Var != null) {
                                        if (LocaleController.isRTL) {
                                            i14 = 5;
                                        } else {
                                            i14 = 3;
                                        }
                                        w9Var.setLayoutParams(w7.z5.e(24, 24, i14 | 16));
                                    }
                                } else {
                                    launchActivity2 = launchActivity;
                                    arrayList2 = arrayList3;
                                    ltVar = ltVar2;
                                    d6Var = d6Var3;
                                    CharSequence charSequence3 = charSequence;
                                    e1Var = e1Var2;
                                    i12 = i18;
                                    i13 = i19;
                                    e1Var.g(charSequence3, R.drawable.msg_bot, null);
                                }
                                Integer num2 = H.f27170j0;
                                if (num2 != null) {
                                    w02 = num2.intValue();
                                } else {
                                    w02 = org.telegram.ui.ActionBar.h6.w0(i13, d6Var);
                                }
                                Integer num3 = H.f27172k0;
                                if (num3 != null) {
                                    w03 = num3.intValue();
                                } else {
                                    w03 = org.telegram.ui.ActionBar.h6.w0(i12, d6Var);
                                }
                                e1Var.c(w02, w03);
                                Integer num4 = H.f27172k0;
                                if (num4 != null) {
                                    w04 = num4.intValue();
                                } else {
                                    w04 = org.telegram.ui.ActionBar.h6.w0(i12, d6Var);
                                }
                                e1Var.setIconColorImage(w04);
                                Integer num5 = H.f27174l0;
                                if (num5 != null) {
                                    m12 = num5.intValue();
                                } else {
                                    m12 = org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
                                }
                                e1Var.setSelectorColor(m12);
                                e1Var.setOnClickListener(new org.telegram.ui.Components.ca(18, H, fvVar));
                                e1Var.setOnLongClickListener(new ci.m2(3, H, ltVar));
                                int i20 = H.S;
                                if (i20 > 0) {
                                    e1Var.setMinimumWidth(AndroidUtilities.dp(i20));
                                    H.r(e1Var, w7.z5.n(H.S, -2));
                                } else {
                                    H.r(e1Var, w7.z5.n(-1, -2));
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
                H.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), new cv(this, 6), false);
            }
            org.telegram.ui.ActionBar.e1 e1Var3 = this.f36141o0;
            if (e1Var3 != null) {
                e1Var3.f20762b.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20943ai));
                this.f36141o0.setOnClickListener(new org.telegram.ui.Components.i51(10, this, H));
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", "");
                if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty())) {
                    H.k();
                    H.d(this.f36141o0);
                }
            }
            H.Z();
            H.X(-AndroidUtilities.dp(f11));
        }
    }

    public final void J3(String str) {
        if (this.actionBar.a(str)) {
            return;
        }
        org.telegram.ui.ActionBar.y j10 = this.actionBar.j(str);
        boolean z10 = this.W;
        ArrayList arrayList = this.f36114i1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.f36104g1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f36104g1.setImageDrawable(new org.telegram.ui.ActionBar.g2(true));
            this.f36104g1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f21380y8), PorterDuff.Mode.MULTIPLY));
            this.f36104g1.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f21397z8), 1, -1));
            this.f36104g1.setOnClickListener(new gv(this, 6));
            j10.addView(this.f36104g1, w7.z5.q(54, 54, 16));
            arrayList.add(this.f36104g1);
        }
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.f36109h1 = numberTextView;
        int i10 = 18;
        numberTextView.setTextSize(18);
        this.f36109h1.setTypeface(AndroidUtilities.bold());
        this.f36109h1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21380y8));
        NumberTextView numberTextView2 = this.f36109h1;
        if (!this.W) {
            i10 = 72;
        }
        j10.addView(numberTextView2, w7.z5.m(1.0f, 0, -1, i10, 0, 0));
        this.f36109h1.setOnTouchListener(new di.d(2));
        this.f36124k1 = j10.g(100, R.drawable.msg_pin, AndroidUtilities.dp(48.0f));
        this.l1 = j10.g(104, R.drawable.msg_mute, AndroidUtilities.dp(48.0f));
        this.f36131m1 = j10.g(107, R.drawable.msg_archive, AndroidUtilities.dp(48.0f));
        this.f36119j1 = j10.h(102, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(48.0f));
        org.telegram.ui.ActionBar.u0 h = j10.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(48.0f));
        j10.addView(new View(getParentActivity()), w7.z5.n(5, -1));
        this.f36152q1 = h.e(105, R.drawable.msg_archive, LocaleController.getString(R.string.Archive));
        this.f36137n1 = h.e(108, R.drawable.msg_pin, LocaleController.getString(R.string.DialogPin));
        this.f36142o1 = h.e(109, R.drawable.msg_addfolder, LocaleController.getString(R.string.FilterAddTo));
        this.f36147p1 = h.e(110, R.drawable.msg_removefolder, LocaleController.getString(R.string.FilterRemoveFrom));
        this.f36164s1 = h.e(101, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
        this.f36158r1 = h.e(103, R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory));
        this.f36169t1 = h.e(106, R.drawable.msg_block, LocaleController.getString(R.string.BlockUser));
        this.l1.setOnLongClickListener(new ov(this, 1));
        arrayList.add(this.f36124k1);
        arrayList.add(this.f36131m1);
        arrayList.add(this.l1);
        arrayList.add(this.f36119j1);
        arrayList.add(h);
        R4(false);
    }

    public final void J4() {
        if (this.S3 == null) {
            for (String str : getMessagesController().pendingSuggestions) {
                if ("AUTOARCHIVE_POPULAR".equals(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.f20605a.R = LocaleController.getString(R.string.HideNewChatsAlertTitle);
                    alertDialog$Builder.f20605a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.HideNewChatsAlertText));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.GoToSettings), new hv(this, 6));
                    showDialog(alertDialog$Builder.f20605a, new dv(this, 1));
                    this.S3 = str;
                    return;
                }
            }
        }
    }

    public final void K3() {
        int i10;
        lx lxVar = this.C0;
        if ((lxVar != null && lxVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        if (this.f36138n2 != null) {
            i10 = 2;
        } else if (!this.f36129l2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        lx lxVar2 = new lx(this, getParentActivity(), this, i10, this.R0, this.W2, this.Y2, new hx(this, 1));
        this.C0 = lxVar2;
        ((ux) this.fragmentView).addView(lxVar2, this.B0);
        lx lxVar3 = this.C0;
        lxVar3.f32179b0.U = new nx(this);
        lxVar3.f32186i0.setOnItemClickListener(new hv(this, 1));
        this.C0.f32190n0.setOnItemClickListener(new hv(this, 2));
        this.C0.f32197u0.setOnItemClickListener(new lv(this, 0));
        this.C0.f32190n0.setOnItemLongClickListener(new hv(this, 3));
        this.C0.V.setOnItemClickListener(new hv(this, 4));
        this.C0.V.setOnItemLongClickListener(new hx(this, 2));
        this.C0.setFilteredSearchViewDelegate(new hv(this, 5));
        this.C0.setAlpha(0.0f);
        this.C0.setScaleX(1.05f);
        this.C0.setScaleY(1.05f);
        this.C0.setVisibility(8);
        this.C0.setBlurredBackgroundDrawableFactory(this.f36155q4);
    }

    public final void K4(long j10, View view) {
        ArrayList<TLRPC.Dialog> P3;
        int i10;
        f3(j10, view);
        boolean t10 = this.actionBar.t();
        ArrayList arrayList = this.I2;
        boolean z10 = true;
        if (t10) {
            if (arrayList.isEmpty()) {
                Z3(true);
                return;
            }
        } else {
            if (this.f36154q3) {
                J3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.e5)) {
                    i2.e.y(false, this.actionBar);
                }
            } else {
                J3(null);
            }
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20990d6));
            this.actionBar.O(null, null);
            int i11 = this.f36092e0[0].f35449s;
            if ((i11 != 7 && i11 != 8) || (this.actionBar.t() && !this.actionBar.u(null))) {
                P3 = getMessagesController().getDialogs(this.W2);
            } else {
                P3 = P3(this.currentAccount, this.f36092e0[0].f35449s, this.W2, this.S1);
            }
            int size = P3.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.Dialog dialog = P3.get(i13);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (e4(dialog)) {
                        i12++;
                    } else if (!getMessagesController().isPromoDialog(dialog.f20280id, false)) {
                        break;
                    }
                }
            }
            if (i12 > 1) {
                if (this.f36092e0 != null) {
                    int i14 = 0;
                    while (true) {
                        ay[] ayVarArr = this.f36092e0;
                        if (i14 >= ayVarArr.length) {
                            break;
                        }
                        ayVarArr[i14].d.H = true;
                        i14++;
                    }
                }
                e5(MessagesController.UPDATE_MASK_REORDER, true);
            }
            if (!this.f36154q3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f36114i1;
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
            ValueAnimator valueAnimator = this.f36181v3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f36181v3 = ValueAnimator.ofFloat(this.f36176u3, 1.0f);
            int i16 = 0;
            while (true) {
                ay[] ayVarArr2 = this.f36092e0;
                if (i16 >= ayVarArr2.length) {
                    break;
                }
                ay ayVar = ayVarArr2[i16];
                if (ayVar != null) {
                    ayVar.f35443a.I0(true);
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
            this.f36181v3.addUpdateListener(new jv(this, max, 0));
            this.f36181v3.addListener(new fx(this, max, 1));
            this.f36181v3.setInterpolator(org.telegram.ui.Components.bs.f25021f);
            this.f36181v3.setDuration(200L);
            this.f36181v3.start();
            aw awVar = this.f36198z0;
            if (awVar != null) {
                awVar.b(org.telegram.ui.ActionBar.h6.Gh, org.telegram.ui.ActionBar.h6.Fh, org.telegram.ui.ActionBar.h6.Eh, org.telegram.ui.ActionBar.h6.Hh, org.telegram.ui.ActionBar.h6.f21344w8);
            }
            org.telegram.ui.ActionBar.g2 g2Var = this.f36093e1;
            if (g2Var != null) {
                g2Var.c(1.0f, true);
            }
            z10 = false;
        }
        R4(false);
        this.f36109h1.a(arrayList.size(), z10);
    }

    public final void L3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.f36195y0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                undoViewArr[i10] = new gx(this, parentActivity);
                FrameLayout.LayoutParams d = w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.f36107g4 + this.f36117i4 + d.bottomMargin;
                UndoView undoView = undoViewArr[i10];
                int i11 = this.f36190x0 + 1;
                this.f36190x0 = i11;
                ((ux) this.fragmentView).addView(undoView, i11, d);
            }
        }
    }

    public final void L4(long j10, View view) {
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
            J = org.telegram.ui.Components.xc.a0(this).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
        } else {
            J = org.telegram.ui.Components.xc.a0(this).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new cv(this, 23));
        }
        J.j();
    }

    public final void M3(final long j10, final long j11, boolean z10, final re1 re1Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String string;
        String formatStringSimple;
        String string2;
        String str;
        String str2;
        TLRPC.TL_forumTopic findTopic;
        if (n3(j10)) {
            int i10 = this.R0;
            if (i10 != 11 && i10 != 12 && i10 != 13) {
                if (z10 && ((this.f36100f2 != null && this.f36105g2 != null) || this.f36110h2 != null)) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        if (DialogObject.isEncryptedDialog(j10)) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(org.telegram.messenger.g0.l(getMessagesController(), j10).user_id));
                            if (user2 != null) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f36100f2, UserObject.getUserName(user2));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                return;
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            if (j10 == getUserConfig().getClientUserId()) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f36105g2, LocaleController.getString(R.string.SavedMessages));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j10));
                                if (user3 != null && this.f36100f2 != null) {
                                    str = LocaleController.getString(R.string.SendMessageTitle);
                                    str2 = LocaleController.formatStringSimple(this.f36100f2, UserObject.getUserName(user3));
                                    string2 = LocaleController.getString(R.string.Send);
                                } else {
                                    return;
                                }
                            }
                        } else {
                            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-j10));
                            if (chat2 != null) {
                                String str3 = chat2.title;
                                if (j11 != 0 && (findTopic = getMessagesController().getTopicsController().findTopic(chat2.f20276id, j11)) != null) {
                                    str3 = ((Object) str3) + " " + findTopic.title;
                                }
                                if (this.f36110h2 != null) {
                                    string = LocaleController.getString(R.string.AddToTheGroupAlertTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f36110h2, str3);
                                    string2 = LocaleController.getString(R.string.Add);
                                } else {
                                    string = LocaleController.getString(R.string.SendMessageTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f36105g2, str3);
                                    string2 = LocaleController.getString(R.string.Send);
                                }
                                String str4 = formatStringSimple;
                                str = string;
                                str2 = str4;
                            } else {
                                return;
                            }
                        }
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20605a;
                        b2Var.R = str;
                        b2Var.T = AndroidUtilities.replaceTags(str2);
                        alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.a2() {
                            @Override
                            public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i11) {
                                cy.this.M3(j10, j11, false, re1Var);
                            }
                        });
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        if (showDialog(b2Var) == null) {
                            b2Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 15) {
                    Runnable i0Var = new a3.i0(this, j10, new a3.h0(this, j10, j11, re1Var, 14), 26);
                    if (j10 < 0) {
                        O4(getMessagesController().getChat(Long.valueOf(-j10)), i0Var, null);
                        return;
                    }
                    TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(j10));
                    TLRPC.User user5 = getMessagesController().getUser(Long.valueOf(this.H));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, UserObject.getFirstName(user4), UserObject.getFirstName(user5));
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20605a;
                    b2Var2.R = formatString;
                    b2Var2.T = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, UserObject.getFirstName(user4), UserObject.getFirstName(user5))));
                    alertDialog$Builder2.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new ut(i0Var, 1));
                    alertDialog$Builder2.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new org.telegram.ui.Components.ug0(21));
                    showDialog(b2Var2);
                    return;
                } else if (this.C2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j10, j11));
                    if (this.C2.w(this, arrayList, null, false, this.J2, this.K2, this.L2, re1Var) && this.f36115i2) {
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
                    UndoView W3 = W3();
                    if (W3 != null) {
                        W3.j(45, j10, null);
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
                    UndoView W32 = W3();
                    if (W32 != null) {
                        W32.j(46, j10, null);
                        return;
                    }
                    return;
                }
            }
            org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
            TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
            tL_messages_checkHistoryImportPeer.peer = getMessagesController().getInputPeer(j10);
            getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new ai.l4(this, b2Var3, user, chat, j10, tL_messages_checkHistoryImportPeer));
            try {
                b2Var3.r(300L);
            } catch (Exception unused) {
            }
        }
    }

    public final void M4(boolean r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.M4(boolean, boolean, boolean, boolean):void");
    }

    public final void N3(long j10, boolean z10) {
        if (this.f36092e0 != null) {
            int i10 = 0;
            while (true) {
                ay[] ayVarArr = this.f36092e0;
                if (i10 < ayVarArr.length) {
                    int childCount = ayVarArr[i10].f35443a.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 < childCount) {
                            View childAt = this.f36092e0[i10].f35443a.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.r2) {
                                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                                if (r2Var.getDialogId() == j10) {
                                    r2Var.V(z10, true);
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

    public final void N4() {
        int i10;
        int i11;
        Long l4;
        if (this.M0 == null && !SharedConfig.appLocked && (!this.K || this.E0.g())) {
            o51[] o51VarArr = new o51[1];
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            org.telegram.ui.ActionBar.j5 titleTextView = this.actionBar.getTitleTextView();
            if (titleTextView != null && titleTextView.getRightDrawable() != null) {
                this.E3.f();
                Drawable drawable = this.E3.f29211f[0];
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
            xw xwVar = new xw(this, this, getParentActivity(), Integer.valueOf(i10), getResourceProvider(), o51VarArr);
            if (currentUser != null && DialogObject.getEmojiStatusUntil(currentUser.emoji_status) > 0) {
                xwVar.setExpireDateHint(DialogObject.getEmojiStatusUntil(currentUser.emoji_status));
            }
            Long l10 = this.C3;
            if (l10 != null) {
                xwVar.setSelected(l10);
            } else {
                Drawable drawable2 = this.E3.f29211f[0];
                if (drawable2 instanceof org.telegram.ui.Components.r5) {
                    l4 = Long.valueOf(((org.telegram.ui.Components.r5) drawable2).i());
                } else {
                    l4 = null;
                }
                xwVar.setSelected(l4);
            }
            xwVar.setSaveState(1);
            xwVar.y(this.E3, titleTextView);
            yw ywVar = new yw(this, xwVar);
            this.M0 = ywVar;
            o51VarArr[0] = ywVar;
            ywVar.showAsDropDown(this.actionBar, AndroidUtilities.dp(16.0f), i11, 48);
            o51VarArr[0].b();
        }
    }

    public final void O4(org.telegram.tgnet.TLRPC.Chat r14, java.lang.Runnable r15, java.lang.Runnable r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.O4(org.telegram.tgnet.TLRPC$Chat, java.lang.Runnable, java.lang.Runnable):void");
    }

    public final java.util.ArrayList P3(int r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.P3(int, int, int, boolean):java.util.ArrayList");
    }

    public final void P4(boolean z10) {
        ay[] ayVarArr;
        char c10;
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ayVarArr = this.f36092e0;
            if (i12 >= ayVarArr.length) {
                break;
            }
            ayVarArr[i12].f35443a.B0();
            i12++;
        }
        if (z10 && ayVarArr.length > 1) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        int i13 = ayVarArr[c10].h;
        if (i13 >= 0 && i13 < getMessagesController().getDialogFilters().size()) {
            MessagesController.DialogFilter dialogFilter = getMessagesController().getDialogFilters().get(this.f36092e0[c10].h);
            if (dialogFilter.isDefault()) {
                ay ayVar = this.f36092e0[c10];
                ayVar.f35449s = this.R0;
                xx xxVar = ayVar.f35443a;
                int i14 = xx.f43289t3;
                xxVar.B1();
            } else {
                ay[] ayVarArr2 = this.f36092e0;
                if (ayVarArr2[c10 ^ 1].f35449s == 7) {
                    ayVarArr2[c10].f35449s = 8;
                } else {
                    ayVarArr2[c10].f35449s = 7;
                }
                ayVarArr2[c10].f35443a.setScrollEnabled(true);
                MessagesController messagesController = getMessagesController();
                if (this.f36092e0[c10].f35449s == 8) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                messagesController.selectDialogFilter(dialogFilter, i10);
            }
            ay[] ayVarArr3 = this.f36092e0;
            if (ayVarArr3.length > 1) {
                ayVarArr3[1].E = dialogFilter.locked;
            }
            ay ayVar2 = ayVarArr3[c10];
            jw jwVar = ayVar2.d;
            jwVar.h = ayVar2.f35449s;
            jwVar.l();
            ay ayVar3 = this.f36092e0[c10];
            fw fwVar = ayVar3.f35445c;
            if (ayVar3.f35449s == 0 && X3() && this.f36092e0[c10].v == 2) {
                i11 = 1;
            }
            fwVar.h1(i11, (int) this.N);
            p3(this.f36092e0[c10]);
        }
    }

    public final float Q3(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f - this.f36075b.e;
        } else {
            f7 = 1.0f;
        }
        return f7 * (1.0f - T3()) * this.f36156r.e;
    }

    public final void Q4() {
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
        i31 i31Var = this.Z;
        if (i31Var != null && i31Var.getVisibility() != 8) {
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
            float f20 = this.f36191x1;
            f11 = (f7 * f20) + com.google.android.gms.internal.play_billing.k3.y(1.0f, f20, f10, f19);
            f12 = this.f36193x3;
        } else {
            f11 = (f7 * this.f36191x1) + this.N;
            f12 = this.f36193x3;
        }
        float f21 = f11 + f12 + this.T;
        rx rxVar = this.X;
        if (rxVar != null && rxVar.getVisibility() == 0) {
            f13 = this.X.getAlpha();
        } else {
            f13 = 0.0f;
        }
        float dp = AndroidUtilities.dp(4.0f) * f13;
        aw awVar = this.f36198z0;
        if (awVar != null) {
            awVar.setTranslationY(f21 - dp);
            f15 = this.f36198z0.getAlpha();
            f16 = AndroidUtilities.dp(43.0f) * f15;
            f14 = f21 + f16;
        } else {
            f14 = f21;
            f15 = 0.0f;
            f16 = 0.0f;
        }
        org.telegram.ui.Components.us usVar = this.J1;
        if (usVar != null) {
            float f22 = f14 - dp;
            int i11 = -AndroidUtilities.dp(3.0f);
            if (this.f36071a0 == null) {
                i10 = AndroidUtilities.dp(44.0f);
            } else {
                i10 = 0;
            }
            usVar.setTranslationY(AndroidUtilities.lerp(f22, i11 - i10, this.f36075b.e));
            f17 = this.J1.getMetadata().f17399c.f17407a;
            f18 = this.J1.c(0.0f);
        } else {
            f17 = 0.0f;
            f18 = 0.0f;
        }
        org.telegram.ui.Components.ts tsVar = this.K1;
        if (tsVar != null) {
            tsVar.setTranslationY(f21 - dp);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f), Math.min(f17, f15));
            org.telegram.ui.Components.ts tsVar2 = this.K1;
            float min = Math.min(AndroidUtilities.dp(40.0f), (f18 + f16) - lerp);
            Matrix matrix = tsVar2.f30664b;
            if (tsVar2.e != lerp || tsVar2.f30666f != min) {
                tsVar2.e = lerp;
                tsVar2.f30666f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, lerp);
                LinearGradient linearGradient = tsVar2.f30665c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                tsVar2.invalidate();
            }
            this.K1.setAlpha(Math.max(f15, f17));
        }
    }

    public final int R3() {
        if (this.K) {
            return AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(81.0f);
        }
        return AndroidUtilities.dp(48.0f);
    }

    public final void R4(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.R4(boolean):void");
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        ww wwVar;
        ai.ic icVar;
        aw awVar;
        boolean z11;
        boolean z12;
        if (!this.f36154q3 && (((wwVar = this.G3) == null || !wwVar.c()) && (((icVar = this.K0) == null || icVar.getVisibility() != 0) && ((awVar = this.f36198z0) == null || !awVar.f30081n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                aw awVar2 = this.f36198z0;
                if (awVar2 != null && awVar2.getTabsCount() >= 2 && this.f36198z0.getCurrentTabId() != this.f36198z0.getFirstTabId()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                aw awVar3 = this.f36198z0;
                if (awVar3 != null && awVar3.getTabsCount() >= 2 && this.f36198z0.getCurrentTabId() != this.f36198z0.getLastTabId()) {
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

    public final int S3() {
        if (this.K) {
            return AndroidUtilities.dp(81.0f);
        }
        return 0;
    }

    public final void S4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.S4():void");
    }

    public final float T3() {
        ww wwVar = this.G3;
        if (wwVar != null && wwVar.c()) {
            return this.G3.e;
        }
        return 0.0f;
    }

    public final void T4(boolean z10, boolean z11) {
        ?? r52;
        int L0;
        boolean z12;
        ay[] ayVarArr;
        MessagesController.DialogFilter dialogFilter;
        boolean z13;
        Object[] objArr;
        s4.l0 l0Var;
        boolean z14;
        boolean z15;
        boolean z16;
        if (this.f36198z0 != null && !this.inPreviewMode && !this.f36154q3) {
            ww wwVar = this.G3;
            if (wwVar == null || !wwVar.c()) {
                org.telegram.ui.Components.i80 i80Var = this.L0;
                if (i80Var != null) {
                    i80Var.u();
                    this.L0 = null;
                }
                ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
                int size = dialogFilters.size();
                ne.b bVar = this.f36156r;
                boolean z17 = true;
                boolean z18 = false;
                if (size > 1) {
                    if (!z10 && this.f36198z0.getVisibility() == 0) {
                        r52 = 0;
                    } else {
                        if (this.f36198z0.getVisibility() != 0) {
                            z13 = false;
                        } else {
                            z13 = z11;
                        }
                        this.f36183w = true;
                        boolean isEmpty = this.f36198z0.h.isEmpty();
                        if (this.fragmentView != null) {
                            if (!this.isPaused && this.R3 == null) {
                                z16 = z11;
                            } else {
                                z16 = false;
                            }
                            if (!this.f36154q3) {
                                bVar.a(this.f36183w, z16);
                            }
                        }
                        int currentTabId = this.f36198z0.getCurrentTabId();
                        int currentTabStableId = this.f36198z0.getCurrentTabStableId();
                        if (currentTabId != this.f36198z0.getDefaultTabId() && currentTabId >= dialogFilters.size()) {
                            this.f36198z0.L = -1;
                            objArr = 1;
                        } else {
                            objArr = null;
                        }
                        aw awVar = this.f36198z0;
                        awVar.h.clear();
                        awVar.f30078j0.clear();
                        awVar.f30080l0.clear();
                        awVar.m0.clear();
                        awVar.f30082n0.clear();
                        awVar.f30083o0.clear();
                        awVar.M = 0;
                        int size2 = dialogFilters.size();
                        int i10 = 0;
                        while (i10 < size2) {
                            if (dialogFilters.get(i10).isDefault()) {
                                this.f36198z0.a(i10, 0, LocaleController.getString(R.string.FilterAllChats), null, false, true, dialogFilters.get(i10).locked);
                                z15 = z18;
                            } else {
                                MessagesController.DialogFilter dialogFilter2 = dialogFilters.get(i10);
                                z15 = z18;
                                this.f36198z0.a(i10, dialogFilter2.localId, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, false, dialogFilters.get(i10).locked);
                            }
                            i10++;
                            z18 = z15;
                        }
                        boolean z19 = z18;
                        if (currentTabStableId >= 0) {
                            if (objArr != null && !this.f36198z0.h(currentTabStableId)) {
                                while (currentTabId >= 0) {
                                    aw awVar2 = this.f36198z0;
                                    if (awVar2.h(awVar2.f30079k0.get(currentTabId, -1))) {
                                        break;
                                    }
                                    currentTabId--;
                                }
                                if (currentTabId < 0) {
                                    currentTabId = z19 ? 1 : 0;
                                }
                            }
                            if (this.f36198z0.f30079k0.get(this.f36092e0[z19 ? 1 : 0].h, -1) != currentTabStableId) {
                                this.f36092e0[z19 ? 1 : 0].h = currentTabId;
                                isEmpty = true;
                            }
                        }
                        int i11 = z19 ? 1 : 0;
                        while (true) {
                            ay[] ayVarArr2 = this.f36092e0;
                            if (i11 >= ayVarArr2.length) {
                                break;
                            }
                            if (ayVarArr2[i11].h >= dialogFilters.size()) {
                                this.f36092e0[i11].h = dialogFilters.size() - 1;
                            }
                            this.f36092e0[i11].f35443a.setScrollingTouchSlop(1);
                            i11++;
                        }
                        aw awVar3 = this.f36198z0;
                        ai.u1 u1Var = awVar3.F;
                        if (z13) {
                            l0Var = awVar3.f30089s0;
                        } else {
                            l0Var = null;
                        }
                        u1Var.setItemAnimator(l0Var);
                        awVar3.I.l();
                        if (isEmpty) {
                            P4(z19);
                        }
                        aw awVar4 = this.f36198z0;
                        int currentTabId2 = awVar4.getCurrentTabId();
                        ArrayList arrayList = awVar4.h;
                        int i12 = 0;
                        while (true) {
                            if (i12 < arrayList.size()) {
                                if (((org.telegram.ui.Components.p00) arrayList.get(i12)).f29176a == currentTabId2) {
                                    z14 = ((org.telegram.ui.Components.p00) arrayList.get(i12)).f29179f;
                                    break;
                                }
                                i12++;
                            } else {
                                z14 = false;
                                break;
                            }
                        }
                        if (z14) {
                            aw awVar5 = this.f36198z0;
                            ArrayList arrayList2 = awVar5.h;
                            if (!arrayList2.isEmpty()) {
                                r52 = 0;
                                awVar5.f((org.telegram.ui.Components.p00) arrayList2.get(0), 0);
                            }
                        }
                        r52 = 0;
                    }
                } else {
                    r52 = 0;
                    if (this.f36198z0.getVisibility() != 8) {
                        this.f36198z0.setIsEditing(false);
                        G4(false);
                        this.f36139n3 = false;
                        if (this.f36133m3) {
                            this.f36133m3 = false;
                            this.f36092e0[0].setTranslationX(0.0f);
                            this.f36092e0[1].setTranslationX(ayVarArr[0].getMeasuredWidth());
                        }
                        if (this.f36092e0[0].h != this.f36198z0.getDefaultTabId()) {
                            this.f36092e0[0].h = this.f36198z0.getDefaultTabId();
                            jw jwVar = this.f36092e0[0].d;
                            jwVar.h = 0;
                            jwVar.l();
                            ay ayVar = this.f36092e0[0];
                            ayVar.f35449s = this.R0;
                            ayVar.d.l();
                        }
                        this.f36092e0[1].setVisibility(8);
                        ay ayVar2 = this.f36092e0[1];
                        ayVar2.h = 0;
                        jw jwVar2 = ayVar2.d;
                        jwVar2.h = 0;
                        jwVar2.l();
                        ay ayVar3 = this.f36092e0[1];
                        ayVar3.f35449s = this.R0;
                        ayVar3.d.l();
                        this.f36183w = false;
                        if (this.fragmentView != null) {
                            if (!this.isPaused && this.R3 == null) {
                                z12 = z11;
                            } else {
                                z12 = false;
                            }
                            if (!this.f36154q3) {
                                bVar.a(false, z12);
                            }
                        }
                        int i13 = 0;
                        while (true) {
                            ay[] ayVarArr3 = this.f36092e0;
                            if (i13 >= ayVarArr3.length) {
                                break;
                            }
                            ay ayVar4 = ayVarArr3[i13];
                            if (ayVar4.f35449s == 0 && ayVar4.v == 2 && X3() && ((L0 = this.f36092e0[i13].f35445c.L0()) == 0 || L0 == 1)) {
                                this.f36092e0[i13].f35445c.h1(1, (int) this.N);
                            }
                            this.f36092e0[i13].f35443a.setScrollingTouchSlop(0);
                            this.f36092e0[i13].f35443a.requestLayout();
                            this.f36092e0[i13].requestLayout();
                            i13++;
                        }
                        this.f36198z0.L = -1;
                        r52 = 0;
                    }
                }
                R4(r52);
                int i14 = this.f36092e0[r52].f35449s;
                if ((i14 == 7 || i14 == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[i14 - 7]) != null) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < dialogFilters.size()) {
                            MessagesController.DialogFilter dialogFilter3 = dialogFilters.get(i15);
                            if (dialogFilter3 != null && dialogFilter3.f17799id == dialogFilter.f17799id) {
                                break;
                            }
                            i15++;
                        } else {
                            z17 = false;
                            break;
                        }
                    }
                    if (!z17) {
                        P4(false);
                    }
                }
            }
        }
    }

    public final float U3() {
        return -AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(48.0f), this.f36075b.e);
    }

    public final void U4(boolean r11, java.util.ArrayList r12, java.util.ArrayList r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.U4(boolean, java.util.ArrayList, java.util.ArrayList, boolean, boolean):void");
    }

    public final ci.i7 V3() {
        return getMessagesController().getStoriesController();
    }

    public final void V4() {
        float f7 = (((-this.f36107g4) - this.f36122j4) - this.f36174u1) - this.f36179v1;
        org.telegram.ui.Components.h20 h20Var = this.f36168t0;
        if (h20Var != null) {
            h20Var.setTranslationY(f7);
        }
        org.telegram.ui.Components.h20 h20Var2 = this.f36173u0;
        if (h20Var2 != null) {
            h20Var2.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            ei.x3 x3Var = this.f36146p0;
            if (x3Var != null) {
                x3Var.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            }
        }
    }

    public final UndoView W3() {
        L3();
        UndoView[] undoViewArr = this.f36195y0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.e(2, true);
            ux uxVar = (ux) this.fragmentView;
            uxVar.removeView(undoViewArr[0]);
            uxVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void W4(boolean z10) {
        boolean z11;
        boolean z12 = this.f36129l2;
        if ((!z12 || this.R0 == 10) && this.W2 == 0 && this.Y2 == 0 && !this.inPreviewMode && ((!this.f36120j2 || z12) && !this.U3)) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.h20 h20Var = this.f36168t0;
        if (h20Var != null) {
            h20Var.e(z11, z10);
        }
        org.telegram.ui.Components.h20 h20Var2 = this.f36173u0;
        if (h20Var2 != null) {
            h20Var2.e(z11, z10);
        }
    }

    public final boolean X3() {
        if (!this.f36129l2 && this.R0 == 0 && this.Y2 == 0 && this.W2 == 0 && getMessagesController().hasHiddenArchive()) {
            return true;
        }
        return false;
    }

    public final void X4(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        if (this.f36136n0 != null) {
            org.telegram.ui.ActionBar.u0 u0Var = this.m0;
            if (u0Var == null || u0Var.getVisibility() != 0) {
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
                if (!getDownloadController().hasUnviewedDownloads() && !z12 && (this.f36103g0.getVisibility() != 0 || this.f36103g0.getAlpha() != 1.0f || z11)) {
                    this.f36113i0 = false;
                } else {
                    this.f36113i0 = true;
                }
                v3();
                boolean z14 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i12 = this.f36089d2;
                if (i12 == 3 || i12 == 5) {
                    z13 = true;
                }
                org.telegram.ui.ActionBar.e1 e1Var = this.f36141o0;
                if (z14) {
                    if (z13) {
                        i10 = R.string.MenuProxyConnected;
                    } else {
                        i10 = R.string.MenuProxyConnecting;
                    }
                } else {
                    i10 = R.string.MenuProxyDisabled;
                }
                e1Var.setSubtext(LocaleController.getString(i10));
                this.f36136n0.b(z14, z13, z10);
            }
        }
    }

    public final boolean Y3() {
        ArrayList arrayList = this.D2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void Y4() {
        org.telegram.ui.Components.kr0 kr0Var;
        int i10;
        mw mwVar = this.B1;
        ArrayList arrayList = this.I2;
        if (mwVar != null) {
            this.f36135n.a(!arrayList.isEmpty(), true);
            Z4();
            if (arrayList.isEmpty()) {
                if (this.R0 == 3 && this.f36100f2 == null) {
                    i10 = R.string.ForwardTo;
                } else {
                    i10 = R.string.SelectChat;
                }
                String string = LocaleController.getString(i10);
                if (this.Q3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(string);
                } else {
                    this.actionBar.J(string, true, 350L, org.telegram.ui.Components.bs.h);
                }
                if (this.B1.getTag() != null) {
                    this.B1.l0(false, false, false);
                    this.B1.N();
                    this.B1.setTag(null);
                    this.fragmentView.requestLayout();
                }
            } else {
                if (this.B1.getTag() == null) {
                    if (!Y3() && this.E2 == null) {
                        this.B1.setFieldText("");
                    }
                    this.B1.setTag(1);
                    if (!this.W3 && (kr0Var = this.G2) != null) {
                        this.W3 = true;
                        String string2 = LocaleController.getString(R.string.ShareTapToEditMedia);
                        kr0Var.j();
                        kr0Var.F = string2;
                        org.telegram.ui.Components.ir0 ir0Var = kr0Var.f27925a[0];
                        if (string2 != null) {
                            ir0Var.e.l(string2, false);
                        }
                        org.telegram.ui.Components.rc0 rc0Var = new org.telegram.ui.Components.rc0(kr0Var, 29);
                        kr0Var.G = rc0Var;
                        AndroidUtilities.runOnUIThread(rc0Var, 1000L);
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
                    this.actionBar.J(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]), false, 350L, org.telegram.ui.Components.bs.h);
                }
            }
            this.Q3 = arrayList.isEmpty();
        } else if (this.R0 == 10) {
            a4(arrayList.isEmpty());
        }
    }

    public final void Z3(boolean z10) {
        int i10;
        boolean z11;
        this.actionBar.s();
        this.I2.clear();
        org.telegram.ui.ActionBar.g2 g2Var = this.f36093e1;
        boolean z12 = true;
        if (g2Var != null) {
            g2Var.c(0.0f, true);
        }
        aw awVar = this.f36198z0;
        if (awVar != null) {
            awVar.b(org.telegram.ui.ActionBar.h6.K8, org.telegram.ui.ActionBar.h6.I8, org.telegram.ui.ActionBar.h6.J8, org.telegram.ui.ActionBar.h6.L8, org.telegram.ui.ActionBar.h6.f20990d6);
        }
        ValueAnimator valueAnimator = this.f36181v3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f36181v3 = null;
        }
        if (this.f36176u3 == 0.0f) {
            return;
        }
        A4(-R3());
        boolean z13 = false;
        int i11 = 0;
        while (true) {
            ay[] ayVarArr = this.f36092e0;
            if (i11 >= ayVarArr.length) {
                break;
            }
            ay ayVar = ayVarArr[i11];
            if (ayVar != null) {
                ayVar.f35443a.I0(true);
            }
            i11++;
        }
        if (this.K) {
            i10 = 81;
        } else {
            i10 = 0;
        }
        float max = Math.max(0.0f, AndroidUtilities.dp(i10 + 48) + this.N);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f36176u3, 0.0f);
        this.f36181v3 = ofFloat;
        ofFloat.addUpdateListener(new jv(this, max, 1));
        this.f36181v3.addListener(new fx(this, max, 0));
        this.f36181v3.setInterpolator(org.telegram.ui.Components.bs.f25021f);
        this.f36181v3.setDuration(200L);
        this.f36181v3.start();
        this.Y0 = false;
        ArrayList arrayList = this.f36072a1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList.get(i12);
                n00.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
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
        R4(true);
        if (this.f36092e0 != null) {
            int i13 = z11;
            while (true) {
                ay[] ayVarArr2 = this.f36092e0;
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
        e5(i15 | i14, true);
    }

    public final void Z4() {
        org.telegram.ui.Components.kr0 kr0Var = this.G2;
        if (kr0Var != null) {
            int i10 = this.currentAccount;
            kr0Var.h(i10);
            kr0Var.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
            ArrayList arrayList = kr0Var.f27928f;
            arrayList.clear();
            ArrayList arrayList2 = this.I2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            org.telegram.ui.Components.ir0 ir0Var = kr0Var.f27925a[0];
            if (kr0Var.f27926b == 1) {
                ir0Var.d.l(kr0Var.c(ir0Var), false);
            }
        }
    }

    public final void a4(boolean z10) {
        if (this.G3.c()) {
            z10 = true;
        }
        if (!z10 || !this.f36078b2) {
            this.U3 = z10;
            W4(true);
            if (z10) {
                ei.x3 x3Var = this.f36146p0;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                ei.x3 x3Var2 = this.f36151q0;
                if (x3Var2 != null) {
                    x3Var2.e(true);
                }
            }
        }
    }

    public final void a5(boolean z10) {
        boolean z11;
        if (this.f36128l0 == null) {
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

    public final void b5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.p5 p5Var;
        tw twVar = this.E0;
        org.telegram.ui.Components.p5 p5Var2 = null;
        if (twVar != null && (p5Var = twVar.f5867a0) != null && twVar.f5886q0 != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                p5Var.j(emojiStatusDocumentId.longValue(), z10);
                p5Var.m(user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible, z10);
            } else if (user != null && MessagesController.getInstance(twVar.f5874f).isPremiumUser(user)) {
                if (twVar.N0 == null) {
                    twVar.N0 = twVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    twVar.N0 = new org.telegram.ui.Components.q5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), twVar.N0);
                }
                twVar.N0.setColorFilter(new PorterDuffColorFilter(twVar.f(org.telegram.ui.ActionBar.h6.f21405zh), PorterDuff.Mode.MULTIPLY));
                p5Var.g(twVar.N0, z10);
                p5Var.m(false, z10);
            } else {
                p5Var.g(null, z10);
                p5Var.m(false, z10);
            }
            p5Var.k(Integer.valueOf(twVar.f(org.telegram.ui.ActionBar.h6.f21405zh)));
            twVar.W.invalidate();
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
                this.actionBar.setRightDrawableOnClick(new gv(this, 2));
                x51.t(this.currentAccount);
            } else if (user != null && MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
                if (this.L3 == null) {
                    this.L3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    this.L3 = new org.telegram.ui.Components.q5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.L3);
                }
                this.L3.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f21405zh), PorterDuff.Mode.MULTIPLY));
                this.E3.g(this.L3, z10);
                this.E3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(new gv(this, 3));
                x51.t(this.currentAccount);
            } else {
                this.E3.g(null, z10);
                this.E3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(null);
            }
            org.telegram.ui.Components.p5 p5Var3 = this.E3;
            int i10 = org.telegram.ui.ActionBar.h6.f21405zh;
            p5Var3.k(Integer.valueOf(getThemedColor(i10)));
            org.telegram.ui.Cells.o oVar = this.F3;
            if (oVar != null) {
                oVar.setColor(getThemedColor(i10));
            }
            yw ywVar = this.M0;
            if (ywVar != null && (ywVar.getContentView() instanceof x51)) {
                org.telegram.ui.ActionBar.j5 titleTextView = this.actionBar.getTitleTextView();
                x51 x51Var = (x51) this.M0.getContentView();
                if (titleTextView != null) {
                    Drawable rightDrawable = titleTextView.getRightDrawable();
                    org.telegram.ui.Components.p5 p5Var4 = this.E3;
                    if (rightDrawable == p5Var4) {
                        p5Var2 = p5Var4;
                    }
                }
                x51Var.y(p5Var2, titleTextView);
            }
        }
    }

    public final boolean c4() {
        if (this.W2 == 1) {
            return true;
        }
        return false;
    }

    public final void c5() {
        ei.x3 x3Var;
        boolean storiesEnabled = getMessagesController().storiesEnabled();
        if (this.O3 != storiesEnabled) {
            V4();
            if (!this.O3 && storiesEnabled && (x3Var = this.f36146p0) != null) {
                x3Var.u();
            }
            this.O3 = storiesEnabled;
        }
        org.telegram.ui.Components.h20 h20Var = this.f36168t0;
        if (h20Var == null) {
            return;
        }
        if (this.R0 == 10) {
            h20Var.setImageResource(R.drawable.floating_check);
            this.f36168t0.setContentDescription(LocaleController.getString(R.string.Done));
            return;
        }
        h20Var.setImageResource(R.drawable.filled_fab_compose_32);
        this.f36168t0.setContentDescription(LocaleController.getString(R.string.NewMessageTitle));
    }

    @Override
    public final boolean canBeginSlide() {
        aw awVar;
        if (!this.G3.c()) {
            if (this.R0 == 3 && (awVar = this.f36198z0) != null && awVar.getVisibility() == 0 && this.f36198z0.K > 0) {
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
            lx lxVar = this.C0;
            if (lxVar != null) {
                lxVar.R();
                return true;
            }
            return true;
        }
        return super.closeLastFragment();
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.Components.z7 z7Var = new org.telegram.ui.Components.z7(this, context, this.resourceProvider, 3);
        z7Var.setAllowOverlayTitle(true);
        z7Var.L();
        z7Var.B(getThemedColor(org.telegram.ui.ActionBar.h6.f21288t8), false);
        z7Var.B(getThemedColor(org.telegram.ui.ActionBar.h6.f21397z8), true);
        z7Var.C(getThemedColor(org.telegram.ui.ActionBar.h6.f21325v8), false);
        z7Var.C(getThemedColor(org.telegram.ui.ActionBar.h6.f21380y8), true);
        z7Var.k();
        z7Var.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        z7Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(3.0f));
        if (!this.inPreviewMode && (!AndroidUtilities.isTablet() || this.W2 == 0 || c4())) {
            return z7Var;
        }
        z7Var.setOccupyStatusBar(false);
        return z7Var;
    }

    @Override
    public final android.view.View createView(android.content.Context r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.createView(android.content.Context):android.view.View");
    }

    public final boolean d4(long j10) {
        if (j10 < 0) {
            return false;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        if (!UserObject.isBotForum(user)) {
            return false;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f20423id);
        if ((topics != null && !topics.isEmpty()) || !MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f20423id)) {
            return false;
        }
        return true;
    }

    public final void d5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        boolean z12;
        ci.i7 V3;
        ArrayList arrayList;
        boolean z13;
        boolean z14;
        int i10;
        float f7;
        float f10;
        if (this.E0 != null && this.I == null) {
            ww wwVar = this.G3;
            if ((wwVar == null || !wwVar.c()) && !this.f36154q3 && (kVar = this.actionBar) != null && !kVar.t() && !this.f36129l2) {
                ei.vb vbVar = ei.vb.F2;
                int i11 = 0;
                if ((vbVar != null && vbVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
                    z10 = false;
                }
                if (!c4() && V3().G()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.Y2 != 0) {
                    z12 = false;
                } else if (c4()) {
                    z12 = !V3().h.isEmpty();
                } else {
                    if (!z11 && (((arrayList = (V3 = V3()).f5495g) != null && arrayList.size() > 0) || V3.H())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z11 = V3().G();
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
                    tw twVar = this.E0;
                    if (z13 != z15) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    twVar.p(z10, z14);
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
                        ofFloat.addUpdateListener(new ui(1, this));
                        this.J.addListener(new org.telegram.ui.Components.p31(this, 23));
                        this.J.setDuration(200L);
                        this.J.setInterpolator(org.telegram.ui.Components.bs.f25021f);
                        this.J.start();
                    } else {
                        tw twVar2 = this.E0;
                        if (z16 && !isInPreviewMode()) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        twVar2.setVisibility(i10);
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
                            f11 = R3();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.I = ofFloat2;
                        ofFloat2.addUpdateListener(new kx(this, f13, z12, f11));
                        this.I.addListener(new cx(this, z12, 2));
                        this.I.setDuration(200L);
                        this.I.setInterpolator(org.telegram.ui.Components.bs.f25021f);
                        this.I.start();
                        return;
                    }
                    this.K = z12;
                    tw twVar3 = this.E0;
                    if ((z12 || this.L) && !isInPreviewMode()) {
                        i12 = 0;
                    }
                    twVar3.setVisibility(i12);
                    if (!z12) {
                        A4(0.0f);
                    } else {
                        this.y3 = -AndroidUtilities.dp(81.0f);
                        A4(-R3());
                    }
                    while (true) {
                        ay[] ayVarArr = this.f36092e0;
                        if (i11 >= ayVarArr.length) {
                            break;
                        }
                        ay ayVar = ayVarArr[i11];
                        if (ayVar != null) {
                            ayVar.f35443a.requestLayout();
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
    public final void didReceivedNotification(int r30, int r31, java.lang.Object... r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (!(dialog instanceof gi.d3) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final boolean e4(TLRPC.Dialog dialog) {
        char c10;
        if (dialog == null) {
            return false;
        }
        int i10 = this.f36092e0[0].f35449s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.t() || this.actionBar.u(null))) {
            MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
            if (this.f36092e0[0].f35449s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            dialogFilter = dialogFilterArr[c10];
        }
        if (dialogFilter != null) {
            if (dialogFilter.pinnedDialogs.indexOfKey(dialog.f20280id) < 0) {
                return false;
            }
            return true;
        }
        return dialog.pinned;
    }

    public final void e5(int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.e5(int, boolean):void");
    }

    public final boolean f3(long j10, View view) {
        if (this.f36129l2 && getMessagesController().isForum(j10)) {
            return false;
        }
        Long valueOf = Long.valueOf(j10);
        ArrayList arrayList = this.I2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j10));
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).V(false, true);
            } else if (view instanceof org.telegram.ui.Cells.h6) {
                ((org.telegram.ui.Cells.h6) view).t(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j10));
        if (view instanceof org.telegram.ui.Cells.r2) {
            ((org.telegram.ui.Cells.r2) view).V(true, true);
        } else if (view instanceof org.telegram.ui.Cells.h6) {
            ((org.telegram.ui.Cells.h6) view).t(true, true);
        }
        return true;
    }

    public final boolean f4() {
        if (this.C2 == null && this.f36138n2 == null) {
            return true;
        }
        return false;
    }

    public final boolean f5(long j10) {
        TLRPC.Chat chat;
        mw mwVar;
        if ((this.S0 <= 1 && ((mwVar = this.B1) == null || mwVar.getVisibility() != 0 || TextUtils.isEmpty(this.B1.getFieldText()))) || !DialogObject.isChatDialog(j10) || (chat = getMessagesController().getChat(Long.valueOf(-j10))) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.f5.t0(this, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null);
        return false;
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.i80 i80Var = this.L0;
        if (i80Var != null) {
            i80Var.u();
        }
    }

    public final void g3(hg.o0 o0Var) {
        lx lxVar;
        if (this.f36154q3 && (lxVar = this.C0) != null) {
            ArrayList arrayList = lxVar.A0;
            if (!arrayList.isEmpty()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (o0Var.b((hg.o0) arrayList.get(i10))) {
                        return;
                    }
                }
            }
            arrayList.add(o0Var);
            rx rxVar = this.X;
            ArrayList arrayList2 = rxVar.F;
            arrayList2.add(o0Var);
            rxVar.I = arrayList2.size() - 1;
            rxVar.f();
            this.X.f27726r.getText().clear();
            U4(true, null, null, false, true);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.z4 getBackButtonState() {
        if (!c4() && !this.G3.f43002f) {
            return org.telegram.ui.ActionBar.z4.f21917b;
        }
        return org.telegram.ui.ActionBar.z4.f21916a;
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f7) {
        int i10;
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.X3, 1.0f);
            this.f36074a4 = ofFloat;
            return ofFloat;
        }
        if (getLayoutContainer() != null && getLayoutContainer().getMeasuredWidth() > 0) {
            i10 = (int) Utilities.clamp((200.0f / getLayoutContainer().getMeasuredWidth()) * f7, 200.0f, 80.0f);
        } else {
            i10 = 150;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.X3, 1.0f);
        this.f36074a4 = ofFloat2;
        ofFloat2.addUpdateListener(new ev(this, 2));
        this.f36074a4.setInterpolator(org.telegram.ui.Components.bs.f25022g);
        this.f36074a4.setDuration(i10);
        this.f36074a4.start();
        return this.f36074a4;
    }

    @Override
    public final java.util.ArrayList getThemeDescriptions() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.getThemeDescriptions():java.util.ArrayList");
    }

    public final void h3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            ArrayList arrayList = new ArrayList();
            if (this.W2 == 0 && this.Y2 == 0 && Build.VERSION.SDK_INT >= 33 && pj0.o(parentActivity)) {
                if (z10) {
                    showDialog(new pj0(parentActivity, !org.telegram.ui.Components.xe0.a(), new qv(parentActivity, 1)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            if (getUserConfig().syncContacts && this.U1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z10) {
                    org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.f5.v(parentActivity, new kv(this, 1)).f20605a;
                    this.T1 = b2Var;
                    showDialog(b2Var);
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
                    H4();
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

    public final void h4(long j10) {
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
                    h4(dialog2.f20280id);
                }
                return;
            }
            return;
        }
        int i11 = this.f36092e0[0].f35449s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i11 == 7 || i11 == 8) && (!this.actionBar.t() || this.actionBar.u(null))) {
            MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
            if (this.f36092e0[0].f35449s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            dialogFilter = dialogFilterArr[c10];
        }
        this.f36201z3 = 2;
        int i12 = -1;
        if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && !dialogFilter.alwaysShow(this.currentAccount, dialog)) {
            y4(true, true);
            m3();
            if (this.R1 != null) {
                int i13 = 0;
                while (true) {
                    if (i13 >= this.R1.size()) {
                        break;
                    } else if (((TLRPC.Dialog) this.R1.get(i13)).f20280id == j10) {
                        i12 = i13;
                        break;
                    } else {
                        i13++;
                    }
                }
                if (i12 < 0) {
                    y4(false, false);
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
            this.f36092e0[0].f35451x.D();
            this.f36092e0[0].q(true);
        }
    }

    public final void i3(CharSequence charSequence) {
        int i10;
        if (this.B1 != null) {
            if (this.D2 == null && this.E2 == null && this.F2 == null) {
                return;
            }
            if (this.G2 == null) {
                org.telegram.ui.Components.kr0 kr0Var = new org.telegram.ui.Components.kr0(getParentActivity(), getResourceProvider());
                this.G2 = kr0Var;
                kr0Var.setLayoutClickListener(new gv(this, 0));
                this.G2.setOnModeChangeListener(new hv(this, 0));
                mw mwVar = this.B1;
                org.telegram.ui.Components.kr0 kr0Var2 = this.G2;
                if (kr0Var2 == null) {
                    mwVar.getClass();
                } else {
                    mwVar.G1 = kr0Var2;
                    mwVar.addView(kr0Var2, 0, w7.z5.e(-1, 48, 51));
                    mwVar.f23951g3 = false;
                    mwVar.L();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.G2.getLayoutParams();
                layoutParams.rightMargin = -this.B1.getPaddingRight();
                this.G2.setLayoutParams(layoutParams);
            }
            if (Y3()) {
                this.G2.i(this.currentAccount, this.D2);
            } else {
                String str = this.E2;
                if (str != null) {
                    org.telegram.ui.Components.kr0 kr0Var3 = this.G2;
                    kr0Var3.g(this.currentAccount);
                    if (!str.isEmpty()) {
                        kr0Var3.e(str, true);
                    }
                } else {
                    CharSequence charSequence2 = this.F2;
                    if (charSequence2 != null) {
                        org.telegram.ui.Components.kr0 kr0Var4 = this.G2;
                        kr0Var4.g(this.currentAccount);
                        if (charSequence2.length() > 0) {
                            kr0Var4.e(charSequence2, true);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.B1.setFieldText(charSequence);
            }
            mw mwVar2 = this.B1;
            if (Y3()) {
                i10 = R.string.AddCaption;
            } else {
                i10 = R.string.ShareComment;
            }
            mwVar2.setOverrideHint(LocaleController.getString(i10));
            t3();
            if (this.G2.getMode() != 0) {
                this.B1.u1(false, false);
            }
            Z4();
        }
    }

    public final boolean i4(org.telegram.tgnet.TLRPC.Chat r6, org.telegram.tgnet.TLRPC.User r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.i4(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):boolean");
    }

    @Override
    public final boolean isLightStatusBar() {
        ww wwVar;
        if (!this.f36120j2 && (wwVar = this.G3) != null && wwVar.getFragment() != null) {
            return this.G3.getFragment().isLightStatusBar();
        }
        if (i0.a.h(getThemedColor(org.telegram.ui.ActionBar.h6.f20990d6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.j3():void");
    }

    public final boolean j4(TLRPC.User user) {
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

    public final int k3() {
        if (this.B1 != null) {
            return (int) (this.f36196y1.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(2.0f));
        } else if (this.Y2 != 0) {
            return AndroidUtilities.dp(72.0f) + this.f36107g4;
        } else {
            return this.f36107g4 + this.f36117i4;
        }
    }

    public final void k4(View view) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        String str = null;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) getParentActivity(), (org.telegram.ui.ActionBar.d6) null, false);
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
        p4 p4Var = new p4(this, 1);
        f3Var.items = charSequenceArr;
        f3Var.itemIcons = iArr;
        f3Var.onClickListener = p4Var;
        showDialog(f3Var);
    }

    public final boolean l3() {
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

    public final void l4(android.view.View r25, int r26, s4.g0 r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.l4(android.view.View, int, s4.g0):void");
    }

    public final void m3() {
        AndroidUtilities.runOnUIThread(new cv(this, 2), 300L);
    }

    public final boolean m4(View view, int i10, float f7, org.telegram.ui.Components.im0 im0Var) {
        org.telegram.ui.Components.po0 po0Var;
        long j10;
        org.telegram.ui.Components.po0 po0Var2;
        TLRPC.EncryptedChat encryptedChat;
        long makeEncryptedDialogId;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.z2) && im0Var.j(i10) != 21) {
            if (!this.actionBar.t() && !AndroidUtilities.isTablet() && !this.f36129l2 && (view instanceof org.telegram.ui.Cells.r2)) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                if (!getMessagesController().isForum(r2Var.getDialogId()) && !this.G3.c() && r2Var.S(f7)) {
                    return F4(r2Var);
                }
            }
            ww wwVar = this.G3;
            if (wwVar == null || !wwVar.c()) {
                lx lxVar = this.C0;
                boolean z10 = true;
                if (lxVar != null && im0Var == (po0Var2 = lxVar.f32179b0)) {
                    Object J = po0Var2.J(i10);
                    if (!this.C0.f32179b0.N) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20605a;
                        b2Var.R = string;
                        if (J instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) J;
                            if (chat.monoforum) {
                                b2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, og.d.i(chat, this.currentAccount, false));
                            } else {
                                b2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, chat.title);
                            }
                            makeEncryptedDialogId = -chat.f20276id;
                        } else if (J instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) J;
                            if (user.f20423id == getUserConfig().clientUserId) {
                                b2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, LocaleController.getString(R.string.SavedMessages));
                            } else {
                                b2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user.first_name, user.last_name));
                            }
                            makeEncryptedDialogId = user.f20423id;
                        } else if (J instanceof TLRPC.EncryptedChat) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(((TLRPC.EncryptedChat) J).user_id));
                            b2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user2.first_name, user2.last_name));
                            makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.f20284id);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new ci.d1(this, makeEncryptedDialogId, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        showDialog(b2Var);
                        TextView textView = (TextView) b2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21228q7));
                        }
                        return true;
                    }
                }
                lx lxVar2 = this.C0;
                if (lxVar2 != null && im0Var == (po0Var = lxVar2.f32179b0)) {
                    if (this.f36129l2) {
                        l4(view, i10, im0Var);
                        return false;
                    }
                    if ((view instanceof org.telegram.ui.Cells.h6) && !po0Var.O(i10)) {
                        j10 = ((org.telegram.ui.Cells.h6) view).getDialogId();
                    } else {
                        j10 = 0;
                    }
                    if (j10 != 0) {
                        K4(j10, view);
                        return true;
                    }
                } else {
                    Object I = ((hg.m) im0Var).I(i10);
                    if (I instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) I;
                        if (this.f36129l2) {
                            if ((this.R0 == 3 || G3()) && f5(dialog.f20280id)) {
                                if (this.R0 == 1 && G3() && this.f36132m2 && getMessagesController().isForum(dialog.f20280id)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -dialog.f20280id);
                                    bundle.putBoolean("for_select", true);
                                    bundle.putBoolean("forward_to", true);
                                    if (this.R0 != 1) {
                                        z10 = false;
                                    }
                                    bundle.putBoolean("bot_share_to", z10);
                                    bundle.putBoolean("quote", this.O0);
                                    bundle.putBoolean("reply_to", this.N0);
                                    re1 re1Var = new re1(bundle);
                                    re1Var.L0 = this;
                                    presentFragment(re1Var);
                                    return false;
                                }
                                f3(dialog.f20280id, view);
                                Y4();
                                return true;
                            }
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                            k4(view);
                            return false;
                        } else if (!this.actionBar.t() || !e4(dialog)) {
                            K4(dialog.f20280id, view);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean n3(long j10) {
        int i10;
        int i11 = this.R0;
        if (i11 != 15 && i11 != 16 && this.f36110h2 == null && this.f36165s2) {
            if (DialogObject.isChatDialog(j10)) {
                long j11 = -j10;
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j11));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    if (this.f36153q2 || !ChatObject.isCanWriteToChannel(j11, this.currentAccount) || (i10 = this.T0) == 2 || i10 == 3) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.f20605a.R = LocaleController.getString(R.string.SendMessageTitle);
                        int i12 = this.T0;
                        if (i12 == 3) {
                            alertDialog$Builder.f20605a.T = LocaleController.getString(R.string.TodoCantForward);
                        } else if (i12 == 2) {
                            alertDialog$Builder.f20605a.T = LocaleController.getString(R.string.PublicPollCantForward);
                        } else {
                            alertDialog$Builder.f20605a.T = LocaleController.getString(R.string.ChannelCantSendMessage);
                        }
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        showDialog(alertDialog$Builder.f20605a);
                        return false;
                    }
                    return true;
                }
                return true;
            } else if (DialogObject.isEncryptedDialog(j10)) {
                if (this.T0 != 0 || this.U0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.f20605a.R = LocaleController.getString(R.string.SendMessageTitle);
                    int i13 = this.T0;
                    if (i13 == 3) {
                        alertDialog$Builder2.f20605a.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
                    } else if (i13 != 0) {
                        alertDialog$Builder2.f20605a.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
                    } else {
                        alertDialog$Builder2.f20605a.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
                    }
                    alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    showDialog(alertDialog$Builder2.f20605a);
                    return false;
                }
                return true;
            } else {
                return true;
            }
        }
        return true;
    }

    public final void n4(View view) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.ActionBar.i4(28));
        org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(this, view);
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
                linearLayout.setBackground(org.telegram.ui.ActionBar.h6.Z(getThemedColor(org.telegram.ui.ActionBar.h6.f21079i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
                h9Var.r(currentUser);
                org.telegram.ui.Components.eh0 eh0Var = new org.telegram.ui.Components.eh0(this, getParentActivity(), z10);
                linearLayout.addView(eh0Var, w7.z5.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getParentActivity());
                if (z10) {
                    w9Var.setScaleX(0.833f);
                    w9Var.setScaleY(0.833f);
                }
                w9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                w9Var.getImageReceiver().setCurrentAccount(intValue);
                w9Var.e(currentUser, h9Var);
                eh0Var.addView(w9Var, w7.z5.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21096j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, w7.z5.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new ai.ha(this, intValue, H, 13));
                H.r(linearLayout, w7.z5.n(230, 48));
            }
        }
        ShapeDrawable c02 = org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(24.0f), getThemedColor(org.telegram.ui.ActionBar.h6.f20990d6));
        c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.h6.m1(0.15f, -16777216));
        H.f27191z.set(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        H.W(c02);
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        H.V(5);
        H.Z();
    }

    public final void o3(boolean z10) {
        ii.i iVar;
        TLRPC.ChatFull chatFull;
        boolean z11;
        org.telegram.ui.Components.us usVar = this.J1;
        if (usVar != null && (iVar = this.Q1) != null && (chatFull = this.f36073a3) != null) {
            if (this.Y2 != 0 && chatFull.requests_pending > 0 && !this.f36075b.f17384f) {
                z11 = true;
            } else {
                z11 = false;
            }
            usVar.i(iVar, z11, z10);
            this.Q1.setTitle(LocaleController.formatPluralString("CommunityPendingRequestsRow", this.f36073a3.requests_pending, new Object[0]));
        }
    }

    public final void o4(int i10, long j10, TLRPC.Chat chat, boolean z10, boolean z11) {
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
    public final boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else if (this.G3.c() && this.G3.getFragment().onBackPressed(z10)) {
            if (z10) {
                this.G3.a();
                lx lxVar = this.C0;
                if (lxVar != null) {
                    lxVar.R();
                    return false;
                }
            }
        } else {
            org.telegram.ui.Components.i80 i80Var = this.L0;
            if (i80Var != null) {
                if (z10) {
                    i80Var.u();
                    this.L0 = null;
                    return false;
                }
            } else {
                aw awVar = this.f36198z0;
                if (awVar != null && awVar.f30081n) {
                    if (z10) {
                        awVar.setIsEditing(false);
                        G4(false);
                        return false;
                    }
                } else {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar != null && kVar.t()) {
                        if (z10) {
                            lx lxVar2 = this.C0;
                            if (lxVar2 != null && lxVar2.getVisibility() == 0) {
                                this.C0.Q(false);
                            }
                            Z3(true);
                            return false;
                        }
                    } else if (this.f36075b.f17384f) {
                        if (z10) {
                            this.X.f27726r.getText().clear();
                            this.Y.b(false);
                            this.X.f27726r.clearFocus();
                            return false;
                        }
                    } else {
                        aw awVar2 = this.f36198z0;
                        if (awVar2 != null && awVar2.getVisibility() == 0 && !this.f36111h3) {
                            aw awVar3 = this.f36198z0;
                            if (!awVar3.O && !this.f36133m3) {
                                ArrayList arrayList = awVar3.h;
                                if (!arrayList.isEmpty() && awVar3.L != ((org.telegram.ui.Components.p00) arrayList.get(0)).f29176a) {
                                    if (z10) {
                                        aw awVar4 = this.f36198z0;
                                        ArrayList arrayList2 = awVar4.h;
                                        if (!arrayList2.isEmpty()) {
                                            awVar4.f((org.telegram.ui.Components.p00) arrayList2.get(0), 0);
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        mw mwVar = this.B1;
                        if (mwVar != null && mwVar.r0()) {
                            if (z10) {
                                this.B1.k0(true);
                            }
                        } else {
                            tw twVar = this.E0;
                            if (twVar.O == 0 && twVar.S.L0() != 0) {
                                twVar.h.x0(0);
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
        ai.ic icVar;
        aw awVar;
        if (this.V1) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.h(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                lx lxVar = this.C0;
                if (lxVar != null) {
                    lxVar.f32179b0.R(this.W1, tLObject);
                }
                this.X1 = null;
            }
            this.V1 = false;
        }
        if (!this.K && (awVar = this.f36198z0) != null && awVar.getVisibility() == 0 && this.f36156r.f17384f) {
            int i10 = (int) (-this.N);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (i10 != 0 && i10 != currentActionBarHeight && i10 >= currentActionBarHeight / 2) {
                this.f36092e0[0].f35443a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.f36195y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        if (!isInPreviewMode() && (icVar = this.K0) != null && icVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        z3();
        this.f36157r0 = true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        ei.x3 x3Var;
        super.onBecomeFullyVisible();
        if (c4()) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z10 = globalMainSettings.getBoolean("archivehint", true);
            boolean isEmpty = P3(this.currentAccount, this.R0, this.W2, false).isEmpty();
            if (z10 && isEmpty) {
                MessagesController.getGlobalMainSettings().edit().putBoolean("archivehint", false).commit();
                z10 = false;
            }
            if (z10) {
                globalMainSettings.edit().putBoolean("archivehint", false).commit();
                E4();
            }
        }
        if (this.f36157r0 && !this.f36163s0 && (x3Var = this.f36146p0) != null && this.O3) {
            this.f36163s0 = true;
            this.f36157r0 = false;
            x3Var.u();
        }
        AndroidUtilities.runOnUIThread(new sv(this, 4), 200L);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.i80 i80Var = this.L0;
        if (i80Var != null) {
            i80Var.u();
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.b2 b2Var;
        super.onDialogDismiss(dialog);
        if (this.W2 == 0 && this.Y2 == 0 && (b2Var = this.T1) != null && dialog == b2Var && getParentActivity() != null) {
            h3(false);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10;
        super.onFragmentCreate();
        Bundle bundle = this.arguments;
        int i11 = 0;
        if (bundle != null) {
            this.f36129l2 = bundle.getBoolean("onlySelect", false);
            this.f36132m2 = this.arguments.getBoolean("canSelectTopics", false);
            this.f36153q2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.R0 = this.arguments.getInt("dialogsType", 0);
            this.O0 = this.arguments.getBoolean("quote", false);
            this.N0 = this.arguments.getBoolean("reply_to", false);
            this.P0 = this.arguments.getLong("reply_to_author", 0L);
            this.Q0 = this.arguments.getLong("forward_into_channel", 0L);
            this.f36100f2 = this.arguments.getString("selectAlertString");
            this.f36105g2 = this.arguments.getString("selectAlertStringGroup");
            this.f36110h2 = this.arguments.getString("addToGroupAlertString");
            this.f36159r2 = this.arguments.getBoolean("allowSwitchAccount");
            this.f36165s2 = this.arguments.getBoolean("checkCanWrite", true);
            this.f36170t2 = this.arguments.getBoolean("afterSignup", false);
            this.W2 = this.arguments.getInt("folderId", 0);
            long j10 = this.arguments.getLong("community_id", 0L);
            this.Y2 = j10;
            if (j10 != 0) {
                this.Z2 = getMessagesController().getChat(Long.valueOf(this.Y2));
                this.f36073a3 = getMessagesController().getChatFull(this.Y2);
            }
            this.f36115i2 = this.arguments.getBoolean("resetDelegate", true);
            this.S0 = this.arguments.getInt("messagesCount", 0);
            this.T0 = this.arguments.getInt("hasPoll", 0);
            this.U0 = this.arguments.getBoolean("hasInvoice", false);
            this.f36175u2 = this.arguments.getBoolean("showSetPasswordConfirm", this.f36175u2);
            this.arguments.getInt("otherwiseRelogin");
            this.f36180v2 = this.arguments.getBoolean("allowGroups", true);
            this.f36186w2 = this.arguments.getBoolean("allowMegagroups", true);
            this.f36192x2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.f36197y2 = this.arguments.getBoolean("allowChannels", true);
            this.f36200z2 = this.arguments.getBoolean("allowUsers", true);
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
        if (this.f36138n2 == null) {
            this.f36089d2 = getConnectionsManager().getConnectionState();
            this.K3.addGlobal(NotificationCenter.emojiLoaded);
            if (!this.f36129l2) {
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
        g4(getAccountInstance());
        ci.i7 storiesController = getMessagesController().getStoriesController();
        if (!storiesController.A) {
            storiesController.T();
            if (!storiesController.f5506s) {
                ConnectionsManager.getInstance(storiesController.f5491a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new ci.h6(storiesController, 0));
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
        if (c4()) {
            ci.i7 storiesController2 = getMessagesController().getStoriesController();
            if (storiesController2.f5512z) {
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
        this.f36117i4 = i10;
        if (this.W) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.f36122j4 = i11;
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
        mw mwVar = this.B1;
        if (mwVar != null) {
            mwVar.z0();
        }
        org.telegram.ui.Components.kr0 kr0Var = this.G2;
        if (kr0Var != null) {
            kr0Var.j();
        }
        lt ltVar = this.H2;
        if (ltVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ltVar);
            this.H2 = null;
        }
        UndoView undoView = this.f36195y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f36149p3.unlock();
        this.C2 = null;
        x91 x91Var = x91.f43175b;
        if (x91Var != null) {
            x91Var.dismiss();
            x91.f43175b = null;
        }
    }

    @Override
    public final void onPanTranslationUpdate(float f7) {
        if (this.f36092e0 != null) {
            this.J0 = f7;
            mw mwVar = this.B1;
            int i10 = 0;
            if (mwVar != null && mwVar.r0()) {
                this.fragmentView.setTranslationY(f7);
                while (true) {
                    ay[] ayVarArr = this.f36092e0;
                    if (i10 >= ayVarArr.length) {
                        break;
                    }
                    ayVarArr[i10].setTranslationY(0.0f);
                    i10++;
                }
                if (!this.f36129l2) {
                    this.actionBar.setTranslationY(0.0f);
                    org.telegram.ui.Components.qc qcVar = this.f36144o3;
                    if (qcVar != null) {
                        qcVar.l();
                    }
                }
                lx lxVar = this.C0;
                if (lxVar != null) {
                    lxVar.setTranslationY(this.I0);
                    return;
                }
                return;
            }
            while (true) {
                ay[] ayVarArr2 = this.f36092e0;
                if (i10 >= ayVarArr2.length) {
                    break;
                }
                ayVarArr2[i10].setTranslationY(f7);
                i10++;
            }
            if (!this.f36129l2) {
                this.actionBar.setTranslationY(f7);
                org.telegram.ui.Components.qc qcVar2 = this.f36144o3;
                if (qcVar2 != null) {
                    qcVar2.l();
                }
            }
            lx lxVar2 = this.C0;
            if (lxVar2 != null) {
                lxVar2.setTranslationY(this.J0 + this.I0);
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
        ww wwVar = this.G3;
        if (wwVar != null) {
            wwVar.f43004r = true;
            dx dxVar = wwVar.f42999a;
            if (dxVar != null) {
                dxVar.onPause();
            }
        }
        org.telegram.ui.Components.i80 i80Var = this.L0;
        if (i80Var != null) {
            i80Var.u();
        }
        mw mwVar = this.B1;
        if (mwVar != null) {
            mwVar.B0();
        }
        int i10 = 0;
        UndoView undoView = this.f36195y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        setBulletinDelegate(null);
        if (this.f36092e0 == null) {
            return;
        }
        while (true) {
            ay[] ayVarArr = this.f36092e0;
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
                                pj0.n();
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
                H4();
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
        jw jwVar;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.Components.po0 po0Var;
        ai.ic icVar;
        super.onResume();
        tw twVar = this.E0;
        char c10 = 0;
        if (twVar != null) {
            ArrayList arrayList = twVar.f5896x;
            ci.i7 i7Var = twVar.f5889s;
            i7Var.l(i7Var.f5495g);
            i7Var.l(i7Var.h);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TL_stories.PeerStories y3 = i7Var.y(((ci.o) arrayList.get(i10)).f5680c);
                if (y3 != null) {
                    i7Var.X(y3);
                }
            }
        }
        ww wwVar = this.G3;
        if (wwVar != null) {
            wwVar.f43004r = false;
            dx dxVar = wwVar.f42999a;
            if (dxVar != null) {
                dxVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (icVar = this.K0) != null && icVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        if (this.f36092e0 != null) {
            int i11 = 0;
            while (true) {
                ay[] ayVarArr = this.f36092e0;
                if (i11 >= ayVarArr.length) {
                    break;
                }
                ayVarArr[i11].d.l();
                i11++;
            }
        }
        mw mwVar = this.B1;
        if (mwVar != null) {
            mwVar.C0();
        }
        long j10 = 0;
        if (!this.f36129l2 && this.W2 == 0 && this.Y2 == 0) {
            getMediaDataController().checkStickers(4);
        }
        lx lxVar = this.C0;
        if (lxVar != null && (po0Var = lxVar.f32179b0) != null) {
            po0Var.l();
        }
        if (!this.f36170t2 && getUserConfig().unacceptedTermsOfService != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.W2 == 0 && this.Y2 == 0 && this.f36084c2 && !this.f36129l2) {
            int i12 = Build.VERSION.SDK_INT;
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.f36084c2 = false;
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
                org.telegram.messenger.r1 r1Var = new org.telegram.messenger.r1(cyVar, z13, z11, z12, parentActivity);
                if (cyVar.f36170t2 && (z11 || z13)) {
                    j10 = 4000;
                }
                AndroidUtilities.runOnUIThread(r1Var, j10);
            } else {
                cyVar = this;
            }
        } else {
            cyVar = this;
            if (!cyVar.f36129l2 && cyVar.W2 == 0 && cyVar.Y2 == 0 && XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(10020)) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutMiuiLockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.h6.L5), null);
                        alertDialog$Builder.f20605a.T = LocaleController.getString(R.string.PermissionXiaomiLockscreen);
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new hv(this, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.ug0(22));
                        showDialog(alertDialog$Builder.f20605a);
                    }
                } else {
                    return;
                }
            } else if (cyVar.W2 == 0 && cyVar.Y2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutFSILockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder2.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.h6.L5), null);
                        alertDialog$Builder2.f20605a.T = LocaleController.getString(R.string.PermissionFSILockscreen);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new hv(this, 9));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.ug0(23));
                        showDialog(alertDialog$Builder2.f20605a);
                    }
                } else {
                    return;
                }
            }
        }
        H4();
        if (cyVar.f36092e0 != null) {
            int i13 = 0;
            while (true) {
                ay[] ayVarArr2 = cyVar.f36092e0;
                if (i13 >= ayVarArr2.length) {
                    break;
                }
                ay ayVar2 = ayVarArr2[i13];
                if (ayVar2.f35449s == 0 && ayVar2.v == 2 && ayVar2.f35445c.L0() == 0 && X3()) {
                    cyVar.f36092e0[i13].f35445c.h1(1, (int) cyVar.N);
                }
                if (i13 == 0) {
                    cyVar.f36092e0[i13].d.getClass();
                } else {
                    cyVar.f36092e0[i13].d.getClass();
                }
                i13++;
            }
        }
        J4();
        setBulletinDelegate(new b9(this, 4));
        if (cyVar.f36154q3) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), cyVar.classGuid);
        }
        e5(0, false);
        X4(false, true);
        d5(false);
        if (getMessagesStorage().showClearDatabaseAlert) {
            getMessagesStorage().showClearDatabaseAlert = false;
            x91.o(this);
        }
        z3();
        if (cyVar.f36198z0 != null && (ayVar = cyVar.f36092e0[0]) != null && (jwVar = ayVar.d) != null) {
            int i14 = jwVar.h;
            if (i14 == 7 || i14 == 8) {
                MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
                if (i14 != 7) {
                    c10 = 1;
                }
                MessagesController.DialogFilter dialogFilter = dialogFilterArr[c10];
                if (dialogFilter != null) {
                    cyVar.f36198z0.h(dialogFilter.localId);
                }
            }
        }
    }

    @Override
    public final void onSlideProgress(boolean z10, float f7) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.Z3 && this.f36074a4 == null) {
            D4(f7);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        ai.ic icVar;
        cy cyVar;
        ww wwVar = this.G3;
        if (wwVar != null && wwVar.c()) {
            this.G3.getFragment().onTransitionAnimationEnd(z10, z11);
        } else {
            if (z10 && (icVar = this.K0) != null && icVar.getVisibility() == 0) {
                this.K0.setVisibility(8);
                this.K0.setBackground(null);
            }
            if (z10 && this.f36170t2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).f33200x0.c(false);
                }
            }
        }
        if (!z10 && (cyVar = this.X2) != null) {
            cyVar.removeSelfFromStack();
        }
        z3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        ww wwVar = this.G3;
        if (wwVar != null && wwVar.c()) {
            this.G3.getFragment().onTransitionAnimationProgress(z10, f7);
        } else {
            ai.ic icVar = this.K0;
            if (icVar != null && icVar.getVisibility() == 0) {
                if (z10) {
                    this.K0.setAlpha(1.0f - f7);
                } else {
                    this.K0.setAlpha(f7);
                }
            }
        }
        z3();
    }

    public final void p3(ay ayVar) {
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        int i10;
        boolean z14;
        int L0 = ayVar.f35445c.L0();
        int N0 = ayVar.f35445c.N0();
        if (!this.f36111h3 && !this.f36133m3) {
            aw awVar = this.f36198z0;
            if (awVar == null || awVar.getVisibility() != 0 || !this.f36198z0.O) {
                int abs = Math.abs(N0 - L0) + 1;
                if (N0 != -1) {
                    s4.b1 K = ayVar.f35443a.K(N0);
                    if (K != null && K.f45920f == 11) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.f36078b2 = z14;
                    if (z14) {
                        a4(false);
                    }
                } else {
                    this.f36078b2 = false;
                }
                int i11 = ayVar.f35449s;
                if (i11 == 7 || i11 == 8) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
                    int i12 = ayVar.h;
                    if (i12 >= 0 && i12 < dialogFilters.size() && (dialogFilters.get(ayVar.h).flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) == 0 && ((abs > 0 && N0 >= P3(this.currentAccount, ayVar.f35449s, 1, this.S1).size() - 10) || (abs == 0 && !getMessagesController().isDialogsEndReached(1)))) {
                        boolean isDialogsEndReached = getMessagesController().isDialogsEndReached(1);
                        boolean z15 = !isDialogsEndReached;
                        if (isDialogsEndReached && getMessagesController().isServerDialogsEndReached(1)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        z11 = z15;
                        if ((abs <= 0 && N0 >= P3(this.currentAccount, ayVar.f35449s, this.W2, this.S1).size() - 10) || (abs == 0 && (((i10 = ayVar.f35449s) == 7 || i10 == 8) && !getMessagesController().isDialogsEndReached(this.W2)))) {
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

    public final void p4(java.util.ArrayList r43, int r44, boolean r45, boolean r46, java.util.HashSet r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.p4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.Z3 = true;
            z4(true);
            return;
        }
        this.f36074a4 = null;
        this.Z3 = false;
        z4(false);
        D4(1.0f);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        boolean presentFragment = super.presentFragment(n2Var);
        if (presentFragment && this.f36092e0 != null) {
            int i10 = 0;
            while (true) {
                ay[] ayVarArr = this.f36092e0;
                if (i10 >= ayVarArr.length) {
                    break;
                }
                ayVarArr[i10].d.getClass();
                i10++;
            }
        }
        ei.x3 x3Var = this.f36146p0;
        if (x3Var != null) {
            x3Var.e(true);
        }
        ei.x3 x3Var2 = this.f36151q0;
        if (x3Var2 != null) {
            x3Var2.e(true);
        }
        org.telegram.ui.Components.qc.e();
        return presentFragment;
    }

    public final void q3() {
        if (this.f36092e0 != null) {
            int k32 = k3();
            int i10 = 0;
            while (true) {
                ay[] ayVarArr = this.f36092e0;
                if (i10 < ayVarArr.length) {
                    ay ayVar = ayVarArr[i10];
                    if (ayVar != null) {
                        xx xxVar = ayVar.f35443a;
                        xxVar.setPadding(0, xxVar.W2, 0, k32);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void q4(long r14, boolean r16, org.telegram.messenger.MessagesController.DialogFilter r17, int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.q4(long, boolean, org.telegram.messenger.MessagesController$DialogFilter, int, boolean):void");
    }

    @Override
    public final void r(int i10, float f7, float f10, ne.e eVar) {
        int i11;
        int i12;
        int i13 = 8;
        if (i10 == 1) {
            A3();
            C3();
            F3();
            s3();
            D3();
            rx rxVar = this.X;
            ne.b bVar = this.f36075b;
            rxVar.setBlurredBackgroundVisibility(bVar.e);
            float b10 = zf.f0.b(bVar.e);
            org.telegram.ui.Components.w9 w9Var = this.f36079b3;
            if (w9Var != null) {
                w9Var.setScaleX(b10);
                this.f36079b3.setScaleY(b10);
                this.f36079b3.setAlpha(b10);
                org.telegram.ui.Components.w9 w9Var2 = this.f36079b3;
                if (b10 > 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                w9Var2.setVisibility(i12);
            }
            if (this.f36178v0 != null) {
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
                this.f36178v0.setScaleX(lerp);
                this.f36178v0.setScaleY(lerp);
                this.f36178v0.setAlpha(b10);
                ei.d dVar = this.f36178v0;
                int i14 = (b10 > 0.0f ? 1 : (b10 == 0.0f ? 0 : -1));
                if (i14 > 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                dVar.setVisibility(i11);
                this.f36184w0.setAlpha(b10);
                kh.f fVar = this.f36184w0;
                if (i14 > 0) {
                    i13 = 0;
                }
                fVar.setVisibility(i13);
            }
        } else if (i10 == 2) {
            A3();
            C3();
        } else if (i10 == 3) {
            y3();
        } else if (i10 == 4) {
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        } else if (i10 == 5) {
            x3();
        } else if (i10 == 6) {
            A3();
            C3();
        } else if (i10 == 7) {
            t3();
        } else if (i10 == 8) {
            s3();
            D3();
        } else if (i10 == 9) {
            D3();
        }
    }

    public final void r3() {
        ih.f fVar = this.f36196y1;
        if (fVar != null) {
            fVar.setBlurredBottomHeight(this.f36196y1.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        }
    }

    public final void r4() {
        if (this.K0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20990d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / 180));
        this.K0.setBackground(new BitmapDrawable(createBitmap));
        this.K0.setAlpha(0.0f);
        this.K0.setVisibility(0);
        z3();
    }

    public final void s3() {
        int i10;
        ay ayVar;
        boolean z10 = true;
        float Q3 = Q3(true);
        aw awVar = this.f36198z0;
        if (awVar != null) {
            if (awVar.getAlpha() == Q3) {
                z10 = false;
            }
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, Q3);
            this.f36198z0.setAlpha(Q3);
            this.f36198z0.setScaleX(lerp);
            this.f36198z0.setScaleY(lerp);
            aw awVar2 = this.f36198z0;
            if (Q3 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            awVar2.setVisibility(i10);
            if (z10 && (ayVar = this.f36092e0[0]) != null) {
                ayVar.f35443a.requestLayout();
            }
        }
        Q4();
    }

    public final void s4(ay ayVar) {
        int i10;
        org.telegram.ui.Components.b10 b10Var;
        if (ayVar.getVisibility() != 0) {
            return;
        }
        int i11 = ayVar.d.v;
        if (ayVar.f35449s == 0 && X3() && ayVar.f35443a.getChildCount() == 0 && ayVar.v == 2) {
            ((s4.b0) ayVar.f35443a.getLayoutManager()).h1(1, (int) this.N);
        }
        ayVar.d.getClass();
        ayVar.d.U();
        int h = ayVar.d.h();
        if (h == 1 && i11 == 1 && ayVar.d.j(0) == 5) {
            ayVar.q(true);
        } else {
            ayVar.q(false);
            if (h > i11 && (i10 = this.R0) != 11 && i10 != 12 && i10 != 13) {
                ayVar.f35452y.b(i11);
            }
        }
        try {
            xx xxVar = ayVar.f35443a;
            if (this.W2 == 0 && this.Y2 == 0) {
                b10Var = ayVar.f35450w;
            } else {
                b10Var = null;
            }
            xxVar.setEmptyView(b10Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
        p3(ayVar);
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        tw twVar = this.E0;
        if (twVar != null) {
            if (this.G0 && !z10) {
                twVar.setVisibility(0);
            } else {
                twVar.setVisibility(8);
            }
        }
        W4(true);
        S4();
    }

    @Override
    public final void setTitleOverlayText(java.lang.String r6, int r7, java.lang.Runnable r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.setTitleOverlayText(java.lang.String, int, java.lang.Runnable):void");
    }

    @Override
    public final void t() {
        v4(true, true);
    }

    public final void t3() {
        int i10;
        int i11;
        float f7 = this.f36135n.e;
        float lerp = AndroidUtilities.lerp(0.2f, 1.0f, f7);
        ki.y1 y1Var = this.C1;
        int i12 = 8;
        if (y1Var != null) {
            y1Var.setScaleX(lerp);
            this.C1.setScaleY(lerp);
            this.C1.setAlpha(f7);
            ki.y1 y1Var2 = this.C1;
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            y1Var2.setVisibility(i11);
        }
        ih.f fVar = this.f36196y1;
        if (fVar != null) {
            fVar.setAlpha(f7);
            ih.f fVar2 = this.f36196y1;
            int i13 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i13 > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            fVar2.setVisibility(i10);
            this.f36196y1.getFadeView().setAlpha(f7);
            View fadeView = this.f36196y1.getFadeView();
            if (i13 > 0) {
                i12 = 0;
            }
            fadeView.setVisibility(i12);
        }
    }

    public final void t4() {
        boolean z10;
        float f7 = 0.0f;
        if (this.N != 0.0f && !(z10 = this.K)) {
            if (z10) {
                f7 = -S3();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.H3, f7));
            animatorSet.setInterpolator(org.telegram.ui.Components.bs.f25021f);
            animatorSet.setDuration(250L);
            animatorSet.start();
        }
    }

    public final void u3() {
        if (this.actionBar == null) {
            return;
        }
        org.telegram.ui.Components.h20.d(this.actionBar.getBackButton(), Math.max(this.f36176u3, (1.0f - this.f36075b.e) * (1.0f - T3()) * (1.0f - this.f36081c.e)));
    }

    public final void u4(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.u4(int):void");
    }

    public final void v3() {
        float f7;
        if (this.f36113i0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.h20.d(this.f36103g0, com.google.android.gms.internal.play_billing.k3.C(f7, 1.0f - this.f36075b.e, 1.0f - T3(), 1.0f - this.f36081c.e));
    }

    public final void v4(boolean z10, boolean z11) {
        int i10;
        int i11;
        ww wwVar = this.G3;
        if (wwVar != null && wwVar.c()) {
            return;
        }
        if (this.f36092e0[0].f35449s == 0 && X3() && this.f36092e0[0].v == 2) {
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
            org.telegram.ui.Components.ml0 ml0Var = this.f36092e0[0].f35448r;
            ml0Var.f28544b = 1;
            ml0Var.c(i10, i11, false, false);
            t4();
            return;
        }
        this.f36092e0[0].f35445c.h1(i10, i11);
        t4();
    }

    public final void w3() {
        float f7;
        if (SharedConfig.passcodeHash.isEmpty()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.h20.d(this.f36098f0, com.google.android.gms.internal.play_billing.k3.C(f7, 1.0f - this.f36075b.e, 1.0f - T3(), 1.0f - this.f36081c.e));
    }

    public final void w4(String str, boolean z10) {
        M4(true, false, true, false);
        rx rxVar = this.X;
        if (rxVar != null) {
            rxVar.f27726r.setText(str);
            this.X.f27726r.setSelection(str.length());
        }
    }

    public final void x3() {
        float f7;
        if (this.R0 != 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.h20.d(this.f36118j0, com.google.android.gms.internal.play_billing.k3.C(f7, this.f36097f.e, 1.0f - T3(), 1.0f - this.f36081c.e));
        tw twVar = this.E0;
        if (twVar != null) {
            twVar.invalidate();
        }
    }

    public final void x4(float f7) {
        ay[] ayVarArr;
        this.f36082c0 = f7;
        for (ay ayVar : this.f36092e0) {
            xx xxVar = ayVar.f35443a;
            for (int i10 = 0; i10 < xxVar.getChildCount(); i10++) {
                View childAt = xxVar.getChildAt(i10);
                if (childAt != null && RecyclerView.R(childAt) >= ayVar.d.f11970f + 1) {
                    childAt.setAlpha(f7);
                }
            }
        }
    }

    public final void y3() {
        org.telegram.ui.Components.h20.d(this.f36128l0, com.google.android.gms.internal.play_billing.k3.C(this.f36075b.e, 1.0f - T3(), 1.0f - this.f36081c.e, this.d.e));
    }

    public final void y4(boolean z10, boolean z11) {
        if (this.f36092e0 != null && this.S1 != z10) {
            if (z10) {
                this.R1 = new ArrayList(P3(this.currentAccount, this.f36092e0[0].f35449s, this.W2, false));
            } else {
                this.R1 = null;
            }
            this.S1 = z10;
            ay ayVar = this.f36092e0[0];
            ayVar.d.G = z10;
            if (!z10 && z11) {
                if (ayVar.f35443a.b0()) {
                    this.f36092e0[0].f35443a.post(new sv(this, 9));
                } else {
                    this.f36092e0[0].d.l();
                }
            }
        }
    }

    @Override
    public final gh.d z() {
        return this.f36140n4;
    }

    public final void z3() {
        boolean z10;
        ai.ic icVar;
        if (!this.f36120j2 && ((icVar = this.K0) == null || icVar.getBackground() == null || this.K0.getAlpha() < 0.01f || this.K0.getVisibility() == 8)) {
            z10 = true;
        } else {
            z10 = false;
        }
        kg0 kg0Var = this.J3;
        if (kg0Var != null) {
            kg0Var.f38602a.v.a(z10, true);
        }
    }

    public final void z4(boolean z10) {
        ay ayVar;
        if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
            if (z10) {
                ay[] ayVarArr = this.f36092e0;
                if (ayVarArr != null && (ayVar = ayVarArr[0]) != null) {
                    ayVar.setLayerType(2, null);
                    this.f36092e0[0].setClipChildren(false);
                    this.f36092e0[0].setClipToPadding(false);
                    this.f36092e0[0].f35443a.setClipChildren(false);
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
            if (this.f36092e0 != null) {
                int i10 = 0;
                while (true) {
                    ay[] ayVarArr2 = this.f36092e0;
                    if (i10 >= ayVarArr2.length) {
                        break;
                    }
                    ay ayVar2 = ayVarArr2[i10];
                    if (ayVar2 != null) {
                        ayVar2.setLayerType(0, null);
                        ayVar2.setClipChildren(true);
                        ayVar2.setClipToPadding(true);
                        ayVar2.f35443a.setClipChildren(true);
                    }
                    i10++;
                }
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setLayerType(0, null);
            }
            tw twVar = this.E0;
            if (twVar != null) {
                twVar.setLayerType(0, null);
            }
            View view2 = this.fragmentView;
            if (view2 != null) {
                ((ViewGroup) view2).setClipChildren(true);
                this.fragmentView.requestLayout();
            }
        }
    }
}

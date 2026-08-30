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
public class oy extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, zf.b, xd.b, ug0 {
    public static boolean f36999u4;
    public static final boolean[] f37000v4 = new boolean[4];
    public static final org.telegram.ui.Components.kr0 f37001w4 = new org.telegram.ui.Components.kr0(3);
    public static float f37002x4;
    public org.telegram.ui.Components.qu0 A0;
    public org.telegram.ui.ActionBar.w0 A1;
    public ArrayList A2;
    public org.telegram.ui.Components.j5 A3;
    public boolean B;
    public gx B0;
    public final TextPaint B1;
    public String B2;
    public org.telegram.ui.Cells.o B3;
    public boolean C;
    public org.telegram.ui.Components.hs C0;
    public yw C1;
    public CharSequence C2;
    public jx C3;
    public TLRPC.RequestPeerType D;
    public boolean D0;
    public FrameLayout D1;
    public org.telegram.ui.Components.qq0 D2;
    public final xw D3;
    public long E;
    public float E0;
    public yw E1;
    public org.telegram.ui.Components.k41 E2;
    public final xw E3;
    public ValueAnimator F;
    public float F0;
    public FrameLayout F1;
    public final ArrayList F2;
    public sg0 F3;
    public ValueAnimator G;
    public float G0;
    public org.telegram.ui.Components.js G1;
    public boolean G2;
    public NotificationCenter.ObserversGroup G3;
    public boolean H;
    public eg.h0 H0;
    public org.telegram.ui.Components.is H1;
    public int H2;
    public NotificationCenter.ObserversGroup H3;
    public boolean I;
    public org.telegram.ui.Components.o70 I0;
    public org.telegram.ui.Cells.m I1;
    public int I2;
    public Drawable I3;
    public boolean J;
    public lx J0;
    public org.telegram.ui.Cells.z2 J1;
    public int J2;
    public int J3;
    public float K;
    public boolean K0;
    public org.telegram.ui.Cells.sa K1;
    public int K2;
    public boolean K3;
    public boolean L;
    public boolean L0;
    public Long L1;
    public int L2;
    public boolean L3;
    public int M;
    public long M0;
    public Long M1;
    public int M2;
    public AnimatorSet M3;
    public boolean N;
    public long N0;
    public th.i N1;
    public int N2;
    public boolean N3;
    public boolean O;
    public int O0;
    public ArrayList O1;
    public int O2;
    public zu O3;
    public org.telegram.ui.Components.ic P;
    public int P0;
    public boolean P1;
    public int P2;
    public String P3;
    public float Q;
    public int Q0;
    public org.telegram.ui.ActionBar.d2 Q1;
    public int Q2;
    public ArrayList Q3;
    public boolean R;
    public boolean R0;
    public boolean R1;
    public boolean R2;
    public boolean R3;
    public boolean S;
    public org.telegram.ui.Components.cd0 S0;
    public boolean S1;
    public int S2;
    public CharSequence S3;
    public boolean T;
    public org.telegram.ui.Cells.r2 T0;
    public long T1;
    public oy T2;
    public boolean T3;
    public ey U;
    public org.telegram.ui.Cells.r2 U0;
    public TLObject U1;
    public long U2;
    public float U3;
    public lf.n0 V;
    public boolean V0;
    public int V1;
    public TLRPC.Chat V2;
    public boolean V3;
    public a41 W;
    public boolean W0;
    public int W1;
    public TLRPC.ChatFull W2;
    public boolean W3;
    public org.telegram.ui.Components.k81 X;
    public final ArrayList X0;
    public boolean X1;
    public org.telegram.ui.Components.p9 X2;
    public ValueAnimator X3;
    public tf.g0 Y;
    public boolean Y0;
    public boolean Y1;
    public org.telegram.ui.Components.z8 Y2;
    public org.telegram.ui.Components.w40 Y3;
    public float Z;
    public boolean Z0;
    public boolean Z1;
    public long Z2;
    public TLRPC.FileLocation Z3;
    public final int f37003a;
    public ValueAnimator f37004a0;
    public boolean f37005a1;
    public int a2;
    public boolean f37006a3;
    public TLRPC.FileLocation f37007a4;
    public final xd.a f37008b;
    public ny[] f37009b0;
    public org.telegram.ui.ActionBar.i2 f37010b1;
    public boolean f37011b2;
    public boolean f37012b3;
    public org.telegram.ui.Components.ic f37013b4;
    public final xd.a f37014c;
    public org.telegram.ui.ActionBar.w0 f37015c0;
    public final Paint f37016c1;
    public String f37017c2;
    public AnimatorSet c3;
    public int f37018c4;
    public final xd.a d;
    public org.telegram.ui.ActionBar.w0 f37019d0;
    public ImageView f37020d1;
    public String f37021d2;
    public boolean f37022d3;
    public int f37023d4;
    public final xd.a e;
    public qy f37024e0;
    public NumberTextView f37025e1;
    public String f37026e2;
    public boolean f37027e3;
    public int f37028e4;
    public final xd.a f37029f;
    public boolean f37030f0;
    public final ArrayList f37031f1;
    public boolean f37032f2;
    public float f37033f3;
    public int f37034f4;
    public org.telegram.ui.ActionBar.w0 f37035g0;
    public org.telegram.ui.ActionBar.w0 f37036g1;
    public boolean f37037g2;
    public boolean f37038g3;
    public int f37039g4;
    public final xd.a h;
    public org.telegram.ui.ActionBar.w0 f37040h0;
    public org.telegram.ui.ActionBar.w0 f37041h1;
    public boolean f37042h2;
    public int f37043h3;
    public ug.i f37044h4;
    public org.telegram.ui.ActionBar.w0 f37045i0;
    public org.telegram.ui.ActionBar.w0 f37046i1;
    public boolean f37047i2;
    public boolean f37048i3;
    public final ng.e f37049i4;
    public org.telegram.ui.ActionBar.w0 f37050j0;
    public org.telegram.ui.ActionBar.w0 f37051j1;
    public boolean f37052j2;
    public boolean f37053j3;
    public final sg.d f37054j4;
    public org.telegram.ui.Components.mi0 f37055k0;
    public org.telegram.ui.ActionBar.g1 f37056k1;
    public String f37057k2;
    public org.telegram.ui.Components.ic f37058k3;
    public final sg.d f37059k4;
    public org.telegram.ui.ActionBar.g1 f37060l0;
    public org.telegram.ui.ActionBar.g1 l1;
    public String f37061l2;
    public final AnimationNotificationsLocker f37062l3;
    public final sg.c f37063l4;
    public ph.f3 m0;
    public org.telegram.ui.ActionBar.g1 f37064m1;
    public final MessagesStorage.TopicKey f37065m2;
    public boolean f37066m3;
    public final ng.a f37067m4;
    public final xd.a f37068n;
    public ph.f3 f37069n0;
    public org.telegram.ui.ActionBar.g1 f37070n1;
    public boolean f37071n2;
    public boolean f37072n3;
    public final ng.a f37073n4;
    public boolean f37074o0;
    public org.telegram.ui.ActionBar.g1 f37075o1;
    public boolean f37076o2;
    public boolean f37077o3;
    public final ng.a f37078o4;
    public boolean f37079p0;
    public org.telegram.ui.ActionBar.g1 f37080p1;
    public boolean f37081p2;
    public boolean f37082p3;
    public final ng.a f37083p4;
    public org.telegram.ui.Components.z10 f37084q0;
    public org.telegram.ui.ActionBar.g1 f37085q1;
    public boolean f37086q2;
    public float f37087q3;
    public ew f37088q4;
    public final xd.a f37089r;
    public org.telegram.ui.Components.z10 f37090r0;
    public float f37091r1;
    public boolean f37092r2;
    public ValueAnimator f37093r3;
    public final ArrayList f37094r4;
    public final xd.a f37095s;
    public ph.d f37096s0;
    public float f37097s1;
    public boolean f37098s2;
    public float f37099s3;
    public final RectF f37100s4;
    public wg.f f37101t0;
    public AnimatorSet f37102t1;
    public boolean f37103t2;
    public float f37104t3;
    public final RectF f37105t4;
    public int f37106u0;
    public float f37107u1;
    public boolean f37108u2;
    public float f37109u3;
    public final ch.i v;
    public final UndoView[] f37110v0;
    public ug.f f37111v1;
    public boolean f37112v2;
    public int f37113v3;
    public boolean f37114w;
    public nw f37115w0;
    public FrameLayout f37116w1;
    public boolean f37117w2;
    public boolean f37118w3;
    public int f37119x;
    public boolean f37120x0;
    public FrameLayout f37121x1;
    public boolean f37122x2;
    public boolean f37123x3;
    public boolean f37124y;
    public int f37125y0;
    public zw f37126y1;
    public boolean f37127y2;
    public Long f37128y3;
    public xx f37129z0;
    public org.telegram.ui.Components.qp0 f37130z1;
    public iy f37131z2;
    public Drawable f37132z3;

    public oy(Bundle bundle) {
        super(bundle);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f37003a = i10;
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        this.f37008b = new xd.a(1, this, nrVar, 350L, false);
        this.f37014c = new xd.a(2, this, nrVar, 350L, false);
        this.d = new xd.a(3, this, nrVar, 350L, false);
        this.e = new xd.a(4, this, nrVar, 350L, false);
        this.f37029f = new xd.a(5, this, nrVar, 350L, false);
        this.h = new xd.a(6, this, nrVar, 350L, false);
        this.f37068n = new xd.a(7, this, nrVar, 350L, false);
        this.f37089r = new xd.a(8, this, nrVar, 350L, false);
        this.f37095s = new xd.a(9, this, nrVar, 350L, false);
        this.v = new ch.i(new dw(this, 1));
        this.f37119x = -1;
        this.C = true;
        this.H = false;
        this.I = false;
        this.J = false;
        this.N = true;
        this.Z = 1.0f;
        this.f37110v0 = new UndoView[2];
        this.X0 = new ArrayList();
        this.f37016c1 = new Paint();
        this.f37031f1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.B1 = new TextPaint(1);
        this.R1 = true;
        this.Z1 = true;
        this.f37032f2 = true;
        this.f37065m2 = new MessagesStorage.TopicKey();
        this.F2 = new ArrayList();
        this.G2 = true;
        this.f37062l3 = new AnimationNotificationsLocker();
        this.f37113v3 = -1;
        this.D3 = new xw(this, 0);
        this.E3 = new xw(this, 1);
        this.J3 = -4;
        this.K3 = true;
        this.L3 = true;
        this.U3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.f37094r4 = arrayList;
        RectF rectF = new RectF();
        this.f37100s4 = rectF;
        RectF rectF2 = new RectF();
        this.f37105t4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        sg.c cVar = new sg.c();
        this.f37063l4 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
        if (i11 >= 31) {
            this.f37049i4 = new ng.e(false);
            sg.d dVar = new sg.d(null);
            this.f37054j4 = dVar;
            dVar.j(new tx(this, 0));
            sg.d dVar2 = new sg.d(null);
            this.f37059k4 = dVar2;
            dVar2.j(new tx(this, 3));
            ng.a aVar = new ng.a(dVar);
            this.f37067m4 = aVar;
            aVar.f14972f = LiteMode.isEnabled(262144);
            ng.a aVar2 = new ng.a(dVar2);
            this.f37078o4 = aVar2;
            aVar2.f14972f = LiteMode.isEnabled(262144);
            this.f37073n4 = new ng.a(dVar);
        } else {
            this.f37049i4 = null;
            this.f37054j4 = null;
            this.f37059k4 = null;
            this.f37067m4 = new ng.a(cVar);
            this.f37078o4 = new ng.a(cVar);
            this.f37073n4 = new ng.a(cVar);
        }
        this.f37083p4 = new ng.a(cVar);
    }

    public static void A0(Activity activity, Boolean bool) {
        if (!bool.booleanValue()) {
            return;
        }
        if (!org.telegram.ui.Components.ge0.c()) {
            org.telegram.ui.Components.ge0.h();
        } else {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
        }
    }

    public static void B0(oy oyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(oyVar.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(oyVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new ba(oyVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void C0(oy oyVar) {
        MessagesController.getInstance(oyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        oyVar.U4();
        org.telegram.ui.Components.ic J = org.telegram.ui.Components.qc.a0(oyVar).J(R.raw.chats_infotip, LocaleController.getString(R.string.BirthdaySetupLater), LocaleController.getString(R.string.Settings), new mv(oyVar, 1));
        J.f25672j = 5000;
        J.j();
    }

    public static void D0(oy oyVar) {
        boolean z4 = true;
        try {
            ((org.telegram.ui.Components.gj0) ((org.telegram.ui.Components.z8) oyVar.J1.h.getImageReceiver().getStaticThumb()).B).F(true);
        } catch (Exception unused) {
        }
        if (oyVar.Y3 == null) {
            org.telegram.ui.Components.w40 w40Var = new org.telegram.ui.Components.w40(0, true, true);
            oyVar.Y3 = w40Var;
            w40Var.E = true;
            w40Var.f30190a = oyVar;
            w40Var.f30191b = new cy(oyVar);
            oyVar.getMediaDataController().checkFeaturedStickers();
            oyVar.getMessagesController().loadSuggestedFilters();
            oyVar.getMessagesController().loadUserInfo(oyVar.getUserConfig().getCurrentUser(), true, oyVar.classGuid);
        }
        TLRPC.User user = MessagesController.getInstance(oyVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(oyVar.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(oyVar.currentAccount).getCurrentUser();
        }
        if (user != null) {
            org.telegram.ui.Components.li liVar = oyVar.Y3.f30192c;
            if (liVar != null) {
                liVar.c1();
            }
            org.telegram.ui.Components.w40 w40Var2 = oyVar.Y3;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            w40Var2.o((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : false, new mv(oyVar, 0), new nv(oyVar, 0), 0);
        }
    }

    public static void E0(oy oyVar, float f10, ValueAnimator valueAnimator) {
        oyVar.f37009b0[0].setTranslationY((1.0f - oyVar.f37087q3) * f10);
        oyVar.f37087q3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i10 = 0; i10 < oyVar.actionBar.getChildCount(); i10++) {
            if (oyVar.actionBar.getChildAt(i10).getVisibility() == 0 && oyVar.actionBar.getChildAt(i10) != oyVar.actionBar.getActionMode() && oyVar.actionBar.getChildAt(i10) != oyVar.actionBar.getBackButton()) {
                oyVar.actionBar.getChildAt(i10).setAlpha(1.0f - oyVar.f37087q3);
            }
        }
        oyVar.E3();
        oyVar.w3();
        View view = oyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void F0(oy oyVar) {
        org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(oyVar.getParentActivity(), oyVar.resourceProvider);
        qbVar.d(R.raw.email_check_inbox, new String[0]);
        qbVar.f28100b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
        org.telegram.ui.Components.ic.g(oyVar, qbVar, 2750).j();
        try {
            oyVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void G0(org.telegram.ui.oy r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oy.G0(org.telegram.ui.oy):void");
    }

    public static void H0(oy oyVar, BirthdayController.BirthdayState birthdayState) {
        if (birthdayState.today.size() == 1) {
            kh.h2 h2Var = new kh.h2(oyVar.getParentActivity(), oyVar.currentAccount, birthdayState.today.get(0).f19331id, null, null);
            h2Var.V(true);
            oyVar.showDialog(h2Var);
            return;
        }
        gg.v2.e0(0, birthdayState);
    }

    public static void I0(oy oyVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.ic M = org.telegram.ui.Components.qc.a0(oyVar).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
            M.f25672j = 5000;
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
            oyVar.getMessagesStorage().updateUserInfo(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (oyVar.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oyVar.getParentActivity(), 0, oyVar.resourceProvider);
                alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                oyVar.showDialog(alertDialog$Builder.f19503a);
                return;
            }
            return;
        }
        kh.a2.v(R.string.UnknownError, org.telegram.ui.Components.qc.a0(oyVar), R.raw.error, 36);
    }

    public static void J0(oy oyVar) {
        MessagesController.getInstance(oyVar.currentAccount).removeSuggestion(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        oyVar.U4();
    }

    public static void N2(oy oyVar, float f10) {
        float f11;
        float f12;
        int i10;
        int i11;
        float clamp = Utilities.clamp(oyVar.f37107u1 * 2.0f, 1.0f, 0.0f);
        gx gxVar = oyVar.B0;
        float f13 = (1.0f - oyVar.f37087q3) * f10 * oyVar.E0;
        float f14 = 1.0f - clamp;
        gxVar.setAlpha(f13 * f14);
        int i12 = 0;
        if (!oyVar.H && !oyVar.J) {
            if (oyVar.I) {
                oyVar.B0.setTranslationY((Math.max(oyVar.K, -oyVar.U3()) + (-AndroidUtilities.dp(81.0f))) - AndroidUtilities.dp(8.0f));
                oyVar.B0.setProgressToCollapse(1.0f);
                gx gxVar2 = oyVar.B0;
                gxVar2.setClipTop((int) (AndroidUtilities.statusBarHeight - gxVar2.getY()));
            }
            f11 = 1.0f - oyVar.E0;
            oyVar.actionBar.setTranslationY(0.0f);
        } else {
            float clamp2 = Utilities.clamp((-oyVar.K) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
            if (oyVar.f37087q3 == 1.0f) {
                clamp2 = 1.0f;
            }
            float clamp3 = Utilities.clamp(clamp2 / 0.5f, 1.0f, 0.0f);
            oyVar.B0.setClipTop(0);
            if (!oyVar.H && oyVar.J) {
                oyVar.B0.setTranslationY((-AndroidUtilities.dp(81.0f)) - AndroidUtilities.dp(8.0f));
                oyVar.B0.setProgressToCollapse(1.0f);
                f12 = oyVar.E0;
            } else {
                oyVar.B0.setTranslationY(((oyVar.Q / 2.0f) + (Math.max(oyVar.K, -oyVar.U3()) + oyVar.f37099s3)) - AndroidUtilities.dp(8.0f));
                oyVar.B0.l(clamp2, !oyVar.C3.c());
                if (!oyVar.J) {
                    f12 = oyVar.E0;
                } else {
                    f11 = 1.0f - clamp3;
                    oyVar.actionBar.setTranslationY(0.0f);
                }
            }
            f11 = 1.0f - f12;
            oyVar.actionBar.setTranslationY(0.0f);
        }
        float f15 = f11 * f14;
        if (f15 != 1.0f) {
            oyVar.actionBar.getTitlesContainer().setPivotY(AndroidUtilities.statusBarHeight);
            oyVar.actionBar.getTitlesContainer().setPivotX(AndroidUtilities.dp(20.0f));
            float f16 = (0.6f * f15) + 0.4f;
            oyVar.actionBar.getTitlesContainer().setScaleY(f16);
            oyVar.actionBar.getTitlesContainer().setScaleX(f16);
            oyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
            oyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-AndroidUtilities.dp(30.0f));
            oyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f16);
            oyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f16);
            float f17 = (1.0f - oyVar.f37087q3) * f15;
            oyVar.actionBar.getTitlesContainer().setAlpha(f17);
            FrameLayout titlesContainer = oyVar.actionBar.getTitlesContainer();
            int i13 = (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1));
            if (i13 > 0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            titlesContainer.setVisibility(i11);
            oyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f17);
            FrameLayout additionalSubTitleOverlayContainer = oyVar.actionBar.getAdditionalSubTitleOverlayContainer();
            if (i13 <= 0) {
                i12 = 4;
            }
            additionalSubTitleOverlayContainer.setVisibility(i12);
            return;
        }
        oyVar.actionBar.getTitlesContainer().setScaleY(1.0f);
        oyVar.actionBar.getTitlesContainer().setScaleX(1.0f);
        oyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
        oyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
        float f18 = 1.0f - oyVar.f37087q3;
        oyVar.actionBar.getTitlesContainer().setAlpha(f18);
        FrameLayout titlesContainer2 = oyVar.actionBar.getTitlesContainer();
        int i14 = (f18 > 0.0f ? 1 : (f18 == 0.0f ? 0 : -1));
        if (i14 > 0) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        titlesContainer2.setVisibility(i10);
        oyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f18);
        FrameLayout additionalSubTitleOverlayContainer2 = oyVar.actionBar.getAdditionalSubTitleOverlayContainer();
        if (i14 <= 0) {
            i12 = 4;
        }
        additionalSubTitleOverlayContainer2.setVisibility(i12);
    }

    public static void O2(oy oyVar, Canvas canvas, int i10) {
        org.telegram.ui.ActionBar.e5 e5Var;
        if (oyVar.parentLayout != null && oyVar.actionBar != null) {
            float max = Math.max(oyVar.e.e, oyVar.V3());
            float f10 = 1.0f;
            float f11 = 1.0f - oyVar.f37107u1;
            float f12 = max * f11 * f11;
            int i11 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
            if (i11 != 0) {
                if (-1 >= i10) {
                    i10 = -1;
                    f10 = 0.0f;
                }
                if (f10 > 0.0f && i11 > 0 && i10 > 0 && (e5Var = oyVar.parentLayout) != null) {
                    ((ActionBarLayout) e5Var).p(canvas, (int) (f10 * 255.0f * f12), i10);
                }
            }
        }
    }

    public static org.telegram.ui.Cells.r2 Q3(ny nyVar) {
        ky kyVar = nyVar.f36741a;
        for (int i10 = 0; i10 < kyVar.getChildCount(); i10++) {
            View childAt = kyVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.r2) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                if (r2Var.P()) {
                    return r2Var;
                }
            }
        }
        return null;
    }

    public static void U(oy oyVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        MessagesController.getInstance(oyVar.currentAccount).removeSuggestion(0L, tL_pendingSuggestion.suggestion);
        oyVar.U4();
    }

    public static void V(oy oyVar, float f10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        oyVar.f37087q3 = floatValue;
        oyVar.f37009b0[0].setTranslationY((-f10) * floatValue);
        for (int i10 = 0; i10 < oyVar.actionBar.getChildCount(); i10++) {
            if (oyVar.actionBar.getChildAt(i10).getVisibility() == 0 && oyVar.actionBar.getChildAt(i10) != oyVar.actionBar.getActionMode() && oyVar.actionBar.getChildAt(i10) != oyVar.actionBar.getBackButton()) {
                oyVar.actionBar.getChildAt(i10).setAlpha(1.0f - oyVar.f37087q3);
            }
        }
        View view = oyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        oyVar.E3();
        oyVar.w3();
    }

    public static void X(oy oyVar) {
        ArrayList arrayList = oyVar.F2;
        org.telegram.ui.ActionBar.e5 e5Var = oyVar.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).y()) {
            oyVar.finishPreviewFragment();
        } else if (oyVar.O0 == 10) {
            if (oyVar.f37131z2 != null && !arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i10)).longValue(), 0L));
                }
                oyVar.f37131z2.w(oyVar, arrayList2, null, false, oyVar.G2, oyVar.H2, oyVar.I2, null);
            }
        } else if (MessagesController.getInstance(oyVar.currentAccount).isFrozen()) {
            c.b(oyVar.currentAccount);
        } else {
            oyVar.presentFragment(new ContactsActivity(android.support.v4.media.a.i("destroyAfterSelect", true)));
        }
    }

    public static void Y(oy oyVar) {
        MessagesController.getInstance(oyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
        oyVar.U4();
    }

    public static void Z(oy oyVar) {
        PasskeysActivity.a0(oyVar.currentAccount, oyVar.getParentActivity(), oyVar.resourceProvider, true);
    }

    public static void a0(oy oyVar, int i10, org.telegram.ui.Components.o70 o70Var) {
        CharSequence charSequence;
        if (oyVar.currentAccount != i10) {
            o70Var.u();
            if (oyVar.getParentActivity() == null) {
                return;
            }
            iy iyVar = oyVar.f37131z2;
            LaunchActivity launchActivity = (LaunchActivity) oyVar.getParentActivity();
            ArrayList arrayList = oyVar.A2;
            String str = oyVar.B2;
            CharSequence charSequence2 = oyVar.C2;
            zw zwVar = oyVar.f37126y1;
            if (zwVar != null) {
                charSequence = zwVar.getFieldText();
            } else {
                charSequence = null;
            }
            launchActivity.K0(i10);
            oy oyVar2 = new oy(oyVar.arguments);
            oyVar2.f37131z2 = iyVar;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList.isEmpty()) {
                    oyVar2.A2 = null;
                } else {
                    oyVar2.A2 = arrayList;
                    oyVar2.B2 = null;
                    if (oyVar2.f37126y1 != null) {
                        oyVar2.l3(charSequence);
                    } else {
                        oyVar2.S3 = charSequence;
                    }
                }
            } else if (str != null) {
                oyVar2.E4(charSequence, str);
            } else if (charSequence2 != null) {
                if (charSequence2.length() == 0) {
                    oyVar2.C2 = null;
                } else {
                    oyVar2.C2 = charSequence2;
                    oyVar2.B2 = null;
                    oyVar2.A2 = null;
                    if (oyVar2.f37126y1 != null) {
                        oyVar2.l3(charSequence);
                    } else {
                        oyVar2.S3 = charSequence;
                    }
                }
            }
            launchActivity.q0(oyVar2, false, true);
        }
    }

    public static void b0(oy oyVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(oyVar.currentAccount).getClientUserId());
        oyVar.presentFragment(new xn(bundle));
    }

    public static void c0(oy oyVar, TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = oyVar.getMessagesController().getUserFull(oyVar.getUserConfig().getClientUserId());
        if (userFull != null) {
            tL_birthday2 = userFull.birthday;
        } else {
            tL_birthday2 = null;
        }
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        oyVar.getMessagesController().invalidateContentSettings();
        oyVar.getConnectionsManager().sendRequest(updatebirthday, new ba(oyVar, userFull, tL_birthday2, 8), 1024);
        MessagesController.getInstance(oyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        oyVar.U4();
    }

    public static void d0(oy oyVar, String str) {
        MessagesController.getInstance(oyVar.currentAccount).removeSuggestion(0L, str);
        oyVar.U4();
    }

    public static void d4(xn xnVar, MessageObject messageObject) {
        CharSequence charSequence;
        if (messageObject != null && messageObject.hasHighlightedWords()) {
            try {
                if (!TextUtils.isEmpty(messageObject.caption)) {
                    charSequence = messageObject.caption;
                } else {
                    charSequence = messageObject.messageText;
                }
                CharSequence highlightText = AndroidUtilities.highlightText(charSequence, messageObject.highlightedWords, (org.telegram.ui.ActionBar.f6) null);
                if (highlightText instanceof SpannableStringBuilder) {
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) highlightText;
                    org.telegram.ui.Components.e10[] e10VarArr = (org.telegram.ui.Components.e10[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.e10.class);
                    if (e10VarArr.length > 0) {
                        int spanStart = spannableStringBuilder.getSpanStart(e10VarArr[0]);
                        int spanEnd = spannableStringBuilder.getSpanEnd(e10VarArr[0]);
                        for (int i10 = 1; i10 < e10VarArr.length; i10++) {
                            int spanStart2 = spannableStringBuilder.getSpanStart(e10VarArr[i10]);
                            int spanStart3 = spannableStringBuilder.getSpanStart(e10VarArr[i10]);
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
                        xnVar.mb(messageObject.getRealId(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void e0(oy oyVar, ny nyVar, View view, int i10) {
        int i11;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        if (view instanceof org.telegram.ui.Cells.u3) {
            return;
        }
        boolean z4 = view instanceof org.telegram.ui.Cells.r2;
        if (z4) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            if (r2Var.f21671k2) {
                oyVar.N4(r2Var.getDialogId(), view);
                return;
            }
        }
        if (oyVar.I3()) {
            oyVar.o4(view, i10, 0.0f, nyVar.d);
            return;
        }
        int i12 = oyVar.O0;
        if (i12 == 15 && (view instanceof org.telegram.ui.Cells.o8)) {
            nyVar.d.K();
            return;
        }
        int i13 = 0;
        if ((i12 == 11 || i12 == 13) && i10 == 1) {
            Bundle i14 = android.support.v4.media.a.i("forImport", true);
            i14.putLongArray("result", new long[]{oyVar.getUserConfig().getClientUserId()});
            i14.putInt("chatType", 4);
            String string = oyVar.arguments.getString("importTitle");
            if (string != null) {
                i14.putString("title", string);
            }
            e70 e70Var = new e70(i14);
            e70Var.V = new tw(oyVar);
            oyVar.presentFragment(e70Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.z2) && ((i11 = nyVar.f36747s) == 7 || i11 == 8)) {
            tf.i iVar = (tf.i) nyVar.d.J.get(0);
            if (iVar != null && iVar.f1808a == 17) {
                tL_chatlists_chatlistUpdates = iVar.f44749i;
            } else {
                tL_chatlists_chatlistUpdates = null;
            }
            if (tL_chatlists_chatlistUpdates != null) {
                MessagesController.DialogFilter dialogFilter = oyVar.getMessagesController().selectedDialogFilter[nyVar.f36747s - 7];
                if (dialogFilter != null) {
                    int i15 = dialogFilter.f16669id;
                    ?? saVar = new org.telegram.ui.Components.sa(oyVar, false);
                    saVar.V = -1;
                    saVar.Z = "";
                    saVar.f23782a0 = new ArrayList();
                    saVar.f23784c0 = "";
                    saVar.f23786e0 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    saVar.f23787f0 = arrayList;
                    saVar.f23803w0 = -1;
                    saVar.f23806z0 = -5;
                    saVar.V = i15;
                    saVar.X = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    saVar.f23785d0 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList<MessagesController.DialogFilter> arrayList2 = oyVar.getMessagesController().dialogFilters;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                break;
                            } else if (arrayList2.get(i13).f16669id == i15) {
                                saVar.Z = arrayList2.get(i13).name;
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                    saVar.S();
                    oyVar.showDialog(saVar);
                    return;
                }
                return;
            }
        } else if (z4 && !oyVar.actionBar.s() && !oyVar.C3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.r2) view).V1;
            AndroidUtilities.rectTmp.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        }
        oyVar.n4(view, i10, nyVar.d);
    }

    public static void f0(oy oyVar) {
        oyVar.presentFragment(new PrivacySettingsActivity());
        AndroidUtilities.scrollToFragmentRow(oyVar.parentLayout, "newChatsRow");
    }

    public static void f1(oy oyVar, boolean z4) {
        if (oyVar.f37009b0 != null && oyVar.K3 != z4) {
            oyVar.K3 = z4;
            int i10 = 0;
            while (true) {
                ny[] nyVarArr = oyVar.f37009b0;
                if (i10 < nyVarArr.length) {
                    if (z4) {
                        nyVarArr[i10].f36741a.setScrollbarFadingEnabled(false);
                    }
                    oyVar.f37009b0[i10].f36741a.setVerticalScrollBarEnabled(z4);
                    if (z4) {
                        oyVar.f37009b0[i10].f36741a.setScrollbarFadingEnabled(true);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public static void h0(oy oyVar, boolean z4, boolean z10, boolean z11, Activity activity) {
        if (oyVar.getParentActivity() != null) {
            oyVar.f37086q2 = false;
            if (z4 || z10 || z11) {
                oyVar.f37120x0 = true;
                if (z4 && vj0.n(activity)) {
                    org.telegram.ui.Components.ge0.g(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.an(1, new org.telegram.ui.Components.vk(12, oyVar, activity)));
                } else if (z10 && oyVar.R1 && oyVar.getUserConfig().syncContacts && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.z4.w(activity, new vv(oyVar, 0)).f19503a;
                    oyVar.Q1 = d2Var;
                    oyVar.showDialog(d2Var);
                } else if (z11 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    if (activity instanceof j5) {
                        org.telegram.ui.ActionBar.d2 v = ((j5) activity).v(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                        oyVar.Q1 = v;
                        oyVar.showDialog(v);
                    }
                } else {
                    oyVar.k3(true);
                }
            }
        }
    }

    public static void i0(oy oyVar) {
        if (oyVar.Y3.h()) {
            MessagesController.getInstance(oyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
            oyVar.U4();
        }
    }

    public static void i4(AccountInstance accountInstance) {
        int currentAccount = accountInstance.getCurrentAccount();
        boolean[] zArr = f37000v4;
        if (!zArr[currentAccount]) {
            MessagesController messagesController = accountInstance.getMessagesController();
            messagesController.loadGlobalNotificationsSettings();
            messagesController.loadDialogs(0, 0, 100, true);
            messagesController.loadHintDialogs();
            messagesController.loadUserInfo(accountInstance.getUserConfig().getCurrentUser(), false, 0);
            accountInstance.getContactsController().checkInviteText();
            accountInstance.getMediaDataController().checkAllMedia(false);
            AndroidUtilities.runOnUIThread(new zi(accountInstance, 18), 200L);
            Iterator<String> it = messagesController.diceEmojies.iterator();
            while (it.hasNext()) {
                accountInstance.getMediaDataController().loadStickersByEmojiOrName(it.next(), true, true);
            }
            zArr[currentAccount] = true;
        }
    }

    public static void k0(oy oyVar) {
        MessagesController.getInstance(oyVar.currentAccount).removeSuggestion(0L, "PREMIUM_GRACE");
        oyVar.U4();
    }

    public static void l0(oy oyVar) {
        MessagesController.getInstance(oyVar.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
        oyVar.U4();
    }

    public static void m0(oy oyVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        gg.y1 y1Var;
        try {
            d2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject != null) {
            oyVar.arguments.getString("importTitle");
            String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
            gg.y1 y1Var2 = new gg.y1(oyVar, j10, 20);
            Pattern pattern = org.telegram.ui.Components.z4.f31230a;
            if (oyVar.getParentActivity() != null) {
                if (chat != null || user != null) {
                    int currentAccount = oyVar.getCurrentAccount();
                    Activity parentActivity = oyVar.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
                    TextView textView = new TextView(parentActivity);
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20012j5, false));
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
                    org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
                    z8Var.u(AndroidUtilities.dp(12.0f));
                    org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(parentActivity);
                    p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                    if (LocaleController.isRTL) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    frameLayout.addView(p9Var, k7.b6.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(parentActivity);
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
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
                    boolean z4 = LocaleController.isRTL;
                    if (z4) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    int i17 = i13 | 48;
                    if (z4) {
                        i14 = 21;
                    } else {
                        i14 = 76;
                    }
                    float f10 = i14;
                    if (z4) {
                        i15 = 76;
                    } else {
                        i15 = 21;
                    }
                    frameLayout.addView(textView2, k7.b6.d(-1, -2.0f, i17, f10, 11.0f, i15, 0.0f));
                    if (!LocaleController.isRTL) {
                        i16 = 3;
                    }
                    frameLayout.addView(textView, k7.b6.d(-2, -2.0f, i16 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                    if (user != null) {
                        if (UserObject.isReplyUser(user)) {
                            z8Var.f31276p = 0.8f;
                            z8Var.g(12);
                            p9Var.h(null, null, z8Var, user);
                            y1Var = y1Var2;
                        } else {
                            y1Var = y1Var2;
                            if (user.f19331id == clientUserId) {
                                z8Var.f31276p = 0.8f;
                                z8Var.g(1);
                                p9Var.h(null, null, z8Var, user);
                            } else {
                                z8Var.f31276p = 1.0f;
                                z8Var.m(currentAccount, user);
                                p9Var.e(user, z8Var);
                            }
                        }
                    } else {
                        y1Var = y1Var2;
                        z8Var.k(currentAccount, chat);
                        p9Var.e(chat, z8Var);
                    }
                    textView.setText(AndroidUtilities.replaceTags(str));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Import), new org.telegram.ui.Components.t(y1Var, 3));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    oyVar.showDialog(alertDialog$Builder.f19503a);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.z4.f0(oyVar.currentAccount, tL_error, oyVar, tL_messages_checkHistoryImportPeer, new Object[0]);
        oyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j10), tL_messages_checkHistoryImportPeer, tL_error);
    }

    public static void n0(oy oyVar, int i10) {
        Object obj;
        TLRPC.User user;
        org.telegram.ui.Components.rn0 rn0Var = oyVar.f37129z0.f24328l0;
        if (i10 >= rn0Var.U && i10 < rn0Var.V) {
            org.telegram.ui.Components.i51 G = rn0Var.G(i10);
            if (G != null) {
                obj = G.G;
            } else {
                obj = null;
            }
        } else {
            obj = Boolean.FALSE;
        }
        if (obj instanceof TLRPC.User) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oyVar.getParentActivity(), 0, oyVar.resourceProvider);
            String string = LocaleController.getString(R.string.AppsClearSearch);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
            d2Var.O = string;
            d2Var.Q = LocaleController.formatString(R.string.AppsClearSearchAlert, "\"" + UserObject.getUserName(user) + "\"");
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new qs(4, oyVar, (TLRPC.User) obj));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        }
    }

    public static void o0(oy oyVar, int i10, ArrayList arrayList, boolean z4, HashSet hashSet) {
        HashSet hashSet2;
        if (i10 == 102) {
            oyVar.getMessagesController().setDialogsInTransaction(true);
            if (z4) {
                hashSet2 = hashSet;
            } else {
                hashSet2 = null;
            }
            oyVar.r4(arrayList, i10, false, false, hashSet2);
            oyVar.getMessagesController().setDialogsInTransaction(false);
            oyVar.getMessagesController().checkIfFolderEmpty(oyVar.S2);
            int i11 = oyVar.S2;
            if (i11 != 0 && oyVar.R3(oyVar.currentAccount, oyVar.f37009b0[0].f36747s, i11, false).size() == 0) {
                oyVar.f37009b0[0].f36741a.setEmptyView(null);
                oyVar.f37009b0[0].f36748w.setVisibility(4);
                oyVar.finishFragment();
                return;
            }
            return;
        }
        oyVar.r4(arrayList, i10, false, false, null);
    }

    public static void q0(oy oyVar) {
        String str;
        MessagesController messagesController = MessagesController.getInstance(oyVar.currentAccount);
        if (oyVar.f37123x3) {
            str = "PREMIUM_UPGRADE";
        } else {
            str = "PREMIUM_ANNUAL";
        }
        messagesController.removeSuggestion(0L, str);
        oyVar.U4();
    }

    public static void q1(oy oyVar, ny nyVar, float f10) {
        if (oyVar.Q != f10) {
            oyVar.Q = f10;
            int i10 = 0;
            int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i11 == 0) {
                oyVar.R = false;
            }
            oyVar.B0.setOverscroll(f10);
            nyVar.f36741a.setViewsOffset(f10);
            ky kyVar = nyVar.f36741a;
            if (i11 != 0) {
                i10 = 2;
            }
            kyVar.setOverScrollMode(i10);
            oyVar.fragmentView.invalidate();
            if (f10 > AndroidUtilities.dp(90.0f) && !oyVar.R) {
                gx gxVar = oyVar.B0;
                ValueAnimator valueAnimator = gxVar.E0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    gxVar.i(gxVar.m0, true);
                    oyVar.R = true;
                    oyVar.getOrCreateStoryViewer().s(new mv(oyVar, 18));
                }
            }
        }
    }

    public static void r0(Activity activity, Boolean bool) {
        if (!bool.booleanValue()) {
            return;
        }
        if (!org.telegram.ui.Components.ge0.c()) {
            org.telegram.ui.Components.ge0.h();
        } else {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
        }
    }

    public static boolean r1(oy oyVar, ny nyVar) {
        if (!oyVar.C3.c()) {
            int i10 = (int) (-oyVar.K);
            int T3 = oyVar.T3();
            int U3 = oyVar.U3();
            if (i10 != 0 && i10 != T3 && i10 != U3 && nyVar.f36741a.canScrollVertically(-1)) {
                if (U3 < i10 && i10 < T3) {
                    int dp = AndroidUtilities.dp(48.0f);
                    int i11 = i10 - U3;
                    if (i11 < dp / 2) {
                        nyVar.f36742b.x(-i11);
                        return true;
                    }
                    nyVar.f36742b.x(dp - i11);
                    return true;
                }
                float f10 = 1.0f;
                if (oyVar.f37087q3 != 1.0f) {
                    f10 = Utilities.clamp((-oyVar.K) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
                }
                if (f10 < oyVar.B0.f15788y0) {
                    nyVar.f36742b.x(-i10);
                    return true;
                }
                nyVar.f36742b.x(U3 - i10);
                return true;
            }
            return false;
        }
        return false;
    }

    public static void s0(oy oyVar) {
        c.c(oyVar.getParentActivity(), oyVar.currentAccount, oyVar.getResourceProvider());
    }

    public static String s2(oy oyVar) {
        String shortName;
        ArrayList arrayList = oyVar.F2;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() < 3) {
            StringBuilder sb = new StringBuilder();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                long longValue = ((Long) obj).longValue();
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                if (longValue == oyVar.getUserConfig().getClientUserId()) {
                    sb.append(LocaleController.getString(R.string.SavedMessages));
                } else {
                    if (arrayList.size() == 1) {
                        shortName = DialogObject.getName(oyVar.currentAccount, longValue);
                    } else {
                        shortName = DialogObject.getShortName(oyVar.currentAccount, longValue);
                    }
                    sb.append(shortName);
                }
            }
            return LocaleController.formatString(R.string.ShareSendToChats, sb.toString());
        }
        return LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]);
    }

    public static void t0(final int i10, final long j10, TLRPC.Chat chat, final oy oyVar, final boolean z4, final boolean z10) {
        final TLRPC.Chat chat2;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        int i14;
        oyVar.b4(false);
        if (i10 == 103 && ChatObject.isChannel(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || ChatObject.isPublic(chat2)) {
                oyVar.getMessagesController().deleteDialog(j10, 2, z10);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i10 == 102 && (i14 = oyVar.S2) != 0 && oyVar.R3(oyVar.currentAccount, oyVar.f37009b0[0].f36747s, i14, false).size() == 1) {
            oyVar.f37009b0[0].f36748w.setVisibility(4);
        }
        oyVar.f37113v3 = 3;
        int i15 = -1;
        if (i10 == 102) {
            oyVar.A4(true, true);
            if (oyVar.O1 != null) {
                i13 = 0;
                while (i13 < oyVar.O1.size()) {
                    if (((TLRPC.Dialog) oyVar.O1.get(i13)).f19188id == j10) {
                        break;
                    }
                    i13++;
                }
            }
            i13 = -1;
            oyVar.o3();
            i11 = i13;
        } else {
            i11 = -1;
        }
        UndoView Y3 = oyVar.Y3();
        if (Y3 != null) {
            if (i10 == 103) {
                i12 = 0;
            } else if (z10) {
                i12 = 1;
            } else {
                i12 = 95;
            }
            Y3.j(i12, j10, new Runnable() {
                @Override
                public final void run() {
                    oyVar.q4(i10, j10, chat2, z4, z10);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(oyVar.R3(oyVar.currentAccount, oyVar.f37009b0[0].f36747s, oyVar.S2, false));
        int i16 = 0;
        while (true) {
            if (i16 >= arrayList2.size()) {
                break;
            } else if (((TLRPC.Dialog) arrayList2.get(i16)).f19188id == j10) {
                i15 = i16;
                break;
            } else {
                i16++;
            }
        }
        if (i10 == 102) {
            if (i11 >= 0 && i15 < 0 && (arrayList = oyVar.O1) != null) {
                arrayList.remove(i11);
                oyVar.f37009b0[0].f36749x.D();
                oyVar.f37009b0[0].q(true);
                return;
            }
            oyVar.A4(false, true);
        }
    }

    public static void u0(oy oyVar) {
        BirthdayController.getInstance(oyVar.currentAccount).hide();
        MessagesController.getInstance(oyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_CONTACTS_TODAY");
        oyVar.U4();
        org.telegram.ui.Components.ic G = org.telegram.ui.Components.qc.a0(oyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f25672j = 5000;
        G.j();
    }

    public static void v0(oy oyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
            LaunchActivity.C0(launchActivity, oyVar.currentAccount, tL_attachMenuBot, null, true);
        } else {
            si1.a(oyVar.getParentActivity(), new jh(oyVar, tL_attachMenuBot, launchActivity), null);
        }
    }

    public static void w0(oy oyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.C0(launchActivity, oyVar.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(oyVar.currentAccount).updateAttachMenuBotsInCache();
    }

    public static void x0(oy oyVar) {
        MessagesController.getInstance(oyVar.currentAccount).removeSuggestion(0L, "PREMIUM_RESTORE");
        oyVar.U4();
    }

    public static void y0(oy oyVar) {
        if (!oyVar.L3) {
            ph.f3 f3Var = oyVar.f37069n0;
            if (f3Var != null) {
                if (f3Var.S) {
                    return;
                }
                AndroidUtilities.removeFromParent(f3Var);
            }
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.j6.Gi, 0, new dw(oyVar, 7));
            ph.f3 f3Var2 = new ph.f3(oyVar.getParentActivity(), 2);
            f3Var2.r(8.0f);
            f3Var2.d = 8000L;
            f3Var2.i();
            f3Var2.q(true);
            f3Var2.h = AndroidUtilities.displaySize.x - AndroidUtilities.dp(148.0f);
            f3Var2.t(replaceSingleTag);
            f3Var2.m(1.0f, -40.0f);
            f3Var2.h(oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
            oyVar.f37069n0 = f3Var2;
            f3Var2.setTranslationY((-oyVar.f37023d4) - oyVar.f37034f4);
            ((ViewGroup) oyVar.fragmentView).addView(oyVar.f37069n0, k7.b6.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
            oyVar.f37069n0.v();
            return;
        }
        ph.f3 f3Var3 = oyVar.m0;
        if (f3Var3 != null) {
            f3Var3.e(true);
        }
        nh.n6 o10 = MessagesController.getInstance(oyVar.currentAccount).getStoriesController().o();
        if (o10 != null && o10.a(oyVar.currentAccount, 1)) {
            oyVar.showDialog(new eg.v0(o10.b(), oyVar.currentAccount, oyVar.getParentActivity(), oyVar, null));
            return;
        }
        ph.da E = ph.da.E(oyVar.getParentActivity(), oyVar.currentAccount);
        E.f41546x = new tx(oyVar, 4);
        E.R(null);
    }

    public static void z0(oy oyVar) {
        MessagesController.getInstance(oyVar.currentAccount).removeSuggestion(0L, "PREMIUM_CHRISTMAS");
        oyVar.U4();
        org.telegram.ui.Components.ic G = org.telegram.ui.Components.qc.a0(oyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f25672j = 5000;
        G.j();
    }

    public final void A3() {
        org.telegram.ui.Components.z10.d(this.f37045i0, e2.c.z(this.f37008b.e, 1.0f - V3(), 1.0f - this.f37014c.e, this.d.e));
    }

    public final void A4(boolean z4, boolean z10) {
        if (this.f37009b0 != null && this.P1 != z4) {
            if (z4) {
                this.O1 = new ArrayList(R3(this.currentAccount, this.f37009b0[0].f36747s, this.S2, false));
            } else {
                this.O1 = null;
            }
            this.P1 = z4;
            ny nyVar = this.f37009b0[0];
            nyVar.d.D = z4;
            if (!z4 && z10) {
                if (nyVar.f36741a.b0()) {
                    this.f37009b0[0].f36741a.post(new dw(this, 8));
                } else {
                    this.f37009b0[0].d.l();
                }
            }
        }
    }

    @Override
    public final List B() {
        return Arrays.asList(new zf.a(LocaleController.getString(R.string.DebugDialogsActivity)), new zf.a(LocaleController.getString(R.string.ClearLocalDatabase), new mv(this, 27)), new zf.a(LocaleController.getString(R.string.DebugClearSendMessageAsPeers), new mv(this, 28)));
    }

    public final void B3() {
        boolean z4;
        eg.h0 h0Var;
        if (!this.f37037g2 && ((h0Var = this.H0) == null || h0Var.getBackground() == null || this.H0.getAlpha() < 0.01f || this.H0.getVisibility() == 8)) {
            z4 = true;
        } else {
            z4 = false;
        }
        sg0 sg0Var = this.F3;
        if (sg0Var != null) {
            sg0Var.f38337a.v.a(z4, true);
        }
    }

    public final void B4(boolean z4) {
        ny nyVar;
        if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
            if (z4) {
                ny[] nyVarArr = this.f37009b0;
                if (nyVarArr != null && (nyVar = nyVarArr[0]) != null) {
                    nyVar.setLayerType(2, null);
                    this.f37009b0[0].setClipChildren(false);
                    this.f37009b0[0].setClipToPadding(false);
                    this.f37009b0[0].f36741a.setClipChildren(false);
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
            if (this.f37009b0 != null) {
                int i10 = 0;
                while (true) {
                    ny[] nyVarArr2 = this.f37009b0;
                    if (i10 >= nyVarArr2.length) {
                        break;
                    }
                    ny nyVar2 = nyVarArr2[i10];
                    if (nyVar2 != null) {
                        nyVar2.setLayerType(0, null);
                        nyVar2.setClipChildren(true);
                        nyVar2.setClipToPadding(true);
                        nyVar2.f36741a.setClipChildren(true);
                    }
                    i10++;
                }
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setLayerType(0, null);
            }
            gx gxVar = this.B0;
            if (gxVar != null) {
                gxVar.setLayerType(0, null);
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
        org.telegram.ui.Components.z10.d(this.f37040h0, (1.0f - this.f37008b.e) * (1.0f - V3()) * (1.0f - this.f37014c.e));
        x3();
        A3();
        y3();
        z3();
    }

    public final void C4(float f10) {
        ny[] nyVarArr = this.f37009b0;
        int i10 = 0;
        if (nyVarArr != null) {
            int paddingTop = nyVarArr[0].f36741a.getPaddingTop() + ((int) f10);
            int i11 = 0;
            while (true) {
                ny[] nyVarArr2 = this.f37009b0;
                if (i11 >= nyVarArr2.length) {
                    break;
                }
                nyVarArr2[i11].f36741a.setTopGlowOffset(paddingTop);
                i11++;
            }
        }
        if (this.fragmentView != null && f10 != this.K) {
            this.K = f10;
            org.telegram.ui.Components.ic icVar = this.f37058k3;
            if (icVar != null) {
                icVar.l();
            }
            if (this.B3 != null) {
                float currentActionBarHeight = 1.0f - ((-f10) / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                org.telegram.ui.Cells.o oVar = this.B3;
                float f11 = (int) f10;
                float f12 = oVar.f21467f;
                oVar.h = f11;
                oVar.setTranslationY(f12 + f11);
                this.B3.setAlpha(k7.n.a(currentActionBarHeight, 0.0f, 1.0f));
                org.telegram.ui.Cells.o oVar2 = this.B3;
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
        this.U.f23815r.setContentDescription(string);
        this.U.f23815r.setHint(string);
    }

    public final void D4(float f10) {
        int i10;
        int i11;
        this.f37107u1 = f10;
        if (this.f37077o3 && this.actionBar != null) {
            if (this.S2 == 0 && this.U2 == 0) {
                i10 = org.telegram.ui.ActionBar.j6.f20227v8;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.O8;
            }
            int themedColor = getThemedColor(i10);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i12 = org.telegram.ui.ActionBar.j6.f20283y8;
            kVar.C(i0.a.d(this.f37107u1, themedColor, getThemedColor(i12)), false);
            this.actionBar.C(i0.a.d(this.f37107u1, getThemedColor(i12), getThemedColor(i12)), true);
            if (this.S2 == 0 && this.U2 == 0) {
                i11 = org.telegram.ui.ActionBar.j6.f20192t8;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.N8;
            }
            int themedColor2 = getThemedColor(i11);
            this.actionBar.B(i0.a.d(this.f37107u1, themedColor2, getThemedColor(org.telegram.ui.ActionBar.j6.f20300z8)), false);
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
        int i10;
        if (this.U == null) {
            return;
        }
        float a2 = 1.0f - k7.n.a(((-this.K) - U3()) / AndroidUtilities.dp(48.0f), 0.0f, 1.0f);
        float max = Math.max(this.f37087q3, this.h.e);
        float f11 = this.f37008b.e;
        if (this.O0 != 2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float max2 = f10 * (1.0f - this.f37014c.e) * (1.0f - max) * Math.max(f11, (1.0f - V3()) * a2);
        this.U.setAlpha(max2);
        ey eyVar = this.U;
        boolean z4 = false;
        if (max2 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        eyVar.setVisibility(i10);
        if (max2 <= 0.01f) {
            z4 = true;
        }
        this.f37029f.a(z4, true);
    }

    public final void E4(CharSequence charSequence, String str) {
        if (str != null && !str.isEmpty()) {
            this.B2 = str;
            this.C2 = null;
            this.A2 = null;
            if (this.f37126y1 != null) {
                l3(charSequence);
                return;
            } else {
                this.S3 = charSequence;
                return;
            }
        }
        this.B2 = null;
        this.C2 = null;
    }

    public final void F3() {
        int i10;
        float f10;
        int i11;
        int i12 = 8;
        if (this.W != null) {
            if (this.X != null) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float f11 = f10 * this.f37008b.e;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, f11);
            this.W.setScaleX(lerp);
            this.W.setScaleY(lerp);
            this.W.setAlpha(f11);
            a41 a41Var = this.W;
            if (f11 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            a41Var.setVisibility(i11);
        }
        org.telegram.ui.Components.k81 k81Var = this.X;
        xd.a aVar = this.f37095s;
        if (k81Var != null) {
            float f12 = 1.0f - aVar.e;
            k81Var.setAlpha(f12);
            org.telegram.ui.Components.k81 k81Var2 = this.X;
            if (f12 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            k81Var2.setVisibility(i10);
        }
        tf.g0 g0Var = this.Y;
        if (g0Var != null) {
            float f13 = aVar.e;
            g0Var.setAlpha(f13);
            tf.g0 g0Var2 = this.Y;
            if (f13 > 0.0f) {
                i12 = 0;
            }
            g0Var2.setVisibility(i12);
        }
    }

    public final void F4(float f10) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.U3 != f10) {
            boolean z4 = true;
            if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
                z4 = false;
            }
            this.V3 = z4;
            this.U3 = f10;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.V3) {
                float f11 = (1.0f - this.U3) * (-AndroidUtilities.dp(40.0f));
                gx gxVar = this.B0;
                if (gxVar != null) {
                    gxVar.setTranslationX(f11);
                }
                ey eyVar = this.U;
                if (eyVar != null) {
                    eyVar.setTranslationX(f11);
                }
                jx jxVar = this.C3;
                if (jxVar != null && jxVar.getFragmentView() != null && !this.f37124y) {
                    this.C3.getFragmentView().setTranslationX(f11);
                    return;
                }
                return;
            }
            float f12 = 1.0f - this.U3;
            float f13 = (-AndroidUtilities.dp(4.0f)) * f12;
            float f14 = 1.0f - (f12 * 0.05f);
            gx gxVar2 = this.B0;
            if (gxVar2 != null) {
                gxVar2.setScaleX(f14);
                this.B0.setScaleY(f14);
                this.B0.setTranslationX(f13);
                this.B0.setPivotX(0.0f);
                this.B0.setPivotY(0.0f);
            }
            ey eyVar2 = this.U;
            if (eyVar2 != null) {
                eyVar2.setTranslationX(f13);
                this.U.setScaleX(f14);
                this.U.setScaleY(f14);
            }
            jx jxVar2 = this.C3;
            if (jxVar2 != null && jxVar2.getFragmentView() != null) {
                if (!this.f37124y) {
                    this.C3.getFragmentView().setScaleX(f14);
                    this.C3.getFragmentView().setScaleY(f14);
                    this.C3.getFragmentView().setTranslationX(f13);
                }
                this.C3.getFragmentView().setPivotX(0.0f);
                this.C3.getFragmentView().setPivotY(0.0f);
            }
        }
    }

    public final void G3(boolean z4) {
        int i10;
        int i11;
        if (this.f37129z0 != null && this.actionBar != null) {
            int i12 = AndroidUtilities.navigationBarHeight;
            int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f37003a);
            if (this.X != null) {
                i10 = AndroidUtilities.dp(50.0f);
            } else {
                i10 = 0;
            }
            int i13 = measuredHeight + i10;
            org.telegram.ui.Components.js jsVar = this.G1;
            if (jsVar != null) {
                i11 = (int) jsVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i14 = i13 + i11;
            xx xxVar = this.f37129z0;
            SparseArray sparseArray = xxVar.h;
            xxVar.R0 = i14;
            xxVar.S0 = i12;
            lh.e1 e1Var = xxVar.S;
            if (z4) {
                e1Var.o1(0, i14, 0, i12);
            } else {
                e1Var.setPadding(0, i14, 0, i12);
            }
            xxVar.J0.j(xxVar.R0, xxVar.S0, z4);
            org.telegram.ui.Components.qn0 qn0Var = xxVar.T;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qn0Var.getLayoutParams();
            int i15 = marginLayoutParams.topMargin;
            int i16 = xxVar.R0;
            if (i15 != i16 || marginLayoutParams.bottomMargin != xxVar.S0) {
                marginLayoutParams.topMargin = i16;
                marginLayoutParams.bottomMargin = xxVar.S0;
                qn0Var.requestLayout();
            }
            org.telegram.ui.Components.do0.P(xxVar.f24319c0, xxVar.f24322f0, xxVar.R0, xxVar.S0, z4);
            org.telegram.ui.Components.do0.P(xxVar.f24324h0, xxVar.f24327k0, xxVar.R0, xxVar.S0, z4);
            org.telegram.ui.Components.do0.P(xxVar.f24330o0, xxVar.f24333r0, xxVar.R0, xxVar.S0, z4);
            org.telegram.ui.Components.eh0 eh0Var = xxVar.m0;
            int i17 = xxVar.R0;
            int i18 = xxVar.S0;
            eh0Var.setClipToPadding(false);
            org.telegram.ui.Components.g61 g61Var = eh0Var.f24578c;
            eh0Var.G = z4;
            eh0Var.setPadding(0, i17, 0, i18);
            if (z4) {
                g61Var.o1(0, i17, 0, i18);
            } else {
                g61Var.setPadding(0, i17, 0, i18);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) g61Var.getLayoutParams();
            marginLayoutParams2.topMargin = -i17;
            marginLayoutParams2.bottomMargin = -i18;
            eh0Var.G = false;
            org.telegram.ui.Components.dn0 dn0Var = xxVar.D0;
            if (dn0Var != null) {
                dn0Var.b(xxVar.R0, xxVar.S0, z4);
            }
            int size = sparseArray.size();
            for (int i19 = 0; i19 < size; i19++) {
                View view = (View) sparseArray.valueAt(i19);
                if (view instanceof t10) {
                    ((t10) view).j(xxVar.R0, xxVar.S0, z4);
                }
            }
            for (int i20 = 0; i20 < xxVar.getChildCount(); i20++) {
                if (xxVar.getChildAt(i20) instanceof t10) {
                    ((t10) xxVar.getChildAt(i20)).j(xxVar.R0, xxVar.S0, z4);
                }
            }
        }
    }

    public final void G4() {
        getContactsController().loadGlobalPrivacySetting();
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.k41(17, this, r0), new zi(r0, 17));
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(getParentActivity(), getResourceProvider());
        b3Var.c(q6Var);
        org.telegram.ui.ActionBar.g3 g3Var = b3Var.f19525a;
        g3Var.show();
        org.telegram.ui.ActionBar.g3[] g3VarArr = {g3Var};
        g3Var.fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.f19977h5));
    }

    public final void H3() {
        if (this.G1 != null) {
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, 1.0f);
            this.G1.setAlpha(1.0f);
            this.G1.setScaleX(lerp);
            this.G1.setScaleY(lerp);
            this.G1.setVisibility(0);
        }
    }

    public final boolean H4(org.telegram.ui.Cells.r2 r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oy.H4(org.telegram.ui.Cells.r2):boolean");
    }

    public boolean I3() {
        if (this.O0 == 10) {
            return true;
        }
        return false;
    }

    public final void I4(boolean z4) {
        float f10;
        this.f37014c.a(z4, true);
        if (this.f37050j0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.M3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M3 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.M3 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z4) {
            this.f37050j0.setVisibility(0);
        } else {
            this.f37050j0.setSelected(false);
            Drawable background = this.f37050j0.getBackground();
            if (background != null) {
                background.setState(StateSet.NOTHING);
                background.jumpToCurrentState();
            }
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.ActionBar.w0 w0Var = this.f37050j0;
        Property property = View.ALPHA;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(w0Var, property, f10));
        this.M3.playTogether(arrayList);
        this.M3.addListener(new px(this, z4, 1));
        this.M3.start();
    }

    public final void J3() {
        if (AndroidUtilities.isTablet()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.h(true);
            }
            TLObject tLObject = this.U1;
            if (tLObject != null) {
                xx xxVar = this.f37129z0;
                if (xxVar != null) {
                    xxVar.V.R(this.T1, tLObject);
                }
                this.U1 = null;
                return;
            }
            return;
        }
        this.S1 = true;
    }

    public final void J4() {
        if (!this.f37120x0 && getMessagesController().dialogFiltersLoaded && getMessagesController().showFiltersTooltip && this.f37115w0 != null && getMessagesController().getDialogFilters().isEmpty() && !this.isPaused && getUserConfig().filtersLoaded && !this.inPreviewMode) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("filterhint", false)) {
                globalMainSettings.edit().putBoolean("filterhint", true).apply();
                AndroidUtilities.runOnUIThread(new dw(this, 9), 1000L);
            }
        }
    }

    public final void K3() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.f20330k0) {
            kVar.h(true);
            this.f37066m3 = false;
            V4(true, true);
        }
    }

    public final void K4() {
        LaunchActivity launchActivity;
        boolean q10;
        int i10;
        int i11;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        LaunchActivity launchActivity2;
        CharSequence charSequence;
        org.telegram.ui.Components.k41 k41Var;
        int i12;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i13;
        int v02;
        int v03;
        int v04;
        int l1;
        CharSequence charSequence2;
        int i14;
        int v05;
        org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(this, this.f37040h0);
        int i15 = org.telegram.ui.ActionBar.j6.A8;
        H.S(getThemedColor(i15), getThemedColor(i15));
        H.f27489s = 8;
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) parentActivity;
        } else {
            launchActivity = null;
        }
        int i16 = 0;
        if (this.U2 != 0) {
            if (ChatObject.hasAdminRights(this.V2)) {
                H.c(R.drawable.msg_customize, LocaleController.getString(R.string.CommunityMenuSettings), new mv(this, 4), false);
                H.k();
            }
            H.i(new mv(this, 7), LocaleController.getString(R.string.CommunityMenuShowAsOneChat), this.V2.collapsed_in_dialogs);
            H.i(new mv(this, 8), LocaleController.getString(R.string.CommunityMenuShowAsSeparateChats), !this.V2.collapsed_in_dialogs);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        } else if (e4()) {
            H.c(R.drawable.msg_customize, LocaleController.getString(R.string.ArchiveSettings), new mv(this, 9), false);
            H.c(R.drawable.msg_help, LocaleController.getString(R.string.HowDoesItWork), new mv(this, 10), false);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        } else {
            org.telegram.ui.ActionBar.f6 f6Var2 = this.resourceProvider;
            if (f6Var2 != null) {
                q10 = f6Var2.a();
            } else {
                q10 = org.telegram.ui.ActionBar.j6.I.q();
            }
            if (q10) {
                i10 = R.drawable.menu_day_mode_24;
            } else {
                i10 = R.drawable.menu_night_mode_24;
            }
            if (q10) {
                i11 = R.string.SwitchThemeToDay;
            } else {
                i11 = R.string.SwitchThemeToNight;
            }
            H.c(i10, LocaleController.getString(i11), new mv(this, 11), false);
            H.k();
            H.c(R.drawable.outline_groups_24, LocaleController.getString(R.string.NewGroup), new mv(this, 12), false);
            H.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.SavedMessages), new mv(this, 13), false);
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
                        pv pvVar = new pv(this, tL_attachMenuBot2, launchActivity, 0);
                        org.telegram.ui.Components.k41 k41Var2 = new org.telegram.ui.Components.k41(16, this, tL_attachMenuBot2);
                        org.telegram.ui.ActionBar.f6 f6Var3 = H.d;
                        if (H.e != null) {
                            int i18 = org.telegram.ui.ActionBar.j6.F8;
                            int i19 = org.telegram.ui.ActionBar.j6.E8;
                            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(0, H.e, H.d, false, false);
                            g1Var2.setPadding(AndroidUtilities.dp(18.0f), i16, AndroidUtilities.dp(18.0f), i16);
                            if (tL_attachMenuBot2.side_menu_disclaimer_needed) {
                                charSequence = org.telegram.ui.Cells.o8.a(tL_attachMenuBot2.short_name);
                            } else {
                                charSequence = tL_attachMenuBot2.short_name;
                            }
                            TLRPC.TL_attachMenuBotIcon sideAttachMenuBotIcon = MediaDataController.getSideAttachMenuBotIcon(tL_attachMenuBot2);
                            if (sideAttachMenuBotIcon != null) {
                                launchActivity2 = launchActivity;
                                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(sideAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.j6.f19889c7, 1.0f);
                                if (svgThumb != null) {
                                    Integer num = H.f27476k0;
                                    if (num != null) {
                                        v05 = num.intValue();
                                    } else {
                                        v05 = org.telegram.ui.ActionBar.j6.v0(i18, f6Var3);
                                    }
                                    charSequence2 = charSequence;
                                    svgThumb.setColorFilter(new PorterDuffColorFilter(v05, PorterDuff.Mode.SRC_IN));
                                } else {
                                    charSequence2 = charSequence;
                                }
                                i12 = i19;
                                k41Var = k41Var2;
                                i13 = i18;
                                g1Var = g1Var2;
                                f6Var = f6Var3;
                                g1Var.h(charSequence2, ImageLocation.getForDocument(sideAttachMenuBotIcon.icon), "24_24", svgThumb, tL_attachMenuBot2);
                                org.telegram.ui.Components.p9 p9Var = g1Var.h;
                                if (p9Var != null) {
                                    if (LocaleController.isRTL) {
                                        i14 = 5;
                                    } else {
                                        i14 = 3;
                                    }
                                    p9Var.setLayoutParams(k7.b6.e(24, 24, i14 | 16));
                                }
                            } else {
                                launchActivity2 = launchActivity;
                                k41Var = k41Var2;
                                i12 = i19;
                                g1Var = g1Var2;
                                f6Var = f6Var3;
                                CharSequence charSequence3 = charSequence;
                                i13 = i18;
                                g1Var.g(charSequence3, R.drawable.msg_bot, null);
                            }
                            Integer num2 = H.f27474j0;
                            if (num2 != null) {
                                v02 = num2.intValue();
                            } else {
                                v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
                            }
                            Integer num3 = H.f27476k0;
                            if (num3 != null) {
                                v03 = num3.intValue();
                            } else {
                                v03 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var);
                            }
                            g1Var.c(v02, v03);
                            Integer num4 = H.f27476k0;
                            if (num4 != null) {
                                v04 = num4.intValue();
                            } else {
                                v04 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var);
                            }
                            g1Var.setIconColorImage(v04);
                            Integer num5 = H.f27478l0;
                            if (num5 != null) {
                                l1 = num5.intValue();
                            } else {
                                l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
                            }
                            g1Var.setSelectorColor(l1);
                            g1Var.setOnClickListener(new org.telegram.ui.Components.w2(23, H, pvVar));
                            g1Var.setOnLongClickListener(new nh.f2(3, H, k41Var));
                            int i20 = H.S;
                            if (i20 > 0) {
                                g1Var.setMinimumWidth(AndroidUtilities.dp(i20));
                                H.r(g1Var, k7.b6.n(H.S, -2));
                            } else {
                                H.r(g1Var, k7.b6.n(-1, -2));
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
                H.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), new mv(this, 6), false);
            }
            org.telegram.ui.ActionBar.g1 g1Var3 = this.f37060l0;
            if (g1Var3 != null) {
                g1Var3.f19703b.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.ai));
                this.f37060l0.setOnClickListener(new org.telegram.ui.Components.rx0(15, this, H));
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", "");
                if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty())) {
                    H.k();
                    H.d(this.f37060l0);
                }
            }
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        }
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        int i11;
        int i12;
        int i13 = 8;
        if (i10 == 1) {
            C3();
            E3();
            H3();
            u3();
            F3();
            ey eyVar = this.U;
            xd.a aVar = this.f37008b;
            eyVar.setBlurredBackgroundVisibility(aVar.e);
            float b10 = lf.l0.b(aVar.e);
            org.telegram.ui.Components.p9 p9Var = this.X2;
            if (p9Var != null) {
                p9Var.setScaleX(b10);
                this.X2.setScaleY(b10);
                this.X2.setAlpha(b10);
                org.telegram.ui.Components.p9 p9Var2 = this.X2;
                if (b10 > 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                p9Var2.setVisibility(i12);
            }
            if (this.f37096s0 != null) {
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
                this.f37096s0.setScaleX(lerp);
                this.f37096s0.setScaleY(lerp);
                this.f37096s0.setAlpha(b10);
                ph.d dVar = this.f37096s0;
                int i14 = (b10 > 0.0f ? 1 : (b10 == 0.0f ? 0 : -1));
                if (i14 > 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                dVar.setVisibility(i11);
                this.f37101t0.setAlpha(b10);
                wg.f fVar = this.f37101t0;
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

    public final void L3(String str) {
        int i10;
        if (this.actionBar.a(str)) {
            return;
        }
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(str);
        boolean z4 = this.T;
        ArrayList arrayList = this.f37031f1;
        if (z4) {
            ImageView imageView = new ImageView(getParentActivity());
            this.f37020d1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f37020d1.setImageDrawable(new org.telegram.ui.ActionBar.i2(true));
            this.f37020d1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.f20283y8), PorterDuff.Mode.MULTIPLY));
            this.f37020d1.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(org.telegram.ui.ActionBar.j6.f20300z8), 1, -1));
            this.f37020d1.setOnClickListener(new rv(this, 6));
            j10.addView(this.f37020d1, k7.b6.q(54, 54, 16));
            arrayList.add(this.f37020d1);
        }
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.f37025e1 = numberTextView;
        numberTextView.setTextSize(18);
        this.f37025e1.setTypeface(AndroidUtilities.bold());
        this.f37025e1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20283y8));
        NumberTextView numberTextView2 = this.f37025e1;
        if (this.T) {
            i10 = 18;
        } else {
            i10 = 72;
        }
        j10.addView(numberTextView2, k7.b6.m(1.0f, 0, -1, i10, 0, 0));
        this.f37025e1.setOnTouchListener(new oh.d(2));
        this.f37041h1 = j10.g(100, R.drawable.msg_pin, AndroidUtilities.dp(48.0f));
        this.f37046i1 = j10.g(104, R.drawable.msg_mute, AndroidUtilities.dp(48.0f));
        this.f37051j1 = j10.g(107, R.drawable.msg_archive, AndroidUtilities.dp(48.0f));
        this.f37036g1 = j10.h(102, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(48.0f));
        org.telegram.ui.ActionBar.w0 h = j10.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(48.0f));
        j10.addView(new View(getParentActivity()), k7.b6.n(5, -1));
        this.f37070n1 = h.e(105, R.drawable.msg_archive, LocaleController.getString(R.string.Archive));
        this.f37056k1 = h.e(108, R.drawable.msg_pin, LocaleController.getString(R.string.DialogPin));
        this.l1 = h.e(109, R.drawable.msg_addfolder, LocaleController.getString(R.string.FilterAddTo));
        this.f37064m1 = h.e(110, R.drawable.msg_removefolder, LocaleController.getString(R.string.FilterRemoveFrom));
        this.f37080p1 = h.e(101, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
        this.f37075o1 = h.e(103, R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory));
        this.f37085q1 = h.e(106, R.drawable.msg_block, LocaleController.getString(R.string.BlockUser));
        this.f37046i1.setOnLongClickListener(new zv(this, 0));
        arrayList.add(this.f37041h1);
        arrayList.add(this.f37051j1);
        arrayList.add(this.f37046i1);
        arrayList.add(this.f37036g1);
        arrayList.add(h);
        T4(false);
    }

    public final void L4() {
        if (this.P3 == null) {
            for (String str : getMessagesController().pendingSuggestions) {
                if ("AUTOARCHIVE_POPULAR".equals(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.HideNewChatsAlertTitle);
                    alertDialog$Builder.f19503a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.HideNewChatsAlertText));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.GoToSettings), new sv(this, 6));
                    showDialog(alertDialog$Builder.f19503a, new nv(this, 1));
                    this.P3 = str;
                    return;
                }
            }
        }
    }

    public final void M3() {
        int i10;
        xx xxVar = this.f37129z0;
        if ((xxVar != null && xxVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        if (this.f37057k2 != null) {
            i10 = 2;
        } else if (!this.f37047i2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        xx xxVar2 = new xx(this, getParentActivity(), this, i10, this.O0, this.S2, this.U2, new tx(this, 1));
        this.f37129z0 = xxVar2;
        ((hy) this.fragmentView).addView(xxVar2, this.f37125y0);
        xx xxVar3 = this.f37129z0;
        xxVar3.V.R = new zx(this);
        xxVar3.f24322f0.setOnItemClickListener(new sv(this, 1));
        this.f37129z0.f24327k0.setOnItemClickListener(new sv(this, 2));
        this.f37129z0.f24333r0.setOnItemClickListener(new wv(this, 0));
        this.f37129z0.f24327k0.setOnItemLongClickListener(new sv(this, 3));
        this.f37129z0.S.setOnItemClickListener(new sv(this, 4));
        this.f37129z0.S.setOnItemLongClickListener(new tx(this, 2));
        this.f37129z0.setFilteredSearchViewDelegate(new sv(this, 5));
        this.f37129z0.setAlpha(0.0f);
        this.f37129z0.setScaleX(1.05f);
        this.f37129z0.setScaleY(1.05f);
        this.f37129z0.setVisibility(8);
        this.f37129z0.setBlurredBackgroundDrawableFactory(this.f37073n4);
    }

    public final void M4(long j10, View view) {
        ArrayList<TLRPC.Dialog> R3;
        int i10;
        i3(j10, view);
        boolean s6 = this.actionBar.s();
        ArrayList arrayList = this.F2;
        boolean z4 = true;
        if (s6) {
            if (arrayList.isEmpty()) {
                b4(true);
                return;
            }
        } else {
            if (this.f37066m3) {
                L3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.f5)) {
                    yh.z(false, this.actionBar);
                }
            } else {
                L3(null);
            }
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
            this.actionBar.O(null, null);
            int i11 = this.f37009b0[0].f36747s;
            if ((i11 != 7 && i11 != 8) || (this.actionBar.s() && !this.actionBar.t(null))) {
                R3 = getMessagesController().getDialogs(this.S2);
            } else {
                R3 = R3(this.currentAccount, this.f37009b0[0].f36747s, this.S2, this.P1);
            }
            int size = R3.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.Dialog dialog = R3.get(i13);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (g4(dialog)) {
                        i12++;
                    } else if (!getMessagesController().isPromoDialog(dialog.f19188id, false)) {
                        break;
                    }
                }
            }
            if (i12 > 1) {
                if (this.f37009b0 != null) {
                    int i14 = 0;
                    while (true) {
                        ny[] nyVarArr = this.f37009b0;
                        if (i14 >= nyVarArr.length) {
                            break;
                        }
                        nyVarArr[i14].d.E = true;
                        i14++;
                    }
                }
                g5(MessagesController.UPDATE_MASK_REORDER, true);
            }
            if (!this.f37066m3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f37031f1;
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
            ValueAnimator valueAnimator = this.f37093r3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f37093r3 = ValueAnimator.ofFloat(this.f37087q3, 1.0f);
            int i16 = 0;
            while (true) {
                ny[] nyVarArr2 = this.f37009b0;
                if (i16 >= nyVarArr2.length) {
                    break;
                }
                ny nyVar = nyVarArr2[i16];
                if (nyVar != null) {
                    nyVar.f36741a.I0(true);
                }
                i16++;
            }
            if (this.H) {
                i10 = 81;
            } else {
                i10 = 0;
            }
            float max = Math.max(0.0f, AndroidUtilities.dp(i10 + 48) + this.K);
            if (max != 0.0f) {
                this.M = (int) max;
                this.fragmentView.requestLayout();
            }
            this.f37093r3.addUpdateListener(new tv(this, max, 0));
            this.f37093r3.addListener(new rx(this, max, 1));
            this.f37093r3.setInterpolator(org.telegram.ui.Components.nr.f27346f);
            this.f37093r3.setDuration(200L);
            this.f37093r3.start();
            nw nwVar = this.f37115w0;
            if (nwVar != null) {
                nwVar.b(org.telegram.ui.ActionBar.j6.Gh, org.telegram.ui.ActionBar.j6.Fh, org.telegram.ui.ActionBar.j6.Eh, org.telegram.ui.ActionBar.j6.Hh, org.telegram.ui.ActionBar.j6.f20246w8);
            }
            org.telegram.ui.ActionBar.i2 i2Var = this.f37010b1;
            if (i2Var != null) {
                i2Var.c(1.0f, true);
            }
            z4 = false;
        }
        T4(false);
        this.f37025e1.a(arrayList.size(), z4);
    }

    public final void N3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.f37110v0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                undoViewArr[i10] = new sx(this, parentActivity);
                FrameLayout.LayoutParams d = k7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.f37023d4 + this.f37034f4 + d.bottomMargin;
                UndoView undoView = undoViewArr[i10];
                int i11 = this.f37106u0 + 1;
                this.f37106u0 = i11;
                ((hy) this.fragmentView).addView(undoView, i11, d);
            }
        }
    }

    public final void N4(long j10, View view) {
        String str;
        org.telegram.ui.Components.ic J;
        int i10 = -this.J3;
        this.J3 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (j10 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)));
        } else {
            str = "";
        }
        if (getMessagesController().premiumFeaturesBlocked()) {
            J = org.telegram.ui.Components.qc.a0(this).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
        } else {
            J = org.telegram.ui.Components.qc.a0(this).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new mv(this, 22));
        }
        J.j();
    }

    public final void O3(final long j10, final long j11, boolean z4, final kf1 kf1Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String string;
        String formatStringSimple;
        String string2;
        String str;
        String str2;
        TLRPC.TL_forumTopic findTopic;
        if (p3(j10)) {
            int i10 = this.O0;
            if (i10 != 11 && i10 != 12 && i10 != 13) {
                if (z4 && ((this.f37017c2 != null && this.f37021d2 != null) || this.f37026e2 != null)) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        if (DialogObject.isEncryptedDialog(j10)) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(org.telegram.messenger.y3.n(getMessagesController(), j10).user_id));
                            if (user2 != null) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f37017c2, UserObject.getUserName(user2));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                return;
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            if (j10 == getUserConfig().getClientUserId()) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f37021d2, LocaleController.getString(R.string.SavedMessages));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j10));
                                if (user3 != null && this.f37017c2 != null) {
                                    str = LocaleController.getString(R.string.SendMessageTitle);
                                    str2 = LocaleController.formatStringSimple(this.f37017c2, UserObject.getUserName(user3));
                                    string2 = LocaleController.getString(R.string.Send);
                                } else {
                                    return;
                                }
                            }
                        } else {
                            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-j10));
                            if (chat2 != null) {
                                String str3 = chat2.title;
                                if (j11 != 0 && (findTopic = getMessagesController().getTopicsController().findTopic(chat2.f19184id, j11)) != null) {
                                    str3 = ((Object) str3) + " " + findTopic.title;
                                }
                                if (this.f37026e2 != null) {
                                    string = LocaleController.getString(R.string.AddToTheGroupAlertTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f37026e2, str3);
                                    string2 = LocaleController.getString(R.string.Add);
                                } else {
                                    string = LocaleController.getString(R.string.SendMessageTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f37021d2, str3);
                                    string2 = LocaleController.getString(R.string.Send);
                                }
                                String str4 = formatStringSimple;
                                str = string;
                                str2 = str4;
                            } else {
                                return;
                            }
                        }
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                        d2Var.O = str;
                        d2Var.Q = AndroidUtilities.replaceTags(str2);
                        alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.c2() {
                            @Override
                            public final void i(org.telegram.ui.ActionBar.d2 d2Var2, int i11) {
                                oy.this.O3(j10, j11, false, kf1Var);
                            }
                        });
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        if (showDialog(d2Var) == null) {
                            d2Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 15) {
                    Runnable vVar = new i5.v(this, j10, new i5.x(this, j10, j11, kf1Var, 13), 25);
                    if (j10 < 0) {
                        Q4(getMessagesController().getChat(Long.valueOf(-j10)), vVar, null);
                        return;
                    }
                    TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(j10));
                    TLRPC.User user5 = getMessagesController().getUser(Long.valueOf(this.E));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, UserObject.getFirstName(user4), UserObject.getFirstName(user5));
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19503a;
                    d2Var2.O = formatString;
                    d2Var2.Q = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, UserObject.getFirstName(user4), UserObject.getFirstName(user5))));
                    alertDialog$Builder2.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new fu(vVar, 1));
                    alertDialog$Builder2.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new org.telegram.ui.Components.kh0(19));
                    showDialog(d2Var2);
                    return;
                } else if (this.f37131z2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j10, j11));
                    if (this.f37131z2.w(this, arrayList, null, false, this.G2, this.H2, this.I2, kf1Var) && this.f37032f2) {
                        this.f37131z2 = null;
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
            org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
            TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
            tL_messages_checkHistoryImportPeer.peer = getMessagesController().getInputPeer(j10);
            getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new lh.x2(this, d2Var3, user, chat, j10, tL_messages_checkHistoryImportPeer));
            try {
                d2Var3.q(300L);
            } catch (Exception unused) {
            }
        }
    }

    public final void O4(boolean r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oy.O4(boolean, boolean, boolean, boolean):void");
    }

    public final void P3(long j10, boolean z4) {
        if (this.f37009b0 != null) {
            int i10 = 0;
            while (true) {
                ny[] nyVarArr = this.f37009b0;
                if (i10 < nyVarArr.length) {
                    int childCount = nyVarArr[i10].f36741a.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 < childCount) {
                            View childAt = this.f37009b0[i10].f36741a.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.r2) {
                                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                                if (r2Var.getDialogId() == j10) {
                                    r2Var.V(z4, true);
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
        if (this.J0 == null && !SharedConfig.appLocked && (!this.H || this.B0.g())) {
            g61[] g61VarArr = new g61[1];
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            org.telegram.ui.ActionBar.k5 titleTextView = this.actionBar.getTitleTextView();
            if (titleTextView != null && titleTextView.getRightDrawable() != null) {
                this.A3.f();
                Drawable drawable = this.A3.f25875f[0];
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(titleTextView.getRightDrawable().getBounds());
                rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
                int dp = (-(this.actionBar.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                i10 = AndroidUtilities.dp(4.0f) + (rect.centerX() - AndroidUtilities.dp(16.0f));
                org.telegram.ui.Cells.o oVar = this.B3;
                if (oVar != null) {
                    oVar.b(rect.centerX(), rect.centerY());
                }
                i11 = dp;
            } else {
                i10 = 0;
                i11 = 0;
            }
            kx kxVar = new kx(this, this, getParentActivity(), Integer.valueOf(i10), getResourceProvider(), g61VarArr);
            if (currentUser != null && DialogObject.getEmojiStatusUntil(currentUser.emoji_status) > 0) {
                kxVar.setExpireDateHint(DialogObject.getEmojiStatusUntil(currentUser.emoji_status));
            }
            Long l11 = this.f37128y3;
            if (l11 != null) {
                kxVar.setSelected(l11);
            } else {
                Drawable drawable2 = this.A3.f25875f[0];
                if (drawable2 instanceof org.telegram.ui.Components.l5) {
                    l10 = Long.valueOf(((org.telegram.ui.Components.l5) drawable2).i());
                } else {
                    l10 = null;
                }
                kxVar.setSelected(l10);
            }
            kxVar.setSaveState(1);
            kxVar.y(this.A3, titleTextView);
            lx lxVar = new lx(this, kxVar);
            this.J0 = lxVar;
            g61VarArr[0] = lxVar;
            lxVar.showAsDropDown(this.actionBar, AndroidUtilities.dp(16.0f), i11, 48);
            g61VarArr[0].b();
        }
    }

    public final void Q4(org.telegram.tgnet.TLRPC.Chat r14, java.lang.Runnable r15, java.lang.Runnable r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oy.Q4(org.telegram.tgnet.TLRPC$Chat, java.lang.Runnable, java.lang.Runnable):void");
    }

    public final java.util.ArrayList R3(int r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oy.R3(int, int, int, boolean):java.util.ArrayList");
    }

    public final void R4(boolean z4) {
        ny[] nyVarArr;
        char c3;
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            nyVarArr = this.f37009b0;
            if (i12 >= nyVarArr.length) {
                break;
            }
            nyVarArr[i12].f36741a.B0();
            i12++;
        }
        if (z4 && nyVarArr.length > 1) {
            c3 = 1;
        } else {
            c3 = 0;
        }
        int i13 = nyVarArr[c3].h;
        if (i13 >= 0 && i13 < getMessagesController().getDialogFilters().size()) {
            MessagesController.DialogFilter dialogFilter = getMessagesController().getDialogFilters().get(this.f37009b0[c3].h);
            if (dialogFilter.isDefault()) {
                ny nyVar = this.f37009b0[c3];
                nyVar.f36747s = this.O0;
                ky kyVar = nyVar.f36741a;
                int i14 = ky.f35832s3;
                kyVar.A1();
            } else {
                ny[] nyVarArr2 = this.f37009b0;
                if (nyVarArr2[c3 ^ 1].f36747s == 7) {
                    nyVarArr2[c3].f36747s = 8;
                } else {
                    nyVarArr2[c3].f36747s = 7;
                }
                nyVarArr2[c3].f36741a.setScrollEnabled(true);
                MessagesController messagesController = getMessagesController();
                if (this.f37009b0[c3].f36747s == 8) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                messagesController.selectDialogFilter(dialogFilter, i10);
            }
            ny[] nyVarArr3 = this.f37009b0;
            if (nyVarArr3.length > 1) {
                nyVarArr3[1].B = dialogFilter.locked;
            }
            ny nyVar2 = nyVarArr3[c3];
            ww wwVar = nyVar2.d;
            wwVar.h = nyVar2.f36747s;
            wwVar.l();
            ny nyVar3 = this.f37009b0[c3];
            sw swVar = nyVar3.f36743c;
            if (nyVar3.f36747s == 0 && Z3() && this.f37009b0[c3].v == 2) {
                i11 = 1;
            }
            swVar.h1(i11, (int) this.K);
            r3(this.f37009b0[c3]);
        }
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z4) {
        jx jxVar;
        eg.h0 h0Var;
        nw nwVar;
        boolean z10;
        boolean z11;
        if (!this.f37066m3 && (((jxVar = this.C3) == null || !jxVar.c()) && (((h0Var = this.H0) == null || h0Var.getVisibility() != 0) && ((nwVar = this.f37115w0) == null || !nwVar.f25830n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                nw nwVar2 = this.f37115w0;
                if (nwVar2 != null && nwVar2.getTabsCount() >= 2 && this.f37115w0.getCurrentTabId() != this.f37115w0.getFirstTabId()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                nw nwVar3 = this.f37115w0;
                if (nwVar3 != null && nwVar3.getTabsCount() >= 2 && this.f37115w0.getCurrentTabId() != this.f37115w0.getLastTabId()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                SharedConfig.getChatSwipeAction(this.currentAccount);
                if (z4) {
                    if (!z11 || z10) {
                    }
                } else {
                    return z10;
                }
            }
            return true;
        }
        return false;
    }

    public final float S3(boolean z4) {
        float f10;
        if (z4) {
            f10 = 1.0f - this.f37008b.e;
        } else {
            f10 = 1.0f;
        }
        return f10 * (1.0f - V3()) * this.f37089r.e;
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
        int i10;
        a41 a41Var = this.W;
        if (a41Var != null && a41Var.getVisibility() != 8) {
            f10 = this.W.getMeasuredHeight();
        } else {
            f10 = 0.0f;
        }
        if (this.H) {
            f11 = AndroidUtilities.dp(81.0f);
        } else {
            f11 = 0.0f;
        }
        if (this.H) {
            float f20 = this.K;
            float f21 = this.f37107u1;
            f12 = (f10 * f21) + e2.c.w(1.0f, f21, f11, f20);
            f13 = this.f37104t3;
        } else {
            f12 = (f10 * this.f37107u1) + this.K;
            f13 = this.f37104t3;
        }
        float f22 = f12 + f13 + this.Q;
        ey eyVar = this.U;
        if (eyVar != null && eyVar.getVisibility() == 0) {
            f14 = this.U.getAlpha();
        } else {
            f14 = 0.0f;
        }
        float dp = AndroidUtilities.dp(4.0f) * f14;
        nw nwVar = this.f37115w0;
        if (nwVar != null) {
            nwVar.setTranslationY(f22 - dp);
            f16 = this.f37115w0.getAlpha();
            f17 = AndroidUtilities.dp(43.0f) * f16;
            f15 = f22 + f17;
        } else {
            f15 = f22;
            f16 = 0.0f;
            f17 = 0.0f;
        }
        org.telegram.ui.Components.js jsVar = this.G1;
        if (jsVar != null) {
            float f23 = f15 - dp;
            int i11 = -AndroidUtilities.dp(3.0f);
            if (this.X == null) {
                i10 = AndroidUtilities.dp(44.0f);
            } else {
                i10 = 0;
            }
            jsVar.setTranslationY(AndroidUtilities.lerp(f23, i11 - i10, this.f37008b.e));
            f18 = this.G1.getMetadata().f46905c.f46913a;
            f19 = this.G1.c(0.0f);
        } else {
            f18 = 0.0f;
            f19 = 0.0f;
        }
        org.telegram.ui.Components.is isVar = this.H1;
        if (isVar != null) {
            isVar.setTranslationY(f22 - dp);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f), Math.min(f18, f16));
            org.telegram.ui.Components.is isVar2 = this.H1;
            float min = Math.min(AndroidUtilities.dp(40.0f), (f19 + f17) - lerp);
            Matrix matrix = isVar2.f25779b;
            if (isVar2.e != lerp || isVar2.f25781f != min) {
                isVar2.e = lerp;
                isVar2.f25781f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, lerp);
                LinearGradient linearGradient = isVar2.f25780c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                isVar2.invalidate();
            }
            this.H1.setAlpha(Math.max(f16, f18));
        }
    }

    public final int T3() {
        if (this.H) {
            return AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(81.0f);
        }
        return AndroidUtilities.dp(48.0f);
    }

    public final void T4(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oy.T4(boolean):void");
    }

    public final int U3() {
        if (this.H) {
            return AndroidUtilities.dp(81.0f);
        }
        return 0;
    }

    public final void U4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oy.U4():void");
    }

    public final float V3() {
        jx jxVar = this.C3;
        if (jxVar != null && jxVar.c()) {
            return this.C3.e;
        }
        return 0.0f;
    }

    public final void V4(boolean r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oy.V4(boolean, boolean):void");
    }

    public final float W3() {
        return -AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(48.0f), this.f37008b.e);
    }

    public final void W4(boolean r11, java.util.ArrayList r12, java.util.ArrayList r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oy.W4(boolean, java.util.ArrayList, java.util.ArrayList, boolean, boolean):void");
    }

    public final nh.t6 X3() {
        return getMessagesController().getStoriesController();
    }

    public final void X4() {
        float f10 = (((-this.f37023d4) - this.f37039g4) - this.f37091r1) - this.f37097s1;
        org.telegram.ui.Components.z10 z10Var = this.f37084q0;
        if (z10Var != null) {
            z10Var.setTranslationY(f10);
        }
        org.telegram.ui.Components.z10 z10Var2 = this.f37090r0;
        if (z10Var2 != null) {
            z10Var2.setTranslationY(f10 - AndroidUtilities.dp(52.0f));
            ph.f3 f3Var = this.m0;
            if (f3Var != null) {
                f3Var.setTranslationY(f10 - AndroidUtilities.dp(52.0f));
            }
        }
    }

    public final UndoView Y3() {
        N3();
        UndoView[] undoViewArr = this.f37110v0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.e(2, true);
            hy hyVar = (hy) this.fragmentView;
            hyVar.removeView(undoViewArr[0]);
            hyVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void Y4(boolean z4) {
        boolean z10;
        boolean z11 = this.f37047i2;
        if ((!z11 || this.O0 == 10) && this.S2 == 0 && this.U2 == 0 && !this.inPreviewMode && ((!this.f37037g2 || z11) && !this.R3)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.z10 z10Var = this.f37084q0;
        if (z10Var != null) {
            z10Var.e(z10, z4);
        }
        org.telegram.ui.Components.z10 z10Var2 = this.f37090r0;
        if (z10Var2 != null) {
            z10Var2.e(z10, z4);
        }
    }

    public final boolean Z3() {
        if (!this.f37047i2 && this.O0 == 0 && this.U2 == 0 && this.S2 == 0 && getMessagesController().hasHiddenArchive()) {
            return true;
        }
        return false;
    }

    public final void Z4(boolean z4, boolean z10) {
        boolean z11;
        int i10;
        if (this.f37055k0 != null) {
            org.telegram.ui.ActionBar.w0 w0Var = this.f37050j0;
            if (w0Var == null || w0Var.getVisibility() != 0) {
                boolean z12 = false;
                int i11 = 0;
                while (true) {
                    if (i11 < getDownloadController().downloadingFiles.size()) {
                        if (getFileLoader().isLoadingFile(getDownloadController().downloadingFiles.get(i11).getFileName())) {
                            z11 = true;
                            break;
                        }
                        i11++;
                    } else {
                        z11 = false;
                        break;
                    }
                }
                if (!getDownloadController().hasUnviewedDownloads() && !z11 && (this.f37019d0.getVisibility() != 0 || this.f37019d0.getAlpha() != 1.0f || z10)) {
                    this.f37030f0 = false;
                } else {
                    this.f37030f0 = true;
                }
                x3();
                boolean z13 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i12 = this.a2;
                z12 = (i12 == 3 || i12 == 5) ? true : true;
                org.telegram.ui.ActionBar.g1 g1Var = this.f37060l0;
                if (z13) {
                    if (z12) {
                        i10 = R.string.MenuProxyConnected;
                    } else {
                        i10 = R.string.MenuProxyConnecting;
                    }
                } else {
                    i10 = R.string.MenuProxyDisabled;
                }
                g1Var.setSubtext(LocaleController.getString(i10));
                this.f37055k0.b(z13, z12, z4);
            }
        }
    }

    public final boolean a4() {
        ArrayList arrayList = this.A2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void a5() {
        org.telegram.ui.Components.qq0 qq0Var;
        int i10;
        zw zwVar = this.f37126y1;
        ArrayList arrayList = this.F2;
        if (zwVar != null) {
            this.f37068n.a(!arrayList.isEmpty(), true);
            b5();
            if (arrayList.isEmpty()) {
                if (this.O0 == 3 && this.f37017c2 == null) {
                    i10 = R.string.ForwardTo;
                } else {
                    i10 = R.string.SelectChat;
                }
                String string = LocaleController.getString(i10);
                if (this.N3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(string);
                } else {
                    this.actionBar.I(string, true, 350L, org.telegram.ui.Components.nr.h);
                }
                if (this.f37126y1.getTag() != null) {
                    this.f37126y1.n0(false, false, false);
                    this.f37126y1.P();
                    this.f37126y1.setTag(null);
                    this.fragmentView.requestLayout();
                }
            } else {
                if (this.f37126y1.getTag() == null) {
                    if (!a4() && this.B2 == null) {
                        this.f37126y1.setFieldText("");
                    }
                    this.f37126y1.setTag(1);
                    if (!this.T3 && (qq0Var = this.D2) != null) {
                        this.T3 = true;
                        String string2 = LocaleController.getString(R.string.ShareTapToEditMedia);
                        qq0Var.j();
                        qq0Var.C = string2;
                        org.telegram.ui.Components.oq0 oq0Var = qq0Var.f28215a[0];
                        if (string2 != null) {
                            oq0Var.e.l(string2, false);
                        }
                        org.telegram.ui.Components.cc0 cc0Var = new org.telegram.ui.Components.cc0(qq0Var, 29);
                        qq0Var.D = cc0Var;
                        AndroidUtilities.runOnUIThread(cc0Var, 1000L);
                    }
                }
                this.f37130z1.g(Math.max(1, arrayList.size()), true);
                int i11 = this.P0 + (!TextUtils.isEmpty(this.f37126y1.getFieldText()) ? 1 : 0);
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
                this.f37130z1.i(i11, j10, true);
                this.f37126y1.R1();
                if (this.N3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]));
                } else {
                    this.actionBar.I(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]), false, 350L, org.telegram.ui.Components.nr.h);
                }
            }
            this.N3 = arrayList.isEmpty();
        } else if (this.O0 == 10) {
            c4(arrayList.isEmpty());
        }
    }

    public final void b4(boolean z4) {
        int i10;
        boolean z10;
        this.actionBar.r();
        this.F2.clear();
        org.telegram.ui.ActionBar.i2 i2Var = this.f37010b1;
        if (i2Var != null) {
            i2Var.c(0.0f, true);
        }
        nw nwVar = this.f37115w0;
        if (nwVar != null) {
            nwVar.b(org.telegram.ui.ActionBar.j6.K8, org.telegram.ui.ActionBar.j6.I8, org.telegram.ui.ActionBar.j6.J8, org.telegram.ui.ActionBar.j6.L8, org.telegram.ui.ActionBar.j6.f19906d6);
        }
        ValueAnimator valueAnimator = this.f37093r3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f37093r3 = null;
        }
        if (this.f37087q3 == 0.0f) {
            return;
        }
        C4(-T3());
        int i11 = 0;
        while (true) {
            ny[] nyVarArr = this.f37009b0;
            if (i11 >= nyVarArr.length) {
                break;
            }
            ny nyVar = nyVarArr[i11];
            if (nyVar != null) {
                nyVar.f36741a.I0(true);
            }
            i11++;
        }
        if (this.H) {
            i10 = 81;
        } else {
            i10 = 0;
        }
        float max = Math.max(0.0f, AndroidUtilities.dp(i10 + 48) + this.K);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37087q3, 0.0f);
        this.f37093r3 = ofFloat;
        ofFloat.addUpdateListener(new tv(this, max, 1));
        this.f37093r3.addListener(new rx(this, max, 0));
        this.f37093r3.setInterpolator(org.telegram.ui.Components.nr.f27346f);
        this.f37093r3.setDuration(200L);
        this.f37093r3.start();
        this.V0 = false;
        ArrayList arrayList = this.X0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList.get(i12);
                b10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
                i12++;
                arrayList = arrayList;
                size = size;
                obj = null;
            }
            arrayList.clear();
        }
        if (this.W0) {
            getMessagesController().reorderPinnedDialogs(this.S2, null, 0L);
            z10 = 0;
            this.W0 = false;
        } else {
            z10 = 0;
        }
        T4(true);
        if (this.f37009b0 != null) {
            int i13 = 0;
            while (true) {
                ny[] nyVarArr2 = this.f37009b0;
                if (i13 >= nyVarArr2.length) {
                    break;
                }
                nyVarArr2[i13].d.E = z10;
                i13++;
            }
        }
        int i14 = MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK;
        int i15 = z10;
        if (z4) {
            i15 = MessagesController.UPDATE_MASK_CHAT;
        }
        g5(i15 | i14, true);
    }

    public final void b5() {
        org.telegram.ui.Components.qq0 qq0Var = this.D2;
        if (qq0Var != null) {
            int i10 = this.currentAccount;
            qq0Var.h(i10);
            qq0Var.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
            ArrayList arrayList = qq0Var.f28218f;
            arrayList.clear();
            ArrayList arrayList2 = this.F2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            org.telegram.ui.Components.oq0 oq0Var = qq0Var.f28215a[0];
            if (qq0Var.f28216b == 1) {
                oq0Var.d.l(qq0Var.c(oq0Var), false);
            }
        }
    }

    public final void c4(boolean z4) {
        if (this.C3.c()) {
            z4 = true;
        }
        if (!z4 || !this.Y1) {
            this.R3 = z4;
            Y4(true);
            if (z4) {
                ph.f3 f3Var = this.m0;
                if (f3Var != null) {
                    f3Var.e(true);
                }
                ph.f3 f3Var2 = this.f37069n0;
                if (f3Var2 != null) {
                    f3Var2.e(true);
                }
            }
        }
    }

    public final void c5(boolean z4) {
        boolean z10;
        if (this.f37045i0 == null) {
            return;
        }
        ArrayList<MessageObject> arrayList = getDownloadController().downloadingFiles;
        int size = arrayList.size();
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                MessageObject messageObject = arrayList.get(i10);
                i10++;
                MessageObject messageObject2 = messageObject;
                if (messageObject2.getDocument() != null && messageObject2.getDocument().size >= 157286400) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
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
                z10 = true;
                break;
            }
        }
        if (!getUserConfig().isPremium() && !getMessagesController().premiumFeaturesBlocked() && z10 && z4) {
            z11 = true;
        }
        this.d.a(z11, true);
    }

    @Override
    public final boolean canBeginSlide() {
        nw nwVar;
        if (!this.C3.c()) {
            if (this.O0 == 3 && (nwVar = this.f37115w0) != null && nwVar.getVisibility() == 0 && this.f37115w0.H > 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean closeLastFragment() {
        if (this.C3.c()) {
            this.C3.a();
            xx xxVar = this.f37129z0;
            if (xxVar != null) {
                xxVar.R();
                return true;
            }
            return true;
        }
        return super.closeLastFragment();
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        eg.l1 l1Var = new eg.l1(this, context, this.resourceProvider, 4);
        l1Var.setAllowOverlayTitle(true);
        l1Var.K();
        l1Var.B(getThemedColor(org.telegram.ui.ActionBar.j6.f20192t8), false);
        l1Var.B(getThemedColor(org.telegram.ui.ActionBar.j6.f20300z8), true);
        l1Var.C(getThemedColor(org.telegram.ui.ActionBar.j6.f20227v8), false);
        l1Var.C(getThemedColor(org.telegram.ui.ActionBar.j6.f20283y8), true);
        l1Var.k();
        l1Var.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        l1Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(3.0f));
        if (!this.inPreviewMode && (!AndroidUtilities.isTablet() || this.S2 == 0 || e4())) {
            return l1Var;
        }
        l1Var.setOccupyStatusBar(false);
        return l1Var;
    }

    @Override
    public final android.view.View createView(android.content.Context r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oy.createView(android.content.Context):android.view.View");
    }

    public final void d5(TLRPC.User user, boolean z4) {
        org.telegram.ui.Components.j5 j5Var;
        gx gxVar = this.B0;
        org.telegram.ui.Components.j5 j5Var2 = null;
        if (gxVar != null && (j5Var = gxVar.U) != null && gxVar.f15772n0 != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                j5Var.j(emojiStatusDocumentId.longValue(), z4);
                j5Var.m(user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible, z4);
            } else if (user != null && MessagesController.getInstance(gxVar.f15763f).isPremiumUser(user)) {
                if (gxVar.K0 == null) {
                    gxVar.K0 = gxVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    gxVar.K0 = new org.telegram.ui.Components.k5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), gxVar.K0);
                }
                gxVar.K0.setColorFilter(new PorterDuffColorFilter(gxVar.f(org.telegram.ui.ActionBar.j6.zh), PorterDuff.Mode.MULTIPLY));
                j5Var.g(gxVar.K0, z4);
                j5Var.m(false, z4);
            } else {
                j5Var.g(null, z4);
                j5Var.m(false, z4);
            }
            j5Var.k(Integer.valueOf(gxVar.f(org.telegram.ui.ActionBar.j6.zh)));
            gxVar.T.invalidate();
        }
        if (this.A3 != null && this.actionBar != null) {
            Long emojiStatusDocumentId2 = UserObject.getEmojiStatusDocumentId(user);
            this.f37128y3 = null;
            if (emojiStatusDocumentId2 != null) {
                boolean z10 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                this.A3.j(emojiStatusDocumentId2.longValue(), z4);
                this.A3.m(z10, z4);
                if (z10) {
                    this.f37128y3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
                }
                this.actionBar.setRightDrawableOnClick(new rv(this, 2));
                q61.t(this.currentAccount);
            } else if (user != null && MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
                if (this.I3 == null) {
                    this.I3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    this.I3 = new org.telegram.ui.Components.k5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.I3);
                }
                this.I3.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.zh), PorterDuff.Mode.MULTIPLY));
                this.A3.g(this.I3, z4);
                this.A3.m(false, z4);
                this.actionBar.setRightDrawableOnClick(new rv(this, 3));
                q61.t(this.currentAccount);
            } else {
                this.A3.g(null, z4);
                this.A3.m(false, z4);
                this.actionBar.setRightDrawableOnClick(null);
            }
            org.telegram.ui.Components.j5 j5Var3 = this.A3;
            int i10 = org.telegram.ui.ActionBar.j6.zh;
            j5Var3.k(Integer.valueOf(getThemedColor(i10)));
            org.telegram.ui.Cells.o oVar = this.B3;
            if (oVar != null) {
                oVar.setColor(getThemedColor(i10));
            }
            lx lxVar = this.J0;
            if (lxVar != null && (lxVar.getContentView() instanceof q61)) {
                org.telegram.ui.ActionBar.k5 titleTextView = this.actionBar.getTitleTextView();
                q61 q61Var = (q61) this.J0.getContentView();
                if (titleTextView != null) {
                    Drawable rightDrawable = titleTextView.getRightDrawable();
                    org.telegram.ui.Components.j5 j5Var4 = this.A3;
                    if (rightDrawable == j5Var4) {
                        j5Var2 = j5Var4;
                    }
                }
                q61Var.y(j5Var2, titleTextView);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r27, int r28, java.lang.Object... r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oy.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (!(dialog instanceof rh.q2) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final boolean e4() {
        if (this.S2 == 1) {
            return true;
        }
        return false;
    }

    public final void e5() {
        ph.f3 f3Var;
        boolean storiesEnabled = getMessagesController().storiesEnabled();
        if (this.L3 != storiesEnabled) {
            X4();
            if (!this.L3 && storiesEnabled && (f3Var = this.m0) != null) {
                f3Var.v();
            }
            this.L3 = storiesEnabled;
        }
        org.telegram.ui.Components.z10 z10Var = this.f37084q0;
        if (z10Var == null) {
            return;
        }
        if (this.O0 == 10) {
            z10Var.setImageResource(R.drawable.floating_check);
            this.f37084q0.setContentDescription(LocaleController.getString(R.string.Done));
            return;
        }
        z10Var.setImageResource(R.drawable.filled_fab_compose_32);
        this.f37084q0.setContentDescription(LocaleController.getString(R.string.NewMessageTitle));
    }

    public final boolean f4(long j10) {
        if (j10 < 0) {
            return false;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        if (!UserObject.isBotForum(user)) {
            return false;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f19331id);
        if ((topics != null && !topics.isEmpty()) || !MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f19331id)) {
            return false;
        }
        return true;
    }

    public final void f5(boolean z4) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        boolean z11;
        nh.t6 X3;
        ArrayList arrayList;
        boolean z12;
        boolean z13;
        int i10;
        float f10;
        float f11;
        if (this.B0 != null && this.F == null) {
            jx jxVar = this.C3;
            if ((jxVar == null || !jxVar.c()) && !this.f37066m3 && (kVar = this.actionBar) != null && !kVar.s() && !this.f37047i2) {
                ph.da daVar = ph.da.C2;
                int i11 = 0;
                if ((daVar != null && daVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().H0)) {
                    z4 = false;
                }
                if (!e4() && X3().G()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.U2 != 0) {
                    z11 = false;
                } else if (e4()) {
                    z11 = !X3().h.isEmpty();
                } else {
                    if (!z10 && (((arrayList = (X3 = X3()).f15921g) != null && arrayList.size() > 0) || X3.H())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z10 = X3().G();
                }
                this.I = z10;
                boolean z14 = this.D0;
                if (!z10 && !z11) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                this.D0 = z12;
                if (z11 || z12) {
                    gx gxVar = this.B0;
                    if (z12 != z14) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    gxVar.p(z4, z13);
                }
                boolean z15 = this.D0;
                int i12 = 8;
                float f12 = 0.0f;
                if (z15 != z14) {
                    if (z4) {
                        ValueAnimator valueAnimator = this.G;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        if (this.D0 && !isInPreviewMode()) {
                            this.B0.setVisibility(0);
                        }
                        float f13 = this.E0;
                        if (this.D0) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f11);
                        this.G = ofFloat;
                        ofFloat.addUpdateListener(new yi(1, this));
                        this.G.addListener(new org.telegram.ui.Components.f91(this, 16));
                        this.G.setDuration(200L);
                        this.G.setInterpolator(org.telegram.ui.Components.nr.f27346f);
                        this.G.start();
                    } else {
                        gx gxVar2 = this.B0;
                        if (z15 && !isInPreviewMode()) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        gxVar2.setVisibility(i10);
                        if (this.D0) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        this.E0 = f10;
                        View view = this.fragmentView;
                        if (view != null) {
                            view.invalidate();
                        }
                    }
                }
                if (z11 != this.J) {
                    this.J = z11;
                    if (z11) {
                        this.B0.l(1.0f, false);
                    }
                    if (z4 && !isInPreviewMode()) {
                        this.B0.setVisibility(0);
                        float f14 = -this.K;
                        if (!z11) {
                            f12 = T3();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.F = ofFloat2;
                        ofFloat2.addUpdateListener(new wx(this, f14, z11, f12));
                        this.F.addListener(new px(this, z11, 2));
                        this.F.setDuration(200L);
                        this.F.setInterpolator(org.telegram.ui.Components.nr.f27346f);
                        this.F.start();
                        return;
                    }
                    this.H = z11;
                    gx gxVar3 = this.B0;
                    if ((z11 || this.I) && !isInPreviewMode()) {
                        i12 = 0;
                    }
                    gxVar3.setVisibility(i12);
                    if (!z11) {
                        C4(0.0f);
                    } else {
                        this.f37109u3 = -AndroidUtilities.dp(81.0f);
                        C4(-T3());
                    }
                    while (true) {
                        ny[] nyVarArr = this.f37009b0;
                        if (i11 >= nyVarArr.length) {
                            break;
                        }
                        ny nyVar = nyVarArr[i11];
                        if (nyVar != null) {
                            nyVar.f36741a.requestLayout();
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
        org.telegram.ui.Components.o70 o70Var = this.I0;
        if (o70Var != null) {
            o70Var.u();
        }
    }

    public final boolean g4(TLRPC.Dialog dialog) {
        char c3;
        if (dialog == null) {
            return false;
        }
        int i10 = this.f37009b0[0].f36747s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.s() || this.actionBar.t(null))) {
            MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
            if (this.f37009b0[0].f36747s == 8) {
                c3 = 1;
            } else {
                c3 = 0;
            }
            dialogFilter = dialogFilterArr[c3];
        }
        if (dialogFilter != null) {
            if (dialogFilter.pinnedDialogs.indexOfKey(dialog.f19188id) < 0) {
                return false;
            }
            return true;
        }
        return dialog.pinned;
    }

    public final void g5(int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oy.g5(int, boolean):void");
    }

    @Override
    public final org.telegram.ui.ActionBar.a5 getBackButtonState() {
        if (!e4() && !this.C3.f38531f) {
            return org.telegram.ui.ActionBar.a5.f19516b;
        }
        return org.telegram.ui.ActionBar.a5.f19515a;
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z4, boolean z10, float f10) {
        int i10;
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U3, 1.0f);
            this.X3 = ofFloat;
            return ofFloat;
        }
        if (getLayoutContainer() != null && getLayoutContainer().getMeasuredWidth() > 0) {
            i10 = (int) Utilities.clamp((200.0f / getLayoutContainer().getMeasuredWidth()) * f10, 200.0f, 80.0f);
        } else {
            i10 = 150;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.U3, 1.0f);
        this.X3 = ofFloat2;
        ofFloat2.addUpdateListener(new ov(this, 2));
        this.X3.setInterpolator(org.telegram.ui.Components.nr.f27347g);
        this.X3.setDuration(i10);
        this.X3.start();
        return this.X3;
    }

    @Override
    public final java.util.ArrayList getThemeDescriptions() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oy.getThemeDescriptions():java.util.ArrayList");
    }

    public final boolean h4() {
        if (this.f37131z2 == null && this.f37057k2 == null) {
            return true;
        }
        return false;
    }

    public final boolean h5(long j10) {
        TLRPC.Chat chat;
        zw zwVar;
        if ((this.P0 <= 1 && ((zwVar = this.f37126y1) == null || zwVar.getVisibility() != 0 || TextUtils.isEmpty(this.f37126y1.getFieldText()))) || !DialogObject.isChatDialog(j10) || (chat = getMessagesController().getChat(Long.valueOf(-j10))) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.z4.u0(this, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null);
        return false;
    }

    public final boolean i3(long j10, View view) {
        if (this.f37047i2 && getMessagesController().isForum(j10)) {
            return false;
        }
        Long valueOf = Long.valueOf(j10);
        ArrayList arrayList = this.F2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j10));
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).V(false, true);
            } else if (view instanceof org.telegram.ui.Cells.h6) {
                ((org.telegram.ui.Cells.h6) view).s(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j10));
        if (view instanceof org.telegram.ui.Cells.r2) {
            ((org.telegram.ui.Cells.r2) view).V(true, true);
        } else if (view instanceof org.telegram.ui.Cells.h6) {
            ((org.telegram.ui.Cells.h6) view).s(true, true);
        }
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        jx jxVar;
        if (!this.f37037g2 && (jxVar = this.C3) != null && jxVar.getFragment() != null) {
            return this.C3.getFragment().isLightStatusBar();
        }
        if (i0.a.f(getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j3(tf.e0 e0Var) {
        xx xxVar;
        if (this.f37066m3 && (xxVar = this.f37129z0) != null) {
            ArrayList arrayList = xxVar.f24339x0;
            if (!arrayList.isEmpty()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (e0Var.b((tf.e0) arrayList.get(i10))) {
                        return;
                    }
                }
            }
            arrayList.add(e0Var);
            ey eyVar = this.U;
            ArrayList arrayList2 = eyVar.C;
            arrayList2.add(e0Var);
            eyVar.F = arrayList2.size() - 1;
            eyVar.f();
            this.U.f23815r.getText().clear();
            W4(true, null, null, false, true);
        }
    }

    public final void j4(long r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oy.j4(long):void");
    }

    public final void k3(boolean z4) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            ArrayList arrayList = new ArrayList();
            if (this.S2 == 0 && this.U2 == 0 && Build.VERSION.SDK_INT >= 33 && vj0.n(parentActivity)) {
                if (z4) {
                    showDialog(new vj0(parentActivity, !org.telegram.ui.Components.ge0.c(), new bw(parentActivity, 1)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            if (getUserConfig().syncContacts && this.R1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z4) {
                    org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.z4.w(parentActivity, new vv(this, 1)).f19503a;
                    this.Q1 = d2Var;
                    showDialog(d2Var);
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
                if (this.f37120x0) {
                    this.f37120x0 = false;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oy.k4(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):boolean");
    }

    public final void l3(CharSequence charSequence) {
        int i10;
        if (this.f37126y1 != null) {
            if (this.A2 == null && this.B2 == null && this.C2 == null) {
                return;
            }
            if (this.D2 == null) {
                org.telegram.ui.Components.qq0 qq0Var = new org.telegram.ui.Components.qq0(getParentActivity(), getResourceProvider());
                this.D2 = qq0Var;
                qq0Var.setLayoutClickListener(new rv(this, 0));
                this.D2.setOnModeChangeListener(new sv(this, 0));
                zw zwVar = this.f37126y1;
                org.telegram.ui.Components.qq0 qq0Var2 = this.D2;
                if (qq0Var2 == null) {
                    zwVar.getClass();
                } else {
                    zwVar.C1 = qq0Var2;
                    zwVar.addView(qq0Var2, 0, k7.b6.e(-1, 48, 51));
                    zwVar.c3 = false;
                    zwVar.N();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.D2.getLayoutParams();
                layoutParams.rightMargin = -this.f37126y1.getPaddingRight();
                this.D2.setLayoutParams(layoutParams);
            }
            if (a4()) {
                this.D2.i(this.currentAccount, this.A2);
            } else {
                String str = this.B2;
                if (str != null) {
                    org.telegram.ui.Components.qq0 qq0Var3 = this.D2;
                    qq0Var3.g(this.currentAccount);
                    if (!str.isEmpty()) {
                        qq0Var3.e(str, true);
                    }
                } else {
                    CharSequence charSequence2 = this.C2;
                    if (charSequence2 != null) {
                        org.telegram.ui.Components.qq0 qq0Var4 = this.D2;
                        qq0Var4.g(this.currentAccount);
                        if (charSequence2.length() > 0) {
                            qq0Var4.e(charSequence2, true);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.f37126y1.setFieldText(charSequence);
            }
            zw zwVar2 = this.f37126y1;
            if (a4()) {
                i10 = R.string.AddCaption;
            } else {
                i10 = R.string.ShareComment;
            }
            zwVar2.setOverrideHint(LocaleController.getString(i10));
            v3();
            if (this.D2.getMode() != 0) {
                this.f37126y1.x1(false, false);
            }
            b5();
        }
    }

    public final boolean l4(TLRPC.User user) {
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.D;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oy.m3():void");
    }

    public final void m4(View view) {
        boolean z4;
        int i10;
        int i11;
        int i12;
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        String str = null;
        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(getParentActivity(), null, false, false);
        g3Var.fixNavigationBar();
        if (getMessagesStorage().getArchiveUnreadCount() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
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
        if (z4) {
            str = LocaleController.getString(R.string.MarkAllAsRead);
        }
        if (SharedConfig.archiveHidden) {
            i12 = R.string.PinInTheList;
        } else {
            i12 = R.string.HideAboveTheList;
        }
        CharSequence[] charSequenceArr = {str, LocaleController.getString(i12)};
        qv qvVar = new qv(this, 0);
        g3Var.items = charSequenceArr;
        g3Var.itemIcons = iArr;
        g3Var.onClickListener = qvVar;
        showDialog(g3Var);
    }

    public final int n3() {
        if (this.f37126y1 != null) {
            return (int) (this.f37111v1.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(2.0f));
        } else if (this.U2 != 0) {
            return AndroidUtilities.dp(72.0f) + this.f37023d4;
        } else {
            return this.f37023d4 + this.f37034f4;
        }
    }

    public final void n4(android.view.View r25, int r26, f2.o0 r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oy.n4(android.view.View, int, f2.o0):void");
    }

    public final void o3() {
        AndroidUtilities.runOnUIThread(new mv(this, 2), 300L);
    }

    public final boolean o4(View view, int i10, float f10, org.telegram.ui.Components.rl0 rl0Var) {
        org.telegram.ui.Components.wn0 wn0Var;
        long j10;
        org.telegram.ui.Components.wn0 wn0Var2;
        TLRPC.EncryptedChat encryptedChat;
        long makeEncryptedDialogId;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.z2) && rl0Var.j(i10) != 21) {
            if (!this.actionBar.s() && !AndroidUtilities.isTablet() && !this.f37047i2 && (view instanceof org.telegram.ui.Cells.r2)) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                if (!getMessagesController().isForum(r2Var.getDialogId()) && !this.C3.c() && r2Var.S(f10)) {
                    return H4(r2Var);
                }
            }
            jx jxVar = this.C3;
            if (jxVar == null || !jxVar.c()) {
                xx xxVar = this.f37129z0;
                boolean z4 = true;
                if (xxVar != null && rl0Var == (wn0Var2 = xxVar.V)) {
                    Object J = wn0Var2.J(i10);
                    if (!this.f37129z0.V.K) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                        d2Var.O = string;
                        if (J instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) J;
                            if (chat.monoforum) {
                                d2Var.Q = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, ag.f.i(chat, this.currentAccount, false));
                            } else {
                                d2Var.Q = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, chat.title);
                            }
                            makeEncryptedDialogId = -chat.f19184id;
                        } else if (J instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) J;
                            if (user.f19331id == getUserConfig().clientUserId) {
                                d2Var.Q = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, LocaleController.getString(R.string.SavedMessages));
                            } else {
                                d2Var.Q = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user.first_name, user.last_name));
                            }
                            makeEncryptedDialogId = user.f19331id;
                        } else if (J instanceof TLRPC.EncryptedChat) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(((TLRPC.EncryptedChat) J).user_id));
                            d2Var.Q = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user2.first_name, user2.last_name));
                            makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.f19192id);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new f3.e(this, makeEncryptedDialogId, 7));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        showDialog(d2Var);
                        TextView textView = (TextView) d2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20141q7));
                        }
                        return true;
                    }
                }
                xx xxVar2 = this.f37129z0;
                if (xxVar2 != null && rl0Var == (wn0Var = xxVar2.V)) {
                    if (this.f37047i2) {
                        n4(view, i10, rl0Var);
                        return false;
                    }
                    if ((view instanceof org.telegram.ui.Cells.h6) && !wn0Var.O(i10)) {
                        j10 = ((org.telegram.ui.Cells.h6) view).getDialogId();
                    } else {
                        j10 = 0;
                    }
                    if (j10 != 0) {
                        M4(j10, view);
                        return true;
                    }
                } else {
                    Object I = ((tf.k) rl0Var).I(i10);
                    if (I instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) I;
                        if (this.f37047i2) {
                            if ((this.O0 == 3 || I3()) && h5(dialog.f19188id)) {
                                if (this.O0 == 1 && I3() && this.f37052j2 && getMessagesController().isForum(dialog.f19188id)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -dialog.f19188id);
                                    bundle.putBoolean("for_select", true);
                                    bundle.putBoolean("forward_to", true);
                                    if (this.O0 != 1) {
                                        z4 = false;
                                    }
                                    bundle.putBoolean("bot_share_to", z4);
                                    bundle.putBoolean("quote", this.L0);
                                    bundle.putBoolean("reply_to", this.K0);
                                    kf1 kf1Var = new kf1(bundle);
                                    kf1Var.I0 = this;
                                    presentFragment(kf1Var);
                                    return false;
                                }
                                i3(dialog.f19188id, view);
                                a5();
                                return true;
                            }
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                            m4(view);
                            return false;
                        } else if (!this.actionBar.s() || !g4(dialog)) {
                            M4(dialog.f19188id, view);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        if (hasShownSheet()) {
            if (z4) {
                closeSheet();
                return false;
            }
        } else if (this.C3.c() && this.C3.getFragment().onBackPressed(z4)) {
            if (z4) {
                this.C3.a();
                xx xxVar = this.f37129z0;
                if (xxVar != null) {
                    xxVar.R();
                    return false;
                }
            }
        } else {
            org.telegram.ui.Components.o70 o70Var = this.I0;
            if (o70Var != null) {
                if (z4) {
                    o70Var.u();
                    this.I0 = null;
                    return false;
                }
            } else {
                nw nwVar = this.f37115w0;
                if (nwVar != null && nwVar.f25830n) {
                    if (z4) {
                        nwVar.setIsEditing(false);
                        I4(false);
                        return false;
                    }
                } else {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar != null && kVar.s()) {
                        if (z4) {
                            xx xxVar2 = this.f37129z0;
                            if (xxVar2 != null && xxVar2.getVisibility() == 0) {
                                this.f37129z0.Q(false);
                            }
                            b4(true);
                            return false;
                        }
                    } else if (this.f37008b.f46893f) {
                        if (z4) {
                            this.U.f23815r.getText().clear();
                            this.V.b(false);
                            this.U.f23815r.clearFocus();
                            return false;
                        }
                    } else {
                        nw nwVar2 = this.f37115w0;
                        if (nwVar2 != null && nwVar2.getVisibility() == 0 && !this.f37022d3) {
                            nw nwVar3 = this.f37115w0;
                            if (!nwVar3.L && !this.f37048i3) {
                                ArrayList arrayList = nwVar3.h;
                                if (!arrayList.isEmpty() && nwVar3.I != ((org.telegram.ui.Components.g00) arrayList.get(0)).f25005a) {
                                    if (z4) {
                                        nw nwVar4 = this.f37115w0;
                                        ArrayList arrayList2 = nwVar4.h;
                                        if (!arrayList2.isEmpty()) {
                                            nwVar4.f((org.telegram.ui.Components.g00) arrayList2.get(0), 0);
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        zw zwVar = this.f37126y1;
                        if (zwVar != null && zwVar.t0()) {
                            if (z4) {
                                this.f37126y1.m0(true);
                            }
                        } else {
                            gx gxVar = this.B0;
                            if (gxVar.L == 0 && gxVar.P.L0() != 0) {
                                gxVar.h.x0(0);
                                return false;
                            }
                            return super.onBackPressed(z4);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        eg.h0 h0Var;
        nw nwVar;
        if (this.S1) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.h(true);
            }
            TLObject tLObject = this.U1;
            if (tLObject != null) {
                xx xxVar = this.f37129z0;
                if (xxVar != null) {
                    xxVar.V.R(this.T1, tLObject);
                }
                this.U1 = null;
            }
            this.S1 = false;
        }
        if (!this.H && (nwVar = this.f37115w0) != null && nwVar.getVisibility() == 0 && this.f37089r.f46893f) {
            int i10 = (int) (-this.K);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (i10 != 0 && i10 != currentActionBarHeight && i10 >= currentActionBarHeight / 2) {
                this.f37009b0[0].f36741a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.f37110v0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        if (!isInPreviewMode() && (h0Var = this.H0) != null && h0Var.getVisibility() == 0) {
            this.H0.setVisibility(8);
            this.H0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        B3();
        this.f37074o0 = true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        ph.f3 f3Var;
        super.onBecomeFullyVisible();
        if (e4()) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z4 = globalMainSettings.getBoolean("archivehint", true);
            boolean isEmpty = R3(this.currentAccount, this.O0, this.S2, false).isEmpty();
            if (z4 && isEmpty) {
                MessagesController.getGlobalMainSettings().edit().putBoolean("archivehint", false).commit();
                z4 = false;
            }
            if (z4) {
                globalMainSettings.edit().putBoolean("archivehint", false).commit();
                G4();
            }
        }
        if (this.f37074o0 && !this.f37079p0 && (f3Var = this.m0) != null && this.L3) {
            this.f37079p0 = true;
            this.f37074o0 = false;
            f3Var.v();
        }
        AndroidUtilities.runOnUIThread(new dw(this, 3), 200L);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.o70 o70Var = this.I0;
        if (o70Var != null) {
            o70Var.u();
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.d2 d2Var;
        super.onDialogDismiss(dialog);
        if (this.S2 == 0 && this.U2 == 0 && (d2Var = this.Q1) != null && dialog == d2Var && getParentActivity() != null) {
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
            this.f37047i2 = bundle.getBoolean("onlySelect", false);
            this.f37052j2 = this.arguments.getBoolean("canSelectTopics", false);
            this.f37071n2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.O0 = this.arguments.getInt("dialogsType", 0);
            this.L0 = this.arguments.getBoolean("quote", false);
            this.K0 = this.arguments.getBoolean("reply_to", false);
            this.M0 = this.arguments.getLong("reply_to_author", 0L);
            this.N0 = this.arguments.getLong("forward_into_channel", 0L);
            this.f37017c2 = this.arguments.getString("selectAlertString");
            this.f37021d2 = this.arguments.getString("selectAlertStringGroup");
            this.f37026e2 = this.arguments.getString("addToGroupAlertString");
            this.f37076o2 = this.arguments.getBoolean("allowSwitchAccount");
            this.f37081p2 = this.arguments.getBoolean("checkCanWrite", true);
            this.f37086q2 = this.arguments.getBoolean("afterSignup", false);
            this.S2 = this.arguments.getInt("folderId", 0);
            long j10 = this.arguments.getLong("community_id", 0L);
            this.U2 = j10;
            if (j10 != 0) {
                this.V2 = getMessagesController().getChat(Long.valueOf(this.U2));
                this.W2 = getMessagesController().getChatFull(this.U2);
            }
            this.f37032f2 = this.arguments.getBoolean("resetDelegate", true);
            this.P0 = this.arguments.getInt("messagesCount", 0);
            this.Q0 = this.arguments.getInt("hasPoll", 0);
            this.R0 = this.arguments.getBoolean("hasInvoice", false);
            this.f37092r2 = this.arguments.getBoolean("showSetPasswordConfirm", this.f37092r2);
            this.arguments.getInt("otherwiseRelogin");
            this.f37098s2 = this.arguments.getBoolean("allowGroups", true);
            this.f37103t2 = this.arguments.getBoolean("allowMegagroups", true);
            this.f37108u2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.f37112v2 = this.arguments.getBoolean("allowChannels", true);
            this.f37117w2 = this.arguments.getBoolean("allowUsers", true);
            this.f37122x2 = this.arguments.getBoolean("allowBots", true);
            this.f37127y2 = this.arguments.getBoolean("closeFragment", true);
            this.C = this.arguments.getBoolean("allowGlobalSearch", true);
            this.T = this.arguments.getBoolean("hasMainTabs", false);
            byte[] byteArray = this.arguments.getByteArray("requestPeerType");
            if (byteArray != null) {
                try {
                    SerializedData serializedData = new SerializedData(byteArray);
                    this.D = TLRPC.RequestPeerType.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    serializedData.cleanup();
                } catch (Exception unused) {
                }
            }
            this.E = this.arguments.getLong("requestPeerBotId", 0L);
        }
        if (this.O0 == 0) {
            this.R1 = MessagesController.getGlobalNotificationsSettings().getBoolean("askAboutContacts", true);
            SharedConfig.loadProxyList();
        }
        this.G3 = getNotificationCenter().createObserversGroup(this);
        this.H3 = NotificationCenter.getGlobalInstance().createObserversGroup(this);
        if (this.f37057k2 == null) {
            this.a2 = getConnectionsManager().getConnectionState();
            this.H3.add(NotificationCenter.emojiLoaded);
            if (!this.f37047i2) {
                this.H3.add(NotificationCenter.closeSearchByActiveAction);
                this.H3.add(NotificationCenter.proxySettingsChanged);
                this.G3.add(NotificationCenter.filterSettingsUpdated);
                this.G3.add(NotificationCenter.dialogsUnreadCounterChanged);
            }
            this.G3.add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.dialogFiltersUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.encryptedChatUpdated).add(NotificationCenter.contactsDidLoad).add(NotificationCenter.appDidLogout).add(NotificationCenter.openedChatChanged).add(NotificationCenter.notificationsSettingsUpdated).add(NotificationCenter.messageReceivedByAck).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messageSendError).add(NotificationCenter.needReloadRecentDialogsSearch).add(NotificationCenter.replyMessagesDidLoad).add(NotificationCenter.topicsDidLoaded).add(NotificationCenter.reloadHints).add(NotificationCenter.didUpdateConnectionState).add(NotificationCenter.onDownloadingFilesChanged).add(NotificationCenter.needDeleteDialog).add(NotificationCenter.folderBecomeEmpty).add(NotificationCenter.newSuggestionsAvailable).add(NotificationCenter.dialogsUnreadReactionsCounterChanged).add(NotificationCenter.dialogsUnreadPollVotesCounterChanged).add(NotificationCenter.forceImportContactsStart).add(NotificationCenter.userEmojiStatusUpdated).add(NotificationCenter.currentUserPremiumStatusChanged);
            this.H3.add(NotificationCenter.didSetPasscode);
        }
        this.G3.add(NotificationCenter.messagesDeleted).add(NotificationCenter.onDatabaseMigration).add(NotificationCenter.onDatabaseOpened).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.didClearDatabase).add(NotificationCenter.onDatabaseReset).add(NotificationCenter.storiesUpdated).add(NotificationCenter.storiesEnabledUpdate).add(NotificationCenter.unconfirmedAuthUpdate).add(NotificationCenter.premiumPromoUpdated).add(NotificationCenter.starBalanceUpdated).add(NotificationCenter.starSubscriptionsLoaded).add(NotificationCenter.communityPendingRequestsUpdate).add(NotificationCenter.communitySwitchedCollapsed).add(NotificationCenter.appConfigUpdated).add(NotificationCenter.activeAuctionsUpdated);
        if (this.O0 == 0) {
            this.G3.add(NotificationCenter.chatlistFolderUpdate);
            this.G3.add(NotificationCenter.dialogTranslate);
        }
        i4(getAccountInstance());
        nh.t6 storiesController = getMessagesController().getStoriesController();
        if (!storiesController.A) {
            storiesController.T();
            if (!storiesController.f15932s) {
                ConnectionsManager.getInstance(storiesController.f15917a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new nh.s5(storiesController, 0));
            }
        }
        getMessagesController().loadPinnedDialogs(this.S2, 0L, null);
        if (this.O3 != null && !getMessagesStorage().isDatabaseMigrationInProgress()) {
            zu zuVar = this.O3;
            if (zuVar.getParent() != null) {
                ((ViewGroup) zuVar.getParent()).removeView(zuVar);
            }
            this.O3 = null;
        }
        if (e4()) {
            nh.t6 storiesController2 = getMessagesController().getStoriesController();
            if (storiesController2.f15938z) {
                storiesController2.Q(true);
            }
        } else {
            getMessagesController().getStoriesController().T();
        }
        getContactsController().loadGlobalPrivacySetting();
        if (getMessagesController().savedViewAsChats) {
            getMessagesController().getSavedMessagesController().preloadDialogs(true);
        }
        if (this.U2 != 0) {
            getMessagesController().loadFullChat(this.U2, 0, true);
        }
        BirthdayController.getInstance(this.currentAccount).check();
        if (this.T) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.f37034f4 = i10;
        if (this.T) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.f37039g4 = i11;
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.ObserversGroup observersGroup = this.G3;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.G3 = null;
        }
        NotificationCenter.ObserversGroup observersGroup2 = this.H3;
        if (observersGroup2 != null) {
            observersGroup2.removeAllObservers();
            this.H3 = null;
        }
        zw zwVar = this.f37126y1;
        if (zwVar != null) {
            zwVar.B0();
        }
        org.telegram.ui.Components.qq0 qq0Var = this.D2;
        if (qq0Var != null) {
            qq0Var.j();
        }
        org.telegram.ui.Components.k41 k41Var = this.E2;
        if (k41Var != null) {
            AndroidUtilities.cancelRunOnUIThread(k41Var);
            this.E2 = null;
        }
        UndoView undoView = this.f37110v0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f37062l3.unlock();
        this.f37131z2 = null;
        oa1 oa1Var = oa1.f36861b;
        if (oa1Var != null) {
            oa1Var.dismiss();
            oa1.f36861b = null;
        }
    }

    @Override
    public final void onPanTranslationUpdate(float f10) {
        if (this.f37009b0 != null) {
            this.G0 = f10;
            zw zwVar = this.f37126y1;
            int i10 = 0;
            if (zwVar != null && zwVar.t0()) {
                this.fragmentView.setTranslationY(f10);
                while (true) {
                    ny[] nyVarArr = this.f37009b0;
                    if (i10 >= nyVarArr.length) {
                        break;
                    }
                    nyVarArr[i10].setTranslationY(0.0f);
                    i10++;
                }
                if (!this.f37047i2) {
                    this.actionBar.setTranslationY(0.0f);
                    org.telegram.ui.Components.ic icVar = this.f37058k3;
                    if (icVar != null) {
                        icVar.l();
                    }
                }
                xx xxVar = this.f37129z0;
                if (xxVar != null) {
                    xxVar.setTranslationY(this.F0);
                    return;
                }
                return;
            }
            while (true) {
                ny[] nyVarArr2 = this.f37009b0;
                if (i10 >= nyVarArr2.length) {
                    break;
                }
                nyVarArr2[i10].setTranslationY(f10);
                i10++;
            }
            if (!this.f37047i2) {
                this.actionBar.setTranslationY(f10);
                org.telegram.ui.Components.ic icVar2 = this.f37058k3;
                if (icVar2 != null) {
                    icVar2.l();
                }
            }
            xx xxVar2 = this.f37129z0;
            if (xxVar2 != null) {
                xxVar2.setTranslationY(this.G0 + this.F0);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.ic icVar = this.P;
        if (icVar != null) {
            icVar.b();
            this.P = null;
        }
        jx jxVar = this.C3;
        if (jxVar != null) {
            jxVar.f38533r = true;
            qx qxVar = jxVar.f38528a;
            if (qxVar != null) {
                qxVar.onPause();
            }
        }
        org.telegram.ui.Components.o70 o70Var = this.I0;
        if (o70Var != null) {
            o70Var.u();
        }
        zw zwVar = this.f37126y1;
        if (zwVar != null) {
            zwVar.D0();
        }
        int i10 = 0;
        UndoView undoView = this.f37110v0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        setBulletinDelegate(null);
        if (this.f37009b0 == null) {
            return;
        }
        while (true) {
            ny[] nyVarArr = this.f37009b0;
            if (i10 < nyVarArr.length) {
                nyVarArr[i10].d.getClass();
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
                                vj0.m();
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
                                AndroidUtilities.runOnUIThread(new dw(this, 2));
                                getContactsController().forceImportContacts();
                                continue;
                            } else {
                                SharedPreferences.Editor edit = MessagesController.getGlobalNotificationsSettings().edit();
                                this.R1 = false;
                                edit.putBoolean("askAboutContacts", false).commit();
                                break;
                            }
                    }
                }
            }
            if (this.f37120x0) {
                this.f37120x0 = false;
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
        boolean z4;
        oy oyVar;
        ny nyVar;
        ww wwVar;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.wn0 wn0Var;
        eg.h0 h0Var;
        super.onResume();
        gx gxVar = this.B0;
        char c3 = 0;
        if (gxVar != null) {
            ArrayList arrayList = gxVar.f15785x;
            nh.t6 t6Var = gxVar.f15778s;
            t6Var.l(t6Var.f15921g);
            t6Var.l(t6Var.h);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TL_stories.PeerStories y10 = t6Var.y(((nh.n) arrayList.get(i11)).f15651c);
                if (y10 != null) {
                    t6Var.X(y10);
                }
            }
        }
        jx jxVar = this.C3;
        if (jxVar != null) {
            jxVar.f38533r = false;
            qx qxVar = jxVar.f38528a;
            if (qxVar != null) {
                qxVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (h0Var = this.H0) != null && h0Var.getVisibility() == 0) {
            this.H0.setVisibility(8);
            this.H0.setBackground(null);
        }
        if (this.f37009b0 != null) {
            int i12 = 0;
            while (true) {
                ny[] nyVarArr = this.f37009b0;
                if (i12 >= nyVarArr.length) {
                    break;
                }
                nyVarArr[i12].d.l();
                i12++;
            }
        }
        zw zwVar = this.f37126y1;
        if (zwVar != null) {
            zwVar.E0();
        }
        long j10 = 0;
        if (!this.f37047i2 && this.S2 == 0 && this.U2 == 0) {
            getMediaDataController().checkStickers(4);
        }
        xx xxVar = this.f37129z0;
        if (xxVar != null && (wn0Var = xxVar.V) != null) {
            wn0Var.l();
        }
        if (!this.f37086q2 && getUserConfig().unacceptedTermsOfService != null) {
            z4 = false;
        } else {
            z4 = true;
        }
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z4 && this.S2 == 0 && this.U2 == 0 && this.Z1 && !this.f37047i2 && (i10 = Build.VERSION.SDK_INT) >= 23) {
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.Z1 = false;
                if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i10 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                oyVar = this;
                org.telegram.messenger.n1 n1Var = new org.telegram.messenger.n1(oyVar, z12, z10, z11, parentActivity);
                if (oyVar.f37086q2 && (z10 || z12)) {
                    j10 = 4000;
                }
                AndroidUtilities.runOnUIThread(n1Var, j10);
            } else {
                oyVar = this;
            }
        } else {
            oyVar = this;
            if (!oyVar.f37047i2 && oyVar.S2 == 0 && oyVar.U2 == 0 && XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(10020)) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutMiuiLockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.j6.L5), null);
                        alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.PermissionXiaomiLockscreen);
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new sv(this, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.kh0(20));
                        showDialog(alertDialog$Builder.f19503a);
                    }
                } else {
                    return;
                }
            } else if (oyVar.S2 == 0 && oyVar.U2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutFSILockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder2.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.j6.L5), null);
                        alertDialog$Builder2.f19503a.Q = LocaleController.getString(R.string.PermissionFSILockscreen);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new sv(this, 9));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.kh0(21));
                        showDialog(alertDialog$Builder2.f19503a);
                    }
                } else {
                    return;
                }
            }
        }
        J4();
        if (oyVar.f37009b0 != null) {
            int i13 = 0;
            while (true) {
                ny[] nyVarArr2 = oyVar.f37009b0;
                if (i13 >= nyVarArr2.length) {
                    break;
                }
                ny nyVar2 = nyVarArr2[i13];
                if (nyVar2.f36747s == 0 && nyVar2.v == 2 && nyVar2.f36743c.L0() == 0 && Z3()) {
                    oyVar.f37009b0[i13].f36743c.h1(1, (int) oyVar.K);
                }
                if (i13 == 0) {
                    oyVar.f37009b0[i13].d.getClass();
                } else {
                    oyVar.f37009b0[i13].d.getClass();
                }
                i13++;
            }
        }
        L4();
        setBulletinDelegate(new a9(this, 4));
        if (oyVar.f37066m3) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), oyVar.classGuid);
        }
        g5(0, false);
        Z4(false, true);
        f5(false);
        if (getMessagesStorage().showClearDatabaseAlert) {
            getMessagesStorage().showClearDatabaseAlert = false;
            oa1.n(this);
        }
        B3();
        if (oyVar.f37115w0 != null && (nyVar = oyVar.f37009b0[0]) != null && (wwVar = nyVar.d) != null) {
            int i14 = wwVar.h;
            if (i14 == 7 || i14 == 8) {
                MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
                if (i14 != 7) {
                    c3 = 1;
                }
                MessagesController.DialogFilter dialogFilter = dialogFilterArr[c3];
                if (dialogFilter != null) {
                    oyVar.f37115w0.h(dialogFilter.localId);
                }
            }
        }
    }

    @Override
    public final void onSlideProgress(boolean z4, float f10) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.W3 && this.X3 == null) {
            F4(f10);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        eg.h0 h0Var;
        oy oyVar;
        jx jxVar = this.C3;
        if (jxVar != null && jxVar.c()) {
            this.C3.getFragment().onTransitionAnimationEnd(z4, z10);
        } else {
            if (z4 && (h0Var = this.H0) != null && h0Var.getVisibility() == 0) {
                this.H0.setVisibility(8);
                this.H0.setBackground(null);
            }
            if (z4 && this.f37086q2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).f31652u0.c(false);
                }
            }
        }
        if (!z4 && (oyVar = this.T2) != null) {
            oyVar.removeSelfFromStack();
        }
        B3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z4, float f10) {
        jx jxVar = this.C3;
        if (jxVar != null && jxVar.c()) {
            this.C3.getFragment().onTransitionAnimationProgress(z4, f10);
        } else {
            eg.h0 h0Var = this.H0;
            if (h0Var != null && h0Var.getVisibility() == 0) {
                if (z4) {
                    this.H0.setAlpha(1.0f - f10);
                } else {
                    this.H0.setAlpha(f10);
                }
            }
        }
        B3();
    }

    public final boolean p3(long j10) {
        int i10;
        int i11 = this.O0;
        if (i11 != 15 && i11 != 16 && this.f37026e2 == null && this.f37081p2) {
            if (DialogObject.isChatDialog(j10)) {
                long j11 = -j10;
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j11));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    if (this.f37071n2 || !ChatObject.isCanWriteToChannel(j11, this.currentAccount) || (i10 = this.Q0) == 2 || i10 == 3) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.SendMessageTitle);
                        int i12 = this.Q0;
                        if (i12 == 3) {
                            alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.TodoCantForward);
                        } else if (i12 == 2) {
                            alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.PublicPollCantForward);
                        } else {
                            alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.ChannelCantSendMessage);
                        }
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        showDialog(alertDialog$Builder.f19503a);
                        return false;
                    }
                    return true;
                }
                return true;
            } else if (DialogObject.isEncryptedDialog(j10)) {
                if (this.Q0 != 0 || this.R0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.f19503a.O = LocaleController.getString(R.string.SendMessageTitle);
                    int i13 = this.Q0;
                    if (i13 == 3) {
                        alertDialog$Builder2.f19503a.Q = LocaleController.getString(R.string.TodoCantForwardSecretChat);
                    } else if (i13 != 0) {
                        alertDialog$Builder2.f19503a.Q = LocaleController.getString(R.string.PollCantForwardSecretChat);
                    } else {
                        alertDialog$Builder2.f19503a.Q = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
                    }
                    alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    showDialog(alertDialog$Builder2.f19503a);
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
        boolean z4;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new cu(2));
        org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(this, view);
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
                    z4 = true;
                } else {
                    z4 = false;
                }
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                linearLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(getThemedColor(org.telegram.ui.ActionBar.j6.f19996i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
                z8Var.r(currentUser);
                eg.y yVar = new eg.y(this, getParentActivity(), z4);
                linearLayout.addView(yVar, k7.b6.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(getParentActivity());
                if (z4) {
                    p9Var.setScaleX(0.833f);
                    p9Var.setScaleY(0.833f);
                }
                p9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                p9Var.getImageReceiver().setCurrentAccount(intValue);
                p9Var.e(currentUser, z8Var);
                yVar.addView(p9Var, k7.b6.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20012j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, k7.b6.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new dg.m2(this, intValue, H, 15));
                H.r(linearLayout, k7.b6.n(230, 48));
            }
        }
        ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
        H.f27495z.set(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        H.W(b02);
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        H.V(5);
        H.Z();
    }

    @Override
    public final void prepareFragmentToSlide(boolean z4, boolean z10) {
        if (!z4 && z10) {
            this.W3 = true;
            B4(true);
            return;
        }
        this.X3 = null;
        this.W3 = false;
        B4(false);
        F4(1.0f);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        boolean presentFragment = super.presentFragment(p2Var);
        if (presentFragment && this.f37009b0 != null) {
            int i10 = 0;
            while (true) {
                ny[] nyVarArr = this.f37009b0;
                if (i10 >= nyVarArr.length) {
                    break;
                }
                nyVarArr[i10].d.getClass();
                i10++;
            }
        }
        ph.f3 f3Var = this.m0;
        if (f3Var != null) {
            f3Var.e(true);
        }
        ph.f3 f3Var2 = this.f37069n0;
        if (f3Var2 != null) {
            f3Var2.e(true);
        }
        org.telegram.ui.Components.ic.e();
        return presentFragment;
    }

    public final void q3(boolean z4) {
        th.i iVar;
        TLRPC.ChatFull chatFull;
        boolean z10;
        org.telegram.ui.Components.js jsVar = this.G1;
        if (jsVar != null && (iVar = this.N1) != null && (chatFull = this.W2) != null) {
            if (this.U2 != 0 && chatFull.requests_pending > 0 && !this.f37008b.f46893f) {
                z10 = true;
            } else {
                z10 = false;
            }
            jsVar.i(iVar, z10, z4);
            this.N1.setTitle(LocaleController.formatPluralString("CommunityPendingRequestsRow", this.W2.requests_pending, new Object[0]));
        }
    }

    public final void q4(int i10, long j10, TLRPC.Chat chat, boolean z4, boolean z10) {
        if (i10 == 103) {
            getMessagesController().deleteDialog(j10, 1, z10);
            return;
        }
        if (chat != null) {
            if (ChatObject.isNotInChat(chat)) {
                getMessagesController().deleteDialog(j10, 0, z10);
            } else {
                getMessagesController().deleteParticipantFromChat(-j10, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), (TLRPC.Chat) null, z10, false);
            }
        } else {
            getMessagesController().deleteDialog(j10, 0, z10);
            if (z4 && z10) {
                getMessagesController().blockPeer(j10);
            }
        }
        if (AndroidUtilities.isTablet()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(j10));
        }
        getMessagesController().checkIfFolderEmpty(this.S2);
    }

    public final void r3(ny nyVar) {
        final boolean z4;
        final boolean z10;
        final boolean z11;
        final boolean z12;
        int i10;
        boolean z13;
        int L0 = nyVar.f36743c.L0();
        int N0 = nyVar.f36743c.N0();
        if (!this.f37022d3 && !this.f37048i3) {
            nw nwVar = this.f37115w0;
            if (nwVar == null || nwVar.getVisibility() != 0 || !this.f37115w0.L) {
                int abs = Math.abs(N0 - L0) + 1;
                if (N0 != -1) {
                    f2.l1 K = nyVar.f36741a.K(N0);
                    if (K != null && K.f5788f == 11) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    this.Y1 = z13;
                    if (z13) {
                        c4(false);
                    }
                } else {
                    this.Y1 = false;
                }
                int i11 = nyVar.f36747s;
                if (i11 == 7 || i11 == 8) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
                    int i12 = nyVar.h;
                    if (i12 >= 0 && i12 < dialogFilters.size() && (dialogFilters.get(nyVar.h).flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) == 0 && ((abs > 0 && N0 >= R3(this.currentAccount, nyVar.f36747s, 1, this.P1).size() - 10) || (abs == 0 && !getMessagesController().isDialogsEndReached(1)))) {
                        boolean isDialogsEndReached = getMessagesController().isDialogsEndReached(1);
                        boolean z14 = !isDialogsEndReached;
                        if (isDialogsEndReached && getMessagesController().isServerDialogsEndReached(1)) {
                            z4 = z14;
                            z10 = false;
                        } else {
                            z4 = z14;
                            z10 = true;
                        }
                        if ((abs <= 0 && N0 >= R3(this.currentAccount, nyVar.f36747s, this.S2, this.P1).size() - 10) || (abs == 0 && (((i10 = nyVar.f36747s) == 7 || i10 == 8) && !getMessagesController().isDialogsEndReached(this.S2)))) {
                            boolean isDialogsEndReached2 = getMessagesController().isDialogsEndReached(this.S2);
                            boolean z15 = !isDialogsEndReached2;
                            if (isDialogsEndReached2 && getMessagesController().isServerDialogsEndReached(this.S2)) {
                                z12 = z15;
                                z11 = false;
                            } else {
                                z12 = z15;
                                z11 = true;
                            }
                        } else {
                            z11 = false;
                            z12 = false;
                        }
                        if (!z11 || z10) {
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    oy oyVar = oy.this;
                                    if (z11) {
                                        oyVar.getMessagesController().loadDialogs(oyVar.S2, -1, 100, z12);
                                    }
                                    if (z10) {
                                        oyVar.getMessagesController().loadDialogs(1, -1, 100, z4);
                                    } else {
                                        oyVar.getClass();
                                    }
                                }
                            });
                        }
                        return;
                    }
                }
                z10 = false;
                z4 = false;
                if (abs <= 0) {
                }
                z11 = false;
                z12 = false;
                if (!z11) {
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        oy oyVar = oy.this;
                        if (z11) {
                            oyVar.getMessagesController().loadDialogs(oyVar.S2, -1, 100, z12);
                        }
                        if (z10) {
                            oyVar.getMessagesController().loadDialogs(1, -1, 100, z4);
                        } else {
                            oyVar.getClass();
                        }
                    }
                });
            }
        }
    }

    public final void r4(ArrayList arrayList, int i10, boolean z4, boolean z10, HashSet hashSet) {
        MessagesController.DialogFilter dialogFilter;
        boolean z11;
        int i11;
        int i12;
        int i13;
        HashSet hashSet2;
        ArrayList arrayList2;
        ArrayList<TLRPC.Dialog> arrayList3;
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
        oy oyVar;
        int i18;
        boolean z12;
        boolean z13;
        org.telegram.ui.ActionBar.g3 g3Var;
        TLRPC.User tL_userEmpty;
        float f10;
        boolean z14;
        CharSequence string;
        TLRPC.User user2;
        TLRPC.User user3;
        CharSequence string2;
        oy oyVar2 = this;
        int i19 = i10;
        if (oyVar2.getParentActivity() == null) {
            return;
        }
        ?? r72 = 0;
        int i20 = oyVar2.f37009b0[0].f36747s;
        boolean z15 = (i20 == 7 || i20 == 8) && (!oyVar2.actionBar.s() || oyVar2.actionBar.t(null));
        if (z15) {
            dialogFilter = oyVar2.getMessagesController().selectedDialogFilter[oyVar2.f37009b0[0].f36747s == 8 ? (char) 1 : (char) 0];
        } else {
            dialogFilter = null;
        }
        int size = arrayList.size();
        if (i19 != 105 && i19 != 107) {
            if ((i19 == 100 || i19 == 108) && oyVar2.K2 != 0) {
                ArrayList<TLRPC.Dialog> dialogs = oyVar2.getMessagesController().getDialogs(oyVar2.S2);
                int size2 = dialogs.size();
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                while (i21 < size2) {
                    TLRPC.Dialog dialog = dialogs.get(i21);
                    if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                        if (oyVar2.g4(dialog)) {
                            arrayList3 = dialogs;
                            if (DialogObject.isEncryptedDialog(dialog.f19188id)) {
                                i23++;
                            } else {
                                i22++;
                            }
                        } else {
                            arrayList3 = dialogs;
                            if (!oyVar2.getMessagesController().isPromoDialog(dialog.f19188id, false)) {
                                break;
                            }
                        }
                    } else {
                        arrayList3 = dialogs;
                    }
                    i21++;
                    dialogs = arrayList3;
                }
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                for (int i27 = 0; i27 < size; i27++) {
                    Long l10 = (Long) arrayList.get(i27);
                    long longValue = l10.longValue();
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) oyVar2.getMessagesController().dialogs_dict.f(longValue);
                    if (dialog2 != null && !oyVar2.g4(dialog2)) {
                        if (DialogObject.isEncryptedDialog(longValue)) {
                            i25++;
                        } else {
                            i24++;
                        }
                        if (dialogFilter != null && dialogFilter.alwaysShow.contains(l10)) {
                            i26++;
                        }
                    }
                }
                if (z15) {
                    i13 = 100 - dialogFilter.alwaysShow.size();
                } else if (oyVar2.S2 == 0 && dialogFilter == null) {
                    i13 = oyVar2.getUserConfig().isPremium() ? oyVar2.getMessagesController().dialogFiltersPinnedLimitPremium : oyVar2.getMessagesController().dialogFiltersPinnedLimitDefault;
                } else if (UserConfig.getInstance(oyVar2.currentAccount).isPremium()) {
                    i13 = oyVar2.getMessagesController().maxFolderPinnedDialogsCountPremium;
                } else {
                    i13 = oyVar2.getMessagesController().maxFolderPinnedDialogsCountDefault;
                }
                if (i25 + i23 > i13 || (i24 + i22) - i26 > i13) {
                    if (oyVar2.S2 == 0 && dialogFilter == null) {
                        showDialog(new eg.v0(0, oyVar2.currentAccount, oyVar2.getParentActivity(), this, null));
                        return;
                    } else {
                        org.telegram.ui.Components.z4.u0(oyVar2, null, LocaleController.formatString("PinFolderLimitReached", R.string.PinFolderLimitReached, LocaleController.formatPluralString("Chats", i13, new Object[0])), null);
                        return;
                    }
                }
                hashSet2 = hashSet;
                arrayList2 = arrayList;
            } else if (i19 != 111) {
                hashSet2 = hashSet;
                arrayList2 = arrayList;
                if ((i19 == 102 || i19 == 103) && size > 1 && z4) {
                    HashSet hashSet3 = new HashSet();
                    boolean z16 = MessagesController.getInstance(oyVar2.currentAccount).canRevokePmInbox;
                    long j11 = MessagesController.getInstance(oyVar2.currentAccount).revokeTimePmLimit;
                    if (i19 == 102 && z16 && j11 == 2147483647L) {
                        int size3 = arrayList2.size();
                        z14 = false;
                        int i28 = 0;
                        while (i28 < size3) {
                            Object obj = arrayList2.get(i28);
                            i28++;
                            Long l11 = (Long) obj;
                            if (DialogObject.isUserDialog(l11.longValue()) || DialogObject.isEncryptedDialog(l11.longValue())) {
                                if (DialogObject.isEncryptedDialog(l11.longValue())) {
                                    TLRPC.EncryptedChat encryptedChat2 = oyVar2.getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(l11.longValue())));
                                    user2 = encryptedChat2 != null ? oyVar2.getMessagesController().getUser(Long.valueOf(encryptedChat2.user_id)) : null;
                                } else {
                                    user2 = oyVar2.getMessagesController().getUser(l11);
                                }
                                if (user2 != null) {
                                    ArrayList arrayList4 = (ArrayList) MessagesController.getInstance(oyVar2.currentAccount).dialogMessage.f(user2.f19331id);
                                    boolean z17 = (arrayList4 == null || arrayList4.size() != 1 || arrayList4.get(0) == null || ((MessageObject) arrayList4.get(0)).messageOwner == null || (!(((MessageObject) arrayList4.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionUserJoined) && !(((MessageObject) arrayList4.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
                                    if (!user2.bot && !UserObject.isDeleted(user2) && user2.f19331id != oyVar2.getUserConfig().getClientUserId() && !z17) {
                                        hashSet3.add(l11);
                                        z14 = true;
                                    }
                                }
                            }
                        }
                        f10 = 8.0f;
                    } else {
                        f10 = 8.0f;
                        z14 = false;
                    }
                    boolean z18 = i19 == 102;
                    int i29 = oyVar2.N2;
                    gg.a0 a0Var = new gg.a0(oyVar2, arrayList2, i19, hashSet3);
                    org.telegram.ui.ActionBar.f6 f6Var = oyVar2.resourceProvider;
                    Pattern pattern = org.telegram.ui.Components.z4.f31230a;
                    int currentAccount = oyVar2.getCurrentAccount();
                    Activity parentActivity = oyVar2.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, f6Var);
                    UserConfig.getInstance(currentAccount).getClientUserId();
                    org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
                    boolean[] zArr = new boolean[1];
                    TextView textView = new TextView(parentActivity);
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20012j5, false));
                    textView.setTextSize(1, 16.0f);
                    textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                    org.telegram.ui.Components.g3 g3Var2 = new org.telegram.ui.Components.g3(parentActivity, z1VarArr);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                    d2Var.D = 6;
                    alertDialog$Builder.n(g3Var2);
                    TextView textView2 = new TextView(parentActivity);
                    boolean z19 = z18;
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
                    textView2.setTextSize(1, 20.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    if (z19) {
                        if (z14) {
                            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(parentActivity, 1, f6Var);
                            z1VarArr[0] = z1Var;
                            z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                            z1VarArr[0].e(LocaleController.getString(R.string.DeleteMessagesForBothSidesWherePossible), "", false, false, false);
                            z1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(f10), 0, LocaleController.isRTL ? AndroidUtilities.dp(f10) : AndroidUtilities.dp(16.0f), 0);
                            g3Var2.addView(z1VarArr[0], k7.b6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                            z1VarArr[0].setOnClickListener(new org.telegram.ui.Components.t0(2, zArr));
                        }
                        textView2.setText(LocaleController.formatString("DeleteFewChatsTitle", R.string.DeleteFewChatsTitle, LocaleController.formatPluralString("ChatsSelected", size, new Object[0])));
                        textView.setText(LocaleController.getString("AreYouSureDeleteFewChats", R.string.AreYouSureDeleteFewChats));
                    } else if (i29 != 0) {
                        textView2.setText(LocaleController.formatString("ClearCacheFewChatsTitle", R.string.ClearCacheFewChatsTitle, LocaleController.formatPluralString("ChatsSelectedClearCache", size, new Object[0])));
                        textView.setText(LocaleController.getString("AreYouSureClearHistoryCacheFewChats", R.string.AreYouSureClearHistoryCacheFewChats));
                    } else {
                        textView2.setText(LocaleController.formatString("ClearFewChatsTitle", R.string.ClearFewChatsTitle, LocaleController.formatPluralString("ChatsSelectedClear", size, new Object[0])));
                        textView.setText(LocaleController.getString("AreYouSureClearHistoryFewChats", R.string.AreYouSureClearHistoryFewChats));
                    }
                    g3Var2.addView(textView2, k7.b6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
                    g3Var2.addView(textView, k7.b6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                    if (z19) {
                        string = LocaleController.getString("Delete", R.string.Delete);
                    } else if (i29 != 0) {
                        string = LocaleController.getString("ClearHistoryCache", R.string.ClearHistoryCache);
                    } else {
                        string = LocaleController.getString("ClearHistory", R.string.ClearHistory);
                    }
                    alertDialog$Builder.k(string, new org.telegram.ui.Components.o1(4, a0Var, zArr));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    oyVar2.showDialog(d2Var);
                    TextView textView3 = (TextView) d2Var.d(-1);
                    if (textView3 != null) {
                        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
                        return;
                    }
                    return;
                } else if (i19 == 106 && z4) {
                    if (size == 1) {
                        Long l12 = (Long) arrayList2.get(0);
                        l12.getClass();
                        user3 = oyVar2.getMessagesController().getUser(l12);
                    } else {
                        user3 = null;
                    }
                    boolean z20 = oyVar2.O2 != 0;
                    qs qsVar = new qs(6, oyVar2, arrayList2);
                    Pattern pattern2 = org.telegram.ui.Components.z4.f31230a;
                    if (oyVar2.getParentActivity() != null) {
                        if (size == 1 && user3 == null) {
                            return;
                        }
                        Activity parentActivity2 = oyVar2.getParentActivity();
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity2);
                        View[] viewArr = new org.telegram.ui.Cells.z1[2];
                        LinearLayout linearLayout = new LinearLayout(parentActivity2);
                        linearLayout.setOrientation(1);
                        alertDialog$Builder2.n(linearLayout);
                        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19503a;
                        if (size == 1) {
                            String formatName = ContactsController.formatName(user3.first_name, user3.last_name);
                            d2Var2.O = LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, formatName);
                            string2 = LocaleController.getString(R.string.BlockUser);
                            d2Var2.Q = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserMessage", R.string.BlockUserMessage, formatName));
                        } else {
                            d2Var2.O = LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, LocaleController.formatPluralString("UsersCountTitle", size, new Object[0]));
                            string2 = LocaleController.getString(R.string.BlockUsers);
                            d2Var2.Q = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUsersMessage", R.string.BlockUsersMessage, LocaleController.formatPluralString("UsersCount", size, new Object[0])));
                        }
                        int i30 = 2;
                        boolean[] zArr2 = {true, true};
                        int i31 = 0;
                        while (i31 < i30) {
                            if (i31 != 0 || z20) {
                                View z1Var2 = new org.telegram.ui.Cells.z1(parentActivity2, 1);
                                viewArr[i31] = z1Var2;
                                z1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(r72));
                                if (i31 == 0) {
                                    viewArr[i31].e(LocaleController.getString(R.string.ReportSpamTitle), "", true, false, false);
                                } else {
                                    viewArr[i31].e(LocaleController.getString(size == 1 ? R.string.DeleteThisChatBothSides : R.string.DeleteTheseChatsBothSides), "", true, false, false);
                                }
                                viewArr[i31].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), r72, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), r72);
                                linearLayout.addView(viewArr[i31], k7.b6.n(-1, 48));
                                viewArr[i31].setOnClickListener(new lh.y0(zArr2, i31, 4));
                            }
                            i31++;
                            i30 = 2;
                            r72 = 0;
                        }
                        alertDialog$Builder2.k(string2, new org.telegram.ui.Components.o1(8, qsVar, zArr2));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        oyVar2.showDialog(d2Var2);
                        TextView textView4 = (TextView) d2Var2.d(-1);
                        if (textView4 != null) {
                            textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else if (z4) {
                org.telegram.ui.Components.z4.v0(this, LocaleController.getString(R.string.CommunityUngroupChats), LocaleController.getString(R.string.CommunityUngroupChatsText), LocaleController.getString(R.string.CommunityUngroupChatsButton), true, new aw(oyVar2, arrayList, i19, z10, hashSet));
                return;
            } else {
                hashSet2 = hashSet;
                arrayList2 = arrayList;
                int size4 = arrayList2.size();
                int i32 = 0;
                while (i32 < size4) {
                    Object obj2 = arrayList2.get(i32);
                    i32++;
                    oyVar2.getMessagesController().toggleCommunityCollapsedInDialogs(-((Long) obj2).longValue(), false);
                }
            }
            int i33 = Integer.MAX_VALUE;
            if (dialogFilter != null && ((i19 == 100 || i19 == 108) && oyVar2.K2 != 0)) {
                int size5 = dialogFilter.pinnedDialogs.size();
                for (int i34 = 0; i34 < size5; i34++) {
                    i33 = Math.min(i33, dialogFilter.pinnedDialogs.valueAt(i34));
                }
                i33 -= oyVar2.K2;
            }
            int i35 = i33;
            int i36 = 0;
            int i37 = 0;
            while (i36 < size) {
                Long l13 = (Long) arrayList2.get(i36);
                long longValue2 = l13.longValue();
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) oyVar2.getMessagesController().dialogs_dict.f(longValue2);
                if (dialog3 == null) {
                    i16 = i19;
                    i17 = i35;
                    i15 = i36;
                    dialogFilter3 = dialogFilter;
                } else {
                    if (DialogObject.isEncryptedDialog(longValue2)) {
                        encryptedChat = org.telegram.messenger.y3.n(oyVar2.getMessagesController(), longValue2);
                        if (encryptedChat != null) {
                            i15 = i36;
                            dialogFilter2 = dialogFilter;
                            tL_userEmpty = oyVar2.getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
                        } else {
                            i15 = i36;
                            dialogFilter2 = dialogFilter;
                            tL_userEmpty = new TLRPC.TL_userEmpty();
                        }
                        user = tL_userEmpty;
                        chat = null;
                    } else {
                        i15 = i36;
                        dialogFilter2 = dialogFilter;
                        if (DialogObject.isUserDialog(longValue2)) {
                            user = oyVar2.getMessagesController().getUser(l13);
                            chat = null;
                        } else {
                            chat = oyVar2.getMessagesController().getChat(Long.valueOf(-longValue2));
                            user = null;
                        }
                        encryptedChat = null;
                    }
                    if (chat == null && user == null) {
                        i16 = i19;
                        i17 = i35;
                        dialogFilter3 = dialogFilter2;
                    } else {
                        boolean z21 = (user == null || !user.bot || MessagesController.isSupportUser(user)) ? false : true;
                        if (i19 != 100 && i19 != 108) {
                            if (i19 == 101) {
                                if (oyVar2.J2 != 0) {
                                    oyVar2.j4(longValue2);
                                } else {
                                    oyVar2.getMessagesController().markDialogAsUnread(longValue2, null, 0L);
                                }
                                i16 = i19;
                                i17 = i35;
                                dialogFilter3 = dialogFilter2;
                                i36 = i15 + 1;
                                dialogFilter = dialogFilter3;
                                i35 = i17;
                                i19 = i16;
                            } else {
                                if (i19 == 102) {
                                    oyVar = oyVar2;
                                    i18 = 1;
                                } else if (i19 == 103) {
                                    oyVar = oyVar2;
                                    i18 = 1;
                                } else if (i19 != 104) {
                                    i16 = i19;
                                    i17 = i35;
                                    dialogFilter3 = dialogFilter2;
                                    i36 = i15 + 1;
                                    dialogFilter = dialogFilter3;
                                    i35 = i17;
                                    i19 = i16;
                                } else if (size == 1 && oyVar2.L2 == 1) {
                                    oy oyVar3 = oyVar2;
                                    oyVar3.showDialog(org.telegram.ui.Components.z4.F(longValue2, 0L, oyVar3, null), new nv(oyVar3, 2));
                                    return;
                                } else {
                                    oy oyVar4 = oyVar2;
                                    if (oyVar4.M2 != 0) {
                                        if (oyVar4.getMessagesController().isDialogMuted(longValue2, 0L)) {
                                            oyVar4.getNotificationsController().setDialogNotificationsSettings(longValue2, 0L, 4);
                                        }
                                        i17 = i35;
                                        oyVar2 = oyVar4;
                                        dialogFilter3 = dialogFilter2;
                                    } else if (z10) {
                                        Pattern pattern3 = org.telegram.ui.Components.z4.f31230a;
                                        if (oyVar4.getParentActivity() == null) {
                                            g3Var = null;
                                        } else {
                                            org.telegram.ui.ActionBar.g3 g3Var3 = new org.telegram.ui.ActionBar.g3(oyVar4.getParentActivity(), null, false, false);
                                            g3Var3.fixNavigationBar();
                                            g3Var3.title = LocaleController.getString(R.string.Notifications);
                                            g3Var3.bigTitle = true;
                                            String formatString = LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 1, new Object[0]));
                                            String formatString2 = LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 8, new Object[0]));
                                            String formatString3 = LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Days", 2, new Object[0]));
                                            String string3 = LocaleController.getString(R.string.MuteDisable);
                                            CharSequence[] charSequenceArr = new CharSequence[4];
                                            charSequenceArr[0] = formatString;
                                            charSequenceArr[1] = formatString2;
                                            charSequenceArr[2] = formatString3;
                                            charSequenceArr[r16] = string3;
                                            cg.u1 u1Var = new cg.u1(arrayList2, oyVar4);
                                            g3Var3.items = charSequenceArr;
                                            g3Var3.onClickListener = u1Var;
                                            g3Var = g3Var3;
                                        }
                                        oyVar4.showDialog(g3Var, new nv(oyVar4, 3));
                                        return;
                                    } else {
                                        if (!oyVar4.getMessagesController().isDialogMuted(longValue2, 0L)) {
                                            oyVar4.getNotificationsController().setDialogNotificationsSettings(longValue2, 0L, 3);
                                        }
                                        i17 = i35;
                                        oyVar2 = oyVar4;
                                        dialogFilter3 = dialogFilter2;
                                        r16 = 3;
                                    }
                                    i16 = i19;
                                    i36 = i15 + 1;
                                    dialogFilter = dialogFilter3;
                                    i35 = i17;
                                    i19 = i16;
                                }
                                if (size == i18) {
                                    if (i19 == 102 && oyVar.R2) {
                                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(oyVar.getParentActivity());
                                        String string4 = LocaleController.getString(R.string.PsaHideChatAlertTitle);
                                        org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.f19503a;
                                        d2Var3.O = string4;
                                        d2Var3.Q = LocaleController.getString(R.string.PsaHideChatAlertText);
                                        alertDialog$Builder3.k(LocaleController.getString(R.string.PsaHide), new sv(oyVar, 11));
                                        alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                                        oyVar.showDialog(d2Var3);
                                        return;
                                    }
                                    org.telegram.ui.Components.z4.s(this, i19 == 103, chat, user, DialogObject.isEncryptedDialog(dialog3.f19188id), i19 == 102, false, false, new lw(oyVar, i19, chat, longValue2, z21));
                                    return;
                                }
                                boolean z22 = z21;
                                TLRPC.Chat chat2 = chat;
                                if (oyVar.getMessagesController().isPromoDialog(longValue2, true)) {
                                    oyVar.getMessagesController().hidePromoDialog();
                                    i17 = i35;
                                    oyVar2 = oyVar;
                                    dialogFilter3 = dialogFilter2;
                                } else if (i19 == 103 && oyVar.N2 != 0) {
                                    oyVar.getMessagesController().deleteDialog(longValue2, 2, false);
                                    i17 = i35;
                                    oyVar2 = oyVar;
                                    dialogFilter3 = dialogFilter2;
                                } else {
                                    if (hashSet2 == null || !hashSet2.contains(l13)) {
                                        z12 = z22;
                                        z13 = false;
                                    } else {
                                        z12 = z22;
                                        z13 = true;
                                    }
                                    oyVar2 = oyVar;
                                    oyVar2.q4(i19, longValue2, chat2, z12, z13);
                                    i16 = i19;
                                    i17 = i35;
                                    dialogFilter3 = dialogFilter2;
                                    i36 = i15 + 1;
                                    dialogFilter = dialogFilter3;
                                    i35 = i17;
                                    i19 = i16;
                                }
                                i16 = i19;
                                i36 = i15 + 1;
                                dialogFilter = dialogFilter3;
                                i35 = i17;
                                i19 = i16;
                            }
                        }
                        i16 = i19;
                        if (oyVar2.K2 != 0) {
                            if (!oyVar2.g4(dialog3)) {
                                i37++;
                                i17 = i35;
                                dialogFilter3 = dialogFilter2;
                                oyVar2.s4(longValue2, true, dialogFilter3, i17, size == 1);
                                if (dialogFilter3 != null) {
                                    int i38 = i17 + 1;
                                    if (encryptedChat != null) {
                                        if (!dialogFilter3.alwaysShow.contains(Long.valueOf(encryptedChat.user_id))) {
                                            dialogFilter3.alwaysShow.add(Long.valueOf(encryptedChat.user_id));
                                        }
                                    } else if (!dialogFilter3.alwaysShow.contains(Long.valueOf(dialog3.f19188id))) {
                                        dialogFilter3.alwaysShow.add(Long.valueOf(dialog3.f19188id));
                                    }
                                    i17 = i38;
                                }
                            }
                            i17 = i35;
                            dialogFilter3 = dialogFilter2;
                        } else {
                            i17 = i35;
                            dialogFilter3 = dialogFilter2;
                            if (oyVar2.g4(dialog3)) {
                                i37++;
                                oyVar2.s4(longValue2, false, dialogFilter3, i17, size == 1);
                                i36 = i15 + 1;
                                dialogFilter = dialogFilter3;
                                i35 = i17;
                                i19 = i16;
                            }
                        }
                        i36 = i15 + 1;
                        dialogFilter = dialogFilter3;
                        i35 = i17;
                        i19 = i16;
                    }
                }
                i36 = i15 + 1;
                dialogFilter = dialogFilter3;
                i35 = i17;
                i19 = i16;
            }
            int i39 = i19;
            MessagesController.DialogFilter dialogFilter4 = dialogFilter;
            int i40 = 108;
            if (i39 == 104 && (size != 1 || oyVar2.L2 != 1)) {
                org.telegram.ui.Components.qc.A(oyVar2, oyVar2.M2 == 0, null).j();
            }
            if (i39 == 100 || i39 == 108) {
                if (dialogFilter4 != null) {
                    oy oyVar5 = oyVar2;
                    b10.t0(dialogFilter4, dialogFilter4.flags, dialogFilter4.name, dialogFilter4.entities, dialogFilter4.title_noanimate, dialogFilter4.color, dialogFilter4.alwaysShow, dialogFilter4.neverShow, dialogFilter4.pinnedDialogs, false, false, true, true, false, oyVar5, null);
                    oyVar2 = oyVar5;
                    j10 = 0;
                } else {
                    j10 = 0;
                    oyVar2.getMessagesController().reorderPinnedDialogs(oyVar2.S2, null, 0L);
                }
                UndoView Y3 = oyVar2.Y3();
                if (oyVar2.f37066m3 && Y3 != null) {
                    Y3.m(j10, Integer.valueOf(i37), oyVar2.K2 != 0 ? 78 : 79);
                }
                i14 = i10;
                i40 = 108;
            } else {
                i14 = i39;
            }
            oyVar2.b4((i14 == i40 || i14 == 100 || i14 == 102) ? false : true);
            return;
        }
        ArrayList<Long> arrayList5 = new ArrayList<>(arrayList);
        oyVar2.getMessagesController().addDialogToFolder(arrayList5, oyVar2.P2 == 0 ? 1 : 0, -1, null, 0L);
        if (oyVar2.P2 == 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            z11 = false;
            boolean z23 = globalMainSettings.getBoolean("archivehint_l", false) || SharedConfig.archiveHidden;
            if (z23) {
                i11 = 1;
            } else {
                i11 = 1;
                globalMainSettings.edit().putBoolean("archivehint_l", true).commit();
            }
            if (z23) {
                i12 = arrayList5.size() > i11 ? 4 : 2;
            } else {
                i12 = arrayList5.size() > i11 ? 5 : 3;
            }
            UndoView Y32 = oyVar2.Y3();
            if (Y32 != null) {
                Y32.l(0L, i12, null, new org.telegram.ui.Components.k41(19, oyVar2, arrayList5));
            }
        } else {
            z11 = false;
            ArrayList<TLRPC.Dialog> dialogs2 = oyVar2.getMessagesController().getDialogs(oyVar2.S2);
            if (oyVar2.f37009b0 != null && dialogs2.isEmpty() && !oyVar2.H) {
                oyVar2.f37009b0[0].f36741a.setEmptyView(null);
                oyVar2.f37009b0[0].f36748w.setVisibility(4);
                oyVar2.finishFragment();
            }
        }
        oyVar2.b4(z11);
    }

    @Override
    public final void s() {
        x4(true, true);
    }

    public final void s3() {
        if (this.f37009b0 != null) {
            int n32 = n3();
            int i10 = 0;
            while (true) {
                ny[] nyVarArr = this.f37009b0;
                if (i10 < nyVarArr.length) {
                    ny nyVar = nyVarArr[i10];
                    if (nyVar != null) {
                        ky kyVar = nyVar.f36741a;
                        kyVar.setPadding(0, kyVar.V2, 0, n32);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void s4(long r14, boolean r16, org.telegram.messenger.MessagesController.DialogFilter r17, int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oy.s4(long, boolean, org.telegram.messenger.MessagesController$DialogFilter, int, boolean):void");
    }

    @Override
    public final void setInPreviewMode(boolean z4) {
        super.setInPreviewMode(z4);
        gx gxVar = this.B0;
        if (gxVar != null) {
            if (this.D0 && !z4) {
                gxVar.setVisibility(0);
            } else {
                gxVar.setVisibility(8);
            }
        }
        Y4(true);
        U4();
    }

    @Override
    public final void setTitleOverlayText(java.lang.String r6, int r7, java.lang.Runnable r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oy.setTitleOverlayText(java.lang.String, int, java.lang.Runnable):void");
    }

    public final void t3() {
        ug.f fVar = this.f37111v1;
        if (fVar != null) {
            fVar.setBlurredBottomHeight(this.f37111v1.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        }
    }

    public final void t4() {
        if (this.H0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / 180));
        this.H0.setBackground(new BitmapDrawable(createBitmap));
        this.H0.setAlpha(0.0f);
        this.H0.setVisibility(0);
        B3();
    }

    public final void u3() {
        int i10;
        ny nyVar;
        boolean z4 = true;
        float S3 = S3(true);
        nw nwVar = this.f37115w0;
        if (nwVar != null) {
            if (nwVar.getAlpha() == S3) {
                z4 = false;
            }
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, S3);
            this.f37115w0.setAlpha(S3);
            this.f37115w0.setScaleX(lerp);
            this.f37115w0.setScaleY(lerp);
            nw nwVar2 = this.f37115w0;
            if (S3 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            nwVar2.setVisibility(i10);
            if (z4 && (nyVar = this.f37009b0[0]) != null) {
                nyVar.f36741a.requestLayout();
            }
        }
        S4();
    }

    public final void u4(ny nyVar) {
        int i10;
        org.telegram.ui.Components.t00 t00Var;
        if (nyVar.getVisibility() != 0) {
            return;
        }
        int i11 = nyVar.d.v;
        if (nyVar.f36747s == 0 && Z3() && nyVar.f36741a.getChildCount() == 0 && nyVar.v == 2) {
            ((f2.i0) nyVar.f36741a.getLayoutManager()).h1(1, (int) this.K);
        }
        nyVar.d.getClass();
        nyVar.d.U();
        int h = nyVar.d.h();
        if (h == 1 && i11 == 1 && nyVar.d.j(0) == 5) {
            nyVar.q(true);
        } else {
            nyVar.q(false);
            if (h > i11 && (i10 = this.O0) != 11 && i10 != 12 && i10 != 13) {
                nyVar.f36750y.b(i11);
            }
        }
        try {
            ky kyVar = nyVar.f36741a;
            if (this.S2 == 0 && this.U2 == 0) {
                t00Var = nyVar.f36748w;
            } else {
                t00Var = null;
            }
            kyVar.setEmptyView(t00Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
        r3(nyVar);
    }

    public final void v3() {
        int i10;
        int i11;
        float f10 = this.f37068n.e;
        float lerp = AndroidUtilities.lerp(0.2f, 1.0f, f10);
        org.telegram.ui.Components.qp0 qp0Var = this.f37130z1;
        int i12 = 8;
        if (qp0Var != null) {
            qp0Var.setScaleX(lerp);
            this.f37130z1.setScaleY(lerp);
            this.f37130z1.setAlpha(f10);
            org.telegram.ui.Components.qp0 qp0Var2 = this.f37130z1;
            if (f10 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            qp0Var2.setVisibility(i11);
        }
        ug.f fVar = this.f37111v1;
        if (fVar != null) {
            fVar.setAlpha(f10);
            ug.f fVar2 = this.f37111v1;
            int i13 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i13 > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            fVar2.setVisibility(i10);
            this.f37111v1.getFadeView().setAlpha(f10);
            View fadeView = this.f37111v1.getFadeView();
            if (i13 > 0) {
                i12 = 0;
            }
            fadeView.setVisibility(i12);
        }
    }

    public final void v4() {
        boolean z4;
        float f10 = 0.0f;
        if (this.K != 0.0f && !(z4 = this.H)) {
            if (z4) {
                f10 = -U3();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.D3, f10));
            animatorSet.setInterpolator(org.telegram.ui.Components.nr.f27346f);
            animatorSet.setDuration(250L);
            animatorSet.start();
        }
    }

    public final void w3() {
        if (this.actionBar == null) {
            return;
        }
        org.telegram.ui.Components.z10.d(this.actionBar.getBackButton(), Math.max(this.f37087q3, (1.0f - this.f37008b.e) * (1.0f - V3()) * (1.0f - this.f37014c.e)));
    }

    public final void w4(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oy.w4(int):void");
    }

    public final void x3() {
        float f10;
        if (this.f37030f0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.z10.d(this.f37019d0, e2.c.z(f10, 1.0f - this.f37008b.e, 1.0f - V3(), 1.0f - this.f37014c.e));
    }

    public final void x4(boolean z4, boolean z10) {
        int i10;
        int i11;
        jx jxVar = this.C3;
        if (jxVar != null && jxVar.c()) {
            return;
        }
        if (this.f37009b0[0].f36747s == 0 && Z3() && this.f37009b0[0].v == 2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.H && !z10 && !this.B0.g()) {
            i11 = -AndroidUtilities.dp(81.0f);
        } else {
            i11 = 0;
        }
        if (z4) {
            c2.y yVar = this.f37009b0[0].f36746r;
            yVar.f2031b = 1;
            yVar.c(i10, i11, false, false);
            v4();
            return;
        }
        this.f37009b0[0].f36743c.h1(i10, i11);
        v4();
    }

    @Override
    public final sg.d y() {
        return this.f37059k4;
    }

    public final void y3() {
        float f10;
        if (SharedConfig.passcodeHash.isEmpty()) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        org.telegram.ui.Components.z10.d(this.f37015c0, e2.c.z(f10, 1.0f - this.f37008b.e, 1.0f - V3(), 1.0f - this.f37014c.e));
    }

    public final void y4(String str, boolean z4) {
        O4(true, false, true, false);
        ey eyVar = this.U;
        if (eyVar != null) {
            eyVar.f23815r.setText(str);
            this.U.f23815r.setSelection(str.length());
        }
    }

    @Override
    public final void z(float f10, int i10) {
        org.telegram.ui.ActionBar.w0 w0Var;
        if (i10 == 3 && (w0Var = this.f37045i0) != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) w0Var.getIconView().getDrawable();
            if (this.d.f46893f) {
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
        float f10;
        if (this.O0 != 2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.z10.d(this.f37035g0, e2.c.z(f10, this.f37029f.e, 1.0f - V3(), 1.0f - this.f37014c.e));
        gx gxVar = this.B0;
        if (gxVar != null) {
            gxVar.invalidate();
        }
    }

    public final void z4(float f10) {
        ny[] nyVarArr;
        this.Z = f10;
        for (ny nyVar : this.f37009b0) {
            ky kyVar = nyVar.f36741a;
            for (int i10 = 0; i10 < kyVar.getChildCount(); i10++) {
                View childAt = kyVar.getChildAt(i10);
                if (childAt != null && RecyclerView.R(childAt) >= nyVar.d.f44761f + 1) {
                    childAt.setAlpha(f10);
                }
            }
        }
    }
}

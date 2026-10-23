package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.webrtc.voiceengine.WebRtcAudioTrack;
public final class q50 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, ne.d {
    public static q50 D3;
    public static boolean E3;
    public static boolean F3;
    public static boolean G3;
    public static volatile DispatchQueue H3 = new DispatchQueue("updateTextureLightningQueue");
    public static boolean I3;
    public TLRPC.Peer A0;
    public final TextView A1;
    public final a6 A2;
    public final ne.b A3;
    public TLObject B0;
    public final o50 B1;
    public final LongSparseIntArray B2;
    public final ne.e B3;
    public final Paint C0;
    public final qh.i C1;
    public final k30 C2;
    public final ne.b C3;
    public final ArrayList D0;
    public c20 D1;
    public final i30 D2;
    public final Paint E;
    public final ArrayList E0;
    public org.telegram.ui.Components.a40 E1;
    public LinearLayout E2;
    public final s30 F;
    public final ArrayList F0;
    public int F1;
    public boolean F2;
    public final r30 G;
    public final ArrayList G0;
    public boolean G1;
    public final org.telegram.ui.Components.vj0 G2;
    public final p30 H;
    public final ArrayList H0;
    public boolean H1;
    public int H2;
    public final ImageView I;
    public int I0;
    public final Paint I1;
    public boolean I2;
    public final ImageView J;
    public final org.telegram.ui.Components.vj0 J0;
    public final Paint J1;
    public final View J2;
    public org.telegram.ui.Components.dl0 K;
    public final org.telegram.ui.Components.vj0 K0;
    public final p50[] K1;
    public final View K2;
    public final u40 L;
    public boolean L0;
    public float L1;
    public GradientDrawable L2;
    public final org.telegram.ui.Components.q6 M;
    public final org.telegram.ui.Components.ba M0;
    public p50 M1;
    public final int[] M2;
    public final a30 N;
    public final org.telegram.ui.Components.ba N0;
    public p50 N1;
    public final e30 N2;
    public final m40 O;
    public float O0;
    public long O1;
    public boolean O2;
    public final k50 P;
    public float P0;
    public float P1;
    public boolean P2;
    public final w40 Q;
    public float Q0;
    public float Q1;
    public RenderNode Q2;
    public final y30 R;
    public RadialGradient R0;
    public boolean R1;
    public float R2;
    public final TextView S;
    public final Matrix S0;
    public boolean S1;
    public boolean S2;
    public final w30 T;
    public final Paint T0;
    public int T1;
    public final String[] T2;
    public final org.telegram.ui.ActionBar.j5 U;
    public final f50 U0;
    public float U1;
    public ObjectAnimator U2;
    public final v40 V;
    public float V0;
    public int V1;
    public ObjectAnimator V2;
    public final org.telegram.ui.ActionBar.j5 W;
    public float W0;
    public boolean W1;
    public final e40 W2;
    public final e50 X;
    public ValueAnimator X0;
    public final int[] X1;
    public org.telegram.ui.Cells.d4 X2;
    public final org.telegram.ui.Components.xz Y;
    public TLRPC.InputPeer Y0;
    public final ArrayList Y1;
    public org.telegram.ui.Components.voip.l Y2;
    public final ImageReceiver Z;
    public TLRPC.Chat Z0;
    public final ArrayList Z1;
    public org.telegram.ui.Components.voip.t Z2;
    public int f40379a0;
    public ChatObject.Call f40380a1;
    public final h30 a2;
    public org.telegram.ui.Components.z20 f40381a3;
    public final j30 f40382b;
    public final ImageView f40383b0;
    public final boolean f40384b1;
    public final m30 f40385b2;
    public boolean f40386b3;
    public final o20 f40387c;
    public final mh.h f40388c0;
    public final String f40389c1;
    public final z30 f40390c2;
    public boolean f40391c3;
    public final AccountInstance d;
    public final int f40392d0;
    public final l50 f40393d1;
    public float f40394d2;
    public int f40395d3;
    public final u20 e;
    public final RadialProgressView f40396e0;
    public final z20 f40397e1;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f40398e2;
    public AnimatorSet f40399e3;
    public final org.telegram.ui.Components.voip.t2 f40400f;
    public final Drawable f40401f0;
    public final b30 f40402f1;
    public boolean f40403f2;
    public q40 f40404f3;
    public final View f40405g0;
    public final Paint f40406g1;
    public boolean f40407g2;
    public int f40408g3;
    public final org.telegram.ui.Components.voip.t2 h;
    public AnimatorSet f40409h0;
    public ValueAnimator f40410h1;
    public org.telegram.ui.Components.e50 f40411h2;
    public int f40412h3;
    public LaunchActivity f40413i0;
    public float f40414i1;
    public y40 f40415i2;
    public int f40416i3;
    public final UndoView[] f40417j0;
    public final LinearLayout f40418j1;
    public Boolean f40419j2;
    public int f40420j3;
    public final org.telegram.ui.Cells.k f40421k0;
    public final org.telegram.ui.ActionBar.u0 f40422k1;
    public int f40423k2;
    public int f40424k3;
    public boolean f40425l0;
    public final org.telegram.ui.ActionBar.u0 l1;
    public boolean f40426l2;
    public int f40427l3;
    public org.telegram.ui.Components.r40 m0;
    public final org.telegram.ui.ActionBar.u0 f40428m1;
    public final d30 f40429m2;
    public int f40430m3;
    public final org.telegram.ui.Components.voip.t2 f40431n;
    public org.telegram.ui.Components.r40 f40432n0;
    public final org.telegram.ui.ActionBar.e1 f40433n1;
    public final org.telegram.ui.Components.jm0 f40434n2;
    public int f40435n3;
    public int f40436o0;
    public final org.telegram.ui.ActionBar.e1 f40437o1;
    public final w50 f40438o2;
    public int f40439o3;
    public b50 f40440p0;
    public final org.telegram.ui.ActionBar.e1 f40441p1;
    public final org.telegram.ui.Components.a30 f40442p2;
    public int f40443p3;
    public final ArrayList f40444q0;
    public final org.telegram.ui.ActionBar.e1 f40445q1;
    public ViewTreeObserver.OnPreDrawListener f40446q2;
    public int f40447q3;
    public final org.telegram.ui.Components.voip.t2 f40448r;
    public k40 f40449r0;
    public final org.telegram.ui.ActionBar.e1 f40450r1;
    public final org.telegram.ui.Components.voip.h f40451r2;
    public int f40452r3;
    public final org.telegram.ui.Components.voip.t2 f40453s;
    public boolean f40454s0;
    public final org.telegram.ui.ActionBar.e1 f40455s1;
    public boolean f40456s2;
    public int f40457s3;
    public long f40458t0;
    public final org.telegram.ui.ActionBar.e1 f40459t1;
    public final ArrayList f40460t2;
    public int f40461t3;
    public boolean f40462u0;
    public final org.telegram.ui.ActionBar.e1 f40463u1;
    public boolean f40464u2;
    public int f40465u3;
    public final org.telegram.ui.Components.voip.t2 v;
    public final RectF f40466v0;
    public final org.telegram.ui.ActionBar.e1 f40467v1;
    public final c20 f40468v2;
    public int f40469v3;
    public final org.telegram.ui.Components.voip.t2 f40470w;
    public boolean f40471w0;
    public final org.telegram.ui.ActionBar.e1 f40472w1;
    public final y20 f40473w2;
    public final r40 f40474w3;
    public final v20 f40475x;
    public boolean f40476x0;
    public final org.telegram.ui.ActionBar.e1 f40477x1;
    public final org.telegram.ui.Components.rc f40478x2;
    public Boolean f40479x3;
    public final ImageView f40480y;
    public float f40481y0;
    public final org.telegram.ui.ActionBar.e1 f40482y1;
    public final c20 f40483y2;
    public Integer y3;
    public b40 f40484z0;
    public final LinearLayout f40485z1;
    public boolean f40486z2;
    public final ne.b f40487z3;

    public q50(final LaunchActivity launchActivity, AccountInstance accountInstance, ChatObject.Call call, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        super((Context) launchActivity, (org.telegram.ui.ActionBar.d6) null, true, true);
        String string;
        int i10;
        final LaunchActivity launchActivity2;
        q50 q50Var;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.E = new Paint(1);
        this.f40417j0 = new UndoView[2];
        this.f40444q0 = new ArrayList();
        this.f40466v0 = new RectF();
        this.C0 = new Paint(1);
        this.D0 = new ArrayList();
        this.E0 = new ArrayList();
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new ArrayList();
        this.C1 = new qh.i(new c20(this, 8));
        this.F1 = 0;
        this.G1 = false;
        this.I1 = new Paint(7);
        this.J1 = new Paint(7);
        this.K1 = new p50[8];
        this.L1 = 1.0f;
        this.W1 = true;
        this.X1 = new int[4];
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.f40451r2 = new org.telegram.ui.Components.voip.h();
        this.f40460t2 = new ArrayList();
        this.f40468v2 = new c20(this, 0);
        this.f40473w2 = new y20(this);
        this.f40478x2 = new org.telegram.ui.Components.rc(24);
        this.f40483y2 = new c20(this, 1);
        this.f40486z2 = false;
        this.A2 = new a6(this, 6);
        this.B2 = new LongSparseIntArray();
        this.M2 = new int[2];
        this.P2 = true;
        this.T2 = new String[2];
        this.f40395d3 = -1;
        this.f40474w3 = new r40(this);
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f25025f;
        this.f40487z3 = new ne.b(2, this, bsVar, 350L);
        this.A3 = new ne.b(3, this, bsVar, 220L, true);
        this.B3 = new ne.e(4, this, bsVar, 350L);
        this.C3 = new ne.b(5, this, bsVar, 350L);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        setOpenNoDelay(true);
        this.d = accountInstance;
        this.f40380a1 = call;
        this.Y0 = inputPeer;
        this.Z0 = chat;
        this.f40389c1 = str;
        this.currentAccount = accountInstance.getCurrentAccount();
        this.f40384b1 = z10;
        this.resourcesProvider = new ci.k0();
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.f40392d0 = MessagesController.getInstance(this.currentAccount).config.groupCallMessageLengthLimit.get();
        this.fullWidth = true;
        G3 = false;
        F3 = false;
        I3 = false;
        setDelegate(new t30(this));
        this.drawDoubleNavigationBar = true;
        this.drawNavigationBar = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.W2 = new e40(this);
        setOnDismissListener(new g20(this, 0));
        setDimBehindAlpha(75);
        k50 k50Var = new k50(this, launchActivity);
        this.P = k50Var;
        org.telegram.ui.Components.bq bqVar = new org.telegram.ui.Components.bq(true);
        int i11 = org.telegram.ui.ActionBar.h6.f21241qg;
        bqVar.b(org.telegram.ui.ActionBar.h6.v0(i11));
        bqVar.d();
        m40 m40Var = new m40(this, launchActivity, bqVar);
        this.O = m40Var;
        m40Var.setSubtitle("");
        m40Var.getSubtitleTextView().setVisibility(0);
        m40Var.l();
        m40Var.getAdditionalSubtitleTextView().setPadding(AndroidUtilities.dp(24.0f), 0, 0, 0);
        AndroidUtilities.updateViewVisibilityAnimated(m40Var.getAdditionalSubtitleTextView(), this.f40464u2, 1.0f, false);
        m40Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.h6.v0(i11));
        int i12 = org.telegram.ui.ActionBar.h6.f21148lg;
        m40Var.setSubtitleColor(org.telegram.ui.ActionBar.h6.v0(i12));
        m40Var.setBackButtonImage(R.drawable.ic_ab_back);
        m40Var.setOccupyStatusBar(false);
        m40Var.setAllowOverlayTitle(false);
        int i13 = org.telegram.ui.ActionBar.h6.f21073hg;
        m40Var.C(org.telegram.ui.ActionBar.h6.v0(i13), false);
        m40Var.B(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f21401z8), false);
        m40Var.setTitleColor(org.telegram.ui.ActionBar.h6.v0(i13));
        m40Var.setSubtitleColor(org.telegram.ui.ActionBar.h6.v0(i12));
        m40Var.setActionBarMenuOnItemClick(new t40(this, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.A0 = tL_peerUser;
            tL_peerUser.user_id = accountInstance.getUserConfig().getClientUserId();
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            this.A0 = tL_peerChannel;
            tL_peerChannel.channel_id = groupCallPeer.channel_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            this.A0 = tL_peerUser2;
            tL_peerUser2.user_id = groupCallPeer.user_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            this.A0 = tL_peerChat;
            tL_peerChat.chat_id = groupCallPeer.chat_id;
        }
        VoIPService.audioLevelsCallback = new z10(this, 3);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.groupCallUpdated);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.needShowAlert);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.didLoadChatAdmins);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.applyGroupCallVisibleParticipants);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.mainUserInfoChanged);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.groupCallScreencastStateChanged);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.groupCallSpeakingUsersUpdated);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.conferenceEmojiUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didEndCall);
        this.f40401f0 = launchActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        org.telegram.ui.Components.vj0 vj0Var = new org.telegram.ui.Components.vj0(R.raw.voip_filled, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        this.J0 = vj0Var;
        this.K0 = new org.telegram.ui.Components.vj0(R.raw.hand_2, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        u40 u40Var = new u40(this, launchActivity);
        this.L = u40Var;
        this.containerView = u40Var;
        u40Var.setClipToPadding(false);
        this.containerView.setFocusable(true);
        this.containerView.setFocusableInTouchMode(true);
        this.containerView.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i14, 0, i14, 0);
        this.containerView.setKeepScreenOn(true);
        this.containerView.setClipChildren(false);
        this.Z = new ImageReceiver(this.containerView);
        if (inputPeer != null) {
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(launchActivity);
            this.U = j5Var;
            j5Var.setGravity(17);
            j5Var.setTextColor(-1);
            j5Var.setTypeface(AndroidUtilities.bold());
            j5Var.setTextSize(18);
            j5Var.k(LocaleController.getString(R.string.VoipChatStartsIn));
            this.containerView.addView(j5Var, w7.z5.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            v40 v40Var = new v40(this, launchActivity);
            this.V = v40Var;
            v40Var.setGravity(17);
            v40Var.setTextColor(-1);
            v40Var.setTypeface(AndroidUtilities.bold());
            v40Var.setTextSize(60);
            this.containerView.addView(v40Var, w7.z5.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(launchActivity);
            this.W = j5Var2;
            j5Var2.setGravity(17);
            j5Var2.setTextColor(-1);
            j5Var2.setTypeface(AndroidUtilities.bold());
            j5Var2.setTextSize(18);
            this.containerView.addView(j5Var2, w7.z5.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (s1()) {
            f50 f50Var = new f50(this, launchActivity);
            this.U0 = f50Var;
            this.containerView.addView(f50Var, w7.z5.d(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        w40 w40Var = new w40(this, launchActivity);
        this.Q = w40Var;
        w40Var.setClipToPadding(false);
        w40Var.setClipChildren(false);
        e50 e50Var = new e50(this);
        this.X = e50Var;
        e50Var.f45984o = bsVar;
        e50Var.d = 350L;
        e50Var.f46000c = 350L;
        e50Var.e = 350L;
        e50Var.S();
        w40Var.setItemAnimator(e50Var);
        w40Var.setOnScrollListener(new n20(this));
        w40Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.xz xzVar = new org.telegram.ui.Components.xz(F3 ? 6 : 2, w40Var);
        this.Y = xzVar;
        w40Var.setLayoutManager(xzVar);
        o20 o20Var = new o20(this);
        this.f40387c = o20Var;
        xzVar.z1(o20Var);
        w40Var.i(new p20(this));
        xzVar.C1();
        this.containerView.addView(w40Var, w7.z5.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        w40Var.setAdapter(k50Var);
        w40Var.setTopBottomSelectorRadius(13);
        w40Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f21020eg));
        w40Var.setOnItemClickListener(new e7(this, launchActivity, call, 14));
        w40Var.setOnItemLongClickListener(new z10(this, 4));
        if (s1()) {
            o50 o50Var = new o50(this, getContext());
            this.B1 = o50Var;
            this.containerView.addView(o50Var, w7.z5.d(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.jm0 jm0Var = new org.telegram.ui.Components.jm0(launchActivity);
        this.f40434n2 = jm0Var;
        this.containerView.addView(jm0Var, w7.z5.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        w50 w50Var = new w50(call, this.currentAccount, this);
        this.f40438o2 = w50Var;
        jm0Var.setAdapter(w50Var);
        s4.s sVar = new s4.s(6, false);
        jm0Var.setLayoutManager(sVar);
        sVar.z1(new r20(this));
        jm0Var.setOnItemClickListener(new org.telegram.ui.Components.xl0(this) {
            public final q50 f35491b;

            {
                this.f35491b = this;
            }

            @Override
            public final void a(int i15, View view) {
                switch (r2) {
                    case 0:
                        q50 q50Var2 = this.f35491b;
                        q50Var2.getClass();
                        org.telegram.ui.Components.z20 z20Var = (org.telegram.ui.Components.z20) view;
                        if (z20Var.getVideoParticipant() == null) {
                            q50Var2.f1(new ChatObject.VideoParticipant(z20Var.getParticipant(), false, false));
                            return;
                        } else {
                            q50Var2.f1(z20Var.getVideoParticipant());
                            return;
                        }
                    default:
                        q50 q50Var3 = this.f35491b;
                        q50Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                        if (lVar.getParticipant() != null) {
                            q50Var3.f1(lVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        s4.k kVar = new s4.k();
        kVar.S();
        kVar.f45984o = bsVar;
        kVar.d = 350L;
        kVar.f46000c = 350L;
        kVar.e = 350L;
        jm0Var.setItemAnimator(new s20(this));
        jm0Var.setOnScrollListener(new t20(this));
        w50Var.H(jm0Var, false, false);
        jm0Var.setVisibility(8);
        u20 u20Var = new u20(this, launchActivity);
        this.e = u20Var;
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Jg);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.S0 = new Matrix();
        this.R0 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.T0 = paint;
        paint.setShader(this.R0);
        org.telegram.ui.Components.ba baVar = new org.telegram.ui.Components.ba(9);
        this.M0 = baVar;
        org.telegram.ui.Components.ba baVar2 = new org.telegram.ui.Components.ba(12);
        this.N0 = baVar2;
        baVar.f24843a = AndroidUtilities.dp(62.0f) * 0.45454547f;
        baVar.f24844b = AndroidUtilities.dp(72.0f) * 0.45454547f;
        baVar.b();
        baVar2.f24843a = AndroidUtilities.dp(65.0f) * 0.45454547f;
        baVar2.f24844b = AndroidUtilities.dp(75.0f) * 0.45454547f;
        baVar2.b();
        int i15 = org.telegram.ui.ActionBar.h6.Ig;
        baVar.d.setColor(i0.a.o(org.telegram.ui.ActionBar.h6.v0(i15), 38));
        baVar2.d.setColor(i0.a.o(org.telegram.ui.ActionBar.h6.v0(i15), 76));
        org.telegram.ui.Components.voip.t2 t2Var = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.f40448r = t2Var;
        t2Var.setCheckable(true);
        t2Var.setTextSize(12);
        u20Var.a(t2Var);
        t2Var.setOnClickListener(new a20(this, 7));
        org.telegram.ui.Components.voip.t2 t2Var2 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.f40431n = t2Var2;
        t2Var2.setCheckable(true);
        t2Var2.setTextSize(12);
        t2Var2.d(false, false);
        t2Var2.setCrossOffset(-AndroidUtilities.dpf2(3.5f));
        t2Var2.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), false, false);
        org.telegram.ui.Components.voip.t2 t2Var3 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.f40400f = t2Var3;
        t2Var3.setCheckable(true);
        t2Var3.setTextSize(12);
        t2Var3.d(false, false);
        org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(launchActivity);
        t2Var3.addView(yj0Var, w7.z5.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.vj0 vj0Var2 = new org.telegram.ui.Components.vj0(R.raw.camera_flip, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.G2 = vj0Var2;
        yj0Var.setAnimation(vj0Var2);
        t2Var3.setOnClickListener(new a20(this, 10));
        u20Var.a(t2Var3);
        org.telegram.ui.Components.voip.t2 t2Var4 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.h = t2Var4;
        t2Var4.setCheckable(true);
        t2Var4.setTextSize(12);
        t2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.f40383b0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i16 = R.drawable.filled_sound_on;
        this.f40379a0 = i16;
        imageView.setImageResource(i16);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        t2Var4.addView(imageView, w7.z5.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        t2Var4.setOnClickListener(new a20(this, 11));
        u20Var.a(t2Var4);
        u20Var.a(t2Var2);
        org.telegram.ui.Components.voip.t2 t2Var5 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.f40453s = t2Var5;
        t2Var5.setTextSize(12);
        t2Var5.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Dg), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        t2Var5.setOnClickListener(new View.OnClickListener(this) {
            public final q50 f36880b;

            {
                this.f36880b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        q50.p(this.f36880b, launchActivity);
                        return;
                    default:
                        q50 q50Var2 = this.f36880b;
                        q50Var2.a2.e();
                        ChatObject.Call call2 = q50Var2.f40380a1;
                        if (call2 != null && !call2.isScheduled()) {
                            q50Var2.J1();
                            q50.u1(launchActivity, new c20(q50Var2, 5), false, false);
                            return;
                        }
                        q50Var2.dismiss();
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.t2 t2Var6 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.v = t2Var6;
        t2Var6.setCheckable(true);
        t2Var6.b(true, false);
        t2Var6.setTextSize(12);
        t2Var6.c(R.drawable.filled_voice_comment_32, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipMessage), false, false);
        v20 v20Var = new v20(this, launchActivity);
        this.f40475x = v20Var;
        v20Var.setAnimation(vj0Var);
        v20Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.t2 t2Var7 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.f40470w = t2Var7;
        t2Var7.setDrawBackground(false);
        t2Var7.setTextSize(12);
        t2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        t2Var7.addView(v20Var, w7.z5.e(50, 50, 49));
        u20Var.a(t2Var7);
        t2Var7.setOnClickListener(new x20(this));
        u20Var.a(t2Var6);
        u20Var.a(t2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.f40480y = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        t2Var7.addView(imageView2, w7.z5.d(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.f40380a1 != null && s1() && !this.f40380a1.isScheduled()) {
            imageView2.setVisibility(0);
            v20Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.f40396e0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Og));
        m40Var.setAlpha(0.0f);
        m40Var.getBackButton().setScaleX(0.9f);
        m40Var.getBackButton().setScaleY(0.9f);
        m40Var.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        m40Var.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        m40Var.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        m40Var.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(launchActivity, (org.telegram.ui.ActionBar.y) null, 0, org.telegram.ui.ActionBar.h6.v0(i13));
        this.f40422k1 = u0Var;
        u0Var.setLongClickEnabled(false);
        u0Var.setIcon(R.drawable.ic_ab_other);
        u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var.setSubMenuOpenSide(2);
        u0Var.setDelegate(new z10(this, 0));
        int i17 = org.telegram.ui.ActionBar.h6.f21091ig;
        u0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(i17), 6));
        u0Var.setOnClickListener(new a20(this, 0));
        u0Var.G(org.telegram.ui.ActionBar.h6.v0(i13), false);
        u0Var.G(org.telegram.ui.ActionBar.h6.v0(i13), true);
        org.telegram.ui.ActionBar.u0 u0Var2 = new org.telegram.ui.ActionBar.u0(launchActivity, (org.telegram.ui.ActionBar.y) null, 0, org.telegram.ui.ActionBar.h6.v0(i13));
        this.l1 = u0Var2;
        u0Var2.setLongClickEnabled(false);
        u0Var2.setIcon(R.drawable.msg_voice_pip);
        u0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        u0Var2.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(i17), 6));
        u0Var2.setOnClickListener(new a20(this, 1));
        org.telegram.ui.ActionBar.u0 u0Var3 = new org.telegram.ui.ActionBar.u0(launchActivity, (org.telegram.ui.ActionBar.y) null, 0, org.telegram.ui.ActionBar.h6.v0(i13));
        this.f40428m1 = u0Var3;
        u0Var3.setLongClickEnabled(false);
        u0Var3.setIcon(R.drawable.msg_screencast);
        u0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        u0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(i17), 6));
        u0Var3.setOnClickListener(new a20(this, 2));
        z20 z20Var = new z20(this, launchActivity, launchActivity);
        this.f40397e1 = z20Var;
        a30 a30Var = new a30(launchActivity);
        this.N = a30Var;
        a30Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.f40406g1 = paint2;
        paint2.setColor(-12761513);
        b30 b30Var = new b30(this, getContext());
        this.f40402f1 = b30Var;
        b30Var.setTextColor(getThemedColor(i13));
        b30Var.setTextSize(1, 11.0f);
        b30Var.setText(LocaleController.getString(R.string.VoipChannelLabelLive));
        b30Var.setMaxLines(1);
        b30Var.setGravity(17);
        b30Var.setTypeface(AndroidUtilities.bold());
        b30Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f));
        b30Var.setTag(-1);
        if (!s1()) {
            b30Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f40418j1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(z20Var, w7.z5.l(1.0f, 0, -2));
        linearLayout.addView(b30Var, w7.z5.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.containerView.addView(a30Var, w7.z5.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(linearLayout, w7.z5.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.containerView.addView(m40Var, w7.z5.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.f40485z1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(u0Var3, w7.z5.n(48, 48));
        linearLayout2.addView(u0Var2, w7.z5.n(48, 48));
        linearLayout2.addView(u0Var, w7.z5.n(48, 48));
        this.containerView.addView(linearLayout2, w7.z5.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.f40405g0 = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.V5));
        this.containerView.addView(view, w7.z5.c(1.0f, -1));
        for (int i18 = 0; i18 < 2; i18++) {
            this.f40417j0[i18] = new c30(this, launchActivity);
            this.f40417j0[i18].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            this.f40417j0[i18].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.containerView.addView(this.f40417j0[i18], w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.k kVar2 = new org.telegram.ui.Cells.k(launchActivity, true);
        this.f40421k0 = kVar2;
        kVar2.setTag(R.id.fit_width_tag, 240);
        this.f40422k1.h(kVar2, AndroidUtilities.dp(48.0f));
        this.f40422k1.setShowSubmenuByMove(false);
        int i19 = org.telegram.ui.ActionBar.h6.f21020eg;
        kVar2.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.v0(i19), 6, 6));
        org.telegram.ui.ActionBar.u0 u0Var4 = this.f40422k1;
        org.telegram.ui.ActionBar.e1 d = u0Var4.d(1, 0, null, LocaleController.getString(R.string.VoipGroupAllCanSpeak), true, true, u0Var4.m0);
        this.f40463u1 = d;
        d.j(true, false);
        org.telegram.ui.ActionBar.u0 u0Var5 = this.f40422k1;
        org.telegram.ui.ActionBar.e1 d10 = u0Var5.d(2, 0, null, LocaleController.getString(R.string.VoipGroupOnlyAdminsCanSpeak), true, true, u0Var5.m0);
        this.f40467v1 = d10;
        d10.j(false, true);
        int i20 = org.telegram.ui.ActionBar.h6.f21355wg;
        d.setCheckColor(i20);
        d.c(org.telegram.ui.ActionBar.h6.v0(i20), org.telegram.ui.ActionBar.h6.v0(i20));
        d10.setCheckColor(i20);
        d10.c(org.telegram.ui.ActionBar.h6.v0(i20), org.telegram.ui.ActionBar.h6.v0(i20));
        Paint paint3 = new Paint(1);
        int i21 = org.telegram.ui.ActionBar.h6.f21073hg;
        paint3.setColor(org.telegram.ui.ActionBar.h6.v0(i21));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.u0 u0Var6 = this.f40422k1;
        org.telegram.ui.ActionBar.e1 d11 = u0Var6.d(10, R.drawable.msg_voice_speaker, null, LocaleController.getString(R.string.VoipGroupAudio), true, false, u0Var6.m0);
        this.f40441p1 = d11;
        d11.setItemHeight(56);
        org.telegram.ui.ActionBar.u0 u0Var7 = this.f40422k1;
        org.telegram.ui.ActionBar.e1 d12 = u0Var7.d(11, R.drawable.msg_noise_on, null, LocaleController.getString(R.string.VoipNoiseCancellation), true, false, u0Var7.m0);
        this.f40445q1 = d12;
        d12.setItemHeight(56);
        TextView b10 = this.f40422k1.b(i0.a.f(0.3f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f21057gg), -16777216));
        this.A1 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.u0 u0Var8 = this.f40422k1;
        org.telegram.ui.ActionBar.e1 d13 = u0Var8.d(6, R.drawable.msg_edit, this.f40393d1, LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEditTitle : R.string.VoipGroupEditTitle), true, false, u0Var8.m0);
        this.f40437o1 = d13;
        org.telegram.ui.ActionBar.u0 u0Var9 = this.f40422k1;
        org.telegram.ui.ActionBar.e1 d14 = u0Var9.d(7, R.drawable.msg_permissions, this.f40393d1, LocaleController.getString(R.string.VoipGroupEditPermissions), false, false, u0Var9.m0);
        this.f40450r1 = d14;
        org.telegram.ui.ActionBar.e1 e = this.f40422k1.e(3, R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareInviteLink));
        this.f40433n1 = e;
        l50 l50Var = new l50();
        this.f40393d1 = l50Var;
        org.telegram.ui.ActionBar.e1 e7 = this.f40422k1.e(9, R.drawable.msg_screencast, LocaleController.getString(R.string.VoipChatStartScreenCapture));
        this.f40459t1 = e7;
        org.telegram.ui.ActionBar.u0 u0Var10 = this.f40422k1;
        org.telegram.ui.ActionBar.e1 d15 = u0Var10.d(5, 0, l50Var, LocaleController.getString(R.string.VoipGroupRecordCall), true, false, u0Var10.m0);
        this.f40455s1 = d15;
        l50Var.a(d15.getImageView());
        org.telegram.ui.ActionBar.e1 e10 = this.f40422k1.e(12, R.drawable.menu_stream_comments_24, LocaleController.getString(R.string.VoipChannelEnableComments));
        this.f40477x1 = e10;
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        org.telegram.ui.ActionBar.e1 e11 = this.f40422k1.e(13, R.drawable._menu_stream_comments_off_24, LocaleController.getString(R.string.VoipChannelDisableComments));
        this.f40482y1 = e11;
        org.telegram.ui.ActionBar.u0 u0Var11 = this.f40422k1;
        int i22 = R.drawable.msg_cancel;
        if (p1()) {
            i10 = i21;
            string = LocaleController.getString(R.string.VoipGroupEndConference);
        } else {
            string = LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat);
            i10 = i21;
        }
        org.telegram.ui.ActionBar.e1 e12 = u0Var11.e(4, i22, string);
        this.f40472w1 = e12;
        this.f40422k1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.h6.v0(i19));
        this.f40422k1.getPopupLayout().setFitItems(true);
        e10.c(org.telegram.ui.ActionBar.h6.v0(i10), org.telegram.ui.ActionBar.h6.v0(i10));
        e11.c(org.telegram.ui.ActionBar.h6.v0(i10), org.telegram.ui.ActionBar.h6.v0(i10));
        d11.c(org.telegram.ui.ActionBar.h6.v0(i10), org.telegram.ui.ActionBar.h6.v0(i10));
        d12.c(org.telegram.ui.ActionBar.h6.v0(i10), org.telegram.ui.ActionBar.h6.v0(i10));
        int i23 = org.telegram.ui.ActionBar.h6.f21337vg;
        e12.c(org.telegram.ui.ActionBar.h6.v0(i23), org.telegram.ui.ActionBar.h6.v0(i23));
        e.c(org.telegram.ui.ActionBar.h6.v0(i10), org.telegram.ui.ActionBar.h6.v0(i10));
        d13.c(org.telegram.ui.ActionBar.h6.v0(i10), org.telegram.ui.ActionBar.h6.v0(i10));
        d14.c(org.telegram.ui.ActionBar.h6.v0(i10), org.telegram.ui.ActionBar.h6.v0(i10));
        d15.c(org.telegram.ui.ActionBar.h6.v0(i10), org.telegram.ui.ActionBar.h6.v0(i10));
        e7.c(org.telegram.ui.ActionBar.h6.v0(i10), org.telegram.ui.ActionBar.h6.v0(i10));
        if (this.f40380a1 != null) {
            m1();
        }
        if (p1()) {
            this.f40440p0 = new b50();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.f40440p0.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        Q1(false);
        this.O.getTitleTextView().setOnClickListener(new a20(this, 3));
        d30 d30Var = new d30(this, launchActivity);
        this.f40429m2 = d30Var;
        e30 e30Var = new e30(this);
        this.N2 = e30Var;
        d30Var.setClipToPadding(false);
        e30Var.S();
        e30Var.f45984o = org.telegram.ui.Components.bs.f25025f;
        e30Var.d = 350L;
        e30Var.f46000c = 350L;
        e30Var.e = 350L;
        d30Var.setItemAnimator(e30Var);
        d30Var.setOnScrollListener(new f30(this));
        d30Var.setClipChildren(false);
        s4.b0 b0Var = new s4.b0();
        b0Var.j1(0);
        d30Var.setLayoutManager(b0Var);
        org.telegram.ui.Components.a30 a30Var2 = new org.telegram.ui.Components.a30(call, this.currentAccount, this);
        this.f40442p2 = a30Var2;
        d30Var.setAdapter(a30Var2);
        a30Var2.F(d30Var, false);
        d30Var.setOnItemClickListener(new org.telegram.ui.Components.xl0(this) {
            public final q50 f35491b;

            {
                this.f35491b = this;
            }

            @Override
            public final void a(int i152, View view2) {
                switch (r2) {
                    case 0:
                        q50 q50Var2 = this.f35491b;
                        q50Var2.getClass();
                        org.telegram.ui.Components.z20 z20Var2 = (org.telegram.ui.Components.z20) view2;
                        if (z20Var2.getVideoParticipant() == null) {
                            q50Var2.f1(new ChatObject.VideoParticipant(z20Var2.getParticipant(), false, false));
                            return;
                        } else {
                            q50Var2.f1(z20Var2.getVideoParticipant());
                            return;
                        }
                    default:
                        q50 q50Var3 = this.f35491b;
                        q50Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view2;
                        if (lVar.getParticipant() != null) {
                            q50Var3.f1(lVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        d30Var.setOnItemLongClickListener(new z10(this, 1));
        d30Var.setVisibility(8);
        d30Var.i(new g30());
        h30 h30Var = new h30(this, launchActivity, this.Q, d30Var, this.Y1, this.f40380a1, this);
        this.a2 = h30Var;
        h30Var.setClipChildren(false);
        a30Var2.E(this.Y1, h30Var);
        if (this.f40434n2 != null) {
            this.f40438o2.G(this.Y1, h30Var);
        }
        i30 i30Var = new i30(this, launchActivity);
        this.D2 = i30Var;
        j30 j30Var = new j30(this, launchActivity, this.O, this.Q, i30Var);
        this.f40382b = j30Var;
        j30Var.setImagesLayerNum(Integer.MAX_VALUE);
        j30Var.setInvalidateWithParent(true);
        i30Var.setProfileGalleryView(j30Var);
        k30 k30Var = new k30(this, launchActivity);
        this.C2 = k30Var;
        k30Var.setVisibility(8);
        j30Var.setVisibility(0);
        j30Var.b(new l30(this));
        m30 m30Var = new m30(this, launchActivity);
        this.f40385b2 = m30Var;
        this.containerView.addView(h30Var);
        h30Var.addView(d30Var, w7.z5.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.e.setWillNotDraw(false);
        View view2 = new View(launchActivity);
        this.J2 = view2;
        int[] iArr = this.M2;
        iArr[0] = this.V1;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.M2);
        this.L2 = gradientDrawable;
        view2.setBackground(gradientDrawable);
        this.containerView.addView(view2, w7.z5.e(-1, 60, 83));
        View view3 = new View(launchActivity);
        this.K2 = view3;
        view3.setBackgroundColor(this.M2[0]);
        this.containerView.addView(view3, w7.z5.e(-1, 0, 83));
        mh.h hVar = new mh.h(launchActivity);
        this.f40388c0 = hVar;
        hVar.setDelegate(new n30(this));
        hVar.setClickCellDelegate(new o30(this));
        if (this.f40380a1 != null) {
            hVar.C0(this.d.getCurrentAccount(), this.f40380a1.getInputGroupCall(false));
        }
        this.containerView.addView(hVar, w7.z5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(launchActivity, false, true, true);
        this.M = q6Var;
        q6Var.setGravity(17);
        q6Var.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var.setTextColor(-1);
        q6Var.b(0.4f, 320L, org.telegram.ui.Components.bs.h);
        q6Var.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.e);
        p30 p30Var = new p30(this, launchActivity, this.L, LaunchActivity.R(), this.resourcesProvider);
        this.H = p30Var;
        p30Var.J = true;
        p30Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f40392d0)});
        p30Var.getEditText().setLinkTextColor(-11683585);
        p30Var.setHint(LocaleController.getString(R.string.TypeMessage));
        p30Var.getEditText().addTextChangedListener(new q30(this));
        p30Var.s();
        r30 r30Var = new r30(this, launchActivity);
        this.G = r30Var;
        this.containerView.addView(r30Var, w7.z5.c(-1.0f, -1));
        s30 s30Var = new s30(launchActivity);
        this.F = s30Var;
        s30Var.addView(p30Var, w7.z5.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        s30Var.addView(q6Var, w7.z5.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        q6Var.setTranslationY(-AndroidUtilities.dp(20.0f));
        this.containerView.addView(s30Var, w7.z5.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.J = imageView3;
        int i24 = org.telegram.ui.ActionBar.h6.f21083i6;
        imageView3.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i24), 1, -1));
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f7, this.resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(w02, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new a20(this, 4));
        ImageView imageView4 = new ImageView(launchActivity);
        this.I = imageView4;
        imageView4.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i24), 1, -1));
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21327v6, this.resourcesProvider), mode));
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new a20(this, 5));
        s30Var.addView(imageView3, w7.z5.e(48, 48, 85));
        s30Var.addView(imageView4, w7.z5.e(48, 48, 85));
        this.containerView.addView(m30Var);
        k30Var.addView(j30Var, w7.z5.c(-1.0f, -1));
        k30Var.addView(i30Var, w7.z5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(k30Var, w7.z5.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        P0(false);
        this.P.l();
        if (G3) {
            this.f40438o2.I(this.f40434n2, false);
        }
        this.I0 = this.P.h();
        if (inputPeer != null) {
            TextView textView = new TextView(launchActivity);
            this.S = textView;
            textView.setGravity(17);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 14.0f);
            if (ChatObject.isChannel(this.Z0) && (chat2 = this.Z0) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            this.containerView.addView(textView, w7.z5.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.od0 od0Var = new org.telegram.ui.Components.od0(launchActivity);
            od0Var.setTextColor(-1);
            od0Var.setSelectorColor(-9598483);
            od0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            od0Var.setItemCount(5);
            u30 u30Var = new u30(launchActivity);
            u30Var.setItemCount(5);
            u30Var.setTextColor(-1);
            u30Var.setSelectorColor(-9598483);
            u30Var.setTextOffset(-AndroidUtilities.dp(10.0f));
            v30 v30Var = new v30(launchActivity);
            v30Var.setItemCount(5);
            v30Var.setTextColor(-1);
            v30Var.setSelectorColor(-9598483);
            v30Var.setTextOffset(-AndroidUtilities.dp(34.0f));
            w30 w30Var = new w30(launchActivity);
            this.T = w30Var;
            w30Var.setLines(1);
            w30Var.setSingleLine(true);
            w30Var.setEllipsize(TextUtils.TruncateAt.END);
            w30Var.setGravity(17);
            w30Var.setTextColor(-1);
            w30Var.setTypeface(AndroidUtilities.bold());
            w30Var.setTextSize(1, 14.0f);
            this.containerView.addView(w30Var, w7.z5.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            launchActivity2 = launchActivity;
            w30Var.setOnClickListener(new org.telegram.messenger.video.f(this, od0Var, u30Var, v30Var, chat, accountInstance, inputPeer2, 1));
            y30 y30Var = new y30(launchActivity2, od0Var, u30Var, v30Var);
            this.R = y30Var;
            y30Var.setWeightSum(1.0f);
            y30Var.setOrientation(0);
            this.containerView.addView(y30Var, w7.z5.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i25 = calendar.get(1);
            int i26 = calendar.get(6);
            y30Var.addView(od0Var, w7.z5.l(0.5f, 0, 270));
            od0Var.setMinValue(0);
            od0Var.setMaxValue(365);
            od0Var.setWrapSelectorWheel(false);
            od0Var.setFormatter(new e20(currentTimeMillis, calendar, i25, 0));
            a1.d dVar = new a1.d(this, od0Var, u30Var, v30Var, 13);
            q50Var = this;
            od0Var.setOnValueChangedListener(dVar);
            u30Var.setMinValue(0);
            u30Var.setMaxValue(23);
            y30Var.addView(u30Var, w7.z5.l(0.2f, 0, 270));
            u30Var.setFormatter(new org.telegram.ui.Components.ug0(24));
            u30Var.setOnValueChangedListener(dVar);
            v30Var.setMinValue(0);
            v30Var.setMaxValue(59);
            v30Var.setValue(0);
            v30Var.setFormatter(new org.telegram.ui.Components.ug0(25));
            y30Var.addView(v30Var, w7.z5.l(0.3f, 0, 270));
            v30Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i27 = calendar.get(6);
            int i28 = calendar.get(12);
            int i29 = calendar.get(11);
            od0Var.setValue(i26 != i27 ? 1 : 0);
            v30Var.setValue(i28);
            u30Var.setValue(i29);
            org.telegram.ui.Components.f5.f(w30Var, textView, 0L, 604800L, 2, od0Var, u30Var, v30Var);
        } else {
            launchActivity2 = launchActivity;
            q50Var = this;
        }
        z30 z30Var = new z30(q50Var, (ViewGroup) q50Var.getWindow().getDecorView(), q50Var.containerView);
        q50Var.f40390c2 = z30Var;
        z30Var.E = new a40(q50Var);
        j30Var.setPinchToZoomHelper(z30Var);
        q50Var.f40431n.setOnClickListener(new View.OnClickListener(q50Var) {
            public final q50 f36880b;

            {
                this.f36880b = q50Var;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        q50.p(this.f36880b, launchActivity2);
                        return;
                    default:
                        q50 q50Var2 = this.f36880b;
                        q50Var2.a2.e();
                        ChatObject.Call call2 = q50Var2.f40380a1;
                        if (call2 != null && !call2.isScheduled()) {
                            q50Var2.J1();
                            q50.u1(launchActivity2, new c20(q50Var2, 5), false, false);
                            return;
                        }
                        q50Var2.dismiss();
                        return;
                }
            }
        });
        q50Var.M1(false);
        q50Var.J1();
        q50Var.N1(false);
        q50Var.O1(false, false);
        q50Var.C1(0.0f);
        q50Var.P1();
        q50Var.containerView.addView(new FrameLayout(launchActivity2), w7.z5.e(-1, 200, 87));
        q50Var.v.setOnClickListener(new a20(q50Var, 6));
        q50Var.U0();
        w7.b6.a(q50Var.f40431n);
        w7.b6.a(q50Var.f40448r);
        w7.b6.a(q50Var.f40400f);
        w7.b6.a(q50Var.h);
        w7.b6.a(q50Var.f40470w);
        w7.b6.a(q50Var.f40453s);
        w7.b6.a(q50Var.v);
        r0.i0.l(q50Var.containerView, new z10(q50Var, 2));
    }

    public static void A(q50 q50Var, org.telegram.ui.ActionBar.b2[] b2VarArr, boolean z10, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        try {
            b2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        b2VarArr[0] = null;
        if (z10 && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
            q50Var.y1(null, j10, 3);
            return;
        }
        org.telegram.ui.Components.f5.e0(q50Var.currentAccount, tL_error, (org.telegram.ui.ActionBar.n2) q50Var.f40413i0.O().getFragmentStack().get(q50Var.f40413i0.O().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
    }

    public static r0.k1 B(q50 q50Var, r0.k1 k1Var) {
        int keyboardHeight;
        r0.h1 h1Var = k1Var.f44839a;
        i0.b f7 = h1Var.f(647);
        i0.b f10 = h1Var.f(8);
        p30 p30Var = q50Var.H;
        if (!p30Var.N && !p30Var.e) {
            keyboardHeight = 0;
        } else {
            keyboardHeight = p30Var.getKeyboardHeight();
        }
        int max = Math.max(f10.d, keyboardHeight);
        ViewGroup.LayoutParams layoutParams = q50Var.f40385b2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f7.d;
        }
        if (p30Var.getEmojiView() != null) {
            p30Var.getEmojiView().setBottomInset(f7.d);
        }
        if (q50Var.S2) {
            ViewGroup viewGroup = q50Var.containerView;
            int i10 = q50Var.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
        } else {
            ViewGroup viewGroup2 = q50Var.containerView;
            int i11 = q50Var.backgroundPaddingLeft;
            viewGroup2.setPadding(f7.f12283a + i11, f7.f12284b, i11 + f7.f12285c, f7.d);
        }
        q50Var.containerView.requestLayout();
        if (max == 0 && !p30Var.N && !p30Var.e && !p30Var.O) {
            p30Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.dl0 dl0Var = q50Var.K;
            if (dl0Var == null) {
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                dl0Var = null;
                if (R != null) {
                    org.telegram.ui.Components.dl0 dl0Var2 = new org.telegram.ui.Components.dl0(1, q50Var.currentAccount, q50Var.getContext(), R, q50Var.resourcesProvider);
                    q50Var.K = dl0Var2;
                    dl0Var2.setDelegate(new s40(q50Var));
                    q50Var.containerView.addView(q50Var.K, w7.z5.e(-2, 52, 81));
                    q50Var.K.p(null, null, false);
                    q50Var.G.bringToFront();
                    q50Var.F.bringToFront();
                    dl0Var = q50Var.K;
                }
            }
            q50Var.K = dl0Var;
        }
        p30Var.G(f10.d, false);
        q50Var.C1.j(k1Var);
        return r0.k1.f44838b;
    }

    public static String B0() {
        String[][] strArr = EmojiData.data;
        String[] strArr2 = strArr[(int) Math.floor(Math.random() * strArr.length)];
        return strArr2[(int) Math.floor(Math.random() * strArr2.length)];
    }

    public static void C(q50 q50Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        TLRPC.GroupCall groupCall;
        b2Var.dismiss();
        boolean z10 = false;
        if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
            Context context = q50Var.getContext();
            int i10 = q50Var.currentAccount;
            TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
            String str = ((TL_phone.exportedGroupCallInvite) tLObject).link;
            org.telegram.ui.ActionBar.d6 d6Var = q50Var.resourcesProvider;
            ChatObject.Call call = q50Var.f40380a1;
            if (call != null && (groupCall = call.call) != null && groupCall.creator) {
                z10 = true;
            }
            m9.o0(context, i10, inputGroupCall, str, d6Var, false, z10);
        } else if (tL_error != null) {
            new org.telegram.ui.Components.xc(q50Var.topBulletinContainer, new ci.k0()).f0(tL_error, false);
        }
    }

    public static void C0(q50 q50Var) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("reminderhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("reminderhint", true).commit();
        if (q50Var.f40432n0 == null) {
            org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(q50Var.getContext(), 8);
            q50Var.f40432n0 = r40Var;
            r40Var.setAlpha(0.0f);
            q50Var.f40432n0.setVisibility(4);
            q50Var.f40432n0.setShowingDuration(4000L);
            q50Var.containerView.addView(q50Var.f40432n0, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            q50Var.f40432n0.setText(LocaleController.getString(R.string.VoipChatReminderHint));
            q50Var.f40432n0.d();
        }
        q50Var.f40432n0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        q50Var.f40432n0.f(q50Var.f40470w, true);
    }

    public static void D(q50 q50Var, int[] iArr, float[] fArr) {
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        s4.b1 K;
        d30 d30Var = q50Var.f40429m2;
        h30 h30Var = q50Var.a2;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant = q50Var.f40380a1.participantsBySources.get(iArr[i10]);
            if (groupCallParticipant != null) {
                if (!h30Var.f31519b) {
                    if (q50Var.f40454s0) {
                        arrayList = q50Var.D0;
                    } else {
                        arrayList = q50Var.f40380a1.visibleParticipants;
                    }
                    int indexOf = arrayList.indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = q50Var.Q.K(indexOf + q50Var.P.d)) != null) {
                        View view = K.f45921a;
                        if (view instanceof org.telegram.ui.Cells.d4) {
                            ((org.telegram.ui.Cells.d4) view).setAmplitude(fArr[i10] * 15.0f);
                            if (view == q50Var.X2 && !q50Var.f40426l2) {
                                q50Var.containerView.invalidate();
                            }
                        }
                    }
                } else {
                    for (int i11 = 0; i11 < d30Var.getChildCount(); i11++) {
                        org.telegram.ui.Components.z20 z20Var = (org.telegram.ui.Components.z20) d30Var.getChildAt(i11);
                        if (MessageObject.getPeerId(z20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                            z20Var.setAmplitude(fArr[i10] * 15.0f);
                        }
                    }
                }
                h30Var.k(groupCallParticipant, fArr[i10] * 15.0f);
            }
        }
    }

    public static void E(q50 q50Var) {
        Editable text = q50Var.H.getText();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = text.toString();
        tL_textWithEntities.entities = MediaDataController.getInstance(q50Var.currentAccount).getEntities(new CharSequence[]{text}, true);
        q50Var.B1(tL_textWithEntities);
    }

    public static void G0(q50 q50Var) {
        ChatObject.Call call = q50Var.f40380a1;
        if (call != null && call.call != null) {
            TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
            togglegroupcallsettings.call = q50Var.f40380a1.getInputGroupCall();
            togglegroupcallsettings.join_muted = Boolean.valueOf(q50Var.f40380a1.call.join_muted);
            ConnectionsManager connectionsManager = q50Var.d.getConnectionsManager();
            DispatchQueue dispatchQueue = Utilities.stageQueue;
            Objects.requireNonNull(dispatchQueue);
            connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.g1(dispatchQueue), new l20(q50Var, 1));
        }
    }

    public static void H0(q50 q50Var, boolean z10) {
        if (q50Var.f40380a1 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = q50Var.f40380a1.getInputGroupCall();
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        q50Var.f40479x3 = Boolean.valueOf(z10);
        q50Var.I1(true);
        ConnectionsManager connectionsManager = q50Var.d.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.g1(dispatchQueue), new l20(q50Var, 0));
    }

    public static void I0(q50 q50Var) {
        boolean z10;
        int i10;
        if (q50Var.s1()) {
            h30 h30Var = q50Var.a2;
            if (!h30Var.V && h30Var.f31519b && (F3 == q50Var.r1() || AndroidUtilities.isTablet())) {
                z10 = false;
            } else {
                z10 = true;
            }
            Boolean bool = q50Var.f40419j2;
            if (bool != null && z10 == bool.booleanValue()) {
                return;
            }
            int systemUiVisibility = q50Var.containerView.getSystemUiVisibility();
            if (z10) {
                i10 = systemUiVisibility & (-7);
                q50Var.getWindow().clearFlags(1024);
                q50Var.setHideSystemVerticalInsets(false);
            } else {
                q50Var.setHideSystemVerticalInsets(true);
                i10 = systemUiVisibility | 6;
                q50Var.getWindow().addFlags(1024);
            }
            q50Var.containerView.setSystemUiVisibility(i10);
            q50Var.f40419j2 = Boolean.valueOf(z10);
            q50Var.S2 = !z10;
            q50Var.containerView.requestApplyInsets();
            return;
        }
        q50Var.isFullscreen = false;
    }

    public static org.telegram.ui.Components.voip.l J0(q50 q50Var) {
        w40 w40Var = q50Var.Q;
        for (int i10 = 0; i10 < w40Var.getChildCount(); i10++) {
            View childAt = w40Var.getChildAt(i10);
            if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.l) && RecyclerView.R(childAt) >= 0) {
                return (org.telegram.ui.Components.voip.l) childAt;
            }
        }
        return null;
    }

    public static void K0(q50 q50Var) {
        boolean z10;
        Integer num;
        boolean z11;
        float f7;
        float f10;
        float dp;
        float dp2;
        float dp3;
        float f11;
        float f12;
        float f13;
        View childAt;
        m40 m40Var = q50Var.O;
        w40 w40Var = q50Var.Q;
        int childCount = w40Var.getChildCount();
        boolean z12 = false;
        float f14 = 2.1474836E9f;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (RecyclerView.R(w40Var.getChildAt(i10)) >= 0) {
                f14 = Math.min(f14, childAt.getTop());
            }
        }
        if (f14 < 0.0f || f14 == 2.1474836E9f) {
            if (childCount != 0) {
                f14 = 0.0f;
            } else {
                f14 = w40Var.getPaddingTop();
            }
        }
        if (f14 <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float dp4 = f14 + AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if ((z10 && m40Var.getTag() == null) || (!z10 && m40Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            m40Var.setTag(num);
            AnimatorSet animatorSet = q50Var.f40409h0;
            if (animatorSet != null) {
                animatorSet.cancel();
                q50Var.f40409h0 = null;
            }
            if (m40Var.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            q50Var.setUseLightStatusBar(z11);
            ViewPropertyAnimator animate = m40Var.getBackButton().animate();
            float f15 = 0.9f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.9f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f7);
            if (z10) {
                f15 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f15);
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(14.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationX(f10).setDuration(300L);
            org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f25025f;
            duration.setInterpolator(bsVar).start();
            ViewPropertyAnimator animate2 = m40Var.getTitleTextView().animate();
            if (z10) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(23.0f);
            }
            animate2.translationY(dp).setDuration(300L).setInterpolator(bsVar).start();
            ObjectAnimator objectAnimator = q50Var.U2;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                q50Var.U2.cancel();
            }
            org.telegram.ui.ActionBar.j5 subtitleTextView = m40Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            float translationY = m40Var.getSubtitleTextView().getTranslationY();
            if (z10) {
                dp2 = 0.0f;
            } else {
                dp2 = AndroidUtilities.dp(20.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, property, translationY, dp2);
            q50Var.U2 = ofFloat;
            ofFloat.setDuration(300L);
            q50Var.U2.setInterpolator(bsVar);
            q50Var.U2.addListener(new l40(0, q50Var, z10));
            q50Var.U2.start();
            ObjectAnimator objectAnimator2 = q50Var.V2;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            org.telegram.ui.ActionBar.j5 additionalSubtitleTextView = m40Var.getAdditionalSubtitleTextView();
            if (z10) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(20.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(additionalSubtitleTextView, property, dp3);
            q50Var.V2 = ofFloat2;
            ofFloat2.setDuration(300L);
            q50Var.V2.setInterpolator(bsVar);
            q50Var.V2.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            q50Var.f40409h0 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = q50Var.f40409h0;
            Property property2 = View.ALPHA;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(m40Var, property2, f11);
            a30 a30Var = q50Var.N;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(a30Var, property2, f12);
            View view = q50Var.f40405g0;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, property2, f13));
            q50Var.f40409h0.addListener(new j40(q50Var, 1));
            q50Var.f40409h0.start();
            q50Var.a2.v.setClickable((!z10 || F3) ? true : true);
        }
        if (q50Var.f40481y0 != dp4) {
            q50Var.F1(dp4);
        }
    }

    public static void O(q50 q50Var, org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (!q50Var.isDismissed()) {
            if (z10 && lVar.getRenderer() == null) {
                lVar.setRenderer(org.telegram.ui.Components.voip.t.c(q50Var.Y1, q50Var.a2, lVar, null, null, lVar.getParticipant(), q50Var.f40380a1, q50Var));
            } else if (!z10 && lVar.getRenderer() != null) {
                lVar.getRenderer().setPrimaryView(null);
                lVar.setRenderer(null);
            }
        }
    }

    public static void T(q50 q50Var, int i10, int[] iArr) {
        if (q50Var.s1()) {
            int i11 = org.telegram.ui.ActionBar.h6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Lg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21408zg, false), q50Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21130kg, false), org.telegram.ui.ActionBar.h6.x0(null, i11, false), q50Var.U1, 1.0f);
        } else if (i10 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Jg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21390yg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21408zg, false), q50Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21374xg, false);
        } else if (i10 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Gg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Bg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Cg, false), q50Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ag, false);
        } else if (q1(i10)) {
            iArr[0] = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21131kh, false);
            iArr[1] = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21149lh, false);
            iArr[2] = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21168mh, false);
        } else {
            int i12 = org.telegram.ui.ActionBar.h6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.h6.x0(null, i12, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Mg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ng, false), q50Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21130kg, false), org.telegram.ui.ActionBar.h6.x0(null, i12, false), q50Var.U1, 1.0f);
        }
        if (q1(i10)) {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21092ih, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21131kh, false));
        } else if (i10 == 1) {
            iArr[3] = i0.a.f(0.75f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Bg, false), i0.a.f(0.5f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Fg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Hg, false)));
        } else {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Jg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ig, false));
        }
    }

    public static void d1(LaunchActivity launchActivity, AccountInstance accountInstance, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        if (D3 == null) {
            if (inputPeer != null || VoIPService.getSharedInstance() != null) {
                if (inputPeer != null) {
                    D3 = new q50(launchActivity, accountInstance, accountInstance.getMessagesController().getGroupCall(chat.f20280id, false), chat, inputPeer, z10, str);
                } else {
                    ChatObject.Call call = VoIPService.getSharedInstance().groupCall;
                    if (call != null) {
                        TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(call.chatId));
                        call.addSelfDummyParticipant(true);
                        D3 = new q50(launchActivity, accountInstance, call, chat2, null, z10, str);
                    } else {
                        return;
                    }
                }
                D3.f40413i0 = launchActivity;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.rc(23));
            }
        }
    }

    public static String g1(int i10) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                if (sharedInstance != null && (str = sharedInstance.currentBluetoothDeviceName) != null) {
                    return str;
                }
                return LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
            } else if (sharedInstance != null && sharedInstance.isHeadsetPlugged()) {
                return LocaleController.getString(R.string.VoipAudioRoutingHeadset);
            } else {
                return LocaleController.getString(R.string.VoipAudioRoutingPhone);
            }
        }
        return LocaleController.getString(R.string.VoipAudioRoutingSpeaker);
    }

    public static String h1(int i10) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i10 == 2) {
            if (sharedInstance != null && (str = sharedInstance.currentBluetoothDeviceName) != null) {
                return LocaleController.formatString(R.string.VoipAudioSwitchedToBluetoothDevice, str);
            }
            return LocaleController.getString(R.string.VoipAudioSwitchedToBluetooth);
        } else if (i10 == 1) {
            if (sharedInstance != null && sharedInstance.isHeadsetPlugged()) {
                return LocaleController.getString(R.string.VoipAudioSwitchedToHeadset);
            }
            return LocaleController.getString(R.string.VoipAudioSwitchedToPhone);
        } else {
            return LocaleController.getString(R.string.VoipAudioSwitchedToSpeaker);
        }
    }

    public static void n(q50 q50Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(q50Var.currentAccount).sendRequest(declineconferencecallinvite, new k20(q50Var, 0));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(invitedUser.msg_id));
        MessagesController.getInstance(q50Var.currentAccount).deleteMessages(arrayList, null, null, 0L, 0, true, 0);
        ChatObject.Call call = q50Var.f40380a1;
        if (call != null) {
            call.invitedUsers.remove(l4);
            q50Var.f40380a1.invitedUsersMap.remove(l4);
            q50Var.f40380a1.invitedUsersMessageIds.remove(l4);
            q50Var.P0(true);
        }
    }

    public static void o(q50 q50Var, Activity activity, ChatObject.Call call, View view, int i10) {
        TLRPC.Chat chat;
        final ChatObject.Call.InvitedUser invitedUser;
        AccountInstance accountInstance = q50Var.d;
        ArrayList arrayList = q50Var.F0;
        k50 k50Var = q50Var.P;
        if (view instanceof org.telegram.ui.Components.voip.l) {
            q50Var.f1(((org.telegram.ui.Components.voip.l) view).getParticipant());
        } else if (view instanceof org.telegram.ui.Cells.d4) {
            q50Var.G1((org.telegram.ui.Cells.d4) view);
        } else {
            Collection collection = null;
            r7 = null;
            r7 = null;
            r7 = null;
            final Long l4 = null;
            boolean z10 = true;
            if (view instanceof org.telegram.ui.Cells.v3) {
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
                if (v3Var.getUser() != null) {
                    if (q50Var.p1()) {
                        int i11 = i10 - k50Var.f38424n;
                        if (i11 >= 0 && i11 < q50Var.f40380a1.shadyJoinParticipants.size()) {
                            l4 = q50Var.f40380a1.shadyJoinParticipants.get(i10 - k50Var.f38424n);
                        } else {
                            int i12 = i10 - k50Var.f38426s;
                            if (i12 >= 0 && i12 < q50Var.f40380a1.shadyLeftParticipants.size()) {
                                l4 = q50Var.f40380a1.shadyLeftParticipants.get(i10 - k50Var.f38426s);
                            } else {
                                int i13 = i10 - k50Var.f38423f;
                                if (q50Var.f40454s0) {
                                    if (i13 >= 0 && i13 < arrayList.size()) {
                                        l4 = (Long) arrayList.get(i13);
                                    }
                                } else if (i13 >= 0 && i13 < q50Var.f40380a1.invitedUsers.size()) {
                                    l4 = q50Var.f40380a1.invitedUsers.get(i13);
                                }
                                z10 = false;
                            }
                        }
                        if (!z10 && (invitedUser = q50Var.f40380a1.invitedUsersMessageIds.get(l4)) != null) {
                            org.telegram.ui.Components.i80 F = org.telegram.ui.Components.i80.F(q50Var.container, q50Var.resourcesProvider, v3Var);
                            F.l(R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable(q50Var) {
                                public final q50 f37844b;

                                {
                                    this.f37844b = q50Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            q50.t(this.f37844b, invitedUser, l4);
                                            return;
                                        default:
                                            q50.n(this.f37844b, invitedUser, l4);
                                            return;
                                    }
                                }
                            }, invitedUser.isCalling());
                            F.c(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable(q50Var) {
                                public final q50 f37844b;

                                {
                                    this.f37844b = q50Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            q50.t(this.f37844b, invitedUser, l4);
                                            return;
                                        default:
                                            q50.n(this.f37844b, invitedUser, l4);
                                            return;
                                    }
                                }
                            }, false);
                            F.W(org.telegram.ui.ActionBar.h6.d0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), q50Var.C0.getColor()));
                            F.f27189s = 96;
                            F.Z();
                            return;
                        }
                        return;
                    }
                    q50Var.f40413i0.O0(q50Var.currentAccount);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", v3Var.getUser().f20427id);
                    if (v3Var.f23632a.getImageReceiver().hasNotThumb()) {
                        bundle.putBoolean("expandPhoto", true);
                    }
                    q50Var.f40413i0.t0(new ProfileActivity(bundle, null));
                    q50Var.dismiss();
                }
            } else if (i10 == k50Var.f38427w) {
                if (ChatObject.isChannel(q50Var.Z0) && (chat = q50Var.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)) {
                    q50Var.k1(false);
                    return;
                }
                TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(q50Var.j1());
                if (chatFull != null) {
                    q50Var.f40471w0 = false;
                    Context context = q50Var.getContext();
                    int currentAccount = accountInstance.getCurrentAccount();
                    TLRPC.Chat chat2 = q50Var.Z0;
                    ChatObject.Call call2 = q50Var.f40380a1;
                    org.telegram.ui.Components.a40 a40Var = new org.telegram.ui.Components.a40(context, currentAccount, chat2, chatFull, call2.participants, call2.invitedUsersMap);
                    q50Var.E1 = a40Var;
                    a40Var.setOnDismissListener(new g20(q50Var, 2));
                    org.telegram.ui.Components.a40 a40Var2 = q50Var.E1;
                    a40Var2.f24494g0 = new q20(q50Var);
                    a40Var2.show();
                }
            } else if (i10 == k50Var.f38428x) {
                ChatObject.Call call3 = q50Var.f40380a1;
                if (call3 != null && call3.call != null) {
                    ug.m1 m1Var = new ug.m1(activity, q50Var.currentAccount, null, 4, new ci.k0());
                    ChatObject.Call call4 = q50Var.f40380a1;
                    if (call4 != null) {
                        collection = (Collection) Collection.EL.stream(call4.sortedParticipants).map(new k2.f(5)).collect(Collectors.toSet());
                    }
                    m1Var.C0.addAll(collection);
                    m1Var.i0(false, true);
                    m1Var.A0 = new c20(q50Var, 3);
                    m1Var.i0(false, true);
                    m1Var.D0 = new ai.r5(18, q50Var, call);
                    m1Var.show();
                }
            } else if (i10 == k50Var.f38429y) {
                q50Var.w1();
            }
        }
    }

    public static void p(q50 q50Var, Activity activity) {
        LaunchActivity launchActivity = q50Var.f40413i0;
        if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
            q50Var.f40413i0.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
        } else if (VoIPService.getSharedInstance() != null) {
            boolean z10 = false;
            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                q50Var.f40417j0[0].e(1, false);
                if (q50Var.f40484z0 == null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null) {
                        sharedInstance.createCaptureDevice(false);
                    }
                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                        z10 = true;
                    }
                    b40 b40Var = new b40(q50Var, activity, z10);
                    q50Var.f40484z0 = b40Var;
                    b40Var.setBottomPadding(q50Var.containerView.getPaddingBottom());
                    q50Var.container.addView(q50Var.f40484z0);
                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                        return;
                    }
                    return;
                }
                return;
            }
            VoIPService.getSharedInstance().setVideoState(false, 0);
            q50Var.O1(true, false);
            q50Var.N1(false);
            q50Var.f40380a1.sortParticipants();
            q50Var.P0(true);
            q50Var.e.requestLayout();
        }
    }

    public static void q(q50 q50Var, float f7, float f10, float f11, int i10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        q50Var.f40394d2 = floatValue;
        q50Var.a2.f31533n = floatValue;
        float f12 = (floatValue * 1.0f) + ((1.0f - floatValue) * f7);
        k30 k30Var = q50Var.C2;
        k30Var.setScaleX(f12);
        k30Var.setScaleY(f12);
        k30Var.setTranslationX((1.0f - q50Var.f40394d2) * f10);
        k30Var.setTranslationY((1.0f - q50Var.f40394d2) * f11);
        if (!q50Var.f40407g2) {
            q50Var.W2.setAlpha((int) (q50Var.f40394d2 * 100.0f));
        }
        org.telegram.ui.Components.voip.t tVar = q50Var.Z2;
        if (tVar != null) {
            tVar.f31712a.setRoundCorners((1.0f - q50Var.f40394d2) * AndroidUtilities.dp(8.0f));
        }
        k30Var.invalidate();
        q50Var.containerView.invalidate();
        j30 j30Var = q50Var.f40382b;
        int i11 = (int) ((1.0f - q50Var.f40394d2) * i10);
        j30Var.N(i11, i11);
    }

    public static boolean q1(int i10) {
        if ((VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.call.rtmp_stream) && i10 != 2 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            return false;
        }
        return true;
    }

    public static void s(q50 q50Var, ChatObject.Call call, Boolean bool, HashSet hashSet) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        ChatObject.Call call2 = q50Var.f40380a1;
        if (call2 != null && (groupCall = call2.call) != null) {
            String str = groupCall.invite_link;
            int size = hashSet.size();
            AtomicInteger atomicInteger = new AtomicInteger(0);
            HashSet hashSet2 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                q50Var.f40380a1.addInvitedUser(longValue);
                TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                inviteconferencecallparticipant.call = tL_inputGroupCall;
                TLRPC.GroupCall groupCall2 = q50Var.f40380a1.call;
                tL_inputGroupCall.f20297id = groupCall2.f20290id;
                tL_inputGroupCall.access_hash = groupCall2.access_hash;
                inviteconferencecallparticipant.user_id = MessagesController.getInstance(q50Var.currentAccount).getInputUser(longValue);
                inviteconferencecallparticipant.video = bool.booleanValue();
                ConnectionsManager.getInstance(q50Var.currentAccount).sendRequest(inviteconferencecallparticipant, new gi.z0(q50Var, longValue, hashSet2, atomicInteger, size, call, str));
            }
            q50Var.P0(true);
            if (bool.booleanValue() && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(false) != 1) {
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                sharedInstance.requestVideoCall(false);
                sharedInstance.setVideoState(false, 2);
                sharedInstance.setMicMute(false, false, true);
                sharedInstance.switchToSpeaker();
                q50Var.O1(true, true);
            }
        }
    }

    public static void t(q50 q50Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(q50Var.currentAccount).sendRequest(declineconferencecallinvite, new k20(q50Var, 1));
        ChatObject.Call call = q50Var.f40380a1;
        if (call != null) {
            invitedUser.calling = false;
            call.invitedUsersMessageIds.put(l4, invitedUser);
            q50Var.P0(true);
        }
    }

    public static void u(q50 q50Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(q50Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
        }
    }

    public static void u1(Context context, Runnable runnable, boolean z10, boolean z11) {
        int dp;
        int dp2;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            ChatObject.Call call = sharedInstance.groupCall;
            long selfId = sharedInstance.getSelfId();
            if (!z11 && ChatObject.canManageCalls(chat)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                if (sharedInstance.isConference()) {
                    alertDialog$Builder.f20609a.R = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertTitle);
                    alertDialog$Builder.f20609a.T = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertText);
                } else if (ChatObject.isChannelOrGiga(chat)) {
                    alertDialog$Builder.f20609a.R = LocaleController.getString(R.string.VoipChannelLeaveAlertTitle);
                    alertDialog$Builder.f20609a.T = LocaleController.getString(R.string.VoipChannelLeaveAlertText);
                } else {
                    alertDialog$Builder.f20609a.R = LocaleController.getString(R.string.VoipGroupLeaveAlertTitle);
                    alertDialog$Builder.f20609a.T = LocaleController.getString(R.string.VoipGroupLeaveAlertText);
                }
                sharedInstance.getAccount();
                org.telegram.ui.Cells.a2[] a2VarArr = new org.telegram.ui.Cells.a2[1];
                LinearLayout e = org.telegram.messenger.nk.e(context, 1);
                if (!sharedInstance.isConference() || (call != null && (groupCall = call.call) != null && groupCall.creator)) {
                    org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, 1);
                    a2VarArr[0] = a2Var;
                    a2Var.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                    if (z10) {
                        a2VarArr[0].setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21100j5, false));
                    } else {
                        a2VarArr[0].setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21073hg, false));
                        CheckBoxSquare checkBoxSquare = (CheckBoxSquare) a2VarArr[0].getCheckBoxView();
                        int i10 = org.telegram.ui.ActionBar.h6.f21261rg;
                        int i11 = org.telegram.ui.ActionBar.h6.f21222pg;
                        int i12 = org.telegram.ui.ActionBar.h6.f21187ng;
                        checkBoxSquare.f24170s = i10;
                        checkBoxSquare.v = i11;
                        checkBoxSquare.f24171w = i12;
                        checkBoxSquare.invalidate();
                    }
                    a2VarArr[0].setTag(0);
                    if (sharedInstance.isConference()) {
                        a2VarArr[0].e(LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertEndChat), "", false, false, false);
                    } else if (ChatObject.isChannelOrGiga(chat)) {
                        a2VarArr[0].e(LocaleController.getString(R.string.VoipChannelLeaveAlertEndChat), "", false, false, false);
                    } else {
                        a2VarArr[0].e(LocaleController.getString(R.string.VoipGroupLeaveAlertEndChat), "", false, false, false);
                    }
                    org.telegram.ui.Cells.a2 a2Var2 = a2VarArr[0];
                    if (LocaleController.isRTL) {
                        dp = AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(8.0f);
                    }
                    if (LocaleController.isRTL) {
                        dp2 = AndroidUtilities.dp(8.0f);
                    } else {
                        dp2 = AndroidUtilities.dp(16.0f);
                    }
                    a2Var2.setPadding(dp, 0, dp2, 0);
                    e.addView(a2VarArr[0], w7.z5.n(-1, -2));
                    a2VarArr[0].setOnClickListener(new d20(a2VarArr, 0));
                }
                alertDialog$Builder.n(e);
                alertDialog$Builder.f20609a.I = org.telegram.ui.ActionBar.h6.f21222pg;
                alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new ai.y3(call, a2VarArr, selfId, runnable, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (z10) {
                    alertDialog$Builder.f20609a.P0 = false;
                }
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
                if (z10) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        b2Var.getWindow().setType(2038);
                    } else {
                        b2Var.getWindow().setType(2003);
                    }
                    b2Var.getWindow().clearFlags(2);
                }
                if (!z10) {
                    b2Var.j(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21319ug, false));
                }
                b2Var.show();
                if (!z10) {
                    TextView textView = (TextView) b2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21337vg, false));
                    }
                    b2Var.p(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21073hg, false));
                    return;
                }
                return;
            }
            x1(call, false, selfId, runnable);
        }
    }

    public static void v(q50 q50Var) {
        q50Var.Z0();
        q50Var.W0();
        q50Var.V0();
        q50Var.F.setTranslationY((-q50Var.C1.d()) + q50Var.containerView.getPaddingBottom());
        q50Var.G.invalidate();
        q50Var.a1();
        q50Var.containerView.invalidate();
    }

    public static void w(q50 q50Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(q50Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
        }
    }

    public static void x(q50 q50Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(q50Var.currentAccount).lambda$processUpdates$377(updates, false);
            AndroidUtilities.runOnUIThread(new a3.i0(q50Var, updates, j10, 27));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j10));
        }
        if (atomicInteger.incrementAndGet() == i10 && !hashSet.isEmpty()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90(q50Var, hashSet, call, str, 12));
        }
    }

    public static void x1(ChatObject.Call call, boolean z10, long j10, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z10 ? 1 : 0);
        }
        if (call != null) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(j10);
            if (groupCallParticipant != null) {
                call.participants.e(j10);
                call.sortedParticipants.remove(groupCallParticipant);
                call.visibleParticipants.remove(groupCallParticipant);
                int i10 = 0;
                while (i10 < call.visibleVideoParticipants.size()) {
                    if (MessageObject.getPeerId(call.visibleVideoParticipants.get(i10).participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                        call.visibleVideoParticipants.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                TLRPC.GroupCall groupCall = call.call;
                groupCall.participants_count--;
            }
            for (int i11 = 0; i11 < call.sortedParticipants.size(); i11++) {
                TLRPC.GroupCallParticipant groupCallParticipant2 = call.sortedParticipants.get(i11);
                groupCallParticipant2.lastActiveDate = groupCallParticipant2.lastSpeakTime;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
    }

    public static void y(q50 q50Var, HashSet hashSet, ChatObject.Call call, String str) {
        TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l4 = (Long) it.next();
            long longValue = l4.longValue();
            if (call != null) {
                call.removeInvitedUser(longValue);
            }
            arrayList.add(MessagesController.getInstance(q50Var.currentAccount).getUser(l4));
            getrequirementstocontact.f20484id.add(MessagesController.getInstance(q50Var.currentAccount).getInputUser(longValue));
        }
        org.telegram.ui.Components.g30 g30Var = new org.telegram.ui.Components.g30(q50Var, arrayList, arrayList2, arrayList3, str, 7);
        if (UserConfig.getInstance(q50Var.currentAccount).isPremium()) {
            g30Var.run();
        } else {
            ConnectionsManager.getInstance(q50Var.currentAccount).sendRequest(getrequirementstocontact, new ca(arrayList, arrayList2, g30Var, 13));
        }
    }

    public static void z(q50 q50Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        sg.k0 k0Var = new sg.k0(34, q50Var.currentAccount, U.getContext(), U, new ci.k0());
        k0Var.J1(null, arrayList, arrayList2, arrayList3, str);
        k0Var.show();
    }

    public final void A1() {
        a6 a6Var = this.A2;
        AndroidUtilities.cancelRunOnUIThread(a6Var);
        if (this.f40486z2 && this.U0 != null && VoIPService.getSharedInstance() != null && s1() && this.Q != null && LiteMode.isEnabled(512)) {
            AndroidUtilities.runOnUIThread(a6Var, 30L);
        }
    }

    public final void B1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall inputGroupCall;
        long j10;
        this.H.setText("");
        ChatObject.Call call = this.f40380a1;
        if (call != null && call.call != null && (inputGroupCall = call.getInputGroupCall()) != null) {
            ChatObject.Call call2 = this.f40380a1;
            long j11 = call2.call.f20290id;
            TLRPC.Peer peer = call2.selfPeer;
            if (peer != null) {
                j10 = DialogObject.getPeerDialogId(peer);
            } else {
                j10 = UserConfig.getInstance(this.currentAccount).clientUserId;
            }
            GroupCallMessagesController.getInstance(this.currentAccount).sendCallMessage(j10, tL_textWithEntities, j11, inputGroupCall);
        }
    }

    public final void C1(float f7) {
        float f10;
        int i10;
        int i11;
        this.U1 = f7;
        h30 h30Var = this.a2;
        if (h30Var == null) {
            f10 = 0.0f;
        } else {
            f10 = h30Var.f31521c;
        }
        float max = Math.max(f7, f10);
        int i12 = org.telegram.ui.ActionBar.h6.f21111jg;
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.h6.f21057gg;
        int offsetColor = AndroidUtilities.getOffsetColor(x02, org.telegram.ui.ActionBar.h6.x0(null, i13, false), f7, 1.0f);
        this.V1 = offsetColor;
        this.N.setBackgroundColor(offsetColor);
        this.f40422k1.B(-14472653);
        this.f40401f0.setColorFilter(new PorterDuffColorFilter(this.V1, PorterDuff.Mode.MULTIPLY));
        this.navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false), org.telegram.ui.ActionBar.h6.x0(null, i13, false), max, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21130kg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21300tg, false), f7, 1.0f);
        b50 b50Var = this.f40440p0;
        if (b50Var != null) {
            b50Var.f35511j = offsetColor2;
            v10 v10Var = b50Var.f35509g;
            if (v10Var != null) {
                v10Var.invalidate();
            }
        }
        this.C0.setColor(offsetColor2);
        this.E.setColor(offsetColor2);
        this.F.invalidate();
        w40 w40Var = this.Q;
        w40Var.setGlowColor(offsetColor2);
        int i14 = this.F1;
        if (i14 == 3 || q1(i14)) {
            this.f40470w.invalidate();
        }
        View view = this.J2;
        if (view != null) {
            int i15 = this.V1;
            int[] iArr = this.M2;
            iArr[0] = i15;
            iArr[1] = 0;
            if (Build.VERSION.SDK_INT > 29) {
                this.L2.setColors(iArr);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
                this.L2 = gradientDrawable;
                view.setBackground(gradientDrawable);
            }
            this.K2.setBackgroundColor(iArr[0]);
        }
        int offsetColor3 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Dg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Eg, false), f7, 1.0f);
        this.f40453s.a(offsetColor3, offsetColor3);
        int offsetColor4 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21148lg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21205og, false), f7, 1.0f);
        int offsetColor5 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21167mg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21261rg, false), f7, 1.0f);
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.resourcesProvider);
        int childCount = w40Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = w40Var.getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Cells.w3) {
                org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) childAt;
                if (p1()) {
                    w3Var.a(w02, w02);
                } else {
                    w3Var.a(offsetColor5, offsetColor4);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.d4;
                m40 m40Var = this.O;
                if (z10) {
                    org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) childAt;
                    if (m40Var.getTag() != null) {
                        i11 = org.telegram.ui.ActionBar.h6.f21261rg;
                    } else {
                        i11 = org.telegram.ui.ActionBar.h6.f21167mg;
                    }
                    d4Var.f(i11, offsetColor5);
                } else if (childAt instanceof org.telegram.ui.Cells.v3) {
                    org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) childAt;
                    if (m40Var.getTag() != null) {
                        i10 = org.telegram.ui.ActionBar.h6.f21261rg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.h6.f21167mg;
                    }
                    v3Var.a(i10, offsetColor5);
                }
            }
        }
        this.containerView.invalidate();
        w40Var.invalidate();
        this.container.invalidate();
    }

    public final void D1(float f7) {
        w40 w40Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        s4.b1 K;
        f7 = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) ? 0.0f : 0.0f;
        float min = (float) (Math.min(8500.0d, 4000.0f * f7) / 8500.0d);
        this.P0 = min;
        this.Q0 = (min - this.O0) / 265.0f;
        ChatObject.Call call = this.f40380a1;
        if (call != null && (w40Var = this.Q) != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(MessageObject.getPeerId(this.A0))) != null) {
            h30 h30Var = this.a2;
            if (!h30Var.f31519b) {
                if (this.f40454s0) {
                    arrayList = this.D0;
                } else {
                    arrayList = this.f40380a1.visibleParticipants;
                }
                int indexOf = arrayList.indexOf(groupCallParticipant);
                if (indexOf >= 0 && (K = w40Var.K(indexOf + this.P.d)) != null) {
                    View view = K.f45921a;
                    if (view instanceof org.telegram.ui.Cells.d4) {
                        ((org.telegram.ui.Cells.d4) view).setAmplitude(f7 * 15.0f);
                        if (view == this.X2 && !this.f40426l2) {
                            this.containerView.invalidate();
                        }
                    }
                }
            } else {
                int i10 = 0;
                while (true) {
                    d30 d30Var = this.f40429m2;
                    if (i10 >= d30Var.getChildCount()) {
                        break;
                    }
                    org.telegram.ui.Components.z20 z20Var = (org.telegram.ui.Components.z20) d30Var.getChildAt(i10);
                    if (MessageObject.getPeerId(z20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                        z20Var.setAmplitude(f7 * 15.0f);
                    }
                    i10++;
                }
            }
            h30Var.k(groupCallParticipant, f7 * 15.0f);
        }
    }

    public final void E1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        this.f40408g3 = i10;
        this.f40412h3 = i11;
        this.f40416i3 = i12;
        this.f40420j3 = i13;
        this.f40424k3 = i14;
        this.f40427l3 = i15;
        this.f40430m3 = i16;
        this.f40435n3 = i17;
        this.f40439o3 = i18;
        this.f40443p3 = i19;
        this.f40447q3 = i20;
        this.f40452r3 = i21;
        this.f40457s3 = i22;
        this.f40461t3 = i23;
        this.f40465u3 = i24;
        this.f40469v3 = i25;
    }

    public final void F1(float f7) {
        w40 w40Var;
        int dp;
        int i10;
        float f10;
        this.f40481y0 = f7;
        this.Q.setTopGlowOffset((int) (f7 - ((FrameLayout.LayoutParams) w40Var.getLayoutParams()).topMargin));
        float dp2 = f7 - AndroidUtilities.dp(74.0f);
        int i11 = ((this.backgroundPaddingTop + dp2) > (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) ? 1 : ((this.backgroundPaddingTop + dp2) == (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) ? 0 : -1));
        f50 f50Var = this.U0;
        h30 h30Var = this.a2;
        b30 b30Var = this.f40402f1;
        z20 z20Var = this.f40397e1;
        if (i11 < 0) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) - dp2) - this.backgroundPaddingTop) / (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f))));
            if (AndroidUtilities.isTablet()) {
                f10 = 17.0f;
            } else {
                f10 = 13.0f;
            }
            i10 = (int) (AndroidUtilities.dp(f10) * min);
            if (f50Var != null) {
                f50Var.setShadowOffset((int) (AndroidUtilities.dp(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.U1) > 1.0E-4f) {
                C1(Math.min(1.0f, min));
            }
            float z10 = org.telegram.ui.Cells.c1.z(min, 0.1f, 1.2f, 1.0f);
            z20Var.setScaleX(Math.max(0.9f, z10));
            z20Var.setScaleY(Math.max(0.9f, z10));
            float f11 = 1.0f - (min * 1.2f);
            z20Var.setAlpha((1.0f - h30Var.f31521c) * Math.max(0.0f, f11));
            b30Var.setScaleX(Math.max(0.9f, z10));
            b30Var.setScaleY(Math.max(0.9f, z10));
            b30Var.setAlpha((1.0f - h30Var.f31521c) * Math.max(0.0f, f11));
        } else {
            z20Var.setScaleX(1.0f);
            z20Var.setScaleY(1.0f);
            z20Var.setAlpha(1.0f - h30Var.f31521c);
            b30Var.setScaleX(1.0f);
            b30Var.setScaleY(1.0f);
            b30Var.setAlpha(1.0f - h30Var.f31521c);
            if (this.U1 > 1.0E-4f) {
                C1(0.0f);
            }
            i10 = 0;
        }
        Z0();
        float f12 = i10;
        this.f40485z1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(53.0f)) - f12));
        this.f40418j1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f12));
        if (f50Var != null) {
            f50Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), f7 - AndroidUtilities.dp(37.0f)));
        }
        y30 y30Var = this.R;
        if (y30Var != null) {
            y30Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f12));
        }
        this.containerView.invalidate();
        R1();
    }

    public final boolean G1(android.view.View r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q50.G1(android.view.View):boolean");
    }

    public final void H1(View view) {
        if (this.m0 == null) {
            org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(8, getContext(), null, true);
            this.m0 = r40Var;
            r40Var.setAlpha(0.0f);
            this.m0.setVisibility(4);
            this.m0.setShowingDuration(3000L);
            this.containerView.addView(this.m0, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            if (ChatObject.isChannelOrGiga(this.Z0)) {
                this.m0.setText(LocaleController.getString(R.string.VoipChannelRecording));
            } else {
                this.m0.setText(LocaleController.getString(R.string.VoipGroupRecording));
            }
            this.m0.d();
        }
        this.m0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        this.m0.f(view, true);
    }

    public final void I1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        ChatObject.Call call = this.f40380a1;
        org.telegram.ui.Components.voip.t2 t2Var = this.v;
        org.telegram.ui.Components.voip.t2 t2Var2 = this.h;
        org.telegram.ui.Components.voip.t2 t2Var3 = this.f40448r;
        org.telegram.ui.Components.voip.t2 t2Var4 = this.f40400f;
        org.telegram.ui.Components.voip.t2 t2Var5 = this.f40431n;
        org.telegram.ui.Components.voip.t2 t2Var6 = this.f40453s;
        org.telegram.ui.Components.voip.t2 t2Var7 = this.f40470w;
        boolean z19 = true;
        u20 u20Var = this.e;
        boolean z20 = false;
        if (call != null && !call.isScheduled()) {
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f40380a1.participants.f(MessageObject.getPeerId(this.A0));
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !R0()) {
                z14 = true;
            } else {
                z14 = false;
            }
            Boolean bool = this.f40479x3;
            if (bool != null) {
                z15 = bool.booleanValue();
            } else {
                TLRPC.GroupCall groupCall = this.f40380a1.call;
                if (groupCall != null && groupCall.messages_enabled) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            if (((!z14 && this.f40380a1.canRecordVideo()) || z13) && !s1()) {
                z16 = true;
            } else {
                z16 = false;
                z20 = true;
            }
            if (z13) {
                z18 = true;
                z17 = false;
            } else {
                z17 = !z14;
                z18 = false;
            }
            if (F3) {
                z17 = false;
                z18 = false;
            }
            u20Var.c(t2Var7, true, z10);
            u20Var.c(t2Var6, true, z10);
            u20Var.c(t2Var5, z16, z10);
            u20Var.c(t2Var4, z18, z10);
            u20Var.c(t2Var3, z20, z10);
            u20Var.c(t2Var2, z17, z10);
            u20Var.c(t2Var, z15, z10);
            return;
        }
        if (this.V0 > 0.1f) {
            z11 = true;
        } else {
            z11 = false;
        }
        u20Var.c(t2Var7, z11, z10);
        if (this.V0 > 0.1f) {
            z12 = true;
        } else {
            z12 = false;
        }
        u20Var.c(t2Var6, z12, z10);
        if (this.V0 <= 0.1f) {
            z19 = false;
        }
        u20Var.c(t2Var3, z19, z10);
        u20Var.c(t2Var5, false, z10);
        u20Var.c(t2Var4, false, z10);
        u20Var.c(t2Var2, false, z10);
        u20Var.c(t2Var, false, z10);
    }

    public final void J1() {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        TLObject chat;
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        int i13;
        int i14;
        TLRPC.Chat chat2;
        TLRPC.Chat chat3;
        ChatObject.Call call2 = this.f40380a1;
        org.telegram.ui.ActionBar.u0 u0Var = this.f40422k1;
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f40428m1;
        if (call2 == null || call2.isScheduled()) {
            this.l1.setVisibility(4);
            u0Var2.setVisibility(8);
            if (this.f40380a1 == null) {
                u0Var.setVisibility(8);
                return;
            }
        }
        if (this.f40425l0) {
            return;
        }
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat4 = accountInstance.getMessagesController().getChat(Long.valueOf(j1()));
        if (chat4 != null) {
            this.Z0 = chat4;
        }
        boolean canUserDoAdminAction = ChatObject.canUserDoAdminAction(this.Z0, 3);
        org.telegram.ui.ActionBar.e1 e1Var = this.f40433n1;
        if (!canUserDoAdminAction && (((ChatObject.isChannel(this.Z0) && ((chat3 = this.Z0) == null || !chat3.megagroup)) || (!ChatObject.isPublic(this.Z0) && !ChatObject.canUserDoAdminAction(this.Z0, 3))) && (!ChatObject.isChannel(this.Z0) || (chat2 = this.Z0) == null || chat2.megagroup || !ChatObject.isPublic(chat2)))) {
            e1Var.setVisibility(8);
        } else {
            e1Var.setVisibility(0);
        }
        ChatObject.Call call3 = this.f40380a1;
        org.telegram.ui.ActionBar.e1 e1Var2 = this.f40482y1;
        org.telegram.ui.ActionBar.e1 e1Var3 = this.f40477x1;
        if (call3 != null && (groupCall2 = call3.call) != null && groupCall2.can_change_messages_enabled) {
            if (groupCall2.messages_enabled) {
                i13 = 8;
            } else {
                i13 = 0;
            }
            e1Var3.setVisibility(i13);
            if (this.f40380a1.call.messages_enabled) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            e1Var2.setVisibility(i14);
        } else {
            e1Var3.setVisibility(8);
            e1Var2.setVisibility(8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f40380a1.participants.f(MessageObject.getPeerId(this.A0));
        ChatObject.Call call4 = this.f40380a1;
        org.telegram.ui.ActionBar.e1 e1Var4 = this.f40445q1;
        if (call4 != null && !call4.isScheduled() && (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            e1Var4.setVisibility(0);
        } else {
            e1Var4.setVisibility(8);
        }
        if (SharedConfig.noiseSupression) {
            i10 = R.drawable.msg_noise_on;
        } else {
            i10 = R.drawable.msg_noise_off;
        }
        e1Var4.setIcon(i10);
        if (SharedConfig.noiseSupression) {
            i11 = R.string.VoipNoiseCancellationEnabled;
        } else {
            i11 = R.string.VoipNoiseCancellationDisabled;
        }
        e1Var4.setSubtext(LocaleController.getString(i11));
        boolean R0 = R0();
        org.telegram.ui.ActionBar.e1 e1Var5 = this.f40472w1;
        org.telegram.ui.ActionBar.e1 e1Var6 = this.f40437o1;
        boolean z12 = true;
        org.telegram.ui.ActionBar.e1 e1Var7 = this.f40455s1;
        org.telegram.ui.ActionBar.e1 e1Var8 = this.f40459t1;
        if (R0) {
            e1Var5.setVisibility(0);
            e1Var6.setVisibility(0);
            if (s1()) {
                e1Var7.setVisibility(0);
                e1Var8.setVisibility(8);
            } else if (this.f40380a1.isScheduled()) {
                e1Var7.setVisibility(8);
                e1Var8.setVisibility(8);
            } else {
                e1Var7.setVisibility(0);
            }
            if (p1()) {
                e1Var7.setVisibility(8);
                e1Var6.setVisibility(8);
            }
            if (this.f40380a1.canRecordVideo() && !this.f40380a1.isScheduled() && !s1()) {
                e1Var8.setVisibility(0);
            } else {
                e1Var8.setVisibility(8);
            }
            u0Var2.setVisibility(8);
            boolean z13 = this.f40380a1.recording;
            l50 l50Var = this.f40393d1;
            l50Var.f38802f = z13;
            l50Var.d = 1.0f;
            l50Var.invalidateSelf();
            if (this.f40380a1.recording) {
                if (this.D1 == null) {
                    c20 c20Var = new c20(this, 6);
                    this.D1 = c20Var;
                    AndroidUtilities.runOnUIThread(c20Var, 1000L);
                }
                e1Var7.setText(LocaleController.getString(R.string.VoipGroupStopRecordCall));
            } else {
                c20 c20Var2 = this.D1;
                if (c20Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(c20Var2);
                    this.D1 = null;
                }
                e1Var7.setText(LocaleController.getString(R.string.VoipGroupRecordCall));
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                e1Var8.g(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
            } else {
                e1Var8.g(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
            }
            L1();
        } else {
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !R0()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z10 && ((this.f40380a1.canRecordVideo() || z11) && !this.f40380a1.isScheduled() && !s1())) {
                if (z11) {
                    u0Var2.setVisibility(8);
                    e1Var8.setVisibility(0);
                    e1Var8.g(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
                    e1Var8.setContentDescription(LocaleController.getString(R.string.VoipChatStopScreenCapture));
                } else {
                    e1Var8.g(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
                    e1Var8.setContentDescription(LocaleController.getString(R.string.VoipChatStartScreenCapture));
                    u0Var2.setVisibility(8);
                    e1Var8.setVisibility(0);
                }
            } else {
                u0Var2.setVisibility(8);
                e1Var8.setVisibility(8);
            }
            e1Var5.setVisibility(8);
            e1Var6.setVisibility(8);
            e1Var7.setVisibility(8);
        }
        boolean R02 = R0();
        org.telegram.ui.ActionBar.e1 e1Var9 = this.f40450r1;
        if (R02 && this.f40380a1.call.can_change_join_muted && !p1()) {
            e1Var9.setVisibility(0);
        } else {
            e1Var9.setVisibility(8);
        }
        if (p1() && ((call = this.f40380a1) == null || (groupCall = call.call) == null || !groupCall.creator)) {
            z12 = false;
        }
        u0Var.I(4, z12);
        if (s1() && !this.f40380a1.isScheduled()) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        this.f40441p1.setVisibility(i12);
        int visibility = e1Var6.getVisibility();
        TextView textView = this.A1;
        if (visibility != 0 && e1Var9.getVisibility() != 0 && e1Var.getVisibility() != 0 && e1Var8.getVisibility() != 0 && e1Var7.getVisibility() != 0 && e1Var5.getVisibility() != 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.f40421k0;
        if (((sharedInstance != null && VoIPService.getSharedInstance().hasFewPeers) || this.f40384b1) && !s1() && this.A0 != null) {
            kVar.setVisibility(0);
            long peerId = MessageObject.getPeerId(this.A0);
            if (DialogObject.isUserDialog(peerId)) {
                chat = accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
            } else {
                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
            }
            kVar.setObject(chat);
        } else {
            kVar.setVisibility(8);
        }
        TLRPC.Chat chat5 = this.Z0;
        if (chat5 != null && !ChatObject.isChannelOrGiga(chat5) && s1() && e1Var.getVisibility() == 8) {
            u0Var.setVisibility(8);
        } else {
            u0Var.setVisibility(0);
        }
        LinearLayout linearLayout = this.f40418j1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f7 = 96;
        if (layoutParams.rightMargin != AndroidUtilities.dp(f7)) {
            layoutParams.rightMargin = AndroidUtilities.dp(f7);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.f40485z1.getLayoutParams()).rightMargin = 0;
        this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
    }

    public final void K1(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q50.K1(int, boolean):void");
    }

    public final void L1() {
        if (this.f40380a1 == null) {
            return;
        }
        int currentTime = this.d.getConnectionsManager().getCurrentTime();
        ChatObject.Call call = this.f40380a1;
        int i10 = currentTime - call.call.record_start_date;
        boolean z10 = call.recording;
        org.telegram.ui.ActionBar.e1 e1Var = this.f40455s1;
        if (z10) {
            e1Var.setSubtext(AndroidUtilities.formatDuration(i10, false));
        } else {
            e1Var.setSubtext(null);
        }
    }

    public final void M1(boolean z10) {
        float interpolation;
        float f7;
        y30 y30Var = this.R;
        if ((y30Var == null || this.f40380a1 != null) && this.X0 == null) {
            this.W0 = 1.0f;
            this.V0 = 1.0f;
            if (y30Var == null) {
                return;
            }
        }
        int i10 = 4;
        if (!z10) {
            y20 y20Var = this.f40473w2;
            AndroidUtilities.cancelRunOnUIThread(y20Var);
            y20Var.run();
            ChatObject.Call call = this.f40380a1;
            w40 w40Var = this.Q;
            if (call != null && !call.isScheduled()) {
                w40Var.setVisibility(0);
            } else {
                w40Var.setVisibility(4);
            }
            boolean isChannelOrGiga = ChatObject.isChannelOrGiga(this.Z0);
            org.telegram.ui.ActionBar.e1 e1Var = this.f40472w1;
            if (isChannelOrGiga) {
                e1Var.setText(LocaleController.getString(R.string.VoipChannelCancelChat));
            } else {
                e1Var.setText(LocaleController.getString(R.string.VoipGroupCancelChat));
            }
        }
        float f10 = this.V0;
        if (f10 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.bs.f25025f.getInterpolation((f10 - 0.6f) / 0.4f) * 0.05f);
            this.W0 = 1.0f;
            f7 = 1.0f;
        } else {
            org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f25025f;
            this.W0 = bsVar.getInterpolation(f10 / 0.6f);
            interpolation = 1.05f * bsVar.getInterpolation(this.V0 / 0.6f);
            f7 = this.V0 / 0.6f;
        }
        I1(true);
        float f11 = 1.0f - f7;
        y30Var.setAlpha(f11);
        this.U.setAlpha(f7);
        this.W.setAlpha(f7);
        v40 v40Var = this.V;
        v40Var.setAlpha(f7);
        v40Var.setScaleX(interpolation);
        v40Var.setScaleY(interpolation);
        w30 w30Var = this.T;
        w30Var.setScaleX(f11);
        w30Var.setScaleY(f11);
        w30Var.setAlpha(f11);
        this.S.setAlpha(f11);
        this.f40422k1.setAlpha(f7);
        if (f11 != 0.0f) {
            i10 = 0;
        }
        if (i10 != y30Var.getVisibility()) {
            y30Var.setVisibility(i10);
            w30Var.setVisibility(i10);
        }
    }

    public final void N1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        org.telegram.ui.Components.voip.t2 t2Var = this.f40448r;
        if (t2Var != null && t2Var.getVisibility() == 0) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            u20 u20Var = this.e;
            boolean z14 = false;
            if (sharedInstance != null && !s1()) {
                lh.a aVar = (lh.a) u20Var.f16083c.get(t2Var);
                if (aVar != null) {
                    aVar.d.a(true, z10);
                    t2Var.setEnabled(true);
                }
                if (!sharedInstance.isBluetoothOn() && !sharedInstance.isBluetoothWillOn()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (!z12 && sharedInstance.isSpeakerphoneOn()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12) {
                    t2Var.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z10);
                } else if (z13) {
                    t2Var.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
                } else if (sharedInstance.isHeadsetPlugged()) {
                    t2Var.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z10);
                } else {
                    t2Var.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
                }
                t2Var.b(z13, z10);
                i1();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.isBluetoothHeadsetConnected()) {
                    i10 = R.drawable.filled_calls_bluetooth_s;
                } else {
                    i10 = R.drawable.filled_sound_on;
                }
                if (this.f40379a0 != i10) {
                    this.f40379a0 = i10;
                    AndroidUtilities.updateImageViewImageAnimated(this.f40383b0, i10);
                }
                org.telegram.ui.Components.voip.t2 t2Var2 = this.h;
                if (t2Var2.getVisibility() == 0) {
                    t2Var2.c(0, -1, 0, 1.0f, true, g1(i1()), false, z10);
                    if (i1() != 1) {
                        z14 = true;
                    }
                    t2Var2.b(z14, z10);
                    return;
                }
                return;
            }
            t2Var.c(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipChatShare), false, z10);
            if (!ChatObject.isPublic(this.Z0) && (!ChatObject.hasAdminRights(this.Z0) || !ChatObject.canAddUsers(this.Z0))) {
                z11 = false;
            } else {
                z11 = true;
            }
            lh.a aVar2 = (lh.a) u20Var.f16083c.get(t2Var);
            if (aVar2 != null) {
                aVar2.d.a(z11, z10);
                t2Var.setEnabled(z11);
            }
            t2Var.b(true, false);
        }
    }

    public final void O1(boolean r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q50.O1(boolean, boolean):void");
    }

    public final void P0(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q50.P0(boolean):void");
    }

    public final void P1() {
        boolean z10;
        String str;
        float f7;
        float f10;
        o50 o50Var;
        TLRPC.User user;
        TLRPC.Chat chat;
        m40 m40Var = this.O;
        if (m40Var != null && this.f40380a1 != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            int i10 = 0;
            for (int i11 = 0; i11 < this.f40380a1.currentSpeakingPeers.m(); i11++) {
                long j10 = this.f40380a1.currentSpeakingPeers.j(i11);
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f40380a1.currentSpeakingPeers.f(j10);
                if (!groupCallParticipant.self) {
                    h30 h30Var = this.a2;
                    h30Var.getClass();
                    if (h30Var.f31545w.get(MessageObject.getPeerId(groupCallParticipant.peer)) <= 0 && this.B2.get(j10, 0) != 1) {
                        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                        if (spannableStringBuilder == null) {
                            spannableStringBuilder = new SpannableStringBuilder();
                        }
                        if (i10 < 2) {
                            int i12 = (peerId > 0L ? 1 : (peerId == 0L ? 0 : -1));
                            if (i12 > 0) {
                                user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId));
                            } else {
                                user = null;
                            }
                            if (i12 <= 0) {
                                chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(peerId));
                            } else {
                                chat = null;
                            }
                            if (user != null || chat != null) {
                                if (i10 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (user != null) {
                                    spannableStringBuilder.append(UserObject.getFirstName(user), new org.telegram.ui.Components.e61(AndroidUtilities.bold()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.e61(AndroidUtilities.bold()), 0);
                                }
                            }
                        }
                        i10++;
                        if (i10 == 2) {
                            break;
                        }
                    }
                }
            }
            if (i10 > 0) {
                String pluralString = LocaleController.getPluralString("MembersAreSpeakingToast", i10);
                int indexOf = pluralString.indexOf("un1");
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(pluralString);
                spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
                m40Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.j5 subtitleTextView = m40Var.getSubtitleTextView();
            if (s1()) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            int i13 = this.f40380a1.call.participants_count;
            k50 k50Var = this.P;
            subtitleTextView.k(LocaleController.formatPluralString(str, i13 + ((k50Var.M.s1() || k50Var.L || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined()), new Object[0]));
            if (s1() && (o50Var = this.B1) != null) {
                o50Var.setWatchersCount(this.f40380a1.call.participants_count);
            }
            if (z10 != this.f40464u2) {
                this.f40464u2 = z10;
                m40Var.invalidate();
                float f11 = 0.0f;
                m40Var.getSubtitleTextView().setPivotX(0.0f);
                m40Var.getSubtitleTextView().setPivotY(m40Var.getMeasuredHeight() >> 1);
                ViewPropertyAnimator animate = m40Var.getSubtitleTextView().animate();
                if (this.f40464u2) {
                    f7 = 0.98f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f7);
                if (this.f40464u2) {
                    f10 = 0.9f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f10);
                if (!this.f40464u2) {
                    f11 = 1.0f;
                }
                scaleY.alpha(f11).setDuration(150L);
                AndroidUtilities.updateViewVisibilityAnimated(m40Var.getAdditionalSubtitleTextView(), this.f40464u2);
            }
        }
    }

    public final int Q0() {
        w40 w40Var = this.Q;
        int childCount = w40Var.getChildCount();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = w40Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0) {
                i10 = Math.min(i10, childAt.getTop());
            }
        }
        return i10;
    }

    public final void Q1(boolean z10) {
        ChatObject.Call call = this.f40380a1;
        z20 z20Var = this.f40397e1;
        if (call == null) {
            if (ChatObject.isChannelOrGiga(this.Z0)) {
                z20Var.b(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), z10);
                return;
            } else {
                z20Var.b(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), z10);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(call.call.title);
        m40 m40Var = this.O;
        if (!isEmpty) {
            if (!this.f40380a1.call.title.equals(m40Var.getTitle())) {
                if (z10) {
                    this.O.J(this.f40380a1.call.title, true, 180L, null);
                    m40Var.getTitleTextView().setOnClickListener(new a20(this, 8));
                } else {
                    m40Var.setTitle(this.f40380a1.call.title);
                }
                z20Var.b(this.f40380a1.call.title, z10);
            }
        } else {
            TLRPC.Chat chat = this.Z0;
            if (chat != null && !chat.title.equals(m40Var.getTitle())) {
                if (z10) {
                    this.O.J(this.Z0.title, true, 180L, null);
                    m40Var.getTitleTextView().setOnClickListener(new a20(this, 9));
                } else {
                    m40Var.setTitle(this.Z0.title);
                }
                if (ChatObject.isChannelOrGiga(this.Z0)) {
                    if (s1()) {
                        z20Var.b(this.Z0.title, z10);
                    } else {
                        z20Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), z10);
                    }
                } else {
                    z20Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), z10);
                }
            } else if (this.Z0 == null) {
                m40Var.setTitle(LocaleController.getString(R.string.ConferenceChat));
                z20Var.b(LocaleController.getString(R.string.ConferenceChat), z10);
            }
        }
        org.telegram.ui.ActionBar.j5 titleTextView = m40Var.getTitleTextView();
        if (this.f40380a1.recording) {
            if (titleTextView.getRightDrawable() == null) {
                titleTextView.i(new m50(titleTextView));
                TextView textView = z20Var.getTextView();
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new m50(textView), (Drawable) null);
                TextView nextTextView = z20Var.getNextTextView();
                nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new m50(nextTextView), (Drawable) null);
            }
        } else if (titleTextView.getRightDrawable() != null) {
            titleTextView.i(null);
            z20Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            z20Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final boolean R0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            ChatObject.Call call = this.f40380a1;
            if (call != null && (groupCall = call.call) != null && groupCall.creator) {
                return true;
            }
            return false;
        }
        return ChatObject.canManageCalls(this.Z0);
    }

    public final void R1() {
        float f7;
        org.telegram.ui.Components.ub ubVar;
        boolean z10;
        if (this.topBulletinContainer != null) {
            int dp = AndroidUtilities.dp(74.0f);
            float f10 = this.f40481y0 - dp;
            if (this.backgroundPaddingTop + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                int dp2 = (dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f);
                f7 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - this.backgroundPaddingTop) / dp2);
                f10 -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp2) * f7);
            } else {
                f7 = 0.0f;
            }
            float paddingTop = f10 + this.containerView.getPaddingTop();
            FrameLayout frameLayout = this.topBulletinContainer;
            m40 m40Var = this.O;
            frameLayout.setTranslationY(AndroidUtilities.lerp(((-frameLayout.getTop()) - this.topBulletinContainer.getHeight()) + paddingTop + AndroidUtilities.dp(10.0f), m40Var.getY() + (-this.topBulletinContainer.getTop()) + m40Var.getHeight(), f7));
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29528w;
            if (qcVar != null && (ubVar = qcVar.e) != null && ubVar.getParent() != null && ubVar.getParent().getParent() == this.topBulletinContainer) {
                if (f7 > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ubVar.setTop(z10);
            }
        }
    }

    public final void S0() {
        if (this.R1) {
            this.R1 = false;
            AndroidUtilities.cancelRunOnUIThread(this.f40483y2);
        }
        if (this.S1) {
            this.S1 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.f40470w.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void T0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q50.T0():void");
    }

    public final void U0() {
        this.F.setTranslationY((-this.C1.d()) + this.containerView.getPaddingBottom());
        this.G.invalidate();
        a1();
        Z0();
        X0();
        Y0();
        b1();
        this.e.setAlpha(1.0f - this.f40487z3.e);
        V0();
        W0();
    }

    public final void V0() {
        int i10;
        float f7 = this.C1.f44741b.f17407a;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        s30 s30Var = this.F;
        s30Var.setAlpha(f7);
        r30 r30Var = this.G;
        r30Var.setAlpha(f7);
        if (s30Var.getVisibility() != i10) {
            s30Var.setVisibility(i10);
            r30Var.setVisibility(i10);
            if (i10 == 8) {
                p30 p30Var = this.H;
                if (p30Var.isFocused()) {
                    p30Var.clearFocus();
                }
            }
        }
    }

    public final void W0() {
        int i10;
        org.telegram.ui.Components.dl0 dl0Var = this.K;
        if (dl0Var != null) {
            float f7 = this.C1.f44741b.f17407a * this.A3.e;
            dl0Var.setAlpha(f7);
            if (f7 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            if (this.K.getVisibility() != i10) {
                this.K.setVisibility(i10);
                if (i10 == 8) {
                    this.K.n();
                }
            }
            org.telegram.ui.Components.dl0 dl0Var2 = this.K;
            if (!dl0Var2.N0 && f7 == 1.0f) {
                dl0Var2.N0 = true;
            }
        }
    }

    public final void X0() {
        boolean z10 = G3;
        u20 u20Var = this.e;
        if (z10) {
            u20Var.setTranslationX(0.0f);
            u20Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        ne.b bVar = this.f40487z3;
        if (z11) {
            u20Var.setTranslationX(bVar.e * AndroidUtilities.dp(94.0f));
            u20Var.setTranslationY(0.0f);
            return;
        }
        u20Var.setTranslationX(0.0f);
        u20Var.setTranslationY(bVar.e * AndroidUtilities.dp(94.0f));
    }

    public final void Y0() {
        boolean z10 = G3;
        d30 d30Var = this.f40429m2;
        if (z10) {
            d30Var.setTranslationX(0.0f);
            d30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        ne.b bVar = this.f40487z3;
        if (z11) {
            d30Var.setTranslationX(bVar.e * AndroidUtilities.dp(94.0f));
            d30Var.setTranslationY(0.0f);
            return;
        }
        d30Var.setTranslationX(0.0f);
        d30Var.setTranslationY(bVar.e * AndroidUtilities.dp(94.0f));
    }

    public final void Z0() {
        float dp;
        float f7 = this.B3.e;
        qh.i iVar = this.C1;
        float f10 = -((iVar.d() - this.containerView.getPaddingBottom()) + f7 + (AndroidUtilities.dp(68.0f) * this.A3.e) + AndroidUtilities.dp(10.0f));
        if (G3) {
            dp = (1.0f - this.C3.e) * AndroidUtilities.dp(-91.0f);
        } else if (F3) {
            dp = 0.0f;
        } else {
            dp = ((this.f40487z3.e * AndroidUtilities.dp(94.0f)) - (AndroidUtilities.dp(104.0f) * this.a2.f31521c)) - AndroidUtilities.dp(91.0f);
        }
        float lerp = AndroidUtilities.lerp(dp, f10, iVar.f44741b.f17407a);
        float measuredHeight = ((this.containerView.getMeasuredHeight() - this.f40481y0) + lerp) - this.backgroundPaddingTop;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - AndroidUtilities.dp(250.0f));
        mh.h hVar = this.f40388c0;
        hVar.setTranslationY(lerp);
        hVar.setVisibleHeight((int) max);
    }

    public final void a1() {
        if (this.K != null) {
            this.K.setTranslationY((-this.C1.d()) + this.containerView.getPaddingBottom() + ((-this.A3.e) * AndroidUtilities.dp(64.0f)));
        }
    }

    public final void b1() {
        boolean z10;
        float f7 = this.A3.e;
        float lerp = AndroidUtilities.lerp(0.25f, 1.0f, f7);
        ImageView imageView = this.J;
        imageView.setScaleX(lerp);
        imageView.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f7));
        imageView.setAlpha(f7);
        boolean z11 = false;
        if (f7 > 0.9f) {
            z10 = true;
        } else {
            z10 = false;
        }
        imageView.setClickable(z10);
        float f10 = 1.0f - f7;
        float lerp2 = AndroidUtilities.lerp(0.25f, 1.0f, f10);
        ImageView imageView2 = this.I;
        imageView2.setScaleX(lerp2);
        imageView2.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f10));
        imageView2.setAlpha(f10);
        if (f10 > 0.9f) {
            z11 = true;
        }
        imageView2.setClickable(z11);
    }

    public final void c1() {
        org.telegram.ui.Components.voip.t tVar = this.Z2;
        if (tVar != null) {
            tVar.f31712a.setRoundCorners(AndroidUtilities.dp(8.0f));
            org.telegram.ui.Components.voip.t tVar2 = this.Z2;
            tVar2.h = false;
            tVar2.j(false);
            this.Z2.invalidate();
            this.a2.invalidate();
        }
        org.telegram.ui.Cells.d4 d4Var = this.X2;
        if (d4Var != null && !this.f40386b3 && d4Var.getParent() != null) {
            this.containerView.removeView(this.X2);
        }
        org.telegram.ui.Cells.d4 d4Var2 = this.X2;
        if (d4Var2 != null) {
            d4Var2.setProgressToAvatarPreview(0.0f);
            this.X2.setAboutVisible(false);
            this.X2.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.z20 z20Var = this.f40381a3;
        if (z20Var != null) {
            z20Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.X2 = null;
        this.Y2 = null;
        this.f40381a3 = null;
        this.Z2 = null;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return !this.a2.f31519b;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCallParticipant groupCallParticipant;
        int i12;
        int i13;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        int i14;
        int i15;
        String string;
        boolean z10;
        ChatObject.VideoParticipant videoParticipant;
        boolean z11;
        VoIPService sharedInstance;
        int i16;
        int i17;
        int i18 = NotificationCenter.groupCallUpdated;
        String[] strArr = null;
        w40 w40Var = this.Q;
        int i19 = 0;
        if (i10 == i18) {
            Long l4 = (Long) objArr[1];
            ChatObject.Call call = this.f40380a1;
            if (call != null && call.call.f20290id == l4.longValue()) {
                ChatObject.Call call2 = this.f40380a1;
                if (call2.call instanceof TLRPC.TL_groupCallDiscarded) {
                    dismiss();
                    return;
                }
                int i20 = (this.f40458t0 > 0L ? 1 : (this.f40458t0 == 0L ? 0 : -1));
                AccountInstance accountInstance = this.d;
                if (i20 == 0 && (((i17 = this.F1) == 7 || i17 == 5 || i17 == 6) && !call2.isScheduled())) {
                    try {
                        Intent intent = new Intent(this.f40413i0, VoIPService.class);
                        intent.putExtra("chat_id", j1());
                        intent.putExtra("createGroupCall", false);
                        intent.putExtra("hasFewPeers", this.f40384b1);
                        intent.putExtra("peerChannelId", this.Y0.channel_id);
                        intent.putExtra("peerChatId", this.Y0.chat_id);
                        intent.putExtra("peerUserId", this.Y0.user_id);
                        intent.putExtra("hash", this.f40389c1);
                        intent.putExtra("peerAccessHash", this.Y0.access_hash);
                        intent.putExtra("is_outgoing", true);
                        intent.putExtra("start_incall_activity", false);
                        intent.putExtra("account", accountInstance.getCurrentAccount());
                        intent.putExtra("scheduleDate", this.f40423k2);
                        this.f40413i0.startService(intent);
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                    }
                    this.f40458t0 = SystemClock.elapsedRealtime();
                    AndroidUtilities.runOnUIThread(new c20(this, 2), 3000L);
                }
                if (!this.f40462u0 && VoIPService.getSharedInstance() != null) {
                    this.f40380a1.addSelfDummyParticipant(false);
                    m1();
                    VoIPService.getSharedInstance().playConnectedSound();
                }
                J1();
                int childCount = w40Var.getChildCount();
                for (int i21 = 0; i21 < childCount; i21++) {
                    View childAt = w40Var.getChildAt(i21);
                    if (childAt instanceof org.telegram.ui.Cells.d4) {
                        ((org.telegram.ui.Cells.d4) childAt).a(true, false);
                    }
                }
                if (this.X2 != null) {
                    this.f40454s0 = true;
                } else {
                    P0(true);
                }
                P1();
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                if (this.F1 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                O1(true, booleanValue);
                Q1(true);
                if (z11 && ((i16 = this.F1) == 1 || i16 == 0)) {
                    l1().j(38, 0L, null);
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().playAllowTalkSound();
                    }
                }
                if (objArr.length >= 4) {
                    Long l10 = (Long) objArr[3];
                    long longValue = l10.longValue();
                    if (longValue != 0 && !s1()) {
                        if (!p1() || (sharedInstance = VoIPService.getSharedInstance()) == null || longValue != sharedInstance.convertingFromCallWithUserId) {
                            try {
                                ArrayList<TLRPC.Dialog> allDialogs = accountInstance.getMessagesController().getAllDialogs();
                                if (allDialogs != null) {
                                    int size = allDialogs.size();
                                    int i22 = 0;
                                    while (true) {
                                        if (i22 >= size) {
                                            break;
                                        }
                                        TLRPC.Dialog dialog = allDialogs.get(i22);
                                        i22++;
                                        if (dialog.f20284id == longValue) {
                                            i19 = 1;
                                            break;
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            if (DialogObject.isUserDialog(longValue)) {
                                TLRPC.User user = accountInstance.getMessagesController().getUser(l10);
                                if (user != null) {
                                    if (this.f40380a1.call.participants_count < 250 || UserObject.isContact(user) || user.verified || i19 != 0) {
                                        l1().k(0L, 44, user, this.Z0, null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(-longValue));
                            if (chat != null) {
                                if (this.f40380a1.call.participants_count < 250 || !ChatObject.isNotInChat(chat) || chat.verified || i19 != 0) {
                                    l1().k(0L, 44, chat, this.Z0, null, null);
                                }
                            }
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.groupCallSpeakingUsersUpdated) {
            h30 h30Var = this.a2;
            if (h30Var.f31519b && this.f40380a1 != null) {
                boolean c10 = h30Var.c();
                ChatObject.Call call3 = this.f40380a1;
                if (call3 != null && h30Var.f31519b && (videoParticipant = h30Var.e) != null && call3.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer)) == null) {
                    c10 = true;
                }
                if (c10) {
                    ChatObject.VideoParticipant videoParticipant2 = null;
                    int i23 = 0;
                    while (true) {
                        ArrayList arrayList = this.f40444q0;
                        if (i23 >= arrayList.size()) {
                            break;
                        }
                        ChatObject.VideoParticipant videoParticipant3 = (ChatObject.VideoParticipant) arrayList.get(i23);
                        if (this.f40380a1.currentSpeakingPeers.g(null, MessageObject.getPeerId(videoParticipant3.participant.peer)) != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = videoParticipant3.participant;
                            if (!groupCallParticipant3.muted_by_you && h30Var.d != MessageObject.getPeerId(groupCallParticipant3.peer)) {
                                videoParticipant2 = videoParticipant3;
                            }
                        }
                        i23++;
                    }
                    if (videoParticipant2 != null) {
                        f1(videoParticipant2);
                    }
                }
            }
            h30Var.setVisibleParticipant(true);
            P1();
        } else if (i10 == NotificationCenter.webRtcMicAmplitudeEvent) {
            D1(((Float) objArr[0]).floatValue());
        } else if (i10 == NotificationCenter.needShowAlert) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                    if (ChatObject.isChannelOrGiga(this.Z0)) {
                        string = LocaleController.getString(R.string.VoipChannelTooMuch);
                    } else {
                        string = LocaleController.getString(R.string.VoipGroupTooMuch);
                    }
                } else if (!"ANONYMOUS_CALLS_DISABLED".equals(str) && !"GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    string = LocaleController.getString(R.string.ErrorOccurred) + "\n" + str;
                } else if (ChatObject.isChannelOrGiga(this.Z0)) {
                    string = LocaleController.getString(R.string.VoipChannelJoinAnonymousAdmin);
                } else {
                    string = LocaleController.getString(R.string.VoipGroupJoinAnonymousAdmin);
                }
                AlertDialog$Builder M = org.telegram.ui.Components.f5.M(getContext(), LocaleController.getString(R.string.VoipGroupVoiceChat), string);
                M.j(new g20(this, 1));
                try {
                    M.o();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else if (i10 == NotificationCenter.didEndCall) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f20281id == j1()) {
                J1();
                O1(isShowing(), false);
            }
            long peerId = MessageObject.getPeerId(this.A0);
            ChatObject.Call call4 = this.f40380a1;
            if (call4 != null && chatFull.f20281id == (-peerId) && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) call4.participants.f(peerId)) != null) {
                groupCallParticipant2.about = chatFull.about;
                P0(true);
                AndroidUtilities.updateVisibleRows(w40Var);
                if (this.E2 != null) {
                    while (i19 < this.E2.getChildCount()) {
                        View childAt2 = this.E2.getChildAt(i19);
                        if ((childAt2 instanceof org.telegram.ui.ActionBar.e1) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                            org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) childAt2;
                            if (TextUtils.isEmpty(groupCallParticipant2.about)) {
                                i14 = R.string.VoipAddDescription;
                            } else {
                                i14 = R.string.VoipEditDescription;
                            }
                            String string2 = LocaleController.getString(i14);
                            if (TextUtils.isEmpty(groupCallParticipant2.about)) {
                                i15 = R.drawable.msg_addbio;
                            } else {
                                i15 = R.drawable.msg_info;
                            }
                            e1Var.g(string2, i15, null);
                        }
                        i19++;
                    }
                }
            }
        } else if (i10 == NotificationCenter.didLoadChatAdmins) {
            if (((Long) objArr[0]).longValue() == j1()) {
                J1();
                O1(isShowing(), false);
            }
        } else if (i10 == NotificationCenter.applyGroupCallVisibleParticipants) {
            int childCount2 = w40Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i19 < childCount2) {
                s4.b1 G = w40Var.G(w40Var.getChildAt(i19));
                if (G != null) {
                    View view = G.f45921a;
                    if (view instanceof org.telegram.ui.Cells.d4) {
                        org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) view;
                        if (d4Var.getParticipant() != null) {
                            d4Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i19++;
            }
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            Long l11 = (Long) objArr[0];
            long peerId2 = MessageObject.getPeerId(this.A0);
            if (this.f40380a1 != null && peerId2 == l11.longValue() && (groupCallParticipant = (TLRPC.GroupCallParticipant) this.f40380a1.participants.f(peerId2)) != null) {
                groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
                P0(true);
                AndroidUtilities.updateVisibleRows(w40Var);
                if (this.E2 != null) {
                    while (i19 < this.E2.getChildCount()) {
                        View childAt3 = this.E2.getChildAt(i19);
                        if ((childAt3 instanceof org.telegram.ui.ActionBar.e1) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                            org.telegram.ui.ActionBar.e1 e1Var2 = (org.telegram.ui.ActionBar.e1) childAt3;
                            if (TextUtils.isEmpty(groupCallParticipant.about)) {
                                i12 = R.string.VoipAddBio;
                            } else {
                                i12 = R.string.VoipEditBio;
                            }
                            String string3 = LocaleController.getString(i12);
                            if (TextUtils.isEmpty(groupCallParticipant.about)) {
                                i13 = R.drawable.msg_addbio;
                            } else {
                                i13 = R.drawable.msg_info;
                            }
                            e1Var2.g(string3, i13, null);
                        }
                        i19++;
                    }
                }
            }
        } else if (i10 == NotificationCenter.mainUserInfoChanged) {
            P0(true);
            AndroidUtilities.updateVisibleRows(w40Var);
        } else if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0) {
                P0(true);
            }
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (intValue & MessagesController.UPDATE_MASK_EMOJI_STATUS) != 0) {
                AndroidUtilities.updateVisibleRows(w40Var);
            }
        } else if (i10 == NotificationCenter.groupCallScreencastStateChanged) {
            b40 b40Var = this.f40484z0;
            if (b40Var != null) {
                b40Var.b(true, true);
            }
            J1();
        } else if (i10 == NotificationCenter.conferenceEmojiUpdated) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            b50 b50Var = this.f40440p0;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            b50Var.b(strArr);
        }
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity = this.f40413i0;
        launchActivity.f33161a1.remove(this.f40468v2);
        this.f40413i0.setRequestedOrientation(-1);
        E3 = false;
        org.telegram.ui.Components.a40 a40Var = this.E1;
        if (a40Var != null) {
            a40Var.dismiss();
        }
        this.f40454s0 = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        AccountInstance accountInstance = this.d;
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.needShowAlert);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.didLoadChatAdmins);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.applyGroupCallVisibleParticipants);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.mainUserInfoChanged);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.groupCallScreencastStateChanged);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.groupCallSpeakingUsersUpdated);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.conferenceEmojiUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
        super.dismiss();
    }

    @Override
    public final void dismissInternal() {
        h30 h30Var = this.a2;
        if (h30Var != null) {
            if (this.f40446q2 != null) {
                this.Q.getViewTreeObserver().removeOnPreDrawListener(this.f40446q2);
                this.f40446q2 = null;
            }
            ArrayList arrayList = this.Z1;
            arrayList.clear();
            ArrayList arrayList2 = this.Y1;
            arrayList.addAll(arrayList2);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).f();
                h30Var.removeView((View) arrayList.get(i10));
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).e();
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).b(true);
            }
            arrayList2.clear();
            if (h30Var.getParent() != null) {
                arrayList2.clear();
                this.containerView.removeView(h30Var);
            }
        }
        super.dismissInternal();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
            VoIPService.getSharedInstance().setSinks(null, null);
        }
        if (D3 == this) {
            D3 = null;
        }
        E3 = false;
        VoIPService.audioLevelsCallback = null;
        org.telegram.ui.Components.i30.j(getContext());
        ChatObject.Call call = this.f40380a1;
        if (call != null) {
            call.clearVideFramesInfo();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i10;
        if (this.f40413i0 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.f40413i0.getSystemService("audio");
            boolean z10 = false;
            if (audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25) {
                z10 = true;
            }
            WebRtcAudioTrack.setSpeakerMute(z10);
            if (isSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                UndoView l1 = l1();
                if (z10) {
                    i10 = 42;
                } else {
                    i10 = 43;
                }
                l1.j(i10, 0L, null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e1(boolean z10) {
        if (!this.f40391c3 && this.f40403f2) {
            if (z10) {
                this.f40391c3 = true;
                z1(false, this.X2);
                return;
            }
            c1();
            this.containerView.removeView(this.f40398e2);
            this.f40398e2 = null;
            this.C2.setVisibility(8);
            this.containerView.invalidate();
            this.f40403f2 = false;
            this.Y.X = true;
            this.Q.invalidate();
            this.f40385b2.setVisibility(8);
            if (this.f40454s0) {
                this.f40454s0 = false;
                P0(true);
            }
            T0();
        }
    }

    public final void f1(ChatObject.VideoParticipant videoParticipant) {
        ChatObject.VideoParticipant videoParticipant2;
        if (videoParticipant == null) {
            this.f40413i0.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            h30 h30Var = this.a2;
            if (h30Var.f31538r != null) {
                return;
            }
            boolean z10 = G3;
            w40 w40Var = this.Q;
            int i10 = 0;
            if (z10) {
                if (this.f40446q2 != null) {
                    w40Var.getViewTreeObserver().removeOnPreDrawListener(this.f40446q2);
                    this.f40446q2 = null;
                }
                ArrayList arrayList = new ArrayList();
                w50 w50Var = this.f40438o2;
                ArrayList arrayList2 = this.Y1;
                ArrayList arrayList3 = this.Z1;
                if (videoParticipant == null) {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList3.get(i11);
                        org.telegram.ui.Components.voip.l lVar = tVar.f31716c;
                        if (lVar != null) {
                            lVar.setRenderer(null);
                            org.telegram.ui.Components.z20 z20Var = tVar.d;
                            if (z20Var != null) {
                                z20Var.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.l lVar2 = tVar.e;
                            if (lVar2 != null) {
                                lVar2.setRenderer(null);
                            }
                            arrayList.add(tVar.f31740w);
                            tVar.b(false);
                            tVar.animate().alpha(0.0f).setListener(new c40(this, tVar));
                        }
                    }
                    this.P2 = false;
                    w50Var.H(this.f40434n2, true, true);
                } else {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) arrayList3.get(i12);
                        if (tVar2.e != null && ((videoParticipant2 = tVar2.f31740w) == null || !videoParticipant2.equals(videoParticipant))) {
                            arrayList.add(tVar2.f31740w);
                            tVar2.b(false);
                            org.telegram.ui.Components.z20 z20Var2 = tVar2.d;
                            if (z20Var2 != null) {
                                z20Var2.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.l lVar3 = tVar2.f31716c;
                            if (lVar3 != null) {
                                lVar3.setRenderer(null);
                            }
                            tVar2.animate().alpha(0.0f).setListener(new d40(this, tVar2));
                        }
                    }
                    this.P2 = true;
                    w50Var.f42480r = false;
                    if (!arrayList.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new lt(20, this, arrayList));
                    }
                }
                ViewTreeObserver viewTreeObserver = w40Var.getViewTreeObserver();
                f40 f40Var = new f40(this, videoParticipant, !h30Var.f31519b);
                this.f40446q2 = f40Var;
                viewTreeObserver.addOnPreDrawListener(f40Var);
                return;
            }
            if (this.f40446q2 != null) {
                w40Var.getViewTreeObserver().removeOnPreDrawListener(this.f40446q2);
                this.f40446q2 = null;
            }
            if (videoParticipant != null) {
                d30 d30Var = this.f40429m2;
                if (d30Var.getVisibility() != 0) {
                    d30Var.setVisibility(0);
                    org.telegram.ui.Components.a30 a30Var = this.f40442p2;
                    a30Var.G(d30Var, false);
                    this.f40454s0 = true;
                    if (!h30Var.f31519b) {
                        ArrayList arrayList4 = a30Var.e;
                        s4.b0 b0Var = (s4.b0) d30Var.getLayoutManager();
                        if (b0Var != null) {
                            while (true) {
                                if (i10 >= arrayList4.size()) {
                                    break;
                                } else if (((ChatObject.VideoParticipant) arrayList4.get(i10)).equals(videoParticipant)) {
                                    b0Var.h1(i10, AndroidUtilities.dp(13.0f));
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                    ViewTreeObserver viewTreeObserver2 = w40Var.getViewTreeObserver();
                    g40 g40Var = new g40(this, videoParticipant);
                    this.f40446q2 = g40Var;
                    viewTreeObserver2.addOnPreDrawListener(g40Var);
                    return;
                }
                h30Var.j(videoParticipant);
                AndroidUtilities.updateVisibleRows(d30Var);
            } else if (w40Var.getVisibility() != 0) {
                w40Var.setVisibility(0);
                P0(false);
                this.f40454s0 = true;
                ViewTreeObserver viewTreeObserver3 = w40Var.getViewTreeObserver();
                h40 h40Var = new h40(this);
                this.f40446q2 = h40Var;
                viewTreeObserver3.addOnPreDrawListener(h40Var);
            } else {
                ViewTreeObserver viewTreeObserver4 = w40Var.getViewTreeObserver();
                i40 i40Var = new i40(this);
                this.f40446q2 = i40Var;
                viewTreeObserver4.addOnPreDrawListener(i40Var);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final int i1() {
        Integer num = this.y3;
        if (num != null) {
            return num.intValue();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return 0;
        }
        int currentAudioRoute = sharedInstance.getCurrentAudioRoute();
        if (currentAudioRoute == 0) {
            return 1;
        }
        if (currentAudioRoute == 1) {
            return 0;
        }
        return 2;
    }

    public final long j1() {
        TLRPC.Chat chat = this.Z0;
        if (chat == null) {
            return 0L;
        }
        return chat.f20280id;
    }

    public final void k1(boolean z10) {
        boolean z11;
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j1()));
        if (chat != null && !ChatObject.isPublic(chat)) {
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j1());
            String publicUsername = ChatObject.getPublicUsername(this.Z0);
            if (!TextUtils.isEmpty(publicUsername)) {
                str = a1.g.q(accountInstance.getMessagesController().linkPrefix, "/", publicUsername, new StringBuilder());
            } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                tL_messages_exportChatInvite.peer = MessagesController.getInputPeer(this.Z0);
                accountInstance.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ai.w9(this, chatFull, z10, 6));
                return;
            }
            v1(null, str, true, z10);
        } else if (this.f40380a1 != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = this.f40380a1.getInputGroupCall();
                if (i10 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                exportgroupcallinvite.can_self_unmute = z11;
                accountInstance.getConnectionsManager().sendRequest(exportgroupcallinvite, new org.telegram.messenger.voip.l0(this, i10, z10, 1));
            }
        }
    }

    public final UndoView l1() {
        if (!G3) {
            h30 h30Var = this.a2;
            if (h30Var.f31519b) {
                return h30Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.f40417j0;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.e(2, true);
            this.containerView.removeView(undoViewArr[0]);
            this.containerView.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void m1() {
        VoIPService sharedInstance;
        int i10;
        if (!this.f40462u0 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            this.f40462u0 = true;
            this.D0.addAll(this.f40380a1.visibleParticipants);
            this.E0.addAll(this.f40444q0);
            this.F0.addAll(this.f40380a1.invitedUsers);
            this.G0.addAll(this.f40380a1.shadyJoinParticipants);
            this.H0.addAll(this.f40380a1.shadyLeftParticipants);
            this.T1 = sharedInstance.getCallState();
            if (this.f40380a1 == null) {
                ChatObject.Call call = sharedInstance.groupCall;
                this.f40380a1 = call;
                this.f40442p2.f24481c = call;
                this.a2.setGroupCall(call);
                this.f40438o2.f42477c = this.f40380a1;
            }
            mh.h hVar = this.f40388c0;
            if (hVar != null) {
                hVar.C0(this.d.getCurrentAccount(), this.f40380a1.getInputGroupCall(false));
            }
            this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
            this.f40380a1.saveActiveDates();
            VoIPService.getSharedInstance().registerStateListener(this);
            v40 v40Var = this.V;
            if (v40Var != null && v40Var.getVisibility() == 0) {
                this.f40453s.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, true);
                N1(true);
                if (ChatObject.isChannelOrGiga(this.Z0)) {
                    i10 = R.string.VoipChannelEndChat;
                } else {
                    i10 = R.string.VoipGroupEndChat;
                }
                this.f40472w1.setText(LocaleController.getString(i10));
                w40 w40Var = this.Q;
                w40Var.setVisibility(0);
                org.telegram.ui.ActionBar.u0 u0Var = this.l1;
                u0Var.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(w40Var, property, 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(w40Var, View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(v40Var, property2, 0.0f);
                Property property3 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(v40Var, property3, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(v40Var, property, 0.0f);
                org.telegram.ui.ActionBar.j5 j5Var = this.U;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(j5Var, property2, 0.0f);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(j5Var, property3, 0.0f);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(j5Var, property, 0.0f);
                org.telegram.ui.ActionBar.j5 j5Var2 = this.W;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(j5Var2, property2, 0.0f), ObjectAnimator.ofFloat(j5Var2, property3, 0.0f), ObjectAnimator.ofFloat(j5Var2, property, 0.0f), ObjectAnimator.ofFloat(u0Var, property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(u0Var, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(u0Var, property, 0.0f, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.bs.f25026g);
                animatorSet.addListener(new j40(this, 0));
                animatorSet.setDuration(300L);
                animatorSet.start();
            }
        }
    }

    public final void n1(final long j10, final boolean z10) {
        if (this.f40380a1 != null) {
            AccountInstance accountInstance = this.d;
            final TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                final org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(getContext(), 3, null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                invitetogroupcall.call = this.f40380a1.getInputGroupCall();
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = user.f20427id;
                tL_inputUser.access_hash = user.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = accountInstance.getConnectionsManager().sendRequest(invitetogroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        q50 q50Var = q50.this;
                        long j11 = j10;
                        org.telegram.ui.ActionBar.b2[] b2VarArr2 = b2VarArr;
                        if (tLObject != null) {
                            q50Var.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                            AndroidUtilities.runOnUIThread(new ai.c3(q50Var, j11, b2VarArr2, user, 20));
                            return;
                        }
                        AndroidUtilities.runOnUIThread(new ai.m(q50Var, b2VarArr2, z10, tL_error, j11, invitetogroupcall));
                    }
                });
                if (sendRequest != 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.y31(this, b2VarArr, sendRequest, 3), 500L);
                }
            }
        }
    }

    public final boolean o1() {
        float f7;
        int dp = AndroidUtilities.dp(74.0f);
        float f10 = this.f40481y0 - dp;
        if (this.backgroundPaddingTop + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f7 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - this.backgroundPaddingTop) / ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)));
        } else {
            f7 = 0.0f;
        }
        if (f7 > 0.5f) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAudioSettingsChanged() {
        N1(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            D1(0.0f);
        }
        w40 w40Var = this.Q;
        if (w40Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(w40Var);
        }
        d30 d30Var = this.f40429m2;
        if (d30Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(d30Var);
        }
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        arrayList.addAll(this.Y1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
        }
    }

    @Override
    public final void onBackPressed() {
        b40 b40Var = this.f40484z0;
        if (b40Var != null) {
            b40Var.b(false, false);
        } else if (this.f40403f2) {
            e1(true);
        } else if (this.a2.f31519b) {
            f1(null);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.t0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        arrayList.addAll(this.Y1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
        }
        b40 b40Var = this.f40484z0;
        if (b40Var != null && VoIPService.getSharedInstance() != null) {
            b40Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.f40413i0;
        launchActivity.f33161a1.add(this.f40468v2);
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        E3 = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        org.telegram.ui.Components.i30.j(getContext());
        return super.onCustomOpenAnimation();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.t0.d(this, i10, i11);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.t0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.t0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        this.T1 = i10;
        O1(isShowing(), false);
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.t0.h(this, z10);
    }

    public final boolean p1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            return true;
        }
        return false;
    }

    @Override
    public final void r(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 2) {
            Z0();
            X0();
            Y0();
            float f11 = 1.0f - this.f40487z3.e;
            u20 u20Var = this.e;
            u20Var.setAlpha(f11);
            this.a2.setProgressToHideUi(f7);
            this.f40429m2.invalidate();
            this.containerView.invalidate();
            u20Var.invalidate();
        }
        if (i10 == 3) {
            a1();
            Z0();
            b1();
            W0();
            this.containerView.invalidate();
        }
        if (i10 == 4) {
            Z0();
            this.G.invalidate();
            this.H.invalidate();
        }
        if (i10 == 5) {
            Z0();
            this.containerView.invalidate();
        }
    }

    public final boolean r1() {
        if (!s1() || this.f40380a1.visibleVideoParticipants.isEmpty() || (this.f40380a1.visibleVideoParticipants.get(0).aspectRatio != 0.0f && this.f40380a1.visibleVideoParticipants.get(0).aspectRatio < 1.0f)) {
            return false;
        }
        return true;
    }

    public final boolean s1() {
        ChatObject.Call call = this.f40380a1;
        if (call != null && call.call.rtmp_stream) {
            return true;
        }
        return false;
    }

    @Override
    public final void show() {
        super.show();
        if (org.telegram.ui.Components.voip.h1.f31445d0.V) {
            org.telegram.ui.Components.voip.h1.j();
        }
    }

    public final void t1(org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j10;
        if (!this.f40471w0) {
            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f40413i0.O().getFragmentStack().get(this.f40413i0.O().getFragmentStack().size() - 1);
            if (n2Var instanceof qn) {
                boolean U9 = ((qn) n2Var).U9();
                this.f40471w0 = true;
                this.f40476x0 = true;
                ai.x9 x9Var = new ai.x9(f3Var, editTextBoldCursor, z10, b2Var, 20);
                if (U9) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(x9Var, j10);
                return;
            }
            this.f40471w0 = true;
            this.f40476x0 = true;
            if (f3Var != null) {
                f3Var.setFocusable(true);
            } else if (b2Var != null) {
                b2Var.l(true);
            }
            if (z10) {
                AndroidUtilities.runOnUIThread(new ah(2, editTextBoldCursor), 100L);
            }
        }
    }

    public final void v1(java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q50.v1(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final void w1() {
        ChatObject.Call call = this.f40380a1;
        if (call != null && call.call != null) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getContext(), 3, null);
            b2Var.r(300L);
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = this.f40380a1.call;
            tL_inputGroupCall.f20297id = groupCall.f20290id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new ca(this, b2Var, exportgroupcallinvite, 12));
        }
    }

    public final void y1(TLRPC.GroupCallParticipant groupCallParticipant, final long j10, int i10) {
        TLObject chat;
        int i11;
        int i12;
        String str;
        int i13;
        String str2;
        int i14;
        int i15;
        int i16;
        TextView textView;
        int i17;
        String str3;
        String str4;
        int i18;
        int i19;
        int i20;
        int i21;
        EditText editText;
        int i22;
        int i23;
        int i24;
        AlertDialog$Builder alertDialog$Builder;
        float f7;
        int i25;
        int i26;
        int i27;
        int i28;
        int dp;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i29 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            AccountInstance accountInstance = this.d;
            if (i29 > 0) {
                chat = accountInstance.getMessagesController().getUser(Long.valueOf(j10));
            } else {
                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-j10));
            }
            TLObject tLObject = chat;
            boolean z10 = true;
            if (i10 != 0 && i10 != 2 && i10 != 3) {
                if (i10 == 6) {
                    this.f40413i0.O0(this.currentAccount);
                    Bundle bundle = new Bundle();
                    if (i29 > 0) {
                        bundle.putLong("user_id", j10);
                    } else {
                        bundle.putLong("chat_id", -j10);
                    }
                    this.f40413i0.t0(new qn(bundle));
                    dismiss();
                } else if (i10 == 8) {
                    this.f40413i0.O0(this.currentAccount);
                    org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f40413i0.O().getFragmentStack().get(this.f40413i0.O().getFragmentStack().size() - 1);
                    if ((n2Var instanceof qn) && ((qn) n2Var).a() == j10) {
                        dismiss();
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    if (i29 > 0) {
                        bundle2.putLong("user_id", j10);
                    } else {
                        bundle2.putLong("chat_id", -j10);
                    }
                    this.f40413i0.t0(new qn(bundle2));
                    dismiss();
                } else if (i10 == 7) {
                    sharedInstance.editCallMember(tLObject, Boolean.TRUE, null, null, Boolean.FALSE, null);
                    K1(2, true);
                } else if (i10 == 9) {
                    org.telegram.ui.Components.e50 e50Var = this.f40411h2;
                    if (e50Var == null || !e50Var.g()) {
                        TLRPC.User currentUser = accountInstance.getUserConfig().getCurrentUser();
                        org.telegram.ui.Components.e50 e50Var2 = new org.telegram.ui.Components.e50(0, true, true);
                        this.f40411h2 = e50Var2;
                        e50Var2.H = true;
                        e50Var2.R = true;
                        e50Var2.G = true;
                        e50Var2.J = true;
                        e50Var2.S = true;
                        e50Var2.f25724a = this.f40413i0.O().getLastFragment();
                        org.telegram.ui.Components.e50 e50Var3 = this.f40411h2;
                        y40 y40Var = new y40(this, j10);
                        this.f40415i2 = y40Var;
                        e50Var3.f25725b = y40Var;
                        TLRPC.UserProfilePhoto userProfilePhoto = currentUser.photo;
                        if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                            z10 = false;
                        }
                        e50Var3.n(z10, new c20(this, 9), new ei.e1(5), 0);
                    }
                } else if (i10 == 10) {
                    String str5 = groupCallParticipant.about;
                    Context context = getContext();
                    int i30 = this.currentAccount;
                    Pattern pattern = org.telegram.ui.Components.f5.f26081a;
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                    if (i29 > 0) {
                        i23 = R.string.UserBio;
                    } else {
                        i23 = R.string.DescriptionPlaceholder;
                    }
                    String string = LocaleController.getString(i23);
                    final org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.f20609a;
                    b2Var.R = string;
                    if (i29 > 0) {
                        i24 = R.string.VoipGroupBioEditAlertText;
                    } else {
                        i24 = R.string.DescriptionInfo;
                    }
                    b2Var.T = LocaleController.getString(i24);
                    FrameLayout frameLayout = new FrameLayout(context);
                    frameLayout.setClipChildren(false);
                    if (i29 < 0) {
                        alertDialog$Builder = alertDialog$Builder2;
                        f7 = 8.0f;
                        long j11 = -j10;
                        if (MessagesController.getInstance(i30).getChatFull(j11) == null) {
                            MessagesController.getInstance(i30).loadFullChat(j11, ConnectionsManager.generateClassGuid(), true);
                        }
                    } else {
                        alertDialog$Builder = alertDialog$Builder2;
                        f7 = 8.0f;
                    }
                    NumberTextView numberTextView = new NumberTextView(context);
                    EditText editText2 = new EditText(context);
                    int i31 = org.telegram.ui.ActionBar.h6.f21073hg;
                    editText2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i31, false));
                    if (i29 > 0) {
                        i25 = R.string.UserBio;
                    } else {
                        i25 = R.string.DescriptionPlaceholder;
                    }
                    editText2.setHint(LocaleController.getString(i25));
                    editText2.setTextSize(1, 16.0f);
                    editText2.setBackground(org.telegram.ui.ActionBar.h6.T(context));
                    editText2.setMaxLines(4);
                    editText2.setRawInputType(147457);
                    editText2.setImeOptions(6);
                    if (i29 > 0) {
                        i26 = 70;
                    } else {
                        i26 = 255;
                    }
                    editText2.setFilters(new InputFilter[]{new org.telegram.ui.Components.p3(i26, context, numberTextView)});
                    numberTextView.setCenterAlign(true);
                    numberTextView.setTextSize(15);
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B6, false));
                    numberTextView.setImportantForAccessibility(2);
                    if (LocaleController.isRTL) {
                        i27 = 3;
                    } else {
                        i27 = 5;
                    }
                    frameLayout.addView(numberTextView, w7.z5.d(20, 20.0f, i27, 0.0f, 14.0f, 21.0f, 0.0f));
                    if (LocaleController.isRTL) {
                        i28 = AndroidUtilities.dp(24.0f);
                    } else {
                        i28 = 0;
                    }
                    int dp2 = AndroidUtilities.dp(f7);
                    if (LocaleController.isRTL) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(24.0f);
                    }
                    editText2.setPadding(i28, dp2, dp, AndroidUtilities.dp(f7));
                    editText2.addTextChangedListener(new org.telegram.ui.Components.tq(i26, numberTextView));
                    AndroidUtilities.updateViewVisibilityAnimated(numberTextView, false, 0.0f, false);
                    editText2.setText(str5);
                    editText2.setSelection(editText2.getText().toString().length());
                    AlertDialog$Builder alertDialog$Builder3 = alertDialog$Builder;
                    alertDialog$Builder3.n(frameLayout);
                    final j2.d dVar = new j2.d(j10, i30, editText2, 4);
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Save), dVar);
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                    b2Var.N = new org.telegram.ui.Components.q1(editText2, 1);
                    frameLayout.addView(editText2, w7.z5.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
                    editText2.requestFocus();
                    AndroidUtilities.showKeyboard(editText2);
                    editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                        @Override
                        public final boolean onEditorAction(TextView textView2, int i32, KeyEvent keyEvent) {
                            if (i32 == 6 || (j10 > 0 && keyEvent.getKeyCode() == 66)) {
                                org.telegram.ui.ActionBar.b2 b2Var2 = b2Var;
                                if (b2Var2.isShowing()) {
                                    dVar.g(b2Var2, 0);
                                    return true;
                                }
                            }
                            return false;
                        }
                    });
                    b2Var.j(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21319ug, false));
                    b2Var.show();
                    b2Var.p(org.telegram.ui.ActionBar.h6.x0(null, i31, false));
                } else if (i10 == 11) {
                    Context context2 = getContext();
                    int i32 = this.currentAccount;
                    Pattern pattern2 = org.telegram.ui.Components.f5.f26081a;
                    if (DialogObject.isUserDialog(j10)) {
                        TLRPC.User user = MessagesController.getInstance(i32).getUser(Long.valueOf(j10));
                        str3 = user.first_name;
                        str4 = user.last_name;
                    } else {
                        str3 = MessagesController.getInstance(i32).getChat(Long.valueOf(-j10)).title;
                        str4 = null;
                    }
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context2);
                    if (i29 > 0) {
                        i18 = R.string.VoipEditName;
                    } else {
                        i18 = R.string.VoipEditTitle;
                    }
                    String string2 = LocaleController.getString(i18);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder4.f20609a;
                    b2Var2.R = string2;
                    LinearLayout e = org.telegram.messenger.nk.e(context2, 1);
                    EditText editText3 = new EditText(context2);
                    int i33 = org.telegram.ui.ActionBar.h6.f21073hg;
                    editText3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i33, false));
                    editText3.setTextSize(1, 16.0f);
                    editText3.setMaxLines(1);
                    editText3.setLines(1);
                    editText3.setSingleLine(true);
                    if (LocaleController.isRTL) {
                        i19 = 5;
                    } else {
                        i19 = 3;
                    }
                    editText3.setGravity(i19);
                    editText3.setInputType(49152);
                    if (i29 > 0) {
                        i20 = 5;
                    } else {
                        i20 = 6;
                    }
                    editText3.setImeOptions(i20);
                    if (i29 > 0) {
                        i21 = R.string.FirstName;
                    } else {
                        i21 = R.string.VoipEditTitleHint;
                    }
                    editText3.setHint(LocaleController.getString(i21));
                    editText3.setBackground(org.telegram.ui.ActionBar.h6.T(context2));
                    editText3.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                    editText3.requestFocus();
                    if (i29 > 0) {
                        editText = new EditText(context2);
                        editText.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i33, false));
                        editText.setTextSize(1, 16.0f);
                        editText.setMaxLines(1);
                        editText.setLines(1);
                        editText.setSingleLine(true);
                        if (LocaleController.isRTL) {
                            i22 = 5;
                        } else {
                            i22 = 3;
                        }
                        editText.setGravity(i22);
                        editText.setInputType(49152);
                        editText.setImeOptions(6);
                        editText.setHint(LocaleController.getString(R.string.LastName));
                        editText.setBackground(org.telegram.ui.ActionBar.h6.T(context2));
                        editText.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                    } else {
                        editText = null;
                    }
                    AndroidUtilities.showKeyboard(editText3);
                    e.addView(editText3, w7.z5.t(-1, -2, 0, 23, 12, 23, 21));
                    if (editText != null) {
                        e.addView(editText, w7.z5.t(-1, -2, 0, 23, 12, 23, 21));
                    }
                    editText3.setText(str3);
                    editText3.setSelection(editText3.getText().toString().length());
                    if (editText != null) {
                        editText.setText(str4);
                        editText.setSelection(editText.getText().toString().length());
                    }
                    alertDialog$Builder4.n(e);
                    org.telegram.ui.ActionBar.a2 q1Var = new gi.q1(editText3, j10, i32, editText);
                    alertDialog$Builder4.k(LocaleController.getString(R.string.Save), q1Var);
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                    b2Var2.N = new ai.z3(8, editText3, editText);
                    b2Var2.j(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21319ug, false));
                    b2Var2.show();
                    b2Var2.p(org.telegram.ui.ActionBar.h6.x0(null, i33, false));
                    wd wdVar = new wd(1, b2Var2, q1Var);
                    if (editText != null) {
                        editText.setOnEditorActionListener(wdVar);
                    } else {
                        editText3.setOnEditorActionListener(wdVar);
                    }
                } else if (i10 == 5) {
                    sharedInstance.editCallMember(tLObject, Boolean.TRUE, null, null, null, null);
                    l1().m(0L, tLObject, 35);
                    sharedInstance.setParticipantVolume(groupCallParticipant, 0);
                } else {
                    if ((groupCallParticipant.flags & 128) != 0 && groupCallParticipant.volume == 0) {
                        groupCallParticipant.volume = 10000;
                        groupCallParticipant.volume_by_admin = false;
                        sharedInstance.editCallMember(tLObject, Boolean.FALSE, null, 10000, null, null);
                    } else {
                        sharedInstance.editCallMember(tLObject, Boolean.FALSE, null, null, null, null);
                    }
                    sharedInstance.setParticipantVolume(groupCallParticipant, ChatObject.getParticipantVolume(groupCallParticipant));
                    UndoView l1 = l1();
                    if (i10 == 1) {
                        i17 = 31;
                    } else {
                        i17 = 36;
                    }
                    l1.k(0L, i17, tLObject, null, null, null);
                }
            } else if (i10 == 0) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().editCallMember(tLObject, Boolean.TRUE, null, null, null, null);
                    l1().k(0L, 30, tLObject, null, null, null);
                }
            } else {
                AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getContext());
                int i34 = org.telegram.ui.ActionBar.h6.f21222pg;
                org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder5.f20609a;
                b2Var3.I = i34;
                TextView textView2 = new TextView(getContext());
                int i35 = org.telegram.ui.ActionBar.h6.f21073hg;
                textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i35, false));
                textView2.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                textView2.setGravity(i11 | 48);
                FrameLayout frameLayout2 = new FrameLayout(getContext());
                alertDialog$Builder5.n(frameLayout2);
                org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
                h9Var.u(AndroidUtilities.dp(12.0f));
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getContext());
                w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                frameLayout2.addView(w9Var, w7.z5.d(40, 40.0f, i12 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                h9Var.j(this.currentAccount, tLObject);
                boolean z11 = tLObject instanceof TLRPC.User;
                if (z11) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    w9Var.e(user2, h9Var);
                    str = UserObject.getFirstName(user2);
                } else {
                    TLRPC.Chat chat2 = (TLRPC.Chat) tLObject;
                    w9Var.e(chat2, h9Var);
                    str = chat2.title;
                }
                TextView textView3 = new TextView(getContext());
                textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i35, false));
                textView3.setTextSize(1, 20.0f);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setLines(1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                textView3.setGravity(i13 | 16);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                TLRPC.Chat chat3 = this.Z0;
                if (chat3 != null) {
                    str2 = chat3.title;
                } else {
                    str2 = "";
                }
                if (i10 == 2) {
                    if (p1()) {
                        textView3.setText(LocaleController.getString(R.string.VoipConferenceRemoveMemberAlertTitle2));
                        org.telegram.messenger.nk.r(R.string.VoipConferenceRemoveMemberAlertText2, new Object[]{str}, textView2);
                    } else {
                        textView3.setText(LocaleController.getString(R.string.VoipGroupRemoveMemberAlertTitle2));
                        if (ChatObject.isChannelOrGiga(this.Z0)) {
                            org.telegram.messenger.nk.r(R.string.VoipChannelRemoveMemberAlertText2, new Object[]{str, str2}, textView2);
                        } else {
                            org.telegram.messenger.nk.r(R.string.VoipGroupRemoveMemberAlertText2, new Object[]{str, str2}, textView2);
                        }
                    }
                } else {
                    textView3.setText(LocaleController.getString(R.string.VoipGroupAddMemberTitle));
                    org.telegram.messenger.nk.r(R.string.VoipGroupAddMemberText, new Object[]{str, str2}, textView2);
                }
                boolean z12 = LocaleController.isRTL;
                if (z12) {
                    i14 = 5;
                } else {
                    i14 = 3;
                }
                int i36 = i14 | 48;
                int i37 = 76;
                if (z12) {
                    i15 = 21;
                } else {
                    i15 = 76;
                }
                float f10 = i15;
                if (!z12) {
                    i37 = 21;
                }
                frameLayout2.addView(textView3, w7.z5.d(-1, -2.0f, i36, f10, 11.0f, i37, 0.0f));
                if (LocaleController.isRTL) {
                    i16 = 5;
                } else {
                    i16 = 3;
                }
                frameLayout2.addView(textView2, w7.z5.d(-2, -2.0f, i16 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                if (i10 == 2) {
                    alertDialog$Builder5.k(LocaleController.getString(R.string.VoipGroupUserRemove), new xu(7, this, tLObject));
                } else if (z11) {
                    alertDialog$Builder5.k(LocaleController.getString(R.string.VoipGroupAdd), new ai.f(this, (TLRPC.User) tLObject, j10, 6));
                }
                alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                b2Var3.j(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21319ug, false));
                b2Var3.show();
                if (i10 == 2 && (textView = (TextView) b2Var3.d(-1)) != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21337vg, false));
                }
            }
        }
    }

    public final void z1(boolean r18, org.telegram.ui.Cells.d4 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q50.z1(boolean, org.telegram.ui.Cells.d4):void");
    }

    @Override
    public final void H(float f7, int i10) {
    }
}

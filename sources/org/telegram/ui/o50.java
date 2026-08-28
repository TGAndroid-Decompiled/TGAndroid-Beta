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
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.webrtc.voiceengine.WebRtcAudioTrack;
public final class o50 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, td.b {
    public static boolean A3;
    public static boolean B3;
    public static boolean C3;
    public static volatile DispatchQueue D3 = new DispatchQueue("updateTextureLightningQueue");
    public static boolean E3;
    public static o50 f40880z3;
    public final Paint A;
    public final ArrayList A0;
    public org.telegram.ui.Components.b30 A1;
    public LinearLayout A2;
    public final r30 B;
    public final ArrayList B0;
    public int B1;
    public boolean B2;
    public final q30 C;
    public final ArrayList C0;
    public boolean C1;
    public final org.telegram.ui.Components.mi0 C2;
    public final o30 D;
    public final ArrayList D0;
    public boolean D1;
    public int D2;
    public final ImageView E;
    public int E0;
    public final Paint E1;
    public boolean E2;
    public final ImageView F;
    public final org.telegram.ui.Components.mi0 F0;
    public final Paint F1;
    public final View F2;
    public org.telegram.ui.Components.uj0 G;
    public final org.telegram.ui.Components.mi0 G0;
    public final n50[] G1;
    public final View G2;
    public final s40 H;
    public boolean H0;
    public float H1;
    public GradientDrawable H2;
    public final org.telegram.ui.Components.j6 I;
    public final org.telegram.ui.Components.t9 I0;
    public n50 I1;
    public final int[] I2;
    public final z20 J;
    public final org.telegram.ui.Components.t9 J0;
    public n50 J1;
    public final d30 J2;
    public final k40 K;
    public float K0;
    public long K1;
    public boolean K2;
    public final i50 L;
    public float L0;
    public float L1;
    public boolean L2;
    public final u40 M;
    public float M0;
    public float M1;
    public RenderNode M2;
    public final x30 N;
    public RadialGradient N0;
    public boolean N1;
    public float N2;
    public final TextView O;
    public final Matrix O0;
    public boolean O1;
    public boolean O2;
    public final v30 P;
    public final Paint P0;
    public int P1;
    public final String[] P2;
    public final org.telegram.ui.ActionBar.h5 Q;
    public final d50 Q0;
    public float Q1;
    public ObjectAnimator Q2;
    public final t40 R;
    public float R0;
    public int R1;
    public ObjectAnimator R2;
    public final org.telegram.ui.ActionBar.h5 S;
    public float S0;
    public boolean S1;
    public final d40 S2;
    public final c50 T;
    public ValueAnimator T0;
    public final int[] T1;
    public org.telegram.ui.Cells.e4 T2;
    public final org.telegram.ui.Components.az U;
    public TLRPC.InputPeer U0;
    public final ArrayList U1;
    public org.telegram.ui.Components.voip.l U2;
    public final ImageReceiver V;
    public TLRPC.Chat V0;
    public final ArrayList V1;
    public org.telegram.ui.Components.voip.t V2;
    public int W;
    public ChatObject.Call W0;
    public final g30 W1;
    public org.telegram.ui.Components.b20 W2;
    public final ImageView X;
    public final boolean X0;
    public final l30 X1;
    public boolean X2;
    public final tg.i Y;
    public final String Y0;
    public final y30 Y1;
    public boolean Y2;
    public final int Z;
    public final j50 Z0;
    public float Z1;
    public int Z2;
    public final RadialProgressView f40881a0;
    public final y20 f40882a1;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout a2;
    public AnimatorSet a3;
    public final i30 f40883b;
    public final Drawable f40884b0;
    public final a30 f40885b1;
    public boolean f40886b2;
    public o40 f40887b3;
    public final m20 f40888c;
    public final View f40889c0;
    public final Paint f40890c1;
    public boolean f40891c2;
    public int f40892c3;
    public final AccountInstance d;
    public AnimatorSet f40893d0;
    public ValueAnimator f40894d1;
    public org.telegram.ui.Components.e40 f40895d2;
    public int f40896d3;
    public final s20 f40897e;
    public LaunchActivity f40898e0;
    public float f40899e1;
    public w40 f40900e2;
    public int f40901e3;
    public final org.telegram.ui.Components.voip.u2 f40902f;
    public final UndoView[] f40903f0;
    public final LinearLayout f40904f1;
    public Boolean f40905f2;
    public int f40906f3;
    public final org.telegram.ui.Cells.k f40907g0;
    public final org.telegram.ui.ActionBar.w0 f40908g1;
    public int f40909g2;
    public int f40910g3;
    public final org.telegram.ui.Components.voip.u2 h;
    public boolean f40911h0;
    public final org.telegram.ui.ActionBar.w0 f40912h1;
    public boolean f40913h2;
    public int f40914h3;
    public org.telegram.ui.Components.s30 f40915i0;
    public final org.telegram.ui.ActionBar.w0 f40916i1;
    public final c30 f40917i2;
    public int f40918i3;
    public org.telegram.ui.Components.s30 f40919j0;
    public final org.telegram.ui.ActionBar.g1 f40920j1;
    public final org.telegram.ui.Components.wk0 f40921j2;
    public int f40922j3;
    public int f40923k0;
    public final org.telegram.ui.ActionBar.g1 f40924k1;
    public final u50 f40925k2;
    public int f40926k3;
    public z40 f40927l0;
    public final org.telegram.ui.ActionBar.g1 l1;
    public final org.telegram.ui.Components.c20 f40928l2;
    public int f40929l3;
    public final ArrayList m0;
    public final org.telegram.ui.ActionBar.g1 f40930m1;
    public ViewTreeObserver.OnPreDrawListener f40931m2;
    public int f40932m3;
    public final org.telegram.ui.Components.voip.u2 f40933n;
    public j40 f40934n0;
    public final org.telegram.ui.ActionBar.g1 f40935n1;
    public final org.telegram.ui.Components.voip.h f40936n2;
    public int f40937n3;
    public boolean f40938o0;
    public final org.telegram.ui.ActionBar.g1 f40939o1;
    public boolean f40940o2;
    public int f40941o3;
    public long f40942p0;
    public final org.telegram.ui.ActionBar.g1 f40943p1;
    public final ArrayList f40944p2;
    public int f40945p3;
    public boolean f40946q0;
    public final org.telegram.ui.ActionBar.g1 f40947q1;
    public boolean f40948q2;
    public int f40949q3;
    public final org.telegram.ui.Components.voip.u2 f40950r;
    public final RectF f40951r0;
    public final org.telegram.ui.ActionBar.g1 f40952r1;
    public final b20 f40953r2;
    public int f40954r3;
    public final org.telegram.ui.Components.voip.u2 f40955s;
    public boolean f40956s0;
    public final org.telegram.ui.ActionBar.g1 f40957s1;
    public final w20 f40958s2;
    public final p40 f40959s3;
    public boolean f40960t0;
    public final org.telegram.ui.ActionBar.g1 f40961t1;
    public final org.telegram.ui.Components.hc f40962t2;
    public Boolean f40963t3;
    public float f40964u0;
    public final org.telegram.ui.ActionBar.g1 f40965u1;
    public final b20 f40966u2;
    public Integer f40967u3;
    public final org.telegram.ui.Components.voip.u2 v;
    public a40 f40968v0;
    public final LinearLayout f40969v1;
    public boolean f40970v2;
    public final td.a f40971v3;
    public final org.telegram.ui.Components.voip.u2 f40972w;
    public TLRPC.Peer f40973w0;
    public final TextView f40974w1;
    public final v5 f40975w2;
    public final td.a f40976w3;
    public final t20 f40977x;
    public TLObject f40978x0;
    public final m50 f40979x1;
    public final LongSparseIntArray f40980x2;
    public final td.c f40981x3;
    public final ImageView f40982y;
    public final Paint f40983y0;
    public final xg.i f40984y1;
    public final j30 f40985y2;
    public final td.a f40986y3;
    public final ArrayList f40987z0;
    public b20 f40988z1;
    public final h30 f40989z2;

    public o50(final LaunchActivity launchActivity, AccountInstance accountInstance, ChatObject.Call call, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        super(launchActivity, null, true, true);
        String string;
        int i9;
        o50 o50Var;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.A = new Paint(1);
        this.f40903f0 = new UndoView[2];
        this.m0 = new ArrayList();
        this.f40951r0 = new RectF();
        this.f40983y0 = new Paint(1);
        this.f40987z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.D0 = new ArrayList();
        this.f40984y1 = new xg.i(new b20(this, 8));
        this.B1 = 0;
        this.C1 = false;
        this.E1 = new Paint(7);
        this.F1 = new Paint(7);
        this.G1 = new n50[8];
        this.H1 = 1.0f;
        this.S1 = true;
        this.T1 = new int[4];
        this.U1 = new ArrayList();
        this.V1 = new ArrayList();
        this.f40936n2 = new org.telegram.ui.Components.voip.h();
        this.f40944p2 = new ArrayList();
        this.f40953r2 = new b20(this, 0);
        this.f40958s2 = new w20(this);
        this.f40962t2 = new org.telegram.ui.Components.hc(22);
        this.f40966u2 = new b20(this, 1);
        this.f40970v2 = false;
        this.f40975w2 = new v5(this, 6);
        this.f40980x2 = new LongSparseIntArray();
        this.I2 = new int[2];
        this.L2 = true;
        this.P2 = new String[2];
        this.Z2 = -1;
        this.f40959s3 = new p40(this);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f28844f;
        this.f40971v3 = new td.a(2, this, grVar, 350L);
        this.f40976w3 = new td.a(3, this, grVar, 220L, true);
        this.f40981x3 = new td.c(4, this, grVar, 350L);
        this.f40986y3 = new td.a(5, this, grVar, 350L);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        setOpenNoDelay(true);
        this.d = accountInstance;
        this.W0 = call;
        this.U0 = inputPeer;
        this.V0 = chat;
        this.Y0 = str;
        this.currentAccount = accountInstance.getCurrentAccount();
        this.X0 = z10;
        this.resourcesProvider = new ih.j0();
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.Z = MessagesController.getInstance(this.currentAccount).config.groupCallMessageLengthLimit.get();
        this.fullWidth = true;
        C3 = false;
        B3 = false;
        E3 = false;
        setDelegate(new s30(this));
        this.drawDoubleNavigationBar = true;
        this.drawNavigationBar = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.S2 = new d40(this);
        setOnDismissListener(new e20(this, 0));
        setDimBehindAlpha(75);
        i50 i50Var = new i50(this, launchActivity);
        this.L = i50Var;
        org.telegram.ui.Components.hp hpVar = new org.telegram.ui.Components.hp(true);
        int i10 = org.telegram.ui.ActionBar.f6.f23239qg;
        hpVar.b(org.telegram.ui.ActionBar.f6.u0(i10));
        hpVar.d();
        k40 k40Var = new k40(this, launchActivity, hpVar);
        this.K = k40Var;
        k40Var.setSubtitle("");
        k40Var.getSubtitleTextView().setVisibility(0);
        k40Var.l();
        k40Var.getAdditionalSubtitleTextView().setPadding(AndroidUtilities.dp(24.0f), 0, 0, 0);
        AndroidUtilities.updateViewVisibilityAnimated(k40Var.getAdditionalSubtitleTextView(), this.f40948q2, 1.0f, false);
        k40Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.f6.u0(i10));
        int i11 = org.telegram.ui.ActionBar.f6.f23154lg;
        k40Var.setSubtitleColor(org.telegram.ui.ActionBar.f6.u0(i11));
        k40Var.setBackButtonImage(R.drawable.ic_ab_back);
        k40Var.setOccupyStatusBar(false);
        k40Var.setAllowOverlayTitle(false);
        int i12 = org.telegram.ui.ActionBar.f6.f23083hg;
        k40Var.C(org.telegram.ui.ActionBar.f6.u0(i12), false);
        k40Var.A(org.telegram.ui.ActionBar.f6.u0(org.telegram.ui.ActionBar.f6.f23388z8), false);
        k40Var.setTitleColor(org.telegram.ui.ActionBar.f6.u0(i12));
        k40Var.setSubtitleColor(org.telegram.ui.ActionBar.f6.u0(i11));
        k40Var.setActionBarMenuOnItemClick(new r40(this, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.f40973w0 = tL_peerUser;
            tL_peerUser.user_id = accountInstance.getUserConfig().getClientUserId();
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            this.f40973w0 = tL_peerChannel;
            tL_peerChannel.channel_id = groupCallPeer.channel_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            this.f40973w0 = tL_peerUser2;
            tL_peerUser2.user_id = groupCallPeer.user_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            this.f40973w0 = tL_peerChat;
            tL_peerChat.chat_id = groupCallPeer.chat_id;
        }
        VoIPService.audioLevelsCallback = new y10(this, 3);
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
        this.f40884b0 = launchActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        int i13 = R.raw.voip_filled;
        org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0(i13, "" + R.raw.voip_filled, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        this.F0 = mi0Var;
        int i14 = R.raw.hand_2;
        this.G0 = new org.telegram.ui.Components.mi0(i14, "" + R.raw.hand_2, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        s40 s40Var = new s40(this, launchActivity);
        this.H = s40Var;
        this.containerView = s40Var;
        s40Var.setClipToPadding(false);
        this.containerView.setFocusable(true);
        this.containerView.setFocusableInTouchMode(true);
        this.containerView.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        this.containerView.setKeepScreenOn(true);
        this.containerView.setClipChildren(false);
        this.V = new ImageReceiver(this.containerView);
        if (inputPeer != null) {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(launchActivity);
            this.Q = h5Var;
            h5Var.setGravity(17);
            h5Var.setTextColor(-1);
            h5Var.setTypeface(AndroidUtilities.bold());
            h5Var.setTextSize(18);
            h5Var.k(LocaleController.getString(R.string.VoipChatStartsIn));
            this.containerView.addView(h5Var, g7.e6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            t40 t40Var = new t40(this, launchActivity);
            this.R = t40Var;
            t40Var.setGravity(17);
            t40Var.setTextColor(-1);
            t40Var.setTypeface(AndroidUtilities.bold());
            t40Var.setTextSize(60);
            this.containerView.addView(t40Var, g7.e6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(launchActivity);
            this.S = h5Var2;
            h5Var2.setGravity(17);
            h5Var2.setTextColor(-1);
            h5Var2.setTypeface(AndroidUtilities.bold());
            h5Var2.setTextSize(18);
            this.containerView.addView(h5Var2, g7.e6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (r1()) {
            d50 d50Var = new d50(this, launchActivity);
            this.Q0 = d50Var;
            this.containerView.addView(d50Var, g7.e6.d(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        u40 u40Var = new u40(this, launchActivity);
        this.M = u40Var;
        u40Var.setClipToPadding(false);
        u40Var.setClipChildren(false);
        c50 c50Var = new c50(this);
        this.T = c50Var;
        c50Var.f5449o = grVar;
        c50Var.d = 350L;
        c50Var.f5548c = 350L;
        c50Var.f5549e = 350L;
        c50Var.S();
        u40Var.setItemAnimator(c50Var);
        u40Var.setOnScrollListener(new l20(this));
        u40Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.az azVar = new org.telegram.ui.Components.az(B3 ? 6 : 2, u40Var);
        this.U = azVar;
        u40Var.setLayoutManager(azVar);
        m20 m20Var = new m20(this);
        this.f40888c = m20Var;
        azVar.z1(m20Var);
        u40Var.i(new n20(this));
        azVar.C1();
        this.containerView.addView(u40Var, g7.e6.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        u40Var.setAdapter(i50Var);
        u40Var.setTopBottomSelectorRadius(13);
        u40Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.f6.u0(org.telegram.ui.ActionBar.f6.f23028eg));
        u40Var.setOnItemClickListener(new a7(this, launchActivity, call, 14));
        u40Var.setOnItemLongClickListener(new y10(this, 4));
        if (r1()) {
            m50 m50Var = new m50(this, getContext());
            this.f40979x1 = m50Var;
            this.containerView.addView(m50Var, g7.e6.d(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(launchActivity);
        this.f40921j2 = wk0Var;
        this.containerView.addView(wk0Var, g7.e6.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        u50 u50Var = new u50(call, this.currentAccount, this);
        this.f40925k2 = u50Var;
        wk0Var.setAdapter(u50Var);
        f2.y yVar = new f2.y(6, false);
        wk0Var.setLayoutManager(yVar);
        yVar.z1(new p20(this));
        wk0Var.setOnItemClickListener(new org.telegram.ui.Components.mk0(this) {
            public final o50 f36343b;

            {
                this.f36343b = this;
            }

            @Override
            public final void a(int i16, View view) {
                switch (r2) {
                    case 0:
                        o50 o50Var2 = this.f36343b;
                        o50Var2.getClass();
                        org.telegram.ui.Components.b20 b20Var = (org.telegram.ui.Components.b20) view;
                        if (b20Var.getVideoParticipant() == null) {
                            o50Var2.e1(new ChatObject.VideoParticipant(b20Var.getParticipant(), false, false));
                            return;
                        } else {
                            o50Var2.e1(b20Var.getVideoParticipant());
                            return;
                        }
                    default:
                        o50 o50Var3 = this.f36343b;
                        o50Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                        if (lVar.getParticipant() != null) {
                            o50Var3.e1(lVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        f2.n nVar = new f2.n();
        nVar.S();
        nVar.f5449o = grVar;
        nVar.d = 350L;
        nVar.f5548c = 350L;
        nVar.f5549e = 350L;
        wk0Var.setItemAnimator(new q20(this));
        wk0Var.setOnScrollListener(new r20(this));
        u50Var.H(wk0Var, false, false);
        wk0Var.setVisibility(8);
        s20 s20Var = new s20(this, launchActivity);
        this.f40897e = s20Var;
        int u02 = org.telegram.ui.ActionBar.f6.u0(org.telegram.ui.ActionBar.f6.Jg);
        int red = Color.red(u02);
        int green = Color.green(u02);
        int blue = Color.blue(u02);
        this.O0 = new Matrix();
        this.N0 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.P0 = paint;
        paint.setShader(this.N0);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(9);
        this.I0 = t9Var;
        org.telegram.ui.Components.t9 t9Var2 = new org.telegram.ui.Components.t9(12);
        this.J0 = t9Var2;
        t9Var.f32647a = AndroidUtilities.dp(62.0f) * 0.45454547f;
        t9Var.f32648b = AndroidUtilities.dp(72.0f) * 0.45454547f;
        t9Var.b();
        t9Var2.f32647a = AndroidUtilities.dp(65.0f) * 0.45454547f;
        t9Var2.f32648b = AndroidUtilities.dp(75.0f) * 0.45454547f;
        t9Var2.b();
        int i16 = org.telegram.ui.ActionBar.f6.Ig;
        t9Var.d.setColor(i0.a.k(org.telegram.ui.ActionBar.f6.u0(i16), 38));
        t9Var2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.f6.u0(i16), 76));
        org.telegram.ui.Components.voip.u2 u2Var = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.f40950r = u2Var;
        u2Var.setCheckable(true);
        u2Var.setTextSize(12);
        s20Var.a(u2Var);
        u2Var.setOnClickListener(new z10(this, 7));
        org.telegram.ui.Components.voip.u2 u2Var2 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.f40933n = u2Var2;
        u2Var2.setCheckable(true);
        u2Var2.setTextSize(12);
        u2Var2.d(false, false);
        u2Var2.setCrossOffset(-AndroidUtilities.dpf2(3.5f));
        u2Var2.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), false, false);
        org.telegram.ui.Components.voip.u2 u2Var3 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.f40902f = u2Var3;
        u2Var3.setCheckable(true);
        u2Var3.setTextSize(12);
        u2Var3.d(false, false);
        org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(launchActivity);
        u2Var3.addView(pi0Var, g7.e6.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        int i17 = R.raw.camera_flip;
        org.telegram.ui.Components.mi0 mi0Var2 = new org.telegram.ui.Components.mi0(i17, "" + R.raw.camera_flip, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.C2 = mi0Var2;
        pi0Var.setAnimation(mi0Var2);
        u2Var3.setOnClickListener(new z10(this, 10));
        s20Var.a(u2Var3);
        org.telegram.ui.Components.voip.u2 u2Var4 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.h = u2Var4;
        u2Var4.setCheckable(true);
        u2Var4.setTextSize(12);
        u2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.X = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i18 = R.drawable.filled_sound_on;
        this.W = i18;
        imageView.setImageResource(i18);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        u2Var4.addView(imageView, g7.e6.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        u2Var4.setOnClickListener(new z10(this, 11));
        s20Var.a(u2Var4);
        s20Var.a(u2Var2);
        org.telegram.ui.Components.voip.u2 u2Var5 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.f40955s = u2Var5;
        u2Var5.setTextSize(12);
        u2Var5.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.f6.u0(org.telegram.ui.ActionBar.f6.Dg), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        u2Var5.setOnClickListener(new View.OnClickListener(this) {
            public final o50 f37390b;

            {
                this.f37390b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        o50.o(this.f37390b, launchActivity);
                        return;
                    default:
                        o50 o50Var2 = this.f37390b;
                        o50Var2.W1.e();
                        ChatObject.Call call2 = o50Var2.W0;
                        if (call2 != null && !call2.isScheduled()) {
                            o50Var2.I1();
                            o50.t1(launchActivity, new b20(o50Var2, 5), false, false);
                            return;
                        }
                        o50Var2.dismiss();
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.u2 u2Var6 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.v = u2Var6;
        u2Var6.setCheckable(true);
        u2Var6.b(true, false);
        u2Var6.setTextSize(12);
        u2Var6.c(R.drawable.filled_voice_comment_32, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipMessage), false, false);
        t20 t20Var = new t20(this, launchActivity);
        this.f40977x = t20Var;
        t20Var.setAnimation(mi0Var);
        t20Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.u2 u2Var7 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.f40972w = u2Var7;
        u2Var7.setDrawBackground(false);
        u2Var7.setTextSize(12);
        u2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        u2Var7.addView(t20Var, g7.e6.e(50, 50, 49));
        s20Var.a(u2Var7);
        u2Var7.setOnClickListener(new v20(this));
        s20Var.a(u2Var6);
        s20Var.a(u2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.f40982y = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        u2Var7.addView(imageView2, g7.e6.d(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.W0 != null && r1() && !this.W0.isScheduled()) {
            imageView2.setVisibility(0);
            t20Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.f40881a0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.f6.u0(org.telegram.ui.ActionBar.f6.Og));
        k40Var.setAlpha(0.0f);
        k40Var.getBackButton().setScaleX(0.9f);
        k40Var.getBackButton().setScaleY(0.9f);
        k40Var.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        k40Var.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        k40Var.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        k40Var.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.f6.u0(i12));
        this.f40908g1 = w0Var;
        w0Var.setLongClickEnabled(false);
        w0Var.setIcon(R.drawable.ic_ab_other);
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var.setSubMenuOpenSide(2);
        w0Var.setDelegate(new y10(this, 0));
        int i19 = org.telegram.ui.ActionBar.f6.f23100ig;
        w0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.e0(org.telegram.ui.ActionBar.f6.u0(i19), 6));
        w0Var.setOnClickListener(new z10(this, 0));
        w0Var.G(org.telegram.ui.ActionBar.f6.u0(i12), false);
        w0Var.G(org.telegram.ui.ActionBar.f6.u0(i12), true);
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.f6.u0(i12));
        this.f40912h1 = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setIcon(R.drawable.msg_voice_pip);
        w0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        w0Var2.setBackground(org.telegram.ui.ActionBar.f6.e0(org.telegram.ui.ActionBar.f6.u0(i19), 6));
        w0Var2.setOnClickListener(new z10(this, 1));
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.f6.u0(i12));
        this.f40916i1 = w0Var3;
        w0Var3.setLongClickEnabled(false);
        w0Var3.setIcon(R.drawable.msg_screencast);
        w0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        w0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.e0(org.telegram.ui.ActionBar.f6.u0(i19), 6));
        w0Var3.setOnClickListener(new z10(this, 2));
        y20 y20Var = new y20(this, launchActivity, launchActivity);
        this.f40882a1 = y20Var;
        z20 z20Var = new z20(launchActivity);
        this.J = z20Var;
        z20Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.f40890c1 = paint2;
        paint2.setColor(-12761513);
        a30 a30Var = new a30(this, getContext());
        this.f40885b1 = a30Var;
        a30Var.setTextColor(getThemedColor(i12));
        a30Var.setTextSize(1, 11.0f);
        a30Var.setText(LocaleController.getString(R.string.VoipChannelLabelLive));
        a30Var.setMaxLines(1);
        a30Var.setGravity(17);
        a30Var.setTypeface(AndroidUtilities.bold());
        a30Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f));
        a30Var.setTag(-1);
        if (!r1()) {
            a30Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f40904f1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(y20Var, g7.e6.l(1.0f, 0, -2));
        linearLayout.addView(a30Var, g7.e6.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.containerView.addView(z20Var, g7.e6.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(linearLayout, g7.e6.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.containerView.addView(k40Var, g7.e6.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.f40969v1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(w0Var3, g7.e6.n(48, 48));
        linearLayout2.addView(w0Var2, g7.e6.n(48, 48));
        linearLayout2.addView(w0Var, g7.e6.n(48, 48));
        this.containerView.addView(linearLayout2, g7.e6.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.f40889c0 = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.u0(org.telegram.ui.ActionBar.f6.V5));
        this.containerView.addView(view, g7.e6.c(1.0f, -1));
        for (int i20 = 0; i20 < 2; i20++) {
            this.f40903f0[i20] = new b30(this, launchActivity);
            this.f40903f0[i20].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            this.f40903f0[i20].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.containerView.addView(this.f40903f0[i20], g7.e6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(launchActivity, true);
        this.f40907g0 = kVar;
        kVar.setTag(R.id.fit_width_tag, 240);
        this.f40908g1.h(kVar, AndroidUtilities.dp(48.0f));
        this.f40908g1.setShowSubmenuByMove(false);
        int i21 = org.telegram.ui.ActionBar.f6.f23028eg;
        kVar.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.u0(i21), 6, 6));
        org.telegram.ui.ActionBar.w0 w0Var4 = this.f40908g1;
        org.telegram.ui.ActionBar.g1 d = w0Var4.d(1, 0, null, LocaleController.getString(R.string.VoipGroupAllCanSpeak), true, true, w0Var4.f23912i0);
        this.f40947q1 = d;
        d.j(true, false);
        org.telegram.ui.ActionBar.w0 w0Var5 = this.f40908g1;
        org.telegram.ui.ActionBar.g1 d9 = w0Var5.d(2, 0, null, LocaleController.getString(R.string.VoipGroupOnlyAdminsCanSpeak), true, true, w0Var5.f23912i0);
        this.f40952r1 = d9;
        d9.j(false, true);
        int i22 = org.telegram.ui.ActionBar.f6.f23343wg;
        d.setCheckColor(i22);
        d.c(org.telegram.ui.ActionBar.f6.u0(i22), org.telegram.ui.ActionBar.f6.u0(i22));
        d9.setCheckColor(i22);
        d9.c(org.telegram.ui.ActionBar.f6.u0(i22), org.telegram.ui.ActionBar.f6.u0(i22));
        Paint paint3 = new Paint(1);
        int i23 = org.telegram.ui.ActionBar.f6.f23083hg;
        paint3.setColor(org.telegram.ui.ActionBar.f6.u0(i23));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.w0 w0Var6 = this.f40908g1;
        org.telegram.ui.ActionBar.g1 d10 = w0Var6.d(10, R.drawable.msg_voice_speaker, null, LocaleController.getString(R.string.VoipGroupAudio), true, false, w0Var6.f23912i0);
        this.l1 = d10;
        d10.setItemHeight(56);
        org.telegram.ui.ActionBar.w0 w0Var7 = this.f40908g1;
        org.telegram.ui.ActionBar.g1 d11 = w0Var7.d(11, R.drawable.msg_noise_on, null, LocaleController.getString(R.string.VoipNoiseCancellation), true, false, w0Var7.f23912i0);
        this.f40930m1 = d11;
        d11.setItemHeight(56);
        TextView b10 = this.f40908g1.b(i0.a.d(0.3f, org.telegram.ui.ActionBar.f6.u0(org.telegram.ui.ActionBar.f6.f23065gg), -16777216));
        this.f40974w1 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.w0 w0Var8 = this.f40908g1;
        org.telegram.ui.ActionBar.g1 d12 = w0Var8.d(6, R.drawable.msg_edit, this.Z0, LocaleController.getString(ChatObject.isChannelOrGiga(this.V0) ? R.string.VoipChannelEditTitle : R.string.VoipGroupEditTitle), true, false, w0Var8.f23912i0);
        this.f40924k1 = d12;
        org.telegram.ui.ActionBar.w0 w0Var9 = this.f40908g1;
        org.telegram.ui.ActionBar.g1 d13 = w0Var9.d(7, R.drawable.msg_permissions, this.Z0, LocaleController.getString(R.string.VoipGroupEditPermissions), false, false, w0Var9.f23912i0);
        this.f40935n1 = d13;
        org.telegram.ui.ActionBar.g1 e10 = this.f40908g1.e(3, R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareInviteLink));
        this.f40920j1 = e10;
        j50 j50Var = new j50();
        this.Z0 = j50Var;
        org.telegram.ui.ActionBar.g1 e11 = this.f40908g1.e(9, R.drawable.msg_screencast, LocaleController.getString(R.string.VoipChatStartScreenCapture));
        this.f40943p1 = e11;
        org.telegram.ui.ActionBar.w0 w0Var10 = this.f40908g1;
        org.telegram.ui.ActionBar.g1 d14 = w0Var10.d(5, 0, j50Var, LocaleController.getString(R.string.VoipGroupRecordCall), true, false, w0Var10.f23912i0);
        this.f40939o1 = d14;
        j50Var.a(d14.getImageView());
        org.telegram.ui.ActionBar.g1 e12 = this.f40908g1.e(12, R.drawable.menu_stream_comments_24, LocaleController.getString(R.string.VoipChannelEnableComments));
        this.f40961t1 = e12;
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        org.telegram.ui.ActionBar.g1 e13 = this.f40908g1.e(13, R.drawable._menu_stream_comments_off_24, LocaleController.getString(R.string.VoipChannelDisableComments));
        this.f40965u1 = e13;
        org.telegram.ui.ActionBar.w0 w0Var11 = this.f40908g1;
        int i24 = R.drawable.msg_cancel;
        if (o1()) {
            i9 = i23;
            string = LocaleController.getString(R.string.VoipGroupEndConference);
        } else {
            string = LocaleController.getString(ChatObject.isChannelOrGiga(this.V0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat);
            i9 = i23;
        }
        org.telegram.ui.ActionBar.g1 e14 = w0Var11.e(4, i24, string);
        this.f40957s1 = e14;
        this.f40908g1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.f6.u0(i21));
        this.f40908g1.getPopupLayout().setFitItems(true);
        e12.c(org.telegram.ui.ActionBar.f6.u0(i9), org.telegram.ui.ActionBar.f6.u0(i9));
        e13.c(org.telegram.ui.ActionBar.f6.u0(i9), org.telegram.ui.ActionBar.f6.u0(i9));
        d10.c(org.telegram.ui.ActionBar.f6.u0(i9), org.telegram.ui.ActionBar.f6.u0(i9));
        d11.c(org.telegram.ui.ActionBar.f6.u0(i9), org.telegram.ui.ActionBar.f6.u0(i9));
        int i25 = org.telegram.ui.ActionBar.f6.f23326vg;
        e14.c(org.telegram.ui.ActionBar.f6.u0(i25), org.telegram.ui.ActionBar.f6.u0(i25));
        e10.c(org.telegram.ui.ActionBar.f6.u0(i9), org.telegram.ui.ActionBar.f6.u0(i9));
        d12.c(org.telegram.ui.ActionBar.f6.u0(i9), org.telegram.ui.ActionBar.f6.u0(i9));
        d13.c(org.telegram.ui.ActionBar.f6.u0(i9), org.telegram.ui.ActionBar.f6.u0(i9));
        d14.c(org.telegram.ui.ActionBar.f6.u0(i9), org.telegram.ui.ActionBar.f6.u0(i9));
        e11.c(org.telegram.ui.ActionBar.f6.u0(i9), org.telegram.ui.ActionBar.f6.u0(i9));
        if (this.W0 != null) {
            l1();
        }
        if (o1()) {
            this.f40927l0 = new z40();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.f40927l0.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        P1(false);
        this.K.getTitleTextView().setOnClickListener(new z10(this, 3));
        c30 c30Var = new c30(this, launchActivity);
        this.f40917i2 = c30Var;
        d30 d30Var = new d30(this);
        this.J2 = d30Var;
        c30Var.setClipToPadding(false);
        d30Var.S();
        d30Var.f5449o = org.telegram.ui.Components.gr.f28844f;
        d30Var.d = 350L;
        d30Var.f5548c = 350L;
        d30Var.f5549e = 350L;
        c30Var.setItemAnimator(d30Var);
        c30Var.setOnScrollListener(new e30(this));
        c30Var.setClipChildren(false);
        f2.m0 m0Var = new f2.m0();
        m0Var.j1(0);
        c30Var.setLayoutManager(m0Var);
        org.telegram.ui.Components.c20 c20Var = new org.telegram.ui.Components.c20(call, this.currentAccount, this);
        this.f40928l2 = c20Var;
        c30Var.setAdapter(c20Var);
        c20Var.F(c30Var, false);
        c30Var.setOnItemClickListener(new org.telegram.ui.Components.mk0(this) {
            public final o50 f36343b;

            {
                this.f36343b = this;
            }

            @Override
            public final void a(int i162, View view2) {
                switch (r2) {
                    case 0:
                        o50 o50Var2 = this.f36343b;
                        o50Var2.getClass();
                        org.telegram.ui.Components.b20 b20Var = (org.telegram.ui.Components.b20) view2;
                        if (b20Var.getVideoParticipant() == null) {
                            o50Var2.e1(new ChatObject.VideoParticipant(b20Var.getParticipant(), false, false));
                            return;
                        } else {
                            o50Var2.e1(b20Var.getVideoParticipant());
                            return;
                        }
                    default:
                        o50 o50Var3 = this.f36343b;
                        o50Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view2;
                        if (lVar.getParticipant() != null) {
                            o50Var3.e1(lVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        c30Var.setOnItemLongClickListener(new y10(this, 1));
        c30Var.setVisibility(8);
        c30Var.i(new f30());
        g30 g30Var = new g30(this, launchActivity, this.M, c30Var, this.U1, this.W0, this);
        this.W1 = g30Var;
        g30Var.setClipChildren(false);
        c20Var.E(this.U1, g30Var);
        if (this.f40921j2 != null) {
            this.f40925k2.G(this.U1, g30Var);
        }
        h30 h30Var = new h30(this, launchActivity);
        this.f40989z2 = h30Var;
        i30 i30Var = new i30(this, launchActivity, this.K, this.M, h30Var);
        this.f40883b = i30Var;
        i30Var.setImagesLayerNum(Integer.MAX_VALUE);
        i30Var.setInvalidateWithParent(true);
        h30Var.setProfileGalleryView(i30Var);
        j30 j30Var = new j30(this, launchActivity);
        this.f40985y2 = j30Var;
        j30Var.setVisibility(8);
        i30Var.setVisibility(0);
        i30Var.b(new k30(this));
        l30 l30Var = new l30(this, launchActivity);
        this.X1 = l30Var;
        this.containerView.addView(g30Var);
        g30Var.addView(c30Var, g7.e6.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.f40897e.setWillNotDraw(false);
        View view2 = new View(launchActivity);
        this.F2 = view2;
        int[] iArr = this.I2;
        iArr[0] = this.R1;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.I2);
        this.H2 = gradientDrawable;
        view2.setBackground(gradientDrawable);
        this.containerView.addView(view2, g7.e6.e(-1, 60, 83));
        View view3 = new View(launchActivity);
        this.G2 = view3;
        view3.setBackgroundColor(this.I2[0]);
        this.containerView.addView(view3, g7.e6.e(-1, 0, 83));
        tg.i iVar = new tg.i(launchActivity);
        this.Y = iVar;
        iVar.setDelegate(new m30(this));
        iVar.setClickCellDelegate(new n30(this));
        if (this.W0 != null) {
            iVar.C0(this.d.getCurrentAccount(), this.W0.getInputGroupCall(false));
        }
        this.containerView.addView(iVar, g7.e6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(launchActivity, false, true, true);
        this.I = j6Var;
        j6Var.setGravity(17);
        j6Var.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var.setTextColor(-1);
        j6Var.b(0.4f, 320L, org.telegram.ui.Components.gr.h);
        j6Var.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.f40897e);
        o30 o30Var = new o30(this, launchActivity, this.H, LaunchActivity.R(), this.resourcesProvider);
        this.D = o30Var;
        o30Var.F = true;
        o30Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.Z)});
        o30Var.getEditText().setLinkTextColor(-11683585);
        o30Var.setHint(LocaleController.getString(R.string.TypeMessage));
        o30Var.getEditText().addTextChangedListener(new p30(this));
        o30Var.s();
        q30 q30Var = new q30(this, launchActivity);
        this.C = q30Var;
        this.containerView.addView(q30Var, g7.e6.c(-1.0f, -1));
        r30 r30Var = new r30(launchActivity);
        this.B = r30Var;
        r30Var.addView(o30Var, g7.e6.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        r30Var.addView(j6Var, g7.e6.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        j6Var.setTranslationY(-AndroidUtilities.dp(20.0f));
        this.containerView.addView(r30Var, g7.e6.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.F = imageView3;
        int i26 = org.telegram.ui.ActionBar.f6.f23092i6;
        imageView3.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i26), 1, -1));
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23038f7, this.resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new z10(this, 4));
        ImageView imageView4 = new ImageView(launchActivity);
        this.E = imageView4;
        imageView4.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i26), 1, -1));
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23319v6, this.resourcesProvider), mode));
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new z10(this, 5));
        r30Var.addView(imageView3, g7.e6.e(48, 48, 85));
        r30Var.addView(imageView4, g7.e6.e(48, 48, 85));
        this.containerView.addView(l30Var);
        j30Var.addView(i30Var, g7.e6.c(-1.0f, -1));
        j30Var.addView(h30Var, g7.e6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(j30Var, g7.e6.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        O0(false);
        this.L.l();
        if (C3) {
            this.f40925k2.I(this.f40921j2, false);
        }
        this.E0 = this.L.h();
        if (inputPeer != null) {
            TextView textView = new TextView(launchActivity);
            this.O = textView;
            textView.setGravity(17);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 14.0f);
            if (ChatObject.isChannel(this.V0) && (chat2 = this.V0) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            this.containerView.addView(textView, g7.e6.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.bc0 bc0Var = new org.telegram.ui.Components.bc0(launchActivity);
            bc0Var.setTextColor(-1);
            bc0Var.setSelectorColor(-9598483);
            bc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            bc0Var.setItemCount(5);
            t30 t30Var = new t30(launchActivity);
            t30Var.setItemCount(5);
            t30Var.setTextColor(-1);
            t30Var.setSelectorColor(-9598483);
            t30Var.setTextOffset(-AndroidUtilities.dp(10.0f));
            u30 u30Var = new u30(launchActivity);
            u30Var.setItemCount(5);
            u30Var.setTextColor(-1);
            u30Var.setSelectorColor(-9598483);
            u30Var.setTextOffset(-AndroidUtilities.dp(34.0f));
            v30 v30Var = new v30(launchActivity);
            this.P = v30Var;
            v30Var.setLines(1);
            v30Var.setSingleLine(true);
            v30Var.setEllipsize(TextUtils.TruncateAt.END);
            v30Var.setGravity(17);
            v30Var.setTextColor(-1);
            v30Var.setTypeface(AndroidUtilities.bold());
            v30Var.setTextSize(1, 14.0f);
            this.containerView.addView(v30Var, g7.e6.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            v30Var.setOnClickListener(new org.telegram.messenger.video.g(this, bc0Var, t30Var, u30Var, chat, accountInstance, inputPeer2, 1));
            x30 x30Var = new x30(launchActivity, bc0Var, t30Var, u30Var);
            this.N = x30Var;
            x30Var.setWeightSum(1.0f);
            x30Var.setOrientation(0);
            this.containerView.addView(x30Var, g7.e6.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i27 = calendar.get(1);
            int i28 = calendar.get(6);
            x30Var.addView(bc0Var, g7.e6.l(0.5f, 0, 270));
            bc0Var.setMinValue(0);
            bc0Var.setMaxValue(365);
            bc0Var.setWrapSelectorWheel(false);
            bc0Var.setFormatter(new bg.f(currentTimeMillis, calendar, i27, 1));
            a1.d dVar = new a1.d(this, bc0Var, t30Var, u30Var, 13);
            o50Var = this;
            bc0Var.setOnValueChangedListener(dVar);
            t30Var.setMinValue(0);
            t30Var.setMaxValue(23);
            x30Var.addView(t30Var, g7.e6.l(0.2f, 0, 270));
            t30Var.setFormatter(new org.telegram.ui.Components.if0(23));
            t30Var.setOnValueChangedListener(dVar);
            u30Var.setMinValue(0);
            u30Var.setMaxValue(59);
            u30Var.setValue(0);
            u30Var.setFormatter(new org.telegram.ui.Components.if0(24));
            x30Var.addView(u30Var, g7.e6.l(0.3f, 0, 270));
            u30Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i29 = calendar.get(6);
            int i30 = calendar.get(12);
            int i31 = calendar.get(11);
            bc0Var.setValue(i28 != i29 ? 1 : 0);
            u30Var.setValue(i30);
            t30Var.setValue(i31);
            org.telegram.ui.Components.y4.g(v30Var, textView, 0L, 604800L, 2, bc0Var, t30Var, u30Var);
        } else {
            o50Var = this;
        }
        y30 y30Var = new y30(o50Var, (ViewGroup) o50Var.getWindow().getDecorView(), o50Var.containerView);
        o50Var.Y1 = y30Var;
        y30Var.E = new z30(o50Var);
        i30Var.setPinchToZoomHelper(y30Var);
        o50Var.f40933n.setOnClickListener(new View.OnClickListener(o50Var) {
            public final o50 f37390b;

            {
                this.f37390b = o50Var;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        o50.o(this.f37390b, launchActivity);
                        return;
                    default:
                        o50 o50Var2 = this.f37390b;
                        o50Var2.W1.e();
                        ChatObject.Call call2 = o50Var2.W0;
                        if (call2 != null && !call2.isScheduled()) {
                            o50Var2.I1();
                            o50.t1(launchActivity, new b20(o50Var2, 5), false, false);
                            return;
                        }
                        o50Var2.dismiss();
                        return;
                }
            }
        });
        o50Var.L1(false);
        o50Var.I1();
        o50Var.M1(false);
        o50Var.N1(false, false);
        o50Var.B1(0.0f);
        o50Var.O1();
        o50Var.containerView.addView(new FrameLayout(launchActivity), g7.e6.e(-1, 200, 87));
        o50Var.v.setOnClickListener(new z10(o50Var, 6));
        o50Var.T0();
        g7.g6.a(o50Var.f40933n);
        g7.g6.a(o50Var.f40950r);
        g7.g6.a(o50Var.f40902f);
        g7.g6.a(o50Var.h);
        g7.g6.a(o50Var.f40972w);
        g7.g6.a(o50Var.f40955s);
        g7.g6.a(o50Var.v);
        r0.j0.m(o50Var.containerView, new y10(o50Var, 2));
    }

    public static void A(o50 o50Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        boolean z10;
        TLRPC.GroupCall groupCall;
        c2Var.dismiss();
        if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
            Context context = o50Var.getContext();
            int i9 = o50Var.currentAccount;
            TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
            String str = ((TL_phone.exportedGroupCallInvite) tLObject).link;
            org.telegram.ui.ActionBar.b6 b6Var = o50Var.resourcesProvider;
            ChatObject.Call call = o50Var.W0;
            if (call != null && (groupCall = call.call) != null && groupCall.creator) {
                z10 = true;
            } else {
                z10 = false;
            }
            i9.n0(context, i9, inputGroupCall, str, b6Var, false, z10);
        } else if (tL_error != null) {
            new org.telegram.ui.Components.oc(o50Var.topBulletinContainer, new ih.j0()).d0(tL_error, false);
        }
    }

    public static void A0(o50 o50Var) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("reminderhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("reminderhint", true).commit();
        if (o50Var.f40919j0 == null) {
            org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(o50Var.getContext(), 8);
            o50Var.f40919j0 = s30Var;
            s30Var.setAlpha(0.0f);
            o50Var.f40919j0.setVisibility(4);
            o50Var.f40919j0.setShowingDuration(4000L);
            o50Var.containerView.addView(o50Var.f40919j0, g7.e6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            o50Var.f40919j0.setText(LocaleController.getString(R.string.VoipChatReminderHint));
            o50Var.f40919j0.d();
        }
        o50Var.f40919j0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        o50Var.f40919j0.f(o50Var.f40972w, true);
    }

    public static void C(o50 o50Var, int[] iArr, float[] fArr) {
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        f2.q1 K;
        c30 c30Var = o50Var.f40917i2;
        g30 g30Var = o50Var.W1;
        for (int i9 = 0; i9 < iArr.length; i9++) {
            TLRPC.GroupCallParticipant groupCallParticipant = o50Var.W0.participantsBySources.get(iArr[i9]);
            if (groupCallParticipant != null) {
                if (!g30Var.f33598b) {
                    if (o50Var.f40938o0) {
                        arrayList = o50Var.f40987z0;
                    } else {
                        arrayList = o50Var.W0.visibleParticipants;
                    }
                    int indexOf = arrayList.indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = o50Var.M.K(indexOf + o50Var.L.d)) != null) {
                        View view = K.f5501a;
                        if (view instanceof org.telegram.ui.Cells.e4) {
                            ((org.telegram.ui.Cells.e4) view).setAmplitude(fArr[i9] * 15.0f);
                            if (view == o50Var.T2 && !o50Var.f40913h2) {
                                o50Var.containerView.invalidate();
                            }
                        }
                    }
                } else {
                    for (int i10 = 0; i10 < c30Var.getChildCount(); i10++) {
                        org.telegram.ui.Components.b20 b20Var = (org.telegram.ui.Components.b20) c30Var.getChildAt(i10);
                        if (MessageObject.getPeerId(b20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                            b20Var.setAmplitude(fArr[i9] * 15.0f);
                        }
                    }
                }
                g30Var.k(groupCallParticipant, fArr[i9] * 15.0f);
            }
        }
    }

    public static void D(o50 o50Var) {
        Editable text = o50Var.D.getText();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = text.toString();
        tL_textWithEntities.entities = MediaDataController.getInstance(o50Var.currentAccount).getEntities(new CharSequence[]{text}, true);
        o50Var.A1(tL_textWithEntities);
    }

    public static void E0(o50 o50Var) {
        ChatObject.Call call = o50Var.W0;
        if (call != null && call.call != null) {
            TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
            togglegroupcallsettings.call = o50Var.W0.getInputGroupCall();
            togglegroupcallsettings.join_muted = Boolean.valueOf(o50Var.W0.call.join_muted);
            ConnectionsManager connectionsManager = o50Var.d.getConnectionsManager();
            DispatchQueue dispatchQueue = Utilities.stageQueue;
            Objects.requireNonNull(dispatchQueue);
            connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.c1(dispatchQueue), new j20(o50Var, 1));
        }
    }

    public static void F0(o50 o50Var, boolean z10) {
        if (o50Var.W0 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = o50Var.W0.getInputGroupCall();
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        o50Var.f40963t3 = Boolean.valueOf(z10);
        o50Var.H1(true);
        ConnectionsManager connectionsManager = o50Var.d.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.c1(dispatchQueue), new j20(o50Var, 0));
    }

    public static void G0(o50 o50Var) {
        boolean z10;
        int i9;
        if (o50Var.r1()) {
            g30 g30Var = o50Var.W1;
            if (!g30Var.R && g30Var.f33598b && (B3 == o50Var.q1() || AndroidUtilities.isTablet())) {
                z10 = false;
            } else {
                z10 = true;
            }
            Boolean bool = o50Var.f40905f2;
            if (bool != null && z10 == bool.booleanValue()) {
                return;
            }
            int systemUiVisibility = o50Var.containerView.getSystemUiVisibility();
            if (z10) {
                i9 = systemUiVisibility & (-7);
                o50Var.getWindow().clearFlags(1024);
                o50Var.setHideSystemVerticalInsets(false);
            } else {
                o50Var.setHideSystemVerticalInsets(true);
                i9 = systemUiVisibility | 6;
                o50Var.getWindow().addFlags(1024);
            }
            o50Var.containerView.setSystemUiVisibility(i9);
            o50Var.f40905f2 = Boolean.valueOf(z10);
            o50Var.O2 = !z10;
            o50Var.containerView.requestApplyInsets();
            return;
        }
        o50Var.isFullscreen = false;
    }

    public static org.telegram.ui.Components.voip.l H0(o50 o50Var) {
        u40 u40Var = o50Var.M;
        for (int i9 = 0; i9 < u40Var.getChildCount(); i9++) {
            View childAt = u40Var.getChildAt(i9);
            if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.l) && RecyclerView.R(childAt) >= 0) {
                return (org.telegram.ui.Components.voip.l) childAt;
            }
        }
        return null;
    }

    public static void I0(o50 o50Var) {
        boolean z10;
        Integer num;
        boolean z11;
        float f10;
        float f11;
        float dp;
        float dp2;
        float dp3;
        float f12;
        float f13;
        float f14;
        boolean z12;
        View childAt;
        k40 k40Var = o50Var.K;
        u40 u40Var = o50Var.M;
        int childCount = u40Var.getChildCount();
        float f15 = 2.1474836E9f;
        for (int i9 = 0; i9 < childCount; i9++) {
            if (RecyclerView.R(u40Var.getChildAt(i9)) >= 0) {
                f15 = Math.min(f15, childAt.getTop());
            }
        }
        if (f15 < 0.0f || f15 == 2.1474836E9f) {
            if (childCount != 0) {
                f15 = 0.0f;
            } else {
                f15 = u40Var.getPaddingTop();
            }
        }
        if (f15 <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float dp4 = f15 + AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if ((z10 && k40Var.getTag() == null) || (!z10 && k40Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            k40Var.setTag(num);
            AnimatorSet animatorSet = o50Var.f40893d0;
            if (animatorSet != null) {
                animatorSet.cancel();
                o50Var.f40893d0 = null;
            }
            if (k40Var.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            o50Var.setUseLightStatusBar(z11);
            ViewPropertyAnimator animate = k40Var.getBackButton().animate();
            float f16 = 0.9f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.9f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f10);
            if (z10) {
                f16 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f16);
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = -AndroidUtilities.dp(14.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationX(f11).setDuration(300L);
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f28844f;
            duration.setInterpolator(grVar).start();
            ViewPropertyAnimator animate2 = k40Var.getTitleTextView().animate();
            if (z10) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(23.0f);
            }
            animate2.translationY(dp).setDuration(300L).setInterpolator(grVar).start();
            ObjectAnimator objectAnimator = o50Var.Q2;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                o50Var.Q2.cancel();
            }
            org.telegram.ui.ActionBar.h5 subtitleTextView = k40Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            float translationY = k40Var.getSubtitleTextView().getTranslationY();
            if (z10) {
                dp2 = 0.0f;
            } else {
                dp2 = AndroidUtilities.dp(20.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, property, translationY, dp2);
            o50Var.Q2 = ofFloat;
            ofFloat.setDuration(300L);
            o50Var.Q2.setInterpolator(grVar);
            o50Var.Q2.addListener(new org.telegram.ui.Components.u9(29, o50Var, z10));
            o50Var.Q2.start();
            ObjectAnimator objectAnimator2 = o50Var.R2;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            org.telegram.ui.ActionBar.h5 additionalSubtitleTextView = k40Var.getAdditionalSubtitleTextView();
            if (z10) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(20.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(additionalSubtitleTextView, property, dp3);
            o50Var.R2 = ofFloat2;
            ofFloat2.setDuration(300L);
            o50Var.R2.setInterpolator(grVar);
            o50Var.R2.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            o50Var.f40893d0 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = o50Var.f40893d0;
            Property property2 = View.ALPHA;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(k40Var, property2, f12);
            z20 z20Var = o50Var.J;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(z20Var, property2, f13);
            View view = o50Var.f40889c0;
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, property2, f14));
            o50Var.f40893d0.addListener(new i40(o50Var, 1));
            o50Var.f40893d0.start();
            ImageView imageView = o50Var.W1.v;
            if (z10 && !B3) {
                z12 = false;
            } else {
                z12 = true;
            }
            imageView.setClickable(z12);
        }
        if (o50Var.f40964u0 != dp4) {
            o50Var.E1(dp4);
        }
    }

    public static void M(o50 o50Var, org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (!o50Var.isDismissed()) {
            if (z10 && lVar.getRenderer() == null) {
                lVar.setRenderer(org.telegram.ui.Components.voip.t.c(o50Var.U1, o50Var.W1, lVar, null, null, lVar.getParticipant(), o50Var.W0, o50Var));
            } else if (!z10 && lVar.getRenderer() != null) {
                lVar.getRenderer().setPrimaryView(null);
                lVar.setRenderer(null);
            }
        }
    }

    public static void R(o50 o50Var, int i9, int[] iArr) {
        if (o50Var.r1()) {
            int i10 = org.telegram.ui.ActionBar.f6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Lg, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23396zg, false), o50Var.Q1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23136kg, false), org.telegram.ui.ActionBar.f6.w0(null, i10, false), o50Var.Q1, 1.0f);
        } else if (i9 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Jg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23378yg, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23396zg, false), o50Var.Q1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23361xg, false);
        } else if (i9 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Gg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Bg, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Cg, false), o50Var.Q1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ag, false);
        } else if (p1(i9)) {
            iArr[0] = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23137kh, false);
            iArr[1] = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23155lh, false);
            iArr[2] = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23171mh, false);
        } else {
            int i11 = org.telegram.ui.ActionBar.f6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.f6.w0(null, i11, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Mg, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ng, false), o50Var.Q1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23136kg, false), org.telegram.ui.ActionBar.f6.w0(null, i11, false), o50Var.Q1, 1.0f);
        }
        if (p1(i9)) {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23101ih, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23137kh, false));
        } else if (i9 == 1) {
            iArr[3] = i0.a.d(0.75f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Bg, false), i0.a.d(0.5f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Fg, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Hg, false)));
        } else {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Jg, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ig, false));
        }
    }

    public static void c1(LaunchActivity launchActivity, AccountInstance accountInstance, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        if (f40880z3 == null) {
            if (inputPeer != null || VoIPService.getSharedInstance() != null) {
                if (inputPeer != null) {
                    f40880z3 = new o50(launchActivity, accountInstance, accountInstance.getMessagesController().getGroupCall(chat.f22380id, false), chat, inputPeer, z10, str);
                } else {
                    ChatObject.Call call = VoIPService.getSharedInstance().groupCall;
                    if (call != null) {
                        TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(call.chatId));
                        call.addSelfDummyParticipant(true);
                        f40880z3 = new o50(launchActivity, accountInstance, call, chat2, null, z10, str);
                    } else {
                        return;
                    }
                }
                f40880z3.f40898e0 = launchActivity;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.hc(21));
            }
        }
    }

    public static String f1(int i9) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
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

    public static String g1(int i9) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i9 == 2) {
            if (sharedInstance != null && (str = sharedInstance.currentBluetoothDeviceName) != null) {
                return LocaleController.formatString(R.string.VoipAudioSwitchedToBluetoothDevice, str);
            }
            return LocaleController.getString(R.string.VoipAudioSwitchedToBluetooth);
        } else if (i9 == 1) {
            if (sharedInstance != null && sharedInstance.isHeadsetPlugged()) {
                return LocaleController.getString(R.string.VoipAudioSwitchedToHeadset);
            }
            return LocaleController.getString(R.string.VoipAudioSwitchedToPhone);
        } else {
            return LocaleController.getString(R.string.VoipAudioSwitchedToSpeaker);
        }
    }

    public static void m(o50 o50Var, ChatObject.Call.InvitedUser invitedUser, Long l10) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(o50Var.currentAccount).sendRequest(declineconferencecallinvite, new i20(o50Var, 0));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(invitedUser.msg_id));
        MessagesController.getInstance(o50Var.currentAccount).deleteMessages(arrayList, null, null, 0L, 0, true, 0);
        ChatObject.Call call = o50Var.W0;
        if (call != null) {
            call.invitedUsers.remove(l10);
            o50Var.W0.invitedUsersMap.remove(l10);
            o50Var.W0.invitedUsersMessageIds.remove(l10);
            o50Var.O0(true);
        }
    }

    public static void n(o50 o50Var, Activity activity, ChatObject.Call call, View view, int i9) {
        TLRPC.Chat chat;
        final ChatObject.Call.InvitedUser invitedUser;
        AccountInstance accountInstance = o50Var.d;
        ArrayList arrayList = o50Var.B0;
        i50 i50Var = o50Var.L;
        if (view instanceof org.telegram.ui.Components.voip.l) {
            o50Var.e1(((org.telegram.ui.Components.voip.l) view).getParticipant());
        } else if (view instanceof org.telegram.ui.Cells.e4) {
            o50Var.F1((org.telegram.ui.Cells.e4) view);
        } else {
            Collection collection = null;
            r7 = null;
            r7 = null;
            r7 = null;
            final Long l10 = null;
            boolean z10 = true;
            if (view instanceof org.telegram.ui.Cells.w3) {
                org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view;
                if (w3Var.getUser() != null) {
                    if (o50Var.o1()) {
                        int i10 = i9 - i50Var.f39013n;
                        if (i10 >= 0 && i10 < o50Var.W0.shadyJoinParticipants.size()) {
                            l10 = o50Var.W0.shadyJoinParticipants.get(i9 - i50Var.f39013n);
                        } else {
                            int i11 = i9 - i50Var.f39015s;
                            if (i11 >= 0 && i11 < o50Var.W0.shadyLeftParticipants.size()) {
                                l10 = o50Var.W0.shadyLeftParticipants.get(i9 - i50Var.f39015s);
                            } else {
                                int i12 = i9 - i50Var.f39012f;
                                if (o50Var.f40938o0) {
                                    if (i12 >= 0 && i12 < arrayList.size()) {
                                        l10 = (Long) arrayList.get(i12);
                                    }
                                } else if (i12 >= 0 && i12 < o50Var.W0.invitedUsers.size()) {
                                    l10 = o50Var.W0.invitedUsers.get(i12);
                                }
                                z10 = false;
                            }
                        }
                        if (!z10 && (invitedUser = o50Var.W0.invitedUsersMessageIds.get(l10)) != null) {
                            org.telegram.ui.Components.x60 F = org.telegram.ui.Components.x60.F(o50Var.container, o50Var.resourcesProvider, w3Var);
                            F.l(R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable(o50Var) {
                                public final o50 f38412b;

                                {
                                    this.f38412b = o50Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            o50.r(this.f38412b, invitedUser, l10);
                                            return;
                                        default:
                                            o50.m(this.f38412b, invitedUser, l10);
                                            return;
                                    }
                                }
                            }, invitedUser.isCalling());
                            F.c(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable(o50Var) {
                                public final o50 f38412b;

                                {
                                    this.f38412b = o50Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            o50.r(this.f38412b, invitedUser, l10);
                                            return;
                                        default:
                                            o50.m(this.f38412b, invitedUser, l10);
                                            return;
                                    }
                                }
                            }, false);
                            F.W(org.telegram.ui.ActionBar.f6.c0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), o50Var.f40983y0.getColor()));
                            F.f34580s = 96;
                            F.Z();
                            return;
                        }
                        return;
                    }
                    o50Var.f40898e0.K0(o50Var.currentAccount);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", w3Var.getUser().f22527id);
                    if (w3Var.f25889a.getImageReceiver().hasNotThumb()) {
                        bundle.putBoolean("expandPhoto", true);
                    }
                    o50Var.f40898e0.p0(new ProfileActivity(bundle, null));
                    o50Var.dismiss();
                }
            } else if (i9 == i50Var.f39016w) {
                if (ChatObject.isChannel(o50Var.V0) && (chat = o50Var.V0) != null && !chat.megagroup && ChatObject.isPublic(chat)) {
                    o50Var.j1(false);
                    return;
                }
                TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(o50Var.i1());
                if (chatFull != null) {
                    o50Var.f40956s0 = false;
                    Context context = o50Var.getContext();
                    int currentAccount = accountInstance.getCurrentAccount();
                    TLRPC.Chat chat2 = o50Var.V0;
                    ChatObject.Call call2 = o50Var.W0;
                    org.telegram.ui.Components.b30 b30Var = new org.telegram.ui.Components.b30(context, currentAccount, chat2, chatFull, call2.participants, call2.invitedUsersMap);
                    o50Var.A1 = b30Var;
                    b30Var.setOnDismissListener(new e20(o50Var, 2));
                    org.telegram.ui.Components.b30 b30Var2 = o50Var.A1;
                    b30Var2.f27019c0 = new o20(o50Var);
                    b30Var2.show();
                }
            } else if (i9 == i50Var.f39017x) {
                ChatObject.Call call3 = o50Var.W0;
                if (call3 != null && call3.call != null) {
                    bg.g3 g3Var = new bg.g3(activity, o50Var.currentAccount, null, 4, new ih.j0());
                    ChatObject.Call call4 = o50Var.W0;
                    if (call4 != null) {
                        collection = (Collection) Collection.EL.stream(call4.sortedParticipants).map(new k8(4)).collect(Collectors.toSet());
                    }
                    g3Var.f1796y0.addAll(collection);
                    g3Var.g0(false, true);
                    g3Var.f1794w0 = new b20(o50Var, 3);
                    g3Var.g0(false, true);
                    g3Var.f1797z0 = new bg.y0(20, o50Var, call);
                    g3Var.show();
                }
            } else if (i9 == i50Var.f39018y) {
                o50Var.v1();
            }
        }
    }

    public static void o(o50 o50Var, Activity activity) {
        LaunchActivity launchActivity;
        if (Build.VERSION.SDK_INT >= 23 && (launchActivity = o50Var.f40898e0) != null && launchActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
            o50Var.f40898e0.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
        } else if (VoIPService.getSharedInstance() != null) {
            boolean z10 = false;
            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                o50Var.f40903f0[0].e(1, false);
                if (o50Var.f40968v0 == null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null) {
                        sharedInstance.createCaptureDevice(false);
                    }
                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                        z10 = true;
                    }
                    a40 a40Var = new a40(o50Var, activity, z10);
                    o50Var.f40968v0 = a40Var;
                    a40Var.setBottomPadding(o50Var.containerView.getPaddingBottom());
                    o50Var.container.addView(o50Var.f40968v0);
                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                        return;
                    }
                    return;
                }
                return;
            }
            VoIPService.getSharedInstance().setVideoState(false, 0);
            o50Var.N1(true, false);
            o50Var.M1(false);
            o50Var.W0.sortParticipants();
            o50Var.O0(true);
            o50Var.f40897e.requestLayout();
        }
    }

    public static void p(o50 o50Var, float f10, float f11, float f12, int i9, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        o50Var.Z1 = floatValue;
        o50Var.W1.f33613n = floatValue;
        float f13 = (floatValue * 1.0f) + ((1.0f - floatValue) * f10);
        j30 j30Var = o50Var.f40985y2;
        j30Var.setScaleX(f13);
        j30Var.setScaleY(f13);
        j30Var.setTranslationX((1.0f - o50Var.Z1) * f11);
        j30Var.setTranslationY((1.0f - o50Var.Z1) * f12);
        if (!o50Var.f40891c2) {
            o50Var.S2.setAlpha((int) (o50Var.Z1 * 100.0f));
        }
        org.telegram.ui.Components.voip.t tVar = o50Var.V2;
        if (tVar != null) {
            tVar.f33821a.setRoundCorners((1.0f - o50Var.Z1) * AndroidUtilities.dp(8.0f));
        }
        j30Var.invalidate();
        o50Var.containerView.invalidate();
        i30 i30Var = o50Var.f40883b;
        int i10 = (int) ((1.0f - o50Var.Z1) * i9);
        i30Var.N(i10, i10);
    }

    public static boolean p1(int i9) {
        if ((VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.call.rtmp_stream) && i9 != 2 && i9 != 4 && i9 != 5 && i9 != 6 && i9 != 7) {
            return false;
        }
        return true;
    }

    public static void q(o50 o50Var, ChatObject.Call call, Boolean bool, HashSet hashSet) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        ChatObject.Call call2 = o50Var.W0;
        if (call2 != null && (groupCall = call2.call) != null) {
            String str = groupCall.invite_link;
            int size = hashSet.size();
            AtomicInteger atomicInteger = new AtomicInteger(0);
            HashSet hashSet2 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                o50Var.W0.addInvitedUser(longValue);
                TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                inviteconferencecallparticipant.call = tL_inputGroupCall;
                TLRPC.GroupCall groupCall2 = o50Var.W0.call;
                tL_inputGroupCall.f22397id = groupCall2.f22390id;
                tL_inputGroupCall.access_hash = groupCall2.access_hash;
                inviteconferencecallparticipant.user_id = MessagesController.getInstance(o50Var.currentAccount).getInputUser(longValue);
                inviteconferencecallparticipant.video = bool.booleanValue();
                ConnectionsManager.getInstance(o50Var.currentAccount).sendRequest(inviteconferencecallparticipant, new mh.z0(o50Var, longValue, hashSet2, atomicInteger, size, call, str));
            }
            o50Var.O0(true);
            if (bool.booleanValue() && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(false) != 1) {
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                sharedInstance.requestVideoCall(false);
                sharedInstance.setVideoState(false, 2);
                sharedInstance.setMicMute(false, false, true);
                sharedInstance.switchToSpeaker();
                o50Var.N1(true, true);
            }
        }
    }

    public static void r(o50 o50Var, ChatObject.Call.InvitedUser invitedUser, Long l10) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(o50Var.currentAccount).sendRequest(declineconferencecallinvite, new i20(o50Var, 1));
        ChatObject.Call call = o50Var.W0;
        if (call != null) {
            invitedUser.calling = false;
            call.invitedUsersMessageIds.put(l10, invitedUser);
            o50Var.O0(true);
        }
    }

    public static void s(o50 o50Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(o50Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static void t(o50 o50Var) {
        o50Var.Y0();
        o50Var.V0();
        o50Var.U0();
        o50Var.B.setTranslationY((-o50Var.f40984y1.c()) + o50Var.containerView.getPaddingBottom());
        o50Var.C.invalidate();
        o50Var.Z0();
        o50Var.containerView.invalidate();
    }

    public static void t1(Context context, Runnable runnable, boolean z10, boolean z11) {
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
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertTitle);
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertText);
                } else if (ChatObject.isChannelOrGiga(chat)) {
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.VoipChannelLeaveAlertTitle);
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.VoipChannelLeaveAlertText);
                } else {
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.VoipGroupLeaveAlertTitle);
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.VoipGroupLeaveAlertText);
                }
                sharedInstance.getAccount();
                org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
                LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
                if (!sharedInstance.isConference() || (call != null && (groupCall = call.call) != null && groupCall.creator)) {
                    org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1);
                    z1VarArr[0] = z1Var;
                    z1Var.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
                    if (z10) {
                        z1VarArr[0].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23108j5, false));
                    } else {
                        z1VarArr[0].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23083hg, false));
                        CheckBoxSquare checkBoxSquare = (CheckBoxSquare) z1VarArr[0].getCheckBoxView();
                        int i9 = org.telegram.ui.ActionBar.f6.f23258rg;
                        int i10 = org.telegram.ui.ActionBar.f6.f23220pg;
                        int i11 = org.telegram.ui.ActionBar.f6.f23188ng;
                        checkBoxSquare.f26329s = i9;
                        checkBoxSquare.v = i10;
                        checkBoxSquare.f26330w = i11;
                        checkBoxSquare.invalidate();
                    }
                    z1VarArr[0].setTag(0);
                    if (sharedInstance.isConference()) {
                        z1VarArr[0].e(LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertEndChat), "", false, false, false);
                    } else if (ChatObject.isChannelOrGiga(chat)) {
                        z1VarArr[0].e(LocaleController.getString(R.string.VoipChannelLeaveAlertEndChat), "", false, false, false);
                    } else {
                        z1VarArr[0].e(LocaleController.getString(R.string.VoipGroupLeaveAlertEndChat), "", false, false, false);
                    }
                    org.telegram.ui.Cells.z1 z1Var2 = z1VarArr[0];
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
                    z1Var2.setPadding(dp, 0, dp2, 0);
                    f10.addView(z1VarArr[0], g7.e6.n(-1, -2));
                    z1VarArr[0].setOnClickListener(new c20(z1VarArr, 0));
                }
                alertDialog$Builder.n(f10);
                alertDialog$Builder.f22702a.E = org.telegram.ui.ActionBar.f6.f23220pg;
                alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new c3.g(call, z1VarArr, selfId, runnable, 4));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (z10) {
                    alertDialog$Builder.f22702a.L0 = false;
                }
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                if (z10) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        c2Var.getWindow().setType(2038);
                    } else {
                        c2Var.getWindow().setType(2003);
                    }
                    c2Var.getWindow().clearFlags(2);
                }
                if (!z10) {
                    c2Var.i(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23313ug, false));
                }
                c2Var.show();
                if (!z10) {
                    TextView textView = (TextView) c2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23326vg, false));
                    }
                    c2Var.o(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23083hg, false));
                    return;
                }
                return;
            }
            w1(call, false, selfId, runnable);
        }
    }

    public static void u(o50 o50Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(o50Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static void v(o50 o50Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i9, ChatObject.Call call, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(o50Var.currentAccount).processUpdates(updates, false);
            AndroidUtilities.runOnUIThread(new e5.w(o50Var, updates, j10, 28));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j10));
        }
        if (atomicInteger.incrementAndGet() == i9 && !hashSet.isEmpty()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0(o50Var, hashSet, call, str, 7));
        }
    }

    public static void w(o50 o50Var, HashSet hashSet, ChatObject.Call call, String str) {
        TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long longValue = l10.longValue();
            if (call != null) {
                call.removeInvitedUser(longValue);
            }
            arrayList.add(MessagesController.getInstance(o50Var.currentAccount).getUser(l10));
            getrequirementstocontact.f22587id.add(MessagesController.getInstance(o50Var.currentAccount).getInputUser(longValue));
        }
        hr hrVar = new hr(o50Var, arrayList, arrayList2, arrayList3, str, 8);
        if (UserConfig.getInstance(o50Var.currentAccount).isPremium()) {
            hrVar.run();
        } else {
            ConnectionsManager.getInstance(o50Var.currentAccount).sendRequest(getrequirementstocontact, new y9(arrayList, arrayList2, hrVar, 13));
        }
    }

    public static void w1(ChatObject.Call call, boolean z10, long j10, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z10 ? 1 : 0);
        }
        if (call != null) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(j10);
            if (groupCallParticipant != null) {
                call.participants.e(j10);
                call.sortedParticipants.remove(groupCallParticipant);
                call.visibleParticipants.remove(groupCallParticipant);
                int i9 = 0;
                while (i9 < call.visibleVideoParticipants.size()) {
                    if (MessageObject.getPeerId(call.visibleVideoParticipants.get(i9).participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                        call.visibleVideoParticipants.remove(i9);
                        i9--;
                    }
                    i9++;
                }
                TLRPC.GroupCall groupCall = call.call;
                groupCall.participants_count--;
            }
            for (int i10 = 0; i10 < call.sortedParticipants.size(); i10++) {
                TLRPC.GroupCallParticipant groupCallParticipant2 = call.sortedParticipants.get(i10);
                groupCallParticipant2.lastActiveDate = groupCallParticipant2.lastSpeakTime;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
    }

    public static void x(o50 o50Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        zf.j0 j0Var = new zf.j0(34, o50Var.currentAccount, U.getContext(), U, new ih.j0());
        j0Var.I1(null, arrayList, arrayList2, arrayList3, str);
        j0Var.show();
    }

    public static void y(o50 o50Var, org.telegram.ui.ActionBar.c2[] c2VarArr, boolean z10, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        try {
            c2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        c2VarArr[0] = null;
        if (z10 && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
            o50Var.x1(null, j10, 3);
            return;
        }
        org.telegram.ui.Components.y4.f0(o50Var.currentAccount, tL_error, (org.telegram.ui.ActionBar.o2) o50Var.f40898e0.O().getFragmentStack().get(o50Var.f40898e0.O().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
    }

    public static r0.m1 z(o50 o50Var, r0.m1 m1Var) {
        int keyboardHeight;
        r0.j1 j1Var = m1Var.f46929a;
        i0.b f10 = j1Var.f(647);
        i0.b f11 = j1Var.f(8);
        o30 o30Var = o50Var.D;
        if (!o30Var.J && !o30Var.f33124e) {
            keyboardHeight = 0;
        } else {
            keyboardHeight = o30Var.getKeyboardHeight();
        }
        int max = Math.max(f11.d, keyboardHeight);
        ViewGroup.LayoutParams layoutParams = o50Var.X1.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f10.d;
        }
        if (o30Var.getEmojiView() != null) {
            o30Var.getEmojiView().setBottomInset(f10.d);
        }
        if (o50Var.O2) {
            ViewGroup viewGroup = o50Var.containerView;
            int i9 = o50Var.backgroundPaddingLeft;
            viewGroup.setPadding(i9, 0, i9, 0);
        } else {
            ViewGroup viewGroup2 = o50Var.containerView;
            int i10 = o50Var.backgroundPaddingLeft;
            viewGroup2.setPadding(f10.f10848a + i10, f10.f10849b, i10 + f10.f10850c, f10.d);
        }
        o50Var.containerView.requestLayout();
        if (max == 0 && !o30Var.J && !o30Var.f33124e && !o30Var.K) {
            o30Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.uj0 uj0Var = o50Var.G;
            if (uj0Var == null) {
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                uj0Var = null;
                if (R != null) {
                    org.telegram.ui.Components.uj0 uj0Var2 = new org.telegram.ui.Components.uj0(1, o50Var.currentAccount, o50Var.getContext(), R, o50Var.resourcesProvider);
                    o50Var.G = uj0Var2;
                    uj0Var2.setDelegate(new q40(o50Var));
                    o50Var.containerView.addView(o50Var.G, g7.e6.e(-2, 52, 81));
                    o50Var.G.p(null, null, false);
                    o50Var.C.bringToFront();
                    o50Var.B.bringToFront();
                    uj0Var = o50Var.G;
                }
            }
            o50Var.G = uj0Var;
        }
        o30Var.G(f11.d, false);
        o50Var.f40984y1.i(m1Var);
        return r0.m1.f46928b;
    }

    public static String z0() {
        String[][] strArr = EmojiData.data;
        String[] strArr2 = strArr[(int) Math.floor(Math.random() * strArr.length)];
        return strArr2[(int) Math.floor(Math.random() * strArr2.length)];
    }

    public final void A1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall inputGroupCall;
        long j10;
        this.D.setText("");
        ChatObject.Call call = this.W0;
        if (call != null && call.call != null && (inputGroupCall = call.getInputGroupCall()) != null) {
            ChatObject.Call call2 = this.W0;
            long j11 = call2.call.f22390id;
            TLRPC.Peer peer = call2.selfPeer;
            if (peer != null) {
                j10 = DialogObject.getPeerDialogId(peer);
            } else {
                j10 = UserConfig.getInstance(this.currentAccount).clientUserId;
            }
            GroupCallMessagesController.getInstance(this.currentAccount).sendCallMessage(j10, tL_textWithEntities, j11, inputGroupCall);
        }
    }

    public final void B1(float f10) {
        float f11;
        int i9;
        int i10;
        this.Q1 = f10;
        g30 g30Var = this.W1;
        if (g30Var == null) {
            f11 = 0.0f;
        } else {
            f11 = g30Var.f33600c;
        }
        float max = Math.max(f10, f11);
        int i11 = org.telegram.ui.ActionBar.f6.f23118jg;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.f6.f23065gg;
        int offsetColor = AndroidUtilities.getOffsetColor(w02, org.telegram.ui.ActionBar.f6.w0(null, i12, false), f10, 1.0f);
        this.R1 = offsetColor;
        this.J.setBackgroundColor(offsetColor);
        this.f40908g1.B(-14472653);
        this.f40884b0.setColorFilter(new PorterDuffColorFilter(this.R1, PorterDuff.Mode.MULTIPLY));
        this.navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false), org.telegram.ui.ActionBar.f6.w0(null, i12, false), max, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23136kg, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23295tg, false), f10, 1.0f);
        z40 z40Var = this.f40927l0;
        if (z40Var != null) {
            z40Var.f45029j = offsetColor2;
            fh.l2 l2Var = z40Var.f45027g;
            if (l2Var != null) {
                l2Var.invalidate();
            }
        }
        this.f40983y0.setColor(offsetColor2);
        this.A.setColor(offsetColor2);
        this.B.invalidate();
        u40 u40Var = this.M;
        u40Var.setGlowColor(offsetColor2);
        int i13 = this.B1;
        if (i13 == 3 || p1(i13)) {
            this.f40972w.invalidate();
        }
        View view = this.F2;
        if (view != null) {
            int i14 = this.R1;
            int[] iArr = this.I2;
            iArr[0] = i14;
            iArr[1] = 0;
            if (Build.VERSION.SDK_INT > 29) {
                this.H2.setColors(iArr);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
                this.H2 = gradientDrawable;
                view.setBackground(gradientDrawable);
            }
            this.G2.setBackgroundColor(iArr[0]);
        }
        int offsetColor3 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Dg, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Eg, false), f10, 1.0f);
        this.f40955s.a(offsetColor3, offsetColor3);
        int offsetColor4 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23154lg, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23203og, false), f10, 1.0f);
        int offsetColor5 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23170mg, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23258rg, false), f10, 1.0f);
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, this.resourcesProvider);
        int childCount = u40Var.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = u40Var.getChildAt(i15);
            if (childAt instanceof org.telegram.ui.Cells.x3) {
                org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) childAt;
                if (o1()) {
                    x3Var.a(v02, v02);
                } else {
                    x3Var.a(offsetColor5, offsetColor4);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.e4;
                k40 k40Var = this.K;
                if (z10) {
                    org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) childAt;
                    if (k40Var.getTag() != null) {
                        i10 = org.telegram.ui.ActionBar.f6.f23258rg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.f6.f23170mg;
                    }
                    e4Var.f(i10, offsetColor5);
                } else if (childAt instanceof org.telegram.ui.Cells.w3) {
                    org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) childAt;
                    if (k40Var.getTag() != null) {
                        i9 = org.telegram.ui.ActionBar.f6.f23258rg;
                    } else {
                        i9 = org.telegram.ui.ActionBar.f6.f23170mg;
                    }
                    w3Var.a(i9, offsetColor5);
                }
            }
        }
        this.containerView.invalidate();
        u40Var.invalidate();
        this.container.invalidate();
    }

    public final void C1(float f10) {
        u40 u40Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        f2.q1 K;
        f10 = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) ? 0.0f : 0.0f;
        float min = (float) (Math.min(8500.0d, 4000.0f * f10) / 8500.0d);
        this.L0 = min;
        this.M0 = (min - this.K0) / 265.0f;
        ChatObject.Call call = this.W0;
        if (call != null && (u40Var = this.M) != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(MessageObject.getPeerId(this.f40973w0))) != null) {
            g30 g30Var = this.W1;
            if (!g30Var.f33598b) {
                if (this.f40938o0) {
                    arrayList = this.f40987z0;
                } else {
                    arrayList = this.W0.visibleParticipants;
                }
                int indexOf = arrayList.indexOf(groupCallParticipant);
                if (indexOf >= 0 && (K = u40Var.K(indexOf + this.L.d)) != null) {
                    View view = K.f5501a;
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        ((org.telegram.ui.Cells.e4) view).setAmplitude(f10 * 15.0f);
                        if (view == this.T2 && !this.f40913h2) {
                            this.containerView.invalidate();
                        }
                    }
                }
            } else {
                int i9 = 0;
                while (true) {
                    c30 c30Var = this.f40917i2;
                    if (i9 >= c30Var.getChildCount()) {
                        break;
                    }
                    org.telegram.ui.Components.b20 b20Var = (org.telegram.ui.Components.b20) c30Var.getChildAt(i9);
                    if (MessageObject.getPeerId(b20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                        b20Var.setAmplitude(f10 * 15.0f);
                    }
                    i9++;
                }
            }
            g30Var.k(groupCallParticipant, f10 * 15.0f);
        }
    }

    public final void D1(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24) {
        this.f40892c3 = i9;
        this.f40896d3 = i10;
        this.f40901e3 = i11;
        this.f40906f3 = i12;
        this.f40910g3 = i13;
        this.f40914h3 = i14;
        this.f40918i3 = i15;
        this.f40922j3 = i16;
        this.f40926k3 = i17;
        this.f40929l3 = i18;
        this.f40932m3 = i19;
        this.f40937n3 = i20;
        this.f40941o3 = i21;
        this.f40945p3 = i22;
        this.f40949q3 = i23;
        this.f40954r3 = i24;
    }

    public final void E1(float f10) {
        u40 u40Var;
        int dp;
        int i9;
        float f11;
        this.f40964u0 = f10;
        this.M.setTopGlowOffset((int) (f10 - ((FrameLayout.LayoutParams) u40Var.getLayoutParams()).topMargin));
        float dp2 = f10 - AndroidUtilities.dp(74.0f);
        d50 d50Var = this.Q0;
        g30 g30Var = this.W1;
        a30 a30Var = this.f40885b1;
        y20 y20Var = this.f40882a1;
        if (this.backgroundPaddingTop + dp2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) - dp2) - this.backgroundPaddingTop) / (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f))));
            if (AndroidUtilities.isTablet()) {
                f11 = 17.0f;
            } else {
                f11 = 13.0f;
            }
            i9 = (int) (AndroidUtilities.dp(f11) * min);
            if (d50Var != null) {
                d50Var.setShadowOffset((int) (AndroidUtilities.dp(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.Q1) > 1.0E-4f) {
                B1(Math.min(1.0f, min));
            }
            float f12 = 1.0f - ((0.1f * min) * 1.2f);
            y20Var.setScaleX(Math.max(0.9f, f12));
            y20Var.setScaleY(Math.max(0.9f, f12));
            float f13 = 1.0f - (min * 1.2f);
            y20Var.setAlpha((1.0f - g30Var.f33600c) * Math.max(0.0f, f13));
            a30Var.setScaleX(Math.max(0.9f, f12));
            a30Var.setScaleY(Math.max(0.9f, f12));
            a30Var.setAlpha((1.0f - g30Var.f33600c) * Math.max(0.0f, f13));
        } else {
            y20Var.setScaleX(1.0f);
            y20Var.setScaleY(1.0f);
            y20Var.setAlpha(1.0f - g30Var.f33600c);
            a30Var.setScaleX(1.0f);
            a30Var.setScaleY(1.0f);
            a30Var.setAlpha(1.0f - g30Var.f33600c);
            if (this.Q1 > 1.0E-4f) {
                B1(0.0f);
            }
            i9 = 0;
        }
        Y0();
        float f14 = i9;
        this.f40969v1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f10 - AndroidUtilities.dp(53.0f)) - f14));
        this.f40904f1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f10 - AndroidUtilities.dp(44.0f)) - f14));
        if (d50Var != null) {
            d50Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), f10 - AndroidUtilities.dp(37.0f)));
        }
        x30 x30Var = this.N;
        if (x30Var != null) {
            x30Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f10 - AndroidUtilities.dp(44.0f)) - f14));
        }
        this.containerView.invalidate();
        Q1();
    }

    public final boolean F1(android.view.View r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o50.F1(android.view.View):boolean");
    }

    public final void G1(View view) {
        if (this.f40915i0 == null) {
            org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(8, getContext(), null, true);
            this.f40915i0 = s30Var;
            s30Var.setAlpha(0.0f);
            this.f40915i0.setVisibility(4);
            this.f40915i0.setShowingDuration(3000L);
            this.containerView.addView(this.f40915i0, g7.e6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            if (ChatObject.isChannelOrGiga(this.V0)) {
                this.f40915i0.setText(LocaleController.getString(R.string.VoipChannelRecording));
            } else {
                this.f40915i0.setText(LocaleController.getString(R.string.VoipGroupRecording));
            }
            this.f40915i0.d();
        }
        this.f40915i0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        this.f40915i0.f(view, true);
    }

    public final void H1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        ChatObject.Call call = this.W0;
        org.telegram.ui.Components.voip.u2 u2Var = this.v;
        org.telegram.ui.Components.voip.u2 u2Var2 = this.h;
        org.telegram.ui.Components.voip.u2 u2Var3 = this.f40950r;
        org.telegram.ui.Components.voip.u2 u2Var4 = this.f40902f;
        org.telegram.ui.Components.voip.u2 u2Var5 = this.f40933n;
        org.telegram.ui.Components.voip.u2 u2Var6 = this.f40955s;
        org.telegram.ui.Components.voip.u2 u2Var7 = this.f40972w;
        boolean z19 = true;
        s20 s20Var = this.f40897e;
        boolean z20 = false;
        if (call != null && !call.isScheduled()) {
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.W0.participants.f(MessageObject.getPeerId(this.f40973w0));
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !Q0()) {
                z14 = true;
            } else {
                z14 = false;
            }
            Boolean bool = this.f40963t3;
            if (bool != null) {
                z15 = bool.booleanValue();
            } else {
                TLRPC.GroupCall groupCall = this.W0.call;
                if (groupCall != null && groupCall.messages_enabled) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            if (((!z14 && this.W0.canRecordVideo()) || z13) && !r1()) {
                z16 = true;
            } else {
                z20 = true;
                z16 = false;
            }
            if (z13) {
                z17 = false;
                z18 = true;
            } else {
                z17 = !z14;
                z18 = false;
            }
            if (B3) {
                z17 = false;
                z18 = false;
            }
            s20Var.c(u2Var7, true, z10);
            s20Var.c(u2Var6, true, z10);
            s20Var.c(u2Var5, z16, z10);
            s20Var.c(u2Var4, z18, z10);
            s20Var.c(u2Var3, z20, z10);
            s20Var.c(u2Var2, z17, z10);
            s20Var.c(u2Var, z15, z10);
            return;
        }
        if (this.R0 > 0.1f) {
            z11 = true;
        } else {
            z11 = false;
        }
        s20Var.c(u2Var7, z11, z10);
        if (this.R0 > 0.1f) {
            z12 = true;
        } else {
            z12 = false;
        }
        s20Var.c(u2Var6, z12, z10);
        if (this.R0 <= 0.1f) {
            z19 = false;
        }
        s20Var.c(u2Var3, z19, z10);
        s20Var.c(u2Var5, false, z10);
        s20Var.c(u2Var4, false, z10);
        s20Var.c(u2Var2, false, z10);
        s20Var.c(u2Var, false, z10);
    }

    public final void I1() {
        int i9;
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        TLObject chat;
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        int i12;
        int i13;
        TLRPC.Chat chat2;
        TLRPC.Chat chat3;
        ChatObject.Call call2 = this.W0;
        org.telegram.ui.ActionBar.w0 w0Var = this.f40908g1;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f40916i1;
        if (call2 == null || call2.isScheduled()) {
            this.f40912h1.setVisibility(4);
            w0Var2.setVisibility(8);
            if (this.W0 == null) {
                w0Var.setVisibility(8);
                return;
            }
        }
        if (this.f40911h0) {
            return;
        }
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat4 = accountInstance.getMessagesController().getChat(Long.valueOf(i1()));
        if (chat4 != null) {
            this.V0 = chat4;
        }
        boolean canUserDoAdminAction = ChatObject.canUserDoAdminAction(this.V0, 3);
        org.telegram.ui.ActionBar.g1 g1Var = this.f40920j1;
        if (!canUserDoAdminAction && (((ChatObject.isChannel(this.V0) && ((chat3 = this.V0) == null || !chat3.megagroup)) || (!ChatObject.isPublic(this.V0) && !ChatObject.canUserDoAdminAction(this.V0, 3))) && (!ChatObject.isChannel(this.V0) || (chat2 = this.V0) == null || chat2.megagroup || !ChatObject.isPublic(chat2)))) {
            g1Var.setVisibility(8);
        } else {
            g1Var.setVisibility(0);
        }
        ChatObject.Call call3 = this.W0;
        org.telegram.ui.ActionBar.g1 g1Var2 = this.f40965u1;
        org.telegram.ui.ActionBar.g1 g1Var3 = this.f40961t1;
        if (call3 != null && (groupCall2 = call3.call) != null && groupCall2.can_change_messages_enabled) {
            if (groupCall2.messages_enabled) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            g1Var3.setVisibility(i12);
            if (this.W0.call.messages_enabled) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            g1Var2.setVisibility(i13);
        } else {
            g1Var3.setVisibility(8);
            g1Var2.setVisibility(8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.W0.participants.f(MessageObject.getPeerId(this.f40973w0));
        ChatObject.Call call4 = this.W0;
        org.telegram.ui.ActionBar.g1 g1Var4 = this.f40930m1;
        if (call4 != null && !call4.isScheduled() && (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            g1Var4.setVisibility(0);
        } else {
            g1Var4.setVisibility(8);
        }
        if (SharedConfig.noiseSupression) {
            i9 = R.drawable.msg_noise_on;
        } else {
            i9 = R.drawable.msg_noise_off;
        }
        g1Var4.setIcon(i9);
        if (SharedConfig.noiseSupression) {
            i10 = R.string.VoipNoiseCancellationEnabled;
        } else {
            i10 = R.string.VoipNoiseCancellationDisabled;
        }
        g1Var4.setSubtext(LocaleController.getString(i10));
        boolean Q0 = Q0();
        org.telegram.ui.ActionBar.g1 g1Var5 = this.f40957s1;
        org.telegram.ui.ActionBar.g1 g1Var6 = this.f40924k1;
        boolean z12 = true;
        org.telegram.ui.ActionBar.g1 g1Var7 = this.f40939o1;
        org.telegram.ui.ActionBar.g1 g1Var8 = this.f40943p1;
        if (Q0) {
            g1Var5.setVisibility(0);
            g1Var6.setVisibility(0);
            if (r1()) {
                g1Var7.setVisibility(0);
                g1Var8.setVisibility(8);
            } else if (this.W0.isScheduled()) {
                g1Var7.setVisibility(8);
                g1Var8.setVisibility(8);
            } else {
                g1Var7.setVisibility(0);
            }
            if (o1()) {
                g1Var7.setVisibility(8);
                g1Var6.setVisibility(8);
            }
            if (this.W0.canRecordVideo() && !this.W0.isScheduled() && !r1()) {
                g1Var8.setVisibility(0);
            } else {
                g1Var8.setVisibility(8);
            }
            w0Var2.setVisibility(8);
            boolean z13 = this.W0.recording;
            j50 j50Var = this.Z0;
            j50Var.f39378f = z13;
            j50Var.d = 1.0f;
            j50Var.invalidateSelf();
            if (this.W0.recording) {
                if (this.f40988z1 == null) {
                    b20 b20Var = new b20(this, 6);
                    this.f40988z1 = b20Var;
                    AndroidUtilities.runOnUIThread(b20Var, 1000L);
                }
                g1Var7.setText(LocaleController.getString(R.string.VoipGroupStopRecordCall));
            } else {
                b20 b20Var2 = this.f40988z1;
                if (b20Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(b20Var2);
                    this.f40988z1 = null;
                }
                g1Var7.setText(LocaleController.getString(R.string.VoipGroupRecordCall));
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                g1Var8.g(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
            } else {
                g1Var8.g(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
            }
            K1();
        } else {
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !Q0()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z10 && ((this.W0.canRecordVideo() || z11) && !this.W0.isScheduled() && !r1())) {
                if (z11) {
                    w0Var2.setVisibility(8);
                    g1Var8.setVisibility(0);
                    g1Var8.g(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
                    g1Var8.setContentDescription(LocaleController.getString(R.string.VoipChatStopScreenCapture));
                } else {
                    g1Var8.g(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
                    g1Var8.setContentDescription(LocaleController.getString(R.string.VoipChatStartScreenCapture));
                    w0Var2.setVisibility(8);
                    g1Var8.setVisibility(0);
                }
            } else {
                w0Var2.setVisibility(8);
                g1Var8.setVisibility(8);
            }
            g1Var5.setVisibility(8);
            g1Var6.setVisibility(8);
            g1Var7.setVisibility(8);
        }
        boolean Q02 = Q0();
        org.telegram.ui.ActionBar.g1 g1Var9 = this.f40935n1;
        if (Q02 && this.W0.call.can_change_join_muted && !o1()) {
            g1Var9.setVisibility(0);
        } else {
            g1Var9.setVisibility(8);
        }
        if (o1() && ((call = this.W0) == null || (groupCall = call.call) == null || !groupCall.creator)) {
            z12 = false;
        }
        w0Var.I(4, z12);
        if (r1() && !this.W0.isScheduled()) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        this.l1.setVisibility(i11);
        int visibility = g1Var6.getVisibility();
        TextView textView = this.f40974w1;
        if (visibility != 0 && g1Var9.getVisibility() != 0 && g1Var.getVisibility() != 0 && g1Var8.getVisibility() != 0 && g1Var7.getVisibility() != 0 && g1Var5.getVisibility() != 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.f40907g0;
        if (((sharedInstance != null && VoIPService.getSharedInstance().hasFewPeers) || this.X0) && !r1() && this.f40973w0 != null) {
            kVar.setVisibility(0);
            long peerId = MessageObject.getPeerId(this.f40973w0);
            if (DialogObject.isUserDialog(peerId)) {
                chat = accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
            } else {
                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
            }
            kVar.setObject(chat);
        } else {
            kVar.setVisibility(8);
        }
        TLRPC.Chat chat5 = this.V0;
        if (chat5 != null && !ChatObject.isChannelOrGiga(chat5) && r1() && g1Var.getVisibility() == 8) {
            w0Var.setVisibility(8);
        } else {
            w0Var.setVisibility(0);
        }
        LinearLayout linearLayout = this.f40904f1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f10 = 96;
        if (layoutParams.rightMargin != AndroidUtilities.dp(f10)) {
            layoutParams.rightMargin = AndroidUtilities.dp(f10);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.f40969v1.getLayoutParams()).rightMargin = 0;
        this.K.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 2) {
            Y0();
            W0();
            X0();
            float f12 = 1.0f - this.f40971v3.f47775e;
            s20 s20Var = this.f40897e;
            s20Var.setAlpha(f12);
            this.W1.setProgressToHideUi(f10);
            this.f40917i2.invalidate();
            this.containerView.invalidate();
            s20Var.invalidate();
        }
        if (i9 == 3) {
            Z0();
            Y0();
            a1();
            V0();
            this.containerView.invalidate();
        }
        if (i9 == 4) {
            Y0();
            this.C.invalidate();
            this.D.invalidate();
        }
        if (i9 == 5) {
            Y0();
            this.containerView.invalidate();
        }
    }

    public final void J1(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o50.J1(int, boolean):void");
    }

    public final void K1() {
        if (this.W0 == null) {
            return;
        }
        int currentTime = this.d.getConnectionsManager().getCurrentTime();
        ChatObject.Call call = this.W0;
        int i9 = currentTime - call.call.record_start_date;
        boolean z10 = call.recording;
        org.telegram.ui.ActionBar.g1 g1Var = this.f40939o1;
        if (z10) {
            g1Var.setSubtext(AndroidUtilities.formatDuration(i9, false));
        } else {
            g1Var.setSubtext(null);
        }
    }

    public final void L1(boolean z10) {
        float interpolation;
        float f10;
        x30 x30Var = this.N;
        if ((x30Var == null || this.W0 != null) && this.T0 == null) {
            this.S0 = 1.0f;
            this.R0 = 1.0f;
            if (x30Var == null) {
                return;
            }
        }
        int i9 = 4;
        if (!z10) {
            w20 w20Var = this.f40958s2;
            AndroidUtilities.cancelRunOnUIThread(w20Var);
            w20Var.run();
            ChatObject.Call call = this.W0;
            u40 u40Var = this.M;
            if (call != null && !call.isScheduled()) {
                u40Var.setVisibility(0);
            } else {
                u40Var.setVisibility(4);
            }
            boolean isChannelOrGiga = ChatObject.isChannelOrGiga(this.V0);
            org.telegram.ui.ActionBar.g1 g1Var = this.f40957s1;
            if (isChannelOrGiga) {
                g1Var.setText(LocaleController.getString(R.string.VoipChannelCancelChat));
            } else {
                g1Var.setText(LocaleController.getString(R.string.VoipGroupCancelChat));
            }
        }
        float f11 = this.R0;
        if (f11 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.gr.f28844f.getInterpolation((f11 - 0.6f) / 0.4f) * 0.05f);
            this.S0 = 1.0f;
            f10 = 1.0f;
        } else {
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f28844f;
            this.S0 = grVar.getInterpolation(f11 / 0.6f);
            interpolation = 1.05f * grVar.getInterpolation(this.R0 / 0.6f);
            f10 = this.R0 / 0.6f;
        }
        H1(true);
        float f12 = 1.0f - f10;
        x30Var.setAlpha(f12);
        this.Q.setAlpha(f10);
        this.S.setAlpha(f10);
        t40 t40Var = this.R;
        t40Var.setAlpha(f10);
        t40Var.setScaleX(interpolation);
        t40Var.setScaleY(interpolation);
        v30 v30Var = this.P;
        v30Var.setScaleX(f12);
        v30Var.setScaleY(f12);
        v30Var.setAlpha(f12);
        this.O.setAlpha(f12);
        this.f40908g1.setAlpha(f10);
        if (f12 != 0.0f) {
            i9 = 0;
        }
        if (i9 != x30Var.getVisibility()) {
            x30Var.setVisibility(i9);
            v30Var.setVisibility(i9);
        }
    }

    public final void M1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i9;
        org.telegram.ui.Components.voip.u2 u2Var = this.f40950r;
        if (u2Var != null && u2Var.getVisibility() == 0) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            s20 s20Var = this.f40897e;
            boolean z14 = false;
            if (sharedInstance != null && !r1()) {
                sg.a aVar = (sg.a) s20Var.f47579c.get(u2Var);
                if (aVar != null) {
                    aVar.d.a(true, z10);
                    u2Var.setEnabled(true);
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
                    u2Var.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z10);
                } else if (z13) {
                    u2Var.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
                } else if (sharedInstance.isHeadsetPlugged()) {
                    u2Var.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z10);
                } else {
                    u2Var.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
                }
                u2Var.b(z13, z10);
                h1();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.isBluetoothHeadsetConnected()) {
                    i9 = R.drawable.filled_calls_bluetooth_s;
                } else {
                    i9 = R.drawable.filled_sound_on;
                }
                if (this.W != i9) {
                    this.W = i9;
                    AndroidUtilities.updateImageViewImageAnimated(this.X, i9);
                }
                org.telegram.ui.Components.voip.u2 u2Var2 = this.h;
                if (u2Var2.getVisibility() == 0) {
                    u2Var2.c(0, -1, 0, 1.0f, true, f1(h1()), false, z10);
                    if (h1() != 1) {
                        z14 = true;
                    }
                    u2Var2.b(z14, z10);
                    return;
                }
                return;
            }
            u2Var.c(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipChatShare), false, z10);
            if (!ChatObject.isPublic(this.V0) && (!ChatObject.hasAdminRights(this.V0) || !ChatObject.canAddUsers(this.V0))) {
                z11 = false;
            } else {
                z11 = true;
            }
            sg.a aVar2 = (sg.a) s20Var.f47579c.get(u2Var);
            if (aVar2 != null) {
                aVar2.d.a(z11, z10);
                u2Var.setEnabled(z11);
            }
            u2Var.b(true, false);
        }
    }

    public final void N1(boolean r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o50.N1(boolean, boolean):void");
    }

    public final void O0(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o50.O0(boolean):void");
    }

    public final void O1() {
        boolean z10;
        String str;
        float f10;
        float f11;
        m50 m50Var;
        TLRPC.User user;
        TLRPC.Chat chat;
        k40 k40Var = this.K;
        if (k40Var != null && this.W0 != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            int i9 = 0;
            for (int i10 = 0; i10 < this.W0.currentSpeakingPeers.m(); i10++) {
                long j10 = this.W0.currentSpeakingPeers.j(i10);
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.W0.currentSpeakingPeers.f(j10);
                if (!groupCallParticipant.self) {
                    g30 g30Var = this.W1;
                    g30Var.getClass();
                    if (g30Var.f33625w.get(MessageObject.getPeerId(groupCallParticipant.peer)) <= 0 && this.f40980x2.get(j10, 0) != 1) {
                        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                        if (spannableStringBuilder == null) {
                            spannableStringBuilder = new SpannableStringBuilder();
                        }
                        if (i9 < 2) {
                            int i11 = (peerId > 0L ? 1 : (peerId == 0L ? 0 : -1));
                            if (i11 > 0) {
                                user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId));
                            } else {
                                user = null;
                            }
                            if (i11 <= 0) {
                                chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(peerId));
                            } else {
                                chat = null;
                            }
                            if (user != null || chat != null) {
                                if (i9 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (user != null) {
                                    spannableStringBuilder.append(UserObject.getFirstName(user), new org.telegram.ui.Components.i41(AndroidUtilities.bold()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.i41(AndroidUtilities.bold()), 0);
                                }
                            }
                        }
                        i9++;
                        if (i9 == 2) {
                            break;
                        }
                    }
                }
            }
            if (i9 > 0) {
                String pluralString = LocaleController.getPluralString("MembersAreSpeakingToast", i9);
                int indexOf = pluralString.indexOf("un1");
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(pluralString);
                spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
                k40Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.h5 subtitleTextView = k40Var.getSubtitleTextView();
            if (r1()) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            int i12 = this.W0.call.participants_count;
            i50 i50Var = this.L;
            subtitleTextView.k(LocaleController.formatPluralString(str, i12 + ((i50Var.I.r1() || i50Var.H || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined()), new Object[0]));
            if (r1() && (m50Var = this.f40979x1) != null) {
                m50Var.setWatchersCount(this.W0.call.participants_count);
            }
            if (z10 != this.f40948q2) {
                this.f40948q2 = z10;
                k40Var.invalidate();
                float f12 = 0.0f;
                k40Var.getSubtitleTextView().setPivotX(0.0f);
                k40Var.getSubtitleTextView().setPivotY(k40Var.getMeasuredHeight() >> 1);
                ViewPropertyAnimator animate = k40Var.getSubtitleTextView().animate();
                if (this.f40948q2) {
                    f10 = 0.98f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f10);
                if (this.f40948q2) {
                    f11 = 0.9f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f11);
                if (!this.f40948q2) {
                    f12 = 1.0f;
                }
                scaleY.alpha(f12).setDuration(150L);
                AndroidUtilities.updateViewVisibilityAnimated(k40Var.getAdditionalSubtitleTextView(), this.f40948q2);
            }
        }
    }

    public final int P0() {
        u40 u40Var = this.M;
        int childCount = u40Var.getChildCount();
        int i9 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = u40Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 0) {
                i9 = Math.min(i9, childAt.getTop());
            }
        }
        return i9;
    }

    public final void P1(boolean z10) {
        ChatObject.Call call = this.W0;
        y20 y20Var = this.f40882a1;
        if (call == null) {
            if (ChatObject.isChannelOrGiga(this.V0)) {
                y20Var.b(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), z10);
                return;
            } else {
                y20Var.b(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), z10);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(call.call.title);
        k40 k40Var = this.K;
        if (!isEmpty) {
            if (!this.W0.call.title.equals(k40Var.getTitle())) {
                if (z10) {
                    this.K.I(this.W0.call.title, true, 180L, null);
                    k40Var.getTitleTextView().setOnClickListener(new z10(this, 8));
                } else {
                    k40Var.setTitle(this.W0.call.title);
                }
                y20Var.b(this.W0.call.title, z10);
            }
        } else {
            TLRPC.Chat chat = this.V0;
            if (chat != null && !chat.title.equals(k40Var.getTitle())) {
                if (z10) {
                    this.K.I(this.V0.title, true, 180L, null);
                    k40Var.getTitleTextView().setOnClickListener(new z10(this, 9));
                } else {
                    k40Var.setTitle(this.V0.title);
                }
                if (ChatObject.isChannelOrGiga(this.V0)) {
                    if (r1()) {
                        y20Var.b(this.V0.title, z10);
                    } else {
                        y20Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), z10);
                    }
                } else {
                    y20Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), z10);
                }
            } else if (this.V0 == null) {
                k40Var.setTitle(LocaleController.getString(R.string.ConferenceChat));
                y20Var.b(LocaleController.getString(R.string.ConferenceChat), z10);
            }
        }
        org.telegram.ui.ActionBar.h5 titleTextView = k40Var.getTitleTextView();
        if (this.W0.recording) {
            if (titleTextView.getRightDrawable() == null) {
                titleTextView.i(new k50(titleTextView));
                TextView textView = y20Var.getTextView();
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new k50(textView), (Drawable) null);
                TextView nextTextView = y20Var.getNextTextView();
                nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new k50(nextTextView), (Drawable) null);
            }
        } else if (titleTextView.getRightDrawable() != null) {
            titleTextView.i(null);
            y20Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            y20Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final boolean Q0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            ChatObject.Call call = this.W0;
            if (call != null && (groupCall = call.call) != null && groupCall.creator) {
                return true;
            }
            return false;
        }
        return ChatObject.canManageCalls(this.V0);
    }

    public final void Q1() {
        float f10;
        org.telegram.ui.Components.lb lbVar;
        boolean z10;
        if (this.topBulletinContainer != null) {
            int dp = AndroidUtilities.dp(74.0f);
            float f11 = this.f40964u0 - dp;
            if (this.backgroundPaddingTop + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                int dp2 = (dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f);
                f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - this.backgroundPaddingTop) / dp2);
                f11 -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp2) * f10);
            } else {
                f10 = 0.0f;
            }
            float paddingTop = f11 + this.containerView.getPaddingTop();
            FrameLayout frameLayout = this.topBulletinContainer;
            k40 k40Var = this.K;
            frameLayout.setTranslationY(AndroidUtilities.lerp(((-frameLayout.getTop()) - this.topBulletinContainer.getHeight()) + paddingTop + AndroidUtilities.dp(10.0f), k40Var.getY() + (-this.topBulletinContainer.getTop()) + k40Var.getHeight(), f10));
            org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f28729w;
            if (gcVar != null && (lbVar = gcVar.f28733e) != null && lbVar.getParent() != null && lbVar.getParent().getParent() == this.topBulletinContainer) {
                if (f10 > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                lbVar.setTop(z10);
            }
        }
    }

    public final void R0() {
        if (this.N1) {
            this.N1 = false;
            AndroidUtilities.cancelRunOnUIThread(this.f40966u2);
        }
        if (this.O1) {
            this.O1 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.f40972w.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void S0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o50.S0():void");
    }

    public final void T0() {
        this.B.setTranslationY((-this.f40984y1.c()) + this.containerView.getPaddingBottom());
        this.C.invalidate();
        Z0();
        Y0();
        W0();
        X0();
        a1();
        this.f40897e.setAlpha(1.0f - this.f40971v3.f47775e);
        U0();
        V0();
    }

    public final void U0() {
        int i9;
        float f10 = this.f40984y1.f49442b.f47800a;
        if (f10 > 0.0f) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        r30 r30Var = this.B;
        r30Var.setAlpha(f10);
        q30 q30Var = this.C;
        q30Var.setAlpha(f10);
        if (r30Var.getVisibility() != i9) {
            r30Var.setVisibility(i9);
            q30Var.setVisibility(i9);
            if (i9 == 8) {
                o30 o30Var = this.D;
                if (o30Var.isFocused()) {
                    o30Var.clearFocus();
                }
            }
        }
    }

    public final void V0() {
        int i9;
        org.telegram.ui.Components.uj0 uj0Var = this.G;
        if (uj0Var != null) {
            float f10 = this.f40984y1.f49442b.f47800a * this.f40976w3.f47775e;
            uj0Var.setAlpha(f10);
            if (f10 > 0.0f) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            if (this.G.getVisibility() != i9) {
                this.G.setVisibility(i9);
                if (i9 == 8) {
                    this.G.n();
                }
            }
            org.telegram.ui.Components.uj0 uj0Var2 = this.G;
            if (!uj0Var2.J0 && f10 == 1.0f) {
                uj0Var2.J0 = true;
            }
        }
    }

    public final void W0() {
        boolean z10 = C3;
        s20 s20Var = this.f40897e;
        if (z10) {
            s20Var.setTranslationX(0.0f);
            s20Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = B3;
        td.a aVar = this.f40971v3;
        if (z11) {
            s20Var.setTranslationX(aVar.f47775e * AndroidUtilities.dp(94.0f));
            s20Var.setTranslationY(0.0f);
            return;
        }
        s20Var.setTranslationX(0.0f);
        s20Var.setTranslationY(aVar.f47775e * AndroidUtilities.dp(94.0f));
    }

    public final void X0() {
        boolean z10 = C3;
        c30 c30Var = this.f40917i2;
        if (z10) {
            c30Var.setTranslationX(0.0f);
            c30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = B3;
        td.a aVar = this.f40971v3;
        if (z11) {
            c30Var.setTranslationX(aVar.f47775e * AndroidUtilities.dp(94.0f));
            c30Var.setTranslationY(0.0f);
            return;
        }
        c30Var.setTranslationX(0.0f);
        c30Var.setTranslationY(aVar.f47775e * AndroidUtilities.dp(94.0f));
    }

    public final void Y0() {
        float dp;
        float f10 = this.f40981x3.f47780e;
        xg.i iVar = this.f40984y1;
        float f11 = -((iVar.c() - this.containerView.getPaddingBottom()) + f10 + (AndroidUtilities.dp(68.0f) * this.f40976w3.f47775e) + AndroidUtilities.dp(10.0f));
        if (C3) {
            dp = (1.0f - this.f40986y3.f47775e) * AndroidUtilities.dp(-91.0f);
        } else if (B3) {
            dp = 0.0f;
        } else {
            dp = ((this.f40971v3.f47775e * AndroidUtilities.dp(94.0f)) - (AndroidUtilities.dp(104.0f) * this.W1.f33600c)) - AndroidUtilities.dp(91.0f);
        }
        float lerp = AndroidUtilities.lerp(dp, f11, iVar.f49442b.f47800a);
        float measuredHeight = ((this.containerView.getMeasuredHeight() - this.f40964u0) + lerp) - this.backgroundPaddingTop;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - AndroidUtilities.dp(250.0f));
        tg.i iVar2 = this.Y;
        iVar2.setTranslationY(lerp);
        iVar2.setVisibleHeight((int) max);
    }

    public final void Z0() {
        if (this.G != null) {
            this.G.setTranslationY((-this.f40984y1.c()) + this.containerView.getPaddingBottom() + ((-this.f40976w3.f47775e) * AndroidUtilities.dp(64.0f)));
        }
    }

    public final void a1() {
        boolean z10;
        float f10 = this.f40976w3.f47775e;
        float lerp = AndroidUtilities.lerp(0.25f, 1.0f, f10);
        ImageView imageView = this.F;
        imageView.setScaleX(lerp);
        imageView.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f10));
        imageView.setAlpha(f10);
        boolean z11 = false;
        if (f10 > 0.9f) {
            z10 = true;
        } else {
            z10 = false;
        }
        imageView.setClickable(z10);
        float f11 = 1.0f - f10;
        float lerp2 = AndroidUtilities.lerp(0.25f, 1.0f, f11);
        ImageView imageView2 = this.E;
        imageView2.setScaleX(lerp2);
        imageView2.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f11));
        imageView2.setAlpha(f11);
        if (f11 > 0.9f) {
            z11 = true;
        }
        imageView2.setClickable(z11);
    }

    public final void b1() {
        org.telegram.ui.Components.voip.t tVar = this.V2;
        if (tVar != null) {
            tVar.f33821a.setRoundCorners(AndroidUtilities.dp(8.0f));
            org.telegram.ui.Components.voip.t tVar2 = this.V2;
            tVar2.h = false;
            tVar2.j(false);
            this.V2.invalidate();
            this.W1.invalidate();
        }
        org.telegram.ui.Cells.e4 e4Var = this.T2;
        if (e4Var != null && !this.X2 && e4Var.getParent() != null) {
            this.containerView.removeView(this.T2);
        }
        org.telegram.ui.Cells.e4 e4Var2 = this.T2;
        if (e4Var2 != null) {
            e4Var2.setProgressToAvatarPreview(0.0f);
            this.T2.setAboutVisible(false);
            this.T2.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.b20 b20Var = this.W2;
        if (b20Var != null) {
            b20Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.T2 = null;
        this.U2 = null;
        this.W2 = null;
        this.V2 = null;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return !this.W1.f33598b;
    }

    public final void d1(boolean z10) {
        if (!this.Y2 && this.f40886b2) {
            if (z10) {
                this.Y2 = true;
                y1(false, this.T2);
                return;
            }
            b1();
            this.containerView.removeView(this.a2);
            this.a2 = null;
            this.f40985y2.setVisibility(8);
            this.containerView.invalidate();
            this.f40886b2 = false;
            this.U.X = true;
            this.M.invalidate();
            this.X1.setVisibility(8);
            if (this.f40938o0) {
                this.f40938o0 = false;
                O0(true);
            }
            S0();
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCallParticipant groupCallParticipant;
        int i11;
        int i12;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        int i13;
        int i14;
        String string;
        boolean z10;
        ChatObject.VideoParticipant videoParticipant;
        boolean z11;
        VoIPService sharedInstance;
        int i15;
        int i16;
        int i17 = NotificationCenter.groupCallUpdated;
        String[] strArr = null;
        u40 u40Var = this.M;
        int i18 = 0;
        if (i9 == i17) {
            Long l10 = (Long) objArr[1];
            ChatObject.Call call = this.W0;
            if (call != null && call.call.f22390id == l10.longValue()) {
                ChatObject.Call call2 = this.W0;
                if (call2.call instanceof TLRPC.TL_groupCallDiscarded) {
                    dismiss();
                    return;
                }
                long j10 = this.f40942p0;
                AccountInstance accountInstance = this.d;
                if (j10 == 0 && (((i16 = this.B1) == 7 || i16 == 5 || i16 == 6) && !call2.isScheduled())) {
                    try {
                        Intent intent = new Intent(this.f40898e0, VoIPService.class);
                        intent.putExtra("chat_id", i1());
                        intent.putExtra("createGroupCall", false);
                        intent.putExtra("hasFewPeers", this.X0);
                        intent.putExtra("peerChannelId", this.U0.channel_id);
                        intent.putExtra("peerChatId", this.U0.chat_id);
                        intent.putExtra("peerUserId", this.U0.user_id);
                        intent.putExtra("hash", this.Y0);
                        intent.putExtra("peerAccessHash", this.U0.access_hash);
                        intent.putExtra("is_outgoing", true);
                        intent.putExtra("start_incall_activity", false);
                        intent.putExtra("account", accountInstance.getCurrentAccount());
                        intent.putExtra("scheduleDate", this.f40909g2);
                        this.f40898e0.startService(intent);
                    } catch (Throwable th) {
                        FileLog.e(th);
                    }
                    this.f40942p0 = SystemClock.elapsedRealtime();
                    AndroidUtilities.runOnUIThread(new b20(this, 2), 3000L);
                }
                if (!this.f40946q0 && VoIPService.getSharedInstance() != null) {
                    this.W0.addSelfDummyParticipant(false);
                    l1();
                    VoIPService.getSharedInstance().playConnectedSound();
                }
                I1();
                int childCount = u40Var.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt = u40Var.getChildAt(i19);
                    if (childAt instanceof org.telegram.ui.Cells.e4) {
                        ((org.telegram.ui.Cells.e4) childAt).a(true, false);
                    }
                }
                if (this.T2 != null) {
                    this.f40938o0 = true;
                } else {
                    O0(true);
                }
                O1();
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                if (this.B1 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                N1(true, booleanValue);
                P1(true);
                if (z11 && ((i15 = this.B1) == 1 || i15 == 0)) {
                    k1().j(38, 0L, null);
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().playAllowTalkSound();
                    }
                }
                if (objArr.length >= 4) {
                    Long l11 = (Long) objArr[3];
                    long longValue = l11.longValue();
                    if (longValue != 0 && !r1()) {
                        if (!o1() || (sharedInstance = VoIPService.getSharedInstance()) == null || longValue != sharedInstance.convertingFromCallWithUserId) {
                            try {
                                ArrayList<TLRPC.Dialog> allDialogs = accountInstance.getMessagesController().getAllDialogs();
                                if (allDialogs != null) {
                                    int size = allDialogs.size();
                                    int i20 = 0;
                                    while (true) {
                                        if (i20 >= size) {
                                            break;
                                        }
                                        TLRPC.Dialog dialog = allDialogs.get(i20);
                                        i20++;
                                        if (dialog.f22384id == longValue) {
                                            i18 = 1;
                                            break;
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            if (DialogObject.isUserDialog(longValue)) {
                                TLRPC.User user = accountInstance.getMessagesController().getUser(l11);
                                if (user != null) {
                                    if (this.W0.call.participants_count < 250 || UserObject.isContact(user) || user.verified || i18 != 0) {
                                        k1().k(0L, 44, user, this.V0, null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(-longValue));
                            if (chat != null) {
                                if (this.W0.call.participants_count < 250 || !ChatObject.isNotInChat(chat) || chat.verified || i18 != 0) {
                                    k1().k(0L, 44, chat, this.V0, null, null);
                                }
                            }
                        }
                    }
                }
            }
        } else if (i9 == NotificationCenter.groupCallSpeakingUsersUpdated) {
            g30 g30Var = this.W1;
            if (g30Var.f33598b && this.W0 != null) {
                boolean c10 = g30Var.c();
                ChatObject.Call call3 = this.W0;
                if (call3 != null && g30Var.f33598b && (videoParticipant = g30Var.f33603e) != null && call3.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer)) == null) {
                    c10 = true;
                }
                if (c10) {
                    ChatObject.VideoParticipant videoParticipant2 = null;
                    int i21 = 0;
                    while (true) {
                        ArrayList arrayList = this.m0;
                        if (i21 >= arrayList.size()) {
                            break;
                        }
                        ChatObject.VideoParticipant videoParticipant3 = (ChatObject.VideoParticipant) arrayList.get(i21);
                        if (this.W0.currentSpeakingPeers.g(null, MessageObject.getPeerId(videoParticipant3.participant.peer)) != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = videoParticipant3.participant;
                            if (!groupCallParticipant3.muted_by_you && g30Var.d != MessageObject.getPeerId(groupCallParticipant3.peer)) {
                                videoParticipant2 = videoParticipant3;
                            }
                        }
                        i21++;
                    }
                    if (videoParticipant2 != null) {
                        e1(videoParticipant2);
                    }
                }
            }
            g30Var.setVisibleParticipant(true);
            O1();
        } else if (i9 == NotificationCenter.webRtcMicAmplitudeEvent) {
            C1(((Float) objArr[0]).floatValue());
        } else if (i9 == NotificationCenter.needShowAlert) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                    if (ChatObject.isChannelOrGiga(this.V0)) {
                        string = LocaleController.getString(R.string.VoipChannelTooMuch);
                    } else {
                        string = LocaleController.getString(R.string.VoipGroupTooMuch);
                    }
                } else if (!"ANONYMOUS_CALLS_DISABLED".equals(str) && !"GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    string = LocaleController.getString(R.string.ErrorOccurred) + "\n" + str;
                } else if (ChatObject.isChannelOrGiga(this.V0)) {
                    string = LocaleController.getString(R.string.VoipChannelJoinAnonymousAdmin);
                } else {
                    string = LocaleController.getString(R.string.VoipGroupJoinAnonymousAdmin);
                }
                AlertDialog$Builder N = org.telegram.ui.Components.y4.N(getContext(), LocaleController.getString(R.string.VoipGroupVoiceChat), string);
                N.j(new e20(this, 1));
                try {
                    N.o();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        } else if (i9 == NotificationCenter.didEndCall) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
            }
        } else if (i9 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f22381id == i1()) {
                I1();
                N1(isShowing(), false);
            }
            long peerId = MessageObject.getPeerId(this.f40973w0);
            ChatObject.Call call4 = this.W0;
            if (call4 != null && chatFull.f22381id == (-peerId) && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) call4.participants.f(peerId)) != null) {
                groupCallParticipant2.about = chatFull.about;
                O0(true);
                AndroidUtilities.updateVisibleRows(u40Var);
                if (this.A2 != null) {
                    while (i18 < this.A2.getChildCount()) {
                        View childAt2 = this.A2.getChildAt(i18);
                        if ((childAt2 instanceof org.telegram.ui.ActionBar.g1) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                            org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) childAt2;
                            if (TextUtils.isEmpty(groupCallParticipant2.about)) {
                                i13 = R.string.VoipAddDescription;
                            } else {
                                i13 = R.string.VoipEditDescription;
                            }
                            String string2 = LocaleController.getString(i13);
                            if (TextUtils.isEmpty(groupCallParticipant2.about)) {
                                i14 = R.drawable.msg_addbio;
                            } else {
                                i14 = R.drawable.msg_info;
                            }
                            g1Var.g(string2, i14, null);
                        }
                        i18++;
                    }
                }
            }
        } else if (i9 == NotificationCenter.didLoadChatAdmins) {
            if (((Long) objArr[0]).longValue() == i1()) {
                I1();
                N1(isShowing(), false);
            }
        } else if (i9 == NotificationCenter.applyGroupCallVisibleParticipants) {
            int childCount2 = u40Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i18 < childCount2) {
                f2.q1 G = u40Var.G(u40Var.getChildAt(i18));
                if (G != null) {
                    View view = G.f5501a;
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
                        if (e4Var.getParticipant() != null) {
                            e4Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i18++;
            }
        } else if (i9 == NotificationCenter.userInfoDidLoad) {
            Long l12 = (Long) objArr[0];
            long peerId2 = MessageObject.getPeerId(this.f40973w0);
            if (this.W0 != null && peerId2 == l12.longValue() && (groupCallParticipant = (TLRPC.GroupCallParticipant) this.W0.participants.f(peerId2)) != null) {
                groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
                O0(true);
                AndroidUtilities.updateVisibleRows(u40Var);
                if (this.A2 != null) {
                    while (i18 < this.A2.getChildCount()) {
                        View childAt3 = this.A2.getChildAt(i18);
                        if ((childAt3 instanceof org.telegram.ui.ActionBar.g1) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                            org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) childAt3;
                            if (TextUtils.isEmpty(groupCallParticipant.about)) {
                                i11 = R.string.VoipAddBio;
                            } else {
                                i11 = R.string.VoipEditBio;
                            }
                            String string3 = LocaleController.getString(i11);
                            if (TextUtils.isEmpty(groupCallParticipant.about)) {
                                i12 = R.drawable.msg_addbio;
                            } else {
                                i12 = R.drawable.msg_info;
                            }
                            g1Var2.g(string3, i12, null);
                        }
                        i18++;
                    }
                }
            }
        } else if (i9 == NotificationCenter.mainUserInfoChanged) {
            O0(true);
            AndroidUtilities.updateVisibleRows(u40Var);
        } else if (i9 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0) {
                O0(true);
            }
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (intValue & MessagesController.UPDATE_MASK_EMOJI_STATUS) != 0) {
                AndroidUtilities.updateVisibleRows(u40Var);
            }
        } else if (i9 == NotificationCenter.groupCallScreencastStateChanged) {
            a40 a40Var = this.f40968v0;
            if (a40Var != null) {
                a40Var.b(true, true);
            }
            I1();
        } else if (i9 == NotificationCenter.conferenceEmojiUpdated) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            z40 z40Var = this.f40927l0;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            z40Var.b(strArr);
        }
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity = this.f40898e0;
        launchActivity.W0.remove(this.f40953r2);
        this.f40898e0.setRequestedOrientation(-1);
        A3 = false;
        org.telegram.ui.Components.b30 b30Var = this.A1;
        if (b30Var != null) {
            b30Var.dismiss();
        }
        this.f40938o0 = true;
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
        g30 g30Var = this.W1;
        if (g30Var != null) {
            if (this.f40931m2 != null) {
                this.M.getViewTreeObserver().removeOnPreDrawListener(this.f40931m2);
                this.f40931m2 = null;
            }
            ArrayList arrayList = this.V1;
            arrayList.clear();
            ArrayList arrayList2 = this.U1;
            arrayList.addAll(arrayList2);
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                ((org.telegram.ui.Components.voip.t) arrayList.get(i9)).f();
                g30Var.removeView((View) arrayList.get(i9));
                ((org.telegram.ui.Components.voip.t) arrayList.get(i9)).e();
                ((org.telegram.ui.Components.voip.t) arrayList.get(i9)).b(true);
            }
            arrayList2.clear();
            if (g30Var.getParent() != null) {
                arrayList2.clear();
                this.containerView.removeView(g30Var);
            }
        }
        super.dismissInternal();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
            VoIPService.getSharedInstance().setSinks(null, null);
        }
        if (f40880z3 == this) {
            f40880z3 = null;
        }
        A3 = false;
        VoIPService.audioLevelsCallback = null;
        org.telegram.ui.Components.j20.j(getContext());
        ChatObject.Call call = this.W0;
        if (call != null) {
            call.clearVideFramesInfo();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i9;
        if (this.f40898e0 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.f40898e0.getSystemService("audio");
            boolean z10 = false;
            if (audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25) {
                z10 = true;
            }
            WebRtcAudioTrack.setSpeakerMute(z10);
            if (isSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                UndoView k12 = k1();
                if (z10) {
                    i9 = 42;
                } else {
                    i9 = 43;
                }
                k12.j(i9, 0L, null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e1(ChatObject.VideoParticipant videoParticipant) {
        ChatObject.VideoParticipant videoParticipant2;
        if (videoParticipant == null) {
            this.f40898e0.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            g30 g30Var = this.W1;
            if (g30Var.f33618r != null) {
                return;
            }
            boolean z10 = C3;
            u40 u40Var = this.M;
            int i9 = 0;
            if (z10) {
                if (this.f40931m2 != null) {
                    u40Var.getViewTreeObserver().removeOnPreDrawListener(this.f40931m2);
                    this.f40931m2 = null;
                }
                ArrayList arrayList = new ArrayList();
                u50 u50Var = this.f40925k2;
                ArrayList arrayList2 = this.U1;
                ArrayList arrayList3 = this.V1;
                if (videoParticipant == null) {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList3.get(i10);
                        org.telegram.ui.Components.voip.l lVar = tVar.f33825c;
                        if (lVar != null) {
                            lVar.setRenderer(null);
                            org.telegram.ui.Components.b20 b20Var = tVar.d;
                            if (b20Var != null) {
                                b20Var.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.l lVar2 = tVar.f33828e;
                            if (lVar2 != null) {
                                lVar2.setRenderer(null);
                            }
                            arrayList.add(tVar.f33850w);
                            tVar.b(false);
                            tVar.animate().alpha(0.0f).setListener(new b40(this, tVar));
                        }
                    }
                    this.L2 = false;
                    u50Var.H(this.f40921j2, true, true);
                } else {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) arrayList3.get(i11);
                        if (tVar2.f33828e != null && ((videoParticipant2 = tVar2.f33850w) == null || !videoParticipant2.equals(videoParticipant))) {
                            arrayList.add(tVar2.f33850w);
                            tVar2.b(false);
                            org.telegram.ui.Components.b20 b20Var2 = tVar2.d;
                            if (b20Var2 != null) {
                                b20Var2.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.l lVar3 = tVar2.f33825c;
                            if (lVar3 != null) {
                                lVar3.setRenderer(null);
                            }
                            tVar2.animate().alpha(0.0f).setListener(new c40(this, tVar2));
                        }
                    }
                    this.L2 = true;
                    u50Var.f43141r = false;
                    if (!arrayList.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.p61(27, this, arrayList));
                    }
                }
                ViewTreeObserver viewTreeObserver = u40Var.getViewTreeObserver();
                e40 e40Var = new e40(this, videoParticipant, !g30Var.f33598b);
                this.f40931m2 = e40Var;
                viewTreeObserver.addOnPreDrawListener(e40Var);
                return;
            }
            if (this.f40931m2 != null) {
                u40Var.getViewTreeObserver().removeOnPreDrawListener(this.f40931m2);
                this.f40931m2 = null;
            }
            if (videoParticipant != null) {
                c30 c30Var = this.f40917i2;
                if (c30Var.getVisibility() != 0) {
                    c30Var.setVisibility(0);
                    org.telegram.ui.Components.c20 c20Var = this.f40928l2;
                    c20Var.G(c30Var, false);
                    this.f40938o0 = true;
                    if (!g30Var.f33598b) {
                        ArrayList arrayList4 = c20Var.f27350e;
                        f2.m0 m0Var = (f2.m0) c30Var.getLayoutManager();
                        if (m0Var != null) {
                            while (true) {
                                if (i9 >= arrayList4.size()) {
                                    break;
                                } else if (((ChatObject.VideoParticipant) arrayList4.get(i9)).equals(videoParticipant)) {
                                    m0Var.h1(i9, AndroidUtilities.dp(13.0f));
                                    break;
                                } else {
                                    i9++;
                                }
                            }
                        }
                    }
                    ViewTreeObserver viewTreeObserver2 = u40Var.getViewTreeObserver();
                    f40 f40Var = new f40(this, videoParticipant);
                    this.f40931m2 = f40Var;
                    viewTreeObserver2.addOnPreDrawListener(f40Var);
                    return;
                }
                g30Var.j(videoParticipant);
                AndroidUtilities.updateVisibleRows(c30Var);
            } else if (u40Var.getVisibility() != 0) {
                u40Var.setVisibility(0);
                O0(false);
                this.f40938o0 = true;
                ViewTreeObserver viewTreeObserver3 = u40Var.getViewTreeObserver();
                g40 g40Var = new g40(this);
                this.f40931m2 = g40Var;
                viewTreeObserver3.addOnPreDrawListener(g40Var);
            } else {
                ViewTreeObserver viewTreeObserver4 = u40Var.getViewTreeObserver();
                h40 h40Var = new h40(this);
                this.f40931m2 = h40Var;
                viewTreeObserver4.addOnPreDrawListener(h40Var);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final int h1() {
        Integer num = this.f40967u3;
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

    public final long i1() {
        TLRPC.Chat chat = this.V0;
        if (chat == null) {
            return 0L;
        }
        return chat.f22380id;
    }

    public final void j1(boolean z10) {
        boolean z11;
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(i1()));
        if (chat != null && !ChatObject.isPublic(chat)) {
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(i1());
            String publicUsername = ChatObject.getPublicUsername(this.V0);
            if (!TextUtils.isEmpty(publicUsername)) {
                str = aa.d.p(accountInstance.getMessagesController().linkPrefix, "/", publicUsername, new StringBuilder());
            } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                tL_messages_exportChatInvite.peer = MessagesController.getInputPeer(this.V0);
                accountInstance.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new gh.m7(this, chatFull, z10, 6));
                return;
            }
            u1(null, str, true, z10);
        } else if (this.W0 != null) {
            for (int i9 = 0; i9 < 2; i9++) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = this.W0.getInputGroupCall();
                if (i9 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                exportgroupcallinvite.can_self_unmute = z11;
                accountInstance.getConnectionsManager().sendRequest(exportgroupcallinvite, new org.telegram.messenger.voip.k0(this, i9, z10, 1));
            }
        }
    }

    public final UndoView k1() {
        if (!C3) {
            g30 g30Var = this.W1;
            if (g30Var.f33598b) {
                return g30Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.f40903f0;
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

    public final void l1() {
        VoIPService sharedInstance;
        int i9;
        if (!this.f40946q0 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            this.f40946q0 = true;
            this.f40987z0.addAll(this.W0.visibleParticipants);
            this.A0.addAll(this.m0);
            this.B0.addAll(this.W0.invitedUsers);
            this.C0.addAll(this.W0.shadyJoinParticipants);
            this.D0.addAll(this.W0.shadyLeftParticipants);
            this.P1 = sharedInstance.getCallState();
            if (this.W0 == null) {
                ChatObject.Call call = sharedInstance.groupCall;
                this.W0 = call;
                this.f40928l2.f27349c = call;
                this.W1.setGroupCall(call);
                this.f40925k2.f43137c = this.W0;
            }
            tg.i iVar = this.Y;
            if (iVar != null) {
                iVar.C0(this.d.getCurrentAccount(), this.W0.getInputGroupCall(false));
            }
            this.K.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
            this.W0.saveActiveDates();
            VoIPService.getSharedInstance().registerStateListener(this);
            t40 t40Var = this.R;
            if (t40Var != null && t40Var.getVisibility() == 0) {
                this.f40955s.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, true);
                M1(true);
                if (ChatObject.isChannelOrGiga(this.V0)) {
                    i9 = R.string.VoipChannelEndChat;
                } else {
                    i9 = R.string.VoipGroupEndChat;
                }
                this.f40957s1.setText(LocaleController.getString(i9));
                u40 u40Var = this.M;
                u40Var.setVisibility(0);
                org.telegram.ui.ActionBar.w0 w0Var = this.f40912h1;
                w0Var.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(u40Var, property, 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(u40Var, View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(t40Var, property2, 0.0f);
                Property property3 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(t40Var, property3, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(t40Var, property, 0.0f);
                org.telegram.ui.ActionBar.h5 h5Var = this.Q;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(h5Var, property2, 0.0f);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(h5Var, property3, 0.0f);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(h5Var, property, 0.0f);
                org.telegram.ui.ActionBar.h5 h5Var2 = this.S;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(h5Var2, property2, 0.0f), ObjectAnimator.ofFloat(h5Var2, property3, 0.0f), ObjectAnimator.ofFloat(h5Var2, property, 0.0f), ObjectAnimator.ofFloat(w0Var, property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(w0Var, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(w0Var, property, 0.0f, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.gr.f28845g);
                animatorSet.addListener(new i40(this, 0));
                animatorSet.setDuration(300L);
                animatorSet.start();
            }
        }
    }

    public final void m1(final long j10, final boolean z10) {
        if (this.W0 != null) {
            AccountInstance accountInstance = this.d;
            final TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                final org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(getContext(), 3, null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                invitetogroupcall.call = this.W0.getInputGroupCall();
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = user.f22527id;
                tL_inputUser.access_hash = user.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = accountInstance.getConnectionsManager().sendRequest(invitetogroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        o50 o50Var = o50.this;
                        long j11 = j10;
                        org.telegram.ui.ActionBar.c2[] c2VarArr2 = c2VarArr;
                        if (tLObject != null) {
                            o50Var.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            AndroidUtilities.runOnUIThread(new org.telegram.messenger.lg(o50Var, j11, c2VarArr2, user, 8));
                            return;
                        }
                        AndroidUtilities.runOnUIThread(new gh.i(o50Var, c2VarArr2, z10, tL_error, j11, invitetogroupcall));
                    }
                });
                if (sendRequest != 0) {
                    AndroidUtilities.runOnUIThread(new rl(this, c2VarArr, sendRequest, 28), 500L);
                }
            }
        }
    }

    public final boolean n1() {
        float f10;
        int dp = AndroidUtilities.dp(74.0f);
        float f11 = this.f40964u0 - dp;
        if (this.backgroundPaddingTop + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - this.backgroundPaddingTop) / ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)));
        } else {
            f10 = 0.0f;
        }
        if (f10 > 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean o1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAudioSettingsChanged() {
        M1(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            C1(0.0f);
        }
        u40 u40Var = this.M;
        if (u40Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(u40Var);
        }
        c30 c30Var = this.f40917i2;
        if (c30Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(c30Var);
        }
        ArrayList arrayList = this.V1;
        arrayList.clear();
        arrayList.addAll(this.U1);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i9)).j(true);
        }
    }

    @Override
    public final void onBackPressed() {
        a40 a40Var = this.f40968v0;
        if (a40Var != null) {
            a40Var.b(false, false);
        } else if (this.f40886b2) {
            d1(true);
        } else if (this.W1.f33598b) {
            e1(null);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.u0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        ArrayList arrayList = this.V1;
        arrayList.clear();
        arrayList.addAll(this.U1);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i9)).j(true);
        }
        a40 a40Var = this.f40968v0;
        if (a40Var != null && VoIPService.getSharedInstance() != null) {
            a40Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.f40898e0;
        launchActivity.W0.add(this.f40953r2);
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        A3 = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        org.telegram.ui.Components.j20.j(getContext());
        return super.onCustomOpenAnimation();
    }

    @Override
    public final void onMediaStateUpdated(int i9, int i10) {
        org.telegram.messenger.voip.u0.d(this, i9, i10);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.u0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i9) {
        org.telegram.messenger.voip.u0.f(this, i9);
    }

    @Override
    public final void onStateChanged(int i9) {
        this.P1 = i9;
        N1(isShowing(), false);
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.u0.h(this, z10);
    }

    public final boolean q1() {
        if (!r1() || this.W0.visibleVideoParticipants.isEmpty() || (this.W0.visibleVideoParticipants.get(0).aspectRatio != 0.0f && this.W0.visibleVideoParticipants.get(0).aspectRatio < 1.0f)) {
            return false;
        }
        return true;
    }

    public final boolean r1() {
        ChatObject.Call call = this.W0;
        if (call != null && call.call.rtmp_stream) {
            return true;
        }
        return false;
    }

    public final void s1(org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.c2 c2Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j10;
        if (!this.f40956s0) {
            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f40898e0.O().getFragmentStack().get(this.f40898e0.O().getFragmentStack().size() - 1);
            if (o2Var instanceof qn) {
                boolean P9 = ((qn) o2Var).P9();
                this.f40956s0 = true;
                this.f40960t0 = true;
                bg.d dVar = new bg.d(f3Var, editTextBoldCursor, z10, c2Var, 18);
                if (P9) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(dVar, j10);
                return;
            }
            this.f40956s0 = true;
            this.f40960t0 = true;
            if (f3Var != null) {
                f3Var.setFocusable(true);
            } else if (c2Var != null) {
                c2Var.k(true);
            }
            if (z10) {
                AndroidUtilities.runOnUIThread(new yg(2, editTextBoldCursor), 100L);
            }
        }
    }

    @Override
    public final void show() {
        super.show();
        if (org.telegram.ui.Components.voip.g1.Z.R) {
            org.telegram.ui.Components.voip.g1.j();
        }
    }

    public final void u1(java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o50.u1(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final void v1() {
        ChatObject.Call call = this.W0;
        if (call != null && call.call != null) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getContext(), 3, null);
            c2Var.q(300L);
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = this.W0.call;
            tL_inputGroupCall.f22397id = groupCall.f22390id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new y9(this, c2Var, exportgroupcallinvite, 12));
        }
    }

    public final void x1(org.telegram.tgnet.TLRPC.GroupCallParticipant r31, final long r32, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o50.x1(org.telegram.tgnet.TLRPC$GroupCallParticipant, long, int):void");
    }

    public final void y1(boolean r18, org.telegram.ui.Cells.e4 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o50.y1(boolean, org.telegram.ui.Cells.e4):void");
    }

    public final void z1() {
        v5 v5Var = this.f40975w2;
        AndroidUtilities.cancelRunOnUIThread(v5Var);
        if (this.f40970v2 && this.Q0 != null && VoIPService.getSharedInstance() != null && r1() && this.M != null && LiteMode.isEnabled(512)) {
            AndroidUtilities.runOnUIThread(v5Var, 30L);
        }
    }

    @Override
    public final void B(float f10, int i9) {
    }
}

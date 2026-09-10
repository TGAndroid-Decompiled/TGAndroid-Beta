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
public final class j60 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, le.d {
    public static j60 D3;
    public static boolean E3;
    public static boolean F3;
    public static boolean G3;
    public static volatile DispatchQueue H3 = new DispatchQueue("updateTextureLightningQueue");
    public static boolean I3;
    public TLRPC.Peer A0;
    public final TextView A1;
    public final x5 A2;
    public final le.b A3;
    public TLObject B0;
    public final h60 B1;
    public final LongSparseIntArray B2;
    public final le.e B3;
    public final Paint C0;
    public final oh.i C1;
    public final e40 C2;
    public final le.b C3;
    public final ArrayList D0;
    public w20 D1;
    public final c40 D2;
    public final Paint E;
    public final ArrayList E0;
    public org.telegram.ui.Components.b40 E1;
    public LinearLayout E2;
    public final m40 F;
    public final ArrayList F0;
    public int F1;
    public boolean F2;
    public final l40 G;
    public final ArrayList G0;
    public boolean G1;
    public final org.telegram.ui.Components.hj0 G2;
    public final j40 H;
    public final ArrayList H0;
    public boolean H1;
    public int H2;
    public final ImageView I;
    public int I0;
    public final Paint I1;
    public boolean I2;
    public final ImageView J;
    public final org.telegram.ui.Components.hj0 J0;
    public final Paint J1;
    public final View J2;
    public org.telegram.ui.Components.pk0 K;
    public final org.telegram.ui.Components.hj0 K0;
    public final i60[] K1;
    public final View K2;
    public final n50 L;
    public boolean L0;
    public float L1;
    public GradientDrawable L2;
    public final org.telegram.ui.Components.o6 M;
    public final org.telegram.ui.Components.ba M0;
    public i60 M1;
    public final int[] M2;
    public final u30 N;
    public final org.telegram.ui.Components.ba N0;
    public i60 N1;
    public final y30 N2;
    public final f50 O;
    public float O0;
    public long O1;
    public boolean O2;
    public final d60 P;
    public float P0;
    public float P1;
    public boolean P2;
    public final p50 Q;
    public float Q0;
    public float Q1;
    public RenderNode Q2;
    public final s40 R;
    public RadialGradient R0;
    public boolean R1;
    public float R2;
    public final TextView S;
    public final Matrix S0;
    public boolean S1;
    public boolean S2;
    public final q40 T;
    public final Paint T0;
    public int T1;
    public final String[] T2;
    public final org.telegram.ui.ActionBar.l5 U;
    public final y50 U0;
    public float U1;
    public ObjectAnimator U2;
    public final o50 V;
    public float V0;
    public int V1;
    public ObjectAnimator V2;
    public final org.telegram.ui.ActionBar.l5 W;
    public float W0;
    public boolean W1;
    public final y40 W2;
    public final x50 X;
    public ValueAnimator X0;
    public final int[] X1;
    public org.telegram.ui.Cells.d4 X2;
    public final org.telegram.ui.Components.vz Y;
    public TLRPC.InputPeer Y0;
    public final ArrayList Y1;
    public org.telegram.ui.Components.voip.l Y2;
    public final ImageReceiver Z;
    public TLRPC.Chat Z0;
    public final ArrayList Z1;
    public org.telegram.ui.Components.voip.t Z2;
    public int f33935a0;
    public ChatObject.Call f33936a1;
    public final b40 a2;
    public org.telegram.ui.Components.a30 f33937a3;
    public final d40 f33938b;
    public final ImageView f33939b0;
    public final boolean f33940b1;
    public final g40 f33941b2;
    public boolean f33942b3;
    public final i30 f33943c;
    public final kh.h f33944c0;
    public final String f33945c1;
    public final t40 f33946c2;
    public boolean f33947c3;
    public final AccountInstance d;
    public final int f33948d0;
    public final e60 f33949d1;
    public float f33950d2;
    public int f33951d3;
    public final o30 e;
    public final RadialProgressView f33952e0;
    public final t30 f33953e1;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f33954e2;
    public AnimatorSet f33955e3;
    public final org.telegram.ui.Components.voip.u2 f33956f;
    public final Drawable f33957f0;
    public final v30 f33958f1;
    public boolean f33959f2;
    public j50 f33960f3;
    public final View f33961g0;
    public final Paint f33962g1;
    public boolean f33963g2;
    public int f33964g3;
    public final org.telegram.ui.Components.voip.u2 h;
    public AnimatorSet f33965h0;
    public ValueAnimator f33966h1;
    public org.telegram.ui.Components.e50 f33967h2;
    public int f33968h3;
    public LaunchActivity f33969i0;
    public float f33970i1;
    public q50 f33971i2;
    public int f33972i3;
    public final UndoView[] f33973j0;
    public final LinearLayout f33974j1;
    public Boolean f33975j2;
    public int j3;
    public final org.telegram.ui.Cells.k f33976k0;
    public final org.telegram.ui.ActionBar.w0 f33977k1;
    public int f33978k2;
    public int f33979k3;
    public boolean f33980l0;
    public final org.telegram.ui.ActionBar.w0 l1;
    public boolean f33981l2;
    public int f33982l3;
    public org.telegram.ui.Components.s40 m0;
    public final org.telegram.ui.ActionBar.w0 f33983m1;
    public final x30 f33984m2;
    public int f33985m3;
    public final org.telegram.ui.Components.voip.u2 f33986n;
    public org.telegram.ui.Components.s40 f33987n0;
    public final org.telegram.ui.ActionBar.g1 f33988n1;
    public final org.telegram.ui.Components.vl0 f33989n2;
    public int f33990n3;
    public int f33991o0;
    public final org.telegram.ui.ActionBar.g1 f33992o1;
    public final p60 f33993o2;
    public int f33994o3;
    public u50 f33995p0;
    public final org.telegram.ui.ActionBar.g1 f33996p1;
    public final org.telegram.ui.Components.b30 f33997p2;
    public int f33998p3;
    public final ArrayList f33999q0;
    public final org.telegram.ui.ActionBar.g1 f34000q1;
    public ViewTreeObserver.OnPreDrawListener f34001q2;
    public int f34002q3;
    public final org.telegram.ui.Components.voip.u2 f34003r;
    public e50 f34004r0;
    public final org.telegram.ui.ActionBar.g1 f34005r1;
    public final org.telegram.ui.Components.voip.h f34006r2;
    public int f34007r3;
    public final org.telegram.ui.Components.voip.u2 f34008s;
    public boolean f34009s0;
    public final org.telegram.ui.ActionBar.g1 f34010s1;
    public boolean f34011s2;
    public int f34012s3;
    public long f34013t0;
    public final org.telegram.ui.ActionBar.g1 f34014t1;
    public final ArrayList f34015t2;
    public int f34016t3;
    public boolean f34017u0;
    public final org.telegram.ui.ActionBar.g1 f34018u1;
    public boolean f34019u2;
    public int f34020u3;
    public final org.telegram.ui.Components.voip.u2 v;
    public final RectF f34021v0;
    public final org.telegram.ui.ActionBar.g1 f34022v1;
    public final w20 f34023v2;
    public int f34024v3;
    public final org.telegram.ui.Components.voip.u2 f34025w;
    public boolean f34026w0;
    public final org.telegram.ui.ActionBar.g1 f34027w1;
    public final s30 f34028w2;
    public final k50 f34029w3;
    public final p30 f34030x;
    public boolean f34031x0;
    public final org.telegram.ui.ActionBar.g1 f34032x1;
    public final org.telegram.ui.Components.c30 f34033x2;
    public Boolean f34034x3;
    public final ImageView f34035y;
    public float f34036y0;
    public final org.telegram.ui.ActionBar.g1 f34037y1;
    public final w20 f34038y2;
    public Integer y3;
    public v40 f34039z0;
    public final LinearLayout f34040z1;
    public boolean f34041z2;
    public final le.b f34042z3;

    public j60(final LaunchActivity launchActivity, AccountInstance accountInstance, ChatObject.Call call, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        super((Context) launchActivity, (org.telegram.ui.ActionBar.f6) null, true, true);
        String string;
        int i10;
        j60 j60Var;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.E = new Paint(1);
        this.f33973j0 = new UndoView[2];
        this.f33999q0 = new ArrayList();
        this.f34021v0 = new RectF();
        this.C0 = new Paint(1);
        this.D0 = new ArrayList();
        this.E0 = new ArrayList();
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new ArrayList();
        this.C1 = new oh.i(new w20(this, 8));
        this.F1 = 0;
        this.G1 = false;
        this.I1 = new Paint(7);
        this.J1 = new Paint(7);
        this.K1 = new i60[8];
        this.L1 = 1.0f;
        this.W1 = true;
        this.X1 = new int[4];
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.f34006r2 = new org.telegram.ui.Components.voip.h();
        this.f34015t2 = new ArrayList();
        this.f34023v2 = new w20(this, 0);
        this.f34028w2 = new s30(this);
        this.f34033x2 = new org.telegram.ui.Components.c30(12);
        this.f34038y2 = new w20(this, 1);
        this.f34041z2 = false;
        this.A2 = new x5(this, 6);
        this.B2 = new LongSparseIntArray();
        this.M2 = new int[2];
        this.P2 = true;
        this.T2 = new String[2];
        this.f33951d3 = -1;
        this.f34029w3 = new k50(this);
        org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.f28819f;
        this.f34042z3 = new le.b(2, this, wrVar, 350L);
        this.A3 = new le.b(3, this, wrVar, 220L, true);
        this.B3 = new le.e(4, this, wrVar, 350L);
        this.C3 = new le.b(5, this, wrVar, 350L);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        setOpenNoDelay(true);
        this.d = accountInstance;
        this.f33936a1 = call;
        this.Y0 = inputPeer;
        this.Z0 = chat;
        this.f33945c1 = str;
        this.currentAccount = accountInstance.getCurrentAccount();
        this.f33940b1 = z10;
        this.resourcesProvider = new org.telegram.ui.Components.bq0();
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.f33948d0 = MessagesController.getInstance(this.currentAccount).config.groupCallMessageLengthLimit.get();
        this.fullWidth = true;
        G3 = false;
        F3 = false;
        I3 = false;
        setDelegate(new n40(this));
        this.drawDoubleNavigationBar = true;
        this.drawNavigationBar = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.W2 = new y40(this);
        setOnDismissListener(new a30(this, 0));
        setDimBehindAlpha(75);
        d60 d60Var = new d60(this, launchActivity);
        this.P = d60Var;
        org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(true);
        int i11 = org.telegram.ui.ActionBar.j6.f18171qg;
        xpVar.b(org.telegram.ui.ActionBar.j6.u0(i11));
        xpVar.d();
        f50 f50Var = new f50(this, launchActivity, xpVar);
        this.O = f50Var;
        f50Var.setSubtitle("");
        f50Var.getSubtitleTextView().setVisibility(0);
        f50Var.l();
        f50Var.getAdditionalSubtitleTextView().setPadding(AndroidUtilities.dp(24.0f), 0, 0, 0);
        AndroidUtilities.updateViewVisibilityAnimated(f50Var.getAdditionalSubtitleTextView(), this.f34019u2, 1.0f, false);
        f50Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.j6.u0(i11));
        int i12 = org.telegram.ui.ActionBar.j6.f18083lg;
        f50Var.setSubtitleColor(org.telegram.ui.ActionBar.j6.u0(i12));
        f50Var.setBackButtonImage(R.drawable.ic_ab_back);
        f50Var.setOccupyStatusBar(false);
        f50Var.setAllowOverlayTitle(false);
        int i13 = org.telegram.ui.ActionBar.j6.f18007hg;
        f50Var.C(org.telegram.ui.ActionBar.j6.u0(i13), false);
        f50Var.A(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.f18327z8), false);
        f50Var.setTitleColor(org.telegram.ui.ActionBar.j6.u0(i13));
        f50Var.setSubtitleColor(org.telegram.ui.ActionBar.j6.u0(i12));
        f50Var.setActionBarMenuOnItemClick(new m50(this, launchActivity));
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
        VoIPService.audioLevelsCallback = new t20(this, 3);
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
        this.f33957f0 = launchActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(R.raw.voip_filled, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        this.J0 = hj0Var;
        this.K0 = new org.telegram.ui.Components.hj0(R.raw.hand_2, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        n50 n50Var = new n50(this, launchActivity);
        this.L = n50Var;
        this.containerView = n50Var;
        n50Var.setClipToPadding(false);
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
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(launchActivity);
            this.U = l5Var;
            l5Var.setGravity(17);
            l5Var.setTextColor(-1);
            l5Var.setTypeface(AndroidUtilities.bold());
            l5Var.setTextSize(18);
            l5Var.k(LocaleController.getString(R.string.VoipChatStartsIn));
            this.containerView.addView(l5Var, w7.a6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            o50 o50Var = new o50(this, launchActivity);
            this.V = o50Var;
            o50Var.setGravity(17);
            o50Var.setTextColor(-1);
            o50Var.setTypeface(AndroidUtilities.bold());
            o50Var.setTextSize(60);
            this.containerView.addView(o50Var, w7.a6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(launchActivity);
            this.W = l5Var2;
            l5Var2.setGravity(17);
            l5Var2.setTextColor(-1);
            l5Var2.setTypeface(AndroidUtilities.bold());
            l5Var2.setTextSize(18);
            this.containerView.addView(l5Var2, w7.a6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (r1()) {
            y50 y50Var = new y50(this, launchActivity);
            this.U0 = y50Var;
            this.containerView.addView(y50Var, w7.a6.d(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        p50 p50Var = new p50(this, launchActivity);
        this.Q = p50Var;
        p50Var.setClipToPadding(false);
        p50Var.setClipChildren(false);
        x50 x50Var = new x50(this);
        this.X = x50Var;
        x50Var.f41667o = wrVar;
        x50Var.d = 350L;
        x50Var.f41691c = 350L;
        x50Var.e = 350L;
        x50Var.S();
        p50Var.setItemAnimator(x50Var);
        p50Var.setOnScrollListener(new h30(this));
        p50Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(F3 ? 6 : 2, p50Var);
        this.Y = vzVar;
        p50Var.setLayoutManager(vzVar);
        i30 i30Var = new i30(this);
        this.f33943c = i30Var;
        vzVar.z1(i30Var);
        p50Var.i(new j30(this));
        vzVar.C1();
        this.containerView.addView(p50Var, w7.a6.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        p50Var.setAdapter(d60Var);
        p50Var.setTopBottomSelectorRadius(13);
        p50Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.f17954eg));
        p50Var.setOnItemClickListener(new a7(this, launchActivity, call, 14));
        p50Var.setOnItemLongClickListener(new t20(this, 4));
        if (r1()) {
            h60 h60Var = new h60(this, getContext());
            this.B1 = h60Var;
            this.containerView.addView(h60Var, w7.a6.d(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(launchActivity);
        this.f33989n2 = vl0Var;
        this.containerView.addView(vl0Var, w7.a6.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        p60 p60Var = new p60(call, this.currentAccount, this);
        this.f33993o2 = p60Var;
        vl0Var.setAdapter(p60Var);
        s4.s sVar = new s4.s(6, false);
        vl0Var.setLayoutManager(sVar);
        sVar.z1(new l30(this));
        vl0Var.setOnItemClickListener(new org.telegram.ui.Components.jl0(this) {
            public final j60 f37398b;

            {
                this.f37398b = this;
            }

            @Override
            public final void d(int i15, View view) {
                switch (r2) {
                    case 0:
                        j60 j60Var2 = this.f37398b;
                        j60Var2.getClass();
                        org.telegram.ui.Components.a30 a30Var = (org.telegram.ui.Components.a30) view;
                        if (a30Var.getVideoParticipant() == null) {
                            j60Var2.e1(new ChatObject.VideoParticipant(a30Var.getParticipant(), false, false));
                            return;
                        } else {
                            j60Var2.e1(a30Var.getVideoParticipant());
                            return;
                        }
                    default:
                        j60 j60Var3 = this.f37398b;
                        j60Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                        if (lVar.getParticipant() != null) {
                            j60Var3.e1(lVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        s4.j jVar = new s4.j();
        jVar.S();
        jVar.f41667o = wrVar;
        jVar.d = 350L;
        jVar.f41691c = 350L;
        jVar.e = 350L;
        vl0Var.setItemAnimator(new m30(this));
        vl0Var.setOnScrollListener(new n30(this));
        p60Var.H(vl0Var, false, false);
        vl0Var.setVisibility(8);
        o30 o30Var = new o30(this, launchActivity);
        this.e = o30Var;
        int u02 = org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.Jg);
        int red = Color.red(u02);
        int green = Color.green(u02);
        int blue = Color.blue(u02);
        this.S0 = new Matrix();
        this.R0 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.T0 = paint;
        paint.setShader(this.R0);
        org.telegram.ui.Components.ba baVar = new org.telegram.ui.Components.ba(9);
        this.M0 = baVar;
        org.telegram.ui.Components.ba baVar2 = new org.telegram.ui.Components.ba(12);
        this.N0 = baVar2;
        baVar.f21768a = AndroidUtilities.dp(62.0f) * 0.45454547f;
        baVar.f21769b = AndroidUtilities.dp(72.0f) * 0.45454547f;
        baVar.b();
        baVar2.f21768a = AndroidUtilities.dp(65.0f) * 0.45454547f;
        baVar2.f21769b = AndroidUtilities.dp(75.0f) * 0.45454547f;
        baVar2.b();
        int i15 = org.telegram.ui.ActionBar.j6.Ig;
        baVar.d.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.u0(i15), 38));
        baVar2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.u0(i15), 76));
        org.telegram.ui.Components.voip.u2 u2Var = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.f34003r = u2Var;
        u2Var.setCheckable(true);
        u2Var.setTextSize(12);
        o30Var.a(u2Var);
        u2Var.setOnClickListener(new u20(this, 7));
        org.telegram.ui.Components.voip.u2 u2Var2 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.f33986n = u2Var2;
        u2Var2.setCheckable(true);
        u2Var2.setTextSize(12);
        u2Var2.d(false, false);
        u2Var2.setCrossOffset(-AndroidUtilities.dpf2(3.5f));
        u2Var2.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), false, false);
        org.telegram.ui.Components.voip.u2 u2Var3 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.f33956f = u2Var3;
        u2Var3.setCheckable(true);
        u2Var3.setTextSize(12);
        u2Var3.d(false, false);
        org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(launchActivity);
        u2Var3.addView(kj0Var, w7.a6.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.hj0 hj0Var2 = new org.telegram.ui.Components.hj0(R.raw.camera_flip, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.G2 = hj0Var2;
        kj0Var.setAnimation(hj0Var2);
        u2Var3.setOnClickListener(new u20(this, 10));
        o30Var.a(u2Var3);
        org.telegram.ui.Components.voip.u2 u2Var4 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.h = u2Var4;
        u2Var4.setCheckable(true);
        u2Var4.setTextSize(12);
        u2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.f33939b0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i16 = R.drawable.filled_sound_on;
        this.f33935a0 = i16;
        imageView.setImageResource(i16);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        u2Var4.addView(imageView, w7.a6.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        u2Var4.setOnClickListener(new u20(this, 11));
        o30Var.a(u2Var4);
        o30Var.a(u2Var2);
        org.telegram.ui.Components.voip.u2 u2Var5 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.f34008s = u2Var5;
        u2Var5.setTextSize(12);
        u2Var5.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.Dg), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        u2Var5.setOnClickListener(new View.OnClickListener(this) {
            public final j60 f39192b;

            {
                this.f39192b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        j60.o(this.f39192b, launchActivity);
                        return;
                    default:
                        j60 j60Var2 = this.f39192b;
                        j60Var2.a2.e();
                        ChatObject.Call call2 = j60Var2.f33936a1;
                        if (call2 != null && !call2.isScheduled()) {
                            j60Var2.I1();
                            j60.t1(launchActivity, new w20(j60Var2, 5), false, false);
                            return;
                        }
                        j60Var2.dismiss();
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
        p30 p30Var = new p30(this, launchActivity);
        this.f34030x = p30Var;
        p30Var.setAnimation(hj0Var);
        p30Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.u2 u2Var7 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.f34025w = u2Var7;
        u2Var7.setDrawBackground(false);
        u2Var7.setTextSize(12);
        u2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        u2Var7.addView(p30Var, w7.a6.e(50, 50, 49));
        o30Var.a(u2Var7);
        u2Var7.setOnClickListener(new r30(this));
        o30Var.a(u2Var6);
        o30Var.a(u2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.f34035y = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        u2Var7.addView(imageView2, w7.a6.d(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.f33936a1 != null && r1() && !this.f33936a1.isScheduled()) {
            imageView2.setVisibility(0);
            p30Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.f33952e0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.Og));
        f50Var.setAlpha(0.0f);
        f50Var.getBackButton().setScaleX(0.9f);
        f50Var.getBackButton().setScaleY(0.9f);
        f50Var.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        f50Var.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        f50Var.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        f50Var.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.j6.u0(i13));
        this.f33977k1 = w0Var;
        w0Var.setLongClickEnabled(false);
        w0Var.setIcon(R.drawable.ic_ab_other);
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var.setSubMenuOpenSide(2);
        w0Var.setDelegate(new t20(this, 0));
        int i17 = org.telegram.ui.ActionBar.j6.f18026ig;
        w0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.e0(org.telegram.ui.ActionBar.j6.u0(i17), 6));
        w0Var.setOnClickListener(new u20(this, 0));
        w0Var.G(org.telegram.ui.ActionBar.j6.u0(i13), false);
        w0Var.G(org.telegram.ui.ActionBar.j6.u0(i13), true);
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.j6.u0(i13));
        this.l1 = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setIcon(R.drawable.msg_voice_pip);
        w0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        w0Var2.setBackground(org.telegram.ui.ActionBar.j6.e0(org.telegram.ui.ActionBar.j6.u0(i17), 6));
        w0Var2.setOnClickListener(new u20(this, 1));
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.j6.u0(i13));
        this.f33983m1 = w0Var3;
        w0Var3.setLongClickEnabled(false);
        w0Var3.setIcon(R.drawable.msg_screencast);
        w0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        w0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.e0(org.telegram.ui.ActionBar.j6.u0(i17), 6));
        w0Var3.setOnClickListener(new u20(this, 2));
        t30 t30Var = new t30(this, launchActivity, launchActivity);
        this.f33953e1 = t30Var;
        u30 u30Var = new u30(launchActivity);
        this.N = u30Var;
        u30Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.f33962g1 = paint2;
        paint2.setColor(-12761513);
        v30 v30Var = new v30(this, getContext());
        this.f33958f1 = v30Var;
        v30Var.setTextColor(getThemedColor(i13));
        v30Var.setTextSize(1, 11.0f);
        v30Var.setText(LocaleController.getString(R.string.VoipChannelLabelLive));
        v30Var.setMaxLines(1);
        v30Var.setGravity(17);
        v30Var.setTypeface(AndroidUtilities.bold());
        v30Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f));
        v30Var.setTag(-1);
        if (!r1()) {
            v30Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f33974j1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(t30Var, w7.a6.l(1.0f, 0, -2));
        linearLayout.addView(v30Var, w7.a6.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.containerView.addView(u30Var, w7.a6.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(linearLayout, w7.a6.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.containerView.addView(f50Var, w7.a6.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.f34040z1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(w0Var3, w7.a6.n(48, 48));
        linearLayout2.addView(w0Var2, w7.a6.n(48, 48));
        linearLayout2.addView(w0Var, w7.a6.n(48, 48));
        this.containerView.addView(linearLayout2, w7.a6.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.f33961g0 = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.V5));
        this.containerView.addView(view, w7.a6.c(1.0f, -1));
        for (int i18 = 0; i18 < 2; i18++) {
            this.f33973j0[i18] = new w30(this, launchActivity);
            this.f33973j0[i18].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            this.f33973j0[i18].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.containerView.addView(this.f33973j0[i18], w7.a6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(launchActivity, true);
        this.f33976k0 = kVar;
        kVar.setTag(R.id.fit_width_tag, 240);
        this.f33977k1.h(kVar, AndroidUtilities.dp(48.0f));
        this.f33977k1.setShowSubmenuByMove(false);
        int i19 = org.telegram.ui.ActionBar.j6.f17954eg;
        kVar.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.u0(i19), 6, 6));
        org.telegram.ui.ActionBar.w0 w0Var4 = this.f33977k1;
        org.telegram.ui.ActionBar.g1 d = w0Var4.d(1, 0, null, LocaleController.getString(R.string.VoipGroupAllCanSpeak), true, true, w0Var4.m0);
        this.f34018u1 = d;
        d.j(true, false);
        org.telegram.ui.ActionBar.w0 w0Var5 = this.f33977k1;
        org.telegram.ui.ActionBar.g1 d10 = w0Var5.d(2, 0, null, LocaleController.getString(R.string.VoipGroupOnlyAdminsCanSpeak), true, true, w0Var5.m0);
        this.f34022v1 = d10;
        d10.j(false, true);
        int i20 = org.telegram.ui.ActionBar.j6.f18280wg;
        d.setCheckColor(i20);
        d.c(org.telegram.ui.ActionBar.j6.u0(i20), org.telegram.ui.ActionBar.j6.u0(i20));
        d10.setCheckColor(i20);
        d10.c(org.telegram.ui.ActionBar.j6.u0(i20), org.telegram.ui.ActionBar.j6.u0(i20));
        Paint paint3 = new Paint(1);
        int i21 = org.telegram.ui.ActionBar.j6.f18007hg;
        paint3.setColor(org.telegram.ui.ActionBar.j6.u0(i21));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.w0 w0Var6 = this.f33977k1;
        org.telegram.ui.ActionBar.g1 d11 = w0Var6.d(10, R.drawable.msg_voice_speaker, null, LocaleController.getString(R.string.VoipGroupAudio), true, false, w0Var6.m0);
        this.f33996p1 = d11;
        d11.setItemHeight(56);
        org.telegram.ui.ActionBar.w0 w0Var7 = this.f33977k1;
        org.telegram.ui.ActionBar.g1 d12 = w0Var7.d(11, R.drawable.msg_noise_on, null, LocaleController.getString(R.string.VoipNoiseCancellation), true, false, w0Var7.m0);
        this.f34000q1 = d12;
        d12.setItemHeight(56);
        TextView b10 = this.f33977k1.b(i0.a.d(0.3f, org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.f17990gg), -16777216));
        this.A1 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.w0 w0Var8 = this.f33977k1;
        org.telegram.ui.ActionBar.g1 d13 = w0Var8.d(6, R.drawable.msg_edit, this.f33949d1, LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEditTitle : R.string.VoipGroupEditTitle), true, false, w0Var8.m0);
        this.f33992o1 = d13;
        org.telegram.ui.ActionBar.w0 w0Var9 = this.f33977k1;
        org.telegram.ui.ActionBar.g1 d14 = w0Var9.d(7, R.drawable.msg_permissions, this.f33949d1, LocaleController.getString(R.string.VoipGroupEditPermissions), false, false, w0Var9.m0);
        this.f34005r1 = d14;
        org.telegram.ui.ActionBar.g1 e = this.f33977k1.e(3, R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareInviteLink));
        this.f33988n1 = e;
        e60 e60Var = new e60();
        this.f33949d1 = e60Var;
        org.telegram.ui.ActionBar.g1 e7 = this.f33977k1.e(9, R.drawable.msg_screencast, LocaleController.getString(R.string.VoipChatStartScreenCapture));
        this.f34014t1 = e7;
        org.telegram.ui.ActionBar.w0 w0Var10 = this.f33977k1;
        org.telegram.ui.ActionBar.g1 d15 = w0Var10.d(5, 0, e60Var, LocaleController.getString(R.string.VoipGroupRecordCall), true, false, w0Var10.m0);
        this.f34010s1 = d15;
        e60Var.a(d15.getImageView());
        org.telegram.ui.ActionBar.g1 e10 = this.f33977k1.e(12, R.drawable.menu_stream_comments_24, LocaleController.getString(R.string.VoipChannelEnableComments));
        this.f34032x1 = e10;
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        org.telegram.ui.ActionBar.g1 e11 = this.f33977k1.e(13, R.drawable._menu_stream_comments_off_24, LocaleController.getString(R.string.VoipChannelDisableComments));
        this.f34037y1 = e11;
        org.telegram.ui.ActionBar.w0 w0Var11 = this.f33977k1;
        int i22 = R.drawable.msg_cancel;
        if (o1()) {
            i10 = i21;
            string = LocaleController.getString(R.string.VoipGroupEndConference);
        } else {
            string = LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat);
            i10 = i21;
        }
        org.telegram.ui.ActionBar.g1 e12 = w0Var11.e(4, i22, string);
        this.f34027w1 = e12;
        this.f33977k1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.j6.u0(i19));
        this.f33977k1.getPopupLayout().setFitItems(true);
        e10.c(org.telegram.ui.ActionBar.j6.u0(i10), org.telegram.ui.ActionBar.j6.u0(i10));
        e11.c(org.telegram.ui.ActionBar.j6.u0(i10), org.telegram.ui.ActionBar.j6.u0(i10));
        d11.c(org.telegram.ui.ActionBar.j6.u0(i10), org.telegram.ui.ActionBar.j6.u0(i10));
        d12.c(org.telegram.ui.ActionBar.j6.u0(i10), org.telegram.ui.ActionBar.j6.u0(i10));
        int i23 = org.telegram.ui.ActionBar.j6.f18262vg;
        e12.c(org.telegram.ui.ActionBar.j6.u0(i23), org.telegram.ui.ActionBar.j6.u0(i23));
        e.c(org.telegram.ui.ActionBar.j6.u0(i10), org.telegram.ui.ActionBar.j6.u0(i10));
        d13.c(org.telegram.ui.ActionBar.j6.u0(i10), org.telegram.ui.ActionBar.j6.u0(i10));
        d14.c(org.telegram.ui.ActionBar.j6.u0(i10), org.telegram.ui.ActionBar.j6.u0(i10));
        d15.c(org.telegram.ui.ActionBar.j6.u0(i10), org.telegram.ui.ActionBar.j6.u0(i10));
        e7.c(org.telegram.ui.ActionBar.j6.u0(i10), org.telegram.ui.ActionBar.j6.u0(i10));
        if (this.f33936a1 != null) {
            l1();
        }
        if (o1()) {
            this.f33995p0 = new u50();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.f33995p0.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        P1(false);
        this.O.getTitleTextView().setOnClickListener(new u20(this, 3));
        x30 x30Var = new x30(this, launchActivity);
        this.f33984m2 = x30Var;
        y30 y30Var = new y30(this);
        this.N2 = y30Var;
        x30Var.setClipToPadding(false);
        y30Var.S();
        y30Var.f41667o = org.telegram.ui.Components.wr.f28819f;
        y30Var.d = 350L;
        y30Var.f41691c = 350L;
        y30Var.e = 350L;
        x30Var.setItemAnimator(y30Var);
        x30Var.setOnScrollListener(new z30(this));
        x30Var.setClipChildren(false);
        s4.c0 c0Var = new s4.c0();
        c0Var.j1(0);
        x30Var.setLayoutManager(c0Var);
        org.telegram.ui.Components.b30 b30Var = new org.telegram.ui.Components.b30(call, this.currentAccount, this);
        this.f33997p2 = b30Var;
        x30Var.setAdapter(b30Var);
        b30Var.F(x30Var, false);
        x30Var.setOnItemClickListener(new org.telegram.ui.Components.jl0(this) {
            public final j60 f37398b;

            {
                this.f37398b = this;
            }

            @Override
            public final void d(int i152, View view2) {
                switch (r2) {
                    case 0:
                        j60 j60Var2 = this.f37398b;
                        j60Var2.getClass();
                        org.telegram.ui.Components.a30 a30Var = (org.telegram.ui.Components.a30) view2;
                        if (a30Var.getVideoParticipant() == null) {
                            j60Var2.e1(new ChatObject.VideoParticipant(a30Var.getParticipant(), false, false));
                            return;
                        } else {
                            j60Var2.e1(a30Var.getVideoParticipant());
                            return;
                        }
                    default:
                        j60 j60Var3 = this.f37398b;
                        j60Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view2;
                        if (lVar.getParticipant() != null) {
                            j60Var3.e1(lVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        x30Var.setOnItemLongClickListener(new t20(this, 1));
        x30Var.setVisibility(8);
        x30Var.i(new a40());
        b40 b40Var = new b40(this, launchActivity, this.Q, x30Var, this.Y1, this.f33936a1, this);
        this.a2 = b40Var;
        b40Var.setClipChildren(false);
        b30Var.E(this.Y1, b40Var);
        if (this.f33989n2 != null) {
            this.f33993o2.G(this.Y1, b40Var);
        }
        c40 c40Var = new c40(this, launchActivity);
        this.D2 = c40Var;
        d40 d40Var = new d40(this, launchActivity, this.O, this.Q, c40Var);
        this.f33938b = d40Var;
        d40Var.setImagesLayerNum(Integer.MAX_VALUE);
        d40Var.setInvalidateWithParent(true);
        c40Var.setProfileGalleryView(d40Var);
        e40 e40Var = new e40(this, launchActivity);
        this.C2 = e40Var;
        e40Var.setVisibility(8);
        d40Var.setVisibility(0);
        d40Var.b(new f40(this));
        g40 g40Var = new g40(this, launchActivity);
        this.f33941b2 = g40Var;
        this.containerView.addView(b40Var);
        b40Var.addView(x30Var, w7.a6.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.e.setWillNotDraw(false);
        View view2 = new View(launchActivity);
        this.J2 = view2;
        int[] iArr = this.M2;
        iArr[0] = this.V1;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.M2);
        this.L2 = gradientDrawable;
        view2.setBackground(gradientDrawable);
        this.containerView.addView(view2, w7.a6.e(-1, 60, 83));
        View view3 = new View(launchActivity);
        this.K2 = view3;
        view3.setBackgroundColor(this.M2[0]);
        this.containerView.addView(view3, w7.a6.e(-1, 0, 83));
        kh.h hVar = new kh.h(launchActivity);
        this.f33944c0 = hVar;
        hVar.setDelegate(new h40(this));
        hVar.setClickCellDelegate(new i40(this));
        if (this.f33936a1 != null) {
            hVar.C0(this.d.getCurrentAccount(), this.f33936a1.getInputGroupCall(false));
        }
        this.containerView.addView(hVar, w7.a6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(launchActivity, false, true, true);
        this.M = o6Var;
        o6Var.setGravity(17);
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setTextColor(-1);
        o6Var.b(0.4f, 320L, org.telegram.ui.Components.wr.h);
        o6Var.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.e);
        j40 j40Var = new j40(this, launchActivity, this.L, LaunchActivity.R(), this.resourcesProvider);
        this.H = j40Var;
        j40Var.J = true;
        j40Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f33948d0)});
        j40Var.getEditText().setLinkTextColor(-11683585);
        j40Var.setHint(LocaleController.getString(R.string.TypeMessage));
        j40Var.getEditText().addTextChangedListener(new k40(this));
        j40Var.s();
        l40 l40Var = new l40(this, launchActivity);
        this.G = l40Var;
        this.containerView.addView(l40Var, w7.a6.c(-1.0f, -1));
        m40 m40Var = new m40(launchActivity);
        this.F = m40Var;
        m40Var.addView(j40Var, w7.a6.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        m40Var.addView(o6Var, w7.a6.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        o6Var.setTranslationY(-AndroidUtilities.dp(20.0f));
        this.containerView.addView(m40Var, w7.a6.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.J = imageView3;
        int i24 = org.telegram.ui.ActionBar.j6.f18017i6;
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i24), 1, -1));
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f7, this.resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new u20(this, 4));
        ImageView imageView4 = new ImageView(launchActivity);
        this.I = imageView4;
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i24), 1, -1));
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18254v6, this.resourcesProvider), mode));
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new u20(this, 5));
        m40Var.addView(imageView3, w7.a6.e(48, 48, 85));
        m40Var.addView(imageView4, w7.a6.e(48, 48, 85));
        this.containerView.addView(g40Var);
        e40Var.addView(d40Var, w7.a6.c(-1.0f, -1));
        e40Var.addView(c40Var, w7.a6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(e40Var, w7.a6.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        O0(false);
        this.P.l();
        if (G3) {
            this.f33993o2.I(this.f33989n2, false);
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
            this.containerView.addView(textView, w7.a6.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.dd0 dd0Var = new org.telegram.ui.Components.dd0(launchActivity);
            dd0Var.setTextColor(-1);
            dd0Var.setSelectorColor(-9598483);
            dd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            dd0Var.setItemCount(5);
            o40 o40Var = new o40(launchActivity);
            o40Var.setItemCount(5);
            o40Var.setTextColor(-1);
            o40Var.setSelectorColor(-9598483);
            o40Var.setTextOffset(-AndroidUtilities.dp(10.0f));
            p40 p40Var = new p40(launchActivity);
            p40Var.setItemCount(5);
            p40Var.setTextColor(-1);
            p40Var.setSelectorColor(-9598483);
            p40Var.setTextOffset(-AndroidUtilities.dp(34.0f));
            q40 q40Var = new q40(launchActivity);
            this.T = q40Var;
            q40Var.setLines(1);
            q40Var.setSingleLine(true);
            q40Var.setEllipsize(TextUtils.TruncateAt.END);
            q40Var.setGravity(17);
            q40Var.setTextColor(-1);
            q40Var.setTypeface(AndroidUtilities.bold());
            q40Var.setTextSize(1, 14.0f);
            this.containerView.addView(q40Var, w7.a6.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            q40Var.setOnClickListener(new org.telegram.messenger.video.f(this, dd0Var, o40Var, p40Var, chat, accountInstance, inputPeer2, 1));
            s40 s40Var = new s40(launchActivity, dd0Var, o40Var, p40Var);
            this.R = s40Var;
            s40Var.setWeightSum(1.0f);
            s40Var.setOrientation(0);
            this.containerView.addView(s40Var, w7.a6.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i25 = calendar.get(1);
            int i26 = calendar.get(6);
            s40Var.addView(dd0Var, w7.a6.l(0.5f, 0, 270));
            dd0Var.setMinValue(0);
            dd0Var.setMaxValue(365);
            dd0Var.setWrapSelectorWheel(false);
            dd0Var.setFormatter(new y20(currentTimeMillis, calendar, i25, 0));
            a1.d dVar = new a1.d(this, dd0Var, o40Var, p40Var, 11);
            j60Var = this;
            dd0Var.setOnValueChangedListener(dVar);
            o40Var.setMinValue(0);
            o40Var.setMaxValue(23);
            s40Var.addView(o40Var, w7.a6.l(0.2f, 0, 270));
            o40Var.setFormatter(new org.telegram.ui.Components.gp0(19));
            o40Var.setOnValueChangedListener(dVar);
            p40Var.setMinValue(0);
            p40Var.setMaxValue(59);
            p40Var.setValue(0);
            p40Var.setFormatter(new org.telegram.ui.Components.gp0(20));
            s40Var.addView(p40Var, w7.a6.l(0.3f, 0, 270));
            p40Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i27 = calendar.get(6);
            int i28 = calendar.get(12);
            int i29 = calendar.get(11);
            dd0Var.setValue(i26 != i27 ? 1 : 0);
            p40Var.setValue(i28);
            o40Var.setValue(i29);
            org.telegram.ui.Components.d5.g(q40Var, textView, 0L, 604800L, 2, dd0Var, o40Var, p40Var);
        } else {
            j60Var = this;
        }
        t40 t40Var = new t40(j60Var, (ViewGroup) j60Var.getWindow().getDecorView(), j60Var.containerView);
        j60Var.f33946c2 = t40Var;
        t40Var.E = new u40(j60Var);
        d40Var.setPinchToZoomHelper(t40Var);
        j60Var.f33986n.setOnClickListener(new View.OnClickListener(j60Var) {
            public final j60 f39192b;

            {
                this.f39192b = j60Var;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        j60.o(this.f39192b, launchActivity);
                        return;
                    default:
                        j60 j60Var2 = this.f39192b;
                        j60Var2.a2.e();
                        ChatObject.Call call2 = j60Var2.f33936a1;
                        if (call2 != null && !call2.isScheduled()) {
                            j60Var2.I1();
                            j60.t1(launchActivity, new w20(j60Var2, 5), false, false);
                            return;
                        }
                        j60Var2.dismiss();
                        return;
                }
            }
        });
        j60Var.L1(false);
        j60Var.I1();
        j60Var.M1(false);
        j60Var.N1(false, false);
        j60Var.B1(0.0f);
        j60Var.O1();
        j60Var.containerView.addView(new FrameLayout(launchActivity), w7.a6.e(-1, 200, 87));
        j60Var.v.setOnClickListener(new u20(j60Var, 6));
        j60Var.T0();
        w7.c6.a(j60Var.f33986n);
        w7.c6.a(j60Var.f34003r);
        w7.c6.a(j60Var.f33956f);
        w7.c6.a(j60Var.h);
        w7.c6.a(j60Var.f34025w);
        w7.c6.a(j60Var.f34008s);
        w7.c6.a(j60Var.v);
        r0.i0.m(j60Var.containerView, new t20(j60Var, 2));
    }

    public static void A(j60 j60Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        boolean z10;
        TLRPC.GroupCall groupCall;
        d2Var.dismiss();
        if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
            Context context = j60Var.getContext();
            int i10 = j60Var.currentAccount;
            TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
            String str = ((TL_phone.exportedGroupCallInvite) tLObject).link;
            org.telegram.ui.ActionBar.f6 f6Var = j60Var.resourcesProvider;
            ChatObject.Call call = j60Var.f33936a1;
            if (call != null && (groupCall = call.call) != null && groupCall.creator) {
                z10 = true;
            } else {
                z10 = false;
            }
            k9.o0(context, i10, inputGroupCall, str, f6Var, false, z10);
        } else if (tL_error != null) {
            new org.telegram.ui.Components.wc(j60Var.topBulletinContainer, new org.telegram.ui.Components.bq0()).d0(tL_error, false);
        }
    }

    public static String A0() {
        String[][] strArr = EmojiData.data;
        String[] strArr2 = strArr[(int) Math.floor(Math.random() * strArr.length)];
        return strArr2[(int) Math.floor(Math.random() * strArr2.length)];
    }

    public static void B0(j60 j60Var) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("reminderhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("reminderhint", true).commit();
        if (j60Var.f33987n0 == null) {
            org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(j60Var.getContext(), 8);
            j60Var.f33987n0 = s40Var;
            s40Var.setAlpha(0.0f);
            j60Var.f33987n0.setVisibility(4);
            j60Var.f33987n0.setShowingDuration(4000L);
            j60Var.containerView.addView(j60Var.f33987n0, w7.a6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            j60Var.f33987n0.setText(LocaleController.getString(R.string.VoipChatReminderHint));
            j60Var.f33987n0.d();
        }
        j60Var.f33987n0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        j60Var.f33987n0.f(j60Var.f34025w, true);
    }

    public static void C(j60 j60Var, int[] iArr, float[] fArr) {
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        s4.c1 K;
        x30 x30Var = j60Var.f33984m2;
        b40 b40Var = j60Var.a2;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant = j60Var.f33936a1.participantsBySources.get(iArr[i10]);
            if (groupCallParticipant != null) {
                if (!b40Var.f28241b) {
                    if (j60Var.f34009s0) {
                        arrayList = j60Var.D0;
                    } else {
                        arrayList = j60Var.f33936a1.visibleParticipants;
                    }
                    int indexOf = arrayList.indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = j60Var.Q.K(indexOf + j60Var.P.d)) != null) {
                        View view = K.f41610a;
                        if (view instanceof org.telegram.ui.Cells.d4) {
                            ((org.telegram.ui.Cells.d4) view).setAmplitude(fArr[i10] * 15.0f);
                            if (view == j60Var.X2 && !j60Var.f33981l2) {
                                j60Var.containerView.invalidate();
                            }
                        }
                    }
                } else {
                    for (int i11 = 0; i11 < x30Var.getChildCount(); i11++) {
                        org.telegram.ui.Components.a30 a30Var = (org.telegram.ui.Components.a30) x30Var.getChildAt(i11);
                        if (MessageObject.getPeerId(a30Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                            a30Var.setAmplitude(fArr[i10] * 15.0f);
                        }
                    }
                }
                b40Var.k(groupCallParticipant, fArr[i10] * 15.0f);
            }
        }
    }

    public static void D(j60 j60Var) {
        Editable text = j60Var.H.getText();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = text.toString();
        tL_textWithEntities.entities = MediaDataController.getInstance(j60Var.currentAccount).getEntities(new CharSequence[]{text}, true);
        j60Var.A1(tL_textWithEntities);
    }

    public static void F0(j60 j60Var) {
        ChatObject.Call call = j60Var.f33936a1;
        if (call != null && call.call != null) {
            TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
            togglegroupcallsettings.call = j60Var.f33936a1.getInputGroupCall();
            togglegroupcallsettings.join_muted = Boolean.valueOf(j60Var.f33936a1.call.join_muted);
            ConnectionsManager connectionsManager = j60Var.d.getConnectionsManager();
            DispatchQueue dispatchQueue = Utilities.stageQueue;
            Objects.requireNonNull(dispatchQueue);
            connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.e1(dispatchQueue), new f30(j60Var, 1));
        }
    }

    public static void G0(j60 j60Var, boolean z10) {
        if (j60Var.f33936a1 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = j60Var.f33936a1.getInputGroupCall();
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        j60Var.f34034x3 = Boolean.valueOf(z10);
        j60Var.H1(true);
        ConnectionsManager connectionsManager = j60Var.d.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.e1(dispatchQueue), new f30(j60Var, 0));
    }

    public static void H0(j60 j60Var) {
        boolean z10;
        int i10;
        if (j60Var.r1()) {
            b40 b40Var = j60Var.a2;
            if (!b40Var.V && b40Var.f28241b && (F3 == j60Var.q1() || AndroidUtilities.isTablet())) {
                z10 = false;
            } else {
                z10 = true;
            }
            Boolean bool = j60Var.f33975j2;
            if (bool != null && z10 == bool.booleanValue()) {
                return;
            }
            int systemUiVisibility = j60Var.containerView.getSystemUiVisibility();
            if (z10) {
                i10 = systemUiVisibility & (-7);
                j60Var.getWindow().clearFlags(1024);
                j60Var.setHideSystemVerticalInsets(false);
            } else {
                j60Var.setHideSystemVerticalInsets(true);
                i10 = systemUiVisibility | 6;
                j60Var.getWindow().addFlags(1024);
            }
            j60Var.containerView.setSystemUiVisibility(i10);
            j60Var.f33975j2 = Boolean.valueOf(z10);
            j60Var.S2 = !z10;
            j60Var.containerView.requestApplyInsets();
            return;
        }
        j60Var.isFullscreen = false;
    }

    public static org.telegram.ui.Components.voip.l I0(j60 j60Var) {
        p50 p50Var = j60Var.Q;
        for (int i10 = 0; i10 < p50Var.getChildCount(); i10++) {
            View childAt = p50Var.getChildAt(i10);
            if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.l) && RecyclerView.R(childAt) >= 0) {
                return (org.telegram.ui.Components.voip.l) childAt;
            }
        }
        return null;
    }

    public static void J0(j60 j60Var) {
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
        boolean z12;
        View childAt;
        f50 f50Var = j60Var.O;
        p50 p50Var = j60Var.Q;
        int childCount = p50Var.getChildCount();
        float f14 = 2.1474836E9f;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (RecyclerView.R(p50Var.getChildAt(i10)) >= 0) {
                f14 = Math.min(f14, childAt.getTop());
            }
        }
        if (f14 < 0.0f || f14 == 2.1474836E9f) {
            if (childCount != 0) {
                f14 = 0.0f;
            } else {
                f14 = p50Var.getPaddingTop();
            }
        }
        if (f14 <= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - AndroidUtilities.dp(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float dp4 = f14 + AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        if ((z10 && f50Var.getTag() == null) || (!z10 && f50Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            f50Var.setTag(num);
            AnimatorSet animatorSet = j60Var.f33965h0;
            if (animatorSet != null) {
                animatorSet.cancel();
                j60Var.f33965h0 = null;
            }
            if (f50Var.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            j60Var.setUseLightStatusBar(z11);
            ViewPropertyAnimator animate = f50Var.getBackButton().animate();
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
            org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.f28819f;
            duration.setInterpolator(wrVar).start();
            ViewPropertyAnimator animate2 = f50Var.getTitleTextView().animate();
            if (z10) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(23.0f);
            }
            animate2.translationY(dp).setDuration(300L).setInterpolator(wrVar).start();
            ObjectAnimator objectAnimator = j60Var.U2;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                j60Var.U2.cancel();
            }
            org.telegram.ui.ActionBar.l5 subtitleTextView = f50Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            float translationY = f50Var.getSubtitleTextView().getTranslationY();
            if (z10) {
                dp2 = 0.0f;
            } else {
                dp2 = AndroidUtilities.dp(20.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, property, translationY, dp2);
            j60Var.U2 = ofFloat;
            ofFloat.setDuration(300L);
            j60Var.U2.setInterpolator(wrVar);
            j60Var.U2.addListener(new org.telegram.ui.Components.yo(25, j60Var, z10));
            j60Var.U2.start();
            ObjectAnimator objectAnimator2 = j60Var.V2;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            org.telegram.ui.ActionBar.l5 additionalSubtitleTextView = f50Var.getAdditionalSubtitleTextView();
            if (z10) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(20.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(additionalSubtitleTextView, property, dp3);
            j60Var.V2 = ofFloat2;
            ofFloat2.setDuration(300L);
            j60Var.V2.setInterpolator(wrVar);
            j60Var.V2.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            j60Var.f33965h0 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = j60Var.f33965h0;
            Property property2 = View.ALPHA;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(f50Var, property2, f11);
            u30 u30Var = j60Var.N;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(u30Var, property2, f12);
            View view = j60Var.f33961g0;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, property2, f13));
            j60Var.f33965h0.addListener(new d50(j60Var, 1));
            j60Var.f33965h0.start();
            ImageView imageView = j60Var.a2.v;
            if (z10 && !F3) {
                z12 = false;
            } else {
                z12 = true;
            }
            imageView.setClickable(z12);
        }
        if (j60Var.f34036y0 != dp4) {
            j60Var.E1(dp4);
        }
    }

    public static void N(j60 j60Var, org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (!j60Var.isDismissed()) {
            if (z10 && lVar.getRenderer() == null) {
                lVar.setRenderer(org.telegram.ui.Components.voip.t.c(j60Var.Y1, j60Var.a2, lVar, null, null, lVar.getParticipant(), j60Var.f33936a1, j60Var));
            } else if (!z10 && lVar.getRenderer() != null) {
                lVar.getRenderer().setPrimaryView(null);
                lVar.setRenderer(null);
            }
        }
    }

    public static void S(j60 j60Var, int i10, int[] iArr) {
        if (j60Var.r1()) {
            int i11 = org.telegram.ui.ActionBar.j6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18335zg, false), j60Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18065kg, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false), j60Var.U1, 1.0f);
        } else if (i10 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Jg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18316yg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18335zg, false), j60Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18298xg, false);
        } else if (i10 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Gg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Bg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Cg, false), j60Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ag, false);
        } else if (p1(i10)) {
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18066kh, false);
            iArr[1] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18084lh, false);
            iArr[2] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18102mh, false);
        } else {
            int i12 = org.telegram.ui.ActionBar.j6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Mg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ng, false), j60Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18065kg, false), org.telegram.ui.ActionBar.j6.w0(null, i12, false), j60Var.U1, 1.0f);
        }
        if (p1(i10)) {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18027ih, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18066kh, false));
        } else if (i10 == 1) {
            iArr[3] = i0.a.d(0.75f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Bg, false), i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Fg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Hg, false)));
        } else {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Jg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ig, false));
        }
    }

    public static void c1(LaunchActivity launchActivity, AccountInstance accountInstance, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        if (D3 == null) {
            if (inputPeer != null || VoIPService.getSharedInstance() != null) {
                if (inputPeer != null) {
                    D3 = new j60(launchActivity, accountInstance, accountInstance.getMessagesController().getGroupCall(chat.f17195id, false), chat, inputPeer, z10, str);
                } else {
                    ChatObject.Call call = VoIPService.getSharedInstance().groupCall;
                    if (call != null) {
                        TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(call.chatId));
                        call.addSelfDummyParticipant(true);
                        D3 = new j60(launchActivity, accountInstance, call, chat2, null, z10, str);
                    } else {
                        return;
                    }
                }
                D3.f33969i0 = launchActivity;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c30(11));
            }
        }
    }

    public static String f1(int i10) {
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

    public static String g1(int i10) {
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

    public static void m(j60 j60Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(j60Var.currentAccount).sendRequest(declineconferencecallinvite, new e30(j60Var, 0));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(invitedUser.msg_id));
        MessagesController.getInstance(j60Var.currentAccount).deleteMessages(arrayList, null, null, 0L, 0, true, 0);
        ChatObject.Call call = j60Var.f33936a1;
        if (call != null) {
            call.invitedUsers.remove(l4);
            j60Var.f33936a1.invitedUsersMap.remove(l4);
            j60Var.f33936a1.invitedUsersMessageIds.remove(l4);
            j60Var.O0(true);
        }
    }

    public static void n(j60 j60Var, Activity activity, ChatObject.Call call, View view, int i10) {
        TLRPC.Chat chat;
        final ChatObject.Call.InvitedUser invitedUser;
        AccountInstance accountInstance = j60Var.d;
        ArrayList arrayList = j60Var.F0;
        d60 d60Var = j60Var.P;
        if (view instanceof org.telegram.ui.Components.voip.l) {
            j60Var.e1(((org.telegram.ui.Components.voip.l) view).getParticipant());
        } else if (view instanceof org.telegram.ui.Cells.d4) {
            j60Var.F1((org.telegram.ui.Cells.d4) view);
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
                    if (j60Var.o1()) {
                        int i11 = i10 - d60Var.f31840n;
                        if (i11 >= 0 && i11 < j60Var.f33936a1.shadyJoinParticipants.size()) {
                            l4 = j60Var.f33936a1.shadyJoinParticipants.get(i10 - d60Var.f31840n);
                        } else {
                            int i12 = i10 - d60Var.f31842s;
                            if (i12 >= 0 && i12 < j60Var.f33936a1.shadyLeftParticipants.size()) {
                                l4 = j60Var.f33936a1.shadyLeftParticipants.get(i10 - d60Var.f31842s);
                            } else {
                                int i13 = i10 - d60Var.f31839f;
                                if (j60Var.f34009s0) {
                                    if (i13 >= 0 && i13 < arrayList.size()) {
                                        l4 = (Long) arrayList.get(i13);
                                    }
                                } else if (i13 >= 0 && i13 < j60Var.f33936a1.invitedUsers.size()) {
                                    l4 = j60Var.f33936a1.invitedUsers.get(i13);
                                }
                                z10 = false;
                            }
                        }
                        if (!z10 && (invitedUser = j60Var.f33936a1.invitedUsersMessageIds.get(l4)) != null) {
                            org.telegram.ui.Components.w70 F = org.telegram.ui.Components.w70.F(j60Var.container, j60Var.resourcesProvider, v3Var);
                            F.l(R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable(j60Var) {
                                public final j60 f31520b;

                                {
                                    this.f31520b = j60Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            j60.r(this.f31520b, invitedUser, l4);
                                            return;
                                        default:
                                            j60.m(this.f31520b, invitedUser, l4);
                                            return;
                                    }
                                }
                            }, invitedUser.isCalling());
                            F.c(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable(j60Var) {
                                public final j60 f31520b;

                                {
                                    this.f31520b = j60Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            j60.r(this.f31520b, invitedUser, l4);
                                            return;
                                        default:
                                            j60.m(this.f31520b, invitedUser, l4);
                                            return;
                                    }
                                }
                            }, false);
                            F.W(org.telegram.ui.ActionBar.j6.c0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), j60Var.C0.getColor()));
                            F.f28701s = 96;
                            F.Z();
                            return;
                        }
                        return;
                    }
                    j60Var.f33969i0.K0(j60Var.currentAccount);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", v3Var.getUser().f17342id);
                    if (v3Var.f20540a.getImageReceiver().hasNotThumb()) {
                        bundle.putBoolean("expandPhoto", true);
                    }
                    j60Var.f33969i0.p0(new ProfileActivity(bundle, null));
                    j60Var.dismiss();
                }
            } else if (i10 == d60Var.f31843w) {
                if (ChatObject.isChannel(j60Var.Z0) && (chat = j60Var.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)) {
                    j60Var.j1(false);
                    return;
                }
                TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j60Var.i1());
                if (chatFull != null) {
                    j60Var.f34026w0 = false;
                    Context context = j60Var.getContext();
                    int currentAccount = accountInstance.getCurrentAccount();
                    TLRPC.Chat chat2 = j60Var.Z0;
                    ChatObject.Call call2 = j60Var.f33936a1;
                    org.telegram.ui.Components.b40 b40Var = new org.telegram.ui.Components.b40(context, currentAccount, chat2, chatFull, call2.participants, call2.invitedUsersMap);
                    j60Var.E1 = b40Var;
                    b40Var.setOnDismissListener(new a30(j60Var, 2));
                    org.telegram.ui.Components.b40 b40Var2 = j60Var.E1;
                    b40Var2.f21710g0 = new k30(j60Var);
                    b40Var2.show();
                }
            } else if (i10 == d60Var.f31844x) {
                ChatObject.Call call3 = j60Var.f33936a1;
                if (call3 != null && call3.call != null) {
                    sg.p1 p1Var = new sg.p1(activity, j60Var.currentAccount, null, 4, new org.telegram.ui.Components.bq0());
                    ChatObject.Call call4 = j60Var.f33936a1;
                    if (call4 != null) {
                        collection = (Collection) Collection.EL.stream(call4.sortedParticipants).map(new l8(4)).collect(Collectors.toSet());
                    }
                    p1Var.C0.addAll(collection);
                    p1Var.h0(false, true);
                    p1Var.A0 = new w20(j60Var, 3);
                    p1Var.h0(false, true);
                    p1Var.D0 = new bi.k6(12, j60Var, call);
                    p1Var.show();
                }
            } else if (i10 == d60Var.f31845y) {
                j60Var.v1();
            }
        }
    }

    public static void o(j60 j60Var, Activity activity) {
        LaunchActivity launchActivity;
        if (Build.VERSION.SDK_INT >= 23 && (launchActivity = j60Var.f33969i0) != null && launchActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
            j60Var.f33969i0.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
        } else if (VoIPService.getSharedInstance() != null) {
            boolean z10 = false;
            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                j60Var.f33973j0[0].e(1, false);
                if (j60Var.f34039z0 == null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null) {
                        sharedInstance.createCaptureDevice(false);
                    }
                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                        z10 = true;
                    }
                    v40 v40Var = new v40(j60Var, activity, z10);
                    j60Var.f34039z0 = v40Var;
                    v40Var.setBottomPadding(j60Var.containerView.getPaddingBottom());
                    j60Var.container.addView(j60Var.f34039z0);
                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                        return;
                    }
                    return;
                }
                return;
            }
            VoIPService.getSharedInstance().setVideoState(false, 0);
            j60Var.N1(true, false);
            j60Var.M1(false);
            j60Var.f33936a1.sortParticipants();
            j60Var.O0(true);
            j60Var.e.requestLayout();
        }
    }

    public static void p(j60 j60Var, float f7, float f10, float f11, int i10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        j60Var.f33950d2 = floatValue;
        j60Var.a2.f28255n = floatValue;
        float f12 = (floatValue * 1.0f) + ((1.0f - floatValue) * f7);
        e40 e40Var = j60Var.C2;
        e40Var.setScaleX(f12);
        e40Var.setScaleY(f12);
        e40Var.setTranslationX((1.0f - j60Var.f33950d2) * f10);
        e40Var.setTranslationY((1.0f - j60Var.f33950d2) * f11);
        if (!j60Var.f33963g2) {
            j60Var.W2.setAlpha((int) (j60Var.f33950d2 * 100.0f));
        }
        org.telegram.ui.Components.voip.t tVar = j60Var.Z2;
        if (tVar != null) {
            tVar.f28409a.setRoundCorners((1.0f - j60Var.f33950d2) * AndroidUtilities.dp(8.0f));
        }
        e40Var.invalidate();
        j60Var.containerView.invalidate();
        d40 d40Var = j60Var.f33938b;
        int i11 = (int) ((1.0f - j60Var.f33950d2) * i10);
        d40Var.N(i11, i11);
    }

    public static boolean p1(int i10) {
        if ((VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.call.rtmp_stream) && i10 != 2 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            return false;
        }
        return true;
    }

    public static void q(j60 j60Var, ChatObject.Call call, Boolean bool, HashSet hashSet) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        ChatObject.Call call2 = j60Var.f33936a1;
        if (call2 != null && (groupCall = call2.call) != null) {
            String str = groupCall.invite_link;
            int size = hashSet.size();
            AtomicInteger atomicInteger = new AtomicInteger(0);
            HashSet hashSet2 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                j60Var.f33936a1.addInvitedUser(longValue);
                TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                inviteconferencecallparticipant.call = tL_inputGroupCall;
                TLRPC.GroupCall groupCall2 = j60Var.f33936a1.call;
                tL_inputGroupCall.f17212id = groupCall2.f17205id;
                tL_inputGroupCall.access_hash = groupCall2.access_hash;
                inviteconferencecallparticipant.user_id = MessagesController.getInstance(j60Var.currentAccount).getInputUser(longValue);
                inviteconferencecallparticipant.video = bool.booleanValue();
                ConnectionsManager.getInstance(j60Var.currentAccount).sendRequest(inviteconferencecallparticipant, new di.e1(j60Var, longValue, hashSet2, atomicInteger, size, call, str));
            }
            j60Var.O0(true);
            if (bool.booleanValue() && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(false) != 1) {
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                sharedInstance.requestVideoCall(false);
                sharedInstance.setVideoState(false, 2);
                sharedInstance.setMicMute(false, false, true);
                sharedInstance.switchToSpeaker();
                j60Var.N1(true, true);
            }
        }
    }

    public static void r(j60 j60Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(j60Var.currentAccount).sendRequest(declineconferencecallinvite, new e30(j60Var, 1));
        ChatObject.Call call = j60Var.f33936a1;
        if (call != null) {
            invitedUser.calling = false;
            call.invitedUsersMessageIds.put(l4, invitedUser);
            j60Var.O0(true);
        }
    }

    public static void s(j60 j60Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(j60Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static void t(j60 j60Var) {
        j60Var.Y0();
        j60Var.V0();
        j60Var.U0();
        j60Var.F.setTranslationY((-j60Var.C1.c()) + j60Var.containerView.getPaddingBottom());
        j60Var.G.invalidate();
        j60Var.Z0();
        j60Var.containerView.invalidate();
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
                    alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertTitle);
                    alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertText);
                } else if (ChatObject.isChannelOrGiga(chat)) {
                    alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.VoipChannelLeaveAlertTitle);
                    alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.VoipChannelLeaveAlertText);
                } else {
                    alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.VoipGroupLeaveAlertTitle);
                    alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.VoipGroupLeaveAlertText);
                }
                sharedInstance.getAccount();
                org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
                LinearLayout f7 = org.telegram.messenger.em.f(context, 1);
                if (!sharedInstance.isConference() || (call != null && (groupCall = call.call) != null && groupCall.creator)) {
                    org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1);
                    z1VarArr[0] = z1Var;
                    z1Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    if (z10) {
                        z1VarArr[0].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false));
                    } else {
                        z1VarArr[0].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18007hg, false));
                        CheckBoxSquare checkBoxSquare = (CheckBoxSquare) z1VarArr[0].getCheckBoxView();
                        int i10 = org.telegram.ui.ActionBar.j6.f18190rg;
                        int i11 = org.telegram.ui.ActionBar.j6.f18153pg;
                        int i12 = org.telegram.ui.ActionBar.j6.f18117ng;
                        checkBoxSquare.f21072s = i10;
                        checkBoxSquare.v = i11;
                        checkBoxSquare.f21073w = i12;
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
                    f7.addView(z1VarArr[0], w7.a6.n(-1, -2));
                    z1VarArr[0].setOnClickListener(new x20(z1VarArr, 0));
                }
                alertDialog$Builder.n(f7);
                alertDialog$Builder.f17528a.I = org.telegram.ui.ActionBar.j6.f18153pg;
                alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new bi.a8(call, z1VarArr, selfId, runnable, 2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (z10) {
                    alertDialog$Builder.f17528a.P0 = false;
                }
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                if (z10) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        d2Var.getWindow().setType(2038);
                    } else {
                        d2Var.getWindow().setType(2003);
                    }
                    d2Var.getWindow().clearFlags(2);
                }
                if (!z10) {
                    d2Var.i(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18246ug, false));
                }
                d2Var.show();
                if (!z10) {
                    TextView textView = (TextView) d2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18262vg, false));
                    }
                    d2Var.o(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18007hg, false));
                    return;
                }
                return;
            }
            w1(call, false, selfId, runnable);
        }
    }

    public static void u(j60 j60Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(j60Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static void v(j60 j60Var, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(j60Var.currentAccount).processUpdates(updates, false);
            AndroidUtilities.runOnUIThread(new a3.h0(j60Var, updates, j3, 19));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j3));
        }
        if (atomicInteger.incrementAndGet() == i10 && !hashSet.isEmpty()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.q01(j60Var, hashSet, call, str, 4));
        }
    }

    public static void w(j60 j60Var, HashSet hashSet, ChatObject.Call call, String str) {
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
            arrayList.add(MessagesController.getInstance(j60Var.currentAccount).getUser(l4));
            getrequirementstocontact.f17405id.add(MessagesController.getInstance(j60Var.currentAccount).getInputUser(longValue));
        }
        bi.ya yaVar = new bi.ya(j60Var, arrayList, arrayList2, arrayList3, str, 25);
        if (UserConfig.getInstance(j60Var.currentAccount).isPremium()) {
            yaVar.run();
        } else {
            ConnectionsManager.getInstance(j60Var.currentAccount).sendRequest(getrequirementstocontact, new aa(arrayList, arrayList2, yaVar, 13));
        }
    }

    public static void w1(ChatObject.Call call, boolean z10, long j3, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z10 ? 1 : 0);
        }
        if (call != null) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(j3);
            if (groupCallParticipant != null) {
                call.participants.e(j3);
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

    public static void x(j60 j60Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        qg.k0 k0Var = new qg.k0(34, j60Var.currentAccount, U.getContext(), U, new org.telegram.ui.Components.bq0());
        k0Var.I1(null, arrayList, arrayList2, arrayList3, str);
        k0Var.show();
    }

    public static void y(j60 j60Var, org.telegram.ui.ActionBar.d2[] d2VarArr, boolean z10, TLRPC.TL_error tL_error, long j3, TL_phone.inviteToGroupCall invitetogroupcall) {
        try {
            d2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        d2VarArr[0] = null;
        if (z10 && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
            j60Var.x1(null, j3, 3);
            return;
        }
        org.telegram.ui.Components.d5.f0(j60Var.currentAccount, tL_error, (org.telegram.ui.ActionBar.p2) j60Var.f33969i0.O().getFragmentStack().get(j60Var.f33969i0.O().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
    }

    public static r0.l1 z(j60 j60Var, r0.l1 l1Var) {
        int keyboardHeight;
        r0.i1 i1Var = l1Var.f41074a;
        i0.c f7 = i1Var.f(647);
        i0.c f10 = i1Var.f(8);
        j40 j40Var = j60Var.H;
        if (!j40Var.N && !j40Var.e) {
            keyboardHeight = 0;
        } else {
            keyboardHeight = j40Var.getKeyboardHeight();
        }
        int max = Math.max(f10.d, keyboardHeight);
        ViewGroup.LayoutParams layoutParams = j60Var.f33941b2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f7.d;
        }
        if (j40Var.getEmojiView() != null) {
            j40Var.getEmojiView().setBottomInset(f7.d);
        }
        if (j60Var.S2) {
            ViewGroup viewGroup = j60Var.containerView;
            int i10 = j60Var.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
        } else {
            ViewGroup viewGroup2 = j60Var.containerView;
            int i11 = j60Var.backgroundPaddingLeft;
            viewGroup2.setPadding(f7.f10074a + i11, f7.f10075b, i11 + f7.f10076c, f7.d);
        }
        j60Var.containerView.requestLayout();
        if (max == 0 && !j40Var.N && !j40Var.e && !j40Var.O) {
            j40Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.pk0 pk0Var = j60Var.K;
            if (pk0Var == null) {
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                pk0Var = null;
                if (R != null) {
                    org.telegram.ui.Components.pk0 pk0Var2 = new org.telegram.ui.Components.pk0(1, j60Var.currentAccount, j60Var.getContext(), R, j60Var.resourcesProvider);
                    j60Var.K = pk0Var2;
                    pk0Var2.setDelegate(new l50(j60Var));
                    j60Var.containerView.addView(j60Var.K, w7.a6.e(-2, 52, 81));
                    j60Var.K.p(null, null, false);
                    j60Var.G.bringToFront();
                    j60Var.F.bringToFront();
                    pk0Var = j60Var.K;
                }
            }
            j60Var.K = pk0Var;
        }
        j40Var.H(f10.d, false);
        j60Var.C1.i(l1Var);
        return r0.l1.f41073b;
    }

    public final void A1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall inputGroupCall;
        long j3;
        this.H.setText("");
        ChatObject.Call call = this.f33936a1;
        if (call != null && call.call != null && (inputGroupCall = call.getInputGroupCall()) != null) {
            ChatObject.Call call2 = this.f33936a1;
            long j10 = call2.call.f17205id;
            TLRPC.Peer peer = call2.selfPeer;
            if (peer != null) {
                j3 = DialogObject.getPeerDialogId(peer);
            } else {
                j3 = UserConfig.getInstance(this.currentAccount).clientUserId;
            }
            GroupCallMessagesController.getInstance(this.currentAccount).sendCallMessage(j3, tL_textWithEntities, j10, inputGroupCall);
        }
    }

    public final void B1(float f7) {
        float f10;
        int i10;
        int i11;
        this.U1 = f7;
        b40 b40Var = this.a2;
        if (b40Var == null) {
            f10 = 0.0f;
        } else {
            f10 = b40Var.f28243c;
        }
        float max = Math.max(f7, f10);
        int i12 = org.telegram.ui.ActionBar.j6.f18045jg;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.j6.f17990gg;
        int offsetColor = AndroidUtilities.getOffsetColor(w02, org.telegram.ui.ActionBar.j6.w0(null, i13, false), f7, 1.0f);
        this.V1 = offsetColor;
        this.N.setBackgroundColor(offsetColor);
        this.f33977k1.B(-14472653);
        this.f33957f0.setColorFilter(new PorterDuffColorFilter(this.V1, PorterDuff.Mode.MULTIPLY));
        this.navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false), org.telegram.ui.ActionBar.j6.w0(null, i13, false), max, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18065kg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18227tg, false), f7, 1.0f);
        u50 u50Var = this.f33995p0;
        if (u50Var != null) {
            u50Var.f37117j = offsetColor2;
            t50 t50Var = u50Var.f37115g;
            if (t50Var != null) {
                t50Var.invalidate();
            }
        }
        this.C0.setColor(offsetColor2);
        this.E.setColor(offsetColor2);
        this.F.invalidate();
        p50 p50Var = this.Q;
        p50Var.setGlowColor(offsetColor2);
        int i14 = this.F1;
        if (i14 == 3 || p1(i14)) {
            this.f34025w.invalidate();
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
        int offsetColor3 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Dg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Eg, false), f7, 1.0f);
        this.f34008s.a(offsetColor3, offsetColor3);
        int offsetColor4 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18083lg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18135og, false), f7, 1.0f);
        int offsetColor5 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18101mg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18190rg, false), f7, 1.0f);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.resourcesProvider);
        int childCount = p50Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = p50Var.getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Cells.w3) {
                org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) childAt;
                if (o1()) {
                    w3Var.a(v02, v02);
                } else {
                    w3Var.a(offsetColor5, offsetColor4);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.d4;
                f50 f50Var = this.O;
                if (z10) {
                    org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) childAt;
                    if (f50Var.getTag() != null) {
                        i11 = org.telegram.ui.ActionBar.j6.f18190rg;
                    } else {
                        i11 = org.telegram.ui.ActionBar.j6.f18101mg;
                    }
                    d4Var.f(i11, offsetColor5);
                } else if (childAt instanceof org.telegram.ui.Cells.v3) {
                    org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) childAt;
                    if (f50Var.getTag() != null) {
                        i10 = org.telegram.ui.ActionBar.j6.f18190rg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f18101mg;
                    }
                    v3Var.a(i10, offsetColor5);
                }
            }
        }
        this.containerView.invalidate();
        p50Var.invalidate();
        this.container.invalidate();
    }

    public final void C1(float f7) {
        p50 p50Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        s4.c1 K;
        f7 = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) ? 0.0f : 0.0f;
        float min = (float) (Math.min(8500.0d, 4000.0f * f7) / 8500.0d);
        this.P0 = min;
        this.Q0 = (min - this.O0) / 265.0f;
        ChatObject.Call call = this.f33936a1;
        if (call != null && (p50Var = this.Q) != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(MessageObject.getPeerId(this.A0))) != null) {
            b40 b40Var = this.a2;
            if (!b40Var.f28241b) {
                if (this.f34009s0) {
                    arrayList = this.D0;
                } else {
                    arrayList = this.f33936a1.visibleParticipants;
                }
                int indexOf = arrayList.indexOf(groupCallParticipant);
                if (indexOf >= 0 && (K = p50Var.K(indexOf + this.P.d)) != null) {
                    View view = K.f41610a;
                    if (view instanceof org.telegram.ui.Cells.d4) {
                        ((org.telegram.ui.Cells.d4) view).setAmplitude(f7 * 15.0f);
                        if (view == this.X2 && !this.f33981l2) {
                            this.containerView.invalidate();
                        }
                    }
                }
            } else {
                int i10 = 0;
                while (true) {
                    x30 x30Var = this.f33984m2;
                    if (i10 >= x30Var.getChildCount()) {
                        break;
                    }
                    org.telegram.ui.Components.a30 a30Var = (org.telegram.ui.Components.a30) x30Var.getChildAt(i10);
                    if (MessageObject.getPeerId(a30Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                        a30Var.setAmplitude(f7 * 15.0f);
                    }
                    i10++;
                }
            }
            b40Var.k(groupCallParticipant, f7 * 15.0f);
        }
    }

    public final void D1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        this.f33964g3 = i10;
        this.f33968h3 = i11;
        this.f33972i3 = i12;
        this.j3 = i13;
        this.f33979k3 = i14;
        this.f33982l3 = i15;
        this.f33985m3 = i16;
        this.f33990n3 = i17;
        this.f33994o3 = i18;
        this.f33998p3 = i19;
        this.f34002q3 = i20;
        this.f34007r3 = i21;
        this.f34012s3 = i22;
        this.f34016t3 = i23;
        this.f34020u3 = i24;
        this.f34024v3 = i25;
    }

    public final void E1(float f7) {
        p50 p50Var;
        int dp;
        int i10;
        float f10;
        this.f34036y0 = f7;
        this.Q.setTopGlowOffset((int) (f7 - ((FrameLayout.LayoutParams) p50Var.getLayoutParams()).topMargin));
        float dp2 = f7 - AndroidUtilities.dp(74.0f);
        y50 y50Var = this.U0;
        b40 b40Var = this.a2;
        v30 v30Var = this.f33958f1;
        t30 t30Var = this.f33953e1;
        if (this.backgroundPaddingTop + dp2 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() * 2) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() * 2) - dp2) - this.backgroundPaddingTop) / (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f))));
            if (AndroidUtilities.isTablet()) {
                f10 = 17.0f;
            } else {
                f10 = 13.0f;
            }
            i10 = (int) (AndroidUtilities.dp(f10) * min);
            if (y50Var != null) {
                y50Var.setShadowOffset((int) (AndroidUtilities.dp(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.U1) > 1.0E-4f) {
                B1(Math.min(1.0f, min));
            }
            float f11 = 1.0f - ((0.1f * min) * 1.2f);
            t30Var.setScaleX(Math.max(0.9f, f11));
            t30Var.setScaleY(Math.max(0.9f, f11));
            float f12 = 1.0f - (min * 1.2f);
            t30Var.setAlpha((1.0f - b40Var.f28243c) * Math.max(0.0f, f12));
            v30Var.setScaleX(Math.max(0.9f, f11));
            v30Var.setScaleY(Math.max(0.9f, f11));
            v30Var.setAlpha((1.0f - b40Var.f28243c) * Math.max(0.0f, f12));
        } else {
            t30Var.setScaleX(1.0f);
            t30Var.setScaleY(1.0f);
            t30Var.setAlpha(1.0f - b40Var.f28243c);
            v30Var.setScaleX(1.0f);
            v30Var.setScaleY(1.0f);
            v30Var.setAlpha(1.0f - b40Var.f28243c);
            if (this.U1 > 1.0E-4f) {
                B1(0.0f);
            }
            i10 = 0;
        }
        Y0();
        float f13 = i10;
        this.f34040z1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(53.0f)) - f13));
        this.f33974j1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f13));
        if (y50Var != null) {
            y50Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), f7 - AndroidUtilities.dp(37.0f)));
        }
        s40 s40Var = this.R;
        if (s40Var != null) {
            s40Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f13));
        }
        this.containerView.invalidate();
        Q1();
    }

    public final boolean F1(android.view.View r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j60.F1(android.view.View):boolean");
    }

    @Override
    public final void G(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 2) {
            Y0();
            W0();
            X0();
            float f11 = 1.0f - this.f34042z3.e;
            o30 o30Var = this.e;
            o30Var.setAlpha(f11);
            this.a2.setProgressToHideUi(f7);
            this.f33984m2.invalidate();
            this.containerView.invalidate();
            o30Var.invalidate();
        }
        if (i10 == 3) {
            Z0();
            Y0();
            a1();
            V0();
            this.containerView.invalidate();
        }
        if (i10 == 4) {
            Y0();
            this.G.invalidate();
            this.H.invalidate();
        }
        if (i10 == 5) {
            Y0();
            this.containerView.invalidate();
        }
    }

    public final void G1(View view) {
        if (this.m0 == null) {
            org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(8, getContext(), null, true);
            this.m0 = s40Var;
            s40Var.setAlpha(0.0f);
            this.m0.setVisibility(4);
            this.m0.setShowingDuration(3000L);
            this.containerView.addView(this.m0, w7.a6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
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

    public final void H1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        ChatObject.Call call = this.f33936a1;
        org.telegram.ui.Components.voip.u2 u2Var = this.v;
        org.telegram.ui.Components.voip.u2 u2Var2 = this.h;
        org.telegram.ui.Components.voip.u2 u2Var3 = this.f34003r;
        org.telegram.ui.Components.voip.u2 u2Var4 = this.f33956f;
        org.telegram.ui.Components.voip.u2 u2Var5 = this.f33986n;
        org.telegram.ui.Components.voip.u2 u2Var6 = this.f34008s;
        org.telegram.ui.Components.voip.u2 u2Var7 = this.f34025w;
        boolean z19 = true;
        o30 o30Var = this.e;
        boolean z20 = false;
        if (call != null && !call.isScheduled()) {
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f33936a1.participants.f(MessageObject.getPeerId(this.A0));
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !Q0()) {
                z14 = true;
            } else {
                z14 = false;
            }
            Boolean bool = this.f34034x3;
            if (bool != null) {
                z15 = bool.booleanValue();
            } else {
                TLRPC.GroupCall groupCall = this.f33936a1.call;
                if (groupCall != null && groupCall.messages_enabled) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            if (((!z14 && this.f33936a1.canRecordVideo()) || z13) && !r1()) {
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
            if (F3) {
                z17 = false;
                z18 = false;
            }
            o30Var.c(u2Var7, true, z10);
            o30Var.c(u2Var6, true, z10);
            o30Var.c(u2Var5, z16, z10);
            o30Var.c(u2Var4, z18, z10);
            o30Var.c(u2Var3, z20, z10);
            o30Var.c(u2Var2, z17, z10);
            o30Var.c(u2Var, z15, z10);
            return;
        }
        if (this.V0 > 0.1f) {
            z11 = true;
        } else {
            z11 = false;
        }
        o30Var.c(u2Var7, z11, z10);
        if (this.V0 > 0.1f) {
            z12 = true;
        } else {
            z12 = false;
        }
        o30Var.c(u2Var6, z12, z10);
        if (this.V0 <= 0.1f) {
            z19 = false;
        }
        o30Var.c(u2Var3, z19, z10);
        o30Var.c(u2Var5, false, z10);
        o30Var.c(u2Var4, false, z10);
        o30Var.c(u2Var2, false, z10);
        o30Var.c(u2Var, false, z10);
    }

    public final void I1() {
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
        ChatObject.Call call2 = this.f33936a1;
        org.telegram.ui.ActionBar.w0 w0Var = this.f33977k1;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f33983m1;
        if (call2 == null || call2.isScheduled()) {
            this.l1.setVisibility(4);
            w0Var2.setVisibility(8);
            if (this.f33936a1 == null) {
                w0Var.setVisibility(8);
                return;
            }
        }
        if (this.f33980l0) {
            return;
        }
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat4 = accountInstance.getMessagesController().getChat(Long.valueOf(i1()));
        if (chat4 != null) {
            this.Z0 = chat4;
        }
        boolean canUserDoAdminAction = ChatObject.canUserDoAdminAction(this.Z0, 3);
        org.telegram.ui.ActionBar.g1 g1Var = this.f33988n1;
        if (!canUserDoAdminAction && (((ChatObject.isChannel(this.Z0) && ((chat3 = this.Z0) == null || !chat3.megagroup)) || (!ChatObject.isPublic(this.Z0) && !ChatObject.canUserDoAdminAction(this.Z0, 3))) && (!ChatObject.isChannel(this.Z0) || (chat2 = this.Z0) == null || chat2.megagroup || !ChatObject.isPublic(chat2)))) {
            g1Var.setVisibility(8);
        } else {
            g1Var.setVisibility(0);
        }
        ChatObject.Call call3 = this.f33936a1;
        org.telegram.ui.ActionBar.g1 g1Var2 = this.f34037y1;
        org.telegram.ui.ActionBar.g1 g1Var3 = this.f34032x1;
        if (call3 != null && (groupCall2 = call3.call) != null && groupCall2.can_change_messages_enabled) {
            if (groupCall2.messages_enabled) {
                i13 = 8;
            } else {
                i13 = 0;
            }
            g1Var3.setVisibility(i13);
            if (this.f33936a1.call.messages_enabled) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            g1Var2.setVisibility(i14);
        } else {
            g1Var3.setVisibility(8);
            g1Var2.setVisibility(8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f33936a1.participants.f(MessageObject.getPeerId(this.A0));
        ChatObject.Call call4 = this.f33936a1;
        org.telegram.ui.ActionBar.g1 g1Var4 = this.f34000q1;
        if (call4 != null && !call4.isScheduled() && (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            g1Var4.setVisibility(0);
        } else {
            g1Var4.setVisibility(8);
        }
        if (SharedConfig.noiseSupression) {
            i10 = R.drawable.msg_noise_on;
        } else {
            i10 = R.drawable.msg_noise_off;
        }
        g1Var4.setIcon(i10);
        if (SharedConfig.noiseSupression) {
            i11 = R.string.VoipNoiseCancellationEnabled;
        } else {
            i11 = R.string.VoipNoiseCancellationDisabled;
        }
        g1Var4.setSubtext(LocaleController.getString(i11));
        boolean Q0 = Q0();
        org.telegram.ui.ActionBar.g1 g1Var5 = this.f34027w1;
        org.telegram.ui.ActionBar.g1 g1Var6 = this.f33992o1;
        boolean z12 = true;
        org.telegram.ui.ActionBar.g1 g1Var7 = this.f34010s1;
        org.telegram.ui.ActionBar.g1 g1Var8 = this.f34014t1;
        if (Q0) {
            g1Var5.setVisibility(0);
            g1Var6.setVisibility(0);
            if (r1()) {
                g1Var7.setVisibility(0);
                g1Var8.setVisibility(8);
            } else if (this.f33936a1.isScheduled()) {
                g1Var7.setVisibility(8);
                g1Var8.setVisibility(8);
            } else {
                g1Var7.setVisibility(0);
            }
            if (o1()) {
                g1Var7.setVisibility(8);
                g1Var6.setVisibility(8);
            }
            if (this.f33936a1.canRecordVideo() && !this.f33936a1.isScheduled() && !r1()) {
                g1Var8.setVisibility(0);
            } else {
                g1Var8.setVisibility(8);
            }
            w0Var2.setVisibility(8);
            boolean z13 = this.f33936a1.recording;
            e60 e60Var = this.f33949d1;
            e60Var.f32072f = z13;
            e60Var.d = 1.0f;
            e60Var.invalidateSelf();
            if (this.f33936a1.recording) {
                if (this.D1 == null) {
                    w20 w20Var = new w20(this, 6);
                    this.D1 = w20Var;
                    AndroidUtilities.runOnUIThread(w20Var, 1000L);
                }
                g1Var7.setText(LocaleController.getString(R.string.VoipGroupStopRecordCall));
            } else {
                w20 w20Var2 = this.D1;
                if (w20Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(w20Var2);
                    this.D1 = null;
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
            if (!z10 && ((this.f33936a1.canRecordVideo() || z11) && !this.f33936a1.isScheduled() && !r1())) {
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
        org.telegram.ui.ActionBar.g1 g1Var9 = this.f34005r1;
        if (Q02 && this.f33936a1.call.can_change_join_muted && !o1()) {
            g1Var9.setVisibility(0);
        } else {
            g1Var9.setVisibility(8);
        }
        if (o1() && ((call = this.f33936a1) == null || (groupCall = call.call) == null || !groupCall.creator)) {
            z12 = false;
        }
        w0Var.I(4, z12);
        if (r1() && !this.f33936a1.isScheduled()) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        this.f33996p1.setVisibility(i12);
        int visibility = g1Var6.getVisibility();
        TextView textView = this.A1;
        if (visibility != 0 && g1Var9.getVisibility() != 0 && g1Var.getVisibility() != 0 && g1Var8.getVisibility() != 0 && g1Var7.getVisibility() != 0 && g1Var5.getVisibility() != 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.f33976k0;
        if (((sharedInstance != null && VoIPService.getSharedInstance().hasFewPeers) || this.f33940b1) && !r1() && this.A0 != null) {
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
        if (chat5 != null && !ChatObject.isChannelOrGiga(chat5) && r1() && g1Var.getVisibility() == 8) {
            w0Var.setVisibility(8);
        } else {
            w0Var.setVisibility(0);
        }
        LinearLayout linearLayout = this.f33974j1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f7 = 96;
        if (layoutParams.rightMargin != AndroidUtilities.dp(f7)) {
            layoutParams.rightMargin = AndroidUtilities.dp(f7);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.f34040z1.getLayoutParams()).rightMargin = 0;
        this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
    }

    public final void J1(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j60.J1(int, boolean):void");
    }

    public final void K1() {
        if (this.f33936a1 == null) {
            return;
        }
        int currentTime = this.d.getConnectionsManager().getCurrentTime();
        ChatObject.Call call = this.f33936a1;
        int i10 = currentTime - call.call.record_start_date;
        boolean z10 = call.recording;
        org.telegram.ui.ActionBar.g1 g1Var = this.f34010s1;
        if (z10) {
            g1Var.setSubtext(AndroidUtilities.formatDuration(i10, false));
        } else {
            g1Var.setSubtext(null);
        }
    }

    public final void L1(boolean z10) {
        float interpolation;
        float f7;
        s40 s40Var = this.R;
        if ((s40Var == null || this.f33936a1 != null) && this.X0 == null) {
            this.W0 = 1.0f;
            this.V0 = 1.0f;
            if (s40Var == null) {
                return;
            }
        }
        int i10 = 4;
        if (!z10) {
            s30 s30Var = this.f34028w2;
            AndroidUtilities.cancelRunOnUIThread(s30Var);
            s30Var.run();
            ChatObject.Call call = this.f33936a1;
            p50 p50Var = this.Q;
            if (call != null && !call.isScheduled()) {
                p50Var.setVisibility(0);
            } else {
                p50Var.setVisibility(4);
            }
            boolean isChannelOrGiga = ChatObject.isChannelOrGiga(this.Z0);
            org.telegram.ui.ActionBar.g1 g1Var = this.f34027w1;
            if (isChannelOrGiga) {
                g1Var.setText(LocaleController.getString(R.string.VoipChannelCancelChat));
            } else {
                g1Var.setText(LocaleController.getString(R.string.VoipGroupCancelChat));
            }
        }
        float f10 = this.V0;
        if (f10 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.wr.f28819f.getInterpolation((f10 - 0.6f) / 0.4f) * 0.05f);
            this.W0 = 1.0f;
            f7 = 1.0f;
        } else {
            org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.f28819f;
            this.W0 = wrVar.getInterpolation(f10 / 0.6f);
            interpolation = 1.05f * wrVar.getInterpolation(this.V0 / 0.6f);
            f7 = this.V0 / 0.6f;
        }
        H1(true);
        float f11 = 1.0f - f7;
        s40Var.setAlpha(f11);
        this.U.setAlpha(f7);
        this.W.setAlpha(f7);
        o50 o50Var = this.V;
        o50Var.setAlpha(f7);
        o50Var.setScaleX(interpolation);
        o50Var.setScaleY(interpolation);
        q40 q40Var = this.T;
        q40Var.setScaleX(f11);
        q40Var.setScaleY(f11);
        q40Var.setAlpha(f11);
        this.S.setAlpha(f11);
        this.f33977k1.setAlpha(f7);
        if (f11 != 0.0f) {
            i10 = 0;
        }
        if (i10 != s40Var.getVisibility()) {
            s40Var.setVisibility(i10);
            q40Var.setVisibility(i10);
        }
    }

    public final void M1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        org.telegram.ui.Components.voip.u2 u2Var = this.f34003r;
        if (u2Var != null && u2Var.getVisibility() == 0) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            o30 o30Var = this.e;
            boolean z14 = false;
            if (sharedInstance != null && !r1()) {
                jh.a aVar = (jh.a) o30Var.f11944c.get(u2Var);
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
                    i10 = R.drawable.filled_calls_bluetooth_s;
                } else {
                    i10 = R.drawable.filled_sound_on;
                }
                if (this.f33935a0 != i10) {
                    this.f33935a0 = i10;
                    AndroidUtilities.updateImageViewImageAnimated(this.f33939b0, i10);
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
            if (!ChatObject.isPublic(this.Z0) && (!ChatObject.hasAdminRights(this.Z0) || !ChatObject.canAddUsers(this.Z0))) {
                z11 = false;
            } else {
                z11 = true;
            }
            jh.a aVar2 = (jh.a) o30Var.f11944c.get(u2Var);
            if (aVar2 != null) {
                aVar2.d.a(z11, z10);
                u2Var.setEnabled(z11);
            }
            u2Var.b(true, false);
        }
    }

    public final void N1(boolean r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j60.N1(boolean, boolean):void");
    }

    public final void O0(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j60.O0(boolean):void");
    }

    public final void O1() {
        boolean z10;
        String str;
        float f7;
        float f10;
        h60 h60Var;
        TLRPC.User user;
        TLRPC.Chat chat;
        f50 f50Var = this.O;
        if (f50Var != null && this.f33936a1 != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            int i10 = 0;
            for (int i11 = 0; i11 < this.f33936a1.currentSpeakingPeers.m(); i11++) {
                long j3 = this.f33936a1.currentSpeakingPeers.j(i11);
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f33936a1.currentSpeakingPeers.f(j3);
                if (!groupCallParticipant.self) {
                    b40 b40Var = this.a2;
                    b40Var.getClass();
                    if (b40Var.f28267w.get(MessageObject.getPeerId(groupCallParticipant.peer)) <= 0 && this.B2.get(j3, 0) != 1) {
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
                                    spannableStringBuilder.append(UserObject.getFirstName(user), new org.telegram.ui.Components.s51(AndroidUtilities.bold()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.s51(AndroidUtilities.bold()), 0);
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
                f50Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.l5 subtitleTextView = f50Var.getSubtitleTextView();
            if (r1()) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            int i13 = this.f33936a1.call.participants_count;
            d60 d60Var = this.P;
            subtitleTextView.k(LocaleController.formatPluralString(str, i13 + ((d60Var.M.r1() || d60Var.L || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined()), new Object[0]));
            if (r1() && (h60Var = this.B1) != null) {
                h60Var.setWatchersCount(this.f33936a1.call.participants_count);
            }
            if (z10 != this.f34019u2) {
                this.f34019u2 = z10;
                f50Var.invalidate();
                float f11 = 0.0f;
                f50Var.getSubtitleTextView().setPivotX(0.0f);
                f50Var.getSubtitleTextView().setPivotY(f50Var.getMeasuredHeight() >> 1);
                ViewPropertyAnimator animate = f50Var.getSubtitleTextView().animate();
                if (this.f34019u2) {
                    f7 = 0.98f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f7);
                if (this.f34019u2) {
                    f10 = 0.9f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f10);
                if (!this.f34019u2) {
                    f11 = 1.0f;
                }
                scaleY.alpha(f11).setDuration(150L);
                AndroidUtilities.updateViewVisibilityAnimated(f50Var.getAdditionalSubtitleTextView(), this.f34019u2);
            }
        }
    }

    public final int P0() {
        p50 p50Var = this.Q;
        int childCount = p50Var.getChildCount();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = p50Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0) {
                i10 = Math.min(i10, childAt.getTop());
            }
        }
        return i10;
    }

    public final void P1(boolean z10) {
        ChatObject.Call call = this.f33936a1;
        t30 t30Var = this.f33953e1;
        if (call == null) {
            if (ChatObject.isChannelOrGiga(this.Z0)) {
                t30Var.b(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), z10);
                return;
            } else {
                t30Var.b(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), z10);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(call.call.title);
        f50 f50Var = this.O;
        if (!isEmpty) {
            if (!this.f33936a1.call.title.equals(f50Var.getTitle())) {
                if (z10) {
                    this.O.J(this.f33936a1.call.title, true, 180L, null);
                    f50Var.getTitleTextView().setOnClickListener(new u20(this, 8));
                } else {
                    f50Var.setTitle(this.f33936a1.call.title);
                }
                t30Var.b(this.f33936a1.call.title, z10);
            }
        } else {
            TLRPC.Chat chat = this.Z0;
            if (chat != null && !chat.title.equals(f50Var.getTitle())) {
                if (z10) {
                    this.O.J(this.Z0.title, true, 180L, null);
                    f50Var.getTitleTextView().setOnClickListener(new u20(this, 9));
                } else {
                    f50Var.setTitle(this.Z0.title);
                }
                if (ChatObject.isChannelOrGiga(this.Z0)) {
                    if (r1()) {
                        t30Var.b(this.Z0.title, z10);
                    } else {
                        t30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), z10);
                    }
                } else {
                    t30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), z10);
                }
            } else if (this.Z0 == null) {
                f50Var.setTitle(LocaleController.getString(R.string.ConferenceChat));
                t30Var.b(LocaleController.getString(R.string.ConferenceChat), z10);
            }
        }
        org.telegram.ui.ActionBar.l5 titleTextView = f50Var.getTitleTextView();
        if (this.f33936a1.recording) {
            if (titleTextView.getRightDrawable() == null) {
                titleTextView.i(new f60(titleTextView));
                TextView textView = t30Var.getTextView();
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new f60(textView), (Drawable) null);
                TextView nextTextView = t30Var.getNextTextView();
                nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new f60(nextTextView), (Drawable) null);
            }
        } else if (titleTextView.getRightDrawable() != null) {
            titleTextView.i(null);
            t30Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            t30Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final boolean Q0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            ChatObject.Call call = this.f33936a1;
            if (call != null && (groupCall = call.call) != null && groupCall.creator) {
                return true;
            }
            return false;
        }
        return ChatObject.canManageCalls(this.Z0);
    }

    public final void Q1() {
        float f7;
        org.telegram.ui.Components.tb tbVar;
        boolean z10;
        if (this.topBulletinContainer != null) {
            int dp = AndroidUtilities.dp(74.0f);
            float f10 = this.f34036y0 - dp;
            if (this.backgroundPaddingTop + f10 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                int dp2 = (dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f);
                f7 = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - f10) - this.backgroundPaddingTop) / dp2);
                f10 -= (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - dp2) * f7);
            } else {
                f7 = 0.0f;
            }
            float paddingTop = f10 + this.containerView.getPaddingTop();
            FrameLayout frameLayout = this.topBulletinContainer;
            f50 f50Var = this.O;
            frameLayout.setTranslationY(AndroidUtilities.lerp(((-frameLayout.getTop()) - this.topBulletinContainer.getHeight()) + paddingTop + AndroidUtilities.dp(10.0f), f50Var.getY() + (-this.topBulletinContainer.getTop()) + f50Var.getHeight(), f7));
            org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.f26074w;
            if (pcVar != null && (tbVar = pcVar.e) != null && tbVar.getParent() != null && tbVar.getParent().getParent() == this.topBulletinContainer) {
                if (f7 > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tbVar.setTop(z10);
            }
        }
    }

    public final void R0() {
        if (this.R1) {
            this.R1 = false;
            AndroidUtilities.cancelRunOnUIThread(this.f34038y2);
        }
        if (this.S1) {
            this.S1 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.f34025w.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void S0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j60.S0():void");
    }

    public final void T0() {
        this.F.setTranslationY((-this.C1.c()) + this.containerView.getPaddingBottom());
        this.G.invalidate();
        Z0();
        Y0();
        W0();
        X0();
        a1();
        this.e.setAlpha(1.0f - this.f34042z3.e);
        U0();
        V0();
    }

    public final void U0() {
        int i10;
        float f7 = this.C1.f14592b.f12893a;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        m40 m40Var = this.F;
        m40Var.setAlpha(f7);
        l40 l40Var = this.G;
        l40Var.setAlpha(f7);
        if (m40Var.getVisibility() != i10) {
            m40Var.setVisibility(i10);
            l40Var.setVisibility(i10);
            if (i10 == 8) {
                j40 j40Var = this.H;
                if (j40Var.isFocused()) {
                    j40Var.clearFocus();
                }
            }
        }
    }

    public final void V0() {
        int i10;
        org.telegram.ui.Components.pk0 pk0Var = this.K;
        if (pk0Var != null) {
            float f7 = this.C1.f14592b.f12893a * this.A3.e;
            pk0Var.setAlpha(f7);
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
            org.telegram.ui.Components.pk0 pk0Var2 = this.K;
            if (!pk0Var2.N0 && f7 == 1.0f) {
                pk0Var2.N0 = true;
            }
        }
    }

    public final void W0() {
        boolean z10 = G3;
        o30 o30Var = this.e;
        if (z10) {
            o30Var.setTranslationX(0.0f);
            o30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        le.b bVar = this.f34042z3;
        if (z11) {
            o30Var.setTranslationX(bVar.e * AndroidUtilities.dp(94.0f));
            o30Var.setTranslationY(0.0f);
            return;
        }
        o30Var.setTranslationX(0.0f);
        o30Var.setTranslationY(bVar.e * AndroidUtilities.dp(94.0f));
    }

    public final void X0() {
        boolean z10 = G3;
        x30 x30Var = this.f33984m2;
        if (z10) {
            x30Var.setTranslationX(0.0f);
            x30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        le.b bVar = this.f34042z3;
        if (z11) {
            x30Var.setTranslationX(bVar.e * AndroidUtilities.dp(94.0f));
            x30Var.setTranslationY(0.0f);
            return;
        }
        x30Var.setTranslationX(0.0f);
        x30Var.setTranslationY(bVar.e * AndroidUtilities.dp(94.0f));
    }

    public final void Y0() {
        float dp;
        float f7 = this.B3.e;
        oh.i iVar = this.C1;
        float f10 = -((iVar.c() - this.containerView.getPaddingBottom()) + f7 + (AndroidUtilities.dp(68.0f) * this.A3.e) + AndroidUtilities.dp(10.0f));
        if (G3) {
            dp = (1.0f - this.C3.e) * AndroidUtilities.dp(-91.0f);
        } else if (F3) {
            dp = 0.0f;
        } else {
            dp = ((this.f34042z3.e * AndroidUtilities.dp(94.0f)) - (AndroidUtilities.dp(104.0f) * this.a2.f28243c)) - AndroidUtilities.dp(91.0f);
        }
        float lerp = AndroidUtilities.lerp(dp, f10, iVar.f14592b.f12893a);
        float measuredHeight = ((this.containerView.getMeasuredHeight() - this.f34036y0) + lerp) - this.backgroundPaddingTop;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - AndroidUtilities.dp(250.0f));
        kh.h hVar = this.f33944c0;
        hVar.setTranslationY(lerp);
        hVar.setVisibleHeight((int) max);
    }

    public final void Z0() {
        if (this.K != null) {
            this.K.setTranslationY((-this.C1.c()) + this.containerView.getPaddingBottom() + ((-this.A3.e) * AndroidUtilities.dp(64.0f)));
        }
    }

    public final void a1() {
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

    public final void b1() {
        org.telegram.ui.Components.voip.t tVar = this.Z2;
        if (tVar != null) {
            tVar.f28409a.setRoundCorners(AndroidUtilities.dp(8.0f));
            org.telegram.ui.Components.voip.t tVar2 = this.Z2;
            tVar2.h = false;
            tVar2.j(false);
            this.Z2.invalidate();
            this.a2.invalidate();
        }
        org.telegram.ui.Cells.d4 d4Var = this.X2;
        if (d4Var != null && !this.f33942b3 && d4Var.getParent() != null) {
            this.containerView.removeView(this.X2);
        }
        org.telegram.ui.Cells.d4 d4Var2 = this.X2;
        if (d4Var2 != null) {
            d4Var2.setProgressToAvatarPreview(0.0f);
            this.X2.setAboutVisible(false);
            this.X2.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.a30 a30Var = this.f33937a3;
        if (a30Var != null) {
            a30Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.X2 = null;
        this.Y2 = null;
        this.f33937a3 = null;
        this.Z2 = null;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return !this.a2.f28241b;
    }

    public final void d1(boolean z10) {
        if (!this.f33947c3 && this.f33959f2) {
            if (z10) {
                this.f33947c3 = true;
                y1(false, this.X2);
                return;
            }
            b1();
            this.containerView.removeView(this.f33954e2);
            this.f33954e2 = null;
            this.C2.setVisibility(8);
            this.containerView.invalidate();
            this.f33959f2 = false;
            this.Y.X = true;
            this.Q.invalidate();
            this.f33941b2.setVisibility(8);
            if (this.f34009s0) {
                this.f34009s0 = false;
                O0(true);
            }
            S0();
        }
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
        p50 p50Var = this.Q;
        int i19 = 0;
        if (i10 == i18) {
            Long l4 = (Long) objArr[1];
            ChatObject.Call call = this.f33936a1;
            if (call != null && call.call.f17205id == l4.longValue()) {
                ChatObject.Call call2 = this.f33936a1;
                if (call2.call instanceof TLRPC.TL_groupCallDiscarded) {
                    dismiss();
                    return;
                }
                long j3 = this.f34013t0;
                AccountInstance accountInstance = this.d;
                if (j3 == 0 && (((i17 = this.F1) == 7 || i17 == 5 || i17 == 6) && !call2.isScheduled())) {
                    try {
                        Intent intent = new Intent(this.f33969i0, VoIPService.class);
                        intent.putExtra("chat_id", i1());
                        intent.putExtra("createGroupCall", false);
                        intent.putExtra("hasFewPeers", this.f33940b1);
                        intent.putExtra("peerChannelId", this.Y0.channel_id);
                        intent.putExtra("peerChatId", this.Y0.chat_id);
                        intent.putExtra("peerUserId", this.Y0.user_id);
                        intent.putExtra("hash", this.f33945c1);
                        intent.putExtra("peerAccessHash", this.Y0.access_hash);
                        intent.putExtra("is_outgoing", true);
                        intent.putExtra("start_incall_activity", false);
                        intent.putExtra("account", accountInstance.getCurrentAccount());
                        intent.putExtra("scheduleDate", this.f33978k2);
                        this.f33969i0.startService(intent);
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                    }
                    this.f34013t0 = SystemClock.elapsedRealtime();
                    AndroidUtilities.runOnUIThread(new w20(this, 2), 3000L);
                }
                if (!this.f34017u0 && VoIPService.getSharedInstance() != null) {
                    this.f33936a1.addSelfDummyParticipant(false);
                    l1();
                    VoIPService.getSharedInstance().playConnectedSound();
                }
                I1();
                int childCount = p50Var.getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt = p50Var.getChildAt(i20);
                    if (childAt instanceof org.telegram.ui.Cells.d4) {
                        ((org.telegram.ui.Cells.d4) childAt).a(true, false);
                    }
                }
                if (this.X2 != null) {
                    this.f34009s0 = true;
                } else {
                    O0(true);
                }
                O1();
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                if (this.F1 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                N1(true, booleanValue);
                P1(true);
                if (z11 && ((i16 = this.F1) == 1 || i16 == 0)) {
                    k1().j(38, 0L, null);
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().playAllowTalkSound();
                    }
                }
                if (objArr.length >= 4) {
                    Long l10 = (Long) objArr[3];
                    long longValue = l10.longValue();
                    if (longValue != 0 && !r1()) {
                        if (!o1() || (sharedInstance = VoIPService.getSharedInstance()) == null || longValue != sharedInstance.convertingFromCallWithUserId) {
                            try {
                                ArrayList<TLRPC.Dialog> allDialogs = accountInstance.getMessagesController().getAllDialogs();
                                if (allDialogs != null) {
                                    int size = allDialogs.size();
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 >= size) {
                                            break;
                                        }
                                        TLRPC.Dialog dialog = allDialogs.get(i21);
                                        i21++;
                                        if (dialog.f17199id == longValue) {
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
                                    if (this.f33936a1.call.participants_count < 250 || UserObject.isContact(user) || user.verified || i19 != 0) {
                                        k1().k(0L, 44, user, this.Z0, null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(-longValue));
                            if (chat != null) {
                                if (this.f33936a1.call.participants_count < 250 || !ChatObject.isNotInChat(chat) || chat.verified || i19 != 0) {
                                    k1().k(0L, 44, chat, this.Z0, null, null);
                                }
                            }
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.groupCallSpeakingUsersUpdated) {
            b40 b40Var = this.a2;
            if (b40Var.f28241b && this.f33936a1 != null) {
                boolean c10 = b40Var.c();
                ChatObject.Call call3 = this.f33936a1;
                if (call3 != null && b40Var.f28241b && (videoParticipant = b40Var.e) != null && call3.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer)) == null) {
                    c10 = true;
                }
                if (c10) {
                    ChatObject.VideoParticipant videoParticipant2 = null;
                    int i22 = 0;
                    while (true) {
                        ArrayList arrayList = this.f33999q0;
                        if (i22 >= arrayList.size()) {
                            break;
                        }
                        ChatObject.VideoParticipant videoParticipant3 = (ChatObject.VideoParticipant) arrayList.get(i22);
                        if (this.f33936a1.currentSpeakingPeers.g(null, MessageObject.getPeerId(videoParticipant3.participant.peer)) != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = videoParticipant3.participant;
                            if (!groupCallParticipant3.muted_by_you && b40Var.d != MessageObject.getPeerId(groupCallParticipant3.peer)) {
                                videoParticipant2 = videoParticipant3;
                            }
                        }
                        i22++;
                    }
                    if (videoParticipant2 != null) {
                        e1(videoParticipant2);
                    }
                }
            }
            b40Var.setVisibleParticipant(true);
            O1();
        } else if (i10 == NotificationCenter.webRtcMicAmplitudeEvent) {
            C1(((Float) objArr[0]).floatValue());
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
                AlertDialog$Builder N = org.telegram.ui.Components.d5.N(getContext(), LocaleController.getString(R.string.VoipGroupVoiceChat), string);
                N.j(new a30(this, 1));
                try {
                    N.o();
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
            if (chatFull.f17196id == i1()) {
                I1();
                N1(isShowing(), false);
            }
            long peerId = MessageObject.getPeerId(this.A0);
            ChatObject.Call call4 = this.f33936a1;
            if (call4 != null && chatFull.f17196id == (-peerId) && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) call4.participants.f(peerId)) != null) {
                groupCallParticipant2.about = chatFull.about;
                O0(true);
                AndroidUtilities.updateVisibleRows(p50Var);
                if (this.E2 != null) {
                    while (i19 < this.E2.getChildCount()) {
                        View childAt2 = this.E2.getChildAt(i19);
                        if ((childAt2 instanceof org.telegram.ui.ActionBar.g1) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                            org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) childAt2;
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
                            g1Var.g(string2, i15, null);
                        }
                        i19++;
                    }
                }
            }
        } else if (i10 == NotificationCenter.didLoadChatAdmins) {
            if (((Long) objArr[0]).longValue() == i1()) {
                I1();
                N1(isShowing(), false);
            }
        } else if (i10 == NotificationCenter.applyGroupCallVisibleParticipants) {
            int childCount2 = p50Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i19 < childCount2) {
                s4.c1 G = p50Var.G(p50Var.getChildAt(i19));
                if (G != null) {
                    View view = G.f41610a;
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
            if (this.f33936a1 != null && peerId2 == l11.longValue() && (groupCallParticipant = (TLRPC.GroupCallParticipant) this.f33936a1.participants.f(peerId2)) != null) {
                groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
                O0(true);
                AndroidUtilities.updateVisibleRows(p50Var);
                if (this.E2 != null) {
                    while (i19 < this.E2.getChildCount()) {
                        View childAt3 = this.E2.getChildAt(i19);
                        if ((childAt3 instanceof org.telegram.ui.ActionBar.g1) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                            org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) childAt3;
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
                            g1Var2.g(string3, i13, null);
                        }
                        i19++;
                    }
                }
            }
        } else if (i10 == NotificationCenter.mainUserInfoChanged) {
            O0(true);
            AndroidUtilities.updateVisibleRows(p50Var);
        } else if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0) {
                O0(true);
            }
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (intValue & MessagesController.UPDATE_MASK_EMOJI_STATUS) != 0) {
                AndroidUtilities.updateVisibleRows(p50Var);
            }
        } else if (i10 == NotificationCenter.groupCallScreencastStateChanged) {
            v40 v40Var = this.f34039z0;
            if (v40Var != null) {
                v40Var.b(true, true);
            }
            I1();
        } else if (i10 == NotificationCenter.conferenceEmojiUpdated) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            u50 u50Var = this.f33995p0;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            u50Var.b(strArr);
        }
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity = this.f33969i0;
        launchActivity.f29928a1.remove(this.f34023v2);
        this.f33969i0.setRequestedOrientation(-1);
        E3 = false;
        org.telegram.ui.Components.b40 b40Var = this.E1;
        if (b40Var != null) {
            b40Var.dismiss();
        }
        this.f34009s0 = true;
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
        b40 b40Var = this.a2;
        if (b40Var != null) {
            if (this.f34001q2 != null) {
                this.Q.getViewTreeObserver().removeOnPreDrawListener(this.f34001q2);
                this.f34001q2 = null;
            }
            ArrayList arrayList = this.Z1;
            arrayList.clear();
            ArrayList arrayList2 = this.Y1;
            arrayList.addAll(arrayList2);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).f();
                b40Var.removeView((View) arrayList.get(i10));
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).e();
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).b(true);
            }
            arrayList2.clear();
            if (b40Var.getParent() != null) {
                arrayList2.clear();
                this.containerView.removeView(b40Var);
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
        org.telegram.ui.Components.j30.j(getContext());
        ChatObject.Call call = this.f33936a1;
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
        if (this.f33969i0 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.f33969i0.getSystemService("audio");
            boolean z10 = false;
            if (audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25) {
                z10 = true;
            }
            WebRtcAudioTrack.setSpeakerMute(z10);
            if (isSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                UndoView k12 = k1();
                if (z10) {
                    i10 = 42;
                } else {
                    i10 = 43;
                }
                k12.j(i10, 0L, null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e1(ChatObject.VideoParticipant videoParticipant) {
        ChatObject.VideoParticipant videoParticipant2;
        if (videoParticipant == null) {
            this.f33969i0.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            b40 b40Var = this.a2;
            if (b40Var.f28260r != null) {
                return;
            }
            boolean z10 = G3;
            p50 p50Var = this.Q;
            int i10 = 0;
            if (z10) {
                if (this.f34001q2 != null) {
                    p50Var.getViewTreeObserver().removeOnPreDrawListener(this.f34001q2);
                    this.f34001q2 = null;
                }
                ArrayList arrayList = new ArrayList();
                p60 p60Var = this.f33993o2;
                ArrayList arrayList2 = this.Y1;
                ArrayList arrayList3 = this.Z1;
                if (videoParticipant == null) {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList3.get(i11);
                        org.telegram.ui.Components.voip.l lVar = tVar.f28413c;
                        if (lVar != null) {
                            lVar.setRenderer(null);
                            org.telegram.ui.Components.a30 a30Var = tVar.d;
                            if (a30Var != null) {
                                a30Var.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.l lVar2 = tVar.e;
                            if (lVar2 != null) {
                                lVar2.setRenderer(null);
                            }
                            arrayList.add(tVar.f28437w);
                            tVar.b(false);
                            tVar.animate().alpha(0.0f).setListener(new w40(this, tVar));
                        }
                    }
                    this.P2 = false;
                    p60Var.H(this.f33989n2, true, true);
                } else {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) arrayList3.get(i12);
                        if (tVar2.e != null && ((videoParticipant2 = tVar2.f28437w) == null || !videoParticipant2.equals(videoParticipant))) {
                            arrayList.add(tVar2.f28437w);
                            tVar2.b(false);
                            org.telegram.ui.Components.a30 a30Var2 = tVar2.d;
                            if (a30Var2 != null) {
                                a30Var2.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.l lVar3 = tVar2.f28413c;
                            if (lVar3 != null) {
                                lVar3.setRenderer(null);
                            }
                            tVar2.animate().alpha(0.0f).setListener(new x40(this, tVar2));
                        }
                    }
                    this.P2 = true;
                    p60Var.f35689r = false;
                    if (!arrayList.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new uv(18, this, arrayList));
                    }
                }
                ViewTreeObserver viewTreeObserver = p50Var.getViewTreeObserver();
                z40 z40Var = new z40(this, videoParticipant, !b40Var.f28241b);
                this.f34001q2 = z40Var;
                viewTreeObserver.addOnPreDrawListener(z40Var);
                return;
            }
            if (this.f34001q2 != null) {
                p50Var.getViewTreeObserver().removeOnPreDrawListener(this.f34001q2);
                this.f34001q2 = null;
            }
            if (videoParticipant != null) {
                x30 x30Var = this.f33984m2;
                if (x30Var.getVisibility() != 0) {
                    x30Var.setVisibility(0);
                    org.telegram.ui.Components.b30 b30Var = this.f33997p2;
                    b30Var.G(x30Var, false);
                    this.f34009s0 = true;
                    if (!b40Var.f28241b) {
                        ArrayList arrayList4 = b30Var.e;
                        s4.c0 c0Var = (s4.c0) x30Var.getLayoutManager();
                        if (c0Var != null) {
                            while (true) {
                                if (i10 >= arrayList4.size()) {
                                    break;
                                } else if (((ChatObject.VideoParticipant) arrayList4.get(i10)).equals(videoParticipant)) {
                                    c0Var.h1(i10, AndroidUtilities.dp(13.0f));
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                    ViewTreeObserver viewTreeObserver2 = p50Var.getViewTreeObserver();
                    a50 a50Var = new a50(this, videoParticipant);
                    this.f34001q2 = a50Var;
                    viewTreeObserver2.addOnPreDrawListener(a50Var);
                    return;
                }
                b40Var.j(videoParticipant);
                AndroidUtilities.updateVisibleRows(x30Var);
            } else if (p50Var.getVisibility() != 0) {
                p50Var.setVisibility(0);
                O0(false);
                this.f34009s0 = true;
                ViewTreeObserver viewTreeObserver3 = p50Var.getViewTreeObserver();
                b50 b50Var = new b50(this);
                this.f34001q2 = b50Var;
                viewTreeObserver3.addOnPreDrawListener(b50Var);
            } else {
                ViewTreeObserver viewTreeObserver4 = p50Var.getViewTreeObserver();
                c50 c50Var = new c50(this);
                this.f34001q2 = c50Var;
                viewTreeObserver4.addOnPreDrawListener(c50Var);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final int h1() {
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

    public final long i1() {
        TLRPC.Chat chat = this.Z0;
        if (chat == null) {
            return 0L;
        }
        return chat.f17195id;
    }

    public final void j1(boolean z10) {
        boolean z11;
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(i1()));
        if (chat != null && !ChatObject.isPublic(chat)) {
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(i1());
            String publicUsername = ChatObject.getPublicUsername(this.Z0);
            if (!TextUtils.isEmpty(publicUsername)) {
                str = a4.a.q(accountInstance.getMessagesController().linkPrefix, "/", publicUsername, new StringBuilder());
            } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                tL_messages_exportChatInvite.peer = MessagesController.getInputPeer(this.Z0);
                accountInstance.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new bi.f2(this, chatFull, z10, 5));
                return;
            }
            u1(null, str, true, z10);
        } else if (this.f33936a1 != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = this.f33936a1.getInputGroupCall();
                if (i10 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                exportgroupcallinvite.can_self_unmute = z11;
                accountInstance.getConnectionsManager().sendRequest(exportgroupcallinvite, new org.telegram.messenger.voip.p0(this, i10, z10, 1));
            }
        }
    }

    public final UndoView k1() {
        if (!G3) {
            b40 b40Var = this.a2;
            if (b40Var.f28241b) {
                return b40Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.f33973j0;
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
        int i10;
        if (!this.f34017u0 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            this.f34017u0 = true;
            this.D0.addAll(this.f33936a1.visibleParticipants);
            this.E0.addAll(this.f33999q0);
            this.F0.addAll(this.f33936a1.invitedUsers);
            this.G0.addAll(this.f33936a1.shadyJoinParticipants);
            this.H0.addAll(this.f33936a1.shadyLeftParticipants);
            this.T1 = sharedInstance.getCallState();
            if (this.f33936a1 == null) {
                ChatObject.Call call = sharedInstance.groupCall;
                this.f33936a1 = call;
                this.f33997p2.f21693c = call;
                this.a2.setGroupCall(call);
                this.f33993o2.f35686c = this.f33936a1;
            }
            kh.h hVar = this.f33944c0;
            if (hVar != null) {
                hVar.C0(this.d.getCurrentAccount(), this.f33936a1.getInputGroupCall(false));
            }
            this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
            this.f33936a1.saveActiveDates();
            VoIPService.getSharedInstance().registerStateListener(this);
            o50 o50Var = this.V;
            if (o50Var != null && o50Var.getVisibility() == 0) {
                this.f34008s.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, true);
                M1(true);
                if (ChatObject.isChannelOrGiga(this.Z0)) {
                    i10 = R.string.VoipChannelEndChat;
                } else {
                    i10 = R.string.VoipGroupEndChat;
                }
                this.f34027w1.setText(LocaleController.getString(i10));
                p50 p50Var = this.Q;
                p50Var.setVisibility(0);
                org.telegram.ui.ActionBar.w0 w0Var = this.l1;
                w0Var.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(p50Var, property, 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(p50Var, View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(o50Var, property2, 0.0f);
                Property property3 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(o50Var, property3, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(o50Var, property, 0.0f);
                org.telegram.ui.ActionBar.l5 l5Var = this.U;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(l5Var, property2, 0.0f);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(l5Var, property3, 0.0f);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(l5Var, property, 0.0f);
                org.telegram.ui.ActionBar.l5 l5Var2 = this.W;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(l5Var2, property2, 0.0f), ObjectAnimator.ofFloat(l5Var2, property3, 0.0f), ObjectAnimator.ofFloat(l5Var2, property, 0.0f), ObjectAnimator.ofFloat(w0Var, property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(w0Var, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(w0Var, property, 0.0f, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.wr.f28820g);
                animatorSet.addListener(new d50(this, 0));
                animatorSet.setDuration(300L);
                animatorSet.start();
            }
        }
    }

    public final void m1(final long j3, final boolean z10) {
        if (this.f33936a1 != null) {
            AccountInstance accountInstance = this.d;
            final TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                final org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(getContext(), 3, null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                invitetogroupcall.call = this.f33936a1.getInputGroupCall();
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = user.f17342id;
                tL_inputUser.access_hash = user.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = accountInstance.getConnectionsManager().sendRequest(invitetogroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        j60 j60Var = j60.this;
                        long j10 = j3;
                        org.telegram.ui.ActionBar.d2[] d2VarArr2 = d2VarArr;
                        if (tLObject != null) {
                            j60Var.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            AndroidUtilities.runOnUIThread(new bi.ua(j60Var, j10, d2VarArr2, user, 28));
                            return;
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gg(j60Var, d2VarArr2, z10, tL_error, j10, invitetogroupcall));
                    }
                });
                if (sendRequest != 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.my(this, d2VarArr, sendRequest, 25), 500L);
                }
            }
        }
    }

    public final boolean n1() {
        float f7;
        int dp = AndroidUtilities.dp(74.0f);
        float f10 = this.f34036y0 - dp;
        if (this.backgroundPaddingTop + f10 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            f7 = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - f10) - this.backgroundPaddingTop) / ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)));
        } else {
            f7 = 0.0f;
        }
        if (f7 > 0.5f) {
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
        p50 p50Var = this.Q;
        if (p50Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(p50Var);
        }
        x30 x30Var = this.f33984m2;
        if (x30Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(x30Var);
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
        v40 v40Var = this.f34039z0;
        if (v40Var != null) {
            v40Var.b(false, false);
        } else if (this.f33959f2) {
            d1(true);
        } else if (this.a2.f28241b) {
            e1(null);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.x0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        arrayList.addAll(this.Y1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
        }
        v40 v40Var = this.f34039z0;
        if (v40Var != null && VoIPService.getSharedInstance() != null) {
            v40Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.f33969i0;
        launchActivity.f29928a1.add(this.f34023v2);
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        E3 = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        org.telegram.ui.Components.j30.j(getContext());
        return super.onCustomOpenAnimation();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.x0.d(this, i10, i11);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.x0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.x0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        this.T1 = i10;
        N1(isShowing(), false);
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.x0.h(this, z10);
    }

    public final boolean q1() {
        if (!r1() || this.f33936a1.visibleVideoParticipants.isEmpty() || (this.f33936a1.visibleVideoParticipants.get(0).aspectRatio != 0.0f && this.f33936a1.visibleVideoParticipants.get(0).aspectRatio < 1.0f)) {
            return false;
        }
        return true;
    }

    public final boolean r1() {
        ChatObject.Call call = this.f33936a1;
        if (call != null && call.call.rtmp_stream) {
            return true;
        }
        return false;
    }

    public final void s1(org.telegram.ui.ActionBar.h3 h3Var, org.telegram.ui.ActionBar.d2 d2Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j3;
        if (!this.f34026w0) {
            org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f33969i0.O().getFragmentStack().get(this.f33969i0.O().getFragmentStack().size() - 1);
            if (p2Var instanceof eo) {
                boolean P9 = ((eo) p2Var).P9();
                this.f34026w0 = true;
                this.f34031x0 = true;
                bi.g2 g2Var = new bi.g2(h3Var, editTextBoldCursor, z10, d2Var, 20);
                if (P9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(g2Var, j3);
                return;
            }
            this.f34026w0 = true;
            this.f34031x0 = true;
            if (h3Var != null) {
                h3Var.setFocusable(true);
            } else if (d2Var != null) {
                d2Var.k(true);
            }
            if (z10) {
                AndroidUtilities.runOnUIThread(new kh(2, editTextBoldCursor), 100L);
            }
        }
    }

    @Override
    public final void show() {
        super.show();
        if (org.telegram.ui.Components.voip.i1.f28169d0.V) {
            org.telegram.ui.Components.voip.i1.j();
        }
    }

    public final void u1(java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j60.u1(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final void v1() {
        ChatObject.Call call = this.f33936a1;
        if (call != null && call.call != null) {
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getContext(), 3, null);
            d2Var.q(300L);
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = this.f33936a1.call;
            tL_inputGroupCall.f17212id = groupCall.f17205id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new aa(this, d2Var, exportgroupcallinvite, 12));
        }
    }

    public final void x1(org.telegram.tgnet.TLRPC.GroupCallParticipant r31, final long r32, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j60.x1(org.telegram.tgnet.TLRPC$GroupCallParticipant, long, int):void");
    }

    public final void y1(boolean r18, org.telegram.ui.Cells.d4 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j60.y1(boolean, org.telegram.ui.Cells.d4):void");
    }

    public final void z1() {
        x5 x5Var = this.A2;
        AndroidUtilities.cancelRunOnUIThread(x5Var);
        if (this.f34041z2 && this.U0 != null && VoIPService.getSharedInstance() != null && r1() && this.Q != null && LiteMode.isEnabled(512)) {
            AndroidUtilities.runOnUIThread(x5Var, 30L);
        }
    }

    @Override
    public final void B(float f7, int i10) {
    }
}

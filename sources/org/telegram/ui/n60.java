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
public final class n60 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, ne.d {
    public static n60 D3;
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
    public final l60 B1;
    public final LongSparseIntArray B2;
    public final ne.e B3;
    public final Paint C0;
    public final qh.i C1;
    public final h40 C2;
    public final ne.b C3;
    public final ArrayList D0;
    public z20 D1;
    public final f40 D2;
    public final Paint E;
    public final ArrayList E0;
    public org.telegram.ui.Components.e40 E1;
    public LinearLayout E2;
    public final p40 F;
    public final ArrayList F0;
    public int F1;
    public boolean F2;
    public final o40 G;
    public final ArrayList G0;
    public boolean G1;
    public final org.telegram.ui.Components.yj0 G2;
    public final m40 H;
    public final ArrayList H0;
    public boolean H1;
    public int H2;
    public final ImageView I;
    public int I0;
    public final Paint I1;
    public boolean I2;
    public final ImageView J;
    public final org.telegram.ui.Components.yj0 J0;
    public final Paint J1;
    public final View J2;
    public org.telegram.ui.Components.gl0 K;
    public final org.telegram.ui.Components.yj0 K0;
    public final m60[] K1;
    public final View K2;
    public final r50 L;
    public boolean L0;
    public float L1;
    public GradientDrawable L2;
    public final org.telegram.ui.Components.s6 M;
    public final org.telegram.ui.Components.ea M0;
    public m60 M1;
    public final int[] M2;
    public final x30 N;
    public final org.telegram.ui.Components.ea N0;
    public m60 N1;
    public final b40 N2;
    public final j50 O;
    public float O0;
    public long O1;
    public boolean O2;
    public final h60 P;
    public float P0;
    public float P1;
    public boolean P2;
    public final t50 Q;
    public float Q0;
    public float Q1;
    public RenderNode Q2;
    public final v40 R;
    public RadialGradient R0;
    public boolean R1;
    public float R2;
    public final TextView S;
    public final Matrix S0;
    public boolean S1;
    public boolean S2;
    public final t40 T;
    public final Paint T0;
    public int T1;
    public final String[] T2;
    public final org.telegram.ui.ActionBar.h5 U;
    public final c60 U0;
    public float U1;
    public ObjectAnimator U2;
    public final s50 V;
    public float V0;
    public int V1;
    public ObjectAnimator V2;
    public final org.telegram.ui.ActionBar.h5 W;
    public float W0;
    public boolean W1;
    public final b50 W2;
    public final b60 X;
    public ValueAnimator X0;
    public final int[] X1;
    public org.telegram.ui.Cells.e4 X2;
    public final org.telegram.ui.Components.a00 Y;
    public TLRPC.InputPeer Y0;
    public final ArrayList Y1;
    public org.telegram.ui.Components.voip.l Y2;
    public final ImageReceiver Z;
    public TLRPC.Chat Z0;
    public final ArrayList Z1;
    public org.telegram.ui.Components.voip.t Z2;
    public int f38156a0;
    public ChatObject.Call f38157a1;
    public final e40 a2;
    public org.telegram.ui.Components.e30 f38158a3;
    public final g40 f38159b;
    public final ImageView f38160b0;
    public final boolean f38161b1;
    public final j40 f38162b2;
    public boolean f38163b3;
    public final l30 f38164c;
    public final mh.h f38165c0;
    public final String f38166c1;
    public final w40 f38167c2;
    public boolean f38168c3;
    public final AccountInstance d;
    public final int f38169d0;
    public final i60 f38170d1;
    public float f38171d2;
    public int f38172d3;
    public final r30 e;
    public final RadialProgressView f38173e0;
    public final w30 f38174e1;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f38175e2;
    public AnimatorSet f38176e3;
    public final org.telegram.ui.Components.voip.u2 f38177f;
    public final Drawable f38178f0;
    public final y30 f38179f1;
    public boolean f38180f2;
    public n50 f38181f3;
    public final View f38182g0;
    public final Paint f38183g1;
    public boolean f38184g2;
    public int f38185g3;
    public final org.telegram.ui.Components.voip.u2 h;
    public AnimatorSet f38186h0;
    public ValueAnimator f38187h1;
    public org.telegram.ui.Components.i50 f38188h2;
    public int f38189h3;
    public LaunchActivity f38190i0;
    public float f38191i1;
    public u50 f38192i2;
    public int f38193i3;
    public final UndoView[] f38194j0;
    public final LinearLayout f38195j1;
    public Boolean f38196j2;
    public int f38197j3;
    public final org.telegram.ui.Cells.k f38198k0;
    public final org.telegram.ui.ActionBar.u0 f38199k1;
    public int f38200k2;
    public int f38201k3;
    public boolean f38202l0;
    public final org.telegram.ui.ActionBar.u0 l1;
    public boolean f38203l2;
    public int f38204l3;
    public org.telegram.ui.Components.v40 m0;
    public final org.telegram.ui.ActionBar.u0 f38205m1;
    public final a40 f38206m2;
    public int f38207m3;
    public final org.telegram.ui.Components.voip.u2 f38208n;
    public org.telegram.ui.Components.v40 f38209n0;
    public final org.telegram.ui.ActionBar.e1 f38210n1;
    public final org.telegram.ui.Components.mm0 f38211n2;
    public int f38212n3;
    public int f38213o0;
    public final org.telegram.ui.ActionBar.e1 f38214o1;
    public final s60 f38215o2;
    public int f38216o3;
    public y50 f38217p0;
    public final org.telegram.ui.ActionBar.e1 f38218p1;
    public final org.telegram.ui.Components.f30 f38219p2;
    public int f38220p3;
    public final ArrayList f38221q0;
    public final org.telegram.ui.ActionBar.e1 f38222q1;
    public ViewTreeObserver.OnPreDrawListener f38223q2;
    public int f38224q3;
    public final org.telegram.ui.Components.voip.u2 f38225r;
    public h50 f38226r0;
    public final org.telegram.ui.ActionBar.e1 f38227r1;
    public final org.telegram.ui.Components.voip.h f38228r2;
    public int f38229r3;
    public final org.telegram.ui.Components.voip.u2 f38230s;
    public boolean f38231s0;
    public final org.telegram.ui.ActionBar.e1 f38232s1;
    public boolean f38233s2;
    public int f38234s3;
    public long f38235t0;
    public final org.telegram.ui.ActionBar.e1 f38236t1;
    public final ArrayList f38237t2;
    public int f38238t3;
    public boolean f38239u0;
    public final org.telegram.ui.ActionBar.e1 f38240u1;
    public boolean f38241u2;
    public int f38242u3;
    public final org.telegram.ui.Components.voip.u2 v;
    public final RectF f38243v0;
    public final org.telegram.ui.ActionBar.e1 f38244v1;
    public final z20 f38245v2;
    public int f38246v3;
    public final org.telegram.ui.Components.voip.u2 f38247w;
    public boolean f38248w0;
    public final org.telegram.ui.ActionBar.e1 f38249w1;
    public final v30 f38250w2;
    public final o50 f38251w3;
    public final s30 f38252x;
    public boolean f38253x0;
    public final org.telegram.ui.ActionBar.e1 f38254x1;
    public final org.telegram.ui.Components.ve f38255x2;
    public Boolean f38256x3;
    public final ImageView f38257y;
    public float f38258y0;
    public final org.telegram.ui.ActionBar.e1 f38259y1;
    public final z20 f38260y2;
    public Integer y3;
    public y40 f38261z0;
    public final LinearLayout f38262z1;
    public boolean f38263z2;
    public final ne.b f38264z3;

    public n60(final LaunchActivity launchActivity, AccountInstance accountInstance, ChatObject.Call call, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        super((Context) launchActivity, (org.telegram.ui.ActionBar.c6) null, true, true);
        String string;
        int i10;
        final LaunchActivity launchActivity2;
        n60 n60Var;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.E = new Paint(1);
        this.f38194j0 = new UndoView[2];
        this.f38221q0 = new ArrayList();
        this.f38243v0 = new RectF();
        this.C0 = new Paint(1);
        this.D0 = new ArrayList();
        this.E0 = new ArrayList();
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new ArrayList();
        this.C1 = new qh.i(new z20(this, 8));
        this.F1 = 0;
        this.G1 = false;
        this.I1 = new Paint(7);
        this.J1 = new Paint(7);
        this.K1 = new m60[8];
        this.L1 = 1.0f;
        this.W1 = true;
        this.X1 = new int[4];
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.f38228r2 = new org.telegram.ui.Components.voip.h();
        this.f38237t2 = new ArrayList();
        this.f38245v2 = new z20(this, 0);
        this.f38250w2 = new v30(this);
        this.f38255x2 = new org.telegram.ui.Components.ve(20);
        this.f38260y2 = new z20(this, 1);
        this.f38263z2 = false;
        this.A2 = new a6(this, 6);
        this.B2 = new LongSparseIntArray();
        this.M2 = new int[2];
        this.P2 = true;
        this.T2 = new String[2];
        this.f38172d3 = -1;
        this.f38251w3 = new o50(this);
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f24465f;
        this.f38264z3 = new ne.b(2, this, esVar, 350L);
        this.A3 = new ne.b(3, this, esVar, 220L, true);
        this.B3 = new ne.e(4, this, esVar, 350L);
        this.C3 = new ne.b(5, this, esVar, 350L);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        setOpenNoDelay(true);
        this.d = accountInstance;
        this.f38157a1 = call;
        this.Y0 = inputPeer;
        this.Z0 = chat;
        this.f38166c1 = str;
        this.currentAccount = accountInstance.getCurrentAccount();
        this.f38161b1 = z10;
        this.resourcesProvider = new bi.s0();
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.f38169d0 = MessagesController.getInstance(this.currentAccount).config.groupCallMessageLengthLimit.get();
        this.fullWidth = true;
        G3 = false;
        F3 = false;
        I3 = false;
        setDelegate(new q40(this));
        this.drawDoubleNavigationBar = true;
        this.drawNavigationBar = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.W2 = new b50(this);
        setOnDismissListener(new d30(this, 0));
        setDimBehindAlpha(75);
        h60 h60Var = new h60(this, launchActivity);
        this.P = h60Var;
        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(true);
        int i11 = org.telegram.ui.ActionBar.g6.f19848qg;
        eqVar.b(org.telegram.ui.ActionBar.g6.v0(i11));
        eqVar.d();
        j50 j50Var = new j50(this, launchActivity, eqVar);
        this.O = j50Var;
        j50Var.setSubtitle("");
        j50Var.getSubtitleTextView().setVisibility(0);
        j50Var.l();
        j50Var.getAdditionalSubtitleTextView().setPadding(AndroidUtilities.dp(24.0f), 0, 0, 0);
        AndroidUtilities.updateViewVisibilityAnimated(j50Var.getAdditionalSubtitleTextView(), this.f38241u2, 1.0f, false);
        j50Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.g6.v0(i11));
        int i12 = org.telegram.ui.ActionBar.g6.f19755lg;
        j50Var.setSubtitleColor(org.telegram.ui.ActionBar.g6.v0(i12));
        j50Var.setBackButtonImage(R.drawable.ic_ab_back);
        j50Var.setOccupyStatusBar(false);
        j50Var.setAllowOverlayTitle(false);
        int i13 = org.telegram.ui.ActionBar.g6.f19680hg;
        j50Var.D(org.telegram.ui.ActionBar.g6.v0(i13), false);
        j50Var.C(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f20007z8), false);
        j50Var.setTitleColor(org.telegram.ui.ActionBar.g6.v0(i13));
        j50Var.setSubtitleColor(org.telegram.ui.ActionBar.g6.v0(i12));
        j50Var.setActionBarMenuOnItemClick(new q50(this, launchActivity));
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
        VoIPService.audioLevelsCallback = new w20(this, 3);
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
        this.f38178f0 = launchActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.voip_filled, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        this.J0 = yj0Var;
        this.K0 = new org.telegram.ui.Components.yj0(R.raw.hand_2, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        r50 r50Var = new r50(this, launchActivity);
        this.L = r50Var;
        this.containerView = r50Var;
        r50Var.setClipToPadding(false);
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
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(launchActivity);
            this.U = h5Var;
            h5Var.setGravity(17);
            h5Var.setTextColor(-1);
            h5Var.setTypeface(AndroidUtilities.bold());
            h5Var.setTextSize(18);
            h5Var.k(LocaleController.getString(R.string.VoipChatStartsIn));
            this.containerView.addView(h5Var, w7.z5.a(-2.0f, 21.0f, 0.0f, 21.0f, 311.0f, -2, 49));
            s50 s50Var = new s50(this, launchActivity);
            this.V = s50Var;
            s50Var.setGravity(17);
            s50Var.setTextColor(-1);
            s50Var.setTypeface(AndroidUtilities.bold());
            s50Var.setTextSize(60);
            this.containerView.addView(s50Var, w7.z5.a(-2.0f, 21.0f, 0.0f, 21.0f, 231.0f, -2, 49));
            org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(launchActivity);
            this.W = h5Var2;
            h5Var2.setGravity(17);
            h5Var2.setTextColor(-1);
            h5Var2.setTypeface(AndroidUtilities.bold());
            h5Var2.setTextSize(18);
            this.containerView.addView(h5Var2, w7.z5.a(-2.0f, 21.0f, 0.0f, 21.0f, 201.0f, -2, 49));
        }
        if (s1()) {
            c60 c60Var = new c60(this, launchActivity);
            this.U0 = c60Var;
            this.containerView.addView(c60Var, w7.z5.a(80.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 51));
        }
        t50 t50Var = new t50(this, launchActivity);
        this.Q = t50Var;
        t50Var.setClipToPadding(false);
        t50Var.setClipChildren(false);
        b60 b60Var = new b60(this);
        this.X = b60Var;
        b60Var.f44901o = esVar;
        b60Var.d = 350L;
        b60Var.f44917c = 350L;
        b60Var.e = 350L;
        b60Var.S();
        t50Var.setItemAnimator(b60Var);
        t50Var.setOnScrollListener(new k30(this));
        t50Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.a00 a00Var = new org.telegram.ui.Components.a00(F3 ? 6 : 2, t50Var);
        this.Y = a00Var;
        t50Var.setLayoutManager(a00Var);
        l30 l30Var = new l30(this);
        this.f38164c = l30Var;
        a00Var.z1(l30Var);
        t50Var.i(new m30(this));
        a00Var.C1();
        this.containerView.addView(t50Var, w7.z5.a(-1.0f, 14.0f, 14.0f, 14.0f, 231.0f, -1, 51));
        t50Var.setAdapter(h60Var);
        t50Var.setTopBottomSelectorRadius(13);
        t50Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f19627eg));
        t50Var.setOnItemClickListener(new f7(this, launchActivity, call, 14));
        t50Var.setOnItemLongClickListener(new w20(this, 4));
        if (s1()) {
            l60 l60Var = new l60(this, getContext());
            this.B1 = l60Var;
            this.containerView.addView(l60Var, w7.z5.a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 49));
        }
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(launchActivity);
        this.f38211n2 = mm0Var;
        this.containerView.addView(mm0Var, w7.z5.a(-1.0f, 14.0f, 14.0f, 324.0f, 14.0f, -1, 51));
        s60 s60Var = new s60(call, this.currentAccount, this);
        this.f38215o2 = s60Var;
        mm0Var.setAdapter(s60Var);
        s4.s sVar = new s4.s(6, false);
        mm0Var.setLayoutManager(sVar);
        sVar.z1(new o30(this));
        mm0Var.setOnItemClickListener(new org.telegram.ui.Components.am0(this) {
            public final n60 f41714b;

            {
                this.f41714b = this;
            }

            @Override
            public final void a(int i15, View view) {
                switch (r2) {
                    case 0:
                        n60 n60Var2 = this.f41714b;
                        n60Var2.getClass();
                        org.telegram.ui.Components.e30 e30Var = (org.telegram.ui.Components.e30) view;
                        if (e30Var.getVideoParticipant() == null) {
                            n60Var2.f1(new ChatObject.VideoParticipant(e30Var.getParticipant(), false, false));
                            return;
                        } else {
                            n60Var2.f1(e30Var.getVideoParticipant());
                            return;
                        }
                    default:
                        n60 n60Var3 = this.f41714b;
                        n60Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                        if (lVar.getParticipant() != null) {
                            n60Var3.f1(lVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        s4.k kVar = new s4.k();
        kVar.S();
        kVar.f44901o = esVar;
        kVar.d = 350L;
        kVar.f44917c = 350L;
        kVar.e = 350L;
        mm0Var.setItemAnimator(new p30(this));
        mm0Var.setOnScrollListener(new q30(this));
        s60Var.H(mm0Var, false, false);
        mm0Var.setVisibility(8);
        r30 r30Var = new r30(this, launchActivity);
        this.e = r30Var;
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Jg);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.S0 = new Matrix();
        this.R0 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.T0 = paint;
        paint.setShader(this.R0);
        org.telegram.ui.Components.ea eaVar = new org.telegram.ui.Components.ea(9);
        this.M0 = eaVar;
        org.telegram.ui.Components.ea eaVar2 = new org.telegram.ui.Components.ea(12);
        this.N0 = eaVar2;
        eaVar.f24333a = AndroidUtilities.dp(62.0f) * 0.45454547f;
        eaVar.f24334b = AndroidUtilities.dp(72.0f) * 0.45454547f;
        eaVar.b();
        eaVar2.f24333a = AndroidUtilities.dp(65.0f) * 0.45454547f;
        eaVar2.f24334b = AndroidUtilities.dp(75.0f) * 0.45454547f;
        eaVar2.b();
        int i15 = org.telegram.ui.ActionBar.g6.Ig;
        eaVar.d.setColor(i0.a.k(org.telegram.ui.ActionBar.g6.v0(i15), 38));
        eaVar2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.g6.v0(i15), 76));
        org.telegram.ui.Components.voip.u2 u2Var = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.f38225r = u2Var;
        u2Var.setCheckable(true);
        u2Var.setTextSize(12);
        r30Var.a(u2Var);
        u2Var.setOnClickListener(new x20(this, 7));
        org.telegram.ui.Components.voip.u2 u2Var2 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.f38208n = u2Var2;
        u2Var2.setCheckable(true);
        u2Var2.setTextSize(12);
        u2Var2.d(false, false);
        u2Var2.setCrossOffset(-AndroidUtilities.dpf2(3.5f));
        u2Var2.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), false, false);
        org.telegram.ui.Components.voip.u2 u2Var3 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.f38177f = u2Var3;
        u2Var3.setCheckable(true);
        u2Var3.setTextSize(12);
        u2Var3.d(false, false);
        org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(launchActivity);
        u2Var3.addView(bk0Var, w7.z5.a(32.0f, 0.0f, 10.0f, 0.0f, 0.0f, 32, 1));
        org.telegram.ui.Components.yj0 yj0Var2 = new org.telegram.ui.Components.yj0(R.raw.camera_flip, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.G2 = yj0Var2;
        bk0Var.setAnimation(yj0Var2);
        u2Var3.setOnClickListener(new x20(this, 10));
        r30Var.a(u2Var3);
        org.telegram.ui.Components.voip.u2 u2Var4 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.h = u2Var4;
        u2Var4.setCheckable(true);
        u2Var4.setTextSize(12);
        u2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.f38160b0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i16 = R.drawable.filled_sound_on;
        this.f38156a0 = i16;
        imageView.setImageResource(i16);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        u2Var4.addView(imageView, w7.z5.a(30.0f, 0.0f, 11.0f, 0.0f, 0.0f, 30, 1));
        u2Var4.setOnClickListener(new x20(this, 11));
        r30Var.a(u2Var4);
        r30Var.a(u2Var2);
        org.telegram.ui.Components.voip.u2 u2Var5 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.f38230s = u2Var5;
        u2Var5.setTextSize(12);
        u2Var5.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Dg), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        u2Var5.setOnClickListener(new View.OnClickListener(this) {
            public final n60 f34442b;

            {
                this.f34442b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        n60.q(this.f34442b, launchActivity);
                        return;
                    default:
                        n60 n60Var2 = this.f34442b;
                        n60Var2.a2.e();
                        ChatObject.Call call2 = n60Var2.f38157a1;
                        if (call2 != null && !call2.isScheduled()) {
                            n60Var2.J1();
                            n60.u1(launchActivity, new z20(n60Var2, 5), false, false);
                            return;
                        }
                        n60Var2.dismiss();
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
        s30 s30Var = new s30(this, launchActivity);
        this.f38252x = s30Var;
        s30Var.setAnimation(yj0Var);
        s30Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.u2 u2Var7 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.f38247w = u2Var7;
        u2Var7.setDrawBackground(false);
        u2Var7.setTextSize(12);
        u2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        u2Var7.addView(s30Var, w7.z5.e(50, 50, 49));
        r30Var.a(u2Var7);
        u2Var7.setOnClickListener(new u30(this));
        r30Var.a(u2Var6);
        r30Var.a(u2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.f38257y = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        u2Var7.addView(imageView2, w7.z5.a(24.0f, 0.0f, 13.0f, 0.0f, 0.0f, 24, 49));
        if (this.f38157a1 != null && s1() && !this.f38157a1.isScheduled()) {
            imageView2.setVisibility(0);
            s30Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.f38173e0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Og));
        j50Var.setAlpha(0.0f);
        j50Var.getBackButton().setScaleX(0.9f);
        j50Var.getBackButton().setScaleY(0.9f);
        j50Var.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        j50Var.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        j50Var.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        j50Var.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(launchActivity, (org.telegram.ui.ActionBar.y) null, 0, org.telegram.ui.ActionBar.g6.v0(i13));
        this.f38199k1 = u0Var;
        u0Var.setLongClickEnabled(false);
        u0Var.setIcon(R.drawable.ic_ab_other);
        u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var.setSubMenuOpenSide(2);
        u0Var.setDelegate(new w20(this, 0));
        int i17 = org.telegram.ui.ActionBar.g6.f19698ig;
        u0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i17), 6));
        u0Var.setOnClickListener(new x20(this, 0));
        u0Var.G(org.telegram.ui.ActionBar.g6.v0(i13), false);
        u0Var.G(org.telegram.ui.ActionBar.g6.v0(i13), true);
        org.telegram.ui.ActionBar.u0 u0Var2 = new org.telegram.ui.ActionBar.u0(launchActivity, (org.telegram.ui.ActionBar.y) null, 0, org.telegram.ui.ActionBar.g6.v0(i13));
        this.l1 = u0Var2;
        u0Var2.setLongClickEnabled(false);
        u0Var2.setIcon(R.drawable.msg_voice_pip);
        u0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        u0Var2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i17), 6));
        u0Var2.setOnClickListener(new x20(this, 1));
        org.telegram.ui.ActionBar.u0 u0Var3 = new org.telegram.ui.ActionBar.u0(launchActivity, (org.telegram.ui.ActionBar.y) null, 0, org.telegram.ui.ActionBar.g6.v0(i13));
        this.f38205m1 = u0Var3;
        u0Var3.setLongClickEnabled(false);
        u0Var3.setIcon(R.drawable.msg_screencast);
        u0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        u0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i17), 6));
        u0Var3.setOnClickListener(new x20(this, 2));
        w30 w30Var = new w30(this, launchActivity, launchActivity);
        this.f38174e1 = w30Var;
        x30 x30Var = new x30(launchActivity);
        this.N = x30Var;
        x30Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.f38183g1 = paint2;
        paint2.setColor(-12761513);
        y30 y30Var = new y30(this, getContext());
        this.f38179f1 = y30Var;
        y30Var.setTextColor(getThemedColor(i13));
        y30Var.setTextSize(1, 11.0f);
        y30Var.setText(LocaleController.getString(R.string.VoipChannelLabelLive));
        y30Var.setMaxLines(1);
        y30Var.setGravity(17);
        y30Var.setTypeface(AndroidUtilities.bold());
        y30Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f));
        y30Var.setTag(-1);
        if (!s1()) {
            y30Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f38195j1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(w30Var, w7.z5.l(1.0f, 0, -2));
        linearLayout.addView(y30Var, w7.z5.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.containerView.addView(x30Var, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        this.containerView.addView(linearLayout, w7.z5.a(-2.0f, 23.0f, 0.0f, 48.0f, 0.0f, -2, 51));
        this.containerView.addView(j50Var, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.f38262z1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(u0Var3, w7.z5.n(48, 48));
        linearLayout2.addView(u0Var2, w7.z5.n(48, 48));
        linearLayout2.addView(u0Var, w7.z5.n(48, 48));
        this.containerView.addView(linearLayout2, w7.z5.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.f38182g0 = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.V5));
        this.containerView.addView(view, w7.z5.d(1.0f, -1));
        for (int i18 = 0; i18 < 2; i18++) {
            this.f38194j0[i18] = new z30(this, launchActivity);
            this.f38194j0[i18].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            this.f38194j0[i18].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.containerView.addView(this.f38194j0[i18], w7.z5.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83));
        }
        org.telegram.ui.Cells.k kVar2 = new org.telegram.ui.Cells.k(launchActivity, true);
        this.f38198k0 = kVar2;
        kVar2.setTag(R.id.fit_width_tag, 240);
        this.f38199k1.h(kVar2, AndroidUtilities.dp(48.0f));
        this.f38199k1.setShowSubmenuByMove(false);
        int i19 = org.telegram.ui.ActionBar.g6.f19627eg;
        kVar2.setBackground(org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.v0(i19), 6, 6));
        org.telegram.ui.ActionBar.u0 u0Var4 = this.f38199k1;
        org.telegram.ui.ActionBar.e1 d = u0Var4.d(1, 0, null, LocaleController.getString(R.string.VoipGroupAllCanSpeak), true, true, u0Var4.m0);
        this.f38240u1 = d;
        d.j(true, false);
        org.telegram.ui.ActionBar.u0 u0Var5 = this.f38199k1;
        org.telegram.ui.ActionBar.e1 d10 = u0Var5.d(2, 0, null, LocaleController.getString(R.string.VoipGroupOnlyAdminsCanSpeak), true, true, u0Var5.m0);
        this.f38244v1 = d10;
        d10.j(false, true);
        int i20 = org.telegram.ui.ActionBar.g6.f19961wg;
        d.setCheckColor(i20);
        d.c(org.telegram.ui.ActionBar.g6.v0(i20), org.telegram.ui.ActionBar.g6.v0(i20));
        d10.setCheckColor(i20);
        d10.c(org.telegram.ui.ActionBar.g6.v0(i20), org.telegram.ui.ActionBar.g6.v0(i20));
        Paint paint3 = new Paint(1);
        int i21 = org.telegram.ui.ActionBar.g6.f19680hg;
        paint3.setColor(org.telegram.ui.ActionBar.g6.v0(i21));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.u0 u0Var6 = this.f38199k1;
        org.telegram.ui.ActionBar.e1 d11 = u0Var6.d(10, R.drawable.msg_voice_speaker, null, LocaleController.getString(R.string.VoipGroupAudio), true, false, u0Var6.m0);
        this.f38218p1 = d11;
        d11.setItemHeight(56);
        org.telegram.ui.ActionBar.u0 u0Var7 = this.f38199k1;
        org.telegram.ui.ActionBar.e1 d12 = u0Var7.d(11, R.drawable.msg_noise_on, null, LocaleController.getString(R.string.VoipNoiseCancellation), true, false, u0Var7.m0);
        this.f38222q1 = d12;
        d12.setItemHeight(56);
        TextView b10 = this.f38199k1.b(i0.a.d(0.3f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f19664gg), -16777216));
        this.A1 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.u0 u0Var8 = this.f38199k1;
        org.telegram.ui.ActionBar.e1 d13 = u0Var8.d(6, R.drawable.msg_edit, this.f38170d1, LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEditTitle : R.string.VoipGroupEditTitle), true, false, u0Var8.m0);
        this.f38214o1 = d13;
        org.telegram.ui.ActionBar.u0 u0Var9 = this.f38199k1;
        org.telegram.ui.ActionBar.e1 d14 = u0Var9.d(7, R.drawable.msg_permissions, this.f38170d1, LocaleController.getString(R.string.VoipGroupEditPermissions), false, false, u0Var9.m0);
        this.f38227r1 = d14;
        org.telegram.ui.ActionBar.e1 e = this.f38199k1.e(3, R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareInviteLink));
        this.f38210n1 = e;
        i60 i60Var = new i60();
        this.f38170d1 = i60Var;
        org.telegram.ui.ActionBar.e1 e7 = this.f38199k1.e(9, R.drawable.msg_screencast, LocaleController.getString(R.string.VoipChatStartScreenCapture));
        this.f38236t1 = e7;
        org.telegram.ui.ActionBar.u0 u0Var10 = this.f38199k1;
        org.telegram.ui.ActionBar.e1 d15 = u0Var10.d(5, 0, i60Var, LocaleController.getString(R.string.VoipGroupRecordCall), true, false, u0Var10.m0);
        this.f38232s1 = d15;
        i60Var.a(d15.getImageView());
        org.telegram.ui.ActionBar.e1 e10 = this.f38199k1.e(12, R.drawable.menu_stream_comments_24, LocaleController.getString(R.string.VoipChannelEnableComments));
        this.f38254x1 = e10;
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        org.telegram.ui.ActionBar.e1 e11 = this.f38199k1.e(13, R.drawable._menu_stream_comments_off_24, LocaleController.getString(R.string.VoipChannelDisableComments));
        this.f38259y1 = e11;
        org.telegram.ui.ActionBar.u0 u0Var11 = this.f38199k1;
        int i22 = R.drawable.msg_cancel;
        if (p1()) {
            i10 = i21;
            string = LocaleController.getString(R.string.VoipGroupEndConference);
        } else {
            string = LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat);
            i10 = i21;
        }
        org.telegram.ui.ActionBar.e1 e12 = u0Var11.e(4, i22, string);
        this.f38249w1 = e12;
        this.f38199k1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.g6.v0(i19));
        this.f38199k1.getPopupLayout().setFitItems(true);
        e10.c(org.telegram.ui.ActionBar.g6.v0(i10), org.telegram.ui.ActionBar.g6.v0(i10));
        e11.c(org.telegram.ui.ActionBar.g6.v0(i10), org.telegram.ui.ActionBar.g6.v0(i10));
        d11.c(org.telegram.ui.ActionBar.g6.v0(i10), org.telegram.ui.ActionBar.g6.v0(i10));
        d12.c(org.telegram.ui.ActionBar.g6.v0(i10), org.telegram.ui.ActionBar.g6.v0(i10));
        int i23 = org.telegram.ui.ActionBar.g6.f19943vg;
        e12.c(org.telegram.ui.ActionBar.g6.v0(i23), org.telegram.ui.ActionBar.g6.v0(i23));
        e.c(org.telegram.ui.ActionBar.g6.v0(i10), org.telegram.ui.ActionBar.g6.v0(i10));
        d13.c(org.telegram.ui.ActionBar.g6.v0(i10), org.telegram.ui.ActionBar.g6.v0(i10));
        d14.c(org.telegram.ui.ActionBar.g6.v0(i10), org.telegram.ui.ActionBar.g6.v0(i10));
        d15.c(org.telegram.ui.ActionBar.g6.v0(i10), org.telegram.ui.ActionBar.g6.v0(i10));
        e7.c(org.telegram.ui.ActionBar.g6.v0(i10), org.telegram.ui.ActionBar.g6.v0(i10));
        if (this.f38157a1 != null) {
            m1();
        }
        if (p1()) {
            this.f38217p0 = new y50();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.f38217p0.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        Q1(false);
        this.O.getTitleTextView().setOnClickListener(new x20(this, 3));
        a40 a40Var = new a40(this, launchActivity);
        this.f38206m2 = a40Var;
        b40 b40Var = new b40(this);
        this.N2 = b40Var;
        a40Var.setClipToPadding(false);
        b40Var.S();
        b40Var.f44901o = org.telegram.ui.Components.es.f24465f;
        b40Var.d = 350L;
        b40Var.f44917c = 350L;
        b40Var.e = 350L;
        a40Var.setItemAnimator(b40Var);
        a40Var.setOnScrollListener(new c40(this));
        a40Var.setClipChildren(false);
        s4.b0 b0Var = new s4.b0();
        b0Var.j1(0);
        a40Var.setLayoutManager(b0Var);
        org.telegram.ui.Components.f30 f30Var = new org.telegram.ui.Components.f30(call, this.currentAccount, this);
        this.f38219p2 = f30Var;
        a40Var.setAdapter(f30Var);
        f30Var.F(a40Var, false);
        a40Var.setOnItemClickListener(new org.telegram.ui.Components.am0(this) {
            public final n60 f41714b;

            {
                this.f41714b = this;
            }

            @Override
            public final void a(int i152, View view2) {
                switch (r2) {
                    case 0:
                        n60 n60Var2 = this.f41714b;
                        n60Var2.getClass();
                        org.telegram.ui.Components.e30 e30Var = (org.telegram.ui.Components.e30) view2;
                        if (e30Var.getVideoParticipant() == null) {
                            n60Var2.f1(new ChatObject.VideoParticipant(e30Var.getParticipant(), false, false));
                            return;
                        } else {
                            n60Var2.f1(e30Var.getVideoParticipant());
                            return;
                        }
                    default:
                        n60 n60Var3 = this.f41714b;
                        n60Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view2;
                        if (lVar.getParticipant() != null) {
                            n60Var3.f1(lVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        a40Var.setOnItemLongClickListener(new w20(this, 1));
        a40Var.setVisibility(8);
        a40Var.i(new d40());
        e40 e40Var = new e40(this, launchActivity, this.Q, a40Var, this.Y1, this.f38157a1, this);
        this.a2 = e40Var;
        e40Var.setClipChildren(false);
        f30Var.E(this.Y1, e40Var);
        if (this.f38211n2 != null) {
            this.f38215o2.G(this.Y1, e40Var);
        }
        f40 f40Var = new f40(this, launchActivity);
        this.D2 = f40Var;
        g40 g40Var = new g40(this, launchActivity, this.O, this.Q, f40Var);
        this.f38159b = g40Var;
        g40Var.setImagesLayerNum(Integer.MAX_VALUE);
        g40Var.setInvalidateWithParent(true);
        f40Var.setProfileGalleryView(g40Var);
        h40 h40Var = new h40(this, launchActivity);
        this.C2 = h40Var;
        h40Var.setVisibility(8);
        g40Var.setVisibility(0);
        g40Var.b(new i40(this));
        j40 j40Var = new j40(this, launchActivity);
        this.f38162b2 = j40Var;
        this.containerView.addView(e40Var);
        e40Var.addView(a40Var, w7.z5.a(80.0f, 0.0f, 0.0f, 0.0f, 100.0f, -1, 80));
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
        this.f38165c0 = hVar;
        hVar.setDelegate(new k40(this));
        hVar.setClickCellDelegate(new l40(this));
        if (this.f38157a1 != null) {
            hVar.C0(this.d.getCurrentAccount(), this.f38157a1.getInputGroupCall(false));
        }
        this.containerView.addView(hVar, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(launchActivity, false, true, true);
        this.M = s6Var;
        s6Var.setGravity(17);
        s6Var.setTextSize(AndroidUtilities.dp(15.0f));
        s6Var.setTextColor(-1);
        s6Var.b(0.4f, 320L, org.telegram.ui.Components.es.h);
        s6Var.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.e);
        m40 m40Var = new m40(this, launchActivity, this.L, LaunchActivity.R(), this.resourcesProvider);
        this.H = m40Var;
        m40Var.J = true;
        m40Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f38169d0)});
        m40Var.getEditText().setLinkTextColor(-11683585);
        m40Var.setHint(LocaleController.getString(R.string.TypeMessage));
        m40Var.getEditText().addTextChangedListener(new n40(this));
        m40Var.s();
        o40 o40Var = new o40(this, launchActivity);
        this.G = o40Var;
        this.containerView.addView(o40Var, w7.z5.d(-1.0f, -1));
        p40 p40Var = new p40(launchActivity);
        this.F = p40Var;
        p40Var.addView(m40Var, w7.z5.a(-2.0f, 0.0f, 0.0f, 48.0f, 0.0f, -1, 80));
        p40Var.addView(s6Var, w7.z5.a(16.0f, 0.0f, 0.0f, 0.0f, 32.0f, 52, 85));
        s6Var.setTranslationY(-AndroidUtilities.dp(20.0f));
        this.containerView.addView(p40Var, w7.z5.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.J = imageView3;
        int i24 = org.telegram.ui.ActionBar.g6.f19690i6;
        imageView3.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i24), 1, -1));
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f7, this.resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(w02, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new x20(this, 4));
        ImageView imageView4 = new ImageView(launchActivity);
        this.I = imageView4;
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i24), 1, -1));
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19933v6, this.resourcesProvider), mode));
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new x20(this, 5));
        p40Var.addView(imageView3, w7.z5.e(48, 48, 85));
        p40Var.addView(imageView4, w7.z5.e(48, 48, 85));
        this.containerView.addView(j40Var);
        h40Var.addView(g40Var, w7.z5.d(-1.0f, -1));
        h40Var.addView(f40Var, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
        this.containerView.addView(h40Var, w7.z5.a(-1.0f, 14.0f, 14.0f, 14.0f, 14.0f, -1, 0));
        P0(false);
        this.P.l();
        if (G3) {
            this.f38215o2.I(this.f38211n2, false);
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
            this.containerView.addView(textView, w7.z5.a(-2.0f, 21.0f, 0.0f, 21.0f, 100.0f, -2, 81));
            org.telegram.ui.Components.ud0 ud0Var = new org.telegram.ui.Components.ud0(launchActivity);
            ud0Var.setTextColor(-1);
            ud0Var.setSelectorColor(-9598483);
            ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            ud0Var.setItemCount(5);
            r40 r40Var = new r40(launchActivity);
            r40Var.setItemCount(5);
            r40Var.setTextColor(-1);
            r40Var.setSelectorColor(-9598483);
            r40Var.setTextOffset(-AndroidUtilities.dp(10.0f));
            s40 s40Var = new s40(launchActivity);
            s40Var.setItemCount(5);
            s40Var.setTextColor(-1);
            s40Var.setSelectorColor(-9598483);
            s40Var.setTextOffset(-AndroidUtilities.dp(34.0f));
            t40 t40Var = new t40(launchActivity);
            this.T = t40Var;
            t40Var.setLines(1);
            t40Var.setSingleLine(true);
            t40Var.setEllipsize(TextUtils.TruncateAt.END);
            t40Var.setGravity(17);
            t40Var.setTextColor(-1);
            t40Var.setTypeface(AndroidUtilities.bold());
            t40Var.setTextSize(1, 14.0f);
            this.containerView.addView(t40Var, w7.z5.a(48.0f, 21.0f, 0.0f, 21.0f, 20.5f, -1, 81));
            launchActivity2 = launchActivity;
            t40Var.setOnClickListener(new org.telegram.messenger.video.g(this, ud0Var, r40Var, s40Var, chat, accountInstance, inputPeer2, 1));
            v40 v40Var = new v40(launchActivity2, ud0Var, r40Var, s40Var);
            this.R = v40Var;
            v40Var.setWeightSum(1.0f);
            v40Var.setOrientation(0);
            this.containerView.addView(v40Var, w7.z5.a(270.0f, 0.0f, 50.0f, 0.0f, 0.0f, -1, 51));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i25 = calendar.get(1);
            int i26 = calendar.get(6);
            v40Var.addView(ud0Var, w7.z5.l(0.5f, 0, 270));
            ud0Var.setMinValue(0);
            ud0Var.setMaxValue(365);
            ud0Var.setWrapSelectorWheel(false);
            ud0Var.setFormatter(new b30(currentTimeMillis, calendar, i25, 0));
            a1.d dVar = new a1.d(this, ud0Var, r40Var, s40Var, 11);
            n60Var = this;
            ud0Var.setOnValueChangedListener(dVar);
            r40Var.setMinValue(0);
            r40Var.setMaxValue(23);
            v40Var.addView(r40Var, w7.z5.l(0.2f, 0, 270));
            r40Var.setFormatter(new org.telegram.ui.Components.co0(21));
            r40Var.setOnValueChangedListener(dVar);
            s40Var.setMinValue(0);
            s40Var.setMaxValue(59);
            s40Var.setValue(0);
            s40Var.setFormatter(new org.telegram.ui.Components.co0(22));
            v40Var.addView(s40Var, w7.z5.l(0.3f, 0, 270));
            s40Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i27 = calendar.get(6);
            int i28 = calendar.get(12);
            int i29 = calendar.get(11);
            ud0Var.setValue(i26 != i27 ? 1 : 0);
            s40Var.setValue(i28);
            r40Var.setValue(i29);
            org.telegram.ui.Components.g5.f(t40Var, textView, 0L, 604800L, 2, ud0Var, r40Var, s40Var);
        } else {
            launchActivity2 = launchActivity;
            n60Var = this;
        }
        w40 w40Var = new w40(n60Var, (ViewGroup) n60Var.getWindow().getDecorView(), n60Var.containerView);
        n60Var.f38167c2 = w40Var;
        w40Var.E = new x40(n60Var);
        g40Var.setPinchToZoomHelper(w40Var);
        n60Var.f38208n.setOnClickListener(new View.OnClickListener(n60Var) {
            public final n60 f34442b;

            {
                this.f34442b = n60Var;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        n60.q(this.f34442b, launchActivity2);
                        return;
                    default:
                        n60 n60Var2 = this.f34442b;
                        n60Var2.a2.e();
                        ChatObject.Call call2 = n60Var2.f38157a1;
                        if (call2 != null && !call2.isScheduled()) {
                            n60Var2.J1();
                            n60.u1(launchActivity2, new z20(n60Var2, 5), false, false);
                            return;
                        }
                        n60Var2.dismiss();
                        return;
                }
            }
        });
        n60Var.M1(false);
        n60Var.J1();
        n60Var.N1(false);
        n60Var.O1(false, false);
        n60Var.C1(0.0f);
        n60Var.P1();
        n60Var.containerView.addView(new FrameLayout(launchActivity2), w7.z5.e(-1, 200, 87));
        n60Var.v.setOnClickListener(new x20(n60Var, 6));
        n60Var.U0();
        w7.b6.a(n60Var.f38208n);
        w7.b6.a(n60Var.f38225r);
        w7.b6.a(n60Var.f38177f);
        w7.b6.a(n60Var.h);
        w7.b6.a(n60Var.f38247w);
        w7.b6.a(n60Var.f38230s);
        w7.b6.a(n60Var.v);
        r0.i0.l(n60Var.containerView, new w20(n60Var, 2));
    }

    public static void B(n60 n60Var, org.telegram.ui.ActionBar.a2[] a2VarArr, boolean z10, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        try {
            a2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        a2VarArr[0] = null;
        if (z10 && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
            n60Var.y1(null, j10, 3);
            return;
        }
        org.telegram.ui.Components.g5.e0(n60Var.currentAccount, tL_error, (org.telegram.ui.ActionBar.m2) n60Var.f38190i0.O().getFragmentStack().get(n60Var.f38190i0.O().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
    }

    public static String B0() {
        String[][] strArr = EmojiData.data;
        String[] strArr2 = strArr[(int) Math.floor(Math.random() * strArr.length)];
        return strArr2[(int) Math.floor(Math.random() * strArr2.length)];
    }

    public static r0.l1 C(n60 n60Var, r0.l1 l1Var) {
        int keyboardHeight;
        r0.i1 i1Var = l1Var.f43497a;
        i0.b f7 = i1Var.f(647);
        i0.b f10 = i1Var.f(8);
        m40 m40Var = n60Var.H;
        if (!m40Var.N && !m40Var.e) {
            keyboardHeight = 0;
        } else {
            keyboardHeight = m40Var.getKeyboardHeight();
        }
        int max = Math.max(f10.d, keyboardHeight);
        ViewGroup.LayoutParams layoutParams = n60Var.f38162b2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f7.d;
        }
        if (m40Var.getEmojiView() != null) {
            m40Var.getEmojiView().setBottomInset(f7.d);
        }
        if (n60Var.S2) {
            ViewGroup viewGroup = n60Var.containerView;
            int i10 = n60Var.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
        } else {
            ViewGroup viewGroup2 = n60Var.containerView;
            int i11 = n60Var.backgroundPaddingLeft;
            viewGroup2.setPadding(f7.f10892a + i11, f7.f10893b, i11 + f7.f10894c, f7.d);
        }
        n60Var.containerView.requestLayout();
        if (max == 0 && !m40Var.N && !m40Var.e && !m40Var.O) {
            m40Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.gl0 gl0Var = n60Var.K;
            if (gl0Var == null) {
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                gl0Var = null;
                if (R != null) {
                    org.telegram.ui.Components.gl0 gl0Var2 = new org.telegram.ui.Components.gl0(1, n60Var.currentAccount, n60Var.getContext(), R, n60Var.resourcesProvider);
                    n60Var.K = gl0Var2;
                    gl0Var2.setDelegate(new p50(n60Var));
                    n60Var.containerView.addView(n60Var.K, w7.z5.e(-2, 52, 81));
                    n60Var.K.p(null, null, false);
                    n60Var.G.bringToFront();
                    n60Var.F.bringToFront();
                    gl0Var = n60Var.K;
                }
            }
            n60Var.K = gl0Var;
        }
        m40Var.H(f10.d, false);
        n60Var.C1.j(l1Var);
        return r0.l1.f43496b;
    }

    public static void C0(n60 n60Var) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("reminderhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("reminderhint", true).commit();
        if (n60Var.f38209n0 == null) {
            org.telegram.ui.Components.v40 v40Var = new org.telegram.ui.Components.v40(n60Var.getContext(), 8);
            n60Var.f38209n0 = v40Var;
            v40Var.setAlpha(0.0f);
            n60Var.f38209n0.setVisibility(4);
            n60Var.f38209n0.setShowingDuration(4000L);
            n60Var.containerView.addView(n60Var.f38209n0, w7.z5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
            n60Var.f38209n0.setText(LocaleController.getString(R.string.VoipChatReminderHint));
            n60Var.f38209n0.d();
        }
        n60Var.f38209n0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        n60Var.f38209n0.f(n60Var.f38247w, true);
    }

    public static void D(n60 n60Var, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        TLRPC.GroupCall groupCall;
        a2Var.dismiss();
        boolean z10 = false;
        if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
            Context context = n60Var.getContext();
            int i10 = n60Var.currentAccount;
            TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
            String str = ((TL_phone.exportedGroupCallInvite) tLObject).link;
            org.telegram.ui.ActionBar.c6 c6Var = n60Var.resourcesProvider;
            ChatObject.Call call = n60Var.f38157a1;
            if (call != null && (groupCall = call.call) != null && groupCall.creator) {
                z10 = true;
            }
            n9.o0(context, i10, inputGroupCall, str, c6Var, false, z10);
        } else if (tL_error != null) {
            new org.telegram.ui.Components.zc(n60Var.topBulletinContainer, new bi.s0()).f0(tL_error, false);
        }
    }

    public static void E(n60 n60Var, int[] iArr, float[] fArr) {
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        s4.b1 K;
        a40 a40Var = n60Var.f38206m2;
        e40 e40Var = n60Var.a2;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant = n60Var.f38157a1.participantsBySources.get(iArr[i10]);
            if (groupCallParticipant != null) {
                if (!e40Var.f29950b) {
                    if (n60Var.f38231s0) {
                        arrayList = n60Var.D0;
                    } else {
                        arrayList = n60Var.f38157a1.visibleParticipants;
                    }
                    int indexOf = arrayList.indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = n60Var.Q.K(indexOf + n60Var.P.d)) != null) {
                        View view = K.f44838a;
                        if (view instanceof org.telegram.ui.Cells.e4) {
                            ((org.telegram.ui.Cells.e4) view).setAmplitude(fArr[i10] * 15.0f);
                            if (view == n60Var.X2 && !n60Var.f38203l2) {
                                n60Var.containerView.invalidate();
                            }
                        }
                    }
                } else {
                    for (int i11 = 0; i11 < a40Var.getChildCount(); i11++) {
                        org.telegram.ui.Components.e30 e30Var = (org.telegram.ui.Components.e30) a40Var.getChildAt(i11);
                        if (MessageObject.getPeerId(e30Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                            e30Var.setAmplitude(fArr[i10] * 15.0f);
                        }
                    }
                }
                e40Var.k(groupCallParticipant, fArr[i10] * 15.0f);
            }
        }
    }

    public static void F(n60 n60Var) {
        Editable text = n60Var.H.getText();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = text.toString();
        tL_textWithEntities.entities = MediaDataController.getInstance(n60Var.currentAccount).getEntities(new CharSequence[]{text}, true);
        n60Var.B1(tL_textWithEntities);
    }

    public static void G0(n60 n60Var) {
        ChatObject.Call call = n60Var.f38157a1;
        if (call != null && call.call != null) {
            TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
            togglegroupcallsettings.call = n60Var.f38157a1.getInputGroupCall();
            togglegroupcallsettings.join_muted = Boolean.valueOf(n60Var.f38157a1.call.join_muted);
            ConnectionsManager connectionsManager = n60Var.d.getConnectionsManager();
            DispatchQueue dispatchQueue = Utilities.stageQueue;
            Objects.requireNonNull(dispatchQueue);
            connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.f1(dispatchQueue), new i30(n60Var, 1));
        }
    }

    public static void H0(n60 n60Var, boolean z10) {
        if (n60Var.f38157a1 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = n60Var.f38157a1.getInputGroupCall();
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        n60Var.f38256x3 = Boolean.valueOf(z10);
        n60Var.I1(true);
        ConnectionsManager connectionsManager = n60Var.d.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.f1(dispatchQueue), new i30(n60Var, 0));
    }

    public static void I0(n60 n60Var) {
        boolean z10;
        int i10;
        if (n60Var.s1()) {
            e40 e40Var = n60Var.a2;
            if (!e40Var.V && e40Var.f29950b && (F3 == n60Var.r1() || AndroidUtilities.isTablet())) {
                z10 = false;
            } else {
                z10 = true;
            }
            Boolean bool = n60Var.f38196j2;
            if (bool != null && z10 == bool.booleanValue()) {
                return;
            }
            int systemUiVisibility = n60Var.containerView.getSystemUiVisibility();
            if (z10) {
                i10 = systemUiVisibility & (-7);
                n60Var.getWindow().clearFlags(1024);
                n60Var.setHideSystemVerticalInsets(false);
            } else {
                n60Var.setHideSystemVerticalInsets(true);
                i10 = systemUiVisibility | 6;
                n60Var.getWindow().addFlags(1024);
            }
            n60Var.containerView.setSystemUiVisibility(i10);
            n60Var.f38196j2 = Boolean.valueOf(z10);
            n60Var.S2 = !z10;
            n60Var.containerView.requestApplyInsets();
            return;
        }
        n60Var.isFullscreen = false;
    }

    public static org.telegram.ui.Components.voip.l J0(n60 n60Var) {
        t50 t50Var = n60Var.Q;
        for (int i10 = 0; i10 < t50Var.getChildCount(); i10++) {
            View childAt = t50Var.getChildAt(i10);
            if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.l) && RecyclerView.R(childAt) >= 0) {
                return (org.telegram.ui.Components.voip.l) childAt;
            }
        }
        return null;
    }

    public static void K0(n60 n60Var) {
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
        j50 j50Var = n60Var.O;
        t50 t50Var = n60Var.Q;
        int childCount = t50Var.getChildCount();
        boolean z12 = false;
        float f14 = 2.1474836E9f;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (RecyclerView.R(t50Var.getChildAt(i10)) >= 0) {
                f14 = Math.min(f14, childAt.getTop());
            }
        }
        if (f14 < 0.0f || f14 == 2.1474836E9f) {
            if (childCount != 0) {
                f14 = 0.0f;
            } else {
                f14 = t50Var.getPaddingTop();
            }
        }
        if (f14 <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float dp4 = f14 + AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if ((z10 && j50Var.getTag() == null) || (!z10 && j50Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            j50Var.setTag(num);
            AnimatorSet animatorSet = n60Var.f38186h0;
            if (animatorSet != null) {
                animatorSet.cancel();
                n60Var.f38186h0 = null;
            }
            if (j50Var.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            n60Var.setUseLightStatusBar(z11);
            ViewPropertyAnimator animate = j50Var.getBackButton().animate();
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
            org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f24465f;
            duration.setInterpolator(esVar).start();
            ViewPropertyAnimator animate2 = j50Var.getTitleTextView().animate();
            if (z10) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(23.0f);
            }
            animate2.translationY(dp).setDuration(300L).setInterpolator(esVar).start();
            ObjectAnimator objectAnimator = n60Var.U2;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                n60Var.U2.cancel();
            }
            org.telegram.ui.ActionBar.h5 subtitleTextView = j50Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            float translationY = j50Var.getSubtitleTextView().getTranslationY();
            if (z10) {
                dp2 = 0.0f;
            } else {
                dp2 = AndroidUtilities.dp(20.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, property, translationY, dp2);
            n60Var.U2 = ofFloat;
            ofFloat.setDuration(300L);
            n60Var.U2.setInterpolator(esVar);
            n60Var.U2.addListener(new i50(0, n60Var, z10));
            n60Var.U2.start();
            ObjectAnimator objectAnimator2 = n60Var.V2;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            org.telegram.ui.ActionBar.h5 additionalSubtitleTextView = j50Var.getAdditionalSubtitleTextView();
            if (z10) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(20.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(additionalSubtitleTextView, property, dp3);
            n60Var.V2 = ofFloat2;
            ofFloat2.setDuration(300L);
            n60Var.V2.setInterpolator(esVar);
            n60Var.V2.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            n60Var.f38186h0 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = n60Var.f38186h0;
            Property property2 = View.ALPHA;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(j50Var, property2, f11);
            x30 x30Var = n60Var.N;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(x30Var, property2, f12);
            View view = n60Var.f38182g0;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, property2, f13));
            n60Var.f38186h0.addListener(new g50(n60Var, 1));
            n60Var.f38186h0.start();
            n60Var.a2.v.setClickable((!z10 || F3) ? true : true);
        }
        if (n60Var.f38258y0 != dp4) {
            n60Var.F1(dp4);
        }
    }

    public static void O(n60 n60Var, org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (!n60Var.isDismissed()) {
            if (z10 && lVar.getRenderer() == null) {
                lVar.setRenderer(org.telegram.ui.Components.voip.t.c(n60Var.Y1, n60Var.a2, lVar, null, null, lVar.getParticipant(), n60Var.f38157a1, n60Var));
            } else if (!z10 && lVar.getRenderer() != null) {
                lVar.getRenderer().setPrimaryView(null);
                lVar.setRenderer(null);
            }
        }
    }

    public static void T(n60 n60Var, int i10, int[] iArr) {
        if (n60Var.s1()) {
            int i11 = org.telegram.ui.ActionBar.g6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.g6.x0(null, i11, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Lg, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20014zg, false), n60Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19737kg, false), org.telegram.ui.ActionBar.g6.x0(null, i11, false), n60Var.U1, 1.0f);
        } else if (i10 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Jg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19996yg, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20014zg, false), n60Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19980xg, false);
        } else if (i10 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Gg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Bg, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Cg, false), n60Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Ag, false);
        } else if (q1(i10)) {
            iArr[0] = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19738kh, false);
            iArr[1] = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19756lh, false);
            iArr[2] = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19775mh, false);
        } else {
            int i12 = org.telegram.ui.ActionBar.g6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.g6.x0(null, i12, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Mg, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Ng, false), n60Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19737kg, false), org.telegram.ui.ActionBar.g6.x0(null, i12, false), n60Var.U1, 1.0f);
        }
        if (q1(i10)) {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19699ih, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19738kh, false));
        } else if (i10 == 1) {
            iArr[3] = i0.a.d(0.75f, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Bg, false), i0.a.d(0.5f, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Fg, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Hg, false)));
        } else {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Jg, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Ig, false));
        }
    }

    public static void d1(LaunchActivity launchActivity, AccountInstance accountInstance, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        if (D3 == null) {
            if (inputPeer != null || VoIPService.getSharedInstance() != null) {
                if (inputPeer != null) {
                    D3 = new n60(launchActivity, accountInstance, accountInstance.getMessagesController().getGroupCall(chat.f18916id, false), chat, inputPeer, z10, str);
                } else {
                    ChatObject.Call call = VoIPService.getSharedInstance().groupCall;
                    if (call != null) {
                        TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(call.chatId));
                        call.addSelfDummyParticipant(true);
                        D3 = new n60(launchActivity, accountInstance, call, chat2, null, z10, str);
                    } else {
                        return;
                    }
                }
                D3.f38190i0 = launchActivity;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ve(19));
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

    public static void n(n60 n60Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(n60Var.currentAccount).sendRequest(declineconferencecallinvite, new h30(n60Var, 0));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(invitedUser.msg_id));
        MessagesController.getInstance(n60Var.currentAccount).deleteMessages(arrayList, null, null, 0L, 0, true, 0);
        ChatObject.Call call = n60Var.f38157a1;
        if (call != null) {
            call.invitedUsers.remove(l4);
            n60Var.f38157a1.invitedUsersMap.remove(l4);
            n60Var.f38157a1.invitedUsersMessageIds.remove(l4);
            n60Var.P0(true);
        }
    }

    public static void o(n60 n60Var, Activity activity, ChatObject.Call call, View view, int i10) {
        TLRPC.Chat chat;
        final ChatObject.Call.InvitedUser invitedUser;
        AccountInstance accountInstance = n60Var.d;
        ArrayList arrayList = n60Var.F0;
        h60 h60Var = n60Var.P;
        if (view instanceof org.telegram.ui.Components.voip.l) {
            n60Var.f1(((org.telegram.ui.Components.voip.l) view).getParticipant());
        } else if (view instanceof org.telegram.ui.Cells.e4) {
            n60Var.G1((org.telegram.ui.Cells.e4) view);
        } else {
            Collection collection = null;
            r7 = null;
            r7 = null;
            r7 = null;
            final Long l4 = null;
            boolean z10 = true;
            if (view instanceof org.telegram.ui.Cells.w3) {
                org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view;
                if (w3Var.getUser() != null) {
                    if (n60Var.p1()) {
                        int i11 = i10 - h60Var.f36412n;
                        if (i11 >= 0 && i11 < n60Var.f38157a1.shadyJoinParticipants.size()) {
                            l4 = n60Var.f38157a1.shadyJoinParticipants.get(i10 - h60Var.f36412n);
                        } else {
                            int i12 = i10 - h60Var.f36414s;
                            if (i12 >= 0 && i12 < n60Var.f38157a1.shadyLeftParticipants.size()) {
                                l4 = n60Var.f38157a1.shadyLeftParticipants.get(i10 - h60Var.f36414s);
                            } else {
                                int i13 = i10 - h60Var.f36411f;
                                if (n60Var.f38231s0) {
                                    if (i13 >= 0 && i13 < arrayList.size()) {
                                        l4 = (Long) arrayList.get(i13);
                                    }
                                } else if (i13 >= 0 && i13 < n60Var.f38157a1.invitedUsers.size()) {
                                    l4 = n60Var.f38157a1.invitedUsers.get(i13);
                                }
                                z10 = false;
                            }
                        }
                        if (!z10 && (invitedUser = n60Var.f38157a1.invitedUsersMessageIds.get(l4)) != null) {
                            org.telegram.ui.Components.l80 F = org.telegram.ui.Components.l80.F(n60Var.container, n60Var.resourcesProvider, w3Var);
                            F.l(R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable(n60Var) {
                                public final n60 f35454b;

                                {
                                    this.f35454b = n60Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            n60.t(this.f35454b, invitedUser, l4);
                                            return;
                                        default:
                                            n60.n(this.f35454b, invitedUser, l4);
                                            return;
                                    }
                                }
                            }, invitedUser.isCalling());
                            F.c(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable(n60Var) {
                                public final n60 f35454b;

                                {
                                    this.f35454b = n60Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            n60.t(this.f35454b, invitedUser, l4);
                                            return;
                                        default:
                                            n60.n(this.f35454b, invitedUser, l4);
                                            return;
                                    }
                                }
                            }, false);
                            F.W(org.telegram.ui.ActionBar.g6.d0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), n60Var.C0.getColor()));
                            F.f26668s = 96;
                            F.Z();
                            return;
                        }
                        return;
                    }
                    n60Var.f38190i0.K0(n60Var.currentAccount);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", w3Var.getUser().f19063id);
                    if (w3Var.f22376a.getImageReceiver().hasNotThumb()) {
                        bundle.putBoolean("expandPhoto", true);
                    }
                    n60Var.f38190i0.p0(new ProfileActivity(bundle, null));
                    n60Var.dismiss();
                }
            } else if (i10 == h60Var.f36415w) {
                if (ChatObject.isChannel(n60Var.Z0) && (chat = n60Var.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)) {
                    n60Var.k1(false);
                    return;
                }
                TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(n60Var.j1());
                if (chatFull != null) {
                    n60Var.f38248w0 = false;
                    Context context = n60Var.getContext();
                    int currentAccount = accountInstance.getCurrentAccount();
                    TLRPC.Chat chat2 = n60Var.Z0;
                    ChatObject.Call call2 = n60Var.f38157a1;
                    org.telegram.ui.Components.e40 e40Var = new org.telegram.ui.Components.e40(context, currentAccount, chat2, chatFull, call2.participants, call2.invitedUsersMap);
                    n60Var.E1 = e40Var;
                    e40Var.setOnDismissListener(new d30(n60Var, 2));
                    org.telegram.ui.Components.e40 e40Var2 = n60Var.E1;
                    e40Var2.f24292g0 = new n30(n60Var);
                    e40Var2.show();
                }
            } else if (i10 == h60Var.f36416x) {
                ChatObject.Call call3 = n60Var.f38157a1;
                if (call3 != null && call3.call != null) {
                    ug.m1 m1Var = new ug.m1(activity, n60Var.currentAccount, null, 4, new bi.s0());
                    ChatObject.Call call4 = n60Var.f38157a1;
                    if (call4 != null) {
                        collection = (Collection) Collection.EL.stream(call4.sortedParticipants).map(new k2.f(5)).collect(Collectors.toSet());
                    }
                    m1Var.C0.addAll(collection);
                    m1Var.i0(false, true);
                    m1Var.A0 = new z20(n60Var, 3);
                    m1Var.i0(false, true);
                    m1Var.D0 = new bi.f0(14, n60Var, call);
                    m1Var.show();
                }
            } else if (i10 == h60Var.f36417y) {
                n60Var.w1();
            }
        }
    }

    public static void q(n60 n60Var, Activity activity) {
        LaunchActivity launchActivity = n60Var.f38190i0;
        if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
            n60Var.f38190i0.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
        } else if (VoIPService.getSharedInstance() != null) {
            boolean z10 = false;
            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                n60Var.f38194j0[0].e(1, false);
                if (n60Var.f38261z0 == null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null) {
                        sharedInstance.createCaptureDevice(false);
                    }
                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                        z10 = true;
                    }
                    y40 y40Var = new y40(n60Var, activity, z10);
                    n60Var.f38261z0 = y40Var;
                    y40Var.setBottomPadding(n60Var.containerView.getPaddingBottom());
                    n60Var.container.addView(n60Var.f38261z0);
                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                        return;
                    }
                    return;
                }
                return;
            }
            VoIPService.getSharedInstance().setVideoState(false, 0);
            n60Var.O1(true, false);
            n60Var.N1(false);
            n60Var.f38157a1.sortParticipants();
            n60Var.P0(true);
            n60Var.e.requestLayout();
        }
    }

    public static boolean q1(int i10) {
        if ((VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.call.rtmp_stream) && i10 != 2 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            return false;
        }
        return true;
    }

    public static void r(n60 n60Var, float f7, float f10, float f11, int i10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        n60Var.f38171d2 = floatValue;
        n60Var.a2.f29964n = floatValue;
        float f12 = (floatValue * 1.0f) + ((1.0f - floatValue) * f7);
        h40 h40Var = n60Var.C2;
        h40Var.setScaleX(f12);
        h40Var.setScaleY(f12);
        h40Var.setTranslationX((1.0f - n60Var.f38171d2) * f10);
        h40Var.setTranslationY((1.0f - n60Var.f38171d2) * f11);
        if (!n60Var.f38184g2) {
            n60Var.W2.setAlpha((int) (n60Var.f38171d2 * 100.0f));
        }
        org.telegram.ui.Components.voip.t tVar = n60Var.Z2;
        if (tVar != null) {
            tVar.f30145a.setRoundCorners((1.0f - n60Var.f38171d2) * AndroidUtilities.dp(8.0f));
        }
        h40Var.invalidate();
        n60Var.containerView.invalidate();
        g40 g40Var = n60Var.f38159b;
        int i11 = (int) ((1.0f - n60Var.f38171d2) * i10);
        g40Var.N(i11, i11);
    }

    public static void s(n60 n60Var, ChatObject.Call call, Boolean bool, HashSet hashSet) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        ChatObject.Call call2 = n60Var.f38157a1;
        if (call2 != null && (groupCall = call2.call) != null) {
            String str = groupCall.invite_link;
            int size = hashSet.size();
            AtomicInteger atomicInteger = new AtomicInteger(0);
            HashSet hashSet2 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                n60Var.f38157a1.addInvitedUser(longValue);
                TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                inviteconferencecallparticipant.call = tL_inputGroupCall;
                TLRPC.GroupCall groupCall2 = n60Var.f38157a1.call;
                tL_inputGroupCall.f18933id = groupCall2.f18926id;
                tL_inputGroupCall.access_hash = groupCall2.access_hash;
                inviteconferencecallparticipant.user_id = MessagesController.getInstance(n60Var.currentAccount).getInputUser(longValue);
                inviteconferencecallparticipant.video = bool.booleanValue();
                ConnectionsManager.getInstance(n60Var.currentAccount).sendRequest(inviteconferencecallparticipant, new fi.a1(n60Var, longValue, hashSet2, atomicInteger, size, call, str));
            }
            n60Var.P0(true);
            if (bool.booleanValue() && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(false) != 1) {
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                sharedInstance.requestVideoCall(false);
                sharedInstance.setVideoState(false, 2);
                sharedInstance.setMicMute(false, false, true);
                sharedInstance.switchToSpeaker();
                n60Var.O1(true, true);
            }
        }
    }

    public static void t(n60 n60Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(n60Var.currentAccount).sendRequest(declineconferencecallinvite, new h30(n60Var, 1));
        ChatObject.Call call = n60Var.f38157a1;
        if (call != null) {
            invitedUser.calling = false;
            call.invitedUsersMessageIds.put(l4, invitedUser);
            n60Var.P0(true);
        }
    }

    public static void u(n60 n60Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(n60Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
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
                    alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertTitle);
                    alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertText);
                } else if (ChatObject.isChannelOrGiga(chat)) {
                    alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.VoipChannelLeaveAlertTitle);
                    alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.VoipChannelLeaveAlertText);
                } else {
                    alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.VoipGroupLeaveAlertTitle);
                    alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.VoipGroupLeaveAlertText);
                }
                sharedInstance.getAccount();
                org.telegram.ui.Cells.a2[] a2VarArr = new org.telegram.ui.Cells.a2[1];
                LinearLayout e = org.telegram.messenger.sk.e(context, 1);
                if (!sharedInstance.isConference() || (call != null && (groupCall = call.call) != null && groupCall.creator)) {
                    org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, 1);
                    a2VarArr[0] = a2Var;
                    a2Var.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
                    if (z10) {
                        a2VarArr[0].setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19707j5, false));
                    } else {
                        a2VarArr[0].setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19680hg, false));
                        CheckBoxSquare checkBoxSquare = (CheckBoxSquare) a2VarArr[0].getCheckBoxView();
                        int i10 = org.telegram.ui.ActionBar.g6.f19868rg;
                        int i11 = org.telegram.ui.ActionBar.g6.f19829pg;
                        int i12 = org.telegram.ui.ActionBar.g6.f19794ng;
                        checkBoxSquare.f22807s = i10;
                        checkBoxSquare.v = i11;
                        checkBoxSquare.f22808w = i12;
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
                    a2VarArr[0].setOnClickListener(new a30(a2VarArr, 0));
                }
                alertDialog$Builder.n(e);
                alertDialog$Builder.f19248a.I = org.telegram.ui.ActionBar.g6.f19829pg;
                alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new di.w6(call, a2VarArr, selfId, runnable, 2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (z10) {
                    alertDialog$Builder.f19248a.P0 = false;
                }
                org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder.f19248a;
                if (z10) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        a2Var3.getWindow().setType(2038);
                    } else {
                        a2Var3.getWindow().setType(2003);
                    }
                    a2Var3.getWindow().clearFlags(2);
                }
                if (!z10) {
                    a2Var3.i(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19925ug, false));
                }
                a2Var3.show();
                if (!z10) {
                    TextView textView = (TextView) a2Var3.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19943vg, false));
                    }
                    a2Var3.o(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19680hg, false));
                    return;
                }
                return;
            }
            x1(call, false, selfId, runnable);
        }
    }

    public static void v(n60 n60Var) {
        n60Var.Z0();
        n60Var.W0();
        n60Var.V0();
        n60Var.F.setTranslationY((-n60Var.C1.d()) + n60Var.containerView.getPaddingBottom());
        n60Var.G.invalidate();
        n60Var.a1();
        n60Var.containerView.invalidate();
    }

    public static void w(n60 n60Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(n60Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
        }
    }

    public static void x(n60 n60Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(n60Var.currentAccount).lambda$processUpdates$377(updates, false);
            AndroidUtilities.runOnUIThread(new a3.i0(n60Var, updates, j10, 24));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j10));
        }
        if (atomicInteger.incrementAndGet() == i10 && !hashSet.isEmpty()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey0(n60Var, hashSet, call, str, 6));
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

    public static void y(n60 n60Var, HashSet hashSet, ChatObject.Call call, String str) {
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
            arrayList.add(MessagesController.getInstance(n60Var.currentAccount).getUser(l4));
            getrequirementstocontact.f19121id.add(MessagesController.getInstance(n60Var.currentAccount).getInputUser(longValue));
        }
        bi.c3 c3Var = new bi.c3(n60Var, arrayList, arrayList2, arrayList3, str, 29);
        if (UserConfig.getInstance(n60Var.currentAccount).isPremium()) {
            c3Var.run();
        } else {
            ConnectionsManager.getInstance(n60Var.currentAccount).sendRequest(getrequirementstocontact, new fa(arrayList, arrayList2, c3Var, 13));
        }
    }

    public static void z(n60 n60Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        sg.j0 j0Var = new sg.j0(34, n60Var.currentAccount, U.getContext(), U, new bi.s0());
        j0Var.J1(null, arrayList, arrayList2, arrayList3, str);
        j0Var.show();
    }

    public final void A1() {
        a6 a6Var = this.A2;
        AndroidUtilities.cancelRunOnUIThread(a6Var);
        if (this.f38263z2 && this.U0 != null && VoIPService.getSharedInstance() != null && s1() && this.Q != null && LiteMode.isEnabled(512)) {
            AndroidUtilities.runOnUIThread(a6Var, 30L);
        }
    }

    public final void B1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall inputGroupCall;
        long j10;
        this.H.setText("");
        ChatObject.Call call = this.f38157a1;
        if (call != null && call.call != null && (inputGroupCall = call.getInputGroupCall()) != null) {
            ChatObject.Call call2 = this.f38157a1;
            long j11 = call2.call.f18926id;
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
        e40 e40Var = this.a2;
        if (e40Var == null) {
            f10 = 0.0f;
        } else {
            f10 = e40Var.f29952c;
        }
        float max = Math.max(f7, f10);
        int i12 = org.telegram.ui.ActionBar.g6.f19718jg;
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.g6.f19664gg;
        int offsetColor = AndroidUtilities.getOffsetColor(x02, org.telegram.ui.ActionBar.g6.x0(null, i13, false), f7, 1.0f);
        this.V1 = offsetColor;
        this.N.setBackgroundColor(offsetColor);
        this.f38199k1.B(-14472653);
        this.f38178f0.setColorFilter(new PorterDuffColorFilter(this.V1, PorterDuff.Mode.MULTIPLY));
        this.navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false), org.telegram.ui.ActionBar.g6.x0(null, i13, false), max, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19737kg, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19907tg, false), f7, 1.0f);
        y50 y50Var = this.f38217p0;
        if (y50Var != null) {
            y50Var.f41741j = offsetColor2;
            x50 x50Var = y50Var.f41739g;
            if (x50Var != null) {
                x50Var.invalidate();
            }
        }
        this.C0.setColor(offsetColor2);
        this.E.setColor(offsetColor2);
        this.F.invalidate();
        t50 t50Var = this.Q;
        t50Var.setGlowColor(offsetColor2);
        int i14 = this.F1;
        if (i14 == 3 || q1(i14)) {
            this.f38247w.invalidate();
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
        int offsetColor3 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Dg, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Eg, false), f7, 1.0f);
        this.f38230s.a(offsetColor3, offsetColor3);
        int offsetColor4 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19755lg, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19812og, false), f7, 1.0f);
        int offsetColor5 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19774mg, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19868rg, false), f7, 1.0f);
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider);
        int childCount = t50Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = t50Var.getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Cells.x3) {
                org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) childAt;
                if (p1()) {
                    x3Var.a(w02, w02);
                } else {
                    x3Var.a(offsetColor5, offsetColor4);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.e4;
                j50 j50Var = this.O;
                if (z10) {
                    org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) childAt;
                    if (j50Var.getTag() != null) {
                        i11 = org.telegram.ui.ActionBar.g6.f19868rg;
                    } else {
                        i11 = org.telegram.ui.ActionBar.g6.f19774mg;
                    }
                    e4Var.f(i11, offsetColor5);
                } else if (childAt instanceof org.telegram.ui.Cells.w3) {
                    org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) childAt;
                    if (j50Var.getTag() != null) {
                        i10 = org.telegram.ui.ActionBar.g6.f19868rg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.g6.f19774mg;
                    }
                    w3Var.a(i10, offsetColor5);
                }
            }
        }
        this.containerView.invalidate();
        t50Var.invalidate();
        this.container.invalidate();
    }

    public final void D1(float f7) {
        t50 t50Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        s4.b1 K;
        f7 = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) ? 0.0f : 0.0f;
        float min = (float) (Math.min(8500.0d, 4000.0f * f7) / 8500.0d);
        this.P0 = min;
        this.Q0 = (min - this.O0) / 265.0f;
        ChatObject.Call call = this.f38157a1;
        if (call != null && (t50Var = this.Q) != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(MessageObject.getPeerId(this.A0))) != null) {
            e40 e40Var = this.a2;
            if (!e40Var.f29950b) {
                if (this.f38231s0) {
                    arrayList = this.D0;
                } else {
                    arrayList = this.f38157a1.visibleParticipants;
                }
                int indexOf = arrayList.indexOf(groupCallParticipant);
                if (indexOf >= 0 && (K = t50Var.K(indexOf + this.P.d)) != null) {
                    View view = K.f44838a;
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        ((org.telegram.ui.Cells.e4) view).setAmplitude(f7 * 15.0f);
                        if (view == this.X2 && !this.f38203l2) {
                            this.containerView.invalidate();
                        }
                    }
                }
            } else {
                int i10 = 0;
                while (true) {
                    a40 a40Var = this.f38206m2;
                    if (i10 >= a40Var.getChildCount()) {
                        break;
                    }
                    org.telegram.ui.Components.e30 e30Var = (org.telegram.ui.Components.e30) a40Var.getChildAt(i10);
                    if (MessageObject.getPeerId(e30Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                        e30Var.setAmplitude(f7 * 15.0f);
                    }
                    i10++;
                }
            }
            e40Var.k(groupCallParticipant, f7 * 15.0f);
        }
    }

    public final void E1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        this.f38185g3 = i10;
        this.f38189h3 = i11;
        this.f38193i3 = i12;
        this.f38197j3 = i13;
        this.f38201k3 = i14;
        this.f38204l3 = i15;
        this.f38207m3 = i16;
        this.f38212n3 = i17;
        this.f38216o3 = i18;
        this.f38220p3 = i19;
        this.f38224q3 = i20;
        this.f38229r3 = i21;
        this.f38234s3 = i22;
        this.f38238t3 = i23;
        this.f38242u3 = i24;
        this.f38246v3 = i25;
    }

    public final void F1(float f7) {
        t50 t50Var;
        int dp;
        int i10;
        float f10;
        this.f38258y0 = f7;
        this.Q.setTopGlowOffset((int) (f7 - ((FrameLayout.LayoutParams) t50Var.getLayoutParams()).topMargin));
        float dp2 = f7 - AndroidUtilities.dp(74.0f);
        int i11 = ((this.backgroundPaddingTop + dp2) > (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) ? 1 : ((this.backgroundPaddingTop + dp2) == (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) ? 0 : -1));
        c60 c60Var = this.U0;
        e40 e40Var = this.a2;
        y30 y30Var = this.f38179f1;
        w30 w30Var = this.f38174e1;
        if (i11 < 0) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) - dp2) - this.backgroundPaddingTop) / (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f))));
            if (AndroidUtilities.isTablet()) {
                f10 = 17.0f;
            } else {
                f10 = 13.0f;
            }
            i10 = (int) (AndroidUtilities.dp(f10) * min);
            if (c60Var != null) {
                c60Var.setShadowOffset((int) (AndroidUtilities.dp(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.U1) > 1.0E-4f) {
                C1(Math.min(1.0f, min));
            }
            float f11 = 1.0f - ((0.1f * min) * 1.2f);
            w30Var.setScaleX(Math.max(0.9f, f11));
            w30Var.setScaleY(Math.max(0.9f, f11));
            float f12 = 1.0f - (min * 1.2f);
            w30Var.setAlpha((1.0f - e40Var.f29952c) * Math.max(0.0f, f12));
            y30Var.setScaleX(Math.max(0.9f, f11));
            y30Var.setScaleY(Math.max(0.9f, f11));
            y30Var.setAlpha((1.0f - e40Var.f29952c) * Math.max(0.0f, f12));
        } else {
            w30Var.setScaleX(1.0f);
            w30Var.setScaleY(1.0f);
            w30Var.setAlpha(1.0f - e40Var.f29952c);
            y30Var.setScaleX(1.0f);
            y30Var.setScaleY(1.0f);
            y30Var.setAlpha(1.0f - e40Var.f29952c);
            if (this.U1 > 1.0E-4f) {
                C1(0.0f);
            }
            i10 = 0;
        }
        Z0();
        float f13 = i10;
        this.f38262z1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(53.0f)) - f13));
        this.f38195j1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f13));
        if (c60Var != null) {
            c60Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), f7 - AndroidUtilities.dp(37.0f)));
        }
        v40 v40Var = this.R;
        if (v40Var != null) {
            v40Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f13));
        }
        this.containerView.invalidate();
        R1();
    }

    public final boolean G1(android.view.View r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n60.G1(android.view.View):boolean");
    }

    public final void H1(View view) {
        if (this.m0 == null) {
            org.telegram.ui.Components.v40 v40Var = new org.telegram.ui.Components.v40(8, getContext(), null, true);
            this.m0 = v40Var;
            v40Var.setAlpha(0.0f);
            this.m0.setVisibility(4);
            this.m0.setShowingDuration(3000L);
            this.containerView.addView(this.m0, w7.z5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
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
        ChatObject.Call call = this.f38157a1;
        org.telegram.ui.Components.voip.u2 u2Var = this.v;
        org.telegram.ui.Components.voip.u2 u2Var2 = this.h;
        org.telegram.ui.Components.voip.u2 u2Var3 = this.f38225r;
        org.telegram.ui.Components.voip.u2 u2Var4 = this.f38177f;
        org.telegram.ui.Components.voip.u2 u2Var5 = this.f38208n;
        org.telegram.ui.Components.voip.u2 u2Var6 = this.f38230s;
        org.telegram.ui.Components.voip.u2 u2Var7 = this.f38247w;
        boolean z19 = true;
        r30 r30Var = this.e;
        boolean z20 = false;
        if (call != null && !call.isScheduled()) {
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f38157a1.participants.f(MessageObject.getPeerId(this.A0));
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !R0()) {
                z14 = true;
            } else {
                z14 = false;
            }
            Boolean bool = this.f38256x3;
            if (bool != null) {
                z15 = bool.booleanValue();
            } else {
                TLRPC.GroupCall groupCall = this.f38157a1.call;
                if (groupCall != null && groupCall.messages_enabled) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            if (((!z14 && this.f38157a1.canRecordVideo()) || z13) && !s1()) {
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
            r30Var.c(u2Var7, true, z10);
            r30Var.c(u2Var6, true, z10);
            r30Var.c(u2Var5, z16, z10);
            r30Var.c(u2Var4, z18, z10);
            r30Var.c(u2Var3, z20, z10);
            r30Var.c(u2Var2, z17, z10);
            r30Var.c(u2Var, z15, z10);
            return;
        }
        if (this.V0 > 0.1f) {
            z11 = true;
        } else {
            z11 = false;
        }
        r30Var.c(u2Var7, z11, z10);
        if (this.V0 > 0.1f) {
            z12 = true;
        } else {
            z12 = false;
        }
        r30Var.c(u2Var6, z12, z10);
        if (this.V0 <= 0.1f) {
            z19 = false;
        }
        r30Var.c(u2Var3, z19, z10);
        r30Var.c(u2Var5, false, z10);
        r30Var.c(u2Var4, false, z10);
        r30Var.c(u2Var2, false, z10);
        r30Var.c(u2Var, false, z10);
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
        ChatObject.Call call2 = this.f38157a1;
        org.telegram.ui.ActionBar.u0 u0Var = this.f38199k1;
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f38205m1;
        if (call2 == null || call2.isScheduled()) {
            this.l1.setVisibility(4);
            u0Var2.setVisibility(8);
            if (this.f38157a1 == null) {
                u0Var.setVisibility(8);
                return;
            }
        }
        if (this.f38202l0) {
            return;
        }
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat4 = accountInstance.getMessagesController().getChat(Long.valueOf(j1()));
        if (chat4 != null) {
            this.Z0 = chat4;
        }
        boolean canUserDoAdminAction = ChatObject.canUserDoAdminAction(this.Z0, 3);
        org.telegram.ui.ActionBar.e1 e1Var = this.f38210n1;
        if (!canUserDoAdminAction && (((ChatObject.isChannel(this.Z0) && ((chat3 = this.Z0) == null || !chat3.megagroup)) || (!ChatObject.isPublic(this.Z0) && !ChatObject.canUserDoAdminAction(this.Z0, 3))) && (!ChatObject.isChannel(this.Z0) || (chat2 = this.Z0) == null || chat2.megagroup || !ChatObject.isPublic(chat2)))) {
            e1Var.setVisibility(8);
        } else {
            e1Var.setVisibility(0);
        }
        ChatObject.Call call3 = this.f38157a1;
        org.telegram.ui.ActionBar.e1 e1Var2 = this.f38259y1;
        org.telegram.ui.ActionBar.e1 e1Var3 = this.f38254x1;
        if (call3 != null && (groupCall2 = call3.call) != null && groupCall2.can_change_messages_enabled) {
            if (groupCall2.messages_enabled) {
                i13 = 8;
            } else {
                i13 = 0;
            }
            e1Var3.setVisibility(i13);
            if (this.f38157a1.call.messages_enabled) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            e1Var2.setVisibility(i14);
        } else {
            e1Var3.setVisibility(8);
            e1Var2.setVisibility(8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f38157a1.participants.f(MessageObject.getPeerId(this.A0));
        ChatObject.Call call4 = this.f38157a1;
        org.telegram.ui.ActionBar.e1 e1Var4 = this.f38222q1;
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
        org.telegram.ui.ActionBar.e1 e1Var5 = this.f38249w1;
        org.telegram.ui.ActionBar.e1 e1Var6 = this.f38214o1;
        boolean z12 = true;
        org.telegram.ui.ActionBar.e1 e1Var7 = this.f38232s1;
        org.telegram.ui.ActionBar.e1 e1Var8 = this.f38236t1;
        if (R0) {
            e1Var5.setVisibility(0);
            e1Var6.setVisibility(0);
            if (s1()) {
                e1Var7.setVisibility(0);
                e1Var8.setVisibility(8);
            } else if (this.f38157a1.isScheduled()) {
                e1Var7.setVisibility(8);
                e1Var8.setVisibility(8);
            } else {
                e1Var7.setVisibility(0);
            }
            if (p1()) {
                e1Var7.setVisibility(8);
                e1Var6.setVisibility(8);
            }
            if (this.f38157a1.canRecordVideo() && !this.f38157a1.isScheduled() && !s1()) {
                e1Var8.setVisibility(0);
            } else {
                e1Var8.setVisibility(8);
            }
            u0Var2.setVisibility(8);
            boolean z13 = this.f38157a1.recording;
            i60 i60Var = this.f38170d1;
            i60Var.f36735f = z13;
            i60Var.d = 1.0f;
            i60Var.invalidateSelf();
            if (this.f38157a1.recording) {
                if (this.D1 == null) {
                    z20 z20Var = new z20(this, 6);
                    this.D1 = z20Var;
                    AndroidUtilities.runOnUIThread(z20Var, 1000L);
                }
                e1Var7.setText(LocaleController.getString(R.string.VoipGroupStopRecordCall));
            } else {
                z20 z20Var2 = this.D1;
                if (z20Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(z20Var2);
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
            if (!z10 && ((this.f38157a1.canRecordVideo() || z11) && !this.f38157a1.isScheduled() && !s1())) {
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
        org.telegram.ui.ActionBar.e1 e1Var9 = this.f38227r1;
        if (R02 && this.f38157a1.call.can_change_join_muted && !p1()) {
            e1Var9.setVisibility(0);
        } else {
            e1Var9.setVisibility(8);
        }
        if (p1() && ((call = this.f38157a1) == null || (groupCall = call.call) == null || !groupCall.creator)) {
            z12 = false;
        }
        u0Var.I(4, z12);
        if (s1() && !this.f38157a1.isScheduled()) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        this.f38218p1.setVisibility(i12);
        int visibility = e1Var6.getVisibility();
        TextView textView = this.A1;
        if (visibility != 0 && e1Var9.getVisibility() != 0 && e1Var.getVisibility() != 0 && e1Var8.getVisibility() != 0 && e1Var7.getVisibility() != 0 && e1Var5.getVisibility() != 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.f38198k0;
        if (((sharedInstance != null && VoIPService.getSharedInstance().hasFewPeers) || this.f38161b1) && !s1() && this.A0 != null) {
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
        LinearLayout linearLayout = this.f38195j1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f7 = 96;
        if (layoutParams.rightMargin != AndroidUtilities.dp(f7)) {
            layoutParams.rightMargin = AndroidUtilities.dp(f7);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.f38262z1.getLayoutParams()).rightMargin = 0;
        this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
    }

    public final void K1(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n60.K1(int, boolean):void");
    }

    public final void L1() {
        if (this.f38157a1 == null) {
            return;
        }
        int currentTime = this.d.getConnectionsManager().getCurrentTime();
        ChatObject.Call call = this.f38157a1;
        int i10 = currentTime - call.call.record_start_date;
        boolean z10 = call.recording;
        org.telegram.ui.ActionBar.e1 e1Var = this.f38232s1;
        if (z10) {
            e1Var.setSubtext(AndroidUtilities.formatDuration(i10, false));
        } else {
            e1Var.setSubtext(null);
        }
    }

    public final void M1(boolean z10) {
        float interpolation;
        float f7;
        v40 v40Var = this.R;
        if ((v40Var == null || this.f38157a1 != null) && this.X0 == null) {
            this.W0 = 1.0f;
            this.V0 = 1.0f;
            if (v40Var == null) {
                return;
            }
        }
        int i10 = 4;
        if (!z10) {
            v30 v30Var = this.f38250w2;
            AndroidUtilities.cancelRunOnUIThread(v30Var);
            v30Var.run();
            ChatObject.Call call = this.f38157a1;
            t50 t50Var = this.Q;
            if (call != null && !call.isScheduled()) {
                t50Var.setVisibility(0);
            } else {
                t50Var.setVisibility(4);
            }
            boolean isChannelOrGiga = ChatObject.isChannelOrGiga(this.Z0);
            org.telegram.ui.ActionBar.e1 e1Var = this.f38249w1;
            if (isChannelOrGiga) {
                e1Var.setText(LocaleController.getString(R.string.VoipChannelCancelChat));
            } else {
                e1Var.setText(LocaleController.getString(R.string.VoipGroupCancelChat));
            }
        }
        float f10 = this.V0;
        if (f10 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.es.f24465f.getInterpolation((f10 - 0.6f) / 0.4f) * 0.05f);
            this.W0 = 1.0f;
            f7 = 1.0f;
        } else {
            org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f24465f;
            this.W0 = esVar.getInterpolation(f10 / 0.6f);
            interpolation = 1.05f * esVar.getInterpolation(this.V0 / 0.6f);
            f7 = this.V0 / 0.6f;
        }
        I1(true);
        float f11 = 1.0f - f7;
        v40Var.setAlpha(f11);
        this.U.setAlpha(f7);
        this.W.setAlpha(f7);
        s50 s50Var = this.V;
        s50Var.setAlpha(f7);
        s50Var.setScaleX(interpolation);
        s50Var.setScaleY(interpolation);
        t40 t40Var = this.T;
        t40Var.setScaleX(f11);
        t40Var.setScaleY(f11);
        t40Var.setAlpha(f11);
        this.S.setAlpha(f11);
        this.f38199k1.setAlpha(f7);
        if (f11 != 0.0f) {
            i10 = 0;
        }
        if (i10 != v40Var.getVisibility()) {
            v40Var.setVisibility(i10);
            t40Var.setVisibility(i10);
        }
    }

    public final void N1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        org.telegram.ui.Components.voip.u2 u2Var = this.f38225r;
        if (u2Var != null && u2Var.getVisibility() == 0) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            r30 r30Var = this.e;
            boolean z14 = false;
            if (sharedInstance != null && !s1()) {
                lh.a aVar = (lh.a) r30Var.f14740c.get(u2Var);
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
                i1();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.isBluetoothHeadsetConnected()) {
                    i10 = R.drawable.filled_calls_bluetooth_s;
                } else {
                    i10 = R.drawable.filled_sound_on;
                }
                if (this.f38156a0 != i10) {
                    this.f38156a0 = i10;
                    AndroidUtilities.updateImageViewImageAnimated(this.f38160b0, i10);
                }
                org.telegram.ui.Components.voip.u2 u2Var2 = this.h;
                if (u2Var2.getVisibility() == 0) {
                    u2Var2.c(0, -1, 0, 1.0f, true, g1(i1()), false, z10);
                    if (i1() != 1) {
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
            lh.a aVar2 = (lh.a) r30Var.f14740c.get(u2Var);
            if (aVar2 != null) {
                aVar2.d.a(z11, z10);
                u2Var.setEnabled(z11);
            }
            u2Var.b(true, false);
        }
    }

    public final void O1(boolean r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n60.O1(boolean, boolean):void");
    }

    public final void P0(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n60.P0(boolean):void");
    }

    public final void P1() {
        boolean z10;
        String str;
        float f7;
        float f10;
        l60 l60Var;
        TLRPC.User user;
        TLRPC.Chat chat;
        j50 j50Var = this.O;
        if (j50Var != null && this.f38157a1 != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            int i10 = 0;
            for (int i11 = 0; i11 < this.f38157a1.currentSpeakingPeers.m(); i11++) {
                long j10 = this.f38157a1.currentSpeakingPeers.j(i11);
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f38157a1.currentSpeakingPeers.f(j10);
                if (!groupCallParticipant.self) {
                    e40 e40Var = this.a2;
                    e40Var.getClass();
                    if (e40Var.f29976w.get(MessageObject.getPeerId(groupCallParticipant.peer)) <= 0 && this.B2.get(j10, 0) != 1) {
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
                                    spannableStringBuilder.append(UserObject.getFirstName(user), new org.telegram.ui.Components.j61(AndroidUtilities.bold()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.j61(AndroidUtilities.bold()), 0);
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
                j50Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.h5 subtitleTextView = j50Var.getSubtitleTextView();
            if (s1()) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            int i13 = this.f38157a1.call.participants_count;
            h60 h60Var = this.P;
            subtitleTextView.k(LocaleController.formatPluralString(str, i13 + ((h60Var.M.s1() || h60Var.L || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined()), new Object[0]));
            if (s1() && (l60Var = this.B1) != null) {
                l60Var.setWatchersCount(this.f38157a1.call.participants_count);
            }
            if (z10 != this.f38241u2) {
                this.f38241u2 = z10;
                j50Var.invalidate();
                float f11 = 0.0f;
                j50Var.getSubtitleTextView().setPivotX(0.0f);
                j50Var.getSubtitleTextView().setPivotY(j50Var.getMeasuredHeight() >> 1);
                ViewPropertyAnimator animate = j50Var.getSubtitleTextView().animate();
                if (this.f38241u2) {
                    f7 = 0.98f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f7);
                if (this.f38241u2) {
                    f10 = 0.9f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f10);
                if (!this.f38241u2) {
                    f11 = 1.0f;
                }
                scaleY.alpha(f11).setDuration(150L);
                AndroidUtilities.updateViewVisibilityAnimated(j50Var.getAdditionalSubtitleTextView(), this.f38241u2);
            }
        }
    }

    public final int Q0() {
        t50 t50Var = this.Q;
        int childCount = t50Var.getChildCount();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = t50Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0) {
                i10 = Math.min(i10, childAt.getTop());
            }
        }
        return i10;
    }

    public final void Q1(boolean z10) {
        ChatObject.Call call = this.f38157a1;
        w30 w30Var = this.f38174e1;
        if (call == null) {
            if (ChatObject.isChannelOrGiga(this.Z0)) {
                w30Var.b(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), z10);
                return;
            } else {
                w30Var.b(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), z10);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(call.call.title);
        j50 j50Var = this.O;
        if (!isEmpty) {
            if (!this.f38157a1.call.title.equals(j50Var.getTitle())) {
                if (z10) {
                    this.O.J(this.f38157a1.call.title, true, 180L, null);
                    j50Var.getTitleTextView().setOnClickListener(new x20(this, 8));
                } else {
                    j50Var.setTitle(this.f38157a1.call.title);
                }
                w30Var.b(this.f38157a1.call.title, z10);
            }
        } else {
            TLRPC.Chat chat = this.Z0;
            if (chat != null && !chat.title.equals(j50Var.getTitle())) {
                if (z10) {
                    this.O.J(this.Z0.title, true, 180L, null);
                    j50Var.getTitleTextView().setOnClickListener(new x20(this, 9));
                } else {
                    j50Var.setTitle(this.Z0.title);
                }
                if (ChatObject.isChannelOrGiga(this.Z0)) {
                    if (s1()) {
                        w30Var.b(this.Z0.title, z10);
                    } else {
                        w30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), z10);
                    }
                } else {
                    w30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), z10);
                }
            } else if (this.Z0 == null) {
                j50Var.setTitle(LocaleController.getString(R.string.ConferenceChat));
                w30Var.b(LocaleController.getString(R.string.ConferenceChat), z10);
            }
        }
        org.telegram.ui.ActionBar.h5 titleTextView = j50Var.getTitleTextView();
        if (this.f38157a1.recording) {
            if (titleTextView.getRightDrawable() == null) {
                titleTextView.i(new j60(titleTextView));
                TextView textView = w30Var.getTextView();
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new j60(textView), (Drawable) null);
                TextView nextTextView = w30Var.getNextTextView();
                nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new j60(nextTextView), (Drawable) null);
            }
        } else if (titleTextView.getRightDrawable() != null) {
            titleTextView.i(null);
            w30Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            w30Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final boolean R0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            ChatObject.Call call = this.f38157a1;
            if (call != null && (groupCall = call.call) != null && groupCall.creator) {
                return true;
            }
            return false;
        }
        return ChatObject.canManageCalls(this.Z0);
    }

    public final void R1() {
        float f7;
        org.telegram.ui.Components.wb wbVar;
        boolean z10;
        if (this.topBulletinContainer != null) {
            int dp = AndroidUtilities.dp(74.0f);
            float f10 = this.f38258y0 - dp;
            if (this.backgroundPaddingTop + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                int dp2 = (dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f);
                f7 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - this.backgroundPaddingTop) / dp2);
                f10 -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp2) * f7);
            } else {
                f7 = 0.0f;
            }
            float paddingTop = f10 + this.containerView.getPaddingTop();
            FrameLayout frameLayout = this.topBulletinContainer;
            j50 j50Var = this.O;
            frameLayout.setTranslationY(AndroidUtilities.lerp(((-frameLayout.getTop()) - this.topBulletinContainer.getHeight()) + paddingTop + AndroidUtilities.dp(10.0f), j50Var.getY() + (-this.topBulletinContainer.getTop()) + j50Var.getHeight(), f7));
            org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.f28798w;
            if (scVar != null && (wbVar = scVar.e) != null && wbVar.getParent() != null && wbVar.getParent().getParent() == this.topBulletinContainer) {
                if (f7 > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                wbVar.setTop(z10);
            }
        }
    }

    public final void S0() {
        if (this.R1) {
            this.R1 = false;
            AndroidUtilities.cancelRunOnUIThread(this.f38260y2);
        }
        if (this.S1) {
            this.S1 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.f38247w.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void T0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n60.T0():void");
    }

    public final void U0() {
        this.F.setTranslationY((-this.C1.d()) + this.containerView.getPaddingBottom());
        this.G.invalidate();
        a1();
        Z0();
        X0();
        Y0();
        b1();
        this.e.setAlpha(1.0f - this.f38264z3.e);
        V0();
        W0();
    }

    public final void V0() {
        int i10;
        float f7 = this.C1.f43381b.f16027a;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        p40 p40Var = this.F;
        p40Var.setAlpha(f7);
        o40 o40Var = this.G;
        o40Var.setAlpha(f7);
        if (p40Var.getVisibility() != i10) {
            p40Var.setVisibility(i10);
            o40Var.setVisibility(i10);
            if (i10 == 8) {
                m40 m40Var = this.H;
                if (m40Var.isFocused()) {
                    m40Var.clearFocus();
                }
            }
        }
    }

    public final void W0() {
        int i10;
        org.telegram.ui.Components.gl0 gl0Var = this.K;
        if (gl0Var != null) {
            float f7 = this.C1.f43381b.f16027a * this.A3.e;
            gl0Var.setAlpha(f7);
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
            org.telegram.ui.Components.gl0 gl0Var2 = this.K;
            if (!gl0Var2.N0 && f7 == 1.0f) {
                gl0Var2.N0 = true;
            }
        }
    }

    public final void X0() {
        boolean z10 = G3;
        r30 r30Var = this.e;
        if (z10) {
            r30Var.setTranslationX(0.0f);
            r30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        ne.b bVar = this.f38264z3;
        if (z11) {
            r30Var.setTranslationX(bVar.e * AndroidUtilities.dp(94.0f));
            r30Var.setTranslationY(0.0f);
            return;
        }
        r30Var.setTranslationX(0.0f);
        r30Var.setTranslationY(bVar.e * AndroidUtilities.dp(94.0f));
    }

    public final void Y0() {
        boolean z10 = G3;
        a40 a40Var = this.f38206m2;
        if (z10) {
            a40Var.setTranslationX(0.0f);
            a40Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        ne.b bVar = this.f38264z3;
        if (z11) {
            a40Var.setTranslationX(bVar.e * AndroidUtilities.dp(94.0f));
            a40Var.setTranslationY(0.0f);
            return;
        }
        a40Var.setTranslationX(0.0f);
        a40Var.setTranslationY(bVar.e * AndroidUtilities.dp(94.0f));
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
            dp = ((this.f38264z3.e * AndroidUtilities.dp(94.0f)) - (AndroidUtilities.dp(104.0f) * this.a2.f29952c)) - AndroidUtilities.dp(91.0f);
        }
        float lerp = AndroidUtilities.lerp(dp, f10, iVar.f43381b.f16027a);
        float measuredHeight = ((this.containerView.getMeasuredHeight() - this.f38258y0) + lerp) - this.backgroundPaddingTop;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - AndroidUtilities.dp(250.0f));
        mh.h hVar = this.f38165c0;
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
            tVar.f30145a.setRoundCorners(AndroidUtilities.dp(8.0f));
            org.telegram.ui.Components.voip.t tVar2 = this.Z2;
            tVar2.h = false;
            tVar2.j(false);
            this.Z2.invalidate();
            this.a2.invalidate();
        }
        org.telegram.ui.Cells.e4 e4Var = this.X2;
        if (e4Var != null && !this.f38163b3 && e4Var.getParent() != null) {
            this.containerView.removeView(this.X2);
        }
        org.telegram.ui.Cells.e4 e4Var2 = this.X2;
        if (e4Var2 != null) {
            e4Var2.setProgressToAvatarPreview(0.0f);
            this.X2.setAboutVisible(false);
            this.X2.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.e30 e30Var = this.f38158a3;
        if (e30Var != null) {
            e30Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.X2 = null;
        this.Y2 = null;
        this.f38158a3 = null;
        this.Z2 = null;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return !this.a2.f29950b;
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
        t50 t50Var = this.Q;
        int i19 = 0;
        if (i10 == i18) {
            Long l4 = (Long) objArr[1];
            ChatObject.Call call = this.f38157a1;
            if (call != null && call.call.f18926id == l4.longValue()) {
                ChatObject.Call call2 = this.f38157a1;
                if (call2.call instanceof TLRPC.TL_groupCallDiscarded) {
                    dismiss();
                    return;
                }
                int i20 = (this.f38235t0 > 0L ? 1 : (this.f38235t0 == 0L ? 0 : -1));
                AccountInstance accountInstance = this.d;
                if (i20 == 0 && (((i17 = this.F1) == 7 || i17 == 5 || i17 == 6) && !call2.isScheduled())) {
                    try {
                        Intent intent = new Intent(this.f38190i0, VoIPService.class);
                        intent.putExtra("chat_id", j1());
                        intent.putExtra("createGroupCall", false);
                        intent.putExtra("hasFewPeers", this.f38161b1);
                        intent.putExtra("peerChannelId", this.Y0.channel_id);
                        intent.putExtra("peerChatId", this.Y0.chat_id);
                        intent.putExtra("peerUserId", this.Y0.user_id);
                        intent.putExtra("hash", this.f38166c1);
                        intent.putExtra("peerAccessHash", this.Y0.access_hash);
                        intent.putExtra("is_outgoing", true);
                        intent.putExtra("start_incall_activity", false);
                        intent.putExtra("account", accountInstance.getCurrentAccount());
                        intent.putExtra("scheduleDate", this.f38200k2);
                        this.f38190i0.startService(intent);
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                    }
                    this.f38235t0 = SystemClock.elapsedRealtime();
                    AndroidUtilities.runOnUIThread(new z20(this, 2), 3000L);
                }
                if (!this.f38239u0 && VoIPService.getSharedInstance() != null) {
                    this.f38157a1.addSelfDummyParticipant(false);
                    m1();
                    VoIPService.getSharedInstance().playConnectedSound();
                }
                J1();
                int childCount = t50Var.getChildCount();
                for (int i21 = 0; i21 < childCount; i21++) {
                    View childAt = t50Var.getChildAt(i21);
                    if (childAt instanceof org.telegram.ui.Cells.e4) {
                        ((org.telegram.ui.Cells.e4) childAt).a(true, false);
                    }
                }
                if (this.X2 != null) {
                    this.f38231s0 = true;
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
                                        if (dialog.f18920id == longValue) {
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
                                    if (this.f38157a1.call.participants_count < 250 || UserObject.isContact(user) || user.verified || i19 != 0) {
                                        l1().k(0L, 44, user, this.Z0, null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(-longValue));
                            if (chat != null) {
                                if (this.f38157a1.call.participants_count < 250 || !ChatObject.isNotInChat(chat) || chat.verified || i19 != 0) {
                                    l1().k(0L, 44, chat, this.Z0, null, null);
                                }
                            }
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.groupCallSpeakingUsersUpdated) {
            e40 e40Var = this.a2;
            if (e40Var.f29950b && this.f38157a1 != null) {
                boolean c10 = e40Var.c();
                ChatObject.Call call3 = this.f38157a1;
                if (call3 != null && e40Var.f29950b && (videoParticipant = e40Var.e) != null && call3.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer)) == null) {
                    c10 = true;
                }
                if (c10) {
                    ChatObject.VideoParticipant videoParticipant2 = null;
                    int i23 = 0;
                    while (true) {
                        ArrayList arrayList = this.f38221q0;
                        if (i23 >= arrayList.size()) {
                            break;
                        }
                        ChatObject.VideoParticipant videoParticipant3 = (ChatObject.VideoParticipant) arrayList.get(i23);
                        if (this.f38157a1.currentSpeakingPeers.g(null, MessageObject.getPeerId(videoParticipant3.participant.peer)) != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = videoParticipant3.participant;
                            if (!groupCallParticipant3.muted_by_you && e40Var.d != MessageObject.getPeerId(groupCallParticipant3.peer)) {
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
            e40Var.setVisibleParticipant(true);
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
                AlertDialog$Builder M = org.telegram.ui.Components.g5.M(getContext(), LocaleController.getString(R.string.VoipGroupVoiceChat), string);
                M.j(new d30(this, 1));
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
            if (chatFull.f18917id == j1()) {
                J1();
                O1(isShowing(), false);
            }
            long peerId = MessageObject.getPeerId(this.A0);
            ChatObject.Call call4 = this.f38157a1;
            if (call4 != null && chatFull.f18917id == (-peerId) && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) call4.participants.f(peerId)) != null) {
                groupCallParticipant2.about = chatFull.about;
                P0(true);
                AndroidUtilities.updateVisibleRows(t50Var);
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
            int childCount2 = t50Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i19 < childCount2) {
                s4.b1 G = t50Var.G(t50Var.getChildAt(i19));
                if (G != null) {
                    View view = G.f44838a;
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
                        if (e4Var.getParticipant() != null) {
                            e4Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i19++;
            }
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            Long l11 = (Long) objArr[0];
            long peerId2 = MessageObject.getPeerId(this.A0);
            if (this.f38157a1 != null && peerId2 == l11.longValue() && (groupCallParticipant = (TLRPC.GroupCallParticipant) this.f38157a1.participants.f(peerId2)) != null) {
                groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
                P0(true);
                AndroidUtilities.updateVisibleRows(t50Var);
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
            AndroidUtilities.updateVisibleRows(t50Var);
        } else if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0) {
                P0(true);
            }
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (intValue & MessagesController.UPDATE_MASK_EMOJI_STATUS) != 0) {
                AndroidUtilities.updateVisibleRows(t50Var);
            }
        } else if (i10 == NotificationCenter.groupCallScreencastStateChanged) {
            y40 y40Var = this.f38261z0;
            if (y40Var != null) {
                y40Var.b(true, true);
            }
            J1();
        } else if (i10 == NotificationCenter.conferenceEmojiUpdated) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            y50 y50Var = this.f38217p0;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            y50Var.b(strArr);
        }
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity = this.f38190i0;
        launchActivity.f31806a1.remove(this.f38245v2);
        this.f38190i0.setRequestedOrientation(-1);
        E3 = false;
        org.telegram.ui.Components.e40 e40Var = this.E1;
        if (e40Var != null) {
            e40Var.dismiss();
        }
        this.f38231s0 = true;
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
        e40 e40Var = this.a2;
        if (e40Var != null) {
            if (this.f38223q2 != null) {
                this.Q.getViewTreeObserver().removeOnPreDrawListener(this.f38223q2);
                this.f38223q2 = null;
            }
            ArrayList arrayList = this.Z1;
            arrayList.clear();
            ArrayList arrayList2 = this.Y1;
            arrayList.addAll(arrayList2);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).f();
                e40Var.removeView((View) arrayList.get(i10));
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).e();
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).b(true);
            }
            arrayList2.clear();
            if (e40Var.getParent() != null) {
                arrayList2.clear();
                this.containerView.removeView(e40Var);
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
        org.telegram.ui.Components.m30.j(getContext());
        ChatObject.Call call = this.f38157a1;
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
        if (this.f38190i0 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.f38190i0.getSystemService("audio");
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
        if (!this.f38168c3 && this.f38180f2) {
            if (z10) {
                this.f38168c3 = true;
                z1(false, this.X2);
                return;
            }
            c1();
            this.containerView.removeView(this.f38175e2);
            this.f38175e2 = null;
            this.C2.setVisibility(8);
            this.containerView.invalidate();
            this.f38180f2 = false;
            this.Y.X = true;
            this.Q.invalidate();
            this.f38162b2.setVisibility(8);
            if (this.f38231s0) {
                this.f38231s0 = false;
                P0(true);
            }
            T0();
        }
    }

    public final void f1(ChatObject.VideoParticipant videoParticipant) {
        ChatObject.VideoParticipant videoParticipant2;
        if (videoParticipant == null) {
            this.f38190i0.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            e40 e40Var = this.a2;
            if (e40Var.f29969r != null) {
                return;
            }
            boolean z10 = G3;
            t50 t50Var = this.Q;
            int i10 = 0;
            if (z10) {
                if (this.f38223q2 != null) {
                    t50Var.getViewTreeObserver().removeOnPreDrawListener(this.f38223q2);
                    this.f38223q2 = null;
                }
                ArrayList arrayList = new ArrayList();
                s60 s60Var = this.f38215o2;
                ArrayList arrayList2 = this.Y1;
                ArrayList arrayList3 = this.Z1;
                if (videoParticipant == null) {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList3.get(i11);
                        org.telegram.ui.Components.voip.l lVar = tVar.f30149c;
                        if (lVar != null) {
                            lVar.setRenderer(null);
                            org.telegram.ui.Components.e30 e30Var = tVar.d;
                            if (e30Var != null) {
                                e30Var.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.l lVar2 = tVar.e;
                            if (lVar2 != null) {
                                lVar2.setRenderer(null);
                            }
                            arrayList.add(tVar.f30173w);
                            tVar.b(false);
                            tVar.animate().alpha(0.0f).setListener(new z40(this, tVar));
                        }
                    }
                    this.P2 = false;
                    s60Var.H(this.f38211n2, true, true);
                } else {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) arrayList3.get(i12);
                        if (tVar2.e != null && ((videoParticipant2 = tVar2.f30173w) == null || !videoParticipant2.equals(videoParticipant))) {
                            arrayList.add(tVar2.f30173w);
                            tVar2.b(false);
                            org.telegram.ui.Components.e30 e30Var2 = tVar2.d;
                            if (e30Var2 != null) {
                                e30Var2.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.l lVar3 = tVar2.f30149c;
                            if (lVar3 != null) {
                                lVar3.setRenderer(null);
                            }
                            tVar2.animate().alpha(0.0f).setListener(new a50(this, tVar2));
                        }
                    }
                    this.P2 = true;
                    s60Var.f39701r = false;
                    if (!arrayList.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new d20(2, this, arrayList));
                    }
                }
                ViewTreeObserver viewTreeObserver = t50Var.getViewTreeObserver();
                c50 c50Var = new c50(this, videoParticipant, !e40Var.f29950b);
                this.f38223q2 = c50Var;
                viewTreeObserver.addOnPreDrawListener(c50Var);
                return;
            }
            if (this.f38223q2 != null) {
                t50Var.getViewTreeObserver().removeOnPreDrawListener(this.f38223q2);
                this.f38223q2 = null;
            }
            if (videoParticipant != null) {
                a40 a40Var = this.f38206m2;
                if (a40Var.getVisibility() != 0) {
                    a40Var.setVisibility(0);
                    org.telegram.ui.Components.f30 f30Var = this.f38219p2;
                    f30Var.G(a40Var, false);
                    this.f38231s0 = true;
                    if (!e40Var.f29950b) {
                        ArrayList arrayList4 = f30Var.e;
                        s4.b0 b0Var = (s4.b0) a40Var.getLayoutManager();
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
                    ViewTreeObserver viewTreeObserver2 = t50Var.getViewTreeObserver();
                    d50 d50Var = new d50(this, videoParticipant);
                    this.f38223q2 = d50Var;
                    viewTreeObserver2.addOnPreDrawListener(d50Var);
                    return;
                }
                e40Var.j(videoParticipant);
                AndroidUtilities.updateVisibleRows(a40Var);
            } else if (t50Var.getVisibility() != 0) {
                t50Var.setVisibility(0);
                P0(false);
                this.f38231s0 = true;
                ViewTreeObserver viewTreeObserver3 = t50Var.getViewTreeObserver();
                e50 e50Var = new e50(this);
                this.f38223q2 = e50Var;
                viewTreeObserver3.addOnPreDrawListener(e50Var);
            } else {
                ViewTreeObserver viewTreeObserver4 = t50Var.getViewTreeObserver();
                f50 f50Var = new f50(this);
                this.f38223q2 = f50Var;
                viewTreeObserver4.addOnPreDrawListener(f50Var);
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
        return chat.f18916id;
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
                accountInstance.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new di.u1(this, chatFull, z10, 5));
                return;
            }
            v1(null, str, true, z10);
        } else if (this.f38157a1 != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = this.f38157a1.getInputGroupCall();
                if (i10 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                exportgroupcallinvite.can_self_unmute = z11;
                accountInstance.getConnectionsManager().sendRequest(exportgroupcallinvite, new org.telegram.messenger.voip.n0(this, i10, z10, 1));
            }
        }
    }

    public final UndoView l1() {
        if (!G3) {
            e40 e40Var = this.a2;
            if (e40Var.f29950b) {
                return e40Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.f38194j0;
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
        if (!this.f38239u0 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            this.f38239u0 = true;
            this.D0.addAll(this.f38157a1.visibleParticipants);
            this.E0.addAll(this.f38221q0);
            this.F0.addAll(this.f38157a1.invitedUsers);
            this.G0.addAll(this.f38157a1.shadyJoinParticipants);
            this.H0.addAll(this.f38157a1.shadyLeftParticipants);
            this.T1 = sharedInstance.getCallState();
            if (this.f38157a1 == null) {
                ChatObject.Call call = sharedInstance.groupCall;
                this.f38157a1 = call;
                this.f38219p2.f24567c = call;
                this.a2.setGroupCall(call);
                this.f38215o2.f39698c = this.f38157a1;
            }
            mh.h hVar = this.f38165c0;
            if (hVar != null) {
                hVar.C0(this.d.getCurrentAccount(), this.f38157a1.getInputGroupCall(false));
            }
            this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
            this.f38157a1.saveActiveDates();
            VoIPService.getSharedInstance().registerStateListener(this);
            s50 s50Var = this.V;
            if (s50Var != null && s50Var.getVisibility() == 0) {
                this.f38230s.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, true);
                N1(true);
                if (ChatObject.isChannelOrGiga(this.Z0)) {
                    i10 = R.string.VoipChannelEndChat;
                } else {
                    i10 = R.string.VoipGroupEndChat;
                }
                this.f38249w1.setText(LocaleController.getString(i10));
                t50 t50Var = this.Q;
                t50Var.setVisibility(0);
                org.telegram.ui.ActionBar.u0 u0Var = this.l1;
                u0Var.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(t50Var, property, 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(t50Var, View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(s50Var, property2, 0.0f);
                Property property3 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(s50Var, property3, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(s50Var, property, 0.0f);
                org.telegram.ui.ActionBar.h5 h5Var = this.U;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(h5Var, property2, 0.0f);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(h5Var, property3, 0.0f);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(h5Var, property, 0.0f);
                org.telegram.ui.ActionBar.h5 h5Var2 = this.W;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(h5Var2, property2, 0.0f), ObjectAnimator.ofFloat(h5Var2, property3, 0.0f), ObjectAnimator.ofFloat(h5Var2, property, 0.0f), ObjectAnimator.ofFloat(u0Var, property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(u0Var, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(u0Var, property, 0.0f, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.es.f24466g);
                animatorSet.addListener(new g50(this, 0));
                animatorSet.setDuration(300L);
                animatorSet.start();
            }
        }
    }

    public final void n1(final long j10, final boolean z10) {
        if (this.f38157a1 != null) {
            AccountInstance accountInstance = this.d;
            final TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                final org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(getContext(), 3, null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                invitetogroupcall.call = this.f38157a1.getInputGroupCall();
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = user.f19063id;
                tL_inputUser.access_hash = user.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = accountInstance.getConnectionsManager().sendRequest(invitetogroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        n60 n60Var = n60.this;
                        long j11 = j10;
                        org.telegram.ui.ActionBar.a2[] a2VarArr2 = a2VarArr;
                        if (tLObject != null) {
                            n60Var.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                            AndroidUtilities.runOnUIThread(new bi.b8(n60Var, j11, a2VarArr2, user, 12));
                            return;
                        }
                        AndroidUtilities.runOnUIThread(new bi.x2(n60Var, a2VarArr2, z10, tL_error, j11, invitetogroupcall));
                    }
                });
                if (sendRequest != 0) {
                    AndroidUtilities.runOnUIThread(new gm(this, a2VarArr, sendRequest, 29), 500L);
                }
            }
        }
    }

    public final boolean o1() {
        float f7;
        int dp = AndroidUtilities.dp(74.0f);
        float f10 = this.f38258y0 - dp;
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
        t50 t50Var = this.Q;
        if (t50Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(t50Var);
        }
        a40 a40Var = this.f38206m2;
        if (a40Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(a40Var);
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
        y40 y40Var = this.f38261z0;
        if (y40Var != null) {
            y40Var.b(false, false);
        } else if (this.f38180f2) {
            e1(true);
        } else if (this.a2.f29950b) {
            f1(null);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.w0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        arrayList.addAll(this.Y1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
        }
        y40 y40Var = this.f38261z0;
        if (y40Var != null && VoIPService.getSharedInstance() != null) {
            y40Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.f38190i0;
        launchActivity.f31806a1.add(this.f38245v2);
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        E3 = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        org.telegram.ui.Components.m30.j(getContext());
        return super.onCustomOpenAnimation();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.w0.d(this, i10, i11);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.w0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.w0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        this.T1 = i10;
        O1(isShowing(), false);
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.w0.h(this, z10);
    }

    @Override
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 2) {
            Z0();
            X0();
            Y0();
            float f11 = 1.0f - this.f38264z3.e;
            r30 r30Var = this.e;
            r30Var.setAlpha(f11);
            this.a2.setProgressToHideUi(f7);
            this.f38206m2.invalidate();
            this.containerView.invalidate();
            r30Var.invalidate();
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

    public final boolean p1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            return true;
        }
        return false;
    }

    public final boolean r1() {
        if (!s1() || this.f38157a1.visibleVideoParticipants.isEmpty() || (this.f38157a1.visibleVideoParticipants.get(0).aspectRatio != 0.0f && this.f38157a1.visibleVideoParticipants.get(0).aspectRatio < 1.0f)) {
            return false;
        }
        return true;
    }

    public final boolean s1() {
        ChatObject.Call call = this.f38157a1;
        if (call != null && call.call.rtmp_stream) {
            return true;
        }
        return false;
    }

    @Override
    public final void show() {
        super.show();
        if (org.telegram.ui.Components.voip.h1.f29878d0.V) {
            org.telegram.ui.Components.voip.h1.j();
        }
    }

    public final void t1(org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.a2 a2Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j10;
        if (!this.f38248w0) {
            org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f38190i0.O().getFragmentStack().get(this.f38190i0.O().getFragmentStack().size() - 1);
            if (m2Var instanceof fo) {
                boolean U9 = ((fo) m2Var).U9();
                this.f38248w0 = true;
                this.f38253x0 = true;
                bi.h4 h4Var = new bi.h4(e3Var, editTextBoldCursor, z10, a2Var, 19);
                if (U9) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(h4Var, j10);
                return;
            }
            this.f38248w0 = true;
            this.f38253x0 = true;
            if (e3Var != null) {
                e3Var.setFocusable(true);
            } else if (a2Var != null) {
                a2Var.k(true);
            }
            if (z10) {
                AndroidUtilities.runOnUIThread(new oh(2, editTextBoldCursor), 100L);
            }
        }
    }

    public final void v1(java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n60.v1(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final void w1() {
        ChatObject.Call call = this.f38157a1;
        if (call != null && call.call != null) {
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(getContext(), 3, null);
            a2Var.q(300L);
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = this.f38157a1.call;
            tL_inputGroupCall.f18933id = groupCall.f18926id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new fa(this, a2Var, exportgroupcallinvite, 12));
        }
    }

    public final void y1(org.telegram.tgnet.TLRPC.GroupCallParticipant r31, final long r32, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n60.y1(org.telegram.tgnet.TLRPC$GroupCallParticipant, long, int):void");
    }

    public final void z1(boolean r18, org.telegram.ui.Cells.e4 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n60.z1(boolean, org.telegram.ui.Cells.e4):void");
    }

    @Override
    public final void A(float f7, int i10) {
    }
}

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
public final class g60 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, me.d {
    public static g60 D3;
    public static boolean E3;
    public static boolean F3;
    public static boolean G3;
    public static volatile DispatchQueue H3 = new DispatchQueue("updateTextureLightningQueue");
    public static boolean I3;
    public TLRPC.Peer A0;
    public final TextView A1;
    public final v5 A2;
    public final me.b A3;
    public TLObject B0;
    public final e60 B1;
    public final LongSparseIntArray B2;
    public final me.e B3;
    public final Paint C0;
    public final ph.i C1;
    public final b40 C2;
    public final me.b C3;
    public final ArrayList D0;
    public s20 D1;
    public final z30 D2;
    public final Paint E;
    public final ArrayList E0;
    public org.telegram.ui.Components.j40 E1;
    public LinearLayout E2;
    public final j40 F;
    public final ArrayList F0;
    public int F1;
    public boolean F2;
    public final i40 G;
    public final ArrayList G0;
    public boolean G1;
    public final org.telegram.ui.Components.dk0 G2;
    public final g40 H;
    public final ArrayList H0;
    public boolean H1;
    public int H2;
    public final ImageView I;
    public int I0;
    public final Paint I1;
    public boolean I2;
    public final ImageView J;
    public final org.telegram.ui.Components.dk0 J0;
    public final Paint J1;
    public final View J2;
    public org.telegram.ui.Components.ll0 K;
    public final org.telegram.ui.Components.dk0 K0;
    public final f60[] K1;
    public final View K2;
    public final k50 L;
    public boolean L0;
    public float L1;
    public GradientDrawable L2;
    public final org.telegram.ui.Components.r6 M;
    public final org.telegram.ui.Components.da M0;
    public f60 M1;
    public final int[] M2;
    public final r30 N;
    public final org.telegram.ui.Components.da N0;
    public f60 N1;
    public final v30 N2;
    public final c50 O;
    public float O0;
    public long O1;
    public boolean O2;
    public final a60 P;
    public float P0;
    public float P1;
    public boolean P2;
    public final m50 Q;
    public float Q0;
    public float Q1;
    public RenderNode Q2;
    public final p40 R;
    public RadialGradient R0;
    public boolean R1;
    public float R2;
    public final TextView S;
    public final Matrix S0;
    public boolean S1;
    public boolean S2;
    public final n40 T;
    public final Paint T0;
    public int T1;
    public final String[] T2;
    public final org.telegram.ui.ActionBar.h5 U;
    public final v50 U0;
    public float U1;
    public ObjectAnimator U2;
    public final l50 V;
    public float V0;
    public int V1;
    public ObjectAnimator V2;
    public final org.telegram.ui.ActionBar.h5 W;
    public float W0;
    public boolean W1;
    public final v40 W2;
    public final u50 X;
    public ValueAnimator X0;
    public final int[] X1;
    public org.telegram.ui.Cells.e4 X2;
    public final org.telegram.ui.Components.f00 Y;
    public TLRPC.InputPeer Y0;
    public final ArrayList Y1;
    public org.telegram.ui.Components.voip.m Y2;
    public final ImageReceiver Z;
    public TLRPC.Chat Z0;
    public final ArrayList Z1;
    public org.telegram.ui.Components.voip.v Z2;
    public int f37902a0;
    public ChatObject.Call f37903a1;
    public final y30 a2;
    public org.telegram.ui.Components.j30 f37904a3;
    public final a40 f37905b;
    public final ImageView f37906b0;
    public final boolean f37907b1;
    public final d40 f37908b2;
    public boolean f37909b3;
    public final f30 f37910c;
    public final lh.h f37911c0;
    public final String f37912c1;
    public final q40 f37913c2;
    public boolean f37914c3;
    public final AccountInstance d;
    public final int f37915d0;
    public final b60 f37916d1;
    public float f37917d2;
    public int f37918d3;
    public final l30 f37919e;
    public final RadialProgressView f37920e0;
    public final q30 f37921e1;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f37922e2;
    public AnimatorSet f37923e3;
    public final org.telegram.ui.Components.voip.w2 f37924f;
    public final Drawable f37925f0;
    public final s30 f37926f1;
    public boolean f37927f2;
    public g50 f37928f3;
    public final View f37929g0;
    public final Paint f37930g1;
    public boolean f37931g2;
    public int f37932g3;
    public final org.telegram.ui.Components.voip.w2 h;
    public AnimatorSet f37933h0;
    public ValueAnimator f37934h1;
    public org.telegram.ui.Components.n50 f37935h2;
    public int f37936h3;
    public LaunchActivity f37937i0;
    public float f37938i1;
    public n50 f37939i2;
    public int f37940i3;
    public final UndoView[] f37941j0;
    public final LinearLayout f37942j1;
    public Boolean f37943j2;
    public int j3;
    public final org.telegram.ui.Cells.k f37944k0;
    public final org.telegram.ui.ActionBar.u0 f37945k1;
    public int f37946k2;
    public int f37947k3;
    public boolean f37948l0;
    public final org.telegram.ui.ActionBar.u0 l1;
    public boolean f37949l2;
    public int f37950l3;
    public org.telegram.ui.Components.a50 m0;
    public final org.telegram.ui.ActionBar.u0 f37951m1;
    public final u30 f37952m2;
    public int f37953m3;
    public final org.telegram.ui.Components.voip.w2 f37954n;
    public org.telegram.ui.Components.a50 f37955n0;
    public final org.telegram.ui.ActionBar.e1 f37956n1;
    public final org.telegram.ui.Components.rm0 f37957n2;
    public int f37958n3;
    public int f37959o0;
    public final org.telegram.ui.ActionBar.e1 f37960o1;
    public final l60 f37961o2;
    public int f37962o3;
    public r50 f37963p0;
    public final org.telegram.ui.ActionBar.e1 f37964p1;
    public final org.telegram.ui.Components.k30 f37965p2;
    public int f37966p3;
    public final ArrayList f37967q0;
    public final org.telegram.ui.ActionBar.e1 f37968q1;
    public ViewTreeObserver.OnPreDrawListener f37969q2;
    public int f37970q3;
    public final org.telegram.ui.Components.voip.w2 f37971r;
    public b50 f37972r0;
    public final org.telegram.ui.ActionBar.e1 f37973r1;
    public final org.telegram.ui.Components.voip.h f37974r2;
    public int f37975r3;
    public final org.telegram.ui.Components.voip.w2 f37976s;
    public boolean f37977s0;
    public final org.telegram.ui.ActionBar.e1 f37978s1;
    public boolean f37979s2;
    public int f37980s3;
    public long f37981t0;
    public final org.telegram.ui.ActionBar.e1 f37982t1;
    public final ArrayList f37983t2;
    public int f37984t3;
    public boolean f37985u0;
    public final org.telegram.ui.ActionBar.e1 f37986u1;
    public boolean f37987u2;
    public int f37988u3;
    public final org.telegram.ui.Components.voip.w2 v;
    public final RectF f37989v0;
    public final org.telegram.ui.ActionBar.e1 f37990v1;
    public final s20 f37991v2;
    public int f37992v3;
    public final org.telegram.ui.Components.voip.w2 f37993w;
    public boolean f37994w0;
    public final org.telegram.ui.ActionBar.e1 f37995w1;
    public final p30 f37996w2;
    public final h50 f37997w3;
    public final m30 f37998x;
    public boolean f37999x0;
    public final org.telegram.ui.ActionBar.e1 f38000x1;
    public final org.telegram.ui.Components.vh f38001x2;
    public Boolean f38002x3;
    public final ImageView f38003y;
    public float f38004y0;
    public final org.telegram.ui.ActionBar.e1 f38005y1;
    public final s20 f38006y2;
    public Integer y3;
    public s40 f38007z0;
    public final LinearLayout f38008z1;
    public boolean f38009z2;
    public final me.b f38010z3;

    public g60(final LaunchActivity launchActivity, AccountInstance accountInstance, ChatObject.Call call, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        super((Context) launchActivity, (org.telegram.ui.ActionBar.d6) null, true, true);
        String string;
        int i10;
        final LaunchActivity launchActivity2;
        g60 g60Var;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.E = new Paint(1);
        this.f37941j0 = new UndoView[2];
        this.f37967q0 = new ArrayList();
        this.f37989v0 = new RectF();
        this.C0 = new Paint(1);
        this.D0 = new ArrayList();
        this.E0 = new ArrayList();
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new ArrayList();
        this.C1 = new ph.i(new s20(this, 8));
        this.F1 = 0;
        this.G1 = false;
        this.I1 = new Paint(7);
        this.J1 = new Paint(7);
        this.K1 = new f60[8];
        this.L1 = 1.0f;
        this.W1 = true;
        this.X1 = new int[4];
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.f37974r2 = new org.telegram.ui.Components.voip.h();
        this.f37983t2 = new ArrayList();
        this.f37991v2 = new s20(this, 0);
        this.f37996w2 = new p30(this);
        this.f38001x2 = new org.telegram.ui.Components.vh(19);
        this.f38006y2 = new s20(this, 1);
        this.f38009z2 = false;
        this.A2 = new v5(this, 6);
        this.B2 = new LongSparseIntArray();
        this.M2 = new int[2];
        this.P2 = true;
        this.T2 = new String[2];
        this.f37918d3 = -1;
        this.f37997w3 = new h50(this);
        org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.f27500f;
        this.f38010z3 = new me.b(2, this, isVar, 350L);
        this.A3 = new me.b(3, this, isVar, 220L, true);
        this.B3 = new me.e(4, this, isVar, 350L);
        this.C3 = new me.b(5, this, isVar, 350L);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        setOpenNoDelay(true);
        this.d = accountInstance;
        this.f37903a1 = call;
        this.Y0 = inputPeer;
        this.Z0 = chat;
        this.f37912c1 = str;
        this.currentAccount = accountInstance.getCurrentAccount();
        this.f37907b1 = z10;
        this.resourcesProvider = new ai.a1();
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.f37915d0 = MessagesController.getInstance(this.currentAccount).config.groupCallMessageLengthLimit.get();
        this.fullWidth = true;
        G3 = false;
        F3 = false;
        I3 = false;
        setDelegate(new k40(this));
        this.drawDoubleNavigationBar = true;
        this.drawNavigationBar = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.W2 = new v40(this);
        setOnDismissListener(new x20(this, 0));
        setDimBehindAlpha(75);
        a60 a60Var = new a60(this, launchActivity);
        this.P = a60Var;
        org.telegram.ui.Components.hq hqVar = new org.telegram.ui.Components.hq(true);
        int i11 = org.telegram.ui.ActionBar.h6.f21071qg;
        hqVar.b(org.telegram.ui.ActionBar.h6.v0(i11));
        hqVar.d();
        c50 c50Var = new c50(this, launchActivity, hqVar);
        this.O = c50Var;
        c50Var.setSubtitle("");
        c50Var.getSubtitleTextView().setVisibility(0);
        c50Var.l();
        c50Var.getAdditionalSubtitleTextView().setPadding(AndroidUtilities.dp(24.0f), 0, 0, 0);
        AndroidUtilities.updateViewVisibilityAnimated(c50Var.getAdditionalSubtitleTextView(), this.f37987u2, 1.0f, false);
        c50Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.h6.v0(i11));
        int i12 = org.telegram.ui.ActionBar.h6.f20978lg;
        c50Var.setSubtitleColor(org.telegram.ui.ActionBar.h6.v0(i12));
        c50Var.setBackButtonImage(R.drawable.ic_ab_back);
        c50Var.setOccupyStatusBar(false);
        c50Var.setAllowOverlayTitle(false);
        int i13 = org.telegram.ui.ActionBar.h6.f20903hg;
        c50Var.D(org.telegram.ui.ActionBar.h6.v0(i13), false);
        c50Var.C(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f21227z8), false);
        c50Var.setTitleColor(org.telegram.ui.ActionBar.h6.v0(i13));
        c50Var.setSubtitleColor(org.telegram.ui.ActionBar.h6.v0(i12));
        c50Var.setActionBarMenuOnItemClick(new j50(this, launchActivity));
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
        VoIPService.audioLevelsCallback = new p20(this, 3);
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
        this.f37925f0 = launchActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        org.telegram.ui.Components.dk0 dk0Var = new org.telegram.ui.Components.dk0(R.raw.voip_filled, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        this.J0 = dk0Var;
        this.K0 = new org.telegram.ui.Components.dk0(R.raw.hand_2, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        k50 k50Var = new k50(this, launchActivity);
        this.L = k50Var;
        this.containerView = k50Var;
        k50Var.setClipToPadding(false);
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
            this.containerView.addView(h5Var, w7.x5.a(-2.0f, 21.0f, 0.0f, 21.0f, 311.0f, -2, 49));
            l50 l50Var = new l50(this, launchActivity);
            this.V = l50Var;
            l50Var.setGravity(17);
            l50Var.setTextColor(-1);
            l50Var.setTypeface(AndroidUtilities.bold());
            l50Var.setTextSize(60);
            this.containerView.addView(l50Var, w7.x5.a(-2.0f, 21.0f, 0.0f, 21.0f, 231.0f, -2, 49));
            org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(launchActivity);
            this.W = h5Var2;
            h5Var2.setGravity(17);
            h5Var2.setTextColor(-1);
            h5Var2.setTypeface(AndroidUtilities.bold());
            h5Var2.setTextSize(18);
            this.containerView.addView(h5Var2, w7.x5.a(-2.0f, 21.0f, 0.0f, 21.0f, 201.0f, -2, 49));
        }
        if (s1()) {
            v50 v50Var = new v50(this, launchActivity);
            this.U0 = v50Var;
            this.containerView.addView(v50Var, w7.x5.a(80.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 51));
        }
        m50 m50Var = new m50(this, launchActivity);
        this.Q = m50Var;
        m50Var.setClipToPadding(false);
        m50Var.setClipChildren(false);
        u50 u50Var = new u50(this);
        this.X = u50Var;
        u50Var.f47842o = isVar;
        u50Var.d = 350L;
        u50Var.f47874c = 350L;
        u50Var.f47875e = 350L;
        u50Var.S();
        m50Var.setItemAnimator(u50Var);
        m50Var.setOnScrollListener(new e30(this));
        m50Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.f00 f00Var = new org.telegram.ui.Components.f00(F3 ? 6 : 2, m50Var);
        this.Y = f00Var;
        m50Var.setLayoutManager(f00Var);
        f30 f30Var = new f30(this);
        this.f37910c = f30Var;
        f00Var.z1(f30Var);
        m50Var.i(new g30(this));
        f00Var.C1();
        this.containerView.addView(m50Var, w7.x5.a(-1.0f, 14.0f, 14.0f, 14.0f, 231.0f, -1, 51));
        m50Var.setAdapter(a60Var);
        m50Var.setTopBottomSelectorRadius(13);
        m50Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.eg));
        m50Var.setOnItemClickListener(new z6(this, launchActivity, call, 14));
        m50Var.setOnItemLongClickListener(new p20(this, 4));
        if (s1()) {
            e60 e60Var = new e60(this, getContext());
            this.B1 = e60Var;
            this.containerView.addView(e60Var, w7.x5.a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 49));
        }
        org.telegram.ui.Components.rm0 rm0Var = new org.telegram.ui.Components.rm0(launchActivity);
        this.f37957n2 = rm0Var;
        this.containerView.addView(rm0Var, w7.x5.a(-1.0f, 14.0f, 14.0f, 324.0f, 14.0f, -1, 51));
        l60 l60Var = new l60(call, this.currentAccount, this);
        this.f37961o2 = l60Var;
        rm0Var.setAdapter(l60Var);
        s4.s sVar = new s4.s(6, false);
        rm0Var.setLayoutManager(sVar);
        sVar.z1(new i30(this));
        rm0Var.setOnItemClickListener(new org.telegram.ui.Components.fm0(this) {
            public final g60 f41339b;

            {
                this.f41339b = this;
            }

            @Override
            public final void d(int i15, View view) {
                switch (r2) {
                    case 0:
                        g60 g60Var2 = this.f41339b;
                        g60Var2.getClass();
                        org.telegram.ui.Components.j30 j30Var = (org.telegram.ui.Components.j30) view;
                        if (j30Var.getVideoParticipant() == null) {
                            g60Var2.f1(new ChatObject.VideoParticipant(j30Var.getParticipant(), false, false));
                            return;
                        } else {
                            g60Var2.f1(j30Var.getVideoParticipant());
                            return;
                        }
                    default:
                        g60 g60Var3 = this.f41339b;
                        g60Var3.getClass();
                        org.telegram.ui.Components.voip.m mVar = (org.telegram.ui.Components.voip.m) view;
                        if (mVar.getParticipant() != null) {
                            g60Var3.f1(mVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        s4.j jVar = new s4.j();
        jVar.S();
        jVar.f47842o = isVar;
        jVar.d = 350L;
        jVar.f47874c = 350L;
        jVar.f47875e = 350L;
        rm0Var.setItemAnimator(new j30(this));
        rm0Var.setOnScrollListener(new k30(this));
        l60Var.H(rm0Var, false, false);
        rm0Var.setVisibility(8);
        l30 l30Var = new l30(this, launchActivity);
        this.f37919e = l30Var;
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Jg);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.S0 = new Matrix();
        this.R0 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.T0 = paint;
        paint.setShader(this.R0);
        org.telegram.ui.Components.da daVar = new org.telegram.ui.Components.da(9);
        this.M0 = daVar;
        org.telegram.ui.Components.da daVar2 = new org.telegram.ui.Components.da(12);
        this.N0 = daVar2;
        daVar.f25702a = AndroidUtilities.dp(62.0f) * 0.45454547f;
        daVar.f25703b = AndroidUtilities.dp(72.0f) * 0.45454547f;
        daVar.b();
        daVar2.f25702a = AndroidUtilities.dp(65.0f) * 0.45454547f;
        daVar2.f25703b = AndroidUtilities.dp(75.0f) * 0.45454547f;
        daVar2.b();
        int i15 = org.telegram.ui.ActionBar.h6.Ig;
        daVar.d.setColor(i0.a.k(org.telegram.ui.ActionBar.h6.v0(i15), 38));
        daVar2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.h6.v0(i15), 76));
        org.telegram.ui.Components.voip.w2 w2Var = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.f37971r = w2Var;
        w2Var.setCheckable(true);
        w2Var.setTextSize(12);
        l30Var.a(w2Var);
        w2Var.setOnClickListener(new q20(this, 7));
        org.telegram.ui.Components.voip.w2 w2Var2 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.f37954n = w2Var2;
        w2Var2.setCheckable(true);
        w2Var2.setTextSize(12);
        w2Var2.d(false, false);
        w2Var2.setCrossOffset(-AndroidUtilities.dpf2(3.5f));
        w2Var2.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), false, false);
        org.telegram.ui.Components.voip.w2 w2Var3 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.f37924f = w2Var3;
        w2Var3.setCheckable(true);
        w2Var3.setTextSize(12);
        w2Var3.d(false, false);
        org.telegram.ui.Components.gk0 gk0Var = new org.telegram.ui.Components.gk0(launchActivity);
        w2Var3.addView(gk0Var, w7.x5.a(32.0f, 0.0f, 10.0f, 0.0f, 0.0f, 32, 1));
        org.telegram.ui.Components.dk0 dk0Var2 = new org.telegram.ui.Components.dk0(R.raw.camera_flip, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.G2 = dk0Var2;
        gk0Var.setAnimation(dk0Var2);
        w2Var3.setOnClickListener(new q20(this, 10));
        l30Var.a(w2Var3);
        org.telegram.ui.Components.voip.w2 w2Var4 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.h = w2Var4;
        w2Var4.setCheckable(true);
        w2Var4.setTextSize(12);
        w2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.f37906b0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i16 = R.drawable.filled_sound_on;
        this.f37902a0 = i16;
        imageView.setImageResource(i16);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        w2Var4.addView(imageView, w7.x5.a(30.0f, 0.0f, 11.0f, 0.0f, 0.0f, 30, 1));
        w2Var4.setOnClickListener(new q20(this, 11));
        l30Var.a(w2Var4);
        l30Var.a(w2Var2);
        org.telegram.ui.Components.voip.w2 w2Var5 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.f37976s = w2Var5;
        w2Var5.setTextSize(12);
        w2Var5.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Dg), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        w2Var5.setOnClickListener(new View.OnClickListener(this) {
            public final g60 f43221b;

            {
                this.f43221b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        g60.q(this.f43221b, launchActivity);
                        return;
                    default:
                        g60 g60Var2 = this.f43221b;
                        g60Var2.a2.e();
                        ChatObject.Call call2 = g60Var2.f37903a1;
                        if (call2 != null && !call2.isScheduled()) {
                            g60Var2.J1();
                            g60.u1(launchActivity, new s20(g60Var2, 5), false, false);
                            return;
                        }
                        g60Var2.dismiss();
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.w2 w2Var6 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.v = w2Var6;
        w2Var6.setCheckable(true);
        w2Var6.b(true, false);
        w2Var6.setTextSize(12);
        w2Var6.c(R.drawable.filled_voice_comment_32, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipMessage), false, false);
        m30 m30Var = new m30(this, launchActivity);
        this.f37998x = m30Var;
        m30Var.setAnimation(dk0Var);
        m30Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.w2 w2Var7 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.f37993w = w2Var7;
        w2Var7.setDrawBackground(false);
        w2Var7.setTextSize(12);
        w2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        w2Var7.addView(m30Var, w7.x5.e(50, 50, 49));
        l30Var.a(w2Var7);
        w2Var7.setOnClickListener(new o30(this));
        l30Var.a(w2Var6);
        l30Var.a(w2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.f38003y = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        w2Var7.addView(imageView2, w7.x5.a(24.0f, 0.0f, 13.0f, 0.0f, 0.0f, 24, 49));
        if (this.f37903a1 != null && s1() && !this.f37903a1.isScheduled()) {
            imageView2.setVisibility(0);
            m30Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.f37920e0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Og));
        c50Var.setAlpha(0.0f);
        c50Var.getBackButton().setScaleX(0.9f);
        c50Var.getBackButton().setScaleY(0.9f);
        c50Var.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        c50Var.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        c50Var.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        c50Var.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(launchActivity, (org.telegram.ui.ActionBar.y) null, 0, org.telegram.ui.ActionBar.h6.v0(i13));
        this.f37945k1 = u0Var;
        u0Var.setLongClickEnabled(false);
        u0Var.setIcon(R.drawable.ic_ab_other);
        u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var.setSubMenuOpenSide(2);
        u0Var.setDelegate(new p20(this, 0));
        int i17 = org.telegram.ui.ActionBar.h6.f20922ig;
        u0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(i17), 6));
        u0Var.setOnClickListener(new q20(this, 0));
        u0Var.G(org.telegram.ui.ActionBar.h6.v0(i13), false);
        u0Var.G(org.telegram.ui.ActionBar.h6.v0(i13), true);
        org.telegram.ui.ActionBar.u0 u0Var2 = new org.telegram.ui.ActionBar.u0(launchActivity, (org.telegram.ui.ActionBar.y) null, 0, org.telegram.ui.ActionBar.h6.v0(i13));
        this.l1 = u0Var2;
        u0Var2.setLongClickEnabled(false);
        u0Var2.setIcon(R.drawable.msg_voice_pip);
        u0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        u0Var2.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(i17), 6));
        u0Var2.setOnClickListener(new q20(this, 1));
        org.telegram.ui.ActionBar.u0 u0Var3 = new org.telegram.ui.ActionBar.u0(launchActivity, (org.telegram.ui.ActionBar.y) null, 0, org.telegram.ui.ActionBar.h6.v0(i13));
        this.f37951m1 = u0Var3;
        u0Var3.setLongClickEnabled(false);
        u0Var3.setIcon(R.drawable.msg_screencast);
        u0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        u0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(i17), 6));
        u0Var3.setOnClickListener(new q20(this, 2));
        q30 q30Var = new q30(this, launchActivity, launchActivity);
        this.f37921e1 = q30Var;
        r30 r30Var = new r30(launchActivity);
        this.N = r30Var;
        r30Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.f37930g1 = paint2;
        paint2.setColor(-12761513);
        s30 s30Var = new s30(this, getContext());
        this.f37926f1 = s30Var;
        s30Var.setTextColor(getThemedColor(i13));
        s30Var.setTextSize(1, 11.0f);
        s30Var.setText(LocaleController.getString(R.string.VoipChannelLabelLive));
        s30Var.setMaxLines(1);
        s30Var.setGravity(17);
        s30Var.setTypeface(AndroidUtilities.bold());
        s30Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f));
        s30Var.setTag(-1);
        if (!s1()) {
            s30Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f37942j1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(q30Var, w7.x5.l(1.0f, 0, -2));
        linearLayout.addView(s30Var, w7.x5.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.containerView.addView(r30Var, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        this.containerView.addView(linearLayout, w7.x5.a(-2.0f, 23.0f, 0.0f, 48.0f, 0.0f, -2, 51));
        this.containerView.addView(c50Var, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.f38008z1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(u0Var3, w7.x5.n(48, 48));
        linearLayout2.addView(u0Var2, w7.x5.n(48, 48));
        linearLayout2.addView(u0Var, w7.x5.n(48, 48));
        this.containerView.addView(linearLayout2, w7.x5.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.f37929g0 = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.V5));
        this.containerView.addView(view, w7.x5.d(1.0f, -1));
        for (int i18 = 0; i18 < 2; i18++) {
            this.f37941j0[i18] = new t30(this, launchActivity);
            this.f37941j0[i18].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            this.f37941j0[i18].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.containerView.addView(this.f37941j0[i18], w7.x5.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83));
        }
        org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(launchActivity, true);
        this.f37944k0 = kVar;
        kVar.setTag(R.id.fit_width_tag, 240);
        this.f37945k1.h(kVar, AndroidUtilities.dp(48.0f));
        this.f37945k1.setShowSubmenuByMove(false);
        int i19 = org.telegram.ui.ActionBar.h6.eg;
        kVar.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.v0(i19), 6, 6));
        org.telegram.ui.ActionBar.u0 u0Var4 = this.f37945k1;
        org.telegram.ui.ActionBar.e1 d = u0Var4.d(1, 0, null, LocaleController.getString(R.string.VoipGroupAllCanSpeak), true, true, u0Var4.m0);
        this.f37986u1 = d;
        d.j(true, false);
        org.telegram.ui.ActionBar.u0 u0Var5 = this.f37945k1;
        org.telegram.ui.ActionBar.e1 d10 = u0Var5.d(2, 0, null, LocaleController.getString(R.string.VoipGroupOnlyAdminsCanSpeak), true, true, u0Var5.m0);
        this.f37990v1 = d10;
        d10.j(false, true);
        int i20 = org.telegram.ui.ActionBar.h6.f21182wg;
        d.setCheckColor(i20);
        d.c(org.telegram.ui.ActionBar.h6.v0(i20), org.telegram.ui.ActionBar.h6.v0(i20));
        d10.setCheckColor(i20);
        d10.c(org.telegram.ui.ActionBar.h6.v0(i20), org.telegram.ui.ActionBar.h6.v0(i20));
        Paint paint3 = new Paint(1);
        int i21 = org.telegram.ui.ActionBar.h6.f20903hg;
        paint3.setColor(org.telegram.ui.ActionBar.h6.v0(i21));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.u0 u0Var6 = this.f37945k1;
        org.telegram.ui.ActionBar.e1 d11 = u0Var6.d(10, R.drawable.msg_voice_speaker, null, LocaleController.getString(R.string.VoipGroupAudio), true, false, u0Var6.m0);
        this.f37964p1 = d11;
        d11.setItemHeight(56);
        org.telegram.ui.ActionBar.u0 u0Var7 = this.f37945k1;
        org.telegram.ui.ActionBar.e1 d12 = u0Var7.d(11, R.drawable.msg_noise_on, null, LocaleController.getString(R.string.VoipNoiseCancellation), true, false, u0Var7.m0);
        this.f37968q1 = d12;
        d12.setItemHeight(56);
        TextView b10 = this.f37945k1.b(i0.a.d(0.3f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f20885gg), -16777216));
        this.A1 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.u0 u0Var8 = this.f37945k1;
        org.telegram.ui.ActionBar.e1 d13 = u0Var8.d(6, R.drawable.msg_edit, this.f37916d1, LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEditTitle : R.string.VoipGroupEditTitle), true, false, u0Var8.m0);
        this.f37960o1 = d13;
        org.telegram.ui.ActionBar.u0 u0Var9 = this.f37945k1;
        org.telegram.ui.ActionBar.e1 d14 = u0Var9.d(7, R.drawable.msg_permissions, this.f37916d1, LocaleController.getString(R.string.VoipGroupEditPermissions), false, false, u0Var9.m0);
        this.f37973r1 = d14;
        org.telegram.ui.ActionBar.e1 e7 = this.f37945k1.e(3, R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareInviteLink));
        this.f37956n1 = e7;
        b60 b60Var = new b60();
        this.f37916d1 = b60Var;
        org.telegram.ui.ActionBar.e1 e10 = this.f37945k1.e(9, R.drawable.msg_screencast, LocaleController.getString(R.string.VoipChatStartScreenCapture));
        this.f37982t1 = e10;
        org.telegram.ui.ActionBar.u0 u0Var10 = this.f37945k1;
        org.telegram.ui.ActionBar.e1 d15 = u0Var10.d(5, 0, b60Var, LocaleController.getString(R.string.VoipGroupRecordCall), true, false, u0Var10.m0);
        this.f37978s1 = d15;
        b60Var.a(d15.getImageView());
        org.telegram.ui.ActionBar.e1 e11 = this.f37945k1.e(12, R.drawable.menu_stream_comments_24, LocaleController.getString(R.string.VoipChannelEnableComments));
        this.f38000x1 = e11;
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        org.telegram.ui.ActionBar.e1 e12 = this.f37945k1.e(13, R.drawable._menu_stream_comments_off_24, LocaleController.getString(R.string.VoipChannelDisableComments));
        this.f38005y1 = e12;
        org.telegram.ui.ActionBar.u0 u0Var11 = this.f37945k1;
        int i22 = R.drawable.msg_cancel;
        if (p1()) {
            i10 = i21;
            string = LocaleController.getString(R.string.VoipGroupEndConference);
        } else {
            string = LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat);
            i10 = i21;
        }
        org.telegram.ui.ActionBar.e1 e13 = u0Var11.e(4, i22, string);
        this.f37995w1 = e13;
        this.f37945k1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.h6.v0(i19));
        this.f37945k1.getPopupLayout().setFitItems(true);
        e11.c(org.telegram.ui.ActionBar.h6.v0(i10), org.telegram.ui.ActionBar.h6.v0(i10));
        e12.c(org.telegram.ui.ActionBar.h6.v0(i10), org.telegram.ui.ActionBar.h6.v0(i10));
        d11.c(org.telegram.ui.ActionBar.h6.v0(i10), org.telegram.ui.ActionBar.h6.v0(i10));
        d12.c(org.telegram.ui.ActionBar.h6.v0(i10), org.telegram.ui.ActionBar.h6.v0(i10));
        int i23 = org.telegram.ui.ActionBar.h6.f21163vg;
        e13.c(org.telegram.ui.ActionBar.h6.v0(i23), org.telegram.ui.ActionBar.h6.v0(i23));
        e7.c(org.telegram.ui.ActionBar.h6.v0(i10), org.telegram.ui.ActionBar.h6.v0(i10));
        d13.c(org.telegram.ui.ActionBar.h6.v0(i10), org.telegram.ui.ActionBar.h6.v0(i10));
        d14.c(org.telegram.ui.ActionBar.h6.v0(i10), org.telegram.ui.ActionBar.h6.v0(i10));
        d15.c(org.telegram.ui.ActionBar.h6.v0(i10), org.telegram.ui.ActionBar.h6.v0(i10));
        e10.c(org.telegram.ui.ActionBar.h6.v0(i10), org.telegram.ui.ActionBar.h6.v0(i10));
        if (this.f37903a1 != null) {
            m1();
        }
        if (p1()) {
            this.f37963p0 = new r50();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.f37963p0.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        Q1(false);
        this.O.getTitleTextView().setOnClickListener(new q20(this, 3));
        u30 u30Var = new u30(this, launchActivity);
        this.f37952m2 = u30Var;
        v30 v30Var = new v30(this);
        this.N2 = v30Var;
        u30Var.setClipToPadding(false);
        v30Var.S();
        v30Var.f47842o = org.telegram.ui.Components.is.f27500f;
        v30Var.d = 350L;
        v30Var.f47874c = 350L;
        v30Var.f47875e = 350L;
        u30Var.setItemAnimator(v30Var);
        u30Var.setOnScrollListener(new w30(this));
        u30Var.setClipChildren(false);
        s4.d0 d0Var = new s4.d0();
        d0Var.j1(0);
        u30Var.setLayoutManager(d0Var);
        org.telegram.ui.Components.k30 k30Var = new org.telegram.ui.Components.k30(call, this.currentAccount, this);
        this.f37965p2 = k30Var;
        u30Var.setAdapter(k30Var);
        k30Var.F(u30Var, false);
        u30Var.setOnItemClickListener(new org.telegram.ui.Components.fm0(this) {
            public final g60 f41339b;

            {
                this.f41339b = this;
            }

            @Override
            public final void d(int i152, View view2) {
                switch (r2) {
                    case 0:
                        g60 g60Var2 = this.f41339b;
                        g60Var2.getClass();
                        org.telegram.ui.Components.j30 j30Var = (org.telegram.ui.Components.j30) view2;
                        if (j30Var.getVideoParticipant() == null) {
                            g60Var2.f1(new ChatObject.VideoParticipant(j30Var.getParticipant(), false, false));
                            return;
                        } else {
                            g60Var2.f1(j30Var.getVideoParticipant());
                            return;
                        }
                    default:
                        g60 g60Var3 = this.f41339b;
                        g60Var3.getClass();
                        org.telegram.ui.Components.voip.m mVar = (org.telegram.ui.Components.voip.m) view2;
                        if (mVar.getParticipant() != null) {
                            g60Var3.f1(mVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        u30Var.setOnItemLongClickListener(new p20(this, 1));
        u30Var.setVisibility(8);
        u30Var.i(new x30());
        y30 y30Var = new y30(this, launchActivity, this.Q, u30Var, this.Y1, this.f37903a1, this);
        this.a2 = y30Var;
        y30Var.setClipChildren(false);
        k30Var.E(this.Y1, y30Var);
        if (this.f37957n2 != null) {
            this.f37961o2.G(this.Y1, y30Var);
        }
        z30 z30Var = new z30(this, launchActivity);
        this.D2 = z30Var;
        a40 a40Var = new a40(this, launchActivity, this.O, this.Q, z30Var);
        this.f37905b = a40Var;
        a40Var.setImagesLayerNum(Integer.MAX_VALUE);
        a40Var.setInvalidateWithParent(true);
        z30Var.setProfileGalleryView(a40Var);
        b40 b40Var = new b40(this, launchActivity);
        this.C2 = b40Var;
        b40Var.setVisibility(8);
        a40Var.setVisibility(0);
        a40Var.b(new c40(this));
        d40 d40Var = new d40(this, launchActivity);
        this.f37908b2 = d40Var;
        this.containerView.addView(y30Var);
        y30Var.addView(u30Var, w7.x5.a(80.0f, 0.0f, 0.0f, 0.0f, 100.0f, -1, 80));
        this.f37919e.setWillNotDraw(false);
        View view2 = new View(launchActivity);
        this.J2 = view2;
        int[] iArr = this.M2;
        iArr[0] = this.V1;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.M2);
        this.L2 = gradientDrawable;
        view2.setBackground(gradientDrawable);
        this.containerView.addView(view2, w7.x5.e(-1, 60, 83));
        View view3 = new View(launchActivity);
        this.K2 = view3;
        view3.setBackgroundColor(this.M2[0]);
        this.containerView.addView(view3, w7.x5.e(-1, 0, 83));
        lh.h hVar = new lh.h(launchActivity);
        this.f37911c0 = hVar;
        hVar.setDelegate(new e40(this));
        hVar.setClickCellDelegate(new f40(this));
        if (this.f37903a1 != null) {
            hVar.C0(this.d.getCurrentAccount(), this.f37903a1.getInputGroupCall(false));
        }
        this.containerView.addView(hVar, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(launchActivity, false, true, true);
        this.M = r6Var;
        r6Var.setGravity(17);
        r6Var.setTextSize(AndroidUtilities.dp(15.0f));
        r6Var.setTextColor(-1);
        r6Var.b(0.4f, 320L, org.telegram.ui.Components.is.h);
        r6Var.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.f37919e);
        g40 g40Var = new g40(this, launchActivity, this.L, LaunchActivity.R(), this.resourcesProvider);
        this.H = g40Var;
        g40Var.J = true;
        g40Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f37915d0)});
        g40Var.getEditText().setLinkTextColor(-11683585);
        g40Var.setHint(LocaleController.getString(R.string.TypeMessage));
        g40Var.getEditText().addTextChangedListener(new h40(this));
        g40Var.s();
        i40 i40Var = new i40(this, launchActivity);
        this.G = i40Var;
        this.containerView.addView(i40Var, w7.x5.d(-1.0f, -1));
        j40 j40Var = new j40(launchActivity);
        this.F = j40Var;
        j40Var.addView(g40Var, w7.x5.a(-2.0f, 0.0f, 0.0f, 48.0f, 0.0f, -1, 80));
        j40Var.addView(r6Var, w7.x5.a(16.0f, 0.0f, 0.0f, 0.0f, 32.0f, 52, 85));
        r6Var.setTranslationY(-AndroidUtilities.dp(20.0f));
        this.containerView.addView(j40Var, w7.x5.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.J = imageView3;
        int i24 = org.telegram.ui.ActionBar.h6.f20913i6;
        imageView3.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i24), 1, -1));
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f7, this.resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(w02, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new q20(this, 4));
        ImageView imageView4 = new ImageView(launchActivity);
        this.I = imageView4;
        imageView4.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i24), 1, -1));
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21154v6, this.resourcesProvider), mode));
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new q20(this, 5));
        j40Var.addView(imageView3, w7.x5.e(48, 48, 85));
        j40Var.addView(imageView4, w7.x5.e(48, 48, 85));
        this.containerView.addView(d40Var);
        b40Var.addView(a40Var, w7.x5.d(-1.0f, -1));
        b40Var.addView(z30Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
        this.containerView.addView(b40Var, w7.x5.a(-1.0f, 14.0f, 14.0f, 14.0f, 14.0f, -1, 0));
        P0(false);
        this.P.l();
        if (G3) {
            this.f37961o2.I(this.f37957n2, false);
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
            this.containerView.addView(textView, w7.x5.a(-2.0f, 21.0f, 0.0f, 21.0f, 100.0f, -2, 81));
            org.telegram.ui.Components.ud0 ud0Var = new org.telegram.ui.Components.ud0(launchActivity);
            ud0Var.setTextColor(-1);
            ud0Var.setSelectorColor(-9598483);
            ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            ud0Var.setItemCount(5);
            l40 l40Var = new l40(launchActivity);
            l40Var.setItemCount(5);
            l40Var.setTextColor(-1);
            l40Var.setSelectorColor(-9598483);
            l40Var.setTextOffset(-AndroidUtilities.dp(10.0f));
            m40 m40Var = new m40(launchActivity);
            m40Var.setItemCount(5);
            m40Var.setTextColor(-1);
            m40Var.setSelectorColor(-9598483);
            m40Var.setTextOffset(-AndroidUtilities.dp(34.0f));
            n40 n40Var = new n40(launchActivity);
            this.T = n40Var;
            n40Var.setLines(1);
            n40Var.setSingleLine(true);
            n40Var.setEllipsize(TextUtils.TruncateAt.END);
            n40Var.setGravity(17);
            n40Var.setTextColor(-1);
            n40Var.setTypeface(AndroidUtilities.bold());
            n40Var.setTextSize(1, 14.0f);
            this.containerView.addView(n40Var, w7.x5.a(48.0f, 21.0f, 0.0f, 21.0f, 20.5f, -1, 81));
            launchActivity2 = launchActivity;
            n40Var.setOnClickListener(new org.telegram.messenger.video.g(this, ud0Var, l40Var, m40Var, chat, accountInstance, inputPeer2, 1));
            p40 p40Var = new p40(launchActivity2, ud0Var, l40Var, m40Var);
            this.R = p40Var;
            p40Var.setWeightSum(1.0f);
            p40Var.setOrientation(0);
            this.containerView.addView(p40Var, w7.x5.a(270.0f, 0.0f, 50.0f, 0.0f, 0.0f, -1, 51));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i25 = calendar.get(1);
            int i26 = calendar.get(6);
            p40Var.addView(ud0Var, w7.x5.l(0.5f, 0, 270));
            ud0Var.setMinValue(0);
            ud0Var.setMaxValue(365);
            ud0Var.setWrapSelectorWheel(false);
            ud0Var.setFormatter(new u20(currentTimeMillis, calendar, i25, 0));
            a1.d dVar = new a1.d(this, ud0Var, l40Var, m40Var, 11);
            g60Var = this;
            ud0Var.setOnValueChangedListener(dVar);
            l40Var.setMinValue(0);
            l40Var.setMaxValue(23);
            p40Var.addView(l40Var, w7.x5.l(0.2f, 0, 270));
            l40Var.setFormatter(new v20(0));
            l40Var.setOnValueChangedListener(dVar);
            m40Var.setMinValue(0);
            m40Var.setMaxValue(59);
            m40Var.setValue(0);
            m40Var.setFormatter(new v20(1));
            p40Var.addView(m40Var, w7.x5.l(0.3f, 0, 270));
            m40Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i27 = calendar.get(6);
            int i28 = calendar.get(12);
            int i29 = calendar.get(11);
            ud0Var.setValue(i26 != i27 ? 1 : 0);
            m40Var.setValue(i28);
            l40Var.setValue(i29);
            org.telegram.ui.Components.g5.f(n40Var, textView, 0L, 604800L, 2, ud0Var, l40Var, m40Var);
        } else {
            launchActivity2 = launchActivity;
            g60Var = this;
        }
        q40 q40Var = new q40(g60Var, (ViewGroup) g60Var.getWindow().getDecorView(), g60Var.containerView);
        g60Var.f37913c2 = q40Var;
        q40Var.E = new r40(g60Var);
        a40Var.setPinchToZoomHelper(q40Var);
        g60Var.f37954n.setOnClickListener(new View.OnClickListener(g60Var) {
            public final g60 f43221b;

            {
                this.f43221b = g60Var;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        g60.q(this.f43221b, launchActivity2);
                        return;
                    default:
                        g60 g60Var2 = this.f43221b;
                        g60Var2.a2.e();
                        ChatObject.Call call2 = g60Var2.f37903a1;
                        if (call2 != null && !call2.isScheduled()) {
                            g60Var2.J1();
                            g60.u1(launchActivity2, new s20(g60Var2, 5), false, false);
                            return;
                        }
                        g60Var2.dismiss();
                        return;
                }
            }
        });
        g60Var.M1(false);
        g60Var.J1();
        g60Var.N1(false);
        g60Var.O1(false, false);
        g60Var.C1(0.0f);
        g60Var.P1();
        g60Var.containerView.addView(new FrameLayout(launchActivity2), w7.x5.e(-1, 200, 87));
        g60Var.v.setOnClickListener(new q20(g60Var, 6));
        g60Var.U0();
        w7.z5.a(g60Var.f37954n);
        w7.z5.a(g60Var.f37971r);
        w7.z5.a(g60Var.f37924f);
        w7.z5.a(g60Var.h);
        w7.z5.a(g60Var.f37993w);
        w7.z5.a(g60Var.f37976s);
        w7.z5.a(g60Var.v);
        r0.i0.l(g60Var.containerView, new p20(g60Var, 2));
    }

    public static void B(g60 g60Var, org.telegram.ui.ActionBar.a2[] a2VarArr, boolean z10, TLRPC.TL_error tL_error, long j3, TL_phone.inviteToGroupCall invitetogroupcall) {
        try {
            a2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        a2VarArr[0] = null;
        if (z10 && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
            g60Var.y1(null, j3, 3);
            return;
        }
        org.telegram.ui.Components.g5.e0(g60Var.currentAccount, tL_error, (org.telegram.ui.ActionBar.m2) g60Var.f37937i0.O().getFragmentStack().get(g60Var.f37937i0.O().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
    }

    public static String B0() {
        String[][] strArr = EmojiData.data;
        String[] strArr2 = strArr[(int) Math.floor(Math.random() * strArr.length)];
        return strArr2[(int) Math.floor(Math.random() * strArr2.length)];
    }

    public static r0.k1 C(g60 g60Var, r0.k1 k1Var) {
        int keyboardHeight;
        r0.h1 h1Var = k1Var.f46901a;
        i0.b f7 = h1Var.f(647);
        i0.b f10 = h1Var.f(8);
        g40 g40Var = g60Var.H;
        if (!g40Var.N && !g40Var.f24682e) {
            keyboardHeight = 0;
        } else {
            keyboardHeight = g40Var.getKeyboardHeight();
        }
        int max = Math.max(f10.d, keyboardHeight);
        ViewGroup.LayoutParams layoutParams = g60Var.f37908b2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f7.d;
        }
        if (g40Var.getEmojiView() != null) {
            g40Var.getEmojiView().setBottomInset(f7.d);
        }
        if (g60Var.S2) {
            ViewGroup viewGroup = g60Var.containerView;
            int i10 = g60Var.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
        } else {
            ViewGroup viewGroup2 = g60Var.containerView;
            int i11 = g60Var.backgroundPaddingLeft;
            viewGroup2.setPadding(f7.f11575a + i11, f7.f11576b, i11 + f7.f11577c, f7.d);
        }
        g60Var.containerView.requestLayout();
        if (max == 0 && !g40Var.N && !g40Var.f24682e && !g40Var.O) {
            g40Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.ll0 ll0Var = g60Var.K;
            if (ll0Var == null) {
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                ll0Var = null;
                if (R != null) {
                    org.telegram.ui.Components.ll0 ll0Var2 = new org.telegram.ui.Components.ll0(1, g60Var.currentAccount, g60Var.getContext(), R, g60Var.resourcesProvider);
                    g60Var.K = ll0Var2;
                    ll0Var2.setDelegate(new i50(g60Var));
                    g60Var.containerView.addView(g60Var.K, w7.x5.e(-2, 52, 81));
                    g60Var.K.p(null, null, false);
                    g60Var.G.bringToFront();
                    g60Var.F.bringToFront();
                    ll0Var = g60Var.K;
                }
            }
            g60Var.K = ll0Var;
        }
        g40Var.H(f10.d, false);
        g60Var.C1.k(k1Var);
        return r0.k1.f46900b;
    }

    public static void C0(g60 g60Var) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("reminderhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("reminderhint", true).commit();
        if (g60Var.f37955n0 == null) {
            org.telegram.ui.Components.a50 a50Var = new org.telegram.ui.Components.a50(g60Var.getContext(), 8);
            g60Var.f37955n0 = a50Var;
            a50Var.setAlpha(0.0f);
            g60Var.f37955n0.setVisibility(4);
            g60Var.f37955n0.setShowingDuration(4000L);
            g60Var.containerView.addView(g60Var.f37955n0, w7.x5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
            g60Var.f37955n0.setText(LocaleController.getString(R.string.VoipChatReminderHint));
            g60Var.f37955n0.d();
        }
        g60Var.f37955n0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        g60Var.f37955n0.f(g60Var.f37993w, true);
    }

    public static void D(g60 g60Var, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        TLRPC.GroupCall groupCall;
        a2Var.dismiss();
        boolean z10 = false;
        if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
            Context context = g60Var.getContext();
            int i10 = g60Var.currentAccount;
            TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
            String str = ((TL_phone.exportedGroupCallInvite) tLObject).link;
            org.telegram.ui.ActionBar.d6 d6Var = g60Var.resourcesProvider;
            ChatObject.Call call = g60Var.f37903a1;
            if (call != null && (groupCall = call.call) != null && groupCall.creator) {
                z10 = true;
            }
            i9.o0(context, i10, inputGroupCall, str, d6Var, false, z10);
        } else if (tL_error != null) {
            new org.telegram.ui.Components.ad(g60Var.topBulletinContainer, new ai.a1()).f0(tL_error, false);
        }
    }

    public static void E(g60 g60Var, int[] iArr, float[] fArr) {
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        s4.d1 K;
        u30 u30Var = g60Var.f37952m2;
        y30 y30Var = g60Var.a2;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant = g60Var.f37903a1.participantsBySources.get(iArr[i10]);
            if (groupCallParticipant != null) {
                if (!y30Var.f32178b) {
                    if (g60Var.f37977s0) {
                        arrayList = g60Var.D0;
                    } else {
                        arrayList = g60Var.f37903a1.visibleParticipants;
                    }
                    int indexOf = arrayList.indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = g60Var.Q.K(indexOf + g60Var.P.d)) != null) {
                        View view = K.f47782a;
                        if (view instanceof org.telegram.ui.Cells.e4) {
                            ((org.telegram.ui.Cells.e4) view).setAmplitude(fArr[i10] * 15.0f);
                            if (view == g60Var.X2 && !g60Var.f37949l2) {
                                g60Var.containerView.invalidate();
                            }
                        }
                    }
                } else {
                    for (int i11 = 0; i11 < u30Var.getChildCount(); i11++) {
                        org.telegram.ui.Components.j30 j30Var = (org.telegram.ui.Components.j30) u30Var.getChildAt(i11);
                        if (MessageObject.getPeerId(j30Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                            j30Var.setAmplitude(fArr[i10] * 15.0f);
                        }
                    }
                }
                y30Var.k(groupCallParticipant, fArr[i10] * 15.0f);
            }
        }
    }

    public static void F(g60 g60Var) {
        Editable text = g60Var.H.getText();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = text.toString();
        tL_textWithEntities.entities = MediaDataController.getInstance(g60Var.currentAccount).getEntities(new CharSequence[]{text}, true);
        g60Var.B1(tL_textWithEntities);
    }

    public static void G0(g60 g60Var) {
        ChatObject.Call call = g60Var.f37903a1;
        if (call != null && call.call != null) {
            TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
            togglegroupcallsettings.call = g60Var.f37903a1.getInputGroupCall();
            togglegroupcallsettings.join_muted = Boolean.valueOf(g60Var.f37903a1.call.join_muted);
            ConnectionsManager connectionsManager = g60Var.d.getConnectionsManager();
            DispatchQueue dispatchQueue = Utilities.stageQueue;
            Objects.requireNonNull(dispatchQueue);
            connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.d1(dispatchQueue), new c30(g60Var, 1));
        }
    }

    public static void H0(g60 g60Var, boolean z10) {
        if (g60Var.f37903a1 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = g60Var.f37903a1.getInputGroupCall();
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        g60Var.f38002x3 = Boolean.valueOf(z10);
        g60Var.I1(true);
        ConnectionsManager connectionsManager = g60Var.d.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.d1(dispatchQueue), new c30(g60Var, 0));
    }

    public static void I0(g60 g60Var) {
        boolean z10;
        int i10;
        if (g60Var.s1()) {
            y30 y30Var = g60Var.a2;
            if (!y30Var.V && y30Var.f32178b && (F3 == g60Var.r1() || AndroidUtilities.isTablet())) {
                z10 = false;
            } else {
                z10 = true;
            }
            Boolean bool = g60Var.f37943j2;
            if (bool != null && z10 == bool.booleanValue()) {
                return;
            }
            int systemUiVisibility = g60Var.containerView.getSystemUiVisibility();
            if (z10) {
                i10 = systemUiVisibility & (-7);
                g60Var.getWindow().clearFlags(1024);
                g60Var.setHideSystemVerticalInsets(false);
            } else {
                g60Var.setHideSystemVerticalInsets(true);
                i10 = systemUiVisibility | 6;
                g60Var.getWindow().addFlags(1024);
            }
            g60Var.containerView.setSystemUiVisibility(i10);
            g60Var.f37943j2 = Boolean.valueOf(z10);
            g60Var.S2 = !z10;
            g60Var.containerView.requestApplyInsets();
            return;
        }
        g60Var.isFullscreen = false;
    }

    public static org.telegram.ui.Components.voip.m J0(g60 g60Var) {
        m50 m50Var = g60Var.Q;
        for (int i10 = 0; i10 < m50Var.getChildCount(); i10++) {
            View childAt = m50Var.getChildAt(i10);
            if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.m) && RecyclerView.R(childAt) >= 0) {
                return (org.telegram.ui.Components.voip.m) childAt;
            }
        }
        return null;
    }

    public static void K0(g60 g60Var) {
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
        c50 c50Var = g60Var.O;
        m50 m50Var = g60Var.Q;
        int childCount = m50Var.getChildCount();
        float f14 = 2.1474836E9f;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (RecyclerView.R(m50Var.getChildAt(i10)) >= 0) {
                f14 = Math.min(f14, childAt.getTop());
            }
        }
        if (f14 < 0.0f || f14 == 2.1474836E9f) {
            if (childCount != 0) {
                f14 = 0.0f;
            } else {
                f14 = m50Var.getPaddingTop();
            }
        }
        if (f14 <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float dp4 = f14 + AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if ((z10 && c50Var.getTag() == null) || (!z10 && c50Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            c50Var.setTag(num);
            AnimatorSet animatorSet = g60Var.f37933h0;
            if (animatorSet != null) {
                animatorSet.cancel();
                g60Var.f37933h0 = null;
            }
            if (c50Var.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            g60Var.setUseLightStatusBar(z11);
            ViewPropertyAnimator animate = c50Var.getBackButton().animate();
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
            org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.f27500f;
            duration.setInterpolator(isVar).start();
            ViewPropertyAnimator animate2 = c50Var.getTitleTextView().animate();
            if (z10) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(23.0f);
            }
            animate2.translationY(dp).setDuration(300L).setInterpolator(isVar).start();
            ObjectAnimator objectAnimator = g60Var.U2;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                g60Var.U2.cancel();
            }
            org.telegram.ui.ActionBar.h5 subtitleTextView = c50Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            float translationY = c50Var.getSubtitleTextView().getTranslationY();
            if (z10) {
                dp2 = 0.0f;
            } else {
                dp2 = AndroidUtilities.dp(20.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, property, translationY, dp2);
            g60Var.U2 = ofFloat;
            ofFloat.setDuration(300L);
            g60Var.U2.setInterpolator(isVar);
            g60Var.U2.addListener(new org.telegram.ui.Components.ea(29, g60Var, z10));
            g60Var.U2.start();
            ObjectAnimator objectAnimator2 = g60Var.V2;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            org.telegram.ui.ActionBar.h5 additionalSubtitleTextView = c50Var.getAdditionalSubtitleTextView();
            if (z10) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(20.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(additionalSubtitleTextView, property, dp3);
            g60Var.V2 = ofFloat2;
            ofFloat2.setDuration(300L);
            g60Var.V2.setInterpolator(isVar);
            g60Var.V2.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            g60Var.f37933h0 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = g60Var.f37933h0;
            Property property2 = View.ALPHA;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c50Var, property2, f11);
            r30 r30Var = g60Var.N;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(r30Var, property2, f12);
            View view = g60Var.f37929g0;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, property2, f13));
            g60Var.f37933h0.addListener(new a50(g60Var, 1));
            g60Var.f37933h0.start();
            ImageView imageView = g60Var.a2.v;
            if (z10 && !F3) {
                z12 = false;
            } else {
                z12 = true;
            }
            imageView.setClickable(z12);
        }
        if (g60Var.f38004y0 != dp4) {
            g60Var.F1(dp4);
        }
    }

    public static void O(g60 g60Var, org.telegram.ui.Components.voip.m mVar, boolean z10) {
        if (!g60Var.isDismissed()) {
            if (z10 && mVar.getRenderer() == null) {
                mVar.setRenderer(org.telegram.ui.Components.voip.v.c(g60Var.Y1, g60Var.a2, mVar, null, null, mVar.getParticipant(), g60Var.f37903a1, g60Var));
            } else if (!z10 && mVar.getRenderer() != null) {
                mVar.getRenderer().setPrimaryView(null);
                mVar.setRenderer(null);
            }
        }
    }

    public static void T(g60 g60Var, int i10, int[] iArr) {
        if (g60Var.s1()) {
            int i11 = org.telegram.ui.ActionBar.h6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Lg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21235zg, false), g60Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20960kg, false), org.telegram.ui.ActionBar.h6.x0(null, i11, false), g60Var.U1, 1.0f);
        } else if (i10 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Jg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21216yg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21235zg, false), g60Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21199xg, false);
        } else if (i10 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Gg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Bg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Cg, false), g60Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ag, false);
        } else if (q1(i10)) {
            iArr[0] = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20961kh, false);
            iArr[1] = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20979lh, false);
            iArr[2] = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20998mh, false);
        } else {
            int i12 = org.telegram.ui.ActionBar.h6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.h6.x0(null, i12, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Mg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ng, false), g60Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20960kg, false), org.telegram.ui.ActionBar.h6.x0(null, i12, false), g60Var.U1, 1.0f);
        }
        if (q1(i10)) {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20923ih, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20961kh, false));
        } else if (i10 == 1) {
            iArr[3] = i0.a.d(0.75f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Bg, false), i0.a.d(0.5f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Fg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Hg, false)));
        } else {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Jg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ig, false));
        }
    }

    public static void d1(LaunchActivity launchActivity, AccountInstance accountInstance, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        if (D3 == null) {
            if (inputPeer != null || VoIPService.getSharedInstance() != null) {
                if (inputPeer != null) {
                    D3 = new g60(launchActivity, accountInstance, accountInstance.getMessagesController().getGroupCall(chat.f20068id, false), chat, inputPeer, z10, str);
                } else {
                    ChatObject.Call call = VoIPService.getSharedInstance().groupCall;
                    if (call != null) {
                        TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(call.chatId));
                        call.addSelfDummyParticipant(true);
                        D3 = new g60(launchActivity, accountInstance, call, chat2, null, z10, str);
                    } else {
                        return;
                    }
                }
                D3.f37937i0 = launchActivity;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vh(18));
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

    public static void o(g60 g60Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(g60Var.currentAccount).sendRequest(declineconferencecallinvite, new b30(g60Var, 0));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(invitedUser.msg_id));
        MessagesController.getInstance(g60Var.currentAccount).deleteMessages(arrayList, null, null, 0L, 0, true, 0);
        ChatObject.Call call = g60Var.f37903a1;
        if (call != null) {
            call.invitedUsers.remove(l4);
            g60Var.f37903a1.invitedUsersMap.remove(l4);
            g60Var.f37903a1.invitedUsersMessageIds.remove(l4);
            g60Var.P0(true);
        }
    }

    public static void p(g60 g60Var, Activity activity, ChatObject.Call call, View view, int i10) {
        TLRPC.Chat chat;
        final ChatObject.Call.InvitedUser invitedUser;
        AccountInstance accountInstance = g60Var.d;
        ArrayList arrayList = g60Var.F0;
        a60 a60Var = g60Var.P;
        if (view instanceof org.telegram.ui.Components.voip.m) {
            g60Var.f1(((org.telegram.ui.Components.voip.m) view).getParticipant());
        } else if (view instanceof org.telegram.ui.Cells.e4) {
            g60Var.G1((org.telegram.ui.Cells.e4) view);
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
                    if (g60Var.p1()) {
                        int i11 = i10 - a60Var.f35928n;
                        if (i11 >= 0 && i11 < g60Var.f37903a1.shadyJoinParticipants.size()) {
                            l4 = g60Var.f37903a1.shadyJoinParticipants.get(i10 - a60Var.f35928n);
                        } else {
                            int i12 = i10 - a60Var.f35930s;
                            if (i12 >= 0 && i12 < g60Var.f37903a1.shadyLeftParticipants.size()) {
                                l4 = g60Var.f37903a1.shadyLeftParticipants.get(i10 - a60Var.f35930s);
                            } else {
                                int i13 = i10 - a60Var.f35927f;
                                if (g60Var.f37977s0) {
                                    if (i13 >= 0 && i13 < arrayList.size()) {
                                        l4 = (Long) arrayList.get(i13);
                                    }
                                } else if (i13 >= 0 && i13 < g60Var.f37903a1.invitedUsers.size()) {
                                    l4 = g60Var.f37903a1.invitedUsers.get(i13);
                                }
                                z10 = false;
                            }
                        }
                        if (!z10 && (invitedUser = g60Var.f37903a1.invitedUsersMessageIds.get(l4)) != null) {
                            org.telegram.ui.Components.p80 F = org.telegram.ui.Components.p80.F(g60Var.container, g60Var.resourcesProvider, w3Var);
                            F.l(R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable(g60Var) {
                                public final g60 f44599b;

                                {
                                    this.f44599b = g60Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            g60.t(this.f44599b, invitedUser, l4);
                                            return;
                                        default:
                                            g60.o(this.f44599b, invitedUser, l4);
                                            return;
                                    }
                                }
                            }, invitedUser.isCalling());
                            F.c(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable(g60Var) {
                                public final g60 f44599b;

                                {
                                    this.f44599b = g60Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            g60.t(this.f44599b, invitedUser, l4);
                                            return;
                                        default:
                                            g60.o(this.f44599b, invitedUser, l4);
                                            return;
                                    }
                                }
                            }, false);
                            F.W(org.telegram.ui.ActionBar.h6.d0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), g60Var.C0.getColor()));
                            F.f29779s = 96;
                            F.Z();
                            return;
                        }
                        return;
                    }
                    g60Var.f37937i0.K0(g60Var.currentAccount);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", w3Var.getUser().f20215id);
                    if (w3Var.f23687a.getImageReceiver().hasNotThumb()) {
                        bundle.putBoolean("expandPhoto", true);
                    }
                    g60Var.f37937i0.p0(new ProfileActivity(bundle, null));
                    g60Var.dismiss();
                }
            } else if (i10 == a60Var.f35931w) {
                if (ChatObject.isChannel(g60Var.Z0) && (chat = g60Var.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)) {
                    g60Var.k1(false);
                    return;
                }
                TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(g60Var.j1());
                if (chatFull != null) {
                    g60Var.f37994w0 = false;
                    Context context = g60Var.getContext();
                    int currentAccount = accountInstance.getCurrentAccount();
                    TLRPC.Chat chat2 = g60Var.Z0;
                    ChatObject.Call call2 = g60Var.f37903a1;
                    org.telegram.ui.Components.j40 j40Var = new org.telegram.ui.Components.j40(context, currentAccount, chat2, chatFull, call2.participants, call2.invitedUsersMap);
                    g60Var.E1 = j40Var;
                    j40Var.setOnDismissListener(new x20(g60Var, 2));
                    org.telegram.ui.Components.j40 j40Var2 = g60Var.E1;
                    j40Var2.f27593g0 = new h30(g60Var);
                    j40Var2.show();
                }
            } else if (i10 == a60Var.f35932x) {
                ChatObject.Call call3 = g60Var.f37903a1;
                if (call3 != null && call3.call != null) {
                    tg.m1 m1Var = new tg.m1(activity, g60Var.currentAccount, null, 4, new ai.a1());
                    ChatObject.Call call4 = g60Var.f37903a1;
                    if (call4 != null) {
                        collection = (Collection) Collection.EL.stream(call4.sortedParticipants).map(new j8(4)).collect(Collectors.toSet());
                    }
                    m1Var.C0.addAll(collection);
                    m1Var.i0(false, true);
                    m1Var.A0 = new s20(g60Var, 3);
                    m1Var.i0(false, true);
                    m1Var.D0 = new ai.m0(14, g60Var, call);
                    m1Var.show();
                }
            } else if (i10 == a60Var.f35933y) {
                g60Var.w1();
            }
        }
    }

    public static void q(g60 g60Var, Activity activity) {
        LaunchActivity launchActivity = g60Var.f37937i0;
        if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
            g60Var.f37937i0.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
        } else if (VoIPService.getSharedInstance() != null) {
            boolean z10 = false;
            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                g60Var.f37941j0[0].e(1, false);
                if (g60Var.f38007z0 == null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null) {
                        sharedInstance.createCaptureDevice(false);
                    }
                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                        z10 = true;
                    }
                    s40 s40Var = new s40(g60Var, activity, z10);
                    g60Var.f38007z0 = s40Var;
                    s40Var.setBottomPadding(g60Var.containerView.getPaddingBottom());
                    g60Var.container.addView(g60Var.f38007z0);
                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                        return;
                    }
                    return;
                }
                return;
            }
            VoIPService.getSharedInstance().setVideoState(false, 0);
            g60Var.O1(true, false);
            g60Var.N1(false);
            g60Var.f37903a1.sortParticipants();
            g60Var.P0(true);
            g60Var.f37919e.requestLayout();
        }
    }

    public static boolean q1(int i10) {
        if ((VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.call.rtmp_stream) && i10 != 2 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            return false;
        }
        return true;
    }

    public static void r(g60 g60Var, float f7, float f10, float f11, int i10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        g60Var.f37917d2 = floatValue;
        g60Var.a2.f32193n = floatValue;
        float f12 = (floatValue * 1.0f) + ((1.0f - floatValue) * f7);
        b40 b40Var = g60Var.C2;
        b40Var.setScaleX(f12);
        b40Var.setScaleY(f12);
        b40Var.setTranslationX((1.0f - g60Var.f37917d2) * f10);
        b40Var.setTranslationY((1.0f - g60Var.f37917d2) * f11);
        if (!g60Var.f37931g2) {
            g60Var.W2.setAlpha((int) (g60Var.f37917d2 * 100.0f));
        }
        org.telegram.ui.Components.voip.v vVar = g60Var.Z2;
        if (vVar != null) {
            vVar.f32374a.setRoundCorners((1.0f - g60Var.f37917d2) * AndroidUtilities.dp(8.0f));
        }
        b40Var.invalidate();
        g60Var.containerView.invalidate();
        a40 a40Var = g60Var.f37905b;
        int i11 = (int) ((1.0f - g60Var.f37917d2) * i10);
        a40Var.N(i11, i11);
    }

    public static void s(g60 g60Var, ChatObject.Call call, Boolean bool, HashSet hashSet) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        ChatObject.Call call2 = g60Var.f37903a1;
        if (call2 != null && (groupCall = call2.call) != null) {
            String str = groupCall.invite_link;
            int size = hashSet.size();
            AtomicInteger atomicInteger = new AtomicInteger(0);
            HashSet hashSet2 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                g60Var.f37903a1.addInvitedUser(longValue);
                TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                inviteconferencecallparticipant.call = tL_inputGroupCall;
                TLRPC.GroupCall groupCall2 = g60Var.f37903a1.call;
                tL_inputGroupCall.f20085id = groupCall2.f20078id;
                tL_inputGroupCall.access_hash = groupCall2.access_hash;
                inviteconferencecallparticipant.user_id = MessagesController.getInstance(g60Var.currentAccount).getInputUser(longValue);
                inviteconferencecallparticipant.video = bool.booleanValue();
                ConnectionsManager.getInstance(g60Var.currentAccount).sendRequest(inviteconferencecallparticipant, new ei.b1(g60Var, longValue, hashSet2, atomicInteger, size, call, str));
            }
            g60Var.P0(true);
            if (bool.booleanValue() && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(false) != 1) {
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                sharedInstance.requestVideoCall(false);
                sharedInstance.setVideoState(false, 2);
                sharedInstance.setMicMute(false, false, true);
                sharedInstance.switchToSpeaker();
                g60Var.O1(true, true);
            }
        }
    }

    public static void t(g60 g60Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(g60Var.currentAccount).sendRequest(declineconferencecallinvite, new b30(g60Var, 1));
        ChatObject.Call call = g60Var.f37903a1;
        if (call != null) {
            invitedUser.calling = false;
            call.invitedUsersMessageIds.put(l4, invitedUser);
            g60Var.P0(true);
        }
    }

    public static void u(g60 g60Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(g60Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
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
                    alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertTitle);
                    alertDialog$Builder.f20404a.T = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertText);
                } else if (ChatObject.isChannelOrGiga(chat)) {
                    alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.VoipChannelLeaveAlertTitle);
                    alertDialog$Builder.f20404a.T = LocaleController.getString(R.string.VoipChannelLeaveAlertText);
                } else {
                    alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.VoipGroupLeaveAlertTitle);
                    alertDialog$Builder.f20404a.T = LocaleController.getString(R.string.VoipGroupLeaveAlertText);
                }
                sharedInstance.getAccount();
                org.telegram.ui.Cells.a2[] a2VarArr = new org.telegram.ui.Cells.a2[1];
                LinearLayout e7 = org.telegram.messenger.ai.e(context, 1);
                if (!sharedInstance.isConference() || (call != null && (groupCall = call.call) != null && groupCall.creator)) {
                    org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, 1);
                    a2VarArr[0] = a2Var;
                    a2Var.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                    if (z10) {
                        a2VarArr[0].setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20930j5, false));
                    } else {
                        a2VarArr[0].setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20903hg, false));
                        CheckBoxSquare checkBoxSquare = (CheckBoxSquare) a2VarArr[0].getCheckBoxView();
                        int i10 = org.telegram.ui.ActionBar.h6.f21090rg;
                        int i11 = org.telegram.ui.ActionBar.h6.f21052pg;
                        int i12 = org.telegram.ui.ActionBar.h6.f21015ng;
                        checkBoxSquare.f24141s = i10;
                        checkBoxSquare.v = i11;
                        checkBoxSquare.f24142w = i12;
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
                    e7.addView(a2VarArr[0], w7.x5.n(-1, -2));
                    a2VarArr[0].setOnClickListener(new t20(a2VarArr, 0));
                }
                alertDialog$Builder.n(e7);
                alertDialog$Builder.f20404a.I = org.telegram.ui.ActionBar.h6.f21052pg;
                alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new ci.y6(call, a2VarArr, selfId, runnable, 2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (z10) {
                    alertDialog$Builder.f20404a.P0 = false;
                }
                org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder.f20404a;
                if (z10) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        a2Var3.getWindow().setType(2038);
                    } else {
                        a2Var3.getWindow().setType(2003);
                    }
                    a2Var3.getWindow().clearFlags(2);
                }
                if (!z10) {
                    a2Var3.i(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21146ug, false));
                }
                a2Var3.show();
                if (!z10) {
                    TextView textView = (TextView) a2Var3.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21163vg, false));
                    }
                    a2Var3.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20903hg, false));
                    return;
                }
                return;
            }
            x1(call, false, selfId, runnable);
        }
    }

    public static void v(g60 g60Var) {
        g60Var.Z0();
        g60Var.W0();
        g60Var.V0();
        g60Var.F.setTranslationY((-g60Var.C1.d()) + g60Var.containerView.getPaddingBottom());
        g60Var.G.invalidate();
        g60Var.a1();
        g60Var.containerView.invalidate();
    }

    public static void w(g60 g60Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(g60Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
        }
    }

    public static void x(g60 g60Var, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(g60Var.currentAccount).lambda$processUpdates$377(updates, false);
            AndroidUtilities.runOnUIThread(new a3.h0(g60Var, updates, j3, 24));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j3));
        }
        if (atomicInteger.incrementAndGet() == i10 && !hashSet.isEmpty()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.po0(g60Var, hashSet, call, str, 8));
        }
    }

    public static void x1(ChatObject.Call call, boolean z10, long j3, Runnable runnable) {
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

    public static void y(g60 g60Var, HashSet hashSet, ChatObject.Call call, String str) {
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
            arrayList.add(MessagesController.getInstance(g60Var.currentAccount).getUser(l4));
            getrequirementstocontact.f20275id.add(MessagesController.getInstance(g60Var.currentAccount).getInputUser(longValue));
        }
        ai.n3 n3Var = new ai.n3(g60Var, arrayList, arrayList2, arrayList3, str, 29);
        if (UserConfig.getInstance(g60Var.currentAccount).isPremium()) {
            n3Var.run();
        } else {
            ConnectionsManager.getInstance(g60Var.currentAccount).sendRequest(getrequirementstocontact, new aa(arrayList, arrayList2, n3Var, 13));
        }
    }

    public static void z(g60 g60Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        rg.j0 j0Var = new rg.j0(34, g60Var.currentAccount, U.getContext(), U, new ai.a1());
        j0Var.J1(null, arrayList, arrayList2, arrayList3, str);
        j0Var.show();
    }

    public final void A1() {
        v5 v5Var = this.A2;
        AndroidUtilities.cancelRunOnUIThread(v5Var);
        if (this.f38009z2 && this.U0 != null && VoIPService.getSharedInstance() != null && s1() && this.Q != null && LiteMode.isEnabled(512)) {
            AndroidUtilities.runOnUIThread(v5Var, 30L);
        }
    }

    public final void B1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall inputGroupCall;
        long j3;
        this.H.setText("");
        ChatObject.Call call = this.f37903a1;
        if (call != null && call.call != null && (inputGroupCall = call.getInputGroupCall()) != null) {
            ChatObject.Call call2 = this.f37903a1;
            long j10 = call2.call.f20078id;
            TLRPC.Peer peer = call2.selfPeer;
            if (peer != null) {
                j3 = DialogObject.getPeerDialogId(peer);
            } else {
                j3 = UserConfig.getInstance(this.currentAccount).clientUserId;
            }
            GroupCallMessagesController.getInstance(this.currentAccount).sendCallMessage(j3, tL_textWithEntities, j10, inputGroupCall);
        }
    }

    public final void C1(float f7) {
        float f10;
        int i10;
        int i11;
        this.U1 = f7;
        y30 y30Var = this.a2;
        if (y30Var == null) {
            f10 = 0.0f;
        } else {
            f10 = y30Var.f32180c;
        }
        float max = Math.max(f7, f10);
        int i12 = org.telegram.ui.ActionBar.h6.f20940jg;
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.h6.f20885gg;
        int offsetColor = AndroidUtilities.getOffsetColor(x02, org.telegram.ui.ActionBar.h6.x0(null, i13, false), f7, 1.0f);
        this.V1 = offsetColor;
        this.N.setBackgroundColor(offsetColor);
        this.f37945k1.B(-14472653);
        this.f37925f0.setColorFilter(new PorterDuffColorFilter(this.V1, PorterDuff.Mode.MULTIPLY));
        this.navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false), org.telegram.ui.ActionBar.h6.x0(null, i13, false), max, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20960kg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21127tg, false), f7, 1.0f);
        r50 r50Var = this.f37963p0;
        if (r50Var != null) {
            r50Var.f41362j = offsetColor2;
            q50 q50Var = r50Var.f41360g;
            if (q50Var != null) {
                q50Var.invalidate();
            }
        }
        this.C0.setColor(offsetColor2);
        this.E.setColor(offsetColor2);
        this.F.invalidate();
        m50 m50Var = this.Q;
        m50Var.setGlowColor(offsetColor2);
        int i14 = this.F1;
        if (i14 == 3 || q1(i14)) {
            this.f37993w.invalidate();
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
        this.f37976s.a(offsetColor3, offsetColor3);
        int offsetColor4 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20978lg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21033og, false), f7, 1.0f);
        int offsetColor5 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20997mg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21090rg, false), f7, 1.0f);
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.resourcesProvider);
        int childCount = m50Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = m50Var.getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Cells.x3) {
                org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) childAt;
                if (p1()) {
                    x3Var.a(w02, w02);
                } else {
                    x3Var.a(offsetColor5, offsetColor4);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.e4;
                c50 c50Var = this.O;
                if (z10) {
                    org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) childAt;
                    if (c50Var.getTag() != null) {
                        i11 = org.telegram.ui.ActionBar.h6.f21090rg;
                    } else {
                        i11 = org.telegram.ui.ActionBar.h6.f20997mg;
                    }
                    e4Var.f(i11, offsetColor5);
                } else if (childAt instanceof org.telegram.ui.Cells.w3) {
                    org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) childAt;
                    if (c50Var.getTag() != null) {
                        i10 = org.telegram.ui.ActionBar.h6.f21090rg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.h6.f20997mg;
                    }
                    w3Var.a(i10, offsetColor5);
                }
            }
        }
        this.containerView.invalidate();
        m50Var.invalidate();
        this.container.invalidate();
    }

    public final void D1(float f7) {
        m50 m50Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        s4.d1 K;
        f7 = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) ? 0.0f : 0.0f;
        float min = (float) (Math.min(8500.0d, 4000.0f * f7) / 8500.0d);
        this.P0 = min;
        this.Q0 = (min - this.O0) / 265.0f;
        ChatObject.Call call = this.f37903a1;
        if (call != null && (m50Var = this.Q) != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(MessageObject.getPeerId(this.A0))) != null) {
            y30 y30Var = this.a2;
            if (!y30Var.f32178b) {
                if (this.f37977s0) {
                    arrayList = this.D0;
                } else {
                    arrayList = this.f37903a1.visibleParticipants;
                }
                int indexOf = arrayList.indexOf(groupCallParticipant);
                if (indexOf >= 0 && (K = m50Var.K(indexOf + this.P.d)) != null) {
                    View view = K.f47782a;
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        ((org.telegram.ui.Cells.e4) view).setAmplitude(f7 * 15.0f);
                        if (view == this.X2 && !this.f37949l2) {
                            this.containerView.invalidate();
                        }
                    }
                }
            } else {
                int i10 = 0;
                while (true) {
                    u30 u30Var = this.f37952m2;
                    if (i10 >= u30Var.getChildCount()) {
                        break;
                    }
                    org.telegram.ui.Components.j30 j30Var = (org.telegram.ui.Components.j30) u30Var.getChildAt(i10);
                    if (MessageObject.getPeerId(j30Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                        j30Var.setAmplitude(f7 * 15.0f);
                    }
                    i10++;
                }
            }
            y30Var.k(groupCallParticipant, f7 * 15.0f);
        }
    }

    public final void E1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        this.f37932g3 = i10;
        this.f37936h3 = i11;
        this.f37940i3 = i12;
        this.j3 = i13;
        this.f37947k3 = i14;
        this.f37950l3 = i15;
        this.f37953m3 = i16;
        this.f37958n3 = i17;
        this.f37962o3 = i18;
        this.f37966p3 = i19;
        this.f37970q3 = i20;
        this.f37975r3 = i21;
        this.f37980s3 = i22;
        this.f37984t3 = i23;
        this.f37988u3 = i24;
        this.f37992v3 = i25;
    }

    public final void F1(float f7) {
        m50 m50Var;
        int dp;
        int i10;
        float f10;
        this.f38004y0 = f7;
        this.Q.setTopGlowOffset((int) (f7 - ((FrameLayout.LayoutParams) m50Var.getLayoutParams()).topMargin));
        float dp2 = f7 - AndroidUtilities.dp(74.0f);
        int i11 = ((this.backgroundPaddingTop + dp2) > (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) ? 1 : ((this.backgroundPaddingTop + dp2) == (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) ? 0 : -1));
        v50 v50Var = this.U0;
        y30 y30Var = this.a2;
        s30 s30Var = this.f37926f1;
        q30 q30Var = this.f37921e1;
        if (i11 < 0) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) - dp2) - this.backgroundPaddingTop) / (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f))));
            if (AndroidUtilities.isTablet()) {
                f10 = 17.0f;
            } else {
                f10 = 13.0f;
            }
            i10 = (int) (AndroidUtilities.dp(f10) * min);
            if (v50Var != null) {
                v50Var.setShadowOffset((int) (AndroidUtilities.dp(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.U1) > 1.0E-4f) {
                C1(Math.min(1.0f, min));
            }
            float f11 = 1.0f - ((0.1f * min) * 1.2f);
            q30Var.setScaleX(Math.max(0.9f, f11));
            q30Var.setScaleY(Math.max(0.9f, f11));
            float f12 = 1.0f - (min * 1.2f);
            q30Var.setAlpha((1.0f - y30Var.f32180c) * Math.max(0.0f, f12));
            s30Var.setScaleX(Math.max(0.9f, f11));
            s30Var.setScaleY(Math.max(0.9f, f11));
            s30Var.setAlpha((1.0f - y30Var.f32180c) * Math.max(0.0f, f12));
        } else {
            q30Var.setScaleX(1.0f);
            q30Var.setScaleY(1.0f);
            q30Var.setAlpha(1.0f - y30Var.f32180c);
            s30Var.setScaleX(1.0f);
            s30Var.setScaleY(1.0f);
            s30Var.setAlpha(1.0f - y30Var.f32180c);
            if (this.U1 > 1.0E-4f) {
                C1(0.0f);
            }
            i10 = 0;
        }
        Z0();
        float f13 = i10;
        this.f38008z1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(53.0f)) - f13));
        this.f37942j1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f13));
        if (v50Var != null) {
            v50Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), f7 - AndroidUtilities.dp(37.0f)));
        }
        p40 p40Var = this.R;
        if (p40Var != null) {
            p40Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f13));
        }
        this.containerView.invalidate();
        R1();
    }

    public final boolean G1(android.view.View r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g60.G1(android.view.View):boolean");
    }

    public final void H1(View view) {
        if (this.m0 == null) {
            org.telegram.ui.Components.a50 a50Var = new org.telegram.ui.Components.a50(8, getContext(), null, true);
            this.m0 = a50Var;
            a50Var.setAlpha(0.0f);
            this.m0.setVisibility(4);
            this.m0.setShowingDuration(3000L);
            this.containerView.addView(this.m0, w7.x5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
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
        ChatObject.Call call = this.f37903a1;
        org.telegram.ui.Components.voip.w2 w2Var = this.v;
        org.telegram.ui.Components.voip.w2 w2Var2 = this.h;
        org.telegram.ui.Components.voip.w2 w2Var3 = this.f37971r;
        org.telegram.ui.Components.voip.w2 w2Var4 = this.f37924f;
        org.telegram.ui.Components.voip.w2 w2Var5 = this.f37954n;
        org.telegram.ui.Components.voip.w2 w2Var6 = this.f37976s;
        org.telegram.ui.Components.voip.w2 w2Var7 = this.f37993w;
        boolean z19 = true;
        l30 l30Var = this.f37919e;
        boolean z20 = false;
        if (call != null && !call.isScheduled()) {
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f37903a1.participants.f(MessageObject.getPeerId(this.A0));
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !R0()) {
                z14 = true;
            } else {
                z14 = false;
            }
            Boolean bool = this.f38002x3;
            if (bool != null) {
                z15 = bool.booleanValue();
            } else {
                TLRPC.GroupCall groupCall = this.f37903a1.call;
                if (groupCall != null && groupCall.messages_enabled) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            if (((!z14 && this.f37903a1.canRecordVideo()) || z13) && !s1()) {
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
            l30Var.c(w2Var7, true, z10);
            l30Var.c(w2Var6, true, z10);
            l30Var.c(w2Var5, z16, z10);
            l30Var.c(w2Var4, z18, z10);
            l30Var.c(w2Var3, z20, z10);
            l30Var.c(w2Var2, z17, z10);
            l30Var.c(w2Var, z15, z10);
            return;
        }
        if (this.V0 > 0.1f) {
            z11 = true;
        } else {
            z11 = false;
        }
        l30Var.c(w2Var7, z11, z10);
        if (this.V0 > 0.1f) {
            z12 = true;
        } else {
            z12 = false;
        }
        l30Var.c(w2Var6, z12, z10);
        if (this.V0 <= 0.1f) {
            z19 = false;
        }
        l30Var.c(w2Var3, z19, z10);
        l30Var.c(w2Var5, false, z10);
        l30Var.c(w2Var4, false, z10);
        l30Var.c(w2Var2, false, z10);
        l30Var.c(w2Var, false, z10);
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
        ChatObject.Call call2 = this.f37903a1;
        org.telegram.ui.ActionBar.u0 u0Var = this.f37945k1;
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f37951m1;
        if (call2 == null || call2.isScheduled()) {
            this.l1.setVisibility(4);
            u0Var2.setVisibility(8);
            if (this.f37903a1 == null) {
                u0Var.setVisibility(8);
                return;
            }
        }
        if (this.f37948l0) {
            return;
        }
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat4 = accountInstance.getMessagesController().getChat(Long.valueOf(j1()));
        if (chat4 != null) {
            this.Z0 = chat4;
        }
        boolean canUserDoAdminAction = ChatObject.canUserDoAdminAction(this.Z0, 3);
        org.telegram.ui.ActionBar.e1 e1Var = this.f37956n1;
        if (!canUserDoAdminAction && (((ChatObject.isChannel(this.Z0) && ((chat3 = this.Z0) == null || !chat3.megagroup)) || (!ChatObject.isPublic(this.Z0) && !ChatObject.canUserDoAdminAction(this.Z0, 3))) && (!ChatObject.isChannel(this.Z0) || (chat2 = this.Z0) == null || chat2.megagroup || !ChatObject.isPublic(chat2)))) {
            e1Var.setVisibility(8);
        } else {
            e1Var.setVisibility(0);
        }
        ChatObject.Call call3 = this.f37903a1;
        org.telegram.ui.ActionBar.e1 e1Var2 = this.f38005y1;
        org.telegram.ui.ActionBar.e1 e1Var3 = this.f38000x1;
        if (call3 != null && (groupCall2 = call3.call) != null && groupCall2.can_change_messages_enabled) {
            if (groupCall2.messages_enabled) {
                i13 = 8;
            } else {
                i13 = 0;
            }
            e1Var3.setVisibility(i13);
            if (this.f37903a1.call.messages_enabled) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            e1Var2.setVisibility(i14);
        } else {
            e1Var3.setVisibility(8);
            e1Var2.setVisibility(8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f37903a1.participants.f(MessageObject.getPeerId(this.A0));
        ChatObject.Call call4 = this.f37903a1;
        org.telegram.ui.ActionBar.e1 e1Var4 = this.f37968q1;
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
        org.telegram.ui.ActionBar.e1 e1Var5 = this.f37995w1;
        org.telegram.ui.ActionBar.e1 e1Var6 = this.f37960o1;
        boolean z12 = true;
        org.telegram.ui.ActionBar.e1 e1Var7 = this.f37978s1;
        org.telegram.ui.ActionBar.e1 e1Var8 = this.f37982t1;
        if (R0) {
            e1Var5.setVisibility(0);
            e1Var6.setVisibility(0);
            if (s1()) {
                e1Var7.setVisibility(0);
                e1Var8.setVisibility(8);
            } else if (this.f37903a1.isScheduled()) {
                e1Var7.setVisibility(8);
                e1Var8.setVisibility(8);
            } else {
                e1Var7.setVisibility(0);
            }
            if (p1()) {
                e1Var7.setVisibility(8);
                e1Var6.setVisibility(8);
            }
            if (this.f37903a1.canRecordVideo() && !this.f37903a1.isScheduled() && !s1()) {
                e1Var8.setVisibility(0);
            } else {
                e1Var8.setVisibility(8);
            }
            u0Var2.setVisibility(8);
            boolean z13 = this.f37903a1.recording;
            b60 b60Var = this.f37916d1;
            b60Var.f36317f = z13;
            b60Var.d = 1.0f;
            b60Var.invalidateSelf();
            if (this.f37903a1.recording) {
                if (this.D1 == null) {
                    s20 s20Var = new s20(this, 6);
                    this.D1 = s20Var;
                    AndroidUtilities.runOnUIThread(s20Var, 1000L);
                }
                e1Var7.setText(LocaleController.getString(R.string.VoipGroupStopRecordCall));
            } else {
                s20 s20Var2 = this.D1;
                if (s20Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(s20Var2);
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
            if (!z10 && ((this.f37903a1.canRecordVideo() || z11) && !this.f37903a1.isScheduled() && !s1())) {
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
        org.telegram.ui.ActionBar.e1 e1Var9 = this.f37973r1;
        if (R02 && this.f37903a1.call.can_change_join_muted && !p1()) {
            e1Var9.setVisibility(0);
        } else {
            e1Var9.setVisibility(8);
        }
        if (p1() && ((call = this.f37903a1) == null || (groupCall = call.call) == null || !groupCall.creator)) {
            z12 = false;
        }
        u0Var.I(4, z12);
        if (s1() && !this.f37903a1.isScheduled()) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        this.f37964p1.setVisibility(i12);
        int visibility = e1Var6.getVisibility();
        TextView textView = this.A1;
        if (visibility != 0 && e1Var9.getVisibility() != 0 && e1Var.getVisibility() != 0 && e1Var8.getVisibility() != 0 && e1Var7.getVisibility() != 0 && e1Var5.getVisibility() != 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.f37944k0;
        if (((sharedInstance != null && VoIPService.getSharedInstance().hasFewPeers) || this.f37907b1) && !s1() && this.A0 != null) {
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
        LinearLayout linearLayout = this.f37942j1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f7 = 96;
        if (layoutParams.rightMargin != AndroidUtilities.dp(f7)) {
            layoutParams.rightMargin = AndroidUtilities.dp(f7);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.f38008z1.getLayoutParams()).rightMargin = 0;
        this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
    }

    public final void K1(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g60.K1(int, boolean):void");
    }

    public final void L1() {
        if (this.f37903a1 == null) {
            return;
        }
        int currentTime = this.d.getConnectionsManager().getCurrentTime();
        ChatObject.Call call = this.f37903a1;
        int i10 = currentTime - call.call.record_start_date;
        boolean z10 = call.recording;
        org.telegram.ui.ActionBar.e1 e1Var = this.f37978s1;
        if (z10) {
            e1Var.setSubtext(AndroidUtilities.formatDuration(i10, false));
        } else {
            e1Var.setSubtext(null);
        }
    }

    public final void M1(boolean z10) {
        float interpolation;
        float f7;
        p40 p40Var = this.R;
        if ((p40Var == null || this.f37903a1 != null) && this.X0 == null) {
            this.W0 = 1.0f;
            this.V0 = 1.0f;
            if (p40Var == null) {
                return;
            }
        }
        int i10 = 4;
        if (!z10) {
            p30 p30Var = this.f37996w2;
            AndroidUtilities.cancelRunOnUIThread(p30Var);
            p30Var.run();
            ChatObject.Call call = this.f37903a1;
            m50 m50Var = this.Q;
            if (call != null && !call.isScheduled()) {
                m50Var.setVisibility(0);
            } else {
                m50Var.setVisibility(4);
            }
            boolean isChannelOrGiga = ChatObject.isChannelOrGiga(this.Z0);
            org.telegram.ui.ActionBar.e1 e1Var = this.f37995w1;
            if (isChannelOrGiga) {
                e1Var.setText(LocaleController.getString(R.string.VoipChannelCancelChat));
            } else {
                e1Var.setText(LocaleController.getString(R.string.VoipGroupCancelChat));
            }
        }
        float f10 = this.V0;
        if (f10 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.is.f27500f.getInterpolation((f10 - 0.6f) / 0.4f) * 0.05f);
            this.W0 = 1.0f;
            f7 = 1.0f;
        } else {
            org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.f27500f;
            this.W0 = isVar.getInterpolation(f10 / 0.6f);
            interpolation = 1.05f * isVar.getInterpolation(this.V0 / 0.6f);
            f7 = this.V0 / 0.6f;
        }
        I1(true);
        float f11 = 1.0f - f7;
        p40Var.setAlpha(f11);
        this.U.setAlpha(f7);
        this.W.setAlpha(f7);
        l50 l50Var = this.V;
        l50Var.setAlpha(f7);
        l50Var.setScaleX(interpolation);
        l50Var.setScaleY(interpolation);
        n40 n40Var = this.T;
        n40Var.setScaleX(f11);
        n40Var.setScaleY(f11);
        n40Var.setAlpha(f11);
        this.S.setAlpha(f11);
        this.f37945k1.setAlpha(f7);
        if (f11 != 0.0f) {
            i10 = 0;
        }
        if (i10 != p40Var.getVisibility()) {
            p40Var.setVisibility(i10);
            n40Var.setVisibility(i10);
        }
    }

    public final void N1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        org.telegram.ui.Components.voip.w2 w2Var = this.f37971r;
        if (w2Var != null && w2Var.getVisibility() == 0) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            l30 l30Var = this.f37919e;
            boolean z14 = false;
            if (sharedInstance != null && !s1()) {
                kh.a aVar = (kh.a) l30Var.f14873c.get(w2Var);
                if (aVar != null) {
                    aVar.d.a(true, z10);
                    w2Var.setEnabled(true);
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
                    w2Var.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z10);
                } else if (z13) {
                    w2Var.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
                } else if (sharedInstance.isHeadsetPlugged()) {
                    w2Var.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z10);
                } else {
                    w2Var.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
                }
                w2Var.b(z13, z10);
                i1();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.isBluetoothHeadsetConnected()) {
                    i10 = R.drawable.filled_calls_bluetooth_s;
                } else {
                    i10 = R.drawable.filled_sound_on;
                }
                if (this.f37902a0 != i10) {
                    this.f37902a0 = i10;
                    AndroidUtilities.updateImageViewImageAnimated(this.f37906b0, i10);
                }
                org.telegram.ui.Components.voip.w2 w2Var2 = this.h;
                if (w2Var2.getVisibility() == 0) {
                    w2Var2.c(0, -1, 0, 1.0f, true, g1(i1()), false, z10);
                    if (i1() != 1) {
                        z14 = true;
                    }
                    w2Var2.b(z14, z10);
                    return;
                }
                return;
            }
            w2Var.c(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipChatShare), false, z10);
            if (!ChatObject.isPublic(this.Z0) && (!ChatObject.hasAdminRights(this.Z0) || !ChatObject.canAddUsers(this.Z0))) {
                z11 = false;
            } else {
                z11 = true;
            }
            kh.a aVar2 = (kh.a) l30Var.f14873c.get(w2Var);
            if (aVar2 != null) {
                aVar2.d.a(z11, z10);
                w2Var.setEnabled(z11);
            }
            w2Var.b(true, false);
        }
    }

    public final void O1(boolean r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g60.O1(boolean, boolean):void");
    }

    public final void P0(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g60.P0(boolean):void");
    }

    public final void P1() {
        boolean z10;
        String str;
        float f7;
        float f10;
        e60 e60Var;
        TLRPC.User user;
        TLRPC.Chat chat;
        c50 c50Var = this.O;
        if (c50Var != null && this.f37903a1 != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            int i10 = 0;
            for (int i11 = 0; i11 < this.f37903a1.currentSpeakingPeers.m(); i11++) {
                long j3 = this.f37903a1.currentSpeakingPeers.j(i11);
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f37903a1.currentSpeakingPeers.f(j3);
                if (!groupCallParticipant.self) {
                    y30 y30Var = this.a2;
                    y30Var.getClass();
                    if (y30Var.f32205w.get(MessageObject.getPeerId(groupCallParticipant.peer)) <= 0 && this.B2.get(j3, 0) != 1) {
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
                                    spannableStringBuilder.append(UserObject.getFirstName(user), new org.telegram.ui.Components.n61(AndroidUtilities.bold()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.n61(AndroidUtilities.bold()), 0);
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
                c50Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.h5 subtitleTextView = c50Var.getSubtitleTextView();
            if (s1()) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            int i13 = this.f37903a1.call.participants_count;
            a60 a60Var = this.P;
            subtitleTextView.k(LocaleController.formatPluralString(str, i13 + ((a60Var.M.s1() || a60Var.L || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined()), new Object[0]));
            if (s1() && (e60Var = this.B1) != null) {
                e60Var.setWatchersCount(this.f37903a1.call.participants_count);
            }
            if (z10 != this.f37987u2) {
                this.f37987u2 = z10;
                c50Var.invalidate();
                float f11 = 0.0f;
                c50Var.getSubtitleTextView().setPivotX(0.0f);
                c50Var.getSubtitleTextView().setPivotY(c50Var.getMeasuredHeight() >> 1);
                ViewPropertyAnimator animate = c50Var.getSubtitleTextView().animate();
                if (this.f37987u2) {
                    f7 = 0.98f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f7);
                if (this.f37987u2) {
                    f10 = 0.9f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f10);
                if (!this.f37987u2) {
                    f11 = 1.0f;
                }
                scaleY.alpha(f11).setDuration(150L);
                AndroidUtilities.updateViewVisibilityAnimated(c50Var.getAdditionalSubtitleTextView(), this.f37987u2);
            }
        }
    }

    public final int Q0() {
        m50 m50Var = this.Q;
        int childCount = m50Var.getChildCount();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = m50Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0) {
                i10 = Math.min(i10, childAt.getTop());
            }
        }
        return i10;
    }

    public final void Q1(boolean z10) {
        ChatObject.Call call = this.f37903a1;
        q30 q30Var = this.f37921e1;
        if (call == null) {
            if (ChatObject.isChannelOrGiga(this.Z0)) {
                q30Var.b(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), z10);
                return;
            } else {
                q30Var.b(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), z10);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(call.call.title);
        c50 c50Var = this.O;
        if (!isEmpty) {
            if (!this.f37903a1.call.title.equals(c50Var.getTitle())) {
                if (z10) {
                    this.O.J(this.f37903a1.call.title, true, 180L, null);
                    c50Var.getTitleTextView().setOnClickListener(new q20(this, 8));
                } else {
                    c50Var.setTitle(this.f37903a1.call.title);
                }
                q30Var.b(this.f37903a1.call.title, z10);
            }
        } else {
            TLRPC.Chat chat = this.Z0;
            if (chat != null && !chat.title.equals(c50Var.getTitle())) {
                if (z10) {
                    this.O.J(this.Z0.title, true, 180L, null);
                    c50Var.getTitleTextView().setOnClickListener(new q20(this, 9));
                } else {
                    c50Var.setTitle(this.Z0.title);
                }
                if (ChatObject.isChannelOrGiga(this.Z0)) {
                    if (s1()) {
                        q30Var.b(this.Z0.title, z10);
                    } else {
                        q30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), z10);
                    }
                } else {
                    q30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), z10);
                }
            } else if (this.Z0 == null) {
                c50Var.setTitle(LocaleController.getString(R.string.ConferenceChat));
                q30Var.b(LocaleController.getString(R.string.ConferenceChat), z10);
            }
        }
        org.telegram.ui.ActionBar.h5 titleTextView = c50Var.getTitleTextView();
        if (this.f37903a1.recording) {
            if (titleTextView.getRightDrawable() == null) {
                titleTextView.i(new c60(titleTextView));
                TextView textView = q30Var.getTextView();
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new c60(textView), (Drawable) null);
                TextView nextTextView = q30Var.getNextTextView();
                nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new c60(nextTextView), (Drawable) null);
            }
        } else if (titleTextView.getRightDrawable() != null) {
            titleTextView.i(null);
            q30Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            q30Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final boolean R0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            ChatObject.Call call = this.f37903a1;
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
            float f10 = this.f38004y0 - dp;
            if (this.backgroundPaddingTop + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                int dp2 = (dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f);
                f7 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - this.backgroundPaddingTop) / dp2);
                f10 -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp2) * f7);
            } else {
                f7 = 0.0f;
            }
            float paddingTop = f10 + this.containerView.getPaddingTop();
            FrameLayout frameLayout = this.topBulletinContainer;
            c50 c50Var = this.O;
            frameLayout.setTranslationY(AndroidUtilities.lerp(((-frameLayout.getTop()) - this.topBulletinContainer.getHeight()) + paddingTop + AndroidUtilities.dp(10.0f), c50Var.getY() + (-this.topBulletinContainer.getTop()) + c50Var.getHeight(), f7));
            org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.f30825w;
            if (scVar != null && (wbVar = scVar.f30829e) != null && wbVar.getParent() != null && wbVar.getParent().getParent() == this.topBulletinContainer) {
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
            AndroidUtilities.cancelRunOnUIThread(this.f38006y2);
        }
        if (this.S1) {
            this.S1 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.f37993w.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void T0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g60.T0():void");
    }

    public final void U0() {
        this.F.setTranslationY((-this.C1.d()) + this.containerView.getPaddingBottom());
        this.G.invalidate();
        a1();
        Z0();
        X0();
        Y0();
        b1();
        this.f37919e.setAlpha(1.0f - this.f38010z3.f16401e);
        V0();
        W0();
    }

    public final void V0() {
        int i10;
        float f7 = this.C1.f45941b.f16429a;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        j40 j40Var = this.F;
        j40Var.setAlpha(f7);
        i40 i40Var = this.G;
        i40Var.setAlpha(f7);
        if (j40Var.getVisibility() != i10) {
            j40Var.setVisibility(i10);
            i40Var.setVisibility(i10);
            if (i10 == 8) {
                g40 g40Var = this.H;
                if (g40Var.isFocused()) {
                    g40Var.clearFocus();
                }
            }
        }
    }

    public final void W0() {
        int i10;
        org.telegram.ui.Components.ll0 ll0Var = this.K;
        if (ll0Var != null) {
            float f7 = this.C1.f45941b.f16429a * this.A3.f16401e;
            ll0Var.setAlpha(f7);
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
            org.telegram.ui.Components.ll0 ll0Var2 = this.K;
            if (!ll0Var2.N0 && f7 == 1.0f) {
                ll0Var2.N0 = true;
            }
        }
    }

    public final void X0() {
        boolean z10 = G3;
        l30 l30Var = this.f37919e;
        if (z10) {
            l30Var.setTranslationX(0.0f);
            l30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        me.b bVar = this.f38010z3;
        if (z11) {
            l30Var.setTranslationX(bVar.f16401e * AndroidUtilities.dp(94.0f));
            l30Var.setTranslationY(0.0f);
            return;
        }
        l30Var.setTranslationX(0.0f);
        l30Var.setTranslationY(bVar.f16401e * AndroidUtilities.dp(94.0f));
    }

    public final void Y0() {
        boolean z10 = G3;
        u30 u30Var = this.f37952m2;
        if (z10) {
            u30Var.setTranslationX(0.0f);
            u30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        me.b bVar = this.f38010z3;
        if (z11) {
            u30Var.setTranslationX(bVar.f16401e * AndroidUtilities.dp(94.0f));
            u30Var.setTranslationY(0.0f);
            return;
        }
        u30Var.setTranslationX(0.0f);
        u30Var.setTranslationY(bVar.f16401e * AndroidUtilities.dp(94.0f));
    }

    public final void Z0() {
        float dp;
        float f7 = this.B3.f16409e;
        ph.i iVar = this.C1;
        float f10 = -((iVar.d() - this.containerView.getPaddingBottom()) + f7 + (AndroidUtilities.dp(68.0f) * this.A3.f16401e) + AndroidUtilities.dp(10.0f));
        if (G3) {
            dp = (1.0f - this.C3.f16401e) * AndroidUtilities.dp(-91.0f);
        } else if (F3) {
            dp = 0.0f;
        } else {
            dp = ((this.f38010z3.f16401e * AndroidUtilities.dp(94.0f)) - (AndroidUtilities.dp(104.0f) * this.a2.f32180c)) - AndroidUtilities.dp(91.0f);
        }
        float lerp = AndroidUtilities.lerp(dp, f10, iVar.f45941b.f16429a);
        float measuredHeight = ((this.containerView.getMeasuredHeight() - this.f38004y0) + lerp) - this.backgroundPaddingTop;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - AndroidUtilities.dp(250.0f));
        lh.h hVar = this.f37911c0;
        hVar.setTranslationY(lerp);
        hVar.setVisibleHeight((int) max);
    }

    public final void a1() {
        if (this.K != null) {
            this.K.setTranslationY((-this.C1.d()) + this.containerView.getPaddingBottom() + ((-this.A3.f16401e) * AndroidUtilities.dp(64.0f)));
        }
    }

    public final void b1() {
        boolean z10;
        float f7 = this.A3.f16401e;
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
        org.telegram.ui.Components.voip.v vVar = this.Z2;
        if (vVar != null) {
            vVar.f32374a.setRoundCorners(AndroidUtilities.dp(8.0f));
            org.telegram.ui.Components.voip.v vVar2 = this.Z2;
            vVar2.h = false;
            vVar2.j(false);
            this.Z2.invalidate();
            this.a2.invalidate();
        }
        org.telegram.ui.Cells.e4 e4Var = this.X2;
        if (e4Var != null && !this.f37909b3 && e4Var.getParent() != null) {
            this.containerView.removeView(this.X2);
        }
        org.telegram.ui.Cells.e4 e4Var2 = this.X2;
        if (e4Var2 != null) {
            e4Var2.setProgressToAvatarPreview(0.0f);
            this.X2.setAboutVisible(false);
            this.X2.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.j30 j30Var = this.f37904a3;
        if (j30Var != null) {
            j30Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.X2 = null;
        this.Y2 = null;
        this.f37904a3 = null;
        this.Z2 = null;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return !this.a2.f32178b;
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
        m50 m50Var = this.Q;
        int i19 = 0;
        if (i10 == i18) {
            Long l4 = (Long) objArr[1];
            ChatObject.Call call = this.f37903a1;
            if (call != null && call.call.f20078id == l4.longValue()) {
                ChatObject.Call call2 = this.f37903a1;
                if (call2.call instanceof TLRPC.TL_groupCallDiscarded) {
                    dismiss();
                    return;
                }
                int i20 = (this.f37981t0 > 0L ? 1 : (this.f37981t0 == 0L ? 0 : -1));
                AccountInstance accountInstance = this.d;
                if (i20 == 0 && (((i17 = this.F1) == 7 || i17 == 5 || i17 == 6) && !call2.isScheduled())) {
                    try {
                        Intent intent = new Intent(this.f37937i0, VoIPService.class);
                        intent.putExtra("chat_id", j1());
                        intent.putExtra("createGroupCall", false);
                        intent.putExtra("hasFewPeers", this.f37907b1);
                        intent.putExtra("peerChannelId", this.Y0.channel_id);
                        intent.putExtra("peerChatId", this.Y0.chat_id);
                        intent.putExtra("peerUserId", this.Y0.user_id);
                        intent.putExtra("hash", this.f37912c1);
                        intent.putExtra("peerAccessHash", this.Y0.access_hash);
                        intent.putExtra("is_outgoing", true);
                        intent.putExtra("start_incall_activity", false);
                        intent.putExtra("account", accountInstance.getCurrentAccount());
                        intent.putExtra("scheduleDate", this.f37946k2);
                        this.f37937i0.startService(intent);
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                    }
                    this.f37981t0 = SystemClock.elapsedRealtime();
                    AndroidUtilities.runOnUIThread(new s20(this, 2), 3000L);
                }
                if (!this.f37985u0 && VoIPService.getSharedInstance() != null) {
                    this.f37903a1.addSelfDummyParticipant(false);
                    m1();
                    VoIPService.getSharedInstance().playConnectedSound();
                }
                J1();
                int childCount = m50Var.getChildCount();
                for (int i21 = 0; i21 < childCount; i21++) {
                    View childAt = m50Var.getChildAt(i21);
                    if (childAt instanceof org.telegram.ui.Cells.e4) {
                        ((org.telegram.ui.Cells.e4) childAt).a(true, false);
                    }
                }
                if (this.X2 != null) {
                    this.f37977s0 = true;
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
                                        if (dialog.f20072id == longValue) {
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
                                    if (this.f37903a1.call.participants_count < 250 || UserObject.isContact(user) || user.verified || i19 != 0) {
                                        l1().k(0L, 44, user, this.Z0, null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(-longValue));
                            if (chat != null) {
                                if (this.f37903a1.call.participants_count < 250 || !ChatObject.isNotInChat(chat) || chat.verified || i19 != 0) {
                                    l1().k(0L, 44, chat, this.Z0, null, null);
                                }
                            }
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.groupCallSpeakingUsersUpdated) {
            y30 y30Var = this.a2;
            if (y30Var.f32178b && this.f37903a1 != null) {
                boolean c10 = y30Var.c();
                ChatObject.Call call3 = this.f37903a1;
                if (call3 != null && y30Var.f32178b && (videoParticipant = y30Var.f32183e) != null && call3.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer)) == null) {
                    c10 = true;
                }
                if (c10) {
                    ChatObject.VideoParticipant videoParticipant2 = null;
                    int i23 = 0;
                    while (true) {
                        ArrayList arrayList = this.f37967q0;
                        if (i23 >= arrayList.size()) {
                            break;
                        }
                        ChatObject.VideoParticipant videoParticipant3 = (ChatObject.VideoParticipant) arrayList.get(i23);
                        if (this.f37903a1.currentSpeakingPeers.g(null, MessageObject.getPeerId(videoParticipant3.participant.peer)) != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = videoParticipant3.participant;
                            if (!groupCallParticipant3.muted_by_you && y30Var.d != MessageObject.getPeerId(groupCallParticipant3.peer)) {
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
            y30Var.setVisibleParticipant(true);
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
                M.j(new x20(this, 1));
                try {
                    M.o();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        } else if (i10 == NotificationCenter.didEndCall) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f20069id == j1()) {
                J1();
                O1(isShowing(), false);
            }
            long peerId = MessageObject.getPeerId(this.A0);
            ChatObject.Call call4 = this.f37903a1;
            if (call4 != null && chatFull.f20069id == (-peerId) && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) call4.participants.f(peerId)) != null) {
                groupCallParticipant2.about = chatFull.about;
                P0(true);
                AndroidUtilities.updateVisibleRows(m50Var);
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
            int childCount2 = m50Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i19 < childCount2) {
                s4.d1 G = m50Var.G(m50Var.getChildAt(i19));
                if (G != null) {
                    View view = G.f47782a;
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
            if (this.f37903a1 != null && peerId2 == l11.longValue() && (groupCallParticipant = (TLRPC.GroupCallParticipant) this.f37903a1.participants.f(peerId2)) != null) {
                groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
                P0(true);
                AndroidUtilities.updateVisibleRows(m50Var);
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
            AndroidUtilities.updateVisibleRows(m50Var);
        } else if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0) {
                P0(true);
            }
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (intValue & MessagesController.UPDATE_MASK_EMOJI_STATUS) != 0) {
                AndroidUtilities.updateVisibleRows(m50Var);
            }
        } else if (i10 == NotificationCenter.groupCallScreencastStateChanged) {
            s40 s40Var = this.f38007z0;
            if (s40Var != null) {
                s40Var.b(true, true);
            }
            J1();
        } else if (i10 == NotificationCenter.conferenceEmojiUpdated) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            r50 r50Var = this.f37963p0;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            r50Var.b(strArr);
        }
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity = this.f37937i0;
        launchActivity.f33840a1.remove(this.f37991v2);
        this.f37937i0.setRequestedOrientation(-1);
        E3 = false;
        org.telegram.ui.Components.j40 j40Var = this.E1;
        if (j40Var != null) {
            j40Var.dismiss();
        }
        this.f37977s0 = true;
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
        y30 y30Var = this.a2;
        if (y30Var != null) {
            if (this.f37969q2 != null) {
                this.Q.getViewTreeObserver().removeOnPreDrawListener(this.f37969q2);
                this.f37969q2 = null;
            }
            ArrayList arrayList = this.Z1;
            arrayList.clear();
            ArrayList arrayList2 = this.Y1;
            arrayList.addAll(arrayList2);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.v) arrayList.get(i10)).f();
                y30Var.removeView((View) arrayList.get(i10));
                ((org.telegram.ui.Components.voip.v) arrayList.get(i10)).e();
                ((org.telegram.ui.Components.voip.v) arrayList.get(i10)).b(true);
            }
            arrayList2.clear();
            if (y30Var.getParent() != null) {
                arrayList2.clear();
                this.containerView.removeView(y30Var);
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
        org.telegram.ui.Components.r30.j(getContext());
        ChatObject.Call call = this.f37903a1;
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
        if (this.f37937i0 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.f37937i0.getSystemService("audio");
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
        if (!this.f37914c3 && this.f37927f2) {
            if (z10) {
                this.f37914c3 = true;
                z1(false, this.X2);
                return;
            }
            c1();
            this.containerView.removeView(this.f37922e2);
            this.f37922e2 = null;
            this.C2.setVisibility(8);
            this.containerView.invalidate();
            this.f37927f2 = false;
            this.Y.X = true;
            this.Q.invalidate();
            this.f37908b2.setVisibility(8);
            if (this.f37977s0) {
                this.f37977s0 = false;
                P0(true);
            }
            T0();
        }
    }

    public final void f1(ChatObject.VideoParticipant videoParticipant) {
        ChatObject.VideoParticipant videoParticipant2;
        if (videoParticipant == null) {
            this.f37937i0.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            y30 y30Var = this.a2;
            if (y30Var.f32198r != null) {
                return;
            }
            boolean z10 = G3;
            m50 m50Var = this.Q;
            int i10 = 0;
            if (z10) {
                if (this.f37969q2 != null) {
                    m50Var.getViewTreeObserver().removeOnPreDrawListener(this.f37969q2);
                    this.f37969q2 = null;
                }
                ArrayList arrayList = new ArrayList();
                l60 l60Var = this.f37961o2;
                ArrayList arrayList2 = this.Y1;
                ArrayList arrayList3 = this.Z1;
                if (videoParticipant == null) {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        org.telegram.ui.Components.voip.v vVar = (org.telegram.ui.Components.voip.v) arrayList3.get(i11);
                        org.telegram.ui.Components.voip.m mVar = vVar.f32378c;
                        if (mVar != null) {
                            mVar.setRenderer(null);
                            org.telegram.ui.Components.j30 j30Var = vVar.d;
                            if (j30Var != null) {
                                j30Var.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.m mVar2 = vVar.f32381e;
                            if (mVar2 != null) {
                                mVar2.setRenderer(null);
                            }
                            arrayList.add(vVar.f32403w);
                            vVar.b(false);
                            vVar.animate().alpha(0.0f).setListener(new t40(this, vVar));
                        }
                    }
                    this.P2 = false;
                    l60Var.H(this.f37957n2, true, true);
                } else {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        org.telegram.ui.Components.voip.v vVar2 = (org.telegram.ui.Components.voip.v) arrayList3.get(i12);
                        if (vVar2.f32381e != null && ((videoParticipant2 = vVar2.f32403w) == null || !videoParticipant2.equals(videoParticipant))) {
                            arrayList.add(vVar2.f32403w);
                            vVar2.b(false);
                            org.telegram.ui.Components.j30 j30Var2 = vVar2.d;
                            if (j30Var2 != null) {
                                j30Var2.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.m mVar3 = vVar2.f32378c;
                            if (mVar3 != null) {
                                mVar3.setRenderer(null);
                            }
                            vVar2.animate().alpha(0.0f).setListener(new u40(this, vVar2));
                        }
                    }
                    this.P2 = true;
                    l60Var.f39559r = false;
                    if (!arrayList.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.i(25, this, arrayList));
                    }
                }
                ViewTreeObserver viewTreeObserver = m50Var.getViewTreeObserver();
                w40 w40Var = new w40(this, videoParticipant, !y30Var.f32178b);
                this.f37969q2 = w40Var;
                viewTreeObserver.addOnPreDrawListener(w40Var);
                return;
            }
            if (this.f37969q2 != null) {
                m50Var.getViewTreeObserver().removeOnPreDrawListener(this.f37969q2);
                this.f37969q2 = null;
            }
            if (videoParticipant != null) {
                u30 u30Var = this.f37952m2;
                if (u30Var.getVisibility() != 0) {
                    u30Var.setVisibility(0);
                    org.telegram.ui.Components.k30 k30Var = this.f37965p2;
                    k30Var.G(u30Var, false);
                    this.f37977s0 = true;
                    if (!y30Var.f32178b) {
                        ArrayList arrayList4 = k30Var.f27932e;
                        s4.d0 d0Var = (s4.d0) u30Var.getLayoutManager();
                        if (d0Var != null) {
                            while (true) {
                                if (i10 >= arrayList4.size()) {
                                    break;
                                } else if (((ChatObject.VideoParticipant) arrayList4.get(i10)).equals(videoParticipant)) {
                                    d0Var.h1(i10, AndroidUtilities.dp(13.0f));
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                    ViewTreeObserver viewTreeObserver2 = m50Var.getViewTreeObserver();
                    x40 x40Var = new x40(this, videoParticipant);
                    this.f37969q2 = x40Var;
                    viewTreeObserver2.addOnPreDrawListener(x40Var);
                    return;
                }
                y30Var.j(videoParticipant);
                AndroidUtilities.updateVisibleRows(u30Var);
            } else if (m50Var.getVisibility() != 0) {
                m50Var.setVisibility(0);
                P0(false);
                this.f37977s0 = true;
                ViewTreeObserver viewTreeObserver3 = m50Var.getViewTreeObserver();
                y40 y40Var = new y40(this);
                this.f37969q2 = y40Var;
                viewTreeObserver3.addOnPreDrawListener(y40Var);
            } else {
                ViewTreeObserver viewTreeObserver4 = m50Var.getViewTreeObserver();
                z40 z40Var = new z40(this);
                this.f37969q2 = z40Var;
                viewTreeObserver4.addOnPreDrawListener(z40Var);
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
        return chat.f20068id;
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
                str = a1.g.r(accountInstance.getMessagesController().linkPrefix, "/", publicUsername, new StringBuilder());
            } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                tL_messages_exportChatInvite.peer = MessagesController.getInputPeer(this.Z0);
                accountInstance.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ci.u1(this, chatFull, z10, 5));
                return;
            }
            v1(null, str, true, z10);
        } else if (this.f37903a1 != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = this.f37903a1.getInputGroupCall();
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
            y30 y30Var = this.a2;
            if (y30Var.f32178b) {
                return y30Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.f37941j0;
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
        if (!this.f37985u0 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            this.f37985u0 = true;
            this.D0.addAll(this.f37903a1.visibleParticipants);
            this.E0.addAll(this.f37967q0);
            this.F0.addAll(this.f37903a1.invitedUsers);
            this.G0.addAll(this.f37903a1.shadyJoinParticipants);
            this.H0.addAll(this.f37903a1.shadyLeftParticipants);
            this.T1 = sharedInstance.getCallState();
            if (this.f37903a1 == null) {
                ChatObject.Call call = sharedInstance.groupCall;
                this.f37903a1 = call;
                this.f37965p2.f27931c = call;
                this.a2.setGroupCall(call);
                this.f37961o2.f39555c = this.f37903a1;
            }
            lh.h hVar = this.f37911c0;
            if (hVar != null) {
                hVar.C0(this.d.getCurrentAccount(), this.f37903a1.getInputGroupCall(false));
            }
            this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
            this.f37903a1.saveActiveDates();
            VoIPService.getSharedInstance().registerStateListener(this);
            l50 l50Var = this.V;
            if (l50Var != null && l50Var.getVisibility() == 0) {
                this.f37976s.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, true);
                N1(true);
                if (ChatObject.isChannelOrGiga(this.Z0)) {
                    i10 = R.string.VoipChannelEndChat;
                } else {
                    i10 = R.string.VoipGroupEndChat;
                }
                this.f37995w1.setText(LocaleController.getString(i10));
                m50 m50Var = this.Q;
                m50Var.setVisibility(0);
                org.telegram.ui.ActionBar.u0 u0Var = this.l1;
                u0Var.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m50Var, property, 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(m50Var, View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(l50Var, property2, 0.0f);
                Property property3 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(l50Var, property3, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(l50Var, property, 0.0f);
                org.telegram.ui.ActionBar.h5 h5Var = this.U;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(h5Var, property2, 0.0f);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(h5Var, property3, 0.0f);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(h5Var, property, 0.0f);
                org.telegram.ui.ActionBar.h5 h5Var2 = this.W;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(h5Var2, property2, 0.0f), ObjectAnimator.ofFloat(h5Var2, property3, 0.0f), ObjectAnimator.ofFloat(h5Var2, property, 0.0f), ObjectAnimator.ofFloat(u0Var, property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(u0Var, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(u0Var, property, 0.0f, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.is.f27501g);
                animatorSet.addListener(new a50(this, 0));
                animatorSet.setDuration(300L);
                animatorSet.start();
            }
        }
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        if (i10 == 2) {
            Z0();
            X0();
            Y0();
            float f11 = 1.0f - this.f38010z3.f16401e;
            l30 l30Var = this.f37919e;
            l30Var.setAlpha(f11);
            this.a2.setProgressToHideUi(f7);
            this.f37952m2.invalidate();
            this.containerView.invalidate();
            l30Var.invalidate();
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

    public final void n1(final long j3, final boolean z10) {
        if (this.f37903a1 != null) {
            AccountInstance accountInstance = this.d;
            final TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                final org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(getContext(), 3, null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                invitetogroupcall.call = this.f37903a1.getInputGroupCall();
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = user.f20215id;
                tL_inputUser.access_hash = user.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = accountInstance.getConnectionsManager().sendRequest(invitetogroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        g60 g60Var = g60.this;
                        long j10 = j3;
                        org.telegram.ui.ActionBar.a2[] a2VarArr2 = a2VarArr;
                        if (tLObject != null) {
                            g60Var.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.p31(g60Var, j10, a2VarArr2, user, 2));
                            return;
                        }
                        AndroidUtilities.runOnUIThread(new ai.i3(g60Var, a2VarArr2, z10, tL_error, j10, invitetogroupcall));
                    }
                });
                if (sendRequest != 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.zk(this, a2VarArr, sendRequest, 28), 500L);
                }
            }
        }
    }

    public final boolean o1() {
        float f7;
        int dp = AndroidUtilities.dp(74.0f);
        float f10 = this.f38004y0 - dp;
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
        m50 m50Var = this.Q;
        if (m50Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(m50Var);
        }
        u30 u30Var = this.f37952m2;
        if (u30Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(u30Var);
        }
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        arrayList.addAll(this.Y1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.v) arrayList.get(i10)).j(true);
        }
    }

    @Override
    public final void onBackPressed() {
        s40 s40Var = this.f38007z0;
        if (s40Var != null) {
            s40Var.b(false, false);
        } else if (this.f37927f2) {
            e1(true);
        } else if (this.a2.f32178b) {
            f1(null);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.v0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        arrayList.addAll(this.Y1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.v) arrayList.get(i10)).j(true);
        }
        s40 s40Var = this.f38007z0;
        if (s40Var != null && VoIPService.getSharedInstance() != null) {
            s40Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.f37937i0;
        launchActivity.f33840a1.add(this.f37991v2);
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        E3 = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        org.telegram.ui.Components.r30.j(getContext());
        return super.onCustomOpenAnimation();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.v0.d(this, i10, i11);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.v0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.v0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        this.T1 = i10;
        O1(isShowing(), false);
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.v0.h(this, z10);
    }

    public final boolean p1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            return true;
        }
        return false;
    }

    public final boolean r1() {
        if (!s1() || this.f37903a1.visibleVideoParticipants.isEmpty() || (this.f37903a1.visibleVideoParticipants.get(0).aspectRatio != 0.0f && this.f37903a1.visibleVideoParticipants.get(0).aspectRatio < 1.0f)) {
            return false;
        }
        return true;
    }

    public final boolean s1() {
        ChatObject.Call call = this.f37903a1;
        if (call != null && call.call.rtmp_stream) {
            return true;
        }
        return false;
    }

    @Override
    public final void show() {
        super.show();
        if (org.telegram.ui.Components.voip.k1.f32120d0.V) {
            org.telegram.ui.Components.voip.k1.j();
        }
    }

    public final void t1(org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.a2 a2Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j3;
        if (!this.f37994w0) {
            org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f37937i0.O().getFragmentStack().get(this.f37937i0.O().getFragmentStack().size() - 1);
            if (m2Var instanceof zn) {
                boolean U9 = ((zn) m2Var).U9();
                this.f37994w0 = true;
                this.f37999x0 = true;
                ai.t4 t4Var = new ai.t4(e3Var, editTextBoldCursor, z10, a2Var, 21);
                if (U9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(t4Var, j3);
                return;
            }
            this.f37994w0 = true;
            this.f37999x0 = true;
            if (e3Var != null) {
                e3Var.setFocusable(true);
            } else if (a2Var != null) {
                a2Var.k(true);
            }
            if (z10) {
                AndroidUtilities.runOnUIThread(new kh(2, editTextBoldCursor), 100L);
            }
        }
    }

    public final void v1(java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g60.v1(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final void w1() {
        ChatObject.Call call = this.f37903a1;
        if (call != null && call.call != null) {
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(getContext(), 3, null);
            a2Var.q(300L);
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = this.f37903a1.call;
            tL_inputGroupCall.f20085id = groupCall.f20078id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new aa(this, a2Var, exportgroupcallinvite, 12));
        }
    }

    public final void y1(org.telegram.tgnet.TLRPC.GroupCallParticipant r31, final long r32, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g60.y1(org.telegram.tgnet.TLRPC$GroupCallParticipant, long, int):void");
    }

    public final void z1(boolean r18, org.telegram.ui.Cells.e4 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g60.z1(boolean, org.telegram.ui.Cells.e4):void");
    }

    @Override
    public final void A(float f7, int i10) {
    }
}

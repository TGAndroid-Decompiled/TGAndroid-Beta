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
public final class d60 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, le.e {
    public static d60 D3;
    public static boolean E3;
    public static boolean F3;
    public static boolean G3;
    public static volatile DispatchQueue H3 = new DispatchQueue("updateTextureLightningQueue");
    public static boolean I3;
    public TLRPC.Peer A0;
    public final TextView A1;
    public final w5 A2;
    public final le.c A3;
    public TLObject B0;
    public final b60 B1;
    public final LongSparseIntArray B2;
    public final le.f B3;
    public final Paint C0;
    public final ph.i C1;
    public final y30 C2;
    public final le.c C3;
    public final ArrayList D0;
    public q20 D1;
    public final w30 D2;
    public final Paint E;
    public final ArrayList E0;
    public org.telegram.ui.Components.s30 E1;
    public LinearLayout E2;
    public final g40 F;
    public final ArrayList F0;
    public int F1;
    public boolean F2;
    public final f40 G;
    public final ArrayList G0;
    public boolean G1;
    public final org.telegram.ui.Components.ij0 G2;
    public final d40 H;
    public final ArrayList H0;
    public boolean H1;
    public int H2;
    public final ImageView I;
    public int I0;
    public final Paint I1;
    public boolean I2;
    public final ImageView J;
    public final org.telegram.ui.Components.ij0 J0;
    public final Paint J1;
    public final View J2;
    public org.telegram.ui.Components.qk0 K;
    public final org.telegram.ui.Components.ij0 K0;
    public final c60[] K1;
    public final View K2;
    public final h50 L;
    public boolean L0;
    public float L1;
    public GradientDrawable L2;
    public final org.telegram.ui.Components.p6 M;
    public final org.telegram.ui.Components.ba M0;
    public c60 M1;
    public final int[] M2;
    public final o30 N;
    public final org.telegram.ui.Components.ba N0;
    public c60 N1;
    public final s30 N2;
    public final z40 O;
    public float O0;
    public long O1;
    public boolean O2;
    public final x50 P;
    public float P0;
    public float P1;
    public boolean P2;
    public final j50 Q;
    public float Q0;
    public float Q1;
    public RenderNode Q2;
    public final m40 R;
    public RadialGradient R0;
    public boolean R1;
    public float R2;
    public final TextView S;
    public final Matrix S0;
    public boolean S1;
    public boolean S2;
    public final k40 T;
    public final Paint T0;
    public int T1;
    public final String[] T2;
    public final org.telegram.ui.ActionBar.h5 U;
    public final s50 U0;
    public float U1;
    public ObjectAnimator U2;
    public final i50 V;
    public float V0;
    public int V1;
    public ObjectAnimator V2;
    public final org.telegram.ui.ActionBar.h5 W;
    public float W0;
    public boolean W1;
    public final s40 W2;
    public final r50 X;
    public ValueAnimator X0;
    public final int[] X1;
    public org.telegram.ui.Cells.e4 X2;
    public final org.telegram.ui.Components.pz Y;
    public TLRPC.InputPeer Y0;
    public final ArrayList Y1;
    public org.telegram.ui.Components.voip.l Y2;
    public final ImageReceiver Z;
    public TLRPC.Chat Z0;
    public final ArrayList Z1;
    public org.telegram.ui.Components.voip.u Z2;
    public int f32918a0;
    public ChatObject.Call f32919a1;
    public final v30 a2;
    public org.telegram.ui.Components.s20 f32920a3;
    public final x30 f32921b;
    public final ImageView f32922b0;
    public final boolean f32923b1;
    public final a40 f32924b2;
    public boolean f32925b3;
    public final c30 f32926c;
    public final lh.h f32927c0;
    public final String f32928c1;
    public final n40 f32929c2;
    public boolean f32930c3;
    public final AccountInstance d;
    public final int f32931d0;
    public final y50 f32932d1;
    public float f32933d2;
    public int f32934d3;
    public final i30 e;
    public final RadialProgressView f32935e0;
    public final n30 f32936e1;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f32937e2;
    public AnimatorSet f32938e3;
    public final org.telegram.ui.Components.voip.w2 f32939f;
    public final Drawable f32940f0;
    public final p30 f32941f1;
    public boolean f32942f2;
    public d50 f32943f3;
    public final View f32944g0;
    public final Paint f32945g1;
    public boolean f32946g2;
    public int f32947g3;
    public final org.telegram.ui.Components.voip.w2 h;
    public AnimatorSet f32948h0;
    public ValueAnimator f32949h1;
    public org.telegram.ui.Components.v40 f32950h2;
    public int f32951h3;
    public LaunchActivity f32952i0;
    public float f32953i1;
    public k50 f32954i2;
    public int f32955i3;
    public final UndoView[] f32956j0;
    public final LinearLayout f32957j1;
    public Boolean f32958j2;
    public int j3;
    public final org.telegram.ui.Cells.k f32959k0;
    public final org.telegram.ui.ActionBar.u0 f32960k1;
    public int f32961k2;
    public int f32962k3;
    public boolean f32963l0;
    public final org.telegram.ui.ActionBar.u0 l1;
    public boolean f32964l2;
    public int f32965l3;
    public org.telegram.ui.Components.j40 m0;
    public final org.telegram.ui.ActionBar.u0 f32966m1;
    public final r30 f32967m2;
    public int f32968m3;
    public final org.telegram.ui.Components.voip.w2 f32969n;
    public org.telegram.ui.Components.j40 f32970n0;
    public final org.telegram.ui.ActionBar.e1 f32971n1;
    public final org.telegram.ui.Components.wl0 f32972n2;
    public int f32973n3;
    public int f32974o0;
    public final org.telegram.ui.ActionBar.e1 f32975o1;
    public final j60 f32976o2;
    public int f32977o3;
    public o50 f32978p0;
    public final org.telegram.ui.ActionBar.e1 f32979p1;
    public final org.telegram.ui.Components.t20 f32980p2;
    public int f32981p3;
    public final ArrayList f32982q0;
    public final org.telegram.ui.ActionBar.e1 f32983q1;
    public ViewTreeObserver.OnPreDrawListener f32984q2;
    public int f32985q3;
    public final org.telegram.ui.Components.voip.w2 f32986r;
    public y40 f32987r0;
    public final org.telegram.ui.ActionBar.e1 f32988r1;
    public final org.telegram.ui.Components.voip.h f32989r2;
    public int f32990r3;
    public final org.telegram.ui.Components.voip.w2 f32991s;
    public boolean f32992s0;
    public final org.telegram.ui.ActionBar.e1 f32993s1;
    public boolean f32994s2;
    public int f32995s3;
    public long f32996t0;
    public final org.telegram.ui.ActionBar.e1 f32997t1;
    public final ArrayList f32998t2;
    public int f32999t3;
    public boolean f33000u0;
    public final org.telegram.ui.ActionBar.e1 f33001u1;
    public boolean f33002u2;
    public int f33003u3;
    public final org.telegram.ui.Components.voip.w2 v;
    public final RectF f33004v0;
    public final org.telegram.ui.ActionBar.e1 f33005v1;
    public final q20 f33006v2;
    public int f33007v3;
    public final org.telegram.ui.Components.voip.w2 f33008w;
    public boolean f33009w0;
    public final org.telegram.ui.ActionBar.e1 f33010w1;
    public final m30 f33011w2;
    public final e50 f33012w3;
    public final j30 f33013x;
    public boolean f33014x0;
    public final org.telegram.ui.ActionBar.e1 f33015x1;
    public final org.telegram.ui.Components.th f33016x2;
    public Boolean f33017x3;
    public final ImageView f33018y;
    public float f33019y0;
    public final org.telegram.ui.ActionBar.e1 f33020y1;
    public final q20 f33021y2;
    public Integer y3;
    public p40 f33022z0;
    public final LinearLayout f33023z1;
    public boolean f33024z2;
    public final le.c f33025z3;

    public d60(final LaunchActivity launchActivity, AccountInstance accountInstance, ChatObject.Call call, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        super((Context) launchActivity, (org.telegram.ui.ActionBar.d6) null, true, true);
        String string;
        int i10;
        final LaunchActivity launchActivity2;
        d60 d60Var;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.E = new Paint(1);
        this.f32956j0 = new UndoView[2];
        this.f32982q0 = new ArrayList();
        this.f33004v0 = new RectF();
        this.C0 = new Paint(1);
        this.D0 = new ArrayList();
        this.E0 = new ArrayList();
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new ArrayList();
        this.C1 = new ph.i(new q20(this, 8));
        this.F1 = 0;
        this.G1 = false;
        this.I1 = new Paint(7);
        this.J1 = new Paint(7);
        this.K1 = new c60[8];
        this.L1 = 1.0f;
        this.W1 = true;
        this.X1 = new int[4];
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.f32989r2 = new org.telegram.ui.Components.voip.h();
        this.f32998t2 = new ArrayList();
        this.f33006v2 = new q20(this, 0);
        this.f33011w2 = new m30(this);
        this.f33016x2 = new org.telegram.ui.Components.th(19);
        this.f33021y2 = new q20(this, 1);
        this.f33024z2 = false;
        this.A2 = new w5(this, 6);
        this.B2 = new LongSparseIntArray();
        this.M2 = new int[2];
        this.P2 = true;
        this.T2 = new String[2];
        this.f32934d3 = -1;
        this.f33012w3 = new e50(this);
        org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f28022f;
        this.f33025z3 = new le.c(2, this, rrVar, 350L);
        this.A3 = new le.c(3, this, rrVar, 220L, true);
        this.B3 = new le.f(4, this, rrVar, 350L);
        this.C3 = new le.c(5, this, rrVar, 350L);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        setOpenNoDelay(true);
        this.d = accountInstance;
        this.f32919a1 = call;
        this.Y0 = inputPeer;
        this.Z0 = chat;
        this.f32928c1 = str;
        this.currentAccount = accountInstance.getCurrentAccount();
        this.f32923b1 = z10;
        this.resourcesProvider = new ai.a1();
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.f32931d0 = MessagesController.getInstance(this.currentAccount).config.groupCallMessageLengthLimit.get();
        this.fullWidth = true;
        G3 = false;
        F3 = false;
        I3 = false;
        setDelegate(new h40(this));
        this.drawDoubleNavigationBar = true;
        this.drawNavigationBar = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.W2 = new s40(this);
        setOnDismissListener(new u20(this, 0));
        setDimBehindAlpha(75);
        x50 x50Var = new x50(this, launchActivity);
        this.P = x50Var;
        org.telegram.ui.Components.sp spVar = new org.telegram.ui.Components.sp(true);
        int i11 = org.telegram.ui.ActionBar.h6.f19293qg;
        spVar.b(org.telegram.ui.ActionBar.h6.u0(i11));
        spVar.d();
        z40 z40Var = new z40(this, launchActivity, spVar);
        this.O = z40Var;
        z40Var.setSubtitle("");
        z40Var.getSubtitleTextView().setVisibility(0);
        z40Var.l();
        z40Var.getAdditionalSubtitleTextView().setPadding(AndroidUtilities.dp(24.0f), 0, 0, 0);
        AndroidUtilities.updateViewVisibilityAnimated(z40Var.getAdditionalSubtitleTextView(), this.f33002u2, 1.0f, false);
        z40Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.h6.u0(i11));
        int i12 = org.telegram.ui.ActionBar.h6.f19200lg;
        z40Var.setSubtitleColor(org.telegram.ui.ActionBar.h6.u0(i12));
        z40Var.setBackButtonImage(R.drawable.ic_ab_back);
        z40Var.setOccupyStatusBar(false);
        z40Var.setAllowOverlayTitle(false);
        int i13 = org.telegram.ui.ActionBar.h6.f19124hg;
        z40Var.B(org.telegram.ui.ActionBar.h6.u0(i13), false);
        z40Var.A(org.telegram.ui.ActionBar.h6.u0(org.telegram.ui.ActionBar.h6.f19449z8), false);
        z40Var.setTitleColor(org.telegram.ui.ActionBar.h6.u0(i13));
        z40Var.setSubtitleColor(org.telegram.ui.ActionBar.h6.u0(i12));
        z40Var.setActionBarMenuOnItemClick(new g50(this, launchActivity));
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
        VoIPService.audioLevelsCallback = new n20(this, 3);
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
        this.f32940f0 = launchActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        org.telegram.ui.Components.ij0 ij0Var = new org.telegram.ui.Components.ij0(R.raw.voip_filled, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        this.J0 = ij0Var;
        this.K0 = new org.telegram.ui.Components.ij0(R.raw.hand_2, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        h50 h50Var = new h50(this, launchActivity);
        this.L = h50Var;
        this.containerView = h50Var;
        h50Var.setClipToPadding(false);
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
            this.containerView.addView(h5Var, w7.y5.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            i50 i50Var = new i50(this, launchActivity);
            this.V = i50Var;
            i50Var.setGravity(17);
            i50Var.setTextColor(-1);
            i50Var.setTypeface(AndroidUtilities.bold());
            i50Var.setTextSize(60);
            this.containerView.addView(i50Var, w7.y5.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(launchActivity);
            this.W = h5Var2;
            h5Var2.setGravity(17);
            h5Var2.setTextColor(-1);
            h5Var2.setTypeface(AndroidUtilities.bold());
            h5Var2.setTextSize(18);
            this.containerView.addView(h5Var2, w7.y5.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (r1()) {
            s50 s50Var = new s50(this, launchActivity);
            this.U0 = s50Var;
            this.containerView.addView(s50Var, w7.y5.d(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        j50 j50Var = new j50(this, launchActivity);
        this.Q = j50Var;
        j50Var.setClipToPadding(false);
        j50Var.setClipChildren(false);
        r50 r50Var = new r50(this);
        this.X = r50Var;
        r50Var.f43003o = rrVar;
        r50Var.d = 350L;
        r50Var.f43027c = 350L;
        r50Var.e = 350L;
        r50Var.S();
        j50Var.setItemAnimator(r50Var);
        j50Var.setOnScrollListener(new b30(this));
        j50Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(F3 ? 6 : 2, j50Var);
        this.Y = pzVar;
        j50Var.setLayoutManager(pzVar);
        c30 c30Var = new c30(this);
        this.f32926c = c30Var;
        pzVar.z1(c30Var);
        j50Var.i(new d30(this));
        pzVar.C1();
        this.containerView.addView(j50Var, w7.y5.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        j50Var.setAdapter(x50Var);
        j50Var.setTopBottomSelectorRadius(13);
        j50Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.u0(org.telegram.ui.ActionBar.h6.eg));
        j50Var.setOnItemClickListener(new b7(this, launchActivity, call, 14));
        j50Var.setOnItemLongClickListener(new n20(this, 4));
        if (r1()) {
            b60 b60Var = new b60(this, getContext());
            this.B1 = b60Var;
            this.containerView.addView(b60Var, w7.y5.d(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(launchActivity);
        this.f32972n2 = wl0Var;
        this.containerView.addView(wl0Var, w7.y5.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        j60 j60Var = new j60(call, this.currentAccount, this);
        this.f32976o2 = j60Var;
        wl0Var.setAdapter(j60Var);
        s4.s sVar = new s4.s(6, false);
        wl0Var.setLayoutManager(sVar);
        sVar.z1(new f30(this));
        wl0Var.setOnItemClickListener(new org.telegram.ui.Components.kl0(this) {
            public final d60 f36375b;

            {
                this.f36375b = this;
            }

            @Override
            public final void d(int i15, View view) {
                switch (r2) {
                    case 0:
                        d60 d60Var2 = this.f36375b;
                        d60Var2.getClass();
                        org.telegram.ui.Components.s20 s20Var = (org.telegram.ui.Components.s20) view;
                        if (s20Var.getVideoParticipant() == null) {
                            d60Var2.e1(new ChatObject.VideoParticipant(s20Var.getParticipant(), false, false));
                            return;
                        } else {
                            d60Var2.e1(s20Var.getVideoParticipant());
                            return;
                        }
                    default:
                        d60 d60Var3 = this.f36375b;
                        d60Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                        if (lVar.getParticipant() != null) {
                            d60Var3.e1(lVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        s4.j jVar = new s4.j();
        jVar.S();
        jVar.f43003o = rrVar;
        jVar.d = 350L;
        jVar.f43027c = 350L;
        jVar.e = 350L;
        wl0Var.setItemAnimator(new g30(this));
        wl0Var.setOnScrollListener(new h30(this));
        j60Var.H(wl0Var, false, false);
        wl0Var.setVisibility(8);
        i30 i30Var = new i30(this, launchActivity);
        this.e = i30Var;
        int u02 = org.telegram.ui.ActionBar.h6.u0(org.telegram.ui.ActionBar.h6.Jg);
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
        baVar.f22925a = AndroidUtilities.dp(62.0f) * 0.45454547f;
        baVar.f22926b = AndroidUtilities.dp(72.0f) * 0.45454547f;
        baVar.b();
        baVar2.f22925a = AndroidUtilities.dp(65.0f) * 0.45454547f;
        baVar2.f22926b = AndroidUtilities.dp(75.0f) * 0.45454547f;
        baVar2.b();
        int i15 = org.telegram.ui.ActionBar.h6.Ig;
        baVar.d.setColor(i0.a.k(org.telegram.ui.ActionBar.h6.u0(i15), 38));
        baVar2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.h6.u0(i15), 76));
        org.telegram.ui.Components.voip.w2 w2Var = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.f32986r = w2Var;
        w2Var.setCheckable(true);
        w2Var.setTextSize(12);
        i30Var.a(w2Var);
        w2Var.setOnClickListener(new o20(this, 7));
        org.telegram.ui.Components.voip.w2 w2Var2 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.f32969n = w2Var2;
        w2Var2.setCheckable(true);
        w2Var2.setTextSize(12);
        w2Var2.d(false, false);
        w2Var2.setCrossOffset(-AndroidUtilities.dpf2(3.5f));
        w2Var2.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), false, false);
        org.telegram.ui.Components.voip.w2 w2Var3 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.f32939f = w2Var3;
        w2Var3.setCheckable(true);
        w2Var3.setTextSize(12);
        w2Var3.d(false, false);
        org.telegram.ui.Components.lj0 lj0Var = new org.telegram.ui.Components.lj0(launchActivity);
        w2Var3.addView(lj0Var, w7.y5.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.ij0 ij0Var2 = new org.telegram.ui.Components.ij0(R.raw.camera_flip, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.G2 = ij0Var2;
        lj0Var.setAnimation(ij0Var2);
        w2Var3.setOnClickListener(new o20(this, 10));
        i30Var.a(w2Var3);
        org.telegram.ui.Components.voip.w2 w2Var4 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.h = w2Var4;
        w2Var4.setCheckable(true);
        w2Var4.setTextSize(12);
        w2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.f32922b0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i16 = R.drawable.filled_sound_on;
        this.f32918a0 = i16;
        imageView.setImageResource(i16);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        w2Var4.addView(imageView, w7.y5.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        w2Var4.setOnClickListener(new o20(this, 11));
        i30Var.a(w2Var4);
        i30Var.a(w2Var2);
        org.telegram.ui.Components.voip.w2 w2Var5 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.f32991s = w2Var5;
        w2Var5.setTextSize(12);
        w2Var5.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.h6.u0(org.telegram.ui.ActionBar.h6.Dg), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        w2Var5.setOnClickListener(new View.OnClickListener(this) {
            public final d60 f37933b;

            {
                this.f37933b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        d60.o(this.f37933b, launchActivity);
                        return;
                    default:
                        d60 d60Var2 = this.f37933b;
                        d60Var2.a2.e();
                        ChatObject.Call call2 = d60Var2.f32919a1;
                        if (call2 != null && !call2.isScheduled()) {
                            d60Var2.I1();
                            d60.t1(launchActivity, new q20(d60Var2, 5), false, false);
                            return;
                        }
                        d60Var2.dismiss();
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
        j30 j30Var = new j30(this, launchActivity);
        this.f33013x = j30Var;
        j30Var.setAnimation(ij0Var);
        j30Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.w2 w2Var7 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.f33008w = w2Var7;
        w2Var7.setDrawBackground(false);
        w2Var7.setTextSize(12);
        w2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        w2Var7.addView(j30Var, w7.y5.e(50, 50, 49));
        i30Var.a(w2Var7);
        w2Var7.setOnClickListener(new l30(this));
        i30Var.a(w2Var6);
        i30Var.a(w2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.f33018y = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        w2Var7.addView(imageView2, w7.y5.d(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.f32919a1 != null && r1() && !this.f32919a1.isScheduled()) {
            imageView2.setVisibility(0);
            j30Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.f32935e0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.h6.u0(org.telegram.ui.ActionBar.h6.Og));
        z40Var.setAlpha(0.0f);
        z40Var.getBackButton().setScaleX(0.9f);
        z40Var.getBackButton().setScaleY(0.9f);
        z40Var.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        z40Var.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        z40Var.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        z40Var.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(launchActivity, (org.telegram.ui.ActionBar.y) null, 0, org.telegram.ui.ActionBar.h6.u0(i13));
        this.f32960k1 = u0Var;
        u0Var.setLongClickEnabled(false);
        u0Var.setIcon(R.drawable.ic_ab_other);
        u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var.setSubMenuOpenSide(2);
        u0Var.setDelegate(new n20(this, 0));
        int i17 = org.telegram.ui.ActionBar.h6.f19143ig;
        u0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.e0(org.telegram.ui.ActionBar.h6.u0(i17), 6));
        u0Var.setOnClickListener(new o20(this, 0));
        u0Var.G(org.telegram.ui.ActionBar.h6.u0(i13), false);
        u0Var.G(org.telegram.ui.ActionBar.h6.u0(i13), true);
        org.telegram.ui.ActionBar.u0 u0Var2 = new org.telegram.ui.ActionBar.u0(launchActivity, (org.telegram.ui.ActionBar.y) null, 0, org.telegram.ui.ActionBar.h6.u0(i13));
        this.l1 = u0Var2;
        u0Var2.setLongClickEnabled(false);
        u0Var2.setIcon(R.drawable.msg_voice_pip);
        u0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        u0Var2.setBackground(org.telegram.ui.ActionBar.h6.e0(org.telegram.ui.ActionBar.h6.u0(i17), 6));
        u0Var2.setOnClickListener(new o20(this, 1));
        org.telegram.ui.ActionBar.u0 u0Var3 = new org.telegram.ui.ActionBar.u0(launchActivity, (org.telegram.ui.ActionBar.y) null, 0, org.telegram.ui.ActionBar.h6.u0(i13));
        this.f32966m1 = u0Var3;
        u0Var3.setLongClickEnabled(false);
        u0Var3.setIcon(R.drawable.msg_screencast);
        u0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        u0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.e0(org.telegram.ui.ActionBar.h6.u0(i17), 6));
        u0Var3.setOnClickListener(new o20(this, 2));
        n30 n30Var = new n30(this, launchActivity, launchActivity);
        this.f32936e1 = n30Var;
        o30 o30Var = new o30(launchActivity);
        this.N = o30Var;
        o30Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.f32945g1 = paint2;
        paint2.setColor(-12761513);
        p30 p30Var = new p30(this, getContext());
        this.f32941f1 = p30Var;
        p30Var.setTextColor(getThemedColor(i13));
        p30Var.setTextSize(1, 11.0f);
        p30Var.setText(LocaleController.getString(R.string.VoipChannelLabelLive));
        p30Var.setMaxLines(1);
        p30Var.setGravity(17);
        p30Var.setTypeface(AndroidUtilities.bold());
        p30Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f));
        p30Var.setTag(-1);
        if (!r1()) {
            p30Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f32957j1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(n30Var, w7.y5.l(1.0f, 0, -2));
        linearLayout.addView(p30Var, w7.y5.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.containerView.addView(o30Var, w7.y5.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(linearLayout, w7.y5.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.containerView.addView(z40Var, w7.y5.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.f33023z1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(u0Var3, w7.y5.n(48, 48));
        linearLayout2.addView(u0Var2, w7.y5.n(48, 48));
        linearLayout2.addView(u0Var, w7.y5.n(48, 48));
        this.containerView.addView(linearLayout2, w7.y5.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.f32944g0 = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.u0(org.telegram.ui.ActionBar.h6.V5));
        this.containerView.addView(view, w7.y5.c(1.0f, -1));
        for (int i18 = 0; i18 < 2; i18++) {
            this.f32956j0[i18] = new q30(this, launchActivity);
            this.f32956j0[i18].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            this.f32956j0[i18].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.containerView.addView(this.f32956j0[i18], w7.y5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(launchActivity, true);
        this.f32959k0 = kVar;
        kVar.setTag(R.id.fit_width_tag, 240);
        this.f32960k1.h(kVar, AndroidUtilities.dp(48.0f));
        this.f32960k1.setShowSubmenuByMove(false);
        int i19 = org.telegram.ui.ActionBar.h6.eg;
        kVar.setBackground(org.telegram.ui.ActionBar.h6.Y(org.telegram.ui.ActionBar.h6.u0(i19), 6, 6));
        org.telegram.ui.ActionBar.u0 u0Var4 = this.f32960k1;
        org.telegram.ui.ActionBar.e1 d = u0Var4.d(1, 0, null, LocaleController.getString(R.string.VoipGroupAllCanSpeak), true, true, u0Var4.m0);
        this.f33001u1 = d;
        d.j(true, false);
        org.telegram.ui.ActionBar.u0 u0Var5 = this.f32960k1;
        org.telegram.ui.ActionBar.e1 d10 = u0Var5.d(2, 0, null, LocaleController.getString(R.string.VoipGroupOnlyAdminsCanSpeak), true, true, u0Var5.m0);
        this.f33005v1 = d10;
        d10.j(false, true);
        int i20 = org.telegram.ui.ActionBar.h6.f19402wg;
        d.setCheckColor(i20);
        d.c(org.telegram.ui.ActionBar.h6.u0(i20), org.telegram.ui.ActionBar.h6.u0(i20));
        d10.setCheckColor(i20);
        d10.c(org.telegram.ui.ActionBar.h6.u0(i20), org.telegram.ui.ActionBar.h6.u0(i20));
        Paint paint3 = new Paint(1);
        int i21 = org.telegram.ui.ActionBar.h6.f19124hg;
        paint3.setColor(org.telegram.ui.ActionBar.h6.u0(i21));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.u0 u0Var6 = this.f32960k1;
        org.telegram.ui.ActionBar.e1 d11 = u0Var6.d(10, R.drawable.msg_voice_speaker, null, LocaleController.getString(R.string.VoipGroupAudio), true, false, u0Var6.m0);
        this.f32979p1 = d11;
        d11.setItemHeight(56);
        org.telegram.ui.ActionBar.u0 u0Var7 = this.f32960k1;
        org.telegram.ui.ActionBar.e1 d12 = u0Var7.d(11, R.drawable.msg_noise_on, null, LocaleController.getString(R.string.VoipNoiseCancellation), true, false, u0Var7.m0);
        this.f32983q1 = d12;
        d12.setItemHeight(56);
        TextView b10 = this.f32960k1.b(i0.a.d(0.3f, org.telegram.ui.ActionBar.h6.u0(org.telegram.ui.ActionBar.h6.f19107gg), -16777216));
        this.A1 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.u0 u0Var8 = this.f32960k1;
        org.telegram.ui.ActionBar.e1 d13 = u0Var8.d(6, R.drawable.msg_edit, this.f32932d1, LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEditTitle : R.string.VoipGroupEditTitle), true, false, u0Var8.m0);
        this.f32975o1 = d13;
        org.telegram.ui.ActionBar.u0 u0Var9 = this.f32960k1;
        org.telegram.ui.ActionBar.e1 d14 = u0Var9.d(7, R.drawable.msg_permissions, this.f32932d1, LocaleController.getString(R.string.VoipGroupEditPermissions), false, false, u0Var9.m0);
        this.f32988r1 = d14;
        org.telegram.ui.ActionBar.e1 e = this.f32960k1.e(3, R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareInviteLink));
        this.f32971n1 = e;
        y50 y50Var = new y50();
        this.f32932d1 = y50Var;
        org.telegram.ui.ActionBar.e1 e7 = this.f32960k1.e(9, R.drawable.msg_screencast, LocaleController.getString(R.string.VoipChatStartScreenCapture));
        this.f32997t1 = e7;
        org.telegram.ui.ActionBar.u0 u0Var10 = this.f32960k1;
        org.telegram.ui.ActionBar.e1 d15 = u0Var10.d(5, 0, y50Var, LocaleController.getString(R.string.VoipGroupRecordCall), true, false, u0Var10.m0);
        this.f32993s1 = d15;
        y50Var.a(d15.getImageView());
        org.telegram.ui.ActionBar.e1 e10 = this.f32960k1.e(12, R.drawable.menu_stream_comments_24, LocaleController.getString(R.string.VoipChannelEnableComments));
        this.f33015x1 = e10;
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        org.telegram.ui.ActionBar.e1 e11 = this.f32960k1.e(13, R.drawable._menu_stream_comments_off_24, LocaleController.getString(R.string.VoipChannelDisableComments));
        this.f33020y1 = e11;
        org.telegram.ui.ActionBar.u0 u0Var11 = this.f32960k1;
        int i22 = R.drawable.msg_cancel;
        if (o1()) {
            i10 = i21;
            string = LocaleController.getString(R.string.VoipGroupEndConference);
        } else {
            string = LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat);
            i10 = i21;
        }
        org.telegram.ui.ActionBar.e1 e12 = u0Var11.e(4, i22, string);
        this.f33010w1 = e12;
        this.f32960k1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.h6.u0(i19));
        this.f32960k1.getPopupLayout().setFitItems(true);
        e10.c(org.telegram.ui.ActionBar.h6.u0(i10), org.telegram.ui.ActionBar.h6.u0(i10));
        e11.c(org.telegram.ui.ActionBar.h6.u0(i10), org.telegram.ui.ActionBar.h6.u0(i10));
        d11.c(org.telegram.ui.ActionBar.h6.u0(i10), org.telegram.ui.ActionBar.h6.u0(i10));
        d12.c(org.telegram.ui.ActionBar.h6.u0(i10), org.telegram.ui.ActionBar.h6.u0(i10));
        int i23 = org.telegram.ui.ActionBar.h6.f19385vg;
        e12.c(org.telegram.ui.ActionBar.h6.u0(i23), org.telegram.ui.ActionBar.h6.u0(i23));
        e.c(org.telegram.ui.ActionBar.h6.u0(i10), org.telegram.ui.ActionBar.h6.u0(i10));
        d13.c(org.telegram.ui.ActionBar.h6.u0(i10), org.telegram.ui.ActionBar.h6.u0(i10));
        d14.c(org.telegram.ui.ActionBar.h6.u0(i10), org.telegram.ui.ActionBar.h6.u0(i10));
        d15.c(org.telegram.ui.ActionBar.h6.u0(i10), org.telegram.ui.ActionBar.h6.u0(i10));
        e7.c(org.telegram.ui.ActionBar.h6.u0(i10), org.telegram.ui.ActionBar.h6.u0(i10));
        if (this.f32919a1 != null) {
            l1();
        }
        if (o1()) {
            this.f32978p0 = new o50();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.f32978p0.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        P1(false);
        this.O.getTitleTextView().setOnClickListener(new o20(this, 3));
        r30 r30Var = new r30(this, launchActivity);
        this.f32967m2 = r30Var;
        s30 s30Var = new s30(this);
        this.N2 = s30Var;
        r30Var.setClipToPadding(false);
        s30Var.S();
        s30Var.f43003o = org.telegram.ui.Components.rr.f28022f;
        s30Var.d = 350L;
        s30Var.f43027c = 350L;
        s30Var.e = 350L;
        r30Var.setItemAnimator(s30Var);
        r30Var.setOnScrollListener(new t30(this));
        r30Var.setClipChildren(false);
        s4.c0 c0Var = new s4.c0();
        c0Var.j1(0);
        r30Var.setLayoutManager(c0Var);
        org.telegram.ui.Components.t20 t20Var = new org.telegram.ui.Components.t20(call, this.currentAccount, this);
        this.f32980p2 = t20Var;
        r30Var.setAdapter(t20Var);
        t20Var.F(r30Var, false);
        r30Var.setOnItemClickListener(new org.telegram.ui.Components.kl0(this) {
            public final d60 f36375b;

            {
                this.f36375b = this;
            }

            @Override
            public final void d(int i152, View view2) {
                switch (r2) {
                    case 0:
                        d60 d60Var2 = this.f36375b;
                        d60Var2.getClass();
                        org.telegram.ui.Components.s20 s20Var = (org.telegram.ui.Components.s20) view2;
                        if (s20Var.getVideoParticipant() == null) {
                            d60Var2.e1(new ChatObject.VideoParticipant(s20Var.getParticipant(), false, false));
                            return;
                        } else {
                            d60Var2.e1(s20Var.getVideoParticipant());
                            return;
                        }
                    default:
                        d60 d60Var3 = this.f36375b;
                        d60Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view2;
                        if (lVar.getParticipant() != null) {
                            d60Var3.e1(lVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        r30Var.setOnItemLongClickListener(new n20(this, 1));
        r30Var.setVisibility(8);
        r30Var.i(new u30());
        v30 v30Var = new v30(this, launchActivity, this.Q, r30Var, this.Y1, this.f32919a1, this);
        this.a2 = v30Var;
        v30Var.setClipChildren(false);
        t20Var.E(this.Y1, v30Var);
        if (this.f32972n2 != null) {
            this.f32976o2.G(this.Y1, v30Var);
        }
        w30 w30Var = new w30(this, launchActivity);
        this.D2 = w30Var;
        x30 x30Var = new x30(this, launchActivity, this.O, this.Q, w30Var);
        this.f32921b = x30Var;
        x30Var.setImagesLayerNum(Integer.MAX_VALUE);
        x30Var.setInvalidateWithParent(true);
        w30Var.setProfileGalleryView(x30Var);
        y30 y30Var = new y30(this, launchActivity);
        this.C2 = y30Var;
        y30Var.setVisibility(8);
        x30Var.setVisibility(0);
        x30Var.b(new z30(this));
        a40 a40Var = new a40(this, launchActivity);
        this.f32924b2 = a40Var;
        this.containerView.addView(v30Var);
        v30Var.addView(r30Var, w7.y5.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.e.setWillNotDraw(false);
        View view2 = new View(launchActivity);
        this.J2 = view2;
        int[] iArr = this.M2;
        iArr[0] = this.V1;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.M2);
        this.L2 = gradientDrawable;
        view2.setBackground(gradientDrawable);
        this.containerView.addView(view2, w7.y5.e(-1, 60, 83));
        View view3 = new View(launchActivity);
        this.K2 = view3;
        view3.setBackgroundColor(this.M2[0]);
        this.containerView.addView(view3, w7.y5.e(-1, 0, 83));
        lh.h hVar = new lh.h(launchActivity);
        this.f32927c0 = hVar;
        hVar.setDelegate(new b40(this));
        hVar.setClickCellDelegate(new c40(this));
        if (this.f32919a1 != null) {
            hVar.C0(this.d.getCurrentAccount(), this.f32919a1.getInputGroupCall(false));
        }
        this.containerView.addView(hVar, w7.y5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(launchActivity, false, true, true);
        this.M = p6Var;
        p6Var.setGravity(17);
        p6Var.setTextSize(AndroidUtilities.dp(15.0f));
        p6Var.setTextColor(-1);
        p6Var.b(0.4f, 320L, org.telegram.ui.Components.rr.h);
        p6Var.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.e);
        d40 d40Var = new d40(this, launchActivity, this.L, LaunchActivity.R(), this.resourcesProvider);
        this.H = d40Var;
        d40Var.J = true;
        d40Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f32931d0)});
        d40Var.getEditText().setLinkTextColor(-11683585);
        d40Var.setHint(LocaleController.getString(R.string.TypeMessage));
        d40Var.getEditText().addTextChangedListener(new e40(this));
        d40Var.s();
        f40 f40Var = new f40(this, launchActivity);
        this.G = f40Var;
        this.containerView.addView(f40Var, w7.y5.c(-1.0f, -1));
        g40 g40Var = new g40(launchActivity);
        this.F = g40Var;
        g40Var.addView(d40Var, w7.y5.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        g40Var.addView(p6Var, w7.y5.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        p6Var.setTranslationY(-AndroidUtilities.dp(20.0f));
        this.containerView.addView(g40Var, w7.y5.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.J = imageView3;
        int i24 = org.telegram.ui.ActionBar.h6.f19134i6;
        imageView3.setBackground(org.telegram.ui.ActionBar.h6.f0(getThemedColor(i24), 1, -1));
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f7, this.resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new o20(this, 4));
        ImageView imageView4 = new ImageView(launchActivity);
        this.I = imageView4;
        imageView4.setBackground(org.telegram.ui.ActionBar.h6.f0(getThemedColor(i24), 1, -1));
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19376v6, this.resourcesProvider), mode));
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new o20(this, 5));
        g40Var.addView(imageView3, w7.y5.e(48, 48, 85));
        g40Var.addView(imageView4, w7.y5.e(48, 48, 85));
        this.containerView.addView(a40Var);
        y30Var.addView(x30Var, w7.y5.c(-1.0f, -1));
        y30Var.addView(w30Var, w7.y5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(y30Var, w7.y5.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        O0(false);
        this.P.l();
        if (G3) {
            this.f32976o2.I(this.f32972n2, false);
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
            this.containerView.addView(textView, w7.y5.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.ed0 ed0Var = new org.telegram.ui.Components.ed0(launchActivity);
            ed0Var.setTextColor(-1);
            ed0Var.setSelectorColor(-9598483);
            ed0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            ed0Var.setItemCount(5);
            i40 i40Var = new i40(launchActivity);
            i40Var.setItemCount(5);
            i40Var.setTextColor(-1);
            i40Var.setSelectorColor(-9598483);
            i40Var.setTextOffset(-AndroidUtilities.dp(10.0f));
            j40 j40Var = new j40(launchActivity);
            j40Var.setItemCount(5);
            j40Var.setTextColor(-1);
            j40Var.setSelectorColor(-9598483);
            j40Var.setTextOffset(-AndroidUtilities.dp(34.0f));
            k40 k40Var = new k40(launchActivity);
            this.T = k40Var;
            k40Var.setLines(1);
            k40Var.setSingleLine(true);
            k40Var.setEllipsize(TextUtils.TruncateAt.END);
            k40Var.setGravity(17);
            k40Var.setTextColor(-1);
            k40Var.setTypeface(AndroidUtilities.bold());
            k40Var.setTextSize(1, 14.0f);
            this.containerView.addView(k40Var, w7.y5.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            launchActivity2 = launchActivity;
            k40Var.setOnClickListener(new org.telegram.messenger.video.f(this, ed0Var, i40Var, j40Var, chat, accountInstance, inputPeer2, 1));
            m40 m40Var = new m40(launchActivity2, ed0Var, i40Var, j40Var);
            this.R = m40Var;
            m40Var.setWeightSum(1.0f);
            m40Var.setOrientation(0);
            this.containerView.addView(m40Var, w7.y5.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i25 = calendar.get(1);
            int i26 = calendar.get(6);
            m40Var.addView(ed0Var, w7.y5.l(0.5f, 0, 270));
            ed0Var.setMinValue(0);
            ed0Var.setMaxValue(365);
            ed0Var.setWrapSelectorWheel(false);
            ed0Var.setFormatter(new s20(currentTimeMillis, calendar, i25, 0));
            a1.d dVar = new a1.d(this, ed0Var, i40Var, j40Var, 11);
            d60Var = this;
            ed0Var.setOnValueChangedListener(dVar);
            i40Var.setMinValue(0);
            i40Var.setMaxValue(23);
            m40Var.addView(i40Var, w7.y5.l(0.2f, 0, 270));
            i40Var.setFormatter(new org.telegram.ui.Components.voip.e1(6));
            i40Var.setOnValueChangedListener(dVar);
            j40Var.setMinValue(0);
            j40Var.setMaxValue(59);
            j40Var.setValue(0);
            j40Var.setFormatter(new org.telegram.ui.Components.voip.e1(7));
            m40Var.addView(j40Var, w7.y5.l(0.3f, 0, 270));
            j40Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i27 = calendar.get(6);
            int i28 = calendar.get(12);
            int i29 = calendar.get(11);
            ed0Var.setValue(i26 != i27 ? 1 : 0);
            j40Var.setValue(i28);
            i40Var.setValue(i29);
            org.telegram.ui.Components.e5.g(k40Var, textView, 0L, 604800L, 2, ed0Var, i40Var, j40Var);
        } else {
            launchActivity2 = launchActivity;
            d60Var = this;
        }
        n40 n40Var = new n40(d60Var, (ViewGroup) d60Var.getWindow().getDecorView(), d60Var.containerView);
        d60Var.f32929c2 = n40Var;
        n40Var.E = new o40(d60Var);
        x30Var.setPinchToZoomHelper(n40Var);
        d60Var.f32969n.setOnClickListener(new View.OnClickListener(d60Var) {
            public final d60 f37933b;

            {
                this.f37933b = d60Var;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        d60.o(this.f37933b, launchActivity2);
                        return;
                    default:
                        d60 d60Var2 = this.f37933b;
                        d60Var2.a2.e();
                        ChatObject.Call call2 = d60Var2.f32919a1;
                        if (call2 != null && !call2.isScheduled()) {
                            d60Var2.I1();
                            d60.t1(launchActivity2, new q20(d60Var2, 5), false, false);
                            return;
                        }
                        d60Var2.dismiss();
                        return;
                }
            }
        });
        d60Var.L1(false);
        d60Var.I1();
        d60Var.M1(false);
        d60Var.N1(false, false);
        d60Var.B1(0.0f);
        d60Var.O1();
        d60Var.containerView.addView(new FrameLayout(launchActivity2), w7.y5.e(-1, 200, 87));
        d60Var.v.setOnClickListener(new o20(d60Var, 6));
        d60Var.T0();
        w7.a6.a(d60Var.f32969n);
        w7.a6.a(d60Var.f32986r);
        w7.a6.a(d60Var.f32939f);
        w7.a6.a(d60Var.h);
        w7.a6.a(d60Var.f33008w);
        w7.a6.a(d60Var.f32991s);
        w7.a6.a(d60Var.v);
        r0.i0.m(d60Var.containerView, new n20(d60Var, 2));
    }

    public static void A(d60 d60Var, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        boolean z10;
        TLRPC.GroupCall groupCall;
        a2Var.dismiss();
        if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
            Context context = d60Var.getContext();
            int i10 = d60Var.currentAccount;
            TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
            String str = ((TL_phone.exportedGroupCallInvite) tLObject).link;
            org.telegram.ui.ActionBar.d6 d6Var = d60Var.resourcesProvider;
            ChatObject.Call call = d60Var.f32919a1;
            if (call != null && (groupCall = call.call) != null && groupCall.creator) {
                z10 = true;
            } else {
                z10 = false;
            }
            k9.o0(context, i10, inputGroupCall, str, d6Var, false, z10);
        } else if (tL_error != null) {
            new org.telegram.ui.Components.yc(d60Var.topBulletinContainer, new ai.a1()).d0(tL_error, false);
        }
    }

    public static String A0() {
        String[][] strArr = EmojiData.data;
        String[] strArr2 = strArr[(int) Math.floor(Math.random() * strArr.length)];
        return strArr2[(int) Math.floor(Math.random() * strArr2.length)];
    }

    public static void B(d60 d60Var, int[] iArr, float[] fArr) {
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        s4.c1 K;
        r30 r30Var = d60Var.f32967m2;
        v30 v30Var = d60Var.a2;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant = d60Var.f32919a1.participantsBySources.get(iArr[i10]);
            if (groupCallParticipant != null) {
                if (!v30Var.f29452b) {
                    if (d60Var.f32992s0) {
                        arrayList = d60Var.D0;
                    } else {
                        arrayList = d60Var.f32919a1.visibleParticipants;
                    }
                    int indexOf = arrayList.indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = d60Var.Q.K(indexOf + d60Var.P.d)) != null) {
                        View view = K.f42946a;
                        if (view instanceof org.telegram.ui.Cells.e4) {
                            ((org.telegram.ui.Cells.e4) view).setAmplitude(fArr[i10] * 15.0f);
                            if (view == d60Var.X2 && !d60Var.f32964l2) {
                                d60Var.containerView.invalidate();
                            }
                        }
                    }
                } else {
                    for (int i11 = 0; i11 < r30Var.getChildCount(); i11++) {
                        org.telegram.ui.Components.s20 s20Var = (org.telegram.ui.Components.s20) r30Var.getChildAt(i11);
                        if (MessageObject.getPeerId(s20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                            s20Var.setAmplitude(fArr[i10] * 15.0f);
                        }
                    }
                }
                v30Var.k(groupCallParticipant, fArr[i10] * 15.0f);
            }
        }
    }

    public static void B0(d60 d60Var) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("reminderhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("reminderhint", true).commit();
        if (d60Var.f32970n0 == null) {
            org.telegram.ui.Components.j40 j40Var = new org.telegram.ui.Components.j40(d60Var.getContext(), 8);
            d60Var.f32970n0 = j40Var;
            j40Var.setAlpha(0.0f);
            d60Var.f32970n0.setVisibility(4);
            d60Var.f32970n0.setShowingDuration(4000L);
            d60Var.containerView.addView(d60Var.f32970n0, w7.y5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            d60Var.f32970n0.setText(LocaleController.getString(R.string.VoipChatReminderHint));
            d60Var.f32970n0.d();
        }
        d60Var.f32970n0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        d60Var.f32970n0.f(d60Var.f33008w, true);
    }

    public static void E(d60 d60Var) {
        Editable text = d60Var.H.getText();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = text.toString();
        tL_textWithEntities.entities = MediaDataController.getInstance(d60Var.currentAccount).getEntities(new CharSequence[]{text}, true);
        d60Var.A1(tL_textWithEntities);
    }

    public static void F0(d60 d60Var) {
        ChatObject.Call call = d60Var.f32919a1;
        if (call != null && call.call != null) {
            TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
            togglegroupcallsettings.call = d60Var.f32919a1.getInputGroupCall();
            togglegroupcallsettings.join_muted = Boolean.valueOf(d60Var.f32919a1.call.join_muted);
            ConnectionsManager connectionsManager = d60Var.d.getConnectionsManager();
            DispatchQueue dispatchQueue = Utilities.stageQueue;
            Objects.requireNonNull(dispatchQueue);
            connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.d1(dispatchQueue), new z20(d60Var, 1));
        }
    }

    public static void G0(d60 d60Var, boolean z10) {
        if (d60Var.f32919a1 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = d60Var.f32919a1.getInputGroupCall();
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        d60Var.f33017x3 = Boolean.valueOf(z10);
        d60Var.H1(true);
        ConnectionsManager connectionsManager = d60Var.d.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.d1(dispatchQueue), new z20(d60Var, 0));
    }

    public static void H0(d60 d60Var) {
        boolean z10;
        int i10;
        if (d60Var.r1()) {
            v30 v30Var = d60Var.a2;
            if (!v30Var.V && v30Var.f29452b && (F3 == d60Var.q1() || AndroidUtilities.isTablet())) {
                z10 = false;
            } else {
                z10 = true;
            }
            Boolean bool = d60Var.f32958j2;
            if (bool != null && z10 == bool.booleanValue()) {
                return;
            }
            int systemUiVisibility = d60Var.containerView.getSystemUiVisibility();
            if (z10) {
                i10 = systemUiVisibility & (-7);
                d60Var.getWindow().clearFlags(1024);
                d60Var.setHideSystemVerticalInsets(false);
            } else {
                d60Var.setHideSystemVerticalInsets(true);
                i10 = systemUiVisibility | 6;
                d60Var.getWindow().addFlags(1024);
            }
            d60Var.containerView.setSystemUiVisibility(i10);
            d60Var.f32958j2 = Boolean.valueOf(z10);
            d60Var.S2 = !z10;
            d60Var.containerView.requestApplyInsets();
            return;
        }
        d60Var.isFullscreen = false;
    }

    public static org.telegram.ui.Components.voip.l I0(d60 d60Var) {
        j50 j50Var = d60Var.Q;
        for (int i10 = 0; i10 < j50Var.getChildCount(); i10++) {
            View childAt = j50Var.getChildAt(i10);
            if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.l) && RecyclerView.R(childAt) >= 0) {
                return (org.telegram.ui.Components.voip.l) childAt;
            }
        }
        return null;
    }

    public static void J0(d60 d60Var) {
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
        z40 z40Var = d60Var.O;
        j50 j50Var = d60Var.Q;
        int childCount = j50Var.getChildCount();
        float f14 = 2.1474836E9f;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (RecyclerView.R(j50Var.getChildAt(i10)) >= 0) {
                f14 = Math.min(f14, childAt.getTop());
            }
        }
        if (f14 < 0.0f || f14 == 2.1474836E9f) {
            if (childCount != 0) {
                f14 = 0.0f;
            } else {
                f14 = j50Var.getPaddingTop();
            }
        }
        if (f14 <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float dp4 = f14 + AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if ((z10 && z40Var.getTag() == null) || (!z10 && z40Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            z40Var.setTag(num);
            AnimatorSet animatorSet = d60Var.f32948h0;
            if (animatorSet != null) {
                animatorSet.cancel();
                d60Var.f32948h0 = null;
            }
            if (z40Var.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            d60Var.setUseLightStatusBar(z11);
            ViewPropertyAnimator animate = z40Var.getBackButton().animate();
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
            org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f28022f;
            duration.setInterpolator(rrVar).start();
            ViewPropertyAnimator animate2 = z40Var.getTitleTextView().animate();
            if (z10) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(23.0f);
            }
            animate2.translationY(dp).setDuration(300L).setInterpolator(rrVar).start();
            ObjectAnimator objectAnimator = d60Var.U2;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                d60Var.U2.cancel();
            }
            org.telegram.ui.ActionBar.h5 subtitleTextView = z40Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            float translationY = z40Var.getSubtitleTextView().getTranslationY();
            if (z10) {
                dp2 = 0.0f;
            } else {
                dp2 = AndroidUtilities.dp(20.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, property, translationY, dp2);
            d60Var.U2 = ofFloat;
            ofFloat.setDuration(300L);
            d60Var.U2.setInterpolator(rrVar);
            d60Var.U2.addListener(new org.telegram.ui.Components.ca(29, d60Var, z10));
            d60Var.U2.start();
            ObjectAnimator objectAnimator2 = d60Var.V2;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            org.telegram.ui.ActionBar.h5 additionalSubtitleTextView = z40Var.getAdditionalSubtitleTextView();
            if (z10) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(20.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(additionalSubtitleTextView, property, dp3);
            d60Var.V2 = ofFloat2;
            ofFloat2.setDuration(300L);
            d60Var.V2.setInterpolator(rrVar);
            d60Var.V2.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            d60Var.f32948h0 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = d60Var.f32948h0;
            Property property2 = View.ALPHA;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(z40Var, property2, f11);
            o30 o30Var = d60Var.N;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(o30Var, property2, f12);
            View view = d60Var.f32944g0;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, property2, f13));
            d60Var.f32948h0.addListener(new x40(d60Var, 1));
            d60Var.f32948h0.start();
            ImageView imageView = d60Var.a2.v;
            if (z10 && !F3) {
                z12 = false;
            } else {
                z12 = true;
            }
            imageView.setClickable(z12);
        }
        if (d60Var.f33019y0 != dp4) {
            d60Var.E1(dp4);
        }
    }

    public static void N(d60 d60Var, org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (!d60Var.isDismissed()) {
            if (z10 && lVar.getRenderer() == null) {
                lVar.setRenderer(org.telegram.ui.Components.voip.u.c(d60Var.Y1, d60Var.a2, lVar, null, null, lVar.getParticipant(), d60Var.f32919a1, d60Var));
            } else if (!z10 && lVar.getRenderer() != null) {
                lVar.getRenderer().setPrimaryView(null);
                lVar.setRenderer(null);
            }
        }
    }

    public static void S(d60 d60Var, int i10, int[] iArr) {
        if (d60Var.r1()) {
            int i11 = org.telegram.ui.ActionBar.h6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.h6.w0(null, i11, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Lg, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19457zg, false), d60Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19182kg, false), org.telegram.ui.ActionBar.h6.w0(null, i11, false), d60Var.U1, 1.0f);
        } else if (i10 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Jg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19438yg, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19457zg, false), d60Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19420xg, false);
        } else if (i10 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Gg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Bg, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Cg, false), d60Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ag, false);
        } else if (p1(i10)) {
            iArr[0] = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19183kh, false);
            iArr[1] = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19201lh, false);
            iArr[2] = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19220mh, false);
        } else {
            int i12 = org.telegram.ui.ActionBar.h6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.h6.w0(null, i12, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Mg, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ng, false), d60Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19182kg, false), org.telegram.ui.ActionBar.h6.w0(null, i12, false), d60Var.U1, 1.0f);
        }
        if (p1(i10)) {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19144ih, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19183kh, false));
        } else if (i10 == 1) {
            iArr[3] = i0.a.d(0.75f, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Bg, false), i0.a.d(0.5f, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Fg, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Hg, false)));
        } else {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Jg, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ig, false));
        }
    }

    public static void c1(LaunchActivity launchActivity, AccountInstance accountInstance, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        if (D3 == null) {
            if (inputPeer != null || VoIPService.getSharedInstance() != null) {
                if (inputPeer != null) {
                    D3 = new d60(launchActivity, accountInstance, accountInstance.getMessagesController().getGroupCall(chat.f18321id, false), chat, inputPeer, z10, str);
                } else {
                    ChatObject.Call call = VoIPService.getSharedInstance().groupCall;
                    if (call != null) {
                        TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(call.chatId));
                        call.addSelfDummyParticipant(true);
                        D3 = new d60(launchActivity, accountInstance, call, chat2, null, z10, str);
                    } else {
                        return;
                    }
                }
                D3.f32952i0 = launchActivity;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.th(18));
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

    public static void m(d60 d60Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(d60Var.currentAccount).sendRequest(declineconferencecallinvite, new y20(d60Var, 0));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(invitedUser.msg_id));
        MessagesController.getInstance(d60Var.currentAccount).deleteMessages(arrayList, null, null, 0L, 0, true, 0);
        ChatObject.Call call = d60Var.f32919a1;
        if (call != null) {
            call.invitedUsers.remove(l4);
            d60Var.f32919a1.invitedUsersMap.remove(l4);
            d60Var.f32919a1.invitedUsersMessageIds.remove(l4);
            d60Var.O0(true);
        }
    }

    public static void n(d60 d60Var, Activity activity, ChatObject.Call call, View view, int i10) {
        TLRPC.Chat chat;
        final ChatObject.Call.InvitedUser invitedUser;
        AccountInstance accountInstance = d60Var.d;
        ArrayList arrayList = d60Var.F0;
        x50 x50Var = d60Var.P;
        if (view instanceof org.telegram.ui.Components.voip.l) {
            d60Var.e1(((org.telegram.ui.Components.voip.l) view).getParticipant());
        } else if (view instanceof org.telegram.ui.Cells.e4) {
            d60Var.F1((org.telegram.ui.Cells.e4) view);
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
                    if (d60Var.o1()) {
                        int i11 = i10 - x50Var.f39817n;
                        if (i11 >= 0 && i11 < d60Var.f32919a1.shadyJoinParticipants.size()) {
                            l4 = d60Var.f32919a1.shadyJoinParticipants.get(i10 - x50Var.f39817n);
                        } else {
                            int i12 = i10 - x50Var.f39819s;
                            if (i12 >= 0 && i12 < d60Var.f32919a1.shadyLeftParticipants.size()) {
                                l4 = d60Var.f32919a1.shadyLeftParticipants.get(i10 - x50Var.f39819s);
                            } else {
                                int i13 = i10 - x50Var.f39816f;
                                if (d60Var.f32992s0) {
                                    if (i13 >= 0 && i13 < arrayList.size()) {
                                        l4 = (Long) arrayList.get(i13);
                                    }
                                } else if (i13 >= 0 && i13 < d60Var.f32919a1.invitedUsers.size()) {
                                    l4 = d60Var.f32919a1.invitedUsers.get(i13);
                                }
                                z10 = false;
                            }
                        }
                        if (!z10 && (invitedUser = d60Var.f32919a1.invitedUsersMessageIds.get(l4)) != null) {
                            org.telegram.ui.Components.y70 F = org.telegram.ui.Components.y70.F(d60Var.container, d60Var.resourcesProvider, w3Var);
                            F.l(R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable(d60Var) {
                                public final d60 f38855b;

                                {
                                    this.f38855b = d60Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            d60.r(this.f38855b, invitedUser, l4);
                                            return;
                                        default:
                                            d60.m(this.f38855b, invitedUser, l4);
                                            return;
                                    }
                                }
                            }, invitedUser.isCalling());
                            F.c(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable(d60Var) {
                                public final d60 f38855b;

                                {
                                    this.f38855b = d60Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            d60.r(this.f38855b, invitedUser, l4);
                                            return;
                                        default:
                                            d60.m(this.f38855b, invitedUser, l4);
                                            return;
                                    }
                                }
                            }, false);
                            F.W(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), d60Var.C0.getColor()));
                            F.f30547s = 96;
                            F.Z();
                            return;
                        }
                        return;
                    }
                    d60Var.f32952i0.K0(d60Var.currentAccount);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", w3Var.getUser().f18468id);
                    if (w3Var.f21775a.getImageReceiver().hasNotThumb()) {
                        bundle.putBoolean("expandPhoto", true);
                    }
                    d60Var.f32952i0.p0(new ProfileActivity(bundle, null));
                    d60Var.dismiss();
                }
            } else if (i10 == x50Var.f39820w) {
                if (ChatObject.isChannel(d60Var.Z0) && (chat = d60Var.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)) {
                    d60Var.j1(false);
                    return;
                }
                TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(d60Var.i1());
                if (chatFull != null) {
                    d60Var.f33009w0 = false;
                    Context context = d60Var.getContext();
                    int currentAccount = accountInstance.getCurrentAccount();
                    TLRPC.Chat chat2 = d60Var.Z0;
                    ChatObject.Call call2 = d60Var.f32919a1;
                    org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(context, currentAccount, chat2, chatFull, call2.participants, call2.invitedUsersMap);
                    d60Var.E1 = s30Var;
                    s30Var.setOnDismissListener(new u20(d60Var, 2));
                    org.telegram.ui.Components.s30 s30Var2 = d60Var.E1;
                    s30Var2.f28119g0 = new e30(d60Var);
                    s30Var2.show();
                }
            } else if (i10 == x50Var.f39821x) {
                ChatObject.Call call3 = d60Var.f32919a1;
                if (call3 != null && call3.call != null) {
                    tg.m1 m1Var = new tg.m1(activity, d60Var.currentAccount, null, 4, new ai.a1());
                    ChatObject.Call call4 = d60Var.f32919a1;
                    if (call4 != null) {
                        collection = (Collection) Collection.EL.stream(call4.sortedParticipants).map(new l8(4)).collect(Collectors.toSet());
                    }
                    m1Var.C0.addAll(collection);
                    m1Var.h0(false, true);
                    m1Var.A0 = new q20(d60Var, 3);
                    m1Var.h0(false, true);
                    m1Var.D0 = new ai.m0(14, d60Var, call);
                    m1Var.show();
                }
            } else if (i10 == x50Var.f39822y) {
                d60Var.v1();
            }
        }
    }

    public static void o(d60 d60Var, Activity activity) {
        LaunchActivity launchActivity;
        if (Build.VERSION.SDK_INT >= 23 && (launchActivity = d60Var.f32952i0) != null && launchActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
            d60Var.f32952i0.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
        } else if (VoIPService.getSharedInstance() != null) {
            boolean z10 = false;
            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                d60Var.f32956j0[0].e(1, false);
                if (d60Var.f33022z0 == null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null) {
                        sharedInstance.createCaptureDevice(false);
                    }
                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                        z10 = true;
                    }
                    p40 p40Var = new p40(d60Var, activity, z10);
                    d60Var.f33022z0 = p40Var;
                    p40Var.setBottomPadding(d60Var.containerView.getPaddingBottom());
                    d60Var.container.addView(d60Var.f33022z0);
                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                        return;
                    }
                    return;
                }
                return;
            }
            VoIPService.getSharedInstance().setVideoState(false, 0);
            d60Var.N1(true, false);
            d60Var.M1(false);
            d60Var.f32919a1.sortParticipants();
            d60Var.O0(true);
            d60Var.e.requestLayout();
        }
    }

    public static void p(d60 d60Var, float f7, float f10, float f11, int i10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d60Var.f32933d2 = floatValue;
        d60Var.a2.f29466n = floatValue;
        float f12 = (floatValue * 1.0f) + ((1.0f - floatValue) * f7);
        y30 y30Var = d60Var.C2;
        y30Var.setScaleX(f12);
        y30Var.setScaleY(f12);
        y30Var.setTranslationX((1.0f - d60Var.f32933d2) * f10);
        y30Var.setTranslationY((1.0f - d60Var.f32933d2) * f11);
        if (!d60Var.f32946g2) {
            d60Var.W2.setAlpha((int) (d60Var.f32933d2 * 100.0f));
        }
        org.telegram.ui.Components.voip.u uVar = d60Var.Z2;
        if (uVar != null) {
            uVar.f29633a.setRoundCorners((1.0f - d60Var.f32933d2) * AndroidUtilities.dp(8.0f));
        }
        y30Var.invalidate();
        d60Var.containerView.invalidate();
        x30 x30Var = d60Var.f32921b;
        int i11 = (int) ((1.0f - d60Var.f32933d2) * i10);
        x30Var.N(i11, i11);
    }

    public static boolean p1(int i10) {
        if ((VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.call.rtmp_stream) && i10 != 2 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            return false;
        }
        return true;
    }

    public static void q(d60 d60Var, ChatObject.Call call, Boolean bool, HashSet hashSet) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        ChatObject.Call call2 = d60Var.f32919a1;
        if (call2 != null && (groupCall = call2.call) != null) {
            String str = groupCall.invite_link;
            int size = hashSet.size();
            AtomicInteger atomicInteger = new AtomicInteger(0);
            HashSet hashSet2 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                d60Var.f32919a1.addInvitedUser(longValue);
                TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                inviteconferencecallparticipant.call = tL_inputGroupCall;
                TLRPC.GroupCall groupCall2 = d60Var.f32919a1.call;
                tL_inputGroupCall.f18338id = groupCall2.f18331id;
                tL_inputGroupCall.access_hash = groupCall2.access_hash;
                inviteconferencecallparticipant.user_id = MessagesController.getInstance(d60Var.currentAccount).getInputUser(longValue);
                inviteconferencecallparticipant.video = bool.booleanValue();
                ConnectionsManager.getInstance(d60Var.currentAccount).sendRequest(inviteconferencecallparticipant, new ei.b1(d60Var, longValue, hashSet2, atomicInteger, size, call, str));
            }
            d60Var.O0(true);
            if (bool.booleanValue() && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(false) != 1) {
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                sharedInstance.requestVideoCall(false);
                sharedInstance.setVideoState(false, 2);
                sharedInstance.setMicMute(false, false, true);
                sharedInstance.switchToSpeaker();
                d60Var.N1(true, true);
            }
        }
    }

    public static void r(d60 d60Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(d60Var.currentAccount).sendRequest(declineconferencecallinvite, new y20(d60Var, 1));
        ChatObject.Call call = d60Var.f32919a1;
        if (call != null) {
            invitedUser.calling = false;
            call.invitedUsersMessageIds.put(l4, invitedUser);
            d60Var.O0(true);
        }
    }

    public static void s(d60 d60Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(d60Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static void t(d60 d60Var) {
        d60Var.Y0();
        d60Var.V0();
        d60Var.U0();
        d60Var.F.setTranslationY((-d60Var.C1.c()) + d60Var.containerView.getPaddingBottom());
        d60Var.G.invalidate();
        d60Var.Z0();
        d60Var.containerView.invalidate();
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
                    alertDialog$Builder.f18647a.R = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertTitle);
                    alertDialog$Builder.f18647a.T = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertText);
                } else if (ChatObject.isChannelOrGiga(chat)) {
                    alertDialog$Builder.f18647a.R = LocaleController.getString(R.string.VoipChannelLeaveAlertTitle);
                    alertDialog$Builder.f18647a.T = LocaleController.getString(R.string.VoipChannelLeaveAlertText);
                } else {
                    alertDialog$Builder.f18647a.R = LocaleController.getString(R.string.VoipGroupLeaveAlertTitle);
                    alertDialog$Builder.f18647a.T = LocaleController.getString(R.string.VoipGroupLeaveAlertText);
                }
                sharedInstance.getAccount();
                org.telegram.ui.Cells.a2[] a2VarArr = new org.telegram.ui.Cells.a2[1];
                LinearLayout f7 = org.telegram.messenger.ok.f(context, 1);
                if (!sharedInstance.isConference() || (call != null && (groupCall = call.call) != null && groupCall.creator)) {
                    org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, 1);
                    a2VarArr[0] = a2Var;
                    a2Var.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
                    if (z10) {
                        a2VarArr[0].setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19151j5, false));
                    } else {
                        a2VarArr[0].setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19124hg, false));
                        CheckBoxSquare checkBoxSquare = (CheckBoxSquare) a2VarArr[0].getCheckBoxView();
                        int i10 = org.telegram.ui.ActionBar.h6.f19312rg;
                        int i11 = org.telegram.ui.ActionBar.h6.f19274pg;
                        int i12 = org.telegram.ui.ActionBar.h6.f19236ng;
                        checkBoxSquare.f22195s = i10;
                        checkBoxSquare.v = i11;
                        checkBoxSquare.f22196w = i12;
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
                    f7.addView(a2VarArr[0], w7.y5.n(-1, -2));
                    a2VarArr[0].setOnClickListener(new r20(a2VarArr, 0));
                }
                alertDialog$Builder.n(f7);
                alertDialog$Builder.f18647a.I = org.telegram.ui.ActionBar.h6.f19274pg;
                alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new ci.y6(call, a2VarArr, selfId, runnable, 2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (z10) {
                    alertDialog$Builder.f18647a.P0 = false;
                }
                org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder.f18647a;
                if (z10) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        a2Var3.getWindow().setType(2038);
                    } else {
                        a2Var3.getWindow().setType(2003);
                    }
                    a2Var3.getWindow().clearFlags(2);
                }
                if (!z10) {
                    a2Var3.i(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19368ug, false));
                }
                a2Var3.show();
                if (!z10) {
                    TextView textView = (TextView) a2Var3.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19385vg, false));
                    }
                    a2Var3.o(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19124hg, false));
                    return;
                }
                return;
            }
            w1(call, false, selfId, runnable);
        }
    }

    public static void u(d60 d60Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(d60Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static void v(d60 d60Var, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(d60Var.currentAccount).processUpdates(updates, false);
            AndroidUtilities.runOnUIThread(new a3.h0(d60Var, updates, j3, 25));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j3));
        }
        if (atomicInteger.incrementAndGet() == i10 && !hashSet.isEmpty()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0(d60Var, hashSet, call, str, 8));
        }
    }

    public static void w(d60 d60Var, HashSet hashSet, ChatObject.Call call, String str) {
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
            arrayList.add(MessagesController.getInstance(d60Var.currentAccount).getUser(l4));
            getrequirementstocontact.f18526id.add(MessagesController.getInstance(d60Var.currentAccount).getInputUser(longValue));
        }
        ai.m3 m3Var = new ai.m3(d60Var, arrayList, arrayList2, arrayList3, str, 29);
        if (UserConfig.getInstance(d60Var.currentAccount).isPremium()) {
            m3Var.run();
        } else {
            ConnectionsManager.getInstance(d60Var.currentAccount).sendRequest(getrequirementstocontact, new aa(arrayList, arrayList2, m3Var, 13));
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

    public static void x(d60 d60Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        rg.j0 j0Var = new rg.j0(34, d60Var.currentAccount, U.getContext(), U, new ai.a1());
        j0Var.I1(null, arrayList, arrayList2, arrayList3, str);
        j0Var.show();
    }

    public static void y(d60 d60Var, org.telegram.ui.ActionBar.a2[] a2VarArr, boolean z10, TLRPC.TL_error tL_error, long j3, TL_phone.inviteToGroupCall invitetogroupcall) {
        try {
            a2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        a2VarArr[0] = null;
        if (z10 && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
            d60Var.x1(null, j3, 3);
            return;
        }
        org.telegram.ui.Components.e5.f0(d60Var.currentAccount, tL_error, (org.telegram.ui.ActionBar.m2) d60Var.f32952i0.O().getFragmentStack().get(d60Var.f32952i0.O().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
    }

    public static r0.l1 z(d60 d60Var, r0.l1 l1Var) {
        int keyboardHeight;
        r0.i1 i1Var = l1Var.f42126a;
        i0.b f7 = i1Var.f(647);
        i0.b f10 = i1Var.f(8);
        d40 d40Var = d60Var.H;
        if (!d40Var.N && !d40Var.e) {
            keyboardHeight = 0;
        } else {
            keyboardHeight = d40Var.getKeyboardHeight();
        }
        int max = Math.max(f10.d, keyboardHeight);
        ViewGroup.LayoutParams layoutParams = d60Var.f32924b2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f7.d;
        }
        if (d40Var.getEmojiView() != null) {
            d40Var.getEmojiView().setBottomInset(f7.d);
        }
        if (d60Var.S2) {
            ViewGroup viewGroup = d60Var.containerView;
            int i10 = d60Var.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
        } else {
            ViewGroup viewGroup2 = d60Var.containerView;
            int i11 = d60Var.backgroundPaddingLeft;
            viewGroup2.setPadding(f7.f10576a + i11, f7.f10577b, i11 + f7.f10578c, f7.d);
        }
        d60Var.containerView.requestLayout();
        if (max == 0 && !d40Var.N && !d40Var.e && !d40Var.O) {
            d40Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.qk0 qk0Var = d60Var.K;
            if (qk0Var == null) {
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                qk0Var = null;
                if (R != null) {
                    org.telegram.ui.Components.qk0 qk0Var2 = new org.telegram.ui.Components.qk0(1, d60Var.currentAccount, d60Var.getContext(), R, d60Var.resourcesProvider);
                    d60Var.K = qk0Var2;
                    qk0Var2.setDelegate(new f50(d60Var));
                    d60Var.containerView.addView(d60Var.K, w7.y5.e(-2, 52, 81));
                    d60Var.K.p(null, null, false);
                    d60Var.G.bringToFront();
                    d60Var.F.bringToFront();
                    qk0Var = d60Var.K;
                }
            }
            d60Var.K = qk0Var;
        }
        d40Var.H(f10.d, false);
        d60Var.C1.i(l1Var);
        return r0.l1.f42125b;
    }

    public final void A1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall inputGroupCall;
        long j3;
        this.H.setText("");
        ChatObject.Call call = this.f32919a1;
        if (call != null && call.call != null && (inputGroupCall = call.getInputGroupCall()) != null) {
            ChatObject.Call call2 = this.f32919a1;
            long j10 = call2.call.f18331id;
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
        v30 v30Var = this.a2;
        if (v30Var == null) {
            f10 = 0.0f;
        } else {
            f10 = v30Var.f29454c;
        }
        float max = Math.max(f7, f10);
        int i12 = org.telegram.ui.ActionBar.h6.f19162jg;
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.h6.f19107gg;
        int offsetColor = AndroidUtilities.getOffsetColor(w02, org.telegram.ui.ActionBar.h6.w0(null, i13, false), f7, 1.0f);
        this.V1 = offsetColor;
        this.N.setBackgroundColor(offsetColor);
        this.f32960k1.B(-14472653);
        this.f32940f0.setColorFilter(new PorterDuffColorFilter(this.V1, PorterDuff.Mode.MULTIPLY));
        this.navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false), org.telegram.ui.ActionBar.h6.w0(null, i13, false), max, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19182kg, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19349tg, false), f7, 1.0f);
        o50 o50Var = this.f32978p0;
        if (o50Var != null) {
            o50Var.f36032j = offsetColor2;
            n50 n50Var = o50Var.f36030g;
            if (n50Var != null) {
                n50Var.invalidate();
            }
        }
        this.C0.setColor(offsetColor2);
        this.E.setColor(offsetColor2);
        this.F.invalidate();
        j50 j50Var = this.Q;
        j50Var.setGlowColor(offsetColor2);
        int i14 = this.F1;
        if (i14 == 3 || p1(i14)) {
            this.f33008w.invalidate();
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
        int offsetColor3 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Dg, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Eg, false), f7, 1.0f);
        this.f32991s.a(offsetColor3, offsetColor3);
        int offsetColor4 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19200lg, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19255og, false), f7, 1.0f);
        int offsetColor5 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19219mg, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19312rg, false), f7, 1.0f);
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, this.resourcesProvider);
        int childCount = j50Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = j50Var.getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Cells.x3) {
                org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) childAt;
                if (o1()) {
                    x3Var.a(v02, v02);
                } else {
                    x3Var.a(offsetColor5, offsetColor4);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.e4;
                z40 z40Var = this.O;
                if (z10) {
                    org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) childAt;
                    if (z40Var.getTag() != null) {
                        i11 = org.telegram.ui.ActionBar.h6.f19312rg;
                    } else {
                        i11 = org.telegram.ui.ActionBar.h6.f19219mg;
                    }
                    e4Var.f(i11, offsetColor5);
                } else if (childAt instanceof org.telegram.ui.Cells.w3) {
                    org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) childAt;
                    if (z40Var.getTag() != null) {
                        i10 = org.telegram.ui.ActionBar.h6.f19312rg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.h6.f19219mg;
                    }
                    w3Var.a(i10, offsetColor5);
                }
            }
        }
        this.containerView.invalidate();
        j50Var.invalidate();
        this.container.invalidate();
    }

    public final void C1(float f7) {
        j50 j50Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        s4.c1 K;
        f7 = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) ? 0.0f : 0.0f;
        float min = (float) (Math.min(8500.0d, 4000.0f * f7) / 8500.0d);
        this.P0 = min;
        this.Q0 = (min - this.O0) / 265.0f;
        ChatObject.Call call = this.f32919a1;
        if (call != null && (j50Var = this.Q) != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(MessageObject.getPeerId(this.A0))) != null) {
            v30 v30Var = this.a2;
            if (!v30Var.f29452b) {
                if (this.f32992s0) {
                    arrayList = this.D0;
                } else {
                    arrayList = this.f32919a1.visibleParticipants;
                }
                int indexOf = arrayList.indexOf(groupCallParticipant);
                if (indexOf >= 0 && (K = j50Var.K(indexOf + this.P.d)) != null) {
                    View view = K.f42946a;
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        ((org.telegram.ui.Cells.e4) view).setAmplitude(f7 * 15.0f);
                        if (view == this.X2 && !this.f32964l2) {
                            this.containerView.invalidate();
                        }
                    }
                }
            } else {
                int i10 = 0;
                while (true) {
                    r30 r30Var = this.f32967m2;
                    if (i10 >= r30Var.getChildCount()) {
                        break;
                    }
                    org.telegram.ui.Components.s20 s20Var = (org.telegram.ui.Components.s20) r30Var.getChildAt(i10);
                    if (MessageObject.getPeerId(s20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                        s20Var.setAmplitude(f7 * 15.0f);
                    }
                    i10++;
                }
            }
            v30Var.k(groupCallParticipant, f7 * 15.0f);
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        if (i10 == 2) {
            Y0();
            W0();
            X0();
            float f11 = 1.0f - this.f33025z3.e;
            i30 i30Var = this.e;
            i30Var.setAlpha(f11);
            this.a2.setProgressToHideUi(f7);
            this.f32967m2.invalidate();
            this.containerView.invalidate();
            i30Var.invalidate();
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

    public final void D1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        this.f32947g3 = i10;
        this.f32951h3 = i11;
        this.f32955i3 = i12;
        this.j3 = i13;
        this.f32962k3 = i14;
        this.f32965l3 = i15;
        this.f32968m3 = i16;
        this.f32973n3 = i17;
        this.f32977o3 = i18;
        this.f32981p3 = i19;
        this.f32985q3 = i20;
        this.f32990r3 = i21;
        this.f32995s3 = i22;
        this.f32999t3 = i23;
        this.f33003u3 = i24;
        this.f33007v3 = i25;
    }

    public final void E1(float f7) {
        j50 j50Var;
        int dp;
        int i10;
        float f10;
        this.f33019y0 = f7;
        this.Q.setTopGlowOffset((int) (f7 - ((FrameLayout.LayoutParams) j50Var.getLayoutParams()).topMargin));
        float dp2 = f7 - AndroidUtilities.dp(74.0f);
        s50 s50Var = this.U0;
        v30 v30Var = this.a2;
        p30 p30Var = this.f32941f1;
        n30 n30Var = this.f32936e1;
        if (this.backgroundPaddingTop + dp2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) - dp2) - this.backgroundPaddingTop) / (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f))));
            if (AndroidUtilities.isTablet()) {
                f10 = 17.0f;
            } else {
                f10 = 13.0f;
            }
            i10 = (int) (AndroidUtilities.dp(f10) * min);
            if (s50Var != null) {
                s50Var.setShadowOffset((int) (AndroidUtilities.dp(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.U1) > 1.0E-4f) {
                B1(Math.min(1.0f, min));
            }
            float f11 = 1.0f - ((0.1f * min) * 1.2f);
            n30Var.setScaleX(Math.max(0.9f, f11));
            n30Var.setScaleY(Math.max(0.9f, f11));
            float f12 = 1.0f - (min * 1.2f);
            n30Var.setAlpha((1.0f - v30Var.f29454c) * Math.max(0.0f, f12));
            p30Var.setScaleX(Math.max(0.9f, f11));
            p30Var.setScaleY(Math.max(0.9f, f11));
            p30Var.setAlpha((1.0f - v30Var.f29454c) * Math.max(0.0f, f12));
        } else {
            n30Var.setScaleX(1.0f);
            n30Var.setScaleY(1.0f);
            n30Var.setAlpha(1.0f - v30Var.f29454c);
            p30Var.setScaleX(1.0f);
            p30Var.setScaleY(1.0f);
            p30Var.setAlpha(1.0f - v30Var.f29454c);
            if (this.U1 > 1.0E-4f) {
                B1(0.0f);
            }
            i10 = 0;
        }
        Y0();
        float f13 = i10;
        this.f33023z1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(53.0f)) - f13));
        this.f32957j1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f13));
        if (s50Var != null) {
            s50Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), f7 - AndroidUtilities.dp(37.0f)));
        }
        m40 m40Var = this.R;
        if (m40Var != null) {
            m40Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f13));
        }
        this.containerView.invalidate();
        Q1();
    }

    public final boolean F1(android.view.View r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d60.F1(android.view.View):boolean");
    }

    public final void G1(View view) {
        if (this.m0 == null) {
            org.telegram.ui.Components.j40 j40Var = new org.telegram.ui.Components.j40(8, getContext(), null, true);
            this.m0 = j40Var;
            j40Var.setAlpha(0.0f);
            this.m0.setVisibility(4);
            this.m0.setShowingDuration(3000L);
            this.containerView.addView(this.m0, w7.y5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
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
        ChatObject.Call call = this.f32919a1;
        org.telegram.ui.Components.voip.w2 w2Var = this.v;
        org.telegram.ui.Components.voip.w2 w2Var2 = this.h;
        org.telegram.ui.Components.voip.w2 w2Var3 = this.f32986r;
        org.telegram.ui.Components.voip.w2 w2Var4 = this.f32939f;
        org.telegram.ui.Components.voip.w2 w2Var5 = this.f32969n;
        org.telegram.ui.Components.voip.w2 w2Var6 = this.f32991s;
        org.telegram.ui.Components.voip.w2 w2Var7 = this.f33008w;
        boolean z19 = true;
        i30 i30Var = this.e;
        boolean z20 = false;
        if (call != null && !call.isScheduled()) {
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f32919a1.participants.f(MessageObject.getPeerId(this.A0));
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !Q0()) {
                z14 = true;
            } else {
                z14 = false;
            }
            Boolean bool = this.f33017x3;
            if (bool != null) {
                z15 = bool.booleanValue();
            } else {
                TLRPC.GroupCall groupCall = this.f32919a1.call;
                if (groupCall != null && groupCall.messages_enabled) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            if (((!z14 && this.f32919a1.canRecordVideo()) || z13) && !r1()) {
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
            i30Var.c(w2Var7, true, z10);
            i30Var.c(w2Var6, true, z10);
            i30Var.c(w2Var5, z16, z10);
            i30Var.c(w2Var4, z18, z10);
            i30Var.c(w2Var3, z20, z10);
            i30Var.c(w2Var2, z17, z10);
            i30Var.c(w2Var, z15, z10);
            return;
        }
        if (this.V0 > 0.1f) {
            z11 = true;
        } else {
            z11 = false;
        }
        i30Var.c(w2Var7, z11, z10);
        if (this.V0 > 0.1f) {
            z12 = true;
        } else {
            z12 = false;
        }
        i30Var.c(w2Var6, z12, z10);
        if (this.V0 <= 0.1f) {
            z19 = false;
        }
        i30Var.c(w2Var3, z19, z10);
        i30Var.c(w2Var5, false, z10);
        i30Var.c(w2Var4, false, z10);
        i30Var.c(w2Var2, false, z10);
        i30Var.c(w2Var, false, z10);
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
        ChatObject.Call call2 = this.f32919a1;
        org.telegram.ui.ActionBar.u0 u0Var = this.f32960k1;
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f32966m1;
        if (call2 == null || call2.isScheduled()) {
            this.l1.setVisibility(4);
            u0Var2.setVisibility(8);
            if (this.f32919a1 == null) {
                u0Var.setVisibility(8);
                return;
            }
        }
        if (this.f32963l0) {
            return;
        }
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat4 = accountInstance.getMessagesController().getChat(Long.valueOf(i1()));
        if (chat4 != null) {
            this.Z0 = chat4;
        }
        boolean canUserDoAdminAction = ChatObject.canUserDoAdminAction(this.Z0, 3);
        org.telegram.ui.ActionBar.e1 e1Var = this.f32971n1;
        if (!canUserDoAdminAction && (((ChatObject.isChannel(this.Z0) && ((chat3 = this.Z0) == null || !chat3.megagroup)) || (!ChatObject.isPublic(this.Z0) && !ChatObject.canUserDoAdminAction(this.Z0, 3))) && (!ChatObject.isChannel(this.Z0) || (chat2 = this.Z0) == null || chat2.megagroup || !ChatObject.isPublic(chat2)))) {
            e1Var.setVisibility(8);
        } else {
            e1Var.setVisibility(0);
        }
        ChatObject.Call call3 = this.f32919a1;
        org.telegram.ui.ActionBar.e1 e1Var2 = this.f33020y1;
        org.telegram.ui.ActionBar.e1 e1Var3 = this.f33015x1;
        if (call3 != null && (groupCall2 = call3.call) != null && groupCall2.can_change_messages_enabled) {
            if (groupCall2.messages_enabled) {
                i13 = 8;
            } else {
                i13 = 0;
            }
            e1Var3.setVisibility(i13);
            if (this.f32919a1.call.messages_enabled) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            e1Var2.setVisibility(i14);
        } else {
            e1Var3.setVisibility(8);
            e1Var2.setVisibility(8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f32919a1.participants.f(MessageObject.getPeerId(this.A0));
        ChatObject.Call call4 = this.f32919a1;
        org.telegram.ui.ActionBar.e1 e1Var4 = this.f32983q1;
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
        boolean Q0 = Q0();
        org.telegram.ui.ActionBar.e1 e1Var5 = this.f33010w1;
        org.telegram.ui.ActionBar.e1 e1Var6 = this.f32975o1;
        boolean z12 = true;
        org.telegram.ui.ActionBar.e1 e1Var7 = this.f32993s1;
        org.telegram.ui.ActionBar.e1 e1Var8 = this.f32997t1;
        if (Q0) {
            e1Var5.setVisibility(0);
            e1Var6.setVisibility(0);
            if (r1()) {
                e1Var7.setVisibility(0);
                e1Var8.setVisibility(8);
            } else if (this.f32919a1.isScheduled()) {
                e1Var7.setVisibility(8);
                e1Var8.setVisibility(8);
            } else {
                e1Var7.setVisibility(0);
            }
            if (o1()) {
                e1Var7.setVisibility(8);
                e1Var6.setVisibility(8);
            }
            if (this.f32919a1.canRecordVideo() && !this.f32919a1.isScheduled() && !r1()) {
                e1Var8.setVisibility(0);
            } else {
                e1Var8.setVisibility(8);
            }
            u0Var2.setVisibility(8);
            boolean z13 = this.f32919a1.recording;
            y50 y50Var = this.f32932d1;
            y50Var.f40043f = z13;
            y50Var.d = 1.0f;
            y50Var.invalidateSelf();
            if (this.f32919a1.recording) {
                if (this.D1 == null) {
                    q20 q20Var = new q20(this, 6);
                    this.D1 = q20Var;
                    AndroidUtilities.runOnUIThread(q20Var, 1000L);
                }
                e1Var7.setText(LocaleController.getString(R.string.VoipGroupStopRecordCall));
            } else {
                q20 q20Var2 = this.D1;
                if (q20Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(q20Var2);
                    this.D1 = null;
                }
                e1Var7.setText(LocaleController.getString(R.string.VoipGroupRecordCall));
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                e1Var8.g(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
            } else {
                e1Var8.g(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
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
            if (!z10 && ((this.f32919a1.canRecordVideo() || z11) && !this.f32919a1.isScheduled() && !r1())) {
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
        boolean Q02 = Q0();
        org.telegram.ui.ActionBar.e1 e1Var9 = this.f32988r1;
        if (Q02 && this.f32919a1.call.can_change_join_muted && !o1()) {
            e1Var9.setVisibility(0);
        } else {
            e1Var9.setVisibility(8);
        }
        if (o1() && ((call = this.f32919a1) == null || (groupCall = call.call) == null || !groupCall.creator)) {
            z12 = false;
        }
        u0Var.I(4, z12);
        if (r1() && !this.f32919a1.isScheduled()) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        this.f32979p1.setVisibility(i12);
        int visibility = e1Var6.getVisibility();
        TextView textView = this.A1;
        if (visibility != 0 && e1Var9.getVisibility() != 0 && e1Var.getVisibility() != 0 && e1Var8.getVisibility() != 0 && e1Var7.getVisibility() != 0 && e1Var5.getVisibility() != 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.f32959k0;
        if (((sharedInstance != null && VoIPService.getSharedInstance().hasFewPeers) || this.f32923b1) && !r1() && this.A0 != null) {
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
        if (chat5 != null && !ChatObject.isChannelOrGiga(chat5) && r1() && e1Var.getVisibility() == 8) {
            u0Var.setVisibility(8);
        } else {
            u0Var.setVisibility(0);
        }
        LinearLayout linearLayout = this.f32957j1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f7 = 96;
        if (layoutParams.rightMargin != AndroidUtilities.dp(f7)) {
            layoutParams.rightMargin = AndroidUtilities.dp(f7);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.f33023z1.getLayoutParams()).rightMargin = 0;
        this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
    }

    public final void J1(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d60.J1(int, boolean):void");
    }

    public final void K1() {
        if (this.f32919a1 == null) {
            return;
        }
        int currentTime = this.d.getConnectionsManager().getCurrentTime();
        ChatObject.Call call = this.f32919a1;
        int i10 = currentTime - call.call.record_start_date;
        boolean z10 = call.recording;
        org.telegram.ui.ActionBar.e1 e1Var = this.f32993s1;
        if (z10) {
            e1Var.setSubtext(AndroidUtilities.formatDuration(i10, false));
        } else {
            e1Var.setSubtext(null);
        }
    }

    public final void L1(boolean z10) {
        float interpolation;
        float f7;
        m40 m40Var = this.R;
        if ((m40Var == null || this.f32919a1 != null) && this.X0 == null) {
            this.W0 = 1.0f;
            this.V0 = 1.0f;
            if (m40Var == null) {
                return;
            }
        }
        int i10 = 4;
        if (!z10) {
            m30 m30Var = this.f33011w2;
            AndroidUtilities.cancelRunOnUIThread(m30Var);
            m30Var.run();
            ChatObject.Call call = this.f32919a1;
            j50 j50Var = this.Q;
            if (call != null && !call.isScheduled()) {
                j50Var.setVisibility(0);
            } else {
                j50Var.setVisibility(4);
            }
            boolean isChannelOrGiga = ChatObject.isChannelOrGiga(this.Z0);
            org.telegram.ui.ActionBar.e1 e1Var = this.f33010w1;
            if (isChannelOrGiga) {
                e1Var.setText(LocaleController.getString(R.string.VoipChannelCancelChat));
            } else {
                e1Var.setText(LocaleController.getString(R.string.VoipGroupCancelChat));
            }
        }
        float f10 = this.V0;
        if (f10 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.rr.f28022f.getInterpolation((f10 - 0.6f) / 0.4f) * 0.05f);
            this.W0 = 1.0f;
            f7 = 1.0f;
        } else {
            org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f28022f;
            this.W0 = rrVar.getInterpolation(f10 / 0.6f);
            interpolation = 1.05f * rrVar.getInterpolation(this.V0 / 0.6f);
            f7 = this.V0 / 0.6f;
        }
        H1(true);
        float f11 = 1.0f - f7;
        m40Var.setAlpha(f11);
        this.U.setAlpha(f7);
        this.W.setAlpha(f7);
        i50 i50Var = this.V;
        i50Var.setAlpha(f7);
        i50Var.setScaleX(interpolation);
        i50Var.setScaleY(interpolation);
        k40 k40Var = this.T;
        k40Var.setScaleX(f11);
        k40Var.setScaleY(f11);
        k40Var.setAlpha(f11);
        this.S.setAlpha(f11);
        this.f32960k1.setAlpha(f7);
        if (f11 != 0.0f) {
            i10 = 0;
        }
        if (i10 != m40Var.getVisibility()) {
            m40Var.setVisibility(i10);
            k40Var.setVisibility(i10);
        }
    }

    public final void M1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        org.telegram.ui.Components.voip.w2 w2Var = this.f32986r;
        if (w2Var != null && w2Var.getVisibility() == 0) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            i30 i30Var = this.e;
            boolean z14 = false;
            if (sharedInstance != null && !r1()) {
                kh.a aVar = (kh.a) i30Var.f13636c.get(w2Var);
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
                h1();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.isBluetoothHeadsetConnected()) {
                    i10 = R.drawable.filled_calls_bluetooth_s;
                } else {
                    i10 = R.drawable.filled_sound_on;
                }
                if (this.f32918a0 != i10) {
                    this.f32918a0 = i10;
                    AndroidUtilities.updateImageViewImageAnimated(this.f32922b0, i10);
                }
                org.telegram.ui.Components.voip.w2 w2Var2 = this.h;
                if (w2Var2.getVisibility() == 0) {
                    w2Var2.c(0, -1, 0, 1.0f, true, f1(h1()), false, z10);
                    if (h1() != 1) {
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
            kh.a aVar2 = (kh.a) i30Var.f13636c.get(w2Var);
            if (aVar2 != null) {
                aVar2.d.a(z11, z10);
                w2Var.setEnabled(z11);
            }
            w2Var.b(true, false);
        }
    }

    public final void N1(boolean r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d60.N1(boolean, boolean):void");
    }

    public final void O0(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d60.O0(boolean):void");
    }

    public final void O1() {
        boolean z10;
        String str;
        float f7;
        float f10;
        b60 b60Var;
        TLRPC.User user;
        TLRPC.Chat chat;
        z40 z40Var = this.O;
        if (z40Var != null && this.f32919a1 != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            int i10 = 0;
            for (int i11 = 0; i11 < this.f32919a1.currentSpeakingPeers.m(); i11++) {
                long j3 = this.f32919a1.currentSpeakingPeers.j(i11);
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f32919a1.currentSpeakingPeers.f(j3);
                if (!groupCallParticipant.self) {
                    v30 v30Var = this.a2;
                    v30Var.getClass();
                    if (v30Var.f29478w.get(MessageObject.getPeerId(groupCallParticipant.peer)) <= 0 && this.B2.get(j3, 0) != 1) {
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
                z40Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.h5 subtitleTextView = z40Var.getSubtitleTextView();
            if (r1()) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            int i13 = this.f32919a1.call.participants_count;
            x50 x50Var = this.P;
            subtitleTextView.k(LocaleController.formatPluralString(str, i13 + ((x50Var.M.r1() || x50Var.L || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined()), new Object[0]));
            if (r1() && (b60Var = this.B1) != null) {
                b60Var.setWatchersCount(this.f32919a1.call.participants_count);
            }
            if (z10 != this.f33002u2) {
                this.f33002u2 = z10;
                z40Var.invalidate();
                float f11 = 0.0f;
                z40Var.getSubtitleTextView().setPivotX(0.0f);
                z40Var.getSubtitleTextView().setPivotY(z40Var.getMeasuredHeight() >> 1);
                ViewPropertyAnimator animate = z40Var.getSubtitleTextView().animate();
                if (this.f33002u2) {
                    f7 = 0.98f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f7);
                if (this.f33002u2) {
                    f10 = 0.9f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f10);
                if (!this.f33002u2) {
                    f11 = 1.0f;
                }
                scaleY.alpha(f11).setDuration(150L);
                AndroidUtilities.updateViewVisibilityAnimated(z40Var.getAdditionalSubtitleTextView(), this.f33002u2);
            }
        }
    }

    public final int P0() {
        j50 j50Var = this.Q;
        int childCount = j50Var.getChildCount();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = j50Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0) {
                i10 = Math.min(i10, childAt.getTop());
            }
        }
        return i10;
    }

    public final void P1(boolean z10) {
        ChatObject.Call call = this.f32919a1;
        n30 n30Var = this.f32936e1;
        if (call == null) {
            if (ChatObject.isChannelOrGiga(this.Z0)) {
                n30Var.b(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), z10);
                return;
            } else {
                n30Var.b(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), z10);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(call.call.title);
        z40 z40Var = this.O;
        if (!isEmpty) {
            if (!this.f32919a1.call.title.equals(z40Var.getTitle())) {
                if (z10) {
                    this.O.J(this.f32919a1.call.title, true, 180L, null);
                    z40Var.getTitleTextView().setOnClickListener(new o20(this, 8));
                } else {
                    z40Var.setTitle(this.f32919a1.call.title);
                }
                n30Var.b(this.f32919a1.call.title, z10);
            }
        } else {
            TLRPC.Chat chat = this.Z0;
            if (chat != null && !chat.title.equals(z40Var.getTitle())) {
                if (z10) {
                    this.O.J(this.Z0.title, true, 180L, null);
                    z40Var.getTitleTextView().setOnClickListener(new o20(this, 9));
                } else {
                    z40Var.setTitle(this.Z0.title);
                }
                if (ChatObject.isChannelOrGiga(this.Z0)) {
                    if (r1()) {
                        n30Var.b(this.Z0.title, z10);
                    } else {
                        n30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), z10);
                    }
                } else {
                    n30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), z10);
                }
            } else if (this.Z0 == null) {
                z40Var.setTitle(LocaleController.getString(R.string.ConferenceChat));
                n30Var.b(LocaleController.getString(R.string.ConferenceChat), z10);
            }
        }
        org.telegram.ui.ActionBar.h5 titleTextView = z40Var.getTitleTextView();
        if (this.f32919a1.recording) {
            if (titleTextView.getRightDrawable() == null) {
                titleTextView.i(new z50(titleTextView));
                TextView textView = n30Var.getTextView();
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new z50(textView), (Drawable) null);
                TextView nextTextView = n30Var.getNextTextView();
                nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new z50(nextTextView), (Drawable) null);
            }
        } else if (titleTextView.getRightDrawable() != null) {
            titleTextView.i(null);
            n30Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            n30Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final boolean Q0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            ChatObject.Call call = this.f32919a1;
            if (call != null && (groupCall = call.call) != null && groupCall.creator) {
                return true;
            }
            return false;
        }
        return ChatObject.canManageCalls(this.Z0);
    }

    public final void Q1() {
        float f7;
        org.telegram.ui.Components.ub ubVar;
        boolean z10;
        if (this.topBulletinContainer != null) {
            int dp = AndroidUtilities.dp(74.0f);
            float f10 = this.f33019y0 - dp;
            if (this.backgroundPaddingTop + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                int dp2 = (dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f);
                f7 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - this.backgroundPaddingTop) / dp2);
                f10 -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp2) * f7);
            } else {
                f7 = 0.0f;
            }
            float paddingTop = f10 + this.containerView.getPaddingTop();
            FrameLayout frameLayout = this.topBulletinContainer;
            z40 z40Var = this.O;
            frameLayout.setTranslationY(AndroidUtilities.lerp(((-frameLayout.getTop()) - this.topBulletinContainer.getHeight()) + paddingTop + AndroidUtilities.dp(10.0f), z40Var.getY() + (-this.topBulletinContainer.getTop()) + z40Var.getHeight(), f7));
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f27564w;
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

    public final void R0() {
        if (this.R1) {
            this.R1 = false;
            AndroidUtilities.cancelRunOnUIThread(this.f33021y2);
        }
        if (this.S1) {
            this.S1 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.f33008w.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void S0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d60.S0():void");
    }

    public final void T0() {
        this.F.setTranslationY((-this.C1.c()) + this.containerView.getPaddingBottom());
        this.G.invalidate();
        Z0();
        Y0();
        W0();
        X0();
        a1();
        this.e.setAlpha(1.0f - this.f33025z3.e);
        U0();
        V0();
    }

    public final void U0() {
        int i10;
        float f7 = this.C1.f41326b.f14209a;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        g40 g40Var = this.F;
        g40Var.setAlpha(f7);
        f40 f40Var = this.G;
        f40Var.setAlpha(f7);
        if (g40Var.getVisibility() != i10) {
            g40Var.setVisibility(i10);
            f40Var.setVisibility(i10);
            if (i10 == 8) {
                d40 d40Var = this.H;
                if (d40Var.isFocused()) {
                    d40Var.clearFocus();
                }
            }
        }
    }

    public final void V0() {
        int i10;
        org.telegram.ui.Components.qk0 qk0Var = this.K;
        if (qk0Var != null) {
            float f7 = this.C1.f41326b.f14209a * this.A3.e;
            qk0Var.setAlpha(f7);
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
            org.telegram.ui.Components.qk0 qk0Var2 = this.K;
            if (!qk0Var2.N0 && f7 == 1.0f) {
                qk0Var2.N0 = true;
            }
        }
    }

    public final void W0() {
        boolean z10 = G3;
        i30 i30Var = this.e;
        if (z10) {
            i30Var.setTranslationX(0.0f);
            i30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        le.c cVar = this.f33025z3;
        if (z11) {
            i30Var.setTranslationX(cVar.e * AndroidUtilities.dp(94.0f));
            i30Var.setTranslationY(0.0f);
            return;
        }
        i30Var.setTranslationX(0.0f);
        i30Var.setTranslationY(cVar.e * AndroidUtilities.dp(94.0f));
    }

    public final void X0() {
        boolean z10 = G3;
        r30 r30Var = this.f32967m2;
        if (z10) {
            r30Var.setTranslationX(0.0f);
            r30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        le.c cVar = this.f33025z3;
        if (z11) {
            r30Var.setTranslationX(cVar.e * AndroidUtilities.dp(94.0f));
            r30Var.setTranslationY(0.0f);
            return;
        }
        r30Var.setTranslationX(0.0f);
        r30Var.setTranslationY(cVar.e * AndroidUtilities.dp(94.0f));
    }

    public final void Y0() {
        float dp;
        float f7 = this.B3.e;
        ph.i iVar = this.C1;
        float f10 = -((iVar.c() - this.containerView.getPaddingBottom()) + f7 + (AndroidUtilities.dp(68.0f) * this.A3.e) + AndroidUtilities.dp(10.0f));
        if (G3) {
            dp = (1.0f - this.C3.e) * AndroidUtilities.dp(-91.0f);
        } else if (F3) {
            dp = 0.0f;
        } else {
            dp = ((this.f33025z3.e * AndroidUtilities.dp(94.0f)) - (AndroidUtilities.dp(104.0f) * this.a2.f29454c)) - AndroidUtilities.dp(91.0f);
        }
        float lerp = AndroidUtilities.lerp(dp, f10, iVar.f41326b.f14209a);
        float measuredHeight = ((this.containerView.getMeasuredHeight() - this.f33019y0) + lerp) - this.backgroundPaddingTop;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - AndroidUtilities.dp(250.0f));
        lh.h hVar = this.f32927c0;
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
        org.telegram.ui.Components.voip.u uVar = this.Z2;
        if (uVar != null) {
            uVar.f29633a.setRoundCorners(AndroidUtilities.dp(8.0f));
            org.telegram.ui.Components.voip.u uVar2 = this.Z2;
            uVar2.h = false;
            uVar2.j(false);
            this.Z2.invalidate();
            this.a2.invalidate();
        }
        org.telegram.ui.Cells.e4 e4Var = this.X2;
        if (e4Var != null && !this.f32925b3 && e4Var.getParent() != null) {
            this.containerView.removeView(this.X2);
        }
        org.telegram.ui.Cells.e4 e4Var2 = this.X2;
        if (e4Var2 != null) {
            e4Var2.setProgressToAvatarPreview(0.0f);
            this.X2.setAboutVisible(false);
            this.X2.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.s20 s20Var = this.f32920a3;
        if (s20Var != null) {
            s20Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.X2 = null;
        this.Y2 = null;
        this.f32920a3 = null;
        this.Z2 = null;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return !this.a2.f29452b;
    }

    public final void d1(boolean z10) {
        if (!this.f32930c3 && this.f32942f2) {
            if (z10) {
                this.f32930c3 = true;
                y1(false, this.X2);
                return;
            }
            b1();
            this.containerView.removeView(this.f32937e2);
            this.f32937e2 = null;
            this.C2.setVisibility(8);
            this.containerView.invalidate();
            this.f32942f2 = false;
            this.Y.X = true;
            this.Q.invalidate();
            this.f32924b2.setVisibility(8);
            if (this.f32992s0) {
                this.f32992s0 = false;
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
        j50 j50Var = this.Q;
        int i19 = 0;
        if (i10 == i18) {
            Long l4 = (Long) objArr[1];
            ChatObject.Call call = this.f32919a1;
            if (call != null && call.call.f18331id == l4.longValue()) {
                ChatObject.Call call2 = this.f32919a1;
                if (call2.call instanceof TLRPC.TL_groupCallDiscarded) {
                    dismiss();
                    return;
                }
                long j3 = this.f32996t0;
                AccountInstance accountInstance = this.d;
                if (j3 == 0 && (((i17 = this.F1) == 7 || i17 == 5 || i17 == 6) && !call2.isScheduled())) {
                    try {
                        Intent intent = new Intent(this.f32952i0, VoIPService.class);
                        intent.putExtra("chat_id", i1());
                        intent.putExtra("createGroupCall", false);
                        intent.putExtra("hasFewPeers", this.f32923b1);
                        intent.putExtra("peerChannelId", this.Y0.channel_id);
                        intent.putExtra("peerChatId", this.Y0.chat_id);
                        intent.putExtra("peerUserId", this.Y0.user_id);
                        intent.putExtra("hash", this.f32928c1);
                        intent.putExtra("peerAccessHash", this.Y0.access_hash);
                        intent.putExtra("is_outgoing", true);
                        intent.putExtra("start_incall_activity", false);
                        intent.putExtra("account", accountInstance.getCurrentAccount());
                        intent.putExtra("scheduleDate", this.f32961k2);
                        this.f32952i0.startService(intent);
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                    }
                    this.f32996t0 = SystemClock.elapsedRealtime();
                    AndroidUtilities.runOnUIThread(new q20(this, 2), 3000L);
                }
                if (!this.f33000u0 && VoIPService.getSharedInstance() != null) {
                    this.f32919a1.addSelfDummyParticipant(false);
                    l1();
                    VoIPService.getSharedInstance().playConnectedSound();
                }
                I1();
                int childCount = j50Var.getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt = j50Var.getChildAt(i20);
                    if (childAt instanceof org.telegram.ui.Cells.e4) {
                        ((org.telegram.ui.Cells.e4) childAt).a(true, false);
                    }
                }
                if (this.X2 != null) {
                    this.f32992s0 = true;
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
                                        if (dialog.f18325id == longValue) {
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
                                    if (this.f32919a1.call.participants_count < 250 || UserObject.isContact(user) || user.verified || i19 != 0) {
                                        k1().k(0L, 44, user, this.Z0, null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(-longValue));
                            if (chat != null) {
                                if (this.f32919a1.call.participants_count < 250 || !ChatObject.isNotInChat(chat) || chat.verified || i19 != 0) {
                                    k1().k(0L, 44, chat, this.Z0, null, null);
                                }
                            }
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.groupCallSpeakingUsersUpdated) {
            v30 v30Var = this.a2;
            if (v30Var.f29452b && this.f32919a1 != null) {
                boolean c10 = v30Var.c();
                ChatObject.Call call3 = this.f32919a1;
                if (call3 != null && v30Var.f29452b && (videoParticipant = v30Var.e) != null && call3.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer)) == null) {
                    c10 = true;
                }
                if (c10) {
                    ChatObject.VideoParticipant videoParticipant2 = null;
                    int i22 = 0;
                    while (true) {
                        ArrayList arrayList = this.f32982q0;
                        if (i22 >= arrayList.size()) {
                            break;
                        }
                        ChatObject.VideoParticipant videoParticipant3 = (ChatObject.VideoParticipant) arrayList.get(i22);
                        if (this.f32919a1.currentSpeakingPeers.g(null, MessageObject.getPeerId(videoParticipant3.participant.peer)) != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = videoParticipant3.participant;
                            if (!groupCallParticipant3.muted_by_you && v30Var.d != MessageObject.getPeerId(groupCallParticipant3.peer)) {
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
            v30Var.setVisibleParticipant(true);
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
                AlertDialog$Builder N = org.telegram.ui.Components.e5.N(getContext(), LocaleController.getString(R.string.VoipGroupVoiceChat), string);
                N.j(new u20(this, 1));
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
            if (chatFull.f18322id == i1()) {
                I1();
                N1(isShowing(), false);
            }
            long peerId = MessageObject.getPeerId(this.A0);
            ChatObject.Call call4 = this.f32919a1;
            if (call4 != null && chatFull.f18322id == (-peerId) && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) call4.participants.f(peerId)) != null) {
                groupCallParticipant2.about = chatFull.about;
                O0(true);
                AndroidUtilities.updateVisibleRows(j50Var);
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
            if (((Long) objArr[0]).longValue() == i1()) {
                I1();
                N1(isShowing(), false);
            }
        } else if (i10 == NotificationCenter.applyGroupCallVisibleParticipants) {
            int childCount2 = j50Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i19 < childCount2) {
                s4.c1 G = j50Var.G(j50Var.getChildAt(i19));
                if (G != null) {
                    View view = G.f42946a;
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
            if (this.f32919a1 != null && peerId2 == l11.longValue() && (groupCallParticipant = (TLRPC.GroupCallParticipant) this.f32919a1.participants.f(peerId2)) != null) {
                groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
                O0(true);
                AndroidUtilities.updateVisibleRows(j50Var);
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
            O0(true);
            AndroidUtilities.updateVisibleRows(j50Var);
        } else if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0) {
                O0(true);
            }
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (intValue & MessagesController.UPDATE_MASK_EMOJI_STATUS) != 0) {
                AndroidUtilities.updateVisibleRows(j50Var);
            }
        } else if (i10 == NotificationCenter.groupCallScreencastStateChanged) {
            p40 p40Var = this.f33022z0;
            if (p40Var != null) {
                p40Var.b(true, true);
            }
            I1();
        } else if (i10 == NotificationCenter.conferenceEmojiUpdated) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            o50 o50Var = this.f32978p0;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            o50Var.b(strArr);
        }
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity = this.f32952i0;
        launchActivity.f31087a1.remove(this.f33006v2);
        this.f32952i0.setRequestedOrientation(-1);
        E3 = false;
        org.telegram.ui.Components.s30 s30Var = this.E1;
        if (s30Var != null) {
            s30Var.dismiss();
        }
        this.f32992s0 = true;
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
        v30 v30Var = this.a2;
        if (v30Var != null) {
            if (this.f32984q2 != null) {
                this.Q.getViewTreeObserver().removeOnPreDrawListener(this.f32984q2);
                this.f32984q2 = null;
            }
            ArrayList arrayList = this.Z1;
            arrayList.clear();
            ArrayList arrayList2 = this.Y1;
            arrayList.addAll(arrayList2);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).f();
                v30Var.removeView((View) arrayList.get(i10));
                ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).e();
                ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).b(true);
            }
            arrayList2.clear();
            if (v30Var.getParent() != null) {
                arrayList2.clear();
                this.containerView.removeView(v30Var);
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
        org.telegram.ui.Components.a30.j(getContext());
        ChatObject.Call call = this.f32919a1;
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
        if (this.f32952i0 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.f32952i0.getSystemService("audio");
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
            this.f32952i0.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            v30 v30Var = this.a2;
            if (v30Var.f29471r != null) {
                return;
            }
            boolean z10 = G3;
            j50 j50Var = this.Q;
            int i10 = 0;
            if (z10) {
                if (this.f32984q2 != null) {
                    j50Var.getViewTreeObserver().removeOnPreDrawListener(this.f32984q2);
                    this.f32984q2 = null;
                }
                ArrayList arrayList = new ArrayList();
                j60 j60Var = this.f32976o2;
                ArrayList arrayList2 = this.Y1;
                ArrayList arrayList3 = this.Z1;
                if (videoParticipant == null) {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) arrayList3.get(i11);
                        org.telegram.ui.Components.voip.l lVar = uVar.f29637c;
                        if (lVar != null) {
                            lVar.setRenderer(null);
                            org.telegram.ui.Components.s20 s20Var = uVar.d;
                            if (s20Var != null) {
                                s20Var.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.l lVar2 = uVar.e;
                            if (lVar2 != null) {
                                lVar2.setRenderer(null);
                            }
                            arrayList.add(uVar.f29661w);
                            uVar.b(false);
                            uVar.animate().alpha(0.0f).setListener(new q40(this, uVar));
                        }
                    }
                    this.P2 = false;
                    j60Var.H(this.f32972n2, true, true);
                } else {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) arrayList3.get(i12);
                        if (uVar2.e != null && ((videoParticipant2 = uVar2.f29661w) == null || !videoParticipant2.equals(videoParticipant))) {
                            arrayList.add(uVar2.f29661w);
                            uVar2.b(false);
                            org.telegram.ui.Components.s20 s20Var2 = uVar2.d;
                            if (s20Var2 != null) {
                                s20Var2.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.l lVar3 = uVar2.f29637c;
                            if (lVar3 != null) {
                                lVar3.setRenderer(null);
                            }
                            uVar2.animate().alpha(0.0f).setListener(new r40(this, uVar2));
                        }
                    }
                    this.P2 = true;
                    j60Var.f34647r = false;
                    if (!arrayList.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new tt(21, this, arrayList));
                    }
                }
                ViewTreeObserver viewTreeObserver = j50Var.getViewTreeObserver();
                t40 t40Var = new t40(this, videoParticipant, !v30Var.f29452b);
                this.f32984q2 = t40Var;
                viewTreeObserver.addOnPreDrawListener(t40Var);
                return;
            }
            if (this.f32984q2 != null) {
                j50Var.getViewTreeObserver().removeOnPreDrawListener(this.f32984q2);
                this.f32984q2 = null;
            }
            if (videoParticipant != null) {
                r30 r30Var = this.f32967m2;
                if (r30Var.getVisibility() != 0) {
                    r30Var.setVisibility(0);
                    org.telegram.ui.Components.t20 t20Var = this.f32980p2;
                    t20Var.G(r30Var, false);
                    this.f32992s0 = true;
                    if (!v30Var.f29452b) {
                        ArrayList arrayList4 = t20Var.e;
                        s4.c0 c0Var = (s4.c0) r30Var.getLayoutManager();
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
                    ViewTreeObserver viewTreeObserver2 = j50Var.getViewTreeObserver();
                    u40 u40Var = new u40(this, videoParticipant);
                    this.f32984q2 = u40Var;
                    viewTreeObserver2.addOnPreDrawListener(u40Var);
                    return;
                }
                v30Var.j(videoParticipant);
                AndroidUtilities.updateVisibleRows(r30Var);
            } else if (j50Var.getVisibility() != 0) {
                j50Var.setVisibility(0);
                O0(false);
                this.f32992s0 = true;
                ViewTreeObserver viewTreeObserver3 = j50Var.getViewTreeObserver();
                v40 v40Var = new v40(this);
                this.f32984q2 = v40Var;
                viewTreeObserver3.addOnPreDrawListener(v40Var);
            } else {
                ViewTreeObserver viewTreeObserver4 = j50Var.getViewTreeObserver();
                w40 w40Var = new w40(this);
                this.f32984q2 = w40Var;
                viewTreeObserver4.addOnPreDrawListener(w40Var);
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
        return chat.f18321id;
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
                str = a4.a.r(accountInstance.getMessagesController().linkPrefix, "/", publicUsername, new StringBuilder());
            } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                tL_messages_exportChatInvite.peer = MessagesController.getInputPeer(this.Z0);
                accountInstance.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ci.v1(this, chatFull, z10, 5));
                return;
            }
            u1(null, str, true, z10);
        } else if (this.f32919a1 != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = this.f32919a1.getInputGroupCall();
                if (i10 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                exportgroupcallinvite.can_self_unmute = z11;
                accountInstance.getConnectionsManager().sendRequest(exportgroupcallinvite, new org.telegram.messenger.voip.m0(this, i10, z10, 1));
            }
        }
    }

    public final UndoView k1() {
        if (!G3) {
            v30 v30Var = this.a2;
            if (v30Var.f29452b) {
                return v30Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.f32956j0;
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
        if (!this.f33000u0 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            this.f33000u0 = true;
            this.D0.addAll(this.f32919a1.visibleParticipants);
            this.E0.addAll(this.f32982q0);
            this.F0.addAll(this.f32919a1.invitedUsers);
            this.G0.addAll(this.f32919a1.shadyJoinParticipants);
            this.H0.addAll(this.f32919a1.shadyLeftParticipants);
            this.T1 = sharedInstance.getCallState();
            if (this.f32919a1 == null) {
                ChatObject.Call call = sharedInstance.groupCall;
                this.f32919a1 = call;
                this.f32980p2.f28381c = call;
                this.a2.setGroupCall(call);
                this.f32976o2.f34644c = this.f32919a1;
            }
            lh.h hVar = this.f32927c0;
            if (hVar != null) {
                hVar.C0(this.d.getCurrentAccount(), this.f32919a1.getInputGroupCall(false));
            }
            this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
            this.f32919a1.saveActiveDates();
            VoIPService.getSharedInstance().registerStateListener(this);
            i50 i50Var = this.V;
            if (i50Var != null && i50Var.getVisibility() == 0) {
                this.f32991s.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, true);
                M1(true);
                if (ChatObject.isChannelOrGiga(this.Z0)) {
                    i10 = R.string.VoipChannelEndChat;
                } else {
                    i10 = R.string.VoipGroupEndChat;
                }
                this.f33010w1.setText(LocaleController.getString(i10));
                j50 j50Var = this.Q;
                j50Var.setVisibility(0);
                org.telegram.ui.ActionBar.u0 u0Var = this.l1;
                u0Var.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(j50Var, property, 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(j50Var, View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(i50Var, property2, 0.0f);
                Property property3 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(i50Var, property3, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(i50Var, property, 0.0f);
                org.telegram.ui.ActionBar.h5 h5Var = this.U;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(h5Var, property2, 0.0f);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(h5Var, property3, 0.0f);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(h5Var, property, 0.0f);
                org.telegram.ui.ActionBar.h5 h5Var2 = this.W;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(h5Var2, property2, 0.0f), ObjectAnimator.ofFloat(h5Var2, property3, 0.0f), ObjectAnimator.ofFloat(h5Var2, property, 0.0f), ObjectAnimator.ofFloat(u0Var, property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(u0Var, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(u0Var, property, 0.0f, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.rr.f28023g);
                animatorSet.addListener(new x40(this, 0));
                animatorSet.setDuration(300L);
                animatorSet.start();
            }
        }
    }

    public final void m1(final long j3, final boolean z10) {
        if (this.f32919a1 != null) {
            AccountInstance accountInstance = this.d;
            final TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                final org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(getContext(), 3, null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                invitetogroupcall.call = this.f32919a1.getInputGroupCall();
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = user.f18468id;
                tL_inputUser.access_hash = user.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = accountInstance.getConnectionsManager().sendRequest(invitetogroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        d60 d60Var = d60.this;
                        long j10 = j3;
                        org.telegram.ui.ActionBar.a2[] a2VarArr2 = a2VarArr;
                        if (tLObject != null) {
                            d60Var.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.w21(d60Var, j10, a2VarArr2, user, 2));
                            return;
                        }
                        AndroidUtilities.runOnUIThread(new ai.h3(d60Var, a2VarArr2, z10, tL_error, j10, invitetogroupcall));
                    }
                });
                if (sendRequest != 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.xm(this, a2VarArr, sendRequest, 27), 500L);
                }
            }
        }
    }

    public final boolean n1() {
        float f7;
        int dp = AndroidUtilities.dp(74.0f);
        float f10 = this.f33019y0 - dp;
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
        j50 j50Var = this.Q;
        if (j50Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(j50Var);
        }
        r30 r30Var = this.f32967m2;
        if (r30Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(r30Var);
        }
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        arrayList.addAll(this.Y1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).j(true);
        }
    }

    @Override
    public final void onBackPressed() {
        p40 p40Var = this.f33022z0;
        if (p40Var != null) {
            p40Var.b(false, false);
        } else if (this.f32942f2) {
            d1(true);
        } else if (this.a2.f29452b) {
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
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        arrayList.addAll(this.Y1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).j(true);
        }
        p40 p40Var = this.f33022z0;
        if (p40Var != null && VoIPService.getSharedInstance() != null) {
            p40Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.f32952i0;
        launchActivity.f31087a1.add(this.f33006v2);
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        E3 = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        org.telegram.ui.Components.a30.j(getContext());
        return super.onCustomOpenAnimation();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.u0.d(this, i10, i11);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.u0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.u0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        this.T1 = i10;
        N1(isShowing(), false);
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.u0.h(this, z10);
    }

    public final boolean q1() {
        if (!r1() || this.f32919a1.visibleVideoParticipants.isEmpty() || (this.f32919a1.visibleVideoParticipants.get(0).aspectRatio != 0.0f && this.f32919a1.visibleVideoParticipants.get(0).aspectRatio < 1.0f)) {
            return false;
        }
        return true;
    }

    public final boolean r1() {
        ChatObject.Call call = this.f32919a1;
        if (call != null && call.call.rtmp_stream) {
            return true;
        }
        return false;
    }

    public final void s1(org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.a2 a2Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j3;
        if (!this.f33009w0) {
            org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f32952i0.O().getFragmentStack().get(this.f32952i0.O().getFragmentStack().size() - 1);
            if (m2Var instanceof wn) {
                boolean P9 = ((wn) m2Var).P9();
                this.f33009w0 = true;
                this.f33014x0 = true;
                ai.s4 s4Var = new ai.s4(e3Var, editTextBoldCursor, z10, a2Var, 21);
                if (P9) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                AndroidUtilities.runOnUIThread(s4Var, j3);
                return;
            }
            this.f33009w0 = true;
            this.f33014x0 = true;
            if (e3Var != null) {
                e3Var.setFocusable(true);
            } else if (a2Var != null) {
                a2Var.k(true);
            }
            if (z10) {
                AndroidUtilities.runOnUIThread(new mh(2, editTextBoldCursor), 100L);
            }
        }
    }

    @Override
    public final void show() {
        super.show();
        if (org.telegram.ui.Components.voip.k1.f29411d0.V) {
            org.telegram.ui.Components.voip.k1.j();
        }
    }

    public final void u1(java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d60.u1(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final void v1() {
        ChatObject.Call call = this.f32919a1;
        if (call != null && call.call != null) {
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(getContext(), 3, null);
            a2Var.q(300L);
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = this.f32919a1.call;
            tL_inputGroupCall.f18338id = groupCall.f18331id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new aa(this, a2Var, exportgroupcallinvite, 12));
        }
    }

    public final void x1(org.telegram.tgnet.TLRPC.GroupCallParticipant r31, final long r32, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d60.x1(org.telegram.tgnet.TLRPC$GroupCallParticipant, long, int):void");
    }

    public final void y1(boolean r18, org.telegram.ui.Cells.e4 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d60.y1(boolean, org.telegram.ui.Cells.e4):void");
    }

    public final void z1() {
        w5 w5Var = this.A2;
        AndroidUtilities.cancelRunOnUIThread(w5Var);
        if (this.f33024z2 && this.U0 != null && VoIPService.getSharedInstance() != null && r1() && this.Q != null && LiteMode.isEnabled(512)) {
            AndroidUtilities.runOnUIThread(w5Var, 30L);
        }
    }

    @Override
    public final void C(float f7, int i10) {
    }
}

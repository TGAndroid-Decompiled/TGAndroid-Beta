package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.webrtc.voiceengine.WebRtcAudioTrack;
public final class f40 extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.fs, VoIPService.StateListener, te.b {
    public static f40 C5;
    public static boolean D5;
    public static boolean E5;
    public static boolean F5;
    public static volatile org.telegram.messenger.r5 G5 = new org.telegram.messenger.r5("updateTextureLightningQueue", true);
    public static boolean H5;
    public final o20 A1;
    public final ArrayList A2;
    public final d40 A3;
    public final LongSparseIntArray A4;
    public final te.c A5;
    public final m20 B1;
    public final ArrayList B2;
    public final rh.h B3;
    public final e20 B4;
    public final te.a B5;
    public final k20 C1;
    public final ArrayList C2;
    public v00 C3;
    public final c20 C4;
    public final ImageView D1;
    public int D2;
    public org.telegram.ui.Components.v20 D3;
    public LinearLayout D4;
    public final ImageView E1;
    public final org.telegram.ui.Components.oh0 E2;
    public int E3;
    public boolean E4;
    public org.telegram.ui.Components.xi0 F1;
    public final org.telegram.ui.Components.oh0 F2;
    public boolean F3;
    public final org.telegram.ui.Components.oh0 F4;
    public final l30 G1;
    public boolean G2;
    public boolean G3;
    public int G4;
    public final org.telegram.ui.Components.o6 H1;
    public final org.telegram.ui.Components.w9 H2;
    public final Paint H3;
    public boolean H4;
    public final u10 I1;
    public final org.telegram.ui.Components.w9 I2;
    public final Paint I3;
    public final View I4;
    public final d30 J1;
    public float J2;
    public final e40[] J3;
    public final View J4;
    public final z30 K1;
    public float K2;
    public float K3;
    public GradientDrawable K4;
    public final n30 L1;
    public float L2;
    public e40 L3;
    public final int[] L4;
    public final t20 M1;
    public RadialGradient M2;
    public e40 M3;
    public final y10 M4;
    public final TextView N1;
    public final Matrix N2;
    public long N3;
    public boolean N4;
    public final r20 O1;
    public final Paint O2;
    public float O3;
    public boolean O4;
    public final org.telegram.ui.ActionBar.m5 P1;
    public final u30 P2;
    public float P3;
    public RenderNode P4;
    public final m30 Q1;
    public float Q2;
    public boolean Q3;
    public float Q4;
    public final org.telegram.ui.ActionBar.m5 R1;
    public float R2;
    public boolean R3;
    public boolean R4;
    public final t30 S1;
    public ValueAnimator S2;
    public int S3;
    public final String[] S4;
    public final org.telegram.ui.Components.xy T1;
    public TLRPC.InputPeer T2;
    public float T3;
    public ObjectAnimator T4;
    public final ImageReceiver U1;
    public TLRPC.Chat U2;
    public int U3;
    public ObjectAnimator U4;
    public int V1;
    public org.telegram.messenger.t3 V2;
    public boolean V3;
    public final y20 V4;
    public final ImageView W1;
    public final boolean W2;
    public final int[] W3;
    public org.telegram.ui.Cells.g4 W4;
    public final nh.h X1;
    public final String X2;
    public final ArrayList X3;
    public org.telegram.ui.Components.voip.r X4;
    public final int Y1;
    public final a40 Y2;
    public final ArrayList Y3;
    public org.telegram.ui.Components.voip.y Y4;
    public final RadialProgressView Z1;
    public final t10 Z2;
    public final b20 Z3;
    public org.telegram.ui.Components.u10 Z4;
    public final Drawable f47467a2;
    public final v10 f47468a3;
    public final g20 f47469a4;
    public boolean f47470a5;
    public final View f47471b2;
    public final Paint f47472b3;
    public final u20 f47473b4;
    public boolean f47474b5;
    public AnimatorSet f47475c2;
    public ValueAnimator f47476c3;
    public float f47477c4;
    public int f47478c5;
    public LaunchActivity d2;
    public float f47479d3;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f47480d4;
    public AnimatorSet f47481d5;
    public final UndoView[] f47482e2;
    public final LinearLayout f47483e3;
    public boolean f47484e4;
    public h30 f47485e5;
    public final org.telegram.ui.Cells.k f47486f2;
    public final org.telegram.ui.ActionBar.q0 f47487f3;
    public boolean f47488f4;
    public int f47489f5;
    public boolean f47490g2;
    public final org.telegram.ui.ActionBar.q0 f47491g3;
    public org.telegram.ui.Components.x30 f47492g4;
    public int f47493g5;
    public org.telegram.ui.Components.m30 f47494h2;
    public final org.telegram.ui.ActionBar.q0 f47495h3;
    public o30 f47496h4;
    public int f47497h5;
    public org.telegram.ui.Components.m30 f47498i2;
    public final org.telegram.ui.ActionBar.y0 f47499i3;
    public Boolean f47500i4;
    public int f47501i5;
    public int f47502j2;
    public final org.telegram.ui.ActionBar.y0 j3;
    public int f47503j4;
    public int f47504j5;
    public g.b f47505k2;
    public final org.telegram.ui.ActionBar.y0 f47506k3;
    public boolean f47507k4;
    public int f47508k5;
    public final ArrayList f47509l2;
    public final org.telegram.ui.ActionBar.y0 f47510l3;
    public final x10 f47511l4;
    public int f47512l5;
    public final d20 f47513m1;
    public b30 f47514m2;
    public final org.telegram.ui.ActionBar.y0 f47515m3;
    public final org.telegram.ui.Components.ek0 f47516m4;
    public int f47517m5;
    public final i10 n1;
    public boolean f47518n2;
    public final org.telegram.ui.Components.voip.q0 f47519n3;
    public final i40 f47520n4;
    public int f47521n5;
    public final org.telegram.messenger.c f47522o1;
    public long f47523o2;
    public final org.telegram.ui.Components.voip.s0 f47524o3;
    public final org.telegram.ui.Components.v10 o4;
    public int f47525o5;
    public final o10 f47526p1;
    public boolean f47527p2;
    public final ai.r2 f47528p3;
    public ViewTreeObserver.OnPreDrawListener f47529p4;
    public int f47530p5;
    public final org.telegram.ui.Components.voip.q2 f47531q1;
    public final RectF f47532q2;
    public final org.telegram.ui.ActionBar.y0 f47533q3;
    public final org.telegram.ui.Components.voip.n f47534q4;
    public int f47535q5;
    public final org.telegram.ui.Components.voip.q2 f47536r1;
    public boolean f47537r2;
    public final org.telegram.ui.ActionBar.y0 f47538r3;
    public boolean f47539r4;
    public int f47540r5;
    public final org.telegram.ui.Components.voip.q2 f47541s1;
    public boolean f47542s2;
    public final org.telegram.ui.ActionBar.y0 f47543s3;
    public final ArrayList f47544s4;
    public int s5;
    public final org.telegram.ui.Components.voip.q2 f47545t1;
    public float f47546t2;
    public final org.telegram.ui.ActionBar.y0 f47547t3;
    public boolean f47548t4;
    public int f47549t5;
    public final org.telegram.ui.Components.voip.q2 f47550u1;
    public w20 f47551u2;
    public final org.telegram.ui.ActionBar.y0 f47552u3;
    public final v00 f47553u4;
    public int f47554u5;
    public final org.telegram.ui.Components.voip.q2 f47555v1;
    public TLRPC.Peer f47556v2;
    public final org.telegram.ui.ActionBar.y0 f47557v3;
    public final s10 f47558v4;
    public final i30 f47559v5;
    public final org.telegram.ui.Components.voip.q2 f47560w1;
    public TLObject f47561w2;
    public final org.telegram.ui.ActionBar.y0 f47562w3;
    public final org.telegram.ui.Components.me f47563w4;
    public Boolean f47564w5;
    public final p10 f47565x1;
    public final Paint f47566x2;
    public final org.telegram.ui.ActionBar.y0 f47567x3;
    public final v00 f47568x4;
    public Integer f47569x5;
    public final ImageView f47570y1;
    public final ArrayList f47571y2;
    public final LinearLayout f47572y3;
    public boolean f47573y4;
    public final te.a f47574y5;
    public final Paint f47575z1;
    public final ArrayList f47576z2;
    public final TextView f47577z3;
    public final m4 f47578z4;
    public final te.a f47579z5;

    public f40(final LaunchActivity launchActivity, org.telegram.messenger.c cVar, org.telegram.messenger.t3 t3Var, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        super((Context) launchActivity, (org.telegram.ui.ActionBar.h6) null, true, true);
        final f40 f40Var;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.f47575z1 = new Paint(1);
        this.f47482e2 = new UndoView[2];
        this.f47509l2 = new ArrayList();
        this.f47532q2 = new RectF();
        this.f47566x2 = new Paint(1);
        this.f47571y2 = new ArrayList();
        this.f47576z2 = new ArrayList();
        this.A2 = new ArrayList();
        this.B2 = new ArrayList();
        this.C2 = new ArrayList();
        this.B3 = new rh.h(new v00(this, 4));
        this.E3 = 0;
        this.F3 = false;
        this.H3 = new Paint(7);
        this.I3 = new Paint(7);
        this.J3 = new e40[8];
        this.K3 = 1.0f;
        this.V3 = true;
        this.W3 = new int[4];
        this.X3 = new ArrayList();
        this.Y3 = new ArrayList();
        this.f47534q4 = new org.telegram.ui.Components.voip.n();
        this.f47544s4 = new ArrayList();
        this.f47553u4 = new v00(this, 0);
        this.f47558v4 = new s10(this);
        this.f47563w4 = new org.telegram.ui.Components.me(24);
        this.f47568x4 = new v00(this, 2);
        this.f47573y4 = false;
        this.f47578z4 = new m4(this, 7);
        this.A4 = new LongSparseIntArray();
        this.L4 = new int[2];
        this.O4 = true;
        this.S4 = new String[2];
        this.f47478c5 = -1;
        this.f47559v5 = new i30(this);
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f37956f;
        this.f47574y5 = new te.a(2, this, nrVar, 350L);
        this.f47579z5 = new te.a(3, this, nrVar, 220L, true);
        this.A5 = new te.c(4, this, nrVar, 350L);
        this.B5 = new te.a(5, this, nrVar, 350L);
        org.telegram.messenger.g0.S(getWindow());
        D0();
        this.f47522o1 = cVar;
        this.V2 = t3Var;
        this.T2 = inputPeer;
        this.U2 = chat;
        this.X2 = str;
        this.f30170a = cVar.f23246a;
        this.W2 = z10;
        this.J0 = new fi.h0();
        this.Q0 = true;
        this.R0 = true;
        this.Y1 = org.telegram.messenger.mp.u1(this.f30170a).A7.C.m();
        this.V = true;
        F5 = false;
        E5 = false;
        H5 = false;
        this.f30216z0 = new n20(this);
        this.f30205s = true;
        this.f30198n = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.f30210w = true;
        this.G0 = -1;
        this.V4 = new y20(this);
        setOnDismissListener(new b10(this, 0));
        z0();
        z30 z30Var = new z30(this, launchActivity);
        this.K1 = z30Var;
        org.telegram.ui.Components.sp spVar = new org.telegram.ui.Components.sp(true);
        int i7 = org.telegram.ui.ActionBar.m6.f29461hh;
        spVar.b(org.telegram.ui.ActionBar.m6.v0(i7));
        spVar.d();
        d30 d30Var = new d30(this, launchActivity, spVar);
        this.J1 = d30Var;
        d30Var.setSubtitle("");
        d30Var.getSubtitleTextView().setVisibility(0);
        d30Var.q();
        d30Var.getAdditionalSubtitleTextView().setPadding(org.telegram.messenger.g0.L(24.0f), 0, 0, 0);
        org.telegram.messenger.g0.U3(1.0f, d30Var.getAdditionalSubtitleTextView(), this.f47548t4, false);
        d30Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.m6.v0(i7));
        int i10 = org.telegram.ui.ActionBar.m6.f29371ch;
        org.telegram.ui.ActionBar.t6.l(d30Var, 6, i10, null);
        d30Var.setBackButtonImage(2131231240);
        d30Var.setOccupyStatusBar(false);
        d30Var.setAllowOverlayTitle(false);
        int i11 = org.telegram.ui.ActionBar.m6.Yg;
        org.telegram.ui.ActionBar.t6.l(d30Var, 1, i11, null);
        org.telegram.ui.ActionBar.t6.l(d30Var, 3, org.telegram.ui.ActionBar.m6.f29791z8, null);
        org.telegram.ui.ActionBar.t6.d(d30Var, i11);
        org.telegram.ui.ActionBar.t6.l(d30Var, 6, i10, null);
        d30Var.setActionBarMenuOnItemClick(new k30(this, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.f47556v2 = tL_peerUser;
            tL_peerUser.user_id = cVar.e().e();
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            this.f47556v2 = tL_peerChannel;
            tL_peerChannel.channel_id = groupCallPeer.channel_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            this.f47556v2 = tL_peerUser2;
            tL_peerUser2.user_id = groupCallPeer.user_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            this.f47556v2 = tL_peerChat;
            tL_peerChat.chat_id = groupCallPeer.chat_id;
        }
        VoIPService.audioLevelsCallback = new w00(this, 2);
        cVar.c().c(this, org.telegram.messenger.ks.f25241w2);
        cVar.c().c(this, org.telegram.messenger.ks.M0);
        cVar.c().c(this, org.telegram.messenger.ks.T);
        cVar.c().c(this, org.telegram.messenger.ks.f25227u1);
        cVar.c().c(this, org.telegram.messenger.ks.B2);
        cVar.c().c(this, org.telegram.messenger.ks.E0);
        cVar.c().c(this, org.telegram.messenger.ks.f25162j0);
        cVar.c().c(this, org.telegram.messenger.ks.f25205r);
        cVar.c().c(this, org.telegram.messenger.ks.f25262z2);
        cVar.c().c(this, org.telegram.messenger.ks.f25255y2);
        cVar.c().c(this, org.telegram.messenger.ks.U3);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.Q4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.D2);
        this.f47467a2 = launchActivity.getResources().getDrawable(2131232730).mutate();
        org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(2131624345, org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(46.0f), true, null);
        this.E2 = oh0Var;
        this.F2 = new org.telegram.ui.Components.oh0(2131624045, org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(46.0f), true, null);
        l30 l30Var = new l30(this, launchActivity);
        this.G1 = l30Var;
        this.f30173b = l30Var;
        this.f30173b.setClipToPadding(false);
        this.f30173b.setFocusable(true);
        this.f30173b.setFocusableInTouchMode(true);
        this.f30173b.setWillNotDraw(false);
        ViewGroup viewGroup = this.f30173b;
        int i12 = this.f30208u0;
        viewGroup.setPadding(i12, 0, i12, 0);
        this.f30173b.setKeepScreenOn(true);
        this.f30173b.setClipChildren(false);
        this.U1 = new ImageReceiver(this.f30173b);
        if (inputPeer != null) {
            org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(launchActivity);
            this.P1 = m5Var;
            m5Var.setGravity(17);
            m5Var.setTextColor(-1);
            m5Var.setTypeface(org.telegram.messenger.g0.o());
            m5Var.setTextSize(18);
            m5Var.k(org.telegram.messenger.gd.M0(2131743192));
            this.f30173b.addView(m5Var, c8.ma.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            m30 m30Var = new m30(this, launchActivity);
            this.Q1 = m30Var;
            m30Var.setGravity(17);
            m30Var.setTextColor(-1);
            m30Var.setTypeface(org.telegram.messenger.g0.o());
            m30Var.setTextSize(60);
            this.f30173b.addView(m30Var, c8.ma.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(launchActivity);
            this.R1 = m5Var2;
            m5Var2.setGravity(17);
            m5Var2.setTextColor(-1);
            m5Var2.setTypeface(org.telegram.messenger.g0.o());
            m5Var2.setTextSize(18);
            this.f30173b.addView(m5Var2, c8.ma.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (v1()) {
            u30 u30Var = new u30(this, launchActivity);
            this.P2 = u30Var;
            this.f30173b.addView(u30Var, c8.ma.d(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        n30 n30Var = new n30(this, launchActivity);
        this.L1 = n30Var;
        n30Var.setClipToPadding(false);
        n30Var.setClipChildren(false);
        t30 t30Var = new t30(this);
        this.S1 = t30Var;
        t30Var.f59208o = nrVar;
        t30Var.d = 350L;
        t30Var.f59234c = 350L;
        t30Var.f59235e = 350L;
        t30Var.S();
        n30Var.setItemAnimator(t30Var);
        n30Var.setOnScrollListener(new h10(this));
        n30Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(E5 ? 6 : 2, n30Var);
        this.T1 = xyVar;
        n30Var.setLayoutManager(xyVar);
        i10 i10Var = new i10(this);
        this.n1 = i10Var;
        xyVar.z1(i10Var);
        n30Var.i(new j10(this));
        xyVar.C1();
        this.f30173b.addView(n30Var, c8.ma.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        n30Var.setAdapter(z30Var);
        n30Var.setTopBottomSelectorRadius(13);
        org.telegram.ui.ActionBar.t6.I(org.telegram.ui.ActionBar.m6.Vg, n30Var);
        n30Var.setOnItemClickListener(new z6(this, launchActivity, t3Var, 14));
        n30Var.setOnItemLongClickListener(new w00(this, 3));
        if (v1()) {
            d40 d40Var = new d40(this, getContext());
            this.A3 = d40Var;
            this.f30173b.addView(d40Var, c8.ma.d(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(launchActivity);
        this.f47516m4 = ek0Var;
        this.f30173b.addView(ek0Var, c8.ma.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        i40 i40Var = new i40(t3Var, this.f30170a, this);
        this.f47520n4 = i40Var;
        ek0Var.setAdapter(i40Var);
        v4.t tVar = new v4.t(6, false);
        ek0Var.setLayoutManager(tVar);
        tVar.z1(new l10(this));
        ek0Var.setOnItemClickListener(new org.telegram.ui.Components.qj0(this) {
            public final f40 f52420b;

            {
                this.f52420b = this;
            }

            @Override
            public final void c(int i13, View view) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.u10 u10Var = (org.telegram.ui.Components.u10) view;
                        org.telegram.messenger.u3 videoParticipant = u10Var.getVideoParticipant();
                        f40 f40Var2 = this.f52420b;
                        if (videoParticipant == null) {
                            f40Var2.i1(new org.telegram.messenger.u3(u10Var.getParticipant(), false));
                            return;
                        } else {
                            f40Var2.i1(u10Var.getVideoParticipant());
                            return;
                        }
                    default:
                        f40 f40Var3 = this.f52420b;
                        f40Var3.getClass();
                        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) view;
                        if (rVar.getParticipant() != null) {
                            f40Var3.i1(rVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        v4.k kVar = new v4.k();
        kVar.S();
        kVar.f59208o = nrVar;
        kVar.d = 350L;
        kVar.f59234c = 350L;
        kVar.f59235e = 350L;
        ek0Var.setItemAnimator(new m10(this));
        ek0Var.setOnScrollListener(new n10(this));
        i40Var.H(ek0Var, false, false);
        ek0Var.setVisibility(8);
        o10 o10Var = new o10(this, launchActivity);
        this.f47526p1 = o10Var;
        int v02 = org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.Ah);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.N2 = new Matrix();
        this.M2 = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.O2 = paint;
        paint.setShader(this.M2);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(9);
        this.H2 = w9Var;
        org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(12);
        this.I2 = w9Var2;
        w9Var.f41719a = org.telegram.messenger.g0.L(62.0f) * 0.45454547f;
        w9Var.f41720b = org.telegram.messenger.g0.L(72.0f) * 0.45454547f;
        w9Var.b();
        w9Var2.f41719a = org.telegram.messenger.g0.L(65.0f) * 0.45454547f;
        w9Var2.f41720b = org.telegram.messenger.g0.L(75.0f) * 0.45454547f;
        w9Var2.b();
        int i13 = org.telegram.ui.ActionBar.m6.f29800zh;
        w9Var.d.setColor(i0.a.o(org.telegram.ui.ActionBar.m6.v0(i13), 38));
        w9Var2.d.setColor(i0.a.o(org.telegram.ui.ActionBar.m6.v0(i13), 76));
        org.telegram.ui.Components.voip.q2 q2Var = new org.telegram.ui.Components.voip.q2(launchActivity, 50.0f);
        this.f47545t1 = q2Var;
        q2Var.setCheckable(true);
        q2Var.setTextSize(12);
        o10Var.a(q2Var);
        q2Var.setOnClickListener(new t00(this, 7));
        org.telegram.ui.Components.voip.q2 q2Var2 = new org.telegram.ui.Components.voip.q2(launchActivity, 50.0f);
        this.f47541s1 = q2Var2;
        q2Var2.setCheckable(true);
        q2Var2.setTextSize(12);
        q2Var2.d(false, false);
        q2Var2.setCrossOffset(-org.telegram.messenger.g0.N(3.5f));
        q2Var2.c(2131230926, -1, 0, 1.0f, true, org.telegram.messenger.gd.M0(2131743246), false, false);
        org.telegram.ui.Components.voip.q2 q2Var3 = new org.telegram.ui.Components.voip.q2(launchActivity, 50.0f);
        this.f47531q1 = q2Var3;
        q2Var3.setCheckable(true);
        q2Var3.setTextSize(12);
        q2Var3.d(false, false);
        org.telegram.ui.Components.rh0 rh0Var = new org.telegram.ui.Components.rh0(launchActivity);
        q2Var3.addView(rh0Var, c8.ma.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.oh0 oh0Var2 = new org.telegram.ui.Components.oh0(2131623962, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        this.F4 = oh0Var2;
        rh0Var.setAnimation(oh0Var2);
        q2Var3.setOnClickListener(new t00(this, 10));
        o10Var.a(q2Var3);
        org.telegram.ui.Components.voip.q2 q2Var4 = new org.telegram.ui.Components.voip.q2(launchActivity, 50.0f);
        this.f47536r1 = q2Var4;
        q2Var4.setCheckable(true);
        q2Var4.setTextSize(12);
        q2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.W1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.V1 = 2131231171;
        imageView.setImageResource(2131231171);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        q2Var4.addView(imageView, c8.ma.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        q2Var4.setOnClickListener(new t00(this, 11));
        o10Var.a(q2Var4);
        o10Var.a(q2Var2);
        org.telegram.ui.Components.voip.q2 q2Var5 = new org.telegram.ui.Components.voip.q2(launchActivity, 50.0f);
        this.f47550u1 = q2Var5;
        q2Var5.setTextSize(12);
        q2Var5.c(2131230918, -1, org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.f29705uh), 0.3f, false, org.telegram.messenger.gd.M0(2131743121), false, false);
        q2Var5.setOnClickListener(new View.OnClickListener(this) {
            public final f40 f54356b;

            {
                this.f54356b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        f40 f40Var2 = this.f54356b;
                        LaunchActivity launchActivity2 = f40Var2.d2;
                        if (launchActivity2 != null && launchActivity2.checkSelfPermission("android.permission.CAMERA") != 0) {
                            f40Var2.d2.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
                            return;
                        } else if (VoIPService.getSharedInstance() != null) {
                            boolean z11 = false;
                            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                                f40Var2.f47482e2[0].d(1, false);
                                if (f40Var2.f47551u2 == null) {
                                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                                    if (sharedInstance != null) {
                                        sharedInstance.createCaptureDevice(false);
                                    }
                                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                                        z11 = true;
                                    }
                                    w20 w20Var = new w20(f40Var2, launchActivity, z11);
                                    f40Var2.f47551u2 = w20Var;
                                    w20Var.setBottomPadding(f40Var2.f30173b.getPaddingBottom());
                                    f40Var2.f30176c.addView(f40Var2.f47551u2);
                                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                                        sharedInstance.switchCamera();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            VoIPService.getSharedInstance().setVideoState(false, 0);
                            f40Var2.W1(true, false);
                            f40Var2.V1(false);
                            f40Var2.V2.z();
                            f40Var2.R0(true);
                            f40Var2.f47526p1.requestLayout();
                            return;
                        } else {
                            return;
                        }
                    default:
                        f40 f40Var3 = this.f54356b;
                        f40Var3.Z3.e();
                        org.telegram.messenger.t3 t3Var2 = f40Var3.V2;
                        if (t3Var2 != null && !t3Var2.j()) {
                            f40Var3.P1();
                            f40.x1(launchActivity, new v00(f40Var3, 6), false, false);
                            return;
                        }
                        f40Var3.dismiss();
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.q2 q2Var6 = new org.telegram.ui.Components.voip.q2(launchActivity, 50.0f);
        this.f47555v1 = q2Var6;
        q2Var6.setCheckable(true);
        q2Var6.b(true, false);
        q2Var6.setTextSize(12);
        q2Var6.c(2131231186, -1, 0, 1.0f, true, org.telegram.messenger.gd.M0(2131743051), false, false);
        p10 p10Var = new p10(this, launchActivity);
        this.f47565x1 = p10Var;
        p10Var.setAnimation(oh0Var);
        p10Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.q2 q2Var7 = new org.telegram.ui.Components.voip.q2(launchActivity, 50.0f);
        this.f47560w1 = q2Var7;
        q2Var7.setDrawBackground(false);
        q2Var7.setTextSize(12);
        q2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        q2Var7.addView(p10Var, c8.ma.e(50, 50, 49));
        o10Var.a(q2Var7);
        q2Var7.setOnClickListener(new r10(this));
        o10Var.a(q2Var6);
        o10Var.a(q2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.f47570y1 = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(2131232801);
        q2Var7.addView(imageView2, c8.ma.d(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.V2 != null && v1() && !this.V2.j()) {
            imageView2.setVisibility(0);
            p10Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.Z1 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.Fh));
        d30Var.setAlpha(0.0f);
        d30Var.getBackButton().setScaleX(0.9f);
        d30Var.getBackButton().setScaleY(0.9f);
        d30Var.getBackButton().setTranslationX(-org.telegram.messenger.g0.L(14.0f));
        d30Var.getTitleTextView().setTranslationY(org.telegram.messenger.g0.L(23.0f));
        d30Var.getSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(20.0f));
        d30Var.getAdditionalSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(20.0f));
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.m6.v0(i11));
        this.f47487f3 = q0Var;
        q0Var.setLongClickEnabled(false);
        q0Var.setIcon(2131231244);
        q0Var.setContentDescription(org.telegram.messenger.gd.M0(2131754838));
        q0Var.setSubMenuOpenSide(2);
        q0Var.setDelegate(new w00(this, 5));
        int i14 = org.telegram.ui.ActionBar.m6.Zg;
        org.telegram.ui.ActionBar.t6.R(q0Var, org.telegram.ui.ActionBar.m6.g0(org.telegram.ui.ActionBar.m6.v0(i14), 6), null, org.telegram.ui.ActionBar.t6.M(i14));
        q0Var.setOnClickListener(new t00(this, 12));
        q0Var.P(org.telegram.ui.ActionBar.m6.v0(i11), false);
        q0Var.P(org.telegram.ui.ActionBar.m6.v0(i11), true);
        org.telegram.ui.ActionBar.q0 q0Var2 = new org.telegram.ui.ActionBar.q0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.m6.v0(i11));
        this.f47491g3 = q0Var2;
        q0Var2.setLongClickEnabled(false);
        q0Var2.setIcon(2131232431);
        q0Var2.setContentDescription(org.telegram.messenger.gd.M0(2131754807));
        org.telegram.ui.ActionBar.t6.R(q0Var2, org.telegram.ui.ActionBar.m6.g0(org.telegram.ui.ActionBar.m6.v0(i14), 6), null, org.telegram.ui.ActionBar.t6.M(i14));
        q0Var2.setOnClickListener(new t00(this, 0));
        org.telegram.ui.ActionBar.q0 q0Var3 = new org.telegram.ui.ActionBar.q0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.m6.v0(i11));
        this.f47495h3 = q0Var3;
        q0Var3.setLongClickEnabled(false);
        q0Var3.setIcon(2131232354);
        q0Var3.setContentDescription(org.telegram.messenger.gd.M0(2131754807));
        org.telegram.ui.ActionBar.t6.R(q0Var3, org.telegram.ui.ActionBar.m6.g0(org.telegram.ui.ActionBar.m6.v0(i14), 6), null, org.telegram.ui.ActionBar.t6.M(i14));
        q0Var3.setOnClickListener(new t00(this, 1));
        t10 t10Var = new t10(this, launchActivity, launchActivity);
        this.Z2 = t10Var;
        u10 u10Var = new u10(launchActivity);
        this.I1 = u10Var;
        u10Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.f47472b3 = paint2;
        paint2.setColor(-12761513);
        v10 v10Var = new v10(this, getContext());
        this.f47468a3 = v10Var;
        org.telegram.ui.ActionBar.t6.U(v10Var, i11, this.J0);
        v10Var.setTextSize(1, 11.0f);
        v10Var.setText(org.telegram.messenger.gd.M0(2131743231));
        v10Var.setMaxLines(1);
        v10Var.setGravity(17);
        v10Var.setTypeface(org.telegram.messenger.g0.o());
        v10Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f));
        v10Var.setTag(-1);
        if (!v1()) {
            v10Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f47483e3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(t10Var, c8.ma.l(1.0f, 0, -2));
        linearLayout.addView(v10Var, c8.ma.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.f30173b.addView(u10Var, c8.ma.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f30173b.addView(linearLayout, c8.ma.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.f30173b.addView(this.J1, c8.ma.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.f47572y3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(q0Var3, c8.ma.o(48, 48));
        linearLayout2.addView(q0Var2, c8.ma.o(48, 48));
        linearLayout2.addView(q0Var, c8.ma.o(48, 48));
        this.f30173b.addView(linearLayout2, c8.ma.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.f47471b2 = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.V5, view, null);
        this.f30173b.addView(view, c8.ma.c(1.0f, -1));
        for (int i15 = 0; i15 < 2; i15++) {
            this.f47482e2[i15] = new w10(this, launchActivity);
            this.f47482e2[i15].setAdditionalTranslationY(org.telegram.messenger.g0.L(10.0f));
            this.f47482e2[i15].setTranslationZ(org.telegram.messenger.g0.L(5.0f));
            this.f30173b.addView(this.f47482e2[i15], c8.ma.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.k kVar2 = new org.telegram.ui.Cells.k(launchActivity, true);
        this.f47486f2 = kVar2;
        kVar2.setTag(2131296439, 240);
        this.f47487f3.h(kVar2, org.telegram.messenger.g0.L(48.0f));
        this.f47487f3.setShowSubmenuByMove(false);
        int i16 = org.telegram.ui.ActionBar.m6.Vg;
        org.telegram.ui.ActionBar.t6.R(kVar2, org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.v0(i16), 6, 6), null, org.telegram.ui.ActionBar.t6.M(i16));
        org.telegram.ui.ActionBar.q0 q0Var4 = this.f47487f3;
        org.telegram.ui.ActionBar.y0 d = q0Var4.d(1, 0, null, org.telegram.messenger.gd.M0(2131743158), true, true, q0Var4.f29915n0);
        this.f47547t3 = d;
        d.m(true, false);
        org.telegram.ui.ActionBar.q0 q0Var5 = this.f47487f3;
        org.telegram.ui.ActionBar.y0 d2 = q0Var5.d(2, 0, null, org.telegram.messenger.gd.M0(2131743111), true, true, q0Var5.f29915n0);
        this.f47552u3 = d2;
        d2.m(false, true);
        int i17 = org.telegram.ui.ActionBar.m6.f29570nh;
        d.setCheckColor(i17);
        d.d(org.telegram.ui.ActionBar.m6.v0(i17), org.telegram.ui.ActionBar.m6.v0(i17));
        d2.setCheckColor(i17);
        d2.d(org.telegram.ui.ActionBar.m6.v0(i17), org.telegram.ui.ActionBar.m6.v0(i17));
        Paint paint3 = new Paint(1);
        paint3.setColor(org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.Yg));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.y0 f10 = this.f47487f3.f(null, org.telegram.messenger.gd.M0(2131743156), 10, true, 2131232432);
        this.f47506k3 = f10;
        f10.setItemHeight(56);
        org.telegram.ui.ActionBar.y0 f11 = this.f47487f3.f(null, org.telegram.messenger.gd.M0(2131743039), 11, true, 2131232263);
        this.f47510l3 = f11;
        f11.setItemHeight(56);
        org.telegram.ui.Components.voip.q0 q0Var6 = new org.telegram.ui.Components.voip.q0(ai.r2.a());
        this.f47519n3 = q0Var6;
        org.telegram.ui.ActionBar.y0 f12 = this.f47487f3.f(q0Var6, org.telegram.messenger.gd.M0(2131745053), 14, false, 0);
        this.f47515m3 = f12;
        f12.setItemHeight(56);
        f12.setRightIcon(2131232362);
        f12.setSubtext(org.telegram.messenger.gd.M0(ai.r2.a() ? 2131745051 : 2131745052));
        f12.getRightIcon().setBackground(org.telegram.ui.ActionBar.m6.g0(org.telegram.ui.ActionBar.m6.v0(i16), 1));
        int i18 = (org.telegram.messenger.gd.f24241a0 ? 3 : 5) | 16;
        ImageView rightIcon = f12.getRightIcon();
        boolean z11 = org.telegram.messenger.gd.f24241a0;
        rightIcon.setLayoutParams(c8.ma.d(40, 40.0f, i18, z11 ? 4.0f : 0.0f, 0.0f, z11 ? 0.0f : 4.0f, 0.0f));
        View view2 = new View(launchActivity);
        view2.setBackgroundColor(i0.a.f(0.3f, org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.Xg), -16777216));
        boolean z12 = org.telegram.messenger.gd.f24241a0;
        FrameLayout.LayoutParams d10 = c8.ma.d(-1, 28.0f, i18, z12 ? 52.0f : 0.0f, 0.0f, z12 ? 0.0f : 52.0f, 0.0f);
        d10.width = 1;
        view2.setLayoutParams(d10);
        f12.addView(view2);
        View[] viewArr = {f12.getTextView(), f12.getSubtextView()};
        for (int i19 = 0; i19 < 2; i19++) {
            View view3 = viewArr[i19];
            if (view3 != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view3.getLayoutParams();
                layoutParams.leftMargin = org.telegram.messenger.gd.f24241a0 ? org.telegram.messenger.g0.L(60.0f) : 0;
                layoutParams.rightMargin = org.telegram.messenger.gd.f24241a0 ? 0 : org.telegram.messenger.g0.L(60.0f);
                view3.setLayoutParams(layoutParams);
            }
        }
        this.f47515m3.getRightIcon().setContentDescription(org.telegram.messenger.gd.M0(2131745037));
        this.f47515m3.getRightIcon().setOnClickListener(new t00(this, 2));
        TextView b10 = this.f47487f3.b(i0.a.f(0.3f, org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.Xg), -16777216));
        this.f47577z3 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.y0 f13 = this.f47487f3.f(this.Y2, org.telegram.messenger.gd.M0(org.telegram.messenger.v3.W(this.U2) ? 2131743242 : 2131743141), 6, true, 2131232118);
        this.j3 = f13;
        org.telegram.ui.ActionBar.y0 f14 = this.f47487f3.f(this.Y2, org.telegram.messenger.gd.M0(2131743142), 7, false, 2131232278);
        this.f47533q3 = f14;
        org.telegram.ui.ActionBar.y0 e10 = this.f47487f3.e(3, 2131232205, org.telegram.messenger.gd.M0(2131743094));
        this.f47499i3 = e10;
        a40 a40Var = new a40();
        this.Y2 = a40Var;
        org.telegram.ui.ActionBar.y0 e11 = this.f47487f3.e(9, 2131232354, org.telegram.messenger.gd.M0(2131743193));
        this.f47543s3 = e11;
        org.telegram.ui.ActionBar.y0 f15 = this.f47487f3.f(a40Var, org.telegram.messenger.gd.M0(2131743105), 5, true, 0);
        this.f47538r3 = f15;
        a40Var.a(f15.getImageView());
        org.telegram.ui.ActionBar.y0 e12 = this.f47487f3.e(12, 2131231896, org.telegram.messenger.gd.M0(2131743241));
        this.f47562w3 = e12;
        org.telegram.ui.ActionBar.y0 e13 = this.f47487f3.e(13, 2131230781, org.telegram.messenger.gd.M0(2131743243));
        this.f47567x3 = e13;
        org.telegram.ui.ActionBar.y0 e14 = this.f47487f3.e(4, 2131232089, org.telegram.messenger.gd.M0(s1() ? 2131743136 : org.telegram.messenger.v3.W(this.U2) ? 2131743238 : 2131743137));
        this.f47557v3 = e14;
        this.f47487f3.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.Vg));
        this.f47487f3.getPopupLayout().setFitItems(true);
        int i20 = org.telegram.ui.ActionBar.m6.Yg;
        e12.d(org.telegram.ui.ActionBar.m6.v0(i20), org.telegram.ui.ActionBar.m6.v0(i20));
        e13.d(org.telegram.ui.ActionBar.m6.v0(i20), org.telegram.ui.ActionBar.m6.v0(i20));
        this.f47506k3.d(org.telegram.ui.ActionBar.m6.v0(i20), org.telegram.ui.ActionBar.m6.v0(i20));
        this.f47510l3.d(org.telegram.ui.ActionBar.m6.v0(i20), org.telegram.ui.ActionBar.m6.v0(i20));
        L1(this.f47515m3, org.telegram.ui.ActionBar.m6.v0(i20));
        int i21 = org.telegram.ui.ActionBar.m6.f29552mh;
        e14.d(org.telegram.ui.ActionBar.m6.v0(i21), org.telegram.ui.ActionBar.m6.v0(i21));
        e10.d(org.telegram.ui.ActionBar.m6.v0(i20), org.telegram.ui.ActionBar.m6.v0(i20));
        f13.d(org.telegram.ui.ActionBar.m6.v0(i20), org.telegram.ui.ActionBar.m6.v0(i20));
        f14.d(org.telegram.ui.ActionBar.m6.v0(i20), org.telegram.ui.ActionBar.m6.v0(i20));
        f15.d(org.telegram.ui.ActionBar.m6.v0(i20), org.telegram.ui.ActionBar.m6.v0(i20));
        e11.d(org.telegram.ui.ActionBar.m6.v0(i20), org.telegram.ui.ActionBar.m6.v0(i20));
        if (this.V2 != null) {
            p1();
        }
        if (s1()) {
            this.f47505k2 = new g.b();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.f47505k2.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        Y1(false);
        this.J1.getTitleTextView().setOnClickListener(new t00(this, 3));
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        x10 x10Var = new x10(this, launchActivity);
        this.f47511l4 = x10Var;
        y10 y10Var = new y10(this);
        this.M4 = y10Var;
        x10Var.setClipToPadding(false);
        y10Var.S();
        y10Var.f59208o = org.telegram.ui.Components.nr.f37956f;
        y10Var.d = 350L;
        y10Var.f59234c = 350L;
        y10Var.f59235e = 350L;
        x10Var.setItemAnimator(y10Var);
        x10Var.setOnScrollListener(new z10(this));
        x10Var.setClipChildren(false);
        v4.c0 c0Var = new v4.c0();
        c0Var.j1(0);
        x10Var.setLayoutManager(c0Var);
        org.telegram.ui.Components.v10 v10Var2 = new org.telegram.ui.Components.v10(t3Var, this.f30170a, this);
        this.o4 = v10Var2;
        x10Var.setAdapter(v10Var2);
        v10Var2.F(x10Var, false);
        x10Var.setOnItemClickListener(new org.telegram.ui.Components.qj0(this) {
            public final f40 f52420b;

            {
                this.f52420b = this;
            }

            @Override
            public final void c(int i132, View view4) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.u10 u10Var2 = (org.telegram.ui.Components.u10) view4;
                        org.telegram.messenger.u3 videoParticipant = u10Var2.getVideoParticipant();
                        f40 f40Var2 = this.f52420b;
                        if (videoParticipant == null) {
                            f40Var2.i1(new org.telegram.messenger.u3(u10Var2.getParticipant(), false));
                            return;
                        } else {
                            f40Var2.i1(u10Var2.getVideoParticipant());
                            return;
                        }
                    default:
                        f40 f40Var3 = this.f52420b;
                        f40Var3.getClass();
                        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) view4;
                        if (rVar.getParticipant() != null) {
                            f40Var3.i1(rVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        x10Var.setOnItemLongClickListener(new w00(this, 0));
        x10Var.setVisibility(8);
        x10Var.i(new a20());
        b20 b20Var = new b20(this, launchActivity, this.L1, x10Var, this.X3, this.V2, this);
        this.Z3 = b20Var;
        b20Var.setClipChildren(false);
        v10Var2.E(this.X3, b20Var);
        if (this.f47516m4 != null) {
            this.f47520n4.G(this.X3, b20Var);
        }
        c20 c20Var = new c20(this, launchActivity);
        this.C4 = c20Var;
        d20 d20Var = new d20(this, launchActivity, this.J1, this.L1, c20Var);
        this.f47513m1 = d20Var;
        d20Var.setImagesLayerNum(Integer.MAX_VALUE);
        d20Var.setInvalidateWithParent(true);
        c20Var.setProfileGalleryView(d20Var);
        e20 e20Var = new e20(this, launchActivity);
        this.B4 = e20Var;
        e20Var.setVisibility(8);
        d20Var.setVisibility(0);
        d20Var.b(new f20(this));
        g20 g20Var = new g20(this, launchActivity);
        this.f47469a4 = g20Var;
        this.f30173b.addView(b20Var);
        b20Var.addView(x10Var, c8.ma.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.f47526p1.setWillNotDraw(false);
        View view4 = new View(launchActivity);
        this.I4 = view4;
        int[] iArr = this.L4;
        iArr[0] = this.U3;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.L4);
        this.K4 = gradientDrawable;
        view4.setBackground(gradientDrawable);
        this.f30173b.addView(view4, c8.ma.e(-1, 60, 83));
        View view5 = new View(launchActivity);
        this.J4 = view5;
        view5.setBackgroundColor(this.L4[0]);
        this.f30173b.addView(view5, c8.ma.e(-1, 0, 83));
        nh.h hVar = new nh.h(launchActivity);
        this.X1 = hVar;
        hVar.setDelegate(new h20(this));
        hVar.setClickCellDelegate(new i20(this));
        org.telegram.messenger.t3 t3Var2 = this.V2;
        if (t3Var2 != null) {
            hVar.D0(this.f47522o1.f23246a, t3Var2.g(false));
        }
        this.f30173b.addView(hVar, c8.ma.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.voip.s0 s0Var = new org.telegram.ui.Components.voip.s0(launchActivity);
        this.f47524o3 = s0Var;
        s0Var.setOnContentHeightChanged(new v00(this, 1));
        this.f30173b.addView(s0Var, c8.ma.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f47528p3 = new ai.r2(new j20(this));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(launchActivity, false, true, true);
        this.H1 = o6Var;
        o6Var.setGravity(17);
        o6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        o6Var.setTextColor(-1);
        o6Var.b(0.4f, 320L, org.telegram.ui.Components.nr.h);
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        this.f30173b.addView(this.f47526p1);
        k20 k20Var = new k20(this, launchActivity, this.G1, LaunchActivity.Q(), this.J0);
        this.C1 = k20Var;
        k20Var.K = true;
        k20Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.Y1)});
        k20Var.getEditText().setLinkTextColor(-11683585);
        k20Var.setHint(org.telegram.messenger.gd.M0(2131743685));
        k20Var.getEditText().addTextChangedListener(new l20(this));
        k20Var.s();
        m20 m20Var = new m20(this, launchActivity);
        this.B1 = m20Var;
        this.f30173b.addView(m20Var, c8.ma.c(-1.0f, -1));
        o20 o20Var = new o20(launchActivity);
        this.A1 = o20Var;
        o20Var.addView(k20Var, c8.ma.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        o20Var.addView(o6Var, c8.ma.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        o6Var.setTranslationY(-org.telegram.messenger.g0.L(20.0f));
        this.f30173b.addView(o20Var, c8.ma.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.E1 = imageView3;
        int i22 = org.telegram.ui.ActionBar.m6.f29470i6;
        org.telegram.ui.ActionBar.t6.Q(imageView3, org.telegram.ui.ActionBar.m6.h0(W(i22), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i22), this.J0);
        int i23 = org.telegram.ui.ActionBar.m6.f29417f7;
        org.telegram.ui.ActionBar.h6 h6Var = this.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.s(imageView3, i23, h6Var, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131230871);
        imageView3.setOnClickListener(new t00(this, 4));
        ImageView imageView4 = new ImageView(launchActivity);
        this.D1 = imageView4;
        org.telegram.ui.ActionBar.t6.Q(imageView4, org.telegram.ui.ActionBar.m6.h0(W(i22), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i22), this.J0);
        org.telegram.ui.ActionBar.t6.s(imageView4, org.telegram.ui.ActionBar.m6.f29713v6, this.J0, mode);
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(2131231460);
        imageView4.setOnClickListener(new t00(this, 5));
        o20Var.addView(imageView3, c8.ma.e(48, 48, 85));
        o20Var.addView(imageView4, c8.ma.e(48, 48, 85));
        this.f30173b.addView(g20Var);
        e20Var.addView(d20Var, c8.ma.c(-1.0f, -1));
        e20Var.addView(c20Var, c8.ma.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f30173b.addView(e20Var, c8.ma.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        R0(false);
        this.K1.f();
        if (F5) {
            this.f47520n4.I(this.f47516m4, false);
        }
        this.D2 = this.K1.b();
        if (inputPeer != null) {
            TextView textView = new TextView(launchActivity);
            this.N1 = textView;
            textView.setGravity(17);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 14.0f);
            if (org.telegram.messenger.v3.T(this.U2) && (chat2 = this.U2) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            this.f30173b.addView(textView, c8.ma.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.tb0 tb0Var = new org.telegram.ui.Components.tb0(launchActivity);
            tb0Var.setTextColor(-1);
            tb0Var.setSelectorColor(-9598483);
            tb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
            tb0Var.setItemCount(5);
            p20 p20Var = new p20(launchActivity);
            p20Var.setItemCount(5);
            p20Var.setTextColor(-1);
            p20Var.setSelectorColor(-9598483);
            p20Var.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
            q20 q20Var = new q20(launchActivity);
            q20Var.setItemCount(5);
            q20Var.setTextColor(-1);
            q20Var.setSelectorColor(-9598483);
            q20Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
            r20 r20Var = new r20(launchActivity);
            this.O1 = r20Var;
            r20Var.setLines(1);
            r20Var.setSingleLine(true);
            r20Var.setEllipsize(TextUtils.TruncateAt.END);
            r20Var.setGravity(17);
            r20Var.setTextColor(-1);
            r20Var.setTypeface(org.telegram.messenger.g0.o());
            r20Var.setTextSize(1, 14.0f);
            this.f30173b.addView(r20Var, c8.ma.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            r20Var.setOnClickListener(new org.telegram.messenger.video.f(this, tb0Var, p20Var, q20Var, chat, cVar, inputPeer2, 1));
            t20 t20Var = new t20(launchActivity, tb0Var, p20Var, q20Var);
            this.M1 = t20Var;
            t20Var.setWeightSum(1.0f);
            t20Var.setOrientation(0);
            this.f30173b.addView(t20Var, c8.ma.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i24 = calendar.get(1);
            int i25 = calendar.get(6);
            t20Var.addView(tb0Var, c8.ma.l(0.5f, 0, 270));
            tb0Var.setMinValue(0);
            tb0Var.setMaxValue(365);
            tb0Var.setWrapSelectorWheel(false);
            tb0Var.setFormatter(new y00(currentTimeMillis, calendar, i24, 0));
            a1.d dVar = new a1.d(this, tb0Var, p20Var, q20Var, 14);
            f40Var = this;
            tb0Var.setOnValueChangedListener(dVar);
            p20Var.setMinValue(0);
            p20Var.setMaxValue(23);
            t20Var.addView(p20Var, c8.ma.l(0.2f, 0, 270));
            p20Var.setFormatter(new org.telegram.ui.Components.xb0(26));
            p20Var.setOnValueChangedListener(dVar);
            q20Var.setMinValue(0);
            q20Var.setMaxValue(59);
            q20Var.setValue(0);
            q20Var.setFormatter(new org.telegram.ui.Components.xb0(27));
            t20Var.addView(q20Var, c8.ma.l(0.3f, 0, 270));
            q20Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i26 = calendar.get(6);
            int i27 = calendar.get(12);
            int i28 = calendar.get(11);
            tb0Var.setValue(i25 != i26 ? 1 : 0);
            q20Var.setValue(i27);
            p20Var.setValue(i28);
            org.telegram.ui.Components.c5.g(r20Var, textView, 0L, 604800L, 2, tb0Var, p20Var, q20Var);
        } else {
            f40Var = this;
        }
        u20 u20Var = new u20(f40Var, (ViewGroup) f40Var.getWindow().getDecorView(), f40Var.f30173b);
        f40Var.f47473b4 = u20Var;
        u20Var.E = new v20(f40Var);
        d20Var.setPinchToZoomHelper(u20Var);
        f40Var.f47541s1.setOnClickListener(new View.OnClickListener(f40Var) {
            public final f40 f54356b;

            {
                this.f54356b = f40Var;
            }

            @Override
            public final void onClick(View view6) {
                switch (r3) {
                    case 0:
                        f40 f40Var2 = this.f54356b;
                        LaunchActivity launchActivity2 = f40Var2.d2;
                        if (launchActivity2 != null && launchActivity2.checkSelfPermission("android.permission.CAMERA") != 0) {
                            f40Var2.d2.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
                            return;
                        } else if (VoIPService.getSharedInstance() != null) {
                            boolean z112 = false;
                            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                                f40Var2.f47482e2[0].d(1, false);
                                if (f40Var2.f47551u2 == null) {
                                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                                    if (sharedInstance2 != null) {
                                        sharedInstance2.createCaptureDevice(false);
                                    }
                                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                                        z112 = true;
                                    }
                                    w20 w20Var = new w20(f40Var2, launchActivity, z112);
                                    f40Var2.f47551u2 = w20Var;
                                    w20Var.setBottomPadding(f40Var2.f30173b.getPaddingBottom());
                                    f40Var2.f30176c.addView(f40Var2.f47551u2);
                                    if (sharedInstance2 != null && !sharedInstance2.isFrontFaceCamera()) {
                                        sharedInstance2.switchCamera();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            VoIPService.getSharedInstance().setVideoState(false, 0);
                            f40Var2.W1(true, false);
                            f40Var2.V1(false);
                            f40Var2.V2.z();
                            f40Var2.R0(true);
                            f40Var2.f47526p1.requestLayout();
                            return;
                        } else {
                            return;
                        }
                    default:
                        f40 f40Var3 = this.f54356b;
                        f40Var3.Z3.e();
                        org.telegram.messenger.t3 t3Var22 = f40Var3.V2;
                        if (t3Var22 != null && !t3Var22.j()) {
                            f40Var3.P1();
                            f40.x1(launchActivity, new v00(f40Var3, 6), false, false);
                            return;
                        }
                        f40Var3.dismiss();
                        return;
                }
            }
        });
        f40Var.U1(false);
        f40Var.P1();
        f40Var.V1(false);
        f40Var.W1(false, false);
        f40Var.H1(0.0f);
        f40Var.X1();
        f40Var.f30173b.addView(new FrameLayout(launchActivity), c8.ma.e(-1, 200, 87));
        f40Var.f47555v1.setOnClickListener(new t00(f40Var, 6));
        f40Var.W0();
        c8.ra.a(f40Var.f47541s1);
        c8.ra.a(f40Var.f47545t1);
        c8.ra.a(f40Var.f47531q1);
        c8.ra.a(f40Var.f47536r1);
        c8.ra.a(f40Var.f47560w1);
        c8.ra.a(f40Var.f47550u1);
        c8.ra.a(f40Var.f47555v1);
        r0.i0.l(f40Var.f30173b, new w00(f40Var, 1));
    }

    public static void C1(org.telegram.messenger.t3 t3Var, boolean z10, long j3, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z10 ? 1 : 0);
        }
        if (t3Var != null) {
            ArrayList arrayList = t3Var.f26966f;
            ArrayList arrayList2 = t3Var.f26965e;
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) t3Var.d.f(j3);
            if (groupCallParticipant != null) {
                t3Var.d.e(j3);
                arrayList2.remove(groupCallParticipant);
                t3Var.f26967g.remove(groupCallParticipant);
                int i7 = 0;
                while (i7 < arrayList.size()) {
                    if (org.telegram.messenger.fj.B1(((org.telegram.messenger.u3) arrayList.get(i7)).f27145a.peer) == org.telegram.messenger.fj.B1(groupCallParticipant.peer)) {
                        arrayList.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                TLRPC.GroupCall groupCall = t3Var.f26963b;
                groupCall.participants_count--;
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) arrayList2.get(i10);
                groupCallParticipant2.lastActiveDate = groupCallParticipant2.lastSpeakTime;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25234v2, new Object[0]);
    }

    public static void J0(final f40 f40Var, Activity activity, org.telegram.messenger.t3 t3Var, View view, int i7) {
        TLRPC.Chat chat;
        final Long l10;
        boolean z10;
        final org.telegram.messenger.s3 s3Var;
        org.telegram.messenger.c cVar = f40Var.f47522o1;
        ArrayList arrayList = f40Var.A2;
        z30 z30Var = f40Var.K1;
        if (view instanceof org.telegram.ui.Components.voip.r) {
            f40Var.i1(((org.telegram.ui.Components.voip.r) view).getParticipant());
        } else if (view instanceof org.telegram.ui.Cells.g4) {
            f40Var.M1((org.telegram.ui.Cells.g4) view);
        } else {
            Collection collection = null;
            if (view instanceof org.telegram.ui.Cells.z3) {
                org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
                if (z3Var.getUser() != null) {
                    if (f40Var.s1()) {
                        int i10 = i7 - z30Var.f54390n;
                        if (i10 >= 0 && i10 < f40Var.V2.f26972m.size()) {
                            l10 = (Long) f40Var.V2.f26972m.get(i7 - z30Var.f54390n);
                        } else {
                            int i11 = i7 - z30Var.f54392s;
                            if (i11 >= 0 && i11 < f40Var.V2.f26971l.size()) {
                                l10 = (Long) f40Var.V2.f26971l.get(i7 - z30Var.f54392s);
                            } else {
                                int i12 = i7 - z30Var.f54389f;
                                if (f40Var.f47518n2) {
                                    if (i12 >= 0 && i12 < arrayList.size()) {
                                        l10 = (Long) arrayList.get(i12);
                                        z10 = false;
                                    }
                                    l10 = null;
                                    z10 = false;
                                } else {
                                    if (i12 >= 0 && i12 < f40Var.V2.f26969j.size()) {
                                        l10 = (Long) f40Var.V2.f26969j.get(i12);
                                        z10 = false;
                                    }
                                    l10 = null;
                                    z10 = false;
                                }
                                if (!z10 && (s3Var = (org.telegram.messenger.s3) f40Var.V2.f26970k.get(l10)) != null) {
                                    org.telegram.ui.Components.a70 G = org.telegram.ui.Components.a70.G(f40Var.f30176c, f40Var.J0, z3Var);
                                    G.l(2131232131, org.telegram.messenger.gd.N0(2131749267, null), new Runnable(f40Var) {
                                        public final f40 f46850b;

                                        {
                                            this.f46850b = f40Var;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.s3 s3Var2 = s3Var;
                                                    declineconferencecallinvite.msg_id = s3Var2.f26758a;
                                                    final f40 f40Var2 = this.f46850b;
                                                    ConnectionsManager.getInstance(f40Var2.f30170a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    f40 f40Var3 = f40Var2;
                                                                    if (z11) {
                                                                        org.telegram.messenger.mp.u1(f40Var3.f30170a).V3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        f40Var3.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                                    f40 f40Var4 = f40Var2;
                                                                    if (z12) {
                                                                        org.telegram.messenger.mp.u1(f40Var4.f30170a).V3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        f40Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    org.telegram.messenger.t3 t3Var2 = f40Var2.V2;
                                                    if (t3Var2 != null) {
                                                        s3Var2.f26759b = false;
                                                        t3Var2.f26970k.put(l10, s3Var2);
                                                        f40Var2.R0(true);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.s3 s3Var3 = s3Var;
                                                    declineconferencecallinvite2.msg_id = s3Var3.f26758a;
                                                    final f40 f40Var3 = this.f46850b;
                                                    ConnectionsManager.getInstance(f40Var3.f30170a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    f40 f40Var32 = f40Var3;
                                                                    if (z11) {
                                                                        org.telegram.messenger.mp.u1(f40Var32.f30170a).V3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        f40Var32.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                                    f40 f40Var4 = f40Var3;
                                                                    if (z12) {
                                                                        org.telegram.messenger.mp.u1(f40Var4.f30170a).V3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        f40Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Integer.valueOf(s3Var3.f26758a));
                                                    org.telegram.messenger.mp.u1(f40Var3.f30170a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                                    org.telegram.messenger.t3 t3Var3 = f40Var3.V2;
                                                    if (t3Var3 != null) {
                                                        ArrayList arrayList3 = t3Var3.f26969j;
                                                        Long l11 = l10;
                                                        arrayList3.remove(l11);
                                                        f40Var3.V2.f26973n.remove(l11);
                                                        f40Var3.V2.f26970k.remove(l11);
                                                        f40Var3.R0(true);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    }, s3Var.a());
                                    G.c(2131232330, org.telegram.messenger.gd.N0(2131749278, null), new Runnable(f40Var) {
                                        public final f40 f46850b;

                                        {
                                            this.f46850b = f40Var;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.s3 s3Var2 = s3Var;
                                                    declineconferencecallinvite.msg_id = s3Var2.f26758a;
                                                    final f40 f40Var2 = this.f46850b;
                                                    ConnectionsManager.getInstance(f40Var2.f30170a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    f40 f40Var32 = f40Var2;
                                                                    if (z11) {
                                                                        org.telegram.messenger.mp.u1(f40Var32.f30170a).V3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        f40Var32.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                                    f40 f40Var4 = f40Var2;
                                                                    if (z12) {
                                                                        org.telegram.messenger.mp.u1(f40Var4.f30170a).V3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        f40Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    org.telegram.messenger.t3 t3Var2 = f40Var2.V2;
                                                    if (t3Var2 != null) {
                                                        s3Var2.f26759b = false;
                                                        t3Var2.f26970k.put(l10, s3Var2);
                                                        f40Var2.R0(true);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.s3 s3Var3 = s3Var;
                                                    declineconferencecallinvite2.msg_id = s3Var3.f26758a;
                                                    final f40 f40Var3 = this.f46850b;
                                                    ConnectionsManager.getInstance(f40Var3.f30170a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    f40 f40Var32 = f40Var3;
                                                                    if (z11) {
                                                                        org.telegram.messenger.mp.u1(f40Var32.f30170a).V3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        f40Var32.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                                    f40 f40Var4 = f40Var3;
                                                                    if (z12) {
                                                                        org.telegram.messenger.mp.u1(f40Var4.f30170a).V3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        f40Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Integer.valueOf(s3Var3.f26758a));
                                                    org.telegram.messenger.mp.u1(f40Var3.f30170a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                                    org.telegram.messenger.t3 t3Var3 = f40Var3.V2;
                                                    if (t3Var3 != null) {
                                                        ArrayList arrayList3 = t3Var3.f26969j;
                                                        Long l11 = l10;
                                                        arrayList3.remove(l11);
                                                        f40Var3.V2.f26973n.remove(l11);
                                                        f40Var3.V2.f26970k.remove(l11);
                                                        f40Var3.R0(true);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    }, false);
                                    G.X(org.telegram.ui.ActionBar.m6.e0(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), f40Var.f47566x2.getColor()));
                                    G.f33384s = 96;
                                    G.a0();
                                    return;
                                }
                                return;
                            }
                        }
                        z10 = true;
                        if (!z10) {
                            org.telegram.ui.Components.a70 G2 = org.telegram.ui.Components.a70.G(f40Var.f30176c, f40Var.J0, z3Var);
                            G2.l(2131232131, org.telegram.messenger.gd.N0(2131749267, null), new Runnable(f40Var) {
                                public final f40 f46850b;

                                {
                                    this.f46850b = f40Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.s3 s3Var2 = s3Var;
                                            declineconferencecallinvite.msg_id = s3Var2.f26758a;
                                            final f40 f40Var2 = this.f46850b;
                                            ConnectionsManager.getInstance(f40Var2.f30170a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            f40 f40Var32 = f40Var2;
                                                            if (z11) {
                                                                org.telegram.messenger.mp.u1(f40Var32.f30170a).V3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                f40Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z12 = tLObject instanceof TLRPC.Updates;
                                                            f40 f40Var4 = f40Var2;
                                                            if (z12) {
                                                                org.telegram.messenger.mp.u1(f40Var4.f30170a).V3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                f40Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            org.telegram.messenger.t3 t3Var2 = f40Var2.V2;
                                            if (t3Var2 != null) {
                                                s3Var2.f26759b = false;
                                                t3Var2.f26970k.put(l10, s3Var2);
                                                f40Var2.R0(true);
                                                return;
                                            }
                                            return;
                                        default:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.s3 s3Var3 = s3Var;
                                            declineconferencecallinvite2.msg_id = s3Var3.f26758a;
                                            final f40 f40Var3 = this.f46850b;
                                            ConnectionsManager.getInstance(f40Var3.f30170a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            f40 f40Var32 = f40Var3;
                                                            if (z11) {
                                                                org.telegram.messenger.mp.u1(f40Var32.f30170a).V3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                f40Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z12 = tLObject instanceof TLRPC.Updates;
                                                            f40 f40Var4 = f40Var3;
                                                            if (z12) {
                                                                org.telegram.messenger.mp.u1(f40Var4.f30170a).V3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                f40Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(Integer.valueOf(s3Var3.f26758a));
                                            org.telegram.messenger.mp.u1(f40Var3.f30170a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                            org.telegram.messenger.t3 t3Var3 = f40Var3.V2;
                                            if (t3Var3 != null) {
                                                ArrayList arrayList3 = t3Var3.f26969j;
                                                Long l11 = l10;
                                                arrayList3.remove(l11);
                                                f40Var3.V2.f26973n.remove(l11);
                                                f40Var3.V2.f26970k.remove(l11);
                                                f40Var3.R0(true);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, s3Var.a());
                            G2.c(2131232330, org.telegram.messenger.gd.N0(2131749278, null), new Runnable(f40Var) {
                                public final f40 f46850b;

                                {
                                    this.f46850b = f40Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.s3 s3Var2 = s3Var;
                                            declineconferencecallinvite.msg_id = s3Var2.f26758a;
                                            final f40 f40Var2 = this.f46850b;
                                            ConnectionsManager.getInstance(f40Var2.f30170a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            f40 f40Var32 = f40Var2;
                                                            if (z11) {
                                                                org.telegram.messenger.mp.u1(f40Var32.f30170a).V3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                f40Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z12 = tLObject instanceof TLRPC.Updates;
                                                            f40 f40Var4 = f40Var2;
                                                            if (z12) {
                                                                org.telegram.messenger.mp.u1(f40Var4.f30170a).V3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                f40Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            org.telegram.messenger.t3 t3Var2 = f40Var2.V2;
                                            if (t3Var2 != null) {
                                                s3Var2.f26759b = false;
                                                t3Var2.f26970k.put(l10, s3Var2);
                                                f40Var2.R0(true);
                                                return;
                                            }
                                            return;
                                        default:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.s3 s3Var3 = s3Var;
                                            declineconferencecallinvite2.msg_id = s3Var3.f26758a;
                                            final f40 f40Var3 = this.f46850b;
                                            ConnectionsManager.getInstance(f40Var3.f30170a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            f40 f40Var32 = f40Var3;
                                                            if (z11) {
                                                                org.telegram.messenger.mp.u1(f40Var32.f30170a).V3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                f40Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z12 = tLObject instanceof TLRPC.Updates;
                                                            f40 f40Var4 = f40Var3;
                                                            if (z12) {
                                                                org.telegram.messenger.mp.u1(f40Var4.f30170a).V3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                f40Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(Integer.valueOf(s3Var3.f26758a));
                                            org.telegram.messenger.mp.u1(f40Var3.f30170a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                            org.telegram.messenger.t3 t3Var3 = f40Var3.V2;
                                            if (t3Var3 != null) {
                                                ArrayList arrayList3 = t3Var3.f26969j;
                                                Long l11 = l10;
                                                arrayList3.remove(l11);
                                                f40Var3.V2.f26973n.remove(l11);
                                                f40Var3.V2.f26970k.remove(l11);
                                                f40Var3.R0(true);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, false);
                            G2.X(org.telegram.ui.ActionBar.m6.e0(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), f40Var.f47566x2.getColor()));
                            G2.f33384s = 96;
                            G2.a0();
                            return;
                        }
                        return;
                    }
                    f40Var.d2.O0(f40Var.f30170a);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", z3Var.getUser().f28580id);
                    if (z3Var.f32533a.getImageReceiver().L()) {
                        bundle.putBoolean("expandPhoto", true);
                    }
                    f40Var.d2.t0(new ProfileActivity(bundle, null));
                    f40Var.dismiss();
                }
            } else if (i7 == z30Var.f54394x) {
                if (org.telegram.messenger.v3.T(f40Var.U2) && (chat = f40Var.U2) != null && !chat.megagroup && org.telegram.messenger.v3.t0(chat)) {
                    f40Var.n1(false);
                    return;
                }
                TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(cVar.f23246a).P0(f40Var.m1());
                if (P0 != null) {
                    f40Var.f47537r2 = false;
                    Context context = f40Var.getContext();
                    int i13 = cVar.f23246a;
                    TLRPC.Chat chat2 = f40Var.U2;
                    org.telegram.messenger.t3 t3Var2 = f40Var.V2;
                    org.telegram.ui.Components.v20 v20Var = new org.telegram.ui.Components.v20(context, i13, chat2, P0, t3Var2.d, t3Var2.f26973n);
                    f40Var.D3 = v20Var;
                    v20Var.setOnDismissListener(new b10(f40Var, 2));
                    org.telegram.ui.Components.v20 v20Var2 = f40Var.D3;
                    v20Var2.f40654b2 = new k10(f40Var);
                    v20Var2.show();
                }
            } else if (i7 == z30Var.f54395y) {
                org.telegram.messenger.t3 t3Var3 = f40Var.V2;
                if (t3Var3 != null && t3Var3.f26963b != null) {
                    wg.e1 e1Var = new wg.e1(activity, f40Var.f30170a, new fi.h0());
                    org.telegram.messenger.t3 t3Var4 = f40Var.V2;
                    if (t3Var4 != null) {
                        collection = (Collection) Collection.EL.stream(t3Var4.f26965e).map(new aa.l(12)).collect(Collectors.toSet());
                    }
                    e1Var.f59802t2.addAll(collection);
                    e1Var.l1(false, true);
                    e1Var.f59801s2 = new v00(f40Var, 5);
                    e1Var.l1(false, true);
                    e1Var.f59803u2 = new bi.p6(22, f40Var, t3Var);
                    e1Var.show();
                }
            } else if (i7 == z30Var.E) {
                f40Var.B1();
            }
        }
    }

    public static void K0(f40 f40Var, org.telegram.ui.Components.voip.r rVar, boolean z10) {
        if (!f40Var.J) {
            if (z10 && rVar.getRenderer() == null) {
                rVar.setRenderer(org.telegram.ui.Components.voip.y.c(f40Var.X3, f40Var.Z3, rVar, null, null, rVar.getParticipant(), f40Var.V2, f40Var));
            } else if (!z10 && rVar.getRenderer() != null) {
                rVar.getRenderer().setPrimaryView(null);
                rVar.setRenderer(null);
            }
        }
    }

    public static void L0(f40 f40Var, int i7, int[] iArr) {
        if (f40Var.v1()) {
            int i10 = org.telegram.ui.ActionBar.m6.Bh;
            iArr[0] = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
            iArr[1] = org.telegram.messenger.g0.S0(f40Var.T3, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ch, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29628qh, false));
            iArr[2] = org.telegram.messenger.g0.S0(f40Var.T3, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29351bh, false), org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        } else if (i7 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ah, false);
            iArr[1] = org.telegram.messenger.g0.S0(f40Var.T3, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29609ph, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29628qh, false));
            iArr[2] = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29589oh, false);
        } else if (i7 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29761xh, false);
            iArr[1] = org.telegram.messenger.g0.S0(f40Var.T3, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29666sh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29685th, false));
            iArr[2] = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29648rh, false);
        } else if (t1(i7)) {
            iArr[0] = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29352bi, false);
            iArr[1] = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29372ci, false);
            iArr[2] = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29389di, false);
        } else {
            int i11 = org.telegram.ui.ActionBar.m6.Bh;
            iArr[0] = org.telegram.ui.ActionBar.m6.x0(null, i11, false);
            iArr[1] = org.telegram.messenger.g0.S0(f40Var.T3, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Dh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Eh, false));
            iArr[2] = org.telegram.messenger.g0.S0(f40Var.T3, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29351bh, false), org.telegram.ui.ActionBar.m6.x0(null, i11, false));
        }
        if (t1(i7)) {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Zh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29352bi, false));
        } else if (i7 == 1) {
            iArr[3] = i0.a.f(0.75f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29666sh, false), i0.a.f(0.5f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29742wh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29780yh, false)));
        } else {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ah, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29800zh, false));
        }
    }

    public static void L1(org.telegram.ui.ActionBar.y0 y0Var, int i7) {
        if (y0Var != null) {
            y0Var.d(i7, i7);
            if (y0Var.getRightIcon() != null) {
                y0Var.getRightIcon().setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public static String M0() {
        String[] strArr = org.telegram.messenger.k6.f25021i[(int) Math.floor(Math.random() * 8)];
        return strArr[(int) Math.floor(Math.random() * strArr.length)];
    }

    public static void N0(f40 f40Var) {
        org.telegram.messenger.t3 t3Var = f40Var.V2;
        if (t3Var != null && t3Var.f26963b != null) {
            TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
            org.telegram.messenger.t3 t3Var2 = f40Var.V2;
            togglegroupcallsettings.call = t3Var2.g(t3Var2.f26962a);
            togglegroupcallsettings.join_muted = Boolean.valueOf(f40Var.V2.f26963b.join_muted);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(f40Var.f47522o1.f23246a);
            org.telegram.messenger.q5 q5Var = Utilities.d;
            Objects.requireNonNull(q5Var);
            connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.x3(q5Var), new f10(f40Var, 1));
        }
    }

    public static void O0(f40 f40Var, boolean z10) {
        if (f40Var.V2 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        org.telegram.messenger.t3 t3Var = f40Var.V2;
        togglegroupcallsettings.call = t3Var.g(t3Var.f26962a);
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        f40Var.f47564w5 = Boolean.valueOf(z10);
        f40Var.O1(true);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(f40Var.f47522o1.f23246a);
        org.telegram.messenger.q5 q5Var = Utilities.d;
        Objects.requireNonNull(q5Var);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.x3(q5Var), new f10(f40Var, 0));
    }

    public static int P0(f40 f40Var, int i7) {
        o10 o10Var = f40Var.f47526p1;
        org.telegram.ui.Components.voip.r h12 = f40Var.h1();
        if (h12 == null) {
            return Integer.MIN_VALUE;
        }
        int measuredHeight = ((o10Var.getMeasuredHeight() / 2) + o10Var.getTop()) - (f40Var.f47550u1.getMeasuredHeight() / 2);
        int measuredHeight2 = h12.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
        return i5.c.e(measuredHeight, measuredHeight2, 2, measuredHeight2) - org.telegram.messenger.g0.L(32.0f);
    }

    public static void Q0(f40 f40Var) {
        boolean z10;
        Integer num;
        boolean z11;
        float f10;
        float f11;
        float L;
        float L2;
        float L3;
        float f12;
        float f13;
        float f14;
        View childAt;
        d30 d30Var = f40Var.J1;
        n30 n30Var = f40Var.L1;
        int childCount = n30Var.getChildCount();
        boolean z12 = false;
        float f15 = 2.1474836E9f;
        for (int i7 = 0; i7 < childCount; i7++) {
            if (RecyclerView.R(n30Var.getChildAt(i7)) >= 0) {
                f15 = Math.min(f15, childAt.getTop());
            }
        }
        if (f15 < 0.0f || f15 == 2.1474836E9f) {
            if (childCount != 0) {
                f15 = 0.0f;
            } else {
                f15 = n30Var.getPaddingTop();
            }
        }
        if (f15 <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float L4 = f15 + org.telegram.messenger.g0.L(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if ((z10 && d30Var.getTag() == null) || (!z10 && d30Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            d30Var.setTag(num);
            AnimatorSet animatorSet = f40Var.f47475c2;
            if (animatorSet != null) {
                animatorSet.cancel();
                f40Var.f47475c2 = null;
            }
            if (d30Var.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            f40Var.G0(z11);
            ViewPropertyAnimator animate = d30Var.getBackButton().animate();
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
                f11 = -org.telegram.messenger.g0.L(14.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationX(f11).setDuration(300L);
            org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f37956f;
            duration.setInterpolator(nrVar).start();
            ViewPropertyAnimator animate2 = d30Var.getTitleTextView().animate();
            if (z10) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(23.0f);
            }
            animate2.translationY(L).setDuration(300L).setInterpolator(nrVar).start();
            ObjectAnimator objectAnimator = f40Var.T4;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                f40Var.T4.cancel();
            }
            org.telegram.ui.ActionBar.m5 subtitleTextView = d30Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            float translationY = d30Var.getSubtitleTextView().getTranslationY();
            if (z10) {
                L2 = 0.0f;
            } else {
                L2 = org.telegram.messenger.g0.L(20.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, property, translationY, L2);
            f40Var.T4 = ofFloat;
            ofFloat.setDuration(300L);
            f40Var.T4.setInterpolator(nrVar);
            f40Var.T4.addListener(new c30(0, f40Var, z10));
            f40Var.T4.start();
            ObjectAnimator objectAnimator2 = f40Var.U4;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            org.telegram.ui.ActionBar.m5 additionalSubtitleTextView = d30Var.getAdditionalSubtitleTextView();
            if (z10) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.g0.L(20.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(additionalSubtitleTextView, property, L3);
            f40Var.U4 = ofFloat2;
            ofFloat2.setDuration(300L);
            f40Var.U4.setInterpolator(nrVar);
            f40Var.U4.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            f40Var.f47475c2 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = f40Var.f47475c2;
            Property property2 = View.ALPHA;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(d30Var, property2, f12);
            u10 u10Var = f40Var.I1;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(u10Var, property2, f13);
            View view = f40Var.f47471b2;
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, property2, f14));
            f40Var.f47475c2.addListener(new a30(f40Var, 1));
            f40Var.f47475c2.start();
            f40Var.Z3.f41135w.setClickable((!z10 || E5) ? true : true);
        }
        if (f40Var.f47546t2 != L4) {
            f40Var.K1(L4);
        }
    }

    public static void f1(LaunchActivity launchActivity, org.telegram.messenger.c cVar, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        if (C5 == null) {
            if (inputPeer != null || VoIPService.getSharedInstance() != null) {
                if (inputPeer != null) {
                    C5 = new f40(launchActivity, cVar, org.telegram.messenger.mp.u1(cVar.f23246a).i1(chat.f28431id, false, null), chat, inputPeer, z10, str);
                } else {
                    org.telegram.messenger.t3 t3Var = VoIPService.getSharedInstance().groupCall;
                    if (t3Var != null) {
                        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(cVar.f23246a).O0(Long.valueOf(t3Var.f26964c));
                        t3Var.b(true);
                        C5 = new f40(launchActivity, cVar, t3Var, O0, null, z10, str);
                    } else {
                        return;
                    }
                }
                C5.d2 = launchActivity;
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.me(23));
            }
        }
    }

    public static String j1(int i7) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    return null;
                }
                if (sharedInstance != null && (str = sharedInstance.currentBluetoothDeviceName) != null) {
                    return str;
                }
                return org.telegram.messenger.gd.N0(2131743260, null);
            } else if (sharedInstance != null && sharedInstance.isHeadsetPlugged()) {
                return org.telegram.messenger.gd.N0(2131743258, null);
            } else {
                return org.telegram.messenger.gd.N0(2131743257, null);
            }
        }
        return org.telegram.messenger.gd.N0(2131743256, null);
    }

    public static String k1(int i7) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i7 == 2) {
            if (sharedInstance != null && (str = sharedInstance.currentBluetoothDeviceName) != null) {
                return org.telegram.messenger.gd.a0(null, null, 2131743254, str);
            }
            return org.telegram.messenger.gd.N0(2131743255, null);
        } else if (i7 == 1) {
            if (sharedInstance != null && sharedInstance.isHeadsetPlugged()) {
                return org.telegram.messenger.gd.N0(2131743253, null);
            }
            return org.telegram.messenger.gd.N0(2131743252, null);
        } else {
            return org.telegram.messenger.gd.N0(2131743251, null);
        }
    }

    public static boolean t1(int i7) {
        if ((VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.f26963b.rtmp_stream) && i7 != 2 && i7 != 4 && i7 != 5 && i7 != 6 && i7 != 7) {
            return false;
        }
        return true;
    }

    public static void x1(Context context, Runnable runnable, boolean z10, boolean z11) {
        int L;
        int L2;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            org.telegram.messenger.t3 t3Var = sharedInstance.groupCall;
            long selfId = sharedInstance.getSelfId();
            if (!z11 && org.telegram.messenger.v3.w(14, chat)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                boolean isConference = sharedInstance.isConference();
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
                if (isConference) {
                    t1Var.S = org.telegram.messenger.gd.N0(2131743225, null);
                    t1Var.U = org.telegram.messenger.gd.N0(2131743226, null);
                } else if (org.telegram.messenger.v3.W(chat)) {
                    t1Var.S = org.telegram.messenger.gd.N0(2131743228, null);
                    t1Var.U = org.telegram.messenger.gd.N0(2131743229, null);
                } else {
                    t1Var.S = org.telegram.messenger.gd.N0(2131743118, null);
                    t1Var.U = org.telegram.messenger.gd.N0(2131743119, null);
                }
                sharedInstance.getAccount();
                org.telegram.ui.Cells.d2[] d2VarArr = new org.telegram.ui.Cells.d2[1];
                LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
                if (!sharedInstance.isConference() || (t3Var != null && (groupCall = t3Var.f26963b) != null && groupCall.creator)) {
                    org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(context, 1);
                    d2VarArr[0] = d2Var;
                    d2Var.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
                    if (z10) {
                        d2VarArr[0].setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29486j5, false));
                    } else {
                        d2VarArr[0].setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yg, false));
                        CheckBoxSquare checkBoxSquare = (CheckBoxSquare) d2VarArr[0].getCheckBoxView();
                        int i7 = org.telegram.ui.ActionBar.m6.f29479ih;
                        int i10 = org.telegram.ui.ActionBar.m6.f29444gh;
                        int i11 = org.telegram.ui.ActionBar.m6.f29407eh;
                        checkBoxSquare.f32887s = i7;
                        checkBoxSquare.f32888w = i10;
                        checkBoxSquare.f32889x = i11;
                        checkBoxSquare.invalidate();
                    }
                    d2VarArr[0].setTag(0);
                    if (sharedInstance.isConference()) {
                        d2VarArr[0].e(org.telegram.messenger.gd.N0(2131743227, null), "", false, false, false);
                    } else if (org.telegram.messenger.v3.W(chat)) {
                        d2VarArr[0].e(org.telegram.messenger.gd.N0(2131743230, null), "", false, false, false);
                    } else {
                        d2VarArr[0].e(org.telegram.messenger.gd.N0(2131743120, null), "", false, false, false);
                    }
                    org.telegram.ui.Cells.d2 d2Var2 = d2VarArr[0];
                    if (org.telegram.messenger.gd.f24241a0) {
                        L = org.telegram.messenger.g0.L(16.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(8.0f);
                    }
                    if (org.telegram.messenger.gd.f24241a0) {
                        L2 = org.telegram.messenger.g0.L(8.0f);
                    } else {
                        L2 = org.telegram.messenger.g0.L(16.0f);
                    }
                    d2Var2.setPadding(L, 0, L2, 0);
                    g10.addView(d2VarArr[0], c8.ma.o(-1, -2));
                    d2VarArr[0].setOnClickListener(new c10(d2VarArr, 0));
                }
                alertDialog$Builder.o(g10);
                t1Var.J = org.telegram.ui.ActionBar.m6.f29444gh;
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131743121, null), new bg.f0(t3Var, d2VarArr, selfId, runnable, 5));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                if (z10) {
                    t1Var.Q0 = false;
                }
                if (z10) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        t1Var.getWindow().setType(2038);
                    } else {
                        t1Var.getWindow().setType(2003);
                    }
                    t1Var.getWindow().clearFlags(2);
                }
                if (!z10) {
                    t1Var.j(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29535lh, false));
                }
                t1Var.show();
                if (!z10) {
                    TextView textView = (TextView) t1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29552mh, null);
                    }
                    t1Var.p(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yg, false));
                    return;
                }
                return;
            }
            C1(t3Var, false, selfId, runnable);
        }
    }

    public final void A1(java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f40.A1(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final void B1() {
        org.telegram.messenger.t3 t3Var = this.V2;
        if (t3Var != null && t3Var.f26963b != null) {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, getContext(), null);
            t1Var.r(300L);
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = this.V2.f26963b;
            tL_inputGroupCall.f28448id = groupCall.f28441id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(this.f30170a).sendRequest(exportgroupcallinvite, new z9(this, t1Var, exportgroupcallinvite, 12));
        }
    }

    public final void D1(org.telegram.tgnet.TLRPC.GroupCallParticipant r33, final long r34, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f40.D1(org.telegram.tgnet.TLRPC$GroupCallParticipant, long, int):void");
    }

    public final void E1(boolean r18, org.telegram.ui.Cells.g4 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f40.E1(boolean, org.telegram.ui.Cells.g4):void");
    }

    public final void F1() {
        m4 m4Var = this.f47578z4;
        org.telegram.messenger.g0.r(m4Var);
        if (this.f47573y4 && this.P2 != null && VoIPService.getSharedInstance() != null && v1() && this.L1 != null && org.telegram.messenger.pc.e(512)) {
            org.telegram.messenger.g0.h3(m4Var, 30L);
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void G1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall g10;
        long j3;
        this.C1.setText("");
        org.telegram.messenger.t3 t3Var = this.V2;
        if (t3Var != null && t3Var.f26963b != null && (g10 = t3Var.g(t3Var.f26962a)) != null) {
            org.telegram.messenger.t3 t3Var2 = this.V2;
            long j10 = t3Var2.f26963b.f28441id;
            TLRPC.Peer peer = t3Var2.J;
            if (peer != null) {
                j3 = org.telegram.messenger.n5.o(peer);
            } else {
                j3 = org.telegram.messenger.j10.i(this.f30170a).f24817n;
            }
            GroupCallMessagesController.getInstance(this.f30170a).sendCallMessage(j3, tL_textWithEntities, j10, g10);
        }
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 2) {
            b1();
            Z0();
            a1();
            float f12 = 1.0f - this.f47574y5.f57696e;
            o10 o10Var = this.f47526p1;
            o10Var.setAlpha(f12);
            this.Z3.setProgressToHideUi(f10);
            this.f47511l4.invalidate();
            this.f30173b.invalidate();
            o10Var.invalidate();
        }
        if (i7 == 3) {
            c1();
            b1();
            d1();
            Y0();
            this.f30173b.invalidate();
        }
        if (i7 == 4) {
            b1();
            this.B1.invalidate();
            this.C1.invalidate();
        }
        if (i7 == 5) {
            b1();
            this.f30173b.invalidate();
        }
    }

    public final void H1(float f10) {
        float f11;
        int i7;
        int i10;
        this.T3 = f10;
        b20 b20Var = this.Z3;
        if (b20Var == null) {
            f11 = 0.0f;
        } else {
            f11 = b20Var.f41110c;
        }
        float max = Math.max(f10, f11);
        int i11 = org.telegram.ui.ActionBar.m6.f29331ah;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.m6.Xg;
        int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, x02, org.telegram.ui.ActionBar.m6.x0(null, i12, false));
        this.U3 = S0;
        this.I1.setBackgroundColor(S0);
        this.f47487f3.I(-14472653);
        this.f47467a2.setColorFilter(new PorterDuffColorFilter(this.U3, PorterDuff.Mode.MULTIPLY));
        this.H0 = org.telegram.messenger.g0.S0(max, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, i11, false), org.telegram.ui.ActionBar.m6.x0(null, i12, false));
        int S02 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29351bh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29517kh, false));
        g.b bVar = this.f47505k2;
        if (bVar != null) {
            bVar.f12957b = S02;
            uv uvVar = (uv) bVar.f12962i;
            if (uvVar != null) {
                uvVar.invalidate();
            }
        }
        this.f47566x2.setColor(S02);
        this.f47575z1.setColor(S02);
        this.A1.invalidate();
        n30 n30Var = this.L1;
        n30Var.setGlowColor(S02);
        int i13 = this.E3;
        if (i13 == 3 || t1(i13)) {
            this.f47560w1.invalidate();
        }
        View view = this.I4;
        if (view != null) {
            int i14 = this.U3;
            int[] iArr = this.L4;
            iArr[0] = i14;
            iArr[1] = 0;
            if (Build.VERSION.SDK_INT > 29) {
                this.K4.setColors(iArr);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
                this.K4 = gradientDrawable;
                view.setBackground(gradientDrawable);
            }
            this.J4.setBackgroundColor(iArr[0]);
        }
        int S03 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29705uh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29723vh, false));
        this.f47550u1.a(S03, S03);
        int S04 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29371ch, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29424fh, false));
        int S05 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29388dh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29479ih, false));
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, this.J0);
        int childCount = n30Var.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = n30Var.getChildAt(i15);
            if (childAt instanceof org.telegram.ui.Cells.a4) {
                org.telegram.ui.Cells.a4 a4Var = (org.telegram.ui.Cells.a4) childAt;
                if (s1()) {
                    a4Var.a(w02, w02);
                } else {
                    a4Var.a(S05, S04);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.g4;
                d30 d30Var = this.J1;
                if (z10) {
                    org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) childAt;
                    if (d30Var.getTag() != null) {
                        i10 = org.telegram.ui.ActionBar.m6.f29479ih;
                    } else {
                        i10 = org.telegram.ui.ActionBar.m6.f29388dh;
                    }
                    g4Var.f(i10, S05);
                } else if (childAt instanceof org.telegram.ui.Cells.z3) {
                    org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) childAt;
                    if (d30Var.getTag() != null) {
                        i7 = org.telegram.ui.ActionBar.m6.f29479ih;
                    } else {
                        i7 = org.telegram.ui.ActionBar.m6.f29388dh;
                    }
                    z3Var.a(i7, S05);
                }
            }
        }
        this.f30173b.invalidate();
        n30Var.invalidate();
        this.f30176c.invalidate();
    }

    @Override
    public final boolean I() {
        return !this.Z3.f41108b;
    }

    public final void I1(float f10) {
        n30 n30Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        ArrayList arrayList;
        v4.f1 K;
        f10 = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) ? 0.0f : 0.0f;
        float min = (float) (Math.min(8500.0d, 4000.0f * f10) / 8500.0d);
        this.K2 = min;
        this.L2 = (min - this.J2) / 265.0f;
        org.telegram.messenger.t3 t3Var = this.V2;
        if (t3Var != null && (n30Var = this.L1) != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) t3Var.d.f(org.telegram.messenger.fj.B1(this.f47556v2))) != null) {
            b20 b20Var = this.Z3;
            if (!b20Var.f41108b) {
                if (this.f47518n2) {
                    arrayList = this.f47571y2;
                } else {
                    arrayList = this.V2.f26967g;
                }
                int indexOf = arrayList.indexOf(groupCallParticipant);
                if (indexOf >= 0 && (K = n30Var.K(indexOf + this.K1.d)) != null) {
                    View view = K.f59161a;
                    if (view instanceof org.telegram.ui.Cells.g4) {
                        ((org.telegram.ui.Cells.g4) view).setAmplitude(f10 * 15.0f);
                        if (view == this.W4 && !this.f47507k4) {
                            this.f30173b.invalidate();
                        }
                    }
                }
            } else {
                int i7 = 0;
                while (true) {
                    x10 x10Var = this.f47511l4;
                    if (i7 >= x10Var.getChildCount()) {
                        break;
                    }
                    org.telegram.ui.Components.u10 u10Var = (org.telegram.ui.Components.u10) x10Var.getChildAt(i7);
                    if (org.telegram.messenger.fj.B1(u10Var.getParticipant().peer) == org.telegram.messenger.fj.B1(groupCallParticipant.peer)) {
                        u10Var.setAmplitude(f10 * 15.0f);
                    }
                    i7++;
                }
            }
            b20Var.k(groupCallParticipant, f10 * 15.0f);
        }
    }

    public final void J1(int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24) {
        this.f47489f5 = i7;
        this.f47493g5 = i10;
        this.f47497h5 = i11;
        this.f47501i5 = i12;
        this.f47504j5 = i13;
        this.f47508k5 = i14;
        this.f47512l5 = i15;
        this.f47517m5 = i16;
        this.f47521n5 = i17;
        this.f47525o5 = i18;
        this.f47530p5 = i19;
        this.f47535q5 = i20;
        this.f47540r5 = i21;
        this.s5 = i22;
        this.f47549t5 = i23;
        this.f47554u5 = i24;
    }

    public final void K1(float f10) {
        n30 n30Var;
        int L;
        int i7;
        float f11;
        this.f47546t2 = f10;
        this.L1.setTopGlowOffset((int) (f10 - ((FrameLayout.LayoutParams) n30Var.getLayoutParams()).topMargin));
        float L2 = f10 - org.telegram.messenger.g0.L(74.0f);
        int i10 = ((this.f30207t0 + L2) > (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) ? 1 : ((this.f30207t0 + L2) == (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) ? 0 : -1));
        u30 u30Var = this.P2;
        b20 b20Var = this.Z3;
        v10 v10Var = this.f47468a3;
        t10 t10Var = this.Z2;
        if (i10 < 0) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) - L2) - this.f30207t0) / (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((L - this.f30207t0) - org.telegram.messenger.g0.L(14.0f))));
            if (org.telegram.messenger.g0.Q1()) {
                f11 = 17.0f;
            } else {
                f11 = 13.0f;
            }
            i7 = (int) (org.telegram.messenger.g0.L(f11) * min);
            if (u30Var != null) {
                u30Var.setShadowOffset((int) (org.telegram.messenger.g0.L(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.T3) > 1.0E-4f) {
                H1(Math.min(1.0f, min));
            }
            float z10 = org.telegram.ui.Cells.c0.z(min, 0.1f, 1.2f, 1.0f);
            t10Var.setScaleX(Math.max(0.9f, z10));
            t10Var.setScaleY(Math.max(0.9f, z10));
            float f12 = 1.0f - (min * 1.2f);
            t10Var.setAlpha((1.0f - b20Var.f41110c) * Math.max(0.0f, f12));
            v10Var.setScaleX(Math.max(0.9f, z10));
            v10Var.setScaleY(Math.max(0.9f, z10));
            v10Var.setAlpha((1.0f - b20Var.f41110c) * Math.max(0.0f, f12));
        } else {
            t10Var.setScaleX(1.0f);
            t10Var.setScaleY(1.0f);
            t10Var.setAlpha(1.0f - b20Var.f41110c);
            v10Var.setScaleX(1.0f);
            v10Var.setScaleY(1.0f);
            v10Var.setAlpha(1.0f - b20Var.f41110c);
            if (this.T3 > 1.0E-4f) {
                H1(0.0f);
            }
            i7 = 0;
        }
        b1();
        float f13 = i7;
        this.f47572y3.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(53.0f)) - f13));
        this.f47483e3.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(44.0f)) - f13));
        if (u30Var != null) {
            u30Var.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), f10 - org.telegram.messenger.g0.L(37.0f)));
        }
        t20 t20Var = this.M1;
        if (t20Var != null) {
            t20Var.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(44.0f)) - f13));
        }
        this.f30173b.invalidate();
        Z1();
    }

    @Override
    public final void L() {
        ArrayList arrayList = this.X3;
        ArrayList arrayList2 = this.Y3;
        b20 b20Var = this.Z3;
        if (b20Var != null) {
            if (this.f47529p4 != null) {
                this.L1.getViewTreeObserver().removeOnPreDrawListener(this.f47529p4);
                this.f47529p4 = null;
            }
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                ((org.telegram.ui.Components.voip.y) arrayList2.get(i7)).f();
                b20Var.removeView((View) arrayList2.get(i7));
                ((org.telegram.ui.Components.voip.y) arrayList2.get(i7)).e();
                ((org.telegram.ui.Components.voip.y) arrayList2.get(i7)).b(true);
            }
            arrayList.clear();
            if (b20Var.getParent() != null) {
                arrayList.clear();
                this.f30173b.removeView(b20Var);
            }
        }
        ai.r2 r2Var = this.f47528p3;
        if (r2Var.d) {
            r2Var.d = false;
            Thread thread = r2Var.f1448e;
            if (thread != null) {
                thread.interrupt();
                r2Var.f1448e = null;
            }
            try {
                NativeInstance.setIncomingAudioCapture(false);
            } catch (Throwable unused) {
            }
        }
        super.L();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
            VoIPService.getSharedInstance().setSinks(null, null);
        }
        if (C5 == this) {
            C5 = null;
        }
        D5 = false;
        VoIPService.audioLevelsCallback = null;
        org.telegram.ui.Components.c20.k(getContext());
        org.telegram.messenger.t3 t3Var = this.V2;
        if (t3Var != null) {
            ArrayList arrayList3 = t3Var.f26965e;
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                ((TLRPC.GroupCallParticipant) arrayList3.get(i10)).hasCameraFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i10)).hasPresentationFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i10)).videoIndex = 0;
            }
            t3Var.z();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
    }

    public final boolean M1(android.view.View r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f40.M1(android.view.View):boolean");
    }

    public final void N1(View view) {
        if (this.f47494h2 == null) {
            org.telegram.ui.Components.m30 m30Var = new org.telegram.ui.Components.m30(8, getContext(), null, true);
            this.f47494h2 = m30Var;
            m30Var.setAlpha(0.0f);
            this.f47494h2.setVisibility(4);
            this.f47494h2.setShowingDuration(3000L);
            this.f30173b.addView(this.f47494h2, c8.ma.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            if (org.telegram.messenger.v3.W(this.U2)) {
                this.f47494h2.setText(org.telegram.messenger.gd.N0(2131743222, null));
            } else {
                this.f47494h2.setText(org.telegram.messenger.gd.N0(2131743104, null));
            }
            this.f47494h2.b();
        }
        this.f47494h2.setExtraTranslationY(-org.telegram.messenger.g0.f24140m);
        this.f47494h2.c(view);
    }

    public final void O1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        org.telegram.messenger.t3 t3Var = this.V2;
        org.telegram.ui.Components.voip.q2 q2Var = this.f47555v1;
        org.telegram.ui.Components.voip.q2 q2Var2 = this.f47536r1;
        org.telegram.ui.Components.voip.q2 q2Var3 = this.f47545t1;
        org.telegram.ui.Components.voip.q2 q2Var4 = this.f47531q1;
        org.telegram.ui.Components.voip.q2 q2Var5 = this.f47541s1;
        org.telegram.ui.Components.voip.q2 q2Var6 = this.f47550u1;
        org.telegram.ui.Components.voip.q2 q2Var7 = this.f47560w1;
        boolean z19 = true;
        o10 o10Var = this.f47526p1;
        boolean z20 = false;
        if (t3Var != null && !t3Var.j()) {
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.V2.d.f(org.telegram.messenger.fj.B1(this.f47556v2));
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !T0()) {
                z14 = true;
            } else {
                z14 = false;
            }
            Boolean bool = this.f47564w5;
            if (bool != null) {
                z15 = bool.booleanValue();
            } else {
                TLRPC.GroupCall groupCall = this.V2.f26963b;
                if (groupCall != null && groupCall.messages_enabled) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            if (((!z14 && this.V2.c()) || z13) && !v1()) {
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
            if (E5) {
                z17 = false;
                z18 = false;
            }
            o10Var.c(q2Var7, true, z10);
            o10Var.c(q2Var6, true, z10);
            o10Var.c(q2Var5, z16, z10);
            o10Var.c(q2Var4, z18, z10);
            o10Var.c(q2Var3, z20, z10);
            o10Var.c(q2Var2, z17, z10);
            o10Var.c(q2Var, z15, z10);
            return;
        }
        if (this.Q2 > 0.1f) {
            z11 = true;
        } else {
            z11 = false;
        }
        o10Var.c(q2Var7, z11, z10);
        if (this.Q2 > 0.1f) {
            z12 = true;
        } else {
            z12 = false;
        }
        o10Var.c(q2Var6, z12, z10);
        if (this.Q2 <= 0.1f) {
            z19 = false;
        }
        o10Var.c(q2Var3, z19, z10);
        o10Var.c(q2Var5, false, z10);
        o10Var.c(q2Var4, false, z10);
        o10Var.c(q2Var2, false, z10);
        o10Var.c(q2Var, false, z10);
    }

    public final void P1() {
        int i7;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        TLObject O0;
        org.telegram.messenger.t3 t3Var;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        int i13;
        int i14;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        org.telegram.messenger.t3 t3Var2 = this.V2;
        org.telegram.ui.ActionBar.q0 q0Var = this.f47487f3;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.f47495h3;
        if (t3Var2 == null || t3Var2.j()) {
            this.f47491g3.setVisibility(4);
            q0Var2.setVisibility(8);
            if (this.V2 == null) {
                q0Var.setVisibility(8);
                return;
            }
        }
        if (this.f47490g2) {
            return;
        }
        org.telegram.messenger.c cVar = this.f47522o1;
        int i15 = cVar.f23246a;
        int i16 = cVar.f23246a;
        TLRPC.Chat O02 = org.telegram.messenger.mp.u1(i15).O0(Long.valueOf(m1()));
        if (O02 != null) {
            this.U2 = O02;
        }
        boolean y10 = org.telegram.messenger.v3.y(3, this.U2);
        org.telegram.ui.ActionBar.y0 y0Var = this.f47499i3;
        if (!y10 && (((org.telegram.messenger.v3.T(this.U2) && ((chat2 = this.U2) == null || !chat2.megagroup)) || (!org.telegram.messenger.v3.t0(this.U2) && !org.telegram.messenger.v3.y(3, this.U2))) && (!org.telegram.messenger.v3.T(this.U2) || (chat = this.U2) == null || chat.megagroup || !org.telegram.messenger.v3.t0(chat)))) {
            y0Var.setVisibility(8);
        } else {
            y0Var.setVisibility(0);
        }
        org.telegram.messenger.t3 t3Var3 = this.V2;
        org.telegram.ui.ActionBar.y0 y0Var2 = this.f47567x3;
        org.telegram.ui.ActionBar.y0 y0Var3 = this.f47562w3;
        if (t3Var3 != null && (groupCall2 = t3Var3.f26963b) != null && groupCall2.can_change_messages_enabled) {
            if (groupCall2.messages_enabled) {
                i13 = 8;
            } else {
                i13 = 0;
            }
            y0Var3.setVisibility(i13);
            if (this.V2.f26963b.messages_enabled) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            y0Var2.setVisibility(i14);
        } else {
            y0Var3.setVisibility(8);
            y0Var2.setVisibility(8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.V2.d.f(org.telegram.messenger.fj.B1(this.f47556v2));
        org.telegram.messenger.t3 t3Var4 = this.V2;
        org.telegram.ui.ActionBar.y0 y0Var4 = this.f47510l3;
        if (t3Var4 != null && !t3Var4.j() && (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            y0Var4.setVisibility(0);
        } else {
            y0Var4.setVisibility(8);
        }
        if (org.telegram.messenger.bz.I0) {
            i7 = 2131232263;
        } else {
            i7 = 2131232262;
        }
        y0Var4.setIcon(i7);
        if (org.telegram.messenger.bz.I0) {
            i10 = 2131743037;
        } else {
            i10 = 2131743038;
        }
        y0Var4.setSubtext(org.telegram.messenger.gd.N0(i10, null));
        org.telegram.messenger.t3 t3Var5 = this.V2;
        if (t3Var5 != null && !t3Var5.j() && !v1() && DictationAsr.D()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f47515m3.setVisibility(i11);
        R1(false);
        Q1();
        boolean T0 = T0();
        org.telegram.ui.ActionBar.y0 y0Var5 = this.f47557v3;
        org.telegram.ui.ActionBar.y0 y0Var6 = this.j3;
        org.telegram.ui.ActionBar.y0 y0Var7 = this.f47538r3;
        org.telegram.ui.ActionBar.y0 y0Var8 = this.f47543s3;
        if (T0) {
            y0Var5.setVisibility(0);
            y0Var6.setVisibility(0);
            if (v1()) {
                y0Var7.setVisibility(0);
                y0Var8.setVisibility(8);
            } else if (this.V2.j()) {
                y0Var7.setVisibility(8);
                y0Var8.setVisibility(8);
            } else {
                y0Var7.setVisibility(0);
            }
            if (s1()) {
                y0Var7.setVisibility(8);
                y0Var6.setVisibility(8);
            }
            if (this.V2.c() && !this.V2.j() && !v1()) {
                y0Var8.setVisibility(0);
            } else {
                y0Var8.setVisibility(8);
            }
            q0Var2.setVisibility(8);
            boolean z13 = this.V2.f26981w;
            a40 a40Var = this.Y2;
            a40Var.f45494f = z13;
            a40Var.d = 1.0f;
            a40Var.invalidateSelf();
            if (this.V2.f26981w) {
                if (this.C3 == null) {
                    v00 v00Var = new v00(this, 7);
                    this.C3 = v00Var;
                    org.telegram.messenger.g0.h3(v00Var, 1000L);
                }
                y0Var7.setText(org.telegram.messenger.gd.N0(2131743080, null));
            } else {
                v00 v00Var2 = this.C3;
                if (v00Var2 != null) {
                    org.telegram.messenger.g0.r(v00Var2);
                    this.C3 = null;
                }
                y0Var7.setText(org.telegram.messenger.gd.N0(2131743105, null));
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                y0Var8.j(org.telegram.messenger.gd.N0(2131743191, null), 2131232355, null);
            } else {
                y0Var8.j(org.telegram.messenger.gd.N0(2131743193, null), 2131232354, null);
            }
            T1();
        } else {
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !T0()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z10 && ((this.V2.c() || z11) && !this.V2.j() && !v1())) {
                if (z11) {
                    q0Var2.setVisibility(8);
                    y0Var8.setVisibility(0);
                    y0Var8.j(org.telegram.messenger.gd.N0(2131743191, null), 2131232355, null);
                    y0Var8.setContentDescription(org.telegram.messenger.gd.N0(2131743191, null));
                } else {
                    y0Var8.j(org.telegram.messenger.gd.N0(2131743193, null), 2131232354, null);
                    y0Var8.setContentDescription(org.telegram.messenger.gd.N0(2131743193, null));
                    q0Var2.setVisibility(8);
                    y0Var8.setVisibility(0);
                }
            } else {
                q0Var2.setVisibility(8);
                y0Var8.setVisibility(8);
            }
            y0Var5.setVisibility(8);
            y0Var6.setVisibility(8);
            y0Var7.setVisibility(8);
        }
        boolean T02 = T0();
        org.telegram.ui.ActionBar.y0 y0Var9 = this.f47533q3;
        if (T02 && this.V2.f26963b.can_change_join_muted && !s1()) {
            y0Var9.setVisibility(0);
        } else {
            y0Var9.setVisibility(8);
        }
        if (s1() && ((t3Var = this.V2) == null || (groupCall = t3Var.f26963b) == null || !groupCall.creator)) {
            z12 = false;
        } else {
            z12 = true;
        }
        q0Var.R(4, z12);
        if (v1() && !this.V2.j()) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        this.f47506k3.setVisibility(i12);
        int visibility = y0Var6.getVisibility();
        TextView textView = this.f47577z3;
        if (visibility != 0 && y0Var9.getVisibility() != 0 && y0Var.getVisibility() != 0 && y0Var8.getVisibility() != 0 && y0Var7.getVisibility() != 0 && y0Var5.getVisibility() != 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.f47486f2;
        if (((sharedInstance != null && VoIPService.getSharedInstance().hasFewPeers) || this.W2) && !v1() && this.f47556v2 != null) {
            kVar.setVisibility(0);
            long B1 = org.telegram.messenger.fj.B1(this.f47556v2);
            if (org.telegram.messenger.n5.E(B1)) {
                O0 = org.telegram.messenger.mp.u1(i16).c2(Long.valueOf(B1));
            } else {
                O0 = org.telegram.messenger.mp.u1(i16).O0(Long.valueOf(-B1));
            }
            kVar.setObject(O0);
        } else {
            kVar.setVisibility(8);
        }
        TLRPC.Chat chat3 = this.U2;
        if (chat3 != null && !org.telegram.messenger.v3.W(chat3) && v1() && y0Var.getVisibility() == 8) {
            q0Var.setVisibility(8);
        } else {
            q0Var.setVisibility(0);
        }
        LinearLayout linearLayout = this.f47483e3;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f10 = 96;
        if (layoutParams.rightMargin != org.telegram.messenger.g0.L(f10)) {
            layoutParams.rightMargin = org.telegram.messenger.g0.L(f10);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.f47572y3.getLayoutParams()).rightMargin = 0;
        this.J1.setTitleRightMargin(org.telegram.messenger.g0.L(48.0f) * 2);
    }

    public final void Q1() {
        boolean z10;
        long j3;
        String str;
        org.telegram.messenger.t3 t3Var;
        if (this.f47528p3 != null) {
            int i7 = 0;
            if (ai.r2.a() && (t3Var = this.V2) != null && !t3Var.j() && !v1() && C5 == this) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !this.f47528p3.d) {
                final ai.r2 r2Var = this.f47528p3;
                Context context = getContext();
                int i10 = this.f47522o1.f23246a;
                TLRPC.Chat chat = this.U2;
                if (chat != null) {
                    j3 = -chat.f28431id;
                } else {
                    j3 = 0;
                }
                if (!r2Var.d) {
                    r2Var.d = true;
                    final android.support.v4.media.session.a0 T = DictationAsr.T(ai.w0.c(context, j3), false);
                    boolean x10 = DictationAsr.x();
                    r2Var.f1447c = x10;
                    if (x10) {
                        ExecutorService executorService = DictationLid.f43071a;
                        if (DictationAsr.x()) {
                            DictationLid.d(context);
                        }
                    }
                    StringBuilder sb2 = new StringBuilder("live captions: ");
                    sb2.append(T);
                    if (r2Var.f1447c) {
                        str = ", tinylid";
                    } else {
                        str = "";
                    }
                    p5.c.t(sb2, str, "Dictation");
                    r2Var.f1445a.getClass();
                    DictationAsr.f0((ai.t) T.f1717b, new ai.u() {
                        @Override
                        public final void a(boolean z11) {
                            r2 r2Var2 = r2.this;
                            android.support.v4.media.session.a0 a0Var = T;
                            if (!r2Var2.d) {
                                return;
                            }
                            r2Var2.f1445a.getClass();
                            if (!z11) {
                                r2Var2.d = false;
                                return;
                            }
                            NativeInstance.setIncomingAudioCapture(true);
                            Thread thread = new Thread(new a1.e(18, r2Var2, a0Var), "LiveCaptions");
                            r2Var2.f1448e = thread;
                            thread.start();
                        }
                    });
                }
            } else if (!z10 && this.f47528p3.d) {
                ai.r2 r2Var2 = this.f47528p3;
                if (r2Var2.d) {
                    r2Var2.d = false;
                    Thread thread = r2Var2.f1448e;
                    if (thread != null) {
                        thread.interrupt();
                        r2Var2.f1448e = null;
                    }
                    try {
                        NativeInstance.setIncomingAudioCapture(false);
                    } catch (Throwable unused) {
                    }
                }
                org.telegram.ui.Components.voip.s0 s0Var = this.f47524o3;
                s0Var.getClass();
                ArrayList arrayList = new ArrayList(s0Var.f41334a);
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    org.telegram.ui.Components.voip.r0 r0Var = (org.telegram.ui.Components.voip.r0) obj;
                    s0Var.f41334a.remove(r0Var);
                    s0Var.removeView(r0Var);
                }
            }
        }
    }

    public final void R0(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f40.R0(boolean):void");
    }

    public final void R1(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f40.R1(boolean):void");
    }

    public final int S0() {
        n30 n30Var = this.L1;
        int childCount = n30Var.getChildCount();
        int i7 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = n30Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 0) {
                i7 = Math.min(i7, childAt.getTop());
            }
        }
        return i7;
    }

    public final void S1(int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f40.S1(int, boolean):void");
    }

    public final boolean T0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            org.telegram.messenger.t3 t3Var = this.V2;
            if (t3Var != null && (groupCall = t3Var.f26963b) != null && groupCall.creator) {
                return true;
            }
            return false;
        }
        return org.telegram.messenger.v3.w(14, this.U2);
    }

    public final void T1() {
        if (this.V2 == null) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.f47522o1.f23246a).getCurrentTime();
        org.telegram.messenger.t3 t3Var = this.V2;
        int i7 = currentTime - t3Var.f26963b.record_start_date;
        boolean z10 = t3Var.f26981w;
        org.telegram.ui.ActionBar.y0 y0Var = this.f47538r3;
        if (z10) {
            y0Var.setSubtext(org.telegram.messenger.g0.g0(i7, false, false));
        } else {
            y0Var.setSubtext(null);
        }
    }

    public final void U0() {
        if (this.Q3) {
            this.Q3 = false;
            org.telegram.messenger.g0.r(this.f47568x4);
        }
        if (this.R3) {
            this.R3 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.f47560w1.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void U1(boolean z10) {
        float interpolation;
        float f10;
        t20 t20Var = this.M1;
        if ((t20Var == null || this.V2 != null) && this.S2 == null) {
            this.R2 = 1.0f;
            this.Q2 = 1.0f;
            if (t20Var == null) {
                return;
            }
        }
        int i7 = 4;
        if (!z10) {
            s10 s10Var = this.f47558v4;
            org.telegram.messenger.g0.r(s10Var);
            s10Var.run();
            org.telegram.messenger.t3 t3Var = this.V2;
            n30 n30Var = this.L1;
            if (t3Var != null && !t3Var.j()) {
                n30Var.setVisibility(0);
            } else {
                n30Var.setVisibility(4);
            }
            boolean W = org.telegram.messenger.v3.W(this.U2);
            org.telegram.ui.ActionBar.y0 y0Var = this.f47557v3;
            if (W) {
                y0Var.setText(org.telegram.messenger.gd.N0(2131743245, null));
            } else {
                y0Var.setText(org.telegram.messenger.gd.N0(2131743152, null));
            }
        }
        float f11 = this.Q2;
        if (f11 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.nr.f37956f.getInterpolation((f11 - 0.6f) / 0.4f) * 0.05f);
            this.R2 = 1.0f;
            f10 = 1.0f;
        } else {
            org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f37956f;
            this.R2 = nrVar.getInterpolation(f11 / 0.6f);
            interpolation = 1.05f * nrVar.getInterpolation(this.Q2 / 0.6f);
            f10 = this.Q2 / 0.6f;
        }
        O1(true);
        float f12 = 1.0f - f10;
        t20Var.setAlpha(f12);
        this.P1.setAlpha(f10);
        this.R1.setAlpha(f10);
        m30 m30Var = this.Q1;
        m30Var.setAlpha(f10);
        m30Var.setScaleX(interpolation);
        m30Var.setScaleY(interpolation);
        r20 r20Var = this.O1;
        r20Var.setScaleX(f12);
        r20Var.setScaleY(f12);
        r20Var.setAlpha(f12);
        this.N1.setAlpha(f12);
        this.f47487f3.setAlpha(f10);
        if (f12 != 0.0f) {
            i7 = 0;
        }
        if (i7 != t20Var.getVisibility()) {
            t20Var.setVisibility(i7);
            r20Var.setVisibility(i7);
        }
    }

    @Override
    public final ArrayList V() {
        return new ArrayList();
    }

    public final void V0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f40.V0():void");
    }

    public final void V1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i7;
        org.telegram.ui.Components.voip.q2 q2Var = this.f47545t1;
        if (q2Var != null && q2Var.getVisibility() == 0) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            o10 o10Var = this.f47526p1;
            boolean z14 = false;
            if (sharedInstance != null && !v1()) {
                mh.a aVar = (mh.a) o10Var.f21031c.get(q2Var);
                if (aVar != null) {
                    aVar.d.a(true, z10);
                    q2Var.setEnabled(true);
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
                    q2Var.c(2131230916, -1, 0, 0.1f, true, org.telegram.messenger.gd.N0(2131743260, null), false, z10);
                } else if (z13) {
                    q2Var.c(2131230924, -1, 0, 0.3f, true, org.telegram.messenger.gd.N0(2131742996, null), false, z10);
                } else if (sharedInstance.isHeadsetPlugged()) {
                    q2Var.c(2131230919, -1, 0, 0.1f, true, org.telegram.messenger.gd.N0(2131743258, null), false, z10);
                } else {
                    q2Var.c(2131230924, -1, 0, 0.1f, true, org.telegram.messenger.gd.N0(2131742996, null), false, z10);
                }
                q2Var.b(z13, z10);
                l1();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.isBluetoothHeadsetConnected()) {
                    i7 = 2131231089;
                } else {
                    i7 = 2131231171;
                }
                if (this.V1 != i7) {
                    this.V1 = i7;
                    org.telegram.messenger.g0.P3(this.W1, i7);
                }
                org.telegram.ui.Components.voip.q2 q2Var2 = this.f47536r1;
                if (q2Var2.getVisibility() == 0) {
                    q2Var2.c(0, -1, 0, 1.0f, true, j1(l1()), false, z10);
                    if (l1() != 1) {
                        z14 = true;
                    }
                    q2Var2.b(z14, z10);
                    return;
                }
                return;
            }
            q2Var.c(2131232437, -1, 0, 0.3f, true, org.telegram.messenger.gd.N0(2131743194, null), false, z10);
            if (!org.telegram.messenger.v3.t0(this.U2) && (!org.telegram.messenger.v3.N(this.U2) || !org.telegram.messenger.v3.w(3, this.U2))) {
                z11 = false;
            } else {
                z11 = true;
            }
            mh.a aVar2 = (mh.a) o10Var.f21031c.get(q2Var);
            if (aVar2 != null) {
                aVar2.d.a(z11, z10);
                q2Var.setEnabled(z11);
            }
            q2Var.b(true, false);
        }
    }

    public final void W0() {
        this.A1.setTranslationY((-this.B3.d()) + this.f30173b.getPaddingBottom());
        this.B1.invalidate();
        c1();
        b1();
        Z0();
        a1();
        d1();
        this.f47526p1.setAlpha(1.0f - this.f47574y5.f57696e);
        X0();
        Y0();
    }

    public final void W1(boolean r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f40.W1(boolean, boolean):void");
    }

    public final void X0() {
        int i7;
        float f10 = this.B3.f56645b.f57722a;
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        o20 o20Var = this.A1;
        o20Var.setAlpha(f10);
        m20 m20Var = this.B1;
        m20Var.setAlpha(f10);
        if (o20Var.getVisibility() != i7) {
            o20Var.setVisibility(i7);
            m20Var.setVisibility(i7);
            if (i7 == 8) {
                k20 k20Var = this.C1;
                if (k20Var.isFocused()) {
                    k20Var.clearFocus();
                }
            }
        }
    }

    public final void X1() {
        boolean z10;
        String str;
        float f10;
        float f11;
        d40 d40Var;
        TLRPC.User user;
        TLRPC.Chat chat;
        d30 d30Var = this.J1;
        if (d30Var != null && this.V2 != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            int i7 = 0;
            for (int i10 = 0; i10 < this.V2.P.m(); i10++) {
                long j3 = this.V2.P.j(i10);
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.V2.P.f(j3);
                if (!groupCallParticipant.self) {
                    b20 b20Var = this.Z3;
                    b20Var.getClass();
                    if (b20Var.f41137x.get(org.telegram.messenger.fj.B1(groupCallParticipant.peer)) <= 0 && this.A4.get(j3, 0) != 1) {
                        long B1 = org.telegram.messenger.fj.B1(groupCallParticipant.peer);
                        if (spannableStringBuilder == null) {
                            spannableStringBuilder = new SpannableStringBuilder();
                        }
                        if (i7 < 2) {
                            int i11 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
                            if (i11 > 0) {
                                user = org.telegram.messenger.mp.u1(this.f30170a).c2(Long.valueOf(B1));
                            } else {
                                user = null;
                            }
                            if (i11 <= 0) {
                                chat = org.telegram.messenger.mp.u1(this.f30170a).O0(Long.valueOf(B1));
                            } else {
                                chat = null;
                            }
                            if (user != null || chat != null) {
                                if (i7 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (user != null) {
                                    spannableStringBuilder.append(org.telegram.messenger.o10.k(user, true), new org.telegram.ui.Components.l41(org.telegram.messenger.g0.o()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.l41(org.telegram.messenger.g0.o()), 0);
                                }
                            }
                        }
                        i7++;
                        if (i7 == 2) {
                            break;
                        }
                    }
                }
            }
            if (i7 > 0) {
                String K0 = org.telegram.messenger.gd.K0(i7, "MembersAreSpeakingToast");
                int indexOf = K0.indexOf("un1");
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(K0);
                spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
                d30Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.m5 subtitleTextView = d30Var.getSubtitleTextView();
            if (v1()) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            int i12 = this.V2.f26963b.participants_count;
            z30 z30Var = this.K1;
            subtitleTextView.k(org.telegram.messenger.gd.G(i12 + ((z30Var.N.v1() || z30Var.M || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined()), str, new Object[0]));
            if (v1() && (d40Var = this.A3) != null) {
                d40Var.setWatchersCount(this.V2.f26963b.participants_count);
            }
            if (z10 != this.f47548t4) {
                this.f47548t4 = z10;
                d30Var.invalidate();
                float f12 = 0.0f;
                d30Var.getSubtitleTextView().setPivotX(0.0f);
                d30Var.getSubtitleTextView().setPivotY(d30Var.getMeasuredHeight() >> 1);
                ViewPropertyAnimator animate = d30Var.getSubtitleTextView().animate();
                if (this.f47548t4) {
                    f10 = 0.98f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f10);
                if (this.f47548t4) {
                    f11 = 0.9f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f11);
                if (!this.f47548t4) {
                    f12 = 1.0f;
                }
                scaleY.alpha(f12).setDuration(150L);
                org.telegram.messenger.g0.V3(d30Var.getAdditionalSubtitleTextView(), this.f47548t4);
            }
        }
    }

    public final void Y0() {
        int i7;
        org.telegram.ui.Components.xi0 xi0Var = this.F1;
        if (xi0Var != null) {
            float f10 = this.B3.f56645b.f57722a * this.f47579z5.f57696e;
            xi0Var.setAlpha(f10);
            if (f10 > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            if (this.F1.getVisibility() != i7) {
                this.F1.setVisibility(i7);
                if (i7 == 8) {
                    this.F1.n();
                }
            }
            org.telegram.ui.Components.xi0 xi0Var2 = this.F1;
            if (!xi0Var2.O0 && f10 == 1.0f) {
                xi0Var2.O0 = true;
            }
        }
    }

    public final void Y1(boolean z10) {
        org.telegram.messenger.t3 t3Var = this.V2;
        t10 t10Var = this.Z2;
        if (t3Var == null) {
            if (org.telegram.messenger.v3.W(this.U2)) {
                t10Var.b(org.telegram.messenger.gd.N0(2131743219, null), z10);
                return;
            } else {
                t10Var.b(org.telegram.messenger.gd.N0(2131743098, null), z10);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(t3Var.f26963b.title);
        d30 d30Var = this.J1;
        if (!isEmpty) {
            if (!this.V2.f26963b.title.equals(d30Var.getTitle())) {
                if (z10) {
                    this.J1.N(this.V2.f26963b.title, true, 180L, null);
                    d30Var.getTitleTextView().setOnClickListener(new t00(this, 8));
                } else {
                    d30Var.setTitle(this.V2.f26963b.title);
                }
                t10Var.b(this.V2.f26963b.title, z10);
            }
        } else {
            TLRPC.Chat chat = this.U2;
            if (chat != null && !chat.title.equals(d30Var.getTitle())) {
                if (z10) {
                    this.J1.N(this.U2.title, true, 180L, null);
                    d30Var.getTitleTextView().setOnClickListener(new t00(this, 9));
                } else {
                    d30Var.setTitle(this.U2.title);
                }
                if (org.telegram.messenger.v3.W(this.U2)) {
                    if (v1()) {
                        t10Var.b(this.U2.title, z10);
                    } else {
                        t10Var.b(org.telegram.messenger.gd.N0(2131743204, null), z10);
                    }
                } else {
                    t10Var.b(org.telegram.messenger.gd.N0(2131743063, null), z10);
                }
            } else if (this.U2 == null) {
                d30Var.setTitle(org.telegram.messenger.gd.N0(2131751811, null));
                t10Var.b(org.telegram.messenger.gd.N0(2131751811, null), z10);
            }
        }
        org.telegram.ui.ActionBar.m5 titleTextView = d30Var.getTitleTextView();
        if (this.V2.f26981w) {
            if (titleTextView.getRightDrawable() == null) {
                titleTextView.i(new b40(titleTextView));
                TextView textView = t10Var.getTextView();
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new b40(textView), (Drawable) null);
                TextView nextTextView = t10Var.getNextTextView();
                nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new b40(nextTextView), (Drawable) null);
            }
        } else if (titleTextView.getRightDrawable() != null) {
            titleTextView.i(null);
            t10Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            t10Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final void Z0() {
        boolean z10 = F5;
        o10 o10Var = this.f47526p1;
        if (z10) {
            o10Var.setTranslationX(0.0f);
            o10Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = E5;
        te.a aVar = this.f47574y5;
        if (z11) {
            o10Var.setTranslationX(aVar.f57696e * org.telegram.messenger.g0.L(94.0f));
            o10Var.setTranslationY(0.0f);
            return;
        }
        o10Var.setTranslationX(0.0f);
        o10Var.setTranslationY(aVar.f57696e * org.telegram.messenger.g0.L(94.0f));
    }

    public final void Z1() {
        float f10;
        org.telegram.ui.Components.lb lbVar;
        boolean z10;
        if (this.F != null) {
            int L = org.telegram.messenger.g0.L(74.0f);
            float f11 = this.f47546t2 - L;
            if (this.f30207t0 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                int L2 = (L - this.f30207t0) - org.telegram.messenger.g0.L(14.0f);
                f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - this.f30207t0) / L2);
                f11 -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L2) * f10);
            } else {
                f10 = 0.0f;
            }
            float paddingTop = f11 + this.f30173b.getPaddingTop();
            FrameLayout frameLayout = this.F;
            d30 d30Var = this.J1;
            frameLayout.setTranslationY(org.telegram.messenger.g0.T1(((-frameLayout.getTop()) - this.F.getHeight()) + paddingTop + org.telegram.messenger.g0.L(10.0f), d30Var.getY() + (-this.F.getTop()) + d30Var.getHeight(), f10));
            org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f35500w;
            if (gcVar != null && (lbVar = gcVar.f35504e) != null && lbVar.getParent() != null && lbVar.getParent().getParent() == this.F) {
                if (f10 > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                lbVar.setTop(z10);
            }
        }
    }

    public final void a1() {
        boolean z10 = F5;
        x10 x10Var = this.f47511l4;
        if (z10) {
            x10Var.setTranslationX(0.0f);
            x10Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = E5;
        te.a aVar = this.f47574y5;
        if (z11) {
            x10Var.setTranslationX(aVar.f57696e * org.telegram.messenger.g0.L(94.0f));
            x10Var.setTranslationY(0.0f);
            return;
        }
        x10Var.setTranslationX(0.0f);
        x10Var.setTranslationY(aVar.f57696e * org.telegram.messenger.g0.L(94.0f));
    }

    public final void b1() {
        float L;
        int i7;
        float f10 = this.A5.f57702f;
        rh.h hVar = this.B3;
        float f11 = -((hVar.d() - this.f30173b.getPaddingBottom()) + f10 + (org.telegram.messenger.g0.L(68.0f) * this.f47579z5.f57696e) + org.telegram.messenger.g0.L(10.0f));
        if (F5) {
            L = (1.0f - this.B5.f57696e) * org.telegram.messenger.g0.L(-91.0f);
        } else if (E5) {
            L = 0.0f;
        } else {
            L = ((this.f47574y5.f57696e * org.telegram.messenger.g0.L(94.0f)) - (org.telegram.messenger.g0.L(104.0f) * this.Z3.f41110c)) - org.telegram.messenger.g0.L(91.0f);
        }
        float T1 = org.telegram.messenger.g0.T1(L, f11, hVar.f56645b.f57722a);
        float measuredHeight = ((this.f30173b.getMeasuredHeight() - this.f47546t2) + T1) - this.f30207t0;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - org.telegram.messenger.g0.L(250.0f));
        org.telegram.ui.Components.voip.s0 s0Var = this.f47524o3;
        if (s0Var != null) {
            i7 = s0Var.getContentHeight();
        } else {
            i7 = 0;
        }
        if (s0Var != null) {
            s0Var.setTranslationY(T1);
        }
        float f12 = i7;
        nh.h hVar2 = this.X1;
        hVar2.setTranslationY(T1 - f12);
        hVar2.setVisibleHeight((int) Math.max(0.0f, max - f12));
    }

    public final void c1() {
        if (this.F1 != null) {
            this.F1.setTranslationY((-this.B3.d()) + this.f30173b.getPaddingBottom() + ((-this.f47579z5.f57696e) * org.telegram.messenger.g0.L(64.0f)));
        }
    }

    public final void d1() {
        boolean z10;
        float f10 = this.f47579z5.f57696e;
        float T1 = org.telegram.messenger.g0.T1(0.25f, 1.0f, f10);
        ImageView imageView = this.E1;
        imageView.setScaleX(T1);
        imageView.setScaleY(org.telegram.messenger.g0.T1(0.25f, 1.0f, f10));
        imageView.setAlpha(f10);
        boolean z11 = false;
        if (f10 > 0.9f) {
            z10 = true;
        } else {
            z10 = false;
        }
        imageView.setClickable(z10);
        float f11 = 1.0f - f10;
        float T12 = org.telegram.messenger.g0.T1(0.25f, 1.0f, f11);
        ImageView imageView2 = this.D1;
        imageView2.setScaleX(T12);
        imageView2.setScaleY(org.telegram.messenger.g0.T1(0.25f, 1.0f, f11));
        imageView2.setAlpha(f11);
        if (f11 > 0.9f) {
            z11 = true;
        }
        imageView2.setClickable(z11);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCallParticipant groupCallParticipant;
        int i11;
        int i12;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        int i13;
        int i14;
        String N0;
        boolean z10;
        org.telegram.messenger.u3 u3Var;
        boolean z11;
        VoIPService sharedInstance;
        int i15;
        int i16;
        int i17 = org.telegram.messenger.ks.f25241w2;
        n30 n30Var = this.L1;
        String[] strArr = null;
        int i18 = 0;
        if (i7 == i17) {
            Long l10 = (Long) objArr[1];
            org.telegram.messenger.t3 t3Var = this.V2;
            if (t3Var != null && t3Var.f26963b.f28441id == l10.longValue()) {
                org.telegram.messenger.t3 t3Var2 = this.V2;
                if (t3Var2.f26963b instanceof TLRPC.TL_groupCallDiscarded) {
                    dismiss();
                    return;
                }
                int i19 = (this.f47523o2 > 0L ? 1 : (this.f47523o2 == 0L ? 0 : -1));
                org.telegram.messenger.c cVar = this.f47522o1;
                if (i19 == 0 && (((i16 = this.E3) == 7 || i16 == 5 || i16 == 6) && !t3Var2.j())) {
                    try {
                        Intent intent = new Intent(this.d2, VoIPService.class);
                        intent.putExtra("chat_id", m1());
                        intent.putExtra("createGroupCall", false);
                        intent.putExtra("hasFewPeers", this.W2);
                        intent.putExtra("peerChannelId", this.T2.channel_id);
                        intent.putExtra("peerChatId", this.T2.chat_id);
                        intent.putExtra("peerUserId", this.T2.user_id);
                        intent.putExtra("hash", this.X2);
                        intent.putExtra("peerAccessHash", this.T2.access_hash);
                        intent.putExtra("is_outgoing", true);
                        intent.putExtra("start_incall_activity", false);
                        intent.putExtra("account", cVar.f23246a);
                        intent.putExtra("scheduleDate", this.f47503j4);
                        this.d2.startService(intent);
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    this.f47523o2 = SystemClock.elapsedRealtime();
                    org.telegram.messenger.g0.h3(new v00(this, 3), 3000L);
                }
                if (!this.f47527p2 && VoIPService.getSharedInstance() != null) {
                    this.V2.b(false);
                    p1();
                    VoIPService.getSharedInstance().playConnectedSound();
                }
                P1();
                int childCount = n30Var.getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt = n30Var.getChildAt(i20);
                    if (childAt instanceof org.telegram.ui.Cells.g4) {
                        ((org.telegram.ui.Cells.g4) childAt).a(true, false);
                    }
                }
                if (this.W4 != null) {
                    this.f47518n2 = true;
                } else {
                    R0(true);
                }
                X1();
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                if (this.E3 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                W1(true, booleanValue);
                Y1(true);
                if (z11 && ((i15 = this.E3) == 1 || i15 == 0)) {
                    o1().j(38, 0L, null);
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().playAllowTalkSound();
                    }
                }
                if (objArr.length >= 4) {
                    Long l11 = (Long) objArr[3];
                    long longValue = l11.longValue();
                    if (longValue != 0 && !v1()) {
                        if (!s1() || (sharedInstance = VoIPService.getSharedInstance()) == null || longValue != sharedInstance.convertingFromCallWithUserId) {
                            try {
                                ArrayList arrayList = org.telegram.messenger.mp.u1(cVar.f23246a).f25837y;
                                if (arrayList != null) {
                                    int size = arrayList.size();
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 >= size) {
                                            break;
                                        }
                                        Object obj = arrayList.get(i21);
                                        i21++;
                                        if (((TLRPC.Dialog) obj).f28435id == longValue) {
                                            i18 = 1;
                                            break;
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            if (org.telegram.messenger.n5.E(longValue)) {
                                TLRPC.User c22 = org.telegram.messenger.mp.u1(cVar.f23246a).c2(l11);
                                if (c22 != null) {
                                    if (this.V2.f26963b.participants_count < 250 || org.telegram.messenger.o10.x(c22) || c22.verified || i18 != 0) {
                                        o1().k(0L, 44, c22, this.U2, null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(cVar.f23246a).O0(Long.valueOf(-longValue));
                            if (O0 != null) {
                                if (this.V2.f26963b.participants_count < 250 || !org.telegram.messenger.v3.r0(O0) || O0.verified || i18 != 0) {
                                    o1().k(0L, 44, O0, this.U2, null, null);
                                }
                            }
                        }
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25255y2) {
            b20 b20Var = this.Z3;
            if (b20Var.f41108b && this.V2 != null) {
                boolean c10 = b20Var.c();
                org.telegram.messenger.t3 t3Var3 = this.V2;
                if (t3Var3 != null && b20Var.f41108b && (u3Var = b20Var.f41113e) != null && t3Var3.d.f(org.telegram.messenger.fj.B1(u3Var.f27145a.peer)) == null) {
                    c10 = true;
                }
                if (c10) {
                    org.telegram.messenger.u3 u3Var2 = null;
                    int i22 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f47509l2;
                        if (i22 >= arrayList2.size()) {
                            break;
                        }
                        org.telegram.messenger.u3 u3Var3 = (org.telegram.messenger.u3) arrayList2.get(i22);
                        if (this.V2.P.g(null, org.telegram.messenger.fj.B1(u3Var3.f27145a.peer)) != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = u3Var3.f27145a;
                            if (!groupCallParticipant3.muted_by_you && b20Var.d != org.telegram.messenger.fj.B1(groupCallParticipant3.peer)) {
                                u3Var2 = u3Var3;
                            }
                        }
                        i22++;
                    }
                    if (u3Var2 != null) {
                        i1(u3Var2);
                    }
                }
            }
            b20Var.setVisibleParticipant(true);
            X1();
        } else if (i7 == org.telegram.messenger.ks.Q4) {
            I1(((Float) objArr[0]).floatValue());
        } else if (i7 == org.telegram.messenger.ks.M0) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                    if (org.telegram.messenger.v3.W(this.U2)) {
                        N0 = org.telegram.messenger.gd.N0(2131743209, null);
                    } else {
                        N0 = org.telegram.messenger.gd.N0(2131743076, null);
                    }
                } else if (!"ANONYMOUS_CALLS_DISABLED".equals(str) && !"GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    N0 = org.telegram.messenger.gd.N0(2131751093, null) + "\n" + str;
                } else if (org.telegram.messenger.v3.W(this.U2)) {
                    N0 = org.telegram.messenger.gd.N0(2131743235, null);
                } else {
                    N0 = org.telegram.messenger.gd.N0(2131743127, null);
                }
                AlertDialog$Builder K = org.telegram.ui.Components.c5.K(getContext(), org.telegram.messenger.gd.N0(2131743063, null), N0);
                K.j(new b10(this, 1));
                try {
                    K.p();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        } else if (i7 == org.telegram.messenger.ks.D2) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
            }
        } else if (i7 == org.telegram.messenger.ks.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f28432id == m1()) {
                P1();
                W1(isShowing(), false);
            }
            long B1 = org.telegram.messenger.fj.B1(this.f47556v2);
            org.telegram.messenger.t3 t3Var4 = this.V2;
            if (t3Var4 != null && chatFull.f28432id == (-B1) && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) t3Var4.d.f(B1)) != null) {
                groupCallParticipant2.about = chatFull.about;
                R0(true);
                org.telegram.messenger.g0.Z3(n30Var);
                if (this.D4 != null) {
                    while (i18 < this.D4.getChildCount()) {
                        View childAt2 = this.D4.getChildAt(i18);
                        if ((childAt2 instanceof org.telegram.ui.ActionBar.y0) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                            org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) childAt2;
                            if (TextUtils.isEmpty(groupCallParticipant2.about)) {
                                i13 = 2131743263;
                            } else {
                                i13 = 2131743173;
                            }
                            String N02 = org.telegram.messenger.gd.N0(i13, null);
                            if (TextUtils.isEmpty(groupCallParticipant2.about)) {
                                i14 = 2131232045;
                            } else {
                                i14 = 2131232187;
                            }
                            y0Var.j(N02, i14, null);
                        }
                        i18++;
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25227u1) {
            if (((Long) objArr[0]).longValue() == m1()) {
                P1();
                W1(isShowing(), false);
            }
        } else if (i7 == org.telegram.messenger.ks.B2) {
            int childCount2 = n30Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i18 < childCount2) {
                v4.f1 G = n30Var.G(n30Var.getChildAt(i18));
                if (G != null) {
                    View view = G.f59161a;
                    if (view instanceof org.telegram.ui.Cells.g4) {
                        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                        if (g4Var.getParticipant() != null) {
                            g4Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i18++;
            }
        } else if (i7 == org.telegram.messenger.ks.E0) {
            Long l12 = (Long) objArr[0];
            long B12 = org.telegram.messenger.fj.B1(this.f47556v2);
            if (this.V2 != null && B12 == l12.longValue() && (groupCallParticipant = (TLRPC.GroupCallParticipant) this.V2.d.f(B12)) != null) {
                groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
                R0(true);
                org.telegram.messenger.g0.Z3(n30Var);
                if (this.D4 != null) {
                    while (i18 < this.D4.getChildCount()) {
                        View childAt3 = this.D4.getChildAt(i18);
                        if ((childAt3 instanceof org.telegram.ui.ActionBar.y0) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                            org.telegram.ui.ActionBar.y0 y0Var2 = (org.telegram.ui.ActionBar.y0) childAt3;
                            if (TextUtils.isEmpty(groupCallParticipant.about)) {
                                i11 = 2131743264;
                            } else {
                                i11 = 2131743174;
                            }
                            String N03 = org.telegram.messenger.gd.N0(i11, null);
                            if (TextUtils.isEmpty(groupCallParticipant.about)) {
                                i12 = 2131232045;
                            } else {
                                i12 = 2131232187;
                            }
                            y0Var2.j(N03, i12, null);
                        }
                        i18++;
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25162j0) {
            R0(true);
            org.telegram.messenger.g0.Z3(n30Var);
        } else if (i7 == org.telegram.messenger.ks.f25205r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i23 = org.telegram.messenger.mp.I8;
            int i24 = intValue & 16;
            if (i24 != 0) {
                R0(true);
            }
            if (i24 != 0 || (intValue & 524288) != 0) {
                org.telegram.messenger.g0.Z3(n30Var);
            }
        } else if (i7 == org.telegram.messenger.ks.f25262z2) {
            w20 w20Var = this.f47551u2;
            if (w20Var != null) {
                w20Var.b(true, true);
            }
            P1();
        } else if (i7 == org.telegram.messenger.ks.U3) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            g.b bVar = this.f47505k2;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            bVar.b(strArr);
        }
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity = this.d2;
        launchActivity.f43109a1.remove(this.f47553u4);
        this.d2.setRequestedOrientation(-1);
        D5 = false;
        org.telegram.ui.Components.v20 v20Var = this.D3;
        if (v20Var != null) {
            v20Var.dismiss();
        }
        this.f47518n2 = true;
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.F2, new Object[0]);
        org.telegram.messenger.c cVar = this.f47522o1;
        int i7 = cVar.f23246a;
        int i10 = cVar.f23246a;
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.M0);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.f25241w2);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.T);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.f25227u1);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.B2);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.E0);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.f25162j0);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.f25205r);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.f25262z2);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.f25255y2);
        org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.U3);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.Q4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.D2);
        super.dismiss();
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i7;
        if (this.d2 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.d2.getSystemService("audio");
            boolean z10 = false;
            if (audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25) {
                z10 = true;
            }
            WebRtcAudioTrack.setSpeakerMute(z10);
            if (isSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                UndoView o12 = o1();
                if (z10) {
                    i7 = 42;
                } else {
                    i7 = 43;
                }
                o12.j(i7, 0L, null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e1() {
        org.telegram.ui.Components.voip.y yVar = this.Y4;
        if (yVar != null) {
            yVar.f41460a.setRoundCorners(org.telegram.messenger.g0.L(8.0f));
            org.telegram.ui.Components.voip.y yVar2 = this.Y4;
            yVar2.h = false;
            yVar2.j(false);
            this.Y4.invalidate();
            this.Z3.invalidate();
        }
        org.telegram.ui.Cells.g4 g4Var = this.W4;
        if (g4Var != null && !this.f47470a5 && g4Var.getParent() != null) {
            this.f30173b.removeView(this.W4);
        }
        org.telegram.ui.Cells.g4 g4Var2 = this.W4;
        if (g4Var2 != null) {
            g4Var2.setProgressToAvatarPreview(0.0f);
            this.W4.setAboutVisible(false);
            this.W4.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.u10 u10Var = this.Z4;
        if (u10Var != null) {
            u10Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.W4 = null;
        this.X4 = null;
        this.Z4 = null;
        this.Y4 = null;
    }

    public final void g1(boolean z10) {
        if (!this.f47474b5 && this.f47484e4) {
            if (z10) {
                this.f47474b5 = true;
                E1(false, this.W4);
                return;
            }
            e1();
            this.f30173b.removeView(this.f47480d4);
            this.f47480d4 = null;
            this.B4.setVisibility(8);
            this.f30173b.invalidate();
            this.f47484e4 = false;
            this.T1.X = true;
            this.L1.invalidate();
            this.f47469a4.setVisibility(8);
            if (this.f47518n2) {
                this.f47518n2 = false;
                R0(true);
            }
            V0();
        }
    }

    public final org.telegram.ui.Components.voip.r h1() {
        int i7 = 0;
        while (true) {
            n30 n30Var = this.L1;
            if (i7 < n30Var.getChildCount()) {
                View childAt = n30Var.getChildAt(i7);
                if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.r) && RecyclerView.R(childAt) >= 0) {
                    return (org.telegram.ui.Components.voip.r) childAt;
                }
                i7++;
            } else {
                return null;
            }
        }
    }

    public final void i1(org.telegram.messenger.u3 u3Var) {
        org.telegram.messenger.u3 u3Var2;
        if (u3Var == null) {
            this.d2.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            b20 b20Var = this.Z3;
            if (b20Var.f41128r != null) {
                return;
            }
            boolean z10 = F5;
            n30 n30Var = this.L1;
            int i7 = 0;
            if (z10) {
                if (this.f47529p4 != null) {
                    n30Var.getViewTreeObserver().removeOnPreDrawListener(this.f47529p4);
                    this.f47529p4 = null;
                }
                ArrayList arrayList = new ArrayList();
                i40 i40Var = this.f47520n4;
                ArrayList arrayList2 = this.X3;
                ArrayList arrayList3 = this.Y3;
                if (u3Var == null) {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                        org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) arrayList3.get(i10);
                        org.telegram.ui.Components.voip.r rVar = yVar.f41464c;
                        if (rVar != null) {
                            rVar.setRenderer(null);
                            org.telegram.ui.Components.u10 u10Var = yVar.d;
                            if (u10Var != null) {
                                u10Var.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.r rVar2 = yVar.f41467e;
                            if (rVar2 != null) {
                                rVar2.setRenderer(null);
                            }
                            arrayList.add(yVar.f41491x);
                            yVar.b(false);
                            yVar.animate().alpha(0.0f).setListener(new x20(this, yVar, 0));
                        }
                    }
                    this.O4 = false;
                    i40Var.H(this.f47516m4, true, true);
                } else {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        org.telegram.ui.Components.voip.y yVar2 = (org.telegram.ui.Components.voip.y) arrayList3.get(i11);
                        if (yVar2.f41467e != null && ((u3Var2 = yVar2.f41491x) == null || !u3Var2.equals(u3Var))) {
                            arrayList.add(yVar2.f41491x);
                            yVar2.b(false);
                            org.telegram.ui.Components.u10 u10Var2 = yVar2.d;
                            if (u10Var2 != null) {
                                u10Var2.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.r rVar3 = yVar2.f41464c;
                            if (rVar3 != null) {
                                rVar3.setRenderer(null);
                            }
                            yVar2.animate().alpha(0.0f).setListener(new x20(this, yVar2, 1));
                        }
                    }
                    this.O4 = true;
                    i40Var.f48572r = false;
                    if (!arrayList.isEmpty()) {
                        org.telegram.messenger.g0.g3(new ss(21, this, arrayList));
                    }
                }
                ViewTreeObserver viewTreeObserver = n30Var.getViewTreeObserver();
                lh lhVar = new lh(this, u3Var, !b20Var.f41108b);
                this.f47529p4 = lhVar;
                viewTreeObserver.addOnPreDrawListener(lhVar);
                return;
            }
            if (this.f47529p4 != null) {
                n30Var.getViewTreeObserver().removeOnPreDrawListener(this.f47529p4);
                this.f47529p4 = null;
            }
            if (u3Var != null) {
                x10 x10Var = this.f47511l4;
                if (x10Var.getVisibility() != 0) {
                    x10Var.setVisibility(0);
                    org.telegram.ui.Components.v10 v10Var = this.o4;
                    v10Var.G(x10Var, false);
                    this.f47518n2 = true;
                    if (!b20Var.f41108b) {
                        ArrayList arrayList4 = v10Var.f40636e;
                        v4.c0 c0Var = (v4.c0) x10Var.getLayoutManager();
                        if (c0Var != null) {
                            while (true) {
                                if (i7 >= arrayList4.size()) {
                                    break;
                                } else if (((org.telegram.messenger.u3) arrayList4.get(i7)).equals(u3Var)) {
                                    c0Var.h1(i7, org.telegram.messenger.g0.L(13.0f));
                                    break;
                                } else {
                                    i7++;
                                }
                            }
                        }
                    }
                    ViewTreeObserver viewTreeObserver2 = n30Var.getViewTreeObserver();
                    pw pwVar = new pw(1, this, u3Var);
                    this.f47529p4 = pwVar;
                    viewTreeObserver2.addOnPreDrawListener(pwVar);
                    return;
                }
                b20Var.j(u3Var);
                org.telegram.messenger.g0.Z3(x10Var);
            } else if (n30Var.getVisibility() != 0) {
                n30Var.setVisibility(0);
                R0(false);
                this.f47518n2 = true;
                ViewTreeObserver viewTreeObserver3 = n30Var.getViewTreeObserver();
                z20 z20Var = new z20(this, 0);
                this.f47529p4 = z20Var;
                viewTreeObserver3.addOnPreDrawListener(z20Var);
            } else {
                ViewTreeObserver viewTreeObserver4 = n30Var.getViewTreeObserver();
                z20 z20Var2 = new z20(this, 1);
                this.f47529p4 = z20Var2;
                viewTreeObserver4.addOnPreDrawListener(z20Var2);
            }
        }
    }

    public final int l1() {
        Integer num = this.f47569x5;
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

    @Override
    public final boolean m0() {
        D5 = true;
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.F2, new Object[0]);
        org.telegram.ui.Components.c20.k(getContext());
        return false;
    }

    public final long m1() {
        TLRPC.Chat chat = this.U2;
        if (chat == null) {
            return 0L;
        }
        return chat.f28431id;
    }

    public final void n1(boolean z10) {
        boolean z11;
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        org.telegram.messenger.c cVar = this.f47522o1;
        int i7 = cVar.f23246a;
        int i10 = cVar.f23246a;
        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(m1()));
        if (O0 != null && !org.telegram.messenger.v3.t0(O0)) {
            TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(i10).P0(m1());
            String K = org.telegram.messenger.v3.K(this.U2, false);
            if (!TextUtils.isEmpty(K)) {
                str = p5.c.m(org.telegram.messenger.mp.u1(i10).X2, "/", K, new StringBuilder());
            } else if (P0 != null && (tL_chatInviteExported = P0.exported_invite) != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                tL_messages_exportChatInvite.peer = org.telegram.messenger.mp.n1(this.U2);
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_exportChatInvite, new di.o8(this, P0, z10, 6));
                return;
            }
            A1(null, str, true, z10);
        } else if (this.V2 != null) {
            for (int i11 = 0; i11 < 2; i11++) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                org.telegram.messenger.t3 t3Var = this.V2;
                exportgroupcallinvite.call = t3Var.g(t3Var.f26962a);
                if (i11 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                exportgroupcallinvite.can_self_unmute = z11;
                ConnectionsManager.getInstance(i10).sendRequest(exportgroupcallinvite, new org.telegram.messenger.zc(this, i11, z10, 2));
            }
        }
    }

    public final UndoView o1() {
        if (!F5) {
            b20 b20Var = this.Z3;
            if (b20Var.f41108b) {
                return b20Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.f47482e2;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.d(2, true);
            this.f30173b.removeView(undoViewArr[0]);
            this.f30173b.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    @Override
    public final void onAudioSettingsChanged() {
        V1(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            I1(0.0f);
        }
        n30 n30Var = this.L1;
        if (n30Var.getVisibility() == 0) {
            org.telegram.messenger.g0.Z3(n30Var);
        }
        x10 x10Var = this.f47511l4;
        if (x10Var.getVisibility() == 0) {
            org.telegram.messenger.g0.Z3(x10Var);
        }
        ArrayList arrayList = this.Y3;
        arrayList.clear();
        arrayList.addAll(this.X3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).j(true);
        }
    }

    @Override
    public final void onBackPressed() {
        w20 w20Var = this.f47551u2;
        if (w20Var != null) {
            w20Var.b(false, false);
        } else if (this.f47484e4) {
            g1(true);
        } else if (this.Z3.f41108b) {
            i1(null);
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
        ArrayList arrayList = this.Y3;
        arrayList.clear();
        arrayList.addAll(this.X3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).j(true);
        }
        w20 w20Var = this.f47551u2;
        if (w20Var != null && VoIPService.getSharedInstance() != null) {
            w20Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.d2;
        launchActivity.f43109a1.add(this.f47553u4);
    }

    @Override
    public final void onMediaStateUpdated(int i7, int i10) {
        org.telegram.messenger.voip.t0.d(this, i7, i10);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.t0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i7) {
        org.telegram.messenger.voip.t0.f(this, i7);
    }

    @Override
    public final void onStateChanged(int i7) {
        this.S3 = i7;
        W1(isShowing(), false);
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.t0.h(this, z10);
    }

    public final void p1() {
        VoIPService sharedInstance;
        int i7;
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (!this.f47527p2 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            this.f47527p2 = true;
            this.f47571y2.addAll(this.V2.f26967g);
            this.f47576z2.addAll(this.f47509l2);
            this.A2.addAll(this.V2.f26969j);
            this.B2.addAll(this.V2.f26972m);
            this.C2.addAll(this.V2.f26971l);
            this.S3 = sharedInstance.getCallState();
            if (this.V2 == null) {
                org.telegram.messenger.t3 t3Var = sharedInstance.groupCall;
                this.V2 = t3Var;
                this.o4.f40635c = t3Var;
                this.Z3.setGroupCall(t3Var);
                this.f47520n4.f48568c = this.V2;
            }
            nh.h hVar = this.X1;
            if (hVar != null) {
                hVar.D0(this.f47522o1.f23246a, this.V2.g(false));
            }
            this.J1.setTitleRightMargin(org.telegram.messenger.g0.L(48.0f) * 2);
            ArrayList arrayList = this.V2.f26965e;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((TLRPC.GroupCallParticipant) arrayList.get(i10)).lastActiveDate = groupCallParticipant.active_date;
            }
            VoIPService.getSharedInstance().registerStateListener(this);
            m30 m30Var = this.Q1;
            if (m30Var != null && m30Var.getVisibility() == 0) {
                this.f47550u1.c(2131230918, -1, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29705uh, false), 0.3f, false, org.telegram.messenger.gd.N0(2131743121, null), false, true);
                V1(true);
                if (org.telegram.messenger.v3.W(this.U2)) {
                    i7 = 2131743238;
                } else {
                    i7 = 2131743137;
                }
                this.f47557v3.setText(org.telegram.messenger.gd.N0(i7, null));
                n30 n30Var = this.L1;
                n30Var.setVisibility(0);
                org.telegram.ui.ActionBar.q0 q0Var = this.f47491g3;
                q0Var.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(n30Var, property, 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(n30Var, View.TRANSLATION_Y, org.telegram.messenger.g0.L(200.0f), 0.0f);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(m30Var, property2, 0.0f);
                Property property3 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(m30Var, property3, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(m30Var, property, 0.0f);
                org.telegram.ui.ActionBar.m5 m5Var = this.P1;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(m5Var, property2, 0.0f);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(m5Var, property3, 0.0f);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(m5Var, property, 0.0f);
                org.telegram.ui.ActionBar.m5 m5Var2 = this.R1;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(m5Var2, property2, 0.0f), ObjectAnimator.ofFloat(m5Var2, property3, 0.0f), ObjectAnimator.ofFloat(m5Var2, property, 0.0f), ObjectAnimator.ofFloat(q0Var, property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(q0Var, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(q0Var, property, 0.0f, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.nr.f37957g);
                animatorSet.addListener(new a30(this, 0));
                animatorSet.setDuration(300L);
                animatorSet.start();
            }
        }
    }

    public final void q1(final long j3, final boolean z10) {
        if (this.V2 != null) {
            org.telegram.messenger.c cVar = this.f47522o1;
            final TLRPC.User c22 = org.telegram.messenger.mp.u1(cVar.f23246a).c2(Long.valueOf(j3));
            if (c22 != null) {
                final org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, getContext(), null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                org.telegram.messenger.t3 t3Var = this.V2;
                invitetogroupcall.call = t3Var.g(t3Var.f26962a);
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = c22.f28580id;
                tL_inputUser.access_hash = c22.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = ConnectionsManager.getInstance(cVar.f23246a).sendRequest(invitetogroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        f40 f40Var = f40.this;
                        long j10 = j3;
                        org.telegram.ui.ActionBar.t1[] t1VarArr2 = t1VarArr;
                        if (tLObject != null) {
                            org.telegram.messenger.mp.u1(f40Var.f47522o1.f23246a).V3((TLRPC.Updates) tLObject, false);
                            org.telegram.messenger.g0.g3(new di.j2(f40Var, j10, t1VarArr2, c22, 19));
                            return;
                        }
                        org.telegram.messenger.g0.g3(new di.m(f40Var, t1VarArr2, z10, tL_error, j10, invitetogroupcall));
                    }
                });
                if (sendRequest != 0) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.j01(this, t1VarArr, sendRequest, 4), 500L);
                }
            }
        }
    }

    public final boolean r1() {
        float f10;
        int L = org.telegram.messenger.g0.L(74.0f);
        float f11 = this.f47546t2 - L;
        if (this.f30207t0 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - this.f30207t0) / ((L - this.f30207t0) - org.telegram.messenger.g0.L(14.0f)));
        } else {
            f10 = 0.0f;
        }
        if (f10 > 0.5f) {
            return true;
        }
        return false;
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            RadialProgressView radialProgressView = this.Z1;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fh, false));
            }
            org.telegram.ui.ActionBar.q0 q0Var = this.f47487f3;
            if (q0Var != null) {
                int i7 = org.telegram.ui.ActionBar.m6.Yg;
                q0Var.P(org.telegram.ui.ActionBar.m6.x0(null, i7, false), false);
                q0Var.P(org.telegram.ui.ActionBar.m6.x0(null, i7, false), true);
                q0Var.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Vg, false));
            }
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yg, false);
            L1(this.f47562w3, x02);
            L1(this.f47567x3, x02);
            L1(this.f47506k3, x02);
            L1(this.f47510l3, x02);
            L1(this.f47515m3, x02);
            L1(this.f47557v3, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29552mh, false));
            L1(this.f47499i3, x02);
            L1(this.j3, x02);
            L1(this.f47533q3, x02);
            L1(this.f47538r3, x02);
            L1(this.f47543s3, x02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final boolean s1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            return true;
        }
        return false;
    }

    @Override
    public final void show() {
        wi.n nVar;
        super.show();
        org.telegram.ui.Components.voip.j1 j1Var = org.telegram.ui.Components.voip.j1.f41084w;
        if (j1Var != null && (nVar = j1Var.f41085a) != null && nVar.e()) {
            org.telegram.ui.Components.voip.j1 j1Var2 = org.telegram.ui.Components.voip.j1.f41084w;
            if (j1Var2.f41085a != null) {
                org.telegram.ui.Components.voip.t0 t0Var = j1Var2.f41088e;
                j1Var2.f41088e = null;
                j1Var2.f41086b.f41009a = null;
                j1Var2.f41085a.a(new org.telegram.ui.Components.rh(11, j1Var2, t0Var));
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.me(19));
            }
        }
        Q1();
    }

    public final boolean u1() {
        if (!v1() || this.V2.f26966f.isEmpty() || (((org.telegram.messenger.u3) this.V2.f26966f.get(0)).f27147c != 0.0f && ((org.telegram.messenger.u3) this.V2.f26966f.get(0)).f27147c < 1.0f)) {
            return false;
        }
        return true;
    }

    public final boolean v1() {
        org.telegram.messenger.t3 t3Var = this.V2;
        if (t3Var != null && t3Var.f26963b.rtmp_stream) {
            return true;
        }
        return false;
    }

    public final void w1(org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.t1 t1Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j3;
        if (!this.f47537r2) {
            org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.d2.M().getFragmentStack().get(this.d2.M().getFragmentStack().size() - 1);
            if (g2Var instanceof bn) {
                boolean sa2 = ((bn) g2Var).sa();
                this.f47537r2 = true;
                this.f47542s2 = true;
                yn ynVar = new yn(w2Var, editTextBoldCursor, z10, t1Var, 7);
                if (sa2) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                org.telegram.messenger.g0.h3(ynVar, j3);
                return;
            }
            this.f47537r2 = true;
            this.f47542s2 = true;
            if (w2Var != null) {
                w2Var.A0(true);
            } else if (t1Var != null) {
                t1Var.l(true);
            }
            if (z10) {
                org.telegram.messenger.g0.h3(new qg(editTextBoldCursor, 2), 100L);
            }
        }
    }

    public final void y1() {
        H5 = true;
        ArrayList arrayList = this.Y3;
        arrayList.clear();
        arrayList.addAll(this.X3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).j(false);
        }
        l30 l30Var = this.G1;
        org.telegram.ui.Components.m71 m71Var = l30Var.f34592w;
        if (m71Var != null) {
            m71Var.c(false);
        }
        l30Var.G = true;
        this.C1.r();
    }

    public final void z1() {
        H5 = false;
        this.K1.f();
        x10 x10Var = this.f47511l4;
        if (x10Var.getVisibility() == 0) {
            this.o4.G(x10Var, false);
        }
        if (F5) {
            this.f47520n4.I(this.f47516m4, false);
        }
        ArrayList arrayList = this.Y3;
        arrayList.clear();
        arrayList.addAll(this.X3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).j(true);
        }
        l30 l30Var = this.G1;
        org.telegram.ui.Components.m71 m71Var = l30Var.f34592w;
        if (m71Var != null) {
            m71Var.c(true);
        }
        l30Var.G = false;
        this.C1.s();
    }

    @Override
    public final void D(float f10, int i7) {
    }
}

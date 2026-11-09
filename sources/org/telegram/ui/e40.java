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
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.GroupCallMessagesController;
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
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.webrtc.voiceengine.WebRtcAudioTrack;
public final class e40 extends org.telegram.ui.ActionBar.v2 implements org.telegram.messenger.ls, VoIPService.StateListener, te.b {
    public static e40 f45182u5;
    public static boolean f45183v5;
    public static boolean f45184w5;
    public static boolean f45185x5;
    public static volatile org.telegram.messenger.q5 f45186y5 = new org.telegram.messenger.q5("updateTextureLightningQueue", true);
    public static boolean f45187z5;
    public final ImageView A1;
    public final org.telegram.ui.Components.ah0 A2;
    public final Paint A3;
    public final View A4;
    public org.telegram.ui.Components.ji0 B1;
    public final org.telegram.ui.Components.ah0 B2;
    public final d40[] B3;
    public final View B4;
    public final k30 C1;
    public boolean C2;
    public float C3;
    public GradientDrawable C4;
    public final org.telegram.ui.Components.j6 D1;
    public final org.telegram.ui.Components.r9 D2;
    public d40 D3;
    public final int[] D4;
    public final u10 E1;
    public final org.telegram.ui.Components.r9 E2;
    public d40 E3;
    public final y10 E4;
    public final b30 F1;
    public float F2;
    public long F3;
    public boolean F4;
    public final y30 G1;
    public float G2;
    public float G3;
    public boolean G4;
    public final m30 H1;
    public float H2;
    public float H3;
    public RenderNode H4;
    public final s20 I1;
    public RadialGradient I2;
    public boolean I3;
    public float I4;
    public final TextView J1;
    public final Matrix J2;
    public boolean J3;
    public boolean J4;
    public final q20 K1;
    public final Paint K2;
    public int K3;
    public final String[] K4;
    public final org.telegram.ui.ActionBar.l5 L1;
    public final t30 L2;
    public float L3;
    public ObjectAnimator L4;
    public final l30 M1;
    public float M2;
    public int M3;
    public ObjectAnimator M4;
    public final org.telegram.ui.ActionBar.l5 N1;
    public float N2;
    public boolean N3;
    public final x20 N4;
    public final s30 O1;
    public ValueAnimator O2;
    public final int[] O3;
    public org.telegram.ui.Cells.f4 O4;
    public final org.telegram.ui.Components.ly P1;
    public TLRPC.InputPeer P2;
    public final ArrayList P3;
    public org.telegram.ui.Components.voip.r P4;
    public final ImageReceiver Q1;
    public TLRPC.Chat Q2;
    public final ArrayList Q3;
    public org.telegram.ui.Components.voip.y Q4;
    public int R1;
    public org.telegram.messenger.r3 R2;
    public final b20 R3;
    public org.telegram.ui.Components.h10 R4;
    public final ImageView S1;
    public final boolean S2;
    public final g20 S3;
    public boolean S4;
    public final nh.h T1;
    public final String T2;
    public final t20 T3;
    public boolean T4;
    public final int U1;
    public final z30 U2;
    public float U3;
    public int U4;
    public final RadialProgressView V1;
    public final t10 V2;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout V3;
    public AnimatorSet V4;
    public final Drawable W1;
    public final v10 W2;
    public boolean W3;
    public g30 W4;
    public final View X1;
    public final Paint X2;
    public boolean X3;
    public int X4;
    public AnimatorSet Y1;
    public ValueAnimator Y2;
    public org.telegram.ui.Components.k30 Y3;
    public int Y4;
    public LaunchActivity Z1;
    public float Z2;
    public n30 Z3;
    public int Z4;
    public final UndoView[] f45188a2;
    public final LinearLayout f45189a3;
    public Boolean f45190a4;
    public int f45191a5;
    public final org.telegram.ui.Cells.k f45192b2;
    public final org.telegram.ui.ActionBar.r0 f45193b3;
    public int f45194b4;
    public int f45195b5;
    public boolean f45196c2;
    public final org.telegram.ui.ActionBar.r0 f45197c3;
    public boolean f45198c4;
    public int f45199c5;
    public org.telegram.ui.Components.z20 d2;
    public final org.telegram.ui.ActionBar.r0 f45200d3;
    public final x10 f45201d4;
    public int f45202d5;
    public org.telegram.ui.Components.z20 f45203e2;
    public final org.telegram.ui.ActionBar.z0 f45204e3;
    public final org.telegram.ui.Components.qj0 f45205e4;
    public int f45206e5;
    public int f45207f2;
    public final org.telegram.ui.ActionBar.z0 f45208f3;
    public final h40 f45209f4;
    public int f45210f5;
    public g.b f45211g2;
    public final org.telegram.ui.ActionBar.z0 f45212g3;
    public final org.telegram.ui.Components.i10 f45213g4;
    public int f45214g5;
    public final ArrayList f45215h2;
    public final org.telegram.ui.ActionBar.z0 f45216h3;
    public ViewTreeObserver.OnPreDrawListener f45217h4;
    public int f45218h5;
    public final d20 f45219i1;
    public a30 f45220i2;
    public final org.telegram.ui.ActionBar.z0 f45221i3;
    public final org.telegram.ui.Components.voip.n f45222i4;
    public int f45223i5;
    public final h10 f45224j1;
    public boolean f45225j2;
    public final org.telegram.ui.ActionBar.z0 j3;
    public boolean f45226j4;
    public int f45227j5;
    public final org.telegram.messenger.c f45228k1;
    public long f45229k2;
    public final org.telegram.ui.ActionBar.z0 f45230k3;
    public final ArrayList f45231k4;
    public int f45232k5;
    public final n10 l1;
    public boolean f45233l2;
    public final org.telegram.ui.ActionBar.z0 f45234l3;
    public boolean f45235l4;
    public int f45236l5;
    public final org.telegram.ui.Components.voip.n2 f45237m1;
    public final RectF f45238m2;
    public final org.telegram.ui.ActionBar.z0 f45239m3;
    public final u00 f45240m4;
    public int f45241m5;
    public final org.telegram.ui.Components.voip.n2 n1;
    public boolean f45242n2;
    public final org.telegram.ui.ActionBar.z0 f45243n3;
    public final r10 f45244n4;
    public final h30 f45245n5;
    public final org.telegram.ui.Components.voip.n2 f45246o1;
    public boolean f45247o2;
    public final org.telegram.ui.ActionBar.z0 f45248o3;
    public final org.telegram.ui.Components.vs o4;
    public Boolean f45249o5;
    public final org.telegram.ui.Components.voip.n2 f45250p1;
    public float f45251p2;
    public final org.telegram.ui.ActionBar.z0 f45252p3;
    public final u00 f45253p4;
    public Integer f45254p5;
    public final org.telegram.ui.Components.voip.n2 f45255q1;
    public v20 f45256q2;
    public final LinearLayout f45257q3;
    public boolean f45258q4;
    public final te.a f45259q5;
    public final org.telegram.ui.Components.voip.n2 f45260r1;
    public TLRPC.Peer f45261r2;
    public final TextView f45262r3;
    public final m4 f45263r4;
    public final te.a f45264r5;
    public final org.telegram.ui.Components.voip.n2 f45265s1;
    public TLObject f45266s2;
    public final c40 f45267s3;
    public final LongSparseIntArray f45268s4;
    public final te.c s5;
    public final o10 f45269t1;
    public final Paint f45270t2;
    public final rh.h f45271t3;
    public final e20 f45272t4;
    public final te.a f45273t5;
    public final ImageView f45274u1;
    public final ArrayList f45275u2;
    public u00 f45276u3;
    public final c20 f45277u4;
    public final Paint f45278v1;
    public final ArrayList f45279v2;
    public org.telegram.ui.Components.i20 f45280v3;
    public LinearLayout f45281v4;
    public final m20 f45282w1;
    public final ArrayList f45283w2;
    public int f45284w3;
    public boolean f45285w4;
    public final l20 f45286x1;
    public final ArrayList f45287x2;
    public boolean f45288x3;
    public final org.telegram.ui.Components.ah0 f45289x4;
    public final j20 f45290y1;
    public final ArrayList f45291y2;
    public boolean f45292y3;
    public int f45293y4;
    public final ImageView f45294z1;
    public int f45295z2;
    public final Paint f45296z3;
    public boolean f45297z4;

    public e40(final LaunchActivity launchActivity, org.telegram.messenger.c cVar, org.telegram.messenger.r3 r3Var, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z9, String str) {
        super((Context) launchActivity, (org.telegram.ui.ActionBar.g6) null, true, true);
        int i7;
        final e40 e40Var;
        final ?? r10;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.f45278v1 = new Paint(1);
        this.f45188a2 = new UndoView[2];
        this.f45215h2 = new ArrayList();
        this.f45238m2 = new RectF();
        this.f45270t2 = new Paint(1);
        this.f45275u2 = new ArrayList();
        this.f45279v2 = new ArrayList();
        this.f45283w2 = new ArrayList();
        this.f45287x2 = new ArrayList();
        this.f45291y2 = new ArrayList();
        this.f45271t3 = new rh.h(new u00(this, 4));
        this.f45284w3 = 0;
        this.f45288x3 = false;
        this.f45296z3 = new Paint(7);
        this.A3 = new Paint(7);
        this.B3 = new d40[8];
        this.C3 = 1.0f;
        this.N3 = true;
        this.O3 = new int[4];
        this.P3 = new ArrayList();
        this.Q3 = new ArrayList();
        this.f45222i4 = new org.telegram.ui.Components.voip.n();
        this.f45231k4 = new ArrayList();
        this.f45240m4 = new u00(this, 0);
        this.f45244n4 = new r10(this);
        this.o4 = new org.telegram.ui.Components.vs(18);
        this.f45253p4 = new u00(this, 1);
        this.f45258q4 = false;
        this.f45263r4 = new m4(this, 7);
        this.f45268s4 = new LongSparseIntArray();
        this.D4 = new int[2];
        this.G4 = true;
        this.K4 = new String[2];
        this.U4 = -1;
        this.f45245n5 = new h30(this);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40458f;
        this.f45259q5 = new te.a(2, this, xqVar, 350L);
        this.f45264r5 = new te.a(3, this, xqVar, 220L, true);
        this.s5 = new te.c(4, this, xqVar, 350L);
        this.f45273t5 = new te.a(5, this, xqVar, 350L);
        org.telegram.messenger.g0.S(getWindow());
        D0();
        this.f45228k1 = cVar;
        this.R2 = r3Var;
        this.P2 = inputPeer;
        this.Q2 = chat;
        this.T2 = str;
        this.f28621a = cVar.f21765a;
        this.S2 = z9;
        this.I0 = new di.i0();
        this.P0 = true;
        this.Q0 = true;
        this.U1 = org.telegram.messenger.qp.s1(this.f28621a).f24942x7.f24463x.U();
        this.U = true;
        f45185x5 = false;
        f45184w5 = false;
        f45187z5 = false;
        this.f28662y0 = new n20(this);
        this.f28652s = true;
        this.f28645n = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.f28657w = true;
        this.F0 = -1;
        this.N4 = new x20(this);
        setOnDismissListener(new y00(this, 0));
        z0();
        y30 y30Var = new y30(this, launchActivity);
        this.G1 = y30Var;
        org.telegram.ui.Components.ap apVar = new org.telegram.ui.Components.ap(true);
        int i10 = org.telegram.ui.ActionBar.l6.f27894eh;
        apVar.b(org.telegram.ui.ActionBar.l6.v0(i10));
        apVar.d();
        b30 b30Var = new b30(this, launchActivity, apVar);
        this.F1 = b30Var;
        b30Var.setSubtitle("");
        b30Var.getSubtitleTextView().setVisibility(0);
        b30Var.p();
        b30Var.getAdditionalSubtitleTextView().setPadding(org.telegram.messenger.g0.L(24.0f), 0, 0, 0);
        org.telegram.messenger.g0.W3(1.0f, b30Var.getAdditionalSubtitleTextView(), this.f45235l4, false);
        b30Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.l6.v0(i10));
        int i11 = org.telegram.ui.ActionBar.l6.Zg;
        org.telegram.ui.ActionBar.s6.l(b30Var, 6, i11, null);
        b30Var.setBackButtonImage(2131231240);
        b30Var.setOccupyStatusBar(false);
        b30Var.setAllowOverlayTitle(false);
        int i12 = org.telegram.ui.ActionBar.l6.Vg;
        org.telegram.ui.ActionBar.s6.l(b30Var, 1, i12, null);
        org.telegram.ui.ActionBar.s6.l(b30Var, 3, org.telegram.ui.ActionBar.l6.f28277z8, null);
        org.telegram.ui.ActionBar.s6.d(b30Var, i12);
        org.telegram.ui.ActionBar.s6.l(b30Var, 6, i11, null);
        b30Var.setActionBarMenuOnItemClick(new j30(this, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.f45261r2 = tL_peerUser;
            i7 = i12;
            tL_peerUser.user_id = cVar.d().e();
        } else {
            i7 = i12;
            if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                this.f45261r2 = tL_peerChannel;
                tL_peerChannel.channel_id = groupCallPeer.channel_id;
            } else if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                this.f45261r2 = tL_peerUser2;
                tL_peerUser2.user_id = groupCallPeer.user_id;
            } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                this.f45261r2 = tL_peerChat;
                tL_peerChat.chat_id = groupCallPeer.chat_id;
            }
        }
        VoIPService.audioLevelsCallback = new t00(this, 2);
        cVar.b().c(this, org.telegram.messenger.qs.f25099w2);
        cVar.b().c(this, org.telegram.messenger.qs.M0);
        cVar.b().c(this, org.telegram.messenger.qs.T);
        cVar.b().c(this, org.telegram.messenger.qs.f25085u1);
        cVar.b().c(this, org.telegram.messenger.qs.B2);
        cVar.b().c(this, org.telegram.messenger.qs.E0);
        cVar.b().c(this, org.telegram.messenger.qs.f25020j0);
        cVar.b().c(this, org.telegram.messenger.qs.f25063r);
        cVar.b().c(this, org.telegram.messenger.qs.f25120z2);
        cVar.b().c(this, org.telegram.messenger.qs.f25113y2);
        cVar.b().c(this, org.telegram.messenger.qs.R3);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.N4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.D2);
        this.W1 = launchActivity.getResources().getDrawable(2131232728).mutate();
        org.telegram.ui.Components.ah0 ah0Var = new org.telegram.ui.Components.ah0(2131624344, org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(46.0f), true, null);
        this.A2 = ah0Var;
        this.B2 = new org.telegram.ui.Components.ah0(2131624044, org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(46.0f), true, null);
        k30 k30Var = new k30(this, launchActivity);
        this.C1 = k30Var;
        this.f28624b = k30Var;
        k30Var.setClipToPadding(false);
        this.f28624b.setFocusable(true);
        this.f28624b.setFocusableInTouchMode(true);
        this.f28624b.setWillNotDraw(false);
        ViewGroup viewGroup = this.f28624b;
        int i13 = this.f28654t0;
        viewGroup.setPadding(i13, 0, i13, 0);
        this.f28624b.setKeepScreenOn(true);
        this.f28624b.setClipChildren(false);
        this.Q1 = new ImageReceiver(this.f28624b);
        if (inputPeer != null) {
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(launchActivity);
            this.L1 = l5Var;
            l5Var.setGravity(17);
            l5Var.setTextColor(-1);
            l5Var.setTypeface(org.telegram.messenger.g0.o());
            l5Var.setTextSize(18);
            l5Var.k(org.telegram.messenger.id.L0(2131743435));
            this.f28624b.addView(l5Var, c8.ha.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            l30 l30Var = new l30(this, launchActivity);
            this.M1 = l30Var;
            l30Var.setGravity(17);
            l30Var.setTextColor(-1);
            l30Var.setTypeface(org.telegram.messenger.g0.o());
            l30Var.setTextSize(60);
            this.f28624b.addView(l30Var, c8.ha.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(launchActivity);
            this.N1 = l5Var2;
            l5Var2.setGravity(17);
            l5Var2.setTextColor(-1);
            l5Var2.setTypeface(org.telegram.messenger.g0.o());
            l5Var2.setTextSize(18);
            this.f28624b.addView(l5Var2, c8.ha.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (u1()) {
            t30 t30Var = new t30(this, launchActivity);
            this.L2 = t30Var;
            this.f28624b.addView(t30Var, c8.ha.d(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        m30 m30Var = new m30(this, launchActivity);
        this.H1 = m30Var;
        m30Var.setClipToPadding(false);
        m30Var.setClipChildren(false);
        s30 s30Var = new s30(this);
        this.O1 = s30Var;
        s30Var.f57112o = xqVar;
        s30Var.d = 350L;
        s30Var.f57128c = 350L;
        s30Var.f57129e = 350L;
        s30Var.S();
        m30Var.setItemAnimator(s30Var);
        m30Var.setOnScrollListener(new g10(this));
        m30Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.ly lyVar = new org.telegram.ui.Components.ly(f45184w5 ? 6 : 2, m30Var);
        this.P1 = lyVar;
        m30Var.setLayoutManager(lyVar);
        h10 h10Var = new h10(this);
        this.f45224j1 = h10Var;
        lyVar.z1(h10Var);
        m30Var.i(new i10(this));
        lyVar.C1();
        this.f28624b.addView(m30Var, c8.ha.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        m30Var.setAdapter(y30Var);
        m30Var.setTopBottomSelectorRadius(13);
        org.telegram.ui.ActionBar.s6.I(org.telegram.ui.ActionBar.l6.Sg, m30Var);
        m30Var.setOnItemClickListener(new a7(this, launchActivity, r3Var, 14));
        m30Var.setOnItemLongClickListener(new t00(this, 3));
        if (u1()) {
            c40 c40Var = new c40(this, getContext());
            this.f45267s3 = c40Var;
            this.f28624b.addView(c40Var, c8.ha.d(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(launchActivity);
        this.f45205e4 = qj0Var;
        this.f28624b.addView(qj0Var, c8.ha.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        h40 h40Var = new h40(r3Var, this.f28621a, this);
        this.f45209f4 = h40Var;
        qj0Var.setAdapter(h40Var);
        v4.s sVar = new v4.s(6, false);
        qj0Var.setLayoutManager(sVar);
        sVar.z1(new k10(this));
        qj0Var.setOnItemClickListener(new org.telegram.ui.Components.cj0(this) {
            public final e40 f49648b;

            {
                this.f49648b = this;
            }

            @Override
            public final void c(int i14, View view) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.h10 h10Var2 = (org.telegram.ui.Components.h10) view;
                        org.telegram.messenger.s3 videoParticipant = h10Var2.getVideoParticipant();
                        e40 e40Var2 = this.f49648b;
                        if (videoParticipant == null) {
                            e40Var2.h1(new org.telegram.messenger.s3(h10Var2.getParticipant(), false));
                            return;
                        } else {
                            e40Var2.h1(h10Var2.getVideoParticipant());
                            return;
                        }
                    default:
                        e40 e40Var3 = this.f49648b;
                        e40Var3.getClass();
                        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) view;
                        if (rVar.getParticipant() != null) {
                            e40Var3.h1(rVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        v4.k kVar = new v4.k();
        kVar.S();
        kVar.f57112o = xqVar;
        kVar.d = 350L;
        kVar.f57128c = 350L;
        kVar.f57129e = 350L;
        qj0Var.setItemAnimator(new l10(this));
        qj0Var.setOnScrollListener(new m10(this));
        h40Var.H(qj0Var, false, false);
        qj0Var.setVisibility(8);
        n10 n10Var = new n10(this, launchActivity);
        this.l1 = n10Var;
        int v02 = org.telegram.ui.ActionBar.l6.v0(org.telegram.ui.ActionBar.l6.f28248xh);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.J2 = new Matrix();
        this.I2 = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.K2 = paint;
        paint.setShader(this.I2);
        org.telegram.ui.Components.r9 r9Var = new org.telegram.ui.Components.r9(9);
        this.D2 = r9Var;
        org.telegram.ui.Components.r9 r9Var2 = new org.telegram.ui.Components.r9(12);
        this.E2 = r9Var2;
        r9Var.f37587a = org.telegram.messenger.g0.L(62.0f) * 0.45454547f;
        r9Var.f37588b = org.telegram.messenger.g0.L(72.0f) * 0.45454547f;
        r9Var.b();
        r9Var2.f37587a = org.telegram.messenger.g0.L(65.0f) * 0.45454547f;
        r9Var2.f37588b = org.telegram.messenger.g0.L(75.0f) * 0.45454547f;
        r9Var2.b();
        int i14 = org.telegram.ui.ActionBar.l6.f28229wh;
        r9Var.d.setColor(i0.a.o(org.telegram.ui.ActionBar.l6.v0(i14), 38));
        r9Var2.d.setColor(i0.a.o(org.telegram.ui.ActionBar.l6.v0(i14), 76));
        org.telegram.ui.Components.voip.n2 n2Var = new org.telegram.ui.Components.voip.n2(launchActivity, 50.0f);
        this.f45250p1 = n2Var;
        n2Var.setCheckable(true);
        n2Var.setTextSize(12);
        n10Var.a(n2Var);
        n2Var.setOnClickListener(new r00(this, 6));
        org.telegram.ui.Components.voip.n2 n2Var2 = new org.telegram.ui.Components.voip.n2(launchActivity, 50.0f);
        this.f45246o1 = n2Var2;
        n2Var2.setCheckable(true);
        n2Var2.setTextSize(12);
        n2Var2.d(false, false);
        n2Var2.setCrossOffset(-org.telegram.messenger.g0.N(3.5f));
        n2Var2.c(2131230926, -1, 0, 1.0f, true, org.telegram.messenger.id.L0(2131743489), false, false);
        org.telegram.ui.Components.voip.n2 n2Var3 = new org.telegram.ui.Components.voip.n2(launchActivity, 50.0f);
        this.f45237m1 = n2Var3;
        n2Var3.setCheckable(true);
        n2Var3.setTextSize(12);
        n2Var3.d(false, false);
        org.telegram.ui.Components.dh0 dh0Var = new org.telegram.ui.Components.dh0(launchActivity);
        n2Var3.addView(dh0Var, c8.ha.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.ah0 ah0Var2 = new org.telegram.ui.Components.ah0(2131623962, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        this.f45289x4 = ah0Var2;
        dh0Var.setAnimation(ah0Var2);
        n2Var3.setOnClickListener(new r00(this, 9));
        n10Var.a(n2Var3);
        org.telegram.ui.Components.voip.n2 n2Var4 = new org.telegram.ui.Components.voip.n2(launchActivity, 50.0f);
        this.n1 = n2Var4;
        n2Var4.setCheckable(true);
        n2Var4.setTextSize(12);
        n2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.S1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.R1 = 2131231171;
        imageView.setImageResource(2131231171);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        n2Var4.addView(imageView, c8.ha.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        n2Var4.setOnClickListener(new r00(this, 10));
        n10Var.a(n2Var4);
        n10Var.a(n2Var2);
        org.telegram.ui.Components.voip.n2 n2Var5 = new org.telegram.ui.Components.voip.n2(launchActivity, 50.0f);
        this.f45255q1 = n2Var5;
        n2Var5.setTextSize(12);
        n2Var5.c(2131230918, -1, org.telegram.ui.ActionBar.l6.v0(org.telegram.ui.ActionBar.l6.f28135rh), 0.3f, false, org.telegram.messenger.id.L0(2131743364), false, false);
        n2Var5.setOnClickListener(new View.OnClickListener(this) {
            public final e40 f51523b;

            {
                this.f51523b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        e40 e40Var2 = this.f51523b;
                        LaunchActivity launchActivity2 = e40Var2.Z1;
                        if (launchActivity2 != null && launchActivity2.checkSelfPermission("android.permission.CAMERA") != 0) {
                            e40Var2.Z1.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
                            return;
                        } else if (VoIPService.getSharedInstance() != null) {
                            boolean z10 = false;
                            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                                e40Var2.f45188a2[0].d(1, false);
                                if (e40Var2.f45256q2 == null) {
                                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                                    if (sharedInstance != null) {
                                        sharedInstance.createCaptureDevice(false);
                                    }
                                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                                        z10 = true;
                                    }
                                    v20 v20Var = new v20(e40Var2, launchActivity, z10);
                                    e40Var2.f45256q2 = v20Var;
                                    v20Var.setBottomPadding(e40Var2.f28624b.getPaddingBottom());
                                    e40Var2.f28627c.addView(e40Var2.f45256q2);
                                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                                        sharedInstance.switchCamera();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            VoIPService.getSharedInstance().setVideoState(false, 0);
                            e40Var2.T1(true, false);
                            e40Var2.S1(false);
                            e40Var2.R2.z();
                            e40Var2.Q0(true);
                            e40Var2.l1.requestLayout();
                            return;
                        } else {
                            return;
                        }
                    default:
                        e40 e40Var3 = this.f51523b;
                        e40Var3.R3.e();
                        org.telegram.messenger.r3 r3Var2 = e40Var3.R2;
                        if (r3Var2 != null && !r3Var2.j()) {
                            e40Var3.O1();
                            e40.w1(launchActivity, new u00(e40Var3, 5), false, false);
                            return;
                        }
                        e40Var3.dismiss();
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.n2 n2Var6 = new org.telegram.ui.Components.voip.n2(launchActivity, 50.0f);
        this.f45260r1 = n2Var6;
        n2Var6.setCheckable(true);
        n2Var6.b(true, false);
        n2Var6.setTextSize(12);
        n2Var6.c(2131231186, -1, 0, 1.0f, true, org.telegram.messenger.id.L0(2131743294), false, false);
        o10 o10Var = new o10(this, launchActivity);
        this.f45269t1 = o10Var;
        o10Var.setAnimation(ah0Var);
        o10Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.n2 n2Var7 = new org.telegram.ui.Components.voip.n2(launchActivity, 50.0f);
        this.f45265s1 = n2Var7;
        n2Var7.setDrawBackground(false);
        n2Var7.setTextSize(12);
        n2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        n2Var7.addView(o10Var, c8.ha.e(50, 50, 49));
        n10Var.a(n2Var7);
        n2Var7.setOnClickListener(new q10(this));
        n10Var.a(n2Var6);
        n10Var.a(n2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.f45274u1 = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(2131232799);
        n2Var7.addView(imageView2, c8.ha.d(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.R2 != null && u1() && !this.R2.j()) {
            imageView2.setVisibility(0);
            o10Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.V1 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.l6.v0(org.telegram.ui.ActionBar.l6.Ch));
        b30Var.setAlpha(0.0f);
        b30Var.getBackButton().setScaleX(0.9f);
        b30Var.getBackButton().setScaleY(0.9f);
        b30Var.getBackButton().setTranslationX(-org.telegram.messenger.g0.L(14.0f));
        b30Var.getTitleTextView().setTranslationY(org.telegram.messenger.g0.L(23.0f));
        b30Var.getSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(20.0f));
        b30Var.getAdditionalSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(20.0f));
        org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.l6.v0(i7));
        this.f45193b3 = r0Var;
        r0Var.setLongClickEnabled(false);
        r0Var.setIcon(2131231244);
        r0Var.setContentDescription(org.telegram.messenger.id.L0(2131754839));
        r0Var.setSubMenuOpenSide(2);
        r0Var.setDelegate(new t00(this, 5));
        int i15 = org.telegram.ui.ActionBar.l6.Wg;
        org.telegram.ui.ActionBar.s6.R(r0Var, org.telegram.ui.ActionBar.l6.g0(org.telegram.ui.ActionBar.l6.v0(i15), 6), null, org.telegram.ui.ActionBar.s6.M(i15));
        r0Var.setOnClickListener(new r00(this, 11));
        r0Var.O(org.telegram.ui.ActionBar.l6.v0(i7), false);
        r0Var.O(org.telegram.ui.ActionBar.l6.v0(i7), true);
        org.telegram.ui.ActionBar.r0 r0Var2 = new org.telegram.ui.ActionBar.r0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.l6.v0(i7));
        this.f45197c3 = r0Var2;
        r0Var2.setLongClickEnabled(false);
        r0Var2.setIcon(2131232429);
        r0Var2.setContentDescription(org.telegram.messenger.id.L0(2131754808));
        org.telegram.ui.ActionBar.s6.R(r0Var2, org.telegram.ui.ActionBar.l6.g0(org.telegram.ui.ActionBar.l6.v0(i15), 6), null, org.telegram.ui.ActionBar.s6.M(i15));
        r0Var2.setOnClickListener(new r00(this, 0));
        org.telegram.ui.ActionBar.r0 r0Var3 = new org.telegram.ui.ActionBar.r0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.l6.v0(i7));
        this.f45200d3 = r0Var3;
        r0Var3.setLongClickEnabled(false);
        r0Var3.setIcon(2131232352);
        r0Var3.setContentDescription(org.telegram.messenger.id.L0(2131754808));
        org.telegram.ui.ActionBar.s6.R(r0Var3, org.telegram.ui.ActionBar.l6.g0(org.telegram.ui.ActionBar.l6.v0(i15), 6), null, org.telegram.ui.ActionBar.s6.M(i15));
        r0Var3.setOnClickListener(new r00(this, 1));
        t10 t10Var = new t10(this, launchActivity, launchActivity);
        this.V2 = t10Var;
        u10 u10Var = new u10(launchActivity);
        this.E1 = u10Var;
        u10Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.X2 = paint2;
        paint2.setColor(-12761513);
        v10 v10Var = new v10(this, getContext());
        this.W2 = v10Var;
        org.telegram.ui.ActionBar.s6.U(v10Var, i7, this.I0);
        v10Var.setTextSize(1, 11.0f);
        v10Var.setText(org.telegram.messenger.id.L0(2131743474));
        v10Var.setMaxLines(1);
        v10Var.setGravity(17);
        v10Var.setTypeface(org.telegram.messenger.g0.o());
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        v10Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f));
        v10Var.setTag(-1);
        if (!u1()) {
            v10Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f45189a3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(t10Var, c8.ha.l(1.0f, 0, -2));
        linearLayout.addView(v10Var, c8.ha.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.f28624b.addView(u10Var, c8.ha.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f28624b.addView(linearLayout, c8.ha.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.f28624b.addView(b30Var, c8.ha.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.f45257q3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(r0Var3, c8.ha.o(48, 48));
        linearLayout2.addView(r0Var2, c8.ha.o(48, 48));
        linearLayout2.addView(r0Var, c8.ha.o(48, 48));
        this.f28624b.addView(linearLayout2, c8.ha.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.X1 = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.V5, view, null);
        this.f28624b.addView(view, c8.ha.c(1.0f, -1));
        for (int i16 = 0; i16 < 2; i16++) {
            this.f45188a2[i16] = new w10(this, launchActivity);
            this.f45188a2[i16].setAdditionalTranslationY(org.telegram.messenger.g0.L(10.0f));
            this.f45188a2[i16].setTranslationZ(org.telegram.messenger.g0.L(5.0f));
            this.f28624b.addView(this.f45188a2[i16], c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.k kVar2 = new org.telegram.ui.Cells.k(launchActivity, true);
        this.f45192b2 = kVar2;
        kVar2.setTag(2131296437, 240);
        this.f45193b3.g(kVar2, org.telegram.messenger.g0.L(48.0f));
        this.f45193b3.setShowSubmenuByMove(false);
        int i17 = org.telegram.ui.ActionBar.l6.Sg;
        org.telegram.ui.ActionBar.s6.R(kVar2, org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.v0(i17), 6, 6), null, org.telegram.ui.ActionBar.s6.M(i17));
        org.telegram.ui.ActionBar.r0 r0Var4 = this.f45193b3;
        org.telegram.ui.ActionBar.z0 d = r0Var4.d(1, 0, null, org.telegram.messenger.id.L0(2131743401), true, true, r0Var4.m0);
        this.f45234l3 = d;
        d.m(true, false);
        org.telegram.ui.ActionBar.r0 r0Var5 = this.f45193b3;
        org.telegram.ui.ActionBar.z0 d2 = r0Var5.d(2, 0, null, org.telegram.messenger.id.L0(2131743354), true, true, r0Var5.m0);
        this.f45239m3 = d2;
        d2.m(false, true);
        int i18 = org.telegram.ui.ActionBar.l6.f28004kh;
        d.setCheckColor(i18);
        d.d(org.telegram.ui.ActionBar.l6.v0(i18), org.telegram.ui.ActionBar.l6.v0(i18));
        d2.setCheckColor(i18);
        d2.d(org.telegram.ui.ActionBar.l6.v0(i18), org.telegram.ui.ActionBar.l6.v0(i18));
        Paint paint3 = new Paint(1);
        int i19 = org.telegram.ui.ActionBar.l6.Vg;
        paint3.setColor(org.telegram.ui.ActionBar.l6.v0(i19));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.r0 r0Var6 = this.f45193b3;
        org.telegram.ui.ActionBar.z0 d10 = r0Var6.d(10, 2131232430, null, org.telegram.messenger.id.L0(2131743399), true, false, r0Var6.m0);
        this.f45212g3 = d10;
        d10.setItemHeight(56);
        org.telegram.ui.ActionBar.r0 r0Var7 = this.f45193b3;
        org.telegram.ui.ActionBar.z0 d11 = r0Var7.d(11, 2131232261, null, org.telegram.messenger.id.L0(2131743282), true, false, r0Var7.m0);
        this.f45216h3 = d11;
        d11.setItemHeight(56);
        TextView b10 = this.f45193b3.b(i0.a.f(0.3f, org.telegram.ui.ActionBar.l6.v0(org.telegram.ui.ActionBar.l6.Ug), -16777216));
        this.f45262r3 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.r0 r0Var8 = this.f45193b3;
        org.telegram.ui.ActionBar.z0 d12 = r0Var8.d(6, 2131232116, this.U2, org.telegram.messenger.id.L0(org.telegram.messenger.t3.W(this.Q2) ? 2131743485 : 2131743384), true, false, r0Var8.m0);
        this.f45208f3 = d12;
        org.telegram.ui.ActionBar.r0 r0Var9 = this.f45193b3;
        org.telegram.ui.ActionBar.z0 d13 = r0Var9.d(7, 2131232276, this.U2, org.telegram.messenger.id.L0(2131743385), false, false, r0Var9.m0);
        this.f45221i3 = d13;
        org.telegram.ui.ActionBar.z0 e10 = this.f45193b3.e(3, 2131232203, org.telegram.messenger.id.L0(2131743337));
        this.f45204e3 = e10;
        z30 z30Var = new z30();
        this.U2 = z30Var;
        org.telegram.ui.ActionBar.z0 e11 = this.f45193b3.e(9, 2131232352, org.telegram.messenger.id.L0(2131743436));
        this.f45230k3 = e11;
        org.telegram.ui.ActionBar.r0 r0Var10 = this.f45193b3;
        org.telegram.ui.ActionBar.z0 d14 = r0Var10.d(5, 0, z30Var, org.telegram.messenger.id.L0(2131743348), true, false, r0Var10.m0);
        this.j3 = d14;
        z30Var.a(d14.getImageView());
        org.telegram.ui.ActionBar.z0 e12 = this.f45193b3.e(12, 2131231895, org.telegram.messenger.id.L0(2131743484));
        this.f45248o3 = e12;
        org.telegram.ui.ActionBar.z0 e13 = this.f45193b3.e(13, 2131230781, org.telegram.messenger.id.L0(2131743486));
        this.f45252p3 = e13;
        org.telegram.ui.ActionBar.z0 e14 = this.f45193b3.e(4, 2131232087, org.telegram.messenger.id.L0(r1() ? 2131743379 : org.telegram.messenger.t3.W(this.Q2) ? 2131743481 : 2131743380));
        this.f45243n3 = e14;
        this.f45193b3.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.l6.v0(i17));
        this.f45193b3.getPopupLayout().setFitItems(true);
        e12.d(org.telegram.ui.ActionBar.l6.v0(i19), org.telegram.ui.ActionBar.l6.v0(i19));
        e13.d(org.telegram.ui.ActionBar.l6.v0(i19), org.telegram.ui.ActionBar.l6.v0(i19));
        d10.d(org.telegram.ui.ActionBar.l6.v0(i19), org.telegram.ui.ActionBar.l6.v0(i19));
        d11.d(org.telegram.ui.ActionBar.l6.v0(i19), org.telegram.ui.ActionBar.l6.v0(i19));
        int i20 = org.telegram.ui.ActionBar.l6.f27985jh;
        e14.d(org.telegram.ui.ActionBar.l6.v0(i20), org.telegram.ui.ActionBar.l6.v0(i20));
        e10.d(org.telegram.ui.ActionBar.l6.v0(i19), org.telegram.ui.ActionBar.l6.v0(i19));
        d12.d(org.telegram.ui.ActionBar.l6.v0(i19), org.telegram.ui.ActionBar.l6.v0(i19));
        d13.d(org.telegram.ui.ActionBar.l6.v0(i19), org.telegram.ui.ActionBar.l6.v0(i19));
        d14.d(org.telegram.ui.ActionBar.l6.v0(i19), org.telegram.ui.ActionBar.l6.v0(i19));
        e11.d(org.telegram.ui.ActionBar.l6.v0(i19), org.telegram.ui.ActionBar.l6.v0(i19));
        if (this.R2 != null) {
            o1();
        }
        if (r1()) {
            this.f45211g2 = new g.b();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.f45211g2.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        V1(false);
        this.F1.getTitleTextView().setOnClickListener(new r00(this, 2));
        x10 x10Var = new x10(this, launchActivity);
        this.f45201d4 = x10Var;
        y10 y10Var = new y10(this);
        this.E4 = y10Var;
        x10Var.setClipToPadding(false);
        y10Var.S();
        y10Var.f57112o = org.telegram.ui.Components.xq.f40458f;
        y10Var.d = 350L;
        y10Var.f57128c = 350L;
        y10Var.f57129e = 350L;
        x10Var.setItemAnimator(y10Var);
        x10Var.setOnScrollListener(new z10(this));
        x10Var.setClipChildren(false);
        v4.b0 b0Var = new v4.b0();
        b0Var.j1(0);
        x10Var.setLayoutManager(b0Var);
        org.telegram.ui.Components.i10 i10Var = new org.telegram.ui.Components.i10(r3Var, this.f28621a, this);
        this.f45213g4 = i10Var;
        x10Var.setAdapter(i10Var);
        i10Var.F(x10Var, false);
        x10Var.setOnItemClickListener(new org.telegram.ui.Components.cj0(this) {
            public final e40 f49648b;

            {
                this.f49648b = this;
            }

            @Override
            public final void c(int i142, View view2) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.h10 h10Var2 = (org.telegram.ui.Components.h10) view2;
                        org.telegram.messenger.s3 videoParticipant = h10Var2.getVideoParticipant();
                        e40 e40Var2 = this.f49648b;
                        if (videoParticipant == null) {
                            e40Var2.h1(new org.telegram.messenger.s3(h10Var2.getParticipant(), false));
                            return;
                        } else {
                            e40Var2.h1(h10Var2.getVideoParticipant());
                            return;
                        }
                    default:
                        e40 e40Var3 = this.f49648b;
                        e40Var3.getClass();
                        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) view2;
                        if (rVar.getParticipant() != null) {
                            e40Var3.h1(rVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        x10Var.setOnItemLongClickListener(new t00(this, 0));
        x10Var.setVisibility(8);
        x10Var.i(new a20());
        b20 b20Var = new b20(this, launchActivity, this.H1, x10Var, this.P3, this.R2, this);
        this.R3 = b20Var;
        b20Var.setClipChildren(false);
        i10Var.E(this.P3, b20Var);
        if (this.f45205e4 != null) {
            this.f45209f4.G(this.P3, b20Var);
        }
        c20 c20Var = new c20(this, launchActivity);
        this.f45277u4 = c20Var;
        d20 d20Var = new d20(this, launchActivity, this.F1, this.H1, c20Var);
        this.f45219i1 = d20Var;
        d20Var.setImagesLayerNum(Integer.MAX_VALUE);
        d20Var.setInvalidateWithParent(true);
        c20Var.setProfileGalleryView(d20Var);
        e20 e20Var = new e20(this, launchActivity);
        this.f45272t4 = e20Var;
        e20Var.setVisibility(8);
        d20Var.setVisibility(0);
        d20Var.b(new f20(this));
        g20 g20Var = new g20(this, launchActivity);
        this.S3 = g20Var;
        this.f28624b.addView(b20Var);
        b20Var.addView(x10Var, c8.ha.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.l1.setWillNotDraw(false);
        View view2 = new View(launchActivity);
        this.A4 = view2;
        int[] iArr = this.D4;
        iArr[0] = this.M3;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.D4);
        this.C4 = gradientDrawable;
        view2.setBackground(gradientDrawable);
        this.f28624b.addView(view2, c8.ha.e(-1, 60, 83));
        View view3 = new View(launchActivity);
        this.B4 = view3;
        view3.setBackgroundColor(this.D4[0]);
        this.f28624b.addView(view3, c8.ha.e(-1, 0, 83));
        nh.h hVar = new nh.h(launchActivity);
        this.T1 = hVar;
        hVar.setDelegate(new h20(this));
        hVar.setClickCellDelegate(new i20(this));
        org.telegram.messenger.r3 r3Var2 = this.R2;
        if (r3Var2 != null) {
            hVar.D0(this.f45228k1.f21765a, r3Var2.g(false));
        }
        this.f28624b.addView(hVar, c8.ha.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(launchActivity, false, true, true);
        this.D1 = j6Var;
        j6Var.setGravity(17);
        j6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        j6Var.setTextColor(-1);
        j6Var.b(0.4f, 320L, org.telegram.ui.Components.xq.h);
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        this.f28624b.addView(this.l1);
        j20 j20Var = new j20(this, launchActivity, this.C1, LaunchActivity.Q(), this.I0);
        this.f45290y1 = j20Var;
        j20Var.J = true;
        j20Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.U1)});
        j20Var.getEditText().setLinkTextColor(-11683585);
        j20Var.setHint(org.telegram.messenger.id.L0(2131743928));
        j20Var.getEditText().addTextChangedListener(new k20(this));
        j20Var.s();
        l20 l20Var = new l20(this, launchActivity);
        this.f45286x1 = l20Var;
        this.f28624b.addView(l20Var, c8.ha.c(-1.0f, -1));
        m20 m20Var = new m20(launchActivity);
        this.f45282w1 = m20Var;
        m20Var.addView(j20Var, c8.ha.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        m20Var.addView(j6Var, c8.ha.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        j6Var.setTranslationY(-org.telegram.messenger.g0.L(20.0f));
        this.f28624b.addView(m20Var, c8.ha.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.A1 = imageView3;
        int i21 = org.telegram.ui.ActionBar.l6.f27957i6;
        org.telegram.ui.ActionBar.s6.Q(imageView3, org.telegram.ui.ActionBar.l6.h0(V(i21), 1, -1), null, org.telegram.ui.ActionBar.s6.M(i21), this.I0);
        int i22 = org.telegram.ui.ActionBar.l6.f27904f7;
        org.telegram.ui.ActionBar.g6 g6Var = this.I0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.s6.s(imageView3, i22, g6Var, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131230871);
        imageView3.setOnClickListener(new r00(this, 3));
        ImageView imageView4 = new ImageView(launchActivity);
        this.f45294z1 = imageView4;
        org.telegram.ui.ActionBar.s6.Q(imageView4, org.telegram.ui.ActionBar.l6.h0(V(i21), 1, -1), null, org.telegram.ui.ActionBar.s6.M(i21), this.I0);
        org.telegram.ui.ActionBar.s6.s(imageView4, org.telegram.ui.ActionBar.l6.f28200v6, this.I0, mode);
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(2131231460);
        imageView4.setOnClickListener(new r00(this, 4));
        m20Var.addView(imageView3, c8.ha.e(48, 48, 85));
        m20Var.addView(imageView4, c8.ha.e(48, 48, 85));
        this.f28624b.addView(g20Var);
        e20Var.addView(d20Var, c8.ha.c(-1.0f, -1));
        e20Var.addView(c20Var, c8.ha.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f28624b.addView(e20Var, c8.ha.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        Q0(false);
        this.G1.f();
        if (f45185x5) {
            this.f45209f4.I(this.f45205e4, false);
        }
        this.f45295z2 = this.G1.b();
        if (inputPeer != null) {
            TextView textView = new TextView(launchActivity);
            this.J1 = textView;
            textView.setGravity(17);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 14.0f);
            if (org.telegram.messenger.t3.T(this.Q2) && (chat2 = this.Q2) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            this.f28624b.addView(textView, c8.ha.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.ib0 ib0Var = new org.telegram.ui.Components.ib0(launchActivity);
            ib0Var.setTextColor(-1);
            ib0Var.setSelectorColor(-9598483);
            ib0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
            ib0Var.setItemCount(5);
            o20 o20Var = new o20(launchActivity);
            o20Var.setItemCount(5);
            o20Var.setTextColor(-1);
            o20Var.setSelectorColor(-9598483);
            o20Var.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
            p20 p20Var = new p20(launchActivity);
            p20Var.setItemCount(5);
            p20Var.setTextColor(-1);
            p20Var.setSelectorColor(-9598483);
            p20Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
            q20 q20Var = new q20(launchActivity);
            this.K1 = q20Var;
            q20Var.setLines(1);
            q20Var.setSingleLine(true);
            q20Var.setEllipsize(TextUtils.TruncateAt.END);
            q20Var.setGravity(17);
            q20Var.setTextColor(-1);
            q20Var.setTypeface(org.telegram.messenger.g0.o());
            q20Var.setTextSize(1, 14.0f);
            this.f28624b.addView(q20Var, c8.ha.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            r10 = 0;
            q20Var.setOnClickListener(new org.telegram.messenger.video.f(this, ib0Var, o20Var, p20Var, chat, cVar, inputPeer2, 1));
            s20 s20Var = new s20(launchActivity, ib0Var, o20Var, p20Var);
            this.I1 = s20Var;
            s20Var.setWeightSum(1.0f);
            s20Var.setOrientation(0);
            this.f28624b.addView(s20Var, c8.ha.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i23 = calendar.get(1);
            int i24 = calendar.get(6);
            s20Var.addView(ib0Var, c8.ha.l(0.5f, 0, 270));
            ib0Var.setMinValue(0);
            ib0Var.setMaxValue(365);
            ib0Var.setWrapSelectorWheel(false);
            ib0Var.setFormatter(new v00(currentTimeMillis, calendar, i23, 0));
            a1.d dVar = new a1.d(this, ib0Var, o20Var, p20Var, 14);
            e40Var = this;
            ib0Var.setOnValueChangedListener(dVar);
            o20Var.setMinValue(0);
            o20Var.setMaxValue(23);
            s20Var.addView(o20Var, c8.ha.l(0.2f, 0, 270));
            o20Var.setFormatter(new org.telegram.ui.Components.jl0(19));
            o20Var.setOnValueChangedListener(dVar);
            p20Var.setMinValue(0);
            p20Var.setMaxValue(59);
            p20Var.setValue(0);
            p20Var.setFormatter(new org.telegram.ui.Components.jl0(20));
            s20Var.addView(p20Var, c8.ha.l(0.3f, 0, 270));
            p20Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i25 = calendar.get(6);
            int i26 = calendar.get(12);
            int i27 = calendar.get(11);
            ib0Var.setValue(i24 != i25 ? 1 : 0);
            p20Var.setValue(i26);
            o20Var.setValue(i27);
            org.telegram.ui.Components.v4.g(q20Var, textView, 0L, 604800L, 2, ib0Var, o20Var, p20Var);
        } else {
            e40Var = this;
            r10 = 0;
        }
        t20 t20Var = new t20(e40Var, (ViewGroup) e40Var.getWindow().getDecorView(), e40Var.f28624b);
        e40Var.T3 = t20Var;
        t20Var.E = new u20(e40Var);
        d20Var.setPinchToZoomHelper(t20Var);
        e40Var.f45246o1.setOnClickListener(new View.OnClickListener(e40Var) {
            public final e40 f51523b;

            {
                this.f51523b = e40Var;
            }

            @Override
            public final void onClick(View view4) {
                switch (r10) {
                    case 0:
                        e40 e40Var2 = this.f51523b;
                        LaunchActivity launchActivity2 = e40Var2.Z1;
                        if (launchActivity2 != null && launchActivity2.checkSelfPermission("android.permission.CAMERA") != 0) {
                            e40Var2.Z1.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
                            return;
                        } else if (VoIPService.getSharedInstance() != null) {
                            boolean z10 = false;
                            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                                e40Var2.f45188a2[0].d(1, false);
                                if (e40Var2.f45256q2 == null) {
                                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                                    if (sharedInstance2 != null) {
                                        sharedInstance2.createCaptureDevice(false);
                                    }
                                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                                        z10 = true;
                                    }
                                    v20 v20Var = new v20(e40Var2, launchActivity, z10);
                                    e40Var2.f45256q2 = v20Var;
                                    v20Var.setBottomPadding(e40Var2.f28624b.getPaddingBottom());
                                    e40Var2.f28627c.addView(e40Var2.f45256q2);
                                    if (sharedInstance2 != null && !sharedInstance2.isFrontFaceCamera()) {
                                        sharedInstance2.switchCamera();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            VoIPService.getSharedInstance().setVideoState(false, 0);
                            e40Var2.T1(true, false);
                            e40Var2.S1(false);
                            e40Var2.R2.z();
                            e40Var2.Q0(true);
                            e40Var2.l1.requestLayout();
                            return;
                        } else {
                            return;
                        }
                    default:
                        e40 e40Var3 = this.f51523b;
                        e40Var3.R3.e();
                        org.telegram.messenger.r3 r3Var22 = e40Var3.R2;
                        if (r3Var22 != null && !r3Var22.j()) {
                            e40Var3.O1();
                            e40.w1(launchActivity, new u00(e40Var3, 5), false, false);
                            return;
                        }
                        e40Var3.dismiss();
                        return;
                }
            }
        });
        e40Var.R1(r10);
        e40Var.O1();
        e40Var.S1(r10);
        e40Var.T1(r10, r10);
        e40Var.G1(0.0f);
        e40Var.U1();
        e40Var.f28624b.addView(new FrameLayout(launchActivity), c8.ha.e(-1, 200, 87));
        e40Var.f45260r1.setOnClickListener(new r00(e40Var, 5));
        e40Var.V0();
        c8.ka.a(e40Var.f45246o1);
        c8.ka.a(e40Var.f45250p1);
        c8.ka.a(e40Var.f45237m1);
        c8.ka.a(e40Var.n1);
        c8.ka.a(e40Var.f45265s1);
        c8.ka.a(e40Var.f45255q1);
        c8.ka.a(e40Var.f45260r1);
        r0.i0.l(e40Var.f28624b, new t00(e40Var, 1));
    }

    public static void B1(org.telegram.messenger.r3 r3Var, boolean z9, long j3, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z9 ? 1 : 0);
        }
        if (r3Var != null) {
            ArrayList arrayList = r3Var.f25225f;
            ArrayList arrayList2 = r3Var.f25224e;
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(j3);
            if (groupCallParticipant != null) {
                r3Var.d.e(j3);
                arrayList2.remove(groupCallParticipant);
                r3Var.f25226g.remove(groupCallParticipant);
                int i7 = 0;
                while (i7 < arrayList.size()) {
                    if (org.telegram.messenger.ij.B1(((org.telegram.messenger.s3) arrayList.get(i7)).f25409a.peer) == org.telegram.messenger.ij.B1(groupCallParticipant.peer)) {
                        arrayList.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                TLRPC.GroupCall groupCall = r3Var.f25222b;
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
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25092v2, new Object[0]);
    }

    public static void I0(final e40 e40Var, Activity activity, org.telegram.messenger.r3 r3Var, View view, int i7) {
        TLRPC.Chat chat;
        final Long l10;
        boolean z9;
        final org.telegram.messenger.q3 q3Var;
        org.telegram.messenger.c cVar = e40Var.f45228k1;
        ArrayList arrayList = e40Var.f45283w2;
        y30 y30Var = e40Var.G1;
        if (view instanceof org.telegram.ui.Components.voip.r) {
            e40Var.h1(((org.telegram.ui.Components.voip.r) view).getParticipant());
        } else if (view instanceof org.telegram.ui.Cells.f4) {
            e40Var.L1((org.telegram.ui.Cells.f4) view);
        } else {
            Collection collection = null;
            if (view instanceof org.telegram.ui.Cells.y3) {
                org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
                if (y3Var.getUser() != null) {
                    if (e40Var.r1()) {
                        int i10 = i7 - y30Var.f51840n;
                        if (i10 >= 0 && i10 < e40Var.R2.f25231m.size()) {
                            l10 = (Long) e40Var.R2.f25231m.get(i7 - y30Var.f51840n);
                        } else {
                            int i11 = i7 - y30Var.f51842s;
                            if (i11 >= 0 && i11 < e40Var.R2.f25230l.size()) {
                                l10 = (Long) e40Var.R2.f25230l.get(i7 - y30Var.f51842s);
                            } else {
                                int i12 = i7 - y30Var.f51839f;
                                if (e40Var.f45225j2) {
                                    if (i12 >= 0 && i12 < arrayList.size()) {
                                        l10 = (Long) arrayList.get(i12);
                                        z9 = false;
                                    }
                                    l10 = null;
                                    z9 = false;
                                } else {
                                    if (i12 >= 0 && i12 < e40Var.R2.f25228j.size()) {
                                        l10 = (Long) e40Var.R2.f25228j.get(i12);
                                        z9 = false;
                                    }
                                    l10 = null;
                                    z9 = false;
                                }
                                if (!z9 && (q3Var = (org.telegram.messenger.q3) e40Var.R2.f25229k.get(l10)) != null) {
                                    org.telegram.ui.Components.l60 F = org.telegram.ui.Components.l60.F(e40Var.f28627c, e40Var.I0, y3Var);
                                    F.l(2131232129, org.telegram.messenger.id.M0(2131749460, null), new Runnable(e40Var) {
                                        public final e40 f43851b;

                                        {
                                            this.f43851b = e40Var;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.q3 q3Var2 = q3Var;
                                                    declineconferencecallinvite.msg_id = q3Var2.f24672a;
                                                    final e40 e40Var2 = this.f43851b;
                                                    ConnectionsManager.getInstance(e40Var2.f28621a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z10 = tLObject instanceof TLRPC.Updates;
                                                                    e40 e40Var3 = e40Var2;
                                                                    if (z10) {
                                                                        org.telegram.messenger.qp.s1(e40Var3.f28621a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        e40Var3.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    e40 e40Var4 = e40Var2;
                                                                    if (z11) {
                                                                        org.telegram.messenger.qp.s1(e40Var4.f28621a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        e40Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    org.telegram.messenger.r3 r3Var2 = e40Var2.R2;
                                                    if (r3Var2 != null) {
                                                        q3Var2.f24673b = false;
                                                        r3Var2.f25229k.put(l10, q3Var2);
                                                        e40Var2.Q0(true);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.q3 q3Var3 = q3Var;
                                                    declineconferencecallinvite2.msg_id = q3Var3.f24672a;
                                                    final e40 e40Var3 = this.f43851b;
                                                    ConnectionsManager.getInstance(e40Var3.f28621a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z10 = tLObject instanceof TLRPC.Updates;
                                                                    e40 e40Var32 = e40Var3;
                                                                    if (z10) {
                                                                        org.telegram.messenger.qp.s1(e40Var32.f28621a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        e40Var32.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    e40 e40Var4 = e40Var3;
                                                                    if (z11) {
                                                                        org.telegram.messenger.qp.s1(e40Var4.f28621a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        e40Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Integer.valueOf(q3Var3.f24672a));
                                                    org.telegram.messenger.qp.s1(e40Var3.f28621a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                                    org.telegram.messenger.r3 r3Var3 = e40Var3.R2;
                                                    if (r3Var3 != null) {
                                                        ArrayList arrayList3 = r3Var3.f25228j;
                                                        Long l11 = l10;
                                                        arrayList3.remove(l11);
                                                        e40Var3.R2.f25232n.remove(l11);
                                                        e40Var3.R2.f25229k.remove(l11);
                                                        e40Var3.Q0(true);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    }, q3Var.a());
                                    F.c(2131232328, org.telegram.messenger.id.M0(2131749471, null), new Runnable(e40Var) {
                                        public final e40 f43851b;

                                        {
                                            this.f43851b = e40Var;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.q3 q3Var2 = q3Var;
                                                    declineconferencecallinvite.msg_id = q3Var2.f24672a;
                                                    final e40 e40Var2 = this.f43851b;
                                                    ConnectionsManager.getInstance(e40Var2.f28621a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z10 = tLObject instanceof TLRPC.Updates;
                                                                    e40 e40Var32 = e40Var2;
                                                                    if (z10) {
                                                                        org.telegram.messenger.qp.s1(e40Var32.f28621a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        e40Var32.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    e40 e40Var4 = e40Var2;
                                                                    if (z11) {
                                                                        org.telegram.messenger.qp.s1(e40Var4.f28621a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        e40Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    org.telegram.messenger.r3 r3Var2 = e40Var2.R2;
                                                    if (r3Var2 != null) {
                                                        q3Var2.f24673b = false;
                                                        r3Var2.f25229k.put(l10, q3Var2);
                                                        e40Var2.Q0(true);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.q3 q3Var3 = q3Var;
                                                    declineconferencecallinvite2.msg_id = q3Var3.f24672a;
                                                    final e40 e40Var3 = this.f43851b;
                                                    ConnectionsManager.getInstance(e40Var3.f28621a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z10 = tLObject instanceof TLRPC.Updates;
                                                                    e40 e40Var32 = e40Var3;
                                                                    if (z10) {
                                                                        org.telegram.messenger.qp.s1(e40Var32.f28621a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        e40Var32.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    e40 e40Var4 = e40Var3;
                                                                    if (z11) {
                                                                        org.telegram.messenger.qp.s1(e40Var4.f28621a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        e40Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Integer.valueOf(q3Var3.f24672a));
                                                    org.telegram.messenger.qp.s1(e40Var3.f28621a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                                    org.telegram.messenger.r3 r3Var3 = e40Var3.R2;
                                                    if (r3Var3 != null) {
                                                        ArrayList arrayList3 = r3Var3.f25228j;
                                                        Long l11 = l10;
                                                        arrayList3.remove(l11);
                                                        e40Var3.R2.f25232n.remove(l11);
                                                        e40Var3.R2.f25229k.remove(l11);
                                                        e40Var3.Q0(true);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    }, false);
                                    F.W(org.telegram.ui.ActionBar.l6.e0(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), e40Var.f45270t2.getColor()));
                                    F.f35617s = 96;
                                    F.Z();
                                    return;
                                }
                                return;
                            }
                        }
                        z9 = true;
                        if (!z9) {
                            org.telegram.ui.Components.l60 F2 = org.telegram.ui.Components.l60.F(e40Var.f28627c, e40Var.I0, y3Var);
                            F2.l(2131232129, org.telegram.messenger.id.M0(2131749460, null), new Runnable(e40Var) {
                                public final e40 f43851b;

                                {
                                    this.f43851b = e40Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.q3 q3Var2 = q3Var;
                                            declineconferencecallinvite.msg_id = q3Var2.f24672a;
                                            final e40 e40Var2 = this.f43851b;
                                            ConnectionsManager.getInstance(e40Var2.f28621a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z10 = tLObject instanceof TLRPC.Updates;
                                                            e40 e40Var32 = e40Var2;
                                                            if (z10) {
                                                                org.telegram.messenger.qp.s1(e40Var32.f28621a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                e40Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            e40 e40Var4 = e40Var2;
                                                            if (z11) {
                                                                org.telegram.messenger.qp.s1(e40Var4.f28621a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                e40Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            org.telegram.messenger.r3 r3Var2 = e40Var2.R2;
                                            if (r3Var2 != null) {
                                                q3Var2.f24673b = false;
                                                r3Var2.f25229k.put(l10, q3Var2);
                                                e40Var2.Q0(true);
                                                return;
                                            }
                                            return;
                                        default:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.q3 q3Var3 = q3Var;
                                            declineconferencecallinvite2.msg_id = q3Var3.f24672a;
                                            final e40 e40Var3 = this.f43851b;
                                            ConnectionsManager.getInstance(e40Var3.f28621a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z10 = tLObject instanceof TLRPC.Updates;
                                                            e40 e40Var32 = e40Var3;
                                                            if (z10) {
                                                                org.telegram.messenger.qp.s1(e40Var32.f28621a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                e40Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            e40 e40Var4 = e40Var3;
                                                            if (z11) {
                                                                org.telegram.messenger.qp.s1(e40Var4.f28621a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                e40Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(Integer.valueOf(q3Var3.f24672a));
                                            org.telegram.messenger.qp.s1(e40Var3.f28621a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                            org.telegram.messenger.r3 r3Var3 = e40Var3.R2;
                                            if (r3Var3 != null) {
                                                ArrayList arrayList3 = r3Var3.f25228j;
                                                Long l11 = l10;
                                                arrayList3.remove(l11);
                                                e40Var3.R2.f25232n.remove(l11);
                                                e40Var3.R2.f25229k.remove(l11);
                                                e40Var3.Q0(true);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, q3Var.a());
                            F2.c(2131232328, org.telegram.messenger.id.M0(2131749471, null), new Runnable(e40Var) {
                                public final e40 f43851b;

                                {
                                    this.f43851b = e40Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.q3 q3Var2 = q3Var;
                                            declineconferencecallinvite.msg_id = q3Var2.f24672a;
                                            final e40 e40Var2 = this.f43851b;
                                            ConnectionsManager.getInstance(e40Var2.f28621a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z10 = tLObject instanceof TLRPC.Updates;
                                                            e40 e40Var32 = e40Var2;
                                                            if (z10) {
                                                                org.telegram.messenger.qp.s1(e40Var32.f28621a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                e40Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            e40 e40Var4 = e40Var2;
                                                            if (z11) {
                                                                org.telegram.messenger.qp.s1(e40Var4.f28621a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                e40Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            org.telegram.messenger.r3 r3Var2 = e40Var2.R2;
                                            if (r3Var2 != null) {
                                                q3Var2.f24673b = false;
                                                r3Var2.f25229k.put(l10, q3Var2);
                                                e40Var2.Q0(true);
                                                return;
                                            }
                                            return;
                                        default:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.q3 q3Var3 = q3Var;
                                            declineconferencecallinvite2.msg_id = q3Var3.f24672a;
                                            final e40 e40Var3 = this.f43851b;
                                            ConnectionsManager.getInstance(e40Var3.f28621a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z10 = tLObject instanceof TLRPC.Updates;
                                                            e40 e40Var32 = e40Var3;
                                                            if (z10) {
                                                                org.telegram.messenger.qp.s1(e40Var32.f28621a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                e40Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            e40 e40Var4 = e40Var3;
                                                            if (z11) {
                                                                org.telegram.messenger.qp.s1(e40Var4.f28621a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                e40Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(Integer.valueOf(q3Var3.f24672a));
                                            org.telegram.messenger.qp.s1(e40Var3.f28621a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                            org.telegram.messenger.r3 r3Var3 = e40Var3.R2;
                                            if (r3Var3 != null) {
                                                ArrayList arrayList3 = r3Var3.f25228j;
                                                Long l11 = l10;
                                                arrayList3.remove(l11);
                                                e40Var3.R2.f25232n.remove(l11);
                                                e40Var3.R2.f25229k.remove(l11);
                                                e40Var3.Q0(true);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, false);
                            F2.W(org.telegram.ui.ActionBar.l6.e0(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), e40Var.f45270t2.getColor()));
                            F2.f35617s = 96;
                            F2.Z();
                            return;
                        }
                        return;
                    }
                    e40Var.Z1.O0(e40Var.f28621a);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", y3Var.getUser().f27105id);
                    if (y3Var.f30926a.getImageReceiver().L()) {
                        bundle.putBoolean("expandPhoto", true);
                    }
                    e40Var.Z1.t0(new ProfileActivity(bundle, null));
                    e40Var.dismiss();
                }
            } else if (i7 == y30Var.f51844x) {
                if (org.telegram.messenger.t3.T(e40Var.Q2) && (chat = e40Var.Q2) != null && !chat.megagroup && org.telegram.messenger.t3.t0(chat)) {
                    e40Var.m1(false);
                    return;
                }
                TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(cVar.f21765a).N0(e40Var.l1());
                if (N0 != null) {
                    e40Var.f45242n2 = false;
                    Context context = e40Var.getContext();
                    int i13 = cVar.f21765a;
                    TLRPC.Chat chat2 = e40Var.Q2;
                    org.telegram.messenger.r3 r3Var2 = e40Var.R2;
                    org.telegram.ui.Components.i20 i20Var = new org.telegram.ui.Components.i20(context, i13, chat2, N0, r3Var2.d, r3Var2.f25232n);
                    e40Var.f45280v3 = i20Var;
                    i20Var.setOnDismissListener(new y00(e40Var, 2));
                    org.telegram.ui.Components.i20 i20Var2 = e40Var.f45280v3;
                    i20Var2.X1 = new j10(e40Var);
                    i20Var2.show();
                }
            } else if (i7 == y30Var.f51845y) {
                org.telegram.messenger.r3 r3Var3 = e40Var.R2;
                if (r3Var3 != null && r3Var3.f25222b != null) {
                    wg.f1 f1Var = new wg.f1(activity, e40Var.f28621a, null, 4, new di.i0());
                    org.telegram.messenger.r3 r3Var4 = e40Var.R2;
                    if (r3Var4 != null) {
                        collection = (Collection) Collection.EL.stream(r3Var4.f25224e).map(new aa.l(12)).collect(Collectors.toSet());
                    }
                    f1Var.f57745u2.addAll(collection);
                    f1Var.o1(false, true);
                    f1Var.f57743s2 = new u00(e40Var, 3);
                    f1Var.o1(false, true);
                    f1Var.f57746v2 = new bi.p5(17, e40Var, r3Var);
                    f1Var.show();
                }
            } else if (i7 == y30Var.D) {
                e40Var.A1();
            }
        }
    }

    public static void J0(e40 e40Var, org.telegram.ui.Components.voip.r rVar, boolean z9) {
        if (!e40Var.I) {
            if (z9 && rVar.getRenderer() == null) {
                rVar.setRenderer(org.telegram.ui.Components.voip.y.c(e40Var.P3, e40Var.R3, rVar, null, null, rVar.getParticipant(), e40Var.R2, e40Var));
            } else if (!z9 && rVar.getRenderer() != null) {
                rVar.getRenderer().setPrimaryView(null);
                rVar.setRenderer(null);
            }
        }
    }

    public static void K0(e40 e40Var, int i7, int[] iArr) {
        if (e40Var.u1()) {
            int i10 = org.telegram.ui.ActionBar.l6.f28267yh;
            iArr[0] = org.telegram.ui.ActionBar.l6.x0(null, i10, false);
            iArr[1] = org.telegram.messenger.g0.S0(e40Var.L3, 1.0f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28285zh, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28057nh, false));
            iArr[2] = org.telegram.messenger.g0.S0(e40Var.L3, 1.0f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Yg, false), org.telegram.ui.ActionBar.l6.x0(null, i10, false));
        } else if (i7 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28248xh, false);
            iArr[1] = org.telegram.messenger.g0.S0(e40Var.L3, 1.0f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28039mh, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28057nh, false));
            iArr[2] = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28022lh, false);
        } else if (i7 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28192uh, false);
            iArr[1] = org.telegram.messenger.g0.S0(e40Var.L3, 1.0f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28096ph, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28115qh, false));
            iArr[2] = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28076oh, false);
        } else if (s1(i7)) {
            iArr[0] = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Yh, false);
            iArr[1] = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Zh, false);
            iArr[2] = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27820ai, false);
        } else {
            int i11 = org.telegram.ui.ActionBar.l6.f28267yh;
            iArr[0] = org.telegram.ui.ActionBar.l6.x0(null, i11, false);
            iArr[1] = org.telegram.messenger.g0.S0(e40Var.L3, 1.0f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ah, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Bh, false));
            iArr[2] = org.telegram.messenger.g0.S0(e40Var.L3, 1.0f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Yg, false), org.telegram.ui.ActionBar.l6.x0(null, i11, false));
        }
        if (s1(i7)) {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Wh, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Yh, false));
        } else if (i7 == 1) {
            iArr[3] = i0.a.f(0.75f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28096ph, false), i0.a.f(0.5f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28172th, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28210vh, false)));
        } else {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28248xh, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28229wh, false));
        }
    }

    public static void K1(org.telegram.ui.ActionBar.z0 z0Var, int i7) {
        if (z0Var != null) {
            z0Var.d(i7, i7);
        }
    }

    public static String L0() {
        String[] strArr = org.telegram.messenger.j6.f23507i[(int) Math.floor(Math.random() * 8)];
        return strArr[(int) Math.floor(Math.random() * strArr.length)];
    }

    public static void M0(e40 e40Var) {
        org.telegram.messenger.r3 r3Var = e40Var.R2;
        if (r3Var != null && r3Var.f25222b != null) {
            TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
            org.telegram.messenger.r3 r3Var2 = e40Var.R2;
            togglegroupcallsettings.call = r3Var2.g(r3Var2.f25221a);
            togglegroupcallsettings.join_muted = Boolean.valueOf(e40Var.R2.f25222b.join_muted);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(e40Var.f45228k1.f21765a);
            org.telegram.messenger.p5 p5Var = Utilities.d;
            Objects.requireNonNull(p5Var);
            connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.v3(p5Var), new d10(e40Var, 1));
        }
    }

    public static void N0(e40 e40Var, boolean z9) {
        if (e40Var.R2 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        org.telegram.messenger.r3 r3Var = e40Var.R2;
        togglegroupcallsettings.call = r3Var.g(r3Var.f25221a);
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z9);
        e40Var.f45249o5 = Boolean.valueOf(z9);
        e40Var.N1(true);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(e40Var.f45228k1.f21765a);
        org.telegram.messenger.p5 p5Var = Utilities.d;
        Objects.requireNonNull(p5Var);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.v3(p5Var), new d10(e40Var, 0));
    }

    public static int O0(e40 e40Var, int i7) {
        n10 n10Var = e40Var.l1;
        org.telegram.ui.Components.voip.r g12 = e40Var.g1();
        if (g12 == null) {
            return Integer.MIN_VALUE;
        }
        int measuredHeight = ((n10Var.getMeasuredHeight() / 2) + n10Var.getTop()) - (e40Var.f45255q1.getMeasuredHeight() / 2);
        int measuredHeight2 = g12.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
        return jg.g.D(measuredHeight, measuredHeight2, 2, measuredHeight2) - org.telegram.messenger.g0.L(32.0f);
    }

    public static void P0(e40 e40Var) {
        boolean z9;
        Integer num;
        boolean z10;
        float f10;
        float f11;
        float L;
        float L2;
        float L3;
        float f12;
        float f13;
        float f14;
        boolean z11;
        View childAt;
        b30 b30Var = e40Var.F1;
        m30 m30Var = e40Var.H1;
        int childCount = m30Var.getChildCount();
        float f15 = 2.1474836E9f;
        for (int i7 = 0; i7 < childCount; i7++) {
            if (RecyclerView.R(m30Var.getChildAt(i7)) >= 0) {
                f15 = Math.min(f15, childAt.getTop());
            }
        }
        if (f15 < 0.0f || f15 == 2.1474836E9f) {
            if (childCount != 0) {
                f15 = 0.0f;
            } else {
                f15 = m30Var.getPaddingTop();
            }
        }
        if (f15 <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(14.0f)) {
            z9 = true;
        } else {
            z9 = false;
        }
        float L4 = f15 + org.telegram.messenger.g0.L(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if ((z9 && b30Var.getTag() == null) || (!z9 && b30Var.getTag() != null)) {
            if (z9) {
                num = 1;
            } else {
                num = null;
            }
            b30Var.setTag(num);
            AnimatorSet animatorSet = e40Var.Y1;
            if (animatorSet != null) {
                animatorSet.cancel();
                e40Var.Y1 = null;
            }
            if (b30Var.getTag() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            e40Var.G0(z10);
            ViewPropertyAnimator animate = b30Var.getBackButton().animate();
            float f16 = 0.9f;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.9f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f10);
            if (z9) {
                f16 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f16);
            if (z9) {
                f11 = 0.0f;
            } else {
                f11 = -org.telegram.messenger.g0.L(14.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationX(f11).setDuration(300L);
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40458f;
            duration.setInterpolator(xqVar).start();
            ViewPropertyAnimator animate2 = b30Var.getTitleTextView().animate();
            if (z9) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(23.0f);
            }
            animate2.translationY(L).setDuration(300L).setInterpolator(xqVar).start();
            ObjectAnimator objectAnimator = e40Var.L4;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                e40Var.L4.cancel();
            }
            org.telegram.ui.ActionBar.l5 subtitleTextView = b30Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            float translationY = b30Var.getSubtitleTextView().getTranslationY();
            if (z9) {
                L2 = 0.0f;
            } else {
                L2 = org.telegram.messenger.g0.L(20.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, property, translationY, L2);
            e40Var.L4 = ofFloat;
            ofFloat.setDuration(300L);
            e40Var.L4.setInterpolator(xqVar);
            e40Var.L4.addListener(new org.telegram.ui.Components.t9(29, e40Var, z9));
            e40Var.L4.start();
            ObjectAnimator objectAnimator2 = e40Var.M4;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            org.telegram.ui.ActionBar.l5 additionalSubtitleTextView = b30Var.getAdditionalSubtitleTextView();
            if (z9) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.g0.L(20.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(additionalSubtitleTextView, property, L3);
            e40Var.M4 = ofFloat2;
            ofFloat2.setDuration(300L);
            e40Var.M4.setInterpolator(xqVar);
            e40Var.M4.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            e40Var.Y1 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = e40Var.Y1;
            Property property2 = View.ALPHA;
            if (z9) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(b30Var, property2, f12);
            u10 u10Var = e40Var.E1;
            if (z9) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(u10Var, property2, f13);
            View view = e40Var.X1;
            if (z9) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, property2, f14));
            e40Var.Y1.addListener(new z20(e40Var, 1));
            e40Var.Y1.start();
            ImageView imageView = e40Var.R3.f39409w;
            if (z9 && !f45184w5) {
                z11 = false;
            } else {
                z11 = true;
            }
            imageView.setClickable(z11);
        }
        if (e40Var.f45251p2 != L4) {
            e40Var.J1(L4);
        }
    }

    public static void e1(LaunchActivity launchActivity, org.telegram.messenger.c cVar, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z9, String str) {
        if (f45182u5 == null) {
            if (inputPeer != null || VoIPService.getSharedInstance() != null) {
                if (inputPeer != null) {
                    f45182u5 = new e40(launchActivity, cVar, org.telegram.messenger.qp.s1(cVar.f21765a).g1(chat.f26956id, false, null), chat, inputPeer, z9, str);
                } else {
                    org.telegram.messenger.r3 r3Var = VoIPService.getSharedInstance().groupCall;
                    if (r3Var != null) {
                        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(cVar.f21765a).M0(Long.valueOf(r3Var.f25223c));
                        r3Var.b(true);
                        f45182u5 = new e40(launchActivity, cVar, r3Var, M0, null, z9, str);
                    } else {
                        return;
                    }
                }
                f45182u5.Z1 = launchActivity;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.vs(17));
            }
        }
    }

    public static String i1(int i7) {
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
                return org.telegram.messenger.id.M0(2131743503, null);
            } else if (sharedInstance != null && sharedInstance.isHeadsetPlugged()) {
                return org.telegram.messenger.id.M0(2131743501, null);
            } else {
                return org.telegram.messenger.id.M0(2131743500, null);
            }
        }
        return org.telegram.messenger.id.M0(2131743499, null);
    }

    public static String j1(int i7) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i7 == 2) {
            if (sharedInstance != null && (str = sharedInstance.currentBluetoothDeviceName) != null) {
                return org.telegram.messenger.id.a0(null, null, 2131743497, str);
            }
            return org.telegram.messenger.id.M0(2131743498, null);
        } else if (i7 == 1) {
            if (sharedInstance != null && sharedInstance.isHeadsetPlugged()) {
                return org.telegram.messenger.id.M0(2131743496, null);
            }
            return org.telegram.messenger.id.M0(2131743495, null);
        } else {
            return org.telegram.messenger.id.M0(2131743494, null);
        }
    }

    public static boolean s1(int i7) {
        if ((VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.f25222b.rtmp_stream) && i7 != 2 && i7 != 4 && i7 != 5 && i7 != 6 && i7 != 7) {
            return false;
        }
        return true;
    }

    public static void w1(Context context, Runnable runnable, boolean z9, boolean z10) {
        int L;
        int L2;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
            long selfId = sharedInstance.getSelfId();
            if (!z10 && org.telegram.messenger.t3.w(14, chat)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                boolean isConference = sharedInstance.isConference();
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                if (isConference) {
                    u1Var.R = org.telegram.messenger.id.M0(2131743468, null);
                    u1Var.T = org.telegram.messenger.id.M0(2131743469, null);
                } else if (org.telegram.messenger.t3.W(chat)) {
                    u1Var.R = org.telegram.messenger.id.M0(2131743471, null);
                    u1Var.T = org.telegram.messenger.id.M0(2131743472, null);
                } else {
                    u1Var.R = org.telegram.messenger.id.M0(2131743361, null);
                    u1Var.T = org.telegram.messenger.id.M0(2131743362, null);
                }
                sharedInstance.getAccount();
                org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
                LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                if (!sharedInstance.isConference() || (r3Var != null && (groupCall = r3Var.f25222b) != null && groupCall.creator)) {
                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(context, 1);
                    c2VarArr[0] = c2Var;
                    c2Var.setBackground(org.telegram.ui.ActionBar.l6.N0(false));
                    if (z9) {
                        c2VarArr[0].setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27973j5, false));
                    } else {
                        c2VarArr[0].setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Vg, false));
                        CheckBoxSquare checkBoxSquare = (CheckBoxSquare) c2VarArr[0].getCheckBoxView();
                        int i7 = org.telegram.ui.ActionBar.l6.f27911fh;
                        int i10 = org.telegram.ui.ActionBar.l6.f27875dh;
                        int i11 = org.telegram.ui.ActionBar.l6.f27838bh;
                        checkBoxSquare.f31284s = i7;
                        checkBoxSquare.f31285w = i10;
                        checkBoxSquare.f31286x = i11;
                        checkBoxSquare.invalidate();
                    }
                    c2VarArr[0].setTag(0);
                    if (sharedInstance.isConference()) {
                        c2VarArr[0].e(org.telegram.messenger.id.M0(2131743470, null), "", false, false, false);
                    } else if (org.telegram.messenger.t3.W(chat)) {
                        c2VarArr[0].e(org.telegram.messenger.id.M0(2131743473, null), "", false, false, false);
                    } else {
                        c2VarArr[0].e(org.telegram.messenger.id.M0(2131743363, null), "", false, false, false);
                    }
                    org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[0];
                    if (org.telegram.messenger.id.f23157a0) {
                        L = org.telegram.messenger.g0.L(16.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(8.0f);
                    }
                    if (org.telegram.messenger.id.f23157a0) {
                        L2 = org.telegram.messenger.g0.L(8.0f);
                    } else {
                        L2 = org.telegram.messenger.g0.L(16.0f);
                    }
                    c2Var2.setPadding(L, 0, L2, 0);
                    f10.addView(c2VarArr[0], c8.ha.o(-1, -2));
                    c2VarArr[0].setOnClickListener(new a10(c2VarArr, 0));
                }
                alertDialog$Builder.o(f10);
                u1Var.I = org.telegram.ui.ActionBar.l6.f27875dh;
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131743364, null), new bg.e0(r3Var, c2VarArr, selfId, runnable, 4));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                if (z9) {
                    u1Var.P0 = false;
                }
                if (z9) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        u1Var.getWindow().setType(2038);
                    } else {
                        u1Var.getWindow().setType(2003);
                    }
                    u1Var.getWindow().clearFlags(2);
                }
                if (!z9) {
                    u1Var.j(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27966ih, false));
                }
                u1Var.show();
                if (!z9) {
                    TextView textView = (TextView) u1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f27985jh, null);
                    }
                    u1Var.p(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Vg, false));
                    return;
                }
                return;
            }
            B1(r3Var, false, selfId, runnable);
        }
    }

    public final void A1() {
        org.telegram.messenger.r3 r3Var = this.R2;
        if (r3Var != null && r3Var.f25222b != null) {
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, getContext(), null);
            u1Var.r(300L);
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = this.R2.f25222b;
            tL_inputGroupCall.f26973id = groupCall.f26966id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(this.f28621a).sendRequest(exportgroupcallinvite, new z9(this, u1Var, exportgroupcallinvite, 12));
        }
    }

    public final void C1(TLRPC.GroupCallParticipant groupCallParticipant, final long j3, int i7) {
        TLObject M0;
        int i10;
        int i11;
        String str;
        int i12;
        String str2;
        int i13;
        int i14;
        int i15;
        ?? r13;
        TextView textView;
        int i16;
        int i17;
        String str3;
        String str4;
        ?? r132;
        int i18;
        int i19;
        int i20;
        String str5;
        int i21;
        EditText editText;
        int i22;
        String str6;
        float f10;
        String M02;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int L;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i28 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            org.telegram.messenger.c cVar = this.f45228k1;
            if (i28 > 0) {
                M0 = org.telegram.messenger.qp.s1(cVar.f21765a).a2(Long.valueOf(j3));
            } else {
                M0 = org.telegram.messenger.qp.s1(cVar.f21765a).M0(Long.valueOf(-j3));
            }
            TLObject tLObject = M0;
            boolean z9 = true;
            if (i7 != 0 && i7 != 2 && i7 != 3) {
                if (i7 == 6) {
                    this.Z1.O0(this.f28621a);
                    Bundle bundle = new Bundle();
                    if (i28 > 0) {
                        bundle.putLong("user_id", j3);
                    } else {
                        bundle.putLong("chat_id", -j3);
                    }
                    this.Z1.t0(new cn(bundle));
                    dismiss();
                } else if (i7 == 8) {
                    this.Z1.O0(this.f28621a);
                    org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.Z1.M().getFragmentStack().get(this.Z1.M().getFragmentStack().size() - 1);
                    if ((f2Var instanceof cn) && ((cn) f2Var).a() == j3) {
                        dismiss();
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    if (i28 > 0) {
                        bundle2.putLong("user_id", j3);
                    } else {
                        bundle2.putLong("chat_id", -j3);
                    }
                    this.Z1.t0(new cn(bundle2));
                    dismiss();
                } else if (i7 == 7) {
                    sharedInstance.editCallMember(tLObject, Boolean.TRUE, null, null, Boolean.FALSE, null);
                    P1(2, true);
                } else if (i7 == 9) {
                    org.telegram.ui.Components.k30 k30Var = this.Y3;
                    if (k30Var == null || !k30Var.g()) {
                        TLRPC.User f11 = org.telegram.messenger.p10.i(cVar.f21765a).f();
                        org.telegram.ui.Components.k30 k30Var2 = new org.telegram.ui.Components.k30(0, true, true);
                        this.Y3 = k30Var2;
                        k30Var2.H = true;
                        k30Var2.R = true;
                        k30Var2.G = true;
                        k30Var2.J = true;
                        k30Var2.S = true;
                        k30Var2.f35218a = this.Z1.M().getLastFragment();
                        org.telegram.ui.Components.k30 k30Var3 = this.Y3;
                        n30 n30Var = new n30(this, j3);
                        this.Z3 = n30Var;
                        k30Var3.f35219b = n30Var;
                        TLRPC.UserProfilePhoto userProfilePhoto = f11.photo;
                        if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                            z9 = false;
                        }
                        k30Var3.n(z9, new u00(this, 8), new fi.d1(5), 0);
                    }
                } else if (i7 == 10) {
                    String str7 = groupCallParticipant.about;
                    Context context = getContext();
                    int i29 = this.f28621a;
                    Pattern pattern = org.telegram.ui.Components.v4.f38913a;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                    int i30 = 2131743765;
                    if (i28 > 0) {
                        str6 = null;
                        f10 = 8.0f;
                        M02 = org.telegram.messenger.id.M0(2131743765, null);
                    } else {
                        str6 = null;
                        f10 = 8.0f;
                        M02 = org.telegram.messenger.id.M0(2131751459, null);
                    }
                    String str8 = M02;
                    final org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.R = str8;
                    if (i28 > 0) {
                        i23 = 2131743396;
                    } else {
                        i23 = 2131751462;
                    }
                    u1Var.T = org.telegram.messenger.id.M0(i23, str6);
                    FrameLayout frameLayout = new FrameLayout(context);
                    frameLayout.setClipChildren(false);
                    if (i28 < 0) {
                        i24 = i28;
                        long j10 = -j3;
                        if (org.telegram.messenger.qp.s1(i29).N0(j10) == null) {
                            org.telegram.messenger.qp.s1(i29).V2(ConnectionsManager.generateClassGuid(), j10, true);
                        }
                    } else {
                        i24 = i28;
                    }
                    NumberTextView numberTextView = new NumberTextView(context);
                    EditText editText2 = new EditText(context);
                    int i31 = org.telegram.ui.ActionBar.l6.Vg;
                    org.telegram.ui.ActionBar.s6.U(editText2, i31, null);
                    if (i24 <= 0) {
                        i30 = 2131751459;
                    }
                    editText2.setHint(org.telegram.messenger.id.M0(i30, null));
                    editText2.setTextSize(1, 16.0f);
                    editText2.setBackground(org.telegram.ui.ActionBar.l6.U(context));
                    editText2.setMaxLines(4);
                    editText2.setRawInputType(147457);
                    editText2.setImeOptions(6);
                    if (i24 > 0) {
                        i25 = 70;
                    } else {
                        i25 = 255;
                    }
                    editText2.setFilters(new InputFilter[]{new org.telegram.ui.Components.m3(i25, context, numberTextView)});
                    numberTextView.setCenterAlign(true);
                    numberTextView.setTextSize(15);
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.B6, false));
                    numberTextView.setImportantForAccessibility(2);
                    if (org.telegram.messenger.id.f23157a0) {
                        i26 = 3;
                    } else {
                        i26 = 5;
                    }
                    frameLayout.addView(numberTextView, c8.ha.d(20, 20.0f, i26, 0.0f, 14.0f, 21.0f, 0.0f));
                    if (org.telegram.messenger.id.f23157a0) {
                        i27 = org.telegram.messenger.g0.L(24.0f);
                    } else {
                        i27 = 0;
                    }
                    int L2 = org.telegram.messenger.g0.L(f10);
                    if (org.telegram.messenger.id.f23157a0) {
                        L = 0;
                    } else {
                        L = org.telegram.messenger.g0.L(24.0f);
                    }
                    editText2.setPadding(i27, L2, L, org.telegram.messenger.g0.L(f10));
                    editText2.addTextChangedListener(new org.telegram.ui.Components.sp(i25, numberTextView));
                    org.telegram.messenger.g0.Z3(numberTextView, false, 0.0f, true, false);
                    editText2.setText(str7);
                    editText2.setSelection(editText2.getText().toString().length());
                    alertDialog$Builder.o(frameLayout);
                    final c4.n nVar = new c4.n(j3, i29, editText2, 3);
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131745946, null), nVar);
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    u1Var.N = new org.telegram.ui.Components.i1(editText2, 1);
                    frameLayout.addView(editText2, c8.ha.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
                    editText2.requestFocus();
                    org.telegram.messenger.g0.K3(editText2);
                    editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                        @Override
                        public final boolean onEditorAction(TextView textView2, int i32, KeyEvent keyEvent) {
                            if (i32 == 6 || (j3 > 0 && keyEvent.getKeyCode() == 66)) {
                                org.telegram.ui.ActionBar.u1 u1Var2 = u1Var;
                                if (u1Var2.isShowing()) {
                                    nVar.g(u1Var2, 0);
                                    return true;
                                }
                            }
                            return false;
                        }
                    });
                    u1Var.j(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27966ih, false));
                    u1Var.show();
                    u1Var.p(org.telegram.ui.ActionBar.l6.x0(null, i31, false));
                } else if (i7 == 11) {
                    Context context2 = getContext();
                    int i32 = this.f28621a;
                    Pattern pattern2 = org.telegram.ui.Components.v4.f38913a;
                    if (org.telegram.messenger.m5.E(j3)) {
                        TLRPC.User a22 = org.telegram.messenger.qp.s1(i32).a2(Long.valueOf(j3));
                        str3 = a22.first_name;
                        str4 = a22.last_name;
                    } else {
                        str3 = org.telegram.messenger.qp.s1(i32).M0(Long.valueOf(-j3)).title;
                        str4 = null;
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                    if (i28 > 0) {
                        i18 = 2131743415;
                        r132 = 0;
                    } else {
                        r132 = 0;
                        i18 = 2131743414;
                    }
                    String M03 = org.telegram.messenger.id.M0(i18, r132);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                    u1Var2.R = M03;
                    LinearLayout f12 = org.telegram.messenger.k5.f(context2, 1);
                    EditText editText3 = new EditText(context2);
                    int i33 = org.telegram.ui.ActionBar.l6.Vg;
                    org.telegram.ui.ActionBar.s6.U(editText3, i33, r132);
                    editText3.setTextSize(1, 16.0f);
                    editText3.setMaxLines(1);
                    editText3.setLines(1);
                    editText3.setSingleLine(true);
                    if (org.telegram.messenger.id.f23157a0) {
                        i19 = 5;
                    } else {
                        i19 = 3;
                    }
                    editText3.setGravity(i19);
                    editText3.setInputType(49152);
                    if (i28 > 0) {
                        i20 = 5;
                    } else {
                        i20 = 6;
                    }
                    editText3.setImeOptions(i20);
                    if (i28 > 0) {
                        i21 = 2131750694;
                        str5 = null;
                    } else {
                        str5 = null;
                        i21 = 2131743413;
                    }
                    editText3.setHint(org.telegram.messenger.id.M0(i21, str5));
                    editText3.setBackground(org.telegram.ui.ActionBar.l6.U(context2));
                    editText3.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                    editText3.requestFocus();
                    if (i28 > 0) {
                        editText = new EditText(context2);
                        org.telegram.ui.ActionBar.s6.U(editText, i33, null);
                        editText.setTextSize(1, 16.0f);
                        editText.setMaxLines(1);
                        editText.setLines(1);
                        editText.setSingleLine(true);
                        if (org.telegram.messenger.id.f23157a0) {
                            i22 = 5;
                        } else {
                            i22 = 3;
                        }
                        editText.setGravity(i22);
                        editText.setInputType(49152);
                        editText.setImeOptions(6);
                        editText.setHint(org.telegram.messenger.id.M0(2131749032, null));
                        editText.setBackground(org.telegram.ui.ActionBar.l6.U(context2));
                        editText.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                    } else {
                        editText = null;
                    }
                    org.telegram.messenger.g0.K3(editText3);
                    f12.addView(editText3, c8.ha.t(-1, -2, 0, 23, 12, 23, 21));
                    if (editText != null) {
                        f12.addView(editText, c8.ha.t(-1, -2, 0, 23, 12, 23, 21));
                    }
                    editText3.setText(str3);
                    editText3.setSelection(editText3.getText().toString().length());
                    if (editText != null) {
                        editText.setText(str4);
                        editText.setSelection(editText.getText().toString().length());
                    }
                    alertDialog$Builder2.o(f12);
                    org.telegram.ui.ActionBar.r1 n1Var = new hi.n1(editText3, j3, i32, editText);
                    alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131745946, null), n1Var);
                    alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    u1Var2.N = new bi.u3(7, editText3, editText);
                    u1Var2.j(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27966ih, false));
                    u1Var2.show();
                    u1Var2.p(org.telegram.ui.ActionBar.l6.x0(null, i33, false));
                    nd ndVar = new nd(1, u1Var2, n1Var);
                    if (editText != null) {
                        editText.setOnEditorActionListener(ndVar);
                    } else {
                        editText3.setOnEditorActionListener(ndVar);
                    }
                } else if (i7 == 5) {
                    sharedInstance.editCallMember(tLObject, Boolean.TRUE, null, null, null, null);
                    n1().m(0L, tLObject, 35);
                    sharedInstance.setParticipantVolume(groupCallParticipant, 0);
                } else {
                    if ((groupCallParticipant.flags & 128) != 0 && groupCallParticipant.volume == 0) {
                        groupCallParticipant.volume = 10000;
                        groupCallParticipant.volume_by_admin = false;
                        i16 = 1;
                        sharedInstance.editCallMember(tLObject, Boolean.FALSE, null, 10000, null, null);
                    } else {
                        i16 = 1;
                        sharedInstance.editCallMember(tLObject, Boolean.FALSE, null, null, null, null);
                    }
                    sharedInstance.setParticipantVolume(groupCallParticipant, org.telegram.messenger.t3.H(groupCallParticipant));
                    UndoView n1 = n1();
                    if (i7 == i16) {
                        i17 = 31;
                    } else {
                        i17 = 36;
                    }
                    n1.k(0L, i17, tLObject, null, null, null);
                }
            } else if (i7 == 0) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().editCallMember(tLObject, Boolean.TRUE, null, null, null, null);
                    n1().k(0L, 30, tLObject, null, null, null);
                }
            } else {
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext());
                int i34 = org.telegram.ui.ActionBar.l6.f27875dh;
                org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.f27296a;
                u1Var3.I = i34;
                TextView textView2 = new TextView(getContext());
                int i35 = org.telegram.ui.ActionBar.l6.Vg;
                org.telegram.ui.ActionBar.s6.U(textView2, i35, null);
                textView2.setTextSize(1, 16.0f);
                if (org.telegram.messenger.id.f23157a0) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView2.setGravity(i10 | 48);
                FrameLayout frameLayout2 = new FrameLayout(getContext());
                alertDialog$Builder3.o(frameLayout2);
                org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
                w8Var.u(org.telegram.messenger.g0.L(12.0f));
                org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(getContext());
                l9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
                if (org.telegram.messenger.id.f23157a0) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                frameLayout2.addView(l9Var, c8.ha.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                w8Var.p(tLObject);
                boolean z10 = tLObject instanceof TLRPC.User;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    l9Var.e(user, w8Var);
                    str = org.telegram.messenger.t10.j(user, true);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    l9Var.e(chat, w8Var);
                    str = chat.title;
                }
                TextView textView3 = new TextView(getContext());
                org.telegram.messenger.k5.n(textView3, i35, null, 1, 20.0f);
                textView3.setLines(1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                if (org.telegram.messenger.id.f23157a0) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView3.setGravity(i12 | 16);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                TLRPC.Chat chat2 = this.Q2;
                if (chat2 != null) {
                    str2 = chat2.title;
                } else {
                    str2 = "";
                }
                if (i7 == 2) {
                    if (r1()) {
                        textView3.setText(org.telegram.messenger.id.M0(2131743421, null));
                        org.telegram.messenger.k5.r(null, null, 2131743422, new Object[]{str}, textView2);
                    } else {
                        textView3.setText(org.telegram.messenger.id.M0(2131743345, null));
                        if (org.telegram.messenger.t3.W(this.Q2)) {
                            org.telegram.messenger.k5.r(null, null, 2131743464, new Object[]{str, str2}, textView2);
                        } else {
                            org.telegram.messenger.k5.r(null, null, 2131743346, new Object[]{str, str2}, textView2);
                        }
                    }
                } else {
                    textView3.setText(org.telegram.messenger.id.M0(2131743402, null));
                    org.telegram.messenger.k5.r(null, null, 2131743403, new Object[]{str, str2}, textView2);
                }
                boolean z11 = org.telegram.messenger.id.f23157a0;
                if (z11) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                int i36 = i13 | 48;
                int i37 = 76;
                if (z11) {
                    i14 = 21;
                } else {
                    i14 = 76;
                }
                float f13 = i14;
                if (!z11) {
                    i37 = 21;
                }
                frameLayout2.addView(textView3, c8.ha.d(-1, -2.0f, i36, f13, 11.0f, i37, 0.0f));
                if (org.telegram.messenger.id.f23157a0) {
                    i15 = 5;
                } else {
                    i15 = 3;
                }
                frameLayout2.addView(textView2, c8.ha.d(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                if (i7 == 2) {
                    r13 = 0;
                    alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131743311, null), new ru(5, this, tLObject));
                } else {
                    r13 = 0;
                    r13 = 0;
                    if (z10) {
                        alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131743404, null), new bi.i(this, (TLRPC.User) tLObject, j3, 6));
                    }
                }
                alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, r13), r13);
                u1Var3.j(org.telegram.ui.ActionBar.l6.x0(r13, org.telegram.ui.ActionBar.l6.f27966ih, false));
                u1Var3.show();
                if (i7 == 2 && (textView = (TextView) u1Var3.d(-1)) != null) {
                    org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f27985jh, r13);
                }
            }
        }
    }

    public final void D1(boolean r18, org.telegram.ui.Cells.f4 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e40.D1(boolean, org.telegram.ui.Cells.f4):void");
    }

    public final void E1() {
        m4 m4Var = this.f45263r4;
        org.telegram.messenger.g0.r(m4Var);
        if (this.f45258q4 && this.L2 != null && VoIPService.getSharedInstance() != null && u1() && this.H1 != null && org.telegram.messenger.sc.e(512)) {
            org.telegram.messenger.g0.i3(m4Var, 30L);
        }
    }

    public final void F1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall g10;
        long j3;
        this.f45290y1.setText("");
        org.telegram.messenger.r3 r3Var = this.R2;
        if (r3Var != null && r3Var.f25222b != null && (g10 = r3Var.g(r3Var.f25221a)) != null) {
            org.telegram.messenger.r3 r3Var2 = this.R2;
            long j10 = r3Var2.f25222b.f26966id;
            TLRPC.Peer peer = r3Var2.J;
            if (peer != null) {
                j3 = org.telegram.messenger.m5.o(peer);
            } else {
                j3 = org.telegram.messenger.p10.i(this.f28621a).f24489n;
            }
            GroupCallMessagesController.getInstance(this.f28621a).sendCallMessage(j3, tL_textWithEntities, j10, g10);
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void G1(float f10) {
        float f11;
        int i7;
        int i10;
        this.L3 = f10;
        b20 b20Var = this.R3;
        if (b20Var == null) {
            f11 = 0.0f;
        } else {
            f11 = b20Var.f39384c;
        }
        float max = Math.max(f10, f11);
        int i11 = org.telegram.ui.ActionBar.l6.Xg;
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.l6.Ug;
        int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, x02, org.telegram.ui.ActionBar.l6.x0(null, i12, false));
        this.M3 = S0;
        this.E1.setBackgroundColor(S0);
        this.f45193b3.H(-14472653);
        this.W1.setColorFilter(new PorterDuffColorFilter(this.M3, PorterDuff.Mode.MULTIPLY));
        this.G0 = org.telegram.messenger.g0.S0(max, 1.0f, org.telegram.ui.ActionBar.l6.x0(null, i11, false), org.telegram.ui.ActionBar.l6.x0(null, i12, false));
        int S02 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Yg, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27948hh, false));
        g.b bVar = this.f45211g2;
        if (bVar != null) {
            bVar.f13264b = S02;
            n00 n00Var = (n00) bVar.f13269i;
            if (n00Var != null) {
                n00Var.invalidate();
            }
        }
        this.f45270t2.setColor(S02);
        this.f45278v1.setColor(S02);
        this.f45282w1.invalidate();
        m30 m30Var = this.H1;
        m30Var.setGlowColor(S02);
        int i13 = this.f45284w3;
        if (i13 == 3 || s1(i13)) {
            this.f45265s1.invalidate();
        }
        View view = this.A4;
        if (view != null) {
            int i14 = this.M3;
            int[] iArr = this.D4;
            iArr[0] = i14;
            iArr[1] = 0;
            if (Build.VERSION.SDK_INT > 29) {
                this.C4.setColors(iArr);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
                this.C4 = gradientDrawable;
                view.setBackground(gradientDrawable);
            }
            this.B4.setBackgroundColor(iArr[0]);
        }
        int S03 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28135rh, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28153sh, false));
        this.f45255q1.a(S03, S03);
        int S04 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Zg, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27858ch, false));
        int S05 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27819ah, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27911fh, false));
        int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, this.I0);
        int childCount = m30Var.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = m30Var.getChildAt(i15);
            if (childAt instanceof org.telegram.ui.Cells.z3) {
                org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) childAt;
                if (r1()) {
                    z3Var.a(w02, w02);
                } else {
                    z3Var.a(S05, S04);
                }
            } else {
                boolean z9 = childAt instanceof org.telegram.ui.Cells.f4;
                b30 b30Var = this.F1;
                if (z9) {
                    org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) childAt;
                    if (b30Var.getTag() != null) {
                        i10 = org.telegram.ui.ActionBar.l6.f27911fh;
                    } else {
                        i10 = org.telegram.ui.ActionBar.l6.f27819ah;
                    }
                    f4Var.f(i10, S05);
                } else if (childAt instanceof org.telegram.ui.Cells.y3) {
                    org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) childAt;
                    if (b30Var.getTag() != null) {
                        i7 = org.telegram.ui.ActionBar.l6.f27911fh;
                    } else {
                        i7 = org.telegram.ui.ActionBar.l6.f27819ah;
                    }
                    y3Var.a(i7, S05);
                }
            }
        }
        this.f28624b.invalidate();
        m30Var.invalidate();
        this.f28627c.invalidate();
    }

    @Override
    public final boolean H() {
        return !this.R3.f39382b;
    }

    public final void H1(float f10) {
        m30 m30Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        ArrayList arrayList;
        v4.d1 K;
        f10 = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) ? 0.0f : 0.0f;
        float min = (float) (Math.min(8500.0d, 4000.0f * f10) / 8500.0d);
        this.G2 = min;
        this.H2 = (min - this.F2) / 265.0f;
        org.telegram.messenger.r3 r3Var = this.R2;
        if (r3Var != null && (m30Var = this.H1) != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(org.telegram.messenger.ij.B1(this.f45261r2))) != null) {
            b20 b20Var = this.R3;
            if (!b20Var.f39382b) {
                if (this.f45225j2) {
                    arrayList = this.f45275u2;
                } else {
                    arrayList = this.R2.f25226g;
                }
                int indexOf = arrayList.indexOf(groupCallParticipant);
                if (indexOf >= 0 && (K = m30Var.K(indexOf + this.G1.d)) != null) {
                    View view = K.f57056a;
                    if (view instanceof org.telegram.ui.Cells.f4) {
                        ((org.telegram.ui.Cells.f4) view).setAmplitude(f10 * 15.0f);
                        if (view == this.O4 && !this.f45198c4) {
                            this.f28624b.invalidate();
                        }
                    }
                }
            } else {
                int i7 = 0;
                while (true) {
                    x10 x10Var = this.f45201d4;
                    if (i7 >= x10Var.getChildCount()) {
                        break;
                    }
                    org.telegram.ui.Components.h10 h10Var = (org.telegram.ui.Components.h10) x10Var.getChildAt(i7);
                    if (org.telegram.messenger.ij.B1(h10Var.getParticipant().peer) == org.telegram.messenger.ij.B1(groupCallParticipant.peer)) {
                        h10Var.setAmplitude(f10 * 15.0f);
                    }
                    i7++;
                }
            }
            b20Var.k(groupCallParticipant, f10 * 15.0f);
        }
    }

    public final void I1(int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24) {
        this.X4 = i7;
        this.Y4 = i10;
        this.Z4 = i11;
        this.f45191a5 = i12;
        this.f45195b5 = i13;
        this.f45199c5 = i14;
        this.f45202d5 = i15;
        this.f45206e5 = i16;
        this.f45210f5 = i17;
        this.f45214g5 = i18;
        this.f45218h5 = i19;
        this.f45223i5 = i20;
        this.f45227j5 = i21;
        this.f45232k5 = i22;
        this.f45236l5 = i23;
        this.f45241m5 = i24;
    }

    public final void J1(float f10) {
        m30 m30Var;
        int L;
        int i7;
        float f11;
        this.f45251p2 = f10;
        this.H1.setTopGlowOffset((int) (f10 - ((FrameLayout.LayoutParams) m30Var.getLayoutParams()).topMargin));
        float L2 = f10 - org.telegram.messenger.g0.L(74.0f);
        int i10 = ((this.f28653s0 + L2) > (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) ? 1 : ((this.f28653s0 + L2) == (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) ? 0 : -1));
        t30 t30Var = this.L2;
        b20 b20Var = this.R3;
        v10 v10Var = this.W2;
        t10 t10Var = this.V2;
        if (i10 < 0) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) - L2) - this.f28653s0) / (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((L - this.f28653s0) - org.telegram.messenger.g0.L(14.0f))));
            if (org.telegram.messenger.g0.Q1()) {
                f11 = 17.0f;
            } else {
                f11 = 13.0f;
            }
            i7 = (int) (org.telegram.messenger.g0.L(f11) * min);
            if (t30Var != null) {
                t30Var.setShadowOffset((int) (org.telegram.messenger.g0.L(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.L3) > 1.0E-4f) {
                G1(Math.min(1.0f, min));
            }
            float x10 = org.telegram.ui.Cells.f1.x(min, 0.1f, 1.2f, 1.0f);
            t10Var.setScaleX(Math.max(0.9f, x10));
            t10Var.setScaleY(Math.max(0.9f, x10));
            float f12 = 1.0f - (min * 1.2f);
            t10Var.setAlpha((1.0f - b20Var.f39384c) * Math.max(0.0f, f12));
            v10Var.setScaleX(Math.max(0.9f, x10));
            v10Var.setScaleY(Math.max(0.9f, x10));
            v10Var.setAlpha((1.0f - b20Var.f39384c) * Math.max(0.0f, f12));
        } else {
            t10Var.setScaleX(1.0f);
            t10Var.setScaleY(1.0f);
            t10Var.setAlpha(1.0f - b20Var.f39384c);
            v10Var.setScaleX(1.0f);
            v10Var.setScaleY(1.0f);
            v10Var.setAlpha(1.0f - b20Var.f39384c);
            if (this.L3 > 1.0E-4f) {
                G1(0.0f);
            }
            i7 = 0;
        }
        a1();
        float f13 = i7;
        this.f45257q3.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(53.0f)) - f13));
        this.f45189a3.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(44.0f)) - f13));
        if (t30Var != null) {
            t30Var.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), f10 - org.telegram.messenger.g0.L(37.0f)));
        }
        s20 s20Var = this.I1;
        if (s20Var != null) {
            s20Var.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(44.0f)) - f13));
        }
        this.f28624b.invalidate();
        W1();
    }

    @Override
    public final void K() {
        b20 b20Var = this.R3;
        if (b20Var != null) {
            if (this.f45217h4 != null) {
                this.H1.getViewTreeObserver().removeOnPreDrawListener(this.f45217h4);
                this.f45217h4 = null;
            }
            ArrayList arrayList = this.Q3;
            arrayList.clear();
            ArrayList arrayList2 = this.P3;
            arrayList.addAll(arrayList2);
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).f();
                b20Var.removeView((View) arrayList.get(i7));
                ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).e();
                ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).b(true);
            }
            arrayList2.clear();
            if (b20Var.getParent() != null) {
                arrayList2.clear();
                this.f28624b.removeView(b20Var);
            }
        }
        super.K();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
            VoIPService.getSharedInstance().setSinks(null, null);
        }
        if (f45182u5 == this) {
            f45182u5 = null;
        }
        f45183v5 = false;
        VoIPService.audioLevelsCallback = null;
        org.telegram.ui.Components.q10.k(getContext());
        org.telegram.messenger.r3 r3Var = this.R2;
        if (r3Var != null) {
            ArrayList arrayList3 = r3Var.f25224e;
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                ((TLRPC.GroupCallParticipant) arrayList3.get(i10)).hasCameraFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i10)).hasPresentationFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i10)).videoIndex = 0;
            }
            r3Var.z();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
    }

    public final boolean L1(android.view.View r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e40.L1(android.view.View):boolean");
    }

    public final void M1(View view) {
        if (this.d2 == null) {
            org.telegram.ui.Components.z20 z20Var = new org.telegram.ui.Components.z20(8, getContext(), null, true);
            this.d2 = z20Var;
            z20Var.setAlpha(0.0f);
            this.d2.setVisibility(4);
            this.d2.setShowingDuration(3000L);
            this.f28624b.addView(this.d2, c8.ha.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            if (org.telegram.messenger.t3.W(this.Q2)) {
                this.d2.setText(org.telegram.messenger.id.M0(2131743465, null));
            } else {
                this.d2.setText(org.telegram.messenger.id.M0(2131743347, null));
            }
            this.d2.b();
        }
        this.d2.setExtraTranslationY(-org.telegram.messenger.g0.f22557m);
        this.d2.c(view);
    }

    public final void N1(boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        org.telegram.messenger.r3 r3Var = this.R2;
        org.telegram.ui.Components.voip.n2 n2Var = this.f45260r1;
        org.telegram.ui.Components.voip.n2 n2Var2 = this.n1;
        org.telegram.ui.Components.voip.n2 n2Var3 = this.f45250p1;
        org.telegram.ui.Components.voip.n2 n2Var4 = this.f45237m1;
        org.telegram.ui.Components.voip.n2 n2Var5 = this.f45246o1;
        org.telegram.ui.Components.voip.n2 n2Var6 = this.f45255q1;
        org.telegram.ui.Components.voip.n2 n2Var7 = this.f45265s1;
        boolean z18 = true;
        n10 n10Var = this.l1;
        boolean z19 = false;
        if (r3Var != null && !r3Var.j()) {
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.R2.d.f(org.telegram.messenger.ij.B1(this.f45261r2));
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !S0()) {
                z13 = true;
            } else {
                z13 = false;
            }
            Boolean bool = this.f45249o5;
            if (bool != null) {
                z14 = bool.booleanValue();
            } else {
                TLRPC.GroupCall groupCall = this.R2.f25222b;
                if (groupCall != null && groupCall.messages_enabled) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            if (((!z13 && this.R2.c()) || z12) && !u1()) {
                z15 = true;
            } else {
                z15 = false;
                z19 = true;
            }
            if (z12) {
                z17 = true;
                z16 = false;
            } else {
                z16 = !z13;
                z17 = false;
            }
            if (f45184w5) {
                z16 = false;
                z17 = false;
            }
            n10Var.c(n2Var7, true, z9);
            n10Var.c(n2Var6, true, z9);
            n10Var.c(n2Var5, z15, z9);
            n10Var.c(n2Var4, z17, z9);
            n10Var.c(n2Var3, z19, z9);
            n10Var.c(n2Var2, z16, z9);
            n10Var.c(n2Var, z14, z9);
            return;
        }
        if (this.M2 > 0.1f) {
            z10 = true;
        } else {
            z10 = false;
        }
        n10Var.c(n2Var7, z10, z9);
        if (this.M2 > 0.1f) {
            z11 = true;
        } else {
            z11 = false;
        }
        n10Var.c(n2Var6, z11, z9);
        if (this.M2 <= 0.1f) {
            z18 = false;
        }
        n10Var.c(n2Var3, z18, z9);
        n10Var.c(n2Var5, false, z9);
        n10Var.c(n2Var4, false, z9);
        n10Var.c(n2Var2, false, z9);
        n10Var.c(n2Var, false, z9);
    }

    public final void O1() {
        int i7;
        int i10;
        boolean z9;
        boolean z10;
        boolean z11;
        int i11;
        TLObject M0;
        org.telegram.messenger.r3 r3Var;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        int i12;
        int i13;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        org.telegram.messenger.r3 r3Var2 = this.R2;
        org.telegram.ui.ActionBar.r0 r0Var = this.f45193b3;
        org.telegram.ui.ActionBar.r0 r0Var2 = this.f45200d3;
        if (r3Var2 == null || r3Var2.j()) {
            this.f45197c3.setVisibility(4);
            r0Var2.setVisibility(8);
            if (this.R2 == null) {
                r0Var.setVisibility(8);
                return;
            }
        }
        if (this.f45196c2) {
            return;
        }
        org.telegram.messenger.c cVar = this.f45228k1;
        int i14 = cVar.f21765a;
        int i15 = cVar.f21765a;
        TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i14).M0(Long.valueOf(l1()));
        if (M02 != null) {
            this.Q2 = M02;
        }
        boolean y10 = org.telegram.messenger.t3.y(3, this.Q2);
        org.telegram.ui.ActionBar.z0 z0Var = this.f45204e3;
        if (!y10 && (((org.telegram.messenger.t3.T(this.Q2) && ((chat2 = this.Q2) == null || !chat2.megagroup)) || (!org.telegram.messenger.t3.t0(this.Q2) && !org.telegram.messenger.t3.y(3, this.Q2))) && (!org.telegram.messenger.t3.T(this.Q2) || (chat = this.Q2) == null || chat.megagroup || !org.telegram.messenger.t3.t0(chat)))) {
            z0Var.setVisibility(8);
        } else {
            z0Var.setVisibility(0);
        }
        org.telegram.messenger.r3 r3Var3 = this.R2;
        org.telegram.ui.ActionBar.z0 z0Var2 = this.f45252p3;
        org.telegram.ui.ActionBar.z0 z0Var3 = this.f45248o3;
        if (r3Var3 != null && (groupCall2 = r3Var3.f25222b) != null && groupCall2.can_change_messages_enabled) {
            if (groupCall2.messages_enabled) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            z0Var3.setVisibility(i12);
            if (this.R2.f25222b.messages_enabled) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            z0Var2.setVisibility(i13);
        } else {
            z0Var3.setVisibility(8);
            z0Var2.setVisibility(8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.R2.d.f(org.telegram.messenger.ij.B1(this.f45261r2));
        org.telegram.messenger.r3 r3Var4 = this.R2;
        org.telegram.ui.ActionBar.z0 z0Var4 = this.f45216h3;
        if (r3Var4 != null && !r3Var4.j() && (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            z0Var4.setVisibility(0);
        } else {
            z0Var4.setVisibility(8);
        }
        if (org.telegram.messenger.iz.I0) {
            i7 = 2131232261;
        } else {
            i7 = 2131232260;
        }
        z0Var4.setIcon(i7);
        if (org.telegram.messenger.iz.I0) {
            i10 = 2131743280;
        } else {
            i10 = 2131743281;
        }
        z0Var4.setSubtext(org.telegram.messenger.id.M0(i10, null));
        boolean S0 = S0();
        org.telegram.ui.ActionBar.z0 z0Var5 = this.f45243n3;
        org.telegram.ui.ActionBar.z0 z0Var6 = this.f45208f3;
        org.telegram.ui.ActionBar.z0 z0Var7 = this.j3;
        org.telegram.ui.ActionBar.z0 z0Var8 = this.f45230k3;
        if (S0) {
            z0Var5.setVisibility(0);
            z0Var6.setVisibility(0);
            if (u1()) {
                z0Var7.setVisibility(0);
                z0Var8.setVisibility(8);
            } else if (this.R2.j()) {
                z0Var7.setVisibility(8);
                z0Var8.setVisibility(8);
            } else {
                z0Var7.setVisibility(0);
            }
            if (r1()) {
                z0Var7.setVisibility(8);
                z0Var6.setVisibility(8);
            }
            if (this.R2.c() && !this.R2.j() && !u1()) {
                z0Var8.setVisibility(0);
            } else {
                z0Var8.setVisibility(8);
            }
            r0Var2.setVisibility(8);
            boolean z12 = this.R2.f25240w;
            z30 z30Var = this.U2;
            z30Var.f52414f = z12;
            z30Var.d = 1.0f;
            z30Var.invalidateSelf();
            if (this.R2.f25240w) {
                if (this.f45276u3 == null) {
                    u00 u00Var = new u00(this, 6);
                    this.f45276u3 = u00Var;
                    org.telegram.messenger.g0.i3(u00Var, 1000L);
                }
                z0Var7.setText(org.telegram.messenger.id.M0(2131743323, null));
            } else {
                u00 u00Var2 = this.f45276u3;
                if (u00Var2 != null) {
                    org.telegram.messenger.g0.r(u00Var2);
                    this.f45276u3 = null;
                }
                z0Var7.setText(org.telegram.messenger.id.M0(2131743348, null));
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                z0Var8.j(org.telegram.messenger.id.M0(2131743434, null), 2131232353, null);
            } else {
                z0Var8.j(org.telegram.messenger.id.M0(2131743436, null), 2131232352, null);
            }
            Q1();
        } else {
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !S0()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z9 && ((this.R2.c() || z10) && !this.R2.j() && !u1())) {
                if (z10) {
                    r0Var2.setVisibility(8);
                    z0Var8.setVisibility(0);
                    z0Var8.j(org.telegram.messenger.id.M0(2131743434, null), 2131232353, null);
                    z0Var8.setContentDescription(org.telegram.messenger.id.M0(2131743434, null));
                } else {
                    z0Var8.j(org.telegram.messenger.id.M0(2131743436, null), 2131232352, null);
                    z0Var8.setContentDescription(org.telegram.messenger.id.M0(2131743436, null));
                    r0Var2.setVisibility(8);
                    z0Var8.setVisibility(0);
                }
            } else {
                r0Var2.setVisibility(8);
                z0Var8.setVisibility(8);
            }
            z0Var5.setVisibility(8);
            z0Var6.setVisibility(8);
            z0Var7.setVisibility(8);
        }
        boolean S02 = S0();
        org.telegram.ui.ActionBar.z0 z0Var9 = this.f45221i3;
        if (S02 && this.R2.f25222b.can_change_join_muted && !r1()) {
            z0Var9.setVisibility(0);
        } else {
            z0Var9.setVisibility(8);
        }
        if (r1() && ((r3Var = this.R2) == null || (groupCall = r3Var.f25222b) == null || !groupCall.creator)) {
            z11 = false;
        } else {
            z11 = true;
        }
        r0Var.Q(4, z11);
        if (u1() && !this.R2.j()) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        this.f45212g3.setVisibility(i11);
        int visibility = z0Var6.getVisibility();
        TextView textView = this.f45262r3;
        if (visibility != 0 && z0Var9.getVisibility() != 0 && z0Var.getVisibility() != 0 && z0Var8.getVisibility() != 0 && z0Var7.getVisibility() != 0 && z0Var5.getVisibility() != 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.f45192b2;
        if (((sharedInstance != null && VoIPService.getSharedInstance().hasFewPeers) || this.S2) && !u1() && this.f45261r2 != null) {
            kVar.setVisibility(0);
            long B1 = org.telegram.messenger.ij.B1(this.f45261r2);
            if (org.telegram.messenger.m5.E(B1)) {
                M0 = org.telegram.messenger.qp.s1(i15).a2(Long.valueOf(B1));
            } else {
                M0 = org.telegram.messenger.qp.s1(i15).M0(Long.valueOf(-B1));
            }
            kVar.setObject(M0);
        } else {
            kVar.setVisibility(8);
        }
        TLRPC.Chat chat3 = this.Q2;
        if (chat3 != null && !org.telegram.messenger.t3.W(chat3) && u1() && z0Var.getVisibility() == 8) {
            r0Var.setVisibility(8);
        } else {
            r0Var.setVisibility(0);
        }
        LinearLayout linearLayout = this.f45189a3;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f10 = 96;
        if (layoutParams.rightMargin != org.telegram.messenger.g0.L(f10)) {
            layoutParams.rightMargin = org.telegram.messenger.g0.L(f10);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.f45257q3.getLayoutParams()).rightMargin = 0;
        this.F1.setTitleRightMargin(org.telegram.messenger.g0.L(48.0f) * 2);
    }

    public final void P1(int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e40.P1(int, boolean):void");
    }

    public final void Q0(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e40.Q0(boolean):void");
    }

    public final void Q1() {
        if (this.R2 == null) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.f45228k1.f21765a).getCurrentTime();
        org.telegram.messenger.r3 r3Var = this.R2;
        int i7 = currentTime - r3Var.f25222b.record_start_date;
        boolean z9 = r3Var.f25240w;
        org.telegram.ui.ActionBar.z0 z0Var = this.j3;
        if (z9) {
            z0Var.setSubtext(org.telegram.messenger.g0.g0(i7, false, false));
        } else {
            z0Var.setSubtext(null);
        }
    }

    public final int R0() {
        m30 m30Var = this.H1;
        int childCount = m30Var.getChildCount();
        int i7 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = m30Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 0) {
                i7 = Math.min(i7, childAt.getTop());
            }
        }
        return i7;
    }

    public final void R1(boolean z9) {
        float interpolation;
        float f10;
        s20 s20Var = this.I1;
        if ((s20Var == null || this.R2 != null) && this.O2 == null) {
            this.N2 = 1.0f;
            this.M2 = 1.0f;
            if (s20Var == null) {
                return;
            }
        }
        int i7 = 4;
        if (!z9) {
            r10 r10Var = this.f45244n4;
            org.telegram.messenger.g0.r(r10Var);
            r10Var.run();
            org.telegram.messenger.r3 r3Var = this.R2;
            m30 m30Var = this.H1;
            if (r3Var != null && !r3Var.j()) {
                m30Var.setVisibility(0);
            } else {
                m30Var.setVisibility(4);
            }
            boolean W = org.telegram.messenger.t3.W(this.Q2);
            org.telegram.ui.ActionBar.z0 z0Var = this.f45243n3;
            if (W) {
                z0Var.setText(org.telegram.messenger.id.M0(2131743488, null));
            } else {
                z0Var.setText(org.telegram.messenger.id.M0(2131743395, null));
            }
        }
        float f11 = this.M2;
        if (f11 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.xq.f40458f.getInterpolation((f11 - 0.6f) / 0.4f) * 0.05f);
            this.N2 = 1.0f;
            f10 = 1.0f;
        } else {
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40458f;
            this.N2 = xqVar.getInterpolation(f11 / 0.6f);
            interpolation = 1.05f * xqVar.getInterpolation(this.M2 / 0.6f);
            f10 = this.M2 / 0.6f;
        }
        N1(true);
        float f12 = 1.0f - f10;
        s20Var.setAlpha(f12);
        this.L1.setAlpha(f10);
        this.N1.setAlpha(f10);
        l30 l30Var = this.M1;
        l30Var.setAlpha(f10);
        l30Var.setScaleX(interpolation);
        l30Var.setScaleY(interpolation);
        q20 q20Var = this.K1;
        q20Var.setScaleX(f12);
        q20Var.setScaleY(f12);
        q20Var.setAlpha(f12);
        this.J1.setAlpha(f12);
        this.f45193b3.setAlpha(f10);
        if (f12 != 0.0f) {
            i7 = 0;
        }
        if (i7 != s20Var.getVisibility()) {
            s20Var.setVisibility(i7);
            q20Var.setVisibility(i7);
        }
    }

    public final boolean S0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            org.telegram.messenger.r3 r3Var = this.R2;
            if (r3Var != null && (groupCall = r3Var.f25222b) != null && groupCall.creator) {
                return true;
            }
            return false;
        }
        return org.telegram.messenger.t3.w(14, this.Q2);
    }

    public final void S1(boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        org.telegram.ui.Components.voip.n2 n2Var = this.f45250p1;
        if (n2Var != null && n2Var.getVisibility() == 0) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            n10 n10Var = this.l1;
            boolean z13 = false;
            if (sharedInstance != null && !u1()) {
                mh.a aVar = (mh.a) n10Var.f20045c.get(n2Var);
                if (aVar != null) {
                    aVar.d.a(true, z9);
                    n2Var.setEnabled(true);
                }
                if (!sharedInstance.isBluetoothOn() && !sharedInstance.isBluetoothWillOn()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11 && sharedInstance.isSpeakerphoneOn()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z11) {
                    n2Var.c(2131230916, -1, 0, 0.1f, true, org.telegram.messenger.id.M0(2131743503, null), false, z9);
                } else if (z12) {
                    n2Var.c(2131230924, -1, 0, 0.3f, true, org.telegram.messenger.id.M0(2131743239, null), false, z9);
                } else if (sharedInstance.isHeadsetPlugged()) {
                    n2Var.c(2131230919, -1, 0, 0.1f, true, org.telegram.messenger.id.M0(2131743501, null), false, z9);
                } else {
                    n2Var.c(2131230924, -1, 0, 0.1f, true, org.telegram.messenger.id.M0(2131743239, null), false, z9);
                }
                n2Var.b(z12, z9);
                k1();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.isBluetoothHeadsetConnected()) {
                    i7 = 2131231089;
                } else {
                    i7 = 2131231171;
                }
                if (this.R1 != i7) {
                    this.R1 = i7;
                    org.telegram.messenger.g0.R3(this.S1, i7);
                }
                org.telegram.ui.Components.voip.n2 n2Var2 = this.n1;
                if (n2Var2.getVisibility() == 0) {
                    n2Var2.c(0, -1, 0, 1.0f, true, i1(k1()), false, z9);
                    if (k1() != 1) {
                        z13 = true;
                    }
                    n2Var2.b(z13, z9);
                    return;
                }
                return;
            }
            n2Var.c(2131232435, -1, 0, 0.3f, true, org.telegram.messenger.id.M0(2131743437, null), false, z9);
            if (!org.telegram.messenger.t3.t0(this.Q2) && (!org.telegram.messenger.t3.N(this.Q2) || !org.telegram.messenger.t3.w(3, this.Q2))) {
                z10 = false;
            } else {
                z10 = true;
            }
            mh.a aVar2 = (mh.a) n10Var.f20045c.get(n2Var);
            if (aVar2 != null) {
                aVar2.d.a(z10, z9);
                n2Var.setEnabled(z10);
            }
            n2Var.b(true, false);
        }
    }

    public final void T0() {
        if (this.I3) {
            this.I3 = false;
            org.telegram.messenger.g0.r(this.f45253p4);
        }
        if (this.J3) {
            this.J3 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.f45265s1.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void T1(boolean r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e40.T1(boolean, boolean):void");
    }

    @Override
    public final ArrayList U() {
        return new ArrayList();
    }

    public final void U0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e40.U0():void");
    }

    public final void U1() {
        boolean z9;
        String str;
        float f10;
        float f11;
        c40 c40Var;
        TLRPC.User user;
        TLRPC.Chat chat;
        b30 b30Var = this.F1;
        if (b30Var != null && this.R2 != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            int i7 = 0;
            for (int i10 = 0; i10 < this.R2.P.m(); i10++) {
                long j3 = this.R2.P.j(i10);
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.R2.P.f(j3);
                if (!groupCallParticipant.self) {
                    b20 b20Var = this.R3;
                    b20Var.getClass();
                    if (b20Var.f39411x.get(org.telegram.messenger.ij.B1(groupCallParticipant.peer)) <= 0 && this.f45268s4.get(j3, 0) != 1) {
                        long B1 = org.telegram.messenger.ij.B1(groupCallParticipant.peer);
                        if (spannableStringBuilder == null) {
                            spannableStringBuilder = new SpannableStringBuilder();
                        }
                        if (i7 < 2) {
                            int i11 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
                            if (i11 > 0) {
                                user = org.telegram.messenger.qp.s1(this.f28621a).a2(Long.valueOf(B1));
                            } else {
                                user = null;
                            }
                            if (i11 <= 0) {
                                chat = org.telegram.messenger.qp.s1(this.f28621a).M0(Long.valueOf(B1));
                            } else {
                                chat = null;
                            }
                            if (user != null || chat != null) {
                                if (i7 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (user != null) {
                                    spannableStringBuilder.append(org.telegram.messenger.t10.j(user, true), new org.telegram.ui.Components.v31(org.telegram.messenger.g0.o()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.v31(org.telegram.messenger.g0.o()), 0);
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
                String K0 = org.telegram.messenger.id.K0(i7, "MembersAreSpeakingToast");
                int indexOf = K0.indexOf("un1");
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(K0);
                spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
                b30Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
                z9 = true;
            } else {
                z9 = false;
            }
            org.telegram.ui.ActionBar.l5 subtitleTextView = b30Var.getSubtitleTextView();
            if (u1()) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            int i12 = this.R2.f25222b.participants_count;
            y30 y30Var = this.G1;
            subtitleTextView.k(org.telegram.messenger.id.G(i12 + ((y30Var.M.u1() || y30Var.L || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined()), str, new Object[0]));
            if (u1() && (c40Var = this.f45267s3) != null) {
                c40Var.setWatchersCount(this.R2.f25222b.participants_count);
            }
            if (z9 != this.f45235l4) {
                this.f45235l4 = z9;
                b30Var.invalidate();
                float f12 = 0.0f;
                b30Var.getSubtitleTextView().setPivotX(0.0f);
                b30Var.getSubtitleTextView().setPivotY(b30Var.getMeasuredHeight() >> 1);
                ViewPropertyAnimator animate = b30Var.getSubtitleTextView().animate();
                if (this.f45235l4) {
                    f10 = 0.98f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f10);
                if (this.f45235l4) {
                    f11 = 0.9f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f11);
                if (!this.f45235l4) {
                    f12 = 1.0f;
                }
                scaleY.alpha(f12).setDuration(150L);
                org.telegram.messenger.g0.X3(b30Var.getAdditionalSubtitleTextView(), this.f45235l4);
            }
        }
    }

    public final void V0() {
        this.f45282w1.setTranslationY((-this.f45271t3.d()) + this.f28624b.getPaddingBottom());
        this.f45286x1.invalidate();
        b1();
        a1();
        Y0();
        Z0();
        c1();
        this.l1.setAlpha(1.0f - this.f45259q5.f55499e);
        W0();
        X0();
    }

    public final void V1(boolean z9) {
        org.telegram.messenger.r3 r3Var = this.R2;
        t10 t10Var = this.V2;
        if (r3Var == null) {
            if (org.telegram.messenger.t3.W(this.Q2)) {
                t10Var.b(org.telegram.messenger.id.M0(2131743462, null), z9);
                return;
            } else {
                t10Var.b(org.telegram.messenger.id.M0(2131743341, null), z9);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(r3Var.f25222b.title);
        b30 b30Var = this.F1;
        if (!isEmpty) {
            if (!this.R2.f25222b.title.equals(b30Var.getTitle())) {
                if (z9) {
                    this.F1.L(this.R2.f25222b.title, true, 180L, null);
                    b30Var.getTitleTextView().setOnClickListener(new r00(this, 7));
                } else {
                    b30Var.setTitle(this.R2.f25222b.title);
                }
                t10Var.b(this.R2.f25222b.title, z9);
            }
        } else {
            TLRPC.Chat chat = this.Q2;
            if (chat != null && !chat.title.equals(b30Var.getTitle())) {
                if (z9) {
                    this.F1.L(this.Q2.title, true, 180L, null);
                    b30Var.getTitleTextView().setOnClickListener(new r00(this, 8));
                } else {
                    b30Var.setTitle(this.Q2.title);
                }
                if (org.telegram.messenger.t3.W(this.Q2)) {
                    if (u1()) {
                        t10Var.b(this.Q2.title, z9);
                    } else {
                        t10Var.b(org.telegram.messenger.id.M0(2131743447, null), z9);
                    }
                } else {
                    t10Var.b(org.telegram.messenger.id.M0(2131743306, null), z9);
                }
            } else if (this.Q2 == null) {
                b30Var.setTitle(org.telegram.messenger.id.M0(2131751823, null));
                t10Var.b(org.telegram.messenger.id.M0(2131751823, null), z9);
            }
        }
        org.telegram.ui.ActionBar.l5 titleTextView = b30Var.getTitleTextView();
        if (this.R2.f25240w) {
            if (titleTextView.getRightDrawable() == null) {
                titleTextView.i(new a40(titleTextView));
                TextView textView = t10Var.getTextView();
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new a40(textView), (Drawable) null);
                TextView nextTextView = t10Var.getNextTextView();
                nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new a40(nextTextView), (Drawable) null);
            }
        } else if (titleTextView.getRightDrawable() != null) {
            titleTextView.i(null);
            t10Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            t10Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final void W0() {
        int i7;
        float f10 = this.f45271t3.f54559b.f55525a;
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        m20 m20Var = this.f45282w1;
        m20Var.setAlpha(f10);
        l20 l20Var = this.f45286x1;
        l20Var.setAlpha(f10);
        if (m20Var.getVisibility() != i7) {
            m20Var.setVisibility(i7);
            l20Var.setVisibility(i7);
            if (i7 == 8) {
                j20 j20Var = this.f45290y1;
                if (j20Var.isFocused()) {
                    j20Var.clearFocus();
                }
            }
        }
    }

    public final void W1() {
        float f10;
        org.telegram.ui.Components.gb gbVar;
        boolean z9;
        if (this.E != null) {
            int L = org.telegram.messenger.g0.L(74.0f);
            float f11 = this.f45251p2 - L;
            if (this.f28653s0 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                int L2 = (L - this.f28653s0) - org.telegram.messenger.g0.L(14.0f);
                f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - this.f28653s0) / L2);
                f11 -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L2) * f10);
            } else {
                f10 = 0.0f;
            }
            float paddingTop = f11 + this.f28624b.getPaddingTop();
            FrameLayout frameLayout = this.E;
            b30 b30Var = this.F1;
            frameLayout.setTranslationY(org.telegram.messenger.g0.T1(((-frameLayout.getTop()) - this.E.getHeight()) + paddingTop + org.telegram.messenger.g0.L(10.0f), b30Var.getY() + (-this.E.getTop()) + b30Var.getHeight(), f10));
            org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.f32619w;
            if (ccVar != null && (gbVar = ccVar.f32623e) != null && gbVar.getParent() != null && gbVar.getParent().getParent() == this.E) {
                if (f10 > 0.5f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                gbVar.setTop(z9);
            }
        }
    }

    public final void X0() {
        int i7;
        org.telegram.ui.Components.ji0 ji0Var = this.B1;
        if (ji0Var != null) {
            float f10 = this.f45271t3.f54559b.f55525a * this.f45264r5.f55499e;
            ji0Var.setAlpha(f10);
            if (f10 > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            if (this.B1.getVisibility() != i7) {
                this.B1.setVisibility(i7);
                if (i7 == 8) {
                    this.B1.n();
                }
            }
            org.telegram.ui.Components.ji0 ji0Var2 = this.B1;
            if (!ji0Var2.N0 && f10 == 1.0f) {
                ji0Var2.N0 = true;
            }
        }
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 2) {
            a1();
            Y0();
            Z0();
            float f12 = 1.0f - this.f45259q5.f55499e;
            n10 n10Var = this.l1;
            n10Var.setAlpha(f12);
            this.R3.setProgressToHideUi(f10);
            this.f45201d4.invalidate();
            this.f28624b.invalidate();
            n10Var.invalidate();
        }
        if (i7 == 3) {
            b1();
            a1();
            c1();
            X0();
            this.f28624b.invalidate();
        }
        if (i7 == 4) {
            a1();
            this.f45286x1.invalidate();
            this.f45290y1.invalidate();
        }
        if (i7 == 5) {
            a1();
            this.f28624b.invalidate();
        }
    }

    public final void Y0() {
        boolean z9 = f45185x5;
        n10 n10Var = this.l1;
        if (z9) {
            n10Var.setTranslationX(0.0f);
            n10Var.setTranslationY(0.0f);
            return;
        }
        boolean z10 = f45184w5;
        te.a aVar = this.f45259q5;
        if (z10) {
            n10Var.setTranslationX(aVar.f55499e * org.telegram.messenger.g0.L(94.0f));
            n10Var.setTranslationY(0.0f);
            return;
        }
        n10Var.setTranslationX(0.0f);
        n10Var.setTranslationY(aVar.f55499e * org.telegram.messenger.g0.L(94.0f));
    }

    public final void Z0() {
        boolean z9 = f45185x5;
        x10 x10Var = this.f45201d4;
        if (z9) {
            x10Var.setTranslationX(0.0f);
            x10Var.setTranslationY(0.0f);
            return;
        }
        boolean z10 = f45184w5;
        te.a aVar = this.f45259q5;
        if (z10) {
            x10Var.setTranslationX(aVar.f55499e * org.telegram.messenger.g0.L(94.0f));
            x10Var.setTranslationY(0.0f);
            return;
        }
        x10Var.setTranslationX(0.0f);
        x10Var.setTranslationY(aVar.f55499e * org.telegram.messenger.g0.L(94.0f));
    }

    public final void a1() {
        float L;
        float f10 = this.s5.f55505f;
        rh.h hVar = this.f45271t3;
        float f11 = -((hVar.d() - this.f28624b.getPaddingBottom()) + f10 + (org.telegram.messenger.g0.L(68.0f) * this.f45264r5.f55499e) + org.telegram.messenger.g0.L(10.0f));
        if (f45185x5) {
            L = (1.0f - this.f45273t5.f55499e) * org.telegram.messenger.g0.L(-91.0f);
        } else if (f45184w5) {
            L = 0.0f;
        } else {
            L = ((this.f45259q5.f55499e * org.telegram.messenger.g0.L(94.0f)) - (org.telegram.messenger.g0.L(104.0f) * this.R3.f39384c)) - org.telegram.messenger.g0.L(91.0f);
        }
        float T1 = org.telegram.messenger.g0.T1(L, f11, hVar.f54559b.f55525a);
        float measuredHeight = ((this.f28624b.getMeasuredHeight() - this.f45251p2) + T1) - this.f28653s0;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - org.telegram.messenger.g0.L(250.0f));
        nh.h hVar2 = this.T1;
        hVar2.setTranslationY(T1);
        hVar2.setVisibleHeight((int) max);
    }

    public final void b1() {
        if (this.B1 != null) {
            this.B1.setTranslationY((-this.f45271t3.d()) + this.f28624b.getPaddingBottom() + ((-this.f45264r5.f55499e) * org.telegram.messenger.g0.L(64.0f)));
        }
    }

    public final void c1() {
        boolean z9;
        float f10 = this.f45264r5.f55499e;
        float T1 = org.telegram.messenger.g0.T1(0.25f, 1.0f, f10);
        ImageView imageView = this.A1;
        imageView.setScaleX(T1);
        imageView.setScaleY(org.telegram.messenger.g0.T1(0.25f, 1.0f, f10));
        imageView.setAlpha(f10);
        boolean z10 = false;
        if (f10 > 0.9f) {
            z9 = true;
        } else {
            z9 = false;
        }
        imageView.setClickable(z9);
        float f11 = 1.0f - f10;
        float T12 = org.telegram.messenger.g0.T1(0.25f, 1.0f, f11);
        ImageView imageView2 = this.f45294z1;
        imageView2.setScaleX(T12);
        imageView2.setScaleY(org.telegram.messenger.g0.T1(0.25f, 1.0f, f11));
        imageView2.setAlpha(f11);
        if (f11 > 0.9f) {
            z10 = true;
        }
        imageView2.setClickable(z10);
    }

    public final void d1() {
        org.telegram.ui.Components.voip.y yVar = this.Q4;
        if (yVar != null) {
            yVar.f39714a.setRoundCorners(org.telegram.messenger.g0.L(8.0f));
            org.telegram.ui.Components.voip.y yVar2 = this.Q4;
            yVar2.h = false;
            yVar2.j(false);
            this.Q4.invalidate();
            this.R3.invalidate();
        }
        org.telegram.ui.Cells.f4 f4Var = this.O4;
        if (f4Var != null && !this.S4 && f4Var.getParent() != null) {
            this.f28624b.removeView(this.O4);
        }
        org.telegram.ui.Cells.f4 f4Var2 = this.O4;
        if (f4Var2 != null) {
            f4Var2.setProgressToAvatarPreview(0.0f);
            this.O4.setAboutVisible(false);
            this.O4.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.h10 h10Var = this.R4;
        if (h10Var != null) {
            h10Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.O4 = null;
        this.P4 = null;
        this.R4 = null;
        this.Q4 = null;
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
        String M0;
        boolean z9;
        org.telegram.messenger.s3 s3Var;
        boolean z10;
        VoIPService sharedInstance;
        int i15;
        int i16;
        int i17 = org.telegram.messenger.qs.f25099w2;
        m30 m30Var = this.H1;
        String[] strArr = null;
        int i18 = 0;
        if (i7 == i17) {
            Long l10 = (Long) objArr[1];
            org.telegram.messenger.r3 r3Var = this.R2;
            if (r3Var != null && r3Var.f25222b.f26966id == l10.longValue()) {
                org.telegram.messenger.r3 r3Var2 = this.R2;
                if (r3Var2.f25222b instanceof TLRPC.TL_groupCallDiscarded) {
                    dismiss();
                    return;
                }
                int i19 = (this.f45229k2 > 0L ? 1 : (this.f45229k2 == 0L ? 0 : -1));
                org.telegram.messenger.c cVar = this.f45228k1;
                if (i19 == 0 && (((i16 = this.f45284w3) == 7 || i16 == 5 || i16 == 6) && !r3Var2.j())) {
                    try {
                        Intent intent = new Intent(this.Z1, VoIPService.class);
                        intent.putExtra("chat_id", l1());
                        intent.putExtra("createGroupCall", false);
                        intent.putExtra("hasFewPeers", this.S2);
                        intent.putExtra("peerChannelId", this.P2.channel_id);
                        intent.putExtra("peerChatId", this.P2.chat_id);
                        intent.putExtra("peerUserId", this.P2.user_id);
                        intent.putExtra("hash", this.T2);
                        intent.putExtra("peerAccessHash", this.P2.access_hash);
                        intent.putExtra("is_outgoing", true);
                        intent.putExtra("start_incall_activity", false);
                        intent.putExtra("account", cVar.f21765a);
                        intent.putExtra("scheduleDate", this.f45194b4);
                        this.Z1.startService(intent);
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    this.f45229k2 = SystemClock.elapsedRealtime();
                    org.telegram.messenger.g0.i3(new u00(this, 2), 3000L);
                }
                if (!this.f45233l2 && VoIPService.getSharedInstance() != null) {
                    this.R2.b(false);
                    o1();
                    VoIPService.getSharedInstance().playConnectedSound();
                }
                O1();
                int childCount = m30Var.getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt = m30Var.getChildAt(i20);
                    if (childAt instanceof org.telegram.ui.Cells.f4) {
                        ((org.telegram.ui.Cells.f4) childAt).a(true, false);
                    }
                }
                if (this.O4 != null) {
                    this.f45225j2 = true;
                } else {
                    Q0(true);
                }
                U1();
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                if (this.f45284w3 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                T1(true, booleanValue);
                V1(true);
                if (z10 && ((i15 = this.f45284w3) == 1 || i15 == 0)) {
                    n1().j(38, 0L, null);
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().playAllowTalkSound();
                    }
                }
                if (objArr.length >= 4) {
                    Long l11 = (Long) objArr[3];
                    long longValue = l11.longValue();
                    if (longValue != 0 && !u1()) {
                        if (!r1() || (sharedInstance = VoIPService.getSharedInstance()) == null || longValue != sharedInstance.convertingFromCallWithUserId) {
                            try {
                                ArrayList arrayList = org.telegram.messenger.qp.s1(cVar.f21765a).f24944y;
                                if (arrayList != null) {
                                    int size = arrayList.size();
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 >= size) {
                                            break;
                                        }
                                        Object obj = arrayList.get(i21);
                                        i21++;
                                        if (((TLRPC.Dialog) obj).f26960id == longValue) {
                                            i18 = 1;
                                            break;
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            if (org.telegram.messenger.m5.E(longValue)) {
                                TLRPC.User a22 = org.telegram.messenger.qp.s1(cVar.f21765a).a2(l11);
                                if (a22 != null) {
                                    if (this.R2.f25222b.participants_count < 250 || org.telegram.messenger.t10.w(a22) || a22.verified || i18 != 0) {
                                        n1().k(0L, 44, a22, this.Q2, null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            TLRPC.Chat M02 = org.telegram.messenger.qp.s1(cVar.f21765a).M0(Long.valueOf(-longValue));
                            if (M02 != null) {
                                if (this.R2.f25222b.participants_count < 250 || !org.telegram.messenger.t3.r0(M02) || M02.verified || i18 != 0) {
                                    n1().k(0L, 44, M02, this.Q2, null, null);
                                }
                            }
                        }
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25113y2) {
            b20 b20Var = this.R3;
            if (b20Var.f39382b && this.R2 != null) {
                boolean c10 = b20Var.c();
                org.telegram.messenger.r3 r3Var3 = this.R2;
                if (r3Var3 != null && b20Var.f39382b && (s3Var = b20Var.f39387e) != null && r3Var3.d.f(org.telegram.messenger.ij.B1(s3Var.f25409a.peer)) == null) {
                    c10 = true;
                }
                if (c10) {
                    org.telegram.messenger.s3 s3Var2 = null;
                    int i22 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f45215h2;
                        if (i22 >= arrayList2.size()) {
                            break;
                        }
                        org.telegram.messenger.s3 s3Var3 = (org.telegram.messenger.s3) arrayList2.get(i22);
                        if (this.R2.P.g(null, org.telegram.messenger.ij.B1(s3Var3.f25409a.peer)) != null) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = s3Var3.f25409a;
                            if (!groupCallParticipant3.muted_by_you && b20Var.d != org.telegram.messenger.ij.B1(groupCallParticipant3.peer)) {
                                s3Var2 = s3Var3;
                            }
                        }
                        i22++;
                    }
                    if (s3Var2 != null) {
                        h1(s3Var2);
                    }
                }
            }
            b20Var.setVisibleParticipant(true);
            U1();
        } else if (i7 == org.telegram.messenger.qs.N4) {
            H1(((Float) objArr[0]).floatValue());
        } else if (i7 == org.telegram.messenger.qs.M0) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                    if (org.telegram.messenger.t3.W(this.Q2)) {
                        M0 = org.telegram.messenger.id.M0(2131743452, null);
                    } else {
                        M0 = org.telegram.messenger.id.M0(2131743319, null);
                    }
                } else if (!"ANONYMOUS_CALLS_DISABLED".equals(str) && !"GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    M0 = org.telegram.messenger.id.M0(2131751105, null) + "\n" + str;
                } else if (org.telegram.messenger.t3.W(this.Q2)) {
                    M0 = org.telegram.messenger.id.M0(2131743478, null);
                } else {
                    M0 = org.telegram.messenger.id.M0(2131743370, null);
                }
                AlertDialog$Builder K = org.telegram.ui.Components.v4.K(getContext(), org.telegram.messenger.id.M0(2131743306, null), M0);
                K.j(new y00(this, 1));
                try {
                    K.p();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        } else if (i7 == org.telegram.messenger.qs.D2) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
            }
        } else if (i7 == org.telegram.messenger.qs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f26957id == l1()) {
                O1();
                T1(isShowing(), false);
            }
            long B1 = org.telegram.messenger.ij.B1(this.f45261r2);
            org.telegram.messenger.r3 r3Var4 = this.R2;
            if (r3Var4 != null && chatFull.f26957id == (-B1) && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) r3Var4.d.f(B1)) != null) {
                groupCallParticipant2.about = chatFull.about;
                Q0(true);
                org.telegram.messenger.g0.b4(m30Var);
                if (this.f45281v4 != null) {
                    while (i18 < this.f45281v4.getChildCount()) {
                        View childAt2 = this.f45281v4.getChildAt(i18);
                        if ((childAt2 instanceof org.telegram.ui.ActionBar.z0) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                            org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) childAt2;
                            if (TextUtils.isEmpty(groupCallParticipant2.about)) {
                                i13 = 2131743506;
                            } else {
                                i13 = 2131743416;
                            }
                            String M03 = org.telegram.messenger.id.M0(i13, null);
                            if (TextUtils.isEmpty(groupCallParticipant2.about)) {
                                i14 = 2131232043;
                            } else {
                                i14 = 2131232185;
                            }
                            z0Var.j(M03, i14, null);
                        }
                        i18++;
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25085u1) {
            if (((Long) objArr[0]).longValue() == l1()) {
                O1();
                T1(isShowing(), false);
            }
        } else if (i7 == org.telegram.messenger.qs.B2) {
            int childCount2 = m30Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i18 < childCount2) {
                v4.d1 G = m30Var.G(m30Var.getChildAt(i18));
                if (G != null) {
                    View view = G.f57056a;
                    if (view instanceof org.telegram.ui.Cells.f4) {
                        org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                        if (f4Var.getParticipant() != null) {
                            f4Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i18++;
            }
        } else if (i7 == org.telegram.messenger.qs.E0) {
            Long l12 = (Long) objArr[0];
            long B12 = org.telegram.messenger.ij.B1(this.f45261r2);
            if (this.R2 != null && B12 == l12.longValue() && (groupCallParticipant = (TLRPC.GroupCallParticipant) this.R2.d.f(B12)) != null) {
                groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
                Q0(true);
                org.telegram.messenger.g0.b4(m30Var);
                if (this.f45281v4 != null) {
                    while (i18 < this.f45281v4.getChildCount()) {
                        View childAt3 = this.f45281v4.getChildAt(i18);
                        if ((childAt3 instanceof org.telegram.ui.ActionBar.z0) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                            org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) childAt3;
                            if (TextUtils.isEmpty(groupCallParticipant.about)) {
                                i11 = 2131743507;
                            } else {
                                i11 = 2131743417;
                            }
                            String M04 = org.telegram.messenger.id.M0(i11, null);
                            if (TextUtils.isEmpty(groupCallParticipant.about)) {
                                i12 = 2131232043;
                            } else {
                                i12 = 2131232185;
                            }
                            z0Var2.j(M04, i12, null);
                        }
                        i18++;
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25020j0) {
            Q0(true);
            org.telegram.messenger.g0.b4(m30Var);
        } else if (i7 == org.telegram.messenger.qs.f25063r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i23 = org.telegram.messenger.qp.C8;
            int i24 = intValue & 16;
            if (i24 != 0) {
                Q0(true);
            }
            if (i24 != 0 || (intValue & 524288) != 0) {
                org.telegram.messenger.g0.b4(m30Var);
            }
        } else if (i7 == org.telegram.messenger.qs.f25120z2) {
            v20 v20Var = this.f45256q2;
            if (v20Var != null) {
                v20Var.b(true, true);
            }
            O1();
        } else if (i7 == org.telegram.messenger.qs.R3) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            g.b bVar = this.f45211g2;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            bVar.b(strArr);
        }
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity = this.Z1;
        launchActivity.Z0.remove(this.f45240m4);
        this.Z1.setRequestedOrientation(-1);
        f45183v5 = false;
        org.telegram.ui.Components.i20 i20Var = this.f45280v3;
        if (i20Var != null) {
            i20Var.dismiss();
        }
        this.f45225j2 = true;
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.F2, new Object[0]);
        org.telegram.messenger.c cVar = this.f45228k1;
        int i7 = cVar.f21765a;
        int i10 = cVar.f21765a;
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.M0);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.f25099w2);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.T);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.f25085u1);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.B2);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.E0);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.f25020j0);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.f25063r);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.f25120z2);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.f25113y2);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.R3);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.N4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.D2);
        super.dismiss();
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i7;
        if (this.Z1 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.Z1.getSystemService("audio");
            boolean z9 = false;
            if (audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25) {
                z9 = true;
            }
            WebRtcAudioTrack.setSpeakerMute(z9);
            if (isSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                UndoView n1 = n1();
                if (z9) {
                    i7 = 42;
                } else {
                    i7 = 43;
                }
                n1.j(i7, 0L, null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void f1(boolean z9) {
        if (!this.T4 && this.W3) {
            if (z9) {
                this.T4 = true;
                D1(false, this.O4);
                return;
            }
            d1();
            this.f28624b.removeView(this.V3);
            this.V3 = null;
            this.f45272t4.setVisibility(8);
            this.f28624b.invalidate();
            this.W3 = false;
            this.P1.X = true;
            this.H1.invalidate();
            this.S3.setVisibility(8);
            if (this.f45225j2) {
                this.f45225j2 = false;
                Q0(true);
            }
            U0();
        }
    }

    public final org.telegram.ui.Components.voip.r g1() {
        int i7 = 0;
        while (true) {
            m30 m30Var = this.H1;
            if (i7 < m30Var.getChildCount()) {
                View childAt = m30Var.getChildAt(i7);
                if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.r) && RecyclerView.R(childAt) >= 0) {
                    return (org.telegram.ui.Components.voip.r) childAt;
                }
                i7++;
            } else {
                return null;
            }
        }
    }

    public final void h1(org.telegram.messenger.s3 s3Var) {
        org.telegram.messenger.s3 s3Var2;
        if (s3Var == null) {
            this.Z1.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            b20 b20Var = this.R3;
            if (b20Var.f39402r != null) {
                return;
            }
            boolean z9 = f45185x5;
            m30 m30Var = this.H1;
            int i7 = 0;
            if (z9) {
                if (this.f45217h4 != null) {
                    m30Var.getViewTreeObserver().removeOnPreDrawListener(this.f45217h4);
                    this.f45217h4 = null;
                }
                ArrayList arrayList = new ArrayList();
                h40 h40Var = this.f45209f4;
                ArrayList arrayList2 = this.P3;
                ArrayList arrayList3 = this.Q3;
                if (s3Var == null) {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                        org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) arrayList3.get(i10);
                        org.telegram.ui.Components.voip.r rVar = yVar.f39718c;
                        if (rVar != null) {
                            rVar.setRenderer(null);
                            org.telegram.ui.Components.h10 h10Var = yVar.d;
                            if (h10Var != null) {
                                h10Var.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.r rVar2 = yVar.f39721e;
                            if (rVar2 != null) {
                                rVar2.setRenderer(null);
                            }
                            arrayList.add(yVar.f39745x);
                            yVar.b(false);
                            yVar.animate().alpha(0.0f).setListener(new w20(this, yVar, 0));
                        }
                    }
                    this.G4 = false;
                    h40Var.H(this.f45205e4, true, true);
                } else {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        org.telegram.ui.Components.voip.y yVar2 = (org.telegram.ui.Components.voip.y) arrayList3.get(i11);
                        if (yVar2.f39721e != null && ((s3Var2 = yVar2.f39745x) == null || !s3Var2.equals(s3Var))) {
                            arrayList.add(yVar2.f39745x);
                            yVar2.b(false);
                            org.telegram.ui.Components.h10 h10Var2 = yVar2.d;
                            if (h10Var2 != null) {
                                h10Var2.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.r rVar3 = yVar2.f39718c;
                            if (rVar3 != null) {
                                rVar3.setRenderer(null);
                            }
                            yVar2.animate().alpha(0.0f).setListener(new w20(this, yVar2, 1));
                        }
                    }
                    this.G4 = true;
                    h40Var.f46143r = false;
                    if (!arrayList.isEmpty()) {
                        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.m51(28, this, arrayList));
                    }
                }
                ViewTreeObserver viewTreeObserver = m30Var.getViewTreeObserver();
                nh nhVar = new nh(this, s3Var, !b20Var.f39382b);
                this.f45217h4 = nhVar;
                viewTreeObserver.addOnPreDrawListener(nhVar);
                return;
            }
            if (this.f45217h4 != null) {
                m30Var.getViewTreeObserver().removeOnPreDrawListener(this.f45217h4);
                this.f45217h4 = null;
            }
            if (s3Var != null) {
                x10 x10Var = this.f45201d4;
                if (x10Var.getVisibility() != 0) {
                    x10Var.setVisibility(0);
                    org.telegram.ui.Components.i10 i10Var = this.f45213g4;
                    i10Var.G(x10Var, false);
                    this.f45225j2 = true;
                    if (!b20Var.f39382b) {
                        ArrayList arrayList4 = i10Var.f34515e;
                        v4.b0 b0Var = (v4.b0) x10Var.getLayoutManager();
                        if (b0Var != null) {
                            while (true) {
                                if (i7 >= arrayList4.size()) {
                                    break;
                                } else if (((org.telegram.messenger.s3) arrayList4.get(i7)).equals(s3Var)) {
                                    b0Var.h1(i7, org.telegram.messenger.g0.L(13.0f));
                                    break;
                                } else {
                                    i7++;
                                }
                            }
                        }
                    }
                    ViewTreeObserver viewTreeObserver2 = m30Var.getViewTreeObserver();
                    mw mwVar = new mw(1, this, s3Var);
                    this.f45217h4 = mwVar;
                    viewTreeObserver2.addOnPreDrawListener(mwVar);
                    return;
                }
                b20Var.j(s3Var);
                org.telegram.messenger.g0.b4(x10Var);
            } else if (m30Var.getVisibility() != 0) {
                m30Var.setVisibility(0);
                Q0(false);
                this.f45225j2 = true;
                ViewTreeObserver viewTreeObserver3 = m30Var.getViewTreeObserver();
                y20 y20Var = new y20(this, 0);
                this.f45217h4 = y20Var;
                viewTreeObserver3.addOnPreDrawListener(y20Var);
            } else {
                ViewTreeObserver viewTreeObserver4 = m30Var.getViewTreeObserver();
                y20 y20Var2 = new y20(this, 1);
                this.f45217h4 = y20Var2;
                viewTreeObserver4.addOnPreDrawListener(y20Var2);
            }
        }
    }

    public final int k1() {
        Integer num = this.f45254p5;
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

    public final long l1() {
        TLRPC.Chat chat = this.Q2;
        if (chat == null) {
            return 0L;
        }
        return chat.f26956id;
    }

    @Override
    public final boolean m0() {
        f45183v5 = true;
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.F2, new Object[0]);
        org.telegram.ui.Components.q10.k(getContext());
        return false;
    }

    public final void m1(boolean z9) {
        boolean z10;
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        org.telegram.messenger.c cVar = this.f45228k1;
        int i7 = cVar.f21765a;
        int i10 = cVar.f21765a;
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(l1()));
        if (M0 != null && !org.telegram.messenger.t3.t0(M0)) {
            TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(i10).N0(l1());
            String K = org.telegram.messenger.t3.K(this.Q2, false);
            if (!TextUtils.isEmpty(K)) {
                str = org.telegram.ui.Cells.f1.n(org.telegram.messenger.qp.s1(i10).U2, "/", K, new StringBuilder());
            } else if (N0 != null && (tL_chatInviteExported = N0.exported_invite) != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                tL_messages_exportChatInvite.peer = org.telegram.messenger.qp.l1(this.Q2);
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_exportChatInvite, new bi.u9(this, N0, z9, 6));
                return;
            }
            z1(null, str, true, z9);
        } else if (this.R2 != null) {
            for (int i11 = 0; i11 < 2; i11++) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                org.telegram.messenger.r3 r3Var = this.R2;
                exportgroupcallinvite.call = r3Var.g(r3Var.f25221a);
                if (i11 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                exportgroupcallinvite.can_self_unmute = z10;
                ConnectionsManager.getInstance(i10).sendRequest(exportgroupcallinvite, new org.telegram.messenger.cd(this, i11, z9, 2));
            }
        }
    }

    public final UndoView n1() {
        if (!f45185x5) {
            b20 b20Var = this.R3;
            if (b20Var.f39382b) {
                return b20Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.f45188a2;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.d(2, true);
            this.f28624b.removeView(undoViewArr[0]);
            this.f28624b.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void o1() {
        VoIPService sharedInstance;
        int i7;
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (!this.f45233l2 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            this.f45233l2 = true;
            this.f45275u2.addAll(this.R2.f25226g);
            this.f45279v2.addAll(this.f45215h2);
            this.f45283w2.addAll(this.R2.f25228j);
            this.f45287x2.addAll(this.R2.f25231m);
            this.f45291y2.addAll(this.R2.f25230l);
            this.K3 = sharedInstance.getCallState();
            if (this.R2 == null) {
                org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
                this.R2 = r3Var;
                this.f45213g4.f34514c = r3Var;
                this.R3.setGroupCall(r3Var);
                this.f45209f4.f46139c = this.R2;
            }
            nh.h hVar = this.T1;
            if (hVar != null) {
                hVar.D0(this.f45228k1.f21765a, this.R2.g(false));
            }
            this.F1.setTitleRightMargin(org.telegram.messenger.g0.L(48.0f) * 2);
            ArrayList arrayList = this.R2.f25224e;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((TLRPC.GroupCallParticipant) arrayList.get(i10)).lastActiveDate = groupCallParticipant.active_date;
            }
            VoIPService.getSharedInstance().registerStateListener(this);
            l30 l30Var = this.M1;
            if (l30Var != null && l30Var.getVisibility() == 0) {
                this.f45255q1.c(2131230918, -1, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28135rh, false), 0.3f, false, org.telegram.messenger.id.M0(2131743364, null), false, true);
                S1(true);
                if (org.telegram.messenger.t3.W(this.Q2)) {
                    i7 = 2131743481;
                } else {
                    i7 = 2131743380;
                }
                this.f45243n3.setText(org.telegram.messenger.id.M0(i7, null));
                m30 m30Var = this.H1;
                m30Var.setVisibility(0);
                org.telegram.ui.ActionBar.r0 r0Var = this.f45197c3;
                r0Var.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m30Var, property, 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(m30Var, View.TRANSLATION_Y, org.telegram.messenger.g0.L(200.0f), 0.0f);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(l30Var, property2, 0.0f);
                Property property3 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(l30Var, property3, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(l30Var, property, 0.0f);
                org.telegram.ui.ActionBar.l5 l5Var = this.L1;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(l5Var, property2, 0.0f);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(l5Var, property3, 0.0f);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(l5Var, property, 0.0f);
                org.telegram.ui.ActionBar.l5 l5Var2 = this.N1;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(l5Var2, property2, 0.0f), ObjectAnimator.ofFloat(l5Var2, property3, 0.0f), ObjectAnimator.ofFloat(l5Var2, property, 0.0f), ObjectAnimator.ofFloat(r0Var, property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(r0Var, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(r0Var, property, 0.0f, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.xq.f40459g);
                animatorSet.addListener(new z20(this, 0));
                animatorSet.setDuration(300L);
                animatorSet.start();
            }
        }
    }

    @Override
    public final void onAudioSettingsChanged() {
        S1(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            H1(0.0f);
        }
        m30 m30Var = this.H1;
        if (m30Var.getVisibility() == 0) {
            org.telegram.messenger.g0.b4(m30Var);
        }
        x10 x10Var = this.f45201d4;
        if (x10Var.getVisibility() == 0) {
            org.telegram.messenger.g0.b4(x10Var);
        }
        ArrayList arrayList = this.Q3;
        arrayList.clear();
        arrayList.addAll(this.P3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).j(true);
        }
    }

    @Override
    public final void onBackPressed() {
        v20 v20Var = this.f45256q2;
        if (v20Var != null) {
            v20Var.b(false, false);
        } else if (this.W3) {
            f1(true);
        } else if (this.R3.f39382b) {
            h1(null);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.s0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z9) {
        ArrayList arrayList = this.Q3;
        arrayList.clear();
        arrayList.addAll(this.P3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).j(true);
        }
        v20 v20Var = this.f45256q2;
        if (v20Var != null && VoIPService.getSharedInstance() != null) {
            v20Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.Z1;
        launchActivity.Z0.add(this.f45240m4);
    }

    @Override
    public final void onMediaStateUpdated(int i7, int i10) {
        org.telegram.messenger.voip.s0.d(this, i7, i10);
    }

    @Override
    public final void onScreenOnChange(boolean z9) {
        org.telegram.messenger.voip.s0.e(this, z9);
    }

    @Override
    public final void onSignalBarsCountChanged(int i7) {
        org.telegram.messenger.voip.s0.f(this, i7);
    }

    @Override
    public final void onStateChanged(int i7) {
        this.K3 = i7;
        T1(isShowing(), false);
    }

    @Override
    public final void onVideoAvailableChange(boolean z9) {
        org.telegram.messenger.voip.s0.h(this, z9);
    }

    public final void p1(final long j3, final boolean z9) {
        if (this.R2 != null) {
            org.telegram.messenger.c cVar = this.f45228k1;
            final TLRPC.User a22 = org.telegram.messenger.qp.s1(cVar.f21765a).a2(Long.valueOf(j3));
            if (a22 != null) {
                final org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, getContext(), null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                org.telegram.messenger.r3 r3Var = this.R2;
                invitetogroupcall.call = r3Var.g(r3Var.f25221a);
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = a22.f27105id;
                tL_inputUser.access_hash = a22.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = ConnectionsManager.getInstance(cVar.f21765a).sendRequest(invitetogroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        e40 e40Var = e40.this;
                        long j10 = j3;
                        org.telegram.ui.ActionBar.u1[] u1VarArr2 = u1VarArr;
                        if (tLObject != null) {
                            org.telegram.messenger.qp.s1(e40Var.f45228k1.f21765a).O3((TLRPC.Updates) tLObject, false);
                            org.telegram.messenger.g0.h3(new bi.w2(e40Var, j10, u1VarArr2, a22, 20));
                            return;
                        }
                        org.telegram.messenger.g0.h3(new bi.o(e40Var, u1VarArr2, z9, tL_error, j10, invitetogroupcall));
                    }
                });
                if (sendRequest != 0) {
                    org.telegram.messenger.g0.i3(new f10(this, u1VarArr, sendRequest, 0), 500L);
                }
            }
        }
    }

    public final boolean q1() {
        float f10;
        int L = org.telegram.messenger.g0.L(74.0f);
        float f11 = this.f45251p2 - L;
        if (this.f28653s0 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - this.f28653s0) / ((L - this.f28653s0) - org.telegram.messenger.g0.L(14.0f)));
        } else {
            f10 = 0.0f;
        }
        if (f10 > 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean r1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            return true;
        }
        return false;
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            RadialProgressView radialProgressView = this.V1;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ch, false));
            }
            org.telegram.ui.ActionBar.r0 r0Var = this.f45193b3;
            if (r0Var != null) {
                int i7 = org.telegram.ui.ActionBar.l6.Vg;
                r0Var.O(org.telegram.ui.ActionBar.l6.x0(null, i7, false), false);
                r0Var.O(org.telegram.ui.ActionBar.l6.x0(null, i7, false), true);
                r0Var.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Sg, false));
            }
            int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Vg, false);
            K1(this.f45248o3, x02);
            K1(this.f45252p3, x02);
            K1(this.f45212g3, x02);
            K1(this.f45216h3, x02);
            K1(this.f45243n3, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27985jh, false));
            K1(this.f45204e3, x02);
            K1(this.f45208f3, x02);
            K1(this.f45221i3, x02);
            K1(this.j3, x02);
            K1(this.f45230k3, x02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        ti.o oVar;
        super.show();
        org.telegram.ui.Components.voip.g1 g1Var = org.telegram.ui.Components.voip.g1.f39306w;
        if (g1Var != null && (oVar = g1Var.f39307a) != null && oVar.e()) {
            org.telegram.ui.Components.voip.g1 g1Var2 = org.telegram.ui.Components.voip.g1.f39306w;
            if (g1Var2.f39307a != null) {
                org.telegram.ui.Components.voip.q0 q0Var = g1Var2.f39310e;
                g1Var2.f39310e = null;
                g1Var2.f39308b.f39229a = null;
                g1Var2.f39307a.a(new org.telegram.ui.Components.fx(7, g1Var2, q0Var));
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.vs(13));
            }
        }
    }

    public final boolean t1() {
        if (!u1() || this.R2.f25225f.isEmpty() || (((org.telegram.messenger.s3) this.R2.f25225f.get(0)).f25411c != 0.0f && ((org.telegram.messenger.s3) this.R2.f25225f.get(0)).f25411c < 1.0f)) {
            return false;
        }
        return true;
    }

    public final boolean u1() {
        org.telegram.messenger.r3 r3Var = this.R2;
        if (r3Var != null && r3Var.f25222b.rtmp_stream) {
            return true;
        }
        return false;
    }

    public final void v1(org.telegram.ui.ActionBar.v2 v2Var, org.telegram.ui.ActionBar.u1 u1Var, EditTextBoldCursor editTextBoldCursor, boolean z9) {
        long j3;
        if (!this.f45242n2) {
            org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.Z1.M().getFragmentStack().get(this.Z1.M().getFragmentStack().size() - 1);
            if (f2Var instanceof cn) {
                boolean ra2 = ((cn) f2Var).ra();
                this.f45242n2 = true;
                this.f45247o2 = true;
                xn xnVar = new xn(v2Var, editTextBoldCursor, z9, u1Var, 7);
                if (ra2) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                org.telegram.messenger.g0.i3(xnVar, j3);
                return;
            }
            this.f45242n2 = true;
            this.f45247o2 = true;
            if (v2Var != null) {
                v2Var.A0(true);
            } else if (u1Var != null) {
                u1Var.l(true);
            }
            if (z9) {
                org.telegram.messenger.g0.i3(new rg(editTextBoldCursor, 2), 100L);
            }
        }
    }

    public final void x1() {
        f45187z5 = true;
        ArrayList arrayList = this.Q3;
        arrayList.clear();
        arrayList.addAll(this.P3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).j(false);
        }
        k30 k30Var = this.C1;
        org.telegram.ui.Components.z61 z61Var = k30Var.f38501w;
        if (z61Var != null) {
            z61Var.c(false);
        }
        k30Var.F = true;
        this.f45290y1.r();
    }

    public final void y1() {
        f45187z5 = false;
        this.G1.f();
        x10 x10Var = this.f45201d4;
        if (x10Var.getVisibility() == 0) {
            this.f45213g4.G(x10Var, false);
        }
        if (f45185x5) {
            this.f45209f4.I(this.f45205e4, false);
        }
        ArrayList arrayList = this.Q3;
        arrayList.clear();
        arrayList.addAll(this.P3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).j(true);
        }
        k30 k30Var = this.C1;
        org.telegram.ui.Components.z61 z61Var = k30Var.f38501w;
        if (z61Var != null) {
            z61Var.c(true);
        }
        k30Var.F = false;
        this.f45290y1.s();
    }

    public final void z1(java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e40.z1(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    @Override
    public final void F(float f10, int i7) {
    }
}

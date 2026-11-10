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
public final class f40 extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.ls, VoIPService.StateListener, te.b {
    public static boolean A5;
    public static volatile org.telegram.messenger.q5 B5 = new org.telegram.messenger.q5("updateTextureLightningQueue", true);
    public static boolean C5;
    public static f40 f45501x5;
    public static boolean f45502y5;
    public static boolean f45503z5;
    public final m20 A1;
    public final ArrayList A2;
    public boolean A3;
    public final org.telegram.ui.Components.zg0 A4;
    public final k20 B1;
    public final ArrayList B2;
    public boolean B3;
    public int B4;
    public final ImageView C1;
    public int C2;
    public final Paint C3;
    public boolean C4;
    public final ImageView D1;
    public final org.telegram.ui.Components.zg0 D2;
    public final Paint D3;
    public final View D4;
    public org.telegram.ui.Components.ii0 E1;
    public final org.telegram.ui.Components.zg0 E2;
    public final e40[] E3;
    public final View E4;
    public final l30 F1;
    public boolean F2;
    public float F3;
    public GradientDrawable F4;
    public final org.telegram.ui.Components.i6 G1;
    public final org.telegram.ui.Components.q9 G2;
    public e40 G3;
    public final int[] G4;
    public final v10 H1;
    public final org.telegram.ui.Components.q9 H2;
    public e40 H3;
    public final z10 H4;
    public final c30 I1;
    public float I2;
    public long I3;
    public boolean I4;
    public final z30 J1;
    public float J2;
    public float J3;
    public boolean J4;
    public final n30 K1;
    public float K2;
    public float K3;
    public RenderNode K4;
    public final t20 L1;
    public RadialGradient L2;
    public boolean L3;
    public float L4;
    public final TextView M1;
    public final Matrix M2;
    public boolean M3;
    public boolean M4;
    public final r20 N1;
    public final Paint N2;
    public int N3;
    public final String[] N4;
    public final org.telegram.ui.ActionBar.m5 O1;
    public final u30 O2;
    public float O3;
    public ObjectAnimator O4;
    public final m30 P1;
    public float P2;
    public int P3;
    public ObjectAnimator P4;
    public final org.telegram.ui.ActionBar.m5 Q1;
    public float Q2;
    public boolean Q3;
    public final y20 Q4;
    public final t30 R1;
    public ValueAnimator R2;
    public final int[] R3;
    public org.telegram.ui.Cells.f4 R4;
    public final org.telegram.ui.Components.ky S1;
    public TLRPC.InputPeer S2;
    public final ArrayList S3;
    public org.telegram.ui.Components.voip.r S4;
    public final ImageReceiver T1;
    public TLRPC.Chat T2;
    public final ArrayList T3;
    public org.telegram.ui.Components.voip.y T4;
    public int U1;
    public org.telegram.messenger.r3 U2;
    public final c20 U3;
    public org.telegram.ui.Components.g10 U4;
    public final ImageView V1;
    public final boolean V2;
    public final h20 V3;
    public boolean V4;
    public final nh.h W1;
    public final String W2;
    public final u20 W3;
    public boolean W4;
    public final int X1;
    public final a40 X2;
    public float X3;
    public int X4;
    public final RadialProgressView Y1;
    public final u10 Y2;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout Y3;
    public AnimatorSet Y4;
    public final Drawable Z1;
    public final w10 Z2;
    public boolean Z3;
    public h30 Z4;
    public final View f45504a2;
    public final Paint f45505a3;
    public boolean f45506a4;
    public int f45507a5;
    public AnimatorSet f45508b2;
    public ValueAnimator f45509b3;
    public org.telegram.ui.Components.j30 f45510b4;
    public int f45511b5;
    public LaunchActivity f45512c2;
    public float f45513c3;
    public o30 f45514c4;
    public int f45515c5;
    public final UndoView[] d2;
    public final LinearLayout f45516d3;
    public Boolean f45517d4;
    public int f45518d5;
    public final org.telegram.ui.Cells.k f45519e2;
    public final org.telegram.ui.ActionBar.r0 f45520e3;
    public int f45521e4;
    public int f45522e5;
    public boolean f45523f2;
    public final org.telegram.ui.ActionBar.r0 f45524f3;
    public boolean f45525f4;
    public int f45526f5;
    public org.telegram.ui.Components.y20 f45527g2;
    public final org.telegram.ui.ActionBar.r0 f45528g3;
    public final y10 f45529g4;
    public int f45530g5;
    public org.telegram.ui.Components.y20 f45531h2;
    public final org.telegram.ui.ActionBar.z0 f45532h3;
    public final org.telegram.ui.Components.pj0 f45533h4;
    public int f45534h5;
    public int f45535i2;
    public final org.telegram.ui.ActionBar.z0 f45536i3;
    public final i40 f45537i4;
    public int f45538i5;
    public g.b f45539j2;
    public final org.telegram.ui.ActionBar.z0 j3;
    public final org.telegram.ui.Components.h10 f45540j4;
    public int f45541j5;
    public final ArrayList f45542k2;
    public final org.telegram.ui.ActionBar.z0 f45543k3;
    public ViewTreeObserver.OnPreDrawListener f45544k4;
    public int f45545k5;
    public final e20 l1;
    public b30 f45546l2;
    public final org.telegram.ui.ActionBar.z0 f45547l3;
    public final org.telegram.ui.Components.voip.n f45548l4;
    public int f45549l5;
    public final j10 f45550m1;
    public boolean f45551m2;
    public final org.telegram.ui.ActionBar.z0 f45552m3;
    public boolean f45553m4;
    public int f45554m5;
    public final org.telegram.messenger.c n1;
    public long f45555n2;
    public final org.telegram.ui.ActionBar.z0 f45556n3;
    public final ArrayList f45557n4;
    public int f45558n5;
    public final p10 f45559o1;
    public boolean f45560o2;
    public final org.telegram.ui.ActionBar.z0 f45561o3;
    public boolean o4;
    public int f45562o5;
    public final org.telegram.ui.Components.voip.n2 f45563p1;
    public final RectF f45564p2;
    public final org.telegram.ui.ActionBar.z0 f45565p3;
    public final v00 f45566p4;
    public int f45567p5;
    public final org.telegram.ui.Components.voip.n2 f45568q1;
    public boolean f45569q2;
    public final org.telegram.ui.ActionBar.z0 f45570q3;
    public final t10 f45571q4;
    public final i30 f45572q5;
    public final org.telegram.ui.Components.voip.n2 f45573r1;
    public boolean f45574r2;
    public final org.telegram.ui.ActionBar.z0 f45575r3;
    public final org.telegram.ui.Components.us f45576r4;
    public Boolean f45577r5;
    public final org.telegram.ui.Components.voip.n2 f45578s1;
    public float f45579s2;
    public final org.telegram.ui.ActionBar.z0 f45580s3;
    public final v00 f45581s4;
    public Integer s5;
    public final org.telegram.ui.Components.voip.n2 f45582t1;
    public w20 f45583t2;
    public final LinearLayout f45584t3;
    public boolean f45585t4;
    public final te.a f45586t5;
    public final org.telegram.ui.Components.voip.n2 f45587u1;
    public TLRPC.Peer f45588u2;
    public final TextView f45589u3;
    public final m4 f45590u4;
    public final te.a f45591u5;
    public final org.telegram.ui.Components.voip.n2 f45592v1;
    public TLObject f45593v2;
    public final d40 f45594v3;
    public final LongSparseIntArray f45595v4;
    public final te.c f45596v5;
    public final q10 f45597w1;
    public final Paint f45598w2;
    public final rh.h f45599w3;
    public final f20 f45600w4;
    public final te.a f45601w5;
    public final ImageView f45602x1;
    public final ArrayList f45603x2;
    public v00 f45604x3;
    public final d20 f45605x4;
    public final Paint f45606y1;
    public final ArrayList f45607y2;
    public org.telegram.ui.Components.h20 f45608y3;
    public LinearLayout f45609y4;
    public final n20 f45610z1;
    public final ArrayList f45611z2;
    public int f45612z3;
    public boolean f45613z4;

    public f40(final LaunchActivity launchActivity, org.telegram.messenger.c cVar, org.telegram.messenger.r3 r3Var, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z9, String str) {
        super((Context) launchActivity, (org.telegram.ui.ActionBar.h6) null, true, true);
        int i7;
        final f40 f40Var;
        final ?? r10;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.f45606y1 = new Paint(1);
        this.d2 = new UndoView[2];
        this.f45542k2 = new ArrayList();
        this.f45564p2 = new RectF();
        this.f45598w2 = new Paint(1);
        this.f45603x2 = new ArrayList();
        this.f45607y2 = new ArrayList();
        this.f45611z2 = new ArrayList();
        this.A2 = new ArrayList();
        this.B2 = new ArrayList();
        this.f45599w3 = new rh.h(new v00(this, 4));
        this.f45612z3 = 0;
        this.A3 = false;
        this.C3 = new Paint(7);
        this.D3 = new Paint(7);
        this.E3 = new e40[8];
        this.F3 = 1.0f;
        this.Q3 = true;
        this.R3 = new int[4];
        this.S3 = new ArrayList();
        this.T3 = new ArrayList();
        this.f45548l4 = new org.telegram.ui.Components.voip.n();
        this.f45557n4 = new ArrayList();
        this.f45566p4 = new v00(this, 0);
        this.f45571q4 = new t10(this);
        this.f45576r4 = new org.telegram.ui.Components.us(18);
        this.f45581s4 = new v00(this, 1);
        this.f45585t4 = false;
        this.f45590u4 = new m4(this, 7);
        this.f45595v4 = new LongSparseIntArray();
        this.G4 = new int[2];
        this.J4 = true;
        this.N4 = new String[2];
        this.X4 = -1;
        this.f45572q5 = new i30(this);
        org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.f40046f;
        this.f45586t5 = new te.a(2, this, wqVar, 350L);
        this.f45591u5 = new te.a(3, this, wqVar, 220L, true);
        this.f45596v5 = new te.c(4, this, wqVar, 350L);
        this.f45601w5 = new te.a(5, this, wqVar, 350L);
        org.telegram.messenger.g0.S(getWindow());
        D0();
        this.n1 = cVar;
        this.U2 = r3Var;
        this.S2 = inputPeer;
        this.T2 = chat;
        this.W2 = str;
        this.f28669a = cVar.f21770a;
        this.V2 = z9;
        this.I0 = new di.i0();
        this.P0 = true;
        this.Q0 = true;
        this.X1 = org.telegram.messenger.qp.s1(this.f28669a).f24946x7.f24467x.U();
        this.U = true;
        A5 = false;
        f45503z5 = false;
        C5 = false;
        this.f28713y0 = new o20(this);
        this.f28703s = true;
        this.f28696n = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.f28708w = true;
        this.F0 = -1;
        this.Q4 = new y20(this);
        setOnDismissListener(new z00(this, 0));
        z0();
        z30 z30Var = new z30(this, launchActivity);
        this.J1 = z30Var;
        org.telegram.ui.Components.ap apVar = new org.telegram.ui.Components.ap(true);
        int i10 = org.telegram.ui.ActionBar.m6.f27919eh;
        apVar.b(org.telegram.ui.ActionBar.m6.v0(i10));
        apVar.d();
        c30 c30Var = new c30(this, launchActivity, apVar);
        this.I1 = c30Var;
        c30Var.setSubtitle("");
        c30Var.getSubtitleTextView().setVisibility(0);
        c30Var.q();
        c30Var.getAdditionalSubtitleTextView().setPadding(org.telegram.messenger.g0.L(24.0f), 0, 0, 0);
        org.telegram.messenger.g0.W3(1.0f, c30Var.getAdditionalSubtitleTextView(), this.o4, false);
        c30Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.m6.v0(i10));
        int i11 = org.telegram.ui.ActionBar.m6.Zg;
        org.telegram.ui.ActionBar.t6.l(c30Var, 6, i11, null);
        c30Var.setBackButtonImage(2131231240);
        c30Var.setOccupyStatusBar(false);
        c30Var.setAllowOverlayTitle(false);
        int i12 = org.telegram.ui.ActionBar.m6.Vg;
        org.telegram.ui.ActionBar.t6.l(c30Var, 1, i12, null);
        org.telegram.ui.ActionBar.t6.l(c30Var, 3, org.telegram.ui.ActionBar.m6.f28302z8, null);
        org.telegram.ui.ActionBar.t6.d(c30Var, i12);
        org.telegram.ui.ActionBar.t6.l(c30Var, 6, i11, null);
        c30Var.setActionBarMenuOnItemClick(new k30(this, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.f45588u2 = tL_peerUser;
            i7 = i12;
            tL_peerUser.user_id = cVar.d().e();
        } else {
            i7 = i12;
            if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                this.f45588u2 = tL_peerChannel;
                tL_peerChannel.channel_id = groupCallPeer.channel_id;
            } else if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                this.f45588u2 = tL_peerUser2;
                tL_peerUser2.user_id = groupCallPeer.user_id;
            } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                this.f45588u2 = tL_peerChat;
                tL_peerChat.chat_id = groupCallPeer.chat_id;
            }
        }
        VoIPService.audioLevelsCallback = new u00(this, 2);
        cVar.b().c(this, org.telegram.messenger.qs.f25103w2);
        cVar.b().c(this, org.telegram.messenger.qs.M0);
        cVar.b().c(this, org.telegram.messenger.qs.T);
        cVar.b().c(this, org.telegram.messenger.qs.f25089u1);
        cVar.b().c(this, org.telegram.messenger.qs.B2);
        cVar.b().c(this, org.telegram.messenger.qs.E0);
        cVar.b().c(this, org.telegram.messenger.qs.f25024j0);
        cVar.b().c(this, org.telegram.messenger.qs.f25067r);
        cVar.b().c(this, org.telegram.messenger.qs.f25124z2);
        cVar.b().c(this, org.telegram.messenger.qs.f25117y2);
        cVar.b().c(this, org.telegram.messenger.qs.R3);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.N4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.D2);
        this.Z1 = launchActivity.getResources().getDrawable(2131232728).mutate();
        org.telegram.ui.Components.zg0 zg0Var = new org.telegram.ui.Components.zg0(2131624344, org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(46.0f), true, null);
        this.D2 = zg0Var;
        this.E2 = new org.telegram.ui.Components.zg0(2131624044, org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(46.0f), true, null);
        l30 l30Var = new l30(this, launchActivity);
        this.F1 = l30Var;
        this.f28672b = l30Var;
        l30Var.setClipToPadding(false);
        this.f28672b.setFocusable(true);
        this.f28672b.setFocusableInTouchMode(true);
        this.f28672b.setWillNotDraw(false);
        ViewGroup viewGroup = this.f28672b;
        int i13 = this.f28705t0;
        viewGroup.setPadding(i13, 0, i13, 0);
        this.f28672b.setKeepScreenOn(true);
        this.f28672b.setClipChildren(false);
        this.T1 = new ImageReceiver(this.f28672b);
        if (inputPeer != null) {
            org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(launchActivity);
            this.O1 = m5Var;
            m5Var.setGravity(17);
            m5Var.setTextColor(-1);
            m5Var.setTypeface(org.telegram.messenger.g0.o());
            m5Var.setTextSize(18);
            m5Var.k(org.telegram.messenger.id.L0(2131743435));
            this.f28672b.addView(m5Var, c8.ha.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            m30 m30Var = new m30(this, launchActivity);
            this.P1 = m30Var;
            m30Var.setGravity(17);
            m30Var.setTextColor(-1);
            m30Var.setTypeface(org.telegram.messenger.g0.o());
            m30Var.setTextSize(60);
            this.f28672b.addView(m30Var, c8.ha.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(launchActivity);
            this.Q1 = m5Var2;
            m5Var2.setGravity(17);
            m5Var2.setTextColor(-1);
            m5Var2.setTypeface(org.telegram.messenger.g0.o());
            m5Var2.setTextSize(18);
            this.f28672b.addView(m5Var2, c8.ha.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (u1()) {
            u30 u30Var = new u30(this, launchActivity);
            this.O2 = u30Var;
            this.f28672b.addView(u30Var, c8.ha.d(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        n30 n30Var = new n30(this, launchActivity);
        this.K1 = n30Var;
        n30Var.setClipToPadding(false);
        n30Var.setClipChildren(false);
        t30 t30Var = new t30(this);
        this.R1 = t30Var;
        t30Var.f57108o = wqVar;
        t30Var.d = 350L;
        t30Var.f57124c = 350L;
        t30Var.f57125e = 350L;
        t30Var.S();
        n30Var.setItemAnimator(t30Var);
        n30Var.setOnScrollListener(new i10(this));
        n30Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.ky kyVar = new org.telegram.ui.Components.ky(f45503z5 ? 6 : 2, n30Var);
        this.S1 = kyVar;
        n30Var.setLayoutManager(kyVar);
        j10 j10Var = new j10(this);
        this.f45550m1 = j10Var;
        kyVar.z1(j10Var);
        n30Var.i(new k10(this));
        kyVar.C1();
        this.f28672b.addView(n30Var, c8.ha.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        n30Var.setAdapter(z30Var);
        n30Var.setTopBottomSelectorRadius(13);
        org.telegram.ui.ActionBar.t6.I(org.telegram.ui.ActionBar.m6.Sg, n30Var);
        n30Var.setOnItemClickListener(new a7(this, launchActivity, r3Var, 14));
        n30Var.setOnItemLongClickListener(new u00(this, 3));
        if (u1()) {
            d40 d40Var = new d40(this, getContext());
            this.f45594v3 = d40Var;
            this.f28672b.addView(d40Var, c8.ha.d(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(launchActivity);
        this.f45533h4 = pj0Var;
        this.f28672b.addView(pj0Var, c8.ha.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        i40 i40Var = new i40(r3Var, this.f28669a, this);
        this.f45537i4 = i40Var;
        pj0Var.setAdapter(i40Var);
        v4.s sVar = new v4.s(6, false);
        pj0Var.setLayoutManager(sVar);
        sVar.z1(new m10(this));
        pj0Var.setOnItemClickListener(new org.telegram.ui.Components.bj0(this) {
            public final f40 f50006b;

            {
                this.f50006b = this;
            }

            @Override
            public final void c(int i14, View view) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.g10 g10Var = (org.telegram.ui.Components.g10) view;
                        org.telegram.messenger.s3 videoParticipant = g10Var.getVideoParticipant();
                        f40 f40Var2 = this.f50006b;
                        if (videoParticipant == null) {
                            f40Var2.h1(new org.telegram.messenger.s3(g10Var.getParticipant(), false));
                            return;
                        } else {
                            f40Var2.h1(g10Var.getVideoParticipant());
                            return;
                        }
                    default:
                        f40 f40Var3 = this.f50006b;
                        f40Var3.getClass();
                        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) view;
                        if (rVar.getParticipant() != null) {
                            f40Var3.h1(rVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        v4.k kVar = new v4.k();
        kVar.S();
        kVar.f57108o = wqVar;
        kVar.d = 350L;
        kVar.f57124c = 350L;
        kVar.f57125e = 350L;
        pj0Var.setItemAnimator(new n10(this));
        pj0Var.setOnScrollListener(new o10(this));
        i40Var.H(pj0Var, false, false);
        pj0Var.setVisibility(8);
        p10 p10Var = new p10(this, launchActivity);
        this.f45559o1 = p10Var;
        int v02 = org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.f28273xh);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.M2 = new Matrix();
        this.L2 = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.N2 = paint;
        paint.setShader(this.L2);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(9);
        this.G2 = q9Var;
        org.telegram.ui.Components.q9 q9Var2 = new org.telegram.ui.Components.q9(12);
        this.H2 = q9Var2;
        q9Var.f37178a = org.telegram.messenger.g0.L(62.0f) * 0.45454547f;
        q9Var.f37179b = org.telegram.messenger.g0.L(72.0f) * 0.45454547f;
        q9Var.b();
        q9Var2.f37178a = org.telegram.messenger.g0.L(65.0f) * 0.45454547f;
        q9Var2.f37179b = org.telegram.messenger.g0.L(75.0f) * 0.45454547f;
        q9Var2.b();
        int i14 = org.telegram.ui.ActionBar.m6.f28254wh;
        q9Var.d.setColor(i0.a.o(org.telegram.ui.ActionBar.m6.v0(i14), 38));
        q9Var2.d.setColor(i0.a.o(org.telegram.ui.ActionBar.m6.v0(i14), 76));
        org.telegram.ui.Components.voip.n2 n2Var = new org.telegram.ui.Components.voip.n2(launchActivity, 50.0f);
        this.f45578s1 = n2Var;
        n2Var.setCheckable(true);
        n2Var.setTextSize(12);
        p10Var.a(n2Var);
        n2Var.setOnClickListener(new s00(this, 6));
        org.telegram.ui.Components.voip.n2 n2Var2 = new org.telegram.ui.Components.voip.n2(launchActivity, 50.0f);
        this.f45573r1 = n2Var2;
        n2Var2.setCheckable(true);
        n2Var2.setTextSize(12);
        n2Var2.d(false, false);
        n2Var2.setCrossOffset(-org.telegram.messenger.g0.N(3.5f));
        n2Var2.c(2131230926, -1, 0, 1.0f, true, org.telegram.messenger.id.L0(2131743489), false, false);
        org.telegram.ui.Components.voip.n2 n2Var3 = new org.telegram.ui.Components.voip.n2(launchActivity, 50.0f);
        this.f45563p1 = n2Var3;
        n2Var3.setCheckable(true);
        n2Var3.setTextSize(12);
        n2Var3.d(false, false);
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(launchActivity);
        n2Var3.addView(ch0Var, c8.ha.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.zg0 zg0Var2 = new org.telegram.ui.Components.zg0(2131623962, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        this.A4 = zg0Var2;
        ch0Var.setAnimation(zg0Var2);
        n2Var3.setOnClickListener(new s00(this, 9));
        p10Var.a(n2Var3);
        org.telegram.ui.Components.voip.n2 n2Var4 = new org.telegram.ui.Components.voip.n2(launchActivity, 50.0f);
        this.f45568q1 = n2Var4;
        n2Var4.setCheckable(true);
        n2Var4.setTextSize(12);
        n2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.V1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.U1 = 2131231171;
        imageView.setImageResource(2131231171);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        n2Var4.addView(imageView, c8.ha.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        n2Var4.setOnClickListener(new s00(this, 10));
        p10Var.a(n2Var4);
        p10Var.a(n2Var2);
        org.telegram.ui.Components.voip.n2 n2Var5 = new org.telegram.ui.Components.voip.n2(launchActivity, 50.0f);
        this.f45582t1 = n2Var5;
        n2Var5.setTextSize(12);
        n2Var5.c(2131230918, -1, org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.f28160rh), 0.3f, false, org.telegram.messenger.id.L0(2131743364), false, false);
        n2Var5.setOnClickListener(new View.OnClickListener(this) {
            public final f40 f51855b;

            {
                this.f51855b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        f40 f40Var2 = this.f51855b;
                        LaunchActivity launchActivity2 = f40Var2.f45512c2;
                        if (launchActivity2 != null && launchActivity2.checkSelfPermission("android.permission.CAMERA") != 0) {
                            f40Var2.f45512c2.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
                            return;
                        } else if (VoIPService.getSharedInstance() != null) {
                            boolean z10 = false;
                            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                                f40Var2.d2[0].d(1, false);
                                if (f40Var2.f45583t2 == null) {
                                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                                    if (sharedInstance != null) {
                                        sharedInstance.createCaptureDevice(false);
                                    }
                                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                                        z10 = true;
                                    }
                                    w20 w20Var = new w20(f40Var2, launchActivity, z10);
                                    f40Var2.f45583t2 = w20Var;
                                    w20Var.setBottomPadding(f40Var2.f28672b.getPaddingBottom());
                                    f40Var2.f28675c.addView(f40Var2.f45583t2);
                                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                                        sharedInstance.switchCamera();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            VoIPService.getSharedInstance().setVideoState(false, 0);
                            f40Var2.T1(true, false);
                            f40Var2.S1(false);
                            f40Var2.U2.z();
                            f40Var2.Q0(true);
                            f40Var2.f45559o1.requestLayout();
                            return;
                        } else {
                            return;
                        }
                    default:
                        f40 f40Var3 = this.f51855b;
                        f40Var3.U3.e();
                        org.telegram.messenger.r3 r3Var2 = f40Var3.U2;
                        if (r3Var2 != null && !r3Var2.j()) {
                            f40Var3.O1();
                            f40.w1(launchActivity, new v00(f40Var3, 5), false, false);
                            return;
                        }
                        f40Var3.dismiss();
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.n2 n2Var6 = new org.telegram.ui.Components.voip.n2(launchActivity, 50.0f);
        this.f45587u1 = n2Var6;
        n2Var6.setCheckable(true);
        n2Var6.b(true, false);
        n2Var6.setTextSize(12);
        n2Var6.c(2131231186, -1, 0, 1.0f, true, org.telegram.messenger.id.L0(2131743294), false, false);
        q10 q10Var = new q10(this, launchActivity);
        this.f45597w1 = q10Var;
        q10Var.setAnimation(zg0Var);
        q10Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.n2 n2Var7 = new org.telegram.ui.Components.voip.n2(launchActivity, 50.0f);
        this.f45592v1 = n2Var7;
        n2Var7.setDrawBackground(false);
        n2Var7.setTextSize(12);
        n2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        n2Var7.addView(q10Var, c8.ha.e(50, 50, 49));
        p10Var.a(n2Var7);
        n2Var7.setOnClickListener(new s10(this));
        p10Var.a(n2Var6);
        p10Var.a(n2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.f45602x1 = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(2131232799);
        n2Var7.addView(imageView2, c8.ha.d(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.U2 != null && u1() && !this.U2.j()) {
            imageView2.setVisibility(0);
            q10Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.Y1 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.Ch));
        c30Var.setAlpha(0.0f);
        c30Var.getBackButton().setScaleX(0.9f);
        c30Var.getBackButton().setScaleY(0.9f);
        c30Var.getBackButton().setTranslationX(-org.telegram.messenger.g0.L(14.0f));
        c30Var.getTitleTextView().setTranslationY(org.telegram.messenger.g0.L(23.0f));
        c30Var.getSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(20.0f));
        c30Var.getAdditionalSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(20.0f));
        org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.m6.v0(i7));
        this.f45520e3 = r0Var;
        r0Var.setLongClickEnabled(false);
        r0Var.setIcon(2131231244);
        r0Var.setContentDescription(org.telegram.messenger.id.L0(2131754839));
        r0Var.setSubMenuOpenSide(2);
        r0Var.setDelegate(new u00(this, 5));
        int i15 = org.telegram.ui.ActionBar.m6.Wg;
        org.telegram.ui.ActionBar.t6.R(r0Var, org.telegram.ui.ActionBar.m6.g0(org.telegram.ui.ActionBar.m6.v0(i15), 6), null, org.telegram.ui.ActionBar.t6.M(i15));
        r0Var.setOnClickListener(new s00(this, 11));
        r0Var.O(org.telegram.ui.ActionBar.m6.v0(i7), false);
        r0Var.O(org.telegram.ui.ActionBar.m6.v0(i7), true);
        org.telegram.ui.ActionBar.r0 r0Var2 = new org.telegram.ui.ActionBar.r0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.m6.v0(i7));
        this.f45524f3 = r0Var2;
        r0Var2.setLongClickEnabled(false);
        r0Var2.setIcon(2131232429);
        r0Var2.setContentDescription(org.telegram.messenger.id.L0(2131754808));
        org.telegram.ui.ActionBar.t6.R(r0Var2, org.telegram.ui.ActionBar.m6.g0(org.telegram.ui.ActionBar.m6.v0(i15), 6), null, org.telegram.ui.ActionBar.t6.M(i15));
        r0Var2.setOnClickListener(new s00(this, 0));
        org.telegram.ui.ActionBar.r0 r0Var3 = new org.telegram.ui.ActionBar.r0(launchActivity, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.m6.v0(i7));
        this.f45528g3 = r0Var3;
        r0Var3.setLongClickEnabled(false);
        r0Var3.setIcon(2131232352);
        r0Var3.setContentDescription(org.telegram.messenger.id.L0(2131754808));
        org.telegram.ui.ActionBar.t6.R(r0Var3, org.telegram.ui.ActionBar.m6.g0(org.telegram.ui.ActionBar.m6.v0(i15), 6), null, org.telegram.ui.ActionBar.t6.M(i15));
        r0Var3.setOnClickListener(new s00(this, 1));
        u10 u10Var = new u10(this, launchActivity, launchActivity);
        this.Y2 = u10Var;
        v10 v10Var = new v10(launchActivity);
        this.H1 = v10Var;
        v10Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.f45505a3 = paint2;
        paint2.setColor(-12761513);
        w10 w10Var = new w10(this, getContext());
        this.Z2 = w10Var;
        org.telegram.ui.ActionBar.t6.U(w10Var, i7, this.I0);
        w10Var.setTextSize(1, 11.0f);
        w10Var.setText(org.telegram.messenger.id.L0(2131743474));
        w10Var.setMaxLines(1);
        w10Var.setGravity(17);
        w10Var.setTypeface(org.telegram.messenger.g0.o());
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        w10Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f));
        w10Var.setTag(-1);
        if (!u1()) {
            w10Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f45516d3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(u10Var, c8.ha.l(1.0f, 0, -2));
        linearLayout.addView(w10Var, c8.ha.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.f28672b.addView(v10Var, c8.ha.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f28672b.addView(linearLayout, c8.ha.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.f28672b.addView(c30Var, c8.ha.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.f45584t3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(r0Var3, c8.ha.o(48, 48));
        linearLayout2.addView(r0Var2, c8.ha.o(48, 48));
        linearLayout2.addView(r0Var, c8.ha.o(48, 48));
        this.f28672b.addView(linearLayout2, c8.ha.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.f45504a2 = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.V5, view, null);
        this.f28672b.addView(view, c8.ha.c(1.0f, -1));
        for (int i16 = 0; i16 < 2; i16++) {
            this.d2[i16] = new x10(this, launchActivity);
            this.d2[i16].setAdditionalTranslationY(org.telegram.messenger.g0.L(10.0f));
            this.d2[i16].setTranslationZ(org.telegram.messenger.g0.L(5.0f));
            this.f28672b.addView(this.d2[i16], c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.k kVar2 = new org.telegram.ui.Cells.k(launchActivity, true);
        this.f45519e2 = kVar2;
        kVar2.setTag(2131296437, 240);
        this.f45520e3.g(kVar2, org.telegram.messenger.g0.L(48.0f));
        this.f45520e3.setShowSubmenuByMove(false);
        int i17 = org.telegram.ui.ActionBar.m6.Sg;
        org.telegram.ui.ActionBar.t6.R(kVar2, org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.v0(i17), 6, 6), null, org.telegram.ui.ActionBar.t6.M(i17));
        org.telegram.ui.ActionBar.r0 r0Var4 = this.f45520e3;
        org.telegram.ui.ActionBar.z0 d = r0Var4.d(1, 0, null, org.telegram.messenger.id.L0(2131743401), true, true, r0Var4.m0);
        this.f45561o3 = d;
        d.m(true, false);
        org.telegram.ui.ActionBar.r0 r0Var5 = this.f45520e3;
        org.telegram.ui.ActionBar.z0 d2 = r0Var5.d(2, 0, null, org.telegram.messenger.id.L0(2131743354), true, true, r0Var5.m0);
        this.f45565p3 = d2;
        d2.m(false, true);
        int i18 = org.telegram.ui.ActionBar.m6.f28029kh;
        d.setCheckColor(i18);
        d.d(org.telegram.ui.ActionBar.m6.v0(i18), org.telegram.ui.ActionBar.m6.v0(i18));
        d2.setCheckColor(i18);
        d2.d(org.telegram.ui.ActionBar.m6.v0(i18), org.telegram.ui.ActionBar.m6.v0(i18));
        Paint paint3 = new Paint(1);
        int i19 = org.telegram.ui.ActionBar.m6.Vg;
        paint3.setColor(org.telegram.ui.ActionBar.m6.v0(i19));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.r0 r0Var6 = this.f45520e3;
        org.telegram.ui.ActionBar.z0 d10 = r0Var6.d(10, 2131232430, null, org.telegram.messenger.id.L0(2131743399), true, false, r0Var6.m0);
        this.j3 = d10;
        d10.setItemHeight(56);
        org.telegram.ui.ActionBar.r0 r0Var7 = this.f45520e3;
        org.telegram.ui.ActionBar.z0 d11 = r0Var7.d(11, 2131232261, null, org.telegram.messenger.id.L0(2131743282), true, false, r0Var7.m0);
        this.f45543k3 = d11;
        d11.setItemHeight(56);
        TextView b10 = this.f45520e3.b(i0.a.f(0.3f, org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.Ug), -16777216));
        this.f45589u3 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.r0 r0Var8 = this.f45520e3;
        org.telegram.ui.ActionBar.z0 d12 = r0Var8.d(6, 2131232116, this.X2, org.telegram.messenger.id.L0(org.telegram.messenger.t3.W(this.T2) ? 2131743485 : 2131743384), true, false, r0Var8.m0);
        this.f45536i3 = d12;
        org.telegram.ui.ActionBar.r0 r0Var9 = this.f45520e3;
        org.telegram.ui.ActionBar.z0 d13 = r0Var9.d(7, 2131232276, this.X2, org.telegram.messenger.id.L0(2131743385), false, false, r0Var9.m0);
        this.f45547l3 = d13;
        org.telegram.ui.ActionBar.z0 e10 = this.f45520e3.e(3, 2131232203, org.telegram.messenger.id.L0(2131743337));
        this.f45532h3 = e10;
        a40 a40Var = new a40();
        this.X2 = a40Var;
        org.telegram.ui.ActionBar.z0 e11 = this.f45520e3.e(9, 2131232352, org.telegram.messenger.id.L0(2131743436));
        this.f45556n3 = e11;
        org.telegram.ui.ActionBar.r0 r0Var10 = this.f45520e3;
        org.telegram.ui.ActionBar.z0 d14 = r0Var10.d(5, 0, a40Var, org.telegram.messenger.id.L0(2131743348), true, false, r0Var10.m0);
        this.f45552m3 = d14;
        a40Var.a(d14.getImageView());
        org.telegram.ui.ActionBar.z0 e12 = this.f45520e3.e(12, 2131231895, org.telegram.messenger.id.L0(2131743484));
        this.f45575r3 = e12;
        org.telegram.ui.ActionBar.z0 e13 = this.f45520e3.e(13, 2131230781, org.telegram.messenger.id.L0(2131743486));
        this.f45580s3 = e13;
        org.telegram.ui.ActionBar.z0 e14 = this.f45520e3.e(4, 2131232087, org.telegram.messenger.id.L0(r1() ? 2131743379 : org.telegram.messenger.t3.W(this.T2) ? 2131743481 : 2131743380));
        this.f45570q3 = e14;
        this.f45520e3.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.m6.v0(i17));
        this.f45520e3.getPopupLayout().setFitItems(true);
        e12.d(org.telegram.ui.ActionBar.m6.v0(i19), org.telegram.ui.ActionBar.m6.v0(i19));
        e13.d(org.telegram.ui.ActionBar.m6.v0(i19), org.telegram.ui.ActionBar.m6.v0(i19));
        d10.d(org.telegram.ui.ActionBar.m6.v0(i19), org.telegram.ui.ActionBar.m6.v0(i19));
        d11.d(org.telegram.ui.ActionBar.m6.v0(i19), org.telegram.ui.ActionBar.m6.v0(i19));
        int i20 = org.telegram.ui.ActionBar.m6.f28010jh;
        e14.d(org.telegram.ui.ActionBar.m6.v0(i20), org.telegram.ui.ActionBar.m6.v0(i20));
        e10.d(org.telegram.ui.ActionBar.m6.v0(i19), org.telegram.ui.ActionBar.m6.v0(i19));
        d12.d(org.telegram.ui.ActionBar.m6.v0(i19), org.telegram.ui.ActionBar.m6.v0(i19));
        d13.d(org.telegram.ui.ActionBar.m6.v0(i19), org.telegram.ui.ActionBar.m6.v0(i19));
        d14.d(org.telegram.ui.ActionBar.m6.v0(i19), org.telegram.ui.ActionBar.m6.v0(i19));
        e11.d(org.telegram.ui.ActionBar.m6.v0(i19), org.telegram.ui.ActionBar.m6.v0(i19));
        if (this.U2 != null) {
            o1();
        }
        if (r1()) {
            this.f45539j2 = new g.b();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.f45539j2.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        V1(false);
        this.I1.getTitleTextView().setOnClickListener(new s00(this, 2));
        y10 y10Var = new y10(this, launchActivity);
        this.f45529g4 = y10Var;
        z10 z10Var = new z10(this);
        this.H4 = z10Var;
        y10Var.setClipToPadding(false);
        z10Var.S();
        z10Var.f57108o = org.telegram.ui.Components.wq.f40046f;
        z10Var.d = 350L;
        z10Var.f57124c = 350L;
        z10Var.f57125e = 350L;
        y10Var.setItemAnimator(z10Var);
        y10Var.setOnScrollListener(new a20(this));
        y10Var.setClipChildren(false);
        v4.b0 b0Var = new v4.b0();
        b0Var.j1(0);
        y10Var.setLayoutManager(b0Var);
        org.telegram.ui.Components.h10 h10Var = new org.telegram.ui.Components.h10(r3Var, this.f28669a, this);
        this.f45540j4 = h10Var;
        y10Var.setAdapter(h10Var);
        h10Var.F(y10Var, false);
        y10Var.setOnItemClickListener(new org.telegram.ui.Components.bj0(this) {
            public final f40 f50006b;

            {
                this.f50006b = this;
            }

            @Override
            public final void c(int i142, View view2) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.g10 g10Var = (org.telegram.ui.Components.g10) view2;
                        org.telegram.messenger.s3 videoParticipant = g10Var.getVideoParticipant();
                        f40 f40Var2 = this.f50006b;
                        if (videoParticipant == null) {
                            f40Var2.h1(new org.telegram.messenger.s3(g10Var.getParticipant(), false));
                            return;
                        } else {
                            f40Var2.h1(g10Var.getVideoParticipant());
                            return;
                        }
                    default:
                        f40 f40Var3 = this.f50006b;
                        f40Var3.getClass();
                        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) view2;
                        if (rVar.getParticipant() != null) {
                            f40Var3.h1(rVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        y10Var.setOnItemLongClickListener(new u00(this, 0));
        y10Var.setVisibility(8);
        y10Var.i(new b20());
        c20 c20Var = new c20(this, launchActivity, this.K1, y10Var, this.S3, this.U2, this);
        this.U3 = c20Var;
        c20Var.setClipChildren(false);
        h10Var.E(this.S3, c20Var);
        if (this.f45533h4 != null) {
            this.f45537i4.G(this.S3, c20Var);
        }
        d20 d20Var = new d20(this, launchActivity);
        this.f45605x4 = d20Var;
        e20 e20Var = new e20(this, launchActivity, this.I1, this.K1, d20Var);
        this.l1 = e20Var;
        e20Var.setImagesLayerNum(Integer.MAX_VALUE);
        e20Var.setInvalidateWithParent(true);
        d20Var.setProfileGalleryView(e20Var);
        f20 f20Var = new f20(this, launchActivity);
        this.f45600w4 = f20Var;
        f20Var.setVisibility(8);
        e20Var.setVisibility(0);
        e20Var.b(new g20(this));
        h20 h20Var = new h20(this, launchActivity);
        this.V3 = h20Var;
        this.f28672b.addView(c20Var);
        c20Var.addView(y10Var, c8.ha.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.f45559o1.setWillNotDraw(false);
        View view2 = new View(launchActivity);
        this.D4 = view2;
        int[] iArr = this.G4;
        iArr[0] = this.P3;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.G4);
        this.F4 = gradientDrawable;
        view2.setBackground(gradientDrawable);
        this.f28672b.addView(view2, c8.ha.e(-1, 60, 83));
        View view3 = new View(launchActivity);
        this.E4 = view3;
        view3.setBackgroundColor(this.G4[0]);
        this.f28672b.addView(view3, c8.ha.e(-1, 0, 83));
        nh.h hVar = new nh.h(launchActivity);
        this.W1 = hVar;
        hVar.setDelegate(new i20(this));
        hVar.setClickCellDelegate(new j20(this));
        org.telegram.messenger.r3 r3Var2 = this.U2;
        if (r3Var2 != null) {
            hVar.D0(this.n1.f21770a, r3Var2.g(false));
        }
        this.f28672b.addView(hVar, c8.ha.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(launchActivity, false, true, true);
        this.G1 = i6Var;
        i6Var.setGravity(17);
        i6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        i6Var.setTextColor(-1);
        i6Var.b(0.4f, 320L, org.telegram.ui.Components.wq.h);
        i6Var.setTypeface(org.telegram.messenger.g0.o());
        this.f28672b.addView(this.f45559o1);
        k20 k20Var = new k20(this, launchActivity, this.F1, LaunchActivity.Q(), this.I0);
        this.B1 = k20Var;
        k20Var.J = true;
        k20Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.X1)});
        k20Var.getEditText().setLinkTextColor(-11683585);
        k20Var.setHint(org.telegram.messenger.id.L0(2131743928));
        k20Var.getEditText().addTextChangedListener(new l20(this));
        k20Var.s();
        m20 m20Var = new m20(this, launchActivity);
        this.A1 = m20Var;
        this.f28672b.addView(m20Var, c8.ha.c(-1.0f, -1));
        n20 n20Var = new n20(launchActivity);
        this.f45610z1 = n20Var;
        n20Var.addView(k20Var, c8.ha.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        n20Var.addView(i6Var, c8.ha.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        i6Var.setTranslationY(-org.telegram.messenger.g0.L(20.0f));
        this.f28672b.addView(n20Var, c8.ha.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.D1 = imageView3;
        int i21 = org.telegram.ui.ActionBar.m6.f27982i6;
        org.telegram.ui.ActionBar.t6.Q(imageView3, org.telegram.ui.ActionBar.m6.h0(V(i21), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i21), this.I0);
        int i22 = org.telegram.ui.ActionBar.m6.f27929f7;
        org.telegram.ui.ActionBar.h6 h6Var = this.I0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.s(imageView3, i22, h6Var, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131230871);
        imageView3.setOnClickListener(new s00(this, 3));
        ImageView imageView4 = new ImageView(launchActivity);
        this.C1 = imageView4;
        org.telegram.ui.ActionBar.t6.Q(imageView4, org.telegram.ui.ActionBar.m6.h0(V(i21), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i21), this.I0);
        org.telegram.ui.ActionBar.t6.s(imageView4, org.telegram.ui.ActionBar.m6.f28225v6, this.I0, mode);
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(2131231460);
        imageView4.setOnClickListener(new s00(this, 4));
        n20Var.addView(imageView3, c8.ha.e(48, 48, 85));
        n20Var.addView(imageView4, c8.ha.e(48, 48, 85));
        this.f28672b.addView(h20Var);
        f20Var.addView(e20Var, c8.ha.c(-1.0f, -1));
        f20Var.addView(d20Var, c8.ha.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f28672b.addView(f20Var, c8.ha.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        Q0(false);
        this.J1.f();
        if (A5) {
            this.f45537i4.I(this.f45533h4, false);
        }
        this.C2 = this.J1.b();
        if (inputPeer != null) {
            TextView textView = new TextView(launchActivity);
            this.M1 = textView;
            textView.setGravity(17);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 14.0f);
            if (org.telegram.messenger.t3.T(this.T2) && (chat2 = this.T2) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            this.f28672b.addView(textView, c8.ha.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.hb0 hb0Var = new org.telegram.ui.Components.hb0(launchActivity);
            hb0Var.setTextColor(-1);
            hb0Var.setSelectorColor(-9598483);
            hb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
            hb0Var.setItemCount(5);
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
            this.N1 = r20Var;
            r20Var.setLines(1);
            r20Var.setSingleLine(true);
            r20Var.setEllipsize(TextUtils.TruncateAt.END);
            r20Var.setGravity(17);
            r20Var.setTextColor(-1);
            r20Var.setTypeface(org.telegram.messenger.g0.o());
            r20Var.setTextSize(1, 14.0f);
            this.f28672b.addView(r20Var, c8.ha.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            r10 = 0;
            r20Var.setOnClickListener(new org.telegram.messenger.video.f(this, hb0Var, p20Var, q20Var, chat, cVar, inputPeer2, 1));
            t20 t20Var = new t20(launchActivity, hb0Var, p20Var, q20Var);
            this.L1 = t20Var;
            t20Var.setWeightSum(1.0f);
            t20Var.setOrientation(0);
            this.f28672b.addView(t20Var, c8.ha.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i23 = calendar.get(1);
            int i24 = calendar.get(6);
            t20Var.addView(hb0Var, c8.ha.l(0.5f, 0, 270));
            hb0Var.setMinValue(0);
            hb0Var.setMaxValue(365);
            hb0Var.setWrapSelectorWheel(false);
            hb0Var.setFormatter(new w00(currentTimeMillis, calendar, i23, 0));
            a1.d dVar = new a1.d(this, hb0Var, p20Var, q20Var, 14);
            f40Var = this;
            hb0Var.setOnValueChangedListener(dVar);
            p20Var.setMinValue(0);
            p20Var.setMaxValue(23);
            t20Var.addView(p20Var, c8.ha.l(0.2f, 0, 270));
            p20Var.setFormatter(new org.telegram.ui.Components.il0(19));
            p20Var.setOnValueChangedListener(dVar);
            q20Var.setMinValue(0);
            q20Var.setMaxValue(59);
            q20Var.setValue(0);
            q20Var.setFormatter(new org.telegram.ui.Components.il0(20));
            t20Var.addView(q20Var, c8.ha.l(0.3f, 0, 270));
            q20Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i25 = calendar.get(6);
            int i26 = calendar.get(12);
            int i27 = calendar.get(11);
            hb0Var.setValue(i24 != i25 ? 1 : 0);
            q20Var.setValue(i26);
            p20Var.setValue(i27);
            org.telegram.ui.Components.u4.g(r20Var, textView, 0L, 604800L, 2, hb0Var, p20Var, q20Var);
        } else {
            f40Var = this;
            r10 = 0;
        }
        u20 u20Var = new u20(f40Var, (ViewGroup) f40Var.getWindow().getDecorView(), f40Var.f28672b);
        f40Var.W3 = u20Var;
        u20Var.E = new v20(f40Var);
        e20Var.setPinchToZoomHelper(u20Var);
        f40Var.f45573r1.setOnClickListener(new View.OnClickListener(f40Var) {
            public final f40 f51855b;

            {
                this.f51855b = f40Var;
            }

            @Override
            public final void onClick(View view4) {
                switch (r10) {
                    case 0:
                        f40 f40Var2 = this.f51855b;
                        LaunchActivity launchActivity2 = f40Var2.f45512c2;
                        if (launchActivity2 != null && launchActivity2.checkSelfPermission("android.permission.CAMERA") != 0) {
                            f40Var2.f45512c2.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
                            return;
                        } else if (VoIPService.getSharedInstance() != null) {
                            boolean z10 = false;
                            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                                f40Var2.d2[0].d(1, false);
                                if (f40Var2.f45583t2 == null) {
                                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                                    if (sharedInstance2 != null) {
                                        sharedInstance2.createCaptureDevice(false);
                                    }
                                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                                        z10 = true;
                                    }
                                    w20 w20Var = new w20(f40Var2, launchActivity, z10);
                                    f40Var2.f45583t2 = w20Var;
                                    w20Var.setBottomPadding(f40Var2.f28672b.getPaddingBottom());
                                    f40Var2.f28675c.addView(f40Var2.f45583t2);
                                    if (sharedInstance2 != null && !sharedInstance2.isFrontFaceCamera()) {
                                        sharedInstance2.switchCamera();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            VoIPService.getSharedInstance().setVideoState(false, 0);
                            f40Var2.T1(true, false);
                            f40Var2.S1(false);
                            f40Var2.U2.z();
                            f40Var2.Q0(true);
                            f40Var2.f45559o1.requestLayout();
                            return;
                        } else {
                            return;
                        }
                    default:
                        f40 f40Var3 = this.f51855b;
                        f40Var3.U3.e();
                        org.telegram.messenger.r3 r3Var22 = f40Var3.U2;
                        if (r3Var22 != null && !r3Var22.j()) {
                            f40Var3.O1();
                            f40.w1(launchActivity, new v00(f40Var3, 5), false, false);
                            return;
                        }
                        f40Var3.dismiss();
                        return;
                }
            }
        });
        f40Var.R1(r10);
        f40Var.O1();
        f40Var.S1(r10);
        f40Var.T1(r10, r10);
        f40Var.G1(0.0f);
        f40Var.U1();
        f40Var.f28672b.addView(new FrameLayout(launchActivity), c8.ha.e(-1, 200, 87));
        f40Var.f45587u1.setOnClickListener(new s00(f40Var, 5));
        f40Var.V0();
        c8.ka.a(f40Var.f45573r1);
        c8.ka.a(f40Var.f45578s1);
        c8.ka.a(f40Var.f45563p1);
        c8.ka.a(f40Var.f45568q1);
        c8.ka.a(f40Var.f45592v1);
        c8.ka.a(f40Var.f45582t1);
        c8.ka.a(f40Var.f45587u1);
        r0.i0.l(f40Var.f28672b, new u00(f40Var, 1));
    }

    public static void B1(org.telegram.messenger.r3 r3Var, boolean z9, long j3, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z9 ? 1 : 0);
        }
        if (r3Var != null) {
            ArrayList arrayList = r3Var.f25229f;
            ArrayList arrayList2 = r3Var.f25228e;
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(j3);
            if (groupCallParticipant != null) {
                r3Var.d.e(j3);
                arrayList2.remove(groupCallParticipant);
                r3Var.f25230g.remove(groupCallParticipant);
                int i7 = 0;
                while (i7 < arrayList.size()) {
                    if (org.telegram.messenger.ij.B1(((org.telegram.messenger.s3) arrayList.get(i7)).f25413a.peer) == org.telegram.messenger.ij.B1(groupCallParticipant.peer)) {
                        arrayList.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                TLRPC.GroupCall groupCall = r3Var.f25226b;
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
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25096v2, new Object[0]);
    }

    public static void I0(final f40 f40Var, Activity activity, org.telegram.messenger.r3 r3Var, View view, int i7) {
        TLRPC.Chat chat;
        final Long l10;
        boolean z9;
        final org.telegram.messenger.q3 q3Var;
        org.telegram.messenger.c cVar = f40Var.n1;
        ArrayList arrayList = f40Var.f45611z2;
        z30 z30Var = f40Var.J1;
        if (view instanceof org.telegram.ui.Components.voip.r) {
            f40Var.h1(((org.telegram.ui.Components.voip.r) view).getParticipant());
        } else if (view instanceof org.telegram.ui.Cells.f4) {
            f40Var.L1((org.telegram.ui.Cells.f4) view);
        } else {
            Collection collection = null;
            if (view instanceof org.telegram.ui.Cells.y3) {
                org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
                if (y3Var.getUser() != null) {
                    if (f40Var.r1()) {
                        int i10 = i7 - z30Var.f52198n;
                        if (i10 >= 0 && i10 < f40Var.U2.f25235m.size()) {
                            l10 = (Long) f40Var.U2.f25235m.get(i7 - z30Var.f52198n);
                        } else {
                            int i11 = i7 - z30Var.f52200s;
                            if (i11 >= 0 && i11 < f40Var.U2.f25234l.size()) {
                                l10 = (Long) f40Var.U2.f25234l.get(i7 - z30Var.f52200s);
                            } else {
                                int i12 = i7 - z30Var.f52197f;
                                if (f40Var.f45551m2) {
                                    if (i12 >= 0 && i12 < arrayList.size()) {
                                        l10 = (Long) arrayList.get(i12);
                                        z9 = false;
                                    }
                                    l10 = null;
                                    z9 = false;
                                } else {
                                    if (i12 >= 0 && i12 < f40Var.U2.f25232j.size()) {
                                        l10 = (Long) f40Var.U2.f25232j.get(i12);
                                        z9 = false;
                                    }
                                    l10 = null;
                                    z9 = false;
                                }
                                if (!z9 && (q3Var = (org.telegram.messenger.q3) f40Var.U2.f25233k.get(l10)) != null) {
                                    org.telegram.ui.Components.k60 F = org.telegram.ui.Components.k60.F(f40Var.f28675c, f40Var.I0, y3Var);
                                    F.l(2131232129, org.telegram.messenger.id.M0(2131749460, null), new Runnable(f40Var) {
                                        public final f40 f44198b;

                                        {
                                            this.f44198b = f40Var;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.q3 q3Var2 = q3Var;
                                                    declineconferencecallinvite.msg_id = q3Var2.f24676a;
                                                    final f40 f40Var2 = this.f44198b;
                                                    ConnectionsManager.getInstance(f40Var2.f28669a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z10 = tLObject instanceof TLRPC.Updates;
                                                                    f40 f40Var3 = f40Var2;
                                                                    if (z10) {
                                                                        org.telegram.messenger.qp.s1(f40Var3.f28669a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        f40Var3.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    f40 f40Var4 = f40Var2;
                                                                    if (z11) {
                                                                        org.telegram.messenger.qp.s1(f40Var4.f28669a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        f40Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    org.telegram.messenger.r3 r3Var2 = f40Var2.U2;
                                                    if (r3Var2 != null) {
                                                        q3Var2.f24677b = false;
                                                        r3Var2.f25233k.put(l10, q3Var2);
                                                        f40Var2.Q0(true);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.q3 q3Var3 = q3Var;
                                                    declineconferencecallinvite2.msg_id = q3Var3.f24676a;
                                                    final f40 f40Var3 = this.f44198b;
                                                    ConnectionsManager.getInstance(f40Var3.f28669a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z10 = tLObject instanceof TLRPC.Updates;
                                                                    f40 f40Var32 = f40Var3;
                                                                    if (z10) {
                                                                        org.telegram.messenger.qp.s1(f40Var32.f28669a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        f40Var32.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    f40 f40Var4 = f40Var3;
                                                                    if (z11) {
                                                                        org.telegram.messenger.qp.s1(f40Var4.f28669a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        f40Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Integer.valueOf(q3Var3.f24676a));
                                                    org.telegram.messenger.qp.s1(f40Var3.f28669a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                                    org.telegram.messenger.r3 r3Var3 = f40Var3.U2;
                                                    if (r3Var3 != null) {
                                                        ArrayList arrayList3 = r3Var3.f25232j;
                                                        Long l11 = l10;
                                                        arrayList3.remove(l11);
                                                        f40Var3.U2.f25236n.remove(l11);
                                                        f40Var3.U2.f25233k.remove(l11);
                                                        f40Var3.Q0(true);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    }, q3Var.a());
                                    F.c(2131232328, org.telegram.messenger.id.M0(2131749471, null), new Runnable(f40Var) {
                                        public final f40 f44198b;

                                        {
                                            this.f44198b = f40Var;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.q3 q3Var2 = q3Var;
                                                    declineconferencecallinvite.msg_id = q3Var2.f24676a;
                                                    final f40 f40Var2 = this.f44198b;
                                                    ConnectionsManager.getInstance(f40Var2.f28669a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z10 = tLObject instanceof TLRPC.Updates;
                                                                    f40 f40Var32 = f40Var2;
                                                                    if (z10) {
                                                                        org.telegram.messenger.qp.s1(f40Var32.f28669a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        f40Var32.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    f40 f40Var4 = f40Var2;
                                                                    if (z11) {
                                                                        org.telegram.messenger.qp.s1(f40Var4.f28669a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        f40Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    org.telegram.messenger.r3 r3Var2 = f40Var2.U2;
                                                    if (r3Var2 != null) {
                                                        q3Var2.f24677b = false;
                                                        r3Var2.f25233k.put(l10, q3Var2);
                                                        f40Var2.Q0(true);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.q3 q3Var3 = q3Var;
                                                    declineconferencecallinvite2.msg_id = q3Var3.f24676a;
                                                    final f40 f40Var3 = this.f44198b;
                                                    ConnectionsManager.getInstance(f40Var3.f28669a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z10 = tLObject instanceof TLRPC.Updates;
                                                                    f40 f40Var32 = f40Var3;
                                                                    if (z10) {
                                                                        org.telegram.messenger.qp.s1(f40Var32.f28669a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        f40Var32.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    f40 f40Var4 = f40Var3;
                                                                    if (z11) {
                                                                        org.telegram.messenger.qp.s1(f40Var4.f28669a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        f40Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Integer.valueOf(q3Var3.f24676a));
                                                    org.telegram.messenger.qp.s1(f40Var3.f28669a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                                    org.telegram.messenger.r3 r3Var3 = f40Var3.U2;
                                                    if (r3Var3 != null) {
                                                        ArrayList arrayList3 = r3Var3.f25232j;
                                                        Long l11 = l10;
                                                        arrayList3.remove(l11);
                                                        f40Var3.U2.f25236n.remove(l11);
                                                        f40Var3.U2.f25233k.remove(l11);
                                                        f40Var3.Q0(true);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    }, false);
                                    F.W(org.telegram.ui.ActionBar.m6.e0(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), f40Var.f45598w2.getColor()));
                                    F.f35219s = 96;
                                    F.Z();
                                    return;
                                }
                                return;
                            }
                        }
                        z9 = true;
                        if (!z9) {
                            org.telegram.ui.Components.k60 F2 = org.telegram.ui.Components.k60.F(f40Var.f28675c, f40Var.I0, y3Var);
                            F2.l(2131232129, org.telegram.messenger.id.M0(2131749460, null), new Runnable(f40Var) {
                                public final f40 f44198b;

                                {
                                    this.f44198b = f40Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.q3 q3Var2 = q3Var;
                                            declineconferencecallinvite.msg_id = q3Var2.f24676a;
                                            final f40 f40Var2 = this.f44198b;
                                            ConnectionsManager.getInstance(f40Var2.f28669a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z10 = tLObject instanceof TLRPC.Updates;
                                                            f40 f40Var32 = f40Var2;
                                                            if (z10) {
                                                                org.telegram.messenger.qp.s1(f40Var32.f28669a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                f40Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            f40 f40Var4 = f40Var2;
                                                            if (z11) {
                                                                org.telegram.messenger.qp.s1(f40Var4.f28669a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                f40Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            org.telegram.messenger.r3 r3Var2 = f40Var2.U2;
                                            if (r3Var2 != null) {
                                                q3Var2.f24677b = false;
                                                r3Var2.f25233k.put(l10, q3Var2);
                                                f40Var2.Q0(true);
                                                return;
                                            }
                                            return;
                                        default:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.q3 q3Var3 = q3Var;
                                            declineconferencecallinvite2.msg_id = q3Var3.f24676a;
                                            final f40 f40Var3 = this.f44198b;
                                            ConnectionsManager.getInstance(f40Var3.f28669a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z10 = tLObject instanceof TLRPC.Updates;
                                                            f40 f40Var32 = f40Var3;
                                                            if (z10) {
                                                                org.telegram.messenger.qp.s1(f40Var32.f28669a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                f40Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            f40 f40Var4 = f40Var3;
                                                            if (z11) {
                                                                org.telegram.messenger.qp.s1(f40Var4.f28669a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                f40Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(Integer.valueOf(q3Var3.f24676a));
                                            org.telegram.messenger.qp.s1(f40Var3.f28669a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                            org.telegram.messenger.r3 r3Var3 = f40Var3.U2;
                                            if (r3Var3 != null) {
                                                ArrayList arrayList3 = r3Var3.f25232j;
                                                Long l11 = l10;
                                                arrayList3.remove(l11);
                                                f40Var3.U2.f25236n.remove(l11);
                                                f40Var3.U2.f25233k.remove(l11);
                                                f40Var3.Q0(true);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, q3Var.a());
                            F2.c(2131232328, org.telegram.messenger.id.M0(2131749471, null), new Runnable(f40Var) {
                                public final f40 f44198b;

                                {
                                    this.f44198b = f40Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.q3 q3Var2 = q3Var;
                                            declineconferencecallinvite.msg_id = q3Var2.f24676a;
                                            final f40 f40Var2 = this.f44198b;
                                            ConnectionsManager.getInstance(f40Var2.f28669a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z10 = tLObject instanceof TLRPC.Updates;
                                                            f40 f40Var32 = f40Var2;
                                                            if (z10) {
                                                                org.telegram.messenger.qp.s1(f40Var32.f28669a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                f40Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            f40 f40Var4 = f40Var2;
                                                            if (z11) {
                                                                org.telegram.messenger.qp.s1(f40Var4.f28669a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                f40Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            org.telegram.messenger.r3 r3Var2 = f40Var2.U2;
                                            if (r3Var2 != null) {
                                                q3Var2.f24677b = false;
                                                r3Var2.f25233k.put(l10, q3Var2);
                                                f40Var2.Q0(true);
                                                return;
                                            }
                                            return;
                                        default:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.q3 q3Var3 = q3Var;
                                            declineconferencecallinvite2.msg_id = q3Var3.f24676a;
                                            final f40 f40Var3 = this.f44198b;
                                            ConnectionsManager.getInstance(f40Var3.f28669a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z10 = tLObject instanceof TLRPC.Updates;
                                                            f40 f40Var32 = f40Var3;
                                                            if (z10) {
                                                                org.telegram.messenger.qp.s1(f40Var32.f28669a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                f40Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            f40 f40Var4 = f40Var3;
                                                            if (z11) {
                                                                org.telegram.messenger.qp.s1(f40Var4.f28669a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                f40Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(Integer.valueOf(q3Var3.f24676a));
                                            org.telegram.messenger.qp.s1(f40Var3.f28669a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                            org.telegram.messenger.r3 r3Var3 = f40Var3.U2;
                                            if (r3Var3 != null) {
                                                ArrayList arrayList3 = r3Var3.f25232j;
                                                Long l11 = l10;
                                                arrayList3.remove(l11);
                                                f40Var3.U2.f25236n.remove(l11);
                                                f40Var3.U2.f25233k.remove(l11);
                                                f40Var3.Q0(true);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, false);
                            F2.W(org.telegram.ui.ActionBar.m6.e0(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), f40Var.f45598w2.getColor()));
                            F2.f35219s = 96;
                            F2.Z();
                            return;
                        }
                        return;
                    }
                    f40Var.f45512c2.O0(f40Var.f28669a);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", y3Var.getUser().f27109id);
                    if (y3Var.f30937a.getImageReceiver().L()) {
                        bundle.putBoolean("expandPhoto", true);
                    }
                    f40Var.f45512c2.t0(new ProfileActivity(bundle, null));
                    f40Var.dismiss();
                }
            } else if (i7 == z30Var.f52202x) {
                if (org.telegram.messenger.t3.T(f40Var.T2) && (chat = f40Var.T2) != null && !chat.megagroup && org.telegram.messenger.t3.t0(chat)) {
                    f40Var.m1(false);
                    return;
                }
                TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(cVar.f21770a).N0(f40Var.l1());
                if (N0 != null) {
                    f40Var.f45569q2 = false;
                    Context context = f40Var.getContext();
                    int i13 = cVar.f21770a;
                    TLRPC.Chat chat2 = f40Var.T2;
                    org.telegram.messenger.r3 r3Var2 = f40Var.U2;
                    org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(context, i13, chat2, N0, r3Var2.d, r3Var2.f25236n);
                    f40Var.f45608y3 = h20Var;
                    h20Var.setOnDismissListener(new z00(f40Var, 2));
                    org.telegram.ui.Components.h20 h20Var2 = f40Var.f45608y3;
                    h20Var2.f34137a2 = new l10(f40Var);
                    h20Var2.show();
                }
            } else if (i7 == z30Var.f52203y) {
                org.telegram.messenger.r3 r3Var3 = f40Var.U2;
                if (r3Var3 != null && r3Var3.f25226b != null) {
                    wg.f1 f1Var = new wg.f1(activity, f40Var.f28669a, null, 4, new di.i0());
                    org.telegram.messenger.r3 r3Var4 = f40Var.U2;
                    if (r3Var4 != null) {
                        collection = (Collection) Collection.EL.stream(r3Var4.f25228e).map(new aa.l(12)).collect(Collectors.toSet());
                    }
                    f1Var.f57747x2.addAll(collection);
                    f1Var.o1(false, true);
                    f1Var.f57745v2 = new v00(f40Var, 3);
                    f1Var.o1(false, true);
                    f1Var.f57748y2 = new bi.p5(17, f40Var, r3Var);
                    f1Var.show();
                }
            } else if (i7 == z30Var.D) {
                f40Var.A1();
            }
        }
    }

    public static void J0(f40 f40Var, org.telegram.ui.Components.voip.r rVar, boolean z9) {
        if (!f40Var.I) {
            if (z9 && rVar.getRenderer() == null) {
                rVar.setRenderer(org.telegram.ui.Components.voip.y.c(f40Var.S3, f40Var.U3, rVar, null, null, rVar.getParticipant(), f40Var.U2, f40Var));
            } else if (!z9 && rVar.getRenderer() != null) {
                rVar.getRenderer().setPrimaryView(null);
                rVar.setRenderer(null);
            }
        }
    }

    public static void K0(f40 f40Var, int i7, int[] iArr) {
        if (f40Var.u1()) {
            int i10 = org.telegram.ui.ActionBar.m6.f28292yh;
            iArr[0] = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
            iArr[1] = org.telegram.messenger.g0.S0(f40Var.O3, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28310zh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28082nh, false));
            iArr[2] = org.telegram.messenger.g0.S0(f40Var.O3, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yg, false), org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        } else if (i7 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28273xh, false);
            iArr[1] = org.telegram.messenger.g0.S0(f40Var.O3, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28064mh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28082nh, false));
            iArr[2] = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28047lh, false);
        } else if (i7 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28217uh, false);
            iArr[1] = org.telegram.messenger.g0.S0(f40Var.O3, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28121ph, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28140qh, false));
            iArr[2] = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28101oh, false);
        } else if (s1(i7)) {
            iArr[0] = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yh, false);
            iArr[1] = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Zh, false);
            iArr[2] = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27845ai, false);
        } else {
            int i11 = org.telegram.ui.ActionBar.m6.f28292yh;
            iArr[0] = org.telegram.ui.ActionBar.m6.x0(null, i11, false);
            iArr[1] = org.telegram.messenger.g0.S0(f40Var.O3, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ah, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Bh, false));
            iArr[2] = org.telegram.messenger.g0.S0(f40Var.O3, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yg, false), org.telegram.ui.ActionBar.m6.x0(null, i11, false));
        }
        if (s1(i7)) {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Wh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yh, false));
        } else if (i7 == 1) {
            iArr[3] = i0.a.f(0.75f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28121ph, false), i0.a.f(0.5f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28197th, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28235vh, false)));
        } else {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28273xh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28254wh, false));
        }
    }

    public static void K1(org.telegram.ui.ActionBar.z0 z0Var, int i7) {
        if (z0Var != null) {
            z0Var.d(i7, i7);
        }
    }

    public static String L0() {
        String[] strArr = org.telegram.messenger.j6.f23511i[(int) Math.floor(Math.random() * 8)];
        return strArr[(int) Math.floor(Math.random() * strArr.length)];
    }

    public static void M0(f40 f40Var) {
        org.telegram.messenger.r3 r3Var = f40Var.U2;
        if (r3Var != null && r3Var.f25226b != null) {
            TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
            org.telegram.messenger.r3 r3Var2 = f40Var.U2;
            togglegroupcallsettings.call = r3Var2.g(r3Var2.f25225a);
            togglegroupcallsettings.join_muted = Boolean.valueOf(f40Var.U2.f25226b.join_muted);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(f40Var.n1.f21770a);
            org.telegram.messenger.p5 p5Var = Utilities.d;
            Objects.requireNonNull(p5Var);
            connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.v3(p5Var), new e10(f40Var, 1));
        }
    }

    public static void N0(f40 f40Var, boolean z9) {
        if (f40Var.U2 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        org.telegram.messenger.r3 r3Var = f40Var.U2;
        togglegroupcallsettings.call = r3Var.g(r3Var.f25225a);
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z9);
        f40Var.f45577r5 = Boolean.valueOf(z9);
        f40Var.N1(true);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(f40Var.n1.f21770a);
        org.telegram.messenger.p5 p5Var = Utilities.d;
        Objects.requireNonNull(p5Var);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.v3(p5Var), new e10(f40Var, 0));
    }

    public static int O0(f40 f40Var, int i7) {
        p10 p10Var = f40Var.f45559o1;
        org.telegram.ui.Components.voip.r g12 = f40Var.g1();
        if (g12 == null) {
            return Integer.MIN_VALUE;
        }
        int measuredHeight = ((p10Var.getMeasuredHeight() / 2) + p10Var.getTop()) - (f40Var.f45582t1.getMeasuredHeight() / 2);
        int measuredHeight2 = g12.getMeasuredHeight() + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i7;
        return jg.g.D(measuredHeight, measuredHeight2, 2, measuredHeight2) - org.telegram.messenger.g0.L(32.0f);
    }

    public static void P0(f40 f40Var) {
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
        c30 c30Var = f40Var.I1;
        n30 n30Var = f40Var.K1;
        int childCount = n30Var.getChildCount();
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
        if (f15 <= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(14.0f)) {
            z9 = true;
        } else {
            z9 = false;
        }
        float L4 = f15 + org.telegram.messenger.g0.L(14.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        if ((z9 && c30Var.getTag() == null) || (!z9 && c30Var.getTag() != null)) {
            if (z9) {
                num = 1;
            } else {
                num = null;
            }
            c30Var.setTag(num);
            AnimatorSet animatorSet = f40Var.f45508b2;
            if (animatorSet != null) {
                animatorSet.cancel();
                f40Var.f45508b2 = null;
            }
            if (c30Var.getTag() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            f40Var.G0(z10);
            ViewPropertyAnimator animate = c30Var.getBackButton().animate();
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
            org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.f40046f;
            duration.setInterpolator(wqVar).start();
            ViewPropertyAnimator animate2 = c30Var.getTitleTextView().animate();
            if (z9) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(23.0f);
            }
            animate2.translationY(L).setDuration(300L).setInterpolator(wqVar).start();
            ObjectAnimator objectAnimator = f40Var.O4;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                f40Var.O4.cancel();
            }
            org.telegram.ui.ActionBar.m5 subtitleTextView = c30Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            float translationY = c30Var.getSubtitleTextView().getTranslationY();
            if (z9) {
                L2 = 0.0f;
            } else {
                L2 = org.telegram.messenger.g0.L(20.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, property, translationY, L2);
            f40Var.O4 = ofFloat;
            ofFloat.setDuration(300L);
            f40Var.O4.setInterpolator(wqVar);
            f40Var.O4.addListener(new org.telegram.ui.Components.s9(29, f40Var, z9));
            f40Var.O4.start();
            ObjectAnimator objectAnimator2 = f40Var.P4;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            org.telegram.ui.ActionBar.m5 additionalSubtitleTextView = c30Var.getAdditionalSubtitleTextView();
            if (z9) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.g0.L(20.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(additionalSubtitleTextView, property, L3);
            f40Var.P4 = ofFloat2;
            ofFloat2.setDuration(300L);
            f40Var.P4.setInterpolator(wqVar);
            f40Var.P4.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            f40Var.f45508b2 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = f40Var.f45508b2;
            Property property2 = View.ALPHA;
            if (z9) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c30Var, property2, f12);
            v10 v10Var = f40Var.H1;
            if (z9) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(v10Var, property2, f13);
            View view = f40Var.f45504a2;
            if (z9) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, property2, f14));
            f40Var.f45508b2.addListener(new a30(f40Var, 1));
            f40Var.f45508b2.start();
            ImageView imageView = f40Var.U3.f39329w;
            if (z9 && !f45503z5) {
                z11 = false;
            } else {
                z11 = true;
            }
            imageView.setClickable(z11);
        }
        if (f40Var.f45579s2 != L4) {
            f40Var.J1(L4);
        }
    }

    public static void e1(LaunchActivity launchActivity, org.telegram.messenger.c cVar, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z9, String str) {
        if (f45501x5 == null) {
            if (inputPeer != null || VoIPService.getSharedInstance() != null) {
                if (inputPeer != null) {
                    f45501x5 = new f40(launchActivity, cVar, org.telegram.messenger.qp.s1(cVar.f21770a).g1(chat.f26960id, false, null), chat, inputPeer, z9, str);
                } else {
                    org.telegram.messenger.r3 r3Var = VoIPService.getSharedInstance().groupCall;
                    if (r3Var != null) {
                        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(cVar.f21770a).M0(Long.valueOf(r3Var.f25227c));
                        r3Var.b(true);
                        f45501x5 = new f40(launchActivity, cVar, r3Var, M0, null, z9, str);
                    } else {
                        return;
                    }
                }
                f45501x5.f45512c2 = launchActivity;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.us(17));
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
        if ((VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.f25226b.rtmp_stream) && i7 != 2 && i7 != 4 && i7 != 5 && i7 != 6 && i7 != 7) {
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
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
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
                if (!sharedInstance.isConference() || (r3Var != null && (groupCall = r3Var.f25226b) != null && groupCall.creator)) {
                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(context, 1);
                    c2VarArr[0] = c2Var;
                    c2Var.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
                    if (z9) {
                        c2VarArr[0].setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27998j5, false));
                    } else {
                        c2VarArr[0].setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Vg, false));
                        CheckBoxSquare checkBoxSquare = (CheckBoxSquare) c2VarArr[0].getCheckBoxView();
                        int i7 = org.telegram.ui.ActionBar.m6.f27936fh;
                        int i10 = org.telegram.ui.ActionBar.m6.f27900dh;
                        int i11 = org.telegram.ui.ActionBar.m6.f27863bh;
                        checkBoxSquare.f31295s = i7;
                        checkBoxSquare.f31296w = i10;
                        checkBoxSquare.f31297x = i11;
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
                    if (org.telegram.messenger.id.f23161a0) {
                        L = org.telegram.messenger.g0.L(16.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(8.0f);
                    }
                    if (org.telegram.messenger.id.f23161a0) {
                        L2 = org.telegram.messenger.g0.L(8.0f);
                    } else {
                        L2 = org.telegram.messenger.g0.L(16.0f);
                    }
                    c2Var2.setPadding(L, 0, L2, 0);
                    f10.addView(c2VarArr[0], c8.ha.o(-1, -2));
                    c2VarArr[0].setOnClickListener(new b10(c2VarArr, 0));
                }
                alertDialog$Builder.o(f10);
                u1Var.I = org.telegram.ui.ActionBar.m6.f27900dh;
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
                    u1Var.j(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27991ih, false));
                }
                u1Var.show();
                if (!z9) {
                    TextView textView = (TextView) u1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28010jh, null);
                    }
                    u1Var.p(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Vg, false));
                    return;
                }
                return;
            }
            B1(r3Var, false, selfId, runnable);
        }
    }

    public final void A1() {
        org.telegram.messenger.r3 r3Var = this.U2;
        if (r3Var != null && r3Var.f25226b != null) {
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, getContext(), null);
            u1Var.r(300L);
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = this.U2.f25226b;
            tL_inputGroupCall.f26977id = groupCall.f26970id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(this.f28669a).sendRequest(exportgroupcallinvite, new z9(this, u1Var, exportgroupcallinvite, 12));
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
            org.telegram.messenger.c cVar = this.n1;
            if (i28 > 0) {
                M0 = org.telegram.messenger.qp.s1(cVar.f21770a).a2(Long.valueOf(j3));
            } else {
                M0 = org.telegram.messenger.qp.s1(cVar.f21770a).M0(Long.valueOf(-j3));
            }
            TLObject tLObject = M0;
            boolean z9 = true;
            if (i7 != 0 && i7 != 2 && i7 != 3) {
                if (i7 == 6) {
                    this.f45512c2.O0(this.f28669a);
                    Bundle bundle = new Bundle();
                    if (i28 > 0) {
                        bundle.putLong("user_id", j3);
                    } else {
                        bundle.putLong("chat_id", -j3);
                    }
                    this.f45512c2.t0(new cn(bundle));
                    dismiss();
                } else if (i7 == 8) {
                    this.f45512c2.O0(this.f28669a);
                    org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f45512c2.M().getFragmentStack().get(this.f45512c2.M().getFragmentStack().size() - 1);
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
                    this.f45512c2.t0(new cn(bundle2));
                    dismiss();
                } else if (i7 == 7) {
                    sharedInstance.editCallMember(tLObject, Boolean.TRUE, null, null, Boolean.FALSE, null);
                    P1(2, true);
                } else if (i7 == 9) {
                    org.telegram.ui.Components.j30 j30Var = this.f45510b4;
                    if (j30Var == null || !j30Var.g()) {
                        TLRPC.User f11 = org.telegram.messenger.p10.i(cVar.f21770a).f();
                        org.telegram.ui.Components.j30 j30Var2 = new org.telegram.ui.Components.j30(0, true, true);
                        this.f45510b4 = j30Var2;
                        j30Var2.H = true;
                        j30Var2.R = true;
                        j30Var2.G = true;
                        j30Var2.J = true;
                        j30Var2.S = true;
                        j30Var2.f34825a = this.f45512c2.M().getLastFragment();
                        org.telegram.ui.Components.j30 j30Var3 = this.f45510b4;
                        o30 o30Var = new o30(this, j3);
                        this.f45514c4 = o30Var;
                        j30Var3.f34826b = o30Var;
                        TLRPC.UserProfilePhoto userProfilePhoto = f11.photo;
                        if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                            z9 = false;
                        }
                        j30Var3.n(z9, new v00(this, 8), new fi.d1(5), 0);
                    }
                } else if (i7 == 10) {
                    String str7 = groupCallParticipant.about;
                    Context context = getContext();
                    int i29 = this.f28669a;
                    Pattern pattern = org.telegram.ui.Components.u4.f38507a;
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
                    final org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
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
                    int i31 = org.telegram.ui.ActionBar.m6.Vg;
                    org.telegram.ui.ActionBar.t6.U(editText2, i31, null);
                    if (i24 <= 0) {
                        i30 = 2131751459;
                    }
                    editText2.setHint(org.telegram.messenger.id.M0(i30, null));
                    editText2.setTextSize(1, 16.0f);
                    editText2.setBackground(org.telegram.ui.ActionBar.m6.U(context));
                    editText2.setMaxLines(4);
                    editText2.setRawInputType(147457);
                    editText2.setImeOptions(6);
                    if (i24 > 0) {
                        i25 = 70;
                    } else {
                        i25 = 255;
                    }
                    editText2.setFilters(new InputFilter[]{new org.telegram.ui.Components.l3(i25, context, numberTextView)});
                    numberTextView.setCenterAlign(true);
                    numberTextView.setTextSize(15);
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.B6, false));
                    numberTextView.setImportantForAccessibility(2);
                    if (org.telegram.messenger.id.f23161a0) {
                        i26 = 3;
                    } else {
                        i26 = 5;
                    }
                    frameLayout.addView(numberTextView, c8.ha.d(20, 20.0f, i26, 0.0f, 14.0f, 21.0f, 0.0f));
                    if (org.telegram.messenger.id.f23161a0) {
                        i27 = org.telegram.messenger.g0.L(24.0f);
                    } else {
                        i27 = 0;
                    }
                    int L2 = org.telegram.messenger.g0.L(f10);
                    if (org.telegram.messenger.id.f23161a0) {
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
                    u1Var.N = new org.telegram.ui.Components.h1(editText2, 1);
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
                    u1Var.j(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27991ih, false));
                    u1Var.show();
                    u1Var.p(org.telegram.ui.ActionBar.m6.x0(null, i31, false));
                } else if (i7 == 11) {
                    Context context2 = getContext();
                    int i32 = this.f28669a;
                    Pattern pattern2 = org.telegram.ui.Components.u4.f38507a;
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
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27300a;
                    u1Var2.R = M03;
                    LinearLayout f12 = org.telegram.messenger.k5.f(context2, 1);
                    EditText editText3 = new EditText(context2);
                    int i33 = org.telegram.ui.ActionBar.m6.Vg;
                    org.telegram.ui.ActionBar.t6.U(editText3, i33, r132);
                    editText3.setTextSize(1, 16.0f);
                    editText3.setMaxLines(1);
                    editText3.setLines(1);
                    editText3.setSingleLine(true);
                    if (org.telegram.messenger.id.f23161a0) {
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
                    editText3.setBackground(org.telegram.ui.ActionBar.m6.U(context2));
                    editText3.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                    editText3.requestFocus();
                    if (i28 > 0) {
                        editText = new EditText(context2);
                        org.telegram.ui.ActionBar.t6.U(editText, i33, null);
                        editText.setTextSize(1, 16.0f);
                        editText.setMaxLines(1);
                        editText.setLines(1);
                        editText.setSingleLine(true);
                        if (org.telegram.messenger.id.f23161a0) {
                            i22 = 5;
                        } else {
                            i22 = 3;
                        }
                        editText.setGravity(i22);
                        editText.setInputType(49152);
                        editText.setImeOptions(6);
                        editText.setHint(org.telegram.messenger.id.M0(2131749032, null));
                        editText.setBackground(org.telegram.ui.ActionBar.m6.U(context2));
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
                    u1Var2.j(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27991ih, false));
                    u1Var2.show();
                    u1Var2.p(org.telegram.ui.ActionBar.m6.x0(null, i33, false));
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
                int i34 = org.telegram.ui.ActionBar.m6.f27900dh;
                org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.f27300a;
                u1Var3.I = i34;
                TextView textView2 = new TextView(getContext());
                int i35 = org.telegram.ui.ActionBar.m6.Vg;
                org.telegram.ui.ActionBar.t6.U(textView2, i35, null);
                textView2.setTextSize(1, 16.0f);
                if (org.telegram.messenger.id.f23161a0) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView2.setGravity(i10 | 48);
                FrameLayout frameLayout2 = new FrameLayout(getContext());
                alertDialog$Builder3.o(frameLayout2);
                org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
                v8Var.u(org.telegram.messenger.g0.L(12.0f));
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(getContext());
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
                if (org.telegram.messenger.id.f23161a0) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                frameLayout2.addView(k9Var, c8.ha.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                v8Var.p(tLObject);
                boolean z10 = tLObject instanceof TLRPC.User;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    k9Var.e(user, v8Var);
                    str = org.telegram.messenger.t10.j(user, true);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    k9Var.e(chat, v8Var);
                    str = chat.title;
                }
                TextView textView3 = new TextView(getContext());
                org.telegram.messenger.k5.n(textView3, i35, null, 1, 20.0f);
                textView3.setLines(1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                if (org.telegram.messenger.id.f23161a0) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView3.setGravity(i12 | 16);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                TLRPC.Chat chat2 = this.T2;
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
                        if (org.telegram.messenger.t3.W(this.T2)) {
                            org.telegram.messenger.k5.r(null, null, 2131743464, new Object[]{str, str2}, textView2);
                        } else {
                            org.telegram.messenger.k5.r(null, null, 2131743346, new Object[]{str, str2}, textView2);
                        }
                    }
                } else {
                    textView3.setText(org.telegram.messenger.id.M0(2131743402, null));
                    org.telegram.messenger.k5.r(null, null, 2131743403, new Object[]{str, str2}, textView2);
                }
                boolean z11 = org.telegram.messenger.id.f23161a0;
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
                if (org.telegram.messenger.id.f23161a0) {
                    i15 = 5;
                } else {
                    i15 = 3;
                }
                frameLayout2.addView(textView2, c8.ha.d(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                if (i7 == 2) {
                    r13 = 0;
                    alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131743311, null), new su(5, this, tLObject));
                } else {
                    r13 = 0;
                    r13 = 0;
                    if (z10) {
                        alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131743404, null), new bi.i(this, (TLRPC.User) tLObject, j3, 6));
                    }
                }
                alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, r13), r13);
                u1Var3.j(org.telegram.ui.ActionBar.m6.x0(r13, org.telegram.ui.ActionBar.m6.f27991ih, false));
                u1Var3.show();
                if (i7 == 2 && (textView = (TextView) u1Var3.d(-1)) != null) {
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28010jh, r13);
                }
            }
        }
    }

    public final void D1(boolean r18, org.telegram.ui.Cells.f4 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f40.D1(boolean, org.telegram.ui.Cells.f4):void");
    }

    public final void E1() {
        m4 m4Var = this.f45590u4;
        org.telegram.messenger.g0.r(m4Var);
        if (this.f45585t4 && this.O2 != null && VoIPService.getSharedInstance() != null && u1() && this.K1 != null && org.telegram.messenger.sc.e(512)) {
            org.telegram.messenger.g0.i3(m4Var, 30L);
        }
    }

    public final void F1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall g10;
        long j3;
        this.B1.setText("");
        org.telegram.messenger.r3 r3Var = this.U2;
        if (r3Var != null && r3Var.f25226b != null && (g10 = r3Var.g(r3Var.f25225a)) != null) {
            org.telegram.messenger.r3 r3Var2 = this.U2;
            long j10 = r3Var2.f25226b.f26970id;
            TLRPC.Peer peer = r3Var2.J;
            if (peer != null) {
                j3 = org.telegram.messenger.m5.o(peer);
            } else {
                j3 = org.telegram.messenger.p10.i(this.f28669a).f24493n;
            }
            GroupCallMessagesController.getInstance(this.f28669a).sendCallMessage(j3, tL_textWithEntities, j10, g10);
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
        this.O3 = f10;
        c20 c20Var = this.U3;
        if (c20Var == null) {
            f11 = 0.0f;
        } else {
            f11 = c20Var.f39304c;
        }
        float max = Math.max(f10, f11);
        int i11 = org.telegram.ui.ActionBar.m6.Xg;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.m6.Ug;
        int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, x02, org.telegram.ui.ActionBar.m6.x0(null, i12, false));
        this.P3 = S0;
        this.H1.setBackgroundColor(S0);
        this.f45520e3.H(-14472653);
        this.Z1.setColorFilter(new PorterDuffColorFilter(this.P3, PorterDuff.Mode.MULTIPLY));
        this.G0 = org.telegram.messenger.g0.S0(max, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, i11, false), org.telegram.ui.ActionBar.m6.x0(null, i12, false));
        int S02 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yg, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27973hh, false));
        g.b bVar = this.f45539j2;
        if (bVar != null) {
            bVar.f13266b = S02;
            o00 o00Var = (o00) bVar.f13271i;
            if (o00Var != null) {
                o00Var.invalidate();
            }
        }
        this.f45598w2.setColor(S02);
        this.f45606y1.setColor(S02);
        this.f45610z1.invalidate();
        n30 n30Var = this.K1;
        n30Var.setGlowColor(S02);
        int i13 = this.f45612z3;
        if (i13 == 3 || s1(i13)) {
            this.f45592v1.invalidate();
        }
        View view = this.D4;
        if (view != null) {
            int i14 = this.P3;
            int[] iArr = this.G4;
            iArr[0] = i14;
            iArr[1] = 0;
            if (Build.VERSION.SDK_INT > 29) {
                this.F4.setColors(iArr);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
                this.F4 = gradientDrawable;
                view.setBackground(gradientDrawable);
            }
            this.E4.setBackgroundColor(iArr[0]);
        }
        int S03 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28160rh, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28178sh, false));
        this.f45582t1.a(S03, S03);
        int S04 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Zg, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27883ch, false));
        int S05 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27844ah, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27936fh, false));
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, this.I0);
        int childCount = n30Var.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = n30Var.getChildAt(i15);
            if (childAt instanceof org.telegram.ui.Cells.z3) {
                org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) childAt;
                if (r1()) {
                    z3Var.a(w02, w02);
                } else {
                    z3Var.a(S05, S04);
                }
            } else {
                boolean z9 = childAt instanceof org.telegram.ui.Cells.f4;
                c30 c30Var = this.I1;
                if (z9) {
                    org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) childAt;
                    if (c30Var.getTag() != null) {
                        i10 = org.telegram.ui.ActionBar.m6.f27936fh;
                    } else {
                        i10 = org.telegram.ui.ActionBar.m6.f27844ah;
                    }
                    f4Var.f(i10, S05);
                } else if (childAt instanceof org.telegram.ui.Cells.y3) {
                    org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) childAt;
                    if (c30Var.getTag() != null) {
                        i7 = org.telegram.ui.ActionBar.m6.f27936fh;
                    } else {
                        i7 = org.telegram.ui.ActionBar.m6.f27844ah;
                    }
                    y3Var.a(i7, S05);
                }
            }
        }
        this.f28672b.invalidate();
        n30Var.invalidate();
        this.f28675c.invalidate();
    }

    @Override
    public final boolean H() {
        return !this.U3.f39302b;
    }

    public final void H1(float f10) {
        n30 n30Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        ArrayList arrayList;
        v4.d1 K;
        f10 = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) ? 0.0f : 0.0f;
        float min = (float) (Math.min(8500.0d, 4000.0f * f10) / 8500.0d);
        this.J2 = min;
        this.K2 = (min - this.I2) / 265.0f;
        org.telegram.messenger.r3 r3Var = this.U2;
        if (r3Var != null && (n30Var = this.K1) != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(org.telegram.messenger.ij.B1(this.f45588u2))) != null) {
            c20 c20Var = this.U3;
            if (!c20Var.f39302b) {
                if (this.f45551m2) {
                    arrayList = this.f45603x2;
                } else {
                    arrayList = this.U2.f25230g;
                }
                int indexOf = arrayList.indexOf(groupCallParticipant);
                if (indexOf >= 0 && (K = n30Var.K(indexOf + this.J1.d)) != null) {
                    View view = K.f57052a;
                    if (view instanceof org.telegram.ui.Cells.f4) {
                        ((org.telegram.ui.Cells.f4) view).setAmplitude(f10 * 15.0f);
                        if (view == this.R4 && !this.f45525f4) {
                            this.f28672b.invalidate();
                        }
                    }
                }
            } else {
                int i7 = 0;
                while (true) {
                    y10 y10Var = this.f45529g4;
                    if (i7 >= y10Var.getChildCount()) {
                        break;
                    }
                    org.telegram.ui.Components.g10 g10Var = (org.telegram.ui.Components.g10) y10Var.getChildAt(i7);
                    if (org.telegram.messenger.ij.B1(g10Var.getParticipant().peer) == org.telegram.messenger.ij.B1(groupCallParticipant.peer)) {
                        g10Var.setAmplitude(f10 * 15.0f);
                    }
                    i7++;
                }
            }
            c20Var.k(groupCallParticipant, f10 * 15.0f);
        }
    }

    public final void I1(int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24) {
        this.f45507a5 = i7;
        this.f45511b5 = i10;
        this.f45515c5 = i11;
        this.f45518d5 = i12;
        this.f45522e5 = i13;
        this.f45526f5 = i14;
        this.f45530g5 = i15;
        this.f45534h5 = i16;
        this.f45538i5 = i17;
        this.f45541j5 = i18;
        this.f45545k5 = i19;
        this.f45549l5 = i20;
        this.f45554m5 = i21;
        this.f45558n5 = i22;
        this.f45562o5 = i23;
        this.f45567p5 = i24;
    }

    public final void J1(float f10) {
        n30 n30Var;
        int L;
        int i7;
        float f11;
        this.f45579s2 = f10;
        this.K1.setTopGlowOffset((int) (f10 - ((FrameLayout.LayoutParams) n30Var.getLayoutParams()).topMargin));
        float L2 = f10 - org.telegram.messenger.g0.L(74.0f);
        int i10 = ((this.f28704s0 + L2) > (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() * 2) ? 1 : ((this.f28704s0 + L2) == (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() * 2) ? 0 : -1));
        u30 u30Var = this.O2;
        c20 c20Var = this.U3;
        w10 w10Var = this.Z2;
        u10 u10Var = this.Y2;
        if (i10 < 0) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() * 2) - L2) - this.f28704s0) / (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + ((L - this.f28704s0) - org.telegram.messenger.g0.L(14.0f))));
            if (org.telegram.messenger.g0.Q1()) {
                f11 = 17.0f;
            } else {
                f11 = 13.0f;
            }
            i7 = (int) (org.telegram.messenger.g0.L(f11) * min);
            if (u30Var != null) {
                u30Var.setShadowOffset((int) (org.telegram.messenger.g0.L(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.O3) > 1.0E-4f) {
                G1(Math.min(1.0f, min));
            }
            float x10 = org.telegram.ui.Cells.f1.x(min, 0.1f, 1.2f, 1.0f);
            u10Var.setScaleX(Math.max(0.9f, x10));
            u10Var.setScaleY(Math.max(0.9f, x10));
            float f12 = 1.0f - (min * 1.2f);
            u10Var.setAlpha((1.0f - c20Var.f39304c) * Math.max(0.0f, f12));
            w10Var.setScaleX(Math.max(0.9f, x10));
            w10Var.setScaleY(Math.max(0.9f, x10));
            w10Var.setAlpha((1.0f - c20Var.f39304c) * Math.max(0.0f, f12));
        } else {
            u10Var.setScaleX(1.0f);
            u10Var.setScaleY(1.0f);
            u10Var.setAlpha(1.0f - c20Var.f39304c);
            w10Var.setScaleX(1.0f);
            w10Var.setScaleY(1.0f);
            w10Var.setAlpha(1.0f - c20Var.f39304c);
            if (this.O3 > 1.0E-4f) {
                G1(0.0f);
            }
            i7 = 0;
        }
        a1();
        float f13 = i7;
        this.f45584t3.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(53.0f)) - f13));
        this.f45516d3.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(44.0f)) - f13));
        if (u30Var != null) {
            u30Var.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), f10 - org.telegram.messenger.g0.L(37.0f)));
        }
        t20 t20Var = this.L1;
        if (t20Var != null) {
            t20Var.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(44.0f)) - f13));
        }
        this.f28672b.invalidate();
        W1();
    }

    @Override
    public final void K() {
        c20 c20Var = this.U3;
        if (c20Var != null) {
            if (this.f45544k4 != null) {
                this.K1.getViewTreeObserver().removeOnPreDrawListener(this.f45544k4);
                this.f45544k4 = null;
            }
            ArrayList arrayList = this.T3;
            arrayList.clear();
            ArrayList arrayList2 = this.S3;
            arrayList.addAll(arrayList2);
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).f();
                c20Var.removeView((View) arrayList.get(i7));
                ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).e();
                ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).b(true);
            }
            arrayList2.clear();
            if (c20Var.getParent() != null) {
                arrayList2.clear();
                this.f28672b.removeView(c20Var);
            }
        }
        super.K();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
            VoIPService.getSharedInstance().setSinks(null, null);
        }
        if (f45501x5 == this) {
            f45501x5 = null;
        }
        f45502y5 = false;
        VoIPService.audioLevelsCallback = null;
        org.telegram.ui.Components.p10.k(getContext());
        org.telegram.messenger.r3 r3Var = this.U2;
        if (r3Var != null) {
            ArrayList arrayList3 = r3Var.f25228e;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f40.L1(android.view.View):boolean");
    }

    public final void M1(View view) {
        if (this.f45527g2 == null) {
            org.telegram.ui.Components.y20 y20Var = new org.telegram.ui.Components.y20(8, getContext(), null, true);
            this.f45527g2 = y20Var;
            y20Var.setAlpha(0.0f);
            this.f45527g2.setVisibility(4);
            this.f45527g2.setShowingDuration(3000L);
            this.f28672b.addView(this.f45527g2, c8.ha.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            if (org.telegram.messenger.t3.W(this.T2)) {
                this.f45527g2.setText(org.telegram.messenger.id.M0(2131743465, null));
            } else {
                this.f45527g2.setText(org.telegram.messenger.id.M0(2131743347, null));
            }
            this.f45527g2.b();
        }
        this.f45527g2.setExtraTranslationY(-org.telegram.messenger.g0.f22561m);
        this.f45527g2.c(view);
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
        org.telegram.messenger.r3 r3Var = this.U2;
        org.telegram.ui.Components.voip.n2 n2Var = this.f45587u1;
        org.telegram.ui.Components.voip.n2 n2Var2 = this.f45568q1;
        org.telegram.ui.Components.voip.n2 n2Var3 = this.f45578s1;
        org.telegram.ui.Components.voip.n2 n2Var4 = this.f45563p1;
        org.telegram.ui.Components.voip.n2 n2Var5 = this.f45573r1;
        org.telegram.ui.Components.voip.n2 n2Var6 = this.f45582t1;
        org.telegram.ui.Components.voip.n2 n2Var7 = this.f45592v1;
        boolean z18 = true;
        p10 p10Var = this.f45559o1;
        boolean z19 = false;
        if (r3Var != null && !r3Var.j()) {
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.U2.d.f(org.telegram.messenger.ij.B1(this.f45588u2));
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !S0()) {
                z13 = true;
            } else {
                z13 = false;
            }
            Boolean bool = this.f45577r5;
            if (bool != null) {
                z14 = bool.booleanValue();
            } else {
                TLRPC.GroupCall groupCall = this.U2.f25226b;
                if (groupCall != null && groupCall.messages_enabled) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            if (((!z13 && this.U2.c()) || z12) && !u1()) {
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
            if (f45503z5) {
                z16 = false;
                z17 = false;
            }
            p10Var.c(n2Var7, true, z9);
            p10Var.c(n2Var6, true, z9);
            p10Var.c(n2Var5, z15, z9);
            p10Var.c(n2Var4, z17, z9);
            p10Var.c(n2Var3, z19, z9);
            p10Var.c(n2Var2, z16, z9);
            p10Var.c(n2Var, z14, z9);
            return;
        }
        if (this.P2 > 0.1f) {
            z10 = true;
        } else {
            z10 = false;
        }
        p10Var.c(n2Var7, z10, z9);
        if (this.P2 > 0.1f) {
            z11 = true;
        } else {
            z11 = false;
        }
        p10Var.c(n2Var6, z11, z9);
        if (this.P2 <= 0.1f) {
            z18 = false;
        }
        p10Var.c(n2Var3, z18, z9);
        p10Var.c(n2Var5, false, z9);
        p10Var.c(n2Var4, false, z9);
        p10Var.c(n2Var2, false, z9);
        p10Var.c(n2Var, false, z9);
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
        org.telegram.messenger.r3 r3Var2 = this.U2;
        org.telegram.ui.ActionBar.r0 r0Var = this.f45520e3;
        org.telegram.ui.ActionBar.r0 r0Var2 = this.f45528g3;
        if (r3Var2 == null || r3Var2.j()) {
            this.f45524f3.setVisibility(4);
            r0Var2.setVisibility(8);
            if (this.U2 == null) {
                r0Var.setVisibility(8);
                return;
            }
        }
        if (this.f45523f2) {
            return;
        }
        org.telegram.messenger.c cVar = this.n1;
        int i14 = cVar.f21770a;
        int i15 = cVar.f21770a;
        TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i14).M0(Long.valueOf(l1()));
        if (M02 != null) {
            this.T2 = M02;
        }
        boolean y10 = org.telegram.messenger.t3.y(3, this.T2);
        org.telegram.ui.ActionBar.z0 z0Var = this.f45532h3;
        if (!y10 && (((org.telegram.messenger.t3.T(this.T2) && ((chat2 = this.T2) == null || !chat2.megagroup)) || (!org.telegram.messenger.t3.t0(this.T2) && !org.telegram.messenger.t3.y(3, this.T2))) && (!org.telegram.messenger.t3.T(this.T2) || (chat = this.T2) == null || chat.megagroup || !org.telegram.messenger.t3.t0(chat)))) {
            z0Var.setVisibility(8);
        } else {
            z0Var.setVisibility(0);
        }
        org.telegram.messenger.r3 r3Var3 = this.U2;
        org.telegram.ui.ActionBar.z0 z0Var2 = this.f45580s3;
        org.telegram.ui.ActionBar.z0 z0Var3 = this.f45575r3;
        if (r3Var3 != null && (groupCall2 = r3Var3.f25226b) != null && groupCall2.can_change_messages_enabled) {
            if (groupCall2.messages_enabled) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            z0Var3.setVisibility(i12);
            if (this.U2.f25226b.messages_enabled) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            z0Var2.setVisibility(i13);
        } else {
            z0Var3.setVisibility(8);
            z0Var2.setVisibility(8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.U2.d.f(org.telegram.messenger.ij.B1(this.f45588u2));
        org.telegram.messenger.r3 r3Var4 = this.U2;
        org.telegram.ui.ActionBar.z0 z0Var4 = this.f45543k3;
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
        org.telegram.ui.ActionBar.z0 z0Var5 = this.f45570q3;
        org.telegram.ui.ActionBar.z0 z0Var6 = this.f45536i3;
        org.telegram.ui.ActionBar.z0 z0Var7 = this.f45552m3;
        org.telegram.ui.ActionBar.z0 z0Var8 = this.f45556n3;
        if (S0) {
            z0Var5.setVisibility(0);
            z0Var6.setVisibility(0);
            if (u1()) {
                z0Var7.setVisibility(0);
                z0Var8.setVisibility(8);
            } else if (this.U2.j()) {
                z0Var7.setVisibility(8);
                z0Var8.setVisibility(8);
            } else {
                z0Var7.setVisibility(0);
            }
            if (r1()) {
                z0Var7.setVisibility(8);
                z0Var6.setVisibility(8);
            }
            if (this.U2.c() && !this.U2.j() && !u1()) {
                z0Var8.setVisibility(0);
            } else {
                z0Var8.setVisibility(8);
            }
            r0Var2.setVisibility(8);
            boolean z12 = this.U2.f25244w;
            a40 a40Var = this.X2;
            a40Var.f43557f = z12;
            a40Var.d = 1.0f;
            a40Var.invalidateSelf();
            if (this.U2.f25244w) {
                if (this.f45604x3 == null) {
                    v00 v00Var = new v00(this, 6);
                    this.f45604x3 = v00Var;
                    org.telegram.messenger.g0.i3(v00Var, 1000L);
                }
                z0Var7.setText(org.telegram.messenger.id.M0(2131743323, null));
            } else {
                v00 v00Var2 = this.f45604x3;
                if (v00Var2 != null) {
                    org.telegram.messenger.g0.r(v00Var2);
                    this.f45604x3 = null;
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
            if (!z9 && ((this.U2.c() || z10) && !this.U2.j() && !u1())) {
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
        org.telegram.ui.ActionBar.z0 z0Var9 = this.f45547l3;
        if (S02 && this.U2.f25226b.can_change_join_muted && !r1()) {
            z0Var9.setVisibility(0);
        } else {
            z0Var9.setVisibility(8);
        }
        if (r1() && ((r3Var = this.U2) == null || (groupCall = r3Var.f25226b) == null || !groupCall.creator)) {
            z11 = false;
        } else {
            z11 = true;
        }
        r0Var.Q(4, z11);
        if (u1() && !this.U2.j()) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        this.j3.setVisibility(i11);
        int visibility = z0Var6.getVisibility();
        TextView textView = this.f45589u3;
        if (visibility != 0 && z0Var9.getVisibility() != 0 && z0Var.getVisibility() != 0 && z0Var8.getVisibility() != 0 && z0Var7.getVisibility() != 0 && z0Var5.getVisibility() != 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.f45519e2;
        if (((sharedInstance != null && VoIPService.getSharedInstance().hasFewPeers) || this.V2) && !u1() && this.f45588u2 != null) {
            kVar.setVisibility(0);
            long B1 = org.telegram.messenger.ij.B1(this.f45588u2);
            if (org.telegram.messenger.m5.E(B1)) {
                M0 = org.telegram.messenger.qp.s1(i15).a2(Long.valueOf(B1));
            } else {
                M0 = org.telegram.messenger.qp.s1(i15).M0(Long.valueOf(-B1));
            }
            kVar.setObject(M0);
        } else {
            kVar.setVisibility(8);
        }
        TLRPC.Chat chat3 = this.T2;
        if (chat3 != null && !org.telegram.messenger.t3.W(chat3) && u1() && z0Var.getVisibility() == 8) {
            r0Var.setVisibility(8);
        } else {
            r0Var.setVisibility(0);
        }
        LinearLayout linearLayout = this.f45516d3;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f10 = 96;
        if (layoutParams.rightMargin != org.telegram.messenger.g0.L(f10)) {
            layoutParams.rightMargin = org.telegram.messenger.g0.L(f10);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.f45584t3.getLayoutParams()).rightMargin = 0;
        this.I1.setTitleRightMargin(org.telegram.messenger.g0.L(48.0f) * 2);
    }

    public final void P1(int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f40.P1(int, boolean):void");
    }

    public final void Q0(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f40.Q0(boolean):void");
    }

    public final void Q1() {
        if (this.U2 == null) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.n1.f21770a).getCurrentTime();
        org.telegram.messenger.r3 r3Var = this.U2;
        int i7 = currentTime - r3Var.f25226b.record_start_date;
        boolean z9 = r3Var.f25244w;
        org.telegram.ui.ActionBar.z0 z0Var = this.f45552m3;
        if (z9) {
            z0Var.setSubtext(org.telegram.messenger.g0.g0(i7, false, false));
        } else {
            z0Var.setSubtext(null);
        }
    }

    public final int R0() {
        n30 n30Var = this.K1;
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

    public final void R1(boolean z9) {
        float interpolation;
        float f10;
        t20 t20Var = this.L1;
        if ((t20Var == null || this.U2 != null) && this.R2 == null) {
            this.Q2 = 1.0f;
            this.P2 = 1.0f;
            if (t20Var == null) {
                return;
            }
        }
        int i7 = 4;
        if (!z9) {
            t10 t10Var = this.f45571q4;
            org.telegram.messenger.g0.r(t10Var);
            t10Var.run();
            org.telegram.messenger.r3 r3Var = this.U2;
            n30 n30Var = this.K1;
            if (r3Var != null && !r3Var.j()) {
                n30Var.setVisibility(0);
            } else {
                n30Var.setVisibility(4);
            }
            boolean W = org.telegram.messenger.t3.W(this.T2);
            org.telegram.ui.ActionBar.z0 z0Var = this.f45570q3;
            if (W) {
                z0Var.setText(org.telegram.messenger.id.M0(2131743488, null));
            } else {
                z0Var.setText(org.telegram.messenger.id.M0(2131743395, null));
            }
        }
        float f11 = this.P2;
        if (f11 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.wq.f40046f.getInterpolation((f11 - 0.6f) / 0.4f) * 0.05f);
            this.Q2 = 1.0f;
            f10 = 1.0f;
        } else {
            org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.f40046f;
            this.Q2 = wqVar.getInterpolation(f11 / 0.6f);
            interpolation = 1.05f * wqVar.getInterpolation(this.P2 / 0.6f);
            f10 = this.P2 / 0.6f;
        }
        N1(true);
        float f12 = 1.0f - f10;
        t20Var.setAlpha(f12);
        this.O1.setAlpha(f10);
        this.Q1.setAlpha(f10);
        m30 m30Var = this.P1;
        m30Var.setAlpha(f10);
        m30Var.setScaleX(interpolation);
        m30Var.setScaleY(interpolation);
        r20 r20Var = this.N1;
        r20Var.setScaleX(f12);
        r20Var.setScaleY(f12);
        r20Var.setAlpha(f12);
        this.M1.setAlpha(f12);
        this.f45520e3.setAlpha(f10);
        if (f12 != 0.0f) {
            i7 = 0;
        }
        if (i7 != t20Var.getVisibility()) {
            t20Var.setVisibility(i7);
            r20Var.setVisibility(i7);
        }
    }

    public final boolean S0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            org.telegram.messenger.r3 r3Var = this.U2;
            if (r3Var != null && (groupCall = r3Var.f25226b) != null && groupCall.creator) {
                return true;
            }
            return false;
        }
        return org.telegram.messenger.t3.w(14, this.T2);
    }

    public final void S1(boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        org.telegram.ui.Components.voip.n2 n2Var = this.f45578s1;
        if (n2Var != null && n2Var.getVisibility() == 0) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            p10 p10Var = this.f45559o1;
            boolean z13 = false;
            if (sharedInstance != null && !u1()) {
                mh.a aVar = (mh.a) p10Var.f20050c.get(n2Var);
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
                if (this.U1 != i7) {
                    this.U1 = i7;
                    org.telegram.messenger.g0.R3(this.V1, i7);
                }
                org.telegram.ui.Components.voip.n2 n2Var2 = this.f45568q1;
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
            if (!org.telegram.messenger.t3.t0(this.T2) && (!org.telegram.messenger.t3.N(this.T2) || !org.telegram.messenger.t3.w(3, this.T2))) {
                z10 = false;
            } else {
                z10 = true;
            }
            mh.a aVar2 = (mh.a) p10Var.f20050c.get(n2Var);
            if (aVar2 != null) {
                aVar2.d.a(z10, z9);
                n2Var.setEnabled(z10);
            }
            n2Var.b(true, false);
        }
    }

    public final void T0() {
        if (this.L3) {
            this.L3 = false;
            org.telegram.messenger.g0.r(this.f45581s4);
        }
        if (this.M3) {
            this.M3 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.f45592v1.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void T1(boolean r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f40.T1(boolean, boolean):void");
    }

    @Override
    public final ArrayList U() {
        return new ArrayList();
    }

    public final void U0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f40.U0():void");
    }

    public final void U1() {
        boolean z9;
        String str;
        float f10;
        float f11;
        d40 d40Var;
        TLRPC.User user;
        TLRPC.Chat chat;
        c30 c30Var = this.I1;
        if (c30Var != null && this.U2 != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            int i7 = 0;
            for (int i10 = 0; i10 < this.U2.P.m(); i10++) {
                long j3 = this.U2.P.j(i10);
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.U2.P.f(j3);
                if (!groupCallParticipant.self) {
                    c20 c20Var = this.U3;
                    c20Var.getClass();
                    if (c20Var.f39331x.get(org.telegram.messenger.ij.B1(groupCallParticipant.peer)) <= 0 && this.f45595v4.get(j3, 0) != 1) {
                        long B1 = org.telegram.messenger.ij.B1(groupCallParticipant.peer);
                        if (spannableStringBuilder == null) {
                            spannableStringBuilder = new SpannableStringBuilder();
                        }
                        if (i7 < 2) {
                            int i11 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
                            if (i11 > 0) {
                                user = org.telegram.messenger.qp.s1(this.f28669a).a2(Long.valueOf(B1));
                            } else {
                                user = null;
                            }
                            if (i11 <= 0) {
                                chat = org.telegram.messenger.qp.s1(this.f28669a).M0(Long.valueOf(B1));
                            } else {
                                chat = null;
                            }
                            if (user != null || chat != null) {
                                if (i7 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (user != null) {
                                    spannableStringBuilder.append(org.telegram.messenger.t10.j(user, true), new org.telegram.ui.Components.u31(org.telegram.messenger.g0.o()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.u31(org.telegram.messenger.g0.o()), 0);
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
                c30Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
                z9 = true;
            } else {
                z9 = false;
            }
            org.telegram.ui.ActionBar.m5 subtitleTextView = c30Var.getSubtitleTextView();
            if (u1()) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            int i12 = this.U2.f25226b.participants_count;
            z30 z30Var = this.J1;
            subtitleTextView.k(org.telegram.messenger.id.G(i12 + ((z30Var.M.u1() || z30Var.L || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined()), str, new Object[0]));
            if (u1() && (d40Var = this.f45594v3) != null) {
                d40Var.setWatchersCount(this.U2.f25226b.participants_count);
            }
            if (z9 != this.o4) {
                this.o4 = z9;
                c30Var.invalidate();
                float f12 = 0.0f;
                c30Var.getSubtitleTextView().setPivotX(0.0f);
                c30Var.getSubtitleTextView().setPivotY(c30Var.getMeasuredHeight() >> 1);
                ViewPropertyAnimator animate = c30Var.getSubtitleTextView().animate();
                if (this.o4) {
                    f10 = 0.98f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f10);
                if (this.o4) {
                    f11 = 0.9f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f11);
                if (!this.o4) {
                    f12 = 1.0f;
                }
                scaleY.alpha(f12).setDuration(150L);
                org.telegram.messenger.g0.X3(c30Var.getAdditionalSubtitleTextView(), this.o4);
            }
        }
    }

    public final void V0() {
        this.f45610z1.setTranslationY((-this.f45599w3.d()) + this.f28672b.getPaddingBottom());
        this.A1.invalidate();
        b1();
        a1();
        Y0();
        Z0();
        c1();
        this.f45559o1.setAlpha(1.0f - this.f45586t5.f55498e);
        W0();
        X0();
    }

    public final void V1(boolean z9) {
        org.telegram.messenger.r3 r3Var = this.U2;
        u10 u10Var = this.Y2;
        if (r3Var == null) {
            if (org.telegram.messenger.t3.W(this.T2)) {
                u10Var.b(org.telegram.messenger.id.M0(2131743462, null), z9);
                return;
            } else {
                u10Var.b(org.telegram.messenger.id.M0(2131743341, null), z9);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(r3Var.f25226b.title);
        c30 c30Var = this.I1;
        if (!isEmpty) {
            if (!this.U2.f25226b.title.equals(c30Var.getTitle())) {
                if (z9) {
                    this.I1.M(this.U2.f25226b.title, true, 180L, null);
                    c30Var.getTitleTextView().setOnClickListener(new s00(this, 7));
                } else {
                    c30Var.setTitle(this.U2.f25226b.title);
                }
                u10Var.b(this.U2.f25226b.title, z9);
            }
        } else {
            TLRPC.Chat chat = this.T2;
            if (chat != null && !chat.title.equals(c30Var.getTitle())) {
                if (z9) {
                    this.I1.M(this.T2.title, true, 180L, null);
                    c30Var.getTitleTextView().setOnClickListener(new s00(this, 8));
                } else {
                    c30Var.setTitle(this.T2.title);
                }
                if (org.telegram.messenger.t3.W(this.T2)) {
                    if (u1()) {
                        u10Var.b(this.T2.title, z9);
                    } else {
                        u10Var.b(org.telegram.messenger.id.M0(2131743447, null), z9);
                    }
                } else {
                    u10Var.b(org.telegram.messenger.id.M0(2131743306, null), z9);
                }
            } else if (this.T2 == null) {
                c30Var.setTitle(org.telegram.messenger.id.M0(2131751823, null));
                u10Var.b(org.telegram.messenger.id.M0(2131751823, null), z9);
            }
        }
        org.telegram.ui.ActionBar.m5 titleTextView = c30Var.getTitleTextView();
        if (this.U2.f25244w) {
            if (titleTextView.getRightDrawable() == null) {
                titleTextView.i(new b40(titleTextView));
                TextView textView = u10Var.getTextView();
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new b40(textView), (Drawable) null);
                TextView nextTextView = u10Var.getNextTextView();
                nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new b40(nextTextView), (Drawable) null);
            }
        } else if (titleTextView.getRightDrawable() != null) {
            titleTextView.i(null);
            u10Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            u10Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final void W0() {
        int i7;
        float f10 = this.f45599w3.f54558b.f55524a;
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        n20 n20Var = this.f45610z1;
        n20Var.setAlpha(f10);
        m20 m20Var = this.A1;
        m20Var.setAlpha(f10);
        if (n20Var.getVisibility() != i7) {
            n20Var.setVisibility(i7);
            m20Var.setVisibility(i7);
            if (i7 == 8) {
                k20 k20Var = this.B1;
                if (k20Var.isFocused()) {
                    k20Var.clearFocus();
                }
            }
        }
    }

    public final void W1() {
        float f10;
        org.telegram.ui.Components.fb fbVar;
        boolean z9;
        if (this.E != null) {
            int L = org.telegram.messenger.g0.L(74.0f);
            float f11 = this.f45579s2 - L;
            if (this.f28704s0 + f11 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                int L2 = (L - this.f28704s0) - org.telegram.messenger.g0.L(14.0f);
                f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - f11) - this.f28704s0) / L2);
                f11 -= (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - L2) * f10);
            } else {
                f10 = 0.0f;
            }
            float paddingTop = f11 + this.f28672b.getPaddingTop();
            FrameLayout frameLayout = this.E;
            c30 c30Var = this.I1;
            frameLayout.setTranslationY(org.telegram.messenger.g0.T1(((-frameLayout.getTop()) - this.E.getHeight()) + paddingTop + org.telegram.messenger.g0.L(10.0f), c30Var.getY() + (-this.E.getTop()) + c30Var.getHeight(), f10));
            org.telegram.ui.Components.bc bcVar = org.telegram.ui.Components.bc.f32195w;
            if (bcVar != null && (fbVar = bcVar.f32199e) != null && fbVar.getParent() != null && fbVar.getParent().getParent() == this.E) {
                if (f10 > 0.5f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                fbVar.setTop(z9);
            }
        }
    }

    public final void X0() {
        int i7;
        org.telegram.ui.Components.ii0 ii0Var = this.E1;
        if (ii0Var != null) {
            float f10 = this.f45599w3.f54558b.f55524a * this.f45591u5.f55498e;
            ii0Var.setAlpha(f10);
            if (f10 > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            if (this.E1.getVisibility() != i7) {
                this.E1.setVisibility(i7);
                if (i7 == 8) {
                    this.E1.n();
                }
            }
            org.telegram.ui.Components.ii0 ii0Var2 = this.E1;
            if (!ii0Var2.N0 && f10 == 1.0f) {
                ii0Var2.N0 = true;
            }
        }
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 2) {
            a1();
            Y0();
            Z0();
            float f12 = 1.0f - this.f45586t5.f55498e;
            p10 p10Var = this.f45559o1;
            p10Var.setAlpha(f12);
            this.U3.setProgressToHideUi(f10);
            this.f45529g4.invalidate();
            this.f28672b.invalidate();
            p10Var.invalidate();
        }
        if (i7 == 3) {
            b1();
            a1();
            c1();
            X0();
            this.f28672b.invalidate();
        }
        if (i7 == 4) {
            a1();
            this.A1.invalidate();
            this.B1.invalidate();
        }
        if (i7 == 5) {
            a1();
            this.f28672b.invalidate();
        }
    }

    public final void Y0() {
        boolean z9 = A5;
        p10 p10Var = this.f45559o1;
        if (z9) {
            p10Var.setTranslationX(0.0f);
            p10Var.setTranslationY(0.0f);
            return;
        }
        boolean z10 = f45503z5;
        te.a aVar = this.f45586t5;
        if (z10) {
            p10Var.setTranslationX(aVar.f55498e * org.telegram.messenger.g0.L(94.0f));
            p10Var.setTranslationY(0.0f);
            return;
        }
        p10Var.setTranslationX(0.0f);
        p10Var.setTranslationY(aVar.f55498e * org.telegram.messenger.g0.L(94.0f));
    }

    public final void Z0() {
        boolean z9 = A5;
        y10 y10Var = this.f45529g4;
        if (z9) {
            y10Var.setTranslationX(0.0f);
            y10Var.setTranslationY(0.0f);
            return;
        }
        boolean z10 = f45503z5;
        te.a aVar = this.f45586t5;
        if (z10) {
            y10Var.setTranslationX(aVar.f55498e * org.telegram.messenger.g0.L(94.0f));
            y10Var.setTranslationY(0.0f);
            return;
        }
        y10Var.setTranslationX(0.0f);
        y10Var.setTranslationY(aVar.f55498e * org.telegram.messenger.g0.L(94.0f));
    }

    public final void a1() {
        float L;
        float f10 = this.f45596v5.f55504f;
        rh.h hVar = this.f45599w3;
        float f11 = -((hVar.d() - this.f28672b.getPaddingBottom()) + f10 + (org.telegram.messenger.g0.L(68.0f) * this.f45591u5.f55498e) + org.telegram.messenger.g0.L(10.0f));
        if (A5) {
            L = (1.0f - this.f45601w5.f55498e) * org.telegram.messenger.g0.L(-91.0f);
        } else if (f45503z5) {
            L = 0.0f;
        } else {
            L = ((this.f45586t5.f55498e * org.telegram.messenger.g0.L(94.0f)) - (org.telegram.messenger.g0.L(104.0f) * this.U3.f39304c)) - org.telegram.messenger.g0.L(91.0f);
        }
        float T1 = org.telegram.messenger.g0.T1(L, f11, hVar.f54558b.f55524a);
        float measuredHeight = ((this.f28672b.getMeasuredHeight() - this.f45579s2) + T1) - this.f28704s0;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - org.telegram.messenger.g0.L(250.0f));
        nh.h hVar2 = this.W1;
        hVar2.setTranslationY(T1);
        hVar2.setVisibleHeight((int) max);
    }

    public final void b1() {
        if (this.E1 != null) {
            this.E1.setTranslationY((-this.f45599w3.d()) + this.f28672b.getPaddingBottom() + ((-this.f45591u5.f55498e) * org.telegram.messenger.g0.L(64.0f)));
        }
    }

    public final void c1() {
        boolean z9;
        float f10 = this.f45591u5.f55498e;
        float T1 = org.telegram.messenger.g0.T1(0.25f, 1.0f, f10);
        ImageView imageView = this.D1;
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
        ImageView imageView2 = this.C1;
        imageView2.setScaleX(T12);
        imageView2.setScaleY(org.telegram.messenger.g0.T1(0.25f, 1.0f, f11));
        imageView2.setAlpha(f11);
        if (f11 > 0.9f) {
            z10 = true;
        }
        imageView2.setClickable(z10);
    }

    public final void d1() {
        org.telegram.ui.Components.voip.y yVar = this.T4;
        if (yVar != null) {
            yVar.f39636a.setRoundCorners(org.telegram.messenger.g0.L(8.0f));
            org.telegram.ui.Components.voip.y yVar2 = this.T4;
            yVar2.h = false;
            yVar2.j(false);
            this.T4.invalidate();
            this.U3.invalidate();
        }
        org.telegram.ui.Cells.f4 f4Var = this.R4;
        if (f4Var != null && !this.V4 && f4Var.getParent() != null) {
            this.f28672b.removeView(this.R4);
        }
        org.telegram.ui.Cells.f4 f4Var2 = this.R4;
        if (f4Var2 != null) {
            f4Var2.setProgressToAvatarPreview(0.0f);
            this.R4.setAboutVisible(false);
            this.R4.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.g10 g10Var = this.U4;
        if (g10Var != null) {
            g10Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.R4 = null;
        this.S4 = null;
        this.U4 = null;
        this.T4 = null;
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
        int i17 = org.telegram.messenger.qs.f25103w2;
        n30 n30Var = this.K1;
        String[] strArr = null;
        int i18 = 0;
        if (i7 == i17) {
            Long l10 = (Long) objArr[1];
            org.telegram.messenger.r3 r3Var = this.U2;
            if (r3Var != null && r3Var.f25226b.f26970id == l10.longValue()) {
                org.telegram.messenger.r3 r3Var2 = this.U2;
                if (r3Var2.f25226b instanceof TLRPC.TL_groupCallDiscarded) {
                    dismiss();
                    return;
                }
                int i19 = (this.f45555n2 > 0L ? 1 : (this.f45555n2 == 0L ? 0 : -1));
                org.telegram.messenger.c cVar = this.n1;
                if (i19 == 0 && (((i16 = this.f45612z3) == 7 || i16 == 5 || i16 == 6) && !r3Var2.j())) {
                    try {
                        Intent intent = new Intent(this.f45512c2, VoIPService.class);
                        intent.putExtra("chat_id", l1());
                        intent.putExtra("createGroupCall", false);
                        intent.putExtra("hasFewPeers", this.V2);
                        intent.putExtra("peerChannelId", this.S2.channel_id);
                        intent.putExtra("peerChatId", this.S2.chat_id);
                        intent.putExtra("peerUserId", this.S2.user_id);
                        intent.putExtra("hash", this.W2);
                        intent.putExtra("peerAccessHash", this.S2.access_hash);
                        intent.putExtra("is_outgoing", true);
                        intent.putExtra("start_incall_activity", false);
                        intent.putExtra("account", cVar.f21770a);
                        intent.putExtra("scheduleDate", this.f45521e4);
                        this.f45512c2.startService(intent);
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    this.f45555n2 = SystemClock.elapsedRealtime();
                    org.telegram.messenger.g0.i3(new v00(this, 2), 3000L);
                }
                if (!this.f45560o2 && VoIPService.getSharedInstance() != null) {
                    this.U2.b(false);
                    o1();
                    VoIPService.getSharedInstance().playConnectedSound();
                }
                O1();
                int childCount = n30Var.getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt = n30Var.getChildAt(i20);
                    if (childAt instanceof org.telegram.ui.Cells.f4) {
                        ((org.telegram.ui.Cells.f4) childAt).a(true, false);
                    }
                }
                if (this.R4 != null) {
                    this.f45551m2 = true;
                } else {
                    Q0(true);
                }
                U1();
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                if (this.f45612z3 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                T1(true, booleanValue);
                V1(true);
                if (z10 && ((i15 = this.f45612z3) == 1 || i15 == 0)) {
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
                                ArrayList arrayList = org.telegram.messenger.qp.s1(cVar.f21770a).f24948y;
                                if (arrayList != null) {
                                    int size = arrayList.size();
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 >= size) {
                                            break;
                                        }
                                        Object obj = arrayList.get(i21);
                                        i21++;
                                        if (((TLRPC.Dialog) obj).f26964id == longValue) {
                                            i18 = 1;
                                            break;
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            if (org.telegram.messenger.m5.E(longValue)) {
                                TLRPC.User a22 = org.telegram.messenger.qp.s1(cVar.f21770a).a2(l11);
                                if (a22 != null) {
                                    if (this.U2.f25226b.participants_count < 250 || org.telegram.messenger.t10.w(a22) || a22.verified || i18 != 0) {
                                        n1().k(0L, 44, a22, this.T2, null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            TLRPC.Chat M02 = org.telegram.messenger.qp.s1(cVar.f21770a).M0(Long.valueOf(-longValue));
                            if (M02 != null) {
                                if (this.U2.f25226b.participants_count < 250 || !org.telegram.messenger.t3.r0(M02) || M02.verified || i18 != 0) {
                                    n1().k(0L, 44, M02, this.T2, null, null);
                                }
                            }
                        }
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25117y2) {
            c20 c20Var = this.U3;
            if (c20Var.f39302b && this.U2 != null) {
                boolean c10 = c20Var.c();
                org.telegram.messenger.r3 r3Var3 = this.U2;
                if (r3Var3 != null && c20Var.f39302b && (s3Var = c20Var.f39307e) != null && r3Var3.d.f(org.telegram.messenger.ij.B1(s3Var.f25413a.peer)) == null) {
                    c10 = true;
                }
                if (c10) {
                    org.telegram.messenger.s3 s3Var2 = null;
                    int i22 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f45542k2;
                        if (i22 >= arrayList2.size()) {
                            break;
                        }
                        org.telegram.messenger.s3 s3Var3 = (org.telegram.messenger.s3) arrayList2.get(i22);
                        if (this.U2.P.g(null, org.telegram.messenger.ij.B1(s3Var3.f25413a.peer)) != null) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = s3Var3.f25413a;
                            if (!groupCallParticipant3.muted_by_you && c20Var.d != org.telegram.messenger.ij.B1(groupCallParticipant3.peer)) {
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
            c20Var.setVisibleParticipant(true);
            U1();
        } else if (i7 == org.telegram.messenger.qs.N4) {
            H1(((Float) objArr[0]).floatValue());
        } else if (i7 == org.telegram.messenger.qs.M0) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                    if (org.telegram.messenger.t3.W(this.T2)) {
                        M0 = org.telegram.messenger.id.M0(2131743452, null);
                    } else {
                        M0 = org.telegram.messenger.id.M0(2131743319, null);
                    }
                } else if (!"ANONYMOUS_CALLS_DISABLED".equals(str) && !"GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    M0 = org.telegram.messenger.id.M0(2131751105, null) + "\n" + str;
                } else if (org.telegram.messenger.t3.W(this.T2)) {
                    M0 = org.telegram.messenger.id.M0(2131743478, null);
                } else {
                    M0 = org.telegram.messenger.id.M0(2131743370, null);
                }
                AlertDialog$Builder K = org.telegram.ui.Components.u4.K(getContext(), org.telegram.messenger.id.M0(2131743306, null), M0);
                K.j(new z00(this, 1));
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
            if (chatFull.f26961id == l1()) {
                O1();
                T1(isShowing(), false);
            }
            long B1 = org.telegram.messenger.ij.B1(this.f45588u2);
            org.telegram.messenger.r3 r3Var4 = this.U2;
            if (r3Var4 != null && chatFull.f26961id == (-B1) && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) r3Var4.d.f(B1)) != null) {
                groupCallParticipant2.about = chatFull.about;
                Q0(true);
                org.telegram.messenger.g0.b4(n30Var);
                if (this.f45609y4 != null) {
                    while (i18 < this.f45609y4.getChildCount()) {
                        View childAt2 = this.f45609y4.getChildAt(i18);
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
        } else if (i7 == org.telegram.messenger.qs.f25089u1) {
            if (((Long) objArr[0]).longValue() == l1()) {
                O1();
                T1(isShowing(), false);
            }
        } else if (i7 == org.telegram.messenger.qs.B2) {
            int childCount2 = n30Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i18 < childCount2) {
                v4.d1 G = n30Var.G(n30Var.getChildAt(i18));
                if (G != null) {
                    View view = G.f57052a;
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
            long B12 = org.telegram.messenger.ij.B1(this.f45588u2);
            if (this.U2 != null && B12 == l12.longValue() && (groupCallParticipant = (TLRPC.GroupCallParticipant) this.U2.d.f(B12)) != null) {
                groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
                Q0(true);
                org.telegram.messenger.g0.b4(n30Var);
                if (this.f45609y4 != null) {
                    while (i18 < this.f45609y4.getChildCount()) {
                        View childAt3 = this.f45609y4.getChildAt(i18);
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
        } else if (i7 == org.telegram.messenger.qs.f25024j0) {
            Q0(true);
            org.telegram.messenger.g0.b4(n30Var);
        } else if (i7 == org.telegram.messenger.qs.f25067r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i23 = org.telegram.messenger.qp.C8;
            int i24 = intValue & 16;
            if (i24 != 0) {
                Q0(true);
            }
            if (i24 != 0 || (intValue & 524288) != 0) {
                org.telegram.messenger.g0.b4(n30Var);
            }
        } else if (i7 == org.telegram.messenger.qs.f25124z2) {
            w20 w20Var = this.f45583t2;
            if (w20Var != null) {
                w20Var.b(true, true);
            }
            O1();
        } else if (i7 == org.telegram.messenger.qs.R3) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            g.b bVar = this.f45539j2;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            bVar.b(strArr);
        }
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity = this.f45512c2;
        launchActivity.Z0.remove(this.f45566p4);
        this.f45512c2.setRequestedOrientation(-1);
        f45502y5 = false;
        org.telegram.ui.Components.h20 h20Var = this.f45608y3;
        if (h20Var != null) {
            h20Var.dismiss();
        }
        this.f45551m2 = true;
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.F2, new Object[0]);
        org.telegram.messenger.c cVar = this.n1;
        int i7 = cVar.f21770a;
        int i10 = cVar.f21770a;
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.M0);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.f25103w2);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.T);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.f25089u1);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.B2);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.E0);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.f25024j0);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.f25067r);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.f25124z2);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.f25117y2);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.R3);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.N4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.D2);
        super.dismiss();
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i7;
        if (this.f45512c2 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.f45512c2.getSystemService("audio");
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
        if (!this.W4 && this.Z3) {
            if (z9) {
                this.W4 = true;
                D1(false, this.R4);
                return;
            }
            d1();
            this.f28672b.removeView(this.Y3);
            this.Y3 = null;
            this.f45600w4.setVisibility(8);
            this.f28672b.invalidate();
            this.Z3 = false;
            this.S1.X = true;
            this.K1.invalidate();
            this.V3.setVisibility(8);
            if (this.f45551m2) {
                this.f45551m2 = false;
                Q0(true);
            }
            U0();
        }
    }

    public final org.telegram.ui.Components.voip.r g1() {
        int i7 = 0;
        while (true) {
            n30 n30Var = this.K1;
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

    public final void h1(org.telegram.messenger.s3 s3Var) {
        org.telegram.messenger.s3 s3Var2;
        if (s3Var == null) {
            this.f45512c2.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            c20 c20Var = this.U3;
            if (c20Var.f39322r != null) {
                return;
            }
            boolean z9 = A5;
            n30 n30Var = this.K1;
            int i7 = 0;
            if (z9) {
                if (this.f45544k4 != null) {
                    n30Var.getViewTreeObserver().removeOnPreDrawListener(this.f45544k4);
                    this.f45544k4 = null;
                }
                ArrayList arrayList = new ArrayList();
                i40 i40Var = this.f45537i4;
                ArrayList arrayList2 = this.S3;
                ArrayList arrayList3 = this.T3;
                if (s3Var == null) {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                        org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) arrayList3.get(i10);
                        org.telegram.ui.Components.voip.r rVar = yVar.f39640c;
                        if (rVar != null) {
                            rVar.setRenderer(null);
                            org.telegram.ui.Components.g10 g10Var = yVar.d;
                            if (g10Var != null) {
                                g10Var.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.r rVar2 = yVar.f39643e;
                            if (rVar2 != null) {
                                rVar2.setRenderer(null);
                            }
                            arrayList.add(yVar.f39667x);
                            yVar.b(false);
                            yVar.animate().alpha(0.0f).setListener(new x20(this, yVar, 0));
                        }
                    }
                    this.J4 = false;
                    i40Var.H(this.f45533h4, true, true);
                } else {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        org.telegram.ui.Components.voip.y yVar2 = (org.telegram.ui.Components.voip.y) arrayList3.get(i11);
                        if (yVar2.f39643e != null && ((s3Var2 = yVar2.f39667x) == null || !s3Var2.equals(s3Var))) {
                            arrayList.add(yVar2.f39667x);
                            yVar2.b(false);
                            org.telegram.ui.Components.g10 g10Var2 = yVar2.d;
                            if (g10Var2 != null) {
                                g10Var2.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.r rVar3 = yVar2.f39640c;
                            if (rVar3 != null) {
                                rVar3.setRenderer(null);
                            }
                            yVar2.animate().alpha(0.0f).setListener(new x20(this, yVar2, 1));
                        }
                    }
                    this.J4 = true;
                    i40Var.f46483r = false;
                    if (!arrayList.isEmpty()) {
                        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.h41(29, this, arrayList));
                    }
                }
                ViewTreeObserver viewTreeObserver = n30Var.getViewTreeObserver();
                nh nhVar = new nh(this, s3Var, !c20Var.f39302b);
                this.f45544k4 = nhVar;
                viewTreeObserver.addOnPreDrawListener(nhVar);
                return;
            }
            if (this.f45544k4 != null) {
                n30Var.getViewTreeObserver().removeOnPreDrawListener(this.f45544k4);
                this.f45544k4 = null;
            }
            if (s3Var != null) {
                y10 y10Var = this.f45529g4;
                if (y10Var.getVisibility() != 0) {
                    y10Var.setVisibility(0);
                    org.telegram.ui.Components.h10 h10Var = this.f45540j4;
                    h10Var.G(y10Var, false);
                    this.f45551m2 = true;
                    if (!c20Var.f39302b) {
                        ArrayList arrayList4 = h10Var.f34119e;
                        v4.b0 b0Var = (v4.b0) y10Var.getLayoutManager();
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
                    ViewTreeObserver viewTreeObserver2 = n30Var.getViewTreeObserver();
                    nw nwVar = new nw(1, this, s3Var);
                    this.f45544k4 = nwVar;
                    viewTreeObserver2.addOnPreDrawListener(nwVar);
                    return;
                }
                c20Var.j(s3Var);
                org.telegram.messenger.g0.b4(y10Var);
            } else if (n30Var.getVisibility() != 0) {
                n30Var.setVisibility(0);
                Q0(false);
                this.f45551m2 = true;
                ViewTreeObserver viewTreeObserver3 = n30Var.getViewTreeObserver();
                z20 z20Var = new z20(this, 0);
                this.f45544k4 = z20Var;
                viewTreeObserver3.addOnPreDrawListener(z20Var);
            } else {
                ViewTreeObserver viewTreeObserver4 = n30Var.getViewTreeObserver();
                z20 z20Var2 = new z20(this, 1);
                this.f45544k4 = z20Var2;
                viewTreeObserver4.addOnPreDrawListener(z20Var2);
            }
        }
    }

    public final int k1() {
        Integer num = this.s5;
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
        TLRPC.Chat chat = this.T2;
        if (chat == null) {
            return 0L;
        }
        return chat.f26960id;
    }

    @Override
    public final boolean m0() {
        f45502y5 = true;
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.F2, new Object[0]);
        org.telegram.ui.Components.p10.k(getContext());
        return false;
    }

    public final void m1(boolean z9) {
        boolean z10;
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        org.telegram.messenger.c cVar = this.n1;
        int i7 = cVar.f21770a;
        int i10 = cVar.f21770a;
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(l1()));
        if (M0 != null && !org.telegram.messenger.t3.t0(M0)) {
            TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(i10).N0(l1());
            String K = org.telegram.messenger.t3.K(this.T2, false);
            if (!TextUtils.isEmpty(K)) {
                str = org.telegram.ui.Cells.f1.n(org.telegram.messenger.qp.s1(i10).U2, "/", K, new StringBuilder());
            } else if (N0 != null && (tL_chatInviteExported = N0.exported_invite) != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                tL_messages_exportChatInvite.peer = org.telegram.messenger.qp.l1(this.T2);
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_exportChatInvite, new bi.u9(this, N0, z9, 6));
                return;
            }
            z1(null, str, true, z9);
        } else if (this.U2 != null) {
            for (int i11 = 0; i11 < 2; i11++) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                org.telegram.messenger.r3 r3Var = this.U2;
                exportgroupcallinvite.call = r3Var.g(r3Var.f25225a);
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
        if (!A5) {
            c20 c20Var = this.U3;
            if (c20Var.f39302b) {
                return c20Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.d2;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.d(2, true);
            this.f28672b.removeView(undoViewArr[0]);
            this.f28672b.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void o1() {
        VoIPService sharedInstance;
        int i7;
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (!this.f45560o2 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            this.f45560o2 = true;
            this.f45603x2.addAll(this.U2.f25230g);
            this.f45607y2.addAll(this.f45542k2);
            this.f45611z2.addAll(this.U2.f25232j);
            this.A2.addAll(this.U2.f25235m);
            this.B2.addAll(this.U2.f25234l);
            this.N3 = sharedInstance.getCallState();
            if (this.U2 == null) {
                org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
                this.U2 = r3Var;
                this.f45540j4.f34118c = r3Var;
                this.U3.setGroupCall(r3Var);
                this.f45537i4.f46479c = this.U2;
            }
            nh.h hVar = this.W1;
            if (hVar != null) {
                hVar.D0(this.n1.f21770a, this.U2.g(false));
            }
            this.I1.setTitleRightMargin(org.telegram.messenger.g0.L(48.0f) * 2);
            ArrayList arrayList = this.U2.f25228e;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((TLRPC.GroupCallParticipant) arrayList.get(i10)).lastActiveDate = groupCallParticipant.active_date;
            }
            VoIPService.getSharedInstance().registerStateListener(this);
            m30 m30Var = this.P1;
            if (m30Var != null && m30Var.getVisibility() == 0) {
                this.f45582t1.c(2131230918, -1, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28160rh, false), 0.3f, false, org.telegram.messenger.id.M0(2131743364, null), false, true);
                S1(true);
                if (org.telegram.messenger.t3.W(this.T2)) {
                    i7 = 2131743481;
                } else {
                    i7 = 2131743380;
                }
                this.f45570q3.setText(org.telegram.messenger.id.M0(i7, null));
                n30 n30Var = this.K1;
                n30Var.setVisibility(0);
                org.telegram.ui.ActionBar.r0 r0Var = this.f45524f3;
                r0Var.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(n30Var, property, 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(n30Var, View.TRANSLATION_Y, org.telegram.messenger.g0.L(200.0f), 0.0f);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(m30Var, property2, 0.0f);
                Property property3 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(m30Var, property3, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(m30Var, property, 0.0f);
                org.telegram.ui.ActionBar.m5 m5Var = this.O1;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(m5Var, property2, 0.0f);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(m5Var, property3, 0.0f);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(m5Var, property, 0.0f);
                org.telegram.ui.ActionBar.m5 m5Var2 = this.Q1;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(m5Var2, property2, 0.0f), ObjectAnimator.ofFloat(m5Var2, property3, 0.0f), ObjectAnimator.ofFloat(m5Var2, property, 0.0f), ObjectAnimator.ofFloat(r0Var, property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(r0Var, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(r0Var, property, 0.0f, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.wq.f40047g);
                animatorSet.addListener(new a30(this, 0));
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
        n30 n30Var = this.K1;
        if (n30Var.getVisibility() == 0) {
            org.telegram.messenger.g0.b4(n30Var);
        }
        y10 y10Var = this.f45529g4;
        if (y10Var.getVisibility() == 0) {
            org.telegram.messenger.g0.b4(y10Var);
        }
        ArrayList arrayList = this.T3;
        arrayList.clear();
        arrayList.addAll(this.S3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).j(true);
        }
    }

    @Override
    public final void onBackPressed() {
        w20 w20Var = this.f45583t2;
        if (w20Var != null) {
            w20Var.b(false, false);
        } else if (this.Z3) {
            f1(true);
        } else if (this.U3.f39302b) {
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
        ArrayList arrayList = this.T3;
        arrayList.clear();
        arrayList.addAll(this.S3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).j(true);
        }
        w20 w20Var = this.f45583t2;
        if (w20Var != null && VoIPService.getSharedInstance() != null) {
            w20Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.f45512c2;
        launchActivity.Z0.add(this.f45566p4);
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
        this.N3 = i7;
        T1(isShowing(), false);
    }

    @Override
    public final void onVideoAvailableChange(boolean z9) {
        org.telegram.messenger.voip.s0.h(this, z9);
    }

    public final void p1(final long j3, final boolean z9) {
        if (this.U2 != null) {
            org.telegram.messenger.c cVar = this.n1;
            final TLRPC.User a22 = org.telegram.messenger.qp.s1(cVar.f21770a).a2(Long.valueOf(j3));
            if (a22 != null) {
                final org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, getContext(), null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                org.telegram.messenger.r3 r3Var = this.U2;
                invitetogroupcall.call = r3Var.g(r3Var.f25225a);
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = a22.f27109id;
                tL_inputUser.access_hash = a22.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = ConnectionsManager.getInstance(cVar.f21770a).sendRequest(invitetogroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        f40 f40Var = f40.this;
                        long j10 = j3;
                        org.telegram.ui.ActionBar.u1[] u1VarArr2 = u1VarArr;
                        if (tLObject != null) {
                            org.telegram.messenger.qp.s1(f40Var.n1.f21770a).O3((TLRPC.Updates) tLObject, false);
                            org.telegram.messenger.g0.h3(new bi.w2(f40Var, j10, u1VarArr2, a22, 20));
                            return;
                        }
                        org.telegram.messenger.g0.h3(new bi.o(f40Var, u1VarArr2, z9, tL_error, j10, invitetogroupcall));
                    }
                });
                if (sendRequest != 0) {
                    org.telegram.messenger.g0.i3(new h10(this, u1VarArr, sendRequest, 0), 500L);
                }
            }
        }
    }

    public final boolean q1() {
        float f10;
        int L = org.telegram.messenger.g0.L(74.0f);
        float f11 = this.f45579s2 - L;
        if (this.f28704s0 + f11 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - f11) - this.f28704s0) / ((L - this.f28704s0) - org.telegram.messenger.g0.L(14.0f)));
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
            RadialProgressView radialProgressView = this.Y1;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ch, false));
            }
            org.telegram.ui.ActionBar.r0 r0Var = this.f45520e3;
            if (r0Var != null) {
                int i7 = org.telegram.ui.ActionBar.m6.Vg;
                r0Var.O(org.telegram.ui.ActionBar.m6.x0(null, i7, false), false);
                r0Var.O(org.telegram.ui.ActionBar.m6.x0(null, i7, false), true);
                r0Var.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Sg, false));
            }
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Vg, false);
            K1(this.f45575r3, x02);
            K1(this.f45580s3, x02);
            K1(this.j3, x02);
            K1(this.f45543k3, x02);
            K1(this.f45570q3, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28010jh, false));
            K1(this.f45532h3, x02);
            K1(this.f45536i3, x02);
            K1(this.f45547l3, x02);
            K1(this.f45552m3, x02);
            K1(this.f45556n3, x02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        ti.o oVar;
        super.show();
        org.telegram.ui.Components.voip.g1 g1Var = org.telegram.ui.Components.voip.g1.f39226w;
        if (g1Var != null && (oVar = g1Var.f39227a) != null && oVar.e()) {
            org.telegram.ui.Components.voip.g1 g1Var2 = org.telegram.ui.Components.voip.g1.f39226w;
            if (g1Var2.f39227a != null) {
                org.telegram.ui.Components.voip.q0 q0Var = g1Var2.f39230e;
                g1Var2.f39230e = null;
                g1Var2.f39228b.f39149a = null;
                g1Var2.f39227a.a(new org.telegram.ui.Components.ex(7, g1Var2, q0Var));
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.us(13));
            }
        }
    }

    public final boolean t1() {
        if (!u1() || this.U2.f25229f.isEmpty() || (((org.telegram.messenger.s3) this.U2.f25229f.get(0)).f25415c != 0.0f && ((org.telegram.messenger.s3) this.U2.f25229f.get(0)).f25415c < 1.0f)) {
            return false;
        }
        return true;
    }

    public final boolean u1() {
        org.telegram.messenger.r3 r3Var = this.U2;
        if (r3Var != null && r3Var.f25226b.rtmp_stream) {
            return true;
        }
        return false;
    }

    public final void v1(org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.u1 u1Var, EditTextBoldCursor editTextBoldCursor, boolean z9) {
        long j3;
        if (!this.f45569q2) {
            org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f45512c2.M().getFragmentStack().get(this.f45512c2.M().getFragmentStack().size() - 1);
            if (f2Var instanceof cn) {
                boolean ra2 = ((cn) f2Var).ra();
                this.f45569q2 = true;
                this.f45574r2 = true;
                xn xnVar = new xn(w2Var, editTextBoldCursor, z9, u1Var, 7);
                if (ra2) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                org.telegram.messenger.g0.i3(xnVar, j3);
                return;
            }
            this.f45569q2 = true;
            this.f45574r2 = true;
            if (w2Var != null) {
                w2Var.A0(true);
            } else if (u1Var != null) {
                u1Var.l(true);
            }
            if (z9) {
                org.telegram.messenger.g0.i3(new rg(editTextBoldCursor, 2), 100L);
            }
        }
    }

    public final void x1() {
        C5 = true;
        ArrayList arrayList = this.T3;
        arrayList.clear();
        arrayList.addAll(this.S3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).j(false);
        }
        l30 l30Var = this.F1;
        org.telegram.ui.Components.y61 y61Var = l30Var.f38073w;
        if (y61Var != null) {
            y61Var.c(false);
        }
        l30Var.F = true;
        this.B1.r();
    }

    public final void y1() {
        C5 = false;
        this.J1.f();
        y10 y10Var = this.f45529g4;
        if (y10Var.getVisibility() == 0) {
            this.f45540j4.G(y10Var, false);
        }
        if (A5) {
            this.f45537i4.I(this.f45533h4, false);
        }
        ArrayList arrayList = this.T3;
        arrayList.clear();
        arrayList.addAll(this.S3);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).j(true);
        }
        l30 l30Var = this.F1;
        org.telegram.ui.Components.y61 y61Var = l30Var.f38073w;
        if (y61Var != null) {
            y61Var.c(true);
        }
        l30Var.F = false;
        this.B1.s();
    }

    public final void z1(java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f40.z1(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    @Override
    public final void F(float f10, int i7) {
    }
}

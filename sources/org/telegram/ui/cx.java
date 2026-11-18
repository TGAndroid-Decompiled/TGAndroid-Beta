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
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
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
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
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
public class cx extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs, pg.b, te.b, le0 {
    public static boolean C4;
    public static final boolean[] D4 = new boolean[4];
    public static final org.telegram.ui.Components.bq0 E4 = new org.telegram.ui.Components.bq0(3);
    public static float F4;
    public rw A0;
    public jh.f A1;
    public boolean A2;
    public float A3;
    public int A4;
    public boolean B0;
    public FrameLayout B1;
    public boolean B2;
    public boolean B3;
    public int B4;
    public int C0;
    public FrameLayout C1;
    public boolean C2;
    public boolean C3;
    public kw D0;
    public nv D1;
    public boolean D2;
    public Long D3;
    public boolean E;
    public org.telegram.ui.Components.ys0 E0;
    public oi.u1 E1;
    public ww E2;
    public Drawable E3;
    public boolean F;
    public tv F0;
    public org.telegram.ui.ActionBar.r0 F1;
    public ArrayList F2;
    public org.telegram.ui.Components.m5 F3;
    public boolean G;
    public org.telegram.ui.Components.as G0;
    public final TextPaint G1;
    public String G2;
    public org.telegram.ui.Cells.o G3;
    public TLRPC.RequestPeerType H;
    public boolean H0;
    public lv H1;
    public CharSequence H2;
    public xv H3;
    public long I;
    public float I0;
    public FrameLayout I1;
    public org.telegram.ui.Components.cp0 I2;
    public final mv I3;
    public ValueAnimator J;
    public float J0;
    public lv J1;
    public vs J2;
    public final mv J3;
    public ValueAnimator K;
    public float K0;
    public FrameLayout K1;
    public final ArrayList K2;
    public f K3;
    public boolean L;
    public uv L0;
    public org.telegram.ui.Components.cs L1;
    public boolean L2;
    public xi.e L3;
    public boolean M;
    public org.telegram.ui.Components.y60 M0;
    public org.telegram.ui.Components.bs M1;
    public int M2;
    public Drawable M3;
    public boolean N;
    public zv N0;
    public org.telegram.ui.Cells.m N1;
    public int N2;
    public int N3;
    public float O;
    public boolean O0;
    public org.telegram.ui.Cells.c3 O1;
    public boolean O2;
    public boolean O3;
    public boolean P;
    public boolean P0;
    public org.telegram.ui.Cells.oa P1;
    public int P2;
    public boolean P3;
    public int Q;
    public long Q0;
    public Long Q1;
    public int Q2;
    public boolean Q3;
    public boolean R;
    public long R0;
    public Long R1;
    public int R2;
    public final gu R3;
    public boolean S;
    public long S0;
    public mi.j S1;
    public int S2;
    public int S3;
    public org.telegram.ui.Components.gc T;
    public int T0;
    public ArrayList T1;
    public int T2;
    public AnimatorSet T3;
    public float U;
    public int U0;
    public boolean U1;
    public int U2;
    public boolean U3;
    public boolean V;
    public int V0;
    public org.telegram.ui.ActionBar.u1 V1;
    public int V2;
    public rt V3;
    public boolean W;
    public boolean W0;
    public boolean W1;
    public int W2;
    public String W3;
    public boolean X;
    public org.telegram.ui.Components.zb0 X0;
    public boolean X1;
    public boolean X2;
    public ArrayList X3;
    public qw Y;
    public org.telegram.ui.Cells.u2 Y0;
    public long Y1;
    public int Y2;
    public boolean Y3;
    public bg.p0 Z;
    public org.telegram.ui.Cells.u2 Z0;
    public TLObject Z1;
    public cx Z2;
    public CharSequence Z3;
    public final int f46634a;
    public ez0 f46635a0;
    public boolean f46636a1;
    public int f46637a2;
    public long f46638a3;
    public boolean f46639a4;
    public final te.a f46640b;
    public org.telegram.ui.Components.f71 f46641b0;
    public boolean f46642b1;
    public int f46643b2;
    public TLRPC.Chat f46644b3;
    public float f46645b4;
    public final te.a f46646c;
    public jg.q0 f46647c0;
    public final ArrayList f46648c1;
    public boolean f46649c2;
    public TLRPC.ChatFull f46650c3;
    public boolean f46651c4;
    public final te.a d;
    public float f46652d0;
    public boolean f46653d1;
    public boolean d2;
    public org.telegram.ui.Components.q9 f46654d3;
    public boolean f46655d4;
    public final te.a f46656e;
    public ValueAnimator f46657e0;
    public boolean f46658e1;
    public boolean f46659e2;
    public org.telegram.ui.Components.b9 f46660e3;
    public ValueAnimator f46661e4;
    public final te.a f46662f;
    public bx[] f46663f0;
    public boolean f46664f1;
    public int f46665f2;
    public long f46666f3;
    public org.telegram.ui.Components.u30 f46667f4;
    public org.telegram.ui.ActionBar.r0 f46668g0;
    public org.telegram.ui.ActionBar.y1 f46669g1;
    public boolean f46670g2;
    public boolean f46671g3;
    public TLRPC.FileLocation f46672g4;
    public final te.a h;
    public org.telegram.ui.ActionBar.r0 f46673h0;
    public final Paint f46674h1;
    public String f46675h2;
    public boolean f46676h3;
    public TLRPC.FileLocation f46677h4;
    public ex f46678i0;
    public ImageView f46679i1;
    public String f46680i2;
    public AnimatorSet f46681i3;
    public org.telegram.ui.Components.gc f46682i4;
    public boolean f46683j0;
    public NumberTextView f46684j1;
    public String f46685j2;
    public boolean j3;
    public int f46686j4;
    public org.telegram.ui.ActionBar.r0 f46687k0;
    public final ArrayList f46688k1;
    public boolean f46689k2;
    public boolean f46690k3;
    public int f46691k4;
    public org.telegram.ui.ActionBar.r0 f46692l0;
    public org.telegram.ui.ActionBar.r0 l1;
    public boolean f46693l2;
    public float f46694l3;
    public int f46695l4;
    public org.telegram.ui.ActionBar.r0 m0;
    public org.telegram.ui.ActionBar.r0 f46696m1;
    public boolean f46697m2;
    public boolean f46698m3;
    public int f46699m4;
    public final te.a f46700n;
    public org.telegram.ui.ActionBar.r0 f46701n0;
    public org.telegram.ui.ActionBar.r0 n1;
    public boolean f46702n2;
    public int f46703n3;
    public int f46704n4;
    public org.telegram.ui.Components.vg0 f46705o0;
    public org.telegram.ui.ActionBar.r0 f46706o1;
    public boolean f46707o2;
    public boolean f46708o3;
    public final dh.g o4;
    public org.telegram.ui.ActionBar.z0 f46709p0;
    public org.telegram.ui.ActionBar.z0 f46710p1;
    public String f46711p2;
    public boolean f46712p3;
    public final ui.f f46713p4;
    public hi.m3 f46714q0;
    public org.telegram.ui.ActionBar.z0 f46715q1;
    public String f46716q2;
    public org.telegram.ui.Components.gc f46717q3;
    public final ui.f f46718q4;
    public final te.a f46719r;
    public hi.m3 f46720r0;
    public org.telegram.ui.ActionBar.z0 f46721r1;
    public final org.telegram.messenger.sr f46722r2;
    public final h2.f f46723r3;
    public final ui.c f46724r4;
    public final te.a f46725s;
    public boolean f46726s0;
    public org.telegram.ui.ActionBar.z0 f46727s1;
    public boolean f46728s2;
    public boolean f46729s3;
    public final dh.c f46730s4;
    public boolean f46731t0;
    public org.telegram.ui.ActionBar.z0 f46732t1;
    public boolean f46733t2;
    public boolean f46734t3;
    public final dh.c f46735t4;
    public org.telegram.ui.Components.a10 f46736u0;
    public org.telegram.ui.ActionBar.z0 f46737u1;
    public boolean f46738u2;
    public boolean f46739u3;
    public final dh.c f46740u4;
    public org.telegram.ui.Components.a10 f46741v0;
    public org.telegram.ui.ActionBar.z0 f46742v1;
    public boolean f46743v2;
    public boolean f46744v3;
    public final dh.c f46745v4;
    public final rh.h f46746w;
    public hi.d f46747w0;
    public float f46748w1;
    public boolean f46749w2;
    public float f46750w3;
    public wu f46751w4;
    public boolean f46752x;
    public lh.f f46753x0;
    public float f46754x1;
    public boolean f46755x2;
    public ValueAnimator f46756x3;
    public final ArrayList f46757x4;
    public int f46758y;
    public int f46759y0;
    public AnimatorSet f46760y1;
    public boolean f46761y2;
    public float f46762y3;
    public final RectF f46763y4;
    public final UndoView[] f46764z0;
    public float f46765z1;
    public boolean f46766z2;
    public float f46767z3;
    public final RectF f46768z4;

    public cx(Bundle bundle) {
        super(bundle);
        int i7;
        int L;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            i7 = 48;
        } else {
            i7 = 0;
        }
        this.f46634a = i7;
        org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.h;
        this.f46640b = new te.a(1, this, lrVar, 350L, false);
        this.f46646c = new te.a(2, this, lrVar, 350L, false);
        this.d = new te.a(3, this, lrVar, 350L, false);
        this.f46656e = new te.a(4, this, lrVar, 350L, false);
        this.f46662f = new te.a(5, this, lrVar, 350L, false);
        this.h = new te.a(6, this, lrVar, 350L, false);
        this.f46700n = new te.a(7, this, lrVar, 350L, false);
        this.f46719r = new te.a(8, this, lrVar, 350L, false);
        this.f46725s = new te.a(9, this, lrVar, 350L, false);
        this.f46746w = new rh.h(new gu(this, 27));
        this.f46758y = -1;
        this.G = true;
        this.L = false;
        this.M = false;
        this.N = false;
        this.R = true;
        this.f46652d0 = 1.0f;
        this.f46764z0 = new UndoView[2];
        this.f46648c1 = new ArrayList();
        this.f46674h1 = new Paint();
        this.f46688k1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.G1 = new TextPaint(1);
        this.W1 = true;
        this.f46659e2 = true;
        this.f46689k2 = true;
        this.f46722r2 = new Object();
        this.K2 = new ArrayList();
        this.L2 = true;
        this.f46723r3 = new h2.f((int[]) null);
        this.I3 = new mv(this, 0);
        this.J3 = new mv(this, 1);
        this.N3 = -4;
        this.O3 = true;
        this.P3 = true;
        this.R3 = new gu(this, 28);
        this.S3 = -1;
        this.f46645b4 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.f46757x4 = arrayList;
        RectF rectF = new RectF();
        this.f46763y4 = rectF;
        RectF rectF2 = new RectF();
        this.f46768z4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        ui.c d = this.glassEngine.d(new ju(this, 12));
        this.f46724r4 = d;
        if (i10 >= 31) {
            dh.g gVar = new dh.g(false);
            this.o4 = gVar;
            ui.f fVar = new ui.f(d);
            this.f46718q4 = fVar;
            fVar.f59008f = d;
            fVar.d = gVar;
            fVar.f59007e = -2;
            ui.f fVar2 = new ui.f(null);
            this.f46713p4 = fVar2;
            fVar2.f59008f = d;
            fVar2.d = gVar;
            fVar2.f59007e = -3;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.f46740u4 = cVar;
            cVar.f8379k = true;
            if (org.telegram.messenger.pc.e(262144)) {
                L = org.telegram.messenger.g0.L(8.0f);
            } else {
                L = org.telegram.messenger.g0.L(48.0f);
            }
            cVar.d = L;
            cVar.f8374e = L;
            dh.c cVar2 = new dh.c(fVar2, fVar2, fVar2);
            this.f46730s4 = cVar2;
            cVar2.f8379k = true;
            int L2 = org.telegram.messenger.g0.L(48.0f);
            cVar2.d = L2;
            cVar2.f8374e = L2;
            this.f46735t4 = new dh.c(fVar2, fVar2, fVar2);
        } else {
            this.o4 = null;
            this.f46713p4 = null;
            this.f46718q4 = null;
            this.f46730s4 = new dh.c(d, d, d);
            this.f46740u4 = new dh.c(d, d, d);
            this.f46735t4 = new dh.c(d, d, d);
        }
        dh.c cVar3 = new dh.c(d, d, d);
        this.f46745v4 = cVar3;
        dh.c cVar4 = this.f46740u4;
        ri.q qVar = this.glassEngine;
        cVar4.f8378j = qVar;
        this.f46730s4.f8378j = qVar;
        this.f46735t4.f8378j = qVar;
        cVar3.f8378j = qVar;
    }

    public static void A0(cx cxVar) {
        if (!cxVar.P3) {
            hi.m3 m3Var = cxVar.f46720r0;
            if (m3Var != null) {
                if (m3Var.W) {
                    return;
                }
                org.telegram.messenger.g0.E2(m3Var);
            }
            SpannableStringBuilder R2 = org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.n6.xj, 0, new zu(cxVar, 4), null);
            hi.m3 m3Var2 = new hi.m3(cxVar.getParentActivity(), 2);
            m3Var2.s(8.0f);
            m3Var2.d = 8000L;
            m3Var2.k(true);
            m3Var2.r(true);
            m3Var2.h = org.telegram.messenger.g0.f24118q.x - org.telegram.messenger.g0.L(148.0f);
            m3Var2.v(R2);
            m3Var2.o(1.0f, -40.0f);
            m3Var2.j(cxVar.getThemedColor(org.telegram.ui.ActionBar.n6.wj));
            cxVar.f46720r0 = m3Var2;
            m3Var2.setTranslationY((-cxVar.f46691k4) - cxVar.f46699m4);
            ((ViewGroup) cxVar.fragmentView).addView(cxVar.f46720r0, c8.ma.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
            cxVar.f46720r0.x();
            return;
        }
        hi.m3 m3Var3 = cxVar.f46714q0;
        if (m3Var3 != null) {
            m3Var3.f(true);
        }
        fi.j6 o4 = org.telegram.messenger.mp.u1(cxVar.currentAccount).R1().o();
        if (o4 != null && o4.a(cxVar.currentAccount, 1)) {
            cxVar.showDialog(new ug.l0(o4.b(), cxVar.currentAccount, cxVar.getParentActivity(), cxVar, null));
            return;
        }
        hi.ta D = hi.ta.D(cxVar.getParentActivity(), cxVar.currentAccount);
        D.f15498y = new hv(cxVar);
        D.Q(null);
    }

    public static void B0(cx cxVar) {
        org.telegram.messenger.mp.u1(cxVar.currentAccount).s4(0L, "BIRTHDAY_SETUP");
        cxVar.o5();
        org.telegram.ui.Components.gc K = org.telegram.ui.Components.lc.b0(cxVar).K(2131623982, org.telegram.messenger.gd.M0(2131753712, null), org.telegram.messenger.gd.M0(2131745300, null), new zu(cxVar, 9));
        K.f35461j = 5000;
        K.j();
    }

    public static void C0(cx cxVar, TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull d2 = cxVar.getMessagesController().d2(cxVar.getUserConfig().e());
        if (d2 != null) {
            tL_birthday2 = d2.birthday;
        } else {
            tL_birthday2 = null;
        }
        if (d2 != null) {
            d2.flags2 |= 32;
            d2.birthday = tL_birthday;
        }
        cxVar.getMessagesController().o2();
        cxVar.getConnectionsManager().sendRequest(updatebirthday, new z9(cxVar, d2, tL_birthday2, 8), 1024);
        org.telegram.messenger.mp.u1(cxVar.currentAccount).s4(0L, "BIRTHDAY_SETUP");
        cxVar.o5();
    }

    public static void D0(org.telegram.ui.cx r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cx.D0(org.telegram.ui.cx, int):void");
    }

    public static void E0(cx cxVar) {
        cxVar.presentFragment(new PrivacySettingsActivity());
        org.telegram.messenger.g0.j3(cxVar.parentLayout, "newChatsRow");
    }

    public static void F0(cx cxVar, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        try {
            u1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (tLObject != null) {
            cxVar.arguments.getString("importTitle");
            String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
            bi.y3 y3Var = new bi.y3(cxVar, j3, 26);
            Pattern pattern = org.telegram.ui.Components.b5.f33529a;
            if (cxVar.getParentActivity() != null) {
                if (chat != null || user != null) {
                    int currentAccount = cxVar.getCurrentAccount();
                    Activity parentActivity = cxVar.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    long e11 = org.telegram.messenger.j10.i(currentAccount).e();
                    TextView textView = new TextView(parentActivity);
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29502j5, null);
                    textView.setTextSize(1, 16.0f);
                    if (org.telegram.messenger.gd.f24213a0) {
                        i7 = 5;
                    } else {
                        i7 = 3;
                    }
                    textView.setGravity(i7 | 48);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    alertDialog$Builder.o(frameLayout);
                    org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
                    b9Var.u(org.telegram.messenger.g0.L(12.0f));
                    org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(parentActivity);
                    q9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
                    if (org.telegram.messenger.gd.f24213a0) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    frameLayout.addView(q9Var, c8.ma.d(40, 40.0f, i10 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(parentActivity);
                    org.telegram.messenger.f3.l(textView2, org.telegram.ui.ActionBar.n6.E8, null, 1, 20.0f);
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    if (org.telegram.messenger.gd.f24213a0) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView2.setGravity(i11 | 16);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setText(org.telegram.messenger.gd.M0(2131749053, null));
                    boolean z10 = org.telegram.messenger.gd.f24213a0;
                    if (z10) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    int i16 = i12 | 48;
                    if (z10) {
                        i13 = 21;
                    } else {
                        i13 = 76;
                    }
                    float f10 = i13;
                    if (z10) {
                        i14 = 76;
                    } else {
                        i14 = 21;
                    }
                    frameLayout.addView(textView2, c8.ma.d(-1, -2.0f, i16, f10, 11.0f, i14, 0.0f));
                    if (org.telegram.messenger.gd.f24213a0) {
                        i15 = 5;
                    } else {
                        i15 = 3;
                    }
                    frameLayout.addView(textView, c8.ma.d(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                    if (user != null) {
                        if (org.telegram.messenger.o10.A(user)) {
                            b9Var.f33601p = 0.8f;
                            b9Var.g(12);
                            q9Var.j(null, null, b9Var, user);
                        } else if (user.f28552id == e11) {
                            b9Var.f33601p = 0.8f;
                            b9Var.g(1);
                            q9Var.j(null, null, b9Var, user);
                        } else {
                            b9Var.f33601p = 1.0f;
                            b9Var.r(user);
                            q9Var.f(user, b9Var);
                        }
                    } else {
                        b9Var.q(chat);
                        q9Var.f(chat, b9Var);
                    }
                    textView.setText(org.telegram.messenger.g0.W2(str));
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131749073, null), new org.telegram.ui.Components.b0(y3Var, 3));
                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                    cxVar.showDialog(alertDialog$Builder.f28744a);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.b5.c0(cxVar.currentAccount, tL_error, cxVar, tL_messages_checkHistoryImportPeer, new Object[0]);
        cxVar.getNotificationCenter().k(org.telegram.messenger.ks.f25205v1, Long.valueOf(j3), tL_messages_checkHistoryImportPeer, tL_error);
    }

    public static void G0(cx cxVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(launchActivity, cxVar.currentAccount, tL_attachMenuBot, null, true);
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(cxVar.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = d02.f26599b;
        if (tL_attachMenuBots != null) {
            long j3 = d02.f26596a;
            d02.getMessagesStorage().f27052a.c(new org.telegram.messenger.ek(d02.f26607e, 2, j3, d02, tL_attachMenuBots));
        }
    }

    public static void H0(cx cxVar, float f10, ValueAnimator valueAnimator) {
        cxVar.f46663f0[0].setTranslationY((1.0f - cxVar.f46750w3) * f10);
        cxVar.f46750w3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i7 = 0; i7 < cxVar.actionBar.getChildCount(); i7++) {
            if (cxVar.actionBar.getChildAt(i7).getVisibility() == 0 && cxVar.actionBar.getChildAt(i7) != cxVar.actionBar.getActionMode() && cxVar.actionBar.getChildAt(i7) != cxVar.actionBar.getBackButton()) {
                cxVar.actionBar.getChildAt(i7).setAlpha(1.0f - cxVar.f46750w3);
            }
        }
        cxVar.Q3();
        cxVar.I3();
        View view = cxVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void I0(cx cxVar) {
        org.telegram.messenger.mp.u1(cxVar.currentAccount).s4(0L, "PREMIUM_GRACE");
        cxVar.o5();
    }

    public static void J0(cx cxVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.mp.u1(cxVar.currentAccount).q1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(cxVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new z9(cxVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void K0(cx cxVar, int i7, ArrayList arrayList, boolean z10, HashSet hashSet) {
        HashSet hashSet2;
        if (i7 == 102) {
            cxVar.getMessagesController().f25763t0 = true;
            if (z10) {
                hashSet2 = hashSet;
            } else {
                hashSet2 = null;
            }
            cxVar.K4(arrayList, i7, false, false, hashSet2);
            org.telegram.messenger.mp messagesController = cxVar.getMessagesController();
            messagesController.f25763t0 = false;
            messagesController.getNotificationCenter().k(org.telegram.messenger.ks.f25184s, Boolean.TRUE);
            cxVar.getMessagesController().J(cxVar.Y2);
            int i10 = cxVar.Y2;
            if (i10 != 0 && cxVar.d4(cxVar.currentAccount, cxVar.f46663f0[0].f46305s, i10, false).size() == 0) {
                cxVar.f46663f0[0].f46298a.setEmptyView(null);
                cxVar.f46663f0[0].f46307x.setVisibility(4);
                cxVar.finishFragment();
                return;
            }
            return;
        }
        cxVar.K4(arrayList, i7, false, false, null);
    }

    public static void L0(cx cxVar) {
        org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(cxVar.getParentActivity(), cxVar.resourceProvider);
        obVar.d(2131624009, new String[0]);
        obVar.f38055b.setText(org.telegram.messenger.gd.M0(2131742553, null));
        org.telegram.ui.Components.gc.g(cxVar, obVar, 2750).j();
        try {
            cxVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void X2(cx cxVar, float f10) {
        float f11;
        float f12;
        int i7;
        int i10;
        float i11 = Utilities.i(cxVar.f46765z1 * 2.0f, 1.0f, 0.0f);
        tv tvVar = cxVar.F0;
        float f13 = (1.0f - cxVar.f46750w3) * f10 * cxVar.I0;
        float f14 = 1.0f - i11;
        tvVar.setAlpha(f13 * f14);
        int i12 = 0;
        if (!cxVar.L && !cxVar.N) {
            if (cxVar.M) {
                cxVar.F0.setTranslationY((Math.max(cxVar.O, -cxVar.g4()) + (-org.telegram.messenger.g0.L(81.0f))) - org.telegram.messenger.g0.L(8.0f));
                cxVar.F0.setProgressToCollapse(1.0f);
                tv tvVar2 = cxVar.F0;
                tvVar2.setClipTop((int) (org.telegram.messenger.g0.f24112m - tvVar2.getY()));
            }
            f11 = 1.0f - cxVar.I0;
            cxVar.actionBar.setTranslationY(0.0f);
        } else {
            float i13 = Utilities.i((-cxVar.O) / org.telegram.messenger.g0.L(81.0f), 1.0f, 0.0f);
            if (cxVar.f46750w3 == 1.0f) {
                i13 = 1.0f;
            }
            float i14 = Utilities.i(i13 / 0.5f, 1.0f, 0.0f);
            cxVar.F0.setClipTop(0);
            if (!cxVar.L && cxVar.N) {
                cxVar.F0.setTranslationY((-org.telegram.messenger.g0.L(81.0f)) - org.telegram.messenger.g0.L(8.0f));
                cxVar.F0.setProgressToCollapse(1.0f);
                f12 = cxVar.I0;
            } else {
                cxVar.F0.setTranslationY(((cxVar.U / 2.0f) + (Math.max(cxVar.O, -cxVar.g4()) + cxVar.f46762y3)) - org.telegram.messenger.g0.L(8.0f));
                cxVar.F0.l(!cxVar.H3.c(), i13);
                if (!cxVar.N) {
                    f12 = cxVar.I0;
                } else {
                    f11 = 1.0f - i14;
                    cxVar.actionBar.setTranslationY(0.0f);
                }
            }
            f11 = 1.0f - f12;
            cxVar.actionBar.setTranslationY(0.0f);
        }
        float f15 = f11 * f14;
        if (f15 != 1.0f) {
            cxVar.actionBar.getTitlesContainer().setPivotY(org.telegram.messenger.g0.f24112m);
            cxVar.actionBar.getTitlesContainer().setPivotX(org.telegram.messenger.g0.L(20.0f));
            float f16 = (0.6f * f15) + 0.4f;
            cxVar.actionBar.getTitlesContainer().setScaleY(f16);
            cxVar.actionBar.getTitlesContainer().setScaleX(f16);
            cxVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
            cxVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-org.telegram.messenger.g0.L(30.0f));
            cxVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f16);
            cxVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f16);
            float f17 = (1.0f - cxVar.f46750w3) * f15;
            cxVar.actionBar.getTitlesContainer().setAlpha(f17);
            FrameLayout titlesContainer = cxVar.actionBar.getTitlesContainer();
            int i15 = (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1));
            if (i15 > 0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            titlesContainer.setVisibility(i10);
            cxVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f17);
            FrameLayout additionalSubTitleOverlayContainer = cxVar.actionBar.getAdditionalSubTitleOverlayContainer();
            if (i15 <= 0) {
                i12 = 4;
            }
            additionalSubTitleOverlayContainer.setVisibility(i12);
            return;
        }
        cxVar.actionBar.getTitlesContainer().setScaleY(1.0f);
        cxVar.actionBar.getTitlesContainer().setScaleX(1.0f);
        cxVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
        cxVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
        float f18 = 1.0f - cxVar.f46750w3;
        cxVar.actionBar.getTitlesContainer().setAlpha(f18);
        FrameLayout titlesContainer2 = cxVar.actionBar.getTitlesContainer();
        int i16 = (f18 > 0.0f ? 1 : (f18 == 0.0f ? 0 : -1));
        if (i16 > 0) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        titlesContainer2.setVisibility(i7);
        cxVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f18);
        FrameLayout additionalSubTitleOverlayContainer2 = cxVar.actionBar.getAdditionalSubTitleOverlayContainer();
        if (i16 <= 0) {
            i12 = 4;
        }
        additionalSubTitleOverlayContainer2.setVisibility(i12);
    }

    public static void Y2(cx cxVar, Canvas canvas, int i7) {
        org.telegram.ui.ActionBar.s4 s4Var;
        if (cxVar.parentLayout != null && cxVar.actionBar != null) {
            float max = Math.max(cxVar.f46656e.f57657e, cxVar.i4());
            float f10 = 1.0f;
            float f11 = 1.0f - cxVar.f46765z1;
            float f12 = max * f11 * f11;
            int i10 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
            if (i10 != 0) {
                if (-1 >= i7) {
                    f10 = 0.0f;
                    i7 = -1;
                }
                if (f10 > 0.0f && i10 > 0 && i7 > 0 && (s4Var = cxVar.parentLayout) != null) {
                    ((ActionBarLayout) s4Var).p(canvas, (int) (f10 * 255.0f * f12), i7);
                }
            }
        }
    }

    public static void Z(cx cxVar) {
        boolean z10 = true;
        try {
            ((org.telegram.ui.Components.mh0) ((org.telegram.ui.Components.b9) cxVar.O1.h.getImageReceiver().f22649n0).K).H(true);
        } catch (Exception unused) {
        }
        if (cxVar.f46667f4 == null) {
            org.telegram.ui.Components.u30 u30Var = new org.telegram.ui.Components.u30(0, true, true);
            cxVar.f46667f4 = u30Var;
            u30Var.I = true;
            u30Var.f40195a = cxVar;
            u30Var.f40196b = new ow(cxVar);
            cxVar.getMediaDataController().z();
            cxVar.getMessagesController().j3();
            cxVar.getMessagesController().n3(cxVar.getUserConfig().f(), true, cxVar.classGuid);
        }
        TLRPC.User c22 = org.telegram.messenger.mp.u1(cxVar.currentAccount).c2(Long.valueOf(org.telegram.messenger.j10.i(cxVar.currentAccount).e()));
        if (c22 == null) {
            c22 = org.telegram.messenger.j10.i(cxVar.currentAccount).f();
        }
        if (c22 != null) {
            org.telegram.ui.Components.si siVar = cxVar.f46667f4.f40197c;
            if (siVar != null) {
                siVar.Q0();
            }
            org.telegram.ui.Components.u30 u30Var2 = cxVar.f46667f4;
            TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z10 = false;
            }
            u30Var2.n(z10, new zu(cxVar, 11), new nu(cxVar, 3), 0);
        }
    }

    public static void a0(cx cxVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        org.telegram.messenger.mp.u1(cxVar.currentAccount).s4(0L, tL_pendingSuggestion.suggestion);
        cxVar.o5();
    }

    public static void b0(cx cxVar) {
        ArrayList arrayList = cxVar.K2;
        org.telegram.ui.ActionBar.s4 s4Var = cxVar.parentLayout;
        if (s4Var != null && ((ActionBarLayout) s4Var).y()) {
            cxVar.finishPreviewFragment();
        } else if (cxVar.T0 == 10) {
            if (cxVar.E2 != null && !arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    arrayList2.add(org.telegram.messenger.sr.a(((Long) arrayList.get(i7)).longValue(), 0L));
                }
                cxVar.E2.y(cxVar, arrayList2, null, false, cxVar.L2, cxVar.M2, cxVar.N2, null);
            }
        } else if (org.telegram.messenger.mp.u1(cxVar.currentAccount).A2()) {
            b.b(cxVar.currentAccount);
        } else {
            cxVar.presentFragment(new ContactsActivity(a8.p0.k("destroyAfterSelect", true)));
        }
    }

    public static void c0(cx cxVar) {
        String str;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(cxVar.currentAccount);
        if (cxVar.C3) {
            str = "PREMIUM_UPGRADE";
        } else {
            str = "PREMIUM_ANNUAL";
        }
        u12.s4(0L, str);
        cxVar.o5();
    }

    public static org.telegram.ui.Cells.u2 c4(bx bxVar) {
        yw ywVar = bxVar.f46298a;
        for (int i7 = 0; i7 < ywVar.getChildCount(); i7++) {
            View childAt = ywVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.u2) {
                org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) childAt;
                if (u2Var.W()) {
                    return u2Var;
                }
            }
        }
        return null;
    }

    public static void d0(cx cxVar, bx bxVar, View view, int i7) {
        int i10;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        if (view instanceof org.telegram.ui.Cells.y3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.u2;
        if (z10) {
            org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
            if (u2Var.f31961o2) {
                cxVar.h5(u2Var.getDialogId(), view);
                return;
            }
        }
        if (cxVar.U3()) {
            cxVar.F4(view, i7, 0.0f, bxVar.d);
            return;
        }
        int i11 = cxVar.T0;
        if (i11 == 15 && (view instanceof org.telegram.ui.Cells.n8)) {
            bxVar.d.L();
            return;
        }
        int i12 = 0;
        if ((i11 == 11 || i11 == 13) && i7 == 1) {
            Bundle k10 = a8.p0.k("forImport", true);
            k10.putLongArray("result", new long[]{cxVar.getUserConfig().e()});
            k10.putInt("chatType", 4);
            String string = cxVar.arguments.getString("importTitle");
            if (string != null) {
                k10.putString("title", string);
            }
            f50 f50Var = new f50(k10);
            f50Var.Z = new hv(cxVar);
            cxVar.presentFragment(f50Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.c3) && ((i10 = bxVar.f46305s) == 7 || i10 == 8)) {
            jg.k kVar = (jg.k) bxVar.d.N.get(0);
            if (kVar != null && kVar.f56589a == 17) {
                tL_chatlists_chatlistUpdates = kVar.f17550i;
            } else {
                tL_chatlists_chatlistUpdates = null;
            }
            if (tL_chatlists_chatlistUpdates != null) {
                org.telegram.messenger.ro roVar = cxVar.getMessagesController().N[bxVar.f46305s - 7];
                if (roVar != null) {
                    int i13 = roVar.f26672a;
                    ?? saVar = new org.telegram.ui.Components.sa(cxVar, false);
                    saVar.U1 = -1;
                    saVar.Y1 = "";
                    saVar.Z1 = new ArrayList();
                    saVar.f35250b2 = "";
                    saVar.d2 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    saVar.f35252e2 = arrayList;
                    saVar.f35269v2 = -1;
                    saVar.f35272y2 = -5;
                    saVar.U1 = i13;
                    saVar.W1 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    saVar.f35251c2 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList arrayList2 = cxVar.getMessagesController().Q0;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i12 >= arrayList2.size()) {
                                break;
                            } else if (((org.telegram.messenger.ro) arrayList2.get(i12)).f26672a == i13) {
                                saVar.Y1 = ((org.telegram.messenger.ro) arrayList2.get(i12)).f26673b;
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                    saVar.g1();
                    cxVar.showDialog(saVar);
                    return;
                }
                return;
            }
        } else if (z10 && !cxVar.actionBar.y() && !cxVar.H3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.u2) view).Z1;
            org.telegram.messenger.g0.P.set(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), imageReceiver.A());
        }
        cxVar.E4(view, i7, bxVar.d);
    }

    public static void e0(cx cxVar) {
        org.telegram.messenger.mp.u1(cxVar.currentAccount).s4(0L, "USERPIC_SETUP");
        cxVar.o5();
    }

    public static void h0(cx cxVar) {
        if (cxVar.f46667f4.g()) {
            org.telegram.messenger.mp.u1(cxVar.currentAccount).s4(0L, "USERPIC_SETUP");
            cxVar.o5();
        }
    }

    public static void i0(cx cxVar) {
        org.telegram.messenger.mp.u1(cxVar.currentAccount).h7.edit().putBoolean("storyhint", false).commit();
    }

    public static void i1(cx cxVar, boolean z10) {
        if (cxVar.f46663f0 != null && cxVar.O3 != z10) {
            cxVar.O3 = z10;
            int i7 = 0;
            while (true) {
                bx[] bxVarArr = cxVar.f46663f0;
                if (i7 < bxVarArr.length) {
                    if (z10) {
                        bxVarArr[i7].f46298a.setScrollbarFadingEnabled(false);
                    }
                    cxVar.f46663f0[i7].f46298a.setVerticalScrollBarEnabled(z10);
                    if (z10) {
                        cxVar.f46663f0[i7].f46298a.setScrollbarFadingEnabled(true);
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public static void j0(final int i7, final long j3, TLRPC.Chat chat, final cx cxVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        int i13;
        cxVar.p4(false);
        if (i7 == 103 && org.telegram.messenger.v3.T(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || org.telegram.messenger.v3.t0(chat2)) {
                cxVar.getMessagesController().X(2, j3, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i7 == 102 && (i13 = cxVar.Y2) != 0 && cxVar.d4(cxVar.currentAccount, cxVar.f46663f0[0].f46305s, i13, false).size() == 1) {
            cxVar.f46663f0[0].f46307x.setVisibility(4);
        }
        int i14 = -1;
        if (i7 == 102) {
            cxVar.U4(true, true);
            if (cxVar.T1 != null) {
                i12 = 0;
                while (i12 < cxVar.T1.size()) {
                    if (((TLRPC.Dialog) cxVar.T1.get(i12)).f28407id == j3) {
                        break;
                    }
                    i12++;
                }
            }
            i12 = -1;
            cxVar.z3();
            i10 = i12;
        } else {
            i10 = -1;
        }
        UndoView l42 = cxVar.l4();
        if (l42 != null) {
            if (i7 == 103) {
                i11 = 0;
            } else if (z11) {
                i11 = 1;
            } else {
                i11 = 95;
            }
            l42.j(i11, j3, new Runnable() {
                @Override
                public final void run() {
                    cxVar.J4(i7, j3, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(cxVar.d4(cxVar.currentAccount, cxVar.f46663f0[0].f46305s, cxVar.Y2, false));
        int i15 = 0;
        while (true) {
            if (i15 >= arrayList2.size()) {
                break;
            } else if (((TLRPC.Dialog) arrayList2.get(i15)).f28407id == j3) {
                i14 = i15;
                break;
            } else {
                i15++;
            }
        }
        if (i7 == 102) {
            if (i10 >= 0 && i14 < 0 && (arrayList = cxVar.T1) != null) {
                arrayList.remove(i10);
                cxVar.f46663f0[0].f46308y.D();
                cxVar.f46663f0[0].q(true);
                return;
            }
            cxVar.U4(false, true);
        }
    }

    public static void k0(cx cxVar, org.telegram.messenger.t1 t1Var) {
        ArrayList arrayList = t1Var.f26931c;
        if (arrayList.size() == 1) {
            bi.j3 j3Var = new bi.j3(cxVar.getParentActivity(), cxVar.currentAccount, ((TLRPC.User) arrayList.get(0)).f28552id, null, null);
            j3Var.g1(true);
            cxVar.showDialog(j3Var);
            return;
        }
        bi.a2.l1(false, t1Var);
    }

    public static void l0(cx cxVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.gc I = org.telegram.ui.Components.lc.b0(cxVar).I(2131624034, org.telegram.messenger.gd.M0(2131746663, null), org.telegram.messenger.gd.M0(2131746662, null));
            I.f35461j = 5000;
            I.j();
            return;
        }
        if (userFull != null) {
            if (tL_birthday == null) {
                userFull.flags2 &= -33;
            } else {
                userFull.flags2 |= 32;
            }
            userFull.birthday = tL_birthday;
            cxVar.getMessagesStorage().j2(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (cxVar.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, cxVar.getParentActivity(), cxVar.resourceProvider);
                String M0 = org.telegram.messenger.gd.M0(2131746659, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                u1Var.S = M0;
                u1Var.U = org.telegram.messenger.gd.M0(2131746660, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), null);
                cxVar.showDialog(u1Var);
                return;
            }
            return;
        }
        org.telegram.messenger.f3.n(null, 2131743642, org.telegram.ui.Components.lc.b0(cxVar), 2131624012, 36);
    }

    public static void m0(cx cxVar) {
        org.telegram.messenger.mp.u1(cxVar.currentAccount).s4(0L, "SETUP_PASSKEY");
        cxVar.o5();
    }

    public static void n0(cx cxVar, int i7) {
        Object obj;
        TLRPC.User user;
        org.telegram.ui.Components.fm0 fm0Var = cxVar.D0.f39197r0;
        if (i7 >= fm0Var.f36181a0 && i7 < fm0Var.f36182b0) {
            org.telegram.ui.Components.l41 G = fm0Var.G(i7);
            if (G != null) {
                obj = G.H;
            } else {
                obj = null;
            }
        } else {
            obj = Boolean.FALSE;
        }
        if (obj instanceof TLRPC.User) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, cxVar.getParentActivity(), cxVar.resourceProvider);
            String M0 = org.telegram.messenger.gd.M0(2131754178, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
            u1Var.S = M0;
            u1Var.U = org.telegram.messenger.gd.a0(null, null, 2131754177, "\"" + org.telegram.messenger.o10.q(user) + "\"");
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131746126, null), new at(3, cxVar, (TLRPC.User) obj));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        }
    }

    public static void o0(cx cxVar, float f10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cxVar.f46750w3 = floatValue;
        cxVar.f46663f0[0].setTranslationY((-f10) * floatValue);
        for (int i7 = 0; i7 < cxVar.actionBar.getChildCount(); i7++) {
            if (cxVar.actionBar.getChildAt(i7).getVisibility() == 0 && cxVar.actionBar.getChildAt(i7) != cxVar.actionBar.getActionMode() && cxVar.actionBar.getChildAt(i7) != cxVar.actionBar.getBackButton()) {
                cxVar.actionBar.getChildAt(i7).setAlpha(1.0f - cxVar.f46750w3);
            }
        }
        View view = cxVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        cxVar.Q3();
        cxVar.I3();
    }

    public static void p0(cx cxVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", org.telegram.messenger.j10.i(cxVar.currentAccount).e());
        cxVar.presentFragment(new bn(bundle));
    }

    public static void q0(cx cxVar) {
        b.c(cxVar.currentAccount, cxVar.getParentActivity(), cxVar.getResourceProvider());
    }

    public static void r4(bn bnVar, org.telegram.messenger.fj fjVar) {
        CharSequence charSequence;
        if (fjVar != null && fjVar.r2()) {
            try {
                if (!TextUtils.isEmpty(fjVar.f24023z)) {
                    charSequence = fjVar.f24023z;
                } else {
                    charSequence = fjVar.v;
                }
                CharSequence x12 = org.telegram.messenger.g0.x1(charSequence, fjVar.f23922a2, null);
                if (x12 instanceof SpannableStringBuilder) {
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) x12;
                    org.telegram.ui.Components.i00[] i00VarArr = (org.telegram.ui.Components.i00[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.i00.class);
                    if (i00VarArr.length > 0) {
                        int spanStart = spannableStringBuilder.getSpanStart(i00VarArr[0]);
                        int spanEnd = spannableStringBuilder.getSpanEnd(i00VarArr[0]);
                        for (int i7 = 1; i7 < i00VarArr.length; i7++) {
                            int spanStart2 = spannableStringBuilder.getSpanStart(i00VarArr[i7]);
                            int spanStart3 = spannableStringBuilder.getSpanStart(i00VarArr[i7]);
                            if (spanStart2 != spanEnd) {
                                if (spanStart2 > spanEnd) {
                                    for (int i10 = spanEnd; i10 <= spanStart2; i10++) {
                                        if (!Character.isWhitespace(spannableStringBuilder.charAt(i10))) {
                                            break;
                                        }
                                    }
                                }
                            }
                            spanEnd = spanStart3;
                        }
                        bnVar.Sb(fjVar.L1(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public static void s0(cx cxVar) {
        org.telegram.messenger.mp.u1(cxVar.currentAccount).s4(0L, "PREMIUM_RESTORE");
        cxVar.o5();
    }

    public static void t0(cx cxVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
            LaunchActivity.G0(launchActivity, cxVar.currentAccount, tL_attachMenuBot, null, true);
        } else {
            zc1.a(cxVar.getParentActivity(), new x(cxVar, tL_attachMenuBot, launchActivity, 7), null);
        }
    }

    public static void u0(cx cxVar) {
        org.telegram.messenger.v1 a10 = org.telegram.messenger.v1.a(cxVar.currentAccount);
        int i7 = a10.f27313a;
        Set<String> set = a10.d;
        org.telegram.messenger.t1 t1Var = a10.f27315c;
        if (t1Var != null && !set.contains(t1Var.f26929a)) {
            set.add(a10.f27315c.f26929a);
            SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(i7).h7.edit();
            edit.putStringSet("bday_hidden", set);
            edit.apply();
            org.telegram.messenger.ks.f(i7).k(org.telegram.messenger.ks.f25138j5, new Object[0]);
        }
        org.telegram.messenger.mp.u1(cxVar.currentAccount).s4(0L, "BIRTHDAY_CONTACTS_TODAY");
        cxVar.o5();
        org.telegram.ui.Components.gc G = org.telegram.ui.Components.lc.b0(cxVar).G(2131624034, 4, org.telegram.messenger.gd.M0(2131753328, null));
        G.f35461j = 5000;
        G.j();
    }

    public static void v0(cx cxVar) {
        org.telegram.messenger.mp.u1(cxVar.currentAccount).s4(0L, "PREMIUM_CHRISTMAS");
        cxVar.o5();
        org.telegram.ui.Components.gc G = org.telegram.ui.Components.lc.b0(cxVar).G(2131624034, 4, org.telegram.messenger.gd.M0(2131753328, null));
        G.f35461j = 5000;
        G.j();
    }

    public static void v1(cx cxVar, bx bxVar, float f10) {
        if (cxVar.U != f10) {
            cxVar.U = f10;
            int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            int i10 = 0;
            if (i7 == 0) {
                cxVar.V = false;
            }
            cxVar.F0.setOverscroll(f10);
            bxVar.f46298a.setViewsOffset(f10);
            yw ywVar = bxVar.f46298a;
            if (i7 != 0) {
                i10 = 2;
            }
            ywVar.setOverScrollMode(i10);
            cxVar.fragmentView.invalidate();
            if (f10 > org.telegram.messenger.g0.L(90.0f) && !cxVar.V) {
                tv tvVar = cxVar.F0;
                ValueAnimator valueAnimator = tvVar.I0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    tvVar.i(tvVar.f12430q0, true);
                    cxVar.V = true;
                    cxVar.getOrCreateStoryViewer().x(new gu(cxVar, 12));
                }
            }
        }
    }

    public static void w0(cx cxVar, int i7, org.telegram.ui.Components.y60 y60Var) {
        CharSequence charSequence;
        if (cxVar.currentAccount != i7) {
            y60Var.v();
            if (cxVar.getParentActivity() == null) {
                return;
            }
            ww wwVar = cxVar.E2;
            LaunchActivity launchActivity = (LaunchActivity) cxVar.getParentActivity();
            ArrayList arrayList = cxVar.F2;
            String str = cxVar.G2;
            CharSequence charSequence2 = cxVar.H2;
            nv nvVar = cxVar.D1;
            if (nvVar != null) {
                charSequence = nvVar.getFieldText();
            } else {
                charSequence = null;
            }
            launchActivity.O0(i7);
            cx cxVar2 = new cx(cxVar.arguments);
            cxVar2.E2 = wwVar;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList.isEmpty()) {
                    cxVar2.F2 = null;
                } else {
                    cxVar2.F2 = arrayList;
                    cxVar2.G2 = null;
                    cxVar2.O2 = false;
                    if (cxVar2.D1 != null) {
                        cxVar2.v3(charSequence);
                    } else {
                        cxVar2.Z3 = charSequence;
                    }
                }
            } else if (str != null) {
                cxVar2.Y4(charSequence, str);
            } else if (charSequence2 != null) {
                if (charSequence2.length() == 0) {
                    cxVar2.H2 = null;
                } else {
                    cxVar2.H2 = charSequence2;
                    cxVar2.G2 = null;
                    cxVar2.F2 = null;
                    if (cxVar2.D1 != null) {
                        cxVar2.v3(charSequence);
                    } else {
                        cxVar2.Z3 = charSequence;
                    }
                }
            }
            launchActivity.u0(cxVar2, false, true);
        }
    }

    public static boolean w1(cx cxVar, bx bxVar) {
        if (!cxVar.H3.c()) {
            int i7 = (int) (-cxVar.O);
            int f42 = cxVar.f4();
            int g42 = cxVar.g4();
            if (i7 != 0 && i7 != f42 && i7 != g42 && bxVar.f46298a.canScrollVertically(-1)) {
                if (g42 < i7 && i7 < f42) {
                    int L = org.telegram.messenger.g0.L(48.0f);
                    int i10 = i7 - g42;
                    if (i10 < L / 2) {
                        bxVar.f46299b.y(-i10);
                        return true;
                    }
                    bxVar.f46299b.y(L - i10);
                    return true;
                }
                float f10 = 1.0f;
                if (cxVar.f46750w3 != 1.0f) {
                    f10 = Utilities.i((-cxVar.O) / org.telegram.messenger.g0.L(81.0f), 1.0f, 0.0f);
                }
                if (f10 < cxVar.F0.C0) {
                    bxVar.f46299b.y(-i7);
                    return true;
                }
                bxVar.f46299b.y(g42 - i7);
                return true;
            }
            return false;
        }
        return false;
    }

    public static void x0(cx cxVar) {
        org.telegram.messenger.mp.u1(cxVar.currentAccount).s4(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        cxVar.o5();
    }

    public static String x2(cx cxVar) {
        String s5;
        ArrayList arrayList = cxVar.K2;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() < 3) {
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                long longValue = ((Long) obj).longValue();
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                if (longValue == cxVar.getUserConfig().e()) {
                    sb2.append(org.telegram.messenger.gd.M0(2131745706, null));
                } else {
                    if (arrayList.size() == 1) {
                        s5 = org.telegram.messenger.n5.l(cxVar.currentAccount, longValue);
                    } else {
                        s5 = org.telegram.messenger.n5.s(cxVar.currentAccount, longValue);
                    }
                    sb2.append(s5);
                }
            }
            return org.telegram.messenger.gd.a0(null, null, 2131745244, sb2.toString());
        }
        return org.telegram.messenger.gd.G(arrayList.size(), "ShareSendToMany", new Object[0]);
    }

    public static void y0(cx cxVar) {
        PasskeysActivity.f0(cxVar.currentAccount, cxVar.getParentActivity(), cxVar.resourceProvider, true);
    }

    public static void z0(cx cxVar) {
        if (cxVar.f46663f0 == null) {
            return;
        }
        if (!cxVar.U1 && !cxVar.isPaused) {
            cxVar.Q3 = false;
            cxVar.getMessagesController().f5(null);
            cxVar.N4(false);
            return;
        }
        cxVar.Q3 = true;
    }

    public static void z4(org.telegram.messenger.c cVar) {
        int i7 = cVar.f23218a;
        boolean[] zArr = D4;
        if (!zArr[i7]) {
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
            u12.d3();
            u12.a3(0, 0, 100, true, null);
            if (u12.f25754s.isEmpty() && !TextUtils.isEmpty(u12.U3)) {
                TLRPC.TL_help_getRecentMeUrls tL_help_getRecentMeUrls = new TLRPC.TL_help_getRecentMeUrls();
                tL_help_getRecentMeUrls.referer = u12.U3;
                u12.getConnectionsManager().sendRequest(tL_help_getRecentMeUrls, new org.telegram.messenger.mj(u12, 4));
            }
            u12.n3(org.telegram.messenger.j10.i(i7).f(), false, 0);
            org.telegram.messenger.i5.r(i7).f();
            org.telegram.messenger.ri.d0(i7).w(false);
            org.telegram.messenger.g0.h3(new bh(cVar, 18), 200L);
            Iterator it = u12.f25646f4.iterator();
            while (it.hasNext()) {
                org.telegram.messenger.ri.d0(i7).f1((String) it.next(), true, true);
            }
            zArr[i7] = true;
        }
    }

    public final boolean A3(long j3) {
        int i7;
        int i10 = this.T0;
        if (i10 != 15 && i10 != 16 && this.f46685j2 == null && this.f46738u2) {
            if (org.telegram.messenger.n5.z(j3)) {
                long j10 = -j3;
                TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(j10));
                if (org.telegram.messenger.v3.T(O0) && !O0.megagroup) {
                    if (!this.f46728s2) {
                        TLRPC.Chat O02 = org.telegram.messenger.mp.u1(this.currentAccount).O0(Long.valueOf(j10));
                        if ((org.telegram.messenger.v3.n(O02) || O02.megagroup) && (i7 = this.V0) != 2 && i7 != 3) {
                            return true;
                        }
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = org.telegram.messenger.gd.M0(2131745401, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                    u1Var.S = M0;
                    int i11 = this.V0;
                    if (i11 == 3) {
                        u1Var.U = org.telegram.messenger.gd.M0(2131743856, null);
                    } else if (i11 == 2) {
                        u1Var.U = org.telegram.messenger.gd.M0(2131746392, null);
                    } else {
                        u1Var.U = org.telegram.messenger.gd.M0(2131752429, null);
                    }
                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131747638, null), null);
                    showDialog(u1Var);
                    return false;
                }
                return true;
            } else if (org.telegram.messenger.n5.C(j3)) {
                if (this.V0 != 0 || this.W0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String M02 = org.telegram.messenger.gd.M0(2131745401, null);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f28744a;
                    u1Var2.S = M02;
                    int i12 = this.V0;
                    if (i12 == 3) {
                        u1Var2.U = org.telegram.messenger.gd.M0(2131743855, null);
                    } else if (i12 != 0) {
                        u1Var2.U = org.telegram.messenger.gd.M0(2131746983, null);
                    } else {
                        u1Var2.U = org.telegram.messenger.gd.M0(2131748912, null);
                    }
                    alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131747638, null), null);
                    showDialog(u1Var2);
                    return false;
                }
                return true;
            } else {
                return true;
            }
        }
        return true;
    }

    public final void A4(long j3) {
        boolean z10;
        long j10 = j3;
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(j10);
        int i7 = 0;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            ArrayList arrayList = (ArrayList) getMessagesController().f25799x.f(dialog.community_id);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                A4(((TLRPC.Dialog) obj).f28407id);
            }
            return;
        }
        if ((!this.actionBar.y() || this.actionBar.z(null)) && H4(this.f46663f0[0], dialog)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = -1;
        if (z10) {
            U4(true, true);
            z3();
            if (this.T1 != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= this.T1.size()) {
                        break;
                    } else if (((TLRPC.Dialog) this.T1.get(i11)).f28407id == j10) {
                        i10 = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i10 < 0) {
                    U4(false, false);
                }
            }
        }
        int i12 = i10;
        if (getMessagesController().y2(j10) || getMessagesController().F2(j10)) {
            org.telegram.messenger.mp messagesController = getMessagesController();
            org.telegram.messenger.tr messagesStorage = messagesController.getMessagesStorage();
            org.telegram.messenger.kl klVar = new org.telegram.messenger.kl(messagesController, j10);
            org.telegram.messenger.q5 q5Var = messagesStorage.f27052a;
            org.telegram.messenger.d4 d4Var = new org.telegram.messenger.d4(messagesStorage, j10, klVar, 5);
            j10 = j10;
            q5Var.c(d4Var);
        }
        getMessagesController().v3(j10, 0L);
        org.telegram.messenger.mp messagesController2 = getMessagesController();
        int i13 = dialog.top_message;
        messagesController2.q3(j10, i13, i13, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i12 >= 0) {
            this.T1.remove(i12);
            this.f46663f0[0].f46308y.D();
            this.f46663f0[0].q(true);
        }
    }

    public final void A5() {
        hi.m3 m3Var;
        boolean i52 = getMessagesController().i5();
        if (this.P3 != i52) {
            s5();
            if (!this.P3 && i52 && (m3Var = this.f46714q0) != null) {
                m3Var.x();
            }
            this.P3 = i52;
        }
        org.telegram.ui.Components.a10 a10Var = this.f46736u0;
        if (a10Var == null) {
            return;
        }
        if (this.T0 == 10) {
            a10Var.setImageResource(2131231195);
            this.f46736u0.setContentDescription(org.telegram.messenger.gd.M0(2131751343, null));
            return;
        }
        a10Var.setImageResource(2131231107);
        this.f46736u0.setContentDescription(org.telegram.messenger.gd.M0(2131748078, null));
    }

    @Override
    public final ui.f B() {
        return this.f46718q4;
    }

    public final void B3(boolean z10) {
        mi.j jVar;
        TLRPC.ChatFull chatFull;
        boolean z11;
        org.telegram.ui.Components.cs csVar = this.L1;
        if (csVar != null && (jVar = this.S1) != null && (chatFull = this.f46650c3) != null) {
            if (this.f46638a3 != 0 && chatFull.requests_pending > 0 && !this.f46640b.f57658f) {
                z11 = true;
            } else {
                z11 = false;
            }
            csVar.j(jVar, z11, z10);
            this.S1.setTitle(org.telegram.messenger.gd.G(this.f46650c3.requests_pending, "CommunityPendingRequestsRow", new Object[0]));
        }
    }

    public final boolean B4(org.telegram.tgnet.TLRPC.Chat r6, org.telegram.tgnet.TLRPC.User r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cx.B4(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):boolean");
    }

    public final void B5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        boolean z12;
        fi.p6 k42;
        ArrayList arrayList;
        boolean z13;
        boolean z14;
        int i7;
        float f10;
        float f11;
        if (this.F0 != null && this.J == null) {
            xv xvVar = this.H3;
            if ((xvVar == null || !xvVar.c()) && !this.f46729s3 && (kVar = this.actionBar) != null && !kVar.y() && !this.f46702n2) {
                hi.ta taVar = hi.ta.G2;
                int i10 = 0;
                if ((taVar != null && taVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
                    z10 = false;
                }
                if (!t4() && k4().I()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.f46638a3 != 0) {
                    z12 = false;
                } else if (t4()) {
                    z12 = !k4().h.isEmpty();
                } else {
                    if (!z11 && (((arrayList = (k42 = k4()).f12387g) != null && arrayList.size() > 0) || k42.J())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z11 = k4().I();
                }
                this.M = z11;
                boolean z15 = this.H0;
                if (!z11 && !z12) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.H0 = z13;
                if (z12 || z13) {
                    tv tvVar = this.F0;
                    if (z13 != z15) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    tvVar.p(z10, z14);
                }
                boolean z16 = this.H0;
                int i11 = 8;
                float f12 = 0.0f;
                if (z16 != z15) {
                    if (z10) {
                        ValueAnimator valueAnimator = this.K;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        if (this.H0 && !isInPreviewMode()) {
                            this.F0.setVisibility(0);
                        }
                        float f13 = this.I0;
                        if (this.H0) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f11);
                        this.K = ofFloat;
                        ofFloat.addUpdateListener(new ji(1, this));
                        this.K.addListener(new org.telegram.ui.Cells.y9(this, 26));
                        this.K.setDuration(200L);
                        this.K.setInterpolator(org.telegram.ui.Components.lr.f37208f);
                        this.K.start();
                    } else {
                        tv tvVar2 = this.F0;
                        if (z16 && !isInPreviewMode()) {
                            i7 = 0;
                        } else {
                            i7 = 8;
                        }
                        tvVar2.setVisibility(i7);
                        if (this.H0) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        this.I0 = f10;
                        View view = this.fragmentView;
                        if (view != null) {
                            view.invalidate();
                        }
                    }
                }
                if (z12 != this.N) {
                    this.N = z12;
                    if (z12) {
                        this.F0.l(false, 1.0f);
                    }
                    if (z10 && !isInPreviewMode()) {
                        this.F0.setVisibility(0);
                        float f14 = -this.O;
                        if (!z12) {
                            f12 = f4();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.J = ofFloat2;
                        ofFloat2.addUpdateListener(new jw(this, f14, z12, f12));
                        this.J.addListener(new dw(this, z12, 2));
                        this.J.setDuration(200L);
                        this.J.setInterpolator(org.telegram.ui.Components.lr.f37208f);
                        this.J.start();
                        return;
                    }
                    this.L = z12;
                    tv tvVar3 = this.F0;
                    if ((z12 || this.M) && !isInPreviewMode()) {
                        i11 = 0;
                    }
                    tvVar3.setVisibility(i11);
                    if (!z12) {
                        W4(0.0f);
                    } else {
                        this.A3 = -org.telegram.messenger.g0.L(81.0f);
                        W4(-f4());
                    }
                    while (true) {
                        bx[] bxVarArr = this.f46663f0;
                        if (i10 >= bxVarArr.length) {
                            break;
                        }
                        bx bxVar = bxVarArr[i10];
                        if (bxVar != null) {
                            bxVar.f46298a.requestLayout();
                        }
                        i10++;
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

    public final void C3(org.telegram.ui.bx r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cx.C3(org.telegram.ui.bx):void");
    }

    public final boolean C4(TLRPC.User user) {
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.H;
        if (user != null && !org.telegram.messenger.o10.A(user) && !org.telegram.messenger.o10.y(user)) {
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

    public final void C5(int i7, boolean z10) {
        boolean z11;
        if (this.A0 != null && this.T0 == 0 && !this.f46702n2) {
            this.S3 = i7;
            org.telegram.messenger.ro m42 = m4();
            this.S3 = -1;
            boolean z12 = false;
            if (m42 != null && getMessagesController().V0().size() > 1 && getMessagesController().x2(m42)) {
                z11 = true;
            } else {
                z11 = false;
            }
            rw rwVar = this.A0;
            if (z10 && rwVar.getVisibility() == 0) {
                z12 = true;
            }
            rwVar.k(z11, z12);
        }
    }

    @Override
    public final void D(float f10, int i7) {
        org.telegram.ui.ActionBar.r0 r0Var;
        if (i7 == 3 && (r0Var = this.m0) != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) r0Var.getIconView().getDrawable();
            if (this.d.f57658f) {
                animatedVectorDrawable.start();
                if (org.telegram.messenger.bz.o() != 0) {
                    TLRPC.TL_help_premiumPromo tL_help_premiumPromo = org.telegram.messenger.ri.d0(this.currentAccount).E;
                    String q02 = PremiumPreviewFragment.q0(2);
                    if (tL_help_premiumPromo != null) {
                        int i10 = 0;
                        while (true) {
                            if (i10 < tL_help_premiumPromo.video_sections.size()) {
                                if (tL_help_premiumPromo.video_sections.get(i10).equals(q02)) {
                                    break;
                                }
                                i10++;
                            } else {
                                i10 = -1;
                                break;
                            }
                        }
                        if (i10 != -1) {
                            org.telegram.messenger.w7.G(this.currentAccount).W(tL_help_premiumPromo.videos.get(i10), tL_help_premiumPromo, 3, 0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            animatedVectorDrawable.reset();
        }
    }

    public final void D3() {
        getMessagesStorage().getClass();
    }

    public final void D4(View view) {
        boolean z10;
        int i7;
        int i10;
        String str;
        int i11;
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        org.telegram.ui.ActionBar.x2 j3 = org.telegram.messenger.n10.j(getParentActivity(), false, 1, null);
        if (getMessagesStorage().M != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i7 = 2131232217;
        } else {
            i7 = 0;
        }
        if (org.telegram.messenger.bz.f23190q1) {
            i10 = 2131230998;
        } else {
            i10 = 2131231002;
        }
        int[] iArr = {i7, i10};
        if (z10) {
            str = org.telegram.messenger.gd.M0(2131748490, null);
        } else {
            str = null;
        }
        if (org.telegram.messenger.bz.f23190q1) {
            i11 = 2131747053;
        } else {
            i11 = 2131749132;
        }
        CharSequence[] charSequenceArr = {str, org.telegram.messenger.gd.M0(i11, null)};
        k4 k4Var = new k4(this, 1);
        j3.M = charSequenceArr;
        j3.N = iArr;
        j3.L = k4Var;
        showDialog(j3);
    }

    public final void D5(int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cx.D5(int, boolean):void");
    }

    public final void E3() {
        if (this.f46663f0 != null) {
            int w32 = w3();
            int i7 = 0;
            while (true) {
                bx[] bxVarArr = this.f46663f0;
                if (i7 < bxVarArr.length) {
                    bx bxVar = bxVarArr[i7];
                    if (bxVar != null) {
                        yw ywVar = bxVar.f46298a;
                        ywVar.setPadding(0, ywVar.f33615g3, 0, w32);
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void E4(android.view.View r27, int r28, v4.i0 r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cx.E4(android.view.View, int, v4.i0):void");
    }

    public final boolean E5(long j3) {
        TLRPC.Chat O0;
        nv nvVar;
        if ((this.U0 <= 1 && ((nvVar = this.D1) == null || nvVar.getVisibility() != 0 || TextUtils.isEmpty(this.D1.getFieldText()))) || !org.telegram.messenger.n5.z(j3) || (O0 = getMessagesController().O0(Long.valueOf(-j3))) == null || org.telegram.messenger.v3.N(O0) || !O0.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.b5.r0(this, org.telegram.messenger.gd.M0(2131745115, null), org.telegram.messenger.gd.M0(2131745107, null), null);
        return false;
    }

    @Override
    public final List F() {
        return Arrays.asList(new pg.a(org.telegram.messenger.gd.M0(2131751637, null)), new pg.a(org.telegram.messenger.gd.M0(2131752065, null), new gu(this, 23)), new pg.a(org.telegram.messenger.gd.M0(2131751638, null), new gu(this, 24)));
    }

    public final void F3() {
        jh.f fVar = this.A1;
        if (fVar != null) {
            fVar.setBlurredBottomHeight(this.A1.getInputBubbleHeight() + this.f46746w.d() + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(7.0f));
        }
    }

    public final boolean F4(View view, int i7, float f10, org.telegram.ui.Components.bk0 bk0Var) {
        org.telegram.ui.Components.km0 km0Var;
        long j3;
        org.telegram.ui.Components.km0 km0Var2;
        TLRPC.EncryptedChat encryptedChat;
        long F;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.c3) && bk0Var.d(i7) != 21) {
            if (!this.actionBar.y() && !org.telegram.messenger.g0.Q1() && !this.f46702n2 && (view instanceof org.telegram.ui.Cells.u2)) {
                org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
                if (!getMessagesController().y2(u2Var.getDialogId()) && !this.H3.c() && u2Var.Z(f10)) {
                    return b5(u2Var);
                }
            }
            xv xvVar = this.H3;
            if (xvVar == null || !xvVar.c()) {
                kw kwVar = this.D0;
                boolean z10 = true;
                if (kwVar != null && bk0Var == (km0Var2 = kwVar.f39185e0)) {
                    Object I = km0Var2.I(i7);
                    if (!this.D0.f39185e0.O) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String M0 = org.telegram.messenger.gd.M0(2131752043, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                        u1Var.S = M0;
                        if (I instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) I;
                            if (chat.monoforum) {
                                u1Var.U = org.telegram.messenger.gd.a0("ClearSearchSingleChatAlertText", null, 2131752042, qg.c.j(this.currentAccount, chat, false));
                            } else {
                                u1Var.U = org.telegram.messenger.gd.a0("ClearSearchSingleChatAlertText", null, 2131752042, chat.title);
                            }
                            F = -chat.f28403id;
                        } else if (I instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) I;
                            if (user.f28552id == getUserConfig().f24789n) {
                                u1Var.U = org.telegram.messenger.gd.a0("ClearSearchSingleChatAlertText", null, 2131752042, org.telegram.messenger.gd.M0(2131745706, null));
                            } else {
                                u1Var.U = org.telegram.messenger.gd.a0("ClearSearchSingleUserAlertText", null, 2131752040, org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                            }
                            F = user.f28552id;
                        } else if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(((TLRPC.EncryptedChat) I).user_id));
                            u1Var.U = org.telegram.messenger.gd.a0("ClearSearchSingleUserAlertText", null, 2131752040, org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name));
                            F = org.telegram.messenger.n5.F(encryptedChat.f28411id);
                        }
                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752044, null), new ai.d0(this, F, 8));
                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                        showDialog(u1Var);
                        TextView textView = (TextView) u1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29635q7, getResourceProvider());
                        }
                        return true;
                    }
                }
                kw kwVar2 = this.D0;
                if (kwVar2 != null && bk0Var == (km0Var = kwVar2.f39185e0)) {
                    if (this.f46702n2) {
                        E4(view, i7, bk0Var);
                        return false;
                    }
                    if ((view instanceof org.telegram.ui.Cells.h6) && !km0Var.N(i7)) {
                        j3 = ((org.telegram.ui.Cells.h6) view).getDialogId();
                    } else {
                        j3 = 0;
                    }
                    if (j3 != 0) {
                        g5(j3, view);
                        return true;
                    }
                } else {
                    Object J = ((jg.m) bk0Var).J(i7);
                    if (J instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                        if (this.f46702n2) {
                            if ((this.T0 == 3 || U3()) && E5(dialog.f28407id)) {
                                if (this.T0 == 1 && U3() && this.f46707o2 && getMessagesController().y2(dialog.f28407id)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -dialog.f28407id);
                                    bundle.putBoolean("for_select", true);
                                    bundle.putBoolean("forward_to", true);
                                    if (this.T0 != 1) {
                                        z10 = false;
                                    }
                                    bundle.putBoolean("bot_share_to", z10);
                                    bundle.putBoolean("quote", this.P0);
                                    bundle.putBoolean("reply_to", this.O0);
                                    y91 y91Var = new y91(bundle);
                                    y91Var.M0 = this;
                                    presentFragment(y91Var);
                                    return false;
                                }
                                s3(dialog.f28407id, view);
                                w5();
                                return true;
                            }
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                            D4(view);
                            return false;
                        } else if (!this.actionBar.y() || !v4(dialog)) {
                            g5(dialog.f28407id, view);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void G3() {
        int i7;
        bx bxVar;
        boolean z10 = true;
        float e42 = e4(true);
        rw rwVar = this.A0;
        if (rwVar != null) {
            if (rwVar.getAlpha() == e42) {
                z10 = false;
            }
            float T1 = org.telegram.messenger.g0.T1(0.98f, 1.0f, e42);
            this.A0.setAlpha(e42);
            this.A0.setScaleX(T1);
            this.A0.setScaleY(T1);
            rw rwVar2 = this.A0;
            if (e42 > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            rwVar2.setVisibility(i7);
            if (z10 && (bxVar = this.f46663f0[0]) != null) {
                bxVar.f46298a.requestLayout();
            }
        }
        m5();
    }

    public final void G4(View view) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i7 = 0; i7 < 4; i7++) {
            if (org.telegram.messenger.j10.i(i7).p()) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        Collections.sort(arrayList, new pe(23));
        org.telegram.ui.Components.y60 I = org.telegram.ui.Components.y60.I(this, view);
        if (arrayList.size() > 0) {
            if (I.y() > 0) {
                I.k();
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                int intValue = ((Integer) obj).intValue();
                if (this.currentAccount == intValue) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                int i11 = org.telegram.ui.ActionBar.n6.f29486i6;
                Drawable a02 = org.telegram.ui.ActionBar.n6.a0(getThemedColor(i11), 0, 0);
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
                org.telegram.ui.ActionBar.i6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(a02);
                org.telegram.ui.ActionBar.u6.j(linearLayout, a02, null, M, resourceProvider);
                TLRPC.User f10 = org.telegram.messenger.j10.i(intValue).f();
                org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
                b9Var.r(f10);
                hi.q3 q3Var = new hi.q3(this, getParentActivity(), z10);
                linearLayout.addView(q3Var, c8.ma.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(getParentActivity());
                if (z10) {
                    q9Var.setScaleX(0.833f);
                    q9Var.setScaleY(0.833f);
                }
                q9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
                q9Var.getImageReceiver().d = intValue;
                q9Var.f(f10, b9Var);
                q3Var.addView(q9Var, c8.ma.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29502j5, getResourceProvider());
                textView.setText(org.telegram.messenger.o10.q(f10));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, c8.ma.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new bi.e5(this, intValue, I, 17));
                I.r(linearLayout, c8.ma.o(230, 48));
            }
        }
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(24.0f), getThemedColor(org.telegram.ui.ActionBar.n6.f29394d6));
        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
        I.f42383z.set(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
        I.X(d02);
        I.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
        I.W(5);
        I.a0();
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        int i10;
        int i11;
        int i12 = 8;
        if (i7 == 1) {
            O3();
            Q3();
            T3();
            G3();
            R3();
            qw qwVar = this.Y;
            te.a aVar = this.f46640b;
            qwVar.setBlurredBackgroundVisibility(aVar.f57657e);
            float a10 = a8.m7.a(aVar.f57657e);
            org.telegram.ui.Components.q9 q9Var = this.f46654d3;
            if (q9Var != null) {
                q9Var.setScaleX(a10);
                this.f46654d3.setScaleY(a10);
                this.f46654d3.setAlpha(a10);
                org.telegram.ui.Components.q9 q9Var2 = this.f46654d3;
                if (a10 > 0.0f) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                q9Var2.setVisibility(i11);
            }
            if (this.f46747w0 != null) {
                float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, a10);
                this.f46747w0.setScaleX(T1);
                this.f46747w0.setScaleY(T1);
                this.f46747w0.setAlpha(a10);
                hi.d dVar = this.f46747w0;
                int i13 = (a10 > 0.0f ? 1 : (a10 == 0.0f ? 0 : -1));
                if (i13 > 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                dVar.setVisibility(i10);
                this.f46753x0.setAlpha(a10);
                lh.f fVar = this.f46753x0;
                if (i13 > 0) {
                    i12 = 0;
                }
                fVar.setVisibility(i12);
            }
        } else if (i7 == 2) {
            O3();
            Q3();
        } else if (i7 == 3) {
            M3();
        } else if (i7 == 4) {
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        } else if (i7 == 5) {
            L3();
        } else if (i7 == 6) {
            O3();
            Q3();
        } else if (i7 == 7) {
            H3();
        } else if (i7 == 8) {
            G3();
            R3();
        } else if (i7 == 9) {
            R3();
        }
    }

    public final void H3() {
        int i7;
        int i10;
        float f10 = this.f46700n.f57657e;
        float T1 = org.telegram.messenger.g0.T1(0.2f, 1.0f, f10);
        oi.u1 u1Var = this.E1;
        int i11 = 8;
        if (u1Var != null) {
            u1Var.setScaleX(T1);
            this.E1.setScaleY(T1);
            this.E1.setAlpha(f10);
            oi.u1 u1Var2 = this.E1;
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            u1Var2.setVisibility(i10);
        }
        jh.f fVar = this.A1;
        if (fVar != null) {
            fVar.setAlpha(f10);
            jh.f fVar2 = this.A1;
            int i12 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i12 > 0) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            fVar2.setVisibility(i7);
            this.A1.getFadeView().setAlpha(f10);
            View fadeView = this.A1.getFadeView();
            if (i12 > 0) {
                i11 = 0;
            }
            fadeView.setVisibility(i11);
        }
    }

    public final boolean H4(bx bxVar, TLRPC.Dialog dialog) {
        TLRPC.EncryptedChat c12;
        if (bxVar != null && dialog != null) {
            if (!getMessagesController().G7.containsKey(Long.valueOf(dialog.f28407id))) {
                if (y4(bxVar)) {
                    return true;
                }
                org.telegram.messenger.ro h42 = h4(bxVar);
                if (h42 != null) {
                    int i7 = h42.f26677g;
                    int i10 = org.telegram.messenger.mp.I8;
                    if ((i7 & 64) != 0) {
                        int i11 = this.currentAccount;
                        long j3 = dialog.f28407id;
                        if (org.telegram.messenger.n5.C(j3) && (c12 = org.telegram.messenger.mp.u1(i11).c1(Integer.valueOf((int) (4294967295L & j3)))) != null) {
                            j3 = c12.user_id;
                        }
                        if (!h42.h.contains(Long.valueOf(j3))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void I3() {
        if (this.actionBar == null) {
            return;
        }
        org.telegram.ui.Components.a10.d(this.actionBar.getBackButton(), Math.max(this.f46750w3, (1.0f - this.f46640b.f57657e) * (1.0f - i4()) * (1.0f - this.f46646c.f57657e)));
    }

    public final boolean I4(bx bxVar) {
        if (bxVar == null) {
            return false;
        }
        if (y4(bxVar)) {
            return true;
        }
        org.telegram.messenger.ro h42 = h4(bxVar);
        if (h42 != null) {
            int i7 = h42.f26677g;
            int i10 = org.telegram.messenger.mp.I8;
            if ((i7 & 64) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void J3() {
        float f10;
        if (this.f46683j0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.a10.d(this.f46673h0, com.google.android.gms.internal.vision.e2.D(f10, 1.0f - this.f46640b.f57657e, 1.0f - i4(), 1.0f - this.f46646c.f57657e));
    }

    public final void J4(int i7, long j3, TLRPC.Chat chat, boolean z10, boolean z11) {
        if (i7 == 103) {
            getMessagesController().X(1, j3, z11);
            return;
        }
        if (chat != null) {
            if (org.telegram.messenger.v3.r0(chat)) {
                getMessagesController().X(0, j3, z11);
            } else {
                getMessagesController().g0(-j3, getMessagesController().c2(Long.valueOf(getUserConfig().e())), null, z11, false);
            }
        } else {
            getMessagesController().X(0, j3, z11);
            if (z10 && z11) {
                getMessagesController().w(j3);
            }
        }
        if (org.telegram.messenger.g0.Q1()) {
            getNotificationCenter().k(org.telegram.messenger.ks.f25190t, Long.valueOf(j3));
        }
        getMessagesController().J(this.Y2);
    }

    public final void K3() {
        float f10;
        if (org.telegram.messenger.bz.f23194s.isEmpty()) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        org.telegram.ui.Components.a10.d(this.f46668g0, com.google.android.gms.internal.vision.e2.D(f10, 1.0f - this.f46640b.f57657e, 1.0f - i4(), 1.0f - this.f46646c.f57657e));
    }

    public final void K4(java.util.ArrayList r41, int r42, boolean r43, boolean r44, java.util.HashSet r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cx.K4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    public final void L3() {
        float f10;
        if (this.T0 != 2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.a10.d(this.f46687k0, com.google.android.gms.internal.vision.e2.D(f10, this.f46662f.f57657e, 1.0f - i4(), 1.0f - this.f46646c.f57657e));
        tv tvVar = this.F0;
        if (tvVar != null) {
            tvVar.invalidate();
        }
    }

    public final void L4(long r14, boolean r16, org.telegram.messenger.ro r17, int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cx.L4(long, boolean, org.telegram.messenger.ro, int, boolean):void");
    }

    public final void M3() {
        org.telegram.ui.Components.a10.d(this.m0, com.google.android.gms.internal.vision.e2.D(this.f46640b.f57657e, 1.0f - i4(), 1.0f - this.f46646c.f57657e, this.d.f57657e));
    }

    public final void M4() {
        if (this.L0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29394d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / 180));
        this.L0.setBackground(new BitmapDrawable(createBitmap));
        this.L0.setAlpha(0.0f);
        this.L0.setVisibility(0);
        N3();
    }

    public final void N3() {
        boolean z10;
        uv uvVar;
        if (!this.f46693l2 && ((uvVar = this.L0) == null || uvVar.getBackground() == null || this.L0.getAlpha() < 0.01f || this.L0.getVisibility() == 8)) {
            z10 = true;
        } else {
            z10 = false;
        }
        f fVar = this.K3;
        if (fVar != null) {
            ((me0) fVar.f47360b).f49819w.a(z10, true);
        }
    }

    public final void N4(boolean z10) {
        bx[] bxVarArr = this.f46663f0;
        if (bxVarArr != null && !this.U1) {
            for (bx bxVar : bxVarArr) {
                if (bxVar.getVisibility() == 0) {
                    if (z10) {
                        ev evVar = bxVar.f46308y;
                        evVar.D();
                        evVar.A = true;
                    }
                    bxVar.q(z10);
                    C3(bxVar);
                }
            }
        }
        rw rwVar = this.A0;
        if (rwVar != null && rwVar.getVisibility() == 0) {
            this.A0.d();
        }
    }

    public final void O3() {
        I3();
        org.telegram.ui.Components.a10.d(this.f46692l0, (1.0f - this.f46640b.f57657e) * (1.0f - i4()) * (1.0f - this.f46646c.f57657e));
        J3();
        M3();
        K3();
        L3();
    }

    public final void O4(bx bxVar) {
        int i7;
        org.telegram.ui.Components.wz wzVar;
        if (bxVar.getVisibility() != 0) {
            return;
        }
        int i10 = bxVar.d.f17581w;
        if (bxVar.f46305s == 0 && n4() && bxVar.f46298a.getChildCount() == 0 && bxVar.f46306w == 2) {
            ((v4.c0) bxVar.f46298a.getLayoutManager()).h1(1, (int) this.O);
        }
        bxVar.d.getClass();
        bxVar.d.V();
        int b10 = bxVar.d.b();
        if (b10 == 1 && i10 == 1 && bxVar.d.d(0) == 5) {
            bxVar.q(true);
        } else {
            bxVar.q(false);
            if (b10 > i10 && (i7 = this.T0) != 11 && i7 != 12 && i7 != 13) {
                bxVar.E.b(i10);
            }
        }
        try {
            yw ywVar = bxVar.f46298a;
            if (this.Y2 == 0 && this.f46638a3 == 0) {
                wzVar = bxVar.f46307x;
            } else {
                wzVar = null;
            }
            ywVar.setEmptyView(wzVar);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        C3(bxVar);
    }

    public final void P3() {
        int i7;
        if (i4() > 0.5f) {
            i7 = 2131745511;
        } else {
            i7 = 2131745618;
        }
        String M0 = org.telegram.messenger.gd.M0(i7, null);
        this.Y.f33845r.setContentDescription(M0);
        this.Y.f33845r.setHint(M0);
    }

    public final void P4() {
        boolean z10;
        float f10 = 0.0f;
        if (this.O != 0.0f && !(z10 = this.L)) {
            if (z10) {
                f10 = -g4();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.I3, f10));
            animatorSet.setInterpolator(org.telegram.ui.Components.lr.f37208f);
            animatorSet.setDuration(250L);
            animatorSet.start();
        }
    }

    public final void Q3() {
        float f10;
        int i7;
        if (this.Y == null) {
            return;
        }
        float a10 = 1.0f - c8.l9.a(((-this.O) - g4()) / org.telegram.messenger.g0.L(48.0f), 0.0f, 1.0f);
        float max = Math.max(this.f46750w3, this.h.f57657e);
        float f11 = this.f46640b.f57657e;
        if (this.T0 != 2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float max2 = f10 * (1.0f - this.f46646c.f57657e) * (1.0f - max) * Math.max(f11, (1.0f - i4()) * a10);
        this.Y.setAlpha(max2);
        qw qwVar = this.Y;
        boolean z10 = false;
        if (max2 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        qwVar.setVisibility(i7);
        if (max2 <= 0.01f) {
            z10 = true;
        }
        this.f46662f.a(z10, true);
    }

    public final void Q4(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cx.Q4(int):void");
    }

    public final void R3() {
        int i7;
        float f10;
        int i10;
        int i11 = 8;
        if (this.f46635a0 != null) {
            if (this.f46641b0 != null) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float f11 = f10 * this.f46640b.f57657e;
            float T1 = org.telegram.messenger.g0.T1(0.98f, 1.0f, f11);
            this.f46635a0.setScaleX(T1);
            this.f46635a0.setScaleY(T1);
            this.f46635a0.setAlpha(f11);
            ez0 ez0Var = this.f46635a0;
            if (f11 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            ez0Var.setVisibility(i10);
        }
        org.telegram.ui.Components.f71 f71Var = this.f46641b0;
        te.a aVar = this.f46725s;
        if (f71Var != null) {
            float f12 = 1.0f - aVar.f57657e;
            f71Var.setAlpha(f12);
            org.telegram.ui.Components.f71 f71Var2 = this.f46641b0;
            if (f12 > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            f71Var2.setVisibility(i7);
        }
        jg.q0 q0Var = this.f46647c0;
        if (q0Var != null) {
            float f13 = aVar.f57657e;
            q0Var.setAlpha(f13);
            jg.q0 q0Var2 = this.f46647c0;
            if (f13 > 0.0f) {
                i11 = 0;
            }
            q0Var2.setVisibility(i11);
        }
    }

    public final void R4(boolean z10, boolean z11) {
        int i7;
        int i10;
        xv xvVar = this.H3;
        if (xvVar != null && xvVar.c()) {
            return;
        }
        if (this.f46663f0[0].f46305s == 0 && n4() && this.f46663f0[0].f46306w == 2) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (this.L && !z11 && !this.F0.g()) {
            i10 = -org.telegram.messenger.g0.L(81.0f);
        } else {
            i10 = 0;
        }
        if (z10) {
            org.telegram.ui.ActionBar.l5 l5Var = this.f46663f0[0].f46304r;
            l5Var.f29199b = 1;
            l5Var.k(i7, i10, false, false);
            P4();
            return;
        }
        this.f46663f0[0].f46300c.h1(i7, i10);
        P4();
    }

    public final void S3(boolean z10) {
        int i7;
        int i10;
        if (this.D0 != null && this.actionBar != null) {
            int i11 = org.telegram.messenger.g0.f24113n;
            int measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(this.f46634a);
            if (this.f46641b0 != null) {
                i7 = org.telegram.messenger.g0.L(50.0f);
            } else {
                i7 = 0;
            }
            int i12 = measuredHeight + i7;
            org.telegram.ui.Components.cs csVar = this.L1;
            if (csVar != null) {
                i10 = (int) csVar.d(org.telegram.messenger.g0.L(7.0f));
            } else {
                i10 = 0;
            }
            int i13 = i12 + i10;
            kw kwVar = this.D0;
            SparseArray sparseArray = kwVar.h;
            kwVar.X0 = i13;
            kwVar.Y0 = i11;
            di.b1 b1Var = kwVar.f39182b0;
            if (z10) {
                b1Var.q1(0, i13, 0, i11);
            } else {
                b1Var.setPadding(0, i13, 0, i11);
            }
            kwVar.P0.j(kwVar.X0, kwVar.Y0, z10);
            org.telegram.ui.Components.em0 em0Var = kwVar.f39183c0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) em0Var.getLayoutParams();
            int i14 = marginLayoutParams.topMargin;
            int i15 = kwVar.X0;
            if (i14 != i15 || marginLayoutParams.bottomMargin != kwVar.Y0) {
                marginLayoutParams.topMargin = i15;
                marginLayoutParams.bottomMargin = kwVar.Y0;
                em0Var.requestLayout();
            }
            org.telegram.ui.Components.rm0.M(kwVar.f39189i0, kwVar.f39192l0, kwVar.X0, kwVar.Y0, z10);
            org.telegram.ui.Components.rm0.M(kwVar.f39193n0, kwVar.f39196q0, kwVar.X0, kwVar.Y0, z10);
            org.telegram.ui.Components.rm0.M(kwVar.f39200u0, kwVar.f39203x0, kwVar.X0, kwVar.Y0, z10);
            org.telegram.ui.Components.mf0 mf0Var = kwVar.f39198s0;
            int i16 = kwVar.X0;
            int i17 = kwVar.Y0;
            mf0Var.setClipToPadding(false);
            org.telegram.ui.Components.e51 e51Var = mf0Var.f37453c;
            mf0Var.K = z10;
            mf0Var.setPadding(0, i16, 0, i17);
            if (z10) {
                e51Var.q1(0, i16, 0, i17);
            } else {
                e51Var.setPadding(0, i16, 0, i17);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) e51Var.getLayoutParams();
            marginLayoutParams2.topMargin = -i16;
            marginLayoutParams2.bottomMargin = -i17;
            mf0Var.K = false;
            org.telegram.ui.Components.ql0 ql0Var = kwVar.J0;
            if (ql0Var != null) {
                ql0Var.b(kwVar.X0, kwVar.Y0, z10);
            }
            int size = sparseArray.size();
            for (int i18 = 0; i18 < size; i18++) {
                View view = (View) sparseArray.valueAt(i18);
                if (view instanceof c00) {
                    ((c00) view).j(kwVar.X0, kwVar.Y0, z10);
                }
            }
            for (int i19 = 0; i19 < kwVar.getChildCount(); i19++) {
                if (kwVar.getChildAt(i19) instanceof c00) {
                    ((c00) kwVar.getChildAt(i19)).j(kwVar.X0, kwVar.Y0, z10);
                }
            }
        }
    }

    public final void S4(String str, boolean z10) {
        i5(true, false, true, false);
        bg.p0 p0Var = this.Z;
        if (p0Var != null) {
            p0Var.b(true);
        }
        qw qwVar = this.Y;
        if (qwVar != null) {
            qwVar.f33845r.setText(str);
            this.Y.f33845r.setSelection(str.length());
        }
    }

    public final void T3() {
        if (this.L1 != null) {
            float T1 = org.telegram.messenger.g0.T1(0.98f, 1.0f, 1.0f);
            this.L1.setAlpha(1.0f);
            this.L1.setScaleX(T1);
            this.L1.setScaleY(T1);
            this.L1.setVisibility(0);
        }
    }

    public final void T4(float f10) {
        bx[] bxVarArr;
        this.f46652d0 = f10;
        for (bx bxVar : this.f46663f0) {
            yw ywVar = bxVar.f46298a;
            for (int i7 = 0; i7 < ywVar.getChildCount(); i7++) {
                View childAt = ywVar.getChildAt(i7);
                if (childAt != null && RecyclerView.R(childAt) >= bxVar.d.f17577f + 1) {
                    childAt.setAlpha(f10);
                }
            }
        }
    }

    public boolean U3() {
        if (this.T0 == 10) {
            return true;
        }
        return false;
    }

    public final void U4(boolean z10, boolean z11) {
        if (this.f46663f0 != null && this.U1 != z10) {
            if (z10) {
                this.T1 = new ArrayList(d4(this.currentAccount, this.f46663f0[0].f46305s, this.Y2, false));
            } else {
                this.T1 = null;
            }
            this.U1 = z10;
            bx bxVar = this.f46663f0[0];
            bxVar.d.H = z10;
            if (!z10 && z11) {
                if (bxVar.f46298a.c0()) {
                    this.f46663f0[0].f46298a.post(new zu(this, 5));
                } else {
                    this.f46663f0[0].d.f();
                }
            }
        }
    }

    public final void V3() {
        if (org.telegram.messenger.g0.Q1()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.o(true);
            }
            TLObject tLObject = this.Z1;
            if (tLObject != null) {
                kw kwVar = this.D0;
                if (kwVar != null) {
                    kwVar.f39185e0.Q(this.Y1, tLObject);
                }
                this.Z1 = null;
                return;
            }
            return;
        }
        this.X1 = true;
    }

    public final void V4(boolean z10) {
        bx bxVar;
        if (org.telegram.messenger.bz.o() > 1 && org.telegram.messenger.pc.e(32768)) {
            if (z10) {
                bx[] bxVarArr = this.f46663f0;
                if (bxVarArr != null && (bxVar = bxVarArr[0]) != null) {
                    bxVar.setLayerType(2, null);
                    this.f46663f0[0].setClipChildren(false);
                    this.f46663f0[0].setClipToPadding(false);
                    this.f46663f0[0].f46298a.setClipChildren(false);
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
            if (this.f46663f0 != null) {
                int i7 = 0;
                while (true) {
                    bx[] bxVarArr2 = this.f46663f0;
                    if (i7 >= bxVarArr2.length) {
                        break;
                    }
                    bx bxVar2 = bxVarArr2[i7];
                    if (bxVar2 != null) {
                        bxVar2.setLayerType(0, null);
                        bxVar2.setClipChildren(true);
                        bxVar2.setClipToPadding(true);
                        bxVar2.f46298a.setClipChildren(true);
                    }
                    i7++;
                }
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setLayerType(0, null);
            }
            tv tvVar = this.F0;
            if (tvVar != null) {
                tvVar.setLayerType(0, null);
            }
            View view2 = this.fragmentView;
            if (view2 != null) {
                ((ViewGroup) view2).setClipChildren(true);
                this.fragmentView.requestLayout();
            }
        }
    }

    public final void W3() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.f29086o0) {
            kVar.n();
            this.f46729s3 = false;
            q5(true, true);
        }
    }

    public final void W4(float f10) {
        bx[] bxVarArr = this.f46663f0;
        int i7 = 0;
        if (bxVarArr != null) {
            int paddingTop = bxVarArr[0].f46298a.getPaddingTop() + ((int) f10);
            int i10 = 0;
            while (true) {
                bx[] bxVarArr2 = this.f46663f0;
                if (i10 >= bxVarArr2.length) {
                    break;
                }
                bxVarArr2[i10].f46298a.setTopGlowOffset(paddingTop);
                i10++;
            }
        }
        if (this.fragmentView != null && f10 != this.O) {
            this.O = f10;
            org.telegram.ui.Components.gc gcVar = this.f46717q3;
            if (gcVar != null) {
                gcVar.l();
            }
            if (this.G3 != null) {
                float currentActionBarHeight = 1.0f - ((-f10) / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                org.telegram.ui.Cells.o oVar = this.G3;
                float f11 = (int) f10;
                float f12 = oVar.f31153f;
                oVar.h = f11;
                oVar.setTranslationY(f12 + f11);
                this.G3.setAlpha(c8.l9.a(currentActionBarHeight, 0.0f, 1.0f));
                org.telegram.ui.Cells.o oVar2 = this.G3;
                if (currentActionBarHeight <= 0.0f) {
                    i7 = 4;
                }
                oVar2.setVisibility(i7);
            }
            Q3();
            this.fragmentView.invalidate();
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent, boolean z10) {
        xv xvVar;
        uv uvVar;
        rw rwVar;
        boolean z11;
        boolean z12;
        if (!this.f46729s3 && (((xvVar = this.H3) == null || !xvVar.c()) && (((uvVar = this.L0) == null || uvVar.getVisibility() != 0) && ((rwVar = this.A0) == null || !rwVar.f38631n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                rw rwVar2 = this.A0;
                if (rwVar2 != null && rwVar2.getTabsCount() >= 2 && this.A0.getCurrentTabId() != this.A0.getFirstTabId()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                rw rwVar3 = this.A0;
                if (rwVar3 != null && rwVar3.getTabsCount() >= 2 && this.A0.getCurrentTabId() != this.A0.getLastTabId()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                org.telegram.messenger.bz.m(this.currentAccount);
                if (z10) {
                    if (!z12 || z11) {
                    }
                } else {
                    return z11;
                }
            }
            return true;
        }
        return false;
    }

    public final void X3(String str) {
        if (this.actionBar.c(str)) {
            return;
        }
        org.telegram.ui.ActionBar.z q10 = this.actionBar.q(str);
        boolean z10 = this.X;
        ArrayList arrayList = this.f46688k1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.f46679i1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f46679i1.setImageDrawable(new org.telegram.ui.ActionBar.y1(true));
            org.telegram.ui.ActionBar.u6.s(this.f46679i1, org.telegram.ui.ActionBar.n6.f29788y8, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.f46679i1;
            int i7 = org.telegram.ui.ActionBar.n6.f29807z8;
            org.telegram.ui.ActionBar.u6.Q(imageView2, org.telegram.ui.ActionBar.n6.h0(getThemedColor(i7), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i7), getResourceProvider());
            this.f46679i1.setOnClickListener(new iu(this, 6));
            q10.addView(this.f46679i1, c8.ma.r(54, 54, 16));
            arrayList.add(this.f46679i1);
        }
        NumberTextView numberTextView = new NumberTextView(q10.getContext());
        this.f46684j1 = numberTextView;
        int i10 = 18;
        numberTextView.setTextSize(18);
        this.f46684j1.setTypeface(org.telegram.messenger.g0.o());
        this.f46684j1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29788y8));
        NumberTextView numberTextView2 = this.f46684j1;
        if (!this.X) {
            i10 = 72;
        }
        q10.addView(numberTextView2, c8.ma.m(1.0f, 0, -1, i10, 0, 0));
        this.f46684j1.setOnTouchListener(new gi.a(2));
        this.f46696m1 = q10.g(100, 2131232295, org.telegram.messenger.g0.L(48.0f));
        this.n1 = q10.g(104, 2131232258, org.telegram.messenger.g0.L(48.0f));
        this.f46706o1 = q10.g(107, 2131232053, org.telegram.messenger.g0.L(48.0f));
        this.l1 = q10.h(102, 2131232110, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.gd.M0(2131751587, null));
        org.telegram.ui.ActionBar.r0 h = q10.h(0, 2131231244, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.gd.M0(2131754839, null));
        q10.addView(new View(getParentActivity()), c8.ma.o(5, -1));
        this.f46727s1 = h.e(105, 2131232053, org.telegram.messenger.gd.M0(2131754170, null));
        this.f46710p1 = h.e(108, 2131232295, org.telegram.messenger.gd.M0(2131751442, null));
        this.f46715q1 = h.e(109, 2131232048, org.telegram.messenger.gd.M0(2131750801, null));
        this.f46721r1 = h.e(110, 2131232331, org.telegram.messenger.gd.M0(2131750699, null));
        this.f46737u1 = h.e(101, 2131232217, org.telegram.messenger.gd.M0(2131748489, null));
        this.f46732t1 = h.e(103, 2131232094, org.telegram.messenger.gd.M0(2131752078, null));
        this.f46742v1 = h.e(106, 2131232069, org.telegram.messenger.gd.M0(2131753690, null));
        this.n1.setOnLongClickListener(new qu(this, 1));
        arrayList.add(this.f46696m1);
        arrayList.add(this.f46706o1);
        arrayList.add(this.n1);
        arrayList.add(this.l1);
        arrayList.add(h);
        n5(false);
    }

    public final void X4(float f10) {
        this.f46765z1 = f10;
        v5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (org.telegram.messenger.bz.o() != 0) {
            org.telegram.messenger.pc.e(32768);
        }
        m5();
    }

    public final void Y3() {
        int i7;
        kw kwVar = this.D0;
        if ((kwVar != null && kwVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        if (this.f46711p2 != null) {
            i7 = 2;
        } else if (!this.f46702n2) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        kw kwVar2 = new kw(this, getParentActivity(), this, i7, this.T0, this.Y2, this.f46638a3, new hv(this));
        this.D0 = kwVar2;
        this.glassEngine.c(kwVar2);
        ((vw) this.fragmentView).addView(this.D0, this.C0);
        kw kwVar3 = this.D0;
        kwVar3.f39185e0.V = new mw(this);
        kwVar3.f39192l0.setOnItemClickListener(new ju(this, 1));
        this.D0.f39196q0.setOnItemClickListener(new ju(this, 2));
        this.D0.f39203x0.setOnItemClickListener(new mu(this, 0));
        this.D0.f39196q0.setOnItemLongClickListener(new ju(this, 3));
        this.D0.f39182b0.setOnItemClickListener(new ju(this, 4));
        this.D0.f39182b0.setOnItemLongClickListener(new hv(this));
        this.D0.setFilteredSearchViewDelegate(new ju(this, 5));
        this.D0.setAlpha(0.0f);
        this.D0.setScaleX(1.05f);
        this.D0.setScaleY(1.05f);
        this.D0.setVisibility(8);
        this.D0.setBlurredBackgroundDrawableFactory(this.f46735t4);
    }

    public final void Y4(CharSequence charSequence, String str) {
        if (str != null && !str.isEmpty()) {
            this.G2 = str;
            this.H2 = null;
            this.F2 = null;
            if (this.D1 != null) {
                v3(charSequence);
                return;
            } else {
                this.Z3 = charSequence;
                return;
            }
        }
        this.G2 = null;
        this.H2 = null;
    }

    public final void Z3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.f46764z0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i7 = 0; i7 < 2; i7++) {
                undoViewArr[i7] = new gw(this, parentActivity);
                FrameLayout.LayoutParams d = c8.ma.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.f46691k4 + this.f46699m4 + d.bottomMargin;
                UndoView undoView = undoViewArr[i7];
                int i10 = this.f46759y0 + 1;
                this.f46759y0 = i10;
                ((vw) this.fragmentView).addView(undoView, i10, d);
            }
        }
    }

    public final void Z4(float f10) {
        if (org.telegram.messenger.bz.o() <= 0) {
            boolean z10 = org.telegram.messenger.s2.f26721a;
        } else if (this.f46645b4 != f10) {
            boolean z11 = true;
            if (org.telegram.messenger.bz.o() > 1 && org.telegram.messenger.pc.e(32768)) {
                z11 = false;
            }
            this.f46651c4 = z11;
            this.f46645b4 = f10;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.f46651c4) {
                float f11 = (1.0f - this.f46645b4) * (-org.telegram.messenger.g0.L(40.0f));
                tv tvVar = this.F0;
                if (tvVar != null) {
                    tvVar.setTranslationX(f11);
                }
                qw qwVar = this.Y;
                if (qwVar != null) {
                    qwVar.setTranslationX(f11);
                }
                xv xvVar = this.H3;
                if (xvVar != null && xvVar.getFragmentView() != null && !this.E) {
                    this.H3.getFragmentView().setTranslationX(f11);
                    return;
                }
                return;
            }
            float f12 = 1.0f - this.f46645b4;
            float f13 = (-org.telegram.messenger.g0.L(4.0f)) * f12;
            float f14 = 1.0f - (f12 * 0.05f);
            tv tvVar2 = this.F0;
            if (tvVar2 != null) {
                tvVar2.setScaleX(f14);
                this.F0.setScaleY(f14);
                this.F0.setTranslationX(f13);
                this.F0.setPivotX(0.0f);
                this.F0.setPivotY(0.0f);
            }
            qw qwVar2 = this.Y;
            if (qwVar2 != null) {
                qwVar2.setTranslationX(f13);
                this.Y.setScaleX(f14);
                this.Y.setScaleY(f14);
            }
            xv xvVar2 = this.H3;
            if (xvVar2 != null && xvVar2.getFragmentView() != null) {
                if (!this.E) {
                    this.H3.getFragmentView().setScaleX(f14);
                    this.H3.getFragmentView().setScaleY(f14);
                    this.H3.getFragmentView().setTranslationX(f13);
                }
                this.H3.getFragmentView().setPivotX(0.0f);
                this.H3.getFragmentView().setPivotY(0.0f);
            }
        }
    }

    public final void a4(final long j3, final long j10, boolean z10, final y91 y91Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String M0;
        String b02;
        String M02;
        TLRPC.TL_forumTopic f10;
        if (A3(j3)) {
            int i7 = this.T0;
            if (i7 != 11 && i7 != 12 && i7 != 13) {
                if (z10 && ((this.f46675h2 != null && this.f46680i2 != null) || this.f46685j2 != null)) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        if (org.telegram.messenger.n5.C(j3)) {
                            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(getMessagesController().c1(Integer.valueOf((int) (4294967295L & j3))).user_id));
                            if (c22 != null) {
                                M0 = org.telegram.messenger.gd.M0(2131745401, null);
                                b02 = org.telegram.messenger.gd.b0(this.f46675h2, org.telegram.messenger.o10.q(c22));
                                M02 = org.telegram.messenger.gd.M0(2131745445, null);
                            } else {
                                return;
                            }
                        } else if (org.telegram.messenger.n5.E(j3)) {
                            if (j3 == getUserConfig().e()) {
                                M0 = org.telegram.messenger.gd.M0(2131745401, null);
                                b02 = org.telegram.messenger.gd.b0(this.f46680i2, org.telegram.messenger.gd.M0(2131745706, null));
                                M02 = org.telegram.messenger.gd.M0(2131745445, null);
                            } else {
                                TLRPC.User c23 = getMessagesController().c2(Long.valueOf(j3));
                                if (c23 != null && this.f46675h2 != null) {
                                    M0 = org.telegram.messenger.gd.M0(2131745401, null);
                                    b02 = org.telegram.messenger.gd.b0(this.f46675h2, org.telegram.messenger.o10.q(c23));
                                    M02 = org.telegram.messenger.gd.M0(2131745445, null);
                                } else {
                                    return;
                                }
                            }
                        } else {
                            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-j3));
                            if (O0 != null) {
                                String str = O0.title;
                                if (j10 != 0 && (f10 = getMessagesController().f25769t7.f(O0.f28403id, j10)) != null) {
                                    str = ((Object) str) + " " + f10.title;
                                }
                                if (this.f46685j2 != null) {
                                    M0 = org.telegram.messenger.gd.M0(2131754364, null);
                                    b02 = org.telegram.messenger.gd.b0(this.f46685j2, str);
                                    M02 = org.telegram.messenger.gd.M0(2131754484, null);
                                } else {
                                    M0 = org.telegram.messenger.gd.M0(2131745401, null);
                                    b02 = org.telegram.messenger.gd.b0(this.f46680i2, str);
                                    M02 = org.telegram.messenger.gd.M0(2131745445, null);
                                }
                            } else {
                                return;
                            }
                        }
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                        u1Var.S = M0;
                        u1Var.U = org.telegram.messenger.g0.W2(b02);
                        alertDialog$Builder.k(M02, new org.telegram.ui.ActionBar.r1() {
                            @Override
                            public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i10) {
                                cx.this.a4(j3, j10, false, y91Var);
                            }
                        });
                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                        if (showDialog(u1Var) == null) {
                            u1Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i7 == 15) {
                    Runnable m2Var = new bi.m2(this, j3, new d3.e0(this, j3, j10, y91Var, 6), 27);
                    if (j3 < 0) {
                        k5(getMessagesController().O0(Long.valueOf(-j3)), m2Var, null);
                        return;
                    }
                    TLRPC.User c24 = getMessagesController().c2(Long.valueOf(j3));
                    TLRPC.User c25 = getMessagesController().c2(Long.valueOf(this.I));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String a02 = org.telegram.messenger.gd.a0(null, null, 2131754072, org.telegram.messenger.o10.k(c24, true), org.telegram.messenger.o10.k(c25, true));
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f28744a;
                    u1Var2.S = a02;
                    u1Var2.U = TextUtils.concat(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131754073, org.telegram.messenger.o10.k(c24, true), org.telegram.messenger.o10.k(c25, true))));
                    alertDialog$Builder2.k(org.telegram.messenger.gd.a0("Send", null, 2131745445, new Object[0]), new zr(m2Var, 5));
                    alertDialog$Builder2.h(org.telegram.messenger.gd.a0("Cancel", null, 2131752578, new Object[0]), new org.telegram.ui.Components.wb0(23));
                    showDialog(u1Var2);
                    return;
                } else if (this.E2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(org.telegram.messenger.sr.a(j3, j10));
                    if (this.E2.y(this, arrayList, null, false, this.L2, this.M2, this.N2, y91Var) && this.f46689k2) {
                        this.E2 = null;
                        return;
                    }
                    return;
                } else {
                    finishFragment();
                    return;
                }
            }
            if (org.telegram.messenger.n5.E(j3)) {
                TLRPC.User c26 = getMessagesController().c2(Long.valueOf(j3));
                if (!c26.mutual_contact) {
                    UndoView l42 = l4();
                    if (l42 != null) {
                        l42.j(45, j3, null);
                        return;
                    }
                    return;
                }
                user = c26;
                chat = null;
            } else {
                TLRPC.Chat O02 = getMessagesController().O0(Long.valueOf(-j3));
                if (org.telegram.messenger.v3.N(O02) && org.telegram.messenger.v3.w(1, O02)) {
                    chat = O02;
                    user = null;
                } else {
                    UndoView l43 = l4();
                    if (l43 != null) {
                        l43.j(46, j3, null);
                        return;
                    }
                    return;
                }
            }
            org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null);
            TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
            tL_messages_checkHistoryImportPeer.peer = getMessagesController().l1(j3);
            getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new di.k3(this, u1Var3, user, chat, j3, tL_messages_checkHistoryImportPeer));
            try {
                u1Var3.r(300L);
            } catch (Exception unused) {
            }
        }
    }

    public final void a5() {
        getContactsController().B();
        org.telegram.ui.Components.t6 t6Var = new org.telegram.ui.Components.t6(getParentActivity(), this.currentAccount, getResourceProvider(), new vs(4, this, r1), new bh(r1, 17));
        org.telegram.ui.ActionBar.x2 j3 = org.telegram.messenger.n10.j(getParentActivity(), false, 1, getResourceProvider());
        j3.O = t6Var;
        j3.V0 = 49;
        j3.show();
        org.telegram.ui.ActionBar.x2[] x2VarArr = {j3};
        j3.Q(org.telegram.ui.ActionBar.n6.f29467h5);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Zk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Yk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.dl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.cl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.bl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.al));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ti));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29451g8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ne));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Le));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.yj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.wj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.xj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29435f9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29562m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Zl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29786y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29416e9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29397d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29379c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.M7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.N7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29470h9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29579n9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29544l9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29597o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29506j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29526k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29359b8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29338a8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Z7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Y7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.X7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.W7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.V7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.K7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29358b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29614p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29524k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.qk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Z5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29808z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29789y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29770x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29751w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29732v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29713u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29693t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29656r9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29637q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29617p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29488i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29360b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29339a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29395d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29797yi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G8));
    }

    public final void b4(long j3, boolean z10) {
        if (this.f46663f0 != null) {
            int i7 = 0;
            while (true) {
                bx[] bxVarArr = this.f46663f0;
                if (i7 < bxVarArr.length) {
                    int childCount = bxVarArr[i7].f46298a.getChildCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 < childCount) {
                            View childAt = this.f46663f0[i7].f46298a.getChildAt(i10);
                            if (childAt instanceof org.telegram.ui.Cells.u2) {
                                org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) childAt;
                                if (u2Var.getDialogId() == j3) {
                                    u2Var.c0(z10, true);
                                    break;
                                }
                            }
                            i10++;
                        }
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean b5(org.telegram.ui.Cells.u2 r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cx.b5(org.telegram.ui.Cells.u2):boolean");
    }

    public final void c5(boolean z10) {
        float f10;
        this.f46646c.a(z10, true);
        if (this.f46701n0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.T3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.T3 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.T3 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            this.f46701n0.setVisibility(0);
        } else {
            this.f46701n0.setSelected(false);
            Drawable background = this.f46701n0.getBackground();
            if (background != null) {
                background.setState(StateSet.NOTHING);
                background.jumpToCurrentState();
            }
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.ActionBar.r0 r0Var = this.f46701n0;
        Property property = View.ALPHA;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(r0Var, property, f10));
        this.T3.playTogether(arrayList);
        this.T3.addListener(new dw(this, z10, 1));
        this.T3.start();
    }

    @Override
    public final boolean canBeginSlide() {
        rw rwVar;
        if (!this.H3.c()) {
            if (this.T0 == 3 && (rwVar = this.A0) != null && rwVar.getVisibility() == 0 && this.A0.L > 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean closeLastFragment() {
        if (this.H3.c()) {
            this.H3.a();
            kw kwVar = this.D0;
            if (kwVar != null) {
                kwVar.O();
                return true;
            }
            return true;
        }
        return super.closeLastFragment();
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.Components.v7 v7Var = new org.telegram.ui.Components.v7(this, context, this.resourceProvider, 3);
        v7Var.setAllowOverlayTitle(true);
        v7Var.H0 = true;
        if (v7Var.G0 == null) {
            bi.p2 p2Var = new bi.p2(v7Var.getContext(), 7);
            v7Var.G0 = p2Var;
            v7Var.addView(p2Var);
        }
        org.telegram.ui.ActionBar.u6.l(v7Var, 3, org.telegram.ui.ActionBar.n6.f29692t8, getResourceProvider());
        org.telegram.ui.ActionBar.u6.a(v7Var, org.telegram.ui.ActionBar.n6.f29807z8, getResourceProvider(), true);
        org.telegram.ui.ActionBar.u6.l(v7Var, 1, org.telegram.ui.ActionBar.n6.f29731v8, getResourceProvider());
        org.telegram.ui.ActionBar.u6.b(v7Var, org.telegram.ui.ActionBar.n6.f29788y8, getResourceProvider(), true);
        if (v7Var.f29112y1 == null) {
            fi.j jVar = new fi.j(v7Var, v7Var.getContext(), v7Var.K0, v7Var.P0);
            v7Var.f29112y1 = jVar;
            jVar.setClipChildren(false);
            v7Var.addView(v7Var.f29112y1);
        }
        v7Var.getAdditionalSubTitleOverlayContainer().setTranslationX(org.telegram.messenger.g0.L(4.0f));
        v7Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-org.telegram.messenger.g0.L(3.0f));
        if (!this.inPreviewMode && (!org.telegram.messenger.g0.Q1() || this.Y2 == 0 || t4())) {
            return v7Var;
        }
        v7Var.setOccupyStatusBar(false);
        return v7Var;
    }

    @Override
    public final android.view.View createView(android.content.Context r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cx.createView(android.content.Context):android.view.View");
    }

    public final java.util.ArrayList d4(int r11, int r12, int r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cx.d4(int, int, int, boolean):java.util.ArrayList");
    }

    public final void d5() {
        if (!this.B0 && getMessagesController().V0 && getMessagesController().M3 && this.A0 != null && getMessagesController().V0().isEmpty() && !this.isPaused && getUserConfig().Q && !this.inPreviewMode) {
            SharedPreferences g12 = org.telegram.messenger.mp.g1();
            if (!g12.getBoolean("filterhint", false)) {
                g12.edit().putBoolean("filterhint", true).apply();
                org.telegram.messenger.g0.h3(new zu(this, 7), 1000L);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r27, int r28, java.lang.Object... r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cx.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (!(dialog instanceof ki.t2) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final float e4(boolean z10) {
        float f10;
        if (z10) {
            f10 = 1.0f - this.f46640b.f57657e;
        } else {
            f10 = 1.0f;
        }
        return f10 * (1.0f - i4()) * this.f46719r.f57657e;
    }

    public final void e5() {
        LaunchActivity launchActivity;
        boolean q10;
        int i7;
        int i10;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        LaunchActivity launchActivity2;
        int i11;
        float f10;
        int i12;
        CharSequence charSequence;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        vu vuVar;
        vs vsVar;
        org.telegram.ui.ActionBar.i6 i6Var;
        int w02;
        int w03;
        int w04;
        int i13;
        int w05;
        org.telegram.ui.Components.y60 I = org.telegram.ui.Components.y60.I(this, this.f46692l0);
        int i14 = org.telegram.ui.ActionBar.n6.A8;
        I.T(getThemedColor(i14), getThemedColor(i14));
        I.f42375s = 8;
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) parentActivity;
        } else {
            launchActivity = null;
        }
        float f11 = 64.0f;
        int i15 = 1;
        int i16 = 0;
        if (this.f46638a3 != 0) {
            if (org.telegram.messenger.v3.N(this.f46644b3)) {
                I.c(2131232108, org.telegram.messenger.gd.M0(2131751902, null), new zu(this, 14), false);
                I.k();
            }
            I.i(new gu(this, 1), org.telegram.messenger.gd.M0(2131751901, null), this.f46644b3.collapsed_in_dialogs);
            I.i(new gu(this, 2), org.telegram.messenger.gd.M0(2131751900, null), !this.f46644b3.collapsed_in_dialogs);
            I.a0();
            I.Y(-org.telegram.messenger.g0.L(64.0f));
            return;
        }
        int i17 = 3;
        if (t4()) {
            I.c(2131232108, org.telegram.messenger.gd.M0(2131754141, null), new gu(this, 3), false);
            I.c(2131232184, org.telegram.messenger.gd.M0(2131749084, null), new gu(this, 4), false);
            I.a0();
            I.Y(-org.telegram.messenger.g0.L(64.0f));
            return;
        }
        org.telegram.ui.ActionBar.i6 i6Var2 = this.resourceProvider;
        if (i6Var2 != null) {
            q10 = i6Var2.d();
        } else {
            q10 = org.telegram.ui.ActionBar.n6.I.q();
        }
        if (q10) {
            i7 = 2131231785;
        } else {
            i7 = 2131231844;
        }
        if (q10) {
            i10 = 2131744065;
        } else {
            i10 = 2131744064;
        }
        I.c(i7, org.telegram.messenger.gd.M0(i10, null), new gu(this, 5), false);
        I.k();
        I.c(2131232102, org.telegram.messenger.gd.M0(2131751769, null), new gu(this, 6), false);
        I.c(2131232085, org.telegram.messenger.gd.M0(2131752585, null), new gu(this, 7), false);
        I.k();
        I.c(2131232485, org.telegram.messenger.gd.M0(2131748081, null), new gu(this, 8), false);
        I.c(2131232506, org.telegram.messenger.gd.M0(2131745706, null), new gu(this, 9), false);
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.f26912a;
        if (((org.telegram.messenger.h0) getMessagesController().A7.f26159p0.f13998b).f24336c) {
            I.c(2131231275, org.telegram.messenger.gd.M0(2131742956, null), new zu(this, 15), false);
        } else {
            TLRPC.TL_attachMenuBots tL_attachMenuBots = org.telegram.messenger.ri.d0(org.telegram.messenger.j10.f24770t0).f26599b;
            if (launchActivity != null && tL_attachMenuBots != null && (arrayList = tL_attachMenuBots.bots) != null && !arrayList.isEmpty()) {
                ArrayList<TLRPC.TL_attachMenuBot> arrayList3 = tL_attachMenuBots.bots;
                int size = arrayList3.size();
                int i18 = 0;
                while (i18 < size) {
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList3.get(i18);
                    i18++;
                    TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                    if (tL_attachMenuBot2.show_in_side_menu) {
                        vu vuVar2 = new vu(this, tL_attachMenuBot2, launchActivity, i15);
                        vs vsVar2 = new vs(i17, this, tL_attachMenuBot2);
                        org.telegram.ui.ActionBar.i6 i6Var3 = I.d;
                        f10 = f11;
                        if (I.f42349e == null) {
                            arrayList2 = arrayList3;
                            launchActivity2 = launchActivity;
                            i11 = size;
                        } else {
                            int i19 = org.telegram.ui.ActionBar.n6.F8;
                            int i20 = org.telegram.ui.ActionBar.n6.E8;
                            org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, I.f42349e, I.d, false, false);
                            z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), i16, org.telegram.messenger.g0.L(18.0f), i16);
                            if (tL_attachMenuBot2.side_menu_disclaimer_needed) {
                                charSequence = org.telegram.ui.Cells.n8.b(tL_attachMenuBot2.short_name);
                            } else {
                                charSequence = tL_attachMenuBot2.short_name;
                            }
                            Pattern pattern = org.telegram.messenger.ri.U1;
                            ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList4 = tL_attachMenuBot2.icons;
                            int size2 = arrayList4.size();
                            arrayList2 = arrayList3;
                            int i21 = 0;
                            while (true) {
                                if (i21 < size2) {
                                    TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = arrayList4.get(i21);
                                    int i22 = i21 + 1;
                                    TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon3 = tL_attachMenuBotIcon2;
                                    launchActivity2 = launchActivity;
                                    if (tL_attachMenuBotIcon3.name.equals("android_side_menu_static")) {
                                        tL_attachMenuBotIcon = tL_attachMenuBotIcon3;
                                        break;
                                    } else {
                                        i21 = i22;
                                        launchActivity = launchActivity2;
                                    }
                                } else {
                                    launchActivity2 = launchActivity;
                                    tL_attachMenuBotIcon = null;
                                    break;
                                }
                            }
                            if (tL_attachMenuBotIcon != null) {
                                i11 = size;
                                org.telegram.messenger.lz f12 = org.telegram.messenger.u5.f(tL_attachMenuBotIcon.icon, org.telegram.ui.ActionBar.n6.f29377c7, 1.0f, null);
                                if (f12 != null) {
                                    Integer num = I.f42366n0;
                                    if (num != null) {
                                        w05 = num.intValue();
                                    } else {
                                        w05 = org.telegram.ui.ActionBar.n6.w0(i19, i6Var3);
                                    }
                                    new PorterDuffColorFilter(w05, PorterDuff.Mode.SRC_IN);
                                }
                                org.telegram.messenger.fc b10 = org.telegram.messenger.fc.b(tL_attachMenuBotIcon.icon);
                                vsVar = vsVar2;
                                i6Var = i6Var3;
                                vuVar = vuVar2;
                                z0Var.k(charSequence, b10, "24_24", f12, tL_attachMenuBot2);
                                org.telegram.ui.Components.q9 q9Var = z0Var.h;
                                if (q9Var != null) {
                                    if (org.telegram.messenger.gd.f24213a0) {
                                        i13 = 5;
                                    } else {
                                        i13 = 3;
                                    }
                                    q9Var.setLayoutParams(c8.ma.e(24, 24, i13 | 16));
                                }
                            } else {
                                i11 = size;
                                vuVar = vuVar2;
                                vsVar = vsVar2;
                                i6Var = i6Var3;
                                z0Var.j(charSequence, 2131232074, null);
                            }
                            Integer num2 = I.m0;
                            if (num2 == null && I.f42366n0 == null) {
                                z0Var.c(i20, i19);
                            } else {
                                if (num2 != null) {
                                    w02 = num2.intValue();
                                } else {
                                    w02 = org.telegram.ui.ActionBar.n6.w0(i20, i6Var);
                                }
                                Integer num3 = I.f42366n0;
                                if (num3 != null) {
                                    w03 = num3.intValue();
                                } else {
                                    w03 = org.telegram.ui.ActionBar.n6.w0(i19, i6Var);
                                }
                                z0Var.d(w02, w03);
                            }
                            Integer num4 = I.f42366n0;
                            if (num4 != null) {
                                w04 = num4.intValue();
                            } else {
                                w04 = org.telegram.ui.ActionBar.n6.w0(i19, i6Var);
                            }
                            z0Var.setIconColorImage(w04);
                            Integer num5 = I.f42368o0;
                            if (num5 != null) {
                                z0Var.setSelectorColor(num5.intValue());
                            } else {
                                z0Var.h(0.12f, i20);
                            }
                            z0Var.setOnClickListener(new org.telegram.ui.Components.y7(19, I, vuVar));
                            i12 = 3;
                            z0Var.setOnLongClickListener(new fi.z1(3, I, vsVar));
                            int i23 = I.V;
                            if (i23 > 0) {
                                z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i23));
                                I.r(z0Var, c8.ma.o(I.V, -2));
                            } else {
                                I.r(z0Var, c8.ma.o(-1, -2));
                            }
                            i17 = i12;
                            f11 = f10;
                            arrayList3 = arrayList2;
                            launchActivity = launchActivity2;
                            size = i11;
                            i15 = 1;
                            i16 = 0;
                        }
                    } else {
                        arrayList2 = arrayList3;
                        launchActivity2 = launchActivity;
                        i11 = size;
                        f10 = f11;
                    }
                    i12 = i17;
                    i17 = i12;
                    f11 = f10;
                    arrayList3 = arrayList2;
                    launchActivity = launchActivity2;
                    size = i11;
                    i15 = 1;
                    i16 = 0;
                }
            }
        }
        float f13 = f11;
        if (getUserConfig().X) {
            I.c(2131232363, org.telegram.messenger.gd.M0(2131745300, null), new gu(this, 0), false);
        }
        org.telegram.ui.ActionBar.z0 z0Var2 = this.f46709p0;
        if (z0Var2 != null) {
            org.telegram.ui.ActionBar.u6.U(z0Var2.f30302b, org.telegram.ui.ActionBar.n6.Ri, getResourceProvider());
            this.f46709p0.setOnClickListener(new org.telegram.ui.Components.c31(12, this, I));
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26913b.getSharedPreferences("mainconfig", 0);
            String string = sharedPreferences.getString("proxy_ip", "");
            if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().B3 && !org.telegram.messenger.bz.f23216z1.isEmpty())) {
                I.k();
                I.d(this.f46709p0);
            }
        }
        I.a0();
        I.Y(-org.telegram.messenger.g0.L(f13));
    }

    public final int f4() {
        if (this.L) {
            return org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(81.0f);
        }
        return org.telegram.messenger.g0.L(48.0f);
    }

    public final void f5() {
        if (this.W3 == null) {
            for (String str : getMessagesController().V3) {
                if ("AUTOARCHIVE_POPULAR".equals(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = org.telegram.messenger.gd.M0(2131749127, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                    u1Var.S = M0;
                    u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131749128, null));
                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131749358, null), new ju(this, 6));
                    showDialog(u1Var, new nu(this, 0));
                    this.W3 = str;
                    return;
                }
            }
        }
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.y60 y60Var = this.M0;
        if (y60Var != null) {
            y60Var.v();
        }
    }

    public final int g4() {
        if (this.L) {
            return org.telegram.messenger.g0.L(81.0f);
        }
        return 0;
    }

    public final void g5(long j3, View view) {
        boolean z10;
        ArrayList Y0;
        int i7;
        int i10;
        TLRPC.EncryptedChat c12;
        s3(j3, view);
        boolean y10 = this.actionBar.y();
        ArrayList arrayList = this.K2;
        boolean z11 = true;
        if (y10) {
            if (arrayList.isEmpty()) {
                p4(true);
                return;
            }
        } else {
            if (this.f46729s3) {
                X3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.t4)) {
                    this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
                }
            } else {
                X3(null);
            }
            org.telegram.messenger.g0.v1(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29394d6));
            this.actionBar.S(null, null);
            int i11 = this.f46663f0[0].f46305s;
            if ((i11 != 7 && i11 != 8) || (this.actionBar.y() && !this.actionBar.z(null))) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 && y4(this.f46663f0[0])) {
                org.telegram.messenger.ro h42 = h4(this.f46663f0[0]);
                ArrayList arrayList2 = getMessagesController().f25809y;
                int size = arrayList2.size();
                i7 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i12);
                    if (!(dialog instanceof TLRPC.TL_dialogFolder) && h42.f26679j.get(dialog.f28407id, Integer.MIN_VALUE) != Integer.MIN_VALUE) {
                        long j10 = dialog.f28407id;
                        if (org.telegram.messenger.n5.C(j10) && (c12 = getMessagesController().c1(Integer.valueOf((int) (4294967295L & j10)))) != null) {
                            j10 = c12.user_id;
                        }
                        if (h42.b(getAccountInstance(), j10, dialog, false)) {
                            i7++;
                        }
                    }
                }
            } else {
                if (z10) {
                    Y0 = d4(this.currentAccount, this.f46663f0[0].f46305s, this.Y2, this.U1);
                } else {
                    Y0 = getMessagesController().Y0(this.Y2);
                }
                int size2 = Y0.size();
                i7 = 0;
                for (int i13 = 0; i13 < size2; i13++) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) Y0.get(i13);
                    if (!(dialog2 instanceof TLRPC.TL_dialogFolder)) {
                        if (v4(dialog2)) {
                            i7++;
                        } else if (!getMessagesController().I2(dialog2.f28407id, false)) {
                            break;
                        }
                    }
                }
            }
            if (i7 > 1) {
                if (this.f46663f0 != null) {
                    int i14 = 0;
                    while (true) {
                        bx[] bxVarArr = this.f46663f0;
                        if (i14 >= bxVarArr.length) {
                            break;
                        }
                        bxVarArr[i14].d.I = true;
                        i14++;
                    }
                }
                int i15 = org.telegram.messenger.mp.I8;
                D5(131072, true);
            }
            if (!this.f46729s3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList3 = new ArrayList();
                int i16 = 0;
                while (true) {
                    ArrayList arrayList4 = this.f46688k1;
                    if (i16 >= arrayList4.size()) {
                        break;
                    }
                    View view2 = (View) arrayList4.get(i16);
                    view2.setPivotY(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2);
                    org.telegram.messenger.g0.y(view2);
                    arrayList3.add(ObjectAnimator.ofFloat(view2, View.SCALE_Y, 0.1f, 1.0f));
                    i16++;
                }
                animatorSet.playTogether(arrayList3);
                animatorSet.setDuration(200L);
                animatorSet.start();
            }
            ValueAnimator valueAnimator = this.f46756x3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f46756x3 = ValueAnimator.ofFloat(this.f46750w3, 1.0f);
            int i17 = 0;
            while (true) {
                bx[] bxVarArr2 = this.f46663f0;
                if (i17 >= bxVarArr2.length) {
                    break;
                }
                bx bxVar = bxVarArr2[i17];
                if (bxVar != null) {
                    bxVar.f46298a.I0(true);
                }
                i17++;
            }
            if (this.L) {
                i10 = 81;
            } else {
                i10 = 0;
            }
            float max = Math.max(0.0f, org.telegram.messenger.g0.L(i10 + 48) + this.O);
            if (max != 0.0f) {
                this.Q = (int) max;
                this.fragmentView.requestLayout();
            }
            this.f46756x3.addUpdateListener(new ku(this, max, 0));
            this.f46756x3.addListener(new fw(this, max, 1));
            this.f46756x3.setInterpolator(org.telegram.ui.Components.lr.f37208f);
            this.f46756x3.setDuration(200L);
            this.f46756x3.start();
            rw rwVar = this.A0;
            if (rwVar != null) {
                rwVar.c(org.telegram.ui.ActionBar.n6.f29778xi, org.telegram.ui.ActionBar.n6.f29759wi, org.telegram.ui.ActionBar.n6.f29740vi, org.telegram.ui.ActionBar.n6.f29797yi, org.telegram.ui.ActionBar.n6.f29750w8);
            }
            org.telegram.ui.ActionBar.y1 y1Var = this.f46669g1;
            if (y1Var != null) {
                y1Var.c(true, 1.0f);
            }
            z11 = false;
        }
        n5(false);
        this.f46684j1.a(arrayList.size(), z11);
    }

    @Override
    public final org.telegram.ui.ActionBar.o4 getBackButtonState() {
        if (!t4() && !this.H3.f54292f) {
            return org.telegram.ui.ActionBar.o4.f29825b;
        }
        return org.telegram.ui.ActionBar.o4.f29824a;
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f10) {
        int i7;
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f46645b4, 1.0f);
            this.f46661e4 = ofFloat;
            return ofFloat;
        }
        if (getLayoutContainer() != null && getLayoutContainer().getMeasuredWidth() > 0) {
            i7 = (int) Utilities.i((200.0f / getLayoutContainer().getMeasuredWidth()) * f10, 200.0f, 80.0f);
        } else {
            i7 = 150;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f46645b4, 1.0f);
        this.f46661e4 = ofFloat2;
        ofFloat2.addUpdateListener(new lu(this, 1));
        this.f46661e4.setInterpolator(org.telegram.ui.Components.lr.f37209g);
        this.f46661e4.setDuration(i7);
        this.f46661e4.start();
        return this.f46661e4;
    }

    @Override
    public final java.util.ArrayList getThemeDescriptions() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cx.getThemeDescriptions():java.util.ArrayList");
    }

    public final org.telegram.messenger.ro h4(bx bxVar) {
        char c10;
        if (bxVar != null) {
            int i7 = bxVar.f46305s;
            if (i7 == 7 || i7 == 8) {
                org.telegram.messenger.ro[] roVarArr = getMessagesController().N;
                if (bxVar.f46305s == 8) {
                    c10 = 1;
                } else {
                    c10 = 0;
                }
                return roVarArr[c10];
            }
            return null;
        }
        return null;
    }

    public final void h5(long j3, View view) {
        String str;
        org.telegram.ui.Components.gc K;
        int i7 = -this.N3;
        this.N3 = i7;
        org.telegram.messenger.g0.E3(i7, view, null);
        org.telegram.messenger.q2.APP_ERROR.a();
        if (j3 >= 0) {
            str = org.telegram.messenger.o10.q(org.telegram.messenger.mp.u1(this.currentAccount).c2(Long.valueOf(j3)));
        } else {
            str = "";
        }
        if (getMessagesController().K3()) {
            K = org.telegram.ui.Components.lc.b0(this).Q(2131624217, 36, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131743523, str)));
        } else {
            K = org.telegram.ui.Components.lc.b0(this).K(2131624217, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131743523, str)), org.telegram.messenger.gd.M0(2131743522, null), new gu(this, 15));
        }
        K.j();
    }

    public final float i4() {
        xv xvVar = this.H3;
        if (xvVar != null && xvVar.c()) {
            return this.H3.f54291e;
        }
        return 0.0f;
    }

    public final void i5(boolean r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cx.i5(boolean, boolean, boolean, boolean):void");
    }

    @Override
    public final boolean isLightStatusBar() {
        xv xvVar;
        if (!this.f46693l2 && (xvVar = this.H3) != null && xvVar.getFragment() != null) {
            return this.H3.getFragment().isLightStatusBar();
        }
        if (i0.a.h(getThemedColor(org.telegram.ui.ActionBar.n6.f29394d6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final float j4() {
        return -org.telegram.messenger.g0.W1(this.f46640b.f57657e, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(48.0f));
    }

    public final void j5() {
        int i7;
        int i10;
        Long l10;
        if (this.N0 == null && !org.telegram.messenger.bz.f23208x && (!this.L || this.F0.g())) {
            i11[] i11VarArr = new i11[1];
            TLRPC.User f10 = org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24770t0).f();
            org.telegram.ui.ActionBar.n5 titleTextView = this.actionBar.getTitleTextView();
            if (titleTextView != null && titleTextView.getRightDrawable() != null) {
                this.F3.f();
                Drawable drawable = this.F3.f37361f[0];
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(titleTextView.getRightDrawable().getBounds());
                rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
                int L = (-(this.actionBar.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                i7 = org.telegram.messenger.g0.L(4.0f) + (rect.centerX() - org.telegram.messenger.g0.L(16.0f));
                org.telegram.ui.Cells.o oVar = this.G3;
                if (oVar != null) {
                    oVar.b(rect.centerX(), rect.centerY());
                }
                i10 = L;
            } else {
                i7 = 0;
                i10 = 0;
            }
            yv yvVar = new yv(this, this, getParentActivity(), Integer.valueOf(i7), getResourceProvider(), i11VarArr);
            if (f10 != null && org.telegram.messenger.n5.g(f10.emoji_status) > 0) {
                yvVar.setExpireDateHint(org.telegram.messenger.n5.g(f10.emoji_status));
            }
            Long l11 = this.D3;
            if (l11 != null) {
                yvVar.setSelected(l11);
            } else {
                Drawable drawable2 = this.F3.f37361f[0];
                if (drawable2 instanceof org.telegram.ui.Components.o5) {
                    l10 = Long.valueOf(((org.telegram.ui.Components.o5) drawable2).h());
                } else {
                    l10 = null;
                }
                yvVar.setSelected(l10);
            }
            yvVar.setSaveState(1);
            yvVar.y(this.F3, titleTextView);
            zv zvVar = new zv(this, yvVar);
            this.N0 = zvVar;
            i11VarArr[0] = zvVar;
            zvVar.showAsDropDown(this.actionBar, org.telegram.messenger.g0.L(16.0f), i10, 48);
            i11VarArr[0].b();
        }
    }

    @Override
    public final ui.f k() {
        return this.f46713p4;
    }

    public final fi.p6 k4() {
        return getMessagesController().R1();
    }

    public final void k5(org.telegram.tgnet.TLRPC.Chat r14, java.lang.Runnable r15, java.lang.Runnable r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cx.k5(org.telegram.tgnet.TLRPC$Chat, java.lang.Runnable, java.lang.Runnable):void");
    }

    public final UndoView l4() {
        Z3();
        UndoView[] undoViewArr = this.f46764z0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.d(2, true);
            vw vwVar = (vw) this.fragmentView;
            vwVar.removeView(undoViewArr[0]);
            vwVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void l5(boolean z10) {
        bx[] bxVarArr;
        char c10;
        char c11;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            bxVarArr = this.f46663f0;
            if (i10 >= bxVarArr.length) {
                break;
            }
            bxVarArr[i10].f46298a.C0();
            i10++;
        }
        if (z10 && bxVarArr.length > 1) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        int i11 = bxVarArr[c10].h;
        if (i11 >= 0 && i11 < getMessagesController().V0().size()) {
            org.telegram.messenger.ro roVar = (org.telegram.messenger.ro) getMessagesController().V0().get(this.f46663f0[c10].h);
            if (roVar.d()) {
                bx bxVar = this.f46663f0[c10];
                bxVar.f46305s = this.T0;
                yw ywVar = bxVar.f46298a;
                int i12 = yw.C3;
                ywVar.D1();
            } else {
                bx[] bxVarArr2 = this.f46663f0;
                if (bxVarArr2[c10 ^ 1].f46305s == 7) {
                    bxVarArr2[c10].f46305s = 8;
                } else {
                    bxVarArr2[c10].f46305s = 7;
                }
                bxVarArr2[c10].f46298a.setScrollEnabled(true);
                org.telegram.messenger.mp messagesController = getMessagesController();
                if (this.f46663f0[c10].f46305s == 8) {
                    c11 = 1;
                } else {
                    c11 = 0;
                }
                org.telegram.messenger.ro[] roVarArr = messagesController.N;
                org.telegram.messenger.ro roVar2 = roVarArr[c11];
                if (roVar2 != roVar) {
                    roVarArr[c11] = roVar;
                    int i13 = c11 ^ 1;
                    if (roVarArr[i13] == roVar) {
                        roVarArr[i13] = null;
                    }
                    if (roVarArr[c11] == null) {
                        if (roVar2 != null) {
                            roVar2.f26680k.clear();
                            roVar2.f26681l.clear();
                        }
                    } else {
                        messagesController.f5(null);
                    }
                }
            }
            bx[] bxVarArr3 = this.f46663f0;
            if (bxVarArr3.length > 1) {
                bxVarArr3[1].F = roVar.f26685p;
            }
            bx bxVar2 = bxVarArr3[c10];
            kv kvVar = bxVar2.d;
            kvVar.h = bxVar2.f46305s;
            kvVar.f();
            bx bxVar3 = this.f46663f0[c10];
            gv gvVar = bxVar3.f46300c;
            if (bxVar3.f46305s == 0 && n4() && this.f46663f0[c10].f46306w == 2) {
                i7 = 1;
            }
            gvVar.h1(i7, (int) this.O);
            C3(this.f46663f0[c10]);
        }
    }

    public final org.telegram.messenger.ro m4() {
        bx[] bxVarArr = this.f46663f0;
        if (bxVarArr != null && bxVarArr[0] != null) {
            ArrayList V0 = getMessagesController().V0();
            int i7 = this.S3;
            if (i7 < 0) {
                i7 = this.f46663f0[0].h;
            }
            if (i7 >= 0 && i7 < V0.size()) {
                return (org.telegram.messenger.ro) V0.get(i7);
            }
        }
        return null;
    }

    public final void m5() {
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
        int i7;
        ez0 ez0Var = this.f46635a0;
        if (ez0Var != null && ez0Var.getVisibility() != 8) {
            f10 = this.f46635a0.getMeasuredHeight();
        } else {
            f10 = 0.0f;
        }
        if (this.L) {
            f11 = org.telegram.messenger.g0.L(81.0f);
        } else {
            f11 = 0.0f;
        }
        if (this.L) {
            float f20 = this.O;
            float f21 = this.f46765z1;
            f12 = (f10 * f21) + com.google.android.gms.internal.vision.e2.z(1.0f, f21, f11, f20);
            f13 = this.f46767z3;
        } else {
            f12 = (f10 * this.f46765z1) + this.O;
            f13 = this.f46767z3;
        }
        float f22 = f12 + f13 + this.U;
        qw qwVar = this.Y;
        if (qwVar != null && qwVar.getVisibility() == 0) {
            f14 = this.Y.getAlpha();
        } else {
            f14 = 0.0f;
        }
        float L = org.telegram.messenger.g0.L(4.0f) * f14;
        rw rwVar = this.A0;
        if (rwVar != null) {
            rwVar.setTranslationY(f22 - L);
            f16 = this.A0.getAlpha();
            f17 = (this.A0.getUnreadOnlyBannerHeight() + org.telegram.messenger.g0.L(43.0f)) * f16;
            f15 = f22 + f17;
        } else {
            f15 = f22;
            f16 = 0.0f;
            f17 = 0.0f;
        }
        org.telegram.ui.Components.cs csVar = this.L1;
        if (csVar != null) {
            float f23 = f15 - L;
            int i10 = -org.telegram.messenger.g0.L(3.0f);
            if (this.f46641b0 == null) {
                i7 = org.telegram.messenger.g0.L(44.0f);
            } else {
                i7 = 0;
            }
            csVar.setTranslationY(org.telegram.messenger.g0.T1(f23, i10 - i7, this.f46640b.f57657e));
            f18 = this.L1.getMetadata().f57673c.f57683a;
            f19 = this.L1.d(0.0f);
        } else {
            f18 = 0.0f;
            f19 = 0.0f;
        }
        org.telegram.ui.Components.bs bsVar = this.M1;
        if (bsVar != null) {
            bsVar.setTranslationY(f22 - L);
            float W1 = org.telegram.messenger.g0.W1(Math.min(f18, f16), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(50.0f));
            org.telegram.ui.Components.bs bsVar2 = this.M1;
            float min = Math.min(org.telegram.messenger.g0.L(40.0f), (f19 + f17) - W1);
            Matrix matrix = bsVar2.f33762b;
            if (bsVar2.f33764e != W1 || bsVar2.f33765f != min) {
                bsVar2.f33764e = W1;
                bsVar2.f33765f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, W1);
                LinearGradient linearGradient = bsVar2.f33763c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                bsVar2.invalidate();
            }
            this.M1.setAlpha(Math.max(f16, f18));
        }
    }

    public final boolean n4() {
        if (!this.f46702n2 && this.T0 == 0 && this.f46638a3 == 0 && this.Y2 == 0) {
            org.telegram.messenger.mp messagesController = getMessagesController();
            messagesController.getClass();
            if (org.telegram.messenger.bz.f23190q1 && messagesController.R.f(2305843009213693952L | 1) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void n5(boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cx.n5(boolean):void");
    }

    public final boolean o4() {
        ArrayList arrayList = this.F2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void o5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cx.o5():void");
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else if (this.H3.c() && this.H3.getFragment().onBackPressed(z10)) {
            if (z10) {
                this.H3.a();
                kw kwVar = this.D0;
                if (kwVar != null) {
                    kwVar.O();
                    return false;
                }
            }
        } else {
            org.telegram.ui.Components.y60 y60Var = this.M0;
            if (y60Var != null) {
                if (z10) {
                    y60Var.v();
                    this.M0 = null;
                    return false;
                }
            } else {
                rw rwVar = this.A0;
                if (rwVar != null && rwVar.f38631n) {
                    if (z10) {
                        rwVar.setIsEditing(false);
                        c5(false);
                        return false;
                    }
                } else {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar != null && kVar.y()) {
                        if (z10) {
                            kw kwVar2 = this.D0;
                            if (kwVar2 != null && kwVar2.getVisibility() == 0) {
                                this.D0.N(false);
                            }
                            p4(true);
                            return false;
                        }
                    } else if (this.f46640b.f57658f) {
                        if (z10) {
                            this.Y.f33845r.getText().clear();
                            this.Z.b(false);
                            this.Y.f33845r.clearFocus();
                            return false;
                        }
                    } else {
                        rw rwVar2 = this.A0;
                        if (rwVar2 != null && rwVar2.getVisibility() == 0 && !this.j3) {
                            rw rwVar3 = this.A0;
                            if (!rwVar3.P && !this.f46708o3) {
                                ArrayList arrayList = rwVar3.h;
                                if (!arrayList.isEmpty() && rwVar3.M != ((org.telegram.ui.Components.mz) arrayList.get(0)).f37668a) {
                                    if (z10) {
                                        rw rwVar4 = this.A0;
                                        ArrayList arrayList2 = rwVar4.h;
                                        if (!arrayList2.isEmpty()) {
                                            rwVar4.g((org.telegram.ui.Components.mz) arrayList2.get(0), 0);
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        nv nvVar = this.D1;
                        if (nvVar != null && nvVar.O0()) {
                            if (z10) {
                                this.D1.G0(true);
                            }
                        } else {
                            tv tvVar = this.F0;
                            if (tvVar.P == 0 && tvVar.T.L0() != 0) {
                                tvVar.h.y0(0);
                                return false;
                            }
                            return super.onBackPressed(z10);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        uv uvVar;
        rw rwVar;
        if (this.X1) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.o(true);
            }
            TLObject tLObject = this.Z1;
            if (tLObject != null) {
                kw kwVar = this.D0;
                if (kwVar != null) {
                    kwVar.f39185e0.Q(this.Y1, tLObject);
                }
                this.Z1 = null;
            }
            this.X1 = false;
        }
        if (!this.L && (rwVar = this.A0) != null && rwVar.getVisibility() == 0 && this.f46719r.f57658f) {
            int i7 = (int) (-this.O);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (i7 != 0 && i7 != currentActionBarHeight && i7 >= currentActionBarHeight / 2) {
                this.f46663f0[0].f46298a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.f46764z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        if (!isInPreviewMode() && (uvVar = this.L0) != null && uvVar.getVisibility() == 0) {
            this.L0.setVisibility(8);
            this.L0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        N3();
        this.f46726s0 = true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        hi.m3 m3Var;
        super.onBecomeFullyVisible();
        if (t4()) {
            SharedPreferences g12 = org.telegram.messenger.mp.g1();
            boolean z10 = g12.getBoolean("archivehint", true);
            boolean isEmpty = d4(this.currentAccount, this.T0, this.Y2, false).isEmpty();
            if (z10 && isEmpty) {
                org.telegram.messenger.mp.g1().edit().putBoolean("archivehint", false).commit();
                z10 = false;
            }
            if (z10) {
                g12.edit().putBoolean("archivehint", false).commit();
                a5();
            }
        }
        if (this.f46726s0 && !this.f46731t0 && (m3Var = this.f46714q0) != null && this.P3) {
            this.f46731t0 = true;
            this.f46726s0 = false;
            m3Var.x();
        }
        org.telegram.messenger.g0.h3(new zu(this, 0), 200L);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.y60 y60Var = this.M0;
        if (y60Var != null) {
            y60Var.v();
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.u1 u1Var;
        super.onDialogDismiss(dialog);
        if (this.Y2 == 0 && this.f46638a3 == 0 && (u1Var = this.V1) != null && dialog == u1Var && getParentActivity() != null) {
            u3(false);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i7;
        boolean z10;
        super.onFragmentCreate();
        Bundle bundle = this.arguments;
        int i10 = 0;
        if (bundle != null) {
            this.f46702n2 = bundle.getBoolean("onlySelect", false);
            this.f46707o2 = this.arguments.getBoolean("canSelectTopics", false);
            this.f46728s2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.T0 = this.arguments.getInt("dialogsType", 0);
            this.P0 = this.arguments.getBoolean("quote", false);
            this.O0 = this.arguments.getBoolean("reply_to", false);
            this.Q0 = this.arguments.getLong("reply_to_author", 0L);
            this.R0 = this.arguments.getLong("reply_to_channel_direct", 0L);
            this.S0 = this.arguments.getLong("forward_into_channel", 0L);
            this.f46675h2 = this.arguments.getString("selectAlertString");
            this.f46680i2 = this.arguments.getString("selectAlertStringGroup");
            this.f46685j2 = this.arguments.getString("addToGroupAlertString");
            this.f46733t2 = this.arguments.getBoolean("allowSwitchAccount");
            this.f46738u2 = this.arguments.getBoolean("checkCanWrite", true);
            this.f46743v2 = this.arguments.getBoolean("afterSignup", false);
            this.Y2 = this.arguments.getInt("folderId", 0);
            long j3 = this.arguments.getLong("community_id", 0L);
            this.f46638a3 = j3;
            if (j3 != 0) {
                this.f46644b3 = getMessagesController().O0(Long.valueOf(this.f46638a3));
                this.f46650c3 = getMessagesController().P0(this.f46638a3);
            }
            this.f46689k2 = this.arguments.getBoolean("resetDelegate", true);
            this.U0 = this.arguments.getInt("messagesCount", 0);
            this.V0 = this.arguments.getInt("hasPoll", 0);
            this.W0 = this.arguments.getBoolean("hasInvoice", false);
            this.f46749w2 = this.arguments.getBoolean("showSetPasswordConfirm", this.f46749w2);
            this.arguments.getInt("otherwiseRelogin");
            this.f46755x2 = this.arguments.getBoolean("allowGroups", true);
            this.f46761y2 = this.arguments.getBoolean("allowMegagroups", true);
            this.f46766z2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.A2 = this.arguments.getBoolean("allowChannels", true);
            this.B2 = this.arguments.getBoolean("allowUsers", true);
            this.C2 = this.arguments.getBoolean("allowBots", true);
            this.D2 = this.arguments.getBoolean("closeFragment", true);
            this.G = this.arguments.getBoolean("allowGlobalSearch", true);
            this.X = this.arguments.getBoolean("hasMainTabs", false);
            byte[] byteArray = this.arguments.getByteArray("requestPeerType");
            if (byteArray != null) {
                try {
                    SerializedData serializedData = new SerializedData(byteArray);
                    this.H = TLRPC.RequestPeerType.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    serializedData.cleanup();
                } catch (Exception unused) {
                }
            }
            this.I = this.arguments.getLong("requestPeerBotId", 0L);
        }
        if (this.T0 == 0) {
            this.W1 = org.telegram.messenger.mp.h1().getBoolean("askAboutContacts", true);
            org.telegram.messenger.bz.u();
        }
        org.telegram.messenger.ks notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        this.L3 = new xi.e(notificationCenter, this);
        if (this.f46711p2 == null) {
            this.f46665f2 = getConnectionsManager().getConnectionState();
            this.L3.f(org.telegram.messenger.ks.f25148l4);
            if (!this.f46702n2) {
                this.L3.f(org.telegram.messenger.ks.L4);
                this.L3.f(org.telegram.messenger.ks.D4);
                this.L3.c(org.telegram.messenger.ks.R2);
                this.L3.c(org.telegram.messenger.ks.d2);
            }
            xi.e eVar = this.L3;
            eVar.c(org.telegram.messenger.ks.f25184s);
            eVar.c(org.telegram.messenger.ks.O2);
            eVar.c(org.telegram.messenger.ks.P2);
            eVar.c(org.telegram.messenger.ks.Q2);
            eVar.c(org.telegram.messenger.ks.f25177r);
            eVar.c(org.telegram.messenger.ks.Y);
            eVar.c(org.telegram.messenger.ks.O);
            eVar.c(org.telegram.messenger.ks.I2);
            eVar.c(org.telegram.messenger.ks.f25122h0);
            eVar.c(org.telegram.messenger.ks.f25110f0);
            eVar.c(org.telegram.messenger.ks.J);
            eVar.c(org.telegram.messenger.ks.K);
            eVar.c(org.telegram.messenger.ks.M);
            eVar.c(org.telegram.messenger.ks.P0);
            eVar.c(org.telegram.messenger.ks.f25185s0);
            eVar.c(org.telegram.messenger.ks.f25196t5);
            eVar.c(org.telegram.messenger.ks.S0);
            eVar.c(org.telegram.messenger.ks.T1);
            eVar.c(org.telegram.messenger.ks.f25109e5);
            eVar.c(org.telegram.messenger.ks.K2);
            eVar.c(org.telegram.messenger.ks.f25099d0);
            eVar.c(org.telegram.messenger.ks.f25186s1);
            eVar.c(org.telegram.messenger.ks.f25092b5);
            eVar.c(org.telegram.messenger.ks.f25098c5);
            eVar.c(org.telegram.messenger.ks.N);
            eVar.c(org.telegram.messenger.ks.f25170p5);
            eVar.c(org.telegram.messenger.ks.f25133i5);
            this.L3.f(org.telegram.messenger.ks.f25155n0);
        }
        xi.e eVar2 = this.L3;
        eVar2.c(org.telegram.messenger.ks.f25210w);
        eVar2.c(org.telegram.messenger.ks.V4);
        eVar2.c(org.telegram.messenger.ks.f25103d5);
        eVar2.c(org.telegram.messenger.ks.T);
        eVar2.c(org.telegram.messenger.ks.O4);
        eVar2.c(org.telegram.messenger.ks.f25216w5);
        eVar2.c(org.telegram.messenger.ks.f25230y5);
        eVar2.c(org.telegram.messenger.ks.f25090b3);
        eVar2.c(org.telegram.messenger.ks.f25113f3);
        eVar2.c(org.telegram.messenger.ks.f25138j5);
        eVar2.c(org.telegram.messenger.ks.A3);
        eVar2.c(org.telegram.messenger.ks.C3);
        eVar2.c(org.telegram.messenger.ks.V5);
        eVar2.c(org.telegram.messenger.ks.W5);
        eVar2.c(org.telegram.messenger.ks.S3);
        eVar2.c(org.telegram.messenger.ks.T3);
        if (this.T0 == 0) {
            this.L3.c(org.telegram.messenger.ks.C5);
            this.L3.c(org.telegram.messenger.ks.P1);
        }
        z4(getAccountInstance());
        fi.p6 R1 = getMessagesController().R1();
        if (!R1.A) {
            R1.W();
            if (!R1.f12398s) {
                ConnectionsManager.getInstance(R1.f12382a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new fi.n5(R1, 0));
            }
        }
        getMessagesController().h3(this.Y2);
        if (this.V3 != null && !getMessagesStorage().R) {
            rt rtVar = this.V3;
            if (rtVar.getParent() != null) {
                ((ViewGroup) rtVar.getParent()).removeView(rtVar);
            }
            this.V3 = null;
        }
        if (t4()) {
            fi.p6 R12 = getMessagesController().R1();
            if (R12.f12404z) {
                R12.T(true);
            }
        } else {
            getMessagesController().R1().W();
        }
        getContactsController().B();
        if (getMessagesController().f25751r6) {
            org.telegram.messenger.pv I1 = getMessagesController().I1();
            if (!I1.f26296e) {
                I1.g(true);
            }
        }
        if (this.f46638a3 != 0) {
            getMessagesController().b3(0, this.f46638a3, true);
        }
        org.telegram.messenger.v1 a10 = org.telegram.messenger.v1.a(this.currentAccount);
        if (!a10.f27316e) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = a10.f27314b;
            if (j10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                long j11 = currentTimeMillis - j10;
                boolean z11 = org.telegram.messenger.s2.f26721a;
                if (j11 > 43200000) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(a10.f27314b);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(currentTimeMillis);
                if (calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
            if (z10) {
                a10.f27316e = true;
                ConnectionsManager.getInstance(a10.f27313a).sendRequest(new TL_account.getBirthdays(), new org.telegram.messenger.s1(a10, 0));
            }
        }
        if (this.X) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i7 = 0;
        }
        this.f46699m4 = i7;
        if (this.X) {
            i10 = org.telegram.messenger.g0.L(64.0f);
        }
        this.f46704n4 = i10;
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        org.telegram.messenger.g0.r(this.R3);
        super.onFragmentDestroy();
        xi.e eVar = this.L3;
        if (eVar != null) {
            eVar.b();
            this.L3 = null;
        }
        nv nvVar = this.D1;
        if (nvVar != null) {
            nvVar.Y0();
        }
        org.telegram.ui.Components.cp0 cp0Var = this.I2;
        if (cp0Var != null) {
            cp0Var.j();
        }
        vs vsVar = this.J2;
        if (vsVar != null) {
            org.telegram.messenger.g0.r(vsVar);
            this.J2 = null;
        }
        UndoView undoView = this.f46764z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f46723r3.e();
        this.E2 = null;
        int i7 = org.telegram.ui.Components.o10.f37932m1;
    }

    @Override
    public final void onPanTranslationUpdate(float f10) {
        if (this.f46663f0 != null) {
            this.K0 = f10;
            nv nvVar = this.D1;
            int i7 = 0;
            if (nvVar != null && nvVar.O0()) {
                this.fragmentView.setTranslationY(f10);
                while (true) {
                    bx[] bxVarArr = this.f46663f0;
                    if (i7 >= bxVarArr.length) {
                        break;
                    }
                    bxVarArr[i7].setTranslationY(0.0f);
                    i7++;
                }
                if (!this.f46702n2) {
                    this.actionBar.setTranslationY(0.0f);
                    org.telegram.ui.Components.gc gcVar = this.f46717q3;
                    if (gcVar != null) {
                        gcVar.l();
                    }
                }
                kw kwVar = this.D0;
                if (kwVar != null) {
                    kwVar.setTranslationY(this.J0);
                    return;
                }
                return;
            }
            while (true) {
                bx[] bxVarArr2 = this.f46663f0;
                if (i7 >= bxVarArr2.length) {
                    break;
                }
                bxVarArr2[i7].setTranslationY(f10);
                i7++;
            }
            if (!this.f46702n2) {
                this.actionBar.setTranslationY(f10);
                org.telegram.ui.Components.gc gcVar2 = this.f46717q3;
                if (gcVar2 != null) {
                    gcVar2.l();
                }
            }
            kw kwVar2 = this.D0;
            if (kwVar2 != null) {
                kwVar2.setTranslationY(this.K0 + this.J0);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.gc gcVar = this.T;
        if (gcVar != null) {
            gcVar.b();
            this.T = null;
        }
        xv xvVar = this.H3;
        if (xvVar != null) {
            xvVar.f54294r = true;
            ew ewVar = xvVar.f54288a;
            if (ewVar != null) {
                ewVar.onPause();
            }
        }
        org.telegram.ui.Components.y60 y60Var = this.M0;
        if (y60Var != null) {
            y60Var.v();
        }
        nv nvVar = this.D1;
        if (nvVar != null) {
            nvVar.a1();
        }
        int i7 = 0;
        UndoView undoView = this.f46764z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        setBulletinDelegate(null);
        if (this.f46663f0 == null) {
            return;
        }
        while (true) {
            bx[] bxVarArr = this.f46663f0;
            if (i7 < bxVarArr.length) {
                bxVarArr[i7].d.getClass();
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        org.telegram.messenger.b9 b9Var;
        if (i7 == 1) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (iArr.length > i10) {
                    String str = strArr[i10];
                    str.getClass();
                    char c10 = 65535;
                    switch (str.hashCode()) {
                        case -1925850455:
                            if (str.equals("android.permission.POST_NOTIFICATIONS")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 1365911975:
                            if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 1977429404:
                            if (str.equals("android.permission.READ_CONTACTS")) {
                                c10 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            if (iArr[i10] == 0) {
                                org.telegram.messenger.xs.t(this.currentAccount).Y();
                                break;
                            } else {
                                jh0.J0();
                                continue;
                            }
                        case 1:
                            if (iArr[i10] == 0) {
                                org.telegram.messenger.ec.D().i(null);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (iArr[i10] == 0) {
                                org.telegram.messenger.g0.g3(new gu(this, 29));
                                getContactsController().l();
                                continue;
                            } else {
                                SharedPreferences.Editor edit = org.telegram.messenger.mp.h1().edit();
                                this.W1 = false;
                                edit.putBoolean("askAboutContacts", false).commit();
                                break;
                            }
                    }
                }
            }
            if (this.B0) {
                this.B0 = false;
                d5();
            }
        } else if (i7 == 4) {
            for (int i11 : iArr) {
                if (i11 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 30 && (b9Var = FilesMigrationService.f22614e) != null) {
                b9Var.J0();
            }
        }
    }

    @Override
    public final void onResume() {
        boolean z10;
        bx bxVar;
        kv kvVar;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.Components.km0 km0Var;
        uv uvVar;
        super.onResume();
        tv tvVar = this.F0;
        char c10 = 0;
        if (tvVar != null) {
            ArrayList arrayList = tvVar.f12442y;
            fi.p6 p6Var = tvVar.f12433s;
            p6Var.l(p6Var.f12387g);
            p6Var.l(p6Var.h);
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                TL_stories.PeerStories y10 = p6Var.y(((fi.n) arrayList.get(i7)).f12279c);
                if (y10 != null) {
                    p6Var.a0(y10);
                }
            }
        }
        xv xvVar = this.H3;
        if (xvVar != null) {
            xvVar.f54294r = false;
            ew ewVar = xvVar.f54288a;
            if (ewVar != null) {
                ewVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (uvVar = this.L0) != null && uvVar.getVisibility() == 0) {
            this.L0.setVisibility(8);
            this.L0.setBackground(null);
        }
        if (this.f46663f0 != null) {
            int i10 = 0;
            while (true) {
                bx[] bxVarArr = this.f46663f0;
                if (i10 >= bxVarArr.length) {
                    break;
                }
                bxVarArr[i10].d.f();
                i10++;
            }
        }
        if (this.Q3) {
            this.Q3 = false;
            getMessagesController().f5(null);
            if (this.f46663f0 != null) {
                int i11 = 0;
                while (true) {
                    bx[] bxVarArr2 = this.f46663f0;
                    if (i11 >= bxVarArr2.length) {
                        break;
                    }
                    bxVarArr2[i11].d.f();
                    i11++;
                }
            }
        }
        C5(-1, false);
        nv nvVar = this.D1;
        if (nvVar != null) {
            nvVar.b1();
        }
        long j3 = 0;
        if (!this.f46702n2 && this.Y2 == 0 && this.f46638a3 == 0) {
            getMediaDataController().D(4);
        }
        kw kwVar = this.D0;
        if (kwVar != null && (km0Var = kwVar.f39185e0) != null) {
            km0Var.f();
        }
        if (!this.f46743v2 && getUserConfig().f24773a0 != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.Y2 == 0 && this.f46638a3 == 0 && this.f46659e2 && !this.f46702n2) {
            int i12 = Build.VERSION.SDK_INT;
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.f46659e2 = false;
                if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i12 <= 28 || org.telegram.messenger.s2.f26722b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i12 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                org.telegram.messenger.k4 k4Var = new org.telegram.messenger.k4(this, z13, z11, z12, parentActivity);
                if (this.f46743v2 && (z11 || z13)) {
                    j3 = 4000;
                }
                org.telegram.messenger.g0.h3(k4Var, j3);
            }
        } else if (!this.f46702n2 && this.Y2 == 0 && this.f46638a3 == 0 && org.telegram.messenger.c6.i() && !org.telegram.messenger.c6.g()) {
            if (getParentActivity() != null) {
                if (!org.telegram.messenger.mp.h1().getBoolean("askedAboutMiuiLockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i13 = org.telegram.ui.ActionBar.n6.L5;
                    alertDialog$Builder.m(2131624116, 72, getThemedColor(i13), null);
                    alertDialog$Builder.n(i13, getResourceProvider());
                    String M0 = org.telegram.messenger.gd.M0(2131747105, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                    u1Var.U = M0;
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747107, null), new ju(this, 10));
                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131751761, null), new org.telegram.ui.Components.wb0(24));
                    showDialog(u1Var);
                }
            } else {
                return;
            }
        } else if (this.Y2 == 0 && this.f46638a3 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
            if (getParentActivity() != null) {
                if (!org.telegram.messenger.mp.h1().getBoolean("askedAboutFSILockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    int i14 = org.telegram.ui.ActionBar.n6.L5;
                    alertDialog$Builder2.m(2131624116, 72, getThemedColor(i14), null);
                    alertDialog$Builder2.n(i14, getResourceProvider());
                    String M02 = org.telegram.messenger.gd.M0(2131747121, null);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f28744a;
                    u1Var2.U = M02;
                    alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131747107, null), new ju(this, 11));
                    alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131751761, null), new org.telegram.ui.Components.wb0(25));
                    showDialog(u1Var2);
                }
            } else {
                return;
            }
        }
        d5();
        if (this.f46663f0 != null) {
            int i15 = 0;
            while (true) {
                bx[] bxVarArr3 = this.f46663f0;
                if (i15 >= bxVarArr3.length) {
                    break;
                }
                bx bxVar2 = bxVarArr3[i15];
                if (bxVar2.f46305s == 0 && bxVar2.f46306w == 2 && bxVar2.f46300c.L0() == 0 && n4()) {
                    this.f46663f0[i15].f46300c.h1(1, (int) this.O);
                }
                if (i15 == 0) {
                    this.f46663f0[i15].d.getClass();
                } else {
                    this.f46663f0[i15].d.getClass();
                }
                i15++;
            }
        }
        f5();
        setBulletinDelegate(new y8(this, 4));
        if (this.f46729s3) {
            org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        }
        D5(0, false);
        u5(false, true);
        B5(false);
        D3();
        N3();
        if (this.A0 != null && (bxVar = this.f46663f0[0]) != null && (kvVar = bxVar.d) != null) {
            int i16 = kvVar.h;
            if (i16 == 7 || i16 == 8) {
                org.telegram.messenger.ro[] roVarArr = getMessagesController().N;
                if (i16 != 7) {
                    c10 = 1;
                }
                org.telegram.messenger.ro roVar = roVarArr[c10];
                if (roVar != null) {
                    this.A0.i(roVar.f26684o);
                }
            }
        }
    }

    @Override
    public final void onSlideProgress(boolean z10, float f10) {
        if (org.telegram.messenger.bz.o() <= 0) {
            boolean z11 = org.telegram.messenger.s2.f26721a;
        } else if (this.f46655d4 && this.f46661e4 == null) {
            Z4(f10);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.f46674h1.setColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29394d6));
            y3();
            p5();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        uv uvVar;
        cx cxVar;
        xv xvVar = this.H3;
        if (xvVar != null && xvVar.c()) {
            this.H3.getFragment().onTransitionAnimationEnd(z10, z11);
        } else {
            if (z10 && (uvVar = this.L0) != null && uvVar.getVisibility() == 0) {
                this.L0.setVisibility(8);
                this.L0.setBackground(null);
            }
            if (z10 && this.f46743v2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).f43108w0.c(false);
                }
            }
        }
        if (!z10 && (cxVar = this.Z2) != null) {
            cxVar.removeSelfFromStack();
        }
        N3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        xv xvVar = this.H3;
        if (xvVar != null && xvVar.c()) {
            this.H3.getFragment().onTransitionAnimationProgress(z10, f10);
        } else {
            uv uvVar = this.L0;
            if (uvVar != null && uvVar.getVisibility() == 0) {
                if (z10) {
                    this.L0.setAlpha(1.0f - f10);
                } else {
                    this.L0.setAlpha(f10);
                }
            }
        }
        N3();
    }

    public final void p4(boolean z10) {
        int i7;
        boolean z11;
        this.actionBar.x();
        this.K2.clear();
        org.telegram.ui.ActionBar.y1 y1Var = this.f46669g1;
        boolean z12 = true;
        if (y1Var != null) {
            y1Var.c(true, 0.0f);
        }
        rw rwVar = this.A0;
        if (rwVar != null) {
            rwVar.c(org.telegram.ui.ActionBar.n6.K8, org.telegram.ui.ActionBar.n6.I8, org.telegram.ui.ActionBar.n6.J8, org.telegram.ui.ActionBar.n6.L8, org.telegram.ui.ActionBar.n6.f29394d6);
        }
        ValueAnimator valueAnimator = this.f46756x3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f46756x3 = null;
        }
        if (this.f46750w3 == 0.0f) {
            return;
        }
        W4(-f4());
        boolean z13 = false;
        int i10 = 0;
        while (true) {
            bx[] bxVarArr = this.f46663f0;
            if (i10 >= bxVarArr.length) {
                break;
            }
            bx bxVar = bxVarArr[i10];
            if (bxVar != null) {
                bxVar.f46298a.I0(true);
            }
            i10++;
        }
        if (this.L) {
            i7 = 81;
        } else {
            i7 = 0;
        }
        float max = Math.max(0.0f, org.telegram.messenger.g0.L(i7 + 48) + this.O);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f46750w3, 0.0f);
        this.f46756x3 = ofFloat;
        ofFloat.addUpdateListener(new ku(this, max, 1));
        this.f46756x3.addListener(new fw(this, max, 0));
        this.f46756x3.setInterpolator(org.telegram.ui.Components.lr.f37208f);
        this.f46756x3.setDuration(200L);
        this.f46756x3.start();
        this.f46636a1 = false;
        ArrayList arrayList = this.f46648c1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                org.telegram.messenger.ro roVar = (org.telegram.messenger.ro) arrayList.get(i11);
                kz.z0(roVar, roVar.f26677g, roVar.f26673b, roVar.f26674c, roVar.f26683n, roVar.f26682m, roVar.h, roVar.f26678i, roVar.f26679j, false, false, true, true, false, this, null);
                i11++;
                arrayList = arrayList;
                size = size;
                z13 = false;
                z12 = true;
                obj = null;
            }
            arrayList.clear();
        }
        if (this.f46642b1) {
            getMessagesController().u4(this.Y2, 0L, null);
            z11 = 0;
            this.f46642b1 = false;
        } else {
            z11 = 0;
        }
        n5(true);
        if (this.f46663f0 != null) {
            int i12 = z11;
            while (true) {
                bx[] bxVarArr2 = this.f46663f0;
                if (i12 >= bxVarArr2.length) {
                    break;
                }
                bxVarArr2[i12].d.I = z11;
                i12++;
            }
        }
        int i13 = org.telegram.messenger.mp.I8;
        int i14 = z11;
        if (z10) {
            i14 = 8192;
        }
        D5(i14 | 196608, true);
    }

    public final void p5() {
        di.b1 b1Var;
        yw ywVar;
        boolean z10;
        int i7;
        try {
            nv nvVar = this.D1;
            if (nvVar != null && nvVar.getEditField() != null) {
                this.D1.getEditField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.n6.Ne));
            }
            NumberTextView numberTextView = this.f46684j1;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29788y8));
            }
            rw rwVar = this.A0;
            int i10 = 0;
            if (rwVar != null && (rwVar.getSelectorDrawable() instanceof GradientDrawable)) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null && kVar.y()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                GradientDrawable gradientDrawable = (GradientDrawable) this.A0.getSelectorDrawable();
                if (z10) {
                    i7 = org.telegram.ui.ActionBar.n6.f29778xi;
                } else {
                    i7 = org.telegram.ui.ActionBar.n6.K8;
                }
                gradientDrawable.setColor(getThemedColor(i7));
                this.A0.invalidate();
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                if (this.Y2 != 0 || this.f46638a3 != 0) {
                    kVar2.M(getThemedColor(org.telegram.ui.ActionBar.n6.Q8), false);
                    this.actionBar.M(getThemedColor(org.telegram.ui.ActionBar.n6.R8), true);
                }
                if (this.actionBar.y()) {
                    this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29394d6));
                }
                v5();
            }
            if (this.f46663f0 != null) {
                while (true) {
                    bx[] bxVarArr = this.f46663f0;
                    if (i10 >= bxVarArr.length) {
                        break;
                    }
                    bx bxVar = bxVarArr[i10];
                    if (bxVar != null && (ywVar = bxVar.f46298a) != null) {
                        ywVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29394d6));
                    }
                    i10++;
                }
            }
            kw kwVar = this.D0;
            if (kwVar != null && (b1Var = kwVar.f39182b0) != null) {
                b1Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29394d6));
            }
            oi.u1 u1Var = this.E1;
            if (u1Var != null) {
                u1Var.setScrimViewBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29394d6));
            }
            hi.m3 m3Var = this.f46714q0;
            if (m3Var != null) {
                m3Var.j(getThemedColor(org.telegram.ui.ActionBar.n6.wj));
            }
            hi.m3 m3Var2 = this.f46720r0;
            if (m3Var2 != null) {
                m3Var2.j(getThemedColor(org.telegram.ui.ActionBar.n6.wj));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.f46655d4 = true;
            V4(true);
            return;
        }
        this.f46661e4 = null;
        this.f46655d4 = false;
        V4(false);
        Z4(1.0f);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.h2 h2Var) {
        boolean presentFragment = super.presentFragment(h2Var);
        if (presentFragment && this.f46663f0 != null) {
            int i7 = 0;
            while (true) {
                bx[] bxVarArr = this.f46663f0;
                if (i7 >= bxVarArr.length) {
                    break;
                }
                bxVarArr[i7].d.getClass();
                i7++;
            }
        }
        hi.m3 m3Var = this.f46714q0;
        if (m3Var != null) {
            m3Var.f(true);
        }
        hi.m3 m3Var2 = this.f46720r0;
        if (m3Var2 != null) {
            m3Var2.f(true);
        }
        org.telegram.ui.Components.gc.e();
        return presentFragment;
    }

    public final void q4(boolean z10) {
        if (this.H3.c()) {
            z10 = true;
        }
        if (!z10 || !this.d2) {
            this.Y3 = z10;
            t5(true);
            if (z10) {
                hi.m3 m3Var = this.f46714q0;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                hi.m3 m3Var2 = this.f46720r0;
                if (m3Var2 != null) {
                    m3Var2.f(true);
                }
            }
        }
    }

    public final void q5(boolean r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cx.q5(boolean, boolean):void");
    }

    public final void r5(boolean r11, java.util.ArrayList r12, java.util.ArrayList r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cx.r5(boolean, java.util.ArrayList, java.util.ArrayList, boolean, boolean):void");
    }

    public final boolean s3(long j3, View view) {
        if (this.f46702n2 && getMessagesController().y2(j3)) {
            return false;
        }
        Long valueOf = Long.valueOf(j3);
        ArrayList arrayList = this.K2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j3));
            if (view instanceof org.telegram.ui.Cells.u2) {
                ((org.telegram.ui.Cells.u2) view).c0(false, true);
            } else if (view instanceof org.telegram.ui.Cells.h6) {
                ((org.telegram.ui.Cells.h6) view).w(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j3));
        if (view instanceof org.telegram.ui.Cells.u2) {
            ((org.telegram.ui.Cells.u2) view).c0(true, true);
        } else if (view instanceof org.telegram.ui.Cells.h6) {
            ((org.telegram.ui.Cells.h6) view).w(true, true);
        }
        return true;
    }

    public final boolean s4() {
        if (this.A0 != null && this.T0 == 0 && !this.f46702n2 && this.Y2 == 0 && this.f46638a3 == 0 && getMessagesController().q2()) {
            return true;
        }
        return false;
    }

    public final void s5() {
        float f10 = (((-this.f46691k4) - this.f46704n4) - this.f46748w1) - this.f46754x1;
        org.telegram.ui.Components.a10 a10Var = this.f46736u0;
        if (a10Var != null) {
            a10Var.setTranslationY(f10);
        }
        org.telegram.ui.Components.a10 a10Var2 = this.f46741v0;
        if (a10Var2 != null) {
            a10Var2.setTranslationY(f10 - org.telegram.messenger.g0.L(52.0f));
            hi.m3 m3Var = this.f46714q0;
            if (m3Var != null) {
                m3Var.setTranslationY(f10 - org.telegram.messenger.g0.L(52.0f));
            }
        }
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        tv tvVar = this.F0;
        if (tvVar != null) {
            if (this.H0 && !z10) {
                tvVar.setVisibility(0);
            } else {
                tvVar.setVisibility(8);
            }
        }
        t5(true);
        o5();
    }

    @Override
    public final void setTitleOverlayText(java.lang.String r6, int r7, java.lang.Runnable r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cx.setTitleOverlayText(java.lang.String, int, java.lang.Runnable):void");
    }

    public final void t3(jg.o0 o0Var) {
        kw kwVar;
        if (this.f46729s3 && (kwVar = this.D0) != null) {
            ArrayList arrayList = kwVar.D0;
            if (!arrayList.isEmpty()) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    if (o0Var.b((jg.o0) arrayList.get(i7))) {
                        return;
                    }
                }
            }
            arrayList.add(o0Var);
            qw qwVar = this.Y;
            ArrayList arrayList2 = qwVar.G;
            arrayList2.add(o0Var);
            qwVar.J = arrayList2.size() - 1;
            qwVar.e();
            this.Y.f33845r.getText().clear();
            r5(true, null, null, false, true);
        }
    }

    public final boolean t4() {
        if (this.Y2 == 1) {
            return true;
        }
        return false;
    }

    public final void t5(boolean z10) {
        boolean z11;
        boolean z12 = this.f46702n2;
        if ((!z12 || this.T0 == 10) && this.Y2 == 0 && this.f46638a3 == 0 && !this.inPreviewMode && ((!this.f46693l2 || z12) && !this.Y3)) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.a10 a10Var = this.f46736u0;
        if (a10Var != null) {
            a10Var.e(z11, z10);
        }
        org.telegram.ui.Components.a10 a10Var2 = this.f46741v0;
        if (a10Var2 != null) {
            a10Var2.e(z11, z10);
        }
    }

    public final void u3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            ArrayList arrayList = new ArrayList();
            if (this.Y2 == 0 && this.f46638a3 == 0 && Build.VERSION.SDK_INT >= 33 && jh0.K0(parentActivity)) {
                if (z10) {
                    showDialog(new jh0(parentActivity, !c8.na.a(), new su(parentActivity, 1)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            if (getUserConfig().V && this.W1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z10) {
                    org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.b5.v(parentActivity, new xu(this, 0)).f28744a;
                    this.V1 = u1Var;
                    showDialog(u1Var);
                    return;
                }
                arrayList.add("android.permission.READ_CONTACTS");
                arrayList.add("android.permission.WRITE_CONTACTS");
                arrayList.add("android.permission.GET_ACCOUNTS");
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 33) {
                if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                }
                if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                }
                if (parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                }
            } else if ((i7 <= 28 || org.telegram.messenger.s2.f26722b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
            if (arrayList.isEmpty()) {
                if (this.B0) {
                    this.B0 = false;
                    d5();
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

    public final boolean u4(long j3) {
        if (j3 < 0) {
            return false;
        }
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(j3));
        if (!org.telegram.messenger.o10.v(c22)) {
            return false;
        }
        ArrayList l10 = org.telegram.messenger.mp.u1(this.currentAccount).f25769t7.l(-c22.f28552id);
        if ((l10 != null && !l10.isEmpty()) || !org.telegram.messenger.mp.u1(this.currentAccount).f25769t7.e(-c22.f28552id)) {
            return false;
        }
        return true;
    }

    public final void u5(boolean z10, boolean z11) {
        boolean z12;
        int i7;
        if (this.f46705o0 != null) {
            org.telegram.ui.ActionBar.r0 r0Var = this.f46701n0;
            if (r0Var == null || r0Var.getVisibility() != 0) {
                boolean z13 = false;
                int i10 = 0;
                while (true) {
                    if (i10 < getDownloadController().H.size()) {
                        if (getFileLoader().S(((org.telegram.messenger.fj) getDownloadController().H.get(i10)).S0())) {
                            z12 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z12 = false;
                        break;
                    }
                }
                if (getDownloadController().J.size() <= 0 && !z12 && (this.f46673h0.getVisibility() != 0 || this.f46673h0.getAlpha() != 1.0f || z11)) {
                    this.f46683j0 = false;
                } else {
                    this.f46683j0 = true;
                }
                J3();
                boolean z14 = org.telegram.messenger.t0.f26913b.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i11 = this.f46665f2;
                if (i11 == 3 || i11 == 5) {
                    z13 = true;
                }
                org.telegram.ui.ActionBar.z0 z0Var = this.f46709p0;
                if (z14) {
                    if (z13) {
                        i7 = 2131748416;
                    } else {
                        i7 = 2131748415;
                    }
                } else {
                    i7 = 2131748414;
                }
                z0Var.setSubtext(org.telegram.messenger.gd.M0(i7, null));
                this.f46705o0.b(z14, z13, z10);
            }
        }
    }

    @Override
    public final void v() {
        R4(true, true);
    }

    public final void v3(CharSequence charSequence) {
        int i7;
        if (this.D1 != null) {
            if (this.F2 == null && this.G2 == null && this.H2 == null) {
                return;
            }
            if (this.I2 == null) {
                org.telegram.ui.Components.cp0 cp0Var = new org.telegram.ui.Components.cp0(getParentActivity(), getResourceProvider());
                this.I2 = cp0Var;
                cp0Var.setLayoutClickListener(new iu(this, 0));
                this.I2.setOnModeChangeListener(new ju(this, 0));
                nv nvVar = this.D1;
                org.telegram.ui.Components.cp0 cp0Var2 = this.I2;
                if (cp0Var2 == null) {
                    nvVar.getClass();
                } else {
                    nvVar.f32692u2 = cp0Var2;
                    nvVar.addView(cp0Var2, 0, c8.ma.e(-1, 48, 51));
                    nvVar.U3 = false;
                    nvVar.S();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.I2.getLayoutParams();
                layoutParams.rightMargin = -this.D1.getPaddingRight();
                this.I2.setLayoutParams(layoutParams);
            }
            if (o4()) {
                this.I2.i(this.currentAccount, this.F2);
            } else {
                String str = this.G2;
                if (str != null) {
                    org.telegram.ui.Components.cp0 cp0Var3 = this.I2;
                    cp0Var3.g(this.currentAccount);
                    if (!str.isEmpty()) {
                        cp0Var3.e(str, true);
                    }
                } else {
                    CharSequence charSequence2 = this.H2;
                    if (charSequence2 != null) {
                        org.telegram.ui.Components.cp0 cp0Var4 = this.I2;
                        cp0Var4.g(this.currentAccount);
                        if (charSequence2.length() > 0) {
                            cp0Var4.e(charSequence2, true);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.D1.setFieldText(charSequence);
            }
            nv nvVar2 = this.D1;
            if (o4()) {
                i7 = 2131754452;
            } else {
                i7 = 2131745267;
            }
            nvVar2.setOverrideHint(org.telegram.messenger.gd.M0(i7, null));
            H3();
            if (this.I2.getMode() != 0) {
                this.D1.Y1(false, false);
            }
            x5();
        }
    }

    public final boolean v4(TLRPC.Dialog dialog) {
        char c10;
        if (dialog == null) {
            return false;
        }
        int i7 = this.f46663f0[0].f46305s;
        org.telegram.messenger.ro roVar = null;
        if ((i7 == 7 || i7 == 8) && (!this.actionBar.y() || this.actionBar.z(null))) {
            org.telegram.messenger.ro[] roVarArr = getMessagesController().N;
            if (this.f46663f0[0].f46305s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            roVar = roVarArr[c10];
        }
        if (roVar != null) {
            if (roVar.f26679j.indexOfKey(dialog.f28407id) < 0) {
                return false;
            }
            return true;
        }
        return dialog.pinned;
    }

    public final void v5() {
        int i7;
        int i10;
        if (this.f46739u3 && this.actionBar != null) {
            if (this.Y2 == 0 && this.f46638a3 == 0) {
                i7 = org.telegram.ui.ActionBar.n6.f29731v8;
            } else {
                i7 = org.telegram.ui.ActionBar.n6.O8;
            }
            int themedColor = getThemedColor(i7);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.n6.f29788y8;
            kVar.I(i0.a.f(this.f46765z1, themedColor, getThemedColor(i11)), false);
            this.actionBar.I(i0.a.f(this.f46765z1, getThemedColor(i11), getThemedColor(i11)), true);
            if (this.Y2 == 0 && this.f46638a3 == 0) {
                i10 = org.telegram.ui.ActionBar.n6.f29692t8;
            } else {
                i10 = org.telegram.ui.ActionBar.n6.N8;
            }
            int themedColor2 = getThemedColor(i10);
            this.actionBar.G(i0.a.f(this.f46765z1, themedColor2, getThemedColor(org.telegram.ui.ActionBar.n6.f29807z8)), false);
        }
    }

    public final int w3() {
        if (this.D1 != null) {
            return (int) (this.A1.getInputBubbleHeight() + this.f46746w.d() + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(2.0f));
        } else if (this.f46638a3 != 0) {
            return org.telegram.messenger.g0.L(72.0f) + this.f46691k4;
        } else {
            return this.f46691k4 + this.f46699m4;
        }
    }

    public final boolean w4(int i7) {
        char c10;
        if (i7 == 0) {
            return s4();
        }
        if ((i7 == 7 || i7 == 8) && this.T0 == 0) {
            org.telegram.messenger.mp messagesController = getMessagesController();
            org.telegram.messenger.ro[] roVarArr = getMessagesController().N;
            if (i7 == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            if (messagesController.x2(roVarArr[c10])) {
                return true;
            }
        }
        return false;
    }

    public final void w5() {
        org.telegram.ui.Components.cp0 cp0Var;
        int i7;
        nv nvVar = this.D1;
        ArrayList arrayList = this.K2;
        if (nvVar != null) {
            this.f46700n.a(!arrayList.isEmpty(), true);
            x5();
            if (arrayList.isEmpty()) {
                if (this.T0 == 3 && this.f46675h2 == null) {
                    i7 = 2131750559;
                } else {
                    i7 = 2131745474;
                }
                String M0 = org.telegram.messenger.gd.M0(i7, null);
                if (this.U3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(M0);
                } else {
                    this.actionBar.O(M0, true, 350L, org.telegram.ui.Components.lr.h);
                }
                if (this.D1.getTag() != null) {
                    this.D1.H0(false, false, false);
                    this.D1.U();
                    this.D1.setTag(null);
                    this.fragmentView.requestLayout();
                }
            } else {
                if (this.D1.getTag() == null) {
                    if (!o4() && this.G2 == null) {
                        this.D1.setFieldText("");
                    }
                    this.D1.setTag(1);
                    if (!this.f46639a4 && (cp0Var = this.I2) != null) {
                        this.f46639a4 = true;
                        String M02 = org.telegram.messenger.gd.M0(2131745234, null);
                        cp0Var.j();
                        cp0Var.G = M02;
                        hi.k1 k1Var = cp0Var.f34148a[0];
                        if (M02 != null) {
                            ((org.telegram.ui.ActionBar.n5) k1Var.f14852f).l(M02, false);
                        }
                        org.telegram.ui.Components.gb0 gb0Var = new org.telegram.ui.Components.gb0(cp0Var, 29);
                        cp0Var.H = gb0Var;
                        org.telegram.messenger.g0.h3(gb0Var, 1000L);
                    }
                }
                this.E1.e(Math.max(1, arrayList.size()), true);
                int i10 = this.U0 + (!TextUtils.isEmpty(this.D1.getFieldText()) ? 1 : 0);
                int size = arrayList.size();
                int i11 = 0;
                long j3 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    long longValue = ((Long) obj).longValue();
                    long P1 = getMessagesController().P1(longValue);
                    if (P1 <= 0 && longValue > 0) {
                        P1 = org.telegram.messenger.n5.k(getMessagesController().P2(longValue));
                    }
                    j3 += P1;
                }
                this.E1.i(i10, j3, true);
                this.D1.v2();
                if (this.U3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(org.telegram.messenger.gd.G(arrayList.size(), "Recipient", new Object[0]));
                } else {
                    this.actionBar.O(org.telegram.messenger.gd.G(arrayList.size(), "Recipient", new Object[0]), false, 350L, org.telegram.ui.Components.lr.h);
                }
            }
            this.U3 = arrayList.isEmpty();
        } else if (this.T0 == 10) {
            q4(arrayList.isEmpty());
        }
    }

    public final boolean x3() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.K2;
            if (i7 < arrayList.size()) {
                TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-((Long) arrayList.get(i7)).longValue()));
                if (O0 != null && !org.telegram.messenger.v3.l(O0)) {
                    return false;
                }
                i7++;
            } else {
                return true;
            }
        }
    }

    public final boolean x4() {
        if (this.E2 == null && this.f46711p2 == null) {
            return true;
        }
        return false;
    }

    public final void x5() {
        org.telegram.ui.Components.cp0 cp0Var = this.I2;
        if (cp0Var != null) {
            int i7 = this.currentAccount;
            cp0Var.h(i7);
            cp0Var.d = org.telegram.messenger.j10.i(org.telegram.messenger.c.a(i7).f23218a).e();
            ArrayList arrayList = cp0Var.f34152f;
            arrayList.clear();
            ArrayList arrayList2 = this.K2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            hi.k1 k1Var = cp0Var.f34148a[0];
            if (cp0Var.f34149b == 1) {
                ((org.telegram.ui.ActionBar.n5) k1Var.f14851e).l(cp0Var.c(k1Var), false);
            }
        }
    }

    public final void y3() {
        int themedColor;
        org.telegram.ui.Components.mf0 mf0Var;
        jv jvVar;
        org.telegram.ui.Components.km0 km0Var;
        f61 f61Var;
        kw kwVar = this.D0;
        if (kwVar != null && (km0Var = kwVar.f39185e0) != null && (f61Var = km0Var.f17480l0) != null) {
            int childCount = f61Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = f61Var.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.p4) {
                    org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) childAt;
                    org.telegram.ui.Components.b9 b9Var = p4Var.f31208c;
                    int i10 = p4Var.h;
                    if (org.telegram.messenger.n5.E(p4Var.f31210f)) {
                        TLRPC.User c22 = org.telegram.messenger.mp.u1(i10).c2(Long.valueOf(p4Var.f31210f));
                        p4Var.f31209e = c22;
                        b9Var.r(c22);
                    } else {
                        b9Var.q(org.telegram.messenger.mp.u1(i10).O0(Long.valueOf(-p4Var.f31210f)));
                        p4Var.f31209e = null;
                    }
                    p4Var.c(true);
                }
            }
        }
        if (this.f46663f0 != null) {
            int i11 = 0;
            while (true) {
                bx[] bxVarArr = this.f46663f0;
                if (i11 >= bxVarArr.length) {
                    break;
                }
                bx bxVar = bxVarArr[i11];
                if (bxVar != null && (jvVar = bxVar.f46303n) != null) {
                    jvVar.i();
                }
                i11++;
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.J(getThemedColor(org.telegram.ui.ActionBar.n6.G8), true);
            this.actionBar.K(getThemedColor(org.telegram.ui.ActionBar.n6.E8), false, true);
            this.actionBar.K(getThemedColor(org.telegram.ui.ActionBar.n6.F8), true, true);
            this.actionBar.L(getThemedColor(org.telegram.ui.ActionBar.n6.I5), true);
            this.actionBar.updateColors();
        }
        if (this.F3 != null) {
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.n6.f29645qi);
            Drawable drawable = this.M3;
            if (drawable != null && themedColor2 != this.B4) {
                this.B4 = themedColor2;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.Components.m5 m5Var = this.F3;
            if (m5Var != null) {
                m5Var.k(Integer.valueOf(themedColor2));
            }
            org.telegram.ui.Cells.o oVar = this.G3;
            if (oVar != null) {
                oVar.setColor(themedColor2);
            }
        }
        org.telegram.ui.Cells.c3 c3Var = this.O1;
        if (c3Var != null) {
            org.telegram.ui.ActionBar.n6.H1(c3Var.getBackground(), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29486i6, false), true);
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.f46701n0;
        if (r0Var != null) {
            r0Var.setIconColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29731v8));
        }
        nv nvVar = this.D1;
        if (nvVar != null) {
            nvVar.updateColors();
        }
        rw rwVar = this.A0;
        if (rwVar != null) {
            fh.g gVar = rwVar.F0;
            if (gVar != null) {
                gVar.updateColors();
            }
            di.n4 n4Var = rwVar.f38649z0;
            if (n4Var != null) {
                n4Var.g();
            }
            rwVar.invalidate();
        }
        jg.q0 q0Var = this.f46647c0;
        if (q0Var != null) {
            q0Var.updateColors();
        }
        kw kwVar2 = this.D0;
        if (kwVar2 != null && (mf0Var = kwVar2.f39198s0) != null) {
            mf0Var.c();
        }
        org.telegram.ui.Components.f71 f71Var = this.f46641b0;
        if (f71Var != null) {
            f71Var.updateColors();
        }
        ez0 ez0Var = this.f46635a0;
        if (ez0Var != null) {
            ez0Var.updateColors();
        }
        if (this.L0 != null) {
            int o4 = i0.a.o(getThemedColor(org.telegram.ui.ActionBar.n6.f29394d6), 100);
            if (this.L0.getForeground() instanceof ColorDrawable) {
                if (((ColorDrawable) this.L0.getForeground()).getColor() != o4) {
                    ((ColorDrawable) this.L0.getForeground()).setColor(o4);
                }
            } else {
                this.L0.setForeground(new ColorDrawable(o4));
            }
        }
        org.telegram.ui.Components.a10 a10Var = this.f46736u0;
        if (a10Var != null) {
            a10Var.updateColors();
        }
        org.telegram.ui.Components.a10 a10Var2 = this.f46741v0;
        if (a10Var2 != null) {
            a10Var2.updateColors();
        }
        int i12 = org.telegram.ui.ActionBar.n6.f29394d6;
        this.f46724r4.a(getThemedColor(i12));
        org.telegram.ui.Components.cs csVar = this.L1;
        if (csVar != null) {
            csVar.updateColors();
        }
        org.telegram.ui.Components.bs bsVar = this.M1;
        if (bsVar != null) {
            bsVar.setColor(org.telegram.ui.ActionBar.n6.x0(null, i12, false));
        }
        lv lvVar = this.J1;
        if (lvVar != null) {
            lvVar.updateColors();
        }
        lv lvVar2 = this.H1;
        if (lvVar2 != null) {
            lvVar2.updateColors();
        }
        v5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        tv tvVar = this.F0;
        if (tvVar != null) {
            tvVar.o();
        }
        if (this.E3 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.Xl)) != this.A4) {
            this.A4 = themedColor;
            this.E3.setColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        }
        qw qwVar = this.Y;
        if (qwVar != null) {
            qwVar.updateColors();
        }
    }

    public final boolean y4(bx bxVar) {
        if (bxVar != null && w4(bxVar.f46305s)) {
            return true;
        }
        return false;
    }

    public final void y5(boolean z10) {
        boolean z11;
        if (this.m0 == null) {
            return;
        }
        ArrayList arrayList = getDownloadController().H;
        int size = arrayList.size();
        boolean z12 = false;
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                if (fjVar.F0() != null && fjVar.F0().size >= 157286400) {
                    z11 = true;
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        ArrayList arrayList2 = getDownloadController().I;
        int size2 = arrayList2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i10);
            i10++;
            org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) obj2;
            if (fjVar2.F0() != null && fjVar2.F0().size >= 157286400) {
                z11 = true;
                break;
            }
        }
        if (!getUserConfig().q() && !getMessagesController().K3() && z11 && z10) {
            z12 = true;
        }
        this.d.a(z12, true);
    }

    public final void z3() {
        org.telegram.messenger.g0.h3(new zu(this, 13), 300L);
    }

    public final void z5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.m5 m5Var;
        org.telegram.ui.ActionBar.i6 i6Var;
        tv tvVar = this.F0;
        org.telegram.ui.Components.m5 m5Var2 = null;
        if (tvVar != null && (m5Var = tvVar.f12412b0) != null && tvVar.f12432r0 != null) {
            Long i7 = org.telegram.messenger.o10.i(user);
            if (i7 != null) {
                m5Var.j(i7.longValue(), z10);
                m5Var.m(user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible, z10);
            } else {
                if (user != null) {
                    org.telegram.messenger.mp.u1(tvVar.f12418f);
                    if (org.telegram.messenger.mp.H2(user)) {
                        if (tvVar.O0 == null) {
                            tvVar.O0 = tvVar.getContext().getResources().getDrawable(2131232309).mutate();
                            tvVar.O0 = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), tvVar.O0);
                        }
                        Drawable drawable = tvVar.O0;
                        int i10 = org.telegram.ui.ActionBar.n6.f29645qi;
                        cx cxVar = tvVar.f12419f0;
                        if (cxVar != null) {
                            i6Var = cxVar.getResourceProvider();
                        } else {
                            i6Var = null;
                        }
                        org.telegram.ui.ActionBar.u6.x(tvVar, drawable, i10, i6Var, PorterDuff.Mode.MULTIPLY);
                        m5Var.g(tvVar.O0, z10);
                        m5Var.m(false, z10);
                    }
                }
                m5Var.g(null, z10);
                m5Var.m(false, z10);
            }
            m5Var.k(Integer.valueOf(tvVar.f(org.telegram.ui.ActionBar.n6.f29645qi)));
            tvVar.f12410a0.invalidate();
        }
        if (this.F3 != null && this.actionBar != null) {
            Long i11 = org.telegram.messenger.o10.i(user);
            this.D3 = null;
            if (i11 != null) {
                boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                this.F3.j(i11.longValue(), z10);
                this.F3.m(z11, z10);
                if (z11) {
                    this.D3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
                }
                this.actionBar.setRightDrawableOnClick(new iu(this, 1));
                r11.t(this.currentAccount);
            } else {
                if (user != null) {
                    org.telegram.messenger.mp.u1(this.currentAccount);
                    if (org.telegram.messenger.mp.H2(user)) {
                        if (this.M3 == null) {
                            this.M3 = getParentActivity().getResources().getDrawable(2131232309).mutate();
                            this.M3 = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), this.M3);
                        }
                        Drawable drawable2 = this.M3;
                        int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.f29645qi);
                        this.B4 = themedColor;
                        drawable2.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                        this.F3.g(this.M3, z10);
                        this.F3.m(false, z10);
                        this.actionBar.setRightDrawableOnClick(new iu(this, 2));
                        r11.t(this.currentAccount);
                    }
                }
                this.F3.g(null, z10);
                this.F3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(null);
            }
            org.telegram.ui.Components.m5 m5Var3 = this.F3;
            int i12 = org.telegram.ui.ActionBar.n6.f29645qi;
            m5Var3.k(Integer.valueOf(getThemedColor(i12)));
            org.telegram.ui.Cells.o oVar = this.G3;
            if (oVar != null) {
                oVar.setColor(getThemedColor(i12));
            }
            zv zvVar = this.N0;
            if (zvVar != null && (zvVar.getContentView() instanceof r11)) {
                org.telegram.ui.ActionBar.n5 titleTextView = this.actionBar.getTitleTextView();
                r11 r11Var = (r11) this.N0.getContentView();
                if (titleTextView != null) {
                    Drawable rightDrawable = titleTextView.getRightDrawable();
                    org.telegram.ui.Components.m5 m5Var4 = this.F3;
                    if (rightDrawable == m5Var4) {
                        m5Var2 = m5Var4;
                    }
                }
                r11Var.y(m5Var2, titleTextView);
            }
        }
    }
}

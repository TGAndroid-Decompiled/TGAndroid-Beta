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
public class bx extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs, pg.b, te.b, ke0 {
    public static boolean C4;
    public static final boolean[] D4 = new boolean[4];
    public static final org.telegram.ui.Components.cq0 E4 = new org.telegram.ui.Components.cq0(3);
    public static float F4;
    public qw A0;
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
    public jw D0;
    public mv D1;
    public boolean D2;
    public Long D3;
    public boolean E;
    public org.telegram.ui.Components.at0 E0;
    public oi.w1 E1;
    public vw E2;
    public Drawable E3;
    public boolean F;
    public sv F0;
    public org.telegram.ui.ActionBar.q0 F1;
    public ArrayList F2;
    public org.telegram.ui.Components.m5 F3;
    public boolean G;
    public org.telegram.ui.Components.zr G0;
    public final TextPaint G1;
    public String G2;
    public org.telegram.ui.Cells.o G3;
    public TLRPC.RequestPeerType H;
    public boolean H0;
    public kv H1;
    public CharSequence H2;
    public wv H3;
    public long I;
    public float I0;
    public FrameLayout I1;
    public org.telegram.ui.Components.dp0 I2;
    public final lv I3;
    public ValueAnimator J;
    public float J0;
    public kv J1;
    public org.telegram.ui.Components.voip.o J2;
    public final lv J3;
    public ValueAnimator K;
    public float K0;
    public FrameLayout K1;
    public final ArrayList K2;
    public f K3;
    public boolean L;
    public tv L0;
    public org.telegram.ui.Components.bs L1;
    public boolean L2;
    public xi.e L3;
    public boolean M;
    public org.telegram.ui.Components.x60 M0;
    public org.telegram.ui.Components.as M1;
    public int M2;
    public Drawable M3;
    public boolean N;
    public yv N0;
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
    public org.telegram.ui.Cells.pa P1;
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
    public final fu R3;
    public boolean S;
    public long S0;
    public mi.j S1;
    public int S2;
    public int S3;
    public org.telegram.ui.Components.fc T;
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
    public org.telegram.ui.ActionBar.t1 V1;
    public int V2;
    public qt V3;
    public boolean W;
    public boolean W0;
    public boolean W1;
    public int W2;
    public String W3;
    public boolean X;
    public org.telegram.ui.Components.xb0 X0;
    public boolean X1;
    public boolean X2;
    public ArrayList X3;
    public pw Y;
    public org.telegram.ui.Cells.u2 Y0;
    public long Y1;
    public int Y2;
    public boolean Y3;
    public bg.p0 Z;
    public org.telegram.ui.Cells.u2 Z0;
    public TLObject Z1;
    public bx Z2;
    public CharSequence Z3;
    public final int f46520a;
    public dz0 f46521a0;
    public boolean f46522a1;
    public int f46523a2;
    public long f46524a3;
    public boolean f46525a4;
    public final te.a f46526b;
    public org.telegram.ui.Components.j71 f46527b0;
    public boolean f46528b1;
    public int f46529b2;
    public TLRPC.Chat f46530b3;
    public float f46531b4;
    public final te.a f46532c;
    public jg.q0 f46533c0;
    public final ArrayList f46534c1;
    public boolean f46535c2;
    public TLRPC.ChatFull f46536c3;
    public boolean f46537c4;
    public final te.a d;
    public float f46538d0;
    public boolean f46539d1;
    public boolean d2;
    public org.telegram.ui.Components.p9 f46540d3;
    public boolean f46541d4;
    public final te.a f46542e;
    public ValueAnimator f46543e0;
    public boolean f46544e1;
    public boolean f46545e2;
    public org.telegram.ui.Components.a9 f46546e3;
    public ValueAnimator f46547e4;
    public final te.a f46548f;
    public ax[] f46549f0;
    public boolean f46550f1;
    public int f46551f2;
    public long f46552f3;
    public org.telegram.ui.Components.u30 f46553f4;
    public org.telegram.ui.ActionBar.q0 f46554g0;
    public org.telegram.ui.ActionBar.x1 f46555g1;
    public boolean f46556g2;
    public boolean f46557g3;
    public TLRPC.FileLocation f46558g4;
    public final te.a h;
    public org.telegram.ui.ActionBar.q0 f46559h0;
    public final Paint f46560h1;
    public String f46561h2;
    public boolean f46562h3;
    public TLRPC.FileLocation f46563h4;
    public dx f46564i0;
    public ImageView f46565i1;
    public String f46566i2;
    public AnimatorSet f46567i3;
    public org.telegram.ui.Components.fc f46568i4;
    public boolean f46569j0;
    public NumberTextView f46570j1;
    public String f46571j2;
    public boolean j3;
    public int f46572j4;
    public org.telegram.ui.ActionBar.q0 f46573k0;
    public final ArrayList f46574k1;
    public boolean f46575k2;
    public boolean f46576k3;
    public int f46577k4;
    public org.telegram.ui.ActionBar.q0 f46578l0;
    public org.telegram.ui.ActionBar.q0 l1;
    public boolean f46579l2;
    public float f46580l3;
    public int f46581l4;
    public org.telegram.ui.ActionBar.q0 m0;
    public org.telegram.ui.ActionBar.q0 f46582m1;
    public boolean f46583m2;
    public boolean f46584m3;
    public int f46585m4;
    public final te.a f46586n;
    public org.telegram.ui.ActionBar.q0 f46587n0;
    public org.telegram.ui.ActionBar.q0 n1;
    public boolean f46588n2;
    public int f46589n3;
    public int f46590n4;
    public org.telegram.ui.Components.wg0 f46591o0;
    public org.telegram.ui.ActionBar.q0 f46592o1;
    public boolean f46593o2;
    public boolean f46594o3;
    public final dh.g o4;
    public org.telegram.ui.ActionBar.y0 f46595p0;
    public org.telegram.ui.ActionBar.y0 f46596p1;
    public String f46597p2;
    public boolean f46598p3;
    public final ui.f f46599p4;
    public hi.u3 f46600q0;
    public org.telegram.ui.ActionBar.y0 f46601q1;
    public String f46602q2;
    public org.telegram.ui.Components.fc f46603q3;
    public final ui.f f46604q4;
    public final te.a f46605r;
    public hi.u3 f46606r0;
    public org.telegram.ui.ActionBar.y0 f46607r1;
    public final org.telegram.messenger.sr f46608r2;
    public final h2.f f46609r3;
    public final ui.c f46610r4;
    public final te.a f46611s;
    public boolean f46612s0;
    public org.telegram.ui.ActionBar.y0 f46613s1;
    public boolean f46614s2;
    public boolean f46615s3;
    public final dh.c f46616s4;
    public boolean f46617t0;
    public org.telegram.ui.ActionBar.y0 f46618t1;
    public boolean f46619t2;
    public boolean f46620t3;
    public final dh.c f46621t4;
    public org.telegram.ui.Components.a10 f46622u0;
    public org.telegram.ui.ActionBar.y0 f46623u1;
    public boolean f46624u2;
    public boolean f46625u3;
    public final dh.c f46626u4;
    public org.telegram.ui.Components.a10 f46627v0;
    public org.telegram.ui.ActionBar.y0 f46628v1;
    public boolean f46629v2;
    public boolean f46630v3;
    public final dh.c f46631v4;
    public final rh.h f46632w;
    public hi.e f46633w0;
    public float f46634w1;
    public boolean f46635w2;
    public float f46636w3;
    public vu f46637w4;
    public boolean f46638x;
    public lh.f f46639x0;
    public float f46640x1;
    public boolean f46641x2;
    public ValueAnimator f46642x3;
    public final ArrayList f46643x4;
    public int f46644y;
    public int f46645y0;
    public AnimatorSet f46646y1;
    public boolean f46647y2;
    public float f46648y3;
    public final RectF f46649y4;
    public final UndoView[] f46650z0;
    public float f46651z1;
    public boolean f46652z2;
    public float f46653z3;
    public final RectF f46654z4;

    public bx(Bundle bundle) {
        super(bundle);
        int i7;
        int L;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            i7 = 48;
        } else {
            i7 = 0;
        }
        this.f46520a = i7;
        org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.h;
        this.f46526b = new te.a(1, this, krVar, 350L, false);
        this.f46532c = new te.a(2, this, krVar, 350L, false);
        this.d = new te.a(3, this, krVar, 350L, false);
        this.f46542e = new te.a(4, this, krVar, 350L, false);
        this.f46548f = new te.a(5, this, krVar, 350L, false);
        this.h = new te.a(6, this, krVar, 350L, false);
        this.f46586n = new te.a(7, this, krVar, 350L, false);
        this.f46605r = new te.a(8, this, krVar, 350L, false);
        this.f46611s = new te.a(9, this, krVar, 350L, false);
        this.f46632w = new rh.h(new fu(this, 27));
        this.f46644y = -1;
        this.G = true;
        this.L = false;
        this.M = false;
        this.N = false;
        this.R = true;
        this.f46538d0 = 1.0f;
        this.f46650z0 = new UndoView[2];
        this.f46534c1 = new ArrayList();
        this.f46560h1 = new Paint();
        this.f46574k1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.G1 = new TextPaint(1);
        this.W1 = true;
        this.f46545e2 = true;
        this.f46575k2 = true;
        this.f46608r2 = new Object();
        this.K2 = new ArrayList();
        this.L2 = true;
        this.f46609r3 = new h2.f((int[]) null);
        this.I3 = new lv(this, 0);
        this.J3 = new lv(this, 1);
        this.N3 = -4;
        this.O3 = true;
        this.P3 = true;
        this.R3 = new fu(this, 28);
        this.S3 = -1;
        this.f46531b4 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.f46643x4 = arrayList;
        RectF rectF = new RectF();
        this.f46649y4 = rectF;
        RectF rectF2 = new RectF();
        this.f46654z4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        ui.c d = this.glassEngine.d(new iu(this, 12));
        this.f46610r4 = d;
        if (i10 >= 31) {
            dh.g gVar = new dh.g(false);
            this.o4 = gVar;
            ui.f fVar = new ui.f(d);
            this.f46604q4 = fVar;
            fVar.f59132f = d;
            fVar.d = gVar;
            fVar.f59131e = -2;
            ui.f fVar2 = new ui.f(null);
            this.f46599p4 = fVar2;
            fVar2.f59132f = d;
            fVar2.d = gVar;
            fVar2.f59131e = -3;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.f46626u4 = cVar;
            cVar.f8373k = true;
            if (org.telegram.messenger.pc.e(262144)) {
                L = org.telegram.messenger.g0.L(8.0f);
            } else {
                L = org.telegram.messenger.g0.L(48.0f);
            }
            cVar.d = L;
            cVar.f8368e = L;
            dh.c cVar2 = new dh.c(fVar2, fVar2, fVar2);
            this.f46616s4 = cVar2;
            cVar2.f8373k = true;
            int L2 = org.telegram.messenger.g0.L(48.0f);
            cVar2.d = L2;
            cVar2.f8368e = L2;
            this.f46621t4 = new dh.c(fVar2, fVar2, fVar2);
        } else {
            this.o4 = null;
            this.f46599p4 = null;
            this.f46604q4 = null;
            this.f46616s4 = new dh.c(d, d, d);
            this.f46626u4 = new dh.c(d, d, d);
            this.f46621t4 = new dh.c(d, d, d);
        }
        dh.c cVar3 = new dh.c(d, d, d);
        this.f46631v4 = cVar3;
        dh.c cVar4 = this.f46626u4;
        ri.q qVar = this.glassEngine;
        cVar4.f8372j = qVar;
        this.f46616s4.f8372j = qVar;
        this.f46621t4.f8372j = qVar;
        cVar3.f8372j = qVar;
    }

    public static void A0(bx bxVar) {
        if (!bxVar.P3) {
            hi.u3 u3Var = bxVar.f46606r0;
            if (u3Var != null) {
                if (u3Var.W) {
                    return;
                }
                org.telegram.messenger.g0.E2(u3Var);
            }
            SpannableStringBuilder R2 = org.telegram.messenger.g0.R2(org.telegram.messenger.gd.O0("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.n6.xj, 0, new yu(bxVar, 4), null);
            hi.u3 u3Var2 = new hi.u3(bxVar.getParentActivity(), 2);
            u3Var2.s(8.0f);
            u3Var2.d = 8000L;
            u3Var2.k(true);
            u3Var2.r(true);
            u3Var2.h = org.telegram.messenger.g0.f24226q.x - org.telegram.messenger.g0.L(148.0f);
            u3Var2.v(R2);
            u3Var2.o(1.0f, -40.0f);
            u3Var2.j(bxVar.getThemedColor(org.telegram.ui.ActionBar.n6.wj));
            bxVar.f46606r0 = u3Var2;
            u3Var2.setTranslationY((-bxVar.f46577k4) - bxVar.f46585m4);
            ((ViewGroup) bxVar.fragmentView).addView(bxVar.f46606r0, c8.na.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
            bxVar.f46606r0.x();
            return;
        }
        hi.u3 u3Var3 = bxVar.f46600q0;
        if (u3Var3 != null) {
            u3Var3.f(true);
        }
        fi.j6 o4 = org.telegram.messenger.mp.u1(bxVar.currentAccount).R1().o();
        if (o4 != null && o4.a(bxVar.currentAccount, 1)) {
            bxVar.showDialog(new ug.k0(o4.b(), bxVar.currentAccount, bxVar.getParentActivity(), bxVar, null));
            return;
        }
        hi.nb D = hi.nb.D(bxVar.getParentActivity(), bxVar.currentAccount);
        D.f15132y = new gv(bxVar);
        D.Q(null);
    }

    public static void B0(bx bxVar) {
        org.telegram.messenger.mp.u1(bxVar.currentAccount).s4(0L, "BIRTHDAY_SETUP");
        bxVar.o5();
        org.telegram.ui.Components.fc K = org.telegram.ui.Components.kc.b0(bxVar).K(2131623982, org.telegram.messenger.gd.N0(2131753711, null), org.telegram.messenger.gd.N0(2131745299, null), new yu(bxVar, 9));
        K.f35091j = 5000;
        K.j();
    }

    public static void C0(bx bxVar, TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull d2 = bxVar.getMessagesController().d2(bxVar.getUserConfig().e());
        if (d2 != null) {
            tL_birthday2 = d2.birthday;
        } else {
            tL_birthday2 = null;
        }
        if (d2 != null) {
            d2.flags2 |= 32;
            d2.birthday = tL_birthday;
        }
        bxVar.getMessagesController().o2();
        bxVar.getConnectionsManager().sendRequest(updatebirthday, new z9(bxVar, d2, tL_birthday2, 8), 1024);
        org.telegram.messenger.mp.u1(bxVar.currentAccount).s4(0L, "BIRTHDAY_SETUP");
        bxVar.o5();
    }

    public static void D0(org.telegram.ui.bx r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bx.D0(org.telegram.ui.bx, int):void");
    }

    public static void E0(bx bxVar) {
        bxVar.presentFragment(new PrivacySettingsActivity());
        org.telegram.messenger.g0.j3(bxVar.parentLayout, "newChatsRow");
    }

    public static void F0(bx bxVar, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        try {
            t1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (tLObject != null) {
            bxVar.arguments.getString("importTitle");
            String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
            bi.e4 e4Var = new bi.e4(bxVar, j3, 26);
            Pattern pattern = org.telegram.ui.Components.b5.f33627a;
            if (bxVar.getParentActivity() != null) {
                if (chat != null || user != null) {
                    int currentAccount = bxVar.getCurrentAccount();
                    Activity parentActivity = bxVar.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    long e11 = org.telegram.messenger.i10.i(currentAccount).e();
                    TextView textView = new TextView(parentActivity);
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29559j5, null);
                    textView.setTextSize(1, 16.0f);
                    if (org.telegram.messenger.gd.f24314a0) {
                        i7 = 5;
                    } else {
                        i7 = 3;
                    }
                    textView.setGravity(i7 | 48);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    alertDialog$Builder.o(frameLayout);
                    org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
                    a9Var.u(org.telegram.messenger.g0.L(12.0f));
                    org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(parentActivity);
                    p9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
                    if (org.telegram.messenger.gd.f24314a0) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    frameLayout.addView(p9Var, c8.na.d(40, 40.0f, i10 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(parentActivity);
                    org.telegram.messenger.f3.l(textView2, org.telegram.ui.ActionBar.n6.E8, null, 1, 20.0f);
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    if (org.telegram.messenger.gd.f24314a0) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView2.setGravity(i11 | 16);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setText(org.telegram.messenger.gd.N0(2131749052, null));
                    boolean z10 = org.telegram.messenger.gd.f24314a0;
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
                    frameLayout.addView(textView2, c8.na.d(-1, -2.0f, i16, f10, 11.0f, i14, 0.0f));
                    if (org.telegram.messenger.gd.f24314a0) {
                        i15 = 5;
                    } else {
                        i15 = 3;
                    }
                    frameLayout.addView(textView, c8.na.d(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                    if (user != null) {
                        if (org.telegram.messenger.n10.A(user)) {
                            a9Var.f33433p = 0.8f;
                            a9Var.g(12);
                            p9Var.j(null, null, a9Var, user);
                        } else if (user.f28641id == e11) {
                            a9Var.f33433p = 0.8f;
                            a9Var.g(1);
                            p9Var.j(null, null, a9Var, user);
                        } else {
                            a9Var.f33433p = 1.0f;
                            a9Var.r(user);
                            p9Var.f(user, a9Var);
                        }
                    } else {
                        a9Var.q(chat);
                        p9Var.f(chat, a9Var);
                    }
                    textView.setText(org.telegram.messenger.g0.W2(str));
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131749072, null), new org.telegram.ui.Components.b0(e4Var, 3));
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                    bxVar.showDialog(alertDialog$Builder.f28835a);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.b5.c0(bxVar.currentAccount, tL_error, bxVar, tL_messages_checkHistoryImportPeer, new Object[0]);
        bxVar.getNotificationCenter().k(org.telegram.messenger.ks.f25304v1, Long.valueOf(j3), tL_messages_checkHistoryImportPeer, tL_error);
    }

    public static void G0(bx bxVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(launchActivity, bxVar.currentAccount, tL_attachMenuBot, null, true);
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(bxVar.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = d02.f26700b;
        if (tL_attachMenuBots != null) {
            long j3 = d02.f26697a;
            d02.getMessagesStorage().f27149a.c(new org.telegram.messenger.ek(d02.f26708e, 2, j3, d02, tL_attachMenuBots));
        }
    }

    public static void H0(bx bxVar, float f10, ValueAnimator valueAnimator) {
        bxVar.f46549f0[0].setTranslationY((1.0f - bxVar.f46636w3) * f10);
        bxVar.f46636w3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i7 = 0; i7 < bxVar.actionBar.getChildCount(); i7++) {
            if (bxVar.actionBar.getChildAt(i7).getVisibility() == 0 && bxVar.actionBar.getChildAt(i7) != bxVar.actionBar.getActionMode() && bxVar.actionBar.getChildAt(i7) != bxVar.actionBar.getBackButton()) {
                bxVar.actionBar.getChildAt(i7).setAlpha(1.0f - bxVar.f46636w3);
            }
        }
        bxVar.Q3();
        bxVar.I3();
        View view = bxVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void I0(bx bxVar) {
        org.telegram.messenger.mp.u1(bxVar.currentAccount).s4(0L, "PREMIUM_GRACE");
        bxVar.o5();
    }

    public static void J0(bx bxVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.mp.u1(bxVar.currentAccount).q1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(bxVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new z9(bxVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void K0(bx bxVar, int i7, ArrayList arrayList, boolean z10, HashSet hashSet) {
        HashSet hashSet2;
        if (i7 == 102) {
            bxVar.getMessagesController().f25858t0 = true;
            if (z10) {
                hashSet2 = hashSet;
            } else {
                hashSet2 = null;
            }
            bxVar.K4(arrayList, i7, false, false, hashSet2);
            org.telegram.messenger.mp messagesController = bxVar.getMessagesController();
            messagesController.f25858t0 = false;
            messagesController.getNotificationCenter().k(org.telegram.messenger.ks.f25283s, Boolean.TRUE);
            bxVar.getMessagesController().J(bxVar.Y2);
            int i10 = bxVar.Y2;
            if (i10 != 0 && bxVar.d4(bxVar.currentAccount, bxVar.f46549f0[0].f45829s, i10, false).size() == 0) {
                bxVar.f46549f0[0].f45822a.setEmptyView(null);
                bxVar.f46549f0[0].f45831x.setVisibility(4);
                bxVar.finishFragment();
                return;
            }
            return;
        }
        bxVar.K4(arrayList, i7, false, false, null);
    }

    public static void L0(bx bxVar) {
        org.telegram.ui.Components.nb nbVar = new org.telegram.ui.Components.nb(bxVar.getParentActivity(), bxVar.resourceProvider);
        nbVar.d(2131624009, new String[0]);
        nbVar.f37752b.setText(org.telegram.messenger.gd.N0(2131742540, null));
        org.telegram.ui.Components.fc.g(bxVar, nbVar, 2750).j();
        try {
            bxVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void X2(bx bxVar, float f10) {
        float f11;
        float f12;
        int i7;
        int i10;
        float i11 = Utilities.i(bxVar.f46651z1 * 2.0f, 1.0f, 0.0f);
        sv svVar = bxVar.F0;
        float f13 = (1.0f - bxVar.f46636w3) * f10 * bxVar.I0;
        float f14 = 1.0f - i11;
        svVar.setAlpha(f13 * f14);
        int i12 = 0;
        if (!bxVar.L && !bxVar.N) {
            if (bxVar.M) {
                bxVar.F0.setTranslationY((Math.max(bxVar.O, -bxVar.g4()) + (-org.telegram.messenger.g0.L(81.0f))) - org.telegram.messenger.g0.L(8.0f));
                bxVar.F0.setProgressToCollapse(1.0f);
                sv svVar2 = bxVar.F0;
                svVar2.setClipTop((int) (org.telegram.messenger.g0.f24220m - svVar2.getY()));
            }
            f11 = 1.0f - bxVar.I0;
            bxVar.actionBar.setTranslationY(0.0f);
        } else {
            float i13 = Utilities.i((-bxVar.O) / org.telegram.messenger.g0.L(81.0f), 1.0f, 0.0f);
            if (bxVar.f46636w3 == 1.0f) {
                i13 = 1.0f;
            }
            float i14 = Utilities.i(i13 / 0.5f, 1.0f, 0.0f);
            bxVar.F0.setClipTop(0);
            if (!bxVar.L && bxVar.N) {
                bxVar.F0.setTranslationY((-org.telegram.messenger.g0.L(81.0f)) - org.telegram.messenger.g0.L(8.0f));
                bxVar.F0.setProgressToCollapse(1.0f);
                f12 = bxVar.I0;
            } else {
                bxVar.F0.setTranslationY(((bxVar.U / 2.0f) + (Math.max(bxVar.O, -bxVar.g4()) + bxVar.f46648y3)) - org.telegram.messenger.g0.L(8.0f));
                bxVar.F0.l(!bxVar.H3.c(), i13);
                if (!bxVar.N) {
                    f12 = bxVar.I0;
                } else {
                    f11 = 1.0f - i14;
                    bxVar.actionBar.setTranslationY(0.0f);
                }
            }
            f11 = 1.0f - f12;
            bxVar.actionBar.setTranslationY(0.0f);
        }
        float f15 = f11 * f14;
        if (f15 != 1.0f) {
            bxVar.actionBar.getTitlesContainer().setPivotY(org.telegram.messenger.g0.f24220m);
            bxVar.actionBar.getTitlesContainer().setPivotX(org.telegram.messenger.g0.L(20.0f));
            float f16 = (0.6f * f15) + 0.4f;
            bxVar.actionBar.getTitlesContainer().setScaleY(f16);
            bxVar.actionBar.getTitlesContainer().setScaleX(f16);
            bxVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
            bxVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-org.telegram.messenger.g0.L(30.0f));
            bxVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f16);
            bxVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f16);
            float f17 = (1.0f - bxVar.f46636w3) * f15;
            bxVar.actionBar.getTitlesContainer().setAlpha(f17);
            FrameLayout titlesContainer = bxVar.actionBar.getTitlesContainer();
            int i15 = (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1));
            if (i15 > 0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            titlesContainer.setVisibility(i10);
            bxVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f17);
            FrameLayout additionalSubTitleOverlayContainer = bxVar.actionBar.getAdditionalSubTitleOverlayContainer();
            if (i15 <= 0) {
                i12 = 4;
            }
            additionalSubTitleOverlayContainer.setVisibility(i12);
            return;
        }
        bxVar.actionBar.getTitlesContainer().setScaleY(1.0f);
        bxVar.actionBar.getTitlesContainer().setScaleX(1.0f);
        bxVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
        bxVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
        float f18 = 1.0f - bxVar.f46636w3;
        bxVar.actionBar.getTitlesContainer().setAlpha(f18);
        FrameLayout titlesContainer2 = bxVar.actionBar.getTitlesContainer();
        int i16 = (f18 > 0.0f ? 1 : (f18 == 0.0f ? 0 : -1));
        if (i16 > 0) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        titlesContainer2.setVisibility(i7);
        bxVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f18);
        FrameLayout additionalSubTitleOverlayContainer2 = bxVar.actionBar.getAdditionalSubTitleOverlayContainer();
        if (i16 <= 0) {
            i12 = 4;
        }
        additionalSubTitleOverlayContainer2.setVisibility(i12);
    }

    public static void Y2(bx bxVar, Canvas canvas, int i7) {
        org.telegram.ui.ActionBar.r4 r4Var;
        if (bxVar.parentLayout != null && bxVar.actionBar != null) {
            float max = Math.max(bxVar.f46542e.f57779e, bxVar.i4());
            float f10 = 1.0f;
            float f11 = 1.0f - bxVar.f46651z1;
            float f12 = max * f11 * f11;
            int i10 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
            if (i10 != 0) {
                if (-1 >= i7) {
                    f10 = 0.0f;
                    i7 = -1;
                }
                if (f10 > 0.0f && i10 > 0 && i7 > 0 && (r4Var = bxVar.parentLayout) != null) {
                    ((ActionBarLayout) r4Var).p(canvas, (int) (f10 * 255.0f * f12), i7);
                }
            }
        }
    }

    public static void Z(bx bxVar) {
        boolean z10 = true;
        try {
            ((org.telegram.ui.Components.nh0) ((org.telegram.ui.Components.a9) bxVar.O1.h.getImageReceiver().f22747n0).K).H(true);
        } catch (Exception unused) {
        }
        if (bxVar.f46553f4 == null) {
            org.telegram.ui.Components.u30 u30Var = new org.telegram.ui.Components.u30(0, true, true);
            bxVar.f46553f4 = u30Var;
            u30Var.I = true;
            u30Var.f40250a = bxVar;
            u30Var.f40251b = new nw(bxVar);
            bxVar.getMediaDataController().z();
            bxVar.getMessagesController().j3();
            bxVar.getMessagesController().n3(bxVar.getUserConfig().f(), true, bxVar.classGuid);
        }
        TLRPC.User c22 = org.telegram.messenger.mp.u1(bxVar.currentAccount).c2(Long.valueOf(org.telegram.messenger.i10.i(bxVar.currentAccount).e()));
        if (c22 == null) {
            c22 = org.telegram.messenger.i10.i(bxVar.currentAccount).f();
        }
        if (c22 != null) {
            org.telegram.ui.Components.ti tiVar = bxVar.f46553f4.f40252c;
            if (tiVar != null) {
                tiVar.Q0();
            }
            org.telegram.ui.Components.u30 u30Var2 = bxVar.f46553f4;
            TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z10 = false;
            }
            u30Var2.n(z10, new yu(bxVar, 11), new mu(bxVar, 3), 0);
        }
    }

    public static void a0(bx bxVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        org.telegram.messenger.mp.u1(bxVar.currentAccount).s4(0L, tL_pendingSuggestion.suggestion);
        bxVar.o5();
    }

    public static void b0(bx bxVar) {
        ArrayList arrayList = bxVar.K2;
        org.telegram.ui.ActionBar.r4 r4Var = bxVar.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).y()) {
            bxVar.finishPreviewFragment();
        } else if (bxVar.T0 == 10) {
            if (bxVar.E2 != null && !arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    arrayList2.add(org.telegram.messenger.sr.a(((Long) arrayList.get(i7)).longValue(), 0L));
                }
                bxVar.E2.z(bxVar, arrayList2, null, false, bxVar.L2, bxVar.M2, bxVar.N2, null);
            }
        } else if (org.telegram.messenger.mp.u1(bxVar.currentAccount).A2()) {
            b.b(bxVar.currentAccount);
        } else {
            bxVar.presentFragment(new ContactsActivity(a8.p0.k("destroyAfterSelect", true)));
        }
    }

    public static void c0(bx bxVar) {
        String str;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(bxVar.currentAccount);
        if (bxVar.C3) {
            str = "PREMIUM_UPGRADE";
        } else {
            str = "PREMIUM_ANNUAL";
        }
        u12.s4(0L, str);
        bxVar.o5();
    }

    public static org.telegram.ui.Cells.u2 c4(ax axVar) {
        xw xwVar = axVar.f45822a;
        for (int i7 = 0; i7 < xwVar.getChildCount(); i7++) {
            View childAt = xwVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.u2) {
                org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) childAt;
                if (u2Var.Y()) {
                    return u2Var;
                }
            }
        }
        return null;
    }

    public static void d0(bx bxVar, ax axVar, View view, int i7) {
        int i10;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        if (view instanceof org.telegram.ui.Cells.y3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.u2;
        if (z10) {
            org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
            if (u2Var.f32042o2) {
                bxVar.h5(u2Var.getDialogId(), view);
                return;
            }
        }
        if (bxVar.U3()) {
            bxVar.F4(view, i7, 0.0f, axVar.d);
            return;
        }
        int i11 = bxVar.T0;
        if (i11 == 15 && (view instanceof org.telegram.ui.Cells.m8)) {
            axVar.d.L();
            return;
        }
        int i12 = 0;
        if ((i11 == 11 || i11 == 13) && i7 == 1) {
            Bundle k10 = a8.p0.k("forImport", true);
            k10.putLongArray("result", new long[]{bxVar.getUserConfig().e()});
            k10.putInt("chatType", 4);
            String string = bxVar.arguments.getString("importTitle");
            if (string != null) {
                k10.putString("title", string);
            }
            e50 e50Var = new e50(k10);
            e50Var.Z = new gv(bxVar);
            bxVar.presentFragment(e50Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.c3) && ((i10 = axVar.f45829s) == 7 || i10 == 8)) {
            jg.k kVar = (jg.k) axVar.d.N.get(0);
            if (kVar != null && kVar.f56712a == 17) {
                tL_chatlists_chatlistUpdates = kVar.f17646i;
            } else {
                tL_chatlists_chatlistUpdates = null;
            }
            if (tL_chatlists_chatlistUpdates != null) {
                org.telegram.messenger.ro roVar = bxVar.getMessagesController().N[axVar.f45829s - 7];
                if (roVar != null) {
                    int i13 = roVar.f26773a;
                    ?? raVar = new org.telegram.ui.Components.ra(bxVar, false);
                    raVar.U1 = -1;
                    raVar.Y1 = "";
                    raVar.Z1 = new ArrayList();
                    raVar.f35245b2 = "";
                    raVar.d2 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    raVar.f35247e2 = arrayList;
                    raVar.f35264v2 = -1;
                    raVar.f35267y2 = -5;
                    raVar.U1 = i13;
                    raVar.W1 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    raVar.f35246c2 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList arrayList2 = bxVar.getMessagesController().Q0;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i12 >= arrayList2.size()) {
                                break;
                            } else if (((org.telegram.messenger.ro) arrayList2.get(i12)).f26773a == i13) {
                                raVar.Y1 = ((org.telegram.messenger.ro) arrayList2.get(i12)).f26774b;
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                    raVar.g1();
                    bxVar.showDialog(raVar);
                    return;
                }
                return;
            }
        } else if (z10 && !bxVar.actionBar.x() && !bxVar.H3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.u2) view).Z1;
            org.telegram.messenger.g0.P.set(imageReceiver.L0, imageReceiver.M0, imageReceiver.z(), imageReceiver.B());
        }
        bxVar.E4(view, i7, axVar.d);
    }

    public static void e0(bx bxVar) {
        org.telegram.messenger.mp.u1(bxVar.currentAccount).s4(0L, "USERPIC_SETUP");
        bxVar.o5();
    }

    public static void h0(bx bxVar) {
        if (bxVar.f46553f4.g()) {
            org.telegram.messenger.mp.u1(bxVar.currentAccount).s4(0L, "USERPIC_SETUP");
            bxVar.o5();
        }
    }

    public static void i0(bx bxVar) {
        org.telegram.messenger.mp.u1(bxVar.currentAccount).h7.edit().putBoolean("storyhint", false).commit();
    }

    public static void i1(bx bxVar, boolean z10) {
        if (bxVar.f46549f0 != null && bxVar.O3 != z10) {
            bxVar.O3 = z10;
            int i7 = 0;
            while (true) {
                ax[] axVarArr = bxVar.f46549f0;
                if (i7 < axVarArr.length) {
                    if (z10) {
                        axVarArr[i7].f45822a.setScrollbarFadingEnabled(false);
                    }
                    bxVar.f46549f0[i7].f45822a.setVerticalScrollBarEnabled(z10);
                    if (z10) {
                        bxVar.f46549f0[i7].f45822a.setScrollbarFadingEnabled(true);
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public static void j0(final int i7, final long j3, TLRPC.Chat chat, final bx bxVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        int i13;
        bxVar.p4(false);
        if (i7 == 103 && org.telegram.messenger.v3.T(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || org.telegram.messenger.v3.t0(chat2)) {
                bxVar.getMessagesController().X(2, j3, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i7 == 102 && (i13 = bxVar.Y2) != 0 && bxVar.d4(bxVar.currentAccount, bxVar.f46549f0[0].f45829s, i13, false).size() == 1) {
            bxVar.f46549f0[0].f45831x.setVisibility(4);
        }
        int i14 = -1;
        if (i7 == 102) {
            bxVar.U4(true, true);
            if (bxVar.T1 != null) {
                i12 = 0;
                while (i12 < bxVar.T1.size()) {
                    if (((TLRPC.Dialog) bxVar.T1.get(i12)).f28496id == j3) {
                        break;
                    }
                    i12++;
                }
            }
            i12 = -1;
            bxVar.z3();
            i10 = i12;
        } else {
            i10 = -1;
        }
        UndoView l42 = bxVar.l4();
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
                    bxVar.J4(i7, j3, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(bxVar.d4(bxVar.currentAccount, bxVar.f46549f0[0].f45829s, bxVar.Y2, false));
        int i15 = 0;
        while (true) {
            if (i15 >= arrayList2.size()) {
                break;
            } else if (((TLRPC.Dialog) arrayList2.get(i15)).f28496id == j3) {
                i14 = i15;
                break;
            } else {
                i15++;
            }
        }
        if (i7 == 102) {
            if (i10 >= 0 && i14 < 0 && (arrayList = bxVar.T1) != null) {
                arrayList.remove(i10);
                bxVar.f46549f0[0].f45832y.D();
                bxVar.f46549f0[0].q(true);
                return;
            }
            bxVar.U4(false, true);
        }
    }

    public static void k0(bx bxVar, org.telegram.messenger.t1 t1Var) {
        ArrayList arrayList = t1Var.f27030c;
        if (arrayList.size() == 1) {
            bi.p3 p3Var = new bi.p3(bxVar.getParentActivity(), bxVar.currentAccount, ((TLRPC.User) arrayList.get(0)).f28641id, null, null);
            p3Var.g1(true);
            bxVar.showDialog(p3Var);
            return;
        }
        bi.f2.l1(false, t1Var);
    }

    public static void l0(bx bxVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.fc I = org.telegram.ui.Components.kc.b0(bxVar).I(2131624034, org.telegram.messenger.gd.N0(2131746662, null), org.telegram.messenger.gd.N0(2131746661, null));
            I.f35091j = 5000;
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
            bxVar.getMessagesStorage().j2(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (bxVar.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bxVar.getParentActivity(), bxVar.resourceProvider);
                String N0 = org.telegram.messenger.gd.N0(2131746658, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.gd.N0(2131746659, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                bxVar.showDialog(t1Var);
                return;
            }
            return;
        }
        org.telegram.messenger.f3.n(null, 2131743632, org.telegram.ui.Components.kc.b0(bxVar), 2131624012, 36);
    }

    public static void m0(bx bxVar) {
        org.telegram.messenger.mp.u1(bxVar.currentAccount).s4(0L, "SETUP_PASSKEY");
        bxVar.o5();
    }

    public static void n0(bx bxVar, int i7) {
        Object obj;
        TLRPC.User user;
        org.telegram.ui.Components.hm0 hm0Var = bxVar.D0.f40097r0;
        if (i7 >= hm0Var.f35802a0 && i7 < hm0Var.f35803b0) {
            org.telegram.ui.Components.n41 G = hm0Var.G(i7);
            if (G != null) {
                obj = G.H;
            } else {
                obj = null;
            }
        } else {
            obj = Boolean.FALSE;
        }
        if (obj instanceof TLRPC.User) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bxVar.getParentActivity(), bxVar.resourceProvider);
            String N0 = org.telegram.messenger.gd.N0(2131754177, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.gd.a0(null, null, 2131754176, "\"" + org.telegram.messenger.n10.q(user) + "\"");
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131746125, null), new zs(3, bxVar, (TLRPC.User) obj));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        }
    }

    public static void o0(bx bxVar, float f10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        bxVar.f46636w3 = floatValue;
        bxVar.f46549f0[0].setTranslationY((-f10) * floatValue);
        for (int i7 = 0; i7 < bxVar.actionBar.getChildCount(); i7++) {
            if (bxVar.actionBar.getChildAt(i7).getVisibility() == 0 && bxVar.actionBar.getChildAt(i7) != bxVar.actionBar.getActionMode() && bxVar.actionBar.getChildAt(i7) != bxVar.actionBar.getBackButton()) {
                bxVar.actionBar.getChildAt(i7).setAlpha(1.0f - bxVar.f46636w3);
            }
        }
        View view = bxVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        bxVar.Q3();
        bxVar.I3();
    }

    public static void p0(bx bxVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", org.telegram.messenger.i10.i(bxVar.currentAccount).e());
        bxVar.presentFragment(new bn(bundle));
    }

    public static void q0(bx bxVar) {
        b.c(bxVar.currentAccount, bxVar.getParentActivity(), bxVar.getResourceProvider());
    }

    public static void r4(bn bnVar, org.telegram.messenger.fj fjVar) {
        CharSequence charSequence;
        if (fjVar != null && fjVar.r2()) {
            try {
                if (!TextUtils.isEmpty(fjVar.f24131z)) {
                    charSequence = fjVar.f24131z;
                } else {
                    charSequence = fjVar.v;
                }
                CharSequence x12 = org.telegram.messenger.g0.x1(charSequence, fjVar.f24030a2, null);
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

    public static void s0(bx bxVar) {
        org.telegram.messenger.mp.u1(bxVar.currentAccount).s4(0L, "PREMIUM_RESTORE");
        bxVar.o5();
    }

    public static void t0(bx bxVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
            LaunchActivity.G0(launchActivity, bxVar.currentAccount, tL_attachMenuBot, null, true);
        } else {
            xc1.a(bxVar.getParentActivity(), new x(bxVar, tL_attachMenuBot, launchActivity, 7), null);
        }
    }

    public static void u0(bx bxVar) {
        org.telegram.messenger.v1 a10 = org.telegram.messenger.v1.a(bxVar.currentAccount);
        int i7 = a10.f27414a;
        Set<String> set = a10.d;
        org.telegram.messenger.t1 t1Var = a10.f27416c;
        if (t1Var != null && !set.contains(t1Var.f27028a)) {
            set.add(a10.f27416c.f27028a);
            SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(i7).h7.edit();
            edit.putStringSet("bday_hidden", set);
            edit.apply();
            org.telegram.messenger.ks.f(i7).k(org.telegram.messenger.ks.f25237j5, new Object[0]);
        }
        org.telegram.messenger.mp.u1(bxVar.currentAccount).s4(0L, "BIRTHDAY_CONTACTS_TODAY");
        bxVar.o5();
        org.telegram.ui.Components.fc G = org.telegram.ui.Components.kc.b0(bxVar).G(2131624034, 4, org.telegram.messenger.gd.N0(2131753327, null));
        G.f35091j = 5000;
        G.j();
    }

    public static void v0(bx bxVar) {
        org.telegram.messenger.mp.u1(bxVar.currentAccount).s4(0L, "PREMIUM_CHRISTMAS");
        bxVar.o5();
        org.telegram.ui.Components.fc G = org.telegram.ui.Components.kc.b0(bxVar).G(2131624034, 4, org.telegram.messenger.gd.N0(2131753327, null));
        G.f35091j = 5000;
        G.j();
    }

    public static void v1(bx bxVar, ax axVar, float f10) {
        if (bxVar.U != f10) {
            bxVar.U = f10;
            int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            int i10 = 0;
            if (i7 == 0) {
                bxVar.V = false;
            }
            bxVar.F0.setOverscroll(f10);
            axVar.f45822a.setViewsOffset(f10);
            xw xwVar = axVar.f45822a;
            if (i7 != 0) {
                i10 = 2;
            }
            xwVar.setOverScrollMode(i10);
            bxVar.fragmentView.invalidate();
            if (f10 > org.telegram.messenger.g0.L(90.0f) && !bxVar.V) {
                sv svVar = bxVar.F0;
                ValueAnimator valueAnimator = svVar.I0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    svVar.i(svVar.f12435q0, true);
                    bxVar.V = true;
                    bxVar.getOrCreateStoryViewer().x(new fu(bxVar, 12));
                }
            }
        }
    }

    public static void w0(bx bxVar, int i7, org.telegram.ui.Components.x60 x60Var) {
        CharSequence charSequence;
        if (bxVar.currentAccount != i7) {
            x60Var.v();
            if (bxVar.getParentActivity() == null) {
                return;
            }
            vw vwVar = bxVar.E2;
            LaunchActivity launchActivity = (LaunchActivity) bxVar.getParentActivity();
            ArrayList arrayList = bxVar.F2;
            String str = bxVar.G2;
            CharSequence charSequence2 = bxVar.H2;
            mv mvVar = bxVar.D1;
            if (mvVar != null) {
                charSequence = mvVar.getFieldText();
            } else {
                charSequence = null;
            }
            launchActivity.O0(i7);
            bx bxVar2 = new bx(bxVar.arguments);
            bxVar2.E2 = vwVar;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList.isEmpty()) {
                    bxVar2.F2 = null;
                } else {
                    bxVar2.F2 = arrayList;
                    bxVar2.G2 = null;
                    bxVar2.O2 = false;
                    if (bxVar2.D1 != null) {
                        bxVar2.v3(charSequence);
                    } else {
                        bxVar2.Z3 = charSequence;
                    }
                }
            } else if (str != null) {
                bxVar2.Y4(charSequence, str);
            } else if (charSequence2 != null) {
                if (charSequence2.length() == 0) {
                    bxVar2.H2 = null;
                } else {
                    bxVar2.H2 = charSequence2;
                    bxVar2.G2 = null;
                    bxVar2.F2 = null;
                    if (bxVar2.D1 != null) {
                        bxVar2.v3(charSequence);
                    } else {
                        bxVar2.Z3 = charSequence;
                    }
                }
            }
            launchActivity.u0(bxVar2, false, true);
        }
    }

    public static boolean w1(bx bxVar, ax axVar) {
        if (!bxVar.H3.c()) {
            int i7 = (int) (-bxVar.O);
            int f42 = bxVar.f4();
            int g42 = bxVar.g4();
            if (i7 != 0 && i7 != f42 && i7 != g42 && axVar.f45822a.canScrollVertically(-1)) {
                if (g42 < i7 && i7 < f42) {
                    int L = org.telegram.messenger.g0.L(48.0f);
                    int i10 = i7 - g42;
                    if (i10 < L / 2) {
                        axVar.f45823b.x(-i10);
                        return true;
                    }
                    axVar.f45823b.x(L - i10);
                    return true;
                }
                float f10 = 1.0f;
                if (bxVar.f46636w3 != 1.0f) {
                    f10 = Utilities.i((-bxVar.O) / org.telegram.messenger.g0.L(81.0f), 1.0f, 0.0f);
                }
                if (f10 < bxVar.F0.C0) {
                    axVar.f45823b.x(-i7);
                    return true;
                }
                axVar.f45823b.x(g42 - i7);
                return true;
            }
            return false;
        }
        return false;
    }

    public static void x0(bx bxVar) {
        org.telegram.messenger.mp.u1(bxVar.currentAccount).s4(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        bxVar.o5();
    }

    public static String x2(bx bxVar) {
        String s5;
        ArrayList arrayList = bxVar.K2;
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
                if (longValue == bxVar.getUserConfig().e()) {
                    sb2.append(org.telegram.messenger.gd.N0(2131745705, null));
                } else {
                    if (arrayList.size() == 1) {
                        s5 = org.telegram.messenger.n5.l(bxVar.currentAccount, longValue);
                    } else {
                        s5 = org.telegram.messenger.n5.s(bxVar.currentAccount, longValue);
                    }
                    sb2.append(s5);
                }
            }
            return org.telegram.messenger.gd.a0(null, null, 2131745243, sb2.toString());
        }
        return org.telegram.messenger.gd.G(arrayList.size(), "ShareSendToMany", new Object[0]);
    }

    public static void y0(bx bxVar) {
        PasskeysActivity.f0(bxVar.currentAccount, bxVar.getParentActivity(), bxVar.resourceProvider, true);
    }

    public static void z0(bx bxVar) {
        if (bxVar.f46549f0 == null) {
            return;
        }
        if (!bxVar.U1 && !bxVar.isPaused) {
            bxVar.Q3 = false;
            bxVar.getMessagesController().f5(null);
            bxVar.N4(false);
            return;
        }
        bxVar.Q3 = true;
    }

    public static void z4(org.telegram.messenger.c cVar) {
        int i7 = cVar.f23343a;
        boolean[] zArr = D4;
        if (!zArr[i7]) {
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
            u12.d3();
            u12.a3(0, 0, 100, true, null);
            if (u12.f25849s.isEmpty() && !TextUtils.isEmpty(u12.U3)) {
                TLRPC.TL_help_getRecentMeUrls tL_help_getRecentMeUrls = new TLRPC.TL_help_getRecentMeUrls();
                tL_help_getRecentMeUrls.referer = u12.U3;
                u12.getConnectionsManager().sendRequest(tL_help_getRecentMeUrls, new org.telegram.messenger.mj(u12, 4));
            }
            u12.n3(org.telegram.messenger.i10.i(i7).f(), false, 0);
            org.telegram.messenger.i5.r(i7).f();
            org.telegram.messenger.ri.d0(i7).w(false);
            org.telegram.messenger.g0.h3(new ch(cVar, 18), 200L);
            Iterator it = u12.f25741f4.iterator();
            while (it.hasNext()) {
                org.telegram.messenger.ri.d0(i7).f1((String) it.next(), true, true);
            }
            zArr[i7] = true;
        }
    }

    public final boolean A3(long j3) {
        int i7;
        int i10 = this.T0;
        if (i10 != 15 && i10 != 16 && this.f46571j2 == null && this.f46624u2) {
            if (org.telegram.messenger.n5.z(j3)) {
                long j10 = -j3;
                TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(j10));
                if (org.telegram.messenger.v3.T(O0) && !O0.megagroup) {
                    if (!this.f46614s2) {
                        TLRPC.Chat O02 = org.telegram.messenger.mp.u1(this.currentAccount).O0(Long.valueOf(j10));
                        if ((org.telegram.messenger.v3.n(O02) || O02.megagroup) && (i7 = this.V0) != 2 && i7 != 3) {
                            return true;
                        }
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String N0 = org.telegram.messenger.gd.N0(2131745400, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                    t1Var.S = N0;
                    int i11 = this.V0;
                    if (i11 == 3) {
                        t1Var.U = org.telegram.messenger.gd.N0(2131743846, null);
                    } else if (i11 == 2) {
                        t1Var.U = org.telegram.messenger.gd.N0(2131746391, null);
                    } else {
                        t1Var.U = org.telegram.messenger.gd.N0(2131752428, null);
                    }
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131747637, null), null);
                    showDialog(t1Var);
                    return false;
                }
                return true;
            } else if (org.telegram.messenger.n5.C(j3)) {
                if (this.V0 != 0 || this.W0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String N02 = org.telegram.messenger.gd.N0(2131745400, null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28835a;
                    t1Var2.S = N02;
                    int i12 = this.V0;
                    if (i12 == 3) {
                        t1Var2.U = org.telegram.messenger.gd.N0(2131743845, null);
                    } else if (i12 != 0) {
                        t1Var2.U = org.telegram.messenger.gd.N0(2131746982, null);
                    } else {
                        t1Var2.U = org.telegram.messenger.gd.N0(2131748911, null);
                    }
                    alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131747637, null), null);
                    showDialog(t1Var2);
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
            ArrayList arrayList = (ArrayList) getMessagesController().f25894x.f(dialog.community_id);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                A4(((TLRPC.Dialog) obj).f28496id);
            }
            return;
        }
        if ((!this.actionBar.x() || this.actionBar.y(null)) && H4(this.f46549f0[0], dialog)) {
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
                    } else if (((TLRPC.Dialog) this.T1.get(i11)).f28496id == j10) {
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
            org.telegram.messenger.q5 q5Var = messagesStorage.f27149a;
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
            this.f46549f0[0].f45832y.D();
            this.f46549f0[0].q(true);
        }
    }

    public final void A5() {
        hi.u3 u3Var;
        boolean i52 = getMessagesController().i5();
        if (this.P3 != i52) {
            s5();
            if (!this.P3 && i52 && (u3Var = this.f46600q0) != null) {
                u3Var.x();
            }
            this.P3 = i52;
        }
        org.telegram.ui.Components.a10 a10Var = this.f46622u0;
        if (a10Var == null) {
            return;
        }
        if (this.T0 == 10) {
            a10Var.setImageResource(2131231198);
            this.f46622u0.setContentDescription(org.telegram.messenger.gd.N0(2131751342, null));
            return;
        }
        a10Var.setImageResource(2131231109);
        this.f46622u0.setContentDescription(org.telegram.messenger.gd.N0(2131748077, null));
    }

    @Override
    public final ui.f B() {
        return this.f46604q4;
    }

    public final void B3(boolean z10) {
        mi.j jVar;
        TLRPC.ChatFull chatFull;
        boolean z11;
        org.telegram.ui.Components.bs bsVar = this.L1;
        if (bsVar != null && (jVar = this.S1) != null && (chatFull = this.f46536c3) != null) {
            if (this.f46524a3 != 0 && chatFull.requests_pending > 0 && !this.f46526b.f57780f) {
                z11 = true;
            } else {
                z11 = false;
            }
            bsVar.j(jVar, z11, z10);
            this.S1.setTitle(org.telegram.messenger.gd.G(this.f46536c3.requests_pending, "CommunityPendingRequestsRow", new Object[0]));
        }
    }

    public final boolean B4(org.telegram.tgnet.TLRPC.Chat r6, org.telegram.tgnet.TLRPC.User r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bx.B4(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):boolean");
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
            wv wvVar = this.H3;
            if ((wvVar == null || !wvVar.c()) && !this.f46615s3 && (kVar = this.actionBar) != null && !kVar.x() && !this.f46588n2) {
                hi.nb nbVar = hi.nb.G2;
                int i10 = 0;
                if ((nbVar != null && nbVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
                    z10 = false;
                }
                if (!t4() && k4().I()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.f46524a3 != 0) {
                    z12 = false;
                } else if (t4()) {
                    z12 = !k4().h.isEmpty();
                } else {
                    if (!z11 && (((arrayList = (k42 = k4()).f12392g) != null && arrayList.size() > 0) || k42.J())) {
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
                    sv svVar = this.F0;
                    if (z13 != z15) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    svVar.p(z10, z14);
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
                        this.K.addListener(new org.telegram.ui.Cells.x9(this, 26));
                        this.K.setDuration(200L);
                        this.K.setInterpolator(org.telegram.ui.Components.kr.f36858f);
                        this.K.start();
                    } else {
                        sv svVar2 = this.F0;
                        if (z16 && !isInPreviewMode()) {
                            i7 = 0;
                        } else {
                            i7 = 8;
                        }
                        svVar2.setVisibility(i7);
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
                        ofFloat2.addUpdateListener(new iw(this, f14, z12, f12));
                        this.J.addListener(new cw(this, z12, 2));
                        this.J.setDuration(200L);
                        this.J.setInterpolator(org.telegram.ui.Components.kr.f36858f);
                        this.J.start();
                        return;
                    }
                    this.L = z12;
                    sv svVar3 = this.F0;
                    if ((z12 || this.M) && !isInPreviewMode()) {
                        i11 = 0;
                    }
                    svVar3.setVisibility(i11);
                    if (!z12) {
                        W4(0.0f);
                    } else {
                        this.A3 = -org.telegram.messenger.g0.L(81.0f);
                        W4(-f4());
                    }
                    while (true) {
                        ax[] axVarArr = this.f46549f0;
                        if (i10 >= axVarArr.length) {
                            break;
                        }
                        ax axVar = axVarArr[i10];
                        if (axVar != null) {
                            axVar.f45822a.requestLayout();
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

    public final void C3(org.telegram.ui.ax r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bx.C3(org.telegram.ui.ax):void");
    }

    public final boolean C4(TLRPC.User user) {
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.H;
        if (user != null && !org.telegram.messenger.n10.A(user) && !org.telegram.messenger.n10.y(user)) {
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
        if (this.A0 != null && this.T0 == 0 && !this.f46588n2) {
            this.S3 = i7;
            org.telegram.messenger.ro m42 = m4();
            this.S3 = -1;
            boolean z12 = false;
            if (m42 != null && getMessagesController().V0().size() > 1 && getMessagesController().x2(m42)) {
                z11 = true;
            } else {
                z11 = false;
            }
            qw qwVar = this.A0;
            if (z10 && qwVar.getVisibility() == 0) {
                z12 = true;
            }
            qwVar.k(z11, z12);
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
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.m10.j(getParentActivity(), false, 1, null);
        if (getMessagesStorage().M != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i7 = 2131232220;
        } else {
            i7 = 0;
        }
        if (org.telegram.messenger.bz.f23315q1) {
            i10 = 2131231000;
        } else {
            i10 = 2131231004;
        }
        int[] iArr = {i7, i10};
        if (z10) {
            str = org.telegram.messenger.gd.N0(2131748489, null);
        } else {
            str = null;
        }
        if (org.telegram.messenger.bz.f23315q1) {
            i11 = 2131747052;
        } else {
            i11 = 2131749131;
        }
        CharSequence[] charSequenceArr = {str, org.telegram.messenger.gd.N0(i11, null)};
        k4 k4Var = new k4(this, 1);
        j3.M = charSequenceArr;
        j3.N = iArr;
        j3.L = k4Var;
        showDialog(j3);
    }

    public final void D5(int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bx.D5(int, boolean):void");
    }

    @Override
    public final List E() {
        return Arrays.asList(new pg.a(org.telegram.messenger.gd.N0(2131751636, null)), new pg.a(org.telegram.messenger.gd.N0(2131752064, null), new fu(this, 23)), new pg.a(org.telegram.messenger.gd.N0(2131751637, null), new fu(this, 24)));
    }

    public final void E3() {
        if (this.f46549f0 != null) {
            int w32 = w3();
            int i7 = 0;
            while (true) {
                ax[] axVarArr = this.f46549f0;
                if (i7 < axVarArr.length) {
                    ax axVar = axVarArr[i7];
                    if (axVar != null) {
                        xw xwVar = axVar.f45822a;
                        xwVar.setPadding(0, xwVar.f33447g3, 0, w32);
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void E4(android.view.View r27, int r28, v4.i0 r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bx.E4(android.view.View, int, v4.i0):void");
    }

    public final boolean E5(long j3) {
        TLRPC.Chat O0;
        mv mvVar;
        if ((this.U0 <= 1 && ((mvVar = this.D1) == null || mvVar.getVisibility() != 0 || TextUtils.isEmpty(this.D1.getFieldText()))) || !org.telegram.messenger.n5.z(j3) || (O0 = getMessagesController().O0(Long.valueOf(-j3))) == null || org.telegram.messenger.v3.N(O0) || !O0.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.b5.r0(this, org.telegram.messenger.gd.N0(2131745114, null), org.telegram.messenger.gd.N0(2131745106, null), null);
        return false;
    }

    public final void F3() {
        jh.f fVar = this.A1;
        if (fVar != null) {
            fVar.setBlurredBottomHeight(this.A1.getInputBubbleHeight() + this.f46632w.d() + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(7.0f));
        }
    }

    public final boolean F4(View view, int i7, float f10, org.telegram.ui.Components.dk0 dk0Var) {
        org.telegram.ui.Components.mm0 mm0Var;
        long j3;
        org.telegram.ui.Components.mm0 mm0Var2;
        TLRPC.EncryptedChat encryptedChat;
        long F;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.c3) && dk0Var.d(i7) != 21) {
            if (!this.actionBar.x() && !org.telegram.messenger.g0.Q1() && !this.f46588n2 && (view instanceof org.telegram.ui.Cells.u2)) {
                org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
                if (!getMessagesController().y2(u2Var.getDialogId()) && !this.H3.c() && u2Var.b0(f10)) {
                    return b5(u2Var);
                }
            }
            wv wvVar = this.H3;
            if (wvVar == null || !wvVar.c()) {
                jw jwVar = this.D0;
                boolean z10 = true;
                if (jwVar != null && dk0Var == (mm0Var2 = jwVar.f40085e0)) {
                    Object I = mm0Var2.I(i7);
                    if (!this.D0.f40085e0.O) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String N0 = org.telegram.messenger.gd.N0(2131752042, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                        t1Var.S = N0;
                        if (I instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) I;
                            if (chat.monoforum) {
                                t1Var.U = org.telegram.messenger.gd.a0("ClearSearchSingleChatAlertText", null, 2131752041, qg.c.j(this.currentAccount, chat, false));
                            } else {
                                t1Var.U = org.telegram.messenger.gd.a0("ClearSearchSingleChatAlertText", null, 2131752041, chat.title);
                            }
                            F = -chat.f28492id;
                        } else if (I instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) I;
                            if (user.f28641id == getUserConfig().f24656n) {
                                t1Var.U = org.telegram.messenger.gd.a0("ClearSearchSingleChatAlertText", null, 2131752041, org.telegram.messenger.gd.N0(2131745705, null));
                            } else {
                                t1Var.U = org.telegram.messenger.gd.a0("ClearSearchSingleUserAlertText", null, 2131752039, org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                            }
                            F = user.f28641id;
                        } else if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(((TLRPC.EncryptedChat) I).user_id));
                            t1Var.U = org.telegram.messenger.gd.a0("ClearSearchSingleUserAlertText", null, 2131752039, org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name));
                            F = org.telegram.messenger.n5.F(encryptedChat.f28500id);
                        }
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752043, null), new ai.z(this, F, 8));
                        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                        showDialog(t1Var);
                        TextView textView = (TextView) t1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, getResourceProvider());
                        }
                        return true;
                    }
                }
                jw jwVar2 = this.D0;
                if (jwVar2 != null && dk0Var == (mm0Var = jwVar2.f40085e0)) {
                    if (this.f46588n2) {
                        E4(view, i7, dk0Var);
                        return false;
                    }
                    if ((view instanceof org.telegram.ui.Cells.g6) && !mm0Var.N(i7)) {
                        j3 = ((org.telegram.ui.Cells.g6) view).getDialogId();
                    } else {
                        j3 = 0;
                    }
                    if (j3 != 0) {
                        g5(j3, view);
                        return true;
                    }
                } else {
                    Object J = ((jg.m) dk0Var).J(i7);
                    if (J instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                        if (this.f46588n2) {
                            if ((this.T0 == 3 || U3()) && E5(dialog.f28496id)) {
                                if (this.T0 == 1 && U3() && this.f46593o2 && getMessagesController().y2(dialog.f28496id)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -dialog.f28496id);
                                    bundle.putBoolean("for_select", true);
                                    bundle.putBoolean("forward_to", true);
                                    if (this.T0 != 1) {
                                        z10 = false;
                                    }
                                    bundle.putBoolean("bot_share_to", z10);
                                    bundle.putBoolean("quote", this.P0);
                                    bundle.putBoolean("reply_to", this.O0);
                                    w91 w91Var = new w91(bundle);
                                    w91Var.M0 = this;
                                    presentFragment(w91Var);
                                    return false;
                                }
                                s3(dialog.f28496id, view);
                                w5();
                                return true;
                            }
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                            D4(view);
                            return false;
                        } else if (!this.actionBar.x() || !v4(dialog)) {
                            g5(dialog.f28496id, view);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void G(float f10, int i7) {
        org.telegram.ui.ActionBar.q0 q0Var;
        if (i7 == 3 && (q0Var = this.m0) != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) q0Var.getIconView().getDrawable();
            if (this.d.f57780f) {
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

    public final void G3() {
        int i7;
        ax axVar;
        boolean z10 = true;
        float e42 = e4(true);
        qw qwVar = this.A0;
        if (qwVar != null) {
            if (qwVar.getAlpha() == e42) {
                z10 = false;
            }
            float T1 = org.telegram.messenger.g0.T1(0.98f, 1.0f, e42);
            this.A0.setAlpha(e42);
            this.A0.setScaleX(T1);
            this.A0.setScaleY(T1);
            qw qwVar2 = this.A0;
            if (e42 > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            qwVar2.setVisibility(i7);
            if (z10 && (axVar = this.f46549f0[0]) != null) {
                axVar.f45822a.requestLayout();
            }
        }
        m5();
    }

    public final void G4(View view) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i7 = 0; i7 < 4; i7++) {
            if (org.telegram.messenger.i10.i(i7).p()) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        Collections.sort(arrayList, new pe(23));
        org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(this, view);
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
                int i11 = org.telegram.ui.ActionBar.n6.f29543i6;
                Drawable a02 = org.telegram.ui.ActionBar.n6.a0(getThemedColor(i11), 0, 0);
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
                org.telegram.ui.ActionBar.i6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(a02);
                org.telegram.ui.ActionBar.u6.j(linearLayout, a02, null, M, resourceProvider);
                TLRPC.User f10 = org.telegram.messenger.i10.i(intValue).f();
                org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
                a9Var.r(f10);
                hi.y3 y3Var = new hi.y3(this, getParentActivity(), z10);
                linearLayout.addView(y3Var, c8.na.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(getParentActivity());
                if (z10) {
                    p9Var.setScaleX(0.833f);
                    p9Var.setScaleY(0.833f);
                }
                p9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
                p9Var.getImageReceiver().d = intValue;
                p9Var.f(f10, a9Var);
                y3Var.addView(p9Var, c8.na.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29559j5, getResourceProvider());
                textView.setText(org.telegram.messenger.n10.q(f10));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, c8.na.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new bi.k5(this, intValue, I, 17));
                I.r(linearLayout, c8.na.o(230, 48));
            }
        }
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(24.0f), getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6));
        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
        I.f41900z.set(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
        I.X(d02);
        I.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
        I.W(5);
        I.a0();
    }

    public final void H3() {
        int i7;
        int i10;
        float f10 = this.f46586n.f57779e;
        float T1 = org.telegram.messenger.g0.T1(0.2f, 1.0f, f10);
        oi.w1 w1Var = this.E1;
        int i11 = 8;
        if (w1Var != null) {
            w1Var.setScaleX(T1);
            this.E1.setScaleY(T1);
            this.E1.setAlpha(f10);
            oi.w1 w1Var2 = this.E1;
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            w1Var2.setVisibility(i10);
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

    public final boolean H4(ax axVar, TLRPC.Dialog dialog) {
        TLRPC.EncryptedChat c12;
        if (axVar != null && dialog != null) {
            if (!getMessagesController().G7.containsKey(Long.valueOf(dialog.f28496id))) {
                if (y4(axVar)) {
                    return true;
                }
                org.telegram.messenger.ro h42 = h4(axVar);
                if (h42 != null) {
                    int i7 = h42.f26778g;
                    int i10 = org.telegram.messenger.mp.I8;
                    if ((i7 & 64) != 0) {
                        int i11 = this.currentAccount;
                        long j3 = dialog.f28496id;
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
        org.telegram.ui.Components.a10.d(this.actionBar.getBackButton(), Math.max(this.f46636w3, (1.0f - this.f46526b.f57779e) * (1.0f - i4()) * (1.0f - this.f46532c.f57779e)));
    }

    public final boolean I4(ax axVar) {
        if (axVar == null) {
            return false;
        }
        if (y4(axVar)) {
            return true;
        }
        org.telegram.messenger.ro h42 = h4(axVar);
        if (h42 != null) {
            int i7 = h42.f26778g;
            int i10 = org.telegram.messenger.mp.I8;
            if ((i7 & 64) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void J3() {
        float f10;
        if (this.f46569j0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.a10.d(this.f46559h0, com.google.android.gms.internal.vision.e2.D(f10, 1.0f - this.f46526b.f57779e, 1.0f - i4(), 1.0f - this.f46532c.f57779e));
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
            getNotificationCenter().k(org.telegram.messenger.ks.f25289t, Long.valueOf(j3));
        }
        getMessagesController().J(this.Y2);
    }

    @Override
    public final void K(int i7, float f10, float f11, te.c cVar) {
        int i10;
        int i11;
        int i12 = 8;
        if (i7 == 1) {
            O3();
            Q3();
            T3();
            G3();
            R3();
            pw pwVar = this.Y;
            te.a aVar = this.f46526b;
            pwVar.setBlurredBackgroundVisibility(aVar.f57779e);
            float a10 = a8.n7.a(aVar.f57779e);
            org.telegram.ui.Components.p9 p9Var = this.f46540d3;
            if (p9Var != null) {
                p9Var.setScaleX(a10);
                this.f46540d3.setScaleY(a10);
                this.f46540d3.setAlpha(a10);
                org.telegram.ui.Components.p9 p9Var2 = this.f46540d3;
                if (a10 > 0.0f) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                p9Var2.setVisibility(i11);
            }
            if (this.f46633w0 != null) {
                float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, a10);
                this.f46633w0.setScaleX(T1);
                this.f46633w0.setScaleY(T1);
                this.f46633w0.setAlpha(a10);
                hi.e eVar = this.f46633w0;
                int i13 = (a10 > 0.0f ? 1 : (a10 == 0.0f ? 0 : -1));
                if (i13 > 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                eVar.setVisibility(i10);
                this.f46639x0.setAlpha(a10);
                lh.f fVar = this.f46639x0;
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

    public final void K3() {
        float f10;
        if (org.telegram.messenger.bz.f23319s.isEmpty()) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        org.telegram.ui.Components.a10.d(this.f46554g0, com.google.android.gms.internal.vision.e2.D(f10, 1.0f - this.f46526b.f57779e, 1.0f - i4(), 1.0f - this.f46532c.f57779e));
    }

    public final void K4(java.util.ArrayList r41, int r42, boolean r43, boolean r44, java.util.HashSet r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bx.K4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    public final void L3() {
        float f10;
        if (this.T0 != 2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.a10.d(this.f46573k0, com.google.android.gms.internal.vision.e2.D(f10, this.f46548f.f57779e, 1.0f - i4(), 1.0f - this.f46532c.f57779e));
        sv svVar = this.F0;
        if (svVar != null) {
            svVar.invalidate();
        }
    }

    public final void L4(long r14, boolean r16, org.telegram.messenger.ro r17, int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bx.L4(long, boolean, org.telegram.messenger.ro, int, boolean):void");
    }

    public final void M3() {
        org.telegram.ui.Components.a10.d(this.m0, com.google.android.gms.internal.vision.e2.D(this.f46526b.f57779e, 1.0f - i4(), 1.0f - this.f46532c.f57779e, this.d.f57779e));
    }

    public final void M4() {
        if (this.L0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6));
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
        tv tvVar;
        if (!this.f46579l2 && ((tvVar = this.L0) == null || tvVar.getBackground() == null || this.L0.getAlpha() < 0.01f || this.L0.getVisibility() == 8)) {
            z10 = true;
        } else {
            z10 = false;
        }
        f fVar = this.K3;
        if (fVar != null) {
            ((le0) fVar.f47651b).f49738w.a(z10, true);
        }
    }

    public final void N4(boolean z10) {
        ax[] axVarArr = this.f46549f0;
        if (axVarArr != null && !this.U1) {
            for (ax axVar : axVarArr) {
                if (axVar.getVisibility() == 0) {
                    if (z10) {
                        dv dvVar = axVar.f45832y;
                        dvVar.D();
                        dvVar.A = true;
                    }
                    axVar.q(z10);
                    C3(axVar);
                }
            }
        }
        qw qwVar = this.A0;
        if (qwVar != null && qwVar.getVisibility() == 0) {
            this.A0.d();
        }
    }

    public final void O3() {
        I3();
        org.telegram.ui.Components.a10.d(this.f46578l0, (1.0f - this.f46526b.f57779e) * (1.0f - i4()) * (1.0f - this.f46532c.f57779e));
        J3();
        M3();
        K3();
        L3();
    }

    public final void O4(ax axVar) {
        int i7;
        org.telegram.ui.Components.vz vzVar;
        if (axVar.getVisibility() != 0) {
            return;
        }
        int i10 = axVar.d.f17677w;
        if (axVar.f45829s == 0 && n4() && axVar.f45822a.getChildCount() == 0 && axVar.f45830w == 2) {
            ((v4.c0) axVar.f45822a.getLayoutManager()).h1(1, (int) this.O);
        }
        axVar.d.getClass();
        axVar.d.V();
        int b10 = axVar.d.b();
        if (b10 == 1 && i10 == 1 && axVar.d.d(0) == 5) {
            axVar.q(true);
        } else {
            axVar.q(false);
            if (b10 > i10 && (i7 = this.T0) != 11 && i7 != 12 && i7 != 13) {
                axVar.E.b(i10);
            }
        }
        try {
            xw xwVar = axVar.f45822a;
            if (this.Y2 == 0 && this.f46524a3 == 0) {
                vzVar = axVar.f45831x;
            } else {
                vzVar = null;
            }
            xwVar.setEmptyView(vzVar);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        C3(axVar);
    }

    public final void P3() {
        int i7;
        if (i4() > 0.5f) {
            i7 = 2131745510;
        } else {
            i7 = 2131745617;
        }
        String N0 = org.telegram.messenger.gd.N0(i7, null);
        this.Y.f33883r.setContentDescription(N0);
        this.Y.f33883r.setHint(N0);
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
            animatorSet.setInterpolator(org.telegram.ui.Components.kr.f36858f);
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
        float a10 = 1.0f - c8.m9.a(((-this.O) - g4()) / org.telegram.messenger.g0.L(48.0f), 0.0f, 1.0f);
        float max = Math.max(this.f46636w3, this.h.f57779e);
        float f11 = this.f46526b.f57779e;
        if (this.T0 != 2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float max2 = f10 * (1.0f - this.f46532c.f57779e) * (1.0f - max) * Math.max(f11, (1.0f - i4()) * a10);
        this.Y.setAlpha(max2);
        pw pwVar = this.Y;
        boolean z10 = false;
        if (max2 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        pwVar.setVisibility(i7);
        if (max2 <= 0.01f) {
            z10 = true;
        }
        this.f46548f.a(z10, true);
    }

    public final void Q4(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bx.Q4(int):void");
    }

    public final void R3() {
        int i7;
        float f10;
        int i10;
        int i11 = 8;
        if (this.f46521a0 != null) {
            if (this.f46527b0 != null) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float f11 = f10 * this.f46526b.f57779e;
            float T1 = org.telegram.messenger.g0.T1(0.98f, 1.0f, f11);
            this.f46521a0.setScaleX(T1);
            this.f46521a0.setScaleY(T1);
            this.f46521a0.setAlpha(f11);
            dz0 dz0Var = this.f46521a0;
            if (f11 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            dz0Var.setVisibility(i10);
        }
        org.telegram.ui.Components.j71 j71Var = this.f46527b0;
        te.a aVar = this.f46611s;
        if (j71Var != null) {
            float f12 = 1.0f - aVar.f57779e;
            j71Var.setAlpha(f12);
            org.telegram.ui.Components.j71 j71Var2 = this.f46527b0;
            if (f12 > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            j71Var2.setVisibility(i7);
        }
        jg.q0 q0Var = this.f46533c0;
        if (q0Var != null) {
            float f13 = aVar.f57779e;
            q0Var.setAlpha(f13);
            jg.q0 q0Var2 = this.f46533c0;
            if (f13 > 0.0f) {
                i11 = 0;
            }
            q0Var2.setVisibility(i11);
        }
    }

    public final void R4(boolean z10, boolean z11) {
        int i7;
        int i10;
        wv wvVar = this.H3;
        if (wvVar != null && wvVar.c()) {
            return;
        }
        if (this.f46549f0[0].f45829s == 0 && n4() && this.f46549f0[0].f45830w == 2) {
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
            org.telegram.ui.ActionBar.l5 l5Var = this.f46549f0[0].f45828r;
            l5Var.f29284b = 1;
            l5Var.k(i7, i10, false, false);
            P4();
            return;
        }
        this.f46549f0[0].f45824c.h1(i7, i10);
        P4();
    }

    public final void S3(boolean z10) {
        int i7;
        int i10;
        if (this.D0 != null && this.actionBar != null) {
            int i11 = org.telegram.messenger.g0.f24221n;
            int measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(this.f46520a);
            if (this.f46527b0 != null) {
                i7 = org.telegram.messenger.g0.L(50.0f);
            } else {
                i7 = 0;
            }
            int i12 = measuredHeight + i7;
            org.telegram.ui.Components.bs bsVar = this.L1;
            if (bsVar != null) {
                i10 = (int) bsVar.d(org.telegram.messenger.g0.L(7.0f));
            } else {
                i10 = 0;
            }
            int i13 = i12 + i10;
            jw jwVar = this.D0;
            SparseArray sparseArray = jwVar.h;
            jwVar.X0 = i13;
            jwVar.Y0 = i11;
            di.b1 b1Var = jwVar.f40082b0;
            if (z10) {
                b1Var.q1(0, i13, 0, i11);
            } else {
                b1Var.setPadding(0, i13, 0, i11);
            }
            jwVar.P0.j(jwVar.X0, jwVar.Y0, z10);
            org.telegram.ui.Components.gm0 gm0Var = jwVar.f40083c0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gm0Var.getLayoutParams();
            int i14 = marginLayoutParams.topMargin;
            int i15 = jwVar.X0;
            if (i14 != i15 || marginLayoutParams.bottomMargin != jwVar.Y0) {
                marginLayoutParams.topMargin = i15;
                marginLayoutParams.bottomMargin = jwVar.Y0;
                gm0Var.requestLayout();
            }
            org.telegram.ui.Components.tm0.O(jwVar.f40089i0, jwVar.f40092l0, jwVar.X0, jwVar.Y0, z10);
            org.telegram.ui.Components.tm0.O(jwVar.f40093n0, jwVar.f40096q0, jwVar.X0, jwVar.Y0, z10);
            org.telegram.ui.Components.tm0.O(jwVar.f40100u0, jwVar.f40103x0, jwVar.X0, jwVar.Y0, z10);
            org.telegram.ui.Components.nf0 nf0Var = jwVar.f40098s0;
            int i16 = jwVar.X0;
            int i17 = jwVar.Y0;
            nf0Var.setClipToPadding(false);
            org.telegram.ui.Components.g51 g51Var = nf0Var.f37773c;
            nf0Var.K = z10;
            nf0Var.setPadding(0, i16, 0, i17);
            if (z10) {
                g51Var.q1(0, i16, 0, i17);
            } else {
                g51Var.setPadding(0, i16, 0, i17);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) g51Var.getLayoutParams();
            marginLayoutParams2.topMargin = -i16;
            marginLayoutParams2.bottomMargin = -i17;
            nf0Var.K = false;
            org.telegram.ui.Components.sl0 sl0Var = jwVar.J0;
            if (sl0Var != null) {
                sl0Var.b(jwVar.X0, jwVar.Y0, z10);
            }
            int size = sparseArray.size();
            for (int i18 = 0; i18 < size; i18++) {
                View view = (View) sparseArray.valueAt(i18);
                if (view instanceof b00) {
                    ((b00) view).j(jwVar.X0, jwVar.Y0, z10);
                }
            }
            for (int i19 = 0; i19 < jwVar.getChildCount(); i19++) {
                if (jwVar.getChildAt(i19) instanceof b00) {
                    ((b00) jwVar.getChildAt(i19)).j(jwVar.X0, jwVar.Y0, z10);
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
        pw pwVar = this.Y;
        if (pwVar != null) {
            pwVar.f33883r.setText(str);
            this.Y.f33883r.setSelection(str.length());
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
        ax[] axVarArr;
        this.f46538d0 = f10;
        for (ax axVar : this.f46549f0) {
            xw xwVar = axVar.f45822a;
            for (int i7 = 0; i7 < xwVar.getChildCount(); i7++) {
                View childAt = xwVar.getChildAt(i7);
                if (childAt != null && RecyclerView.R(childAt) >= axVar.d.f17673f + 1) {
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
        if (this.f46549f0 != null && this.U1 != z10) {
            if (z10) {
                this.T1 = new ArrayList(d4(this.currentAccount, this.f46549f0[0].f45829s, this.Y2, false));
            } else {
                this.T1 = null;
            }
            this.U1 = z10;
            ax axVar = this.f46549f0[0];
            axVar.d.H = z10;
            if (!z10 && z11) {
                if (axVar.f45822a.c0()) {
                    this.f46549f0[0].f45822a.post(new yu(this, 5));
                } else {
                    this.f46549f0[0].d.f();
                }
            }
        }
    }

    public final void V3() {
        if (org.telegram.messenger.g0.Q1()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.n(true);
            }
            TLObject tLObject = this.Z1;
            if (tLObject != null) {
                jw jwVar = this.D0;
                if (jwVar != null) {
                    jwVar.f40085e0.Q(this.Y1, tLObject);
                }
                this.Z1 = null;
                return;
            }
            return;
        }
        this.X1 = true;
    }

    public final void V4(boolean z10) {
        ax axVar;
        if (org.telegram.messenger.bz.o() > 1 && org.telegram.messenger.pc.e(32768)) {
            if (z10) {
                ax[] axVarArr = this.f46549f0;
                if (axVarArr != null && (axVar = axVarArr[0]) != null) {
                    axVar.setLayerType(2, null);
                    this.f46549f0[0].setClipChildren(false);
                    this.f46549f0[0].setClipToPadding(false);
                    this.f46549f0[0].f45822a.setClipChildren(false);
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
            if (this.f46549f0 != null) {
                int i7 = 0;
                while (true) {
                    ax[] axVarArr2 = this.f46549f0;
                    if (i7 >= axVarArr2.length) {
                        break;
                    }
                    ax axVar2 = axVarArr2[i7];
                    if (axVar2 != null) {
                        axVar2.setLayerType(0, null);
                        axVar2.setClipChildren(true);
                        axVar2.setClipToPadding(true);
                        axVar2.f45822a.setClipChildren(true);
                    }
                    i7++;
                }
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setLayerType(0, null);
            }
            sv svVar = this.F0;
            if (svVar != null) {
                svVar.setLayerType(0, null);
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
        if (kVar != null && kVar.f29166o0) {
            kVar.n(true);
            this.f46615s3 = false;
            q5(true, true);
        }
    }

    public final void W4(float f10) {
        ax[] axVarArr = this.f46549f0;
        int i7 = 0;
        if (axVarArr != null) {
            int paddingTop = axVarArr[0].f45822a.getPaddingTop() + ((int) f10);
            int i10 = 0;
            while (true) {
                ax[] axVarArr2 = this.f46549f0;
                if (i10 >= axVarArr2.length) {
                    break;
                }
                axVarArr2[i10].f45822a.setTopGlowOffset(paddingTop);
                i10++;
            }
        }
        if (this.fragmentView != null && f10 != this.O) {
            this.O = f10;
            org.telegram.ui.Components.fc fcVar = this.f46603q3;
            if (fcVar != null) {
                fcVar.l();
            }
            if (this.G3 != null) {
                float currentActionBarHeight = 1.0f - ((-f10) / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                org.telegram.ui.Cells.o oVar = this.G3;
                float f11 = (int) f10;
                float f12 = oVar.f31228f;
                oVar.h = f11;
                oVar.setTranslationY(f12 + f11);
                this.G3.setAlpha(c8.m9.a(currentActionBarHeight, 0.0f, 1.0f));
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
        wv wvVar;
        tv tvVar;
        qw qwVar;
        boolean z11;
        boolean z12;
        if (!this.f46615s3 && (((wvVar = this.H3) == null || !wvVar.c()) && (((tvVar = this.L0) == null || tvVar.getVisibility() != 0) && ((qwVar = this.A0) == null || !qwVar.f38306n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                qw qwVar2 = this.A0;
                if (qwVar2 != null && qwVar2.getTabsCount() >= 2 && this.A0.getCurrentTabId() != this.A0.getFirstTabId()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                qw qwVar3 = this.A0;
                if (qwVar3 != null && qwVar3.getTabsCount() >= 2 && this.A0.getCurrentTabId() != this.A0.getLastTabId()) {
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
        org.telegram.ui.ActionBar.y p10 = this.actionBar.p(str);
        boolean z10 = this.X;
        ArrayList arrayList = this.f46574k1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.f46565i1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f46565i1.setImageDrawable(new org.telegram.ui.ActionBar.x1(true));
            org.telegram.ui.ActionBar.u6.s(this.f46565i1, org.telegram.ui.ActionBar.n6.f29845y8, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.f46565i1;
            int i7 = org.telegram.ui.ActionBar.n6.f29864z8;
            org.telegram.ui.ActionBar.u6.Q(imageView2, org.telegram.ui.ActionBar.n6.h0(getThemedColor(i7), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i7), getResourceProvider());
            this.f46565i1.setOnClickListener(new hu(this, 6));
            p10.addView(this.f46565i1, c8.na.r(54, 54, 16));
            arrayList.add(this.f46565i1);
        }
        NumberTextView numberTextView = new NumberTextView(p10.getContext());
        this.f46570j1 = numberTextView;
        int i10 = 18;
        numberTextView.setTextSize(18);
        this.f46570j1.setTypeface(org.telegram.messenger.g0.o());
        this.f46570j1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29845y8));
        NumberTextView numberTextView2 = this.f46570j1;
        if (!this.X) {
            i10 = 72;
        }
        p10.addView(numberTextView2, c8.na.m(1.0f, 0, -1, i10, 0, 0));
        this.f46570j1.setOnTouchListener(new gi.a(2));
        this.f46582m1 = p10.g(100, 2131232298, org.telegram.messenger.g0.L(48.0f));
        this.n1 = p10.g(104, 2131232261, org.telegram.messenger.g0.L(48.0f));
        this.f46592o1 = p10.g(107, 2131232056, org.telegram.messenger.g0.L(48.0f));
        this.l1 = p10.h(102, 2131232113, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.gd.N0(2131751586, null));
        org.telegram.ui.ActionBar.q0 h = p10.h(0, 2131231247, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.gd.N0(2131754838, null));
        p10.addView(new View(getParentActivity()), c8.na.o(5, -1));
        this.f46613s1 = h.e(105, 2131232056, org.telegram.messenger.gd.N0(2131754169, null));
        this.f46596p1 = h.e(108, 2131232298, org.telegram.messenger.gd.N0(2131751441, null));
        this.f46601q1 = h.e(109, 2131232051, org.telegram.messenger.gd.N0(2131750800, null));
        this.f46607r1 = h.e(110, 2131232334, org.telegram.messenger.gd.N0(2131750698, null));
        this.f46623u1 = h.e(101, 2131232220, org.telegram.messenger.gd.N0(2131748488, null));
        this.f46618t1 = h.e(103, 2131232097, org.telegram.messenger.gd.N0(2131752077, null));
        this.f46628v1 = h.e(106, 2131232072, org.telegram.messenger.gd.N0(2131753689, null));
        this.n1.setOnLongClickListener(new pu(this, 1));
        arrayList.add(this.f46582m1);
        arrayList.add(this.f46592o1);
        arrayList.add(this.n1);
        arrayList.add(this.l1);
        arrayList.add(h);
        n5(false);
    }

    public final void X4(float f10) {
        this.f46651z1 = f10;
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
        jw jwVar = this.D0;
        if ((jwVar != null && jwVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        if (this.f46597p2 != null) {
            i7 = 2;
        } else if (!this.f46588n2) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        jw jwVar2 = new jw(this, getParentActivity(), this, i7, this.T0, this.Y2, this.f46524a3, new gv(this));
        this.D0 = jwVar2;
        this.glassEngine.c(jwVar2);
        ((uw) this.fragmentView).addView(this.D0, this.C0);
        jw jwVar3 = this.D0;
        jwVar3.f40085e0.V = new lw(this);
        jwVar3.f40092l0.setOnItemClickListener(new iu(this, 1));
        this.D0.f40096q0.setOnItemClickListener(new iu(this, 2));
        this.D0.f40103x0.setOnItemClickListener(new lu(this, 0));
        this.D0.f40096q0.setOnItemLongClickListener(new iu(this, 3));
        this.D0.f40082b0.setOnItemClickListener(new iu(this, 4));
        this.D0.f40082b0.setOnItemLongClickListener(new gv(this));
        this.D0.setFilteredSearchViewDelegate(new iu(this, 5));
        this.D0.setAlpha(0.0f);
        this.D0.setScaleX(1.05f);
        this.D0.setScaleY(1.05f);
        this.D0.setVisibility(8);
        this.D0.setBlurredBackgroundDrawableFactory(this.f46621t4);
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
        UndoView[] undoViewArr = this.f46650z0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i7 = 0; i7 < 2; i7++) {
                undoViewArr[i7] = new fw(this, parentActivity);
                FrameLayout.LayoutParams d = c8.na.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.f46577k4 + this.f46585m4 + d.bottomMargin;
                UndoView undoView = undoViewArr[i7];
                int i10 = this.f46645y0 + 1;
                this.f46645y0 = i10;
                ((uw) this.fragmentView).addView(undoView, i10, d);
            }
        }
    }

    public final void Z4(float f10) {
        if (org.telegram.messenger.bz.o() <= 0) {
            boolean z10 = org.telegram.messenger.s2.f26829a;
        } else if (this.f46531b4 != f10) {
            boolean z11 = true;
            if (org.telegram.messenger.bz.o() > 1 && org.telegram.messenger.pc.e(32768)) {
                z11 = false;
            }
            this.f46537c4 = z11;
            this.f46531b4 = f10;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.f46537c4) {
                float f11 = (1.0f - this.f46531b4) * (-org.telegram.messenger.g0.L(40.0f));
                sv svVar = this.F0;
                if (svVar != null) {
                    svVar.setTranslationX(f11);
                }
                pw pwVar = this.Y;
                if (pwVar != null) {
                    pwVar.setTranslationX(f11);
                }
                wv wvVar = this.H3;
                if (wvVar != null && wvVar.getFragmentView() != null && !this.E) {
                    this.H3.getFragmentView().setTranslationX(f11);
                    return;
                }
                return;
            }
            float f12 = 1.0f - this.f46531b4;
            float f13 = (-org.telegram.messenger.g0.L(4.0f)) * f12;
            float f14 = 1.0f - (f12 * 0.05f);
            sv svVar2 = this.F0;
            if (svVar2 != null) {
                svVar2.setScaleX(f14);
                this.F0.setScaleY(f14);
                this.F0.setTranslationX(f13);
                this.F0.setPivotX(0.0f);
                this.F0.setPivotY(0.0f);
            }
            pw pwVar2 = this.Y;
            if (pwVar2 != null) {
                pwVar2.setTranslationX(f13);
                this.Y.setScaleX(f14);
                this.Y.setScaleY(f14);
            }
            wv wvVar2 = this.H3;
            if (wvVar2 != null && wvVar2.getFragmentView() != null) {
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

    public final void a4(final long j3, final long j10, boolean z10, final w91 w91Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String N0;
        String b02;
        String N02;
        TLRPC.TL_forumTopic f10;
        if (A3(j3)) {
            int i7 = this.T0;
            if (i7 != 11 && i7 != 12 && i7 != 13) {
                if (z10 && ((this.f46561h2 != null && this.f46566i2 != null) || this.f46571j2 != null)) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        if (org.telegram.messenger.n5.C(j3)) {
                            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(getMessagesController().c1(Integer.valueOf((int) (4294967295L & j3))).user_id));
                            if (c22 != null) {
                                N0 = org.telegram.messenger.gd.N0(2131745400, null);
                                b02 = org.telegram.messenger.gd.b0(this.f46561h2, org.telegram.messenger.n10.q(c22));
                                N02 = org.telegram.messenger.gd.N0(2131745444, null);
                            } else {
                                return;
                            }
                        } else if (org.telegram.messenger.n5.E(j3)) {
                            if (j3 == getUserConfig().e()) {
                                N0 = org.telegram.messenger.gd.N0(2131745400, null);
                                b02 = org.telegram.messenger.gd.b0(this.f46566i2, org.telegram.messenger.gd.N0(2131745705, null));
                                N02 = org.telegram.messenger.gd.N0(2131745444, null);
                            } else {
                                TLRPC.User c23 = getMessagesController().c2(Long.valueOf(j3));
                                if (c23 != null && this.f46561h2 != null) {
                                    N0 = org.telegram.messenger.gd.N0(2131745400, null);
                                    b02 = org.telegram.messenger.gd.b0(this.f46561h2, org.telegram.messenger.n10.q(c23));
                                    N02 = org.telegram.messenger.gd.N0(2131745444, null);
                                } else {
                                    return;
                                }
                            }
                        } else {
                            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-j3));
                            if (O0 != null) {
                                String str = O0.title;
                                if (j10 != 0 && (f10 = getMessagesController().f25864t7.f(O0.f28492id, j10)) != null) {
                                    str = ((Object) str) + " " + f10.title;
                                }
                                if (this.f46571j2 != null) {
                                    N0 = org.telegram.messenger.gd.N0(2131754363, null);
                                    b02 = org.telegram.messenger.gd.b0(this.f46571j2, str);
                                    N02 = org.telegram.messenger.gd.N0(2131754483, null);
                                } else {
                                    N0 = org.telegram.messenger.gd.N0(2131745400, null);
                                    b02 = org.telegram.messenger.gd.b0(this.f46566i2, str);
                                    N02 = org.telegram.messenger.gd.N0(2131745444, null);
                                }
                            } else {
                                return;
                            }
                        }
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                        t1Var.S = N0;
                        t1Var.U = org.telegram.messenger.g0.W2(b02);
                        alertDialog$Builder.k(N02, new org.telegram.ui.ActionBar.q1() {
                            @Override
                            public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i10) {
                                bx.this.a4(j3, j10, false, w91Var);
                            }
                        });
                        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                        if (showDialog(t1Var) == null) {
                            t1Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i7 == 15) {
                    Runnable s2Var = new bi.s2(this, j3, new d3.e0(this, j3, j10, w91Var, 7), 27);
                    if (j3 < 0) {
                        k5(getMessagesController().O0(Long.valueOf(-j3)), s2Var, null);
                        return;
                    }
                    TLRPC.User c24 = getMessagesController().c2(Long.valueOf(j3));
                    TLRPC.User c25 = getMessagesController().c2(Long.valueOf(this.I));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String a02 = org.telegram.messenger.gd.a0(null, null, 2131754071, org.telegram.messenger.n10.k(c24, true), org.telegram.messenger.n10.k(c25, true));
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28835a;
                    t1Var2.S = a02;
                    t1Var2.U = TextUtils.concat(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131754072, org.telegram.messenger.n10.k(c24, true), org.telegram.messenger.n10.k(c25, true))));
                    alertDialog$Builder2.k(org.telegram.messenger.gd.a0("Send", null, 2131745444, new Object[0]), new zr(s2Var, 5));
                    alertDialog$Builder2.h(org.telegram.messenger.gd.a0("Cancel", null, 2131752577, new Object[0]), new org.telegram.ui.Components.ub0(23));
                    showDialog(t1Var2);
                    return;
                } else if (this.E2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(org.telegram.messenger.sr.a(j3, j10));
                    if (this.E2.z(this, arrayList, null, false, this.L2, this.M2, this.N2, w91Var) && this.f46575k2) {
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
            org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
            TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
            tL_messages_checkHistoryImportPeer.peer = getMessagesController().l1(j3);
            getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new di.k3(this, t1Var3, user, chat, j3, tL_messages_checkHistoryImportPeer));
            try {
                t1Var3.r(300L);
            } catch (Exception unused) {
            }
        }
    }

    public final void a5() {
        getContactsController().B();
        org.telegram.ui.Components.t6 t6Var = new org.telegram.ui.Components.t6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.voip.o(10, this, r1), new ch(r1, 17));
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.m10.j(getParentActivity(), false, 1, getResourceProvider());
        j3.O = t6Var;
        j3.V0 = 49;
        j3.show();
        org.telegram.ui.ActionBar.w2[] w2VarArr = {j3};
        j3.Q(org.telegram.ui.ActionBar.n6.f29524h5);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29508g8));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29492f9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29509g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29619m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Zl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29843y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29473e9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29454d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29436c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.M7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.N7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29527h9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29636n9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29601l9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29654o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29563j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29583k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29416b8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29395a8));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29415b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29671p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29581k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.qk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Z5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29865z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29846y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29827x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29808w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29789v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29770u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29750t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29713r9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29694q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29674p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29545i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29417b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29396a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29854yi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G8));
    }

    public final void b4(long j3, boolean z10) {
        if (this.f46549f0 != null) {
            int i7 = 0;
            while (true) {
                ax[] axVarArr = this.f46549f0;
                if (i7 < axVarArr.length) {
                    int childCount = axVarArr[i7].f45822a.getChildCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 < childCount) {
                            View childAt = this.f46549f0[i7].f45822a.getChildAt(i10);
                            if (childAt instanceof org.telegram.ui.Cells.u2) {
                                org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) childAt;
                                if (u2Var.getDialogId() == j3) {
                                    u2Var.e0(z10, true);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bx.b5(org.telegram.ui.Cells.u2):boolean");
    }

    public final void c5(boolean z10) {
        float f10;
        this.f46532c.a(z10, true);
        if (this.f46587n0 == null) {
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
            this.f46587n0.setVisibility(0);
        } else {
            this.f46587n0.setSelected(false);
            Drawable background = this.f46587n0.getBackground();
            if (background != null) {
                background.setState(StateSet.NOTHING);
                background.jumpToCurrentState();
            }
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.ActionBar.q0 q0Var = this.f46587n0;
        Property property = View.ALPHA;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(q0Var, property, f10));
        this.T3.playTogether(arrayList);
        this.T3.addListener(new cw(this, z10, 1));
        this.T3.start();
    }

    @Override
    public final boolean canBeginSlide() {
        qw qwVar;
        if (!this.H3.c()) {
            if (this.T0 == 3 && (qwVar = this.A0) != null && qwVar.getVisibility() == 0 && this.A0.L > 0) {
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
            jw jwVar = this.D0;
            if (jwVar != null) {
                jwVar.Q();
                return true;
            }
            return true;
        }
        return super.closeLastFragment();
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.Components.u7 u7Var = new org.telegram.ui.Components.u7(this, context, this.resourceProvider, 3);
        u7Var.setAllowOverlayTitle(true);
        u7Var.H0 = true;
        if (u7Var.G0 == null) {
            bi.v2 v2Var = new bi.v2(u7Var.getContext(), 7);
            u7Var.G0 = v2Var;
            u7Var.addView(v2Var);
        }
        org.telegram.ui.ActionBar.u6.l(u7Var, 3, org.telegram.ui.ActionBar.n6.f29749t8, getResourceProvider());
        org.telegram.ui.ActionBar.u6.a(u7Var, org.telegram.ui.ActionBar.n6.f29864z8, getResourceProvider(), true);
        org.telegram.ui.ActionBar.u6.l(u7Var, 1, org.telegram.ui.ActionBar.n6.f29788v8, getResourceProvider());
        org.telegram.ui.ActionBar.u6.b(u7Var, org.telegram.ui.ActionBar.n6.f29845y8, getResourceProvider(), true);
        if (u7Var.f29192y1 == null) {
            fi.j jVar = new fi.j(u7Var, u7Var.getContext(), u7Var.K0, u7Var.P0);
            u7Var.f29192y1 = jVar;
            jVar.setClipChildren(false);
            u7Var.addView(u7Var.f29192y1);
        }
        u7Var.getAdditionalSubTitleOverlayContainer().setTranslationX(org.telegram.messenger.g0.L(4.0f));
        u7Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-org.telegram.messenger.g0.L(3.0f));
        if (!this.inPreviewMode && (!org.telegram.messenger.g0.Q1() || this.Y2 == 0 || t4())) {
            return u7Var;
        }
        u7Var.setOccupyStatusBar(false);
        return u7Var;
    }

    @Override
    public final android.view.View createView(android.content.Context r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bx.createView(android.content.Context):android.view.View");
    }

    public final java.util.ArrayList d4(int r11, int r12, int r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bx.d4(int, int, int, boolean):java.util.ArrayList");
    }

    public final void d5() {
        if (!this.B0 && getMessagesController().V0 && getMessagesController().M3 && this.A0 != null && getMessagesController().V0().isEmpty() && !this.isPaused && getUserConfig().Q && !this.inPreviewMode) {
            SharedPreferences g12 = org.telegram.messenger.mp.g1();
            if (!g12.getBoolean("filterhint", false)) {
                g12.edit().putBoolean("filterhint", true).apply();
                org.telegram.messenger.g0.h3(new yu(this, 7), 1000L);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r27, int r28, java.lang.Object... r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bx.didReceivedNotification(int, int, java.lang.Object[]):void");
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
            f10 = 1.0f - this.f46526b.f57779e;
        } else {
            f10 = 1.0f;
        }
        return f10 * (1.0f - i4()) * this.f46605r.f57779e;
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
        char c10;
        CharSequence charSequence;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        uu uuVar;
        org.telegram.ui.Components.voip.o oVar;
        int w02;
        int w03;
        int w04;
        int i12;
        int w05;
        org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(this, this.f46578l0);
        int i13 = org.telegram.ui.ActionBar.n6.A8;
        I.T(getThemedColor(i13), getThemedColor(i13));
        I.f41892s = 8;
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) parentActivity;
        } else {
            launchActivity = null;
        }
        float f11 = 64.0f;
        int i14 = 1;
        int i15 = 0;
        if (this.f46524a3 != 0) {
            if (org.telegram.messenger.v3.N(this.f46530b3)) {
                I.c(2131232111, org.telegram.messenger.gd.N0(2131751901, null), new yu(this, 14), false);
                I.k();
            }
            I.i(new fu(this, 1), org.telegram.messenger.gd.N0(2131751900, null), this.f46530b3.collapsed_in_dialogs);
            I.i(new fu(this, 2), org.telegram.messenger.gd.N0(2131751899, null), !this.f46530b3.collapsed_in_dialogs);
            I.a0();
            I.Y(-org.telegram.messenger.g0.L(64.0f));
            return;
        }
        char c11 = 3;
        if (t4()) {
            I.c(2131232111, org.telegram.messenger.gd.N0(2131754140, null), new fu(this, 3), false);
            I.c(2131232187, org.telegram.messenger.gd.N0(2131749083, null), new fu(this, 4), false);
            I.a0();
            I.Y(-org.telegram.messenger.g0.L(64.0f));
            return;
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.resourceProvider;
        if (i6Var != null) {
            q10 = i6Var.b();
        } else {
            q10 = org.telegram.ui.ActionBar.n6.I.q();
        }
        if (q10) {
            i7 = 2131231788;
        } else {
            i7 = 2131231847;
        }
        if (q10) {
            i10 = 2131744055;
        } else {
            i10 = 2131744054;
        }
        I.c(i7, org.telegram.messenger.gd.N0(i10, null), new fu(this, 5), false);
        I.k();
        I.c(2131232105, org.telegram.messenger.gd.N0(2131751768, null), new fu(this, 6), false);
        I.c(2131232088, org.telegram.messenger.gd.N0(2131752584, null), new fu(this, 7), false);
        I.k();
        I.c(2131232488, org.telegram.messenger.gd.N0(2131748080, null), new fu(this, 8), false);
        int i16 = 9;
        I.c(2131232509, org.telegram.messenger.gd.N0(2131745705, null), new fu(this, 9), false);
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.f27012a;
        if (((org.telegram.messenger.h0) getMessagesController().A7.f26254p0.f17372b).f24439c) {
            I.c(2131231278, org.telegram.messenger.gd.N0(2131742943, null), new yu(this, 15), false);
        } else {
            TLRPC.TL_attachMenuBots tL_attachMenuBots = org.telegram.messenger.ri.d0(org.telegram.messenger.i10.f24637t0).f26700b;
            if (launchActivity != null && tL_attachMenuBots != null && (arrayList = tL_attachMenuBots.bots) != null && !arrayList.isEmpty()) {
                ArrayList<TLRPC.TL_attachMenuBot> arrayList3 = tL_attachMenuBots.bots;
                int size = arrayList3.size();
                int i17 = 0;
                while (i17 < size) {
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList3.get(i17);
                    i17++;
                    TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                    if (tL_attachMenuBot2.show_in_side_menu) {
                        uu uuVar2 = new uu(this, tL_attachMenuBot2, launchActivity, i14);
                        org.telegram.ui.Components.voip.o oVar2 = new org.telegram.ui.Components.voip.o(i16, this, tL_attachMenuBot2);
                        org.telegram.ui.ActionBar.i6 i6Var2 = I.d;
                        f10 = f11;
                        if (I.f41866e == null) {
                            arrayList2 = arrayList3;
                            launchActivity2 = launchActivity;
                            i11 = size;
                        } else {
                            int i18 = org.telegram.ui.ActionBar.n6.F8;
                            int i19 = org.telegram.ui.ActionBar.n6.E8;
                            org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, I.f41866e, I.d, false, false);
                            y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), i15, org.telegram.messenger.g0.L(18.0f), i15);
                            if (tL_attachMenuBot2.side_menu_disclaimer_needed) {
                                charSequence = org.telegram.ui.Cells.m8.b(tL_attachMenuBot2.short_name);
                            } else {
                                charSequence = tL_attachMenuBot2.short_name;
                            }
                            Pattern pattern = org.telegram.messenger.ri.U1;
                            ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList4 = tL_attachMenuBot2.icons;
                            int size2 = arrayList4.size();
                            arrayList2 = arrayList3;
                            int i20 = 0;
                            while (true) {
                                if (i20 < size2) {
                                    TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = arrayList4.get(i20);
                                    int i21 = i20 + 1;
                                    TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon3 = tL_attachMenuBotIcon2;
                                    launchActivity2 = launchActivity;
                                    if (tL_attachMenuBotIcon3.name.equals("android_side_menu_static")) {
                                        tL_attachMenuBotIcon = tL_attachMenuBotIcon3;
                                        break;
                                    } else {
                                        i20 = i21;
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
                                org.telegram.messenger.kz f12 = org.telegram.messenger.u5.f(tL_attachMenuBotIcon.icon, org.telegram.ui.ActionBar.n6.f29434c7, 1.0f, null);
                                if (f12 != null) {
                                    Integer num = I.f41883n0;
                                    if (num != null) {
                                        w05 = num.intValue();
                                    } else {
                                        w05 = org.telegram.ui.ActionBar.n6.w0(i18, i6Var2);
                                    }
                                    new PorterDuffColorFilter(w05, PorterDuff.Mode.SRC_IN);
                                }
                                org.telegram.messenger.fc b10 = org.telegram.messenger.fc.b(tL_attachMenuBotIcon.icon);
                                uuVar = uuVar2;
                                oVar = oVar2;
                                y0Var.k(charSequence, b10, "24_24", f12, tL_attachMenuBot2);
                                org.telegram.ui.Components.p9 p9Var = y0Var.h;
                                if (p9Var != null) {
                                    if (org.telegram.messenger.gd.f24314a0) {
                                        i12 = 5;
                                    } else {
                                        i12 = 3;
                                    }
                                    p9Var.setLayoutParams(c8.na.e(24, 24, i12 | 16));
                                }
                            } else {
                                i11 = size;
                                uuVar = uuVar2;
                                oVar = oVar2;
                                y0Var.j(charSequence, 2131232077, null);
                            }
                            Integer num2 = I.m0;
                            if (num2 == null && I.f41883n0 == null) {
                                y0Var.c(i19, i18);
                            } else {
                                if (num2 != null) {
                                    w02 = num2.intValue();
                                } else {
                                    w02 = org.telegram.ui.ActionBar.n6.w0(i19, i6Var2);
                                }
                                Integer num3 = I.f41883n0;
                                if (num3 != null) {
                                    w03 = num3.intValue();
                                } else {
                                    w03 = org.telegram.ui.ActionBar.n6.w0(i18, i6Var2);
                                }
                                y0Var.d(w02, w03);
                            }
                            Integer num4 = I.f41883n0;
                            if (num4 != null) {
                                w04 = num4.intValue();
                            } else {
                                w04 = org.telegram.ui.ActionBar.n6.w0(i18, i6Var2);
                            }
                            y0Var.setIconColorImage(w04);
                            Integer num5 = I.f41885o0;
                            if (num5 != null) {
                                y0Var.setSelectorColor(num5.intValue());
                            } else {
                                y0Var.h(0.12f, i19);
                            }
                            y0Var.setOnClickListener(new org.telegram.ui.Components.l8(18, I, uuVar));
                            c10 = 3;
                            y0Var.setOnLongClickListener(new fi.z1(3, I, oVar));
                            int i22 = I.V;
                            if (i22 > 0) {
                                y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i22));
                                I.r(y0Var, c8.na.o(I.V, -2));
                            } else {
                                I.r(y0Var, c8.na.o(-1, -2));
                            }
                            c11 = c10;
                            f11 = f10;
                            arrayList3 = arrayList2;
                            launchActivity = launchActivity2;
                            size = i11;
                            i16 = 9;
                            i14 = 1;
                            i15 = 0;
                        }
                    } else {
                        arrayList2 = arrayList3;
                        launchActivity2 = launchActivity;
                        i11 = size;
                        f10 = f11;
                    }
                    c10 = c11;
                    c11 = c10;
                    f11 = f10;
                    arrayList3 = arrayList2;
                    launchActivity = launchActivity2;
                    size = i11;
                    i16 = 9;
                    i14 = 1;
                    i15 = 0;
                }
            }
        }
        float f13 = f11;
        if (getUserConfig().X) {
            I.c(2131232366, org.telegram.messenger.gd.N0(2131745299, null), new fu(this, 0), false);
        }
        org.telegram.ui.ActionBar.y0 y0Var2 = this.f46595p0;
        if (y0Var2 != null) {
            org.telegram.ui.ActionBar.u6.U(y0Var2.f30345b, org.telegram.ui.ActionBar.n6.Ri, getResourceProvider());
            this.f46595p0.setOnClickListener(new org.telegram.ui.Components.p31(10, this, I));
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.f27013b.getSharedPreferences("mainconfig", 0);
            String string = sharedPreferences.getString("proxy_ip", "");
            if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().B3 && !org.telegram.messenger.bz.f23341z1.isEmpty())) {
                I.k();
                I.d(this.f46595p0);
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
                    String N0 = org.telegram.messenger.gd.N0(2131749126, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                    t1Var.S = N0;
                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131749127, null));
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131749357, null), new iu(this, 6));
                    showDialog(t1Var, new mu(this, 0));
                    this.W3 = str;
                    return;
                }
            }
        }
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.x60 x60Var = this.M0;
        if (x60Var != null) {
            x60Var.v();
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
        boolean x10 = this.actionBar.x();
        ArrayList arrayList = this.K2;
        boolean z11 = true;
        if (x10) {
            if (arrayList.isEmpty()) {
                p4(true);
                return;
            }
        } else {
            if (this.f46615s3) {
                X3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.s4)) {
                    this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
                }
            } else {
                X3(null);
            }
            org.telegram.messenger.g0.v1(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6));
            this.actionBar.R(null, null);
            int i11 = this.f46549f0[0].f45829s;
            if ((i11 != 7 && i11 != 8) || (this.actionBar.x() && !this.actionBar.y(null))) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 && y4(this.f46549f0[0])) {
                org.telegram.messenger.ro h42 = h4(this.f46549f0[0]);
                ArrayList arrayList2 = getMessagesController().f25904y;
                int size = arrayList2.size();
                i7 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i12);
                    if (!(dialog instanceof TLRPC.TL_dialogFolder) && h42.f26780j.get(dialog.f28496id, Integer.MIN_VALUE) != Integer.MIN_VALUE) {
                        long j10 = dialog.f28496id;
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
                    Y0 = d4(this.currentAccount, this.f46549f0[0].f45829s, this.Y2, this.U1);
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
                        } else if (!getMessagesController().I2(dialog2.f28496id, false)) {
                            break;
                        }
                    }
                }
            }
            if (i7 > 1) {
                if (this.f46549f0 != null) {
                    int i14 = 0;
                    while (true) {
                        ax[] axVarArr = this.f46549f0;
                        if (i14 >= axVarArr.length) {
                            break;
                        }
                        axVarArr[i14].d.I = true;
                        i14++;
                    }
                }
                int i15 = org.telegram.messenger.mp.I8;
                D5(131072, true);
            }
            if (!this.f46615s3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList3 = new ArrayList();
                int i16 = 0;
                while (true) {
                    ArrayList arrayList4 = this.f46574k1;
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
            ValueAnimator valueAnimator = this.f46642x3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f46642x3 = ValueAnimator.ofFloat(this.f46636w3, 1.0f);
            int i17 = 0;
            while (true) {
                ax[] axVarArr2 = this.f46549f0;
                if (i17 >= axVarArr2.length) {
                    break;
                }
                ax axVar = axVarArr2[i17];
                if (axVar != null) {
                    axVar.f45822a.I0(true);
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
            this.f46642x3.addUpdateListener(new ju(this, max, 0));
            this.f46642x3.addListener(new ew(this, max, 1));
            this.f46642x3.setInterpolator(org.telegram.ui.Components.kr.f36858f);
            this.f46642x3.setDuration(200L);
            this.f46642x3.start();
            qw qwVar = this.A0;
            if (qwVar != null) {
                qwVar.c(org.telegram.ui.ActionBar.n6.f29835xi, org.telegram.ui.ActionBar.n6.f29816wi, org.telegram.ui.ActionBar.n6.f29797vi, org.telegram.ui.ActionBar.n6.f29854yi, org.telegram.ui.ActionBar.n6.f29807w8);
            }
            org.telegram.ui.ActionBar.x1 x1Var = this.f46555g1;
            if (x1Var != null) {
                x1Var.c(true, 1.0f);
            }
            z11 = false;
        }
        n5(false);
        this.f46570j1.a(arrayList.size(), z11);
    }

    @Override
    public final org.telegram.ui.ActionBar.n4 getBackButtonState() {
        if (!t4() && !this.H3.f54123f) {
            return org.telegram.ui.ActionBar.n4.f29348b;
        }
        return org.telegram.ui.ActionBar.n4.f29347a;
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f10) {
        int i7;
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f46531b4, 1.0f);
            this.f46547e4 = ofFloat;
            return ofFloat;
        }
        if (getLayoutContainer() != null && getLayoutContainer().getMeasuredWidth() > 0) {
            i7 = (int) Utilities.i((200.0f / getLayoutContainer().getMeasuredWidth()) * f10, 200.0f, 80.0f);
        } else {
            i7 = 150;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f46531b4, 1.0f);
        this.f46547e4 = ofFloat2;
        ofFloat2.addUpdateListener(new ku(this, 1));
        this.f46547e4.setInterpolator(org.telegram.ui.Components.kr.f36859g);
        this.f46547e4.setDuration(i7);
        this.f46547e4.start();
        return this.f46547e4;
    }

    @Override
    public final java.util.ArrayList getThemeDescriptions() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bx.getThemeDescriptions():java.util.ArrayList");
    }

    public final org.telegram.messenger.ro h4(ax axVar) {
        char c10;
        if (axVar != null) {
            int i7 = axVar.f45829s;
            if (i7 == 7 || i7 == 8) {
                org.telegram.messenger.ro[] roVarArr = getMessagesController().N;
                if (axVar.f45829s == 8) {
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
        org.telegram.ui.Components.fc K;
        int i7 = -this.N3;
        this.N3 = i7;
        org.telegram.messenger.g0.E3(i7, view, null);
        org.telegram.messenger.q2.APP_ERROR.a();
        if (j3 >= 0) {
            str = org.telegram.messenger.n10.q(org.telegram.messenger.mp.u1(this.currentAccount).c2(Long.valueOf(j3)));
        } else {
            str = "";
        }
        if (getMessagesController().K3()) {
            K = org.telegram.ui.Components.kc.b0(this).Q(2131624217, 36, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131743513, str)));
        } else {
            K = org.telegram.ui.Components.kc.b0(this).K(2131624217, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131743513, str)), org.telegram.messenger.gd.N0(2131743512, null), new fu(this, 15));
        }
        K.j();
    }

    public final float i4() {
        wv wvVar = this.H3;
        if (wvVar != null && wvVar.c()) {
            return this.H3.f54122e;
        }
        return 0.0f;
    }

    public final void i5(boolean r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bx.i5(boolean, boolean, boolean, boolean):void");
    }

    @Override
    public final boolean isLightStatusBar() {
        wv wvVar;
        if (!this.f46579l2 && (wvVar = this.H3) != null && wvVar.getFragment() != null) {
            return this.H3.getFragment().isLightStatusBar();
        }
        if (i0.a.h(getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final float j4() {
        return -org.telegram.messenger.g0.W1(this.f46526b.f57779e, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(48.0f));
    }

    public final void j5() {
        int i7;
        int i10;
        Long l10;
        if (this.N0 == null && !org.telegram.messenger.bz.f23333x && (!this.L || this.F0.g())) {
            h11[] h11VarArr = new h11[1];
            TLRPC.User f10 = org.telegram.messenger.i10.i(org.telegram.messenger.i10.f24637t0).f();
            org.telegram.ui.ActionBar.n5 titleTextView = this.actionBar.getTitleTextView();
            if (titleTextView != null && titleTextView.getRightDrawable() != null) {
                this.F3.f();
                Drawable drawable = this.F3.f37376f[0];
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
            xv xvVar = new xv(this, this, getParentActivity(), Integer.valueOf(i7), getResourceProvider(), h11VarArr);
            if (f10 != null && org.telegram.messenger.n5.g(f10.emoji_status) > 0) {
                xvVar.setExpireDateHint(org.telegram.messenger.n5.g(f10.emoji_status));
            }
            Long l11 = this.D3;
            if (l11 != null) {
                xvVar.setSelected(l11);
            } else {
                Drawable drawable2 = this.F3.f37376f[0];
                if (drawable2 instanceof org.telegram.ui.Components.o5) {
                    l10 = Long.valueOf(((org.telegram.ui.Components.o5) drawable2).h());
                } else {
                    l10 = null;
                }
                xvVar.setSelected(l10);
            }
            xvVar.setSaveState(1);
            xvVar.y(this.F3, titleTextView);
            yv yvVar = new yv(this, xvVar);
            this.N0 = yvVar;
            h11VarArr[0] = yvVar;
            yvVar.showAsDropDown(this.actionBar, org.telegram.messenger.g0.L(16.0f), i10, 48);
            h11VarArr[0].b();
        }
    }

    @Override
    public final ui.f k() {
        return this.f46599p4;
    }

    public final fi.p6 k4() {
        return getMessagesController().R1();
    }

    public final void k5(org.telegram.tgnet.TLRPC.Chat r14, java.lang.Runnable r15, java.lang.Runnable r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bx.k5(org.telegram.tgnet.TLRPC$Chat, java.lang.Runnable, java.lang.Runnable):void");
    }

    public final UndoView l4() {
        Z3();
        UndoView[] undoViewArr = this.f46650z0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.d(2, true);
            uw uwVar = (uw) this.fragmentView;
            uwVar.removeView(undoViewArr[0]);
            uwVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void l5(boolean z10) {
        ax[] axVarArr;
        char c10;
        char c11;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            axVarArr = this.f46549f0;
            if (i10 >= axVarArr.length) {
                break;
            }
            axVarArr[i10].f45822a.C0();
            i10++;
        }
        if (z10 && axVarArr.length > 1) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        int i11 = axVarArr[c10].h;
        if (i11 >= 0 && i11 < getMessagesController().V0().size()) {
            org.telegram.messenger.ro roVar = (org.telegram.messenger.ro) getMessagesController().V0().get(this.f46549f0[c10].h);
            if (roVar.d()) {
                ax axVar = this.f46549f0[c10];
                axVar.f45829s = this.T0;
                xw xwVar = axVar.f45822a;
                int i12 = xw.C3;
                xwVar.D1();
            } else {
                ax[] axVarArr2 = this.f46549f0;
                if (axVarArr2[c10 ^ 1].f45829s == 7) {
                    axVarArr2[c10].f45829s = 8;
                } else {
                    axVarArr2[c10].f45829s = 7;
                }
                axVarArr2[c10].f45822a.setScrollEnabled(true);
                org.telegram.messenger.mp messagesController = getMessagesController();
                if (this.f46549f0[c10].f45829s == 8) {
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
                            roVar2.f26781k.clear();
                            roVar2.f26782l.clear();
                        }
                    } else {
                        messagesController.f5(null);
                    }
                }
            }
            ax[] axVarArr3 = this.f46549f0;
            if (axVarArr3.length > 1) {
                axVarArr3[1].F = roVar.f26786p;
            }
            ax axVar2 = axVarArr3[c10];
            jv jvVar = axVar2.d;
            jvVar.h = axVar2.f45829s;
            jvVar.f();
            ax axVar3 = this.f46549f0[c10];
            fv fvVar = axVar3.f45824c;
            if (axVar3.f45829s == 0 && n4() && this.f46549f0[c10].f45830w == 2) {
                i7 = 1;
            }
            fvVar.h1(i7, (int) this.O);
            C3(this.f46549f0[c10]);
        }
    }

    public final org.telegram.messenger.ro m4() {
        ax[] axVarArr = this.f46549f0;
        if (axVarArr != null && axVarArr[0] != null) {
            ArrayList V0 = getMessagesController().V0();
            int i7 = this.S3;
            if (i7 < 0) {
                i7 = this.f46549f0[0].h;
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
        dz0 dz0Var = this.f46521a0;
        if (dz0Var != null && dz0Var.getVisibility() != 8) {
            f10 = this.f46521a0.getMeasuredHeight();
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
            float f21 = this.f46651z1;
            f12 = (f10 * f21) + com.google.android.gms.internal.vision.e2.z(1.0f, f21, f11, f20);
            f13 = this.f46653z3;
        } else {
            f12 = (f10 * this.f46651z1) + this.O;
            f13 = this.f46653z3;
        }
        float f22 = f12 + f13 + this.U;
        pw pwVar = this.Y;
        if (pwVar != null && pwVar.getVisibility() == 0) {
            f14 = this.Y.getAlpha();
        } else {
            f14 = 0.0f;
        }
        float L = org.telegram.messenger.g0.L(4.0f) * f14;
        qw qwVar = this.A0;
        if (qwVar != null) {
            qwVar.setTranslationY(f22 - L);
            f16 = this.A0.getAlpha();
            f17 = (this.A0.getUnreadOnlyBannerHeight() + org.telegram.messenger.g0.L(43.0f)) * f16;
            f15 = f22 + f17;
        } else {
            f15 = f22;
            f16 = 0.0f;
            f17 = 0.0f;
        }
        org.telegram.ui.Components.bs bsVar = this.L1;
        if (bsVar != null) {
            float f23 = f15 - L;
            int i10 = -org.telegram.messenger.g0.L(3.0f);
            if (this.f46527b0 == null) {
                i7 = org.telegram.messenger.g0.L(44.0f);
            } else {
                i7 = 0;
            }
            bsVar.setTranslationY(org.telegram.messenger.g0.T1(f23, i10 - i7, this.f46526b.f57779e));
            f18 = this.L1.getMetadata().f57795c.f57805a;
            f19 = this.L1.d(0.0f);
        } else {
            f18 = 0.0f;
            f19 = 0.0f;
        }
        org.telegram.ui.Components.as asVar = this.M1;
        if (asVar != null) {
            asVar.setTranslationY(f22 - L);
            float W1 = org.telegram.messenger.g0.W1(Math.min(f18, f16), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(50.0f));
            org.telegram.ui.Components.as asVar2 = this.M1;
            float min = Math.min(org.telegram.messenger.g0.L(40.0f), (f19 + f17) - W1);
            Matrix matrix = asVar2.f33542b;
            if (asVar2.f33544e != W1 || asVar2.f33545f != min) {
                asVar2.f33544e = W1;
                asVar2.f33545f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, W1);
                LinearGradient linearGradient = asVar2.f33543c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                asVar2.invalidate();
            }
            this.M1.setAlpha(Math.max(f16, f18));
        }
    }

    public final boolean n4() {
        if (!this.f46588n2 && this.T0 == 0 && this.f46524a3 == 0 && this.Y2 == 0) {
            org.telegram.messenger.mp messagesController = getMessagesController();
            messagesController.getClass();
            if (org.telegram.messenger.bz.f23315q1 && messagesController.R.f(2305843009213693952L | 1) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void n5(boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bx.n5(boolean):void");
    }

    public final boolean o4() {
        ArrayList arrayList = this.F2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void o5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bx.o5():void");
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
                jw jwVar = this.D0;
                if (jwVar != null) {
                    jwVar.Q();
                    return false;
                }
            }
        } else {
            org.telegram.ui.Components.x60 x60Var = this.M0;
            if (x60Var != null) {
                if (z10) {
                    x60Var.v();
                    this.M0 = null;
                    return false;
                }
            } else {
                qw qwVar = this.A0;
                if (qwVar != null && qwVar.f38306n) {
                    if (z10) {
                        qwVar.setIsEditing(false);
                        c5(false);
                        return false;
                    }
                } else {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar != null && kVar.x()) {
                        if (z10) {
                            jw jwVar2 = this.D0;
                            if (jwVar2 != null && jwVar2.getVisibility() == 0) {
                                this.D0.P(false);
                            }
                            p4(true);
                            return false;
                        }
                    } else if (this.f46526b.f57780f) {
                        if (z10) {
                            this.Y.f33883r.getText().clear();
                            this.Z.b(false);
                            this.Y.f33883r.clearFocus();
                            return false;
                        }
                    } else {
                        qw qwVar2 = this.A0;
                        if (qwVar2 != null && qwVar2.getVisibility() == 0 && !this.j3) {
                            qw qwVar3 = this.A0;
                            if (!qwVar3.P && !this.f46594o3) {
                                ArrayList arrayList = qwVar3.h;
                                if (!arrayList.isEmpty() && qwVar3.M != ((org.telegram.ui.Components.lz) arrayList.get(0)).f37261a) {
                                    if (z10) {
                                        qw qwVar4 = this.A0;
                                        ArrayList arrayList2 = qwVar4.h;
                                        if (!arrayList2.isEmpty()) {
                                            qwVar4.g((org.telegram.ui.Components.lz) arrayList2.get(0), 0);
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        mv mvVar = this.D1;
                        if (mvVar != null && mvVar.T0()) {
                            if (z10) {
                                this.D1.L0(true);
                            }
                        } else {
                            sv svVar = this.F0;
                            if (svVar.P == 0 && svVar.T.L0() != 0) {
                                svVar.h.y0(0);
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
        tv tvVar;
        qw qwVar;
        if (this.X1) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.n(true);
            }
            TLObject tLObject = this.Z1;
            if (tLObject != null) {
                jw jwVar = this.D0;
                if (jwVar != null) {
                    jwVar.f40085e0.Q(this.Y1, tLObject);
                }
                this.Z1 = null;
            }
            this.X1 = false;
        }
        if (!this.L && (qwVar = this.A0) != null && qwVar.getVisibility() == 0 && this.f46605r.f57780f) {
            int i7 = (int) (-this.O);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (i7 != 0 && i7 != currentActionBarHeight && i7 >= currentActionBarHeight / 2) {
                this.f46549f0[0].f45822a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.f46650z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        if (!isInPreviewMode() && (tvVar = this.L0) != null && tvVar.getVisibility() == 0) {
            this.L0.setVisibility(8);
            this.L0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        N3();
        this.f46612s0 = true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        hi.u3 u3Var;
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
        if (this.f46612s0 && !this.f46617t0 && (u3Var = this.f46600q0) != null && this.P3) {
            this.f46617t0 = true;
            this.f46612s0 = false;
            u3Var.x();
        }
        org.telegram.messenger.g0.h3(new yu(this, 0), 200L);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.x60 x60Var = this.M0;
        if (x60Var != null) {
            x60Var.v();
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.t1 t1Var;
        super.onDialogDismiss(dialog);
        if (this.Y2 == 0 && this.f46524a3 == 0 && (t1Var = this.V1) != null && dialog == t1Var && getParentActivity() != null) {
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
            this.f46588n2 = bundle.getBoolean("onlySelect", false);
            this.f46593o2 = this.arguments.getBoolean("canSelectTopics", false);
            this.f46614s2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.T0 = this.arguments.getInt("dialogsType", 0);
            this.P0 = this.arguments.getBoolean("quote", false);
            this.O0 = this.arguments.getBoolean("reply_to", false);
            this.Q0 = this.arguments.getLong("reply_to_author", 0L);
            this.R0 = this.arguments.getLong("reply_to_channel_direct", 0L);
            this.S0 = this.arguments.getLong("forward_into_channel", 0L);
            this.f46561h2 = this.arguments.getString("selectAlertString");
            this.f46566i2 = this.arguments.getString("selectAlertStringGroup");
            this.f46571j2 = this.arguments.getString("addToGroupAlertString");
            this.f46619t2 = this.arguments.getBoolean("allowSwitchAccount");
            this.f46624u2 = this.arguments.getBoolean("checkCanWrite", true);
            this.f46629v2 = this.arguments.getBoolean("afterSignup", false);
            this.Y2 = this.arguments.getInt("folderId", 0);
            long j3 = this.arguments.getLong("community_id", 0L);
            this.f46524a3 = j3;
            if (j3 != 0) {
                this.f46530b3 = getMessagesController().O0(Long.valueOf(this.f46524a3));
                this.f46536c3 = getMessagesController().P0(this.f46524a3);
            }
            this.f46575k2 = this.arguments.getBoolean("resetDelegate", true);
            this.U0 = this.arguments.getInt("messagesCount", 0);
            this.V0 = this.arguments.getInt("hasPoll", 0);
            this.W0 = this.arguments.getBoolean("hasInvoice", false);
            this.f46635w2 = this.arguments.getBoolean("showSetPasswordConfirm", this.f46635w2);
            this.arguments.getInt("otherwiseRelogin");
            this.f46641x2 = this.arguments.getBoolean("allowGroups", true);
            this.f46647y2 = this.arguments.getBoolean("allowMegagroups", true);
            this.f46652z2 = this.arguments.getBoolean("allowLegacyGroups", true);
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
        if (this.f46597p2 == null) {
            this.f46551f2 = getConnectionsManager().getConnectionState();
            this.L3.f(org.telegram.messenger.ks.f25247l4);
            if (!this.f46588n2) {
                this.L3.f(org.telegram.messenger.ks.L4);
                this.L3.f(org.telegram.messenger.ks.D4);
                this.L3.c(org.telegram.messenger.ks.R2);
                this.L3.c(org.telegram.messenger.ks.d2);
            }
            xi.e eVar = this.L3;
            eVar.c(org.telegram.messenger.ks.f25283s);
            eVar.c(org.telegram.messenger.ks.O2);
            eVar.c(org.telegram.messenger.ks.P2);
            eVar.c(org.telegram.messenger.ks.Q2);
            eVar.c(org.telegram.messenger.ks.f25276r);
            eVar.c(org.telegram.messenger.ks.Y);
            eVar.c(org.telegram.messenger.ks.O);
            eVar.c(org.telegram.messenger.ks.I2);
            eVar.c(org.telegram.messenger.ks.f25221h0);
            eVar.c(org.telegram.messenger.ks.f25209f0);
            eVar.c(org.telegram.messenger.ks.J);
            eVar.c(org.telegram.messenger.ks.K);
            eVar.c(org.telegram.messenger.ks.M);
            eVar.c(org.telegram.messenger.ks.P0);
            eVar.c(org.telegram.messenger.ks.f25284s0);
            eVar.c(org.telegram.messenger.ks.f25295t5);
            eVar.c(org.telegram.messenger.ks.S0);
            eVar.c(org.telegram.messenger.ks.T1);
            eVar.c(org.telegram.messenger.ks.f25208e5);
            eVar.c(org.telegram.messenger.ks.K2);
            eVar.c(org.telegram.messenger.ks.f25198d0);
            eVar.c(org.telegram.messenger.ks.f25285s1);
            eVar.c(org.telegram.messenger.ks.f25191b5);
            eVar.c(org.telegram.messenger.ks.f25197c5);
            eVar.c(org.telegram.messenger.ks.N);
            eVar.c(org.telegram.messenger.ks.f25269p5);
            eVar.c(org.telegram.messenger.ks.f25232i5);
            this.L3.f(org.telegram.messenger.ks.f25254n0);
        }
        xi.e eVar2 = this.L3;
        eVar2.c(org.telegram.messenger.ks.f25309w);
        eVar2.c(org.telegram.messenger.ks.V4);
        eVar2.c(org.telegram.messenger.ks.f25202d5);
        eVar2.c(org.telegram.messenger.ks.T);
        eVar2.c(org.telegram.messenger.ks.O4);
        eVar2.c(org.telegram.messenger.ks.f25315w5);
        eVar2.c(org.telegram.messenger.ks.f25329y5);
        eVar2.c(org.telegram.messenger.ks.f25189b3);
        eVar2.c(org.telegram.messenger.ks.f25212f3);
        eVar2.c(org.telegram.messenger.ks.f25237j5);
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
            if (!R1.f12403s) {
                ConnectionsManager.getInstance(R1.f12387a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new fi.o5(R1, 0));
            }
        }
        getMessagesController().h3(this.Y2);
        if (this.V3 != null && !getMessagesStorage().R) {
            qt qtVar = this.V3;
            if (qtVar.getParent() != null) {
                ((ViewGroup) qtVar.getParent()).removeView(qtVar);
            }
            this.V3 = null;
        }
        if (t4()) {
            fi.p6 R12 = getMessagesController().R1();
            if (R12.f12409z) {
                R12.T(true);
            }
        } else {
            getMessagesController().R1().W();
        }
        getContactsController().B();
        if (getMessagesController().f25846r6) {
            org.telegram.messenger.pv I1 = getMessagesController().I1();
            if (!I1.f26390e) {
                I1.g(true);
            }
        }
        if (this.f46524a3 != 0) {
            getMessagesController().b3(0, this.f46524a3, true);
        }
        org.telegram.messenger.v1 a10 = org.telegram.messenger.v1.a(this.currentAccount);
        if (!a10.f27417e) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = a10.f27415b;
            if (j10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                long j11 = currentTimeMillis - j10;
                boolean z11 = org.telegram.messenger.s2.f26829a;
                if (j11 > 43200000) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(a10.f27415b);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(currentTimeMillis);
                if (calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
            if (z10) {
                a10.f27417e = true;
                ConnectionsManager.getInstance(a10.f27414a).sendRequest(new TL_account.getBirthdays(), new org.telegram.messenger.s1(a10, 0));
            }
        }
        if (this.X) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i7 = 0;
        }
        this.f46585m4 = i7;
        if (this.X) {
            i10 = org.telegram.messenger.g0.L(64.0f);
        }
        this.f46590n4 = i10;
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
        mv mvVar = this.D1;
        if (mvVar != null) {
            mvVar.d1();
        }
        org.telegram.ui.Components.dp0 dp0Var = this.I2;
        if (dp0Var != null) {
            dp0Var.j();
        }
        org.telegram.ui.Components.voip.o oVar = this.J2;
        if (oVar != null) {
            org.telegram.messenger.g0.r(oVar);
            this.J2 = null;
        }
        UndoView undoView = this.f46650z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f46609r3.e();
        this.E2 = null;
        int i7 = org.telegram.ui.Components.p10.f38364m1;
    }

    @Override
    public final void onPanTranslationUpdate(float f10) {
        if (this.f46549f0 != null) {
            this.K0 = f10;
            mv mvVar = this.D1;
            int i7 = 0;
            if (mvVar != null && mvVar.T0()) {
                this.fragmentView.setTranslationY(f10);
                while (true) {
                    ax[] axVarArr = this.f46549f0;
                    if (i7 >= axVarArr.length) {
                        break;
                    }
                    axVarArr[i7].setTranslationY(0.0f);
                    i7++;
                }
                if (!this.f46588n2) {
                    this.actionBar.setTranslationY(0.0f);
                    org.telegram.ui.Components.fc fcVar = this.f46603q3;
                    if (fcVar != null) {
                        fcVar.l();
                    }
                }
                jw jwVar = this.D0;
                if (jwVar != null) {
                    jwVar.setTranslationY(this.J0);
                    return;
                }
                return;
            }
            while (true) {
                ax[] axVarArr2 = this.f46549f0;
                if (i7 >= axVarArr2.length) {
                    break;
                }
                axVarArr2[i7].setTranslationY(f10);
                i7++;
            }
            if (!this.f46588n2) {
                this.actionBar.setTranslationY(f10);
                org.telegram.ui.Components.fc fcVar2 = this.f46603q3;
                if (fcVar2 != null) {
                    fcVar2.l();
                }
            }
            jw jwVar2 = this.D0;
            if (jwVar2 != null) {
                jwVar2.setTranslationY(this.K0 + this.J0);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.fc fcVar = this.T;
        if (fcVar != null) {
            fcVar.b();
            this.T = null;
        }
        wv wvVar = this.H3;
        if (wvVar != null) {
            wvVar.f54125r = true;
            dw dwVar = wvVar.f54119a;
            if (dwVar != null) {
                dwVar.onPause();
            }
        }
        org.telegram.ui.Components.x60 x60Var = this.M0;
        if (x60Var != null) {
            x60Var.v();
        }
        mv mvVar = this.D1;
        if (mvVar != null) {
            mvVar.f1();
        }
        int i7 = 0;
        UndoView undoView = this.f46650z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        setBulletinDelegate(null);
        if (this.f46549f0 == null) {
            return;
        }
        while (true) {
            ax[] axVarArr = this.f46549f0;
            if (i7 < axVarArr.length) {
                axVarArr[i7].d.getClass();
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
                                hh0.J0();
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
                                org.telegram.messenger.g0.g3(new fu(this, 29));
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
            if (Build.VERSION.SDK_INT >= 30 && (b9Var = FilesMigrationService.f22712e) != null) {
                b9Var.J0();
            }
        }
    }

    @Override
    public final void onResume() {
        boolean z10;
        ax axVar;
        jv jvVar;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.Components.mm0 mm0Var;
        tv tvVar;
        super.onResume();
        sv svVar = this.F0;
        char c10 = 0;
        if (svVar != null) {
            ArrayList arrayList = svVar.f12447y;
            fi.p6 p6Var = svVar.f12438s;
            p6Var.l(p6Var.f12392g);
            p6Var.l(p6Var.h);
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                TL_stories.PeerStories y10 = p6Var.y(((fi.n) arrayList.get(i7)).f12282c);
                if (y10 != null) {
                    p6Var.a0(y10);
                }
            }
        }
        wv wvVar = this.H3;
        if (wvVar != null) {
            wvVar.f54125r = false;
            dw dwVar = wvVar.f54119a;
            if (dwVar != null) {
                dwVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (tvVar = this.L0) != null && tvVar.getVisibility() == 0) {
            this.L0.setVisibility(8);
            this.L0.setBackground(null);
        }
        if (this.f46549f0 != null) {
            int i10 = 0;
            while (true) {
                ax[] axVarArr = this.f46549f0;
                if (i10 >= axVarArr.length) {
                    break;
                }
                axVarArr[i10].d.f();
                i10++;
            }
        }
        if (this.Q3) {
            this.Q3 = false;
            getMessagesController().f5(null);
            if (this.f46549f0 != null) {
                int i11 = 0;
                while (true) {
                    ax[] axVarArr2 = this.f46549f0;
                    if (i11 >= axVarArr2.length) {
                        break;
                    }
                    axVarArr2[i11].d.f();
                    i11++;
                }
            }
        }
        C5(-1, false);
        mv mvVar = this.D1;
        if (mvVar != null) {
            mvVar.g1();
        }
        long j3 = 0;
        if (!this.f46588n2 && this.Y2 == 0 && this.f46524a3 == 0) {
            getMediaDataController().D(4);
        }
        jw jwVar = this.D0;
        if (jwVar != null && (mm0Var = jwVar.f40085e0) != null) {
            mm0Var.f();
        }
        if (!this.f46629v2 && getUserConfig().f24640a0 != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.Y2 == 0 && this.f46524a3 == 0 && this.f46545e2 && !this.f46588n2) {
            int i12 = Build.VERSION.SDK_INT;
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.f46545e2 = false;
                if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i12 <= 28 || org.telegram.messenger.s2.f26830b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
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
                if (this.f46629v2 && (z11 || z13)) {
                    j3 = 4000;
                }
                org.telegram.messenger.g0.h3(k4Var, j3);
            }
        } else if (!this.f46588n2 && this.Y2 == 0 && this.f46524a3 == 0 && org.telegram.messenger.c6.i() && !org.telegram.messenger.c6.g()) {
            if (getParentActivity() != null) {
                if (!org.telegram.messenger.mp.h1().getBoolean("askedAboutMiuiLockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i13 = org.telegram.ui.ActionBar.n6.L5;
                    alertDialog$Builder.m(2131624116, 72, getThemedColor(i13), null);
                    alertDialog$Builder.n(i13, getResourceProvider());
                    String N0 = org.telegram.messenger.gd.N0(2131747104, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                    t1Var.U = N0;
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747106, null), new iu(this, 10));
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131751760, null), new org.telegram.ui.Components.ub0(24));
                    showDialog(t1Var);
                }
            } else {
                return;
            }
        } else if (this.Y2 == 0 && this.f46524a3 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
            if (getParentActivity() != null) {
                if (!org.telegram.messenger.mp.h1().getBoolean("askedAboutFSILockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    int i14 = org.telegram.ui.ActionBar.n6.L5;
                    alertDialog$Builder2.m(2131624116, 72, getThemedColor(i14), null);
                    alertDialog$Builder2.n(i14, getResourceProvider());
                    String N02 = org.telegram.messenger.gd.N0(2131747120, null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28835a;
                    t1Var2.U = N02;
                    alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131747106, null), new iu(this, 11));
                    alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131751760, null), new org.telegram.ui.Components.ub0(25));
                    showDialog(t1Var2);
                }
            } else {
                return;
            }
        }
        d5();
        if (this.f46549f0 != null) {
            int i15 = 0;
            while (true) {
                ax[] axVarArr3 = this.f46549f0;
                if (i15 >= axVarArr3.length) {
                    break;
                }
                ax axVar2 = axVarArr3[i15];
                if (axVar2.f45829s == 0 && axVar2.f45830w == 2 && axVar2.f45824c.L0() == 0 && n4()) {
                    this.f46549f0[i15].f45824c.h1(1, (int) this.O);
                }
                if (i15 == 0) {
                    this.f46549f0[i15].d.getClass();
                } else {
                    this.f46549f0[i15].d.getClass();
                }
                i15++;
            }
        }
        f5();
        setBulletinDelegate(new z8(this, 4));
        if (this.f46615s3) {
            org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        }
        D5(0, false);
        u5(false, true);
        B5(false);
        D3();
        N3();
        if (this.A0 != null && (axVar = this.f46549f0[0]) != null && (jvVar = axVar.d) != null) {
            int i16 = jvVar.h;
            if (i16 == 7 || i16 == 8) {
                org.telegram.messenger.ro[] roVarArr = getMessagesController().N;
                if (i16 != 7) {
                    c10 = 1;
                }
                org.telegram.messenger.ro roVar = roVarArr[c10];
                if (roVar != null) {
                    this.A0.i(roVar.f26785o);
                }
            }
        }
    }

    @Override
    public final void onSlideProgress(boolean z10, float f10) {
        if (org.telegram.messenger.bz.o() <= 0) {
            boolean z11 = org.telegram.messenger.s2.f26829a;
        } else if (this.f46541d4 && this.f46547e4 == null) {
            Z4(f10);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.f46560h1.setColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6));
            y3();
            p5();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        tv tvVar;
        bx bxVar;
        wv wvVar = this.H3;
        if (wvVar != null && wvVar.c()) {
            this.H3.getFragment().onTransitionAnimationEnd(z10, z11);
        } else {
            if (z10 && (tvVar = this.L0) != null && tvVar.getVisibility() == 0) {
                this.L0.setVisibility(8);
                this.L0.setBackground(null);
            }
            if (z10 && this.f46629v2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).f43228w0.c(false);
                }
            }
        }
        if (!z10 && (bxVar = this.Z2) != null) {
            bxVar.removeSelfFromStack();
        }
        N3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        wv wvVar = this.H3;
        if (wvVar != null && wvVar.c()) {
            this.H3.getFragment().onTransitionAnimationProgress(z10, f10);
        } else {
            tv tvVar = this.L0;
            if (tvVar != null && tvVar.getVisibility() == 0) {
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
        this.actionBar.w();
        this.K2.clear();
        org.telegram.ui.ActionBar.x1 x1Var = this.f46555g1;
        boolean z12 = true;
        if (x1Var != null) {
            x1Var.c(true, 0.0f);
        }
        qw qwVar = this.A0;
        if (qwVar != null) {
            qwVar.c(org.telegram.ui.ActionBar.n6.K8, org.telegram.ui.ActionBar.n6.I8, org.telegram.ui.ActionBar.n6.J8, org.telegram.ui.ActionBar.n6.L8, org.telegram.ui.ActionBar.n6.f29451d6);
        }
        ValueAnimator valueAnimator = this.f46642x3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f46642x3 = null;
        }
        if (this.f46636w3 == 0.0f) {
            return;
        }
        W4(-f4());
        boolean z13 = false;
        int i10 = 0;
        while (true) {
            ax[] axVarArr = this.f46549f0;
            if (i10 >= axVarArr.length) {
                break;
            }
            ax axVar = axVarArr[i10];
            if (axVar != null) {
                axVar.f45822a.I0(true);
            }
            i10++;
        }
        if (this.L) {
            i7 = 81;
        } else {
            i7 = 0;
        }
        float max = Math.max(0.0f, org.telegram.messenger.g0.L(i7 + 48) + this.O);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f46636w3, 0.0f);
        this.f46642x3 = ofFloat;
        ofFloat.addUpdateListener(new ju(this, max, 1));
        this.f46642x3.addListener(new ew(this, max, 0));
        this.f46642x3.setInterpolator(org.telegram.ui.Components.kr.f36858f);
        this.f46642x3.setDuration(200L);
        this.f46642x3.start();
        this.f46522a1 = false;
        ArrayList arrayList = this.f46534c1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                org.telegram.messenger.ro roVar = (org.telegram.messenger.ro) arrayList.get(i11);
                jz.z0(roVar, roVar.f26778g, roVar.f26774b, roVar.f26775c, roVar.f26784n, roVar.f26783m, roVar.h, roVar.f26779i, roVar.f26780j, false, false, true, true, false, this, null);
                i11++;
                arrayList = arrayList;
                size = size;
                z13 = false;
                z12 = true;
                obj = null;
            }
            arrayList.clear();
        }
        if (this.f46528b1) {
            getMessagesController().u4(this.Y2, 0L, null);
            z11 = 0;
            this.f46528b1 = false;
        } else {
            z11 = 0;
        }
        n5(true);
        if (this.f46549f0 != null) {
            int i12 = z11;
            while (true) {
                ax[] axVarArr2 = this.f46549f0;
                if (i12 >= axVarArr2.length) {
                    break;
                }
                axVarArr2[i12].d.I = z11;
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
        xw xwVar;
        boolean z10;
        int i7;
        try {
            mv mvVar = this.D1;
            if (mvVar != null && mvVar.getEditField() != null) {
                this.D1.getEditField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.n6.Ne));
            }
            NumberTextView numberTextView = this.f46570j1;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29845y8));
            }
            qw qwVar = this.A0;
            int i10 = 0;
            if (qwVar != null && (qwVar.getSelectorDrawable() instanceof GradientDrawable)) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null && kVar.x()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                GradientDrawable gradientDrawable = (GradientDrawable) this.A0.getSelectorDrawable();
                if (z10) {
                    i7 = org.telegram.ui.ActionBar.n6.f29835xi;
                } else {
                    i7 = org.telegram.ui.ActionBar.n6.K8;
                }
                gradientDrawable.setColor(getThemedColor(i7));
                this.A0.invalidate();
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                if (this.Y2 != 0 || this.f46524a3 != 0) {
                    kVar2.L(getThemedColor(org.telegram.ui.ActionBar.n6.Q8), false);
                    this.actionBar.L(getThemedColor(org.telegram.ui.ActionBar.n6.R8), true);
                }
                if (this.actionBar.x()) {
                    this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6));
                }
                v5();
            }
            if (this.f46549f0 != null) {
                while (true) {
                    ax[] axVarArr = this.f46549f0;
                    if (i10 >= axVarArr.length) {
                        break;
                    }
                    ax axVar = axVarArr[i10];
                    if (axVar != null && (xwVar = axVar.f45822a) != null) {
                        xwVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6));
                    }
                    i10++;
                }
            }
            jw jwVar = this.D0;
            if (jwVar != null && (b1Var = jwVar.f40082b0) != null) {
                b1Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6));
            }
            oi.w1 w1Var = this.E1;
            if (w1Var != null) {
                w1Var.setScrimViewBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6));
            }
            hi.u3 u3Var = this.f46600q0;
            if (u3Var != null) {
                u3Var.j(getThemedColor(org.telegram.ui.ActionBar.n6.wj));
            }
            hi.u3 u3Var2 = this.f46606r0;
            if (u3Var2 != null) {
                u3Var2.j(getThemedColor(org.telegram.ui.ActionBar.n6.wj));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.f46541d4 = true;
            V4(true);
            return;
        }
        this.f46547e4 = null;
        this.f46541d4 = false;
        V4(false);
        Z4(1.0f);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.g2 g2Var) {
        boolean presentFragment = super.presentFragment(g2Var);
        if (presentFragment && this.f46549f0 != null) {
            int i7 = 0;
            while (true) {
                ax[] axVarArr = this.f46549f0;
                if (i7 >= axVarArr.length) {
                    break;
                }
                axVarArr[i7].d.getClass();
                i7++;
            }
        }
        hi.u3 u3Var = this.f46600q0;
        if (u3Var != null) {
            u3Var.f(true);
        }
        hi.u3 u3Var2 = this.f46606r0;
        if (u3Var2 != null) {
            u3Var2.f(true);
        }
        org.telegram.ui.Components.fc.e();
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
                hi.u3 u3Var = this.f46600q0;
                if (u3Var != null) {
                    u3Var.f(true);
                }
                hi.u3 u3Var2 = this.f46606r0;
                if (u3Var2 != null) {
                    u3Var2.f(true);
                }
            }
        }
    }

    public final void q5(boolean r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bx.q5(boolean, boolean):void");
    }

    public final void r5(boolean r11, java.util.ArrayList r12, java.util.ArrayList r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bx.r5(boolean, java.util.ArrayList, java.util.ArrayList, boolean, boolean):void");
    }

    public final boolean s3(long j3, View view) {
        if (this.f46588n2 && getMessagesController().y2(j3)) {
            return false;
        }
        Long valueOf = Long.valueOf(j3);
        ArrayList arrayList = this.K2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j3));
            if (view instanceof org.telegram.ui.Cells.u2) {
                ((org.telegram.ui.Cells.u2) view).e0(false, true);
            } else if (view instanceof org.telegram.ui.Cells.g6) {
                ((org.telegram.ui.Cells.g6) view).x(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j3));
        if (view instanceof org.telegram.ui.Cells.u2) {
            ((org.telegram.ui.Cells.u2) view).e0(true, true);
        } else if (view instanceof org.telegram.ui.Cells.g6) {
            ((org.telegram.ui.Cells.g6) view).x(true, true);
        }
        return true;
    }

    public final boolean s4() {
        if (this.A0 != null && this.T0 == 0 && !this.f46588n2 && this.Y2 == 0 && this.f46524a3 == 0 && getMessagesController().q2()) {
            return true;
        }
        return false;
    }

    public final void s5() {
        float f10 = (((-this.f46577k4) - this.f46590n4) - this.f46634w1) - this.f46640x1;
        org.telegram.ui.Components.a10 a10Var = this.f46622u0;
        if (a10Var != null) {
            a10Var.setTranslationY(f10);
        }
        org.telegram.ui.Components.a10 a10Var2 = this.f46627v0;
        if (a10Var2 != null) {
            a10Var2.setTranslationY(f10 - org.telegram.messenger.g0.L(52.0f));
            hi.u3 u3Var = this.f46600q0;
            if (u3Var != null) {
                u3Var.setTranslationY(f10 - org.telegram.messenger.g0.L(52.0f));
            }
        }
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        sv svVar = this.F0;
        if (svVar != null) {
            if (this.H0 && !z10) {
                svVar.setVisibility(0);
            } else {
                svVar.setVisibility(8);
            }
        }
        t5(true);
        o5();
    }

    @Override
    public final void setTitleOverlayText(java.lang.String r6, int r7, java.lang.Runnable r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bx.setTitleOverlayText(java.lang.String, int, java.lang.Runnable):void");
    }

    public final void t3(jg.o0 o0Var) {
        jw jwVar;
        if (this.f46615s3 && (jwVar = this.D0) != null) {
            ArrayList arrayList = jwVar.D0;
            if (!arrayList.isEmpty()) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    if (o0Var.b((jg.o0) arrayList.get(i7))) {
                        return;
                    }
                }
            }
            arrayList.add(o0Var);
            pw pwVar = this.Y;
            ArrayList arrayList2 = pwVar.G;
            arrayList2.add(o0Var);
            pwVar.J = arrayList2.size() - 1;
            pwVar.e();
            this.Y.f33883r.getText().clear();
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
        boolean z12 = this.f46588n2;
        if ((!z12 || this.T0 == 10) && this.Y2 == 0 && this.f46524a3 == 0 && !this.inPreviewMode && ((!this.f46579l2 || z12) && !this.Y3)) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.a10 a10Var = this.f46622u0;
        if (a10Var != null) {
            a10Var.e(z11, z10);
        }
        org.telegram.ui.Components.a10 a10Var2 = this.f46627v0;
        if (a10Var2 != null) {
            a10Var2.e(z11, z10);
        }
    }

    public final void u3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            ArrayList arrayList = new ArrayList();
            if (this.Y2 == 0 && this.f46524a3 == 0 && Build.VERSION.SDK_INT >= 33 && hh0.K0(parentActivity)) {
                if (z10) {
                    showDialog(new hh0(parentActivity, !c8.oa.a(), new ru(parentActivity, 1)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            if (getUserConfig().V && this.W1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z10) {
                    org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.b5.v(parentActivity, new wu(this, 0)).f28835a;
                    this.V1 = t1Var;
                    showDialog(t1Var);
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
            } else if ((i7 <= 28 || org.telegram.messenger.s2.f26830b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
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
        if (!org.telegram.messenger.n10.v(c22)) {
            return false;
        }
        ArrayList l10 = org.telegram.messenger.mp.u1(this.currentAccount).f25864t7.l(-c22.f28641id);
        if ((l10 != null && !l10.isEmpty()) || !org.telegram.messenger.mp.u1(this.currentAccount).f25864t7.e(-c22.f28641id)) {
            return false;
        }
        return true;
    }

    public final void u5(boolean z10, boolean z11) {
        boolean z12;
        int i7;
        if (this.f46591o0 != null) {
            org.telegram.ui.ActionBar.q0 q0Var = this.f46587n0;
            if (q0Var == null || q0Var.getVisibility() != 0) {
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
                if (getDownloadController().J.size() <= 0 && !z12 && (this.f46559h0.getVisibility() != 0 || this.f46559h0.getAlpha() != 1.0f || z11)) {
                    this.f46569j0 = false;
                } else {
                    this.f46569j0 = true;
                }
                J3();
                boolean z14 = org.telegram.messenger.t0.f27013b.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i11 = this.f46551f2;
                if (i11 == 3 || i11 == 5) {
                    z13 = true;
                }
                org.telegram.ui.ActionBar.y0 y0Var = this.f46595p0;
                if (z14) {
                    if (z13) {
                        i7 = 2131748415;
                    } else {
                        i7 = 2131748414;
                    }
                } else {
                    i7 = 2131748413;
                }
                y0Var.setSubtext(org.telegram.messenger.gd.N0(i7, null));
                this.f46591o0.b(z14, z13, z10);
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
                org.telegram.ui.Components.dp0 dp0Var = new org.telegram.ui.Components.dp0(getParentActivity(), getResourceProvider());
                this.I2 = dp0Var;
                dp0Var.setLayoutClickListener(new hu(this, 0));
                this.I2.setOnModeChangeListener(new iu(this, 0));
                mv mvVar = this.D1;
                org.telegram.ui.Components.dp0 dp0Var2 = this.I2;
                if (dp0Var2 == null) {
                    mvVar.getClass();
                } else {
                    mvVar.f32807w2 = dp0Var2;
                    mvVar.addView(dp0Var2, 0, c8.na.e(-1, 48, 51));
                    mvVar.W3 = false;
                    mvVar.S();
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
                    org.telegram.ui.Components.dp0 dp0Var3 = this.I2;
                    dp0Var3.g(this.currentAccount);
                    if (!str.isEmpty()) {
                        dp0Var3.e(str, true);
                    }
                } else {
                    CharSequence charSequence2 = this.H2;
                    if (charSequence2 != null) {
                        org.telegram.ui.Components.dp0 dp0Var4 = this.I2;
                        dp0Var4.g(this.currentAccount);
                        if (charSequence2.length() > 0) {
                            dp0Var4.e(charSequence2, true);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.D1.setFieldText(charSequence);
            }
            mv mvVar2 = this.D1;
            if (o4()) {
                i7 = 2131754451;
            } else {
                i7 = 2131745266;
            }
            mvVar2.setOverrideHint(org.telegram.messenger.gd.N0(i7, null));
            H3();
            if (this.I2.getMode() != 0) {
                this.D1.e2(false, false);
            }
            x5();
        }
    }

    public final boolean v4(TLRPC.Dialog dialog) {
        char c10;
        if (dialog == null) {
            return false;
        }
        int i7 = this.f46549f0[0].f45829s;
        org.telegram.messenger.ro roVar = null;
        if ((i7 == 7 || i7 == 8) && (!this.actionBar.x() || this.actionBar.y(null))) {
            org.telegram.messenger.ro[] roVarArr = getMessagesController().N;
            if (this.f46549f0[0].f45829s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            roVar = roVarArr[c10];
        }
        if (roVar != null) {
            if (roVar.f26780j.indexOfKey(dialog.f28496id) < 0) {
                return false;
            }
            return true;
        }
        return dialog.pinned;
    }

    public final void v5() {
        int i7;
        int i10;
        if (this.f46625u3 && this.actionBar != null) {
            if (this.Y2 == 0 && this.f46524a3 == 0) {
                i7 = org.telegram.ui.ActionBar.n6.f29788v8;
            } else {
                i7 = org.telegram.ui.ActionBar.n6.O8;
            }
            int themedColor = getThemedColor(i7);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.n6.f29845y8;
            kVar.F(i0.a.f(this.f46651z1, themedColor, getThemedColor(i11)), false);
            this.actionBar.F(i0.a.f(this.f46651z1, getThemedColor(i11), getThemedColor(i11)), true);
            if (this.Y2 == 0 && this.f46524a3 == 0) {
                i10 = org.telegram.ui.ActionBar.n6.f29749t8;
            } else {
                i10 = org.telegram.ui.ActionBar.n6.N8;
            }
            int themedColor2 = getThemedColor(i10);
            this.actionBar.E(i0.a.f(this.f46651z1, themedColor2, getThemedColor(org.telegram.ui.ActionBar.n6.f29864z8)), false);
        }
    }

    public final int w3() {
        if (this.D1 != null) {
            return (int) (this.A1.getInputBubbleHeight() + this.f46632w.d() + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(2.0f));
        } else if (this.f46524a3 != 0) {
            return org.telegram.messenger.g0.L(72.0f) + this.f46577k4;
        } else {
            return this.f46577k4 + this.f46585m4;
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
        org.telegram.ui.Components.dp0 dp0Var;
        int i7;
        mv mvVar = this.D1;
        ArrayList arrayList = this.K2;
        if (mvVar != null) {
            this.f46586n.a(!arrayList.isEmpty(), true);
            x5();
            if (arrayList.isEmpty()) {
                if (this.T0 == 3 && this.f46561h2 == null) {
                    i7 = 2131750558;
                } else {
                    i7 = 2131745473;
                }
                String N0 = org.telegram.messenger.gd.N0(i7, null);
                if (this.U3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(N0);
                } else {
                    this.actionBar.N(N0, true, 350L, org.telegram.ui.Components.kr.h);
                }
                if (this.D1.getTag() != null) {
                    this.D1.M0(false, false, false);
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
                    if (!this.f46525a4 && (dp0Var = this.I2) != null) {
                        this.f46525a4 = true;
                        String N02 = org.telegram.messenger.gd.N0(2131745233, null);
                        dp0Var.j();
                        dp0Var.G = N02;
                        hi.s1 s1Var = dp0Var.f34421a[0];
                        if (N02 != null) {
                            ((org.telegram.ui.ActionBar.n5) s1Var.f15367f).l(N02, false);
                        }
                        org.telegram.ui.Components.eb0 eb0Var = new org.telegram.ui.Components.eb0(dp0Var, 29);
                        dp0Var.H = eb0Var;
                        org.telegram.messenger.g0.h3(eb0Var, 1000L);
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
                this.D1.B2();
                if (this.U3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(org.telegram.messenger.gd.G(arrayList.size(), "Recipient", new Object[0]));
                } else {
                    this.actionBar.N(org.telegram.messenger.gd.G(arrayList.size(), "Recipient", new Object[0]), false, 350L, org.telegram.ui.Components.kr.h);
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
        if (this.E2 == null && this.f46597p2 == null) {
            return true;
        }
        return false;
    }

    public final void x5() {
        org.telegram.ui.Components.dp0 dp0Var = this.I2;
        if (dp0Var != null) {
            int i7 = this.currentAccount;
            dp0Var.h(i7);
            dp0Var.d = org.telegram.messenger.i10.i(org.telegram.messenger.c.a(i7).f23343a).e();
            ArrayList arrayList = dp0Var.f34425f;
            arrayList.clear();
            ArrayList arrayList2 = this.K2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            hi.s1 s1Var = dp0Var.f34421a[0];
            if (dp0Var.f34422b == 1) {
                ((org.telegram.ui.ActionBar.n5) s1Var.f15366e).l(dp0Var.c(s1Var), false);
            }
        }
    }

    public final void y3() {
        int themedColor;
        org.telegram.ui.Components.nf0 nf0Var;
        iv ivVar;
        org.telegram.ui.Components.mm0 mm0Var;
        d61 d61Var;
        jw jwVar = this.D0;
        if (jwVar != null && (mm0Var = jwVar.f40085e0) != null && (d61Var = mm0Var.f17576l0) != null) {
            int childCount = d61Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = d61Var.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.p4) {
                    org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) childAt;
                    org.telegram.ui.Components.a9 a9Var = p4Var.f31316c;
                    int i10 = p4Var.h;
                    if (org.telegram.messenger.n5.E(p4Var.f31318f)) {
                        TLRPC.User c22 = org.telegram.messenger.mp.u1(i10).c2(Long.valueOf(p4Var.f31318f));
                        p4Var.f31317e = c22;
                        a9Var.r(c22);
                    } else {
                        a9Var.q(org.telegram.messenger.mp.u1(i10).O0(Long.valueOf(-p4Var.f31318f)));
                        p4Var.f31317e = null;
                    }
                    p4Var.c(true);
                }
            }
        }
        if (this.f46549f0 != null) {
            int i11 = 0;
            while (true) {
                ax[] axVarArr = this.f46549f0;
                if (i11 >= axVarArr.length) {
                    break;
                }
                ax axVar = axVarArr[i11];
                if (axVar != null && (ivVar = axVar.f45827n) != null) {
                    ivVar.i();
                }
                i11++;
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.H(getThemedColor(org.telegram.ui.ActionBar.n6.G8), true);
            this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.n6.E8), false, true);
            this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.n6.F8), true, true);
            this.actionBar.J(getThemedColor(org.telegram.ui.ActionBar.n6.I5), true);
            this.actionBar.updateColors();
        }
        if (this.F3 != null) {
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.n6.f29702qi);
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
            org.telegram.ui.ActionBar.n6.H1(c3Var.getBackground(), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29543i6, false), true);
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.f46587n0;
        if (q0Var != null) {
            q0Var.setIconColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29788v8));
        }
        mv mvVar = this.D1;
        if (mvVar != null) {
            mvVar.updateColors();
        }
        qw qwVar = this.A0;
        if (qwVar != null) {
            fh.g gVar = qwVar.F0;
            if (gVar != null) {
                gVar.updateColors();
            }
            di.n4 n4Var = qwVar.f38324z0;
            if (n4Var != null) {
                n4Var.g();
            }
            qwVar.invalidate();
        }
        jg.q0 q0Var2 = this.f46533c0;
        if (q0Var2 != null) {
            q0Var2.updateColors();
        }
        jw jwVar2 = this.D0;
        if (jwVar2 != null && (nf0Var = jwVar2.f40098s0) != null) {
            nf0Var.c();
        }
        org.telegram.ui.Components.j71 j71Var = this.f46527b0;
        if (j71Var != null) {
            j71Var.updateColors();
        }
        dz0 dz0Var = this.f46521a0;
        if (dz0Var != null) {
            dz0Var.updateColors();
        }
        if (this.L0 != null) {
            int o4 = i0.a.o(getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6), 100);
            if (this.L0.getForeground() instanceof ColorDrawable) {
                if (((ColorDrawable) this.L0.getForeground()).getColor() != o4) {
                    ((ColorDrawable) this.L0.getForeground()).setColor(o4);
                }
            } else {
                this.L0.setForeground(new ColorDrawable(o4));
            }
        }
        org.telegram.ui.Components.a10 a10Var = this.f46622u0;
        if (a10Var != null) {
            a10Var.updateColors();
        }
        org.telegram.ui.Components.a10 a10Var2 = this.f46627v0;
        if (a10Var2 != null) {
            a10Var2.updateColors();
        }
        int i12 = org.telegram.ui.ActionBar.n6.f29451d6;
        this.f46610r4.a(getThemedColor(i12));
        org.telegram.ui.Components.bs bsVar = this.L1;
        if (bsVar != null) {
            bsVar.updateColors();
        }
        org.telegram.ui.Components.as asVar = this.M1;
        if (asVar != null) {
            asVar.setColor(org.telegram.ui.ActionBar.n6.x0(null, i12, false));
        }
        kv kvVar = this.J1;
        if (kvVar != null) {
            kvVar.updateColors();
        }
        kv kvVar2 = this.H1;
        if (kvVar2 != null) {
            kvVar2.updateColors();
        }
        v5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        sv svVar = this.F0;
        if (svVar != null) {
            svVar.o();
        }
        if (this.E3 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.Xl)) != this.A4) {
            this.A4 = themedColor;
            this.E3.setColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        }
        pw pwVar = this.Y;
        if (pwVar != null) {
            pwVar.updateColors();
        }
    }

    public final boolean y4(ax axVar) {
        if (axVar != null && w4(axVar.f45829s)) {
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
        org.telegram.messenger.g0.h3(new yu(this, 13), 300L);
    }

    public final void z5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.m5 m5Var;
        org.telegram.ui.ActionBar.i6 i6Var;
        sv svVar = this.F0;
        org.telegram.ui.Components.m5 m5Var2 = null;
        if (svVar != null && (m5Var = svVar.f12417b0) != null && svVar.f12437r0 != null) {
            Long i7 = org.telegram.messenger.n10.i(user);
            if (i7 != null) {
                m5Var.j(i7.longValue(), z10);
                m5Var.m(user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible, z10);
            } else {
                if (user != null) {
                    org.telegram.messenger.mp.u1(svVar.f12423f);
                    if (org.telegram.messenger.mp.H2(user)) {
                        if (svVar.O0 == null) {
                            svVar.O0 = svVar.getContext().getResources().getDrawable(2131232312).mutate();
                            svVar.O0 = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), svVar.O0);
                        }
                        Drawable drawable = svVar.O0;
                        int i10 = org.telegram.ui.ActionBar.n6.f29702qi;
                        bx bxVar = svVar.f12424f0;
                        if (bxVar != null) {
                            i6Var = bxVar.getResourceProvider();
                        } else {
                            i6Var = null;
                        }
                        org.telegram.ui.ActionBar.u6.x(svVar, drawable, i10, i6Var, PorterDuff.Mode.MULTIPLY);
                        m5Var.g(svVar.O0, z10);
                        m5Var.m(false, z10);
                    }
                }
                m5Var.g(null, z10);
                m5Var.m(false, z10);
            }
            m5Var.k(Integer.valueOf(svVar.f(org.telegram.ui.ActionBar.n6.f29702qi)));
            svVar.f12415a0.invalidate();
        }
        if (this.F3 != null && this.actionBar != null) {
            Long i11 = org.telegram.messenger.n10.i(user);
            this.D3 = null;
            if (i11 != null) {
                boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                this.F3.j(i11.longValue(), z10);
                this.F3.m(z11, z10);
                if (z11) {
                    this.D3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
                }
                this.actionBar.setRightDrawableOnClick(new hu(this, 1));
                q11.t(this.currentAccount);
            } else {
                if (user != null) {
                    org.telegram.messenger.mp.u1(this.currentAccount);
                    if (org.telegram.messenger.mp.H2(user)) {
                        if (this.M3 == null) {
                            this.M3 = getParentActivity().getResources().getDrawable(2131232312).mutate();
                            this.M3 = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), this.M3);
                        }
                        Drawable drawable2 = this.M3;
                        int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.f29702qi);
                        this.B4 = themedColor;
                        drawable2.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                        this.F3.g(this.M3, z10);
                        this.F3.m(false, z10);
                        this.actionBar.setRightDrawableOnClick(new hu(this, 2));
                        q11.t(this.currentAccount);
                    }
                }
                this.F3.g(null, z10);
                this.F3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(null);
            }
            org.telegram.ui.Components.m5 m5Var3 = this.F3;
            int i12 = org.telegram.ui.ActionBar.n6.f29702qi;
            m5Var3.k(Integer.valueOf(getThemedColor(i12)));
            org.telegram.ui.Cells.o oVar = this.G3;
            if (oVar != null) {
                oVar.setColor(getThemedColor(i12));
            }
            yv yvVar = this.N0;
            if (yvVar != null && (yvVar.getContentView() instanceof q11)) {
                org.telegram.ui.ActionBar.n5 titleTextView = this.actionBar.getTitleTextView();
                q11 q11Var = (q11) this.N0.getContentView();
                if (titleTextView != null) {
                    Drawable rightDrawable = titleTextView.getRightDrawable();
                    org.telegram.ui.Components.m5 m5Var4 = this.F3;
                    if (rightDrawable == m5Var4) {
                        m5Var2 = m5Var4;
                    }
                }
                q11Var.y(m5Var2, titleTextView);
            }
        }
    }
}

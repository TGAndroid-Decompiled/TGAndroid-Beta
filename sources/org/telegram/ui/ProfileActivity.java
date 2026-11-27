package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ProfileActivity;
public class ProfileActivity extends org.telegram.ui.ActionBar.e implements fn7, oj3, xia, yn5, tha, ej6 {
    public static final RectF Z6 = new RectF();
    public static final int a7 = hl.L(16.0f);
    public vnb A0;
    public boolean A1;
    public String A2;
    public int A3;
    public int A4;
    public SpannableStringBuilder A5;
    public boolean A6;
    public byte B0;
    public boolean B1;
    public long B2;
    public int B3;
    public int B4;
    public SpannableStringBuilder B5;
    public float B6;
    public jn5 C0;
    public zh6 C1;
    public int C2;
    public int C3;
    public int C4;
    public c51[] C5;
    public float C6;
    public int D0;
    public boolean D1;
    public ArrayList D2;
    public int D3;
    public int D4;
    public j61 D5;
    public float D6;
    public Drawable E;
    public int E0;
    public long E1;
    public TLRPC.EncryptedChat E2;
    public int E3;
    public int E4;
    public FrameLayout E5;
    public float E6;
    public Long F;
    public int F0;
    public float F1;
    public TLRPC.Chat F2;
    public int F3;
    public int F4;
    public c51 F5;
    public gs8 F6;
    public ul G;
    public boolean G0;
    public boolean G1;
    public TL_bots.BotInfo G2;
    public int G3;
    public int G4;
    public float G5;
    public ns8 G6;
    public ul H;
    public boolean H0;
    public boolean H1;
    public TLRPC.ChannelParticipant H2;
    public int H3;
    public int H4;
    public View H5;
    public kg5 H6;
    public Drawable I;
    public boolean I0;
    public boolean I1;
    public TL_account.TL_password I2;
    public int I3;
    public int I4;
    public int I5;
    public int I6;
    public e43 J;
    public boolean J0;
    public byte J1;
    public TLRPC.FileLocation J2;
    public int J3;
    public int J4;
    public int J5;
    public Boolean J6;
    public e43 K;
    public final boolean[] K0;
    public boolean K1;
    public TLRPC.FileLocation K2;
    public int K3;
    public int K4;
    public int K5;
    public TLRPC.TL_emojiStatusCollectible K6;
    public yt9 L;
    public boolean L0;
    public boolean L1;
    public jn5 L2;
    public int L3;
    public boolean L4;
    public int L5;
    public int L6;
    public UndoView M;
    public boolean M0;
    public boolean M1;
    public final Rect M2;
    public int M3;
    public boolean M4;
    public ol0 M5;
    public boolean M6;
    public xr8 N;
    public boolean N0;
    public boolean N1;
    public skb N2;
    public int N3;
    public int N4;
    public final xh4 N5;
    public int N6;
    public gr8 O;
    public boolean O0;
    public boolean O1;
    public int O2;
    public int O3;
    public int O4;
    public qs8 O5;
    public int O6;
    public z2b P;
    public ImageView P0;
    public boolean P1;
    public int P2;
    public int P3;
    public int P4;
    public float P5;
    public int P6;
    public boolean Q;
    public sla Q0;
    public float Q1;
    public int Q2;
    public int Q3;
    public int Q4;
    public int Q5;
    public final nz4 Q6;
    public wia R;
    public sla R0;
    public float R1;
    public int R2;
    public int R3;
    public boolean R4;
    public float R5;
    public final ll0 R6;
    public boolean S;
    public sla S0;
    public float S1;
    public int S2;
    public int S3;
    public boolean S4;
    public final fm0 S5;
    public dg0 S6;
    public jva T;
    public sla T0;
    public float T1;
    public int T2;
    public int T3;
    public int T4;
    public rq8 T5;
    public final Paint T6;
    public tb U;
    public sla U0;
    public int U1;
    public int U2;
    public int U3;
    public final ArrayList U4;
    public AnimatorSet U5;
    public Drawable U6;
    public b29 V;
    public b8 V0;
    public float V1;
    public int V2;
    public int V3;
    public final ArrayList V4;
    public AnimatorSet V5;
    public Drawable V6;
    public b29 W;
    public b8 W0;
    public ValueAnimator W1;
    public int W2;
    public int W3;
    public byte W4;
    public float W5;
    public Drawable W6;
    public kg5 X;
    public b8 X0;
    public boolean X1;
    public int X2;
    public int X3;
    public boolean X4;
    public boolean X5;
    public wm2 X6;
    public d26 Y;
    public ImageView Y0;
    public c34 Y1;
    public int Y2;
    public int Y3;
    public boolean Y4;
    public final oq8 Y5;
    public final int[] Y6;
    public tt Z;
    public b8 Z0;
    public final HashMap Z1;
    public int Z2;
    public int Z3;
    public nq8 Z4;
    public View Z5;
    public zp8 a;
    public ap8 a0;
    public guc a1;
    public float a2;
    public int a3;
    public int a4;
    public View a5;
    public int a6;
    public d79 b;
    public pc7 b0;
    public float b1;
    public float b2;
    public int b3;
    public int b4;
    public float b5;
    public int b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public bq8 c;
    public tu8 c0;
    public int c1;
    public float c2;
    public int c3;
    public int c4;
    public int c5;
    public CharSequence c6;
    public wr8 d;
    public js8 d0;
    public is8 d1;
    public float d2;
    public int d3;
    public int d4;
    public int d5;
    public boolean d6;
    public fs8 e;
    public zm e0;
    public long e1;
    public float e2;
    public int e3;
    public int e4;
    public int e5;
    public final mq8 e6;
    public ns1 f;
    public iq8 f0;
    public long f1;
    public float f2;
    public int f3;
    public int f4;
    public long f5;
    public float[] f6;
    public AnimatorSet g0;
    public long g1;
    public float g2;
    public int g3;
    public int g4;
    public boolean g5;
    public float g6;
    public String h;
    public vb5 h0;
    public boolean h1;
    public float h2;
    public int h3;
    public int h4;
    public boolean h5;
    public float h6;
    public ImageView i0;
    public long i1;
    public float i2;
    public int i3;
    public int i4;
    public String i5;
    public boolean i6;
    public ImageView j0;
    public boolean j1;
    public float j2;
    public int j3;
    public int j4;
    public String j5;
    public qr8 j6;
    public ImageView k0;
    public boolean k1;
    public ValueAnimator k2;
    public int k3;
    public int k4;
    public String k5;
    public float k6;
    public ImageView l0;
    public boolean l1;
    public float l2;
    public int l3;
    public int l4;
    public uj3 l5;
    public final RectF l6;
    public rsb m0;
    public long m1;
    public float m2;
    public int m3;
    public int m4;
    public kz1 m5;
    public float m6;
    public String n;
    public ws8 n0;
    public boolean n1;
    public final float[] n2;
    public int n3;
    public int n4;
    public final HashSet n5;
    public kc7 n6;
    public jq8 o0;
    public boolean o1;
    public boolean o2;
    public int o3;
    public int o4;
    public or8 o5;
    public final SparseIntArray o6;
    public yr8 p0;
    public boolean p1;
    public boolean p2;
    public int p3;
    public int p4;
    public final oq8 p5;
    public int p6;
    public rb0 q0;
    public boolean q1;
    public boolean q2;
    public int q3;
    public int q4;
    public final vq8 q5;
    public AnimatorSet q6;
    public kq8 r;
    public zn5 r0;
    public boolean r1;
    public final Paint r2;
    public int r3;
    public int r4;
    public boolean r5;
    public int r6;
    public e29 s;
    public int s0;
    public boolean s1;
    public boolean s2;
    public int s3;
    public int s4;
    public er8 s5;
    public int s6;
    public rsb t0;
    public boolean t1;
    public tq0 t2;
    public int t3;
    public int t4;
    public float t5;
    public boolean t6;
    public ku8 u0;
    public int u1;
    public uo0 u2;
    public int u3;
    public int u4;
    public float u5;
    public boolean u6;
    public lq8 v0;
    public boolean v1;
    public TLRPC.ChatFull v2;
    public int v3;
    public int v4;
    public boolean v5;
    public e29 v6;
    public AnimatorSet w;
    public gu8 w0;
    public boolean w1;
    public TLRPC.UserFull w2;
    public int w3;
    public int w4;
    public boolean w5;
    public final int[] w6;
    public Drawable x;
    public View x0;
    public boolean x1;
    public ts8 x2;
    public int x3;
    public int x4;
    public ImageReceiver x5;
    public float x6;
    public Drawable y;
    public final hq8 y0;
    public int y1;
    public boolean y2;
    public int y3;
    public int y4;
    public FrameLayout y5;
    public CharSequence y6;
    public final Paint z0;
    public boolean z1;
    public ks8 z2;
    public int z3;
    public int z4;
    public FrameLayout[] z5;
    public CharSequence z6;

    public ProfileActivity(Bundle bundle, wia wiaVar) {
        super(bundle);
        this.h = null;
        this.n = null;
        this.x0 = null;
        this.y0 = new hq8(this, (byte) 0);
        this.z0 = new Paint(1);
        this.K0 = new boolean[1];
        this.b1 = 1.0f;
        this.C1 = new zh6();
        this.M1 = true;
        this.N1 = false;
        this.O1 = false;
        this.P1 = false;
        this.R1 = 1.0f;
        this.Z1 = new HashMap();
        this.n2 = new float[]{0.0f, 1.0f};
        this.r2 = new Paint();
        this.C2 = -1;
        this.M2 = new Rect();
        this.U4 = new ArrayList();
        this.V4 = new ArrayList();
        this.W4 = (byte) 0;
        this.X4 = true;
        this.Y4 = true;
        this.c5 = 0;
        this.d5 = 0;
        this.e5 = 0;
        this.f5 = 0L;
        this.n5 = new HashSet();
        this.p5 = new oq8(this, (byte) 0);
        this.q5 = new vq8(this);
        this.N5 = new xh4(this, (byte) 24);
        this.R5 = 1.0f;
        this.S5 = new fm0(0, new bp8(this, (byte) 6), k43.h, 380L, true);
        this.Y5 = new oq8(this, (byte) 1);
        this.e6 = new mq8(this, (byte) 2);
        this.f6 = null;
        this.l6 = new RectF();
        this.o6 = new SparseIntArray();
        this.q6 = null;
        this.r6 = -1;
        this.w6 = new int[3];
        this.x6 = -1.0f;
        nz4 nz4Var = new nz4();
        this.Q6 = nz4Var;
        ll0 ll0Var = new ll0(nz4Var, nz4Var, nz4Var);
        this.R6 = ll0Var;
        this.T6 = new Paint();
        this.Y6 = new int[7];
        this.R = wiaVar;
        ll0Var.g = new r89(0, false);
    }

    public static void F1(View view, Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        if (view != null && view.getVisibility() == 0 && view.getAlpha() > 0.0f) {
            RectF rectF2 = Z6;
            if (yic.c(view, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                uk0.b(new mr0(view, (byte) 7), canvas, rectF, view, viewGroup, (int) (view.getAlpha() * 255.0f));
            }
        }
    }

    public static void M2(String str, StringBuilder sb) {
        String[] supportedTypes;
        ArrayList arrayList;
        try {
            int codecCount = MediaCodecList.getCodecCount();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (int i = 0; i < codecCount; i++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (codecInfoAt != null && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= supportedTypes.length) {
                            break;
                        } else if (supportedTypes[i2].equals(str)) {
                            if (codecInfoAt.isEncoder()) {
                                arrayList = arrayList3;
                            } else {
                                arrayList = arrayList2;
                            }
                            arrayList.add(Integer.valueOf(i));
                        } else {
                            i2++;
                        }
                    }
                }
            }
            if (!arrayList2.isEmpty() || !arrayList3.isEmpty()) {
                sb.append("\n");
                sb.append(arrayList2.size());
                sb.append("+");
                sb.append(arrayList3.size());
                sb.append(" ");
                sb.append(str.substring(6));
                sb.append(" codecs:\n");
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    if (i3 > 0) {
                        sb.append("\n");
                    }
                    MediaCodecInfo codecInfoAt2 = MediaCodecList.getCodecInfoAt(((Integer) arrayList2.get(i3)).intValue());
                    sb.append("{d} ");
                    sb.append(codecInfoAt2.getName());
                    sb.append(" (");
                    if (Build.VERSION.SDK_INT >= 29) {
                        if (codecInfoAt2.isHardwareAccelerated()) {
                            sb.append("gpu");
                        }
                        if (codecInfoAt2.isSoftwareOnly()) {
                            sb.append("cpu");
                        }
                        if (codecInfoAt2.isVendor()) {
                            sb.append(", v");
                        }
                    }
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt2.getCapabilitiesForType(str);
                    sb.append("; mi=");
                    sb.append(capabilitiesForType.getMaxSupportedInstances());
                    sb.append(")");
                }
                for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                    if (i4 > 0 || !arrayList2.isEmpty()) {
                        sb.append("\n");
                    }
                    MediaCodecInfo codecInfoAt3 = MediaCodecList.getCodecInfoAt(((Integer) arrayList3.get(i4)).intValue());
                    sb.append("{e} ");
                    sb.append(codecInfoAt3.getName());
                    sb.append(" (");
                    if (Build.VERSION.SDK_INT >= 29) {
                        if (codecInfoAt3.isHardwareAccelerated()) {
                            sb.append("gpu");
                        }
                        if (codecInfoAt3.isSoftwareOnly()) {
                            sb.append("cpu");
                        }
                        if (codecInfoAt3.isVendor()) {
                            sb.append(", v");
                        }
                    }
                    MediaCodecInfo.CodecCapabilities capabilitiesForType2 = codecInfoAt3.getCapabilitiesForType(str);
                    sb.append("; mi=");
                    sb.append(capabilitiesForType2.getMaxSupportedInstances());
                    sb.append(")");
                }
                sb.append("\n");
            }
        } catch (Exception unused) {
        }
    }

    public static SpannableStringBuilder P1(String str, int i, vnb vnbVar) {
        int v0 = aob.v0(i, vnbVar);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        lf4 lf4Var = new lf4(9);
        lf4Var.w = str;
        if (lf4Var.c != null) {
            lf4Var.c = null;
            lf4Var.a();
        }
        lf4Var.f = v0;
        lf4Var.n = false;
        spannableStringBuilder.setSpan(lf4Var, 0, spannableStringBuilder.length(), 0);
        lf4[] lf4VarArr = (lf4[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), lf4.class);
        if (lf4VarArr != null) {
            for (lf4 lf4Var2 : lf4VarArr) {
                lf4Var2.getClass();
                lf4Var2.f = aob.v0(i, vnbVar);
                lf4Var2.r = i;
                lf4Var2.s = vnbVar;
                lf4Var2.n = true;
            }
        }
        return spannableStringBuilder;
    }

    public static ProfileActivity Q2(long j) {
        Bundle bundle = new Bundle();
        if (j >= 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        return new ProfileActivity(bundle, null);
    }

    public static void m3(Activity activity, boolean z) {
        if (activity == null) {
            return;
        }
        id idVar = new id(3, null, activity);
        idVar.j0 = false;
        idVar.show();
        Utilities.e.c(new yn6(idVar, z, activity, (byte) 16));
    }

    public static void p3(FrameLayout frameLayout, float f) {
        int i;
        frameLayout.animate().cancel();
        frameLayout.setTranslationY(a7 * f);
        frameLayout.setAlpha(1.0f - f);
        if (f < 1.0f) {
            i = 0;
        } else {
            i = 4;
        }
        frameLayout.setVisibility(i);
    }

    public static void u3(int i, View view) {
        if (view != null && view.getLayoutParams() != null && view.getLayoutParams().height != i) {
            view.getLayoutParams().height = i;
            if (view.isLaidOut()) {
                view.setBottom(view.getTop() + i);
            } else {
                view.requestLayout();
            }
        }
    }

    public static void v3(sla slaVar, boolean z, boolean z2) {
        int i;
        if (ik8.A(slaVar)) {
            slaVar.Y(z, z2);
        } else if (slaVar != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            slaVar.setVisibility(i);
        }
    }

    @Override
    public final rz4 A() {
        return getBaseSimpleGlass().d();
    }

    public final int A1(int i, Boolean bool) {
        int i2;
        if (this.n6 != null) {
            int v0 = aob.v0(aob.s8, this.A0);
            int f = vm2.f(0.5f, this.n6.m(aob.I.o()), this.n6.n(aob.I.o()));
            if (!aob.c1(v0)) {
                if (bool != null && !bool.booleanValue()) {
                    return aob.a(-0.2f, 0.2f, aob.p1(0.7f, f));
                }
                return f;
            }
            boolean o = aob.I.o();
            if (bool != null && !bool.booleanValue()) {
                i2 = aob.p1(0.7f, f);
            } else {
                i2 = f;
            }
            return aob.C(o, v0, f, i, i2);
        }
        return i;
    }

    public final void A2() {
        TLRPC.Document e;
        v21 h;
        if (this.K2 == null) {
            int i = 0;
            if (this.q1 && !getMessagesController().M3()) {
                ArrayList l = getMessagesController().h4.l(this.f1);
                if (l != null) {
                    TLRPC.TL_forumTopic tL_forumTopic = null;
                    while (tL_forumTopic == null) {
                        if (i < l.size()) {
                            TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) l.get(i);
                            if (tL_forumTopic2 != null && tL_forumTopic2.id == this.g1) {
                                tL_forumTopic = tL_forumTopic2;
                            }
                            i++;
                        } else {
                            return;
                        }
                    }
                    long j = tL_forumTopic.icon_emoji_id;
                    if (j != 0 && (e = wl.e(this.currentAccount, j)) != null && (h = d31.b0(this).h(e, 1, new hp8(this, (byte) 3))) != null) {
                        h.j();
                    }
                }
            } else if (T1()) {
            } else {
                a3(false);
            }
        }
    }

    public final void A3(View view, float f) {
        boolean z;
        int i;
        if (this.p2) {
            if (this.q2) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
                if (this.actionBar.getOccupyStatusBar()) {
                    i = hl.m;
                } else {
                    i = 0;
                }
                this.a.y0(0, ((view.getTop() - this.a.getMeasuredWidth()) - X1()) + currentActionBarHeight + i, k43.h);
                return;
            }
            this.a.y0(0, view.getTop() - d2(), k43.h);
            return;
        }
        if (X1() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            float f2 = this.Q1;
            if (f2 > 0.0f && ((f2 < d2() * 0.6f || f < -1000.0f) && this.Q1 > X1() * 0.6f)) {
                this.a.y0(0, (int) (this.Q1 - X1()), k43.h);
                return;
            }
        }
        if (z) {
            float f3 = this.Q1;
            if (f3 > 0.0f && f3 < X1() * 0.6f) {
                this.a.y0(0, (int) this.Q1, k43.h);
                return;
            }
        }
        if (!z) {
            float f4 = this.Q1;
            if (f4 > 0.0f && f < -1000.0f) {
                this.a.y0(0, (int) f4, k43.h);
                return;
            }
        }
        if (this.Q1 > 0.0f) {
            this.a.y0(0, view.getTop() - d2(), k43.h);
        }
    }

    public final void B1() {
        int f;
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null && this.f != null && this.d1 != null && this.T0 != null && this.Q0 != null && this.R0 != null && this.S0 != null && this.p0 != null) {
            Float valueOf = Float.valueOf(this.W5);
            oq8 oq8Var = this.Y5;
            oq8Var.getClass();
            oq8Var.a(aVar, valueOf);
            if (this.W5 <= 0.0f && this.l2 > 0.0f) {
                ns1 ns1Var = this.f;
                int i = -1;
                if (this.n6 != null) {
                    f = -1;
                } else {
                    f = vm2.f(this.l2, aob.v0(aob.mi, this.A0), -1);
                }
                ns1Var.setTextColor(f);
                org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
                if (this.n6 == null) {
                    i = vm2.f(this.l2, aob.v0(aob.v8, this.A0), -1);
                }
                aVar2.H(i, false);
            }
        }
    }

    public final void B2(TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        boolean z;
        TLRPC.VideoSize x;
        if (tL_error == null) {
            TLRPC.User X1 = getMessagesController().X1(Long.valueOf(getUserConfig().e()));
            if (X1 == null) {
                X1 = getUserConfig().f();
                if (X1 == null) {
                    return;
                }
                getMessagesController().i4(X1, false, false);
            } else {
                getUserConfig().v(X1);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize w = xb4.w(arrayList, 150, false, null, false);
            TLRPC.PhotoSize w2 = xb4.w(arrayList, 800, false, null, false);
            if (tL_photos_photo.photo.video_sizes.isEmpty()) {
                x = null;
            } else {
                x = xb4.x(1000, tL_photos_photo.photo.video_sizes);
            }
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            X1.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
            if (w != null) {
                tL_userProfilePhoto.photo_small = w.location;
            }
            if (w2 != null) {
                tL_userProfilePhoto.photo_big = w2.location;
            }
            if (w != null && this.J2 != null) {
                xb4.G(this.currentAccount);
                File J = xb4.J(w, null, true, true);
                xb4.G(this.currentAccount);
                xb4.J(this.J2, null, true, true).renameTo(J);
                StringBuilder sb = new StringBuilder();
                sb.append(this.J2.volume_id);
                sb.append("_");
                String l = uh9.l(sb, this.J2.local_id, "@50_50");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(w.location.volume_id);
                sb2.append("_");
                in5.z().O(l, uh9.l(sb2, w.location.local_id, "@50_50"), jn5.m(this.currentAccount, 1, X1));
            }
            if (x != null && str != null) {
                xb4.G(this.currentAccount);
                new File(str).renameTo(xb4.J(x, "mp4", true, true));
            } else if (w2 != null && this.K2 != null) {
                xb4.G(this.currentAccount);
                File J2 = xb4.J(w2, null, true, true);
                xb4.G(this.currentAccount);
                xb4.J(this.K2, null, true, true).renameTo(J2);
            }
            getMessagesController().U0(X1.id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(X1);
            getMessagesStorage().n1(arrayList2, null, false, true);
            TLRPC.UserFull Y1 = getMessagesController().Y1(this.e1);
            if (Y1 != null) {
                Y1.profile_photo = tL_photos_photo.photo;
                getMessagesStorage().l2(Y1, false);
            }
        }
        if (!hl.O1() && !this.o2 && this.f0.getImageReceiver().E() && !hl.A1()) {
            z = true;
        } else {
            z = false;
        }
        this.p2 = z;
        this.J2 = null;
        this.K2 = null;
        jq8 jq8Var = this.o0;
        jq8Var.I0 = true;
        jq8Var.L0 = this.L2;
        jq8Var.r1 = null;
        jq8Var.s1 = null;
        jq8Var.setCreateThumbFromParent(false);
        e4(true);
        C3(false, true);
        getNotificationCenter().k(2, Integer.valueOf(uc7.s5));
        getNotificationCenter().k(jn7.j0, new Object[0]);
        getUserConfig().u(true);
    }

    public final void B3() {
        eg0 baseSimpleGlass = getBaseSimpleGlass();
        qs8 qs8Var = new qs8(this.glassEngine, baseSimpleGlass);
        this.O5 = qs8Var;
        is8 is8Var = this.d1;
        if (is8Var != null) {
            int i = is8Var.I;
            boolean z = is8Var.c;
            if (qs8Var.i != i || qs8Var.j != z) {
                qs8Var.i = i;
                qs8Var.j = z;
                qs8Var.a();
            }
        }
        this.O5.b(this.P5);
        ap8 ap8Var = this.a0;
        if (ap8Var != null) {
            ap8Var.setGlassFactory(this.O5.c);
        }
        tu8 tu8Var = this.c0;
        if (tu8Var != null) {
            tu8Var.setGlassFactory(this.O5.c);
        }
        this.simpleActionBar.setButtonsGlass(this.O5.d);
        this.simpleActionBar.setMenuGlassStroke(false);
        baseSimpleGlass.i(this.s5, this.simpleActionBar, this.A0);
        jla jlaVar = this.simpleActionBar;
        qs8 qs8Var2 = this.O5;
        ll0 ll0Var = qs8Var2.e;
        pz4 pz4Var = qs8Var2.f;
        jlaVar.v0 = ll0Var;
        jlaVar.w0 = pz4Var;
        jlaVar.setBackground(null);
        this.M5 = dtd.l(this.A0);
        this.simpleActionBar.setButtonsGlassColorProvider(this.N5);
        W3();
        baseSimpleGlass.o = this.S6;
        View view = new View(getParentActivity());
        this.Z5 = view;
        view.setAlpha(0.0f);
        this.s5.getViewTreeObserver().addOnPreDrawListener(new es1(this, (byte) 4));
        this.O.e(this.Z5);
        View view2 = this.Z5;
        view2.setBackground(baseSimpleGlass.a(view2));
        View view3 = new View(getParentActivity());
        this.H5 = view3;
        view3.setBackground(baseSimpleGlass.a(view3));
        er8 er8Var = this.s5;
        er8Var.addView(this.H5, er8Var.indexOfChild(this.Z), tre.e(-1, 0, 48));
        this.glassEngine.b(this.a);
        this.O.setPagesGlassEngine(this.glassEngine);
        this.O.setOnTopPanelShiftChanged(new y56(this, (byte) 21));
        z1();
        T3();
    }

    public final void C1() {
        int i;
        int i2;
        if (this.f6 != null) {
            ValueAnimator valueAnimator = this.k2;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.k2.cancel();
            }
            float l = Utilities.l(this.Q1 / this.F1);
            if (l > 0.0f) {
                float f = (l - 0.5f) / 0.5f;
                int i3 = 0;
                if (this.actionBar.getOccupyStatusBar()) {
                    i = hl.m;
                } else {
                    i = 0;
                }
                float translationY = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f) + i) - hl.L(21.0f));
                this.c2 = hl.R1(0.42f, this.f6[0], l);
                this.a2 = hl.R1(this.k6, this.f6[1], l);
                this.b2 = hl.R1(translationY, this.f6[2], l);
                this.d2 = hl.R1(this.f6[11], 0.0f, l);
                this.Y.setScaleX(this.c2);
                this.Y.setScaleY(this.c2);
                this.Y.setTranslationX(this.a2);
                this.Y.setTranslationY(this.b2);
                jva jvaVar = this.T;
                if (jvaVar != null) {
                    jvaVar.setAlpha(l);
                }
                this.f0.setAlpha(1.0f);
                this.Y.setAlpha(1.0f);
                lq8 lq8Var = this.v0;
                if (lq8Var != null) {
                    lq8Var.invalidate();
                }
                gu8 gu8Var = this.w0;
                if (gu8Var != null) {
                    gu8Var.e = hl.R1(0.0f, this.f6[4], f);
                    this.w0.f = hl.R1(0.0f, this.f6[5], l);
                    gu8 gu8Var2 = this.w0;
                    gu8Var2.h = true;
                    gu8Var2.invalidate();
                }
                gs8 gs8Var = this.F6;
                if (gs8Var != null) {
                    gs8Var.setAlpha((int) hl.R1(0.0f, this.f6[6], l));
                }
                float L = (((this.c2 * 100.0f) / 42.0f) * hl.L(42.0f)) - hl.L(42.0f);
                this.i0.setTranslationX(this.Y.getX() + hl.L(16.0f) + L);
                this.i0.setTranslationY(this.Y.getY() + hl.L(-10.0f) + L);
                this.j0.setTranslationX(this.Y.getX() + hl.L(28.0f) + L);
                this.j0.setTranslationY(this.Y.getY() + hl.L(26.5f) + L);
                this.k0.setTranslationX(this.Y.getX() + hl.L(28.0f) + L);
                this.k0.setTranslationY(this.Y.getY() + hl.L(24.0f) + L);
                this.l0.setTranslationX(this.Y.getX() + hl.L(28.0f) + L);
                this.l0.setTranslationY(this.Y.getY() + hl.L(24.0f) + L);
                float R1 = hl.R1(j2(0), this.f6[7], l);
                if (this.actionBar.getOccupyStatusBar()) {
                    i2 = hl.m;
                } else {
                    i2 = 0;
                }
                float currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f;
                float floor = ((float) Math.floor(this.actionBar.getTranslationY() + ((currentActionBarHeight + i2) - (hl.p * 21.0f)))) + hl.L(1.3f);
                float N = hl.N(22.7f) + floor;
                this.f2 = hl.R1(floor, this.f6[8], l);
                this.h2 = hl.R1(N, this.f6[9], l);
                float L2 = (this.k6 - hl.L(109.0f)) + hl.L(48.0f);
                float R12 = hl.R1(k2(L2, 0, this.f), this.f6[12], l);
                float R13 = hl.R1(k2(L2 + this.u5, 1, this.r) - this.u5, this.f6[13], l);
                this.f.setTranslationX(R12);
                this.f.setTranslationY(this.f2);
                this.r.setTranslationX(this.u5 + R13);
                this.r.setTranslationY(this.h2);
                this.e2 = R12;
                this.g2 = R13;
                this.f.setScaleX(R1);
                this.f.setScaleY(R1);
                float R14 = hl.R1(j2(1), 1.0f, l);
                this.r.setScaleX(R14);
                this.r.setScaleY(R14);
                K3();
                if (this.actionBar.getOccupyStatusBar()) {
                    i3 = hl.m;
                }
                Q3(org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i3);
                P2((int) this.f6[10], l, true);
                ap8 ap8Var = this.a0;
                if (ap8Var != null) {
                    ap8Var.setAlpha(hl.R1(0.0f, this.f6[3], f));
                }
            }
        }
    }

    public final void C2(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            this.J2 = fileLocation;
            this.K2 = photoSize2.location;
            this.f0.m(jn5.e(fileLocation), "50_50", this.q0, null);
            if (this.P2 != -1) {
                f4();
                wr8 wr8Var = this.d;
                if (wr8Var != null) {
                    wr8Var.f();
                }
                O2(true);
            }
            jq8 jq8Var = this.o0;
            jn5 e = jn5.e(this.K2);
            this.L2 = e;
            jq8Var.A(e, jn5.e(this.J2));
            C3(true, false);
        } else if (this.J2 == null) {
            return;
        } else {
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            this.p6 = getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new pl7(this, str, (byte) 14));
        }
        this.actionBar.u().requestLayout();
    }

    public final void C3(boolean z, boolean z2) {
        if (this.h0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.g0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.g0 = null;
        }
        if (z2) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.g0 = animatorSet2;
            vb5 vb5Var = this.h0;
            if (z) {
                vb5Var.setVisibility(0);
                this.g0.playTogether(ObjectAnimator.ofFloat(this.h0, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(vb5Var, View.ALPHA, 0.0f));
            }
            this.g0.setDuration(180L);
            this.g0.addListener(new xq8(this, z, (byte) 1));
            this.g0.start();
            return;
        }
        vb5 vb5Var2 = this.h0;
        if (z) {
            vb5Var2.setAlpha(1.0f);
            this.h0.setVisibility(0);
            return;
        }
        vb5Var2.setAlpha(0.0f);
        this.h0.setVisibility(4);
    }

    public final float D1() {
        return Utilities.l((this.Q1 - X1()) / e2());
    }

    public final void D2(TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            v21 Q = d31.b0(this).Q(2131623990, 36, ob6.M0(2131746585, null));
            Q.j = 5000;
            Q.j();
            return;
        }
        int i = userFull.flags2;
        if (tL_birthday == null) {
            userFull.flags2 = i & (-33);
        } else {
            userFull.flags2 = i | 32;
        }
        userFull.birthday = tL_birthday;
        getMessagesStorage().l2(userFull, false);
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, getParentActivity());
                String M0 = ob6.M0(2131746581, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131746582, null);
                alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                showDialog(idVar);
                return;
            }
            return;
        }
        bs2.v(null, 2131743534, d31.b0(this), 2131624012, 36);
    }

    public final void D3() {
        boolean z;
        nx0 nx0Var;
        ax0 ax0Var;
        int i;
        int v0;
        byte b;
        long j;
        Object[] objArr;
        final byte b2;
        float f;
        float f2;
        float f3;
        Activity parentActivity = getParentActivity();
        final TLRPC.UserFull userFull = this.w2;
        if (userFull != null && userFull.stars_rating != null) {
            byte b3 = 0;
            nx0 i2 = ik8.i(getParentActivity(), false, 1, null);
            ax0 ax0Var2 = i2.y0;
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            final LimitPreviewView limitPreviewView = new LimitPreviewView(getParentActivity(), 2131231165, 0, 0, this.A0);
            if (a() != yac.h(this.currentAccount).e()) {
                z = true;
            } else {
                z = false;
            }
            limitPreviewView.setHideNegativeValues(z);
            limitPreviewView.setStarRating(userFull.stars_rating);
            limitPreviewView.setTranslationY(-hl.L(14.0f));
            linearLayout.addView(limitPreviewView, tre.t(-1, -2, 17, 0, 20, 0, 10));
            if (userFull.stars_my_pending_rating != null) {
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                linearLayout.addView(frameLayout, tre.t(-1, -2, 17, 40, -12, 40, 20));
                int i3 = 2;
                p66[] p66VarArr = new p66[2];
                int i4 = 0;
                while (i4 < i3) {
                    int i5 = i3;
                    byte b4 = b3;
                    b21 b21Var = new b21(parentActivity, null, (byte) 7);
                    p66VarArr[i4] = b21Var;
                    b21Var.setGravity(17);
                    p66VarArr[i4].setTextSize(1, 12.0f);
                    yob.X(p66VarArr[i4], aob.y6, null);
                    yob.G(p66VarArr[i4], aob.Xc, null);
                    frameLayout.addView(p66VarArr[i4], tre.e(-1, -1, 119));
                    p66 p66Var = p66VarArr[i4];
                    if (i4 == 0) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    p66Var.setAlpha(f);
                    p66 p66Var2 = p66VarArr[i4];
                    if (i4 == 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.8f;
                    }
                    p66Var2.setScaleX(f2);
                    p66 p66Var3 = p66VarArr[i4];
                    if (i4 == 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = 0.8f;
                    }
                    p66Var3.setScaleY(f3);
                    i4++;
                    i3 = i5;
                    b3 = b4;
                }
                final byte b5 = b3;
                int i6 = i3;
                final ji7 ji7Var = new ji7(p66VarArr, (byte) 20);
                if (a() == yac.h(this.currentAccount).e()) {
                    b = 1;
                } else {
                    b = b5;
                }
                long j2 = userFull.stars_rating.stars;
                TL_stars.Tl_starsRating tl_starsRating = userFull.stars_my_pending_rating;
                byte b6 = b;
                if (tl_starsRating != null) {
                    j = tl_starsRating.stars - j2;
                } else {
                    j = 0;
                }
                long j3 = (-j2) - j;
                int max = Math.max(1, (userFull.stars_my_pending_rating_date - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) / 86400);
                long j4 = userFull.stars_my_pending_rating.stars;
                long j5 = userFull.stars_rating.stars;
                long j6 = j4 - j5;
                if ((j5 < 0 && b6 == 0) || (b6 != 0 && j3 > 0)) {
                    objArr = p66VarArr;
                    nx0Var = i2;
                    yob.X(p66VarArr[b5], aob.q7, null);
                    if (b6 != 0) {
                        objArr[b5].setText(hl.S2(ob6.H(',', "StarRatingLevelNegativeYou", (int) j3)));
                    } else {
                        CompoundButton compoundButton = objArr[b5];
                        Object[] objArr2 = new Object[1];
                        objArr2[b5] = wf3.k(yac.t0, a());
                        compoundButton.setText(hl.S2(ob6.a0(null, null, 2131744829, objArr2)));
                    }
                    ax0Var = ax0Var2;
                    b2 = b5;
                } else {
                    nx0Var = i2;
                    objArr = p66VarArr;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    String H = ob6.H(',', "StarRatingFuture", max);
                    String H2 = ob6.H(',', "StarRatingFuturePendingPoints", (int) j6);
                    CharSequence[] charSequenceArr = new CharSequence[3];
                    charSequenceArr[b5] = H;
                    charSequenceArr[1] = "\n";
                    charSequenceArr[i6] = H2;
                    spannableStringBuilder.append(TextUtils.concat(charSequenceArr));
                    spannableStringBuilder.append((CharSequence) " ");
                    ax0Var = ax0Var2;
                    spannableStringBuilder.append((CharSequence) hl.D2(hl.N2(ob6.M0(2131744843, null), -1, i6, new Runnable() {
                        @Override
                        public final void run() {
                            byte b7 = b5;
                            ji7 ji7Var2 = ji7Var;
                            TLRPC.UserFull userFull2 = userFull;
                            LimitPreviewView limitPreviewView2 = limitPreviewView;
                            switch (b7) {
                                case 0:
                                    RectF rectF = ProfileActivity.Z6;
                                    limitPreviewView2.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    ji7Var2.a(Boolean.TRUE);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.Z6;
                                    limitPreviewView2.d(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                    ji7Var2.a(Boolean.FALSE);
                                    return;
                            }
                        }
                    }, null), true));
                    b2 = b5;
                    objArr[b5].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            byte b7 = b2;
                            ji7 ji7Var2 = ji7Var;
                            TLRPC.UserFull userFull2 = userFull;
                            LimitPreviewView limitPreviewView2 = limitPreviewView;
                            switch (b7) {
                                case 0:
                                    RectF rectF = ProfileActivity.Z6;
                                    limitPreviewView2.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    ji7Var2.a(Boolean.TRUE);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.Z6;
                                    limitPreviewView2.d(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                    ji7Var2.a(Boolean.FALSE);
                                    return;
                            }
                        }
                    });
                    objArr[b2].setText(spannableStringBuilder);
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                String H3 = ob6.H(',', "StarRatingFuturePreview1", max);
                String H4 = ob6.H(',', "StarRatingFuturePreview2", (int) j6);
                CharSequence[] charSequenceArr2 = new CharSequence[3];
                charSequenceArr2[b2] = H3;
                charSequenceArr2[1] = "\n";
                charSequenceArr2[2] = H4;
                spannableStringBuilder2.append(TextUtils.concat(charSequenceArr2));
                spannableStringBuilder2.append((CharSequence) " ");
                spannableStringBuilder2.append((CharSequence) hl.D2(hl.N2(ob6.M0(2131744842, null), -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        byte b7 = b5;
                        ji7 ji7Var2 = ji7Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (b7) {
                            case 0:
                                RectF rectF = ProfileActivity.Z6;
                                limitPreviewView2.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                ji7Var2.a(Boolean.TRUE);
                                return;
                            default:
                                RectF rectF2 = ProfileActivity.Z6;
                                limitPreviewView2.d(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                ji7Var2.a(Boolean.FALSE);
                                return;
                        }
                    }
                }, null), true));
                objArr[1].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        byte b7 = b2;
                        ji7 ji7Var2 = ji7Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (b7) {
                            case 0:
                                RectF rectF = ProfileActivity.Z6;
                                limitPreviewView2.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                ji7Var2.a(Boolean.TRUE);
                                return;
                            default:
                                RectF rectF2 = ProfileActivity.Z6;
                                limitPreviewView2.d(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                ji7Var2.a(Boolean.FALSE);
                                return;
                        }
                    }
                });
                objArr[1].setText(spannableStringBuilder2);
            } else {
                nx0Var = i2;
                ax0Var = ax0Var2;
            }
            TextView textView = new TextView(parentActivity);
            textView.setTypeface(hl.o());
            textView.setGravity(17);
            textView.setText(ob6.M0(2131744824, null));
            textView.setTextSize(1, 20.0f);
            int i7 = aob.G6;
            yob.X(textView, i7, this.A0);
            linearLayout.addView(textView, tre.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(17);
            if (userFull.id == yac.h(this.currentAccount).e()) {
                textView2.setText(hl.S2(ob6.M0(2131744825, null)));
                i = 1;
            } else {
                i = 1;
                uh9.r(null, null, 2131744855, new Object[]{wf3.k(yac.t0, a())}, textView2);
            }
            textView2.setTextSize(i, 14.0f);
            yob.X(textView2, i7, this.A0);
            linearLayout.addView(textView2, tre.t(-1, -2, 17, 20, 0, 20, 12));
            yk8 yk8Var = new yk8(parentActivity, this.A0);
            yk8Var.a.l(ob6.M0(2131744823, null), false);
            String M0 = ob6.M0(2131744858, null);
            int i8 = aob.Fi;
            yk8Var.b.setText(ob6.V(null, null, 2131744854, P1(M0, i8, this.A0)));
            yk8Var.d.setVisibility(8);
            ImageView imageView = yk8Var.c;
            imageView.setImageResource(2131231831);
            vnb vnbVar = this.A0;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            yob.s(imageView, i7, vnbVar, mode);
            linearLayout.addView(yk8Var, tre.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            yk8 yk8Var2 = new yk8(parentActivity, this.A0);
            yk8Var2.a.l(ob6.M0(2131744822, null), false);
            yk8Var2.b.setText(ob6.V(null, null, 2131744853, P1(ob6.M0(2131744858, null), i8, this.A0)));
            yk8Var2.d.setVisibility(8);
            ImageView imageView2 = yk8Var2.c;
            imageView2.setImageResource(2131231895);
            yob.s(imageView2, i7, this.A0, mode);
            linearLayout.addView(yk8Var2, tre.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            yk8 yk8Var3 = new yk8(parentActivity, this.A0);
            yk8Var3.a.l(ob6.M0(2131744821, null), false);
            String M02 = ob6.M0(2131744856, null);
            if (aob.I.o()) {
                v0 = vm2.f(0.25f, aob.v0(aob.m6, this.A0), -16777216);
            } else {
                v0 = aob.v0(aob.y6, this.A0);
            }
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(M02);
            lf4 lf4Var = new lf4(9);
            lf4Var.w = M02;
            if (lf4Var.c != null) {
                lf4Var.c = null;
                lf4Var.a();
            }
            lf4Var.f = v0;
            lf4Var.n = false;
            spannableStringBuilder3.setSpan(lf4Var, 0, spannableStringBuilder3.length(), 0);
            yk8Var3.b.setText(ob6.V(null, null, 2131744852, spannableStringBuilder3));
            yk8Var3.d.setVisibility(8);
            ImageView imageView3 = yk8Var3.c;
            imageView3.setImageResource(2131231879);
            yob.s(imageView3, i7, this.A0, mode);
            linearLayout.addView(yk8Var3, tre.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            c51 c51Var = new c51(this.A0, parentActivity, true);
            c51Var.setOnClickListener(new xy(ax0Var, (byte) 1));
            c51Var.i(wua.l2(ob6.M0(2131743543, null)), false, true);
            linearLayout.addView(c51Var, tre.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            nx0 nx0Var2 = nx0Var;
            nx0Var2.O = linearLayout;
            nx0Var2.show();
        }
    }

    @Override
    public final boolean E() {
        return false;
    }

    public final void E1() {
        int i;
        int i2 = 0;
        if (this.actionBar.getOccupyStatusBar()) {
            i = hl.m;
        } else {
            i = 0;
        }
        this.b2 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i) - hl.L(21.0f));
        this.c2 = 1.38f;
        float f = 0.0f;
        this.d2 = 0.0f;
        W1();
        h3();
        P2(0, 1.0f, true);
        this.e2 = (this.a.getMeasuredWidth() / 2.0f) - (((this.f.getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) this.f.getLayoutParams()).leftMargin);
        float measuredWidth = this.a.getMeasuredWidth() / 2.0f;
        int i3 = ((FrameLayout.LayoutParams) this.r.getLayoutParams()).leftMargin;
        if (!this.v5) {
            i2 = this.r.getPaddingLeft();
        }
        this.g2 = measuredWidth - ((this.r.getExactWidth() * 0.5f) + (i3 + i2));
        if (!this.v5) {
            f = this.r.getPaddingLeft();
        }
        this.C6 = f;
        if (this.J1 != 2) {
            this.v0.setAlpha(1.0f);
        }
        this.Y.setAlpha(1.0f);
        this.f0.setAlpha(1.0f);
    }

    public final boolean E2(boolean[] zArr, boolean z, org.telegram.ui.ActionBar.e eVar, TLRPC.TL_error tL_error) {
        boolean z2;
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        uc7.s1(this.currentAccount).X3.edit().putLong("dialog_join_requested_time_" + this.i1, System.currentTimeMillis()).commit();
        Activity parentActivity = getParentActivity();
        if (xc2.T(this.F2) && !this.F2.megagroup) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i = jw5.t1;
        jw5.F0(parentActivity, this, d31.b0(this), z2);
        if (!z || this.P4 != -1) {
            f4();
            wr8 wr8Var = this.d;
            if (wr8Var != null) {
                wr8Var.f();
            }
        }
        if (eVar instanceof zu1) {
            ((zu1) eVar).Wb(false, true);
        }
        return false;
    }

    public final void E3() {
        int i;
        int i2;
        Long l;
        if (this.T5 != null) {
            return;
        }
        d1a[] d1aVarArr = new d1a[1];
        Rect rect = hl.Q;
        ns1 ns1Var = this.f;
        if (ns1Var != null) {
            Drawable rightDrawable = ns1Var.getRightDrawable();
            ns1 ns1Var2 = this.f;
            if (rightDrawable == null) {
                rect.set(ns1Var2.getWidth() - 1, (this.f.getHeight() / 2) - 1, this.f.getWidth() + 1, (this.f.getHeight() / 2) + 1);
            } else {
                rect.set(ns1Var2.getRightDrawable().getBounds());
                rect.offset((int) ((this.f.getScaleX() - 1.0f) * rect.centerX()), 0);
                rect.offset((int) this.f.getX(), (int) this.f.getY());
            }
        }
        if (this.f.getScaleX() < 1.5f) {
            i = 16;
        } else {
            i = 32;
        }
        int i3 = i;
        int L = (-(this.Z.getHeight() - rect.centerY())) - hl.L(i3);
        Point point = hl.q;
        int min = (int) Math.min(hl.L(324.0f), point.x * 0.95f);
        int centerX = rect.centerX();
        int b = ete.b(centerX - (min / 2), 0, point.x - min);
        Activity parentActivity = getParentActivity();
        Integer valueOf = Integer.valueOf(Math.max(0, centerX - b));
        if (this.F2 == null) {
            i2 = 0;
        } else {
            i2 = 9;
        }
        qq8 qq8Var = new qq8(this, this, parentActivity, valueOf, i2, this.A0, i3, d1aVarArr);
        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.e1));
        if (X1 != null) {
            qq8Var.setExpireDateHint(wf3.g(X1.emoji_status));
        }
        Long l2 = this.F;
        if (l2 != null) {
            qq8Var.setSelected(l2);
        } else {
            ul ulVar = this.G;
            if (ulVar != null) {
                Drawable drawable = ulVar.f[0];
                if (drawable instanceof wl) {
                    l = Long.valueOf(((wl) drawable).h());
                    qq8Var.setSelected(l);
                }
            }
            l = null;
            qq8Var.setSelected(l);
        }
        qq8Var.setSaveState(3);
        qq8Var.y(this.G, this.f);
        rq8 rq8Var = new rq8(this, qq8Var);
        this.T5 = rq8Var;
        d1aVarArr[0] = rq8Var;
        int[] iArr = new int[2];
        ns1 ns1Var3 = this.f;
        if (ns1Var3 != null) {
            ns1Var3.getLocationOnScreen(iArr);
        }
        d1aVarArr[0].showAsDropDown(this.fragmentView, b, L, 51);
        d1aVarArr[0].a();
    }

    public final void F2(TLRPC.User user, String str, boolean z, boolean z2) {
        sjb.c(getParentActivity(), this.currentAccount, a(), user, str, z, z2, this.A0);
    }

    public final void F3() {
        int i = 0;
        this.O.L0.setReordering(false);
        gr8 gr8Var = this.O;
        bha bhaVar = gr8Var.L0;
        if (gr8Var.y1 != null && bhaVar != null) {
            boolean m0 = gr8Var.m0();
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = bhaVar.getTabIds();
            int size = tabIds.size();
            while (i < size) {
                Integer num = tabIds.get(i);
                i++;
                TLRPC.ProfileTab Y = eja.Y(num.intValue(), m0);
                if (Y != null) {
                    arrayList.add(Y);
                }
            }
        }
        this.O.N1(true);
        this.E5.animate().translationY(hl.L(69.0f)).setDuration(180L).setInterpolator(k43.h).withEndAction(new y56(this, (byte) 16)).start();
        d31.b0(this).Q(2131623990, 36, "Tab order changed.").j();
    }

    public final void G1() {
        f89 f89Var;
        View view;
        int top;
        int i;
        int i2;
        float a;
        boolean z;
        if (this.a.getVisibility() == 0) {
            if (this.Q) {
                this.O.setVisibleHeight(this.a.getMeasuredHeight() - this.O.getTop());
            }
            if (this.a.getChildCount() > 0 && !this.G1) {
                boolean z2 = false;
                int i3 = 0;
                while (true) {
                    f89Var = null;
                    if (i3 < this.a.getChildCount()) {
                        if (RecyclerView.S(this.a.getChildAt(i3)) == 0) {
                            view = this.a.getChildAt(i3);
                            break;
                        }
                        i3++;
                    } else {
                        view = null;
                        break;
                    }
                }
                if (view != null) {
                    zp8 zp8Var = this.a;
                    View G = zp8Var.G(view);
                    if (G != null) {
                        f89Var = zp8Var.U(G);
                    }
                    f89Var = (n69) f89Var;
                }
                if (view == null) {
                    top = 0;
                } else {
                    top = view.getTop();
                }
                if (f89Var != null) {
                    i = f89Var.b();
                } else {
                    i = -1;
                }
                if (top >= 0 && i == 0) {
                    i2 = top;
                } else {
                    i2 = 0;
                }
                float f = 1.0f;
                if (view == null) {
                    a = 1.0f;
                } else {
                    a = ete.a((-top) / hl.L(12.0f), 0.0f, 1.0f);
                }
                if (this.R5 != a) {
                    this.R5 = a;
                    V3();
                }
                if (this.r0 == null && this.actionBar.o0) {
                    z = true;
                } else {
                    z = false;
                }
                int i4 = this.N4;
                if (i4 != -1 && !z) {
                    n69 n69Var = (n69) this.a.L(i4);
                    if (n69Var != null && n69Var.a.getTop() <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (this.X5 != z) {
                    this.X5 = z;
                    H1();
                    AnimatorSet animatorSet = this.U5;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = this.V5;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                    }
                    X3(true);
                    d4();
                    i4(false);
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.a aVar = this.actionBar;
                    if (!z) {
                        f = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(aVar, this.Y5, f));
                    this.O.L0.setOpen(z);
                    if (z) {
                        arrayList.add(ObjectAnimator.ofFloat(this, this.p5, 0.0f));
                    }
                    if (this.v0 != null || this.w0 != null) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new op8(this, (byte) 1));
                        arrayList.add(ofFloat);
                    }
                    J1();
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    this.U5 = animatorSet3;
                    animatorSet3.playTogether(arrayList);
                    this.U5.setInterpolator(k43.f);
                    this.U5.addListener(new mq8(this, (byte) 1));
                    this.U5.setDuration(150L);
                    this.U5.start();
                    jn7.e().k(jn7.u4, Boolean.TRUE);
                }
                float f2 = i2;
                if (this.Q1 != f2 && !this.H1) {
                    this.Q1 = f2;
                    this.d1.invalidate();
                    if (this.J1 != 0) {
                        if (this.Q1 > X1()) {
                            z2 = true;
                        }
                        this.M1 = z2;
                    }
                    O2(true);
                }
            }
        }
    }

    public final void G2() {
        uc7.s1(this.currentAccount).j0(null);
        this.V.H(0);
        this.W.H(0);
    }

    public final void G3() {
        int v0;
        int v02;
        if (!this.q2) {
            kq8 kq8Var = this.r;
            if (kq8Var != null) {
                Object tag = kq8Var.getTag();
                boolean z = tag instanceof Integer;
                kq8 kq8Var2 = this.r;
                if (z) {
                    kq8Var2.setTextColor(A1(aob.v0(((Integer) tag).intValue(), this.A0), Boolean.valueOf(this.K0[0])));
                } else {
                    kq8Var2.setTextColor(A1(aob.v0(aob.B8, this.A0), Boolean.TRUE));
                }
            }
            Drawable drawable = this.x;
            int i = -1;
            if (drawable != null) {
                if (this.n6 != null) {
                    v02 = -1;
                } else {
                    v02 = aob.v0(aob.gd, this.A0);
                }
                drawable.setColorFilter(v02, PorterDuff.Mode.MULTIPLY);
            }
            yt9 yt9Var = this.L;
            if (yt9Var != null) {
                yt9Var.b(aob.v0(aob.h8, this.A0));
            }
            ns1 ns1Var = this.f;
            if (ns1Var != null) {
                ns1Var.setTextColor(aob.v0(aob.mi, this.A0));
            }
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            if (aVar != null) {
                if (this.n6 == null) {
                    i = aob.v0(aob.v8, this.A0);
                }
                aVar.H(i, false);
                org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
                if (this.n6 != null) {
                    v0 = 553648127;
                } else {
                    v0 = aob.v0(aob.f8, this.A0);
                }
                aVar2.G(v0, false);
            }
        }
        M3();
        m4();
    }

    @Override
    public final void H(float f) {
        vb5 vb5Var = this.h0;
        if (vb5Var == null) {
            return;
        }
        vb5Var.setProgress(f);
        this.o0.O(this.L2, f);
    }

    public final void H1() {
        int i;
        gr8 gr8Var = this.O;
        if (gr8Var != null) {
            if (!this.X5 && this.W5 <= 0.0f) {
                i = 0;
            } else {
                i = Integer.MAX_VALUE;
            }
            gr8Var.setPagesVisibleOverscanTop(i);
        }
    }

    public final void H2(TLRPC.User user) {
        int i;
        if (this.a4 >= 0) {
            if (this.N4 == -1) {
                f4();
                this.d.f();
            } else {
                Z3(false, false);
            }
        }
        if (this.N4 == -1) {
            if (!this.o2 && !hl.O1()) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
                if (this.actionBar.getOccupyStatusBar()) {
                    i = hl.m;
                } else {
                    i = 0;
                }
                int i2 = currentActionBarHeight + i;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.a.getMeasuredWidth(), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.a.getMeasuredHeight(), 0);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    wr8 wr8Var = this.d;
                    if (i3 >= wr8Var.e.O2) {
                        break;
                    }
                    f89 a = wr8Var.a(null, wr8Var.d(i3));
                    View view = a.a;
                    this.d.t(a, i3);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 += view.getMeasuredHeight();
                    i3++;
                }
                int max = Math.max(0, this.fragmentView.getMeasuredHeight() - ((d2() + i4) + i2));
                zp8 zp8Var = this.a;
                zp8Var.setPadding(0, zp8Var.getPaddingTop(), 0, max);
            } else {
                this.a.setPadding(0, d2(), 0, 0);
                this.k2.cancel();
                float[] fArr = this.n2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                o3(1.0f);
                this.Q1 = d2();
            }
        }
        this.M.m(this.i1, user, 8);
    }

    public final void H3() {
        int i;
        float f;
        d26 d26Var;
        if (this.a0 != null && this.r != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i = hl.m;
            } else {
                i = 0;
            }
            int i2 = currentActionBarHeight + i;
            ap8 ap8Var = this.a0;
            boolean z = this.G1;
            ap8Var.e = z;
            if (z && this.J1 == 2 && (d26Var = this.Y) != null) {
                this.a0.f = this.Y.getY() + (this.Y.getScaleY() * d26Var.getHeight());
                this.a0.setAlpha(this.T1);
                ap8 ap8Var2 = this.a0;
                ap8Var2.x = hl.L(74.0f);
                ap8Var2.setTranslationY(this.a.getMeasuredWidth());
                ap8Var2.invalidate();
            } else {
                ap8Var.f = -1.0f;
                float f2 = i2;
                float f3 = this.Q1 + f2;
                if (!this.L4 && !this.M4) {
                    f = 0.0f;
                } else {
                    f = 25.0f;
                }
                float L = f3 - hl.L(f);
                float min = Math.min(hl.L(74.0f), L - f2);
                ap8 ap8Var3 = this.a0;
                ap8Var3.x = min;
                ap8Var3.setTranslationY(L - min);
                ap8Var3.invalidate();
            }
            ImageView imageView = this.P0;
            if (imageView != null && imageView.getTag() != null) {
                this.a0.getClass();
                if (this.P0.getVisibility() == 0) {
                    this.P0.setVisibility(8);
                }
                if (this.P0.getTag() instanceof s7) {
                    ((s7) this.P0.getTag()).setAlpha(1.0f);
                }
            }
        }
    }

    @Override
    public final void I() {
        k3(false);
    }

    public final void I1() {
        float alpha;
        boolean z;
        byte b = this.J1;
        float f = 0.0f;
        boolean z2 = true;
        if (b == 1 && (!this.r5 || this.G1)) {
            this.x6 = 0.0f;
        } else if (b == 2 && (!this.r5 || this.G1)) {
            kq8 kq8Var = this.r;
            if (kq8Var == null) {
                alpha = 0.0f;
            } else {
                alpha = kq8Var.getAlpha();
            }
            this.x6 = alpha;
        } else {
            int i = (this.e1 > yac.h(this.currentAccount).n ? 1 : (this.e1 == yac.h(this.currentAccount).n ? 0 : -1));
            float f2 = this.l2;
            float f3 = this.t5;
            if (i == 0) {
                this.x6 = (1.0f - f3) * f2;
            } else {
                this.x6 = f2 * f3;
            }
        }
        if (this.e1 == yac.h(this.currentAccount).n) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.v5) {
            this.u5 = hl.L(28.0f) * this.x6;
            kq8 kq8Var2 = this.r;
            if (kq8Var2 != null) {
                kq8Var2.setTranslationX(g2(this.B6, this.D6));
                this.Z.invalidate();
            }
        }
        if (z) {
            if (this.v5) {
                f = this.l2;
            }
        } else if (this.w5) {
            f = this.x6;
        }
        gs8 gs8Var = this.F6;
        if (gs8Var != null) {
            gs8Var.e = 1.0f - f;
            gs8Var.invalidateSelf();
        }
        if (f <= 0.5f) {
            z2 = false;
        }
        this.A6 = z2;
        d4();
    }

    public final void I2(ValueAnimator valueAnimator, float f, boolean z) {
        int i;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.V1 = floatValue;
        float f2 = (floatValue - 0.5f) / 0.5f;
        float f3 = (0.5f - floatValue) / 0.5f;
        float f4 = 0.0f;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        float f5 = -f;
        this.U1 = (int) ((1.0f - floatValue) * f5);
        this.b.setTranslationY(floatValue * f);
        this.P.setTranslationY(f * this.V1);
        this.a.setTranslationY((1.0f - this.V1) * f5);
        this.a.setScaleX(1.0f - ((1.0f - this.V1) * 0.01f));
        this.a.setScaleY(1.0f - ((1.0f - this.V1) * 0.01f));
        this.a.setAlpha(this.V1);
        boolean z2 = true;
        O2(true);
        this.a.setAlpha(f2);
        this.b.setAlpha(1.0f - this.V1);
        this.b.setScaleX((this.V1 * 0.05f) + 1.0f);
        this.b.setScaleY((this.V1 * 0.05f) + 1.0f);
        this.P.setAlpha(1.0f - f2);
        this.Y.setAlpha(f2);
        this.f0.setAlpha(f2);
        lq8 lq8Var = this.v0;
        if (lq8Var != null) {
            lq8Var.setAlpha(f2);
        }
        this.f.setAlpha(f2);
        kq8 kq8Var = this.r;
        if (!this.X5) {
            f4 = f2;
        }
        kq8Var.setAlpha(f4);
        this.U0.getSearchField().setAlpha(f3);
        if (z && this.V1 < 0.7f) {
            sla slaVar = this.U0;
            if (slaVar.G.getWidth() != 0 && !slaVar.e.isFocused()) {
                slaVar.e.requestFocus();
                hl.E3(slaVar.e);
            }
        }
        FrameLayout searchContainer = this.U0.getSearchContainer();
        int i2 = 8;
        if (this.V1 < 0.5f) {
            i = 0;
        } else {
            i = 8;
        }
        searchContainer.setVisibility(i);
        if (this.V1 > 0.5f) {
            i2 = 0;
        }
        sla slaVar2 = this.T0;
        if (slaVar2 != null) {
            slaVar2.setVisibility(i2);
            this.T0.setAlpha(f2);
        }
        this.U0.setVisibility(i2);
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (this.V1 >= 0.5f) {
            z2 = false;
        }
        aVar.C(z2);
        sla slaVar3 = this.T0;
        if (slaVar3 != null) {
            slaVar3.setAlpha(f2);
        }
        this.U0.setAlpha(f2);
        this.d1.invalidate();
        this.fragmentView.invalidate();
    }

    public final void I3() {
        int i;
        if (this.Z0 != null && this.a1 != null) {
            TLRPC.UserFull userFull = this.w2;
            if (userFull == null && this.v2 == null) {
                i = 0;
            } else if (userFull != null) {
                i = userFull.ttl_period;
            } else {
                i = this.v2.ttl_period;
            }
            this.t0.b(i);
            this.a1.B(i);
        }
    }

    public final void J1() {
        boolean z;
        jva jvaVar = this.T;
        if (jvaVar != null) {
            if (!this.X5 && this.d6) {
                z = true;
            } else {
                z = false;
            }
            jvaVar.setVisibility(z);
        }
    }

    public final void J2() {
        u57.b(getParentActivity(), this.currentAccount, a(), true, null, new y56(this, (byte) 23), this.A0);
    }

    public final void J3() {
        float L;
        boolean z;
        if (this.y5 != null) {
            gr8 gr8Var = this.O;
            if (gr8Var != null && gr8Var.isAttachedToWindow()) {
                L = hl.L(232.0f) - (this.a.getMeasuredHeight() - this.O.getY());
            } else {
                L = hl.L(72.0f);
            }
            int i = 0;
            if (L <= 0.0f) {
                z = true;
            } else {
                z = false;
            }
            fm0 fm0Var = this.S5;
            fm0Var.a(z, true);
            float f = fm0Var.e;
            this.y5.setTranslationY(hl.U1(f, hl.L(60.0f), 0));
            this.y5.setAlpha(f);
            FrameLayout frameLayout = this.y5;
            if (f <= 0.0f) {
                i = 4;
            }
            frameLayout.setVisibility(i);
            v21 v21Var = v21.x;
            if (v21Var != null) {
                v21Var.l();
            }
        }
    }

    public final void K1(int i) {
        boolean t0 = eja.t0(this.O.getClosestTab());
        if (i == this.L6 && t0 == this.M6) {
            return;
        }
        this.L6 = i;
        this.M6 = t0;
        if (t0) {
            c51[] c51VarArr = this.C5;
            if (i > 0) {
                c51VarArr[0].i(ob6.G(i, "HideStoriesFromAlbum", new Object[0]), true, true);
            } else {
                c51VarArr[0].i(this.B5, true, true);
            }
        } else if (i <= 0 && uc7.s1(this.currentAccount).k5()) {
            this.C5[0].i(this.A5, true, true);
        } else {
            this.C5[0].i(ob6.G(i, "ArchiveStories", new Object[0]), true, true);
        }
    }

    public final void K2(TLRPC.EmojiStatus emojiStatus, TLRPC.User user, ns1 ns1Var) {
        jn5 b;
        String str;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            m01.u(getParentActivity(), "https://" + getMessagesController().N2 + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        kl8 kl8Var = new kl8(this, this.currentAccount, user, null, null, this.A0);
        ns1Var.getLocationOnScreen(new int[2]);
        kl8Var.q2 = ns1Var.i0;
        kl8Var.r2 = ns1Var.j0;
        kl8Var.u2 = ns1Var.getScaleX();
        kl8Var.s2 = ns1Var.getLeft();
        kl8Var.t2 = ns1Var.getTop();
        kl8Var.v2 = ns1Var;
        Drawable rightDrawable = ns1Var.getRightDrawable();
        ul ulVar = this.G;
        if (rightDrawable == ulVar && ulVar != null) {
            Drawable drawable = ulVar.f[0];
            if (drawable instanceof wl) {
                kl8Var.u2 *= 0.98f;
                TLRPC.Document document = ((wl) drawable).e;
                if (document != null) {
                    de0 de0Var = new de0(getParentActivity());
                    ggb d = lp3.d(document.thumbs, aob.m6, 0.2f, false);
                    TLRPC.PhotoSize w = xb4.w(document.thumbs, 90, false, null, false);
                    if ("video/webm".equals(document.mime_type)) {
                        b = jn5.b(document);
                        if (d != null) {
                            d.e = 512;
                            d.f = 512;
                        }
                        str = "160_160_g";
                    } else {
                        if (d != null && r47.K2(document, false)) {
                            d.e = 512;
                            d.f = 512;
                        }
                        b = jn5.b(document);
                        str = "160_160";
                    }
                    jn5 jn5Var = b;
                    String str2 = str;
                    de0Var.setLayerNum(7);
                    de0Var.setRoundRadius(hl.L(4.0f));
                    de0Var.j(jn5Var, str2, jn5.c(w, document), "140_140", d, document);
                    if (((wl) this.G.f[0]).c()) {
                        de0Var.setColorFilter(new PorterDuffColorFilter(aob.v0(aob.v6, this.A0), PorterDuff.Mode.SRC_IN));
                        kl8Var.x2 = r47.i1(document);
                    } else {
                        kl8Var.x2 = r47.i1(document);
                    }
                    kl8Var.w2 = de0Var;
                    kl8Var.z2 = true;
                }
            }
        }
        showDialog(kl8Var);
    }

    public final void K3() {
        boolean z;
        kg5 kg5Var = this.H6;
        if (kg5Var != null) {
            float f = 0.0f;
            kg5Var.o(0.0f, (this.f.getScaleX() * this.f.getRightDrawableX()) + this.f.getX() + (-kg5Var.getPaddingLeft()));
            float S1 = hl.S1(this.m2, this.n2);
            kg5 kg5Var2 = this.H6;
            kg5Var2.setTranslationY(((this.f.getY() + (-kg5Var2.getPaddingBottom())) - hl.L(24.0f)) + hl.U1(S1, hl.L(6.0f), -hl.L(12.0f)));
            this.H6.i(vm2.f(S1, this.I6, 1342177280));
            if (this.Q1 >= hl.L(82.0f)) {
                z = true;
            } else {
                z = false;
            }
            Boolean bool = this.J6;
            if (bool != null && bool.booleanValue() == z) {
                return;
            }
            ViewPropertyAnimator animate = this.H6.animate();
            this.J6 = Boolean.valueOf(z);
            if (z) {
                f = 1.0f;
            }
            ik8.t(animate.alpha(f), k43.g, 200L);
        }
    }

    public final void L1(boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.L1(boolean):void");
    }

    public final void L2(boolean z) {
        boolean z2;
        boolean c0 = xc2.c0(this.F2);
        TLRPC.Chat chat = this.F2;
        if (!c0 && !z && (chat == null || !chat.creator)) {
            z2 = false;
        } else {
            z2 = true;
        }
        jj.r(this, false, chat, null, false, z2, z, !c0, new bp8(this, (byte) 10));
    }

    public final void L3() {
        if (getParentActivity() != null && this.V0 != null) {
            if (getUserConfig().p()) {
                this.V0.setIcon(2131231866);
                return;
            }
            Drawable drawable = getParentActivity().getDrawable(2131231867);
            drawable.setColorFilter(new PorterDuffColorFilter(aob.v0(aob.F8, this.A0), PorterDuff.Mode.SRC_IN));
            this.W6 = drawable;
            Drawable drawable2 = getParentActivity().getDrawable(2131232174);
            drawable2.setColorFilter(new PorterDuffColorFilter(vm2.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            this.V0.setIcon(new d58(drawable, drawable2, hl.L(1.0f), -hl.L(1.0f)));
        }
    }

    public final void M1(Context context) {
        int i;
        this.a1 = new guc(context, this.T0.getPopupLayout().getSwipeBack(), new aj3(this, (byte) 28), false, 0, this.A0);
        if (this.i1 > 0 || this.e1 > 0) {
            int v0 = aob.v0(aob.n6, this.A0);
            guc gucVar = this.a1;
            p66 p66Var = (p66) gucVar.e;
            if (p66Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) ob6.M0(2131753841, null));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) hl.K2(ob6.M0(2131753840, null), v0, new pz(gucVar, (byte) 4)));
                p66Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.w2;
        if (userFull == null) {
            TLRPC.ChatFull chatFull = this.v2;
            if (chatFull != null) {
                i = chatFull.ttl_period;
            } else {
                i = 0;
            }
        } else {
            i = userFull.ttl_period;
        }
        rsb a = rsb.a(i);
        this.t0 = a;
        this.Z0 = this.T0.i(0, a, ob6.M0(2131753839, null), (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.a1.b);
        this.T0.a(-1);
        I3();
    }

    public final void M3() {
        N3(this.m6);
    }

    public final void N1() {
        if (this.fragmentView != null && this.u6 && this.z2 != null && getParentActivity() != null) {
            ns8 ns8Var = this.G6;
            if (ns8Var != null) {
                ns8Var.b(this.z2);
                this.G6.invalidate();
                return;
            }
            ns8 ns8Var2 = new ns8(this, this.z2);
            this.G6 = ns8Var2;
            ((FrameLayout) this.fragmentView).addView(ns8Var2, tre.e(-1, -1, 55));
        }
    }

    public final boolean N2() {
        if (getMessagesController().O1().J(a()) && !this.q1) {
            return true;
        }
        return false;
    }

    public final void N3(float f) {
        int R0;
        kc7 kc7Var = this.n6;
        if (kc7Var != null) {
            R0 = vm2.f(0.25f, kc7Var.m(aob.I.o()), -1);
        } else {
            R0 = hl.R0(this.W5, 1.0f, aob.v0(aob.qi, this.A0), aob.v0(aob.Fj, this.A0));
        }
        int f2 = vm2.f(f, R0, -1);
        int i = aob.Fj;
        int f3 = vm2.f(Math.max(this.W5, this.G5), f2, aob.v0(i, this.A0));
        ul ulVar = this.G;
        if (ulVar != null) {
            ulVar.k(Integer.valueOf(f3));
        }
        ul ulVar2 = this.H;
        if (ulVar2 != null) {
            ulVar2.k(Integer.valueOf(vm2.f(this.W5, vm2.f(f, R0, -1711276033), aob.v0(i, this.A0))));
        }
        this.e0.setColor(f3);
        this.m6 = f;
    }

    @Override
    public final void O(boolean z, boolean z2) {
        vb5 vb5Var = this.h0;
        if (vb5Var == null) {
            return;
        }
        vb5Var.setProgress(0.0f);
    }

    public final void O1(Context context) {
        jla jlaVar = this.simpleActionBar;
        if (jlaVar != null) {
            hl.B2(jlaVar);
        }
        wq8 wq8Var = new wq8(this, context, this.A0);
        this.simpleActionBar = wq8Var;
        wq8Var.setTitlesAlpha(0.0f);
        if (!this.r5 && !this.J0 && this.J1 != 0 && this.M1 && !this.N1) {
            this.simpleActionBar.setAlpha(0.0f);
        }
        this.simpleActionBar.setOccupyStatusBar(this.actionBar.getOccupyStatusBar());
        this.simpleActionBar.setMenuOverlayProvider(new yf0(this, (byte) 4));
        boolean z = this.J0;
        jla jlaVar2 = this.simpleActionBar;
        if (z) {
            jlaVar2.setBackButtonImage(2131232501);
            this.simpleActionBar.setBackButtonContentDescription(ob6.M0(2131746227, null));
        } else {
            jlaVar2.setBackButtonImage(2131231243);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 4));
        if (!this.J0) {
            View backButton = this.simpleActionBar.getBackButton();
            backButton.setOnLongClickListener(new v0(this, backButton, (byte) 6));
        }
    }

    public final void O2(boolean z) {
        int i;
        int i2;
        float f;
        float f2;
        float f3;
        float S1;
        de0 currentItemView;
        float f4;
        float S12;
        int i3;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        FrameLayout.LayoutParams layoutParams;
        float f11;
        int i4;
        int i5;
        ns1 ns1Var;
        int v0;
        float f12;
        int i6;
        boolean z2;
        TLRPC.ChatFull chatFull;
        int i7;
        this.glassEngine.g();
        if (this.actionBar.getOccupyStatusBar()) {
            i = hl.m;
        } else {
            i = 0;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i;
        float D1 = D1();
        S3();
        zp8 zp8Var = this.a;
        if (zp8Var != null && !this.G1) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) zp8Var.getLayoutParams();
            if (layoutParams2.topMargin != currentActionBarHeight) {
                layoutParams2.topMargin = currentActionBarHeight;
                this.a.setLayoutParams(layoutParams2);
            }
        }
        l4(z);
        if (this.Y != null) {
            this.a.setTopGlowOffset((int) this.Q1);
            zp8 zp8Var2 = this.a;
            if (this.Q1 > d2() && this.Q1 < (X1() + this.a.getMeasuredWidth()) - currentActionBarHeight) {
                i7 = 2;
            } else {
                i7 = 0;
            }
            zp8Var2.setOverScrollMode(i7);
        }
        if (this.Y != null && !this.i6 && this.G1) {
            C1();
            return;
        }
        int d2 = d2();
        if (this.Y != null) {
            if (this.a0 != null && this.f1 != 0) {
                if (xc2.T(this.F2) && !this.F2.megagroup && (chatFull = this.v2) != null && chatFull.linked_chat_id != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.a0.o(2, z2);
            }
            l4(z);
            if (this.actionBar.getOccupyStatusBar()) {
                i2 = hl.m;
            } else {
                i2 = 0;
            }
            float translationY = this.actionBar.getTranslationY() + (uh9.v(D1, 1.0f, org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f, i2) - hl.L(21.0f));
            if (!this.G1) {
                ku8 ku8Var = this.u0;
                if (ku8Var != null) {
                    f12 = -hl.L(29.0f);
                    um7 um7Var = ku8Var.n;
                    if (um7Var != null && um7Var.c) {
                        f12 = um7Var.e.centerY();
                    }
                } else {
                    f12 = -hl.L(29.0f);
                }
                if (this.actionBar.getOccupyStatusBar()) {
                    i6 = hl.m;
                } else {
                    i6 = 0;
                }
                this.b2 = hl.R1(f12, this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i6) - hl.L(21.0f)), D1);
            } else {
                this.b2 = translationY;
            }
            if (this.G1) {
                f = this.S1;
            } else {
                f = this.Q1;
            }
            float f13 = d2;
            if (f <= f13 && !this.q2) {
                f2 = 2.0f;
                f3 = 18.0f;
            } else {
                f2 = 2.0f;
                float w = qu6.w(f - f13, (this.a.getMeasuredWidth() - currentActionBarHeight) - e2(), 1.0f, 0.0f);
                this.i2 = w;
                f3 = 18.0f;
                this.c2 = (hl.R1(2.2857144f, 3.2857144f, Math.min(1.0f, w * 3.0f)) / 100.0f) * 42.0f;
                this.d2 = 0.0f;
                lq8 lq8Var = this.v0;
                if (lq8Var != null) {
                    lq8Var.invalidate();
                }
                gu8 gu8Var = this.w0;
                if (gu8Var != null) {
                    gu8Var.invalidate();
                }
                float min = Math.min(hl.N(2000.0f), Math.max(hl.N(1100.0f), Math.abs(this.j2))) / hl.N(1100.0f);
                X1();
                boolean z3 = this.p2;
                int i8 = jn7.u4;
                float[] fArr = this.n2;
                if (z3 && (this.G0 || this.i2 >= 0.33f)) {
                    if (!this.q2) {
                        if (this.T0 != null) {
                            boolean q2 = q2();
                            sla slaVar = this.T0;
                            if (!q2) {
                                slaVar.S(21);
                            } else {
                                slaVar.u(21);
                            }
                            if (this.r0 != null) {
                                this.T0.S(36);
                                this.T0.S(34);
                                this.T0.S(35);
                                this.T0.u(33);
                                this.T0.u(31);
                            }
                        }
                        sla slaVar2 = this.U0;
                        if (slaVar2 != null) {
                            slaVar2.setEnabled(false);
                        }
                        this.q2 = true;
                        jn7.e().k(i8, Boolean.TRUE);
                        this.N.f(true, min);
                        this.p0.b(min);
                        this.o0.setCreateThumbFromParent(true);
                        this.o0.getAdapter().g();
                        this.k2.cancel();
                        fArr[0] = hl.S1(this.m2, fArr);
                        fArr[1] = 1.0f;
                        lq8 lq8Var2 = this.v0;
                        if (lq8Var2 != null && !lq8Var2.x.isEmpty()) {
                            this.k2.setInterpolator(new x84());
                            this.k2.setDuration((((1.0f - S12) * 1.3f) * 250.0f) / min);
                        } else {
                            this.k2.setInterpolator(k43.j);
                            this.k2.setDuration(((1.0f - S12) * 250.0f) / min);
                        }
                        this.k2.addListener(new mq8(this, (byte) 4));
                        View m = this.c.m(0);
                        if (!this.P1 && m != null) {
                            this.O1 = true;
                            int currentActionBarHeight2 = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
                            if (this.actionBar.getOccupyStatusBar()) {
                                i3 = hl.m;
                            } else {
                                i3 = 0;
                            }
                            this.a.z0(((m.getTop() - this.a.getMeasuredWidth()) - X1()) + currentActionBarHeight2 + i3, (int) this.k2.getDuration(), (Interpolator) this.k2.getInterpolator());
                            this.a.P0 = false;
                        }
                        this.g6 = this.f.getTranslationY();
                        this.h6 = this.r.getTranslationY();
                        this.k2.start();
                        this.o0.setAlpha(0.0f);
                        this.o0.setVisibility(0);
                        try {
                            this.Y.performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    ViewGroup.LayoutParams layoutParams3 = this.o0.getLayoutParams();
                    int i9 = layoutParams3.height;
                    layoutParams3.width = this.a.getMeasuredWidth();
                    float f14 = currentActionBarHeight + f;
                    int i10 = (int) f14;
                    layoutParams3.height = i10;
                    if (i9 != i10) {
                        this.o0.requestLayout();
                    }
                    if (!this.k2.isRunning()) {
                        if (this.G1 && this.J1 == 2) {
                            f4 = (-(1.0f - this.T1)) * hl.L(50.0f);
                        } else {
                            f4 = 0.0f;
                        }
                        this.f.setTranslationX(hl.N(18.0f) - this.f.getLeft());
                        this.f.setTranslationY((((f14 - X1()) - hl.N(30.0f)) - this.f.getBottom()) + f4);
                        this.r.setTranslationX(g2(hl.N(16.0f) - this.r.getLeft(), 0.0f));
                        this.r.setTranslationY(h2((((f14 - X1()) - hl.N(10.0f)) - this.r.getBottom()) + f4));
                        K3();
                    }
                } else {
                    if (this.q2) {
                        this.q2 = false;
                        jn7.e().k(i8, Boolean.TRUE);
                        sla slaVar3 = this.T0;
                        if (slaVar3 != null) {
                            slaVar3.u(21);
                            if (this.r0 != null) {
                                this.T0.u(33);
                                this.T0.u(34);
                                this.T0.u(35);
                                this.T0.S(36);
                                this.T0.S(31);
                            }
                        }
                        sla slaVar4 = this.U0;
                        if (slaVar4 != null) {
                            slaVar4.setEnabled(!this.z1);
                        }
                        this.N.f(false, min);
                        this.p0.b(min);
                        this.k2.cancel();
                        this.f0.getImageReceiver().u0 = true;
                        this.f0.getImageReceiver().w0(false);
                        fArr[0] = hl.S1(this.m2, fArr);
                        fArr[1] = 0.0f;
                        this.k2.setInterpolator(k43.j);
                        boolean z4 = this.o2;
                        ValueAnimator valueAnimator = this.k2;
                        if (!z4) {
                            valueAnimator.setDuration((S1 * 250.0f) / min);
                        } else {
                            valueAnimator.setDuration(0L);
                        }
                        this.d1.setBackgroundColor(aob.v0(aob.a7, this.A0));
                        if (!this.I0 && (currentItemView = this.o0.getCurrentItemView()) != null) {
                            boolean z5 = currentItemView.getImageReceiver().t() instanceof idc;
                            iq8 iq8Var = this.f0;
                            if (z5) {
                                iq8Var.b0 = false;
                            } else {
                                iq8Var.b0 = true;
                                iq8Var.setForegroundImageDrawable(currentItemView.getImageReceiver().u());
                            }
                        }
                        this.k2.addListener(new mq8(this, (byte) 5));
                        this.f0.setForegroundAlpha(1.0f);
                        this.Y.setVisibility(0);
                        this.o0.setAlpha(0.0f);
                        this.k2.start();
                        this.P1 = false;
                        try {
                            this.Y.performHapticFeedback(3, 1);
                        } catch (Exception unused2) {
                        }
                    }
                    this.Y.setScaleX(this.c2);
                    this.Y.setScaleY(this.c2);
                    W1();
                    ValueAnimator valueAnimator2 = this.k2;
                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                        h3();
                        this.f.setTranslationY(this.f2);
                        this.r.setTranslationX(g2(this.g2, this.C6));
                        this.r.setTranslationY(h2(this.h2));
                        K3();
                    }
                }
            }
            boolean z6 = this.G1;
            if (z6 && this.J1 == 2) {
                float f15 = this.k6;
                if (this.actionBar.getOccupyStatusBar()) {
                    i5 = hl.m;
                } else {
                    i5 = 0;
                }
                float translationY2 = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / f2) + i5) - (hl.p * 21.0f));
                this.f.setPivotY(ns1Var.getMeasuredHeight());
                this.f.setScaleX(1.38f);
                this.f.setScaleY(1.38f);
                this.c2 = hl.U1(this.T1, 42, 138) / 100.0f;
                this.d2 = 0.0f;
                lq8 lq8Var3 = this.v0;
                if (lq8Var3 != null) {
                    lq8Var3.setExpandProgress(1.0f);
                }
                gu8 gu8Var2 = this.w0;
                if (gu8Var2 != null) {
                    gu8Var2.setExpandProgress(1.0f);
                }
                this.f0.setRoundRadiusForExpand((int) hl.R1(m2(), 0.0f, this.T1));
                this.Y.setTranslationX(hl.R1(f15, 0.0f, this.T1));
                this.Y.setTranslationY(hl.R1((float) Math.ceil(translationY2), 0.0f, this.T1));
                float measuredWidth = ((this.c2 * 100.0f) / 42.0f) * (this.Y.getMeasuredWidth() - hl.L(42.0f));
                this.i0.setTranslationX(this.Y.getX() + hl.L(16.0f) + measuredWidth);
                this.i0.setTranslationY(this.Y.getY() + hl.L(-10.0f) + measuredWidth);
                this.j0.setTranslationX(this.Y.getX() + hl.L(28.0f) + measuredWidth);
                this.j0.setTranslationY(this.Y.getY() + hl.L(26.5f) + measuredWidth);
                this.k0.setTranslationX(this.Y.getX() + hl.L(28.0f) + measuredWidth);
                this.k0.setTranslationY(this.Y.getY() + hl.L(24.0f) + measuredWidth);
                this.l0.setTranslationX(this.Y.getX() + hl.L(28.0f) + measuredWidth);
                this.l0.setTranslationY(this.Y.getY() + hl.L(24.0f) + measuredWidth);
                this.Y.setScaleX(this.c2);
                this.Y.setScaleY(this.c2);
                this.o0.setAlpha(0.0f);
                this.o0.setVisibility(0);
                iq8 iq8Var2 = this.f0;
                float f16 = this.T1;
                float f17 = this.c2;
                iq8Var2.I = f16;
                iq8Var2.J = f17;
                iq8Var2.H = true;
                this.N.e(false, f16);
                org.telegram.ui.ActionBar.a aVar = this.actionBar;
                int i11 = -1;
                if (this.n6 != null) {
                    v0 = -1;
                } else {
                    v0 = aob.v0(aob.v8, this.A0);
                }
                aVar.H(vm2.f(this.T1, v0, -1), false);
                yt9 yt9Var = this.L;
                if (yt9Var != null) {
                    yt9Var.b(vm2.f(this.T1, aob.v0(aob.h8, this.A0), -1275068417));
                }
                Drawable drawable = this.x;
                if (drawable != null) {
                    if (this.n6 == null) {
                        i11 = vm2.f(this.T1, aob.v0(aob.gd, this.A0), -1);
                    }
                    drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                }
                e43 e43Var = this.J;
                if (e43Var != null) {
                    e43Var.a(this.T1);
                    this.f.invalidate();
                }
                e43 e43Var2 = this.K;
                if (e43Var2 != null) {
                    e43Var2.a(this.T1);
                    this.f.invalidate();
                }
                N3(this.T1);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
                layoutParams4.width = (int) hl.R1(hl.N(100.0f), this.a.getMeasuredWidth() / this.c2, this.T1);
                layoutParams4.height = (int) hl.R1(hl.N(100.0f), (this.Q1 + currentActionBarHeight) / this.c2, this.T1);
                this.Y.requestLayout();
                K3();
            } else if (f <= f13) {
                if (z6) {
                    this.c2 = hl.U1(D1, 42, 96) / 100.0f;
                    this.d2 = 0.0f;
                    f6 = 1.0f;
                } else {
                    ku8 ku8Var2 = this.u0;
                    if (ku8Var2 != null) {
                        f5 = ku8Var2.getHiddenAvatarSizeDp();
                    } else {
                        f5 = 24.0f;
                    }
                    this.c2 = hl.R1(f5, 96.0f, D1) / 100.0f;
                    f6 = 1.0f;
                    this.d2 = 1.0f - D1;
                }
                ap8 ap8Var = this.a0;
                if (ap8Var != null) {
                    if (this.G1) {
                        ap8Var.setAlpha(this.T1);
                    } else {
                        ap8Var.setAlpha(f6);
                    }
                }
                lq8 lq8Var4 = this.v0;
                if (lq8Var4 != null) {
                    lq8Var4.invalidate();
                }
                gu8 gu8Var3 = this.w0;
                if (gu8Var3 != null) {
                    gu8Var3.h = this.G1;
                    float l = Utilities.l((D1 - 0.3f) / 0.7f);
                    if (gu8Var3.f != l) {
                        gu8Var3.f = l;
                        gu8Var3.invalidate();
                    }
                }
                if (this.G1) {
                    f7 = hl.R1(j2(0), 1.12f, D1);
                } else {
                    f7 = (0.12f * D1) + 1.0f;
                }
                ValueAnimator valueAnimator3 = this.k2;
                if (valueAnimator3 != null && valueAnimator3.isRunning()) {
                    ValueAnimator valueAnimator4 = this.k2;
                    mq8 mq8Var = this.e6;
                    valueAnimator4.removeListener(mq8Var);
                    this.k2.addListener(mq8Var);
                } else {
                    this.Y.setScaleX(this.c2);
                    this.Y.setScaleY(this.c2);
                    W1();
                    this.Y.setTranslationY((float) Math.ceil(this.b2));
                    float L = (((this.c2 * 100.0f) / 42.0f) * hl.L(42.0f)) - hl.L(42.0f);
                    this.i0.setTranslationX(this.Y.getX() + hl.L(16.0f) + L);
                    this.i0.setTranslationY(this.Y.getY() + hl.L(-10.0f) + L);
                    this.j0.setTranslationX(this.Y.getX() + hl.L(28.0f) + L);
                    this.j0.setTranslationY(this.Y.getY() + hl.L(26.5f) + L);
                    this.k0.setTranslationX(this.Y.getX() + hl.L(28.0f) + L);
                    this.k0.setTranslationY(this.Y.getY() + hl.L(24.0f) + L);
                    this.l0.setTranslationX(this.Y.getX() + hl.L(28.0f) + L);
                    this.l0.setTranslationY(this.Y.getY() + hl.L(24.0f) + L);
                }
                float floor = (float) Math.floor(translationY);
                float N = hl.N(8.0f) + (this.Y.getScaleY() * this.Y.getHeight());
                if (this.G1) {
                    f8 = this.T1;
                } else {
                    f8 = D1;
                }
                float f18 = (N * f8) + floor;
                this.f2 = qd4.A(1.0f, this.T1, 0.0f, (hl.L(7.0f) * D1) + hl.L(1.3f) + f18);
                this.h2 = (((float) Math.floor(hl.p * 11.0f)) * D1) + f18 + hl.L(24.0f);
                if (this.G1) {
                    f9 = (this.k6 - hl.L(109.0f)) + hl.L(48.0f);
                } else {
                    f9 = -hl.N(46.0f);
                }
                gs8 gs8Var = this.F6;
                if (gs8Var != null) {
                    gs8Var.setAlpha((int) (255.0f * D1));
                }
                int measuredWidth2 = this.a.getMeasuredWidth();
                this.f.setScaleX(f7);
                this.f.setScaleY(f7);
                if (this.G1) {
                    f10 = hl.R1(j2(1), 1.0f, D1);
                } else {
                    f10 = 1.0f;
                }
                this.r.setScaleX(f10);
                this.r.setScaleY(f10);
                P2(0, D1, false);
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                float f19 = measuredWidth2 / f2;
                float min2 = f19 - (((Math.min(this.f.getExactWidth(), layoutParams5.width) * f7) * 0.5f) + layoutParams5.leftMargin);
                float f20 = ((FrameLayout.LayoutParams) this.r.getLayoutParams()).width;
                if (!this.v5 && this.r.getExactWidth() <= (f20 - this.r.getPaddingLeft()) - this.r.getPaddingRight()) {
                    f11 = this.r.getPaddingLeft();
                } else {
                    f11 = 0.0f;
                }
                float min3 = f19 - ((Math.min(this.r.getExactWidth(), f20) * 0.5f) + (layoutParams.leftMargin + f11));
                this.e2 = min2;
                this.g2 = min3;
                this.C6 = f11;
                if (this.G1) {
                    min2 = hl.R1(k2(f9, 0, this.f), min2, D1);
                    min3 = hl.R1(k2(f9, 1, this.r), min3, D1);
                }
                ValueAnimator valueAnimator5 = this.k2;
                if (valueAnimator5 == null || !valueAnimator5.isRunning()) {
                    this.f.setTranslationX(min2);
                    this.f.setTranslationY(this.f2);
                    this.r.setTranslationX(g2(min3, this.C6 * D1));
                    this.r.setTranslationY(h2(this.h2));
                }
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                int i12 = layoutParams6.width;
                if (hl.O1()) {
                    i4 = hl.L(490.0f);
                } else {
                    i4 = hl.q.x;
                }
                int min4 = Math.min(layoutParams6.width, (int) (((i4 - hl.L(f3)) / this.f.getScaleX()) - (this.f.getTranslationX() + layoutParams6.leftMargin)));
                layoutParams6.width = min4;
                if (min4 != i12) {
                    this.f.requestLayout();
                }
                K3();
            }
            ValueAnimator valueAnimator6 = this.k2;
            if (valueAnimator6 == null || !valueAnimator6.isRunning()) {
                P2(0, D1, true);
            }
        }
        Q3(currentActionBarHeight);
        if (D1 >= 1.0f) {
            this.f0.setAlpha(1.0f);
        }
    }

    public final void O3() {
        this.e0.setScaleX(this.f.getScaleX());
        this.e0.setScaleY(this.f.getScaleY());
        this.e0.b((this.f.getScaleX() * this.f.getRightDrawableX()) + this.f.getX(), (this.f.getHeight() - (this.f.getScaleY() * (this.f.getHeight() - this.f.getRightDrawableY()))) + this.f.getY());
    }

    public final void P2(int r11, float r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.P2(int, float, boolean):void");
    }

    public final void P3() {
        if (!this.q1 && xc2.c0(this.F2)) {
            ip7 notificationsController = getNotificationsController();
            notificationsController.getMessagesStorage().a.c(new ue2(notificationsController, -this.f1, new tp8(this, (byte) 0), (byte) 6));
        }
    }

    @Override
    public final void Q() {
        wia wiaVar;
        gr8 gr8Var = this.O;
        if (gr8Var != null && (wiaVar = this.R) != null) {
            gr8Var.setNewMediaCounts(wiaVar.c);
        }
        if (this.d != null) {
            Z3(false, false);
        }
        V();
        if (this.w2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void Q1(float f) {
        boolean z;
        ValueAnimator ofFloat;
        long j;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        this.fragmentView.invalidate();
        AnimatorSet animatorSet = this.q6;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.q6 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z) {
            ofFloat = ValueAnimator.ofFloat(0.0f, f);
            arrayList.add(ofFloat);
        } else {
            ofFloat = ValueAnimator.ofFloat(this.y0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new op8(this, (byte) 2));
        this.q6.playTogether(arrayList);
        AnimatorSet animatorSet2 = this.q6;
        if (z) {
            j = 150;
        } else {
            j = 220;
        }
        animatorSet2.setDuration(j);
        if (!z) {
            this.q6.addListener(new mq8(this, (byte) 6));
        }
        this.q6.start();
    }

    public final void Q3(float f) {
        xr8 xr8Var;
        ValueAnimator valueAnimator;
        if (this.q2 || ((xr8Var = this.N) != null && (valueAnimator = xr8Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.N.getLayoutParams();
            layoutParams.width = this.a.getMeasuredWidth();
            layoutParams.height = (int) (this.Q1 + f);
            this.N.requestLayout();
        }
        is8 is8Var = this.d1;
        if (is8Var != null) {
            is8Var.F.setTranslate(0.0f, this.b2 - is8Var.y);
            is8 is8Var2 = this.d1;
            RadialGradient radialGradient = is8Var2.E;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(is8Var2.F);
            }
            this.d1.invalidate();
        }
        O3();
        H3();
        a4();
    }

    public final void R1(int i, View view) {
        boolean z;
        fu5 I = fu5.I(this, view);
        I.X(this.a.W0(view, false));
        I.w = false;
        if (this.w2 != null) {
            z = true;
        } else {
            z = false;
        }
        I.k(2131232108, ob6.M0(2131751732, null), new y56(this, (byte) 4), z);
        I.b(2131232121, ob6.M0(2131751300, null), new y56(this, (byte) 5), false);
        I.b(2131232113, ob6.M0(2131746048, null), new oe7(this, i, (byte) 8), true);
        I.a0();
    }

    public final void R2(boolean z) {
        boolean z2;
        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.e1));
        if (X1 != null) {
            if (this.s2 && !uc7.K2(X1)) {
                if (this.k1 && !z) {
                    getMessagesController().t5(new y56(this, (byte) 25), this.e1);
                    finishFragment();
                    return;
                }
                TLRPC.Chat chat = this.F2;
                if (this.E2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jj.r(this, false, chat, X1, z2, true, false, true, new wp8(this, X1));
            } else if (this.k1) {
                getMessagesController().t5(null, this.e1);
                if (d31.a(this)) {
                    d31.d(this, false).j();
                }
            } else if (this.l1) {
                jj.g0(this, this.e1, X1, null, this.E2, false, null, new ze1(this, (byte) 5), this.A0);
            } else {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.A0, getParentActivity());
                String M0 = ob6.M0(2131753685, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = hl.S2(ob6.a0("AreYouSureBlockContact2", null, 2131754112, lv2.m(0, X1.first_name, X1.last_name)));
                alertDialog$Builder.j(ob6.M0(2131753686, null), new bp8(this, (byte) 9));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                showDialog(idVar);
                TextView textView = (TextView) idVar.c(-1);
                if (textView != null) {
                    yob.X(textView, aob.q7, this.A0);
                }
            }
        }
    }

    public final void R3() {
        float min = Math.min(this.d2, 0.25f) / 0.25f;
        boolean z = this.q1;
        ku8 ku8Var = this.u0;
        float f = 1.0f;
        if (z) {
            ku8Var.setAlpha(1.0f - min);
            this.u0.setBlurIntensity(0.0f);
            int i = 0;
            this.u0.setGooeyEnabled(false);
            ku8 ku8Var2 = this.u0;
            if (this.d2 >= 1.0f) {
                i = 8;
            }
            ku8Var2.setVisibility(i);
        } else {
            ku8Var.setHideProgress(this.d2);
        }
        lq8 lq8Var = this.v0;
        if (lq8Var != null && this.J1 != 2) {
            float f2 = this.d2;
            if (f2 > 0.0f) {
                f = hl.R1(1.0f, 0.0f, hl.x1(f2, 0.0f, 0.5f));
            }
            lq8Var.setAlpha(f);
        }
        T3();
    }

    public final boolean S1(final int i, View view) {
        TLRPC.User f;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        if (this.s1 && (f = getUserConfig().f()) != null) {
            final TLRPC.UserFull userFull = this.w2;
            if (userFull == null) {
                userFull = getMessagesController().Y1(f.id);
            }
            if (userFull != null) {
                String M0 = ob6.M0(2131751732, null);
                String M02 = ob6.M0(2131743847, null);
                if (i != this.L3 && i != this.K3 && i != this.X2) {
                    if (i == this.P3) {
                        str = vt7.j0(this.currentAccount, f, userFull.business_work_hours);
                        M0 = ob6.M0(2131746392, null);
                        M02 = ob6.M0(2131752742, null);
                    } else if (i == this.Q3) {
                        str = userFull.business_location.address;
                        M0 = ob6.M0(2131746387, null);
                        M02 = ob6.M0(2131752674, null);
                    } else if (i == this.M3) {
                        str = lbc.p(f);
                        if (str != null) {
                            str = "@".concat(str);
                        }
                        M0 = ob6.M0(2131746405, null);
                        M02 = ob6.M0(2131743320, null);
                    } else if (i == this.H3) {
                        str = f.phone;
                        M02 = ob6.M0(2131747022, null);
                    } else if (i == this.V2) {
                        str = UserInfoActivity.c0(this.w2.birthday);
                        M02 = ob6.M0(2131753709, null);
                    } else {
                        str = null;
                    }
                } else {
                    str = userFull.about;
                    if (i == this.X2) {
                        M02 = ob6.M0(2131753714, null);
                    }
                }
                fu5 I = fu5.I(this, view);
                I.X(this.a.W0(view, false));
                I.w = false;
                I.i = (byte) 3;
                if (i == this.Q3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        I.b(2131232425, ob6.M0(2131746383, null), new y56(this, (byte) 6), false);
                    }
                    I.b(2131232218, ob6.M0(2131746385, null), new y56(this, (byte) 8), false);
                }
                if (str != null) {
                    I.b(2131232108, M0, new sa8(this, str, M02, (byte) 6), false);
                }
                if (i == this.P3) {
                    I.b(2131232121, ob6.M0(2131746391, null), new y56(this, (byte) 9), false);
                    I.b(2131232113, ob6.M0(2131746390, null), new Runnable(this) {
                        public final ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b = r4;
                            final int i2 = i;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (b) {
                                case 0:
                                    RectF rectF = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = ob6.M0(2131752743, null);
                                    id idVar = alertDialog$Builder.a;
                                    idVar.S = M03;
                                    idVar.U = ob6.M0(2131752744, null);
                                    alertDialog$Builder.j(ob6.M0(2131746048, null), new fd() {
                                        @Override
                                        public final void w(id idVar2, int i3) {
                                            byte b2 = r4;
                                            int i4 = i2;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (b2) {
                                                case 0:
                                                    RectF rectF2 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new mp8(profileActivity2, (byte) 0));
                                                    profileActivity2.f4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().l2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new mp8(profileActivity2, (byte) 3));
                                                    profileActivity2.f4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().l2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                    profileActivity.showDialog(idVar);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = ob6.M0(2131752675, null);
                                    id idVar2 = alertDialog$Builder2.a;
                                    idVar2.S = M04;
                                    idVar2.U = ob6.M0(2131752676, null);
                                    alertDialog$Builder2.j(ob6.M0(2131746048, null), new fd() {
                                        @Override
                                        public final void w(id idVar22, int i3) {
                                            byte b2 = r4;
                                            int i4 = i2;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (b2) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new mp8(profileActivity2, (byte) 0));
                                                    profileActivity2.f4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().l2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new mp8(profileActivity2, (byte) 3));
                                                    profileActivity2.f4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().l2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                                    profileActivity.showDialog(idVar2);
                                    return;
                            }
                        }
                    }, true);
                } else if (i == this.Q3) {
                    I.b(2131232121, ob6.M0(2131746386, null), new y56(this, (byte) 10), false);
                    I.b(2131232113, ob6.M0(2131746384, null), new Runnable(this) {
                        public final ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b = r4;
                            final int i2 = i;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (b) {
                                case 0:
                                    RectF rectF = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = ob6.M0(2131752743, null);
                                    id idVar = alertDialog$Builder.a;
                                    idVar.S = M03;
                                    idVar.U = ob6.M0(2131752744, null);
                                    alertDialog$Builder.j(ob6.M0(2131746048, null), new fd() {
                                        @Override
                                        public final void w(id idVar22, int i3) {
                                            byte b2 = r4;
                                            int i4 = i2;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (b2) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new mp8(profileActivity2, (byte) 0));
                                                    profileActivity2.f4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().l2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new mp8(profileActivity2, (byte) 3));
                                                    profileActivity2.f4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().l2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                    profileActivity.showDialog(idVar);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = ob6.M0(2131752675, null);
                                    id idVar2 = alertDialog$Builder2.a;
                                    idVar2.S = M04;
                                    idVar2.U = ob6.M0(2131752676, null);
                                    alertDialog$Builder2.j(ob6.M0(2131746048, null), new fd() {
                                        @Override
                                        public final void w(id idVar22, int i3) {
                                            byte b2 = r4;
                                            int i4 = i2;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (b2) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new mp8(profileActivity2, (byte) 0));
                                                    profileActivity2.f4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().l2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new mp8(profileActivity2, (byte) 3));
                                                    profileActivity2.f4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().l2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                                    profileActivity.showDialog(idVar2);
                                    return;
                            }
                        }
                    }, true);
                } else if (i == this.M3) {
                    I.b(2131232121, ob6.M0(2131746347, null), new y56(this, (byte) 11), false);
                } else if (i != this.L3 && i != this.K3 && i != this.X2) {
                    if (i == this.H3) {
                        I.b(2131231898, ob6.M0(2131746373, null), new y56(this, (byte) 13), false);
                    } else if (i == this.V2) {
                        I.b(2131232121, ob6.M0(2131746452, null), new Runnable(this) {
                            public final ProfileActivity b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void run() {
                                byte b = r3;
                                final TLRPC.UserFull userFull2 = userFull;
                                final ProfileActivity profileActivity = this.b;
                                switch (b) {
                                    case 0:
                                        RectF rectF = ProfileActivity.Z6;
                                        profileActivity.showDialog((nx0) jj.l(profileActivity.getParentActivity(), ob6.M0(2131751203, null), ob6.M0(2131751208, null), userFull2.birthday, new v35(profileActivity, userFull2, (byte) 20), new y56(profileActivity, (byte) 14), false, false, profileActivity.A0).b);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.Z6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M03 = ob6.M0(2131753710, null);
                                        id idVar = alertDialog$Builder.a;
                                        idVar.S = M03;
                                        idVar.U = ob6.M0(2131753711, null);
                                        alertDialog$Builder.j(ob6.M0(2131746048, null), new fd() {
                                            @Override
                                            public final void w(id idVar2, int i2) {
                                                byte b2 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (b2) {
                                                    case 0:
                                                        RectF rectF3 = ProfileActivity.Z6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new mp8(profileActivity2, (byte) 1));
                                                        profileActivity2.Z3(false, false);
                                                        profileActivity2.getMessagesStorage().l2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.Z6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().j2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new mp8(profileActivity2, (byte) 2));
                                                        profileActivity2.Z3(false, false);
                                                        profileActivity2.getMessagesStorage().l2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                        profileActivity.showDialog(idVar);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.Z6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M04 = ob6.M0(2131746409, null);
                                        id idVar2 = alertDialog$Builder2.a;
                                        idVar2.S = M04;
                                        idVar2.U = ob6.M0(2131746410, null);
                                        alertDialog$Builder2.j(ob6.M0(2131746048, null), new fd() {
                                            @Override
                                            public final void w(id idVar22, int i2) {
                                                byte b2 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (b2) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.Z6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new mp8(profileActivity2, (byte) 1));
                                                        profileActivity2.Z3(false, false);
                                                        profileActivity2.getMessagesStorage().l2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.Z6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().j2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new mp8(profileActivity2, (byte) 2));
                                                        profileActivity2.Z3(false, false);
                                                        profileActivity2.getMessagesStorage().l2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                                        profileActivity.showDialog(idVar2);
                                        return;
                                }
                            }
                        }, false);
                        I.b(2131232113, ob6.M0(2131746048, null), new Runnable(this) {
                            public final ProfileActivity b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void run() {
                                byte b = r3;
                                final TLRPC.UserFull userFull2 = userFull;
                                final ProfileActivity profileActivity = this.b;
                                switch (b) {
                                    case 0:
                                        RectF rectF = ProfileActivity.Z6;
                                        profileActivity.showDialog((nx0) jj.l(profileActivity.getParentActivity(), ob6.M0(2131751203, null), ob6.M0(2131751208, null), userFull2.birthday, new v35(profileActivity, userFull2, (byte) 20), new y56(profileActivity, (byte) 14), false, false, profileActivity.A0).b);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.Z6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M03 = ob6.M0(2131753710, null);
                                        id idVar = alertDialog$Builder.a;
                                        idVar.S = M03;
                                        idVar.U = ob6.M0(2131753711, null);
                                        alertDialog$Builder.j(ob6.M0(2131746048, null), new fd() {
                                            @Override
                                            public final void w(id idVar22, int i2) {
                                                byte b2 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (b2) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.Z6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new mp8(profileActivity2, (byte) 1));
                                                        profileActivity2.Z3(false, false);
                                                        profileActivity2.getMessagesStorage().l2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.Z6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().j2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new mp8(profileActivity2, (byte) 2));
                                                        profileActivity2.Z3(false, false);
                                                        profileActivity2.getMessagesStorage().l2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                        profileActivity.showDialog(idVar);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.Z6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M04 = ob6.M0(2131746409, null);
                                        id idVar2 = alertDialog$Builder2.a;
                                        idVar2.S = M04;
                                        idVar2.U = ob6.M0(2131746410, null);
                                        alertDialog$Builder2.j(ob6.M0(2131746048, null), new fd() {
                                            @Override
                                            public final void w(id idVar22, int i2) {
                                                byte b2 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (b2) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.Z6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new mp8(profileActivity2, (byte) 1));
                                                        profileActivity2.Z3(false, false);
                                                        profileActivity2.getMessagesStorage().l2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.Z6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().j2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new mp8(profileActivity2, (byte) 2));
                                                        profileActivity2.Z3(false, false);
                                                        profileActivity2.getMessagesStorage().l2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                                        profileActivity.showDialog(idVar2);
                                        return;
                                }
                            }
                        }, true);
                    } else if (i == this.R2) {
                        TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(userFull.personal_channel_id));
                        if (M03 != null && xc2.K(M03, false) != null) {
                            I.b(2131232108, ob6.M0(2131746408, null), new ep8(this, M03, (byte) 2), false);
                        }
                        I.b(2131232121, ob6.M0(2131746411, null), new y56(this, (byte) 7), false);
                        I.b(2131232113, ob6.M0(2131746048, null), new Runnable(this) {
                            public final ProfileActivity b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void run() {
                                byte b = r3;
                                final TLRPC.UserFull userFull2 = userFull;
                                final ProfileActivity profileActivity = this.b;
                                switch (b) {
                                    case 0:
                                        RectF rectF = ProfileActivity.Z6;
                                        profileActivity.showDialog((nx0) jj.l(profileActivity.getParentActivity(), ob6.M0(2131751203, null), ob6.M0(2131751208, null), userFull2.birthday, new v35(profileActivity, userFull2, (byte) 20), new y56(profileActivity, (byte) 14), false, false, profileActivity.A0).b);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.Z6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M032 = ob6.M0(2131753710, null);
                                        id idVar = alertDialog$Builder.a;
                                        idVar.S = M032;
                                        idVar.U = ob6.M0(2131753711, null);
                                        alertDialog$Builder.j(ob6.M0(2131746048, null), new fd() {
                                            @Override
                                            public final void w(id idVar22, int i2) {
                                                byte b2 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (b2) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.Z6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new mp8(profileActivity2, (byte) 1));
                                                        profileActivity2.Z3(false, false);
                                                        profileActivity2.getMessagesStorage().l2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.Z6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().j2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new mp8(profileActivity2, (byte) 2));
                                                        profileActivity2.Z3(false, false);
                                                        profileActivity2.getMessagesStorage().l2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                        profileActivity.showDialog(idVar);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.Z6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M04 = ob6.M0(2131746409, null);
                                        id idVar2 = alertDialog$Builder2.a;
                                        idVar2.S = M04;
                                        idVar2.U = ob6.M0(2131746410, null);
                                        alertDialog$Builder2.j(ob6.M0(2131746048, null), new fd() {
                                            @Override
                                            public final void w(id idVar22, int i2) {
                                                byte b2 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (b2) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.Z6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new mp8(profileActivity2, (byte) 1));
                                                        profileActivity2.Z3(false, false);
                                                        profileActivity2.getMessagesStorage().l2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.Z6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().j2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new mp8(profileActivity2, (byte) 2));
                                                        profileActivity2.Z3(false, false);
                                                        profileActivity2.getMessagesStorage().l2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                                        profileActivity.showDialog(idVar2);
                                        return;
                                }
                            }
                        }, true);
                    }
                } else {
                    I.b(2131232121, ob6.M0(2131746404, null), new y56(this, (byte) 12), false);
                }
                if (I.y() > 0) {
                    I.a0();
                    return true;
                }
            }
        }
        return false;
    }

    public final void S2(boolean z) {
        boolean z2 = false;
        if (this.e1 != 0) {
            TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.e1));
            if (X1 != null) {
                TLRPC.UserFull userFull = this.w2;
                if (userFull != null && userFull.video_calls_available) {
                    z2 = true;
                }
                xkc.m(X1, z, z2, getParentActivity(), this.w2, getAccountInstance());
            }
        } else if (this.f1 != 0) {
            vc2 g1 = getMessagesController().g1(this.f1, false, null);
            TLRPC.Chat chat = this.F2;
            if (g1 == null) {
                k5 accountInstance = getAccountInstance();
                if (getParentActivity() != null) {
                    bw5.E0(getParentActivity(), -chat.id, accountInstance, new o48(chat, this, accountInstance, (byte) 20));
                    return;
                }
                return;
            }
            xkc.l(chat, null, false, null, getParentActivity(), this, getAccountInstance());
        }
    }

    public final void S3() {
        if (this.simpleActionBar != null) {
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            if (aVar != null && aVar.getVisibility() != 4) {
                this.actionBar.setVisibility(4);
            }
            float D1 = 1.0f - ((1.0f - D1()) * this.simpleActionBar.getActionModeFactor());
            tt ttVar = this.Z;
            if (ttVar != null && this.R1 != D1) {
                this.R1 = D1;
                ttVar.invalidate();
            }
        }
    }

    public final boolean T1() {
        f89 f89Var;
        View view;
        if ((this.J0 || (!hl.O1() && !this.o2)) && this.f0.getImageReceiver().E() && !hl.A1()) {
            this.G0 = true;
            this.p2 = true;
            int i = 0;
            while (true) {
                f89Var = null;
                if (i < this.a.getChildCount()) {
                    if (RecyclerView.S(this.a.getChildAt(i)) == 0) {
                        view = this.a.getChildAt(i);
                        break;
                    }
                    i++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                zp8 zp8Var = this.a;
                View G = zp8Var.G(view);
                if (G != null) {
                    f89Var = zp8Var.U(G);
                }
                if (f89Var != null) {
                    Integer num = (Integer) this.Z1.get(Integer.valueOf(f89Var.b()));
                    if (num != null) {
                        this.P1 = true;
                        this.a.y0(0, -(((this.a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), k43.h);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void T2() {
        TLRPC.UserFull userFull = this.w2;
        if (userFull != null && lbc.c(userFull)) {
            org.telegram.ui.ActionBar.e S = LaunchActivity.S();
            if (S != null) {
                c00.v(ob6.a0(null, null, 2131743397, wf3.s(a())), d31.b0(S), 2131624012, 36);
                return;
            }
            return;
        }
        if (this.F2 != null) {
            mg5.h.a();
        }
        showDialog(new yx4(getParentActivity(), this.currentAccount, a(), null, null));
    }

    public final void T3() {
        boolean z;
        boolean z2;
        boolean z3;
        float a;
        float f = 0.0f;
        if (!this.q1 && !this.G1) {
            int X1 = X1();
            if (X1 > 0) {
                a = ete.a(1.0f - (this.Q1 / X1), 0.0f, 1.0f);
            } else {
                a = ete.a((this.d2 - 0.6f) / 0.4f, 0.0f, 1.0f);
            }
            f = a;
        }
        float f2 = this.G5;
        if (f2 != f) {
            if (f2 > 0.5f) {
                z = true;
            } else {
                z = false;
            }
            if (f > 0.5f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.G5 = f;
            ns1 ns1Var = this.f;
            if (ns1Var != null) {
                ns1Var.setTextColor(this.J5);
            }
            kq8 kq8Var = this.r;
            if (kq8Var != null) {
                kq8Var.setTextColor(this.K5);
            }
            M3();
            if (z3) {
                jn7.e().k(jn7.u4, Boolean.TRUE);
            }
            is8 is8Var = this.d1;
            if (is8Var != null) {
                is8Var.invalidate();
            }
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        W3();
        V3();
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        hl.c3(new yh1(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, (byte) 5));
    }

    public final void U1() {
        TLRPC.Chat chat = this.F2;
        if (chat != null && chat.megagroup) {
            TLRPC.ChatFull chatFull = this.v2;
            if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants != null) {
                for (int i = 0; i < this.v2.participants.participants.size(); i++) {
                    TLRPC.ChatParticipant chatParticipant = this.v2.participants.participants.get(i);
                    this.C1.k(chatParticipant.user_id, chatParticipant);
                }
            }
        }
    }

    public final void U2(boolean z) {
        boolean[] zArr = {true};
        getMessagesController().k(this.F2.id, getUserConfig().f(), null, this, true, new yn6(this, z, zArr, (byte) 15), new ag(this, zArr, z, this.parentLayout.getLastFragment(), (byte) 5));
        jn7.e().k(jn7.L4, new Object[0]);
    }

    public final void U3() {
        gr8 gr8Var = this.O;
        if (gr8Var != null && this.b6 != 0) {
            int topPanelShift = gr8Var.getTopPanelShift();
            int i = 0;
            if (topPanelShift > 0 && this.O.isAttachedToWindow()) {
                if (this.O.getParent() == this.a) {
                    topPanelShift = Math.max(0, topPanelShift - Math.max(0, (int) this.O.getY()));
                }
                i = topPanelShift;
            }
            int i2 = this.b6 + i;
            u3(i2, this.H5);
            u3(i2, this.Z5);
        }
    }

    @Override
    public final void V() {
        int i;
        String str;
        int size;
        int i2;
        gr8 gr8Var = this.O;
        if (gr8Var != null && this.r != null) {
            int closestTab = gr8Var.getClosestTab();
            int[] iArr = this.R.c;
            int i3 = 0;
            if (closestTab == 0) {
                if (iArr[7] <= 0 && iArr[6] <= 0) {
                    int i4 = iArr[0];
                    if (i4 <= 0) {
                        x3(ob6.M0(2131745137, null));
                    } else {
                        x3(ob6.G(i4, "Media", new Object[0]));
                    }
                } else if (this.O.getPhotosVideosTypeFilter() != 1 && iArr[7] > 0) {
                    if (this.O.getPhotosVideosTypeFilter() != 2 && (i2 = iArr[6]) > 0) {
                        x3(ob6.G(i2, "Photos", new Object[0]) + ", " + ob6.G(iArr[7], "Videos", new Object[0]));
                        return;
                    }
                    x3(ob6.G(iArr[7], "Videos", new Object[0]));
                } else {
                    x3(ob6.G(iArr[6], "Photos", new Object[0]));
                }
            } else if (closestTab == 1) {
                int i5 = iArr[1];
                if (i5 <= 0) {
                    x3(ob6.M0(2131750791, null));
                } else {
                    x3(ob6.G(i5, "Files", new Object[0]));
                }
            } else if (closestTab == 2) {
                int i6 = iArr[2];
                if (i6 <= 0) {
                    x3(ob6.M0(2131743175, null));
                } else {
                    x3(ob6.G(i6, "Voice", new Object[0]));
                }
            } else if (closestTab == 3) {
                int i7 = iArr[3];
                if (i7 <= 0) {
                    x3(ob6.M0(2131745139, null));
                } else {
                    x3(ob6.G(i7, "Links", new Object[0]));
                }
            } else if (closestTab == 4) {
                int i8 = iArr[4];
                if (i8 <= 0) {
                    x3(ob6.M0(2131748073, null));
                } else {
                    x3(ob6.G(i8, "MusicFiles", new Object[0]));
                }
            } else if (closestTab == 5) {
                int i9 = iArr[5];
                if (i9 <= 0) {
                    x3(ob6.M0(2131754875, null));
                } else {
                    x3(ob6.G(i9, "GIFs", new Object[0]));
                }
            } else if (closestTab == 6) {
                x3(ob6.G(this.w2.common_chats_count, "CommonGroups", new Object[0]));
            } else if (closestTab == 7) {
                x3(this.r.getText());
            } else if (closestTab != 8 && !eja.t0(closestTab)) {
                if (closestTab == 13) {
                    x3(this.O.O(true));
                } else if (closestTab == 9) {
                    x3(ob6.G(this.O.W(closestTab), "ProfileStoriesArchiveCount", new Object[0]));
                } else if (closestTab == 10) {
                    wb7 L0 = uc7.s1(this.currentAccount).L0(a());
                    if (this.s2) {
                        str = "Bots";
                    } else {
                        str = "Channels";
                    }
                    if (L0 == null) {
                        size = 0;
                    } else {
                        size = L0.b.size() + L0.c;
                    }
                    x3(ob6.G(size, str, new Object[0]));
                } else if (closestTab == 12) {
                    nt9 F1 = getMessagesController().F1();
                    long a = a();
                    ArrayList arrayList = F1.j;
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            mt9 mt9Var = (mt9) arrayList.get(i10);
                            if (mt9Var.a == a) {
                                i = mt9Var.e;
                                break;
                            }
                            i10++;
                        } else {
                            i = 0;
                            break;
                        }
                    }
                    x3(ob6.G(Math.max(1, i), "SavedMessagesCount", new Object[0]));
                } else if (closestTab == 14) {
                    cga cgaVar = this.O.b0;
                    if (cgaVar != null) {
                        i3 = cgaVar.getGiftsCount();
                    }
                    x3(ob6.H(',', "ProfileGiftsCount", i3));
                } else if (closestTab == 15) {
                    int i11 = iArr[8];
                    if (i11 <= 0) {
                        x3(ob6.M0(2131745131, null));
                    } else {
                        x3(ob6.H(',', "ProfilePollsCount", i11));
                    }
                }
            } else {
                boolean z = this.s2;
                gr8 gr8Var2 = this.O;
                if (z) {
                    x3(gr8Var2.O(false));
                } else if (gr8Var2.W(closestTab) > 0) {
                    x3(ob6.G(this.O.W(closestTab), "ProfileStoriesCount", new Object[0]));
                } else {
                    x3(ob6.M0(2131746352, null));
                }
            }
        }
    }

    public final boolean V1() {
        wk5 wk5Var;
        if (this.J1 != 0 && (wk5Var = this.parentLayout) != null && wk5Var.getFragmentStack() != null && this.parentLayout.getFragmentStack().size() >= 2 && (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof zu1)) {
            finishFragment();
            return true;
        }
        return false;
    }

    public final void V2(android.view.View r17, float r18, float r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.V2(android.view.View, float, float, boolean):void");
    }

    public final void V3() {
        boolean z;
        float f;
        if (this.H5 != null && this.Z5 != null) {
            gr8 gr8Var = this.O;
            int i = 0;
            if (gr8Var != null && gr8Var.getParent() == this.a && this.O.isAttachedToWindow()) {
                z = true;
            } else {
                z = false;
            }
            float max = Math.max(Math.min(this.G5, this.R5), this.W5);
            View view = this.H5;
            if (z) {
                f = 0.0f;
            } else {
                f = max;
            }
            view.setAlpha(f);
            this.H5.setVisibility((z || max <= 0.0f) ? 8 : 8);
            View view2 = this.Z5;
            if (!z) {
                max = 0.0f;
            }
            view2.setAlpha(max);
            if (z) {
                this.Z5.setTranslationY(-(this.O.getY() + this.a.getY()));
            }
        }
    }

    public final void W1() {
        if (this.a == null) {
            return;
        }
        float v = bp1.v(((FrameLayout.LayoutParams) this.Y.getLayoutParams()).width, this.c2, 0.5f, this.a.getMeasuredWidth() / 2.0f);
        this.a2 = v;
        if (this.G1) {
            v = hl.R1(this.k6, v, this.T1);
            this.a2 = v;
        }
        this.Y.setTranslationX(v);
    }

    public final void W2() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.e1 != 0) {
                TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.e1));
                if (X1 != null) {
                    if (this.G2 != null && (userFull = this.w2) != null && !TextUtils.isEmpty(userFull.about)) {
                        str = String.format("%s https://" + getMessagesController().N2 + "/%s", this.w2.about, lbc.p(X1));
                    } else {
                        str = String.format("https://" + getMessagesController().N2 + "/%s", lbc.p(X1));
                    }
                } else {
                    return;
                }
            } else if (this.f1 != 0) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f1));
                if (M0 != null) {
                    TLRPC.ChatFull chatFull = this.v2;
                    if (chatFull != null && !TextUtils.isEmpty(chatFull.about)) {
                        str = String.format("%s\nhttps://" + getMessagesController().N2 + "/%s", this.v2.about, xc2.K(M0, false));
                    } else {
                        str = String.format("https://" + getMessagesController().N2 + "/%s", xc2.K(M0, false));
                    }
                } else {
                    return;
                }
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", str);
            startActivityForResult(Intent.createChooser(intent, ob6.M0(2131752963, null)), 500);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void W3() {
        if (this.simpleActionBar != null && this.M5 != null) {
            qs8 qs8Var = this.O5;
            if (qs8Var != null) {
                float f2 = f2();
                if (qs8Var.l != f2) {
                    qs8Var.l = f2;
                    qs8Var.a();
                }
            }
            int f = vm2.f(f2(), this.I5, aob.v0(aob.G6, this.A0));
            if (this.L5 != f) {
                this.L5 = f;
                jla jlaVar = this.simpleActionBar;
                jlaVar.s0 = true;
                jlaVar.m0 = f;
                jlaVar.updateColors();
            }
            int Q1 = this.N5.Q1();
            if (this.Q5 != Q1) {
                this.Q5 = Q1;
                this.simpleActionBar.M();
            }
        }
    }

    @Override
    public final boolean X() {
        return this.A1;
    }

    public final int X1() {
        int i = 0;
        if (this.e1 != 0 && this.r0 != null && !this.s1) {
            return 0;
        }
        return hl.L(74 + ((this.L4 || this.M4) ? 25 : 25));
    }

    public final void X2(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.M3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f1);
            bundle.putLong("user_id", this.e1);
            presentFragment(new rz8(bundle));
        } else if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.V2) {
            if (this.e1 == getUserConfig().e()) {
                presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
            } else if (lbc.c(this.w2)) {
                c00.v(ob6.a0(null, null, 2131743397, wf3.s(this.e1)), d31.b0(this), 2131624012, 36);
            } else {
                showDialog(new yx4(getParentActivity(), this.currentAccount, this.e1, null, null));
            }
        }
    }

    public final void X3(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        gr8 gr8Var;
        if (this.T0 != null) {
            boolean z8 = false;
            if (!this.X5 && ((gr8Var = this.O) == null || !gr8Var.o0())) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z9 = this.q2;
            sla slaVar = this.Q0;
            if (z2 && !z9 && this.M0) {
                z3 = true;
            } else {
                z3 = false;
            }
            v3(slaVar, z3, z);
            sla slaVar2 = this.R0;
            if (z2 && !z9 && this.N0) {
                z4 = true;
            } else {
                z4 = false;
            }
            v3(slaVar2, z4, z);
            sla slaVar3 = this.S0;
            if (z2 && this.O0) {
                z5 = true;
            } else {
                z5 = false;
            }
            v3(slaVar3, z5, z);
            gr8 gr8Var2 = this.O;
            if (gr8Var2 != null && gr8Var2.J != null && gr8Var2.f0(gr8Var2.getClosestTab()) && !this.O.o0()) {
                z6 = true;
            } else {
                z6 = false;
            }
            sla slaVar4 = this.T0;
            if (z && !z6) {
                z7 = true;
            } else {
                z7 = false;
            }
            v3(slaVar4, z2, z7);
            gr8 gr8Var3 = this.O;
            if (gr8Var3 != null) {
                boolean z10 = this.X5;
                if (z && !z6) {
                    z8 = true;
                }
                if (gr8Var3.q2 != z10) {
                    gr8Var3.q2 = z10;
                    gr8Var3.B(z, z8);
                }
            }
        }
    }

    public final int Y1(ImageReceiver imageReceiver) {
        if (imageReceiver.t() instanceof idc) {
            return ((idc) imageReceiver.t()).a.a();
        }
        return hl.p(this.f0.getImageReceiver().n());
    }

    public final void Y2() {
        boolean z;
        b29 b29Var;
        if (this.e1 != 0) {
            if (this.r0 != null) {
                TLRPC.User X1 = uc7.s1(this.currentAccount).X1(Long.valueOf(yac.h(this.currentAccount).e()));
                if (X1 == null) {
                    X1 = yac.h(this.currentAccount).f();
                }
                if (X1 != null) {
                    zn5 zn5Var = this.r0;
                    TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zn5Var.n(z, new y56(this, (byte) 24), new dl8(this, (byte) 2), 0);
                    this.V.H(0);
                    this.V.K(43);
                    this.W.H(0);
                    this.W.K(43);
                    ap8 ap8Var = this.a0;
                    if (ap8Var != null) {
                        xo8 i = ap8.i(14, ap8Var.a);
                        if (i != null && (b29Var = i.k) != null) {
                            b29Var.start();
                        }
                    } else {
                        this.s.d();
                    }
                    skb skbVar = this.N2;
                    if (skbVar != null) {
                        skbVar.getImageView().d();
                        return;
                    }
                    return;
                }
                return;
            }
            b3();
            return;
        }
        c3();
    }

    public final void Y3() {
        TLRPC.User X1;
        boolean z;
        int i;
        int i2;
        if (this.s1 && this.X0 != null && this.W0 != null && (X1 = getMessagesController().X1(Long.valueOf(this.e1))) != null) {
            int i3 = 0;
            if (lbc.p(X1) != null) {
                z = true;
            } else {
                z = false;
            }
            b8 b8Var = this.X0;
            if (z) {
                i = 2131231913;
            } else {
                i = 2131231914;
            }
            b8Var.setIcon(i);
            b8 b8Var2 = this.X0;
            if (z) {
                i2 = 2131746347;
            } else {
                i2 = 2131746346;
            }
            b8Var2.setText(ob6.M0(i2, null));
            b8 b8Var3 = this.W0;
            if (lbc.p(X1) == null) {
                i3 = 8;
            }
            b8Var3.setVisibility(i3);
        }
    }

    public final ul Z1(long j) {
        if (this.H == null) {
            ul ulVar = new ul(hl.L(17.0f), 2, this.f, false);
            this.H = ulVar;
            int L = hl.L(1.0f);
            ulVar.J = 0;
            ulVar.K = L;
            if (this.H0) {
                this.H.a();
            }
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        ul ulVar2 = this.H;
        if (i != 0) {
            ulVar2.j(j, false);
        } else {
            ulVar2.g(null, false);
        }
        M3();
        return this.H;
    }

    public final void Z2() {
        Bundle l = bs2.l("addToGroup", true);
        l.putLong("chatId", this.F2.id);
        rc5 rc5Var = new rc5(l);
        TLRPC.ChatFull chatFull = this.v2;
        rc5Var.J = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            zh6 zh6Var = new zh6();
            for (int i = 0; i < this.v2.participants.participants.size(); i++) {
                zh6Var.k(this.v2.participants.participants.get(i).user_id, null);
            }
            rc5Var.K = zh6Var;
        }
        rc5Var.y = new bp8(this, (byte) 8);
        presentFragment(rc5Var);
    }

    public final void Z3(boolean z, boolean z2) {
        if (this.d == null) {
            if (z) {
                c4(false);
            }
            f4();
        } else if (!z2 && this.a.isInLayout()) {
            zp8 zp8Var = this.a;
            if (!zp8Var.H) {
                return;
            }
            zp8Var.post(new q38((byte) 2, this, z));
        } else {
            jr8 jr8Var = new jr8(this);
            jr8Var.a = this.O2;
            jr8Var.e(jr8Var.b);
            ArrayList arrayList = jr8Var.d;
            arrayList.clear();
            ArrayList arrayList2 = jr8Var.e;
            arrayList2.clear();
            arrayList.addAll(this.U4);
            arrayList2.addAll(this.V4);
            jr8Var.f = this.x4;
            jr8Var.g = this.y4;
            if (z) {
                c4(false);
            }
            j3();
            f4();
            jr8Var.e(jr8Var.c);
            try {
                cy7.a(jr8Var, true).c(this.d);
            } catch (Exception e) {
                cc4.g(e, true);
                this.d.f();
            }
            int i = this.r6;
            if (i >= 0) {
                this.c.g1(i, this.s6 - this.a.getPaddingTop());
            }
            hl.V3(this.a);
        }
    }

    public final long a() {
        long j = this.i1;
        if (j != 0) {
            return j;
        }
        long j2 = this.e1;
        if (j2 != 0) {
            return j2;
        }
        return -this.f1;
    }

    public final void a2(boolean z) {
        zh6 zh6Var;
        final int i;
        if (!this.B1 && (zh6Var = this.C1) != null && this.v2 != null) {
            this.B1 = true;
            int i2 = 0;
            if (zh6Var.m() != 0 && z) {
                i = 300;
            } else {
                i = 0;
            }
            final TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = getMessagesController().h1(this.f1);
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            if (!z) {
                i2 = this.C1.m();
            }
            tL_channels_getParticipants.offset = i2;
            tL_channels_getParticipants.limit = 200;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    RectF rectF = ProfileActivity.Z6;
                    hl.d3(new fp8(ProfileActivity.this, tL_error, tLObject, tL_channels_getParticipants, (byte) 1), i);
                }
            }), this.classGuid);
        }
    }

    public final void a3(boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.a3(boolean):void");
    }

    public final void a4() {
        int i;
        if (this.c0 != null && this.r != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i = hl.m;
            } else {
                i = 0;
            }
            int i2 = currentActionBarHeight + i;
            boolean z = this.G1;
            if (z && this.J1 == 2 && this.Y != null) {
                this.c0.setAlpha(this.T1);
                this.c0.f(hl.L(74.0f) + this.a.getMeasuredWidth(), X1() - hl.L(74.0f));
                return;
            }
            if (z) {
                this.c0.setAlpha(this.T1);
            }
            float f = i2;
            float L = this.Q1 + f + hl.L(74.0f);
            float min = Math.min(X1(), L - f);
            this.c0.f(L - min, min - hl.L(74.0f));
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.m6));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.e7));
        hashSet.add(Integer.valueOf(aob.f7));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.K6));
        hashSet.add(Integer.valueOf(aob.J6));
        hashSet.add(Integer.valueOf(aob.yj));
        hashSet.add(Integer.valueOf(aob.xj));
        hashSet.add(Integer.valueOf(aob.wj));
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.li));
        hashSet.add(Integer.valueOf(aob.I6));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.h8));
        hashSet.add(Integer.valueOf(aob.si));
        hashSet.add(Integer.valueOf(aob.mi));
        hashSet.add(Integer.valueOf(aob.gd));
        hashSet.add(Integer.valueOf(aob.f8));
    }

    public final ul b2(TLRPC.EmojiStatus emojiStatus, boolean z) {
        if (this.G == null) {
            ul ulVar = new ul(hl.L(24.0f), 2, this.f, false);
            this.G = ulVar;
            if (this.H0) {
                ulVar.a();
            }
        }
        if (this.G.d()) {
            z = false;
        }
        this.F = null;
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((tL_emojiStatus.flags & 1) != 0 && tL_emojiStatus.until <= ((int) (System.currentTimeMillis() / 1000))) {
                this.G.g(i2(), z);
                this.G.m(false, z);
            } else {
                this.G.j(tL_emojiStatus.document_id, z);
                this.G.m(false, z);
            }
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) != 0 && tL_emojiStatusCollectible.until <= ((int) (System.currentTimeMillis() / 1000))) {
                this.G.g(i2(), z);
                this.G.m(false, z);
            } else {
                this.F = Long.valueOf(tL_emojiStatusCollectible.collectible_id);
                this.G.j(tL_emojiStatusCollectible.document_id, z);
                this.G.m(true, z);
            }
        } else {
            this.G.g(i2(), z);
            this.G.m(false, z);
        }
        M3();
        return this.G;
    }

    public final void b3() {
        TLRPC.User X1;
        if (this.e1 != 0 && !V1() && (X1 = getMessagesController().X1(Long.valueOf(this.e1))) != null && !(X1 instanceof TLRPC.TL_userEmpty)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.e1);
            if (getMessagesController().C(bundle, this, null, null)) {
                boolean z = this.arguments.getBoolean("removeFragmentOnChatOpen", true);
                if (!hl.O1() && z) {
                    jn7 notificationCenter = getNotificationCenter();
                    int i = jn7.s;
                    notificationCenter.n(this, i);
                    getNotificationCenter().k(i, new Object[0]);
                }
                int i2 = getArguments().getInt("nearby_distance", -1);
                if (i2 >= 0) {
                    bundle.putInt("nearby_distance", i2);
                }
                zu1 zu1Var = new zu1(bundle);
                ls6 mediaDataController = getMediaDataController();
                TLRPC.Document document = mediaDataController.z0;
                mediaDataController.o1();
                zu1Var.Y9 = document;
                zu1Var.Z9 = false;
                presentFragment(zu1Var, z);
                if (hl.O1() && !this.J0) {
                    finishFragment();
                }
            }
        }
    }

    public final void b4(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.b4(boolean):void");
    }

    public final int c2() {
        int i;
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null && aVar.getOccupyStatusBar()) {
            i = hl.m;
        } else {
            i = 0;
        }
        return org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i;
    }

    public final void c3() {
        TLRPC.ChatFull chatFull = this.v2;
        if (chatFull != null && chatFull.linked_chat_id != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.v2.linked_chat_id);
            if (getMessagesController().C(bundle, this, null, null)) {
                presentFragment(new zu1(bundle));
            }
        }
    }

    public final void c4(boolean z) {
        int i;
        TLRPC.UserStatus userStatus;
        boolean z2;
        int i2 = 0;
        this.C2 = 0;
        int currentTime = getConnectionsManager().getCurrentTime();
        this.D2.clear();
        TLRPC.ChatFull chatFull = this.v2;
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z2 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (z2 && chatFull.participants_count > 200) {
                this.C2 = chatFull.online_count;
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (i2 < this.v2.participants.participants.size()) {
            TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.v2.participants.participants.get(i2).user_id));
            if (X1 != null && (userStatus = X1.status) != null && ((userStatus.expires > currentTime || X1.id == getUserConfig().e()) && X1.status.expires > 10000)) {
                this.C2++;
            }
            this.D2.add(Integer.valueOf(i2));
            if (X1 != null) {
                if (X1.bot) {
                    i = -110;
                } else if (X1.self) {
                    i = 50000 + currentTime;
                } else {
                    TLRPC.UserStatus userStatus2 = X1.status;
                    if (userStatus2 != null) {
                        i = userStatus2.expires;
                    }
                }
                i2 = qd4.g(i, i2, 1, arrayList);
            }
            i = Integer.MIN_VALUE;
            i2 = qd4.g(i, i2, 1, arrayList);
        }
        try {
            Collections.sort(this.D2, Comparator$EL.reversed(Comparator$CC.comparingInt(new kn1(arrayList, (byte) 1))));
        } catch (Exception e) {
            cc4.g(e, true);
        }
        if (z && this.d != null && this.x4 > 0) {
            hl.V3(this.a);
        }
        if (this.O != null && this.N4 != -1) {
            if ((this.D2.size() > 5 || this.W4 == 2) && this.W4 != 1) {
                this.O.h1(this.D2, this.v2);
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        if (!this.O.u0()) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final void clearViews() {
        this.n6 = null;
        super.clearViews();
    }

    @Override
    public final org.telegram.ui.ActionBar.a createActionBar(android.content.Context r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.createActionBar(android.content.Context):org.telegram.ui.ActionBar.a");
    }

    @Override
    public final android.view.View createView(android.content.Context r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.createView(android.content.Context):android.view.View");
    }

    @Override
    public final d79 d() {
        return this.a;
    }

    public final int d2() {
        return X1() + e2();
    }

    public final void d3(boolean z) {
        TLRPC.TL_businessLocation tL_businessLocation;
        TLRPC.UserFull userFull = this.w2;
        if (userFull != null && (tL_businessLocation = userFull.business_location) != null) {
            if (tL_businessLocation.geo_point != null && !z) {
                yq8 yq8Var = new yq8(3, (byte) 0);
                yq8Var.setResourceProvider(this.A0);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = getMessagesController().y1(a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_businessLocation tL_businessLocation2 = this.w2.business_location;
                tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
                tL_messageMediaGeo.address = tL_businessLocation2.address;
                tL_message.media = tL_messageMediaGeo;
                yq8Var.V0 = false;
                yq8Var.G0(new r47(yac.t0, tL_message, false, false));
                presentFragment(yq8Var);
                return;
            }
            boolean z2 = f11.a;
            org.telegram.messenger.a.q();
            try {
                Locale locale = Locale.US;
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(locale, "http://maps.google.com/maps?q=" + this.w2.business_location.address, new Object[0]))));
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public final void d4() {
        CharSequence charSequence;
        kq8 kq8Var = this.r;
        if (kq8Var != null) {
            if ((!this.X5 || (charSequence = this.c6) == null) && (!this.A6 || (charSequence = this.z6) == null)) {
                charSequence = this.y6;
            }
            if (kq8Var.o(charSequence, !this.G1) && this.fragmentView != null) {
                O2(false);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        wr8 wr8Var;
        boolean z;
        wk5 wk5Var;
        Object[] objArr2;
        TLRPC.ChatFull chatFull;
        TLRPC.User X1;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        boolean z2;
        TLRPC.Chat chat;
        Object[] objArr3;
        zp8 zp8Var;
        zp8 zp8Var2;
        n69 n69Var;
        if (i != jn7.E5 && i != jn7.r3) {
            boolean z3 = true;
            int i3 = 0;
            r3 = false;
            boolean z4 = false;
            if (i == 2) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i4 = uc7.s5;
                if ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0 && (intValue & 524288) == 0) {
                    objArr3 = null;
                } else {
                    objArr3 = 1;
                }
                if (this.e1 != 0) {
                    if (objArr3 != null) {
                        e4(true);
                    }
                    if ((intValue & 1024) != 0 && (zp8Var2 = this.a) != null && (n69Var = (n69) zp8Var2.M(this.H3, false)) != null) {
                        this.d.t(n69Var, this.H3);
                    }
                } else if (this.f1 != 0) {
                    int i5 = intValue & 8192;
                    if (i5 != 0 || (intValue & 8) != 0 || (intValue & 16) != 0 || (intValue & 32) != 0 || (intValue & 4) != 0 || (524288 & intValue) != 0) {
                        if (i5 != 0) {
                            Z3(true, false);
                        } else {
                            c4(true);
                        }
                        e4(true);
                    }
                    if (objArr3 != null && (zp8Var = this.a) != null) {
                        int childCount = zp8Var.getChildCount();
                        for (int i6 = 0; i6 < childCount; i6++) {
                            View childAt = this.a.getChildAt(i6);
                            if (childAt instanceof vac) {
                                ((vac) childAt).i(intValue);
                            }
                        }
                    }
                }
            } else if (i == jn7.g1) {
                Long l = (Long) objArr[0];
                if (this.v2 != null && (chat = this.F2) != null && chat.id == l.longValue()) {
                    this.v2.online_count = ((Integer) objArr[1]).intValue();
                    c4(true);
                    e4(false);
                }
            } else if (i != jn7.N && i != jn7.b1) {
                if (i == jn7.a0) {
                    if (this.j1) {
                        hl.c3(new ep8(this, objArr, (byte) 6));
                    }
                } else if (i == jn7.Y) {
                    TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                    TLRPC.EncryptedChat encryptedChat2 = this.E2;
                    if (encryptedChat2 != null && encryptedChat.id == encryptedChat2.id) {
                        this.E2 = encryptedChat;
                        Z3(false, false);
                        c34 c34Var = this.Y1;
                        if (c34Var != null) {
                            c34Var.i();
                        }
                    }
                } else if (i == jn7.g0) {
                    boolean z5 = this.k1;
                    if (getMessagesController().x0.indexOfKey(this.e1) >= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.k1 = z2;
                    if (z5 != z2) {
                        L1(true);
                        Z3(false, false);
                    }
                } else if (i == jn7.w2) {
                    Long l2 = (Long) objArr[0];
                    if (this.F2 != null) {
                        long longValue = l2.longValue();
                        TLRPC.Chat chat2 = this.F2;
                        if (longValue == chat2.id && xc2.w(14, chat2)) {
                            TLRPC.ChatFull N0 = uc7.s1(this.currentAccount).N0(l2.longValue());
                            if (N0 != null) {
                                TLRPC.ChatFull chatFull4 = this.v2;
                                if (chatFull4 != null) {
                                    N0.participants = chatFull4.participants;
                                }
                                this.v2 = N0;
                            }
                            gr8 gr8Var = this.O;
                            if (gr8Var != null) {
                                gr8Var.setChatInfo(this.v2);
                            }
                            TLRPC.ChatFull chatFull5 = this.v2;
                            if (chatFull5 != null) {
                                TLRPC.InputGroupCall inputGroupCall = chatFull5.call;
                                boolean z6 = this.p1;
                                if (inputGroupCall != null ? z6 : !z6) {
                                    L1(false);
                                }
                            }
                            lq8 lq8Var = this.v0;
                            if (lq8Var != null && (chatFull3 = this.v2) != null) {
                                lq8Var.setStories(chatFull3.stories);
                            }
                            gu8 gu8Var = this.w0;
                            if (gu8Var != null) {
                                gu8Var.a();
                            }
                            iq8 iq8Var = this.f0;
                            if (iq8Var != null) {
                                iq8Var.setHasStories(N2());
                            }
                            if (l2.longValue() != 0) {
                                boolean z7 = f11.a;
                                z3 = (getMessagesController().N3() || (chatFull2 = this.v2) == null || !chatFull2.stargifts_available) ? false : false;
                                this.T0.Q(38, z3);
                                ap8 ap8Var = this.a0;
                                if (ap8Var != null) {
                                    ap8Var.o(3, z3);
                                }
                            }
                        }
                    }
                } else if (i == jn7.T) {
                    TLRPC.ChatFull chatFull6 = (TLRPC.ChatFull) objArr[0];
                    if (this.e1 != 0 && (X1 = getMessagesController().X1(Long.valueOf(this.e1))) != null && chatFull6.id == X1.linked_community_id) {
                        Z3(true, false);
                    }
                    TLRPC.Chat chat3 = this.F2;
                    if (chat3 != null && chatFull6.id == chat3.linked_community_id) {
                        Z3(true, false);
                    }
                    if (chatFull6.id == this.f1) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        TLRPC.ChatFull chatFull7 = this.v2;
                        if ((chatFull7 instanceof TLRPC.TL_channelFull) && chatFull6.participants == null) {
                            chatFull6.participants = chatFull7.participants;
                        }
                        if (chatFull7 == null && (chatFull6 instanceof TLRPC.TL_channelFull)) {
                            objArr2 = 1;
                        } else {
                            objArr2 = null;
                        }
                        this.v2 = chatFull6;
                        if (this.m1 == 0) {
                            long j = chatFull6.migrated_from_chat_id;
                            if (j != 0) {
                                this.m1 = -j;
                                getMediaDataController().f0(0, this.classGuid, this.m1, this.g1, true);
                            }
                        }
                        U1();
                        jq8 jq8Var = this.o0;
                        if (jq8Var != null && !this.q1) {
                            jq8Var.setChatInfo(this.v2);
                        }
                        Z3(true, false);
                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f1));
                        if (M0 != null) {
                            this.F2 = M0;
                            L1(true);
                        }
                        c34 c34Var2 = this.Y1;
                        if (c34Var2 != null) {
                            c34Var2.i();
                        }
                        if (this.F2.megagroup && (objArr2 != null || !booleanValue)) {
                            a2(true);
                        }
                        I3();
                        k4();
                        lq8 lq8Var2 = this.v0;
                        if (lq8Var2 != null && (chatFull = this.v2) != null) {
                            lq8Var2.setStories(chatFull.stories);
                        }
                        gu8 gu8Var2 = this.w0;
                        if (gu8Var2 != null) {
                            gu8Var2.a();
                        }
                        iq8 iq8Var2 = this.f0;
                        if (iq8Var2 != null) {
                            iq8Var2.setHasStories(N2());
                        }
                        gr8 gr8Var2 = this.O;
                        if (gr8Var2 != null) {
                            gr8Var2.setChatInfo(this.v2);
                        }
                    }
                } else if (i == jn7.s) {
                    removeSelfFromStack(true);
                } else if (i == jn7.u) {
                    long longValue2 = ((Long) objArr[0]).longValue();
                    boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                    if (longValue2 == a() && (wk5Var = this.parentLayout) != null && wk5Var.getFragmentStack().contains(this)) {
                        if (booleanValue2 || this.parentLayout.getLastFragment() != this) {
                            if (this.parentLayout.getLastFragment() == this) {
                                finishFragment();
                            } else {
                                removeSelfFromStack(true);
                            }
                        }
                    }
                } else if (i == jn7.D0) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) objArr[0];
                    if (botInfo.user_id == this.e1) {
                        this.G2 = botInfo;
                        Z3(false, false);
                    }
                } else if (i == jn7.E0) {
                    if (((Long) objArr[0]).longValue() == this.e1) {
                        TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                        this.w2 = userFull;
                        jva jvaVar = this.T;
                        if (jvaVar != null) {
                            jvaVar.set(userFull.stars_rating);
                        }
                        lq8 lq8Var3 = this.v0;
                        if (lq8Var3 != null) {
                            lq8Var3.setStories(this.w2.stories);
                        }
                        gu8 gu8Var3 = this.w0;
                        if (gu8Var3 != null) {
                            gu8Var3.a();
                        }
                        iq8 iq8Var3 = this.f0;
                        if (iq8Var3 != null) {
                            iq8Var3.setHasStories(N2());
                        }
                        gr8 gr8Var3 = this.O;
                        if (gr8Var3 != null) {
                            gr8Var3.setUserInfo(this.w2);
                        }
                        if (this.r0 != null) {
                            if (this.d != null && !TextUtils.equals(this.w2.about, this.A2)) {
                                this.d.g(this.X2);
                            }
                            if (this.s1) {
                                Z3(false, false);
                            }
                        } else {
                            if (!this.G1 && !this.L0) {
                                L1(true);
                            } else {
                                this.I1 = true;
                            }
                            Z3(false, false);
                            gr8 gr8Var4 = this.O;
                            if (gr8Var4 != null) {
                                gr8Var4.setCommonGroupsCount(this.w2.common_chats_count);
                                V();
                                wia wiaVar = this.R;
                                if (wiaVar == null || wiaVar.E) {
                                    resumeDelayedFragmentAnimation();
                                    O2(true);
                                }
                            }
                        }
                        I3();
                        k4();
                        if (this.x2 == null && !s2()) {
                            ts8 ts8Var = new ts8(this.currentAccount);
                            this.x2 = ts8Var;
                            y56 y56Var = new y56(this, (byte) 17);
                            if (ts8Var.c) {
                                y56Var.run();
                            } else {
                                ts8Var.h.add(y56Var);
                            }
                            this.x2.b(this.w2);
                        }
                        if (!s2()) {
                            ks8 ks8Var = this.z2;
                            ks8 c = ks8.c(this.currentAccount, this.w2, ks8Var);
                            this.z2 = c;
                            if (c != ks8Var) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.y2 = z;
                            if (c != null) {
                                y56 y56Var2 = new y56(this, (byte) 18);
                                if (c.b) {
                                    y56Var2.run();
                                } else {
                                    c.h.add(y56Var2);
                                }
                            }
                        }
                        if (this.T0 != null) {
                            boolean o2 = o2();
                            sla slaVar = this.T0;
                            if (o2) {
                                slaVar.S(44);
                            } else {
                                slaVar.u(44);
                            }
                            TLRPC.UserFull userFull2 = this.w2;
                            if (!userFull2.noforwards_my_enabled && !userFull2.noforwards_peer_enabled) {
                                z4 = true;
                            }
                            this.T0.Q(46, z4);
                            this.T0.Q(47, !z4);
                        }
                    }
                } else if (i != jn7.k0) {
                    if (i == 1) {
                        if (!((Boolean) objArr[2]).booleanValue() && a() == ((Long) objArr[0]).longValue()) {
                            ArrayList arrayList = (ArrayList) objArr[1];
                            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                r47 r47Var = (r47) arrayList.get(i7);
                                if (this.E2 != null) {
                                    TLRPC.MessageAction messageAction = r47Var.k.action;
                                    if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (wr8Var = this.d) != null) {
                                        wr8Var.f();
                                    }
                                }
                            }
                        }
                    } else if (i == jn7.l4) {
                        zp8 zp8Var3 = this.a;
                        if (zp8Var3 != null) {
                            zp8Var3.i1();
                        }
                    } else if (i == jn7.A4) {
                        Z3(false, false);
                    } else if (i == jn7.s1) {
                        int i8 = this.d3;
                        int i9 = this.b3;
                        int i10 = this.Z2;
                        f4();
                        wr8 wr8Var2 = this.d;
                        if (wr8Var2 != null) {
                            if (i8 != this.d3 || i9 != this.b3 || i10 != this.Z2) {
                                wr8Var2.f();
                            }
                        }
                    } else if (i == jn7.t5) {
                        if (this.q1) {
                            e4(false);
                        }
                    } else if (i == jn7.D1) {
                        fs8 fs8Var = this.e;
                        if (fs8Var != null) {
                            fs8Var.c = fs8.H(this);
                            this.e.w.clear();
                            this.e.J();
                            fs8 fs8Var2 = this.e;
                            fs8Var2.I(fs8Var2.E);
                        }
                    } else if (i == jn7.c0) {
                        e4(false);
                    } else if (i != jn7.y5 && i != jn7.I5) {
                        if (i == jn7.k3) {
                            sla slaVar2 = this.T0;
                            if (slaVar2 != null) {
                                TL_account.RequirementToContact P2 = getMessagesController().P2(this.e1);
                                if (P2 != null && !(P2 instanceof TL_account.requirementToContactEmpty)) {
                                    z3 = false;
                                }
                                slaVar2.Q(20, z3);
                            }
                            L3();
                        } else if (i == jn7.i5) {
                            L3();
                        } else if (i == jn7.A3) {
                            Z3(false, false);
                        } else if (i == jn7.E3) {
                            Z3(false, false);
                        } else if (i == jn7.F3) {
                            Z3(false, false);
                        } else if (i == jn7.y1) {
                            if (a() == ((Long) objArr[0]).longValue()) {
                                wk5 wk5Var2 = this.parentLayout;
                                if (wk5Var2 != null && wk5Var2.getLastFragment() == this) {
                                    finishFragment();
                                } else {
                                    removeSelfFromStack();
                                }
                            }
                        } else if (i == jn7.h3) {
                            long longValue3 = ((Long) objArr[0]).longValue();
                            if (this.N4 < 0 && longValue3 == a()) {
                                f4();
                                V();
                                wr8 wr8Var3 = this.d;
                                if (wr8Var3 != null) {
                                    wr8Var3.f();
                                }
                            }
                        } else if (i == jn7.I3) {
                            if (((Long) objArr[0]).longValue() == a() && !s2()) {
                                if (this.N4 < 0) {
                                    f4();
                                    V();
                                    wr8 wr8Var4 = this.d;
                                    if (wr8Var4 != null) {
                                        wr8Var4.f();
                                    }
                                    hl.c3(new y56(this, (byte) 19));
                                    return;
                                }
                                gr8 gr8Var5 = this.O;
                                if (gr8Var5 != null) {
                                    gr8Var5.N1(true);
                                }
                            }
                        } else if (i == jn7.Y3) {
                            if (((Long) objArr[0]).longValue() == a() && this.e1 > 0) {
                                TLRPC.UserFull Y1 = getMessagesController().Y1(this.e1);
                                if (Y1 != null) {
                                    this.w2 = Y1;
                                }
                                f4();
                                V();
                                zp8 zp8Var4 = this.a;
                                if (zp8Var4 != null && zp8Var4.e0()) {
                                    this.a.post(new y56(this, (byte) 20));
                                    return;
                                }
                                wr8 wr8Var5 = this.d;
                                if (wr8Var5 != null) {
                                    wr8Var5.f();
                                }
                            }
                        } else if (i == jn7.Z3) {
                            long longValue4 = ((Long) objArr[0]).longValue();
                            long longValue5 = ((Long) objArr[1]).longValue();
                            TLRPC.Chat chat4 = this.F2;
                            if (chat4 != null && chat4.id == longValue4) {
                                String str = (String) objArr[2];
                                zh6 zh6Var = this.C1;
                                if (zh6Var != null && (chatParticipant = (TLRPC.ChatParticipant) zh6Var.f(longValue5)) != null) {
                                    chatParticipant.setRank(longValue5, str);
                                }
                                TLRPC.ChannelParticipant channelParticipant = this.H2;
                                if (channelParticipant != null && channelParticipant.user_id == longValue5) {
                                    channelParticipant.rank = str;
                                }
                                while (true) {
                                    ArrayList arrayList2 = this.U4;
                                    if (i3 < arrayList2.size()) {
                                        ((TLRPC.ChatParticipant) arrayList2.get(i3)).setRank(longValue5, str);
                                        i3++;
                                    } else {
                                        hl.V3(this.a);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        iq8 iq8Var4 = this.f0;
                        if (iq8Var4 != null) {
                            iq8Var4.setHasStories(N2());
                            this.f0.setRoundRadiusForExpand((int) hl.R1(m2(), 0.0f, this.l2));
                        }
                        lq8 lq8Var4 = this.v0;
                        if (lq8Var4 != null) {
                            TLRPC.UserFull userFull3 = this.w2;
                            if (userFull3 != null) {
                                lq8Var4.setStories(userFull3.stories);
                                return;
                            }
                            TLRPC.ChatFull chatFull8 = this.v2;
                            if (chatFull8 != null) {
                                lq8Var4.setStories(chatFull8.stories);
                            }
                        }
                    }
                }
            } else {
                L1(true);
            }
        } else if (xc2.R(uc7.s1(this.currentAccount).M0(Long.valueOf(this.f1)))) {
            getMessagesController().O1().j(a(), new bm0((byte) 22), false, this.A0);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        zn5 zn5Var = this.r0;
        if (zn5Var != null && zn5Var.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        zn5 zn5Var = this.r0;
        if ((zn5Var == null || dialog != zn5Var.c) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final TLRPC.Chat e() {
        return this.F2;
    }

    public final int e2() {
        if (X1() == 0) {
            return hl.L(168.0f);
        }
        return hl.L(152.0f);
    }

    public final void e3(int i, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z) {
        boolean[] zArr = new boolean[1];
        sq8 sq8Var = new sq8(this, user.id, this.f1, tL_chatAdminRights, this.F2.default_banned_rights, tL_chatBannedRights, str, i, zArr, user);
        sq8Var.Y0 = new tq8(this, i, chatParticipant, z, zArr);
        presentFragment(sq8Var);
    }

    public final void e4(boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.e4(boolean):void");
    }

    @Override
    public final boolean f() {
        return true;
    }

    public final float f2() {
        return Math.max(this.G5, this.W5);
    }

    public final void f3(String str, q1 q1Var) {
        if (str.startsWith("@")) {
            getMessagesController().H3(str.substring(1), this, 0, q1Var);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/") && this.parentLayout.getFragmentStack().size() > 1) {
                org.telegram.ui.ActionBar.e eVar = (org.telegram.ui.ActionBar.e) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if (eVar instanceof zu1) {
                    finishFragment();
                    ((zu1) eVar).a0.L1(null, str, false, false);
                }
            }
        } else {
            uj3 uj3Var = new uj3(null);
            uj3Var.p2 = str;
            presentFragment(uj3Var);
        }
    }

    public final void f4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.f4():void");
    }

    @Override
    public final boolean g(TLRPC.ChatParticipant chatParticipant, boolean z, boolean z2, View view) {
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        TLRPC.Chat chat;
        boolean z12;
        TLRPC.ChannelParticipant channelParticipant;
        boolean z13;
        boolean z14;
        Drawable drawable;
        int i;
        int i2;
        int i3;
        if (getParentActivity() != null) {
            if (z) {
                TLRPC.User X1 = getMessagesController().X1(Long.valueOf(chatParticipant.user_id));
                if (X1 != null) {
                    long j = chatParticipant.user_id;
                    this.B2 = j;
                    if (j == getUserConfig().e()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (xc2.T(this.F2)) {
                        channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        str = channelParticipant.rank;
                        z8 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                        if (!z8 && !(channelParticipant instanceof TLRPC.TL_channelParticipantAdmin)) {
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                        z4 = z3;
                        getMessagesController().X1(Long.valueOf(chatParticipant.user_id));
                        z10 = xc2.w(4, this.F2);
                        if (xc2.w(25, this.F2) && (!z7 || ((!z8 && channelParticipant.can_edit) || z4))) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z8 || ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant.can_edit)) {
                            z10 = false;
                            z11 = false;
                        }
                        if ((z4 || (channelParticipant instanceof TLRPC.TL_channelParticipantSelf)) && xc2.h(this.F2)) {
                            z11 = true;
                        }
                        if (xc2.w(2, this.F2) && ((!(channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !z8) || channelParticipant.can_edit)) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        chat = this.F2;
                        z5 = true;
                        if (chat.gigagroup) {
                            z12 = false;
                        } else {
                            z12 = z9;
                        }
                        z6 = channelParticipant instanceof TLRPC.TL_channelParticipantAdmin;
                    } else {
                        z4 = z3;
                        z5 = true;
                        str = chatParticipant.rank;
                        z6 = chatParticipant instanceof TLRPC.TL_chatParticipantAdmin;
                        if (!z6 && !(chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                        z8 = chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                        TLRPC.Chat chat2 = this.F2;
                        if (!chat2.creator && (!(chatParticipant instanceof TLRPC.TL_chatParticipant) || (!xc2.w(2, chat2) && chatParticipant.inviter_id != getUserConfig().e()))) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        TLRPC.Chat chat3 = this.F2;
                        z10 = chat3.creator;
                        if ((xc2.w(25, chat3) && (!z7 || ((!z8 && chatParticipant.inviter_id == getUserConfig().e()) || z4))) || (z4 && xc2.h(this.F2))) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        chat = this.F2;
                        z12 = chat.creator;
                        channelParticipant = null;
                    }
                    if (z4) {
                        if (!xc2.h(chat) && (!z7 || !xc2.w(25, this.F2))) {
                            z10 = false;
                            z12 = false;
                            z13 = false;
                        } else {
                            z10 = false;
                            z12 = false;
                            z13 = false;
                            z11 = z5;
                        }
                    } else {
                        z13 = z9;
                    }
                    if (!z10 && !z11 && !z12 && !z13) {
                        z14 = false;
                    } else {
                        z14 = z5;
                    }
                    if (!z2 && z14) {
                        TLRPC.ChannelParticipant channelParticipant2 = channelParticipant;
                        boolean z15 = z6;
                        cp8 cp8Var = new cp8(this, channelParticipant2, X1, chatParticipant, z15, str);
                        String str2 = str;
                        if (view.getParent() instanceof d79) {
                            drawable = ((d79) view.getParent()).W0(view, false);
                        } else {
                            drawable = null;
                        }
                        fu5 I = fu5.I(this, view);
                        I.X(drawable);
                        I.w = false;
                        I.k(2131232118, ob6.M0(2131745329, null), new dp8(this, X1, (byte) 0), !z4);
                        if (!z4 && (z10 || z11 || z12 || z13)) {
                            I.j();
                        }
                        if (!z7 && TextUtils.isEmpty(str2)) {
                            i = 2131231904;
                        } else {
                            i = 2131231902;
                        }
                        int i4 = i;
                        if (z7) {
                            i2 = 2131751267;
                        } else if (TextUtils.isEmpty(str2)) {
                            i2 = 2131754393;
                        } else {
                            i2 = 2131751240;
                        }
                        I.k(i4, ob6.M0(i2, null), new my6(this, X1, str2, z7, z8), z11);
                        if (z15) {
                            i3 = 2131751269;
                        } else {
                            i3 = 2131745275;
                        }
                        I.k(2131232054, ob6.M0(i3, null), new uk8(cp8Var, (byte) 5), z10);
                        I.k(2131232281, ob6.M0(2131752521, null), new cp7(this, channelParticipant2, chatParticipant, X1, cp8Var, (byte) 10), z12);
                        I.l(2131232333, new ep8(this, chatParticipant, (byte) 0), ob6.M0(2131748809, null), z13, true);
                        I.Y = 190;
                        I.a0();
                        return z5;
                    }
                    return z14;
                }
            } else if (chatParticipant.user_id == getUserConfig().e()) {
                return false;
            } else {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", chatParticipant.user_id);
                bundle.putBoolean("preload_messages", true);
                presentFragment(new ProfileActivity(bundle, null));
                return true;
            }
        }
        return false;
    }

    public final float g2(float f, float f2) {
        float f3;
        float f4;
        this.B6 = f;
        this.D6 = f2;
        byte b = this.J1;
        if (b == 2) {
            f3 = 1.0f;
        } else if (this.T1 < 1.0f && b != 0) {
            f3 = 0.0f;
        } else {
            f3 = this.l2;
        }
        float l = Utilities.l(f3);
        jva jvaVar = this.T;
        if (jvaVar != null) {
            f4 = jvaVar.getVisibilityFactor();
        } else {
            f4 = 0.0f;
        }
        return Math.max(0.0f, (l2() + this.u5) * l) + qd4.A(1.0f, l, f2 * f4, f);
    }

    public final boolean g3(float r23, float r24, int r25, android.view.View r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.g3(float, float, int, android.view.View):boolean");
    }

    public final void g4(boolean z) {
        int i;
        int i2;
        float f;
        int i3 = 0;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        this.a.setVisibility(i);
        d79 d79Var = this.b;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        d79Var.setVisibility(i2);
        FrameLayout searchContainer = this.U0.getSearchContainer();
        if (!z) {
            i3 = 8;
        }
        searchContainer.setVisibility(i3);
        gu8 gu8Var = this.w0;
        if (gu8Var != null) {
            gu8Var.setActive(!z);
        }
        this.actionBar.C(z);
        this.Y.setVisibility(i);
        lq8 lq8Var = this.v0;
        if (lq8Var != null) {
            lq8Var.setVisibility(i);
        }
        this.f.setVisibility(i);
        this.r.setVisibility(i);
        sla slaVar = this.T0;
        if (slaVar != null) {
            slaVar.setAlpha(1.0f);
            this.T0.setVisibility(i);
        }
        this.U0.setVisibility(i);
        this.f0.setAlpha(1.0f);
        this.Y.setAlpha(1.0f);
        lq8 lq8Var2 = this.v0;
        if (lq8Var2 != null) {
            lq8Var2.setAlpha(1.0f);
        }
        gu8 gu8Var2 = this.w0;
        if (gu8Var2 != null) {
            gu8Var2.setAlpha(1.0f);
        }
        this.f.setAlpha(1.0f);
        kq8 kq8Var = this.r;
        if (this.X5) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        kq8Var.setAlpha(f);
        this.U0.setAlpha(1.0f);
        this.a.setAlpha(1.0f);
        this.b.setAlpha(1.0f);
        this.P.setAlpha(1.0f);
        if (z) {
            this.b.setEmptyView(this.P);
        } else {
            this.P.setVisibility(8);
        }
    }

    public float getAvatarAnimationProgress() {
        return this.T1;
    }

    @Override
    public final fd8 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final vnb getResourceProvider() {
        return this.A0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.A0 != null) {
            return null;
        }
        u00 u00Var = new u00(this, (byte) 15);
        ArrayList arrayList = new ArrayList();
        gr8 gr8Var = this.O;
        if (gr8Var != null) {
            arrayList.addAll(gr8Var.getThemeDescriptions());
        }
        arrayList.add(new apb(this.d1, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.a7));
        arrayList.add(new apb(this.f0, 0, (Class[]) null, (Paint) null, new Drawable[]{this.q0}, (zob) null, aob.d8));
        arrayList.add(new apb(this.s, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.ni));
        arrayList.add(new apb(this.s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.oi));
        arrayList.add(new apb(this.s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.pi));
        arrayList.add(new apb(this.a, 262144, new Class[]{skb.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.x6));
        arrayList.add(new apb(this.a, 262144, new Class[]{skb.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.p7));
        arrayList.add(new apb(this.a, 262144, new Class[]{skb.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.o6));
        arrayList.add(new apb(this.a, 262144, new Class[]{skb.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.u6));
        arrayList.add(new apb(this.a, 262144, new Class[]{skb.class}, new String[]{"imageView"}, (Drawable[]) null, (zob) null, aob.v6));
        arrayList.add(new apb(this.a, 0, new Class[]{hca.class}, new String[]{"detailTextView"}, (Drawable[]) null, (zob) null, aob.z6));
        int i = aob.Ji;
        arrayList.add(new apb(this.a, 0, new Class[]{hca.class}, new String[]{"yesButton"}, (Drawable[]) null, (zob) null, i));
        int i2 = aob.Fi;
        arrayList.add(new apb(this.a, 131072, new Class[]{hca.class}, new String[]{"yesButton"}, (Drawable[]) null, (zob) null, i2));
        int i3 = aob.Hi;
        arrayList.add(new apb(this.a, 196608, new Class[]{hca.class}, new String[]{"yesButton"}, (Drawable[]) null, (zob) null, i3));
        arrayList.add(new apb(this.a, 0, new Class[]{hca.class}, new String[]{"noButton"}, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.a, 131072, new Class[]{hca.class}, new String[]{"noButton"}, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.a, 196608, new Class[]{hca.class}, new String[]{"noButton"}, (Drawable[]) null, (zob) null, i3));
        arrayList.add(new apb(this.a, 0, new Class[]{uo7.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.M6));
        arrayList.add(new apb(this.a, 0, new Class[]{uo7.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.N6));
        arrayList.add(new apb(this.a, 0, new Class[]{vac.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, u00Var, aob.n6));
        boolean z = this.X5;
        ns1 ns1Var = this.f;
        Drawable drawable = this.I;
        if (z) {
            arrayList.add(new apb(ns1Var, 0, (Class[]) null, (Paint) null, new Drawable[]{drawable}, (zob) null, aob.Fj));
            arrayList.add(new apb(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.y}, (zob) null, aob.d6));
            return arrayList;
        }
        arrayList.add(new apb(ns1Var, 0, (Class[]) null, (Paint) null, new Drawable[]{drawable}, (zob) null, aob.ri));
        arrayList.add(new apb(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.y}, (zob) null, aob.qi));
        return arrayList;
    }

    @Override
    public final int getThemedColor(int i) {
        return aob.v0(i, this.A0);
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable;
        vnb vnbVar = this.A0;
        if (vnbVar != null) {
            drawable = vnbVar.getDrawable(str);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return super.getThemedDrawable(str);
    }

    public final float h2(float f) {
        float f2;
        this.E6 = f;
        byte b = this.J1;
        float f3 = 0.0f;
        if (b == 2) {
            f2 = 1.0f;
        } else if (this.T1 < 1.0f && b != 0) {
            f2 = 0.0f;
        } else {
            f2 = this.l2;
        }
        float l = Utilities.l(f2);
        if (this.T != null) {
            f3 = this.T.getVisibilityFactor() * hl.L(3.0f);
        }
        return qd4.A(1.0f, l, f3, f);
    }

    public final void h3() {
        int i;
        ValueAnimator valueAnimator;
        if (this.q2 && (valueAnimator = this.k2) != null && valueAnimator.isRunning()) {
            this.f2 = this.g6;
            this.h2 = this.h6;
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
        if (this.actionBar.getOccupyStatusBar()) {
            i = hl.m;
        } else {
            i = 0;
        }
        i3(D1(), currentActionBarHeight + i);
    }

    public final void h4() {
        ImageView imageView;
        TLRPC.Chat chat;
        if (this.k0 != null && (imageView = this.l0) != null) {
            if (this.L1 && (chat = this.F2) != null && (chat.flags2 & 2048) != 0) {
                imageView.setTag(1);
                this.l0.setVisibility(0);
                this.k0.setTag(1);
                this.k0.setVisibility(0);
                return;
            }
            imageView.setTag(null);
            this.l0.setVisibility(8);
            this.k0.setTag(null);
            this.k0.setVisibility(8);
        }
    }

    public final e43 i2() {
        e43 e43Var = this.K;
        if (e43Var == null) {
            Drawable mutate = getParentActivity().getDrawable(2131232312).mutate();
            this.E = mutate;
            mutate.setColorFilter(aob.v0(aob.qi, this.A0), PorterDuff.Mode.MULTIPLY);
            e43 e43Var2 = new e43(this.E, getParentActivity().getDrawable(2131232315).mutate());
            this.K = e43Var2;
            return e43Var2;
        }
        return e43Var;
    }

    public final void i3(float f, float f2) {
        float R1;
        int i;
        float max = Math.max(0.0f, Math.min(1.0f, (this.Q1 - d2()) / ((this.a.getMeasuredWidth() - f2) - e2())));
        if (this.Q1 < d2() && max < 0.33f) {
            R1 = c00.z(f, 72.0f, 24.0f, 42.0f);
        } else {
            R1 = hl.R1(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f));
        }
        if (this.actionBar.getOccupyStatusBar()) {
            i = hl.m;
        } else {
            i = 0;
        }
        float currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f;
        float translationY = this.actionBar.getTranslationY();
        float N = ((hl.N(8.0f) + (hl.L(42.0f) * R1)) * f) + ((float) Math.floor(translationY + (uh9.v(f, 1.0f, currentActionBarHeight, i) - (hl.p * 21.0f))));
        this.f2 = (hl.L(7.0f) * f) + hl.L(1.3f) + N;
        this.h2 = (((float) Math.floor(hl.p * 11.0f)) * f) + N + hl.L(24.0f);
    }

    public final void i4(boolean z) {
        org.telegram.ui.ActionBar.a aVar;
        float f;
        boolean z2;
        if ((this.v0 != null || this.w0 != null) && (aVar = this.actionBar) != null && this.simpleActionBar != null) {
            if (aVar.getOccupyStatusBar()) {
                f = hl.m;
            } else {
                f = 0.0f;
            }
            int L = hl.L(7.0f);
            float right = this.simpleActionBar.getBackButton().getRight() + L;
            float menuPillLeft = this.simpleActionBar.getMenuPillLeft() - L;
            lq8 lq8Var = this.v0;
            boolean z3 = false;
            if (lq8Var != null) {
                float z4 = bp1.z(this.actionBar.getHeight(), f, 2.0f, f);
                if (Math.abs(right - lq8Var.g0) <= 0.1f && Math.abs(menuPillLeft - lq8Var.h0) <= 0.1f && Math.abs(z4 - lq8Var.i0) <= 0.1f) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                lq8Var.g0 = right;
                lq8Var.h0 = menuPillLeft;
                if (z) {
                    lq8Var.n0.e(true, menuPillLeft);
                }
                lq8Var.i0 = z4;
                if (z2) {
                    lq8Var.invalidate();
                }
            }
            gu8 gu8Var = this.w0;
            if (gu8Var != null) {
                float z5 = bp1.z(this.actionBar.getHeight(), f, 2.0f, f);
                int e2 = e2();
                if (Math.abs(right - gu8Var.r) > 0.1f || Math.abs(menuPillLeft - gu8Var.s) > 0.1f || Math.abs(z5 - gu8Var.w) > 0.1f) {
                    z3 = true;
                }
                gu8Var.r = right;
                gu8Var.s = menuPillLeft;
                if (z) {
                    gu8Var.E.e(true, menuPillLeft);
                }
                gu8Var.w = z5;
                gu8Var.y = e2 + z5;
                if (z3) {
                    gu8Var.invalidate();
                }
            }
        }
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.q2;
    }

    @Override
    public final boolean isLightStatusBar() {
        int v0;
        if (!this.q2) {
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            if (aVar != null && aVar.z()) {
                v0 = aob.v0(aob.w8, this.A0);
            } else if (!this.X5 && this.G5 <= 0.5f) {
                kc7 kc7Var = this.n6;
                if (kc7Var != null) {
                    v0 = kc7Var.d(aob.I.o());
                } else {
                    v0 = aob.v0(aob.s8, this.A0);
                }
            } else {
                v0 = aob.v0(aob.d6, this.A0);
            }
            if (vm2.h(v0) > 0.699999988079071d) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.isSwipeBackEnabled(android.view.MotionEvent):boolean");
    }

    @Override
    public final rz4 j() {
        return getBaseSimpleGlass().c();
    }

    public final float j2(int i) {
        View subtitleTextView;
        ema emaVar;
        kz1 kz1Var = this.m5;
        if (kz1Var != null && !(kz1Var instanceof zu1) && kz1Var.p() != null) {
            f82 p = this.m5.p();
            if (i == 0) {
                subtitleTextView = p.getTitleTextView();
                emaVar = this.f;
            } else {
                subtitleTextView = p.getSubtitleTextView();
                emaVar = this.r;
            }
            float textSize = emaVar.getPaint().getTextSize();
            if ((subtitleTextView instanceof ema) && textSize > 0.0f) {
                return ((ema) subtitleTextView).getPaint().getTextSize() / textSize;
            }
            return 1.0f;
        }
        return 1.0f;
    }

    public final void j3() {
        zp8 zp8Var = this.a;
        if (zp8Var != null && this.c != null && zp8Var.getChildCount() > 0 && !this.t6) {
            View view = null;
            int i = Integer.MAX_VALUE;
            int i2 = -1;
            for (int i3 = 0; i3 < this.a.getChildCount(); i3++) {
                int S = RecyclerView.S(this.a.getChildAt(i3));
                View childAt = this.a.getChildAt(i3);
                if (S != -1 && childAt.getTop() < i) {
                    i = childAt.getTop();
                    i2 = S;
                    view = childAt;
                }
            }
            if (view != null) {
                this.r6 = i2;
                int top = view.getTop();
                this.s6 = top;
                if (this.r6 == 0 && !this.p2 && top > d2()) {
                    this.s6 = d2();
                }
                this.c.g1(i2, view.getTop() - this.a.getPaddingTop());
            }
        }
    }

    public final void j4() {
        try {
            tb tbVar = this.U;
            if (tbVar != null && (tbVar.getForeground() instanceof ColorDrawable)) {
                ((ColorDrawable) this.U.getForeground()).setColor(vm2.o(aob.v0(aob.d6, this.A0), 100));
            }
            float f = this.W5;
            Drawable drawable = this.E;
            int[] iArr = this.Y6;
            if (drawable != null) {
                int R0 = hl.R0(f, 1.0f, aob.v0(aob.qi, this.A0), aob.v0(aob.Fj, this.A0));
                int i = iArr[6];
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                if (R0 != i) {
                    drawable.setColorFilter(new PorterDuffColorFilter(R0, mode));
                }
                iArr[6] = R0;
            }
            Drawable drawable2 = this.U6;
            if (drawable2 != null) {
                int v0 = aob.v0(aob.V6, this.A0);
                int i2 = iArr[3];
                PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
                if (v0 != i2) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(v0, mode2));
                }
                iArr[3] = v0;
            }
            Drawable drawable3 = this.V6;
            if (drawable3 != null) {
                int v02 = aob.v0(aob.v8, this.A0);
                int i3 = iArr[4];
                PorterDuff.Mode mode3 = PorterDuff.Mode.MULTIPLY;
                if (v02 != i3) {
                    drawable3.setColorFilter(new PorterDuffColorFilter(v02, mode3));
                }
                iArr[4] = v02;
            }
            Drawable drawable4 = this.W6;
            if (drawable4 != null) {
                int v03 = aob.v0(aob.F8, this.A0);
                int i4 = iArr[5];
                PorterDuff.Mode mode4 = PorterDuff.Mode.SRC_IN;
                if (v03 != i4) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(v03, mode4));
                }
                iArr[5] = v03;
            }
            wm2 wm2Var = this.X6;
            if (wm2Var != null) {
                wm2Var.y = aob.v0(aob.nk, this.A0);
                if (this.a != null) {
                    for (int i5 = 0; i5 < this.a.getChildCount(); i5++) {
                        View childAt = this.a.getChildAt(i5);
                        if (childAt != null) {
                            childAt.invalidate();
                        }
                    }
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final float k2(float f, int i, View view) {
        View C;
        float left;
        int paddingLeft;
        kz1 kz1Var = this.m5;
        if (kz1Var != null && !(kz1Var instanceof zu1) && this.fragmentView != null && (view.getParent() instanceof View)) {
            f82 p = this.m5.p();
            org.telegram.ui.ActionBar.a actionBar = ((org.telegram.ui.ActionBar.e) this.m5).getActionBar();
            View view2 = null;
            if (i == 0) {
                if (p != null) {
                    view2 = p.getTitleTextView();
                }
            } else if (i == 1) {
                if (p != null) {
                    view2 = p.getSubtitleTextView();
                }
            } else if (actionBar != null) {
                view2 = actionBar.getBackButton();
            }
            if (view2 != null) {
                uj3 uj3Var = this.l5;
                if (uj3Var != null && uj3Var.getFragmentView() != null) {
                    C = this.l5.getFragmentView();
                } else {
                    C = this.m5.C();
                }
                RectF rectF = this.l6;
                if (yic.c(view2, C, rectF)) {
                    float f2 = rectF.left;
                    if (yic.c((View) view.getParent(), this.fragmentView, rectF)) {
                        if (i == 2) {
                            left = rectF.left;
                            paddingLeft = view.getLeft();
                        } else {
                            f2 += view2.getPaddingLeft();
                            left = rectF.left + view.getLeft();
                            paddingLeft = view.getPaddingLeft();
                        }
                        return f2 - (left + paddingLeft);
                    }
                }
            }
        }
        return f;
    }

    public final void k3(boolean z) {
        int i = this.N4;
        if (i >= 0) {
            if (z) {
                z46 z46Var = new z46(getParentActivity(), 2, 0.6f);
                z46Var.a = this.N4;
                z46Var.p = -this.a.getPaddingTop();
                this.c.v0(z46Var);
                return;
            }
            this.c.g1(i, -this.a.getPaddingTop());
        }
    }

    public final void k4() {
        boolean z;
        TLRPC.UserFull userFull;
        if (this.Y0 == null) {
            return;
        }
        if (this.E2 == null && (((userFull = this.w2) != null && userFull.ttl_period > 0) || (this.v2 != null && xc2.y(13, this.F2) && this.v2.ttl_period > 0))) {
            z = true;
        } else {
            z = false;
        }
        hl.T3(this.Y0, z, 0.8f, true, this.r5);
    }

    public final float l2() {
        if (this.T != null) {
            return this.T.getVisibilityFactor() * hl.L(22.0f);
        }
        return 0.0f;
    }

    public final ValueAnimator l3(final boolean z) {
        float f;
        boolean z2;
        int i;
        if (z) {
            hl.V2(getParentActivity(), this.classGuid);
            hl.g3(getParentActivity(), this.classGuid);
        }
        ValueAnimator valueAnimator = this.W1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.W1.cancel();
        }
        gu8 gu8Var = this.w0;
        if (gu8Var != null) {
            gu8Var.setActive(!z);
        }
        float f2 = this.V1;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        final float f3 = this.Q1;
        this.b.setTranslationY(f3);
        this.b.setVisibility(0);
        this.U0.setVisibility(0);
        this.a.setVisibility(0);
        O2(true);
        this.Y.setVisibility(0);
        this.f.setVisibility(0);
        this.r.setVisibility(0);
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (this.V1 > 0.5f) {
            z2 = true;
        } else {
            z2 = false;
        }
        aVar.C(z2);
        int i2 = 8;
        if (this.V1 > 0.5f) {
            i = 0;
        } else {
            i = 8;
        }
        sla slaVar = this.T0;
        if (slaVar != null) {
            slaVar.setVisibility(i);
        }
        this.U0.setVisibility(i);
        FrameLayout searchContainer = this.U0.getSearchContainer();
        if (this.V1 <= 0.5f) {
            i2 = 0;
        }
        searchContainer.setVisibility(i2);
        this.b.setEmptyView(this.P);
        this.Y.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                RectF rectF = ProfileActivity.Z6;
                ProfileActivity.this.I2(ofFloat, f3, z);
            }
        });
        ofFloat.addListener(new xq8(this, z, (byte) 0));
        if (!z) {
            this.Y4 = true;
            j3();
            hl.U2(getParentActivity(), this.classGuid);
            this.P.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(k43.f);
        this.W1 = ofFloat;
        return ofFloat;
    }

    public final void l4(boolean z) {
        boolean z2;
        boolean z3;
        int i;
        int i2;
        boolean z4;
        float f;
        TLRPC.ChatFull chatFull;
        float f2 = 0.2f;
        int i3 = (D1() > 0.2f ? 1 : (D1() == 0.2f ? 0 : -1));
        int i4 = 0;
        if (i3 > 0 && !this.X1 && (this.r0 == null || this.P2 == -1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.d6 = z2;
        J1();
        e29 e29Var = this.s;
        if (e29Var != null && e29Var.getVisibility() != 8) {
            e29 e29Var2 = this.s;
            if (this.actionBar.getOccupyStatusBar()) {
                i2 = hl.m;
            } else {
                i2 = 0;
            }
            e29Var2.setTranslationY((((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i2) + this.Q1) + this.U1) - hl.L(29.5f));
            if (i3 > 0 && !this.X1 && !this.s1 && (this.r0 == null || this.P2 == -1)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 && this.f1 != 0) {
                if (xc2.T(this.F2) && !this.F2.megagroup && (chatFull = this.v2) != null && chatFull.linked_chat_id != 0 && (this.E3 != -1 || this.F3 != -1)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            if (!this.G1) {
                if (this.s.getTag() == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3 != z4) {
                    e29 e29Var3 = this.s;
                    if (z3) {
                        e29Var3.setTag(null);
                    } else {
                        e29Var3.setTag(0);
                    }
                    AnimatorSet animatorSet = this.w;
                    if (animatorSet != null) {
                        this.w = null;
                        animatorSet.cancel();
                    }
                    float f3 = 0.0f;
                    if (z) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.w = animatorSet2;
                        if (z3) {
                            animatorSet2.setInterpolator(new DecelerateInterpolator());
                            this.w.playTogether(ObjectAnimator.ofFloat(this.s, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.s, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.s, View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.w.playTogether(ObjectAnimator.ofFloat(this.s, View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.s, View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.s, View.ALPHA, 0.0f));
                        }
                        this.w.setDuration(150L);
                        this.w.addListener(new mq8(this, (byte) 3));
                        this.w.start();
                    } else {
                        e29 e29Var4 = this.s;
                        if (z3) {
                            f = 1.0f;
                        } else {
                            f = 0.2f;
                        }
                        e29Var4.setScaleX(f);
                        e29 e29Var5 = this.s;
                        if (z3) {
                            f2 = 1.0f;
                        }
                        e29Var5.setScaleY(f2);
                        e29 e29Var6 = this.s;
                        if (z3) {
                            f3 = 1.0f;
                        }
                        e29Var6.setAlpha(f3);
                    }
                }
            }
        } else {
            z3 = false;
        }
        lq8 lq8Var = this.v0;
        if (lq8Var != null) {
            float measuredWidth = this.Z.getMeasuredWidth() - hl.L(40.0f);
            if (this.actionBar.getOccupyStatusBar()) {
                i = hl.m;
            } else {
                i = 0;
            }
            lq8Var.j0 = measuredWidth;
            lq8Var.l0 = z3;
            lq8Var.k0 = (org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f) + i;
            lq8Var.invalidate();
        }
        gu8 gu8Var = this.w0;
        if (gu8Var != null) {
            if (this.actionBar.getOccupyStatusBar()) {
                i4 = hl.m;
            }
            gu8Var.setExpandCoords(org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i4 + this.Q1 + this.U1);
        }
    }

    public final int m2() {
        float f;
        if (this.q1) {
            return 0;
        }
        if (this.f1 != 0 && xc2.c0(getMessagesController().M0(Long.valueOf(this.f1)))) {
            if (N2()) {
                f = 24.0f;
            } else {
                f = 38.0f;
            }
            return hl.L(f);
        }
        return hl.L(50.0f);
    }

    public final void m4() {
        cga cgaVar;
        bha bhaVar;
        p66 p66Var;
        int v0;
        int v02;
        int v03;
        int i;
        int v04;
        int v05;
        int v06;
        this.o6.clear();
        is8 is8Var = this.d1;
        if (is8Var != null) {
            is8Var.a(this.n6, true);
        }
        kq8 kq8Var = this.r;
        if (kq8Var != null) {
            if (kq8Var.getTag() instanceof Integer) {
                v06 = aob.v0(((Integer) this.r.getTag()).intValue(), this.A0);
            } else {
                v06 = aob.v0(aob.B8, this.A0);
            }
            this.r.setTextColor(vm2.f(this.l2, A1(v06, Boolean.valueOf(this.K0[0])), -1275068417));
        }
        gs8 gs8Var = this.F6;
        float f = -0.1f;
        if (gs8Var != null) {
            gs8Var.a(vm2.f(this.l2, aob.p1(0.5f, aob.a(0.18f, -0.1f, this.c1)), 603979775));
        }
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        int i2 = -1;
        if (aVar != null) {
            if (this.n6 != null) {
                v04 = -1;
            } else {
                v04 = aob.v0(aob.v8, this.A0);
            }
            aVar.H(vm2.f(this.W5, v04, aob.v0(aob.y8, this.A0)), false);
            org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
            kc7 kc7Var = this.n6;
            if (kc7Var != null) {
                v05 = 1090519039;
            } else if (kc7Var != null) {
                v05 = 553648127;
            } else {
                v05 = aob.v0(aob.f8, this.A0);
            }
            aVar2.G(vm2.f(this.W5, v05, aob.v0(aob.z8, this.A0)), false);
        }
        if (this.y != null) {
            kc7 kc7Var2 = this.n6;
            if (kc7Var2 != null) {
                int g = kc7Var2.g();
                boolean o = this.n6.o(aob.I.o());
                kc7 kc7Var3 = this.n6;
                if (o) {
                    i = kc7Var3.k();
                } else {
                    i = kc7Var3.i();
                }
                int f2 = vm2.f(0.4f, g, i);
                if (!aob.I.o()) {
                    f = -0.08f;
                }
                v03 = aob.a(0.1f, f, f2);
            } else {
                v03 = aob.v0(aob.qi, this.A0);
            }
            this.y.setColorFilter(hl.R0(this.W5, 1.0f, v03, aob.v0(aob.Fj, this.A0)), PorterDuff.Mode.MULTIPLY);
        }
        if (this.I != null) {
            if (this.n6 != null) {
                v02 = -1;
            } else {
                v02 = aob.v0(aob.ri, this.A0);
            }
            this.I.setColorFilter(hl.R0(this.W5, 1.0f, v02, aob.v0(aob.d6, this.A0)), PorterDuff.Mode.MULTIPLY);
        }
        ns1 ns1Var = this.f;
        if (ns1Var != null) {
            if (this.n6 != null) {
                v0 = -1;
            } else {
                v0 = aob.v0(aob.mi, this.A0);
            }
            ns1Var.setTextColor(vm2.f(this.l2, vm2.f(this.W5, v0, aob.v0(aob.Fj, this.A0)), -1));
        }
        guc gucVar = this.a1;
        if (gucVar != null && (p66Var = (p66) gucVar.e) != null) {
            p66Var.invalidate();
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            if (this.n6 == null) {
                i2 = vm2.f(this.T1, aob.v0(aob.gd, this.A0), -1);
            }
            drawable.setColorFilter(i2, PorterDuff.Mode.MULTIPLY);
        }
        tu8 tu8Var = this.c0;
        if (tu8Var != null) {
            tu8Var.setColor(this.n6);
        }
        hl.d0(this.a, new hp8(this, (byte) 2));
        gr8 gr8Var = this.O;
        if (gr8Var != null && (bhaVar = gr8Var.L0) != null) {
            bhaVar.updateColors();
        }
        gr8 gr8Var2 = this.O;
        if (gr8Var2 != null && (cgaVar = gr8Var2.b0) != null) {
            cgaVar.m();
        }
        n4();
        M3();
        lq8 lq8Var = this.v0;
        if (lq8Var != null) {
            lq8Var.f(true, true);
        }
        gu8 gu8Var = this.w0;
        if (gu8Var != null) {
            gu8Var.a();
        }
    }

    public final e43 n2() {
        int i;
        float f;
        e43 e43Var = this.J;
        if (e43Var == null) {
            this.y = aob.Q1.getConstantState().newDrawable().mutate();
            this.I = aob.R1.getConstantState().newDrawable().mutate();
            kc7 kc7Var = this.n6;
            if (kc7Var != null) {
                boolean o = kc7Var.o(aob.I.o());
                kc7 kc7Var2 = this.n6;
                if (o) {
                    i = kc7Var2.k();
                } else {
                    i = kc7Var2.i();
                }
                if (aob.I.o()) {
                    f = -0.1f;
                } else {
                    f = -0.08f;
                }
                int a = aob.a(0.1f, f, i);
                Drawable drawable = this.y;
                int R0 = hl.R0(this.W5, 1.0f, a, aob.v0(aob.Fj, this.A0));
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(R0, mode);
                this.I.setColorFilter(hl.R0(this.W5, 1.0f, -1, aob.v0(aob.d6, this.A0)), mode);
            }
            e43 e43Var2 = new e43(new zm2(this.y, this.I), getParentActivity().getDrawable(2131232817));
            this.J = e43Var2;
            return e43Var2;
        }
        return e43Var;
    }

    public final void n3() {
        ap8 ap8Var = this.a0;
        if (ap8Var != null) {
            if (this.s1) {
                ap8Var.F = (byte) 6;
            } else if (this.q1) {
                ap8Var.F = (byte) 5;
            } else if (this.s2) {
                ap8Var.F = (byte) 2;
            } else if (this.e1 != 0) {
                ap8Var.F = (byte) 0;
            } else if (this.f1 != 0) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f1));
                if (xc2.T(M0)) {
                    boolean n0 = xc2.n0(M0);
                    ap8 ap8Var2 = this.a0;
                    if (n0) {
                        ap8Var2.F = (byte) 3;
                        return;
                    } else if (xc2.c0(M0)) {
                        ap8Var2.F = (byte) 4;
                        return;
                    } else {
                        ap8Var2.F = (byte) 1;
                        return;
                    }
                }
                this.a0.F = (byte) 3;
            }
        }
    }

    public final void n4() {
        if (this.s != null) {
            try {
                int v0 = aob.v0(aob.oi, this.A0);
                int v02 = aob.v0(aob.pi, this.A0);
                int v03 = aob.v0(aob.ni, this.A0);
                if (this.n6 != null && aob.c1(v0)) {
                    v0 = aob.a(0.05f, -0.04f, this.n6.c(false));
                    kc7 kc7Var = this.n6;
                    if (kc7Var != null) {
                        int d = kc7Var.d(aob.I.o());
                        v02 = aob.C(aob.I.o(), aob.v0(aob.v6, this.A0), d, v02, d);
                    }
                    v03 = -1;
                }
                e29 e29Var = this.v6;
                e29 e29Var2 = this.s;
                int[] iArr = this.w6;
                if (e29Var != e29Var2 || iArr[0] != v0 || iArr[1] != v02 || iArr[2] != v03) {
                    this.v6 = e29Var2;
                    iArr[0] = v0;
                    iArr[1] = v02;
                    iArr[2] = v03;
                    Drawable mutate = this.fragmentView.getContext().getResources().getDrawable(2131231201).mutate();
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
                    zm2 zm2Var = new zm2(mutate, aob.h0(hl.L(56.0f), v0, v02), 0, 0);
                    int L = hl.L(56.0f);
                    int L2 = hl.L(56.0f);
                    zm2Var.e = L;
                    zm2Var.f = L2;
                    this.s.setBackground(zm2Var);
                    this.s.setColorFilter(new PorterDuffColorFilter(v03, mode));
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.J1 == 0) {
            return true;
        }
        return false;
    }

    public final boolean o2() {
        TLRPC.UserFull userFull;
        TL_bots.BotInfo botInfo;
        int i = 0;
        if (!this.s2 || (userFull = this.w2) == null || (botInfo = userFull.bot_info) == null) {
            return false;
        }
        if (botInfo.privacy_policy_url == null) {
            ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
            int size = arrayList.size();
            while (i < size) {
                TLRPC.BotCommand botCommand = arrayList.get(i);
                i++;
                if ("privacy".equals(botCommand.command)) {
                    return true;
                }
            }
            return true;
        }
        return true;
    }

    public final void o3(float r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.o3(float):void");
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        zn5 zn5Var = this.r0;
        if (zn5Var != null) {
            zn5Var.h(i, i2, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        bha bhaVar;
        if (super.onBackPressed(z)) {
            gr8 gr8Var = this.O;
            if (gr8Var != null && (bhaVar = gr8Var.L0) != null && bhaVar.o0) {
                if (z) {
                    F3();
                    return false;
                }
            } else if (this.N4 != -1 && gr8Var != null && gr8Var.F1) {
                if (z) {
                    gr8Var.E(true);
                }
            } else {
                return this.actionBar.isEnabled();
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.M;
        if (undoView != null) {
            undoView.d(0, true);
        }
        super.onBecomeFullyHidden();
        this.u6 = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        n4();
        this.u6 = true;
        N1();
        if (this.J0 && !this.r5 && (view = this.fragmentView) != null) {
            this.r5 = true;
            this.Y4 = true;
            view.requestLayout();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        View m;
        super.onConfigurationChanged(configuration);
        gr8 gr8Var = this.O;
        if (gr8Var != null) {
            gr8Var.onConfigurationChanged(configuration);
        }
        p2();
        if (this.o2 && this.q2 && (m = this.c.m(0)) != null) {
            this.a.scrollBy(0, m.getTop() - d2());
        }
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new gb(this, (byte) 10));
    }

    @Override
    public final android.animation.AnimatorSet onCustomTransitionAnimation(boolean r20, java.lang.Runnable r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onCustomTransitionAnimation(boolean, java.lang.Runnable):android.animation.AnimatorSet");
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        zp8 zp8Var = this.a;
        if (zp8Var != null) {
            zp8Var.i1();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        gr8 gr8Var = this.O;
        if (gr8Var != null) {
            gr8Var.L0();
        }
        wia wiaVar = this.R;
        if (wiaVar != null) {
            wiaVar.b(this);
        }
        wia wiaVar2 = this.R;
        if (wiaVar2 != null) {
            wiaVar2.y.remove(this);
        }
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, jn7.s);
        getNotificationCenter().n(this, jn7.u);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, jn7.t5);
        getNotificationCenter().n(this, jn7.D1);
        getNotificationCenter().n(this, jn7.c0);
        getNotificationCenter().n(this, jn7.y5);
        getNotificationCenter().n(this, jn7.I5);
        getNotificationCenter().n(this, jn7.k3);
        getNotificationCenter().n(this, jn7.i5);
        getNotificationCenter().n(this, jn7.A3);
        getNotificationCenter().n(this, jn7.E3);
        getNotificationCenter().n(this, jn7.F3);
        getNotificationCenter().n(this, jn7.y1);
        getNotificationCenter().n(this, jn7.h3);
        getNotificationCenter().n(this, jn7.I3);
        getNotificationCenter().n(this, jn7.Y3);
        getNotificationCenter().n(this, jn7.Z3);
        jn7.e().n(this, jn7.l4);
        jq8 jq8Var = this.o0;
        if (jq8Var != null) {
            jq8Var.K();
        }
        ws8 ws8Var = this.n0;
        if (ws8Var != null) {
            ws8Var.c();
        }
        this.f6 = null;
        if (this.e1 != 0) {
            getNotificationCenter().n(this, jn7.s1);
            getNotificationCenter().n(this, jn7.N);
            getNotificationCenter().n(this, jn7.a0);
            getNotificationCenter().n(this, jn7.Y);
            getNotificationCenter().n(this, jn7.g0);
            getNotificationCenter().n(this, jn7.D0);
            getNotificationCenter().n(this, jn7.E0);
            getNotificationCenter().n(this, jn7.k0);
            jn7.e().n(this, jn7.A4);
            getMessagesController().h1.remove(Long.valueOf(this.e1));
        } else if (this.f1 != 0) {
            jn7.e().n(this, jn7.E5);
            getNotificationCenter().n(this, jn7.r3);
            getNotificationCenter().n(this, jn7.T);
            getNotificationCenter().n(this, jn7.g1);
            getNotificationCenter().n(this, jn7.w2);
            getNotificationCenter().n(this, jn7.b1);
        }
        iq8 iq8Var = this.f0;
        if (iq8Var != null) {
            iq8Var.setImageDrawable(null);
        }
        zn5 zn5Var = this.r0;
        if (zn5Var != null) {
            zn5Var.c();
        }
        nq8 nq8Var = this.Z4;
        if (nq8Var != null) {
            nq8Var.b();
        }
        ks8 ks8Var = this.z2;
        if (ks8Var != null && this.y2) {
            ks8Var.b(true);
            this.z2 = null;
        }
        j61 j61Var = this.D5;
        if (j61Var != null) {
            this.D5 = null;
            hl.c3(j61Var);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onPause() {
        mha mhaVar;
        super.onPause();
        UndoView undoView = this.M;
        if (undoView != null) {
            undoView.d(0, true);
        }
        zn5 zn5Var = this.r0;
        if (zn5Var != null) {
            zn5Var.i();
        }
        c34 c34Var = this.Y1;
        if (c34Var != null) {
            c34Var.g();
        }
        gr8 gr8Var = this.O;
        if (gr8Var != null && (mhaVar = gr8Var.W) != null) {
            mhaVar.e = false;
            if (mhaVar.c != null) {
                mhaVar.a.onPause();
            }
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        zn5 zn5Var = this.r0;
        if (zn5Var != null) {
            zn5Var.j(i, strArr, iArr);
        }
        if (i != 101 && i != 102) {
            if (i == 103 && this.F2 != null) {
                int i2 = 0;
                while (true) {
                    if (i2 < iArr.length) {
                        if (iArr[i2] != 0) {
                            z4 = false;
                            break;
                        }
                        i2++;
                    } else {
                        z4 = true;
                        break;
                    }
                }
                if (iArr.length > 0 && z4) {
                    vc2 g1 = getMessagesController().g1(this.f1, false, null);
                    TLRPC.Chat chat = this.F2;
                    if (g1 == null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    xkc.l(chat, null, z5, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                xkc.h(getParentActivity(), null, i);
                return;
            }
            return;
        }
        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.e1));
        if (X1 == null) {
            return;
        }
        int i3 = 0;
        while (true) {
            if (i3 < iArr.length) {
                if (iArr[i3] != 0) {
                    z = false;
                    break;
                }
                i3++;
            } else {
                z = true;
                break;
            }
        }
        if (iArr.length > 0 && z) {
            if (i == 102) {
                z2 = true;
            } else {
                z2 = false;
            }
            TLRPC.UserFull userFull = this.w2;
            if (userFull != null && userFull.video_calls_available) {
                z3 = true;
            } else {
                z3 = false;
            }
            xkc.m(X1, z2, z3, getParentActivity(), this.w2, getAccountInstance());
            return;
        }
        xkc.h(getParentActivity(), null, i);
    }

    @Override
    public final void onResume() {
        TLRPC.User X1;
        tb tbVar;
        super.onResume();
        gr8 gr8Var = this.O;
        if (gr8Var != null) {
            gr8Var.e1 = true;
            lha lhaVar = gr8Var.K;
            if (lhaVar != null) {
                lhaVar.f();
            }
            ria riaVar = gr8Var.N;
            if (riaVar != null) {
                riaVar.f();
            }
            sia siaVar = gr8Var.M;
            if (siaVar != null) {
                siaVar.X(false);
            }
            for (int i = 0; i < gr8Var.n0.length; i++) {
                gr8Var.N(i);
            }
            mha mhaVar = gr8Var.W;
            if (mhaVar != null) {
                mhaVar.e = true;
                if (mhaVar.c != null) {
                    mhaVar.a.onResume();
                }
            }
        }
        p2();
        wr8 wr8Var = this.d;
        if (wr8Var != null) {
            this.X4 = true;
            wr8Var.f();
        }
        if (!((ActionBarLayout) this.parentLayout).w() && (tbVar = this.U) != null && tbVar.getVisibility() == 0) {
            this.U.setVisibility(8);
            this.U.setBackground(null);
        }
        zn5 zn5Var = this.r0;
        if (zn5Var != null) {
            zn5Var.k();
            setParentActivityTitle(ob6.M0(2131745223, null));
        }
        e4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new gb(this, (byte) 10));
        }
        ns1 ns1Var = this.f;
        if (ns1Var != null) {
            setParentActivityTitle(ns1Var.getText());
        }
        if (this.e1 != 0 && (X1 = getMessagesController().X1(Long.valueOf(this.e1))) != null && X1.photo == null && this.Q1 >= d2()) {
            this.k2.cancel();
            float[] fArr = this.n2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            o3(1.0f);
            this.o0.setVisibility(8);
            this.Q1 = d2();
            this.p2 = false;
            this.c.g1(0, d2() - this.a.getPaddingTop());
        }
        c34 c34Var = this.Y1;
        if (c34Var != null) {
            c34Var.a();
        }
        Y3();
        O2(false);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.z0.setColor(aob.v0(aob.i6, this.A0));
            G3();
            j4();
            B1();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        jla jlaVar;
        if (z && (jlaVar = this.simpleActionBar) != null) {
            jlaVar.setAlpha(1.0f);
        }
        if (z) {
            if (!z2) {
                byte b = this.J1;
                if (b != 0 && this.M1) {
                    if (b == 1) {
                        this.l2 = 0.0f;
                        jva jvaVar = this.T;
                        if (jvaVar != null) {
                            jvaVar.setParentExpanded(0.0f);
                        }
                        ap8 ap8Var = this.a0;
                        if (ap8Var != null) {
                            ap8Var.setParentExpanded(0.0f);
                        }
                        q3(0.0f);
                        tu8 tu8Var = this.c0;
                        if (tu8Var != null) {
                            tu8Var.setParentExpanded(0.0f);
                        }
                    }
                    this.G1 = false;
                    G1();
                    if (this.I1) {
                        L1(true);
                    }
                }
                if (!this.r5) {
                    this.r5 = true;
                    this.Y4 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().j(this.T4);
            tb tbVar = this.U;
            if (tbVar != null && tbVar.getVisibility() == 0) {
                this.U.setVisibility(8);
                this.U.setBackground(null);
            }
        }
        this.H1 = false;
        I1();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z, float f) {
        super.onTransitionAnimationProgress(z, f);
        tb tbVar = this.U;
        if (tbVar != null && tbVar.getVisibility() == 0) {
            tb tbVar2 = this.U;
            if (z) {
                tbVar2.setAlpha(1.0f - f);
            } else {
                tbVar2.setAlpha(f);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        gs8 gs8Var;
        ImageView imageView;
        ap8 ap8Var;
        super.onTransitionAnimationStart(z, z2);
        this.i6 = z;
        if (z && (ap8Var = this.a0) != null) {
            ArrayList arrayList = ap8Var.a;
            if (ap8Var.F == 6) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    xo8 xo8Var = (xo8) arrayList.get(i);
                    b29 b29Var = xo8Var.k;
                    if (b29Var != null) {
                        if (xo8Var.a == 15) {
                            b29Var.H(14);
                        } else {
                            b29Var.H(0);
                        }
                        xo8Var.k.start();
                    }
                }
            }
        }
        if (!z && (imageView = this.P0) != null && imageView.getTag() != null && (this.P0.getTag() instanceof s7)) {
            ((s7) this.P0.getTag()).setAlpha(1.0f);
        }
        if (z ? !z2 : z2) {
            if (this.J1 != 0 && this.M1 && !this.q2) {
                this.G1 = true;
                if (!z) {
                    float[] fArr = this.f6;
                    if (fArr == null) {
                        fArr = new float[14];
                        this.f6 = fArr;
                    }
                    this.F1 = this.Q1;
                    fArr[0] = this.Y.getScaleX();
                    this.f6[1] = this.Y.getTranslationX();
                    this.f6[2] = this.Y.getTranslationY();
                    ap8 ap8Var2 = this.a0;
                    if (ap8Var2 != null) {
                        this.f6[3] = ap8Var2.getAlpha();
                    }
                    gu8 gu8Var = this.w0;
                    if (gu8Var != null) {
                        float[] fArr2 = this.f6;
                        fArr2[4] = gu8Var.e;
                        fArr2[5] = gu8Var.f;
                    }
                    if (this.F6 != null) {
                        this.f6[6] = gs8Var.getAlpha();
                    }
                    this.f6[7] = this.f.getScaleX();
                    this.f6[8] = this.f.getTranslationY();
                    this.f6[9] = this.r.getTranslationY();
                    this.f6[10] = this.f.getLayoutParams().width;
                    float[] fArr3 = this.f6;
                    fArr3[11] = this.d2;
                    fArr3[12] = this.f.getTranslationX();
                    this.f6[13] = this.r.getTranslationX();
                    kg5 kg5Var = this.H6;
                    if (kg5Var != null) {
                        kg5Var.f(true);
                    }
                }
            }
        }
        if (z) {
            if (this.r0 != null) {
                this.T4 = getNotificationCenter().p(new int[]{jn7.r, jn7.s, jn7.W, jn7.X, jn7.E0, jn7.u4}, this.T4, true);
            } else {
                this.T4 = getNotificationCenter().p(new int[]{jn7.r, jn7.s, jn7.W, jn7.X, jn7.u4}, this.T4, true);
            }
            if (!z2 && getParentActivity() != null) {
                this.d5 = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.H1 = true;
        I1();
    }

    public final void p2() {
        boolean z;
        Point point = new Point();
        getParentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        if (point.x > point.y) {
            z = true;
        } else {
            z = false;
        }
        this.o2 = z;
    }

    @Override
    public final boolean q(uj3 uj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, tzb tzbVar) {
        long j = ((jf7) arrayList.get(0)).a;
        Bundle l = bs2.l("scrollToTopOnResume", true);
        if (wf3.B(j)) {
            l.putInt("enc_id", (int) (4294967295L & j));
        } else if (wf3.D(j)) {
            l.putLong("user_id", j);
        } else if (wf3.y(j)) {
            l.putLong("chat_id", -j);
        }
        if (!getMessagesController().C(l, uj3Var, null, null)) {
            return false;
        }
        jn7 notificationCenter = getNotificationCenter();
        int i3 = jn7.s;
        notificationCenter.n(this, i3);
        getNotificationCenter().k(i3, new Object[0]);
        presentFragment(new zu1(l), true);
        removeSelfFromStack();
        getSendMessagesHelper().q0(p7a.g(getMessagesController().X1(Long.valueOf(this.e1)), j, null, null, null, null, z2, i, i2));
        if (!TextUtils.isEmpty(charSequence)) {
            r7a.Z(k5.a(this.currentAccount), charSequence, j, 0L, z2, i, i2);
        }
        return true;
    }

    public final boolean q2() {
        if (this.F2 != null) {
            return getMessagesController().m2(this.F2);
        }
        uc7 messagesController = getMessagesController();
        TLRPC.UserFull userFull = this.w2;
        messagesController.getClass();
        return uc7.Q2(userFull);
    }

    public final void q3(float f) {
        this.P5 = f;
        qs8 qs8Var = this.O5;
        if (qs8Var != null) {
            qs8Var.b(f);
        }
        W3();
    }

    public final boolean r2(f82 f82Var) {
        String str;
        kz1 kz1Var = this.m5;
        if (((kz1Var instanceof zu1) && !((zu1) kz1Var).x4) || !(f82Var.getSubtitleTextView() instanceof ema)) {
            return false;
        }
        CharSequence text = ((ema) f82Var.getSubtitleTextView()).getText();
        String str2 = null;
        if (text != null) {
            str = text.toString();
        } else {
            str = null;
        }
        if (this.r.getText() != null) {
            str2 = this.r.getText().toString();
        }
        return !TextUtils.equals(str, str2);
    }

    public final void r3(TLRPC.ChatFull chatFull) {
        boolean z;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        this.v2 = chatFull;
        if (chatFull != null) {
            long j = chatFull.migrated_from_chat_id;
            if (j != 0 && this.m1 == 0) {
                this.m1 = -j;
                getMediaDataController().g0(this.m1, this.classGuid, this.g1);
            }
        }
        gr8 gr8Var = this.O;
        if (gr8Var != null) {
            gr8Var.setChatInfo(this.v2);
        }
        jq8 jq8Var = this.o0;
        if (jq8Var != null && !this.q1) {
            jq8Var.setChatInfo(this.v2);
        }
        lq8 lq8Var = this.v0;
        if (lq8Var != null && (chatFull3 = this.v2) != null) {
            lq8Var.setStories(chatFull3.stories);
        }
        gu8 gu8Var = this.w0;
        if (gu8Var != null) {
            gu8Var.a();
        }
        iq8 iq8Var = this.f0;
        if (iq8Var != null) {
            iq8Var.setHasStories(N2());
        }
        U1();
        if (this.f1 != 0) {
            boolean z2 = f11.a;
            if (!getMessagesController().N3() && (chatFull2 = this.v2) != null && chatFull2.stargifts_available) {
                z = true;
            } else {
                z = false;
            }
            this.T0.Q(38, z);
            ap8 ap8Var = this.a0;
            if (ap8Var != null) {
                ap8Var.o(3, z);
            }
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        zn5 zn5Var = this.r0;
        if (zn5Var != null) {
            zn5Var.f = bundle.getString("path");
        }
    }

    @Override
    public final boolean s(uj3 uj3Var) {
        return false;
    }

    public final boolean s2() {
        if (this.r0 != null && !this.s1) {
            return true;
        }
        return false;
    }

    public final void s3(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.Z != null && (tL_emojiStatusCollectible2 = this.K6) != tL_emojiStatusCollectible) {
            if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
                this.K6 = tL_emojiStatusCollectible;
                kg5 kg5Var = this.H6;
                if (kg5Var != null) {
                    kg5Var.f(true);
                }
                if (tL_emojiStatusCollectible != null && !TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                    this.J6 = null;
                    this.H6 = new kg5(getParentActivity(), 3);
                    this.I6 = aob.v(tL_emojiStatusCollectible.center_color | (-16777216), aob.p1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
                    this.H6.setPadding(hl.L(4.0f), 0, hl.L(4.0f), hl.L(2.0f));
                    kg5 kg5Var2 = this.H6;
                    int p1 = aob.p1(0.5f, tL_emojiStatusCollectible.text_color | (-16777216));
                    kg5Var2.M0 = true;
                    kg5Var2.U0 = System.currentTimeMillis();
                    kg5Var2.N0 = new Path();
                    kg5Var2.O0 = hl.N(0.66f) / 2.0f;
                    kg5Var2.P0 = new Paint(1);
                    kg5Var2.Q0 = new Paint(1);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, hl.L(64.0f), 0.0f, new int[]{aob.p1(0.0f, p1), aob.p1(1.0f, p1), aob.p1(0.0f, p1)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    kg5Var2.T0 = linearGradient;
                    kg5Var2.Q0.setShader(linearGradient);
                    kg5Var2.R0 = new LinearGradient(0.0f, 0.0f, hl.L(64.0f), 0.0f, new int[]{aob.p1(0.0f, p1), aob.p1(0.5f, p1), aob.p1(0.0f, p1)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    kg5Var2.S0 = new Matrix();
                    kg5Var2.P0.setShader(kg5Var2.R0);
                    kg5Var2.Q0.setStyle(Paint.Style.STROKE);
                    kg5Var2.Q0.setStrokeJoin(Paint.Join.ROUND);
                    kg5Var2.Q0.setStrokeCap(Paint.Cap.ROUND);
                    kg5Var2.Q0.setStrokeWidth(hl.N(0.66f));
                    this.Z.addView(this.H6, tre.c(24.0f, -1));
                    this.H6.u(9.33f);
                    kg5 kg5Var3 = this.H6;
                    Typeface o = hl.o();
                    kg5Var3.I.x(o);
                    kg5Var3.K.setTypeface(o);
                    this.H6.t(tL_emojiStatusCollectible.title);
                    kg5 kg5Var4 = this.H6;
                    kg5Var4.d = -1L;
                    kg5Var4.m(5.66f, 2.66f, 5.66f, 2.66f);
                    kg5 kg5Var5 = this.H6;
                    kg5Var5.getClass();
                    kg5Var5.E = hl.N(4.0f);
                    kg5Var5.F = hl.N(2.66f);
                    this.H6.r();
                    this.H6.q(16.0f);
                    this.H6.v();
                    this.H6.setOnClickListener(new pp8(this, tL_emojiStatusCollectible.slug, (byte) 1));
                    if (this.Q1 < hl.L(82.0f)) {
                        this.J6 = Boolean.FALSE;
                        this.H6.setAlpha(0.0f);
                    }
                    K3();
                    kg5 kg5Var6 = this.H6;
                    Objects.requireNonNull(kg5Var6);
                    hl.d3(new ug(kg5Var6, (byte) 7), 6000L);
                }
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        zn5 zn5Var = this.r0;
        if (zn5Var != null && (str = zn5Var.f) != null) {
            bundle.putString("path", str);
        }
    }

    public void setAvatarAnimationProgress(float f) {
        int v0;
        int v02;
        int v03;
        int i;
        this.l2 = f;
        this.T1 = f;
        I1();
        jla jlaVar = this.simpleActionBar;
        if (jlaVar != null) {
            jlaVar.setAlpha(f);
        }
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null) {
            aVar.getBackButton().setTranslationX(hl.R1(k2(hl.L(2.0f), 2, this.actionBar.getBackButton()), hl.L(2.0f), f));
        }
        if (this.J1 == 2) {
            this.f0.setProgressToExpand(f);
            ap8 ap8Var = this.a0;
            if (ap8Var != null) {
                ap8Var.setParentExpanded(f);
            }
            q3(f);
            tu8 tu8Var = this.c0;
            if (tu8Var != null) {
                tu8Var.setParentExpanded(f);
            }
            jva jvaVar = this.T;
            if (jvaVar != null) {
                jvaVar.setParentExpanded(f);
            }
            H3();
            a4();
        }
        this.a.setAlpha(f);
        this.a.setTranslationX(hl.L(48.0f) - (hl.L(48.0f) * f));
        if (this.J1 != 2 || (v0 = this.s0) == 0) {
            if (this.e1 == 0) {
                if (xc2.S(this.currentAccount, this.f1)) {
                    boolean z = this.F2.megagroup;
                }
            }
            vnb vnbVar = this.A0;
            int[][] iArr = rb0.L;
            v0 = aob.v0(aob.a7, vnbVar);
        }
        int i2 = this.c5;
        if (i2 == 0) {
            i2 = aob.v0(aob.s8, this.A0);
        }
        this.d1.setBackgroundColor(vm2.f(f, vm2.o(i2, 0), v0));
        rsb rsbVar = this.m0;
        int f2 = vm2.f(f, i2, v0);
        rsbVar.k = true;
        rsbVar.b.setColor(f2);
        int i3 = -1;
        if (this.n6 != null) {
            v02 = -1;
        } else {
            if (this.e1 == 0) {
                if (xc2.S(this.currentAccount, this.f1)) {
                    boolean z2 = this.F2.megagroup;
                }
            }
            vnb vnbVar2 = this.A0;
            int[][] iArr2 = rb0.L;
            v02 = aob.v0(aob.g8, vnbVar2);
        }
        this.actionBar.H(vm2.f(this.T1, aob.v0(aob.v8, this.A0), v02), false);
        if (this.n6 == null) {
            i3 = aob.v0(aob.mi, this.A0);
        }
        int v04 = aob.v0(aob.A8, this.A0);
        ns1 ns1Var = this.f;
        if (ns1Var != null && this.J1 != 2) {
            ns1Var.setTextColor(vm2.f(f, v04, i3));
        }
        boolean[] zArr = this.K0;
        if (zArr[0]) {
            v03 = aob.v0(aob.si, this.A0);
        } else {
            if (this.e1 == 0) {
                if (xc2.S(this.currentAccount, this.f1)) {
                    boolean z3 = this.F2.megagroup;
                }
            }
            vnb vnbVar3 = this.A0;
            int[][] iArr3 = rb0.L;
            v03 = aob.v0(aob.h8, vnbVar3);
        }
        if (zArr[0]) {
            i = aob.pa;
        } else {
            i = aob.B8;
        }
        int v05 = aob.v0(i, this.A0);
        kq8 kq8Var = this.r;
        if (kq8Var != null && this.J1 != 2) {
            kq8Var.setTextColor(vm2.f(f, v05, A1(v03, Boolean.valueOf(zArr[0]))));
        }
        this.Q1 = this.S1 * f;
        long j = this.e1;
        if (j == 0) {
            j = this.f1;
        }
        vnb vnbVar4 = this.A0;
        int[][] iArr4 = rb0.L;
        int v06 = aob.v0(aob.p8[rb0.d(j)], vnbVar4);
        long j2 = this.e1;
        if (j2 == 0) {
            j2 = this.f1;
        }
        int c = rb0.c(j2);
        if (v06 != c) {
            this.q0.g(vm2.f(f, c, v06));
            this.f0.invalidate();
        }
        int i4 = this.d5;
        if (i4 != 0) {
            setNavigationBarColor(vm2.f(f, i4, getNavigationBarColor()));
        }
        this.d1.invalidate();
        O2(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        qr8 qr8Var = this.j6;
        if (qr8Var != null) {
            qr8Var.invalidate();
        }
        if (a() > 0) {
            iq8 iq8Var = this.f0;
            if (iq8Var != null) {
                iq8Var.setProgressToStoriesInsets(this.T1);
            }
            lq8 lq8Var = this.v0;
            if (lq8Var != null) {
                lq8Var.setProgressToStoriesInsets(this.T1);
            }
            gu8 gu8Var = this.w0;
            if (gu8Var != null) {
                gu8Var.setProgressToStoriesInsets(this.T1);
            }
        }
    }

    @Override
    public final void setParentLayout(wk5 wk5Var) {
        super.setParentLayout(wk5Var);
        c34 c34Var = this.Y1;
        if (c34Var != null) {
            c34Var.g();
            this.Y1 = null;
        }
        if (wk5Var != null && wk5Var.getParentActivity() != null) {
            this.Y1 = new c34(wk5Var.getParentActivity().getWindow(), new bp8(this, (byte) 0));
        }
    }

    public final void t2() {
        boolean z;
        TLRPC.Document document;
        if (this.b0 == null) {
            if (MediaController.z().R0 != null && MediaController.z().R0.a == this.currentAccount && MediaController.z().R0.b == a()) {
                this.b0 = MediaController.z().R0;
            } else {
                pc7 pc7Var = new pc7(this.currentAccount, a());
                this.b0 = pc7Var;
                TLRPC.UserFull userFull = this.w2;
                if (userFull != null && (document = userFull.saved_music) != null) {
                    ArrayList arrayList = pc7Var.c;
                    arrayList.clear();
                    pc7Var.b();
                    arrayList.add(0, pc7Var.d(document));
                }
            }
        }
        if (!this.b0.c.isEmpty()) {
            if (MediaController.z().R0 == this.b0 && MediaController.z().H((r47) this.b0.c.get(0))) {
                z = true;
            } else {
                MediaController.z().k();
                z = false;
            }
            MediaController.z().R0 = this.b0;
            MediaController.z().S0.clear();
            MediaController.z().S0.addAll(this.b0.c);
            if (!z) {
                MediaController.z().V((r47) this.b0.c.get(0));
            }
            showDialog(new j20(getParentActivity(), this.A0));
        }
    }

    public final void t3(boolean z) {
        Drawable t = this.f0.getImageReceiver().t();
        String str = null;
        if (t instanceof idc) {
            this.f0.v(null, null, t);
        } else if (t instanceof lm) {
            lm lmVar = (lm) t;
            this.f0.v(null, null, lmVar);
            if (z) {
                lmVar.f(this.f0);
            }
        } else {
            jn5 D = this.o0.D(0);
            if (D != null && D.p == 2) {
                str = "avatar";
            }
            this.f0.v(D, str, t);
        }
    }

    @Override
    public final boolean u() {
        return this.i6;
    }

    public final void u2(float f, float f2, int i) {
        switch (i) {
            case 0:
                boolean z = this.q1;
                if (z) {
                    if (z) {
                        V1();
                        return;
                    }
                    return;
                } else if (this.e1 != 0) {
                    b3();
                    return;
                } else if (this.f1 != 0) {
                    if (xc2.c0(getMessagesController().M0(Long.valueOf(this.f1)))) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.f1);
                        if (getMessagesController().C(bundle, this, null, null)) {
                            presentFragment(new zu1(bundle), false);
                            return;
                        }
                        return;
                    } else if (!V1()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", this.f1);
                        if (getMessagesController().C(bundle2, this, null, null)) {
                            presentFragment(new zu1(bundle2), false);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                V2(this.a0, f, f2, true);
                return;
            case 2:
                c3();
                return;
            case 3:
                T2();
                return;
            case 4:
                W2();
                return;
            case 5:
            case 10:
            case 11:
                S2(false);
                return;
            case 6:
                S2(true);
                return;
            case 7:
                U2(true);
                return;
            case 8:
                nb9.G0(a(), this);
                return;
            case 9:
                L2(false);
                return;
            case 12:
                getMessagesController().Y3.edit().putBoolean("story_keep", true).apply();
                id idVar = new id(3, this.A0, getParentActivity());
                idVar.q(200L);
                uc7.s1(this.currentAccount).O1().j(a(), new v35(this, idVar, (byte) 21), true, this.A0);
                return;
            case 13:
                R2(true);
                return;
            case 14:
                Y2();
                return;
            case 15:
                TLRPC.User f3 = getUserConfig().f();
                if (f3 != null) {
                    fu5 I = fu5.I(this, this.a0);
                    I.w = false;
                    I.i = (byte) 3;
                    I.b(2131232325, ob6.M0(2131746227, null), new y56(this, (byte) 26), false);
                    I.b(2131232108, ob6.M0(2131746405, null), new xp8(f3, (byte) 0), false);
                    I.b(2131232121, ob6.M0(2131746347, null), new y56(this, (byte) 27), false);
                    I.c0 = true;
                    I.b0(f - hl.L(8.0f), this.a0.getMeasuredHeight() - hl.L(16.0f));
                    I.a0();
                    return;
                }
                return;
            case 16:
                presentFragment(new UserInfoActivity());
                return;
            case 17:
                presentFragment(new uba(null));
                return;
            default:
                return;
        }
    }

    @Override
    public final void v() {
        this.a.A0(0);
    }

    public final void v2(Context context, long j, TL_payments.connectedBotStarRef connectedbotstarref) {
        int i = this.currentAccount;
        if (connectedbotstarref == null) {
            ng1.J0(context, i, this.w2.starref_program, getUserConfig().e(), this.A0, false);
        } else {
            ng1.K0(context, i, connectedbotstarref, j, this.A0);
        }
    }

    public final void w2(Boolean bool) {
        long j = this.e1;
        if (j == 0) {
            long j2 = this.f1;
            if (j2 != 0) {
                j = -j2;
            } else {
                j = this.i1;
            }
        }
        long j3 = j;
        boolean booleanValue = bool.booleanValue();
        int i = this.currentAccount;
        if (booleanValue) {
            uc7.s1(i).U(this.f5, j3);
        } else {
            uc7.s1(i).f0(this.f5, this.e5, j3);
        }
        this.e5 = 0;
        Z3(false, false);
        c21 c21Var = new c21(getParentActivity(), this.A0);
        c21Var.h(2131623982, new String[0]);
        c21Var.b.setText(ob6.M0(2131746131, null));
        d31.b0(this).b(c21Var, 1500).j();
    }

    public final void w3(or8 or8Var) {
        if (this.o5 == or8Var) {
            return;
        }
        this.o5 = or8Var;
        hl.d0(this.a, new hp8(this, (byte) 0));
    }

    @Override
    public final boolean x() {
        return false;
    }

    public final void x2(sg2[] sg2VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = getMessagesController().o1(this.e1);
        tL_messages_reportReaction.peer = getMessagesController().j1(this.f5);
        tL_messages_reportReaction.id = this.e5;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reportReaction, new xe2((byte) 4));
        sg2 sg2Var = sg2VarArr[0];
        if (sg2Var != null && sg2Var.b()) {
            getMessagesController().d0(-this.f5, getMessagesController().X1(Long.valueOf(this.e1)));
        }
        this.e5 = 0;
        Z3(false, false);
        d31.b0(this).E(this.A0).j();
    }

    public final void x3(CharSequence charSequence) {
        this.c6 = charSequence;
        d4();
    }

    public final void y2(Context context, long j, View view, int i, float f, float f2) {
        TLRPC.User X1;
        TLRPC.ChatParticipant chatParticipant;
        int L;
        int L2;
        wr8 wr8Var;
        if (getParentActivity() != null) {
            this.a.E0();
            if (i == this.T3) {
                TLRPC.User X12 = getMessagesController().X1(Long.valueOf(this.e1));
                TLRPC.UserFull userFull = this.w2;
                if (userFull != null && userFull.starref_program != null) {
                    long e = getUserConfig().e();
                    kt0.g(this.currentAccount).f(getParentActivity(), e, this.e1, new p4c(this, context, e, (byte) 7));
                } else if (X12 != null && X12.bot_can_edit) {
                    presentFragment(new cc(this.e1));
                }
            } else if (i == this.R3) {
                boolean z = !getMessagesController().p2(j, this.g1, null);
                getNotificationsController().G(j, this.g1, z);
                d31.A(this, z, null).j();
                P3();
                int i2 = this.R3;
                if (i2 >= 0 && (wr8Var = this.d) != null) {
                    wr8Var.g(i2);
                }
            } else if (i == this.a4) {
                TLRPC.User X13 = getMessagesController().X1(Long.valueOf(this.e1));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", X13.id);
                bundle.putBoolean("addContact", true);
                bundle.putString("phone", this.i5);
                bundle.putString("first_name_card", this.j5);
                bundle.putString("last_name_card", this.k5);
                cu2 cu2Var = new cu2(bundle, this.A0);
                cu2Var.P = new wp8(this, X13);
                presentFragment(cu2Var);
            } else if (i == this.X3) {
                TextView textView = (TextView) jj.f0(getParentActivity(), ob6.M0(2131751473, null), ob6.M0(2131751557, null), ob6.M0(2131751556, null), ob6.M0(2131751563, null), new hp8(this, (byte) 1), this.A0, false).c(-1);
                if (textView != null) {
                    yob.X(textView, aob.q7, null);
                }
            } else if (i == this.Y3) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.A0, getParentActivity());
                String M0 = ob6.M0(2131745938, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131745959, null);
                TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(-this.f5));
                sg2[] sg2VarArr = new sg2[1];
                if (M02 != null && xc2.w(2, M02)) {
                    LinearLayout linearLayout = new LinearLayout(getParentActivity());
                    linearLayout.setOrientation(1);
                    sg2 sg2Var = new sg2(1, this.A0, getParentActivity());
                    sg2VarArr[0] = sg2Var;
                    sg2Var.setBackgroundDrawable(aob.L0(false));
                    sg2VarArr[0].e(ob6.M0(2131753720, null), "", true, false, false);
                    sg2 sg2Var2 = sg2VarArr[0];
                    if (ob6.a0) {
                        L = hl.L(16.0f);
                    } else {
                        L = hl.L(8.0f);
                    }
                    if (ob6.a0) {
                        L2 = hl.L(8.0f);
                    } else {
                        L2 = hl.L(16.0f);
                    }
                    sg2Var2.setPadding(L, 0, L2, 0);
                    linearLayout.addView(sg2VarArr[0], tre.o(-1, -2));
                    sg2VarArr[0].setOnClickListener(new je(sg2VarArr, (byte) 4));
                    alertDialog$Builder.n(linearLayout);
                }
                alertDialog$Builder.j(ob6.M0(2131745957, null), new m88(this, sg2VarArr, (byte) 12));
                alertDialog$Builder.g(ob6.M0(2131752570, null), new ku7((byte) 24));
                TextView textView2 = (TextView) alertDialog$Builder.o().c(-1);
                if (textView2 != null) {
                    yob.X(textView2, aob.q7, null);
                }
            } else if (i == this.u4) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("chat_id", (int) (this.i1 & 4294967295L));
                presentFragment(new org.telegram.ui.ActionBar.e(bundle2));
            } else if (i == this.t4) {
                showDialog(jj.S(getParentActivity(), this.E2, this.A0).a);
            } else if (i == this.O3) {
                V2(view, f, f2, false);
            } else if (i == this.O4) {
                getMessagesController().t5(null, this.e1);
                if (d31.a(this)) {
                    d31.d(this, false).j();
                }
            } else if (i == this.b4) {
                kq0.a(this, this.currentAccount, getMessagesController().X1(Long.valueOf(this.e1)));
            } else if (i == this.d4) {
                try {
                    this.actionBar.getActionBarMenuOnItemClick().b(9);
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
            } else if (i == this.V3) {
                Y2();
            } else if (i == this.W3) {
                nb9.G0(a(), this);
            } else if (i >= this.x4 && i < this.y4) {
                boolean isEmpty = this.D2.isEmpty();
                TLRPC.ChatFull chatFull = this.v2;
                if (!isEmpty) {
                    chatParticipant = chatFull.participants.participants.get(((Integer) this.D2.get(i - this.x4)).intValue());
                } else {
                    chatParticipant = chatFull.participants.participants.get(i - this.x4);
                }
                g(chatParticipant, false, false, view);
            } else if (i == this.z4) {
                Z2();
            } else if (i == this.M3) {
                g3(f, f2, i, view);
            } else if (i == this.o4) {
                if (this.F2 != null) {
                    showDialog(new xo2(this, this.F2.linked_community_id, null, null));
                } else if (this.e1 != 0 && (X1 = getMessagesController().X1(Long.valueOf(this.e1))) != null) {
                    showDialog(new xo2(this, X1.linked_community_id, null, null));
                }
            } else if (i == this.J3) {
                if (this.v2.location instanceof TLRPC.TL_channelLocation) {
                    uc6 uc6Var = new uc6(5);
                    uc6Var.m0 = -this.f1;
                    uc6Var.H0 = (TLRPC.TL_channelLocation) this.v2.location;
                    presentFragment(uc6Var);
                }
            } else if (i == this.P4) {
                U2(false);
            } else if (i == this.A4) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("chat_id", this.f1);
                bundle3.putInt("type", 2);
                bg2 bg2Var = new bg2(bundle3);
                bg2Var.B0(this.v2);
                presentFragment(bg2Var);
            } else if (i == this.B4) {
                presentFragment(new qu0(this.f1));
            } else if (i == this.C4) {
                Bundle bundle4 = new Bundle();
                bundle4.putLong("chat_id", this.f1);
                bundle4.putInt("type", 1);
                bg2 bg2Var2 = new bg2(bundle4);
                bg2Var2.B0(this.v2);
                presentFragment(bg2Var2);
            } else if (i == this.D4) {
                this.S0.performClick();
            } else if (i == this.E4) {
                presentFragment(new at0(0, this.e1));
            } else if (i == this.F4) {
                presentFragment(new at0(1, this.e1));
            } else if (i == this.G4) {
                Bundle bundle5 = new Bundle();
                bundle5.putLong("chat_id", this.f1);
                bundle5.putBoolean("start_from_monetization", true);
                presentFragment(new w1b(bundle5));
            } else if (i == this.J4) {
                Bundle bundle6 = new Bundle();
                bundle6.putLong("chat_id", this.f1);
                bundle6.putInt("type", 0);
                bg2 bg2Var3 = new bg2(bundle6);
                bg2Var3.B0(this.v2);
                presentFragment(bg2Var3);
            } else if (i == this.g3) {
                presentFragment(new NotificationsSettingsActivity());
            } else if (i == this.i3) {
                PrivacySettingsActivity privacySettingsActivity = new PrivacySettingsActivity();
                TL_account.TL_password tL_password = this.I2;
                privacySettingsActivity.d = tL_password;
                if (tL_password != null) {
                    privacySettingsActivity.B0();
                }
                presentFragment(privacySettingsActivity);
            } else if (i == this.j3) {
                presentFragment(new DataSettingsActivity());
            } else if (i == this.k3) {
                presentFragment(new ThemeActivity(0));
            } else if (i == this.l3) {
                presentFragment(new FiltersSetupActivity());
            } else if (i == this.n3) {
                presentFragment(new StickersActivity(0, null));
            } else if (i == this.m3) {
                presentFragment(new q86());
            } else if (i == this.o3) {
                presentFragment(new SessionsActivity(0));
            } else if (i == this.r3) {
                showDialog(jj.R(this, this.A0));
            } else if (i == this.s3) {
                m01.u(getParentActivity(), ob6.M0(2131743893, null));
            } else if (i == this.t3) {
                m01.u(getParentActivity(), ob6.M0(2131746510, null));
            } else if (i == this.w3) {
                m3(getParentActivity(), false);
            } else if (i == this.x3) {
                m3(getParentActivity(), true);
            } else if (i == this.y3) {
                cc4.a();
            } else if (i == this.z3) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, this.A0, getParentActivity());
                    String M03 = ob6.M0(2131754113, null);
                    id idVar2 = alertDialog$Builder2.a;
                    idVar2.U = M03;
                    idVar2.S = ob6.M0(2131689472, null);
                    alertDialog$Builder2.j(ob6.M0(2131747558, null), new bp8(this, (byte) 2));
                    alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                    showDialog(idVar2);
                }
            } else if (i == this.h3) {
                presentFragment(new LanguageSelectActivity());
            } else if (i == this.W2) {
                presentFragment(new ve1(null));
            } else if (i == this.X2) {
                presentFragment(new UserInfoActivity());
            } else if (i == this.U2) {
                presentFragment(new v8(3));
            } else if (i == this.P2) {
                Y2();
            } else if (i == this.f4) {
                presentFragment(new PremiumPreviewFragment(0, "settings"));
            } else if (i == this.g4) {
                presentFragment(new nza());
            } else if (i == this.h4) {
                presentFragment(new thb());
            } else if (i == this.i4) {
                presentFragment(new PremiumPreviewFragment(1, "settings"));
            } else if (i == this.j4) {
                bx4.g1(false, pj0.a(this.currentAccount).b());
            } else if (i == this.botPermissionLocation) {
                tq0 tq0Var = this.t2;
                if (tq0Var != null) {
                    tq0Var.k(!tq0Var.f(), new ep8(this, view, (byte) 1));
                }
            } else if (i == this.botPermissionBiometry) {
                uo0 uo0Var = this.u2;
                if (uo0Var != null) {
                    uo0Var.f = true;
                    uo0Var.e = !uo0Var.e;
                    uo0Var.i();
                    ((skb) view).setChecked(this.u2.e);
                }
            } else if (i == this.botPermissionEmojiStatus) {
                skb skbVar = (skb) view;
                skbVar.setChecked(!skbVar.d());
                if (this.r4 > 0) {
                    getConnectionsManager().cancelRequest(this.r4, true);
                }
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                toggleuseremojistatuspermission.bot = getMessagesController().o1(this.e1);
                boolean d = skbVar.d();
                toggleuseremojistatuspermission.enabled = d;
                TLRPC.UserFull userFull2 = this.w2;
                if (userFull2 != null) {
                    userFull2.bot_can_manage_emoji_status = d;
                }
                int sendRequest = getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new pl7(this, r0, (byte) 13));
                this.r4 = sendRequest;
                int[] iArr = {sendRequest};
            } else if (i == this.P3) {
                this.R4 = !this.R4;
                j3();
                view.requestLayout();
                this.d.g(this.P3);
                int i3 = this.r6;
                if (i3 >= 0) {
                    this.c.g1(i3, this.s6 - this.a.getPaddingTop());
                }
            } else if (i == this.Q3) {
                d3(false);
            } else if (i == this.R2) {
                if (this.w2 != null) {
                    Bundle bundle7 = new Bundle();
                    bundle7.putLong("chat_id", this.w2.personal_channel_id);
                    presentFragment(new zu1(bundle7));
                }
            } else if (i == this.V2) {
                ns8 ns8Var = this.G6;
                if ((ns8Var == null || !ns8Var.a()) && !S1(i, view)) {
                    clb clbVar = (clb) view;
                    if (clbVar.d.getDrawable() != null) {
                        X2(clbVar.getImageView());
                    }
                }
            } else if (i == this.I3) {
                R1(i, view);
            } else {
                g3(f, f2, i, view);
            }
        }
    }

    public final void y3(int i) {
        boolean z;
        SharedPreferences e1 = uc7.e1();
        if (!hl.O1()) {
            boolean z2 = false;
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            this.K1 = z;
            if (i != 0) {
                z2 = true;
            }
            this.L1 = z2;
            h4();
            if (e1.getBoolean("view_animations", true)) {
                this.J1 = i;
            } else if (i == 2) {
                this.n1 = true;
            }
        }
    }

    public final void z1() {
        org.telegram.ui.ActionBar.a aVar;
        int i;
        if (this.O != null && (aVar = this.actionBar) != null) {
            if (aVar.getOccupyStatusBar()) {
                i = hl.m;
            } else {
                i = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i;
            int[] iArr = eja.t2;
            int x = qu6.x(6.666f, eg0.f(currentActionBarHeight - org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()), currentActionBarHeight);
            int e = eg0.e(i) + currentActionBarHeight + x;
            this.a6 = e;
            this.O.i1(x, e, eg0.e(this.P6), this.P6 + this.N6);
            this.b6 = hl.L(44.0f) + currentActionBarHeight;
            U3();
            H1();
        }
    }

    public final void z2(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.z2(int):void");
    }

    public final void z3(TLRPC.UserFull userFull, ts8 ts8Var, ks8 ks8Var) {
        boolean z;
        this.w2 = userFull;
        jva jvaVar = this.T;
        if (jvaVar != null) {
            jvaVar.set(userFull.stars_rating);
        }
        lq8 lq8Var = this.v0;
        if (lq8Var != null) {
            lq8Var.setStories(this.w2.stories);
        }
        gu8 gu8Var = this.w0;
        if (gu8Var != null) {
            gu8Var.a();
        }
        iq8 iq8Var = this.f0;
        if (iq8Var != null) {
            iq8Var.setHasStories(N2());
        }
        gr8 gr8Var = this.O;
        if (gr8Var != null) {
            gr8Var.setUserInfo(this.w2);
        }
        ts8 ts8Var2 = this.x2;
        if (ts8Var2 == null) {
            this.x2 = ts8Var;
        } else {
            ts8Var = ts8Var2;
        }
        if (ts8Var == null) {
            ts8Var = new ts8(this.currentAccount);
            this.x2 = ts8Var;
        }
        y56 y56Var = new y56(this, (byte) 22);
        if (ts8Var.c) {
            y56Var.run();
        } else {
            ts8Var.h.add(y56Var);
        }
        this.x2.b(this.w2);
        ks8 ks8Var2 = this.z2;
        if (ks8Var2 == null) {
            this.z2 = ks8Var;
        } else {
            ks8Var = ks8Var2;
        }
        boolean z2 = true;
        if (ks8Var == null) {
            ks8Var = ks8.c(this.currentAccount, this.w2, ks8Var);
            this.z2 = ks8Var;
            if (ks8Var != null) {
                z = true;
            } else {
                z = false;
            }
            this.y2 = z;
        }
        if (ks8Var != null) {
            y56 y56Var2 = new y56(this, (byte) 18);
            if (ks8Var.b) {
                y56Var2.run();
            } else {
                ks8Var.h.add(y56Var2);
            }
        }
        sla slaVar = this.T0;
        if (slaVar != null) {
            TL_account.RequirementToContact P2 = getMessagesController().P2(this.e1);
            if (P2 != null && !(P2 instanceof TL_account.requirementToContactEmpty)) {
                z2 = false;
            }
            slaVar.Q(20, z2);
            boolean o2 = o2();
            sla slaVar2 = this.T0;
            if (o2) {
                slaVar2.S(44);
            } else {
                slaVar2.u(44);
            }
        }
    }

    @Override
    public final void F() {
    }

    @Override
    public final void T() {
    }

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }
}

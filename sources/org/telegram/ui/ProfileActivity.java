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
import android.widget.Chronometer;
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
import org.telegram.tgnet.tl.TL_agent;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ProfileActivity;
public class ProfileActivity extends org.telegram.ui.ActionBar.d implements jm7, hk3, gha, vn5, cga, aj6 {
    public static final RectF e7 = new RectF();
    public static final int f7 = gm.L(16.0f);
    public ylb A0;
    public boolean A1;
    public String A2;
    public int A3;
    public int A4;
    public boolean A5;
    public s09 A6;
    public byte B0;
    public boolean B1;
    public long B2;
    public int B3;
    public int B4;
    public boolean B5;
    public final int[] B6;
    public gn5 C0;
    public vh6 C1;
    public int C2;
    public int C3;
    public int C4;
    public ImageReceiver C5;
    public float C6;
    public int D0;
    public boolean D1;
    public ArrayList D2;
    public int D3;
    public int D4;
    public FrameLayout D5;
    public CharSequence D6;
    public Drawable E;
    public int E0;
    public long E1;
    public TLRPC.EncryptedChat E2;
    public int E3;
    public int E4;
    public FrameLayout[] E5;
    public CharSequence E6;
    public Long F;
    public int F0;
    public float F1;
    public TLRPC.Chat F2;
    public int F3;
    public int F4;
    public SpannableStringBuilder F5;
    public boolean F6;
    public tm G;
    public boolean G0;
    public boolean G1;
    public TL_bots.BotInfo G2;
    public int G3;
    public int G4;
    public SpannableStringBuilder G5;
    public float G6;
    public tm H;
    public boolean H0;
    public boolean H1;
    public TLRPC.ChannelParticipant H2;
    public int H3;
    public int H4;
    public b61[] H5;
    public float H6;
    public Drawable I;
    public boolean I0;
    public boolean I1;
    public TL_account.TL_password I2;
    public int I3;
    public int I4;
    public i71 I5;
    public float I6;
    public x43 J;
    public boolean J0;
    public byte J1;
    public TLRPC.FileLocation J2;
    public int J3;
    public int J4;
    public FrameLayout J5;
    public float J6;
    public x43 K;
    public final boolean[] K0;
    public boolean K1;
    public TLRPC.FileLocation K2;
    public int K3;
    public int K4;
    public b61 K5;
    public vq8 K6;
    public hs9 L;
    public boolean L0;
    public boolean L1;
    public gn5 L2;
    public int L3;
    public int L4;
    public float L5;
    public cr8 L6;
    public UndoView M;
    public boolean M0;
    public boolean M1;
    public final Rect M2;
    public int M3;
    public int M4;
    public View M5;
    public hg5 M6;
    public mq8 N;
    public boolean N0;
    public boolean N1;
    public xib N2;
    public int N3;
    public int N4;
    public int N5;
    public int N6;
    public wp8 O;
    public boolean O0;
    public boolean O1;
    public int O2;
    public int O3;
    public int O4;
    public int O5;
    public Boolean O6;
    public a1b P;
    public ImageView P0;
    public boolean P1;
    public int P2;
    public int P3;
    public int P4;
    public int P5;
    public TLRPC.TL_emojiStatusCollectible P6;
    public boolean Q;
    public zja Q0;
    public float Q1;
    public int Q2;
    public int Q3;
    public boolean Q4;
    public int Q5;
    public int Q6;
    public fha R;
    public zja R0;
    public float R1;
    public int R2;
    public int R3;
    public boolean R4;
    public nm0 R5;
    public boolean R6;
    public boolean S;
    public zja S0;
    public float S1;
    public int S2;
    public int S3;
    public int S4;
    public final lj4 S5;
    public int S6;
    public ita T;
    public zja T0;
    public float T1;
    public int T2;
    public int T3;
    public int T4;
    public fr8 T5;
    public int T6;
    public sb U;
    public zja U0;
    public int U1;
    public int U2;
    public int U3;
    public int U4;
    public float U5;
    public int U6;
    public p09 V;
    public a8 V0;
    public float V1;
    public int V2;
    public int V3;
    public int V4;
    public int V5;
    public final jz4 V6;
    public p09 W;
    public a8 W0;
    public ValueAnimator W1;
    public int W2;
    public int W3;
    public boolean W4;
    public float W5;
    public final km0 W6;
    public hg5 X;
    public a8 X0;
    public boolean X1;
    public int X2;
    public int X3;
    public boolean X4;
    public final fn0 X5;
    public dh0 X6;
    public ne6 Y;
    public ImageView Y0;
    public s34 Y1;
    public int Y2;
    public int Y3;
    public int Y4;
    public gp8 Y5;
    public final Paint Y6;
    public su Z;
    public a8 Z0;
    public final HashMap Z1;
    public int Z2;
    public int Z3;
    public final ArrayList Z4;
    public AnimatorSet Z5;
    public Drawable Z6;
    public po8 a;
    public qn8 a0;
    public trc a1;
    public float a2;
    public int a3;
    public int a4;
    public final ArrayList a5;
    public AnimatorSet a6;
    public Drawable a7;
    public r59 b;
    public jc7 b0;
    public float b1;
    public float b2;
    public int b3;
    public int b4;
    public byte b5;
    public float b6;
    public Drawable b7;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public ro8 c;
    public mt8 c0;
    public int c1;
    public float c2;
    public int c3;
    public int c4;
    public boolean c5;
    public boolean c6;
    public pn2 c7;
    public lq8 d;
    public yq8 d0;
    public xq8 d1;
    public float d2;
    public int d3;
    public int d4;
    public boolean d5;
    public final ep8 d6;
    public final int[] d7;
    public uq8 e;
    public yn e0;
    public long e1;
    public float e2;
    public int e3;
    public int e4;
    public dp8 e5;
    public View e6;
    public mt1 f;
    public yo8 f0;
    public long f1;
    public float f2;
    public int f3;
    public int f4;
    public View f5;
    public int f6;
    public AnimatorSet g0;
    public long g1;
    public float g2;
    public int g3;
    public int g4;
    public float g5;
    public int g6;
    public String h;
    public sb5 h0;
    public boolean h1;
    public float h2;
    public int h3;
    public int h4;
    public int h5;
    public CharSequence h6;
    public ImageView i0;
    public long i1;
    public float i2;
    public int i3;
    public int i4;
    public int i5;
    public boolean i6;
    public ImageView j0;
    public boolean j1;
    public float j2;
    public int j3;
    public int j4;
    public int j5;
    public final cp8 j6;
    public ImageView k0;
    public boolean k1;
    public ValueAnimator k2;
    public int k3;
    public int k4;
    public long k5;
    public float[] k6;
    public ImageView l0;
    public boolean l1;
    public float l2;
    public int l3;
    public int l4;
    public boolean l5;
    public float l6;
    public sqb m0;
    public long m1;
    public float m2;
    public int m3;
    public int m4;
    public boolean m5;
    public float m6;
    public String n;
    public lr8 n0;
    public boolean n1;
    public final float[] n2;
    public int n3;
    public int n4;
    public String n5;
    public boolean n6;
    public zo8 o0;
    public boolean o1;
    public boolean o2;
    public int o3;
    public int o4;
    public String o5;
    public fq8 o6;
    public nq8 p0;
    public boolean p1;
    public boolean p2;
    public int p3;
    public int p4;
    public String p5;
    public float p6;
    public pc0 q0;
    public boolean q1;
    public boolean q2;
    public int q3;
    public int q4;
    public nk3 q5;
    public final RectF q6;
    public ap8 r;
    public wn5 r0;
    public boolean r1;
    public final Paint r2;
    public int r3;
    public int r4;
    public f02 r5;
    public float r6;
    public s09 s;
    public int s0;
    public boolean s1;
    public boolean s2;
    public int s3;
    public int s4;
    public final HashSet s5;
    public ec7 s6;
    public sqb t0;
    public boolean t1;
    public tr0 t2;
    public int t3;
    public int t4;
    public dq8 t5;
    public final SparseIntArray t6;
    public bt8 u0;
    public int u1;
    public up0 u2;
    public int u3;
    public int u4;
    public final ep8 u5;
    public int u6;
    public bp8 v0;
    public boolean v1;
    public TLRPC.ChatFull v2;
    public int v3;
    public int v4;
    public final kp8 v5;
    public AnimatorSet v6;
    public AnimatorSet w;
    public xs8 w0;
    public boolean w1;
    public TLRPC.UserFull w2;
    public int w3;
    public int w4;
    public boolean w5;
    public int w6;
    public Drawable x;
    public View x0;
    public boolean x1;
    public ir8 x2;
    public int x3;
    public int x4;
    public up8 x5;
    public int x6;
    public Drawable y;
    public final xo8 y0;
    public int y1;
    public boolean y2;
    public int y3;
    public int y4;
    public float y5;
    public boolean y6;
    public final Paint z0;
    public boolean z1;
    public zq8 z2;
    public int z3;
    public int z4;
    public float z5;
    public boolean z6;

    public ProfileActivity(Bundle bundle, fha fhaVar) {
        super(bundle);
        this.h = null;
        this.n = null;
        this.x0 = null;
        this.y0 = new xo8(this, (byte) 0);
        this.z0 = new Paint(1);
        this.K0 = new boolean[1];
        this.b1 = 1.0f;
        this.C1 = new vh6();
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
        this.Z4 = new ArrayList();
        this.a5 = new ArrayList();
        this.b5 = (byte) 0;
        this.c5 = true;
        this.d5 = true;
        this.h5 = 0;
        this.i5 = 0;
        this.j5 = 0;
        this.k5 = 0L;
        this.s5 = new HashSet();
        this.u5 = new ep8(this, (byte) 0);
        this.v5 = new kp8(this);
        this.S5 = new lj4(this);
        this.W5 = 1.0f;
        this.X5 = new fn0(0, new tn8(this, (byte) 7), d53.h, 380L, true);
        this.d6 = new ep8(this, (byte) 1);
        this.j6 = new cp8(this, (byte) 2);
        this.k6 = null;
        this.q6 = new RectF();
        this.t6 = new SparseIntArray();
        this.v6 = null;
        this.w6 = -1;
        this.B6 = new int[3];
        this.C6 = -1.0f;
        jz4 jz4Var = new jz4();
        this.V6 = jz4Var;
        km0 km0Var = new km0(jz4Var, jz4Var, jz4Var);
        this.W6 = km0Var;
        this.Y6 = new Paint();
        this.d7 = new int[7];
        this.R = fhaVar;
        km0Var.g = new g79(0, false);
    }

    public static void G1(View view, Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        if (view != null && view.getVisibility() == 0 && view.getAlpha() > 0.0f) {
            RectF rectF2 = e7;
            if (zgc.c(view, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                tl0.b(new ms0(view, (byte) 7), canvas, rectF, view, viewGroup, (int) (view.getAlpha() * 255.0f));
            }
        }
    }

    public static void O2(String str, StringBuilder sb) {
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

    public static SpannableStringBuilder Q1(String str, int i, ylb ylbVar) {
        int v0 = cmb.v0(i, ylbVar);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        of4 of4Var = new of4(9);
        of4Var.w = str;
        if (of4Var.c != null) {
            of4Var.c = null;
            of4Var.a();
        }
        of4Var.f = v0;
        of4Var.n = false;
        spannableStringBuilder.setSpan(of4Var, 0, spannableStringBuilder.length(), 0);
        of4[] of4VarArr = (of4[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), of4.class);
        if (of4VarArr != null) {
            for (of4 of4Var2 : of4VarArr) {
                of4Var2.getClass();
                of4Var2.f = cmb.v0(i, ylbVar);
                of4Var2.r = i;
                of4Var2.s = ylbVar;
                of4Var2.n = true;
            }
        }
        return spannableStringBuilder;
    }

    public static ProfileActivity S2(long j) {
        Bundle bundle = new Bundle();
        if (j >= 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        return new ProfileActivity(bundle, null);
    }

    public static int b0(ProfileActivity profileActivity) {
        return profileActivity.currentAccount;
    }

    public static void p3(Activity activity, boolean z) {
        if (activity == null) {
            return;
        }
        he heVar = new he(3, null, activity);
        heVar.j0 = false;
        heVar.show();
        Utilities.e.c(new yl6(heVar, z, activity, (byte) 17));
    }

    public static void s3(FrameLayout frameLayout, float f) {
        int i;
        frameLayout.animate().cancel();
        frameLayout.setTranslationY(f7 * f);
        frameLayout.setAlpha(1.0f - f);
        if (f < 1.0f) {
            i = 0;
        } else {
            i = 4;
        }
        frameLayout.setVisibility(i);
    }

    public static void x3(int i, View view) {
        if (view != null && view.getLayoutParams() != null && view.getLayoutParams().height != i) {
            view.getLayoutParams().height = i;
            if (view.isLaidOut()) {
                view.setBottom(view.getTop() + i);
            } else {
                view.requestLayout();
            }
        }
    }

    public static void y3(zja zjaVar, boolean z, boolean z2) {
        int i;
        if (wi8.A(zjaVar)) {
            zjaVar.Y(z, z2);
        } else if (zjaVar != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            zjaVar.setVisibility(i);
        }
    }

    public final void A1() {
        org.telegram.ui.ActionBar.a aVar;
        int i;
        if (this.O != null && (aVar = this.actionBar) != null) {
            if (aVar.getOccupyStatusBar()) {
                i = gm.m;
            } else {
                i = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i;
            int[] iArr = nha.t2;
            int y = kt6.y(6.666f, eh0.d(currentActionBarHeight - org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()), currentActionBarHeight);
            int c = eh0.c(i) + currentActionBarHeight + y;
            this.f6 = c;
            this.O.i1(y, c, eh0.c(this.U6), this.U6 + this.S6);
            this.g6 = gm.L(44.0f) + currentActionBarHeight;
            X3();
            I1();
        }
    }

    public final void A2(Context context, long j, View view, int i, float f, float f2) {
        TLRPC.User W1;
        TLRPC.ChatParticipant chatParticipant;
        int L;
        int L2;
        lq8 lq8Var;
        if (getParentActivity() != null) {
            this.a.D0();
            if (i >= this.n4 && i < this.o4) {
                mc B0 = getMessagesController().B0();
                int i2 = i - this.n4;
                TL_agent.settings settingsVar = B0.d;
                if (settingsVar != null && i2 < settingsVar.keys.size()) {
                    String str = B0.d.keys.get(i2).provider;
                    if (!TextUtils.equals(str, B0.d.active_provider)) {
                        TL_agent.settings settingsVar2 = B0.d;
                        if (settingsVar2 != null) {
                            settingsVar2.active_provider = str;
                            B0.i();
                        }
                        TL_agent.setActiveProvider setactiveprovider = new TL_agent.setActiveProvider();
                        setactiveprovider.provider = str;
                        ConnectionsManager.getInstance(B0.a).sendRequestTyped(setactiveprovider, new kc((byte) 0), new lc(B0, (byte) 2));
                    }
                }
            } else if (i == this.p4) {
                c3();
            } else if (i == this.T3) {
                TLRPC.User W12 = getMessagesController().W1(Long.valueOf(this.e1));
                TLRPC.UserFull userFull = this.w2;
                if (userFull != null && userFull.starref_program != null) {
                    long e = getUserConfig().e();
                    ku0.g(this.currentAccount).f(getParentActivity(), e, this.e1, new p2c(this, context, e, (byte) 7));
                } else if (W12 != null && W12.bot_can_edit) {
                    presentFragment(new bc(this.e1));
                }
            } else if (i == this.R3) {
                boolean z = !getMessagesController().o2(j, this.g1, null);
                getNotificationsController().G(j, this.g1, z);
                c41.A(this, z, null).j();
                S3();
                int i3 = this.R3;
                if (i3 >= 0 && (lq8Var = this.d) != null) {
                    lq8Var.g(i3);
                }
            } else if (i == this.a4) {
                TLRPC.User W13 = getMessagesController().W1(Long.valueOf(this.e1));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", W13.id);
                bundle.putBoolean("addContact", true);
                bundle.putString("phone", this.n5);
                bundle.putString("first_name_card", this.o5);
                bundle.putString("last_name_card", this.p5);
                tu2 tu2Var = new tu2(bundle, this.A0);
                tu2Var.P = new wn8(this, W13);
                presentFragment(tu2Var);
            } else if (i == this.X3) {
                TextView textView = (TextView) ik.f0(getParentActivity(), jb6.M0(2131751445, null), jb6.M0(2131751529, null), jb6.M0(2131751528, null), jb6.M0(2131751535, null), new ao8(this, (byte) 2), this.A0, false).c(-1);
                if (textView != null) {
                    anb.X(textView, cmb.p7, null);
                }
            } else if (i == this.Y3) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.A0, getParentActivity());
                String M0 = jb6.M0(2131745944, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131745965, null);
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-this.k5));
                oh2[] oh2VarArr = new oh2[1];
                if (L0 != null && sd2.w(2, L0)) {
                    LinearLayout linearLayout = new LinearLayout(getParentActivity());
                    linearLayout.setOrientation(1);
                    oh2 oh2Var = new oh2(1, this.A0, getParentActivity());
                    oh2VarArr[0] = oh2Var;
                    oh2Var.setBackgroundDrawable(cmb.L0(false));
                    oh2VarArr[0].e(jb6.M0(2131753692, null), "", true, false, false);
                    oh2 oh2Var2 = oh2VarArr[0];
                    if (jb6.a0) {
                        L = gm.L(16.0f);
                    } else {
                        L = gm.L(8.0f);
                    }
                    if (jb6.a0) {
                        L2 = gm.L(8.0f);
                    } else {
                        L2 = gm.L(16.0f);
                    }
                    oh2Var2.setPadding(L, 0, L2, 0);
                    linearLayout.addView(oh2VarArr[0], qoe.o(-1, -2));
                    oh2VarArr[0].setOnClickListener(new ye(oh2VarArr, (byte) 4));
                    alertDialog$Builder.n(linearLayout);
                }
                alertDialog$Builder.j(jb6.M0(2131745963, null), new cz6(this, oh2VarArr, (byte) 28));
                alertDialog$Builder.g(jb6.M0(2131752542, null), new i98((byte) 4));
                TextView textView2 = (TextView) alertDialog$Builder.o().c(-1);
                if (textView2 != null) {
                    anb.X(textView2, cmb.p7, null);
                }
            } else if (i == this.z4) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("chat_id", (int) (this.i1 & 4294967295L));
                presentFragment(new org.telegram.ui.ActionBar.d(bundle2));
            } else if (i == this.y4) {
                showDialog(ik.S(getParentActivity(), this.E2, this.A0).a);
            } else if (i == this.O3) {
                X2(view, f, f2, false);
            } else if (i == this.T4) {
                getMessagesController().n5(null, this.e1);
                if (c41.a(this)) {
                    c41.d(this, false).j();
                }
            } else if (i == this.b4) {
                kr0.a(this, this.currentAccount, getMessagesController().W1(Long.valueOf(this.e1)));
            } else if (i == this.d4) {
                try {
                    this.actionBar.getActionBarMenuOnItemClick().b(9);
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
            } else if (i == this.V3) {
                a3();
            } else if (i == this.W3) {
                da9.F0(a(), this);
            } else if (i >= this.C4 && i < this.D4) {
                boolean isEmpty = this.D2.isEmpty();
                TLRPC.ChatFull chatFull = this.v2;
                if (!isEmpty) {
                    chatParticipant = chatFull.participants.participants.get(((Integer) this.D2.get(i - this.C4)).intValue());
                } else {
                    chatParticipant = chatFull.participants.participants.get(i - this.C4);
                }
                g(chatParticipant, false, false, view);
            } else if (i == this.E4) {
                b3();
            } else if (i == this.M3) {
                j3(f, f2, i, view);
            } else if (i == this.t4) {
                if (this.F2 != null) {
                    showDialog(new pp2(this, this.F2.linked_community_id, null, null));
                } else if (this.e1 != 0 && (W1 = getMessagesController().W1(Long.valueOf(this.e1))) != null) {
                    showDialog(new pp2(this, W1.linked_community_id, null, null));
                }
            } else if (i == this.J3) {
                if (this.v2.location instanceof TLRPC.TL_channelLocation) {
                    pc6 pc6Var = new pc6(5);
                    pc6Var.m0 = -this.f1;
                    pc6Var.H0 = (TLRPC.TL_channelLocation) this.v2.location;
                    presentFragment(pc6Var);
                }
            } else if (i == this.U4) {
                W2(false);
            } else if (i == this.F4) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("chat_id", this.f1);
                bundle3.putInt("type", 2);
                wg2 wg2Var = new wg2(bundle3);
                wg2Var.B0(this.v2);
                presentFragment(wg2Var);
            } else if (i == this.G4) {
                presentFragment(new qv0(this.f1));
            } else if (i == this.H4) {
                Bundle bundle4 = new Bundle();
                bundle4.putLong("chat_id", this.f1);
                bundle4.putInt("type", 1);
                wg2 wg2Var2 = new wg2(bundle4);
                wg2Var2.B0(this.v2);
                presentFragment(wg2Var2);
            } else if (i == this.I4) {
                this.S0.performClick();
            } else if (i == this.J4) {
                presentFragment(new au0(0, this.e1));
            } else if (i == this.K4) {
                presentFragment(new au0(1, this.e1));
            } else if (i == this.L4) {
                Bundle bundle5 = new Bundle();
                bundle5.putLong("chat_id", this.f1);
                bundle5.putBoolean("start_from_monetization", true);
                presentFragment(new xza(bundle5));
            } else if (i == this.O4) {
                Bundle bundle6 = new Bundle();
                bundle6.putLong("chat_id", this.f1);
                bundle6.putInt("type", 0);
                wg2 wg2Var3 = new wg2(bundle6);
                wg2Var3.B0(this.v2);
                presentFragment(wg2Var3);
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
                presentFragment(new m86());
            } else if (i == this.o3) {
                presentFragment(new SessionsActivity(0));
            } else if (i == this.r3) {
                showDialog(ik.R(this, this.A0));
            } else if (i == this.s3) {
                l11.u(getParentActivity(), jb6.M0(2131743925, null));
            } else if (i == this.t3) {
                l11.u(getParentActivity(), jb6.M0(2131746516, null));
            } else if (i == this.w3) {
                p3(getParentActivity(), false);
            } else if (i == this.x3) {
                p3(getParentActivity(), true);
            } else if (i == this.y3) {
                fc4.a();
            } else if (i == this.z3) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, this.A0, getParentActivity());
                    String M02 = jb6.M0(2131754085, null);
                    he heVar2 = alertDialog$Builder2.a;
                    heVar2.U = M02;
                    heVar2.S = jb6.M0(2131689472, null);
                    alertDialog$Builder2.j(jb6.M0(2131747564, null), new tn8(this, (byte) 9));
                    alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                    showDialog(heVar2);
                }
            } else if (i == this.h3) {
                presentFragment(new LanguageSelectActivity());
            } else if (i == this.W2) {
                presentFragment(new uf1(null));
            } else if (i == this.X2) {
                presentFragment(new UserInfoActivity());
            } else if (i == this.U2) {
                presentFragment(new u8(3));
            } else if (i == this.P2) {
                a3();
            } else if (i == this.f4) {
                presentFragment(new PremiumPreviewFragment(0, "settings"));
            } else if (i == this.g4) {
                presentFragment(new nxa());
            } else if (i == this.h4) {
                presentFragment(new yfb());
            } else if (i == this.i4) {
                presentFragment(new PremiumPreviewFragment(1, "settings"));
            } else if (i == this.j4) {
                yw4.f1(false, ok0.a(this.currentAccount).b());
            } else if (i == this.botPermissionLocation) {
                tr0 tr0Var = this.t2;
                if (tr0Var != null) {
                    tr0Var.k(!tr0Var.f(), new mn8(this, view, (byte) 9));
                }
            } else if (i == this.botPermissionBiometry) {
                up0 up0Var = this.u2;
                if (up0Var != null) {
                    up0Var.f = true;
                    up0Var.e = !up0Var.e;
                    up0Var.i();
                    ((xib) view).setChecked(this.u2.e);
                }
            } else if (i == this.botPermissionEmojiStatus) {
                xib xibVar = (xib) view;
                xibVar.setChecked(!xibVar.d());
                if (this.w4 > 0) {
                    getConnectionsManager().cancelRequest(this.w4, true);
                }
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                toggleuseremojistatuspermission.bot = getMessagesController().n1(this.e1);
                boolean d = xibVar.d();
                toggleuseremojistatuspermission.enabled = d;
                TLRPC.UserFull userFull2 = this.w2;
                if (userFull2 != null) {
                    userFull2.bot_can_manage_emoji_status = d;
                }
                int sendRequest = getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new jl7(this, r1, (byte) 12));
                this.w4 = sendRequest;
                int[] iArr = {sendRequest};
            } else if (i == this.P3) {
                this.W4 = !this.W4;
                m3();
                view.requestLayout();
                this.d.g(this.P3);
                int i4 = this.w6;
                if (i4 >= 0) {
                    this.c.g1(i4, this.x6 - this.a.getPaddingTop());
                }
            } else if (i == this.Q3) {
                g3(false);
            } else if (i == this.R2) {
                if (this.w2 != null) {
                    Bundle bundle7 = new Bundle();
                    bundle7.putLong("chat_id", this.w2.personal_channel_id);
                    presentFragment(new yv1(bundle7));
                }
            } else if (i == this.V2) {
                cr8 cr8Var = this.L6;
                if ((cr8Var == null || !cr8Var.a()) && !T1(i, view)) {
                    hjb hjbVar = (hjb) view;
                    if (hjbVar.d.getDrawable() != null) {
                        Z2(hjbVar.getImageView());
                    }
                }
            } else if (i == this.I3) {
                S1(i, view);
            } else {
                j3(f, f2, i, view);
            }
        }
    }

    public final void A3(CharSequence charSequence) {
        this.h6 = charSequence;
        g4();
    }

    public final int B1(int i, Boolean bool) {
        int i2;
        if (this.s6 != null) {
            int v0 = cmb.v0(cmb.r8, this.A0);
            int f = on2.f(0.5f, this.s6.m(cmb.I.o()), this.s6.n(cmb.I.o()));
            if (!cmb.c1(v0)) {
                if (bool != null && !bool.booleanValue()) {
                    return cmb.a(-0.2f, 0.2f, cmb.p1(0.7f, f));
                }
                return f;
            }
            boolean o = cmb.I.o();
            if (bool != null && !bool.booleanValue()) {
                i2 = cmb.p1(0.7f, f);
            } else {
                i2 = f;
            }
            return cmb.C(o, v0, f, i, i2);
        }
        return i;
    }

    public final void B2(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.B2(int):void");
    }

    public final void B3(int i) {
        boolean z;
        SharedPreferences d1 = oc7.d1();
        if (!gm.O1()) {
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
            k4();
            if (d1.getBoolean("view_animations", true)) {
                this.J1 = i;
            } else if (i == 2) {
                this.n1 = true;
            }
        }
    }

    public final void C1() {
        int f;
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null && this.f != null && this.d1 != null && this.T0 != null && this.Q0 != null && this.R0 != null && this.S0 != null && this.p0 != null) {
            Float valueOf = Float.valueOf(this.b6);
            ep8 ep8Var = this.d6;
            ep8Var.getClass();
            ep8Var.a(aVar, valueOf);
            if (this.b6 <= 0.0f && this.l2 > 0.0f) {
                mt1 mt1Var = this.f;
                int i = -1;
                if (this.s6 != null) {
                    f = -1;
                } else {
                    f = on2.f(this.l2, cmb.v0(cmb.li, this.A0), -1);
                }
                mt1Var.setTextColor(f);
                org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
                if (this.s6 == null) {
                    i = on2.f(this.l2, cmb.v0(cmb.u8, this.A0), -1);
                }
                aVar2.H(i, false);
            }
        }
    }

    public final void C2() {
        TLRPC.Document e;
        u31 h;
        if (this.K2 == null) {
            int i = 0;
            if (this.q1 && !getMessagesController().H3()) {
                ArrayList l = getMessagesController().g4.l(this.f1);
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
                    if (j != 0 && (e = vm.e(this.currentAccount, j)) != null && (h = c41.b0(this).h(e, 1, new ao8(this, (byte) 3))) != null) {
                        h.j();
                    }
                }
            } else if (U1()) {
            } else {
                d3(false);
            }
        }
    }

    public final void C3(TLRPC.UserFull userFull, ir8 ir8Var, zq8 zq8Var) {
        boolean z;
        this.w2 = userFull;
        ita itaVar = this.T;
        if (itaVar != null) {
            itaVar.set(userFull.stars_rating);
        }
        bp8 bp8Var = this.v0;
        if (bp8Var != null) {
            bp8Var.setStories(this.w2.stories);
        }
        xs8 xs8Var = this.w0;
        if (xs8Var != null) {
            xs8Var.a();
        }
        yo8 yo8Var = this.f0;
        if (yo8Var != null) {
            yo8Var.setHasStories(P2());
        }
        wp8 wp8Var = this.O;
        if (wp8Var != null) {
            wp8Var.setUserInfo(this.w2);
        }
        ir8 ir8Var2 = this.x2;
        if (ir8Var2 == null) {
            this.x2 = ir8Var;
        } else {
            ir8Var = ir8Var2;
        }
        if (ir8Var == null) {
            ir8Var = new ir8(this.currentAccount);
            this.x2 = ir8Var;
        }
        v56 v56Var = new v56(this, (byte) 24);
        if (ir8Var.c) {
            v56Var.run();
        } else {
            ir8Var.h.add(v56Var);
        }
        this.x2.b(this.w2);
        zq8 zq8Var2 = this.z2;
        if (zq8Var2 == null) {
            this.z2 = zq8Var;
        } else {
            zq8Var = zq8Var2;
        }
        boolean z2 = true;
        if (zq8Var == null) {
            zq8Var = zq8.c(this.currentAccount, this.w2, zq8Var);
            this.z2 = zq8Var;
            if (zq8Var != null) {
                z = true;
            } else {
                z = false;
            }
            this.y2 = z;
        }
        if (zq8Var != null) {
            v56 v56Var2 = new v56(this, (byte) 19);
            if (zq8Var.b) {
                v56Var2.run();
            } else {
                zq8Var.h.add(v56Var2);
            }
        }
        zja zjaVar = this.T0;
        if (zjaVar != null) {
            TL_account.RequirementToContact L2 = getMessagesController().L2(this.e1);
            if (L2 != null && !(L2 instanceof TL_account.requirementToContactEmpty)) {
                z2 = false;
            }
            zjaVar.Q(20, z2);
            boolean p2 = p2();
            zja zjaVar2 = this.T0;
            if (p2) {
                zjaVar2.S(44);
            } else {
                zjaVar2.u(44);
            }
        }
    }

    public final void D1() {
        int i;
        int i2;
        if (this.k6 != null) {
            ValueAnimator valueAnimator = this.k2;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.k2.cancel();
            }
            float l = Utilities.l(this.Q1 / this.F1);
            if (l > 0.0f) {
                float f = (l - 0.5f) / 0.5f;
                int i3 = 0;
                if (this.actionBar.getOccupyStatusBar()) {
                    i = gm.m;
                } else {
                    i = 0;
                }
                float translationY = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f) + i) - gm.L(21.0f));
                this.c2 = gm.R1(0.42f, this.k6[0], l);
                this.a2 = gm.R1(this.p6, this.k6[1], l);
                this.b2 = gm.R1(translationY, this.k6[2], l);
                this.d2 = gm.R1(this.k6[11], 0.0f, l);
                this.Y.setScaleX(this.c2);
                this.Y.setScaleY(this.c2);
                this.Y.setTranslationX(this.a2);
                this.Y.setTranslationY(this.b2);
                ita itaVar = this.T;
                if (itaVar != null) {
                    itaVar.setAlpha(l);
                }
                this.f0.setAlpha(1.0f);
                this.Y.setAlpha(1.0f);
                bp8 bp8Var = this.v0;
                if (bp8Var != null) {
                    bp8Var.invalidate();
                }
                xs8 xs8Var = this.w0;
                if (xs8Var != null) {
                    xs8Var.e = gm.R1(0.0f, this.k6[4], f);
                    this.w0.f = gm.R1(0.0f, this.k6[5], l);
                    xs8 xs8Var2 = this.w0;
                    xs8Var2.h = true;
                    xs8Var2.invalidate();
                }
                vq8 vq8Var = this.K6;
                if (vq8Var != null) {
                    vq8Var.setAlpha((int) gm.R1(0.0f, this.k6[6], l));
                }
                float L = (((this.c2 * 100.0f) / 42.0f) * gm.L(42.0f)) - gm.L(42.0f);
                this.i0.setTranslationX(this.Y.getX() + gm.L(16.0f) + L);
                this.i0.setTranslationY(this.Y.getY() + gm.L(-10.0f) + L);
                this.j0.setTranslationX(this.Y.getX() + gm.L(28.0f) + L);
                this.j0.setTranslationY(this.Y.getY() + gm.L(26.5f) + L);
                this.k0.setTranslationX(this.Y.getX() + gm.L(28.0f) + L);
                this.k0.setTranslationY(this.Y.getY() + gm.L(24.0f) + L);
                this.l0.setTranslationX(this.Y.getX() + gm.L(28.0f) + L);
                this.l0.setTranslationY(this.Y.getY() + gm.L(24.0f) + L);
                float R1 = gm.R1(k2(0), this.k6[7], l);
                if (this.actionBar.getOccupyStatusBar()) {
                    i2 = gm.m;
                } else {
                    i2 = 0;
                }
                float currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f;
                float floor = ((float) Math.floor(this.actionBar.getTranslationY() + ((currentActionBarHeight + i2) - (gm.p * 21.0f)))) + gm.L(1.3f);
                float N = gm.N(22.7f) + floor;
                this.f2 = gm.R1(floor, this.k6[8], l);
                this.h2 = gm.R1(N, this.k6[9], l);
                float L2 = (this.p6 - gm.L(109.0f)) + gm.L(48.0f);
                float R12 = gm.R1(l2(L2, 0, this.f), this.k6[12], l);
                float R13 = gm.R1(l2(L2 + this.z5, 1, this.r) - this.z5, this.k6[13], l);
                this.f.setTranslationX(R12);
                this.f.setTranslationY(this.f2);
                this.r.setTranslationX(this.z5 + R13);
                this.r.setTranslationY(this.h2);
                this.e2 = R12;
                this.g2 = R13;
                this.f.setScaleX(R1);
                this.f.setScaleY(R1);
                float R14 = gm.R1(k2(1), 1.0f, l);
                this.r.setScaleX(R14);
                this.r.setScaleY(R14);
                N3();
                if (this.actionBar.getOccupyStatusBar()) {
                    i3 = gm.m;
                }
                T3(org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i3);
                R2((int) this.k6[10], l, true);
                qn8 qn8Var = this.a0;
                if (qn8Var != null) {
                    qn8Var.setAlpha(gm.R1(0.0f, this.k6[3], f));
                }
            }
        }
    }

    public final void D2(TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        boolean z;
        TLRPC.VideoSize x;
        if (tL_error == null) {
            TLRPC.User W1 = getMessagesController().W1(Long.valueOf(getUserConfig().e()));
            if (W1 == null) {
                W1 = getUserConfig().f();
                if (W1 == null) {
                    return;
                }
                getMessagesController().c4(W1, false, false);
            } else {
                getUserConfig().v(W1);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize w = bc4.w(arrayList, 150, false, null, false);
            TLRPC.PhotoSize w2 = bc4.w(arrayList, 800, false, null, false);
            if (tL_photos_photo.photo.video_sizes.isEmpty()) {
                x = null;
            } else {
                x = bc4.x(1000, tL_photos_photo.photo.video_sizes);
            }
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            W1.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
            if (w != null) {
                tL_userProfilePhoto.photo_small = w.location;
            }
            if (w2 != null) {
                tL_userProfilePhoto.photo_big = w2.location;
            }
            if (w != null && this.J2 != null) {
                bc4.G(this.currentAccount);
                File J = bc4.J(w, null, true, true);
                bc4.G(this.currentAccount);
                bc4.J(this.J2, null, true, true).renameTo(J);
                StringBuilder sb = new StringBuilder();
                sb.append(this.J2.volume_id);
                sb.append("_");
                String k = hg9.k(sb, this.J2.local_id, "@50_50");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(w.location.volume_id);
                sb2.append("_");
                fn5.z().O(k, hg9.k(sb2, w.location.local_id, "@50_50"), gn5.m(this.currentAccount, 1, W1));
            }
            if (x != null && str != null) {
                bc4.G(this.currentAccount);
                new File(str).renameTo(bc4.J(x, "mp4", true, true));
            } else if (w2 != null && this.K2 != null) {
                bc4.G(this.currentAccount);
                File J2 = bc4.J(w2, null, true, true);
                bc4.G(this.currentAccount);
                bc4.J(this.K2, null, true, true).renameTo(J2);
            }
            getMessagesController().T0(W1.id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(W1);
            getMessagesStorage().j1(arrayList2, null, false, true);
            TLRPC.UserFull X1 = getMessagesController().X1(this.e1);
            if (X1 != null) {
                X1.profile_photo = tL_photos_photo.photo;
                getMessagesStorage().g2(X1, false);
            }
        }
        if (!gm.O1() && !this.o2 && this.f0.getImageReceiver().E() && !gm.A1()) {
            z = true;
        } else {
            z = false;
        }
        this.p2 = z;
        this.J2 = null;
        this.K2 = null;
        zo8 zo8Var = this.o0;
        zo8Var.I0 = true;
        zo8Var.L0 = this.L2;
        zo8Var.r1 = null;
        zo8Var.s1 = null;
        zo8Var.setCreateThumbFromParent(false);
        h4(true);
        F3(false, true);
        getNotificationCenter().k(2, Integer.valueOf(oc7.s5));
        getNotificationCenter().k(nm7.j0, new Object[0]);
        getUserConfig().u(true);
    }

    public final void D3(View view, float f) {
        boolean z;
        int i;
        if (this.p2) {
            if (this.q2) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
                if (this.actionBar.getOccupyStatusBar()) {
                    i = gm.m;
                } else {
                    i = 0;
                }
                this.a.x0(0, ((view.getTop() - this.a.getMeasuredWidth()) - Y1()) + currentActionBarHeight + i, d53.h);
                return;
            }
            this.a.x0(0, view.getTop() - e2(), d53.h);
            return;
        }
        if (Y1() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            float f2 = this.Q1;
            if (f2 > 0.0f && ((f2 < e2() * 0.6f || f < -1000.0f) && this.Q1 > Y1() * 0.6f)) {
                this.a.x0(0, (int) (this.Q1 - Y1()), d53.h);
                return;
            }
        }
        if (z) {
            float f3 = this.Q1;
            if (f3 > 0.0f && f3 < Y1() * 0.6f) {
                this.a.x0(0, (int) this.Q1, d53.h);
                return;
            }
        }
        if (!z) {
            float f4 = this.Q1;
            if (f4 > 0.0f && f < -1000.0f) {
                this.a.x0(0, (int) f4, d53.h);
                return;
            }
        }
        if (this.Q1 > 0.0f) {
            this.a.x0(0, view.getTop() - e2(), d53.h);
        }
    }

    @Override
    public final boolean E() {
        return false;
    }

    public final float E1() {
        return Utilities.l((this.Q1 - Y1()) / f2());
    }

    public final void E2(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            this.J2 = fileLocation;
            this.K2 = photoSize2.location;
            this.f0.m(gn5.e(fileLocation), "50_50", this.q0, null);
            if (this.P2 != -1) {
                i4();
                lq8 lq8Var = this.d;
                if (lq8Var != null) {
                    lq8Var.f();
                }
                Q2(true);
            }
            zo8 zo8Var = this.o0;
            gn5 e = gn5.e(this.K2);
            this.L2 = e;
            zo8Var.A(e, gn5.e(this.J2));
            F3(true, false);
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
            this.u6 = getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new jl7(this, str, (byte) 11));
        }
        this.actionBar.t().requestLayout();
    }

    public final void E3() {
        eh0 baseSimpleGlass = getBaseSimpleGlass();
        fr8 fr8Var = new fr8(this.glassEngine, baseSimpleGlass);
        this.T5 = fr8Var;
        xq8 xq8Var = this.d1;
        if (xq8Var != null) {
            int i = xq8Var.I;
            boolean z = xq8Var.c;
            if (fr8Var.i != i || fr8Var.j != z) {
                fr8Var.i = i;
                fr8Var.j = z;
                fr8Var.a();
            }
        }
        this.T5.b(this.U5);
        qn8 qn8Var = this.a0;
        if (qn8Var != null) {
            qn8Var.setGlassFactory(this.T5.c);
        }
        mt8 mt8Var = this.c0;
        if (mt8Var != null) {
            mt8Var.setGlassFactory(this.T5.c);
        }
        this.simpleActionBar.setButtonsGlass(this.T5.d);
        this.simpleActionBar.setMenuGlassStroke(false);
        baseSimpleGlass.g(this.x5, this.simpleActionBar, this.A0);
        rja rjaVar = this.simpleActionBar;
        fr8 fr8Var2 = this.T5;
        km0 km0Var = fr8Var2.e;
        lz4 lz4Var = fr8Var2.f;
        rjaVar.p0 = km0Var;
        rjaVar.q0 = lz4Var;
        rjaVar.setBackground(null);
        this.R5 = qqd.l(this.A0);
        this.simpleActionBar.setButtonsGlassColorProvider(this.S5);
        Z3();
        baseSimpleGlass.o = this.X6;
        View view = new View(getParentActivity());
        this.e6 = view;
        view.setAlpha(0.0f);
        this.x5.getViewTreeObserver().addOnPreDrawListener(new cc(this, (byte) 6));
        this.O.e(this.e6);
        View view2 = this.e6;
        view2.setBackground(baseSimpleGlass.a(view2));
        View view3 = new View(getParentActivity());
        this.M5 = view3;
        view3.setBackground(baseSimpleGlass.a(view3));
        up8 up8Var = this.x5;
        up8Var.addView(this.M5, up8Var.indexOfChild(this.Z), qoe.e(-1, 0, 48));
        this.glassEngine.b(this.a);
        this.O.setPagesGlassEngine(this.glassEngine);
        this.O.setOnTopPanelShiftChanged(new v56(this, (byte) 23));
        A1();
        W3();
    }

    public final void F1() {
        int i;
        int i2 = 0;
        if (this.actionBar.getOccupyStatusBar()) {
            i = gm.m;
        } else {
            i = 0;
        }
        this.b2 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i) - gm.L(21.0f));
        this.c2 = 1.38f;
        float f = 0.0f;
        this.d2 = 0.0f;
        X1();
        k3();
        R2(0, 1.0f, true);
        this.e2 = (this.a.getMeasuredWidth() / 2.0f) - (((this.f.getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) this.f.getLayoutParams()).leftMargin);
        float measuredWidth = this.a.getMeasuredWidth() / 2.0f;
        int i3 = ((FrameLayout.LayoutParams) this.r.getLayoutParams()).leftMargin;
        if (!this.A5) {
            i2 = this.r.getPaddingLeft();
        }
        this.g2 = measuredWidth - ((this.r.getExactWidth() * 0.5f) + (i3 + i2));
        if (!this.A5) {
            f = this.r.getPaddingLeft();
        }
        this.H6 = f;
        if (this.J1 != 2) {
            this.v0.setAlpha(1.0f);
        }
        this.Y.setAlpha(1.0f);
        this.f0.setAlpha(1.0f);
    }

    public final void F2(TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            u31 Q = c41.b0(this).Q(2131623990, 36, jb6.M0(2131746591, null));
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
        getMessagesStorage().g2(userFull, false);
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, getParentActivity());
                String M0 = jb6.M0(2131746587, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131746588, null);
                alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                showDialog(heVar);
                return;
            }
            return;
        }
        ts2.u(null, 2131743566, c41.b0(this), 2131624012, 36);
    }

    public final void F3(boolean z, boolean z2) {
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
            sb5 sb5Var = this.h0;
            if (z) {
                sb5Var.setVisibility(0);
                this.g0.playTogether(ObjectAnimator.ofFloat(this.h0, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(sb5Var, View.ALPHA, 0.0f));
            }
            this.g0.setDuration(180L);
            this.g0.addListener(new mp8(this, z, (byte) 1));
            this.g0.start();
            return;
        }
        sb5 sb5Var2 = this.h0;
        if (z) {
            sb5Var2.setAlpha(1.0f);
            this.h0.setVisibility(0);
            return;
        }
        sb5Var2.setAlpha(0.0f);
        this.h0.setVisibility(4);
    }

    public final boolean G2(boolean[] zArr, boolean z, org.telegram.ui.ActionBar.d dVar, TLRPC.TL_error tL_error) {
        boolean z2;
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        oc7.r1(this.currentAccount).W3.edit().putLong("dialog_join_requested_time_" + this.i1, System.currentTimeMillis()).commit();
        Activity parentActivity = getParentActivity();
        if (sd2.T(this.F2) && !this.F2.megagroup) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i = ew5.t1;
        ew5.E0(parentActivity, this, c41.b0(this), z2);
        if (!z || this.U4 != -1) {
            i4();
            lq8 lq8Var = this.d;
            if (lq8Var != null) {
                lq8Var.f();
            }
        }
        if (dVar instanceof yv1) {
            ((yv1) dVar).Wb(false, true);
        }
        return false;
    }

    public final void G3() {
        boolean z;
        my0 my0Var;
        zx0 zx0Var;
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
            my0 i2 = wi8.i(getParentActivity(), false, 1, null);
            zx0 zx0Var2 = i2.y0;
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            final LimitPreviewView limitPreviewView = new LimitPreviewView(getParentActivity(), 2131231166, 0, 0, this.A0);
            if (a() != z8c.h(this.currentAccount).e()) {
                z = true;
            } else {
                z = false;
            }
            limitPreviewView.setHideNegativeValues(z);
            limitPreviewView.setStarRating(userFull.stars_rating);
            limitPreviewView.setTranslationY(-gm.L(14.0f));
            linearLayout.addView(limitPreviewView, qoe.t(-1, -2, 17, 0, 20, 0, 10));
            if (userFull.stars_my_pending_rating != null) {
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                linearLayout.addView(frameLayout, qoe.t(-1, -2, 17, 40, -12, 40, 20));
                int i3 = 2;
                l66[] l66VarArr = new l66[2];
                int i4 = 0;
                while (i4 < i3) {
                    int i5 = i3;
                    byte b4 = b3;
                    a31 a31Var = new a31(parentActivity, null, (byte) 6);
                    l66VarArr[i4] = a31Var;
                    a31Var.setGravity(17);
                    l66VarArr[i4].setTextSize(1, 12.0f);
                    anb.X(l66VarArr[i4], cmb.x6, null);
                    anb.G(l66VarArr[i4], cmb.Wc, null);
                    frameLayout.addView(l66VarArr[i4], qoe.e(-1, -1, 119));
                    l66 l66Var = l66VarArr[i4];
                    if (i4 == 0) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    l66Var.setAlpha(f);
                    l66 l66Var2 = l66VarArr[i4];
                    if (i4 == 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.8f;
                    }
                    l66Var2.setScaleX(f2);
                    l66 l66Var3 = l66VarArr[i4];
                    if (i4 == 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = 0.8f;
                    }
                    l66Var3.setScaleY(f3);
                    i4++;
                    i3 = i5;
                    b3 = b4;
                }
                final byte b5 = b3;
                int i6 = i3;
                final ci7 ci7Var = new ci7(l66VarArr, (byte) 19);
                if (a() == z8c.h(this.currentAccount).e()) {
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
                    objArr = l66VarArr;
                    my0Var = i2;
                    anb.X(l66VarArr[b5], cmb.p7, null);
                    if (b6 != 0) {
                        objArr[b5].setText(gm.S2(jb6.H(',', "StarRatingLevelNegativeYou", (int) j3)));
                    } else {
                        Chronometer chronometer = objArr[b5];
                        Object[] objArr2 = new Object[1];
                        objArr2[b5] = pg3.k(z8c.t0, a());
                        chronometer.setText(gm.S2(jb6.a0(null, null, 2131744861, objArr2)));
                    }
                    zx0Var = zx0Var2;
                    b2 = b5;
                } else {
                    my0Var = i2;
                    objArr = l66VarArr;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    String H = jb6.H(',', "StarRatingFuture", max);
                    String H2 = jb6.H(',', "StarRatingFuturePendingPoints", (int) j6);
                    CharSequence[] charSequenceArr = new CharSequence[3];
                    charSequenceArr[b5] = H;
                    charSequenceArr[1] = "\n";
                    charSequenceArr[i6] = H2;
                    spannableStringBuilder.append(TextUtils.concat(charSequenceArr));
                    spannableStringBuilder.append((CharSequence) " ");
                    zx0Var = zx0Var2;
                    spannableStringBuilder.append((CharSequence) gm.D2(gm.N2(jb6.M0(2131744875, null), -1, i6, new Runnable() {
                        @Override
                        public final void run() {
                            byte b7 = b5;
                            ci7 ci7Var2 = ci7Var;
                            TLRPC.UserFull userFull2 = userFull;
                            LimitPreviewView limitPreviewView2 = limitPreviewView;
                            switch (b7) {
                                case 0:
                                    RectF rectF = ProfileActivity.e7;
                                    limitPreviewView2.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    ci7Var2.a(Boolean.TRUE);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.e7;
                                    limitPreviewView2.d(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                    ci7Var2.a(Boolean.FALSE);
                                    return;
                            }
                        }
                    }, null), true));
                    b2 = b5;
                    objArr[b5].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            byte b7 = b2;
                            ci7 ci7Var2 = ci7Var;
                            TLRPC.UserFull userFull2 = userFull;
                            LimitPreviewView limitPreviewView2 = limitPreviewView;
                            switch (b7) {
                                case 0:
                                    RectF rectF = ProfileActivity.e7;
                                    limitPreviewView2.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    ci7Var2.a(Boolean.TRUE);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.e7;
                                    limitPreviewView2.d(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                    ci7Var2.a(Boolean.FALSE);
                                    return;
                            }
                        }
                    });
                    objArr[b2].setText(spannableStringBuilder);
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                String H3 = jb6.H(',', "StarRatingFuturePreview1", max);
                String H4 = jb6.H(',', "StarRatingFuturePreview2", (int) j6);
                CharSequence[] charSequenceArr2 = new CharSequence[3];
                charSequenceArr2[b2] = H3;
                charSequenceArr2[1] = "\n";
                charSequenceArr2[2] = H4;
                spannableStringBuilder2.append(TextUtils.concat(charSequenceArr2));
                spannableStringBuilder2.append((CharSequence) " ");
                spannableStringBuilder2.append((CharSequence) gm.D2(gm.N2(jb6.M0(2131744874, null), -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        byte b7 = b5;
                        ci7 ci7Var2 = ci7Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (b7) {
                            case 0:
                                RectF rectF = ProfileActivity.e7;
                                limitPreviewView2.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                ci7Var2.a(Boolean.TRUE);
                                return;
                            default:
                                RectF rectF2 = ProfileActivity.e7;
                                limitPreviewView2.d(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                ci7Var2.a(Boolean.FALSE);
                                return;
                        }
                    }
                }, null), true));
                objArr[1].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        byte b7 = b2;
                        ci7 ci7Var2 = ci7Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (b7) {
                            case 0:
                                RectF rectF = ProfileActivity.e7;
                                limitPreviewView2.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                ci7Var2.a(Boolean.TRUE);
                                return;
                            default:
                                RectF rectF2 = ProfileActivity.e7;
                                limitPreviewView2.d(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                ci7Var2.a(Boolean.FALSE);
                                return;
                        }
                    }
                });
                objArr[1].setText(spannableStringBuilder2);
            } else {
                my0Var = i2;
                zx0Var = zx0Var2;
            }
            TextView textView = new TextView(parentActivity);
            textView.setTypeface(gm.o());
            textView.setGravity(17);
            textView.setText(jb6.M0(2131744856, null));
            textView.setTextSize(1, 20.0f);
            int i7 = cmb.F6;
            anb.X(textView, i7, this.A0);
            linearLayout.addView(textView, qoe.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(17);
            if (userFull.id == z8c.h(this.currentAccount).e()) {
                textView2.setText(gm.S2(jb6.M0(2131744857, null)));
                i = 1;
            } else {
                i = 1;
                hg9.q(null, null, 2131744887, new Object[]{pg3.k(z8c.t0, a())}, textView2);
            }
            textView2.setTextSize(i, 14.0f);
            anb.X(textView2, i7, this.A0);
            linearLayout.addView(textView2, qoe.t(-1, -2, 17, 20, 0, 20, 12));
            lj8 lj8Var = new lj8(parentActivity, this.A0);
            lj8Var.a.l(jb6.M0(2131744855, null), false);
            String M0 = jb6.M0(2131744890, null);
            int i8 = cmb.Ei;
            lj8Var.b.setText(jb6.V(null, null, 2131744886, Q1(M0, i8, this.A0)));
            lj8Var.d.setVisibility(8);
            ImageView imageView = lj8Var.c;
            imageView.setImageResource(2131231832);
            ylb ylbVar = this.A0;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            anb.s(imageView, i7, ylbVar, mode);
            linearLayout.addView(lj8Var, qoe.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            lj8 lj8Var2 = new lj8(parentActivity, this.A0);
            lj8Var2.a.l(jb6.M0(2131744854, null), false);
            lj8Var2.b.setText(jb6.V(null, null, 2131744885, Q1(jb6.M0(2131744890, null), i8, this.A0)));
            lj8Var2.d.setVisibility(8);
            ImageView imageView2 = lj8Var2.c;
            imageView2.setImageResource(2131231896);
            anb.s(imageView2, i7, this.A0, mode);
            linearLayout.addView(lj8Var2, qoe.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            lj8 lj8Var3 = new lj8(parentActivity, this.A0);
            lj8Var3.a.l(jb6.M0(2131744853, null), false);
            String M02 = jb6.M0(2131744888, null);
            if (cmb.I.o()) {
                v0 = on2.f(0.25f, cmb.v0(cmb.l6, this.A0), -16777216);
            } else {
                v0 = cmb.v0(cmb.x6, this.A0);
            }
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(M02);
            of4 of4Var = new of4(9);
            of4Var.w = M02;
            if (of4Var.c != null) {
                of4Var.c = null;
                of4Var.a();
            }
            of4Var.f = v0;
            of4Var.n = false;
            spannableStringBuilder3.setSpan(of4Var, 0, spannableStringBuilder3.length(), 0);
            lj8Var3.b.setText(jb6.V(null, null, 2131744884, spannableStringBuilder3));
            lj8Var3.d.setVisibility(8);
            ImageView imageView3 = lj8Var3.c;
            imageView3.setImageResource(2131231880);
            anb.s(imageView3, i7, this.A0, mode);
            linearLayout.addView(lj8Var3, qoe.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            b61 b61Var = new b61(this.A0, parentActivity, true);
            b61Var.setOnClickListener(new vz(zx0Var, (byte) 1));
            b61Var.i(wsa.k2(jb6.M0(2131743575, null)), false, true);
            linearLayout.addView(b61Var, qoe.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            my0 my0Var2 = my0Var;
            my0Var2.O = linearLayout;
            my0Var2.show();
        }
    }

    @Override
    public final void H(float f) {
        sb5 sb5Var = this.h0;
        if (sb5Var == null) {
            return;
        }
        sb5Var.setProgress(f);
        this.o0.O(this.L2, f);
    }

    public final void H1() {
        u69 u69Var;
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
                    u69Var = null;
                    if (i3 < this.a.getChildCount()) {
                        if (RecyclerView.R(this.a.getChildAt(i3)) == 0) {
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
                    po8 po8Var = this.a;
                    View F = po8Var.F(view);
                    if (F != null) {
                        u69Var = po8Var.T(F);
                    }
                    u69Var = (b59) u69Var;
                }
                if (view == null) {
                    top = 0;
                } else {
                    top = view.getTop();
                }
                if (u69Var != null) {
                    i = u69Var.b();
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
                    a = pqe.a((-top) / gm.L(12.0f), 0.0f, 1.0f);
                }
                if (this.W5 != a) {
                    this.W5 = a;
                    Y3();
                }
                if (this.r0 == null && this.actionBar.o0) {
                    z = true;
                } else {
                    z = false;
                }
                int i4 = this.S4;
                if (i4 != -1 && !z) {
                    b59 b59Var = (b59) this.a.K(i4);
                    if (b59Var != null && b59Var.a.getTop() <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (this.c6 != z) {
                    this.c6 = z;
                    I1();
                    AnimatorSet animatorSet = this.Z5;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = this.a6;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                    }
                    a4(true);
                    g4();
                    l4(false);
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.a aVar = this.actionBar;
                    if (!z) {
                        f = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(aVar, this.d6, f));
                    this.O.L0.setOpen(z);
                    if (z) {
                        arrayList.add(ObjectAnimator.ofFloat(this, this.u5, 0.0f));
                    }
                    if (this.v0 != null || this.w0 != null) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new bo8(this, (byte) 3));
                        arrayList.add(ofFloat);
                    }
                    K1();
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    this.Z5 = animatorSet3;
                    animatorSet3.playTogether(arrayList);
                    this.Z5.setInterpolator(d53.f);
                    this.Z5.addListener(new cp8(this, (byte) 1));
                    this.Z5.setDuration(150L);
                    this.Z5.start();
                    nm7.e().k(nm7.v4, Boolean.TRUE);
                }
                float f2 = i2;
                if (this.Q1 != f2 && !this.H1) {
                    this.Q1 = f2;
                    this.d1.invalidate();
                    if (this.J1 != 0) {
                        if (this.Q1 > Y1()) {
                            z2 = true;
                        }
                        this.M1 = z2;
                    }
                    Q2(true);
                }
            }
        }
    }

    public final void H2(TLRPC.User user, String str, boolean z, boolean z2) {
        xhb.c(getParentActivity(), this.currentAccount, a(), user, str, z, z2, this.A0);
    }

    public final void H3() {
        int i;
        int i2;
        Long l;
        if (this.Y5 != null) {
            return;
        }
        mz9[] mz9VarArr = new mz9[1];
        Rect rect = gm.Q;
        mt1 mt1Var = this.f;
        if (mt1Var != null) {
            Drawable rightDrawable = mt1Var.getRightDrawable();
            mt1 mt1Var2 = this.f;
            if (rightDrawable == null) {
                rect.set(mt1Var2.getWidth() - 1, (this.f.getHeight() / 2) - 1, this.f.getWidth() + 1, (this.f.getHeight() / 2) + 1);
            } else {
                rect.set(mt1Var2.getRightDrawable().getBounds());
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
        int L = (-(this.Z.getHeight() - rect.centerY())) - gm.L(i3);
        Point point = gm.q;
        int min = (int) Math.min(gm.L(324.0f), point.x * 0.95f);
        int centerX = rect.centerX();
        int b = pqe.b(centerX - (min / 2), 0, point.x - min);
        Activity parentActivity = getParentActivity();
        Integer valueOf = Integer.valueOf(Math.max(0, centerX - b));
        if (this.F2 == null) {
            i2 = 0;
        } else {
            i2 = 9;
        }
        fp8 fp8Var = new fp8(this, this, parentActivity, valueOf, i2, this.A0, i3, mz9VarArr);
        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.e1));
        if (W1 != null) {
            fp8Var.setExpireDateHint(pg3.g(W1.emoji_status));
        }
        Long l2 = this.F;
        if (l2 != null) {
            fp8Var.setSelected(l2);
        } else {
            tm tmVar = this.G;
            if (tmVar != null) {
                Drawable drawable = tmVar.f[0];
                if (drawable instanceof vm) {
                    l = Long.valueOf(((vm) drawable).h());
                    fp8Var.setSelected(l);
                }
            }
            l = null;
            fp8Var.setSelected(l);
        }
        fp8Var.setSaveState(3);
        fp8Var.y(this.G, this.f);
        gp8 gp8Var = new gp8(this, fp8Var);
        this.Y5 = gp8Var;
        mz9VarArr[0] = gp8Var;
        int[] iArr = new int[2];
        mt1 mt1Var3 = this.f;
        if (mt1Var3 != null) {
            mt1Var3.getLocationOnScreen(iArr);
        }
        mz9VarArr[0].showAsDropDown(this.fragmentView, b, L, 51);
        mz9VarArr[0].a();
    }

    @Override
    public final void I() {
        n3(false);
    }

    public final void I1() {
        int i;
        wp8 wp8Var = this.O;
        if (wp8Var != null) {
            if (!this.c6 && this.b6 <= 0.0f) {
                i = 0;
            } else {
                i = Integer.MAX_VALUE;
            }
            wp8Var.setPagesVisibleOverscanTop(i);
        }
    }

    public final void I2() {
        oc7.r1(this.currentAccount).h0(null);
        this.V.H(0);
        this.W.H(0);
    }

    public final void I3() {
        int i = 0;
        this.O.L0.setReordering(false);
        wp8 wp8Var = this.O;
        kfa kfaVar = wp8Var.L0;
        if (wp8Var.y1 != null && kfaVar != null) {
            boolean m0 = wp8Var.m0();
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = kfaVar.getTabIds();
            int size = tabIds.size();
            while (i < size) {
                Integer num = tabIds.get(i);
                i++;
                TLRPC.ProfileTab Y = nha.Y(num.intValue(), m0);
                if (Y != null) {
                    arrayList.add(Y);
                }
            }
        }
        this.O.N1(true);
        this.J5.animate().translationY(gm.L(69.0f)).setDuration(180L).setInterpolator(d53.h).withEndAction(new v56(this, (byte) 25)).start();
        c41.b0(this).Q(2131623990, 36, "Tab order changed.").j();
    }

    public final void J1() {
        float alpha;
        boolean z;
        byte b = this.J1;
        float f = 0.0f;
        boolean z2 = true;
        if (b == 1 && (!this.w5 || this.G1)) {
            this.C6 = 0.0f;
        } else if (b == 2 && (!this.w5 || this.G1)) {
            ap8 ap8Var = this.r;
            if (ap8Var == null) {
                alpha = 0.0f;
            } else {
                alpha = ap8Var.getAlpha();
            }
            this.C6 = alpha;
        } else {
            int i = (this.e1 > z8c.h(this.currentAccount).n ? 1 : (this.e1 == z8c.h(this.currentAccount).n ? 0 : -1));
            float f2 = this.l2;
            float f3 = this.y5;
            if (i == 0) {
                this.C6 = (1.0f - f3) * f2;
            } else {
                this.C6 = f2 * f3;
            }
        }
        if (this.e1 == z8c.h(this.currentAccount).n) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.A5) {
            this.z5 = gm.L(28.0f) * this.C6;
            ap8 ap8Var2 = this.r;
            if (ap8Var2 != null) {
                ap8Var2.setTranslationX(h2(this.G6, this.I6));
                this.Z.invalidate();
            }
        }
        if (z) {
            if (this.A5) {
                f = this.l2;
            }
        } else if (this.B5) {
            f = this.C6;
        }
        vq8 vq8Var = this.K6;
        if (vq8Var != null) {
            vq8Var.e = 1.0f - f;
            vq8Var.invalidateSelf();
        }
        if (f <= 0.5f) {
            z2 = false;
        }
        this.F6 = z2;
        g4();
    }

    public final void J2(TLRPC.User user) {
        int i;
        if (this.a4 >= 0) {
            if (this.S4 == -1) {
                i4();
                this.d.f();
            } else {
                c4(false, false);
            }
        }
        if (this.S4 == -1) {
            if (!this.o2 && !gm.O1()) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
                if (this.actionBar.getOccupyStatusBar()) {
                    i = gm.m;
                } else {
                    i = 0;
                }
                int i2 = currentActionBarHeight + i;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.a.getMeasuredWidth(), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.a.getMeasuredHeight(), 0);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    lq8 lq8Var = this.d;
                    if (i3 >= lq8Var.e.O2) {
                        break;
                    }
                    u69 a = lq8Var.a(null, lq8Var.d(i3));
                    View view = a.a;
                    this.d.t(a, i3);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 += view.getMeasuredHeight();
                    i3++;
                }
                int max = Math.max(0, this.fragmentView.getMeasuredHeight() - ((e2() + i4) + i2));
                po8 po8Var = this.a;
                po8Var.setPadding(0, po8Var.getPaddingTop(), 0, max);
            } else {
                this.a.setPadding(0, e2(), 0, 0);
                this.k2.cancel();
                float[] fArr = this.n2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                r3(1.0f);
                this.Q1 = e2();
            }
        }
        this.M.m(user, 8, this.i1);
    }

    public final void J3() {
        int v0;
        int v02;
        if (!this.q2) {
            ap8 ap8Var = this.r;
            if (ap8Var != null) {
                Object tag = ap8Var.getTag();
                boolean z = tag instanceof Integer;
                ap8 ap8Var2 = this.r;
                if (z) {
                    ap8Var2.setTextColor(B1(cmb.v0(((Integer) tag).intValue(), this.A0), Boolean.valueOf(this.K0[0])));
                } else {
                    ap8Var2.setTextColor(B1(cmb.v0(cmb.A8, this.A0), Boolean.TRUE));
                }
            }
            Drawable drawable = this.x;
            int i = -1;
            if (drawable != null) {
                if (this.s6 != null) {
                    v02 = -1;
                } else {
                    v02 = cmb.v0(cmb.fd, this.A0);
                }
                drawable.setColorFilter(v02, PorterDuff.Mode.MULTIPLY);
            }
            hs9 hs9Var = this.L;
            if (hs9Var != null) {
                hs9Var.b(cmb.v0(cmb.g8, this.A0));
            }
            mt1 mt1Var = this.f;
            if (mt1Var != null) {
                mt1Var.setTextColor(cmb.v0(cmb.li, this.A0));
            }
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            if (aVar != null) {
                if (this.s6 == null) {
                    i = cmb.v0(cmb.u8, this.A0);
                }
                aVar.H(i, false);
                org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
                if (this.s6 != null) {
                    v0 = 553648127;
                } else {
                    v0 = cmb.v0(cmb.e8, this.A0);
                }
                aVar2.G(v0, false);
            }
        }
        P3();
        p4();
    }

    public final void K1() {
        boolean z;
        ita itaVar = this.T;
        if (itaVar != null) {
            if (!this.c6 && this.i6) {
                z = true;
            } else {
                z = false;
            }
            itaVar.setVisibility(z);
        }
    }

    public final void K2(ValueAnimator valueAnimator, float f, boolean z) {
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
        Q2(true);
        this.a.setAlpha(f2);
        this.b.setAlpha(1.0f - this.V1);
        this.b.setScaleX((this.V1 * 0.05f) + 1.0f);
        this.b.setScaleY((this.V1 * 0.05f) + 1.0f);
        this.P.setAlpha(1.0f - f2);
        this.Y.setAlpha(f2);
        this.f0.setAlpha(f2);
        bp8 bp8Var = this.v0;
        if (bp8Var != null) {
            bp8Var.setAlpha(f2);
        }
        this.f.setAlpha(f2);
        ap8 ap8Var = this.r;
        if (!this.c6) {
            f4 = f2;
        }
        ap8Var.setAlpha(f4);
        this.U0.getSearchField().setAlpha(f3);
        if (z && this.V1 < 0.7f) {
            zja zjaVar = this.U0;
            if (zjaVar.G.getWidth() != 0 && !zjaVar.e.isFocused()) {
                zjaVar.e.requestFocus();
                gm.E3(zjaVar.e);
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
        zja zjaVar2 = this.T0;
        if (zjaVar2 != null) {
            zjaVar2.setVisibility(i2);
            this.T0.setAlpha(f2);
        }
        this.U0.setVisibility(i2);
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (this.V1 >= 0.5f) {
            z2 = false;
        }
        aVar.B(z2);
        zja zjaVar3 = this.T0;
        if (zjaVar3 != null) {
            zjaVar3.setAlpha(f2);
        }
        this.U0.setAlpha(f2);
        this.d1.invalidate();
        this.fragmentView.invalidate();
    }

    public final void K3() {
        int i;
        float f;
        ne6 ne6Var;
        if (this.a0 != null && this.r != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i = gm.m;
            } else {
                i = 0;
            }
            int i2 = currentActionBarHeight + i;
            qn8 qn8Var = this.a0;
            boolean z = this.G1;
            qn8Var.e = z;
            if (z && this.J1 == 2 && (ne6Var = this.Y) != null) {
                this.a0.f = this.Y.getY() + (this.Y.getScaleY() * ne6Var.getHeight());
                this.a0.setAlpha(this.T1);
                qn8 qn8Var2 = this.a0;
                qn8Var2.x = gm.L(74.0f);
                qn8Var2.setTranslationY(this.a.getMeasuredWidth());
                qn8Var2.invalidate();
            } else {
                qn8Var.f = -1.0f;
                float f2 = i2;
                float f3 = this.Q1 + f2;
                if (!this.Q4 && !this.R4) {
                    f = 0.0f;
                } else {
                    f = 25.0f;
                }
                float L = f3 - gm.L(f);
                float min = Math.min(gm.L(74.0f), L - f2);
                qn8 qn8Var3 = this.a0;
                qn8Var3.x = min;
                qn8Var3.setTranslationY(L - min);
                qn8Var3.invalidate();
            }
            ImageView imageView = this.P0;
            if (imageView != null && imageView.getTag() != null) {
                this.a0.getClass();
                if (this.P0.getVisibility() == 0) {
                    this.P0.setVisibility(8);
                }
                if (this.P0.getTag() instanceof r7) {
                    ((r7) this.P0.getTag()).setAlpha(1.0f);
                }
            }
        }
    }

    public final void L1(int i) {
        boolean t0 = nha.t0(this.O.getClosestTab());
        if (i == this.Q6 && t0 == this.R6) {
            return;
        }
        this.Q6 = i;
        this.R6 = t0;
        if (t0) {
            b61[] b61VarArr = this.H5;
            if (i > 0) {
                b61VarArr[0].i(jb6.G(i, "HideStoriesFromAlbum", new Object[0]), true, true);
            } else {
                b61VarArr[0].i(this.G5, true, true);
            }
        } else if (i <= 0 && oc7.r1(this.currentAccount).e5()) {
            this.H5[0].i(this.F5, true, true);
        } else {
            this.H5[0].i(jb6.G(i, "ArchiveStories", new Object[0]), true, true);
        }
    }

    public final void L2() {
        n57.b(getParentActivity(), this.currentAccount, a(), true, null, new v56(this, (byte) 21), this.A0);
    }

    public final void L3() {
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

    public final void M1(boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.M1(boolean):void");
    }

    public final void M2(TLRPC.EmojiStatus emojiStatus, TLRPC.User user, mt1 mt1Var) {
        gn5 b;
        String str;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            l11.u(getParentActivity(), "https://" + getMessagesController().N2 + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        yj8 yj8Var = new yj8(this, this.currentAccount, user, null, null, this.A0);
        mt1Var.getLocationOnScreen(new int[2]);
        yj8Var.q2 = mt1Var.i0;
        yj8Var.r2 = mt1Var.j0;
        yj8Var.u2 = mt1Var.getScaleX();
        yj8Var.s2 = mt1Var.getLeft();
        yj8Var.t2 = mt1Var.getTop();
        yj8Var.v2 = mt1Var;
        Drawable rightDrawable = mt1Var.getRightDrawable();
        tm tmVar = this.G;
        if (rightDrawable == tmVar && tmVar != null) {
            Drawable drawable = tmVar.f[0];
            if (drawable instanceof vm) {
                yj8Var.u2 *= 0.98f;
                TLRPC.Document document = ((vm) drawable).e;
                if (document != null) {
                    bf0 bf0Var = new bf0(getParentActivity());
                    meb d = eq3.d(document.thumbs, cmb.l6, 0.2f, false);
                    TLRPC.PhotoSize w = bc4.w(document.thumbs, 90, false, null, false);
                    if ("video/webm".equals(document.mime_type)) {
                        b = gn5.b(document);
                        if (d != null) {
                            d.e = 512;
                            d.f = 512;
                        }
                        str = "160_160_g";
                    } else {
                        if (d != null && k47.K2(document, false)) {
                            d.e = 512;
                            d.f = 512;
                        }
                        b = gn5.b(document);
                        str = "160_160";
                    }
                    gn5 gn5Var = b;
                    String str2 = str;
                    bf0Var.setLayerNum(7);
                    bf0Var.setRoundRadius(gm.L(4.0f));
                    bf0Var.j(gn5Var, str2, gn5.c(w, document), "140_140", d, document);
                    if (((vm) this.G.f[0]).c()) {
                        bf0Var.setColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.u6, this.A0), PorterDuff.Mode.SRC_IN));
                        yj8Var.x2 = k47.i1(document);
                    } else {
                        yj8Var.x2 = k47.i1(document);
                    }
                    yj8Var.w2 = bf0Var;
                    yj8Var.z2 = true;
                }
            }
        }
        showDialog(yj8Var);
    }

    public final void M3() {
        float L;
        boolean z;
        if (this.D5 != null) {
            wp8 wp8Var = this.O;
            if (wp8Var != null && wp8Var.isAttachedToWindow()) {
                L = gm.L(232.0f) - (this.a.getMeasuredHeight() - this.O.getY());
            } else {
                L = gm.L(72.0f);
            }
            int i = 0;
            if (L <= 0.0f) {
                z = true;
            } else {
                z = false;
            }
            fn0 fn0Var = this.X5;
            fn0Var.a(z, true);
            float f = fn0Var.e;
            this.D5.setTranslationY(gm.U1(f, gm.L(60.0f), 0));
            this.D5.setAlpha(f);
            FrameLayout frameLayout = this.D5;
            if (f <= 0.0f) {
                i = 4;
            }
            frameLayout.setVisibility(i);
            u31 u31Var = u31.x;
            if (u31Var != null) {
                u31Var.l();
            }
        }
    }

    public final void N1(Context context) {
        int i;
        this.a1 = new trc(context, this.T0.getPopupLayout().getSwipeBack(), new ai4(this, (byte) 23), false, 0, this.A0);
        if (this.i1 > 0 || this.e1 > 0) {
            int v0 = cmb.v0(cmb.m6, this.A0);
            trc trcVar = this.a1;
            l66 l66Var = (l66) trcVar.e;
            if (l66Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) jb6.M0(2131753813, null));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) gm.K2(jb6.M0(2131753812, null), v0, new f00(trcVar, (byte) 6)));
                l66Var.setText(spannableStringBuilder);
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
        sqb a = sqb.a(i);
        this.t0 = a;
        this.Z0 = this.T0.i(0, a, jb6.M0(2131753811, null), (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.a1.b);
        this.T0.a(-1);
        L3();
    }

    public final void N2(boolean z) {
        boolean z2;
        boolean c0 = sd2.c0(this.F2);
        TLRPC.Chat chat = this.F2;
        if (!c0 && !z && (chat == null || !chat.creator)) {
            z2 = false;
        } else {
            z2 = true;
        }
        ik.r(this, false, chat, null, false, z2, z, !c0, new tn8(this, (byte) 3));
    }

    public final void N3() {
        boolean z;
        hg5 hg5Var = this.M6;
        if (hg5Var != null) {
            float f = 0.0f;
            hg5Var.o(0.0f, (this.f.getScaleX() * this.f.getRightDrawableX()) + this.f.getX() + (-hg5Var.getPaddingLeft()));
            float S1 = gm.S1(this.m2, this.n2);
            hg5 hg5Var2 = this.M6;
            hg5Var2.setTranslationY(((this.f.getY() + (-hg5Var2.getPaddingBottom())) - gm.L(24.0f)) + gm.U1(S1, gm.L(6.0f), -gm.L(12.0f)));
            this.M6.i(on2.f(S1, this.N6, 1342177280));
            if (this.Q1 >= gm.L(82.0f)) {
                z = true;
            } else {
                z = false;
            }
            Boolean bool = this.O6;
            if (bool != null && bool.booleanValue() == z) {
                return;
            }
            ViewPropertyAnimator animate = this.M6.animate();
            this.O6 = Boolean.valueOf(z);
            if (z) {
                f = 1.0f;
            }
            wi8.t(animate.alpha(f), d53.g, 200L);
        }
    }

    @Override
    public final void O(boolean z, boolean z2) {
        sb5 sb5Var = this.h0;
        if (sb5Var == null) {
            return;
        }
        sb5Var.setProgress(0.0f);
    }

    public final void O1() {
        if (this.fragmentView != null && this.z6 && this.z2 != null && getParentActivity() != null) {
            cr8 cr8Var = this.L6;
            if (cr8Var != null) {
                cr8Var.b(this.z2);
                this.L6.invalidate();
                return;
            }
            cr8 cr8Var2 = new cr8(this, this.z2);
            this.L6 = cr8Var2;
            ((FrameLayout) this.fragmentView).addView(cr8Var2, qoe.e(-1, -1, 55));
        }
    }

    public final void O3() {
        if (getParentActivity() != null && this.V0 != null) {
            if (getUserConfig().p()) {
                this.V0.setIcon(2131231867);
                return;
            }
            Drawable drawable = getParentActivity().getDrawable(2131231868);
            drawable.setColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.E8, this.A0), PorterDuff.Mode.SRC_IN));
            this.b7 = drawable;
            Drawable drawable2 = getParentActivity().getDrawable(2131232175);
            drawable2.setColorFilter(new PorterDuffColorFilter(on2.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            this.V0.setIcon(new o38(drawable, drawable2, gm.L(1.0f), -gm.L(1.0f)));
        }
    }

    public final void P1(Context context) {
        rja rjaVar = this.simpleActionBar;
        if (rjaVar != null) {
            gm.B2(rjaVar);
        }
        lp8 lp8Var = new lp8(this, context, this.A0);
        this.simpleActionBar = lp8Var;
        lp8Var.setTitlesAlpha(0.0f);
        if (!this.w5 && !this.J0 && this.J1 != 0 && this.M1 && !this.N1) {
            this.simpleActionBar.setAlpha(0.0f);
        }
        this.simpleActionBar.setOccupyStatusBar(this.actionBar.getOccupyStatusBar());
        this.simpleActionBar.setMenuOverlayProvider(new wg0(this, (byte) 4));
        boolean z = this.J0;
        rja rjaVar2 = this.simpleActionBar;
        if (z) {
            rjaVar2.setBackButtonImage(2131232502);
            this.simpleActionBar.setBackButtonContentDescription(jb6.M0(2131746233, null));
        } else {
            rjaVar2.setBackButtonImage(2131231244);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new im8(this, (byte) 3));
        if (!this.J0) {
            View backButton = this.simpleActionBar.getBackButton();
            backButton.setOnLongClickListener(new u0(this, backButton, (byte) 6));
        }
    }

    public final boolean P2() {
        if (getMessagesController().N1().J(a()) && !this.q1) {
            return true;
        }
        return false;
    }

    public final void P3() {
        Q3(this.r6);
    }

    @Override
    public final void Q() {
        fha fhaVar;
        wp8 wp8Var = this.O;
        if (wp8Var != null && (fhaVar = this.R) != null) {
            wp8Var.setNewMediaCounts(fhaVar.c);
        }
        if (this.d != null) {
            c4(false, false);
        }
        W();
        if (this.w2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void Q2(boolean z) {
        int i;
        int i2;
        float f;
        float f2;
        float f3;
        float S1;
        bf0 currentItemView;
        float f4;
        float S12;
        int i3;
        float f5;
        float f6;
        float f8;
        float f9;
        float f10;
        float f11;
        FrameLayout.LayoutParams layoutParams;
        float f12;
        int i4;
        int i5;
        mt1 mt1Var;
        int v0;
        float f13;
        int i6;
        boolean z2;
        TLRPC.ChatFull chatFull;
        int i7;
        this.glassEngine.g();
        if (this.actionBar.getOccupyStatusBar()) {
            i = gm.m;
        } else {
            i = 0;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i;
        float E1 = E1();
        V3();
        po8 po8Var = this.a;
        if (po8Var != null && !this.G1) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) po8Var.getLayoutParams();
            if (layoutParams2.topMargin != currentActionBarHeight) {
                layoutParams2.topMargin = currentActionBarHeight;
                this.a.setLayoutParams(layoutParams2);
            }
        }
        o4(z);
        if (this.Y != null) {
            this.a.setTopGlowOffset((int) this.Q1);
            po8 po8Var2 = this.a;
            if (this.Q1 > e2() && this.Q1 < (Y1() + this.a.getMeasuredWidth()) - currentActionBarHeight) {
                i7 = 2;
            } else {
                i7 = 0;
            }
            po8Var2.setOverScrollMode(i7);
        }
        if (this.Y != null && !this.n6 && this.G1) {
            D1();
            return;
        }
        int e2 = e2();
        if (this.Y != null) {
            if (this.a0 != null && this.f1 != 0) {
                if (sd2.T(this.F2) && !this.F2.megagroup && (chatFull = this.v2) != null && chatFull.linked_chat_id != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.a0.o(2, z2);
            }
            o4(z);
            if (this.actionBar.getOccupyStatusBar()) {
                i2 = gm.m;
            } else {
                i2 = 0;
            }
            float translationY = this.actionBar.getTranslationY() + (hg9.u(E1, 1.0f, org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f, i2) - gm.L(21.0f));
            if (!this.G1) {
                bt8 bt8Var = this.u0;
                if (bt8Var != null) {
                    f13 = -gm.L(29.0f);
                    yl7 yl7Var = bt8Var.n;
                    if (yl7Var != null && yl7Var.c) {
                        f13 = yl7Var.e.centerY();
                    }
                } else {
                    f13 = -gm.L(29.0f);
                }
                if (this.actionBar.getOccupyStatusBar()) {
                    i6 = gm.m;
                } else {
                    i6 = 0;
                }
                this.b2 = gm.R1(f13, this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i6) - gm.L(21.0f)), E1);
            } else {
                this.b2 = translationY;
            }
            if (this.G1) {
                f = this.S1;
            } else {
                f = this.Q1;
            }
            float f14 = e2;
            if (f <= f14 && !this.q2) {
                f2 = 2.0f;
                f3 = 18.0f;
            } else {
                f2 = 2.0f;
                float x = kt6.x(f - f14, (this.a.getMeasuredWidth() - currentActionBarHeight) - f2(), 1.0f, 0.0f);
                this.i2 = x;
                f3 = 18.0f;
                this.c2 = (gm.R1(2.2857144f, 3.2857144f, Math.min(1.0f, x * 3.0f)) / 100.0f) * 42.0f;
                this.d2 = 0.0f;
                bp8 bp8Var = this.v0;
                if (bp8Var != null) {
                    bp8Var.invalidate();
                }
                xs8 xs8Var = this.w0;
                if (xs8Var != null) {
                    xs8Var.invalidate();
                }
                float min = Math.min(gm.N(2000.0f), Math.max(gm.N(1100.0f), Math.abs(this.j2))) / gm.N(1100.0f);
                Y1();
                boolean z3 = this.p2;
                int i8 = nm7.v4;
                float[] fArr = this.n2;
                if (z3 && (this.G0 || this.i2 >= 0.33f)) {
                    if (!this.q2) {
                        if (this.T0 != null) {
                            boolean s2 = s2();
                            zja zjaVar = this.T0;
                            if (!s2) {
                                zjaVar.S(21);
                            } else {
                                zjaVar.u(21);
                            }
                            if (this.r0 != null) {
                                this.T0.S(36);
                                this.T0.S(34);
                                this.T0.S(35);
                                this.T0.u(33);
                                this.T0.u(31);
                            }
                        }
                        zja zjaVar2 = this.U0;
                        if (zjaVar2 != null) {
                            zjaVar2.setEnabled(false);
                        }
                        this.q2 = true;
                        nm7.e().k(i8, Boolean.TRUE);
                        this.N.f(true, min);
                        this.p0.b(min);
                        this.o0.setCreateThumbFromParent(true);
                        this.o0.getAdapter().g();
                        this.k2.cancel();
                        fArr[0] = gm.S1(this.m2, fArr);
                        fArr[1] = 1.0f;
                        bp8 bp8Var2 = this.v0;
                        if (bp8Var2 != null && !bp8Var2.x.isEmpty()) {
                            this.k2.setInterpolator(new l94());
                            this.k2.setDuration((((1.0f - S12) * 1.3f) * 250.0f) / min);
                        } else {
                            this.k2.setInterpolator(d53.j);
                            this.k2.setDuration(((1.0f - S12) * 250.0f) / min);
                        }
                        this.k2.addListener(new cp8(this, (byte) 4));
                        View m = this.c.m(0);
                        if (!this.P1 && m != null) {
                            this.O1 = true;
                            int currentActionBarHeight2 = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
                            if (this.actionBar.getOccupyStatusBar()) {
                                i3 = gm.m;
                            } else {
                                i3 = 0;
                            }
                            this.a.y0(((m.getTop() - this.a.getMeasuredWidth()) - Y1()) + currentActionBarHeight2 + i3, (int) this.k2.getDuration(), (Interpolator) this.k2.getInterpolator());
                            this.a.P0 = false;
                        }
                        this.l6 = this.f.getTranslationY();
                        this.m6 = this.r.getTranslationY();
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
                    float f15 = currentActionBarHeight + f;
                    int i10 = (int) f15;
                    layoutParams3.height = i10;
                    if (i9 != i10) {
                        this.o0.requestLayout();
                    }
                    if (!this.k2.isRunning()) {
                        if (this.G1 && this.J1 == 2) {
                            f4 = (-(1.0f - this.T1)) * gm.L(50.0f);
                        } else {
                            f4 = 0.0f;
                        }
                        this.f.setTranslationX(gm.N(18.0f) - this.f.getLeft());
                        this.f.setTranslationY((((f15 - Y1()) - gm.N(30.0f)) - this.f.getBottom()) + f4);
                        this.r.setTranslationX(h2(gm.N(16.0f) - this.r.getLeft(), 0.0f));
                        this.r.setTranslationY(i2((((f15 - Y1()) - gm.N(10.0f)) - this.r.getBottom()) + f4));
                        N3();
                    }
                } else {
                    if (this.q2) {
                        this.q2 = false;
                        nm7.e().k(i8, Boolean.TRUE);
                        zja zjaVar3 = this.T0;
                        if (zjaVar3 != null) {
                            zjaVar3.u(21);
                            if (this.r0 != null) {
                                this.T0.u(33);
                                this.T0.u(34);
                                this.T0.u(35);
                                this.T0.S(36);
                                this.T0.S(31);
                            }
                        }
                        zja zjaVar4 = this.U0;
                        if (zjaVar4 != null) {
                            zjaVar4.setEnabled(!this.z1);
                        }
                        this.N.f(false, min);
                        this.p0.b(min);
                        this.k2.cancel();
                        this.f0.getImageReceiver().u0 = true;
                        this.f0.getImageReceiver().w0(false);
                        fArr[0] = gm.S1(this.m2, fArr);
                        fArr[1] = 0.0f;
                        this.k2.setInterpolator(d53.j);
                        boolean z4 = this.o2;
                        ValueAnimator valueAnimator = this.k2;
                        if (!z4) {
                            valueAnimator.setDuration((S1 * 250.0f) / min);
                        } else {
                            valueAnimator.setDuration(0L);
                        }
                        this.d1.setBackgroundColor(cmb.v0(cmb.Z6, this.A0));
                        if (!this.I0 && (currentItemView = this.o0.getCurrentItemView()) != null) {
                            boolean z5 = currentItemView.getImageReceiver().t() instanceof jbc;
                            yo8 yo8Var = this.f0;
                            if (z5) {
                                yo8Var.b0 = false;
                            } else {
                                yo8Var.b0 = true;
                                yo8Var.setForegroundImageDrawable(currentItemView.getImageReceiver().u());
                            }
                        }
                        this.k2.addListener(new cp8(this, (byte) 5));
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
                    X1();
                    ValueAnimator valueAnimator2 = this.k2;
                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                        k3();
                        this.f.setTranslationY(this.f2);
                        this.r.setTranslationX(h2(this.g2, this.H6));
                        this.r.setTranslationY(i2(this.h2));
                        N3();
                    }
                }
            }
            boolean z6 = this.G1;
            if (z6 && this.J1 == 2) {
                float f16 = this.p6;
                if (this.actionBar.getOccupyStatusBar()) {
                    i5 = gm.m;
                } else {
                    i5 = 0;
                }
                float translationY2 = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / f2) + i5) - (gm.p * 21.0f));
                this.f.setPivotY(mt1Var.getMeasuredHeight());
                this.f.setScaleX(1.38f);
                this.f.setScaleY(1.38f);
                this.c2 = gm.U1(this.T1, 42, 138) / 100.0f;
                this.d2 = 0.0f;
                bp8 bp8Var3 = this.v0;
                if (bp8Var3 != null) {
                    bp8Var3.setExpandProgress(1.0f);
                }
                xs8 xs8Var2 = this.w0;
                if (xs8Var2 != null) {
                    xs8Var2.setExpandProgress(1.0f);
                }
                this.f0.setRoundRadiusForExpand((int) gm.R1(n2(), 0.0f, this.T1));
                this.Y.setTranslationX(gm.R1(f16, 0.0f, this.T1));
                this.Y.setTranslationY(gm.R1((float) Math.ceil(translationY2), 0.0f, this.T1));
                float measuredWidth = ((this.c2 * 100.0f) / 42.0f) * (this.Y.getMeasuredWidth() - gm.L(42.0f));
                this.i0.setTranslationX(this.Y.getX() + gm.L(16.0f) + measuredWidth);
                this.i0.setTranslationY(this.Y.getY() + gm.L(-10.0f) + measuredWidth);
                this.j0.setTranslationX(this.Y.getX() + gm.L(28.0f) + measuredWidth);
                this.j0.setTranslationY(this.Y.getY() + gm.L(26.5f) + measuredWidth);
                this.k0.setTranslationX(this.Y.getX() + gm.L(28.0f) + measuredWidth);
                this.k0.setTranslationY(this.Y.getY() + gm.L(24.0f) + measuredWidth);
                this.l0.setTranslationX(this.Y.getX() + gm.L(28.0f) + measuredWidth);
                this.l0.setTranslationY(this.Y.getY() + gm.L(24.0f) + measuredWidth);
                this.Y.setScaleX(this.c2);
                this.Y.setScaleY(this.c2);
                this.o0.setAlpha(0.0f);
                this.o0.setVisibility(0);
                yo8 yo8Var2 = this.f0;
                float f17 = this.T1;
                float f18 = this.c2;
                yo8Var2.I = f17;
                yo8Var2.J = f18;
                yo8Var2.H = true;
                this.N.e(false, f17);
                org.telegram.ui.ActionBar.a aVar = this.actionBar;
                int i11 = -1;
                if (this.s6 != null) {
                    v0 = -1;
                } else {
                    v0 = cmb.v0(cmb.u8, this.A0);
                }
                aVar.H(on2.f(this.T1, v0, -1), false);
                hs9 hs9Var = this.L;
                if (hs9Var != null) {
                    hs9Var.b(on2.f(this.T1, cmb.v0(cmb.g8, this.A0), -1275068417));
                }
                Drawable drawable = this.x;
                if (drawable != null) {
                    if (this.s6 == null) {
                        i11 = on2.f(this.T1, cmb.v0(cmb.fd, this.A0), -1);
                    }
                    drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                }
                x43 x43Var = this.J;
                if (x43Var != null) {
                    x43Var.a(this.T1);
                    this.f.invalidate();
                }
                x43 x43Var2 = this.K;
                if (x43Var2 != null) {
                    x43Var2.a(this.T1);
                    this.f.invalidate();
                }
                Q3(this.T1);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
                layoutParams4.width = (int) gm.R1(gm.N(100.0f), this.a.getMeasuredWidth() / this.c2, this.T1);
                layoutParams4.height = (int) gm.R1(gm.N(100.0f), (this.Q1 + currentActionBarHeight) / this.c2, this.T1);
                this.Y.requestLayout();
                N3();
            } else if (f <= f14) {
                if (z6) {
                    this.c2 = gm.U1(E1, 42, 96) / 100.0f;
                    this.d2 = 0.0f;
                    f6 = 1.0f;
                } else {
                    bt8 bt8Var2 = this.u0;
                    if (bt8Var2 != null) {
                        f5 = bt8Var2.getHiddenAvatarSizeDp();
                    } else {
                        f5 = 24.0f;
                    }
                    this.c2 = gm.R1(f5, 96.0f, E1) / 100.0f;
                    f6 = 1.0f;
                    this.d2 = 1.0f - E1;
                }
                qn8 qn8Var = this.a0;
                if (qn8Var != null) {
                    if (this.G1) {
                        qn8Var.setAlpha(this.T1);
                    } else {
                        qn8Var.setAlpha(f6);
                    }
                }
                bp8 bp8Var4 = this.v0;
                if (bp8Var4 != null) {
                    bp8Var4.invalidate();
                }
                xs8 xs8Var3 = this.w0;
                if (xs8Var3 != null) {
                    xs8Var3.h = this.G1;
                    float l = Utilities.l((E1 - 0.3f) / 0.7f);
                    if (xs8Var3.f != l) {
                        xs8Var3.f = l;
                        xs8Var3.invalidate();
                    }
                }
                if (this.G1) {
                    f8 = gm.R1(k2(0), 1.12f, E1);
                } else {
                    f8 = (0.12f * E1) + 1.0f;
                }
                ValueAnimator valueAnimator3 = this.k2;
                if (valueAnimator3 != null && valueAnimator3.isRunning()) {
                    ValueAnimator valueAnimator4 = this.k2;
                    cp8 cp8Var = this.j6;
                    valueAnimator4.removeListener(cp8Var);
                    this.k2.addListener(cp8Var);
                } else {
                    this.Y.setScaleX(this.c2);
                    this.Y.setScaleY(this.c2);
                    X1();
                    this.Y.setTranslationY((float) Math.ceil(this.b2));
                    float L = (((this.c2 * 100.0f) / 42.0f) * gm.L(42.0f)) - gm.L(42.0f);
                    this.i0.setTranslationX(this.Y.getX() + gm.L(16.0f) + L);
                    this.i0.setTranslationY(this.Y.getY() + gm.L(-10.0f) + L);
                    this.j0.setTranslationX(this.Y.getX() + gm.L(28.0f) + L);
                    this.j0.setTranslationY(this.Y.getY() + gm.L(26.5f) + L);
                    this.k0.setTranslationX(this.Y.getX() + gm.L(28.0f) + L);
                    this.k0.setTranslationY(this.Y.getY() + gm.L(24.0f) + L);
                    this.l0.setTranslationX(this.Y.getX() + gm.L(28.0f) + L);
                    this.l0.setTranslationY(this.Y.getY() + gm.L(24.0f) + L);
                }
                float floor = (float) Math.floor(translationY);
                float N = gm.N(8.0f) + (this.Y.getScaleY() * this.Y.getHeight());
                if (this.G1) {
                    f9 = this.T1;
                } else {
                    f9 = E1;
                }
                float f19 = (N * f9) + floor;
                this.f2 = td4.A(1.0f, this.T1, 0.0f, (gm.L(7.0f) * E1) + gm.L(1.3f) + f19);
                this.h2 = (((float) Math.floor(gm.p * 11.0f)) * E1) + f19 + gm.L(24.0f);
                if (this.G1) {
                    f10 = (this.p6 - gm.L(109.0f)) + gm.L(48.0f);
                } else {
                    f10 = -gm.N(46.0f);
                }
                vq8 vq8Var = this.K6;
                if (vq8Var != null) {
                    vq8Var.setAlpha((int) (255.0f * E1));
                }
                int measuredWidth2 = this.a.getMeasuredWidth();
                this.f.setScaleX(f8);
                this.f.setScaleY(f8);
                if (this.G1) {
                    f11 = gm.R1(k2(1), 1.0f, E1);
                } else {
                    f11 = 1.0f;
                }
                this.r.setScaleX(f11);
                this.r.setScaleY(f11);
                R2(0, E1, false);
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                float f20 = measuredWidth2 / f2;
                float min2 = f20 - (((Math.min(this.f.getExactWidth(), layoutParams5.width) * f8) * 0.5f) + layoutParams5.leftMargin);
                float f21 = ((FrameLayout.LayoutParams) this.r.getLayoutParams()).width;
                if (!this.A5 && this.r.getExactWidth() <= (f21 - this.r.getPaddingLeft()) - this.r.getPaddingRight()) {
                    f12 = this.r.getPaddingLeft();
                } else {
                    f12 = 0.0f;
                }
                float min3 = f20 - ((Math.min(this.r.getExactWidth(), f21) * 0.5f) + (layoutParams.leftMargin + f12));
                this.e2 = min2;
                this.g2 = min3;
                this.H6 = f12;
                if (this.G1) {
                    min2 = gm.R1(l2(f10, 0, this.f), min2, E1);
                    min3 = gm.R1(l2(f10, 1, this.r), min3, E1);
                }
                ValueAnimator valueAnimator5 = this.k2;
                if (valueAnimator5 == null || !valueAnimator5.isRunning()) {
                    this.f.setTranslationX(min2);
                    this.f.setTranslationY(this.f2);
                    this.r.setTranslationX(h2(min3, this.H6 * E1));
                    this.r.setTranslationY(i2(this.h2));
                }
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                int i12 = layoutParams6.width;
                if (gm.O1()) {
                    i4 = gm.L(490.0f);
                } else {
                    i4 = gm.q.x;
                }
                int min4 = Math.min(layoutParams6.width, (int) (((i4 - gm.L(f3)) / this.f.getScaleX()) - (this.f.getTranslationX() + layoutParams6.leftMargin)));
                layoutParams6.width = min4;
                if (min4 != i12) {
                    this.f.requestLayout();
                }
                N3();
            }
            ValueAnimator valueAnimator6 = this.k2;
            if (valueAnimator6 == null || !valueAnimator6.isRunning()) {
                R2(0, E1, true);
            }
        }
        T3(currentActionBarHeight);
        if (E1 >= 1.0f) {
            this.f0.setAlpha(1.0f);
        }
    }

    public final void Q3(float f) {
        int R0;
        ec7 ec7Var = this.s6;
        if (ec7Var != null) {
            R0 = on2.f(0.25f, ec7Var.m(cmb.I.o()), -1);
        } else {
            R0 = gm.R0(this.b6, 1.0f, cmb.v0(cmb.pi, this.A0), cmb.v0(cmb.Ej, this.A0));
        }
        int f2 = on2.f(f, R0, -1);
        int i = cmb.Ej;
        int f3 = on2.f(Math.max(this.b6, this.L5), f2, cmb.v0(i, this.A0));
        tm tmVar = this.G;
        if (tmVar != null) {
            tmVar.k(Integer.valueOf(f3));
        }
        tm tmVar2 = this.H;
        if (tmVar2 != null) {
            tmVar2.k(Integer.valueOf(on2.f(this.b6, on2.f(f, R0, -1711276033), cmb.v0(i, this.A0))));
        }
        this.e0.setColor(f3);
        this.r6 = f;
    }

    public final void R1(float f) {
        boolean z;
        ValueAnimator ofFloat;
        long j;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        this.fragmentView.invalidate();
        AnimatorSet animatorSet = this.v6;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.v6 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z) {
            ofFloat = ValueAnimator.ofFloat(0.0f, f);
            arrayList.add(ofFloat);
        } else {
            ofFloat = ValueAnimator.ofFloat(this.y0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new bo8(this, (byte) 0));
        this.v6.playTogether(arrayList);
        AnimatorSet animatorSet2 = this.v6;
        if (z) {
            j = 150;
        } else {
            j = 220;
        }
        animatorSet2.setDuration(j);
        if (!z) {
            this.v6.addListener(new cp8(this, (byte) 6));
        }
        this.v6.start();
    }

    public final void R2(int r11, float r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.R2(int, float, boolean):void");
    }

    public final void R3() {
        this.e0.setScaleX(this.f.getScaleX());
        this.e0.setScaleY(this.f.getScaleY());
        this.e0.b((this.f.getScaleX() * this.f.getRightDrawableX()) + this.f.getX(), (this.f.getHeight() - (this.f.getScaleY() * (this.f.getHeight() - this.f.getRightDrawableY()))) + this.f.getY());
    }

    public final void S1(int i, View view) {
        boolean z;
        bu5 I = bu5.I(this, view);
        I.X(this.a.V0(view, false));
        I.w = false;
        if (this.w2 != null) {
            z = true;
        } else {
            z = false;
        }
        I.k(2131232109, jb6.M0(2131751704, null), new v56(this, (byte) 4), z);
        I.b(2131232122, jb6.M0(2131751272, null), new v56(this, (byte) 5), false);
        I.b(2131232114, jb6.M0(2131746054, null), new ge7(this, i, (byte) 7), true);
        I.a0();
    }

    public final void S3() {
        if (!this.q1 && sd2.c0(this.F2)) {
            lo7 notificationsController = getNotificationsController();
            notificationsController.getMessagesStorage().a.c(new of2(notificationsController, -this.f1, new jo8(this, (byte) 0), (byte) 6));
        }
    }

    public final boolean T1(final int i, View view) {
        TLRPC.User f;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        if (this.s1 && (f = getUserConfig().f()) != null) {
            final TLRPC.UserFull userFull = this.w2;
            if (userFull == null) {
                userFull = getMessagesController().X1(f.id);
            }
            if (userFull != null) {
                String M0 = jb6.M0(2131751704, null);
                String M02 = jb6.M0(2131743879, null);
                if (i != this.L3 && i != this.K3 && i != this.X2) {
                    if (i == this.P3) {
                        str = ss7.k0(this.currentAccount, f, userFull.business_work_hours);
                        M0 = jb6.M0(2131746398, null);
                        M02 = jb6.M0(2131752714, null);
                    } else if (i == this.Q3) {
                        str = userFull.business_location.address;
                        M0 = jb6.M0(2131746393, null);
                        M02 = jb6.M0(2131752646, null);
                    } else if (i == this.M3) {
                        str = m9c.p(f);
                        if (str != null) {
                            str = "@".concat(str);
                        }
                        M0 = jb6.M0(2131746411, null);
                        M02 = jb6.M0(2131743352, null);
                    } else if (i == this.H3) {
                        str = f.phone;
                        M02 = jb6.M0(2131747028, null);
                    } else if (i == this.V2) {
                        str = UserInfoActivity.d0(this.w2.birthday);
                        M02 = jb6.M0(2131753681, null);
                    } else {
                        str = null;
                    }
                } else {
                    str = userFull.about;
                    if (i == this.X2) {
                        M02 = jb6.M0(2131753686, null);
                    }
                }
                bu5 I = bu5.I(this, view);
                I.X(this.a.V0(view, false));
                I.w = false;
                I.i = (byte) 3;
                if (i == this.Q3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        I.b(2131232426, jb6.M0(2131746389, null), new v56(this, (byte) 7), false);
                    }
                    I.b(2131232219, jb6.M0(2131746391, null), new v56(this, (byte) 9), false);
                }
                if (str != null) {
                    I.b(2131232109, M0, new ak8(this, str, M02, (byte) 1), false);
                }
                if (i == this.P3) {
                    I.b(2131232122, jb6.M0(2131746397, null), new v56(this, (byte) 10), false);
                    I.b(2131232114, jb6.M0(2131746396, null), new Runnable(this) {
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
                                    RectF rectF = ProfileActivity.e7;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = jb6.M0(2131752715, null);
                                    he heVar = alertDialog$Builder.a;
                                    heVar.S = M03;
                                    heVar.U = jb6.M0(2131752716, null);
                                    alertDialog$Builder.j(jb6.M0(2131746054, null), new ee() {
                                        @Override
                                        public final void r(he heVar2, int i3) {
                                            byte b2 = r4;
                                            int i4 = i2;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (b2) {
                                                case 0:
                                                    RectF rectF2 = ProfileActivity.e7;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new eo8(profileActivity2, (byte) 3));
                                                    profileActivity2.i4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.e7;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new eo8(profileActivity2, (byte) 2));
                                                    profileActivity2.i4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                    profileActivity.showDialog(heVar);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.e7;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = jb6.M0(2131752647, null);
                                    he heVar2 = alertDialog$Builder2.a;
                                    heVar2.S = M04;
                                    heVar2.U = jb6.M0(2131752648, null);
                                    alertDialog$Builder2.j(jb6.M0(2131746054, null), new ee() {
                                        @Override
                                        public final void r(he heVar22, int i3) {
                                            byte b2 = r4;
                                            int i4 = i2;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (b2) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.e7;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new eo8(profileActivity2, (byte) 3));
                                                    profileActivity2.i4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.e7;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new eo8(profileActivity2, (byte) 2));
                                                    profileActivity2.i4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                                    profileActivity.showDialog(heVar2);
                                    return;
                            }
                        }
                    }, true);
                } else if (i == this.Q3) {
                    I.b(2131232122, jb6.M0(2131746392, null), new v56(this, (byte) 11), false);
                    I.b(2131232114, jb6.M0(2131746390, null), new Runnable(this) {
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
                                    RectF rectF = ProfileActivity.e7;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = jb6.M0(2131752715, null);
                                    he heVar = alertDialog$Builder.a;
                                    heVar.S = M03;
                                    heVar.U = jb6.M0(2131752716, null);
                                    alertDialog$Builder.j(jb6.M0(2131746054, null), new ee() {
                                        @Override
                                        public final void r(he heVar22, int i3) {
                                            byte b2 = r4;
                                            int i4 = i2;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (b2) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.e7;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new eo8(profileActivity2, (byte) 3));
                                                    profileActivity2.i4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.e7;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new eo8(profileActivity2, (byte) 2));
                                                    profileActivity2.i4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                    profileActivity.showDialog(heVar);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.e7;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = jb6.M0(2131752647, null);
                                    he heVar2 = alertDialog$Builder2.a;
                                    heVar2.S = M04;
                                    heVar2.U = jb6.M0(2131752648, null);
                                    alertDialog$Builder2.j(jb6.M0(2131746054, null), new ee() {
                                        @Override
                                        public final void r(he heVar22, int i3) {
                                            byte b2 = r4;
                                            int i4 = i2;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (b2) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.e7;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new eo8(profileActivity2, (byte) 3));
                                                    profileActivity2.i4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.e7;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new eo8(profileActivity2, (byte) 2));
                                                    profileActivity2.i4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                                    profileActivity.showDialog(heVar2);
                                    return;
                            }
                        }
                    }, true);
                } else if (i == this.M3) {
                    I.b(2131232122, jb6.M0(2131746353, null), new v56(this, (byte) 12), false);
                } else if (i != this.L3 && i != this.K3 && i != this.X2) {
                    if (i == this.H3) {
                        I.b(2131231899, jb6.M0(2131746379, null), new v56(this, (byte) 14), false);
                    } else if (i == this.V2) {
                        I.b(2131232122, jb6.M0(2131746458, null), new Runnable(this) {
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
                                        RectF rectF = ProfileActivity.e7;
                                        profileActivity.showDialog((my0) ik.l(profileActivity.getParentActivity(), jb6.M0(2131751175, null), jb6.M0(2131751180, null), userFull2.birthday, new u35(profileActivity, userFull2, (byte) 20), new v56(profileActivity, (byte) 15), false, false, profileActivity.A0).b);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.e7;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M03 = jb6.M0(2131753682, null);
                                        he heVar = alertDialog$Builder.a;
                                        heVar.S = M03;
                                        heVar.U = jb6.M0(2131753683, null);
                                        alertDialog$Builder.j(jb6.M0(2131746054, null), new ee() {
                                            @Override
                                            public final void r(he heVar2, int i2) {
                                                byte b2 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (b2) {
                                                    case 0:
                                                        RectF rectF3 = ProfileActivity.e7;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new eo8(profileActivity2, (byte) 0));
                                                        profileActivity2.c4(false, false);
                                                        profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.e7;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().i2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new eo8(profileActivity2, (byte) 1));
                                                        profileActivity2.c4(false, false);
                                                        profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                        profileActivity.showDialog(heVar);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.e7;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M04 = jb6.M0(2131746415, null);
                                        he heVar2 = alertDialog$Builder2.a;
                                        heVar2.S = M04;
                                        heVar2.U = jb6.M0(2131746416, null);
                                        alertDialog$Builder2.j(jb6.M0(2131746054, null), new ee() {
                                            @Override
                                            public final void r(he heVar22, int i2) {
                                                byte b2 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (b2) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.e7;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new eo8(profileActivity2, (byte) 0));
                                                        profileActivity2.c4(false, false);
                                                        profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.e7;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().i2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new eo8(profileActivity2, (byte) 1));
                                                        profileActivity2.c4(false, false);
                                                        profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                                        profileActivity.showDialog(heVar2);
                                        return;
                                }
                            }
                        }, false);
                        I.b(2131232114, jb6.M0(2131746054, null), new Runnable(this) {
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
                                        RectF rectF = ProfileActivity.e7;
                                        profileActivity.showDialog((my0) ik.l(profileActivity.getParentActivity(), jb6.M0(2131751175, null), jb6.M0(2131751180, null), userFull2.birthday, new u35(profileActivity, userFull2, (byte) 20), new v56(profileActivity, (byte) 15), false, false, profileActivity.A0).b);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.e7;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M03 = jb6.M0(2131753682, null);
                                        he heVar = alertDialog$Builder.a;
                                        heVar.S = M03;
                                        heVar.U = jb6.M0(2131753683, null);
                                        alertDialog$Builder.j(jb6.M0(2131746054, null), new ee() {
                                            @Override
                                            public final void r(he heVar22, int i2) {
                                                byte b2 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (b2) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.e7;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new eo8(profileActivity2, (byte) 0));
                                                        profileActivity2.c4(false, false);
                                                        profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.e7;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().i2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new eo8(profileActivity2, (byte) 1));
                                                        profileActivity2.c4(false, false);
                                                        profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                        profileActivity.showDialog(heVar);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.e7;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M04 = jb6.M0(2131746415, null);
                                        he heVar2 = alertDialog$Builder2.a;
                                        heVar2.S = M04;
                                        heVar2.U = jb6.M0(2131746416, null);
                                        alertDialog$Builder2.j(jb6.M0(2131746054, null), new ee() {
                                            @Override
                                            public final void r(he heVar22, int i2) {
                                                byte b2 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (b2) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.e7;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new eo8(profileActivity2, (byte) 0));
                                                        profileActivity2.c4(false, false);
                                                        profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.e7;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().i2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new eo8(profileActivity2, (byte) 1));
                                                        profileActivity2.c4(false, false);
                                                        profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                                        profileActivity.showDialog(heVar2);
                                        return;
                                }
                            }
                        }, true);
                    } else if (i == this.R2) {
                        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(userFull.personal_channel_id));
                        if (L0 != null && sd2.K(L0, false) != null) {
                            I.b(2131232109, jb6.M0(2131746414, null), new mn8(this, L0, (byte) 5), false);
                        }
                        I.b(2131232122, jb6.M0(2131746417, null), new v56(this, (byte) 8), false);
                        I.b(2131232114, jb6.M0(2131746054, null), new Runnable(this) {
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
                                        RectF rectF = ProfileActivity.e7;
                                        profileActivity.showDialog((my0) ik.l(profileActivity.getParentActivity(), jb6.M0(2131751175, null), jb6.M0(2131751180, null), userFull2.birthday, new u35(profileActivity, userFull2, (byte) 20), new v56(profileActivity, (byte) 15), false, false, profileActivity.A0).b);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.e7;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M03 = jb6.M0(2131753682, null);
                                        he heVar = alertDialog$Builder.a;
                                        heVar.S = M03;
                                        heVar.U = jb6.M0(2131753683, null);
                                        alertDialog$Builder.j(jb6.M0(2131746054, null), new ee() {
                                            @Override
                                            public final void r(he heVar22, int i2) {
                                                byte b2 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (b2) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.e7;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new eo8(profileActivity2, (byte) 0));
                                                        profileActivity2.c4(false, false);
                                                        profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.e7;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().i2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new eo8(profileActivity2, (byte) 1));
                                                        profileActivity2.c4(false, false);
                                                        profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                        profileActivity.showDialog(heVar);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.e7;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M04 = jb6.M0(2131746415, null);
                                        he heVar2 = alertDialog$Builder2.a;
                                        heVar2.S = M04;
                                        heVar2.U = jb6.M0(2131746416, null);
                                        alertDialog$Builder2.j(jb6.M0(2131746054, null), new ee() {
                                            @Override
                                            public final void r(he heVar22, int i2) {
                                                byte b2 = r3;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (b2) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.e7;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new eo8(profileActivity2, (byte) 0));
                                                        profileActivity2.c4(false, false);
                                                        profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.e7;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().i2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new eo8(profileActivity2, (byte) 1));
                                                        profileActivity2.c4(false, false);
                                                        profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                                        profileActivity.showDialog(heVar2);
                                        return;
                                }
                            }
                        }, true);
                    }
                } else {
                    I.b(2131232122, jb6.M0(2131746410, null), new v56(this, (byte) 13), false);
                }
                if (I.y() > 0) {
                    I.a0();
                    return true;
                }
            }
        }
        return false;
    }

    public final void T2(boolean z) {
        boolean z2;
        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.e1));
        if (W1 != null) {
            if (this.s2 && !oc7.G2(W1)) {
                if (this.k1 && !z) {
                    getMessagesController().n5(new v56(this, (byte) 6), this.e1);
                    finishFragment();
                    return;
                }
                TLRPC.Chat chat = this.F2;
                if (this.E2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ik.r(this, false, chat, W1, z2, true, false, true, new wn8(this, W1));
            } else if (this.k1) {
                getMessagesController().n5(null, this.e1);
                if (c41.a(this)) {
                    c41.d(this, false).j();
                }
            } else if (this.l1) {
                ik.g0(this, this.e1, W1, null, this.E2, false, null, new zf1(this, (byte) 5), this.A0);
            } else {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.A0, getParentActivity());
                String M0 = jb6.M0(2131753657, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = gm.S2(jb6.a0("AreYouSureBlockContact2", null, 2131754084, bw2.m(0, W1.first_name, W1.last_name)));
                alertDialog$Builder.j(jb6.M0(2131753658, null), new tn8(this, (byte) 2));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                showDialog(heVar);
                TextView textView = (TextView) heVar.c(-1);
                if (textView != null) {
                    anb.X(textView, cmb.p7, this.A0);
                }
            }
        }
    }

    public final void T3(float f) {
        mq8 mq8Var;
        ValueAnimator valueAnimator;
        if (this.q2 || ((mq8Var = this.N) != null && (valueAnimator = mq8Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.N.getLayoutParams();
            layoutParams.width = this.a.getMeasuredWidth();
            layoutParams.height = (int) (this.Q1 + f);
            this.N.requestLayout();
        }
        xq8 xq8Var = this.d1;
        if (xq8Var != null) {
            xq8Var.F.setTranslate(0.0f, this.b2 - xq8Var.y);
            xq8 xq8Var2 = this.d1;
            RadialGradient radialGradient = xq8Var2.E;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(xq8Var2.F);
            }
            this.d1.invalidate();
        }
        R3();
        K3();
        d4();
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        gm.c3(new xi1(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, (byte) 5));
    }

    public final boolean U1() {
        u69 u69Var;
        View view;
        if ((this.J0 || (!gm.O1() && !this.o2)) && this.f0.getImageReceiver().E() && !gm.A1()) {
            this.G0 = true;
            this.p2 = true;
            int i = 0;
            while (true) {
                u69Var = null;
                if (i < this.a.getChildCount()) {
                    if (RecyclerView.R(this.a.getChildAt(i)) == 0) {
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
                po8 po8Var = this.a;
                View F = po8Var.F(view);
                if (F != null) {
                    u69Var = po8Var.T(F);
                }
                if (u69Var != null) {
                    Integer num = (Integer) this.Z1.get(Integer.valueOf(u69Var.b()));
                    if (num != null) {
                        this.P1 = true;
                        this.a.x0(0, -(((this.a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), d53.h);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void U2(boolean z) {
        boolean z2 = false;
        if (this.e1 != 0) {
            TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.e1));
            if (W1 != null) {
                TLRPC.UserFull userFull = this.w2;
                if (userFull != null && userFull.video_calls_available) {
                    z2 = true;
                }
                sic.m(W1, z, z2, getParentActivity(), this.w2, getAccountInstance());
            }
        } else if (this.f1 != 0) {
            qd2 f1 = getMessagesController().f1(this.f1, false, null);
            TLRPC.Chat chat = this.F2;
            if (f1 == null) {
                j5 accountInstance = getAccountInstance();
                if (getParentActivity() != null) {
                    wv5.D0(getParentActivity(), -chat.id, accountInstance, new jq9(chat, this, accountInstance, (byte) 11));
                    return;
                }
                return;
            }
            sic.l(chat, null, false, null, getParentActivity(), this, getAccountInstance());
        }
    }

    public final void U3() {
        float min = Math.min(this.d2, 0.25f) / 0.25f;
        boolean z = this.q1;
        bt8 bt8Var = this.u0;
        float f = 1.0f;
        if (z) {
            bt8Var.setAlpha(1.0f - min);
            this.u0.setBlurIntensity(0.0f);
            int i = 0;
            this.u0.setGooeyEnabled(false);
            bt8 bt8Var2 = this.u0;
            if (this.d2 >= 1.0f) {
                i = 8;
            }
            bt8Var2.setVisibility(i);
        } else {
            bt8Var.setHideProgress(this.d2);
        }
        bp8 bp8Var = this.v0;
        if (bp8Var != null && this.J1 != 2) {
            float f2 = this.d2;
            if (f2 > 0.0f) {
                f = gm.R1(1.0f, 0.0f, gm.x1(f2, 0.0f, 0.5f));
            }
            bp8Var.setAlpha(f);
        }
        W3();
    }

    public final void V1() {
        TLRPC.Chat chat = this.F2;
        if (chat != null && chat.megagroup) {
            TLRPC.ChatFull chatFull = this.v2;
            if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants != null) {
                for (int i = 0; i < this.v2.participants.participants.size(); i++) {
                    TLRPC.ChatParticipant chatParticipant = this.v2.participants.participants.get(i);
                    this.C1.k(chatParticipant, chatParticipant.user_id);
                }
            }
        }
    }

    public final void V2() {
        TLRPC.UserFull userFull = this.w2;
        if (userFull != null && m9c.c(userFull)) {
            org.telegram.ui.ActionBar.d S = LaunchActivity.S();
            if (S != null) {
                b10.u(jb6.a0(null, null, 2131743429, pg3.s(a())), c41.b0(S), 2131624012, 36);
                return;
            }
            return;
        }
        if (this.F2 != null) {
            jg5.h.a();
        }
        showDialog(new ux4(getParentActivity(), this.currentAccount, a(), null, null));
    }

    public final void V3() {
        if (this.simpleActionBar != null) {
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            if (aVar != null && aVar.getVisibility() != 4) {
                this.actionBar.setVisibility(4);
            }
            float E1 = 1.0f - ((1.0f - E1()) * this.simpleActionBar.getActionModeFactor());
            su suVar = this.Z;
            if (suVar != null && this.R1 != E1) {
                this.R1 = E1;
                suVar.invalidate();
            }
        }
    }

    @Override
    public final void W() {
        int i;
        String str;
        int size;
        int i2;
        wp8 wp8Var = this.O;
        if (wp8Var != null && this.r != null) {
            int closestTab = wp8Var.getClosestTab();
            int[] iArr = this.R.c;
            int i3 = 0;
            if (closestTab == 0) {
                if (iArr[7] <= 0 && iArr[6] <= 0) {
                    int i4 = iArr[0];
                    if (i4 <= 0) {
                        A3(jb6.M0(2131745143, null));
                    } else {
                        A3(jb6.G(i4, "Media", new Object[0]));
                    }
                } else if (this.O.getPhotosVideosTypeFilter() != 1 && iArr[7] > 0) {
                    if (this.O.getPhotosVideosTypeFilter() != 2 && (i2 = iArr[6]) > 0) {
                        A3(jb6.G(i2, "Photos", new Object[0]) + ", " + jb6.G(iArr[7], "Videos", new Object[0]));
                        return;
                    }
                    A3(jb6.G(iArr[7], "Videos", new Object[0]));
                } else {
                    A3(jb6.G(iArr[6], "Photos", new Object[0]));
                }
            } else if (closestTab == 1) {
                int i5 = iArr[1];
                if (i5 <= 0) {
                    A3(jb6.M0(2131750763, null));
                } else {
                    A3(jb6.G(i5, "Files", new Object[0]));
                }
            } else if (closestTab == 2) {
                int i6 = iArr[2];
                if (i6 <= 0) {
                    A3(jb6.M0(2131743207, null));
                } else {
                    A3(jb6.G(i6, "Voice", new Object[0]));
                }
            } else if (closestTab == 3) {
                int i7 = iArr[3];
                if (i7 <= 0) {
                    A3(jb6.M0(2131745145, null));
                } else {
                    A3(jb6.G(i7, "Links", new Object[0]));
                }
            } else if (closestTab == 4) {
                int i8 = iArr[4];
                if (i8 <= 0) {
                    A3(jb6.M0(2131748076, null));
                } else {
                    A3(jb6.G(i8, "MusicFiles", new Object[0]));
                }
            } else if (closestTab == 5) {
                int i9 = iArr[5];
                if (i9 <= 0) {
                    A3(jb6.M0(2131754879, null));
                } else {
                    A3(jb6.G(i9, "GIFs", new Object[0]));
                }
            } else if (closestTab == 6) {
                A3(jb6.G(this.w2.common_chats_count, "CommonGroups", new Object[0]));
            } else if (closestTab == 7) {
                A3(this.r.getText());
            } else if (closestTab != 8 && !nha.t0(closestTab)) {
                if (closestTab == 13) {
                    A3(this.O.O(true));
                } else if (closestTab == 9) {
                    A3(jb6.G(this.O.W(closestTab), "ProfileStoriesArchiveCount", new Object[0]));
                } else if (closestTab == 10) {
                    qb7 K0 = oc7.r1(this.currentAccount).K0(a());
                    if (this.s2) {
                        str = "Bots";
                    } else {
                        str = "Channels";
                    }
                    if (K0 == null) {
                        size = 0;
                    } else {
                        size = K0.b.size() + K0.c;
                    }
                    A3(jb6.G(size, str, new Object[0]));
                } else if (closestTab == 12) {
                    wr9 E1 = getMessagesController().E1();
                    long a = a();
                    ArrayList arrayList = E1.j;
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            vr9 vr9Var = (vr9) arrayList.get(i10);
                            if (vr9Var.a == a) {
                                i = vr9Var.e;
                                break;
                            }
                            i10++;
                        } else {
                            i = 0;
                            break;
                        }
                    }
                    A3(jb6.G(Math.max(1, i), "SavedMessagesCount", new Object[0]));
                } else if (closestTab == 14) {
                    lea leaVar = this.O.b0;
                    if (leaVar != null) {
                        i3 = leaVar.getGiftsCount();
                    }
                    A3(jb6.H(',', "ProfileGiftsCount", i3));
                } else if (closestTab == 15) {
                    int i11 = iArr[8];
                    if (i11 <= 0) {
                        A3(jb6.M0(2131745137, null));
                    } else {
                        A3(jb6.H(',', "ProfilePollsCount", i11));
                    }
                }
            } else {
                boolean z = this.s2;
                wp8 wp8Var2 = this.O;
                if (z) {
                    A3(wp8Var2.O(false));
                } else if (wp8Var2.W(closestTab) > 0) {
                    A3(jb6.G(this.O.W(closestTab), "ProfileStoriesCount", new Object[0]));
                } else {
                    A3(jb6.M0(2131746358, null));
                }
            }
        }
    }

    public final boolean W1() {
        tk5 tk5Var;
        if (this.J1 != 0 && (tk5Var = this.parentLayout) != null && tk5Var.getFragmentStack() != null && this.parentLayout.getFragmentStack().size() >= 2 && (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof yv1)) {
            finishFragment();
            return true;
        }
        return false;
    }

    public final void W2(boolean z) {
        boolean[] zArr = {true};
        getMessagesController().k(this.F2.id, getUserConfig().f(), null, this, true, new yl6(this, z, zArr, (byte) 16), new wg(this, zArr, z, this.parentLayout.getLastFragment(), (byte) 5));
        nm7.e().k(nm7.M4, new Object[0]);
    }

    public final void W3() {
        boolean z;
        boolean z2;
        boolean z3;
        float a;
        float f = 0.0f;
        if (!this.q1 && !this.G1) {
            int Y1 = Y1();
            if (Y1 > 0) {
                a = pqe.a(1.0f - (this.Q1 / Y1), 0.0f, 1.0f);
            } else {
                a = pqe.a((this.d2 - 0.6f) / 0.4f, 0.0f, 1.0f);
            }
            f = a;
        }
        float f2 = this.L5;
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
            this.L5 = f;
            mt1 mt1Var = this.f;
            if (mt1Var != null) {
                mt1Var.setTextColor(this.O5);
            }
            ap8 ap8Var = this.r;
            if (ap8Var != null) {
                ap8Var.setTextColor(this.P5);
            }
            P3();
            if (z3) {
                nm7.e().k(nm7.v4, Boolean.TRUE);
            }
            xq8 xq8Var = this.d1;
            if (xq8Var != null) {
                xq8Var.invalidate();
            }
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        Z3();
        Y3();
    }

    public final void X1() {
        if (this.a == null) {
            return;
        }
        float v = aq1.v(((FrameLayout.LayoutParams) this.Y.getLayoutParams()).width, this.c2, 0.5f, this.a.getMeasuredWidth() / 2.0f);
        this.a2 = v;
        if (this.G1) {
            v = gm.R1(this.p6, v, this.T1);
            this.a2 = v;
        }
        this.Y.setTranslationX(v);
    }

    public final void X2(android.view.View r17, float r18, float r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.X2(android.view.View, float, float, boolean):void");
    }

    public final void X3() {
        wp8 wp8Var = this.O;
        if (wp8Var != null && this.g6 != 0) {
            int topPanelShift = wp8Var.getTopPanelShift();
            int i = 0;
            if (topPanelShift > 0 && this.O.isAttachedToWindow()) {
                if (this.O.getParent() == this.a) {
                    topPanelShift = Math.max(0, topPanelShift - Math.max(0, (int) this.O.getY()));
                }
                i = topPanelShift;
            }
            int i2 = this.g6 + i;
            x3(i2, this.M5);
            x3(i2, this.e6);
        }
    }

    @Override
    public final boolean Y() {
        return this.A1;
    }

    public final int Y1() {
        int i = 0;
        if (this.e1 != 0 && this.r0 != null && !this.s1) {
            return 0;
        }
        return gm.L(74 + ((this.Q4 || this.R4) ? 25 : 25));
    }

    public final void Y2() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.e1 != 0) {
                TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.e1));
                if (W1 != null) {
                    if (this.G2 != null && (userFull = this.w2) != null && !TextUtils.isEmpty(userFull.about)) {
                        str = String.format("%s https://" + getMessagesController().N2 + "/%s", this.w2.about, m9c.p(W1));
                    } else {
                        str = String.format("https://" + getMessagesController().N2 + "/%s", m9c.p(W1));
                    }
                } else {
                    return;
                }
            } else if (this.f1 != 0) {
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.f1));
                if (L0 != null) {
                    TLRPC.ChatFull chatFull = this.v2;
                    if (chatFull != null && !TextUtils.isEmpty(chatFull.about)) {
                        str = String.format("%s\nhttps://" + getMessagesController().N2 + "/%s", this.v2.about, sd2.K(L0, false));
                    } else {
                        str = String.format("https://" + getMessagesController().N2 + "/%s", sd2.K(L0, false));
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
            startActivityForResult(Intent.createChooser(intent, jb6.M0(2131752935, null)), 500);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void Y3() {
        boolean z;
        float f;
        if (this.M5 != null && this.e6 != null) {
            wp8 wp8Var = this.O;
            int i = 0;
            if (wp8Var != null && wp8Var.getParent() == this.a && this.O.isAttachedToWindow()) {
                z = true;
            } else {
                z = false;
            }
            float max = Math.max(Math.min(this.L5, this.W5), this.b6);
            View view = this.M5;
            if (z) {
                f = 0.0f;
            } else {
                f = max;
            }
            view.setAlpha(f);
            this.M5.setVisibility((z || max <= 0.0f) ? 8 : 8);
            View view2 = this.e6;
            if (!z) {
                max = 0.0f;
            }
            view2.setAlpha(max);
            if (z) {
                this.e6.setTranslationY(-(this.O.getY() + this.a.getY()));
            }
        }
    }

    public final int Z1(ImageReceiver imageReceiver) {
        if (imageReceiver.t() instanceof jbc) {
            return ((jbc) imageReceiver.t()).a.a();
        }
        return gm.p(this.f0.getImageReceiver().n());
    }

    public final void Z2(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.M3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f1);
            bundle.putLong("user_id", this.e1);
            presentFragment(new iy8(bundle));
        } else if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.V2) {
            if (this.e1 == getUserConfig().e()) {
                presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
            } else if (m9c.c(this.w2)) {
                b10.u(jb6.a0(null, null, 2131743429, pg3.s(this.e1)), c41.b0(this), 2131624012, 36);
            } else {
                showDialog(new ux4(getParentActivity(), this.currentAccount, this.e1, null, null));
            }
        }
    }

    public final void Z3() {
        if (this.simpleActionBar != null && this.R5 != null) {
            fr8 fr8Var = this.T5;
            if (fr8Var != null) {
                float g2 = g2();
                if (fr8Var.l != g2) {
                    fr8Var.l = g2;
                    fr8Var.a();
                }
            }
            int f = on2.f(g2(), this.N5, cmb.v0(cmb.F6, this.A0));
            if (this.Q5 != f) {
                this.Q5 = f;
                rja rjaVar = this.simpleActionBar;
                rjaVar.m0 = true;
                rjaVar.g0 = f;
                rjaVar.updateColors();
            }
            int K1 = this.S5.K1();
            if (this.V5 != K1) {
                this.V5 = K1;
                rja rjaVar2 = this.simpleActionBar;
                im0 im0Var = rjaVar2.I;
                if (im0Var != null) {
                    im0Var.updateColors();
                    rjaVar2.J.updateColors();
                    rjaVar2.K.updateColors();
                }
                rjaVar2.invalidate();
                bka bkaVar = rjaVar2.R;
                if (bkaVar != null) {
                    bkaVar.invalidate();
                }
            }
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

    public final tm a2(long j) {
        if (this.H == null) {
            tm tmVar = new tm(gm.L(17.0f), 2, this.f, false);
            this.H = tmVar;
            int L = gm.L(1.0f);
            tmVar.J = 0;
            tmVar.K = L;
            if (this.H0) {
                this.H.a();
            }
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        tm tmVar2 = this.H;
        if (i != 0) {
            tmVar2.j(j, false);
        } else {
            tmVar2.g(null, false);
        }
        P3();
        return this.H;
    }

    public final void a3() {
        boolean z;
        p09 p09Var;
        if (this.e1 != 0) {
            if (this.r0 != null) {
                TLRPC.User W1 = oc7.r1(this.currentAccount).W1(Long.valueOf(z8c.h(this.currentAccount).e()));
                if (W1 == null) {
                    W1 = z8c.h(this.currentAccount).f();
                }
                if (W1 != null) {
                    wn5 wn5Var = this.r0;
                    TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    wn5Var.n(z, new v56(this, (byte) 28), new qj8(this, (byte) 2), 0);
                    this.V.H(0);
                    this.V.K(43);
                    this.W.H(0);
                    this.W.K(43);
                    qn8 qn8Var = this.a0;
                    if (qn8Var != null) {
                        nn8 i = qn8.i(14, qn8Var.a);
                        if (i != null && (p09Var = i.k) != null) {
                            p09Var.start();
                        }
                    } else {
                        this.s.d();
                    }
                    xib xibVar = this.N2;
                    if (xibVar != null) {
                        xibVar.getImageView().d();
                        return;
                    }
                    return;
                }
                return;
            }
            e3();
            return;
        }
        f3();
    }

    public final void a4(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        wp8 wp8Var;
        if (this.T0 != null) {
            boolean z8 = false;
            if (!this.c6 && ((wp8Var = this.O) == null || !wp8Var.o0())) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z9 = this.q2;
            zja zjaVar = this.Q0;
            if (z2 && !z9 && this.M0) {
                z3 = true;
            } else {
                z3 = false;
            }
            y3(zjaVar, z3, z);
            zja zjaVar2 = this.R0;
            if (z2 && !z9 && this.N0) {
                z4 = true;
            } else {
                z4 = false;
            }
            y3(zjaVar2, z4, z);
            zja zjaVar3 = this.S0;
            if (z2 && this.O0) {
                z5 = true;
            } else {
                z5 = false;
            }
            y3(zjaVar3, z5, z);
            wp8 wp8Var2 = this.O;
            if (wp8Var2 != null && wp8Var2.J != null && wp8Var2.f0(wp8Var2.getClosestTab()) && !this.O.o0()) {
                z6 = true;
            } else {
                z6 = false;
            }
            zja zjaVar4 = this.T0;
            if (z && !z6) {
                z7 = true;
            } else {
                z7 = false;
            }
            y3(zjaVar4, z2, z7);
            wp8 wp8Var3 = this.O;
            if (wp8Var3 != null) {
                boolean z10 = this.c6;
                if (z && !z6) {
                    z8 = true;
                }
                if (wp8Var3.q2 != z10) {
                    wp8Var3.q2 = z10;
                    wp8Var3.B(z, z8);
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.l6));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.d7));
        hashSet.add(Integer.valueOf(cmb.e7));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.J6));
        hashSet.add(Integer.valueOf(cmb.I6));
        hashSet.add(Integer.valueOf(cmb.xj));
        hashSet.add(Integer.valueOf(cmb.wj));
        hashSet.add(Integer.valueOf(cmb.vj));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.ki));
        hashSet.add(Integer.valueOf(cmb.H6));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.g8));
        hashSet.add(Integer.valueOf(cmb.ri));
        hashSet.add(Integer.valueOf(cmb.li));
        hashSet.add(Integer.valueOf(cmb.fd));
        hashSet.add(Integer.valueOf(cmb.e8));
    }

    public final void b2(boolean z) {
        vh6 vh6Var;
        final int i;
        if (!this.B1 && (vh6Var = this.C1) != null && this.v2 != null) {
            this.B1 = true;
            int i2 = 0;
            if (vh6Var.m() != 0 && z) {
                i = 300;
            } else {
                i = 0;
            }
            final TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = getMessagesController().g1(this.f1);
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            if (!z) {
                i2 = this.C1.m();
            }
            tL_channels_getParticipants.offset = i2;
            tL_channels_getParticipants.limit = 200;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    RectF rectF = ProfileActivity.e7;
                    gm.d3(new sn8(ProfileActivity.this, tL_error, tLObject, tL_channels_getParticipants, (byte) 0), i);
                }
            }), this.classGuid);
        }
    }

    public final void b3() {
        Bundle l = ts2.l("addToGroup", true);
        l.putLong("chatId", this.F2.id);
        oc5 oc5Var = new oc5(l);
        TLRPC.ChatFull chatFull = this.v2;
        oc5Var.J = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            vh6 vh6Var = new vh6();
            for (int i = 0; i < this.v2.participants.participants.size(); i++) {
                vh6Var.k(null, this.v2.participants.participants.get(i).user_id);
            }
            oc5Var.K = vh6Var;
        }
        oc5Var.y = new tn8(this, (byte) 0);
        presentFragment(oc5Var);
    }

    public final void b4() {
        TLRPC.User W1;
        boolean z;
        int i;
        int i2;
        if (this.s1 && this.X0 != null && this.W0 != null && (W1 = getMessagesController().W1(Long.valueOf(this.e1))) != null) {
            int i3 = 0;
            if (m9c.p(W1) != null) {
                z = true;
            } else {
                z = false;
            }
            a8 a8Var = this.X0;
            if (z) {
                i = 2131231914;
            } else {
                i = 2131231915;
            }
            a8Var.setIcon(i);
            a8 a8Var2 = this.X0;
            if (z) {
                i2 = 2131746353;
            } else {
                i2 = 2131746352;
            }
            a8Var2.setText(jb6.M0(i2, null));
            a8 a8Var3 = this.W0;
            if (m9c.p(W1) == null) {
                i3 = 8;
            }
            a8Var3.setVisibility(i3);
        }
    }

    @Override
    public final boolean c() {
        return true;
    }

    public final tm c2(TLRPC.EmojiStatus emojiStatus, boolean z) {
        if (this.G == null) {
            tm tmVar = new tm(gm.L(24.0f), 2, this.f, false);
            this.G = tmVar;
            if (this.H0) {
                tmVar.a();
            }
        }
        if (this.G.d()) {
            z = false;
        }
        this.F = null;
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((tL_emojiStatus.flags & 1) != 0 && tL_emojiStatus.until <= ((int) (System.currentTimeMillis() / 1000))) {
                this.G.g(j2(), z);
                this.G.m(false, z);
            } else {
                this.G.j(tL_emojiStatus.document_id, z);
                this.G.m(false, z);
            }
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) != 0 && tL_emojiStatusCollectible.until <= ((int) (System.currentTimeMillis() / 1000))) {
                this.G.g(j2(), z);
                this.G.m(false, z);
            } else {
                this.F = Long.valueOf(tL_emojiStatusCollectible.collectible_id);
                this.G.j(tL_emojiStatusCollectible.document_id, z);
                this.G.m(true, z);
            }
        } else {
            this.G.g(j2(), z);
            this.G.m(false, z);
        }
        P3();
        return this.G;
    }

    public final void c3() {
        if (getParentActivity() == null) {
            return;
        }
        new jc(getParentActivity(), this.currentAccount, new ao8(this, (byte) 0), this.A0).show();
    }

    public final void c4(boolean z, boolean z2) {
        if (this.d == null) {
            if (z) {
                f4(false);
            }
            i4();
        } else if (!z2 && this.a.isInLayout()) {
            po8 po8Var = this.a;
            if (!po8Var.H) {
                return;
            }
            po8Var.post(new n28((byte) 2, this, z));
        } else {
            yp8 yp8Var = new yp8(this);
            yp8Var.a = this.O2;
            yp8Var.e(yp8Var.b);
            ArrayList arrayList = yp8Var.d;
            arrayList.clear();
            ArrayList arrayList2 = yp8Var.e;
            arrayList2.clear();
            arrayList.addAll(this.Z4);
            arrayList2.addAll(this.a5);
            yp8Var.f = this.C4;
            yp8Var.g = this.D4;
            if (z) {
                f4(false);
            }
            m3();
            i4();
            yp8Var.e(yp8Var.c);
            try {
                ww7.a(yp8Var, true).c(this.d);
            } catch (Exception e) {
                fc4.g(e, true);
                this.d.f();
            }
            int i = this.w6;
            if (i >= 0) {
                this.c.g1(i, this.x6 - this.a.getPaddingTop());
            }
            gm.V3(this.a);
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
        this.s6 = null;
        super.clearViews();
    }

    @Override
    public final org.telegram.ui.ActionBar.a createActionBar(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.createActionBar(android.content.Context):org.telegram.ui.ActionBar.a");
    }

    @Override
    public final android.view.View createView(android.content.Context r53) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.createView(android.content.Context):android.view.View");
    }

    public final int d2() {
        int i;
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null && aVar.getOccupyStatusBar()) {
            i = gm.m;
        } else {
            i = 0;
        }
        return org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i;
    }

    public final void d3(boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.d3(boolean):void");
    }

    public final void d4() {
        int i;
        if (this.c0 != null && this.r != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i = gm.m;
            } else {
                i = 0;
            }
            int i2 = currentActionBarHeight + i;
            boolean z = this.G1;
            if (z && this.J1 == 2 && this.Y != null) {
                this.c0.setAlpha(this.T1);
                this.c0.f(gm.L(74.0f) + this.a.getMeasuredWidth(), Y1() - gm.L(74.0f));
                return;
            }
            if (z) {
                this.c0.setAlpha(this.T1);
            }
            float f = i2;
            float L = this.Q1 + f + gm.L(74.0f);
            float min = Math.min(Y1(), L - f);
            this.c0.f(L - min, min - gm.L(74.0f));
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        lq8 lq8Var;
        boolean z;
        tk5 tk5Var;
        Object[] objArr2;
        TLRPC.ChatFull chatFull;
        TLRPC.User W1;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        boolean z2;
        TLRPC.Chat chat;
        Object[] objArr3;
        po8 po8Var;
        po8 po8Var2;
        b59 b59Var;
        if (i != nm7.F5 && i != nm7.r3) {
            boolean z3 = true;
            int i3 = 0;
            r8 = false;
            boolean z4 = false;
            if (i == 2) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i4 = oc7.s5;
                if ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0 && (intValue & 524288) == 0) {
                    objArr3 = null;
                } else {
                    objArr3 = 1;
                }
                if (this.e1 != 0) {
                    if (objArr3 != null) {
                        h4(true);
                    }
                    if ((intValue & 1024) != 0 && (po8Var2 = this.a) != null && (b59Var = (b59) po8Var2.L(this.H3, false)) != null) {
                        this.d.t(b59Var, this.H3);
                    }
                } else if (this.f1 != 0) {
                    int i5 = intValue & 8192;
                    if (i5 != 0 || (intValue & 8) != 0 || (intValue & 16) != 0 || (intValue & 32) != 0 || (intValue & 4) != 0 || (524288 & intValue) != 0) {
                        if (i5 != 0) {
                            c4(true, false);
                        } else {
                            f4(true);
                        }
                        h4(true);
                    }
                    if (objArr3 != null && (po8Var = this.a) != null) {
                        int childCount = po8Var.getChildCount();
                        for (int i6 = 0; i6 < childCount; i6++) {
                            View childAt = this.a.getChildAt(i6);
                            if (childAt instanceof w8c) {
                                ((w8c) childAt).i(intValue);
                            }
                        }
                    }
                }
            } else if (i == nm7.g1) {
                Long l = (Long) objArr[0];
                if (this.v2 != null && (chat = this.F2) != null && chat.id == l.longValue()) {
                    this.v2.online_count = ((Integer) objArr[1]).intValue();
                    f4(true);
                    h4(false);
                }
            } else if (i != nm7.N && i != nm7.b1) {
                if (i == nm7.a0) {
                    if (this.j1) {
                        gm.c3(new mn8(this, objArr, (byte) 2));
                    }
                } else if (i == nm7.Y) {
                    TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                    TLRPC.EncryptedChat encryptedChat2 = this.E2;
                    if (encryptedChat2 != null && encryptedChat.id == encryptedChat2.id) {
                        this.E2 = encryptedChat;
                        c4(false, false);
                        s34 s34Var = this.Y1;
                        if (s34Var != null) {
                            s34Var.i();
                        }
                    }
                } else if (i == nm7.g0) {
                    boolean z5 = this.k1;
                    if (getMessagesController().x0.indexOfKey(this.e1) >= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.k1 = z2;
                    if (z5 != z2) {
                        M1(true);
                        c4(false, false);
                    }
                } else if (i == nm7.w2) {
                    Long l2 = (Long) objArr[0];
                    if (this.F2 != null) {
                        long longValue = l2.longValue();
                        TLRPC.Chat chat2 = this.F2;
                        if (longValue == chat2.id && sd2.w(14, chat2)) {
                            TLRPC.ChatFull M0 = oc7.r1(this.currentAccount).M0(l2.longValue());
                            if (M0 != null) {
                                TLRPC.ChatFull chatFull4 = this.v2;
                                if (chatFull4 != null) {
                                    M0.participants = chatFull4.participants;
                                }
                                this.v2 = M0;
                            }
                            wp8 wp8Var = this.O;
                            if (wp8Var != null) {
                                wp8Var.setChatInfo(this.v2);
                            }
                            TLRPC.ChatFull chatFull5 = this.v2;
                            if (chatFull5 != null) {
                                TLRPC.InputGroupCall inputGroupCall = chatFull5.call;
                                boolean z6 = this.p1;
                                if (inputGroupCall != null ? z6 : !z6) {
                                    M1(false);
                                }
                            }
                            bp8 bp8Var = this.v0;
                            if (bp8Var != null && (chatFull3 = this.v2) != null) {
                                bp8Var.setStories(chatFull3.stories);
                            }
                            xs8 xs8Var = this.w0;
                            if (xs8Var != null) {
                                xs8Var.a();
                            }
                            yo8 yo8Var = this.f0;
                            if (yo8Var != null) {
                                yo8Var.setHasStories(P2());
                            }
                            if (l2.longValue() != 0) {
                                boolean z7 = e21.a;
                                z3 = (getMessagesController().I3() || (chatFull2 = this.v2) == null || !chatFull2.stargifts_available) ? false : false;
                                this.T0.Q(38, z3);
                                qn8 qn8Var = this.a0;
                                if (qn8Var != null) {
                                    qn8Var.o(3, z3);
                                }
                            }
                        }
                    }
                } else if (i == nm7.T) {
                    TLRPC.ChatFull chatFull6 = (TLRPC.ChatFull) objArr[0];
                    if (this.e1 != 0 && (W1 = getMessagesController().W1(Long.valueOf(this.e1))) != null && chatFull6.id == W1.linked_community_id) {
                        c4(true, false);
                    }
                    TLRPC.Chat chat3 = this.F2;
                    if (chat3 != null && chatFull6.id == chat3.linked_community_id) {
                        c4(true, false);
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
                        V1();
                        zo8 zo8Var = this.o0;
                        if (zo8Var != null && !this.q1) {
                            zo8Var.setChatInfo(this.v2);
                        }
                        c4(true, false);
                        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.f1));
                        if (L0 != null) {
                            this.F2 = L0;
                            M1(true);
                        }
                        s34 s34Var2 = this.Y1;
                        if (s34Var2 != null) {
                            s34Var2.i();
                        }
                        if (this.F2.megagroup && (objArr2 != null || !booleanValue)) {
                            b2(true);
                        }
                        L3();
                        n4();
                        bp8 bp8Var2 = this.v0;
                        if (bp8Var2 != null && (chatFull = this.v2) != null) {
                            bp8Var2.setStories(chatFull.stories);
                        }
                        xs8 xs8Var2 = this.w0;
                        if (xs8Var2 != null) {
                            xs8Var2.a();
                        }
                        yo8 yo8Var2 = this.f0;
                        if (yo8Var2 != null) {
                            yo8Var2.setHasStories(P2());
                        }
                        wp8 wp8Var2 = this.O;
                        if (wp8Var2 != null) {
                            wp8Var2.setChatInfo(this.v2);
                        }
                    }
                } else if (i == nm7.s) {
                    removeSelfFromStack(true);
                } else if (i == nm7.u) {
                    long longValue2 = ((Long) objArr[0]).longValue();
                    boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                    if (longValue2 == a() && (tk5Var = this.parentLayout) != null && tk5Var.getFragmentStack().contains(this)) {
                        if (booleanValue2 || this.parentLayout.getLastFragment() != this) {
                            if (this.parentLayout.getLastFragment() == this) {
                                finishFragment();
                            } else {
                                removeSelfFromStack(true);
                            }
                        }
                    }
                } else if (i == nm7.D0) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) objArr[0];
                    if (botInfo.user_id == this.e1) {
                        this.G2 = botInfo;
                        c4(false, false);
                    }
                } else if (i == nm7.E0) {
                    if (((Long) objArr[0]).longValue() == this.e1) {
                        TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                        this.w2 = userFull;
                        ita itaVar = this.T;
                        if (itaVar != null) {
                            itaVar.set(userFull.stars_rating);
                        }
                        bp8 bp8Var3 = this.v0;
                        if (bp8Var3 != null) {
                            bp8Var3.setStories(this.w2.stories);
                        }
                        xs8 xs8Var3 = this.w0;
                        if (xs8Var3 != null) {
                            xs8Var3.a();
                        }
                        yo8 yo8Var3 = this.f0;
                        if (yo8Var3 != null) {
                            yo8Var3.setHasStories(P2());
                        }
                        wp8 wp8Var3 = this.O;
                        if (wp8Var3 != null) {
                            wp8Var3.setUserInfo(this.w2);
                        }
                        if (this.r0 != null) {
                            if (this.d != null && !TextUtils.equals(this.w2.about, this.A2)) {
                                this.d.g(this.X2);
                            }
                            if (this.s1) {
                                c4(false, false);
                            }
                        } else {
                            if (!this.G1 && !this.L0) {
                                M1(true);
                            } else {
                                this.I1 = true;
                            }
                            c4(false, false);
                            wp8 wp8Var4 = this.O;
                            if (wp8Var4 != null) {
                                wp8Var4.setCommonGroupsCount(this.w2.common_chats_count);
                                W();
                                fha fhaVar = this.R;
                                if (fhaVar == null || fhaVar.E) {
                                    resumeDelayedFragmentAnimation();
                                    Q2(true);
                                }
                            }
                        }
                        L3();
                        n4();
                        if (this.x2 == null && !u2()) {
                            ir8 ir8Var = new ir8(this.currentAccount);
                            this.x2 = ir8Var;
                            v56 v56Var = new v56(this, (byte) 18);
                            if (ir8Var.c) {
                                v56Var.run();
                            } else {
                                ir8Var.h.add(v56Var);
                            }
                            this.x2.b(this.w2);
                        }
                        if (!u2()) {
                            zq8 zq8Var = this.z2;
                            zq8 c = zq8.c(this.currentAccount, this.w2, zq8Var);
                            this.z2 = c;
                            if (c != zq8Var) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.y2 = z;
                            if (c != null) {
                                v56 v56Var2 = new v56(this, (byte) 19);
                                if (c.b) {
                                    v56Var2.run();
                                } else {
                                    c.h.add(v56Var2);
                                }
                            }
                        }
                        if (this.T0 != null) {
                            boolean p2 = p2();
                            zja zjaVar = this.T0;
                            if (p2) {
                                zjaVar.S(44);
                            } else {
                                zjaVar.u(44);
                            }
                            TLRPC.UserFull userFull2 = this.w2;
                            if (!userFull2.noforwards_my_enabled && !userFull2.noforwards_peer_enabled) {
                                z4 = true;
                            }
                            this.T0.Q(46, z4);
                            this.T0.Q(47, !z4);
                        }
                    }
                } else if (i != nm7.k0) {
                    if (i == 1) {
                        if (!((Boolean) objArr[2]).booleanValue() && a() == ((Long) objArr[0]).longValue()) {
                            ArrayList arrayList = (ArrayList) objArr[1];
                            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                k47 k47Var = (k47) arrayList.get(i7);
                                if (this.E2 != null) {
                                    TLRPC.MessageAction messageAction = k47Var.k.action;
                                    if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (lq8Var = this.d) != null) {
                                        lq8Var.f();
                                    }
                                }
                            }
                        }
                    } else if (i == nm7.m4) {
                        po8 po8Var3 = this.a;
                        if (po8Var3 != null) {
                            po8Var3.h1();
                        }
                    } else if (i == nm7.B4) {
                        c4(false, false);
                    } else if (i == nm7.s1) {
                        int i8 = this.d3;
                        int i9 = this.b3;
                        int i10 = this.Z2;
                        i4();
                        lq8 lq8Var2 = this.d;
                        if (lq8Var2 != null) {
                            if (i8 != this.d3 || i9 != this.b3 || i10 != this.Z2) {
                                lq8Var2.f();
                            }
                        }
                    } else if (i == nm7.u5) {
                        if (this.q1) {
                            h4(false);
                        }
                    } else if (i == nm7.D1) {
                        uq8 uq8Var = this.e;
                        if (uq8Var != null) {
                            uq8Var.c = uq8.H(this);
                            this.e.w.clear();
                            this.e.J();
                            uq8 uq8Var2 = this.e;
                            uq8Var2.I(uq8Var2.E);
                        }
                    } else if (i == nm7.c0) {
                        h4(false);
                    } else if (i != nm7.z5 && i != nm7.J5) {
                        if (i == nm7.k3) {
                            zja zjaVar2 = this.T0;
                            if (zjaVar2 != null) {
                                TL_account.RequirementToContact L2 = getMessagesController().L2(this.e1);
                                if (L2 != null && !(L2 instanceof TL_account.requirementToContactEmpty)) {
                                    z3 = false;
                                }
                                zjaVar2.Q(20, z3);
                            }
                            O3();
                        } else if (i == nm7.j5) {
                            O3();
                        } else if (i == nm7.A3) {
                            c4(false, false);
                        } else if (i == nm7.E3) {
                            c4(false, false);
                        } else if (i == nm7.c4) {
                            if (r2()) {
                                c4(false, false);
                            }
                        } else if (i == nm7.F3) {
                            c4(false, false);
                        } else if (i == nm7.y1) {
                            if (a() == ((Long) objArr[0]).longValue()) {
                                tk5 tk5Var2 = this.parentLayout;
                                if (tk5Var2 != null && tk5Var2.getLastFragment() == this) {
                                    finishFragment();
                                } else {
                                    removeSelfFromStack();
                                }
                            }
                        } else if (i == nm7.h3) {
                            long longValue3 = ((Long) objArr[0]).longValue();
                            if (this.S4 < 0 && longValue3 == a()) {
                                i4();
                                W();
                                lq8 lq8Var3 = this.d;
                                if (lq8Var3 != null) {
                                    lq8Var3.f();
                                }
                            }
                        } else if (i == nm7.I3) {
                            if (((Long) objArr[0]).longValue() == a() && !u2()) {
                                if (this.S4 < 0) {
                                    i4();
                                    W();
                                    lq8 lq8Var4 = this.d;
                                    if (lq8Var4 != null) {
                                        lq8Var4.f();
                                    }
                                    gm.c3(new v56(this, (byte) 20));
                                    return;
                                }
                                wp8 wp8Var5 = this.O;
                                if (wp8Var5 != null) {
                                    wp8Var5.N1(true);
                                }
                            }
                        } else if (i == nm7.Y3) {
                            if (((Long) objArr[0]).longValue() == a() && this.e1 > 0) {
                                TLRPC.UserFull X1 = getMessagesController().X1(this.e1);
                                if (X1 != null) {
                                    this.w2 = X1;
                                }
                                i4();
                                W();
                                po8 po8Var4 = this.a;
                                if (po8Var4 != null && po8Var4.d0()) {
                                    this.a.post(new v56(this, (byte) 22));
                                    return;
                                }
                                lq8 lq8Var5 = this.d;
                                if (lq8Var5 != null) {
                                    lq8Var5.f();
                                }
                            }
                        } else if (i == nm7.Z3) {
                            long longValue4 = ((Long) objArr[0]).longValue();
                            long longValue5 = ((Long) objArr[1]).longValue();
                            TLRPC.Chat chat4 = this.F2;
                            if (chat4 != null && chat4.id == longValue4) {
                                String str = (String) objArr[2];
                                vh6 vh6Var = this.C1;
                                if (vh6Var != null && (chatParticipant = (TLRPC.ChatParticipant) vh6Var.f(longValue5)) != null) {
                                    chatParticipant.setRank(longValue5, str);
                                }
                                TLRPC.ChannelParticipant channelParticipant = this.H2;
                                if (channelParticipant != null && channelParticipant.user_id == longValue5) {
                                    channelParticipant.rank = str;
                                }
                                while (true) {
                                    ArrayList arrayList2 = this.Z4;
                                    if (i3 < arrayList2.size()) {
                                        ((TLRPC.ChatParticipant) arrayList2.get(i3)).setRank(longValue5, str);
                                        i3++;
                                    } else {
                                        gm.V3(this.a);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        yo8 yo8Var4 = this.f0;
                        if (yo8Var4 != null) {
                            yo8Var4.setHasStories(P2());
                            this.f0.setRoundRadiusForExpand((int) gm.R1(n2(), 0.0f, this.l2));
                        }
                        bp8 bp8Var4 = this.v0;
                        if (bp8Var4 != null) {
                            TLRPC.UserFull userFull3 = this.w2;
                            if (userFull3 != null) {
                                bp8Var4.setStories(userFull3.stories);
                                return;
                            }
                            TLRPC.ChatFull chatFull8 = this.v2;
                            if (chatFull8 != null) {
                                bp8Var4.setStories(chatFull8.stories);
                            }
                        }
                    }
                }
            } else {
                M1(true);
            }
        } else if (sd2.R(oc7.r1(this.currentAccount).L0(Long.valueOf(this.f1)))) {
            getMessagesController().N1().j(a(), new bn0((byte) 22), false, this.A0);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        wn5 wn5Var = this.r0;
        if (wn5Var != null && wn5Var.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        wn5 wn5Var = this.r0;
        if ((wn5Var == null || dialog != wn5Var.c) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final r59 e() {
        return this.a;
    }

    public final int e2() {
        return Y1() + f2();
    }

    public final void e3() {
        TLRPC.User W1;
        if (this.e1 != 0 && !W1() && (W1 = getMessagesController().W1(Long.valueOf(this.e1))) != null && !(W1 instanceof TLRPC.TL_userEmpty)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.e1);
            if (getMessagesController().A(bundle, this, null, null)) {
                boolean z = this.arguments.getBoolean("removeFragmentOnChatOpen", true);
                if (!gm.O1() && z) {
                    nm7 notificationCenter = getNotificationCenter();
                    int i = nm7.s;
                    notificationCenter.n(this, i);
                    getNotificationCenter().k(i, new Object[0]);
                }
                int i2 = getArguments().getInt("nearby_distance", -1);
                if (i2 >= 0) {
                    bundle.putInt("nearby_distance", i2);
                }
                yv1 yv1Var = new yv1(bundle);
                hs6 mediaDataController = getMediaDataController();
                TLRPC.Document document = mediaDataController.z0;
                mediaDataController.o1();
                yv1Var.Y9 = document;
                yv1Var.Z9 = false;
                presentFragment(yv1Var, z);
                if (gm.O1() && !this.J0) {
                    finishFragment();
                }
            }
        }
    }

    public final void e4(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.e4(boolean):void");
    }

    @Override
    public final TLRPC.Chat f() {
        return this.F2;
    }

    public final int f2() {
        if (Y1() == 0) {
            return gm.L(168.0f);
        }
        return gm.L(152.0f);
    }

    public final void f3() {
        TLRPC.ChatFull chatFull = this.v2;
        if (chatFull != null && chatFull.linked_chat_id != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.v2.linked_chat_id);
            if (getMessagesController().A(bundle, this, null, null)) {
                presentFragment(new yv1(bundle));
            }
        }
    }

    public final void f4(boolean z) {
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
            TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.v2.participants.participants.get(i2).user_id));
            if (W1 != null && (userStatus = W1.status) != null && ((userStatus.expires > currentTime || W1.id == getUserConfig().e()) && W1.status.expires > 10000)) {
                this.C2++;
            }
            this.D2.add(Integer.valueOf(i2));
            if (W1 != null) {
                if (W1.bot) {
                    i = -110;
                } else if (W1.self) {
                    i = 50000 + currentTime;
                } else {
                    TLRPC.UserStatus userStatus2 = W1.status;
                    if (userStatus2 != null) {
                        i = userStatus2.expires;
                    }
                }
                i2 = td4.g(i, i2, 1, arrayList);
            }
            i = Integer.MIN_VALUE;
            i2 = td4.g(i, i2, 1, arrayList);
        }
        try {
            Collections.sort(this.D2, Comparator$EL.reversed(Comparator$CC.comparingInt(new xm1(arrayList, (byte) 1))));
        } catch (Exception e) {
            fc4.g(e, true);
        }
        if (z && this.d != null && this.C4 > 0) {
            gm.V3(this.a);
        }
        if (this.O != null && this.S4 != -1) {
            if ((this.D2.size() > 5 || this.b5 == 2) && this.b5 != 1) {
                this.O.h1(this.D2, this.v2);
            }
        }
    }

    @Override
    public final boolean g(org.telegram.tgnet.TLRPC.ChatParticipant r24, boolean r25, boolean r26, android.view.View r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.g(org.telegram.tgnet.TLRPC$ChatParticipant, boolean, boolean, android.view.View):boolean");
    }

    public final float g2() {
        return Math.max(this.L5, this.b6);
    }

    public final void g3(boolean z) {
        TLRPC.TL_businessLocation tL_businessLocation;
        TLRPC.UserFull userFull = this.w2;
        if (userFull != null && (tL_businessLocation = userFull.business_location) != null) {
            if (tL_businessLocation.geo_point != null && !z) {
                np8 np8Var = new np8(3, (byte) 0);
                np8Var.setResourceProvider(this.A0);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = getMessagesController().x1(a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_businessLocation tL_businessLocation2 = this.w2.business_location;
                tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
                tL_messageMediaGeo.address = tL_businessLocation2.address;
                tL_message.media = tL_messageMediaGeo;
                np8Var.V0 = false;
                np8Var.G0(new k47(z8c.t0, tL_message, false, false));
                presentFragment(np8Var);
                return;
            }
            boolean z2 = e21.a;
            org.telegram.messenger.a.q();
            try {
                Locale locale = Locale.US;
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(locale, "http://maps.google.com/maps?q=" + this.w2.business_location.address, new Object[0]))));
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    public final void g4() {
        CharSequence charSequence;
        ap8 ap8Var = this.r;
        if (ap8Var != null) {
            if ((!this.c6 || (charSequence = this.h6) == null) && (!this.F6 || (charSequence = this.E6) == null)) {
                charSequence = this.D6;
            }
            if (ap8Var.o(charSequence, !this.G1) && this.fragmentView != null) {
                Q2(false);
            }
        }
    }

    public float getAvatarAnimationProgress() {
        return this.T1;
    }

    @Override
    public final qb8 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final ylb getResourceProvider() {
        return this.A0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.A0 != null) {
            return null;
        }
        t10 t10Var = new t10(this, (byte) 15);
        ArrayList arrayList = new ArrayList();
        wp8 wp8Var = this.O;
        if (wp8Var != null) {
            arrayList.addAll(wp8Var.getThemeDescriptions());
        }
        arrayList.add(new cnb(this.d1, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Z6));
        arrayList.add(new cnb(this.f0, 0, (Class[]) null, (Paint) null, new Drawable[]{this.q0}, (bnb) null, cmb.c8));
        arrayList.add(new cnb(this.s, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.mi));
        arrayList.add(new cnb(this.s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.ni));
        arrayList.add(new cnb(this.s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.oi));
        arrayList.add(new cnb(this.a, 262144, new Class[]{xib.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.w6));
        arrayList.add(new cnb(this.a, 262144, new Class[]{xib.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.o7));
        arrayList.add(new cnb(this.a, 262144, new Class[]{xib.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.n6));
        arrayList.add(new cnb(this.a, 262144, new Class[]{xib.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.t6));
        arrayList.add(new cnb(this.a, 262144, new Class[]{xib.class}, new String[]{"imageView"}, (Drawable[]) null, (bnb) null, cmb.u6));
        arrayList.add(new cnb(this.a, 0, new Class[]{qaa.class}, new String[]{"detailTextView"}, (Drawable[]) null, (bnb) null, cmb.y6));
        int i = cmb.Ii;
        arrayList.add(new cnb(this.a, 0, new Class[]{qaa.class}, new String[]{"yesButton"}, (Drawable[]) null, (bnb) null, i));
        int i2 = cmb.Ei;
        arrayList.add(new cnb(this.a, 131072, new Class[]{qaa.class}, new String[]{"yesButton"}, (Drawable[]) null, (bnb) null, i2));
        int i3 = cmb.Gi;
        arrayList.add(new cnb(this.a, 196608, new Class[]{qaa.class}, new String[]{"yesButton"}, (Drawable[]) null, (bnb) null, i3));
        arrayList.add(new cnb(this.a, 0, new Class[]{qaa.class}, new String[]{"noButton"}, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.a, 131072, new Class[]{qaa.class}, new String[]{"noButton"}, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.a, 196608, new Class[]{qaa.class}, new String[]{"noButton"}, (Drawable[]) null, (bnb) null, i3));
        arrayList.add(new cnb(this.a, 0, new Class[]{yn7.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.L6));
        arrayList.add(new cnb(this.a, 0, new Class[]{yn7.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.M6));
        arrayList.add(new cnb(this.a, 0, new Class[]{w8c.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, t10Var, cmb.m6));
        boolean z = this.c6;
        mt1 mt1Var = this.f;
        Drawable drawable = this.I;
        if (z) {
            arrayList.add(new cnb(mt1Var, 0, (Class[]) null, (Paint) null, new Drawable[]{drawable}, (bnb) null, cmb.Ej));
            arrayList.add(new cnb(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.y}, (bnb) null, cmb.c6));
            return arrayList;
        }
        arrayList.add(new cnb(mt1Var, 0, (Class[]) null, (Paint) null, new Drawable[]{drawable}, (bnb) null, cmb.qi));
        arrayList.add(new cnb(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.y}, (bnb) null, cmb.pi));
        return arrayList;
    }

    @Override
    public final int getThemedColor(int i) {
        return cmb.v0(i, this.A0);
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable;
        ylb ylbVar = this.A0;
        if (ylbVar != null) {
            drawable = ylbVar.getDrawable(str);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return super.getThemedDrawable(str);
    }

    public final float h2(float f, float f2) {
        float f3;
        float f4;
        this.G6 = f;
        this.I6 = f2;
        byte b = this.J1;
        if (b == 2) {
            f3 = 1.0f;
        } else if (this.T1 < 1.0f && b != 0) {
            f3 = 0.0f;
        } else {
            f3 = this.l2;
        }
        float l = Utilities.l(f3);
        ita itaVar = this.T;
        if (itaVar != null) {
            f4 = itaVar.getVisibilityFactor();
        } else {
            f4 = 0.0f;
        }
        return Math.max(0.0f, (m2() + this.z5) * l) + td4.A(1.0f, l, f2 * f4, f);
    }

    public final void h3(int i, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z) {
        boolean[] zArr = new boolean[1];
        hp8 hp8Var = new hp8(this, user.id, this.f1, tL_chatAdminRights, this.F2.default_banned_rights, tL_chatBannedRights, str, i, zArr, user);
        hp8Var.Y0 = new ip8(this, i, chatParticipant, z, zArr);
        presentFragment(hp8Var);
    }

    public final void h4(boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.h4(boolean):void");
    }

    public final float i2(float f) {
        float f2;
        this.J6 = f;
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
            f3 = this.T.getVisibilityFactor() * gm.L(3.0f);
        }
        return td4.A(1.0f, l, f3, f);
    }

    public final void i3(String str, p1 p1Var) {
        if (str.startsWith("@")) {
            getMessagesController().C3(str.substring(1), this, 0, p1Var);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/") && this.parentLayout.getFragmentStack().size() > 1) {
                org.telegram.ui.ActionBar.d dVar = (org.telegram.ui.ActionBar.d) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if (dVar instanceof yv1) {
                    finishFragment();
                    ((yv1) dVar).a0.E1(null, str, false, false);
                }
            }
        } else {
            nk3 nk3Var = new nk3(null);
            nk3Var.p2 = str;
            presentFragment(nk3Var);
        }
    }

    public final void i4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.i4():void");
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
            if (aVar != null && aVar.y()) {
                v0 = cmb.v0(cmb.v8, this.A0);
            } else if (!this.c6 && this.L5 <= 0.5f) {
                ec7 ec7Var = this.s6;
                if (ec7Var != null) {
                    v0 = ec7Var.d(cmb.I.o());
                } else {
                    v0 = cmb.v0(cmb.r8, this.A0);
                }
            } else {
                v0 = cmb.v0(cmb.c6, this.A0);
            }
            if (on2.h(v0) > 0.699999988079071d) {
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
    public final nz4 j() {
        eh0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (sy4.f().a) {
            return baseSimpleGlass.i;
        }
        return null;
    }

    public final x43 j2() {
        x43 x43Var = this.K;
        if (x43Var == null) {
            Drawable mutate = getParentActivity().getDrawable(2131232313).mutate();
            this.E = mutate;
            mutate.setColorFilter(cmb.v0(cmb.pi, this.A0), PorterDuff.Mode.MULTIPLY);
            x43 x43Var2 = new x43(this.E, getParentActivity().getDrawable(2131232316).mutate());
            this.K = x43Var2;
            return x43Var2;
        }
        return x43Var;
    }

    public final boolean j3(float r24, float r25, int r26, android.view.View r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.j3(float, float, int, android.view.View):boolean");
    }

    public final void j4(boolean z) {
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
        r59 r59Var = this.b;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        r59Var.setVisibility(i2);
        FrameLayout searchContainer = this.U0.getSearchContainer();
        if (!z) {
            i3 = 8;
        }
        searchContainer.setVisibility(i3);
        xs8 xs8Var = this.w0;
        if (xs8Var != null) {
            xs8Var.setActive(!z);
        }
        this.actionBar.B(z);
        this.Y.setVisibility(i);
        bp8 bp8Var = this.v0;
        if (bp8Var != null) {
            bp8Var.setVisibility(i);
        }
        this.f.setVisibility(i);
        this.r.setVisibility(i);
        zja zjaVar = this.T0;
        if (zjaVar != null) {
            zjaVar.setAlpha(1.0f);
            this.T0.setVisibility(i);
        }
        this.U0.setVisibility(i);
        this.f0.setAlpha(1.0f);
        this.Y.setAlpha(1.0f);
        bp8 bp8Var2 = this.v0;
        if (bp8Var2 != null) {
            bp8Var2.setAlpha(1.0f);
        }
        xs8 xs8Var2 = this.w0;
        if (xs8Var2 != null) {
            xs8Var2.setAlpha(1.0f);
        }
        this.f.setAlpha(1.0f);
        ap8 ap8Var = this.r;
        if (this.c6) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        ap8Var.setAlpha(f);
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

    public final float k2(int i) {
        View subtitleTextView;
        lka lkaVar;
        f02 f02Var = this.r5;
        if (f02Var != null && !(f02Var instanceof yv1) && f02Var.p() != null) {
            z82 p = this.r5.p();
            if (i == 0) {
                subtitleTextView = p.getTitleTextView();
                lkaVar = this.f;
            } else {
                subtitleTextView = p.getSubtitleTextView();
                lkaVar = this.r;
            }
            float textSize = lkaVar.getPaint().getTextSize();
            if ((subtitleTextView instanceof lka) && textSize > 0.0f) {
                return ((lka) subtitleTextView).getPaint().getTextSize() / textSize;
            }
            return 1.0f;
        }
        return 1.0f;
    }

    public final void k3() {
        int i;
        ValueAnimator valueAnimator;
        if (this.q2 && (valueAnimator = this.k2) != null && valueAnimator.isRunning()) {
            this.f2 = this.l6;
            this.h2 = this.m6;
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
        if (this.actionBar.getOccupyStatusBar()) {
            i = gm.m;
        } else {
            i = 0;
        }
        l3(E1(), currentActionBarHeight + i);
    }

    public final void k4() {
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

    public final float l2(float f, int i, View view) {
        View B;
        float left;
        int paddingLeft;
        f02 f02Var = this.r5;
        if (f02Var != null && !(f02Var instanceof yv1) && this.fragmentView != null && (view.getParent() instanceof View)) {
            z82 p = this.r5.p();
            org.telegram.ui.ActionBar.a actionBar = ((org.telegram.ui.ActionBar.d) this.r5).getActionBar();
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
                nk3 nk3Var = this.q5;
                if (nk3Var != null && nk3Var.getFragmentView() != null) {
                    B = this.q5.getFragmentView();
                } else {
                    B = this.r5.B();
                }
                RectF rectF = this.q6;
                if (zgc.c(view2, B, rectF)) {
                    float f2 = rectF.left;
                    if (zgc.c((View) view.getParent(), this.fragmentView, rectF)) {
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

    public final void l3(float f, float f2) {
        float R1;
        int i;
        float max = Math.max(0.0f, Math.min(1.0f, (this.Q1 - e2()) / ((this.a.getMeasuredWidth() - f2) - f2())));
        if (this.Q1 < e2() && max < 0.33f) {
            R1 = b10.y(f, 72.0f, 24.0f, 42.0f);
        } else {
            R1 = gm.R1(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f));
        }
        if (this.actionBar.getOccupyStatusBar()) {
            i = gm.m;
        } else {
            i = 0;
        }
        float currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f;
        float translationY = this.actionBar.getTranslationY();
        float N = ((gm.N(8.0f) + (gm.L(42.0f) * R1)) * f) + ((float) Math.floor(translationY + (hg9.u(f, 1.0f, currentActionBarHeight, i) - (gm.p * 21.0f))));
        this.f2 = (gm.L(7.0f) * f) + gm.L(1.3f) + N;
        this.h2 = (((float) Math.floor(gm.p * 11.0f)) * f) + N + gm.L(24.0f);
    }

    public final void l4(boolean z) {
        org.telegram.ui.ActionBar.a aVar;
        float f;
        boolean z2;
        if ((this.v0 != null || this.w0 != null) && (aVar = this.actionBar) != null && this.simpleActionBar != null) {
            if (aVar.getOccupyStatusBar()) {
                f = gm.m;
            } else {
                f = 0.0f;
            }
            int L = gm.L(7.0f);
            float right = this.simpleActionBar.getBackButton().getRight() + L;
            float menuPillLeft = this.simpleActionBar.getMenuPillLeft() - L;
            bp8 bp8Var = this.v0;
            boolean z3 = false;
            if (bp8Var != null) {
                float z4 = aq1.z(this.actionBar.getHeight(), f, 2.0f, f);
                if (Math.abs(right - bp8Var.g0) <= 0.1f && Math.abs(menuPillLeft - bp8Var.h0) <= 0.1f && Math.abs(z4 - bp8Var.i0) <= 0.1f) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                bp8Var.g0 = right;
                bp8Var.h0 = menuPillLeft;
                if (z) {
                    bp8Var.n0.e(true, menuPillLeft);
                }
                bp8Var.i0 = z4;
                if (z2) {
                    bp8Var.invalidate();
                }
            }
            xs8 xs8Var = this.w0;
            if (xs8Var != null) {
                float z5 = aq1.z(this.actionBar.getHeight(), f, 2.0f, f);
                int f2 = f2();
                if (Math.abs(right - xs8Var.r) > 0.1f || Math.abs(menuPillLeft - xs8Var.s) > 0.1f || Math.abs(z5 - xs8Var.w) > 0.1f) {
                    z3 = true;
                }
                xs8Var.r = right;
                xs8Var.s = menuPillLeft;
                if (z) {
                    xs8Var.E.e(true, menuPillLeft);
                }
                xs8Var.w = z5;
                xs8Var.y = f2 + z5;
                if (z3) {
                    xs8Var.invalidate();
                }
            }
        }
    }

    public final float m2() {
        if (this.T != null) {
            return this.T.getVisibilityFactor() * gm.L(22.0f);
        }
        return 0.0f;
    }

    public final void m3() {
        po8 po8Var = this.a;
        if (po8Var != null && this.c != null && po8Var.getChildCount() > 0 && !this.y6) {
            View view = null;
            int i = Integer.MAX_VALUE;
            int i2 = -1;
            for (int i3 = 0; i3 < this.a.getChildCount(); i3++) {
                int R = RecyclerView.R(this.a.getChildAt(i3));
                View childAt = this.a.getChildAt(i3);
                if (R != -1 && childAt.getTop() < i) {
                    i = childAt.getTop();
                    i2 = R;
                    view = childAt;
                }
            }
            if (view != null) {
                this.w6 = i2;
                int top = view.getTop();
                this.x6 = top;
                if (this.w6 == 0 && !this.p2 && top > e2()) {
                    this.x6 = e2();
                }
                this.c.g1(i2, view.getTop() - this.a.getPaddingTop());
            }
        }
    }

    public final void m4() {
        try {
            sb sbVar = this.U;
            if (sbVar != null && (sbVar.getForeground() instanceof ColorDrawable)) {
                ((ColorDrawable) this.U.getForeground()).setColor(on2.p(cmb.v0(cmb.c6, this.A0), 100));
            }
            float f = this.b6;
            Drawable drawable = this.E;
            int[] iArr = this.d7;
            if (drawable != null) {
                int R0 = gm.R0(f, 1.0f, cmb.v0(cmb.pi, this.A0), cmb.v0(cmb.Ej, this.A0));
                int i = iArr[6];
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                if (R0 != i) {
                    drawable.setColorFilter(new PorterDuffColorFilter(R0, mode));
                }
                iArr[6] = R0;
            }
            Drawable drawable2 = this.Z6;
            if (drawable2 != null) {
                int v0 = cmb.v0(cmb.U6, this.A0);
                int i2 = iArr[3];
                PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
                if (v0 != i2) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(v0, mode2));
                }
                iArr[3] = v0;
            }
            Drawable drawable3 = this.a7;
            if (drawable3 != null) {
                int v02 = cmb.v0(cmb.u8, this.A0);
                int i3 = iArr[4];
                PorterDuff.Mode mode3 = PorterDuff.Mode.MULTIPLY;
                if (v02 != i3) {
                    drawable3.setColorFilter(new PorterDuffColorFilter(v02, mode3));
                }
                iArr[4] = v02;
            }
            Drawable drawable4 = this.b7;
            if (drawable4 != null) {
                int v03 = cmb.v0(cmb.E8, this.A0);
                int i4 = iArr[5];
                PorterDuff.Mode mode4 = PorterDuff.Mode.SRC_IN;
                if (v03 != i4) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(v03, mode4));
                }
                iArr[5] = v03;
            }
            pn2 pn2Var = this.c7;
            if (pn2Var != null) {
                pn2Var.y = cmb.v0(cmb.mk, this.A0);
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
            fc4.g(e, true);
        }
    }

    public final int n2() {
        float f;
        if (this.q1) {
            return 0;
        }
        if (this.f1 != 0 && sd2.c0(getMessagesController().L0(Long.valueOf(this.f1)))) {
            if (P2()) {
                f = 24.0f;
            } else {
                f = 38.0f;
            }
            return gm.L(f);
        }
        return gm.L(50.0f);
    }

    public final void n3(boolean z) {
        int i = this.S4;
        if (i >= 0) {
            if (z) {
                w46 w46Var = new w46(getParentActivity(), 2, 0.6f);
                w46Var.a = this.S4;
                w46Var.p = -this.a.getPaddingTop();
                this.c.v0(w46Var);
                return;
            }
            this.c.g1(i, -this.a.getPaddingTop());
        }
    }

    public final void n4() {
        boolean z;
        TLRPC.UserFull userFull;
        if (this.Y0 == null) {
            return;
        }
        if (this.E2 == null && (((userFull = this.w2) != null && userFull.ttl_period > 0) || (this.v2 != null && sd2.y(13, this.F2) && this.v2.ttl_period > 0))) {
            z = true;
        } else {
            z = false;
        }
        gm.T3(this.Y0, z, 0.8f, true, this.w5);
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.J1 == 0) {
            return true;
        }
        return false;
    }

    public final x43 o2() {
        int i;
        float f;
        x43 x43Var = this.J;
        if (x43Var == null) {
            this.y = cmb.P1.getConstantState().newDrawable().mutate();
            this.I = cmb.Q1.getConstantState().newDrawable().mutate();
            ec7 ec7Var = this.s6;
            if (ec7Var != null) {
                boolean o = ec7Var.o(cmb.I.o());
                ec7 ec7Var2 = this.s6;
                if (o) {
                    i = ec7Var2.k();
                } else {
                    i = ec7Var2.i();
                }
                if (cmb.I.o()) {
                    f = -0.1f;
                } else {
                    f = -0.08f;
                }
                int a = cmb.a(0.1f, f, i);
                Drawable drawable = this.y;
                int R0 = gm.R0(this.b6, 1.0f, a, cmb.v0(cmb.Ej, this.A0));
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(R0, mode);
                this.I.setColorFilter(gm.R0(this.b6, 1.0f, -1, cmb.v0(cmb.c6, this.A0)), mode);
            }
            x43 x43Var2 = new x43(new sn2(this.y, this.I), getParentActivity().getDrawable(2131232811));
            this.J = x43Var2;
            return x43Var2;
        }
        return x43Var;
    }

    public final ValueAnimator o3(final boolean z) {
        float f;
        boolean z2;
        int i;
        if (z) {
            gm.V2(getParentActivity(), this.classGuid);
            gm.g3(getParentActivity(), this.classGuid);
        }
        ValueAnimator valueAnimator = this.W1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.W1.cancel();
        }
        xs8 xs8Var = this.w0;
        if (xs8Var != null) {
            xs8Var.setActive(!z);
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
        Q2(true);
        this.Y.setVisibility(0);
        this.f.setVisibility(0);
        this.r.setVisibility(0);
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (this.V1 > 0.5f) {
            z2 = true;
        } else {
            z2 = false;
        }
        aVar.B(z2);
        int i2 = 8;
        if (this.V1 > 0.5f) {
            i = 0;
        } else {
            i = 8;
        }
        zja zjaVar = this.T0;
        if (zjaVar != null) {
            zjaVar.setVisibility(i);
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
                RectF rectF = ProfileActivity.e7;
                ProfileActivity.this.K2(ofFloat, f3, z);
            }
        });
        ofFloat.addListener(new mp8(this, z, (byte) 0));
        if (!z) {
            this.d5 = true;
            m3();
            gm.U2(getParentActivity(), this.classGuid);
            this.P.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(d53.f);
        this.W1 = ofFloat;
        return ofFloat;
    }

    public final void o4(boolean z) {
        boolean z2;
        boolean z3;
        int i;
        int i2;
        boolean z4;
        float f;
        TLRPC.ChatFull chatFull;
        float f2 = 0.2f;
        int i3 = (E1() > 0.2f ? 1 : (E1() == 0.2f ? 0 : -1));
        int i4 = 0;
        if (i3 > 0 && !this.X1 && (this.r0 == null || this.P2 == -1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.i6 = z2;
        K1();
        s09 s09Var = this.s;
        if (s09Var != null && s09Var.getVisibility() != 8) {
            s09 s09Var2 = this.s;
            if (this.actionBar.getOccupyStatusBar()) {
                i2 = gm.m;
            } else {
                i2 = 0;
            }
            s09Var2.setTranslationY((((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i2) + this.Q1) + this.U1) - gm.L(29.5f));
            if (i3 > 0 && !this.X1 && !this.s1 && (this.r0 == null || this.P2 == -1)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 && this.f1 != 0) {
                if (sd2.T(this.F2) && !this.F2.megagroup && (chatFull = this.v2) != null && chatFull.linked_chat_id != 0 && (this.E3 != -1 || this.F3 != -1)) {
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
                    s09 s09Var3 = this.s;
                    if (z3) {
                        s09Var3.setTag(null);
                    } else {
                        s09Var3.setTag(0);
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
                        this.w.addListener(new cp8(this, (byte) 3));
                        this.w.start();
                    } else {
                        s09 s09Var4 = this.s;
                        if (z3) {
                            f = 1.0f;
                        } else {
                            f = 0.2f;
                        }
                        s09Var4.setScaleX(f);
                        s09 s09Var5 = this.s;
                        if (z3) {
                            f2 = 1.0f;
                        }
                        s09Var5.setScaleY(f2);
                        s09 s09Var6 = this.s;
                        if (z3) {
                            f3 = 1.0f;
                        }
                        s09Var6.setAlpha(f3);
                    }
                }
            }
        } else {
            z3 = false;
        }
        bp8 bp8Var = this.v0;
        if (bp8Var != null) {
            float measuredWidth = this.Z.getMeasuredWidth() - gm.L(40.0f);
            if (this.actionBar.getOccupyStatusBar()) {
                i = gm.m;
            } else {
                i = 0;
            }
            bp8Var.j0 = measuredWidth;
            bp8Var.l0 = z3;
            bp8Var.k0 = (org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f) + i;
            bp8Var.invalidate();
        }
        xs8 xs8Var = this.w0;
        if (xs8Var != null) {
            if (this.actionBar.getOccupyStatusBar()) {
                i4 = gm.m;
            }
            xs8Var.setExpandCoords(org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i4 + this.Q1 + this.U1);
        }
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        wn5 wn5Var = this.r0;
        if (wn5Var != null) {
            wn5Var.h(i, i2, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        kfa kfaVar;
        if (super.onBackPressed(z)) {
            wp8 wp8Var = this.O;
            if (wp8Var != null && (kfaVar = wp8Var.L0) != null && kfaVar.o0) {
                if (z) {
                    I3();
                    return false;
                }
            } else if (this.S4 != -1 && wp8Var != null && wp8Var.F1) {
                if (z) {
                    wp8Var.E(true);
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
        this.z6 = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        q4();
        this.z6 = true;
        O1();
        if (this.J0 && !this.w5 && (view = this.fragmentView) != null) {
            this.w5 = true;
            this.d5 = true;
            view.requestLayout();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        View m;
        super.onConfigurationChanged(configuration);
        wp8 wp8Var = this.O;
        if (wp8Var != null) {
            wp8Var.onConfigurationChanged(configuration);
        }
        q2();
        if (this.o2 && this.q2 && (m = this.c.m(0)) != null) {
            this.a.scrollBy(0, m.getTop() - e2());
        }
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 9));
    }

    @Override
    public final android.animation.AnimatorSet onCustomTransitionAnimation(boolean r20, java.lang.Runnable r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onCustomTransitionAnimation(boolean, java.lang.Runnable):android.animation.AnimatorSet");
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        po8 po8Var = this.a;
        if (po8Var != null) {
            po8Var.h1();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        wp8 wp8Var = this.O;
        if (wp8Var != null) {
            wp8Var.L0();
        }
        fha fhaVar = this.R;
        if (fhaVar != null) {
            fhaVar.b(this);
        }
        fha fhaVar2 = this.R;
        if (fhaVar2 != null) {
            fhaVar2.y.remove(this);
        }
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, nm7.s);
        getNotificationCenter().n(this, nm7.u);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, nm7.u5);
        getNotificationCenter().n(this, nm7.D1);
        getNotificationCenter().n(this, nm7.c0);
        getNotificationCenter().n(this, nm7.z5);
        getNotificationCenter().n(this, nm7.J5);
        getNotificationCenter().n(this, nm7.k3);
        getNotificationCenter().n(this, nm7.j5);
        getNotificationCenter().n(this, nm7.A3);
        getNotificationCenter().n(this, nm7.E3);
        getNotificationCenter().n(this, nm7.c4);
        getNotificationCenter().n(this, nm7.F3);
        getNotificationCenter().n(this, nm7.y1);
        getNotificationCenter().n(this, nm7.h3);
        getNotificationCenter().n(this, nm7.I3);
        getNotificationCenter().n(this, nm7.Y3);
        getNotificationCenter().n(this, nm7.Z3);
        nm7.e().n(this, nm7.m4);
        zo8 zo8Var = this.o0;
        if (zo8Var != null) {
            zo8Var.K();
        }
        lr8 lr8Var = this.n0;
        if (lr8Var != null) {
            lr8Var.c();
        }
        this.k6 = null;
        if (this.e1 != 0) {
            getNotificationCenter().n(this, nm7.s1);
            getNotificationCenter().n(this, nm7.N);
            getNotificationCenter().n(this, nm7.a0);
            getNotificationCenter().n(this, nm7.Y);
            getNotificationCenter().n(this, nm7.g0);
            getNotificationCenter().n(this, nm7.D0);
            getNotificationCenter().n(this, nm7.E0);
            getNotificationCenter().n(this, nm7.k0);
            nm7.e().n(this, nm7.B4);
            getMessagesController().h1.remove(Long.valueOf(this.e1));
        } else if (this.f1 != 0) {
            nm7.e().n(this, nm7.F5);
            getNotificationCenter().n(this, nm7.r3);
            getNotificationCenter().n(this, nm7.T);
            getNotificationCenter().n(this, nm7.g1);
            getNotificationCenter().n(this, nm7.w2);
            getNotificationCenter().n(this, nm7.b1);
        }
        yo8 yo8Var = this.f0;
        if (yo8Var != null) {
            yo8Var.setImageDrawable(null);
        }
        wn5 wn5Var = this.r0;
        if (wn5Var != null) {
            wn5Var.c();
        }
        dp8 dp8Var = this.e5;
        if (dp8Var != null) {
            dp8Var.b();
        }
        zq8 zq8Var = this.z2;
        if (zq8Var != null && this.y2) {
            zq8Var.b(true);
            this.z2 = null;
        }
        i71 i71Var = this.I5;
        if (i71Var != null) {
            this.I5 = null;
            gm.c3(i71Var);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onPause() {
        vfa vfaVar;
        super.onPause();
        UndoView undoView = this.M;
        if (undoView != null) {
            undoView.d(0, true);
        }
        wn5 wn5Var = this.r0;
        if (wn5Var != null) {
            wn5Var.i();
        }
        s34 s34Var = this.Y1;
        if (s34Var != null) {
            s34Var.g();
        }
        wp8 wp8Var = this.O;
        if (wp8Var != null && (vfaVar = wp8Var.W) != null) {
            vfaVar.e = false;
            if (vfaVar.c != null) {
                vfaVar.a.onPause();
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
        wn5 wn5Var = this.r0;
        if (wn5Var != null) {
            wn5Var.j(i, strArr, iArr);
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
                    qd2 f1 = getMessagesController().f1(this.f1, false, null);
                    TLRPC.Chat chat = this.F2;
                    if (f1 == null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    sic.l(chat, null, z5, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                sic.h(getParentActivity(), null, i);
                return;
            }
            return;
        }
        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.e1));
        if (W1 == null) {
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
            sic.m(W1, z2, z3, getParentActivity(), this.w2, getAccountInstance());
            return;
        }
        sic.h(getParentActivity(), null, i);
    }

    @Override
    public final void onResume() {
        TLRPC.User W1;
        sb sbVar;
        super.onResume();
        wp8 wp8Var = this.O;
        if (wp8Var != null) {
            wp8Var.e1 = true;
            ufa ufaVar = wp8Var.K;
            if (ufaVar != null) {
                ufaVar.f();
            }
            aha ahaVar = wp8Var.N;
            if (ahaVar != null) {
                ahaVar.f();
            }
            bha bhaVar = wp8Var.M;
            if (bhaVar != null) {
                bhaVar.X(false);
            }
            for (int i = 0; i < wp8Var.n0.length; i++) {
                wp8Var.N(i);
            }
            vfa vfaVar = wp8Var.W;
            if (vfaVar != null) {
                vfaVar.e = true;
                if (vfaVar.c != null) {
                    vfaVar.a.onResume();
                }
            }
        }
        q2();
        lq8 lq8Var = this.d;
        if (lq8Var != null) {
            this.c5 = true;
            lq8Var.f();
        }
        if (!((ActionBarLayout) this.parentLayout).w() && (sbVar = this.U) != null && sbVar.getVisibility() == 0) {
            this.U.setVisibility(8);
            this.U.setBackground(null);
        }
        wn5 wn5Var = this.r0;
        if (wn5Var != null) {
            wn5Var.k();
            setParentActivityTitle(jb6.M0(2131745229, null));
        }
        h4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 9));
        }
        mt1 mt1Var = this.f;
        if (mt1Var != null) {
            setParentActivityTitle(mt1Var.getText());
        }
        if (this.e1 != 0 && (W1 = getMessagesController().W1(Long.valueOf(this.e1))) != null && W1.photo == null && this.Q1 >= e2()) {
            this.k2.cancel();
            float[] fArr = this.n2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            r3(1.0f);
            this.o0.setVisibility(8);
            this.Q1 = e2();
            this.p2 = false;
            this.c.g1(0, e2() - this.a.getPaddingTop());
        }
        s34 s34Var = this.Y1;
        if (s34Var != null) {
            s34Var.a();
        }
        b4();
        Q2(false);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.z0.setColor(cmb.v0(cmb.h6, this.A0));
            J3();
            m4();
            C1();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        rja rjaVar;
        if (z && (rjaVar = this.simpleActionBar) != null) {
            rjaVar.setAlpha(1.0f);
        }
        if (z) {
            if (!z2) {
                byte b = this.J1;
                if (b != 0 && this.M1) {
                    if (b == 1) {
                        this.l2 = 0.0f;
                        ita itaVar = this.T;
                        if (itaVar != null) {
                            itaVar.setParentExpanded(0.0f);
                        }
                        qn8 qn8Var = this.a0;
                        if (qn8Var != null) {
                            qn8Var.setParentExpanded(0.0f);
                        }
                        t3(0.0f);
                        mt8 mt8Var = this.c0;
                        if (mt8Var != null) {
                            mt8Var.setParentExpanded(0.0f);
                        }
                    }
                    this.G1 = false;
                    H1();
                    if (this.I1) {
                        M1(true);
                    }
                }
                if (!this.w5) {
                    this.w5 = true;
                    this.d5 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().j(this.Y4);
            sb sbVar = this.U;
            if (sbVar != null && sbVar.getVisibility() == 0) {
                this.U.setVisibility(8);
                this.U.setBackground(null);
            }
        }
        this.H1 = false;
        J1();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z, float f) {
        super.onTransitionAnimationProgress(z, f);
        sb sbVar = this.U;
        if (sbVar != null && sbVar.getVisibility() == 0) {
            sb sbVar2 = this.U;
            if (z) {
                sbVar2.setAlpha(1.0f - f);
            } else {
                sbVar2.setAlpha(f);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        vq8 vq8Var;
        ImageView imageView;
        qn8 qn8Var;
        super.onTransitionAnimationStart(z, z2);
        this.n6 = z;
        if (z && (qn8Var = this.a0) != null) {
            ArrayList arrayList = qn8Var.a;
            if (qn8Var.F == 6) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    nn8 nn8Var = (nn8) arrayList.get(i);
                    p09 p09Var = nn8Var.k;
                    if (p09Var != null) {
                        if (nn8Var.a == 15) {
                            p09Var.H(14);
                        } else {
                            p09Var.H(0);
                        }
                        nn8Var.k.start();
                    }
                }
            }
        }
        if (!z && (imageView = this.P0) != null && imageView.getTag() != null && (this.P0.getTag() instanceof r7)) {
            ((r7) this.P0.getTag()).setAlpha(1.0f);
        }
        if (z ? !z2 : z2) {
            if (this.J1 != 0 && this.M1 && !this.q2) {
                this.G1 = true;
                if (!z) {
                    float[] fArr = this.k6;
                    if (fArr == null) {
                        fArr = new float[14];
                        this.k6 = fArr;
                    }
                    this.F1 = this.Q1;
                    fArr[0] = this.Y.getScaleX();
                    this.k6[1] = this.Y.getTranslationX();
                    this.k6[2] = this.Y.getTranslationY();
                    qn8 qn8Var2 = this.a0;
                    if (qn8Var2 != null) {
                        this.k6[3] = qn8Var2.getAlpha();
                    }
                    xs8 xs8Var = this.w0;
                    if (xs8Var != null) {
                        float[] fArr2 = this.k6;
                        fArr2[4] = xs8Var.e;
                        fArr2[5] = xs8Var.f;
                    }
                    if (this.K6 != null) {
                        this.k6[6] = vq8Var.getAlpha();
                    }
                    this.k6[7] = this.f.getScaleX();
                    this.k6[8] = this.f.getTranslationY();
                    this.k6[9] = this.r.getTranslationY();
                    this.k6[10] = this.f.getLayoutParams().width;
                    float[] fArr3 = this.k6;
                    fArr3[11] = this.d2;
                    fArr3[12] = this.f.getTranslationX();
                    this.k6[13] = this.r.getTranslationX();
                    hg5 hg5Var = this.M6;
                    if (hg5Var != null) {
                        hg5Var.f(true);
                    }
                }
            }
        }
        if (z) {
            if (this.r0 != null) {
                this.Y4 = getNotificationCenter().p(new int[]{nm7.r, nm7.s, nm7.W, nm7.X, nm7.E0, nm7.v4}, this.Y4, true);
            } else {
                this.Y4 = getNotificationCenter().p(new int[]{nm7.r, nm7.s, nm7.W, nm7.X, nm7.v4}, this.Y4, true);
            }
            if (!z2 && getParentActivity() != null) {
                this.i5 = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.H1 = true;
        J1();
    }

    public final boolean p2() {
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

    public final void p4() {
        lea leaVar;
        kfa kfaVar;
        l66 l66Var;
        int v0;
        int v02;
        int v03;
        int i;
        int v04;
        int v05;
        int v06;
        this.t6.clear();
        xq8 xq8Var = this.d1;
        if (xq8Var != null) {
            xq8Var.a(this.s6, true);
        }
        ap8 ap8Var = this.r;
        if (ap8Var != null) {
            if (ap8Var.getTag() instanceof Integer) {
                v06 = cmb.v0(((Integer) this.r.getTag()).intValue(), this.A0);
            } else {
                v06 = cmb.v0(cmb.A8, this.A0);
            }
            this.r.setTextColor(on2.f(this.l2, B1(v06, Boolean.valueOf(this.K0[0])), -1275068417));
        }
        vq8 vq8Var = this.K6;
        float f = -0.1f;
        if (vq8Var != null) {
            vq8Var.a(on2.f(this.l2, cmb.p1(0.5f, cmb.a(0.18f, -0.1f, this.c1)), 603979775));
        }
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        int i2 = -1;
        if (aVar != null) {
            if (this.s6 != null) {
                v04 = -1;
            } else {
                v04 = cmb.v0(cmb.u8, this.A0);
            }
            aVar.H(on2.f(this.b6, v04, cmb.v0(cmb.x8, this.A0)), false);
            org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
            ec7 ec7Var = this.s6;
            if (ec7Var != null) {
                v05 = 1090519039;
            } else if (ec7Var != null) {
                v05 = 553648127;
            } else {
                v05 = cmb.v0(cmb.e8, this.A0);
            }
            aVar2.G(on2.f(this.b6, v05, cmb.v0(cmb.y8, this.A0)), false);
        }
        if (this.y != null) {
            ec7 ec7Var2 = this.s6;
            if (ec7Var2 != null) {
                int g = ec7Var2.g();
                boolean o = this.s6.o(cmb.I.o());
                ec7 ec7Var3 = this.s6;
                if (o) {
                    i = ec7Var3.k();
                } else {
                    i = ec7Var3.i();
                }
                int f2 = on2.f(0.4f, g, i);
                if (!cmb.I.o()) {
                    f = -0.08f;
                }
                v03 = cmb.a(0.1f, f, f2);
            } else {
                v03 = cmb.v0(cmb.pi, this.A0);
            }
            this.y.setColorFilter(gm.R0(this.b6, 1.0f, v03, cmb.v0(cmb.Ej, this.A0)), PorterDuff.Mode.MULTIPLY);
        }
        if (this.I != null) {
            if (this.s6 != null) {
                v02 = -1;
            } else {
                v02 = cmb.v0(cmb.qi, this.A0);
            }
            this.I.setColorFilter(gm.R0(this.b6, 1.0f, v02, cmb.v0(cmb.c6, this.A0)), PorterDuff.Mode.MULTIPLY);
        }
        mt1 mt1Var = this.f;
        if (mt1Var != null) {
            if (this.s6 != null) {
                v0 = -1;
            } else {
                v0 = cmb.v0(cmb.li, this.A0);
            }
            mt1Var.setTextColor(on2.f(this.l2, on2.f(this.b6, v0, cmb.v0(cmb.Ej, this.A0)), -1));
        }
        trc trcVar = this.a1;
        if (trcVar != null && (l66Var = (l66) trcVar.e) != null) {
            l66Var.invalidate();
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            if (this.s6 == null) {
                i2 = on2.f(this.T1, cmb.v0(cmb.fd, this.A0), -1);
            }
            drawable.setColorFilter(i2, PorterDuff.Mode.MULTIPLY);
        }
        mt8 mt8Var = this.c0;
        if (mt8Var != null) {
            mt8Var.setColor(this.s6);
        }
        gm.d0(this.a, new ao8(this, (byte) 4));
        wp8 wp8Var = this.O;
        if (wp8Var != null && (kfaVar = wp8Var.L0) != null) {
            kfaVar.updateColors();
        }
        wp8 wp8Var2 = this.O;
        if (wp8Var2 != null && (leaVar = wp8Var2.b0) != null) {
            leaVar.m();
        }
        q4();
        P3();
        bp8 bp8Var = this.v0;
        if (bp8Var != null) {
            bp8Var.f(true, true);
        }
        xs8 xs8Var = this.w0;
        if (xs8Var != null) {
            xs8Var.a();
        }
    }

    @Override
    public final boolean q(nk3 nk3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, sxb sxbVar) {
        long j = ((bf7) arrayList.get(0)).a;
        Bundle l = ts2.l("scrollToTopOnResume", true);
        if (pg3.B(j)) {
            l.putInt("enc_id", (int) (4294967295L & j));
        } else if (pg3.D(j)) {
            l.putLong("user_id", j);
        } else if (pg3.y(j)) {
            l.putLong("chat_id", -j);
        }
        if (!getMessagesController().A(l, nk3Var, null, null)) {
            return false;
        }
        nm7 notificationCenter = getNotificationCenter();
        int i3 = nm7.s;
        notificationCenter.n(this, i3);
        getNotificationCenter().k(i3, new Object[0]);
        presentFragment(new yv1(l), true);
        removeSelfFromStack();
        getSendMessagesHelper().q0(y5a.g(getMessagesController().W1(Long.valueOf(this.e1)), j, null, null, null, null, z2, i, i2));
        if (!TextUtils.isEmpty(charSequence)) {
            a6a.Z(j5.a(this.currentAccount), charSequence, j, 0L, z2, i, i2);
        }
        return true;
    }

    public final void q2() {
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

    public final void q3() {
        qn8 qn8Var = this.a0;
        if (qn8Var != null) {
            if (this.s1) {
                qn8Var.F = (byte) 6;
            } else if (this.q1) {
                qn8Var.F = (byte) 5;
            } else if (this.s2) {
                qn8Var.F = (byte) 2;
            } else if (this.e1 != 0) {
                qn8Var.F = (byte) 0;
            } else if (this.f1 != 0) {
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.f1));
                if (sd2.T(L0)) {
                    boolean n0 = sd2.n0(L0);
                    qn8 qn8Var2 = this.a0;
                    if (n0) {
                        qn8Var2.F = (byte) 3;
                        return;
                    } else if (sd2.c0(L0)) {
                        qn8Var2.F = (byte) 4;
                        return;
                    } else {
                        qn8Var2.F = (byte) 1;
                        return;
                    }
                }
                this.a0.F = (byte) 3;
            }
        }
    }

    public final void q4() {
        if (this.s != null) {
            try {
                int v0 = cmb.v0(cmb.ni, this.A0);
                int v02 = cmb.v0(cmb.oi, this.A0);
                int v03 = cmb.v0(cmb.mi, this.A0);
                if (this.s6 != null && cmb.c1(v0)) {
                    v0 = cmb.a(0.05f, -0.04f, this.s6.c(false));
                    ec7 ec7Var = this.s6;
                    if (ec7Var != null) {
                        int d = ec7Var.d(cmb.I.o());
                        v02 = cmb.C(cmb.I.o(), cmb.v0(cmb.u6, this.A0), d, v02, d);
                    }
                    v03 = -1;
                }
                s09 s09Var = this.A6;
                s09 s09Var2 = this.s;
                int[] iArr = this.B6;
                if (s09Var != s09Var2 || iArr[0] != v0 || iArr[1] != v02 || iArr[2] != v03) {
                    this.A6 = s09Var2;
                    iArr[0] = v0;
                    iArr[1] = v02;
                    iArr[2] = v03;
                    Drawable mutate = this.fragmentView.getContext().getResources().getDrawable(2131231202).mutate();
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
                    sn2 sn2Var = new sn2(mutate, cmb.h0(gm.L(56.0f), v0, v02), 0, 0);
                    int L = gm.L(56.0f);
                    int L2 = gm.L(56.0f);
                    sn2Var.e = L;
                    sn2Var.f = L2;
                    this.s.setBackground(sn2Var);
                    this.s.setColorFilter(new PorterDuffColorFilter(v03, mode));
                }
            } catch (Exception unused) {
            }
        }
    }

    public final boolean r2() {
        if (this.e1 != 0 && getMessagesController().B0().f(this.e1)) {
            return true;
        }
        return false;
    }

    public final void r3(float r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.r3(float):void");
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        wn5 wn5Var = this.r0;
        if (wn5Var != null) {
            wn5Var.f = bundle.getString("path");
        }
    }

    @Override
    public final boolean s(nk3 nk3Var) {
        return false;
    }

    public final boolean s2() {
        if (this.F2 != null) {
            return getMessagesController().l2(this.F2);
        }
        oc7 messagesController = getMessagesController();
        TLRPC.UserFull userFull = this.w2;
        messagesController.getClass();
        return oc7.M2(userFull);
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        wn5 wn5Var = this.r0;
        if (wn5Var != null && (str = wn5Var.f) != null) {
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
        J1();
        rja rjaVar = this.simpleActionBar;
        if (rjaVar != null) {
            rjaVar.setAlpha(f);
        }
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null) {
            aVar.getBackButton().setTranslationX(gm.R1(l2(gm.L(2.0f), 2, this.actionBar.getBackButton()), gm.L(2.0f), f));
        }
        if (this.J1 == 2) {
            this.f0.setProgressToExpand(f);
            qn8 qn8Var = this.a0;
            if (qn8Var != null) {
                qn8Var.setParentExpanded(f);
            }
            t3(f);
            mt8 mt8Var = this.c0;
            if (mt8Var != null) {
                mt8Var.setParentExpanded(f);
            }
            ita itaVar = this.T;
            if (itaVar != null) {
                itaVar.setParentExpanded(f);
            }
            K3();
            d4();
        }
        this.a.setAlpha(f);
        this.a.setTranslationX(gm.L(48.0f) - (gm.L(48.0f) * f));
        if (this.J1 != 2 || (v0 = this.s0) == 0) {
            if (this.e1 == 0) {
                if (sd2.S(this.currentAccount, this.f1)) {
                    boolean z = this.F2.megagroup;
                }
            }
            ylb ylbVar = this.A0;
            int[][] iArr = pc0.L;
            v0 = cmb.v0(cmb.Z6, ylbVar);
        }
        int i2 = this.h5;
        if (i2 == 0) {
            i2 = cmb.v0(cmb.r8, this.A0);
        }
        this.d1.setBackgroundColor(on2.f(f, on2.p(i2, 0), v0));
        sqb sqbVar = this.m0;
        int f2 = on2.f(f, i2, v0);
        sqbVar.k = true;
        sqbVar.b.setColor(f2);
        int i3 = -1;
        if (this.s6 != null) {
            v02 = -1;
        } else {
            if (this.e1 == 0) {
                if (sd2.S(this.currentAccount, this.f1)) {
                    boolean z2 = this.F2.megagroup;
                }
            }
            ylb ylbVar2 = this.A0;
            int[][] iArr2 = pc0.L;
            v02 = cmb.v0(cmb.f8, ylbVar2);
        }
        this.actionBar.H(on2.f(this.T1, cmb.v0(cmb.u8, this.A0), v02), false);
        if (this.s6 == null) {
            i3 = cmb.v0(cmb.li, this.A0);
        }
        int v04 = cmb.v0(cmb.z8, this.A0);
        mt1 mt1Var = this.f;
        if (mt1Var != null && this.J1 != 2) {
            mt1Var.setTextColor(on2.f(f, v04, i3));
        }
        boolean[] zArr = this.K0;
        if (zArr[0]) {
            v03 = cmb.v0(cmb.ri, this.A0);
        } else {
            if (this.e1 == 0) {
                if (sd2.S(this.currentAccount, this.f1)) {
                    boolean z3 = this.F2.megagroup;
                }
            }
            ylb ylbVar3 = this.A0;
            int[][] iArr3 = pc0.L;
            v03 = cmb.v0(cmb.g8, ylbVar3);
        }
        if (zArr[0]) {
            i = cmb.oa;
        } else {
            i = cmb.A8;
        }
        int v05 = cmb.v0(i, this.A0);
        ap8 ap8Var = this.r;
        if (ap8Var != null && this.J1 != 2) {
            ap8Var.setTextColor(on2.f(f, v05, B1(v03, Boolean.valueOf(zArr[0]))));
        }
        this.Q1 = this.S1 * f;
        long j = this.e1;
        if (j == 0) {
            j = this.f1;
        }
        ylb ylbVar4 = this.A0;
        int[][] iArr4 = pc0.L;
        int v06 = cmb.v0(cmb.o8[pc0.d(j)], ylbVar4);
        long j2 = this.e1;
        if (j2 == 0) {
            j2 = this.f1;
        }
        int c = pc0.c(j2);
        if (v06 != c) {
            this.q0.g(on2.f(f, c, v06));
            this.f0.invalidate();
        }
        int i4 = this.i5;
        if (i4 != 0) {
            setNavigationBarColor(on2.f(f, i4, getNavigationBarColor()));
        }
        this.d1.invalidate();
        Q2(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        fq8 fq8Var = this.o6;
        if (fq8Var != null) {
            fq8Var.invalidate();
        }
        if (a() > 0) {
            yo8 yo8Var = this.f0;
            if (yo8Var != null) {
                yo8Var.setProgressToStoriesInsets(this.T1);
            }
            bp8 bp8Var = this.v0;
            if (bp8Var != null) {
                bp8Var.setProgressToStoriesInsets(this.T1);
            }
            xs8 xs8Var = this.w0;
            if (xs8Var != null) {
                xs8Var.setProgressToStoriesInsets(this.T1);
            }
        }
    }

    @Override
    public final void setParentLayout(tk5 tk5Var) {
        super.setParentLayout(tk5Var);
        s34 s34Var = this.Y1;
        if (s34Var != null) {
            s34Var.g();
            this.Y1 = null;
        }
        if (tk5Var != null && tk5Var.getParentActivity() != null) {
            this.Y1 = new s34(tk5Var.getParentActivity().getWindow(), new tn8(this, (byte) 8));
        }
    }

    @Override
    public final boolean t() {
        return this.n6;
    }

    public final boolean t2(z82 z82Var) {
        String str;
        if (!(this.r5 instanceof yv1) && (z82Var.getSubtitleTextView() instanceof lka)) {
            CharSequence text = ((lka) z82Var.getSubtitleTextView()).getText();
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
        return false;
    }

    public final void t3(float f) {
        this.U5 = f;
        fr8 fr8Var = this.T5;
        if (fr8Var != null) {
            fr8Var.b(f);
        }
        Z3();
    }

    @Override
    public final void u() {
        this.a.z0(0);
    }

    public final boolean u2() {
        if (this.r0 != null && !this.s1) {
            return true;
        }
        return false;
    }

    public final void u3(TLRPC.ChatFull chatFull) {
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
        wp8 wp8Var = this.O;
        if (wp8Var != null) {
            wp8Var.setChatInfo(this.v2);
        }
        zo8 zo8Var = this.o0;
        if (zo8Var != null && !this.q1) {
            zo8Var.setChatInfo(this.v2);
        }
        bp8 bp8Var = this.v0;
        if (bp8Var != null && (chatFull3 = this.v2) != null) {
            bp8Var.setStories(chatFull3.stories);
        }
        xs8 xs8Var = this.w0;
        if (xs8Var != null) {
            xs8Var.a();
        }
        yo8 yo8Var = this.f0;
        if (yo8Var != null) {
            yo8Var.setHasStories(P2());
        }
        V1();
        if (this.f1 != 0) {
            boolean z2 = e21.a;
            if (!getMessagesController().I3() && (chatFull2 = this.v2) != null && chatFull2.stargifts_available) {
                z = true;
            } else {
                z = false;
            }
            this.T0.Q(38, z);
            qn8 qn8Var = this.a0;
            if (qn8Var != null) {
                qn8Var.o(3, z);
            }
        }
    }

    public final void v2() {
        boolean z;
        TLRPC.Document document;
        if (this.b0 == null) {
            if (MediaController.w().R0 != null && MediaController.w().R0.a == this.currentAccount && MediaController.w().R0.b == a()) {
                this.b0 = MediaController.w().R0;
            } else {
                jc7 jc7Var = new jc7(this.currentAccount, a());
                this.b0 = jc7Var;
                TLRPC.UserFull userFull = this.w2;
                if (userFull != null && (document = userFull.saved_music) != null) {
                    ArrayList arrayList = jc7Var.c;
                    arrayList.clear();
                    jc7Var.b();
                    arrayList.add(0, jc7Var.d(document));
                }
            }
        }
        if (!this.b0.c.isEmpty()) {
            if (MediaController.w().R0 == this.b0 && MediaController.w().D((k47) this.b0.c.get(0))) {
                z = true;
            } else {
                MediaController.w().j();
                z = false;
            }
            MediaController.w().R0 = this.b0;
            MediaController.w().S0.clear();
            MediaController.w().S0.addAll(this.b0.c);
            if (!z) {
                MediaController.w().R((k47) this.b0.c.get(0));
            }
            showDialog(new i30(getParentActivity(), this.A0));
        }
    }

    public final void v3(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.Z != null && (tL_emojiStatusCollectible2 = this.P6) != tL_emojiStatusCollectible) {
            if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
                this.P6 = tL_emojiStatusCollectible;
                hg5 hg5Var = this.M6;
                if (hg5Var != null) {
                    hg5Var.f(true);
                }
                if (tL_emojiStatusCollectible != null && !TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                    this.O6 = null;
                    this.M6 = new hg5(getParentActivity(), 3);
                    this.N6 = cmb.v(tL_emojiStatusCollectible.center_color | (-16777216), cmb.p1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
                    this.M6.setPadding(gm.L(4.0f), 0, gm.L(4.0f), gm.L(2.0f));
                    hg5 hg5Var2 = this.M6;
                    int p1 = cmb.p1(0.5f, tL_emojiStatusCollectible.text_color | (-16777216));
                    hg5Var2.M0 = true;
                    hg5Var2.U0 = System.currentTimeMillis();
                    hg5Var2.N0 = new Path();
                    hg5Var2.O0 = gm.N(0.66f) / 2.0f;
                    hg5Var2.P0 = new Paint(1);
                    hg5Var2.Q0 = new Paint(1);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, gm.L(64.0f), 0.0f, new int[]{cmb.p1(0.0f, p1), cmb.p1(1.0f, p1), cmb.p1(0.0f, p1)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    hg5Var2.T0 = linearGradient;
                    hg5Var2.Q0.setShader(linearGradient);
                    hg5Var2.R0 = new LinearGradient(0.0f, 0.0f, gm.L(64.0f), 0.0f, new int[]{cmb.p1(0.0f, p1), cmb.p1(0.5f, p1), cmb.p1(0.0f, p1)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    hg5Var2.S0 = new Matrix();
                    hg5Var2.P0.setShader(hg5Var2.R0);
                    hg5Var2.Q0.setStyle(Paint.Style.STROKE);
                    hg5Var2.Q0.setStrokeJoin(Paint.Join.ROUND);
                    hg5Var2.Q0.setStrokeCap(Paint.Cap.ROUND);
                    hg5Var2.Q0.setStrokeWidth(gm.N(0.66f));
                    this.Z.addView(this.M6, qoe.c(24.0f, -1));
                    this.M6.u(9.33f);
                    hg5 hg5Var3 = this.M6;
                    Typeface o = gm.o();
                    hg5Var3.I.x(o);
                    hg5Var3.K.setTypeface(o);
                    this.M6.t(tL_emojiStatusCollectible.title);
                    hg5 hg5Var4 = this.M6;
                    hg5Var4.d = -1L;
                    hg5Var4.m(5.66f, 2.66f, 5.66f, 2.66f);
                    hg5 hg5Var5 = this.M6;
                    hg5Var5.getClass();
                    hg5Var5.E = gm.N(4.0f);
                    hg5Var5.F = gm.N(2.66f);
                    this.M6.r();
                    this.M6.q(16.0f);
                    this.M6.v();
                    this.M6.setOnClickListener(new go8(this, tL_emojiStatusCollectible.slug, (byte) 1));
                    if (this.Q1 < gm.L(82.0f)) {
                        this.O6 = Boolean.FALSE;
                        this.M6.setAlpha(0.0f);
                    }
                    N3();
                    hg5 hg5Var6 = this.M6;
                    Objects.requireNonNull(hg5Var6);
                    gm.d3(new hi(hg5Var6, (byte) 7), 6000L);
                }
            }
        }
    }

    @Override
    public final boolean w() {
        return false;
    }

    public final void w2(float f, float f2, int i) {
        switch (i) {
            case 0:
                boolean z = this.q1;
                if (z) {
                    if (z) {
                        W1();
                        return;
                    }
                    return;
                } else if (this.e1 != 0) {
                    e3();
                    return;
                } else if (this.f1 != 0) {
                    if (sd2.c0(getMessagesController().L0(Long.valueOf(this.f1)))) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.f1);
                        if (getMessagesController().A(bundle, this, null, null)) {
                            presentFragment(new yv1(bundle), false);
                            return;
                        }
                        return;
                    } else if (!W1()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", this.f1);
                        if (getMessagesController().A(bundle2, this, null, null)) {
                            presentFragment(new yv1(bundle2), false);
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
                X2(this.a0, f, f2, true);
                return;
            case 2:
                f3();
                return;
            case 3:
                V2();
                return;
            case 4:
                Y2();
                return;
            case 5:
            case 10:
            case 11:
                U2(false);
                return;
            case 6:
                U2(true);
                return;
            case 7:
                W2(true);
                return;
            case 8:
                da9.F0(a(), this);
                return;
            case 9:
                N2(false);
                return;
            case 12:
                getMessagesController().X3.edit().putBoolean("story_keep", true).apply();
                he heVar = new he(3, this.A0, getParentActivity());
                heVar.q(200L);
                oc7.r1(this.currentAccount).N1().j(a(), new u35(this, heVar, (byte) 21), true, this.A0);
                return;
            case 13:
                T2(true);
                return;
            case 14:
                a3();
                return;
            case 15:
                TLRPC.User f3 = getUserConfig().f();
                if (f3 != null) {
                    bu5 I = bu5.I(this, this.a0);
                    I.w = false;
                    I.i = (byte) 3;
                    I.b(2131232326, jb6.M0(2131746233, null), new v56(this, (byte) 26), false);
                    I.b(2131232109, jb6.M0(2131746411, null), new lo8(f3, (byte) 0), false);
                    I.b(2131232122, jb6.M0(2131746353, null), new v56(this, (byte) 27), false);
                    I.Z = true;
                    I.b0(f - gm.L(8.0f), this.a0.getMeasuredHeight() - gm.L(16.0f));
                    I.a0();
                    return;
                }
                return;
            case 16:
                presentFragment(new UserInfoActivity());
                return;
            case 17:
                presentFragment(new daa(null));
                return;
            default:
                return;
        }
    }

    public final void w3(boolean z) {
        Drawable t = this.f0.getImageReceiver().t();
        String str = null;
        if (t instanceof jbc) {
            this.f0.v(null, null, t);
        } else if (t instanceof kn) {
            kn knVar = (kn) t;
            this.f0.v(null, null, knVar);
            if (z) {
                knVar.f(this.f0);
            }
        } else {
            gn5 D = this.o0.D(0);
            if (D != null && D.p == 2) {
                str = "avatar";
            }
            this.f0.v(D, str, t);
        }
    }

    public final void x2(Context context, long j, TL_payments.connectedBotStarRef connectedbotstarref) {
        int i = this.currentAccount;
        if (connectedbotstarref == null) {
            mh1.J0(context, i, this.w2.starref_program, getUserConfig().e(), this.A0, false);
        } else {
            mh1.K0(context, i, connectedbotstarref, j, this.A0);
        }
    }

    public final void y2(Boolean bool) {
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
            oc7.r1(i).S(this.k5, j3);
        } else {
            oc7.r1(i).d0(this.k5, this.j5, j3);
        }
        this.j5 = 0;
        c4(false, false);
        b31 b31Var = new b31(getParentActivity(), this.A0);
        b31Var.d(2131623982, new String[0]);
        b31Var.b.setText(jb6.M0(2131746137, null));
        c41.b0(this).b(b31Var, 1500).j();
    }

    @Override
    public final nz4 z() {
        eh0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (sy4.f().a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    public final void z2(oh2[] oh2VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = getMessagesController().n1(this.e1);
        tL_messages_reportReaction.peer = getMessagesController().i1(this.k5);
        tL_messages_reportReaction.id = this.j5;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reportReaction, new nf2((byte) 4));
        oh2 oh2Var = oh2VarArr[0];
        if (oh2Var != null && oh2Var.b()) {
            getMessagesController().b0(-this.k5, getMessagesController().W1(Long.valueOf(this.e1)));
        }
        this.j5 = 0;
        c4(false, false);
        c41.b0(this).E(this.A0).j();
    }

    public final void z3(dq8 dq8Var) {
        if (this.t5 == dq8Var) {
            return;
        }
        this.t5 = dq8Var;
        gm.d0(this.a, new ao8(this, (byte) 1));
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

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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MultiAutoCompleteTextView;
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
public class ProfileActivity extends org.telegram.ui.ActionBar.d implements gk7, wi3, gfa, vl5, cea, zg6 {
    public static final RectF Z6 = new RectF();
    public static final int a7 = gl.L(16.0f);
    public wjb A0;
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
    public gl5 C0;
    public vf6 C1;
    public int C2;
    public int C3;
    public int C4;
    public u41[] C5;
    public float C6;
    public int D0;
    public boolean D1;
    public ArrayList D2;
    public int D3;
    public int D4;
    public b61 D5;
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
    public u41 F5;
    public uo8 F6;
    public tl G;
    public boolean G0;
    public boolean G1;
    public TL_bots.BotInfo G2;
    public int G3;
    public int G4;
    public float G5;
    public bp8 G6;
    public tl H;
    public boolean H0;
    public boolean H1;
    public TLRPC.ChannelParticipant H2;
    public int H3;
    public int H4;
    public View H5;
    public je5 H6;
    public Drawable I;
    public boolean I0;
    public boolean I1;
    public TL_account.TL_password I2;
    public int I3;
    public int I4;
    public int I5;
    public int I6;
    public m33 J;
    public boolean J0;
    public byte J1;
    public TLRPC.FileLocation J2;
    public int J3;
    public int J4;
    public int J5;
    public Boolean J6;
    public m33 K;
    public final boolean[] K0;
    public boolean K1;
    public TLRPC.FileLocation K2;
    public int K3;
    public int K4;
    public int K5;
    public TLRPC.TL_emojiStatusCollectible K6;
    public gq9 L;
    public boolean L0;
    public boolean L1;
    public gl5 L2;
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
    public nl0 M5;
    public boolean M6;
    public lo8 N;
    public boolean N0;
    public boolean N1;
    public wgb N2;
    public int N3;
    public int N4;
    public final pj4 N5;
    public int N6;
    public vn8 O;
    public boolean O0;
    public boolean O1;
    public int O2;
    public int O3;
    public int O4;
    public ep8 O5;
    public int O6;
    public zya P;
    public ImageView P0;
    public boolean P1;
    public int P2;
    public int P3;
    public int P4;
    public float P5;
    public int P6;
    public boolean Q;
    public xha Q0;
    public float Q1;
    public int Q2;
    public int Q3;
    public int Q4;
    public int Q5;
    public final hx4 Q6;
    public ffa R;
    public xha R0;
    public float R1;
    public int R2;
    public int R3;
    public boolean R4;
    public float R5;
    public final kl0 R6;
    public boolean S;
    public xha S0;
    public float S1;
    public int S2;
    public int S3;
    public boolean S4;
    public final fm0 S5;
    public cg0 S6;
    public hra T;
    public xha T0;
    public float T1;
    public int T2;
    public int T3;
    public int T4;
    public fn8 T5;
    public final Paint T6;
    public sb U;
    public xha U0;
    public int U1;
    public int U2;
    public int U3;
    public final ArrayList U4;
    public AnimatorSet U5;
    public Drawable U6;
    public oy8 V;
    public a8 V0;
    public float V1;
    public int V2;
    public int V3;
    public final ArrayList V4;
    public AnimatorSet V5;
    public Drawable V6;
    public oy8 W;
    public a8 W0;
    public ValueAnimator W1;
    public int W2;
    public int W3;
    public byte W4;
    public float W5;
    public Drawable W6;
    public je5 X;
    public a8 X0;
    public boolean X1;
    public int X2;
    public int X3;
    public boolean X4;
    public boolean X5;
    public cm2 X6;
    public oc6 Y;
    public ImageView Y0;
    public h24 Y1;
    public int Y2;
    public int Y3;
    public boolean Y4;
    public final dn8 Y5;
    public final int[] Y6;
    public st Z;
    public a8 Z0;
    public final HashMap Z1;
    public int Z2;
    public int Z3;
    public cn8 Z4;
    public View Z5;
    public om8 a;
    public pl8 a0;
    public spc a1;
    public float a2;
    public int a3;
    public int a4;
    public View a5;
    public int a6;
    public o39 b;
    public ia7 b0;
    public float b1;
    public float b2;
    public int b3;
    public int b4;
    public float b5;
    public int b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public qm8 c;
    public jr8 c0;
    public int c1;
    public float c2;
    public int c3;
    public int c4;
    public int c5;
    public CharSequence c6;
    public ko8 d;
    public xo8 d0;
    public wo8 d1;
    public float d2;
    public int d3;
    public int d4;
    public int d5;
    public boolean d6;
    public to8 e;
    public ym e0;
    public long e1;
    public float e2;
    public int e3;
    public int e4;
    public int e5;
    public final bn8 e6;
    public zr1 f;
    public xm8 f0;
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
    public u95 h0;
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
    public eo8 j6;
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
    public cj3 l5;
    public final RectF l6;
    public rob m0;
    public long m1;
    public float m2;
    public int m3;
    public int m4;
    public sy1 m5;
    public float m6;
    public String n;
    public kp8 n0;
    public boolean n1;
    public final float[] n2;
    public int n3;
    public int n4;
    public final HashSet n5;
    public da7 n6;
    public ym8 o0;
    public boolean o1;
    public boolean o2;
    public int o3;
    public int o4;
    public co8 o5;
    public final SparseIntArray o6;
    public mo8 p0;
    public boolean p1;
    public boolean p2;
    public int p3;
    public int p4;
    public final dn8 p5;
    public int p6;
    public pb0 q0;
    public boolean q1;
    public boolean q2;
    public int q3;
    public int q4;
    public final jn8 q5;
    public AnimatorSet q6;
    public zm8 r;
    public wl5 r0;
    public boolean r1;
    public final Paint r2;
    public int r3;
    public int r4;
    public boolean r5;
    public int r6;
    public ry8 s;
    public int s0;
    public boolean s1;
    public boolean s2;
    public int s3;
    public int s4;
    public tn8 s5;
    public int s6;
    public rob t0;
    public boolean t1;
    public tq0 t2;
    public int t3;
    public int t4;
    public float t5;
    public boolean t6;
    public zq8 u0;
    public int u1;
    public uo0 u2;
    public int u3;
    public int u4;
    public float u5;
    public boolean u6;
    public an8 v0;
    public boolean v1;
    public TLRPC.ChatFull v2;
    public int v3;
    public int v4;
    public boolean v5;
    public ry8 v6;
    public AnimatorSet w;
    public vq8 w0;
    public boolean w1;
    public TLRPC.UserFull w2;
    public int w3;
    public int w4;
    public boolean w5;
    public final int[] w6;
    public Drawable x;
    public View x0;
    public boolean x1;
    public hp8 x2;
    public int x3;
    public int x4;
    public ImageReceiver x5;
    public float x6;
    public Drawable y;
    public final wm8 y0;
    public int y1;
    public boolean y2;
    public int y3;
    public int y4;
    public FrameLayout y5;
    public CharSequence y6;
    public final Paint z0;
    public boolean z1;
    public yo8 z2;
    public int z3;
    public int z4;
    public FrameLayout[] z5;
    public CharSequence z6;

    public ProfileActivity(Bundle bundle, ffa ffaVar) {
        super(bundle);
        this.h = null;
        this.n = null;
        this.x0 = null;
        this.y0 = new wm8(this, (byte) 0);
        this.z0 = new Paint(1);
        this.K0 = new boolean[1];
        this.b1 = 1.0f;
        this.C1 = new vf6();
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
        this.p5 = new dn8(this, (byte) 0);
        this.q5 = new jn8(this);
        this.N5 = new pj4(this, (byte) 27);
        this.R5 = 1.0f;
        this.S5 = new fm0(0, new ql8(this, (byte) 7), s33.h, 380L, true);
        this.Y5 = new dn8(this, (byte) 1);
        this.e6 = new bn8(this, (byte) 2);
        this.f6 = null;
        this.l6 = new RectF();
        this.o6 = new SparseIntArray();
        this.q6 = null;
        this.r6 = -1;
        this.w6 = new int[3];
        this.x6 = -1.0f;
        hx4 hx4Var = new hx4();
        this.Q6 = hx4Var;
        kl0 kl0Var = new kl0(hx4Var, hx4Var, hx4Var);
        this.R6 = kl0Var;
        this.T6 = new Paint();
        this.Y6 = new int[7];
        this.R = ffaVar;
        kl0Var.g = new e59(0, false);
    }

    public static void E1(View view, Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        if (view != null && view.getVisibility() == 0 && view.getAlpha() > 0.0f) {
            RectF rectF2 = Z6;
            if (zec.c(view, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
                tk0.b(new vw0(view, (byte) 6), canvas, rectF, view, viewGroup, (int) (view.getAlpha() * 255.0f));
            }
        }
    }

    public static void L2(String str, StringBuilder sb) {
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

    public static SpannableStringBuilder O1(String str, int i, wjb wjbVar) {
        int v0 = bkb.v0(i, wjbVar);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        nd4 nd4Var = new nd4(9);
        nd4Var.w = str;
        if (nd4Var.c != null) {
            nd4Var.c = null;
            nd4Var.a();
        }
        nd4Var.f = v0;
        nd4Var.n = false;
        spannableStringBuilder.setSpan(nd4Var, 0, spannableStringBuilder.length(), 0);
        nd4[] nd4VarArr = (nd4[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), nd4.class);
        if (nd4VarArr != null) {
            for (nd4 nd4Var2 : nd4VarArr) {
                nd4Var2.getClass();
                nd4Var2.f = bkb.v0(i, wjbVar);
                nd4Var2.r = i;
                nd4Var2.s = wjbVar;
                nd4Var2.n = true;
            }
        }
        return spannableStringBuilder;
    }

    public static ProfileActivity P2(long j) {
        Bundle bundle = new Bundle();
        if (j >= 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        return new ProfileActivity(bundle, null);
    }

    public static int a0(ProfileActivity profileActivity) {
        return profileActivity.currentAccount;
    }

    public static void l3(Activity activity, boolean z) {
        if (activity == null) {
            return;
        }
        hd hdVar = new hd(3, null, activity);
        hdVar.j0 = false;
        hdVar.show();
        Utilities.e.c(new vj6(hdVar, z, activity, (byte) 17));
    }

    public static void o3(FrameLayout frameLayout, float f) {
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

    public static void t3(int i, View view) {
        if (view != null && view.getLayoutParams() != null && view.getLayoutParams().height != i) {
            view.getLayoutParams().height = i;
            if (view.isLaidOut()) {
                view.setBottom(view.getTop() + i);
            } else {
                view.requestLayout();
            }
        }
    }

    public static void u3(xha xhaVar, boolean z, boolean z2) {
        int i;
        if (ug8.A(xhaVar)) {
            xhaVar.Y(z, z2);
        } else if (xhaVar != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            xhaVar.setVisibility(i);
        }
    }

    @Override
    public final lx4 A() {
        dg0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (qw4.f().a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    public final void A1() {
        int f;
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null && this.f != null && this.d1 != null && this.T0 != null && this.Q0 != null && this.R0 != null && this.S0 != null && this.p0 != null) {
            Float valueOf = Float.valueOf(this.W5);
            dn8 dn8Var = this.Y5;
            dn8Var.getClass();
            dn8Var.a(aVar, valueOf);
            if (this.W5 <= 0.0f && this.l2 > 0.0f) {
                zr1 zr1Var = this.f;
                int i = -1;
                if (this.n6 != null) {
                    f = -1;
                } else {
                    f = bm2.f(this.l2, bkb.v0(bkb.li, this.A0), -1);
                }
                zr1Var.setTextColor(f);
                org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
                if (this.n6 == null) {
                    i = bm2.f(this.l2, bkb.v0(bkb.u8, this.A0), -1);
                }
                aVar2.H(i, false);
            }
        }
    }

    public final void A2(TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        boolean z;
        TLRPC.VideoSize x;
        if (tL_error == null) {
            TLRPC.User V1 = getMessagesController().V1(Long.valueOf(getUserConfig().e()));
            if (V1 == null) {
                V1 = getUserConfig().f();
                if (V1 == null) {
                    return;
                }
                getMessagesController().a4(V1, false, false);
            } else {
                getUserConfig().v(V1);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize w = ba4.w(arrayList, 150, false, null, false);
            TLRPC.PhotoSize w2 = ba4.w(arrayList, 800, false, null, false);
            if (tL_photos_photo.photo.video_sizes.isEmpty()) {
                x = null;
            } else {
                x = ba4.x(1000, tL_photos_photo.photo.video_sizes);
            }
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            V1.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
            if (w != null) {
                tL_userProfilePhoto.photo_small = w.location;
            }
            if (w2 != null) {
                tL_userProfilePhoto.photo_big = w2.location;
            }
            if (w != null && this.J2 != null) {
                ba4.G(this.currentAccount);
                File J = ba4.J(w, null, true, true);
                ba4.G(this.currentAccount);
                ba4.J(this.J2, null, true, true).renameTo(J);
                StringBuilder sb = new StringBuilder();
                sb.append(this.J2.volume_id);
                sb.append("_");
                String l = de9.l(sb, this.J2.local_id, "@50_50");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(w.location.volume_id);
                sb2.append("_");
                fl5.z().O(l, de9.l(sb2, w.location.local_id, "@50_50"), gl5.m(this.currentAccount, 1, V1));
            }
            if (x != null && str != null) {
                ba4.G(this.currentAccount);
                new File(str).renameTo(ba4.J(x, "mp4", true, true));
            } else if (w2 != null && this.K2 != null) {
                ba4.G(this.currentAccount);
                File J2 = ba4.J(w2, null, true, true);
                ba4.G(this.currentAccount);
                ba4.J(this.K2, null, true, true).renameTo(J2);
            }
            getMessagesController().S0(V1.id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(V1);
            getMessagesStorage().j1(arrayList2, null, false, true);
            TLRPC.UserFull W1 = getMessagesController().W1(this.e1);
            if (W1 != null) {
                W1.profile_photo = tL_photos_photo.photo;
                getMessagesStorage().g2(W1, false);
            }
        }
        if (!gl.O1() && !this.o2 && this.f0.getImageReceiver().E() && !gl.A1()) {
            z = true;
        } else {
            z = false;
        }
        this.p2 = z;
        this.J2 = null;
        this.K2 = null;
        ym8 ym8Var = this.o0;
        ym8Var.I0 = true;
        ym8Var.L0 = this.L2;
        ym8Var.r1 = null;
        ym8Var.s1 = null;
        ym8Var.setCreateThumbFromParent(false);
        d4(true);
        B3(false, true);
        getNotificationCenter().k(2, Integer.valueOf(na7.q5));
        getNotificationCenter().k(kk7.i0, new Object[0]);
        getUserConfig().u(true);
    }

    public final void A3() {
        dg0 baseSimpleGlass = getBaseSimpleGlass();
        ep8 ep8Var = new ep8(this.glassEngine, baseSimpleGlass);
        this.O5 = ep8Var;
        wo8 wo8Var = this.d1;
        if (wo8Var != null) {
            int i = wo8Var.I;
            boolean z = wo8Var.c;
            if (ep8Var.i != i || ep8Var.j != z) {
                ep8Var.i = i;
                ep8Var.j = z;
                ep8Var.a();
            }
        }
        this.O5.b(this.P5);
        pl8 pl8Var = this.a0;
        if (pl8Var != null) {
            pl8Var.setGlassFactory(this.O5.c);
        }
        jr8 jr8Var = this.c0;
        if (jr8Var != null) {
            jr8Var.setGlassFactory(this.O5.c);
        }
        this.simpleActionBar.setButtonsGlass(this.O5.d);
        this.simpleActionBar.setMenuGlassStroke(false);
        tn8 tn8Var = this.s5;
        pha phaVar = this.simpleActionBar;
        wjb wjbVar = this.A0;
        baseSimpleGlass.m = tn8Var;
        baseSimpleGlass.n = null;
        baseSimpleGlass.g(tn8Var, phaVar, wjbVar);
        pha phaVar2 = this.simpleActionBar;
        ep8 ep8Var2 = this.O5;
        kl0 kl0Var = ep8Var2.e;
        jx4 jx4Var = ep8Var2.f;
        phaVar2.p0 = kl0Var;
        phaVar2.q0 = jx4Var;
        phaVar2.setBackground(null);
        this.M5 = nod.l(this.A0);
        this.simpleActionBar.setButtonsGlassColorProvider(this.N5);
        V3();
        baseSimpleGlass.o = this.S6;
        View view = new View(getParentActivity());
        this.Z5 = view;
        view.setAlpha(0.0f);
        this.s5.getViewTreeObserver().addOnPreDrawListener(new qr1(this, (byte) 4));
        this.O.e(this.Z5);
        View view2 = this.Z5;
        view2.setBackground(baseSimpleGlass.a(view2));
        View view3 = new View(getParentActivity());
        this.H5 = view3;
        view3.setBackground(baseSimpleGlass.a(view3));
        tn8 tn8Var2 = this.s5;
        tn8Var2.addView(this.H5, tn8Var2.indexOfChild(this.Z), nme.e(-1, 0, 48));
        this.glassEngine.b(this.a);
        this.O.setPagesGlassEngine(this.glassEngine);
        this.O.setOnTopPanelShiftChanged(new v36(this, (byte) 21));
        y1();
        S3();
    }

    public final void B1() {
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
                    i = gl.m;
                } else {
                    i = 0;
                }
                float translationY = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f) + i) - gl.L(21.0f));
                this.c2 = gl.R1(0.42f, this.f6[0], l);
                this.a2 = gl.R1(this.k6, this.f6[1], l);
                this.b2 = gl.R1(translationY, this.f6[2], l);
                this.d2 = gl.R1(this.f6[11], 0.0f, l);
                this.Y.setScaleX(this.c2);
                this.Y.setScaleY(this.c2);
                this.Y.setTranslationX(this.a2);
                this.Y.setTranslationY(this.b2);
                hra hraVar = this.T;
                if (hraVar != null) {
                    hraVar.setAlpha(l);
                }
                this.f0.setAlpha(1.0f);
                this.Y.setAlpha(1.0f);
                an8 an8Var = this.v0;
                if (an8Var != null) {
                    an8Var.invalidate();
                }
                vq8 vq8Var = this.w0;
                if (vq8Var != null) {
                    vq8Var.e = gl.R1(0.0f, this.f6[4], f);
                    this.w0.f = gl.R1(0.0f, this.f6[5], l);
                    vq8 vq8Var2 = this.w0;
                    vq8Var2.h = true;
                    vq8Var2.invalidate();
                }
                uo8 uo8Var = this.F6;
                if (uo8Var != null) {
                    uo8Var.setAlpha((int) gl.R1(0.0f, this.f6[6], l));
                }
                float L = (((this.c2 * 100.0f) / 42.0f) * gl.L(42.0f)) - gl.L(42.0f);
                this.i0.setTranslationX(this.Y.getX() + gl.L(16.0f) + L);
                this.i0.setTranslationY(this.Y.getY() + gl.L(-10.0f) + L);
                this.j0.setTranslationX(this.Y.getX() + gl.L(28.0f) + L);
                this.j0.setTranslationY(this.Y.getY() + gl.L(26.5f) + L);
                this.k0.setTranslationX(this.Y.getX() + gl.L(28.0f) + L);
                this.k0.setTranslationY(this.Y.getY() + gl.L(24.0f) + L);
                this.l0.setTranslationX(this.Y.getX() + gl.L(28.0f) + L);
                this.l0.setTranslationY(this.Y.getY() + gl.L(24.0f) + L);
                float R1 = gl.R1(i2(0), this.f6[7], l);
                if (this.actionBar.getOccupyStatusBar()) {
                    i2 = gl.m;
                } else {
                    i2 = 0;
                }
                float currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f;
                float floor = ((float) Math.floor(this.actionBar.getTranslationY() + ((currentActionBarHeight + i2) - (gl.p * 21.0f)))) + gl.L(1.3f);
                float N = gl.N(22.7f) + floor;
                this.f2 = gl.R1(floor, this.f6[8], l);
                this.h2 = gl.R1(N, this.f6[9], l);
                float L2 = (this.k6 - gl.L(109.0f)) + gl.L(48.0f);
                float R12 = gl.R1(j2(L2, 0, this.f), this.f6[12], l);
                float R13 = gl.R1(j2(L2 + this.u5, 1, this.r) - this.u5, this.f6[13], l);
                this.f.setTranslationX(R12);
                this.f.setTranslationY(this.f2);
                this.r.setTranslationX(this.u5 + R13);
                this.r.setTranslationY(this.h2);
                this.e2 = R12;
                this.g2 = R13;
                this.f.setScaleX(R1);
                this.f.setScaleY(R1);
                float R14 = gl.R1(i2(1), 1.0f, l);
                this.r.setScaleX(R14);
                this.r.setScaleY(R14);
                J3();
                if (this.actionBar.getOccupyStatusBar()) {
                    i3 = gl.m;
                }
                P3(org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i3);
                O2((int) this.f6[10], l, true);
                pl8 pl8Var = this.a0;
                if (pl8Var != null) {
                    pl8Var.setAlpha(gl.R1(0.0f, this.f6[3], f));
                }
            }
        }
    }

    public final void B2(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            this.J2 = fileLocation;
            this.K2 = photoSize2.location;
            this.f0.m(gl5.e(fileLocation), "50_50", this.q0, null);
            if (this.P2 != -1) {
                e4();
                ko8 ko8Var = this.d;
                if (ko8Var != null) {
                    ko8Var.f();
                }
                N2(true);
            }
            ym8 ym8Var = this.o0;
            gl5 e = gl5.e(this.K2);
            this.L2 = e;
            ym8Var.A(e, gl5.e(this.J2));
            B3(true, false);
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
            this.p6 = getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new hj7(this, str, (byte) 11));
        }
        this.actionBar.t().requestLayout();
    }

    public final void B3(boolean z, boolean z2) {
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
            u95 u95Var = this.h0;
            if (z) {
                u95Var.setVisibility(0);
                this.g0.playTogether(ObjectAnimator.ofFloat(this.h0, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(u95Var, View.ALPHA, 0.0f));
            }
            this.g0.setDuration(180L);
            this.g0.addListener(new mn8(this, z, (byte) 1));
            this.g0.start();
            return;
        }
        u95 u95Var2 = this.h0;
        if (z) {
            u95Var2.setAlpha(1.0f);
            this.h0.setVisibility(0);
            return;
        }
        u95Var2.setAlpha(0.0f);
        this.h0.setVisibility(4);
    }

    public final float C1() {
        return Utilities.l((this.Q1 - W1()) / d2());
    }

    public final void C2(TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            m21 Q = u21.b0(this).Q(2131623990, 36, k96.M0(2131746665, null));
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
                String M0 = k96.M0(2131746661, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(2131746662, null);
                alertDialog$Builder.j(k96.M0(2131747638, null), null);
                showDialog(hdVar);
                return;
            }
            return;
        }
        ir2.v(null, 2131743640, u21.b0(this), 2131624012, 36);
    }

    public final void C3() {
        boolean z;
        fx0 fx0Var;
        rw0 rw0Var;
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
            fx0 i2 = ug8.i(getParentActivity(), false, 1, null);
            rw0 rw0Var2 = i2.y0;
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            final LimitPreviewView limitPreviewView = new LimitPreviewView(getParentActivity(), 2131231165, 0, 0, this.A0);
            if (a() != y6c.h(this.currentAccount).e()) {
                z = true;
            } else {
                z = false;
            }
            limitPreviewView.setHideNegativeValues(z);
            limitPreviewView.setStarRating(userFull.stars_rating);
            limitPreviewView.setTranslationY(-gl.L(14.0f));
            linearLayout.addView(limitPreviewView, nme.t(-1, -2, 17, 0, 20, 0, 10));
            if (userFull.stars_my_pending_rating != null) {
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                linearLayout.addView(frameLayout, nme.t(-1, -2, 17, 40, -12, 40, 20));
                int i3 = 2;
                l46[] l46VarArr = new l46[2];
                int i4 = 0;
                while (i4 < i3) {
                    int i5 = i3;
                    byte b4 = b3;
                    s11 s11Var = new s11(parentActivity, null, (byte) 6);
                    l46VarArr[i4] = s11Var;
                    s11Var.setGravity(17);
                    l46VarArr[i4].setTextSize(1, 12.0f);
                    zkb.X(l46VarArr[i4], bkb.x6, null);
                    zkb.G(l46VarArr[i4], bkb.Wc, null);
                    frameLayout.addView(l46VarArr[i4], nme.e(-1, -1, 119));
                    l46 l46Var = l46VarArr[i4];
                    if (i4 == 0) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    l46Var.setAlpha(f);
                    l46 l46Var2 = l46VarArr[i4];
                    if (i4 == 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.8f;
                    }
                    l46Var2.setScaleX(f2);
                    l46 l46Var3 = l46VarArr[i4];
                    if (i4 == 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = 0.8f;
                    }
                    l46Var3.setScaleY(f3);
                    i4++;
                    i3 = i5;
                    b3 = b4;
                }
                final byte b5 = b3;
                int i6 = i3;
                final zf7 zf7Var = new zf7(l46VarArr, (byte) 19);
                if (a() == y6c.h(this.currentAccount).e()) {
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
                    objArr = l46VarArr;
                    fx0Var = i2;
                    zkb.X(l46VarArr[b5], bkb.p7, null);
                    if (b6 != 0) {
                        objArr[b5].setText(gl.S2(k96.H(',', "StarRatingLevelNegativeYou", (int) j3)));
                    } else {
                        MultiAutoCompleteTextView multiAutoCompleteTextView = objArr[b5];
                        Object[] objArr2 = new Object[1];
                        objArr2[b5] = cf3.k(y6c.t0, a());
                        multiAutoCompleteTextView.setText(gl.S2(k96.a0(null, null, 2131744935, objArr2)));
                    }
                    rw0Var = rw0Var2;
                    b2 = b5;
                } else {
                    fx0Var = i2;
                    objArr = l46VarArr;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    String H = k96.H(',', "StarRatingFuture", max);
                    String H2 = k96.H(',', "StarRatingFuturePendingPoints", (int) j6);
                    CharSequence[] charSequenceArr = new CharSequence[3];
                    charSequenceArr[b5] = H;
                    charSequenceArr[1] = "\n";
                    charSequenceArr[i6] = H2;
                    spannableStringBuilder.append(TextUtils.concat(charSequenceArr));
                    spannableStringBuilder.append((CharSequence) " ");
                    rw0Var = rw0Var2;
                    spannableStringBuilder.append((CharSequence) gl.D2(gl.N2(k96.M0(2131744949, null), -1, i6, new Runnable() {
                        @Override
                        public final void run() {
                            byte b7 = b5;
                            zf7 zf7Var2 = zf7Var;
                            TLRPC.UserFull userFull2 = userFull;
                            LimitPreviewView limitPreviewView2 = limitPreviewView;
                            switch (b7) {
                                case 0:
                                    RectF rectF = ProfileActivity.Z6;
                                    limitPreviewView2.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    zf7Var2.a(Boolean.TRUE);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.Z6;
                                    limitPreviewView2.d(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                    zf7Var2.a(Boolean.FALSE);
                                    return;
                            }
                        }
                    }, null), true));
                    b2 = b5;
                    objArr[b5].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            byte b7 = b2;
                            zf7 zf7Var2 = zf7Var;
                            TLRPC.UserFull userFull2 = userFull;
                            LimitPreviewView limitPreviewView2 = limitPreviewView;
                            switch (b7) {
                                case 0:
                                    RectF rectF = ProfileActivity.Z6;
                                    limitPreviewView2.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    zf7Var2.a(Boolean.TRUE);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.Z6;
                                    limitPreviewView2.d(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                    zf7Var2.a(Boolean.FALSE);
                                    return;
                            }
                        }
                    });
                    objArr[b2].setText(spannableStringBuilder);
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                String H3 = k96.H(',', "StarRatingFuturePreview1", max);
                String H4 = k96.H(',', "StarRatingFuturePreview2", (int) j6);
                CharSequence[] charSequenceArr2 = new CharSequence[3];
                charSequenceArr2[b2] = H3;
                charSequenceArr2[1] = "\n";
                charSequenceArr2[2] = H4;
                spannableStringBuilder2.append(TextUtils.concat(charSequenceArr2));
                spannableStringBuilder2.append((CharSequence) " ");
                spannableStringBuilder2.append((CharSequence) gl.D2(gl.N2(k96.M0(2131744948, null), -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        byte b7 = b5;
                        zf7 zf7Var2 = zf7Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (b7) {
                            case 0:
                                RectF rectF = ProfileActivity.Z6;
                                limitPreviewView2.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                zf7Var2.a(Boolean.TRUE);
                                return;
                            default:
                                RectF rectF2 = ProfileActivity.Z6;
                                limitPreviewView2.d(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                zf7Var2.a(Boolean.FALSE);
                                return;
                        }
                    }
                }, null), true));
                objArr[1].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        byte b7 = b2;
                        zf7 zf7Var2 = zf7Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (b7) {
                            case 0:
                                RectF rectF = ProfileActivity.Z6;
                                limitPreviewView2.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                zf7Var2.a(Boolean.TRUE);
                                return;
                            default:
                                RectF rectF2 = ProfileActivity.Z6;
                                limitPreviewView2.d(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                zf7Var2.a(Boolean.FALSE);
                                return;
                        }
                    }
                });
                objArr[1].setText(spannableStringBuilder2);
            } else {
                fx0Var = i2;
                rw0Var = rw0Var2;
            }
            TextView textView = new TextView(parentActivity);
            textView.setTypeface(gl.o());
            textView.setGravity(17);
            textView.setText(k96.M0(2131744930, null));
            textView.setTextSize(1, 20.0f);
            int i7 = bkb.F6;
            zkb.X(textView, i7, this.A0);
            linearLayout.addView(textView, nme.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(17);
            if (userFull.id == y6c.h(this.currentAccount).e()) {
                textView2.setText(gl.S2(k96.M0(2131744931, null)));
                i = 1;
            } else {
                i = 1;
                de9.r(null, null, 2131744961, new Object[]{cf3.k(y6c.t0, a())}, textView2);
            }
            textView2.setTextSize(i, 14.0f);
            zkb.X(textView2, i7, this.A0);
            linearLayout.addView(textView2, nme.t(-1, -2, 17, 20, 0, 20, 12));
            kh8 kh8Var = new kh8(parentActivity, this.A0);
            kh8Var.a.l(k96.M0(2131744929, null), false);
            String M0 = k96.M0(2131744964, null);
            int i8 = bkb.Ei;
            kh8Var.b.setText(k96.V(null, null, 2131744960, O1(M0, i8, this.A0)));
            kh8Var.d.setVisibility(8);
            ImageView imageView = kh8Var.c;
            imageView.setImageResource(2131231831);
            wjb wjbVar = this.A0;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            zkb.s(imageView, i7, wjbVar, mode);
            linearLayout.addView(kh8Var, nme.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            kh8 kh8Var2 = new kh8(parentActivity, this.A0);
            kh8Var2.a.l(k96.M0(2131744928, null), false);
            kh8Var2.b.setText(k96.V(null, null, 2131744959, O1(k96.M0(2131744964, null), i8, this.A0)));
            kh8Var2.d.setVisibility(8);
            ImageView imageView2 = kh8Var2.c;
            imageView2.setImageResource(2131231895);
            zkb.s(imageView2, i7, this.A0, mode);
            linearLayout.addView(kh8Var2, nme.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            kh8 kh8Var3 = new kh8(parentActivity, this.A0);
            kh8Var3.a.l(k96.M0(2131744927, null), false);
            String M02 = k96.M0(2131744962, null);
            if (bkb.I.o()) {
                v0 = bm2.f(0.25f, bkb.v0(bkb.l6, this.A0), -16777216);
            } else {
                v0 = bkb.v0(bkb.x6, this.A0);
            }
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(M02);
            nd4 nd4Var = new nd4(9);
            nd4Var.w = M02;
            if (nd4Var.c != null) {
                nd4Var.c = null;
                nd4Var.a();
            }
            nd4Var.f = v0;
            nd4Var.n = false;
            spannableStringBuilder3.setSpan(nd4Var, 0, spannableStringBuilder3.length(), 0);
            kh8Var3.b.setText(k96.V(null, null, 2131744958, spannableStringBuilder3));
            kh8Var3.d.setVisibility(8);
            ImageView imageView3 = kh8Var3.c;
            imageView3.setImageResource(2131231879);
            zkb.s(imageView3, i7, this.A0, mode);
            linearLayout.addView(kh8Var3, nme.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            u41 u41Var = new u41(this.A0, parentActivity, true);
            u41Var.setOnClickListener(new vy(rw0Var, (byte) 1));
            u41Var.i(vqa.k2(k96.M0(2131743649, null)), false, true);
            linearLayout.addView(u41Var, nme.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            fx0 fx0Var2 = fx0Var;
            fx0Var2.O = linearLayout;
            fx0Var2.show();
        }
    }

    public final void D1() {
        int i;
        int i2 = 0;
        if (this.actionBar.getOccupyStatusBar()) {
            i = gl.m;
        } else {
            i = 0;
        }
        this.b2 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i) - gl.L(21.0f));
        this.c2 = 1.38f;
        float f = 0.0f;
        this.d2 = 0.0f;
        V1();
        g3();
        O2(0, 1.0f, true);
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

    public final boolean D2(boolean[] zArr, boolean z, org.telegram.ui.ActionBar.d dVar, TLRPC.TL_error tL_error) {
        boolean z2;
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        na7.q1(this.currentAccount).W3.edit().putLong("dialog_join_requested_time_" + this.i1, System.currentTimeMillis()).commit();
        Activity parentActivity = getParentActivity();
        if (hc2.T(this.F2) && !this.F2.megagroup) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i = fu5.t1;
        fu5.E0(parentActivity, this, u21.b0(this), z2);
        if (!z || this.P4 != -1) {
            e4();
            ko8 ko8Var = this.d;
            if (ko8Var != null) {
                ko8Var.f();
            }
        }
        if (dVar instanceof mu1) {
            ((mu1) dVar).Lb(false, true);
        }
        return false;
    }

    public final void D3() {
        int i;
        int i2;
        Long l;
        if (this.T5 != null) {
            return;
        }
        kx9[] kx9VarArr = new kx9[1];
        Rect rect = gl.Q;
        zr1 zr1Var = this.f;
        if (zr1Var != null) {
            Drawable rightDrawable = zr1Var.getRightDrawable();
            zr1 zr1Var2 = this.f;
            if (rightDrawable == null) {
                rect.set(zr1Var2.getWidth() - 1, (this.f.getHeight() / 2) - 1, this.f.getWidth() + 1, (this.f.getHeight() / 2) + 1);
            } else {
                rect.set(zr1Var2.getRightDrawable().getBounds());
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
        int L = (-(this.Z.getHeight() - rect.centerY())) - gl.L(i3);
        Point point = gl.q;
        int min = (int) Math.min(gl.L(324.0f), point.x * 0.95f);
        int centerX = rect.centerX();
        int b = moe.b(centerX - (min / 2), 0, point.x - min);
        Activity parentActivity = getParentActivity();
        Integer valueOf = Integer.valueOf(Math.max(0, centerX - b));
        if (this.F2 == null) {
            i2 = 0;
        } else {
            i2 = 9;
        }
        en8 en8Var = new en8(this, this, parentActivity, valueOf, i2, this.A0, i3, kx9VarArr);
        TLRPC.User V1 = getMessagesController().V1(Long.valueOf(this.e1));
        if (V1 != null) {
            en8Var.setExpireDateHint(cf3.g(V1.emoji_status));
        }
        Long l2 = this.F;
        if (l2 != null) {
            en8Var.setSelected(l2);
        } else {
            tl tlVar = this.G;
            if (tlVar != null) {
                Drawable drawable = tlVar.f[0];
                if (drawable instanceof vl) {
                    l = Long.valueOf(((vl) drawable).h());
                    en8Var.setSelected(l);
                }
            }
            l = null;
            en8Var.setSelected(l);
        }
        en8Var.setSaveState(3);
        en8Var.y(this.G, this.f);
        fn8 fn8Var = new fn8(this, en8Var);
        this.T5 = fn8Var;
        kx9VarArr[0] = fn8Var;
        int[] iArr = new int[2];
        zr1 zr1Var3 = this.f;
        if (zr1Var3 != null) {
            zr1Var3.getLocationOnScreen(iArr);
        }
        kx9VarArr[0].showAsDropDown(this.fragmentView, b, L, 51);
        kx9VarArr[0].a();
    }

    public final void E2(TLRPC.User user, String str, boolean z, boolean z2) {
        wfb.c(getParentActivity(), this.currentAccount, a(), user, str, z, z2, this.A0);
    }

    public final void E3() {
        int i = 0;
        this.O.L0.setReordering(false);
        vn8 vn8Var = this.O;
        kda kdaVar = vn8Var.L0;
        if (vn8Var.y1 != null && kdaVar != null) {
            boolean m0 = vn8Var.m0();
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = kdaVar.getTabIds();
            int size = tabIds.size();
            while (i < size) {
                Integer num = tabIds.get(i);
                i++;
                TLRPC.ProfileTab Y = nfa.Y(num.intValue(), m0);
                if (Y != null) {
                    arrayList.add(Y);
                }
            }
        }
        this.O.N1(true);
        this.E5.animate().translationY(gl.L(69.0f)).setDuration(180L).setInterpolator(s33.h).withEndAction(new v36(this, (byte) 24)).start();
        u21.b0(this).Q(2131623990, 36, "Tab order changed.").j();
    }

    public final void F1() {
        s49 s49Var;
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
                    s49Var = null;
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
                    om8 om8Var = this.a;
                    View F = om8Var.F(view);
                    if (F != null) {
                        s49Var = om8Var.T(F);
                    }
                    s49Var = (y29) s49Var;
                }
                if (view == null) {
                    top = 0;
                } else {
                    top = view.getTop();
                }
                if (s49Var != null) {
                    i = s49Var.b();
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
                    a = moe.a((-top) / gl.L(12.0f), 0.0f, 1.0f);
                }
                if (this.R5 != a) {
                    this.R5 = a;
                    U3();
                }
                if (this.r0 == null && this.actionBar.o0) {
                    z = true;
                } else {
                    z = false;
                }
                int i4 = this.N4;
                if (i4 != -1 && !z) {
                    y29 y29Var = (y29) this.a.K(i4);
                    if (y29Var != null && y29Var.a.getTop() <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (this.X5 != z) {
                    this.X5 = z;
                    G1();
                    AnimatorSet animatorSet = this.U5;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = this.V5;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                    }
                    W3(true);
                    c4();
                    h4(false);
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
                        ofFloat.addUpdateListener(new zl8(this, (byte) 3));
                        arrayList.add(ofFloat);
                    }
                    I1();
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    this.U5 = animatorSet3;
                    animatorSet3.playTogether(arrayList);
                    this.U5.setInterpolator(s33.f);
                    this.U5.addListener(new bn8(this, (byte) 1));
                    this.U5.setDuration(150L);
                    this.U5.start();
                    kk7.e().k(kk7.t4, Boolean.TRUE);
                }
                float f2 = i2;
                if (this.Q1 != f2 && !this.H1) {
                    this.Q1 = f2;
                    this.d1.invalidate();
                    if (this.J1 != 0) {
                        if (this.Q1 > W1()) {
                            z2 = true;
                        }
                        this.M1 = z2;
                    }
                    N2(true);
                }
            }
        }
    }

    public final void F2() {
        na7.q1(this.currentAccount).h0(null);
        this.V.H(0);
        this.W.H(0);
    }

    public final void F3() {
        int v0;
        int v02;
        if (!this.q2) {
            zm8 zm8Var = this.r;
            if (zm8Var != null) {
                Object tag = zm8Var.getTag();
                boolean z = tag instanceof Integer;
                zm8 zm8Var2 = this.r;
                if (z) {
                    zm8Var2.setTextColor(z1(bkb.v0(((Integer) tag).intValue(), this.A0), Boolean.valueOf(this.K0[0])));
                } else {
                    zm8Var2.setTextColor(z1(bkb.v0(bkb.A8, this.A0), Boolean.TRUE));
                }
            }
            Drawable drawable = this.x;
            int i = -1;
            if (drawable != null) {
                if (this.n6 != null) {
                    v02 = -1;
                } else {
                    v02 = bkb.v0(bkb.fd, this.A0);
                }
                drawable.setColorFilter(v02, PorterDuff.Mode.MULTIPLY);
            }
            gq9 gq9Var = this.L;
            if (gq9Var != null) {
                gq9Var.b(bkb.v0(bkb.g8, this.A0));
            }
            zr1 zr1Var = this.f;
            if (zr1Var != null) {
                zr1Var.setTextColor(bkb.v0(bkb.li, this.A0));
            }
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            if (aVar != null) {
                if (this.n6 == null) {
                    i = bkb.v0(bkb.u8, this.A0);
                }
                aVar.H(i, false);
                org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
                if (this.n6 != null) {
                    v0 = 553648127;
                } else {
                    v0 = bkb.v0(bkb.e8, this.A0);
                }
                aVar2.G(v0, false);
            }
        }
        L3();
        l4();
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void G1() {
        int i;
        vn8 vn8Var = this.O;
        if (vn8Var != null) {
            if (!this.X5 && this.W5 <= 0.0f) {
                i = 0;
            } else {
                i = Integer.MAX_VALUE;
            }
            vn8Var.setPagesVisibleOverscanTop(i);
        }
    }

    public final void G2(TLRPC.User user) {
        int i;
        if (this.a4 >= 0) {
            if (this.N4 == -1) {
                e4();
                this.d.f();
            } else {
                Y3(false, false);
            }
        }
        if (this.N4 == -1) {
            if (!this.o2 && !gl.O1()) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
                if (this.actionBar.getOccupyStatusBar()) {
                    i = gl.m;
                } else {
                    i = 0;
                }
                int i2 = currentActionBarHeight + i;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.a.getMeasuredWidth(), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.a.getMeasuredHeight(), 0);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    ko8 ko8Var = this.d;
                    if (i3 >= ko8Var.e.O2) {
                        break;
                    }
                    s49 a = ko8Var.a(null, ko8Var.d(i3));
                    View view = a.a;
                    this.d.t(a, i3);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 += view.getMeasuredHeight();
                    i3++;
                }
                int max = Math.max(0, this.fragmentView.getMeasuredHeight() - ((c2() + i4) + i2));
                om8 om8Var = this.a;
                om8Var.setPadding(0, om8Var.getPaddingTop(), 0, max);
            } else {
                this.a.setPadding(0, c2(), 0, 0);
                this.k2.cancel();
                float[] fArr = this.n2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                n3(1.0f);
                this.Q1 = c2();
            }
        }
        this.M.m(user, 8, this.i1);
    }

    public final void G3() {
        int i;
        float f;
        oc6 oc6Var;
        if (this.a0 != null && this.r != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i = gl.m;
            } else {
                i = 0;
            }
            int i2 = currentActionBarHeight + i;
            pl8 pl8Var = this.a0;
            boolean z = this.G1;
            pl8Var.e = z;
            if (z && this.J1 == 2 && (oc6Var = this.Y) != null) {
                this.a0.f = this.Y.getY() + (this.Y.getScaleY() * oc6Var.getHeight());
                this.a0.setAlpha(this.T1);
                pl8 pl8Var2 = this.a0;
                pl8Var2.x = gl.L(74.0f);
                pl8Var2.setTranslationY(this.a.getMeasuredWidth());
                pl8Var2.invalidate();
            } else {
                pl8Var.f = -1.0f;
                float f2 = i2;
                float f3 = this.Q1 + f2;
                if (!this.L4 && !this.M4) {
                    f = 0.0f;
                } else {
                    f = 25.0f;
                }
                float L = f3 - gl.L(f);
                float min = Math.min(gl.L(74.0f), L - f2);
                pl8 pl8Var3 = this.a0;
                pl8Var3.x = min;
                pl8Var3.setTranslationY(L - min);
                pl8Var3.invalidate();
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

    @Override
    public final void H(float f) {
        u95 u95Var = this.h0;
        if (u95Var == null) {
            return;
        }
        u95Var.setProgress(f);
        this.o0.O(this.L2, f);
    }

    public final void H1() {
        float alpha;
        boolean z;
        byte b = this.J1;
        float f = 0.0f;
        boolean z2 = true;
        if (b == 1 && (!this.r5 || this.G1)) {
            this.x6 = 0.0f;
        } else if (b == 2 && (!this.r5 || this.G1)) {
            zm8 zm8Var = this.r;
            if (zm8Var == null) {
                alpha = 0.0f;
            } else {
                alpha = zm8Var.getAlpha();
            }
            this.x6 = alpha;
        } else {
            int i = (this.e1 > y6c.h(this.currentAccount).n ? 1 : (this.e1 == y6c.h(this.currentAccount).n ? 0 : -1));
            float f2 = this.l2;
            float f3 = this.t5;
            if (i == 0) {
                this.x6 = (1.0f - f3) * f2;
            } else {
                this.x6 = f2 * f3;
            }
        }
        if (this.e1 == y6c.h(this.currentAccount).n) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.v5) {
            this.u5 = gl.L(28.0f) * this.x6;
            zm8 zm8Var2 = this.r;
            if (zm8Var2 != null) {
                zm8Var2.setTranslationX(f2(this.B6, this.D6));
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
        uo8 uo8Var = this.F6;
        if (uo8Var != null) {
            uo8Var.e = 1.0f - f;
            uo8Var.invalidateSelf();
        }
        if (f <= 0.5f) {
            z2 = false;
        }
        this.A6 = z2;
        c4();
    }

    public final void H2(ValueAnimator valueAnimator, float f, boolean z) {
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
        N2(true);
        this.a.setAlpha(f2);
        this.b.setAlpha(1.0f - this.V1);
        this.b.setScaleX((this.V1 * 0.05f) + 1.0f);
        this.b.setScaleY((this.V1 * 0.05f) + 1.0f);
        this.P.setAlpha(1.0f - f2);
        this.Y.setAlpha(f2);
        this.f0.setAlpha(f2);
        an8 an8Var = this.v0;
        if (an8Var != null) {
            an8Var.setAlpha(f2);
        }
        this.f.setAlpha(f2);
        zm8 zm8Var = this.r;
        if (!this.X5) {
            f4 = f2;
        }
        zm8Var.setAlpha(f4);
        this.U0.getSearchField().setAlpha(f3);
        if (z && this.V1 < 0.7f) {
            xha xhaVar = this.U0;
            if (xhaVar.G.getWidth() != 0 && !xhaVar.e.isFocused()) {
                xhaVar.e.requestFocus();
                gl.E3(xhaVar.e);
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
        xha xhaVar2 = this.T0;
        if (xhaVar2 != null) {
            xhaVar2.setVisibility(i2);
            this.T0.setAlpha(f2);
        }
        this.U0.setVisibility(i2);
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (this.V1 >= 0.5f) {
            z2 = false;
        }
        aVar.B(z2);
        xha xhaVar3 = this.T0;
        if (xhaVar3 != null) {
            xhaVar3.setAlpha(f2);
        }
        this.U0.setAlpha(f2);
        this.d1.invalidate();
        this.fragmentView.invalidate();
    }

    public final void H3() {
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

    @Override
    public final void I() {
        j3(false);
    }

    public final void I1() {
        boolean z;
        hra hraVar = this.T;
        if (hraVar != null) {
            if (!this.X5 && this.d6) {
                z = true;
            } else {
                z = false;
            }
            hraVar.setVisibility(z);
        }
    }

    public final void I2() {
        n37.b(getParentActivity(), this.currentAccount, a(), true, null, new v36(this, (byte) 23), this.A0);
    }

    public final void I3() {
        float L;
        boolean z;
        if (this.y5 != null) {
            vn8 vn8Var = this.O;
            if (vn8Var != null && vn8Var.isAttachedToWindow()) {
                L = gl.L(232.0f) - (this.a.getMeasuredHeight() - this.O.getY());
            } else {
                L = gl.L(72.0f);
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
            this.y5.setTranslationY(gl.U1(f, gl.L(60.0f), 0));
            this.y5.setAlpha(f);
            FrameLayout frameLayout = this.y5;
            if (f <= 0.0f) {
                i = 4;
            }
            frameLayout.setVisibility(i);
            m21 m21Var = m21.w;
            if (m21Var != null) {
                m21Var.l();
            }
        }
    }

    public final void J1(int i) {
        boolean t0 = nfa.t0(this.O.getClosestTab());
        if (i == this.L6 && t0 == this.M6) {
            return;
        }
        this.L6 = i;
        this.M6 = t0;
        if (t0) {
            u41[] u41VarArr = this.C5;
            if (i > 0) {
                u41VarArr[0].i(k96.G(i, "HideStoriesFromAlbum", new Object[0]), true, true);
            } else {
                u41VarArr[0].i(this.B5, true, true);
            }
        } else if (i <= 0 && na7.q1(this.currentAccount).c5()) {
            this.C5[0].i(this.A5, true, true);
        } else {
            this.C5[0].i(k96.G(i, "ArchiveStories", new Object[0]), true, true);
        }
    }

    public final void J2(TLRPC.EmojiStatus emojiStatus, TLRPC.User user, zr1 zr1Var) {
        gl5 b;
        String str;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            d01.t(getParentActivity(), "https://" + getMessagesController().N2 + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        xh8 xh8Var = new xh8(this, this.currentAccount, user, null, null, this.A0);
        zr1Var.getLocationOnScreen(new int[2]);
        xh8Var.q2 = zr1Var.i0;
        xh8Var.r2 = zr1Var.j0;
        xh8Var.u2 = zr1Var.getScaleX();
        xh8Var.s2 = zr1Var.getLeft();
        xh8Var.t2 = zr1Var.getTop();
        xh8Var.v2 = zr1Var;
        Drawable rightDrawable = zr1Var.getRightDrawable();
        tl tlVar = this.G;
        if (rightDrawable == tlVar && tlVar != null) {
            Drawable drawable = tlVar.f[0];
            if (drawable instanceof vl) {
                xh8Var.u2 *= 0.98f;
                TLRPC.Document document = ((vl) drawable).e;
                if (document != null) {
                    be0 be0Var = new be0(getParentActivity());
                    kcb d = uo3.d(document.thumbs, bkb.l6, 0.2f, false);
                    TLRPC.PhotoSize w = ba4.w(document.thumbs, 90, false, null, false);
                    if ("video/webm".equals(document.mime_type)) {
                        b = gl5.b(document);
                        if (d != null) {
                            d.e = 512;
                            d.f = 512;
                        }
                        str = "160_160_g";
                    } else {
                        if (d != null && k27.K2(document, false)) {
                            d.e = 512;
                            d.f = 512;
                        }
                        b = gl5.b(document);
                        str = "160_160";
                    }
                    gl5 gl5Var = b;
                    String str2 = str;
                    be0Var.setLayerNum(7);
                    be0Var.setRoundRadius(gl.L(4.0f));
                    be0Var.j(gl5Var, str2, gl5.c(w, document), "140_140", d, document);
                    if (((vl) this.G.f[0]).c()) {
                        be0Var.setColorFilter(new PorterDuffColorFilter(bkb.v0(bkb.u6, this.A0), PorterDuff.Mode.SRC_IN));
                        xh8Var.x2 = k27.i1(document);
                    } else {
                        xh8Var.x2 = k27.i1(document);
                    }
                    xh8Var.w2 = be0Var;
                    xh8Var.z2 = true;
                }
            }
        }
        showDialog(xh8Var);
    }

    public final void J3() {
        boolean z;
        je5 je5Var = this.H6;
        if (je5Var != null) {
            float f = 0.0f;
            je5Var.o(0.0f, (this.f.getScaleX() * this.f.getRightDrawableX()) + this.f.getX() + (-je5Var.getPaddingLeft()));
            float S1 = gl.S1(this.m2, this.n2);
            je5 je5Var2 = this.H6;
            je5Var2.setTranslationY(((this.f.getY() + (-je5Var2.getPaddingBottom())) - gl.L(24.0f)) + gl.U1(S1, gl.L(6.0f), -gl.L(12.0f)));
            this.H6.i(bm2.f(S1, this.I6, 1342177280));
            if (this.Q1 >= gl.L(82.0f)) {
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
            ug8.t(animate.alpha(f), s33.g, 200L);
        }
    }

    public final void K1(boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.K1(boolean):void");
    }

    public final void K2(boolean z) {
        boolean z2;
        boolean c0 = hc2.c0(this.F2);
        TLRPC.Chat chat = this.F2;
        if (!c0 && !z && (chat == null || !chat.creator)) {
            z2 = false;
        } else {
            z2 = true;
        }
        ij.r(this, false, chat, null, false, z2, z, !c0, new ql8(this, (byte) 3));
    }

    public final void K3() {
        if (getParentActivity() != null && this.V0 != null) {
            if (getUserConfig().p()) {
                this.V0.setIcon(2131231866);
                return;
            }
            Drawable drawable = getParentActivity().getDrawable(2131231867);
            drawable.setColorFilter(new PorterDuffColorFilter(bkb.v0(bkb.E8, this.A0), PorterDuff.Mode.SRC_IN));
            this.W6 = drawable;
            Drawable drawable2 = getParentActivity().getDrawable(2131232174);
            drawable2.setColorFilter(new PorterDuffColorFilter(bm2.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            this.V0.setIcon(new m18(drawable, drawable2, gl.L(1.0f), -gl.L(1.0f)));
        }
    }

    public final void L1(Context context) {
        int i;
        this.a1 = new spc(context, this.T0.getPopupLayout().getSwipeBack(), new ln8(this, (byte) 0), false, 0, this.A0);
        if (this.i1 > 0 || this.e1 > 0) {
            int v0 = bkb.v0(bkb.m6, this.A0);
            spc spcVar = this.a1;
            l46 l46Var = (l46) spcVar.e;
            if (l46Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) k96.M0(2131753845, null));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) gl.K2(k96.M0(2131753844, null), v0, new oz(spcVar, (byte) 4)));
                l46Var.setText(spannableStringBuilder);
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
        rob a = rob.a(i);
        this.t0 = a;
        this.Z0 = this.T0.i(0, a, k96.M0(2131753843, null), (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.a1.b);
        this.T0.a(-1);
        H3();
    }

    public final void L3() {
        M3(this.m6);
    }

    public final void M1() {
        if (this.fragmentView != null && this.u6 && this.z2 != null && getParentActivity() != null) {
            bp8 bp8Var = this.G6;
            if (bp8Var != null) {
                bp8Var.b(this.z2);
                this.G6.invalidate();
                return;
            }
            bp8 bp8Var2 = new bp8(this, this.z2);
            this.G6 = bp8Var2;
            ((FrameLayout) this.fragmentView).addView(bp8Var2, nme.e(-1, -1, 55));
        }
    }

    public final boolean M2() {
        if (getMessagesController().M1().J(a()) && !this.q1) {
            return true;
        }
        return false;
    }

    public final void M3(float f) {
        int R0;
        da7 da7Var = this.n6;
        if (da7Var != null) {
            R0 = bm2.f(0.25f, da7Var.m(bkb.I.o()), -1);
        } else {
            R0 = gl.R0(this.W5, 1.0f, bkb.v0(bkb.pi, this.A0), bkb.v0(bkb.Ej, this.A0));
        }
        int f2 = bm2.f(f, R0, -1);
        int i = bkb.Ej;
        int f3 = bm2.f(Math.max(this.W5, this.G5), f2, bkb.v0(i, this.A0));
        tl tlVar = this.G;
        if (tlVar != null) {
            tlVar.k(Integer.valueOf(f3));
        }
        tl tlVar2 = this.H;
        if (tlVar2 != null) {
            tlVar2.k(Integer.valueOf(bm2.f(this.W5, bm2.f(f, R0, -1711276033), bkb.v0(i, this.A0))));
        }
        this.e0.setColor(f3);
        this.m6 = f;
    }

    public final void N1(Context context) {
        pha phaVar = this.simpleActionBar;
        if (phaVar != null) {
            gl.B2(phaVar);
        }
        kn8 kn8Var = new kn8(this, context, this.A0);
        this.simpleActionBar = kn8Var;
        kn8Var.setTitlesAlpha(0.0f);
        if (!this.r5 && !this.J0 && this.J1 != 0 && this.M1 && !this.N1) {
            this.simpleActionBar.setAlpha(0.0f);
        }
        this.simpleActionBar.setOccupyStatusBar(this.actionBar.getOccupyStatusBar());
        this.simpleActionBar.setMenuOverlayProvider(new wf0(this, (byte) 4));
        boolean z = this.J0;
        pha phaVar2 = this.simpleActionBar;
        if (z) {
            phaVar2.setBackButtonImage(2131232490);
            this.simpleActionBar.setBackButtonContentDescription(k96.M0(2131746307, null));
        } else {
            phaVar2.setBackButtonImage(2131231243);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new kk8(this, (byte) 2));
        if (!this.J0) {
            View backButton = this.simpleActionBar.getBackButton();
            backButton.setOnLongClickListener(new u0(this, backButton, (byte) 6));
        }
    }

    public final void N2(boolean z) {
        int i;
        int i2;
        float f;
        float f2;
        float f3;
        float S1;
        be0 currentItemView;
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
        zr1 zr1Var;
        int v0;
        float f12;
        int i6;
        boolean z2;
        TLRPC.ChatFull chatFull;
        int i7;
        this.glassEngine.g();
        if (this.actionBar.getOccupyStatusBar()) {
            i = gl.m;
        } else {
            i = 0;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i;
        float C1 = C1();
        R3();
        om8 om8Var = this.a;
        if (om8Var != null && !this.G1) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) om8Var.getLayoutParams();
            if (layoutParams2.topMargin != currentActionBarHeight) {
                layoutParams2.topMargin = currentActionBarHeight;
                this.a.setLayoutParams(layoutParams2);
            }
        }
        k4(z);
        if (this.Y != null) {
            this.a.setTopGlowOffset((int) this.Q1);
            om8 om8Var2 = this.a;
            if (this.Q1 > c2() && this.Q1 < (W1() + this.a.getMeasuredWidth()) - currentActionBarHeight) {
                i7 = 2;
            } else {
                i7 = 0;
            }
            om8Var2.setOverScrollMode(i7);
        }
        if (this.Y != null && !this.i6 && this.G1) {
            B1();
            return;
        }
        int c2 = c2();
        if (this.Y != null) {
            if (this.a0 != null && this.f1 != 0) {
                if (hc2.T(this.F2) && !this.F2.megagroup && (chatFull = this.v2) != null && chatFull.linked_chat_id != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.a0.o(2, z2);
            }
            k4(z);
            if (this.actionBar.getOccupyStatusBar()) {
                i2 = gl.m;
            } else {
                i2 = 0;
            }
            float translationY = this.actionBar.getTranslationY() + (de9.v(C1, 1.0f, org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f, i2) - gl.L(21.0f));
            if (!this.G1) {
                zq8 zq8Var = this.u0;
                if (zq8Var != null) {
                    f12 = -gl.L(29.0f);
                    vj7 vj7Var = zq8Var.n;
                    if (vj7Var != null && vj7Var.c) {
                        f12 = vj7Var.e.centerY();
                    }
                } else {
                    f12 = -gl.L(29.0f);
                }
                if (this.actionBar.getOccupyStatusBar()) {
                    i6 = gl.m;
                } else {
                    i6 = 0;
                }
                this.b2 = gl.R1(f12, this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i6) - gl.L(21.0f)), C1);
            } else {
                this.b2 = translationY;
            }
            if (this.G1) {
                f = this.S1;
            } else {
                f = this.Q1;
            }
            float f13 = c2;
            if (f <= f13 && !this.q2) {
                f2 = 2.0f;
                f3 = 18.0f;
            } else {
                f2 = 2.0f;
                float w = ls6.w(f - f13, (this.a.getMeasuredWidth() - currentActionBarHeight) - d2(), 1.0f, 0.0f);
                this.i2 = w;
                f3 = 18.0f;
                this.c2 = (gl.R1(2.2857144f, 3.2857144f, Math.min(1.0f, w * 3.0f)) / 100.0f) * 42.0f;
                this.d2 = 0.0f;
                an8 an8Var = this.v0;
                if (an8Var != null) {
                    an8Var.invalidate();
                }
                vq8 vq8Var = this.w0;
                if (vq8Var != null) {
                    vq8Var.invalidate();
                }
                float min = Math.min(gl.N(2000.0f), Math.max(gl.N(1100.0f), Math.abs(this.j2))) / gl.N(1100.0f);
                W1();
                boolean z3 = this.p2;
                int i8 = kk7.t4;
                float[] fArr = this.n2;
                if (z3 && (this.G0 || this.i2 >= 0.33f)) {
                    if (!this.q2) {
                        if (this.T0 != null) {
                            boolean p2 = p2();
                            xha xhaVar = this.T0;
                            if (!p2) {
                                xhaVar.S(21);
                            } else {
                                xhaVar.u(21);
                            }
                            if (this.r0 != null) {
                                this.T0.S(36);
                                this.T0.S(34);
                                this.T0.S(35);
                                this.T0.u(33);
                                this.T0.u(31);
                            }
                        }
                        xha xhaVar2 = this.U0;
                        if (xhaVar2 != null) {
                            xhaVar2.setEnabled(false);
                        }
                        this.q2 = true;
                        kk7.e().k(i8, Boolean.TRUE);
                        this.N.f(true, min);
                        this.p0.b(min);
                        this.o0.setCreateThumbFromParent(true);
                        this.o0.getAdapter().g();
                        this.k2.cancel();
                        fArr[0] = gl.S1(this.m2, fArr);
                        fArr[1] = 1.0f;
                        an8 an8Var2 = this.v0;
                        if (an8Var2 != null && !an8Var2.x.isEmpty()) {
                            this.k2.setInterpolator(new c84());
                            this.k2.setDuration((((1.0f - S12) * 1.3f) * 250.0f) / min);
                        } else {
                            this.k2.setInterpolator(s33.j);
                            this.k2.setDuration(((1.0f - S12) * 250.0f) / min);
                        }
                        this.k2.addListener(new bn8(this, (byte) 4));
                        View m = this.c.m(0);
                        if (!this.P1 && m != null) {
                            this.O1 = true;
                            int currentActionBarHeight2 = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
                            if (this.actionBar.getOccupyStatusBar()) {
                                i3 = gl.m;
                            } else {
                                i3 = 0;
                            }
                            this.a.y0(((m.getTop() - this.a.getMeasuredWidth()) - W1()) + currentActionBarHeight2 + i3, (int) this.k2.getDuration(), (Interpolator) this.k2.getInterpolator());
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
                            f4 = (-(1.0f - this.T1)) * gl.L(50.0f);
                        } else {
                            f4 = 0.0f;
                        }
                        this.f.setTranslationX(gl.N(18.0f) - this.f.getLeft());
                        this.f.setTranslationY((((f14 - W1()) - gl.N(30.0f)) - this.f.getBottom()) + f4);
                        this.r.setTranslationX(f2(gl.N(16.0f) - this.r.getLeft(), 0.0f));
                        this.r.setTranslationY(g2((((f14 - W1()) - gl.N(10.0f)) - this.r.getBottom()) + f4));
                        J3();
                    }
                } else {
                    if (this.q2) {
                        this.q2 = false;
                        kk7.e().k(i8, Boolean.TRUE);
                        xha xhaVar3 = this.T0;
                        if (xhaVar3 != null) {
                            xhaVar3.u(21);
                            if (this.r0 != null) {
                                this.T0.u(33);
                                this.T0.u(34);
                                this.T0.u(35);
                                this.T0.S(36);
                                this.T0.S(31);
                            }
                        }
                        xha xhaVar4 = this.U0;
                        if (xhaVar4 != null) {
                            xhaVar4.setEnabled(!this.z1);
                        }
                        this.N.f(false, min);
                        this.p0.b(min);
                        this.k2.cancel();
                        this.f0.getImageReceiver().u0 = true;
                        this.f0.getImageReceiver().w0(false);
                        fArr[0] = gl.S1(this.m2, fArr);
                        fArr[1] = 0.0f;
                        this.k2.setInterpolator(s33.j);
                        boolean z4 = this.o2;
                        ValueAnimator valueAnimator = this.k2;
                        if (!z4) {
                            valueAnimator.setDuration((S1 * 250.0f) / min);
                        } else {
                            valueAnimator.setDuration(0L);
                        }
                        this.d1.setBackgroundColor(bkb.v0(bkb.Z6, this.A0));
                        if (!this.I0 && (currentItemView = this.o0.getCurrentItemView()) != null) {
                            boolean z5 = currentItemView.getImageReceiver().t() instanceof i9c;
                            xm8 xm8Var = this.f0;
                            if (z5) {
                                xm8Var.b0 = false;
                            } else {
                                xm8Var.b0 = true;
                                xm8Var.setForegroundImageDrawable(currentItemView.getImageReceiver().u());
                            }
                        }
                        this.k2.addListener(new bn8(this, (byte) 5));
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
                    V1();
                    ValueAnimator valueAnimator2 = this.k2;
                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                        g3();
                        this.f.setTranslationY(this.f2);
                        this.r.setTranslationX(f2(this.g2, this.C6));
                        this.r.setTranslationY(g2(this.h2));
                        J3();
                    }
                }
            }
            boolean z6 = this.G1;
            if (z6 && this.J1 == 2) {
                float f15 = this.k6;
                if (this.actionBar.getOccupyStatusBar()) {
                    i5 = gl.m;
                } else {
                    i5 = 0;
                }
                float translationY2 = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / f2) + i5) - (gl.p * 21.0f));
                this.f.setPivotY(zr1Var.getMeasuredHeight());
                this.f.setScaleX(1.38f);
                this.f.setScaleY(1.38f);
                this.c2 = gl.U1(this.T1, 42, 138) / 100.0f;
                this.d2 = 0.0f;
                an8 an8Var3 = this.v0;
                if (an8Var3 != null) {
                    an8Var3.setExpandProgress(1.0f);
                }
                vq8 vq8Var2 = this.w0;
                if (vq8Var2 != null) {
                    vq8Var2.setExpandProgress(1.0f);
                }
                this.f0.setRoundRadiusForExpand((int) gl.R1(l2(), 0.0f, this.T1));
                this.Y.setTranslationX(gl.R1(f15, 0.0f, this.T1));
                this.Y.setTranslationY(gl.R1((float) Math.ceil(translationY2), 0.0f, this.T1));
                float measuredWidth = ((this.c2 * 100.0f) / 42.0f) * (this.Y.getMeasuredWidth() - gl.L(42.0f));
                this.i0.setTranslationX(this.Y.getX() + gl.L(16.0f) + measuredWidth);
                this.i0.setTranslationY(this.Y.getY() + gl.L(-10.0f) + measuredWidth);
                this.j0.setTranslationX(this.Y.getX() + gl.L(28.0f) + measuredWidth);
                this.j0.setTranslationY(this.Y.getY() + gl.L(26.5f) + measuredWidth);
                this.k0.setTranslationX(this.Y.getX() + gl.L(28.0f) + measuredWidth);
                this.k0.setTranslationY(this.Y.getY() + gl.L(24.0f) + measuredWidth);
                this.l0.setTranslationX(this.Y.getX() + gl.L(28.0f) + measuredWidth);
                this.l0.setTranslationY(this.Y.getY() + gl.L(24.0f) + measuredWidth);
                this.Y.setScaleX(this.c2);
                this.Y.setScaleY(this.c2);
                this.o0.setAlpha(0.0f);
                this.o0.setVisibility(0);
                xm8 xm8Var2 = this.f0;
                float f16 = this.T1;
                float f17 = this.c2;
                xm8Var2.I = f16;
                xm8Var2.J = f17;
                xm8Var2.H = true;
                this.N.e(false, f16);
                org.telegram.ui.ActionBar.a aVar = this.actionBar;
                int i11 = -1;
                if (this.n6 != null) {
                    v0 = -1;
                } else {
                    v0 = bkb.v0(bkb.u8, this.A0);
                }
                aVar.H(bm2.f(this.T1, v0, -1), false);
                gq9 gq9Var = this.L;
                if (gq9Var != null) {
                    gq9Var.b(bm2.f(this.T1, bkb.v0(bkb.g8, this.A0), -1275068417));
                }
                Drawable drawable = this.x;
                if (drawable != null) {
                    if (this.n6 == null) {
                        i11 = bm2.f(this.T1, bkb.v0(bkb.fd, this.A0), -1);
                    }
                    drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                }
                m33 m33Var = this.J;
                if (m33Var != null) {
                    m33Var.a(this.T1);
                    this.f.invalidate();
                }
                m33 m33Var2 = this.K;
                if (m33Var2 != null) {
                    m33Var2.a(this.T1);
                    this.f.invalidate();
                }
                M3(this.T1);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
                layoutParams4.width = (int) gl.R1(gl.N(100.0f), this.a.getMeasuredWidth() / this.c2, this.T1);
                layoutParams4.height = (int) gl.R1(gl.N(100.0f), (this.Q1 + currentActionBarHeight) / this.c2, this.T1);
                this.Y.requestLayout();
                J3();
            } else if (f <= f13) {
                if (z6) {
                    this.c2 = gl.U1(C1, 42, 96) / 100.0f;
                    this.d2 = 0.0f;
                    f6 = 1.0f;
                } else {
                    zq8 zq8Var2 = this.u0;
                    if (zq8Var2 != null) {
                        f5 = zq8Var2.getHiddenAvatarSizeDp();
                    } else {
                        f5 = 24.0f;
                    }
                    this.c2 = gl.R1(f5, 96.0f, C1) / 100.0f;
                    f6 = 1.0f;
                    this.d2 = 1.0f - C1;
                }
                pl8 pl8Var = this.a0;
                if (pl8Var != null) {
                    if (this.G1) {
                        pl8Var.setAlpha(this.T1);
                    } else {
                        pl8Var.setAlpha(f6);
                    }
                }
                an8 an8Var4 = this.v0;
                if (an8Var4 != null) {
                    an8Var4.invalidate();
                }
                vq8 vq8Var3 = this.w0;
                if (vq8Var3 != null) {
                    vq8Var3.h = this.G1;
                    float l = Utilities.l((C1 - 0.3f) / 0.7f);
                    if (vq8Var3.f != l) {
                        vq8Var3.f = l;
                        vq8Var3.invalidate();
                    }
                }
                if (this.G1) {
                    f7 = gl.R1(i2(0), 1.12f, C1);
                } else {
                    f7 = (0.12f * C1) + 1.0f;
                }
                ValueAnimator valueAnimator3 = this.k2;
                if (valueAnimator3 != null && valueAnimator3.isRunning()) {
                    ValueAnimator valueAnimator4 = this.k2;
                    bn8 bn8Var = this.e6;
                    valueAnimator4.removeListener(bn8Var);
                    this.k2.addListener(bn8Var);
                } else {
                    this.Y.setScaleX(this.c2);
                    this.Y.setScaleY(this.c2);
                    V1();
                    this.Y.setTranslationY((float) Math.ceil(this.b2));
                    float L = (((this.c2 * 100.0f) / 42.0f) * gl.L(42.0f)) - gl.L(42.0f);
                    this.i0.setTranslationX(this.Y.getX() + gl.L(16.0f) + L);
                    this.i0.setTranslationY(this.Y.getY() + gl.L(-10.0f) + L);
                    this.j0.setTranslationX(this.Y.getX() + gl.L(28.0f) + L);
                    this.j0.setTranslationY(this.Y.getY() + gl.L(26.5f) + L);
                    this.k0.setTranslationX(this.Y.getX() + gl.L(28.0f) + L);
                    this.k0.setTranslationY(this.Y.getY() + gl.L(24.0f) + L);
                    this.l0.setTranslationX(this.Y.getX() + gl.L(28.0f) + L);
                    this.l0.setTranslationY(this.Y.getY() + gl.L(24.0f) + L);
                }
                float floor = (float) Math.floor(translationY);
                float N = gl.N(8.0f) + (this.Y.getScaleY() * this.Y.getHeight());
                if (this.G1) {
                    f8 = this.T1;
                } else {
                    f8 = C1;
                }
                float f18 = (N * f8) + floor;
                this.f2 = tb4.A(1.0f, this.T1, 0.0f, (gl.L(7.0f) * C1) + gl.L(1.3f) + f18);
                this.h2 = (((float) Math.floor(gl.p * 11.0f)) * C1) + f18 + gl.L(24.0f);
                if (this.G1) {
                    f9 = (this.k6 - gl.L(109.0f)) + gl.L(48.0f);
                } else {
                    f9 = -gl.N(46.0f);
                }
                uo8 uo8Var = this.F6;
                if (uo8Var != null) {
                    uo8Var.setAlpha((int) (255.0f * C1));
                }
                int measuredWidth2 = this.a.getMeasuredWidth();
                this.f.setScaleX(f7);
                this.f.setScaleY(f7);
                if (this.G1) {
                    f10 = gl.R1(i2(1), 1.0f, C1);
                } else {
                    f10 = 1.0f;
                }
                this.r.setScaleX(f10);
                this.r.setScaleY(f10);
                O2(0, C1, false);
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
                    min2 = gl.R1(j2(f9, 0, this.f), min2, C1);
                    min3 = gl.R1(j2(f9, 1, this.r), min3, C1);
                }
                ValueAnimator valueAnimator5 = this.k2;
                if (valueAnimator5 == null || !valueAnimator5.isRunning()) {
                    this.f.setTranslationX(min2);
                    this.f.setTranslationY(this.f2);
                    this.r.setTranslationX(f2(min3, this.C6 * C1));
                    this.r.setTranslationY(g2(this.h2));
                }
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                int i12 = layoutParams6.width;
                if (gl.O1()) {
                    i4 = gl.L(490.0f);
                } else {
                    i4 = gl.q.x;
                }
                int min4 = Math.min(layoutParams6.width, (int) (((i4 - gl.L(f3)) / this.f.getScaleX()) - (this.f.getTranslationX() + layoutParams6.leftMargin)));
                layoutParams6.width = min4;
                if (min4 != i12) {
                    this.f.requestLayout();
                }
                J3();
            }
            ValueAnimator valueAnimator6 = this.k2;
            if (valueAnimator6 == null || !valueAnimator6.isRunning()) {
                O2(0, C1, true);
            }
        }
        P3(currentActionBarHeight);
        if (C1 >= 1.0f) {
            this.f0.setAlpha(1.0f);
        }
    }

    public final void N3() {
        this.e0.setScaleX(this.f.getScaleX());
        this.e0.setScaleY(this.f.getScaleY());
        this.e0.b((this.f.getScaleX() * this.f.getRightDrawableX()) + this.f.getX(), (this.f.getHeight() - (this.f.getScaleY() * (this.f.getHeight() - this.f.getRightDrawableY()))) + this.f.getY());
    }

    @Override
    public final void O(boolean z, boolean z2) {
        u95 u95Var = this.h0;
        if (u95Var == null) {
            return;
        }
        u95Var.setProgress(0.0f);
    }

    public final void O2(int r11, float r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.O2(int, float, boolean):void");
    }

    public final void O3() {
        if (!this.q1 && hc2.c0(this.F2)) {
            im7 notificationsController = getNotificationsController();
            notificationsController.getMessagesStorage().a.c(new de2(notificationsController, -this.f1, new km8(this, (byte) 0), (byte) 6));
        }
    }

    public final void P1(float f) {
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
        ofFloat.addUpdateListener(new zl8(this, (byte) 0));
        this.q6.playTogether(arrayList);
        AnimatorSet animatorSet2 = this.q6;
        if (z) {
            j = 150;
        } else {
            j = 220;
        }
        animatorSet2.setDuration(j);
        if (!z) {
            this.q6.addListener(new bn8(this, (byte) 6));
        }
        this.q6.start();
    }

    public final void P3(float f) {
        lo8 lo8Var;
        ValueAnimator valueAnimator;
        if (this.q2 || ((lo8Var = this.N) != null && (valueAnimator = lo8Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.N.getLayoutParams();
            layoutParams.width = this.a.getMeasuredWidth();
            layoutParams.height = (int) (this.Q1 + f);
            this.N.requestLayout();
        }
        wo8 wo8Var = this.d1;
        if (wo8Var != null) {
            wo8Var.F.setTranslate(0.0f, this.b2 - wo8Var.y);
            wo8 wo8Var2 = this.d1;
            RadialGradient radialGradient = wo8Var2.E;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(wo8Var2.F);
            }
            this.d1.invalidate();
        }
        N3();
        G3();
        Z3();
    }

    @Override
    public final void Q() {
        ffa ffaVar;
        vn8 vn8Var = this.O;
        if (vn8Var != null && (ffaVar = this.R) != null) {
            vn8Var.setNewMediaCounts(ffaVar.c);
        }
        if (this.d != null) {
            Y3(false, false);
        }
        V();
        if (this.w2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void Q1(int i, View view) {
        boolean z;
        cs5 I = cs5.I(this, view);
        I.X(this.a.V0(view, false));
        I.w = false;
        if (this.w2 != null) {
            z = true;
        } else {
            z = false;
        }
        I.k(2131232108, k96.M0(2131751755, null), new v36(this, (byte) 4), z);
        I.b(2131232121, k96.M0(2131751323, null), new v36(this, (byte) 5), false);
        I.b(2131232113, k96.M0(2131746128, null), new on7(this, i, (byte) 5), true);
        I.a0();
    }

    public final void Q2(boolean z) {
        boolean z2;
        TLRPC.User V1 = getMessagesController().V1(Long.valueOf(this.e1));
        if (V1 != null) {
            if (this.s2 && !na7.E2(V1)) {
                if (this.k1 && !z) {
                    getMessagesController().l5(new v36(this, (byte) 6), this.e1);
                    finishFragment();
                    return;
                }
                TLRPC.Chat chat = this.F2;
                if (this.E2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ij.r(this, false, chat, V1, z2, true, false, true, new ul8(this, V1));
            } else if (this.k1) {
                getMessagesController().l5(null, this.e1);
                if (u21.a(this)) {
                    u21.d(this, false).j();
                }
            } else if (this.l1) {
                ij.g0(this, this.e1, V1, null, this.E2, false, null, new re1(this, (byte) 5), this.A0);
            } else {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.A0, getParentActivity());
                String M0 = k96.M0(2131753689, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = gl.S2(k96.a0("AreYouSureBlockContact2", null, 2131754116, qu2.m(0, V1.first_name, V1.last_name)));
                alertDialog$Builder.j(k96.M0(2131753690, null), new ql8(this, (byte) 2));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                showDialog(hdVar);
                TextView textView = (TextView) hdVar.c(-1);
                if (textView != null) {
                    zkb.X(textView, bkb.p7, this.A0);
                }
            }
        }
    }

    public final void Q3() {
        float min = Math.min(this.d2, 0.25f) / 0.25f;
        boolean z = this.q1;
        zq8 zq8Var = this.u0;
        float f = 1.0f;
        if (z) {
            zq8Var.setAlpha(1.0f - min);
            this.u0.setBlurIntensity(0.0f);
            int i = 0;
            this.u0.setGooeyEnabled(false);
            zq8 zq8Var2 = this.u0;
            if (this.d2 >= 1.0f) {
                i = 8;
            }
            zq8Var2.setVisibility(i);
        } else {
            zq8Var.setHideProgress(this.d2);
        }
        an8 an8Var = this.v0;
        if (an8Var != null && this.J1 != 2) {
            float f2 = this.d2;
            if (f2 > 0.0f) {
                f = gl.R1(1.0f, 0.0f, gl.x1(f2, 0.0f, 0.5f));
            }
            an8Var.setAlpha(f);
        }
        S3();
    }

    public final boolean R1(final int i, View view) {
        TLRPC.User f;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        if (this.s1 && (f = getUserConfig().f()) != null) {
            final TLRPC.UserFull userFull = this.w2;
            if (userFull == null) {
                userFull = getMessagesController().W1(f.id);
            }
            if (userFull != null) {
                String M0 = k96.M0(2131751755, null);
                String M02 = k96.M0(2131743953, null);
                if (i != this.L3 && i != this.K3 && i != this.X2) {
                    if (i == this.P3) {
                        str = qq7.j0(this.currentAccount, f, userFull.business_work_hours);
                        M0 = k96.M0(2131746472, null);
                        M02 = k96.M0(2131752749, null);
                    } else if (i == this.Q3) {
                        str = userFull.business_location.address;
                        M0 = k96.M0(2131746467, null);
                        M02 = k96.M0(2131752681, null);
                    } else if (i == this.M3) {
                        str = l7c.p(f);
                        if (str != null) {
                            str = "@".concat(str);
                        }
                        M0 = k96.M0(2131746485, null);
                        M02 = k96.M0(2131743426, null);
                    } else if (i == this.H3) {
                        str = f.phone;
                        M02 = k96.M0(2131747102, null);
                    } else if (i == this.V2) {
                        str = UserInfoActivity.c0(this.w2.birthday);
                        M02 = k96.M0(2131753713, null);
                    } else {
                        str = null;
                    }
                } else {
                    str = userFull.about;
                    if (i == this.X2) {
                        M02 = k96.M0(2131753718, null);
                    }
                }
                cs5 I = cs5.I(this, view);
                I.X(this.a.V0(view, false));
                I.w = false;
                I.i = (byte) 3;
                if (i == this.Q3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        I.b(2131232425, k96.M0(2131746463, null), new v36(this, (byte) 7), false);
                    }
                    I.b(2131232218, k96.M0(2131746465, null), new v36(this, (byte) 9), false);
                }
                if (str != null) {
                    I.b(2131232108, M0, new pc7(this, str, M02, (byte) 28), false);
                }
                if (i == this.P3) {
                    I.b(2131232121, k96.M0(2131746471, null), new v36(this, (byte) 10), false);
                    I.b(2131232113, k96.M0(2131746470, null), new Runnable(this) {
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
                                    String M03 = k96.M0(2131752750, null);
                                    hd hdVar = alertDialog$Builder.a;
                                    hdVar.S = M03;
                                    hdVar.U = k96.M0(2131752751, null);
                                    alertDialog$Builder.j(k96.M0(2131746128, null), new ed() {
                                        @Override
                                        public final void u(hd hdVar2, int i3) {
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
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new em8(profileActivity2, (byte) 0));
                                                    profileActivity2.e4();
                                                    profileActivity2.d.r(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new em8(profileActivity2, (byte) 3));
                                                    profileActivity2.e4();
                                                    profileActivity2.d.r(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                    profileActivity.showDialog(hdVar);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = k96.M0(2131752682, null);
                                    hd hdVar2 = alertDialog$Builder2.a;
                                    hdVar2.S = M04;
                                    hdVar2.U = k96.M0(2131752683, null);
                                    alertDialog$Builder2.j(k96.M0(2131746128, null), new ed() {
                                        @Override
                                        public final void u(hd hdVar22, int i3) {
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
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new em8(profileActivity2, (byte) 0));
                                                    profileActivity2.e4();
                                                    profileActivity2.d.r(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new em8(profileActivity2, (byte) 3));
                                                    profileActivity2.e4();
                                                    profileActivity2.d.r(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                                    profileActivity.showDialog(hdVar2);
                                    return;
                            }
                        }
                    }, true);
                } else if (i == this.Q3) {
                    I.b(2131232121, k96.M0(2131746466, null), new v36(this, (byte) 11), false);
                    I.b(2131232113, k96.M0(2131746464, null), new Runnable(this) {
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
                                    String M03 = k96.M0(2131752750, null);
                                    hd hdVar = alertDialog$Builder.a;
                                    hdVar.S = M03;
                                    hdVar.U = k96.M0(2131752751, null);
                                    alertDialog$Builder.j(k96.M0(2131746128, null), new ed() {
                                        @Override
                                        public final void u(hd hdVar22, int i3) {
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
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new em8(profileActivity2, (byte) 0));
                                                    profileActivity2.e4();
                                                    profileActivity2.d.r(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new em8(profileActivity2, (byte) 3));
                                                    profileActivity2.e4();
                                                    profileActivity2.d.r(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                    profileActivity.showDialog(hdVar);
                                    return;
                                default:
                                    RectF rectF2 = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = k96.M0(2131752682, null);
                                    hd hdVar2 = alertDialog$Builder2.a;
                                    hdVar2.S = M04;
                                    hdVar2.U = k96.M0(2131752683, null);
                                    alertDialog$Builder2.j(k96.M0(2131746128, null), new ed() {
                                        @Override
                                        public final void u(hd hdVar22, int i3) {
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
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new em8(profileActivity2, (byte) 0));
                                                    profileActivity2.e4();
                                                    profileActivity2.d.r(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    return;
                                                default:
                                                    RectF rectF3 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new em8(profileActivity2, (byte) 3));
                                                    profileActivity2.e4();
                                                    profileActivity2.d.r(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                                    profileActivity.showDialog(hdVar2);
                                    return;
                            }
                        }
                    }, true);
                } else if (i == this.M3) {
                    I.b(2131232121, k96.M0(2131746427, null), new v36(this, (byte) 12), false);
                } else if (i != this.L3 && i != this.K3 && i != this.X2) {
                    if (i == this.H3) {
                        I.b(2131231898, k96.M0(2131746453, null), new v36(this, (byte) 14), false);
                    } else if (i == this.V2) {
                        I.b(2131232121, k96.M0(2131746532, null), new Runnable(this) {
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
                                        profileActivity.showDialog((fx0) ij.l(profileActivity.getParentActivity(), k96.M0(2131751226, null), k96.M0(2131751231, null), userFull2.birthday, new x15(profileActivity, userFull2, (byte) 19), new v36(profileActivity, (byte) 15), false, false, profileActivity.A0).a);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.Z6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M03 = k96.M0(2131753714, null);
                                        hd hdVar = alertDialog$Builder.a;
                                        hdVar.S = M03;
                                        hdVar.U = k96.M0(2131753715, null);
                                        alertDialog$Builder.j(k96.M0(2131746128, null), new ed() {
                                            @Override
                                            public final void u(hd hdVar2, int i2) {
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
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new em8(profileActivity2, (byte) 1));
                                                        profileActivity2.Y3(false, false);
                                                        profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.Z6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().h2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new em8(profileActivity2, (byte) 2));
                                                        profileActivity2.Y3(false, false);
                                                        profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                        profileActivity.showDialog(hdVar);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.Z6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M04 = k96.M0(2131746489, null);
                                        hd hdVar2 = alertDialog$Builder2.a;
                                        hdVar2.S = M04;
                                        hdVar2.U = k96.M0(2131746490, null);
                                        alertDialog$Builder2.j(k96.M0(2131746128, null), new ed() {
                                            @Override
                                            public final void u(hd hdVar22, int i2) {
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
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new em8(profileActivity2, (byte) 1));
                                                        profileActivity2.Y3(false, false);
                                                        profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.Z6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().h2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new em8(profileActivity2, (byte) 2));
                                                        profileActivity2.Y3(false, false);
                                                        profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                                        profileActivity.showDialog(hdVar2);
                                        return;
                                }
                            }
                        }, false);
                        I.b(2131232113, k96.M0(2131746128, null), new Runnable(this) {
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
                                        profileActivity.showDialog((fx0) ij.l(profileActivity.getParentActivity(), k96.M0(2131751226, null), k96.M0(2131751231, null), userFull2.birthday, new x15(profileActivity, userFull2, (byte) 19), new v36(profileActivity, (byte) 15), false, false, profileActivity.A0).a);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.Z6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M03 = k96.M0(2131753714, null);
                                        hd hdVar = alertDialog$Builder.a;
                                        hdVar.S = M03;
                                        hdVar.U = k96.M0(2131753715, null);
                                        alertDialog$Builder.j(k96.M0(2131746128, null), new ed() {
                                            @Override
                                            public final void u(hd hdVar22, int i2) {
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
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new em8(profileActivity2, (byte) 1));
                                                        profileActivity2.Y3(false, false);
                                                        profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.Z6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().h2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new em8(profileActivity2, (byte) 2));
                                                        profileActivity2.Y3(false, false);
                                                        profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                        profileActivity.showDialog(hdVar);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.Z6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M04 = k96.M0(2131746489, null);
                                        hd hdVar2 = alertDialog$Builder2.a;
                                        hdVar2.S = M04;
                                        hdVar2.U = k96.M0(2131746490, null);
                                        alertDialog$Builder2.j(k96.M0(2131746128, null), new ed() {
                                            @Override
                                            public final void u(hd hdVar22, int i2) {
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
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new em8(profileActivity2, (byte) 1));
                                                        profileActivity2.Y3(false, false);
                                                        profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.Z6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().h2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new em8(profileActivity2, (byte) 2));
                                                        profileActivity2.Y3(false, false);
                                                        profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                                        profileActivity.showDialog(hdVar2);
                                        return;
                                }
                            }
                        }, true);
                    } else if (i == this.R2) {
                        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(userFull.personal_channel_id));
                        if (K0 != null && hc2.K(K0, false) != null) {
                            I.b(2131232108, k96.M0(2131746488, null), new ll8(this, K0, (byte) 3), false);
                        }
                        I.b(2131232121, k96.M0(2131746491, null), new v36(this, (byte) 8), false);
                        I.b(2131232113, k96.M0(2131746128, null), new Runnable(this) {
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
                                        profileActivity.showDialog((fx0) ij.l(profileActivity.getParentActivity(), k96.M0(2131751226, null), k96.M0(2131751231, null), userFull2.birthday, new x15(profileActivity, userFull2, (byte) 19), new v36(profileActivity, (byte) 15), false, false, profileActivity.A0).a);
                                        return;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.Z6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M03 = k96.M0(2131753714, null);
                                        hd hdVar = alertDialog$Builder.a;
                                        hdVar.S = M03;
                                        hdVar.U = k96.M0(2131753715, null);
                                        alertDialog$Builder.j(k96.M0(2131746128, null), new ed() {
                                            @Override
                                            public final void u(hd hdVar22, int i2) {
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
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new em8(profileActivity2, (byte) 1));
                                                        profileActivity2.Y3(false, false);
                                                        profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.Z6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().h2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new em8(profileActivity2, (byte) 2));
                                                        profileActivity2.Y3(false, false);
                                                        profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                        profileActivity.showDialog(hdVar);
                                        return;
                                    default:
                                        RectF rectF3 = ProfileActivity.Z6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M04 = k96.M0(2131746489, null);
                                        hd hdVar2 = alertDialog$Builder2.a;
                                        hdVar2.S = M04;
                                        hdVar2.U = k96.M0(2131746490, null);
                                        alertDialog$Builder2.j(k96.M0(2131746128, null), new ed() {
                                            @Override
                                            public final void u(hd hdVar22, int i2) {
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
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new em8(profileActivity2, (byte) 1));
                                                        profileActivity2.Y3(false, false);
                                                        profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                        return;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.Z6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().h2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new em8(profileActivity2, (byte) 2));
                                                        profileActivity2.Y3(false, false);
                                                        profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                                        profileActivity.showDialog(hdVar2);
                                        return;
                                }
                            }
                        }, true);
                    }
                } else {
                    I.b(2131232121, k96.M0(2131746484, null), new v36(this, (byte) 13), false);
                }
                if (I.y() > 0) {
                    I.a0();
                    return true;
                }
            }
        }
        return false;
    }

    public final void R2(boolean z) {
        boolean z2 = false;
        if (this.e1 != 0) {
            TLRPC.User V1 = getMessagesController().V1(Long.valueOf(this.e1));
            if (V1 != null) {
                TLRPC.UserFull userFull = this.w2;
                if (userFull != null && userFull.video_calls_available) {
                    z2 = true;
                }
                rgc.m(V1, z, z2, getParentActivity(), this.w2, getAccountInstance());
            }
        } else if (this.f1 != 0) {
            fc2 e1 = getMessagesController().e1(this.f1, false, null);
            TLRPC.Chat chat = this.F2;
            if (e1 == null) {
                j5 accountInstance = getAccountInstance();
                if (getParentActivity() != null) {
                    xt5.D0(getParentActivity(), -chat.id, accountInstance, new io9(chat, this, accountInstance, (byte) 11));
                    return;
                }
                return;
            }
            rgc.l(chat, null, false, null, getParentActivity(), this, getAccountInstance());
        }
    }

    public final void R3() {
        if (this.simpleActionBar != null) {
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            if (aVar != null && aVar.getVisibility() != 4) {
                this.actionBar.setVisibility(4);
            }
            float C1 = 1.0f - ((1.0f - C1()) * this.simpleActionBar.getActionModeFactor());
            st stVar = this.Z;
            if (stVar != null && this.R1 != C1) {
                this.R1 = C1;
                stVar.invalidate();
            }
        }
    }

    public final boolean S1() {
        s49 s49Var;
        View view;
        if ((this.J0 || (!gl.O1() && !this.o2)) && this.f0.getImageReceiver().E() && !gl.A1()) {
            this.G0 = true;
            this.p2 = true;
            int i = 0;
            while (true) {
                s49Var = null;
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
                om8 om8Var = this.a;
                View F = om8Var.F(view);
                if (F != null) {
                    s49Var = om8Var.T(F);
                }
                if (s49Var != null) {
                    Integer num = (Integer) this.Z1.get(Integer.valueOf(s49Var.b()));
                    if (num != null) {
                        this.P1 = true;
                        this.a.x0(0, -(((this.a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), s33.h);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void S2() {
        TLRPC.UserFull userFull = this.w2;
        if (userFull != null && l7c.c(userFull)) {
            org.telegram.ui.ActionBar.d S = LaunchActivity.S();
            if (S != null) {
                b00.u(k96.a0(null, null, 2131743503, cf3.s(a())), u21.b0(S), 2131624012, 36);
                return;
            }
            return;
        }
        if (this.F2 != null) {
            le5.h.a();
        }
        showDialog(new tv4(getParentActivity(), this.currentAccount, a(), null, null));
    }

    public final void S3() {
        boolean z;
        boolean z2;
        boolean z3;
        float a;
        float f = 0.0f;
        if (!this.q1 && !this.G1) {
            int W1 = W1();
            if (W1 > 0) {
                a = moe.a(1.0f - (this.Q1 / W1), 0.0f, 1.0f);
            } else {
                a = moe.a((this.d2 - 0.6f) / 0.4f, 0.0f, 1.0f);
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
            zr1 zr1Var = this.f;
            if (zr1Var != null) {
                zr1Var.setTextColor(this.J5);
            }
            zm8 zm8Var = this.r;
            if (zm8Var != null) {
                zm8Var.setTextColor(this.K5);
            }
            L3();
            if (z3) {
                kk7.e().k(kk7.t4, Boolean.TRUE);
            }
            wo8 wo8Var = this.d1;
            if (wo8Var != null) {
                wo8Var.invalidate();
            }
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        V3();
        U3();
    }

    public final void T1() {
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

    public final void T2(boolean z) {
        boolean[] zArr = {true};
        getMessagesController().j(this.F2.id, getUserConfig().f(), 0, null, this, true, new vj6(this, z, zArr, (byte) 16), new wf(this, zArr, z, this.parentLayout.getLastFragment(), (byte) 5), null);
        kk7.e().k(kk7.K4, new Object[0]);
    }

    public final void T3() {
        vn8 vn8Var = this.O;
        if (vn8Var != null && this.b6 != 0) {
            int topPanelShift = vn8Var.getTopPanelShift();
            int i = 0;
            if (topPanelShift > 0 && this.O.isAttachedToWindow()) {
                if (this.O.getParent() == this.a) {
                    topPanelShift = Math.max(0, topPanelShift - Math.max(0, (int) this.O.getY()));
                }
                i = topPanelShift;
            }
            int i2 = this.b6 + i;
            t3(i2, this.H5);
            t3(i2, this.Z5);
        }
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        gl.c3(new ph1(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, (byte) 5));
    }

    public final boolean U1() {
        ui5 ui5Var;
        if (this.J1 != 0 && (ui5Var = this.parentLayout) != null && ui5Var.getFragmentStack() != null && this.parentLayout.getFragmentStack().size() >= 2 && (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof mu1)) {
            finishFragment();
            return true;
        }
        return false;
    }

    public final void U2(android.view.View r17, float r18, float r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.U2(android.view.View, float, float, boolean):void");
    }

    public final void U3() {
        boolean z;
        float f;
        if (this.H5 != null && this.Z5 != null) {
            vn8 vn8Var = this.O;
            int i = 0;
            if (vn8Var != null && vn8Var.getParent() == this.a && this.O.isAttachedToWindow()) {
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

    @Override
    public final void V() {
        int i;
        String str;
        int size;
        int i2;
        vn8 vn8Var = this.O;
        if (vn8Var != null && this.r != null) {
            int closestTab = vn8Var.getClosestTab();
            int[] iArr = this.R.c;
            int i3 = 0;
            if (closestTab == 0) {
                if (iArr[7] <= 0 && iArr[6] <= 0) {
                    int i4 = iArr[0];
                    if (i4 <= 0) {
                        w3(k96.M0(2131745217, null));
                    } else {
                        w3(k96.G(i4, "Media", new Object[0]));
                    }
                } else if (this.O.getPhotosVideosTypeFilter() != 1 && iArr[7] > 0) {
                    if (this.O.getPhotosVideosTypeFilter() != 2 && (i2 = iArr[6]) > 0) {
                        w3(k96.G(i2, "Photos", new Object[0]) + ", " + k96.G(iArr[7], "Videos", new Object[0]));
                        return;
                    }
                    w3(k96.G(iArr[7], "Videos", new Object[0]));
                } else {
                    w3(k96.G(iArr[6], "Photos", new Object[0]));
                }
            } else if (closestTab == 1) {
                int i5 = iArr[1];
                if (i5 <= 0) {
                    w3(k96.M0(2131750814, null));
                } else {
                    w3(k96.G(i5, "Files", new Object[0]));
                }
            } else if (closestTab == 2) {
                int i6 = iArr[2];
                if (i6 <= 0) {
                    w3(k96.M0(2131743281, null));
                } else {
                    w3(k96.G(i6, "Voice", new Object[0]));
                }
            } else if (closestTab == 3) {
                int i7 = iArr[3];
                if (i7 <= 0) {
                    w3(k96.M0(2131745219, null));
                } else {
                    w3(k96.G(i7, "Links", new Object[0]));
                }
            } else if (closestTab == 4) {
                int i8 = iArr[4];
                if (i8 <= 0) {
                    w3(k96.M0(2131748127, null));
                } else {
                    w3(k96.G(i8, "MusicFiles", new Object[0]));
                }
            } else if (closestTab == 5) {
                int i9 = iArr[5];
                if (i9 <= 0) {
                    w3(k96.M0(2131754879, null));
                } else {
                    w3(k96.G(i9, "GIFs", new Object[0]));
                }
            } else if (closestTab == 6) {
                w3(k96.G(this.w2.common_chats_count, "CommonGroups", new Object[0]));
            } else if (closestTab == 7) {
                w3(this.r.getText());
            } else if (closestTab != 8 && !nfa.t0(closestTab)) {
                if (closestTab == 13) {
                    w3(this.O.O(true));
                } else if (closestTab == 9) {
                    w3(k96.G(this.O.W(closestTab), "ProfileStoriesArchiveCount", new Object[0]));
                } else if (closestTab == 10) {
                    p97 J0 = na7.q1(this.currentAccount).J0(a());
                    if (this.s2) {
                        str = "Bots";
                    } else {
                        str = "Channels";
                    }
                    if (J0 == null) {
                        size = 0;
                    } else {
                        size = J0.b.size() + J0.c;
                    }
                    w3(k96.G(size, str, new Object[0]));
                } else if (closestTab == 12) {
                    vp9 D1 = getMessagesController().D1();
                    long a = a();
                    ArrayList arrayList = D1.j;
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            up9 up9Var = (up9) arrayList.get(i10);
                            if (up9Var.a == a) {
                                i = up9Var.e;
                                break;
                            }
                            i10++;
                        } else {
                            i = 0;
                            break;
                        }
                    }
                    w3(k96.G(Math.max(1, i), "SavedMessagesCount", new Object[0]));
                } else if (closestTab == 14) {
                    lca lcaVar = this.O.b0;
                    if (lcaVar != null) {
                        i3 = lcaVar.getGiftsCount();
                    }
                    w3(k96.H(',', "ProfileGiftsCount", i3));
                } else if (closestTab == 15) {
                    int i11 = iArr[8];
                    if (i11 <= 0) {
                        w3(k96.M0(2131745211, null));
                    } else {
                        w3(k96.H(',', "ProfilePollsCount", i11));
                    }
                }
            } else {
                boolean z = this.s2;
                vn8 vn8Var2 = this.O;
                if (z) {
                    w3(vn8Var2.O(false));
                } else if (vn8Var2.W(closestTab) > 0) {
                    w3(k96.G(this.O.W(closestTab), "ProfileStoriesCount", new Object[0]));
                } else {
                    w3(k96.M0(2131746432, null));
                }
            }
        }
    }

    public final void V1() {
        if (this.a == null) {
            return;
        }
        float v = oo1.v(((FrameLayout.LayoutParams) this.Y.getLayoutParams()).width, this.c2, 0.5f, this.a.getMeasuredWidth() / 2.0f);
        this.a2 = v;
        if (this.G1) {
            v = gl.R1(this.k6, v, this.T1);
            this.a2 = v;
        }
        this.Y.setTranslationX(v);
    }

    public final void V2() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.e1 != 0) {
                TLRPC.User V1 = getMessagesController().V1(Long.valueOf(this.e1));
                if (V1 != null) {
                    if (this.G2 != null && (userFull = this.w2) != null && !TextUtils.isEmpty(userFull.about)) {
                        str = String.format("%s https://" + getMessagesController().N2 + "/%s", this.w2.about, l7c.p(V1));
                    } else {
                        str = String.format("https://" + getMessagesController().N2 + "/%s", l7c.p(V1));
                    }
                } else {
                    return;
                }
            } else if (this.f1 != 0) {
                TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(this.f1));
                if (K0 != null) {
                    TLRPC.ChatFull chatFull = this.v2;
                    if (chatFull != null && !TextUtils.isEmpty(chatFull.about)) {
                        str = String.format("%s\nhttps://" + getMessagesController().N2 + "/%s", this.v2.about, hc2.K(K0, false));
                    } else {
                        str = String.format("https://" + getMessagesController().N2 + "/%s", hc2.K(K0, false));
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
            startActivityForResult(Intent.createChooser(intent, k96.M0(2131752970, null)), 500);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void V3() {
        if (this.simpleActionBar != null && this.M5 != null) {
            ep8 ep8Var = this.O5;
            if (ep8Var != null) {
                float e2 = e2();
                if (ep8Var.l != e2) {
                    ep8Var.l = e2;
                    ep8Var.a();
                }
            }
            int f = bm2.f(e2(), this.I5, bkb.v0(bkb.F6, this.A0));
            if (this.L5 != f) {
                this.L5 = f;
                pha phaVar = this.simpleActionBar;
                phaVar.m0 = true;
                phaVar.g0 = f;
                phaVar.updateColors();
            }
            int t1 = this.N5.t1();
            if (this.Q5 != t1) {
                this.Q5 = t1;
                pha phaVar2 = this.simpleActionBar;
                il0 il0Var = phaVar2.I;
                if (il0Var != null) {
                    il0Var.updateColors();
                    phaVar2.J.updateColors();
                    phaVar2.K.updateColors();
                }
                phaVar2.invalidate();
                zha zhaVar = phaVar2.R;
                if (zhaVar != null) {
                    zhaVar.invalidate();
                }
            }
        }
    }

    public final int W1() {
        int i = 0;
        if (this.e1 != 0 && this.r0 != null && !this.s1) {
            return 0;
        }
        return gl.L(74 + ((this.L4 || this.M4) ? 25 : 25));
    }

    public final void W2(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.M3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f1);
            bundle.putLong("user_id", this.e1);
            presentFragment(new gw8(bundle));
        } else if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.V2) {
            if (this.e1 == getUserConfig().e()) {
                presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
            } else if (l7c.c(this.w2)) {
                b00.u(k96.a0(null, null, 2131743503, cf3.s(this.e1)), u21.b0(this), 2131624012, 36);
            } else {
                showDialog(new tv4(getParentActivity(), this.currentAccount, this.e1, null, null));
            }
        }
    }

    public final void W3(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        vn8 vn8Var;
        if (this.T0 != null) {
            boolean z8 = false;
            if (!this.X5 && ((vn8Var = this.O) == null || !vn8Var.o0())) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z9 = this.q2;
            xha xhaVar = this.Q0;
            if (z2 && !z9 && this.M0) {
                z3 = true;
            } else {
                z3 = false;
            }
            u3(xhaVar, z3, z);
            xha xhaVar2 = this.R0;
            if (z2 && !z9 && this.N0) {
                z4 = true;
            } else {
                z4 = false;
            }
            u3(xhaVar2, z4, z);
            xha xhaVar3 = this.S0;
            if (z2 && this.O0) {
                z5 = true;
            } else {
                z5 = false;
            }
            u3(xhaVar3, z5, z);
            vn8 vn8Var2 = this.O;
            if (vn8Var2 != null && vn8Var2.J != null && vn8Var2.f0(vn8Var2.getClosestTab()) && !this.O.o0()) {
                z6 = true;
            } else {
                z6 = false;
            }
            xha xhaVar4 = this.T0;
            if (z && !z6) {
                z7 = true;
            } else {
                z7 = false;
            }
            u3(xhaVar4, z2, z7);
            vn8 vn8Var3 = this.O;
            if (vn8Var3 != null) {
                boolean z10 = this.X5;
                if (z && !z6) {
                    z8 = true;
                }
                if (vn8Var3.q2 != z10) {
                    vn8Var3.q2 = z10;
                    vn8Var3.B(z, z8);
                }
            }
        }
    }

    @Override
    public final boolean X() {
        return this.A1;
    }

    public final int X1(ImageReceiver imageReceiver) {
        if (imageReceiver.t() instanceof i9c) {
            return ((i9c) imageReceiver.t()).a.a();
        }
        return gl.p(this.f0.getImageReceiver().n());
    }

    public final void X2() {
        boolean z;
        oy8 oy8Var;
        if (this.e1 != 0) {
            if (this.r0 != null) {
                TLRPC.User V1 = na7.q1(this.currentAccount).V1(Long.valueOf(y6c.h(this.currentAccount).e()));
                if (V1 == null) {
                    V1 = y6c.h(this.currentAccount).f();
                }
                if (V1 != null) {
                    wl5 wl5Var = this.r0;
                    TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    wl5Var.n(z, new v36(this, (byte) 27), new ph8(this, (byte) 2), 0);
                    this.V.H(0);
                    this.V.K(43);
                    this.W.H(0);
                    this.W.K(43);
                    pl8 pl8Var = this.a0;
                    if (pl8Var != null) {
                        ml8 i = pl8.i(14, pl8Var.a);
                        if (i != null && (oy8Var = i.k) != null) {
                            oy8Var.start();
                        }
                    } else {
                        this.s.d();
                    }
                    wgb wgbVar = this.N2;
                    if (wgbVar != null) {
                        wgbVar.getImageView().d();
                        return;
                    }
                    return;
                }
                return;
            }
            a3();
            return;
        }
        b3();
    }

    public final void X3() {
        TLRPC.User V1;
        boolean z;
        int i;
        int i2;
        if (this.s1 && this.X0 != null && this.W0 != null && (V1 = getMessagesController().V1(Long.valueOf(this.e1))) != null) {
            int i3 = 0;
            if (l7c.p(V1) != null) {
                z = true;
            } else {
                z = false;
            }
            a8 a8Var = this.X0;
            if (z) {
                i = 2131231913;
            } else {
                i = 2131231914;
            }
            a8Var.setIcon(i);
            a8 a8Var2 = this.X0;
            if (z) {
                i2 = 2131746427;
            } else {
                i2 = 2131746426;
            }
            a8Var2.setText(k96.M0(i2, null));
            a8 a8Var3 = this.W0;
            if (l7c.p(V1) == null) {
                i3 = 8;
            }
            a8Var3.setVisibility(i3);
        }
    }

    public final tl Y1(long j) {
        if (this.H == null) {
            tl tlVar = new tl(gl.L(17.0f), 2, this.f, false);
            this.H = tlVar;
            int L = gl.L(1.0f);
            tlVar.J = 0;
            tlVar.K = L;
            if (this.H0) {
                this.H.a();
            }
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        tl tlVar2 = this.H;
        if (i != 0) {
            tlVar2.j(j, false);
        } else {
            tlVar2.g(null, false);
        }
        L3();
        return this.H;
    }

    public final void Y2() {
        Bundle l = ir2.l("addToGroup", true);
        l.putLong("chatId", this.F2.id);
        qa5 qa5Var = new qa5(l);
        TLRPC.ChatFull chatFull = this.v2;
        qa5Var.J = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            vf6 vf6Var = new vf6();
            for (int i = 0; i < this.v2.participants.participants.size(); i++) {
                vf6Var.k(null, this.v2.participants.participants.get(i).user_id);
            }
            qa5Var.K = vf6Var;
        }
        qa5Var.y = new ql8(this, (byte) 0);
        presentFragment(qa5Var);
    }

    public final void Y3(boolean z, boolean z2) {
        if (this.d == null) {
            if (z) {
                b4(false);
            }
            e4();
        } else if (!z2 && this.a.isInLayout()) {
            om8 om8Var = this.a;
            if (!om8Var.H) {
                return;
            }
            om8Var.post(new k08((byte) 2, this, z));
        } else {
            xn8 xn8Var = new xn8(this);
            xn8Var.a = this.O2;
            xn8Var.e(xn8Var.b);
            ArrayList arrayList = xn8Var.d;
            arrayList.clear();
            ArrayList arrayList2 = xn8Var.e;
            arrayList2.clear();
            arrayList.addAll(this.U4);
            arrayList2.addAll(this.V4);
            xn8Var.f = this.x4;
            xn8Var.g = this.y4;
            if (z) {
                b4(false);
            }
            i3();
            e4();
            xn8Var.e(xn8Var.c);
            try {
                vu7.a(xn8Var, true).c(this.d);
            } catch (Exception e) {
                fa4.g(e, true);
                this.d.f();
            }
            int i = this.r6;
            if (i >= 0) {
                this.c.g1(i, this.s6 - this.a.getPaddingTop());
            }
            gl.V3(this.a);
        }
    }

    public final void Z1(boolean z) {
        vf6 vf6Var;
        final int i;
        if (!this.B1 && (vf6Var = this.C1) != null && this.v2 != null) {
            this.B1 = true;
            int i2 = 0;
            if (vf6Var.m() != 0 && z) {
                i = 300;
            } else {
                i = 0;
            }
            final TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = getMessagesController().f1(this.f1);
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
                    gl.d3(new yl8(ProfileActivity.this, tL_error, tLObject, tL_channels_getParticipants, (byte) 0), i);
                }
            }), this.classGuid);
        }
    }

    public final void Z2(boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.Z2(boolean):void");
    }

    public final void Z3() {
        int i;
        if (this.c0 != null && this.r != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i = gl.m;
            } else {
                i = 0;
            }
            int i2 = currentActionBarHeight + i;
            boolean z = this.G1;
            if (z && this.J1 == 2 && this.Y != null) {
                this.c0.setAlpha(this.T1);
                this.c0.f(gl.L(74.0f) + this.a.getMeasuredWidth(), W1() - gl.L(74.0f));
                return;
            }
            if (z) {
                this.c0.setAlpha(this.T1);
            }
            float f = i2;
            float L = this.Q1 + f + gl.L(74.0f);
            float min = Math.min(W1(), L - f);
            this.c0.f(L - min, min - gl.L(74.0f));
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

    public final tl a2(TLRPC.EmojiStatus emojiStatus, boolean z) {
        if (this.G == null) {
            tl tlVar = new tl(gl.L(24.0f), 2, this.f, false);
            this.G = tlVar;
            if (this.H0) {
                tlVar.a();
            }
        }
        if (this.G.d()) {
            z = false;
        }
        this.F = null;
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((tL_emojiStatus.flags & 1) != 0 && tL_emojiStatus.until <= ((int) (System.currentTimeMillis() / 1000))) {
                this.G.g(h2(), z);
                this.G.m(false, z);
            } else {
                this.G.j(tL_emojiStatus.document_id, z);
                this.G.m(false, z);
            }
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) != 0 && tL_emojiStatusCollectible.until <= ((int) (System.currentTimeMillis() / 1000))) {
                this.G.g(h2(), z);
                this.G.m(false, z);
            } else {
                this.F = Long.valueOf(tL_emojiStatusCollectible.collectible_id);
                this.G.j(tL_emojiStatusCollectible.document_id, z);
                this.G.m(true, z);
            }
        } else {
            this.G.g(h2(), z);
            this.G.m(false, z);
        }
        L3();
        return this.G;
    }

    public final void a3() {
        TLRPC.User V1;
        if (this.e1 != 0 && !U1() && (V1 = getMessagesController().V1(Long.valueOf(this.e1))) != null && !(V1 instanceof TLRPC.TL_userEmpty)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.e1);
            if (getMessagesController().A(bundle, this, null, null)) {
                boolean z = this.arguments.getBoolean("removeFragmentOnChatOpen", true);
                if (!gl.O1() && z) {
                    kk7 notificationCenter = getNotificationCenter();
                    int i = kk7.s;
                    notificationCenter.n(this, i);
                    getNotificationCenter().k(i, new Object[0]);
                }
                int i2 = getArguments().getInt("nearby_distance", -1);
                if (i2 >= 0) {
                    bundle.putInt("nearby_distance", i2);
                }
                mu1 mu1Var = new mu1(bundle);
                hq6 mediaDataController = getMediaDataController();
                TLRPC.Document document = mediaDataController.z0;
                mediaDataController.o1();
                mu1Var.Y9 = document;
                mu1Var.Z9 = false;
                presentFragment(mu1Var, z);
                if (gl.O1() && !this.J0) {
                    finishFragment();
                }
            }
        }
    }

    public final void a4(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.a4(boolean):void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.l6));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.d7));
        hashSet.add(Integer.valueOf(bkb.e7));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.J6));
        hashSet.add(Integer.valueOf(bkb.I6));
        hashSet.add(Integer.valueOf(bkb.xj));
        hashSet.add(Integer.valueOf(bkb.wj));
        hashSet.add(Integer.valueOf(bkb.vj));
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.ki));
        hashSet.add(Integer.valueOf(bkb.H6));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.g8));
        hashSet.add(Integer.valueOf(bkb.ri));
        hashSet.add(Integer.valueOf(bkb.li));
        hashSet.add(Integer.valueOf(bkb.fd));
        hashSet.add(Integer.valueOf(bkb.e8));
    }

    public final int b2() {
        int i;
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null && aVar.getOccupyStatusBar()) {
            i = gl.m;
        } else {
            i = 0;
        }
        return org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i;
    }

    public final void b3() {
        TLRPC.ChatFull chatFull = this.v2;
        if (chatFull != null && chatFull.linked_chat_id != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.v2.linked_chat_id);
            if (getMessagesController().A(bundle, this, null, null)) {
                presentFragment(new mu1(bundle));
            }
        }
    }

    public final void b4(boolean z) {
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
            TLRPC.User V1 = getMessagesController().V1(Long.valueOf(this.v2.participants.participants.get(i2).user_id));
            if (V1 != null && (userStatus = V1.status) != null && ((userStatus.expires > currentTime || V1.id == getUserConfig().e()) && V1.status.expires > 10000)) {
                this.C2++;
            }
            this.D2.add(Integer.valueOf(i2));
            if (V1 != null) {
                if (V1.bot) {
                    i = -110;
                } else if (V1.self) {
                    i = 50000 + currentTime;
                } else {
                    TLRPC.UserStatus userStatus2 = V1.status;
                    if (userStatus2 != null) {
                        i = userStatus2.expires;
                    }
                }
                i2 = tb4.g(i, i2, 1, arrayList);
            }
            i = Integer.MIN_VALUE;
            i2 = tb4.g(i, i2, 1, arrayList);
        }
        try {
            Collections.sort(this.D2, Comparator$EL.reversed(Comparator$CC.comparingInt(new nl1(arrayList, (byte) 1))));
        } catch (Exception e) {
            fa4.g(e, true);
        }
        if (z && this.d != null && this.x4 > 0) {
            gl.V3(this.a);
        }
        if (this.O != null && this.N4 != -1) {
            if ((this.D2.size() > 5 || this.W4 == 2) && this.W4 != 1) {
                this.O.h1(this.D2, this.v2);
            }
        }
    }

    @Override
    public final boolean c() {
        return true;
    }

    public final int c2() {
        return W1() + d2();
    }

    public final void c3(boolean z) {
        TLRPC.TL_businessLocation tL_businessLocation;
        TLRPC.UserFull userFull = this.w2;
        if (userFull != null && (tL_businessLocation = userFull.business_location) != null) {
            if (tL_businessLocation.geo_point != null && !z) {
                nn8 nn8Var = new nn8(3, (byte) 0);
                nn8Var.setResourceProvider(this.A0);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = getMessagesController().w1(a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_businessLocation tL_businessLocation2 = this.w2.business_location;
                tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
                tL_messageMediaGeo.address = tL_businessLocation2.address;
                tL_message.media = tL_messageMediaGeo;
                nn8Var.V0 = false;
                nn8Var.F0(new k27(y6c.t0, tL_message, false, false));
                presentFragment(nn8Var);
                return;
            }
            boolean z2 = w01.a;
            org.telegram.messenger.a.q();
            try {
                Locale locale = Locale.US;
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(locale, "http://maps.google.com/maps?q=" + this.w2.business_location.address, new Object[0]))));
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    public final void c4() {
        CharSequence charSequence;
        zm8 zm8Var = this.r;
        if (zm8Var != null) {
            if ((!this.X5 || (charSequence = this.c6) == null) && (!this.A6 || (charSequence = this.z6) == null)) {
                charSequence = this.y6;
            }
            if (zm8Var.o(charSequence, !this.G1) && this.fragmentView != null) {
                N2(false);
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
    public final org.telegram.ui.ActionBar.a createActionBar(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.createActionBar(android.content.Context):org.telegram.ui.ActionBar.a");
    }

    @Override
    public final android.view.View createView(android.content.Context r55) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.createView(android.content.Context):android.view.View");
    }

    public final int d2() {
        if (W1() == 0) {
            return gl.L(168.0f);
        }
        return gl.L(152.0f);
    }

    public final void d3(int i, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z) {
        boolean[] zArr = new boolean[1];
        gn8 gn8Var = new gn8(this, user.id, this.f1, tL_chatAdminRights, this.F2.default_banned_rights, tL_chatBannedRights, str, i, zArr, user);
        gn8Var.Y0 = new hn8(this, i, chatParticipant, z, zArr);
        presentFragment(gn8Var);
    }

    public final void d4(boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.d4(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        ko8 ko8Var;
        boolean z;
        ui5 ui5Var;
        Object[] objArr2;
        TLRPC.ChatFull chatFull;
        TLRPC.User V1;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        boolean z2;
        TLRPC.Chat chat;
        Object[] objArr3;
        om8 om8Var;
        om8 om8Var2;
        y29 y29Var;
        if (i != kk7.D5 && i != kk7.q3) {
            boolean z3 = true;
            int i3 = 0;
            r3 = false;
            boolean z4 = false;
            if (i == 2) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i4 = na7.q5;
                if ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0 && (intValue & 524288) == 0) {
                    objArr3 = null;
                } else {
                    objArr3 = 1;
                }
                if (this.e1 != 0) {
                    if (objArr3 != null) {
                        d4(true);
                    }
                    if ((intValue & 1024) != 0 && (om8Var2 = this.a) != null && (y29Var = (y29) om8Var2.L(this.H3, false)) != null) {
                        this.d.t(y29Var, this.H3);
                    }
                } else if (this.f1 != 0) {
                    int i5 = intValue & 8192;
                    if (i5 != 0 || (intValue & 8) != 0 || (intValue & 16) != 0 || (intValue & 32) != 0 || (intValue & 4) != 0 || (524288 & intValue) != 0) {
                        if (i5 != 0) {
                            Y3(true, false);
                        } else {
                            b4(true);
                        }
                        d4(true);
                    }
                    if (objArr3 != null && (om8Var = this.a) != null) {
                        int childCount = om8Var.getChildCount();
                        for (int i6 = 0; i6 < childCount; i6++) {
                            View childAt = this.a.getChildAt(i6);
                            if (childAt instanceof v6c) {
                                ((v6c) childAt).i(intValue);
                            }
                        }
                    }
                }
            } else if (i == kk7.f1) {
                Long l = (Long) objArr[0];
                if (this.v2 != null && (chat = this.F2) != null && chat.id == l.longValue()) {
                    this.v2.online_count = ((Integer) objArr[1]).intValue();
                    b4(true);
                    d4(false);
                }
            } else if (i != kk7.N && i != kk7.a1) {
                if (i == kk7.Z) {
                    if (this.j1) {
                        gl.c3(new ll8(this, objArr, (byte) 1));
                    }
                } else if (i == kk7.X) {
                    TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                    TLRPC.EncryptedChat encryptedChat2 = this.E2;
                    if (encryptedChat2 != null && encryptedChat.id == encryptedChat2.id) {
                        this.E2 = encryptedChat;
                        Y3(false, false);
                        h24 h24Var = this.Y1;
                        if (h24Var != null) {
                            h24Var.i();
                        }
                    }
                } else if (i == kk7.f0) {
                    boolean z5 = this.k1;
                    if (getMessagesController().x0.indexOfKey(this.e1) >= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.k1 = z2;
                    if (z5 != z2) {
                        K1(true);
                        Y3(false, false);
                    }
                } else if (i == kk7.v2) {
                    Long l2 = (Long) objArr[0];
                    if (this.F2 != null) {
                        long longValue = l2.longValue();
                        TLRPC.Chat chat2 = this.F2;
                        if (longValue == chat2.id && hc2.w(14, chat2)) {
                            TLRPC.ChatFull L0 = na7.q1(this.currentAccount).L0(l2.longValue());
                            if (L0 != null) {
                                TLRPC.ChatFull chatFull4 = this.v2;
                                if (chatFull4 != null) {
                                    L0.participants = chatFull4.participants;
                                }
                                this.v2 = L0;
                            }
                            vn8 vn8Var = this.O;
                            if (vn8Var != null) {
                                vn8Var.setChatInfo(this.v2);
                            }
                            TLRPC.ChatFull chatFull5 = this.v2;
                            if (chatFull5 != null) {
                                TLRPC.InputGroupCall inputGroupCall = chatFull5.call;
                                boolean z6 = this.p1;
                                if (inputGroupCall != null ? z6 : !z6) {
                                    K1(false);
                                }
                            }
                            an8 an8Var = this.v0;
                            if (an8Var != null && (chatFull3 = this.v2) != null) {
                                an8Var.setStories(chatFull3.stories);
                            }
                            vq8 vq8Var = this.w0;
                            if (vq8Var != null) {
                                vq8Var.a();
                            }
                            xm8 xm8Var = this.f0;
                            if (xm8Var != null) {
                                xm8Var.setHasStories(M2());
                            }
                            if (l2.longValue() != 0) {
                                boolean z7 = w01.a;
                                z3 = (getMessagesController().G3() || (chatFull2 = this.v2) == null || !chatFull2.stargifts_available) ? false : false;
                                this.T0.Q(38, z3);
                                pl8 pl8Var = this.a0;
                                if (pl8Var != null) {
                                    pl8Var.o(3, z3);
                                }
                            }
                        }
                    }
                } else if (i == kk7.S) {
                    TLRPC.ChatFull chatFull6 = (TLRPC.ChatFull) objArr[0];
                    if (this.e1 != 0 && (V1 = getMessagesController().V1(Long.valueOf(this.e1))) != null && chatFull6.id == V1.linked_community_id) {
                        Y3(true, false);
                    }
                    TLRPC.Chat chat3 = this.F2;
                    if (chat3 != null && chatFull6.id == chat3.linked_community_id) {
                        Y3(true, false);
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
                        T1();
                        ym8 ym8Var = this.o0;
                        if (ym8Var != null && !this.q1) {
                            ym8Var.setChatInfo(this.v2);
                        }
                        Y3(true, false);
                        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(this.f1));
                        if (K0 != null) {
                            this.F2 = K0;
                            K1(true);
                        }
                        h24 h24Var2 = this.Y1;
                        if (h24Var2 != null) {
                            h24Var2.i();
                        }
                        if (this.F2.megagroup && (objArr2 != null || !booleanValue)) {
                            Z1(true);
                        }
                        H3();
                        j4();
                        an8 an8Var2 = this.v0;
                        if (an8Var2 != null && (chatFull = this.v2) != null) {
                            an8Var2.setStories(chatFull.stories);
                        }
                        vq8 vq8Var2 = this.w0;
                        if (vq8Var2 != null) {
                            vq8Var2.a();
                        }
                        xm8 xm8Var2 = this.f0;
                        if (xm8Var2 != null) {
                            xm8Var2.setHasStories(M2());
                        }
                        vn8 vn8Var2 = this.O;
                        if (vn8Var2 != null) {
                            vn8Var2.setChatInfo(this.v2);
                        }
                    }
                } else if (i == kk7.s) {
                    removeSelfFromStack(true);
                } else if (i == kk7.u) {
                    long longValue2 = ((Long) objArr[0]).longValue();
                    boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                    if (longValue2 == a() && (ui5Var = this.parentLayout) != null && ui5Var.getFragmentStack().contains(this)) {
                        if (booleanValue2 || this.parentLayout.getLastFragment() != this) {
                            if (this.parentLayout.getLastFragment() == this) {
                                finishFragment();
                            } else {
                                removeSelfFromStack(true);
                            }
                        }
                    }
                } else if (i == kk7.C0) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) objArr[0];
                    if (botInfo.user_id == this.e1) {
                        this.G2 = botInfo;
                        Y3(false, false);
                    }
                } else if (i == kk7.D0) {
                    if (((Long) objArr[0]).longValue() == this.e1) {
                        TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                        this.w2 = userFull;
                        hra hraVar = this.T;
                        if (hraVar != null) {
                            hraVar.set(userFull.stars_rating);
                        }
                        an8 an8Var3 = this.v0;
                        if (an8Var3 != null) {
                            an8Var3.setStories(this.w2.stories);
                        }
                        vq8 vq8Var3 = this.w0;
                        if (vq8Var3 != null) {
                            vq8Var3.a();
                        }
                        xm8 xm8Var3 = this.f0;
                        if (xm8Var3 != null) {
                            xm8Var3.setHasStories(M2());
                        }
                        vn8 vn8Var3 = this.O;
                        if (vn8Var3 != null) {
                            vn8Var3.setUserInfo(this.w2);
                        }
                        if (this.r0 != null) {
                            if (this.d != null && !TextUtils.equals(this.w2.about, this.A2)) {
                                this.d.g(this.X2);
                            }
                            if (this.s1) {
                                Y3(false, false);
                            }
                        } else {
                            if (!this.G1 && !this.L0) {
                                K1(true);
                            } else {
                                this.I1 = true;
                            }
                            Y3(false, false);
                            vn8 vn8Var4 = this.O;
                            if (vn8Var4 != null) {
                                vn8Var4.setCommonGroupsCount(this.w2.common_chats_count);
                                V();
                                ffa ffaVar = this.R;
                                if (ffaVar == null || ffaVar.E) {
                                    resumeDelayedFragmentAnimation();
                                    N2(true);
                                }
                            }
                        }
                        H3();
                        j4();
                        if (this.x2 == null && !r2()) {
                            hp8 hp8Var = new hp8(this.currentAccount);
                            this.x2 = hp8Var;
                            v36 v36Var = new v36(this, (byte) 17);
                            if (hp8Var.c) {
                                v36Var.run();
                            } else {
                                hp8Var.h.add(v36Var);
                            }
                            this.x2.b(this.w2);
                        }
                        if (!r2()) {
                            yo8 yo8Var = this.z2;
                            yo8 c = yo8.c(this.currentAccount, this.w2, yo8Var);
                            this.z2 = c;
                            if (c != yo8Var) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.y2 = z;
                            if (c != null) {
                                v36 v36Var2 = new v36(this, (byte) 18);
                                if (c.b) {
                                    v36Var2.run();
                                } else {
                                    c.h.add(v36Var2);
                                }
                            }
                        }
                        if (this.T0 != null) {
                            boolean n2 = n2();
                            xha xhaVar = this.T0;
                            if (n2) {
                                xhaVar.S(44);
                            } else {
                                xhaVar.u(44);
                            }
                            TLRPC.UserFull userFull2 = this.w2;
                            if (!userFull2.noforwards_my_enabled && !userFull2.noforwards_peer_enabled) {
                                z4 = true;
                            }
                            this.T0.Q(46, z4);
                            this.T0.Q(47, !z4);
                        }
                    }
                } else if (i != kk7.j0) {
                    if (i == 1) {
                        if (!((Boolean) objArr[2]).booleanValue() && a() == ((Long) objArr[0]).longValue()) {
                            ArrayList arrayList = (ArrayList) objArr[1];
                            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                k27 k27Var = (k27) arrayList.get(i7);
                                if (this.E2 != null) {
                                    TLRPC.MessageAction messageAction = k27Var.k.action;
                                    if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (ko8Var = this.d) != null) {
                                        ko8Var.f();
                                    }
                                }
                            }
                        }
                    } else if (i == kk7.k4) {
                        om8 om8Var3 = this.a;
                        if (om8Var3 != null) {
                            om8Var3.h1();
                        }
                    } else if (i == kk7.z4) {
                        Y3(false, false);
                    } else if (i == kk7.r1) {
                        int i8 = this.d3;
                        int i9 = this.b3;
                        int i10 = this.Z2;
                        e4();
                        ko8 ko8Var2 = this.d;
                        if (ko8Var2 != null) {
                            if (i8 != this.d3 || i9 != this.b3 || i10 != this.Z2) {
                                ko8Var2.f();
                            }
                        }
                    } else if (i == kk7.s5) {
                        if (this.q1) {
                            d4(false);
                        }
                    } else if (i == kk7.C1) {
                        to8 to8Var = this.e;
                        if (to8Var != null) {
                            to8Var.c = to8.H(this);
                            this.e.w.clear();
                            this.e.J();
                            to8 to8Var2 = this.e;
                            to8Var2.I(to8Var2.E);
                        }
                    } else if (i == kk7.b0) {
                        d4(false);
                    } else if (i != kk7.x5 && i != kk7.H5) {
                        if (i == kk7.j3) {
                            xha xhaVar2 = this.T0;
                            if (xhaVar2 != null) {
                                TL_account.RequirementToContact J2 = getMessagesController().J2(this.e1);
                                if (J2 != null && !(J2 instanceof TL_account.requirementToContactEmpty)) {
                                    z3 = false;
                                }
                                xhaVar2.Q(20, z3);
                            }
                            K3();
                        } else if (i == kk7.h5) {
                            K3();
                        } else if (i == kk7.z3) {
                            Y3(false, false);
                        } else if (i == kk7.D3) {
                            Y3(false, false);
                        } else if (i == kk7.E3) {
                            Y3(false, false);
                        } else if (i == kk7.x1) {
                            if (a() == ((Long) objArr[0]).longValue()) {
                                ui5 ui5Var2 = this.parentLayout;
                                if (ui5Var2 != null && ui5Var2.getLastFragment() == this) {
                                    finishFragment();
                                } else {
                                    removeSelfFromStack();
                                }
                            }
                        } else if (i == kk7.g3) {
                            long longValue3 = ((Long) objArr[0]).longValue();
                            if (this.N4 < 0 && longValue3 == a()) {
                                e4();
                                V();
                                ko8 ko8Var3 = this.d;
                                if (ko8Var3 != null) {
                                    ko8Var3.f();
                                }
                            }
                        } else if (i == kk7.H3) {
                            if (((Long) objArr[0]).longValue() == a() && !r2()) {
                                if (this.N4 < 0) {
                                    e4();
                                    V();
                                    ko8 ko8Var4 = this.d;
                                    if (ko8Var4 != null) {
                                        ko8Var4.f();
                                    }
                                    gl.c3(new v36(this, (byte) 19));
                                    return;
                                }
                                vn8 vn8Var5 = this.O;
                                if (vn8Var5 != null) {
                                    vn8Var5.N1(true);
                                }
                            }
                        } else if (i == kk7.X3) {
                            if (((Long) objArr[0]).longValue() == a() && this.e1 > 0) {
                                TLRPC.UserFull W1 = getMessagesController().W1(this.e1);
                                if (W1 != null) {
                                    this.w2 = W1;
                                }
                                e4();
                                V();
                                om8 om8Var4 = this.a;
                                if (om8Var4 != null && om8Var4.d0()) {
                                    this.a.post(new v36(this, (byte) 20));
                                    return;
                                }
                                ko8 ko8Var5 = this.d;
                                if (ko8Var5 != null) {
                                    ko8Var5.f();
                                }
                            }
                        } else if (i == kk7.Y3) {
                            long longValue4 = ((Long) objArr[0]).longValue();
                            long longValue5 = ((Long) objArr[1]).longValue();
                            TLRPC.Chat chat4 = this.F2;
                            if (chat4 != null && chat4.id == longValue4) {
                                String str = (String) objArr[2];
                                vf6 vf6Var = this.C1;
                                if (vf6Var != null && (chatParticipant = (TLRPC.ChatParticipant) vf6Var.f(longValue5)) != null) {
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
                                        gl.V3(this.a);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        xm8 xm8Var4 = this.f0;
                        if (xm8Var4 != null) {
                            xm8Var4.setHasStories(M2());
                            this.f0.setRoundRadiusForExpand((int) gl.R1(l2(), 0.0f, this.l2));
                        }
                        an8 an8Var4 = this.v0;
                        if (an8Var4 != null) {
                            TLRPC.UserFull userFull3 = this.w2;
                            if (userFull3 != null) {
                                an8Var4.setStories(userFull3.stories);
                                return;
                            }
                            TLRPC.ChatFull chatFull8 = this.v2;
                            if (chatFull8 != null) {
                                an8Var4.setStories(chatFull8.stories);
                            }
                        }
                    }
                }
            } else {
                K1(true);
            }
        } else if (hc2.R(na7.q1(this.currentAccount).K0(Long.valueOf(this.f1)))) {
            getMessagesController().M1().j(a(), new bm0((byte) 22), false, this.A0);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        wl5 wl5Var = this.r0;
        if (wl5Var != null && wl5Var.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        wl5 wl5Var = this.r0;
        if ((wl5Var == null || dialog != wl5Var.c) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final o39 e() {
        return this.a;
    }

    public final float e2() {
        return Math.max(this.G5, this.W5);
    }

    public final void e3(String str, p1 p1Var) {
        if (str.startsWith("@")) {
            getMessagesController().A3(str.substring(1), this, 0, p1Var);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/") && this.parentLayout.getFragmentStack().size() > 1) {
                org.telegram.ui.ActionBar.d dVar = (org.telegram.ui.ActionBar.d) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if (dVar instanceof mu1) {
                    finishFragment();
                    ((mu1) dVar).a0.B1(null, str, false, false);
                }
            }
        } else {
            cj3 cj3Var = new cj3(null);
            cj3Var.p2 = str;
            presentFragment(cj3Var);
        }
    }

    public final void e4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.e4():void");
    }

    @Override
    public final TLRPC.Chat f() {
        return this.F2;
    }

    public final float f2(float f, float f2) {
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
        hra hraVar = this.T;
        if (hraVar != null) {
            f4 = hraVar.getVisibilityFactor();
        } else {
            f4 = 0.0f;
        }
        return Math.max(0.0f, (k2() + this.u5) * l) + tb4.A(1.0f, l, f2 * f4, f);
    }

    public final boolean f3(float r24, float r25, int r26, android.view.View r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.f3(float, float, int, android.view.View):boolean");
    }

    public final void f4(boolean z) {
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
        o39 o39Var = this.b;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        o39Var.setVisibility(i2);
        FrameLayout searchContainer = this.U0.getSearchContainer();
        if (!z) {
            i3 = 8;
        }
        searchContainer.setVisibility(i3);
        vq8 vq8Var = this.w0;
        if (vq8Var != null) {
            vq8Var.setActive(!z);
        }
        this.actionBar.B(z);
        this.Y.setVisibility(i);
        an8 an8Var = this.v0;
        if (an8Var != null) {
            an8Var.setVisibility(i);
        }
        this.f.setVisibility(i);
        this.r.setVisibility(i);
        xha xhaVar = this.T0;
        if (xhaVar != null) {
            xhaVar.setAlpha(1.0f);
            this.T0.setVisibility(i);
        }
        this.U0.setVisibility(i);
        this.f0.setAlpha(1.0f);
        this.Y.setAlpha(1.0f);
        an8 an8Var2 = this.v0;
        if (an8Var2 != null) {
            an8Var2.setAlpha(1.0f);
        }
        vq8 vq8Var2 = this.w0;
        if (vq8Var2 != null) {
            vq8Var2.setAlpha(1.0f);
        }
        this.f.setAlpha(1.0f);
        zm8 zm8Var = this.r;
        if (this.X5) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        zm8Var.setAlpha(f);
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

    @Override
    public final boolean g(org.telegram.tgnet.TLRPC.ChatParticipant r26, boolean r27, boolean r28, android.view.View r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.g(org.telegram.tgnet.TLRPC$ChatParticipant, boolean, boolean, android.view.View):boolean");
    }

    public final float g2(float f) {
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
            f3 = this.T.getVisibilityFactor() * gl.L(3.0f);
        }
        return tb4.A(1.0f, l, f3, f);
    }

    public final void g3() {
        int i;
        ValueAnimator valueAnimator;
        if (this.q2 && (valueAnimator = this.k2) != null && valueAnimator.isRunning()) {
            this.f2 = this.g6;
            this.h2 = this.h6;
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
        if (this.actionBar.getOccupyStatusBar()) {
            i = gl.m;
        } else {
            i = 0;
        }
        h3(C1(), currentActionBarHeight + i);
    }

    public final void g4() {
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

    public float getAvatarAnimationProgress() {
        return this.T1;
    }

    @Override
    public final p98 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final wjb getResourceProvider() {
        return this.A0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.A0 != null) {
            return null;
        }
        t00 t00Var = new t00(this, (byte) 15);
        ArrayList arrayList = new ArrayList();
        vn8 vn8Var = this.O;
        if (vn8Var != null) {
            arrayList.addAll(vn8Var.getThemeDescriptions());
        }
        arrayList.add(new blb(this.d1, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Z6));
        arrayList.add(new blb(this.f0, 0, (Class[]) null, (Paint) null, new Drawable[]{this.q0}, (alb) null, bkb.c8));
        arrayList.add(new blb(this.s, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.mi));
        arrayList.add(new blb(this.s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.ni));
        arrayList.add(new blb(this.s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.oi));
        arrayList.add(new blb(this.a, 262144, new Class[]{wgb.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, bkb.w6));
        arrayList.add(new blb(this.a, 262144, new Class[]{wgb.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, bkb.o7));
        arrayList.add(new blb(this.a, 262144, new Class[]{wgb.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, bkb.n6));
        arrayList.add(new blb(this.a, 262144, new Class[]{wgb.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, bkb.t6));
        arrayList.add(new blb(this.a, 262144, new Class[]{wgb.class}, new String[]{"imageView"}, (Drawable[]) null, (alb) null, bkb.u6));
        arrayList.add(new blb(this.a, 0, new Class[]{q8a.class}, new String[]{"detailTextView"}, (Drawable[]) null, (alb) null, bkb.y6));
        int i = bkb.Ii;
        arrayList.add(new blb(this.a, 0, new Class[]{q8a.class}, new String[]{"yesButton"}, (Drawable[]) null, (alb) null, i));
        int i2 = bkb.Ei;
        arrayList.add(new blb(this.a, 131072, new Class[]{q8a.class}, new String[]{"yesButton"}, (Drawable[]) null, (alb) null, i2));
        int i3 = bkb.Gi;
        arrayList.add(new blb(this.a, 196608, new Class[]{q8a.class}, new String[]{"yesButton"}, (Drawable[]) null, (alb) null, i3));
        arrayList.add(new blb(this.a, 0, new Class[]{q8a.class}, new String[]{"noButton"}, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.a, 131072, new Class[]{q8a.class}, new String[]{"noButton"}, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.a, 196608, new Class[]{q8a.class}, new String[]{"noButton"}, (Drawable[]) null, (alb) null, i3));
        arrayList.add(new blb(this.a, 0, new Class[]{vl7.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.L6));
        arrayList.add(new blb(this.a, 0, new Class[]{vl7.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.M6));
        arrayList.add(new blb(this.a, 0, new Class[]{v6c.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, t00Var, bkb.m6));
        boolean z = this.X5;
        zr1 zr1Var = this.f;
        Drawable drawable = this.I;
        if (z) {
            arrayList.add(new blb(zr1Var, 0, (Class[]) null, (Paint) null, new Drawable[]{drawable}, (alb) null, bkb.Ej));
            arrayList.add(new blb(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.y}, (alb) null, bkb.c6));
            return arrayList;
        }
        arrayList.add(new blb(zr1Var, 0, (Class[]) null, (Paint) null, new Drawable[]{drawable}, (alb) null, bkb.qi));
        arrayList.add(new blb(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.y}, (alb) null, bkb.pi));
        return arrayList;
    }

    @Override
    public final int getThemedColor(int i) {
        return bkb.v0(i, this.A0);
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable;
        wjb wjbVar = this.A0;
        if (wjbVar != null) {
            drawable = wjbVar.getDrawable(str);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return super.getThemedDrawable(str);
    }

    public final m33 h2() {
        m33 m33Var = this.K;
        if (m33Var == null) {
            Drawable mutate = getParentActivity().getDrawable(2131232312).mutate();
            this.E = mutate;
            mutate.setColorFilter(bkb.v0(bkb.pi, this.A0), PorterDuff.Mode.MULTIPLY);
            m33 m33Var2 = new m33(this.E, getParentActivity().getDrawable(2131232315).mutate());
            this.K = m33Var2;
            return m33Var2;
        }
        return m33Var;
    }

    public final void h3(float f, float f2) {
        float R1;
        int i;
        float max = Math.max(0.0f, Math.min(1.0f, (this.Q1 - c2()) / ((this.a.getMeasuredWidth() - f2) - d2())));
        if (this.Q1 < c2() && max < 0.33f) {
            R1 = b00.y(f, 72.0f, 24.0f, 42.0f);
        } else {
            R1 = gl.R1(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f));
        }
        if (this.actionBar.getOccupyStatusBar()) {
            i = gl.m;
        } else {
            i = 0;
        }
        float currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f;
        float translationY = this.actionBar.getTranslationY();
        float N = ((gl.N(8.0f) + (gl.L(42.0f) * R1)) * f) + ((float) Math.floor(translationY + (de9.v(f, 1.0f, currentActionBarHeight, i) - (gl.p * 21.0f))));
        this.f2 = (gl.L(7.0f) * f) + gl.L(1.3f) + N;
        this.h2 = (((float) Math.floor(gl.p * 11.0f)) * f) + N + gl.L(24.0f);
    }

    public final void h4(boolean z) {
        org.telegram.ui.ActionBar.a aVar;
        float f;
        boolean z2;
        if ((this.v0 != null || this.w0 != null) && (aVar = this.actionBar) != null && this.simpleActionBar != null) {
            if (aVar.getOccupyStatusBar()) {
                f = gl.m;
            } else {
                f = 0.0f;
            }
            int L = gl.L(7.0f);
            float right = this.simpleActionBar.getBackButton().getRight() + L;
            float menuPillLeft = this.simpleActionBar.getMenuPillLeft() - L;
            an8 an8Var = this.v0;
            boolean z3 = false;
            if (an8Var != null) {
                float z4 = oo1.z(this.actionBar.getHeight(), f, 2.0f, f);
                if (Math.abs(right - an8Var.g0) <= 0.1f && Math.abs(menuPillLeft - an8Var.h0) <= 0.1f && Math.abs(z4 - an8Var.i0) <= 0.1f) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                an8Var.g0 = right;
                an8Var.h0 = menuPillLeft;
                if (z) {
                    an8Var.n0.e(true, menuPillLeft);
                }
                an8Var.i0 = z4;
                if (z2) {
                    an8Var.invalidate();
                }
            }
            vq8 vq8Var = this.w0;
            if (vq8Var != null) {
                float z5 = oo1.z(this.actionBar.getHeight(), f, 2.0f, f);
                int d2 = d2();
                if (Math.abs(right - vq8Var.r) > 0.1f || Math.abs(menuPillLeft - vq8Var.s) > 0.1f || Math.abs(z5 - vq8Var.w) > 0.1f) {
                    z3 = true;
                }
                vq8Var.r = right;
                vq8Var.s = menuPillLeft;
                if (z) {
                    vq8Var.E.e(true, menuPillLeft);
                }
                vq8Var.w = z5;
                vq8Var.y = d2 + z5;
                if (z3) {
                    vq8Var.invalidate();
                }
            }
        }
    }

    public final float i2(int i) {
        View subtitleTextView;
        jia jiaVar;
        sy1 sy1Var = this.m5;
        if (sy1Var != null && !(sy1Var instanceof mu1) && sy1Var.q() != null) {
            o72 q = this.m5.q();
            if (i == 0) {
                subtitleTextView = q.getTitleTextView();
                jiaVar = this.f;
            } else {
                subtitleTextView = q.getSubtitleTextView();
                jiaVar = this.r;
            }
            float textSize = jiaVar.getPaint().getTextSize();
            if ((subtitleTextView instanceof jia) && textSize > 0.0f) {
                return ((jia) subtitleTextView).getPaint().getTextSize() / textSize;
            }
            return 1.0f;
        }
        return 1.0f;
    }

    public final void i3() {
        om8 om8Var = this.a;
        if (om8Var != null && this.c != null && om8Var.getChildCount() > 0 && !this.t6) {
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
                this.r6 = i2;
                int top = view.getTop();
                this.s6 = top;
                if (this.r6 == 0 && !this.p2 && top > c2()) {
                    this.s6 = c2();
                }
                this.c.g1(i2, view.getTop() - this.a.getPaddingTop());
            }
        }
    }

    public final void i4() {
        try {
            sb sbVar = this.U;
            if (sbVar != null && (sbVar.getForeground() instanceof ColorDrawable)) {
                ((ColorDrawable) this.U.getForeground()).setColor(bm2.o(bkb.v0(bkb.c6, this.A0), 100));
            }
            float f = this.W5;
            Drawable drawable = this.E;
            int[] iArr = this.Y6;
            if (drawable != null) {
                int R0 = gl.R0(f, 1.0f, bkb.v0(bkb.pi, this.A0), bkb.v0(bkb.Ej, this.A0));
                int i = iArr[6];
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                if (R0 != i) {
                    drawable.setColorFilter(new PorterDuffColorFilter(R0, mode));
                }
                iArr[6] = R0;
            }
            Drawable drawable2 = this.U6;
            if (drawable2 != null) {
                int v0 = bkb.v0(bkb.U6, this.A0);
                int i2 = iArr[3];
                PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
                if (v0 != i2) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(v0, mode2));
                }
                iArr[3] = v0;
            }
            Drawable drawable3 = this.V6;
            if (drawable3 != null) {
                int v02 = bkb.v0(bkb.u8, this.A0);
                int i3 = iArr[4];
                PorterDuff.Mode mode3 = PorterDuff.Mode.MULTIPLY;
                if (v02 != i3) {
                    drawable3.setColorFilter(new PorterDuffColorFilter(v02, mode3));
                }
                iArr[4] = v02;
            }
            Drawable drawable4 = this.W6;
            if (drawable4 != null) {
                int v03 = bkb.v0(bkb.E8, this.A0);
                int i4 = iArr[5];
                PorterDuff.Mode mode4 = PorterDuff.Mode.SRC_IN;
                if (v03 != i4) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(v03, mode4));
                }
                iArr[5] = v03;
            }
            cm2 cm2Var = this.X6;
            if (cm2Var != null) {
                cm2Var.y = bkb.v0(bkb.mk, this.A0);
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
            fa4.g(e, true);
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
            if (aVar != null && aVar.y()) {
                v0 = bkb.v0(bkb.v8, this.A0);
            } else if (!this.X5 && this.G5 <= 0.5f) {
                da7 da7Var = this.n6;
                if (da7Var != null) {
                    v0 = da7Var.d(bkb.I.o());
                } else {
                    v0 = bkb.v0(bkb.r8, this.A0);
                }
            } else {
                v0 = bkb.v0(bkb.c6, this.A0);
            }
            if (bm2.h(v0) > 0.699999988079071d) {
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
    public final lx4 j() {
        dg0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (qw4.f().a) {
            return baseSimpleGlass.i;
        }
        return null;
    }

    public final float j2(float f, int i, View view) {
        View C;
        float left;
        int paddingLeft;
        sy1 sy1Var = this.m5;
        if (sy1Var != null && !(sy1Var instanceof mu1) && this.fragmentView != null && (view.getParent() instanceof View)) {
            o72 q = this.m5.q();
            org.telegram.ui.ActionBar.a actionBar = ((org.telegram.ui.ActionBar.d) this.m5).getActionBar();
            View view2 = null;
            if (i == 0) {
                if (q != null) {
                    view2 = q.getTitleTextView();
                }
            } else if (i == 1) {
                if (q != null) {
                    view2 = q.getSubtitleTextView();
                }
            } else if (actionBar != null) {
                view2 = actionBar.getBackButton();
            }
            if (view2 != null) {
                cj3 cj3Var = this.l5;
                if (cj3Var != null && cj3Var.getFragmentView() != null) {
                    C = this.l5.getFragmentView();
                } else {
                    C = this.m5.C();
                }
                RectF rectF = this.l6;
                if (zec.c(view2, C, rectF)) {
                    float f2 = rectF.left;
                    if (zec.c((View) view.getParent(), this.fragmentView, rectF)) {
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

    public final void j3(boolean z) {
        int i = this.N4;
        if (i >= 0) {
            if (z) {
                v26 v26Var = new v26(getParentActivity(), 2, 0.6f);
                v26Var.a = this.N4;
                v26Var.p = -this.a.getPaddingTop();
                this.c.v0(v26Var);
                return;
            }
            this.c.g1(i, -this.a.getPaddingTop());
        }
    }

    public final void j4() {
        boolean z;
        TLRPC.UserFull userFull;
        if (this.Y0 == null) {
            return;
        }
        if (this.E2 == null && (((userFull = this.w2) != null && userFull.ttl_period > 0) || (this.v2 != null && hc2.y(13, this.F2) && this.v2.ttl_period > 0))) {
            z = true;
        } else {
            z = false;
        }
        gl.T3(this.Y0, z, 0.8f, true, this.r5);
    }

    public final float k2() {
        if (this.T != null) {
            return this.T.getVisibilityFactor() * gl.L(22.0f);
        }
        return 0.0f;
    }

    public final ValueAnimator k3(final boolean z) {
        float f;
        boolean z2;
        int i;
        if (z) {
            gl.V2(getParentActivity(), this.classGuid);
            gl.g3(getParentActivity(), this.classGuid);
        }
        ValueAnimator valueAnimator = this.W1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.W1.cancel();
        }
        vq8 vq8Var = this.w0;
        if (vq8Var != null) {
            vq8Var.setActive(!z);
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
        N2(true);
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
        xha xhaVar = this.T0;
        if (xhaVar != null) {
            xhaVar.setVisibility(i);
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
                ProfileActivity.this.H2(ofFloat, f3, z);
            }
        });
        ofFloat.addListener(new mn8(this, z, (byte) 0));
        if (!z) {
            this.Y4 = true;
            i3();
            gl.U2(getParentActivity(), this.classGuid);
            this.P.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(s33.f);
        this.W1 = ofFloat;
        return ofFloat;
    }

    public final void k4(boolean z) {
        boolean z2;
        boolean z3;
        int i;
        int i2;
        boolean z4;
        float f;
        TLRPC.ChatFull chatFull;
        float f2 = 0.2f;
        int i3 = (C1() > 0.2f ? 1 : (C1() == 0.2f ? 0 : -1));
        int i4 = 0;
        if (i3 > 0 && !this.X1 && (this.r0 == null || this.P2 == -1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.d6 = z2;
        I1();
        ry8 ry8Var = this.s;
        if (ry8Var != null && ry8Var.getVisibility() != 8) {
            ry8 ry8Var2 = this.s;
            if (this.actionBar.getOccupyStatusBar()) {
                i2 = gl.m;
            } else {
                i2 = 0;
            }
            ry8Var2.setTranslationY((((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i2) + this.Q1) + this.U1) - gl.L(29.5f));
            if (i3 > 0 && !this.X1 && !this.s1 && (this.r0 == null || this.P2 == -1)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 && this.f1 != 0) {
                if (hc2.T(this.F2) && !this.F2.megagroup && (chatFull = this.v2) != null && chatFull.linked_chat_id != 0 && (this.E3 != -1 || this.F3 != -1)) {
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
                    ry8 ry8Var3 = this.s;
                    if (z3) {
                        ry8Var3.setTag(null);
                    } else {
                        ry8Var3.setTag(0);
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
                        this.w.addListener(new bn8(this, (byte) 3));
                        this.w.start();
                    } else {
                        ry8 ry8Var4 = this.s;
                        if (z3) {
                            f = 1.0f;
                        } else {
                            f = 0.2f;
                        }
                        ry8Var4.setScaleX(f);
                        ry8 ry8Var5 = this.s;
                        if (z3) {
                            f2 = 1.0f;
                        }
                        ry8Var5.setScaleY(f2);
                        ry8 ry8Var6 = this.s;
                        if (z3) {
                            f3 = 1.0f;
                        }
                        ry8Var6.setAlpha(f3);
                    }
                }
            }
        } else {
            z3 = false;
        }
        an8 an8Var = this.v0;
        if (an8Var != null) {
            float measuredWidth = this.Z.getMeasuredWidth() - gl.L(40.0f);
            if (this.actionBar.getOccupyStatusBar()) {
                i = gl.m;
            } else {
                i = 0;
            }
            an8Var.j0 = measuredWidth;
            an8Var.l0 = z3;
            an8Var.k0 = (org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f) + i;
            an8Var.invalidate();
        }
        vq8 vq8Var = this.w0;
        if (vq8Var != null) {
            if (this.actionBar.getOccupyStatusBar()) {
                i4 = gl.m;
            }
            vq8Var.setExpandCoords(org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i4 + this.Q1 + this.U1);
        }
    }

    public final int l2() {
        float f;
        if (this.q1) {
            return 0;
        }
        if (this.f1 != 0 && hc2.c0(getMessagesController().K0(Long.valueOf(this.f1)))) {
            if (M2()) {
                f = 24.0f;
            } else {
                f = 38.0f;
            }
            return gl.L(f);
        }
        return gl.L(50.0f);
    }

    public final void l4() {
        lca lcaVar;
        kda kdaVar;
        l46 l46Var;
        int v0;
        int v02;
        int v03;
        int i;
        int v04;
        int v05;
        int v06;
        this.o6.clear();
        wo8 wo8Var = this.d1;
        if (wo8Var != null) {
            wo8Var.a(this.n6, true);
        }
        zm8 zm8Var = this.r;
        if (zm8Var != null) {
            if (zm8Var.getTag() instanceof Integer) {
                v06 = bkb.v0(((Integer) this.r.getTag()).intValue(), this.A0);
            } else {
                v06 = bkb.v0(bkb.A8, this.A0);
            }
            this.r.setTextColor(bm2.f(this.l2, z1(v06, Boolean.valueOf(this.K0[0])), -1275068417));
        }
        uo8 uo8Var = this.F6;
        float f = -0.1f;
        if (uo8Var != null) {
            uo8Var.a(bm2.f(this.l2, bkb.p1(0.5f, bkb.a(0.18f, -0.1f, this.c1)), 603979775));
        }
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        int i2 = -1;
        if (aVar != null) {
            if (this.n6 != null) {
                v04 = -1;
            } else {
                v04 = bkb.v0(bkb.u8, this.A0);
            }
            aVar.H(bm2.f(this.W5, v04, bkb.v0(bkb.x8, this.A0)), false);
            org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
            da7 da7Var = this.n6;
            if (da7Var != null) {
                v05 = 1090519039;
            } else if (da7Var != null) {
                v05 = 553648127;
            } else {
                v05 = bkb.v0(bkb.e8, this.A0);
            }
            aVar2.G(bm2.f(this.W5, v05, bkb.v0(bkb.y8, this.A0)), false);
        }
        if (this.y != null) {
            da7 da7Var2 = this.n6;
            if (da7Var2 != null) {
                int g = da7Var2.g();
                boolean o = this.n6.o(bkb.I.o());
                da7 da7Var3 = this.n6;
                if (o) {
                    i = da7Var3.k();
                } else {
                    i = da7Var3.i();
                }
                int f2 = bm2.f(0.4f, g, i);
                if (!bkb.I.o()) {
                    f = -0.08f;
                }
                v03 = bkb.a(0.1f, f, f2);
            } else {
                v03 = bkb.v0(bkb.pi, this.A0);
            }
            this.y.setColorFilter(gl.R0(this.W5, 1.0f, v03, bkb.v0(bkb.Ej, this.A0)), PorterDuff.Mode.MULTIPLY);
        }
        if (this.I != null) {
            if (this.n6 != null) {
                v02 = -1;
            } else {
                v02 = bkb.v0(bkb.qi, this.A0);
            }
            this.I.setColorFilter(gl.R0(this.W5, 1.0f, v02, bkb.v0(bkb.c6, this.A0)), PorterDuff.Mode.MULTIPLY);
        }
        zr1 zr1Var = this.f;
        if (zr1Var != null) {
            if (this.n6 != null) {
                v0 = -1;
            } else {
                v0 = bkb.v0(bkb.li, this.A0);
            }
            zr1Var.setTextColor(bm2.f(this.l2, bm2.f(this.W5, v0, bkb.v0(bkb.Ej, this.A0)), -1));
        }
        spc spcVar = this.a1;
        if (spcVar != null && (l46Var = (l46) spcVar.e) != null) {
            l46Var.invalidate();
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            if (this.n6 == null) {
                i2 = bm2.f(this.T1, bkb.v0(bkb.fd, this.A0), -1);
            }
            drawable.setColorFilter(i2, PorterDuff.Mode.MULTIPLY);
        }
        jr8 jr8Var = this.c0;
        if (jr8Var != null) {
            jr8Var.setColor(this.n6);
        }
        gl.d0(this.a, new dm8(this, (byte) 3));
        vn8 vn8Var = this.O;
        if (vn8Var != null && (kdaVar = vn8Var.L0) != null) {
            kdaVar.updateColors();
        }
        vn8 vn8Var2 = this.O;
        if (vn8Var2 != null && (lcaVar = vn8Var2.b0) != null) {
            lcaVar.m();
        }
        m4();
        L3();
        an8 an8Var = this.v0;
        if (an8Var != null) {
            an8Var.f(true, true);
        }
        vq8 vq8Var = this.w0;
        if (vq8Var != null) {
            vq8Var.a();
        }
    }

    public final m33 m2() {
        int i;
        float f;
        m33 m33Var = this.J;
        if (m33Var == null) {
            this.y = bkb.P1.getConstantState().newDrawable().mutate();
            this.I = bkb.Q1.getConstantState().newDrawable().mutate();
            da7 da7Var = this.n6;
            if (da7Var != null) {
                boolean o = da7Var.o(bkb.I.o());
                da7 da7Var2 = this.n6;
                if (o) {
                    i = da7Var2.k();
                } else {
                    i = da7Var2.i();
                }
                if (bkb.I.o()) {
                    f = -0.1f;
                } else {
                    f = -0.08f;
                }
                int a = bkb.a(0.1f, f, i);
                Drawable drawable = this.y;
                int R0 = gl.R0(this.W5, 1.0f, a, bkb.v0(bkb.Ej, this.A0));
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(R0, mode);
                this.I.setColorFilter(gl.R0(this.W5, 1.0f, -1, bkb.v0(bkb.c6, this.A0)), mode);
            }
            m33 m33Var2 = new m33(new fm2(this.y, this.I), getParentActivity().getDrawable(2131232798));
            this.J = m33Var2;
            return m33Var2;
        }
        return m33Var;
    }

    public final void m3() {
        pl8 pl8Var = this.a0;
        if (pl8Var != null) {
            if (this.s1) {
                pl8Var.F = (byte) 6;
            } else if (this.q1) {
                pl8Var.F = (byte) 5;
            } else if (this.s2) {
                pl8Var.F = (byte) 2;
            } else if (this.e1 != 0) {
                pl8Var.F = (byte) 0;
            } else if (this.f1 != 0) {
                TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(this.f1));
                if (hc2.T(K0)) {
                    boolean n0 = hc2.n0(K0);
                    pl8 pl8Var2 = this.a0;
                    if (n0) {
                        pl8Var2.F = (byte) 3;
                        return;
                    } else if (hc2.c0(K0)) {
                        pl8Var2.F = (byte) 4;
                        return;
                    } else {
                        pl8Var2.F = (byte) 1;
                        return;
                    }
                }
                this.a0.F = (byte) 3;
            }
        }
    }

    public final void m4() {
        if (this.s != null) {
            try {
                int v0 = bkb.v0(bkb.ni, this.A0);
                int v02 = bkb.v0(bkb.oi, this.A0);
                int v03 = bkb.v0(bkb.mi, this.A0);
                if (this.n6 != null && bkb.c1(v0)) {
                    v0 = bkb.a(0.05f, -0.04f, this.n6.c(false));
                    da7 da7Var = this.n6;
                    if (da7Var != null) {
                        int d = da7Var.d(bkb.I.o());
                        v02 = bkb.C(bkb.I.o(), bkb.v0(bkb.u6, this.A0), d, v02, d);
                    }
                    v03 = -1;
                }
                ry8 ry8Var = this.v6;
                ry8 ry8Var2 = this.s;
                int[] iArr = this.w6;
                if (ry8Var != ry8Var2 || iArr[0] != v0 || iArr[1] != v02 || iArr[2] != v03) {
                    this.v6 = ry8Var2;
                    iArr[0] = v0;
                    iArr[1] = v02;
                    iArr[2] = v03;
                    Drawable mutate = this.fragmentView.getContext().getResources().getDrawable(2131231201).mutate();
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
                    fm2 fm2Var = new fm2(mutate, bkb.h0(gl.L(56.0f), v0, v02), 0, 0);
                    int L = gl.L(56.0f);
                    int L2 = gl.L(56.0f);
                    fm2Var.e = L;
                    fm2Var.f = L2;
                    this.s.setBackground(fm2Var);
                    this.s.setColorFilter(new PorterDuffColorFilter(v03, mode));
                }
            } catch (Exception unused) {
            }
        }
    }

    public final boolean n2() {
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

    public final void n3(float r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.n3(float):void");
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.J1 == 0) {
            return true;
        }
        return false;
    }

    public final void o2() {
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
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        wl5 wl5Var = this.r0;
        if (wl5Var != null) {
            wl5Var.h(i, i2, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        kda kdaVar;
        if (super.onBackPressed(z)) {
            vn8 vn8Var = this.O;
            if (vn8Var != null && (kdaVar = vn8Var.L0) != null && kdaVar.o0) {
                if (z) {
                    E3();
                    return false;
                }
            } else if (this.N4 != -1 && vn8Var != null && vn8Var.F1) {
                if (z) {
                    vn8Var.E(true);
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
        m4();
        this.u6 = true;
        M1();
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
        vn8 vn8Var = this.O;
        if (vn8Var != null) {
            vn8Var.onConfigurationChanged(configuration);
        }
        o2();
        if (this.o2 && this.q2 && (m = this.c.m(0)) != null) {
            this.a.scrollBy(0, m.getTop() - c2());
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
        om8 om8Var = this.a;
        if (om8Var != null) {
            om8Var.h1();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        vn8 vn8Var = this.O;
        if (vn8Var != null) {
            vn8Var.L0();
        }
        ffa ffaVar = this.R;
        if (ffaVar != null) {
            ffaVar.b(this);
        }
        ffa ffaVar2 = this.R;
        if (ffaVar2 != null) {
            ffaVar2.y.remove(this);
        }
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, kk7.s);
        getNotificationCenter().n(this, kk7.u);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, kk7.s5);
        getNotificationCenter().n(this, kk7.C1);
        getNotificationCenter().n(this, kk7.b0);
        getNotificationCenter().n(this, kk7.x5);
        getNotificationCenter().n(this, kk7.H5);
        getNotificationCenter().n(this, kk7.j3);
        getNotificationCenter().n(this, kk7.h5);
        getNotificationCenter().n(this, kk7.z3);
        getNotificationCenter().n(this, kk7.D3);
        getNotificationCenter().n(this, kk7.E3);
        getNotificationCenter().n(this, kk7.x1);
        getNotificationCenter().n(this, kk7.g3);
        getNotificationCenter().n(this, kk7.H3);
        getNotificationCenter().n(this, kk7.X3);
        getNotificationCenter().n(this, kk7.Y3);
        kk7.e().n(this, kk7.k4);
        ym8 ym8Var = this.o0;
        if (ym8Var != null) {
            ym8Var.K();
        }
        kp8 kp8Var = this.n0;
        if (kp8Var != null) {
            kp8Var.c();
        }
        this.f6 = null;
        if (this.e1 != 0) {
            getNotificationCenter().n(this, kk7.r1);
            getNotificationCenter().n(this, kk7.N);
            getNotificationCenter().n(this, kk7.Z);
            getNotificationCenter().n(this, kk7.X);
            getNotificationCenter().n(this, kk7.f0);
            getNotificationCenter().n(this, kk7.C0);
            getNotificationCenter().n(this, kk7.D0);
            getNotificationCenter().n(this, kk7.j0);
            kk7.e().n(this, kk7.z4);
            getMessagesController().h1.remove(Long.valueOf(this.e1));
        } else if (this.f1 != 0) {
            kk7.e().n(this, kk7.D5);
            getNotificationCenter().n(this, kk7.q3);
            getNotificationCenter().n(this, kk7.S);
            getNotificationCenter().n(this, kk7.f1);
            getNotificationCenter().n(this, kk7.v2);
            getNotificationCenter().n(this, kk7.a1);
        }
        xm8 xm8Var = this.f0;
        if (xm8Var != null) {
            xm8Var.setImageDrawable(null);
        }
        wl5 wl5Var = this.r0;
        if (wl5Var != null) {
            wl5Var.c();
        }
        cn8 cn8Var = this.Z4;
        if (cn8Var != null) {
            cn8Var.b();
        }
        yo8 yo8Var = this.z2;
        if (yo8Var != null && this.y2) {
            yo8Var.b(true);
            this.z2 = null;
        }
        b61 b61Var = this.D5;
        if (b61Var != null) {
            this.D5 = null;
            gl.c3(b61Var);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onPause() {
        vda vdaVar;
        super.onPause();
        UndoView undoView = this.M;
        if (undoView != null) {
            undoView.d(0, true);
        }
        wl5 wl5Var = this.r0;
        if (wl5Var != null) {
            wl5Var.i();
        }
        h24 h24Var = this.Y1;
        if (h24Var != null) {
            h24Var.g();
        }
        vn8 vn8Var = this.O;
        if (vn8Var != null && (vdaVar = vn8Var.W) != null) {
            vdaVar.e = false;
            if (vdaVar.c != null) {
                vdaVar.a.onPause();
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
        wl5 wl5Var = this.r0;
        if (wl5Var != null) {
            wl5Var.j(i, strArr, iArr);
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
                    fc2 e1 = getMessagesController().e1(this.f1, false, null);
                    TLRPC.Chat chat = this.F2;
                    if (e1 == null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    rgc.l(chat, null, z5, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                rgc.h(getParentActivity(), null, i);
                return;
            }
            return;
        }
        TLRPC.User V1 = getMessagesController().V1(Long.valueOf(this.e1));
        if (V1 == null) {
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
            rgc.m(V1, z2, z3, getParentActivity(), this.w2, getAccountInstance());
            return;
        }
        rgc.h(getParentActivity(), null, i);
    }

    @Override
    public final void onResume() {
        TLRPC.User V1;
        sb sbVar;
        super.onResume();
        vn8 vn8Var = this.O;
        if (vn8Var != null) {
            vn8Var.e1 = true;
            uda udaVar = vn8Var.K;
            if (udaVar != null) {
                udaVar.f();
            }
            afa afaVar = vn8Var.N;
            if (afaVar != null) {
                afaVar.f();
            }
            bfa bfaVar = vn8Var.M;
            if (bfaVar != null) {
                bfaVar.X(false);
            }
            for (int i = 0; i < vn8Var.n0.length; i++) {
                vn8Var.N(i);
            }
            vda vdaVar = vn8Var.W;
            if (vdaVar != null) {
                vdaVar.e = true;
                if (vdaVar.c != null) {
                    vdaVar.a.onResume();
                }
            }
        }
        o2();
        ko8 ko8Var = this.d;
        if (ko8Var != null) {
            this.X4 = true;
            ko8Var.f();
        }
        if (!((ActionBarLayout) this.parentLayout).w() && (sbVar = this.U) != null && sbVar.getVisibility() == 0) {
            this.U.setVisibility(8);
            this.U.setBackground(null);
        }
        wl5 wl5Var = this.r0;
        if (wl5Var != null) {
            wl5Var.k();
            setParentActivityTitle(k96.M0(2131745303, null));
        }
        d4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 9));
        }
        zr1 zr1Var = this.f;
        if (zr1Var != null) {
            setParentActivityTitle(zr1Var.getText());
        }
        if (this.e1 != 0 && (V1 = getMessagesController().V1(Long.valueOf(this.e1))) != null && V1.photo == null && this.Q1 >= c2()) {
            this.k2.cancel();
            float[] fArr = this.n2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            n3(1.0f);
            this.o0.setVisibility(8);
            this.Q1 = c2();
            this.p2 = false;
            this.c.g1(0, c2() - this.a.getPaddingTop());
        }
        h24 h24Var = this.Y1;
        if (h24Var != null) {
            h24Var.a();
        }
        X3();
        N2(false);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.z0.setColor(bkb.v0(bkb.h6, this.A0));
            F3();
            i4();
            A1();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        pha phaVar;
        if (z && (phaVar = this.simpleActionBar) != null) {
            phaVar.setAlpha(1.0f);
        }
        if (z) {
            if (!z2) {
                byte b = this.J1;
                if (b != 0 && this.M1) {
                    if (b == 1) {
                        this.l2 = 0.0f;
                        hra hraVar = this.T;
                        if (hraVar != null) {
                            hraVar.setParentExpanded(0.0f);
                        }
                        pl8 pl8Var = this.a0;
                        if (pl8Var != null) {
                            pl8Var.setParentExpanded(0.0f);
                        }
                        p3(0.0f);
                        jr8 jr8Var = this.c0;
                        if (jr8Var != null) {
                            jr8Var.setParentExpanded(0.0f);
                        }
                    }
                    this.G1 = false;
                    F1();
                    if (this.I1) {
                        K1(true);
                    }
                }
                if (!this.r5) {
                    this.r5 = true;
                    this.Y4 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().j(this.T4);
            sb sbVar = this.U;
            if (sbVar != null && sbVar.getVisibility() == 0) {
                this.U.setVisibility(8);
                this.U.setBackground(null);
            }
        }
        this.H1 = false;
        H1();
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
        uo8 uo8Var;
        ImageView imageView;
        pl8 pl8Var;
        super.onTransitionAnimationStart(z, z2);
        this.i6 = z;
        if (z && (pl8Var = this.a0) != null) {
            ArrayList arrayList = pl8Var.a;
            if (pl8Var.F == 6) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ml8 ml8Var = (ml8) arrayList.get(i);
                    oy8 oy8Var = ml8Var.k;
                    if (oy8Var != null) {
                        if (ml8Var.a == 15) {
                            oy8Var.H(14);
                        } else {
                            oy8Var.H(0);
                        }
                        ml8Var.k.start();
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
                    float[] fArr = this.f6;
                    if (fArr == null) {
                        fArr = new float[14];
                        this.f6 = fArr;
                    }
                    this.F1 = this.Q1;
                    fArr[0] = this.Y.getScaleX();
                    this.f6[1] = this.Y.getTranslationX();
                    this.f6[2] = this.Y.getTranslationY();
                    pl8 pl8Var2 = this.a0;
                    if (pl8Var2 != null) {
                        this.f6[3] = pl8Var2.getAlpha();
                    }
                    vq8 vq8Var = this.w0;
                    if (vq8Var != null) {
                        float[] fArr2 = this.f6;
                        fArr2[4] = vq8Var.e;
                        fArr2[5] = vq8Var.f;
                    }
                    if (this.F6 != null) {
                        this.f6[6] = uo8Var.getAlpha();
                    }
                    this.f6[7] = this.f.getScaleX();
                    this.f6[8] = this.f.getTranslationY();
                    this.f6[9] = this.r.getTranslationY();
                    this.f6[10] = this.f.getLayoutParams().width;
                    float[] fArr3 = this.f6;
                    fArr3[11] = this.d2;
                    fArr3[12] = this.f.getTranslationX();
                    this.f6[13] = this.r.getTranslationX();
                    je5 je5Var = this.H6;
                    if (je5Var != null) {
                        je5Var.f(true);
                    }
                }
            }
        }
        if (z) {
            if (this.r0 != null) {
                this.T4 = getNotificationCenter().q(new int[]{kk7.r, kk7.s, kk7.V, kk7.W, kk7.D0, kk7.t4}, this.T4, true);
            } else {
                this.T4 = getNotificationCenter().q(new int[]{kk7.r, kk7.s, kk7.V, kk7.W, kk7.t4}, this.T4, true);
            }
            if (!z2 && getParentActivity() != null) {
                this.d5 = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.H1 = true;
        H1();
    }

    public final boolean p2() {
        if (this.F2 != null) {
            return getMessagesController().k2(this.F2);
        }
        na7 messagesController = getMessagesController();
        TLRPC.UserFull userFull = this.w2;
        messagesController.getClass();
        return na7.K2(userFull);
    }

    public final void p3(float f) {
        this.P5 = f;
        ep8 ep8Var = this.O5;
        if (ep8Var != null) {
            ep8Var.b(f);
        }
        V3();
    }

    public final boolean q2(o72 o72Var) {
        String str;
        if (!(this.m5 instanceof mu1) && (o72Var.getSubtitleTextView() instanceof jia)) {
            CharSequence text = ((jia) o72Var.getSubtitleTextView()).getText();
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

    public final void q3(TLRPC.ChatFull chatFull) {
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
        vn8 vn8Var = this.O;
        if (vn8Var != null) {
            vn8Var.setChatInfo(this.v2);
        }
        ym8 ym8Var = this.o0;
        if (ym8Var != null && !this.q1) {
            ym8Var.setChatInfo(this.v2);
        }
        an8 an8Var = this.v0;
        if (an8Var != null && (chatFull3 = this.v2) != null) {
            an8Var.setStories(chatFull3.stories);
        }
        vq8 vq8Var = this.w0;
        if (vq8Var != null) {
            vq8Var.a();
        }
        xm8 xm8Var = this.f0;
        if (xm8Var != null) {
            xm8Var.setHasStories(M2());
        }
        T1();
        if (this.f1 != 0) {
            boolean z2 = w01.a;
            if (!getMessagesController().G3() && (chatFull2 = this.v2) != null && chatFull2.stargifts_available) {
                z = true;
            } else {
                z = false;
            }
            this.T0.Q(38, z);
            pl8 pl8Var = this.a0;
            if (pl8Var != null) {
                pl8Var.o(3, z);
            }
        }
    }

    @Override
    public final boolean r(cj3 cj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, qvb qvbVar) {
        long j = ((zc7) arrayList.get(0)).a;
        Bundle l = ir2.l("scrollToTopOnResume", true);
        if (cf3.B(j)) {
            l.putInt("enc_id", (int) (4294967295L & j));
        } else if (cf3.D(j)) {
            l.putLong("user_id", j);
        } else if (cf3.y(j)) {
            l.putLong("chat_id", -j);
        }
        if (!getMessagesController().A(l, cj3Var, null, null)) {
            return false;
        }
        kk7 notificationCenter = getNotificationCenter();
        int i3 = kk7.s;
        notificationCenter.n(this, i3);
        getNotificationCenter().k(i3, new Object[0]);
        presentFragment(new mu1(l), true);
        removeSelfFromStack();
        getSendMessagesHelper().q0(x3a.g(getMessagesController().V1(Long.valueOf(this.e1)), j, null, null, null, null, z2, i, i2));
        if (!TextUtils.isEmpty(charSequence)) {
            z3a.Z(j5.a(this.currentAccount), charSequence, j, 0L, z2, i, i2);
        }
        return true;
    }

    public final boolean r2() {
        if (this.r0 != null && !this.s1) {
            return true;
        }
        return false;
    }

    public final void r3(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.Z != null && (tL_emojiStatusCollectible2 = this.K6) != tL_emojiStatusCollectible) {
            if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
                this.K6 = tL_emojiStatusCollectible;
                je5 je5Var = this.H6;
                if (je5Var != null) {
                    je5Var.f(true);
                }
                if (tL_emojiStatusCollectible != null && !TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                    this.J6 = null;
                    this.H6 = new je5(getParentActivity(), 3);
                    this.I6 = bkb.v(tL_emojiStatusCollectible.center_color | (-16777216), bkb.p1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
                    this.H6.setPadding(gl.L(4.0f), 0, gl.L(4.0f), gl.L(2.0f));
                    je5 je5Var2 = this.H6;
                    int p1 = bkb.p1(0.5f, tL_emojiStatusCollectible.text_color | (-16777216));
                    je5Var2.M0 = true;
                    je5Var2.U0 = System.currentTimeMillis();
                    je5Var2.N0 = new Path();
                    je5Var2.O0 = gl.N(0.66f) / 2.0f;
                    je5Var2.P0 = new Paint(1);
                    je5Var2.Q0 = new Paint(1);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, gl.L(64.0f), 0.0f, new int[]{bkb.p1(0.0f, p1), bkb.p1(1.0f, p1), bkb.p1(0.0f, p1)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    je5Var2.T0 = linearGradient;
                    je5Var2.Q0.setShader(linearGradient);
                    je5Var2.R0 = new LinearGradient(0.0f, 0.0f, gl.L(64.0f), 0.0f, new int[]{bkb.p1(0.0f, p1), bkb.p1(0.5f, p1), bkb.p1(0.0f, p1)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    je5Var2.S0 = new Matrix();
                    je5Var2.P0.setShader(je5Var2.R0);
                    je5Var2.Q0.setStyle(Paint.Style.STROKE);
                    je5Var2.Q0.setStrokeJoin(Paint.Join.ROUND);
                    je5Var2.Q0.setStrokeCap(Paint.Cap.ROUND);
                    je5Var2.Q0.setStrokeWidth(gl.N(0.66f));
                    this.Z.addView(this.H6, nme.c(24.0f, -1));
                    this.H6.u(9.33f);
                    je5 je5Var3 = this.H6;
                    Typeface o = gl.o();
                    je5Var3.I.x(o);
                    je5Var3.K.setTypeface(o);
                    this.H6.t(tL_emojiStatusCollectible.title);
                    je5 je5Var4 = this.H6;
                    je5Var4.d = -1L;
                    je5Var4.m(5.66f, 2.66f, 5.66f, 2.66f);
                    je5 je5Var5 = this.H6;
                    je5Var5.getClass();
                    je5Var5.E = gl.N(4.0f);
                    je5Var5.F = gl.N(2.66f);
                    this.H6.r();
                    this.H6.q(16.0f);
                    this.H6.v();
                    this.H6.setOnClickListener(new hm8(this, tL_emojiStatusCollectible.slug, (byte) 1));
                    if (this.Q1 < gl.L(82.0f)) {
                        this.J6 = Boolean.FALSE;
                        this.H6.setAlpha(0.0f);
                    }
                    J3();
                    je5 je5Var6 = this.H6;
                    Objects.requireNonNull(je5Var6);
                    gl.d3(new hh(je5Var6, (byte) 7), 6000L);
                }
            }
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        wl5 wl5Var = this.r0;
        if (wl5Var != null) {
            wl5Var.f = bundle.getString("path");
        }
    }

    public final void s2() {
        boolean z;
        TLRPC.Document document;
        if (this.b0 == null) {
            if (MediaController.w().R0 != null && MediaController.w().R0.a == this.currentAccount && MediaController.w().R0.b == a()) {
                this.b0 = MediaController.w().R0;
            } else {
                ia7 ia7Var = new ia7(this.currentAccount, a());
                this.b0 = ia7Var;
                TLRPC.UserFull userFull = this.w2;
                if (userFull != null && (document = userFull.saved_music) != null) {
                    ArrayList arrayList = ia7Var.c;
                    arrayList.clear();
                    ia7Var.b();
                    arrayList.add(0, ia7Var.d(document));
                }
            }
        }
        if (!this.b0.c.isEmpty()) {
            if (MediaController.w().R0 == this.b0 && MediaController.w().D((k27) this.b0.c.get(0))) {
                z = true;
            } else {
                MediaController.w().j();
                z = false;
            }
            MediaController.w().R0 = this.b0;
            MediaController.w().S0.clear();
            MediaController.w().S0.addAll(this.b0.c);
            if (!z) {
                MediaController.w().R((k27) this.b0.c.get(0));
            }
            showDialog(new i20(getParentActivity(), this.A0));
        }
    }

    public final void s3(boolean z) {
        Drawable t = this.f0.getImageReceiver().t();
        String str = null;
        if (t instanceof i9c) {
            this.f0.v(null, null, t);
        } else if (t instanceof km) {
            km kmVar = (km) t;
            this.f0.v(null, null, kmVar);
            if (z) {
                kmVar.f(this.f0);
            }
        } else {
            gl5 D = this.o0.D(0);
            if (D != null && D.p == 2) {
                str = "avatar";
            }
            this.f0.v(D, str, t);
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        wl5 wl5Var = this.r0;
        if (wl5Var != null && (str = wl5Var.f) != null) {
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
        H1();
        pha phaVar = this.simpleActionBar;
        if (phaVar != null) {
            phaVar.setAlpha(f);
        }
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null) {
            aVar.getBackButton().setTranslationX(gl.R1(j2(gl.L(2.0f), 2, this.actionBar.getBackButton()), gl.L(2.0f), f));
        }
        if (this.J1 == 2) {
            this.f0.setProgressToExpand(f);
            pl8 pl8Var = this.a0;
            if (pl8Var != null) {
                pl8Var.setParentExpanded(f);
            }
            p3(f);
            jr8 jr8Var = this.c0;
            if (jr8Var != null) {
                jr8Var.setParentExpanded(f);
            }
            hra hraVar = this.T;
            if (hraVar != null) {
                hraVar.setParentExpanded(f);
            }
            G3();
            Z3();
        }
        this.a.setAlpha(f);
        this.a.setTranslationX(gl.L(48.0f) - (gl.L(48.0f) * f));
        if (this.J1 != 2 || (v0 = this.s0) == 0) {
            if (this.e1 == 0) {
                if (hc2.S(this.currentAccount, this.f1)) {
                    boolean z = this.F2.megagroup;
                }
            }
            wjb wjbVar = this.A0;
            int[][] iArr = pb0.L;
            v0 = bkb.v0(bkb.Z6, wjbVar);
        }
        int i2 = this.c5;
        if (i2 == 0) {
            i2 = bkb.v0(bkb.r8, this.A0);
        }
        this.d1.setBackgroundColor(bm2.f(f, bm2.o(i2, 0), v0));
        rob robVar = this.m0;
        int f2 = bm2.f(f, i2, v0);
        robVar.k = true;
        robVar.b.setColor(f2);
        int i3 = -1;
        if (this.n6 != null) {
            v02 = -1;
        } else {
            if (this.e1 == 0) {
                if (hc2.S(this.currentAccount, this.f1)) {
                    boolean z2 = this.F2.megagroup;
                }
            }
            wjb wjbVar2 = this.A0;
            int[][] iArr2 = pb0.L;
            v02 = bkb.v0(bkb.f8, wjbVar2);
        }
        this.actionBar.H(bm2.f(this.T1, bkb.v0(bkb.u8, this.A0), v02), false);
        if (this.n6 == null) {
            i3 = bkb.v0(bkb.li, this.A0);
        }
        int v04 = bkb.v0(bkb.z8, this.A0);
        zr1 zr1Var = this.f;
        if (zr1Var != null && this.J1 != 2) {
            zr1Var.setTextColor(bm2.f(f, v04, i3));
        }
        boolean[] zArr = this.K0;
        if (zArr[0]) {
            v03 = bkb.v0(bkb.ri, this.A0);
        } else {
            if (this.e1 == 0) {
                if (hc2.S(this.currentAccount, this.f1)) {
                    boolean z3 = this.F2.megagroup;
                }
            }
            wjb wjbVar3 = this.A0;
            int[][] iArr3 = pb0.L;
            v03 = bkb.v0(bkb.g8, wjbVar3);
        }
        if (zArr[0]) {
            i = bkb.oa;
        } else {
            i = bkb.A8;
        }
        int v05 = bkb.v0(i, this.A0);
        zm8 zm8Var = this.r;
        if (zm8Var != null && this.J1 != 2) {
            zm8Var.setTextColor(bm2.f(f, v05, z1(v03, Boolean.valueOf(zArr[0]))));
        }
        this.Q1 = this.S1 * f;
        long j = this.e1;
        if (j == 0) {
            j = this.f1;
        }
        wjb wjbVar4 = this.A0;
        int[][] iArr4 = pb0.L;
        int v06 = bkb.v0(bkb.o8[pb0.d(j)], wjbVar4);
        long j2 = this.e1;
        if (j2 == 0) {
            j2 = this.f1;
        }
        int c = pb0.c(j2);
        if (v06 != c) {
            this.q0.g(bm2.f(f, c, v06));
            this.f0.invalidate();
        }
        int i4 = this.d5;
        if (i4 != 0) {
            setNavigationBarColor(bm2.f(f, i4, getNavigationBarColor()));
        }
        this.d1.invalidate();
        N2(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        eo8 eo8Var = this.j6;
        if (eo8Var != null) {
            eo8Var.invalidate();
        }
        if (a() > 0) {
            xm8 xm8Var = this.f0;
            if (xm8Var != null) {
                xm8Var.setProgressToStoriesInsets(this.T1);
            }
            an8 an8Var = this.v0;
            if (an8Var != null) {
                an8Var.setProgressToStoriesInsets(this.T1);
            }
            vq8 vq8Var = this.w0;
            if (vq8Var != null) {
                vq8Var.setProgressToStoriesInsets(this.T1);
            }
        }
    }

    @Override
    public final void setParentLayout(ui5 ui5Var) {
        super.setParentLayout(ui5Var);
        h24 h24Var = this.Y1;
        if (h24Var != null) {
            h24Var.g();
            this.Y1 = null;
        }
        if (ui5Var != null && ui5Var.getParentActivity() != null) {
            this.Y1 = new h24(ui5Var.getParentActivity().getWindow(), new ql8(this, (byte) 8));
        }
    }

    @Override
    public final boolean t(cj3 cj3Var) {
        return false;
    }

    public final void t2(float f, float f2, int i) {
        switch (i) {
            case 0:
                boolean z = this.q1;
                if (z) {
                    if (z) {
                        U1();
                        return;
                    }
                    return;
                } else if (this.e1 != 0) {
                    a3();
                    return;
                } else if (this.f1 != 0) {
                    if (hc2.c0(getMessagesController().K0(Long.valueOf(this.f1)))) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.f1);
                        if (getMessagesController().A(bundle, this, null, null)) {
                            presentFragment(new mu1(bundle), false);
                            return;
                        }
                        return;
                    } else if (!U1()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", this.f1);
                        if (getMessagesController().A(bundle2, this, null, null)) {
                            presentFragment(new mu1(bundle2), false);
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
                U2(this.a0, f, f2, true);
                return;
            case 2:
                b3();
                return;
            case 3:
                S2();
                return;
            case 4:
                V2();
                return;
            case 5:
            case 10:
            case 11:
                R2(false);
                return;
            case 6:
                R2(true);
                return;
            case 7:
                T2(true);
                return;
            case 8:
                b89.E0(a(), this);
                return;
            case 9:
                K2(false);
                return;
            case 12:
                getMessagesController().X3.edit().putBoolean("story_keep", true).apply();
                hd hdVar = new hd(3, this.A0, getParentActivity());
                hdVar.q(200L);
                na7.q1(this.currentAccount).M1().j(a(), new x15(this, hdVar, (byte) 20), true, this.A0);
                return;
            case 13:
                Q2(true);
                return;
            case 14:
                X2();
                return;
            case 15:
                TLRPC.User f3 = getUserConfig().f();
                if (f3 != null) {
                    cs5 I = cs5.I(this, this.a0);
                    I.w = false;
                    I.i = (byte) 3;
                    I.b(2131232325, k96.M0(2131746307, null), new v36(this, (byte) 25), false);
                    I.b(2131232108, k96.M0(2131746485, null), new mm8(f3, (byte) 0), false);
                    I.b(2131232121, k96.M0(2131746427, null), new v36(this, (byte) 26), false);
                    I.Z = true;
                    I.b0(f - gl.L(8.0f), this.a0.getMeasuredHeight() - gl.L(16.0f));
                    I.a0();
                    return;
                }
                return;
            case 16:
                presentFragment(new UserInfoActivity());
                return;
            case 17:
                presentFragment(new d8a(null));
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean u() {
        return this.i6;
    }

    public final void u2(Context context, long j, TL_payments.connectedBotStarRef connectedbotstarref) {
        int i = this.currentAccount;
        if (connectedbotstarref == null) {
            eg1.I0(context, i, this.w2.starref_program, getUserConfig().e(), this.A0, false);
        } else {
            eg1.J0(context, i, connectedbotstarref, j, this.A0);
        }
    }

    @Override
    public final void v() {
        this.a.z0(0);
    }

    public final void v2(Boolean bool) {
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
            na7.q1(i).S(this.f5, j3);
        } else {
            na7.q1(i).d0(this.f5, this.e5, j3);
        }
        this.e5 = 0;
        Y3(false, false);
        t11 t11Var = new t11(getParentActivity(), this.A0);
        t11Var.d(2131623982, new String[0]);
        t11Var.b.setText(k96.M0(2131746211, null));
        u21.b0(this).b(t11Var, 1500).j();
    }

    public final void v3(co8 co8Var) {
        if (this.o5 == co8Var) {
            return;
        }
        this.o5 = co8Var;
        gl.d0(this.a, new dm8(this, (byte) 0));
    }

    public final void w2(ag2[] ag2VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = getMessagesController().m1(this.e1);
        tL_messages_reportReaction.peer = getMessagesController().h1(this.f5);
        tL_messages_reportReaction.id = this.e5;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reportReaction, new ce2((byte) 4));
        ag2 ag2Var = ag2VarArr[0];
        if (ag2Var != null && ag2Var.b()) {
            getMessagesController().b0(-this.f5, getMessagesController().V1(Long.valueOf(this.e1)));
        }
        this.e5 = 0;
        Y3(false, false);
        u21.b0(this).E(this.A0).j();
    }

    public final void w3(CharSequence charSequence) {
        this.c6 = charSequence;
        c4();
    }

    @Override
    public final boolean x() {
        return false;
    }

    public final void x2(Context context, long j, View view, int i, float f, float f2) {
        TLRPC.User V1;
        TLRPC.ChatParticipant chatParticipant;
        int L;
        int L2;
        ko8 ko8Var;
        if (getParentActivity() != null) {
            this.a.D0();
            if (i == this.T3) {
                TLRPC.User V12 = getMessagesController().V1(Long.valueOf(this.e1));
                TLRPC.UserFull userFull = this.w2;
                if (userFull != null && userFull.starref_program != null) {
                    long e = getUserConfig().e();
                    ct0.g(this.currentAccount).f(getParentActivity(), e, this.e1, new p0c(this, context, e, (byte) 7));
                } else if (V12 != null && V12.bot_can_edit) {
                    presentFragment(new bc(this.e1));
                }
            } else if (i == this.R3) {
                boolean z = !getMessagesController().n2(j, this.g1, null);
                getNotificationsController().G(j, this.g1, z);
                u21.A(this, z, null).j();
                O3();
                int i2 = this.R3;
                if (i2 >= 0 && (ko8Var = this.d) != null) {
                    ko8Var.g(i2);
                }
            } else if (i == this.a4) {
                TLRPC.User V13 = getMessagesController().V1(Long.valueOf(this.e1));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", V13.id);
                bundle.putBoolean("addContact", true);
                bundle.putString("phone", this.i5);
                bundle.putString("first_name_card", this.j5);
                bundle.putString("last_name_card", this.k5);
                it2 it2Var = new it2(bundle, this.A0);
                it2Var.P = new ul8(this, V13);
                presentFragment(it2Var);
            } else if (i == this.X3) {
                TextView textView = (TextView) ij.f0(getParentActivity(), k96.M0(2131751496, null), k96.M0(2131751580, null), k96.M0(2131751579, null), k96.M0(2131751586, null), new dm8(this, (byte) 1), this.A0, false).c(-1);
                if (textView != null) {
                    zkb.X(textView, bkb.p7, null);
                }
            } else if (i == this.Y3) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.A0, getParentActivity());
                String M0 = k96.M0(2131746018, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(2131746039, null);
                TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-this.f5));
                ag2[] ag2VarArr = new ag2[1];
                if (K0 != null && hc2.w(2, K0)) {
                    LinearLayout linearLayout = new LinearLayout(getParentActivity());
                    linearLayout.setOrientation(1);
                    ag2 ag2Var = new ag2(1, this.A0, getParentActivity());
                    ag2VarArr[0] = ag2Var;
                    ag2Var.setBackgroundDrawable(bkb.L0(false));
                    ag2VarArr[0].e(k96.M0(2131753724, null), "", true, false, false);
                    ag2 ag2Var2 = ag2VarArr[0];
                    if (k96.a0) {
                        L = gl.L(16.0f);
                    } else {
                        L = gl.L(8.0f);
                    }
                    if (k96.a0) {
                        L2 = gl.L(8.0f);
                    } else {
                        L2 = gl.L(16.0f);
                    }
                    ag2Var2.setPadding(L, 0, L2, 0);
                    linearLayout.addView(ag2VarArr[0], nme.o(-1, -2));
                    ag2VarArr[0].setOnClickListener(new yd(ag2VarArr, (byte) 4));
                    alertDialog$Builder.n(linearLayout);
                }
                alertDialog$Builder.j(k96.M0(2131746037, null), new dx6(this, ag2VarArr, (byte) 27));
                alertDialog$Builder.g(k96.M0(2131752577, null), new sc8((byte) 2));
                TextView textView2 = (TextView) alertDialog$Builder.o().c(-1);
                if (textView2 != null) {
                    zkb.X(textView2, bkb.p7, null);
                }
            } else if (i == this.u4) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("chat_id", (int) (this.i1 & 4294967295L));
                presentFragment(new org.telegram.ui.ActionBar.d(bundle2));
            } else if (i == this.t4) {
                showDialog(ij.S(getParentActivity(), this.E2, this.A0).a);
            } else if (i == this.O3) {
                U2(view, f, f2, false);
            } else if (i == this.O4) {
                getMessagesController().l5(null, this.e1);
                if (u21.a(this)) {
                    u21.d(this, false).j();
                }
            } else if (i == this.b4) {
                kq0.a(this, this.currentAccount, getMessagesController().V1(Long.valueOf(this.e1)));
            } else if (i == this.d4) {
                try {
                    this.actionBar.getActionBarMenuOnItemClick().b(9);
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
            } else if (i == this.V3) {
                X2();
            } else if (i == this.W3) {
                b89.E0(a(), this);
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
                Y2();
            } else if (i == this.M3) {
                f3(f, f2, i, view);
            } else if (i == this.o4) {
                if (this.F2 != null) {
                    showDialog(new eo2(this, this.F2.linked_community_id, null, null));
                } else if (this.e1 != 0 && (V1 = getMessagesController().V1(Long.valueOf(this.e1))) != null) {
                    showDialog(new eo2(this, V1.linked_community_id, null, null));
                }
            } else if (i == this.J3) {
                if (this.v2.location instanceof TLRPC.TL_channelLocation) {
                    qa6 qa6Var = new qa6(5);
                    qa6Var.m0 = -this.f1;
                    qa6Var.H0 = (TLRPC.TL_channelLocation) this.v2.location;
                    presentFragment(qa6Var);
                }
            } else if (i == this.P4) {
                T2(false);
            } else if (i == this.A4) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("chat_id", this.f1);
                bundle3.putInt("type", 2);
                kf2 kf2Var = new kf2(bundle3);
                kf2Var.A0(this.v2);
                presentFragment(kf2Var);
            } else if (i == this.B4) {
                presentFragment(new hu0(this.f1));
            } else if (i == this.C4) {
                Bundle bundle4 = new Bundle();
                bundle4.putLong("chat_id", this.f1);
                bundle4.putInt("type", 1);
                kf2 kf2Var2 = new kf2(bundle4);
                kf2Var2.A0(this.v2);
                presentFragment(kf2Var2);
            } else if (i == this.D4) {
                this.S0.performClick();
            } else if (i == this.E4) {
                presentFragment(new ss0(0, this.e1));
            } else if (i == this.F4) {
                presentFragment(new ss0(1, this.e1));
            } else if (i == this.G4) {
                Bundle bundle5 = new Bundle();
                bundle5.putLong("chat_id", this.f1);
                bundle5.putBoolean("start_from_monetization", true);
                presentFragment(new uxa(bundle5));
            } else if (i == this.J4) {
                Bundle bundle6 = new Bundle();
                bundle6.putLong("chat_id", this.f1);
                bundle6.putInt("type", 0);
                kf2 kf2Var3 = new kf2(bundle6);
                kf2Var3.A0(this.v2);
                presentFragment(kf2Var3);
            } else if (i == this.g3) {
                presentFragment(new NotificationsSettingsActivity());
            } else if (i == this.i3) {
                PrivacySettingsActivity privacySettingsActivity = new PrivacySettingsActivity();
                TL_account.TL_password tL_password = this.I2;
                privacySettingsActivity.d = tL_password;
                if (tL_password != null) {
                    privacySettingsActivity.A0();
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
                presentFragment(new m66());
            } else if (i == this.o3) {
                presentFragment(new SessionsActivity(0));
            } else if (i == this.r3) {
                showDialog(ij.R(this, this.A0));
            } else if (i == this.s3) {
                d01.t(getParentActivity(), k96.M0(2131743999, null));
            } else if (i == this.t3) {
                d01.t(getParentActivity(), k96.M0(2131746590, null));
            } else if (i == this.w3) {
                l3(getParentActivity(), false);
            } else if (i == this.x3) {
                l3(getParentActivity(), true);
            } else if (i == this.y3) {
                fa4.a();
            } else if (i == this.z3) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, this.A0, getParentActivity());
                    String M02 = k96.M0(2131754117, null);
                    hd hdVar2 = alertDialog$Builder2.a;
                    hdVar2.U = M02;
                    hdVar2.S = k96.M0(2131689472, null);
                    alertDialog$Builder2.j(k96.M0(2131747638, null), new ql8(this, (byte) 9));
                    alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                    showDialog(hdVar2);
                }
            } else if (i == this.h3) {
                presentFragment(new LanguageSelectActivity());
            } else if (i == this.W2) {
                presentFragment(new me1(null));
            } else if (i == this.X2) {
                presentFragment(new UserInfoActivity());
            } else if (i == this.U2) {
                presentFragment(new u8(3));
            } else if (i == this.P2) {
                X2();
            } else if (i == this.f4) {
                presentFragment(new PremiumPreviewFragment(0, "settings"));
            } else if (i == this.g4) {
                presentFragment(new jva());
            } else if (i == this.h4) {
                presentFragment(new ydb());
            } else if (i == this.i4) {
                presentFragment(new PremiumPreviewFragment(1, "settings"));
            } else if (i == this.j4) {
                xu4.f1(false, oj0.a(this.currentAccount).b());
            } else if (i == this.botPermissionLocation) {
                tq0 tq0Var = this.t2;
                if (tq0Var != null) {
                    tq0Var.k(!tq0Var.f(), new ll8(this, view, (byte) 7));
                }
            } else if (i == this.botPermissionBiometry) {
                uo0 uo0Var = this.u2;
                if (uo0Var != null) {
                    uo0Var.f = true;
                    uo0Var.e = !uo0Var.e;
                    uo0Var.i();
                    ((wgb) view).setChecked(this.u2.e);
                }
            } else if (i == this.botPermissionEmojiStatus) {
                wgb wgbVar = (wgb) view;
                wgbVar.setChecked(!wgbVar.d());
                if (this.r4 > 0) {
                    getConnectionsManager().cancelRequest(this.r4, true);
                }
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                toggleuseremojistatuspermission.bot = getMessagesController().m1(this.e1);
                boolean d = wgbVar.d();
                toggleuseremojistatuspermission.enabled = d;
                TLRPC.UserFull userFull2 = this.w2;
                if (userFull2 != null) {
                    userFull2.bot_can_manage_emoji_status = d;
                }
                int sendRequest = getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new hj7(this, r0, (byte) 12));
                this.r4 = sendRequest;
                int[] iArr = {sendRequest};
            } else if (i == this.P3) {
                this.R4 = !this.R4;
                i3();
                view.requestLayout();
                this.d.g(this.P3);
                int i3 = this.r6;
                if (i3 >= 0) {
                    this.c.g1(i3, this.s6 - this.a.getPaddingTop());
                }
            } else if (i == this.Q3) {
                c3(false);
            } else if (i == this.R2) {
                if (this.w2 != null) {
                    Bundle bundle7 = new Bundle();
                    bundle7.putLong("chat_id", this.w2.personal_channel_id);
                    presentFragment(new mu1(bundle7));
                }
            } else if (i == this.V2) {
                bp8 bp8Var = this.G6;
                if ((bp8Var == null || !bp8Var.a()) && !R1(i, view)) {
                    ghb ghbVar = (ghb) view;
                    if (ghbVar.d.getDrawable() != null) {
                        W2(ghbVar.getImageView());
                    }
                }
            } else if (i == this.I3) {
                Q1(i, view);
            } else {
                f3(f, f2, i, view);
            }
        }
    }

    public final void x3(int i) {
        boolean z;
        SharedPreferences c1 = na7.c1();
        if (!gl.O1()) {
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
            g4();
            if (c1.getBoolean("view_animations", true)) {
                this.J1 = i;
            } else if (i == 2) {
                this.n1 = true;
            }
        }
    }

    public final void y1() {
        org.telegram.ui.ActionBar.a aVar;
        int i;
        if (this.O != null && (aVar = this.actionBar) != null) {
            if (aVar.getOccupyStatusBar()) {
                i = gl.m;
            } else {
                i = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i;
            int[] iArr = nfa.t2;
            int x = ls6.x(6.666f, dg0.d(currentActionBarHeight - org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()), currentActionBarHeight);
            int c = dg0.c(i) + currentActionBarHeight + x;
            this.a6 = c;
            this.O.i1(x, c, dg0.c(this.P6), this.P6 + this.N6);
            this.b6 = gl.L(44.0f) + currentActionBarHeight;
            T3();
            G1();
        }
    }

    public final void y2(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.y2(int):void");
    }

    public final void y3(TLRPC.UserFull userFull, hp8 hp8Var, yo8 yo8Var) {
        boolean z;
        this.w2 = userFull;
        hra hraVar = this.T;
        if (hraVar != null) {
            hraVar.set(userFull.stars_rating);
        }
        an8 an8Var = this.v0;
        if (an8Var != null) {
            an8Var.setStories(this.w2.stories);
        }
        vq8 vq8Var = this.w0;
        if (vq8Var != null) {
            vq8Var.a();
        }
        xm8 xm8Var = this.f0;
        if (xm8Var != null) {
            xm8Var.setHasStories(M2());
        }
        vn8 vn8Var = this.O;
        if (vn8Var != null) {
            vn8Var.setUserInfo(this.w2);
        }
        hp8 hp8Var2 = this.x2;
        if (hp8Var2 == null) {
            this.x2 = hp8Var;
        } else {
            hp8Var = hp8Var2;
        }
        if (hp8Var == null) {
            hp8Var = new hp8(this.currentAccount);
            this.x2 = hp8Var;
        }
        v36 v36Var = new v36(this, (byte) 22);
        if (hp8Var.c) {
            v36Var.run();
        } else {
            hp8Var.h.add(v36Var);
        }
        this.x2.b(this.w2);
        yo8 yo8Var2 = this.z2;
        if (yo8Var2 == null) {
            this.z2 = yo8Var;
        } else {
            yo8Var = yo8Var2;
        }
        boolean z2 = true;
        if (yo8Var == null) {
            yo8Var = yo8.c(this.currentAccount, this.w2, yo8Var);
            this.z2 = yo8Var;
            if (yo8Var != null) {
                z = true;
            } else {
                z = false;
            }
            this.y2 = z;
        }
        if (yo8Var != null) {
            v36 v36Var2 = new v36(this, (byte) 18);
            if (yo8Var.b) {
                v36Var2.run();
            } else {
                yo8Var.h.add(v36Var2);
            }
        }
        xha xhaVar = this.T0;
        if (xhaVar != null) {
            TL_account.RequirementToContact J2 = getMessagesController().J2(this.e1);
            if (J2 != null && !(J2 instanceof TL_account.requirementToContactEmpty)) {
                z2 = false;
            }
            xhaVar.Q(20, z2);
            boolean n2 = n2();
            xha xhaVar2 = this.T0;
            if (n2) {
                xhaVar2.S(44);
            } else {
                xhaVar2.u(44);
            }
        }
    }

    public final int z1(int i, Boolean bool) {
        int i2;
        if (this.n6 != null) {
            int v0 = bkb.v0(bkb.r8, this.A0);
            int f = bm2.f(0.5f, this.n6.m(bkb.I.o()), this.n6.n(bkb.I.o()));
            if (!bkb.c1(v0)) {
                if (bool != null && !bool.booleanValue()) {
                    return bkb.a(-0.2f, 0.2f, bkb.p1(0.7f, f));
                }
                return f;
            }
            boolean o = bkb.I.o();
            if (bool != null && !bool.booleanValue()) {
                i2 = bkb.p1(0.7f, f);
            } else {
                i2 = f;
            }
            return bkb.C(o, v0, f, i, i2);
        }
        return i;
    }

    public final void z2() {
        TLRPC.Document e;
        m21 h;
        if (this.K2 == null) {
            int i = 0;
            if (this.q1 && !getMessagesController().F3()) {
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
                    if (j != 0 && (e = vl.e(this.currentAccount, j)) != null && (h = u21.b0(this).h(e, 1, new dm8(this, (byte) 2))) != null) {
                        h.j();
                    }
                }
            } else if (S1()) {
            } else {
                Z2(false);
            }
        }
    }

    public final void z3(View view, float f) {
        boolean z;
        int i;
        if (this.p2) {
            if (this.q2) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
                if (this.actionBar.getOccupyStatusBar()) {
                    i = gl.m;
                } else {
                    i = 0;
                }
                this.a.x0(0, ((view.getTop() - this.a.getMeasuredWidth()) - W1()) + currentActionBarHeight + i, s33.h);
                return;
            }
            this.a.x0(0, view.getTop() - c2(), s33.h);
            return;
        }
        if (W1() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            float f2 = this.Q1;
            if (f2 > 0.0f && ((f2 < c2() * 0.6f || f < -1000.0f) && this.Q1 > W1() * 0.6f)) {
                this.a.x0(0, (int) (this.Q1 - W1()), s33.h);
                return;
            }
        }
        if (z) {
            float f3 = this.Q1;
            if (f3 > 0.0f && f3 < W1() * 0.6f) {
                this.a.x0(0, (int) this.Q1, s33.h);
                return;
            }
        }
        if (!z) {
            float f4 = this.Q1;
            if (f4 > 0.0f && f < -1000.0f) {
                this.a.x0(0, (int) f4, s33.h);
                return;
            }
        }
        if (this.Q1 > 0.0f) {
            this.a.x0(0, view.getTop() - c2(), s33.h);
        }
    }

    @Override
    public final void T() {
    }

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }
}

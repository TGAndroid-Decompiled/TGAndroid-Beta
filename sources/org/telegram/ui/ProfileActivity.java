package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
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
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.util.Property;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotchInfoUtils;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.UndoView;

public class ProfileActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, zx, org.telegram.ui.Components.au0, org.telegram.ui.Components.i40, org.telegram.ui.Components.ss0, pg0 {
    public final Drawable[] A;
    public int A0;
    public long A1;
    public TLRPC.Chat A2;
    public int A3;
    public int A4;
    public float A5;
    public Long B;
    public boolean B0;
    public float B1;
    public TL_bots.BotInfo B2;
    public int B3;
    public int B4;
    public boolean B5;
    public final org.telegram.ui.Components.i5[] C;
    public boolean C0;
    public boolean C1;
    public TLRPC.ChannelParticipant C2;
    public int C3;
    public int C4;
    public final xy0 C5;
    public final org.telegram.ui.Components.i5[] D;
    public boolean D0;
    public boolean D1;
    public TL_account.TL_password D2;
    public int D3;
    public int D4;
    public boolean D5;
    public final Drawable[] E;
    public boolean E0;
    public boolean E1;
    public TLRPC.FileLocation E2;
    public int E3;
    public boolean E4;
    public final yy0 E5;
    public final org.telegram.ui.Components.dr[] F;
    public final boolean[] F0;
    public int F1;
    public TLRPC.FileLocation F2;
    public int F3;
    public int F4;
    public float[] F5;
    public final org.telegram.ui.Components.dr[] G;
    public boolean G0;
    public boolean G1;
    public ImageLocation G2;
    public int G3;
    public int G4;
    public float G5;
    public org.telegram.ui.Components.ll0 H;
    public boolean H0;
    public boolean H1;
    public final Rect H2;
    public int H3;
    public int H4;
    public float H5;
    public UndoView I;
    public boolean I0;
    public boolean I1;
    public org.telegram.ui.Cells.l8 I2;
    public int I3;
    public int I4;
    public boolean I5;
    public wz0 J;
    public boolean J0;
    public boolean J1;
    public int J2;
    public int J3;
    public boolean J4;
    public qz0 J5;
    public hz0 K;
    public ImageView K0;
    public boolean K1;
    public int K2;
    public int K3;
    public boolean K4;
    public float K5;
    public org.telegram.ui.Components.iw0 L;
    public org.telegram.ui.ActionBar.v0 L0;
    public boolean L1;
    public int L2;
    public int L3;
    public int L4;
    public float L5;
    public boolean M;
    public org.telegram.ui.ActionBar.v0 M0;
    public float M1;
    public int M2;
    public int M3;
    public final ArrayList M4;
    public MessagesController.PeerColor M5;
    public org.telegram.ui.Components.zt0 N;
    public org.telegram.ui.ActionBar.v0 N0;
    public float N1;
    public int N2;
    public int N3;
    public final ArrayList N4;
    public final SparseIntArray N5;
    public boolean O;
    public org.telegram.ui.ActionBar.v0 O0;
    public float O1;
    public int O2;
    public int O3;
    public int O4;
    public int O5;
    public org.telegram.ui.Components.sv0 P;
    public org.telegram.ui.ActionBar.v0 P0;
    public int P1;
    public int P2;
    public int P3;
    public boolean P4;
    public AnimatorSet P5;
    public aj0 Q;
    public org.telegram.ui.ActionBar.v0 Q0;
    public float Q1;
    public int Q2;
    public int Q3;
    public boolean Q4;
    public int Q5;
    public org.telegram.ui.Components.oi0 R;
    public org.telegram.ui.ActionBar.f1 R0;
    public ValueAnimator R1;
    public int R2;
    public int R3;
    public qy0 R4;
    public int R5;
    public org.telegram.ui.Components.oi0 S;
    public org.telegram.ui.ActionBar.f1 S0;
    public boolean S1;
    public int S2;
    public int S3;
    public View S4;
    public boolean S5;
    public org.telegram.ui.Components.x30 T;
    public org.telegram.ui.ActionBar.f1 T0;
    public FlagSecureReason T1;
    public int T2;
    public int T3;
    public int T4;
    public boolean T5;
    public n0 U;
    public ImageView U0;
    public final HashMap U1;
    public int U2;
    public int U3;
    public int U4;
    public float U5;
    public ag.y1 V;
    public org.telegram.ui.ActionBar.f1 V0;
    public float V1;
    public int V2;
    public int V3;
    public int V4;
    public float V5;
    public org.telegram.ui.Components.rg0 W;
    public org.telegram.ui.Components.g8 W0;
    public float W1;
    public int W2;
    public int W3;
    public long W4;
    public float W5;
    public MessagesController.SavedMusicList X;
    public float X0;
    public float X1;
    public int X2;
    public int X3;
    public boolean X4;
    public h01 X5;
    public org.telegram.ui.Components.jh0 Y;
    public int Y0;
    public float Y1;
    public int Y2;
    public int Y3;
    public boolean Y4;
    public n01 Y5;
    public org.telegram.ui.Cells.o Z;
    public j01 Z0;
    public float Z1;
    public int Z2;
    public int Z3;
    public String Z4;
    public lh.w3 Z5;

    public by0 f35921a;

    public ly0 f35922a0;

    public long f35923a1;
    public float a2;
    public int a3;

    public int f35924a4;

    public String f35925a5;

    public int f35926a6;

    public org.telegram.ui.Components.zk0 f35927b;

    public AnimatorSet f35928b0;

    public long f35929b1;

    public float f35930b2;

    public int f35931b3;

    public int f35932b4;

    public String f35933b5;

    public Boolean f35934b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;

    public dy0 f35935c;

    public org.telegram.ui.Cells.w3 f35936c0;

    public long f35937c1;

    public float f35938c2;

    public int f35939c3;

    public int f35940c4;

    public org.telegram.ui.Components.ng f35941c5;

    public TLRPC.TL_emojiStatusCollectible f35942c6;
    public vz0 d;

    public ImageView f35943d0;

    public boolean f35944d1;

    public float f35945d2;

    public int f35946d3;

    public int f35947d4;

    public final HashSet f35948d5;

    public int f35949d6;

    public g01 f35950e;

    public ImageView f35951e0;

    public long f35952e1;

    public float f35953e2;

    public int f35954e3;

    public int f35955e4;

    public CharacterStyle f35956e5;

    public boolean f35957e6;

    public final org.telegram.ui.ActionBar.h5[] f35958f;

    public ImageView f35959f0;

    public boolean f35960f1;

    public ValueAnimator f35961f2;

    public int f35962f3;

    public int f35963f4;

    public final org.telegram.ui.Cells.b2 f35964f5;

    public int f35965f6;

    public ImageView f35966g0;

    public boolean f35967g1;

    public float f35968g2;

    public int f35969g3;

    public int f35970g4;

    public final wy0 f35971g5;

    public int f35972g6;
    public String h;

    public org.telegram.ui.Components.c11 f35973h0;

    public boolean f35974h1;

    public float f35975h2;

    public int f35976h3;

    public int f35977h4;

    public boolean f35978h5;

    public int f35979h6;

    public org.telegram.ui.Components.tg0 f35980i0;

    public long f35981i1;

    public final float[] f35982i2;

    public int f35983i3;

    public int f35984i4;

    public fz0 f35985i5;

    public final jg.e f35986i6;

    public my0 f35987j0;

    public boolean f35988j1;

    public boolean f35989j2;

    public int f35990j3;

    public int f35991j4;

    public float f35992j5;

    public final og.d f35993j6;

    public yz0 f35994k0;

    public boolean f35995k1;

    public boolean f35996k2;

    public int f35997k3;

    public int f35998k4;

    public float f35999k5;

    public final jg.a f36000k6;

    public org.telegram.ui.Components.y8 f36001l0;
    public boolean l1;

    public boolean f36002l2;

    public int f36003l3;

    public int f36004l4;

    public boolean f36005l5;

    public final og.b f36006l6;
    public org.telegram.ui.Components.j40 m0;

    public boolean f36007m1;

    public final Paint f36008m2;

    public int f36009m3;

    public int f36010m4;

    public boolean f36011m5;

    public final jg.a f36012m6;

    public String f36013n;

    public int f36014n0;

    public boolean f36015n1;

    public boolean f36016n2;

    public int f36017n3;

    public int f36018n4;

    public ImageReceiver f36019n5;

    public qg.j f36020n6;

    public org.telegram.ui.Components.c11 f36021o0;

    public boolean f36022o1;

    public nh.t0 f36023o2;

    public int f36024o3;

    public int f36025o4;

    public FrameLayout f36026o5;

    public qx0 f36027o6;

    public org.telegram.ui.Components.gh0 f36028p0;

    public boolean f36029p1;

    public nh.q f36030p2;

    public int f36031p3;

    public int f36032p4;

    public FrameLayout[] f36033p5;
    public final ArrayList p6;

    public oy0 f36034q0;

    public int f36035q1;

    public TLRPC.ChatFull f36036q2;

    public int f36037q3;

    public int f36038q4;

    public SpannableStringBuilder f36039q5;
    public final RectF q6;

    public final org.telegram.ui.ActionBar.h5[] f36040r;

    public hh.v0 f36041r0;

    public boolean f36042r1;

    public TLRPC.UserFull f36043r2;

    public int f36044r3;

    public int f36045r4;

    public SpannableStringBuilder f36046r5;

    public final RectF f36047r6;

    public org.telegram.ui.Components.on0 f36048s;

    public View f36049s0;

    public boolean f36050s1;

    public org.telegram.ui.Cells.c6 f36051s2;

    public int f36052s3;

    public int f36053s4;

    public lh.d[] f36054s5;

    public final org.telegram.ui.Components.u40 f36055t0;

    public boolean f36056t1;

    public boolean f36057t2;

    public int f36058t3;

    public int f36059t4;

    public org.telegram.messenger.t8 f36060t5;

    public final Paint f36061u0;

    public int f36062u1;

    public k01 f36063u2;

    public int f36064u3;

    public int f36065u4;

    public FrameLayout f36066u5;
    public org.telegram.ui.Components.ri0 v;

    public org.telegram.ui.ActionBar.c6 f36067v0;

    public boolean f36068v1;

    public CharSequence f36069v2;

    public int f36070v3;
    public int v4;

    public lh.d f36071v5;

    public AnimatorSet f36072w;

    public int f36073w0;

    public boolean f36074w1;

    public long f36075w2;

    public int f36076w3;

    public int f36077w4;

    public final ud.a f36078w5;

    public Drawable f36079x;

    public ImageLocation f36080x0;

    public boolean f36081x1;

    public int f36082x2;

    public int f36083x3;

    public int f36084x4;

    public sy0 f36085x5;

    public final Drawable[] f36086y;

    public int f36087y0;

    public a0.h f36088y1;

    public ArrayList f36089y2;

    public int f36090y3;

    public int f36091y4;

    public AnimatorSet f36092y5;

    public int f36093z0;

    public boolean f36094z1;

    public TLRPC.EncryptedChat f36095z2;

    public int f36096z3;

    public int f36097z4;

    public AnimatorSet f36098z5;

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }

    public static void B0(ProfileActivity profileActivity) {
        RectF rectF = profileActivity.f36047r6;
        jg.e eVar = profileActivity.f35986i6;
        if (Build.VERSION.SDK_INT < 31 || eVar == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (profileActivity.fragmentView.getMeasuredHeight() - profileActivity.f35979h6) - AndroidUtilities.dp(8.0f);
        int iDp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        profileActivity.q6.set(0.0f, -iDp, profileActivity.fragmentView.getMeasuredWidth(), profileActivity.actionBar.getMeasuredHeight() + iDp);
        rectF.set(0.0f, iDp2, profileActivity.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        eVar.g(2, profileActivity.p6);
        eVar.e(profileActivity.f36027o6, profileActivity.fragmentView.getMeasuredWidth(), profileActivity.fragmentView.getMeasuredHeight());
    }

    public static void G0(ProfileActivity profileActivity, int i10) {
        boolean zW0 = org.telegram.ui.Components.hu0.w0(profileActivity.K.getClosestTab());
        if (i10 == profileActivity.f35949d6 && zW0 == profileActivity.f35957e6) {
            return;
        }
        profileActivity.f35949d6 = i10;
        profileActivity.f35957e6 = zW0;
        if (zW0) {
            if (i10 > 0) {
                profileActivity.f36054s5[0].g(LocaleController.formatPluralString("HideStoriesFromAlbum", i10, new Object[0]), true, true);
                return;
            } else {
                profileActivity.f36054s5[0].g(profileActivity.f36046r5, true, true);
                return;
            }
        }
        if (i10 > 0 || !MessagesController.getInstance(profileActivity.currentAccount).storiesEnabled()) {
            profileActivity.f36054s5[0].g(LocaleController.formatPluralString("ArchiveStories", i10, new Object[0]), true, true);
        } else {
            profileActivity.f36054s5[0].g(profileActivity.f36039q5, true, true);
        }
    }

    public static SpannableStringBuilder G3(int i10, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        az0 az0Var = new az0(9);
        az0Var.f40971n = str;
        if (az0Var.f40968c != null) {
            az0Var.f40968c = null;
            az0Var.a();
        }
        az0Var.f40970f = i10;
        spannableStringBuilder.setSpan(az0Var, 0, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static ValueAnimator H0(final ProfileActivity profileActivity, final boolean z10) {
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f36040r;
        if (z10) {
            AndroidUtilities.requestAdjustResize(profileActivity.getParentActivity(), profileActivity.classGuid);
            AndroidUtilities.setAdjustResizeToNothing(profileActivity.getParentActivity(), profileActivity.classGuid);
        }
        ValueAnimator valueAnimator = profileActivity.R1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            profileActivity.R1.cancel();
        }
        hh.v0 v0Var = profileActivity.f36041r0;
        if (v0Var != null) {
            v0Var.setActive(!z10);
        }
        int i10 = 0;
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(profileActivity.Q1, z10 ? 0.0f : 1.0f);
        final float f10 = profileActivity.M1;
        profileActivity.f35927b.setTranslationY(f10);
        profileActivity.f35927b.setVisibility(0);
        profileActivity.Q0.setVisibility(0);
        profileActivity.f35921a.setVisibility(0);
        profileActivity.k4(true);
        profileActivity.U.setVisibility(0);
        profileActivity.f35958f[1].setVisibility(0);
        h5VarArr[1].setVisibility(0);
        h5VarArr[3].setVisibility(0);
        profileActivity.actionBar.w(profileActivity.Q1 > 0.5f);
        int i11 = profileActivity.Q1 > 0.5f ? 0 : 8;
        org.telegram.ui.ActionBar.v0 v0Var2 = profileActivity.P0;
        if (v0Var2 != null) {
            v0Var2.setVisibility(i11);
        }
        profileActivity.Q0.setVisibility(i11);
        profileActivity.Q0.getSearchContainer().setVisibility(profileActivity.Q1 <= 0.5f ? 0 : 8);
        profileActivity.f35927b.setEmptyView(profileActivity.L);
        profileActivity.U.setClickable(false);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProfileActivity.l0(this.f45270a, valueAnimatorOfFloat, f10, z10);
            }
        });
        valueAnimatorOfFloat.addListener(new zy0(profileActivity, z10, i10));
        if (!z10) {
            profileActivity.Q4 = true;
            profileActivity.F4();
            AndroidUtilities.requestAdjustNothing(profileActivity.getParentActivity(), profileActivity.classGuid);
            profileActivity.L.setPreventMoving(true);
        }
        valueAnimatorOfFloat.setDuration(220L);
        valueAnimatorOfFloat.setInterpolator(org.telegram.ui.Components.er.f28122f);
        profileActivity.R1 = valueAnimatorOfFloat;
        return valueAnimatorOfFloat;
    }

    public static void H4(Activity activity, boolean z10) {
        if (activity == null) {
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(activity, 3, null);
        b2Var.f22747c0 = false;
        b2Var.show();
        Utilities.globalQueue.postRunnable(new op0(b2Var, z10, activity, 4));
    }

    public static void S0(ProfileActivity profileActivity, String str, StringBuilder sb2) {
        String[] supportedTypes;
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        try {
            int codecCount = MediaCodecList.getCodecCount();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < codecCount; i10++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                if (codecInfoAt != null && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    for (String str2 : supportedTypes) {
                        if (str2.equals(str)) {
                            (codecInfoAt.isEncoder() ? arrayList2 : arrayList).add(Integer.valueOf(i10));
                            break;
                        }
                    }
                }
            }
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                return;
            }
            sb2.append("\n");
            sb2.append(arrayList.size());
            sb2.append("+");
            sb2.append(arrayList2.size());
            sb2.append(" ");
            sb2.append(str.substring(6));
            sb2.append(" codecs:\n");
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i11 > 0) {
                    sb2.append("\n");
                }
                MediaCodecInfo codecInfoAt2 = MediaCodecList.getCodecInfoAt(((Integer) arrayList.get(i11)).intValue());
                sb2.append("{d} ");
                sb2.append(codecInfoAt2.getName());
                sb2.append(" (");
                if (Build.VERSION.SDK_INT >= 29) {
                    if (codecInfoAt2.isHardwareAccelerated()) {
                        sb2.append("gpu");
                    }
                    if (codecInfoAt2.isSoftwareOnly()) {
                        sb2.append("cpu");
                    }
                    if (codecInfoAt2.isVendor()) {
                        sb2.append(", v");
                    }
                }
                MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt2.getCapabilitiesForType(str);
                sb2.append("; mi=");
                sb2.append(capabilitiesForType.getMaxSupportedInstances());
                sb2.append(")");
            }
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (i12 > 0 || !arrayList.isEmpty()) {
                    sb2.append("\n");
                }
                MediaCodecInfo codecInfoAt3 = MediaCodecList.getCodecInfoAt(((Integer) arrayList2.get(i12)).intValue());
                sb2.append("{e} ");
                sb2.append(codecInfoAt3.getName());
                sb2.append(" (");
                if (Build.VERSION.SDK_INT >= 29) {
                    if (codecInfoAt3.isHardwareAccelerated()) {
                        sb2.append("gpu");
                    }
                    if (codecInfoAt3.isSoftwareOnly()) {
                        sb2.append("cpu");
                    }
                    if (codecInfoAt3.isVendor()) {
                        sb2.append(", v");
                    }
                }
                MediaCodecInfo.CodecCapabilities capabilitiesForType2 = codecInfoAt3.getCapabilitiesForType(str);
                sb2.append("; mi=");
                sb2.append(capabilitiesForType2.getMaxSupportedInstances());
                sb2.append(")");
            }
            sb2.append("\n");
        } catch (Exception unused) {
        }
    }

    public static void U(ProfileActivity profileActivity, TLRPC.User user, org.telegram.ui.ActionBar.h5 h5Var) {
        ImageLocation forDocument;
        String str;
        org.telegram.ui.Components.i5[] i5VarArr = profileActivity.C;
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            we.e.s(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        ag.y2 y2Var = new ag.y2(profileActivity, profileActivity.currentAccount, user, null, null, profileActivity.f36067v0);
        h5Var.getLocationOnScreen(new int[2]);
        y2Var.f724r0 = h5Var.f23468d0;
        y2Var.f725s0 = h5Var.f23470e0;
        y2Var.f728v0 = h5Var.getScaleX();
        y2Var.f726t0 = h5Var.getLeft();
        y2Var.f727u0 = h5Var.getTop();
        y2Var.f729w0 = h5Var;
        Drawable rightDrawable = h5Var.getRightDrawable();
        org.telegram.ui.Components.i5 i5Var = i5VarArr[1];
        if (rightDrawable == i5Var && i5Var != null) {
            Drawable drawable = i5Var.f29229f[0];
            if (drawable instanceof org.telegram.ui.Components.k5) {
                y2Var.f728v0 *= 0.98f;
                TLRPC.Document document = ((org.telegram.ui.Components.k5) drawable).f29956e;
                if (document != null) {
                    org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(profileActivity.getParentActivity());
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.f23215m6, 0.2f);
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                    if ("video/webm".equals(document.mime_type)) {
                        forDocument = ImageLocation.getForDocument(document);
                        if (svgThumb != null) {
                            svgThumb.overrideWidthAndHeight(512, 512);
                        }
                        str = "160_160_g";
                    } else {
                        if (svgThumb != null && MessageObject.isAnimatedStickerDocument(document, false)) {
                            svgThumb.overrideWidthAndHeight(512, 512);
                        }
                        forDocument = ImageLocation.getForDocument(document);
                        str = "160_160";
                    }
                    n9Var.setLayerNum(7);
                    n9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                    n9Var.l(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                    if (((org.telegram.ui.Components.k5) i5VarArr[1].f29229f[0]).c()) {
                        n9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23373v6, profileActivity.f36067v0), PorterDuff.Mode.SRC_IN));
                        y2Var.f731y0 = MessageObject.getInputStickerSet(document);
                    } else {
                        y2Var.f731y0 = MessageObject.getInputStickerSet(document);
                    }
                    y2Var.f730x0 = n9Var;
                    y2Var.A0 = true;
                }
            }
        }
        profileActivity.showDialog(y2Var);
    }

    public static void V(ProfileActivity profileActivity) {
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f36040r;
        by0 by0Var = profileActivity.f35921a;
        if (by0Var != null) {
            int childCount = by0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = profileActivity.f35921a.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.sa) {
                    ((org.telegram.ui.Cells.sa) childAt).j(0);
                }
            }
            profileActivity.f35921a.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f22999a7, profileActivity.f36067v0));
        }
        if (!profileActivity.f36002l2) {
            org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[1];
            if (h5Var != null) {
                Object tag = h5Var.getTag();
                for (int i11 = 0; i11 < 2; i11++) {
                    if (tag instanceof Integer) {
                        h5VarArr[i11 + 1].setTextColor(profileActivity.w3(org.telegram.ui.ActionBar.g6.v0(((Integer) tag).intValue(), profileActivity.f36067v0), Boolean.valueOf(profileActivity.F0[0])));
                    } else {
                        h5VarArr[i11 + 1].setTextColor(profileActivity.w3(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B8, profileActivity.f36067v0), Boolean.TRUE));
                    }
                }
            }
            Drawable drawable = profileActivity.f36079x;
            if (drawable != null) {
                drawable.setColorFilter(profileActivity.M5 != null ? -1 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23272pc, profileActivity.f36067v0), PorterDuff.Mode.MULTIPLY);
            }
            org.telegram.ui.Components.ll0 ll0Var = profileActivity.H;
            if (ll0Var != null) {
                ll0Var.b(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23127h8, profileActivity.f36067v0));
            }
            org.telegram.ui.ActionBar.h5 h5Var2 = profileActivity.f35958f[1];
            if (h5Var2 != null) {
                h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.vh, profileActivity.f36067v0));
            }
            org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
            if (kVar != null) {
                kVar.D(profileActivity.M5 == null ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23375v8, profileActivity.f36067v0) : -1, false);
                profileActivity.actionBar.C(profileActivity.M5 != null ? 553648127 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23092f8, profileActivity.f36067v0), false);
            }
        }
        profileActivity.X4();
        profileActivity.o5();
    }

    public static void V0(ProfileActivity profileActivity) {
        float fMin = Math.min(profileActivity.Y1, 0.25f) / 0.25f;
        if (profileActivity.f36007m1) {
            profileActivity.f36028p0.setAlpha(1.0f - fMin);
            profileActivity.f36028p0.setBlurIntensity(0.0f);
            profileActivity.f36028p0.setGooeyEnabled(false);
        } else {
            profileActivity.f36028p0.setPullProgress(profileActivity.Y1);
            profileActivity.f36028p0.setBlurIntensity(Math.min((h7.n.a(profileActivity.Y1, 0.2f, 0.7f) - 0.2f) / 0.5f, 0.75f));
            org.telegram.ui.Components.gh0 gh0Var = profileActivity.f36028p0;
            float f10 = profileActivity.Y1;
            gh0Var.setGooeyEnabled(f10 > 0.0f && f10 < 1.0f);
        }
        oy0 oy0Var = profileActivity.f36034q0;
        if (oy0Var != null && profileActivity.F1 != 2) {
            float f11 = profileActivity.Y1;
            oy0Var.setAlpha(f11 > 0.0f ? AndroidUtilities.lerp(1.0f, 0.0f, AndroidUtilities.ilerp(f11, 0.0f, 0.5f)) : 1.0f);
        }
        profileActivity.f36028p0.setVisibility(profileActivity.Y1 >= 1.0f ? 8 : 0);
    }

    public static void W(ProfileActivity profileActivity) {
        MessagesController.getInstance(profileActivity.currentAccount).deleteUserPhoto(null);
        profileActivity.R.K(0);
        profileActivity.S.K(0);
    }

    public static void X(ProfileActivity profileActivity, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.ec ecVarQ = org.telegram.ui.Components.mc.a0(profileActivity).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            ecVarQ.f28020j = 5000;
            ecVarQ.j();
            return;
        }
        if (tL_birthday == null) {
            userFull.flags2 &= -33;
        } else {
            userFull.flags2 |= 32;
        }
        userFull.birthday = tL_birthday;
        profileActivity.getMessagesStorage().updateUserInfo(userFull, false);
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            org.telegram.messenger.y1.q(R.string.UnknownError, org.telegram.ui.Components.mc.a0(profileActivity), R.raw.error, 36);
            return;
        }
        if (profileActivity.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.resourceProvider);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            profileActivity.showDialog(alertDialog$Builder.f22702a);
        }
    }

    public static void Y(ProfileActivity profileActivity, int i10, float f10, float f11) {
        switch (i10) {
            case 0:
                boolean z10 = profileActivity.f36007m1;
                if (z10) {
                    if (z10) {
                        profileActivity.M3();
                    }
                    break;
                } else if (profileActivity.f35923a1 != 0) {
                    profileActivity.x4();
                    break;
                } else if (profileActivity.f35929b1 != 0) {
                    if (ChatObject.isForum(profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.f35929b1)))) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", profileActivity.f35929b1);
                        if (profileActivity.getMessagesController().checkCanOpenChat(bundle, profileActivity)) {
                            profileActivity.presentFragment(new rn(bundle), false);
                            break;
                        }
                    } else if (!profileActivity.M3()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", profileActivity.f35929b1);
                        if (profileActivity.getMessagesController().checkCanOpenChat(bundle2, profileActivity)) {
                            profileActivity.presentFragment(new rn(bundle2), false);
                            break;
                        }
                    }
                }
                break;
            case 1:
                profileActivity.r4(profileActivity.W, f10, f11, true);
                break;
            case 2:
                profileActivity.y4();
                break;
            case 3:
                profileActivity.p4();
                break;
            case 4:
                profileActivity.s4();
                break;
            case 5:
            case 10:
            case 11:
                profileActivity.o4(false);
                break;
            case 6:
                profileActivity.o4(true);
                break;
            case 7:
                profileActivity.q4(true);
                break;
            case 8:
                x21.L(profileActivity.a(), profileActivity);
                break;
            case 9:
                profileActivity.i4(false);
                break;
            case 12:
                profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(profileActivity.getParentActivity(), 3, profileActivity.f36067v0);
                b2Var.q(200L);
                MessagesController.getInstance(profileActivity.currentAccount).getStoriesController().k(profileActivity.a(), new jh.y1(7, profileActivity, b2Var), true, profileActivity.f36067v0);
                break;
            case 13:
                profileActivity.n4(true);
                break;
            case 14:
                profileActivity.u4();
                break;
            case 15:
                TLRPC.User currentUser = profileActivity.getUserConfig().getCurrentUser();
                if (currentUser != null) {
                    org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(profileActivity, profileActivity.W);
                    b70VarH.f26995w = false;
                    b70VarH.f26974i = 3;
                    b70VarH.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.QrCode), new gb0(profileActivity, 22), false);
                    b70VarH.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new zk0(currentUser, 28), false);
                    b70VarH.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new gb0(profileActivity, 23), false);
                    b70VarH.W = true;
                    b70VarH.a0(f10 - AndroidUtilities.dp(8.0f), profileActivity.W.getMeasuredHeight() - AndroidUtilities.dp(16.0f));
                    b70VarH.Z();
                    break;
                }
                break;
            case 16:
                profileActivity.presentFragment(new UserInfoActivity());
                break;
            case 17:
                profileActivity.presentFragment(new x71(null));
                break;
        }
    }

    public static boolean Z(ProfileActivity profileActivity, boolean[] zArr, boolean z10, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_error tL_error) {
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        MessagesController.getNotificationsSettings(profileActivity.currentAccount).edit().putLong("dialog_join_requested_time_" + profileActivity.f35952e1, System.currentTimeMillis()).commit();
        Activity parentActivity = profileActivity.getParentActivity();
        boolean z11 = ChatObject.isChannel(profileActivity.A2) && !profileActivity.A2.megagroup;
        int i10 = org.telegram.ui.Components.t70.f32675r;
        org.telegram.ui.Components.t70.x(parentActivity, profileActivity, org.telegram.ui.Components.mc.a0(profileActivity), z11);
        if (!z10 || profileActivity.H4 != -1) {
            profileActivity.j5();
            vz0 vz0Var = profileActivity.d;
            if (vz0Var != null) {
                vz0Var.l();
            }
        }
        if (n2Var instanceof rn) {
            ((rn) n2Var).vb(false, true);
        }
        return false;
    }

    public static void a0(ProfileActivity profileActivity) {
        TLRPC.Document documentF;
        org.telegram.ui.Components.ec ecVarH;
        if (profileActivity.F2 != null) {
            return;
        }
        if (!profileActivity.f36007m1 || profileActivity.getMessagesController().premiumFeaturesBlocked()) {
            if (profileActivity.K3()) {
                return;
            }
            profileActivity.w4(false);
            return;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = profileActivity.getMessagesController().getTopicsController().getTopics(profileActivity.f35929b1);
        if (topics != null) {
            TLRPC.TL_forumTopic tL_forumTopic = null;
            for (int i10 = 0; tL_forumTopic == null && i10 < topics.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = topics.get(i10);
                if (tL_forumTopic2 != null && tL_forumTopic2.f22432id == profileActivity.f35937c1) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
            if (tL_forumTopic != null) {
                long j10 = tL_forumTopic.icon_emoji_id;
                if (j10 == 0 || (documentF = org.telegram.ui.Components.k5.f(profileActivity.currentAccount, j10)) == null || (ecVarH = org.telegram.ui.Components.mc.a0(profileActivity).h(documentF, 1, new xx0(profileActivity, 0))) == null) {
                    return;
                }
                ecVarH.j();
            }
        }
    }

    public static void b0(ProfileActivity profileActivity, Context context, long j10, View view, int i10, float f10, float f11) {
        TLRPC.User user;
        vz0 vz0Var;
        if (profileActivity.getParentActivity() == null) {
            return;
        }
        profileActivity.f35921a.B0();
        if (i10 == profileActivity.O3) {
            TLRPC.User user2 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f35923a1));
            TLRPC.UserFull userFull = profileActivity.f36043r2;
            if (userFull != null && userFull.starref_program != null) {
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                hh.c0.g(profileActivity.currentAccount).f(profileActivity.getParentActivity(), clientUserId, profileActivity.f35923a1, new cu(profileActivity, context, clientUserId, 2));
                return;
            } else {
                if (user2 == null || !user2.bot_can_edit) {
                    return;
                }
                profileActivity.presentFragment(new nh.k(profileActivity.f35923a1));
                return;
            }
        }
        if (i10 == profileActivity.M3) {
            boolean z10 = !profileActivity.getMessagesController().isDialogMuted(j10, profileActivity.f35937c1);
            profileActivity.getNotificationsController().muteDialog(j10, profileActivity.f35937c1, z10);
            org.telegram.ui.Components.mc.A(profileActivity, z10, null).j();
            profileActivity.a5();
            int i11 = profileActivity.M3;
            if (i11 < 0 || (vz0Var = profileActivity.d) == null) {
                return;
            }
            vz0Var.m(i11);
            return;
        }
        if (i10 == profileActivity.V3) {
            TLRPC.User user3 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f35923a1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user3.f22527id);
            bundle.putBoolean("addContact", true);
            bundle.putString("phone", profileActivity.Z4);
            bundle.putString("first_name_card", profileActivity.f35925a5);
            bundle.putString("last_name_card", profileActivity.f35933b5);
            js jsVar = new js(bundle, profileActivity.f36067v0);
            jsVar.K = new hx0(profileActivity, user3);
            profileActivity.presentFragment(jsVar);
            return;
        }
        if (i10 == profileActivity.S3) {
            TextView textView = (TextView) org.telegram.ui.Components.y4.i0(profileActivity.getParentActivity(), LocaleController.getString(R.string.DeleteReaction), LocaleController.getString(R.string.DeleteAlertReaction), LocaleController.getString(R.string.DeleteAlertReactionAll), LocaleController.getString(R.string.Delete), new xx0(profileActivity, 1), profileActivity.f36067v0, false).d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                return;
            }
            return;
        }
        if (i10 == profileActivity.T3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f36067v0);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ReportReaction2);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ReportAlertReaction);
            TLRPC.Chat chat = profileActivity.getMessagesController().getChat(Long.valueOf(-profileActivity.W4));
            org.telegram.ui.Cells.y1[] y1VarArr = new org.telegram.ui.Cells.y1[1];
            if (chat != null && ChatObject.canBlockUsers(chat)) {
                LinearLayout linearLayout = new LinearLayout(profileActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(profileActivity.getParentActivity(), 1, profileActivity.f36067v0);
                y1VarArr[0] = y1Var;
                y1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                y1VarArr[0].e(LocaleController.getString(R.string.BanUser), "", true, false, false);
                y1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                linearLayout.addView(y1VarArr[0], h7.z5.n(-1, -2));
                y1VarArr[0].setOnClickListener(new f20(y1VarArr, 2));
                alertDialog$Builder.n(linearLayout);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.ReportChat), new nl0(14, profileActivity, y1VarArr));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new j70(11));
            TextView textView2 = (TextView) alertDialog$Builder.o().d(-1);
            if (textView2 != null) {
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                return;
            }
            return;
        }
        if (i10 == profileActivity.f36018n4) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("chat_id", DialogObject.getEncryptedChatId(profileActivity.f35952e1));
            profileActivity.presentFragment(new e70(bundle2));
            return;
        }
        if (i10 == profileActivity.f36010m4) {
            profileActivity.showDialog(org.telegram.ui.Components.y4.V(profileActivity.getParentActivity(), profileActivity.f36095z2, profileActivity.f36067v0).f22702a);
            return;
        }
        if (i10 == profileActivity.J3) {
            profileActivity.r4(view, f10, f11, false);
            return;
        }
        if (i10 == profileActivity.G4) {
            profileActivity.getMessagesController().unblockPeer(profileActivity.f35923a1);
            if (org.telegram.ui.Components.mc.a(profileActivity)) {
                org.telegram.ui.Components.mc.d(profileActivity, false).j();
                return;
            }
            return;
        }
        if (i10 == profileActivity.W3) {
            try {
                profileActivity.actionBar.getActionBarMenuOnItemClick().b(9);
                return;
            } catch (Exception e9) {
                FileLog.e(e9);
                return;
            }
        }
        if (i10 == profileActivity.Q3) {
            profileActivity.u4();
            return;
        }
        if (i10 == profileActivity.R3) {
            x21.L(profileActivity.a(), profileActivity);
            return;
        }
        if (i10 >= profileActivity.f36038q4 && i10 < profileActivity.f36045r4) {
            profileActivity.h(!profileActivity.f36089y2.isEmpty() ? profileActivity.f36036q2.participants.participants.get(((Integer) profileActivity.f36089y2.get(i10 - profileActivity.f36038q4)).intValue()) : profileActivity.f36036q2.participants.participants.get(i10 - profileActivity.f36038q4), false, false, view);
            return;
        }
        if (i10 == profileActivity.f36053s4) {
            profileActivity.v4();
            return;
        }
        if (i10 == profileActivity.H3) {
            profileActivity.C4(f10, f11, i10, view);
            return;
        }
        if (i10 == profileActivity.f35977h4) {
            if (profileActivity.A2 != null) {
                profileActivity.showDialog(new oh.j0(profileActivity, profileActivity.A2.linked_community_id, null, null));
                return;
            } else {
                if (profileActivity.f35923a1 == 0 || (user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f35923a1))) == null) {
                    return;
                }
                profileActivity.showDialog(new oh.j0(profileActivity, user.linked_community_id, null, null));
                return;
            }
        }
        if (i10 == profileActivity.E3) {
            if (profileActivity.f36036q2.location instanceof TLRPC.TL_channelLocation) {
                tc0 tc0Var = new tc0(5);
                long j11 = profileActivity.f35929b1;
                TLRPC.TL_channelLocation tL_channelLocation = (TLRPC.TL_channelLocation) profileActivity.f36036q2.location;
                tc0Var.f42856a0 = -j11;
                tc0Var.f42883v0 = tL_channelLocation;
                profileActivity.presentFragment(tc0Var);
                return;
            }
            return;
        }
        if (i10 == profileActivity.H4) {
            profileActivity.q4(false);
            return;
        }
        if (i10 == profileActivity.f36059t4) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", profileActivity.f35929b1);
            bundle3.putInt("type", 2);
            lr lrVar = new lr(bundle3);
            lrVar.x0(profileActivity.f36036q2);
            profileActivity.presentFragment(lrVar);
            return;
        }
        if (i10 == profileActivity.f36065u4) {
            profileActivity.presentFragment(new lh0(profileActivity.f35929b1));
            return;
        }
        if (i10 == profileActivity.v4) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", profileActivity.f35929b1);
            bundle4.putInt("type", 1);
            lr lrVar2 = new lr(bundle4);
            lrVar2.x0(profileActivity.f36036q2);
            profileActivity.presentFragment(lrVar2);
            return;
        }
        if (i10 == profileActivity.f36077w4) {
            profileActivity.O0.performClick();
            return;
        }
        if (i10 == profileActivity.f36084x4) {
            profileActivity.presentFragment(new hh.r(0, profileActivity.f35923a1));
            return;
        }
        if (i10 == profileActivity.f36091y4) {
            profileActivity.presentFragment(new hh.r(1, profileActivity.f35923a1));
            return;
        }
        if (i10 == profileActivity.f36097z4) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("chat_id", profileActivity.f35929b1);
            bundle5.putBoolean("start_from_monetization", true);
            profileActivity.presentFragment(new q91(bundle5));
            return;
        }
        if (i10 == profileActivity.C4) {
            Bundle bundle6 = new Bundle();
            bundle6.putLong("chat_id", profileActivity.f35929b1);
            bundle6.putInt("type", 0);
            lr lrVar3 = new lr(bundle6);
            lrVar3.x0(profileActivity.f36036q2);
            profileActivity.presentFragment(lrVar3);
            return;
        }
        if (i10 == profileActivity.f35931b3) {
            profileActivity.presentFragment(new NotificationsSettingsActivity());
            return;
        }
        if (i10 == profileActivity.f35946d3) {
            PrivacySettingsActivity privacySettingsActivity = new PrivacySettingsActivity();
            TL_account.TL_password tL_password = profileActivity.D2;
            privacySettingsActivity.d = tL_password;
            if (tL_password != null) {
                privacySettingsActivity.y0();
            }
            profileActivity.presentFragment(privacySettingsActivity);
            return;
        }
        if (i10 == profileActivity.f35954e3) {
            profileActivity.presentFragment(new DataSettingsActivity());
            return;
        }
        if (i10 == profileActivity.f35962f3) {
            profileActivity.presentFragment(new ThemeActivity(0));
            return;
        }
        if (i10 == profileActivity.f35969g3) {
            profileActivity.presentFragment(new FiltersSetupActivity());
            return;
        }
        if (i10 == profileActivity.f35983i3) {
            profileActivity.presentFragment(new StickersActivity(0, null));
            return;
        }
        if (i10 == profileActivity.f35976h3) {
            profileActivity.presentFragment(new xb0());
            return;
        }
        if (i10 == profileActivity.f35990j3) {
            profileActivity.presentFragment(new SessionsActivity(0));
            return;
        }
        if (i10 == profileActivity.f36009m3) {
            profileActivity.showDialog(org.telegram.ui.Components.y4.U(profileActivity, profileActivity.f36067v0));
            return;
        }
        if (i10 == profileActivity.f36017n3) {
            we.e.s(profileActivity.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
            return;
        }
        if (i10 == profileActivity.f36024o3) {
            we.e.s(profileActivity.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
            return;
        }
        if (i10 == profileActivity.f36044r3) {
            H4(profileActivity.getParentActivity(), false);
            return;
        }
        if (i10 == profileActivity.f36052s3) {
            H4(profileActivity.getParentActivity(), true);
            return;
        }
        if (i10 == profileActivity.f36058t3) {
            FileLog.cleanupLogs();
            return;
        }
        if (i10 == profileActivity.f36064u3) {
            if (profileActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f36067v0);
            alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.AreYouSure);
            alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.AppName);
            alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new gx0(profileActivity, 7));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            profileActivity.showDialog(alertDialog$Builder2.f22702a);
            return;
        }
        if (i10 == profileActivity.f35939c3) {
            profileActivity.presentFragment(new LanguageSelectActivity());
            return;
        }
        if (i10 == profileActivity.R2) {
            profileActivity.presentFragment(new na(null));
            return;
        }
        if (i10 == profileActivity.S2) {
            profileActivity.presentFragment(new UserInfoActivity());
            return;
        }
        if (i10 == profileActivity.P2) {
            profileActivity.presentFragment(new h(3));
            return;
        }
        if (i10 == profileActivity.K2) {
            profileActivity.u4();
            return;
        }
        if (i10 == profileActivity.Y3) {
            profileActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
            return;
        }
        if (i10 == profileActivity.Z3) {
            profileActivity.presentFragment(new hh.oa());
            return;
        }
        if (i10 == profileActivity.f35924a4) {
            profileActivity.presentFragment(new mh.g());
            return;
        }
        if (i10 == profileActivity.f35932b4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(1, "settings"));
            return;
        }
        if (i10 == profileActivity.f35940c4) {
            cg.y2.e0(0, BirthdayController.getInstance(profileActivity.currentAccount).getState());
            return;
        }
        if (i10 == profileActivity.botPermissionLocation) {
            nh.t0 t0Var = profileActivity.f36023o2;
            if (t0Var != null) {
                t0Var.m(!t0Var.g(), new zs0(17, profileActivity, view));
                return;
            }
            return;
        }
        if (i10 == profileActivity.botPermissionBiometry) {
            nh.q qVar = profileActivity.f36030p2;
            if (qVar != null) {
                boolean z11 = !qVar.f18890e;
                qVar.f18891f = true;
                qVar.f18890e = z11;
                qVar.k();
                ((org.telegram.ui.Cells.l8) view).setChecked(profileActivity.f36030p2.f18890e);
                return;
            }
            return;
        }
        if (i10 == profileActivity.botPermissionEmojiStatus) {
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
            l8Var.setChecked(!l8Var.b());
            if (profileActivity.f35998k4 > 0) {
                profileActivity.getConnectionsManager().cancelRequest(profileActivity.f35998k4, true);
            }
            TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
            toggleuseremojistatuspermission.bot = profileActivity.getMessagesController().getInputUser(profileActivity.f35923a1);
            boolean zB = l8Var.b();
            toggleuseremojistatuspermission.enabled = zB;
            TLRPC.UserFull userFull2 = profileActivity.f36043r2;
            if (userFull2 != null) {
                userFull2.bot_can_manage_emoji_status = zB;
            }
            int iSendRequest = profileActivity.getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new v80(19, profileActivity, iArr));
            profileActivity.f35998k4 = iSendRequest;
            int[] iArr = {iSendRequest};
            return;
        }
        if (i10 == profileActivity.K3) {
            profileActivity.J4 = !profileActivity.J4;
            profileActivity.F4();
            view.requestLayout();
            profileActivity.d.m(profileActivity.K3);
            int i12 = profileActivity.Q5;
            if (i12 >= 0) {
                profileActivity.f35935c.h1(i12, profileActivity.R5 - profileActivity.f35921a.getPaddingTop());
                return;
            }
            return;
        }
        if (i10 == profileActivity.L3) {
            profileActivity.z4(false);
            return;
        }
        if (i10 == profileActivity.M2) {
            if (profileActivity.f36043r2 == null) {
                return;
            }
            Bundle bundle7 = new Bundle();
            bundle7.putLong("chat_id", profileActivity.f36043r2.personal_channel_id);
            profileActivity.presentFragment(new rn(bundle7));
            return;
        }
        if (i10 != profileActivity.Q2) {
            if (i10 == profileActivity.D3) {
                profileActivity.I3(i10, view);
                return;
            } else {
                profileActivity.C4(f10, f11, i10, view);
                return;
            }
        }
        n01 n01Var = profileActivity.Y5;
        if ((n01Var == null || !n01Var.a()) && !profileActivity.J3(i10, view)) {
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
            if (v8Var.d.getDrawable() != null) {
                profileActivity.t4(v8Var.getImageView());
            }
        }
    }

    public static void c0(ProfileActivity profileActivity, org.telegram.ui.Cells.y1[] y1VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = profileActivity.getMessagesController().getInputUser(profileActivity.f35923a1);
        tL_messages_reportReaction.peer = profileActivity.getMessagesController().getInputPeer(profileActivity.W4);
        tL_messages_reportReaction.f22486id = profileActivity.V4;
        ConnectionsManager.getInstance(profileActivity.currentAccount).sendRequest(tL_messages_reportReaction, new jh.m5(5));
        org.telegram.ui.Cells.y1 y1Var = y1VarArr[0];
        if (y1Var != null && y1Var.b()) {
            profileActivity.getMessagesController().deleteParticipantFromChat(-profileActivity.W4, profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f35923a1)));
        }
        profileActivity.V4 = 0;
        profileActivity.e5(false, false);
        org.telegram.ui.Components.mc.a0(profileActivity).E(profileActivity.f36067v0).j();
    }

    public static void d0(ProfileActivity profileActivity, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            profileActivity.E2 = fileLocation;
            profileActivity.F2 = photoSize2.location;
            profileActivity.f35922a0.h(ImageLocation.getForLocal(fileLocation), "50_50", profileActivity.f36001l0, null);
            if (profileActivity.K2 != -1) {
                profileActivity.j5();
                vz0 vz0Var = profileActivity.d;
                if (vz0Var != null) {
                    vz0Var.l();
                }
                profileActivity.k4(true);
            }
            my0 my0Var = profileActivity.f35987j0;
            ImageLocation forLocal = ImageLocation.getForLocal(profileActivity.F2);
            profileActivity.G2 = forLocal;
            my0Var.A(forLocal, ImageLocation.getForLocal(profileActivity.E2));
            profileActivity.P4(true, false);
        } else {
            if (profileActivity.E2 == null) {
                return;
            }
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i10 = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i10 | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            profileActivity.O5 = profileActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new v80(21, profileActivity, str));
        }
        profileActivity.actionBar.n().requestLayout();
    }

    public static void e0(ProfileActivity profileActivity, Boolean bool) {
        long j10 = profileActivity.f35923a1;
        if (j10 == 0) {
            long j11 = profileActivity.f35929b1;
            j10 = j11 != 0 ? -j11 : profileActivity.f35952e1;
        }
        long j12 = j10;
        if (bool.booleanValue()) {
            MessagesController.getInstance(profileActivity.currentAccount).deleteAllReactionsFrom(profileActivity.W4, j12);
        } else {
            MessagesController.getInstance(profileActivity.currentAccount).deleteReactionsFromMessage(profileActivity.W4, j12, profileActivity.V4);
        }
        profileActivity.V4 = 0;
        profileActivity.e5(false, false);
        org.telegram.ui.Components.mb mbVar = new org.telegram.ui.Components.mb(profileActivity.getParentActivity(), profileActivity.f36067v0);
        mbVar.d(R.raw.chats_infotip, new String[0]);
        mbVar.f30639b.setText(LocaleController.getString(R.string.ReactionDeleteSent));
        org.telegram.ui.Components.mc.a0(profileActivity).b(mbVar, 1500).j();
    }

    public static void f0(ProfileActivity profileActivity, int i10) {
        boolean z10;
        if (i10 < 0) {
            return;
        }
        Object objValueOf = Integer.valueOf(profileActivity.P2);
        g01 g01Var = profileActivity.f35950e;
        if (!g01Var.f38258w) {
            if (!g01Var.v.isEmpty()) {
                i10--;
            }
            if (i10 < 0 || i10 >= profileActivity.f35950e.v.size()) {
                int iE = org.telegram.ui.Cells.pa.e(1, i10, profileActivity.f35950e.v);
                if (iE >= 0 && iE < profileActivity.f35950e.d.size()) {
                    objValueOf = profileActivity.f35950e.d.get(iE);
                    z10 = false;
                }
                if (objValueOf instanceof f01) {
                    f01 f01Var = (f01) objValueOf;
                    org.telegram.ui.ActionBar.b5 parentLayout = profileActivity.getParentLayout();
                    f01Var.f37892b.run();
                    AndroidUtilities.scrollToFragmentRow(parentLayout, f01Var.f37893c);
                } else if (objValueOf instanceof MessagesController.FaqSearchResult) {
                    NotificationCenter.getInstance(profileActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, profileActivity.f35950e.A, ((MessagesController.FaqSearchResult) objValueOf).url);
                }
                if (z10 || objValueOf == null) {
                }
                profileActivity.f35950e.E(objValueOf);
                return;
            }
            objValueOf = profileActivity.f35950e.v.get(i10);
        } else if (i10 < g01Var.f38256r.size()) {
            objValueOf = profileActivity.f35950e.f38256r.get(i10);
        } else {
            int iE2 = org.telegram.ui.Cells.pa.e(1, i10, profileActivity.f35950e.f38256r);
            if (iE2 >= 0 && iE2 < profileActivity.f35950e.f38257s.size()) {
                objValueOf = profileActivity.f35950e.f38257s.get(iE2);
            }
        }
        z10 = true;
        if (objValueOf instanceof f01) {
            f01 f01Var2 = (f01) objValueOf;
            org.telegram.ui.ActionBar.b5 parentLayout2 = profileActivity.getParentLayout();
            f01Var2.f37892b.run();
            AndroidUtilities.scrollToFragmentRow(parentLayout2, f01Var2.f37893c);
        } else if (objValueOf instanceof MessagesController.FaqSearchResult) {
            NotificationCenter.getInstance(profileActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, profileActivity.f35950e.A, ((MessagesController.FaqSearchResult) objValueOf).url);
        }
        if (z10) {
        }
    }

    public static void g0(ProfileActivity profileActivity) {
        boolean z10;
        TLRPC.Document document;
        if (profileActivity.X == null) {
            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.currentAccount == profileActivity.currentAccount && MediaController.getInstance().currentSavedMusicList.dialogId == profileActivity.a()) {
                profileActivity.X = MediaController.getInstance().currentSavedMusicList;
            } else {
                MessagesController.SavedMusicList savedMusicList = new MessagesController.SavedMusicList(profileActivity.currentAccount, profileActivity.a());
                profileActivity.X = savedMusicList;
                TLRPC.UserFull userFull = profileActivity.f36043r2;
                if (userFull != null && (document = userFull.saved_music) != null) {
                    savedMusicList.setup(document);
                }
            }
        }
        if (profileActivity.X.list.isEmpty()) {
            return;
        }
        if (MediaController.getInstance().currentSavedMusicList == profileActivity.X && MediaController.getInstance().isPlayingMessage(profileActivity.X.list.get(0))) {
            z10 = true;
        } else {
            MediaController.getInstance().cleanup();
            z10 = false;
        }
        MediaController.getInstance().currentSavedMusicList = profileActivity.X;
        MediaController.getInstance().getPlaylist().clear();
        MediaController.getInstance().getPlaylist().addAll(profileActivity.X.list);
        if (!z10) {
            MediaController.getInstance().playMessage(profileActivity.X.list.get(0));
        }
        profileActivity.showDialog(new org.telegram.ui.Components.b8(profileActivity.getParentActivity(), profileActivity.f36067v0));
    }

    public static void h0(ProfileActivity profileActivity) {
        org.telegram.ui.Components.kb0.b(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), true, null, new gb0(profileActivity, 18), profileActivity.f36067v0);
    }

    public static void i0(ProfileActivity profileActivity) {
        int i10;
        final int i11;
        final LimitPreviewView limitPreviewView;
        Activity parentActivity = profileActivity.getParentActivity();
        final TLRPC.UserFull userFull = profileActivity.f36043r2;
        if (userFull == null || userFull.stars_rating == null) {
            return;
        }
        ?? r10 = 0;
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(profileActivity.getParentActivity(), null, false, false);
        e3Var.fixNavigationBar();
        Runnable runnable = e3Var.dismissRunnable;
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        LimitPreviewView limitPreviewView2 = new LimitPreviewView(profileActivity.getParentActivity(), R.drawable.filled_rating_crown, 0, profileActivity.f36067v0, 0);
        limitPreviewView2.setHideNegativeValues(profileActivity.a() != UserConfig.getInstance(profileActivity.currentAccount).getClientUserId());
        limitPreviewView2.setStarRating(userFull.stars_rating);
        limitPreviewView2.setTranslationY(-AndroidUtilities.dp(14.0f));
        linearLayout.addView(limitPreviewView2, h7.z5.t(-1, -2, 17, 0, 20, 0, 10));
        int i12 = 17;
        if (userFull.stars_my_pending_rating != null) {
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            linearLayout.addView(frameLayout, h7.z5.t(-1, -2, 17, 40, -12, 40, 20));
            TextView[] textViewArr = new org.telegram.ui.Components.p80[2];
            int i13 = 0;
            for (int i14 = 2; i13 < i14; i14 = 2) {
                ag.v2 v2Var = new ag.v2(parentActivity, 5, r10);
                textViewArr[i13] = v2Var;
                v2Var.setGravity(17);
                textViewArr[i13].setTextSize(1, 12.0f);
                textViewArr[i13].setTextColor(org.telegram.ui.ActionBar.g6.w0(r10, org.telegram.ui.ActionBar.g6.f23423y6, false));
                textViewArr[i13].setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(r10, org.telegram.ui.ActionBar.g6.gc, false));
                frameLayout.addView(textViewArr[i13], h7.z5.e(-1, -1, 119));
                textViewArr[i13].setAlpha(i13 == 0 ? 1.0f : 0.0f);
                textViewArr[i13].setScaleX(i13 == 0 ? 1.0f : 0.8f);
                textViewArr[i13].setScaleY(i13 == 0 ? 1.0f : 0.8f);
                i13++;
                r10 = 0;
            }
            final x3 x3Var = new x3(textViewArr, i12);
            boolean z10 = profileActivity.a() == UserConfig.getInstance(profileActivity.currentAccount).getClientUserId();
            long j10 = userFull.stars_rating.stars;
            TL_stars.Tl_starsRating tl_starsRating = userFull.stars_my_pending_rating;
            long j11 = (-j10) - (tl_starsRating != null ? tl_starsRating.stars - j10 : 0L);
            int iMax = Math.max(1, (userFull.stars_my_pending_rating_date - ConnectionsManager.getInstance(profileActivity.currentAccount).getCurrentTime()) / 86400);
            long j12 = userFull.stars_my_pending_rating.stars;
            long j13 = userFull.stars_rating.stars;
            long j14 = j12 - j13;
            if ((j13 >= 0 || z10) && (!z10 || j11 <= 0)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                i11 = 0;
                spannableStringBuilder.append(TextUtils.concat(LocaleController.formatPluralStringComma("StarRatingFuture", iMax), "\n", LocaleController.formatPluralStringComma("StarRatingFuturePendingPoints", (int) j14)));
                spannableStringBuilder.append((CharSequence) " ");
                limitPreviewView = limitPreviewView2;
                spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.StarRatingFuturePendingPointsPreview), new Runnable() {
                    @Override
                    public final void run() {
                        switch (i11) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                limitPreviewView.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                x3Var.run(Boolean.TRUE);
                                break;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                x3Var.run(Boolean.FALSE);
                                break;
                        }
                    }
                }), true));
                textViewArr[0].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                limitPreviewView.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                x3Var.run(Boolean.TRUE);
                                break;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                x3Var.run(Boolean.FALSE);
                                break;
                        }
                    }
                });
                textViewArr[0].setText(spannableStringBuilder);
            } else {
                boolean z11 = z10;
                textViewArr[0].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                if (z11) {
                    textViewArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarRatingLevelNegativeYou", (int) j11)));
                } else {
                    textViewArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarRatingLevelNegativeOther, DialogObject.getName(profileActivity.a()))));
                }
                limitPreviewView = limitPreviewView2;
                i11 = 0;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            String pluralStringComma = LocaleController.formatPluralStringComma("StarRatingFuturePreview1", iMax);
            String pluralStringComma2 = LocaleController.formatPluralStringComma("StarRatingFuturePreview2", (int) j14);
            CharSequence[] charSequenceArr = new CharSequence[3];
            charSequenceArr[i11] = pluralStringComma;
            final int i15 = 1;
            charSequenceArr[1] = "\n";
            charSequenceArr[2] = pluralStringComma2;
            spannableStringBuilder2.append(TextUtils.concat(charSequenceArr));
            spannableStringBuilder2.append((CharSequence) " ");
            spannableStringBuilder2.append(AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.StarRatingFuturePendingPointsPreviewBack), new Runnable() {
                @Override
                public final void run() {
                    switch (i15) {
                        case 0:
                            TLRPC.UserFull userFull2 = userFull;
                            limitPreviewView.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                            x3Var.run(Boolean.TRUE);
                            break;
                        default:
                            TLRPC.UserFull userFull3 = userFull;
                            limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                            x3Var.run(Boolean.FALSE);
                            break;
                    }
                }
            }), true));
            textViewArr[1].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            TLRPC.UserFull userFull2 = userFull;
                            limitPreviewView.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                            x3Var.run(Boolean.TRUE);
                            break;
                        default:
                            TLRPC.UserFull userFull3 = userFull;
                            limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                            x3Var.run(Boolean.FALSE);
                            break;
                    }
                }
            });
            textViewArr[1].setText(spannableStringBuilder2);
        }
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.StarRatingTitle));
        textView.setTextSize(1, 20.0f);
        int i16 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i16, profileActivity.f36067v0));
        linearLayout.addView(textView, h7.z5.t(-1, -2, 17, 20, 0, 20, 6));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        if (userFull.f22528id == UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
            org.telegram.messenger.y1.p(R.string.StarRatingSelfDescription, textView2);
            i10 = 1;
        } else {
            i10 = 1;
            org.telegram.messenger.rl.n(R.string.StarRatingDescription, new Object[]{DialogObject.getName(profileActivity.a())}, textView2);
        }
        textView2.setTextSize(i10, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i16, profileActivity.f36067v0));
        linearLayout.addView(textView2, h7.z5.t(-1, -2, 17, 20, 0, 20, 12));
        rv0 rv0Var = new rv0(parentActivity, profileActivity.f36067v0);
        rv0Var.f42346a.l(LocaleController.getString(R.string.StarRatingTitle1), false);
        int i17 = R.string.StarRatingDescription1;
        String string = LocaleController.getString(R.string.StarRatingAdded);
        int i18 = org.telegram.ui.ActionBar.g6.Oh;
        rv0Var.f42347b.setText(LocaleController.formatSpannable(i17, G3(org.telegram.ui.ActionBar.g6.v0(i18, profileActivity.f36067v0), string)));
        rv0Var.d.setVisibility(8);
        int i19 = R.drawable.menu_gift;
        ImageView imageView = rv0Var.f42348c;
        imageView.setImageResource(i19);
        imageView.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i16, profileActivity.f36067v0));
        linearLayout.addView(rv0Var, h7.z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        rv0 rv0Var2 = new rv0(parentActivity, profileActivity.f36067v0);
        rv0Var2.f42346a.l(LocaleController.getString(R.string.StarRatingTitle2), false);
        rv0Var2.f42347b.setText(LocaleController.formatSpannable(R.string.StarRatingDescription2, G3(org.telegram.ui.ActionBar.g6.v0(i18, profileActivity.f36067v0), LocaleController.getString(R.string.StarRatingAdded))));
        rv0Var2.d.setVisibility(8);
        int i20 = R.drawable.menu_stars_gift;
        ImageView imageView2 = rv0Var2.f42348c;
        imageView2.setImageResource(i20);
        imageView2.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i16, profileActivity.f36067v0));
        linearLayout.addView(rv0Var2, h7.z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        rv0 rv0Var3 = new rv0(parentActivity, profileActivity.f36067v0);
        rv0Var3.f42346a.l(LocaleController.getString(R.string.StarRatingTitle3), false);
        rv0Var3.f42347b.setText(LocaleController.formatSpannable(R.string.StarRatingDescription3, G3(org.telegram.ui.ActionBar.g6.I.q() ? i0.b.d(0.25f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23215m6, profileActivity.f36067v0), -16777216) : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, profileActivity.f36067v0), LocaleController.getString(R.string.StarRatingDeduces))));
        rv0Var3.d.setVisibility(8);
        int i21 = R.drawable.menu_refund;
        ImageView imageView3 = rv0Var3.f42348c;
        imageView3.setImageResource(i21);
        imageView3.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i16, profileActivity.f36067v0));
        linearLayout.addView(rv0Var3, h7.z5.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
        lh.d dVar = new lh.d(parentActivity, profileActivity.f36067v0, true);
        dVar.setOnClickListener(new wx0(0, runnable));
        dVar.g(hh.i5.g2(LocaleController.getString(R.string.Understood)), false, true);
        linearLayout.addView(dVar, h7.z5.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
        e3Var.customView = linearLayout;
        e3Var.show();
    }

    public static void j0(ProfileActivity profileActivity, TLRPC.User user) {
        if (profileActivity.V3 >= 0) {
            if (profileActivity.F4 == -1) {
                profileActivity.j5();
                profileActivity.d.l();
            } else {
                profileActivity.e5(false, false);
            }
        }
        if (profileActivity.F4 == -1) {
            if (profileActivity.f35989j2 || AndroidUtilities.isTablet()) {
                profileActivity.f35921a.setPadding(0, profileActivity.T3(), 0, 0);
                profileActivity.f35961f2.cancel();
                float[] fArr = profileActivity.f35982i2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                profileActivity.J4(1.0f);
                profileActivity.M1 = profileActivity.T3();
            } else {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (profileActivity.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(profileActivity.f35921a.getMeasuredWidth(), 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.f35921a.getMeasuredHeight(), 0);
                int i10 = 0;
                int measuredHeight = 0;
                while (true) {
                    vz0 vz0Var = profileActivity.d;
                    if (i10 >= vz0Var.f43554e.J2) {
                        break;
                    }
                    f2.o1 o1VarG = vz0Var.g(null, vz0Var.j(i10));
                    View view = o1VarG.f5789a;
                    profileActivity.d.v(o1VarG, i10);
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredHeight += view.getMeasuredHeight();
                    i10++;
                }
                int iMax = Math.max(0, profileActivity.fragmentView.getMeasuredHeight() - ((profileActivity.T3() + measuredHeight) + currentActionBarHeight));
                by0 by0Var = profileActivity.f35921a;
                by0Var.setPadding(0, by0Var.getPaddingTop(), 0, iMax);
            }
        }
        profileActivity.I.m(profileActivity.f35952e1, user, 8);
    }

    public static void k0(ProfileActivity profileActivity, Context context, long j10, TL_payments.connectedBotStarRef connectedbotstarref) {
        if (connectedbotstarref == null) {
            nh.s3.G0(context, profileActivity.currentAccount, profileActivity.f36043r2.starref_program, profileActivity.getUserConfig().getClientUserId(), profileActivity.f36067v0, false);
        } else {
            nh.s3.H0(context, profileActivity.currentAccount, connectedbotstarref, j10, profileActivity.f36067v0);
        }
    }

    public static void l0(ProfileActivity profileActivity, ValueAnimator valueAnimator, float f10, boolean z10) {
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f36040r;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        profileActivity.Q1 = fFloatValue;
        float f11 = (fFloatValue - 0.5f) / 0.5f;
        float f12 = (0.5f - fFloatValue) / 0.5f;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        float f13 = -f10;
        profileActivity.P1 = (int) ((1.0f - fFloatValue) * f13);
        profileActivity.f35927b.setTranslationY(fFloatValue * f10);
        profileActivity.L.setTranslationY(f10 * profileActivity.Q1);
        profileActivity.f35921a.setTranslationY((1.0f - profileActivity.Q1) * f13);
        profileActivity.f35921a.setScaleX(1.0f - ((1.0f - profileActivity.Q1) * 0.01f));
        profileActivity.f35921a.setScaleY(1.0f - ((1.0f - profileActivity.Q1) * 0.01f));
        profileActivity.f35921a.setAlpha(profileActivity.Q1);
        profileActivity.k4(true);
        profileActivity.f35921a.setAlpha(f11);
        profileActivity.f35927b.setAlpha(1.0f - profileActivity.Q1);
        profileActivity.f35927b.setScaleX((profileActivity.Q1 * 0.05f) + 1.0f);
        profileActivity.f35927b.setScaleY((profileActivity.Q1 * 0.05f) + 1.0f);
        profileActivity.L.setAlpha(1.0f - f11);
        profileActivity.U.setAlpha(f11);
        profileActivity.f35922a0.setAlpha(f11);
        oy0 oy0Var = profileActivity.f36034q0;
        if (oy0Var != null) {
            oy0Var.setAlpha(f11);
        }
        profileActivity.f35958f[1].setAlpha(f11);
        h5VarArr[1].setAlpha(f11);
        h5VarArr[3].setAlpha(f11);
        profileActivity.Q0.getSearchField().setAlpha(f12);
        if (z10 && profileActivity.Q1 < 0.7f) {
            org.telegram.ui.ActionBar.v0 v0Var = profileActivity.Q0;
            if (v0Var.B.getWidth() != 0 && !v0Var.f23859e.isFocused()) {
                v0Var.f23859e.requestFocus();
                AndroidUtilities.showKeyboard(v0Var.f23859e);
            }
        }
        profileActivity.Q0.getSearchContainer().setVisibility(profileActivity.Q1 < 0.5f ? 0 : 8);
        int i10 = profileActivity.Q1 > 0.5f ? 0 : 8;
        org.telegram.ui.ActionBar.v0 v0Var2 = profileActivity.P0;
        if (v0Var2 != null) {
            v0Var2.setVisibility(i10);
            profileActivity.P0.setAlpha(f11);
        }
        profileActivity.Q0.setVisibility(i10);
        profileActivity.actionBar.w(profileActivity.Q1 < 0.5f);
        org.telegram.ui.ActionBar.v0 v0Var3 = profileActivity.P0;
        if (v0Var3 != null) {
            v0Var3.setAlpha(f11);
        }
        profileActivity.Q0.setAlpha(f11);
        profileActivity.Z0.invalidate();
        profileActivity.fragmentView.invalidate();
    }

    public static void m0(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        org.telegram.ui.Components.kz0.c(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), user, str, z10, z11, profileActivity.f36067v0);
    }

    public static ProfileActivity m4(long j10) {
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        return new ProfileActivity(bundle, null);
    }

    public static void n0(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        if (tL_error == null) {
            TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.getUserConfig().getClientUserId()));
            if (user == null) {
                user = profileActivity.getUserConfig().getCurrentUser();
                if (user == null) {
                    return;
                } else {
                    profileActivity.getMessagesController().putUser(user, false);
                }
            } else {
                profileActivity.getUserConfig().setCurrentUser(user);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 150);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 800);
            TLRPC.VideoSize closestVideoSizeWithSize = tL_photos_photo.photo.video_sizes.isEmpty() ? null : FileLoader.getClosestVideoSizeWithSize(tL_photos_photo.photo.video_sizes, 1000);
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            user.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f22404id;
            if (closestPhotoSizeWithSize != null) {
                tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
            }
            if (closestPhotoSizeWithSize2 != null) {
                tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
            }
            if (closestPhotoSizeWithSize != null && profileActivity.E2 != null) {
                FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(profileActivity.E2, true).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(profileActivity.E2.volume_id);
                sb2.append("_");
                String strK = a9.p.k(profileActivity.E2.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(strK, a9.p.k(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(profileActivity.currentAccount, user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && profileActivity.F2 != null) {
                FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(profileActivity.F2, true).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            profileActivity.getMessagesController().getDialogPhotos(user.f22527id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            profileActivity.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f35923a1);
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                profileActivity.getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
        profileActivity.f35996k2 = (AndroidUtilities.isTablet() || profileActivity.f35989j2 || !profileActivity.f35922a0.getImageReceiver().hasNotThumb() || AndroidUtilities.isAccessibilityScreenReaderEnabled()) ? false : true;
        profileActivity.E2 = null;
        profileActivity.F2 = null;
        my0 my0Var = profileActivity.f35987j0;
        my0Var.D0 = true;
        my0Var.G0 = profileActivity.G2;
        my0Var.f27443m1 = null;
        my0Var.f27444n1 = null;
        my0Var.setCreateThumbFromParent(false);
        profileActivity.i5(true);
        profileActivity.P4(false, true);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        profileActivity.getUserConfig().saveConfig(true);
    }

    public static void n1(ProfileActivity profileActivity, boolean z10) {
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f35958f;
        org.telegram.ui.ActionBar.h5[] h5VarArr2 = profileActivity.f36040r;
        int i10 = z10 ? 8 : 0;
        profileActivity.f35921a.setVisibility(i10);
        profileActivity.f35927b.setVisibility(z10 ? 0 : 8);
        profileActivity.Q0.getSearchContainer().setVisibility(z10 ? 0 : 8);
        hh.v0 v0Var = profileActivity.f36041r0;
        if (v0Var != null) {
            v0Var.setActive(!z10);
        }
        profileActivity.actionBar.w(z10);
        profileActivity.U.setVisibility(i10);
        oy0 oy0Var = profileActivity.f36034q0;
        if (oy0Var != null) {
            oy0Var.setVisibility(i10);
        }
        h5VarArr[1].setVisibility(i10);
        h5VarArr2[1].setVisibility(i10);
        h5VarArr2[3].setVisibility(i10);
        org.telegram.ui.ActionBar.v0 v0Var2 = profileActivity.P0;
        if (v0Var2 != null) {
            v0Var2.setAlpha(1.0f);
            profileActivity.P0.setVisibility(i10);
        }
        profileActivity.Q0.setVisibility(i10);
        profileActivity.f35922a0.setAlpha(1.0f);
        profileActivity.U.setAlpha(1.0f);
        oy0 oy0Var2 = profileActivity.f36034q0;
        if (oy0Var2 != null) {
            oy0Var2.setAlpha(1.0f);
        }
        hh.v0 v0Var3 = profileActivity.f36041r0;
        if (v0Var3 != null) {
            v0Var3.setAlpha(1.0f);
        }
        h5VarArr[1].setAlpha(1.0f);
        h5VarArr2[1].setAlpha(1.0f);
        profileActivity.Q0.setAlpha(1.0f);
        profileActivity.f35921a.setAlpha(1.0f);
        profileActivity.f35927b.setAlpha(1.0f);
        profileActivity.L.setAlpha(1.0f);
        if (z10) {
            profileActivity.f35927b.setEmptyView(profileActivity.L);
        } else {
            profileActivity.L.setVisibility(8);
        }
    }

    public static void s3(ProfileActivity profileActivity, boolean z10) {
        Drawable drawable = profileActivity.f35922a0.getImageReceiver().getDrawable();
        String str = null;
        if (drawable instanceof org.telegram.ui.Components.w51) {
            profileActivity.f35922a0.u(null, null, drawable);
            return;
        }
        if (drawable instanceof org.telegram.ui.Components.x5) {
            org.telegram.ui.Components.x5 x5Var = (org.telegram.ui.Components.x5) drawable;
            profileActivity.f35922a0.u(null, null, x5Var);
            if (z10) {
                x5Var.f(profileActivity.f35922a0);
                return;
            }
            return;
        }
        ImageLocation imageLocationD = profileActivity.f35987j0.D(0);
        if (imageLocationD != null && imageLocationD.imageType == 2) {
            str = "avatar";
        }
        profileActivity.f35922a0.u(imageLocationD, str, drawable);
    }

    public final void A3() {
        f2.o1 o1Var;
        View childAt;
        if (this.f35921a.getVisibility() != 0) {
            return;
        }
        if (this.M) {
            this.K.setVisibleHeight(this.f35921a.getMeasuredHeight() - this.K.getTop());
        }
        if (this.f35921a.getChildCount() <= 0 || this.C1) {
            return;
        }
        int i10 = 0;
        while (true) {
            o1Var = null;
            if (i10 >= this.f35921a.getChildCount()) {
                childAt = null;
                break;
            } else {
                if (RecyclerView.R(this.f35921a.getChildAt(i10)) == 0) {
                    childAt = this.f35921a.getChildAt(i10);
                    break;
                }
                i10++;
            }
        }
        if (childAt != null) {
            by0 by0Var = this.f35921a;
            View viewF = by0Var.F(childAt);
            o1Var = (org.telegram.ui.Components.lk0) (viewF != null ? by0Var.T(viewF) : null);
        }
        int top = childAt == null ? 0 : childAt.getTop();
        int iB = o1Var != null ? o1Var.b() : -1;
        if (top < 0 || iB != 0) {
            top = 0;
        }
        boolean z10 = this.m0 == null && this.actionBar.f23578j0;
        int i11 = this.F4;
        if (i11 != -1 && !z10) {
            org.telegram.ui.Components.lk0 lk0Var = (org.telegram.ui.Components.lk0) this.f35921a.K(i11);
            z10 = lk0Var != null && lk0Var.f5789a.getTop() <= 0;
        }
        if (this.B5 != z10) {
            this.B5 = z10;
            AnimatorSet animatorSet = this.f36092y5;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f36098z5;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            org.telegram.ui.ActionBar.v0 searchItem = this.K.getSearchItem();
            org.telegram.ui.Components.ri0 searchOptionsItem = this.K.getSearchOptionsItem();
            TextView saveItem = this.K.getSaveItem();
            int i12 = 11;
            if (this.B5) {
                hz0 hz0Var = this.K;
                if (hz0Var.s0(hz0Var.f29122g0[0].B)) {
                    searchItem.setVisibility(0);
                }
                if (searchOptionsItem != null) {
                    searchOptionsItem.setVisibility(0);
                }
                hz0 hz0Var2 = this.K;
                int i13 = hz0Var2.f29122g0[0].B;
                if (i13 == 0 || org.telegram.ui.Components.hu0.p0(i13) || i13 == 11 || i13 == 13 || (i13 == 14 && hz0Var2.R != null)) {
                    this.K.f29135n0.setVisibility(0);
                    this.K.A(true, false);
                } else {
                    this.K.f29135n0.setVisibility(4);
                    this.K.A(false, false);
                }
            } else {
                if (this.H0) {
                    this.M0.setVisibility(0);
                }
                if (this.I0) {
                    this.N0.setVisibility(0);
                }
                if (this.J0) {
                    this.O0.setVisibility(0);
                }
                this.P0.setVisibility(0);
                if (searchOptionsItem != null) {
                    searchOptionsItem.setVisibility(8);
                }
                if (saveItem != null) {
                    saveItem.setVisibility(8);
                }
            }
            l5(false);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.n().requestLayout();
            }
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.ActionBar.v0 v0Var = this.M0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.ActionBar.v0, Float>) property, z10 ? 0.0f : 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.N0, (Property<org.telegram.ui.ActionBar.v0, Float>) property, z10 ? 0.0f : 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.P0, (Property<org.telegram.ui.ActionBar.v0, Float>) property, z10 ? 0.0f : 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.O0, (Property<org.telegram.ui.ActionBar.v0, Float>) property, z10 ? 0.0f : 1.0f));
            org.telegram.ui.ActionBar.v0 v0Var2 = this.M0;
            Property property2 = View.TRANSLATION_Y;
            arrayList.add(ObjectAnimator.ofFloat(v0Var2, (Property<org.telegram.ui.ActionBar.v0, Float>) property2, z10 ? -AndroidUtilities.dp(10.0f) : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.N0, (Property<org.telegram.ui.ActionBar.v0, Float>) property2, z10 ? -AndroidUtilities.dp(10.0f) : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.P0, (Property<org.telegram.ui.ActionBar.v0, Float>) property2, z10 ? -AndroidUtilities.dp(10.0f) : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.O0, (Property<org.telegram.ui.ActionBar.v0, Float>) property2, z10 ? -AndroidUtilities.dp(10.0f) : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchItem, (Property<org.telegram.ui.ActionBar.v0, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchItem, (Property<org.telegram.ui.ActionBar.v0, Float>) property2, z10 ? 0.0f : AndroidUtilities.dp(10.0f)));
            arrayList.add(ObjectAnimator.ofFloat(this.K.f29135n0, (Property<ImageView, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.K.f29135n0, (Property<ImageView, Float>) property2, z10 ? 0.0f : AndroidUtilities.dp(10.0f)));
            arrayList.add(ObjectAnimator.ofFloat(this.actionBar, this.C5, z10 ? 1.0f : 0.0f));
            org.telegram.ui.ActionBar.h5[] h5VarArr = this.f36040r;
            arrayList.add(ObjectAnimator.ofFloat(h5VarArr[1], (Property<org.telegram.ui.ActionBar.h5, Float>) property, z10 ? 0.0f : 1.0f));
            this.K.E0.setOpen(z10);
            int i14 = 3;
            if (this.f36022o1) {
                arrayList.add(ObjectAnimator.ofFloat(h5VarArr[3], (Property<org.telegram.ui.ActionBar.h5, Float>) property, z10 ? 0.0f : 1.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f36048s, (Property<org.telegram.ui.Components.on0, Float>) property, z10 ? 1.0f : 0.0f));
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this, this.f35964f5, 0.0f));
            }
            if (this.f36034q0 != null || this.f36041r0 != null) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new lx0(this, i14));
                arrayList.add(valueAnimatorOfFloat);
            }
            C3();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f36092y5 = animatorSet3;
            animatorSet3.playTogether(arrayList);
            this.f36092y5.setInterpolator(org.telegram.ui.Components.er.f28122f);
            this.f36092y5.addListener(new org.telegram.ui.Components.fk0(i12, this, searchItem));
            this.f36092y5.setDuration(150L);
            this.f36092y5.start();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        }
        float f10 = top;
        if (this.M1 == f10 || this.D1) {
            return;
        }
        this.M1 = f10;
        this.Z0.invalidate();
        if (this.F1 != 0) {
            this.I1 = this.M1 > ((float) O3());
        }
        k4(true);
    }

    public final void A4(int i10, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        boolean[] zArr = new boolean[1];
        ty0 ty0Var = new ty0(this, user.f22527id, this.f35929b1, tL_chatAdminRights, this.A2.default_banned_rights, tL_chatBannedRights, str, i10, zArr, user);
        ty0Var.T0 = new uy0(this, i10, chatParticipant, z10, zArr);
        presentFragment(ty0Var);
    }

    public final void B3() {
        int i10 = this.F1;
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f36040r;
        if (i10 == 1 && (!this.f35978h5 || this.C1)) {
            this.U5 = 0.0f;
        } else if (i10 == 2 && (!this.f35978h5 || this.C1)) {
            org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[1];
            this.U5 = h5Var == null ? 0.0f : h5Var.getAlpha();
        } else if (this.f35923a1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
            this.U5 = (1.0f - this.f35992j5) * this.f35968g2;
        } else {
            this.U5 = this.f35968g2 * this.f35992j5;
        }
        if (this.f35923a1 != UserConfig.getInstance(this.currentAccount).clientUserId) {
            if (this.f36011m5) {
                org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[2];
                if (h5Var2 != null) {
                    h5Var2.setAlpha(this.U5);
                }
                h01 h01Var = this.X5;
                if (h01Var != null) {
                    h01Var.f38655e = 1.0f - this.U5;
                    h01Var.invalidateSelf();
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.h5 h5Var3 = h5VarArr[2];
            if (h5Var3 != null) {
                h5Var3.setAlpha(0.0f);
            }
            h01 h01Var2 = this.X5;
            if (h01Var2 != null) {
                h01Var2.f38655e = 1.0f;
                h01Var2.invalidateSelf();
                return;
            }
            return;
        }
        if (!this.f36005l5) {
            org.telegram.ui.ActionBar.h5 h5Var4 = h5VarArr[2];
            if (h5Var4 != null) {
                h5Var4.setAlpha(0.0f);
                h5VarArr[3].setAlpha(0.0f);
            }
            h01 h01Var3 = this.X5;
            if (h01Var3 != null) {
                h01Var3.f38655e = 1.0f;
                h01Var3.invalidateSelf();
                return;
            }
            return;
        }
        this.f35999k5 = AndroidUtilities.dp(28.0f) * this.U5;
        org.telegram.ui.ActionBar.h5 h5Var5 = h5VarArr[2];
        if (h5Var5 != null) {
            h5Var5.setAlpha(this.f35968g2);
            h5VarArr[3].setAlpha(1.0f - this.f35968g2);
            h5VarArr[1].setTranslationX(W3(this.V5));
            this.V.invalidate();
            h01 h01Var4 = this.X5;
            if (h01Var4 != null) {
                h01Var4.f38655e = 1.0f - this.f35968g2;
                h01Var4.invalidateSelf();
            }
        }
    }

    public final void B4(String str, org.telegram.ui.Cells.h hVar) {
        if (str.startsWith("@")) {
            getMessagesController().openByUserName(str.substring(1), this, 0, hVar);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            gy gyVar = new gy(null);
            gyVar.f38547j2 = str;
            presentFragment(gyVar);
        } else {
            if (!str.startsWith("/") || this.parentLayout.getFragmentStack().size() <= 1) {
                return;
            }
            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            if (n2Var instanceof rn) {
                finishFragment();
                ((rn) n2Var).U.Z0(null, str, false, false);
            }
        }
    }

    public final void C3() {
        org.telegram.ui.Components.sv0 sv0Var = this.P;
        if (sv0Var != null) {
            sv0Var.setVisibility(!this.B5 && this.D5);
        }
    }

    public final boolean C4(float f10, float f11, int i10, View view) {
        TLRPC.Chat chat;
        String publicUsername;
        TLRPC.TL_username tL_usernameFindUsername;
        TLRPC.Chat chat2;
        String string;
        vy0 vy0Var;
        String str;
        TLRPC.UserFull userFull;
        TLRPC.UserFull userFull2;
        String strF0;
        float x8;
        float y10;
        ViewGroup view2;
        View view3 = view;
        int i11 = 4;
        String str2 = "";
        int i12 = 1;
        int i13 = 0;
        if (i10 == this.H3 || i10 == this.R2) {
            if (this.f35923a1 == 0) {
                if (this.f35929b1 != 0 && (chat = getMessagesController().getChat(Long.valueOf(this.f35929b1))) != null && (this.f35937c1 != 0 || ChatObject.isPublic(chat))) {
                    publicUsername = ChatObject.getPublicUsername(chat);
                    tL_usernameFindUsername = DialogObject.findUsername(publicUsername, chat);
                    if (this.f35923a1 == 0) {
                        chat2 = getMessagesController().getChat(Long.valueOf(this.f35929b1));
                        if (ChatObject.isPublic(chat2)) {
                            StringBuilder sb2 = new StringBuilder("https://");
                            sb2.append(getMessagesController().linkPrefix);
                            sb2.append("/");
                            sb2.append(ChatObject.getPublicUsername(chat2));
                            if (this.f35937c1 != 0) {
                                str2 = "/" + this.f35937c1;
                            }
                            sb2.append(str2);
                            string = sb2.toString();
                        } else {
                            StringBuilder sb3 = new StringBuilder("https://");
                            sb3.append(getMessagesController().linkPrefix);
                            sb3.append("/c/");
                            sb3.append(chat2.f22380id);
                            if (this.f35937c1 != 0) {
                                str2 = "/" + this.f35937c1;
                            }
                            sb3.append(str2);
                            string = sb3.toString();
                        }
                        vy0Var = new vy0(this, getParentActivity(), string, string);
                        showDialog(vy0Var);
                        if (tL_usernameFindUsername != null) {
                            TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                            TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                            tL_inputCollectibleUsername.username = tL_usernameFindUsername.username;
                            tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo, new lr0(this, tL_usernameFindUsername, vy0Var, i11)), getClassGuid());
                            return true;
                        }
                    } else if (!J3(i10, view3)) {
                        if (tL_usernameFindUsername == null) {
                        }
                        org.telegram.ui.Components.mc.a0(this).i(LocaleController.getString(R.string.UsernameCopied)).j();
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "@" + publicUsername));
                        return true;
                    }
                }
                return false;
            }
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f35923a1));
            publicUsername = UserObject.getPublicUsername(user);
            if (user != null && publicUsername != null) {
                tL_usernameFindUsername = DialogObject.findUsername(publicUsername, user);
                if (this.f35923a1 == 0) {
                    chat2 = getMessagesController().getChat(Long.valueOf(this.f35929b1));
                    if (ChatObject.isPublic(chat2)) {
                        StringBuilder sb4 = new StringBuilder("https://");
                        sb4.append(getMessagesController().linkPrefix);
                        sb4.append("/");
                        sb4.append(ChatObject.getPublicUsername(chat2));
                        if (this.f35937c1 != 0) {
                            str2 = "/" + this.f35937c1;
                        }
                        sb4.append(str2);
                        string = sb4.toString();
                    } else {
                        StringBuilder sb5 = new StringBuilder("https://");
                        sb5.append(getMessagesController().linkPrefix);
                        sb5.append("/c/");
                        sb5.append(chat2.f22380id);
                        if (this.f35937c1 != 0) {
                            str2 = "/" + this.f35937c1;
                        }
                        sb5.append(str2);
                        string = sb5.toString();
                    }
                    vy0Var = new vy0(this, getParentActivity(), string, string);
                    showDialog(vy0Var);
                    if (tL_usernameFindUsername != null && !tL_usernameFindUsername.editable) {
                        TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo2 = new TL_fragment.TL_getCollectibleInfo();
                        TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername2 = new TL_fragment.TL_inputCollectibleUsername();
                        tL_inputCollectibleUsername2.username = tL_usernameFindUsername.username;
                        tL_getCollectibleInfo2.collectible = tL_inputCollectibleUsername2;
                        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo2, new lr0(this, tL_usernameFindUsername, vy0Var, i11)), getClassGuid());
                        return true;
                    }
                } else if (!J3(i10, view3)) {
                    if (tL_usernameFindUsername == null && !tL_usernameFindUsername.editable) {
                        TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo3 = new TL_fragment.TL_getCollectibleInfo();
                        TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername3 = new TL_fragment.TL_inputCollectibleUsername();
                        tL_inputCollectibleUsername3.username = tL_usernameFindUsername.username;
                        tL_getCollectibleInfo3.collectible = tL_inputCollectibleUsername3;
                        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo3, new v80(20, this, tL_usernameFindUsername)), getClassGuid());
                        return true;
                    }
                    try {
                        org.telegram.ui.Components.mc.a0(this).i(LocaleController.getString(R.string.UsernameCopied)).j();
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "@" + publicUsername));
                        return true;
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        return true;
                    }
                }
            }
            return false;
            return true;
        }
        if (i10 != this.D3) {
            int i14 = 2;
            if (i10 == this.C3 || i10 == this.P2) {
                if (!J3(i10, view3)) {
                    TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(this.f35923a1));
                    if (user2 != null && (str = user2.phone) != null && str.length() != 0 && getParentActivity() != null) {
                        if (i10 == this.C3 && user2.phone.startsWith("888")) {
                            TL_fragment.TL_inputCollectiblePhone tL_inputCollectiblePhone = new TL_fragment.TL_inputCollectiblePhone();
                            String str3 = user2.phone;
                            tL_inputCollectiblePhone.phone = str3;
                            TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo4 = new TL_fragment.TL_getCollectibleInfo();
                            tL_getCollectibleInfo4.collectible = tL_inputCollectiblePhone;
                            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo4, new lr0(this, str3, user2, 5)), getClassGuid());
                            return true;
                        }
                        org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(this, view3);
                        b70VarH.W(this.f35921a.V0(view3, false));
                        b70VarH.f26995w = false;
                        if (i10 == this.C3) {
                            TLRPC.UserFull userFull3 = this.f36043r2;
                            if (userFull3 != null && userFull3.phone_calls_available) {
                                b70VarH.c(R.drawable.msg_calls, LocaleController.getString(R.string.CallViaTelegram), new dx0(this, user2, i12), false);
                                if (this.f36043r2.video_calls_available) {
                                    b70VarH.c(R.drawable.msg_videocall, LocaleController.getString(R.string.VideoCallViaTelegram), new dx0(this, user2, i14), false);
                                }
                            }
                            if (!this.X4) {
                                b70VarH.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.Call), new dx0(this, user2, 3), false);
                            }
                        }
                        b70VarH.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new dx0(this, user2, i11), false);
                        if (this.X4) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AnonymousNumberNotice)));
                            int iIndexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '*');
                            int iLastIndexOf = TextUtils.lastIndexOf(spannableStringBuilder, '*');
                            if (iIndexOf != -1 && iLastIndexOf != -1 && iIndexOf != iLastIndexOf) {
                                spannableStringBuilder.replace(iLastIndexOf, iLastIndexOf + 1, (CharSequence) "");
                                spannableStringBuilder.replace(iIndexOf, iIndexOf + 1, (CharSequence) "");
                                int i15 = iLastIndexOf - 1;
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.k41(AndroidUtilities.bold()), iIndexOf, i15, 33);
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I6, this.f36067v0)), iIndexOf, i15, 33);
                            }
                            b70VarH.k();
                            b70VarH.p(13, AndroidUtilities.dp(200.0f), spannableStringBuilder);
                            if (b70VarH.z() instanceof TextView) {
                                TextView textView = (TextView) b70VarH.z();
                                textView.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, this.f36067v0), 0, 6));
                                textView.setOnClickListener(new ag.l2(25));
                            }
                        }
                        b70VarH.Z();
                        return true;
                    }
                }
                return true;
            }
            if (i10 == this.G3 || i10 == this.F3 || i10 == this.E3 || i10 == this.S2) {
                if (i10 != this.S2 || ((userFull = this.f36043r2) != null && !TextUtils.isEmpty(userFull.about))) {
                    if (!J3(i10, view3)) {
                        if (view3 instanceof org.telegram.ui.Cells.j) {
                            org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) view3;
                            if (jVar.S && jVar.P <= 0.0f) {
                                jVar.h();
                                return false;
                            }
                        }
                        String str4 = null;
                        if (i10 == this.E3) {
                            TLRPC.ChatFull chatFull = this.f36036q2;
                            if (chatFull != null) {
                                TLRPC.ChannelLocation channelLocation = chatFull.location;
                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                    str4 = ((TLRPC.TL_channelLocation) channelLocation).address;
                                }
                            }
                        } else if (i10 == this.G3) {
                            TLRPC.ChatFull chatFull2 = this.f36036q2;
                            if (chatFull2 != null) {
                                str4 = chatFull2.about;
                            }
                        } else {
                            TLRPC.UserFull userFull4 = this.f36043r2;
                            if (userFull4 != null) {
                                str4 = userFull4.about;
                            }
                        }
                        String str5 = str4;
                        if (!TextUtils.isEmpty(str5)) {
                            String[] strArr = {"und"};
                            boolean zIsContextTranslateEnabled = MessagesController.getInstance(this.currentAccount).getTranslateController().isContextTranslateEnabled();
                            boolean[] zArr = {i10 == this.S2 || i10 == this.G3 || i10 == this.F3};
                            String strC = org.telegram.ui.Components.b31.C();
                            gh.p2 p2Var = new gh.p2(this, view3, str5, i10, zArr, strArr, strC);
                            if (!zArr[0]) {
                                p2Var.run();
                                return true;
                            }
                            if (LanguageDetector.hasSupport()) {
                                LanguageDetector.detectLanguage(str5, new org.telegram.messenger.gj(this, strArr, zArr, strC, zIsContextTranslateEnabled, p2Var), new dl0(p2Var, 12));
                                return true;
                            }
                            p2Var.run();
                            return true;
                        }
                    }
                    return true;
                }
            } else if ((i10 == this.K3 || i10 == this.L3) && getParentActivity() != null && (userFull2 = this.f36043r2) != null) {
                if (i10 != this.K3) {
                    if (i10 == this.L3 && !J3(i10, view3)) {
                        TLRPC.TL_businessLocation tL_businessLocation = this.f36043r2.business_location;
                        if (tL_businessLocation != null) {
                            strF0 = tL_businessLocation.address;
                            String str6 = strF0;
                            AtomicReference atomicReference = new AtomicReference();
                            org.telegram.ui.Components.ao aoVar = new org.telegram.ui.Components.ao(getParentActivity(), R.drawable.popup_fixed_alert, i13, this.f36067v0, 1);
                            aoVar.Q = new Path();
                            aoVar.setFitItems(true);
                            org.telegram.ui.ActionBar.v0.c(false, false, aoVar, R.drawable.msg_copy, LocaleController.getString(R.string.Copy), false, this.f36067v0).setOnClickListener(new jh.l5(this, atomicReference, str6, i10, 5));
                            org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(aoVar, -2, -2);
                            n1Var.f23684e = true;
                            n1Var.f23683c = 220;
                            n1Var.setOutsideTouchable(true);
                            n1Var.setClippingEnabled(true);
                            n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                            n1Var.setFocusable(true);
                            aoVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                            n1Var.setInputMethodMode(2);
                            n1Var.getContentView().setFocusableInTouchMode(true);
                            atomicReference.set(n1Var);
                            x8 = f10;
                            y10 = f11;
                            while (view3 != null) {
                                x8 += view3.getX();
                                y10 += view3.getY();
                                view3 = (View) view3.getParent();
                            }
                            if (AndroidUtilities.isTablet()) {
                                x8 += view2.getX() + view2.getPaddingLeft();
                                y10 += view2.getY() + view2.getPaddingTop();
                            }
                            n1Var.showAtLocation(getFragmentView(), 0, (int) (x8 - (aoVar.getMeasuredWidth() / 2.0f)), (int) y10);
                            n1Var.b();
                            return true;
                        }
                    }
                    return true;
                }
                TL_account.TL_businessWorkHours tL_businessWorkHours = userFull2.business_work_hours;
                if (tL_businessWorkHours != null) {
                    strF0 = qf.y0.f0(this.currentAccount, userFull2.user, tL_businessWorkHours);
                    String str7 = strF0;
                    AtomicReference atomicReference2 = new AtomicReference();
                    org.telegram.ui.Components.ao aoVar2 = new org.telegram.ui.Components.ao(getParentActivity(), R.drawable.popup_fixed_alert, i13, this.f36067v0, 1);
                    aoVar2.Q = new Path();
                    aoVar2.setFitItems(true);
                    org.telegram.ui.ActionBar.v0.c(false, false, aoVar2, R.drawable.msg_copy, LocaleController.getString(R.string.Copy), false, this.f36067v0).setOnClickListener(new jh.l5(this, atomicReference2, str7, i10, 5));
                    org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(aoVar2, -2, -2);
                    n1Var2.f23684e = true;
                    n1Var2.f23683c = 220;
                    n1Var2.setOutsideTouchable(true);
                    n1Var2.setClippingEnabled(true);
                    n1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                    n1Var2.setFocusable(true);
                    aoVar2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    n1Var2.setInputMethodMode(2);
                    n1Var2.getContentView().setFocusableInTouchMode(true);
                    atomicReference2.set(n1Var2);
                    x8 = f10;
                    y10 = f11;
                    while (view3 != null && view3 != getFragmentView()) {
                        x8 += view3.getX();
                        y10 += view3.getY();
                        view3 = (View) view3.getParent();
                    }
                    if (AndroidUtilities.isTablet() && (view2 = this.parentLayout.getView()) != null) {
                        x8 += view2.getX() + view2.getPaddingLeft();
                        y10 += view2.getY() + view2.getPaddingTop();
                    }
                    n1Var2.showAtLocation(getFragmentView(), 0, (int) (x8 - (aoVar2.getMeasuredWidth() / 2.0f)), (int) y10);
                    n1Var2.b();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean D() {
        return false;
    }

    public final void D3(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        TLRPC.ChatFull chatFull;
        boolean z19;
        boolean z20;
        boolean z21;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z22;
        boolean z23;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        boolean z24;
        TLRPC.ChatFull chatFull2;
        ChatObject.Call groupCall;
        boolean z25;
        org.telegram.ui.Components.rg0 rg0Var;
        yz0 yz0Var;
        hz0 hz0Var;
        boolean z26;
        org.telegram.ui.Components.rg0 rg0Var2;
        TLRPC.Chat chat;
        boolean z27;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null || this.P0 == null) {
            return;
        }
        Context context = kVar.getContext();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.P0.f23854b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        this.L0 = null;
        this.J0 = false;
        this.H0 = false;
        this.G0 = false;
        this.I0 = false;
        this.f36074w1 = false;
        if (this.f35923a1 == 0) {
            if (this.f35929b1 != 0) {
                TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.f35929b1));
                this.l1 = false;
                if (this.f35937c1 == 0 && ChatObject.canChangeChatInfo(chat2)) {
                    E3(context);
                }
                if (ChatObject.isChannel(chat2)) {
                    if (this.f36007m1) {
                        if (ChatObject.canManageTopic(this.currentAccount, chat2, this.f35937c1)) {
                            this.J0 = true;
                        }
                    } else if (ChatObject.hasAdminRights(chat2) || (chat2.megagroup && ChatObject.canChangeChatInfo(chat2))) {
                        this.J0 = true;
                    }
                    if (this.f36036q2 != null) {
                        if (ChatObject.canManageCalls(chat2) && this.f36036q2.call == null) {
                            this.P0.e(15, R.drawable.msg_voicechat, LocaleController.getString((!chat2.megagroup || chat2.gigagroup) ? R.string.StartVoipChannel : R.string.StartVoipChat));
                            this.l1 = true;
                            if (!chat2.megagroup || chat2.gigagroup) {
                                z24 = false;
                                z20 = true;
                            } else {
                                z24 = true;
                            }
                            chatFull2 = this.f36036q2;
                            if ((chatFull2.can_view_stats || chatFull2.can_view_revenue || chatFull2.can_view_stars_revenue || getMessagesController().getStoriesController().j(a())) && this.f35937c1 == 0) {
                                this.P0.e(19, R.drawable.msg_stats, LocaleController.getString(R.string.Statistics));
                            }
                            groupCall = getMessagesController().getGroupCall(this.f35929b1, false);
                            if (groupCall != null) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            this.H0 = z25;
                            if (groupCall == null || z24) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        } else {
                            z24 = false;
                        }
                        z20 = false;
                        chatFull2 = this.f36036q2;
                        if (chatFull2.can_view_stats) {
                            this.P0.e(19, R.drawable.msg_stats, LocaleController.getString(R.string.Statistics));
                        } else {
                            this.P0.e(19, R.drawable.msg_stats, LocaleController.getString(R.string.Statistics));
                        }
                        groupCall = getMessagesController().getGroupCall(this.f35929b1, false);
                        if (groupCall != null) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        this.H0 = z25;
                        if (groupCall == null) {
                            z12 = true;
                        } else {
                            z12 = true;
                        }
                    } else {
                        z12 = false;
                        z20 = false;
                    }
                    getMessagesController().getStoriesController().getClass();
                    if (chat2 == null || !ChatObject.isBoostSupported(chat2) || (!chat2.creator && ((tL_chatAdminRights2 = chat2.admin_rights) == null || !tL_chatAdminRights2.post_stories))) {
                        getMessagesController().getStoriesController().getClass();
                        if (chat2 != null && ChatObject.isBoostSupported(chat2) && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.edit_stories))) {
                            this.P0.e(39, R.drawable.msg_archive, LocaleController.getString(R.string.OpenChannelArchiveStories));
                        }
                        z21 = false;
                    } else {
                        this.P0.e(39, R.drawable.msg_archive, LocaleController.getString(R.string.OpenChannelArchiveStories));
                        z21 = true;
                    }
                    if (chat2.megagroup) {
                        TLRPC.ChatFull chatFull3 = this.f36036q2;
                        if (chatFull3 == null || !chatFull3.participants_hidden || ChatObject.hasAdminRights(chat2)) {
                            this.f36074w1 = true;
                            this.P0.e(17, R.drawable.msg_search, LocaleController.getString(R.string.SearchMembers));
                        }
                        if (this.f36007m1) {
                            z22 = z20;
                            if (ChatObject.canDeleteTopic(this.currentAccount, chat2, this.f35937c1)) {
                                this.P0.e(23, R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", 1));
                            }
                        } else {
                            z22 = z20;
                        }
                        if (this.f35937c1 == 0) {
                            this.P0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                        }
                        if (chat2.creator) {
                            this.P0.a(-1);
                            this.P0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMega));
                            this.P0.e(45, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteMega)).c(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284q7, this.f36067v0), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23269p7, this.f36067v0));
                        } else if (chat2.left || chat2.kicked || this.f36007m1) {
                            z12 = z12;
                            z16 = z21;
                            z11 = false;
                            z13 = false;
                            z14 = false;
                            z17 = false;
                            z18 = false;
                        } else {
                            this.P0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMega));
                        }
                        z12 = z12;
                        z16 = z21;
                        z11 = false;
                        z13 = false;
                        z14 = false;
                        z17 = false;
                        z18 = true;
                    } else {
                        z22 = z20;
                        if (ChatObject.isPublic(chat2)) {
                            this.P0.e(10, R.drawable.msg_share, LocaleController.getString(R.string.BotShare));
                            z23 = !chat2.creator;
                        } else {
                            z23 = false;
                        }
                        if (BuildVars.IS_BILLING_UNAVAILABLE || getMessagesController().premiumPurchaseBlocked()) {
                            z14 = false;
                        } else {
                            hh.u7.y(this.currentAccount, false).V();
                            this.P0.e(38, R.drawable.msg_gift_premium, LocaleController.getString(R.string.ProfileSendAGiftToChannel));
                            org.telegram.ui.ActionBar.v0 v0Var = this.P0;
                            TLRPC.ChatFull chatFull4 = this.f36036q2;
                            v0Var.I(38, chatFull4 != null && chatFull4.stargifts_available);
                            z14 = true;
                        }
                        TLRPC.ChatFull chatFull5 = this.f36036q2;
                        if (chatFull5 == null || chatFull5.linked_chat_id == 0) {
                            z17 = false;
                        } else {
                            this.P0.e(22, R.drawable.msg_discussion, LocaleController.getString(R.string.ViewDiscussion));
                            z17 = true;
                        }
                        if (this.f35937c1 == 0) {
                            this.P0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                        }
                        TLRPC.Chat chat3 = this.A2;
                        if (chat3.creator) {
                            this.P0.a(-1);
                            this.P0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveChannel));
                            this.P0.e(45, R.drawable.msg_delete, LocaleController.getString(R.string.ChannelDelete)).c(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284q7, this.f36067v0), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23269p7, this.f36067v0));
                        } else {
                            if (chat3.left || chat3.kicked) {
                                z11 = z23;
                                z18 = false;
                            } else {
                                this.P0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveChannel));
                            }
                            z16 = z21;
                            z13 = false;
                        }
                        z11 = z23;
                        z18 = true;
                        z16 = z21;
                        z13 = false;
                    }
                } else {
                    if (this.f36036q2 == null) {
                        z15 = false;
                    } else {
                        if (ChatObject.canManageCalls(chat2) && this.f36036q2.call == null) {
                            this.P0.e(15, R.drawable.msg_voicechat, LocaleController.getString(R.string.StartVoipChat));
                            this.l1 = true;
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        ChatObject.Call groupCall2 = getMessagesController().getGroupCall(this.f35929b1, false);
                        this.H0 = groupCall2 != null;
                        if (groupCall2 != null || z19) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    }
                    if (ChatObject.canChangeChatInfo(chat2)) {
                        this.J0 = true;
                    }
                    if (!ChatObject.isKickedFromChat(chat2) && !ChatObject.isLeftFromChat(chat2) && ((chatFull = this.f36036q2) == null || !chatFull.participants_hidden || ChatObject.hasAdminRights(chat2))) {
                        this.f36074w1 = true;
                        this.P0.e(17, R.drawable.msg_search, LocaleController.getString(R.string.SearchMembers));
                    }
                    if (this.f35937c1 == 0) {
                        this.P0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                    }
                    this.P0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.DeleteAndExit));
                    z12 = z15;
                    z11 = false;
                    z13 = false;
                    z14 = false;
                    z16 = false;
                    z17 = false;
                    z18 = true;
                    z22 = false;
                }
            } else {
                z11 = false;
                z12 = false;
                z13 = false;
                z14 = false;
            }
            if (this.m0 != null) {
                this.P0.e(33, R.drawable.msg_openprofile, LocaleController.getString(R.string.SetAsMain));
                this.P0.e(21, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery));
                this.P0.e(35, R.drawable.msg_delete, LocaleController.getString(R.string.Delete));
            } else {
                this.P0.e(21, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery));
            }
            if (g4()) {
                this.P0.r(21);
            }
            if (this.f35923a1 != 0 && !this.f36016n2 && !this.f36022o1) {
                org.telegram.ui.ActionBar.f1 f1VarE = this.P0.e(24, R.drawable.msg_report, LocaleController.getString(R.string.ReportBot));
                int i10 = org.telegram.ui.ActionBar.g6.f23269p7;
                f1VarE.c(org.telegram.ui.ActionBar.g6.v0(i10, this.f36067v0), org.telegram.ui.ActionBar.g6.v0(i10, this.f36067v0));
            }
            if (z13 && !this.f36022o1) {
                this.P0.e(31, R.drawable.msg_leave, LocaleController.getString(R.string.LogOut));
            }
            if (!this.f36002l2) {
                this.P0.r(21);
                this.P0.r(33);
                this.P0.K(36);
                this.P0.r(34);
                this.P0.r(35);
            }
            this.G0 = this.H0;
            rg0Var = this.W;
            if (rg0Var != null) {
                rg0Var.E = true;
                rg0Var.o(4, z11);
                this.W.o(5, this.H0);
                this.W.o(6, this.I0);
                this.W.o(2, z17);
                this.W.o(9, z18);
                this.W.o(12, z16);
                this.W.o(10, z12);
                this.W.o(11, z22);
                this.W.o(3, z14);
                this.I0 = false;
                this.H0 = false;
                if (z17) {
                    z26 = false;
                } else {
                    if (this.f36007m1) {
                        this.W.o(0, true);
                    } else if (this.f35929b1 != 0) {
                        chat = getMessagesController().getChat(Long.valueOf(this.f35929b1));
                        if (!ChatObject.isForum(chat) || ChatObject.isMegagroup(chat)) {
                            z26 = false;
                            this.W.o(0, true);
                        } else if (!ChatObject.isChannel(chat)) {
                            z26 = false;
                            this.W.o(0, true);
                        }
                    }
                    z26 = false;
                }
                rg0Var2 = this.W;
                if (rg0Var2.E) {
                    rg0Var2.E = z26;
                    rg0Var2.d();
                }
            }
            if (!this.B5) {
                if (this.H0) {
                    if (this.M0.getVisibility() != 0) {
                        this.M0.setVisibility(0);
                        if (z10) {
                            this.M0.setAlpha(0.0f);
                            this.M0.animate().alpha(1.0f).setDuration(150L).start();
                        }
                    }
                } else if (this.M0.getVisibility() != 8) {
                    this.M0.setVisibility(8);
                }
                if (this.I0) {
                    if (this.N0.getVisibility() != 0) {
                        this.N0.setVisibility(0);
                        if (z10) {
                            this.N0.setAlpha(0.0f);
                            this.N0.animate().alpha(1.0f).setDuration(150L).start();
                        }
                    }
                } else if (this.N0.getVisibility() != 8) {
                    this.N0.setVisibility(8);
                }
                if (this.J0) {
                    if (this.O0.getVisibility() != 0) {
                        this.O0.setVisibility(0);
                        if (z10) {
                            this.O0.setAlpha(0.0f);
                            this.O0.animate().alpha(1.0f).setDuration(150L).start();
                        }
                    }
                } else if (this.O0.getVisibility() != 8) {
                    this.O0.setVisibility(8);
                }
            }
            yz0Var = this.f35994k0;
            if (yz0Var != null && yz0Var.h && !yz0Var.d.isRunning()) {
                if (this.J0) {
                    this.O0.setVisibility(8);
                    this.O0.animate().cancel();
                    this.O0.setAlpha(1.0f);
                }
                if (this.H0) {
                    this.M0.setVisibility(8);
                    this.M0.animate().cancel();
                    this.M0.setAlpha(1.0f);
                }
                if (this.I0) {
                    this.N0.setVisibility(8);
                    this.N0.animate().cancel();
                    this.N0.setAlpha(1.0f);
                }
            }
            hz0Var = this.K;
            if (hz0Var != null) {
                hz0Var.getSearchItem().requestLayout();
            }
            l5(false);
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f35923a1));
        if (user == null) {
            return;
        }
        if (UserObject.isUserSelf(user)) {
            if (this.f36022o1) {
                org.telegram.ui.Components.rg0 rg0Var3 = this.W;
                if (rg0Var3 != null) {
                    this.J0 = !(rg0Var3.D == 6);
                } else {
                    this.J0 = true;
                }
            }
            if (!this.E0) {
                this.P0.e(30, R.drawable.msg_edit, LocaleController.getString(R.string.EditInfo));
                if (this.m0 != null) {
                    this.P0.e(36, R.drawable.msg_addphoto, LocaleController.getString(R.string.AddPhoto));
                }
            }
            this.R0 = this.P0.e(40, R.drawable.menu_profile_colors, LocaleController.getString(R.string.ProfileColorEdit));
            W4();
            if (this.f36022o1) {
                this.T0 = this.P0.e(43, R.drawable.menu_username_change, LocaleController.getString(R.string.ProfileUsernameEdit));
                this.S0 = this.P0.e(42, R.drawable.msg_link2, LocaleController.getString(R.string.ProfileCopyLink));
                c5();
            }
            z11 = false;
            z27 = false;
            z13 = true;
        } else {
            if (user.bot && user.bot_can_edit) {
                this.J0 = true;
            }
            TLRPC.UserFull userFull = this.f36043r2;
            if (userFull != null && userFull.phone_calls_available) {
                this.H0 = true;
                this.I0 = userFull.video_calls_available;
            }
            if (!this.f36016n2 && getContactsController().contactsDict.get(Long.valueOf(this.f35923a1)) != null) {
                if (this.f36095z2 == null) {
                    E3(context);
                }
                if (!TextUtils.isEmpty(user.phone)) {
                    this.P0.e(3, R.drawable.msg_share, LocaleController.getString(R.string.ShareContact));
                }
                this.P0.e(2, R.drawable.msg_block, LocaleController.getString(!this.f35967g1 ? R.string.BlockContact : R.string.Unblock));
                this.P0.e(4, R.drawable.msg_edit, LocaleController.getString(R.string.EditContact));
                this.P0.e(5, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteContact));
            } else if (MessagesController.isSupportUser(user)) {
                if (this.f35967g1) {
                    this.P0.e(2, R.drawable.msg_block, LocaleController.getString(R.string.Unblock));
                }
                this.P0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
            } else {
                if (a() != 489000) {
                    if (this.f36095z2 == null) {
                        E3(context);
                    }
                    this.P0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                    if (this.f36016n2) {
                        this.P0.e(10, R.drawable.msg_share, LocaleController.getString(R.string.BotShare));
                        z11 = true;
                    } else {
                        this.P0.e(1, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddContact));
                        z11 = false;
                    }
                    if (!TextUtils.isEmpty(user.phone)) {
                        this.P0.e(3, R.drawable.msg_share, LocaleController.getString(R.string.ShareContact));
                    }
                    if (this.f36016n2) {
                        this.P0.e(44, R.drawable.menu_privacy_policy, LocaleController.getString(R.string.BotPrivacyPolicy));
                        if (e4()) {
                            this.P0.K(44);
                        } else {
                            this.P0.r(44);
                        }
                        org.telegram.ui.ActionBar.f1 f1VarE2 = this.P0.e(24, R.drawable.msg_report, LocaleController.getString(R.string.ReportBot));
                        int i11 = org.telegram.ui.ActionBar.g6.f23269p7;
                        f1VarE2.c(org.telegram.ui.ActionBar.g6.v0(i11, this.f36067v0), org.telegram.ui.ActionBar.g6.v0(i11, this.f36067v0));
                        if (this.f35967g1) {
                            this.P0.e(2, R.drawable.msg_retry, LocaleController.getString(R.string.BotRestart));
                        } else {
                            this.P0.e(2, R.drawable.msg_block2, LocaleController.getString(R.string.DeleteAndBlock)).c(org.telegram.ui.ActionBar.g6.v0(i11, this.f36067v0), org.telegram.ui.ActionBar.g6.v0(i11, this.f36067v0));
                        }
                    } else {
                        this.P0.e(2, R.drawable.msg_block, LocaleController.getString(!this.f35967g1 ? R.string.BlockContact : R.string.Unblock));
                    }
                }
                if (!UserObject.isDeleted(user) || this.f36016n2 || this.f36095z2 != null || this.f35967g1) {
                    z27 = false;
                } else {
                    long j10 = this.f35923a1;
                    if (j10 == 333000 || j10 == 777000 || j10 == 42777) {
                        z27 = false;
                    } else {
                        if (BuildVars.IS_BILLING_UNAVAILABLE || user.self || user.bot || MessagesController.isSupportUser(user) || getMessagesController().premiumPurchaseBlocked()) {
                            z27 = false;
                        } else {
                            hh.u7.y(this.currentAccount, false).V();
                            this.P0.e(38, R.drawable.msg_gift_premium, LocaleController.getString(R.string.ProfileSendAGift));
                            z27 = true;
                        }
                        this.P0.e(20, R.drawable.msg_secret, LocaleController.getString(R.string.StartEncryptedChat));
                        this.P0.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.f35923a1)));
                        if (this.f36043r2 != null) {
                            this.P0.e(46, R.drawable.menu_share_off_24, LocaleController.getString(R.string.DisableSharing));
                            this.P0.e(47, R.drawable.menu_share_on_24, LocaleController.getString(R.string.EnableSharing));
                            TLRPC.UserFull userFull2 = this.f36043r2;
                            boolean z28 = (userFull2.noforwards_my_enabled || userFull2.noforwards_peer_enabled) ? false : true;
                            this.P0.I(46, z28);
                            this.P0.I(47, !z28);
                        }
                    }
                }
                if (!this.f36016n2 && getContactsController().contactsDict.get(Long.valueOf(this.f35923a1)) != null) {
                    this.P0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                }
                z13 = false;
            }
            z11 = false;
            if (UserObject.isDeleted(user)) {
                z27 = false;
            } else {
                z27 = false;
            }
            if (!this.f36016n2) {
                this.P0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
            }
            z13 = false;
        }
        z14 = z27;
        z12 = false;
        z16 = false;
        z17 = false;
        z18 = false;
        z22 = false;
        if (this.m0 != null) {
            this.P0.e(33, R.drawable.msg_openprofile, LocaleController.getString(R.string.SetAsMain));
            this.P0.e(21, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery));
            this.P0.e(35, R.drawable.msg_delete, LocaleController.getString(R.string.Delete));
        } else {
            this.P0.e(21, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery));
        }
        if (g4()) {
            this.P0.r(21);
        }
        if (this.f35923a1 != 0) {
            org.telegram.ui.ActionBar.f1 f1VarE3 = this.P0.e(24, R.drawable.msg_report, LocaleController.getString(R.string.ReportBot));
            int i12 = org.telegram.ui.ActionBar.g6.f23269p7;
            f1VarE3.c(org.telegram.ui.ActionBar.g6.v0(i12, this.f36067v0), org.telegram.ui.ActionBar.g6.v0(i12, this.f36067v0));
        }
        if (z13) {
            this.P0.e(31, R.drawable.msg_leave, LocaleController.getString(R.string.LogOut));
        }
        if (!this.f36002l2) {
            this.P0.r(21);
            this.P0.r(33);
            this.P0.K(36);
            this.P0.r(34);
            this.P0.r(35);
        }
        this.G0 = this.H0;
        rg0Var = this.W;
        if (rg0Var != null) {
            rg0Var.E = true;
            rg0Var.o(4, z11);
            this.W.o(5, this.H0);
            this.W.o(6, this.I0);
            this.W.o(2, z17);
            this.W.o(9, z18);
            this.W.o(12, z16);
            this.W.o(10, z12);
            this.W.o(11, z22);
            this.W.o(3, z14);
            this.I0 = false;
            this.H0 = false;
            if (z17) {
                z26 = false;
            } else {
                if (this.f36007m1) {
                    this.W.o(0, true);
                } else if (this.f35929b1 != 0) {
                    chat = getMessagesController().getChat(Long.valueOf(this.f35929b1));
                    if (ChatObject.isForum(chat)) {
                        z26 = false;
                        this.W.o(0, true);
                    } else {
                        z26 = false;
                        this.W.o(0, true);
                    }
                }
                z26 = false;
            }
            rg0Var2 = this.W;
            if (rg0Var2.E) {
                rg0Var2.E = z26;
                rg0Var2.d();
            }
        }
        if (!this.B5) {
            if (this.H0) {
                if (this.M0.getVisibility() != 0) {
                    this.M0.setVisibility(0);
                    if (z10) {
                        this.M0.setAlpha(0.0f);
                        this.M0.animate().alpha(1.0f).setDuration(150L).start();
                    }
                }
            } else if (this.M0.getVisibility() != 8) {
                this.M0.setVisibility(8);
            }
            if (this.I0) {
                if (this.N0.getVisibility() != 0) {
                    this.N0.setVisibility(0);
                    if (z10) {
                        this.N0.setAlpha(0.0f);
                        this.N0.animate().alpha(1.0f).setDuration(150L).start();
                    }
                }
            } else if (this.N0.getVisibility() != 8) {
                this.N0.setVisibility(8);
            }
            if (this.J0) {
                if (this.O0.getVisibility() != 0) {
                    this.O0.setVisibility(0);
                    if (z10) {
                        this.O0.setAlpha(0.0f);
                        this.O0.animate().alpha(1.0f).setDuration(150L).start();
                    }
                }
            } else if (this.O0.getVisibility() != 8) {
                this.O0.setVisibility(8);
            }
        }
        yz0Var = this.f35994k0;
        if (yz0Var != null) {
            if (this.J0) {
                this.O0.setVisibility(8);
                this.O0.animate().cancel();
                this.O0.setAlpha(1.0f);
            }
            if (this.H0) {
                this.M0.setVisibility(8);
                this.M0.animate().cancel();
                this.M0.setAlpha(1.0f);
            }
            if (this.I0) {
                this.N0.setVisibility(8);
                this.N0.animate().cancel();
                this.N0.setAlpha(1.0f);
            }
        }
        hz0Var = this.K;
        if (hz0Var != null) {
            hz0Var.getSearchItem().requestLayout();
        }
        l5(false);
    }

    public final void D4() {
        ValueAnimator valueAnimator;
        if (!this.f36002l2 || (valueAnimator = this.f35961f2) == null || !valueAnimator.isRunning()) {
            E4(y3(), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0));
        } else {
            this.a2 = this.G5;
            this.f35938c2 = this.H5;
        }
    }

    @Override
    public final void E(float f10) {
        org.telegram.ui.Cells.w3 w3Var = this.f35936c0;
        if (w3Var == null) {
            return;
        }
        w3Var.setProgress(f10);
        this.f35987j0.O(this.G2, f10);
    }

    public final void E3(Context context) {
        int i10;
        this.W0 = new org.telegram.ui.Components.g8(context, this.P0.getPopupLayout().getSwipeBack(), new ay0(this), false, 0, this.f36067v0);
        if (this.f35952e1 > 0 || this.f35923a1 > 0) {
            int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23234n6, this.f36067v0);
            org.telegram.ui.Components.g8 g8Var = this.W0;
            org.telegram.ui.Components.p80 p80Var = g8Var.f28547e;
            if (p80Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AutoDeletePopupDescription));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.AutoDeletePopupDescription2), iV0, new org.telegram.ui.Components.bg(g8Var, 10)));
                p80Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.f36043r2;
        if (userFull == null && this.f36036q2 == null) {
            i10 = 0;
        } else {
            i10 = userFull != null ? userFull.ttl_period : this.f36036q2.ttl_period;
        }
        org.telegram.ui.Components.c11 c11VarA = org.telegram.ui.Components.c11.a(i10);
        this.f36021o0 = c11VarA;
        this.V0 = this.P0.i(0, c11VarA, LocaleController.getString(R.string.AutoDeletePopupTitle), this.W0.f28544a);
        this.P0.a(-1);
        T4();
    }

    public final void E4(float f10, float f11) {
        float fMax = Math.max(0.0f, Math.min(1.0f, (this.M1 - T3()) / ((this.f35921a.getMeasuredWidth() - f11) - U3())));
        float fDpf2 = ((AndroidUtilities.dpf2(8.0f) + (AndroidUtilities.dp(42.0f) * ((this.M1 >= ((float) T3()) || fMax >= 0.33f) ? AndroidUtilities.lerp(2.2857144f, 3.2857144f, Math.min(1.0f, fMax * 3.0f)) : com.google.android.recaptcha.internal.a.y(f10, 72.0f, 24.0f, 42.0f)))) * f10) + ((float) Math.floor(this.actionBar.getTranslationY() + ((((1.0f + f10) * (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f)) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.density * 21.0f))));
        this.a2 = (AndroidUtilities.dp(7.0f) * f10) + AndroidUtilities.dp(1.3f) + fDpf2;
        this.f35938c2 = (((float) Math.floor(AndroidUtilities.density * 11.0f)) * f10) + fDpf2 + AndroidUtilities.dp(24.0f);
    }

    @Override
    public final void F() {
        G4(false);
    }

    public final void F3() {
        if (this.fragmentView == null || !this.T5 || this.f36063u2 == null || getParentActivity() == null) {
            return;
        }
        n01 n01Var = this.Y5;
        if (n01Var != null) {
            n01Var.b(this.f36063u2);
            this.Y5.invalidate();
        } else {
            n01 n01Var2 = new n01(this, this.f36063u2);
            this.Y5 = n01Var2;
            ((FrameLayout) this.fragmentView).addView(n01Var2, h7.z5.e(-1, -1, 55));
        }
    }

    public final void F4() {
        by0 by0Var = this.f35921a;
        if (by0Var == null || this.f35935c == null || by0Var.getChildCount() <= 0 || this.S5) {
            return;
        }
        View view = null;
        int top = Integer.MAX_VALUE;
        int i10 = -1;
        for (int i11 = 0; i11 < this.f35921a.getChildCount(); i11++) {
            int iR = RecyclerView.R(this.f35921a.getChildAt(i11));
            View childAt = this.f35921a.getChildAt(i11);
            if (iR != -1 && childAt.getTop() < top) {
                top = childAt.getTop();
                i10 = iR;
                view = childAt;
            }
        }
        if (view != null) {
            this.Q5 = i10;
            int top2 = view.getTop();
            this.R5 = top2;
            if (this.Q5 == 0 && !this.f35996k2 && top2 > T3()) {
                this.R5 = T3();
            }
            this.f35935c.h1(i10, view.getTop() - this.f35921a.getPaddingTop());
        }
    }

    public final void G4(boolean z10) {
        int i10 = this.F4;
        if (i10 >= 0) {
            if (!z10) {
                this.f35935c.h1(i10, -this.f35921a.getPaddingTop());
                return;
            }
            sh.n nVar = new sh.n(getParentActivity(), 2, 0.6f);
            nVar.f5731a = this.F4;
            nVar.f47990p = -this.f35921a.getPaddingTop();
            this.f35935c.w0(nVar);
        }
    }

    public final void H3(float f10) {
        ValueAnimator valueAnimatorOfFloat;
        int i10 = 1;
        boolean z10 = f10 > 0.0f;
        this.fragmentView.invalidate();
        AnimatorSet animatorSet = this.P5;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.P5 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z10) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, f10);
            arrayList.add(valueAnimatorOfFloat);
        } else {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f36055t0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(valueAnimatorOfFloat);
        }
        valueAnimatorOfFloat.addUpdateListener(new lx0(this, i10));
        this.P5.playTogether(arrayList);
        this.P5.setDuration(z10 ? 150L : 220L);
        if (!z10) {
            this.P5.addListener(new yy0(this, 4));
        }
        this.P5.start();
    }

    public final void I3(int i10, View view) {
        org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(this, view);
        b70VarH.W(this.f35921a.V0(view, false));
        b70VarH.f26995w = false;
        b70VarH.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new gb0(this, 25), this.f36043r2 != null);
        b70VarH.c(R.drawable.msg_edit, LocaleController.getString(R.string.Edit), new gb0(this, 26), false);
        b70VarH.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new org.telegram.ui.Components.xl(this, i10, 21), true);
        b70VarH.Z();
    }

    public final void I4() {
        org.telegram.ui.Components.rg0 rg0Var = this.W;
        if (rg0Var == null) {
            return;
        }
        if (this.f36022o1) {
            rg0Var.D = 6;
            return;
        }
        if (this.f36007m1) {
            rg0Var.D = 5;
            return;
        }
        if (this.f36016n2) {
            rg0Var.D = 2;
            return;
        }
        if (this.f35923a1 != 0) {
            rg0Var.D = 0;
            return;
        }
        if (this.f35929b1 != 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f35929b1));
            if (!ChatObject.isChannel(chat)) {
                this.W.D = 3;
                return;
            }
            if (ChatObject.isMegagroup(chat)) {
                this.W.D = 3;
            } else if (ChatObject.isForum(chat)) {
                this.W.D = 4;
            } else {
                this.W.D = 1;
            }
        }
    }

    @Override
    public final void J(boolean z10, boolean z11) {
        org.telegram.ui.Cells.w3 w3Var = this.f35936c0;
        if (w3Var == null) {
            return;
        }
        w3Var.setProgress(0.0f);
    }

    public final boolean J3(final int i10, View view) {
        TLRPC.User currentUser;
        String strZ;
        TLRPC.TL_businessLocation tL_businessLocation;
        if (this.f36022o1 && (currentUser = getUserConfig().getCurrentUser()) != null) {
            final TLRPC.UserFull userFull = this.f36043r2;
            if (userFull == null) {
                userFull = getMessagesController().getUserFull(currentUser.f22527id);
            }
            if (userFull != null) {
                String string = LocaleController.getString(R.string.Copy);
                if (i10 == this.G3 || i10 == this.F3 || i10 == this.S2) {
                    strZ = userFull.about;
                } else if (i10 == this.K3) {
                    strZ = qf.y0.f0(this.currentAccount, currentUser, userFull.business_work_hours);
                    string = LocaleController.getString(R.string.ProfileHoursCopy);
                } else if (i10 == this.L3) {
                    strZ = userFull.business_location.address;
                    string = LocaleController.getString(R.string.ProfileLocationCopy);
                } else if (i10 == this.H3) {
                    strZ = UserObject.getPublicUsername(currentUser);
                    if (strZ != null) {
                        strZ = "@".concat(strZ);
                    }
                    string = LocaleController.getString(R.string.ProfileCopyUsername);
                } else if (i10 == this.C3) {
                    strZ = currentUser.phone;
                } else {
                    strZ = i10 == this.Q2 ? UserInfoActivity.Z(this.f36043r2.birthday) : null;
                }
                org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(this, view);
                b70VarH.W(this.f35921a.V0(view, false));
                b70VarH.f26995w = false;
                b70VarH.f26974i = 3;
                if (i10 == this.L3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        b70VarH.c(R.drawable.msg_view_file, LocaleController.getString(R.string.ProfileLocationView), new gb0(this, 5), false);
                    }
                    b70VarH.c(R.drawable.msg_map, LocaleController.getString(R.string.ProfileLocationMaps), new gb0(this, 7), false);
                }
                if (strZ != null) {
                    b70VarH.c(R.drawable.msg_copy, string, new zk0(strZ, 26), false);
                }
                if (i10 == this.K3) {
                    b70VarH.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileHoursEdit), new gb0(this, 8), false);
                    final int i11 = 0;
                    b70VarH.c(R.drawable.msg_delete, LocaleController.getString(R.string.ProfileHoursRemove), new Runnable(this) {

                        public final ProfileActivity f39897b;

                        {
                            this.f39897b = this;
                        }

                        @Override
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    final ProfileActivity profileActivity = this.f39897b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.BusinessHoursClearTitle);
                                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.BusinessHoursClearMessage);
                                    String string2 = LocaleController.getString(R.string.Remove);
                                    final int i12 = 0;
                                    final TLRPC.UserFull userFull2 = userFull;
                                    final int i13 = i10;
                                    alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.a2() {
                                        @Override
                                        public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i14) {
                                            switch (i12) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull3 = userFull2;
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    ProfileActivity profileActivity2 = profileActivity;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new px0(profileActivity2, 0));
                                                    profileActivity2.j5();
                                                    profileActivity2.d.u(i13);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    break;
                                                default:
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    TLRPC.UserFull userFull4 = userFull2;
                                                    userFull4.business_location = null;
                                                    userFull4.flags2 &= -3;
                                                    ProfileActivity profileActivity3 = profileActivity;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new px0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i13);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(alertDialog$Builder.f22702a);
                                    break;
                                default:
                                    final ProfileActivity profileActivity2 = this.f39897b;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.BusinessLocationClearTitle);
                                    alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.BusinessLocationClearMessage);
                                    String string3 = LocaleController.getString(R.string.Remove);
                                    final int i14 = 1;
                                    final TLRPC.UserFull userFull3 = userFull;
                                    final int i15 = i10;
                                    alertDialog$Builder2.k(string3, new org.telegram.ui.ActionBar.a2() {
                                        @Override
                                        public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i16) {
                                            switch (i14) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull4 = userFull3;
                                                    userFull4.business_work_hours = null;
                                                    userFull4.flags2 &= -2;
                                                    ProfileActivity profileActivity3 = profileActivity2;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinessworkhours, new px0(profileActivity3, 0));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i15);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    break;
                                                default:
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    TLRPC.UserFull userFull5 = userFull3;
                                                    userFull5.business_location = null;
                                                    userFull5.flags2 &= -3;
                                                    ProfileActivity profileActivity4 = profileActivity2;
                                                    profileActivity4.getConnectionsManager().sendRequest(updatebusinesslocation, new px0(profileActivity4, 1));
                                                    profileActivity4.j5();
                                                    profileActivity4.d.u(i15);
                                                    profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity2.showDialog(alertDialog$Builder2.f22702a);
                                    break;
                            }
                        }
                    }, true);
                } else if (i10 == this.L3) {
                    b70VarH.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileLocationEdit), new gb0(this, 9), false);
                    final int i12 = 1;
                    b70VarH.c(R.drawable.msg_delete, LocaleController.getString(R.string.ProfileLocationRemove), new Runnable(this) {

                        public final ProfileActivity f39897b;

                        {
                            this.f39897b = this;
                        }

                        @Override
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    final ProfileActivity profileActivity = this.f39897b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.BusinessHoursClearTitle);
                                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.BusinessHoursClearMessage);
                                    String string2 = LocaleController.getString(R.string.Remove);
                                    final int i13 = 0;
                                    final TLRPC.UserFull userFull2 = userFull;
                                    final int i14 = i10;
                                    alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.a2() {
                                        @Override
                                        public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i16) {
                                            switch (i13) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull4 = userFull2;
                                                    userFull4.business_work_hours = null;
                                                    userFull4.flags2 &= -2;
                                                    ProfileActivity profileActivity3 = profileActivity;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinessworkhours, new px0(profileActivity3, 0));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i14);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    break;
                                                default:
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    TLRPC.UserFull userFull5 = userFull2;
                                                    userFull5.business_location = null;
                                                    userFull5.flags2 &= -3;
                                                    ProfileActivity profileActivity4 = profileActivity;
                                                    profileActivity4.getConnectionsManager().sendRequest(updatebusinesslocation, new px0(profileActivity4, 1));
                                                    profileActivity4.j5();
                                                    profileActivity4.d.u(i14);
                                                    profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(alertDialog$Builder.f22702a);
                                    break;
                                default:
                                    final ProfileActivity profileActivity2 = this.f39897b;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.BusinessLocationClearTitle);
                                    alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.BusinessLocationClearMessage);
                                    String string3 = LocaleController.getString(R.string.Remove);
                                    final int i15 = 1;
                                    final TLRPC.UserFull userFull3 = userFull;
                                    final int i16 = i10;
                                    alertDialog$Builder2.k(string3, new org.telegram.ui.ActionBar.a2() {
                                        @Override
                                        public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i17) {
                                            switch (i15) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull4 = userFull3;
                                                    userFull4.business_work_hours = null;
                                                    userFull4.flags2 &= -2;
                                                    ProfileActivity profileActivity3 = profileActivity2;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinessworkhours, new px0(profileActivity3, 0));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i16);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    break;
                                                default:
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    TLRPC.UserFull userFull5 = userFull3;
                                                    userFull5.business_location = null;
                                                    userFull5.flags2 &= -3;
                                                    ProfileActivity profileActivity4 = profileActivity2;
                                                    profileActivity4.getConnectionsManager().sendRequest(updatebusinesslocation, new px0(profileActivity4, 1));
                                                    profileActivity4.j5();
                                                    profileActivity4.d.u(i16);
                                                    profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity2.showDialog(alertDialog$Builder2.f22702a);
                                    break;
                            }
                        }
                    }, true);
                } else if (i10 == this.H3) {
                    b70VarH.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new gb0(this, 10), false);
                } else if (i10 == this.G3 || i10 == this.F3 || i10 == this.S2) {
                    b70VarH.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileEditBio), new gb0(this, 11), false);
                } else if (i10 == this.C3) {
                    b70VarH.c(R.drawable.menu_storage_path, LocaleController.getString(R.string.ProfilePhoneEdit), new gb0(this, 12), false);
                } else if (i10 == this.Q2) {
                    final int i13 = 0;
                    b70VarH.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileBirthdayChange), new Runnable(this) {

                        public final ProfileActivity f39536b;

                        {
                            this.f39536b = this;
                        }

                        @Override
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    ProfileActivity profileActivity = this.f39536b;
                                    Activity parentActivity = profileActivity.getParentActivity();
                                    String string2 = LocaleController.getString(R.string.EditProfileBirthdayTitle);
                                    String string3 = LocaleController.getString(R.string.EditProfileBirthdayButton);
                                    TLRPC.UserFull userFull2 = userFull;
                                    profileActivity.showDialog(org.telegram.ui.Components.y4.m(parentActivity, string2, string3, userFull2.birthday, new ib0(8, profileActivity, userFull2), new gb0(profileActivity, 13), false, false, profileActivity.f36067v0).f23994a);
                                    break;
                                case 1:
                                    final ProfileActivity profileActivity2 = this.f39536b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.BirthdayClearTitle);
                                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.BirthdayClearMessage);
                                    String string4 = LocaleController.getString(R.string.Remove);
                                    final int i14 = 1;
                                    final TLRPC.UserFull userFull3 = userFull;
                                    alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.a2() {
                                        @Override
                                        public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i15) {
                                            switch (i14) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull4 = userFull3;
                                                    userFull4.personal_channel_id = 0L;
                                                    userFull4.personal_channel_message = 0;
                                                    userFull4.flags2 &= -65;
                                                    ProfileActivity profileActivity3 = profileActivity2;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatepersonalchannel, new px0(profileActivity3, 3));
                                                    profileActivity3.e5(false, false);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    break;
                                                default:
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    TLRPC.UserFull userFull5 = userFull3;
                                                    userFull5.birthday = null;
                                                    userFull5.flags2 &= -33;
                                                    ProfileActivity profileActivity4 = profileActivity2;
                                                    profileActivity4.getMessagesController().invalidateContentSettings();
                                                    profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new px0(profileActivity4, 2));
                                                    profileActivity4.e5(false, false);
                                                    profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity2.showDialog(alertDialog$Builder.f22702a);
                                    break;
                                default:
                                    final ProfileActivity profileActivity3 = this.f39536b;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity3.getParentActivity());
                                    alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                    alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                    String string5 = LocaleController.getString(R.string.Remove);
                                    final int i15 = 0;
                                    final TLRPC.UserFull userFull4 = userFull;
                                    alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.a2() {
                                        @Override
                                        public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i16) {
                                            switch (i15) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull5 = userFull4;
                                                    userFull5.personal_channel_id = 0L;
                                                    userFull5.personal_channel_message = 0;
                                                    userFull5.flags2 &= -65;
                                                    ProfileActivity profileActivity4 = profileActivity3;
                                                    profileActivity4.getConnectionsManager().sendRequest(updatepersonalchannel, new px0(profileActivity4, 3));
                                                    profileActivity4.e5(false, false);
                                                    profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                    break;
                                                default:
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    TLRPC.UserFull userFull6 = userFull4;
                                                    userFull6.birthday = null;
                                                    userFull6.flags2 &= -33;
                                                    ProfileActivity profileActivity5 = profileActivity3;
                                                    profileActivity5.getMessagesController().invalidateContentSettings();
                                                    profileActivity5.getConnectionsManager().sendRequest(updatebirthday, new px0(profileActivity5, 2));
                                                    profileActivity5.e5(false, false);
                                                    profileActivity5.getMessagesStorage().updateUserInfo(userFull6, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity3.showDialog(alertDialog$Builder2.f22702a);
                                    break;
                            }
                        }
                    }, false);
                    final int i14 = 1;
                    b70VarH.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new Runnable(this) {

                        public final ProfileActivity f39536b;

                        {
                            this.f39536b = this;
                        }

                        @Override
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    ProfileActivity profileActivity = this.f39536b;
                                    Activity parentActivity = profileActivity.getParentActivity();
                                    String string2 = LocaleController.getString(R.string.EditProfileBirthdayTitle);
                                    String string3 = LocaleController.getString(R.string.EditProfileBirthdayButton);
                                    TLRPC.UserFull userFull2 = userFull;
                                    profileActivity.showDialog(org.telegram.ui.Components.y4.m(parentActivity, string2, string3, userFull2.birthday, new ib0(8, profileActivity, userFull2), new gb0(profileActivity, 13), false, false, profileActivity.f36067v0).f23994a);
                                    break;
                                case 1:
                                    final ProfileActivity profileActivity2 = this.f39536b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.BirthdayClearTitle);
                                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.BirthdayClearMessage);
                                    String string4 = LocaleController.getString(R.string.Remove);
                                    final int i15 = 1;
                                    final TLRPC.UserFull userFull3 = userFull;
                                    alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.a2() {
                                        @Override
                                        public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i16) {
                                            switch (i15) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull5 = userFull3;
                                                    userFull5.personal_channel_id = 0L;
                                                    userFull5.personal_channel_message = 0;
                                                    userFull5.flags2 &= -65;
                                                    ProfileActivity profileActivity4 = profileActivity2;
                                                    profileActivity4.getConnectionsManager().sendRequest(updatepersonalchannel, new px0(profileActivity4, 3));
                                                    profileActivity4.e5(false, false);
                                                    profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                    break;
                                                default:
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    TLRPC.UserFull userFull6 = userFull3;
                                                    userFull6.birthday = null;
                                                    userFull6.flags2 &= -33;
                                                    ProfileActivity profileActivity5 = profileActivity2;
                                                    profileActivity5.getMessagesController().invalidateContentSettings();
                                                    profileActivity5.getConnectionsManager().sendRequest(updatebirthday, new px0(profileActivity5, 2));
                                                    profileActivity5.e5(false, false);
                                                    profileActivity5.getMessagesStorage().updateUserInfo(userFull6, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity2.showDialog(alertDialog$Builder.f22702a);
                                    break;
                                default:
                                    final ProfileActivity profileActivity3 = this.f39536b;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity3.getParentActivity());
                                    alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                    alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                    String string5 = LocaleController.getString(R.string.Remove);
                                    final int i16 = 0;
                                    final TLRPC.UserFull userFull4 = userFull;
                                    alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.a2() {
                                        @Override
                                        public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i17) {
                                            switch (i16) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull5 = userFull4;
                                                    userFull5.personal_channel_id = 0L;
                                                    userFull5.personal_channel_message = 0;
                                                    userFull5.flags2 &= -65;
                                                    ProfileActivity profileActivity4 = profileActivity3;
                                                    profileActivity4.getConnectionsManager().sendRequest(updatepersonalchannel, new px0(profileActivity4, 3));
                                                    profileActivity4.e5(false, false);
                                                    profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                    break;
                                                default:
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    TLRPC.UserFull userFull6 = userFull4;
                                                    userFull6.birthday = null;
                                                    userFull6.flags2 &= -33;
                                                    ProfileActivity profileActivity5 = profileActivity3;
                                                    profileActivity5.getMessagesController().invalidateContentSettings();
                                                    profileActivity5.getConnectionsManager().sendRequest(updatebirthday, new px0(profileActivity5, 2));
                                                    profileActivity5.e5(false, false);
                                                    profileActivity5.getMessagesStorage().updateUserInfo(userFull6, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity3.showDialog(alertDialog$Builder2.f22702a);
                                    break;
                            }
                        }
                    }, true);
                } else if (i10 == this.M2) {
                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(userFull.personal_channel_id));
                    if (chat != null && ChatObject.getPublicUsername(chat) != null) {
                        b70VarH.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileChannelCopy), new zs0(13, this, chat), false);
                    }
                    b70VarH.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileChannelChange), new gb0(this, 6), false);
                    final int i15 = 2;
                    b70VarH.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new Runnable(this) {

                        public final ProfileActivity f39536b;

                        {
                            this.f39536b = this;
                        }

                        @Override
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    ProfileActivity profileActivity = this.f39536b;
                                    Activity parentActivity = profileActivity.getParentActivity();
                                    String string2 = LocaleController.getString(R.string.EditProfileBirthdayTitle);
                                    String string3 = LocaleController.getString(R.string.EditProfileBirthdayButton);
                                    TLRPC.UserFull userFull2 = userFull;
                                    profileActivity.showDialog(org.telegram.ui.Components.y4.m(parentActivity, string2, string3, userFull2.birthday, new ib0(8, profileActivity, userFull2), new gb0(profileActivity, 13), false, false, profileActivity.f36067v0).f23994a);
                                    break;
                                case 1:
                                    final ProfileActivity profileActivity2 = this.f39536b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.BirthdayClearTitle);
                                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.BirthdayClearMessage);
                                    String string4 = LocaleController.getString(R.string.Remove);
                                    final int i16 = 1;
                                    final TLRPC.UserFull userFull3 = userFull;
                                    alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.a2() {
                                        @Override
                                        public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i17) {
                                            switch (i16) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull5 = userFull3;
                                                    userFull5.personal_channel_id = 0L;
                                                    userFull5.personal_channel_message = 0;
                                                    userFull5.flags2 &= -65;
                                                    ProfileActivity profileActivity4 = profileActivity2;
                                                    profileActivity4.getConnectionsManager().sendRequest(updatepersonalchannel, new px0(profileActivity4, 3));
                                                    profileActivity4.e5(false, false);
                                                    profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                    break;
                                                default:
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    TLRPC.UserFull userFull6 = userFull3;
                                                    userFull6.birthday = null;
                                                    userFull6.flags2 &= -33;
                                                    ProfileActivity profileActivity5 = profileActivity2;
                                                    profileActivity5.getMessagesController().invalidateContentSettings();
                                                    profileActivity5.getConnectionsManager().sendRequest(updatebirthday, new px0(profileActivity5, 2));
                                                    profileActivity5.e5(false, false);
                                                    profileActivity5.getMessagesStorage().updateUserInfo(userFull6, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity2.showDialog(alertDialog$Builder.f22702a);
                                    break;
                                default:
                                    final ProfileActivity profileActivity3 = this.f39536b;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity3.getParentActivity());
                                    alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                    alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                    String string5 = LocaleController.getString(R.string.Remove);
                                    final int i17 = 0;
                                    final TLRPC.UserFull userFull4 = userFull;
                                    alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.a2() {
                                        @Override
                                        public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i18) {
                                            switch (i17) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull5 = userFull4;
                                                    userFull5.personal_channel_id = 0L;
                                                    userFull5.personal_channel_message = 0;
                                                    userFull5.flags2 &= -65;
                                                    ProfileActivity profileActivity4 = profileActivity3;
                                                    profileActivity4.getConnectionsManager().sendRequest(updatepersonalchannel, new px0(profileActivity4, 3));
                                                    profileActivity4.e5(false, false);
                                                    profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                    break;
                                                default:
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    TLRPC.UserFull userFull6 = userFull4;
                                                    userFull6.birthday = null;
                                                    userFull6.flags2 &= -33;
                                                    ProfileActivity profileActivity5 = profileActivity3;
                                                    profileActivity5.getMessagesController().invalidateContentSettings();
                                                    profileActivity5.getConnectionsManager().sendRequest(updatebirthday, new px0(profileActivity5, 2));
                                                    profileActivity5.e5(false, false);
                                                    profileActivity5.getMessagesStorage().updateUserInfo(userFull6, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity3.showDialog(alertDialog$Builder2.f22702a);
                                    break;
                            }
                        }
                    }, true);
                }
                if (b70VarH.x() > 0) {
                    b70VarH.Z();
                    return true;
                }
            }
        }
        return false;
    }

    public final void J4(float f10) {
        int iV0;
        h01 h01Var;
        int i10;
        int iD;
        int iD2;
        hh.v0 v0Var;
        j01 j01Var;
        if (this.actionBar == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        this.f35975h2 = f10;
        float fLerp = AndroidUtilities.lerp(this.f35982i2, f10);
        this.f35968g2 = fLerp;
        B3();
        this.U.setScaleX(this.X1);
        this.U.setScaleY(this.X1);
        this.U.setTranslationY(AndroidUtilities.lerp((float) Math.ceil(this.W1), 0.0f, fLerp));
        this.f35922a0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(c4(), 0.0f, fLerp));
        ly0 ly0Var = this.f35922a0;
        float f11 = this.X1;
        boolean z10 = this.f36002l2;
        ly0Var.D = fLerp;
        ly0Var.E = f11;
        ly0Var.C = z10;
        oy0 oy0Var = this.f36034q0;
        if (oy0Var != null) {
            oy0Var.setExpandProgress(fLerp);
        }
        hh.v0 v0Var2 = this.f36041r0;
        if (v0Var2 != null) {
            v0Var2.setExpandProgress(fLerp);
        }
        org.telegram.ui.Components.sv0 sv0Var = this.P;
        if (sv0Var != null) {
            sv0Var.setParentExpanded(fLerp);
        }
        org.telegram.ui.Components.rg0 rg0Var = this.W;
        if (rg0Var != null) {
            rg0Var.setParentExpanded(fLerp);
        }
        org.telegram.ui.Components.jh0 jh0Var = this.Y;
        if (jh0Var != null) {
            jh0Var.setParentExpanded(fLerp);
        }
        org.telegram.ui.ActionBar.v0 v0Var3 = this.Q0;
        if (v0Var3 != null) {
            float f12 = 1.0f - fLerp;
            v0Var3.setAlpha(f12);
            this.Q0.setScaleY(f12);
            this.Q0.setVisibility(0);
            org.telegram.ui.ActionBar.v0 v0Var4 = this.Q0;
            v0Var4.setClickable(v0Var4.getAlpha() > 0.5f);
        }
        float fY3 = y3();
        if (fY3 >= 1.0f) {
            this.f35922a0.setAlpha(1.0f);
        }
        if (!this.f36002l2) {
            E4(fY3, currentActionBarHeight);
        } else if (this.M1 >= U3() && this.f35945d2 < 0.33f) {
            D4();
        }
        org.telegram.ui.Components.ll0 ll0Var = this.H;
        if (ll0Var != null) {
            ll0Var.b(i0.b.d(fLerp, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23127h8, this.f36067v0), Color.argb(179, 255, 255, 255)));
        }
        Drawable drawable = this.f36079x;
        if (drawable != null) {
            drawable.setColorFilter(this.M5 != null ? -1 : i0.b.d(fLerp, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23272pc, this.f36067v0), -1), PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.dr[] drVarArr = this.F;
        org.telegram.ui.Components.dr drVar = drVarArr[0];
        if (drVar != null) {
            drVar.b(fLerp);
        }
        org.telegram.ui.Components.dr drVar2 = drVarArr[1];
        if (drVar2 != null) {
            drVar2.b(fLerp);
        }
        org.telegram.ui.Components.dr[] drVarArr2 = this.G;
        org.telegram.ui.Components.dr drVar3 = drVarArr2[0];
        if (drVar3 != null) {
            drVar3.b(fLerp);
        }
        org.telegram.ui.Components.dr drVar4 = drVarArr2[1];
        if (drVar4 != null) {
            drVar4.b(fLerp);
        }
        Y4(fLerp);
        float fLerp2 = this.Z1;
        float fLerp3 = this.f35930b2;
        if (fY3 < 1.0f) {
            fLerp2 = AndroidUtilities.lerp(-AndroidUtilities.dpf2(63.0f), fLerp2, fY3);
            fLerp3 = AndroidUtilities.lerp(-AndroidUtilities.dpf2(63.0f), fLerp3, fY3);
        }
        float fDpf2 = AndroidUtilities.dpf2(8.0f);
        float fDpf3 = AndroidUtilities.dpf2(this.f36002l2 ? 8.0f : -24.0f);
        float fDpf4 = AndroidUtilities.dpf2(18.0f);
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f35958f;
        float f13 = fDpf4 - ((FrameLayout.LayoutParams) h5VarArr[1].getLayoutParams()).leftMargin;
        float f14 = currentActionBarHeight;
        float fO3 = (((this.M1 + f14) - O3()) - AndroidUtilities.dpf2(30.0f)) - h5VarArr[1].getBottom();
        float fA = com.google.android.recaptcha.internal.a.A(f13, fLerp2, 2.0f, fDpf2 + fLerp2);
        float f15 = this.a2;
        float f16 = 1.0f - fLerp;
        float f17 = f16 * f16;
        float f18 = f16 * 2.0f * fLerp;
        float f19 = (fA * f18) + (fLerp2 * f17);
        float f20 = fLerp * fLerp;
        float f21 = (f13 * f20) + f19;
        float fA2 = (fO3 * f20) + (com.google.android.recaptcha.internal.a.A(fO3, f15, 2.0f, fDpf3 + f15) * f18) + (f15 * f17);
        float fDpf5 = AndroidUtilities.dpf2(16.0f);
        org.telegram.ui.ActionBar.h5[] h5VarArr2 = this.f36040r;
        float f22 = fDpf5 - ((FrameLayout.LayoutParams) h5VarArr2[1].getLayoutParams()).leftMargin;
        float fO4 = (((this.M1 + f14) - O3()) - AndroidUtilities.dpf2(10.0f)) - h5VarArr2[1].getBottom();
        float fA3 = com.google.android.recaptcha.internal.a.A(f22, fLerp3, 2.0f, fDpf2 + fLerp3);
        float f23 = this.f35938c2;
        float f24 = (f22 * f20) + (fA3 * f18) + (fLerp3 * f17);
        float fA4 = (f20 * fO4) + (f18 * com.google.android.recaptcha.internal.a.A(fO4, f23, 2.0f, fDpf3 + f23)) + (f17 * f23);
        float fFloor = ((float) Math.floor(this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.density * 21.0f)))) + AndroidUtilities.dp(1.3f);
        float fDpf6 = AndroidUtilities.dpf2(22.7f) + fFloor;
        h5VarArr[1].setTranslationX(f21);
        h5VarArr[1].setTranslationY(Math.max(fFloor, fA2));
        h5VarArr2[1].setTranslationX(W3(f24));
        h5VarArr2[1].setTranslationY(X3(Math.max(fDpf6, fA4)));
        this.f36048s.setTranslationX(f24);
        this.f36048s.setTranslationY(Math.max(fDpf6, fA4));
        S4();
        f5();
        Object tag = h5VarArr2[1].getTag();
        if (tag instanceof Integer) {
            Integer num = (Integer) tag;
            iV0 = org.telegram.ui.ActionBar.g6.v0(num.intValue(), this.f36067v0);
            boolean z11 = num.intValue() == org.telegram.ui.ActionBar.g6.Bh;
            h5VarArr2[1].setTextColor(i0.b.d(fLerp, w3(iV0, Boolean.valueOf(z11)), -1275068417));
            if (this.M1 > U3()) {
                org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[1];
                h5Var.setPivotY(AndroidUtilities.lerp(0, h5Var.getMeasuredHeight(), fLerp));
                float f25 = (0.12f * fY3) + 1.0f;
                h5VarArr[1].setScaleX(AndroidUtilities.lerp(f25, 1.38f, fLerp));
                h5VarArr[1].setScaleY(AndroidUtilities.lerp(f25, 1.38f, fLerp));
            }
            l4(0, Math.min(1.0f, fY3), true);
            h01Var = this.X5;
            if (h01Var != null) {
                h01Var.a(i0.b.d(this.f35968g2, org.telegram.ui.ActionBar.g6.l1(0.5f, org.telegram.ui.ActionBar.g6.b(0.18f, -0.1f, this.Y0)), 603979775));
            }
            org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[1];
            if (this.M5 != null) {
                iD = -1;
                i10 = -1;
            } else {
                i10 = -1;
                iD = i0.b.d(this.f35968g2, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.vh, this.f36067v0), -1);
            }
            h5Var2.setTextColor(iD);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (this.M5 != null) {
                iD2 = -1;
            } else {
                iD2 = i0.b.d(fLerp, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23375v8, this.f36067v0), i10);
            }
            kVar.D(iD2, false);
            this.actionBar.setMenuOffsetSuppressed(true);
            this.f35922a0.setForegroundAlpha(fLerp);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.U.getLayoutParams();
            layoutParams.width = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), this.f35921a.getMeasuredWidth() / this.X1, fLerp);
            layoutParams.height = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), (this.M1 + f14) / this.X1, fLerp);
            N3();
            this.U.requestLayout();
            v0Var = this.f36041r0;
            if (v0Var != null) {
                v0Var.setExpandProgress(fLerp);
            }
            V4();
            j01Var = this.Z0;
            if (j01Var == null && j01Var.G) {
                j01Var.invalidate();
                return;
            }
        }
        iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B8, this.f36067v0);
        h5VarArr2[1].setTextColor(i0.b.d(fLerp, w3(iV0, Boolean.valueOf(z11)), -1275068417));
        if (this.M1 > U3()) {
            org.telegram.ui.ActionBar.h5 h5Var3 = h5VarArr[1];
            h5Var3.setPivotY(AndroidUtilities.lerp(0, h5Var3.getMeasuredHeight(), fLerp));
            float f26 = (0.12f * fY3) + 1.0f;
            h5VarArr[1].setScaleX(AndroidUtilities.lerp(f26, 1.38f, fLerp));
            h5VarArr[1].setScaleY(AndroidUtilities.lerp(f26, 1.38f, fLerp));
        }
        l4(0, Math.min(1.0f, fY3), true);
        h01Var = this.X5;
        if (h01Var != null) {
            h01Var.a(i0.b.d(this.f35968g2, org.telegram.ui.ActionBar.g6.l1(0.5f, org.telegram.ui.ActionBar.g6.b(0.18f, -0.1f, this.Y0)), 603979775));
        }
        org.telegram.ui.ActionBar.h5 h5Var4 = h5VarArr[1];
        if (this.M5 != null) {
            iD = -1;
            i10 = -1;
        } else {
            i10 = -1;
            iD = i0.b.d(this.f35968g2, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.vh, this.f36067v0), -1);
        }
        h5Var4.setTextColor(iD);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (this.M5 != null) {
            iD2 = -1;
        } else {
            iD2 = i0.b.d(fLerp, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23375v8, this.f36067v0), i10);
        }
        kVar2.D(iD2, false);
        this.actionBar.setMenuOffsetSuppressed(true);
        this.f35922a0.setForegroundAlpha(fLerp);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.U.getLayoutParams();
        layoutParams2.width = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), this.f35921a.getMeasuredWidth() / this.X1, fLerp);
        layoutParams2.height = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), (this.M1 + f14) / this.X1, fLerp);
        N3();
        this.U.requestLayout();
        v0Var = this.f36041r0;
        if (v0Var != null) {
            v0Var.setExpandProgress(fLerp);
        }
        V4();
        j01Var = this.Z0;
        if (j01Var == null) {
        }
    }

    @Override
    public final boolean K(gy gyVar) {
        return false;
    }

    public final boolean K3() {
        View childAt;
        if ((this.E0 || (!AndroidUtilities.isTablet() && !this.f35989j2)) && this.f35922a0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            this.B0 = true;
            this.f35996k2 = true;
            int i10 = 0;
            while (true) {
                if (i10 >= this.f35921a.getChildCount()) {
                    childAt = null;
                    break;
                }
                if (RecyclerView.R(this.f35921a.getChildAt(i10)) == 0) {
                    childAt = this.f35921a.getChildAt(i10);
                    break;
                }
                i10++;
            }
            if (childAt != null) {
                by0 by0Var = this.f35921a;
                View viewF = by0Var.F(childAt);
                f2.o1 o1VarT = viewF != null ? by0Var.T(viewF) : null;
                if (o1VarT != null) {
                    Integer num = (Integer) this.U1.get(Integer.valueOf(o1VarT.b()));
                    if (num != null) {
                        this.L1 = true;
                        this.f35921a.v0(0, -(((this.f35921a.getPaddingTop() - childAt.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), org.telegram.ui.Components.er.h);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void K4(TLRPC.ChatFull chatFull) {
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        this.f36036q2 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.f35981i1 == 0) {
                this.f35981i1 = -j10;
                getMediaDataController().getMediaCounts(this.f35981i1, this.f35937c1, this.classGuid);
            }
        }
        hz0 hz0Var = this.K;
        if (hz0Var != null) {
            hz0Var.setChatInfo(this.f36036q2);
        }
        my0 my0Var = this.f35987j0;
        if (my0Var != null && !this.f36007m1) {
            my0Var.setChatInfo(this.f36036q2);
        }
        oy0 oy0Var = this.f36034q0;
        if (oy0Var != null && (chatFull3 = this.f36036q2) != null) {
            oy0Var.setStories(chatFull3.stories);
        }
        hh.v0 v0Var = this.f36041r0;
        if (v0Var != null) {
            v0Var.a();
        }
        ly0 ly0Var = this.f35922a0;
        if (ly0Var != null) {
            ly0Var.setHasStories(j4());
        }
        L3();
        if (this.f35929b1 != 0) {
            boolean z10 = (BuildVars.IS_BILLING_UNAVAILABLE || getMessagesController().premiumPurchaseBlocked() || (chatFull2 = this.f36036q2) == null || !chatFull2.stargifts_available) ? false : true;
            this.P0.I(38, z10);
            org.telegram.ui.Components.rg0 rg0Var = this.W;
            if (rg0Var != null) {
                rg0Var.o(3, z10);
            }
        }
    }

    public final void L3() {
        TLRPC.Chat chat = this.A2;
        if (chat == null || !chat.megagroup) {
            return;
        }
        TLRPC.ChatFull chatFull = this.f36036q2;
        if (!(chatFull instanceof TLRPC.TL_channelFull) || chatFull.participants == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f36036q2.participants.participants.size(); i10++) {
            TLRPC.ChatParticipant chatParticipant = this.f36036q2.participants.participants.get(i10);
            this.f36088y1.k(chatParticipant, chatParticipant.user_id);
        }
    }

    public final void L4(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.V == null || (tL_emojiStatusCollectible2 = this.f35942c6) == tL_emojiStatusCollectible) {
            return;
        }
        if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
            this.f35942c6 = tL_emojiStatusCollectible;
            lh.w3 w3Var = this.Z5;
            int i10 = 1;
            if (w3Var != null) {
                w3Var.e(true);
            }
            if (tL_emojiStatusCollectible == null || TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                return;
            }
            this.f35934b6 = null;
            this.Z5 = new lh.w3(getParentActivity(), 3);
            this.f35926a6 = org.telegram.ui.ActionBar.g6.v(tL_emojiStatusCollectible.center_color | (-16777216), org.telegram.ui.ActionBar.g6.l1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
            this.Z5.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            lh.w3 w3Var2 = this.Z5;
            int iL1 = org.telegram.ui.ActionBar.g6.l1(0.5f, (-16777216) | tL_emojiStatusCollectible.text_color);
            w3Var2.f17002w0 = true;
            w3Var2.E0 = System.currentTimeMillis();
            w3Var2.f17004x0 = new Path();
            w3Var2.f17006y0 = AndroidUtilities.dpf2(0.66f) / 2.0f;
            w3Var2.f17007z0 = new Paint(1);
            w3Var2.A0 = new Paint(1);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.g6.l1(0.0f, iL1), org.telegram.ui.ActionBar.g6.l1(1.0f, iL1), org.telegram.ui.ActionBar.g6.l1(0.0f, iL1)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
            w3Var2.D0 = linearGradient;
            w3Var2.A0.setShader(linearGradient);
            w3Var2.B0 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.g6.l1(0.0f, iL1), org.telegram.ui.ActionBar.g6.l1(0.5f, iL1), org.telegram.ui.ActionBar.g6.l1(0.0f, iL1)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
            w3Var2.C0 = new Matrix();
            w3Var2.f17007z0.setShader(w3Var2.B0);
            w3Var2.A0.setStyle(Paint.Style.STROKE);
            w3Var2.A0.setStrokeJoin(Paint.Join.ROUND);
            w3Var2.A0.setStrokeCap(Paint.Cap.ROUND);
            w3Var2.A0.setStrokeWidth(AndroidUtilities.dpf2(0.66f));
            this.V.addView(this.Z5, h7.z5.c(24.0f, -1));
            this.Z5.u(9.33f);
            lh.w3 w3Var3 = this.Z5;
            Typeface typefaceBold = AndroidUtilities.bold();
            w3Var3.D.u(typefaceBold);
            w3Var3.F.setTypeface(typefaceBold);
            this.Z5.t(tL_emojiStatusCollectible.title);
            lh.w3 w3Var4 = this.Z5;
            w3Var4.d = -1L;
            w3Var4.l(5.66f, 2.66f, 5.66f, 2.66f);
            lh.w3 w3Var5 = this.Z5;
            w3Var5.getClass();
            w3Var5.f17005y = AndroidUtilities.dpf2(4.0f);
            w3Var5.A = AndroidUtilities.dpf2(2.66f);
            this.Z5.s();
            this.Z5.r(16.0f);
            this.Z5.v();
            this.Z5.setOnClickListener(new tx0(this, tL_emojiStatusCollectible.slug, i10));
            if (this.M1 < AndroidUtilities.dp(82.0f)) {
                this.f35934b6 = Boolean.FALSE;
                this.Z5.setAlpha(0.0f);
            }
            V4();
            lh.w3 w3Var6 = this.Z5;
            Objects.requireNonNull(w3Var6);
            AndroidUtilities.runOnUIThread(new zk0(w3Var6, 27), 6000L);
        }
    }

    @Override
    public final void M() {
        org.telegram.ui.Components.zt0 zt0Var;
        hz0 hz0Var = this.K;
        if (hz0Var != null && (zt0Var = this.N) != null) {
            hz0Var.setNewMediaCounts(zt0Var.f35350c);
        }
        if (this.d != null) {
            e5(false, false);
        }
        R();
        if (this.f36043r2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final boolean M3() {
        org.telegram.ui.ActionBar.b5 b5Var;
        if (this.F1 == 0 || (b5Var = this.parentLayout) == null || b5Var.getFragmentStack() == null || this.parentLayout.getFragmentStack().size() < 2 || !(this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof rn)) {
            return false;
        }
        finishFragment();
        return true;
    }

    public final void M4(oz0 oz0Var) {
        if (this.f35956e5 == oz0Var) {
            return;
        }
        this.f35956e5 = oz0Var;
        AndroidUtilities.forEachViews((RecyclerView) this.f35921a, (d5.d) new ox0(this, 0));
    }

    public final void N3() {
        if (this.f35921a == null) {
            return;
        }
        float measuredWidth = (this.f35921a.getMeasuredWidth() / 2.0f) - ((((FrameLayout.LayoutParams) this.U.getLayoutParams()).width * this.X1) * 0.5f);
        this.V1 = measuredWidth;
        if (this.C1) {
            this.V1 = AndroidUtilities.lerp(this.K5, measuredWidth, this.O1);
        }
        this.U.setTranslationX(this.V1);
    }

    public final void N4(int i10) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (AndroidUtilities.isTablet()) {
            return;
        }
        this.G1 = i10 != 0;
        this.H1 = i10 != 0;
        k5();
        if (globalMainSettings.getBoolean("view_animations", true)) {
            this.F1 = i10;
        } else if (i10 == 2) {
            this.f35988j1 = true;
        }
    }

    public final int O3() {
        if (this.f35923a1 == 0 || this.m0 == null || this.f36022o1) {
            return AndroidUtilities.dp(74 + (this.E4 ? 25 : 0));
        }
        return 0;
    }

    public final void O4(TLRPC.UserFull userFull, org.telegram.ui.Cells.c6 c6Var, k01 k01Var) {
        this.f36043r2 = userFull;
        org.telegram.ui.Components.sv0 sv0Var = this.P;
        if (sv0Var != null) {
            sv0Var.set(userFull.stars_rating);
        }
        oy0 oy0Var = this.f36034q0;
        if (oy0Var != null) {
            oy0Var.setStories(this.f36043r2.stories);
        }
        hh.v0 v0Var = this.f36041r0;
        if (v0Var != null) {
            v0Var.a();
        }
        ly0 ly0Var = this.f35922a0;
        if (ly0Var != null) {
            ly0Var.setHasStories(j4());
        }
        hz0 hz0Var = this.K;
        if (hz0Var != null) {
            hz0Var.setUserInfo(this.f36043r2);
        }
        if (this.f36051s2 == null) {
            this.f36051s2 = c6Var;
        }
        if (this.f36051s2 == null) {
            this.f36051s2 = new org.telegram.ui.Cells.c6(this.currentAccount);
        }
        org.telegram.ui.Cells.c6 c6Var2 = this.f36051s2;
        gb0 gb0Var = new gb0(this, 20);
        if (c6Var2.f24158c) {
            gb0Var.run();
        } else {
            c6Var2.h.add(gb0Var);
        }
        this.f36051s2.d(this.f36043r2);
        if (this.f36063u2 == null) {
            this.f36063u2 = k01Var;
        }
        k01 k01Var2 = this.f36063u2;
        if (k01Var2 == null) {
            k01 k01VarC = k01.c(this.currentAccount, this.f36043r2, k01Var2);
            this.f36063u2 = k01VarC;
            this.f36057t2 = k01VarC != null;
        }
        k01 k01Var3 = this.f36063u2;
        if (k01Var3 != null) {
            gb0 gb0Var2 = new gb0(this, 16);
            if (k01Var3.f39553b) {
                gb0Var2.run();
            } else {
                k01Var3.h.add(gb0Var2);
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = this.P0;
        if (v0Var2 != null) {
            v0Var2.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.f35923a1)));
            if (e4()) {
                this.P0.K(44);
            } else {
                this.P0.r(44);
            }
        }
    }

    public final int P3(ImageReceiver imageReceiver) {
        return imageReceiver.getDrawable() instanceof org.telegram.ui.Components.w51 ? ((org.telegram.ui.Components.w51) imageReceiver.getDrawable()).f34115a.a() : AndroidUtilities.calcBitmapColor(this.f35922a0.getImageReceiver().getBitmap());
    }

    public final void P4(boolean z10, boolean z11) {
        if (this.f35936c0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.f35928b0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f35928b0 = null;
        }
        if (!z11) {
            if (z10) {
                this.f35936c0.setAlpha(1.0f);
                this.f35936c0.setVisibility(0);
                return;
            } else {
                this.f35936c0.setAlpha(0.0f);
                this.f35936c0.setVisibility(4);
                return;
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f35928b0 = animatorSet2;
        int i10 = 1;
        if (z10) {
            this.f35936c0.setVisibility(0);
            this.f35928b0.playTogether(ObjectAnimator.ofFloat(this.f35936c0, (Property<org.telegram.ui.Cells.w3, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f35936c0, (Property<org.telegram.ui.Cells.w3, Float>) View.ALPHA, 0.0f));
        }
        this.f35928b0.setDuration(180L);
        this.f35928b0.addListener(new zy0(this, z10, i10));
        this.f35928b0.start();
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new oh.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 5));
    }

    public final org.telegram.ui.Components.i5 Q3(int i10, long j10) {
        org.telegram.ui.Components.i5[] i5VarArr = this.D;
        if (i5VarArr[i10] == null) {
            org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(AndroidUtilities.dp(17.0f), i10 == 0 ? 7 : 2, this.f35958f[i10], false);
            i5VarArr[i10] = i5Var;
            int iDp = AndroidUtilities.dp(1.0f);
            i5Var.E = 0;
            i5Var.F = iDp;
            if (this.C0) {
                i5VarArr[i10].a();
            }
        }
        if (j10 != 0) {
            i5VarArr[i10].j(j10, false);
        } else {
            i5VarArr[i10].g(null, false);
        }
        X4();
        return i5VarArr[i10];
    }

    public final void Q4() {
        Long lValueOf;
        if (this.f36085x5 != null) {
            return;
        }
        r51[] r51VarArr = new r51[1];
        Rect rect = AndroidUtilities.rectTmp2;
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f35958f;
        org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[1];
        if (h5Var != null) {
            if (h5Var.getRightDrawable() == null) {
                rect.set(h5VarArr[1].getWidth() - 1, (h5VarArr[1].getHeight() / 2) - 1, h5VarArr[1].getWidth() + 1, (h5VarArr[1].getHeight() / 2) + 1);
            } else {
                rect.set(h5VarArr[1].getRightDrawable().getBounds());
                rect.offset((int) ((h5VarArr[1].getScaleX() - 1.0f) * rect.centerX()), 0);
                rect.offset((int) h5VarArr[1].getX(), (int) h5VarArr[1].getY());
            }
        }
        int i10 = h5VarArr[1].getScaleX() < 1.5f ? 16 : 32;
        int iDp = (-(this.V.getHeight() - rect.centerY())) - AndroidUtilities.dp(i10);
        int iMin = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
        int iCenterX = rect.centerX();
        int iB = h7.n.b(iCenterX - (iMin / 2), 0, AndroidUtilities.displaySize.x - iMin);
        ry0 ry0Var = new ry0(this, this, getParentActivity(), Integer.valueOf(Math.max(0, iCenterX - iB)), this.A2 == null ? 0 : 9, this.f36067v0, i10, r51VarArr);
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f35923a1));
        if (user != null) {
            ry0Var.setExpireDateHint(DialogObject.getEmojiStatusUntil(user.emoji_status));
        }
        Long l10 = this.B;
        org.telegram.ui.Components.i5[] i5VarArr = this.C;
        if (l10 != null) {
            ry0Var.setSelected(l10);
        } else {
            org.telegram.ui.Components.i5 i5Var = i5VarArr[1];
            if (i5Var != null) {
                Drawable drawable = i5Var.f29229f[0];
                if (drawable instanceof org.telegram.ui.Components.k5) {
                    lValueOf = Long.valueOf(((org.telegram.ui.Components.k5) drawable).i());
                } else {
                    lValueOf = null;
                }
            } else {
                lValueOf = null;
            }
            ry0Var.setSelected(lValueOf);
        }
        ry0Var.setSaveState(3);
        ry0Var.y(i5VarArr[1], h5VarArr[1]);
        sy0 sy0Var = new sy0(this, ry0Var);
        this.f36085x5 = sy0Var;
        r51VarArr[0] = sy0Var;
        int[] iArr = new int[2];
        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[1];
        if (h5Var2 != null) {
            h5Var2.getLocationOnScreen(iArr);
        }
        r51VarArr[0].showAsDropDown(this.fragmentView, iB, iDp, 51);
        r51VarArr[0].b();
    }

    @Override
    public final void R() {
        int i10;
        hz0 hz0Var = this.K;
        if (hz0Var == null || this.f36048s == null) {
            return;
        }
        int closestTab = hz0Var.getClosestTab();
        int[] iArr = this.N.f35350c;
        if (closestTab == 0) {
            if (iArr[7] <= 0 && iArr[6] <= 0) {
                int i11 = iArr[0];
                if (i11 <= 0) {
                    this.f36048s.setText(LocaleController.getString(R.string.SharedMedia));
                    return;
                } else {
                    this.f36048s.setText(LocaleController.formatPluralString("Media", i11, new Object[0]));
                    return;
                }
            }
            if (this.K.getPhotosVideosTypeFilter() == 1 || iArr[7] <= 0) {
                this.f36048s.setText(LocaleController.formatPluralString("Photos", iArr[6], new Object[0]));
                return;
            } else if (this.K.getPhotosVideosTypeFilter() == 2 || (i10 = iArr[6]) <= 0) {
                this.f36048s.setText(LocaleController.formatPluralString("Videos", iArr[7], new Object[0]));
                return;
            } else {
                this.f36048s.setText(a9.p.w(LocaleController.formatPluralString("Photos", i10, new Object[0]), ", ", LocaleController.formatPluralString("Videos", iArr[7], new Object[0])));
                return;
            }
        }
        if (closestTab == 1) {
            int i12 = iArr[1];
            if (i12 <= 0) {
                this.f36048s.setText(LocaleController.getString(R.string.Files));
                return;
            } else {
                this.f36048s.setText(LocaleController.formatPluralString("Files", i12, new Object[0]));
                return;
            }
        }
        if (closestTab == 2) {
            int i13 = iArr[2];
            if (i13 <= 0) {
                this.f36048s.setText(LocaleController.getString(R.string.Voice));
                return;
            } else {
                this.f36048s.setText(LocaleController.formatPluralString("Voice", i13, new Object[0]));
                return;
            }
        }
        if (closestTab == 3) {
            int i14 = iArr[3];
            if (i14 <= 0) {
                this.f36048s.setText(LocaleController.getString(R.string.SharedLinks));
                return;
            } else {
                this.f36048s.setText(LocaleController.formatPluralString("Links", i14, new Object[0]));
                return;
            }
        }
        if (closestTab == 4) {
            int i15 = iArr[4];
            if (i15 <= 0) {
                this.f36048s.setText(LocaleController.getString(R.string.Music));
                return;
            } else {
                this.f36048s.setText(LocaleController.formatPluralString("MusicFiles", i15, new Object[0]));
                return;
            }
        }
        if (closestTab == 5) {
            int i16 = iArr[5];
            if (i16 <= 0) {
                this.f36048s.setText(LocaleController.getString(R.string.AccDescrGIFs));
                return;
            } else {
                this.f36048s.setText(LocaleController.formatPluralString("GIFs", i16, new Object[0]));
                return;
            }
        }
        if (closestTab == 6) {
            this.f36048s.setText(LocaleController.formatPluralString("CommonGroups", this.f36043r2.common_chats_count, new Object[0]));
            return;
        }
        if (closestTab == 7) {
            this.f36048s.setText(this.f36040r[1].getText());
            return;
        }
        if (closestTab == 8 || org.telegram.ui.Components.hu0.w0(closestTab)) {
            if (this.f36016n2) {
                this.f36048s.setText(this.K.V(false));
                return;
            } else if (this.K.c0(closestTab) > 0) {
                this.f36048s.setText(LocaleController.formatPluralString("ProfileStoriesCount", this.K.c0(closestTab), new Object[0]));
                return;
            } else {
                this.f36048s.setText(LocaleController.getString(R.string.ProfileStoriesCountZero));
                return;
            }
        }
        if (closestTab == 13) {
            this.f36048s.setText(this.K.V(true));
            return;
        }
        if (closestTab == 9) {
            this.f36048s.setText(LocaleController.formatPluralString("ProfileStoriesArchiveCount", this.K.c0(closestTab), new Object[0]));
            return;
        }
        if (closestTab == 10) {
            MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(a());
            this.f36048s.setText(LocaleController.formatPluralString(this.f36016n2 ? "Bots" : "Channels", channelRecommendations == null ? 0 : channelRecommendations.chats.size() + channelRecommendations.more, new Object[0]));
            return;
        }
        if (closestTab == 12) {
            this.f36048s.setText(LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, getMessagesController().getSavedMessagesController().getMessagesCount(a())), new Object[0]));
            return;
        }
        if (closestTab == 14) {
            org.telegram.ui.Components.on0 on0Var = this.f36048s;
            org.telegram.ui.Components.wq0 wq0Var = this.K.R;
            on0Var.setText(LocaleController.formatPluralStringComma("ProfileGiftsCount", wq0Var != null ? wq0Var.getGiftsCount() : 0));
        } else if (closestTab == 15) {
            int i17 = iArr[8];
            if (i17 <= 0) {
                this.f36048s.setText(LocaleController.getString(R.string.SharedPollTab));
            } else {
                this.f36048s.setText(LocaleController.formatPluralStringComma("ProfilePollsCount", i17));
            }
        }
    }

    public final void R3(boolean z10) {
        a0.h hVar;
        if (this.f36081x1 || (hVar = this.f36088y1) == null || this.f36036q2 == null) {
            return;
        }
        this.f36081x1 = true;
        int i10 = (hVar.m() == 0 || !z10) ? 0 : 300;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.f35929b1);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        tL_channels_getParticipants.offset = z10 ? 0 : this.f36088y1.m();
        tL_channels_getParticipants.limit = 200;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new cg.m0(this, tL_channels_getParticipants, i10)), this.classGuid);
    }

    public final void R4() {
        int i10 = 0;
        this.K.E0.setReordering(false);
        hz0 hz0Var = this.K;
        org.telegram.ui.Components.vr0 vr0Var = hz0Var.E0;
        if (hz0Var.f29145r1 != null && vr0Var != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = vr0Var.getTabIds();
            int size = tabIds.size();
            while (i10 < size) {
                Integer num = tabIds.get(i10);
                i10++;
                TLRPC.ProfileTab profileTabD0 = org.telegram.ui.Components.hu0.d0(num.intValue(), hz0Var.Z0 instanceof TLRPC.TL_channelFull);
                if (profileTabD0 != null) {
                    arrayList.add(profileTabD0);
                }
            }
        }
        this.K.v1(true);
        this.f36066u5.animate().translationY(AndroidUtilities.dp(69.0f)).setDuration(180L).setInterpolator(org.telegram.ui.Components.er.h).withEndAction(new gb0(this, 21)).start();
        org.telegram.ui.Components.mc.a0(this).Q(R.raw.contact_check, 36, "Tab order changed.").j();
    }

    public final org.telegram.ui.Components.i5 S3(TLRPC.EmojiStatus emojiStatus, boolean z10, int i10) {
        org.telegram.ui.Components.i5[] i5VarArr = this.C;
        if (i5VarArr[i10] == null) {
            org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(AndroidUtilities.dp(24.0f), i10 == 0 ? 7 : 2, this.f35958f[i10], false);
            i5VarArr[i10] = i5Var;
            if (this.C0) {
                i5Var.a();
            }
        }
        if (i10 == 1) {
            this.B = null;
        }
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((1 & tL_emojiStatus.flags) == 0 || tL_emojiStatus.until > ((int) (System.currentTimeMillis() / 1000))) {
                i5VarArr[i10].j(tL_emojiStatus.document_id, z10);
                i5VarArr[i10].m(false, z10);
            } else {
                i5VarArr[i10].g(Y3(i10), z10);
                i5VarArr[i10].m(false, z10);
            }
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) == 0 || tL_emojiStatusCollectible.until > ((int) (System.currentTimeMillis() / 1000))) {
                if (i10 == 1) {
                    this.B = Long.valueOf(tL_emojiStatusCollectible.collectible_id);
                }
                i5VarArr[i10].j(tL_emojiStatusCollectible.document_id, z10);
                i5VarArr[i10].m(true, z10);
            } else {
                i5VarArr[i10].g(Y3(i10), z10);
                i5VarArr[i10].m(false, z10);
            }
        } else {
            i5VarArr[i10].g(Y3(i10), z10);
            i5VarArr[i10].m(false, z10);
        }
        X4();
        return i5VarArr[i10];
    }

    public final void S4() {
        n0 n0Var;
        if (this.W == null || this.f36040r[1] == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        org.telegram.ui.Components.rg0 rg0Var = this.W;
        boolean z10 = this.C1;
        rg0Var.f32160e = z10;
        if (z10 && this.F1 == 2 && (n0Var = this.U) != null) {
            this.W.f32161f = this.U.getY() + (this.U.getScaleY() * n0Var.getHeight());
            this.W.setAlpha(this.O1);
            org.telegram.ui.Components.rg0 rg0Var2 = this.W;
            float measuredWidth = this.f35921a.getMeasuredWidth();
            rg0Var2.A = AndroidUtilities.dp(74.0f);
            rg0Var2.setTranslationY(measuredWidth);
            rg0Var2.invalidate();
        } else {
            rg0Var.f32161f = -1.0f;
            float f10 = currentActionBarHeight;
            float fDp = (this.M1 + f10) - AndroidUtilities.dp(this.E4 ? 25.0f : 0.0f);
            float fMin = Math.min(AndroidUtilities.dp(74.0f), fDp - f10);
            org.telegram.ui.Components.rg0 rg0Var3 = this.W;
            rg0Var3.A = fMin;
            rg0Var3.setTranslationY(fDp - fMin);
            rg0Var3.invalidate();
        }
        ImageView imageView = this.K0;
        if (imageView == null || imageView.getTag() == null) {
            return;
        }
        this.W.getClass();
        if (this.K0.getVisibility() == 0) {
            this.K0.setVisibility(8);
        }
        if (this.K0.getTag() instanceof org.telegram.ui.ActionBar.v0) {
            ((org.telegram.ui.ActionBar.v0) this.K0.getTag()).setAlpha(1.0f);
        }
    }

    @Override
    public final boolean T() {
        return this.f36074w1;
    }

    public final int T3() {
        return O3() + U3();
    }

    public final void T4() {
        int i10;
        if (this.V0 == null || this.W0 == null) {
            return;
        }
        TLRPC.UserFull userFull = this.f36043r2;
        if (userFull == null && this.f36036q2 == null) {
            i10 = 0;
        } else {
            i10 = userFull != null ? userFull.ttl_period : this.f36036q2.ttl_period;
        }
        this.f36021o0.b(i10);
        this.W0.b(i10);
    }

    public final int U3() {
        return O3() == 0 ? AndroidUtilities.dp(168.0f) : AndroidUtilities.dp(152.0f);
    }

    public final void U4() {
        if (this.f36026o5 == null) {
            return;
        }
        hz0 hz0Var = this.K;
        boolean z10 = ((hz0Var == null || !hz0Var.isAttachedToWindow()) ? (float) AndroidUtilities.dp(72.0f) : ((float) AndroidUtilities.dp(232.0f)) - (((float) this.f35921a.getMeasuredHeight()) - this.K.getY())) <= 0.0f;
        ud.a aVar = this.f36078w5;
        aVar.a(z10, true);
        float f10 = aVar.f48497e;
        this.f36026o5.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f), 0, f10));
        this.f36026o5.setAlpha(f10);
        this.f36026o5.setVisibility(f10 <= 0.0f ? 4 : 0);
        org.telegram.ui.Components.ec ecVar = org.telegram.ui.Components.ec.f28012w;
        if (ecVar != null) {
            ecVar.l();
        }
    }

    public final Drawable V3() {
        if (this.f36079x == null) {
            this.f36079x = org.telegram.ui.ActionBar.g6.f23196l4.getConstantState().newDrawable().mutate();
        }
        return this.f36079x;
    }

    public final void V4() {
        lh.w3 w3Var = this.Z5;
        if (w3Var == null) {
            return;
        }
        float f10 = -w3Var.getPaddingLeft();
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f35958f;
        w3Var.n(0.0f, (h5VarArr[1].getScaleX() * (h5VarArr[1].getRightDrawableX() - (AndroidUtilities.lerp(0.45f, 0.25f, this.f35968g2) * h5VarArr[1].getRightDrawableWidth()))) + h5VarArr[1].getX() + f10);
        float fLerp = AndroidUtilities.lerp(this.f35982i2, this.f35975h2);
        lh.w3 w3Var2 = this.Z5;
        w3Var2.setTranslationY(((h5VarArr[1].getY() + (-w3Var2.getPaddingBottom())) - AndroidUtilities.dp(24.0f)) + AndroidUtilities.lerp(AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(12.0f), fLerp));
        this.Z5.h(i0.b.d(fLerp, this.f35926a6, 1342177280));
        boolean z10 = this.M1 >= ((float) AndroidUtilities.dp(82.0f));
        Boolean bool = this.f35934b6;
        if (bool == null || bool.booleanValue() != z10) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = this.Z5.animate();
            this.f35934b6 = Boolean.valueOf(z10);
            org.telegram.messenger.rl.o(viewPropertyAnimatorAnimate.alpha(z10 ? 1.0f : 0.0f), org.telegram.ui.Components.er.f28123g, 200L);
        }
    }

    public final float W3(float f10) {
        this.V5 = f10;
        int i10 = this.F1;
        float f11 = 1.0f;
        if (i10 != 2) {
            f11 = (this.O1 >= 1.0f || i10 == 0) ? this.f35968g2 : 0.0f;
        }
        return Math.max(0.0f, (Z3() + this.f35999k5) * Utilities.clamp01(f11)) + f10;
    }

    public final void W4() {
        if (getParentActivity() == null || this.R0 == null) {
            return;
        }
        if (getUserConfig().isPremium()) {
            this.R0.setIcon(R.drawable.menu_profile_colors);
            return;
        }
        Drawable drawable = getParentActivity().getDrawable(R.drawable.menu_profile_colors_locked);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, this.f36067v0), PorterDuff.Mode.SRC_IN));
        Drawable drawable2 = getParentActivity().getDrawable(R.drawable.msg_gallery_locked2);
        drawable2.setColorFilter(new PorterDuffColorFilter(i0.b.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        this.R0.setIcon(new jh.i2(drawable, drawable2, AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f)));
    }

    public final float X3(float f10) {
        float f11;
        this.W5 = f10;
        int i10 = this.F1;
        float visibilityFactor = 0.0f;
        if (i10 == 2) {
            f11 = 1.0f;
        } else {
            f11 = (this.O1 >= 1.0f || i10 == 0) ? this.f35968g2 : 0.0f;
        }
        float fClamp01 = Utilities.clamp01(f11);
        if (this.P != null) {
            visibilityFactor = this.P.getVisibilityFactor() * AndroidUtilities.dp(3.0f);
        }
        return com.google.android.recaptcha.internal.a.z(1.0f, fClamp01, visibilityFactor, f10);
    }

    public final void X4() {
        Y4(this.L5);
    }

    public final org.telegram.ui.Components.dr Y3(int i10) {
        org.telegram.ui.Components.dr[] drVarArr = this.G;
        if (drVarArr[i10] == null) {
            Drawable drawableMutate = getParentActivity().getDrawable(R.drawable.msg_premium_liststar).mutate();
            Drawable[] drawableArr = this.A;
            drawableArr[i10] = drawableMutate;
            drawableArr[i10].setColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, this.f36067v0), PorterDuff.Mode.MULTIPLY);
            drVarArr[i10] = new org.telegram.ui.Components.dr(drawableArr[i10], getParentActivity().getDrawable(R.drawable.msg_premium_prolfilestar).mutate());
        }
        return drVarArr[i10];
    }

    public final void Y4(float f10) {
        int i10 = 0;
        while (i10 < 2) {
            MessagesController.PeerColor peerColor = this.M5;
            int offsetColor = (peerColor == null || i10 != 1) ? AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, this.f36067v0), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oi, this.f36067v0), this.A5, 1.0f) : i0.b.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.g6.I.q()), -1);
            int iD = i0.b.d(f10, offsetColor, -1);
            int i11 = org.telegram.ui.ActionBar.g6.Oi;
            int iD2 = i0.b.d(this.A5, iD, org.telegram.ui.ActionBar.g6.v0(i11, this.f36067v0));
            org.telegram.ui.Components.i5 i5Var = this.C[i10];
            if (i5Var != null) {
                i5Var.k(Integer.valueOf(iD2));
            }
            org.telegram.ui.Components.i5 i5Var2 = this.D[i10];
            if (i5Var2 != null) {
                i5Var2.k(Integer.valueOf(i0.b.d(this.A5, i0.b.d(f10, offsetColor, -1711276033), org.telegram.ui.ActionBar.g6.v0(i11, this.f36067v0))));
            }
            if (i10 == 1) {
                this.Z.setColor(iD2);
            }
            i10++;
        }
        this.L5 = f10;
    }

    public final float Z3() {
        if (this.P == null) {
            return 0.0f;
        }
        return this.P.getVisibilityFactor() * AndroidUtilities.dp(22.0f);
    }

    public final void Z4() {
        org.telegram.ui.Cells.o oVar = this.Z;
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f35958f;
        oVar.setScaleX(h5VarArr[1].getScaleX());
        this.Z.setScaleY(h5VarArr[1].getScaleY());
        this.Z.b((h5VarArr[1].getScaleX() * h5VarArr[1].getRightDrawableX()) + h5VarArr[1].getX(), (h5VarArr[1].getHeight() - (h5VarArr[1].getScaleY() * (h5VarArr[1].getHeight() - h5VarArr[1].getRightDrawableY()))) + h5VarArr[1].getY());
    }

    public final long a() {
        long j10 = this.f35952e1;
        if (j10 != 0) {
            return j10;
        }
        long j11 = this.f35923a1;
        return j11 != 0 ? j11 : -this.f35929b1;
    }

    public final org.telegram.ui.Components.ll0 a4(int i10) {
        if (this.H == null) {
            org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(i10);
            this.H = ll0Var;
            ll0Var.b(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23127h8, this.f36067v0));
        }
        return this.H;
    }

    public final void a5() {
        if (this.f36007m1 || !ChatObject.isForum(this.A2)) {
            return;
        }
        getNotificationsController().loadTopicsNotificationsExceptions(-this.f35929b1, new Consumer() {
            @Override
            public final void x(Object obj) {
                ProfileActivity profileActivity = this.f44963a;
                HashSet hashSet = profileActivity.f35948d5;
                ArrayList arrayList = new ArrayList((HashSet) obj);
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    if (profileActivity.getMessagesController().getTopicsController().findTopic(profileActivity.f35929b1, ((Integer) arrayList.get(i10)).intValue()) == null) {
                        arrayList.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                hashSet.clear();
                hashSet.addAll(arrayList);
                profileActivity.g5(true);
            }

            public Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final h01 b4() {
        if (this.X5 == null) {
            h01 h01Var = new h01(LocaleController.getString(R.string.StatusHiddenShow));
            this.X5 = h01Var;
            h01Var.setAlpha((int) (Math.min(1.0f, this.M1 / T3()) * 255.0f));
            this.X5.a(i0.b.d(this.f35968g2, org.telegram.ui.ActionBar.g6.l1(0.5f, org.telegram.ui.ActionBar.g6.b(0.18f, -0.1f, this.Y0)), 603979775));
        }
        return this.X5;
    }

    public final void b5(float f10) {
        wz0 wz0Var;
        ValueAnimator valueAnimator;
        if (this.f36002l2 || ((wz0Var = this.J) != null && (valueAnimator = wz0Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.J.getLayoutParams();
            layoutParams.width = this.f35921a.getMeasuredWidth();
            layoutParams.height = (int) (this.M1 + f10);
            this.J.requestLayout();
        }
        j01 j01Var = this.Z0;
        if (j01Var != null) {
            j01Var.A.setTranslate(0.0f, this.W1 - j01Var.f39218x);
            j01 j01Var2 = this.Z0;
            RadialGradient radialGradient = j01Var2.f39219y;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(j01Var2.A);
            }
            this.Z0.invalidate();
        }
        Z4();
        S4();
        f5();
    }

    public final int c4() {
        if (this.f36007m1) {
            return 0;
        }
        if (this.f35929b1 == 0 || !ChatObject.isForum(getMessagesController().getChat(Long.valueOf(this.f35929b1)))) {
            return AndroidUtilities.dp(50.0f);
        }
        return AndroidUtilities.dp(j4() ? 24.0f : 38.0f);
    }

    public final void c5() {
        TLRPC.User user;
        if (!this.f36022o1 || this.T0 == null || this.S0 == null || (user = getMessagesController().getUser(Long.valueOf(this.f35923a1))) == null) {
            return;
        }
        boolean z10 = UserObject.getPublicUsername(user) != null;
        this.T0.setIcon(z10 ? R.drawable.menu_username_change : R.drawable.menu_username_set);
        this.T0.setText(LocaleController.getString(z10 ? R.string.ProfileUsernameEdit : R.string.ProfileUsernameSet));
        this.S0.setVisibility(UserObject.getPublicUsername(user) == null ? 8 : 0);
    }

    @Override
    public final boolean canBeginSlide() {
        if (this.K.x0()) {
            return super.canBeginSlide();
        }
        return false;
    }

    @Override
    public final void clearViews() {
        this.M5 = null;
        super.clearViews();
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        pn pnVar;
        org.telegram.ui.ActionBar.b4 b4Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        org.telegram.ui.ActionBar.n2 lastFragment = this.parentLayout.getLastFragment();
        if ((lastFragment instanceof rn) && (pnVar = ((rn) lastFragment).f41983aa) != null && (b4Var = pnVar.f41395f) != null) {
            if (b4Var != null) {
                TLRPC.ChatTheme chatTheme = b4Var.d;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    } else {
                        tL_starGiftUnique = null;
                    }
                } else {
                    tL_starGiftUnique = null;
                }
                if (tL_starGiftUnique == null) {
                    this.f36067v0 = lastFragment.getResourceProvider();
                }
            } else {
                this.f36067v0 = lastFragment.getResourceProvider();
            }
        }
        ag.d2 d2Var = new ag.d2(this, context, this.f36067v0, 6);
        boolean z10 = true;
        d2Var.setForceSkipTouches(true);
        d2Var.setBackgroundColor(0);
        d2Var.C(this.M5 != null ? 553648127 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23092f8, this.f36067v0), false);
        int i10 = org.telegram.ui.ActionBar.g6.f23375v8;
        d2Var.D(org.telegram.ui.ActionBar.g6.v0(i10, this.f36067v0), false);
        d2Var.D(org.telegram.ui.ActionBar.g6.v0(i10, this.f36067v0), true);
        d2Var.setCastShadows(false);
        d2Var.setAddToContainer(false);
        d2Var.setClipContent(true);
        if (!this.E0 && (AndroidUtilities.isTablet() || this.inBubbleMode)) {
            z10 = false;
        }
        d2Var.setOccupyStatusBar(z10);
        if (!this.E0) {
            d2Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.g2(false));
            d2Var.getBackButton().setTranslationX(AndroidUtilities.dp(2.0f));
            ImageView backButton = d2Var.getBackButton();
            backButton.setOnLongClickListener(new jh.f2(5, this, backButton));
            return d2Var;
        }
        d2Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.g2(false));
        d2Var.getBackButton().setTranslationX(AndroidUtilities.dp(2.0f));
        d2Var.f23566e.setContentDescription(LocaleController.getString(R.string.QrCode));
        d2Var.f23566e.setImageResource(R.drawable.outline_header_qr_24);
        d2Var.f23566e.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, this.f36067v0), PorterDuff.Mode.SRC_IN);
        d2Var.f23566e.setOnClickListener(new fx0(this, 6));
        return d2Var;
    }

    @Override
    public final View createView(Context context) {
        jg.a aVar;
        int i10;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        ?? r12;
        TLRPC.Document document;
        int i11;
        Object tag;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        int i16;
        int i17;
        org.telegram.ui.Components.rn rnVarP;
        TLRPC.UserFull userFull2;
        TLRPC.ChatParticipants chatParticipants;
        rn rnVar;
        pn pnVar;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        org.telegram.ui.ActionBar.g6.X(context);
        int i18 = 0;
        org.telegram.ui.ActionBar.g6.J(context, false);
        org.telegram.ui.ActionBar.n2 lastFragment = this.parentLayout.getLastFragment();
        if ((lastFragment instanceof rn) && (pnVar = (rnVar = (rn) lastFragment).f41983aa) != null && pnVar.c() != null) {
            org.telegram.ui.ActionBar.b4 b4Var = rnVar.f41983aa.f41395f;
            if (b4Var != null) {
                TLRPC.ChatTheme chatTheme = b4Var.d;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    } else {
                        tL_starGiftUnique = null;
                    }
                } else {
                    tL_starGiftUnique = null;
                }
                if (tL_starGiftUnique == null) {
                    this.f36067v0 = lastFragment.getResourceProvider();
                }
            } else {
                this.f36067v0 = lastFragment.getResourceProvider();
            }
        }
        this.P1 = 0;
        this.Q1 = 1.0f;
        this.S1 = false;
        this.hasOwnBackground = true;
        this.M1 = T3();
        this.actionBar.setActionBarMenuOnItemClick(new dz0(this, context));
        hz0 hz0Var = this.K;
        if (hz0Var != null) {
            hz0Var.F0();
        }
        long j10 = this.f35952e1;
        if (j10 == 0) {
            j10 = this.f35923a1;
            if (j10 == 0) {
                j10 = -this.f35929b1;
            }
        }
        this.fragmentView = new fz0(this, context);
        qg.j jVar = new qg.j(this.fragmentView);
        this.f36020n6 = jVar;
        this.f36000k6.f(jVar, (ViewGroup) this.fragmentView);
        qg.j jVar2 = this.f36020n6;
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        jg.a aVar2 = this.f36012m6;
        aVar2.f(jVar2, viewGroup);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        int i19 = 23;
        if (this.f36022o1) {
            this.f36026o5 = new FrameLayout(context);
            this.f36033p5 = new FrameLayout[2];
            this.f36054s5 = new lh.d[2];
            int i20 = 0;
            for (int i21 = 2; i20 < i21; i21 = 2) {
                og.c cVar = new og.c();
                int i22 = org.telegram.ui.ActionBar.g6.f23053d6;
                cVar.a(getThemedColor(i22));
                jg.a aVar3 = new jg.a(cVar);
                ag.d dVar = new ag.d(context);
                lg.d dVarB = aVar3.b(dVar, new mg.b(i22, this.f36067v0));
                dVarB.o(AndroidUtilities.dp(8.0f));
                dVarB.p(AndroidUtilities.dp(22.0f));
                dVar.setBackground(dVarB);
                this.f36033p5[i20] = new FrameLayout(context);
                this.f36054s5[i20] = new lh.d(context, this.f36067v0);
                this.f36054s5[i20].setRoundRadius(AndroidUtilities.dp(19.0f));
                this.f36054s5[i20].setUseWrapContent(true);
                this.f36054s5[i20].setPadding(AndroidUtilities.dp(16.0f), i18, AndroidUtilities.dp(16.0f), i18);
                if (i20 == 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                    this.f36039q5 = spannableStringBuilder;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.cq(R.drawable.filled_premium_camera), i18, 1, 33);
                    this.f36039q5.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
                    this.f36046r5 = spannableStringBuilder2;
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.cq(R.drawable.filled_add_album), i18, 1, 33);
                    this.f36046r5.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAlbumBottomButtonAddStories));
                    this.f36054s5[i20].h(this.f36039q5);
                } else {
                    this.f36054s5[i20].h(LocaleController.getString(R.string.StorySave));
                }
                dVar.setOnClickListener(new hh.z0(this, i20, i19));
                h7.b6.b(dVar, 0.02f, 1.2f);
                this.f36054s5[i20].setStateListAnimator(null);
                dVar.addView(this.f36054s5[i20], h7.z5.e(-2, -1, 17));
                this.f36033p5[i20].addView(dVar, h7.z5.e(-2, 60, 1));
                this.f36026o5.addView(this.f36033p5[i20], h7.z5.e(-1, -1, 87));
                if (i20 == 1 || !getMessagesController().storiesEnabled()) {
                    this.f36033p5[i20].setTranslationY(AndroidUtilities.dp(72.0f));
                }
                i20++;
                i18 = 0;
                i19 = 23;
            }
        }
        TLRPC.ChatFull chatFull2 = this.f36036q2;
        ArrayList arrayList = (chatFull2 == null || (chatParticipants = chatFull2.participants) == null || chatParticipants.participants.size() <= 5) ? null : this.f36089y2;
        if (this.f36056t1) {
            aVar = aVar2;
            i10 = 6;
        } else if (this.f36029p1 && (((userFull = this.f36043r2) != null && userFull.stargifts_count > 0) || ((chatFull = this.f36036q2) != null && chatFull.stargifts_count > 0))) {
            this.f36050s1 = true;
            aVar = aVar2;
            i10 = 14;
        } else if (this.f36015n1) {
            aVar = aVar2;
            i10 = 10;
        } else {
            aVar = aVar2;
            i10 = arrayList != null ? 7 : -1;
        }
        org.telegram.ui.Components.zt0 zt0Var = this.N;
        TLRPC.UserFull userFull3 = this.f36043r2;
        long j11 = j10;
        jg.a aVar4 = aVar;
        hz0 hz0Var2 = new hz0(this, context, j11, zt0Var, userFull3 != null ? userFull3.common_chats_count : 0, this.f36089y2, this.f36036q2, userFull3, i10, this.f36062u1, this, this, this.f36067v0, this.f36000k6);
        this.K = hz0Var2;
        hz0Var2.setLayoutParams(new f2.y0(-1, -1));
        this.K.n0((ViewGroup) this.fragmentView);
        int i23 = 4;
        int i24 = 3;
        if (this.f35923a1 == 0 || this.m0 == null || this.f36022o1) {
            org.telegram.ui.Components.jh0 jh0Var = new org.telegram.ui.Components.jh0(context, this.f36067v0);
            this.Y = jh0Var;
            org.telegram.ui.Components.tg0 tg0Var = this.f35980i0;
            if (tg0Var != null) {
                tg0Var.setMusicView(jh0Var);
            }
            this.Y.setColor(this.M5);
            TLRPC.UserFull userFull4 = this.f36043r2;
            if (userFull4 != null && (document = userFull4.saved_music) != null) {
                this.Y.setMusicDocument(document);
            }
            this.Y.setOnClickListener(new fx0(this, i23));
            this.W = new org.telegram.ui.Components.rg0(context, AndroidUtilities.dp(74.0f));
            I4();
            r12 = 0;
            g5(false);
            this.W.setOnActionClickListener(new gx0(this, i24));
        } else {
            r12 = 0;
        }
        org.telegram.ui.ActionBar.z zVarN = this.actionBar.n();
        zVarN.setTranslationX(-AndroidUtilities.dp(5.0f));
        if (this.f35923a1 == getUserConfig().clientUserId && !this.f36022o1 && ContactsController.getInstance(this.currentAccount).getPrivacyRules(7) == null) {
            ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
        }
        if (this.m0 != null && !this.f36022o1) {
            org.telegram.ui.ActionBar.v0 v0VarA = zVarN.a(32, R.drawable.outline_header_search);
            v0VarA.F();
            v0VarA.D = new db(this, 14);
            this.Q0 = v0VarA;
            v0VarA.setContentDescription(LocaleController.getString(R.string.SearchInSettings));
            this.Q0.setSearchFieldHint(LocaleController.getString(R.string.SearchInSettings));
            this.K.getSearchItem().setVisibility(8);
            if (this.K.getSearchOptionsItem() != null) {
                this.K.getSearchOptionsItem().setVisibility(8);
            }
            if (this.K.getSaveItem() != null) {
                this.K.getSaveItem().setVisibility(8);
            }
            if (this.f35988j1) {
                this.Q0.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.v0 v0VarA2 = zVarN.a(16, R.drawable.profile_video);
        this.N0 = v0VarA2;
        v0VarA2.setContentDescription(LocaleController.getString(R.string.VideoCall));
        if (this.f35929b1 != 0) {
            this.M0 = zVarN.a(15, R.drawable.msg_voicechat2);
            if (ChatObject.isChannelOrGiga(this.A2)) {
                this.M0.setContentDescription(LocaleController.getString(R.string.VoipChannelVoiceChat));
            } else {
                this.M0.setContentDescription(LocaleController.getString(R.string.VoipGroupVoiceChat));
            }
        } else {
            org.telegram.ui.ActionBar.v0 v0VarA3 = zVarN.a(15, R.drawable.call);
            this.M0 = v0VarA3;
            v0VarA3.setContentDescription(LocaleController.getString(R.string.Call));
        }
        if (this.f36022o1) {
            org.telegram.ui.ActionBar.v0 v0VarA4 = zVarN.a(41, R.drawable.group_edit_profile);
            this.O0 = v0VarA4;
            v0VarA4.setContentDescription(LocaleController.getString(R.string.Edit));
        } else {
            org.telegram.ui.ActionBar.v0 v0VarA5 = zVarN.a(12, R.drawable.group_edit_profile);
            this.O0 = v0VarA5;
            v0VarA5.setContentDescription(LocaleController.getString(R.string.Edit));
        }
        org.telegram.ui.ActionBar.v0 v0VarC = zVarN.c(10, R.drawable.ic_ab_other, this.f36067v0);
        this.P0 = v0VarC;
        v0VarC.setSubMenuDelegate(new ay0(this));
        ImageView imageView = new ImageView(context);
        this.U0 = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.f23375v8), PorterDuff.Mode.MULTIPLY));
        AndroidUtilities.updateViewVisibilityAnimated(this.U0, r12, 0.8f, r12);
        this.U0.setImageResource(R.drawable.msg_mini_autodelete_timer);
        this.P0.addView(this.U0, h7.z5.d(12, 12.0f, 19, 8.0f, 2.0f, 0.0f, 0.0f));
        this.P0.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.P0.E(aVar4, ng.c.g(this.resourceProvider));
        if (this.f35921a == null || this.m0 == null) {
            i11 = -1;
            tag = null;
        } else {
            int iL0 = this.f35935c.L0();
            View viewM = this.f35935c.m(iL0);
            if (viewM != null) {
                viewM.getTop();
                this.f35921a.getPaddingTop();
            } else {
                iL0 = -1;
            }
            i11 = iL0;
            tag = this.v.getTag();
        }
        D3(r12);
        this.d = new vz0(this, context);
        this.f35950e = new g01(context, this);
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8();
        this.f36001l0 = y8Var;
        y8Var.f34858p = 2.3809524f;
        y8Var.t();
        this.fragmentView.setWillNotDraw(r12);
        fz0 fz0Var = (fz0) this.fragmentView;
        this.f35985i5 = fz0Var;
        fz0Var.J = true;
        by0 by0Var = new by0(this, context, this.f36067v0);
        this.f35921a = by0Var;
        by0Var.p1();
        by0 by0Var2 = this.f35921a;
        by0Var2.getClass();
        int i25 = org.telegram.ui.ActionBar.g6.f22999a7;
        by0Var2.setBackgroundColor(getThemedColor(i25));
        this.f35921a.setVerticalScrollBarEnabled(r12);
        final jg.k kVar = new jg.k(this.f35921a, (ViewGroup) this.fragmentView, new v8(this, 1));
        kVar.h = true;
        cy0 cy0Var = new cy0(this);
        this.f35921a.setItemAnimator(cy0Var);
        int i26 = i11;
        cy0Var.f5843e = 320L;
        cy0Var.d = 320L;
        cy0Var.f5842c = 320L;
        cy0Var.f5819m = r12;
        cy0Var.S();
        cy0Var.o(org.telegram.ui.Components.er.h);
        this.f35921a.setClipToPadding(r12);
        this.f35921a.setHideIfEmpty(r12);
        dy0 dy0Var = new dy0(this);
        this.f35935c = dy0Var;
        dy0Var.j1(1);
        dy0 dy0Var2 = this.f35935c;
        dy0Var2.f5723r = r12;
        this.f35921a.setLayoutManager(dy0Var2);
        this.f35921a.setGlowColor(r12);
        this.f35921a.setAdapter(this.d);
        frameLayout.addView(this.f35921a, h7.z5.e(-1, -1, 51));
        this.f35921a.setOnItemClickListener(new c3.f(this, context, j11, 9));
        this.f35921a.setOnItemLongClickListener(new hy0(this, context));
        if (this.f36015n1 || this.f36029p1 || this.f36056t1) {
            j5();
            F();
            this.S5 = true;
            this.Q5 = this.F4;
            this.R5 = r12;
        }
        if (this.Q0 != null) {
            org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context);
            this.f35927b = zk0Var;
            zk0Var.setVerticalScrollBarEnabled(r12);
            this.f35927b.setLayoutManager(new f2.k0(1, r12));
            this.f35927b.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23074e8));
            this.f35927b.setAdapter(this.f35950e);
            this.f35927b.setItemAnimator(null);
            this.f35927b.setVisibility(8);
            this.f35927b.setLayoutAnimation(null);
            this.f35927b.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
            frameLayout.addView(this.f35927b, h7.z5.e(-1, -1, 51));
            this.f35927b.setOnItemClickListener(new i(this, 27));
            this.f35927b.setOnItemLongClickListener(new gx0(this, i23));
            this.f35927b.setOnScrollListener(new iy0(this, r12));
            this.f35927b.m1(1, true);
            org.telegram.ui.Components.iw0 iw0Var = new org.telegram.ui.Components.iw0(context);
            this.L = iw0Var;
            iw0Var.setAnimateLayoutChange(true);
            this.L.f29506e.setVisibility(8);
            this.L.setVisibility(8);
            frameLayout.addView(this.L);
            this.f35950e.G();
        }
        if (this.A1 != 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.A1));
            if (this.C2 == null) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant.channel = MessagesController.getInputChannel(chat);
                tL_channels_getParticipant.participant = getMessagesController().getInputPeer(this.f35923a1);
                getConnectionsManager().sendRequest(tL_channels_getParticipant, new px0(this, i23));
            }
            ag.d dVar2 = new ag.d(context, 25);
            dVar2.setWillNotDraw(r12);
            dVar2.setPadding(r12, r12, r12, AndroidUtilities.navigationBarHeight);
            frameLayout.addView(dVar2, h7.z5.a(-1.0f, (AndroidUtilities.navigationBarHeight / AndroidUtilities.density) + 51.0f, 83));
            dVar2.setOnClickListener(new u70(18, this, chat));
            TextView textView = new TextView(context);
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23269p7));
            textView.setTextSize(1, 15.0f);
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.getString(R.string.BanFromTheGroupNoCaps));
            dVar2.addView(textView, h7.z5.d(-2, -2.0f, 17, 0.0f, 1.0f, 0.0f, 0.0f));
            this.f35921a.setPadding(r12, T3(), r12, AndroidUtilities.dp(48.0f));
            this.f35921a.setBottomGlowOffset(AndroidUtilities.dp(48.0f));
        } else {
            this.f35921a.setPadding(r12, T3(), r12, r12);
        }
        j01 j01Var = new j01(this, context);
        this.Z0 = j01Var;
        j01Var.a(this.M5, r12);
        this.Z0.setBackgroundColor(getThemedColor(i25));
        frameLayout.addView(this.Z0);
        this.f35985i5.P.add(this.Z0);
        org.telegram.ui.Cells.o oVar = new org.telegram.ui.Cells.o(context);
        this.Z = oVar;
        oVar.setPivotX(AndroidUtilities.dp(30.0f));
        this.Z.setPivotY(AndroidUtilities.dp(30.0f));
        this.U = new n0(this, context, 20);
        this.V = new ag.y1(this, context, 21);
        ImageReceiver imageReceiver = new ImageReceiver(this.V);
        this.f36019n5 = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(11.0f));
        AndroidUtilities.updateViewVisibilityAnimated(this.V, true, 1.0f, r12);
        frameLayout.addView(this.V, h7.z5.d(-1, -1.0f, 8388611, 0.0f, 0.0f, 0.0f, 0.0f));
        this.U.setPivotX(0.0f);
        this.U.setPivotY(0.0f);
        org.telegram.ui.Components.gh0 gh0Var = new org.telegram.ui.Components.gh0(context);
        this.f36028p0 = gh0Var;
        gh0Var.addView(this.U, h7.z5.e(100, 100, 51));
        this.V.addView(this.f36028p0, h7.z5.c(-1.0f, -1));
        ly0 ly0Var = new ly0(context);
        this.f35922a0 = ly0Var;
        ly0Var.t(O3());
        this.f35922a0.getImageReceiver().setAllowDecodeSingleFrame(true);
        this.f35922a0.setRoundRadiusForExpand(c4());
        this.f35922a0.setPivotX(0.0f);
        this.f35922a0.setPivotY(0.0f);
        this.U.addView(this.f35922a0, h7.z5.c(-1.0f, -1));
        this.f35922a0.setOnClickListener(new fx0(this, 5));
        this.f35922a0.setHasStories(j4());
        this.f35922a0.setOnLongClickListener(new v(this, 6));
        org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(this, context);
        this.f35936c0 = w3Var;
        w3Var.setSize(AndroidUtilities.dp(26.0f));
        this.f35936c0.setProgressColor(-1);
        this.f35936c0.setNoProgress(r12);
        this.U.addView(this.f35936c0, h7.z5.c(-1.0f, -1));
        ImageView imageView2 = new ImageView(context);
        this.f35943d0 = imageView2;
        imageView2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
        ImageView imageView3 = this.f35943d0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        this.f35943d0.setAlpha(0.0f);
        this.f35943d0.setScaleX(0.85f);
        this.f35943d0.setScaleY(0.85f);
        ImageView imageView4 = this.f35943d0;
        org.telegram.ui.Components.c11 c11Var = new org.telegram.ui.Components.c11(context, null);
        this.f35973h0 = c11Var;
        imageView4.setImageDrawable(c11Var);
        this.f35943d0.setTranslationY(-1.0f);
        frameLayout.addView(this.f35943d0, h7.z5.e(34, 34, 51));
        ImageView imageView5 = new ImageView(context);
        this.f35951e0 = imageView5;
        imageView5.setScaleType(scaleType);
        this.f35951e0.setAlpha(0.0f);
        this.f35951e0.setImageDrawable(new oh.a());
        frameLayout.addView(this.f35951e0, h7.z5.e(16, 16, 51));
        ImageView imageView6 = new ImageView(context);
        this.f35959f0 = imageView6;
        imageView6.setImageResource(R.drawable.star_small_outline);
        this.f35959f0.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.f23322s8), PorterDuff.Mode.SRC_IN));
        this.f35959f0.setAlpha(0.0f);
        this.f35959f0.setScaleY(0.0f);
        this.f35959f0.setScaleX(0.0f);
        frameLayout.addView(this.f35959f0, h7.z5.e(20, 20, 51));
        ImageView imageView7 = new ImageView(context);
        this.f35966g0 = imageView7;
        imageView7.setImageResource(R.drawable.star_small_inner);
        this.f35966g0.setAlpha(0.0f);
        this.f35966g0.setScaleY(0.0f);
        this.f35966g0.setScaleX(0.0f);
        frameLayout.addView(this.f35966g0, h7.z5.e(20, 20, 51));
        k5();
        P4(r12, r12);
        my0 my0Var = this.f35987j0;
        if (my0Var != null) {
            my0Var.K();
        }
        org.telegram.ui.Components.tg0 tg0Var2 = this.f35980i0;
        if (tg0Var2 != null) {
            tg0Var2.e();
        }
        this.J = new wz0(this, context);
        org.telegram.ui.Components.tg0 tg0Var3 = new org.telegram.ui.Components.tg0(context);
        this.f35980i0 = tg0Var3;
        tg0Var3.setSize(O3());
        long j12 = this.f35923a1;
        if (j12 == 0) {
            j12 = -this.f35929b1;
        }
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        by0 by0Var3 = this.f35921a;
        long j13 = j12;
        ly0 ly0Var2 = this.f35922a0;
        getClassGuid();
        int i27 = 1;
        this.f35987j0 = new my0(this, context, j13, kVar2, by0Var3, ly0Var2, this.J, this.f35980i0);
        if (this.f35923a1 != getUserConfig().clientUserId && (userFull2 = this.f36043r2) != null) {
            this.f35992j5 = userFull2.profile_photo == null ? 0.0f : 1.0f;
        }
        if (!this.f36007m1) {
            this.f35987j0.setChatInfo(this.f36036q2);
        }
        this.V.addView(this.f35987j0);
        this.V.addView(this.f35980i0, h7.z5.c(138.0f, -1));
        this.V.addView(this.J);
        org.telegram.ui.Components.rg0 rg0Var = this.W;
        if (rg0Var != null) {
            this.f35980i0.setActionsView(rg0Var);
            this.V.addView(this.W, h7.z5.c(-1.0f, -1));
        }
        org.telegram.ui.Components.jh0 jh0Var2 = this.Y;
        if (jh0Var2 != null) {
            this.f35980i0.setMusicView(jh0Var2);
            this.V.addView(this.Y, h7.z5.c(-1.0f, -1));
        }
        this.f35922a0.setAvatarsViewPager(this.f35987j0);
        yz0 yz0Var = new yz0(this, context);
        this.f35994k0 = yz0Var;
        this.V.addView(yz0Var, h7.z5.c(-1.0f, -1));
        frameLayout.addView(this.actionBar);
        float width = 54 + ((!this.H0 || this.f35923a1 == 0) ? 0 : 54);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var == null || !(b5Var.getLastFragment() instanceof rn) || (rnVarP = ((rn) this.parentLayout.getLastFragment()).p()) == null) {
            z10 = false;
        } else {
            z10 = rnVarP.getTitleTextView().getPaddingRight() != 0;
            if (rnVarP.getLayoutParams() != null && rnVarP.getTitleTextView() != null) {
                width = ((rnVarP.getWidth() - rnVarP.getTitleTextView().getRight()) + ((ViewGroup.MarginLayoutParams) rnVarP.getLayoutParams()).rightMargin) / AndroidUtilities.density;
            }
        }
        int i28 = 0;
        while (true) {
            org.telegram.ui.ActionBar.h5[] h5VarArr = this.f35958f;
            if (i28 >= h5VarArr.length) {
                break;
            }
            if (this.F1 != 0 || i28 != 0) {
                bl blVar = new bl(this, context, 3);
                h5VarArr[i28] = blVar;
                if (i28 == 1) {
                    blVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.vh));
                } else {
                    blVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.A8));
                }
                h5VarArr[i28].setPadding(r12, AndroidUtilities.dp(6.0f), r12, AndroidUtilities.dp(i28 == 0 ? 12.0f : 4.0f));
                h5VarArr[i28].setTextSizePx(AndroidUtilities.dp(17.5f));
                h5VarArr[i28].setGravity(3);
                h5VarArr[i28].setTypeface(AndroidUtilities.bold());
                h5VarArr[i28].setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
                h5VarArr[i28].setPivotX(0.0f);
                h5VarArr[i28].setPivotY(0.0f);
                h5VarArr[i28].setAlpha(i28 == 0 ? 0.0f : 1.0f);
                if (i28 == 1) {
                    h5VarArr[i28].setScrollNonFitText(true);
                    h5VarArr[i28].setImportantForAccessibility(2);
                }
                h5VarArr[i28].setFocusable(i28 == 0);
                h5VarArr[i28].setEllipsizeByGradient(true);
                h5VarArr[i28].setRightDrawableOutside(i28 == 0);
                this.V.addView(h5VarArr[i28], h7.z5.d(-2, -2.0f, 51, 109.0f, -6.0f, i28 == 0 ? width - (z10 ? 10 : 0) : 0.0f, 0.0f));
            }
            i28++;
        }
        int i29 = 0;
        while (true) {
            org.telegram.ui.ActionBar.h5[] h5VarArr2 = this.f36040r;
            if (i29 >= h5VarArr2.length) {
                break;
            }
            if (i29 == 1) {
                h5VarArr2[i29] = new ny0(this, context);
            } else {
                h5VarArr2[i29] = new org.telegram.ui.Components.k80(context);
            }
            h5VarArr2[i29].setEllipsizeByGradient(true);
            h5VarArr2[i29].setTextColor(w3(getThemedColor(org.telegram.ui.ActionBar.g6.B8), null));
            h5VarArr2[i29].setTextSizePx(AndroidUtilities.dp(13.5f));
            h5VarArr2[i29].setGravity(3);
            h5VarArr2[i29].setAlpha(i29 == 0 ? 0.0f : 1.0f);
            h5VarArr2[i29].setPivotX(AndroidUtilities.dp(8.0f));
            h5VarArr2[i29].setPivotY(AndroidUtilities.dp(8.0f));
            if (i29 == 1 || i29 == 2 || i29 == 3) {
                h5VarArr2[i29].setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            }
            if (i29 > 0) {
                h5VarArr2[i29].setImportantForAccessibility(2);
            }
            h5VarArr2[i29].setFocusable(i29 == 0);
            ag.y1 y1Var = this.V;
            org.telegram.ui.ActionBar.h5 h5Var = h5VarArr2[i29];
            if (i29 == 1 || i29 == 2) {
                i13 = 3;
            } else {
                i13 = 3;
                if (i29 != 3) {
                    i14 = 0;
                }
                float f11 = 109 - i14;
                if (i29 != 1 || i29 == 2 || i29 == i13) {
                    i15 = -2;
                } else {
                    i15 = 0;
                }
                float f12 = i15;
                if (i29 == 0) {
                    if (z10) {
                        i17 = 10;
                    } else {
                        i17 = 0;
                    }
                    f10 = width - i17;
                } else {
                    f10 = 8.0f;
                }
                if (i29 != 1 || i29 == 2 || i29 == 3) {
                    i16 = 4;
                } else {
                    i16 = 0;
                }
                y1Var.addView(h5Var, h7.z5.d(-2, -2.0f, 51, f11, f12, f10 - i16, 0.0f));
                i29++;
            }
            i14 = 4;
            float f13 = 109 - i14;
            if (i29 != 1) {
                i15 = -2;
            } else {
                i15 = -2;
            }
            float f14 = i15;
            if (i29 == 0) {
                if (z10) {
                    i17 = 10;
                } else {
                    i17 = 0;
                }
                f10 = width - i17;
            } else {
                f10 = 8.0f;
            }
            if (i29 != 1) {
                i16 = 4;
            } else {
                i16 = 4;
            }
            y1Var.addView(h5Var, h7.z5.d(-2, -2.0f, 51, f13, f14, f10 - i16, 0.0f));
            i29++;
        }
        B3();
        this.V.addView(this.Z);
        org.telegram.ui.Components.sv0 sv0Var = new org.telegram.ui.Components.sv0(context);
        this.P = sv0Var;
        sv0Var.setLayoutParams(h7.z5.d(32, 32.0f, 3, 103.0f, -2.0f, 0.0f, 0.0f));
        this.P.setResourcesProvider(this.f36067v0);
        C3();
        this.P.setDelegate(new gx0(this, 10));
        this.P.setOnClickListener(new fx0(this, r12));
        TLRPC.UserFull userFull5 = this.f36043r2;
        if (userFull5 != null) {
            this.P.set(userFull5.stars_rating);
        }
        this.V.addView(this.P);
        org.telegram.ui.Components.on0 on0Var = new org.telegram.ui.Components.on0(this, context, context, i27);
        this.f36048s = on0Var;
        on0Var.setAlpha(0.0f);
        this.V.addView(this.f36048s, h7.z5.d(-2, -2.0f, 51, 109.33f, -2.0f, 8.0f, 0.0f));
        this.f36034q0 = new oy0(this, context, this.currentAccount, a(), this.f36007m1, this.U, this.f35922a0, this.f36067v0, context);
        l5(r12);
        TLRPC.UserFull userFull6 = this.f36043r2;
        if (userFull6 != null) {
            this.f36034q0.setStories(userFull6.stories);
        } else {
            TLRPC.ChatFull chatFull3 = this.f36036q2;
            if (chatFull3 != null) {
                this.f36034q0.setStories(chatFull3.stories);
            }
        }
        ly0 ly0Var3 = this.f35922a0;
        if (ly0Var3 != null) {
            ly0Var3.setHasStories(j4());
        }
        this.V.addView(this.f36034q0, h7.z5.c(-1.0f, -1));
        hh.v0 v0Var = new hh.v0(context, this.currentAccount, a(), this.U);
        this.f36041r0 = v0Var;
        this.V.addView(v0Var, (int) r12, h7.z5.c(-1.0f, -1));
        i5(true);
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
        this.v = ri0Var;
        if (this.W != null) {
            ri0Var.setVisibility(8);
        }
        p5();
        if (this.f35923a1 == 0) {
            this.v.setImageResource(R.drawable.profile_discuss);
            this.v.setContentDescription(LocaleController.getString(R.string.ViewDiscussion));
        } else if (this.m0 != null) {
            int i30 = R.raw.camera_outline;
            this.R = new org.telegram.ui.Components.oi0(i30, String.valueOf(i30), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            this.S = new org.telegram.ui.Components.oi0(R.raw.camera_outline, a9.p.k(R.raw.camera_outline, "_cell", new StringBuilder()), AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), false, null);
            org.telegram.ui.Components.rg0 rg0Var2 = this.W;
            if (rg0Var2 != null) {
                rg0Var2.e();
                this.W.a();
                this.W.b();
                this.W.c();
                org.telegram.ui.Components.rg0 rg0Var3 = this.W;
                if (rg0Var3.E) {
                    rg0Var3.E = r12;
                    rg0Var3.d();
                }
            } else {
                this.v.setAnimation(this.R);
                this.v.setContentDescription(LocaleController.getString(R.string.AccDescrChangeProfilePicture));
                this.v.setPadding(AndroidUtilities.dp(2.0f), r12, r12, AndroidUtilities.dp(2.0f));
            }
        } else {
            org.telegram.ui.Components.rg0 rg0Var4 = this.W;
            if (rg0Var4 != 0) {
                rg0Var4.o(r12, true);
            }
            this.v.setImageResource(R.drawable.profile_newmsg);
            this.v.setContentDescription(LocaleController.getString(R.string.AccDescrOpenChat));
        }
        org.telegram.ui.Components.ri0 ri0Var2 = this.v;
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        ri0Var2.setScaleType(scaleType2);
        frameLayout.addView(this.v, h7.z5.d(60, 60.0f, 53, 0.0f, 0.0f, 16.0f, 0.0f));
        this.v.setOnClickListener(new fx0(this, 1));
        k4(r12);
        if (i26 != -1 && tag != null) {
            this.v.setTag(Integer.valueOf((int) r12));
            this.v.setScaleX(0.2f);
            this.v.setScaleY(0.2f);
            this.v.setAlpha(0.0f);
        }
        this.f35921a.setOnScrollListener(new iy0(this, 1));
        UndoView undoView = new UndoView(context, null, r12, this.f36067v0);
        this.I = undoView;
        frameLayout.addView(undoView, h7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        int i31 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f35961f2 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new lx0(this, r12));
        this.f35961f2.setInterpolator(org.telegram.ui.Components.er.h);
        this.f35961f2.addListener(new py0(this));
        j5();
        R();
        org.telegram.ui.Components.x30 x30Var = new org.telegram.ui.Components.x30(getParentActivity(), 9);
        this.T = x30Var;
        x30Var.setAlpha(0.0f);
        frameLayout.addView(this.T, h7.z5.d(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
        this.K.setForwardRestrictedHint(this.T);
        qy0 qy0Var = new qy0(this, (ViewGroup) getParentActivity().getWindow().getDecorView(), frameLayout);
        this.R4 = qy0Var;
        qy0Var.E = new ay0(this);
        this.f35987j0.setPinchToZoomHelper(qy0Var);
        this.f36055t0.setAlpha(r12);
        this.f36061u0.setColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23144i6));
        this.f35985i5.P.add(this.K);
        m5();
        aj0 aj0Var = new aj0(this, context, 5);
        this.Q = aj0Var;
        if (Build.VERSION.SDK_INT >= 23) {
            aj0Var.setForeground(new ColorDrawable(i0.b.k(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6), 100)));
        }
        this.Q.setFocusable((boolean) r12);
        this.Q.setImportantForAccessibility(2);
        this.Q.setOnClickListener(new fx0(this, i31));
        this.Q.setVisibility(8);
        this.Q.setFitsSystemWindows(true);
        this.f35985i5.addView(this.Q, h7.z5.c(-1.0f, -1));
        F3();
        if (this.f36022o1) {
            i12 = 87;
            this.f35985i5.addView(this.f36026o5, h7.z5.e(-1, 60, 87));
        } else {
            i12 = 87;
        }
        org.telegram.ui.Components.rg0 rg0Var5 = this.W;
        if (rg0Var5 != null && rg0Var5.l()) {
            ImageView imageView8 = new ImageView(context);
            this.K0 = imageView8;
            imageView8.setScaleType(scaleType2);
            this.K0.setImageResource(R.drawable.call);
            this.K0.setVisibility(8);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AndroidUtilities.dp(48.0f), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            layoutParams.topMargin = this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
            layoutParams.setMarginEnd(layoutParams.width);
            layoutParams.gravity = 8388613;
            frameLayout.addView(this.K0, layoutParams);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f36066u5 = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
        View view = new View(context);
        view.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23054d7));
        this.f36066u5.addView(view, h7.z5.d(-1, 1.0f / AndroidUtilities.density, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        lh.d dVar3 = new lh.d(context, this.f36067v0);
        this.f36071v5 = dVar3;
        dVar3.h(LocaleController.getString(R.string.Save));
        this.f36066u5.addView(this.f36071v5, h7.z5.d(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
        this.f36071v5.setOnClickListener(new fx0(this, 3));
        this.f36066u5.setVisibility(8);
        this.f36066u5.setTranslationY(AndroidUtilities.dp(69.0f));
        this.f35985i5.addView(this.f36066u5, h7.z5.e(-1, -2, i12));
        this.f36027o6 = new kg.a() {
            @Override
            public final void e(Canvas canvas, RectF rectF) {
                kVar.e(canvas, rectF);
                org.telegram.ui.Components.wg wgVar = this.f41764a.K.Y1;
                if (wgVar != null) {
                    wgVar.e(canvas, rectF);
                }
            }

            @Override
            public final void g(g.y yVar, RectF rectF) {
                yVar.f6327b = true;
            }
        };
        r0.j0.m(this.fragmentView, new gx0(this, i31));
        return this.fragmentView;
    }

    public final org.telegram.ui.Components.dr d4(int i10) {
        MessagesController.PeerColor peerColor;
        org.telegram.ui.Components.dr[] drVarArr = this.F;
        if (drVarArr[i10] == null) {
            Drawable drawableMutate = org.telegram.ui.ActionBar.g6.Q1.getConstantState().newDrawable().mutate();
            Drawable[] drawableArr = this.f36086y;
            drawableArr[i10] = drawableMutate;
            Drawable drawableMutate2 = org.telegram.ui.ActionBar.g6.R1.getConstantState().newDrawable().mutate();
            Drawable[] drawableArr2 = this.E;
            drawableArr2[i10] = drawableMutate2;
            if (i10 == 1 && (peerColor = this.M5) != null) {
                int iB = org.telegram.ui.ActionBar.g6.b(0.1f, org.telegram.ui.ActionBar.g6.I.q() ? -0.1f : -0.08f, peerColor.hasColor6(org.telegram.ui.ActionBar.g6.I.q()) ? this.M5.getColor5() : this.M5.getColor3());
                Drawable drawable = drawableArr[1];
                int offsetColor = AndroidUtilities.getOffsetColor(iB, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oi, this.f36067v0), this.A5, 1.0f);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(offsetColor, mode);
                drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(-1, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, this.f36067v0), this.A5, 1.0f), mode);
            }
            drVarArr[i10] = new org.telegram.ui.Components.dr(new org.telegram.ui.Components.dq(drawableArr[i10], drawableArr2[i10]), getParentActivity().getDrawable(R.drawable.verified_profile));
        }
        return drVarArr[i10];
    }

    public final void d5() {
        e5(false, false);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        vz0 vz0Var;
        TLRPC.ChatFull chatFull;
        TLRPC.User user;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.Chat chat;
        by0 by0Var;
        by0 by0Var2;
        org.telegram.ui.Components.lk0 lk0Var;
        if (i10 == NotificationCenter.uploadStoryEnd || i10 == NotificationCenter.chatWasBoostedByUser) {
            if (ChatObject.isBoostSupported(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f35929b1)))) {
                getMessagesController().getStoriesController().k(a(), new j4.w0(12), false, this.f36067v0);
                return;
            }
            return;
        }
        int i12 = 0;
        z = false;
        boolean z10 = false;
        if (i10 == NotificationCenter.updateInterfaces) {
            int iIntValue = ((Integer) objArr[0]).intValue();
            boolean z11 = ((MessagesController.UPDATE_MASK_AVATAR & iIntValue) == 0 && (MessagesController.UPDATE_MASK_NAME & iIntValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & iIntValue) == 0 && (MessagesController.UPDATE_MASK_EMOJI_STATUS & iIntValue) == 0) ? false : true;
            if (this.f35923a1 != 0) {
                if (z11) {
                    i5(true);
                }
                if ((iIntValue & MessagesController.UPDATE_MASK_PHONE) == 0 || (by0Var2 = this.f35921a) == null || (lk0Var = (org.telegram.ui.Components.lk0) by0Var2.L(this.C3, false)) == null) {
                    return;
                }
                this.d.v(lk0Var, this.C3);
                return;
            }
            if (this.f35929b1 != 0) {
                if ((MessagesController.UPDATE_MASK_CHAT & iIntValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & iIntValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & iIntValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_MEMBERS & iIntValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & iIntValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & iIntValue) != 0) {
                    if ((MessagesController.UPDATE_MASK_CHAT & iIntValue) != 0) {
                        e5(true, false);
                    } else {
                        h5(true);
                    }
                    i5(true);
                }
                if (!z11 || (by0Var = this.f35921a) == null) {
                    return;
                }
                int childCount = by0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = this.f35921a.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.sa) {
                        ((org.telegram.ui.Cells.sa) childAt).j(iIntValue);
                    }
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.chatOnlineCountDidLoad) {
            Long l10 = (Long) objArr[0];
            if (this.f36036q2 == null || (chat = this.A2) == null || chat.f22380id != l10.longValue()) {
                return;
            }
            this.f36036q2.online_count = ((Integer) objArr[1]).intValue();
            h5(true);
            i5(false);
            return;
        }
        if (i10 == NotificationCenter.contactsDidLoad || i10 == NotificationCenter.channelRightsUpdated) {
            D3(true);
            return;
        }
        if (i10 == NotificationCenter.encryptedChatCreated) {
            if (this.f35960f1) {
                AndroidUtilities.runOnUIThread(new zs0(11, this, objArr));
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.encryptedChatUpdated) {
            TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
            TLRPC.EncryptedChat encryptedChat2 = this.f36095z2;
            if (encryptedChat2 == null || encryptedChat.f22388id != encryptedChat2.f22388id) {
                return;
            }
            this.f36095z2 = encryptedChat;
            e5(false, false);
            FlagSecureReason flagSecureReason = this.T1;
            if (flagSecureReason != null) {
                flagSecureReason.invalidate();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.blockedUsersDidLoad) {
            boolean z12 = this.f35967g1;
            boolean z13 = getMessagesController().blockePeers.indexOfKey(this.f35923a1) >= 0;
            this.f35967g1 = z13;
            if (z12 != z13) {
                D3(true);
                e5(false, false);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.groupCallUpdated) {
            Long l11 = (Long) objArr[0];
            if (this.A2 != null) {
                long jLongValue = l11.longValue();
                TLRPC.Chat chat2 = this.A2;
                if (jLongValue == chat2.f22380id && ChatObject.canManageCalls(chat2)) {
                    TLRPC.ChatFull chatFull4 = MessagesController.getInstance(this.currentAccount).getChatFull(l11.longValue());
                    if (chatFull4 != null) {
                        TLRPC.ChatFull chatFull5 = this.f36036q2;
                        if (chatFull5 != null) {
                            chatFull4.participants = chatFull5.participants;
                        }
                        this.f36036q2 = chatFull4;
                    }
                    hz0 hz0Var = this.K;
                    if (hz0Var != null) {
                        hz0Var.setChatInfo(this.f36036q2);
                    }
                    TLRPC.ChatFull chatFull6 = this.f36036q2;
                    if (chatFull6 != null && (((inputGroupCall = chatFull6.call) == null && !this.l1) || (inputGroupCall != null && this.l1))) {
                        D3(false);
                    }
                    oy0 oy0Var = this.f36034q0;
                    if (oy0Var != null && (chatFull3 = this.f36036q2) != null) {
                        oy0Var.setStories(chatFull3.stories);
                    }
                    hh.v0 v0Var = this.f36041r0;
                    if (v0Var != null) {
                        v0Var.a();
                    }
                    ly0 ly0Var = this.f35922a0;
                    if (ly0Var != null) {
                        ly0Var.setHasStories(j4());
                    }
                    if (l11.longValue() != 0) {
                        boolean z14 = (BuildVars.IS_BILLING_UNAVAILABLE || getMessagesController().premiumPurchaseBlocked() || (chatFull2 = this.f36036q2) == null || !chatFull2.stargifts_available) ? false : true;
                        this.P0.I(38, z14);
                        org.telegram.ui.Components.rg0 rg0Var = this.W;
                        if (rg0Var != null) {
                            rg0Var.o(3, z14);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull7 = (TLRPC.ChatFull) objArr[0];
            if (this.f35923a1 != 0 && (user = getMessagesController().getUser(Long.valueOf(this.f35923a1))) != null && chatFull7.f22381id == user.linked_community_id) {
                e5(true, false);
            }
            TLRPC.Chat chat3 = this.A2;
            if (chat3 != null && chatFull7.f22381id == chat3.linked_community_id) {
                e5(true, false);
            }
            if (chatFull7.f22381id == this.f35929b1) {
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                TLRPC.ChatFull chatFull8 = this.f36036q2;
                if ((chatFull8 instanceof TLRPC.TL_channelFull) && chatFull7.participants == null) {
                    chatFull7.participants = chatFull8.participants;
                }
                boolean z15 = chatFull8 == null && (chatFull7 instanceof TLRPC.TL_channelFull);
                this.f36036q2 = chatFull7;
                if (this.f35981i1 == 0) {
                    long j10 = chatFull7.migrated_from_chat_id;
                    if (j10 != 0) {
                        this.f35981i1 = -j10;
                        getMediaDataController().getMediaCount(this.f35981i1, this.f35937c1, 0, this.classGuid, true);
                    }
                }
                L3();
                my0 my0Var = this.f35987j0;
                if (my0Var != null && !this.f36007m1) {
                    my0Var.setChatInfo(this.f36036q2);
                }
                e5(true, false);
                TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(this.f35929b1));
                if (chat4 != null) {
                    this.A2 = chat4;
                    D3(true);
                }
                FlagSecureReason flagSecureReason2 = this.T1;
                if (flagSecureReason2 != null) {
                    flagSecureReason2.invalidate();
                }
                if (this.A2.megagroup && (z15 || !zBooleanValue)) {
                    R3(true);
                }
                T4();
                m5();
                oy0 oy0Var2 = this.f36034q0;
                if (oy0Var2 != null && (chatFull = this.f36036q2) != null) {
                    oy0Var2.setStories(chatFull.stories);
                }
                hh.v0 v0Var2 = this.f36041r0;
                if (v0Var2 != null) {
                    v0Var2.a();
                }
                ly0 ly0Var2 = this.f35922a0;
                if (ly0Var2 != null) {
                    ly0Var2.setHasStories(j4());
                }
                hz0 hz0Var2 = this.K;
                if (hz0Var2 != null) {
                    hz0Var2.setChatInfo(this.f36036q2);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
            return;
        }
        if (i10 == NotificationCenter.closeProfileActivity) {
            long jLongValue2 = ((Long) objArr[0]).longValue();
            boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
            if (jLongValue2 == a()) {
                if (zBooleanValue2 || this.parentLayout.getLastFragment() != this) {
                    if (this.parentLayout.getLastFragment() == this) {
                        finishFragment();
                        return;
                    } else {
                        removeSelfFromStack(true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.botInfoDidLoad) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) objArr[0];
            if (botInfo.user_id == this.f35923a1) {
                this.B2 = botInfo;
                e5(false, false);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.userInfoDidLoad) {
            if (((Long) objArr[0]).longValue() == this.f35923a1) {
                TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                this.f36043r2 = userFull;
                org.telegram.ui.Components.sv0 sv0Var = this.P;
                if (sv0Var != null) {
                    sv0Var.set(userFull.stars_rating);
                }
                oy0 oy0Var3 = this.f36034q0;
                if (oy0Var3 != null) {
                    oy0Var3.setStories(this.f36043r2.stories);
                }
                hh.v0 v0Var3 = this.f36041r0;
                if (v0Var3 != null) {
                    v0Var3.a();
                }
                ly0 ly0Var3 = this.f35922a0;
                if (ly0Var3 != null) {
                    ly0Var3.setHasStories(j4());
                }
                hz0 hz0Var3 = this.K;
                if (hz0Var3 != null) {
                    hz0Var3.setUserInfo(this.f36043r2);
                }
                if (this.m0 == null) {
                    if (this.C1 || this.G0) {
                        this.E1 = true;
                    } else {
                        D3(true);
                    }
                    e5(false, false);
                    hz0 hz0Var4 = this.K;
                    if (hz0Var4 != null) {
                        hz0Var4.setCommonGroupsCount(this.f36043r2.common_chats_count);
                        R();
                        org.telegram.ui.Components.zt0 zt0Var = this.N;
                        if (zt0Var == null || zt0Var.f35358y) {
                            resumeDelayedFragmentAnimation();
                            k4(true);
                        }
                    }
                } else if (this.d != null && !TextUtils.equals(this.f36043r2.about, this.f36069v2)) {
                    this.d.m(this.S2);
                }
                T4();
                m5();
                if (this.f36051s2 == null && !h4()) {
                    org.telegram.ui.Cells.c6 c6Var = new org.telegram.ui.Cells.c6(this.currentAccount);
                    this.f36051s2 = c6Var;
                    gb0 gb0Var = new gb0(this, 15);
                    if (c6Var.f24158c) {
                        gb0Var.run();
                    } else {
                        c6Var.h.add(gb0Var);
                    }
                    this.f36051s2.d(this.f36043r2);
                }
                if (!h4()) {
                    k01 k01Var = this.f36063u2;
                    k01 k01VarC = k01.c(this.currentAccount, this.f36043r2, k01Var);
                    this.f36063u2 = k01VarC;
                    this.f36057t2 = k01VarC != k01Var;
                    if (k01VarC != null) {
                        gb0 gb0Var2 = new gb0(this, 16);
                        if (k01VarC.f39553b) {
                            gb0Var2.run();
                        } else {
                            k01VarC.h.add(gb0Var2);
                        }
                    }
                }
                if (this.P0 != null) {
                    if (e4()) {
                        this.P0.K(44);
                    } else {
                        this.P0.r(44);
                    }
                    TLRPC.UserFull userFull2 = this.f36043r2;
                    if (!userFull2.noforwards_my_enabled && !userFull2.noforwards_peer_enabled) {
                        z10 = true;
                    }
                    this.P0.I(46, z10);
                    this.P0.I(47, !z10);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.privacyRulesUpdated) {
            return;
        }
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            long jA = a();
            if (jA == ((Long) objArr[0]).longValue()) {
                DialogObject.isEncryptedDialog(jA);
                ArrayList arrayList = (ArrayList) objArr[1];
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i14);
                    if (this.f36095z2 != null) {
                        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                        if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (vz0Var = this.d) != null) {
                            vz0Var.l();
                        }
                    }
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.emojiLoaded) {
            by0 by0Var3 = this.f35921a;
            if (by0Var3 != null) {
                by0Var3.f1();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.reloadInterface) {
            e5(false, false);
            return;
        }
        if (i10 == NotificationCenter.newSuggestionsAvailable) {
            int i15 = this.Y2;
            int i16 = this.W2;
            int i17 = this.U2;
            j5();
            vz0 vz0Var2 = this.d;
            if (vz0Var2 != null) {
                if (i15 == this.Y2 && i16 == this.W2 && i17 == this.U2) {
                    return;
                }
                vz0Var2.l();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.topicsDidLoaded) {
            if (this.f36007m1) {
                i5(false);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updateSearchSettings) {
            g01 g01Var = this.f35950e;
            if (g01Var != null) {
                g01Var.f38252c = g01.H(this);
                this.f35950e.v.clear();
                this.f35950e.J();
                g01 g01Var2 = this.f35950e;
                g01Var2.I(g01Var2.f38260y);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.reloadDialogPhotos) {
            i5(false);
            return;
        }
        if (i10 == NotificationCenter.storiesUpdated || i10 == NotificationCenter.storiesReadUpdated) {
            ly0 ly0Var4 = this.f35922a0;
            if (ly0Var4 != null) {
                ly0Var4.setHasStories(j4());
                this.f35922a0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(c4(), 0.0f, this.f35968g2));
            }
            oy0 oy0Var4 = this.f36034q0;
            if (oy0Var4 != null) {
                TLRPC.UserFull userFull3 = this.f36043r2;
                if (userFull3 != null) {
                    oy0Var4.setStories(userFull3.stories);
                    return;
                }
                TLRPC.ChatFull chatFull9 = this.f36036q2;
                if (chatFull9 != null) {
                    oy0Var4.setStories(chatFull9.stories);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            org.telegram.ui.ActionBar.v0 v0Var4 = this.P0;
            if (v0Var4 != null) {
                v0Var4.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.f35923a1)));
            }
            W4();
            return;
        }
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            W4();
            return;
        }
        if (i10 == NotificationCenter.starBalanceUpdated) {
            e5(false, false);
            return;
        }
        if (i10 == NotificationCenter.botStarsUpdated) {
            e5(false, false);
            return;
        }
        if (i10 == NotificationCenter.botStarsTransactionsLoaded) {
            e5(false, false);
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted) {
            if (a() == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
                if (b5Var == null || b5Var.getLastFragment() != this) {
                    removeSelfFromStack();
                    return;
                } else {
                    finishFragment();
                    return;
                }
            }
            return;
        }
        if (i10 == NotificationCenter.channelRecommendationsLoaded) {
            long jLongValue3 = ((Long) objArr[0]).longValue();
            if (this.F4 >= 0 || jLongValue3 != a()) {
                return;
            }
            j5();
            R();
            vz0 vz0Var3 = this.d;
            if (vz0Var3 != null) {
                vz0Var3.l();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starUserGiftsLoaded) {
            if (((Long) objArr[0]).longValue() != a() || h4()) {
                return;
            }
            if (this.F4 >= 0) {
                hz0 hz0Var5 = this.K;
                if (hz0Var5 != null) {
                    hz0Var5.v1(true);
                    return;
                }
                return;
            }
            j5();
            R();
            vz0 vz0Var4 = this.d;
            if (vz0Var4 != null) {
                vz0Var4.l();
            }
            AndroidUtilities.runOnUIThread(new gb0(this, 17));
            return;
        }
        if (i10 == NotificationCenter.profileMusicUpdated) {
            if (((Long) objArr[0]).longValue() != a() || this.f35923a1 <= 0) {
                return;
            }
            TLRPC.UserFull userFull4 = getMessagesController().getUserFull(this.f35923a1);
            if (userFull4 != null) {
                this.f36043r2 = userFull4;
            }
            j5();
            R();
            by0 by0Var4 = this.f35921a;
            if (by0Var4 != null && by0Var4.b0()) {
                this.f35921a.post(new gb0(this, 19));
                return;
            }
            vz0 vz0Var5 = this.d;
            if (vz0Var5 != null) {
                vz0Var5.l();
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.updatedChatRanks) {
            return;
        }
        long jLongValue4 = ((Long) objArr[0]).longValue();
        long jLongValue5 = ((Long) objArr[1]).longValue();
        TLRPC.Chat chat5 = this.A2;
        if (chat5 == null || chat5.f22380id != jLongValue4) {
            return;
        }
        String str = (String) objArr[2];
        a0.h hVar = this.f36088y1;
        if (hVar != null && (chatParticipant = (TLRPC.ChatParticipant) hVar.f(jLongValue5)) != null) {
            chatParticipant.setRank(jLongValue5, str);
        }
        TLRPC.ChannelParticipant channelParticipant = this.C2;
        if (channelParticipant != null && channelParticipant.user_id == jLongValue5) {
            channelParticipant.rank = str;
        }
        while (true) {
            ArrayList arrayList2 = this.M4;
            if (i12 >= arrayList2.size()) {
                AndroidUtilities.updateVisibleRows(this.f35921a);
                return;
            } else {
                ((TLRPC.ChatParticipant) arrayList2.get(i12)).setRank(jLongValue5, str);
                i12++;
            }
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.j40 j40Var = this.m0;
        if (j40Var == null || !j40Var.g(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.j40 j40Var = this.m0;
        return (j40Var == null || dialog != j40Var.f29571c) && super.dismissDialogOnPause(dialog);
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    public final boolean e4() {
        TLRPC.UserFull userFull;
        TL_bots.BotInfo botInfo;
        int i10 = 0;
        if (!this.f36016n2 || (userFull = this.f36043r2) == null || (botInfo = userFull.bot_info) == null) {
            return false;
        }
        if (botInfo.privacy_policy_url != null) {
            return true;
        }
        ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
        int size = arrayList.size();
        while (i10 < size) {
            TLRPC.BotCommand botCommand = arrayList.get(i10);
            i10++;
            if ("privacy".equals(botCommand.command)) {
                return true;
            }
        }
        return true;
    }

    public final void e5(boolean z10, boolean z11) {
        if (this.d == null) {
            if (z10) {
                h5(false);
            }
            j5();
            return;
        }
        if (!z11 && this.f35921a.isInLayout()) {
            by0 by0Var = this.f35921a;
            if (by0Var.C) {
                by0Var.post(new org.telegram.ui.Components.f50(13, this, z10));
                return;
            }
            return;
        }
        jz0 jz0Var = new jz0(this);
        jz0Var.f39544b = this.J2;
        jz0Var.f(jz0Var.f39545c);
        jz0Var.f39546e.clear();
        jz0Var.f39547f.clear();
        jz0Var.f39546e.addAll(this.M4);
        jz0Var.f39547f.addAll(this.N4);
        jz0Var.f39548g = this.f36038q4;
        jz0Var.h = this.f36045r4;
        if (z10) {
            h5(false);
        }
        F4();
        j5();
        jz0Var.f(jz0Var.d);
        try {
            f2.q.c(jz0Var, true).b(this.d);
        } catch (Exception e9) {
            FileLog.e(e9);
            this.d.l();
        }
        int i10 = this.Q5;
        if (i10 >= 0) {
            this.f35935c.h1(i10, this.R5 - this.f35921a.getPaddingTop());
        }
        AndroidUtilities.updateVisibleRows(this.f35921a);
    }

    @Override
    public final org.telegram.ui.Components.zk0 f() {
        return this.f35921a;
    }

    public final void f4() {
        Point point = new Point();
        getParentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        this.f35989j2 = point.x > point.y;
    }

    public final void f5() {
        if (this.Y == null || this.f36040r[1] == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        boolean z10 = this.C1;
        if (z10 && this.F1 == 2 && this.U != null) {
            this.Y.setAlpha(this.O1);
            org.telegram.ui.Components.jh0 jh0Var = this.Y;
            float fDp = AndroidUtilities.dp(74.0f) + this.f35921a.getMeasuredWidth();
            jh0Var.H = O3() - AndroidUtilities.dp(74.0f);
            jh0Var.setTranslationY(fDp - AndroidUtilities.dp(12.0f));
            jh0Var.invalidate();
            return;
        }
        if (z10) {
            this.Y.setAlpha(this.O1);
        }
        float f10 = currentActionBarHeight;
        float fDp2 = this.M1 + f10 + AndroidUtilities.dp(74.0f);
        float fMin = Math.min(O3(), fDp2 - f10);
        org.telegram.ui.Components.jh0 jh0Var2 = this.Y;
        jh0Var2.H = fMin - AndroidUtilities.dp(74.0f);
        jh0Var2.setTranslationY((fDp2 - fMin) - AndroidUtilities.dp(12.0f));
        jh0Var2.invalidate();
    }

    @Override
    public final TLRPC.Chat g() {
        return this.A2;
    }

    public final boolean g4() {
        return this.A2 != null ? getMessagesController().isChatNoForwards(this.A2) : getMessagesController().isUserNoForwards(this.f36043r2);
    }

    public final void g5(boolean z10) {
        int i10;
        vz0 vz0Var;
        if (z10 && (i10 = this.J3) >= 0 && (vz0Var = this.d) != null) {
            vz0Var.m(i10);
        }
        org.telegram.ui.Components.rg0 rg0Var = this.W;
        if (rg0Var == null || this.f36022o1) {
            return;
        }
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
        long j10 = this.f35952e1;
        if (j10 == 0) {
            j10 = this.f35923a1;
            if (j10 == 0) {
                j10 = -this.f35929b1;
            }
        }
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, this.f35937c1);
        boolean zContains = notificationsSettings.contains("notify2_" + sharedPrefKey);
        boolean zIsGlobalNotificationsEnabled = false;
        int iC = org.telegram.messenger.y1.c("notify2_", sharedPrefKey, notificationsSettings, 0);
        int iC2 = org.telegram.messenger.y1.c("notifyuntil_", sharedPrefKey, notificationsSettings, 0);
        if (iC != 3 || iC2 == Integer.MAX_VALUE) {
            if (iC == 0) {
                if (zContains) {
                    zIsGlobalNotificationsEnabled = true;
                } else {
                    zIsGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(j10, false, false);
                }
            } else if (iC == 1) {
                zIsGlobalNotificationsEnabled = true;
            }
        } else if (iC2 - getConnectionsManager().getCurrentTime() <= 0) {
            zIsGlobalNotificationsEnabled = true;
        }
        rg0Var.setNotifications(zIsGlobalNotificationsEnabled);
    }

    public float getAvatarAnimationProgress() {
        return this.O1;
    }

    @Override
    public final cu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.f36067v0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.f36067v0 != null) {
            return null;
        }
        sx0 sx0Var = new sx0(0, this);
        ArrayList arrayList = new ArrayList();
        hz0 hz0Var = this.K;
        if (hz0Var != null) {
            arrayList.addAll(hz0Var.getThemeDescriptions());
        }
        by0 by0Var = this.f35921a;
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(by0Var, 0, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35927b, 0, null, null, null, null, i10));
        by0 by0Var2 = this.f35921a;
        int i11 = org.telegram.ui.ActionBar.g6.f22999a7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(by0Var2, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.f23092f8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.f23272pc));
        int i12 = org.telegram.ui.ActionBar.g6.f23127h8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.vh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.Bh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, i12));
        org.telegram.ui.Components.on0 on0Var = this.f36048s;
        if (on0Var != null) {
            TextView textView = on0Var.getTextView();
            int i13 = org.telegram.ui.ActionBar.g6.Pi;
            arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, sx0Var, i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36048s.getNextTextView(), 4, null, null, null, sx0Var, i13));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Z0, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        ly0 ly0Var = this.f35922a0;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.g6.f23295r0;
        int i14 = org.telegram.ui.ActionBar.g6.J7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ly0Var, 0, null, null, drawableArr, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35922a0, 0, null, null, new Drawable[]{this.f36001l0}, null, org.telegram.ui.ActionBar.g6.f23055d8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 8, null, null, null, null, org.telegram.ui.ActionBar.g6.wh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.xh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.yh));
        int i15 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23406x6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23269p7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23251o6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23357u6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        int i16 = org.telegram.ui.ActionBar.g6.f23215m6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23373v6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, null, null, -1, null, i15));
        int i17 = org.telegram.ui.ActionBar.g6.f23441z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"valueTextView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.g6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 0, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 0, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"detailTextView"}, null, null, -1, null, i17));
        int i19 = org.telegram.ui.ActionBar.g6.J6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 2, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"detailTextView"}, null, null, -1, null, i19));
        int i20 = org.telegram.ui.ActionBar.g6.Sh;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 0, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"yesButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.g6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 131072, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"yesButton"}, null, null, -1, null, i21));
        int i22 = org.telegram.ui.ActionBar.g6.Qh;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 196608, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"yesButton"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 0, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"noButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 131072, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"noButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 196608, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"noButton"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 0, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 0, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"valueTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 0, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 0, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 4, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.uh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusColor"}, null, null, -1, sx0Var, org.telegram.ui.ActionBar.g6.f23423y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusOnlineColor"}, null, null, -1, sx0Var, org.telegram.ui.ActionBar.g6.f23234n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, null, drawableArr, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.Fi));
        int i23 = org.telegram.ui.ActionBar.g6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i23));
        int i24 = org.telegram.ui.ActionBar.g6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 4, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.g6.P1, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 2, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.g6.P1, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35921a, 0, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.g6.m0, null, null, org.telegram.ui.ActionBar.g6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35927b, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35927b, 0, new Class[]{org.telegram.ui.Cells.s3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23091f7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35927b, 16, new Class[]{org.telegram.ui.Cells.s3.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23073e7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35927b, 0, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35927b, 0, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"valueTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35927b, 0, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        boolean z10 = this.B5;
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f35958f;
        if (z10) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(h5VarArr[1], 0, null, null, this.E, null, org.telegram.ui.ActionBar.g6.Oi));
            arrayList.add(new org.telegram.ui.ActionBar.i6(h5VarArr[1], 0, null, null, this.f36086y, null, i10));
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(h5VarArr[1], 0, null, null, this.E, null, org.telegram.ui.ActionBar.g6.Ah));
        arrayList.add(new org.telegram.ui.ActionBar.i6(h5VarArr[1], 0, null, null, this.f36086y, null, org.telegram.ui.ActionBar.g6.zh));
        return arrayList;
    }

    @Override
    public final int getThemedColor(int i10) {
        return org.telegram.ui.ActionBar.g6.v0(i10, this.f36067v0);
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        org.telegram.ui.ActionBar.c6 c6Var = this.f36067v0;
        Drawable drawable = c6Var != null ? c6Var.getDrawable(str) : null;
        return drawable != null ? drawable : super.getThemedDrawable(str);
    }

    @Override
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z10, boolean z11, View view) {
        boolean z12;
        boolean zCanAddAdmins;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        String str;
        boolean z18;
        TLRPC.ChannelParticipant channelParticipant;
        boolean z19;
        boolean z20;
        int i10;
        if (getParentActivity() != null) {
            if (z10) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                if (user != null) {
                    long j10 = chatParticipant.user_id;
                    this.f36075w2 = j10;
                    boolean z21 = j10 == getUserConfig().getClientUserId();
                    if (ChatObject.isChannel(this.A2)) {
                        channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        String str2 = channelParticipant.rank;
                        boolean z22 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                        boolean z23 = z22 || (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin);
                        getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                        zCanAddAdmins = ChatObject.canAddAdmins(this.A2);
                        boolean z24 = ChatObject.canManageTags(this.A2) && (!z23 || ((!z22 && channelParticipant.can_edit) || z21));
                        if (z22 || ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant.can_edit)) {
                            zCanAddAdmins = false;
                            z24 = false;
                        }
                        if ((z21 || (channelParticipant instanceof TLRPC.TL_channelParticipantSelf)) && ChatObject.canManageMyTag(this.A2)) {
                            z24 = true;
                        }
                        z12 = ChatObject.canBlockUsers(this.A2) && (!((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || z22) || channelParticipant.can_edit);
                        z14 = this.A2.gigagroup ? false : z12;
                        z15 = z22;
                        z16 = channelParticipant instanceof TLRPC.TL_channelParticipantAdmin;
                        z17 = z23;
                        z13 = z21;
                        str = str2;
                        z18 = z24;
                    } else {
                        String str3 = chatParticipant.rank;
                        boolean z25 = chatParticipant instanceof TLRPC.TL_chatParticipantAdmin;
                        boolean z26 = z25 || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator);
                        boolean z27 = chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                        TLRPC.Chat chat = this.A2;
                        z12 = chat.creator || ((chatParticipant instanceof TLRPC.TL_chatParticipant) && (ChatObject.canBlockUsers(chat) || chatParticipant.inviter_id == getUserConfig().getClientUserId()));
                        TLRPC.Chat chat2 = this.A2;
                        zCanAddAdmins = chat2.creator;
                        if (ChatObject.canManageTags(chat2)) {
                            z13 = z21;
                            boolean z28 = !z26 || (!z27 && chatParticipant.inviter_id == getUserConfig().getClientUserId()) || z13;
                            z14 = this.A2.creator;
                            z15 = z27;
                            z16 = z25;
                            z17 = z26;
                            str = str3;
                            z18 = z28;
                            channelParticipant = null;
                        } else {
                            z13 = z21;
                        }
                        if (!z13 || !ChatObject.canManageMyTag(this.A2)) {
                        }
                        z14 = this.A2.creator;
                        z15 = z27;
                        z16 = z25;
                        z17 = z26;
                        str = str3;
                        z18 = z28;
                        channelParticipant = null;
                    }
                    if (z13) {
                        z19 = (ChatObject.canManageMyTag(this.A2) || (z17 && ChatObject.canManageTags(this.A2))) ? true : z18;
                        zCanAddAdmins = false;
                        z14 = false;
                        z20 = false;
                    } else {
                        z19 = z18;
                        z20 = z12;
                    }
                    boolean z29 = zCanAddAdmins || z19 || z14 || z20;
                    if (z11 || !z29) {
                        return z29;
                    }
                    TLRPC.ChannelParticipant channelParticipant2 = channelParticipant;
                    org.telegram.messenger.hk hkVar = new org.telegram.messenger.hk(this, channelParticipant2, user, chatParticipant, z16, str);
                    String str4 = str;
                    boolean z30 = z16;
                    Drawable drawableV0 = view.getParent() instanceof org.telegram.ui.Components.zk0 ? ((org.telegram.ui.Components.zk0) view.getParent()).V0(view, false) : null;
                    org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(this, view);
                    b70VarH.W(drawableV0);
                    b70VarH.f26995w = false;
                    b70VarH.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new dx0(this, user, 0), !z13);
                    if (!z13 && (zCanAddAdmins || z19 || z14 || z20)) {
                        b70VarH.k();
                    }
                    int i11 = (z17 || !TextUtils.isEmpty(str4)) ? R.drawable.menu_tag_edit : R.drawable.menu_tag_plus;
                    if (z17) {
                        i10 = R.string.EditAdminTag;
                    } else {
                        i10 = TextUtils.isEmpty(str4) ? R.string.AddMemberTag : R.string.EditMemberTag;
                    }
                    b70VarH.l(i11, LocaleController.getString(i10), new jh.q5(this, user, str4, z17, z15), z19);
                    b70VarH.l(R.drawable.msg_admins, LocaleController.getString(z30 ? R.string.EditAdminRights : R.string.SetAsAdmin), new zk0(hkVar, 25), zCanAddAdmins);
                    b70VarH.l(R.drawable.msg_permissions, LocaleController.getString(R.string.ChangePermissions), new org.telegram.ui.Components.l20(this, channelParticipant2, chatParticipant, user, hkVar, 26), z14);
                    b70VarH.m(z20, R.drawable.msg_remove, LocaleController.getString(R.string.KickFromGroup), true, new zs0(12, this, chatParticipant));
                    b70VarH.S = 190;
                    b70VarH.Z();
                    return true;
                }
            } else if (chatParticipant.user_id != getUserConfig().getClientUserId()) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", chatParticipant.user_id);
                bundle.putBoolean("preload_messages", true);
                presentFragment(new ProfileActivity(bundle, null));
                return true;
            }
        }
        return false;
    }

    public final boolean h4() {
        return (this.m0 == null || this.f36022o1) ? false : true;
    }

    public final void h5(boolean z10) {
        int i10;
        TLRPC.UserStatus userStatus;
        boolean z11;
        int iF = 0;
        this.f36082x2 = 0;
        int currentTime = getConnectionsManager().getCurrentTime();
        this.f36089y2.clear();
        TLRPC.ChatFull chatFull = this.f36036q2;
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z11 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (!z11 || chatFull.participants_count <= 200) {
                return;
            }
            this.f36082x2 = chatFull.online_count;
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (iF < this.f36036q2.participants.participants.size()) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f36036q2.participants.participants.get(iF).user_id));
            if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.f22527id == getUserConfig().getClientUserId()) && user.status.expires > 10000)) {
                this.f36082x2++;
            }
            this.f36089y2.add(Integer.valueOf(iF));
            if (user == null) {
                i10 = Integer.MIN_VALUE;
            } else if (user.bot) {
                i10 = -110;
            } else if (user.self) {
                i10 = 50000 + currentTime;
            } else {
                TLRPC.UserStatus userStatus2 = user.status;
                if (userStatus2 != null) {
                    i10 = userStatus2.expires;
                } else {
                    i10 = Integer.MIN_VALUE;
                }
            }
            iF = i0.a.f(i10, iF, 1, arrayList);
        }
        try {
            Collections.sort(this.f36089y2, Comparator$EL.reversed(Comparator$CC.comparingInt(new xe(arrayList, 1))));
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        if (z10 && this.d != null && this.f36038q4 > 0) {
            AndroidUtilities.updateVisibleRows(this.f35921a);
        }
        if (this.K == null || this.F4 == -1) {
            return;
        }
        if ((this.f36089y2.size() > 5 || this.O4 == 2) && this.O4 != 1) {
            this.K.a1(this.f36089y2, this.f36036q2);
        }
    }

    public final void i4(boolean z10) {
        boolean zIsForum = ChatObject.isForum(this.A2);
        TLRPC.Chat chat = this.A2;
        org.telegram.ui.Components.y4.s(this, false, chat, null, false, zIsForum || z10 || (chat != null && chat.creator), z10, !zIsForum, new gx0(this, 1));
    }

    public final void i5(boolean z10) {
        org.telegram.ui.ActionBar.h5[] h5VarArr;
        String string;
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z11;
        String str;
        org.telegram.ui.ActionBar.n2 n2Var2;
        org.telegram.ui.ActionBar.h5[] h5VarArr2;
        CharSequence pluralString;
        TLRPC.ChatParticipants chatParticipants;
        CharSequence pluralStringComma;
        boolean z12;
        int i10;
        boolean z13;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation;
        ImageLocation forUserOrChat;
        ImageLocation forUserOrChat2;
        my0 my0Var;
        ImageLocation imageLocationC;
        View viewM;
        String str2;
        TLRPC.Chat chat;
        boolean z14;
        boolean z15;
        ImageLocation imageLocation;
        org.telegram.ui.ActionBar.h5 h5Var;
        CharSequence charSequence;
        CharSequence charSequenceReplaceEmoji;
        CharSequence charSequenceReplaceEmoji2;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        String str3;
        boolean z20;
        CharSequence charSequenceV3;
        TLRPC.Chat chat2;
        CharSequence charSequenceV4;
        TLRPC.ChatFull chatFull;
        String shortNumber;
        boolean z21;
        TLRPC.EmojiStatus emojiStatus;
        rn rnVar;
        String str4;
        String lowerCase;
        int i11;
        int i12;
        int i13;
        int i14;
        String string2;
        String lowerCase2;
        org.telegram.ui.Components.w51 w51Var;
        TLRPC.VideoSize vectorMarkupVideoSize;
        ImageLocation imageLocation2;
        TLRPC.User user;
        ImageLocation imageLocation3;
        TLRPC.User user2;
        boolean z22;
        TLRPC.UserStatus userStatus;
        TLRPC.UserProfilePhoto userProfilePhoto;
        boolean z23;
        int i15;
        TLRPC.FileLocation fileLocation2;
        TLRPC.UserProfilePhoto userProfilePhoto2;
        int i16;
        char c10;
        org.telegram.ui.Components.ng ngVar;
        boolean z24;
        boolean z25;
        TLRPC.UserFull userFull;
        TL_stars.Tl_starsRating tl_starsRating;
        String str5;
        h01 h01VarB4;
        fx0 fx0Var;
        Drawable drawableV3;
        boolean z26;
        String str6;
        boolean z27;
        boolean z28;
        boolean z29;
        TLRPC.FileLocation fileLocation3;
        Drawable drawableQ3;
        TL_stars.Tl_starsRating tl_starsRating2;
        ImageLocation imageLocation4;
        bx bxVar;
        if (this.U == null || (h5VarArr = this.f35958f) == null || getParentActivity() == null) {
            return;
        }
        int connectionState = getConnectionsManager().getConnectionState();
        if (connectionState == 2) {
            string = LocaleController.getString(R.string.WaitingForNetwork);
        } else if (connectionState == 1) {
            string = LocaleController.getString(R.string.Connecting);
        } else if (connectionState == 5) {
            string = LocaleController.getString(R.string.Updating);
        } else {
            string = connectionState == 4 ? LocaleController.getString(R.string.ConnectingToProxy) : null;
        }
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var == null || b5Var.getFragmentStack().size() < 2) {
            n2Var = null;
        } else {
            org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            n2Var = n2Var3 instanceof org.telegram.ui.Components.ng ? n2Var3 : null;
            if ((n2Var3 instanceof gy) && (bxVar = ((gy) n2Var3).B3) != null) {
                ix ixVar = bxVar.f38296a;
                if (com.google.android.recaptcha.internal.a.u(ixVar)) {
                    n2Var = ixVar;
                }
            }
        }
        if (n2Var instanceof rn) {
            rn rnVar2 = (rn) n2Var;
            if (rnVar2.W0 == null || rnVar2.u8() != 8) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z11 = false;
        }
        this.f36005l5 = false;
        this.f36011m5 = false;
        long j10 = this.f35923a1;
        String str7 = "drawableMuteIcon";
        String string3 = "";
        org.telegram.ui.ActionBar.h5[] h5VarArr3 = this.f36040r;
        if (j10 != 0) {
            TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(this.f35923a1));
            if (user3 == null) {
                return;
            }
            TLRPC.UserProfilePhoto userProfilePhoto3 = user3.photo;
            boolean z30 = userProfilePhoto3 != null && userProfilePhoto3.personal;
            TLRPC.FileLocation fileLocation4 = userProfilePhoto3 != null ? userProfilePhoto3.photo_big : null;
            this.f36001l0.m(this.currentAccount, user3);
            MessagesController.PeerColor peerColor = this.M5;
            MessagesController.PeerColor peerColorFromCollectible = MessagesController.PeerColor.fromCollectible(user3.emoji_status);
            this.M5 = peerColorFromCollectible;
            if (peerColorFromCollectible == null) {
                int profileColorId = UserObject.getProfileColorId(user3);
                MessagesController.PeerColors peerColors = MessagesController.getInstance(this.currentAccount).profilePeerColors;
                this.M5 = peerColors == null ? null : peerColors.getColor(profileColorId);
            }
            if (peerColor != this.M5) {
                o5();
            }
            j01 j01Var = this.Z0;
            boolean z31 = z30;
            if (j01Var != null) {
                j01Var.b(UserObject.getProfileEmojiId(user3), user3.emoji_status instanceof TLRPC.TL_emojiStatusCollectible);
            }
            org.telegram.ui.Components.sv0 sv0Var = this.P;
            if (sv0Var != null) {
                sv0Var.b(this.M5);
            }
            TLRPC.EmojiStatus emojiStatus2 = user3.emoji_status;
            L4(emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus2 : null);
            ImageLocation forUserOrChat3 = ImageLocation.getForUserOrChat(user3, 0);
            ImageLocation forUserOrChat4 = ImageLocation.getForUserOrChat(user3, 1);
            ImageLocation forUserOrChat5 = ImageLocation.getForUserOrChat(user3, 4);
            TLRPC.UserFull userFull2 = this.f36043r2;
            if (userFull2 != null) {
                TLRPC.UserProfilePhoto userProfilePhoto4 = user3.photo;
                vectorMarkupVideoSize = FileLoader.getVectorMarkupVideoSize((userProfilePhoto4 == null || !userProfilePhoto4.personal) ? userFull2.profile_photo : userFull2.personal_photo);
                w51Var = vectorMarkupVideoSize != null ? new org.telegram.ui.Components.w51(vectorMarkupVideoSize, user3.premium, 2) : null;
            } else {
                w51Var = null;
                vectorMarkupVideoSize = null;
            }
            ImageLocation imageLocationC2 = this.f35987j0.C(forUserOrChat4, forUserOrChat3);
            if (this.E2 == null) {
                this.f35987j0.H(w51Var, forUserOrChat3, forUserOrChat4, z10);
            }
            if (this.F2 != null) {
                imageLocation2 = forUserOrChat3;
                user = user3;
                imageLocation3 = forUserOrChat4;
            } else if (vectorMarkupVideoSize != null) {
                this.f35922a0.setImageDrawable(w51Var);
                imageLocation2 = forUserOrChat3;
                user = user3;
                imageLocation3 = forUserOrChat4;
            } else if (forUserOrChat5 == null || user3.photo.personal) {
                user = user3;
                imageLocation3 = forUserOrChat4;
                ly0 ly0Var = this.f35922a0;
                ly0Var.f30898a.setImage(imageLocationC2, "g", forUserOrChat3, "100_100", imageLocation3, "50_50", this.f36001l0, 0L, null, user, 1);
                imageLocation2 = forUserOrChat3;
                ly0Var.d();
            } else {
                this.f35922a0.getImageReceiver().setVideoThumbIsSame(true);
                ly0 ly0Var2 = this.f35922a0;
                user = user3;
                imageLocation3 = forUserOrChat4;
                ly0Var2.f30898a.setImage(forUserOrChat5, "avatar", forUserOrChat3, "50_50", imageLocation3, "50_50", this.f36001l0, 0L, null, user, 1);
                ly0Var2.d();
                imageLocation2 = forUserOrChat3;
            }
            if ((imageLocation3 != null && this.K2 != -1) || (imageLocation3 == null && this.K2 == -1)) {
                d5();
                k4(true);
            }
            if (imageLocation2 == null || ((imageLocation4 = this.f36080x0) != null && imageLocation2.photoId == imageLocation4.photoId)) {
                user2 = user;
            } else {
                this.f36080x0 = imageLocation2;
                TLRPC.User user4 = user;
                getFileLoader().loadFile(imageLocation2, user4, null, 0, 1);
                user2 = user4;
            }
            CharSequence userName = UserObject.getUserName(user2);
            try {
                if (user2.f22527id != getUserConfig().getClientUserId()) {
                    long j11 = user2.f22527id;
                    if (j11 == 489000) {
                        string3 = LocaleController.getString(R.string.VerifyCodesNotifications);
                    } else if (j11 == 333000 || j11 == 777000 || j11 == 42777) {
                        string3 = LocaleController.getString(R.string.ServiceNotifications);
                    } else if (MessagesController.isSupportUser(user2)) {
                        string3 = LocaleController.getString(R.string.SupportStatus);
                    } else {
                        if (this.f36016n2) {
                            int i17 = user2.bot_active_users;
                            string3 = i17 != 0 ? LocaleController.formatPluralStringComma("BotUsers", i17, ',') : LocaleController.getString(R.string.Bot);
                        } else {
                            boolean[] zArr = this.F0;
                            zArr[0] = false;
                            string3 = LocaleController.formatUserStatus(this.currentAccount, user2, zArr, z31 ? new boolean[1] : null);
                            boolean z32 = (zArr[0] || getUserConfig().isPremium() || (userStatus = user2.status) == null || (!(userStatus instanceof TLRPC.TL_userStatusRecently) && !(userStatus instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus instanceof TLRPC.TL_userStatusLastWeek)) || !userStatus.by_me) ? false : true;
                            org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr3[1];
                            if (h5Var2 != null && !this.B5) {
                                int i18 = (zArr[0] && this.M5 == null) ? org.telegram.ui.ActionBar.g6.Bh : org.telegram.ui.ActionBar.g6.B8;
                                h5Var2.setTag(Integer.valueOf(i18));
                                if (!this.f36002l2) {
                                    h5VarArr3[1].setTextColor(w3(getThemedColor(i18), Boolean.valueOf(zArr[0])));
                                }
                            }
                            z22 = z32;
                        }
                        userProfilePhoto = user2.photo;
                        if (userProfilePhoto == null && userProfilePhoto.personal) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                        this.f36011m5 = z23;
                        userName = Emoji.replaceEmoji(userName, h5VarArr[1].getPaint().getFontMetricsInt(), false);
                        if (z11) {
                            this.f35922a0.setAnimateFromImageReceiver(((rn) n2Var).W0.getAvatarImageView().getImageReceiver());
                        }
                        i15 = 0;
                        while (i15 < 2) {
                            if (h5VarArr[i15] == 0) {
                                fileLocation3 = fileLocation4;
                                str6 = str7;
                            } else {
                                if (i15 != 0 && z11) {
                                    org.telegram.ui.ActionBar.h5 titleTextView = ((rn) n2Var).W0.getTitleTextView();
                                    h5VarArr[i15].k(titleTextView.getText());
                                    h5VarArr[i15].i(titleTextView.getRightDrawable());
                                    h5VarArr[i15].j(titleTextView.getRightDrawable2());
                                } else if (i15 == 0 || user2.f22527id == getUserConfig().getClientUserId() || MessagesController.isSupportUser(user2) || (str5 = user2.phone) == null || str5.length() == 0 || getContactsController().contactsDict.get(Long.valueOf(user2.f22527id)) != null || (getContactsController().contactsDict.size() == 0 && getContactsController().isLoadingContacts())) {
                                    h5VarArr[i15].k(userName);
                                } else {
                                    h5VarArr[i15].k(oe.b.c().b("+" + user2.phone));
                                }
                                if (i15 != 0 && string != null) {
                                    h5VarArr3[i15].k(string);
                                } else if (i15 == 0 || !z11) {
                                    h5VarArr3[i15].k(string3);
                                } else {
                                    rn rnVar3 = (rn) n2Var;
                                    if (rnVar3.W0.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.h5) {
                                        h5VarArr3[i15].k(((org.telegram.ui.ActionBar.h5) rnVar3.W0.getSubtitleTextView()).getText());
                                    } else if (rnVar3.W0.getSubtitleTextView() instanceof org.telegram.ui.Components.j6) {
                                        h5VarArr3[i15].k(((org.telegram.ui.Components.j6) rnVar3.W0.getSubtitleTextView()).getText());
                                    }
                                }
                                h5VarArr3[i15].setDrawablePadding(AndroidUtilities.dp(9.0f));
                                h5VarArr3[i15].setRightDrawableInside(true);
                                org.telegram.ui.ActionBar.h5 h5Var3 = h5VarArr3[i15];
                                if (i15 == 1 || !z22) {
                                    h01VarB4 = null;
                                } else {
                                    h01VarB4 = b4();
                                }
                                h5Var3.i(h01VarB4);
                                org.telegram.ui.ActionBar.h5 h5Var4 = h5VarArr3[i15];
                                if (i15 == 1 || !z22) {
                                    fx0Var = null;
                                } else {
                                    fx0Var = new fx0(this, 7);
                                }
                                h5Var4.setRightDrawableOnClick(fx0Var);
                                if (this.f36095z2 != null) {
                                    drawableV3 = V3();
                                } else {
                                    drawableV3 = null;
                                }
                                org.telegram.ui.ActionBar.h5 h5Var5 = h5VarArr[i15];
                                if (i15 == 0) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                h5Var5.setRightDrawableOutside(z26);
                                if (i15 == 0 || z11) {
                                    str6 = str7;
                                    if (i15 == 1) {
                                        z27 = user2.scam;
                                        if (!z27 || user2.fake) {
                                            h5VarArr[i15].j(a4(!z27 ? 1 : 0));
                                        } else if (user2.verified) {
                                            h5VarArr[i15].j(d4(i15));
                                        } else {
                                            h5VarArr[i15].j(null);
                                        }
                                        if (MessagesController.isSupportUser(user2) && DialogObject.getEmojiStatusDocumentId(user2.emoji_status) != 0) {
                                            z28 = true;
                                            h5VarArr[i15].i(S3(user2.emoji_status, true, i15));
                                            z29 = false;
                                        } else if (getMessagesController().isPremiumUser(user2)) {
                                            h5VarArr[i15].i(S3(null, true, i15));
                                            z29 = true;
                                            z28 = false;
                                        } else {
                                            h5VarArr[i15].i(null);
                                        }
                                    }
                                    z29 = false;
                                    z28 = false;
                                } else {
                                    boolean z33 = user2.scam;
                                    if (z33 || user2.fake) {
                                        str6 = str7;
                                        h5VarArr[i15].j(a4(!z33 ? 1 : 0));
                                        this.f36013n = LocaleController.getString(R.string.ScamMessage);
                                    } else if (user2.verified) {
                                        h5VarArr[i15].j(d4(i15));
                                        this.f36013n = LocaleController.getString(R.string.AccDescrVerified);
                                        str6 = str7;
                                    } else {
                                        MessagesController messagesController = getMessagesController();
                                        long j12 = this.f35952e1;
                                        if (j12 == 0) {
                                            j12 = this.f35923a1;
                                        }
                                        String str8 = str7;
                                        if (messagesController.isDialogMuted(j12, this.f35937c1)) {
                                            str6 = str8;
                                            h5VarArr[i15].j(getThemedDrawable(str6));
                                            this.f36013n = LocaleController.getString(R.string.NotificationsMuted);
                                        } else {
                                            str6 = str8;
                                            h5VarArr[i15].j(null);
                                            this.f36013n = null;
                                        }
                                    }
                                    if (!MessagesController.isSupportUser(user2) && DialogObject.getEmojiStatusDocumentId(user2.emoji_status) != 0) {
                                        h5VarArr[i15].i(S3(user2.emoji_status, false, i15));
                                        this.h = LocaleController.getString(R.string.AccDescrPremium);
                                        z29 = false;
                                        z28 = true;
                                    } else if (getMessagesController().isPremiumUser(user2)) {
                                        h5VarArr[i15].i(S3(null, false, i15));
                                        this.h = LocaleController.getString(R.string.AccDescrPremium);
                                        z29 = true;
                                        z28 = false;
                                    } else {
                                        h5VarArr[i15].i(null);
                                        this.h = null;
                                        z29 = false;
                                        z28 = false;
                                    }
                                }
                                if (drawableV3 == null || this.f36095z2 != null) {
                                    fileLocation3 = fileLocation4;
                                } else {
                                    fileLocation3 = fileLocation4;
                                    if (user2.bot_verification_icon != 0) {
                                        h5VarArr[i15].setLeftDrawableOutside(true);
                                        drawableQ3 = Q3(i15, user2.bot_verification_icon);
                                    }
                                    h5VarArr[i15].setLeftDrawable(drawableQ3);
                                    if (i15 == 1 && (z28 || z29)) {
                                        h5VarArr[i15].setRightDrawableOutside(true);
                                    }
                                    if (!user2.self && getMessagesController().isPremiumUser(user2)) {
                                        h5VarArr[i15].setRightDrawableOnClick(new fx0(this, 8));
                                    }
                                    if (user2.self && getMessagesController().isPremiumUser(user2)) {
                                        org.telegram.ui.ActionBar.h5 h5Var6 = h5VarArr[i15];
                                        h5Var6.setRightDrawableOnClick(new c0(this, user2, h5Var6, 14));
                                    }
                                }
                                h5VarArr[i15].setLeftDrawableOutside(false);
                                drawableQ3 = drawableV3;
                                h5VarArr[i15].setLeftDrawable(drawableQ3);
                                if (i15 == 1) {
                                    h5VarArr[i15].setRightDrawableOutside(true);
                                }
                                if (!user2.self) {
                                }
                                if (user2.self) {
                                }
                            }
                            i15++;
                            str7 = str6;
                            fileLocation4 = fileLocation3;
                        }
                        fileLocation2 = fileLocation4;
                        if (this.f35923a1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                            h5VarArr3[2].k(LocaleController.getString(R.string.FallbackTooltip));
                            userFull = this.f36043r2;
                            if (userFull != null || (tl_starsRating = userFull.stars_rating) == null || tl_starsRating.stars >= 0) {
                                h5VarArr3[3].k(LocaleController.getString(R.string.Online));
                            } else {
                                h5VarArr3[3].k(LocaleController.getString(R.string.StarRatingLevelNegative).toLowerCase(Locale.ROOT));
                            }
                            i16 = 0;
                        } else {
                            userProfilePhoto2 = user2.photo;
                            if (userProfilePhoto2 == null && userProfilePhoto2.personal && userProfilePhoto2.has_video) {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string3);
                                i16 = 0;
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.zy(i16), 0, string3.length(), 0);
                                spannableStringBuilder.append((CharSequence) " d ");
                                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CustomAvatarTooltipVideo));
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.ps(), string3.length() + 1, string3.length() + 2, 0);
                                h5VarArr3[2].k(spannableStringBuilder);
                            } else {
                                i16 = 0;
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string3);
                                spannableStringBuilder2.setSpan(new org.telegram.ui.Components.zy(i16), 0, string3.length(), 0);
                                spannableStringBuilder2.append((CharSequence) " d ");
                                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.CustomAvatarTooltip));
                                c10 = 2;
                                spannableStringBuilder2.setSpan(new org.telegram.ui.Components.ps(), string3.length() + 1, string3.length() + 2, 0);
                                h5VarArr3[2].k(spannableStringBuilder2);
                            }
                            h5VarArr3[c10].setVisibility(i16);
                            if (!this.S1) {
                                h5VarArr3[3].setVisibility(i16);
                            }
                            ngVar = this.f35941c5;
                            if (ngVar != null) {
                                ngVar.q();
                            }
                            ImageReceiver imageReceiver = this.f35922a0.getImageReceiver();
                            if (!PhotoViewer.O1(fileLocation2) || (getLastStoryViewer() != null && getLastStoryViewer().f13496o0.f13333a == this.f35922a0)) {
                                z24 = false;
                            } else {
                                z24 = true;
                            }
                            if (this.f36034q0 != null) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            imageReceiver.setVisible(z24, z25);
                        }
                        c10 = 2;
                        h5VarArr3[c10].setVisibility(i16);
                        if (!this.S1) {
                            h5VarArr3[3].setVisibility(i16);
                        }
                        ngVar = this.f35941c5;
                        if (ngVar != null) {
                            ngVar.q();
                        }
                        ImageReceiver imageReceiver2 = this.f35922a0.getImageReceiver();
                        if (PhotoViewer.O1(fileLocation2)) {
                            z24 = false;
                        } else {
                            z24 = false;
                        }
                        if (this.f36034q0 != null) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        imageReceiver2.setVisible(z24, z25);
                    }
                } else if (UserObject.hasFallbackPhoto(this.f36043r2)) {
                    this.f36005l5 = true;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.f36043r2.fallback_photo.sizes, 1000);
                    if (closestPhotoSizeWithSize != null) {
                        this.f36019n5.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.f36043r2.fallback_photo), "50_50", (Drawable) null, 0L, (String) null, UserConfig.getInstance(this.currentAccount).getCurrentUser(), 0);
                    }
                } else {
                    TLRPC.UserFull userFull3 = this.f36043r2;
                    string3 = (userFull3 == null || (tl_starsRating2 = userFull3.stars_rating) == null || tl_starsRating2.stars >= 0) ? LocaleController.getString(R.string.Online) : LocaleController.getString(R.string.StarRatingLevelNegative).toLowerCase(Locale.ROOT);
                }
                userName = Emoji.replaceEmoji(userName, h5VarArr[1].getPaint().getFontMetricsInt(), false);
            } catch (Exception unused) {
            }
            z22 = false;
            userProfilePhoto = user2.photo;
            if (userProfilePhoto == null) {
                z23 = false;
            } else {
                z23 = false;
            }
            this.f36011m5 = z23;
            if (z11) {
                this.f35922a0.setAnimateFromImageReceiver(((rn) n2Var).W0.getAvatarImageView().getImageReceiver());
            }
            i15 = 0;
            while (i15 < 2) {
                if (h5VarArr[i15] == 0) {
                    fileLocation3 = fileLocation4;
                    str6 = str7;
                } else {
                    if (i15 != 0) {
                        if (i15 == 0) {
                            h5VarArr[i15].k(userName);
                        } else {
                            h5VarArr[i15].k(userName);
                        }
                    } else if (i15 == 0) {
                        h5VarArr[i15].k(userName);
                    } else {
                        h5VarArr[i15].k(userName);
                    }
                    if (i15 != 0) {
                        if (i15 == 0) {
                            h5VarArr3[i15].k(string3);
                        } else {
                            h5VarArr3[i15].k(string3);
                        }
                    } else if (i15 == 0) {
                        h5VarArr3[i15].k(string3);
                    } else {
                        h5VarArr3[i15].k(string3);
                    }
                    h5VarArr3[i15].setDrawablePadding(AndroidUtilities.dp(9.0f));
                    h5VarArr3[i15].setRightDrawableInside(true);
                    org.telegram.ui.ActionBar.h5 h5Var7 = h5VarArr3[i15];
                    if (i15 == 1) {
                        h01VarB4 = null;
                    } else {
                        h01VarB4 = null;
                    }
                    h5Var7.i(h01VarB4);
                    org.telegram.ui.ActionBar.h5 h5Var8 = h5VarArr3[i15];
                    if (i15 == 1) {
                        fx0Var = null;
                    } else {
                        fx0Var = null;
                    }
                    h5Var8.setRightDrawableOnClick(fx0Var);
                    if (this.f36095z2 != null) {
                        drawableV3 = V3();
                    } else {
                        drawableV3 = null;
                    }
                    org.telegram.ui.ActionBar.h5 h5Var9 = h5VarArr[i15];
                    if (i15 == 0) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    h5Var9.setRightDrawableOutside(z26);
                    if (i15 == 0) {
                        str6 = str7;
                        if (i15 == 1) {
                            z27 = user2.scam;
                            if (z27) {
                                h5VarArr[i15].j(a4(!z27 ? 1 : 0));
                            } else {
                                h5VarArr[i15].j(a4(!z27 ? 1 : 0));
                            }
                            if (MessagesController.isSupportUser(user2)) {
                            }
                            if (getMessagesController().isPremiumUser(user2)) {
                                h5VarArr[i15].i(S3(null, true, i15));
                                z29 = true;
                                z28 = false;
                            } else {
                                h5VarArr[i15].i(null);
                            }
                        }
                        z29 = false;
                        z28 = false;
                    } else {
                        str6 = str7;
                        if (i15 == 1) {
                            z27 = user2.scam;
                            if (z27) {
                                h5VarArr[i15].j(a4(!z27 ? 1 : 0));
                            } else {
                                h5VarArr[i15].j(a4(!z27 ? 1 : 0));
                            }
                            if (MessagesController.isSupportUser(user2)) {
                            }
                            if (getMessagesController().isPremiumUser(user2)) {
                                h5VarArr[i15].i(S3(null, true, i15));
                                z29 = true;
                                z28 = false;
                            } else {
                                h5VarArr[i15].i(null);
                            }
                        }
                        z29 = false;
                        z28 = false;
                    }
                    if (drawableV3 == null) {
                        fileLocation3 = fileLocation4;
                        h5VarArr[i15].setLeftDrawableOutside(false);
                        drawableQ3 = drawableV3;
                    } else {
                        fileLocation3 = fileLocation4;
                        h5VarArr[i15].setLeftDrawableOutside(false);
                        drawableQ3 = drawableV3;
                    }
                    h5VarArr[i15].setLeftDrawable(drawableQ3);
                    if (i15 == 1) {
                        h5VarArr[i15].setRightDrawableOutside(true);
                    }
                    if (!user2.self) {
                    }
                    if (user2.self) {
                    }
                }
                i15++;
                str7 = str6;
                fileLocation4 = fileLocation3;
            }
            fileLocation2 = fileLocation4;
            if (this.f35923a1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                h5VarArr3[2].k(LocaleController.getString(R.string.FallbackTooltip));
                userFull = this.f36043r2;
                if (userFull != null) {
                    h5VarArr3[3].k(LocaleController.getString(R.string.Online));
                } else {
                    h5VarArr3[3].k(LocaleController.getString(R.string.Online));
                }
                i16 = 0;
            } else {
                userProfilePhoto2 = user2.photo;
                if (userProfilePhoto2 == null) {
                }
                i16 = 0;
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(string3);
                spannableStringBuilder3.setSpan(new org.telegram.ui.Components.zy(i16), 0, string3.length(), 0);
                spannableStringBuilder3.append((CharSequence) " d ");
                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.CustomAvatarTooltip));
                c10 = 2;
                spannableStringBuilder3.setSpan(new org.telegram.ui.Components.ps(), string3.length() + 1, string3.length() + 2, 0);
                h5VarArr3[2].k(spannableStringBuilder3);
                h5VarArr3[c10].setVisibility(i16);
                if (!this.S1) {
                    h5VarArr3[3].setVisibility(i16);
                }
                ngVar = this.f35941c5;
                if (ngVar != null) {
                    ngVar.q();
                }
                ImageReceiver imageReceiver3 = this.f35922a0.getImageReceiver();
                if (PhotoViewer.O1(fileLocation2)) {
                    z24 = false;
                } else {
                    z24 = false;
                }
                if (this.f36034q0 != null) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                imageReceiver3.setVisible(z24, z25);
            }
            c10 = 2;
            h5VarArr3[c10].setVisibility(i16);
            if (!this.S1) {
                h5VarArr3[3].setVisibility(i16);
            }
            ngVar = this.f35941c5;
            if (ngVar != null) {
                ngVar.q();
            }
            ImageReceiver imageReceiver4 = this.f35922a0.getImageReceiver();
            if (PhotoViewer.O1(fileLocation2)) {
                z24 = false;
            } else {
                z24 = false;
            }
            if (this.f36034q0 != null) {
                z25 = true;
            } else {
                z25 = false;
            }
            imageReceiver4.setVisible(z24, z25);
        } else if (this.f35929b1 != 0) {
            TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(this.f35929b1));
            if (chat3 != null) {
                this.A2 = chat3;
            } else {
                chat3 = this.A2;
            }
            FlagSecureReason flagSecureReason = this.T1;
            if (flagSecureReason != null) {
                flagSecureReason.invalidate();
            }
            MessagesController.PeerColor peerColor2 = this.M5;
            MessagesController.PeerColor peerColorFromCollectible2 = MessagesController.PeerColor.fromCollectible(chat3.emoji_status);
            this.M5 = peerColorFromCollectible2;
            if (peerColorFromCollectible2 == null) {
                int profileColorId2 = ChatObject.getProfileColorId(chat3);
                MessagesController.PeerColors peerColors2 = MessagesController.getInstance(this.currentAccount).profilePeerColors;
                this.M5 = peerColors2 == null ? null : peerColors2.getColor(profileColorId2);
            }
            if (peerColor2 != this.M5) {
                o5();
            }
            j01 j01Var2 = this.Z0;
            if (j01Var2 != null) {
                j01Var2.b(ChatObject.getProfileEmojiId(chat3), chat3.emoji_status instanceof TLRPC.TL_emojiStatusCollectible);
            }
            TLRPC.EmojiStatus emojiStatus3 = chat3.emoji_status;
            L4(emojiStatus3 instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus3 : null);
            TLRPC.TL_forumTopic tL_forumTopicFindTopic = this.f36007m1 ? getMessagesController().getTopicsController().findTopic(this.f35929b1, this.f35937c1) : null;
            if (ChatObject.isChannel(chat3)) {
                if (this.f36007m1) {
                    str4 = "Members";
                } else {
                    TLRPC.ChatFull chatFull2 = this.f36036q2;
                    if (chatFull2 != null) {
                        TLRPC.Chat chat4 = this.A2;
                        str4 = "Members";
                        if (chat4.megagroup || (chatFull2.participants_count != 0 && !ChatObject.hasAdminRights(chat4) && !this.f36036q2.can_view_participants)) {
                        }
                        if (z11 != 0) {
                            rnVar = (rn) n2Var2;
                            if (rnVar.W0.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.h5) {
                                pluralString = ((org.telegram.ui.ActionBar.h5) rnVar.W0.getSubtitleTextView()).getText();
                            } else if (rnVar.W0.getSubtitleTextView() instanceof org.telegram.ui.Components.j6) {
                                pluralString = ((org.telegram.ui.Components.j6) rnVar.W0.getSubtitleTextView()).getText();
                            }
                            this.f35922a0.setAnimateFromImageReceiver(rnVar.W0.getAvatarImageView().getImageReceiver());
                        }
                        i10 = 0;
                        z13 = false;
                        while (i10 < 2) {
                            h5Var = h5VarArr[i10];
                            if (h5Var == null) {
                                string = string;
                                charSequence = pluralString;
                                z17 = z11;
                                str3 = string3;
                            } else {
                                if (i10 != 0 && z11) {
                                    org.telegram.ui.ActionBar.h5 titleTextView2 = ((rn) n2Var2).W0.getTitleTextView();
                                    if (h5VarArr[i10].k(titleTextView2.getText())) {
                                        z13 = true;
                                    }
                                    if (h5VarArr[i10].i(titleTextView2.getRightDrawable())) {
                                        z13 = true;
                                    }
                                    if (h5VarArr[i10].j(titleTextView2.getRightDrawable2())) {
                                        z13 = true;
                                    }
                                    charSequence = pluralString;
                                } else if (this.f36007m1) {
                                    if (tL_forumTopicFindTopic == null) {
                                        charSequenceReplaceEmoji2 = string3;
                                    } else {
                                        charSequenceReplaceEmoji2 = tL_forumTopicFindTopic.title;
                                    }
                                    try {
                                        Paint.FontMetricsInt fontMetricsInt = h5Var.getPaint().getFontMetricsInt();
                                        charSequence = pluralString;
                                        try {
                                            charSequenceReplaceEmoji2 = Emoji.replaceEmoji(charSequenceReplaceEmoji2, fontMetricsInt, false);
                                        } catch (Exception unused2) {
                                        }
                                    } catch (Exception unused3) {
                                        charSequence = pluralString;
                                    }
                                    if (h5VarArr[i10].k(charSequenceReplaceEmoji2)) {
                                        z13 = true;
                                    }
                                } else {
                                    charSequence = pluralString;
                                    if (!ChatObject.isMonoForum(chat3)) {
                                        charSequenceReplaceEmoji = chat3.title;
                                        if (charSequenceReplaceEmoji != null) {
                                            try {
                                                charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequenceReplaceEmoji, h5VarArr[i10].getPaint().getFontMetricsInt(), false);
                                            } catch (Exception unused4) {
                                            }
                                            if (h5VarArr[i10].k(charSequenceReplaceEmoji)) {
                                                z13 = true;
                                            }
                                        }
                                    } else if (h5VarArr[i10].k(LocaleController.getString(R.string.ChatMessageSuggestions))) {
                                        z13 = true;
                                    }
                                }
                                h5VarArr[i10].setLeftDrawableOutside(false);
                                h5VarArr[i10].setLeftDrawable((Drawable) null);
                                org.telegram.ui.ActionBar.h5 h5Var10 = h5VarArr[i10];
                                if (i10 == 0) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                h5Var10.setRightDrawableOutside(z16);
                                h5VarArr[i10].setRightDrawableOnClick(null);
                                if (i10 != 0) {
                                    z21 = chat3.scam;
                                    if (!z21 || chat3.fake) {
                                        h5VarArr[i10].j(a4(!z21 ? 1 : 0));
                                        this.h = LocaleController.getString(R.string.ScamMessage);
                                    } else if (chat3.verified) {
                                        h5VarArr[i10].j(d4(i10));
                                        this.h = LocaleController.getString(R.string.AccDescrVerified);
                                    } else {
                                        h5VarArr[i10].j(null);
                                        this.h = null;
                                    }
                                    if (DialogObject.getEmojiStatusDocumentId(chat3.emoji_status) != 0) {
                                        h5VarArr[i10].i(S3(chat3.emoji_status, false, i10));
                                        h5VarArr[i10].setRightDrawableOutside(true);
                                        this.h = null;
                                        if (ChatObject.canChangeChatInfo(chat3)) {
                                            h5VarArr[i10].setRightDrawableOnClick(new fx0(this, 9));
                                            if (this.O) {
                                                this.O = true;
                                                getMediaDataController().loadRestrictedStatusEmojis();
                                            }
                                        } else {
                                            emojiStatus = chat3.emoji_status;
                                            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                                                z17 = z11;
                                                h5VarArr[i10].setRightDrawableOnClick(new tx0(this, ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug, 0));
                                            }
                                        }
                                        z17 = z11;
                                    } else {
                                        z17 = z11;
                                    }
                                } else {
                                    z17 = z11;
                                    if (!z17) {
                                        z18 = chat3.scam;
                                        if (!z18 || chat3.fake) {
                                            z19 = z13;
                                            str3 = string3;
                                            h5VarArr[i10].j(a4(!z18 ? 1 : 0));
                                        } else if (chat3.verified) {
                                            h5VarArr[i10].j(d4(i10));
                                            z19 = z13;
                                            str3 = string3;
                                        } else {
                                            z19 = z13;
                                            str3 = string3;
                                            if (getMessagesController().isDialogMuted(-this.f35929b1, this.f35937c1)) {
                                                h5VarArr[i10].j(getThemedDrawable("drawableMuteIcon"));
                                            } else {
                                                h5VarArr[i10].j(null);
                                            }
                                        }
                                        if (DialogObject.getEmojiStatusDocumentId(chat3.emoji_status) != 0) {
                                            h5VarArr[i10].i(S3(chat3.emoji_status, false, i10));
                                            z20 = true;
                                            h5VarArr[i10].setRightDrawableOutside(true);
                                        } else {
                                            z20 = true;
                                            h5VarArr[i10].i(null);
                                        }
                                    }
                                    if (chat3.bot_verification_icon != 0) {
                                        h5VarArr[i10].setLeftDrawableOutside(z20);
                                        h5VarArr[i10].setLeftDrawable(Q3(i10, chat3.bot_verification_icon));
                                    } else {
                                        h5VarArr[i10].setLeftDrawable((Drawable) null);
                                    }
                                    if (i10 == 0 || string == null) {
                                        if (z17) {
                                            org.telegram.ui.ActionBar.h5 h5Var11 = h5VarArr2[i10];
                                            if (i10 == 0) {
                                                charSequenceV3 = charSequence;
                                            } else {
                                                charSequenceV3 = v3(pluralStringComma);
                                            }
                                            h5Var11.k(charSequenceV3);
                                        } else {
                                            chat2 = this.A2;
                                            if ((!chat2.megagroup && this.f36036q2 != null && this.f36082x2 > 0) || this.f36007m1) {
                                                org.telegram.ui.ActionBar.h5 h5Var12 = h5VarArr2[i10];
                                                if (i10 == 0) {
                                                    charSequenceV3 = charSequence;
                                                } else {
                                                    charSequenceV3 = v3(pluralStringComma);
                                                }
                                                h5Var12.k(charSequenceV3);
                                            } else if (i10 == 0 || !ChatObject.isChannel(chat2) || (chatFull = this.f36036q2) == null || chatFull.participants_count == 0) {
                                                org.telegram.ui.ActionBar.h5 h5Var13 = h5VarArr2[i10];
                                                if (i10 == 0) {
                                                    charSequenceV4 = charSequence;
                                                } else {
                                                    charSequenceV4 = v3(pluralStringComma);
                                                }
                                                h5Var13.k(charSequenceV4);
                                            } else {
                                                TLRPC.Chat chat5 = this.A2;
                                                if (chat5.megagroup || chat5.broadcast) {
                                                    int[] iArr = new int[1];
                                                    if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                                        int i19 = this.f36036q2.participants_count;
                                                        iArr[0] = i19;
                                                        shortNumber = String.valueOf(i19);
                                                    } else {
                                                        shortNumber = LocaleController.formatShortNumber(this.f36036q2.participants_count, iArr);
                                                    }
                                                    if (!this.A2.megagroup) {
                                                        h5VarArr2[i10].k(LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), shortNumber));
                                                    } else if (this.f36036q2.participants_count != 0) {
                                                        CharSequence charSequenceReplace = LocaleController.formatPluralString(str, iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), shortNumber);
                                                        org.telegram.ui.ActionBar.h5 h5Var14 = h5VarArr2[i10];
                                                        if (i10 != 0) {
                                                            charSequenceReplace = v3(charSequenceReplace);
                                                        }
                                                        h5Var14.k(charSequenceReplace);
                                                    } else if (chat3.has_geo) {
                                                        h5VarArr2[i10].k(LocaleController.getString(R.string.MegaLocation).toLowerCase());
                                                    } else if (ChatObject.isPublic(chat3)) {
                                                        h5VarArr2[i10].k(LocaleController.getString(R.string.MegaPublic).toLowerCase());
                                                    } else {
                                                        h5VarArr2[i10].k(LocaleController.getString(R.string.MegaPrivate).toLowerCase());
                                                    }
                                                } else {
                                                    org.telegram.ui.ActionBar.h5 h5Var15 = h5VarArr2[i10];
                                                    if (i10 == 0) {
                                                        charSequenceV4 = charSequence;
                                                    } else {
                                                        charSequenceV4 = v3(pluralStringComma);
                                                    }
                                                    h5Var15.k(charSequenceV4);
                                                }
                                            }
                                        }
                                        if (i10 == 1 && this.f36007m1) {
                                            if (z12) {
                                                h5VarArr2[i10].setOnClickListener(new fx0(this, 10));
                                            } else {
                                                h5VarArr2[i10].setOnClickListener(null);
                                                h5VarArr2[i10].setClickable(false);
                                            }
                                        }
                                        z13 = z19;
                                    } else {
                                        h5VarArr2[i10].k(string);
                                    }
                                    if (i10 == 1) {
                                        if (z12) {
                                            h5VarArr2[i10].setOnClickListener(new fx0(this, 10));
                                        } else {
                                            h5VarArr2[i10].setOnClickListener(null);
                                            h5VarArr2[i10].setClickable(false);
                                        }
                                    }
                                    z13 = z19;
                                }
                                z19 = z13;
                                str3 = string3;
                                z20 = true;
                                if (chat3.bot_verification_icon != 0) {
                                    h5VarArr[i10].setLeftDrawableOutside(z20);
                                    h5VarArr[i10].setLeftDrawable(Q3(i10, chat3.bot_verification_icon));
                                } else {
                                    h5VarArr[i10].setLeftDrawable((Drawable) null);
                                }
                                if (i10 == 0) {
                                    if (z17) {
                                        chat2 = this.A2;
                                        if (!chat2.megagroup) {
                                            if (i10 == 0) {
                                                org.telegram.ui.ActionBar.h5 h5Var16 = h5VarArr2[i10];
                                                if (i10 == 0) {
                                                    charSequenceV4 = charSequence;
                                                } else {
                                                    charSequenceV4 = v3(pluralStringComma);
                                                }
                                                h5Var16.k(charSequenceV4);
                                            } else {
                                                org.telegram.ui.ActionBar.h5 h5Var17 = h5VarArr2[i10];
                                                if (i10 == 0) {
                                                    charSequenceV4 = charSequence;
                                                } else {
                                                    charSequenceV4 = v3(pluralStringComma);
                                                }
                                                h5Var17.k(charSequenceV4);
                                            }
                                        } else if (i10 == 0) {
                                            org.telegram.ui.ActionBar.h5 h5Var18 = h5VarArr2[i10];
                                            if (i10 == 0) {
                                                charSequenceV4 = charSequence;
                                            } else {
                                                charSequenceV4 = v3(pluralStringComma);
                                            }
                                            h5Var18.k(charSequenceV4);
                                        } else {
                                            org.telegram.ui.ActionBar.h5 h5Var19 = h5VarArr2[i10];
                                            if (i10 == 0) {
                                                charSequenceV4 = charSequence;
                                            } else {
                                                charSequenceV4 = v3(pluralStringComma);
                                            }
                                            h5Var19.k(charSequenceV4);
                                        }
                                    } else {
                                        org.telegram.ui.ActionBar.h5 h5Var110 = h5VarArr2[i10];
                                        if (i10 == 0) {
                                            charSequenceV3 = charSequence;
                                        } else {
                                            charSequenceV3 = v3(pluralStringComma);
                                        }
                                        h5Var110.k(charSequenceV3);
                                    }
                                } else if (z17) {
                                    chat2 = this.A2;
                                    if (!chat2.megagroup) {
                                        if (i10 == 0) {
                                            org.telegram.ui.ActionBar.h5 h5Var111 = h5VarArr2[i10];
                                            if (i10 == 0) {
                                                charSequenceV4 = charSequence;
                                            } else {
                                                charSequenceV4 = v3(pluralStringComma);
                                            }
                                            h5Var111.k(charSequenceV4);
                                        } else {
                                            org.telegram.ui.ActionBar.h5 h5Var112 = h5VarArr2[i10];
                                            if (i10 == 0) {
                                                charSequenceV4 = charSequence;
                                            } else {
                                                charSequenceV4 = v3(pluralStringComma);
                                            }
                                            h5Var112.k(charSequenceV4);
                                        }
                                    } else if (i10 == 0) {
                                        org.telegram.ui.ActionBar.h5 h5Var113 = h5VarArr2[i10];
                                        if (i10 == 0) {
                                            charSequenceV4 = charSequence;
                                        } else {
                                            charSequenceV4 = v3(pluralStringComma);
                                        }
                                        h5Var113.k(charSequenceV4);
                                    } else {
                                        org.telegram.ui.ActionBar.h5 h5Var114 = h5VarArr2[i10];
                                        if (i10 == 0) {
                                            charSequenceV4 = charSequence;
                                        } else {
                                            charSequenceV4 = v3(pluralStringComma);
                                        }
                                        h5Var114.k(charSequenceV4);
                                    }
                                } else {
                                    org.telegram.ui.ActionBar.h5 h5Var115 = h5VarArr2[i10];
                                    if (i10 == 0) {
                                        charSequenceV3 = charSequence;
                                    } else {
                                        charSequenceV3 = v3(pluralStringComma);
                                    }
                                    h5Var115.k(charSequenceV3);
                                }
                                if (i10 == 1) {
                                    if (z12) {
                                        h5VarArr2[i10].setOnClickListener(new fx0(this, 10));
                                    } else {
                                        h5VarArr2[i10].setOnClickListener(null);
                                        h5VarArr2[i10].setClickable(false);
                                    }
                                }
                                z13 = z19;
                            }
                            i10++;
                            pluralString = charSequence;
                            string3 = str3;
                            z11 = z17;
                            string = string;
                        }
                        if (z13) {
                            k4(true);
                        }
                        chatPhoto = chat3.photo;
                        if (chatPhoto != null || this.f36007m1) {
                            fileLocation = null;
                        } else {
                            fileLocation = chatPhoto.photo_big;
                        }
                        if (this.f36007m1) {
                            wf.c.p(this.f35922a0, tL_forumTopicFindTopic, true, true, this.f36067v0);
                            forUserOrChat = null;
                            forUserOrChat2 = null;
                        } else {
                            if (ChatObject.isMonoForum(this.A2)) {
                                TLRPC.Chat monoForumLinkedChat = getMessagesController().getMonoForumLinkedChat(this.A2.f22380id);
                                this.f36001l0.k(this.currentAccount, monoForumLinkedChat);
                                ImageLocation forUserOrChat6 = ImageLocation.getForUserOrChat(this.currentAccount, monoForumLinkedChat, 0);
                                ImageLocation forUserOrChat7 = ImageLocation.getForUserOrChat(this.currentAccount, monoForumLinkedChat, 1);
                                imageLocationC = this.f35987j0.C(forUserOrChat7, forUserOrChat6);
                                forUserOrChat2 = forUserOrChat7;
                                forUserOrChat = forUserOrChat6;
                            } else {
                                this.f36001l0.k(this.currentAccount, chat3);
                                forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, chat3, 0);
                                forUserOrChat2 = ImageLocation.getForUserOrChat(this.currentAccount, chat3, 1);
                                my0Var = this.f35987j0;
                                if (my0Var != null) {
                                    imageLocationC = my0Var.C(forUserOrChat2, forUserOrChat);
                                }
                            }
                            boolean zH = this.f35987j0.H(null, forUserOrChat, forUserOrChat2, z10);
                            if ((forUserOrChat != null || zH) && this.f36002l2) {
                                viewM = this.f35935c.m(0);
                                if (viewM != null) {
                                    this.f35921a.v0(0, viewM.getTop() - T3(), org.telegram.ui.Components.er.h);
                                }
                            }
                            if (imageLocationC == null && imageLocationC.imageType == 2) {
                                str2 = "g";
                            } else {
                                str2 = null;
                            }
                            if (this.F2 == null || this.f36007m1) {
                                chat = chat3;
                            } else {
                                TLRPC.Chat chat6 = chat3;
                                this.f35922a0.l(imageLocationC, str2, forUserOrChat2, "50_50", this.f36001l0, chat6);
                                chat = chat6;
                            }
                            if (forUserOrChat != null && ((imageLocation = this.f36080x0) == null || forUserOrChat.photoId != imageLocation.photoId)) {
                                this.f36080x0 = forUserOrChat;
                                getFileLoader().loadFile(forUserOrChat, chat, null, 0, 1);
                            }
                            ImageReceiver imageReceiver5 = this.f35922a0.getImageReceiver();
                            if (!PhotoViewer.O1(fileLocation) || (getLastStoryViewer() != null && getLastStoryViewer().f13496o0.f13333a == this.f35922a0)) {
                                z14 = false;
                            } else {
                                z14 = true;
                            }
                            if (this.f36034q0 != null) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            imageReceiver5.setVisible(z14, z15);
                        }
                        imageLocationC = null;
                        boolean zH2 = this.f35987j0.H(null, forUserOrChat, forUserOrChat2, z10);
                        if (forUserOrChat != null) {
                            viewM = this.f35935c.m(0);
                            if (viewM != null) {
                                this.f35921a.v0(0, viewM.getTop() - T3(), org.telegram.ui.Components.er.h);
                            }
                        } else {
                            viewM = this.f35935c.m(0);
                            if (viewM != null) {
                                this.f35921a.v0(0, viewM.getTop() - T3(), org.telegram.ui.Components.er.h);
                            }
                        }
                        if (imageLocationC == null) {
                            str2 = null;
                        } else {
                            str2 = null;
                        }
                        if (this.F2 == null) {
                            chat = chat3;
                        } else {
                            chat = chat3;
                        }
                        if (forUserOrChat != null) {
                            this.f36080x0 = forUserOrChat;
                            getFileLoader().loadFile(forUserOrChat, chat, null, 0, 1);
                        }
                        ImageReceiver imageReceiver6 = this.f35922a0.getImageReceiver();
                        if (PhotoViewer.O1(fileLocation)) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        if (this.f36034q0 != null) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        imageReceiver6.setVisible(z14, z15);
                    } else {
                        str4 = "Members";
                    }
                    if (this.A2.megagroup) {
                        lowerCase2 = LocaleController.getString(R.string.Loading).toLowerCase();
                    } else {
                        lowerCase2 = ChatObject.isPublic(chat3) ? LocaleController.getString(R.string.ChannelPublic).toLowerCase() : LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                    }
                    pluralString = lowerCase2;
                    h5VarArr2 = h5VarArr3;
                    z12 = false;
                    str = str4;
                    n2Var2 = n2Var;
                    pluralStringComma = pluralString;
                    if (z11 != 0) {
                        rnVar = (rn) n2Var2;
                        if (rnVar.W0.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.h5) {
                            pluralString = ((org.telegram.ui.ActionBar.h5) rnVar.W0.getSubtitleTextView()).getText();
                        } else if (rnVar.W0.getSubtitleTextView() instanceof org.telegram.ui.Components.j6) {
                            pluralString = ((org.telegram.ui.Components.j6) rnVar.W0.getSubtitleTextView()).getText();
                        }
                        this.f35922a0.setAnimateFromImageReceiver(rnVar.W0.getAvatarImageView().getImageReceiver());
                    }
                    i10 = 0;
                    z13 = false;
                    while (i10 < 2) {
                        h5Var = h5VarArr[i10];
                        if (h5Var == null) {
                            string = string;
                            charSequence = pluralString;
                            z17 = z11;
                            str3 = string3;
                        } else {
                            if (i10 != 0) {
                                if (this.f36007m1) {
                                    if (tL_forumTopicFindTopic == null) {
                                        charSequenceReplaceEmoji2 = string3;
                                    } else {
                                        charSequenceReplaceEmoji2 = tL_forumTopicFindTopic.title;
                                    }
                                    Paint.FontMetricsInt fontMetricsInt2 = h5Var.getPaint().getFontMetricsInt();
                                    charSequence = pluralString;
                                    charSequenceReplaceEmoji2 = Emoji.replaceEmoji(charSequenceReplaceEmoji2, fontMetricsInt2, false);
                                    if (h5VarArr[i10].k(charSequenceReplaceEmoji2)) {
                                        z13 = true;
                                    }
                                } else {
                                    charSequence = pluralString;
                                    if (!ChatObject.isMonoForum(chat3)) {
                                        charSequenceReplaceEmoji = chat3.title;
                                        if (charSequenceReplaceEmoji != null) {
                                            charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequenceReplaceEmoji, h5VarArr[i10].getPaint().getFontMetricsInt(), false);
                                            if (h5VarArr[i10].k(charSequenceReplaceEmoji)) {
                                                z13 = true;
                                            }
                                        }
                                    } else if (h5VarArr[i10].k(LocaleController.getString(R.string.ChatMessageSuggestions))) {
                                        z13 = true;
                                    }
                                }
                            } else if (this.f36007m1) {
                                if (tL_forumTopicFindTopic == null) {
                                    charSequenceReplaceEmoji2 = string3;
                                } else {
                                    charSequenceReplaceEmoji2 = tL_forumTopicFindTopic.title;
                                }
                                Paint.FontMetricsInt fontMetricsInt3 = h5Var.getPaint().getFontMetricsInt();
                                charSequence = pluralString;
                                charSequenceReplaceEmoji2 = Emoji.replaceEmoji(charSequenceReplaceEmoji2, fontMetricsInt3, false);
                                if (h5VarArr[i10].k(charSequenceReplaceEmoji2)) {
                                    z13 = true;
                                }
                            } else {
                                charSequence = pluralString;
                                if (!ChatObject.isMonoForum(chat3)) {
                                    charSequenceReplaceEmoji = chat3.title;
                                    if (charSequenceReplaceEmoji != null) {
                                        charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequenceReplaceEmoji, h5VarArr[i10].getPaint().getFontMetricsInt(), false);
                                        if (h5VarArr[i10].k(charSequenceReplaceEmoji)) {
                                            z13 = true;
                                        }
                                    }
                                } else if (h5VarArr[i10].k(LocaleController.getString(R.string.ChatMessageSuggestions))) {
                                    z13 = true;
                                }
                            }
                            h5VarArr[i10].setLeftDrawableOutside(false);
                            h5VarArr[i10].setLeftDrawable((Drawable) null);
                            org.telegram.ui.ActionBar.h5 h5Var116 = h5VarArr[i10];
                            if (i10 == 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            h5Var116.setRightDrawableOutside(z16);
                            h5VarArr[i10].setRightDrawableOnClick(null);
                            if (i10 != 0) {
                                z21 = chat3.scam;
                                if (z21) {
                                    h5VarArr[i10].j(a4(!z21 ? 1 : 0));
                                    this.h = LocaleController.getString(R.string.ScamMessage);
                                } else {
                                    h5VarArr[i10].j(a4(!z21 ? 1 : 0));
                                    this.h = LocaleController.getString(R.string.ScamMessage);
                                }
                                if (DialogObject.getEmojiStatusDocumentId(chat3.emoji_status) != 0) {
                                    h5VarArr[i10].i(S3(chat3.emoji_status, false, i10));
                                    h5VarArr[i10].setRightDrawableOutside(true);
                                    this.h = null;
                                    if (ChatObject.canChangeChatInfo(chat3)) {
                                        h5VarArr[i10].setRightDrawableOnClick(new fx0(this, 9));
                                        if (this.O) {
                                            this.O = true;
                                            getMediaDataController().loadRestrictedStatusEmojis();
                                        }
                                    } else {
                                        emojiStatus = chat3.emoji_status;
                                        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                                            z17 = z11;
                                            h5VarArr[i10].setRightDrawableOnClick(new tx0(this, ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug, 0));
                                        }
                                    }
                                    z17 = z11;
                                } else {
                                    z17 = z11;
                                }
                            } else {
                                z17 = z11;
                                if (!z17) {
                                    z18 = chat3.scam;
                                    if (z18) {
                                        z19 = z13;
                                        str3 = string3;
                                        h5VarArr[i10].j(a4(!z18 ? 1 : 0));
                                    } else {
                                        z19 = z13;
                                        str3 = string3;
                                        h5VarArr[i10].j(a4(!z18 ? 1 : 0));
                                    }
                                    if (DialogObject.getEmojiStatusDocumentId(chat3.emoji_status) != 0) {
                                        h5VarArr[i10].i(S3(chat3.emoji_status, false, i10));
                                        z20 = true;
                                        h5VarArr[i10].setRightDrawableOutside(true);
                                    } else {
                                        z20 = true;
                                        h5VarArr[i10].i(null);
                                    }
                                }
                                if (chat3.bot_verification_icon != 0) {
                                    h5VarArr[i10].setLeftDrawableOutside(z20);
                                    h5VarArr[i10].setLeftDrawable(Q3(i10, chat3.bot_verification_icon));
                                } else {
                                    h5VarArr[i10].setLeftDrawable((Drawable) null);
                                }
                                if (i10 == 0) {
                                    if (z17) {
                                        chat2 = this.A2;
                                        if (!chat2.megagroup) {
                                            if (i10 == 0) {
                                                org.telegram.ui.ActionBar.h5 h5Var117 = h5VarArr2[i10];
                                                if (i10 == 0) {
                                                    charSequenceV4 = charSequence;
                                                } else {
                                                    charSequenceV4 = v3(pluralStringComma);
                                                }
                                                h5Var117.k(charSequenceV4);
                                            } else {
                                                org.telegram.ui.ActionBar.h5 h5Var118 = h5VarArr2[i10];
                                                if (i10 == 0) {
                                                    charSequenceV4 = charSequence;
                                                } else {
                                                    charSequenceV4 = v3(pluralStringComma);
                                                }
                                                h5Var118.k(charSequenceV4);
                                            }
                                        } else if (i10 == 0) {
                                            org.telegram.ui.ActionBar.h5 h5Var119 = h5VarArr2[i10];
                                            if (i10 == 0) {
                                                charSequenceV4 = charSequence;
                                            } else {
                                                charSequenceV4 = v3(pluralStringComma);
                                            }
                                            h5Var119.k(charSequenceV4);
                                        } else {
                                            org.telegram.ui.ActionBar.h5 h5Var1110 = h5VarArr2[i10];
                                            if (i10 == 0) {
                                                charSequenceV4 = charSequence;
                                            } else {
                                                charSequenceV4 = v3(pluralStringComma);
                                            }
                                            h5Var1110.k(charSequenceV4);
                                        }
                                    } else {
                                        org.telegram.ui.ActionBar.h5 h5Var1111 = h5VarArr2[i10];
                                        if (i10 == 0) {
                                            charSequenceV3 = charSequence;
                                        } else {
                                            charSequenceV3 = v3(pluralStringComma);
                                        }
                                        h5Var1111.k(charSequenceV3);
                                    }
                                } else if (z17) {
                                    chat2 = this.A2;
                                    if (!chat2.megagroup) {
                                        if (i10 == 0) {
                                            org.telegram.ui.ActionBar.h5 h5Var1112 = h5VarArr2[i10];
                                            if (i10 == 0) {
                                                charSequenceV4 = charSequence;
                                            } else {
                                                charSequenceV4 = v3(pluralStringComma);
                                            }
                                            h5Var1112.k(charSequenceV4);
                                        } else {
                                            org.telegram.ui.ActionBar.h5 h5Var1113 = h5VarArr2[i10];
                                            if (i10 == 0) {
                                                charSequenceV4 = charSequence;
                                            } else {
                                                charSequenceV4 = v3(pluralStringComma);
                                            }
                                            h5Var1113.k(charSequenceV4);
                                        }
                                    } else if (i10 == 0) {
                                        org.telegram.ui.ActionBar.h5 h5Var1114 = h5VarArr2[i10];
                                        if (i10 == 0) {
                                            charSequenceV4 = charSequence;
                                        } else {
                                            charSequenceV4 = v3(pluralStringComma);
                                        }
                                        h5Var1114.k(charSequenceV4);
                                    } else {
                                        org.telegram.ui.ActionBar.h5 h5Var1115 = h5VarArr2[i10];
                                        if (i10 == 0) {
                                            charSequenceV4 = charSequence;
                                        } else {
                                            charSequenceV4 = v3(pluralStringComma);
                                        }
                                        h5Var1115.k(charSequenceV4);
                                    }
                                } else {
                                    org.telegram.ui.ActionBar.h5 h5Var1116 = h5VarArr2[i10];
                                    if (i10 == 0) {
                                        charSequenceV3 = charSequence;
                                    } else {
                                        charSequenceV3 = v3(pluralStringComma);
                                    }
                                    h5Var1116.k(charSequenceV3);
                                }
                                if (i10 == 1) {
                                    if (z12) {
                                        h5VarArr2[i10].setOnClickListener(new fx0(this, 10));
                                    } else {
                                        h5VarArr2[i10].setOnClickListener(null);
                                        h5VarArr2[i10].setClickable(false);
                                    }
                                }
                                z13 = z19;
                            }
                            z19 = z13;
                            str3 = string3;
                            z20 = true;
                            if (chat3.bot_verification_icon != 0) {
                                h5VarArr[i10].setLeftDrawableOutside(z20);
                                h5VarArr[i10].setLeftDrawable(Q3(i10, chat3.bot_verification_icon));
                            } else {
                                h5VarArr[i10].setLeftDrawable((Drawable) null);
                            }
                            if (i10 == 0) {
                                if (z17) {
                                    chat2 = this.A2;
                                    if (!chat2.megagroup) {
                                        if (i10 == 0) {
                                            org.telegram.ui.ActionBar.h5 h5Var1117 = h5VarArr2[i10];
                                            if (i10 == 0) {
                                                charSequenceV4 = charSequence;
                                            } else {
                                                charSequenceV4 = v3(pluralStringComma);
                                            }
                                            h5Var1117.k(charSequenceV4);
                                        } else {
                                            org.telegram.ui.ActionBar.h5 h5Var1118 = h5VarArr2[i10];
                                            if (i10 == 0) {
                                                charSequenceV4 = charSequence;
                                            } else {
                                                charSequenceV4 = v3(pluralStringComma);
                                            }
                                            h5Var1118.k(charSequenceV4);
                                        }
                                    } else if (i10 == 0) {
                                        org.telegram.ui.ActionBar.h5 h5Var1119 = h5VarArr2[i10];
                                        if (i10 == 0) {
                                            charSequenceV4 = charSequence;
                                        } else {
                                            charSequenceV4 = v3(pluralStringComma);
                                        }
                                        h5Var1119.k(charSequenceV4);
                                    } else {
                                        org.telegram.ui.ActionBar.h5 h5Var11110 = h5VarArr2[i10];
                                        if (i10 == 0) {
                                            charSequenceV4 = charSequence;
                                        } else {
                                            charSequenceV4 = v3(pluralStringComma);
                                        }
                                        h5Var11110.k(charSequenceV4);
                                    }
                                } else {
                                    org.telegram.ui.ActionBar.h5 h5Var11111 = h5VarArr2[i10];
                                    if (i10 == 0) {
                                        charSequenceV3 = charSequence;
                                    } else {
                                        charSequenceV3 = v3(pluralStringComma);
                                    }
                                    h5Var11111.k(charSequenceV3);
                                }
                            } else if (z17) {
                                chat2 = this.A2;
                                if (!chat2.megagroup) {
                                    if (i10 == 0) {
                                        org.telegram.ui.ActionBar.h5 h5Var11112 = h5VarArr2[i10];
                                        if (i10 == 0) {
                                            charSequenceV4 = charSequence;
                                        } else {
                                            charSequenceV4 = v3(pluralStringComma);
                                        }
                                        h5Var11112.k(charSequenceV4);
                                    } else {
                                        org.telegram.ui.ActionBar.h5 h5Var11113 = h5VarArr2[i10];
                                        if (i10 == 0) {
                                            charSequenceV4 = charSequence;
                                        } else {
                                            charSequenceV4 = v3(pluralStringComma);
                                        }
                                        h5Var11113.k(charSequenceV4);
                                    }
                                } else if (i10 == 0) {
                                    org.telegram.ui.ActionBar.h5 h5Var11114 = h5VarArr2[i10];
                                    if (i10 == 0) {
                                        charSequenceV4 = charSequence;
                                    } else {
                                        charSequenceV4 = v3(pluralStringComma);
                                    }
                                    h5Var11114.k(charSequenceV4);
                                } else {
                                    org.telegram.ui.ActionBar.h5 h5Var11115 = h5VarArr2[i10];
                                    if (i10 == 0) {
                                        charSequenceV4 = charSequence;
                                    } else {
                                        charSequenceV4 = v3(pluralStringComma);
                                    }
                                    h5Var11115.k(charSequenceV4);
                                }
                            } else {
                                org.telegram.ui.ActionBar.h5 h5Var11116 = h5VarArr2[i10];
                                if (i10 == 0) {
                                    charSequenceV3 = charSequence;
                                } else {
                                    charSequenceV3 = v3(pluralStringComma);
                                }
                                h5Var11116.k(charSequenceV3);
                            }
                            if (i10 == 1) {
                                if (z12) {
                                    h5VarArr2[i10].setOnClickListener(new fx0(this, 10));
                                } else {
                                    h5VarArr2[i10].setOnClickListener(null);
                                    h5VarArr2[i10].setClickable(false);
                                }
                            }
                            z13 = z19;
                        }
                        i10++;
                        pluralString = charSequence;
                        string3 = str3;
                        z11 = z17;
                        string = string;
                    }
                    if (z13) {
                        k4(true);
                    }
                    chatPhoto = chat3.photo;
                    if (chatPhoto != null) {
                        fileLocation = null;
                    } else {
                        fileLocation = null;
                    }
                    if (this.f36007m1) {
                        wf.c.p(this.f35922a0, tL_forumTopicFindTopic, true, true, this.f36067v0);
                        forUserOrChat = null;
                        forUserOrChat2 = null;
                    } else {
                        if (ChatObject.isMonoForum(this.A2)) {
                            TLRPC.Chat monoForumLinkedChat2 = getMessagesController().getMonoForumLinkedChat(this.A2.f22380id);
                            this.f36001l0.k(this.currentAccount, monoForumLinkedChat2);
                            ImageLocation forUserOrChat8 = ImageLocation.getForUserOrChat(this.currentAccount, monoForumLinkedChat2, 0);
                            ImageLocation forUserOrChat9 = ImageLocation.getForUserOrChat(this.currentAccount, monoForumLinkedChat2, 1);
                            imageLocationC = this.f35987j0.C(forUserOrChat9, forUserOrChat8);
                            forUserOrChat2 = forUserOrChat9;
                            forUserOrChat = forUserOrChat8;
                        } else {
                            this.f36001l0.k(this.currentAccount, chat3);
                            forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, chat3, 0);
                            forUserOrChat2 = ImageLocation.getForUserOrChat(this.currentAccount, chat3, 1);
                            my0Var = this.f35987j0;
                            if (my0Var != null) {
                                imageLocationC = my0Var.C(forUserOrChat2, forUserOrChat);
                            }
                        }
                        boolean zH3 = this.f35987j0.H(null, forUserOrChat, forUserOrChat2, z10);
                        if (forUserOrChat != null) {
                            viewM = this.f35935c.m(0);
                            if (viewM != null) {
                                this.f35921a.v0(0, viewM.getTop() - T3(), org.telegram.ui.Components.er.h);
                            }
                        } else {
                            viewM = this.f35935c.m(0);
                            if (viewM != null) {
                                this.f35921a.v0(0, viewM.getTop() - T3(), org.telegram.ui.Components.er.h);
                            }
                        }
                        if (imageLocationC == null) {
                            str2 = null;
                        } else {
                            str2 = null;
                        }
                        if (this.F2 == null) {
                            chat = chat3;
                        } else {
                            chat = chat3;
                        }
                        if (forUserOrChat != null) {
                            this.f36080x0 = forUserOrChat;
                            getFileLoader().loadFile(forUserOrChat, chat, null, 0, 1);
                        }
                        ImageReceiver imageReceiver7 = this.f35922a0.getImageReceiver();
                        if (PhotoViewer.O1(fileLocation)) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        if (this.f36034q0 != null) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        imageReceiver7.setVisible(z14, z15);
                    }
                    imageLocationC = null;
                    boolean zH4 = this.f35987j0.H(null, forUserOrChat, forUserOrChat2, z10);
                    if (forUserOrChat != null) {
                        viewM = this.f35935c.m(0);
                        if (viewM != null) {
                            this.f35921a.v0(0, viewM.getTop() - T3(), org.telegram.ui.Components.er.h);
                        }
                    } else {
                        viewM = this.f35935c.m(0);
                        if (viewM != null) {
                            this.f35921a.v0(0, viewM.getTop() - T3(), org.telegram.ui.Components.er.h);
                        }
                    }
                    if (imageLocationC == null) {
                        str2 = null;
                    } else {
                        str2 = null;
                    }
                    if (this.F2 == null) {
                        chat = chat3;
                    } else {
                        chat = chat3;
                    }
                    if (forUserOrChat != null) {
                        this.f36080x0 = forUserOrChat;
                        getFileLoader().loadFile(forUserOrChat, chat, null, 0, 1);
                    }
                    ImageReceiver imageReceiver8 = this.f35922a0.getImageReceiver();
                    if (PhotoViewer.O1(fileLocation)) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    if (this.f36034q0 != null) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    imageReceiver8.setVisible(z14, z15);
                }
                if (this.f36007m1) {
                    if (tL_forumTopicFindTopic != null) {
                        i12 = 1;
                        i13 = tL_forumTopicFindTopic.totalMessagesCount - 1;
                    } else {
                        i12 = 1;
                        i13 = 0;
                    }
                    if (i13 > 0) {
                        Object[] objArr = new Object[i12];
                        i14 = 0;
                        objArr[0] = Integer.valueOf(i13);
                        string2 = LocaleController.formatPluralString("messages", i13, objArr);
                    } else {
                        i14 = 0;
                        int i20 = R.string.TopicProfileStatus;
                        Object[] objArr2 = new Object[i12];
                        objArr2[0] = chat3.title;
                        string2 = LocaleController.formatString("TopicProfileStatus", i20, objArr2);
                    }
                    SpannableString spannableString = new SpannableString(">");
                    String str9 = string2;
                    spannableString.setSpan(new org.telegram.ui.Components.cq(R.drawable.arrow_newchat), i14, 1, 33);
                    str = str4;
                    n2Var2 = n2Var;
                    z12 = true;
                    pluralStringComma = new SpannableStringBuilder(chat3.title).append(' ').append((CharSequence) spannableString);
                    pluralString = str9;
                    h5VarArr2 = h5VarArr3;
                } else {
                    str = str4;
                    if (!this.A2.megagroup) {
                        n2Var2 = n2Var;
                        h5VarArr2 = h5VarArr3;
                        LocaleController.formatShortNumber(this.f36036q2.participants_count, new int[1]);
                        if (this.A2.megagroup) {
                            pluralString = LocaleController.formatPluralString(str, this.f36036q2.participants_count, new Object[0]);
                            pluralStringComma = LocaleController.formatPluralStringComma(str, this.f36036q2.participants_count);
                        } else {
                            pluralString = LocaleController.formatPluralString("Subscribers", this.f36036q2.participants_count, new Object[0]);
                            pluralStringComma = LocaleController.formatPluralStringComma("Subscribers", this.f36036q2.participants_count);
                        }
                    } else if (this.f36082x2 <= 1 || (i11 = this.f36036q2.participants_count) == 0) {
                        n2Var2 = n2Var;
                        h5VarArr2 = h5VarArr3;
                        int i21 = this.f36036q2.participants_count;
                        if (i21 == 0) {
                            if (chat3.has_geo) {
                                lowerCase = LocaleController.getString(R.string.MegaLocation).toLowerCase();
                            } else {
                                lowerCase = ChatObject.isPublic(chat3) ? LocaleController.getString(R.string.MegaPublic).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                            }
                            pluralString = lowerCase;
                        } else {
                            pluralString = LocaleController.formatPluralString(str, i21, new Object[0]);
                            pluralStringComma = LocaleController.formatPluralStringComma(str, this.f36036q2.participants_count);
                        }
                    } else {
                        n2Var2 = n2Var;
                        h5VarArr2 = h5VarArr3;
                        pluralString = a9.p.w(LocaleController.formatPluralString(str, i11, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", Math.min(this.f36082x2, this.f36036q2.participants_count), new Object[0]));
                        z12 = false;
                        pluralStringComma = a9.p.w(LocaleController.formatPluralStringComma(str, this.f36036q2.participants_count), ", ", LocaleController.formatPluralStringComma("OnlineCount", Math.min(this.f36082x2, this.f36036q2.participants_count)));
                    }
                    z12 = false;
                }
                if (z11 != 0) {
                    rnVar = (rn) n2Var2;
                    if (rnVar.W0.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.h5) {
                        pluralString = ((org.telegram.ui.ActionBar.h5) rnVar.W0.getSubtitleTextView()).getText();
                    } else if (rnVar.W0.getSubtitleTextView() instanceof org.telegram.ui.Components.j6) {
                        pluralString = ((org.telegram.ui.Components.j6) rnVar.W0.getSubtitleTextView()).getText();
                    }
                    this.f35922a0.setAnimateFromImageReceiver(rnVar.W0.getAvatarImageView().getImageReceiver());
                }
                i10 = 0;
                z13 = false;
                while (i10 < 2) {
                    h5Var = h5VarArr[i10];
                    if (h5Var == null) {
                        string = string;
                        charSequence = pluralString;
                        z17 = z11;
                        str3 = string3;
                    } else {
                        if (i10 != 0) {
                            if (this.f36007m1) {
                                if (tL_forumTopicFindTopic == null) {
                                    charSequenceReplaceEmoji2 = string3;
                                } else {
                                    charSequenceReplaceEmoji2 = tL_forumTopicFindTopic.title;
                                }
                                Paint.FontMetricsInt fontMetricsInt4 = h5Var.getPaint().getFontMetricsInt();
                                charSequence = pluralString;
                                charSequenceReplaceEmoji2 = Emoji.replaceEmoji(charSequenceReplaceEmoji2, fontMetricsInt4, false);
                                if (h5VarArr[i10].k(charSequenceReplaceEmoji2)) {
                                    z13 = true;
                                }
                            } else {
                                charSequence = pluralString;
                                if (!ChatObject.isMonoForum(chat3)) {
                                    charSequenceReplaceEmoji = chat3.title;
                                    if (charSequenceReplaceEmoji != null) {
                                        charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequenceReplaceEmoji, h5VarArr[i10].getPaint().getFontMetricsInt(), false);
                                        if (h5VarArr[i10].k(charSequenceReplaceEmoji)) {
                                            z13 = true;
                                        }
                                    }
                                } else if (h5VarArr[i10].k(LocaleController.getString(R.string.ChatMessageSuggestions))) {
                                    z13 = true;
                                }
                            }
                        } else if (this.f36007m1) {
                            if (tL_forumTopicFindTopic == null) {
                                charSequenceReplaceEmoji2 = string3;
                            } else {
                                charSequenceReplaceEmoji2 = tL_forumTopicFindTopic.title;
                            }
                            Paint.FontMetricsInt fontMetricsInt5 = h5Var.getPaint().getFontMetricsInt();
                            charSequence = pluralString;
                            charSequenceReplaceEmoji2 = Emoji.replaceEmoji(charSequenceReplaceEmoji2, fontMetricsInt5, false);
                            if (h5VarArr[i10].k(charSequenceReplaceEmoji2)) {
                                z13 = true;
                            }
                        } else {
                            charSequence = pluralString;
                            if (!ChatObject.isMonoForum(chat3)) {
                                charSequenceReplaceEmoji = chat3.title;
                                if (charSequenceReplaceEmoji != null) {
                                    charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequenceReplaceEmoji, h5VarArr[i10].getPaint().getFontMetricsInt(), false);
                                    if (h5VarArr[i10].k(charSequenceReplaceEmoji)) {
                                        z13 = true;
                                    }
                                }
                            } else if (h5VarArr[i10].k(LocaleController.getString(R.string.ChatMessageSuggestions))) {
                                z13 = true;
                            }
                        }
                        h5VarArr[i10].setLeftDrawableOutside(false);
                        h5VarArr[i10].setLeftDrawable((Drawable) null);
                        org.telegram.ui.ActionBar.h5 h5Var1120 = h5VarArr[i10];
                        if (i10 == 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        h5Var1120.setRightDrawableOutside(z16);
                        h5VarArr[i10].setRightDrawableOnClick(null);
                        if (i10 != 0) {
                            z21 = chat3.scam;
                            if (z21) {
                                h5VarArr[i10].j(a4(!z21 ? 1 : 0));
                                this.h = LocaleController.getString(R.string.ScamMessage);
                            } else {
                                h5VarArr[i10].j(a4(!z21 ? 1 : 0));
                                this.h = LocaleController.getString(R.string.ScamMessage);
                            }
                            if (DialogObject.getEmojiStatusDocumentId(chat3.emoji_status) != 0) {
                                h5VarArr[i10].i(S3(chat3.emoji_status, false, i10));
                                h5VarArr[i10].setRightDrawableOutside(true);
                                this.h = null;
                                if (ChatObject.canChangeChatInfo(chat3)) {
                                    h5VarArr[i10].setRightDrawableOnClick(new fx0(this, 9));
                                    if (this.O) {
                                        this.O = true;
                                        getMediaDataController().loadRestrictedStatusEmojis();
                                    }
                                } else {
                                    emojiStatus = chat3.emoji_status;
                                    if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                                        z17 = z11;
                                        h5VarArr[i10].setRightDrawableOnClick(new tx0(this, ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug, 0));
                                    }
                                }
                                z17 = z11;
                            } else {
                                z17 = z11;
                            }
                        } else {
                            z17 = z11;
                            if (!z17) {
                                z18 = chat3.scam;
                                if (z18) {
                                    z19 = z13;
                                    str3 = string3;
                                    h5VarArr[i10].j(a4(!z18 ? 1 : 0));
                                } else {
                                    z19 = z13;
                                    str3 = string3;
                                    h5VarArr[i10].j(a4(!z18 ? 1 : 0));
                                }
                                if (DialogObject.getEmojiStatusDocumentId(chat3.emoji_status) != 0) {
                                    h5VarArr[i10].i(S3(chat3.emoji_status, false, i10));
                                    z20 = true;
                                    h5VarArr[i10].setRightDrawableOutside(true);
                                } else {
                                    z20 = true;
                                    h5VarArr[i10].i(null);
                                }
                            }
                            if (chat3.bot_verification_icon != 0) {
                                h5VarArr[i10].setLeftDrawableOutside(z20);
                                h5VarArr[i10].setLeftDrawable(Q3(i10, chat3.bot_verification_icon));
                            } else {
                                h5VarArr[i10].setLeftDrawable((Drawable) null);
                            }
                            if (i10 == 0) {
                                if (z17) {
                                    chat2 = this.A2;
                                    if (!chat2.megagroup) {
                                        if (i10 == 0) {
                                            org.telegram.ui.ActionBar.h5 h5Var11117 = h5VarArr2[i10];
                                            if (i10 == 0) {
                                                charSequenceV4 = charSequence;
                                            } else {
                                                charSequenceV4 = v3(pluralStringComma);
                                            }
                                            h5Var11117.k(charSequenceV4);
                                        } else {
                                            org.telegram.ui.ActionBar.h5 h5Var11118 = h5VarArr2[i10];
                                            if (i10 == 0) {
                                                charSequenceV4 = charSequence;
                                            } else {
                                                charSequenceV4 = v3(pluralStringComma);
                                            }
                                            h5Var11118.k(charSequenceV4);
                                        }
                                    } else if (i10 == 0) {
                                        org.telegram.ui.ActionBar.h5 h5Var11119 = h5VarArr2[i10];
                                        if (i10 == 0) {
                                            charSequenceV4 = charSequence;
                                        } else {
                                            charSequenceV4 = v3(pluralStringComma);
                                        }
                                        h5Var11119.k(charSequenceV4);
                                    } else {
                                        org.telegram.ui.ActionBar.h5 h5Var111110 = h5VarArr2[i10];
                                        if (i10 == 0) {
                                            charSequenceV4 = charSequence;
                                        } else {
                                            charSequenceV4 = v3(pluralStringComma);
                                        }
                                        h5Var111110.k(charSequenceV4);
                                    }
                                } else {
                                    org.telegram.ui.ActionBar.h5 h5Var111111 = h5VarArr2[i10];
                                    if (i10 == 0) {
                                        charSequenceV3 = charSequence;
                                    } else {
                                        charSequenceV3 = v3(pluralStringComma);
                                    }
                                    h5Var111111.k(charSequenceV3);
                                }
                            } else if (z17) {
                                chat2 = this.A2;
                                if (!chat2.megagroup) {
                                    if (i10 == 0) {
                                        org.telegram.ui.ActionBar.h5 h5Var111112 = h5VarArr2[i10];
                                        if (i10 == 0) {
                                            charSequenceV4 = charSequence;
                                        } else {
                                            charSequenceV4 = v3(pluralStringComma);
                                        }
                                        h5Var111112.k(charSequenceV4);
                                    } else {
                                        org.telegram.ui.ActionBar.h5 h5Var111113 = h5VarArr2[i10];
                                        if (i10 == 0) {
                                            charSequenceV4 = charSequence;
                                        } else {
                                            charSequenceV4 = v3(pluralStringComma);
                                        }
                                        h5Var111113.k(charSequenceV4);
                                    }
                                } else if (i10 == 0) {
                                    org.telegram.ui.ActionBar.h5 h5Var111114 = h5VarArr2[i10];
                                    if (i10 == 0) {
                                        charSequenceV4 = charSequence;
                                    } else {
                                        charSequenceV4 = v3(pluralStringComma);
                                    }
                                    h5Var111114.k(charSequenceV4);
                                } else {
                                    org.telegram.ui.ActionBar.h5 h5Var111115 = h5VarArr2[i10];
                                    if (i10 == 0) {
                                        charSequenceV4 = charSequence;
                                    } else {
                                        charSequenceV4 = v3(pluralStringComma);
                                    }
                                    h5Var111115.k(charSequenceV4);
                                }
                            } else {
                                org.telegram.ui.ActionBar.h5 h5Var111116 = h5VarArr2[i10];
                                if (i10 == 0) {
                                    charSequenceV3 = charSequence;
                                } else {
                                    charSequenceV3 = v3(pluralStringComma);
                                }
                                h5Var111116.k(charSequenceV3);
                            }
                            if (i10 == 1) {
                                if (z12) {
                                    h5VarArr2[i10].setOnClickListener(new fx0(this, 10));
                                } else {
                                    h5VarArr2[i10].setOnClickListener(null);
                                    h5VarArr2[i10].setClickable(false);
                                }
                            }
                            z13 = z19;
                        }
                        z19 = z13;
                        str3 = string3;
                        z20 = true;
                        if (chat3.bot_verification_icon != 0) {
                            h5VarArr[i10].setLeftDrawableOutside(z20);
                            h5VarArr[i10].setLeftDrawable(Q3(i10, chat3.bot_verification_icon));
                        } else {
                            h5VarArr[i10].setLeftDrawable((Drawable) null);
                        }
                        if (i10 == 0) {
                            if (z17) {
                                chat2 = this.A2;
                                if (!chat2.megagroup) {
                                    if (i10 == 0) {
                                        org.telegram.ui.ActionBar.h5 h5Var111117 = h5VarArr2[i10];
                                        if (i10 == 0) {
                                            charSequenceV4 = charSequence;
                                        } else {
                                            charSequenceV4 = v3(pluralStringComma);
                                        }
                                        h5Var111117.k(charSequenceV4);
                                    } else {
                                        org.telegram.ui.ActionBar.h5 h5Var111118 = h5VarArr2[i10];
                                        if (i10 == 0) {
                                            charSequenceV4 = charSequence;
                                        } else {
                                            charSequenceV4 = v3(pluralStringComma);
                                        }
                                        h5Var111118.k(charSequenceV4);
                                    }
                                } else if (i10 == 0) {
                                    org.telegram.ui.ActionBar.h5 h5Var111119 = h5VarArr2[i10];
                                    if (i10 == 0) {
                                        charSequenceV4 = charSequence;
                                    } else {
                                        charSequenceV4 = v3(pluralStringComma);
                                    }
                                    h5Var111119.k(charSequenceV4);
                                } else {
                                    org.telegram.ui.ActionBar.h5 h5Var1111110 = h5VarArr2[i10];
                                    if (i10 == 0) {
                                        charSequenceV4 = charSequence;
                                    } else {
                                        charSequenceV4 = v3(pluralStringComma);
                                    }
                                    h5Var1111110.k(charSequenceV4);
                                }
                            } else {
                                org.telegram.ui.ActionBar.h5 h5Var1111111 = h5VarArr2[i10];
                                if (i10 == 0) {
                                    charSequenceV3 = charSequence;
                                } else {
                                    charSequenceV3 = v3(pluralStringComma);
                                }
                                h5Var1111111.k(charSequenceV3);
                            }
                        } else if (z17) {
                            chat2 = this.A2;
                            if (!chat2.megagroup) {
                                if (i10 == 0) {
                                    org.telegram.ui.ActionBar.h5 h5Var1111112 = h5VarArr2[i10];
                                    if (i10 == 0) {
                                        charSequenceV4 = charSequence;
                                    } else {
                                        charSequenceV4 = v3(pluralStringComma);
                                    }
                                    h5Var1111112.k(charSequenceV4);
                                } else {
                                    org.telegram.ui.ActionBar.h5 h5Var1111113 = h5VarArr2[i10];
                                    if (i10 == 0) {
                                        charSequenceV4 = charSequence;
                                    } else {
                                        charSequenceV4 = v3(pluralStringComma);
                                    }
                                    h5Var1111113.k(charSequenceV4);
                                }
                            } else if (i10 == 0) {
                                org.telegram.ui.ActionBar.h5 h5Var1111114 = h5VarArr2[i10];
                                if (i10 == 0) {
                                    charSequenceV4 = charSequence;
                                } else {
                                    charSequenceV4 = v3(pluralStringComma);
                                }
                                h5Var1111114.k(charSequenceV4);
                            } else {
                                org.telegram.ui.ActionBar.h5 h5Var1111115 = h5VarArr2[i10];
                                if (i10 == 0) {
                                    charSequenceV4 = charSequence;
                                } else {
                                    charSequenceV4 = v3(pluralStringComma);
                                }
                                h5Var1111115.k(charSequenceV4);
                            }
                        } else {
                            org.telegram.ui.ActionBar.h5 h5Var1111116 = h5VarArr2[i10];
                            if (i10 == 0) {
                                charSequenceV3 = charSequence;
                            } else {
                                charSequenceV3 = v3(pluralStringComma);
                            }
                            h5Var1111116.k(charSequenceV3);
                        }
                        if (i10 == 1) {
                            if (z12) {
                                h5VarArr2[i10].setOnClickListener(new fx0(this, 10));
                            } else {
                                h5VarArr2[i10].setOnClickListener(null);
                                h5VarArr2[i10].setClickable(false);
                            }
                        }
                        z13 = z19;
                    }
                    i10++;
                    pluralString = charSequence;
                    string3 = str3;
                    z11 = z17;
                    string = string;
                }
                if (z13) {
                    k4(true);
                }
                chatPhoto = chat3.photo;
                if (chatPhoto != null) {
                    fileLocation = null;
                } else {
                    fileLocation = null;
                }
                if (this.f36007m1) {
                    wf.c.p(this.f35922a0, tL_forumTopicFindTopic, true, true, this.f36067v0);
                    forUserOrChat = null;
                    forUserOrChat2 = null;
                } else {
                    if (ChatObject.isMonoForum(this.A2)) {
                        TLRPC.Chat monoForumLinkedChat3 = getMessagesController().getMonoForumLinkedChat(this.A2.f22380id);
                        this.f36001l0.k(this.currentAccount, monoForumLinkedChat3);
                        ImageLocation forUserOrChat10 = ImageLocation.getForUserOrChat(this.currentAccount, monoForumLinkedChat3, 0);
                        ImageLocation forUserOrChat11 = ImageLocation.getForUserOrChat(this.currentAccount, monoForumLinkedChat3, 1);
                        imageLocationC = this.f35987j0.C(forUserOrChat11, forUserOrChat10);
                        forUserOrChat2 = forUserOrChat11;
                        forUserOrChat = forUserOrChat10;
                    } else {
                        this.f36001l0.k(this.currentAccount, chat3);
                        forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, chat3, 0);
                        forUserOrChat2 = ImageLocation.getForUserOrChat(this.currentAccount, chat3, 1);
                        my0Var = this.f35987j0;
                        if (my0Var != null) {
                            imageLocationC = my0Var.C(forUserOrChat2, forUserOrChat);
                        }
                    }
                    boolean zH5 = this.f35987j0.H(null, forUserOrChat, forUserOrChat2, z10);
                    if (forUserOrChat != null) {
                        viewM = this.f35935c.m(0);
                        if (viewM != null) {
                            this.f35921a.v0(0, viewM.getTop() - T3(), org.telegram.ui.Components.er.h);
                        }
                    } else {
                        viewM = this.f35935c.m(0);
                        if (viewM != null) {
                            this.f35921a.v0(0, viewM.getTop() - T3(), org.telegram.ui.Components.er.h);
                        }
                    }
                    if (imageLocationC == null) {
                        str2 = null;
                    } else {
                        str2 = null;
                    }
                    if (this.F2 == null) {
                        chat = chat3;
                    } else {
                        chat = chat3;
                    }
                    if (forUserOrChat != null) {
                        this.f36080x0 = forUserOrChat;
                        getFileLoader().loadFile(forUserOrChat, chat, null, 0, 1);
                    }
                    ImageReceiver imageReceiver9 = this.f35922a0.getImageReceiver();
                    if (PhotoViewer.O1(fileLocation)) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    if (this.f36034q0 != null) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    imageReceiver9.setVisible(z14, z15);
                }
                imageLocationC = null;
                boolean zH6 = this.f35987j0.H(null, forUserOrChat, forUserOrChat2, z10);
                if (forUserOrChat != null) {
                    viewM = this.f35935c.m(0);
                    if (viewM != null) {
                        this.f35921a.v0(0, viewM.getTop() - T3(), org.telegram.ui.Components.er.h);
                    }
                } else {
                    viewM = this.f35935c.m(0);
                    if (viewM != null) {
                        this.f35921a.v0(0, viewM.getTop() - T3(), org.telegram.ui.Components.er.h);
                    }
                }
                if (imageLocationC == null) {
                    str2 = null;
                } else {
                    str2 = null;
                }
                if (this.F2 == null) {
                    chat = chat3;
                } else {
                    chat = chat3;
                }
                if (forUserOrChat != null) {
                    this.f36080x0 = forUserOrChat;
                    getFileLoader().loadFile(forUserOrChat, chat, null, 0, 1);
                }
                ImageReceiver imageReceiver10 = this.f35922a0.getImageReceiver();
                if (PhotoViewer.O1(fileLocation)) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                if (this.f36034q0 != null) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                imageReceiver10.setVisible(z14, z15);
            } else {
                str = "Members";
                n2Var2 = n2Var;
                h5VarArr2 = h5VarArr3;
                if (ChatObject.isKickedFromChat(chat3)) {
                    pluralString = LocaleController.getString(R.string.YouWereKicked);
                } else if (ChatObject.isLeftFromChat(chat3)) {
                    pluralString = LocaleController.getString(R.string.YouLeft);
                } else {
                    int size = chat3.participants_count;
                    TLRPC.ChatFull chatFull3 = this.f36036q2;
                    if (chatFull3 != null && (chatParticipants = chatFull3.participants) != null) {
                        size = chatParticipants.participants.size();
                    }
                    pluralString = (size == 0 || this.f36082x2 <= 1) ? LocaleController.formatPluralString(str, size, new Object[0]) : a9.p.w(LocaleController.formatPluralString(str, size, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", this.f36082x2, new Object[0]));
                }
            }
            pluralStringComma = pluralString;
            z12 = false;
            if (z11 != 0) {
                rnVar = (rn) n2Var2;
                if (rnVar.W0.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.h5) {
                    pluralString = ((org.telegram.ui.ActionBar.h5) rnVar.W0.getSubtitleTextView()).getText();
                } else if (rnVar.W0.getSubtitleTextView() instanceof org.telegram.ui.Components.j6) {
                    pluralString = ((org.telegram.ui.Components.j6) rnVar.W0.getSubtitleTextView()).getText();
                }
                this.f35922a0.setAnimateFromImageReceiver(rnVar.W0.getAvatarImageView().getImageReceiver());
            }
            i10 = 0;
            z13 = false;
            while (i10 < 2) {
                h5Var = h5VarArr[i10];
                if (h5Var == null) {
                    string = string;
                    charSequence = pluralString;
                    z17 = z11;
                    str3 = string3;
                } else {
                    if (i10 != 0) {
                        if (this.f36007m1) {
                            if (tL_forumTopicFindTopic == null) {
                                charSequenceReplaceEmoji2 = string3;
                            } else {
                                charSequenceReplaceEmoji2 = tL_forumTopicFindTopic.title;
                            }
                            Paint.FontMetricsInt fontMetricsInt6 = h5Var.getPaint().getFontMetricsInt();
                            charSequence = pluralString;
                            charSequenceReplaceEmoji2 = Emoji.replaceEmoji(charSequenceReplaceEmoji2, fontMetricsInt6, false);
                            if (h5VarArr[i10].k(charSequenceReplaceEmoji2)) {
                                z13 = true;
                            }
                        } else {
                            charSequence = pluralString;
                            if (!ChatObject.isMonoForum(chat3)) {
                                charSequenceReplaceEmoji = chat3.title;
                                if (charSequenceReplaceEmoji != null) {
                                    charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequenceReplaceEmoji, h5VarArr[i10].getPaint().getFontMetricsInt(), false);
                                    if (h5VarArr[i10].k(charSequenceReplaceEmoji)) {
                                        z13 = true;
                                    }
                                }
                            } else if (h5VarArr[i10].k(LocaleController.getString(R.string.ChatMessageSuggestions))) {
                                z13 = true;
                            }
                        }
                    } else if (this.f36007m1) {
                        if (tL_forumTopicFindTopic == null) {
                            charSequenceReplaceEmoji2 = string3;
                        } else {
                            charSequenceReplaceEmoji2 = tL_forumTopicFindTopic.title;
                        }
                        Paint.FontMetricsInt fontMetricsInt7 = h5Var.getPaint().getFontMetricsInt();
                        charSequence = pluralString;
                        charSequenceReplaceEmoji2 = Emoji.replaceEmoji(charSequenceReplaceEmoji2, fontMetricsInt7, false);
                        if (h5VarArr[i10].k(charSequenceReplaceEmoji2)) {
                            z13 = true;
                        }
                    } else {
                        charSequence = pluralString;
                        if (!ChatObject.isMonoForum(chat3)) {
                            charSequenceReplaceEmoji = chat3.title;
                            if (charSequenceReplaceEmoji != null) {
                                charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequenceReplaceEmoji, h5VarArr[i10].getPaint().getFontMetricsInt(), false);
                                if (h5VarArr[i10].k(charSequenceReplaceEmoji)) {
                                    z13 = true;
                                }
                            }
                        } else if (h5VarArr[i10].k(LocaleController.getString(R.string.ChatMessageSuggestions))) {
                            z13 = true;
                        }
                    }
                    h5VarArr[i10].setLeftDrawableOutside(false);
                    h5VarArr[i10].setLeftDrawable((Drawable) null);
                    org.telegram.ui.ActionBar.h5 h5Var1121 = h5VarArr[i10];
                    if (i10 == 0) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    h5Var1121.setRightDrawableOutside(z16);
                    h5VarArr[i10].setRightDrawableOnClick(null);
                    if (i10 != 0) {
                        z21 = chat3.scam;
                        if (z21) {
                            h5VarArr[i10].j(a4(!z21 ? 1 : 0));
                            this.h = LocaleController.getString(R.string.ScamMessage);
                        } else {
                            h5VarArr[i10].j(a4(!z21 ? 1 : 0));
                            this.h = LocaleController.getString(R.string.ScamMessage);
                        }
                        if (DialogObject.getEmojiStatusDocumentId(chat3.emoji_status) != 0) {
                            h5VarArr[i10].i(S3(chat3.emoji_status, false, i10));
                            h5VarArr[i10].setRightDrawableOutside(true);
                            this.h = null;
                            if (ChatObject.canChangeChatInfo(chat3)) {
                                h5VarArr[i10].setRightDrawableOnClick(new fx0(this, 9));
                                if (this.O) {
                                    this.O = true;
                                    getMediaDataController().loadRestrictedStatusEmojis();
                                }
                            } else {
                                emojiStatus = chat3.emoji_status;
                                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                                    z17 = z11;
                                    h5VarArr[i10].setRightDrawableOnClick(new tx0(this, ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug, 0));
                                }
                            }
                            z17 = z11;
                        } else {
                            z17 = z11;
                        }
                    } else {
                        z17 = z11;
                        if (!z17) {
                            z18 = chat3.scam;
                            if (z18) {
                                z19 = z13;
                                str3 = string3;
                                h5VarArr[i10].j(a4(!z18 ? 1 : 0));
                            } else {
                                z19 = z13;
                                str3 = string3;
                                h5VarArr[i10].j(a4(!z18 ? 1 : 0));
                            }
                            if (DialogObject.getEmojiStatusDocumentId(chat3.emoji_status) != 0) {
                                h5VarArr[i10].i(S3(chat3.emoji_status, false, i10));
                                z20 = true;
                                h5VarArr[i10].setRightDrawableOutside(true);
                            } else {
                                z20 = true;
                                h5VarArr[i10].i(null);
                            }
                        }
                        if (chat3.bot_verification_icon != 0) {
                            h5VarArr[i10].setLeftDrawableOutside(z20);
                            h5VarArr[i10].setLeftDrawable(Q3(i10, chat3.bot_verification_icon));
                        } else {
                            h5VarArr[i10].setLeftDrawable((Drawable) null);
                        }
                        if (i10 == 0) {
                            if (z17) {
                                chat2 = this.A2;
                                if (!chat2.megagroup) {
                                    if (i10 == 0) {
                                        org.telegram.ui.ActionBar.h5 h5Var1111117 = h5VarArr2[i10];
                                        if (i10 == 0) {
                                            charSequenceV4 = charSequence;
                                        } else {
                                            charSequenceV4 = v3(pluralStringComma);
                                        }
                                        h5Var1111117.k(charSequenceV4);
                                    } else {
                                        org.telegram.ui.ActionBar.h5 h5Var1111118 = h5VarArr2[i10];
                                        if (i10 == 0) {
                                            charSequenceV4 = charSequence;
                                        } else {
                                            charSequenceV4 = v3(pluralStringComma);
                                        }
                                        h5Var1111118.k(charSequenceV4);
                                    }
                                } else if (i10 == 0) {
                                    org.telegram.ui.ActionBar.h5 h5Var1111119 = h5VarArr2[i10];
                                    if (i10 == 0) {
                                        charSequenceV4 = charSequence;
                                    } else {
                                        charSequenceV4 = v3(pluralStringComma);
                                    }
                                    h5Var1111119.k(charSequenceV4);
                                } else {
                                    org.telegram.ui.ActionBar.h5 h5Var11111110 = h5VarArr2[i10];
                                    if (i10 == 0) {
                                        charSequenceV4 = charSequence;
                                    } else {
                                        charSequenceV4 = v3(pluralStringComma);
                                    }
                                    h5Var11111110.k(charSequenceV4);
                                }
                            } else {
                                org.telegram.ui.ActionBar.h5 h5Var11111111 = h5VarArr2[i10];
                                if (i10 == 0) {
                                    charSequenceV3 = charSequence;
                                } else {
                                    charSequenceV3 = v3(pluralStringComma);
                                }
                                h5Var11111111.k(charSequenceV3);
                            }
                        } else if (z17) {
                            chat2 = this.A2;
                            if (!chat2.megagroup) {
                                if (i10 == 0) {
                                    org.telegram.ui.ActionBar.h5 h5Var11111112 = h5VarArr2[i10];
                                    if (i10 == 0) {
                                        charSequenceV4 = charSequence;
                                    } else {
                                        charSequenceV4 = v3(pluralStringComma);
                                    }
                                    h5Var11111112.k(charSequenceV4);
                                } else {
                                    org.telegram.ui.ActionBar.h5 h5Var11111113 = h5VarArr2[i10];
                                    if (i10 == 0) {
                                        charSequenceV4 = charSequence;
                                    } else {
                                        charSequenceV4 = v3(pluralStringComma);
                                    }
                                    h5Var11111113.k(charSequenceV4);
                                }
                            } else if (i10 == 0) {
                                org.telegram.ui.ActionBar.h5 h5Var11111114 = h5VarArr2[i10];
                                if (i10 == 0) {
                                    charSequenceV4 = charSequence;
                                } else {
                                    charSequenceV4 = v3(pluralStringComma);
                                }
                                h5Var11111114.k(charSequenceV4);
                            } else {
                                org.telegram.ui.ActionBar.h5 h5Var11111115 = h5VarArr2[i10];
                                if (i10 == 0) {
                                    charSequenceV4 = charSequence;
                                } else {
                                    charSequenceV4 = v3(pluralStringComma);
                                }
                                h5Var11111115.k(charSequenceV4);
                            }
                        } else {
                            org.telegram.ui.ActionBar.h5 h5Var11111116 = h5VarArr2[i10];
                            if (i10 == 0) {
                                charSequenceV3 = charSequence;
                            } else {
                                charSequenceV3 = v3(pluralStringComma);
                            }
                            h5Var11111116.k(charSequenceV3);
                        }
                        if (i10 == 1) {
                            if (z12) {
                                h5VarArr2[i10].setOnClickListener(new fx0(this, 10));
                            } else {
                                h5VarArr2[i10].setOnClickListener(null);
                                h5VarArr2[i10].setClickable(false);
                            }
                        }
                        z13 = z19;
                    }
                    z19 = z13;
                    str3 = string3;
                    z20 = true;
                    if (chat3.bot_verification_icon != 0) {
                        h5VarArr[i10].setLeftDrawableOutside(z20);
                        h5VarArr[i10].setLeftDrawable(Q3(i10, chat3.bot_verification_icon));
                    } else {
                        h5VarArr[i10].setLeftDrawable((Drawable) null);
                    }
                    if (i10 == 0) {
                        if (z17) {
                            chat2 = this.A2;
                            if (!chat2.megagroup) {
                                if (i10 == 0) {
                                    org.telegram.ui.ActionBar.h5 h5Var11111117 = h5VarArr2[i10];
                                    if (i10 == 0) {
                                        charSequenceV4 = charSequence;
                                    } else {
                                        charSequenceV4 = v3(pluralStringComma);
                                    }
                                    h5Var11111117.k(charSequenceV4);
                                } else {
                                    org.telegram.ui.ActionBar.h5 h5Var11111118 = h5VarArr2[i10];
                                    if (i10 == 0) {
                                        charSequenceV4 = charSequence;
                                    } else {
                                        charSequenceV4 = v3(pluralStringComma);
                                    }
                                    h5Var11111118.k(charSequenceV4);
                                }
                            } else if (i10 == 0) {
                                org.telegram.ui.ActionBar.h5 h5Var11111119 = h5VarArr2[i10];
                                if (i10 == 0) {
                                    charSequenceV4 = charSequence;
                                } else {
                                    charSequenceV4 = v3(pluralStringComma);
                                }
                                h5Var11111119.k(charSequenceV4);
                            } else {
                                org.telegram.ui.ActionBar.h5 h5Var111111110 = h5VarArr2[i10];
                                if (i10 == 0) {
                                    charSequenceV4 = charSequence;
                                } else {
                                    charSequenceV4 = v3(pluralStringComma);
                                }
                                h5Var111111110.k(charSequenceV4);
                            }
                        } else {
                            org.telegram.ui.ActionBar.h5 h5Var111111111 = h5VarArr2[i10];
                            if (i10 == 0) {
                                charSequenceV3 = charSequence;
                            } else {
                                charSequenceV3 = v3(pluralStringComma);
                            }
                            h5Var111111111.k(charSequenceV3);
                        }
                    } else if (z17) {
                        chat2 = this.A2;
                        if (!chat2.megagroup) {
                            if (i10 == 0) {
                                org.telegram.ui.ActionBar.h5 h5Var111111112 = h5VarArr2[i10];
                                if (i10 == 0) {
                                    charSequenceV4 = charSequence;
                                } else {
                                    charSequenceV4 = v3(pluralStringComma);
                                }
                                h5Var111111112.k(charSequenceV4);
                            } else {
                                org.telegram.ui.ActionBar.h5 h5Var111111113 = h5VarArr2[i10];
                                if (i10 == 0) {
                                    charSequenceV4 = charSequence;
                                } else {
                                    charSequenceV4 = v3(pluralStringComma);
                                }
                                h5Var111111113.k(charSequenceV4);
                            }
                        } else if (i10 == 0) {
                            org.telegram.ui.ActionBar.h5 h5Var111111114 = h5VarArr2[i10];
                            if (i10 == 0) {
                                charSequenceV4 = charSequence;
                            } else {
                                charSequenceV4 = v3(pluralStringComma);
                            }
                            h5Var111111114.k(charSequenceV4);
                        } else {
                            org.telegram.ui.ActionBar.h5 h5Var111111115 = h5VarArr2[i10];
                            if (i10 == 0) {
                                charSequenceV4 = charSequence;
                            } else {
                                charSequenceV4 = v3(pluralStringComma);
                            }
                            h5Var111111115.k(charSequenceV4);
                        }
                    } else {
                        org.telegram.ui.ActionBar.h5 h5Var111111116 = h5VarArr2[i10];
                        if (i10 == 0) {
                            charSequenceV3 = charSequence;
                        } else {
                            charSequenceV3 = v3(pluralStringComma);
                        }
                        h5Var111111116.k(charSequenceV3);
                    }
                    if (i10 == 1) {
                        if (z12) {
                            h5VarArr2[i10].setOnClickListener(new fx0(this, 10));
                        } else {
                            h5VarArr2[i10].setOnClickListener(null);
                            h5VarArr2[i10].setClickable(false);
                        }
                    }
                    z13 = z19;
                }
                i10++;
                pluralString = charSequence;
                string3 = str3;
                z11 = z17;
                string = string;
            }
            if (z13) {
                k4(true);
            }
            chatPhoto = chat3.photo;
            if (chatPhoto != null) {
                fileLocation = null;
            } else {
                fileLocation = null;
            }
            if (this.f36007m1) {
                wf.c.p(this.f35922a0, tL_forumTopicFindTopic, true, true, this.f36067v0);
                forUserOrChat = null;
                forUserOrChat2 = null;
            } else {
                if (ChatObject.isMonoForum(this.A2)) {
                    TLRPC.Chat monoForumLinkedChat4 = getMessagesController().getMonoForumLinkedChat(this.A2.f22380id);
                    this.f36001l0.k(this.currentAccount, monoForumLinkedChat4);
                    ImageLocation forUserOrChat12 = ImageLocation.getForUserOrChat(this.currentAccount, monoForumLinkedChat4, 0);
                    ImageLocation forUserOrChat13 = ImageLocation.getForUserOrChat(this.currentAccount, monoForumLinkedChat4, 1);
                    imageLocationC = this.f35987j0.C(forUserOrChat13, forUserOrChat12);
                    forUserOrChat2 = forUserOrChat13;
                    forUserOrChat = forUserOrChat12;
                } else {
                    this.f36001l0.k(this.currentAccount, chat3);
                    forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, chat3, 0);
                    forUserOrChat2 = ImageLocation.getForUserOrChat(this.currentAccount, chat3, 1);
                    my0Var = this.f35987j0;
                    if (my0Var != null) {
                        imageLocationC = my0Var.C(forUserOrChat2, forUserOrChat);
                    }
                }
                boolean zH7 = this.f35987j0.H(null, forUserOrChat, forUserOrChat2, z10);
                if (forUserOrChat != null) {
                    viewM = this.f35935c.m(0);
                    if (viewM != null) {
                        this.f35921a.v0(0, viewM.getTop() - T3(), org.telegram.ui.Components.er.h);
                    }
                } else {
                    viewM = this.f35935c.m(0);
                    if (viewM != null) {
                        this.f35921a.v0(0, viewM.getTop() - T3(), org.telegram.ui.Components.er.h);
                    }
                }
                if (imageLocationC == null) {
                    str2 = null;
                } else {
                    str2 = null;
                }
                if (this.F2 == null) {
                    chat = chat3;
                } else {
                    chat = chat3;
                }
                if (forUserOrChat != null) {
                    this.f36080x0 = forUserOrChat;
                    getFileLoader().loadFile(forUserOrChat, chat, null, 0, 1);
                }
                ImageReceiver imageReceiver11 = this.f35922a0.getImageReceiver();
                if (PhotoViewer.O1(fileLocation)) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                if (this.f36034q0 != null) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                imageReceiver11.setVisible(z14, z15);
            }
            imageLocationC = null;
            boolean zH8 = this.f35987j0.H(null, forUserOrChat, forUserOrChat2, z10);
            if (forUserOrChat != null) {
                viewM = this.f35935c.m(0);
                if (viewM != null) {
                    this.f35921a.v0(0, viewM.getTop() - T3(), org.telegram.ui.Components.er.h);
                }
            } else {
                viewM = this.f35935c.m(0);
                if (viewM != null) {
                    this.f35921a.v0(0, viewM.getTop() - T3(), org.telegram.ui.Components.er.h);
                }
            }
            if (imageLocationC == null) {
                str2 = null;
            } else {
                str2 = null;
            }
            if (this.F2 == null) {
                chat = chat3;
            } else {
                chat = chat3;
            }
            if (forUserOrChat != null) {
                this.f36080x0 = forUserOrChat;
                getFileLoader().loadFile(forUserOrChat, chat, null, 0, 1);
            }
            ImageReceiver imageReceiver12 = this.f35922a0.getImageReceiver();
            if (PhotoViewer.O1(fileLocation)) {
                z14 = false;
            } else {
                z14 = false;
            }
            if (this.f36034q0 != null) {
                z15 = true;
            } else {
                z15 = false;
            }
            imageReceiver12.setVisible(z14, z15);
        }
        k4(true);
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.f36002l2;
    }

    @Override
    public final boolean isLightStatusBar() {
        int bgColor2;
        if (this.f36002l2) {
            return false;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.t()) {
            bgColor2 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23393w8, this.f36067v0);
        } else if (this.B5) {
            bgColor2 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, this.f36067v0);
        } else {
            MessagesController.PeerColor peerColor = this.M5;
            bgColor2 = peerColor != null ? peerColor.getBgColor2(org.telegram.ui.ActionBar.g6.I.q()) : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23322s8, this.f36067v0);
        }
        return i0.b.f(bgColor2) > 0.699999988079071d;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        hz0 hz0Var;
        hz0 hz0Var2;
        my0 my0Var = this.f35987j0;
        Rect rect = this.H2;
        if (my0Var == null || my0Var.getVisibility() != 0 || this.f35987j0.getRealCount() <= 1) {
            if (this.F4 != -1 && (hz0Var = this.K) != null) {
                if (hz0Var.x0()) {
                    this.K.getHitRect(rect);
                    if (motionEvent != null || rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight())) {
                        hz0Var2 = this.K;
                        if (hz0Var2.getSelectedTab() == hz0Var2.E0.getFirstTabId()) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            return true;
        }
        this.f35987j0.getHitRect(rect);
        if (motionEvent == null || !rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight())) {
            if (this.F4 != -1) {
                if (hz0Var.x0()) {
                    this.K.getHitRect(rect);
                    if (motionEvent != null) {
                    }
                    hz0Var2 = this.K;
                    if (hz0Var2.getSelectedTab() == hz0Var2.E0.getFirstTabId()) {
                        return true;
                    }
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean j4() {
        return getMessagesController().getStoriesController().I(a()) && !this.f36007m1;
    }

    public final void j5() {
        boolean z10;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatParticipants chatParticipants;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.ChatFull chatFull3;
        TLRPC.ChatFull chatFull4;
        TLRPC.ChatParticipants chatParticipants2;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChatFull chatFull5;
        int i10;
        by0 by0Var;
        org.telegram.ui.Components.rg0 rg0Var;
        org.telegram.ui.Components.jh0 jh0Var;
        TLRPC.UserFull userFull;
        int i11;
        boolean z11;
        TLRPC.UserFull userFull2;
        boolean z12;
        TLRPC.UserFull userFull3;
        TL_payments.starRefProgram starrefprogram;
        org.telegram.ui.Cells.c6 c6Var;
        TLRPC.Chat chat;
        TLRPC.UserFull userFull4;
        my0 my0Var;
        TLRPC.ChatFull chatFull6;
        TLRPC.UserFull userFull5;
        TLRPC.ChatFull chatFull7;
        TLRPC.UserFull userFull6;
        TL_bots.BotInfo botInfo;
        TLRPC.UserFull userFull7;
        g5(false);
        int i12 = this.J2;
        this.J2 = 0;
        this.K2 = -1;
        this.L2 = -1;
        this.O2 = -1;
        this.P2 = -1;
        this.Q2 = -1;
        this.R2 = -1;
        this.S2 = -1;
        this.M2 = -1;
        this.N2 = -1;
        this.T2 = -1;
        this.W2 = -1;
        this.X2 = -1;
        this.U2 = -1;
        this.V2 = -1;
        this.Y2 = -1;
        this.Z2 = -1;
        this.a3 = -1;
        this.f35931b3 = -1;
        this.f35939c3 = -1;
        this.Y3 = -1;
        this.Z3 = -1;
        this.f35924a4 = -1;
        this.f35932b4 = -1;
        this.f35940c4 = -1;
        this.f35947d4 = -1;
        this.f35946d3 = -1;
        this.f35954e3 = -1;
        this.f35962f3 = -1;
        this.f35969g3 = -1;
        this.f35976h3 = -1;
        this.f35983i3 = -1;
        this.f35990j3 = -1;
        this.f35997k3 = -1;
        this.f36003l3 = -1;
        this.f36009m3 = -1;
        this.f36017n3 = -1;
        this.f36024o3 = -1;
        this.f36031p3 = -1;
        this.f36037q3 = -1;
        this.f36044r3 = -1;
        this.f36052s3 = -1;
        this.f36058t3 = -1;
        this.f36064u3 = -1;
        this.f36070v3 = -1;
        this.f35955e4 = -1;
        this.f35991j4 = -1;
        this.botPermissionBiometry = -1;
        this.botPermissionEmojiStatus = -1;
        this.botPermissionLocation = -1;
        this.f36004l4 = -1;
        this.f35963f4 = -1;
        this.f35970g4 = -1;
        this.f35977h4 = -1;
        this.f35984i4 = -1;
        this.Q3 = -1;
        this.R3 = -1;
        this.T3 = -1;
        this.S3 = -1;
        this.V3 = -1;
        this.f36076w3 = -1;
        this.f36083x3 = -1;
        this.f36096z3 = -1;
        this.A3 = -1;
        this.B3 = -1;
        this.C3 = -1;
        this.D3 = -1;
        this.F3 = -1;
        this.E3 = -1;
        this.G3 = -1;
        this.H3 = -1;
        this.f36010m4 = -1;
        this.f36018n4 = -1;
        this.I3 = -1;
        this.U3 = -1;
        this.J3 = -1;
        this.L3 = -1;
        this.K3 = -1;
        this.N3 = -1;
        this.O3 = -1;
        this.P3 = -1;
        this.f36025o4 = -1;
        this.f36090y3 = -1;
        this.W3 = -1;
        this.X3 = -1;
        this.f36032p4 = -1;
        this.f36038q4 = -1;
        this.f36045r4 = -1;
        this.f36053s4 = -1;
        this.f36059t4 = -1;
        this.f36065u4 = -1;
        this.v4 = -1;
        this.C4 = -1;
        this.D4 = -1;
        this.A4 = -1;
        this.F4 = -1;
        this.M3 = -1;
        this.f36077w4 = -1;
        this.f36084x4 = -1;
        this.f36091y4 = -1;
        this.f36097z4 = -1;
        this.B4 = -1;
        this.E4 = false;
        this.G4 = -1;
        this.H4 = -1;
        this.I4 = -1;
        ArrayList arrayList2 = this.M4;
        arrayList2.clear();
        ArrayList arrayList3 = this.N4;
        arrayList3.clear();
        org.telegram.ui.Components.zt0 zt0Var = this.N;
        boolean z13 = true;
        if (zt0Var != null) {
            int[] iArr = zt0Var.f35350c;
            int i13 = 0;
            while (true) {
                if (i13 >= iArr.length) {
                    z10 = false;
                    break;
                } else {
                    if (iArr[i13] > 0) {
                        z10 = true;
                        break;
                    }
                    i13++;
                }
            }
            if (!z10) {
                z10 = this.N.f35352f;
            }
            if (!z10) {
                this.N.getClass();
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (!z10 && (userFull7 = this.f36043r2) != null) {
            z10 = userFull7.stories_pinned_available;
        }
        if (!z10 && (userFull6 = this.f36043r2) != null && (botInfo = userFull6.bot_info) != null) {
            z10 = botInfo.has_preview_medias;
        }
        if (!z10 && (((userFull5 = this.f36043r2) != null && userFull5.stargifts_count > 0) || ((chatFull7 = this.f36036q2) != null && chatFull7.stargifts_count > 0))) {
            z10 = true;
        }
        if (!z10 && (chatFull6 = this.f36036q2) != null) {
            z10 = chatFull6.stories_pinned_available;
        }
        if (!z10) {
            long j10 = this.f35929b1;
            if (j10 != 0 && MessagesController.ChannelRecommendations.hasRecommendations(this.currentAccount, -j10)) {
                z10 = true;
            } else if (this.f36016n2) {
                long j11 = this.f35923a1;
                if (j11 != 0 && MessagesController.ChannelRecommendations.hasRecommendations(this.currentAccount, j11)) {
                    z10 = true;
                }
            }
        }
        if (this.f35923a1 != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f35923a1));
            TLRPC.UserFull userFull8 = this.f36043r2;
            if (userFull8 != null && userFull8.saved_music != null && (this.m0 == null || this.f36022o1)) {
                this.E4 = true;
            }
            if (this.f36076w3 < 0 && this.f36083x3 < 0) {
                if (this.E4 || this.M5 != null || this.W == null) {
                    int i14 = this.J2;
                    this.J2 = i14 + 1;
                    this.f36083x3 = i14;
                } else {
                    int i15 = this.J2;
                    this.J2 = i15 + 1;
                    this.f36076w3 = i15;
                }
            }
            if (!UserObject.isUserSelf(user) || this.f36022o1) {
                String publicUsername = UserObject.getPublicUsername(user);
                TLRPC.UserFull userFull9 = this.f36043r2;
                boolean z14 = ((userFull9 == null || TextUtils.isEmpty(userFull9.about)) && (user == null || TextUtils.isEmpty(publicUsername))) ? false : true;
                boolean z15 = (user == null || (TextUtils.isEmpty(user.phone) && TextUtils.isEmpty(this.Z4))) ? false : true;
                if (!this.f36016n2 && (userFull4 = this.f36043r2) != null && userFull4.unofficial_security_risk) {
                    int i16 = this.J2;
                    this.f35963f4 = i16;
                    this.J2 = i16 + 2;
                    this.f35970g4 = i16 + 1;
                }
                TLRPC.UserFull userFull10 = this.f36043r2;
                if (userFull10 != null && (userFull10.flags2 & 64) != 0 && (((c6Var = this.f36051s2) == null || !c6Var.f24158c || !c6Var.d.isEmpty()) && (chat = getMessagesController().getChat(Long.valueOf(this.f36043r2.personal_channel_id))) != null && (ChatObject.isPublic(chat) || !ChatObject.isNotInChat(chat)))) {
                    int i17 = this.J2;
                    this.M2 = i17;
                    this.J2 = i17 + 2;
                    this.N2 = i17 + 1;
                }
                int i18 = this.J2;
                if (!this.f36016n2 && (z15 || !z14)) {
                    this.J2 = i18 + 1;
                    this.C3 = i18;
                }
                TLRPC.UserFull userFull11 = this.f36043r2;
                if (userFull11 != null && !TextUtils.isEmpty(userFull11.about)) {
                    int i19 = this.J2;
                    this.J2 = i19 + 1;
                    this.F3 = i19;
                }
                if (user != null && publicUsername != null) {
                    int i20 = this.J2;
                    this.J2 = i20 + 1;
                    this.H3 = i20;
                }
                TLRPC.UserFull userFull12 = this.f36043r2;
                if (userFull12 != null) {
                    if (userFull12.birthday != null) {
                        int i21 = this.J2;
                        this.J2 = i21 + 1;
                        this.Q2 = i21;
                    }
                    if (userFull12.business_work_hours != null) {
                        int i22 = this.J2;
                        this.J2 = i22 + 1;
                        this.K3 = i22;
                    }
                    if (userFull12.business_location != null) {
                        int i23 = this.J2;
                        this.J2 = i23 + 1;
                        this.L3 = i23;
                    }
                    if (userFull12.note != null) {
                        int i24 = this.J2;
                        this.J2 = i24 + 1;
                        this.D3 = i24;
                    }
                }
                if (this.W == null && this.f35923a1 != getUserConfig().getClientUserId()) {
                    int i25 = this.J2;
                    this.J2 = i25 + 1;
                    this.J3 = i25;
                }
                boolean z16 = this.f36016n2;
                if (z16 && user != null && user.bot_has_main_app) {
                    int i26 = this.J2;
                    this.J2 = i26 + 1;
                    this.f35955e4 = i26;
                }
                int i27 = this.J2;
                int i28 = i27 + 1;
                this.J2 = i28;
                this.N3 = i27;
                if (user != null && user.linked_community_id != 0) {
                    this.f35977h4 = i28;
                    this.J2 = i27 + 3;
                    this.f35984i4 = i27 + 2;
                }
                if (z16 && (userFull3 = this.f36043r2) != null && (starrefprogram = userFull3.starref_program) != null && (starrefprogram.flags & 2) == 0 && getMessagesController().starrefConnectAllowed) {
                    int i29 = this.J2;
                    this.O3 = i29;
                    this.J2 = i29 + 2;
                    this.P3 = i29 + 1;
                }
                if (this.f36016n2) {
                    if (this.f36023o2 == null && getContext() != null) {
                        this.f36023o2 = nh.t0.e(getContext(), this.currentAccount, this.f35923a1);
                    }
                    if (this.f36030p2 == null && getContext() != null) {
                        this.f36030p2 = nh.q.c(getContext(), this.currentAccount, this.f35923a1);
                    }
                    nh.t0 t0Var = this.f36023o2;
                    boolean z17 = t0Var != null && t0Var.b();
                    nh.q qVar = this.f36030p2;
                    boolean z18 = qVar != null && qVar.a();
                    TLRPC.UserFull userFull13 = this.f36043r2;
                    if (userFull13 != null && userFull13.bot_can_manage_emoji_status) {
                        z12 = true;
                    } else if (nh.o4.d((Activity) getContext(), this.currentAccount, this.f35923a1)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12 || z17 || z18) {
                        int i30 = this.J2;
                        int i31 = i30 + 1;
                        this.J2 = i31;
                        this.f35991j4 = i30;
                        if (z12) {
                            this.J2 = i30 + 2;
                            this.botPermissionEmojiStatus = i31;
                        }
                        if (z17) {
                            int i32 = this.J2;
                            this.J2 = i32 + 1;
                            this.botPermissionLocation = i32;
                        }
                        if (z18) {
                            int i33 = this.J2;
                            this.J2 = i33 + 1;
                            this.botPermissionBiometry = i33;
                        }
                        int i34 = this.J2;
                        this.J2 = i34 + 1;
                        this.f36004l4 = i34;
                    }
                }
                TLRPC.EncryptedChat encryptedChat = this.f36095z2;
                if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                    int i35 = this.J2;
                    this.f36010m4 = i35;
                    this.f36018n4 = i35 + 1;
                    this.J2 = i35 + 3;
                    this.f36025o4 = i35 + 2;
                }
                if (user != null && !this.f36016n2 && encryptedChat == null && user.f22527id != getUserConfig().getClientUserId() && this.f35967g1) {
                    int i36 = this.J2;
                    this.G4 = i36;
                    this.J2 = i36 + 2;
                    this.I4 = i36 + 1;
                }
                if (user != null && user.bot) {
                    TLRPC.UserFull userFull14 = this.f36043r2;
                    if (userFull14 != null && userFull14.can_view_revenue && hh.c0.g(this.currentAccount).i(this.f35923a1) > 0) {
                        int i37 = this.J2;
                        this.J2 = i37 + 1;
                        this.f36091y4 = i37;
                    }
                    if (hh.c0.g(this.currentAccount).c(this.f35923a1).amount > 0 || !hh.c0.g(this.currentAccount).k(this.f35923a1).f8983a[0].isEmpty()) {
                        int i38 = this.J2;
                        this.J2 = i38 + 1;
                        this.f36084x4 = i38;
                    }
                }
                if (user == null || !this.f36016n2 || user.bot_nochats) {
                    z11 = this.f36084x4 >= 0;
                    if (!this.f36022o1 && this.Y4 && user != null && !user.contact && !user.bot && !UserObject.isService(user.f22527id)) {
                        int i39 = this.J2;
                        this.J2 = i39 + 1;
                        this.V3 = i39;
                        z11 = true;
                    }
                    if (!this.f36022o1 && this.V4 != 0 && this.W4 < 0 && ChatObject.canUserDoAdminAction(getMessagesController().getChat(Long.valueOf(-this.W4)), 13)) {
                        int i40 = this.J2;
                        this.J2 = i40 + 1;
                        this.S3 = i40;
                        z11 = true;
                    }
                    if (!this.f36022o1 || this.V4 == 0 || ContactsController.getInstance(this.currentAccount).isContact(this.f35923a1)) {
                        z13 = z11;
                    } else {
                        int i41 = this.J2;
                        this.J2 = i41 + 1;
                        this.T3 = i41;
                    }
                    if (z13) {
                        int i42 = this.J2;
                        this.J2 = i42 + 1;
                        this.U3 = i42;
                    }
                    if (!z10 || ((user != null && user.bot && user.bot_can_edit && user.bot_has_main_app) || (!((userFull2 = this.f36043r2) == null || userFull2.common_chats_count == 0) || this.f36022o1))) {
                        int i43 = this.J2;
                        this.J2 = i43 + 1;
                        this.F4 = i43;
                    } else if (this.I4 == -1 && this.f35995k1) {
                        int i44 = this.J2;
                        this.Q3 = i44;
                        this.J2 = i44 + 2;
                        this.I4 = i44 + 1;
                    }
                } else {
                    int i45 = this.J2;
                    this.W3 = i45;
                    this.J2 = i45 + 2;
                    this.X3 = i45 + 1;
                }
                if (!this.f36022o1) {
                    int i310 = this.J2;
                    this.J2 = i310 + 1;
                    this.V3 = i310;
                    z11 = true;
                }
                if (!this.f36022o1) {
                    int i46 = this.J2;
                    this.J2 = i46 + 1;
                    this.S3 = i46;
                    z11 = true;
                }
                if (this.f36022o1) {
                    z13 = z11;
                } else {
                    z13 = z11;
                }
                if (z13) {
                    int i47 = this.J2;
                    this.J2 = i47 + 1;
                    this.U3 = i47;
                }
                if (z10) {
                    int i48 = this.J2;
                    this.J2 = i48 + 1;
                    this.F4 = i48;
                } else {
                    int i49 = this.J2;
                    this.J2 = i49 + 1;
                    this.F4 = i49;
                }
            } else {
                if (this.F2 == null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null) {
                        TLRPC.FileLocation fileLocation = userProfilePhoto.photo_big;
                        if (!(fileLocation instanceof TLRPC.TL_fileLocation_layer97) && !(fileLocation instanceof TLRPC.TL_fileLocationToBeDeprecated)) {
                            my0Var = this.f35987j0;
                            if (my0Var != null || my0Var.getRealCount() == 0) {
                                int i50 = this.J2;
                                this.K2 = i50;
                                this.J2 = i50 + 2;
                                this.L2 = i50 + 1;
                            }
                        }
                    } else {
                        my0Var = this.f35987j0;
                        if (my0Var != null) {
                            int i51 = this.J2;
                            this.K2 = i51;
                            this.J2 = i51 + 2;
                            this.L2 = i51 + 1;
                        } else {
                            int i52 = this.J2;
                            this.K2 = i52;
                            this.J2 = i52 + 2;
                            this.L2 = i52 + 1;
                        }
                    }
                }
                int i53 = this.J2;
                this.O2 = i53;
                this.P2 = i53 + 1;
                this.R2 = i53 + 2;
                this.S2 = i53 + 3;
                this.J2 = i53 + 5;
                this.Z2 = i53 + 4;
                Set<String> set = getMessagesController().pendingSuggestions;
                if (set.contains("PREMIUM_GRACE")) {
                    int i54 = this.J2;
                    this.U2 = i54;
                    this.J2 = i54 + 2;
                    this.V2 = i54 + 1;
                } else if (set.contains("VALIDATE_PHONE_NUMBER")) {
                    int i55 = this.J2;
                    this.W2 = i55;
                    this.J2 = i55 + 2;
                    this.T2 = i55 + 1;
                } else if (set.contains("VALIDATE_PASSWORD")) {
                    int i56 = this.J2;
                    this.Y2 = i56;
                    this.J2 = i56 + 2;
                    this.X2 = i56 + 1;
                }
                int i57 = this.J2;
                this.a3 = i57;
                this.f35962f3 = i57 + 1;
                this.f35946d3 = i57 + 2;
                this.f35931b3 = i57 + 3;
                this.f35954e3 = i57 + 4;
                this.J2 = i57 + 6;
                this.f35976h3 = i57 + 5;
                if (getMessagesController().filtersEnabled || !getMessagesController().dialogFilters.isEmpty()) {
                    int i58 = this.J2;
                    this.J2 = i58 + 1;
                    this.f35969g3 = i58;
                }
                int i59 = this.J2;
                this.f35990j3 = i59;
                this.f35939c3 = i59 + 1;
                this.J2 = i59 + 3;
                this.f35997k3 = i59 + 2;
                if (!getMessagesController().premiumFeaturesBlocked()) {
                    int i60 = this.J2;
                    this.J2 = i60 + 1;
                    this.Y3 = i60;
                }
                if (getMessagesController().starsPurchaseAvailable()) {
                    int i61 = this.J2;
                    this.J2 = i61 + 1;
                    this.Z3 = i61;
                }
                hh.u7.y(this.currentAccount, true).p();
                if (ApplicationLoader.isBetaBuild() || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isHuaweiStoreBuild() || (hh.u7.y(this.currentAccount, true).f10154e && (hh.u7.y(this.currentAccount, true).N() || hh.u7.y(this.currentAccount, true).p().positive()))) {
                    int i62 = this.J2;
                    this.J2 = i62 + 1;
                    this.f35924a4 = i62;
                }
                if (!getMessagesController().premiumFeaturesBlocked()) {
                    int i63 = this.J2;
                    this.J2 = i63 + 1;
                    this.f35932b4 = i63;
                }
                if (!getMessagesController().premiumPurchaseBlocked()) {
                    int i64 = this.J2;
                    this.J2 = i64 + 1;
                    this.f35940c4 = i64;
                }
                if (this.Y3 >= 0 || this.Z3 >= 0 || this.f35924a4 >= 0 || this.f35932b4 >= 0 || this.f35940c4 >= 0) {
                    int i65 = this.J2;
                    this.J2 = i65 + 1;
                    this.f35947d4 = i65;
                }
                int i66 = this.J2;
                this.f36003l3 = i66;
                this.f36009m3 = i66 + 1;
                this.f36017n3 = i66 + 2;
                int i67 = i66 + 4;
                this.J2 = i67;
                this.f36024o3 = i66 + 3;
                if (BuildVars.LOGS_ENABLED || BuildVars.DEBUG_PRIVATE_VERSION) {
                    this.f36031p3 = i67;
                    this.J2 = i66 + 6;
                    this.f36037q3 = i66 + 5;
                }
                if (BuildVars.LOGS_ENABLED) {
                    int i68 = this.J2;
                    this.f36044r3 = i68;
                    this.f36052s3 = i68 + 1;
                    this.J2 = i68 + 3;
                    this.f36058t3 = i68 + 2;
                }
                if (BuildVars.DEBUG_VERSION) {
                    int i69 = this.J2;
                    this.J2 = i69 + 1;
                    this.f36064u3 = i69;
                }
                int i70 = this.J2;
                this.J2 = i70 + 1;
                this.f36070v3 = i70;
            }
        } else {
            if (!this.f36007m1) {
                if (this.f35929b1 != 0) {
                    TLRPC.ChatFull chatFull8 = this.f36036q2;
                    if ((chatFull8 != null && (!TextUtils.isEmpty(chatFull8.about) || (this.f36036q2.location instanceof TLRPC.TL_channelLocation))) || ChatObject.isPublic(this.A2)) {
                        if (this.f36076w3 < 0 && this.f36083x3 < 0) {
                            if (this.E4 || this.M5 != null || this.W == null) {
                                int i71 = this.J2;
                                this.J2 = i71 + 1;
                                this.f36083x3 = i71;
                            } else {
                                int i72 = this.J2;
                                this.J2 = i72 + 1;
                                this.f36076w3 = i72;
                            }
                        }
                        if (this.W == null) {
                            int i73 = this.J2;
                            this.J2 = i73 + 1;
                            this.f36096z3 = i73;
                        }
                        TLRPC.ChatFull chatFull9 = this.f36036q2;
                        if (chatFull9 != null) {
                            if (!TextUtils.isEmpty(chatFull9.about)) {
                                int i74 = this.J2;
                                this.J2 = i74 + 1;
                                this.G3 = i74;
                            }
                            if (this.f36036q2.location instanceof TLRPC.TL_channelLocation) {
                                int i75 = this.J2;
                                this.J2 = i75 + 1;
                                this.E3 = i75;
                            }
                        }
                        if (ChatObject.isPublic(this.A2)) {
                            int i76 = this.J2;
                            this.J2 = i76 + 1;
                            this.H3 = i76;
                        }
                    }
                    if (this.f36076w3 < 0 && this.f36083x3 < 0) {
                        if (this.E4 || this.M5 != null || this.W == null) {
                            int i77 = this.J2;
                            this.J2 = i77 + 1;
                            this.f36083x3 = i77;
                        } else {
                            int i78 = this.J2;
                            this.J2 = i78 + 1;
                            this.f36076w3 = i78;
                        }
                    }
                    if (this.W == null) {
                        if (this.f36096z3 != -1) {
                            int i79 = this.J2;
                            this.J2 = i79 + 1;
                            this.I3 = i79;
                        }
                        int i80 = this.J2;
                        this.J2 = i80 + 1;
                        this.J3 = i80;
                    }
                    int i81 = this.J2;
                    if (i81 > 0) {
                        this.J2 = i81 + 1;
                        this.N3 = i81;
                    }
                    TLRPC.Chat chat2 = this.A2;
                    if (chat2 != null && chat2.linked_community_id != 0) {
                        int i82 = this.J2;
                        this.f35977h4 = i82;
                        this.J2 = i82 + 2;
                        this.f35984i4 = i82 + 1;
                    }
                    if (ChatObject.isChannel(chat2)) {
                        TLRPC.Chat chat3 = this.A2;
                        if (chat3.megagroup) {
                            chatFull = this.f36036q2;
                            if ((chatFull == null && chatFull.can_view_stars_revenue && (hh.c0.g(this.currentAccount).c(-this.f35929b1).amount > 0 || !hh.c0.g(this.currentAccount).k(-this.f35929b1).f8983a[0].isEmpty())) || ((chatFull2 = this.f36036q2) != null && chatFull2.can_view_revenue && hh.c0.g(this.currentAccount).i(-this.f35929b1) > 0)) {
                                int i83 = this.J2;
                                this.f36097z4 = i83;
                                this.J2 = i83 + 2;
                                this.A4 = i83 + 1;
                            }
                        } else {
                            TLRPC.ChatFull chatFull10 = this.f36036q2;
                            if (chatFull10 != null && (chat3.creator || chatFull10.can_view_participants)) {
                                if (this.W == null) {
                                    int i84 = this.J2;
                                    this.J2 = i84 + 1;
                                    this.f36032p4 = i84;
                                }
                                int i85 = this.J2;
                                int i86 = i85 + 1;
                                this.J2 = i86;
                                this.f36059t4 = i85;
                                if (chatFull10.requests_pending > 0) {
                                    this.J2 = i85 + 2;
                                    this.f36065u4 = i86;
                                }
                                int i87 = this.J2;
                                int i88 = i87 + 1;
                                this.J2 = i88;
                                this.v4 = i87;
                                if (chatFull10.banned_count != 0 || chatFull10.kicked_count != 0) {
                                    this.J2 = i87 + 2;
                                    this.C4 = i88;
                                }
                                if ((chatFull10.can_view_stars_revenue && (hh.c0.g(this.currentAccount).c(-this.f35929b1).amount > 0 || !hh.c0.g(this.currentAccount).k(-this.f35929b1).f8983a[0].isEmpty())) || ((chatFull5 = this.f36036q2) != null && chatFull5.can_view_revenue && hh.c0.g(this.currentAccount).i(-this.f35929b1) > 0)) {
                                    int i89 = this.J2;
                                    this.J2 = i89 + 1;
                                    this.f36097z4 = i89;
                                }
                                int i90 = this.J2;
                                this.f36077w4 = i90;
                                this.J2 = i90 + 2;
                                this.A4 = i90 + 1;
                            }
                        }
                    } else {
                        chatFull = this.f36036q2;
                        if (chatFull == null) {
                            int i810 = this.J2;
                            this.f36097z4 = i810;
                            this.J2 = i810 + 2;
                            this.A4 = i810 + 1;
                        } else {
                            int i811 = this.J2;
                            this.f36097z4 = i811;
                            this.J2 = i811 + 2;
                            this.A4 = i811 + 1;
                        }
                    }
                    if (ChatObject.isChannel(this.A2)) {
                        if (this.f36007m1 || (chatFull4 = this.f36036q2) == null || !this.A2.megagroup || (chatParticipants2 = chatFull4.participants) == null || (arrayList = chatParticipants2.participants) == null || arrayList.isEmpty()) {
                            if (!ChatObject.isNotInChat(this.A2) && ChatObject.canAddUsers(this.A2) && (chatFull3 = this.f36036q2) != null && chatFull3.participants_hidden) {
                                int i91 = this.J2;
                                this.f36053s4 = i91;
                                this.J2 = i91 + 2;
                                this.D4 = i91 + 1;
                            }
                            hz0 hz0Var = this.K;
                            if (hz0Var != null) {
                                hz0Var.n1();
                            }
                        } else {
                            if (!ChatObject.isNotInChat(this.A2) && ChatObject.canAddUsers(this.A2) && this.f36036q2.participants_count < getMessagesController().maxMegagroupCount) {
                                int i92 = this.J2;
                                this.J2 = i92 + 1;
                                this.f36053s4 = i92;
                            }
                            int size = this.f36036q2.participants.participants.size();
                            if ((size <= 5 || !z10 || this.O4 == 1) && this.O4 != 2) {
                                if (this.f36053s4 == -1 && this.W == null) {
                                    int i93 = this.J2;
                                    this.J2 = i93 + 1;
                                    this.f36032p4 = i93;
                                }
                                int i94 = this.J2;
                                this.f36038q4 = i94;
                                int i95 = i94 + size;
                                this.f36045r4 = i95;
                                this.J2 = i95 + 1;
                                this.D4 = i95;
                                arrayList2.addAll(this.f36036q2.participants.participants);
                                ArrayList arrayList4 = this.f36089y2;
                                if (arrayList4 != null) {
                                    arrayList3.addAll(arrayList4);
                                }
                                this.O4 = 1;
                                hz0 hz0Var2 = this.K;
                                if (hz0Var2 != null) {
                                    hz0Var2.a1(null, null);
                                }
                            } else {
                                if (this.f36053s4 != -1) {
                                    int i96 = this.J2;
                                    this.J2 = i96 + 1;
                                    this.D4 = i96;
                                }
                                if (this.K != null) {
                                    if (!this.f36089y2.isEmpty()) {
                                        this.O4 = 2;
                                    }
                                    this.K.a1(this.f36089y2, this.f36036q2);
                                }
                            }
                        }
                        if (this.I4 == -1) {
                            TLRPC.Chat chat4 = this.A2;
                            if (chat4.left && !chat4.kicked) {
                                long j12 = MessagesController.getNotificationsSettings(this.currentAccount).getLong("dialog_join_requested_time_" + this.f35952e1, -1L);
                                if (j12 <= 0 || System.currentTimeMillis() - j12 >= 120000) {
                                    org.telegram.ui.Components.rg0 rg0Var2 = this.W;
                                    if (rg0Var2 == null || !rg0Var2.f()) {
                                        int i97 = this.J2;
                                        this.H4 = i97;
                                        this.J2 = i97 + 2;
                                        this.I4 = i97 + 1;
                                    }
                                }
                            }
                        }
                        if (z10) {
                            int i98 = this.J2;
                            this.J2 = i98 + 1;
                            this.F4 = i98;
                        }
                    } else {
                        TLRPC.ChatFull chatFull11 = this.f36036q2;
                        if (chatFull11 != null) {
                            if (this.f36007m1 || (chatParticipants = chatFull11.participants) == null || chatParticipants.participants == null || (chatParticipants instanceof TLRPC.TL_chatParticipantsForbidden)) {
                                if (!ChatObject.isNotInChat(this.A2) && ChatObject.canAddUsers(this.A2) && this.f36036q2.participants_hidden) {
                                    int i99 = this.J2;
                                    this.f36053s4 = i99;
                                    this.J2 = i99 + 2;
                                    this.D4 = i99 + 1;
                                }
                                hz0 hz0Var3 = this.K;
                                if (hz0Var3 != null) {
                                    hz0Var3.n1();
                                }
                            } else {
                                if (ChatObject.canAddUsers(this.A2) || (tL_chatBannedRights = this.A2.default_banned_rights) == null || !tL_chatBannedRights.invite_users) {
                                    int i100 = this.J2;
                                    this.J2 = i100 + 1;
                                    this.f36053s4 = i100;
                                }
                                if (this.f36036q2.participants.participants.size() <= 5 || !z10) {
                                    if (this.f36053s4 == -1 && this.W == null) {
                                        int i101 = this.J2;
                                        this.J2 = i101 + 1;
                                        this.f36032p4 = i101;
                                    }
                                    int i102 = this.J2;
                                    this.f36038q4 = i102;
                                    int size2 = this.f36036q2.participants.participants.size() + i102;
                                    this.f36045r4 = size2;
                                    this.J2 = size2 + 1;
                                    this.D4 = size2;
                                    arrayList2.addAll(this.f36036q2.participants.participants);
                                    ArrayList arrayList5 = this.f36089y2;
                                    if (arrayList5 != null) {
                                        arrayList3.addAll(arrayList5);
                                    }
                                    hz0 hz0Var4 = this.K;
                                    if (hz0Var4 != null) {
                                        hz0Var4.a1(null, null);
                                    }
                                } else {
                                    if (this.f36053s4 != -1) {
                                        int i103 = this.J2;
                                        this.J2 = i103 + 1;
                                        this.D4 = i103;
                                    }
                                    hz0 hz0Var5 = this.K;
                                    if (hz0Var5 != null) {
                                        hz0Var5.a1(this.f36089y2, this.f36036q2);
                                    }
                                }
                            }
                        }
                    }
                    z13 = false;
                    if (z10) {
                        int i910 = this.J2;
                        this.J2 = i910 + 1;
                        this.F4 = i910;
                    }
                }
                if (this.F4 == -1) {
                    int i104 = this.J2;
                    this.J2 = i104 + 1;
                    this.f36090y3 = i104;
                }
                if (this.actionBar != null) {
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (this.actionBar.getOccupyStatusBar()) {
                        i11 = AndroidUtilities.statusBarHeight;
                    } else {
                        i11 = 0;
                    }
                    i10 = currentActionBarHeight + i11;
                } else {
                    i10 = 0;
                }
                if (this.f35921a != null || i12 > this.J2) {
                    this.f36087y0 = 0;
                } else {
                    int i105 = this.A0;
                    if (i105 != 0) {
                        if (T3() + i105 + i10 < this.f35921a.getMeasuredHeight()) {
                            this.f36087y0 = 0;
                        }
                    }
                }
                by0Var = this.f35921a;
                if (by0Var != null) {
                    by0Var.setTranslateSelectorPosition(this.K3);
                }
                rg0Var = this.W;
                if (rg0Var != null) {
                    rg0Var.o(7, z13);
                }
                jh0Var = this.Y;
                if (jh0Var != null) {
                    userFull = this.f36043r2;
                    if (userFull != null) {
                        jh0Var.setMusicDocument(userFull.saved_music);
                    }
                    this.Y.setVisibility(this.E4 ? 0 : 8);
                }
            }
            if (this.f36076w3 < 0 && this.f36083x3 < 0) {
                if (this.E4 || this.M5 != null || this.W == null) {
                    int i106 = this.J2;
                    this.J2 = i106 + 1;
                    this.f36083x3 = i106;
                } else {
                    int i107 = this.J2;
                    this.J2 = i107 + 1;
                    this.f36076w3 = i107;
                }
            }
            int i108 = this.J2;
            int i109 = i108 + 1;
            this.J2 = i109;
            this.H3 = i108;
            if (this.W == null) {
                this.J2 = i108 + 2;
                this.M3 = i109;
            }
            int i110 = this.J2;
            int i111 = i110 + 1;
            this.J2 = i111;
            this.N3 = i110;
            if (z10) {
                this.J2 = i110 + 2;
                this.F4 = i111;
            }
        }
        z13 = false;
        if (this.F4 == -1) {
            int i1010 = this.J2;
            this.J2 = i1010 + 1;
            this.f36090y3 = i1010;
        }
        if (this.actionBar != null) {
            int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            i10 = currentActionBarHeight2 + i11;
        } else {
            i10 = 0;
        }
        if (this.f35921a != null) {
            this.f36087y0 = 0;
        } else {
            this.f36087y0 = 0;
        }
        by0Var = this.f35921a;
        if (by0Var != null) {
            by0Var.setTranslateSelectorPosition(this.K3);
        }
        rg0Var = this.W;
        if (rg0Var != null) {
            rg0Var.o(7, z13);
        }
        jh0Var = this.Y;
        if (jh0Var != null) {
            userFull = this.f36043r2;
            if (userFull != null) {
                jh0Var.setMusicDocument(userFull.saved_music);
            }
            this.Y.setVisibility(this.E4 ? 0 : 8);
        }
    }

    public final void k4(boolean z10) {
        org.telegram.ui.Components.n9 currentItemView;
        float f10;
        NotchInfoUtils.NotchInfo notchInfo;
        boolean z11;
        float f11;
        int i10;
        ValueAnimator valueAnimator;
        NotchInfoUtils.NotchInfo notchInfo2;
        TLRPC.ChatFull chatFull;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        float fY3 = y3();
        by0 by0Var = this.f35921a;
        if (by0Var != null && !this.C1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) by0Var.getLayoutParams();
            if (layoutParams.topMargin != currentActionBarHeight) {
                layoutParams.topMargin = currentActionBarHeight;
                this.f35921a.setLayoutParams(layoutParams);
            }
        }
        n5(z10);
        if (this.U != null) {
            this.f35921a.setTopGlowOffset((int) this.M1);
            this.f35921a.setOverScrollMode((this.M1 <= ((float) T3()) || this.M1 >= ((float) ((O3() + this.f35921a.getMeasuredWidth()) - currentActionBarHeight))) ? 0 : 2);
        }
        if (this.U != null && !this.I5 && this.C1) {
            x3();
            return;
        }
        int iT3 = T3();
        if (this.U != null) {
            if (this.W != null && this.f35929b1 != 0) {
                this.W.o(2, (!ChatObject.isChannel(this.A2) || this.A2.megagroup || (chatFull = this.f36036q2) == null || chatFull.linked_chat_id == 0) ? false : true);
            }
            n5(z10);
            float translationY = this.actionBar.getTranslationY() + ((((fY3 + 1.0f) * (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f)) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.dp(21.0f));
            if (this.C1) {
                this.W1 = translationY;
            } else {
                float fCenterY = -AndroidUtilities.dp(29.0f);
                org.telegram.ui.Components.gh0 gh0Var = this.f36028p0;
                if (gh0Var != null && (notchInfo2 = gh0Var.f28631n) != null && notchInfo2.isLikelyCircle) {
                    fCenterY = notchInfo2.bounds.centerY();
                }
                this.W1 = AndroidUtilities.lerp(fCenterY, this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.dp(21.0f)), fY3);
            }
            float f12 = this.C1 ? this.N1 : this.M1;
            float f13 = iT3;
            org.telegram.ui.ActionBar.h5[] h5VarArr = this.f36040r;
            org.telegram.ui.ActionBar.h5[] h5VarArr2 = this.f35958f;
            if (f12 > f13 || this.f36002l2) {
                float fMax = Math.max(0.0f, Math.min(1.0f, (f12 - f13) / ((this.f35921a.getMeasuredWidth() - currentActionBarHeight) - U3())));
                this.f35945d2 = fMax;
                this.X1 = (AndroidUtilities.lerp(2.2857144f, 3.2857144f, Math.min(1.0f, fMax * 3.0f)) / 100.0f) * 42.0f;
                this.Y1 = 0.0f;
                oy0 oy0Var = this.f36034q0;
                if (oy0Var != null) {
                    oy0Var.invalidate();
                }
                hh.v0 v0Var = this.f36041r0;
                if (v0Var != null) {
                    v0Var.invalidate();
                }
                float fMin = Math.min(AndroidUtilities.dpf2(2000.0f), Math.max(AndroidUtilities.dpf2(1100.0f), Math.abs(this.f35953e2))) / AndroidUtilities.dpf2(1100.0f);
                O3();
                boolean z12 = this.f35996k2;
                float[] fArr = this.f35982i2;
                if (!z12 || (!this.B0 && this.f35945d2 < 0.33f)) {
                    if (this.f36002l2) {
                        this.f36002l2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
                        org.telegram.ui.ActionBar.v0 v0Var2 = this.P0;
                        if (v0Var2 != null) {
                            v0Var2.r(21);
                            if (this.m0 != null) {
                                this.P0.r(33);
                                this.P0.r(34);
                                this.P0.r(35);
                                this.P0.K(36);
                                this.P0.K(31);
                            }
                        }
                        org.telegram.ui.ActionBar.v0 v0Var3 = this.Q0;
                        if (v0Var3 != null) {
                            v0Var3.setEnabled(!this.f36068v1);
                        }
                        this.J.f(fMin, false);
                        this.f35994k0.b(fMin);
                        this.f35961f2.cancel();
                        this.f35922a0.getImageReceiver().setAllowStartAnimation(true);
                        this.f35922a0.getImageReceiver().startAnimation();
                        float fLerp = AndroidUtilities.lerp(fArr, this.f35975h2);
                        fArr[0] = fLerp;
                        fArr[1] = 0.0f;
                        this.f35961f2.setInterpolator(org.telegram.ui.Components.er.f28125j);
                        if (this.f35989j2) {
                            this.f35961f2.setDuration(0L);
                        } else {
                            this.f35961f2.setDuration((long) ((fLerp * 250.0f) / fMin));
                        }
                        this.Z0.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f22999a7, this.f36067v0));
                        if (!this.D0 && (currentItemView = this.f35987j0.getCurrentItemView()) != null) {
                            if (currentItemView.getImageReceiver().getDrawable() instanceof org.telegram.ui.Components.w51) {
                                this.f35922a0.T = false;
                            } else {
                                ly0 ly0Var = this.f35922a0;
                                ly0Var.T = true;
                                ly0Var.setForegroundImageDrawable(currentItemView.getImageReceiver().getDrawableSafe());
                            }
                        }
                        this.f35961f2.addListener(new yy0(this, 3));
                        this.f35922a0.setForegroundAlpha(1.0f);
                        this.U.setVisibility(0);
                        this.f35987j0.setAlpha(0.0f);
                        this.f35961f2.start();
                        this.L1 = false;
                        try {
                            try {
                                this.U.performHapticFeedback(3, 1);
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                        }
                    }
                    this.U.setScaleX(this.X1);
                    this.U.setScaleY(this.X1);
                    N3();
                    ValueAnimator valueAnimator2 = this.f35961f2;
                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                        D4();
                        h5VarArr2[1].setTranslationY(this.a2);
                        h5VarArr[1].setTranslationX(W3(this.f35930b2));
                        h5VarArr[1].setTranslationY(X3(this.f35938c2));
                        this.f36048s.setTranslationX(this.f35930b2);
                        this.f36048s.setTranslationY(this.f35938c2);
                        V4();
                    }
                } else {
                    if (!this.f36002l2) {
                        if (this.P0 != null) {
                            if (g4()) {
                                this.P0.r(21);
                            } else {
                                this.P0.K(21);
                            }
                            if (this.m0 != null) {
                                this.P0.K(36);
                                this.P0.K(34);
                                this.P0.K(35);
                                this.P0.r(33);
                                this.P0.r(31);
                            }
                        }
                        org.telegram.ui.ActionBar.v0 v0Var4 = this.Q0;
                        if (v0Var4 != null) {
                            v0Var4.setEnabled(false);
                        }
                        this.f36002l2 = true;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
                        this.J.f(fMin, true);
                        this.f35994k0.b(fMin);
                        this.f35987j0.setCreateThumbFromParent(true);
                        this.f35987j0.getAdapter().g();
                        this.f35961f2.cancel();
                        float fLerp2 = AndroidUtilities.lerp(fArr, this.f35975h2);
                        fArr[0] = fLerp2;
                        fArr[1] = 1.0f;
                        oy0 oy0Var2 = this.f36034q0;
                        if (oy0Var2 == null || oy0Var2.f36222w.isEmpty()) {
                            this.f35961f2.setInterpolator(org.telegram.ui.Components.er.f28125j);
                            this.f35961f2.setDuration((long) (((1.0f - fLerp2) * 250.0f) / fMin));
                        } else {
                            this.f35961f2.setInterpolator(new u1.a());
                            this.f35961f2.setDuration((long) ((((1.0f - fLerp2) * 1.3f) * 250.0f) / fMin));
                        }
                        this.f35961f2.addListener(new yy0(this, 2));
                        View viewM = this.f35935c.m(0);
                        if (!this.L1 && viewM != null) {
                            this.K1 = true;
                            this.f35921a.w0(((viewM.getTop() - this.f35921a.getMeasuredWidth()) - O3()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0), (int) this.f35961f2.getDuration(), (Interpolator) this.f35961f2.getInterpolator());
                            this.f35921a.J0 = false;
                        }
                        this.G5 = h5VarArr2[1].getTranslationY();
                        this.H5 = h5VarArr[1].getTranslationY();
                        this.f35961f2.start();
                        this.f35987j0.setAlpha(0.0f);
                        this.f35987j0.setVisibility(0);
                        try {
                            this.U.performHapticFeedback(0, 1);
                        } catch (Exception unused3) {
                        }
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.f35987j0.getLayoutParams();
                    int i11 = layoutParams2.height;
                    layoutParams2.width = this.f35921a.getMeasuredWidth();
                    float f14 = currentActionBarHeight + f12;
                    int i12 = (int) f14;
                    layoutParams2.height = i12;
                    if (i11 != i12) {
                        this.f35987j0.requestLayout();
                    }
                    if (!this.f35961f2.isRunning()) {
                        float fDp = (this.C1 && this.F1 == 2) ? (-(1.0f - this.O1)) * AndroidUtilities.dp(50.0f) : 0.0f;
                        h5VarArr2[1].setTranslationX(AndroidUtilities.dpf2(18.0f) - h5VarArr2[1].getLeft());
                        h5VarArr2[1].setTranslationY((((f14 - O3()) - AndroidUtilities.dpf2(30.0f)) - h5VarArr2[1].getBottom()) + fDp);
                        h5VarArr[1].setTranslationX(W3(AndroidUtilities.dpf2(16.0f) - h5VarArr[1].getLeft()));
                        h5VarArr[1].setTranslationY(X3((((f14 - O3()) - AndroidUtilities.dpf2(10.0f)) - h5VarArr[1].getBottom()) + fDp));
                        this.f36048s.setTranslationX(h5VarArr[1].getTranslationX());
                        this.f36048s.setTranslationY(h5VarArr[1].getTranslationY());
                        V4();
                    }
                }
            }
            boolean z13 = this.C1;
            if (z13 && this.F1 == 2) {
                float f15 = this.K5;
                float translationY2 = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.density * 21.0f));
                h5VarArr2[0].setTranslationX((this.K5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f));
                double d = translationY2;
                h5VarArr2[0].setTranslationY(((float) Math.floor(d)) + AndroidUtilities.dp(1.3f));
                h5VarArr[0].setTranslationX((this.K5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f));
                h5VarArr[0].setTranslationY(((float) Math.floor(d)) + AndroidUtilities.dp(24.0f));
                h5VarArr2[0].setScaleX(1.0f);
                h5VarArr2[0].setScaleY(1.0f);
                org.telegram.ui.ActionBar.h5 h5Var = h5VarArr2[1];
                h5Var.setPivotY(h5Var.getMeasuredHeight());
                h5VarArr2[1].setScaleX(1.38f);
                h5VarArr2[1].setScaleY(1.38f);
                this.X1 = AndroidUtilities.lerp(42, 138, this.O1) / 100.0f;
                this.Y1 = 0.0f;
                oy0 oy0Var3 = this.f36034q0;
                if (oy0Var3 != null) {
                    oy0Var3.setExpandProgress(1.0f);
                }
                hh.v0 v0Var5 = this.f36041r0;
                if (v0Var5 != null) {
                    v0Var5.setExpandProgress(1.0f);
                }
                this.f35922a0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(c4(), 0.0f, this.O1));
                this.U.setTranslationX(AndroidUtilities.lerp(f15, 0.0f, this.O1));
                this.U.setTranslationY(AndroidUtilities.lerp((float) Math.ceil(d), 0.0f, this.O1));
                float measuredWidth = ((this.X1 * 100.0f) / 42.0f) * (this.U.getMeasuredWidth() - AndroidUtilities.dp(42.0f));
                this.f35943d0.setTranslationX(this.U.getX() + AndroidUtilities.dp(16.0f) + measuredWidth);
                this.f35943d0.setTranslationY(this.U.getY() + AndroidUtilities.dp(-10.0f) + measuredWidth);
                this.f35951e0.setTranslationX(this.U.getX() + AndroidUtilities.dp(28.0f) + measuredWidth);
                this.f35951e0.setTranslationY(this.U.getY() + AndroidUtilities.dp(26.5f) + measuredWidth);
                this.f35959f0.setTranslationX(this.U.getX() + AndroidUtilities.dp(28.0f) + measuredWidth);
                this.f35959f0.setTranslationY(this.U.getY() + AndroidUtilities.dp(24.0f) + measuredWidth);
                this.f35966g0.setTranslationX(this.U.getX() + AndroidUtilities.dp(28.0f) + measuredWidth);
                this.f35966g0.setTranslationY(this.U.getY() + AndroidUtilities.dp(24.0f) + measuredWidth);
                this.U.setScaleX(this.X1);
                this.U.setScaleY(this.X1);
                this.f35987j0.setAlpha(0.0f);
                this.f35987j0.setVisibility(0);
                ly0 ly0Var2 = this.f35922a0;
                float f16 = this.O1;
                float f17 = this.X1;
                ly0Var2.D = f16;
                ly0Var2.E = f17;
                ly0Var2.C = true;
                this.J.e(f16, false);
                this.actionBar.D(i0.b.d(this.O1, this.M5 != null ? -1 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23375v8, this.f36067v0), -1), false);
                org.telegram.ui.Components.ll0 ll0Var = this.H;
                if (ll0Var != null) {
                    ll0Var.b(i0.b.d(this.O1, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23127h8, this.f36067v0), Color.argb(179, 255, 255, 255)));
                }
                Drawable drawable = this.f36079x;
                if (drawable != null) {
                    drawable.setColorFilter(this.M5 == null ? i0.b.d(this.O1, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23272pc, this.f36067v0), -1) : -1, PorterDuff.Mode.MULTIPLY);
                }
                org.telegram.ui.Components.dr drVar = this.F[1];
                if (drVar != null) {
                    drVar.b(this.O1);
                    h5VarArr2[1].invalidate();
                }
                org.telegram.ui.Components.dr drVar2 = this.G[1];
                if (drVar2 != null) {
                    drVar2.b(this.O1);
                    h5VarArr2[1].invalidate();
                }
                Y4(this.O1);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.U.getLayoutParams();
                layoutParams3.width = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), this.f35921a.getMeasuredWidth() / this.X1, this.O1);
                layoutParams3.height = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), (this.M1 + currentActionBarHeight) / this.X1, this.O1);
                this.U.requestLayout();
                V4();
            } else {
                if (f12 <= f13) {
                    if (z13) {
                        this.X1 = AndroidUtilities.lerp(42, 96, fY3) / 100.0f;
                        this.Y1 = 0.0f;
                        f10 = 1.0f;
                    } else {
                        org.telegram.ui.Components.gh0 gh0Var2 = this.f36028p0;
                        this.X1 = AndroidUtilities.lerp((gh0Var2 == null || (notchInfo = gh0Var2.f28631n) == null || !notchInfo.isLikelyCircle) ? 24.0f : (notchInfo.bounds.width() * 0.5f) / AndroidUtilities.density, 96.0f, fY3) / 100.0f;
                        f10 = 1.0f;
                        this.Y1 = 1.0f - fY3;
                    }
                    org.telegram.ui.Components.rg0 rg0Var = this.W;
                    if (rg0Var != null) {
                        if (this.C1) {
                            rg0Var.setAlpha(this.O1);
                        } else {
                            rg0Var.setAlpha(f10);
                        }
                    }
                    oy0 oy0Var4 = this.f36034q0;
                    if (oy0Var4 != null) {
                        oy0Var4.invalidate();
                    }
                    hh.v0 v0Var6 = this.f36041r0;
                    if (v0Var6 != null) {
                        v0Var6.h = this.C1;
                        float fClamp01 = Utilities.clamp01((fY3 - 0.3f) / 0.7f);
                        if (v0Var6.f10192f != fClamp01) {
                            v0Var6.f10192f = fClamp01;
                            v0Var6.invalidate();
                        }
                    }
                    float f18 = (0.12f * fY3) + 1.0f;
                    ValueAnimator valueAnimator3 = this.f35961f2;
                    if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                        this.U.setScaleX(this.X1);
                        this.U.setScaleY(this.X1);
                        N3();
                        this.U.setTranslationY((float) Math.ceil(this.W1));
                        float fDp2 = (((this.X1 * 100.0f) / 42.0f) * AndroidUtilities.dp(42.0f)) - AndroidUtilities.dp(42.0f);
                        this.f35943d0.setTranslationX(this.U.getX() + AndroidUtilities.dp(16.0f) + fDp2);
                        this.f35943d0.setTranslationY(this.U.getY() + AndroidUtilities.dp(-10.0f) + fDp2);
                        this.f35951e0.setTranslationX(this.U.getX() + AndroidUtilities.dp(28.0f) + fDp2);
                        this.f35951e0.setTranslationY(this.U.getY() + AndroidUtilities.dp(26.5f) + fDp2);
                        this.f35959f0.setTranslationX(this.U.getX() + AndroidUtilities.dp(28.0f) + fDp2);
                        this.f35959f0.setTranslationY(this.U.getY() + AndroidUtilities.dp(24.0f) + fDp2);
                        this.f35966g0.setTranslationX(this.U.getX() + AndroidUtilities.dp(28.0f) + fDp2);
                        this.f35966g0.setTranslationY(this.U.getY() + AndroidUtilities.dp(24.0f) + fDp2);
                    } else {
                        ValueAnimator valueAnimator4 = this.f35961f2;
                        yy0 yy0Var = this.E5;
                        valueAnimator4.removeListener(yy0Var);
                        this.f35961f2.addListener(yy0Var);
                    }
                    float fDpf2 = ((AndroidUtilities.dpf2(8.0f) + (this.U.getScaleY() * this.U.getHeight())) * (this.C1 ? this.O1 : fY3)) + ((float) Math.floor(translationY));
                    this.a2 = com.google.android.recaptcha.internal.a.z(1.0f, this.O1, 0.0f, (AndroidUtilities.dp(7.0f) * fY3) + AndroidUtilities.dp(1.3f) + fDpf2);
                    this.f35938c2 = (((float) Math.floor(AndroidUtilities.density * 11.0f)) * fY3) + fDpf2 + AndroidUtilities.dp(24.0f);
                    float fDp3 = this.C1 ? (this.K5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f) : -AndroidUtilities.dpf2(46.0f);
                    h01 h01Var = this.X5;
                    if (h01Var != null) {
                        h01Var.setAlpha((int) (255.0f * fY3));
                    }
                    int measuredWidth2 = this.f35921a.getMeasuredWidth();
                    int i13 = 0;
                    boolean z14 = false;
                    while (i13 < h5VarArr2.length) {
                        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr2[i13];
                        if (h5Var2 == null) {
                            f11 = f18;
                        } else {
                            h5Var2.setScaleX(f18);
                            h5VarArr2[i13].setScaleY(f18);
                            if (i13 == 1) {
                                l4(0, fY3, false);
                                z14 = true;
                            }
                            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) h5VarArr2[i13].getLayoutParams();
                            float f19 = measuredWidth2;
                            float f20 = f19 / 2.0f;
                            float fMin2 = f20 - (((Math.min(h5VarArr2[i13].getExactWidth(), i13 == 1 ? layoutParams4.width : f19) * f18) * 0.5f) + layoutParams4.leftMargin);
                            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) h5VarArr[i13].getLayoutParams();
                            float f21 = layoutParams5.leftMargin;
                            float exactWidth = h5VarArr[this.f36005l5 ? 3 : i13].getExactWidth();
                            f11 = f18;
                            if (i13 == 1) {
                                f19 = layoutParams5.width;
                            }
                            float fMin3 = f20 - ((Math.min(exactWidth, f19) * 0.5f) + f21);
                            if (i13 == 1) {
                                this.Z1 = fMin2;
                                this.f35930b2 = fMin3;
                            }
                            float fLerp3 = AndroidUtilities.lerp(fDp3, fMin2, fY3);
                            float fLerp4 = AndroidUtilities.lerp(fDp3, fMin3, fY3);
                            ValueAnimator valueAnimator5 = this.f35961f2;
                            if (valueAnimator5 == null || !valueAnimator5.isRunning()) {
                                h5VarArr2[i13].setTranslationX(fLerp3);
                                h5VarArr2[i13].setTranslationY(this.a2);
                                h5VarArr[i13].setTranslationX(W3(fLerp4));
                                h5VarArr[i13].setTranslationY(X3(this.f35938c2));
                                i10 = 1;
                                if (i13 == 1) {
                                    this.f36048s.setTranslationX(fLerp4);
                                }
                            } else {
                                i10 = 1;
                            }
                            if (i13 == i10) {
                                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) h5VarArr2[i10].getLayoutParams();
                                int i14 = layoutParams6.width;
                                int iMin = Math.min(layoutParams6.width, (int) ((((AndroidUtilities.isTablet() ? AndroidUtilities.dp(490.0f) : AndroidUtilities.displaySize.x) - AndroidUtilities.dp(18.0f)) / h5VarArr2[1].getScaleX()) - (h5VarArr2[1].getTranslationX() + layoutParams6.leftMargin)));
                                layoutParams6.width = iMin;
                                if (iMin != i14) {
                                    h5VarArr2[1].requestLayout();
                                }
                            }
                        }
                        i13++;
                        f18 = f11;
                    }
                    this.f36048s.setTranslationY(this.f35938c2);
                    V4();
                    z11 = z14;
                }
                if (!z11 && ((valueAnimator = this.f35961f2) == null || !valueAnimator.isRunning())) {
                    l4(0, fY3, true);
                }
            }
            z11 = false;
            if (!z11) {
                l4(0, fY3, true);
            }
        }
        b5(currentActionBarHeight);
        if (fY3 >= 1.0f) {
            this.f35922a0.setAlpha(1.0f);
        }
    }

    public final void k5() {
        ImageView imageView;
        TLRPC.Chat chat;
        if (this.f35959f0 == null || (imageView = this.f35966g0) == null) {
            return;
        }
        if (!this.H1 || (chat = this.A2) == null || (chat.flags2 & 2048) == 0) {
            imageView.setTag(null);
            this.f35966g0.setVisibility(8);
            this.f35959f0.setTag(null);
            this.f35959f0.setVisibility(8);
            return;
        }
        imageView.setTag(1);
        this.f35966g0.setVisibility(0);
        this.f35959f0.setTag(1);
        this.f35959f0.setVisibility(0);
    }

    public final void l4(int i10, float f10, boolean z10) {
        float scaleX;
        float f11;
        int iDp;
        int i11;
        int i12;
        int iZ;
        FrameLayout.LayoutParams layoutParams;
        org.telegram.ui.ActionBar.h5[] h5VarArr;
        FrameLayout.LayoutParams layoutParams2;
        int i13;
        ValueAnimator valueAnimator;
        float f12 = this.M1;
        float fT3 = T3();
        org.telegram.ui.ActionBar.h5[] h5VarArr2 = this.f35958f;
        if (f12 <= fT3 && ((valueAnimator = this.f35961f2) == null || !valueAnimator.isRunning())) {
            if (f10 >= 1.0f) {
                scaleX = Math.max(h5VarArr2[1].getScaleX(), 1.12f);
            } else {
                scaleX = 1.0f;
                f11 = 1.12f;
            }
            if (AndroidUtilities.isTablet()) {
                iDp = AndroidUtilities.dp(490.0f);
            } else {
                iDp = AndroidUtilities.displaySize.x;
            }
            if (this.J0) {
                i11 = 48;
            } else {
                i11 = 0;
            }
            if (this.H0) {
                i11 += 48;
            }
            if (this.I0) {
                i11 += 48;
            }
            if (this.Q0 != null) {
                i11 += 48;
            }
            if (this.C1) {
                i12 = 109;
            } else {
                i12 = 47;
            }
            int iDp2 = iDp - AndroidUtilities.dp((((1.0f - this.A5) * i11) + 40.0f) + (i12 + 8));
            int i14 = (int) (iDp2 / (i10 == 0 ? scaleX : 1.0f));
            if (i10 != 0) {
                iZ = i10;
            } else {
                iZ = org.telegram.messenger.rl.z(18.0f, 2, iDp);
            }
            if (i10 == 0) {
                i10 = (int) (iZ / f11);
            }
            org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f28124i;
            int iLerp = AndroidUtilities.lerp(i14, i10, erVar.getInterpolation(f10));
            layoutParams = (FrameLayout.LayoutParams) h5VarArr2[1].getLayoutParams();
            int i15 = layoutParams.width;
            layoutParams.width = (int) Math.ceil(iLerp);
            if (z10) {
                layoutParams.width = Math.min(layoutParams.width, (int) (((iDp - AndroidUtilities.dp(18.0f)) / h5VarArr2[1].getScaleX()) - (h5VarArr2[1].getTranslationX() + layoutParams.leftMargin)));
            }
            if (z10 && layoutParams.width != i15) {
                h5VarArr2[1].requestLayout();
            }
            int iLerp2 = AndroidUtilities.lerp(iDp2, iZ, erVar.getInterpolation(f10));
            h5VarArr = this.f36040r;
            layoutParams2 = (FrameLayout.LayoutParams) h5VarArr[1].getLayoutParams();
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f36048s.getLayoutParams();
            i13 = layoutParams2.width;
            int iCeil = (int) Math.ceil(iLerp2);
            layoutParams2.width = iCeil;
            layoutParams3.width = iCeil;
            if (i13 != layoutParams2.width) {
                h5VarArr[2].getLayoutParams().width = layoutParams2.width;
                h5VarArr[2].requestLayout();
                h5VarArr[3].getLayoutParams().width = layoutParams2.width;
                h5VarArr[3].requestLayout();
                h5VarArr[1].requestLayout();
                this.f36048s.requestLayout();
            }
        }
        scaleX = h5VarArr2[1].getScaleX();
        f11 = scaleX;
        if (AndroidUtilities.isTablet()) {
            iDp = AndroidUtilities.dp(490.0f);
        } else {
            iDp = AndroidUtilities.displaySize.x;
        }
        if (this.J0) {
            i11 = 48;
        } else {
            i11 = 0;
        }
        if (this.H0) {
            i11 += 48;
        }
        if (this.I0) {
            i11 += 48;
        }
        if (this.Q0 != null) {
            i11 += 48;
        }
        if (this.C1) {
            i12 = 109;
        } else {
            i12 = 47;
        }
        int iDp3 = iDp - AndroidUtilities.dp((((1.0f - this.A5) * i11) + 40.0f) + (i12 + 8));
        int i16 = (int) (iDp3 / (i10 == 0 ? scaleX : 1.0f));
        if (i10 != 0) {
            iZ = i10;
        } else {
            iZ = org.telegram.messenger.rl.z(18.0f, 2, iDp);
        }
        if (i10 == 0) {
            i10 = (int) (iZ / f11);
        }
        org.telegram.ui.Components.er erVar2 = org.telegram.ui.Components.er.f28124i;
        int iLerp3 = AndroidUtilities.lerp(i16, i10, erVar2.getInterpolation(f10));
        layoutParams = (FrameLayout.LayoutParams) h5VarArr2[1].getLayoutParams();
        int i17 = layoutParams.width;
        layoutParams.width = (int) Math.ceil(iLerp3);
        if (z10) {
            layoutParams.width = Math.min(layoutParams.width, (int) (((iDp - AndroidUtilities.dp(18.0f)) / h5VarArr2[1].getScaleX()) - (h5VarArr2[1].getTranslationX() + layoutParams.leftMargin)));
        }
        if (z10) {
            h5VarArr2[1].requestLayout();
        }
        int iLerp4 = AndroidUtilities.lerp(iDp3, iZ, erVar2.getInterpolation(f10));
        h5VarArr = this.f36040r;
        layoutParams2 = (FrameLayout.LayoutParams) h5VarArr[1].getLayoutParams();
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f36048s.getLayoutParams();
        i13 = layoutParams2.width;
        int iCeil2 = (int) Math.ceil(iLerp4);
        layoutParams2.width = iCeil2;
        layoutParams4.width = iCeil2;
        if (i13 != layoutParams2.width) {
            h5VarArr[2].getLayoutParams().width = layoutParams2.width;
            h5VarArr[2].requestLayout();
            h5VarArr[3].getLayoutParams().width = layoutParams2.width;
            h5VarArr[3].requestLayout();
            h5VarArr[1].requestLayout();
            this.f36048s.requestLayout();
        }
    }

    public final void l5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        if ((this.f36034q0 == null && this.f36041r0 == null) || (kVar = this.actionBar) == null) {
            return;
        }
        float f10 = kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0.0f;
        float width = this.actionBar.getWidth();
        float fMax = this.actionBar.getBackButton() != null ? Math.max(0.0f, this.actionBar.getBackButton().getRight()) : 0.0f;
        if (this.actionBar.A != null) {
            for (int i10 = 0; i10 < this.actionBar.A.getChildCount(); i10++) {
                View childAt = this.actionBar.A.getChildAt(i10);
                if (childAt.getAlpha() > 0.0f && childAt.getVisibility() == 0) {
                    float left = this.actionBar.A.getLeft() + ((int) childAt.getX());
                    if (left < width) {
                        width = AndroidUtilities.lerp(width, left, childAt.getAlpha());
                    }
                }
            }
        }
        oy0 oy0Var = this.f36034q0;
        if (oy0Var != null) {
            float fA = com.google.android.recaptcha.internal.a.A(this.actionBar.getHeight(), f10, 2.0f, f10);
            boolean z11 = Math.abs(fMax - oy0Var.f36204b0) > 0.1f || Math.abs(width - oy0Var.f36206c0) > 0.1f || Math.abs(fA - oy0Var.f36207d0) > 0.1f;
            oy0Var.f36204b0 = fMax;
            oy0Var.f36206c0 = width;
            if (z10) {
                oy0Var.f36214i0.d(width, true);
            }
            oy0Var.f36207d0 = fA;
            if (z11) {
                oy0Var.invalidate();
            }
        }
        hh.v0 v0Var = this.f36041r0;
        if (v0Var != null) {
            float fA2 = com.google.android.recaptcha.internal.a.A(this.actionBar.getHeight(), f10, 2.0f, f10);
            int iU3 = U3();
            boolean z12 = Math.abs(fMax - v0Var.f10194r) > 0.1f || Math.abs(width - v0Var.f10195s) > 0.1f || Math.abs(fA2 - v0Var.v) > 0.1f;
            v0Var.f10194r = fMax;
            v0Var.f10195s = width;
            if (z10) {
                v0Var.f10198y.d(width, true);
            }
            v0Var.v = fA2;
            v0Var.f10197x = iU3 + fA2;
            if (z12) {
                v0Var.invalidate();
            }
        }
    }

    public final void m5() {
        boolean z10;
        if (this.U0 == null) {
            return;
        }
        if (this.f36095z2 == null) {
            TLRPC.UserFull userFull = this.f36043r2;
            z10 = true;
            if ((userFull == null || userFull.ttl_period <= 0) && (this.f36036q2 == null || !ChatObject.canUserDoAdminAction(this.A2, 13) || this.f36036q2.ttl_period <= 0)) {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.U0, z10, 0.8f, this.f35978h5);
    }

    public final void n4(boolean z10) {
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f35923a1));
        if (user == null) {
            return;
        }
        int i10 = 4;
        int i11 = 0;
        if (this.f36016n2 && !MessagesController.isSupportUser(user)) {
            if (!this.f35967g1 || z10) {
                org.telegram.ui.Components.y4.s(this, false, this.A2, user, this.f36095z2 != null, true, false, true, new hx0(this, user));
                return;
            } else {
                getMessagesController().unblockPeer(this.f35923a1, new gb0(this, i10));
                finishFragment();
                return;
            }
        }
        if (this.f35967g1) {
            getMessagesController().unblockPeer(this.f35923a1);
            if (org.telegram.ui.Components.mc.a(this)) {
                org.telegram.ui.Components.mc.d(this, false).j();
                return;
            }
            return;
        }
        if (this.f35974h1) {
            org.telegram.ui.Components.y4.j0(this, this.f35923a1, user, null, this.f36095z2, false, null, new ra(this, i10), this.f36067v0);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f36067v0);
        String string = LocaleController.getString(R.string.BlockUser);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string;
        b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
        alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new gx0(this, i11));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284q7, this.f36067v0));
        }
    }

    public final void n5(boolean z10) {
        boolean z11;
        TLRPC.ChatFull chatFull;
        float fY3 = y3();
        int i10 = 1;
        this.D5 = fY3 > 0.2f && !this.S1 && (this.m0 == null || this.K2 == -1);
        C3();
        org.telegram.ui.Components.ri0 ri0Var = this.v;
        if (ri0Var == null || ri0Var.getVisibility() == 8) {
            z11 = false;
        } else {
            this.v.setTranslationY((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) + this.M1) + this.P1) - AndroidUtilities.dp(29.5f));
            z11 = fY3 > 0.2f && !this.S1 && !this.f36022o1 && (this.m0 == null || this.K2 == -1);
            if (z11 && this.f35929b1 != 0) {
                z11 = (!ChatObject.isChannel(this.A2) || this.A2.megagroup || (chatFull = this.f36036q2) == null || chatFull.linked_chat_id == 0 || (this.f36096z3 == -1 && this.A3 == -1)) ? false : true;
            }
            if (!this.C1) {
                if (z11 != (this.v.getTag() == null)) {
                    if (z11) {
                        this.v.setTag(null);
                    } else {
                        this.v.setTag(0);
                    }
                    AnimatorSet animatorSet = this.f36072w;
                    if (animatorSet != null) {
                        this.f36072w = null;
                        animatorSet.cancel();
                    }
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f36072w = animatorSet2;
                        if (z11) {
                            animatorSet2.setInterpolator(new DecelerateInterpolator());
                            this.f36072w.playTogether(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.ri0, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.ri0, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.ri0, Float>) View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.f36072w.playTogether(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.ri0, Float>) View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.ri0, Float>) View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.ri0, Float>) View.ALPHA, 0.0f));
                        }
                        this.f36072w.setDuration(150L);
                        this.f36072w.addListener(new yy0(this, i10));
                        this.f36072w.start();
                    } else {
                        this.v.setScaleX(z11 ? 1.0f : 0.2f);
                        this.v.setScaleY(z11 ? 1.0f : 0.2f);
                        this.v.setAlpha(z11 ? 1.0f : 0.0f);
                    }
                }
            }
        }
        oy0 oy0Var = this.f36034q0;
        if (oy0Var != null) {
            float measuredWidth = this.V.getMeasuredWidth() - AndroidUtilities.dp(40.0f);
            int i11 = this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
            float currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f;
            oy0Var.f36209e0 = measuredWidth;
            oy0Var.f36212g0 = z11;
            oy0Var.f36211f0 = currentActionBarHeight + i11;
            oy0Var.invalidate();
        }
        hh.v0 v0Var = this.f36041r0;
        if (v0Var != null) {
            v0Var.setExpandCoords(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + this.M1 + this.P1);
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return this.F1 == 0;
    }

    public final void o4(boolean z10) {
        if (this.f35923a1 != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f35923a1));
            if (user != null) {
                TLRPC.UserFull userFull = this.f36043r2;
                org.telegram.ui.Components.voip.e2.n(user, z10, userFull != null && userFull.video_calls_available, getParentActivity(), this.f36043r2, getAccountInstance());
                return;
            }
            return;
        }
        if (this.f35929b1 != 0) {
            if (getMessagesController().getGroupCall(this.f35929b1, false) != null) {
                org.telegram.ui.Components.voip.e2.m(this.A2, null, false, null, getParentActivity(), this, getAccountInstance());
                return;
            }
            TLRPC.Chat chat = this.A2;
            AccountInstance accountInstance = getAccountInstance();
            if (getParentActivity() == null) {
                return;
            }
            org.telegram.ui.Components.k70.u(getParentActivity(), -chat.f22380id, accountInstance, new org.telegram.ui.Components.iq0(chat, this, accountInstance, 2));
        }
    }

    public final void o5() {
        org.telegram.ui.Components.wq0 wq0Var;
        org.telegram.ui.Components.vr0 vr0Var;
        org.telegram.ui.Components.p80 p80Var;
        int iV0;
        int iV1;
        this.N5.clear();
        j01 j01Var = this.Z0;
        if (j01Var != null) {
            j01Var.a(this.M5, true);
        }
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f36040r;
        org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[1];
        if (h5Var != null) {
            h5VarArr[1].setTextColor(i0.b.d(this.f35968g2, w3(h5Var.getTag() instanceof Integer ? org.telegram.ui.ActionBar.g6.v0(((Integer) h5VarArr[1].getTag()).intValue(), this.f36067v0) : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B8, this.f36067v0), Boolean.valueOf(this.F0[0])), -1275068417));
        }
        h01 h01Var = this.X5;
        if (h01Var != null) {
            h01Var.a(i0.b.d(this.f35968g2, org.telegram.ui.ActionBar.g6.l1(0.5f, org.telegram.ui.ActionBar.g6.b(0.18f, -0.1f, this.Y0)), 603979775));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.D(i0.b.d(this.A5, this.M5 != null ? -1 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23375v8, this.f36067v0), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23425y8, this.f36067v0)), false);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            MessagesController.PeerColor peerColor = this.M5;
            if (peerColor != null) {
                iV1 = 1090519039;
            } else {
                iV1 = peerColor != null ? 553648127 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23092f8, this.f36067v0);
            }
            kVar2.C(i0.b.d(this.A5, iV1, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23443z8, this.f36067v0)), false);
        }
        Drawable[] drawableArr = this.f36086y;
        if (drawableArr[1] != null) {
            MessagesController.PeerColor peerColor2 = this.M5;
            if (peerColor2 != null) {
                iV0 = org.telegram.ui.ActionBar.g6.b(0.1f, org.telegram.ui.ActionBar.g6.I.q() ? -0.1f : -0.08f, i0.b.d(0.4f, peerColor2.getColor2(), this.M5.hasColor6(org.telegram.ui.ActionBar.g6.I.q()) ? this.M5.getColor5() : this.M5.getColor3()));
            } else {
                iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, this.f36067v0);
            }
            drawableArr[1].setColorFilter(AndroidUtilities.getOffsetColor(iV0, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oi, this.f36067v0), this.A5, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        Drawable[] drawableArr2 = this.E;
        if (drawableArr2[1] != null) {
            drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(this.M5 != null ? -1 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ah, this.f36067v0), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, this.f36067v0), this.A5, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f35958f[1];
        if (h5Var2 != null) {
            h5Var2.setTextColor(i0.b.d(this.f35968g2, i0.b.d(this.A5, this.M5 != null ? -1 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.vh, this.f36067v0), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oi, this.f36067v0)), -1));
        }
        org.telegram.ui.Components.g8 g8Var = this.W0;
        if (g8Var != null && (p80Var = g8Var.f28547e) != null) {
            p80Var.invalidate();
        }
        Drawable drawable = this.f36079x;
        if (drawable != null) {
            drawable.setColorFilter(this.M5 == null ? i0.b.d(this.O1, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23272pc, this.f36067v0), -1) : -1, PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.jh0 jh0Var = this.Y;
        if (jh0Var != null) {
            jh0Var.setColor(this.M5);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f35921a, (d5.d) new ox0(this, 1));
        hz0 hz0Var = this.K;
        if (hz0Var != null && (vr0Var = hz0Var.E0) != null) {
            vr0Var.d();
        }
        hz0 hz0Var2 = this.K;
        if (hz0Var2 != null && (wq0Var = hz0Var2.R) != null) {
            wq0Var.m();
        }
        p5();
        X4();
        oy0 oy0Var = this.f36034q0;
        if (oy0Var != null) {
            oy0Var.f(true, true);
        }
        hh.v0 v0Var = this.f36041r0;
        if (v0Var != null) {
            v0Var.a();
        }
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.j40 j40Var = this.m0;
        if (j40Var != null) {
            j40Var.i(i10, i11, intent);
        }
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.I;
        if (undoView != null) {
            undoView.e(0, true);
        }
        super.onBecomeFullyHidden();
        this.T5 = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        p5();
        this.T5 = true;
        F3();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        View viewM;
        org.telegram.ui.Components.jh0 jh0Var;
        org.telegram.ui.Components.rg0 rg0Var;
        super.onConfigurationChanged(configuration);
        hz0 hz0Var = this.K;
        if (hz0Var != null) {
            hz0Var.onConfigurationChanged(configuration);
        }
        f4();
        if (this.f35989j2 && (rg0Var = this.W) != null) {
            rg0Var.i();
        }
        if (this.f35989j2 && (jh0Var = this.Y) != null) {
            jh0Var.b();
        }
        if (this.f35989j2 && this.f36002l2 && (viewM = this.f35935c.m(0)) != null) {
            this.f35921a.scrollBy(0, viewM.getTop() - T3());
        }
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new uh(this, 5));
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        org.telegram.ui.ActionBar.k actionBar;
        boolean z11;
        org.telegram.ui.ActionBar.v0 v0Var;
        Object obj;
        org.telegram.ui.ActionBar.z zVar;
        org.telegram.ui.ActionBar.v0 v0VarK;
        float f10;
        float f11;
        boolean z12;
        TLRPC.Chat chat;
        bx bxVar;
        if (!this.E0) {
            j5();
            if (this.F1 != 0 && this.I1 && !this.f36002l2 && !this.J1) {
                ImageView imageView = this.f35951e0;
                if (imageView != null) {
                    imageView.setAlpha(1.0f);
                }
                ImageView imageView2 = this.f35943d0;
                if (imageView2 != null) {
                    imageView2.setAlpha(1.0f);
                }
                ImageView imageView3 = this.f35966g0;
                if (imageView3 != null) {
                    imageView3.setAlpha(1.0f);
                    this.f35966g0.setScaleX(1.0f);
                    this.f35966g0.setScaleY(1.0f);
                }
                ImageView imageView4 = this.f35959f0;
                if (imageView4 != null) {
                    imageView4.setAlpha(1.0f);
                    this.f35959f0.setScaleX(1.0f);
                    this.f35959f0.setScaleY(1.0f);
                }
                org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
                int i10 = 2;
                if (b5Var != null && b5Var.getFragmentStack().size() >= 2) {
                    Object obj2 = (org.telegram.ui.ActionBar.n2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                    if (obj2 instanceof org.telegram.ui.Components.ng) {
                        this.f35941c5 = (org.telegram.ui.Components.ng) obj2;
                    }
                    if ((obj2 instanceof gy) && (bxVar = ((gy) obj2).B3) != null) {
                        ix ixVar = bxVar.f38296a;
                        if (com.google.android.recaptcha.internal.a.u(ixVar)) {
                            this.f35941c5 = ixVar;
                        }
                    }
                }
                Object obj3 = this.f35941c5;
                if (obj3 instanceof rn) {
                    actionBar = ((org.telegram.ui.ActionBar.n2) obj3).getActionBar();
                    actionBar.setSkipDrawChild(true);
                } else {
                    actionBar = null;
                }
                org.telegram.ui.Components.ng ngVar = this.f35941c5;
                boolean z13 = (ngVar instanceof rn) && ((rn) ngVar).f42026e != null;
                if (ngVar != null) {
                    ImageView imageView5 = this.f35951e0;
                    if (imageView5 != null) {
                        if (!(ngVar instanceof rn) || (chat = ((rn) ngVar).f42026e) == null || chat.linked_community_id == 0) {
                            imageView5.setTag(null);
                            this.f35951e0.setVisibility(8);
                        } else {
                            imageView5.setTag(1);
                            this.f35951e0.setVisibility(0);
                        }
                    }
                    if (this.f35973h0 != null) {
                        org.telegram.ui.Components.ng ngVar2 = this.f35941c5;
                        if ((ngVar2 instanceof rn) && ChatObject.isMonoForum(((rn) ngVar2).f42026e)) {
                            this.f35943d0.setTag(null);
                            this.f35943d0.setVisibility(8);
                        } else {
                            TLRPC.EncryptedChat encryptedChat = this.f36095z2;
                            if (encryptedChat != null) {
                                this.f35973h0.b(encryptedChat.ttl);
                                this.f35943d0.setTag(1);
                                this.f35943d0.setVisibility(0);
                            } else {
                                TLRPC.UserFull userFull = this.f36043r2;
                                if (userFull != null) {
                                    this.f35973h0.b(userFull.ttl_period);
                                    if (!this.G1 || this.f36043r2.ttl_period == 0) {
                                        this.f35943d0.setTag(null);
                                        this.f35943d0.setVisibility(8);
                                    } else {
                                        this.f35943d0.setTag(1);
                                        this.f35943d0.setVisibility(0);
                                    }
                                } else {
                                    TLRPC.ChatFull chatFull = this.f36036q2;
                                    if (chatFull != null) {
                                        this.f35973h0.b(chatFull.ttl_period);
                                        if (!this.G1 || this.f36036q2.ttl_period == 0) {
                                            this.f35943d0.setTag(null);
                                            this.f35943d0.setVisibility(8);
                                        } else {
                                            this.f35943d0.setTag(1);
                                            this.f35943d0.setVisibility(0);
                                        }
                                    } else {
                                        this.f35943d0.setTag(null);
                                        this.f35943d0.setVisibility(8);
                                    }
                                }
                            }
                        }
                    }
                    k5();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(this.F1 == 2 ? 250L : 180L);
                this.f35921a.setLayerType(2, null);
                org.telegram.ui.ActionBar.z zVarN = this.actionBar.n();
                if (zVarN.k(10) == null && this.L0 == null) {
                    this.L0 = zVarN.a(10, R.drawable.ic_ab_other);
                }
                org.telegram.ui.ActionBar.h5[] h5VarArr = this.f35958f;
                org.telegram.ui.ActionBar.h5[] h5VarArr2 = this.f36040r;
                if (z10) {
                    this.K5 = 0.0f;
                    int i11 = 0;
                    while (i11 < 2) {
                        i11++;
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) h5VarArr2[i11].getLayoutParams();
                        layoutParams.rightMargin = (int) ((AndroidUtilities.density * (-21.0f)) + AndroidUtilities.dp(8.0f));
                        h5VarArr2[i11].setLayoutParams(layoutParams);
                    }
                    if (this.F1 != 2) {
                        int iCeil = (int) Math.ceil((AndroidUtilities.density * 21.0f) + (AndroidUtilities.displaySize.x - AndroidUtilities.dp(117.0f)));
                        float fMeasureText = (h5VarArr[1].getPaint().measureText(h5VarArr[1].getText().toString()) * 1.12f) + h5VarArr[1].getSideDrawablesSize();
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) h5VarArr[1].getLayoutParams();
                        float f12 = iCeil;
                        if (f12 < fMeasureText) {
                            layoutParams2.width = (int) Math.ceil(f12 / 1.12f);
                        } else {
                            layoutParams2.width = -2;
                        }
                        h5VarArr[1].setLayoutParams(layoutParams2);
                        this.N1 = T3();
                    } else {
                        h5VarArr = h5VarArr;
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) h5VarArr[1].getLayoutParams();
                        layoutParams3.width = (int) ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(32.0f)) / 1.38f);
                        h5VarArr[1].setLayoutParams(layoutParams3);
                    }
                    this.fragmentView.setBackgroundColor(0);
                    setAvatarAnimationProgress(0.0f);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this, "avatarAnimationProgress", 0.0f, 1.0f));
                    org.telegram.ui.Components.ri0 ri0Var = this.v;
                    if (ri0Var != null && ri0Var.getTag() == null) {
                        this.v.setScaleX(0.2f);
                        this.v.setScaleY(0.2f);
                        this.v.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.ri0, Float>) View.SCALE_X, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.ri0, Float>) View.SCALE_Y, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.ri0, Float>) View.ALPHA, 1.0f));
                    }
                    oy0 oy0Var = this.f36034q0;
                    if (oy0Var != null && this.F1 == 2) {
                        oy0Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f36034q0, (Property<oy0, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.F1 == 2) {
                        this.f36014n0 = P3(this.f35922a0.getImageReceiver());
                        h5VarArr[1].setTextColor(-1);
                        h5VarArr2[1].setTextColor(-1275068417);
                        this.actionBar.C(1090519039, false);
                        h01 h01Var = this.X5;
                        if (h01Var != null) {
                            h01Var.a(603979775);
                        }
                        wz0 wz0Var = this.J;
                        wz0Var.A = true;
                        wz0Var.setVisibility(0);
                    }
                    int i12 = 0;
                    while (i12 < 2) {
                        h5VarArr[i12].setAlpha(i12 == 0 ? 1.0f : 0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(h5VarArr[i12], (Property<org.telegram.ui.ActionBar.h5, Float>) View.ALPHA, i12 == 0 ? 0.0f : 1.0f));
                        i12++;
                    }
                    if (this.f36034q0 == null) {
                        f10 = 1.0f;
                    } else if (a() > 0) {
                        this.f36034q0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f36034q0, (Property<oy0, Float>) View.ALPHA, 1.0f));
                        f10 = 1.0f;
                    } else {
                        f10 = 1.0f;
                        this.f36034q0.setAlpha(1.0f);
                        this.f36034q0.setFragmentTransitionProgress(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f36034q0, "fragmentTransitionProgress", 1.0f));
                    }
                    hh.v0 v0Var2 = this.f36041r0;
                    if (v0Var2 != null) {
                        v0Var2.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f36041r0, (Property<hh.v0, Float>) View.ALPHA, f10));
                    }
                    if (this.f35943d0.getTag() != null) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f35943d0, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f35943d0, (Property<ImageView, Float>) View.SCALE_X, 0.85f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f35943d0, (Property<ImageView, Float>) View.SCALE_Y, 0.85f, 0.0f));
                    }
                    if (this.f35951e0.getTag() != null) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f35951e0, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f35951e0, (Property<ImageView, Float>) View.SCALE_X, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f35951e0, (Property<ImageView, Float>) View.SCALE_Y, 1.0f, 0.0f));
                    }
                    if (this.f35966g0.getTag() != null) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f35966g0, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f35966g0, (Property<ImageView, Float>) View.SCALE_X, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f35966g0, (Property<ImageView, Float>) View.SCALE_Y, 1.0f, 0.0f));
                    }
                    if (this.f35959f0.getTag() != null) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f35959f0, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f35959f0, (Property<ImageView, Float>) View.SCALE_X, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f35959f0, (Property<ImageView, Float>) View.SCALE_Y, 1.0f, 0.0f));
                    }
                    org.telegram.ui.ActionBar.v0 v0Var3 = this.L0;
                    if (v0Var3 != null) {
                        v0Var3.setAlpha(1.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.L0, (Property<org.telegram.ui.ActionBar.v0, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.H0 && (this.f35929b1 != 0 || z13)) {
                        this.M0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.M0, (Property<org.telegram.ui.ActionBar.v0, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.I0) {
                        this.N0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.N0, (Property<org.telegram.ui.ActionBar.v0, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.J0) {
                        this.O0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.O0, (Property<org.telegram.ui.ActionBar.v0, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.U0.getTag() != null) {
                        this.U0.setAlpha(0.0f);
                        f11 = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(this.U0, (Property<ImageView, Float>) View.ALPHA, 1.0f));
                    } else {
                        f11 = 1.0f;
                    }
                    ly0 ly0Var = this.f35922a0;
                    if (ly0Var != null) {
                        ly0Var.setCrossfadeProgress(f11);
                        arrayList.add(ObjectAnimator.ofFloat(this.f35922a0, iz0.f39189c0, 0.0f));
                    }
                    org.telegram.ui.Components.ng ngVar3 = this.f35941c5;
                    if (ngVar3 != null) {
                        org.telegram.ui.Components.rn rnVarP = ngVar3.p();
                        if (rnVarP != null) {
                            org.telegram.ui.Components.nn nnVar = rnVarP.f32217e;
                            org.telegram.ui.Components.zu0 zu0VarB = this.f35941c5.B();
                            RectF rectF = qg.j.h;
                            qg.j.c(nnVar, zu0VarB, rectF);
                            this.K5 = rectF.left;
                        }
                        if ((rnVarP == null || !(rnVarP.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.h5) || ((org.telegram.ui.ActionBar.h5) rnVarP.getSubtitleTextView()).getLeftDrawable() == null) && !rnVarP.O[0]) {
                            z12 = false;
                        } else {
                            this.S4 = rnVarP.getSubtitleTextView();
                            this.V.invalidate();
                            h5VarArr2[0].setAlpha(0.0f);
                            h5VarArr2[1].setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(h5VarArr2[1], (Property<org.telegram.ui.ActionBar.h5, Float>) View.ALPHA, 1.0f));
                            z12 = true;
                        }
                        setAvatarAnimationProgress(0.0f);
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        int i13 = 0;
                        while (i13 < 2) {
                            h5VarArr2[i13].setAlpha(i13 == 0 ? 1.0f : 0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(h5VarArr2[i13], (Property<org.telegram.ui.ActionBar.h5, Float>) View.ALPHA, i13 == 0 ? 0.0f : 1.0f));
                            i13++;
                        }
                    }
                    animatorSet.playTogether(arrayList);
                } else {
                    this.N1 = this.M1;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(ObjectAnimator.ofFloat(this, "avatarAnimationProgress", 1.0f, 0.0f));
                    org.telegram.ui.Components.ri0 ri0Var2 = this.v;
                    if (ri0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(ri0Var2, (Property<org.telegram.ui.Components.ri0, Float>) View.SCALE_X, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.ri0, Float>) View.SCALE_Y, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.ri0, Float>) View.ALPHA, 0.0f));
                    }
                    int i14 = 0;
                    while (i14 < 2) {
                        arrayList2.add(ObjectAnimator.ofFloat(h5VarArr[i14], (Property<org.telegram.ui.ActionBar.h5, Float>) View.ALPHA, i14 == 0 ? 1.0f : 0.0f));
                        i14++;
                    }
                    oy0 oy0Var2 = this.f36034q0;
                    if (oy0Var2 != null) {
                        if (this.f35952e1 > 0) {
                            arrayList2.add(ObjectAnimator.ofFloat(oy0Var2, (Property<oy0, Float>) View.ALPHA, 0.0f));
                        } else {
                            arrayList2.add(ObjectAnimator.ofFloat(oy0Var2, "fragmentTransitionProgress", 0.0f));
                        }
                    }
                    hh.v0 v0Var4 = this.f36041r0;
                    if (v0Var4 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(v0Var4, (Property<hh.v0, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.f35943d0.getTag() != null) {
                        this.f35943d0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.f35943d0, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f35943d0, (Property<ImageView, Float>) View.SCALE_X, 0.0f, 0.85f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f35943d0, (Property<ImageView, Float>) View.SCALE_Y, 0.0f, 0.85f));
                    }
                    if (this.f35951e0.getTag() != null) {
                        this.f35951e0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.f35951e0, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f35951e0, (Property<ImageView, Float>) View.SCALE_X, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f35951e0, (Property<ImageView, Float>) View.SCALE_Y, 0.0f, 1.0f));
                    }
                    if (this.f35966g0.getTag() != null) {
                        this.f35966g0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.f35966g0, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f35966g0, (Property<ImageView, Float>) View.SCALE_X, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f35966g0, (Property<ImageView, Float>) View.SCALE_Y, 0.0f, 1.0f));
                    }
                    if (this.f35959f0.getTag() != null) {
                        this.f35959f0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.f35959f0, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f35959f0, (Property<ImageView, Float>) View.SCALE_X, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f35959f0, (Property<ImageView, Float>) View.SCALE_Y, 0.0f, 1.0f));
                    }
                    org.telegram.ui.ActionBar.v0 v0Var5 = this.L0;
                    if (v0Var5 != null) {
                        v0Var5.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.L0, (Property<org.telegram.ui.ActionBar.v0, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.H0 && (this.f35929b1 != 0 || z13)) {
                        this.M0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.M0, (Property<org.telegram.ui.ActionBar.v0, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.I0) {
                        this.N0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.N0, (Property<org.telegram.ui.ActionBar.v0, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.J0) {
                        this.O0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.O0, (Property<org.telegram.ui.ActionBar.v0, Float>) View.ALPHA, 0.0f));
                    }
                    ImageView imageView6 = this.U0;
                    if (imageView6 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(imageView6, (Property<ImageView, Float>) View.ALPHA, imageView6.getAlpha(), 0.0f));
                    }
                    ly0 ly0Var2 = this.f35922a0;
                    if (ly0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(ly0Var2, iz0.f39189c0, 1.0f));
                    }
                    org.telegram.ui.ActionBar.n2 n2Var = this.parentLayout.getFragmentStack().size() > 1 ? (org.telegram.ui.ActionBar.n2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) : null;
                    if (n2Var instanceof rn) {
                        rn rnVar = (rn) n2Var;
                        fj fjVar = rnVar.W0;
                        AndroidUtilities.doOnPreDraw(fjVar, new bf0(this, fjVar, rnVar, 24));
                        View subtitleTextView = fjVar.getSubtitleTextView();
                        if ((!(subtitleTextView instanceof org.telegram.ui.ActionBar.h5) || ((org.telegram.ui.ActionBar.h5) subtitleTextView).getLeftDrawable() == null) && !fjVar.O[0]) {
                            z11 = false;
                        } else {
                            this.S4 = fjVar.getSubtitleTextView();
                            this.V.invalidate();
                            org.telegram.ui.ActionBar.h5 h5Var = h5VarArr2[0];
                            Property property = View.ALPHA;
                            arrayList2.add(ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property, 0.0f));
                            arrayList2.add(ObjectAnimator.ofFloat(h5VarArr2[1], (Property<org.telegram.ui.ActionBar.h5, Float>) property, 0.0f));
                            z11 = true;
                        }
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        int i15 = 0;
                        while (i15 < 2) {
                            arrayList2.add(ObjectAnimator.ofFloat(h5VarArr2[i15], (Property<org.telegram.ui.ActionBar.h5, Float>) View.ALPHA, i15 == 0 ? 1.0f : 0.0f));
                            i15++;
                        }
                    }
                    animatorSet.playTogether(arrayList2);
                    n01 n01Var = this.Y5;
                    if (n01Var != null) {
                        n01Var.animate().alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.er.h).start();
                    }
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new lx0(this, i10));
                animatorSet.playTogether(valueAnimatorOfFloat);
                if (this.K0 == null || (obj = this.f35941c5) == null || (zVar = ((org.telegram.ui.ActionBar.n2) obj).getActionBar().A) == null || (v0VarK = zVar.k(32)) == null || v0VarK.getVisibility() != 0) {
                    v0Var = null;
                } else {
                    v0VarK.setAlpha(0.0f);
                    if (z10) {
                        this.K0.setVisibility(0);
                    }
                    this.K0.setTag(v0VarK);
                    v0Var = v0VarK;
                }
                animatorSet.addListener(new org.telegram.ui.Components.ls(this, actionBar, v0Var, runnable, 3));
                animatorSet.setInterpolator(this.F1 == 2 ? org.telegram.ui.Components.er.f28122f : new DecelerateInterpolator());
                AndroidUtilities.runOnUIThread(new lt0(animatorSet, 4), 50L);
                return animatorSet;
            }
        }
        return null;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        by0 by0Var = this.f35921a;
        if (by0Var != null) {
            by0Var.f1();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        long clientUserId;
        org.telegram.ui.Components.zt0 zt0Var;
        vz0 vz0Var;
        int iDp;
        this.f35923a1 = this.arguments.getLong("user_id", 0L);
        this.f35929b1 = this.arguments.getLong("chat_id", 0L);
        this.f35937c1 = this.arguments.getLong("topic_id", 0L);
        this.f35944d1 = this.arguments.getBoolean("saved", false);
        this.f36015n1 = this.arguments.getBoolean("similar", false);
        this.f36007m1 = this.f35937c1 != 0;
        this.A1 = this.arguments.getLong("ban_chat_id", 0L);
        this.V4 = this.arguments.getInt("report_reaction_message_id", 0);
        this.W4 = this.arguments.getLong("report_reaction_from_dialog_id", 0L);
        this.Y4 = this.arguments.getBoolean("show_add_to_contacts", true);
        this.Z4 = oe.b.d(this.arguments.getString("vcard_phone"), false);
        this.f35925a5 = this.arguments.getString("vcard_first_name");
        this.f35933b5 = this.arguments.getString("vcard_last_name");
        this.f35974h1 = this.arguments.getBoolean("reportSpam", false);
        this.f36022o1 = this.arguments.getBoolean("my_profile", false);
        this.f36029p1 = this.arguments.getBoolean("open_gifts", false);
        this.f36042r1 = this.arguments.getBoolean("open_gifts_upgradable", false);
        this.f36035q1 = this.arguments.getInt("open_gifts_collection", 0);
        this.f36056t1 = this.arguments.getBoolean("open_common", false);
        this.f36062u1 = this.arguments.getInt("open_story_album_id", -1);
        this.E0 = this.arguments.getBoolean("hasMainTabs", false);
        if (!this.f35988j1) {
            boolean z10 = this.arguments.getBoolean("expandPhoto", false);
            this.f35988j1 = z10;
            if (z10) {
                this.f35968g2 = 1.0f;
                this.f35995k1 = true;
            }
        }
        if (this.f35923a1 == 0) {
            if (this.f35929b1 != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f35929b1));
                this.A2 = chat;
                if (chat == null) {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    getMessagesStorage().getStorageQueue().postRunnable(new zs0(15, this, countDownLatch));
                    try {
                        countDownLatch.await();
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                    if (this.A2 != null) {
                        getMessagesController().putChat(this.A2, true);
                    }
                }
                FlagSecureReason flagSecureReason = this.T1;
                if (flagSecureReason != null) {
                    flagSecureReason.invalidate();
                }
                if (this.A2.megagroup) {
                    R3(true);
                } else {
                    this.f36088y1 = null;
                }
                getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
                getNotificationCenter().addObserver(this, NotificationCenter.chatOnlineCountDidLoad);
                getNotificationCenter().addObserver(this, NotificationCenter.groupCallUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.channelRightsUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.chatWasBoostedByUser);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.uploadStoryEnd);
                this.f36089y2 = new ArrayList();
                h5(true);
                if (this.f36036q2 == null) {
                    this.f36036q2 = getMessagesController().getChatFull(this.f35929b1);
                }
                if (ChatObject.isChannel(this.A2)) {
                    getMessagesController().loadFullChat(this.f35929b1, this.classGuid, true);
                } else if (this.f36036q2 == null) {
                    this.f36036q2 = getMessagesStorage().loadChatInfo(this.f35929b1, false, null, false, false);
                }
                a5();
                clientUserId = getUserConfig().getClientUserId();
                if (this.f35923a1 != clientUserId) {
                    this.f36022o1 = true;
                } else {
                    this.f36022o1 = true;
                }
                zt0Var = this.N;
                if (zt0Var != null) {
                    zt0Var.b(this);
                    this.N = null;
                }
                if (this.N == null) {
                    this.N = new org.telegram.ui.Components.zt0(this);
                }
                this.N.f35357x.add(this);
                getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
                getNotificationCenter().addObserver(this, NotificationCenter.didReceiveNewMessages);
                getNotificationCenter().addObserver(this, NotificationCenter.closeChats);
                getNotificationCenter().addObserver(this, NotificationCenter.closeProfileActivity);
                getNotificationCenter().addObserver(this, NotificationCenter.topicsDidLoaded);
                getNotificationCenter().addObserver(this, NotificationCenter.updateSearchSettings);
                getNotificationCenter().addObserver(this, NotificationCenter.reloadDialogPhotos);
                getNotificationCenter().addObserver(this, NotificationCenter.storiesUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.storiesReadUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
                getNotificationCenter().addObserver(this, NotificationCenter.starBalanceUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.botStarsUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
                getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
                getNotificationCenter().addObserver(this, NotificationCenter.channelRecommendationsLoaded);
                getNotificationCenter().addObserver(this, NotificationCenter.starUserGiftsLoaded);
                getNotificationCenter().addObserver(this, NotificationCenter.profileMusicUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.updatedChatRanks);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
                j5();
                vz0Var = this.d;
                if (vz0Var != null) {
                    vz0Var.l();
                }
                if (this.arguments.containsKey("preload_messages")) {
                    getMessagesController().ensureMessagesLoaded(this.f35923a1, 0, null);
                }
                if (this.f35923a1 != 0) {
                    getConnectionsManager().sendRequest(new TL_account.getPassword(), new px0(this, 5));
                }
                setBulletinDelegate(new y8(this, 8));
                if (this.f35923a1 != 0) {
                    getMessagesController().getContentSettings(null);
                }
                I4();
                if (this.E0) {
                    iDp = AndroidUtilities.dp(72.0f);
                } else {
                    iDp = 0;
                }
                this.f35965f6 = iDp;
                this.f35972g6 = this.E0 ? AndroidUtilities.dp(64.0f) : 0;
                return true;
            }
            return false;
        }
        long j10 = this.arguments.getLong("dialog_id", 0L);
        this.f35952e1 = j10;
        if (j10 != 0) {
            this.f36095z2 = org.telegram.messenger.y1.n(getMessagesController(), this.f35952e1);
        }
        FlagSecureReason flagSecureReason2 = this.T1;
        if (flagSecureReason2 != null) {
            flagSecureReason2.invalidate();
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f35923a1));
        if (user != null) {
            getNotificationCenter().addObserver(this, NotificationCenter.contactsDidLoad);
            getNotificationCenter().addObserver(this, NotificationCenter.newSuggestionsAvailable);
            getNotificationCenter().addObserver(this, NotificationCenter.encryptedChatCreated);
            getNotificationCenter().addObserver(this, NotificationCenter.encryptedChatUpdated);
            getNotificationCenter().addObserver(this, NotificationCenter.blockedUsersDidLoad);
            getNotificationCenter().addObserver(this, NotificationCenter.botInfoDidLoad);
            getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
            getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.reloadInterface);
            this.f35967g1 = getMessagesController().blockePeers.indexOfKey(this.f35923a1) >= 0;
            if (user.bot) {
                this.f36016n2 = true;
                MediaDataController mediaDataController = getMediaDataController();
                long j11 = user.f22527id;
                mediaDataController.loadBotInfo(j11, j11, true, this.classGuid);
            }
            this.f36043r2 = getMessagesController().getUserFull(this.f35923a1);
            getMessagesController().loadFullUser(getMessagesController().getUser(Long.valueOf(this.f35923a1)), this.classGuid, true);
            this.f36088y1 = null;
            if (UserObject.isUserSelf(user)) {
                org.telegram.ui.Components.j40 j40Var = new org.telegram.ui.Components.j40(0, true, true);
                this.m0 = j40Var;
                j40Var.D = true;
                j40Var.f29569a = this;
                j40Var.f29570b = this;
                getMediaDataController().checkFeaturedStickers();
                getMessagesController().loadSuggestedFilters();
                getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, this.classGuid);
            }
            this.T4 = this.arguments.getInt("actionBarColor", 0);
            clientUserId = getUserConfig().getClientUserId();
            if ((this.f35923a1 != clientUserId || this.f35952e1 == clientUserId) && !this.f36022o1) {
                this.f36022o1 = true;
            }
            zt0Var = this.N;
            if (zt0Var != null && zt0Var.f35355s != this.f35937c1) {
                zt0Var.b(this);
                this.N = null;
            }
            if (this.N == null) {
                this.N = new org.telegram.ui.Components.zt0(this);
            }
            this.N.f35357x.add(this);
            getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
            getNotificationCenter().addObserver(this, NotificationCenter.didReceiveNewMessages);
            getNotificationCenter().addObserver(this, NotificationCenter.closeChats);
            getNotificationCenter().addObserver(this, NotificationCenter.closeProfileActivity);
            getNotificationCenter().addObserver(this, NotificationCenter.topicsDidLoaded);
            getNotificationCenter().addObserver(this, NotificationCenter.updateSearchSettings);
            getNotificationCenter().addObserver(this, NotificationCenter.reloadDialogPhotos);
            getNotificationCenter().addObserver(this, NotificationCenter.storiesUpdated);
            getNotificationCenter().addObserver(this, NotificationCenter.storiesReadUpdated);
            getNotificationCenter().addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
            getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
            getNotificationCenter().addObserver(this, NotificationCenter.starBalanceUpdated);
            getNotificationCenter().addObserver(this, NotificationCenter.botStarsUpdated);
            getNotificationCenter().addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
            getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
            getNotificationCenter().addObserver(this, NotificationCenter.channelRecommendationsLoaded);
            getNotificationCenter().addObserver(this, NotificationCenter.starUserGiftsLoaded);
            getNotificationCenter().addObserver(this, NotificationCenter.profileMusicUpdated);
            getNotificationCenter().addObserver(this, NotificationCenter.updatedChatRanks);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            j5();
            vz0Var = this.d;
            if (vz0Var != null) {
                vz0Var.l();
            }
            if (this.arguments.containsKey("preload_messages")) {
                getMessagesController().ensureMessagesLoaded(this.f35923a1, 0, null);
            }
            if (this.f35923a1 != 0 && UserObject.isUserSelf(getMessagesController().getUser(Long.valueOf(this.f35923a1)))) {
                getConnectionsManager().sendRequest(new TL_account.getPassword(), new px0(this, 5));
            }
            setBulletinDelegate(new y8(this, 8));
            if (this.f35923a1 != 0 && UserObject.isUserSelf(getMessagesController().getUser(Long.valueOf(this.f35923a1))) && !this.f36022o1) {
                getMessagesController().getContentSettings(null);
            }
            I4();
            if (this.E0) {
                iDp = AndroidUtilities.dp(72.0f);
            } else {
                iDp = 0;
            }
            this.f35965f6 = iDp;
            this.f35972g6 = this.E0 ? AndroidUtilities.dp(64.0f) : 0;
            return true;
        }
        return false;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        hz0 hz0Var = this.K;
        if (hz0Var != null) {
            hz0Var.F0();
        }
        org.telegram.ui.Components.zt0 zt0Var = this.N;
        if (zt0Var != null) {
            zt0Var.b(this);
        }
        org.telegram.ui.Components.zt0 zt0Var2 = this.N;
        if (zt0Var2 != null) {
            zt0Var2.f35357x.remove(this);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.closeChats);
        getNotificationCenter().removeObserver(this, NotificationCenter.closeProfileActivity);
        getNotificationCenter().removeObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().removeObserver(this, NotificationCenter.topicsDidLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateSearchSettings);
        getNotificationCenter().removeObserver(this, NotificationCenter.reloadDialogPhotos);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesReadUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.botStarsUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.channelRecommendationsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.profileMusicUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.updatedChatRanks);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        my0 my0Var = this.f35987j0;
        if (my0Var != null) {
            my0Var.K();
        }
        org.telegram.ui.Components.tg0 tg0Var = this.f35980i0;
        if (tg0Var != null) {
            tg0Var.e();
        }
        this.F5 = null;
        if (this.f35923a1 != 0) {
            getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
            getNotificationCenter().removeObserver(this, NotificationCenter.contactsDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatCreated);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.blockedUsersDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.botInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.reloadInterface);
            getMessagesController().cancelLoadFullUser(this.f35923a1);
        } else if (this.f35929b1 != 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.uploadStoryEnd);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatOnlineCountDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.channelRightsUpdated);
        }
        ly0 ly0Var = this.f35922a0;
        if (ly0Var != null) {
            ly0Var.setImageDrawable(null);
        }
        org.telegram.ui.Components.j40 j40Var = this.m0;
        if (j40Var != null) {
            j40Var.e();
        }
        qy0 qy0Var = this.R4;
        if (qy0Var != null) {
            qy0Var.b();
        }
        k01 k01Var = this.f36063u2;
        if (k01Var != null && this.f36057t2) {
            k01Var.b(true);
            this.f36063u2 = null;
        }
        org.telegram.messenger.t8 t8Var = this.f36060t5;
        if (t8Var != null) {
            this.f36060t5 = null;
            AndroidUtilities.runOnUIThread(t8Var);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onPause() {
        org.telegram.ui.Components.ms0 ms0Var;
        super.onPause();
        UndoView undoView = this.I;
        if (undoView != null) {
            undoView.e(0, true);
        }
        org.telegram.ui.Components.j40 j40Var = this.m0;
        if (j40Var != null) {
            j40Var.j();
        }
        FlagSecureReason flagSecureReason = this.T1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        hz0 hz0Var = this.K;
        if (hz0Var == null || (ms0Var = hz0Var.P) == null) {
            return;
        }
        ms0Var.f42980e = false;
        if (ms0Var.f42979c != null) {
            ms0Var.f42977a.onPause();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.j40 j40Var = this.m0;
        if (j40Var != null) {
            j40Var.k(i10, strArr, iArr);
        }
        if (i10 != 101 && i10 != 102) {
            if (i10 != 103 || this.A2 == null) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= iArr.length) {
                    z11 = true;
                    break;
                } else {
                    if (iArr[i11] != 0) {
                        z11 = false;
                        break;
                    }
                    i11++;
                }
            }
            if (iArr.length <= 0 || !z11) {
                org.telegram.ui.Components.voip.e2.i(getParentActivity(), null, i10);
                return;
            } else {
                org.telegram.ui.Components.voip.e2.m(this.A2, null, getMessagesController().getGroupCall(this.f35929b1, false) == null, null, getParentActivity(), this, getAccountInstance());
                return;
            }
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f35923a1));
        if (user == null) {
            return;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= iArr.length) {
                z10 = true;
                break;
            } else {
                if (iArr[i12] != 0) {
                    z10 = false;
                    break;
                }
                i12++;
            }
        }
        if (iArr.length <= 0 || !z10) {
            org.telegram.ui.Components.voip.e2.i(getParentActivity(), null, i10);
            return;
        }
        boolean z12 = i10 == 102;
        TLRPC.UserFull userFull = this.f36043r2;
        org.telegram.ui.Components.voip.e2.n(user, z12, userFull != null && userFull.video_calls_available, getParentActivity(), this.f36043r2, getAccountInstance());
    }

    @Override
    public final void onResume() {
        TLRPC.User user;
        aj0 aj0Var;
        super.onResume();
        hz0 hz0Var = this.K;
        if (hz0Var != null) {
            hz0Var.X0 = true;
            org.telegram.ui.Components.ls0 ls0Var = hz0Var.D;
            if (ls0Var != null) {
                ls0Var.l();
            }
            org.telegram.ui.Components.ut0 ut0Var = hz0Var.G;
            if (ut0Var != null) {
                ut0Var.l();
            }
            org.telegram.ui.Components.vt0 vt0Var = hz0Var.F;
            if (vt0Var != null) {
                vt0Var.X(false);
            }
            for (int i10 = 0; i10 < hz0Var.f29122g0.length; i10++) {
                hz0Var.U(i10);
            }
            org.telegram.ui.Components.ms0 ms0Var = hz0Var.P;
            if (ms0Var != null) {
                ms0Var.f42980e = true;
                if (ms0Var.f42979c != null) {
                    ms0Var.f42977a.onResume();
                }
            }
        }
        f4();
        vz0 vz0Var = this.d;
        if (vz0Var != null) {
            this.P4 = true;
            vz0Var.l();
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (aj0Var = this.Q) != null && aj0Var.getVisibility() == 0) {
            this.Q.setVisibility(8);
            this.Q.setBackground(null);
        }
        org.telegram.ui.Components.j40 j40Var = this.m0;
        if (j40Var != null) {
            j40Var.l();
            setParentActivityTitle(LocaleController.getString(R.string.Settings));
        }
        i5(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new uh(this, 5));
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.f35958f[1];
        if (h5Var != null) {
            setParentActivityTitle(h5Var.getText());
        }
        if (this.f35923a1 != 0 && (user = getMessagesController().getUser(Long.valueOf(this.f35923a1))) != null && user.photo == null && this.M1 >= T3()) {
            this.f35961f2.cancel();
            float[] fArr = this.f35982i2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            J4(1.0f);
            this.f35987j0.setVisibility(8);
            this.M1 = T3();
            this.f35996k2 = false;
            this.f35935c.h1(0, T3() - this.f35921a.getPaddingTop());
        }
        FlagSecureReason flagSecureReason = this.T1;
        if (flagSecureReason != null) {
            flagSecureReason.attach();
        }
        c5();
        k4(false);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            if (!z11) {
                int i10 = this.F1;
                if (i10 != 0 && this.I1) {
                    if (i10 == 1) {
                        this.f35968g2 = 0.0f;
                        org.telegram.ui.Components.sv0 sv0Var = this.P;
                        if (sv0Var != null) {
                            sv0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.rg0 rg0Var = this.W;
                        if (rg0Var != null) {
                            rg0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.jh0 jh0Var = this.Y;
                        if (jh0Var != null) {
                            jh0Var.setParentExpanded(0.0f);
                        }
                    }
                    this.C1 = false;
                    A3();
                    if (this.E1) {
                        D3(true);
                    }
                }
                if (!this.f35978h5) {
                    this.f35978h5 = true;
                    this.Q4 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().onAnimationFinish(this.L4);
            aj0 aj0Var = this.Q;
            if (aj0Var != null && aj0Var.getVisibility() == 0) {
                this.Q.setVisibility(8);
                this.Q.setBackground(null);
            }
        }
        this.D1 = false;
        B3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        super.onTransitionAnimationProgress(z10, f10);
        aj0 aj0Var = this.Q;
        if (aj0Var == null || aj0Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            this.Q.setAlpha(1.0f - f10);
        } else {
            this.Q.setAlpha(f10);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        ImageView imageView;
        org.telegram.ui.Components.rg0 rg0Var;
        super.onTransitionAnimationStart(z10, z11);
        this.I5 = z10;
        if (z10 && (rg0Var = this.W) != null) {
            ArrayList arrayList = rg0Var.f32157a;
            if (rg0Var.D == 6) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.ui.Components.og0 og0Var = (org.telegram.ui.Components.og0) arrayList.get(i10);
                    org.telegram.ui.Components.oi0 oi0Var = og0Var.f31288k;
                    if (oi0Var != null) {
                        if (og0Var.f31280a == 15) {
                            oi0Var.K(14);
                        } else {
                            oi0Var.K(0);
                        }
                        og0Var.f31288k.start();
                    }
                }
            }
        }
        if (!z10 && (imageView = this.K0) != null && imageView.getTag() != null && (this.K0.getTag() instanceof org.telegram.ui.ActionBar.v0)) {
            ((org.telegram.ui.ActionBar.v0) this.K0.getTag()).setAlpha(1.0f);
        }
        if (((!z10 && z11) || (z10 && !z11)) && this.F1 != 0 && this.I1 && !this.f36002l2) {
            this.C1 = true;
            if (!z10) {
                if (this.F5 == null) {
                    this.F5 = new float[16];
                }
                this.B1 = this.M1;
                this.F5[0] = this.U.getScaleX();
                this.F5[1] = this.U.getTranslationX();
                this.F5[2] = this.U.getTranslationY();
                org.telegram.ui.Components.rg0 rg0Var2 = this.W;
                if (rg0Var2 != null) {
                    this.F5[3] = rg0Var2.getAlpha();
                }
                hh.v0 v0Var = this.f36041r0;
                if (v0Var != null) {
                    float[] fArr = this.F5;
                    fArr[4] = v0Var.f10191e;
                    fArr[5] = v0Var.f10192f;
                }
                h01 h01Var = this.X5;
                if (h01Var != null) {
                    this.F5[6] = h01Var.getAlpha();
                }
                float[] fArr2 = this.F5;
                org.telegram.ui.ActionBar.h5[] h5VarArr = this.f35958f;
                fArr2[7] = h5VarArr[1].getScaleX();
                this.F5[8] = h5VarArr[1].getTranslationY();
                float[] fArr3 = this.F5;
                org.telegram.ui.ActionBar.h5[] h5VarArr2 = this.f36040r;
                fArr3[9] = h5VarArr2[1].getTranslationY();
                this.F5[10] = h5VarArr[1].getLayoutParams().width;
                this.F5[11] = this.Y1;
                for (int i11 = 0; i11 < h5VarArr.length; i11++) {
                    org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[i11];
                    if (h5Var != null) {
                        int i12 = i11 * 2;
                        this.F5[i12 + 12] = h5Var.getTranslationX();
                        this.F5[i12 + 13] = h5VarArr2[i11].getTranslationX();
                    }
                }
                lh.w3 w3Var = this.Z5;
                if (w3Var != null) {
                    w3Var.e(true);
                }
            }
        }
        if (z10) {
            if (this.m0 != null) {
                this.L4 = getNotificationCenter().setAnimationInProgress(this.L4, new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaCountsDidLoad, NotificationCenter.userInfoDidLoad, NotificationCenter.needCheckSystemBarColors});
            } else {
                this.L4 = getNotificationCenter().setAnimationInProgress(this.L4, new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaCountsDidLoad, NotificationCenter.needCheckSystemBarColors});
            }
            if (!z11 && getParentActivity() != null) {
                this.U4 = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.D1 = true;
        B3();
    }

    public final void p4() {
        TLRPC.UserFull userFull = this.f36043r2;
        if (userFull == null || !UserObject.areGiftsDisabled(userFull)) {
            if (this.A2 != null) {
                org.telegram.ui.Components.y30.ChannelGiftHint.a();
            }
            showDialog(new gh.k2(getParentActivity(), this.currentAccount, a(), null, null));
        } else {
            org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
            if (n2VarU != null) {
                org.telegram.ui.Components.mc.a0(n2VarU).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(a())))).j();
            }
        }
    }

    public final void p5() {
        if (this.v == null) {
            return;
        }
        try {
            Drawable drawableMutate = this.fragmentView.getContext().getResources().getDrawable(R.drawable.floating_shadow_profile).mutate();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
            int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.xh, this.f36067v0);
            int iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.yh, this.f36067v0);
            int iV2 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wh, this.f36067v0);
            if (this.M5 != null && org.telegram.ui.ActionBar.g6.b1(iV0)) {
                iV0 = org.telegram.ui.ActionBar.g6.b(0.05f, -0.04f, this.M5.getBgColor1(false));
                MessagesController.PeerColor peerColor = this.M5;
                if (peerColor != null) {
                    int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.g6.I.q());
                    iV1 = org.telegram.ui.ActionBar.g6.C(org.telegram.ui.ActionBar.g6.I.q(), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23373v6, this.f36067v0), bgColor2, iV1, bgColor2);
                }
                iV2 = -1;
            }
            org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(drawableMutate, org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(56.0f), iV0, iV1), 0, 0);
            int iDp = AndroidUtilities.dp(56.0f);
            int iDp2 = AndroidUtilities.dp(56.0f);
            dqVar.f27823e = iDp;
            dqVar.f27824f = iDp2;
            this.v.setBackground(dqVar);
            this.v.setColorFilter(new PorterDuffColorFilter(iV2, mode));
        } catch (Exception unused) {
        }
    }

    public final void q4(boolean z10) {
        boolean[] zArr = {true};
        getMessagesController().addUserToChat(this.A2.f22380id, getUserConfig().getCurrentUser(), 0, null, this, true, new op0(this, z10, zArr, 3), new l9.b(this, zArr, z10, this.parentLayout.getLastFragment(), 5));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
    }

    @Override
    public final boolean r() {
        return this.I5;
    }

    public final void r4(View view, float f10, float f11, boolean z10) {
        float x8;
        float height;
        long j10;
        long j11 = this.f35952e1;
        if (j11 == 0) {
            j11 = this.f35923a1;
            if (j11 == 0) {
                j11 = -this.f35929b1;
            }
        }
        long j12 = j11;
        boolean zIsDialogMuted = getMessagesController().isDialogMuted(j12, this.f35937c1);
        if (z10 && (this.f36007m1 || zIsDialogMuted)) {
            boolean z11 = !zIsDialogMuted;
            getNotificationsController().muteDialog(j12, this.f35937c1, z11);
            org.telegram.ui.Components.mc.A(this, z11, null).j();
            a5();
            this.W.setNotifications(zIsDialogMuted);
            return;
        }
        if ((z10 || !LocaleController.isRTL || f10 > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f10 < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
            org.telegram.ui.Components.co coVar = new org.telegram.ui.Components.co(getParentActivity(), this.currentAccount, null, true, new f2.c(this, j12, 8), this.f36067v0);
            coVar.d(j12, this.f35937c1, this.f35948d5);
            if (AndroidUtilities.isTablet()) {
                ViewGroup view2 = this.parentLayout.getView();
                x8 = view2.getX() + view2.getPaddingLeft() + f10;
                height = view2.getY() + view2.getPaddingTop() + f11;
            } else {
                x8 = f10;
                height = f11;
            }
            if (z10) {
                height += this.W.getHeight() - AndroidUtilities.dp(12.0f);
            }
            coVar.c(this, view, x8, height, z10);
            return;
        }
        org.telegram.ui.Cells.g5 g5Var = (org.telegram.ui.Cells.g5) view;
        boolean z12 = g5Var.f24392e.h;
        boolean z13 = !z12;
        boolean zIsGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(j12, false, false);
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j12, this.f35937c1);
        if (z12) {
            SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            if (zIsGlobalNotificationsEnabled) {
                editorEdit.putInt("notify2_" + sharedPrefKey, 2);
                j10 = 1;
            } else {
                editorEdit.remove("notify2_" + sharedPrefKey);
                j10 = 0L;
            }
            getNotificationsController().removeNotificationsForDialog(j12);
            if (this.f35937c1 == 0) {
                getMessagesStorage().setDialogFlags(j12, j10);
                TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j12);
                if (dialog != null) {
                    TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                    dialog.notify_settings = tL_peerNotifySettings;
                    if (zIsGlobalNotificationsEnabled) {
                        tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                    }
                }
            }
            editorEdit.apply();
        } else {
            SharedPreferences.Editor editorEdit2 = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            if (zIsGlobalNotificationsEnabled) {
                editorEdit2.remove("notify2_" + sharedPrefKey);
            } else {
                editorEdit2.putInt("notify2_" + sharedPrefKey, 0);
            }
            if (this.f35937c1 == 0) {
                getMessagesStorage().setDialogFlags(j12, 0L);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j12);
                if (dialog2 != null) {
                    dialog2.notify_settings = new TLRPC.TL_peerNotifySettings();
                }
            }
            editorEdit2.apply();
        }
        a5();
        getNotificationsController().updateServerNotificationsSettings(j12, this.f35937c1);
        g5Var.setChecked(z13);
        g5(true);
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.j40 j40Var = this.m0;
        if (j40Var != null) {
            j40Var.f29573f = bundle.getString("path");
        }
    }

    public final void s4() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.f35923a1 != 0) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f35923a1));
                if (user == null) {
                    return;
                }
                if (this.B2 == null || (userFull = this.f36043r2) == null || TextUtils.isEmpty(userFull.about)) {
                    str = String.format("https://" + getMessagesController().linkPrefix + "/%s", UserObject.getPublicUsername(user));
                } else {
                    str = String.format("%s https://" + getMessagesController().linkPrefix + "/%s", this.f36043r2.about, UserObject.getPublicUsername(user));
                }
            } else if (this.f35929b1 != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f35929b1));
                if (chat == null) {
                    return;
                }
                TLRPC.ChatFull chatFull = this.f36036q2;
                if (chatFull == null || TextUtils.isEmpty(chatFull.about)) {
                    str = String.format("https://" + getMessagesController().linkPrefix + "/%s", ChatObject.getPublicUsername(chat));
                } else {
                    str = String.format("%s\nhttps://" + getMessagesController().linkPrefix + "/%s", this.f36036q2.about, ChatObject.getPublicUsername(chat));
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
            startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.BotShare)), 500);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.j40 j40Var = this.m0;
        if (j40Var == null || (str = j40Var.f29573f) == null) {
            return;
        }
        bundle.putString("path", str);
    }

    public void setAvatarAnimationProgress(float f10) {
        int iV0;
        int iV1;
        int iV2;
        this.f35968g2 = f10;
        this.O1 = f10;
        B3();
        if (this.F1 == 2) {
            this.f35922a0.setProgressToExpand(f10);
            org.telegram.ui.Components.rg0 rg0Var = this.W;
            if (rg0Var != null) {
                rg0Var.setParentExpanded(f10);
            }
            org.telegram.ui.Components.jh0 jh0Var = this.Y;
            if (jh0Var != null) {
                jh0Var.setParentExpanded(f10);
            }
            org.telegram.ui.Components.sv0 sv0Var = this.P;
            if (sv0Var != null) {
                sv0Var.setParentExpanded(f10);
            }
            S4();
            f5();
        }
        this.f35921a.setAlpha(f10);
        this.f35921a.setTranslationX(AndroidUtilities.dp(48.0f) - (AndroidUtilities.dp(48.0f) * f10));
        if (this.F1 != 2 || (iV0 = this.f36014n0) == 0) {
            if (this.f35923a1 == 0 && ChatObject.isChannel(this.f35929b1, this.currentAccount)) {
                boolean z10 = this.A2.megagroup;
            }
            org.telegram.ui.ActionBar.c6 c6Var = this.f36067v0;
            int[][] iArr = org.telegram.ui.Components.y8.C;
            iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f22999a7, c6Var);
        }
        int iV3 = this.T4;
        if (iV3 == 0) {
            iV3 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23322s8, this.f36067v0);
        }
        this.Z0.setBackgroundColor(i0.b.d(f10, i0.b.k(iV3, 0), iV0));
        org.telegram.ui.Components.c11 c11Var = this.f35973h0;
        int iD = i0.b.d(f10, iV3, iV0);
        c11Var.f27285k = true;
        c11Var.f27278b.setColor(iD);
        if (this.M5 != null) {
            iV1 = -1;
        } else {
            if (this.f35923a1 == 0 && ChatObject.isChannel(this.f35929b1, this.currentAccount)) {
                boolean z11 = this.A2.megagroup;
            }
            org.telegram.ui.ActionBar.c6 c6Var2 = this.f36067v0;
            int[][] iArr2 = org.telegram.ui.Components.y8.C;
            iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23110g8, c6Var2);
        }
        this.actionBar.D(i0.b.d(this.O1, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23375v8, this.f36067v0), iV1), false);
        int iV4 = this.M5 == null ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.vh, this.f36067v0) : -1;
        int iV5 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A8, this.f36067v0);
        for (int i10 = 0; i10 < 2; i10++) {
            org.telegram.ui.ActionBar.h5 h5Var = this.f35958f[i10];
            if (h5Var != null && (i10 != 1 || this.F1 != 2)) {
                h5Var.setTextColor(i0.b.d(f10, iV5, iV4));
            }
        }
        boolean[] zArr = this.F0;
        if (zArr[0]) {
            iV2 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Bh, this.f36067v0);
        } else {
            if (this.f35923a1 == 0 && ChatObject.isChannel(this.f35929b1, this.currentAccount)) {
                boolean z12 = this.A2.megagroup;
            }
            org.telegram.ui.ActionBar.c6 c6Var3 = this.f36067v0;
            int[][] iArr3 = org.telegram.ui.Components.y8.C;
            iV2 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23127h8, c6Var3);
        }
        int iV6 = org.telegram.ui.ActionBar.g6.v0(zArr[0] ? org.telegram.ui.ActionBar.g6.f23271pa : org.telegram.ui.ActionBar.g6.B8, this.f36067v0);
        int i11 = 0;
        while (i11 < 3) {
            org.telegram.ui.ActionBar.h5 h5Var2 = this.f36040r[i11];
            if (h5Var2 != null && i11 != 1 && (i11 != 2 || this.F1 != 2)) {
                h5Var2.setTextColor(i0.b.d(f10, i11 == 0 ? iV6 : w3(iV6, Boolean.valueOf(zArr[0])), i11 == 0 ? iV2 : w3(iV2, Boolean.valueOf(zArr[0]))));
            }
            i11++;
        }
        this.M1 = this.N1 * f10;
        long j10 = this.f35923a1;
        if (j10 == 0) {
            j10 = this.f35929b1;
        }
        org.telegram.ui.ActionBar.c6 c6Var4 = this.f36067v0;
        int[][] iArr4 = org.telegram.ui.Components.y8.C;
        int iV7 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23270p8[org.telegram.ui.Components.y8.e(j10)], c6Var4);
        long j11 = this.f35923a1;
        if (j11 == 0) {
            j11 = this.f35929b1;
        }
        int iD2 = org.telegram.ui.Components.y8.d(j11);
        if (iV7 != iD2) {
            this.f36001l0.h(i0.b.d(f10, iD2, iV7));
            this.f35922a0.invalidate();
        }
        int i12 = this.U4;
        if (i12 != 0) {
            setNavigationBarColor(i0.b.d(f10, i12, getNavigationBarColor()));
        }
        this.Z0.invalidate();
        k4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        qz0 qz0Var = this.J5;
        if (qz0Var != null) {
            qz0Var.invalidate();
        }
        if (a() > 0) {
            ly0 ly0Var = this.f35922a0;
            if (ly0Var != null) {
                ly0Var.setProgressToStoriesInsets(this.O1);
            }
            oy0 oy0Var = this.f36034q0;
            if (oy0Var != null) {
                oy0Var.setProgressToStoriesInsets(this.O1);
            }
            hh.v0 v0Var = this.f36041r0;
            if (v0Var != null) {
                v0Var.setProgressToStoriesInsets(this.O1);
            }
        }
    }

    @Override
    public final void setParentLayout(org.telegram.ui.ActionBar.b5 b5Var) {
        super.setParentLayout(b5Var);
        FlagSecureReason flagSecureReason = this.T1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
            this.T1 = null;
        }
        if (b5Var == null || b5Var.getParentActivity() == null) {
            return;
        }
        this.T1 = new FlagSecureReason(b5Var.getParentActivity().getWindow(), new gx0(this, 6));
    }

    @Override
    public final void t() {
        this.f35921a.x0(0);
    }

    public final void t4(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.H3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f35929b1);
            bundle.putLong("user_id", this.f35923a1);
            presentFragment(new y11(bundle));
            return;
        }
        if (view2.getTag() == null || ((Integer) view2.getTag()).intValue() != this.Q2) {
            return;
        }
        if (this.f35923a1 == getUserConfig().getClientUserId()) {
            presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
        } else if (UserObject.areGiftsDisabled(this.f36043r2)) {
            org.telegram.ui.Components.mc.a0(this).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.f35923a1)))).j();
        } else {
            showDialog(new gh.k2(getParentActivity(), this.currentAccount, this.f35923a1, null, null));
        }
    }

    public final void u4() {
        org.telegram.ui.Components.oi0 oi0Var;
        if (this.f35923a1 == 0) {
            y4();
            return;
        }
        if (this.m0 == null) {
            x4();
            return;
        }
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        org.telegram.ui.Components.j40 j40Var = this.m0;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        j40Var.o((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new gb0(this, 24), new s5(this, 14), 0);
        this.R.K(0);
        this.R.N(43);
        this.S.K(0);
        this.S.N(43);
        org.telegram.ui.Components.rg0 rg0Var = this.W;
        if (rg0Var != null) {
            org.telegram.ui.Components.og0 og0VarJ = org.telegram.ui.Components.rg0.j(14, rg0Var.f32157a);
            if (og0VarJ != null && (oi0Var = og0VarJ.f31288k) != null) {
                oi0Var.start();
            }
        } else {
            this.v.d();
        }
        org.telegram.ui.Cells.l8 l8Var = this.I2;
        if (l8Var != null) {
            l8Var.getImageView().d();
        }
    }

    @Override
    public final boolean v() {
        return false;
    }

    public final CharSequence v3(CharSequence charSequence) {
        if (!ChatObject.isHiddenInCommunity(this.currentAccount, this.f35952e1)) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.cq(R.drawable.mini_ephemeral_hidden_16, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityHiddenStatus));
        spannableStringBuilder.append((CharSequence) " * ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.ps(), length - 2, length - 1, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final void v4() {
        Bundle bundleH = a9.p.h("addToGroup", true);
        bundleH.putLong("chatId", this.A2.f22380id);
        o60 o60Var = new o60(bundleH);
        TLRPC.ChatFull chatFull = this.f36036q2;
        o60Var.E = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            a0.h hVar = new a0.h();
            for (int i10 = 0; i10 < this.f36036q2.participants.participants.size(); i10++) {
                hVar.k(null, this.f36036q2.participants.participants.get(i10).user_id);
            }
            o60Var.F = hVar;
        }
        o60Var.f41018x = new gx0(this, 9);
        presentFragment(o60Var);
    }

    @Override
    public final boolean w(gy gyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, we1 we1Var) {
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle bundleH = a9.p.h("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j10)) {
            bundleH.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
        } else if (DialogObject.isUserDialog(j10)) {
            bundleH.putLong("user_id", j10);
        } else if (DialogObject.isChatDialog(j10)) {
            bundleH.putLong("chat_id", -j10);
        }
        if (!getMessagesController().checkCanOpenChat(bundleH, gyVar)) {
            return false;
        }
        NotificationCenter notificationCenter = getNotificationCenter();
        int i12 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(this, i12);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
        presentFragment(new rn(bundleH), true);
        removeSelfFromStack();
        getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(getMessagesController().getUser(Long.valueOf(this.f35923a1)), j10, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z11, i10, i11));
        if (!TextUtils.isEmpty(charSequence)) {
            SendMessagesHelper.prepareSendingText(AccountInstance.getInstance(this.currentAccount), charSequence, j10, z11, i10, i11, 0L);
        }
        return true;
    }

    public final int w3(int i10, Boolean bool) {
        if (this.M5 == null) {
            return i10;
        }
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23322s8, this.f36067v0);
        int iD = i0.b.d(0.5f, this.M5.getStoryColor1(org.telegram.ui.ActionBar.g6.I.q()), this.M5.getStoryColor2(org.telegram.ui.ActionBar.g6.I.q()));
        if (org.telegram.ui.ActionBar.g6.b1(iV0)) {
            return org.telegram.ui.ActionBar.g6.C(org.telegram.ui.ActionBar.g6.I.q(), iV0, iD, i10, (bool == null || bool.booleanValue()) ? iD : org.telegram.ui.ActionBar.g6.l1(0.7f, iD));
        }
        return (bool == null || bool.booleanValue()) ? iD : org.telegram.ui.ActionBar.g6.b(-0.2f, 0.2f, org.telegram.ui.ActionBar.g6.l1(0.7f, iD));
    }

    public final void w4(boolean z10) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation;
        TLRPC.VideoSize closestVideoSizeWithSize;
        TLRPC.ChatFull chatFull;
        TLRPC.FileLocation fileLocation2;
        TLRPC.VideoSize closestVideoSizeWithSize2;
        TLRPC.UserFull userFull;
        TLRPC.Photo photo;
        boolean z11;
        TLRPC.Photo photo2;
        if (this.f35921a.getScrollState() != 1 || z10) {
            my0 my0Var = this.f35987j0;
            int realPosition = my0Var != null ? my0Var.getRealPosition() : 0;
            my0 my0Var2 = this.f35987j0;
            ImageLocation forPhoto = null;
            ImageLocation imageLocationG = my0Var2 != null ? my0Var2.G(realPosition) : null;
            my0 my0Var3 = this.f35987j0;
            TLRPC.Photo photoF = my0Var3 != null ? my0Var3.F(realPosition) : null;
            long j10 = this.f35923a1;
            wy0 wy0Var = this.f35971g5;
            if (j10 == 0) {
                if (this.f35929b1 == 0 || (chatPhoto = (chat = getMessagesController().getChat(Long.valueOf(this.f35929b1))).photo) == null || chatPhoto.photo_big == null) {
                    return;
                }
                PhotoViewer.t1().K2(null, this, null);
                TLRPC.ChatPhoto chatPhoto2 = chat.photo;
                int i10 = chatPhoto2.dc_id;
                if (i10 != 0) {
                    chatPhoto2.photo_big.dc_id = i10;
                }
                if (imageLocationG == null || (fileLocation = imageLocationG.location) == null) {
                    fileLocation = chatPhoto2.photo_big;
                }
                TLRPC.FileLocation fileLocation3 = fileLocation;
                if (photoF == null && (chatFull = this.f36036q2) != null) {
                    TLRPC.Photo photo3 = chatFull.chat_photo;
                    if (photo3 instanceof TLRPC.TL_photo) {
                        photoF = photo3;
                    }
                }
                if (photoF != null && !photoF.video_sizes.isEmpty() && (closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(photoF.video_sizes, 1000)) != null) {
                    forPhoto = ImageLocation.getForPhoto(closestVideoSizeWithSize, photoF);
                }
                PhotoViewer.t1().e2(null, fileLocation3, imageLocationG, forPhoto, null, null, null, 0, wy0Var, null, 0L, 0L, 0L, true, null, null);
                return;
            }
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f35923a1));
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null) {
                return;
            }
            PhotoViewer.t1().K2(null, this, null);
            TLRPC.UserProfilePhoto userProfilePhoto2 = user.photo;
            int i11 = userProfilePhoto2.dc_id;
            if (i11 != 0) {
                userProfilePhoto2.photo_big.dc_id = i11;
            }
            if (imageLocationG == null || (fileLocation2 = imageLocationG.location) == null) {
                fileLocation2 = userProfilePhoto2.photo_big;
            }
            TLRPC.FileLocation fileLocation4 = fileLocation2;
            if (photoF == null && (userFull = this.f36043r2) != null) {
                if (userProfilePhoto2.personal) {
                    photo = userFull.personal_photo;
                    if (photo instanceof TLRPC.TL_photo) {
                        photoF = photo;
                    } else {
                        photo = userFull.profile_photo;
                        z11 = photo instanceof TLRPC.TL_photo;
                        if (z11 || photo.f22404id != userProfilePhoto2.photo_id) {
                            photo2 = userFull.fallback_photo;
                            if (!(photo2 instanceof TLRPC.TL_photo) && photo2.f22404id == userProfilePhoto2.photo_id) {
                                photoF = photo2;
                            } else if (z11) {
                                photoF = photo;
                            }
                        } else {
                            photoF = photo;
                        }
                    }
                } else {
                    photo = userFull.profile_photo;
                    z11 = photo instanceof TLRPC.TL_photo;
                    if (z11) {
                        photo2 = userFull.fallback_photo;
                        if (!(photo2 instanceof TLRPC.TL_photo)) {
                            if (z11) {
                                photoF = photo;
                            }
                        } else if (z11) {
                            photoF = photo;
                        }
                    } else {
                        photo2 = userFull.fallback_photo;
                        if (!(photo2 instanceof TLRPC.TL_photo)) {
                            if (z11) {
                                photoF = photo;
                            }
                        } else if (z11) {
                            photoF = photo;
                        }
                    }
                }
            }
            if (photoF != null && !photoF.video_sizes.isEmpty() && (closestVideoSizeWithSize2 = FileLoader.getClosestVideoSizeWithSize(photoF.video_sizes, 1000)) != null) {
                forPhoto = ImageLocation.getForPhoto(closestVideoSizeWithSize2, photoF);
            }
            PhotoViewer.t1().e2(null, fileLocation4, imageLocationG, forPhoto, null, null, null, 0, wy0Var, null, 0L, 0L, 0L, true, null, null);
        }
    }

    public final void x3() {
        if (this.F5 == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f35961f2;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f35961f2.cancel();
        }
        float fClamp01 = Utilities.clamp01(this.M1 / this.B1);
        if (fClamp01 <= 0.0f) {
            return;
        }
        float f10 = (fClamp01 - 0.5f) / 0.5f;
        float translationY = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.dp(21.0f));
        this.X1 = AndroidUtilities.lerp(0.42f, this.F5[0], fClamp01);
        this.V1 = AndroidUtilities.lerp(this.K5, this.F5[1], fClamp01);
        this.W1 = AndroidUtilities.lerp(translationY, this.F5[2], fClamp01);
        this.Y1 = AndroidUtilities.lerp(this.F5[11], 0.0f, fClamp01);
        this.U.setScaleX(this.X1);
        this.U.setScaleY(this.X1);
        this.U.setTranslationX(this.V1);
        this.U.setTranslationY(this.W1);
        org.telegram.ui.Components.sv0 sv0Var = this.P;
        if (sv0Var != null) {
            sv0Var.setAlpha(fClamp01);
        }
        this.f35922a0.setAlpha(1.0f);
        this.U.setAlpha(1.0f);
        oy0 oy0Var = this.f36034q0;
        if (oy0Var != null) {
            oy0Var.invalidate();
        }
        hh.v0 v0Var = this.f36041r0;
        if (v0Var != null) {
            v0Var.f10191e = AndroidUtilities.lerp(0.0f, this.F5[4], f10);
            this.f36041r0.f10192f = AndroidUtilities.lerp(0.0f, this.F5[5], fClamp01);
            hh.v0 v0Var2 = this.f36041r0;
            v0Var2.h = true;
            v0Var2.invalidate();
        }
        h01 h01Var = this.X5;
        if (h01Var != null) {
            h01Var.setAlpha((int) AndroidUtilities.lerp(0.0f, this.F5[6], fClamp01));
        }
        float fDp = (((this.X1 * 100.0f) / 42.0f) * AndroidUtilities.dp(42.0f)) - AndroidUtilities.dp(42.0f);
        this.f35943d0.setTranslationX(this.U.getX() + AndroidUtilities.dp(16.0f) + fDp);
        this.f35943d0.setTranslationY(this.U.getY() + AndroidUtilities.dp(-10.0f) + fDp);
        this.f35951e0.setTranslationX(this.U.getX() + AndroidUtilities.dp(28.0f) + fDp);
        this.f35951e0.setTranslationY(this.U.getY() + AndroidUtilities.dp(26.5f) + fDp);
        this.f35959f0.setTranslationX(this.U.getX() + AndroidUtilities.dp(28.0f) + fDp);
        this.f35959f0.setTranslationY(this.U.getY() + AndroidUtilities.dp(24.0f) + fDp);
        this.f35966g0.setTranslationX(this.U.getX() + AndroidUtilities.dp(28.0f) + fDp);
        this.f35966g0.setTranslationY(this.U.getY() + AndroidUtilities.dp(24.0f) + fDp);
        float fLerp = AndroidUtilities.lerp(1.0f, this.F5[7], fClamp01);
        float fFloor = ((float) Math.floor(this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.density * 21.0f)))) + AndroidUtilities.dp(1.3f);
        float fDpf2 = AndroidUtilities.dpf2(22.7f) + fFloor;
        this.a2 = AndroidUtilities.lerp(fFloor, this.F5[8], fClamp01);
        this.f35938c2 = AndroidUtilities.lerp(fDpf2, this.F5[9], fClamp01);
        int i10 = 0;
        while (true) {
            org.telegram.ui.ActionBar.h5[] h5VarArr = this.f35958f;
            if (i10 >= h5VarArr.length) {
                break;
            }
            if (h5VarArr[i10] != null) {
                int i11 = i10 * 2;
                float fLerp2 = AndroidUtilities.lerp((this.K5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f), this.F5[i11 + 12], fClamp01);
                float fLerp3 = AndroidUtilities.lerp((this.K5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f), this.F5[i11 + 13], fClamp01);
                h5VarArr[i10].setTranslationX(fLerp2);
                h5VarArr[i10].setTranslationY(this.a2);
                org.telegram.ui.ActionBar.h5[] h5VarArr2 = this.f36040r;
                h5VarArr2[i10].setTranslationX(this.f35999k5 + fLerp3);
                h5VarArr2[i10].setTranslationY(this.f35938c2);
                if (i10 == 1) {
                    this.Z1 = fLerp2;
                    this.f35930b2 = fLerp3;
                    this.f36048s.setTranslationX(fLerp3);
                    this.f36048s.setTranslationY(this.f35938c2);
                }
                h5VarArr[i10].setScaleX(fLerp);
                h5VarArr[i10].setScaleY(fLerp);
            }
            i10++;
        }
        V4();
        b5(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0));
        l4((int) this.F5[10], fClamp01, true);
        org.telegram.ui.Components.rg0 rg0Var = this.W;
        if (rg0Var != null) {
            rg0Var.setAlpha(AndroidUtilities.lerp(0.0f, this.F5[3], f10));
        }
    }

    public final void x4() {
        TLRPC.User user;
        if (this.f35923a1 == 0 || M3() || (user = getMessagesController().getUser(Long.valueOf(this.f35923a1))) == null || (user instanceof TLRPC.TL_userEmpty)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.f35923a1);
        if (getMessagesController().checkCanOpenChat(bundle, this)) {
            boolean z10 = this.arguments.getBoolean("removeFragmentOnChatOpen", true);
            if (!AndroidUtilities.isTablet() && z10) {
                NotificationCenter notificationCenter = getNotificationCenter();
                int i10 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(this, i10);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
            }
            int i11 = getArguments().getInt("nearby_distance", -1);
            if (i11 >= 0) {
                bundle.putInt("nearby_distance", i11);
            }
            rn rnVar = new rn(bundle);
            rnVar.f42272x9 = getMediaDataController().getGreetingsSticker();
            rnVar.f42286y9 = false;
            presentFragment(rnVar, z10);
            if (!AndroidUtilities.isTablet() || this.E0) {
                return;
            }
            finishFragment();
        }
    }

    public final float y3() {
        return Utilities.clamp01((this.M1 - O3()) / U3());
    }

    public final void y4() {
        TLRPC.ChatFull chatFull = this.f36036q2;
        if (chatFull == null || chatFull.linked_chat_id == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.f36036q2.linked_chat_id);
        if (getMessagesController().checkCanOpenChat(bundle, this)) {
            presentFragment(new rn(bundle));
        }
    }

    @Override
    public final og.d z() {
        return this.f35993j6;
    }

    public final void z3() {
        int i10 = 0;
        this.W1 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.dp(21.0f));
        this.X1 = 1.38f;
        this.Y1 = 0.0f;
        N3();
        D4();
        l4(0, 1.0f, true);
        while (true) {
            org.telegram.ui.ActionBar.h5[] h5VarArr = this.f35958f;
            if (i10 >= h5VarArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[i10];
            if (h5Var != null) {
                float measuredWidth = (this.f35921a.getMeasuredWidth() / 2.0f) - (((h5VarArr[i10].getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) h5Var.getLayoutParams()).leftMargin);
                org.telegram.ui.ActionBar.h5[] h5VarArr2 = this.f36040r;
                float measuredWidth2 = (this.f35921a.getMeasuredWidth() / 2.0f) - ((h5VarArr2[i10].getExactWidth() * 0.5f) + ((FrameLayout.LayoutParams) h5VarArr2[i10].getLayoutParams()).leftMargin);
                if (i10 == 1) {
                    this.Z1 = measuredWidth;
                    this.f35930b2 = measuredWidth2;
                }
            }
            i10++;
        }
        if (this.F1 != 2) {
            this.f36034q0.setAlpha(1.0f);
        }
        this.U.setAlpha(1.0f);
        this.f35922a0.setAlpha(1.0f);
    }

    public final void z4(boolean z10) {
        TLRPC.TL_businessLocation tL_businessLocation;
        TLRPC.UserFull userFull = this.f36043r2;
        if (userFull == null || (tL_businessLocation = userFull.business_location) == null) {
            return;
        }
        if (tL_businessLocation.geo_point == null || z10) {
            String str = BuildVars.isHuaweiStoreApp() ? "mapapp://navigation" : "http://maps.google.com/maps";
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str + "?q=" + this.f36043r2.business_location.address, new Object[0]))));
                return;
            } catch (Exception e9) {
                FileLog.e(e9);
                return;
            }
        }
        jh.i8 i8Var = new jh.i8(3, 1);
        i8Var.setResourceProvider(this.f36067v0);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.local_id = -1;
        tL_message.peer_id = getMessagesController().getPeer(a());
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_businessLocation tL_businessLocation2 = this.f36043r2.business_location;
        tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
        tL_messageMediaGeo.address = tL_businessLocation2.address;
        tL_message.media = tL_messageMediaGeo;
        i8Var.K0 = false;
        i8Var.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
        presentFragment(i8Var);
    }

    public ProfileActivity(Bundle bundle, org.telegram.ui.Components.zt0 zt0Var) {
        super(bundle);
        this.f35958f = new org.telegram.ui.ActionBar.h5[2];
        this.h = null;
        this.f36013n = null;
        this.f36040r = new org.telegram.ui.ActionBar.h5[4];
        this.f36086y = new Drawable[2];
        this.A = new Drawable[2];
        this.C = new org.telegram.ui.Components.i5[2];
        this.D = new org.telegram.ui.Components.i5[2];
        this.E = new Drawable[2];
        this.F = new org.telegram.ui.Components.dr[2];
        this.G = new org.telegram.ui.Components.dr[2];
        this.f36049s0 = null;
        this.f36055t0 = new org.telegram.ui.Components.u40(this, 1);
        this.f36061u0 = new Paint(1);
        this.F0 = new boolean[1];
        this.X0 = 1.0f;
        this.f36088y1 = new a0.h();
        this.I1 = true;
        this.J1 = false;
        this.K1 = false;
        this.L1 = false;
        this.U1 = new HashMap();
        this.f35982i2 = new float[]{0.0f, 1.0f};
        this.f36008m2 = new Paint();
        this.f36082x2 = -1;
        this.H2 = new Rect();
        this.M4 = new ArrayList();
        this.N4 = new ArrayList();
        this.O4 = 0;
        this.P4 = true;
        this.Q4 = true;
        this.T4 = 0;
        this.U4 = 0;
        this.V4 = 0;
        this.W4 = 0L;
        this.f35948d5 = new HashSet();
        this.f35964f5 = new org.telegram.ui.Cells.b2(this);
        this.f35971g5 = new wy0(this);
        this.f36078w5 = new ud.a(0, new gx0(this, 8), org.telegram.ui.Components.er.h, 380L, true);
        this.C5 = new xy0(this);
        this.E5 = new yy0(this, 0);
        this.F5 = null;
        this.N5 = new SparseIntArray();
        this.P5 = null;
        this.Q5 = -1;
        this.U5 = -1.0f;
        og.b bVar = new og.b();
        this.f36006l6 = bVar;
        jg.a aVar = new jg.a(bVar);
        this.f36012m6 = aVar;
        ArrayList arrayList = new ArrayList();
        this.p6 = arrayList;
        RectF rectF = new RectF();
        this.q6 = rectF;
        RectF rectF2 = new RectF();
        this.f36047r6 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        this.N = zt0Var;
        og.c cVar = new og.c();
        cVar.a(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, this.f36067v0));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f35986i6 = new jg.e(false);
            og.d dVar = new og.d(null);
            this.f35993j6 = dVar;
            jg.a aVar2 = new jg.a(dVar);
            this.f36000k6 = aVar2;
            aVar2.f12944f = LiteMode.isEnabled(262144);
        } else {
            this.f35986i6 = null;
            this.f35993j6 = null;
            this.f36000k6 = new jg.a(cVar);
        }
        aVar.f12942c = new yd.b(true);
    }

    @Override
    public final void P() {
    }
}

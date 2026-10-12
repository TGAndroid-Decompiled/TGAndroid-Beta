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
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Property;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
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
import java.util.function.Consumer;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
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
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.UndoView;
public class ProfileActivity extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate, sy, org.telegram.ui.Components.qv0, org.telegram.ui.Components.h50, org.telegram.ui.Components.ju0, jh0 {
    public int A0;
    public boolean A1;
    public long A2;
    public int A3;
    public int A4;
    public final ne.b A5;
    public ImageLocation B0;
    public boolean B1;
    public int B2;
    public int B3;
    public int B4;
    public c01 B5;
    public int C0;
    public a0.h C1;
    public ArrayList C2;
    public int C3;
    public int C4;
    public AnimatorSet C5;
    public int D0;
    public boolean D1;
    public TLRPC.EncryptedChat D2;
    public int D3;
    public int D4;
    public AnimatorSet D5;
    public final Drawable[] E;
    public int E0;
    public long E1;
    public TLRPC.Chat E2;
    public int E3;
    public int E4;
    public float E5;
    public Long F;
    public boolean F0;
    public float F1;
    public TL_bots.BotInfo F2;
    public int F3;
    public int F4;
    public boolean F5;
    public final org.telegram.ui.Components.q5[] G;
    public boolean G0;
    public boolean G1;
    public TLRPC.ChannelParticipant G2;
    public int G3;
    public int G4;
    public final h01 G5;
    public final org.telegram.ui.Components.q5[] H;
    public boolean H0;
    public boolean H1;
    public TL_account.TL_password H2;
    public int H3;
    public int H4;
    public boolean H5;
    public final Drawable[] I;
    public boolean I0;
    public boolean I1;
    public TLRPC.FileLocation I2;
    public int I3;
    public boolean I4;
    public final i01 I5;
    public final org.telegram.ui.Components.ds[] J;
    public final boolean[] J0;
    public int J1;
    public TLRPC.FileLocation J2;
    public int J3;
    public int J4;
    public float[] J5;
    public final org.telegram.ui.Components.ds[] K;
    public boolean K0;
    public boolean K1;
    public ImageLocation K2;
    public int K3;
    public int K4;
    public float K5;
    public org.telegram.ui.Components.zm0 L;
    public boolean L0;
    public boolean L1;
    public final Rect L2;
    public int L3;
    public int L4;
    public float L5;
    public UndoView M;
    public boolean M0;
    public boolean M1;
    public org.telegram.ui.Cells.r8 M2;
    public int M3;
    public int M4;
    public boolean M5;
    public g11 N;
    public boolean N0;
    public boolean N1;
    public int N2;
    public int N3;
    public boolean N4;
    public a11 N5;
    public r01 O;
    public ImageView O0;
    public boolean O1;
    public int O2;
    public int O3;
    public boolean O4;
    public float O5;
    public org.telegram.ui.Components.wx0 P;
    public org.telegram.ui.ActionBar.u0 P0;
    public boolean P1;
    public int P2;
    public int P3;
    public int P4;
    public float P5;
    public boolean Q;
    public org.telegram.ui.ActionBar.u0 Q0;
    public float Q1;
    public int Q2;
    public int Q3;
    public final ArrayList Q4;
    public MessagesController.PeerColor Q5;
    public org.telegram.ui.Components.pv0 R;
    public org.telegram.ui.ActionBar.u0 R0;
    public float R1;
    public int R2;
    public int R3;
    public final ArrayList R4;
    public final SparseIntArray R5;
    public boolean S;
    public org.telegram.ui.ActionBar.u0 S0;
    public float S1;
    public int S2;
    public int S3;
    public int S4;
    public int S5;
    public org.telegram.ui.Components.hx0 T;
    public org.telegram.ui.ActionBar.u0 T0;
    public int T1;
    public int T2;
    public int T3;
    public boolean T4;
    public AnimatorSet T5;
    public x50 U;
    public org.telegram.ui.ActionBar.u0 U0;
    public float U1;
    public int U2;
    public int U3;
    public boolean U4;
    public int U5;
    public org.telegram.ui.Components.yj0 V;
    public org.telegram.ui.ActionBar.e1 V0;
    public ValueAnimator V1;
    public int V2;
    public int V3;
    public a01 V4;
    public int V5;
    public org.telegram.ui.Components.yj0 W;
    public org.telegram.ui.ActionBar.e1 W0;
    public boolean W1;
    public int W2;
    public int W3;
    public View W4;
    public boolean W5;
    public org.telegram.ui.Components.v40 X;
    public org.telegram.ui.ActionBar.e1 X0;
    public FlagSecureReason X1;
    public int X2;
    public int X3;
    public int X4;
    public boolean X5;
    public l0 Y;
    public ImageView Y0;
    public final HashMap Y1;
    public int Y2;
    public int Y3;
    public int Y4;
    public float Y5;
    public ah.v Z;
    public org.telegram.ui.ActionBar.e1 Z0;
    public float Z1;
    public int Z2;
    public int Z3;
    public int Z4;
    public float Z5;
    public lz0 f32528a;
    public org.telegram.ui.Components.ei0 f32529a0;
    public org.telegram.ui.Components.s8 f32530a1;
    public float a2;
    public int f32531a3;
    public int f32532a4;
    public long f32533a5;
    public float f32534a6;
    public org.telegram.ui.Components.mm0 f32535b;
    public MessagesController.SavedMusicList f32536b0;
    public float f32537b1;
    public float f32538b2;
    public int f32539b3;
    public int f32540b4;
    public boolean f32541b5;
    public q11 f32542b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public nz0 f32543c;
    public org.telegram.ui.Components.wi0 f32544c0;
    public int f32545c1;
    public float f32546c2;
    public int f32547c3;
    public int f32548c4;
    public boolean f32549c5;
    public w11 f32550c6;
    public f11 d;
    public org.telegram.ui.Cells.o f32551d0;
    public s11 f32552d1;
    public float f32553d2;
    public int f32554d3;
    public int f32555d4;
    public String f32556d5;
    public di.d4 f32557d6;
    public p11 e;
    public vz0 f32558e0;
    public long f32559e1;
    public float f32560e2;
    public int f32561e3;
    public int f32562e4;
    public String f32563e5;
    public int f32564e6;
    public final org.telegram.ui.ActionBar.h5[] f32565f;
    public AnimatorSet f32566f0;
    public long f32567f1;
    public float f32568f2;
    public int f32569f3;
    public int f32570f4;
    public String f32571f5;
    public Boolean f32572f6;
    public org.telegram.ui.Cells.z3 f32573g0;
    public long f32574g1;
    public float f32575g2;
    public int f32576g3;
    public int f32577g4;
    public org.telegram.ui.Components.ch f32578g5;
    public TLRPC.TL_emojiStatusCollectible f32579g6;
    public String h;
    public ImageView f32580h0;
    public boolean f32581h1;
    public float f32582h2;
    public int f32583h3;
    public int f32584h4;
    public final HashSet f32585h5;
    public int f32586h6;
    public ImageView f32587i0;
    public long f32588i1;
    public float f32589i2;
    public int f32590i3;
    public int f32591i4;
    public CharacterStyle f32592i5;
    public boolean f32593i6;
    public ImageView f32594j0;
    public boolean f32595j1;
    public ValueAnimator f32596j2;
    public int f32597j3;
    public int f32598j4;
    public final org.telegram.ui.Cells.d2 f32599j5;
    public int f32600j6;
    public ImageView f32601k0;
    public boolean f32602k1;
    public float f32603k2;
    public int f32604k3;
    public int f32605k4;
    public final g01 f32606k5;
    public int f32607k6;
    public org.telegram.ui.Components.w21 f32608l0;
    public boolean l1;
    public float f32609l2;
    public int f32610l3;
    public int l4;
    public boolean f32611l5;
    public int f32612l6;
    public org.telegram.ui.Components.gi0 m0;
    public long f32613m1;
    public final float[] f32614m2;
    public int f32615m3;
    public int f32616m4;
    public p01 f32617m5;
    public final bh.f f32618m6;
    public String f32619n;
    public wz0 f32620n0;
    public boolean f32621n1;
    public boolean f32622n2;
    public int f32623n3;
    public int f32624n4;
    public float f32625n5;
    public final gh.d f32626n6;
    public i11 f32627o0;
    public boolean f32628o1;
    public boolean f32629o2;
    public int f32630o3;
    public int f32631o4;
    public float f32632o5;
    public final bh.b f32633o6;
    public org.telegram.ui.Components.k9 f32634p0;
    public boolean f32635p1;
    public boolean f32636p2;
    public int f32637p3;
    public int f32638p4;
    public boolean p5;
    public final gh.b f32639p6;
    public org.telegram.ui.Components.i50 f32640q0;
    public boolean f32641q1;
    public final Paint f32642q2;
    public int f32643q3;
    public int f32644q4;
    public boolean f32645q5;
    public final bh.b q6;
    public final org.telegram.ui.ActionBar.h5[] f32646r;
    public int f32647r0;
    public boolean f32648r1;
    public boolean f32649r2;
    public int f32650r3;
    public int f32651r4;
    public ImageReceiver f32652r5;
    public ih.j f32653r6;
    public org.telegram.ui.Components.ep0 f32654s;
    public org.telegram.ui.Components.w21 f32655s0;
    public boolean f32656s1;
    public fi.v0 f32657s2;
    public int f32658s3;
    public int f32659s4;
    public FrameLayout f32660s5;
    public zy0 f32661s6;
    public org.telegram.ui.Components.ti0 f32662t0;
    public boolean f32663t1;
    public fi.r f32664t2;
    public int f32665t3;
    public int f32666t4;
    public FrameLayout[] f32667t5;
    public final ArrayList f32668t6;
    public yz0 f32669u0;
    public int f32670u1;
    public TLRPC.ChatFull f32671u2;
    public int f32672u3;
    public int f32673u4;
    public SpannableStringBuilder f32674u5;
    public final RectF f32675u6;
    public org.telegram.ui.Components.bk0 v;
    public zh.f0 f32676v0;
    public boolean f32677v1;
    public TLRPC.UserFull f32678v2;
    public int f32679v3;
    public int f32680v4;
    public SpannableStringBuilder f32681v5;
    public final RectF f32682v6;
    public AnimatorSet f32683w;
    public View f32684w0;
    public boolean f32685w1;
    public org.telegram.ui.Cells.g6 f32686w2;
    public int f32687w3;
    public int f32688w4;
    public di.d[] f32689w5;
    public Drawable f32690x;
    public final org.telegram.ui.Components.t50 f32691x0;
    public boolean f32692x1;
    public boolean f32693x2;
    public int f32694x3;
    public int f32695x4;
    public org.telegram.messenger.r8 f32696x5;
    public final Drawable[] f32697y;
    public final Paint f32698y0;
    public int f32699y1;
    public t11 f32700y2;
    public int y3;
    public int f32701y4;
    public FrameLayout f32702y5;
    public org.telegram.ui.ActionBar.c6 f32703z0;
    public boolean f32704z1;
    public CharSequence f32705z2;
    public int f32706z3;
    public int f32707z4;
    public di.d f32708z5;

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }

    public static void B0(ProfileActivity profileActivity) {
        float f7;
        RectF rectF = profileActivity.f32682v6;
        bh.f fVar = profileActivity.f32618m6;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int measuredHeight = (profileActivity.fragmentView.getMeasuredHeight() - profileActivity.f32612l6) - AndroidUtilities.dp(8.0f);
            profileActivity.f32675u6.set(0.0f, -dp, profileActivity.fragmentView.getMeasuredWidth(), profileActivity.actionBar.getMeasuredHeight() + dp);
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), profileActivity.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            fVar.g(2, profileActivity.f32668t6);
            fVar.e(profileActivity.f32661s6, profileActivity.fragmentView.getMeasuredWidth(), profileActivity.fragmentView.getMeasuredHeight());
        }
    }

    public static void G0(ProfileActivity profileActivity, int i10) {
        boolean w02 = org.telegram.ui.Components.xv0.w0(profileActivity.O.getClosestTab());
        if (i10 == profileActivity.f32586h6 && w02 == profileActivity.f32593i6) {
            return;
        }
        profileActivity.f32586h6 = i10;
        profileActivity.f32593i6 = w02;
        if (w02) {
            if (i10 > 0) {
                profileActivity.f32689w5[0].g(LocaleController.formatPluralString("HideStoriesFromAlbum", i10, new Object[0]), true, true);
            } else {
                profileActivity.f32689w5[0].g(profileActivity.f32681v5, true, true);
            }
        } else if (i10 <= 0 && MessagesController.getInstance(profileActivity.currentAccount).storiesEnabled()) {
            profileActivity.f32689w5[0].g(profileActivity.f32674u5, true, true);
        } else {
            profileActivity.f32689w5[0].g(LocaleController.formatPluralString("ArchiveStories", i10, new Object[0]), true, true);
        }
    }

    public static SpannableStringBuilder G3(int i10, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        j10 j10Var = new j10(9);
        j10Var.f37232n = str;
        if (j10Var.f37230c != null) {
            j10Var.f37230c = null;
            j10Var.a();
        }
        j10Var.f37231f = i10;
        spannableStringBuilder.setSpan(j10Var, 0, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static ValueAnimator H0(ProfileActivity profileActivity, final boolean z10) {
        float f7;
        boolean z11;
        int i10;
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f32646r;
        if (z10) {
            AndroidUtilities.requestAdjustResize(profileActivity.getParentActivity(), profileActivity.classGuid);
            AndroidUtilities.setAdjustResizeToNothing(profileActivity.getParentActivity(), profileActivity.classGuid);
        }
        ValueAnimator valueAnimator = profileActivity.V1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            profileActivity.V1.cancel();
        }
        zh.f0 f0Var = profileActivity.f32676v0;
        if (f0Var != null) {
            f0Var.setActive(!z10);
        }
        float f10 = profileActivity.U1;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        final float f11 = profileActivity.Q1;
        profileActivity.f32535b.setTranslationY(f11);
        profileActivity.f32535b.setVisibility(0);
        profileActivity.U0.setVisibility(0);
        profileActivity.f32528a.setVisibility(0);
        profileActivity.k4(true);
        profileActivity.Y.setVisibility(0);
        profileActivity.f32565f[1].setVisibility(0);
        h5VarArr[1].setVisibility(0);
        h5VarArr[3].setVisibility(0);
        org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
        if (profileActivity.U1 > 0.5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        kVar.w(z11);
        int i11 = 8;
        if (profileActivity.U1 > 0.5f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        org.telegram.ui.ActionBar.u0 u0Var = profileActivity.T0;
        if (u0Var != null) {
            u0Var.setVisibility(i10);
        }
        profileActivity.U0.setVisibility(i10);
        FrameLayout searchContainer = profileActivity.U0.getSearchContainer();
        if (profileActivity.U1 <= 0.5f) {
            i11 = 0;
        }
        searchContainer.setVisibility(i11);
        profileActivity.f32535b.setEmptyView(profileActivity.P);
        profileActivity.Y.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProfileActivity.l0(ProfileActivity.this, ofFloat, f11, z10);
            }
        });
        ofFloat.addListener(new j01(profileActivity, z10, 0));
        if (!z10) {
            profileActivity.U4 = true;
            profileActivity.F4();
            AndroidUtilities.requestAdjustNothing(profileActivity.getParentActivity(), profileActivity.classGuid);
            profileActivity.P.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(org.telegram.ui.Components.es.f24771f);
        profileActivity.V1 = ofFloat;
        return ofFloat;
    }

    public static void H4(Activity activity, boolean z10) {
        if (activity == null) {
            return;
        }
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(activity, 3, null);
        a2Var.f19569g0 = false;
        a2Var.show();
        Utilities.globalQueue.postRunnable(new ma0(a2Var, z10, activity, 8));
    }

    public static void S0(ProfileActivity profileActivity, String str, StringBuilder sb2) {
        String[] supportedTypes;
        ArrayList arrayList;
        try {
            int codecCount = MediaCodecList.getCodecCount();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (int i10 = 0; i10 < codecCount; i10++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                if (codecInfoAt != null && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= supportedTypes.length) {
                            break;
                        } else if (supportedTypes[i11].equals(str)) {
                            if (codecInfoAt.isEncoder()) {
                                arrayList = arrayList3;
                            } else {
                                arrayList = arrayList2;
                            }
                            arrayList.add(Integer.valueOf(i10));
                        } else {
                            i11++;
                        }
                    }
                }
            }
            if (!arrayList2.isEmpty() || !arrayList3.isEmpty()) {
                sb2.append("\n");
                sb2.append(arrayList2.size());
                sb2.append("+");
                sb2.append(arrayList3.size());
                sb2.append(" ");
                sb2.append(str.substring(6));
                sb2.append(" codecs:\n");
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    if (i12 > 0) {
                        sb2.append("\n");
                    }
                    MediaCodecInfo codecInfoAt2 = MediaCodecList.getCodecInfoAt(((Integer) arrayList2.get(i12)).intValue());
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
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    if (i13 > 0 || !arrayList2.isEmpty()) {
                        sb2.append("\n");
                    }
                    MediaCodecInfo codecInfoAt3 = MediaCodecList.getCodecInfoAt(((Integer) arrayList3.get(i13)).intValue());
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
            }
        } catch (Exception unused) {
        }
    }

    public static void U(ProfileActivity profileActivity, TLRPC.User user, org.telegram.ui.ActionBar.h5 h5Var) {
        TLRPC.EmojiStatus emojiStatus;
        ImageLocation forDocument;
        String str;
        org.telegram.ui.Components.q5[] q5VarArr = profileActivity.G;
        if (user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible) {
            pf.d.s(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        sg.m1 m1Var = new sg.m1(profileActivity, profileActivity.currentAccount, user, null, null, profileActivity.f32703z0);
        h5Var.getLocationOnScreen(new int[2]);
        m1Var.f45272v0 = h5Var.f20336h0;
        m1Var.f45273w0 = h5Var.f20337i0;
        m1Var.f45276z0 = h5Var.getScaleX();
        m1Var.f45274x0 = h5Var.getLeft();
        m1Var.f45275y0 = h5Var.getTop();
        m1Var.A0 = h5Var;
        Drawable rightDrawable = h5Var.getRightDrawable();
        org.telegram.ui.Components.q5 q5Var = q5VarArr[1];
        if (rightDrawable == q5Var && q5Var != null) {
            Drawable drawable = q5Var.f28516f[0];
            if (drawable instanceof org.telegram.ui.Components.s5) {
                m1Var.f45276z0 *= 0.98f;
                TLRPC.Document document = ((org.telegram.ui.Components.s5) drawable).e;
                if (document != null) {
                    org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(profileActivity.getParentActivity());
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.f20064m6, 0.2f);
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
                    z9Var.setLayerNum(7);
                    z9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                    z9Var.l(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                    if (((org.telegram.ui.Components.s5) q5VarArr[1].f28516f[0]).c()) {
                        z9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20233v6, profileActivity.f32703z0), PorterDuff.Mode.SRC_IN));
                        m1Var.C0 = MessageObject.getInputStickerSet(document);
                    } else {
                        m1Var.C0 = MessageObject.getInputStickerSet(document);
                    }
                    m1Var.B0 = z9Var;
                    m1Var.E0 = true;
                }
            }
        }
        profileActivity.showDialog(m1Var);
    }

    public static void V(ProfileActivity profileActivity) {
        int w02;
        int w03;
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f32646r;
        lz0 lz0Var = profileActivity.f32528a;
        if (lz0Var != null) {
            int childCount = lz0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = profileActivity.f32528a.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.xa) {
                    ((org.telegram.ui.Cells.xa) childAt).j(0);
                }
            }
            profileActivity.f32528a.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19843a7, profileActivity.f32703z0));
        }
        if (!profileActivity.f32636p2) {
            org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[1];
            if (h5Var != null) {
                Object tag = h5Var.getTag();
                for (int i11 = 0; i11 < 2; i11++) {
                    if (tag instanceof Integer) {
                        h5VarArr[i11 + 1].setTextColor(profileActivity.w3(org.telegram.ui.ActionBar.g6.w0(((Integer) tag).intValue(), profileActivity.f32703z0), Boolean.valueOf(profileActivity.J0[0])));
                    } else {
                        h5VarArr[i11 + 1].setTextColor(profileActivity.w3(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.B8, profileActivity.f32703z0), Boolean.TRUE));
                    }
                }
            }
            Drawable drawable = profileActivity.f32690x;
            int i12 = -1;
            if (drawable != null) {
                if (profileActivity.Q5 != null) {
                    w03 = -1;
                } else {
                    w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20126pc, profileActivity.f32703z0);
                }
                drawable.setColorFilter(w03, PorterDuff.Mode.MULTIPLY);
            }
            org.telegram.ui.Components.zm0 zm0Var = profileActivity.L;
            if (zm0Var != null) {
                zm0Var.b(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19975h8, profileActivity.f32703z0));
            }
            org.telegram.ui.ActionBar.h5 h5Var2 = profileActivity.f32565f[1];
            if (h5Var2 != null) {
                h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20244vh, profileActivity.f32703z0));
            }
            org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
            if (kVar != null) {
                if (profileActivity.Q5 == null) {
                    i12 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20235v8, profileActivity.f32703z0);
                }
                kVar.D(i12, false);
                org.telegram.ui.ActionBar.k kVar2 = profileActivity.actionBar;
                if (profileActivity.Q5 != null) {
                    w02 = 553648127;
                } else {
                    w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19938f8, profileActivity.f32703z0);
                }
                kVar2.B(w02, false);
            }
        }
        profileActivity.X4();
        profileActivity.o5();
    }

    public static void V0(ProfileActivity profileActivity) {
        boolean z10;
        float f7;
        float min = Math.min(profileActivity.f32546c2, 0.25f) / 0.25f;
        int i10 = 0;
        if (profileActivity.f32641q1) {
            profileActivity.f32662t0.setAlpha(1.0f - min);
            profileActivity.f32662t0.setBlurIntensity(0.0f);
            profileActivity.f32662t0.setGooeyEnabled(false);
        } else {
            profileActivity.f32662t0.setPullProgress(profileActivity.f32546c2);
            profileActivity.f32662t0.setBlurIntensity(Math.min((w7.s.a(profileActivity.f32546c2, 0.2f, 0.7f) - 0.2f) / 0.5f, 0.75f));
            org.telegram.ui.Components.ti0 ti0Var = profileActivity.f32662t0;
            float f10 = profileActivity.f32546c2;
            if (f10 > 0.0f && f10 < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            ti0Var.setGooeyEnabled(z10);
        }
        yz0 yz0Var = profileActivity.f32669u0;
        if (yz0Var != null && profileActivity.J1 != 2) {
            float f11 = profileActivity.f32546c2;
            if (f11 > 0.0f) {
                f7 = AndroidUtilities.lerp(1.0f, 0.0f, AndroidUtilities.ilerp(f11, 0.0f, 0.5f));
            } else {
                f7 = 1.0f;
            }
            yz0Var.setAlpha(f7);
        }
        org.telegram.ui.Components.ti0 ti0Var2 = profileActivity.f32662t0;
        if (profileActivity.f32546c2 >= 1.0f) {
            i10 = 8;
        }
        ti0Var2.setVisibility(i10);
    }

    public static void W(ProfileActivity profileActivity) {
        MessagesController.getInstance(profileActivity.currentAccount).deleteUserPhoto(null);
        profileActivity.V.M(0);
        profileActivity.W.M(0);
    }

    public static void X(ProfileActivity profileActivity, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.sc Q = org.telegram.ui.Components.zc.a0(profileActivity).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            Q.f29102j = 5000;
            Q.j();
            return;
        }
        if (tL_birthday == null) {
            userFull.flags2 &= -33;
        } else {
            userFull.flags2 |= 32;
        }
        userFull.birthday = tL_birthday;
        profileActivity.getMessagesStorage().updateUserInfo(userFull, false);
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (profileActivity.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.resourceProvider);
                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                profileActivity.showDialog(alertDialog$Builder.f19548a);
                return;
            }
            return;
        }
        org.telegram.messenger.q.r(R.string.UnknownError, org.telegram.ui.Components.zc.a0(profileActivity), R.raw.error, 36);
    }

    public static void Y(ProfileActivity profileActivity, int i10, float f7, float f10) {
        switch (i10) {
            case 0:
                boolean z10 = profileActivity.f32641q1;
                if (z10) {
                    if (z10) {
                        profileActivity.M3();
                        return;
                    }
                    return;
                } else if (profileActivity.f32559e1 != 0) {
                    profileActivity.x4();
                    return;
                } else if (profileActivity.f32567f1 != 0) {
                    if (ChatObject.isForum(profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.f32567f1)))) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", profileActivity.f32567f1);
                        if (profileActivity.getMessagesController().checkCanOpenChat(bundle, profileActivity)) {
                            profileActivity.presentFragment(new fo(bundle), false);
                            return;
                        }
                        return;
                    } else if (!profileActivity.M3()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", profileActivity.f32567f1);
                        if (profileActivity.getMessagesController().checkCanOpenChat(bundle2, profileActivity)) {
                            profileActivity.presentFragment(new fo(bundle2), false);
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
                profileActivity.r4(profileActivity.f32529a0, f7, f10, true);
                return;
            case 2:
                profileActivity.y4();
                return;
            case 3:
                profileActivity.p4();
                return;
            case 4:
                profileActivity.s4();
                return;
            case 5:
            case 10:
            case 11:
                profileActivity.o4(false);
                return;
            case 6:
                profileActivity.o4(true);
                return;
            case 7:
                profileActivity.q4(true);
                return;
            case 8:
                i41.M(profileActivity.a(), profileActivity);
                return;
            case 9:
                profileActivity.i4(false);
                return;
            case 12:
                profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(profileActivity.getParentActivity(), 3, profileActivity.f32703z0);
                a2Var.q(200L);
                MessagesController.getInstance(profileActivity.currentAccount).getStoriesController().k(profileActivity.a(), new mt(13, profileActivity, a2Var), true, profileActivity.f32703z0);
                return;
            case 13:
                profileActivity.n4(true);
                return;
            case 14:
                profileActivity.u4();
                return;
            case 15:
                TLRPC.User currentUser = profileActivity.getUserConfig().getCurrentUser();
                if (currentUser != null) {
                    org.telegram.ui.Components.m80 H = org.telegram.ui.Components.m80.H(profileActivity, profileActivity.f32529a0);
                    H.f27301w = false;
                    H.f27280i = 3;
                    H.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.QrCode), new cc0(profileActivity, 22), false);
                    H.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new yk0(currentUser, 28), false);
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new cc0(profileActivity, 23), false);
                    H.W = true;
                    H.a0(f7 - AndroidUtilities.dp(8.0f), profileActivity.f32529a0.getMeasuredHeight() - AndroidUtilities.dp(16.0f));
                    H.Z();
                    return;
                }
                return;
            case 16:
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 17:
                profileActivity.presentFragment(new o91(null));
                return;
            default:
                return;
        }
    }

    public static boolean Z(ProfileActivity profileActivity, boolean[] zArr, boolean z10, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_error tL_error) {
        boolean z11;
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        MessagesController.getNotificationsSettings(profileActivity.currentAccount).edit().putLong("dialog_join_requested_time_" + profileActivity.f32588i1, System.currentTimeMillis()).commit();
        Activity parentActivity = profileActivity.getParentActivity();
        if (ChatObject.isChannel(profileActivity.E2) && !profileActivity.E2.megagroup) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i10 = org.telegram.ui.Components.g90.f25233r;
        org.telegram.ui.Components.g90.y(parentActivity, profileActivity, org.telegram.ui.Components.zc.a0(profileActivity), z11);
        if (!z10 || profileActivity.L4 != -1) {
            profileActivity.j5();
            f11 f11Var = profileActivity.d;
            if (f11Var != null) {
                f11Var.l();
            }
        }
        if (m2Var instanceof fo) {
            ((fo) m2Var).zb(false, true);
        }
        return false;
    }

    public static void a0(ProfileActivity profileActivity) {
        TLRPC.Document f7;
        org.telegram.ui.Components.sc h;
        if (profileActivity.J2 == null) {
            if (profileActivity.f32641q1 && !profileActivity.getMessagesController().premiumFeaturesBlocked()) {
                ArrayList<TLRPC.TL_forumTopic> topics = profileActivity.getMessagesController().getTopicsController().getTopics(profileActivity.f32567f1);
                if (topics != null) {
                    TLRPC.TL_forumTopic tL_forumTopic = null;
                    for (int i10 = 0; tL_forumTopic == null && i10 < topics.size(); i10++) {
                        TLRPC.TL_forumTopic tL_forumTopic2 = topics.get(i10);
                        if (tL_forumTopic2 != null && tL_forumTopic2.f19268id == profileActivity.f32574g1) {
                            tL_forumTopic = tL_forumTopic2;
                        }
                    }
                    if (tL_forumTopic != null) {
                        long j10 = tL_forumTopic.icon_emoji_id;
                        if (j10 != 0 && (f7 = org.telegram.ui.Components.s5.f(profileActivity.currentAccount, j10)) != null && (h = org.telegram.ui.Components.zc.a0(profileActivity).h(f7, 1, new xy0(profileActivity, 1))) != null) {
                            h.j();
                        }
                    }
                }
            } else if (!profileActivity.K3()) {
                profileActivity.w4(false);
            }
        }
    }

    public static void b0(ProfileActivity profileActivity, Context context, long j10, View view, int i10, float f7, float f10) {
        TLRPC.User user;
        TLRPC.ChatParticipant chatParticipant;
        f11 f11Var;
        if (profileActivity.getParentActivity() == null) {
            return;
        }
        profileActivity.f32528a.B0();
        if (i10 == profileActivity.S3) {
            TLRPC.User user2 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f32559e1));
            TLRPC.UserFull userFull = profileActivity.f32678v2;
            if (userFull != null && userFull.starref_program != null) {
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                zh.p.g(profileActivity.currentAccount).f(profileActivity.getParentActivity(), clientUserId, profileActivity.f32559e1, new pu(profileActivity, context, clientUserId, 2));
            } else if (user2 == null || !user2.bot_can_edit) {
            } else {
                profileActivity.presentFragment(new fi.l(profileActivity.f32559e1));
            }
        } else if (i10 == profileActivity.Q3) {
            boolean z10 = !profileActivity.getMessagesController().isDialogMuted(j10, profileActivity.f32574g1);
            profileActivity.getNotificationsController().muteDialog(j10, profileActivity.f32574g1, z10);
            org.telegram.ui.Components.zc.A(profileActivity, z10, null).j();
            profileActivity.a5();
            int i11 = profileActivity.Q3;
            if (i11 < 0 || (f11Var = profileActivity.d) == null) {
                return;
            }
            f11Var.m(i11);
        } else if (i10 == profileActivity.Z3) {
            TLRPC.User user3 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f32559e1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user3.f19363id);
            bundle.putBoolean("addContact", true);
            bundle.putString("phone", profileActivity.f32556d5);
            bundle.putString("first_name_card", profileActivity.f32563e5);
            bundle.putString("last_name_card", profileActivity.f32571f5);
            ws wsVar = new ws(bundle, profileActivity.f32703z0);
            wsVar.O = new qy0(profileActivity, user3);
            profileActivity.presentFragment(wsVar);
        } else if (i10 == profileActivity.W3) {
            TextView textView = (TextView) org.telegram.ui.Components.g5.h0(profileActivity.getParentActivity(), LocaleController.getString(R.string.DeleteReaction), LocaleController.getString(R.string.DeleteAlertReaction), LocaleController.getString(R.string.DeleteAlertReactionAll), LocaleController.getString(R.string.Delete), new xy0(profileActivity, 3), profileActivity.f32703z0, false).d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
            }
        } else if (i10 == profileActivity.X3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f32703z0);
            alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.ReportReaction2);
            alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.ReportAlertReaction);
            TLRPC.Chat chat = profileActivity.getMessagesController().getChat(Long.valueOf(-profileActivity.f32533a5));
            org.telegram.ui.Cells.a2[] a2VarArr = new org.telegram.ui.Cells.a2[1];
            if (chat != null && ChatObject.canBlockUsers(chat)) {
                LinearLayout linearLayout = new LinearLayout(profileActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(profileActivity.getParentActivity(), 1, profileActivity.f32703z0);
                a2VarArr[0] = a2Var;
                a2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.L0(false));
                a2VarArr[0].e(LocaleController.getString(R.string.BanUser), "", true, false, false);
                a2VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                linearLayout.addView(a2VarArr[0], w7.a6.n(-1, -2));
                a2VarArr[0].setOnClickListener(new a30(a2VarArr, 2));
                alertDialog$Builder.n(linearLayout);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.ReportChat), new cs0(9, profileActivity, a2VarArr));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ul0(5));
            TextView textView2 = (TextView) alertDialog$Builder.o().d(-1);
            if (textView2 != null) {
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
            }
        } else if (i10 == profileActivity.f32651r4) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("chat_id", DialogObject.getEncryptedChatId(profileActivity.f32588i1));
            profileActivity.presentFragment(new org.telegram.ui.ActionBar.m2(bundle2));
        } else if (i10 == profileActivity.f32644q4) {
            profileActivity.showDialog(org.telegram.ui.Components.g5.U(profileActivity.getParentActivity(), profileActivity.D2, profileActivity.f32703z0).f19548a);
        } else if (i10 == profileActivity.N3) {
            profileActivity.r4(view, f7, f10, false);
        } else if (i10 == profileActivity.K4) {
            profileActivity.getMessagesController().unblockPeer(profileActivity.f32559e1);
            if (org.telegram.ui.Components.zc.a(profileActivity)) {
                org.telegram.ui.Components.zc.d(profileActivity, false).j();
            }
        } else if (i10 == profileActivity.f32532a4) {
            try {
                profileActivity.actionBar.getActionBarMenuOnItemClick().b(9);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i10 == profileActivity.U3) {
            profileActivity.u4();
        } else if (i10 == profileActivity.V3) {
            i41.M(profileActivity.a(), profileActivity);
        } else if (i10 >= profileActivity.f32673u4 && i10 < profileActivity.f32680v4) {
            if (!profileActivity.C2.isEmpty()) {
                chatParticipant = profileActivity.f32671u2.participants.participants.get(((Integer) profileActivity.C2.get(i10 - profileActivity.f32673u4)).intValue());
            } else {
                chatParticipant = profileActivity.f32671u2.participants.participants.get(i10 - profileActivity.f32673u4);
            }
            profileActivity.h(chatParticipant, false, false, view);
        } else if (i10 == profileActivity.f32688w4) {
            profileActivity.v4();
        } else if (i10 == profileActivity.L3) {
            profileActivity.C4(f7, f10, i10, view);
        } else if (i10 == profileActivity.l4) {
            if (profileActivity.E2 != null) {
                profileActivity.showDialog(new gi.k0(profileActivity, profileActivity.E2.linked_community_id, null, null));
            } else if (profileActivity.f32559e1 == 0 || (user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f32559e1))) == null) {
            } else {
                profileActivity.showDialog(new gi.k0(profileActivity, user.linked_community_id, null, null));
            }
        } else if (i10 == profileActivity.I3) {
            if (profileActivity.f32671u2.location instanceof TLRPC.TL_channelLocation) {
                nd0 nd0Var = new nd0(5);
                nd0Var.f38654e0 = -profileActivity.f32567f1;
                nd0Var.f38681z0 = (TLRPC.TL_channelLocation) profileActivity.f32671u2.location;
                profileActivity.presentFragment(nd0Var);
            }
        } else if (i10 == profileActivity.L4) {
            profileActivity.q4(false);
        } else if (i10 == profileActivity.f32695x4) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", profileActivity.f32567f1);
            bundle3.putInt("type", 2);
            yr yrVar = new yr(bundle3);
            yrVar.x0(profileActivity.f32671u2);
            profileActivity.presentFragment(yrVar);
        } else if (i10 == profileActivity.f32701y4) {
            profileActivity.presentFragment(new fi0(profileActivity.f32567f1));
        } else if (i10 == profileActivity.f32707z4) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", profileActivity.f32567f1);
            bundle4.putInt("type", 1);
            yr yrVar2 = new yr(bundle4);
            yrVar2.x0(profileActivity.f32671u2);
            profileActivity.presentFragment(yrVar2);
        } else if (i10 == profileActivity.A4) {
            profileActivity.S0.performClick();
        } else if (i10 == profileActivity.B4) {
            profileActivity.presentFragment(new zh.g(0, profileActivity.f32559e1));
        } else if (i10 == profileActivity.C4) {
            profileActivity.presentFragment(new zh.g(1, profileActivity.f32559e1));
        } else if (i10 == profileActivity.D4) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("chat_id", profileActivity.f32567f1);
            bundle5.putBoolean("start_from_monetization", true);
            profileActivity.presentFragment(new hb1(bundle5));
        } else if (i10 == profileActivity.G4) {
            Bundle bundle6 = new Bundle();
            bundle6.putLong("chat_id", profileActivity.f32567f1);
            bundle6.putInt("type", 0);
            yr yrVar3 = new yr(bundle6);
            yrVar3.x0(profileActivity.f32671u2);
            profileActivity.presentFragment(yrVar3);
        } else if (i10 == profileActivity.f32569f3) {
            profileActivity.presentFragment(new NotificationsSettingsActivity());
        } else if (i10 == profileActivity.f32583h3) {
            PrivacySettingsActivity privacySettingsActivity = new PrivacySettingsActivity();
            TL_account.TL_password tL_password = profileActivity.H2;
            privacySettingsActivity.d = tL_password;
            if (tL_password != null) {
                privacySettingsActivity.y0();
            }
            profileActivity.presentFragment(privacySettingsActivity);
        } else if (i10 == profileActivity.f32590i3) {
            profileActivity.presentFragment(new DataSettingsActivity());
        } else if (i10 == profileActivity.f32597j3) {
            profileActivity.presentFragment(new ThemeActivity(0));
        } else if (i10 == profileActivity.f32604k3) {
            profileActivity.presentFragment(new FiltersSetupActivity());
        } else if (i10 == profileActivity.f32615m3) {
            profileActivity.presentFragment(new StickersActivity(0, null));
        } else if (i10 == profileActivity.f32610l3) {
            profileActivity.presentFragment(new rc0());
        } else if (i10 == profileActivity.f32623n3) {
            profileActivity.presentFragment(new SessionsActivity(0));
        } else if (i10 == profileActivity.f32643q3) {
            profileActivity.showDialog(org.telegram.ui.Components.g5.T(profileActivity, profileActivity.f32703z0));
        } else if (i10 == profileActivity.f32650r3) {
            pf.d.s(profileActivity.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
        } else if (i10 == profileActivity.f32658s3) {
            pf.d.s(profileActivity.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
        } else if (i10 == profileActivity.f32679v3) {
            H4(profileActivity.getParentActivity(), false);
        } else if (i10 == profileActivity.f32687w3) {
            H4(profileActivity.getParentActivity(), true);
        } else if (i10 == profileActivity.f32694x3) {
            FileLog.cleanupLogs();
        } else if (i10 == profileActivity.y3) {
            if (profileActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f32703z0);
            alertDialog$Builder2.f19548a.T = LocaleController.getString(R.string.AreYouSure);
            alertDialog$Builder2.f19548a.R = LocaleController.getString(R.string.AppName);
            alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new py0(profileActivity, 7));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            profileActivity.showDialog(alertDialog$Builder2.f19548a);
        } else if (i10 == profileActivity.f32576g3) {
            profileActivity.presentFragment(new LanguageSelectActivity());
        } else if (i10 == profileActivity.V2) {
            profileActivity.presentFragment(new va(null));
        } else if (i10 == profileActivity.W2) {
            profileActivity.presentFragment(new UserInfoActivity());
        } else if (i10 == profileActivity.T2) {
            profileActivity.presentFragment(new h(3));
        } else if (i10 == profileActivity.O2) {
            profileActivity.u4();
        } else if (i10 == profileActivity.f32548c4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
        } else if (i10 == profileActivity.f32555d4) {
            profileActivity.presentFragment(new zh.p7());
        } else if (i10 == profileActivity.f32562e4) {
            profileActivity.presentFragment(new ei.i());
        } else if (i10 == profileActivity.f32570f4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(1, "settings"));
        } else if (i10 == profileActivity.f32577g4) {
            ug.m1.f0(0, BirthdayController.getInstance(profileActivity.currentAccount).getState());
        } else if (i10 == profileActivity.botPermissionLocation) {
            fi.v0 v0Var = profileActivity.f32657s2;
            if (v0Var != null) {
                v0Var.l(!v0Var.g(), new hz0(0, profileActivity, view));
            }
        } else if (i10 == profileActivity.botPermissionBiometry) {
            fi.r rVar = profileActivity.f32664t2;
            if (rVar != null) {
                rVar.f9506f = true;
                rVar.e = !rVar.e;
                rVar.k();
                ((org.telegram.ui.Cells.r8) view).setChecked(profileActivity.f32664t2.e);
            }
        } else if (i10 == profileActivity.botPermissionEmojiStatus) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            r8Var.setChecked(!r8Var.b());
            if (profileActivity.f32631o4 > 0) {
                profileActivity.getConnectionsManager().cancelRequest(profileActivity.f32631o4, true);
            }
            TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
            toggleuseremojistatuspermission.bot = profileActivity.getMessagesController().getInputUser(profileActivity.f32559e1);
            boolean b10 = r8Var.b();
            toggleuseremojistatuspermission.enabled = b10;
            TLRPC.UserFull userFull2 = profileActivity.f32678v2;
            if (userFull2 != null) {
                userFull2.bot_can_manage_emoji_status = b10;
            }
            int sendRequest = profileActivity.getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new fc0(15, profileActivity, r0));
            profileActivity.f32631o4 = sendRequest;
            int[] iArr = {sendRequest};
        } else if (i10 == profileActivity.O3) {
            profileActivity.N4 = !profileActivity.N4;
            profileActivity.F4();
            view.requestLayout();
            profileActivity.d.m(profileActivity.O3);
            int i12 = profileActivity.U5;
            if (i12 >= 0) {
                profileActivity.f32543c.h1(i12, profileActivity.V5 - profileActivity.f32528a.getPaddingTop());
            }
        } else if (i10 == profileActivity.P3) {
            profileActivity.z4(false);
        } else if (i10 == profileActivity.Q2) {
            if (profileActivity.f32678v2 == null) {
                return;
            }
            Bundle bundle7 = new Bundle();
            bundle7.putLong("chat_id", profileActivity.f32678v2.personal_channel_id);
            profileActivity.presentFragment(new fo(bundle7));
        } else if (i10 == profileActivity.U2) {
            w11 w11Var = profileActivity.f32550c6;
            if ((w11Var == null || !w11Var.a()) && !profileActivity.J3(i10, view)) {
                org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
                if (c9Var.d.getDrawable() != null) {
                    profileActivity.t4(c9Var.getImageView());
                }
            }
        } else if (i10 == profileActivity.H3) {
            profileActivity.I3(i10, view);
        } else {
            profileActivity.C4(f7, f10, i10, view);
        }
    }

    public static void c0(ProfileActivity profileActivity, org.telegram.ui.Cells.a2[] a2VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = profileActivity.getMessagesController().getInputUser(profileActivity.f32559e1);
        tL_messages_reportReaction.peer = profileActivity.getMessagesController().getInputPeer(profileActivity.f32533a5);
        tL_messages_reportReaction.f19322id = profileActivity.Z4;
        ConnectionsManager.getInstance(profileActivity.currentAccount).sendRequest(tL_messages_reportReaction, new bi.g7(8));
        org.telegram.ui.Cells.a2 a2Var = a2VarArr[0];
        if (a2Var != null && a2Var.b()) {
            profileActivity.getMessagesController().deleteParticipantFromChat(-profileActivity.f32533a5, profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f32559e1)));
        }
        profileActivity.Z4 = 0;
        profileActivity.e5(false, false);
        org.telegram.ui.Components.zc.a0(profileActivity).E(profileActivity.f32703z0).j();
    }

    public static void d0(ProfileActivity profileActivity, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            profileActivity.I2 = fileLocation;
            profileActivity.J2 = photoSize2.location;
            profileActivity.f32558e0.h(ImageLocation.getForLocal(fileLocation), "50_50", profileActivity.f32634p0, null);
            if (profileActivity.O2 != -1) {
                profileActivity.j5();
                f11 f11Var = profileActivity.d;
                if (f11Var != null) {
                    f11Var.l();
                }
                profileActivity.k4(true);
            }
            wz0 wz0Var = profileActivity.f32620n0;
            ImageLocation forLocal = ImageLocation.getForLocal(profileActivity.J2);
            profileActivity.K2 = forLocal;
            wz0Var.A(forLocal, ImageLocation.getForLocal(profileActivity.I2));
            profileActivity.P4(true, false);
        } else if (profileActivity.I2 == null) {
            return;
        } else {
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
            profileActivity.S5 = profileActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new fc0(17, profileActivity, str));
        }
        profileActivity.actionBar.n().requestLayout();
    }

    public static void e0(ProfileActivity profileActivity, Boolean bool) {
        long j10 = profileActivity.f32559e1;
        if (j10 == 0) {
            long j11 = profileActivity.f32567f1;
            if (j11 != 0) {
                j10 = -j11;
            } else {
                j10 = profileActivity.f32588i1;
            }
        }
        long j12 = j10;
        if (bool.booleanValue()) {
            MessagesController.getInstance(profileActivity.currentAccount).deleteAllReactionsFrom(profileActivity.f32533a5, j12);
        } else {
            MessagesController.getInstance(profileActivity.currentAccount).deleteReactionsFromMessage(profileActivity.f32533a5, j12, profileActivity.Z4);
        }
        profileActivity.Z4 = 0;
        profileActivity.e5(false, false);
        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(profileActivity.getParentActivity(), profileActivity.f32703z0);
        acVar.d(R.raw.chats_infotip, new String[0]);
        acVar.f23513b.setText(LocaleController.getString(R.string.ReactionDeleteSent));
        org.telegram.ui.Components.zc.a0(profileActivity).b(acVar, 1500).j();
    }

    public static void f0(org.telegram.ui.ProfileActivity r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.f0(org.telegram.ui.ProfileActivity, int):void");
    }

    public static void g0(ProfileActivity profileActivity) {
        boolean z10;
        TLRPC.Document document;
        if (profileActivity.f32536b0 == null) {
            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.currentAccount == profileActivity.currentAccount && MediaController.getInstance().currentSavedMusicList.dialogId == profileActivity.a()) {
                profileActivity.f32536b0 = MediaController.getInstance().currentSavedMusicList;
            } else {
                MessagesController.SavedMusicList savedMusicList = new MessagesController.SavedMusicList(profileActivity.currentAccount, profileActivity.a());
                profileActivity.f32536b0 = savedMusicList;
                TLRPC.UserFull userFull = profileActivity.f32678v2;
                if (userFull != null && (document = userFull.saved_music) != null) {
                    savedMusicList.setup(document);
                }
            }
        }
        if (!profileActivity.f32536b0.list.isEmpty()) {
            if (MediaController.getInstance().currentSavedMusicList == profileActivity.f32536b0 && MediaController.getInstance().isPlayingMessage(profileActivity.f32536b0.list.get(0))) {
                z10 = true;
            } else {
                MediaController.getInstance().cleanup();
                z10 = false;
            }
            MediaController.getInstance().currentSavedMusicList = profileActivity.f32536b0;
            MediaController.getInstance().getPlaylist().clear();
            MediaController.getInstance().getPlaylist().addAll(profileActivity.f32536b0.list);
            if (!z10) {
                MediaController.getInstance().playMessage(profileActivity.f32536b0.list.get(0));
            }
            profileActivity.showDialog(new org.telegram.ui.Components.m8(profileActivity.getParentActivity(), profileActivity.f32703z0));
        }
    }

    public static void h0(ProfileActivity profileActivity) {
        org.telegram.ui.Components.ad0.b(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), true, null, new cc0(profileActivity, 18), profileActivity.f32703z0);
    }

    public static void i0(ProfileActivity profileActivity) {
        Runnable runnable;
        boolean z10;
        int i10;
        int i11;
        int w02;
        boolean z11;
        long j10;
        int i12;
        char c10;
        final v3 v3Var;
        float f7;
        float f10;
        float f11;
        Activity parentActivity = profileActivity.getParentActivity();
        final TLRPC.UserFull userFull = profileActivity.f32678v2;
        if (userFull != null && userFull.stars_rating != null) {
            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) profileActivity.getParentActivity(), (org.telegram.ui.ActionBar.c6) null, false);
            e3Var.fixNavigationBar();
            runnable = e3Var.dismissRunnable;
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            final LimitPreviewView limitPreviewView = new LimitPreviewView(profileActivity.getParentActivity(), R.drawable.filled_rating_crown, 0, profileActivity.f32703z0, 0);
            if (profileActivity.a() != UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
                z10 = true;
            } else {
                z10 = false;
            }
            limitPreviewView.setHideNegativeValues(z10);
            limitPreviewView.setStarRating(userFull.stars_rating);
            limitPreviewView.setTranslationY(-AndroidUtilities.dp(14.0f));
            linearLayout.addView(limitPreviewView, w7.a6.t(-1, -2, 17, 0, 20, 0, 10));
            int i13 = 17;
            if (userFull.stars_my_pending_rating != null) {
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                linearLayout.addView(frameLayout, w7.a6.t(-1, -2, 17, 40, -12, 40, 20));
                int i14 = 2;
                TextView[] textViewArr = new org.telegram.ui.Components.da0[2];
                int i15 = 0;
                while (i15 < i14) {
                    int i16 = i14;
                    org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(parentActivity, 3, null);
                    textViewArr[i15] = zbVar;
                    zbVar.setGravity(i13);
                    textViewArr[i15].setTextSize(1, 12.0f);
                    textViewArr[i15].setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20288y6, false));
                    textViewArr[i15].setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19960gc, false));
                    frameLayout.addView(textViewArr[i15], w7.a6.e(-1, -1, 119));
                    TextView textView = textViewArr[i15];
                    if (i15 == 0) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    textView.setAlpha(f7);
                    TextView textView2 = textViewArr[i15];
                    if (i15 == 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.8f;
                    }
                    textView2.setScaleX(f10);
                    TextView textView3 = textViewArr[i15];
                    if (i15 == 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.8f;
                    }
                    textView3.setScaleY(f11);
                    i15++;
                    i14 = i16;
                    i13 = 17;
                }
                int i17 = i14;
                v3 v3Var2 = new v3(textViewArr, 20);
                if (profileActivity.a() == UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                long j11 = userFull.stars_rating.stars;
                TL_stars.Tl_starsRating tl_starsRating = userFull.stars_my_pending_rating;
                if (tl_starsRating != null) {
                    j10 = tl_starsRating.stars - j11;
                } else {
                    j10 = 0;
                }
                long j12 = (-j11) - j10;
                int max = Math.max(1, (userFull.stars_my_pending_rating_date - ConnectionsManager.getInstance(profileActivity.currentAccount).getCurrentTime()) / 86400);
                long j13 = userFull.stars_my_pending_rating.stars;
                long j14 = userFull.stars_rating.stars;
                long j15 = j13 - j14;
                if ((j14 < 0 && !z11) || (z11 && j12 > 0)) {
                    boolean z12 = z11;
                    textViewArr[0].setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
                    if (z12) {
                        textViewArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarRatingLevelNegativeYou", (int) j12)));
                        c10 = 0;
                        v3Var = v3Var2;
                        i12 = max;
                    } else {
                        textViewArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarRatingLevelNegativeOther, DialogObject.getName(profileActivity.a()))));
                        v3Var = v3Var2;
                        i12 = max;
                        c10 = 0;
                    }
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    i12 = max;
                    String formatPluralStringComma = LocaleController.formatPluralStringComma("StarRatingFuture", i12);
                    String formatPluralStringComma2 = LocaleController.formatPluralStringComma("StarRatingFuturePendingPoints", (int) j15);
                    CharSequence[] charSequenceArr = new CharSequence[3];
                    c10 = 0;
                    charSequenceArr[0] = formatPluralStringComma;
                    charSequenceArr[1] = "\n";
                    charSequenceArr[i17] = formatPluralStringComma2;
                    spannableStringBuilder.append(TextUtils.concat(charSequenceArr));
                    spannableStringBuilder.append((CharSequence) " ");
                    v3Var = v3Var2;
                    spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.StarRatingFuturePendingPointsPreview), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    TLRPC.UserFull userFull2 = userFull;
                                    limitPreviewView.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    v3Var.run(Boolean.TRUE);
                                    return;
                                default:
                                    TLRPC.UserFull userFull3 = userFull;
                                    limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                    v3Var.run(Boolean.FALSE);
                                    return;
                            }
                        }
                    }), true));
                    textViewArr[0].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r4) {
                                case 0:
                                    TLRPC.UserFull userFull2 = userFull;
                                    limitPreviewView.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    v3Var.run(Boolean.TRUE);
                                    return;
                                default:
                                    TLRPC.UserFull userFull3 = userFull;
                                    limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                    v3Var.run(Boolean.FALSE);
                                    return;
                            }
                        }
                    });
                    textViewArr[0].setText(spannableStringBuilder);
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                String formatPluralStringComma3 = LocaleController.formatPluralStringComma("StarRatingFuturePreview1", i12);
                String formatPluralStringComma4 = LocaleController.formatPluralStringComma("StarRatingFuturePreview2", (int) j15);
                CharSequence[] charSequenceArr2 = new CharSequence[3];
                charSequenceArr2[c10] = formatPluralStringComma3;
                i10 = 1;
                charSequenceArr2[1] = "\n";
                charSequenceArr2[i17] = formatPluralStringComma4;
                spannableStringBuilder2.append(TextUtils.concat(charSequenceArr2));
                spannableStringBuilder2.append((CharSequence) " ");
                spannableStringBuilder2.append(AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.StarRatingFuturePendingPointsPreviewBack), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                limitPreviewView.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                v3Var.run(Boolean.TRUE);
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                v3Var.run(Boolean.FALSE);
                                return;
                        }
                    }
                }), true));
                textViewArr[1].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                limitPreviewView.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                v3Var.run(Boolean.TRUE);
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                v3Var.run(Boolean.FALSE);
                                return;
                        }
                    }
                });
                textViewArr[1].setText(spannableStringBuilder2);
            } else {
                i10 = 1;
            }
            TextView textView4 = new TextView(parentActivity);
            textView4.setTypeface(AndroidUtilities.bold());
            textView4.setGravity(17);
            org.telegram.messenger.yh.j(20.0f, R.string.StarRatingTitle, i10, textView4);
            int i18 = org.telegram.ui.ActionBar.g6.G6;
            textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(i18, profileActivity.f32703z0));
            linearLayout.addView(textView4, w7.a6.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView5 = new TextView(parentActivity);
            textView5.setGravity(17);
            if (userFull.f19364id == UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
                org.telegram.messenger.q.o(R.string.StarRatingSelfDescription, textView5);
                i11 = 1;
            } else {
                i11 = 1;
                org.telegram.messenger.yh.q(R.string.StarRatingDescription, new Object[]{DialogObject.getName(profileActivity.a())}, textView5);
            }
            textView5.setTextSize(i11, 14.0f);
            textView5.setTextColor(org.telegram.ui.ActionBar.g6.w0(i18, profileActivity.f32703z0));
            linearLayout.addView(textView5, w7.a6.t(-1, -2, 17, 20, 0, 20, 12));
            ax0 ax0Var = new ax0(parentActivity, profileActivity.f32703z0);
            ax0Var.f34364a.l(LocaleController.getString(R.string.StarRatingTitle1), false);
            int i19 = R.string.StarRatingDescription1;
            String string = LocaleController.getString(R.string.StarRatingAdded);
            int i20 = org.telegram.ui.ActionBar.g6.Oh;
            ax0Var.f34365b.setText(LocaleController.formatSpannable(i19, G3(org.telegram.ui.ActionBar.g6.w0(i20, profileActivity.f32703z0), string)));
            ax0Var.d.setVisibility(8);
            int i21 = R.drawable.menu_gift;
            ImageView imageView = ax0Var.f34366c;
            imageView.setImageResource(i21);
            imageView.setColorFilter(org.telegram.ui.ActionBar.g6.w0(i18, profileActivity.f32703z0));
            linearLayout.addView(ax0Var, w7.a6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            ax0 ax0Var2 = new ax0(parentActivity, profileActivity.f32703z0);
            ax0Var2.f34364a.l(LocaleController.getString(R.string.StarRatingTitle2), false);
            ax0Var2.f34365b.setText(LocaleController.formatSpannable(R.string.StarRatingDescription2, G3(org.telegram.ui.ActionBar.g6.w0(i20, profileActivity.f32703z0), LocaleController.getString(R.string.StarRatingAdded))));
            ax0Var2.d.setVisibility(8);
            int i22 = R.drawable.menu_stars_gift;
            ImageView imageView2 = ax0Var2.f34366c;
            imageView2.setImageResource(i22);
            imageView2.setColorFilter(org.telegram.ui.ActionBar.g6.w0(i18, profileActivity.f32703z0));
            linearLayout.addView(ax0Var2, w7.a6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            ax0 ax0Var3 = new ax0(parentActivity, profileActivity.f32703z0);
            ax0Var3.f34364a.l(LocaleController.getString(R.string.StarRatingTitle3), false);
            int i23 = R.string.StarRatingDescription3;
            String string2 = LocaleController.getString(R.string.StarRatingDeduces);
            if (org.telegram.ui.ActionBar.g6.I.q()) {
                w02 = i0.a.d(0.25f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20064m6, profileActivity.f32703z0), -16777216);
            } else {
                w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20288y6, profileActivity.f32703z0);
            }
            ax0Var3.f34365b.setText(LocaleController.formatSpannable(i23, G3(w02, string2)));
            ax0Var3.d.setVisibility(8);
            int i24 = R.drawable.menu_refund;
            ImageView imageView3 = ax0Var3.f34366c;
            imageView3.setImageResource(i24);
            imageView3.setColorFilter(org.telegram.ui.ActionBar.g6.w0(i18, profileActivity.f32703z0));
            linearLayout.addView(ax0Var3, w7.a6.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            di.d dVar = new di.d(parentActivity, profileActivity.f32703z0, true);
            dVar.setOnClickListener(new gz0(0, runnable));
            dVar.g(zh.r3.i2(LocaleController.getString(R.string.Understood)), false, true);
            linearLayout.addView(dVar, w7.a6.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            e3Var.customView = linearLayout;
            e3Var.show();
        }
    }

    public static void j0(ProfileActivity profileActivity, TLRPC.User user) {
        int i10;
        if (profileActivity.Z3 >= 0) {
            if (profileActivity.J4 == -1) {
                profileActivity.j5();
                profileActivity.d.l();
            } else {
                profileActivity.e5(false, false);
            }
        }
        if (profileActivity.J4 == -1) {
            if (!profileActivity.f32622n2 && !AndroidUtilities.isTablet()) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (profileActivity.actionBar.getOccupyStatusBar()) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                int i11 = currentActionBarHeight + i10;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(profileActivity.f32528a.getMeasuredWidth(), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.f32528a.getMeasuredHeight(), 0);
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    f11 f11Var = profileActivity.d;
                    if (i12 >= f11Var.e.N2) {
                        break;
                    }
                    s4.b1 d = f11Var.d(null, f11Var.j(i12));
                    View view = d.f44838a;
                    profileActivity.d.v(d, i12);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i13 += view.getMeasuredHeight();
                    i12++;
                }
                int max = Math.max(0, profileActivity.fragmentView.getMeasuredHeight() - ((profileActivity.T3() + i13) + i11));
                lz0 lz0Var = profileActivity.f32528a;
                lz0Var.setPadding(0, lz0Var.getPaddingTop(), 0, max);
            } else {
                profileActivity.f32528a.setPadding(0, profileActivity.T3(), 0, 0);
                profileActivity.f32596j2.cancel();
                float[] fArr = profileActivity.f32614m2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                profileActivity.J4(1.0f);
                profileActivity.Q1 = profileActivity.T3();
            }
        }
        profileActivity.M.m(profileActivity.f32588i1, user, 8);
    }

    public static void k0(ProfileActivity profileActivity, Context context, long j10, TL_payments.connectedBotStarRef connectedbotstarref) {
        if (connectedbotstarref == null) {
            fi.f4.H0(context, profileActivity.currentAccount, profileActivity.f32678v2.starref_program, profileActivity.getUserConfig().getClientUserId(), profileActivity.f32703z0, false);
        } else {
            fi.f4.I0(context, profileActivity.currentAccount, connectedbotstarref, j10, profileActivity.f32703z0);
        }
    }

    public static void l0(ProfileActivity profileActivity, ValueAnimator valueAnimator, float f7, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f32646r;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        profileActivity.U1 = floatValue;
        float f10 = (floatValue - 0.5f) / 0.5f;
        float f11 = (0.5f - floatValue) / 0.5f;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        float f12 = -f7;
        profileActivity.T1 = (int) ((1.0f - floatValue) * f12);
        profileActivity.f32535b.setTranslationY(floatValue * f7);
        profileActivity.P.setTranslationY(f7 * profileActivity.U1);
        profileActivity.f32528a.setTranslationY((1.0f - profileActivity.U1) * f12);
        profileActivity.f32528a.setScaleX(1.0f - ((1.0f - profileActivity.U1) * 0.01f));
        profileActivity.f32528a.setScaleY(1.0f - ((1.0f - profileActivity.U1) * 0.01f));
        profileActivity.f32528a.setAlpha(profileActivity.U1);
        boolean z11 = true;
        profileActivity.k4(true);
        profileActivity.f32528a.setAlpha(f10);
        profileActivity.f32535b.setAlpha(1.0f - profileActivity.U1);
        profileActivity.f32535b.setScaleX((profileActivity.U1 * 0.05f) + 1.0f);
        profileActivity.f32535b.setScaleY((profileActivity.U1 * 0.05f) + 1.0f);
        profileActivity.P.setAlpha(1.0f - f10);
        profileActivity.Y.setAlpha(f10);
        profileActivity.f32558e0.setAlpha(f10);
        yz0 yz0Var = profileActivity.f32669u0;
        if (yz0Var != null) {
            yz0Var.setAlpha(f10);
        }
        profileActivity.f32565f[1].setAlpha(f10);
        h5VarArr[1].setAlpha(f10);
        h5VarArr[3].setAlpha(f10);
        profileActivity.U0.getSearchField().setAlpha(f11);
        if (z10 && profileActivity.U1 < 0.7f) {
            org.telegram.ui.ActionBar.u0 u0Var = profileActivity.U0;
            if (u0Var.F.getWidth() != 0 && !u0Var.e.isFocused()) {
                u0Var.e.requestFocus();
                AndroidUtilities.showKeyboard(u0Var.e);
            }
        }
        FrameLayout searchContainer = profileActivity.U0.getSearchContainer();
        int i11 = 8;
        if (profileActivity.U1 < 0.5f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        searchContainer.setVisibility(i10);
        if (profileActivity.U1 > 0.5f) {
            i11 = 0;
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = profileActivity.T0;
        if (u0Var2 != null) {
            u0Var2.setVisibility(i11);
            profileActivity.T0.setAlpha(f10);
        }
        profileActivity.U0.setVisibility(i11);
        org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
        if (profileActivity.U1 >= 0.5f) {
            z11 = false;
        }
        kVar.w(z11);
        org.telegram.ui.ActionBar.u0 u0Var3 = profileActivity.T0;
        if (u0Var3 != null) {
            u0Var3.setAlpha(f10);
        }
        profileActivity.U0.setAlpha(f10);
        profileActivity.f32552d1.invalidate();
        profileActivity.fragmentView.invalidate();
    }

    public static void m0(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        org.telegram.ui.Components.z01.c(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), user, str, z10, z11, profileActivity.f32703z0);
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
        boolean z10;
        TLRPC.VideoSize closestVideoSizeWithSize;
        if (tL_error == null) {
            TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.getUserConfig().getClientUserId()));
            if (user == null) {
                user = profileActivity.getUserConfig().getCurrentUser();
                if (user == null) {
                    return;
                }
                profileActivity.getMessagesController().putUser(user, false);
            } else {
                profileActivity.getUserConfig().setCurrentUser(user);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 150);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 800);
            if (tL_photos_photo.photo.video_sizes.isEmpty()) {
                closestVideoSizeWithSize = null;
            } else {
                closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(tL_photos_photo.photo.video_sizes, 1000);
            }
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            user.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f19240id;
            if (closestPhotoSizeWithSize != null) {
                tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
            }
            if (closestPhotoSizeWithSize2 != null) {
                tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
            }
            if (closestPhotoSizeWithSize != null && profileActivity.I2 != null) {
                FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(profileActivity.I2, true).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(profileActivity.I2.volume_id);
                sb2.append("_");
                String n10 = a1.g.n(profileActivity.I2.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(n10, a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(profileActivity.currentAccount, user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && profileActivity.J2 != null) {
                FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(profileActivity.J2, true).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            profileActivity.getMessagesController().getDialogPhotos(user.f19363id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            profileActivity.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f32559e1);
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                profileActivity.getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
        if (!AndroidUtilities.isTablet() && !profileActivity.f32622n2 && profileActivity.f32558e0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            z10 = true;
        } else {
            z10 = false;
        }
        profileActivity.f32629o2 = z10;
        profileActivity.I2 = null;
        profileActivity.J2 = null;
        wz0 wz0Var = profileActivity.f32620n0;
        wz0Var.H0 = true;
        wz0Var.K0 = profileActivity.K2;
        wz0Var.f28334q1 = null;
        wz0Var.f28335r1 = null;
        wz0Var.setCreateThumbFromParent(false);
        profileActivity.i5(true);
        profileActivity.P4(false, true);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        profileActivity.getUserConfig().saveConfig(true);
    }

    public static void n1(ProfileActivity profileActivity, boolean z10) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f32565f;
        org.telegram.ui.ActionBar.h5[] h5VarArr2 = profileActivity.f32646r;
        int i12 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        profileActivity.f32528a.setVisibility(i10);
        org.telegram.ui.Components.mm0 mm0Var = profileActivity.f32535b;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        mm0Var.setVisibility(i11);
        FrameLayout searchContainer = profileActivity.U0.getSearchContainer();
        if (!z10) {
            i12 = 8;
        }
        searchContainer.setVisibility(i12);
        zh.f0 f0Var = profileActivity.f32676v0;
        if (f0Var != null) {
            f0Var.setActive(!z10);
        }
        profileActivity.actionBar.w(z10);
        profileActivity.Y.setVisibility(i10);
        yz0 yz0Var = profileActivity.f32669u0;
        if (yz0Var != null) {
            yz0Var.setVisibility(i10);
        }
        h5VarArr[1].setVisibility(i10);
        h5VarArr2[1].setVisibility(i10);
        h5VarArr2[3].setVisibility(i10);
        org.telegram.ui.ActionBar.u0 u0Var = profileActivity.T0;
        if (u0Var != null) {
            u0Var.setAlpha(1.0f);
            profileActivity.T0.setVisibility(i10);
        }
        profileActivity.U0.setVisibility(i10);
        profileActivity.f32558e0.setAlpha(1.0f);
        profileActivity.Y.setAlpha(1.0f);
        yz0 yz0Var2 = profileActivity.f32669u0;
        if (yz0Var2 != null) {
            yz0Var2.setAlpha(1.0f);
        }
        zh.f0 f0Var2 = profileActivity.f32676v0;
        if (f0Var2 != null) {
            f0Var2.setAlpha(1.0f);
        }
        h5VarArr[1].setAlpha(1.0f);
        h5VarArr2[1].setAlpha(1.0f);
        profileActivity.U0.setAlpha(1.0f);
        profileActivity.f32528a.setAlpha(1.0f);
        profileActivity.f32535b.setAlpha(1.0f);
        profileActivity.P.setAlpha(1.0f);
        if (z10) {
            profileActivity.f32535b.setEmptyView(profileActivity.P);
        } else {
            profileActivity.P.setVisibility(8);
        }
    }

    public static void s3(ProfileActivity profileActivity, boolean z10) {
        Drawable drawable = profileActivity.f32558e0.getImageReceiver().getDrawable();
        String str = null;
        if (drawable instanceof org.telegram.ui.Components.s71) {
            profileActivity.f32558e0.u(null, null, drawable);
        } else if (drawable instanceof org.telegram.ui.Components.f6) {
            org.telegram.ui.Components.f6 f6Var = (org.telegram.ui.Components.f6) drawable;
            profileActivity.f32558e0.u(null, null, f6Var);
            if (z10) {
                f6Var.f(profileActivity.f32558e0);
            }
        } else {
            ImageLocation D = profileActivity.f32620n0.D(0);
            if (D != null && D.imageType == 2) {
                str = "avatar";
            }
            profileActivity.f32558e0.u(D, str, drawable);
        }
    }

    public final void A3() {
        s4.b1 b1Var;
        View view;
        int top;
        int i10;
        boolean z10;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float dp;
        float f18;
        float dp2;
        float f19;
        float f20;
        float f21;
        if (this.f32528a.getVisibility() == 0) {
            if (this.Q) {
                this.O.setVisibleHeight(this.f32528a.getMeasuredHeight() - this.O.getTop());
            }
            if (this.f32528a.getChildCount() > 0 && !this.G1) {
                boolean z11 = false;
                int i11 = 0;
                while (true) {
                    b1Var = null;
                    if (i11 < this.f32528a.getChildCount()) {
                        if (RecyclerView.R(this.f32528a.getChildAt(i11)) == 0) {
                            view = this.f32528a.getChildAt(i11);
                            break;
                        }
                        i11++;
                    } else {
                        view = null;
                        break;
                    }
                }
                if (view != null) {
                    lz0 lz0Var = this.f32528a;
                    View F = lz0Var.F(view);
                    if (F != null) {
                        b1Var = lz0Var.T(F);
                    }
                    b1Var = (org.telegram.ui.Components.wl0) b1Var;
                }
                if (view == null) {
                    top = 0;
                } else {
                    top = view.getTop();
                }
                if (b1Var != null) {
                    i10 = b1Var.b();
                } else {
                    i10 = -1;
                }
                if (top < 0 || i10 != 0) {
                    top = 0;
                }
                if (this.f32640q0 == null && this.actionBar.f20442n0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i12 = this.J4;
                if (i12 != -1 && !z10) {
                    org.telegram.ui.Components.wl0 wl0Var = (org.telegram.ui.Components.wl0) this.f32528a.K(i12);
                    if (wl0Var != null && wl0Var.f44838a.getTop() <= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (this.F5 != z10) {
                    this.F5 = z10;
                    AnimatorSet animatorSet = this.C5;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = this.D5;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                    }
                    org.telegram.ui.ActionBar.u0 searchItem = this.O.getSearchItem();
                    org.telegram.ui.Components.bk0 searchOptionsItem = this.O.getSearchOptionsItem();
                    TextView saveItem = this.O.getSaveItem();
                    if (!this.F5) {
                        if (this.L0) {
                            this.Q0.setVisibility(0);
                        }
                        if (this.M0) {
                            this.R0.setVisibility(0);
                        }
                        if (this.N0) {
                            this.S0.setVisibility(0);
                        }
                        this.T0.setVisibility(0);
                        if (searchOptionsItem != null) {
                            searchOptionsItem.setVisibility(8);
                        }
                        if (saveItem != null) {
                            saveItem.setVisibility(8);
                        }
                    } else {
                        r01 r01Var = this.O;
                        if (r01Var.s0(r01Var.f31364k0[0].F)) {
                            searchItem.setVisibility(0);
                        }
                        if (searchOptionsItem != null) {
                            searchOptionsItem.setVisibility(0);
                        }
                        r01 r01Var2 = this.O;
                        int i13 = r01Var2.f31364k0[0].F;
                        if (i13 != 0 && !org.telegram.ui.Components.xv0.p0(i13) && i13 != 11 && i13 != 13 && (i13 != 14 || r01Var2.V == null)) {
                            this.O.f31378r0.setVisibility(4);
                            this.O.A(false, false);
                        } else {
                            this.O.f31378r0.setVisibility(0);
                            this.O.A(true, false);
                        }
                    }
                    l5(false);
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar != null) {
                        kVar.n().requestLayout();
                    }
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.u0 u0Var = this.Q0;
                    Property property = View.ALPHA;
                    float f22 = 1.0f;
                    if (z10) {
                        f7 = 0.0f;
                    } else {
                        f7 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(u0Var, property, f7));
                    org.telegram.ui.ActionBar.u0 u0Var2 = this.R0;
                    if (z10) {
                        f10 = 0.0f;
                    } else {
                        f10 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(u0Var2, property, f10));
                    org.telegram.ui.ActionBar.u0 u0Var3 = this.T0;
                    if (z10) {
                        f11 = 0.0f;
                    } else {
                        f11 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(u0Var3, property, f11));
                    org.telegram.ui.ActionBar.u0 u0Var4 = this.S0;
                    if (z10) {
                        f12 = 0.0f;
                    } else {
                        f12 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(u0Var4, property, f12));
                    org.telegram.ui.ActionBar.u0 u0Var5 = this.Q0;
                    Property property2 = View.TRANSLATION_Y;
                    if (z10) {
                        f13 = -AndroidUtilities.dp(10.0f);
                    } else {
                        f13 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(u0Var5, property2, f13));
                    org.telegram.ui.ActionBar.u0 u0Var6 = this.R0;
                    if (z10) {
                        f14 = -AndroidUtilities.dp(10.0f);
                    } else {
                        f14 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(u0Var6, property2, f14));
                    org.telegram.ui.ActionBar.u0 u0Var7 = this.T0;
                    if (z10) {
                        f15 = -AndroidUtilities.dp(10.0f);
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(u0Var7, property2, f15));
                    org.telegram.ui.ActionBar.u0 u0Var8 = this.S0;
                    if (z10) {
                        f16 = -AndroidUtilities.dp(10.0f);
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(u0Var8, property2, f16));
                    if (z10) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(searchItem, property, f17));
                    if (z10) {
                        dp = 0.0f;
                    } else {
                        dp = AndroidUtilities.dp(10.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(searchItem, property2, dp));
                    ImageView imageView = this.O.f31378r0;
                    if (z10) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(imageView, property, f18));
                    ImageView imageView2 = this.O.f31378r0;
                    if (z10) {
                        dp2 = 0.0f;
                    } else {
                        dp2 = AndroidUtilities.dp(10.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(imageView2, property2, dp2));
                    org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                    if (z10) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(kVar2, this.G5, f19));
                    org.telegram.ui.ActionBar.h5[] h5VarArr = this.f32646r;
                    org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[1];
                    if (z10) {
                        f20 = 0.0f;
                    } else {
                        f20 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(h5Var, property, f20));
                    this.O.I0.setOpen(z10);
                    if (this.f32656s1) {
                        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[3];
                        if (z10) {
                            f21 = 0.0f;
                        } else {
                            f21 = 1.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(h5Var2, property, f21));
                    }
                    org.telegram.ui.Components.ep0 ep0Var = this.f32654s;
                    if (!z10) {
                        f22 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(ep0Var, property, f22));
                    if (z10) {
                        arrayList.add(ObjectAnimator.ofFloat(this, this.f32599j5, 0.0f));
                    }
                    if (this.f32669u0 != null || this.f32676v0 != null) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new uy0(this, 3));
                        arrayList.add(ofFloat);
                    }
                    C3();
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    this.C5 = animatorSet3;
                    animatorSet3.playTogether(arrayList);
                    this.C5.setInterpolator(org.telegram.ui.Components.es.f24771f);
                    this.C5.addListener(new org.telegram.ui.Components.ql0(11, this, searchItem));
                    this.C5.setDuration(150L);
                    this.C5.start();
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
                }
                float f23 = top;
                if (this.Q1 != f23 && !this.H1) {
                    this.Q1 = f23;
                    this.f32552d1.invalidate();
                    if (this.J1 != 0) {
                        if (this.Q1 > O3()) {
                            z11 = true;
                        }
                        this.M1 = z11;
                    }
                    k4(true);
                }
            }
        }
    }

    public final void A4(int i10, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        boolean[] zArr = new boolean[1];
        d01 d01Var = new d01(this, user.f19363id, this.f32567f1, tL_chatAdminRights, this.E2.default_banned_rights, tL_chatBannedRights, str, i10, zArr, user);
        d01Var.X0 = new e01(this, i10, chatParticipant, z10, zArr);
        presentFragment(d01Var);
    }

    public final void B3() {
        float alpha;
        int i10 = this.J1;
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f32646r;
        if (i10 == 1 && (!this.f32611l5 || this.G1)) {
            this.Y5 = 0.0f;
        } else if (i10 == 2 && (!this.f32611l5 || this.G1)) {
            org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[1];
            if (h5Var == null) {
                alpha = 0.0f;
            } else {
                alpha = h5Var.getAlpha();
            }
            this.Y5 = alpha;
        } else if (this.f32559e1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
            this.Y5 = (1.0f - this.f32625n5) * this.f32603k2;
        } else {
            this.Y5 = this.f32603k2 * this.f32625n5;
        }
        if (this.f32559e1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
            if (this.p5) {
                this.f32632o5 = AndroidUtilities.dp(28.0f) * this.Y5;
                org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[2];
                if (h5Var2 != null) {
                    h5Var2.setAlpha(this.f32603k2);
                    h5VarArr[3].setAlpha(1.0f - this.f32603k2);
                    h5VarArr[1].setTranslationX(W3(this.Z5));
                    this.Z.invalidate();
                    q11 q11Var = this.f32542b6;
                    if (q11Var != null) {
                        q11Var.e = 1.0f - this.f32603k2;
                        q11Var.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.h5 h5Var3 = h5VarArr[2];
            if (h5Var3 != null) {
                h5Var3.setAlpha(0.0f);
                h5VarArr[3].setAlpha(0.0f);
            }
            q11 q11Var2 = this.f32542b6;
            if (q11Var2 != null) {
                q11Var2.e = 1.0f;
                q11Var2.invalidateSelf();
            }
        } else if (this.f32645q5) {
            org.telegram.ui.ActionBar.h5 h5Var4 = h5VarArr[2];
            if (h5Var4 != null) {
                h5Var4.setAlpha(this.Y5);
            }
            q11 q11Var3 = this.f32542b6;
            if (q11Var3 != null) {
                q11Var3.e = 1.0f - this.Y5;
                q11Var3.invalidateSelf();
            }
        } else {
            org.telegram.ui.ActionBar.h5 h5Var5 = h5VarArr[2];
            if (h5Var5 != null) {
                h5Var5.setAlpha(0.0f);
            }
            q11 q11Var4 = this.f32542b6;
            if (q11Var4 != null) {
                q11Var4.e = 1.0f;
                q11Var4.invalidateSelf();
            }
        }
    }

    public final void B4(String str, org.telegram.ui.Cells.h hVar) {
        if (str.startsWith("@")) {
            getMessagesController().openByUserName(str.substring(1), this, 0, hVar);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/") && this.parentLayout.getFragmentStack().size() > 1) {
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if (m2Var instanceof fo) {
                    finishFragment();
                    ((fo) m2Var).Y.Y0(null, str, false, false);
                }
            }
        } else {
            yy yyVar = new yy(null);
            yyVar.f42371n2 = str;
            presentFragment(yyVar);
        }
    }

    public final void C3() {
        boolean z10;
        org.telegram.ui.Components.hx0 hx0Var = this.T;
        if (hx0Var != null) {
            if (!this.F5 && this.H5) {
                z10 = true;
            } else {
                z10 = false;
            }
            hx0Var.setVisibility(z10);
        }
    }

    public final boolean C4(float r22, float r23, int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.C4(float, float, int, android.view.View):boolean");
    }

    @Override
    public final boolean D() {
        return false;
    }

    public final void D3(boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.D3(boolean):void");
    }

    public final void D4() {
        int i10;
        ValueAnimator valueAnimator;
        if (this.f32636p2 && (valueAnimator = this.f32596j2) != null && valueAnimator.isRunning()) {
            this.f32560e2 = this.K5;
            this.f32575g2 = this.L5;
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (this.actionBar.getOccupyStatusBar()) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        E4(y3(), currentActionBarHeight + i10);
    }

    @Override
    public final void E(float f7) {
        org.telegram.ui.Cells.z3 z3Var = this.f32573g0;
        if (z3Var == null) {
            return;
        }
        z3Var.setProgress(f7);
        this.f32620n0.O(this.K2, f7);
    }

    public final void E3(Context context) {
        int i10;
        this.f32530a1 = new org.telegram.ui.Components.s8(context, this.T0.getPopupLayout().getSwipeBack(), new kz0(this), false, 0, this.f32703z0);
        if (this.f32588i1 > 0 || this.f32559e1 > 0) {
            int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20084n6, this.f32703z0);
            org.telegram.ui.Components.s8 s8Var = this.f32530a1;
            org.telegram.ui.Components.da0 da0Var = s8Var.e;
            if (da0Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AutoDeletePopupDescription));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.AutoDeletePopupDescription2), w02, new org.telegram.ui.Components.qg(s8Var, 10)));
                da0Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.f32678v2;
        if (userFull == null && this.f32671u2 == null) {
            i10 = 0;
        } else if (userFull != null) {
            i10 = userFull.ttl_period;
        } else {
            i10 = this.f32671u2.ttl_period;
        }
        org.telegram.ui.Components.w21 a2 = org.telegram.ui.Components.w21.a(i10);
        this.f32655s0 = a2;
        this.Z0 = this.T0.i(0, a2, LocaleController.getString(R.string.AutoDeletePopupTitle), this.f32530a1.f29060a);
        this.T0.a(-1);
        T4();
    }

    public final void E4(float f7, float f10) {
        float lerp;
        int i10;
        float max = Math.max(0.0f, Math.min(1.0f, (this.Q1 - T3()) / ((this.f32528a.getMeasuredWidth() - f10) - U3())));
        if (this.Q1 < T3() && max < 0.33f) {
            lerp = com.google.android.gms.internal.play_billing.k3.w(f7, 72.0f, 24.0f, 42.0f);
        } else {
            lerp = AndroidUtilities.lerp(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f));
        }
        if (this.actionBar.getOccupyStatusBar()) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float currentActionBarHeight = (1.0f + f7) * (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f);
        float translationY = this.actionBar.getTranslationY();
        float dpf2 = ((AndroidUtilities.dpf2(8.0f) + (AndroidUtilities.dp(42.0f) * lerp)) * f7) + ((float) Math.floor(translationY + ((currentActionBarHeight + i10) - (AndroidUtilities.density * 21.0f))));
        this.f32560e2 = (AndroidUtilities.dp(7.0f) * f7) + AndroidUtilities.dp(1.3f) + dpf2;
        this.f32575g2 = (((float) Math.floor(AndroidUtilities.density * 11.0f)) * f7) + dpf2 + AndroidUtilities.dp(24.0f);
    }

    @Override
    public final void F() {
        G4(false);
    }

    public final void F3() {
        if (this.fragmentView != null && this.X5 && this.f32700y2 != null && getParentActivity() != null) {
            w11 w11Var = this.f32550c6;
            if (w11Var != null) {
                w11Var.b(this.f32700y2);
                this.f32550c6.invalidate();
                return;
            }
            w11 w11Var2 = new w11(this, this.f32700y2);
            this.f32550c6 = w11Var2;
            ((FrameLayout) this.fragmentView).addView(w11Var2, w7.a6.e(-1, -1, 55));
        }
    }

    public final void F4() {
        lz0 lz0Var = this.f32528a;
        if (lz0Var != null && this.f32543c != null && lz0Var.getChildCount() > 0 && !this.W5) {
            View view = null;
            int i10 = Integer.MAX_VALUE;
            int i11 = -1;
            for (int i12 = 0; i12 < this.f32528a.getChildCount(); i12++) {
                int R = RecyclerView.R(this.f32528a.getChildAt(i12));
                View childAt = this.f32528a.getChildAt(i12);
                if (R != -1 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                    i11 = R;
                    view = childAt;
                }
            }
            if (view != null) {
                this.U5 = i11;
                int top = view.getTop();
                this.V5 = top;
                if (this.U5 == 0 && !this.f32629o2 && top > T3()) {
                    this.V5 = T3();
                }
                this.f32543c.h1(i11, view.getTop() - this.f32528a.getPaddingTop());
            }
        }
    }

    public final void G4(boolean z10) {
        int i10 = this.J4;
        if (i10 >= 0) {
            if (z10) {
                ki.o oVar = new ki.o(getParentActivity(), 2, 0.6f);
                oVar.f44979a = this.J4;
                oVar.f14352p = -this.f32528a.getPaddingTop();
                this.f32543c.w0(oVar);
                return;
            }
            this.f32543c.h1(i10, -this.f32528a.getPaddingTop());
        }
    }

    public final void H3(float f7) {
        boolean z10;
        ValueAnimator ofFloat;
        long j10;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.fragmentView.invalidate();
        AnimatorSet animatorSet = this.T5;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.T5 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z10) {
            ofFloat = ValueAnimator.ofFloat(0.0f, f7);
            arrayList.add(ofFloat);
        } else {
            ofFloat = ValueAnimator.ofFloat(this.f32691x0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new uy0(this, 1));
        this.T5.playTogether(arrayList);
        AnimatorSet animatorSet2 = this.T5;
        if (z10) {
            j10 = 150;
        } else {
            j10 = 220;
        }
        animatorSet2.setDuration(j10);
        if (!z10) {
            this.T5.addListener(new i01(this, 4));
        }
        this.T5.start();
    }

    public final void I3(int i10, View view) {
        boolean z10;
        org.telegram.ui.Components.m80 H = org.telegram.ui.Components.m80.H(this, view);
        H.W(this.f32528a.V0(view, false));
        H.f27301w = false;
        if (this.f32678v2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new cc0(this, 25), z10);
        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Edit), new cc0(this, 26), false);
        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new org.telegram.ui.Components.o8(this, i10, 25), true);
        H.Z();
    }

    public final void I4() {
        org.telegram.ui.Components.ei0 ei0Var = this.f32529a0;
        if (ei0Var != null) {
            if (this.f32656s1) {
                ei0Var.H = 6;
            } else if (this.f32641q1) {
                ei0Var.H = 5;
            } else if (this.f32649r2) {
                ei0Var.H = 2;
            } else if (this.f32559e1 != 0) {
                ei0Var.H = 0;
            } else if (this.f32567f1 != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f32567f1));
                if (ChatObject.isChannel(chat)) {
                    if (ChatObject.isMegagroup(chat)) {
                        this.f32529a0.H = 3;
                        return;
                    } else if (ChatObject.isForum(chat)) {
                        this.f32529a0.H = 4;
                        return;
                    } else {
                        this.f32529a0.H = 1;
                        return;
                    }
                }
                this.f32529a0.H = 3;
            }
        }
    }

    public final boolean J3(final int i10, View view) {
        TLRPC.User currentUser;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        if (this.f32656s1 && (currentUser = getUserConfig().getCurrentUser()) != null) {
            final TLRPC.UserFull userFull = this.f32678v2;
            if (userFull == null) {
                userFull = getMessagesController().getUserFull(currentUser.f19363id);
            }
            if (userFull != null) {
                String string = LocaleController.getString(R.string.Copy);
                if (i10 != this.K3 && i10 != this.J3 && i10 != this.W2) {
                    if (i10 == this.O3) {
                        str = ig.g1.f0(this.currentAccount, currentUser, userFull.business_work_hours);
                        string = LocaleController.getString(R.string.ProfileHoursCopy);
                    } else if (i10 == this.P3) {
                        str = userFull.business_location.address;
                        string = LocaleController.getString(R.string.ProfileLocationCopy);
                    } else if (i10 == this.L3) {
                        str = UserObject.getPublicUsername(currentUser);
                        if (str != null) {
                            str = "@".concat(str);
                        }
                        string = LocaleController.getString(R.string.ProfileCopyUsername);
                    } else if (i10 == this.G3) {
                        str = currentUser.phone;
                    } else if (i10 == this.U2) {
                        str = UserInfoActivity.Z(this.f32678v2.birthday);
                    } else {
                        str = null;
                    }
                } else {
                    str = userFull.about;
                }
                org.telegram.ui.Components.m80 H = org.telegram.ui.Components.m80.H(this, view);
                H.W(this.f32528a.V0(view, false));
                H.f27301w = false;
                H.f27280i = 3;
                if (i10 == this.P3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        H.c(R.drawable.msg_view_file, LocaleController.getString(R.string.ProfileLocationView), new cc0(this, 5), false);
                    }
                    H.c(R.drawable.msg_map, LocaleController.getString(R.string.ProfileLocationMaps), new cc0(this, 7), false);
                }
                if (str != null) {
                    H.c(R.drawable.msg_copy, string, new yk0(str, 26), false);
                }
                if (i10 == this.O3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileHoursEdit), new cc0(this, 8), false);
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.ProfileHoursRemove), new Runnable(this) {
                        public final ProfileActivity f40503b;

                        {
                            this.f40503b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    final ProfileActivity profileActivity = this.f40503b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.BusinessHoursClearTitle);
                                    alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.BusinessHoursClearMessage);
                                    String string2 = LocaleController.getString(R.string.Remove);
                                    final TLRPC.UserFull userFull2 = userFull;
                                    final int i11 = i10;
                                    alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.z1() {
                                        @Override
                                        public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i12) {
                                            switch (r4) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull3 = userFull2;
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    ProfileActivity profileActivity2 = profileActivity;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new yy0(profileActivity2, 0));
                                                    profileActivity2.j5();
                                                    profileActivity2.d.u(i11);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    return;
                                                default:
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    TLRPC.UserFull userFull4 = userFull2;
                                                    userFull4.business_location = null;
                                                    userFull4.flags2 &= -3;
                                                    ProfileActivity profileActivity3 = profileActivity;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new yy0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i11);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(alertDialog$Builder.f19548a);
                                    return;
                                default:
                                    final ProfileActivity profileActivity2 = this.f40503b;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder2.f19548a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                                    alertDialog$Builder2.f19548a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                                    String string3 = LocaleController.getString(R.string.Remove);
                                    final TLRPC.UserFull userFull3 = userFull;
                                    final int i12 = i10;
                                    alertDialog$Builder2.k(string3, new org.telegram.ui.ActionBar.z1() {
                                        @Override
                                        public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i122) {
                                            switch (r4) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull3;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity2;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new yy0(profileActivity22, 0));
                                                    profileActivity22.j5();
                                                    profileActivity22.d.u(i12);
                                                    profileActivity22.getMessagesStorage().updateUserInfo(userFull32, false);
                                                    return;
                                                default:
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    TLRPC.UserFull userFull4 = userFull3;
                                                    userFull4.business_location = null;
                                                    userFull4.flags2 &= -3;
                                                    ProfileActivity profileActivity3 = profileActivity2;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new yy0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i12);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity2.showDialog(alertDialog$Builder2.f19548a);
                                    return;
                            }
                        }
                    }, true);
                } else if (i10 == this.P3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileLocationEdit), new cc0(this, 9), false);
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.ProfileLocationRemove), new Runnable(this) {
                        public final ProfileActivity f40503b;

                        {
                            this.f40503b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    final ProfileActivity profileActivity = this.f40503b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.BusinessHoursClearTitle);
                                    alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.BusinessHoursClearMessage);
                                    String string2 = LocaleController.getString(R.string.Remove);
                                    final TLRPC.UserFull userFull2 = userFull;
                                    final int i11 = i10;
                                    alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.z1() {
                                        @Override
                                        public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i122) {
                                            switch (r4) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull2;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new yy0(profileActivity22, 0));
                                                    profileActivity22.j5();
                                                    profileActivity22.d.u(i11);
                                                    profileActivity22.getMessagesStorage().updateUserInfo(userFull32, false);
                                                    return;
                                                default:
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    TLRPC.UserFull userFull4 = userFull2;
                                                    userFull4.business_location = null;
                                                    userFull4.flags2 &= -3;
                                                    ProfileActivity profileActivity3 = profileActivity;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new yy0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i11);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(alertDialog$Builder.f19548a);
                                    return;
                                default:
                                    final ProfileActivity profileActivity2 = this.f40503b;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder2.f19548a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                                    alertDialog$Builder2.f19548a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                                    String string3 = LocaleController.getString(R.string.Remove);
                                    final TLRPC.UserFull userFull3 = userFull;
                                    final int i12 = i10;
                                    alertDialog$Builder2.k(string3, new org.telegram.ui.ActionBar.z1() {
                                        @Override
                                        public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i122) {
                                            switch (r4) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull3;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity2;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new yy0(profileActivity22, 0));
                                                    profileActivity22.j5();
                                                    profileActivity22.d.u(i12);
                                                    profileActivity22.getMessagesStorage().updateUserInfo(userFull32, false);
                                                    return;
                                                default:
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    TLRPC.UserFull userFull4 = userFull3;
                                                    userFull4.business_location = null;
                                                    userFull4.flags2 &= -3;
                                                    ProfileActivity profileActivity3 = profileActivity2;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new yy0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i12);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity2.showDialog(alertDialog$Builder2.f19548a);
                                    return;
                            }
                        }
                    }, true);
                } else if (i10 == this.L3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new cc0(this, 10), false);
                } else if (i10 != this.K3 && i10 != this.J3 && i10 != this.W2) {
                    if (i10 == this.G3) {
                        H.c(R.drawable.menu_storage_path, LocaleController.getString(R.string.ProfilePhoneEdit), new cc0(this, 12), false);
                    } else if (i10 == this.U2) {
                        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileBirthdayChange), new Runnable(this) {
                            public final ProfileActivity f40248b;

                            {
                                this.f40248b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ProfileActivity profileActivity = this.f40248b;
                                        Activity parentActivity = profileActivity.getParentActivity();
                                        String string2 = LocaleController.getString(R.string.EditProfileBirthdayTitle);
                                        String string3 = LocaleController.getString(R.string.EditProfileBirthdayButton);
                                        TLRPC.UserFull userFull2 = userFull;
                                        profileActivity.showDialog(org.telegram.ui.Components.g5.l(parentActivity, string2, string3, userFull2.birthday, new mt(12, profileActivity, userFull2), new cc0(profileActivity, 13), false, false, profileActivity.f32703z0).f20838a);
                                        return;
                                    case 1:
                                        final ProfileActivity profileActivity2 = this.f40248b;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                        alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.BirthdayClearTitle);
                                        alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.BirthdayClearMessage);
                                        String string4 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull3 = userFull;
                                        alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.z1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull4 = userFull3;
                                                        userFull4.personal_channel_id = 0L;
                                                        userFull4.personal_channel_message = 0;
                                                        userFull4.flags2 &= -65;
                                                        ProfileActivity profileActivity3 = profileActivity2;
                                                        profileActivity3.getConnectionsManager().sendRequest(updatepersonalchannel, new yy0(profileActivity3, 3));
                                                        profileActivity3.e5(false, false);
                                                        profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                        return;
                                                    default:
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        TLRPC.UserFull userFull5 = userFull3;
                                                        userFull5.birthday = null;
                                                        userFull5.flags2 &= -33;
                                                        ProfileActivity profileActivity4 = profileActivity2;
                                                        profileActivity4.getMessagesController().invalidateContentSettings();
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new yy0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity2.showDialog(alertDialog$Builder.f19548a);
                                        return;
                                    default:
                                        final ProfileActivity profileActivity3 = this.f40248b;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity3.getParentActivity());
                                        alertDialog$Builder2.f19548a.R = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                        alertDialog$Builder2.f19548a.T = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                        String string5 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull4 = userFull;
                                        alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.z1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull4;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity3;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new yy0(profileActivity32, 3));
                                                        profileActivity32.e5(false, false);
                                                        profileActivity32.getMessagesStorage().updateUserInfo(userFull42, false);
                                                        return;
                                                    default:
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        TLRPC.UserFull userFull5 = userFull4;
                                                        userFull5.birthday = null;
                                                        userFull5.flags2 &= -33;
                                                        ProfileActivity profileActivity4 = profileActivity3;
                                                        profileActivity4.getMessagesController().invalidateContentSettings();
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new yy0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity3.showDialog(alertDialog$Builder2.f19548a);
                                        return;
                                }
                            }
                        }, false);
                        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new Runnable(this) {
                            public final ProfileActivity f40248b;

                            {
                                this.f40248b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ProfileActivity profileActivity = this.f40248b;
                                        Activity parentActivity = profileActivity.getParentActivity();
                                        String string2 = LocaleController.getString(R.string.EditProfileBirthdayTitle);
                                        String string3 = LocaleController.getString(R.string.EditProfileBirthdayButton);
                                        TLRPC.UserFull userFull2 = userFull;
                                        profileActivity.showDialog(org.telegram.ui.Components.g5.l(parentActivity, string2, string3, userFull2.birthday, new mt(12, profileActivity, userFull2), new cc0(profileActivity, 13), false, false, profileActivity.f32703z0).f20838a);
                                        return;
                                    case 1:
                                        final ProfileActivity profileActivity2 = this.f40248b;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                        alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.BirthdayClearTitle);
                                        alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.BirthdayClearMessage);
                                        String string4 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull3 = userFull;
                                        alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.z1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull3;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity2;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new yy0(profileActivity32, 3));
                                                        profileActivity32.e5(false, false);
                                                        profileActivity32.getMessagesStorage().updateUserInfo(userFull42, false);
                                                        return;
                                                    default:
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        TLRPC.UserFull userFull5 = userFull3;
                                                        userFull5.birthday = null;
                                                        userFull5.flags2 &= -33;
                                                        ProfileActivity profileActivity4 = profileActivity2;
                                                        profileActivity4.getMessagesController().invalidateContentSettings();
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new yy0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity2.showDialog(alertDialog$Builder.f19548a);
                                        return;
                                    default:
                                        final ProfileActivity profileActivity3 = this.f40248b;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity3.getParentActivity());
                                        alertDialog$Builder2.f19548a.R = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                        alertDialog$Builder2.f19548a.T = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                        String string5 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull4 = userFull;
                                        alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.z1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull4;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity3;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new yy0(profileActivity32, 3));
                                                        profileActivity32.e5(false, false);
                                                        profileActivity32.getMessagesStorage().updateUserInfo(userFull42, false);
                                                        return;
                                                    default:
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        TLRPC.UserFull userFull5 = userFull4;
                                                        userFull5.birthday = null;
                                                        userFull5.flags2 &= -33;
                                                        ProfileActivity profileActivity4 = profileActivity3;
                                                        profileActivity4.getMessagesController().invalidateContentSettings();
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new yy0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity3.showDialog(alertDialog$Builder2.f19548a);
                                        return;
                                }
                            }
                        }, true);
                    } else if (i10 == this.Q2) {
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(userFull.personal_channel_id));
                        if (chat != null && ChatObject.getPublicUsername(chat) != null) {
                            H.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileChannelCopy), new on0(26, this, chat), false);
                        }
                        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileChannelChange), new cc0(this, 6), false);
                        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new Runnable(this) {
                            public final ProfileActivity f40248b;

                            {
                                this.f40248b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ProfileActivity profileActivity = this.f40248b;
                                        Activity parentActivity = profileActivity.getParentActivity();
                                        String string2 = LocaleController.getString(R.string.EditProfileBirthdayTitle);
                                        String string3 = LocaleController.getString(R.string.EditProfileBirthdayButton);
                                        TLRPC.UserFull userFull2 = userFull;
                                        profileActivity.showDialog(org.telegram.ui.Components.g5.l(parentActivity, string2, string3, userFull2.birthday, new mt(12, profileActivity, userFull2), new cc0(profileActivity, 13), false, false, profileActivity.f32703z0).f20838a);
                                        return;
                                    case 1:
                                        final ProfileActivity profileActivity2 = this.f40248b;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                        alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.BirthdayClearTitle);
                                        alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.BirthdayClearMessage);
                                        String string4 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull3 = userFull;
                                        alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.z1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull3;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity2;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new yy0(profileActivity32, 3));
                                                        profileActivity32.e5(false, false);
                                                        profileActivity32.getMessagesStorage().updateUserInfo(userFull42, false);
                                                        return;
                                                    default:
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        TLRPC.UserFull userFull5 = userFull3;
                                                        userFull5.birthday = null;
                                                        userFull5.flags2 &= -33;
                                                        ProfileActivity profileActivity4 = profileActivity2;
                                                        profileActivity4.getMessagesController().invalidateContentSettings();
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new yy0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity2.showDialog(alertDialog$Builder.f19548a);
                                        return;
                                    default:
                                        final ProfileActivity profileActivity3 = this.f40248b;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity3.getParentActivity());
                                        alertDialog$Builder2.f19548a.R = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                        alertDialog$Builder2.f19548a.T = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                        String string5 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull4 = userFull;
                                        alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.z1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull4;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity3;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new yy0(profileActivity32, 3));
                                                        profileActivity32.e5(false, false);
                                                        profileActivity32.getMessagesStorage().updateUserInfo(userFull42, false);
                                                        return;
                                                    default:
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        TLRPC.UserFull userFull5 = userFull4;
                                                        userFull5.birthday = null;
                                                        userFull5.flags2 &= -33;
                                                        ProfileActivity profileActivity4 = profileActivity3;
                                                        profileActivity4.getMessagesController().invalidateContentSettings();
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new yy0(profileActivity4, 2));
                                                        profileActivity4.e5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity3.showDialog(alertDialog$Builder2.f19548a);
                                        return;
                                }
                            }
                        }, true);
                    }
                } else {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileEditBio), new cc0(this, 11), false);
                }
                if (H.x() > 0) {
                    H.Z();
                    return true;
                }
            }
        }
        return false;
    }

    public final void J4(float r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.J4(float):void");
    }

    @Override
    public final void K(boolean z10, boolean z11) {
        org.telegram.ui.Cells.z3 z3Var = this.f32573g0;
        if (z3Var == null) {
            return;
        }
        z3Var.setProgress(0.0f);
    }

    public final boolean K3() {
        s4.b1 b1Var;
        View view;
        if ((this.I0 || (!AndroidUtilities.isTablet() && !this.f32622n2)) && this.f32558e0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            this.F0 = true;
            this.f32629o2 = true;
            int i10 = 0;
            while (true) {
                b1Var = null;
                if (i10 < this.f32528a.getChildCount()) {
                    if (RecyclerView.R(this.f32528a.getChildAt(i10)) == 0) {
                        view = this.f32528a.getChildAt(i10);
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                lz0 lz0Var = this.f32528a;
                View F = lz0Var.F(view);
                if (F != null) {
                    b1Var = lz0Var.T(F);
                }
                if (b1Var != null) {
                    Integer num = (Integer) this.Y1.get(Integer.valueOf(b1Var.b()));
                    if (num != null) {
                        this.P1 = true;
                        this.f32528a.v0(0, -(((this.f32528a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), org.telegram.ui.Components.es.h);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void K4(TLRPC.ChatFull chatFull) {
        boolean z10;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        this.f32671u2 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.f32613m1 == 0) {
                this.f32613m1 = -j10;
                getMediaDataController().getMediaCounts(this.f32613m1, this.f32574g1, this.classGuid);
            }
        }
        r01 r01Var = this.O;
        if (r01Var != null) {
            r01Var.setChatInfo(this.f32671u2);
        }
        wz0 wz0Var = this.f32620n0;
        if (wz0Var != null && !this.f32641q1) {
            wz0Var.setChatInfo(this.f32671u2);
        }
        yz0 yz0Var = this.f32669u0;
        if (yz0Var != null && (chatFull3 = this.f32671u2) != null) {
            yz0Var.setStories(chatFull3.stories);
        }
        zh.f0 f0Var = this.f32676v0;
        if (f0Var != null) {
            f0Var.a();
        }
        vz0 vz0Var = this.f32558e0;
        if (vz0Var != null) {
            vz0Var.setHasStories(j4());
        }
        L3();
        if (this.f32567f1 != 0) {
            if (!BuildVars.IS_BILLING_UNAVAILABLE && !getMessagesController().premiumPurchaseBlocked() && (chatFull2 = this.f32671u2) != null && chatFull2.stargifts_available) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.T0.I(38, z10);
            org.telegram.ui.Components.ei0 ei0Var = this.f32529a0;
            if (ei0Var != null) {
                ei0Var.o(3, z10);
            }
        }
    }

    @Override
    public final boolean L(yy yyVar) {
        return false;
    }

    public final void L3() {
        TLRPC.Chat chat = this.E2;
        if (chat != null && chat.megagroup) {
            TLRPC.ChatFull chatFull = this.f32671u2;
            if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants != null) {
                for (int i10 = 0; i10 < this.f32671u2.participants.participants.size(); i10++) {
                    TLRPC.ChatParticipant chatParticipant = this.f32671u2.participants.participants.get(i10);
                    this.C1.k(chatParticipant, chatParticipant.user_id);
                }
            }
        }
    }

    public final void L4(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.Z != null && (tL_emojiStatusCollectible2 = this.f32579g6) != tL_emojiStatusCollectible) {
            if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
                this.f32579g6 = tL_emojiStatusCollectible;
                di.d4 d4Var = this.f32557d6;
                if (d4Var != null) {
                    d4Var.e(true);
                }
                if (tL_emojiStatusCollectible != null && !TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                    this.f32572f6 = null;
                    this.f32557d6 = new di.d4(getParentActivity(), 3);
                    this.f32564e6 = org.telegram.ui.ActionBar.g6.v(tL_emojiStatusCollectible.center_color | (-16777216), org.telegram.ui.ActionBar.g6.m1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
                    this.f32557d6.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                    di.d4 d4Var2 = this.f32557d6;
                    int m12 = org.telegram.ui.ActionBar.g6.m1(0.5f, (-16777216) | tL_emojiStatusCollectible.text_color);
                    d4Var2.A0 = true;
                    d4Var2.I0 = System.currentTimeMillis();
                    d4Var2.B0 = new Path();
                    d4Var2.C0 = AndroidUtilities.dpf2(0.66f) / 2.0f;
                    d4Var2.D0 = new Paint(1);
                    d4Var2.E0 = new Paint(1);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.g6.m1(0.0f, m12), org.telegram.ui.ActionBar.g6.m1(1.0f, m12), org.telegram.ui.ActionBar.g6.m1(0.0f, m12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    d4Var2.H0 = linearGradient;
                    d4Var2.E0.setShader(linearGradient);
                    d4Var2.F0 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.g6.m1(0.0f, m12), org.telegram.ui.ActionBar.g6.m1(0.5f, m12), org.telegram.ui.ActionBar.g6.m1(0.0f, m12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    d4Var2.G0 = new Matrix();
                    d4Var2.D0.setShader(d4Var2.F0);
                    d4Var2.E0.setStyle(Paint.Style.STROKE);
                    d4Var2.E0.setStrokeJoin(Paint.Join.ROUND);
                    d4Var2.E0.setStrokeCap(Paint.Cap.ROUND);
                    d4Var2.E0.setStrokeWidth(AndroidUtilities.dpf2(0.66f));
                    this.Z.addView(this.f32557d6, w7.a6.d(24.0f, -1));
                    this.f32557d6.t(9.33f);
                    di.d4 d4Var3 = this.f32557d6;
                    Typeface bold = AndroidUtilities.bold();
                    d4Var3.H.x(bold);
                    d4Var3.J.setTypeface(bold);
                    this.f32557d6.s(tL_emojiStatusCollectible.title);
                    di.d4 d4Var4 = this.f32557d6;
                    d4Var4.d = -1L;
                    d4Var4.k(5.66f, 2.66f, 5.66f, 2.66f);
                    di.d4 d4Var5 = this.f32557d6;
                    d4Var5.getClass();
                    d4Var5.f6818y = AndroidUtilities.dpf2(4.0f);
                    d4Var5.E = AndroidUtilities.dpf2(2.66f);
                    this.f32557d6.r();
                    this.f32557d6.q(16.0f);
                    this.f32557d6.u();
                    this.f32557d6.setOnClickListener(new dz0(this, tL_emojiStatusCollectible.slug, 1));
                    if (this.Q1 < AndroidUtilities.dp(82.0f)) {
                        this.f32572f6 = Boolean.FALSE;
                        this.f32557d6.setAlpha(0.0f);
                    }
                    V4();
                    di.d4 d4Var6 = this.f32557d6;
                    Objects.requireNonNull(d4Var6);
                    AndroidUtilities.runOnUIThread(new yk0(d4Var6, 27), 6000L);
                }
            }
        }
    }

    @Override
    public final void M() {
        org.telegram.ui.Components.pv0 pv0Var;
        r01 r01Var = this.O;
        if (r01Var != null && (pv0Var = this.R) != null) {
            r01Var.setNewMediaCounts(pv0Var.f28426c);
        }
        if (this.d != null) {
            e5(false, false);
        }
        R();
        if (this.f32678v2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final boolean M3() {
        org.telegram.ui.ActionBar.b5 b5Var;
        if (this.J1 != 0 && (b5Var = this.parentLayout) != null && b5Var.getFragmentStack() != null && this.parentLayout.getFragmentStack().size() >= 2 && (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof fo)) {
            finishFragment();
            return true;
        }
        return false;
    }

    public final void M4(y01 y01Var) {
        if (this.f32592i5 == y01Var) {
            return;
        }
        this.f32592i5 = y01Var;
        AndroidUtilities.forEachViews((RecyclerView) this.f32528a, (Utilities.Callback<View>) new xy0(this, 0));
    }

    public final void N3() {
        if (this.f32528a == null) {
            return;
        }
        float measuredWidth = (this.f32528a.getMeasuredWidth() / 2.0f) - ((((FrameLayout.LayoutParams) this.Y.getLayoutParams()).width * this.f32538b2) * 0.5f);
        this.Z1 = measuredWidth;
        if (this.G1) {
            this.Z1 = AndroidUtilities.lerp(this.O5, measuredWidth, this.S1);
        }
        this.Y.setTranslationX(this.Z1);
    }

    public final void N4(int i10) {
        boolean z10;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (!AndroidUtilities.isTablet()) {
            boolean z11 = false;
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.K1 = z10;
            if (i10 != 0) {
                z11 = true;
            }
            this.L1 = z11;
            k5();
            if (globalMainSettings.getBoolean("view_animations", true)) {
                this.J1 = i10;
            } else if (i10 == 2) {
                this.f32621n1 = true;
            }
        }
    }

    public final int O3() {
        int i10 = 0;
        if (this.f32559e1 != 0 && this.f32640q0 != null && !this.f32656s1) {
            return 0;
        }
        if (this.I4) {
            i10 = 25;
        }
        return AndroidUtilities.dp(74 + i10);
    }

    public final void O4(TLRPC.UserFull userFull, org.telegram.ui.Cells.g6 g6Var, t11 t11Var) {
        boolean z10;
        this.f32678v2 = userFull;
        org.telegram.ui.Components.hx0 hx0Var = this.T;
        if (hx0Var != null) {
            hx0Var.set(userFull.stars_rating);
        }
        yz0 yz0Var = this.f32669u0;
        if (yz0Var != null) {
            yz0Var.setStories(this.f32678v2.stories);
        }
        zh.f0 f0Var = this.f32676v0;
        if (f0Var != null) {
            f0Var.a();
        }
        vz0 vz0Var = this.f32558e0;
        if (vz0Var != null) {
            vz0Var.setHasStories(j4());
        }
        r01 r01Var = this.O;
        if (r01Var != null) {
            r01Var.setUserInfo(this.f32678v2);
        }
        if (this.f32686w2 == null) {
            this.f32686w2 = g6Var;
        }
        if (this.f32686w2 == null) {
            this.f32686w2 = new org.telegram.ui.Cells.g6(this.currentAccount);
        }
        org.telegram.ui.Cells.g6 g6Var2 = this.f32686w2;
        cc0 cc0Var = new cc0(this, 20);
        if (g6Var2.f21221c) {
            cc0Var.run();
        } else {
            g6Var2.h.add(cc0Var);
        }
        this.f32686w2.d(this.f32678v2);
        if (this.f32700y2 == null) {
            this.f32700y2 = t11Var;
        }
        t11 t11Var2 = this.f32700y2;
        if (t11Var2 == null) {
            t11 c10 = t11.c(this.currentAccount, this.f32678v2, t11Var2);
            this.f32700y2 = c10;
            if (c10 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f32693x2 = z10;
        }
        t11 t11Var3 = this.f32700y2;
        if (t11Var3 != null) {
            cc0 cc0Var2 = new cc0(this, 16);
            if (t11Var3.f40268b) {
                cc0Var2.run();
            } else {
                t11Var3.h.add(cc0Var2);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.T0;
        if (u0Var != null) {
            u0Var.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.f32559e1)));
            if (e4()) {
                this.T0.K(44);
            } else {
                this.T0.r(44);
            }
        }
    }

    public final int P3(ImageReceiver imageReceiver) {
        if (imageReceiver.getDrawable() instanceof org.telegram.ui.Components.s71) {
            return ((org.telegram.ui.Components.s71) imageReceiver.getDrawable()).f29052a.a();
        }
        return AndroidUtilities.calcBitmapColor(this.f32558e0.getImageReceiver().getBitmap());
    }

    public final void P4(boolean z10, boolean z11) {
        if (this.f32573g0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.f32566f0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f32566f0 = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f32566f0 = animatorSet2;
            if (z10) {
                this.f32573g0.setVisibility(0);
                this.f32566f0.playTogether(ObjectAnimator.ofFloat(this.f32573g0, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f32573g0, View.ALPHA, 0.0f));
            }
            this.f32566f0.setDuration(180L);
            this.f32566f0.addListener(new j01(this, z10, 1));
            this.f32566f0.start();
        } else if (z10) {
            this.f32573g0.setAlpha(1.0f);
            this.f32573g0.setVisibility(0);
        } else {
            this.f32573g0.setAlpha(0.0f);
            this.f32573g0.setVisibility(4);
        }
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new gi.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 5));
    }

    public final org.telegram.ui.Components.q5 Q3(int i10, long j10) {
        int i11;
        org.telegram.ui.Components.q5[] q5VarArr = this.H;
        if (q5VarArr[i10] == null) {
            org.telegram.ui.ActionBar.h5 h5Var = this.f32565f[i10];
            int dp = AndroidUtilities.dp(17.0f);
            if (i10 == 0) {
                i11 = 7;
            } else {
                i11 = 2;
            }
            org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(dp, i11, h5Var, false);
            q5VarArr[i10] = q5Var;
            int dp2 = AndroidUtilities.dp(1.0f);
            q5Var.I = 0;
            q5Var.J = dp2;
            if (this.G0) {
                q5VarArr[i10].a();
            }
        }
        if (j10 != 0) {
            q5VarArr[i10].j(j10, false);
        } else {
            q5VarArr[i10].g(null, false);
        }
        X4();
        return q5VarArr[i10];
    }

    public final void Q4() {
        int i10;
        int i11;
        Long l4;
        if (this.B5 != null) {
            return;
        }
        i71[] i71VarArr = new i71[1];
        Rect rect = AndroidUtilities.rectTmp2;
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f32565f;
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
        if (h5VarArr[1].getScaleX() < 1.5f) {
            i10 = 16;
        } else {
            i10 = 32;
        }
        int i12 = i10;
        int dp = (-(this.Z.getHeight() - rect.centerY())) - AndroidUtilities.dp(i12);
        int min = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
        int centerX = rect.centerX();
        int b10 = w7.s.b(centerX - (min / 2), 0, AndroidUtilities.displaySize.x - min);
        Activity parentActivity = getParentActivity();
        Integer valueOf = Integer.valueOf(Math.max(0, centerX - b10));
        if (this.E2 == null) {
            i11 = 0;
        } else {
            i11 = 9;
        }
        b01 b01Var = new b01(this, this, parentActivity, valueOf, i11, this.f32703z0, i12, i71VarArr);
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f32559e1));
        if (user != null) {
            b01Var.setExpireDateHint(DialogObject.getEmojiStatusUntil(user.emoji_status));
        }
        Long l10 = this.F;
        org.telegram.ui.Components.q5[] q5VarArr = this.G;
        if (l10 != null) {
            b01Var.setSelected(l10);
        } else {
            org.telegram.ui.Components.q5 q5Var = q5VarArr[1];
            if (q5Var != null) {
                Drawable drawable = q5Var.f28516f[0];
                if (drawable instanceof org.telegram.ui.Components.s5) {
                    l4 = Long.valueOf(((org.telegram.ui.Components.s5) drawable).i());
                    b01Var.setSelected(l4);
                }
            }
            l4 = null;
            b01Var.setSelected(l4);
        }
        b01Var.setSaveState(3);
        b01Var.y(q5VarArr[1], h5VarArr[1]);
        c01 c01Var = new c01(this, b01Var);
        this.B5 = c01Var;
        i71VarArr[0] = c01Var;
        int[] iArr = new int[2];
        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[1];
        if (h5Var2 != null) {
            h5Var2.getLocationOnScreen(iArr);
        }
        i71VarArr[0].showAsDropDown(this.fragmentView, b10, dp, 51);
        i71VarArr[0].b();
    }

    @Override
    public final void R() {
        String str;
        int size;
        int i10;
        r01 r01Var = this.O;
        if (r01Var != null && this.f32654s != null) {
            int closestTab = r01Var.getClosestTab();
            int[] iArr = this.R.f28426c;
            int i11 = 0;
            if (closestTab == 0) {
                if (iArr[7] <= 0 && iArr[6] <= 0) {
                    int i12 = iArr[0];
                    if (i12 <= 0) {
                        this.f32654s.setText(LocaleController.getString(R.string.SharedMedia));
                    } else {
                        this.f32654s.setText(LocaleController.formatPluralString("Media", i12, new Object[0]));
                    }
                } else if (this.O.getPhotosVideosTypeFilter() != 1 && iArr[7] > 0) {
                    if (this.O.getPhotosVideosTypeFilter() != 2 && (i10 = iArr[6]) > 0) {
                        this.f32654s.setText(a1.g.D(LocaleController.formatPluralString("Photos", i10, new Object[0]), ", ", LocaleController.formatPluralString("Videos", iArr[7], new Object[0])));
                    } else {
                        this.f32654s.setText(LocaleController.formatPluralString("Videos", iArr[7], new Object[0]));
                    }
                } else {
                    this.f32654s.setText(LocaleController.formatPluralString("Photos", iArr[6], new Object[0]));
                }
            } else if (closestTab == 1) {
                int i13 = iArr[1];
                if (i13 <= 0) {
                    this.f32654s.setText(LocaleController.getString(R.string.Files));
                } else {
                    this.f32654s.setText(LocaleController.formatPluralString("Files", i13, new Object[0]));
                }
            } else if (closestTab == 2) {
                int i14 = iArr[2];
                if (i14 <= 0) {
                    this.f32654s.setText(LocaleController.getString(R.string.Voice));
                } else {
                    this.f32654s.setText(LocaleController.formatPluralString("Voice", i14, new Object[0]));
                }
            } else if (closestTab == 3) {
                int i15 = iArr[3];
                if (i15 <= 0) {
                    this.f32654s.setText(LocaleController.getString(R.string.SharedLinks));
                } else {
                    this.f32654s.setText(LocaleController.formatPluralString("Links", i15, new Object[0]));
                }
            } else if (closestTab == 4) {
                int i16 = iArr[4];
                if (i16 <= 0) {
                    this.f32654s.setText(LocaleController.getString(R.string.Music));
                } else {
                    this.f32654s.setText(LocaleController.formatPluralString("MusicFiles", i16, new Object[0]));
                }
            } else if (closestTab == 5) {
                int i17 = iArr[5];
                if (i17 <= 0) {
                    this.f32654s.setText(LocaleController.getString(R.string.AccDescrGIFs));
                } else {
                    this.f32654s.setText(LocaleController.formatPluralString("GIFs", i17, new Object[0]));
                }
            } else if (closestTab == 6) {
                this.f32654s.setText(LocaleController.formatPluralString("CommonGroups", this.f32678v2.common_chats_count, new Object[0]));
            } else if (closestTab == 7) {
                this.f32654s.setText(this.f32646r[1].getText());
            } else if (closestTab != 8 && !org.telegram.ui.Components.xv0.w0(closestTab)) {
                if (closestTab == 13) {
                    this.f32654s.setText(this.O.V(true));
                } else if (closestTab == 9) {
                    this.f32654s.setText(LocaleController.formatPluralString("ProfileStoriesArchiveCount", this.O.c0(closestTab), new Object[0]));
                } else if (closestTab == 10) {
                    MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(a());
                    org.telegram.ui.Components.ep0 ep0Var = this.f32654s;
                    if (this.f32649r2) {
                        str = "Bots";
                    } else {
                        str = "Channels";
                    }
                    if (channelRecommendations == null) {
                        size = 0;
                    } else {
                        size = channelRecommendations.chats.size() + channelRecommendations.more;
                    }
                    ep0Var.setText(LocaleController.formatPluralString(str, size, new Object[0]));
                } else if (closestTab == 12) {
                    this.f32654s.setText(LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, getMessagesController().getSavedMessagesController().getMessagesCount(a())), new Object[0]));
                } else if (closestTab == 14) {
                    org.telegram.ui.Components.ep0 ep0Var2 = this.f32654s;
                    org.telegram.ui.Components.ns0 ns0Var = this.O.V;
                    if (ns0Var != null) {
                        i11 = ns0Var.getGiftsCount();
                    }
                    ep0Var2.setText(LocaleController.formatPluralStringComma("ProfileGiftsCount", i11));
                } else if (closestTab == 15) {
                    int i18 = iArr[8];
                    if (i18 <= 0) {
                        this.f32654s.setText(LocaleController.getString(R.string.SharedPollTab));
                    } else {
                        this.f32654s.setText(LocaleController.formatPluralStringComma("ProfilePollsCount", i18));
                    }
                }
            } else if (this.f32649r2) {
                this.f32654s.setText(this.O.V(false));
            } else if (this.O.c0(closestTab) > 0) {
                this.f32654s.setText(LocaleController.formatPluralString("ProfileStoriesCount", this.O.c0(closestTab), new Object[0]));
            } else {
                this.f32654s.setText(LocaleController.getString(R.string.ProfileStoriesCountZero));
            }
        }
    }

    public final void R3(boolean z10) {
        a0.h hVar;
        int i10;
        if (!this.B1 && (hVar = this.C1) != null && this.f32671u2 != null) {
            this.B1 = true;
            int i11 = 0;
            if (hVar.m() != 0 && z10) {
                i10 = 300;
            } else {
                i10 = 0;
            }
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.f32567f1);
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            if (!z10) {
                i11 = this.C1.m();
            }
            tL_channels_getParticipants.offset = i11;
            tL_channels_getParticipants.limit = 200;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new hg.u(this, tL_channels_getParticipants, i10)), this.classGuid);
        }
    }

    public final void R4() {
        int i10 = 0;
        this.O.I0.setReordering(false);
        r01 r01Var = this.O;
        org.telegram.ui.Components.nt0 nt0Var = r01Var.I0;
        if (r01Var.f31388v1 != null && nt0Var != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = nt0Var.getTabIds();
            int size = tabIds.size();
            while (i10 < size) {
                Integer num = tabIds.get(i10);
                i10++;
                TLRPC.ProfileTab d02 = org.telegram.ui.Components.xv0.d0(num.intValue(), r01Var.f31350d1 instanceof TLRPC.TL_channelFull);
                if (d02 != null) {
                    arrayList.add(d02);
                }
            }
        }
        this.O.v1(true);
        this.f32702y5.animate().translationY(AndroidUtilities.dp(69.0f)).setDuration(180L).setInterpolator(org.telegram.ui.Components.es.h).withEndAction(new cc0(this, 21)).start();
        org.telegram.ui.Components.zc.a0(this).Q(R.raw.contact_check, 36, "Tab order changed.").j();
    }

    public final org.telegram.ui.Components.q5 S3(TLRPC.EmojiStatus emojiStatus, boolean z10, int i10) {
        int i11;
        org.telegram.ui.Components.q5[] q5VarArr = this.G;
        if (q5VarArr[i10] == null) {
            org.telegram.ui.ActionBar.h5 h5Var = this.f32565f[i10];
            int dp = AndroidUtilities.dp(24.0f);
            if (i10 == 0) {
                i11 = 7;
            } else {
                i11 = 2;
            }
            org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(dp, i11, h5Var, false);
            q5VarArr[i10] = q5Var;
            if (this.G0) {
                q5Var.a();
            }
        }
        if (i10 == 1) {
            this.F = null;
        }
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((1 & tL_emojiStatus.flags) != 0 && tL_emojiStatus.until <= ((int) (System.currentTimeMillis() / 1000))) {
                q5VarArr[i10].g(Y3(i10), z10);
                q5VarArr[i10].m(false, z10);
            } else {
                q5VarArr[i10].j(tL_emojiStatus.document_id, z10);
                q5VarArr[i10].m(false, z10);
            }
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) != 0 && tL_emojiStatusCollectible.until <= ((int) (System.currentTimeMillis() / 1000))) {
                q5VarArr[i10].g(Y3(i10), z10);
                q5VarArr[i10].m(false, z10);
            } else {
                if (i10 == 1) {
                    this.F = Long.valueOf(tL_emojiStatusCollectible.collectible_id);
                }
                q5VarArr[i10].j(tL_emojiStatusCollectible.document_id, z10);
                q5VarArr[i10].m(true, z10);
            }
        } else {
            q5VarArr[i10].g(Y3(i10), z10);
            q5VarArr[i10].m(false, z10);
        }
        X4();
        return q5VarArr[i10];
    }

    public final void S4() {
        int i10;
        float f7;
        l0 l0Var;
        if (this.f32529a0 != null && this.f32646r[1] != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int i11 = currentActionBarHeight + i10;
            org.telegram.ui.Components.ei0 ei0Var = this.f32529a0;
            boolean z10 = this.G1;
            ei0Var.e = z10;
            if (z10 && this.J1 == 2 && (l0Var = this.Y) != null) {
                this.f32529a0.f24715f = this.Y.getY() + (this.Y.getScaleY() * l0Var.getHeight());
                this.f32529a0.setAlpha(this.S1);
                org.telegram.ui.Components.ei0 ei0Var2 = this.f32529a0;
                ei0Var2.E = AndroidUtilities.dp(74.0f);
                ei0Var2.setTranslationY(this.f32528a.getMeasuredWidth());
                ei0Var2.invalidate();
            } else {
                ei0Var.f24715f = -1.0f;
                float f10 = i11;
                float f11 = this.Q1 + f10;
                if (this.I4) {
                    f7 = 25.0f;
                } else {
                    f7 = 0.0f;
                }
                float dp = f11 - AndroidUtilities.dp(f7);
                float min = Math.min(AndroidUtilities.dp(74.0f), dp - f10);
                org.telegram.ui.Components.ei0 ei0Var3 = this.f32529a0;
                ei0Var3.E = min;
                ei0Var3.setTranslationY(dp - min);
                ei0Var3.invalidate();
            }
            ImageView imageView = this.O0;
            if (imageView != null && imageView.getTag() != null) {
                this.f32529a0.getClass();
                if (this.O0.getVisibility() == 0) {
                    this.O0.setVisibility(8);
                }
                if (this.O0.getTag() instanceof org.telegram.ui.ActionBar.u0) {
                    ((org.telegram.ui.ActionBar.u0) this.O0.getTag()).setAlpha(1.0f);
                }
            }
        }
    }

    @Override
    public final boolean T() {
        return this.A1;
    }

    public final int T3() {
        return O3() + U3();
    }

    public final void T4() {
        int i10;
        if (this.Z0 != null && this.f32530a1 != null) {
            TLRPC.UserFull userFull = this.f32678v2;
            if (userFull == null && this.f32671u2 == null) {
                i10 = 0;
            } else if (userFull != null) {
                i10 = userFull.ttl_period;
            } else {
                i10 = this.f32671u2.ttl_period;
            }
            this.f32655s0.b(i10);
            this.f32530a1.b(i10);
        }
    }

    public final int U3() {
        if (O3() == 0) {
            return AndroidUtilities.dp(168.0f);
        }
        return AndroidUtilities.dp(152.0f);
    }

    public final void U4() {
        float dp;
        boolean z10;
        if (this.f32660s5 != null) {
            r01 r01Var = this.O;
            if (r01Var != null && r01Var.isAttachedToWindow()) {
                dp = AndroidUtilities.dp(232.0f) - (this.f32528a.getMeasuredHeight() - this.O.getY());
            } else {
                dp = AndroidUtilities.dp(72.0f);
            }
            int i10 = 0;
            if (dp <= 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            ne.b bVar = this.A5;
            bVar.a(z10, true);
            float f7 = bVar.e;
            this.f32660s5.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f), 0, f7));
            this.f32660s5.setAlpha(f7);
            FrameLayout frameLayout = this.f32660s5;
            if (f7 <= 0.0f) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
            org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.f29095w;
            if (scVar != null) {
                scVar.l();
            }
        }
    }

    public final Drawable V3() {
        if (this.f32690x == null) {
            this.f32690x = org.telegram.ui.ActionBar.g6.l4.getConstantState().newDrawable().mutate();
        }
        return this.f32690x;
    }

    public final void V4() {
        di.d4 d4Var = this.f32557d6;
        if (d4Var != null) {
            org.telegram.ui.ActionBar.h5[] h5VarArr = this.f32565f;
            boolean z10 = true;
            float x10 = h5VarArr[1].getX() + (-d4Var.getPaddingLeft());
            float lerp = AndroidUtilities.lerp(0.45f, 0.25f, this.f32603k2);
            float f7 = 0.0f;
            d4Var.m(0.0f, (h5VarArr[1].getScaleX() * (h5VarArr[1].getRightDrawableX() - (lerp * h5VarArr[1].getRightDrawableWidth()))) + x10);
            float lerp2 = AndroidUtilities.lerp(this.f32614m2, this.f32609l2);
            di.d4 d4Var2 = this.f32557d6;
            d4Var2.setTranslationY(((h5VarArr[1].getY() + (-d4Var2.getPaddingBottom())) - AndroidUtilities.dp(24.0f)) + AndroidUtilities.lerp(AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(12.0f), lerp2));
            this.f32557d6.h(i0.a.d(lerp2, this.f32564e6, 1342177280));
            if (this.Q1 < AndroidUtilities.dp(82.0f)) {
                z10 = false;
            }
            Boolean bool = this.f32572f6;
            if (bool != null && bool.booleanValue() == z10) {
                return;
            }
            ViewPropertyAnimator animate = this.f32557d6.animate();
            this.f32572f6 = Boolean.valueOf(z10);
            if (z10) {
                f7 = 1.0f;
            }
            org.telegram.messenger.yh.s(animate.alpha(f7), org.telegram.ui.Components.es.f24772g, 200L);
        }
    }

    public final float W3(float f7) {
        this.Z5 = f7;
        int i10 = this.J1;
        float f10 = 1.0f;
        if (i10 != 2) {
            if (this.S1 < 1.0f && i10 != 0) {
                f10 = 0.0f;
            } else {
                f10 = this.f32603k2;
            }
        }
        return Math.max(0.0f, (Z3() + this.f32632o5) * Utilities.clamp01(f10)) + f7;
    }

    public final void W4() {
        if (getParentActivity() != null && this.V0 != null) {
            if (getUserConfig().isPremium()) {
                this.V0.setIcon(R.drawable.menu_profile_colors);
                return;
            }
            Drawable drawable = getParentActivity().getDrawable(R.drawable.menu_profile_colors_locked);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.F8, this.f32703z0), PorterDuff.Mode.SRC_IN));
            Drawable drawable2 = getParentActivity().getDrawable(R.drawable.msg_gallery_locked2);
            drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            this.V0.setIcon(new bi.j3(drawable, drawable2, AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f)));
        }
    }

    public final float X3(float f7) {
        float f10;
        this.f32534a6 = f7;
        int i10 = this.J1;
        float f11 = 0.0f;
        if (i10 == 2) {
            f10 = 1.0f;
        } else if (this.S1 < 1.0f && i10 != 0) {
            f10 = 0.0f;
        } else {
            f10 = this.f32603k2;
        }
        float clamp01 = Utilities.clamp01(f10);
        if (this.T != null) {
            f11 = this.T.getVisibilityFactor() * AndroidUtilities.dp(3.0f);
        }
        return com.google.android.gms.internal.play_billing.k3.y(1.0f, clamp01, f11, f7);
    }

    public final void X4() {
        Y4(this.P5);
    }

    public final org.telegram.ui.Components.ds Y3(int i10) {
        org.telegram.ui.Components.ds[] dsVarArr = this.K;
        if (dsVarArr[i10] == null) {
            Drawable mutate = getParentActivity().getDrawable(R.drawable.msg_premium_liststar).mutate();
            Drawable[] drawableArr = this.E;
            drawableArr[i10] = mutate;
            drawableArr[i10].setColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20315zh, this.f32703z0), PorterDuff.Mode.MULTIPLY);
            dsVarArr[i10] = new org.telegram.ui.Components.ds(drawableArr[i10], getParentActivity().getDrawable(R.drawable.msg_premium_prolfilestar).mutate());
        }
        return dsVarArr[i10];
    }

    public final void Y4(float f7) {
        int offsetColor;
        for (int i10 = 0; i10 < 2; i10++) {
            MessagesController.PeerColor peerColor = this.Q5;
            if (peerColor != null && i10 == 1) {
                offsetColor = i0.a.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.g6.I.q()), -1);
            } else {
                offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20315zh, this.f32703z0), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oi, this.f32703z0), this.E5, 1.0f);
            }
            int d = i0.a.d(f7, offsetColor, -1);
            int i11 = org.telegram.ui.ActionBar.g6.Oi;
            int d10 = i0.a.d(this.E5, d, org.telegram.ui.ActionBar.g6.w0(i11, this.f32703z0));
            org.telegram.ui.Components.q5 q5Var = this.G[i10];
            if (q5Var != null) {
                q5Var.k(Integer.valueOf(d10));
            }
            org.telegram.ui.Components.q5 q5Var2 = this.H[i10];
            if (q5Var2 != null) {
                q5Var2.k(Integer.valueOf(i0.a.d(this.E5, i0.a.d(f7, offsetColor, -1711276033), org.telegram.ui.ActionBar.g6.w0(i11, this.f32703z0))));
            }
            if (i10 == 1) {
                this.f32551d0.setColor(d10);
            }
        }
        this.P5 = f7;
    }

    public final float Z3() {
        if (this.T != null) {
            return this.T.getVisibilityFactor() * AndroidUtilities.dp(22.0f);
        }
        return 0.0f;
    }

    public final void Z4() {
        org.telegram.ui.Cells.o oVar = this.f32551d0;
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f32565f;
        oVar.setScaleX(h5VarArr[1].getScaleX());
        this.f32551d0.setScaleY(h5VarArr[1].getScaleY());
        this.f32551d0.b((h5VarArr[1].getScaleX() * h5VarArr[1].getRightDrawableX()) + h5VarArr[1].getX(), (h5VarArr[1].getHeight() - (h5VarArr[1].getScaleY() * (h5VarArr[1].getHeight() - h5VarArr[1].getRightDrawableY()))) + h5VarArr[1].getY());
    }

    public final long a() {
        long j10 = this.f32588i1;
        if (j10 != 0) {
            return j10;
        }
        long j11 = this.f32559e1;
        if (j11 != 0) {
            return j11;
        }
        return -this.f32567f1;
    }

    public final org.telegram.ui.Components.zm0 a4(int i10) {
        if (this.L == null) {
            org.telegram.ui.Components.zm0 zm0Var = new org.telegram.ui.Components.zm0(i10);
            this.L = zm0Var;
            zm0Var.b(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19975h8, this.f32703z0));
        }
        return this.L;
    }

    public final void a5() {
        if (!this.f32641q1 && ChatObject.isForum(this.E2)) {
            getNotificationsController().loadTopicsNotificationsExceptions(-this.f32567f1, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    ProfileActivity profileActivity = ProfileActivity.this;
                    HashSet hashSet = profileActivity.f32585h5;
                    ArrayList arrayList = new ArrayList((HashSet) obj);
                    int i10 = 0;
                    while (i10 < arrayList.size()) {
                        if (profileActivity.getMessagesController().getTopicsController().findTopic(profileActivity.f32567f1, ((Integer) arrayList.get(i10)).intValue()) == null) {
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
    }

    public final q11 b4() {
        if (this.f32542b6 == null) {
            q11 q11Var = new q11(LocaleController.getString(R.string.StatusHiddenShow));
            this.f32542b6 = q11Var;
            q11Var.setAlpha((int) (Math.min(1.0f, this.Q1 / T3()) * 255.0f));
            this.f32542b6.a(i0.a.d(this.f32603k2, org.telegram.ui.ActionBar.g6.m1(0.5f, org.telegram.ui.ActionBar.g6.b(0.18f, -0.1f, this.f32545c1)), 603979775));
        }
        return this.f32542b6;
    }

    public final void b5(float f7) {
        g11 g11Var;
        ValueAnimator valueAnimator;
        if (this.f32636p2 || ((g11Var = this.N) != null && (valueAnimator = g11Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.N.getLayoutParams();
            layoutParams.width = this.f32528a.getMeasuredWidth();
            layoutParams.height = (int) (this.Q1 + f7);
            this.N.requestLayout();
        }
        s11 s11Var = this.f32552d1;
        if (s11Var != null) {
            s11Var.E.setTranslate(0.0f, this.a2 - s11Var.f39929x);
            s11 s11Var2 = this.f32552d1;
            RadialGradient radialGradient = s11Var2.f39930y;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(s11Var2.E);
            }
            this.f32552d1.invalidate();
        }
        Z4();
        S4();
        f5();
    }

    public final int c4() {
        float f7;
        if (this.f32641q1) {
            return 0;
        }
        if (this.f32567f1 != 0 && ChatObject.isForum(getMessagesController().getChat(Long.valueOf(this.f32567f1)))) {
            if (j4()) {
                f7 = 24.0f;
            } else {
                f7 = 38.0f;
            }
            return AndroidUtilities.dp(f7);
        }
        return AndroidUtilities.dp(50.0f);
    }

    public final void c5() {
        TLRPC.User user;
        boolean z10;
        int i10;
        int i11;
        if (this.f32656s1 && this.X0 != null && this.W0 != null && (user = getMessagesController().getUser(Long.valueOf(this.f32559e1))) != null) {
            int i12 = 0;
            if (UserObject.getPublicUsername(user) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.e1 e1Var = this.X0;
            if (z10) {
                i10 = R.drawable.menu_username_change;
            } else {
                i10 = R.drawable.menu_username_set;
            }
            e1Var.setIcon(i10);
            org.telegram.ui.ActionBar.e1 e1Var2 = this.X0;
            if (z10) {
                i11 = R.string.ProfileUsernameEdit;
            } else {
                i11 = R.string.ProfileUsernameSet;
            }
            e1Var2.setText(LocaleController.getString(i11));
            org.telegram.ui.ActionBar.e1 e1Var3 = this.W0;
            if (UserObject.getPublicUsername(user) == null) {
                i12 = 8;
            }
            e1Var3.setVisibility(i12);
        }
    }

    @Override
    public final boolean canBeginSlide() {
        if (!this.O.x0()) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final void clearViews() {
        this.Q5 = null;
        super.clearViews();
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.createActionBar(android.content.Context):org.telegram.ui.ActionBar.k");
    }

    @Override
    public final android.view.View createView(android.content.Context r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.createView(android.content.Context):android.view.View");
    }

    public final org.telegram.ui.Components.ds d4(int i10) {
        MessagesController.PeerColor peerColor;
        int color3;
        float f7;
        org.telegram.ui.Components.ds[] dsVarArr = this.J;
        if (dsVarArr[i10] == null) {
            Drawable mutate = org.telegram.ui.ActionBar.g6.Q1.getConstantState().newDrawable().mutate();
            Drawable[] drawableArr = this.f32697y;
            drawableArr[i10] = mutate;
            Drawable mutate2 = org.telegram.ui.ActionBar.g6.R1.getConstantState().newDrawable().mutate();
            Drawable[] drawableArr2 = this.I;
            drawableArr2[i10] = mutate2;
            if (i10 == 1 && (peerColor = this.Q5) != null) {
                if (peerColor.hasColor6(org.telegram.ui.ActionBar.g6.I.q())) {
                    color3 = this.Q5.getColor5();
                } else {
                    color3 = this.Q5.getColor3();
                }
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f7 = -0.1f;
                } else {
                    f7 = -0.08f;
                }
                int b10 = org.telegram.ui.ActionBar.g6.b(0.1f, f7, color3);
                Drawable drawable = drawableArr[1];
                int offsetColor = AndroidUtilities.getOffsetColor(b10, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oi, this.f32703z0), this.E5, 1.0f);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(offsetColor, mode);
                drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(-1, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, this.f32703z0), this.E5, 1.0f), mode);
            }
            dsVarArr[i10] = new org.telegram.ui.Components.ds(new org.telegram.ui.Components.cr(drawableArr[i10], drawableArr2[i10]), getParentActivity().getDrawable(R.drawable.verified_profile));
        }
        return dsVarArr[i10];
    }

    public final void d5() {
        e5(false, false);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        f11 f11Var;
        boolean z10;
        Object[] objArr2;
        TLRPC.ChatFull chatFull;
        TLRPC.User user;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.InputGroupCall inputGroupCall;
        boolean z11;
        TLRPC.Chat chat;
        Object[] objArr3;
        lz0 lz0Var;
        lz0 lz0Var2;
        org.telegram.ui.Components.wl0 wl0Var;
        if (i10 != NotificationCenter.uploadStoryEnd && i10 != NotificationCenter.chatWasBoostedByUser) {
            boolean z12 = true;
            int i12 = 0;
            r3 = false;
            boolean z13 = false;
            if (i10 == NotificationCenter.updateInterfaces) {
                int intValue = ((Integer) objArr[0]).intValue();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (MessagesController.UPDATE_MASK_NAME & intValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & intValue) == 0 && (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) == 0) {
                    objArr3 = null;
                } else {
                    objArr3 = 1;
                }
                if (this.f32559e1 != 0) {
                    if (objArr3 != null) {
                        i5(true);
                    }
                    if ((intValue & MessagesController.UPDATE_MASK_PHONE) != 0 && (lz0Var2 = this.f32528a) != null && (wl0Var = (org.telegram.ui.Components.wl0) lz0Var2.L(this.G3, false)) != null) {
                        this.d.v(wl0Var, this.G3);
                    }
                } else if (this.f32567f1 != 0) {
                    if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) != 0) {
                        if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0) {
                            e5(true, false);
                        } else {
                            h5(true);
                        }
                        i5(true);
                    }
                    if (objArr3 != null && (lz0Var = this.f32528a) != null) {
                        int childCount = lz0Var.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = this.f32528a.getChildAt(i13);
                            if (childAt instanceof org.telegram.ui.Cells.xa) {
                                ((org.telegram.ui.Cells.xa) childAt).j(intValue);
                            }
                        }
                    }
                }
            } else if (i10 == NotificationCenter.chatOnlineCountDidLoad) {
                Long l4 = (Long) objArr[0];
                if (this.f32671u2 != null && (chat = this.E2) != null && chat.f19216id == l4.longValue()) {
                    this.f32671u2.online_count = ((Integer) objArr[1]).intValue();
                    h5(true);
                    i5(false);
                }
            } else if (i10 != NotificationCenter.contactsDidLoad && i10 != NotificationCenter.channelRightsUpdated) {
                if (i10 == NotificationCenter.encryptedChatCreated) {
                    if (this.f32595j1) {
                        AndroidUtilities.runOnUIThread(new on0(24, this, objArr));
                    }
                } else if (i10 == NotificationCenter.encryptedChatUpdated) {
                    TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                    TLRPC.EncryptedChat encryptedChat2 = this.D2;
                    if (encryptedChat2 != null && encryptedChat.f19224id == encryptedChat2.f19224id) {
                        this.D2 = encryptedChat;
                        e5(false, false);
                        FlagSecureReason flagSecureReason = this.X1;
                        if (flagSecureReason != null) {
                            flagSecureReason.invalidate();
                        }
                    }
                } else if (i10 == NotificationCenter.blockedUsersDidLoad) {
                    boolean z14 = this.f32602k1;
                    if (getMessagesController().blockePeers.indexOfKey(this.f32559e1) >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f32602k1 = z11;
                    if (z14 != z11) {
                        D3(true);
                        e5(false, false);
                    }
                } else if (i10 == NotificationCenter.groupCallUpdated) {
                    Long l10 = (Long) objArr[0];
                    if (this.E2 != null) {
                        long longValue = l10.longValue();
                        TLRPC.Chat chat2 = this.E2;
                        if (longValue == chat2.f19216id && ChatObject.canManageCalls(chat2)) {
                            TLRPC.ChatFull chatFull4 = MessagesController.getInstance(this.currentAccount).getChatFull(l10.longValue());
                            if (chatFull4 != null) {
                                TLRPC.ChatFull chatFull5 = this.f32671u2;
                                if (chatFull5 != null) {
                                    chatFull4.participants = chatFull5.participants;
                                }
                                this.f32671u2 = chatFull4;
                            }
                            r01 r01Var = this.O;
                            if (r01Var != null) {
                                r01Var.setChatInfo(this.f32671u2);
                            }
                            TLRPC.ChatFull chatFull6 = this.f32671u2;
                            if (chatFull6 != null && (((inputGroupCall = chatFull6.call) == null && !this.f32635p1) || (inputGroupCall != null && this.f32635p1))) {
                                D3(false);
                            }
                            yz0 yz0Var = this.f32669u0;
                            if (yz0Var != null && (chatFull3 = this.f32671u2) != null) {
                                yz0Var.setStories(chatFull3.stories);
                            }
                            zh.f0 f0Var = this.f32676v0;
                            if (f0Var != null) {
                                f0Var.a();
                            }
                            vz0 vz0Var = this.f32558e0;
                            if (vz0Var != null) {
                                vz0Var.setHasStories(j4());
                            }
                            if (l10.longValue() != 0) {
                                z12 = (BuildVars.IS_BILLING_UNAVAILABLE || getMessagesController().premiumPurchaseBlocked() || (chatFull2 = this.f32671u2) == null || !chatFull2.stargifts_available) ? false : false;
                                this.T0.I(38, z12);
                                org.telegram.ui.Components.ei0 ei0Var = this.f32529a0;
                                if (ei0Var != null) {
                                    ei0Var.o(3, z12);
                                }
                            }
                        }
                    }
                } else if (i10 == NotificationCenter.chatInfoDidLoad) {
                    TLRPC.ChatFull chatFull7 = (TLRPC.ChatFull) objArr[0];
                    if (this.f32559e1 != 0 && (user = getMessagesController().getUser(Long.valueOf(this.f32559e1))) != null && chatFull7.f19217id == user.linked_community_id) {
                        e5(true, false);
                    }
                    TLRPC.Chat chat3 = this.E2;
                    if (chat3 != null && chatFull7.f19217id == chat3.linked_community_id) {
                        e5(true, false);
                    }
                    if (chatFull7.f19217id == this.f32567f1) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        TLRPC.ChatFull chatFull8 = this.f32671u2;
                        if ((chatFull8 instanceof TLRPC.TL_channelFull) && chatFull7.participants == null) {
                            chatFull7.participants = chatFull8.participants;
                        }
                        if (chatFull8 == null && (chatFull7 instanceof TLRPC.TL_channelFull)) {
                            objArr2 = 1;
                        } else {
                            objArr2 = null;
                        }
                        this.f32671u2 = chatFull7;
                        if (this.f32613m1 == 0) {
                            long j10 = chatFull7.migrated_from_chat_id;
                            if (j10 != 0) {
                                this.f32613m1 = -j10;
                                getMediaDataController().getMediaCount(this.f32613m1, this.f32574g1, 0, this.classGuid, true);
                            }
                        }
                        L3();
                        wz0 wz0Var = this.f32620n0;
                        if (wz0Var != null && !this.f32641q1) {
                            wz0Var.setChatInfo(this.f32671u2);
                        }
                        e5(true, false);
                        TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(this.f32567f1));
                        if (chat4 != null) {
                            this.E2 = chat4;
                            D3(true);
                        }
                        FlagSecureReason flagSecureReason2 = this.X1;
                        if (flagSecureReason2 != null) {
                            flagSecureReason2.invalidate();
                        }
                        if (this.E2.megagroup && (objArr2 != null || !booleanValue)) {
                            R3(true);
                        }
                        T4();
                        m5();
                        yz0 yz0Var2 = this.f32669u0;
                        if (yz0Var2 != null && (chatFull = this.f32671u2) != null) {
                            yz0Var2.setStories(chatFull.stories);
                        }
                        zh.f0 f0Var2 = this.f32676v0;
                        if (f0Var2 != null) {
                            f0Var2.a();
                        }
                        vz0 vz0Var2 = this.f32558e0;
                        if (vz0Var2 != null) {
                            vz0Var2.setHasStories(j4());
                        }
                        r01 r01Var2 = this.O;
                        if (r01Var2 != null) {
                            r01Var2.setChatInfo(this.f32671u2);
                        }
                    }
                } else if (i10 == NotificationCenter.closeChats) {
                    removeSelfFromStack(true);
                } else if (i10 == NotificationCenter.closeProfileActivity) {
                    long longValue2 = ((Long) objArr[0]).longValue();
                    boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                    if (longValue2 == a()) {
                        if (booleanValue2 || this.parentLayout.getLastFragment() != this) {
                            if (this.parentLayout.getLastFragment() == this) {
                                finishFragment();
                            } else {
                                removeSelfFromStack(true);
                            }
                        }
                    }
                } else if (i10 == NotificationCenter.botInfoDidLoad) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) objArr[0];
                    if (botInfo.user_id == this.f32559e1) {
                        this.F2 = botInfo;
                        e5(false, false);
                    }
                } else if (i10 == NotificationCenter.userInfoDidLoad) {
                    if (((Long) objArr[0]).longValue() == this.f32559e1) {
                        TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                        this.f32678v2 = userFull;
                        org.telegram.ui.Components.hx0 hx0Var = this.T;
                        if (hx0Var != null) {
                            hx0Var.set(userFull.stars_rating);
                        }
                        yz0 yz0Var3 = this.f32669u0;
                        if (yz0Var3 != null) {
                            yz0Var3.setStories(this.f32678v2.stories);
                        }
                        zh.f0 f0Var3 = this.f32676v0;
                        if (f0Var3 != null) {
                            f0Var3.a();
                        }
                        vz0 vz0Var3 = this.f32558e0;
                        if (vz0Var3 != null) {
                            vz0Var3.setHasStories(j4());
                        }
                        r01 r01Var3 = this.O;
                        if (r01Var3 != null) {
                            r01Var3.setUserInfo(this.f32678v2);
                        }
                        if (this.f32640q0 != null) {
                            if (this.d != null && !TextUtils.equals(this.f32678v2.about, this.f32705z2)) {
                                this.d.m(this.W2);
                            }
                        } else {
                            if (!this.G1 && !this.K0) {
                                D3(true);
                            } else {
                                this.I1 = true;
                            }
                            e5(false, false);
                            r01 r01Var4 = this.O;
                            if (r01Var4 != null) {
                                r01Var4.setCommonGroupsCount(this.f32678v2.common_chats_count);
                                R();
                                org.telegram.ui.Components.pv0 pv0Var = this.R;
                                if (pv0Var == null || pv0Var.f28433y) {
                                    resumeDelayedFragmentAnimation();
                                    k4(true);
                                }
                            }
                        }
                        T4();
                        m5();
                        if (this.f32686w2 == null && !h4()) {
                            org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(this.currentAccount);
                            this.f32686w2 = g6Var;
                            cc0 cc0Var = new cc0(this, 15);
                            if (g6Var.f21221c) {
                                cc0Var.run();
                            } else {
                                g6Var.h.add(cc0Var);
                            }
                            this.f32686w2.d(this.f32678v2);
                        }
                        if (!h4()) {
                            t11 t11Var = this.f32700y2;
                            t11 c10 = t11.c(this.currentAccount, this.f32678v2, t11Var);
                            this.f32700y2 = c10;
                            if (c10 != t11Var) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f32693x2 = z10;
                            if (c10 != null) {
                                cc0 cc0Var2 = new cc0(this, 16);
                                if (c10.f40268b) {
                                    cc0Var2.run();
                                } else {
                                    c10.h.add(cc0Var2);
                                }
                            }
                        }
                        if (this.T0 != null) {
                            if (e4()) {
                                this.T0.K(44);
                            } else {
                                this.T0.r(44);
                            }
                            TLRPC.UserFull userFull2 = this.f32678v2;
                            if (!userFull2.noforwards_my_enabled && !userFull2.noforwards_peer_enabled) {
                                z13 = true;
                            }
                            this.T0.I(46, z13);
                            this.T0.I(47, !z13);
                        }
                    }
                } else if (i10 != NotificationCenter.privacyRulesUpdated) {
                    if (i10 == NotificationCenter.didReceiveNewMessages) {
                        if (!((Boolean) objArr[2]).booleanValue()) {
                            long a2 = a();
                            if (a2 == ((Long) objArr[0]).longValue()) {
                                DialogObject.isEncryptedDialog(a2);
                                ArrayList arrayList = (ArrayList) objArr[1];
                                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                    MessageObject messageObject = (MessageObject) arrayList.get(i14);
                                    if (this.D2 != null) {
                                        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                                        if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (f11Var = this.d) != null) {
                                            f11Var.l();
                                        }
                                    }
                                }
                            }
                        }
                    } else if (i10 == NotificationCenter.emojiLoaded) {
                        lz0 lz0Var3 = this.f32528a;
                        if (lz0Var3 != null) {
                            lz0Var3.f1();
                        }
                    } else if (i10 == NotificationCenter.reloadInterface) {
                        e5(false, false);
                    } else if (i10 == NotificationCenter.newSuggestionsAvailable) {
                        int i15 = this.f32547c3;
                        int i16 = this.f32531a3;
                        int i17 = this.Y2;
                        j5();
                        f11 f11Var2 = this.d;
                        if (f11Var2 != null) {
                            if (i15 != this.f32547c3 || i16 != this.f32531a3 || i17 != this.Y2) {
                                f11Var2.l();
                            }
                        }
                    } else if (i10 == NotificationCenter.topicsDidLoaded) {
                        if (this.f32641q1) {
                            i5(false);
                        }
                    } else if (i10 == NotificationCenter.updateSearchSettings) {
                        p11 p11Var = this.e;
                        if (p11Var != null) {
                            p11Var.f39096c = p11.H(this);
                            this.e.v.clear();
                            this.e.J();
                            p11 p11Var2 = this.e;
                            p11Var2.I(p11Var2.f39103y);
                        }
                    } else if (i10 == NotificationCenter.reloadDialogPhotos) {
                        i5(false);
                    } else if (i10 != NotificationCenter.storiesUpdated && i10 != NotificationCenter.storiesReadUpdated) {
                        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
                            org.telegram.ui.ActionBar.u0 u0Var = this.T0;
                            if (u0Var != null) {
                                u0Var.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.f32559e1)));
                            }
                            W4();
                        } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                            W4();
                        } else if (i10 == NotificationCenter.starBalanceUpdated) {
                            e5(false, false);
                        } else if (i10 == NotificationCenter.botStarsUpdated) {
                            e5(false, false);
                        } else if (i10 == NotificationCenter.botStarsTransactionsLoaded) {
                            e5(false, false);
                        } else if (i10 == NotificationCenter.dialogDeleted) {
                            if (a() == ((Long) objArr[0]).longValue()) {
                                org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
                                if (b5Var != null && b5Var.getLastFragment() == this) {
                                    finishFragment();
                                } else {
                                    removeSelfFromStack();
                                }
                            }
                        } else if (i10 == NotificationCenter.channelRecommendationsLoaded) {
                            long longValue3 = ((Long) objArr[0]).longValue();
                            if (this.J4 < 0 && longValue3 == a()) {
                                j5();
                                R();
                                f11 f11Var3 = this.d;
                                if (f11Var3 != null) {
                                    f11Var3.l();
                                }
                            }
                        } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
                            if (((Long) objArr[0]).longValue() == a() && !h4()) {
                                if (this.J4 < 0) {
                                    j5();
                                    R();
                                    f11 f11Var4 = this.d;
                                    if (f11Var4 != null) {
                                        f11Var4.l();
                                    }
                                    AndroidUtilities.runOnUIThread(new cc0(this, 17));
                                    return;
                                }
                                r01 r01Var5 = this.O;
                                if (r01Var5 != null) {
                                    r01Var5.v1(true);
                                }
                            }
                        } else if (i10 == NotificationCenter.profileMusicUpdated) {
                            if (((Long) objArr[0]).longValue() == a() && this.f32559e1 > 0) {
                                TLRPC.UserFull userFull3 = getMessagesController().getUserFull(this.f32559e1);
                                if (userFull3 != null) {
                                    this.f32678v2 = userFull3;
                                }
                                j5();
                                R();
                                lz0 lz0Var4 = this.f32528a;
                                if (lz0Var4 != null && lz0Var4.b0()) {
                                    this.f32528a.post(new cc0(this, 19));
                                    return;
                                }
                                f11 f11Var5 = this.d;
                                if (f11Var5 != null) {
                                    f11Var5.l();
                                }
                            }
                        } else if (i10 == NotificationCenter.updatedChatRanks) {
                            long longValue4 = ((Long) objArr[0]).longValue();
                            long longValue5 = ((Long) objArr[1]).longValue();
                            TLRPC.Chat chat5 = this.E2;
                            if (chat5 != null && chat5.f19216id == longValue4) {
                                String str = (String) objArr[2];
                                a0.h hVar = this.C1;
                                if (hVar != null && (chatParticipant = (TLRPC.ChatParticipant) hVar.f(longValue5)) != null) {
                                    chatParticipant.setRank(longValue5, str);
                                }
                                TLRPC.ChannelParticipant channelParticipant = this.G2;
                                if (channelParticipant != null && channelParticipant.user_id == longValue5) {
                                    channelParticipant.rank = str;
                                }
                                while (true) {
                                    ArrayList arrayList2 = this.Q4;
                                    if (i12 < arrayList2.size()) {
                                        ((TLRPC.ChatParticipant) arrayList2.get(i12)).setRank(longValue5, str);
                                        i12++;
                                    } else {
                                        AndroidUtilities.updateVisibleRows(this.f32528a);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        vz0 vz0Var4 = this.f32558e0;
                        if (vz0Var4 != null) {
                            vz0Var4.setHasStories(j4());
                            this.f32558e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(c4(), 0.0f, this.f32603k2));
                        }
                        yz0 yz0Var4 = this.f32669u0;
                        if (yz0Var4 != null) {
                            TLRPC.UserFull userFull4 = this.f32678v2;
                            if (userFull4 != null) {
                                yz0Var4.setStories(userFull4.stories);
                                return;
                            }
                            TLRPC.ChatFull chatFull9 = this.f32671u2;
                            if (chatFull9 != null) {
                                yz0Var4.setStories(chatFull9.stories);
                            }
                        }
                    }
                }
            } else {
                D3(true);
            }
        } else if (ChatObject.isBoostSupported(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f32567f1)))) {
            getMessagesController().getStoriesController().k(a(), new bi.f(19), false, this.f32703z0);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.i50 i50Var = this.f32640q0;
        if (i50Var != null && i50Var.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.i50 i50Var = this.f32640q0;
        if ((i50Var == null || dialog != i50Var.f25831c) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
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
        if (!this.f32649r2 || (userFull = this.f32678v2) == null || (botInfo = userFull.bot_info) == null) {
            return false;
        }
        if (botInfo.privacy_policy_url == null) {
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
        return true;
    }

    public final void e5(boolean z10, boolean z11) {
        if (this.d == null) {
            if (z10) {
                h5(false);
            }
            j5();
        } else if (!z11 && this.f32528a.isInLayout()) {
            lz0 lz0Var = this.f32528a;
            if (!lz0Var.G) {
                return;
            }
            lz0Var.post(new org.telegram.ui.Components.sn0(11, this, z10));
        } else {
            t01 t01Var = new t01(this);
            t01Var.f40259b = this.N2;
            t01Var.f(t01Var.f40260c);
            t01Var.e.clear();
            t01Var.f40261f.clear();
            t01Var.e.addAll(this.Q4);
            t01Var.f40261f.addAll(this.R4);
            t01Var.f40262g = this.f32673u4;
            t01Var.h = this.f32680v4;
            if (z10) {
                h5(false);
            }
            F4();
            j5();
            t01Var.f(t01Var.d);
            try {
                s4.o.c(t01Var, true).c(this.d);
            } catch (Exception e) {
                FileLog.e(e);
                this.d.l();
            }
            int i10 = this.U5;
            if (i10 >= 0) {
                this.f32543c.h1(i10, this.V5 - this.f32528a.getPaddingTop());
            }
            AndroidUtilities.updateVisibleRows(this.f32528a);
        }
    }

    @Override
    public final org.telegram.ui.Components.mm0 f() {
        return this.f32528a;
    }

    public final void f4() {
        boolean z10;
        Point point = new Point();
        getParentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32622n2 = z10;
    }

    public final void f5() {
        int i10;
        if (this.f32544c0 != null && this.f32646r[1] != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int i11 = currentActionBarHeight + i10;
            boolean z10 = this.G1;
            if (z10 && this.J1 == 2 && this.Y != null) {
                this.f32544c0.setAlpha(this.S1);
                org.telegram.ui.Components.wi0 wi0Var = this.f32544c0;
                float dp = AndroidUtilities.dp(74.0f) + this.f32528a.getMeasuredWidth();
                wi0Var.L = O3() - AndroidUtilities.dp(74.0f);
                wi0Var.setTranslationY(dp - AndroidUtilities.dp(12.0f));
                wi0Var.invalidate();
                return;
            }
            if (z10) {
                this.f32544c0.setAlpha(this.S1);
            }
            float f7 = i11;
            float dp2 = this.Q1 + f7 + AndroidUtilities.dp(74.0f);
            float min = Math.min(O3(), dp2 - f7);
            org.telegram.ui.Components.wi0 wi0Var2 = this.f32544c0;
            wi0Var2.L = min - AndroidUtilities.dp(74.0f);
            wi0Var2.setTranslationY((dp2 - min) - AndroidUtilities.dp(12.0f));
            wi0Var2.invalidate();
        }
    }

    @Override
    public final TLRPC.Chat g() {
        return this.E2;
    }

    public final boolean g4() {
        if (this.E2 != null) {
            return getMessagesController().isChatNoForwards(this.E2);
        }
        return getMessagesController().isUserNoForwards(this.f32678v2);
    }

    public final void g5(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.g5(boolean):void");
    }

    public float getAvatarAnimationProgress() {
        return this.S1;
    }

    @Override
    public final kv0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.f32703z0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.f32703z0 != null) {
            return null;
        }
        cz0 cz0Var = new cz0(0, this);
        ArrayList arrayList = new ArrayList();
        r01 r01Var = this.O;
        if (r01Var != null) {
            arrayList.addAll(r01Var.getThemeDescriptions());
        }
        lz0 lz0Var = this.f32528a;
        int i10 = org.telegram.ui.ActionBar.g6.f19901d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lz0Var, 0, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32535b, 0, null, null, null, null, i10));
        lz0 lz0Var2 = this.f32528a;
        int i11 = org.telegram.ui.ActionBar.g6.f19843a7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lz0Var2, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.f20235v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.f19938f8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.f20126pc));
        int i12 = org.telegram.ui.ActionBar.g6.f19975h8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.f20244vh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.Bh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, i12));
        org.telegram.ui.Components.ep0 ep0Var = this.f32654s;
        if (ep0Var != null) {
            TextView textView = ep0Var.getTextView();
            int i13 = org.telegram.ui.ActionBar.g6.Pi;
            arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, cz0Var, i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32654s.getNextTextView(), 4, null, null, null, cz0Var, i13));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32552d1, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19990i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f20022k0, null, null, org.telegram.ui.ActionBar.g6.f19902d7));
        vz0 vz0Var = this.f32558e0;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.g6.f20152r0;
        int i14 = org.telegram.ui.ActionBar.g6.J7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(vz0Var, 0, null, null, drawableArr, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32558e0, 0, null, null, new Drawable[]{this.f32634p0}, null, org.telegram.ui.ActionBar.g6.f19903d8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 8, null, null, null, null, org.telegram.ui.ActionBar.g6.f20262wh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.f20281xh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.f20297yh));
        int i15 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20270x6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20122p7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20104o6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20216u6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        int i16 = org.telegram.ui.ActionBar.g6.f20064m6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20233v6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"textView"}, null, null, -1, null, i15));
        int i17 = org.telegram.ui.ActionBar.g6.f20305z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"valueTextView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.g6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 0, new Class[]{org.telegram.ui.Cells.a7.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 0, new Class[]{org.telegram.ui.Cells.a7.class}, new String[]{"detailTextView"}, null, null, -1, null, i17));
        int i19 = org.telegram.ui.ActionBar.g6.J6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 2, new Class[]{org.telegram.ui.Cells.a7.class}, new String[]{"detailTextView"}, null, null, -1, null, i19));
        int i20 = org.telegram.ui.ActionBar.g6.Sh;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 0, new Class[]{org.telegram.ui.Cells.a7.class}, new String[]{"yesButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.g6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 131072, new Class[]{org.telegram.ui.Cells.a7.class}, new String[]{"yesButton"}, null, null, -1, null, i21));
        int i22 = org.telegram.ui.ActionBar.g6.Qh;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 196608, new Class[]{org.telegram.ui.Cells.a7.class}, new String[]{"yesButton"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 0, new Class[]{org.telegram.ui.Cells.a7.class}, new String[]{"noButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 131072, new Class[]{org.telegram.ui.Cells.a7.class}, new String[]{"noButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 196608, new Class[]{org.telegram.ui.Cells.a7.class}, new String[]{"noButton"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 4, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20226uh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 0, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 0, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"statusColor"}, null, null, -1, cz0Var, org.telegram.ui.ActionBar.g6.f20288y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 0, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"statusOnlineColor"}, null, null, -1, cz0Var, org.telegram.ui.ActionBar.g6.f20084n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 0, new Class[]{org.telegram.ui.Cells.xa.class}, null, drawableArr, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.Fi));
        int i23 = org.telegram.ui.ActionBar.g6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i23));
        int i24 = org.telegram.ui.ActionBar.g6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 4, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.g6.P1, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 2, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.g6.P1, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32528a, 0, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.g6.m0, null, null, org.telegram.ui.ActionBar.g6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32535b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32535b, 0, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32535b, 16, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.g6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32535b, 0, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32535b, 0, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"valueTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32535b, 0, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        boolean z10 = this.F5;
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f32565f;
        if (z10) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(h5VarArr[1], 0, null, null, this.I, null, org.telegram.ui.ActionBar.g6.Oi));
            arrayList.add(new org.telegram.ui.ActionBar.i6(h5VarArr[1], 0, null, null, this.f32697y, null, i10));
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(h5VarArr[1], 0, null, null, this.I, null, org.telegram.ui.ActionBar.g6.Ah));
        arrayList.add(new org.telegram.ui.ActionBar.i6(h5VarArr[1], 0, null, null, this.f32697y, null, org.telegram.ui.ActionBar.g6.f20315zh));
        return arrayList;
    }

    @Override
    public final int getThemedColor(int i10) {
        return org.telegram.ui.ActionBar.g6.w0(i10, this.f32703z0);
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable;
        org.telegram.ui.ActionBar.c6 c6Var = this.f32703z0;
        if (c6Var != null) {
            drawable = c6Var.getDrawable(str);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return super.getThemedDrawable(str);
    }

    @Override
    public final boolean h(org.telegram.tgnet.TLRPC.ChatParticipant r24, boolean r25, boolean r26, android.view.View r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.h(org.telegram.tgnet.TLRPC$ChatParticipant, boolean, boolean, android.view.View):boolean");
    }

    public final boolean h4() {
        if (this.f32640q0 != null && !this.f32656s1) {
            return true;
        }
        return false;
    }

    public final void h5(boolean z10) {
        int i10;
        TLRPC.UserStatus userStatus;
        boolean z11;
        int i11 = 0;
        this.B2 = 0;
        int currentTime = getConnectionsManager().getCurrentTime();
        this.C2.clear();
        TLRPC.ChatFull chatFull = this.f32671u2;
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z11 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (z11 && chatFull.participants_count > 200) {
                this.B2 = chatFull.online_count;
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (i11 < this.f32671u2.participants.participants.size()) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f32671u2.participants.participants.get(i11).user_id));
            if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.f19363id == getUserConfig().getClientUserId()) && user.status.expires > 10000)) {
                this.B2++;
            }
            this.C2.add(Integer.valueOf(i11));
            if (user != null) {
                if (user.bot) {
                    i10 = -110;
                } else if (user.self) {
                    i10 = 50000 + currentTime;
                } else {
                    TLRPC.UserStatus userStatus2 = user.status;
                    if (userStatus2 != null) {
                        i10 = userStatus2.expires;
                    }
                }
                i11 = com.google.android.gms.internal.play_billing.k3.f(i10, i11, 1, arrayList);
            }
            i10 = Integer.MIN_VALUE;
            i11 = com.google.android.gms.internal.play_billing.k3.f(i10, i11, 1, arrayList);
        }
        try {
            Collections.sort(this.C2, Comparator$EL.reversed(Comparator$CC.comparingInt(new pf(arrayList, 1))));
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (z10 && this.d != null && this.f32673u4 > 0) {
            AndroidUtilities.updateVisibleRows(this.f32528a);
        }
        if (this.O != null && this.J4 != -1) {
            if ((this.C2.size() > 5 || this.S4 == 2) && this.S4 != 1) {
                this.O.a1(this.C2, this.f32671u2);
            }
        }
    }

    public final void i4(boolean z10) {
        boolean z11;
        boolean isForum = ChatObject.isForum(this.E2);
        TLRPC.Chat chat = this.E2;
        if (!isForum && !z10 && (chat == null || !chat.creator)) {
            z11 = false;
        } else {
            z11 = true;
        }
        org.telegram.ui.Components.g5.r(this, false, chat, null, false, z11, z10, !isForum, new py0(this, 1));
    }

    public final void i5(boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.i5(boolean):void");
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.f32636p2;
    }

    @Override
    public final boolean isLightStatusBar() {
        int w02;
        if (!this.f32636p2) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null && kVar.t()) {
                w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20254w8, this.f32703z0);
            } else if (this.F5) {
                w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, this.f32703z0);
            } else {
                MessagesController.PeerColor peerColor = this.Q5;
                if (peerColor != null) {
                    w02 = peerColor.getBgColor2(org.telegram.ui.ActionBar.g6.I.q());
                } else {
                    w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20180s8, this.f32703z0);
                }
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
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

    public final boolean j4() {
        if (getMessagesController().getStoriesController().I(a()) && !this.f32641q1) {
            return true;
        }
        return false;
    }

    public final void j5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.j5():void");
    }

    public final void k4(boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.k4(boolean):void");
    }

    public final void k5() {
        ImageView imageView;
        TLRPC.Chat chat;
        if (this.f32594j0 != null && (imageView = this.f32601k0) != null) {
            if (this.L1 && (chat = this.E2) != null && (chat.flags2 & 2048) != 0) {
                imageView.setTag(1);
                this.f32601k0.setVisibility(0);
                this.f32594j0.setTag(1);
                this.f32594j0.setVisibility(0);
                return;
            }
            imageView.setTag(null);
            this.f32601k0.setVisibility(8);
            this.f32594j0.setTag(null);
            this.f32594j0.setVisibility(8);
        }
    }

    public final void l4(int r13, float r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.l4(int, float, boolean):void");
    }

    public final void l5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        float f7;
        float f10;
        boolean z11;
        if ((this.f32669u0 != null || this.f32676v0 != null) && (kVar = this.actionBar) != null) {
            if (kVar.getOccupyStatusBar()) {
                f7 = AndroidUtilities.statusBarHeight;
            } else {
                f7 = 0.0f;
            }
            float width = this.actionBar.getWidth();
            if (this.actionBar.getBackButton() != null) {
                f10 = Math.max(0.0f, this.actionBar.getBackButton().getRight());
            } else {
                f10 = 0.0f;
            }
            boolean z12 = false;
            if (this.actionBar.E != null) {
                for (int i10 = 0; i10 < this.actionBar.E.getChildCount(); i10++) {
                    View childAt = this.actionBar.E.getChildAt(i10);
                    if (childAt.getAlpha() > 0.0f && childAt.getVisibility() == 0) {
                        float left = this.actionBar.E.getLeft() + ((int) childAt.getX());
                        if (left < width) {
                            width = AndroidUtilities.lerp(width, left, childAt.getAlpha());
                        }
                    }
                }
            }
            yz0 yz0Var = this.f32669u0;
            if (yz0Var != null) {
                float z13 = com.google.android.gms.internal.play_billing.k3.z(this.actionBar.getHeight(), f7, 2.0f, f7);
                if (Math.abs(f10 - yz0Var.f32819f0) <= 0.1f && Math.abs(width - yz0Var.f32820g0) <= 0.1f && Math.abs(z13 - yz0Var.f32821h0) <= 0.1f) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                yz0Var.f32819f0 = f10;
                yz0Var.f32820g0 = width;
                if (z10) {
                    yz0Var.m0.d(width, true);
                }
                yz0Var.f32821h0 = z13;
                if (z11) {
                    yz0Var.invalidate();
                }
            }
            zh.f0 f0Var = this.f32676v0;
            if (f0Var != null) {
                float z14 = com.google.android.gms.internal.play_billing.k3.z(this.actionBar.getHeight(), f7, 2.0f, f7);
                int U3 = U3();
                z12 = (Math.abs(f10 - f0Var.f50486r) > 0.1f || Math.abs(width - f0Var.f50487s) > 0.1f || Math.abs(z14 - f0Var.v) > 0.1f) ? true : true;
                f0Var.f50486r = f10;
                f0Var.f50487s = width;
                if (z10) {
                    f0Var.f50490y.d(width, true);
                }
                f0Var.v = z14;
                f0Var.f50489x = U3 + z14;
                if (z12) {
                    f0Var.invalidate();
                }
            }
        }
    }

    public final void m5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.m5():void");
    }

    public final void n4(boolean z10) {
        boolean z11;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f32559e1));
        if (user != null) {
            if (this.f32649r2 && !MessagesController.isSupportUser(user)) {
                if (this.f32602k1 && !z10) {
                    getMessagesController().unblockPeer(this.f32559e1, new cc0(this, 4));
                    finishFragment();
                    return;
                }
                TLRPC.Chat chat = this.E2;
                if (this.D2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.g5.r(this, false, chat, user, z11, true, false, true, new qy0(this, user));
            } else if (this.f32602k1) {
                getMessagesController().unblockPeer(this.f32559e1);
                if (org.telegram.ui.Components.zc.a(this)) {
                    org.telegram.ui.Components.zc.d(this, false).j();
                }
            } else if (this.l1) {
                org.telegram.ui.Components.g5.i0(this, this.f32559e1, user, null, this.D2, false, null, new za(this, 4), this.f32703z0);
            } else {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f32703z0);
                String string = LocaleController.getString(R.string.BlockUser);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                a2Var.R = string;
                a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new py0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20139q7, this.f32703z0));
                }
            }
        }
    }

    public final void n5(boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        boolean z13;
        float f7;
        TLRPC.ChatFull chatFull;
        float f10 = 0.2f;
        int i12 = (y3() > 0.2f ? 1 : (y3() == 0.2f ? 0 : -1));
        int i13 = 0;
        if (i12 > 0 && !this.W1 && (this.f32640q0 == null || this.O2 == -1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.H5 = z11;
        C3();
        org.telegram.ui.Components.bk0 bk0Var = this.v;
        if (bk0Var != null && bk0Var.getVisibility() != 8) {
            org.telegram.ui.Components.bk0 bk0Var2 = this.v;
            if (this.actionBar.getOccupyStatusBar()) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            bk0Var2.setTranslationY((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11) + this.Q1) + this.T1) - AndroidUtilities.dp(29.5f));
            if (i12 > 0 && !this.W1 && !this.f32656s1 && (this.f32640q0 == null || this.O2 == -1)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 && this.f32567f1 != 0) {
                if (ChatObject.isChannel(this.E2) && !this.E2.megagroup && (chatFull = this.f32671u2) != null && chatFull.linked_chat_id != 0 && (this.D3 != -1 || this.E3 != -1)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            if (!this.G1) {
                if (this.v.getTag() == null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12 != z13) {
                    if (z12) {
                        this.v.setTag(null);
                    } else {
                        this.v.setTag(0);
                    }
                    AnimatorSet animatorSet = this.f32683w;
                    if (animatorSet != null) {
                        this.f32683w = null;
                        animatorSet.cancel();
                    }
                    float f11 = 0.0f;
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f32683w = animatorSet2;
                        if (z12) {
                            animatorSet2.setInterpolator(new DecelerateInterpolator());
                            this.f32683w.playTogether(ObjectAnimator.ofFloat(this.v, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.v, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.v, View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.f32683w.playTogether(ObjectAnimator.ofFloat(this.v, View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.v, View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.v, View.ALPHA, 0.0f));
                        }
                        this.f32683w.setDuration(150L);
                        this.f32683w.addListener(new i01(this, 1));
                        this.f32683w.start();
                    } else {
                        org.telegram.ui.Components.bk0 bk0Var3 = this.v;
                        if (z12) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.2f;
                        }
                        bk0Var3.setScaleX(f7);
                        org.telegram.ui.Components.bk0 bk0Var4 = this.v;
                        if (z12) {
                            f10 = 1.0f;
                        }
                        bk0Var4.setScaleY(f10);
                        org.telegram.ui.Components.bk0 bk0Var5 = this.v;
                        if (z12) {
                            f11 = 1.0f;
                        }
                        bk0Var5.setAlpha(f11);
                    }
                }
            }
        } else {
            z12 = false;
        }
        yz0 yz0Var = this.f32669u0;
        if (yz0Var != null) {
            float measuredWidth = this.Z.getMeasuredWidth() - AndroidUtilities.dp(40.0f);
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            yz0Var.f32822i0 = measuredWidth;
            yz0Var.f32824k0 = z12;
            yz0Var.f32823j0 = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i10;
            yz0Var.invalidate();
        }
        zh.f0 f0Var = this.f32676v0;
        if (f0Var != null) {
            if (this.actionBar.getOccupyStatusBar()) {
                i13 = AndroidUtilities.statusBarHeight;
            }
            f0Var.setExpandCoords(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i13 + this.Q1 + this.T1);
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.J1 == 0) {
            return true;
        }
        return false;
    }

    public final void o4(boolean z10) {
        boolean z11 = false;
        if (this.f32559e1 != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f32559e1));
            if (user != null) {
                TLRPC.UserFull userFull = this.f32678v2;
                if (userFull != null && userFull.video_calls_available) {
                    z11 = true;
                }
                org.telegram.ui.Components.voip.d2.m(user, z10, z11, getParentActivity(), this.f32678v2, getAccountInstance());
            }
        } else if (this.f32567f1 != 0) {
            if (getMessagesController().getGroupCall(this.f32567f1, false) == null) {
                TLRPC.Chat chat = this.E2;
                AccountInstance accountInstance = getAccountInstance();
                if (getParentActivity() != null) {
                    org.telegram.ui.Components.w80.v(getParentActivity(), -chat.f19216id, accountInstance, new org.telegram.ui.Components.nz(chat, this, accountInstance, 4));
                    return;
                }
                return;
            }
            org.telegram.ui.Components.voip.d2.l(this.E2, null, false, null, getParentActivity(), this, getAccountInstance());
        }
    }

    public final void o5() {
        org.telegram.ui.Components.ns0 ns0Var;
        org.telegram.ui.Components.nt0 nt0Var;
        org.telegram.ui.Components.da0 da0Var;
        int w02;
        int w03;
        int w04;
        int color3;
        int w05;
        int w06;
        int w07;
        this.R5.clear();
        s11 s11Var = this.f32552d1;
        if (s11Var != null) {
            s11Var.a(this.Q5, true);
        }
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f32646r;
        org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[1];
        if (h5Var != null) {
            if (h5Var.getTag() instanceof Integer) {
                w07 = org.telegram.ui.ActionBar.g6.w0(((Integer) h5VarArr[1].getTag()).intValue(), this.f32703z0);
            } else {
                w07 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.B8, this.f32703z0);
            }
            h5VarArr[1].setTextColor(i0.a.d(this.f32603k2, w3(w07, Boolean.valueOf(this.J0[0])), -1275068417));
        }
        q11 q11Var = this.f32542b6;
        float f7 = -0.1f;
        if (q11Var != null) {
            q11Var.a(i0.a.d(this.f32603k2, org.telegram.ui.ActionBar.g6.m1(0.5f, org.telegram.ui.ActionBar.g6.b(0.18f, -0.1f, this.f32545c1)), 603979775));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = -1;
        if (kVar != null) {
            if (this.Q5 != null) {
                w05 = -1;
            } else {
                w05 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20235v8, this.f32703z0);
            }
            kVar.D(i0.a.d(this.E5, w05, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20290y8, this.f32703z0)), false);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            MessagesController.PeerColor peerColor = this.Q5;
            if (peerColor != null) {
                w06 = 1090519039;
            } else if (peerColor != null) {
                w06 = 553648127;
            } else {
                w06 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19938f8, this.f32703z0);
            }
            kVar2.B(i0.a.d(this.E5, w06, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20307z8, this.f32703z0)), false);
        }
        Drawable[] drawableArr = this.f32697y;
        if (drawableArr[1] != null) {
            MessagesController.PeerColor peerColor2 = this.Q5;
            if (peerColor2 != null) {
                int color2 = peerColor2.getColor2();
                if (this.Q5.hasColor6(org.telegram.ui.ActionBar.g6.I.q())) {
                    color3 = this.Q5.getColor5();
                } else {
                    color3 = this.Q5.getColor3();
                }
                int d = i0.a.d(0.4f, color2, color3);
                if (!org.telegram.ui.ActionBar.g6.I.q()) {
                    f7 = -0.08f;
                }
                w04 = org.telegram.ui.ActionBar.g6.b(0.1f, f7, d);
            } else {
                w04 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20315zh, this.f32703z0);
            }
            drawableArr[1].setColorFilter(AndroidUtilities.getOffsetColor(w04, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oi, this.f32703z0), this.E5, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        Drawable[] drawableArr2 = this.I;
        if (drawableArr2[1] != null) {
            if (this.Q5 != null) {
                w03 = -1;
            } else {
                w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Ah, this.f32703z0);
            }
            drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(w03, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, this.f32703z0), this.E5, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f32565f[1];
        if (h5Var2 != null) {
            if (this.Q5 != null) {
                w02 = -1;
            } else {
                w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20244vh, this.f32703z0);
            }
            h5Var2.setTextColor(i0.a.d(this.f32603k2, i0.a.d(this.E5, w02, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oi, this.f32703z0)), -1));
        }
        org.telegram.ui.Components.s8 s8Var = this.f32530a1;
        if (s8Var != null && (da0Var = s8Var.e) != null) {
            da0Var.invalidate();
        }
        Drawable drawable = this.f32690x;
        if (drawable != null) {
            if (this.Q5 == null) {
                i10 = i0.a.d(this.S1, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20126pc, this.f32703z0), -1);
            }
            drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.wi0 wi0Var = this.f32544c0;
        if (wi0Var != null) {
            wi0Var.setColor(this.Q5);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f32528a, (Utilities.Callback<View>) new xy0(this, 2));
        r01 r01Var = this.O;
        if (r01Var != null && (nt0Var = r01Var.I0) != null) {
            nt0Var.d();
        }
        r01 r01Var2 = this.O;
        if (r01Var2 != null && (ns0Var = r01Var2.V) != null) {
            ns0Var.m();
        }
        p5();
        X4();
        yz0 yz0Var = this.f32669u0;
        if (yz0Var != null) {
            yz0Var.f(true, true);
        }
        zh.f0 f0Var = this.f32676v0;
        if (f0Var != null) {
            f0Var.a();
        }
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.i50 i50Var = this.f32640q0;
        if (i50Var != null) {
            i50Var.h(i10, i11, intent);
        }
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.M;
        if (undoView != null) {
            undoView.e(0, true);
        }
        super.onBecomeFullyHidden();
        this.X5 = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        p5();
        this.X5 = true;
        F3();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        View m10;
        org.telegram.ui.Components.wi0 wi0Var;
        org.telegram.ui.Components.ei0 ei0Var;
        super.onConfigurationChanged(configuration);
        r01 r01Var = this.O;
        if (r01Var != null) {
            r01Var.onConfigurationChanged(configuration);
        }
        f4();
        if (this.f32622n2 && (ei0Var = this.f32529a0) != null) {
            ei0Var.i();
        }
        if (this.f32622n2 && (wi0Var = this.f32544c0) != null) {
            wi0Var.b();
        }
        if (this.f32622n2 && this.f32636p2 && (m10 = this.f32543c.m(0)) != null) {
            this.f32528a.scrollBy(0, m10.getTop() - T3());
        }
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new ii(this, 5));
    }

    @Override
    public final android.animation.AnimatorSet onCustomTransitionAnimation(boolean r23, java.lang.Runnable r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onCustomTransitionAnimation(boolean, java.lang.Runnable):android.animation.AnimatorSet");
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        lz0 lz0Var = this.f32528a;
        if (lz0Var != null) {
            lz0Var.f1();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        r01 r01Var = this.O;
        if (r01Var != null) {
            r01Var.F0();
        }
        org.telegram.ui.Components.pv0 pv0Var = this.R;
        if (pv0Var != null) {
            pv0Var.b(this);
        }
        org.telegram.ui.Components.pv0 pv0Var2 = this.R;
        if (pv0Var2 != null) {
            pv0Var2.f28432x.remove(this);
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
        wz0 wz0Var = this.f32620n0;
        if (wz0Var != null) {
            wz0Var.K();
        }
        org.telegram.ui.Components.gi0 gi0Var = this.m0;
        if (gi0Var != null) {
            gi0Var.e();
        }
        this.J5 = null;
        if (this.f32559e1 != 0) {
            getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
            getNotificationCenter().removeObserver(this, NotificationCenter.contactsDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatCreated);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.blockedUsersDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.botInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.reloadInterface);
            getMessagesController().cancelLoadFullUser(this.f32559e1);
        } else if (this.f32567f1 != 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.uploadStoryEnd);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatOnlineCountDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.channelRightsUpdated);
        }
        vz0 vz0Var = this.f32558e0;
        if (vz0Var != null) {
            vz0Var.setImageDrawable(null);
        }
        org.telegram.ui.Components.i50 i50Var = this.f32640q0;
        if (i50Var != null) {
            i50Var.d();
        }
        a01 a01Var = this.V4;
        if (a01Var != null) {
            a01Var.b();
        }
        t11 t11Var = this.f32700y2;
        if (t11Var != null && this.f32693x2) {
            t11Var.b(true);
            this.f32700y2 = null;
        }
        org.telegram.messenger.r8 r8Var = this.f32696x5;
        if (r8Var != null) {
            this.f32696x5 = null;
            AndroidUtilities.runOnUIThread(r8Var);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onPause() {
        org.telegram.ui.Components.du0 du0Var;
        super.onPause();
        UndoView undoView = this.M;
        if (undoView != null) {
            undoView.e(0, true);
        }
        org.telegram.ui.Components.i50 i50Var = this.f32640q0;
        if (i50Var != null) {
            i50Var.i();
        }
        FlagSecureReason flagSecureReason = this.X1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        r01 r01Var = this.O;
        if (r01Var != null && (du0Var = r01Var.T) != null) {
            du0Var.e = false;
            if (du0Var.f36889c != null) {
                du0Var.f36887a.onPause();
            }
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        org.telegram.ui.Components.i50 i50Var = this.f32640q0;
        if (i50Var != null) {
            i50Var.j(i10, strArr, iArr);
        }
        if (i10 != 101 && i10 != 102) {
            if (i10 == 103 && this.E2 != null) {
                int i11 = 0;
                while (true) {
                    if (i11 < iArr.length) {
                        if (iArr[i11] != 0) {
                            z13 = false;
                            break;
                        }
                        i11++;
                    } else {
                        z13 = true;
                        break;
                    }
                }
                if (iArr.length > 0 && z13) {
                    ChatObject.Call groupCall = getMessagesController().getGroupCall(this.f32567f1, false);
                    TLRPC.Chat chat = this.E2;
                    if (groupCall == null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    org.telegram.ui.Components.voip.d2.l(chat, null, z14, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                org.telegram.ui.Components.voip.d2.h(getParentActivity(), null, i10);
                return;
            }
            return;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f32559e1));
        if (user == null) {
            return;
        }
        int i12 = 0;
        while (true) {
            if (i12 < iArr.length) {
                if (iArr[i12] != 0) {
                    z10 = false;
                    break;
                }
                i12++;
            } else {
                z10 = true;
                break;
            }
        }
        if (iArr.length > 0 && z10) {
            if (i10 == 102) {
                z11 = true;
            } else {
                z11 = false;
            }
            TLRPC.UserFull userFull = this.f32678v2;
            if (userFull != null && userFull.video_calls_available) {
                z12 = true;
            } else {
                z12 = false;
            }
            org.telegram.ui.Components.voip.d2.m(user, z11, z12, getParentActivity(), this.f32678v2, getAccountInstance());
            return;
        }
        org.telegram.ui.Components.voip.d2.h(getParentActivity(), null, i10);
    }

    @Override
    public final void onResume() {
        TLRPC.User user;
        x50 x50Var;
        super.onResume();
        r01 r01Var = this.O;
        if (r01Var != null) {
            r01Var.f31343b1 = true;
            org.telegram.ui.Components.cu0 cu0Var = r01Var.H;
            if (cu0Var != null) {
                cu0Var.l();
            }
            org.telegram.ui.Components.kv0 kv0Var = r01Var.K;
            if (kv0Var != null) {
                kv0Var.l();
            }
            org.telegram.ui.Components.lv0 lv0Var = r01Var.J;
            if (lv0Var != null) {
                lv0Var.X(false);
            }
            for (int i10 = 0; i10 < r01Var.f31364k0.length; i10++) {
                r01Var.U(i10);
            }
            org.telegram.ui.Components.du0 du0Var = r01Var.T;
            if (du0Var != null) {
                du0Var.e = true;
                if (du0Var.f36889c != null) {
                    du0Var.f36887a.onResume();
                }
            }
        }
        f4();
        f11 f11Var = this.d;
        if (f11Var != null) {
            this.T4 = true;
            f11Var.l();
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (x50Var = this.U) != null && x50Var.getVisibility() == 0) {
            this.U.setVisibility(8);
            this.U.setBackground(null);
        }
        org.telegram.ui.Components.i50 i50Var = this.f32640q0;
        if (i50Var != null) {
            i50Var.k();
            setParentActivityTitle(LocaleController.getString(R.string.Settings));
        }
        i5(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new ii(this, 5));
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.f32565f[1];
        if (h5Var != null) {
            setParentActivityTitle(h5Var.getText());
        }
        if (this.f32559e1 != 0 && (user = getMessagesController().getUser(Long.valueOf(this.f32559e1))) != null && user.photo == null && this.Q1 >= T3()) {
            this.f32596j2.cancel();
            float[] fArr = this.f32614m2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            J4(1.0f);
            this.f32620n0.setVisibility(8);
            this.Q1 = T3();
            this.f32629o2 = false;
            this.f32543c.h1(0, T3() - this.f32528a.getPaddingTop());
        }
        FlagSecureReason flagSecureReason = this.X1;
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
                int i10 = this.J1;
                if (i10 != 0 && this.M1) {
                    if (i10 == 1) {
                        this.f32603k2 = 0.0f;
                        org.telegram.ui.Components.hx0 hx0Var = this.T;
                        if (hx0Var != null) {
                            hx0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.ei0 ei0Var = this.f32529a0;
                        if (ei0Var != null) {
                            ei0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.wi0 wi0Var = this.f32544c0;
                        if (wi0Var != null) {
                            wi0Var.setParentExpanded(0.0f);
                        }
                    }
                    this.G1 = false;
                    A3();
                    if (this.I1) {
                        D3(true);
                    }
                }
                if (!this.f32611l5) {
                    this.f32611l5 = true;
                    this.U4 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().onAnimationFinish(this.P4);
            x50 x50Var = this.U;
            if (x50Var != null && x50Var.getVisibility() == 0) {
                this.U.setVisibility(8);
                this.U.setBackground(null);
            }
        }
        this.H1 = false;
        B3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        x50 x50Var = this.U;
        if (x50Var != null && x50Var.getVisibility() == 0) {
            if (z10) {
                this.U.setAlpha(1.0f - f7);
            } else {
                this.U.setAlpha(f7);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        q11 q11Var;
        ImageView imageView;
        org.telegram.ui.Components.ei0 ei0Var;
        super.onTransitionAnimationStart(z10, z11);
        this.M5 = z10;
        if (z10 && (ei0Var = this.f32529a0) != null) {
            ArrayList arrayList = ei0Var.f24708a;
            if (ei0Var.H == 6) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.ui.Components.bi0 bi0Var = (org.telegram.ui.Components.bi0) arrayList.get(i10);
                    org.telegram.ui.Components.yj0 yj0Var = bi0Var.f23774k;
                    if (yj0Var != null) {
                        if (bi0Var.f23767a == 15) {
                            yj0Var.M(14);
                        } else {
                            yj0Var.M(0);
                        }
                        bi0Var.f23774k.start();
                    }
                }
            }
        }
        if (!z10 && (imageView = this.O0) != null && imageView.getTag() != null && (this.O0.getTag() instanceof org.telegram.ui.ActionBar.u0)) {
            ((org.telegram.ui.ActionBar.u0) this.O0.getTag()).setAlpha(1.0f);
        }
        if (((!z10 && z11) || (z10 && !z11)) && this.J1 != 0 && this.M1 && !this.f32636p2) {
            this.G1 = true;
            if (!z10) {
                if (this.J5 == null) {
                    this.J5 = new float[16];
                }
                this.F1 = this.Q1;
                this.J5[0] = this.Y.getScaleX();
                this.J5[1] = this.Y.getTranslationX();
                this.J5[2] = this.Y.getTranslationY();
                org.telegram.ui.Components.ei0 ei0Var2 = this.f32529a0;
                if (ei0Var2 != null) {
                    this.J5[3] = ei0Var2.getAlpha();
                }
                zh.f0 f0Var = this.f32676v0;
                if (f0Var != null) {
                    float[] fArr = this.J5;
                    fArr[4] = f0Var.e;
                    fArr[5] = f0Var.f50484f;
                }
                if (this.f32542b6 != null) {
                    this.J5[6] = q11Var.getAlpha();
                }
                float[] fArr2 = this.J5;
                org.telegram.ui.ActionBar.h5[] h5VarArr = this.f32565f;
                fArr2[7] = h5VarArr[1].getScaleX();
                this.J5[8] = h5VarArr[1].getTranslationY();
                float[] fArr3 = this.J5;
                org.telegram.ui.ActionBar.h5[] h5VarArr2 = this.f32646r;
                fArr3[9] = h5VarArr2[1].getTranslationY();
                this.J5[10] = h5VarArr[1].getLayoutParams().width;
                this.J5[11] = this.f32546c2;
                for (int i11 = 0; i11 < h5VarArr.length; i11++) {
                    org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[i11];
                    if (h5Var != null) {
                        int i12 = i11 * 2;
                        this.J5[i12 + 12] = h5Var.getTranslationX();
                        this.J5[i12 + 13] = h5VarArr2[i11].getTranslationX();
                    }
                }
                di.d4 d4Var = this.f32557d6;
                if (d4Var != null) {
                    d4Var.e(true);
                }
            }
        }
        if (z10) {
            if (this.f32640q0 != null) {
                this.P4 = getNotificationCenter().setAnimationInProgress(this.P4, new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaCountsDidLoad, NotificationCenter.userInfoDidLoad, NotificationCenter.needCheckSystemBarColors});
            } else {
                this.P4 = getNotificationCenter().setAnimationInProgress(this.P4, new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaCountsDidLoad, NotificationCenter.needCheckSystemBarColors});
            }
            if (!z11 && getParentActivity() != null) {
                this.Y4 = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.H1 = true;
        B3();
    }

    public final void p4() {
        TLRPC.UserFull userFull = this.f32678v2;
        if (userFull != null && UserObject.areGiftsDisabled(userFull)) {
            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
            if (U != null) {
                org.telegram.ui.Components.zc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(a())))).j();
                return;
            }
            return;
        }
        if (this.E2 != null) {
            org.telegram.ui.Components.w40.h.a();
        }
        showDialog(new yh.p1(getParentActivity(), this.currentAccount, a(), null, null));
    }

    public final void p5() {
        if (this.v != null) {
            try {
                Drawable mutate = this.fragmentView.getContext().getResources().getDrawable(R.drawable.floating_shadow_profile).mutate();
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
                int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20281xh, this.f32703z0);
                int w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20297yh, this.f32703z0);
                int w04 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20262wh, this.f32703z0);
                if (this.Q5 != null && org.telegram.ui.ActionBar.g6.c1(w02)) {
                    w02 = org.telegram.ui.ActionBar.g6.b(0.05f, -0.04f, this.Q5.getBgColor1(false));
                    MessagesController.PeerColor peerColor = this.Q5;
                    if (peerColor != null) {
                        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.g6.I.q());
                        w03 = org.telegram.ui.ActionBar.g6.C(org.telegram.ui.ActionBar.g6.I.q(), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20233v6, this.f32703z0), bgColor2, w03, bgColor2);
                    }
                    w04 = -1;
                }
                org.telegram.ui.Components.cr crVar = new org.telegram.ui.Components.cr(mutate, org.telegram.ui.ActionBar.g6.i0(AndroidUtilities.dp(56.0f), w02, w03), 0, 0);
                int dp = AndroidUtilities.dp(56.0f);
                int dp2 = AndroidUtilities.dp(56.0f);
                crVar.e = dp;
                crVar.f24194f = dp2;
                this.v.setBackground(crVar);
                this.v.setColorFilter(new PorterDuffColorFilter(w04, mode));
            } catch (Exception unused) {
            }
        }
    }

    public final void q4(boolean z10) {
        boolean[] zArr = {true};
        getMessagesController().addUserToChat(this.E2.f19216id, getUserConfig().getCurrentUser(), 0, null, this, true, new ma0(this, z10, zArr, 7), new da.b(this, zArr, z10, this.parentLayout.getLastFragment(), 6));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
    }

    @Override
    public final boolean r() {
        return this.M5;
    }

    public final void r4(View view, float f7, float f10, boolean z10) {
        float f11;
        float f12;
        long j10;
        long j11 = this.f32588i1;
        if (j11 == 0) {
            j11 = this.f32559e1;
            if (j11 == 0) {
                j11 = -this.f32567f1;
            }
        }
        long j12 = j11;
        boolean isDialogMuted = getMessagesController().isDialogMuted(j12, this.f32574g1);
        if (z10 && (this.f32641q1 || isDialogMuted)) {
            boolean z11 = !isDialogMuted;
            getNotificationsController().muteDialog(j12, this.f32574g1, z11);
            org.telegram.ui.Components.zc.A(this, z11, null).j();
            a5();
            this.f32529a0.setNotifications(isDialogMuted);
        } else if ((!z10 && LocaleController.isRTL && f7 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f7 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
            org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
            boolean z12 = j5Var.e.h;
            boolean z13 = !z12;
            boolean isGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(j12, false, false);
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j12, this.f32574g1);
            if (!z12) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
                if (isGlobalNotificationsEnabled) {
                    edit.remove("notify2_" + sharedPrefKey);
                } else {
                    edit.putInt("notify2_" + sharedPrefKey, 0);
                }
                if (this.f32574g1 == 0) {
                    getMessagesStorage().setDialogFlags(j12, 0L);
                    TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j12);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
                edit.apply();
            } else {
                SharedPreferences.Editor edit2 = MessagesController.getNotificationsSettings(this.currentAccount).edit();
                if (!isGlobalNotificationsEnabled) {
                    edit2.remove("notify2_" + sharedPrefKey);
                    j10 = 0L;
                } else {
                    edit2.putInt("notify2_" + sharedPrefKey, 2);
                    j10 = 1;
                }
                getNotificationsController().removeNotificationsForDialog(j12);
                if (this.f32574g1 == 0) {
                    getMessagesStorage().setDialogFlags(j12, j10);
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j12);
                    if (dialog2 != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog2.notify_settings = tL_peerNotifySettings;
                        if (isGlobalNotificationsEnabled) {
                            tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                        }
                    }
                }
                edit2.apply();
            }
            a5();
            getNotificationsController().updateServerNotificationsSettings(j12, this.f32574g1);
            j5Var.setChecked(z13);
            org.telegram.ui.Components.wl0 wl0Var = (org.telegram.ui.Components.wl0) this.f32528a.L(this.N3, false);
            g5(true);
        } else {
            org.telegram.ui.Components.cp cpVar = new org.telegram.ui.Components.cp(getParentActivity(), this.currentAccount, null, true, new ad.d(this, j12, 6), this.f32703z0);
            cpVar.d(j12, this.f32574g1, this.f32585h5);
            if (AndroidUtilities.isTablet()) {
                ViewGroup view2 = this.parentLayout.getView();
                f11 = view2.getX() + view2.getPaddingLeft() + f7;
                f12 = view2.getY() + view2.getPaddingTop() + f10;
            } else {
                f11 = f7;
                f12 = f10;
            }
            if (z10) {
                f12 += this.f32529a0.getHeight() - AndroidUtilities.dp(12.0f);
            }
            cpVar.c(this, view, f11, f12, z10);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.i50 i50Var = this.f32640q0;
        if (i50Var != null) {
            i50Var.f25832f = bundle.getString("path");
        }
    }

    public final void s4() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.f32559e1 != 0) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f32559e1));
                if (user != null) {
                    if (this.F2 != null && (userFull = this.f32678v2) != null && !TextUtils.isEmpty(userFull.about)) {
                        str = String.format("%s https://" + getMessagesController().linkPrefix + "/%s", this.f32678v2.about, UserObject.getPublicUsername(user));
                    } else {
                        str = String.format("https://" + getMessagesController().linkPrefix + "/%s", UserObject.getPublicUsername(user));
                    }
                } else {
                    return;
                }
            } else if (this.f32567f1 != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f32567f1));
                if (chat != null) {
                    TLRPC.ChatFull chatFull = this.f32671u2;
                    if (chatFull != null && !TextUtils.isEmpty(chatFull.about)) {
                        str = String.format("%s\nhttps://" + getMessagesController().linkPrefix + "/%s", this.f32671u2.about, ChatObject.getPublicUsername(chat));
                    } else {
                        str = String.format("https://" + getMessagesController().linkPrefix + "/%s", ChatObject.getPublicUsername(chat));
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
            startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.BotShare)), 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.i50 i50Var = this.f32640q0;
        if (i50Var != null && (str = i50Var.f25832f) != null) {
            bundle.putString("path", str);
        }
    }

    public void setAvatarAnimationProgress(float f7) {
        int w02;
        int w03;
        int w04;
        int i10;
        int w32;
        int w33;
        this.f32603k2 = f7;
        this.S1 = f7;
        B3();
        if (this.J1 == 2) {
            this.f32558e0.setProgressToExpand(f7);
            org.telegram.ui.Components.ei0 ei0Var = this.f32529a0;
            if (ei0Var != null) {
                ei0Var.setParentExpanded(f7);
            }
            org.telegram.ui.Components.wi0 wi0Var = this.f32544c0;
            if (wi0Var != null) {
                wi0Var.setParentExpanded(f7);
            }
            org.telegram.ui.Components.hx0 hx0Var = this.T;
            if (hx0Var != null) {
                hx0Var.setParentExpanded(f7);
            }
            S4();
            f5();
        }
        this.f32528a.setAlpha(f7);
        this.f32528a.setTranslationX(AndroidUtilities.dp(48.0f) - (AndroidUtilities.dp(48.0f) * f7));
        if (this.J1 != 2 || (w02 = this.f32647r0) == 0) {
            if (this.f32559e1 == 0 && ChatObject.isChannel(this.f32567f1, this.currentAccount)) {
                boolean z10 = this.E2.megagroup;
            }
            org.telegram.ui.ActionBar.c6 c6Var = this.f32703z0;
            int[][] iArr = org.telegram.ui.Components.k9.C;
            w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19843a7, c6Var);
        }
        int i11 = this.X4;
        if (i11 == 0) {
            i11 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20180s8, this.f32703z0);
        }
        this.f32552d1.setBackgroundColor(i0.a.d(f7, i0.a.k(i11, 0), w02));
        org.telegram.ui.Components.w21 w21Var = this.f32608l0;
        int d = i0.a.d(f7, i11, w02);
        w21Var.f30780k = true;
        w21Var.f30774b.setColor(d);
        int i12 = -1;
        if (this.Q5 != null) {
            w03 = -1;
        } else {
            if (this.f32559e1 == 0 && ChatObject.isChannel(this.f32567f1, this.currentAccount)) {
                boolean z11 = this.E2.megagroup;
            }
            org.telegram.ui.ActionBar.c6 c6Var2 = this.f32703z0;
            int[][] iArr2 = org.telegram.ui.Components.k9.C;
            w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19956g8, c6Var2);
        }
        this.actionBar.D(i0.a.d(this.S1, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20235v8, this.f32703z0), w03), false);
        if (this.Q5 == null) {
            i12 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20244vh, this.f32703z0);
        }
        int w05 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.A8, this.f32703z0);
        for (int i13 = 0; i13 < 2; i13++) {
            org.telegram.ui.ActionBar.h5 h5Var = this.f32565f[i13];
            if (h5Var != null && (i13 != 1 || this.J1 != 2)) {
                h5Var.setTextColor(i0.a.d(f7, w05, i12));
            }
        }
        boolean[] zArr = this.J0;
        if (zArr[0]) {
            w04 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Bh, this.f32703z0);
        } else {
            if (this.f32559e1 == 0 && ChatObject.isChannel(this.f32567f1, this.currentAccount)) {
                boolean z12 = this.E2.megagroup;
            }
            org.telegram.ui.ActionBar.c6 c6Var3 = this.f32703z0;
            int[][] iArr3 = org.telegram.ui.Components.k9.C;
            w04 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19975h8, c6Var3);
        }
        if (zArr[0]) {
            i10 = org.telegram.ui.ActionBar.g6.f20124pa;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.B8;
        }
        int w06 = org.telegram.ui.ActionBar.g6.w0(i10, this.f32703z0);
        for (int i14 = 0; i14 < 3; i14++) {
            org.telegram.ui.ActionBar.h5 h5Var2 = this.f32646r[i14];
            if (h5Var2 != null && i14 != 1 && (i14 != 2 || this.J1 != 2)) {
                if (i14 == 0) {
                    w32 = w06;
                } else {
                    w32 = w3(w06, Boolean.valueOf(zArr[0]));
                }
                if (i14 == 0) {
                    w33 = w04;
                } else {
                    w33 = w3(w04, Boolean.valueOf(zArr[0]));
                }
                h5Var2.setTextColor(i0.a.d(f7, w32, w33));
            }
        }
        this.Q1 = this.R1 * f7;
        long j10 = this.f32559e1;
        if (j10 == 0) {
            j10 = this.f32567f1;
        }
        org.telegram.ui.ActionBar.c6 c6Var4 = this.f32703z0;
        int[][] iArr4 = org.telegram.ui.Components.k9.C;
        int w07 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20123p8[org.telegram.ui.Components.k9.e(j10)], c6Var4);
        long j11 = this.f32559e1;
        if (j11 == 0) {
            j11 = this.f32567f1;
        }
        int d10 = org.telegram.ui.Components.k9.d(j11);
        if (w07 != d10) {
            this.f32634p0.h(i0.a.d(f7, d10, w07));
            this.f32558e0.invalidate();
        }
        int i15 = this.Y4;
        if (i15 != 0) {
            setNavigationBarColor(i0.a.d(f7, i15, getNavigationBarColor()));
        }
        this.f32552d1.invalidate();
        k4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        a11 a11Var = this.N5;
        if (a11Var != null) {
            a11Var.invalidate();
        }
        if (a() > 0) {
            vz0 vz0Var = this.f32558e0;
            if (vz0Var != null) {
                vz0Var.setProgressToStoriesInsets(this.S1);
            }
            yz0 yz0Var = this.f32669u0;
            if (yz0Var != null) {
                yz0Var.setProgressToStoriesInsets(this.S1);
            }
            zh.f0 f0Var = this.f32676v0;
            if (f0Var != null) {
                f0Var.setProgressToStoriesInsets(this.S1);
            }
        }
    }

    @Override
    public final void setParentLayout(org.telegram.ui.ActionBar.b5 b5Var) {
        super.setParentLayout(b5Var);
        FlagSecureReason flagSecureReason = this.X1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
            this.X1 = null;
        }
        if (b5Var != null && b5Var.getParentActivity() != null) {
            this.X1 = new FlagSecureReason(b5Var.getParentActivity().getWindow(), new py0(this, 6));
        }
    }

    @Override
    public final void t() {
        this.f32528a.x0(0);
    }

    public final void t4(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.L3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f32567f1);
            bundle.putLong("user_id", this.f32559e1);
            presentFragment(new l31(bundle));
        } else if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.U2) {
            if (this.f32559e1 == getUserConfig().getClientUserId()) {
                presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
            } else if (UserObject.areGiftsDisabled(this.f32678v2)) {
                org.telegram.ui.Components.zc.a0(this).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.f32559e1)))).j();
            } else {
                showDialog(new yh.p1(getParentActivity(), this.currentAccount, this.f32559e1, null, null));
            }
        }
    }

    public final void u4() {
        boolean z10;
        org.telegram.ui.Components.yj0 yj0Var;
        if (this.f32559e1 != 0) {
            if (this.f32640q0 != null) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
                if (user == null) {
                    user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
                }
                if (user != null) {
                    org.telegram.ui.Components.i50 i50Var = this.f32640q0;
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i50Var.n(z10, new cc0(this, 24), new v5(this, 13), 0);
                    this.V.M(0);
                    this.V.P(43);
                    this.W.M(0);
                    this.W.P(43);
                    org.telegram.ui.Components.ei0 ei0Var = this.f32529a0;
                    if (ei0Var != null) {
                        org.telegram.ui.Components.bi0 j10 = org.telegram.ui.Components.ei0.j(14, ei0Var.f24708a);
                        if (j10 != null && (yj0Var = j10.f23774k) != null) {
                            yj0Var.start();
                        }
                    } else {
                        this.v.d();
                    }
                    org.telegram.ui.Cells.r8 r8Var = this.M2;
                    if (r8Var != null) {
                        r8Var.getImageView().d();
                        return;
                    }
                    return;
                }
                return;
            }
            x4();
            return;
        }
        y4();
    }

    @Override
    public final boolean v() {
        return false;
    }

    public final CharSequence v3(CharSequence charSequence) {
        if (!ChatObject.isHiddenInCommunity(this.currentAccount, this.f32588i1)) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.br(R.drawable.mini_ephemeral_hidden_16, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityHiddenStatus));
        spannableStringBuilder.append((CharSequence) " * ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.pt(), length - 2, length - 1, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final void v4() {
        Bundle h = a1.g.h("addToGroup", true);
        h.putLong("chatId", this.E2.f19216id);
        j70 j70Var = new j70(h);
        TLRPC.ChatFull chatFull = this.f32671u2;
        j70Var.I = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            a0.h hVar = new a0.h();
            for (int i10 = 0; i10 < this.f32671u2.participants.participants.size(); i10++) {
                hVar.k(null, this.f32671u2.participants.participants.get(i10).user_id);
            }
            j70Var.J = hVar;
        }
        j70Var.f37297x = new py0(this, 9);
        presentFragment(j70Var);
    }

    @Override
    public final boolean w(yy yyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, lg1 lg1Var) {
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle h = a1.g.h("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j10)) {
            h.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
        } else if (DialogObject.isUserDialog(j10)) {
            h.putLong("user_id", j10);
        } else if (DialogObject.isChatDialog(j10)) {
            h.putLong("chat_id", -j10);
        }
        if (!getMessagesController().checkCanOpenChat(h, yyVar)) {
            return false;
        }
        NotificationCenter notificationCenter = getNotificationCenter();
        int i12 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(this, i12);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
        presentFragment(new fo(h), true);
        removeSelfFromStack();
        getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(getMessagesController().getUser(Long.valueOf(this.f32559e1)), j10, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z11, i10, i11));
        if (!TextUtils.isEmpty(charSequence)) {
            SendMessagesHelper.prepareSendingText(AccountInstance.getInstance(this.currentAccount), charSequence, j10, z11, i10, i11, 0L);
        }
        return true;
    }

    public final int w3(int i10, Boolean bool) {
        int i11;
        if (this.Q5 != null) {
            int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20180s8, this.f32703z0);
            int d = i0.a.d(0.5f, this.Q5.getStoryColor1(org.telegram.ui.ActionBar.g6.I.q()), this.Q5.getStoryColor2(org.telegram.ui.ActionBar.g6.I.q()));
            if (!org.telegram.ui.ActionBar.g6.c1(w02)) {
                if (bool != null && !bool.booleanValue()) {
                    return org.telegram.ui.ActionBar.g6.b(-0.2f, 0.2f, org.telegram.ui.ActionBar.g6.m1(0.7f, d));
                }
                return d;
            }
            boolean q6 = org.telegram.ui.ActionBar.g6.I.q();
            if (bool != null && !bool.booleanValue()) {
                i11 = org.telegram.ui.ActionBar.g6.m1(0.7f, d);
            } else {
                i11 = d;
            }
            return org.telegram.ui.ActionBar.g6.C(q6, w02, d, i10, i11);
        }
        return i10;
    }

    public final void w4(boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.w4(boolean):void");
    }

    public final void x3() {
        int i10;
        int i11;
        if (this.J5 != null) {
            ValueAnimator valueAnimator = this.f32596j2;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f32596j2.cancel();
            }
            float clamp01 = Utilities.clamp01(this.Q1 / this.F1);
            if (clamp01 > 0.0f) {
                float f7 = (clamp01 - 0.5f) / 0.5f;
                int i12 = 0;
                if (this.actionBar.getOccupyStatusBar()) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                float translationY = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i10) - AndroidUtilities.dp(21.0f));
                this.f32538b2 = AndroidUtilities.lerp(0.42f, this.J5[0], clamp01);
                this.Z1 = AndroidUtilities.lerp(this.O5, this.J5[1], clamp01);
                this.a2 = AndroidUtilities.lerp(translationY, this.J5[2], clamp01);
                this.f32546c2 = AndroidUtilities.lerp(this.J5[11], 0.0f, clamp01);
                this.Y.setScaleX(this.f32538b2);
                this.Y.setScaleY(this.f32538b2);
                this.Y.setTranslationX(this.Z1);
                this.Y.setTranslationY(this.a2);
                org.telegram.ui.Components.hx0 hx0Var = this.T;
                if (hx0Var != null) {
                    hx0Var.setAlpha(clamp01);
                }
                this.f32558e0.setAlpha(1.0f);
                this.Y.setAlpha(1.0f);
                yz0 yz0Var = this.f32669u0;
                if (yz0Var != null) {
                    yz0Var.invalidate();
                }
                zh.f0 f0Var = this.f32676v0;
                if (f0Var != null) {
                    f0Var.e = AndroidUtilities.lerp(0.0f, this.J5[4], f7);
                    this.f32676v0.f50484f = AndroidUtilities.lerp(0.0f, this.J5[5], clamp01);
                    zh.f0 f0Var2 = this.f32676v0;
                    f0Var2.h = true;
                    f0Var2.invalidate();
                }
                q11 q11Var = this.f32542b6;
                if (q11Var != null) {
                    q11Var.setAlpha((int) AndroidUtilities.lerp(0.0f, this.J5[6], clamp01));
                }
                float dp = (((this.f32538b2 * 100.0f) / 42.0f) * AndroidUtilities.dp(42.0f)) - AndroidUtilities.dp(42.0f);
                this.f32580h0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(16.0f) + dp);
                this.f32580h0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(-10.0f) + dp);
                this.f32587i0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + dp);
                this.f32587i0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(26.5f) + dp);
                this.f32594j0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + dp);
                this.f32594j0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(24.0f) + dp);
                this.f32601k0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + dp);
                this.f32601k0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(24.0f) + dp);
                float lerp = AndroidUtilities.lerp(1.0f, this.J5[7], clamp01);
                if (this.actionBar.getOccupyStatusBar()) {
                    i11 = AndroidUtilities.statusBarHeight;
                } else {
                    i11 = 0;
                }
                float currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f;
                float floor = ((float) Math.floor(this.actionBar.getTranslationY() + ((currentActionBarHeight + i11) - (AndroidUtilities.density * 21.0f)))) + AndroidUtilities.dp(1.3f);
                float dpf2 = AndroidUtilities.dpf2(22.7f) + floor;
                this.f32560e2 = AndroidUtilities.lerp(floor, this.J5[8], clamp01);
                this.f32575g2 = AndroidUtilities.lerp(dpf2, this.J5[9], clamp01);
                int i13 = 0;
                while (true) {
                    org.telegram.ui.ActionBar.h5[] h5VarArr = this.f32565f;
                    if (i13 >= h5VarArr.length) {
                        break;
                    }
                    if (h5VarArr[i13] != null) {
                        int i14 = i13 * 2;
                        float lerp2 = AndroidUtilities.lerp((this.O5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f), this.J5[i14 + 12], clamp01);
                        float lerp3 = AndroidUtilities.lerp((this.O5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f), this.J5[i14 + 13], clamp01);
                        h5VarArr[i13].setTranslationX(lerp2);
                        h5VarArr[i13].setTranslationY(this.f32560e2);
                        org.telegram.ui.ActionBar.h5[] h5VarArr2 = this.f32646r;
                        h5VarArr2[i13].setTranslationX(this.f32632o5 + lerp3);
                        h5VarArr2[i13].setTranslationY(this.f32575g2);
                        if (i13 == 1) {
                            this.f32553d2 = lerp2;
                            this.f32568f2 = lerp3;
                            this.f32654s.setTranslationX(lerp3);
                            this.f32654s.setTranslationY(this.f32575g2);
                        }
                        h5VarArr[i13].setScaleX(lerp);
                        h5VarArr[i13].setScaleY(lerp);
                    }
                    i13++;
                }
                V4();
                if (this.actionBar.getOccupyStatusBar()) {
                    i12 = AndroidUtilities.statusBarHeight;
                }
                b5(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12);
                l4((int) this.J5[10], clamp01, true);
                org.telegram.ui.Components.ei0 ei0Var = this.f32529a0;
                if (ei0Var != null) {
                    ei0Var.setAlpha(AndroidUtilities.lerp(0.0f, this.J5[3], f7));
                }
            }
        }
    }

    public final void x4() {
        TLRPC.User user;
        if (this.f32559e1 != 0 && !M3() && (user = getMessagesController().getUser(Long.valueOf(this.f32559e1))) != null && !(user instanceof TLRPC.TL_userEmpty)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.f32559e1);
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
                fo foVar = new fo(bundle);
                foVar.B9 = getMediaDataController().getGreetingsSticker();
                foVar.C9 = false;
                presentFragment(foVar, z10);
                if (AndroidUtilities.isTablet() && !this.I0) {
                    finishFragment();
                }
            }
        }
    }

    public final float y3() {
        return Utilities.clamp01((this.Q1 - O3()) / U3());
    }

    public final void y4() {
        TLRPC.ChatFull chatFull = this.f32671u2;
        if (chatFull != null && chatFull.linked_chat_id != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f32671u2.linked_chat_id);
            if (getMessagesController().checkCanOpenChat(bundle, this)) {
                presentFragment(new fo(bundle));
            }
        }
    }

    @Override
    public final gh.d z() {
        return this.f32626n6;
    }

    public final void z3() {
        int i10;
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.h5[] h5VarArr;
        int i11 = 0;
        if (this.actionBar.getOccupyStatusBar()) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        this.a2 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10) - AndroidUtilities.dp(21.0f));
        this.f32538b2 = 1.38f;
        this.f32546c2 = 0.0f;
        N3();
        D4();
        l4(0, 1.0f, true);
        while (true) {
            org.telegram.ui.ActionBar.h5[] h5VarArr2 = this.f32565f;
            if (i11 >= h5VarArr2.length) {
                break;
            }
            if (h5VarArr2[i11] != null) {
                float measuredWidth = (this.f32528a.getMeasuredWidth() / 2.0f) - (((h5VarArr2[i11].getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) h5Var.getLayoutParams()).leftMargin);
                float measuredWidth2 = (this.f32528a.getMeasuredWidth() / 2.0f) - ((this.f32646r[i11].getExactWidth() * 0.5f) + ((FrameLayout.LayoutParams) h5VarArr[i11].getLayoutParams()).leftMargin);
                if (i11 == 1) {
                    this.f32553d2 = measuredWidth;
                    this.f32568f2 = measuredWidth2;
                }
            }
            i11++;
        }
        if (this.J1 != 2) {
            this.f32669u0.setAlpha(1.0f);
        }
        this.Y.setAlpha(1.0f);
        this.f32558e0.setAlpha(1.0f);
    }

    public final void z4(boolean z10) {
        TLRPC.TL_businessLocation tL_businessLocation;
        String str;
        TLRPC.UserFull userFull = this.f32678v2;
        if (userFull != null && (tL_businessLocation = userFull.business_location) != null) {
            if (tL_businessLocation.geo_point != null && !z10) {
                bi.sa saVar = new bi.sa(3, 1);
                saVar.setResourceProvider(this.f32703z0);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = getMessagesController().getPeer(a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_businessLocation tL_businessLocation2 = this.f32678v2.business_location;
                tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
                tL_messageMediaGeo.address = tL_businessLocation2.address;
                tL_message.media = tL_messageMediaGeo;
                saVar.O0 = false;
                saVar.t0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                presentFragment(saVar);
                return;
            }
            if (BuildVars.isHuaweiStoreApp()) {
                str = "mapapp://navigation";
            } else {
                str = "http://maps.google.com/maps";
            }
            try {
                Locale locale = Locale.US;
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(locale, str + "?q=" + this.f32678v2.business_location.address, new Object[0]))));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public ProfileActivity(Bundle bundle, org.telegram.ui.Components.pv0 pv0Var) {
        super(bundle);
        this.f32565f = new org.telegram.ui.ActionBar.h5[2];
        this.h = null;
        this.f32619n = null;
        this.f32646r = new org.telegram.ui.ActionBar.h5[4];
        this.f32697y = new Drawable[2];
        this.E = new Drawable[2];
        this.G = new org.telegram.ui.Components.q5[2];
        this.H = new org.telegram.ui.Components.q5[2];
        this.I = new Drawable[2];
        this.J = new org.telegram.ui.Components.ds[2];
        this.K = new org.telegram.ui.Components.ds[2];
        this.f32684w0 = null;
        this.f32691x0 = new org.telegram.ui.Components.t50(this, 2);
        this.f32698y0 = new Paint(1);
        this.J0 = new boolean[1];
        this.f32537b1 = 1.0f;
        this.C1 = new a0.h();
        this.M1 = true;
        this.N1 = false;
        this.O1 = false;
        this.P1 = false;
        this.Y1 = new HashMap();
        this.f32614m2 = new float[]{0.0f, 1.0f};
        this.f32642q2 = new Paint();
        this.B2 = -1;
        this.L2 = new Rect();
        this.Q4 = new ArrayList();
        this.R4 = new ArrayList();
        this.S4 = 0;
        this.T4 = true;
        this.U4 = true;
        this.X4 = 0;
        this.Y4 = 0;
        this.Z4 = 0;
        this.f32533a5 = 0L;
        this.f32585h5 = new HashSet();
        this.f32599j5 = new org.telegram.ui.Cells.d2(this);
        this.f32606k5 = new g01(this);
        this.A5 = new ne.b(0, new py0(this, 8), org.telegram.ui.Components.es.h, 380L, true);
        this.G5 = new h01(this);
        this.I5 = new i01(this, 0);
        this.J5 = null;
        this.R5 = new SparseIntArray();
        this.T5 = null;
        this.U5 = -1;
        this.Y5 = -1.0f;
        gh.b bVar = new gh.b();
        this.f32639p6 = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.q6 = bVar2;
        ArrayList arrayList = new ArrayList();
        this.f32668t6 = arrayList;
        RectF rectF = new RectF();
        this.f32675u6 = rectF;
        RectF rectF2 = new RectF();
        this.f32682v6 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        this.R = pv0Var;
        gh.c cVar = new gh.c();
        cVar.a(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, this.f32703z0));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f32618m6 = new bh.f(false);
            gh.d dVar = new gh.d(null);
            this.f32626n6 = dVar;
            bh.b bVar3 = new bh.b(dVar);
            this.f32633o6 = bVar3;
            bVar3.f2747i = LiteMode.isEnabled(262144);
        } else {
            this.f32618m6 = null;
            this.f32626n6 = null;
            this.f32633o6 = new bh.b(cVar);
        }
        bVar2.e = new re.b();
    }

    @Override
    public final void P() {
    }
}

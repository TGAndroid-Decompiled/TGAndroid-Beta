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
import android.graphics.drawable.ColorDrawable;
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
public class ProfileActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, xx, org.telegram.ui.Components.qv0, org.telegram.ui.Components.d50, org.telegram.ui.Components.ju0, qg0 {
    public org.telegram.ui.ActionBar.g6 A0;
    public boolean A1;
    public CharSequence A2;
    public int A3;
    public int A4;
    public FrameLayout A5;
    public final ArrayList A6;
    public int B0;
    public boolean B1;
    public long B2;
    public int B3;
    public int B4;
    public ei.d B5;
    public final RectF B6;
    public ImageLocation C0;
    public boolean C1;
    public int C2;
    public int C3;
    public int C4;
    public final ne.b C5;
    public final RectF C6;
    public int D0;
    public a0.h D1;
    public ArrayList D2;
    public int D3;
    public int D4;
    public cz0 D5;
    public final gh.c[] D6;
    public final Drawable[] E;
    public int E0;
    public boolean E1;
    public TLRPC.EncryptedChat E2;
    public int E3;
    public int E4;
    public AnimatorSet E5;
    public Drawable E6;
    public Long F;
    public int F0;
    public long F1;
    public TLRPC.Chat F2;
    public int F3;
    public int F4;
    public AnimatorSet F5;
    public Drawable F6;
    public final org.telegram.ui.Components.p5[] G;
    public boolean G0;
    public float G1;
    public TL_bots.BotInfo G2;
    public int G3;
    public int G4;
    public float G5;
    public Drawable G6;
    public final org.telegram.ui.Components.p5[] H;
    public boolean H0;
    public boolean H1;
    public TLRPC.ChannelParticipant H2;
    public int H3;
    public int H4;
    public boolean H5;
    public org.telegram.ui.Components.xq H6;
    public final Drawable[] I;
    public boolean I0;
    public boolean I1;
    public TL_account.TL_password I2;
    public int I3;
    public int I4;
    public final hz0 I5;
    public final int[] I6;
    public final org.telegram.ui.Components.as[] J;
    public boolean J0;
    public boolean J1;
    public TLRPC.FileLocation J2;
    public int J3;
    public boolean J4;
    public boolean J5;
    public final org.telegram.ui.Components.as[] K;
    public final boolean[] K0;
    public int K1;
    public TLRPC.FileLocation K2;
    public int K3;
    public boolean K4;
    public final iz0 K5;
    public org.telegram.ui.Components.zm0 L;
    public boolean L0;
    public boolean L1;
    public ImageLocation L2;
    public int L3;
    public int L4;
    public float[] L5;
    public UndoView M;
    public boolean M0;
    public boolean M1;
    public final Rect M2;
    public int M3;
    public int M4;
    public float M5;
    public g01 N;
    public boolean N0;
    public boolean N1;
    public org.telegram.ui.Cells.r8 N2;
    public int N3;
    public int N4;
    public float N5;
    public rz0 O;
    public boolean O0;
    public boolean O1;
    public int O2;
    public int O3;
    public int O4;
    public boolean O5;
    public org.telegram.ui.Components.wx0 P;
    public ImageView P0;
    public boolean P1;
    public int P2;
    public int P3;
    public boolean P4;
    public a01 P5;
    public boolean Q;
    public org.telegram.ui.ActionBar.u0 Q0;
    public boolean Q1;
    public int Q2;
    public int Q3;
    public boolean Q4;
    public float Q5;
    public org.telegram.ui.Components.pv0 R;
    public org.telegram.ui.ActionBar.u0 R0;
    public float R1;
    public int R2;
    public int R3;
    public int R4;
    public float R5;
    public boolean S;
    public org.telegram.ui.ActionBar.u0 S0;
    public float S1;
    public int S2;
    public int S3;
    public final ArrayList S4;
    public MessagesController.PeerColor S5;
    public org.telegram.ui.Components.hx0 T;
    public org.telegram.ui.ActionBar.u0 T0;
    public float T1;
    public int T2;
    public int T3;
    public final ArrayList T4;
    public final SparseIntArray T5;
    public e50 U;
    public org.telegram.ui.ActionBar.u0 U0;
    public int U1;
    public int U2;
    public int U3;
    public int U4;
    public int U5;
    public org.telegram.ui.Components.yj0 V;
    public org.telegram.ui.ActionBar.u0 V0;
    public float V1;
    public int V2;
    public int V3;
    public boolean V4;
    public AnimatorSet V5;
    public org.telegram.ui.Components.yj0 W;
    public org.telegram.ui.ActionBar.e1 W0;
    public ValueAnimator W1;
    public int W2;
    public int W3;
    public boolean W4;
    public int W5;
    public org.telegram.ui.Components.r40 X;
    public org.telegram.ui.ActionBar.e1 X0;
    public boolean X1;
    public int X2;
    public int X3;
    public az0 X4;
    public int X5;
    public l0 Y;
    public org.telegram.ui.ActionBar.e1 Y0;
    public FlagSecureReason Y1;
    public int Y2;
    public int Y3;
    public View Y4;
    public boolean Y5;
    public ah.v Z;
    public ImageView Z0;
    public final HashMap Z1;
    public int Z2;
    public int Z3;
    public int Z4;
    public boolean Z5;
    public ly0 f33882a;
    public org.telegram.ui.Components.ci0 f33883a0;
    public org.telegram.ui.ActionBar.e1 f33884a1;
    public float a2;
    public int f33885a3;
    public int f33886a4;
    public int f33887a5;
    public org.telegram.ui.Components.bk0 f33888a6;
    public org.telegram.ui.Components.mm0 f33889b;
    public MessagesController.SavedMusicList f33890b0;
    public org.telegram.ui.Components.p8 f33891b1;
    public float f33892b2;
    public int f33893b3;
    public int f33894b4;
    public int f33895b5;
    public final int[] f33896b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public oy0 f33897c;
    public org.telegram.ui.Components.vi0 f33898c0;
    public float f33899c1;
    public float f33900c2;
    public int f33901c3;
    public int f33902c4;
    public long f33903c5;
    public float f33904c6;
    public f01 d;
    public org.telegram.ui.Components.di0 f33905d0;
    public int f33906d1;
    public float f33907d2;
    public int f33908d3;
    public int f33909d4;
    public boolean f33910d5;
    public float f33911d6;
    public q01 e;
    public org.telegram.ui.Cells.o f33912e0;
    public t01 f33913e1;
    public float f33914e2;
    public int f33915e3;
    public int f33916e4;
    public boolean f33917e5;
    public float f33918e6;
    public final org.telegram.ui.ActionBar.n5[] f33919f;
    public vy0 f33920f0;
    public long f33921f1;
    public float f33922f2;
    public int f33923f3;
    public int f33924f4;
    public String f33925f5;
    public float f33926f6;
    public AnimatorSet f33927g0;
    public long f33928g1;
    public float f33929g2;
    public int f33930g3;
    public int f33931g4;
    public String f33932g5;
    public float f33933g6;
    public String h;
    public org.telegram.ui.Cells.y3 f33934h0;
    public long f33935h1;
    public float f33936h2;
    public int f33937h3;
    public int f33938h4;
    public String f33939h5;
    public r01 f33940h6;
    public ImageView f33941i0;
    public boolean f33942i1;
    public float f33943i2;
    public int f33944i3;
    public int f33945i4;
    public org.telegram.ui.Components.bh f33946i5;
    public x01 f33947i6;
    public ImageView f33948j0;
    public long f33949j1;
    public float f33950j2;
    public int f33951j3;
    public int f33952j4;
    public final HashSet f33953j5;
    public ei.x3 f33954j6;
    public ImageView f33955k0;
    public boolean f33956k1;
    public ValueAnimator f33957k2;
    public int f33958k3;
    public int f33959k4;
    public CharacterStyle f33960k5;
    public int f33961k6;
    public ImageView f33962l0;
    public boolean l1;
    public float f33963l2;
    public int f33964l3;
    public int l4;
    public final org.telegram.ui.Cells.c2 f33965l5;
    public Boolean f33966l6;
    public org.telegram.ui.Components.w21 m0;
    public boolean f33967m1;
    public float f33968m2;
    public int f33969m3;
    public int f33970m4;
    public final gz0 f33971m5;
    public TLRPC.TL_emojiStatusCollectible f33972m6;
    public String f33973n;
    public org.telegram.ui.Components.fi0 f33974n0;
    public long f33975n1;
    public final float[] f33976n2;
    public int f33977n3;
    public int f33978n4;
    public boolean f33979n5;
    public int f33980n6;
    public wy0 f33981o0;
    public boolean f33982o1;
    public boolean f33983o2;
    public int f33984o3;
    public int f33985o4;
    public pz0 f33986o5;
    public boolean f33987o6;
    public i01 f33988p0;
    public boolean f33989p1;
    public boolean f33990p2;
    public int f33991p3;
    public int f33992p4;
    public float p5;
    public int f33993p6;
    public org.telegram.ui.Components.h9 f33994q0;
    public boolean f33995q1;
    public boolean f33996q2;
    public int f33997q3;
    public int f33998q4;
    public float f33999q5;
    public int q6;
    public final org.telegram.ui.ActionBar.n5[] f34000r;
    public org.telegram.ui.Components.e50 f34001r0;
    public boolean f34002r1;
    public final Paint f34003r2;
    public int f34004r3;
    public int f34005r4;
    public boolean f34006r5;
    public int f34007r6;
    public org.telegram.ui.Components.fp0 f34008s;
    public int f34009s0;
    public boolean f34010s1;
    public boolean f34011s2;
    public int f34012s3;
    public int f34013s4;
    public boolean f34014s5;
    public final bh.f f34015s6;
    public org.telegram.ui.Components.w21 f34016t0;
    public boolean f34017t1;
    public gi.u0 f34018t2;
    public int f34019t3;
    public int f34020t4;
    public ImageReceiver f34021t5;
    public final gh.d f34022t6;
    public org.telegram.ui.Components.si0 f34023u0;
    public boolean f34024u1;
    public gi.r f34025u2;
    public int f34026u3;
    public int f34027u4;
    public FrameLayout f34028u5;
    public final gh.c f34029u6;
    public org.telegram.ui.Components.bk0 v;
    public yy0 f34030v0;
    public int f34031v1;
    public TLRPC.ChatFull f34032v2;
    public int f34033v3;
    public int f34034v4;
    public FrameLayout[] f34035v5;
    public final bh.b f34036v6;
    public AnimatorSet f34037w;
    public ai.j1 f34038w0;
    public boolean f34039w1;
    public TLRPC.UserFull f34040w2;
    public int f34041w3;
    public int f34042w4;
    public SpannableStringBuilder f34043w5;
    public final gh.b f34044w6;
    public Drawable f34045x;
    public View f34046x0;
    public boolean f34047x1;
    public org.telegram.ui.Cells.g6 f34048x2;
    public int f34049x3;
    public int f34050x4;
    public SpannableStringBuilder f34051x5;
    public final bh.b f34052x6;
    public final Drawable[] f34053y;
    public final org.telegram.ui.Components.p50 f34054y0;
    public boolean f34055y1;
    public boolean f34056y2;
    public int y3;
    public int f34057y4;
    public ei.d[] f34058y5;
    public ih.k f34059y6;
    public final Paint f34060z0;
    public int f34061z1;
    public u01 f34062z2;
    public int f34063z3;
    public int f34064z4;
    public org.telegram.messenger.s8 f34065z5;
    public cy0 f34066z6;

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }

    public static void B0(ProfileActivity profileActivity) {
        float f7;
        RectF rectF = profileActivity.C6;
        bh.f fVar = profileActivity.f34015s6;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int measuredHeight = (profileActivity.fragmentView.getMeasuredHeight() - profileActivity.f34007r6) - AndroidUtilities.dp(8.0f);
            profileActivity.B6.set(0.0f, -dp, profileActivity.fragmentView.getMeasuredWidth(), profileActivity.actionBar.getMeasuredHeight() + dp);
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), profileActivity.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            fVar.g(2, profileActivity.A6);
            fVar.e(profileActivity.f34066z6, profileActivity.fragmentView.getMeasuredWidth(), profileActivity.fragmentView.getMeasuredHeight());
        }
    }

    public static void G0(ProfileActivity profileActivity, int i10) {
        boolean z02 = org.telegram.ui.Components.xv0.z0(profileActivity.O.getClosestTab());
        if (i10 == profileActivity.f33980n6 && z02 == profileActivity.f33987o6) {
            return;
        }
        profileActivity.f33980n6 = i10;
        profileActivity.f33987o6 = z02;
        if (z02) {
            if (i10 > 0) {
                profileActivity.f34058y5[0].i(LocaleController.formatPluralString("HideStoriesFromAlbum", i10, new Object[0]), true, true);
            } else {
                profileActivity.f34058y5[0].i(profileActivity.f34051x5, true, true);
            }
        } else if (i10 <= 0 && MessagesController.getInstance(profileActivity.currentAccount).storiesEnabled()) {
            profileActivity.f34058y5[0].i(profileActivity.f34043w5, true, true);
        } else {
            profileActivity.f34058y5[0].i(LocaleController.formatPluralString("ArchiveStories", i10, new Object[0]), true, true);
        }
    }

    public static ValueAnimator H0(ProfileActivity profileActivity, final boolean z10) {
        float f7;
        boolean z11;
        int i10;
        org.telegram.ui.ActionBar.n5[] n5VarArr = profileActivity.f34000r;
        if (z10) {
            AndroidUtilities.requestAdjustResize(profileActivity.getParentActivity(), profileActivity.classGuid);
            AndroidUtilities.setAdjustResizeToNothing(profileActivity.getParentActivity(), profileActivity.classGuid);
        }
        ValueAnimator valueAnimator = profileActivity.W1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            profileActivity.W1.cancel();
        }
        ai.j1 j1Var = profileActivity.f34038w0;
        if (j1Var != null) {
            j1Var.setActive(!z10);
        }
        float f10 = profileActivity.V1;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        final float f11 = profileActivity.R1;
        profileActivity.f33889b.setTranslationY(f11);
        profileActivity.f33889b.setVisibility(0);
        profileActivity.V0.setVisibility(0);
        profileActivity.f33882a.setVisibility(0);
        profileActivity.m4(true);
        profileActivity.Y.setVisibility(0);
        profileActivity.f33919f[1].setVisibility(0);
        n5VarArr[1].setVisibility(0);
        n5VarArr[3].setVisibility(0);
        org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
        if (profileActivity.V1 > 0.5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        kVar.v(z11);
        int i11 = 8;
        if (profileActivity.V1 > 0.5f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        org.telegram.ui.ActionBar.u0 u0Var = profileActivity.U0;
        if (u0Var != null) {
            u0Var.setVisibility(i10);
        }
        profileActivity.V0.setVisibility(i10);
        FrameLayout searchContainer = profileActivity.V0.getSearchContainer();
        if (profileActivity.V1 <= 0.5f) {
            i11 = 0;
        }
        searchContainer.setVisibility(i11);
        profileActivity.f33889b.setEmptyView(profileActivity.P);
        profileActivity.Y.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProfileActivity.i0(ProfileActivity.this, ofFloat, f11, z10);
            }
        });
        ofFloat.addListener(new jz0(profileActivity, z10, 0));
        if (!z10) {
            profileActivity.W4 = true;
            profileActivity.H4();
            AndroidUtilities.requestAdjustNothing(profileActivity.getParentActivity(), profileActivity.classGuid);
            profileActivity.P.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(org.telegram.ui.Components.bs.f25133f);
        profileActivity.W1 = ofFloat;
        return ofFloat;
    }

    public static SpannableStringBuilder I3(String str, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        o00 o00Var = new o00(9);
        o00Var.v = str;
        if (o00Var.f40032c != null) {
            o00Var.f40032c = null;
            o00Var.a();
        }
        o00Var.f40033f = w02;
        o00Var.f40034n = false;
        spannableStringBuilder.setSpan(o00Var, 0, spannableStringBuilder.length(), 0);
        o00[] o00VarArr = (o00[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), o00.class);
        if (o00VarArr != null) {
            for (o00 o00Var2 : o00VarArr) {
                o00Var2.getClass();
                o00Var2.f40033f = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
                o00Var2.f40035r = i10;
                o00Var2.f40036s = g6Var;
                o00Var2.f40034n = true;
            }
        }
        return spannableStringBuilder;
    }

    public static void J4(Activity activity, boolean z10) {
        if (activity == null) {
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(activity, 3, null);
        c2Var.f20762i0 = false;
        c2Var.show();
        Utilities.globalQueue.postRunnable(new v90(c2Var, z10, activity, 8));
    }

    public static void O4(Drawable drawable, int i10, int i11, PorterDuff.Mode mode) {
        if (i10 != i11) {
            drawable.setColorFilter(new PorterDuffColorFilter(i10, mode));
        }
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

    public static void U(ProfileActivity profileActivity) {
        TLRPC.Document f7;
        org.telegram.ui.Components.qc h;
        if (profileActivity.K2 == null) {
            if (profileActivity.f34002r1 && !profileActivity.getMessagesController().premiumFeaturesBlocked()) {
                ArrayList<TLRPC.TL_forumTopic> topics = profileActivity.getMessagesController().getTopicsController().getTopics(profileActivity.f33928g1);
                if (topics != null) {
                    TLRPC.TL_forumTopic tL_forumTopic = null;
                    for (int i10 = 0; tL_forumTopic == null && i10 < topics.size(); i10++) {
                        TLRPC.TL_forumTopic tL_forumTopic2 = topics.get(i10);
                        if (tL_forumTopic2 != null && tL_forumTopic2.f20395id == profileActivity.f33935h1) {
                            tL_forumTopic = tL_forumTopic2;
                        }
                    }
                    if (tL_forumTopic != null) {
                        long j10 = tL_forumTopic.icon_emoji_id;
                        if (j10 != 0 && (f7 = org.telegram.ui.Components.r5.f(profileActivity.currentAccount, j10)) != null && (h = org.telegram.ui.Components.xc.a0(profileActivity).h(f7, 1, new zx0(profileActivity, 2))) != null) {
                            h.j();
                        }
                    }
                }
            } else if (!profileActivity.M3()) {
                profileActivity.y4(false);
            }
        }
    }

    public static void V(ProfileActivity profileActivity) {
        MessagesController.getInstance(profileActivity.currentAccount).deleteUserPhoto(null);
        profileActivity.V.M(0);
        profileActivity.W.M(0);
    }

    public static void V0(ProfileActivity profileActivity) {
        boolean z10;
        float f7;
        float min = Math.min(profileActivity.f33907d2, 0.25f) / 0.25f;
        int i10 = 0;
        if (profileActivity.f34002r1) {
            profileActivity.f34023u0.setAlpha(1.0f - min);
            profileActivity.f34023u0.setBlurIntensity(0.0f);
            profileActivity.f34023u0.setGooeyEnabled(false);
        } else {
            profileActivity.f34023u0.setPullProgress(profileActivity.f33907d2);
            profileActivity.f34023u0.setBlurIntensity(Math.min((w7.r.a(profileActivity.f33907d2, 0.2f, 0.7f) - 0.2f) / 0.5f, 0.75f));
            org.telegram.ui.Components.si0 si0Var = profileActivity.f34023u0;
            float f10 = profileActivity.f33907d2;
            if (f10 > 0.0f && f10 < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            si0Var.setGooeyEnabled(z10);
        }
        yy0 yy0Var = profileActivity.f34030v0;
        if (yy0Var != null && profileActivity.K1 != 2) {
            float f11 = profileActivity.f33907d2;
            if (f11 > 0.0f) {
                f7 = AndroidUtilities.lerp(1.0f, 0.0f, AndroidUtilities.ilerp(f11, 0.0f, 0.5f));
            } else {
                f7 = 1.0f;
            }
            yy0Var.setAlpha(f7);
        }
        org.telegram.ui.Components.si0 si0Var2 = profileActivity.f34023u0;
        if (profileActivity.f33907d2 >= 1.0f) {
            i10 = 8;
        }
        si0Var2.setVisibility(i10);
    }

    public static void W(org.telegram.ui.ProfileActivity r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.W(org.telegram.ui.ProfileActivity, int):void");
    }

    public static void X(ProfileActivity profileActivity, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            profileActivity.J2 = fileLocation;
            profileActivity.K2 = photoSize2.location;
            profileActivity.f33920f0.h(ImageLocation.getForLocal(fileLocation), "50_50", profileActivity.f33994q0, null);
            if (profileActivity.P2 != -1) {
                profileActivity.n5();
                f01 f01Var = profileActivity.d;
                if (f01Var != null) {
                    f01Var.l();
                }
                profileActivity.m4(true);
            }
            wy0 wy0Var = profileActivity.f33981o0;
            ImageLocation forLocal = ImageLocation.getForLocal(profileActivity.K2);
            profileActivity.L2 = forLocal;
            wy0Var.A(forLocal, ImageLocation.getForLocal(profileActivity.J2));
            profileActivity.S4(true, false);
        } else if (profileActivity.J2 == null) {
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
            profileActivity.U5 = profileActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new a50(22, profileActivity, str));
        }
        profileActivity.actionBar.m().requestLayout();
    }

    public static void Y(ProfileActivity profileActivity, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.qc Q = org.telegram.ui.Components.xc.a0(profileActivity).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            Q.f29832j = 5000;
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
                alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                profileActivity.showDialog(alertDialog$Builder.f20678a);
                return;
            }
            return;
        }
        org.telegram.messenger.v0.p(R.string.UnknownError, org.telegram.ui.Components.xc.a0(profileActivity), R.raw.error, 36);
    }

    public static void Z(ProfileActivity profileActivity, Context context, long j10, TL_payments.connectedBotStarRef connectedbotstarref) {
        if (connectedbotstarref == null) {
            gi.u3.H0(context, profileActivity.currentAccount, profileActivity.f34040w2.starref_program, profileActivity.getUserConfig().getClientUserId(), profileActivity.A0, false);
        } else {
            gi.u3.I0(context, profileActivity.currentAccount, connectedbotstarref, j10, profileActivity.A0);
        }
    }

    public static void a0(ProfileActivity profileActivity, Context context, long j10, View view, int i10, float f7, float f10) {
        TLRPC.User user;
        TLRPC.ChatParticipant chatParticipant;
        f01 f01Var;
        if (profileActivity.getParentActivity() == null) {
            return;
        }
        profileActivity.f33882a.B0();
        if (i10 == profileActivity.T3) {
            TLRPC.User user2 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f33921f1));
            TLRPC.UserFull userFull = profileActivity.f34040w2;
            if (userFull != null && userFull.starref_program != null) {
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                ai.k0.g(profileActivity.currentAccount).f(profileActivity.getParentActivity(), clientUserId, profileActivity.f33921f1, new ai.f2(profileActivity, context, clientUserId, 3));
            } else if (user2 == null || !user2.bot_can_edit) {
            } else {
                profileActivity.presentFragment(new gi.l(profileActivity.f33921f1));
            }
        } else if (i10 == profileActivity.R3) {
            boolean z10 = !profileActivity.getMessagesController().isDialogMuted(j10, profileActivity.f33935h1);
            profileActivity.getNotificationsController().muteDialog(j10, profileActivity.f33935h1, z10);
            org.telegram.ui.Components.xc.A(profileActivity, z10, null).j();
            profileActivity.e5();
            int i11 = profileActivity.R3;
            if (i11 < 0 || (f01Var = profileActivity.d) == null) {
                return;
            }
            f01Var.m(i11);
        } else if (i10 == profileActivity.f33886a4) {
            TLRPC.User user3 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f33921f1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user3.f20490id);
            bundle.putBoolean("addContact", true);
            bundle.putString("phone", profileActivity.f33925f5);
            bundle.putString("first_name_card", profileActivity.f33932g5);
            bundle.putString("last_name_card", profileActivity.f33939h5);
            hs hsVar = new hs(bundle, profileActivity.A0);
            hsVar.O = new rx0(profileActivity, user3);
            profileActivity.presentFragment(hsVar);
        } else if (i10 == profileActivity.X3) {
            TextView textView = (TextView) org.telegram.ui.Components.f5.i0(profileActivity.getParentActivity(), LocaleController.getString(R.string.DeleteReaction), LocaleController.getString(R.string.DeleteAlertReaction), LocaleController.getString(R.string.DeleteAlertReactionAll), LocaleController.getString(R.string.Delete), new zx0(profileActivity, 1), profileActivity.A0, false).d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, null);
            }
        } else if (i10 == profileActivity.Y3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.A0);
            alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.ReportReaction2);
            alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.ReportAlertReaction);
            TLRPC.Chat chat = profileActivity.getMessagesController().getChat(Long.valueOf(-profileActivity.f33903c5));
            org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
            if (chat != null && ChatObject.canBlockUsers(chat)) {
                LinearLayout linearLayout = new LinearLayout(profileActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(profileActivity.getParentActivity(), 1, profileActivity.A0);
                z1VarArr[0] = z1Var;
                z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.M0(false));
                z1VarArr[0].e(LocaleController.getString(R.string.BanUser), "", true, false, false);
                z1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                linearLayout.addView(z1VarArr[0], w7.z5.n(-1, -2));
                z1VarArr[0].setOnClickListener(new g20(z1VarArr, 2));
                alertDialog$Builder.o(linearLayout);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.ReportChat), new ql0(12, profileActivity, z1VarArr));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new wv(16));
            TextView textView2 = (TextView) alertDialog$Builder.p().d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21421q7, null);
            }
        } else if (i10 == profileActivity.f34013s4) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("chat_id", DialogObject.getEncryptedChatId(profileActivity.f33949j1));
            profileActivity.presentFragment(new org.telegram.ui.ActionBar.o2(bundle2));
        } else if (i10 == profileActivity.f34005r4) {
            profileActivity.showDialog(org.telegram.ui.Components.f5.V(profileActivity.getParentActivity(), profileActivity.E2, profileActivity.A0).f20678a);
        } else if (i10 == profileActivity.O3) {
            profileActivity.t4(view, f7, f10, false);
        } else if (i10 == profileActivity.M4) {
            profileActivity.getMessagesController().unblockPeer(profileActivity.f33921f1);
            if (org.telegram.ui.Components.xc.a(profileActivity)) {
                org.telegram.ui.Components.xc.d(profileActivity, false).j();
            }
        } else if (i10 == profileActivity.f33894b4) {
            try {
                profileActivity.actionBar.getActionBarMenuOnItemClick().b(9);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i10 == profileActivity.V3) {
            profileActivity.w4();
        } else if (i10 == profileActivity.W3) {
            s21.O(profileActivity.a(), profileActivity);
        } else if (i10 >= profileActivity.f34034v4 && i10 < profileActivity.f34042w4) {
            if (!profileActivity.D2.isEmpty()) {
                chatParticipant = profileActivity.f34032v2.participants.participants.get(((Integer) profileActivity.D2.get(i10 - profileActivity.f34034v4)).intValue());
            } else {
                chatParticipant = profileActivity.f34032v2.participants.participants.get(i10 - profileActivity.f34034v4);
            }
            profileActivity.h(chatParticipant, false, false, view);
        } else if (i10 == profileActivity.f34050x4) {
            profileActivity.x4();
        } else if (i10 == profileActivity.M3) {
            profileActivity.E4(f7, f10, i10, view);
        } else if (i10 == profileActivity.f33970m4) {
            if (profileActivity.F2 != null) {
                profileActivity.showDialog(new hi.k0(profileActivity, profileActivity.F2.linked_community_id, null, null));
            } else if (profileActivity.f33921f1 == 0 || (user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f33921f1))) == null) {
            } else {
                profileActivity.showDialog(new hi.k0(profileActivity, user.linked_community_id, null, null));
            }
        } else if (i10 == profileActivity.J3) {
            if (profileActivity.f34032v2.location instanceof TLRPC.TL_channelLocation) {
                sc0 sc0Var = new sc0(5);
                sc0Var.f41354e0 = -profileActivity.f33928g1;
                sc0Var.f41381z0 = (TLRPC.TL_channelLocation) profileActivity.f34032v2.location;
                profileActivity.presentFragment(sc0Var);
            }
        } else if (i10 == profileActivity.N4) {
            profileActivity.s4(false);
        } else if (i10 == profileActivity.f34057y4) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", profileActivity.f33928g1);
            bundle3.putInt("type", 2);
            jr jrVar = new jr(bundle3);
            jrVar.x0(profileActivity.f34032v2);
            profileActivity.presentFragment(jrVar);
        } else if (i10 == profileActivity.f34064z4) {
            profileActivity.presentFragment(new nh0(profileActivity.f33928g1));
        } else if (i10 == profileActivity.A4) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", profileActivity.f33928g1);
            bundle4.putInt("type", 1);
            jr jrVar2 = new jr(bundle4);
            jrVar2.x0(profileActivity.f34032v2);
            profileActivity.presentFragment(jrVar2);
        } else if (i10 == profileActivity.B4) {
            profileActivity.T0.performClick();
        } else if (i10 == profileActivity.C4) {
            profileActivity.presentFragment(new ai.x(0, profileActivity.f33921f1));
        } else if (i10 == profileActivity.D4) {
            profileActivity.presentFragment(new ai.x(1, profileActivity.f33921f1));
        } else if (i10 == profileActivity.E4) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("chat_id", profileActivity.f33928g1);
            bundle5.putBoolean("start_from_monetization", true);
            profileActivity.presentFragment(new u91(bundle5));
        } else if (i10 == profileActivity.H4) {
            Bundle bundle6 = new Bundle();
            bundle6.putLong("chat_id", profileActivity.f33928g1);
            bundle6.putInt("type", 0);
            jr jrVar3 = new jr(bundle6);
            jrVar3.x0(profileActivity.f34032v2);
            profileActivity.presentFragment(jrVar3);
        } else if (i10 == profileActivity.f33930g3) {
            profileActivity.presentFragment(new NotificationsSettingsActivity());
        } else if (i10 == profileActivity.f33944i3) {
            PrivacySettingsActivity privacySettingsActivity = new PrivacySettingsActivity();
            TL_account.TL_password tL_password = profileActivity.I2;
            privacySettingsActivity.d = tL_password;
            if (tL_password != null) {
                privacySettingsActivity.y0();
            }
            profileActivity.presentFragment(privacySettingsActivity);
        } else if (i10 == profileActivity.f33951j3) {
            profileActivity.presentFragment(new DataSettingsActivity());
        } else if (i10 == profileActivity.f33958k3) {
            profileActivity.presentFragment(new ThemeActivity(0));
        } else if (i10 == profileActivity.f33964l3) {
            profileActivity.presentFragment(new FiltersSetupActivity());
        } else if (i10 == profileActivity.f33977n3) {
            profileActivity.presentFragment(new StickersActivity(0, null));
        } else if (i10 == profileActivity.f33969m3) {
            profileActivity.presentFragment(new wb0());
        } else if (i10 == profileActivity.f33984o3) {
            profileActivity.presentFragment(new SessionsActivity(0));
        } else if (i10 == profileActivity.f34004r3) {
            profileActivity.showDialog(org.telegram.ui.Components.f5.U(profileActivity, profileActivity.A0));
        } else if (i10 == profileActivity.f34012s3) {
            pf.d.r(profileActivity.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
        } else if (i10 == profileActivity.f34019t3) {
            pf.d.r(profileActivity.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
        } else if (i10 == profileActivity.f34041w3) {
            J4(profileActivity.getParentActivity(), false);
        } else if (i10 == profileActivity.f34049x3) {
            J4(profileActivity.getParentActivity(), true);
        } else if (i10 == profileActivity.y3) {
            FileLog.cleanupLogs();
        } else if (i10 == profileActivity.f34063z3) {
            if (profileActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.A0);
            alertDialog$Builder2.f20678a.T = LocaleController.getString(R.string.AreYouSure);
            alertDialog$Builder2.f20678a.R = LocaleController.getString(R.string.AppName);
            alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new qx0(profileActivity, 6));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            profileActivity.showDialog(alertDialog$Builder2.f20678a);
        } else if (i10 == profileActivity.f33937h3) {
            profileActivity.presentFragment(new LanguageSelectActivity());
        } else if (i10 == profileActivity.W2) {
            profileActivity.presentFragment(new sa(null));
        } else if (i10 == profileActivity.X2) {
            profileActivity.presentFragment(new UserInfoActivity());
        } else if (i10 == profileActivity.U2) {
            profileActivity.presentFragment(new g(3));
        } else if (i10 == profileActivity.P2) {
            profileActivity.w4();
        } else if (i10 == profileActivity.f33909d4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
        } else if (i10 == profileActivity.f33916e4) {
            profileActivity.presentFragment(new ai.nd());
        } else if (i10 == profileActivity.f33924f4) {
            profileActivity.presentFragment(new fi.g());
        } else if (i10 == profileActivity.f33931g4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(1, "settings"));
        } else if (i10 == profileActivity.f33938h4) {
            ug.l1.e0(0, BirthdayController.getInstance(profileActivity.currentAccount).getState());
        } else if (i10 == profileActivity.botPermissionLocation) {
            gi.u0 u0Var = profileActivity.f34018t2;
            if (u0Var != null) {
                u0Var.l(!u0Var.g(), new mv0(12, profileActivity, view));
            }
        } else if (i10 == profileActivity.botPermissionBiometry) {
            gi.r rVar = profileActivity.f34025u2;
            if (rVar != null) {
                rVar.f11439f = true;
                rVar.e = !rVar.e;
                rVar.k();
                ((org.telegram.ui.Cells.r8) view).setChecked(profileActivity.f34025u2.e);
            }
        } else if (i10 == profileActivity.botPermissionEmojiStatus) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            r8Var.setChecked(!r8Var.d());
            if (profileActivity.f33992p4 > 0) {
                profileActivity.getConnectionsManager().cancelRequest(profileActivity.f33992p4, true);
            }
            TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
            toggleuseremojistatuspermission.bot = profileActivity.getMessagesController().getInputUser(profileActivity.f33921f1);
            boolean d = r8Var.d();
            toggleuseremojistatuspermission.enabled = d;
            TLRPC.UserFull userFull2 = profileActivity.f34040w2;
            if (userFull2 != null) {
                userFull2.bot_can_manage_emoji_status = d;
            }
            int sendRequest = profileActivity.getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new a50(23, profileActivity, r0));
            profileActivity.f33992p4 = sendRequest;
            int[] iArr = {sendRequest};
        } else if (i10 == profileActivity.P3) {
            profileActivity.P4 = !profileActivity.P4;
            profileActivity.H4();
            view.requestLayout();
            profileActivity.d.m(profileActivity.P3);
            int i12 = profileActivity.W5;
            if (i12 >= 0) {
                profileActivity.f33897c.h1(i12, profileActivity.X5 - profileActivity.f33882a.getPaddingTop());
            }
        } else if (i10 == profileActivity.Q3) {
            profileActivity.B4(false);
        } else if (i10 == profileActivity.R2) {
            if (profileActivity.f34040w2 == null) {
                return;
            }
            Bundle bundle7 = new Bundle();
            bundle7.putLong("chat_id", profileActivity.f34040w2.personal_channel_id);
            profileActivity.presentFragment(new sn(bundle7));
        } else if (i10 == profileActivity.V2) {
            x01 x01Var = profileActivity.f33947i6;
            if ((x01Var == null || !x01Var.a()) && !profileActivity.L3(i10, view)) {
                org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
                if (c9Var.d.getDrawable() != null) {
                    profileActivity.v4(c9Var.getImageView());
                }
            }
        } else if (i10 == profileActivity.I3) {
            profileActivity.K3(i10, view);
        } else {
            profileActivity.E4(f7, f10, i10, view);
        }
    }

    public static void b0(ProfileActivity profileActivity, TLRPC.User user, org.telegram.ui.ActionBar.n5 n5Var) {
        TLRPC.EmojiStatus emojiStatus;
        ImageLocation forDocument;
        String str;
        org.telegram.ui.Components.p5[] p5VarArr = profileActivity.G;
        if (user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible) {
            pf.d.r(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        sg.m1 m1Var = new sg.m1(profileActivity, profileActivity.currentAccount, user, null, null, profileActivity.A0);
        n5Var.getLocationOnScreen(new int[2]);
        m1Var.f46775v0 = n5Var.f21686h0;
        m1Var.f46776w0 = n5Var.f21687i0;
        m1Var.f46779z0 = n5Var.getScaleX();
        m1Var.f46777x0 = n5Var.getLeft();
        m1Var.f46778y0 = n5Var.getTop();
        m1Var.A0 = n5Var;
        Drawable rightDrawable = n5Var.getRightDrawable();
        org.telegram.ui.Components.p5 p5Var = p5VarArr[1];
        if (rightDrawable == p5Var && p5Var != null) {
            Drawable drawable = p5Var.f29416f[0];
            if (drawable instanceof org.telegram.ui.Components.r5) {
                m1Var.f46779z0 *= 0.98f;
                TLRPC.Document document = ((org.telegram.ui.Components.r5) drawable).e;
                if (document != null) {
                    org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(profileActivity.getParentActivity());
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.k6.f21346m6, 0.2f);
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
                    w9Var.setLayerNum(7);
                    w9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                    w9Var.l(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                    if (((org.telegram.ui.Components.r5) p5VarArr[1].f29416f[0]).c()) {
                        w9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21516v6, profileActivity.A0), PorterDuff.Mode.SRC_IN));
                        m1Var.C0 = MessageObject.getInputStickerSet(document);
                    } else {
                        m1Var.C0 = MessageObject.getInputStickerSet(document);
                    }
                    m1Var.B0 = w9Var;
                    m1Var.E0 = true;
                }
            }
        }
        profileActivity.showDialog(m1Var);
    }

    public static void c0(ProfileActivity profileActivity) {
        Runnable runnable;
        boolean z10;
        int i10;
        LinearLayout linearLayout;
        int i11;
        int w02;
        boolean z11;
        long j10;
        char c10;
        final u3 u3Var;
        float f7;
        float f10;
        float f11;
        Activity parentActivity = profileActivity.getParentActivity();
        final TLRPC.UserFull userFull = profileActivity.f34040w2;
        if (userFull != null && userFull.stars_rating != null) {
            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) profileActivity.getParentActivity(), (org.telegram.ui.ActionBar.g6) null, false);
            h3Var.fixNavigationBar();
            runnable = h3Var.dismissRunnable;
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(1);
            linearLayout2.setClipChildren(false);
            linearLayout2.setClipToPadding(false);
            final LimitPreviewView limitPreviewView = new LimitPreviewView(profileActivity.getParentActivity(), R.drawable.filled_rating_crown, 0, profileActivity.A0, 0);
            if (profileActivity.a() != UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
                z10 = true;
            } else {
                z10 = false;
            }
            limitPreviewView.setHideNegativeValues(z10);
            limitPreviewView.setStarRating(userFull.stars_rating);
            limitPreviewView.setTranslationY(-AndroidUtilities.dp(14.0f));
            linearLayout2.addView(limitPreviewView, w7.z5.t(-1, -2, 17, 0, 20, 0, 10));
            int i12 = 17;
            if (userFull.stars_my_pending_rating != null) {
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                linearLayout2.addView(frameLayout, w7.z5.t(-1, -2, 17, 40, -12, 40, 20));
                int i13 = 2;
                TextView[] textViewArr = new org.telegram.ui.Components.y90[2];
                int i14 = 0;
                while (i14 < i13) {
                    int i15 = i13;
                    org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(parentActivity, 3, null);
                    textViewArr[i14] = xbVar;
                    xbVar.setGravity(i12);
                    textViewArr[i14].setTextSize(1, 12.0f);
                    org.telegram.ui.ActionBar.r6.W(textViewArr[i14], org.telegram.ui.ActionBar.k6.f21571y6, null);
                    org.telegram.ui.ActionBar.r6.I(textViewArr[i14], org.telegram.ui.ActionBar.k6.f21242gc, null);
                    frameLayout.addView(textViewArr[i14], w7.z5.e(-1, -1, 119));
                    TextView textView = textViewArr[i14];
                    if (i14 == 0) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    textView.setAlpha(f7);
                    TextView textView2 = textViewArr[i14];
                    if (i14 == 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.8f;
                    }
                    textView2.setScaleX(f10);
                    TextView textView3 = textViewArr[i14];
                    if (i14 == 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.8f;
                    }
                    textView3.setScaleY(f11);
                    i14++;
                    i13 = i15;
                    i12 = 17;
                }
                int i16 = i13;
                u3 u3Var2 = new u3(textViewArr, 20);
                if (profileActivity.a() == UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                linearLayout = linearLayout2;
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
                    org.telegram.ui.ActionBar.r6.W(textViewArr[0], org.telegram.ui.ActionBar.k6.f21421q7, null);
                    if (z11) {
                        textViewArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarRatingLevelNegativeYou", (int) j12)));
                    } else {
                        textViewArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarRatingLevelNegativeOther, DialogObject.getName(profileActivity.a()))));
                    }
                    c10 = 0;
                    u3Var = u3Var2;
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    String formatPluralStringComma = LocaleController.formatPluralStringComma("StarRatingFuture", max);
                    String formatPluralStringComma2 = LocaleController.formatPluralStringComma("StarRatingFuturePendingPoints", (int) j15);
                    CharSequence[] charSequenceArr = new CharSequence[3];
                    charSequenceArr[0] = formatPluralStringComma;
                    charSequenceArr[1] = "\n";
                    charSequenceArr[i16] = formatPluralStringComma2;
                    spannableStringBuilder.append(TextUtils.concat(charSequenceArr));
                    spannableStringBuilder.append((CharSequence) " ");
                    c10 = 0;
                    u3Var = u3Var2;
                    spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.StarRatingFuturePendingPointsPreview), new Runnable() {
                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    TLRPC.UserFull userFull2 = userFull;
                                    limitPreviewView.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    u3Var.run(Boolean.TRUE);
                                    return;
                                default:
                                    TLRPC.UserFull userFull3 = userFull;
                                    limitPreviewView.f(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                    u3Var.run(Boolean.FALSE);
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
                                    limitPreviewView.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                    u3Var.run(Boolean.TRUE);
                                    return;
                                default:
                                    TLRPC.UserFull userFull3 = userFull;
                                    limitPreviewView.f(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                    u3Var.run(Boolean.FALSE);
                                    return;
                            }
                        }
                    });
                    textViewArr[0].setText(spannableStringBuilder);
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                String formatPluralStringComma3 = LocaleController.formatPluralStringComma("StarRatingFuturePreview1", max);
                String formatPluralStringComma4 = LocaleController.formatPluralStringComma("StarRatingFuturePreview2", (int) j15);
                CharSequence[] charSequenceArr2 = new CharSequence[3];
                charSequenceArr2[c10] = formatPluralStringComma3;
                i10 = 1;
                charSequenceArr2[1] = "\n";
                charSequenceArr2[i16] = formatPluralStringComma4;
                spannableStringBuilder2.append(TextUtils.concat(charSequenceArr2));
                spannableStringBuilder2.append((CharSequence) " ");
                spannableStringBuilder2.append(AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.StarRatingFuturePendingPointsPreviewBack), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                limitPreviewView.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                u3Var.run(Boolean.TRUE);
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                limitPreviewView.f(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                u3Var.run(Boolean.FALSE);
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
                                limitPreviewView.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                u3Var.run(Boolean.TRUE);
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                limitPreviewView.f(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                u3Var.run(Boolean.FALSE);
                                return;
                        }
                    }
                });
                textViewArr[1].setText(spannableStringBuilder2);
            } else {
                i10 = 1;
                linearLayout = linearLayout2;
            }
            TextView textView4 = new TextView(parentActivity);
            textView4.setTypeface(AndroidUtilities.bold());
            textView4.setGravity(17);
            org.telegram.messenger.sl.n(R.string.StarRatingTitle, textView4, i10, 20.0f);
            int i17 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.W(textView4, i17, profileActivity.A0);
            LinearLayout linearLayout3 = linearLayout;
            linearLayout3.addView(textView4, w7.z5.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView5 = new TextView(parentActivity);
            textView5.setGravity(17);
            if (userFull.f20491id == UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
                org.telegram.messenger.v0.m(R.string.StarRatingSelfDescription, textView5);
                i11 = 1;
            } else {
                i11 = 1;
                org.telegram.messenger.sl.r(R.string.StarRatingDescription, new Object[]{DialogObject.getName(profileActivity.a())}, textView5);
            }
            textView5.setTextSize(i11, 14.0f);
            org.telegram.ui.ActionBar.r6.W(textView5, i17, profileActivity.A0);
            linearLayout3.addView(textView5, w7.z5.t(-1, -2, 17, 20, 0, 20, 12));
            cw0 cw0Var = new cw0(parentActivity, profileActivity.A0);
            cw0Var.f36438a.l(LocaleController.getString(R.string.StarRatingTitle1), false);
            int i18 = R.string.StarRatingDescription1;
            String string = LocaleController.getString(R.string.StarRatingAdded);
            int i19 = org.telegram.ui.ActionBar.k6.Oh;
            cw0Var.f36439b.setText(LocaleController.formatSpannable(i18, I3(string, i19, profileActivity.A0)));
            cw0Var.d.setVisibility(8);
            int i20 = R.drawable.menu_gift;
            ImageView imageView = cw0Var.f36440c;
            imageView.setImageResource(i20);
            org.telegram.ui.ActionBar.g6 g6Var = profileActivity.A0;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            org.telegram.ui.ActionBar.r6.t(imageView, i17, g6Var, mode);
            linearLayout3.addView(cw0Var, w7.z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            cw0 cw0Var2 = new cw0(parentActivity, profileActivity.A0);
            cw0Var2.f36438a.l(LocaleController.getString(R.string.StarRatingTitle2), false);
            cw0Var2.f36439b.setText(LocaleController.formatSpannable(R.string.StarRatingDescription2, I3(LocaleController.getString(R.string.StarRatingAdded), i19, profileActivity.A0)));
            cw0Var2.d.setVisibility(8);
            int i21 = R.drawable.menu_stars_gift;
            ImageView imageView2 = cw0Var2.f36440c;
            imageView2.setImageResource(i21);
            org.telegram.ui.ActionBar.r6.t(imageView2, i17, profileActivity.A0, mode);
            linearLayout3.addView(cw0Var2, w7.z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            cw0 cw0Var3 = new cw0(parentActivity, profileActivity.A0);
            cw0Var3.f36438a.l(LocaleController.getString(R.string.StarRatingTitle3), false);
            int i22 = R.string.StarRatingDescription3;
            String string2 = LocaleController.getString(R.string.StarRatingDeduces);
            if (org.telegram.ui.ActionBar.k6.I.q()) {
                w02 = i0.a.f(0.25f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21346m6, profileActivity.A0), -16777216);
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21571y6, profileActivity.A0);
            }
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(string2);
            o00 o00Var = new o00(9);
            o00Var.v = string2;
            if (o00Var.f40032c != null) {
                o00Var.f40032c = null;
                o00Var.a();
            }
            o00Var.f40033f = w02;
            o00Var.f40034n = false;
            spannableStringBuilder3.setSpan(o00Var, 0, spannableStringBuilder3.length(), 0);
            cw0Var3.f36439b.setText(LocaleController.formatSpannable(i22, spannableStringBuilder3));
            cw0Var3.d.setVisibility(8);
            int i23 = R.drawable.menu_refund;
            ImageView imageView3 = cw0Var3.f36440c;
            imageView3.setImageResource(i23);
            org.telegram.ui.ActionBar.r6.t(imageView3, i17, profileActivity.A0, mode);
            linearLayout3.addView(cw0Var3, w7.z5.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            ei.d dVar = new ei.d(parentActivity, profileActivity.A0, true);
            dVar.setOnClickListener(new hy0(0, runnable));
            dVar.i(ai.l7.H2(LocaleController.getString(R.string.Understood)), false, true);
            linearLayout3.addView(dVar, w7.z5.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            h3Var.customView = linearLayout3;
            h3Var.show();
        }
    }

    public static void d0(ProfileActivity profileActivity, int i10, float f7, float f10) {
        switch (i10) {
            case 0:
                boolean z10 = profileActivity.f34002r1;
                if (z10) {
                    if (z10) {
                        profileActivity.O3();
                        return;
                    }
                    return;
                } else if (profileActivity.f33921f1 != 0) {
                    profileActivity.z4();
                    return;
                } else if (profileActivity.f33928g1 != 0) {
                    if (ChatObject.isForum(profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.f33928g1)))) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", profileActivity.f33928g1);
                        if (profileActivity.getMessagesController().checkCanOpenChat(bundle, profileActivity)) {
                            profileActivity.presentFragment(new sn(bundle), false);
                            return;
                        }
                        return;
                    } else if (!profileActivity.O3()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", profileActivity.f33928g1);
                        if (profileActivity.getMessagesController().checkCanOpenChat(bundle2, profileActivity)) {
                            profileActivity.presentFragment(new sn(bundle2), false);
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
                profileActivity.t4(profileActivity.f33883a0, f7, f10, true);
                return;
            case 2:
                profileActivity.A4();
                return;
            case 3:
                profileActivity.r4();
                return;
            case 4:
                profileActivity.u4();
                return;
            case 5:
            case 10:
            case 11:
                profileActivity.q4(false);
                return;
            case 6:
                profileActivity.q4(true);
                return;
            case 7:
                profileActivity.s4(true);
                return;
            case 8:
                s21.O(profileActivity.a(), profileActivity);
                return;
            case 9:
                profileActivity.k4(false);
                return;
            case 12:
                profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(profileActivity.getParentActivity(), 3, profileActivity.A0);
                c2Var.r(200L);
                MessagesController.getInstance(profileActivity.currentAccount).getStoriesController().k(profileActivity.a(), new org.telegram.ui.Components.qy(19, profileActivity, c2Var), true, profileActivity.A0);
                return;
            case 13:
                profileActivity.p4(true);
                return;
            case 14:
                profileActivity.w4();
                return;
            case 15:
                TLRPC.User currentUser = profileActivity.getUserConfig().getCurrentUser();
                if (currentUser != null) {
                    org.telegram.ui.Components.j80 H = org.telegram.ui.Components.j80.H(profileActivity, profileActivity.f33883a0);
                    H.f27583w = false;
                    H.f27562i = 3;
                    H.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.QrCode), new ib0(profileActivity, 22), false);
                    H.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new oj0(currentUser, 29), false);
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new ib0(profileActivity, 23), false);
                    H.W = true;
                    H.a0(f7 - AndroidUtilities.dp(8.0f), profileActivity.f33883a0.getMeasuredHeight() - AndroidUtilities.dp(16.0f));
                    H.Z();
                    return;
                }
                return;
            case 16:
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 17:
                profileActivity.presentFragment(new c81(null));
                return;
            default:
                return;
        }
    }

    public static void e0(ProfileActivity profileActivity) {
        boolean z10;
        TLRPC.Document document;
        if (profileActivity.f33890b0 == null) {
            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.currentAccount == profileActivity.currentAccount && MediaController.getInstance().currentSavedMusicList.dialogId == profileActivity.a()) {
                profileActivity.f33890b0 = MediaController.getInstance().currentSavedMusicList;
            } else {
                MessagesController.SavedMusicList savedMusicList = new MessagesController.SavedMusicList(profileActivity.currentAccount, profileActivity.a());
                profileActivity.f33890b0 = savedMusicList;
                TLRPC.UserFull userFull = profileActivity.f34040w2;
                if (userFull != null && (document = userFull.saved_music) != null) {
                    savedMusicList.setup(document);
                }
            }
        }
        if (!profileActivity.f33890b0.list.isEmpty()) {
            if (MediaController.getInstance().currentSavedMusicList == profileActivity.f33890b0 && MediaController.getInstance().isPlayingMessage(profileActivity.f33890b0.list.get(0))) {
                z10 = true;
            } else {
                MediaController.getInstance().cleanup();
                z10 = false;
            }
            MediaController.getInstance().currentSavedMusicList = profileActivity.f33890b0;
            MediaController.getInstance().getPlaylist().clear();
            MediaController.getInstance().getPlaylist().addAll(profileActivity.f33890b0.list);
            if (!z10) {
                MediaController.getInstance().playMessage(profileActivity.f33890b0.list.get(0));
            }
            profileActivity.showDialog(new org.telegram.ui.Components.k8(profileActivity.getParentActivity(), profileActivity.A0));
        }
    }

    public static void f0(ProfileActivity profileActivity) {
        org.telegram.ui.Components.vc0.b(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), true, null, new ib0(profileActivity, 18), profileActivity.A0);
    }

    public static void g0(ProfileActivity profileActivity, TLRPC.User user) {
        int i10;
        if (profileActivity.f33886a4 >= 0) {
            if (profileActivity.L4 == -1) {
                profileActivity.n5();
                profileActivity.d.l();
            } else {
                profileActivity.i5(false, false);
            }
        }
        if (profileActivity.L4 == -1) {
            if (!profileActivity.f33983o2 && !AndroidUtilities.isTablet()) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (profileActivity.actionBar.getOccupyStatusBar()) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                int i11 = currentActionBarHeight + i10;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(profileActivity.f33882a.getMeasuredWidth(), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.f33882a.getMeasuredHeight(), 0);
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    f01 f01Var = profileActivity.d;
                    if (i12 >= f01Var.e.O2) {
                        break;
                    }
                    s4.b1 g10 = f01Var.g(null, f01Var.j(i12));
                    View view = g10.f46343a;
                    profileActivity.d.v(g10, i12);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i13 += view.getMeasuredHeight();
                    i12++;
                }
                int max = Math.max(0, profileActivity.fragmentView.getMeasuredHeight() - ((profileActivity.V3() + i13) + i11));
                ly0 ly0Var = profileActivity.f33882a;
                ly0Var.setPadding(0, ly0Var.getPaddingTop(), 0, max);
            } else {
                profileActivity.f33882a.setPadding(0, profileActivity.V3(), 0, 0);
                profileActivity.f33957k2.cancel();
                float[] fArr = profileActivity.f33976n2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                profileActivity.L4(1.0f);
                profileActivity.R1 = profileActivity.V3();
            }
        }
        profileActivity.M.m(profileActivity.f33949j1, user, 8);
    }

    public static void h0(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        org.telegram.ui.Components.a11.c(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), user, str, z10, z11, profileActivity.A0);
    }

    public static void i0(ProfileActivity profileActivity, ValueAnimator valueAnimator, float f7, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.n5[] n5VarArr = profileActivity.f34000r;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        profileActivity.V1 = floatValue;
        float f10 = (floatValue - 0.5f) / 0.5f;
        float f11 = (0.5f - floatValue) / 0.5f;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        float f12 = -f7;
        profileActivity.U1 = (int) ((1.0f - floatValue) * f12);
        profileActivity.f33889b.setTranslationY(floatValue * f7);
        profileActivity.P.setTranslationY(f7 * profileActivity.V1);
        profileActivity.f33882a.setTranslationY((1.0f - profileActivity.V1) * f12);
        profileActivity.f33882a.setScaleX(1.0f - ((1.0f - profileActivity.V1) * 0.01f));
        profileActivity.f33882a.setScaleY(1.0f - ((1.0f - profileActivity.V1) * 0.01f));
        profileActivity.f33882a.setAlpha(profileActivity.V1);
        boolean z11 = true;
        profileActivity.m4(true);
        profileActivity.f33882a.setAlpha(f10);
        profileActivity.f33889b.setAlpha(1.0f - profileActivity.V1);
        profileActivity.f33889b.setScaleX((profileActivity.V1 * 0.05f) + 1.0f);
        profileActivity.f33889b.setScaleY((profileActivity.V1 * 0.05f) + 1.0f);
        profileActivity.P.setAlpha(1.0f - f10);
        profileActivity.Y.setAlpha(f10);
        profileActivity.f33920f0.setAlpha(f10);
        yy0 yy0Var = profileActivity.f34030v0;
        if (yy0Var != null) {
            yy0Var.setAlpha(f10);
        }
        profileActivity.f33919f[1].setAlpha(f10);
        n5VarArr[1].setAlpha(f10);
        n5VarArr[3].setAlpha(f10);
        profileActivity.V0.getSearchField().setAlpha(f11);
        if (z10 && profileActivity.V1 < 0.7f) {
            org.telegram.ui.ActionBar.u0 u0Var = profileActivity.V0;
            if (u0Var.F.getWidth() != 0 && !u0Var.e.isFocused()) {
                u0Var.e.requestFocus();
                AndroidUtilities.showKeyboard(u0Var.e);
            }
        }
        FrameLayout searchContainer = profileActivity.V0.getSearchContainer();
        int i11 = 8;
        if (profileActivity.V1 < 0.5f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        searchContainer.setVisibility(i10);
        if (profileActivity.V1 > 0.5f) {
            i11 = 0;
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = profileActivity.U0;
        if (u0Var2 != null) {
            u0Var2.setVisibility(i11);
            profileActivity.U0.setAlpha(f10);
        }
        profileActivity.V0.setVisibility(i11);
        org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
        if (profileActivity.V1 >= 0.5f) {
            z11 = false;
        }
        kVar.v(z11);
        org.telegram.ui.ActionBar.u0 u0Var3 = profileActivity.U0;
        if (u0Var3 != null) {
            u0Var3.setAlpha(f10);
        }
        profileActivity.V0.setAlpha(f10);
        profileActivity.f33913e1.invalidate();
        profileActivity.fragmentView.invalidate();
    }

    public static boolean j0(ProfileActivity profileActivity, boolean[] zArr, boolean z10, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_error tL_error) {
        boolean z11;
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        MessagesController.getNotificationsSettings(profileActivity.currentAccount).edit().putLong("dialog_join_requested_time_" + profileActivity.f33949j1, System.currentTimeMillis()).commit();
        Activity parentActivity = profileActivity.getParentActivity();
        if (ChatObject.isChannel(profileActivity.F2) && !profileActivity.F2.megagroup) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i10 = org.telegram.ui.Components.b90.f25000s;
        org.telegram.ui.Components.b90.x(parentActivity, profileActivity, org.telegram.ui.Components.xc.a0(profileActivity), z11);
        if (!z10 || profileActivity.N4 != -1) {
            profileActivity.n5();
            f01 f01Var = profileActivity.d;
            if (f01Var != null) {
                f01Var.l();
            }
        }
        if (o2Var instanceof sn) {
            ((sn) o2Var).Bb(false, true);
        }
        return false;
    }

    public static void k0(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
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
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f20367id;
            if (closestPhotoSizeWithSize != null) {
                tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
            }
            if (closestPhotoSizeWithSize2 != null) {
                tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
            }
            if (closestPhotoSizeWithSize != null && profileActivity.J2 != null) {
                FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(profileActivity.J2, true).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(profileActivity.J2.volume_id);
                sb2.append("_");
                String n10 = a1.g.n(profileActivity.J2.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(n10, a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(profileActivity.currentAccount, user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && profileActivity.K2 != null) {
                FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(profileActivity.K2, true).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            profileActivity.getMessagesController().getDialogPhotos(user.f20490id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            profileActivity.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f33921f1);
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                profileActivity.getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
        if (!AndroidUtilities.isTablet() && !profileActivity.f33983o2 && profileActivity.f33920f0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            z10 = true;
        } else {
            z10 = false;
        }
        profileActivity.f33990p2 = z10;
        profileActivity.J2 = null;
        profileActivity.K2 = null;
        wy0 wy0Var = profileActivity.f33981o0;
        wy0Var.H0 = true;
        wy0Var.K0 = profileActivity.L2;
        wy0Var.f29200q1 = null;
        wy0Var.f29201r1 = null;
        wy0Var.setCreateThumbFromParent(false);
        profileActivity.m5(true);
        profileActivity.S4(false, true);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        profileActivity.getUserConfig().saveConfig(true);
    }

    public static void l0(ProfileActivity profileActivity, org.telegram.ui.Cells.z1[] z1VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = profileActivity.getMessagesController().getInputUser(profileActivity.f33921f1);
        tL_messages_reportReaction.peer = profileActivity.getMessagesController().getInputPeer(profileActivity.f33903c5);
        tL_messages_reportReaction.f20449id = profileActivity.f33895b5;
        ConnectionsManager.getInstance(profileActivity.currentAccount).sendRequest(tL_messages_reportReaction, new ci.d6(8));
        org.telegram.ui.Cells.z1 z1Var = z1VarArr[0];
        if (z1Var != null && z1Var.b()) {
            profileActivity.getMessagesController().deleteParticipantFromChat(-profileActivity.f33903c5, profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f33921f1)));
        }
        profileActivity.f33895b5 = 0;
        profileActivity.i5(false, false);
        org.telegram.ui.Components.xc.a0(profileActivity).E(profileActivity.A0).j();
    }

    public static void m0(ProfileActivity profileActivity, Boolean bool) {
        long j10 = profileActivity.f33921f1;
        if (j10 == 0) {
            long j11 = profileActivity.f33928g1;
            if (j11 != 0) {
                j10 = -j11;
            } else {
                j10 = profileActivity.f33949j1;
            }
        }
        long j12 = j10;
        if (bool.booleanValue()) {
            MessagesController.getInstance(profileActivity.currentAccount).deleteAllReactionsFrom(profileActivity.f33903c5, j12);
        } else {
            MessagesController.getInstance(profileActivity.currentAccount).deleteReactionsFromMessage(profileActivity.f33903c5, j12, profileActivity.f33895b5);
        }
        profileActivity.f33895b5 = 0;
        profileActivity.i5(false, false);
        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(profileActivity.getParentActivity(), profileActivity.A0);
        ybVar.d(R.raw.chats_infotip, new String[0]);
        ybVar.f32863b.setText(LocaleController.getString(R.string.ReactionDeleteSent));
        org.telegram.ui.Components.xc.a0(profileActivity).b(ybVar, 1500).j();
    }

    public static void n1(ProfileActivity profileActivity, boolean z10) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.n5[] n5VarArr = profileActivity.f33919f;
        org.telegram.ui.ActionBar.n5[] n5VarArr2 = profileActivity.f34000r;
        int i12 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        profileActivity.f33882a.setVisibility(i10);
        org.telegram.ui.Components.mm0 mm0Var = profileActivity.f33889b;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        mm0Var.setVisibility(i11);
        FrameLayout searchContainer = profileActivity.V0.getSearchContainer();
        if (!z10) {
            i12 = 8;
        }
        searchContainer.setVisibility(i12);
        ai.j1 j1Var = profileActivity.f34038w0;
        if (j1Var != null) {
            j1Var.setActive(!z10);
        }
        profileActivity.actionBar.v(z10);
        profileActivity.Y.setVisibility(i10);
        yy0 yy0Var = profileActivity.f34030v0;
        if (yy0Var != null) {
            yy0Var.setVisibility(i10);
        }
        n5VarArr[1].setVisibility(i10);
        n5VarArr2[1].setVisibility(i10);
        n5VarArr2[3].setVisibility(i10);
        org.telegram.ui.ActionBar.u0 u0Var = profileActivity.U0;
        if (u0Var != null) {
            u0Var.setAlpha(1.0f);
            profileActivity.U0.setVisibility(i10);
        }
        profileActivity.V0.setVisibility(i10);
        profileActivity.f33920f0.setAlpha(1.0f);
        profileActivity.Y.setAlpha(1.0f);
        yy0 yy0Var2 = profileActivity.f34030v0;
        if (yy0Var2 != null) {
            yy0Var2.setAlpha(1.0f);
        }
        ai.j1 j1Var2 = profileActivity.f34038w0;
        if (j1Var2 != null) {
            j1Var2.setAlpha(1.0f);
        }
        n5VarArr[1].setAlpha(1.0f);
        n5VarArr2[1].setAlpha(1.0f);
        profileActivity.V0.setAlpha(1.0f);
        profileActivity.f33882a.setAlpha(1.0f);
        profileActivity.f33889b.setAlpha(1.0f);
        profileActivity.P.setAlpha(1.0f);
        if (z10) {
            profileActivity.f33889b.setEmptyView(profileActivity.P);
        } else {
            profileActivity.P.setVisibility(8);
        }
    }

    public static ProfileActivity o4(long j10) {
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        return new ProfileActivity(bundle, null);
    }

    public static void t3(ProfileActivity profileActivity, boolean z10) {
        Drawable drawable = profileActivity.f33920f0.getImageReceiver().getDrawable();
        String str = null;
        if (drawable instanceof org.telegram.ui.Components.u71) {
            profileActivity.f33920f0.u(null, null, drawable);
        } else if (drawable instanceof org.telegram.ui.Components.e6) {
            org.telegram.ui.Components.e6 e6Var = (org.telegram.ui.Components.e6) drawable;
            profileActivity.f33920f0.u(null, null, e6Var);
            if (z10) {
                e6Var.f(profileActivity.f33920f0);
            }
        } else {
            ImageLocation D = profileActivity.f33981o0.D(0);
            if (D != null && D.imageType == 2) {
                str = "avatar";
            }
            profileActivity.f33920f0.u(D, str, drawable);
        }
    }

    public final float A3() {
        return Utilities.clamp01((this.R1 - Q3()) / W3());
    }

    public final void A4() {
        TLRPC.ChatFull chatFull = this.f34032v2;
        if (chatFull != null && chatFull.linked_chat_id != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f34032v2.linked_chat_id);
            if (getMessagesController().checkCanOpenChat(bundle, this)) {
                presentFragment(new sn(bundle));
            }
        }
    }

    public final void B3() {
        int i10;
        org.telegram.ui.ActionBar.n5 n5Var;
        int paddingLeft;
        float paddingLeft2;
        if (this.actionBar.getOccupyStatusBar()) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        this.f33892b2 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10) - AndroidUtilities.dp(21.0f));
        this.f33900c2 = 1.38f;
        this.f33907d2 = 0.0f;
        P3();
        F4();
        n4(0, 1.0f, true);
        int i11 = 0;
        while (true) {
            org.telegram.ui.ActionBar.n5[] n5VarArr = this.f33919f;
            if (i11 >= n5VarArr.length) {
                break;
            }
            if (n5VarArr[i11] != null) {
                float measuredWidth = (this.f33882a.getMeasuredWidth() / 2.0f) - (((n5VarArr[i11].getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) n5Var.getLayoutParams()).leftMargin);
                org.telegram.ui.ActionBar.n5[] n5VarArr2 = this.f34000r;
                float measuredWidth2 = this.f33882a.getMeasuredWidth() / 2.0f;
                int i12 = ((FrameLayout.LayoutParams) n5VarArr2[i11].getLayoutParams()).leftMargin;
                if (this.f34006r5) {
                    paddingLeft = 0;
                } else {
                    paddingLeft = n5VarArr2[i11].getPaddingLeft();
                }
                float exactWidth = measuredWidth2 - ((n5VarArr2[i11].getExactWidth() * 0.5f) + (i12 + paddingLeft));
                if (i11 == 1) {
                    this.f33914e2 = measuredWidth;
                    this.f33929g2 = exactWidth;
                    if (this.f34006r5) {
                        paddingLeft2 = 0.0f;
                    } else {
                        paddingLeft2 = n5VarArr2[i11].getPaddingLeft();
                    }
                    this.f33918e6 = paddingLeft2;
                }
            }
            i11++;
        }
        if (this.K1 != 2) {
            this.f34030v0.setAlpha(1.0f);
        }
        this.Y.setAlpha(1.0f);
        this.f33920f0.setAlpha(1.0f);
    }

    public final void B4(boolean z10) {
        TLRPC.TL_businessLocation tL_businessLocation;
        String str;
        TLRPC.UserFull userFull = this.f34040w2;
        if (userFull != null && (tL_businessLocation = userFull.business_location) != null) {
            if (tL_businessLocation.geo_point != null && !z10) {
                ci.z8 z8Var = new ci.z8(3, 1);
                z8Var.setResourceProvider(this.A0);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = getMessagesController().getPeer(a());
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_businessLocation tL_businessLocation2 = this.f34040w2.business_location;
                tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
                tL_messageMediaGeo.address = tL_businessLocation2.address;
                tL_message.media = tL_messageMediaGeo;
                z8Var.O0 = false;
                z8Var.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                presentFragment(z8Var);
                return;
            }
            if (BuildVars.isHuaweiStoreApp()) {
                str = "mapapp://navigation";
            } else {
                str = "http://maps.google.com/maps";
            }
            try {
                Locale locale = Locale.US;
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(locale, str + "?q=" + this.f34040w2.business_location.address, new Object[0]))));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final void C() {
        I4(false);
    }

    public final void C3() {
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
        if (this.f33882a.getVisibility() == 0) {
            if (this.Q) {
                this.O.setVisibleHeight(this.f33882a.getMeasuredHeight() - this.O.getTop());
            }
            if (this.f33882a.getChildCount() > 0 && !this.H1) {
                boolean z11 = false;
                int i11 = 0;
                while (true) {
                    b1Var = null;
                    if (i11 < this.f33882a.getChildCount()) {
                        if (RecyclerView.R(this.f33882a.getChildAt(i11)) == 0) {
                            view = this.f33882a.getChildAt(i11);
                            break;
                        }
                        i11++;
                    } else {
                        view = null;
                        break;
                    }
                }
                if (view != null) {
                    ly0 ly0Var = this.f33882a;
                    View F = ly0Var.F(view);
                    if (F != null) {
                        b1Var = ly0Var.T(F);
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
                if (this.f34001r0 == null && this.actionBar.f21068n0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i12 = this.L4;
                if (i12 != -1 && !z10) {
                    org.telegram.ui.Components.wl0 wl0Var = (org.telegram.ui.Components.wl0) this.f33882a.K(i12);
                    if (wl0Var != null && wl0Var.f46343a.getTop() <= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (this.H5 != z10) {
                    this.H5 = z10;
                    AnimatorSet animatorSet = this.E5;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = this.F5;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                    }
                    org.telegram.ui.ActionBar.u0 searchItem = this.O.getSearchItem();
                    org.telegram.ui.Components.bk0 searchOptionsItem = this.O.getSearchOptionsItem();
                    TextView saveItem = this.O.getSaveItem();
                    if (!this.H5) {
                        if (this.M0) {
                            this.R0.setVisibility(0);
                        }
                        if (this.N0) {
                            this.S0.setVisibility(0);
                        }
                        if (this.O0) {
                            this.T0.setVisibility(0);
                        }
                        this.U0.setVisibility(0);
                        if (searchOptionsItem != null) {
                            searchOptionsItem.setVisibility(8);
                        }
                        if (saveItem != null) {
                            saveItem.setVisibility(8);
                        }
                    } else {
                        rz0 rz0Var = this.O;
                        if (rz0Var.v0(rz0Var.f32687k0[0].F)) {
                            searchItem.setVisibility(0);
                        }
                        if (searchOptionsItem != null) {
                            searchOptionsItem.setVisibility(0);
                        }
                        rz0 rz0Var2 = this.O;
                        int i13 = rz0Var2.f32687k0[0].F;
                        if (i13 != 0 && !org.telegram.ui.Components.xv0.r0(i13) && i13 != 11 && i13 != 13 && (i13 != 14 || rz0Var2.V == null)) {
                            this.O.f32701r0.setVisibility(4);
                            this.O.A(false, false);
                        } else {
                            this.O.f32701r0.setVisibility(0);
                            this.O.A(true, false);
                        }
                    }
                    p5(false);
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar != null) {
                        kVar.m().requestLayout();
                    }
                    ArrayList arrayList = new ArrayList();
                    org.telegram.ui.ActionBar.u0 u0Var = this.R0;
                    Property property = View.ALPHA;
                    float f22 = 1.0f;
                    if (z10) {
                        f7 = 0.0f;
                    } else {
                        f7 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(u0Var, property, f7));
                    org.telegram.ui.ActionBar.u0 u0Var2 = this.S0;
                    if (z10) {
                        f10 = 0.0f;
                    } else {
                        f10 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(u0Var2, property, f10));
                    org.telegram.ui.ActionBar.u0 u0Var3 = this.U0;
                    if (z10) {
                        f11 = 0.0f;
                    } else {
                        f11 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(u0Var3, property, f11));
                    org.telegram.ui.ActionBar.u0 u0Var4 = this.T0;
                    if (z10) {
                        f12 = 0.0f;
                    } else {
                        f12 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(u0Var4, property, f12));
                    org.telegram.ui.ActionBar.u0 u0Var5 = this.R0;
                    Property property2 = View.TRANSLATION_Y;
                    if (z10) {
                        f13 = -AndroidUtilities.dp(10.0f);
                    } else {
                        f13 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(u0Var5, property2, f13));
                    org.telegram.ui.ActionBar.u0 u0Var6 = this.S0;
                    if (z10) {
                        f14 = -AndroidUtilities.dp(10.0f);
                    } else {
                        f14 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(u0Var6, property2, f14));
                    org.telegram.ui.ActionBar.u0 u0Var7 = this.U0;
                    if (z10) {
                        f15 = -AndroidUtilities.dp(10.0f);
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(u0Var7, property2, f15));
                    org.telegram.ui.ActionBar.u0 u0Var8 = this.T0;
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
                    ImageView imageView = this.O.f32701r0;
                    if (z10) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(imageView, property, f18));
                    ImageView imageView2 = this.O.f32701r0;
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
                    arrayList.add(ObjectAnimator.ofFloat(kVar2, this.I5, f19));
                    org.telegram.ui.ActionBar.n5[] n5VarArr = this.f34000r;
                    org.telegram.ui.ActionBar.n5 n5Var = n5VarArr[1];
                    if (z10) {
                        f20 = 0.0f;
                    } else {
                        f20 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(n5Var, property, f20));
                    this.O.I0.setOpen(z10);
                    if (this.f34017t1) {
                        org.telegram.ui.ActionBar.n5 n5Var2 = n5VarArr[3];
                        if (z10) {
                            f21 = 0.0f;
                        } else {
                            f21 = 1.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(n5Var2, property, f21));
                    }
                    org.telegram.ui.Components.fp0 fp0Var = this.f34008s;
                    if (!z10) {
                        f22 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(fp0Var, property, f22));
                    if (z10) {
                        arrayList.add(ObjectAnimator.ofFloat(this, this.f33965l5, 0.0f));
                    }
                    if (this.f34030v0 != null || this.f34038w0 != null) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new wx0(this, 3));
                        arrayList.add(ofFloat);
                    }
                    E3();
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    this.E5 = animatorSet3;
                    animatorSet3.playTogether(arrayList);
                    this.E5.setInterpolator(org.telegram.ui.Components.bs.f25133f);
                    this.E5.addListener(new org.telegram.ui.Components.ql0(12, this, searchItem));
                    this.E5.setDuration(150L);
                    this.E5.start();
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
                }
                float f23 = top;
                if (this.R1 != f23 && !this.I1) {
                    this.R1 = f23;
                    this.f33913e1.invalidate();
                    if (this.K1 != 0) {
                        if (this.R1 > Q3()) {
                            z11 = true;
                        }
                        this.N1 = z11;
                    }
                    m4(true);
                }
            }
        }
    }

    public final void C4(int i10, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        boolean[] zArr = new boolean[1];
        dz0 dz0Var = new dz0(this, user.f20490id, this.f33928g1, tL_chatAdminRights, this.F2.default_banned_rights, tL_chatBannedRights, str, i10, zArr, user);
        dz0Var.Y0 = new ez0(this, i10, chatParticipant, z10, zArr);
        presentFragment(dz0Var);
    }

    @Override
    public final boolean D() {
        return false;
    }

    public final void D3() {
        float alpha;
        int i10 = this.K1;
        org.telegram.ui.ActionBar.n5[] n5VarArr = this.f34000r;
        if (i10 == 1 && (!this.f33979n5 || this.H1)) {
            this.f33904c6 = 0.0f;
        } else if (i10 == 2 && (!this.f33979n5 || this.H1)) {
            org.telegram.ui.ActionBar.n5 n5Var = n5VarArr[1];
            if (n5Var == null) {
                alpha = 0.0f;
            } else {
                alpha = n5Var.getAlpha();
            }
            this.f33904c6 = alpha;
        } else if (this.f33921f1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
            this.f33904c6 = (1.0f - this.p5) * this.f33963l2;
        } else {
            this.f33904c6 = this.f33963l2 * this.p5;
        }
        if (this.f33921f1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
            if (this.f34006r5) {
                this.f33999q5 = AndroidUtilities.dp(28.0f) * this.f33904c6;
                org.telegram.ui.ActionBar.n5 n5Var2 = n5VarArr[2];
                if (n5Var2 != null) {
                    n5Var2.setAlpha(this.f33963l2);
                    n5VarArr[3].setAlpha(1.0f - this.f33963l2);
                    n5VarArr[1].setTranslationX(Y3(this.f33911d6, this.f33926f6));
                    this.Z.invalidate();
                    r01 r01Var = this.f33940h6;
                    if (r01Var != null) {
                        r01Var.e = 1.0f - this.f33963l2;
                        r01Var.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.n5 n5Var3 = n5VarArr[2];
            if (n5Var3 != null) {
                n5Var3.setAlpha(0.0f);
                n5VarArr[3].setAlpha(0.0f);
            }
            r01 r01Var2 = this.f33940h6;
            if (r01Var2 != null) {
                r01Var2.e = 1.0f;
                r01Var2.invalidateSelf();
            }
        } else if (this.f34014s5) {
            org.telegram.ui.ActionBar.n5 n5Var4 = n5VarArr[2];
            if (n5Var4 != null) {
                n5Var4.setAlpha(this.f33904c6);
            }
            r01 r01Var3 = this.f33940h6;
            if (r01Var3 != null) {
                r01Var3.e = 1.0f - this.f33904c6;
                r01Var3.invalidateSelf();
            }
        } else {
            org.telegram.ui.ActionBar.n5 n5Var5 = n5VarArr[2];
            if (n5Var5 != null) {
                n5Var5.setAlpha(0.0f);
            }
            r01 r01Var4 = this.f33940h6;
            if (r01Var4 != null) {
                r01Var4.e = 1.0f;
                r01Var4.invalidateSelf();
            }
        }
    }

    public final void D4(String str, org.telegram.ui.Cells.h hVar) {
        if (str.startsWith("@")) {
            getMessagesController().openByUserName(str.substring(1), this, 0, hVar);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/") && this.parentLayout.getFragmentStack().size() > 1) {
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if (o2Var instanceof sn) {
                    finishFragment();
                    ((sn) o2Var).Y.X0(null, str, false, false);
                }
            }
        } else {
            ey eyVar = new ey(null);
            eyVar.f37105n2 = str;
            presentFragment(eyVar);
        }
    }

    @Override
    public final void E(float f7) {
        org.telegram.ui.Cells.y3 y3Var = this.f33934h0;
        if (y3Var == null) {
            return;
        }
        y3Var.setProgress(f7);
        this.f33981o0.O(this.L2, f7);
    }

    public final void E3() {
        boolean z10;
        org.telegram.ui.Components.hx0 hx0Var = this.T;
        if (hx0Var != null) {
            if (!this.H5 && this.J5) {
                z10 = true;
            } else {
                z10 = false;
            }
            hx0Var.setVisibility(z10);
        }
    }

    public final boolean E4(float r22, float r23, int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.E4(float, float, int, android.view.View):boolean");
    }

    public final void F3(boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.F3(boolean):void");
    }

    public final void F4() {
        int i10;
        ValueAnimator valueAnimator;
        if (this.f33996q2 && (valueAnimator = this.f33957k2) != null && valueAnimator.isRunning()) {
            this.f33922f2 = this.M5;
            this.f33936h2 = this.N5;
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (this.actionBar.getOccupyStatusBar()) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        G4(A3(), currentActionBarHeight + i10);
    }

    public final void G3(Context context) {
        int i10;
        this.f33891b1 = new org.telegram.ui.Components.p8(context, this.U0.getPopupLayout().getSwipeBack(), new ky0(this), false, 0, this.A0);
        if (this.f33949j1 > 0 || this.f33921f1 > 0) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21366n6, this.A0);
            org.telegram.ui.Components.p8 p8Var = this.f33891b1;
            org.telegram.ui.Components.y90 y90Var = p8Var.e;
            if (y90Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AutoDeletePopupDescription));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.AutoDeletePopupDescription2), w02, new org.telegram.ui.Components.pg(p8Var, 11)));
                y90Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.f34040w2;
        if (userFull == null && this.f34032v2 == null) {
            i10 = 0;
        } else if (userFull != null) {
            i10 = userFull.ttl_period;
        } else {
            i10 = this.f34032v2.ttl_period;
        }
        org.telegram.ui.Components.w21 a2 = org.telegram.ui.Components.w21.a(i10);
        this.f34016t0 = a2;
        this.f33884a1 = this.U0.i(0, a2, LocaleController.getString(R.string.AutoDeletePopupTitle), this.f33891b1.f29466a);
        this.U0.a(-1);
        X4();
    }

    public final void G4(float f7, float f10) {
        float lerp;
        int i10;
        float max = Math.max(0.0f, Math.min(1.0f, (this.R1 - V3()) / ((this.f33882a.getMeasuredWidth() - f10) - W3())));
        if (this.R1 < V3() && max < 0.33f) {
            lerp = com.google.android.gms.internal.play_billing.k3.w(f7, 72.0f, 24.0f, 42.0f);
        } else {
            lerp = AndroidUtilities.lerp(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f));
        }
        if (this.actionBar.getOccupyStatusBar()) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f;
        float translationY = this.actionBar.getTranslationY();
        float dpf2 = ((AndroidUtilities.dpf2(8.0f) + (AndroidUtilities.dp(42.0f) * lerp)) * f7) + ((float) Math.floor(translationY + (org.telegram.messenger.sl.b(f7, 1.0f, currentActionBarHeight, i10) - (AndroidUtilities.density * 21.0f))));
        this.f33922f2 = (AndroidUtilities.dp(7.0f) * f7) + AndroidUtilities.dp(1.3f) + dpf2;
        this.f33936h2 = (((float) Math.floor(AndroidUtilities.density * 11.0f)) * f7) + dpf2 + AndroidUtilities.dp(24.0f);
    }

    public final void H3() {
        if (this.fragmentView != null && this.Z5 && this.f34062z2 != null && getParentActivity() != null) {
            x01 x01Var = this.f33947i6;
            if (x01Var != null) {
                x01Var.b(this.f34062z2);
                this.f33947i6.invalidate();
                return;
            }
            x01 x01Var2 = new x01(this, this.f34062z2);
            this.f33947i6 = x01Var2;
            ((FrameLayout) this.fragmentView).addView(x01Var2, w7.z5.e(-1, -1, 55));
        }
    }

    public final void H4() {
        ly0 ly0Var = this.f33882a;
        if (ly0Var != null && this.f33897c != null && ly0Var.getChildCount() > 0 && !this.Y5) {
            View view = null;
            int i10 = Integer.MAX_VALUE;
            int i11 = -1;
            for (int i12 = 0; i12 < this.f33882a.getChildCount(); i12++) {
                int R = RecyclerView.R(this.f33882a.getChildAt(i12));
                View childAt = this.f33882a.getChildAt(i12);
                if (R != -1 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                    i11 = R;
                    view = childAt;
                }
            }
            if (view != null) {
                this.W5 = i11;
                int top = view.getTop();
                this.X5 = top;
                if (this.W5 == 0 && !this.f33990p2 && top > V3()) {
                    this.X5 = V3();
                }
                this.f33897c.h1(i11, view.getTop() - this.f33882a.getPaddingTop());
            }
        }
    }

    public final void I4(boolean z10) {
        int i10 = this.L4;
        if (i10 >= 0) {
            if (z10) {
                li.n nVar = new li.n(getParentActivity(), 2, 0.6f);
                nVar.f46484a = this.L4;
                nVar.f16207p = -this.f33882a.getPaddingTop();
                this.f33897c.w0(nVar);
                return;
            }
            this.f33897c.h1(i10, -this.f33882a.getPaddingTop());
        }
    }

    @Override
    public final boolean J(ey eyVar) {
        return false;
    }

    public final void J3(float f7) {
        boolean z10;
        ValueAnimator ofFloat;
        long j10;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.fragmentView.invalidate();
        AnimatorSet animatorSet = this.V5;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.V5 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z10) {
            ofFloat = ValueAnimator.ofFloat(0.0f, f7);
            arrayList.add(ofFloat);
        } else {
            ofFloat = ValueAnimator.ofFloat(this.f34054y0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new wx0(this, 0));
        this.V5.playTogether(arrayList);
        AnimatorSet animatorSet2 = this.V5;
        if (z10) {
            j10 = 150;
        } else {
            j10 = 220;
        }
        animatorSet2.setDuration(j10);
        if (!z10) {
            this.V5.addListener(new iz0(this, 4));
        }
        this.V5.start();
    }

    @Override
    public final void K(boolean z10, boolean z11) {
        org.telegram.ui.Cells.y3 y3Var = this.f33934h0;
        if (y3Var == null) {
            return;
        }
        y3Var.setProgress(0.0f);
    }

    public final void K3(int i10, View view) {
        boolean z10;
        org.telegram.ui.Components.j80 H = org.telegram.ui.Components.j80.H(this, view);
        H.W(this.f33882a.W0(view, false));
        H.f27583w = false;
        if (this.f34040w2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new ib0(this, 25), z10);
        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Edit), new ib0(this, 26), false);
        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new org.telegram.ui.Components.d2(this, i10, 26), true);
        H.Z();
    }

    public final void K4() {
        org.telegram.ui.Components.ci0 ci0Var = this.f33883a0;
        if (ci0Var != null) {
            if (this.f34017t1) {
                ci0Var.H = 6;
            } else if (this.f34002r1) {
                ci0Var.H = 5;
            } else if (this.f34011s2) {
                ci0Var.H = 2;
            } else if (this.f33921f1 != 0) {
                ci0Var.H = 0;
            } else if (this.f33928g1 != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f33928g1));
                if (ChatObject.isChannel(chat)) {
                    if (ChatObject.isMegagroup(chat)) {
                        this.f33883a0.H = 3;
                        return;
                    } else if (ChatObject.isForum(chat)) {
                        this.f33883a0.H = 4;
                        return;
                    } else {
                        this.f33883a0.H = 1;
                        return;
                    }
                }
                this.f33883a0.H = 3;
            }
        }
    }

    public final boolean L3(final int i10, View view) {
        TLRPC.User currentUser;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        if (this.f34017t1 && (currentUser = getUserConfig().getCurrentUser()) != null) {
            final TLRPC.UserFull userFull = this.f34040w2;
            if (userFull == null) {
                userFull = getMessagesController().getUserFull(currentUser.f20490id);
            }
            if (userFull != null) {
                String string = LocaleController.getString(R.string.Copy);
                if (i10 != this.L3 && i10 != this.K3 && i10 != this.X2) {
                    if (i10 == this.P3) {
                        str = ig.e1.f0(this.currentAccount, currentUser, userFull.business_work_hours);
                        string = LocaleController.getString(R.string.ProfileHoursCopy);
                    } else if (i10 == this.Q3) {
                        str = userFull.business_location.address;
                        string = LocaleController.getString(R.string.ProfileLocationCopy);
                    } else if (i10 == this.M3) {
                        str = UserObject.getPublicUsername(currentUser);
                        if (str != null) {
                            str = "@".concat(str);
                        }
                        string = LocaleController.getString(R.string.ProfileCopyUsername);
                    } else if (i10 == this.H3) {
                        str = currentUser.phone;
                    } else if (i10 == this.V2) {
                        str = UserInfoActivity.Z(this.f34040w2.birthday);
                    } else {
                        str = null;
                    }
                } else {
                    str = userFull.about;
                }
                org.telegram.ui.Components.j80 H = org.telegram.ui.Components.j80.H(this, view);
                H.W(this.f33882a.W0(view, false));
                H.f27583w = false;
                H.f27562i = 3;
                if (i10 == this.Q3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        H.c(R.drawable.msg_view_file, LocaleController.getString(R.string.ProfileLocationView), new ib0(this, 5), false);
                    }
                    H.c(R.drawable.msg_map, LocaleController.getString(R.string.ProfileLocationMaps), new ib0(this, 7), false);
                }
                if (str != null) {
                    H.c(R.drawable.msg_copy, string, new oj0(str, 27), false);
                }
                if (i10 == this.P3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileHoursEdit), new ib0(this, 8), false);
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.ProfileHoursRemove), new Runnable(this) {
                        public final ProfileActivity f42095b;

                        {
                            this.f42095b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    final ProfileActivity profileActivity = this.f42095b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.BusinessHoursClearTitle);
                                    alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.BusinessHoursClearMessage);
                                    String string2 = LocaleController.getString(R.string.Remove);
                                    final TLRPC.UserFull userFull2 = userFull;
                                    final int i11 = i10;
                                    alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.z1() {
                                        @Override
                                        public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i12) {
                                            switch (r4) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull3 = userFull2;
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    ProfileActivity profileActivity2 = profileActivity;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new ay0(profileActivity2, 0));
                                                    profileActivity2.n5();
                                                    profileActivity2.d.u(i11);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    return;
                                                default:
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    TLRPC.UserFull userFull4 = userFull2;
                                                    userFull4.business_location = null;
                                                    userFull4.flags2 &= -3;
                                                    ProfileActivity profileActivity3 = profileActivity;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new ay0(profileActivity3, 1));
                                                    profileActivity3.n5();
                                                    profileActivity3.d.u(i11);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(alertDialog$Builder.f20678a);
                                    return;
                                default:
                                    final ProfileActivity profileActivity2 = this.f42095b;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder2.f20678a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                                    alertDialog$Builder2.f20678a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                                    String string3 = LocaleController.getString(R.string.Remove);
                                    final TLRPC.UserFull userFull3 = userFull;
                                    final int i12 = i10;
                                    alertDialog$Builder2.k(string3, new org.telegram.ui.ActionBar.z1() {
                                        @Override
                                        public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i122) {
                                            switch (r4) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull3;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity2;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new ay0(profileActivity22, 0));
                                                    profileActivity22.n5();
                                                    profileActivity22.d.u(i12);
                                                    profileActivity22.getMessagesStorage().updateUserInfo(userFull32, false);
                                                    return;
                                                default:
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    TLRPC.UserFull userFull4 = userFull3;
                                                    userFull4.business_location = null;
                                                    userFull4.flags2 &= -3;
                                                    ProfileActivity profileActivity3 = profileActivity2;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new ay0(profileActivity3, 1));
                                                    profileActivity3.n5();
                                                    profileActivity3.d.u(i12);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity2.showDialog(alertDialog$Builder2.f20678a);
                                    return;
                            }
                        }
                    }, true);
                } else if (i10 == this.Q3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileLocationEdit), new ib0(this, 9), false);
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.ProfileLocationRemove), new Runnable(this) {
                        public final ProfileActivity f42095b;

                        {
                            this.f42095b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    final ProfileActivity profileActivity = this.f42095b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.BusinessHoursClearTitle);
                                    alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.BusinessHoursClearMessage);
                                    String string2 = LocaleController.getString(R.string.Remove);
                                    final TLRPC.UserFull userFull2 = userFull;
                                    final int i11 = i10;
                                    alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.z1() {
                                        @Override
                                        public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i122) {
                                            switch (r4) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull2;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new ay0(profileActivity22, 0));
                                                    profileActivity22.n5();
                                                    profileActivity22.d.u(i11);
                                                    profileActivity22.getMessagesStorage().updateUserInfo(userFull32, false);
                                                    return;
                                                default:
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    TLRPC.UserFull userFull4 = userFull2;
                                                    userFull4.business_location = null;
                                                    userFull4.flags2 &= -3;
                                                    ProfileActivity profileActivity3 = profileActivity;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new ay0(profileActivity3, 1));
                                                    profileActivity3.n5();
                                                    profileActivity3.d.u(i11);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(alertDialog$Builder.f20678a);
                                    return;
                                default:
                                    final ProfileActivity profileActivity2 = this.f42095b;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder2.f20678a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                                    alertDialog$Builder2.f20678a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                                    String string3 = LocaleController.getString(R.string.Remove);
                                    final TLRPC.UserFull userFull3 = userFull;
                                    final int i12 = i10;
                                    alertDialog$Builder2.k(string3, new org.telegram.ui.ActionBar.z1() {
                                        @Override
                                        public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i122) {
                                            switch (r4) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull3;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity2;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new ay0(profileActivity22, 0));
                                                    profileActivity22.n5();
                                                    profileActivity22.d.u(i12);
                                                    profileActivity22.getMessagesStorage().updateUserInfo(userFull32, false);
                                                    return;
                                                default:
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    TLRPC.UserFull userFull4 = userFull3;
                                                    userFull4.business_location = null;
                                                    userFull4.flags2 &= -3;
                                                    ProfileActivity profileActivity3 = profileActivity2;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new ay0(profileActivity3, 1));
                                                    profileActivity3.n5();
                                                    profileActivity3.d.u(i12);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    return;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity2.showDialog(alertDialog$Builder2.f20678a);
                                    return;
                            }
                        }
                    }, true);
                } else if (i10 == this.M3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new ib0(this, 10), false);
                } else if (i10 != this.L3 && i10 != this.K3 && i10 != this.X2) {
                    if (i10 == this.H3) {
                        H.c(R.drawable.menu_storage_path, LocaleController.getString(R.string.ProfilePhoneEdit), new ib0(this, 12), false);
                    } else if (i10 == this.V2) {
                        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileBirthdayChange), new Runnable(this) {
                            public final ProfileActivity f41818b;

                            {
                                this.f41818b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ProfileActivity profileActivity = this.f41818b;
                                        Activity parentActivity = profileActivity.getParentActivity();
                                        String string2 = LocaleController.getString(R.string.EditProfileBirthdayTitle);
                                        String string3 = LocaleController.getString(R.string.EditProfileBirthdayButton);
                                        TLRPC.UserFull userFull2 = userFull;
                                        profileActivity.showDialog(org.telegram.ui.Components.f5.m(parentActivity, string2, string3, userFull2.birthday, new org.telegram.ui.Components.qy(18, profileActivity, userFull2), new ib0(profileActivity, 13), false, false, profileActivity.A0).f20728a);
                                        return;
                                    case 1:
                                        final ProfileActivity profileActivity2 = this.f41818b;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                        alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.BirthdayClearTitle);
                                        alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.BirthdayClearMessage);
                                        String string4 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull3 = userFull;
                                        alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.z1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull4 = userFull3;
                                                        userFull4.personal_channel_id = 0L;
                                                        userFull4.personal_channel_message = 0;
                                                        userFull4.flags2 &= -65;
                                                        ProfileActivity profileActivity3 = profileActivity2;
                                                        profileActivity3.getConnectionsManager().sendRequest(updatepersonalchannel, new ay0(profileActivity3, 3));
                                                        profileActivity3.i5(false, false);
                                                        profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                        return;
                                                    default:
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        TLRPC.UserFull userFull5 = userFull3;
                                                        userFull5.birthday = null;
                                                        userFull5.flags2 &= -33;
                                                        ProfileActivity profileActivity4 = profileActivity2;
                                                        profileActivity4.getMessagesController().invalidateContentSettings();
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ay0(profileActivity4, 2));
                                                        profileActivity4.i5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity2.showDialog(alertDialog$Builder.f20678a);
                                        return;
                                    default:
                                        final ProfileActivity profileActivity3 = this.f41818b;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity3.getParentActivity());
                                        alertDialog$Builder2.f20678a.R = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                        alertDialog$Builder2.f20678a.T = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                        String string5 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull4 = userFull;
                                        alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.z1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull4;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity3;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new ay0(profileActivity32, 3));
                                                        profileActivity32.i5(false, false);
                                                        profileActivity32.getMessagesStorage().updateUserInfo(userFull42, false);
                                                        return;
                                                    default:
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        TLRPC.UserFull userFull5 = userFull4;
                                                        userFull5.birthday = null;
                                                        userFull5.flags2 &= -33;
                                                        ProfileActivity profileActivity4 = profileActivity3;
                                                        profileActivity4.getMessagesController().invalidateContentSettings();
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ay0(profileActivity4, 2));
                                                        profileActivity4.i5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity3.showDialog(alertDialog$Builder2.f20678a);
                                        return;
                                }
                            }
                        }, false);
                        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new Runnable(this) {
                            public final ProfileActivity f41818b;

                            {
                                this.f41818b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ProfileActivity profileActivity = this.f41818b;
                                        Activity parentActivity = profileActivity.getParentActivity();
                                        String string2 = LocaleController.getString(R.string.EditProfileBirthdayTitle);
                                        String string3 = LocaleController.getString(R.string.EditProfileBirthdayButton);
                                        TLRPC.UserFull userFull2 = userFull;
                                        profileActivity.showDialog(org.telegram.ui.Components.f5.m(parentActivity, string2, string3, userFull2.birthday, new org.telegram.ui.Components.qy(18, profileActivity, userFull2), new ib0(profileActivity, 13), false, false, profileActivity.A0).f20728a);
                                        return;
                                    case 1:
                                        final ProfileActivity profileActivity2 = this.f41818b;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                        alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.BirthdayClearTitle);
                                        alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.BirthdayClearMessage);
                                        String string4 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull3 = userFull;
                                        alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.z1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull3;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity2;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new ay0(profileActivity32, 3));
                                                        profileActivity32.i5(false, false);
                                                        profileActivity32.getMessagesStorage().updateUserInfo(userFull42, false);
                                                        return;
                                                    default:
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        TLRPC.UserFull userFull5 = userFull3;
                                                        userFull5.birthday = null;
                                                        userFull5.flags2 &= -33;
                                                        ProfileActivity profileActivity4 = profileActivity2;
                                                        profileActivity4.getMessagesController().invalidateContentSettings();
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ay0(profileActivity4, 2));
                                                        profileActivity4.i5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity2.showDialog(alertDialog$Builder.f20678a);
                                        return;
                                    default:
                                        final ProfileActivity profileActivity3 = this.f41818b;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity3.getParentActivity());
                                        alertDialog$Builder2.f20678a.R = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                        alertDialog$Builder2.f20678a.T = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                        String string5 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull4 = userFull;
                                        alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.z1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull4;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity3;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new ay0(profileActivity32, 3));
                                                        profileActivity32.i5(false, false);
                                                        profileActivity32.getMessagesStorage().updateUserInfo(userFull42, false);
                                                        return;
                                                    default:
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        TLRPC.UserFull userFull5 = userFull4;
                                                        userFull5.birthday = null;
                                                        userFull5.flags2 &= -33;
                                                        ProfileActivity profileActivity4 = profileActivity3;
                                                        profileActivity4.getMessagesController().invalidateContentSettings();
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ay0(profileActivity4, 2));
                                                        profileActivity4.i5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity3.showDialog(alertDialog$Builder2.f20678a);
                                        return;
                                }
                            }
                        }, true);
                    } else if (i10 == this.R2) {
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(userFull.personal_channel_id));
                        if (chat != null && ChatObject.getPublicUsername(chat) != null) {
                            H.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileChannelCopy), new mv0(9, this, chat), false);
                        }
                        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileChannelChange), new ib0(this, 6), false);
                        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new Runnable(this) {
                            public final ProfileActivity f41818b;

                            {
                                this.f41818b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ProfileActivity profileActivity = this.f41818b;
                                        Activity parentActivity = profileActivity.getParentActivity();
                                        String string2 = LocaleController.getString(R.string.EditProfileBirthdayTitle);
                                        String string3 = LocaleController.getString(R.string.EditProfileBirthdayButton);
                                        TLRPC.UserFull userFull2 = userFull;
                                        profileActivity.showDialog(org.telegram.ui.Components.f5.m(parentActivity, string2, string3, userFull2.birthday, new org.telegram.ui.Components.qy(18, profileActivity, userFull2), new ib0(profileActivity, 13), false, false, profileActivity.A0).f20728a);
                                        return;
                                    case 1:
                                        final ProfileActivity profileActivity2 = this.f41818b;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                        alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.BirthdayClearTitle);
                                        alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.BirthdayClearMessage);
                                        String string4 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull3 = userFull;
                                        alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.z1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull3;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity2;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new ay0(profileActivity32, 3));
                                                        profileActivity32.i5(false, false);
                                                        profileActivity32.getMessagesStorage().updateUserInfo(userFull42, false);
                                                        return;
                                                    default:
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        TLRPC.UserFull userFull5 = userFull3;
                                                        userFull5.birthday = null;
                                                        userFull5.flags2 &= -33;
                                                        ProfileActivity profileActivity4 = profileActivity2;
                                                        profileActivity4.getMessagesController().invalidateContentSettings();
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ay0(profileActivity4, 2));
                                                        profileActivity4.i5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity2.showDialog(alertDialog$Builder.f20678a);
                                        return;
                                    default:
                                        final ProfileActivity profileActivity3 = this.f41818b;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity3.getParentActivity());
                                        alertDialog$Builder2.f20678a.R = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                        alertDialog$Builder2.f20678a.T = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                        String string5 = LocaleController.getString(R.string.Remove);
                                        final TLRPC.UserFull userFull4 = userFull;
                                        alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.z1() {
                                            @Override
                                            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                                                switch (r3) {
                                                    case 0:
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        TLRPC.UserFull userFull42 = userFull4;
                                                        userFull42.personal_channel_id = 0L;
                                                        userFull42.personal_channel_message = 0;
                                                        userFull42.flags2 &= -65;
                                                        ProfileActivity profileActivity32 = profileActivity3;
                                                        profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new ay0(profileActivity32, 3));
                                                        profileActivity32.i5(false, false);
                                                        profileActivity32.getMessagesStorage().updateUserInfo(userFull42, false);
                                                        return;
                                                    default:
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        TLRPC.UserFull userFull5 = userFull4;
                                                        userFull5.birthday = null;
                                                        userFull5.flags2 &= -33;
                                                        ProfileActivity profileActivity4 = profileActivity3;
                                                        profileActivity4.getMessagesController().invalidateContentSettings();
                                                        profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ay0(profileActivity4, 2));
                                                        profileActivity4.i5(false, false);
                                                        profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                        return;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        profileActivity3.showDialog(alertDialog$Builder2.f20678a);
                                        return;
                                }
                            }
                        }, true);
                    }
                } else {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileEditBio), new ib0(this, 11), false);
                }
                if (H.x() > 0) {
                    H.Z();
                    return true;
                }
            }
        }
        return false;
    }

    public final void L4(float r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.L4(float):void");
    }

    @Override
    public final void M() {
        org.telegram.ui.Components.pv0 pv0Var;
        rz0 rz0Var = this.O;
        if (rz0Var != null && (pv0Var = this.R) != null) {
            rz0Var.setNewMediaCounts(pv0Var.f29675c);
        }
        if (this.d != null) {
            i5(false, false);
        }
        R();
        if (this.f34040w2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final boolean M3() {
        s4.b1 b1Var;
        View view;
        if ((this.J0 || (!AndroidUtilities.isTablet() && !this.f33983o2)) && this.f33920f0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            this.G0 = true;
            this.f33990p2 = true;
            int i10 = 0;
            while (true) {
                b1Var = null;
                if (i10 < this.f33882a.getChildCount()) {
                    if (RecyclerView.R(this.f33882a.getChildAt(i10)) == 0) {
                        view = this.f33882a.getChildAt(i10);
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                ly0 ly0Var = this.f33882a;
                View F = ly0Var.F(view);
                if (F != null) {
                    b1Var = ly0Var.T(F);
                }
                if (b1Var != null) {
                    Integer num = (Integer) this.Z1.get(Integer.valueOf(b1Var.b()));
                    if (num != null) {
                        this.Q1 = true;
                        this.f33882a.v0(0, -(((this.f33882a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), org.telegram.ui.Components.bs.h);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void M4(TLRPC.ChatFull chatFull) {
        boolean z10;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        this.f34032v2 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.f33975n1 == 0) {
                this.f33975n1 = -j10;
                getMediaDataController().getMediaCounts(this.f33975n1, this.f33935h1, this.classGuid);
            }
        }
        rz0 rz0Var = this.O;
        if (rz0Var != null) {
            rz0Var.setChatInfo(this.f34032v2);
        }
        wy0 wy0Var = this.f33981o0;
        if (wy0Var != null && !this.f34002r1) {
            wy0Var.setChatInfo(this.f34032v2);
        }
        yy0 yy0Var = this.f34030v0;
        if (yy0Var != null && (chatFull3 = this.f34032v2) != null) {
            yy0Var.setStories(chatFull3.stories);
        }
        ai.j1 j1Var = this.f34038w0;
        if (j1Var != null) {
            j1Var.a();
        }
        vy0 vy0Var = this.f33920f0;
        if (vy0Var != null) {
            vy0Var.setHasStories(l4());
        }
        N3();
        if (this.f33928g1 != 0) {
            if (!BuildVars.IS_BILLING_UNAVAILABLE && !getMessagesController().premiumPurchaseBlocked() && (chatFull2 = this.f34032v2) != null && chatFull2.stargifts_available) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.U0.I(38, z10);
            org.telegram.ui.Components.ci0 ci0Var = this.f33883a0;
            if (ci0Var != null) {
                ci0Var.o(3, z10);
            }
        }
    }

    public final void N3() {
        TLRPC.Chat chat = this.F2;
        if (chat != null && chat.megagroup) {
            TLRPC.ChatFull chatFull = this.f34032v2;
            if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants != null) {
                for (int i10 = 0; i10 < this.f34032v2.participants.participants.size(); i10++) {
                    TLRPC.ChatParticipant chatParticipant = this.f34032v2.participants.participants.get(i10);
                    this.D1.k(chatParticipant, chatParticipant.user_id);
                }
            }
        }
    }

    public final void N4(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.Z != null && (tL_emojiStatusCollectible2 = this.f33972m6) != tL_emojiStatusCollectible) {
            if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
                this.f33972m6 = tL_emojiStatusCollectible;
                ei.x3 x3Var = this.f33954j6;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                if (tL_emojiStatusCollectible != null && !TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                    this.f33966l6 = null;
                    this.f33954j6 = new ei.x3(getParentActivity(), 3);
                    this.f33961k6 = org.telegram.ui.ActionBar.k6.v(tL_emojiStatusCollectible.center_color | (-16777216), org.telegram.ui.ActionBar.k6.o1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
                    this.f33954j6.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                    ei.x3 x3Var2 = this.f33954j6;
                    int o12 = org.telegram.ui.ActionBar.k6.o1(0.5f, (-16777216) | tL_emojiStatusCollectible.text_color);
                    x3Var2.A0 = true;
                    x3Var2.I0 = System.currentTimeMillis();
                    x3Var2.B0 = new Path();
                    x3Var2.C0 = AndroidUtilities.dpf2(0.66f) / 2.0f;
                    x3Var2.D0 = new Paint(1);
                    x3Var2.E0 = new Paint(1);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, o12), org.telegram.ui.ActionBar.k6.o1(1.0f, o12), org.telegram.ui.ActionBar.k6.o1(0.0f, o12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    x3Var2.H0 = linearGradient;
                    x3Var2.E0.setShader(linearGradient);
                    x3Var2.F0 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, o12), org.telegram.ui.ActionBar.k6.o1(0.5f, o12), org.telegram.ui.ActionBar.k6.o1(0.0f, o12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                    x3Var2.G0 = new Matrix();
                    x3Var2.D0.setShader(x3Var2.F0);
                    x3Var2.E0.setStyle(Paint.Style.STROKE);
                    x3Var2.E0.setStrokeJoin(Paint.Join.ROUND);
                    x3Var2.E0.setStrokeCap(Paint.Cap.ROUND);
                    x3Var2.E0.setStrokeWidth(AndroidUtilities.dpf2(0.66f));
                    this.Z.addView(this.f33954j6, w7.z5.c(24.0f, -1));
                    this.f33954j6.t(9.33f);
                    ei.x3 x3Var3 = this.f33954j6;
                    Typeface bold = AndroidUtilities.bold();
                    x3Var3.H.x(bold);
                    x3Var3.J.setTypeface(bold);
                    this.f33954j6.s(tL_emojiStatusCollectible.title);
                    ei.x3 x3Var4 = this.f33954j6;
                    x3Var4.d = -1L;
                    x3Var4.k(5.66f, 2.66f, 5.66f, 2.66f);
                    ei.x3 x3Var5 = this.f33954j6;
                    x3Var5.getClass();
                    x3Var5.f10114y = AndroidUtilities.dpf2(4.0f);
                    x3Var5.E = AndroidUtilities.dpf2(2.66f);
                    this.f33954j6.r();
                    this.f33954j6.q(16.0f);
                    this.f33954j6.u();
                    this.f33954j6.setOnClickListener(new ey0(this, tL_emojiStatusCollectible.slug, 1));
                    if (this.R1 < AndroidUtilities.dp(82.0f)) {
                        this.f33966l6 = Boolean.FALSE;
                        this.f33954j6.setAlpha(0.0f);
                    }
                    Z4();
                    ei.x3 x3Var6 = this.f33954j6;
                    Objects.requireNonNull(x3Var6);
                    AndroidUtilities.runOnUIThread(new oj0(x3Var6, 28), 6000L);
                }
            }
        }
    }

    public final boolean O3() {
        org.telegram.ui.ActionBar.h5 h5Var;
        if (this.K1 != 0 && (h5Var = this.parentLayout) != null && h5Var.getFragmentStack() != null && this.parentLayout.getFragmentStack().size() >= 2 && (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof sn)) {
            finishFragment();
            return true;
        }
        return false;
    }

    public final void P3() {
        if (this.f33882a == null) {
            return;
        }
        float x10 = org.telegram.ui.Cells.b1.x(((FrameLayout.LayoutParams) this.Y.getLayoutParams()).width, this.f33900c2, 0.5f, this.f33882a.getMeasuredWidth() / 2.0f);
        this.a2 = x10;
        if (this.H1) {
            this.a2 = AndroidUtilities.lerp(this.Q5, x10, this.T1);
        }
        this.Y.setTranslationX(this.a2);
    }

    public final void P4(yz0 yz0Var) {
        if (this.f33960k5 == yz0Var) {
            return;
        }
        this.f33960k5 = yz0Var;
        AndroidUtilities.forEachViews((RecyclerView) this.f33882a, (Utilities.Callback<View>) new zx0(this, 0));
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new hi.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 5));
    }

    public final int Q3() {
        int i10 = 0;
        if (this.f33921f1 != 0 && this.f34001r0 != null && !this.f34017t1) {
            return 0;
        }
        return AndroidUtilities.dp(74 + ((this.J4 || this.K4) ? 25 : 25));
    }

    public final void Q4(int i10) {
        boolean z10;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (!AndroidUtilities.isTablet()) {
            boolean z11 = false;
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.L1 = z10;
            if (i10 != 0) {
                z11 = true;
            }
            this.M1 = z11;
            o5();
            if (globalMainSettings.getBoolean("view_animations", true)) {
                this.K1 = i10;
            } else if (i10 == 2) {
                this.f33982o1 = true;
            }
        }
    }

    @Override
    public final void R() {
        String str;
        int size;
        int i10;
        rz0 rz0Var = this.O;
        if (rz0Var != null && this.f34008s != null) {
            int closestTab = rz0Var.getClosestTab();
            int[] iArr = this.R.f29675c;
            int i11 = 0;
            if (closestTab == 0) {
                if (iArr[7] <= 0 && iArr[6] <= 0) {
                    int i12 = iArr[0];
                    if (i12 <= 0) {
                        this.f34008s.setText(LocaleController.getString(R.string.SharedMedia));
                    } else {
                        this.f34008s.setText(LocaleController.formatPluralString("Media", i12, new Object[0]));
                    }
                } else if (this.O.getPhotosVideosTypeFilter() != 1 && iArr[7] > 0) {
                    if (this.O.getPhotosVideosTypeFilter() != 2 && (i10 = iArr[6]) > 0) {
                        this.f34008s.setText(a1.g.D(LocaleController.formatPluralString("Photos", i10, new Object[0]), ", ", LocaleController.formatPluralString("Videos", iArr[7], new Object[0])));
                    } else {
                        this.f34008s.setText(LocaleController.formatPluralString("Videos", iArr[7], new Object[0]));
                    }
                } else {
                    this.f34008s.setText(LocaleController.formatPluralString("Photos", iArr[6], new Object[0]));
                }
            } else if (closestTab == 1) {
                int i13 = iArr[1];
                if (i13 <= 0) {
                    this.f34008s.setText(LocaleController.getString(R.string.Files));
                } else {
                    this.f34008s.setText(LocaleController.formatPluralString("Files", i13, new Object[0]));
                }
            } else if (closestTab == 2) {
                int i14 = iArr[2];
                if (i14 <= 0) {
                    this.f34008s.setText(LocaleController.getString(R.string.Voice));
                } else {
                    this.f34008s.setText(LocaleController.formatPluralString("Voice", i14, new Object[0]));
                }
            } else if (closestTab == 3) {
                int i15 = iArr[3];
                if (i15 <= 0) {
                    this.f34008s.setText(LocaleController.getString(R.string.SharedLinks));
                } else {
                    this.f34008s.setText(LocaleController.formatPluralString("Links", i15, new Object[0]));
                }
            } else if (closestTab == 4) {
                int i16 = iArr[4];
                if (i16 <= 0) {
                    this.f34008s.setText(LocaleController.getString(R.string.Music));
                } else {
                    this.f34008s.setText(LocaleController.formatPluralString("MusicFiles", i16, new Object[0]));
                }
            } else if (closestTab == 5) {
                int i17 = iArr[5];
                if (i17 <= 0) {
                    this.f34008s.setText(LocaleController.getString(R.string.AccDescrGIFs));
                } else {
                    this.f34008s.setText(LocaleController.formatPluralString("GIFs", i17, new Object[0]));
                }
            } else if (closestTab == 6) {
                this.f34008s.setText(LocaleController.formatPluralString("CommonGroups", this.f34040w2.common_chats_count, new Object[0]));
            } else if (closestTab == 7) {
                this.f34008s.setText(this.f34000r[1].getText());
            } else if (closestTab != 8 && !org.telegram.ui.Components.xv0.z0(closestTab)) {
                if (closestTab == 13) {
                    this.f34008s.setText(this.O.W(true));
                } else if (closestTab == 9) {
                    this.f34008s.setText(LocaleController.formatPluralString("ProfileStoriesArchiveCount", this.O.d0(closestTab), new Object[0]));
                } else if (closestTab == 10) {
                    MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(a());
                    org.telegram.ui.Components.fp0 fp0Var = this.f34008s;
                    if (this.f34011s2) {
                        str = "Bots";
                    } else {
                        str = "Channels";
                    }
                    if (channelRecommendations == null) {
                        size = 0;
                    } else {
                        size = channelRecommendations.chats.size() + channelRecommendations.more;
                    }
                    fp0Var.setText(LocaleController.formatPluralString(str, size, new Object[0]));
                } else if (closestTab == 12) {
                    this.f34008s.setText(LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, getMessagesController().getSavedMessagesController().getMessagesCount(a())), new Object[0]));
                } else if (closestTab == 14) {
                    org.telegram.ui.Components.fp0 fp0Var2 = this.f34008s;
                    org.telegram.ui.Components.ns0 ns0Var = this.O.V;
                    if (ns0Var != null) {
                        i11 = ns0Var.getGiftsCount();
                    }
                    fp0Var2.setText(LocaleController.formatPluralStringComma("ProfileGiftsCount", i11));
                } else if (closestTab == 15) {
                    int i18 = iArr[8];
                    if (i18 <= 0) {
                        this.f34008s.setText(LocaleController.getString(R.string.SharedPollTab));
                    } else {
                        this.f34008s.setText(LocaleController.formatPluralStringComma("ProfilePollsCount", i18));
                    }
                }
            } else if (this.f34011s2) {
                this.f34008s.setText(this.O.W(false));
            } else if (this.O.d0(closestTab) > 0) {
                this.f34008s.setText(LocaleController.formatPluralString("ProfileStoriesCount", this.O.d0(closestTab), new Object[0]));
            } else {
                this.f34008s.setText(LocaleController.getString(R.string.ProfileStoriesCountZero));
            }
        }
    }

    public final int R3(ImageReceiver imageReceiver) {
        if (imageReceiver.getDrawable() instanceof org.telegram.ui.Components.u71) {
            return ((org.telegram.ui.Components.u71) imageReceiver.getDrawable()).f31099a.a();
        }
        return AndroidUtilities.calcBitmapColor(this.f33920f0.getImageReceiver().getBitmap());
    }

    public final void R4(TLRPC.UserFull userFull, org.telegram.ui.Cells.g6 g6Var, u01 u01Var) {
        boolean z10;
        this.f34040w2 = userFull;
        org.telegram.ui.Components.hx0 hx0Var = this.T;
        if (hx0Var != null) {
            hx0Var.set(userFull.stars_rating);
        }
        yy0 yy0Var = this.f34030v0;
        if (yy0Var != null) {
            yy0Var.setStories(this.f34040w2.stories);
        }
        ai.j1 j1Var = this.f34038w0;
        if (j1Var != null) {
            j1Var.a();
        }
        vy0 vy0Var = this.f33920f0;
        if (vy0Var != null) {
            vy0Var.setHasStories(l4());
        }
        rz0 rz0Var = this.O;
        if (rz0Var != null) {
            rz0Var.setUserInfo(this.f34040w2);
        }
        if (this.f34048x2 == null) {
            this.f34048x2 = g6Var;
        }
        if (this.f34048x2 == null) {
            this.f34048x2 = new org.telegram.ui.Cells.g6(this.currentAccount);
        }
        org.telegram.ui.Cells.g6 g6Var2 = this.f34048x2;
        ib0 ib0Var = new ib0(this, 20);
        if (g6Var2.f22412c) {
            ib0Var.run();
        } else {
            g6Var2.h.add(ib0Var);
        }
        this.f34048x2.d(this.f34040w2);
        if (this.f34062z2 == null) {
            this.f34062z2 = u01Var;
        }
        u01 u01Var2 = this.f34062z2;
        if (u01Var2 == null) {
            u01 c10 = u01.c(this.currentAccount, this.f34040w2, u01Var2);
            this.f34062z2 = c10;
            if (c10 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f34056y2 = z10;
        }
        u01 u01Var3 = this.f34062z2;
        if (u01Var3 != null) {
            ib0 ib0Var2 = new ib0(this, 16);
            if (u01Var3.f42122b) {
                ib0Var2.run();
            } else {
                u01Var3.h.add(ib0Var2);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.U0;
        if (u0Var != null) {
            u0Var.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.f33921f1)));
            if (g4()) {
                this.U0.K(44);
            } else {
                this.U0.r(44);
            }
        }
    }

    public final org.telegram.ui.Components.p5 S3(int i10, long j10) {
        int i11;
        org.telegram.ui.Components.p5[] p5VarArr = this.H;
        if (p5VarArr[i10] == null) {
            org.telegram.ui.ActionBar.n5 n5Var = this.f33919f[i10];
            int dp = AndroidUtilities.dp(17.0f);
            if (i10 == 0) {
                i11 = 7;
            } else {
                i11 = 2;
            }
            org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(dp, i11, n5Var, false);
            p5VarArr[i10] = p5Var;
            int dp2 = AndroidUtilities.dp(1.0f);
            p5Var.I = 0;
            p5Var.J = dp2;
            if (this.H0) {
                p5VarArr[i10].a();
            }
        }
        if (j10 != 0) {
            p5VarArr[i10].j(j10, false);
        } else {
            p5VarArr[i10].g(null, false);
        }
        b5();
        return p5VarArr[i10];
    }

    public final void S4(boolean z10, boolean z11) {
        if (this.f33934h0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.f33927g0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f33927g0 = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f33927g0 = animatorSet2;
            if (z10) {
                this.f33934h0.setVisibility(0);
                this.f33927g0.playTogether(ObjectAnimator.ofFloat(this.f33934h0, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f33934h0, View.ALPHA, 0.0f));
            }
            this.f33927g0.setDuration(180L);
            this.f33927g0.addListener(new jz0(this, z10, 1));
            this.f33927g0.start();
        } else if (z10) {
            this.f33934h0.setAlpha(1.0f);
            this.f33934h0.setVisibility(0);
        } else {
            this.f33934h0.setAlpha(0.0f);
            this.f33934h0.setVisibility(4);
        }
    }

    @Override
    public final boolean T() {
        return this.B1;
    }

    public final void T3(boolean z10) {
        a0.h hVar;
        int i10;
        if (!this.C1 && (hVar = this.D1) != null && this.f34032v2 != null) {
            this.C1 = true;
            int i11 = 0;
            if (hVar.m() != 0 && z10) {
                i10 = 300;
            } else {
                i10 = 0;
            }
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.f33928g1);
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            if (!z10) {
                i11 = this.D1.m();
            }
            tL_channels_getParticipants.offset = i11;
            tL_channels_getParticipants.limit = 200;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new hg.u(this, tL_channels_getParticipants, i10)), this.classGuid);
        }
    }

    public final void T4() {
        int i10;
        int i11;
        Long l4;
        if (this.D5 != null) {
            return;
        }
        s51[] s51VarArr = new s51[1];
        Rect rect = AndroidUtilities.rectTmp2;
        org.telegram.ui.ActionBar.n5[] n5VarArr = this.f33919f;
        org.telegram.ui.ActionBar.n5 n5Var = n5VarArr[1];
        if (n5Var != null) {
            if (n5Var.getRightDrawable() == null) {
                rect.set(n5VarArr[1].getWidth() - 1, (n5VarArr[1].getHeight() / 2) - 1, n5VarArr[1].getWidth() + 1, (n5VarArr[1].getHeight() / 2) + 1);
            } else {
                rect.set(n5VarArr[1].getRightDrawable().getBounds());
                rect.offset((int) ((n5VarArr[1].getScaleX() - 1.0f) * rect.centerX()), 0);
                rect.offset((int) n5VarArr[1].getX(), (int) n5VarArr[1].getY());
            }
        }
        if (n5VarArr[1].getScaleX() < 1.5f) {
            i10 = 16;
        } else {
            i10 = 32;
        }
        int i12 = i10;
        int dp = (-(this.Z.getHeight() - rect.centerY())) - AndroidUtilities.dp(i12);
        int min = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
        int centerX = rect.centerX();
        int b10 = w7.r.b(centerX - (min / 2), 0, AndroidUtilities.displaySize.x - min);
        Activity parentActivity = getParentActivity();
        Integer valueOf = Integer.valueOf(Math.max(0, centerX - b10));
        if (this.F2 == null) {
            i11 = 0;
        } else {
            i11 = 9;
        }
        bz0 bz0Var = new bz0(this, this, parentActivity, valueOf, i11, this.A0, i12, s51VarArr);
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f33921f1));
        if (user != null) {
            bz0Var.setExpireDateHint(DialogObject.getEmojiStatusUntil(user.emoji_status));
        }
        Long l10 = this.F;
        org.telegram.ui.Components.p5[] p5VarArr = this.G;
        if (l10 != null) {
            bz0Var.setSelected(l10);
        } else {
            org.telegram.ui.Components.p5 p5Var = p5VarArr[1];
            if (p5Var != null) {
                Drawable drawable = p5Var.f29416f[0];
                if (drawable instanceof org.telegram.ui.Components.r5) {
                    l4 = Long.valueOf(((org.telegram.ui.Components.r5) drawable).i());
                    bz0Var.setSelected(l4);
                }
            }
            l4 = null;
            bz0Var.setSelected(l4);
        }
        bz0Var.setSaveState(3);
        bz0Var.y(p5VarArr[1], n5VarArr[1]);
        cz0 cz0Var = new cz0(this, bz0Var);
        this.D5 = cz0Var;
        s51VarArr[0] = cz0Var;
        int[] iArr = new int[2];
        org.telegram.ui.ActionBar.n5 n5Var2 = n5VarArr[1];
        if (n5Var2 != null) {
            n5Var2.getLocationOnScreen(iArr);
        }
        s51VarArr[0].showAsDropDown(this.fragmentView, b10, dp, 51);
        s51VarArr[0].b();
    }

    public final org.telegram.ui.Components.p5 U3(TLRPC.EmojiStatus emojiStatus, boolean z10, int i10) {
        int i11;
        org.telegram.ui.Components.p5[] p5VarArr = this.G;
        if (p5VarArr[i10] == null) {
            org.telegram.ui.ActionBar.n5 n5Var = this.f33919f[i10];
            int dp = AndroidUtilities.dp(24.0f);
            if (i10 == 0) {
                i11 = 7;
            } else {
                i11 = 2;
            }
            org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(dp, i11, n5Var, false);
            p5VarArr[i10] = p5Var;
            if (this.H0) {
                p5Var.a();
            }
        }
        if (i10 == 1) {
            this.F = null;
        }
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((1 & tL_emojiStatus.flags) != 0 && tL_emojiStatus.until <= ((int) (System.currentTimeMillis() / 1000))) {
                p5VarArr[i10].g(a4(i10), z10);
                p5VarArr[i10].m(false, z10);
            } else {
                p5VarArr[i10].j(tL_emojiStatus.document_id, z10);
                p5VarArr[i10].m(false, z10);
            }
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) != 0 && tL_emojiStatusCollectible.until <= ((int) (System.currentTimeMillis() / 1000))) {
                p5VarArr[i10].g(a4(i10), z10);
                p5VarArr[i10].m(false, z10);
            } else {
                if (i10 == 1) {
                    this.F = Long.valueOf(tL_emojiStatusCollectible.collectible_id);
                }
                p5VarArr[i10].j(tL_emojiStatusCollectible.document_id, z10);
                p5VarArr[i10].m(true, z10);
            }
        } else {
            p5VarArr[i10].g(a4(i10), z10);
            p5VarArr[i10].m(false, z10);
        }
        b5();
        return p5VarArr[i10];
    }

    public final void U4() {
        int i10 = 0;
        this.O.I0.setReordering(false);
        rz0 rz0Var = this.O;
        org.telegram.ui.Components.nt0 nt0Var = rz0Var.I0;
        if (rz0Var.f32711v1 != null && nt0Var != null) {
            boolean u02 = rz0Var.u0();
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = nt0Var.getTabIds();
            int size = tabIds.size();
            while (i10 < size) {
                Integer num = tabIds.get(i10);
                i10++;
                TLRPC.ProfileTab f02 = org.telegram.ui.Components.xv0.f0(num.intValue(), u02);
                if (f02 != null) {
                    arrayList.add(f02);
                }
            }
        }
        this.O.A1(true);
        this.A5.animate().translationY(AndroidUtilities.dp(69.0f)).setDuration(180L).setInterpolator(org.telegram.ui.Components.bs.h).withEndAction(new ib0(this, 21)).start();
        org.telegram.ui.Components.xc.a0(this).Q(R.raw.contact_check, 36, "Tab order changed.").j();
    }

    public final int V3() {
        return Q3() + W3();
    }

    public final void V4() {
        int w02;
        int w03;
        if (!this.f33996q2) {
            org.telegram.ui.ActionBar.n5[] n5VarArr = this.f34000r;
            org.telegram.ui.ActionBar.n5 n5Var = n5VarArr[1];
            if (n5Var != null) {
                Object tag = n5Var.getTag();
                for (int i10 = 0; i10 < 2; i10++) {
                    if (tag instanceof Integer) {
                        n5VarArr[i10 + 1].setTextColor(x3(org.telegram.ui.ActionBar.k6.w0(((Integer) tag).intValue(), this.A0), Boolean.valueOf(this.K0[0])));
                    } else {
                        n5VarArr[i10 + 1].setTextColor(x3(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, this.A0), Boolean.TRUE));
                    }
                }
            }
            Drawable drawable = this.f34045x;
            int i11 = -1;
            if (drawable != null) {
                if (this.S5 != null) {
                    w03 = -1;
                } else {
                    w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21408pc, this.A0);
                }
                drawable.setColorFilter(w03, PorterDuff.Mode.MULTIPLY);
            }
            org.telegram.ui.Components.zm0 zm0Var = this.L;
            if (zm0Var != null) {
                zm0Var.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21257h8, this.A0));
            }
            org.telegram.ui.ActionBar.n5 n5Var2 = this.f33919f[1];
            if (n5Var2 != null) {
                n5Var2.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21527vh, this.A0));
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                if (this.S5 == null) {
                    i11 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21518v8, this.A0);
                }
                kVar.B(i11, false);
                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                if (this.S5 != null) {
                    w02 = 553648127;
                } else {
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21220f8, this.A0);
                }
                kVar2.A(w02, false);
            }
        }
        b5();
        t5();
    }

    public final int W3() {
        if (Q3() == 0) {
            return AndroidUtilities.dp(168.0f);
        }
        return AndroidUtilities.dp(152.0f);
    }

    public final void W4() {
        int i10;
        float f7;
        l0 l0Var;
        if (this.f33883a0 != null && this.f34000r[1] != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int i11 = currentActionBarHeight + i10;
            org.telegram.ui.Components.ci0 ci0Var = this.f33883a0;
            boolean z10 = this.H1;
            ci0Var.e = z10;
            if (z10 && this.K1 == 2 && (l0Var = this.Y) != null) {
                this.f33883a0.f25344f = this.Y.getY() + (this.Y.getScaleY() * l0Var.getHeight());
                this.f33883a0.setAlpha(this.T1);
                org.telegram.ui.Components.ci0 ci0Var2 = this.f33883a0;
                ci0Var2.E = AndroidUtilities.dp(74.0f);
                ci0Var2.setTranslationY(this.f33882a.getMeasuredWidth());
                ci0Var2.invalidate();
            } else {
                ci0Var.f25344f = -1.0f;
                float f10 = i11;
                float f11 = this.R1 + f10;
                if (!this.J4 && !this.K4) {
                    f7 = 0.0f;
                } else {
                    f7 = 25.0f;
                }
                float dp = f11 - AndroidUtilities.dp(f7);
                float min = Math.min(AndroidUtilities.dp(74.0f), dp - f10);
                org.telegram.ui.Components.ci0 ci0Var3 = this.f33883a0;
                ci0Var3.E = min;
                ci0Var3.setTranslationY(dp - min);
                ci0Var3.invalidate();
            }
            ImageView imageView = this.P0;
            if (imageView != null && imageView.getTag() != null) {
                this.f33883a0.getClass();
                if (this.P0.getVisibility() == 0) {
                    this.P0.setVisibility(8);
                }
                if (this.P0.getTag() instanceof org.telegram.ui.ActionBar.u0) {
                    ((org.telegram.ui.ActionBar.u0) this.P0.getTag()).setAlpha(1.0f);
                }
            }
        }
    }

    public final Drawable X3() {
        if (this.f34045x == null) {
            this.f34045x = org.telegram.ui.ActionBar.k6.l4.getConstantState().newDrawable().mutate();
        }
        return this.f34045x;
    }

    public final void X4() {
        int i10;
        if (this.f33884a1 != null && this.f33891b1 != null) {
            TLRPC.UserFull userFull = this.f34040w2;
            if (userFull == null && this.f34032v2 == null) {
                i10 = 0;
            } else if (userFull != null) {
                i10 = userFull.ttl_period;
            } else {
                i10 = this.f34032v2.ttl_period;
            }
            this.f34016t0.b(i10);
            this.f33891b1.b(i10);
        }
    }

    public final float Y3(float f7, float f10) {
        float f11;
        float f12;
        this.f33911d6 = f7;
        this.f33926f6 = f10;
        int i10 = this.K1;
        if (i10 == 2) {
            f11 = 1.0f;
        } else if (this.T1 < 1.0f && i10 != 0) {
            f11 = 0.0f;
        } else {
            f11 = this.f33963l2;
        }
        float clamp01 = Utilities.clamp01(f11);
        org.telegram.ui.Components.hx0 hx0Var = this.T;
        if (hx0Var != null) {
            f12 = hx0Var.getVisibilityFactor();
        } else {
            f12 = 0.0f;
        }
        return Math.max(0.0f, (b4() + this.f33999q5) * clamp01) + com.google.android.gms.internal.play_billing.k3.y(1.0f, clamp01, f10 * f12, f7);
    }

    public final void Y4() {
        float dp;
        boolean z10;
        if (this.f34028u5 != null) {
            rz0 rz0Var = this.O;
            if (rz0Var != null && rz0Var.isAttachedToWindow()) {
                dp = AndroidUtilities.dp(232.0f) - (this.f33882a.getMeasuredHeight() - this.O.getY());
            } else {
                dp = AndroidUtilities.dp(72.0f);
            }
            int i10 = 0;
            if (dp <= 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            ne.b bVar = this.C5;
            bVar.a(z10, true);
            float f7 = bVar.e;
            this.f34028u5.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f), 0, f7));
            this.f34028u5.setAlpha(f7);
            FrameLayout frameLayout = this.f34028u5;
            if (f7 <= 0.0f) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29825w;
            if (qcVar != null) {
                qcVar.l();
            }
        }
    }

    public final float Z3(float f7) {
        float f10;
        this.f33933g6 = f7;
        int i10 = this.K1;
        float f11 = 0.0f;
        if (i10 == 2) {
            f10 = 1.0f;
        } else if (this.T1 < 1.0f && i10 != 0) {
            f10 = 0.0f;
        } else {
            f10 = this.f33963l2;
        }
        float clamp01 = Utilities.clamp01(f10);
        if (this.T != null) {
            f11 = this.T.getVisibilityFactor() * AndroidUtilities.dp(3.0f);
        }
        return com.google.android.gms.internal.play_billing.k3.y(1.0f, clamp01, f11, f7);
    }

    public final void Z4() {
        ei.x3 x3Var = this.f33954j6;
        if (x3Var != null) {
            org.telegram.ui.ActionBar.n5[] n5VarArr = this.f33919f;
            boolean z10 = true;
            float f7 = 0.0f;
            x3Var.m(0.0f, (n5VarArr[1].getScaleX() * n5VarArr[1].getRightDrawableX()) + n5VarArr[1].getX() + (-x3Var.getPaddingLeft()));
            float lerp = AndroidUtilities.lerp(this.f33976n2, this.f33968m2);
            ei.x3 x3Var2 = this.f33954j6;
            x3Var2.setTranslationY(((n5VarArr[1].getY() + (-x3Var2.getPaddingBottom())) - AndroidUtilities.dp(24.0f)) + AndroidUtilities.lerp(AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(12.0f), lerp));
            this.f33954j6.h(i0.a.f(lerp, this.f33961k6, 1342177280));
            if (this.R1 < AndroidUtilities.dp(82.0f)) {
                z10 = false;
            }
            Boolean bool = this.f33966l6;
            if (bool != null && bool.booleanValue() == z10) {
                return;
            }
            ViewPropertyAnimator animate = this.f33954j6.animate();
            this.f33966l6 = Boolean.valueOf(z10);
            if (z10) {
                f7 = 1.0f;
            }
            org.telegram.messenger.sl.t(animate.alpha(f7), org.telegram.ui.Components.bs.f25134g, 200L);
        }
    }

    public final long a() {
        long j10 = this.f33949j1;
        if (j10 != 0) {
            return j10;
        }
        long j11 = this.f33921f1;
        if (j11 != 0) {
            return j11;
        }
        return -this.f33928g1;
    }

    public final org.telegram.ui.Components.as a4(int i10) {
        org.telegram.ui.Components.as[] asVarArr = this.K;
        if (asVarArr[i10] == null) {
            Drawable mutate = getParentActivity().getDrawable(R.drawable.msg_premium_liststar).mutate();
            Drawable[] drawableArr = this.E;
            drawableArr[i10] = mutate;
            drawableArr[i10].setColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21598zh, this.A0), PorterDuff.Mode.MULTIPLY);
            asVarArr[i10] = new org.telegram.ui.Components.as(drawableArr[i10], getParentActivity().getDrawable(R.drawable.msg_premium_prolfilestar).mutate());
        }
        return asVarArr[i10];
    }

    public final void a5() {
        if (getParentActivity() != null && this.W0 != null) {
            if (getUserConfig().isPremium()) {
                this.W0.setIcon(R.drawable.menu_profile_colors);
                return;
            }
            Drawable drawable = getParentActivity().getDrawable(R.drawable.menu_profile_colors_locked);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.A0), PorterDuff.Mode.SRC_IN));
            this.G6 = drawable;
            Drawable drawable2 = getParentActivity().getDrawable(R.drawable.msg_gallery_locked2);
            drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            this.W0.setIcon(new ci.o2(drawable, drawable2, AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f)));
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21346m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21588z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21509uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21272i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21257h8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21527vh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21408pc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21220f8));
    }

    public final float b4() {
        if (this.T != null) {
            return this.T.getVisibilityFactor() * AndroidUtilities.dp(22.0f);
        }
        return 0.0f;
    }

    public final void b5() {
        c5(this.R5);
    }

    public final org.telegram.ui.Components.zm0 c4(int i10) {
        if (this.L == null) {
            org.telegram.ui.Components.zm0 zm0Var = new org.telegram.ui.Components.zm0(i10);
            this.L = zm0Var;
            zm0Var.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21257h8, this.A0));
        }
        return this.L;
    }

    public final void c5(float f7) {
        int offsetColor;
        for (int i10 = 0; i10 < 2; i10++) {
            MessagesController.PeerColor peerColor = this.S5;
            if (peerColor != null && i10 == 1) {
                offsetColor = i0.a.f(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.k6.I.q()), -1);
            } else {
                offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21598zh, this.A0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oi, this.A0), this.G5, 1.0f);
            }
            int f10 = i0.a.f(f7, offsetColor, -1);
            int i11 = org.telegram.ui.ActionBar.k6.Oi;
            int f11 = i0.a.f(this.G5, f10, org.telegram.ui.ActionBar.k6.w0(i11, this.A0));
            org.telegram.ui.Components.p5 p5Var = this.G[i10];
            if (p5Var != null) {
                p5Var.k(Integer.valueOf(f11));
            }
            org.telegram.ui.Components.p5 p5Var2 = this.H[i10];
            if (p5Var2 != null) {
                p5Var2.k(Integer.valueOf(i0.a.f(this.G5, i0.a.f(f7, offsetColor, -1711276033), org.telegram.ui.ActionBar.k6.w0(i11, this.A0))));
            }
            if (i10 == 1) {
                this.f33912e0.setColor(f11);
            }
        }
        this.R5 = f7;
    }

    @Override
    public final boolean canBeginSlide() {
        if (!this.O.A0()) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final void clearViews() {
        this.S5 = null;
        super.clearViews();
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(android.content.Context r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.createActionBar(android.content.Context):org.telegram.ui.ActionBar.k");
    }

    @Override
    public final android.view.View createView(android.content.Context r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.createView(android.content.Context):android.view.View");
    }

    public final r01 d4() {
        if (this.f33940h6 == null) {
            r01 r01Var = new r01(LocaleController.getString(R.string.StatusHiddenShow));
            this.f33940h6 = r01Var;
            r01Var.setAlpha((int) (Math.min(1.0f, this.R1 / V3()) * 255.0f));
            this.f33940h6.a(i0.a.f(this.f33963l2, org.telegram.ui.ActionBar.k6.o1(0.5f, org.telegram.ui.ActionBar.k6.b(0.18f, -0.1f, this.f33906d1)), 603979775));
        }
        return this.f33940h6;
    }

    public final void d5() {
        org.telegram.ui.Cells.o oVar = this.f33912e0;
        org.telegram.ui.ActionBar.n5[] n5VarArr = this.f33919f;
        oVar.setScaleX(n5VarArr[1].getScaleX());
        this.f33912e0.setScaleY(n5VarArr[1].getScaleY());
        this.f33912e0.b((n5VarArr[1].getScaleX() * n5VarArr[1].getRightDrawableX()) + n5VarArr[1].getX(), (n5VarArr[1].getHeight() - (n5VarArr[1].getScaleY() * (n5VarArr[1].getHeight() - n5VarArr[1].getRightDrawableY()))) + n5VarArr[1].getY());
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        f01 f01Var;
        boolean z10;
        org.telegram.ui.ActionBar.h5 h5Var;
        Object[] objArr2;
        TLRPC.ChatFull chatFull;
        TLRPC.User user;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.InputGroupCall inputGroupCall;
        boolean z11;
        TLRPC.Chat chat;
        Object[] objArr3;
        ly0 ly0Var;
        ly0 ly0Var2;
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
                if (this.f33921f1 != 0) {
                    if (objArr3 != null) {
                        m5(true);
                    }
                    if ((intValue & MessagesController.UPDATE_MASK_PHONE) != 0 && (ly0Var2 = this.f33882a) != null && (wl0Var = (org.telegram.ui.Components.wl0) ly0Var2.L(this.H3, false)) != null) {
                        this.d.v(wl0Var, this.H3);
                    }
                } else if (this.f33928g1 != 0) {
                    if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) != 0) {
                        if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0) {
                            i5(true, false);
                        } else {
                            l5(true);
                        }
                        m5(true);
                    }
                    if (objArr3 != null && (ly0Var = this.f33882a) != null) {
                        int childCount = ly0Var.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = this.f33882a.getChildAt(i13);
                            if (childAt instanceof org.telegram.ui.Cells.wa) {
                                ((org.telegram.ui.Cells.wa) childAt).i(intValue);
                            }
                        }
                    }
                }
            } else if (i10 == NotificationCenter.chatOnlineCountDidLoad) {
                Long l4 = (Long) objArr[0];
                if (this.f34032v2 != null && (chat = this.F2) != null && chat.f20343id == l4.longValue()) {
                    this.f34032v2.online_count = ((Integer) objArr[1]).intValue();
                    l5(true);
                    m5(false);
                }
            } else if (i10 != NotificationCenter.contactsDidLoad && i10 != NotificationCenter.channelRightsUpdated) {
                if (i10 == NotificationCenter.encryptedChatCreated) {
                    if (this.f33956k1) {
                        AndroidUtilities.runOnUIThread(new mv0(7, this, objArr));
                    }
                } else if (i10 == NotificationCenter.encryptedChatUpdated) {
                    TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                    TLRPC.EncryptedChat encryptedChat2 = this.E2;
                    if (encryptedChat2 != null && encryptedChat.f20351id == encryptedChat2.f20351id) {
                        this.E2 = encryptedChat;
                        i5(false, false);
                        FlagSecureReason flagSecureReason = this.Y1;
                        if (flagSecureReason != null) {
                            flagSecureReason.invalidate();
                        }
                    }
                } else if (i10 == NotificationCenter.blockedUsersDidLoad) {
                    boolean z14 = this.l1;
                    if (getMessagesController().blockePeers.indexOfKey(this.f33921f1) >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.l1 = z11;
                    if (z14 != z11) {
                        F3(true);
                        i5(false, false);
                    }
                } else if (i10 == NotificationCenter.groupCallUpdated) {
                    Long l10 = (Long) objArr[0];
                    if (this.F2 != null) {
                        long longValue = l10.longValue();
                        TLRPC.Chat chat2 = this.F2;
                        if (longValue == chat2.f20343id && ChatObject.canManageCalls(chat2)) {
                            TLRPC.ChatFull chatFull4 = MessagesController.getInstance(this.currentAccount).getChatFull(l10.longValue());
                            if (chatFull4 != null) {
                                TLRPC.ChatFull chatFull5 = this.f34032v2;
                                if (chatFull5 != null) {
                                    chatFull4.participants = chatFull5.participants;
                                }
                                this.f34032v2 = chatFull4;
                            }
                            rz0 rz0Var = this.O;
                            if (rz0Var != null) {
                                rz0Var.setChatInfo(this.f34032v2);
                            }
                            TLRPC.ChatFull chatFull6 = this.f34032v2;
                            if (chatFull6 != null && (((inputGroupCall = chatFull6.call) == null && !this.f33995q1) || (inputGroupCall != null && this.f33995q1))) {
                                F3(false);
                            }
                            yy0 yy0Var = this.f34030v0;
                            if (yy0Var != null && (chatFull3 = this.f34032v2) != null) {
                                yy0Var.setStories(chatFull3.stories);
                            }
                            ai.j1 j1Var = this.f34038w0;
                            if (j1Var != null) {
                                j1Var.a();
                            }
                            vy0 vy0Var = this.f33920f0;
                            if (vy0Var != null) {
                                vy0Var.setHasStories(l4());
                            }
                            if (l10.longValue() != 0) {
                                z12 = (BuildVars.IS_BILLING_UNAVAILABLE || getMessagesController().premiumPurchaseBlocked() || (chatFull2 = this.f34032v2) == null || !chatFull2.stargifts_available) ? false : false;
                                this.U0.I(38, z12);
                                org.telegram.ui.Components.ci0 ci0Var = this.f33883a0;
                                if (ci0Var != null) {
                                    ci0Var.o(3, z12);
                                }
                            }
                        }
                    }
                } else if (i10 == NotificationCenter.chatInfoDidLoad) {
                    TLRPC.ChatFull chatFull7 = (TLRPC.ChatFull) objArr[0];
                    if (this.f33921f1 != 0 && (user = getMessagesController().getUser(Long.valueOf(this.f33921f1))) != null && chatFull7.f20344id == user.linked_community_id) {
                        i5(true, false);
                    }
                    TLRPC.Chat chat3 = this.F2;
                    if (chat3 != null && chatFull7.f20344id == chat3.linked_community_id) {
                        i5(true, false);
                    }
                    if (chatFull7.f20344id == this.f33928g1) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        TLRPC.ChatFull chatFull8 = this.f34032v2;
                        if ((chatFull8 instanceof TLRPC.TL_channelFull) && chatFull7.participants == null) {
                            chatFull7.participants = chatFull8.participants;
                        }
                        if (chatFull8 == null && (chatFull7 instanceof TLRPC.TL_channelFull)) {
                            objArr2 = 1;
                        } else {
                            objArr2 = null;
                        }
                        this.f34032v2 = chatFull7;
                        if (this.f33975n1 == 0) {
                            long j10 = chatFull7.migrated_from_chat_id;
                            if (j10 != 0) {
                                this.f33975n1 = -j10;
                                getMediaDataController().getMediaCount(this.f33975n1, this.f33935h1, 0, this.classGuid, true);
                            }
                        }
                        N3();
                        wy0 wy0Var = this.f33981o0;
                        if (wy0Var != null && !this.f34002r1) {
                            wy0Var.setChatInfo(this.f34032v2);
                        }
                        i5(true, false);
                        TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(this.f33928g1));
                        if (chat4 != null) {
                            this.F2 = chat4;
                            F3(true);
                        }
                        FlagSecureReason flagSecureReason2 = this.Y1;
                        if (flagSecureReason2 != null) {
                            flagSecureReason2.invalidate();
                        }
                        if (this.F2.megagroup && (objArr2 != null || !booleanValue)) {
                            T3(true);
                        }
                        X4();
                        r5();
                        yy0 yy0Var2 = this.f34030v0;
                        if (yy0Var2 != null && (chatFull = this.f34032v2) != null) {
                            yy0Var2.setStories(chatFull.stories);
                        }
                        ai.j1 j1Var2 = this.f34038w0;
                        if (j1Var2 != null) {
                            j1Var2.a();
                        }
                        vy0 vy0Var2 = this.f33920f0;
                        if (vy0Var2 != null) {
                            vy0Var2.setHasStories(l4());
                        }
                        rz0 rz0Var2 = this.O;
                        if (rz0Var2 != null) {
                            rz0Var2.setChatInfo(this.f34032v2);
                        }
                    }
                } else if (i10 == NotificationCenter.closeChats) {
                    removeSelfFromStack(true);
                } else if (i10 == NotificationCenter.closeProfileActivity) {
                    long longValue2 = ((Long) objArr[0]).longValue();
                    boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                    if (longValue2 == a() && (h5Var = this.parentLayout) != null && h5Var.getFragmentStack().contains(this)) {
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
                    if (botInfo.user_id == this.f33921f1) {
                        this.G2 = botInfo;
                        i5(false, false);
                    }
                } else if (i10 == NotificationCenter.userInfoDidLoad) {
                    if (((Long) objArr[0]).longValue() == this.f33921f1) {
                        TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                        this.f34040w2 = userFull;
                        org.telegram.ui.Components.hx0 hx0Var = this.T;
                        if (hx0Var != null) {
                            hx0Var.set(userFull.stars_rating);
                        }
                        yy0 yy0Var3 = this.f34030v0;
                        if (yy0Var3 != null) {
                            yy0Var3.setStories(this.f34040w2.stories);
                        }
                        ai.j1 j1Var3 = this.f34038w0;
                        if (j1Var3 != null) {
                            j1Var3.a();
                        }
                        vy0 vy0Var3 = this.f33920f0;
                        if (vy0Var3 != null) {
                            vy0Var3.setHasStories(l4());
                        }
                        rz0 rz0Var3 = this.O;
                        if (rz0Var3 != null) {
                            rz0Var3.setUserInfo(this.f34040w2);
                        }
                        if (this.f34001r0 != null) {
                            if (this.d != null && !TextUtils.equals(this.f34040w2.about, this.A2)) {
                                this.d.m(this.X2);
                            }
                            if (this.f34017t1) {
                                i5(false, false);
                            }
                        } else {
                            if (!this.H1 && !this.L0) {
                                F3(true);
                            } else {
                                this.J1 = true;
                            }
                            i5(false, false);
                            rz0 rz0Var4 = this.O;
                            if (rz0Var4 != null) {
                                rz0Var4.setCommonGroupsCount(this.f34040w2.common_chats_count);
                                R();
                                org.telegram.ui.Components.pv0 pv0Var = this.R;
                                if (pv0Var == null || pv0Var.f29682y) {
                                    resumeDelayedFragmentAnimation();
                                    m4(true);
                                }
                            }
                        }
                        X4();
                        r5();
                        if (this.f34048x2 == null && !j4()) {
                            org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(this.currentAccount);
                            this.f34048x2 = g6Var;
                            ib0 ib0Var = new ib0(this, 15);
                            if (g6Var.f22412c) {
                                ib0Var.run();
                            } else {
                                g6Var.h.add(ib0Var);
                            }
                            this.f34048x2.d(this.f34040w2);
                        }
                        if (!j4()) {
                            u01 u01Var = this.f34062z2;
                            u01 c10 = u01.c(this.currentAccount, this.f34040w2, u01Var);
                            this.f34062z2 = c10;
                            if (c10 != u01Var) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f34056y2 = z10;
                            if (c10 != null) {
                                ib0 ib0Var2 = new ib0(this, 16);
                                if (c10.f42122b) {
                                    ib0Var2.run();
                                } else {
                                    c10.h.add(ib0Var2);
                                }
                            }
                        }
                        if (this.U0 != null) {
                            if (g4()) {
                                this.U0.K(44);
                            } else {
                                this.U0.r(44);
                            }
                            TLRPC.UserFull userFull2 = this.f34040w2;
                            if (!userFull2.noforwards_my_enabled && !userFull2.noforwards_peer_enabled) {
                                z13 = true;
                            }
                            this.U0.I(46, z13);
                            this.U0.I(47, !z13);
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
                                    if (this.E2 != null) {
                                        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                                        if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (f01Var = this.d) != null) {
                                            f01Var.l();
                                        }
                                    }
                                }
                            }
                        }
                    } else if (i10 == NotificationCenter.emojiLoaded) {
                        ly0 ly0Var3 = this.f33882a;
                        if (ly0Var3 != null) {
                            ly0Var3.g1();
                        }
                    } else if (i10 == NotificationCenter.reloadInterface) {
                        i5(false, false);
                    } else if (i10 == NotificationCenter.newSuggestionsAvailable) {
                        int i15 = this.f33908d3;
                        int i16 = this.f33893b3;
                        int i17 = this.Z2;
                        n5();
                        f01 f01Var2 = this.d;
                        if (f01Var2 != null) {
                            if (i15 != this.f33908d3 || i16 != this.f33893b3 || i17 != this.Z2) {
                                f01Var2.l();
                            }
                        }
                    } else if (i10 == NotificationCenter.topicsDidLoaded) {
                        if (this.f34002r1) {
                            m5(false);
                        }
                    } else if (i10 == NotificationCenter.updateSearchSettings) {
                        q01 q01Var = this.e;
                        if (q01Var != null) {
                            q01Var.f40595c = q01.H(this);
                            this.e.v.clear();
                            this.e.J();
                            q01 q01Var2 = this.e;
                            q01Var2.I(q01Var2.f40602y);
                        }
                    } else if (i10 == NotificationCenter.reloadDialogPhotos) {
                        m5(false);
                    } else if (i10 != NotificationCenter.storiesUpdated && i10 != NotificationCenter.storiesReadUpdated) {
                        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
                            org.telegram.ui.ActionBar.u0 u0Var = this.U0;
                            if (u0Var != null) {
                                u0Var.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.f33921f1)));
                            }
                            a5();
                        } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                            a5();
                        } else if (i10 == NotificationCenter.starBalanceUpdated) {
                            i5(false, false);
                        } else if (i10 == NotificationCenter.botStarsUpdated) {
                            i5(false, false);
                        } else if (i10 == NotificationCenter.botStarsTransactionsLoaded) {
                            i5(false, false);
                        } else if (i10 == NotificationCenter.dialogDeleted) {
                            if (a() == ((Long) objArr[0]).longValue()) {
                                org.telegram.ui.ActionBar.h5 h5Var2 = this.parentLayout;
                                if (h5Var2 != null && h5Var2.getLastFragment() == this) {
                                    finishFragment();
                                } else {
                                    removeSelfFromStack();
                                }
                            }
                        } else if (i10 == NotificationCenter.channelRecommendationsLoaded) {
                            long longValue3 = ((Long) objArr[0]).longValue();
                            if (this.L4 < 0 && longValue3 == a()) {
                                n5();
                                R();
                                f01 f01Var3 = this.d;
                                if (f01Var3 != null) {
                                    f01Var3.l();
                                }
                            }
                        } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
                            if (((Long) objArr[0]).longValue() == a() && !j4()) {
                                if (this.L4 < 0) {
                                    n5();
                                    R();
                                    f01 f01Var4 = this.d;
                                    if (f01Var4 != null) {
                                        f01Var4.l();
                                    }
                                    AndroidUtilities.runOnUIThread(new ib0(this, 17));
                                    return;
                                }
                                rz0 rz0Var5 = this.O;
                                if (rz0Var5 != null) {
                                    rz0Var5.A1(true);
                                }
                            }
                        } else if (i10 == NotificationCenter.profileMusicUpdated) {
                            if (((Long) objArr[0]).longValue() == a() && this.f33921f1 > 0) {
                                TLRPC.UserFull userFull3 = getMessagesController().getUserFull(this.f33921f1);
                                if (userFull3 != null) {
                                    this.f34040w2 = userFull3;
                                }
                                n5();
                                R();
                                ly0 ly0Var4 = this.f33882a;
                                if (ly0Var4 != null && ly0Var4.b0()) {
                                    this.f33882a.post(new ib0(this, 19));
                                    return;
                                }
                                f01 f01Var5 = this.d;
                                if (f01Var5 != null) {
                                    f01Var5.l();
                                }
                            }
                        } else if (i10 == NotificationCenter.updatedChatRanks) {
                            long longValue4 = ((Long) objArr[0]).longValue();
                            long longValue5 = ((Long) objArr[1]).longValue();
                            TLRPC.Chat chat5 = this.F2;
                            if (chat5 != null && chat5.f20343id == longValue4) {
                                String str = (String) objArr[2];
                                a0.h hVar = this.D1;
                                if (hVar != null && (chatParticipant = (TLRPC.ChatParticipant) hVar.f(longValue5)) != null) {
                                    chatParticipant.setRank(longValue5, str);
                                }
                                TLRPC.ChannelParticipant channelParticipant = this.H2;
                                if (channelParticipant != null && channelParticipant.user_id == longValue5) {
                                    channelParticipant.rank = str;
                                }
                                while (true) {
                                    ArrayList arrayList2 = this.S4;
                                    if (i12 < arrayList2.size()) {
                                        ((TLRPC.ChatParticipant) arrayList2.get(i12)).setRank(longValue5, str);
                                        i12++;
                                    } else {
                                        AndroidUtilities.updateVisibleRows(this.f33882a);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        vy0 vy0Var4 = this.f33920f0;
                        if (vy0Var4 != null) {
                            vy0Var4.setHasStories(l4());
                            this.f33920f0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(e4(), 0.0f, this.f33963l2));
                        }
                        yy0 yy0Var4 = this.f34030v0;
                        if (yy0Var4 != null) {
                            TLRPC.UserFull userFull4 = this.f34040w2;
                            if (userFull4 != null) {
                                yy0Var4.setStories(userFull4.stories);
                                return;
                            }
                            TLRPC.ChatFull chatFull9 = this.f34032v2;
                            if (chatFull9 != null) {
                                yy0Var4.setStories(chatFull9.stories);
                            }
                        }
                    }
                }
            } else {
                F3(true);
            }
        } else if (ChatObject.isBoostSupported(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f33928g1)))) {
            getMessagesController().getStoriesController().k(a(), new ci.e(19), false, this.A0);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.e50 e50Var = this.f34001r0;
        if (e50Var != null && e50Var.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.e50 e50Var = this.f34001r0;
        if ((e50Var == null || dialog != e50Var.f25854c) && super.dismissDialogOnPause(dialog)) {
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

    public final int e4() {
        float f7;
        if (this.f34002r1) {
            return 0;
        }
        if (this.f33928g1 != 0 && ChatObject.isForum(getMessagesController().getChat(Long.valueOf(this.f33928g1)))) {
            if (l4()) {
                f7 = 24.0f;
            } else {
                f7 = 38.0f;
            }
            return AndroidUtilities.dp(f7);
        }
        return AndroidUtilities.dp(50.0f);
    }

    public final void e5() {
        if (!this.f34002r1 && ChatObject.isForum(this.F2)) {
            getNotificationsController().loadTopicsNotificationsExceptions(-this.f33928g1, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    ProfileActivity profileActivity = ProfileActivity.this;
                    HashSet hashSet = profileActivity.f33953j5;
                    ArrayList arrayList = new ArrayList((HashSet) obj);
                    int i10 = 0;
                    while (i10 < arrayList.size()) {
                        if (profileActivity.getMessagesController().getTopicsController().findTopic(profileActivity.f33928g1, ((Integer) arrayList.get(i10)).intValue()) == null) {
                            arrayList.remove(i10);
                            i10--;
                        }
                        i10++;
                    }
                    hashSet.clear();
                    hashSet.addAll(arrayList);
                    profileActivity.k5(true);
                }

                public Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override
    public final org.telegram.ui.Components.mm0 f() {
        return this.f33882a;
    }

    public final org.telegram.ui.Components.as f4(int i10) {
        MessagesController.PeerColor peerColor;
        int color3;
        float f7;
        org.telegram.ui.Components.as[] asVarArr = this.J;
        if (asVarArr[i10] == null) {
            Drawable mutate = org.telegram.ui.ActionBar.k6.Q1.getConstantState().newDrawable().mutate();
            Drawable[] drawableArr = this.f34053y;
            drawableArr[i10] = mutate;
            Drawable mutate2 = org.telegram.ui.ActionBar.k6.R1.getConstantState().newDrawable().mutate();
            Drawable[] drawableArr2 = this.I;
            drawableArr2[i10] = mutate2;
            if (i10 == 1 && (peerColor = this.S5) != null) {
                if (peerColor.hasColor6(org.telegram.ui.ActionBar.k6.I.q())) {
                    color3 = this.S5.getColor5();
                } else {
                    color3 = this.S5.getColor3();
                }
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f7 = -0.1f;
                } else {
                    f7 = -0.08f;
                }
                int b10 = org.telegram.ui.ActionBar.k6.b(0.1f, f7, color3);
                Drawable drawable = drawableArr[1];
                int offsetColor = AndroidUtilities.getOffsetColor(b10, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oi, this.A0), this.G5, 1.0f);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(offsetColor, mode);
                drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(-1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21183d6, this.A0), this.G5, 1.0f), mode);
            }
            asVarArr[i10] = new org.telegram.ui.Components.as(new org.telegram.ui.Components.yq(drawableArr[i10], drawableArr2[i10]), getParentActivity().getDrawable(R.drawable.verified_profile));
        }
        return asVarArr[i10];
    }

    public final void f5(float f7) {
        g01 g01Var;
        ValueAnimator valueAnimator;
        if (this.f33996q2 || ((g01Var = this.N) != null && (valueAnimator = g01Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.N.getLayoutParams();
            layoutParams.width = this.f33882a.getMeasuredWidth();
            layoutParams.height = (int) (this.R1 + f7);
            this.N.requestLayout();
        }
        t01 t01Var = this.f33913e1;
        if (t01Var != null) {
            t01Var.E.setTranslate(0.0f, this.f33892b2 - t01Var.f41854x);
            t01 t01Var2 = this.f33913e1;
            RadialGradient radialGradient = t01Var2.f41855y;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(t01Var2.E);
            }
            this.f33913e1.invalidate();
        }
        d5();
        W4();
        j5();
    }

    @Override
    public final TLRPC.Chat g() {
        return this.F2;
    }

    public final boolean g4() {
        TLRPC.UserFull userFull;
        TL_bots.BotInfo botInfo;
        int i10 = 0;
        if (!this.f34011s2 || (userFull = this.f34040w2) == null || (botInfo = userFull.bot_info) == null) {
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

    public final void g5() {
        TLRPC.User user;
        boolean z10;
        int i10;
        int i11;
        if (this.f34017t1 && this.Y0 != null && this.X0 != null && (user = getMessagesController().getUser(Long.valueOf(this.f33921f1))) != null) {
            int i12 = 0;
            if (UserObject.getPublicUsername(user) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.e1 e1Var = this.Y0;
            if (z10) {
                i10 = R.drawable.menu_username_change;
            } else {
                i10 = R.drawable.menu_username_set;
            }
            e1Var.setIcon(i10);
            org.telegram.ui.ActionBar.e1 e1Var2 = this.Y0;
            if (z10) {
                i11 = R.string.ProfileUsernameEdit;
            } else {
                i11 = R.string.ProfileUsernameSet;
            }
            e1Var2.setText(LocaleController.getString(i11));
            org.telegram.ui.ActionBar.e1 e1Var3 = this.X0;
            if (UserObject.getPublicUsername(user) == null) {
                i12 = 8;
            }
            e1Var3.setVisibility(i12);
        }
    }

    public float getAvatarAnimationProgress() {
        return this.T1;
    }

    @Override
    public final mu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.A0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.A0 != null) {
            return null;
        }
        i6 i6Var = new i6(19, this);
        ArrayList arrayList = new ArrayList();
        rz0 rz0Var = this.O;
        if (rz0Var != null) {
            arrayList.addAll(rz0Var.getThemeDescriptions());
        }
        org.telegram.ui.Components.fp0 fp0Var = this.f34008s;
        if (fp0Var != null) {
            TextView textView = fp0Var.getTextView();
            int i10 = org.telegram.ui.ActionBar.k6.Pi;
            arrayList.add(new org.telegram.ui.ActionBar.t6(textView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, i6Var, i10));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34008s.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, i6Var, i10));
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33913e1, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21125a7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33920f0, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f33994q0}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21185d8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.v, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21545wh));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.v, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21564xh));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.v, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21580yh));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33882a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21553x6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33882a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21404p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33882a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21386o6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33882a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21499u6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33882a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21516v6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33882a, 0, new Class[]{org.telegram.ui.Cells.a7.class}, new String[]{"detailTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21588z6));
        int i11 = org.telegram.ui.ActionBar.k6.Sh;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33882a, 0, new Class[]{org.telegram.ui.Cells.a7.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33882a, 131072, new Class[]{org.telegram.ui.Cells.a7.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        int i13 = org.telegram.ui.ActionBar.k6.Qh;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33882a, 196608, new Class[]{org.telegram.ui.Cells.a7.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33882a, 0, new Class[]{org.telegram.ui.Cells.a7.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33882a, 131072, new Class[]{org.telegram.ui.Cells.a7.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33882a, 196608, new Class[]{org.telegram.ui.Cells.a7.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33882a, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33882a, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33882a, 0, new Class[]{org.telegram.ui.Cells.wa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.f21366n6));
        boolean z10 = this.H5;
        org.telegram.ui.ActionBar.n5[] n5VarArr = this.f33919f;
        if (z10) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(n5VarArr[1], 0, (Class[]) null, (Paint) null, this.I, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Oi));
            arrayList.add(new org.telegram.ui.ActionBar.t6(n5VarArr[1], 0, (Class[]) null, (Paint) null, this.f34053y, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21183d6));
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(n5VarArr[1], 0, (Class[]) null, (Paint) null, this.I, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ah));
        arrayList.add(new org.telegram.ui.ActionBar.t6(n5VarArr[1], 0, (Class[]) null, (Paint) null, this.f34053y, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21598zh));
        return arrayList;
    }

    @Override
    public final int getThemedColor(int i10) {
        return org.telegram.ui.ActionBar.k6.w0(i10, this.A0);
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable;
        org.telegram.ui.ActionBar.g6 g6Var = this.A0;
        if (g6Var != null) {
            drawable = g6Var.getDrawable(str);
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

    public final void h4() {
        boolean z10;
        Point point = new Point();
        getParentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33983o2 = z10;
    }

    public final void h5() {
        i5(false, false);
    }

    public final boolean i4() {
        if (this.F2 != null) {
            return getMessagesController().isChatNoForwards(this.F2);
        }
        return getMessagesController().isUserNoForwards(this.f34040w2);
    }

    public final void i5(boolean z10, boolean z11) {
        if (this.d == null) {
            if (z10) {
                l5(false);
            }
            n5();
        } else if (!z11 && this.f33882a.isInLayout()) {
            ly0 ly0Var = this.f33882a;
            if (!ly0Var.G) {
                return;
            }
            ly0Var.post(new org.telegram.ui.Components.b60(14, this, z10));
        } else {
            tz0 tz0Var = new tz0(this);
            tz0Var.f42112b = this.O2;
            tz0Var.f(tz0Var.f42113c);
            tz0Var.e.clear();
            tz0Var.f42114f.clear();
            tz0Var.e.addAll(this.S4);
            tz0Var.f42114f.addAll(this.T4);
            tz0Var.f42115g = this.f34034v4;
            tz0Var.h = this.f34042w4;
            if (z10) {
                l5(false);
            }
            H4();
            n5();
            tz0Var.f(tz0Var.d);
            try {
                s4.o.c(tz0Var, true).c(this.d);
            } catch (Exception e) {
                FileLog.e(e);
                this.d.l();
            }
            int i10 = this.W5;
            if (i10 >= 0) {
                this.f33897c.h1(i10, this.X5 - this.f33882a.getPaddingTop());
            }
            AndroidUtilities.updateVisibleRows(this.f33882a);
        }
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.f33996q2;
    }

    @Override
    public final boolean isLightStatusBar() {
        int w02;
        if (!this.f33996q2) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null && kVar.s()) {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21537w8, this.A0);
            } else if (this.H5) {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21183d6, this.A0);
            } else {
                MessagesController.PeerColor peerColor = this.S5;
                if (peerColor != null) {
                    w02 = peerColor.getBgColor2(org.telegram.ui.ActionBar.k6.I.q());
                } else {
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21462s8, this.A0);
                }
            }
            if (i0.a.h(w02) > 0.699999988079071d) {
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
        if (this.f34001r0 != null && !this.f34017t1) {
            return true;
        }
        return false;
    }

    public final void j5() {
        int i10;
        if (this.f33898c0 != null && this.f34000r[1] != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int i11 = currentActionBarHeight + i10;
            boolean z10 = this.H1;
            if (z10 && this.K1 == 2 && this.Y != null) {
                this.f33898c0.setAlpha(this.T1);
                this.f33898c0.h(AndroidUtilities.dp(74.0f) + this.f33882a.getMeasuredWidth(), Q3() - AndroidUtilities.dp(74.0f));
                return;
            }
            if (z10) {
                this.f33898c0.setAlpha(this.T1);
            }
            float f7 = i11;
            float dp = this.R1 + f7 + AndroidUtilities.dp(74.0f);
            float min = Math.min(Q3(), dp - f7);
            this.f33898c0.h(dp - min, min - AndroidUtilities.dp(74.0f));
        }
    }

    public final void k4(boolean z10) {
        boolean z11;
        boolean isForum = ChatObject.isForum(this.F2);
        TLRPC.Chat chat = this.F2;
        if (!isForum && !z10 && (chat == null || !chat.creator)) {
            z11 = false;
        } else {
            z11 = true;
        }
        org.telegram.ui.Components.f5.s(this, false, chat, null, false, z11, z10, !isForum, new qx0(this, 2));
    }

    public final void k5(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.k5(boolean):void");
    }

    public final boolean l4() {
        if (getMessagesController().getStoriesController().I(a()) && !this.f34002r1) {
            return true;
        }
        return false;
    }

    public final void l5(boolean z10) {
        int i10;
        TLRPC.UserStatus userStatus;
        boolean z11;
        int i11 = 0;
        this.C2 = 0;
        int currentTime = getConnectionsManager().getCurrentTime();
        this.D2.clear();
        TLRPC.ChatFull chatFull = this.f34032v2;
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z11 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (z11 && chatFull.participants_count > 200) {
                this.C2 = chatFull.online_count;
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (i11 < this.f34032v2.participants.participants.size()) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f34032v2.participants.participants.get(i11).user_id));
            if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.f20490id == getUserConfig().getClientUserId()) && user.status.expires > 10000)) {
                this.C2++;
            }
            this.D2.add(Integer.valueOf(i11));
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
            Collections.sort(this.D2, Comparator$EL.reversed(Comparator$CC.comparingInt(new cf(arrayList, 1))));
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (z10 && this.d != null && this.f34034v4 > 0) {
            AndroidUtilities.updateVisibleRows(this.f33882a);
        }
        if (this.O != null && this.L4 != -1) {
            if ((this.D2.size() > 5 || this.U4 == 2) && this.U4 != 1) {
                this.O.d1(this.D2, this.f34032v2);
            }
        }
    }

    public final void m4(boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.m4(boolean):void");
    }

    public final void m5(boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.m5(boolean):void");
    }

    public final void n4(int r13, float r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.n4(int, float, boolean):void");
    }

    public final void n5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.n5():void");
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.K1 == 0) {
            return true;
        }
        return false;
    }

    public final void o5() {
        ImageView imageView;
        TLRPC.Chat chat;
        if (this.f33955k0 != null && (imageView = this.f33962l0) != null) {
            if (this.M1 && (chat = this.F2) != null && (chat.flags2 & 2048) != 0) {
                imageView.setTag(1);
                this.f33962l0.setVisibility(0);
                this.f33955k0.setTag(1);
                this.f33955k0.setVisibility(0);
                return;
            }
            imageView.setTag(null);
            this.f33962l0.setVisibility(8);
            this.f33955k0.setTag(null);
            this.f33955k0.setVisibility(8);
        }
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.e50 e50Var = this.f34001r0;
        if (e50Var != null) {
            e50Var.h(i10, i11, intent);
        }
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.M;
        if (undoView != null) {
            undoView.d(0, true);
        }
        super.onBecomeFullyHidden();
        this.Z5 = false;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        u5();
        this.Z5 = true;
        H3();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        View m10;
        org.telegram.ui.Components.vi0 vi0Var;
        org.telegram.ui.Components.ci0 ci0Var;
        super.onConfigurationChanged(configuration);
        rz0 rz0Var = this.O;
        if (rz0Var != null) {
            rz0Var.onConfigurationChanged(configuration);
        }
        h4();
        if (this.f33983o2 && (ci0Var = this.f33883a0) != null) {
            ci0Var.i();
        }
        if (this.f33983o2 && (vi0Var = this.f33898c0) != null) {
            vi0Var.c();
        }
        if (this.f33983o2 && this.f33996q2 && (m10 = this.f33897c.m(0)) != null) {
            this.f33882a.scrollBy(0, m10.getTop() - V3());
        }
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new vh(this, 5));
    }

    @Override
    public final android.animation.AnimatorSet onCustomTransitionAnimation(boolean r23, java.lang.Runnable r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onCustomTransitionAnimation(boolean, java.lang.Runnable):android.animation.AnimatorSet");
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        ly0 ly0Var = this.f33882a;
        if (ly0Var != null) {
            ly0Var.g1();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        rz0 rz0Var = this.O;
        if (rz0Var != null) {
            rz0Var.I0();
        }
        org.telegram.ui.Components.pv0 pv0Var = this.R;
        if (pv0Var != null) {
            pv0Var.b(this);
        }
        org.telegram.ui.Components.pv0 pv0Var2 = this.R;
        if (pv0Var2 != null) {
            pv0Var2.f29681x.remove(this);
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
        wy0 wy0Var = this.f33981o0;
        if (wy0Var != null) {
            wy0Var.K();
        }
        org.telegram.ui.Components.fi0 fi0Var = this.f33974n0;
        if (fi0Var != null) {
            fi0Var.e();
        }
        this.L5 = null;
        if (this.f33921f1 != 0) {
            getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
            getNotificationCenter().removeObserver(this, NotificationCenter.contactsDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatCreated);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.blockedUsersDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.botInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.reloadInterface);
            getMessagesController().cancelLoadFullUser(this.f33921f1);
        } else if (this.f33928g1 != 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.uploadStoryEnd);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatOnlineCountDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.channelRightsUpdated);
        }
        vy0 vy0Var = this.f33920f0;
        if (vy0Var != null) {
            vy0Var.setImageDrawable(null);
        }
        org.telegram.ui.Components.e50 e50Var = this.f34001r0;
        if (e50Var != null) {
            e50Var.d();
        }
        az0 az0Var = this.X4;
        if (az0Var != null) {
            az0Var.b();
        }
        u01 u01Var = this.f34062z2;
        if (u01Var != null && this.f34056y2) {
            u01Var.b(true);
            this.f34062z2 = null;
        }
        org.telegram.messenger.s8 s8Var = this.f34065z5;
        if (s8Var != null) {
            this.f34065z5 = null;
            AndroidUtilities.runOnUIThread(s8Var);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onPause() {
        org.telegram.ui.Components.du0 du0Var;
        super.onPause();
        UndoView undoView = this.M;
        if (undoView != null) {
            undoView.d(0, true);
        }
        org.telegram.ui.Components.e50 e50Var = this.f34001r0;
        if (e50Var != null) {
            e50Var.i();
        }
        FlagSecureReason flagSecureReason = this.Y1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        rz0 rz0Var = this.O;
        if (rz0Var != null && (du0Var = rz0Var.T) != null) {
            du0Var.e = false;
            if (du0Var.f42479c != null) {
                du0Var.f42477a.onPause();
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
        org.telegram.ui.Components.e50 e50Var = this.f34001r0;
        if (e50Var != null) {
            e50Var.j(i10, strArr, iArr);
        }
        if (i10 != 101 && i10 != 102) {
            if (i10 == 103 && this.F2 != null) {
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
                    ChatObject.Call groupCall = getMessagesController().getGroupCall(this.f33928g1, false);
                    TLRPC.Chat chat = this.F2;
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
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f33921f1));
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
            TLRPC.UserFull userFull = this.f34040w2;
            if (userFull != null && userFull.video_calls_available) {
                z12 = true;
            } else {
                z12 = false;
            }
            org.telegram.ui.Components.voip.d2.m(user, z11, z12, getParentActivity(), this.f34040w2, getAccountInstance());
            return;
        }
        org.telegram.ui.Components.voip.d2.h(getParentActivity(), null, i10);
    }

    @Override
    public final void onResume() {
        TLRPC.User user;
        e50 e50Var;
        super.onResume();
        rz0 rz0Var = this.O;
        if (rz0Var != null) {
            rz0Var.f32663b1 = true;
            org.telegram.ui.Components.cu0 cu0Var = rz0Var.H;
            if (cu0Var != null) {
                cu0Var.l();
            }
            org.telegram.ui.Components.kv0 kv0Var = rz0Var.K;
            if (kv0Var != null) {
                kv0Var.l();
            }
            org.telegram.ui.Components.lv0 lv0Var = rz0Var.J;
            if (lv0Var != null) {
                lv0Var.X(false);
            }
            for (int i10 = 0; i10 < rz0Var.f32687k0.length; i10++) {
                rz0Var.V(i10);
            }
            org.telegram.ui.Components.du0 du0Var = rz0Var.T;
            if (du0Var != null) {
                du0Var.e = true;
                if (du0Var.f42479c != null) {
                    du0Var.f42477a.onResume();
                }
            }
        }
        h4();
        f01 f01Var = this.d;
        if (f01Var != null) {
            this.V4 = true;
            f01Var.l();
        }
        if (!((ActionBarLayout) this.parentLayout).x() && (e50Var = this.U) != null && e50Var.getVisibility() == 0) {
            this.U.setVisibility(8);
            this.U.setBackground(null);
        }
        org.telegram.ui.Components.e50 e50Var2 = this.f34001r0;
        if (e50Var2 != null) {
            e50Var2.k();
            setParentActivityTitle(LocaleController.getString(R.string.Settings));
        }
        m5(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new vh(this, 5));
        }
        org.telegram.ui.ActionBar.n5 n5Var = this.f33919f[1];
        if (n5Var != null) {
            setParentActivityTitle(n5Var.getText());
        }
        if (this.f33921f1 != 0 && (user = getMessagesController().getUser(Long.valueOf(this.f33921f1))) != null && user.photo == null && this.R1 >= V3()) {
            this.f33957k2.cancel();
            float[] fArr = this.f33976n2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            L4(1.0f);
            this.f33981o0.setVisibility(8);
            this.R1 = V3();
            this.f33990p2 = false;
            this.f33897c.h1(0, V3() - this.f33882a.getPaddingTop());
        }
        FlagSecureReason flagSecureReason = this.Y1;
        if (flagSecureReason != null) {
            flagSecureReason.attach();
        }
        g5();
        m4(false);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.f34029u6.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21183d6, this.A0));
            this.f34060z0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21272i6, this.A0));
            V4();
            q5();
            y3();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            if (!z11) {
                int i10 = this.K1;
                if (i10 != 0 && this.N1) {
                    if (i10 == 1) {
                        this.f33963l2 = 0.0f;
                        org.telegram.ui.Components.hx0 hx0Var = this.T;
                        if (hx0Var != null) {
                            hx0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.ci0 ci0Var = this.f33883a0;
                        if (ci0Var != null) {
                            ci0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.vi0 vi0Var = this.f33898c0;
                        if (vi0Var != null) {
                            vi0Var.setParentExpanded(0.0f);
                        }
                    }
                    this.H1 = false;
                    C3();
                    if (this.J1) {
                        F3(true);
                    }
                }
                if (!this.f33979n5) {
                    this.f33979n5 = true;
                    this.W4 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().onAnimationFinish(this.R4);
            e50 e50Var = this.U;
            if (e50Var != null && e50Var.getVisibility() == 0) {
                this.U.setVisibility(8);
                this.U.setBackground(null);
            }
        }
        this.I1 = false;
        D3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        e50 e50Var = this.U;
        if (e50Var != null && e50Var.getVisibility() == 0) {
            if (z10) {
                this.U.setAlpha(1.0f - f7);
            } else {
                this.U.setAlpha(f7);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        r01 r01Var;
        ImageView imageView;
        org.telegram.ui.Components.ci0 ci0Var;
        super.onTransitionAnimationStart(z10, z11);
        this.O5 = z10;
        if (z10 && (ci0Var = this.f33883a0) != null) {
            ArrayList arrayList = ci0Var.f25337a;
            if (ci0Var.H == 6) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.ui.Components.zh0 zh0Var = (org.telegram.ui.Components.zh0) arrayList.get(i10);
                    org.telegram.ui.Components.yj0 yj0Var = zh0Var.f33232k;
                    if (yj0Var != null) {
                        if (zh0Var.f33225a == 15) {
                            yj0Var.M(14);
                        } else {
                            yj0Var.M(0);
                        }
                        zh0Var.f33232k.start();
                    }
                }
            }
        }
        if (!z10 && (imageView = this.P0) != null && imageView.getTag() != null && (this.P0.getTag() instanceof org.telegram.ui.ActionBar.u0)) {
            ((org.telegram.ui.ActionBar.u0) this.P0.getTag()).setAlpha(1.0f);
        }
        if (((!z10 && z11) || (z10 && !z11)) && this.K1 != 0 && this.N1 && !this.f33996q2) {
            this.H1 = true;
            if (!z10) {
                if (this.L5 == null) {
                    this.L5 = new float[16];
                }
                this.G1 = this.R1;
                this.L5[0] = this.Y.getScaleX();
                this.L5[1] = this.Y.getTranslationX();
                this.L5[2] = this.Y.getTranslationY();
                org.telegram.ui.Components.ci0 ci0Var2 = this.f33883a0;
                if (ci0Var2 != null) {
                    this.L5[3] = ci0Var2.getAlpha();
                }
                ai.j1 j1Var = this.f34038w0;
                if (j1Var != null) {
                    float[] fArr = this.L5;
                    fArr[4] = j1Var.e;
                    fArr[5] = j1Var.f1527f;
                }
                if (this.f33940h6 != null) {
                    this.L5[6] = r01Var.getAlpha();
                }
                float[] fArr2 = this.L5;
                org.telegram.ui.ActionBar.n5[] n5VarArr = this.f33919f;
                fArr2[7] = n5VarArr[1].getScaleX();
                this.L5[8] = n5VarArr[1].getTranslationY();
                float[] fArr3 = this.L5;
                org.telegram.ui.ActionBar.n5[] n5VarArr2 = this.f34000r;
                fArr3[9] = n5VarArr2[1].getTranslationY();
                this.L5[10] = n5VarArr[1].getLayoutParams().width;
                this.L5[11] = this.f33907d2;
                for (int i11 = 0; i11 < n5VarArr.length; i11++) {
                    org.telegram.ui.ActionBar.n5 n5Var = n5VarArr[i11];
                    if (n5Var != null) {
                        int i12 = i11 * 2;
                        this.L5[i12 + 12] = n5Var.getTranslationX();
                        this.L5[i12 + 13] = n5VarArr2[i11].getTranslationX();
                    }
                }
                ei.x3 x3Var = this.f33954j6;
                if (x3Var != null) {
                    x3Var.e(true);
                }
            }
        }
        if (z10) {
            if (this.f34001r0 != null) {
                this.R4 = getNotificationCenter().setAnimationInProgress(this.R4, new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaCountsDidLoad, NotificationCenter.userInfoDidLoad, NotificationCenter.needCheckSystemBarColors});
            } else {
                this.R4 = getNotificationCenter().setAnimationInProgress(this.R4, new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaCountsDidLoad, NotificationCenter.needCheckSystemBarColors});
            }
            if (!z11 && getParentActivity() != null) {
                this.f33887a5 = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.I1 = true;
        D3();
    }

    public final void p4(boolean z10) {
        boolean z11;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f33921f1));
        if (user != null) {
            if (this.f34011s2 && !MessagesController.isSupportUser(user)) {
                if (this.l1 && !z10) {
                    getMessagesController().unblockPeer(this.f33921f1, new ib0(this, 4));
                    finishFragment();
                    return;
                }
                TLRPC.Chat chat = this.F2;
                if (this.E2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.f5.s(this, false, chat, user, z11, true, false, true, new rx0(this, user));
            } else if (this.l1) {
                getMessagesController().unblockPeer(this.f33921f1);
                if (org.telegram.ui.Components.xc.a(this)) {
                    org.telegram.ui.Components.xc.d(this, false).j();
                }
            } else if (this.f33967m1) {
                org.telegram.ui.Components.f5.j0(this, this.f33921f1, user, null, this.E2, false, null, new va(this, 4), this.A0);
            } else {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.A0);
                String string = LocaleController.getString(R.string.BlockUser);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                c2Var.R = string;
                c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new qx0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, this.A0);
                }
            }
        }
    }

    public final void p5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        float f7;
        float f10;
        boolean z11;
        if ((this.f34030v0 != null || this.f34038w0 != null) && (kVar = this.actionBar) != null) {
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
            yy0 yy0Var = this.f34030v0;
            if (yy0Var != null) {
                float z13 = com.google.android.gms.internal.play_billing.k3.z(this.actionBar.getHeight(), f7, 2.0f, f7);
                if (Math.abs(f10 - yy0Var.f34177f0) <= 0.1f && Math.abs(width - yy0Var.f34178g0) <= 0.1f && Math.abs(z13 - yy0Var.f34179h0) <= 0.1f) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                yy0Var.f34177f0 = f10;
                yy0Var.f34178g0 = width;
                if (z10) {
                    yy0Var.m0.d(width, true);
                }
                yy0Var.f34179h0 = z13;
                if (z11) {
                    yy0Var.invalidate();
                }
            }
            ai.j1 j1Var = this.f34038w0;
            if (j1Var != null) {
                float z14 = com.google.android.gms.internal.play_billing.k3.z(this.actionBar.getHeight(), f7, 2.0f, f7);
                int W3 = W3();
                z12 = (Math.abs(f10 - j1Var.f1529r) > 0.1f || Math.abs(width - j1Var.f1530s) > 0.1f || Math.abs(z14 - j1Var.v) > 0.1f) ? true : true;
                j1Var.f1529r = f10;
                j1Var.f1530s = width;
                if (z10) {
                    j1Var.f1533y.d(width, true);
                }
                j1Var.v = z14;
                j1Var.f1532x = W3 + z14;
                if (z12) {
                    j1Var.invalidate();
                }
            }
        }
    }

    public final void q4(boolean z10) {
        boolean z11 = false;
        if (this.f33921f1 != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f33921f1));
            if (user != null) {
                TLRPC.UserFull userFull = this.f34040w2;
                if (userFull != null && userFull.video_calls_available) {
                    z11 = true;
                }
                org.telegram.ui.Components.voip.d2.m(user, z10, z11, getParentActivity(), this.f34040w2, getAccountInstance());
            }
        } else if (this.f33928g1 != 0) {
            if (getMessagesController().getGroupCall(this.f33928g1, false) == null) {
                TLRPC.Chat chat = this.F2;
                AccountInstance accountInstance = getAccountInstance();
                if (getParentActivity() != null) {
                    org.telegram.ui.Components.s80.u(getParentActivity(), -chat.f20343id, accountInstance, new org.telegram.ui.Components.ry(chat, this, accountInstance, 5));
                    return;
                }
                return;
            }
            org.telegram.ui.Components.voip.d2.l(this.F2, null, false, null, getParentActivity(), this, getAccountInstance());
        }
    }

    public final void q5() {
        org.telegram.ui.Components.ns0 ns0Var;
        char c10;
        Drawable drawable;
        Drawable drawable2;
        gh.c[] cVarArr = this.D6;
        if (cVarArr != null) {
            for (gh.c cVar : cVarArr) {
                try {
                    if (cVar != null) {
                        cVar.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21183d6, this.A0));
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            FrameLayout frameLayout = this.f34028u5;
            if (frameLayout != null) {
                frameLayout.invalidate();
            }
        }
        e50 e50Var = this.U;
        if (e50Var != null && (e50Var.getForeground() instanceof ColorDrawable)) {
            ((ColorDrawable) this.U.getForeground()).setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21183d6, this.A0), 100));
        }
        float f7 = this.G5;
        Drawable[] drawableArr = this.f34053y;
        int[] iArr = this.I6;
        if (drawableArr != null && (drawable2 = drawableArr[0]) != null) {
            int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21598zh, this.A0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oi, this.A0), f7, 1.0f);
            O4(drawable2, offsetColor, iArr[0], PorterDuff.Mode.MULTIPLY);
            iArr[0] = offsetColor;
        }
        Drawable[] drawableArr2 = this.I;
        if (drawableArr2 != null && (drawable = drawableArr2[0]) != null) {
            int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ah, this.A0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21183d6, this.A0), f7, 1.0f);
            O4(drawable, offsetColor2, iArr[1], PorterDuff.Mode.MULTIPLY);
            iArr[1] = offsetColor2;
        }
        Drawable[] drawableArr3 = this.E;
        if (drawableArr3 != null) {
            for (int i10 = 0; i10 < drawableArr3.length; i10++) {
                char c11 = 2;
                if (i10 >= 2) {
                    break;
                }
                Drawable drawable3 = drawableArr3[i10];
                if (drawable3 != null) {
                    if (i10 == 0) {
                        c10 = 2;
                    } else {
                        c10 = 6;
                    }
                    int offsetColor3 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21598zh, this.A0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oi, this.A0), f7, 1.0f);
                    if (i10 != 0) {
                        c11 = 6;
                    }
                    O4(drawable3, offsetColor3, iArr[c11], PorterDuff.Mode.MULTIPLY);
                    iArr[c10] = offsetColor3;
                }
            }
        }
        Drawable drawable4 = this.E6;
        if (drawable4 != null) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.V6, this.A0);
            O4(drawable4, w02, iArr[3], PorterDuff.Mode.MULTIPLY);
            iArr[3] = w02;
        }
        Drawable drawable5 = this.F6;
        if (drawable5 != null) {
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21518v8, this.A0);
            O4(drawable5, w03, iArr[4], PorterDuff.Mode.MULTIPLY);
            iArr[4] = w03;
        }
        Drawable drawable6 = this.G6;
        if (drawable6 != null) {
            int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.A0);
            O4(drawable6, w04, iArr[5], PorterDuff.Mode.SRC_IN);
            iArr[5] = w04;
        }
        rz0 rz0Var = this.O;
        if (rz0Var != null && (ns0Var = rz0Var.V) != null) {
            try {
                gh.c cVar2 = ns0Var.R;
                if (cVar2 != null) {
                    cVar2.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21183d6, ns0Var.f50927f));
                    ns0Var.invalidate();
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        org.telegram.ui.Components.xq xqVar = this.H6;
        if (xqVar != null) {
            xqVar.setOverrideColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, this.A0));
            if (this.f33882a != null) {
                for (int i11 = 0; i11 < this.f33882a.getChildCount(); i11++) {
                    View childAt = this.f33882a.getChildAt(i11);
                    if (childAt != null) {
                        childAt.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final boolean r() {
        return this.O5;
    }

    public final void r4() {
        TLRPC.UserFull userFull = this.f34040w2;
        if (userFull != null && UserObject.areGiftsDisabled(userFull)) {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                org.telegram.ui.Components.xc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(a())))).j();
                return;
            }
            return;
        }
        if (this.F2 != null) {
            org.telegram.ui.Components.s40.h.a();
        }
        showDialog(new yh.o1(getParentActivity(), this.currentAccount, a(), null, null));
    }

    public final void r5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.r5():void");
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.e50 e50Var = this.f34001r0;
        if (e50Var != null) {
            e50Var.f25855f = bundle.getString("path");
        }
    }

    public final void s4(boolean z10) {
        boolean[] zArr = {true};
        getMessagesController().addUserToChat(this.F2.f20343id, getUserConfig().getCurrentUser(), 0, null, this, true, new v90(this, z10, zArr, 7), new da.b(this, zArr, z10, this.parentLayout.getLastFragment(), 6));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
    }

    public final void s5(boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        boolean z13;
        float f7;
        TLRPC.ChatFull chatFull;
        float f10 = 0.2f;
        int i12 = (A3() > 0.2f ? 1 : (A3() == 0.2f ? 0 : -1));
        int i13 = 0;
        if (i12 > 0 && !this.X1 && (this.f34001r0 == null || this.P2 == -1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.J5 = z11;
        E3();
        org.telegram.ui.Components.bk0 bk0Var = this.v;
        if (bk0Var != null && bk0Var.getVisibility() != 8) {
            org.telegram.ui.Components.bk0 bk0Var2 = this.v;
            if (this.actionBar.getOccupyStatusBar()) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            bk0Var2.setTranslationY((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11) + this.R1) + this.U1) - AndroidUtilities.dp(29.5f));
            if (i12 > 0 && !this.X1 && !this.f34017t1 && (this.f34001r0 == null || this.P2 == -1)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 && this.f33928g1 != 0) {
                if (ChatObject.isChannel(this.F2) && !this.F2.megagroup && (chatFull = this.f34032v2) != null && chatFull.linked_chat_id != 0 && (this.E3 != -1 || this.F3 != -1)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            if (!this.H1) {
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
                    AnimatorSet animatorSet = this.f34037w;
                    if (animatorSet != null) {
                        this.f34037w = null;
                        animatorSet.cancel();
                    }
                    float f11 = 0.0f;
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f34037w = animatorSet2;
                        if (z12) {
                            animatorSet2.setInterpolator(new DecelerateInterpolator());
                            this.f34037w.playTogether(ObjectAnimator.ofFloat(this.v, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.v, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.v, View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.f34037w.playTogether(ObjectAnimator.ofFloat(this.v, View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.v, View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.v, View.ALPHA, 0.0f));
                        }
                        this.f34037w.setDuration(150L);
                        this.f34037w.addListener(new iz0(this, 1));
                        this.f34037w.start();
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
        yy0 yy0Var = this.f34030v0;
        if (yy0Var != null) {
            float measuredWidth = this.Z.getMeasuredWidth() - AndroidUtilities.dp(40.0f);
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            yy0Var.f34180i0 = measuredWidth;
            yy0Var.f34182k0 = z12;
            yy0Var.f34181j0 = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i10;
            yy0Var.invalidate();
        }
        ai.j1 j1Var = this.f34038w0;
        if (j1Var != null) {
            if (this.actionBar.getOccupyStatusBar()) {
                i13 = AndroidUtilities.statusBarHeight;
            }
            j1Var.setExpandCoords(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i13 + this.R1 + this.U1);
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.e50 e50Var = this.f34001r0;
        if (e50Var != null && (str = e50Var.f25855f) != null) {
            bundle.putString("path", str);
        }
    }

    public void setAvatarAnimationProgress(float f7) {
        int w02;
        int w03;
        int w04;
        int i10;
        int x32;
        int x33;
        this.f33963l2 = f7;
        this.T1 = f7;
        D3();
        if (this.K1 == 2) {
            this.f33920f0.setProgressToExpand(f7);
            org.telegram.ui.Components.ci0 ci0Var = this.f33883a0;
            if (ci0Var != null) {
                ci0Var.setParentExpanded(f7);
            }
            org.telegram.ui.Components.vi0 vi0Var = this.f33898c0;
            if (vi0Var != null) {
                vi0Var.setParentExpanded(f7);
            }
            org.telegram.ui.Components.hx0 hx0Var = this.T;
            if (hx0Var != null) {
                hx0Var.setParentExpanded(f7);
            }
            W4();
            j5();
        }
        this.f33882a.setAlpha(f7);
        this.f33882a.setTranslationX(AndroidUtilities.dp(48.0f) - (AndroidUtilities.dp(48.0f) * f7));
        if (this.K1 != 2 || (w02 = this.f34009s0) == 0) {
            if (this.f33921f1 == 0 && ChatObject.isChannel(this.f33928g1, this.currentAccount)) {
                boolean z10 = this.F2.megagroup;
            }
            org.telegram.ui.ActionBar.g6 g6Var = this.A0;
            int[][] iArr = org.telegram.ui.Components.h9.L;
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21125a7, g6Var);
        }
        int i11 = this.Z4;
        if (i11 == 0) {
            i11 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21462s8, this.A0);
        }
        this.f33913e1.setBackgroundColor(i0.a.f(f7, i0.a.o(i11, 0), w02));
        org.telegram.ui.Components.w21 w21Var = this.m0;
        int f10 = i0.a.f(f7, i11, w02);
        w21Var.f32121k = true;
        w21Var.f32115b.setColor(f10);
        int i12 = -1;
        if (this.S5 != null) {
            w03 = -1;
        } else {
            if (this.f33921f1 == 0 && ChatObject.isChannel(this.f33928g1, this.currentAccount)) {
                boolean z11 = this.F2.megagroup;
            }
            org.telegram.ui.ActionBar.g6 g6Var2 = this.A0;
            int[][] iArr2 = org.telegram.ui.Components.h9.L;
            w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21238g8, g6Var2);
        }
        this.actionBar.B(i0.a.f(this.T1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21518v8, this.A0), w03), false);
        if (this.S5 == null) {
            i12 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21527vh, this.A0);
        }
        int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, this.A0);
        for (int i13 = 0; i13 < 2; i13++) {
            org.telegram.ui.ActionBar.n5 n5Var = this.f33919f[i13];
            if (n5Var != null && (i13 != 1 || this.K1 != 2)) {
                n5Var.setTextColor(i0.a.f(f7, w05, i12));
            }
        }
        boolean[] zArr = this.K0;
        if (zArr[0]) {
            w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bh, this.A0);
        } else {
            if (this.f33921f1 == 0 && ChatObject.isChannel(this.f33928g1, this.currentAccount)) {
                boolean z12 = this.F2.megagroup;
            }
            org.telegram.ui.ActionBar.g6 g6Var3 = this.A0;
            int[][] iArr3 = org.telegram.ui.Components.h9.L;
            w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21257h8, g6Var3);
        }
        if (zArr[0]) {
            i10 = org.telegram.ui.ActionBar.k6.f21406pa;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.B8;
        }
        int w06 = org.telegram.ui.ActionBar.k6.w0(i10, this.A0);
        for (int i14 = 0; i14 < 3; i14++) {
            org.telegram.ui.ActionBar.n5 n5Var2 = this.f34000r[i14];
            if (n5Var2 != null && i14 != 1 && (i14 != 2 || this.K1 != 2)) {
                if (i14 == 0) {
                    x32 = w06;
                } else {
                    x32 = x3(w06, Boolean.valueOf(zArr[0]));
                }
                if (i14 == 0) {
                    x33 = w04;
                } else {
                    x33 = x3(w04, Boolean.valueOf(zArr[0]));
                }
                n5Var2.setTextColor(i0.a.f(f7, x32, x33));
            }
        }
        this.R1 = this.S1 * f7;
        long j10 = this.f33921f1;
        if (j10 == 0) {
            j10 = this.f33928g1;
        }
        org.telegram.ui.ActionBar.g6 g6Var4 = this.A0;
        int[][] iArr4 = org.telegram.ui.Components.h9.L;
        int w07 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21405p8[org.telegram.ui.Components.h9.e(j10)], g6Var4);
        long j11 = this.f33921f1;
        if (j11 == 0) {
            j11 = this.f33928g1;
        }
        int d = org.telegram.ui.Components.h9.d(j11);
        if (w07 != d) {
            this.f33994q0.h(i0.a.f(f7, d, w07));
            this.f33920f0.invalidate();
        }
        int i15 = this.f33887a5;
        if (i15 != 0) {
            setNavigationBarColor(i0.a.f(f7, i15, getNavigationBarColor()));
        }
        this.f33913e1.invalidate();
        m4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        a01 a01Var = this.P5;
        if (a01Var != null) {
            a01Var.invalidate();
        }
        if (a() > 0) {
            vy0 vy0Var = this.f33920f0;
            if (vy0Var != null) {
                vy0Var.setProgressToStoriesInsets(this.T1);
            }
            yy0 yy0Var = this.f34030v0;
            if (yy0Var != null) {
                yy0Var.setProgressToStoriesInsets(this.T1);
            }
            ai.j1 j1Var = this.f34038w0;
            if (j1Var != null) {
                j1Var.setProgressToStoriesInsets(this.T1);
            }
        }
    }

    @Override
    public final void setParentLayout(org.telegram.ui.ActionBar.h5 h5Var) {
        super.setParentLayout(h5Var);
        FlagSecureReason flagSecureReason = this.Y1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
            this.Y1 = null;
        }
        if (h5Var != null && h5Var.getParentActivity() != null) {
            this.Y1 = new FlagSecureReason(h5Var.getParentActivity().getWindow(), new qx0(this, 7));
        }
    }

    @Override
    public final void t() {
        this.f33882a.x0(0);
    }

    public final void t4(View view, float f7, float f10, boolean z10) {
        float f11;
        float f12;
        long j10;
        long j11 = this.f33949j1;
        if (j11 == 0) {
            j11 = this.f33921f1;
            if (j11 == 0) {
                j11 = -this.f33928g1;
            }
        }
        long j12 = j11;
        boolean isDialogMuted = getMessagesController().isDialogMuted(j12, this.f33935h1);
        if (z10 && (this.f34002r1 || isDialogMuted)) {
            boolean z11 = !isDialogMuted;
            getNotificationsController().muteDialog(j12, this.f33935h1, z11);
            org.telegram.ui.Components.xc.A(this, z11, null).j();
            e5();
            this.f33883a0.setNotifications(isDialogMuted);
        } else if ((!z10 && LocaleController.isRTL && f7 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f7 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
            org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
            boolean z12 = i5Var.e.h;
            boolean z13 = !z12;
            boolean isGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(j12, false, false);
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j12, this.f33935h1);
            if (!z12) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
                if (isGlobalNotificationsEnabled) {
                    edit.remove("notify2_" + sharedPrefKey);
                } else {
                    edit.putInt("notify2_" + sharedPrefKey, 0);
                }
                if (this.f33935h1 == 0) {
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
                if (this.f33935h1 == 0) {
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
            e5();
            getNotificationsController().updateServerNotificationsSettings(j12, this.f33935h1);
            i5Var.setChecked(z13);
            org.telegram.ui.Components.wl0 wl0Var = (org.telegram.ui.Components.wl0) this.f33882a.L(this.O3, false);
            k5(true);
        } else {
            org.telegram.ui.Components.zo zoVar = new org.telegram.ui.Components.zo(getParentActivity(), this.currentAccount, null, true, new ad.d(this, j12, 6), this.A0);
            zoVar.e(j12, this.f33935h1, this.f33953j5);
            if (AndroidUtilities.isTablet()) {
                ViewGroup view2 = this.parentLayout.getView();
                f11 = view2.getX() + view2.getPaddingLeft() + f7;
                f12 = view2.getY() + view2.getPaddingTop() + f10;
            } else {
                f11 = f7;
                f12 = f10;
            }
            if (z10) {
                f12 += this.f33883a0.getHeight() - AndroidUtilities.dp(12.0f);
            }
            zoVar.d(this, view, f11, f12, z10);
        }
    }

    public final void t5() {
        org.telegram.ui.Components.ns0 ns0Var;
        org.telegram.ui.Components.nt0 nt0Var;
        org.telegram.ui.Components.y90 y90Var;
        int w02;
        int w03;
        int w04;
        int color3;
        int w05;
        int w06;
        int w07;
        this.T5.clear();
        t01 t01Var = this.f33913e1;
        if (t01Var != null) {
            t01Var.a(this.S5, true);
        }
        org.telegram.ui.ActionBar.n5[] n5VarArr = this.f34000r;
        org.telegram.ui.ActionBar.n5 n5Var = n5VarArr[1];
        if (n5Var != null) {
            if (n5Var.getTag() instanceof Integer) {
                w07 = org.telegram.ui.ActionBar.k6.w0(((Integer) n5VarArr[1].getTag()).intValue(), this.A0);
            } else {
                w07 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, this.A0);
            }
            n5VarArr[1].setTextColor(i0.a.f(this.f33963l2, x3(w07, Boolean.valueOf(this.K0[0])), -1275068417));
        }
        r01 r01Var = this.f33940h6;
        float f7 = -0.1f;
        if (r01Var != null) {
            r01Var.a(i0.a.f(this.f33963l2, org.telegram.ui.ActionBar.k6.o1(0.5f, org.telegram.ui.ActionBar.k6.b(0.18f, -0.1f, this.f33906d1)), 603979775));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = -1;
        if (kVar != null) {
            if (this.S5 != null) {
                w05 = -1;
            } else {
                w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21518v8, this.A0);
            }
            kVar.B(i0.a.f(this.G5, w05, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21573y8, this.A0)), false);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            MessagesController.PeerColor peerColor = this.S5;
            if (peerColor != null) {
                w06 = 1090519039;
            } else if (peerColor != null) {
                w06 = 553648127;
            } else {
                w06 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21220f8, this.A0);
            }
            kVar2.A(i0.a.f(this.G5, w06, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21590z8, this.A0)), false);
        }
        Drawable[] drawableArr = this.f34053y;
        if (drawableArr[1] != null) {
            MessagesController.PeerColor peerColor2 = this.S5;
            if (peerColor2 != null) {
                int color2 = peerColor2.getColor2();
                if (this.S5.hasColor6(org.telegram.ui.ActionBar.k6.I.q())) {
                    color3 = this.S5.getColor5();
                } else {
                    color3 = this.S5.getColor3();
                }
                int f10 = i0.a.f(0.4f, color2, color3);
                if (!org.telegram.ui.ActionBar.k6.I.q()) {
                    f7 = -0.08f;
                }
                w04 = org.telegram.ui.ActionBar.k6.b(0.1f, f7, f10);
            } else {
                w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21598zh, this.A0);
            }
            drawableArr[1].setColorFilter(AndroidUtilities.getOffsetColor(w04, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oi, this.A0), this.G5, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        Drawable[] drawableArr2 = this.I;
        if (drawableArr2[1] != null) {
            if (this.S5 != null) {
                w03 = -1;
            } else {
                w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ah, this.A0);
            }
            drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(w03, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21183d6, this.A0), this.G5, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.ActionBar.n5 n5Var2 = this.f33919f[1];
        if (n5Var2 != null) {
            if (this.S5 != null) {
                w02 = -1;
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21527vh, this.A0);
            }
            n5Var2.setTextColor(i0.a.f(this.f33963l2, i0.a.f(this.G5, w02, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oi, this.A0)), -1));
        }
        org.telegram.ui.Components.p8 p8Var = this.f33891b1;
        if (p8Var != null && (y90Var = p8Var.e) != null) {
            y90Var.invalidate();
        }
        Drawable drawable = this.f34045x;
        if (drawable != null) {
            if (this.S5 == null) {
                i10 = i0.a.f(this.T1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21408pc, this.A0), -1);
            }
            drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.vi0 vi0Var = this.f33898c0;
        if (vi0Var != null) {
            vi0Var.setColor(this.S5);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f33882a, (Utilities.Callback<View>) new zx0(this, 3));
        rz0 rz0Var = this.O;
        if (rz0Var != null && (nt0Var = rz0Var.I0) != null) {
            nt0Var.updateColors();
        }
        rz0 rz0Var2 = this.O;
        if (rz0Var2 != null && (ns0Var = rz0Var2.V) != null) {
            ns0Var.m();
        }
        u5();
        b5();
        yy0 yy0Var = this.f34030v0;
        if (yy0Var != null) {
            yy0Var.f(true, true);
        }
        ai.j1 j1Var = this.f34038w0;
        if (j1Var != null) {
            j1Var.a();
        }
    }

    public final void u4() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.f33921f1 != 0) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f33921f1));
                if (user != null) {
                    if (this.G2 != null && (userFull = this.f34040w2) != null && !TextUtils.isEmpty(userFull.about)) {
                        str = String.format("%s https://" + getMessagesController().linkPrefix + "/%s", this.f34040w2.about, UserObject.getPublicUsername(user));
                    } else {
                        str = String.format("https://" + getMessagesController().linkPrefix + "/%s", UserObject.getPublicUsername(user));
                    }
                } else {
                    return;
                }
            } else if (this.f33928g1 != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f33928g1));
                if (chat != null) {
                    TLRPC.ChatFull chatFull = this.f34032v2;
                    if (chatFull != null && !TextUtils.isEmpty(chatFull.about)) {
                        str = String.format("%s\nhttps://" + getMessagesController().linkPrefix + "/%s", this.f34032v2.about, ChatObject.getPublicUsername(chat));
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

    public final void u5() {
        if (this.v != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21564xh, this.A0);
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21580yh, this.A0);
                int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21545wh, this.A0);
                if (this.S5 != null && org.telegram.ui.ActionBar.k6.d1(w02)) {
                    w02 = org.telegram.ui.ActionBar.k6.b(0.05f, -0.04f, this.S5.getBgColor1(false));
                    MessagesController.PeerColor peerColor = this.S5;
                    if (peerColor != null) {
                        int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.k6.I.q());
                        w03 = org.telegram.ui.ActionBar.k6.C(org.telegram.ui.ActionBar.k6.I.q(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21516v6, this.A0), bgColor2, w03, bgColor2);
                    }
                    w04 = -1;
                }
                org.telegram.ui.Components.bk0 bk0Var = this.f33888a6;
                org.telegram.ui.Components.bk0 bk0Var2 = this.v;
                int[] iArr = this.f33896b6;
                if (bk0Var != bk0Var2 || iArr[0] != w02 || iArr[1] != w03 || iArr[2] != w04) {
                    this.f33888a6 = bk0Var2;
                    iArr[0] = w02;
                    iArr[1] = w03;
                    iArr[2] = w04;
                    Drawable mutate = this.fragmentView.getContext().getResources().getDrawable(R.drawable.floating_shadow_profile).mutate();
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
                    org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(mutate, org.telegram.ui.ActionBar.k6.i0(AndroidUtilities.dp(56.0f), w02, w03), 0, 0);
                    int dp = AndroidUtilities.dp(56.0f);
                    int dp2 = AndroidUtilities.dp(56.0f);
                    yqVar.e = dp;
                    yqVar.f33015f = dp2;
                    this.v.setBackground(yqVar);
                    this.v.setColorFilter(new PorterDuffColorFilter(w04, mode));
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean v() {
        return false;
    }

    public final void v4(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.M3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f33928g1);
            bundle.putLong("user_id", this.f33921f1);
            presentFragment(new zh.n0(bundle));
        } else if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.V2) {
            if (this.f33921f1 == getUserConfig().getClientUserId()) {
                presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
            } else if (UserObject.areGiftsDisabled(this.f34040w2)) {
                org.telegram.ui.Components.xc.a0(this).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.f33921f1)))).j();
            } else {
                showDialog(new yh.o1(getParentActivity(), this.currentAccount, this.f33921f1, null, null));
            }
        }
    }

    @Override
    public final boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ye1 ye1Var) {
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle h = a1.g.h("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j10)) {
            h.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
        } else if (DialogObject.isUserDialog(j10)) {
            h.putLong("user_id", j10);
        } else if (DialogObject.isChatDialog(j10)) {
            h.putLong("chat_id", -j10);
        }
        if (!getMessagesController().checkCanOpenChat(h, eyVar)) {
            return false;
        }
        NotificationCenter notificationCenter = getNotificationCenter();
        int i12 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(this, i12);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
        presentFragment(new sn(h), true);
        removeSelfFromStack();
        getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(getMessagesController().getUser(Long.valueOf(this.f33921f1)), j10, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z11, i10, i11));
        if (!TextUtils.isEmpty(charSequence)) {
            SendMessagesHelper.prepareSendingText(AccountInstance.getInstance(this.currentAccount), charSequence, j10, z11, i10, i11, 0L);
        }
        return true;
    }

    public final CharSequence w3(CharSequence charSequence) {
        if (!ChatObject.isHiddenInCommunity(this.currentAccount, this.f33949j1)) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.xq(R.drawable.mini_ephemeral_hidden_16, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityHiddenStatus));
        spannableStringBuilder.append((CharSequence) " * ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.lt(), length - 2, length - 1, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final void w4() {
        boolean z10;
        org.telegram.ui.Components.yj0 yj0Var;
        if (this.f33921f1 != 0) {
            if (this.f34001r0 != null) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
                if (user == null) {
                    user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
                }
                if (user != null) {
                    org.telegram.ui.Components.e50 e50Var = this.f34001r0;
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e50Var.n(z10, new ib0(this, 24), new v5(this, 13), 0);
                    this.V.M(0);
                    this.V.P(43);
                    this.W.M(0);
                    this.W.P(43);
                    org.telegram.ui.Components.ci0 ci0Var = this.f33883a0;
                    if (ci0Var != null) {
                        org.telegram.ui.Components.zh0 j10 = org.telegram.ui.Components.ci0.j(14, ci0Var.f25337a);
                        if (j10 != null && (yj0Var = j10.f33232k) != null) {
                            yj0Var.start();
                        }
                    } else {
                        this.v.d();
                    }
                    org.telegram.ui.Cells.r8 r8Var = this.N2;
                    if (r8Var != null) {
                        r8Var.getImageView().d();
                        return;
                    }
                    return;
                }
                return;
            }
            z4();
            return;
        }
        A4();
    }

    public final int x3(int i10, Boolean bool) {
        int i11;
        if (this.S5 != null) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21462s8, this.A0);
            int f7 = i0.a.f(0.5f, this.S5.getStoryColor1(org.telegram.ui.ActionBar.k6.I.q()), this.S5.getStoryColor2(org.telegram.ui.ActionBar.k6.I.q()));
            if (!org.telegram.ui.ActionBar.k6.d1(w02)) {
                if (bool != null && !bool.booleanValue()) {
                    return org.telegram.ui.ActionBar.k6.b(-0.2f, 0.2f, org.telegram.ui.ActionBar.k6.o1(0.7f, f7));
                }
                return f7;
            }
            boolean q6 = org.telegram.ui.ActionBar.k6.I.q();
            if (bool != null && !bool.booleanValue()) {
                i11 = org.telegram.ui.ActionBar.k6.o1(0.7f, f7);
            } else {
                i11 = f7;
            }
            return org.telegram.ui.ActionBar.k6.C(q6, w02, f7, i10, i11);
        }
        return i10;
    }

    public final void x4() {
        Bundle h = a1.g.h("addToGroup", true);
        h.putLong("chatId", this.F2.f20343id);
        p60 p60Var = new p60(h);
        TLRPC.ChatFull chatFull = this.f34032v2;
        p60Var.I = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            a0.h hVar = new a0.h();
            for (int i10 = 0; i10 < this.f34032v2.participants.participants.size(); i10++) {
                hVar.k(null, this.f34032v2.participants.participants.get(i10).user_id);
            }
            p60Var.J = hVar;
        }
        p60Var.f40384x = new qx0(this, 10);
        presentFragment(p60Var);
    }

    public final void y3() {
        int f7;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            org.telegram.ui.ActionBar.n5[] n5VarArr = this.f33919f;
            if (n5VarArr[1] != null && this.f33913e1 != null && this.U0 != null && this.R0 != null && this.S0 != null && this.T0 != null && this.f33988p0 != null) {
                Float valueOf = Float.valueOf(this.G5);
                hz0 hz0Var = this.I5;
                hz0Var.getClass();
                hz0Var.a(kVar, valueOf);
                if (this.G5 <= 0.0f && this.f33963l2 > 0.0f) {
                    org.telegram.ui.ActionBar.n5 n5Var = n5VarArr[1];
                    int i10 = -1;
                    if (this.S5 != null) {
                        f7 = -1;
                    } else {
                        f7 = i0.a.f(this.f33963l2, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21527vh, this.A0), -1);
                    }
                    n5Var.setTextColor(f7);
                    org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                    if (this.S5 == null) {
                        i10 = i0.a.f(this.f33963l2, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21518v8, this.A0), -1);
                    }
                    kVar2.B(i10, false);
                }
            }
        }
    }

    public final void y4(boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.y4(boolean):void");
    }

    @Override
    public final gh.d z() {
        return this.f34022t6;
    }

    public final void z3() {
        int i10;
        int i11;
        if (this.L5 != null) {
            ValueAnimator valueAnimator = this.f33957k2;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f33957k2.cancel();
            }
            float clamp01 = Utilities.clamp01(this.R1 / this.G1);
            if (clamp01 > 0.0f) {
                float f7 = (clamp01 - 0.5f) / 0.5f;
                int i12 = 0;
                if (this.actionBar.getOccupyStatusBar()) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                float translationY = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i10) - AndroidUtilities.dp(21.0f));
                this.f33900c2 = AndroidUtilities.lerp(0.42f, this.L5[0], clamp01);
                this.a2 = AndroidUtilities.lerp(this.Q5, this.L5[1], clamp01);
                this.f33892b2 = AndroidUtilities.lerp(translationY, this.L5[2], clamp01);
                this.f33907d2 = AndroidUtilities.lerp(this.L5[11], 0.0f, clamp01);
                this.Y.setScaleX(this.f33900c2);
                this.Y.setScaleY(this.f33900c2);
                this.Y.setTranslationX(this.a2);
                this.Y.setTranslationY(this.f33892b2);
                org.telegram.ui.Components.hx0 hx0Var = this.T;
                if (hx0Var != null) {
                    hx0Var.setAlpha(clamp01);
                }
                this.f33920f0.setAlpha(1.0f);
                this.Y.setAlpha(1.0f);
                yy0 yy0Var = this.f34030v0;
                if (yy0Var != null) {
                    yy0Var.invalidate();
                }
                ai.j1 j1Var = this.f34038w0;
                if (j1Var != null) {
                    j1Var.e = AndroidUtilities.lerp(0.0f, this.L5[4], f7);
                    this.f34038w0.f1527f = AndroidUtilities.lerp(0.0f, this.L5[5], clamp01);
                    ai.j1 j1Var2 = this.f34038w0;
                    j1Var2.h = true;
                    j1Var2.invalidate();
                }
                r01 r01Var = this.f33940h6;
                if (r01Var != null) {
                    r01Var.setAlpha((int) AndroidUtilities.lerp(0.0f, this.L5[6], clamp01));
                }
                float dp = (((this.f33900c2 * 100.0f) / 42.0f) * AndroidUtilities.dp(42.0f)) - AndroidUtilities.dp(42.0f);
                this.f33941i0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(16.0f) + dp);
                this.f33941i0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(-10.0f) + dp);
                this.f33948j0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + dp);
                this.f33948j0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(26.5f) + dp);
                this.f33955k0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + dp);
                this.f33955k0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(24.0f) + dp);
                this.f33962l0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + dp);
                this.f33962l0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(24.0f) + dp);
                float lerp = AndroidUtilities.lerp(1.0f, this.L5[7], clamp01);
                if (this.actionBar.getOccupyStatusBar()) {
                    i11 = AndroidUtilities.statusBarHeight;
                } else {
                    i11 = 0;
                }
                float currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f;
                float floor = ((float) Math.floor(this.actionBar.getTranslationY() + ((currentActionBarHeight + i11) - (AndroidUtilities.density * 21.0f)))) + AndroidUtilities.dp(1.3f);
                float dpf2 = AndroidUtilities.dpf2(22.7f) + floor;
                this.f33922f2 = AndroidUtilities.lerp(floor, this.L5[8], clamp01);
                this.f33936h2 = AndroidUtilities.lerp(dpf2, this.L5[9], clamp01);
                int i13 = 0;
                while (true) {
                    org.telegram.ui.ActionBar.n5[] n5VarArr = this.f33919f;
                    if (i13 >= n5VarArr.length) {
                        break;
                    }
                    if (n5VarArr[i13] != null) {
                        int i14 = i13 * 2;
                        float lerp2 = AndroidUtilities.lerp((this.Q5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f), this.L5[i14 + 12], clamp01);
                        float lerp3 = AndroidUtilities.lerp((this.Q5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f), this.L5[i14 + 13], clamp01);
                        n5VarArr[i13].setTranslationX(lerp2);
                        n5VarArr[i13].setTranslationY(this.f33922f2);
                        org.telegram.ui.ActionBar.n5[] n5VarArr2 = this.f34000r;
                        n5VarArr2[i13].setTranslationX(this.f33999q5 + lerp3);
                        n5VarArr2[i13].setTranslationY(this.f33936h2);
                        if (i13 == 1) {
                            this.f33914e2 = lerp2;
                            this.f33929g2 = lerp3;
                            this.f34008s.setTranslationX(lerp3);
                            this.f34008s.setTranslationY(this.f33936h2);
                        }
                        n5VarArr[i13].setScaleX(lerp);
                        n5VarArr[i13].setScaleY(lerp);
                    }
                    i13++;
                }
                Z4();
                if (this.actionBar.getOccupyStatusBar()) {
                    i12 = AndroidUtilities.statusBarHeight;
                }
                f5(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12);
                n4((int) this.L5[10], clamp01, true);
                org.telegram.ui.Components.ci0 ci0Var = this.f33883a0;
                if (ci0Var != null) {
                    ci0Var.setAlpha(AndroidUtilities.lerp(0.0f, this.L5[3], f7));
                }
            }
        }
    }

    public final void z4() {
        TLRPC.User user;
        if (this.f33921f1 != 0 && !O3() && (user = getMessagesController().getUser(Long.valueOf(this.f33921f1))) != null && !(user instanceof TLRPC.TL_userEmpty)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.f33921f1);
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
                sn snVar = new sn(bundle);
                snVar.N9 = getMediaDataController().getGreetingsSticker();
                snVar.O9 = false;
                presentFragment(snVar, z10);
                if (AndroidUtilities.isTablet() && !this.J0) {
                    finishFragment();
                }
            }
        }
    }

    public ProfileActivity(Bundle bundle, org.telegram.ui.Components.pv0 pv0Var) {
        super(bundle);
        this.f33919f = new org.telegram.ui.ActionBar.n5[2];
        this.h = null;
        this.f33973n = null;
        this.f34000r = new org.telegram.ui.ActionBar.n5[4];
        this.f34053y = new Drawable[2];
        this.E = new Drawable[2];
        this.G = new org.telegram.ui.Components.p5[2];
        this.H = new org.telegram.ui.Components.p5[2];
        this.I = new Drawable[2];
        this.J = new org.telegram.ui.Components.as[2];
        this.K = new org.telegram.ui.Components.as[2];
        this.f34046x0 = null;
        this.f34054y0 = new org.telegram.ui.Components.p50(this, 2);
        this.f34060z0 = new Paint(1);
        this.K0 = new boolean[1];
        this.f33899c1 = 1.0f;
        this.D1 = new a0.h();
        this.N1 = true;
        this.O1 = false;
        this.P1 = false;
        this.Q1 = false;
        this.Z1 = new HashMap();
        this.f33976n2 = new float[]{0.0f, 1.0f};
        this.f34003r2 = new Paint();
        this.C2 = -1;
        this.M2 = new Rect();
        this.S4 = new ArrayList();
        this.T4 = new ArrayList();
        this.U4 = 0;
        this.V4 = true;
        this.W4 = true;
        this.Z4 = 0;
        this.f33887a5 = 0;
        this.f33895b5 = 0;
        this.f33903c5 = 0L;
        this.f33953j5 = new HashSet();
        this.f33965l5 = new org.telegram.ui.Cells.c2(this);
        this.f33971m5 = new gz0(this);
        this.C5 = new ne.b(0, new qx0(this, 8), org.telegram.ui.Components.bs.h, 380L, true);
        this.I5 = new hz0(this);
        this.K5 = new iz0(this, 0);
        this.L5 = null;
        this.T5 = new SparseIntArray();
        this.V5 = null;
        this.W5 = -1;
        this.f33896b6 = new int[3];
        this.f33904c6 = -1.0f;
        gh.b bVar = new gh.b();
        this.f34044w6 = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.f34052x6 = bVar2;
        ArrayList arrayList = new ArrayList();
        this.A6 = arrayList;
        RectF rectF = new RectF();
        this.B6 = rectF;
        RectF rectF2 = new RectF();
        this.C6 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        this.D6 = new gh.c[2];
        this.I6 = new int[7];
        this.R = pv0Var;
        gh.c cVar = new gh.c();
        this.f34029u6 = cVar;
        cVar.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21183d6, this.A0));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f34015s6 = new bh.f(false);
            gh.d dVar = new gh.d(null);
            this.f34022t6 = dVar;
            bh.b bVar3 = new bh.b(dVar);
            this.f34036v6 = bVar3;
            bVar3.f4367i = LiteMode.isEnabled(262144);
        } else {
            this.f34015s6 = null;
            this.f34022t6 = null;
            this.f34036v6 = new bh.b(cVar);
        }
        bVar2.e = new re.b();
    }

    @Override
    public final void P() {
    }
}
